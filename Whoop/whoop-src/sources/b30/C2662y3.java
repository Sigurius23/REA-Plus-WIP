package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import g11.AbstractC15219c;
import i20.AbstractC17960l1;
import l83.C23454a0;
import mf0.AbstractC25506e;
import p390p1.AbstractC28683x;
import s80.AbstractC32255c;
import se.AbstractC32416g;

/* JADX INFO: renamed from: b30.y3 */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2662y3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10424w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f10425x;

    public /* synthetic */ C2662y3(int i13, int i14, InterfaceC4339a interfaceC4339a) {
        this.f10424w = i14;
        this.f10425x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        Integer num = (Integer) obj2;
        switch (this.f10424w) {
            case 0:
                num.getClass();
                AbstractC2495c4.m7454a(this.f10425x, composer, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 1:
                num.getClass();
                AbstractC2495c4.m7458e(this.f10425x, composer, AbstractC28683x.m87244L(7));
                return C23454a0.f92919a;
            case 2:
                return AbstractC15219c.m43272v(this.f10425x, composer, num.intValue());
            case 3:
                num.getClass();
                AbstractC32416g.m101148e(this.f10425x, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 4:
                num.getClass();
                AbstractC17960l1.m51580g(this.f10425x, composer, AbstractC28683x.m87244L(1));
                return C23454a0.f92919a;
            case 5:
                return AbstractC25506e.m74959l0(this.f10425x, composer, num.intValue());
            default:
                return AbstractC32255c.m100373u(this.f10425x, composer, num.intValue());
        }
    }

    public /* synthetic */ C2662y3(InterfaceC4339a interfaceC4339a, int i13) {
        this.f10424w = i13;
        this.f10425x = interfaceC4339a;
    }
}
