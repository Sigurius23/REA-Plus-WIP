package be3;

import ae3.AbstractC0800h;
import java.io.IOException;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26637r0;
import ne3.C26640t;
import ne3.InterfaceC26633p0;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34807d0;
import ud3.C34810e0;
import ud3.C34826l0;
import ud3.C34841t;

/* JADX INFO: renamed from: be3.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3179a implements InterfaceC26633p0 {

    /* JADX INFO: renamed from: w */
    public final C34810e0 f12470w;

    /* JADX INFO: renamed from: x */
    public final C26640t f12471x;

    /* JADX INFO: renamed from: y */
    public boolean f12472y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3185g f12473z;

    public AbstractC3179a(C3185g c3185g, C34810e0 url) {
        AbstractC22676k.m65750j(url, "url");
        this.f12473z = c3185g;
        this.f12470w = url;
        this.f12471x = new C26640t(((C26621j0) c3185g.f12490c.f132769x).f105871w.timeout());
    }

    /* JADX INFO: renamed from: b */
    public final void m9163b(C34807d0 trailers) {
        C34826l0 c34826l0;
        C34841t c34841t;
        AbstractC22676k.m65750j(trailers, "trailers");
        C3185g c3185g = this.f12473z;
        int i13 = c3185g.f12491d;
        if (i13 == 6) {
            return;
        }
        if (i13 != 5) {
            throw new IllegalStateException("state: " + c3185g.f12491d);
        }
        C26640t c26640t = this.f12471x;
        C26637r0 c26637r0 = c26640t.f105912e;
        c26640t.f105912e = C26637r0.f105903d;
        c26637r0.mo79278a();
        c26637r0.mo79279b();
        c3185g.f12491d = 6;
        if (trailers.size() <= 0 || (c34826l0 = c3185g.f12488a) == null || (c34841t = c34826l0.f146658j) == null) {
            return;
        }
        AbstractC0800h.m1936d(c34841t, this.f12470w, trailers);
    }

    @Override // ne3.InterfaceC26633p0
    /* JADX INFO: renamed from: h1 */
    public long mo9164h1(C26616h sink, long j7) throws IOException {
        C3185g c3185g = this.f12473z;
        AbstractC22676k.m65750j(sink, "sink");
        try {
            return ((C26621j0) c3185g.f12490c.f132769x).mo9164h1(sink, j7);
        } catch (IOException e5) {
            c3185g.f12489b.mo1920c();
            m9163b(C3185g.f12487f);
            throw e5;
        }
    }

    @Override // ne3.InterfaceC26633p0
    public final C26637r0 timeout() {
        return this.f12471x;
    }
}
