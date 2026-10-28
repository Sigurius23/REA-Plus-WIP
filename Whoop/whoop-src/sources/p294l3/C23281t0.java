package p294l3;

import aa3.C0627i1;
import e93.AbstractC12889b;
import gm.C15990r;
import m83.C25271y;
import p002a0.C0005a0;
import p249jc.AbstractC21598x;
import p392p3.InterfaceC28770h;
import p636y3.AbstractC39170b;
import p636y3.C39169a;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.internal.AbstractC22676k;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: l3.t0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C23281t0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC28770h f92244a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC39171c f92245b;

    /* JADX INFO: renamed from: c */
    public final EnumC39181m f92246c;

    /* JADX INFO: renamed from: d */
    public final C15990r f92247d = new C15990r();

    public C23281t0(InterfaceC28770h interfaceC28770h, InterfaceC39171c interfaceC39171c, EnumC39181m enumC39181m) {
        this.f92244a = interfaceC28770h;
        this.f92245b = interfaceC39171c;
        this.f92246c = enumC39181m;
    }

    /* JADX INFO: renamed from: a */
    public static C23277r0 m67354a(C23281t0 c23281t0, String str, C23285v0 c23285v0, int i13) {
        C23277r0 c23277r0;
        boolean z4 = (i13 & 8) != 0;
        int iM124765i = Integer.MAX_VALUE;
        int i14 = (i13 & 16) != 0 ? Integer.MAX_VALUE : 1;
        long jM124770b = AbstractC39170b.m124770b(0, 0, 15);
        EnumC39181m enumC39181m = c23281t0.f92246c;
        InterfaceC39171c interfaceC39171c = c23281t0.f92245b;
        InterfaceC28770h interfaceC28770h = c23281t0.f92244a;
        c23281t0.getClass();
        C23254g c23254g = new C23254g(str);
        C15990r c15990r = c23281t0.f92247d;
        int i15 = i14;
        C25271y c25271y = C25271y.f99162w;
        C23275q0 c23275q0 = new C23275q0(c23254g, c23285v0, c25271y, i15, z4, 1, interfaceC39171c, enumC39181m, interfaceC28770h, jM124770b);
        C23277r0 c23277r1 = null;
        if (c15990r != null) {
            C23268n c23268n = new C23268n(c23275q0);
            C0005a0 c0005a0 = (C0005a0) c15990r.f60512x;
            if (c0005a0 != null) {
                c23277r0 = (C23277r0) c0005a0.m2c(c23268n);
            } else if (AbstractC22676k.m65745e((C23268n) c15990r.f60513y, c23268n)) {
                c23277r0 = (C23277r0) c15990r.f60514z;
            }
            if (c23277r0 != null && !c23277r0.f92228b.f92258a.mo1618b()) {
                c23277r1 = c23277r0;
            }
        }
        if (c23277r1 != null) {
            C23286w c23286w = c23277r1.f92228b;
            return new C23277r0(c23275q0, c23286w, AbstractC39170b.m124772d(jM124770b, (((long) ((int) Math.ceil(c23286w.f92261d))) << 32) | (((long) ((int) Math.ceil(c23286w.f92262e))) & 4294967295L)));
        }
        C0627i1 c0627i1 = new C0627i1(c23254g, AbstractC21598x.m60695p0(c23285v0, enumC39181m), c25271y, interfaceC39171c, interfaceC28770h);
        int iM124767k = C39169a.m124767k(jM124770b);
        if (z4 && C39169a.m124761e(jM124770b)) {
            iM124765i = C39169a.m124765i(jM124770b);
        }
        int iM36284n = iM124765i;
        if (iM124767k != iM36284n) {
            iM36284n = AbstractC12889b.m36284n((int) Math.ceil(c0627i1.mo1619c()), iM124767k, iM36284n);
        }
        C23286w c23286w2 = new C23286w(c0627i1, AbstractC35854l.m113834n(0, iM36284n, 0, C39169a.m124764h(jM124770b)), i15, 1);
        C23277r0 c23277r2 = new C23277r0(c23275q0, c23286w2, AbstractC39170b.m124772d(jM124770b, (((long) ((int) Math.ceil(c23286w2.f92261d))) << 32) | (((long) ((int) Math.ceil(c23286w2.f92262e))) & 4294967295L)));
        if (c15990r != null) {
            C0005a0 c0005a1 = (C0005a0) c15990r.f60512x;
            if (c0005a1 != null) {
                c0005a1.m3d(new C23268n(c23275q0), c23277r2);
                return c23277r2;
            }
            c15990r.f60513y = new C23268n(c23275q0);
            c15990r.f60514z = c23277r2;
        }
        return c23277r2;
    }
}
