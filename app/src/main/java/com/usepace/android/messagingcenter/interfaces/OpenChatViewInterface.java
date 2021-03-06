package com.usepace.android.messagingcenter.interfaces;

import com.usepace.android.messagingcenter.exceptions.MessageCenterException;

public interface OpenChatViewInterface {

    void onViewWillStart();
    void onError(MessageCenterException messageCenterException);
}
