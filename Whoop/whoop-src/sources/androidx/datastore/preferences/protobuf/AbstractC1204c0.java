package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.c0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1204c0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f5362a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f5363b;

    static {
        Charset.forName("US-ASCII");
        f5362a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f5363b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new C1224j(bArr, 0, 0, false).mo3838l(0);
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m3788a(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m3789b(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
