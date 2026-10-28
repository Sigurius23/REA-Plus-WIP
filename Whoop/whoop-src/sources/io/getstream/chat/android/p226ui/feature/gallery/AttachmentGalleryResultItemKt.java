package io.getstream.chat.android.p226ui.feature.gallery;

import io.getstream.chat.android.models.Attachment;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a4\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m65681d2 = {"toAttachment", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;", "toAttachmentGalleryResultItem", "messageId", "", "parentId", "cid", "userName", "isMine", "", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentGalleryResultItemKt {
    public static final Attachment toAttachment(AttachmentGalleryResultItem attachmentGalleryResultItem) {
        AbstractC22676k.m65750j(attachmentGalleryResultItem, "<this>");
        String authorName = attachmentGalleryResultItem.getAuthorName();
        String authorLink = attachmentGalleryResultItem.getAuthorLink();
        String imageUrl = attachmentGalleryResultItem.getImageUrl();
        String assetUrl = attachmentGalleryResultItem.getAssetUrl();
        String name = attachmentGalleryResultItem.getName();
        String image = attachmentGalleryResultItem.getImage();
        String type = attachmentGalleryResultItem.getType();
        String text = attachmentGalleryResultItem.getText();
        String title = attachmentGalleryResultItem.getTitle();
        return new Attachment(authorName, authorLink, null, null, imageUrl, assetUrl, null, attachmentGalleryResultItem.getMimeType(), attachmentGalleryResultItem.getFileSize(), title, text, type, image, name, null, null, null, null, null, null, 1032268, null);
    }

    public static final AttachmentGalleryResultItem toAttachmentGalleryResultItem(Attachment attachment, String messageId, String str, String cid, String userName, boolean z4) {
        AbstractC22676k.m65750j(attachment, "<this>");
        AbstractC22676k.m65750j(messageId, "messageId");
        AbstractC22676k.m65750j(cid, "cid");
        AbstractC22676k.m65750j(userName, "userName");
        return new AttachmentGalleryResultItem(messageId, str, cid, userName, z4, null, attachment.getAuthorLink(), attachment.getImageUrl(), attachment.getAssetUrl(), null, 0, null, null, null, null, attachment.getName(), 32288, null);
    }
}
