package b30;

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
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: b30.v4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2642v4 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f10310w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f10311x;

    public /* synthetic */ C2642v4(int i13, int i14) {
        this.f10310w = i14;
        this.f10311x = i13;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021  */
    /* JADX WARN: Code duplicated, block: B:19:0x005d  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b1  */
    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int iM87266t;
        C28655q c28655q;
        C0213j c0213j;
        C0209i c0209i;
        switch (this.f10310w) {
            case 0:
                Composer composer = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q2 = (C28655q) composer;
                    if (c28655q2.m87121F()) {
                        c28655q2.m87138X();
                    } else {
                        C22961h c22961h = AbstractC22977m.f90654e;
                        C2305k c2305k = C2299e.f9111N;
                        C2314t c2314t = C2314t.f9131w;
                        Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, composer, 54);
                        iM87266t = AbstractC28683x.m87266t(composer);
                        c28655q = (C28655q) composer;
                        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3407d);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a);
                        AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iM87266t))) {
                            AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                        }
                        AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N);
                        AbstractC29125c.m88522c(AbstractC29125c.m88500I(this.f10311x, composer, 0), null, AbstractC1102d.m3424u(56, AbstractC1102d.m3411h(40, c2314t)), null, null, 0.0f, null, composer, 432, 56);
                        c28655q.m87173q(true);
                    }
                } else {
                    C22961h c22961h2 = AbstractC22977m.f90654e;
                    C2305k c2305k2 = C2299e.f9111N;
                    C2314t c2314t2 = C2314t.f9131w;
                    Modifier modifierM3407d2 = AbstractC1102d.m3407d(1.0f, c2314t2);
                    C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h2, c2305k2, composer, 54);
                    iM87266t = AbstractC28683x.m87266t(composer);
                    c28655q = (C28655q) composer;
                    InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                    Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3407d2);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f729g, c23010xM66775a2);
                    AbstractC28683x.m87239G(composer, C0217k.f728f, interfaceC28653p1M87165m2);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iM87266t, c28655q, iM87266t, c0209i);
                    }
                    AbstractC28683x.m87239G(composer, C0217k.f726d, modifierM118962N2);
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(this.f10311x, composer, 0), null, AbstractC1102d.m3424u(56, AbstractC1102d.m3411h(40, c2314t2)), null, null, 0.0f, null, composer, 432, 56);
                    c28655q.m87173q(true);
                }
                break;
            default:
                Composer composer2 = (Composer) obj;
                if ((((Number) obj2).intValue() & 3) == 2) {
                    C28655q c28655q3 = (C28655q) composer2;
                    if (c28655q3.m87121F()) {
                        c28655q3.m87138X();
                    } else {
                        AbstractC29125c.m88522c(AbstractC29125c.m88500I(this.f10311x, composer2, 0), null, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C39102j.f168200b, 0.0f, null, composer2, 25008, 104);
                    }
                } else {
                    AbstractC29125c.m88522c(AbstractC29125c.m88500I(this.f10311x, composer2, 0), null, AbstractC1102d.m3407d(1.0f, C2314t.f9131w), null, C39102j.f168200b, 0.0f, null, composer2, 25008, 104);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
