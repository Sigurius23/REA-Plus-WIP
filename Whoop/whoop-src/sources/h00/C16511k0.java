package h00;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.C1101c;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p291l0.InterfaceC23004v;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p636y3.C39174f;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: h00.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16511k0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63489w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ float f63490x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f63491y;

    public C16511k0(int i13, float f13, C37816b c37816b) {
        this.f63489w = i13;
        this.f63490x = f13;
        this.f63491y = c37816b;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:17:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x0080  */
    /* JADX WARN: Code duplicated, block: B:21:0x0084  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C39174f c39174f;
        C39174f c39174f2;
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        InterfaceC23004v BoxWithConstraints = (InterfaceC23004v) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(BoxWithConstraints, "$this$BoxWithConstraints");
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(BoxWithConstraints) ? 4 : 2;
        }
        if ((iIntValue & 19) == 18) {
            C28655q c28655q2 = (C28655q) composer;
            if (c28655q2.m87121F()) {
                c28655q2.m87138X();
            } else {
                c39174f = new C39174f(this.f63489w * this.f63490x);
                c39174f2 = new C39174f(((C1101c) BoxWithConstraints).m3402c());
                if (c39174f.compareTo(c39174f2) > 0) {
                    c39174f = c39174f2;
                }
                Modifier modifierM3413j = AbstractC1102d.m3413j(C2314t.f9131w, c39174f.f168413w, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iM87266t = AbstractC28683x.m87266t(composer);
                c28655q = (C28655q) composer;
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3413j);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                    AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                }
                AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                this.f63491y.invoke(C1100b.f4583a, composer, 6);
                c28655q.m87173q(true);
            }
        } else {
            c39174f = new C39174f(this.f63489w * this.f63490x);
            c39174f2 = new C39174f(((C1101c) BoxWithConstraints).m3402c());
            if (c39174f.compareTo(c39174f2) > 0) {
                c39174f = c39174f2;
            }
            Modifier modifierM3413j2 = AbstractC1102d.m3413j(C2314t.f9131w, c39174f.f168413w, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iM87266t = AbstractC28683x.m87266t(composer);
            c28655q = (C28655q) composer;
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3413j2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(composer, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            } else {
                AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
            }
            AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
            this.f63491y.invoke(C1100b.f4583a, composer, 6);
            c28655q.m87173q(true);
        }
        return C23454a0.f92919a;
    }
}
