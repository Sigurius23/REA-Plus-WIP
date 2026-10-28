package p292l1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import kx1.C22881b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: l1.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C23180u implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91698w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f91699x;

    public /* synthetic */ C23180u(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f91698w = i13;
        this.f91699x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f91698w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    InterfaceC28601c1 interfaceC28601c1 = this.f91699x;
                    if (AbstractC39414r.m125890i0((CharSequence) interfaceC28601c1.getValue())) {
                        c28655q.m87150e0(-1548950640);
                    } else {
                        c28655q.m87150e0(-327061465);
                        AbstractC23149o4.m67128c((String) interfaceC28601c1.getValue(), null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, c28655q, 0, 0, 262142);
                    }
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    Object objM87133R = c28655q2.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22881b(16);
                        c28655q2.m87172p0(objM87133R);
                    }
                    Modifier modifierM51775c = AbstractC18032n.m51775c(C2314t.f9131w, false, (Function1) objM87133R);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM51775c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    AbstractC11895b.m32007z(0, (InterfaceC4351m) this.f91699x.getValue(), c28655q2, true);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
