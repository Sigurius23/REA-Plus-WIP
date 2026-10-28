package bh1;

import c93.InterfaceC4339a;
import ds2.C12348b;
import ho0.C17536e;
import java.util.Map;
import ni0.C26732c;
import p02.C28590b;
import r22.C30890b;
import rm0.C31585c;
import z12.C39997a;

/* JADX INFO: renamed from: bh1.a */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3249a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f12752w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Map f12753x;

    public /* synthetic */ C3249a(Map map, int i13) {
        this.f12752w = i13;
        this.f12753x = map;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f12752w) {
            case 0:
                return C3251c.m9424I(this.f12753x);
            case 1:
                return C3251c.m9451w(this.f12753x);
            case 2:
                return C12348b.m34549x(this.f12753x);
            case 3:
                return C17536e.m49805a0(this.f12753x);
            case 4:
                return C17536e.m49793P(this.f12753x);
            case 5:
                return C26732c.m79572l0(this.f12753x);
            case 6:
                return C28590b.m86970j(this.f12753x);
            case 7:
                return C30890b.m94967I(this.f12753x);
            case 8:
                return C31585c.m97324J(this.f12753x);
            default:
                return C39997a.m128233l(this.f12753x);
        }
    }
}
