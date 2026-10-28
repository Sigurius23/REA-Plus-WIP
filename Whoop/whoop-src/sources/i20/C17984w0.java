package i20;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import g40.C15369i3;
import l83.C23454a0;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.internal.AbstractC22676k;
import se.AbstractC32411b;

/* JADX INFO: renamed from: i20.w0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C17984w0 implements InterfaceC4352n {

    /* JADX INFO: renamed from: w */
    public static final C17984w0 f69822w = new C17984w0();

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        C28655q c28655q;
        boolean z4;
        Object objM87133R;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        InterfaceC4339a onBack = (InterfaceC4339a) obj2;
        Composer composer = (Composer) obj3;
        int iIntValue = ((Number) obj4).intValue();
        AbstractC22676k.m65750j(onBack, "onBack");
        if ((iIntValue & 6) == 0) {
            i13 = (((C28655q) composer).m87155h(zBooleanValue) ? 4 : 2) | iIntValue;
        } else {
            i13 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i13 |= ((C28655q) composer).m87157i(onBack) ? 32 : 16;
        }
        if ((i13 & 147) == 146) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c28655q = (C28655q) composer;
                c28655q.m87150e0(-628952840);
                if ((i13 & 112) == 32) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C15369i3(onBack, 20);
                    c28655q.m87172p0(objM87133R);
                }
                c28655q.m87173q(false);
                AbstractC32411b.m101083a(zBooleanValue, (InterfaceC4339a) objM87133R, c28655q, i13 & 14);
            }
        } else {
            c28655q = (C28655q) composer;
            c28655q.m87150e0(-628952840);
            if ((i13 & 112) == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            objM87133R = c28655q.m87133R();
            if (z4) {
                objM87133R = new C15369i3(onBack, 20);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C15369i3(onBack, 20);
                c28655q.m87172p0(objM87133R);
            }
            c28655q.m87173q(false);
            AbstractC32411b.m101083a(zBooleanValue, (InterfaceC4339a) objM87133R, c28655q, i13 & 14);
        }
        return C23454a0.f92919a;
    }
}
