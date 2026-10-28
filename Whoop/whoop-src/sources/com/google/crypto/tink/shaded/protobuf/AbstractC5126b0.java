package com.google.crypto.tink.shaded.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1230l;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5126b0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f21479a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f21480b;

    static {
        Charset.forName("US-ASCII");
        f21479a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f21480b = bArr;
        ByteBuffer.wrap(bArr);
        AbstractC1230l.m3868f(bArr, 0, 0, false);
    }

    /* JADX INFO: renamed from: a */
    public static void m16123a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m16124b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
