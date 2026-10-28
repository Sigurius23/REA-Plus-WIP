package io.getstream.chat.android.p226ui.common.utils.extensions;

import ec3.C13045h2;
import io.getstream.chat.android.client.ChatClient;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007\u001a\f\u0010\u0007\u001a\u00020\u0001*\u00020\u0002H\u0007¨\u0006\b"}, m65681d2 = {"isMine", "", "Lio/getstream/chat/android/models/Message;", "chatClient", "Lio/getstream/chat/android/client/ChatClient;", "currentUser", "Lio/getstream/chat/android/models/User;", "shouldShowMessageStatusIndicator", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageKt {
    @InternalStreamChatApi
    public static final boolean isMine(Message message, ChatClient chatClient) {
        AbstractC22676k.m65750j(message, "<this>");
        AbstractC22676k.m65750j(chatClient, "chatClient");
        User user = (User) ((C13045h2) chatClient.getClientState().getUser()).getValue();
        return AbstractC22676k.m65745e(user != null ? user.getId() : null, message.getUser().getId());
    }

    @InternalStreamChatApi
    public static final boolean shouldShowMessageStatusIndicator(Message message) {
        AbstractC22676k.m65750j(message, "<this>");
        return (MessageUtils.isEphemeral(message) || MessageUtils.isDeleted(message) || message.getSyncStatus() == SyncStatus.FAILED_PERMANENTLY) ? false : true;
    }

    @InternalStreamChatApi
    public static final boolean isMine(Message message, User user) {
        AbstractC22676k.m65750j(message, "<this>");
        return AbstractC22676k.m65745e(user != null ? user.getId() : null, message.getUser().getId());
    }
}
