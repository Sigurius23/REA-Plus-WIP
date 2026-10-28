package androidx.glance.appwidget.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.f0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1383f0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f5887a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f5888b;

    static {
        Charset.forName("US-ASCII");
        f5887a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5888b = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static void m4333a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m4334b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
