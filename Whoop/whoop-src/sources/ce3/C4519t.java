package ce3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import ne3.C26616h;
import ne3.C26624l;
import ne3.C26637r0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import wd3.AbstractC37172f;

/* JADX INFO: renamed from: ce3.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C4519t implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: E */
    public int f18218E;

    /* JADX INFO: renamed from: F */
    public int f18219F;

    /* JADX INFO: renamed from: w */
    public final InterfaceC26620j f18220w;

    /* JADX INFO: renamed from: x */
    public int f18221x;

    /* JADX INFO: renamed from: y */
    public int f18222y;

    /* JADX INFO: renamed from: z */
    public int f18223z;

    public C4519t(InterfaceC26620j source) {
        AbstractC22676k.m65750j(source, "source");
        this.f18220w = source;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        int i13;
        int i14;
        AbstractC22676k.m65750j(sink, "sink");
        do {
            int i15 = this.f18218E;
            InterfaceC26620j interfaceC26620j = this.f18220w;
            if (i15 == 0) {
                interfaceC26620j.skip(this.f18219F);
                this.f18219F = 0;
                if ((this.f18222y & 4) == 0) {
                    i13 = this.f18223z;
                    int iM119130o = AbstractC37172f.m119130o(interfaceC26620j);
                    this.f18218E = iM119130o;
                    this.f18221x = iM119130o;
                    int i16 = interfaceC26620j.readByte() & 255;
                    this.f18222y = interfaceC26620j.readByte() & 255;
                    Logger logger = C4520u.f18224z;
                    if (logger.isLoggable(Level.FINE)) {
                        C26624l c26624l = AbstractC4506g.f18154a;
                        logger.fine(AbstractC4506g.m14128b(this.f18223z, this.f18221x, i16, this.f18222y, true));
                    }
                    i14 = interfaceC26620j.readInt() & Integer.MAX_VALUE;
                    this.f18223z = i14;
                    if (i16 != 9) {
                        throw new IOException(AbstractC31061c.m95635k(i16, " != TYPE_CONTINUATION"));
                    }
                }
            } else {
                long jMo9164h1 = interfaceC26620j.mo9164h1(sink, Math.min(j7, i15));
                if (jMo9164h1 != -1) {
                    this.f18218E -= (int) jMo9164h1;
                    return jMo9164h1;
                }
            }
            return -1L;
        } while (i14 == i13);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f18220w.timeout();
    }
}
