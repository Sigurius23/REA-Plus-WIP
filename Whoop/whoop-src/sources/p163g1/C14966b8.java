package p163g1;

import a01.C0084d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p291l0.C23016z;
import p292l1.AbstractC23079d0;
import p292l1.AbstractC23138n;
import p292l1.AbstractC23215z4;
import p316m1.AbstractC24899e0;
import p354o1.AbstractC27369h;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p602x1.C37816b;
import p635y2.AbstractC39125q1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.b8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C14966b8 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55871w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37816b f55872x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4351m f55873y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37816b f55874z;

    public /* synthetic */ C14966b8(C37816b c37816b, InterfaceC4351m interfaceC4351m, C37816b c37816b2, int i13) {
        this.f55871w = i13;
        this.f55872x = c37816b;
        this.f55873y = interfaceC4351m;
        this.f55874z = c37816b2;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f55871w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    C37816b c37816b = this.f55872x;
                    boolean zM87153g = c28655q.m87153g(c37816b);
                    InterfaceC4351m interfaceC4351m = this.f55873y;
                    boolean zM87153g2 = zM87153g | c28655q.m87153g(interfaceC4351m);
                    C37816b c37816b2 = this.f55874z;
                    boolean zM87153g3 = zM87153g2 | c28655q.m87153g(c37816b2);
                    Object objM87133R = c28655q.m87133R();
                    if (zM87153g3 || objM87133R == C28635l.f115821a) {
                        objM87133R = new C0084d(c37816b, interfaceC4351m, c37816b2, 13);
                        c28655q.m87172p0(objM87133R);
                    }
                    AbstractC39125q1.m124656b(modifierM3409f, (InterfaceC4351m) objM87133R, c28655q, 6, 0);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90656g, C2299e.f9110M, c28655q2, 6);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, c2314t);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    C0209i c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
                    C0209i c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
                    C0209i c0209i3 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
                    }
                    C0209i c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
                    C23016z c23016z = C23016z.f90757a;
                    Modifier modifierM66779c = c23016z.m66779c(c2314t, false, 1.0f);
                    C2307m c2307m = C2299e.f9114w;
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM66779c);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
                    this.f55872x.invoke(c23016z, c28655q2, 6);
                    c28655q2.m87173q(true);
                    Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC23079d0.f91055a, c23016z.m66778b(c2314t, C2299e.f9112O));
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                    int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3393o);
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
                    AbstractC24899e0.m72995b(AbstractC23138n.m67118d(AbstractC27369h.f109881a, c28655q2), AbstractC23215z4.m67162a(AbstractC27369h.f109882b, c28655q2), AbstractC37817c.m121344e(-1103927529, c28655q2, new C15034i(this.f55873y, this.f55874z, 6)), c28655q2, 384);
                    c28655q2.m87173q(true);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
