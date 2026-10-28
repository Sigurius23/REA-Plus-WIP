package p328mj;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import com.amplitude.android.engagement.C4861a;
import l83.C23454a0;
import p026b2.C2320z;
import p291l0.InterfaceC23013y;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x43.AbstractC37978j;

/* JADX INFO: renamed from: mj.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C25599f extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C25600g f100433w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f100434x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25599f(C25600g c25600g, InterfaceC28601c1 interfaceC28601c1) {
        super(3);
        this.f100433w = c25600g;
        this.f100434x = interfaceC28601c1;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0040  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        InterfaceC28601c1 interfaceC28601c1;
        C28655q c28655q;
        boolean zM87153g;
        Object objM87133R;
        InterfaceC23013y ModalBottomSheet = (InterfaceC23013y) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(ModalBottomSheet, "$this$ModalBottomSheet");
        if ((iIntValue & 81) == 16) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                C25600g c25600g = this.f100433w;
                C4861a c4861a = c25600g.f100435a;
                interfaceC28601c1 = this.f100434x;
                C2320z c2320z = new C2320z(17, c25600g, interfaceC28601c1);
                c28655q = (C28655q) composer;
                zM87153g = c28655q.m87153g(interfaceC28601c1);
                objM87133R = c28655q.m87133R();
                if (zM87153g || objM87133R == C28635l.f115821a) {
                    objM87133R = new C25598e(2, interfaceC28601c1);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC37978j.m121645f(c4861a, c2320z, (InterfaceC4339a) objM87133R, c28655q, 8);
            }
        } else {
            C25600g c25600g2 = this.f100433w;
            C4861a c4861a2 = c25600g2.f100435a;
            interfaceC28601c1 = this.f100434x;
            C2320z c2320z2 = new C2320z(17, c25600g2, interfaceC28601c1);
            c28655q = (C28655q) composer;
            zM87153g = c28655q.m87153g(interfaceC28601c1);
            objM87133R = c28655q.m87133R();
            if (zM87153g) {
                objM87133R = new C25598e(2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25598e(2, interfaceC28601c1);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC37978j.m121645f(c4861a2, c2320z2, (InterfaceC4339a) objM87133R, c28655q, 8);
        }
        return C23454a0.f92919a;
    }
}
