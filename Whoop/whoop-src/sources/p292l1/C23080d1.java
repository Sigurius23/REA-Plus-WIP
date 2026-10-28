package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4339a;
import c93.InterfaceC4352n;
import com.whoop.android.R;
import dn0.C12212l;
import i93.C18284j;
import java.util.Arrays;
import l83.C23454a0;
import p026b2.C2314t;
import p316m1.AbstractC24899e0;
import p316m1.AbstractC24917o;
import p354o1.AbstractC27368g;
import p390p1.C28635l;
import p390p1.C28655q;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: l1.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23080d1 implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Function1 f91058E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ InterfaceC23142n3 f91059F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C23204y f91060G;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C18284j f91061w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractC24917o f91062x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ int f91063y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ int f91064z;

    public C23080d1(C18284j c18284j, AbstractC24917o abstractC24917o, int i13, int i14, Function1 function1, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y) {
        this.f91061w = c18284j;
        this.f91062x = abstractC24917o;
        this.f91063y = i13;
        this.f91064z = i14;
        this.f91058E = function1;
        this.f91059F = interfaceC23142n3;
        this.f91060G = c23204y;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 48) == 0) {
            iIntValue2 |= ((C28655q) composer).m87149e(iIntValue) ? 32 : 16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
            int i13 = iIntValue + this.f91061w.f71133w;
            String strM67093a = AbstractC23114j.m67093a(i13, this.f91062x.f97593a);
            Modifier modifierM3416m = AbstractC1102d.m3416m(C2314t.f9131w, AbstractC27368g.f109880z, AbstractC27368g.f109879y);
            boolean z4 = i13 == this.f91063y;
            boolean z13 = i13 == this.f91064z;
            Function1 function1 = this.f91058E;
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87149e(i13);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C12212l(function1, i13, 3);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC23092f1.m67079m(strM67093a, modifierM3416m, z4, z13, (InterfaceC4339a) objM87133R, this.f91059F.isSelectableYear(i13), String.format(AbstractC24899e0.m73002i(c28655q, R.string.m3c_date_picker_navigate_to_year_description), Arrays.copyOf(new Object[]{strM67093a}, 1)), this.f91060G, c28655q, 48);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
