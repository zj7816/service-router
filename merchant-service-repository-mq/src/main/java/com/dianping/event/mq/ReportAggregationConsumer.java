package com.dianping.event.mq;

import com.dianping.avatar.log.AvatarLogger;
import com.dianping.avatar.log.AvatarLoggerFactory;
import com.dianping.event.DailyReportHandler.Handler;
import com.dianping.event.dao.EventStorage;
import com.dianping.event.entity.DailyReportInfo;
import com.dianping.event.entity.ReportAggregationStateTracker;
import com.dianping.event.servcie.StateCheckService;
import com.dianping.swallow.common.message.Message;
import com.dianping.swallow.consumer.BackoutMessageException;
import com.dianping.swallow.consumer.MessageListener;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by alexwu on 16/2/2.
 */
public class ReportAggregationConsumer implements MessageListener {

    private AvatarLogger logger = AvatarLoggerFactory.getLogger(ReportAggregationConsumer.class);

    private static final String ShopDailyReportListed = "ShopDailyReportListed";

    @Autowired
    private StateCheckService stateCheckService;

    @Autowired
    private EventStorage eventStorage;

    @Autowired
    private Handler handler;


    @Override
    public void onMessage(Message message) throws BackoutMessageException {
        if (message.getType().equals(ShopDailyReportListed)) {
            int shopAccountId = parseId(message);
            ReportAggregationStateTracker tracker = eventStorage.ofId(shopAccountId);
            tracker.append(new DailyReportInfo());

            /**
             * 完成处理流程
             */
            if (tracker.isComplete()) {
                handler.handle(null, 3);
            }

            /**
             * 超时处理流程
             */
            if (tracker.isHasTimeOut()) {
                handler.handle(null, 4);
            }

        }

    }

    private int parseId(Message message) {
        return 0;
    }
}
