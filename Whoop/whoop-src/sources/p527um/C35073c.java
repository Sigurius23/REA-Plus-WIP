package p527um;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import java.nio.ByteBuffer;
import p010a9.AbstractC0576a;
import p010a9.C0578c;
import p465rm.AbstractC31515a0;

/* JADX INFO: renamed from: um.c */
/* JADX INFO: loaded from: classes6.dex */
public class C35073c extends AbstractC0576a {

    /* JADX INFO: renamed from: E */
    public boolean f148796E;

    /* JADX INFO: renamed from: F */
    public long f148797F;

    /* JADX INFO: renamed from: G */
    public ByteBuffer f148798G;

    /* JADX INFO: renamed from: H */
    public final int f148799H;

    /* JADX INFO: renamed from: y */
    public final C0578c f148800y;

    /* JADX INFO: renamed from: z */
    public ByteBuffer f148801z;

    static {
        AbstractC31515a0.m97109a("goog.exo.decoder");
    }

    public C35073c(int i13) {
        super(3);
        this.f148800y = new C0578c(1);
        this.f148799H = i13;
    }

    /* JADX INFO: renamed from: o */
    public void mo49690o() {
        this.f2052x = 0;
        ByteBuffer byteBuffer = this.f148801z;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f148798G;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f148796E = false;
    }

    /* JADX INFO: renamed from: p */
    public final ByteBuffer m110917p(int i13) {
        int i14 = this.f148799H;
        if (i14 == 1) {
            return ByteBuffer.allocate(i13);
        }
        if (i14 == 2) {
            return ByteBuffer.allocateDirect(i13);
        }
        ByteBuffer byteBuffer = this.f148801z;
        int iCapacity = byteBuffer == null ? 0 : byteBuffer.capacity();
        StringBuilder sb4 = new StringBuilder(44);
        sb4.append("Buffer too small (");
        sb4.append(iCapacity);
        sb4.append(" < ");
        sb4.append(i13);
        sb4.append(")");
        throw new DecoderInputBuffer$InsufficientCapacityException(sb4.toString());
    }

    /* JADX INFO: renamed from: q */
    public final void m110918q(int i13) {
        ByteBuffer byteBuffer = this.f148801z;
        if (byteBuffer == null) {
            this.f148801z = m110917p(i13);
            return;
        }
        int iCapacity = byteBuffer.capacity();
        int iPosition = byteBuffer.position();
        int i14 = i13 + iPosition;
        if (iCapacity >= i14) {
            this.f148801z = byteBuffer;
            return;
        }
        ByteBuffer byteBufferM110917p = m110917p(i14);
        byteBufferM110917p.order(byteBuffer.order());
        if (iPosition > 0) {
            byteBuffer.flip();
            byteBufferM110917p.put(byteBuffer);
        }
        this.f148801z = byteBufferM110917p;
    }

    /* JADX INFO: renamed from: r */
    public final void m110919r() {
        ByteBuffer byteBuffer = this.f148801z;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f148798G;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
