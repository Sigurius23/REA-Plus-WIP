package ni0;

import ad3.AbstractC0757c;
import c93.InterfaceC4339a;
import zm0.C40888d;

/* JADX INFO: renamed from: ni0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C26731b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f106339w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC0757c f106340x;

    public /* synthetic */ C26731b(AbstractC0757c abstractC0757c, int i13) {
        this.f106339w = i13;
        this.f106340x = abstractC0757c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f106339w) {
            case 0:
                return C26732c.m79539Q(this.f106340x);
            case 1:
                return C26732c.m79578o0(this.f106340x);
            case 2:
                return C26732c.m79594w0(this.f106340x);
            default:
                return C40888d.m132512h(this.f106340x);
        }
    }
}
