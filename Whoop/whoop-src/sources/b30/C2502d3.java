package b30;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import pf.AbstractC29125c;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b30.d3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2502d3 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean f9750w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f9751x;

    public C2502d3(boolean z4, long j7) {
        this.f9750w = z4;
        this.f9751x = j7;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029  */
    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        boolean z4;
        int i13;
        int i14;
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                z4 = this.f9750w;
                if (z4) {
                    i13 = R.drawable.stripe_ic_paymentsheet_back;
                } else {
                    i13 = R.drawable.stripe_ic_paymentsheet_close;
                }
                if (z4) {
                    i14 = R.string.stripe_back;
                } else {
                    i14 = R.string.stripe_paymentsheet_close;
                }
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(i13, composer, 0), AbstractC30060g.m92103Y(composer, i14), null, this.f9751x, composer, 0, 4);
            }
        } else {
            z4 = this.f9750w;
            if (z4) {
                i13 = R.drawable.stripe_ic_paymentsheet_back;
            } else {
                i13 = R.drawable.stripe_ic_paymentsheet_close;
            }
            if (z4) {
                i14 = R.string.stripe_back;
            } else {
                i14 = R.string.stripe_paymentsheet_close;
            }
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(i13, composer, 0), AbstractC30060g.m92103Y(composer, i14), null, this.f9751x, composer, 0, 4);
        }
        return C23454a0.f92919a;
    }
}
