package io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal;

import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.client.utils.message.MessageUtils;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0002J\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u000e*\u00020\u000fH\u0002J\f\u0010\u0011\u001a\u00020\u000e*\u00020\u000fH\u0002¨\u0006\u0012"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/MessageListItemViewTypeMapper;", "", "<init>", "()V", "getViewTypeValue", "", "messageListItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "attachmentFactoryManager", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "messageItemToViewType", "messageItem", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "isPoll", "", "Lio/getstream/chat/android/models/Message;", "isMediaAttachment", "containsOnlyLinkAttachments", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageListItemViewTypeMapper {
    public static final MessageListItemViewTypeMapper INSTANCE = new MessageListItemViewTypeMapper();

    private MessageListItemViewTypeMapper() {
    }

    private final boolean containsOnlyLinkAttachments(Message message) {
        if (message.getAttachments().isEmpty()) {
            return false;
        }
        List<Attachment> attachments = message.getAttachments();
        if ((attachments instanceof Collection) && attachments.isEmpty()) {
            return true;
        }
        Iterator<T> it = attachments.iterator();
        while (it.hasNext()) {
            if (!AttachmentKt.hasLink((Attachment) it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean isMediaAttachment(Message message) {
        if (message.getAttachments().isEmpty()) {
            return false;
        }
        List<Attachment> attachments = message.getAttachments();
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            for (Attachment attachment : attachments) {
                if (!AttachmentUtilsKt.isImage(attachment) && !AttachmentUtilsKt.isVideo(attachment) && !AttachmentKt.hasLink(attachment) && !AttachmentUtilsKt.isAudioRecording(attachment)) {
                    return false;
                }
            }
        }
        List<Attachment> attachments2 = message.getAttachments();
        if ((attachments2 instanceof Collection) && attachments2.isEmpty()) {
            return true;
        }
        for (Attachment attachment2 : attachments2) {
            if (AttachmentKt.isUploading(attachment2) || AttachmentKt.isFailed(attachment2)) {
                return false;
            }
        }
        return true;
    }

    private final boolean isPoll(Message message) {
        return message.getPoll() != null;
    }

    private final int messageItemToViewType(MessageListItem.MessageItem messageItem, AttachmentFactoryManager attachmentFactoryManager) {
        Message message = messageItem.getMessage();
        List<Attachment> attachments = message.getAttachments();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : attachments) {
            if (AttachmentKt.hasLink((Attachment) obj)) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList;
        boolean z4 = false;
        if (!(arrayList3 instanceof Collection) || !arrayList3.isEmpty()) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                if (AttachmentUtilsKt.isGiphy((Attachment) it.next())) {
                    z4 = true;
                    break;
                }
            }
        }
        boolean zIsEmpty = message.getAttachments().isEmpty();
        boolean zContainsOnlyLinkAttachments = containsOnlyLinkAttachments(message);
        if (message.getPoll() != null) {
            return MessageListItemViewType.POLL;
        }
        if (MessageUtils.isDeleted(message)) {
            return 1002;
        }
        if (MessageUtils.isError(message) && !MessageUtils.isModerationBounce(message)) {
            return MessageListItemViewType.ERROR_MESSAGE;
        }
        if (MessageUtils.isSystem(message)) {
            return MessageListItemViewType.SYSTEM_MESSAGE;
        }
        if (MessageUtils.isGiphyEphemeral(message)) {
            return MessageListItemViewType.GIPHY;
        }
        if (zIsEmpty) {
            return 1003;
        }
        if (attachmentFactoryManager.canHandle(message)) {
            return MessageListItemViewType.CUSTOM_ATTACHMENTS;
        }
        if (z4) {
            return MessageListItemViewType.GIPHY_ATTACHMENT;
        }
        if (zContainsOnlyLinkAttachments) {
            return MessageListItemViewType.LINK_ATTACHMENTS;
        }
        return isMediaAttachment(message) ? MessageListItemViewType.MEDIA_ATTACHMENT : MessageListItemViewType.FILE_ATTACHMENTS;
    }

    public final int getViewTypeValue(MessageListItem messageListItem, AttachmentFactoryManager attachmentFactoryManager) {
        AbstractC22676k.m65750j(messageListItem, "messageListItem");
        AbstractC22676k.m65750j(attachmentFactoryManager, "attachmentFactoryManager");
        if (messageListItem instanceof MessageListItem.DateSeparatorItem) {
            return 1001;
        }
        if (messageListItem instanceof MessageListItem.LoadingMoreIndicatorItem) {
            return MessageListItemViewType.LOADING_INDICATOR;
        }
        if (messageListItem instanceof MessageListItem.ThreadSeparatorItem) {
            return MessageListItemViewType.THREAD_SEPARATOR;
        }
        if (messageListItem instanceof MessageListItem.MessageItem) {
            return messageItemToViewType((MessageListItem.MessageItem) messageListItem, attachmentFactoryManager);
        }
        if (messageListItem instanceof MessageListItem.TypingItem) {
            return MessageListItemViewType.TYPING_INDICATOR;
        }
        if (messageListItem instanceof MessageListItem.ThreadPlaceholderItem) {
            return MessageListItemViewType.THREAD_PLACEHOLDER;
        }
        if (messageListItem instanceof MessageListItem.UnreadSeparatorItem) {
            return MessageListItemViewType.UNREAD_SEPARATOR;
        }
        if (messageListItem instanceof MessageListItem.StartOfTheChannelItem) {
            return MessageListItemViewType.START_OF_THE_CHANNEL;
        }
        throw new NoWhenBranchMatchedException();
    }
}
