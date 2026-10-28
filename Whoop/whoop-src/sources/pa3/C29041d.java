package pa3;

import ab3.C0714f;
import oa3.InterfaceC27771n;
import oa3.InterfaceC27772o;
import va3.C35845c;
import va3.C35850h;

/* JADX INFO: renamed from: pa3.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C29041d implements InterfaceC27771n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f117532w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C29043f f117533x;

    public /* synthetic */ C29041d(C29043f c29043f, int i13) {
        this.f117532w = i13;
        this.f117533x = c29043f;
    }

    /* JADX INFO: renamed from: a */
    private final void m88284a(C35850h c35850h, Object obj) {
    }

    /* JADX INFO: renamed from: b */
    private final void m88285b(C35850h c35850h, C0714f c0714f) {
    }

    /* JADX INFO: renamed from: c */
    private final void m88286c(C35850h c35850h, C0714f c0714f) {
    }

    /* JADX INFO: renamed from: d */
    private final void m88287d() {
    }

    /* JADX INFO: renamed from: e */
    private final void m88288e() {
    }

    /* JADX INFO: renamed from: f */
    private final void m88289f(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
    }

    /* JADX INFO: renamed from: g */
    private final void m88290g(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
    }

    @Override // oa3.InterfaceC27771n, oa3.InterfaceC27772o
    /* JADX INFO: renamed from: l */
    public final void mo195l() {
        int i13 = this.f117532w;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: m */
    public final InterfaceC27772o mo196m(C35850h c35850h) {
        switch (this.f117532w) {
            case 0:
                if ("b".equals(c35850h.m113817b())) {
                    return new C29042e(this, 2);
                }
                return null;
            default:
                String strM113817b = c35850h.m113817b();
                if ("data".equals(strM113817b) || "filePartClassNames".equals(strM113817b)) {
                    return new C29042e(this, 0);
                }
                if ("strings".equals(strM113817b)) {
                    return new C29042e(this, 1);
                }
                return null;
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: n */
    public final void mo197n(C35850h c35850h, C0714f c0714f) {
        int i13 = this.f117532w;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: p */
    public final void mo198p(C35850h c35850h, Object obj) {
        switch (this.f117532w) {
            case 0:
                break;
            default:
                String strM113817b = c35850h.m113817b();
                boolean zEquals = "version".equals(strM113817b);
                C29043f c29043f = this.f117533x;
                if (!zEquals) {
                    if ("multifileClassName".equals(strM113817b)) {
                        c29043f.f117543x = obj instanceof String ? (String) obj : null;
                    }
                } else if (obj instanceof int[]) {
                    c29043f.f117542w = (int[]) obj;
                }
                break;
        }
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: q */
    public final void mo199q(C35850h c35850h, C35845c c35845c, C35850h c35850h2) {
        int i13 = this.f117532w;
    }

    @Override // oa3.InterfaceC27771n
    /* JADX INFO: renamed from: s */
    public final InterfaceC27771n mo201s(C35845c c35845c, C35850h c35850h) {
        switch (this.f117532w) {
        }
        return null;
    }
}
