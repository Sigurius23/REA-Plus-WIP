package io.getstream.chat.android.p226ui.common.state.messages;

import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, m65681d2 = {"updateMessage", "Lio/getstream/chat/android/ui/common/state/messages/MessageAction;", "message", "Lio/getstream/chat/android/models/Message;", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageActionKt {
    public static final MessageAction updateMessage(MessageAction messageAction, Message message) {
        AbstractC22676k.m65750j(messageAction, "<this>");
        AbstractC22676k.m65750j(message, "message");
        if (messageAction instanceof React) {
            return React.copy$default((React) messageAction, null, message, false, 5, null);
        }
        if (messageAction instanceof Resend) {
            return ((Resend) messageAction).copy(message);
        }
        if (messageAction instanceof Reply) {
            return ((Reply) messageAction).copy(message);
        }
        if (messageAction instanceof ThreadReply) {
            return ((ThreadReply) messageAction).copy(message);
        }
        if (messageAction instanceof Copy) {
            return ((Copy) messageAction).copy(message);
        }
        if (messageAction instanceof MarkAsUnread) {
            return ((MarkAsUnread) messageAction).copy(message);
        }
        if (messageAction instanceof Edit) {
            return ((Edit) messageAction).copy(message);
        }
        if (messageAction instanceof Pin) {
            return ((Pin) messageAction).copy(message);
        }
        if (messageAction instanceof Delete) {
            return ((Delete) messageAction).copy(message);
        }
        if (messageAction instanceof Flag) {
            return ((Flag) messageAction).copy(message);
        }
        if (messageAction instanceof CustomAction) {
            return CustomAction.copy$default((CustomAction) messageAction, message, null, 2, null);
        }
        if (messageAction instanceof MuteUser) {
            return ((MuteUser) messageAction).copy(message);
        }
        if (messageAction instanceof UnmuteUser) {
            return ((UnmuteUser) messageAction).copy(message);
        }
        if (messageAction instanceof BlockUser) {
            return ((BlockUser) messageAction).copy(message);
        }
        if (messageAction instanceof UnblockUser) {
            return ((UnblockUser) messageAction).copy(message);
        }
        throw new NoWhenBranchMatchedException();
    }
}
