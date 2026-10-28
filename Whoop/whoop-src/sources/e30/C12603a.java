package e30;

import c93.InterfaceC4339a;
import h20.EnumC16762x2;
import k20.C22136a;
import l83.C23454a0;
import p499t9.C33623c0;
import v00.C35459c0;
import y00.C38840g6;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: e30.a */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C12603a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42996w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC12605c f42997x;

    public /* synthetic */ C12603a(AbstractC12605c abstractC12605c, int i13) {
        this.f42996w = i13;
        this.f42997x = abstractC12605c;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f42996w;
        AbstractC12605c abstractC12605c = this.f42997x;
        switch (i13) {
            case 0:
                return abstractC12605c.m35329l();
            case 1:
                return abstractC12605c.mo35330n();
            case 2:
                return Boolean.valueOf(abstractC12605c.m35331o() != EnumC16762x2.f64427w);
            case 3:
                C35459c0 c35459c0 = (C35459c0) abstractC12605c.f43008L.getValue();
                return Boolean.valueOf((c35459c0 != null ? c35459c0.f150996w : null) instanceof C38840g6);
            default:
                C22136a c22136a = abstractC12605c.f43026x;
                C33623c0 c33623c0 = EnumC38828f4.f167088G;
                c22136a.m63394n("us_bank_account");
                return C23454a0.f92919a;
        }
    }
}
