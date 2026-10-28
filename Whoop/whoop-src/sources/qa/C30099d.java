package qa;

import java.util.List;
import mm.C25680d;
import p010a9.AbstractC0581f;
import p187h9.C17018b;
import p455ra.AbstractC31177h;

/* JADX INFO: renamed from: qa.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C30099d extends AbstractC0581f implements InterfaceC30100e {

    /* JADX INFO: renamed from: E */
    public InterfaceC30100e f122826E;

    /* JADX INFO: renamed from: F */
    public long f122827F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ int f122828G = 1;

    /* JADX INFO: renamed from: H */
    public Object f122829H;

    public /* synthetic */ C30099d() {
        super(0);
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: b */
    public final int mo1673b(long j7) {
        InterfaceC30100e interfaceC30100e = this.f122826E;
        interfaceC30100e.getClass();
        return interfaceC30100e.mo1673b(j7 - this.f122827F);
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: d */
    public final List mo1674d(long j7) {
        InterfaceC30100e interfaceC30100e = this.f122826E;
        interfaceC30100e.getClass();
        return interfaceC30100e.mo1674d(j7 - this.f122827F);
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: h */
    public final long mo1675h(int i13) {
        InterfaceC30100e interfaceC30100e = this.f122826E;
        interfaceC30100e.getClass();
        return interfaceC30100e.mo1675h(i13) + this.f122827F;
    }

    @Override // qa.InterfaceC30100e
    /* JADX INFO: renamed from: j */
    public final int mo1676j() {
        InterfaceC30100e interfaceC30100e = this.f122826E;
        interfaceC30100e.getClass();
        return interfaceC30100e.mo1676j();
    }

    @Override // p010a9.AbstractC0581f
    /* JADX INFO: renamed from: o */
    public final void mo1510o() {
        this.f2052x = 0;
        this.f2070y = 0L;
        this.f2071z = false;
        this.f122826E = null;
    }

    @Override // p010a9.AbstractC0581f
    /* JADX INFO: renamed from: p */
    public final void mo1511p() {
        switch (this.f122828G) {
            case 0:
                ((C17018b) this.f122829H).m48001k(this);
                break;
            default:
                AbstractC31177h abstractC31177h = (AbstractC31177h) ((C25680d) this.f122829H).f101015x;
                abstractC31177h.getClass();
                mo1510o();
                abstractC31177h.f128467b.add(this);
                break;
        }
    }

    public C30099d(C17018b c17018b) {
        super(0);
        this.f122829H = c17018b;
    }
}
