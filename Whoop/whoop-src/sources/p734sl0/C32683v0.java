package p734sl0;

import android.content.Context;
import c93.InterfaceC4339a;
import p163g1.C15199y3;
import p164g2.InterfaceC15237i;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: sl0.v0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32683v0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135690w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f135691x;

    public /* synthetic */ C32683v0(Object obj, int i13) {
        this.f135690w = i13;
        this.f135691x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135690w) {
            case 0:
                return AbstractC32679u0.b.m102416h((C15199y3) this.f135691x);
            case 1:
                return Float.valueOf(AbstractC32697y2.a.m102600h((InterfaceC28670t2) this.f135691x));
            case 2:
                return AbstractC32669s.m102285f((Context) this.f135691x);
            case 3:
                return AbstractC32650o0.m102082t((InterfaceC15237i) this.f135691x);
            default:
                return AbstractC32597d2.m101678G((InterfaceC32666r1) this.f135691x);
        }
    }
}
