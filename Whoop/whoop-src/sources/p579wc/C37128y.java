package p579wc;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: wc.y */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37128y implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158846w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37084f0 f158847x;

    public /* synthetic */ C37128y(C37084f0 c37084f0, int i13) {
        this.f158846w = i13;
        this.f158847x = c37084f0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158846w) {
            case 0:
                return "using cached token for login-session: " + this.f158847x.f158646w;
            default:
                return "attempting to refresh token for login-session: " + this.f158847x.f158646w;
        }
    }
}
