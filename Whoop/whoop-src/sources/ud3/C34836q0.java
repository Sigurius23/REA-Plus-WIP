package ud3;

import java.io.IOException;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.InterfaceC26618i;
import ne3.InterfaceC26633p0;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: ud3.q0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C34836q0 extends AbstractC34846v0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C34818h0 f146721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC26632p f146722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C26611e0 f146723c;

    public C34836q0(C26611e0 c26611e0, AbstractC26632p abstractC26632p, C34818h0 c34818h0) {
        this.f146721a = c34818h0;
        this.f146722b = abstractC26632p;
        this.f146723c = c26611e0;
    }

    @Override // ud3.AbstractC34846v0
    public final long contentLength() {
        Long l7 = (Long) this.f146722b.m79271T(this.f146723c).f104375e;
        if (l7 != null) {
            return l7.longValue();
        }
        return -1L;
    }

    @Override // ud3.AbstractC34846v0
    /* JADX INFO: renamed from: contentType */
    public final C34818h0 getContentType() {
        return this.f146721a;
    }

    @Override // ud3.AbstractC34846v0
    public final void writeTo(InterfaceC26618i interfaceC26618i) throws IOException {
        InterfaceC26633p0 interfaceC26633p0Mo79155x0 = this.f146722b.mo79155x0(this.f146723c);
        try {
            interfaceC26618i.mo79189N0(interfaceC26633p0Mo79155x0);
            interfaceC26633p0Mo79155x0.close();
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC35854l.m113829i(interfaceC26633p0Mo79155x0, th3);
                throw th4;
            }
        }
    }
}
