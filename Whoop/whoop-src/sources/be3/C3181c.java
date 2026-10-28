package be3;

import java.io.IOException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34810e0;
import wd3.AbstractC37174h;

/* JADX INFO: renamed from: be3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3181c extends AbstractC3179a {

    /* JADX INFO: renamed from: E */
    public long f12477E;

    /* JADX INFO: renamed from: F */
    public boolean f12478F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C3185g f12479G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3181c(C3185g c3185g, C34810e0 url) {
        super(c3185g, url);
        AbstractC22676k.m65750j(url, "url");
        this.f12479G = c3185g;
        this.f12477E = -1L;
        this.f12478F = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zM119140g;
        if (this.f12472y) {
            return;
        }
        if (this.f12478F) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = AbstractC37174h.f158962a;
            AbstractC22676k.m65750j(timeUnit, "timeUnit");
            try {
                zM119140g = AbstractC37174h.m119140g(this, 100);
            } catch (IOException unused) {
                zM119140g = false;
            }
            if (!zM119140g) {
                this.f12479G.f12489b.mo1920c();
                m9163b(C3185g.f12487f);
            }
        }
        this.f12472y = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ff, code lost:
    
        if (r17.f12478F == false) goto L55;
     */
    @Override // be3.AbstractC3179a, ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long mo9164h1(ne3.C26616h r18, long r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: be3.C3181c.mo9164h1(ne3.h, long):long");
    }
}
