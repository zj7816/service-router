package com.dianping.event.mq;

import com.dianping.avatar.log.AvatarLogger;
import com.dianping.avatar.log.AvatarLoggerFactory;
import com.dianping.event.DailyReportHandler.Handler;
import com.dianping.swallow.common.message.Message;
import com.dianping.swallow.consumer.BackoutMessageException;
import com.dianping.swallow.consumer.MessageListener;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * push消息消费者
 * Created by luzhe on 16/1/25.
 */
@Service
public class DailyReportExecutive implements MessageListener {

    private static final AvatarLogger LOGGER = AvatarLoggerFactory.getLogger(DailyReportExecutive.class);

    private static final String ShopDailyReportReady = "ShopDailyReportReady";

    private static final String AccountDailyReportListed = "AccountDailyReportListed";

    @Resource
    private Handler handler;

    @Override
    public void onMessage(Message message) throws BackoutMessageException {
        if (message.getType().equals(ShopDailyReportReady)) {
            /**
             * 转换shop参数为shopaccountid参数，重新发送事件
             */
            handler.handle(message, 0);
        } else if (message.getType().equals(AccountDailyReportListed)) {
            /**
             * 发出聚合完成事件，推送给用户
             */
            handler.handle(message, 1);
        }
    }

}
