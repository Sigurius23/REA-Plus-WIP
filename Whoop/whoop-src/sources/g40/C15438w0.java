package g40;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: g40.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15438w0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f58022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f58023x;

    public /* synthetic */ C15438w0(long j7, int i13) {
        this.f58022w = i13;
        this.f58023x = j7;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f58022w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_chevron_down, composer, 0), null, AbstractC1102d.m3411h(24, C2314t.f9131w), this.f58023x, composer, 432, 0);
                    }
                } else {
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_chevron_down, composer, 0), null, AbstractC1102d.m3411h(24, C2314t.f9131w), this.f58023x, composer, 432, 0);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer2;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_close, composer2, 0), AbstractC30060g.m92103Y(composer2, R.string.stripe_paymentsheet_close), null, this.f58023x, composer2, 0, 4);
                    }
                } else {
                    AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_close, composer2, 0), AbstractC30060g.m92103Y(composer2, R.string.stripe_paymentsheet_close), null, this.f58023x, composer2, 0, 4);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
