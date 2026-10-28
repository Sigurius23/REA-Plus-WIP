package p163g1;

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
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28601c1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p558vp.AbstractC36259c;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: g1.m8 */
/* JADX INFO: loaded from: classes5.dex */
public final class C15084m8 implements Function3 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ InterfaceC4351m f56472E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f56473w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f56474x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC14999e8 f56475y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean f56476z;

    public /* synthetic */ C15084m8(float f13, InterfaceC14999e8 interfaceC14999e8, boolean z4, InterfaceC4351m interfaceC4351m, int i13) {
        this.f56473w = i13;
        this.f56474x = f13;
        this.f56475y = interfaceC14999e8;
        this.f56476z = z4;
        this.f56472E = interfaceC4351m;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:25:0x008a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a3  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        C15197y1 c15197y1;
        long j7;
        switch (this.f56473w) {
            case 0:
                Modifier modifier = (Modifier) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= ((C28655q) composer).m87153g(modifier) ? 4 : 2;
                }
                C28655q c28655q2 = (C28655q) composer;
                if (c28655q2.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    Modifier modifierM107879c = AbstractC34132o.m107879c(this.f56474x, modifier);
                    InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    int iHashCode = Long.hashCode(c28655q2.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM107879c);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q2.m87158i0();
                    if (c28655q2.f115903S) {
                        c28655q2.m87163l(c0213j2);
                    } else {
                        c28655q2.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                    AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                    C0209i c0209i2 = C0217k.f732j;
                    if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i2);
                    }
                    AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                    C15197y1 c15197y2 = (C15197y1) this.f56475y;
                    c15197y2.getClass();
                    c28655q2.m87150e0(264799724);
                    InterfaceC28601c1 interfaceC28601c1M87238F = AbstractC28683x.m87238F(new C17919x(this.f56476z ? c15197y2.f57054t : c15197y2.f57055u), c28655q2);
                    c28655q2.m87173q(false);
                    AbstractC15114p8.m43175b(((C17919x) interfaceC28601c1M87238F.getValue()).f69639a, ((C15033h9) c28655q2.m87161k(AbstractC15044i9.f56319b)).f56280g, this.f56472E, c28655q2, 0, 4);
                    c28655q2.m87173q(true);
                } else {
                    c28655q2.m87138X();
                }
                break;
            default:
                Modifier modifier2 = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                AbstractC22676k.m65750j(modifier2, "modifier");
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= ((C28655q) composer2).m87153g(modifier2) ? 4 : 2;
                }
                if ((iIntValue2 & 19) == 18) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        Modifier modifierM107879c2 = AbstractC34132o.m107879c(this.f56474x, modifier2);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                        iM87266t = AbstractC28683x.m87266t(composer2);
                        c28655q = (C28655q) composer2;
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer2, modifierM107879c2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N2);
                        c15197y1 = (C15197y1) this.f56475y;
                        c28655q.m87150e0(264799724);
                        if (this.f56476z) {
                            j7 = c15197y1.f57054t;
                        } else {
                            j7 = c15197y1.f57055u;
                        }
                        InterfaceC28601c1 interfaceC28601c1M87238F2 = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
                        c28655q.m87173q(false);
                        AbstractC36259c.m115696k(((C17919x) interfaceC28601c1M87238F2.getValue()).f69639a, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56280g, this.f56472E, composer2, 0, 4);
                        c28655q.m87173q(true);
                    }
                } else {
                    Modifier modifierM107879c3 = AbstractC34132o.m107879c(this.f56474x, modifier2);
                    InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                    iM87266t = AbstractC28683x.m87266t(composer2);
                    c28655q = (C28655q) composer2;
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer2, modifierM107879c3);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f729g, interfaceC39127r0M66763d3);
                    AbstractC28683x.m87239G(composer2, C0217k.f728f, interfaceC28653p1M87165m3);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer2, C0217k.f726d, modifierM118962N3);
                    c15197y1 = (C15197y1) this.f56475y;
                    c28655q.m87150e0(264799724);
                    if (this.f56476z) {
                        j7 = c15197y1.f57054t;
                    } else {
                        j7 = c15197y1.f57055u;
                    }
                    InterfaceC28601c1 interfaceC28601c1M87238F3 = AbstractC28683x.m87238F(new C17919x(j7), c28655q);
                    c28655q.m87173q(false);
                    AbstractC36259c.m115696k(((C17919x) interfaceC28601c1M87238F3.getValue()).f69639a, ((C15033h9) c28655q.m87161k(AbstractC15044i9.f56319b)).f56280g, this.f56472E, composer2, 0, 4);
                    c28655q.m87173q(true);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
