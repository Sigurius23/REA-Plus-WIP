package p200hs;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

/* JADX INFO: renamed from: hs.g */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17595g {

    /* JADX INFO: renamed from: a */
    public static final int[] f68169a = m50111e(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* JADX INFO: renamed from: a */
    public static byte[] m50107a(byte[] bArr, byte[] bArr2) {
        int[] iArrM50108b = m50108b(m50111e(bArr), m50111e(bArr2));
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(iArrM50108b.length * 4).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrM50108b);
        return byteBufferOrder.array();
    }

    /* JADX INFO: renamed from: b */
    public static int[] m50108b(int[] iArr, int[] iArr2) {
        int[] iArr3 = new int[16];
        int[] iArr4 = f68169a;
        System.arraycopy(iArr4, 0, iArr3, 0, iArr4.length);
        System.arraycopy(iArr, 0, iArr3, iArr4.length, 8);
        iArr3[12] = iArr2[0];
        iArr3[13] = iArr2[1];
        iArr3[14] = iArr2[2];
        iArr3[15] = iArr2[3];
        m50110d(iArr3);
        iArr3[4] = iArr3[12];
        iArr3[5] = iArr3[13];
        iArr3[6] = iArr3[14];
        iArr3[7] = iArr3[15];
        return Arrays.copyOf(iArr3, 8);
    }

    /* JADX INFO: renamed from: c */
    public static void m50109c(int i13, int i14, int i15, int i16, int[] iArr) {
        int i17 = iArr[i13] + iArr[i14];
        iArr[i13] = i17;
        int i18 = i17 ^ iArr[i16];
        int i19 = (i18 >>> (-16)) | (i18 << 16);
        iArr[i16] = i19;
        int i24 = iArr[i15] + i19;
        iArr[i15] = i24;
        int i25 = iArr[i14] ^ i24;
        int i26 = (i25 >>> (-12)) | (i25 << 12);
        iArr[i14] = i26;
        int i27 = iArr[i13] + i26;
        iArr[i13] = i27;
        int i28 = iArr[i16] ^ i27;
        int i29 = (i28 >>> (-8)) | (i28 << 8);
        iArr[i16] = i29;
        int i34 = iArr[i15] + i29;
        iArr[i15] = i34;
        int i35 = iArr[i14] ^ i34;
        iArr[i14] = (i35 >>> (-7)) | (i35 << 7);
    }

    /* JADX INFO: renamed from: d */
    public static void m50110d(int[] iArr) {
        for (int i13 = 0; i13 < 10; i13++) {
            m50109c(0, 4, 8, 12, iArr);
            m50109c(1, 5, 9, 13, iArr);
            m50109c(2, 6, 10, 14, iArr);
            m50109c(3, 7, 11, 15, iArr);
            m50109c(0, 5, 10, 15, iArr);
            m50109c(1, 6, 11, 12, iArr);
            m50109c(2, 7, 8, 13, iArr);
            m50109c(3, 4, 9, 14, iArr);
        }
    }

    /* JADX INFO: renamed from: e */
    public static int[] m50111e(byte[] bArr) {
        if (bArr.length % 4 != 0) {
            throw new IllegalArgumentException("invalid input length");
        }
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }
}
