package io.getstream.chat.android.client.extensions;

import android.webkit.MimeTypeMap;
import androidx.room.AbstractC1772c1;
import java.io.File;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34818h0;
import x83.AbstractC38093j;
import yb3.C39412p;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Ljava/io/File;", "", "getMimeType", "(Ljava/io/File;)Ljava/lang/String;", "Lud3/h0;", "getMediaType", "(Ljava/io/File;)Lud3/h0;", "stream-chat-android-client_release"}, m65682k = 2, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileExtensionsKt {
    public static final C34818h0 getMediaType(File file) {
        AbstractC22676k.m65750j(file, "<this>");
        C39412p c39412p = C34818h0.f146589e;
        return AbstractC1772c1.m5403u(getMimeType(file));
    }

    public static final String getMimeType(File file) {
        AbstractC22676k.m65750j(file, "<this>");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(AbstractC38093j.m122039m(file));
        return mimeTypeFromExtension == null ? DfuBaseService.MIME_TYPE_OCTET_STREAM : mimeTypeFromExtension;
    }
}
