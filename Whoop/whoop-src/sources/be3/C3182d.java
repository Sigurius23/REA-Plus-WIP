package be3;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ne3.C26616h;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import ud3.C34810e0;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: be3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C3182d extends AbstractC3179a {

    /* JADX INFO: renamed from: E */
    public long f12480E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C3185g f12481F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182d(C3185g c3185g, C34810e0 url, long j7) {
        super(c3185g, url);
        AbstractC22676k.m65750j(url, "url");
        this.f12481F = c3185g;
        this.f12480E = j7;
        if (j7 == 0) {
            m9163b(C34807d0.f146547x);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM119140g;
        if (this.f12472y) {
            return;
        }
        if (this.f12480E != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC37174h.f158962a;
            AbstractC22676k.m65750j(timeUnit, "timeUnit");
            try {
                zM119140g = AbstractC37174h.m119140g(this, 100);
            } catch (IOException unused) {
                zM119140g = false;
            }
            if (!zM119140g) {
                this.f12481F.f12489b.mo1920c();
                m9163b(C3185g.f12487f);
            }
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
        long j13 = this.f12480E;
        if (j13 == 0) {
            return -1L;
        }
        long jMo9164h1 = super.mo9164h1(sink, Math.min(j13, j7));
        if (jMo9164h1 == -1) {
            this.f12481F.f12489b.mo1920c();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m9163b(C3185g.f12487f);
            throw protocolException;
        }
        long j14 = this.f12480E - jMo9164h1;
        this.f12480E = j14;
        if (j14 == 0) {
            m9163b(C34807d0.f146547x);
        }
        return jMo9164h1;
    }
}
