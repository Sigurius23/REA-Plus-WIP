package androidx.health.platform.client.proto;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.x0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC1549x0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f6150a;

    /* JADX INFO: renamed from: b */
    public static final byte[] f6151b;

    static {
        Charset.forName("US-ASCII");
        f6150a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f6151b = bArr;
        ByteBuffer.wrap(bArr);
        int length = bArr.length;
        try {
            if (length < 0) {
                throw InvalidProtocolBufferException.m4559b();
            }
            int i13 = (0 - 0) + length;
            if (i13 < 0) {
                throw InvalidProtocolBufferException.m4560c();
            }
            if (i13 > Integer.MAX_VALUE) {
                throw InvalidProtocolBufferException.m4561d();
            }
        } catch (InvalidProtocolBufferException e5) {
            throw new IllegalArgumentException(e5);
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m4935a(long j7) {
        return (int) (j7 ^ (j7 >>> 32));
    }
}
