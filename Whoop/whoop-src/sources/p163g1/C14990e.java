package p163g1;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.layout.AbstractC1131a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28596b0;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.e */
/* JADX INFO: loaded from: classes5.dex */
public final class C14990e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56052w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4351m f56053x;

    public /* synthetic */ C14990e(int i13, InterfaceC4351m interfaceC4351m) {
        this.f56052w = i13;
        this.f56053x = interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:82:0x01f9  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        switch (this.f56052w) {
            case 0:
                Composer composer = (Composer) obj;
                int iIntValue = ((Number) obj2).intValue();
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    AbstractC15011f9.m43113a(((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56280g, this.f56053x, c28655q2, 0);
                } else {
                    c28655q2.m87138X();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                C28655q c28655q3 = (C28655q) composer2;
                if (c28655q3.m87135U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    C28596b0 c28596b0 = AbstractC15047j1.f56336a;
                    long j7 = ((C17919x) c28655q3.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    AbstractC28683x.m87247a(c28596b0.mo86977a(Float.valueOf((!((C14970c1) c28655q3.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j7)) < 0.5d : ((double) AbstractC17918w0.m51536x(j7)) > 0.5d) ? 0.87f : 1.0f)), AbstractC37817c.m121344e(-1654653485, c28655q3, new C14990e(0, this.f56053x)), c28655q3, 56);
                } else {
                    c28655q3.m87138X();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                C28655q c28655q4 = (C28655q) composer3;
                if (c28655q4.m87135U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    AbstractC15011f9.m43113a(((C15033h9) c28655q4.m87161k(AbstractC15044i9.f56319b)).f56283j, this.f56053x, c28655q4, 0);
                } else {
                    c28655q4.m87138X();
                }
                break;
            case 3:
                Composer composer4 = (Composer) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                C28655q c28655q5 = (C28655q) composer4;
                if (c28655q5.m87135U(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    C28596b0 c28596b1 = AbstractC15047j1.f56336a;
                    long j13 = ((C17919x) c28655q5.m87161k(AbstractC15067l1.f56420a)).f69639a;
                    AbstractC28683x.m87247a(c28596b1.mo86977a(Float.valueOf((!((C14970c1) c28655q5.m87161k(AbstractC14981d1.f55997a)).m43094i() ? ((double) AbstractC17918w0.m51536x(j13)) < 0.5d : ((double) AbstractC17918w0.m51536x(j13)) > 0.5d) ? 0.6f : 0.74f)), AbstractC37817c.m121344e(-2126650894, c28655q5, new C14990e(2, this.f56053x)), c28655q5, 56);
                } else {
                    c28655q5.m87138X();
                }
                break;
            case 4:
                Composer composer5 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q6 = (C28655q) composer5;
                    if (c28655q6.m87121F()) {
                        c28655q6.m87138X();
                    } else {
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, true);
                        iM87266t = AbstractC28683x.m87266t(composer5);
                        c28655q = (C28655q) composer5;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer5, modifierM3409f);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer5, C0217k.f729g, interfaceC39127r0M66763d);
                        AbstractC28683x.m87239G(composer5, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer5, C0217k.f726d, modifierM118962N);
                        this.f56053x.invoke(composer5, 0);
                        c28655q.m87173q(true);
                    }
                } else {
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
                    InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, true);
                    iM87266t = AbstractC28683x.m87266t(composer5);
                    c28655q = (C28655q) composer5;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer5, modifierM3409f2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer5, C0217k.f729g, interfaceC39127r0M66763d2);
                    AbstractC28683x.m87239G(composer5, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer5, C0217k.f726d, modifierM118962N2);
                    this.f56053x.invoke(composer5, 0);
                    c28655q.m87173q(true);
                }
                break;
            case 5:
                Composer composer6 = (Composer) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                C28655q c28655q7 = (C28655q) composer6;
                if (c28655q7.m87135U(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q7.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q7.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q7, layoutWeightElement);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q7.m87158i0();
                    if (c28655q7.f115903S) {
                        c28655q7.m87163l(c0213j2);
                    } else {
                        c28655q7.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(c28655q7, C0217k.f728f, interfaceC28653p1M87165m3);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q7.f115903S || !AbstractC22676k.m65745e(c28655q7.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q7, iHashCode, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q7, C0217k.f726d, modifierM118962N3);
                    AbstractC11895b.m32007z(0, this.f56053x, c28655q7, true);
                } else {
                    c28655q7.m87138X();
                }
                break;
            case 6:
                Composer composer7 = (Composer) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                C28655q c28655q8 = (C28655q) composer7;
                if (c28655q8.m87135U(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9104G, false);
                    int iHashCode2 = Long.hashCode(c28655q8.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q8.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q8, C2314t.f9131w);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j3 = C0217k.f724b;
                    c28655q8.m87158i0();
                    if (c28655q8.f115903S) {
                        c28655q8.m87163l(c0213j3);
                    } else {
                        c28655q8.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q8, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q8, C0217k.f728f, interfaceC28653p1M87165m4);
                    C0209i c0209i3 = C0217k.f732j;
                    if (c28655q8.f115903S || !AbstractC22676k.m65745e(c28655q8.m87133R(), Integer.valueOf(iHashCode2))) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q8, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q8, C0217k.f726d, modifierM118962N4);
                    AbstractC11895b.m32007z(0, this.f56053x, c28655q8, true);
                } else {
                    c28655q8.m87138X();
                }
                break;
            default:
                Composer composer8 = (Composer) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                C28655q c28655q9 = (C28655q) composer8;
                if (c28655q9.m87135U(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Modifier modifierM3499c = AbstractC1131a.m3499c(C2314t.f9131w, "Container");
                    InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9114w, true);
                    int iHashCode3 = Long.hashCode(c28655q9.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q9.m87165m();
                    Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q9, modifierM3499c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j4 = C0217k.f724b;
                    c28655q9.m87158i0();
                    if (c28655q9.f115903S) {
                        c28655q9.m87163l(c0213j4);
                    } else {
                        c28655q9.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q9, C0217k.f729g, interfaceC39127r0M66763d5);
                    AbstractC28683x.m87239G(c28655q9, C0217k.f728f, interfaceC28653p1M87165m5);
                    C0209i c0209i4 = C0217k.f732j;
                    if (c28655q9.f115903S || !AbstractC22676k.m65745e(c28655q9.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q9, iHashCode3, c0209i4);
                    }
                    AbstractC28683x.m87239G(c28655q9, C0217k.f726d, modifierM118962N5);
                    AbstractC11895b.m32007z(0, this.f56053x, c28655q9, true);
                } else {
                    c28655q9.m87138X();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
