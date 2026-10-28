package p389p0;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: p0.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C28553u0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f115522w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28555v0 f115523x;

    public /* synthetic */ C28553u0(C28555v0 c28555v0, int i13) {
        this.f115522w = i13;
        this.f115523x = c28555v0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f115522w) {
            case 0:
                return Float.valueOf(this.f115523x.f115526P.mo77522f());
            case 1:
                return Float.valueOf(this.f115523x.f115526P.mo77519c());
            default:
                C28555v0 c28555v0 = this.f115523x;
                return Float.valueOf(c28555v0.f115526P.mo77521e() - c28555v0.f115526P.mo77518b());
        }
    }
}
