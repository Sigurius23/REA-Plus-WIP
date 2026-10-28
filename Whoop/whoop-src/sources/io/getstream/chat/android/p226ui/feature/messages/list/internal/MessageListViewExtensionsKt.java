package io.getstream.chat.android.p226ui.feature.messages.list.internal;

import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.CapabilitiesHelperKt;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListViewStyle;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a*\u0010\b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u0014\u0010\n\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a,\u0010\u000e\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a,\u0010\u000f\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\"\u0010\u0010\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u001e\u0010\u0011\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a,\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000\u001a\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\u0004H\u0000¨\u0006\u0014"}, m65681d2 = {"canReplyToMessage", "", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListViewStyle;", "message", "Lio/getstream/chat/android/models/Message;", "ownCapabilities", "", "", "canThreadReplyToMessage", "isInThread", "canCopyMessage", "canEditMessage", "currentUser", "Lio/getstream/chat/android/models/User;", "canDeleteMessage", "canFlagMessage", "canPinMessage", "canBlockUser", "canMarkAsUnread", "canRetryMessage", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListViewExtensionsKt {
    public static final boolean canBlockUser(MessageListViewStyle messageListViewStyle, User user, Message message) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        return CapabilitiesHelperKt.canBlockUser(messageListViewStyle.getBlockUserEnabled(), user, message);
    }

    public static final boolean canCopyMessage(MessageListViewStyle messageListViewStyle, Message message) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        return CapabilitiesHelperKt.canCopyMessage(messageListViewStyle.getCopyTextEnabled(), message);
    }

    public static final boolean canDeleteMessage(MessageListViewStyle messageListViewStyle, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canDeleteMessage(messageListViewStyle.getDeleteMessageEnabled(), user, message, ownCapabilities);
    }

    public static final boolean canEditMessage(MessageListViewStyle messageListViewStyle, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canEditMessage(messageListViewStyle.getEditMessageEnabled(), user, message, ownCapabilities);
    }

    public static final boolean canFlagMessage(MessageListViewStyle messageListViewStyle, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canFlagMessage(messageListViewStyle.getFlagEnabled(), user, message, ownCapabilities);
    }

    public static final boolean canMarkAsUnread(MessageListViewStyle messageListViewStyle, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canMarkAsUnread(messageListViewStyle.getMarkAsUnreadEnabled(), user, message, ownCapabilities);
    }

    public static final boolean canPinMessage(MessageListViewStyle messageListViewStyle, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canPinMessage(messageListViewStyle.getPinMessageEnabled(), message, ownCapabilities);
    }

    public static final boolean canReplyToMessage(MessageListViewStyle messageListViewStyle, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canReplyToMessage(messageListViewStyle.getReplyEnabled(), message, ownCapabilities);
    }

    public static final boolean canRetryMessage(MessageListViewStyle messageListViewStyle, User user, Message message) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        return CapabilitiesHelperKt.canRetryMessage(messageListViewStyle.getRetryMessageEnabled(), user, message);
    }

    public static final boolean canThreadReplyToMessage(MessageListViewStyle messageListViewStyle, boolean z4, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(messageListViewStyle, "<this>");
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return CapabilitiesHelperKt.canThreadReplyToMessage(messageListViewStyle.getThreadsEnabled(), z4, message, ownCapabilities);
    }
}
