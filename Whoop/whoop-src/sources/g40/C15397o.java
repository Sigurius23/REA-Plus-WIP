package g40;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p048ce.AbstractC4482w;
import p163g1.AbstractC15011f9;
import p390p1.C28655q;
import p390p1.InterfaceC28670t2;
import p547v8.AbstractC35785b;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;

/* JADX INFO: renamed from: g40.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C15397o implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f57851w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f57852x;

    public /* synthetic */ C15397o(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f57851w = i13;
        this.f57852x = interfaceC28670t2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a6  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f57851w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC4482w.m14005o(AbstractC35785b.m113396S((InterfaceC41211c) this.f57852x.getValue(), composer), null, composer, 0, 2);
                    }
                } else {
                    AbstractC4482w.m14005o(AbstractC35785b.m113396S((InterfaceC41211c) this.f57852x.getValue(), composer), null, composer, 0, 2);
                }
                return C23454a0.f92919a;
            case 1:
                ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) ((Composer) obj);
                c28655q2.m87150e0(-952056317);
                InterfaceC15361h1 interfaceC15361h1 = (InterfaceC15361h1) this.f57852x.getValue();
                C41210b c41210bMo43556b = interfaceC15361h1 != null ? interfaceC15361h1.mo43556b() : null;
                String strM113396S = c41210bMo43556b != null ? AbstractC35785b.m113396S(c41210bMo43556b, c28655q2) : null;
                c28655q2.m87173q(false);
                return strM113396S;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC15011f9.m43114b((String) this.f57852x.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                    }
                } else {
                    AbstractC15011f9.m43114b((String) this.f57852x.getValue(), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                }
                return C23454a0.f92919a;
        }
    }
}
