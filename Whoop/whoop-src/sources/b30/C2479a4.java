package b30;

import android.os.Bundle;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.stripe.android.link.NoPaymentDetailsFoundException;
import i20.InterfaceC17929b0;
import l83.C23454a0;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.C28655q;
import p507tx.AbstractC34235f;
import p599wz.C37701a1;
import p599wz.C37702b;
import p599wz.C37741o;
import p602x1.C37816b;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b30.a4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2479a4 implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9656w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9657x;

    public /* synthetic */ C2479a4(Object obj, int i13) {
        this.f9656w = i13;
        this.f9657x = obj;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009b  */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        String string;
        int i13;
        switch (this.f9656w) {
            case 0:
                InterfaceC3764o AnimatedContent = (InterfaceC3764o) obj;
                Boolean bool = (Boolean) obj2;
                bool.getClass();
                int iIntValue = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(AnimatedContent, "$this$AnimatedContent");
                ((C37816b) this.f9657x).invoke(bool, (Composer) obj3, Integer.valueOf((iIntValue >> 3) & 14));
                break;
            case 1:
                InterfaceC3764o composable = (InterfaceC3764o) obj;
                C12982q backStackEntry = (C12982q) obj2;
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                Function1 function1 = (Function1) this.f9657x;
                AbstractC22676k.m65750j(composable, "$this$composable");
                AbstractC22676k.m65750j(backStackEntry, "backStackEntry");
                Bundle bundleM36479a = backStackEntry.m36479a();
                if (bundleM36479a == null || (string = bundleM36479a.getString("payment_details")) == null) {
                    function1.invoke(new C37741o(new NoPaymentDetailsFoundException(), C37702b.f161559w));
                } else {
                    Bundle bundleM36479a2 = backStackEntry.m36479a();
                    C37701a1 c37701a1 = null;
                    if (bundleM36479a2 != null && Boolean.parseBoolean(bundleM36479a2.getString("is_billing_update_flow"))) {
                        c37701a1 = new C37701a1(bundleM36479a2.getString("billing_update_cvc"));
                    }
                    AbstractC34235f.m108227m(string, c37701a1, function1, composer, 0);
                }
                break;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                InterfaceC4339a onBack = (InterfaceC4339a) obj2;
                Composer composer2 = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                AbstractC22676k.m65750j(onBack, "onBack");
                if ((iIntValue2 & 6) == 0) {
                    i13 = (((C28655q) composer2).m87155h(zBooleanValue) ? 4 : 2) | iIntValue2;
                } else {
                    i13 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i13 |= ((C28655q) composer2).m87157i(onBack) ? 32 : 16;
                }
                if ((i13 & 147) == 146) {
                    C28655q c28655q = (C28655q) composer2;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        ((InterfaceC17929b0) this.f9657x).mo51567B(zBooleanValue, onBack, composer2, i13 & 126);
                    }
                } else {
                    ((InterfaceC17929b0) this.f9657x).mo51567B(zBooleanValue, onBack, composer2, i13 & 126);
                }
                break;
            default:
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue3 = ((Number) obj4).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= ((C28655q) composer3).m87153g(interfaceC1103a) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer3;
                if (c28655q2.m87135U(iIntValue3 & 1, (iIntValue3 & 131) != 130)) {
                    ((Function3) this.f9657x).invoke(interfaceC1103a, c28655q2, Integer.valueOf(iIntValue3 & 14));
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
