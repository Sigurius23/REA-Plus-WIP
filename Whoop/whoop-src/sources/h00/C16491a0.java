package h00;

import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import d00.C11433l;
import java.util.List;
import l83.C23454a0;
import p040c0.InterfaceC3764o;
import p114eb.C12982q;
import p390p1.C28655q;
import p507tx.AbstractC34235f;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;

/* JADX INFO: renamed from: h00.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16491a0 implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63382w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f63383x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f63384y;

    public /* synthetic */ C16491a0(Object obj, Function1 function1, int i13) {
        this.f63382w = i13;
        this.f63383x = obj;
        this.f63384y = function1;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        switch (this.f63382w) {
            case 0:
                InterfaceC3764o composable = (InterfaceC3764o) obj;
                C12982q it = (C12982q) obj2;
                Composer composer = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(composable, "$this$composable");
                AbstractC22676k.m65750j(it, "it");
                C11433l c11433l = (C11433l) ((InterfaceC4339a) this.f63383x).invoke();
                Function1 function1 = this.f63384y;
                if (c11433l == null) {
                    function1.invoke(AbstractC34235f.m108230p());
                } else {
                    AbstractC34235f.m108224j(c11433l, function1, composer, 0);
                }
                break;
            case 1:
                InterfaceC3764o composable2 = (InterfaceC3764o) obj;
                C12982q it3 = (C12982q) obj2;
                Composer composer2 = (Composer) obj3;
                ((Number) obj4).intValue();
                AbstractC22676k.m65750j(composable2, "$this$composable");
                AbstractC22676k.m65750j(it3, "it");
                C11433l c11433l2 = (C11433l) ((InterfaceC4339a) this.f63383x).invoke();
                Function1 function2 = this.f63384y;
                if (c11433l2 == null) {
                    function2.invoke(AbstractC34235f.m108230p());
                } else {
                    AbstractC34235f.m108223i(c11433l2, function2, composer2, 0);
                }
                break;
            default:
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                int iIntValue = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i13 = (((C28655q) composer3).m87153g(interfaceC1103a) ? 4 : 2) | iIntValue2;
                } else {
                    i13 = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i13 |= ((C28655q) composer3).m87149e(iIntValue) ? 32 : 16;
                }
                C28655q c28655q = (C28655q) composer3;
                if (c28655q.m87135U(i13 & 1, (i13 & 147) != 146)) {
                    InterfaceC25312u interfaceC25312u = (InterfaceC25312u) ((List) this.f63383x).get(iIntValue);
                    c28655q.m87150e0(-853331663);
                    AbstractC25303l.m74291r(interfaceC25312u, null, null, this.f63384y, c28655q, 0, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
