package p292l1;

import androidx.compose.foundation.lazy.C1104b;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4352n;
import java.time.Instant;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22989q;
import p316m1.AbstractC24917o;
import p316m1.C24916n;
import p316m1.C24919q;
import p316m1.C24920r;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l1.z0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23211z0 implements InterfaceC4352n {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Long f91896E;

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ C23085e0 f91897F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ InterfaceC23142n3 f91898G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C23204y f91899H;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ AbstractC24917o f91900w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C24920r f91901x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Function1 f91902y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C24916n f91903z;

    public C23211z0(AbstractC24917o abstractC24917o, C24920r c24920r, Function1 function1, C24916n c24916n, Long l7, C23085e0 c23085e0, InterfaceC23142n3 interfaceC23142n3, C23204y c23204y) {
        this.f91900w = abstractC24917o;
        this.f91901x = c24920r;
        this.f91902y = function1;
        this.f91903z = c24916n;
        this.f91896E = l7;
        this.f91897F = c23085e0;
        this.f91898G = interfaceC23142n3;
        this.f91899H = c23204y;
    }

    @Override // c93.InterfaceC4352n
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i13;
        InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
        int iIntValue = ((Number) obj2).intValue();
        Composer composer = (Composer) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i13 = (((C28655q) composer).m87153g(interfaceC1103a) ? 4 : 2) | iIntValue2;
        } else {
            i13 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i13 |= ((C28655q) composer).m87149e(iIntValue) ? 32 : 16;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 147) != 146)) {
            AbstractC24917o abstractC24917o = this.f91900w;
            C24919q c24919q = (C24919q) abstractC24917o;
            c24919q.getClass();
            C24920r c24920rM73022e = this.f91901x;
            if (iIntValue > 0) {
                c24920rM73022e = c24919q.m73022e(Instant.ofEpochMilli(c24920rM73022e.f97603e).atZone(C24919q.f97596e).toLocalDate().plusMonths(iIntValue));
            }
            C24920r c24920r = c24920rM73022e;
            Modifier modifierM3432c = ((C1104b) interfaceC1103a).m3432c(1.0f, C2314t.f9131w);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3432c);
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
            AbstractC23092f1.m67075i(c24920r, this.f91902y, this.f91903z.f97592z, this.f91896E, this.f91897F, this.f91898G, this.f91899H, abstractC24917o.f97593a, c28655q, 221184);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
