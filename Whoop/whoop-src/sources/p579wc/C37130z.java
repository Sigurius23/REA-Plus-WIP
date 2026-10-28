package p579wc;

import c93.InterfaceC4339a;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: wc.z */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37130z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158850w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37126x f158851x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37084f0 f158852y;

    public /* synthetic */ C37130z(C37126x c37126x, C37084f0 c37084f0, int i13) {
        this.f158850w = i13;
        this.f158851x = c37126x;
        this.f158852y = c37084f0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158850w) {
            case 0:
                return "cached token is not refreshable but still valid until " + this.f158851x.f158834f + " for login-session: " + this.f158852y.f158646w;
            default:
                StringBuilder sb4 = new StringBuilder("refresh token failed, original token is still valid until ");
                sb4.append(this.f158851x.f158834f);
                sb4.append(" for login-session: ");
                return AbstractC25012a.m73376i(this.f158852y.f158646w, ", re-using", sb4);
        }
    }
}
