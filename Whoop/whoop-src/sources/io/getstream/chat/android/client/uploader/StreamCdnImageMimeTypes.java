package io.getstream.chat.android.client.uploader;

import io.getstream.chat.android.p226ui.common.model.MimeType;
import java.util.Set;
import m83.AbstractC25260n;
import m83.AbstractC25265s;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m65681d2 = {"Lio/getstream/chat/android/client/uploader/StreamCdnImageMimeTypes;", "", "<init>", "()V", "SUPPORTED_IMAGE_MIME_TYPES", "", "", "isImageMimeTypeSupported", "", "mimeType", "stream-chat-android-client_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class StreamCdnImageMimeTypes {
    public static final StreamCdnImageMimeTypes INSTANCE = new StreamCdnImageMimeTypes();
    private static final Set<String> SUPPORTED_IMAGE_MIME_TYPES = AbstractC25260n.m74059b1(new String[]{"image/bmp", MimeType.MIME_TYPE_GIF, "image/jpeg", "image/png", "image/webp", "image/heic", "image/heic-sequence", "image/heif", "image/heif-sequence", "image/svg+xml"});

    private StreamCdnImageMimeTypes() {
    }

    public final boolean isImageMimeTypeSupported(String mimeType) {
        return AbstractC25265s.m74155w0(SUPPORTED_IMAGE_MIME_TYPES, mimeType);
    }
}
