package b30;

import androidx.compose.runtime.Composer;
import com.whoop.android.R;
import j00.C21123z;
import l83.C23454a0;
import p291l0.InterfaceC22997s1;
import p292l1.AbstractC23124k3;
import p330n1.C26115o;
import p354o1.EnumC27375n;
import p390p1.C28655q;
import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: b30.f3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2518f3 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9801w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f9802x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f9803y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f9804z;

    public C2518f3(C2550j3 c2550j3, boolean z4, long j7) {
        this.f9804z = c2550j3;
        this.f9802x = z4;
        this.f9803y = j7;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x007e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C2550j3 c2550j3;
        int i13;
        switch (this.f9801w) {
            case 0:
                InterfaceC22997s1 TopAppBar = (InterfaceC22997s1) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(TopAppBar, "$this$TopAppBar");
                if ((iIntValue & 17) == 16) {
                    C28655q c28655q = (C28655q) composer;
                    if (c28655q.m87121F()) {
                        c28655q.m87138X();
                    } else {
                        c2550j3 = (C2550j3) this.f9804z;
                        if (c2550j3.f9911b) {
                            if (c2550j3.f9912c) {
                                i13 = R.string.stripe_done;
                            } else {
                                i13 = R.string.stripe_edit;
                            }
                            AbstractC2526g3.m7462a(i13, this.f9802x, this.f9803y, c2550j3.f9913d, composer, 0);
                        }
                    }
                } else {
                    c2550j3 = (C2550j3) this.f9804z;
                    if (c2550j3.f9911b) {
                        if (c2550j3.f9912c) {
                            i13 = R.string.stripe_done;
                        } else {
                            i13 = R.string.stripe_edit;
                        }
                        AbstractC2526g3.m7462a(i13, this.f9802x, this.f9803y, c2550j3.f9913d, composer, 0);
                    }
                }
                break;
            default:
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    AbstractC29125c.m88520b(Boolean.valueOf(this.f9802x), null, AbstractC23124k3.m67109m(EnumC27375n.f109950y, c28655q2), null, AbstractC37817c.m121344e(-2064098104, c28655q2, new C21123z(this.f9803y, (C26115o) this.f9804z, 2)), c28655q2, 24576, 10);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }

    public C2518f3(boolean z4, long j7, C26115o c26115o) {
        this.f9802x = z4;
        this.f9803y = j7;
        this.f9804z = c26115o;
    }
}
