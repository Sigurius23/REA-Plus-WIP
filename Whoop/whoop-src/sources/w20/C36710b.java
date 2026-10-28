package w20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import l83.C23454a0;
import p163g1.AbstractC15005f3;
import p390p1.C28655q;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: w20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C36710b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C36710b f157190w = new C36710b();

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_close, composer, 0), null, null, 0L, composer, 48, 12);
            }
        } else {
            AbstractC15005f3.m43107a(AbstractC29125c.m88500I(R.drawable.stripe_ic_paymentsheet_close, composer, 0), null, null, 0L, composer, 48, 12);
        }
        return C23454a0.f92919a;
    }
}
