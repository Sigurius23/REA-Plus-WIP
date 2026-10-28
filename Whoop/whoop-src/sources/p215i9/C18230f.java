package p215i9;

import java.nio.ByteBuffer;
import p010a9.C0580e;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: i9.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C18230f extends C0580e {

    /* JADX INFO: renamed from: J */
    public long f70939J;

    /* JADX INFO: renamed from: K */
    public int f70940K;

    /* JADX INFO: renamed from: L */
    public int f70941L;

    @Override // p010a9.C0580e
    /* JADX INFO: renamed from: o */
    public final void mo1506o() {
        super.mo1506o();
        this.f70940K = 0;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m52499s(C0580e c0580e) {
        ByteBuffer byteBuffer;
        AbstractC35849g.m113802d(!c0580e.m1496f(1073741824));
        AbstractC35849g.m113802d(!c0580e.m1496f(268435456));
        AbstractC35849g.m113802d(!c0580e.m1496f(4));
        if (m52500t()) {
            if (this.f70940K >= this.f70941L) {
                return false;
            }
            ByteBuffer byteBuffer2 = c0580e.f2063E;
            if (byteBuffer2 != null && (byteBuffer = this.f2063E) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i13 = this.f70940K;
        this.f70940K = i13 + 1;
        if (i13 == 0) {
            this.f2065G = c0580e.f2065G;
            if (c0580e.m1496f(1)) {
                this.f2052x = 1;
            }
        }
        ByteBuffer byteBuffer3 = c0580e.f2063E;
        if (byteBuffer3 != null) {
            m1508q(byteBuffer3.remaining());
            this.f2063E.put(byteBuffer3);
        }
        this.f70939J = c0580e.f2065G;
        return true;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m52500t() {
        return this.f70940K > 0;
    }
}
