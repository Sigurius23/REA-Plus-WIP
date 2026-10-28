package b30;

import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import l83.C23454a0;
import p163g1.AbstractC15011f9;
import p291l0.InterfaceC22997s1;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: b30.d0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2499d0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C2499d0 f9739w = new C2499d0();

    /* JADX WARN: Code duplicated, block: B:8:0x0029  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC22997s1 Button = (InterfaceC22997s1) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(Button, "$this$Button");
        if ((iIntValue & 17) == 16) {
            C28655q c28655q = (C28655q) composer;
            if (c28655q.m87121F()) {
                c28655q.m87138X();
            } else {
                AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_continue_button_label), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
            }
        } else {
            AbstractC15011f9.m43114b(AbstractC30060g.m92103Y(composer, R.string.stripe_continue_button_label), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer, 0, 0, 131070);
        }
        return C23454a0.f92919a;
    }
}
