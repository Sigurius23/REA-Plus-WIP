package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.nio.ByteBuffer;
import la.C23548b;
import pe3.C29119a;
import pe3.C29120b;
import pe3.C29122d;
import se.AbstractC32411b;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class UploadDataProviders {
    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new C29122d(new C23548b(file, 23));
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C29122d(new C29119a(parcelFileDescriptor));
    }

    public static UploadDataProvider create(byte[] bArr, int i13, int i14) {
        return AbstractC32411b.m101111w(bArr, i13, i14);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C29120b(byteBuffer.slice());
    }

    public static UploadDataProvider create(byte[] bArr) {
        return AbstractC32411b.m101111w(bArr, 0, bArr.length);
    }
}
