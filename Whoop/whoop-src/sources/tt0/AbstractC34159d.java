package tt0;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: tt0.d */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC34159d {
    /* JADX INFO: renamed from: a */
    public static int m107942a(int i13) {
        int i14 = i13 % 4;
        return i14 != 0 ? (4 - i14) + i13 : i13;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m107943b(int i13) {
        return i13 % 4 == 0;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m107944c(ByteBuffer byteBuffer) {
        return m107943b(byteBuffer.limit());
    }

    /* JADX INFO: renamed from: d */
    public static void m107945d(ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2) {
        byteBuffer.mark();
        byteBuffer.position(i13);
        byteBuffer.put(byteBuffer2);
        byteBuffer.reset();
    }
}
