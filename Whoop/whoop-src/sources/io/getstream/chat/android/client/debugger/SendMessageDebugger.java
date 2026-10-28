package io.getstream.chat.android.client.debugger;

import io.getstream.chat.android.models.Message;
import n23.AbstractC26205h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J%\u0010\u000b\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u0006J%\u0010\u000e\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\fJ%\u0010\u000f\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0010À\u0006\u0001"}, m65681d2 = {"Lio/getstream/chat/android/client/debugger/SendMessageDebugger;", "", "Lio/getstream/chat/android/models/Message;", "message", "Ll83/a0;", "onStart", "(Lio/getstream/chat/android/models/Message;)V", "onInterceptionStart", "onInterceptionUpdate", "Ln23/h;", "result", "onInterceptionStop", "(Ln23/h;Lio/getstream/chat/android/models/Message;)V", "onSendStart", "onSendStop", "onStop", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface SendMessageDebugger {
    default void onInterceptionStart(Message message) {
        AbstractC22676k.m65750j(message, "message");
    }

    default void onInterceptionStop(AbstractC26205h result, Message message) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(message, "message");
    }

    default void onInterceptionUpdate(Message message) {
        AbstractC22676k.m65750j(message, "message");
    }

    default void onSendStart(Message message) {
        AbstractC22676k.m65750j(message, "message");
    }

    default void onSendStop(AbstractC26205h result, Message message) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(message, "message");
    }

    default void onStart(Message message) {
        AbstractC22676k.m65750j(message, "message");
    }

    default void onStop(AbstractC26205h result, Message message) {
        AbstractC22676k.m65750j(result, "result");
        AbstractC22676k.m65750j(message, "message");
    }
}
