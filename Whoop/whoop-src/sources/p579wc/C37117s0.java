package p579wc;

import c93.InterfaceC4339a;
import p319m4.AbstractC25012a;

/* JADX INFO: renamed from: wc.s0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C37117s0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f158793w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37113q0 f158794x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37127x0 f158795y;

    public /* synthetic */ C37117s0(C37113q0 c37113q0, C37127x0 c37127x0, int i13) {
        this.f158793w = i13;
        this.f158794x = c37113q0;
        this.f158795y = c37127x0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f158793w) {
            case 0:
                return "cached token is not refreshable but still valid until " + this.f158794x.f158773b + " for sso-session: " + this.f158795y.f158842w;
            default:
                StringBuilder sb4 = new StringBuilder("refresh token failed, original token is still valid until ");
                sb4.append(this.f158794x.f158773b);
                sb4.append(" for sso-session: ");
                return AbstractC25012a.m73376i(this.f158795y.f158842w, ", re-using", sb4);
        }
    }
}
