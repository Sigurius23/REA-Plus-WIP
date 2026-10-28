package io.getstream.chat.android.client.extensions;

import io.getstream.chat.android.models.Attachment;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014\"\u001d\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016*\u00020\b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m65681d2 = {"ATTACHMENT_TYPE_IMAGE", "", "ATTACHMENT_TYPE_FILE", "EXTRA_UPLOAD_ID", "EXTRA_DURATION", "EXTRA_WAVEFORM_DATA", "isImage", "", "Lio/getstream/chat/android/models/Attachment;", "(Lio/getstream/chat/android/models/Attachment;)Z", AttachmentExtensionsKt.EXTRA_UPLOAD_ID, "getUploadId", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;", AttachmentExtensionsKt.EXTRA_DURATION, "", "getDuration", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;", "durationInMs", "", "getDurationInMs", "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Integer;", "waveformData", "", "getWaveformData", "(Lio/getstream/chat/android/models/Attachment;)Ljava/util/List;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class AttachmentExtensionsKt {
    public static final String ATTACHMENT_TYPE_FILE = "file";
    public static final String ATTACHMENT_TYPE_IMAGE = "image";
    public static final String EXTRA_DURATION = "duration";
    public static final String EXTRA_UPLOAD_ID = "uploadId";
    public static final String EXTRA_WAVEFORM_DATA = "waveform_data";

    public static final Float getDuration(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        Object obj = attachment.getExtraData().get(EXTRA_DURATION);
        Number number = obj instanceof Number ? (Number) obj : null;
        if (number != null) {
            return Float.valueOf(number.floatValue());
        }
        return null;
    }

    public static final Integer getDurationInMs(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        Float duration = getDuration(attachment);
        if (duration != null) {
            return Integer.valueOf((int) (duration.floatValue() * 1000));
        }
        return null;
    }

    public static final String getUploadId(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        return (String) attachment.getExtraData().get(EXTRA_UPLOAD_ID);
    }

    public static final List<Float> getWaveformData(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        Object obj = attachment.getExtraData().get(EXTRA_WAVEFORM_DATA);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    public static final boolean isImage(Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "<this>");
        String mimeType = attachment.getMimeType();
        if (mimeType != null) {
            return AbstractC39421y.m125930O(mimeType, "image", false);
        }
        return false;
    }
}
