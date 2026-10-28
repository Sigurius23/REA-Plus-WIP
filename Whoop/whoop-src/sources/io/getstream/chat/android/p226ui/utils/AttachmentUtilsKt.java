package io.getstream.chat.android.p226ui.utils;

import android.content.Context;
import android.webkit.MimeTypeMap;
import android.widget.ImageView;
import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.ChatUI;
import io.getstream.chat.android.p226ui.common.disposable.Disposable;
import io.getstream.chat.android.p226ui.common.images.internal.StreamImageLoader;
import io.getstream.chat.android.p226ui.common.images.resizing.StringExtensionsKt;
import io.getstream.chat.android.p226ui.common.internal.file.ShareableUriProvider;
import io.getstream.chat.android.p226ui.common.state.messages.composer.AttachmentMetaData;
import io.getstream.chat.android.p226ui.common.utils.extensions.AttachmentKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import java.io.File;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m65681d2 = {"FILE_THUMB_TRANSFORMATION", "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;", "loadAttachmentThumb", "Lio/getstream/chat/android/ui/common/disposable/Disposable;", "Landroid/widget/ImageView;", "attachment", "Lio/getstream/chat/android/models/Attachment;", "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;", "stream-chat-android-ui-components_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentUtilsKt {
    private static final StreamImageLoader.ImageTransformation.RoundedCorners FILE_THUMB_TRANSFORMATION = new StreamImageLoader.ImageTransformation.RoundedCorners(IntKt.dpToPxPrecise(3));

    public static final Disposable loadAttachmentThumb(ImageView imageView, Attachment attachment) {
        String imageUrl;
        String thumbUrl;
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(attachment, "attachment");
        if (io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt.isVideo(attachment) && ChatUI.getVideoThumbnailsEnabled() && (thumbUrl = attachment.getThumbUrl()) != null && !AbstractC39414r.m125890i0(thumbUrl)) {
            String thumbUrl2 = attachment.getThumbUrl();
            return ImageUtilsKt.load$default(imageView, thumbUrl2 != null ? StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(thumbUrl2, ChatUI.getStreamCdnImageResizing()) : null, (Integer) null, FILE_THUMB_TRANSFORMATION, (InterfaceC4339a) null, (InterfaceC4339a) null, 26, (Object) null);
        }
        if (io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt.isImage(attachment) && (imageUrl = attachment.getImageUrl()) != null && !AbstractC39414r.m125890i0(imageUrl)) {
            String imageUrl2 = attachment.getImageUrl();
            return ImageUtilsKt.load$default(imageView, imageUrl2 != null ? StringExtensionsKt.applyStreamCdnImageResizingIfEnabled(imageUrl2, ChatUI.getStreamCdnImageResizing()) : null, (Integer) null, FILE_THUMB_TRANSFORMATION, (InterfaceC4339a) null, (InterfaceC4339a) null, 26, (Object) null);
        }
        String mimeType = attachment.getMimeType();
        if (mimeType == null) {
            MimeTypeMap singleton = MimeTypeMap.getSingleton();
            String displayableName = AttachmentKt.getDisplayableName(attachment);
            mimeType = singleton.getMimeTypeFromExtension(displayableName != null ? AbstractC39414r.m125860F0('.', displayableName, displayableName) : null);
        }
        if (mimeType == null || !AbstractC39421y.m125930O(mimeType, "image", false) || attachment.getUpload() == null) {
            return ImageUtilsKt.load$default(imageView, Integer.valueOf(ChatUI.getMimeTypeIconProvider().getIconRes(mimeType)), (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
        }
        ShareableUriProvider shareableUriProvider = new ShareableUriProvider();
        Context context = imageView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        File upload = attachment.getUpload();
        AbstractC22676k.m65747g(upload);
        return ImageUtilsKt.load$default(imageView, shareableUriProvider.getUriForFile(context, upload), (Integer) null, FILE_THUMB_TRANSFORMATION, (InterfaceC4339a) null, (InterfaceC4339a) null, 26, (Object) null);
    }

    public static final Disposable loadAttachmentThumb(ImageView imageView, AttachmentMetaData attachment) {
        AbstractC22676k.m65750j(imageView, "<this>");
        AbstractC22676k.m65750j(attachment, "attachment");
        String type = attachment.getType();
        if (AbstractC22676k.m65745e(type, "video")) {
            return ImageUtilsKt.loadVideoThumbnail$default(imageView, attachment.getUri(), null, FILE_THUMB_TRANSFORMATION, null, null, 26, null);
        }
        return AbstractC22676k.m65745e(type, "image") ? ImageUtilsKt.load$default(imageView, attachment.getUri(), (Integer) null, FILE_THUMB_TRANSFORMATION, (InterfaceC4339a) null, (InterfaceC4339a) null, 26, (Object) null) : ImageUtilsKt.load$default(imageView, Integer.valueOf(ChatUI.getMimeTypeIconProvider().getIconRes(attachment.getMimeType())), (Integer) null, (StreamImageLoader.ImageTransformation) null, (InterfaceC4339a) null, (InterfaceC4339a) null, 30, (Object) null);
    }
}
