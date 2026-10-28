package z72;

import c93.InterfaceC4339a;
import p132f0.C13821r1;
import p636y3.InterfaceC39171c;
import zd0.AbstractC40545b;

/* JADX INFO: renamed from: z72.c */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C40157c implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f173281w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC39171c f173282x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13821r1 f173283y;

    public /* synthetic */ C40157c(InterfaceC39171c interfaceC39171c, C13821r1 c13821r1, int i13) {
        this.f173281w = i13;
        this.f173282x = interfaceC39171c;
        this.f173283y = c13821r1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        float fM128828h0;
        switch (this.f173281w) {
            case 0:
                fM128828h0 = AbstractC40161g.m128828h0(this.f173282x, this.f173283y);
                break;
            default:
                fM128828h0 = AbstractC40545b.m131393r(this.f173282x, this.f173283y);
                break;
        }
        return Float.valueOf(fM128828h0);
    }
}
