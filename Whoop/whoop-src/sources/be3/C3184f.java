package be3;

import java.io.IOException;
import ne3.C26616h;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;

/* JADX INFO: renamed from: be3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C3184f extends AbstractC3179a {

    /* JADX INFO: renamed from: E */
    public boolean f12486E;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f12472y) {
            return;
        }
        if (!this.f12486E) {
            m9163b(C3185g.f12487f);
        }
        this.f12472y = true;
    }

    @Override // be3.AbstractC3179a, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        if (j7 < 0) {
            throw new IllegalArgumentException(AbstractC11895b.m31994m(j7, "byteCount < 0: ").toString());
        }
        if (this.f12472y) {
            throw new IllegalStateException("closed");
        }
        if (this.f12486E) {
            return -1L;
        }
        long jMo9164h1 = super.mo9164h1(sink, j7);
        if (jMo9164h1 != -1) {
            return jMo9164h1;
        }
        this.f12486E = true;
        m9163b(C34807d0.f146547x);
        return -1L;
    }
}
