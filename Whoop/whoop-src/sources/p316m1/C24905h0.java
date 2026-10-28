package p316m1;

import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.graphics.AbstractC1127a;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p000.AbstractC11266d;
import p000.C2175b;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p077d0.C11409v1;
import p291l0.AbstractC22989q;
import p294l3.C23285v0;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p390p1.InterfaceC28670t2;
import p635y2.InterfaceC39127r0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: m1.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24905h0 implements Function3 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ InterfaceC28670t2 f97556w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f97557x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C23285v0 f97558y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ InterfaceC4351m f97559z;

    public C24905h0(C11409v1 c11409v1, long j7, C23285v0 c23285v0, InterfaceC4351m interfaceC4351m) {
        this.f97556w = c11409v1;
        this.f97557x = j7;
        this.f97558y = c23285v0;
        this.f97559z = interfaceC4351m;
    }

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Modifier modifier = (Modifier) obj;
        Composer composer = (Composer) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= ((C28655q) composer).m87153g(modifier) ? 4 : 2;
        }
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(iIntValue & 1, (iIntValue & 19) != 18)) {
            InterfaceC28670t2 interfaceC28670t2 = this.f97556w;
            boolean zM87153g = c28655q.m87153g(interfaceC28670t2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2175b(interfaceC28670t2, 7);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM3486a = AbstractC1127a.m3486a(modifier, (Function1) objM87133R);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3486a);
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
            AbstractC24913l0.m73014b(this.f97557x, this.f97558y, this.f97559z, c28655q, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
