package p085d9;

import java.nio.ByteBuffer;
import rs.AbstractC31780b;

/* JADX INFO: renamed from: d9.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11782b0 {

    /* JADX INFO: renamed from: d */
    public static final byte[] f38196d = {79, 103, 103, 83, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 28, -43, -59, -9, 1, 19, 79, 112, 117, 115, 72, 101, 97, 100, 1, 2, 56, 1, -128, -69, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: e */
    public static final byte[] f38197e = {79, 103, 103, 83, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 11, -103, 87, 83, 1, 16, 79, 112, 117, 115, 84, 97, 103, 115, 0, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: a */
    public ByteBuffer f38198a;

    /* JADX INFO: renamed from: b */
    public int f38199b;

    /* JADX INFO: renamed from: c */
    public int f38200c;

    /* JADX INFO: renamed from: a */
    public static void m31595a(ByteBuffer byteBuffer, long j7, int i13, int i14, boolean z4) {
        byteBuffer.put((byte) 79);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 103);
        byteBuffer.put((byte) 83);
        byteBuffer.put((byte) 0);
        byteBuffer.put(z4 ? (byte) 2 : (byte) 0);
        byteBuffer.putLong(j7);
        byteBuffer.putInt(0);
        byteBuffer.putInt(i13);
        byteBuffer.putInt(0);
        long j13 = i14;
        if (!((j13 >> 8) == 0)) {
            throw new IllegalArgumentException(AbstractC31780b.m98690k("out of range: %s", Long.valueOf(j13)));
        }
        byteBuffer.put((byte) j13);
    }
}
