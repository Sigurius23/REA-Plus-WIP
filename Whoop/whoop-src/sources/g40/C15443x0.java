package g40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import g00.AbstractC14936g;
import g00.C14931b;
import g00.C14934e;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p163g1.AbstractC15011f9;
import p294l3.C23285v0;
import p390p1.C28655q;
import p547v8.AbstractC35785b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: g40.x0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15443x0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58031w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC41211c f58032x;

    public /* synthetic */ C15443x0(InterfaceC41211c interfaceC41211c, int i13) {
        this.f58031w = i13;
        this.f58032x = interfaceC41211c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:19:0x009d  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58031w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC4482w.m14005o(AbstractC35785b.m113396S(this.f58032x, composer), null, composer, 0, 2);
                    }
                } else {
                    AbstractC4482w.m14005o(AbstractC35785b.m113396S(this.f58032x, composer), null, composer, 0, 2);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        String strM113396S = AbstractC35785b.m113396S(this.f58032x, composer2);
                        C28655q c28655q3 = (C28655q) composer2;
                        c28655q3.m87150e0(-1418551394);
                        C14934e c14934e = (C14934e) c28655q3.m87161k(AbstractC14936g.f55705b);
                        c28655q3.m87173q(false);
                        C23285v0 c23285v0 = c14934e.f55695b;
                        c28655q3.m87150e0(-443512897);
                        C14931b c14931b = (C14931b) c28655q3.m87161k(AbstractC14936g.f55706c);
                        c28655q3.m87173q(false);
                        AbstractC15011f9.m43114b(strM113396S, null, c14931b.f55674m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v0, composer2, 0, 0, 65530);
                    }
                } else {
                    String strM113396S2 = AbstractC35785b.m113396S(this.f58032x, composer2);
                    C28655q c28655q4 = (C28655q) composer2;
                    c28655q4.m87150e0(-1418551394);
                    C14934e c14934e2 = (C14934e) c28655q4.m87161k(AbstractC14936g.f55705b);
                    c28655q4.m87173q(false);
                    C23285v0 c23285v1 = c14934e2.f55695b;
                    c28655q4.m87150e0(-443512897);
                    C14931b c14931b2 = (C14931b) c28655q4.m87161k(AbstractC14936g.f55706c);
                    c28655q4.m87173q(false);
                    AbstractC15011f9.m43114b(strM113396S2, null, c14931b2.f55674m, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c23285v1, composer2, 0, 0, 65530);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
