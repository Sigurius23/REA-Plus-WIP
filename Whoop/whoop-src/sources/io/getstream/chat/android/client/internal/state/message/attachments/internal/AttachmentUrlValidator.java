package io.getstream.chat.android.client.internal.state.message.attachments.internal;

import androidx.profileinstaller.ProfileVerifier;
import io.getstream.chat.android.client.helpers.AttachmentHelper;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.Message;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import live.hms.video.utils.AndroidSDKConstants;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J5\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000bH\u0000¢\u0006\u0002\b\rJ\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0002\b\rJ*\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0007H\u0002J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010H\u0002J\u0014\u0010\u0016\u001a\u00020\u0017*\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\f\u0010\u0019\u001a\u00020\u0017*\u00020\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m65681d2 = {"Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;", "", "attachmentHelper", "Lio/getstream/chat/android/client/helpers/AttachmentHelper;", "<init>", "(Lio/getstream/chat/android/client/helpers/AttachmentHelper;)V", "updateValidAttachmentsUrl", "", "Lio/getstream/chat/android/models/Message;", "newMessages", "oldMessages", "", "", "updateValidAttachmentsUrl$stream_chat_android_client_release", "newMessage", "oldMessage", "Lio/getstream/chat/android/models/Attachment;", "newAttachments", "oldAttachments", "updateValidAttachmentUrl", "newAttachment", "oldAttachment", "partialEquality", "", "other", "isDefault", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentUrlValidator {
    private final AttachmentHelper attachmentHelper;

    /* JADX WARN: Multi-variable type inference failed */
    public AttachmentUrlValidator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    private final boolean isDefault(Attachment attachment) {
        String authorName = attachment.getAuthorName();
        if (authorName != null && !AbstractC39414r.m125890i0(authorName)) {
            return false;
        }
        String titleLink = attachment.getTitleLink();
        if ((titleLink != null && !AbstractC39414r.m125890i0(titleLink)) || attachment.getFileSize() != 0) {
            return false;
        }
        String title = attachment.getTitle();
        if (title != null && !AbstractC39414r.m125890i0(title)) {
            return false;
        }
        String text = attachment.getText();
        if (text != null && !AbstractC39414r.m125890i0(text)) {
            return false;
        }
        String name = attachment.getName();
        if (name != null && !AbstractC39414r.m125890i0(name)) {
            return false;
        }
        String fallback = attachment.getFallback();
        return fallback == null || AbstractC39414r.m125890i0(fallback);
    }

    private final boolean partialEquality(Attachment attachment, Attachment attachment2) {
        return AbstractC22676k.m65745e(attachment.getAuthorName(), attachment2.getAuthorName()) && AbstractC22676k.m65745e(attachment.getTitleLink(), attachment2.getTitleLink()) && AbstractC22676k.m65745e(attachment.getMimeType(), attachment2.getMimeType()) && attachment.getFileSize() == attachment2.getFileSize() && AbstractC22676k.m65745e(attachment.getTitle(), attachment2.getTitle()) && AbstractC22676k.m65745e(attachment.getText(), attachment2.getText()) && AbstractC22676k.m65745e(attachment.getType(), attachment2.getType()) && AbstractC22676k.m65745e(attachment.getName(), attachment2.getName()) && AbstractC22676k.m65745e(attachment.getFallback(), attachment2.getFallback()) && !isDefault(attachment);
    }

    private final Attachment updateValidAttachmentUrl(Attachment newAttachment, Attachment oldAttachment) {
        String imageUrl;
        return (oldAttachment == null || (imageUrl = oldAttachment.getImageUrl()) == null || imageUrl.length() == 0 || AbstractC22676k.m65745e(oldAttachment.getImageUrl(), newAttachment.getImageUrl()) || !this.attachmentHelper.hasStreamImageUrl(oldAttachment) || !this.attachmentHelper.hasValidImageUrl(oldAttachment)) ? newAttachment : Attachment.copy$default(newAttachment, null, null, null, null, oldAttachment.getImageUrl(), null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, 1048559, null);
    }

    private final List<Attachment> updateValidAttachmentsUrl(List<Attachment> newAttachments, List<Attachment> oldAttachments) {
        Object next;
        List<Attachment> list = newAttachments;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Attachment attachment : list) {
            Iterator<T> it = oldAttachments.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!partialEquality((Attachment) next, attachment));
            arrayList.add(updateValidAttachmentUrl(attachment, (Attachment) next));
        }
        return arrayList;
    }

    public final List<Message> updateValidAttachmentsUrl$stream_chat_android_client_release(List<Message> newMessages, Map<String, Message> oldMessages) {
        AbstractC22676k.m65750j(newMessages, "newMessages");
        AbstractC22676k.m65750j(oldMessages, "oldMessages");
        if (oldMessages.isEmpty()) {
            return newMessages;
        }
        List<Message> list = newMessages;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (Message message : list) {
            arrayList.add(updateValidAttachmentsUrl$stream_chat_android_client_release(message, oldMessages.get(message.getId())));
        }
        return arrayList;
    }

    public AttachmentUrlValidator(AttachmentHelper attachmentHelper) {
        AbstractC22676k.m65750j(attachmentHelper, "attachmentHelper");
        this.attachmentHelper = attachmentHelper;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ AttachmentUrlValidator(AttachmentHelper attachmentHelper, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new AttachmentHelper(null, 1, 0 == true ? 1 : 0) : attachmentHelper);
    }

    public final Message updateValidAttachmentsUrl$stream_chat_android_client_release(Message newMessage, Message oldMessage) {
        AbstractC22676k.m65750j(newMessage, "newMessage");
        if (newMessage.getAttachments().isEmpty() || oldMessage == null) {
            return newMessage;
        }
        return newMessage.copy(((-1) & 1) != 0 ? newMessage.id : null, ((-1) & 2) != 0 ? newMessage.cid : null, ((-1) & 4) != 0 ? newMessage.text : null, ((-1) & 8) != 0 ? newMessage.html : null, ((-1) & 16) != 0 ? newMessage.parentId : null, ((-1) & 32) != 0 ? newMessage.command : null, ((-1) & 64) != 0 ? newMessage.attachments : AbstractC25265s.m74097F1(updateValidAttachmentsUrl(newMessage.getAttachments(), oldMessage.getAttachments())), ((-1) & 128) != 0 ? newMessage.mentionedUsersIds : null, ((-1) & 256) != 0 ? newMessage.mentionedUsers : null, ((-1) & 512) != 0 ? newMessage.replyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? newMessage.deletedReplyCount : 0, ((-1) & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? newMessage.reactionCounts : null, ((-1) & 4096) != 0 ? newMessage.reactionScores : null, ((-1) & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? newMessage.reactionGroups : null, ((-1) & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? newMessage.syncStatus : null, ((-1) & 32768) != 0 ? newMessage.type : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? newMessage.latestReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? newMessage.ownReactions : null, ((-1) & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? newMessage.createdAt : null, ((-1) & 524288) != 0 ? newMessage.updatedAt : null, ((-1) & 1048576) != 0 ? newMessage.deletedAt : null, ((-1) & 2097152) != 0 ? newMessage.updatedLocallyAt : null, ((-1) & 4194304) != 0 ? newMessage.createdLocallyAt : null, ((-1) & 8388608) != 0 ? newMessage.user : null, ((-1) & 16777216) != 0 ? newMessage.extraData : null, ((-1) & AndroidSDKConstants.FLAG_MUTABLE) != 0 ? newMessage.silent : false, ((-1) & 67108864) != 0 ? newMessage.shadowed : false, ((-1) & 134217728) != 0 ? newMessage.i18n : null, ((-1) & 268435456) != 0 ? newMessage.showInChannel : false, ((-1) & 536870912) != 0 ? newMessage.channelInfo : null, ((-1) & 1073741824) != 0 ? newMessage.replyTo : null, ((-1) & Integer.MIN_VALUE) != 0 ? newMessage.replyMessageId : null, (65535 & 1) != 0 ? newMessage.pinned : false, (65535 & 2) != 0 ? newMessage.pinnedAt : null, (65535 & 4) != 0 ? newMessage.pinExpires : null, (65535 & 8) != 0 ? newMessage.pinnedBy : null, (65535 & 16) != 0 ? newMessage.threadParticipants : null, (65535 & 32) != 0 ? newMessage.skipPushNotification : false, (65535 & 64) != 0 ? newMessage.skipEnrichUrl : false, (65535 & 128) != 0 ? newMessage.moderationDetails : null, (65535 & 256) != 0 ? newMessage.moderation : null, (65535 & 512) != 0 ? newMessage.messageTextUpdatedAt : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? newMessage.poll : null, (65535 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? newMessage.restrictedVisibility : null, (65535 & 4096) != 0 ? newMessage.reminder : null, (65535 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? newMessage.sharedLocation : null, (65535 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? newMessage.channelRole : null, (65535 & 32768) != 0 ? newMessage.deletedForMe : false);
    }
}
