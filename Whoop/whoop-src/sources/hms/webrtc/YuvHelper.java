package hms.webrtc;

import java.nio.ByteBuffer;
import p031b9.AbstractC2875y;

/* JADX INFO: loaded from: classes11.dex */
public class YuvHelper {
    public static void ABGRToI420(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17, int i18) {
        nativeABGRToI420(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, i17, i18);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19, int i24, int i25) {
        int i26 = (i17 + 1) / 2;
        int i27 = i18 * i17;
        int i28 = i18 * i19;
        int i29 = (i24 * i26) + i28;
        int i34 = (i24 * i25) + i28;
        int i35 = ((i26 - 1) * i24) + i34 + ((i16 + 1) / 2);
        if (byteBuffer4.capacity() < i35) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i35, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        I420Copy(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBufferSlice, i18, byteBufferSlice2, i24, byteBuffer4.slice(), i24, i16, i17);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17, int i18) {
        int i19 = i18 % 180;
        int i24 = i19 == 0 ? i16 : i17;
        int i25 = i19 == 0 ? i17 : i16;
        int i26 = (i25 + 1) / 2;
        int i27 = (i24 + 1) / 2;
        int i28 = i25 * i24;
        int i29 = i26 * i27;
        int i34 = (i29 * 2) + i28;
        if (byteBuffer4.capacity() < i34) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i34, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        int i35 = i29 + i28;
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        ByteBuffer byteBufferSlice2 = byteBuffer4.slice();
        nativeI420Rotate(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBufferSlice, i24, byteBufferSlice2, i27, byteBuffer4.slice(), i27, i16, i17, i18);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17, int i18, int i19) {
        int i24 = (i16 + 1) / 2;
        int i25 = i18 * i17;
        int i26 = i18 * i19;
        int i27 = (((i17 + 1) / 2) * i24 * 2) + i26;
        if (byteBuffer4.capacity() < i27) {
            throw new IllegalArgumentException(AbstractC2875y.m8294g(i27, byteBuffer4.capacity(), "Expected destination buffer capacity to be at least ", " was "));
        }
        ByteBuffer byteBufferSlice = byteBuffer4.slice();
        I420ToNV12(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBufferSlice, i18, byteBuffer4.slice(), i24 * 2, i16, i17);
    }

    public static void copyPlane(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, int i15, int i16) {
        nativeCopyPlane(byteBuffer, i13, byteBuffer2, i14, i15, i16);
    }

    private static native void nativeABGRToI420(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17, int i18);

    private static native void nativeCopyPlane(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, int i15, int i16);

    private static native void nativeI420Copy(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i24);

    private static native void nativeI420Rotate(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i24, int i25);

    private static native void nativeI420ToNV12(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, int i18, int i19);

    public static void I420ToNV12(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17) {
        I420ToNV12(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, i17, i16, i17);
    }

    public static void I420Rotate(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i24, int i25) {
        nativeI420Rotate(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, byteBuffer5, i17, byteBuffer6, i18, i19, i24, i25);
    }

    public static void I420ToNV12(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, int i18, int i19) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && i18 > 0 && i19 > 0) {
            nativeI420ToNV12(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, byteBuffer5, i17, i18, i19);
            return;
        }
        throw new IllegalArgumentException("Invalid I420ToNV12 input arguments");
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, int i17) {
        I420Copy(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, i17, i16, i17, (i16 + 1) / 2, (i17 + 1) / 2);
    }

    public static void I420Copy(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, ByteBuffer byteBuffer4, int i16, ByteBuffer byteBuffer5, int i17, ByteBuffer byteBuffer6, int i18, int i19, int i24) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null && byteBuffer4 != null && byteBuffer5 != null && byteBuffer6 != null && i19 > 0 && i24 > 0) {
            nativeI420Copy(byteBuffer, i13, byteBuffer2, i14, byteBuffer3, i15, byteBuffer4, i16, byteBuffer5, i17, byteBuffer6, i18, i19, i24);
            return;
        }
        throw new IllegalArgumentException("Invalid I420Copy input arguments");
    }
}
