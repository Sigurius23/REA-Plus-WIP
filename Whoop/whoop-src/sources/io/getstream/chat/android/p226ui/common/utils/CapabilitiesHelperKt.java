package io.getstream.chat.android.p226ui.common.utils;

import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Channel;
import io.getstream.chat.android.models.ChannelCapabilities;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.models.SyncStatus;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0016\u0010\u0006\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0002H\u0002\u001a\u0012\u0010\n\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\r\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\u000e\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\u000f\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\u0011\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a\u0012\u0010\u0012\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002\u001a$\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a,\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a\u0016\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u0002\u001a.\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a.\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u001f\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a.\u0010\u0010\u001a\u00020\u00012\u0006\u0010 \u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a$\u0010\u0011\u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a(\u0010\"\u001a\u00020\u00012\u0006\u0010#\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010$\u001a\u00020%\u001a \u0010&\u001a\u00020\u00012\u0006\u0010'\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0002\u001a.\u0010\u0012\u001a\u00020\u00012\u0006\u0010(\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u00022\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u001a \u0010)\u001a\u00020\u00012\u0006\u0010*\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0015\u001a\u00020\u0002¨\u0006+"}, m65681d2 = {"isMessageFailed", "", "Lio/getstream/chat/android/models/Message;", "isSynced", "isTextOnly", "hasLinks", "isOwnMessage", "currentUser", "Lio/getstream/chat/android/models/User;", "isGiphyCommand", "canEditOwnMessage", "", "", "canEditAnyMessage", "canDeleteOwnMessage", "canDeleteAnyMessage", "canFlagMessage", "canPinMessage", "canMarkAsUnread", "canReplyToMessage", "replyEnabled", "message", "ownCapabilities", "canThreadReplyToMessage", "threadsEnabled", "isInThread", "canCopyMessage", "copyTextEnabled", "canEditMessage", "editMessageEnabled", "canDeleteMessage", "deleteMessageEnabled", "flagEnabled", "pinMessageEnabled", "canMuteUser", "muteUserEnabled", "channel", "Lio/getstream/chat/android/models/Channel;", "canBlockUser", "blockUserEnabled", "markAsUnreadEnabled", "canRetryMessage", "retryMessageEnabled", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class CapabilitiesHelperKt {
    public static final boolean canBlockUser(boolean z4, User user, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return z4 && !isOwnMessage(message, user);
    }

    public static final boolean canCopyMessage(boolean z4, Message message) {
        AbstractC22676k.m65750j(message, "message");
        if (z4) {
            return isTextOnly(message) || hasLinks(message);
        }
        return false;
    }

    private static final boolean canDeleteAnyMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.DELETE_ANY_MESSAGE);
    }

    public static final boolean canDeleteMessage(boolean z4, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        if (z4) {
            return (isOwnMessage(message, user) && ownCapabilities.contains(ChannelCapabilities.DELETE_OWN_MESSAGE)) || ownCapabilities.contains(ChannelCapabilities.DELETE_ANY_MESSAGE);
        }
        return false;
    }

    private static final boolean canDeleteOwnMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.DELETE_OWN_MESSAGE);
    }

    private static final boolean canEditAnyMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.UPDATE_ANY_MESSAGE);
    }

    public static final boolean canEditMessage(boolean z4, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        if (z4) {
            return (((!isOwnMessage(message, user) || !ownCapabilities.contains(ChannelCapabilities.UPDATE_OWN_MESSAGE)) && !ownCapabilities.contains(ChannelCapabilities.UPDATE_ANY_MESSAGE)) || AbstractC22676k.m65745e(message.getCommand(), "giphy") || MessageUtils.isPoll(message) || MessageUtils.hasSharedLocation(message)) ? false : true;
        }
        return false;
    }

    private static final boolean canEditOwnMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.UPDATE_OWN_MESSAGE);
    }

    private static final boolean canFlagMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.FLAG_MESSAGE);
    }

    private static final boolean canMarkAsUnread(Set<String> set) {
        return set.contains(ChannelCapabilities.READ_EVENTS);
    }

    public static final boolean canMuteUser(boolean z4, User user, Message message, Channel channel) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(channel, "channel");
        return z4 && channel.getConfig().getMuteEnabled() && !isOwnMessage(message, user);
    }

    private static final boolean canPinMessage(Set<String> set) {
        return set.contains(ChannelCapabilities.PIN_MESSAGE);
    }

    public static final boolean canReplyToMessage(boolean z4, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return z4 && isSynced(message) && !MessageUtils.isDeleted(message) && ownCapabilities.contains(ChannelCapabilities.QUOTE_MESSAGE);
    }

    public static final boolean canRetryMessage(boolean z4, User user, Message message) {
        AbstractC22676k.m65750j(message, "message");
        return z4 && isOwnMessage(message, user) && isMessageFailed(message);
    }

    public static final boolean canThreadReplyToMessage(boolean z4, boolean z13, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return z4 && !z13 && !MessageUtils.isThreadReply(message) && isSynced(message) && ownCapabilities.contains(ChannelCapabilities.SEND_REPLY);
    }

    private static final boolean hasLinks(Message message) {
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            return false;
        }
        for (Attachment attachment : attachments) {
            if (AttachmentKt.hasLink(attachment) && !AttachmentUtilsKt.isGiphy(attachment)) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isGiphyCommand(Message message) {
        return AbstractC22676k.m65745e(message.getCommand(), "giphy");
    }

    private static final boolean isMessageFailed(Message message) {
        return message.getSyncStatus() == SyncStatus.FAILED_PERMANENTLY;
    }

    private static final boolean isOwnMessage(Message message, User user) {
        return AbstractC22676k.m65745e(message.getUser().getId(), user != null ? user.getId() : null);
    }

    private static final boolean isSynced(Message message) {
        return message.getSyncStatus() == SyncStatus.COMPLETED;
    }

    private static final boolean isTextOnly(Message message) {
        return message.getText().length() > 0 && message.getAttachments().isEmpty();
    }

    public static final boolean canFlagMessage(boolean z4, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return z4 && ownCapabilities.contains(ChannelCapabilities.FLAG_MESSAGE) && !isOwnMessage(message, user);
    }

    public static final boolean canMarkAsUnread(boolean z4, User user, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return z4 && ownCapabilities.contains(ChannelCapabilities.READ_EVENTS) && !isOwnMessage(message, user);
    }

    public static final boolean canPinMessage(boolean z4, Message message, Set<String> ownCapabilities) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(ownCapabilities, "ownCapabilities");
        return z4 && isSynced(message) && ownCapabilities.contains(ChannelCapabilities.PIN_MESSAGE);
    }
}
