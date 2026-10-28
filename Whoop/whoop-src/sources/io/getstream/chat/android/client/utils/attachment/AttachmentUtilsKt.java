package io.getstream.chat.android.client.utils.attachment;

import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.models.AttachmentType;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0003\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0005\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002¨\u0006\b"}, m65681d2 = {"isImage", "", "Lio/getstream/chat/android/models/Attachment;", "isVideo", "isAudio", "isFile", "isGiphy", "isAudioRecording", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentUtilsKt {
    public static final boolean isAudio(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), "audio");
    }

    public static final boolean isAudioRecording(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), AttachmentType.AUDIO_RECORDING);
    }

    public static final boolean isFile(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), "file");
    }

    public static final boolean isGiphy(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), "giphy");
    }

    public static final boolean isImage(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), "image");
    }

    public static final boolean isVideo(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return AbstractC22676k.m65745e(attachment.getType(), "video");
    }
}
