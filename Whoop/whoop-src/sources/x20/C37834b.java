package x20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: x20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C37834b implements InterfaceC4351m {

    /* JADX INFO: renamed from: x */
    public static final C37834b f161993x = new C37834b(0);

    /* JADX INFO: renamed from: y */
    public static final C37834b f161994y = new C37834b(1);

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f161995w;

    public /* synthetic */ C37834b(int i13) {
        this.f161995w = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f161995w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_back, composer2, 0), AbstractC30060g.m92103Y(composer2, R.string.stripe_back), null, 0L, composer2, 0, 12);
                    }
                } else {
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_back, composer2, 0), AbstractC30060g.m92103Y(composer2, R.string.stripe_back), null, 0L, composer2, 0, 12);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
