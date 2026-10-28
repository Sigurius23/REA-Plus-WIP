package io.getstream.chat.android.client.plugin.listeners;

import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import n23.AbstractC26205h;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@InternalStreamChatApi
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J%\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/plugin/listeners/SendGiphyListener;", "", "", "cid", "Ln23/h;", "Lio/getstream/chat/android/models/Message;", "result", "Ll83/a0;", "onGiphySendResult", "(Ljava/lang/String;Ln23/h;)V", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface SendGiphyListener {
    void onGiphySendResult(String cid, AbstractC26205h result);
}
