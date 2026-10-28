package g40;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.android.R;
import h02.C16587n0;
import l83.C23454a0;
import p026b2.C2314t;
import p390p1.C28655q;

/* JADX INFO: renamed from: g40.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15354g0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C15354g0 f57727w = new C15354g0();

    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC15376j4.m43592h(new C15411q3(R.drawable.stripe_ic_chevron_down, true, (C16587n0) null, 10), false, AbstractC1102d.m3419p(8, C2314t.f9131w), composer, 432, 0);
            }
        } else {
            AbstractC15376j4.m43592h(new C15411q3(R.drawable.stripe_ic_chevron_down, true, (C16587n0) null, 10), false, AbstractC1102d.m3419p(8, C2314t.f9131w), composer, 432, 0);
        }
        return C23454a0.f92919a;
    }
}
