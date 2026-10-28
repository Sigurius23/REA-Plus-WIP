package p292l1;

import androidx.compose.foundation.layout.AbstractC1102d;
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
import p040c0.AbstractC3760m1;
import p208i2.C17919x;
import p209i3.AbstractC18032n;
import p291l0.AbstractC22989q;
import p354o1.AbstractC27368g;
import p354o1.EnumC27375n;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.x0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23199x0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ boolean f91797E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ boolean f91798F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f91799w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ String f91800x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23204y f91801y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f91802z;

    public /* synthetic */ C23199x0(String str, C23204y c23204y, boolean z4, boolean z13, boolean z14, int i13) {
        this.f91799w = i13;
        this.f91800x = str;
        this.f91801y = c23204y;
        this.f91802z = z4;
        this.f91797E = z13;
        this.f91798F = z14;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        long j7;
        switch (this.f91799w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q = (C28655q) composer;
                if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f13 = AbstractC27368g.f109861g;
                    float f14 = AbstractC27368g.f109859e;
                    C2314t c2314t = C2314t.f9131w;
                    Modifier modifierM3416m = AbstractC1102d.m3416m(c2314t, f13, f14);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    int iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3416m);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                    Object objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C22881b(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM51774b = AbstractC18032n.m51774b(c2314t, (Function1) objM87133R);
                    C23204y c23204y = this.f91801y;
                    long j13 = c23204y.f91841o;
                    boolean z4 = this.f91797E;
                    boolean z13 = this.f91798F;
                    if (z4 && z13) {
                        j13 = c23204y.f91842p;
                    } else if (z4 && !z13) {
                        j13 = c23204y.f91843q;
                    } else if (this.f91802z && z13) {
                        j13 = c23204y.f91846t;
                    } else if (z13) {
                        j13 = c23204y.f91840n;
                    }
                    long j14 = j13;
                    c28655q.m87150e0(-969417610);
                    InterfaceC28670t2 interfaceC28670t2M11569a = AbstractC3760m1.m11569a(j14, AbstractC23124k3.m67109m(EnumC27375n.f109950y, c28655q), null, c28655q, 0, 12);
                    c28655q.m87173q(false);
                    AbstractC23149o4.m67128c(this.f91800x, modifierM51774b, ((C17919x) interfaceC28670t2M11569a.getValue()).f69639a, 0L, null, 0L, new C36775k(3), 0L, 0, false, 0, 0, null, c28655q, 0, 0, 261112);
                    c28655q.m87173q(true);
                } else {
                    c28655q.m87138X();
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer2;
                if (c28655q2.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3409f);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m2);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N2);
                    Object objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == C28635l.f115821a) {
                        objM87133R2 = new C22881b(9);
                        c28655q2.m87172p0(objM87133R2);
                    }
                    Modifier modifierM51774b2 = AbstractC18032n.m51774b(c2314t2, (Function1) objM87133R2);
                    C23204y c23204y2 = this.f91801y;
                    c23204y2.getClass();
                    boolean z14 = this.f91797E;
                    boolean z15 = this.f91798F;
                    if (z14 && z15) {
                        j7 = c23204y2.f91836j;
                    } else if (z14 && !z15) {
                        j7 = c23204y2.f91837k;
                    } else if (this.f91802z && z15) {
                        j7 = c23204y2.f91835i;
                    } else {
                        j7 = z15 ? c23204y2.f91833g : c23204y2.f91834h;
                    }
                    AbstractC23149o4.m67128c(this.f91800x, modifierM51774b2, ((C17919x) AbstractC3760m1.m11569a(j7, AbstractC23124k3.m67109m(EnumC27375n.f109950y, c28655q2), null, c28655q2, 0, 12).getValue()).f69639a, 0L, null, 0L, new C36775k(3), 0L, 0, false, 0, 0, null, c28655q2, 0, 0, 261112);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
