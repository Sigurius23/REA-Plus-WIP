package p163g1;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p132f0.EnumC13840z0;
import p180h0.InterfaceC16392g1;
import p180h0.InterfaceC16427n1;
import p316m1.C24902g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: g1.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C15205z implements InterfaceC16427n1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57090a = 0;

    /* JADX INFO: renamed from: b */
    public final InterfaceC16392g1 f57091b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57092c;

    public C15205z(C24902g c24902g) {
        this.f57092c = c24902g;
        this.f57091b = new C15195y(c24902g, 2);
    }

    @Override // p180h0.InterfaceC16427n1
    /* JADX INFO: renamed from: a */
    public final Object mo29022a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        switch (this.f57090a) {
            case 0:
                Object objM43066a = ((C14947a0) this.f57092c).m43066a(enumC13840z0, new C15185x(this, interfaceC4351m, null), interfaceC30057d);
                return objM43066a == EnumC31071a.f128113w ? objM43066a : C23454a0.f92919a;
            default:
                Object objM73005a = ((C24902g) this.f57092c).m73005a(enumC13840z0, new C15185x(this, interfaceC4351m, null, (byte) 0), interfaceC30057d);
                return objM73005a == EnumC31071a.f128113w ? objM73005a : C23454a0.f92919a;
        }
    }

    public C15205z(C14947a0 c14947a0) {
        this.f57092c = c14947a0;
        this.f57091b = new C15195y(c14947a0, 0);
    }
}
