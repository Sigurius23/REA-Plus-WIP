package io.getstream.chat.android.client.internal.offline.repository.domain.message.attachment.internal;

import io.getstream.chat.android.models.Attachment;
import java.io.File;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import n23.C26198a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u001c\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\u0001H\u0000\u001a\f\u0010\t\u001a\u00020\u0002*\u00020\bH\u0000\u001a\f\u0010\u0000\u001a\u00020\n*\u00020\u000bH\u0002\u001a\u0016\u0010\t\u001a\u00020\u000b*\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, m65681d2 = {"toEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/AttachmentEntity;", "Lio/getstream/chat/android/models/Attachment;", "messageId", "", "index", "", "toReplyEntity", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/ReplyAttachmentEntity;", "toModel", "Lio/getstream/chat/android/client/internal/offline/repository/domain/message/attachment/internal/UploadStateEntity;", "Lio/getstream/chat/android/models/Attachment$UploadState;", "uploadFile", "Ljava/io/File;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentMapperKt {
    public static final AttachmentEntity toEntity(Attachment attachment, String messageId, int i13) {
        AbstractC22676k.m65750j(attachment, "<this>");
        AbstractC22676k.m65750j(messageId, "messageId");
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(attachment.getExtraData());
        Object objGenerateId$stream_chat_android_client_release = linkedHashMapM74003l0.get(AttachmentEntity.EXTRA_DATA_ID_KEY);
        if (objGenerateId$stream_chat_android_client_release == null) {
            objGenerateId$stream_chat_android_client_release = AttachmentEntity.INSTANCE.generateId$stream_chat_android_client_release(messageId, i13);
            linkedHashMapM74003l0.put(AttachmentEntity.EXTRA_DATA_ID_KEY, objGenerateId$stream_chat_android_client_release);
        }
        AbstractC22676k.m65748h(objGenerateId$stream_chat_android_client_release, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objGenerateId$stream_chat_android_client_release;
        String authorName = attachment.getAuthorName();
        String titleLink = attachment.getTitleLink();
        String authorLink = attachment.getAuthorLink();
        String thumbUrl = attachment.getThumbUrl();
        String imageUrl = attachment.getImageUrl();
        String assetUrl = attachment.getAssetUrl();
        String ogUrl = attachment.getOgUrl();
        String mimeType = attachment.getMimeType();
        int fileSize = attachment.getFileSize();
        String title = attachment.getTitle();
        String text = attachment.getText();
        String type = attachment.getType();
        String image = attachment.getImage();
        String name = attachment.getName();
        String fallback = attachment.getFallback();
        File upload = attachment.getUpload();
        String absolutePath = upload != null ? upload.getAbsolutePath() : null;
        Attachment.UploadState uploadState = attachment.getUploadState();
        return new AttachmentEntity(str, messageId, authorName, titleLink, authorLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, absolutePath, attachment.getOriginalHeight(), attachment.getOriginalWidth(), uploadState != null ? toEntity(uploadState) : null, linkedHashMapM74003l0);
    }

    public static final Attachment toModel(AttachmentEntity attachmentEntity) {
        AbstractC22676k.m65750j(attachmentEntity, "<this>");
        String authorName = attachmentEntity.getAuthorName();
        String titleLink = attachmentEntity.getTitleLink();
        String authorLink = attachmentEntity.getAuthorLink();
        String thumbUrl = attachmentEntity.getThumbUrl();
        String imageUrl = attachmentEntity.getImageUrl();
        String assetUrl = attachmentEntity.getAssetUrl();
        String ogUrl = attachmentEntity.getOgUrl();
        String mimeType = attachmentEntity.getMimeType();
        int fileSize = attachmentEntity.getFileSize();
        String title = attachmentEntity.getTitle();
        String text = attachmentEntity.getText();
        String type = attachmentEntity.getType();
        String image = attachmentEntity.getImage();
        String name = attachmentEntity.getName();
        String fallback = attachmentEntity.getFallback();
        String uploadFilePath = attachmentEntity.getUploadFilePath();
        Attachment.UploadState model = null;
        File file = uploadFilePath != null ? new File(uploadFilePath) : null;
        UploadStateEntity uploadState = attachmentEntity.getUploadState();
        if (uploadState != null) {
            String uploadFilePath2 = attachmentEntity.getUploadFilePath();
            model = toModel(uploadState, uploadFilePath2 != null ? new File(uploadFilePath2) : null);
        }
        return new Attachment(authorName, authorLink, titleLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, attachmentEntity.getOriginalHeight(), attachmentEntity.getOriginalWidth(), file, model, attachmentEntity.getExtraData());
    }

    public static final ReplyAttachmentEntity toReplyEntity(Attachment attachment, String messageId, int i13) {
        AbstractC22676k.m65750j(attachment, "<this>");
        AbstractC22676k.m65750j(messageId, "messageId");
        LinkedHashMap linkedHashMapM74003l0 = AbstractC25247g0.m74003l0(attachment.getExtraData());
        Object objGenerateId$stream_chat_android_client_release = linkedHashMapM74003l0.get(AttachmentEntity.EXTRA_DATA_ID_KEY);
        if (objGenerateId$stream_chat_android_client_release == null) {
            objGenerateId$stream_chat_android_client_release = AttachmentEntity.INSTANCE.generateId$stream_chat_android_client_release(messageId, i13);
            linkedHashMapM74003l0.put(AttachmentEntity.EXTRA_DATA_ID_KEY, objGenerateId$stream_chat_android_client_release);
        }
        AbstractC22676k.m65748h(objGenerateId$stream_chat_android_client_release, "null cannot be cast to non-null type kotlin.String");
        String str = (String) objGenerateId$stream_chat_android_client_release;
        String authorName = attachment.getAuthorName();
        String titleLink = attachment.getTitleLink();
        String authorLink = attachment.getAuthorLink();
        String thumbUrl = attachment.getThumbUrl();
        String imageUrl = attachment.getImageUrl();
        String assetUrl = attachment.getAssetUrl();
        String ogUrl = attachment.getOgUrl();
        String mimeType = attachment.getMimeType();
        int fileSize = attachment.getFileSize();
        String title = attachment.getTitle();
        String text = attachment.getText();
        String type = attachment.getType();
        String image = attachment.getImage();
        String name = attachment.getName();
        String fallback = attachment.getFallback();
        File upload = attachment.getUpload();
        String absolutePath = upload != null ? upload.getAbsolutePath() : null;
        Attachment.UploadState uploadState = attachment.getUploadState();
        return new ReplyAttachmentEntity(str, messageId, authorName, titleLink, authorLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, absolutePath, attachment.getOriginalHeight(), attachment.getOriginalWidth(), uploadState != null ? toEntity(uploadState) : null, linkedHashMapM74003l0);
    }

    public static final Attachment toModel(ReplyAttachmentEntity replyAttachmentEntity) {
        AbstractC22676k.m65750j(replyAttachmentEntity, "<this>");
        String authorName = replyAttachmentEntity.getAuthorName();
        String titleLink = replyAttachmentEntity.getTitleLink();
        String authorLink = replyAttachmentEntity.getAuthorLink();
        String thumbUrl = replyAttachmentEntity.getThumbUrl();
        String imageUrl = replyAttachmentEntity.getImageUrl();
        String assetUrl = replyAttachmentEntity.getAssetUrl();
        String ogUrl = replyAttachmentEntity.getOgUrl();
        String mimeType = replyAttachmentEntity.getMimeType();
        int fileSize = replyAttachmentEntity.getFileSize();
        String title = replyAttachmentEntity.getTitle();
        String text = replyAttachmentEntity.getText();
        String type = replyAttachmentEntity.getType();
        String image = replyAttachmentEntity.getImage();
        String name = replyAttachmentEntity.getName();
        String fallback = replyAttachmentEntity.getFallback();
        String uploadFilePath = replyAttachmentEntity.getUploadFilePath();
        Attachment.UploadState model = null;
        File file = uploadFilePath != null ? new File(uploadFilePath) : null;
        UploadStateEntity uploadState = replyAttachmentEntity.getUploadState();
        if (uploadState != null) {
            String uploadFilePath2 = replyAttachmentEntity.getUploadFilePath();
            model = toModel(uploadState, uploadFilePath2 != null ? new File(uploadFilePath2) : null);
        }
        return new Attachment(authorName, authorLink, titleLink, thumbUrl, imageUrl, assetUrl, ogUrl, mimeType, fileSize, title, text, type, image, name, fallback, replyAttachmentEntity.getOriginalHeight(), replyAttachmentEntity.getOriginalWidth(), file, model, replyAttachmentEntity.getExtraData());
    }

    private static final UploadStateEntity toEntity(Attachment.UploadState uploadState) {
        C23465k c23465k;
        if (AbstractC22676k.m65745e(uploadState, Attachment.UploadState.Success.INSTANCE)) {
            c23465k = new C23465k(1, null);
        } else if (AbstractC22676k.m65745e(uploadState, Attachment.UploadState.Idle.INSTANCE) || (uploadState instanceof Attachment.UploadState.InProgress)) {
            C23465k c23465k2 = new C23465k(2, null);
            c23465k = c23465k2;
        } else if (uploadState instanceof Attachment.UploadState.Failed) {
            c23465k = new C23465k(3, ((Attachment.UploadState.Failed) uploadState).getError().mo77807a());
        } else {
            throw new NoWhenBranchMatchedException();
        }
        return new UploadStateEntity(((Number) c23465k.f92937w).intValue(), (String) c23465k.f92938x);
    }

    private static final Attachment.UploadState toModel(UploadStateEntity uploadStateEntity, File file) {
        int statusCode = uploadStateEntity.getStatusCode();
        if (statusCode == 1) {
            return Attachment.UploadState.Success.INSTANCE;
        }
        if (statusCode == 2) {
            return new Attachment.UploadState.InProgress(0L, file != null ? file.length() : 0L);
        }
        if (statusCode == 3) {
            String errorMessage = uploadStateEntity.getErrorMessage();
            if (errorMessage == null) {
                errorMessage = "";
            }
            return new Attachment.UploadState.Failed(new C26198a(errorMessage));
        }
        throw new IllegalStateException(("Integer value of " + uploadStateEntity.getStatusCode() + " can't be mapped to UploadState").toString());
    }
}
