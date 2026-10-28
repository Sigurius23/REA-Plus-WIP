package wa3;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: wa3.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC37015r {

    /* JADX INFO: renamed from: a */
    public static final byte[] f158384a;

    static {
        byte[] bArr = new byte[0];
        f158384a = bArr;
        ByteBuffer.wrap(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m118829a(byte[] bArr) {
        return AbstractC36989d0.m118740c(bArr, 0, bArr.length) == 0;
    }

    /* JADX INFO: renamed from: b */
    public static String m118830b(byte[] bArr) {
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e5) {
            throw new RuntimeException("UTF-8 not supported?", e5);
        }
    }
}
