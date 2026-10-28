package xd3;

import c33.C3936c;
import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import ne3.C26616h;
import ne3.C26617h0;
import ne3.C26637r0;
import ne3.InterfaceC26620j;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: xd3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C38218a implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public boolean f163807w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC26620j f163808x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3936c f163809y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C26617h0 f163810z;

    public C38218a(InterfaceC26620j interfaceC26620j, C3936c c3936c, C26617h0 c26617h0) {
        this.f163808x = interfaceC26620j;
        this.f163809y = c3936c;
        this.f163810z = c26617h0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        boolean zM119140g;
        if (!this.f163807w) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC37174h.f158962a;
            AbstractC22676k.m65750j(timeUnit, "timeUnit");
            try {
                zM119140g = AbstractC37174h.m119140g(this, 100);
            } catch (IOException unused) {
                zM119140g = false;
            }
            if (!zM119140g) {
                this.f163807w = true;
                this.f163809y.m11984a();
            }
        }
        this.f163808x.close();
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public final long mo9164h1(C26616h sink, long j7) throws IOException {
        AbstractC22676k.m65750j(sink, "sink");
        try {
            long jMo9164h1 = this.f163808x.mo9164h1(sink, j7);
            C26617h0 c26617h0 = this.f163810z;
            if (jMo9164h1 != -1) {
                sink.m79214k(c26617h0.f105868x, sink.f105866x - jMo9164h1, jMo9164h1);
                c26617h0.m79237b();
                return jMo9164h1;
            }
            if (!this.f163807w) {
                this.f163807w = true;
                c26617h0.close();
            }
            return -1L;
        } catch (IOException e5) {
            if (this.f163807w) {
                throw e5;
            }
            this.f163807w = true;
            this.f163809y.m11984a();
            throw e5;
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f163808x.timeout();
    }
}
