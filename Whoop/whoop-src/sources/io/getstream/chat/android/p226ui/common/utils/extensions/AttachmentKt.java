package io.getstream.chat.android.p226ui.common.utils.extensions;

import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.core.internal.InternalStreamChatApi;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.common.helper.internal.StorageHelper;
import io.getstream.chat.android.p226ui.common.utils.StringUtils;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u0002\" \u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\" \u0010\b\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007\" \u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007¨\u0006\u0013"}, m65681d2 = {"getDisplayableName", "", "Lio/getstream/chat/android/models/Attachment;", "linkPreviewImageUrl", "getLinkPreviewImageUrl$annotations", "(Lio/getstream/chat/android/models/Attachment;)V", "getLinkPreviewImageUrl", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", "linkUrl", "getLinkUrl$annotations", "getLinkUrl", "giphyFallbackPreviewUrl", "getGiphyFallbackPreviewUrl$annotations", "getGiphyFallbackPreviewUrl", "isAnyFileType", "", "isUploading", "isFailed", "hasLink", "stream-chat-android-ui-common_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentKt {
    public static final String getDisplayableName(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        StringUtils stringUtils = StringUtils.INSTANCE;
        String title = attachment.getTitle();
        if (title == null && (title = attachment.getName()) == null) {
            File upload = attachment.getUpload();
            title = upload != null ? upload.getName() : null;
        }
        return stringUtils.removeTimePrefix(title, StorageHelper.TIME_FORMAT);
    }

    public static final String getGiphyFallbackPreviewUrl(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String thumbUrl = attachment.getThumbUrl();
        return (thumbUrl == null && (thumbUrl = attachment.getTitleLink()) == null) ? attachment.getOgUrl() : thumbUrl;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getGiphyFallbackPreviewUrl$annotations(Attachment attachment) {
    }

    public static final String getLinkPreviewImageUrl(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String thumbUrl = attachment.getThumbUrl();
        return thumbUrl == null ? attachment.getImageUrl() : thumbUrl;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getLinkPreviewImageUrl$annotations(Attachment attachment) {
    }

    public static final String getLinkUrl(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String titleLink = attachment.getTitleLink();
        return titleLink == null ? attachment.getOgUrl() : titleLink;
    }

    @InternalStreamChatApi
    public static /* synthetic */ void getLinkUrl$annotations(Attachment attachment) {
    }

    public static final boolean hasLink(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return (attachment.getTitleLink() == null && attachment.getOgUrl() == null) ? false : true;
    }

    public static final boolean isAnyFileType(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AttachmentExtensionsKt.getUploadId(attachment) != null || attachment.getUpload() != null || AttachmentUtilsKt.isFile(attachment) || AttachmentUtilsKt.isVideo(attachment) || AttachmentUtilsKt.isAudio(attachment) || AttachmentUtilsKt.isAudioRecording(attachment);
    }

    public static final boolean isFailed(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return (!(attachment.getUploadState() instanceof Attachment.UploadState.Failed) || attachment.getUpload() == null || AttachmentExtensionsKt.getUploadId(attachment) == null) ? false : true;
    }

    public static final boolean isUploading(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return ((!(attachment.getUploadState() instanceof Attachment.UploadState.InProgress) && !(attachment.getUploadState() instanceof Attachment.UploadState.Idle)) || attachment.getUpload() == null || AttachmentExtensionsKt.getUploadId(attachment) == null) ? false : true;
    }
}
