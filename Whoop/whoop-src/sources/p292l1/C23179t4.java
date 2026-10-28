package p292l1;

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
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22989q;
import p354o1.AbstractC27379r;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28673u1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.t4 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23179t4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ float f91695w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f91696x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37816b f91697y;

    public C23179t4(float f13, long j7, C37816b c37816b) {
        this.f91695w = f13;
        this.f91696x = j7;
        this.f91697y = c37816b;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        Composer composer = (Composer) obj;
        int iIntValue = ((Number) obj2).intValue();
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 3) != 2)) {
            Modifier modifierM3393o = AbstractC1099a.m3393o(AbstractC23185u4.f91712d, AbstractC1102d.m3423t(C2314t.f9131w, AbstractC23185u4.f91711c, AbstractC23185u4.f91710b, this.f91695w, 0.0f, 8));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3393o);
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
            AbstractC28683x.m87248b(new C28673u1[]{AbstractC23168s.f91626a.mo86977a(new C17919x(this.f91696x)), AbstractC23149o4.f91555a.mo86977a(AbstractC23215z4.m67162a(AbstractC27379r.f110038d, c28655q))}, this.f91697y, c28655q, 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
