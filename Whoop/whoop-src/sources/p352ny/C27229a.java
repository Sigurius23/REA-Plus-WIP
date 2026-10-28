package p352ny;

import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import l83.C23454a0;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC14981d1;
import p163g1.AbstractC15011f9;
import p163g1.AbstractC15044i9;
import p163g1.C14970c1;
import p163g1.C15033h9;
import p291l0.InterfaceC22997s1;
import p294l3.C23285v0;
import p390p1.C28655q;
import p392p3.C28780r;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: ny.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C27229a implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C27229a f109001w = new C27229a();

    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC22997s1 TextButton = (InterfaceC22997s1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(TextButton, "$this$TextButton");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(TextButton) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                C28655q c28655q2 = (C28655q) composer;
                AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_paymentsheet_tap_to_add), TextButton.mo66771a(C2314t.f9131w, C2299e.f9108K), ((C14970c1) c28655q2.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56282i, 0L, 0L, C28780r.f116540G, null, 0L, 0, 0L, null, null, 16777211), composer, 0, 0, 65528);
            }
        } else {
            C28655q c28655q3 = (C28655q) composer;
            AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_paymentsheet_tap_to_add), TextButton.mo66771a(C2314t.f9131w, C2299e.f9108K), ((C14970c1) c28655q3.m87161k(AbstractC14981d1.f55997a)).m43090e(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C23285v0.m67364b(((C15033h9) c28655q3.m87161k(AbstractC15044i9.f56319b)).f56282i, 0L, 0L, C28780r.f116540G, null, 0L, 0, 0L, null, null, 16777211), composer, 0, 0, 65528);
        }
        return C23454a0.f92919a;
    }
}
