package p579wc;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: wc.r0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37115r0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158785w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37127x0 f158786x;

    public /* synthetic */ C37115r0(C37127x0 c37127x0, int i13) {
        this.f158785w = i13;
        this.f158786x = c37127x0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158785w) {
            case 0:
                return "using cached token for sso-session: " + this.f158786x.f158842w;
            default:
                return "attempting to refresh token for sso-session: " + this.f158786x.f158842w;
        }
    }
}
