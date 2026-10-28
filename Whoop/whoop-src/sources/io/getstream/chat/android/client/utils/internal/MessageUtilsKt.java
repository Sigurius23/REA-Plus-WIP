package io.getstream.chat.android.client.utils.internal;

import io.getstream.chat.android.client.extensions.internal.MessageKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.MessageType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007¨\u0006\u0004"}, m65681d2 = {"getMessageType", "", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageUtilsKt {
    @InternalStreamChatApi
    public static final String getMessageType(Message message) {
        AbstractC22676k.m65750j(message, "message");
        boolean zIsEmpty = message.getAttachments().isEmpty();
        boolean zHasPendingAttachments = MessageKt.hasPendingAttachments(message);
        if (zIsEmpty || !zHasPendingAttachments) {
            return AbstractC22676k.m65745e(message.getType(), MessageType.SYSTEM) ? MessageType.SYSTEM : "regular";
        }
        return "ephemeral";
    }
}
