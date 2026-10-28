package p010a9;

import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;
import p319m4.AbstractC25012a;
import p516u8.AbstractC34628y;
import p516u8.C34610p;

/* JADX INFO: renamed from: a9.e */
/* JADX INFO: loaded from: classes5.dex */
public class C0580e extends AbstractC0576a {

    /* JADX INFO: renamed from: E */
    public ByteBuffer f2063E;

    /* JADX INFO: renamed from: F */
    public boolean f2064F;

    /* JADX INFO: renamed from: G */
    public long f2065G;

    /* JADX INFO: renamed from: H */
    public ByteBuffer f2066H;

    /* JADX INFO: renamed from: I */
    public final int f2067I;

    /* JADX INFO: renamed from: y */
    public C34610p f2068y;

    /* JADX INFO: renamed from: z */
    public final C0578c f2069z;

    static {
        AbstractC34628y.m109420a("media3.decoder");
    }

    public C0580e(int i13) {
        super(0);
        this.f2069z = new C0578c(0);
        this.f2067I = i13;
    }

    /* JADX INFO: renamed from: o */
    public void mo1506o() {
        this.f2052x = 0;
        ByteBuffer byteBuffer = this.f2063E;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f2066H;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f2064F = false;
    }

    /* JADX INFO: renamed from: p */
    public final ByteBuffer m1507p(int i13) {
        int i14 = this.f2067I;
        if (i14 == 1) {
            return ByteBuffer.allocate(i13);
        }
        if (i14 == 2) {
            return ByteBuffer.allocateDirect(i13);
        }
        ByteBuffer byteBuffer = this.f2063E;
        throw new DecoderInputBuffer$InsufficientCapacityException(AbstractC25012a.m73372e(byteBuffer == null ? 0 : byteBuffer.capacity(), i13, "Buffer too small (", " < ", ")"));
    }

    /* JADX INFO: renamed from: q */
    public final void m1508q(int i13) {
        ByteBuffer byteBuffer = this.f2063E;
        if (byteBuffer == null) {
            this.f2063E = m1507p(i13);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i14 = i13 + iPosition;
        if (iCapacity >= i14) {
            this.f2063E = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM1507p = m1507p(i14);
        byteBufferM1507p.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM1507p.put(byteBuffer);
        }
        this.f2063E = byteBufferM1507p;
    }

    /* JADX INFO: renamed from: r */
    public final void m1509r() {
        ByteBuffer byteBuffer = this.f2063E;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f2066H;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
