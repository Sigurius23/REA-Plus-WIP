package p717lq2;

import androidx.compose.animation.AbstractC1090b;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b30.C2476a1;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ep1.C13421p;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l72.C23401h;
import l83.C23454a0;
import lj1.C24474b;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27242b1;
import ny0.AbstractC27274q;
import ny0.C27270o;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p040c0.AbstractC3788w0;
import p040c0.InterfaceC3747i0;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb0.AbstractC39383f;
import yp2.AbstractC39704a;
import yp2.AbstractC39706c;

/* JADX INFO: renamed from: lq2.i */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001aK\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m65681d2 = {"Lkd1/o;", "image", "Lcom/whoop/design/util/TextResource;", "title", "Lkotlin/Function0;", "Ll83/a0;", "onExitPress", "g", "(Lkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "", "showLogo", "showRefreshButton", "onRefreshPress", "j", "(Lkd1/o;Lc93/a;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC24677i {
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x007a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0084  */
    /* JADX WARN: Code duplicated, block: B:46:0x0092  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0127  */
    /* JADX WARN: Code duplicated, block: B:70:0x0142  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static final void m72082g(AbstractC22403o image, TextResource title, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a2;
        int i16;
        boolean z4;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        InterfaceC4339a interfaceC4339a4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        boolean z13;
        int iHashCode2;
        int iHashCode3;
        Object objM87133R;
        AbstractC22676k.m65750j(image, "image");
        AbstractC22676k.m65750j(title, "title");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1055916271);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(image) : c28655q.m87157i(image) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(title) : c28655q.m87157i(title) ? 32 : 16;
        }
        int i17 = i14 & 4;
        if (i17 == 0) {
            if ((i13 & 384) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a2) ? 256 : 128;
            }
            i16 = i15;
            if ((i16 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i16 & 1, z4)) {
                if (i17 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C24676h(1);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a4 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a4 = interfaceC4339a2;
                }
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                if (1.0f > 0.0d) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (!z13) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                float f13 = 8;
                float f14 = 4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a | (i16 & 14), 3), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170926s), AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * f14, AbstractC1099a.m3398t(c2314t, ((float) 1.75d) * f13, 0.0f, ((float) 1.5d) * f13, 0.0f, 10)), AbstractC33253j.f138651a), null, C39102j.f168200b, 0.0f, null, c28655q, 24576, 104);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                Modifier modifierM3411h = AbstractC1102d.m3411h(((float) 2.5d) * f14, c2314t);
                C38072d c38072d = C38072d.f163053a;
                C27430e c27430eM107874S = AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoopText(), c28655q, 6);
                int i18 = C38072d.f163054b;
                AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3411h, c38072d.m121949b(c28655q, i18).getWhite50(), c28655q, 432, 0);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, TextResource.$stable | ((i16 >> 3) & 14)), AbstractC1099a.m3398t(c2314t, 0.0f, 1 * f14, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getH4(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                interfaceC4339a3 = interfaceC4339a4;
                AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, AbstractC39383f.m125595a(c38072d), null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i), AbstractC1136a.m3599a(AbstractC1102d.m3419p(12 * f14, c2314t), "UserJourneyBackButton"), null, interfaceC4339a3, c28655q, C27270o.f109105k | 384 | (57344 & (i16 << 6)), 8);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C23401h(i13, i14, 23, image, title, interfaceC4339a3);
            }
        }
        i15 |= 384;
        interfaceC4339a2 = interfaceC4339a;
        i16 = i15;
        if ((i16 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i16 & 1, z4)) {
            if (i17 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C24676h(1);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a4 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a4 = interfaceC4339a2;
            }
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t2);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a3);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m4);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N4);
            if (1.0f > 0.0d) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (!z13) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C22994r1 c22994r1M66759a4 = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, c2306l2, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            float f15 = 8;
            float f16 = 4;
            AbstractC29125c.m88522c(AbstractC22404p.m64500i(image, null, null, c28655q, AbstractC22403o.f87638a | (i16 & 14), 3), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170926s), AbstractC37056f.m118994r(AbstractC1102d.m3419p(10 * f16, AbstractC1099a.m3398t(c2314t2, ((float) 1.75d) * f15, 0.0f, ((float) 1.5d) * f15, 0.0f, 10)), AbstractC33253j.f138651a), null, C39102j.f168200b, 0.0f, null, c28655q, 24576, 104);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(((float) 2.5d) * f16, c2314t2);
            C38072d c38072d2 = C38072d.f163053a;
            C27430e c27430eM107874S2 = AbstractC34132o.m107874S(c38072d2.m121951d().getLogo().getWhoopText(), c28655q, 6);
            int i19 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S2, null, modifierM3411h2, c38072d2.m121949b(c28655q, i19).getWhite50(), c28655q, 432, 0);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(title, c28655q, TextResource.$stable | ((i16 >> 3) & 14)), AbstractC1099a.m3398t(c2314t2, 0.0f, 1 * f16, 0.0f, 0.0f, 13), c38072d2.m121949b(c28655q, i19).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i19).getH4(), null, c28655q, 48, C2886a.f11498d << 18, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            interfaceC4339a3 = interfaceC4339a4;
            AbstractC27242b1.m82092d(new C27270o(AbstractC27274q.a.f109136f, AbstractC39383f.m125595a(c38072d2), null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i), AbstractC1136a.m3599a(AbstractC1102d.m3419p(12 * f16, c2314t2), "UserJourneyBackButton"), null, interfaceC4339a3, c28655q, C27270o.f109105k | 384 | (57344 & (i16 << 6)), 8);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C23401h(i13, i14, 23, image, title, interfaceC4339a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m72083h() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m72084i(AbstractC22403o abstractC22403o, TextResource textResource, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m72082g(abstractC22403o, textResource, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0259  */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:83:0x0109  */
    /* JADX WARN: Code duplicated, block: B:84:0x010d  */
    /* JADX WARN: Code duplicated, block: B:87:0x0120  */
    /* JADX WARN: Code duplicated, block: B:89:0x012e  */
    /* JADX WARN: Code duplicated, block: B:92:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:94:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x024c  */
    /* JADX INFO: renamed from: j */
    public static final void m72085j(AbstractC22403o image, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a2, Composer composer, int i13, int i14) {
        int i15;
        InterfaceC4339a interfaceC4339a3;
        int i16;
        boolean z14;
        int i17;
        int i18;
        boolean z15;
        int i19;
        int i24;
        InterfaceC4339a interfaceC4339a4;
        int i25;
        boolean z16;
        InterfaceC4339a interfaceC4339a5;
        boolean z17;
        boolean z18;
        InterfaceC4339a interfaceC4339a6;
        C28677v1 c28677v1M87180u;
        C28676v0 c28676v0;
        InterfaceC4339a interfaceC4339a7;
        InterfaceC4339a interfaceC4339a8;
        C2314t c2314t;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        float f13;
        C1100b c1100b;
        float f14;
        AbstractC27274q.a aVar;
        int i26;
        int i27;
        Object objM87133R;
        Object objM87133R2;
        AbstractC22676k.m65750j(image, "image");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1129236196);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(image) : c28655q.m87157i(image) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i28 = i14 & 2;
        if (i28 == 0) {
            if ((i13 & 48) == 0) {
                interfaceC4339a3 = interfaceC4339a;
                i15 |= c28655q.m87157i(interfaceC4339a3) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    z14 = z4;
                    if (c28655q.m87155h(z14)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                i18 = i14 & 8;
                if (i18 != 0) {
                    if ((i13 & 3072) == 0) {
                        z15 = z13;
                        if (c28655q.m87155h(z15)) {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                        } else {
                            i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                        }
                        i15 |= i19;
                    }
                    i24 = i14 & 16;
                    if (i24 != 0) {
                        if ((i13 & 24576) == 0) {
                            interfaceC4339a4 = interfaceC4339a2;
                            if (c28655q.m87157i(interfaceC4339a4)) {
                                i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                            } else {
                                i25 = DfuBaseService.ERROR_REMOTE_MASK;
                            }
                            i15 |= i25;
                        }
                        if ((i15 & 9363) != 9362) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        if (c28655q.m87135U(i15 & 1, z16)) {
                            c28676v0 = C28635l.f115821a;
                            if (i28 != 0) {
                                objM87133R2 = c28655q.m87133R();
                                if (objM87133R2 == c28676v0) {
                                    objM87133R2 = new C24474b(29);
                                    c28655q.m87172p0(objM87133R2);
                                }
                                interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                            } else {
                                interfaceC4339a7 = interfaceC4339a3;
                            }
                            if (i16 != 0) {
                                z14 = true;
                            }
                            if (i18 != 0) {
                                z18 = false;
                            } else {
                                z18 = z15;
                            }
                            if (i24 != 0) {
                                objM87133R = c28655q.m87133R();
                                if (objM87133R == c28676v0) {
                                    objM87133R = new C24676h(0);
                                    c28655q.m87172p0(objM87133R);
                                }
                                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                            } else {
                                interfaceC4339a8 = interfaceC4339a4;
                            }
                            c2314t = C2314t.f9131w;
                            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                            iHashCode = Long.hashCode(c28655q.f115904T);
                            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                            InterfaceC0221l.f734a.getClass();
                            c0213j = C0217k.f724b;
                            c28655q.m87158i0();
                            if (c28655q.f115903S) {
                                c28655q.m87163l(c0213j);
                            } else {
                                c28655q.m87178s0();
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                            c0209i = C0217k.f732j;
                            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                            }
                            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                            AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                            boolean z19 = z14;
                            c28655q = c28655q;
                            f13 = 12 * 4;
                            Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                            C2307m c2307m = C2299e.f9117z;
                            c1100b = C1100b.f4583a;
                            f14 = 3 * 8;
                            Modifier modifierM3398t = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m), f14, 0.0f, 0.0f, 0.0f, 14);
                            aVar = AbstractC27274q.a.f109136f;
                            C27270o c27270o = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                            String strM92103Y = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                            i26 = C27270o.f109105k;
                            i27 = i15;
                            InterfaceC4339a interfaceC4339a9 = interfaceC4339a7;
                            AbstractC27242b1.m82092d(c27270o, strM92103Y, modifierM3599a, modifierM3398t, interfaceC4339a9, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                            if (z18) {
                                c28655q.m87150e0(2064305046);
                                interfaceC4339a4 = interfaceC4339a8;
                                AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                                c28655q.m87173q(false);
                            } else {
                                interfaceC4339a4 = interfaceC4339a8;
                                c28655q.m87150e0(2064878112);
                                c28655q.m87173q(false);
                            }
                            c28655q.m87173q(true);
                            z17 = z19;
                            interfaceC4339a5 = interfaceC4339a9;
                        } else {
                            c28655q.m87138X();
                            interfaceC4339a5 = interfaceC4339a3;
                            z17 = z14;
                            z18 = z15;
                        }
                        interfaceC4339a6 = interfaceC4339a4;
                        c28677v1M87180u = c28655q.m87180u();
                        if (c28677v1M87180u != null) {
                            c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                        }
                    }
                    i15 |= 24576;
                    interfaceC4339a4 = interfaceC4339a2;
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24474b(29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C24676h(0);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
                        AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                        boolean z110 = z14;
                        c28655q = c28655q;
                        f13 = 12 * 4;
                        Modifier modifierM3599a2 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                        C2307m c2307m2 = C2299e.f9117z;
                        c1100b = C1100b.f4583a;
                        f14 = 3 * 8;
                        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m2), f14, 0.0f, 0.0f, 0.0f, 14);
                        aVar = AbstractC27274q.a.f109136f;
                        C27270o c27270o2 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                        String strM92103Y2 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                        i26 = C27270o.f109105k;
                        i27 = i15;
                        InterfaceC4339a interfaceC4339a10 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(c27270o2, strM92103Y2, modifierM3599a2, modifierM3398t2, interfaceC4339a10, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                        if (z18) {
                            c28655q.m87150e0(2064305046);
                            interfaceC4339a4 = interfaceC4339a8;
                            AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a8;
                            c28655q.m87150e0(2064878112);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z17 = z110;
                        interfaceC4339a5 = interfaceC4339a10;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a5 = interfaceC4339a3;
                        z17 = z14;
                        z18 = z15;
                    }
                    interfaceC4339a6 = interfaceC4339a4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                    }
                }
                i15 |= 3072;
                z15 = z13;
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24474b(29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C24676h(0);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d3);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                        AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                        boolean z111 = z14;
                        c28655q = c28655q;
                        f13 = 12 * 4;
                        Modifier modifierM3599a3 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                        C2307m c2307m3 = C2299e.f9117z;
                        c1100b = C1100b.f4583a;
                        f14 = 3 * 8;
                        Modifier modifierM3398t3 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m3), f14, 0.0f, 0.0f, 0.0f, 14);
                        aVar = AbstractC27274q.a.f109136f;
                        C27270o c27270o3 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                        String strM92103Y3 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                        i26 = C27270o.f109105k;
                        i27 = i15;
                        InterfaceC4339a interfaceC4339a11 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(c27270o3, strM92103Y3, modifierM3599a3, modifierM3398t3, interfaceC4339a11, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                        if (z18) {
                            c28655q.m87150e0(2064305046);
                            interfaceC4339a4 = interfaceC4339a8;
                            AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a8;
                            c28655q.m87150e0(2064878112);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z17 = z111;
                        interfaceC4339a5 = interfaceC4339a11;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a5 = interfaceC4339a3;
                        z17 = z14;
                        z18 = z15;
                    }
                    interfaceC4339a6 = interfaceC4339a4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                    Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d4);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m4);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N4);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z112 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a4 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m4 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t4 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m4), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o4 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y4 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a12 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o4, strM92103Y4, modifierM3599a4, modifierM3398t4, interfaceC4339a12, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z112;
                    interfaceC4339a5 = interfaceC4339a12;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 384;
            z14 = z4;
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24474b(29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C24676h(0);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f5 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                        Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3409f5);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d5);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m5);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N5);
                        AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                        boolean z113 = z14;
                        c28655q = c28655q;
                        f13 = 12 * 4;
                        Modifier modifierM3599a5 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                        C2307m c2307m5 = C2299e.f9117z;
                        c1100b = C1100b.f4583a;
                        f14 = 3 * 8;
                        Modifier modifierM3398t5 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m5), f14, 0.0f, 0.0f, 0.0f, 14);
                        aVar = AbstractC27274q.a.f109136f;
                        C27270o c27270o5 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                        String strM92103Y5 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                        i26 = C27270o.f109105k;
                        i27 = i15;
                        InterfaceC4339a interfaceC4339a13 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(c27270o5, strM92103Y5, modifierM3599a5, modifierM3398t5, interfaceC4339a13, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                        if (z18) {
                            c28655q.m87150e0(2064305046);
                            interfaceC4339a4 = interfaceC4339a8;
                            AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a8;
                            c28655q.m87150e0(2064878112);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z17 = z113;
                        interfaceC4339a5 = interfaceC4339a13;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a5 = interfaceC4339a3;
                        z17 = z14;
                        z18 = z15;
                    }
                    interfaceC4339a6 = interfaceC4339a4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f6 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f6);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d6);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m6);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N6);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z114 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a6 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m6 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t6 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m6), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o6 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y6 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a14 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o6, strM92103Y6, modifierM3599a6, modifierM3398t6, interfaceC4339a14, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z114;
                    interfaceC4339a5 = interfaceC4339a14;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 3072;
            z15 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f7 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f7);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d7);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m7);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N7);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z115 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a7 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m7 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t7 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m7), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o7 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y7 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a15 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o7, strM92103Y7, modifierM3599a7, modifierM3398t7, interfaceC4339a15, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z115;
                    interfaceC4339a5 = interfaceC4339a15;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24474b(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24676h(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f8 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d8 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f8);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d8);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m8);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N8);
                AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                boolean z116 = z14;
                c28655q = c28655q;
                f13 = 12 * 4;
                Modifier modifierM3599a8 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                C2307m c2307m8 = C2299e.f9117z;
                c1100b = C1100b.f4583a;
                f14 = 3 * 8;
                Modifier modifierM3398t8 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m8), f14, 0.0f, 0.0f, 0.0f, 14);
                aVar = AbstractC27274q.a.f109136f;
                C27270o c27270o8 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                String strM92103Y8 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                i26 = C27270o.f109105k;
                i27 = i15;
                InterfaceC4339a interfaceC4339a16 = interfaceC4339a7;
                AbstractC27242b1.m82092d(c27270o8, strM92103Y8, modifierM3599a8, modifierM3398t8, interfaceC4339a16, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                if (z18) {
                    c28655q.m87150e0(2064305046);
                    interfaceC4339a4 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a8;
                    c28655q.m87150e0(2064878112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z17 = z116;
                interfaceC4339a5 = interfaceC4339a16;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                z17 = z14;
                z18 = z15;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
            }
        }
        i15 |= 48;
        interfaceC4339a3 = interfaceC4339a;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                z14 = z4;
                if (c28655q.m87155h(z14)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            i18 = i14 & 8;
            if (i18 != 0) {
                if ((i13 & 3072) == 0) {
                    z15 = z13;
                    if (c28655q.m87155h(z15)) {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                    } else {
                        i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                    }
                    i15 |= i19;
                }
                i24 = i14 & 16;
                if (i24 != 0) {
                    if ((i13 & 24576) == 0) {
                        interfaceC4339a4 = interfaceC4339a2;
                        if (c28655q.m87157i(interfaceC4339a4)) {
                            i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                        } else {
                            i25 = DfuBaseService.ERROR_REMOTE_MASK;
                        }
                        i15 |= i25;
                    }
                    if ((i15 & 9363) != 9362) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    if (c28655q.m87135U(i15 & 1, z16)) {
                        c28676v0 = C28635l.f115821a;
                        if (i28 != 0) {
                            objM87133R2 = c28655q.m87133R();
                            if (objM87133R2 == c28676v0) {
                                objM87133R2 = new C24474b(29);
                                c28655q.m87172p0(objM87133R2);
                            }
                            interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                        } else {
                            interfaceC4339a7 = interfaceC4339a3;
                        }
                        if (i16 != 0) {
                            z14 = true;
                        }
                        if (i18 != 0) {
                            z18 = false;
                        } else {
                            z18 = z15;
                        }
                        if (i24 != 0) {
                            objM87133R = c28655q.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C24676h(0);
                                c28655q.m87172p0(objM87133R);
                            }
                            interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                        } else {
                            interfaceC4339a8 = interfaceC4339a4;
                        }
                        c2314t = C2314t.f9131w;
                        Modifier modifierM3409f9 = AbstractC1102d.m3409f(1.0f, c2314t);
                        InterfaceC39127r0 interfaceC39127r0M66763d9 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                        iHashCode = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                        Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3409f9);
                        InterfaceC0221l.f734a.getClass();
                        c0213j = C0217k.f724b;
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d9);
                        AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m9);
                        c0209i = C0217k.f732j;
                        if (c28655q.f115903S) {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        } else {
                            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                        }
                        AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N9);
                        AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                        boolean z117 = z14;
                        c28655q = c28655q;
                        f13 = 12 * 4;
                        Modifier modifierM3599a9 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                        C2307m c2307m9 = C2299e.f9117z;
                        c1100b = C1100b.f4583a;
                        f14 = 3 * 8;
                        Modifier modifierM3398t9 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m9), f14, 0.0f, 0.0f, 0.0f, 14);
                        aVar = AbstractC27274q.a.f109136f;
                        C27270o c27270o9 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                        String strM92103Y9 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                        i26 = C27270o.f109105k;
                        i27 = i15;
                        InterfaceC4339a interfaceC4339a17 = interfaceC4339a7;
                        AbstractC27242b1.m82092d(c27270o9, strM92103Y9, modifierM3599a9, modifierM3398t9, interfaceC4339a17, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                        if (z18) {
                            c28655q.m87150e0(2064305046);
                            interfaceC4339a4 = interfaceC4339a8;
                            AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                            c28655q.m87173q(false);
                        } else {
                            interfaceC4339a4 = interfaceC4339a8;
                            c28655q.m87150e0(2064878112);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        z17 = z117;
                        interfaceC4339a5 = interfaceC4339a17;
                    } else {
                        c28655q.m87138X();
                        interfaceC4339a5 = interfaceC4339a3;
                        z17 = z14;
                        z18 = z15;
                    }
                    interfaceC4339a6 = interfaceC4339a4;
                    c28677v1M87180u = c28655q.m87180u();
                    if (c28677v1M87180u != null) {
                        c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                    }
                }
                i15 |= 24576;
                interfaceC4339a4 = interfaceC4339a2;
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f10 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d10 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3409f10);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d10);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m10);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N10);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z118 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a10 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m10 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t10 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m10), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o10 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y10 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a18 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o10, strM92103Y10, modifierM3599a10, modifierM3398t10, interfaceC4339a18, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z118;
                    interfaceC4339a5 = interfaceC4339a18;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 3072;
            z15 = z13;
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f11 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d11 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3409f11);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d11);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m11);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N11);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z119 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a11 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m11 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t11 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m11), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o11 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y11 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a19 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o11, strM92103Y11, modifierM3599a11, modifierM3398t11, interfaceC4339a19, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z119;
                    interfaceC4339a5 = interfaceC4339a19;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24474b(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24676h(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f12 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d12 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f12);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d12);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m12);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N12);
                AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                boolean z1110 = z14;
                c28655q = c28655q;
                f13 = 12 * 4;
                Modifier modifierM3599a12 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                C2307m c2307m12 = C2299e.f9117z;
                c1100b = C1100b.f4583a;
                f14 = 3 * 8;
                Modifier modifierM3398t12 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m12), f14, 0.0f, 0.0f, 0.0f, 14);
                aVar = AbstractC27274q.a.f109136f;
                C27270o c27270o12 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                String strM92103Y12 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                i26 = C27270o.f109105k;
                i27 = i15;
                InterfaceC4339a interfaceC4339a110 = interfaceC4339a7;
                AbstractC27242b1.m82092d(c27270o12, strM92103Y12, modifierM3599a12, modifierM3398t12, interfaceC4339a110, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                if (z18) {
                    c28655q.m87150e0(2064305046);
                    interfaceC4339a4 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a8;
                    c28655q.m87150e0(2064878112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z17 = z1110;
                interfaceC4339a5 = interfaceC4339a110;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                z17 = z14;
                z18 = z15;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
            }
        }
        i15 |= 384;
        z14 = z4;
        i18 = i14 & 8;
        if (i18 != 0) {
            if ((i13 & 3072) == 0) {
                z15 = z13;
                if (c28655q.m87155h(z15)) {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                } else {
                    i19 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                i15 |= i19;
            }
            i24 = i14 & 16;
            if (i24 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a4 = interfaceC4339a2;
                    if (c28655q.m87157i(interfaceC4339a4)) {
                        i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                    } else {
                        i25 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i25;
                }
                if ((i15 & 9363) != 9362) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (c28655q.m87135U(i15 & 1, z16)) {
                    c28676v0 = C28635l.f115821a;
                    if (i28 != 0) {
                        objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = new C24474b(29);
                            c28655q.m87172p0(objM87133R2);
                        }
                        interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                    } else {
                        interfaceC4339a7 = interfaceC4339a3;
                    }
                    if (i16 != 0) {
                        z14 = true;
                    }
                    if (i18 != 0) {
                        z18 = false;
                    } else {
                        z18 = z15;
                    }
                    if (i24 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C24676h(0);
                            c28655q.m87172p0(objM87133R);
                        }
                        interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                    } else {
                        interfaceC4339a8 = interfaceC4339a4;
                    }
                    c2314t = C2314t.f9131w;
                    Modifier modifierM3409f13 = AbstractC1102d.m3409f(1.0f, c2314t);
                    InterfaceC39127r0 interfaceC39127r0M66763d13 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
                    Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierM3409f13);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d13);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m13);
                    c0209i = C0217k.f732j;
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    } else {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N13);
                    AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                    boolean z1111 = z14;
                    c28655q = c28655q;
                    f13 = 12 * 4;
                    Modifier modifierM3599a13 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                    C2307m c2307m13 = C2299e.f9117z;
                    c1100b = C1100b.f4583a;
                    f14 = 3 * 8;
                    Modifier modifierM3398t13 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m13), f14, 0.0f, 0.0f, 0.0f, 14);
                    aVar = AbstractC27274q.a.f109136f;
                    C27270o c27270o13 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                    String strM92103Y13 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                    i26 = C27270o.f109105k;
                    i27 = i15;
                    InterfaceC4339a interfaceC4339a111 = interfaceC4339a7;
                    AbstractC27242b1.m82092d(c27270o13, strM92103Y13, modifierM3599a13, modifierM3398t13, interfaceC4339a111, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                    if (z18) {
                        c28655q.m87150e0(2064305046);
                        interfaceC4339a4 = interfaceC4339a8;
                        AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                        c28655q.m87173q(false);
                    } else {
                        interfaceC4339a4 = interfaceC4339a8;
                        c28655q.m87150e0(2064878112);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    z17 = z1111;
                    interfaceC4339a5 = interfaceC4339a111;
                } else {
                    c28655q.m87138X();
                    interfaceC4339a5 = interfaceC4339a3;
                    z17 = z14;
                    z18 = z15;
                }
                interfaceC4339a6 = interfaceC4339a4;
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
                }
            }
            i15 |= 24576;
            interfaceC4339a4 = interfaceC4339a2;
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24474b(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24676h(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f14 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d14 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, modifierM3409f14);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d14);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m14);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N14);
                AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                boolean z1112 = z14;
                c28655q = c28655q;
                f13 = 12 * 4;
                Modifier modifierM3599a14 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                C2307m c2307m14 = C2299e.f9117z;
                c1100b = C1100b.f4583a;
                f14 = 3 * 8;
                Modifier modifierM3398t14 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m14), f14, 0.0f, 0.0f, 0.0f, 14);
                aVar = AbstractC27274q.a.f109136f;
                C27270o c27270o14 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                String strM92103Y14 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                i26 = C27270o.f109105k;
                i27 = i15;
                InterfaceC4339a interfaceC4339a112 = interfaceC4339a7;
                AbstractC27242b1.m82092d(c27270o14, strM92103Y14, modifierM3599a14, modifierM3398t14, interfaceC4339a112, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                if (z18) {
                    c28655q.m87150e0(2064305046);
                    interfaceC4339a4 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a8;
                    c28655q.m87150e0(2064878112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z17 = z1112;
                interfaceC4339a5 = interfaceC4339a112;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                z17 = z14;
                z18 = z15;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
            }
        }
        i15 |= 3072;
        z15 = z13;
        i24 = i14 & 16;
        if (i24 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a4 = interfaceC4339a2;
                if (c28655q.m87157i(interfaceC4339a4)) {
                    i25 = DfuBaseService.ERROR_CONNECTION_MASK;
                } else {
                    i25 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i25;
            }
            if ((i15 & 9363) != 9362) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (c28655q.m87135U(i15 & 1, z16)) {
                c28676v0 = C28635l.f115821a;
                if (i28 != 0) {
                    objM87133R2 = c28655q.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = new C24474b(29);
                        c28655q.m87172p0(objM87133R2);
                    }
                    interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
                } else {
                    interfaceC4339a7 = interfaceC4339a3;
                }
                if (i16 != 0) {
                    z14 = true;
                }
                if (i18 != 0) {
                    z18 = false;
                } else {
                    z18 = z15;
                }
                if (i24 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C24676h(0);
                        c28655q.m87172p0(objM87133R);
                    }
                    interfaceC4339a8 = (InterfaceC4339a) objM87133R;
                } else {
                    interfaceC4339a8 = interfaceC4339a4;
                }
                c2314t = C2314t.f9131w;
                Modifier modifierM3409f15 = AbstractC1102d.m3409f(1.0f, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d15 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, modifierM3409f15);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d15);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m15);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N15);
                AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
                boolean z1113 = z14;
                c28655q = c28655q;
                f13 = 12 * 4;
                Modifier modifierM3599a15 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
                C2307m c2307m15 = C2299e.f9117z;
                c1100b = C1100b.f4583a;
                f14 = 3 * 8;
                Modifier modifierM3398t15 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m15), f14, 0.0f, 0.0f, 0.0f, 14);
                aVar = AbstractC27274q.a.f109136f;
                C27270o c27270o15 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
                String strM92103Y15 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
                i26 = C27270o.f109105k;
                i27 = i15;
                InterfaceC4339a interfaceC4339a113 = interfaceC4339a7;
                AbstractC27242b1.m82092d(c27270o15, strM92103Y15, modifierM3599a15, modifierM3398t15, interfaceC4339a113, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
                if (z18) {
                    c28655q.m87150e0(2064305046);
                    interfaceC4339a4 = interfaceC4339a8;
                    AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                    c28655q.m87173q(false);
                } else {
                    interfaceC4339a4 = interfaceC4339a8;
                    c28655q.m87150e0(2064878112);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                z17 = z1113;
                interfaceC4339a5 = interfaceC4339a113;
            } else {
                c28655q.m87138X();
                interfaceC4339a5 = interfaceC4339a3;
                z17 = z14;
                z18 = z15;
            }
            interfaceC4339a6 = interfaceC4339a4;
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
            }
        }
        i15 |= 24576;
        interfaceC4339a4 = interfaceC4339a2;
        if ((i15 & 9363) != 9362) {
            z16 = true;
        } else {
            z16 = false;
        }
        if (c28655q.m87135U(i15 & 1, z16)) {
            c28676v0 = C28635l.f115821a;
            if (i28 != 0) {
                objM87133R2 = c28655q.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = new C24474b(29);
                    c28655q.m87172p0(objM87133R2);
                }
                interfaceC4339a7 = (InterfaceC4339a) objM87133R2;
            } else {
                interfaceC4339a7 = interfaceC4339a3;
            }
            if (i16 != 0) {
                z14 = true;
            }
            if (i18 != 0) {
                z18 = false;
            } else {
                z18 = z15;
            }
            if (i24 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == c28676v0) {
                    objM87133R = new C24676h(0);
                    c28655q.m87172p0(objM87133R);
                }
                interfaceC4339a8 = (InterfaceC4339a) objM87133R;
            } else {
                interfaceC4339a8 = interfaceC4339a4;
            }
            c2314t = C2314t.f9131w;
            Modifier modifierM3409f16 = AbstractC1102d.m3409f(1.0f, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d16 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
            Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f16);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d16);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m16);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N16);
            AbstractC1090b.m3351f(z14, null, AbstractC3788w0.m11577e(null, 3), null, null, AbstractC37817c.m121344e(7021434, c28655q, new C2476a1(image, 28)), c28655q, 196992 | ((i15 >> 6) & 14), 26);
            boolean z1114 = z14;
            c28655q = c28655q;
            f13 = 12 * 4;
            Modifier modifierM3599a16 = AbstractC1136a.m3599a(AbstractC1102d.m3419p(f13, c2314t), "UserJourneyBackButton");
            C2307m c2307m16 = C2299e.f9117z;
            c1100b = C1100b.f4583a;
            f14 = 3 * 8;
            Modifier modifierM3398t16 = AbstractC1099a.m3398t(c1100b.mo3400a(c2314t, c2307m16), f14, 0.0f, 0.0f, 0.0f, 14);
            aVar = AbstractC27274q.a.f109136f;
            C27270o c27270o16 = new C27270o(aVar, AbstractC39383f.m125595a(C38072d.f163053a), null, null, null, true, false, false, 0.0f, false, 988, null);
            String strM92103Y16 = AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170916i);
            i26 = C27270o.f109105k;
            i27 = i15;
            InterfaceC4339a interfaceC4339a114 = interfaceC4339a7;
            AbstractC27242b1.m82092d(c27270o16, strM92103Y16, modifierM3599a16, modifierM3398t16, interfaceC4339a114, c28655q, i26 | 384 | ((i15 << 9) & 57344), 0);
            if (z18) {
                c28655q.m87150e0(2064305046);
                interfaceC4339a4 = interfaceC4339a8;
                AbstractC27242b1.m82092d(new C27270o(aVar, AbstractC39704a.f170897b, null, null, null, true, false, false, 0.0f, false, 988, null), AbstractC30060g.m92103Y(c28655q, AbstractC39706c.f170927t), null, AbstractC1136a.m3599a(AbstractC1099a.m3398t(c1100b.mo3400a(AbstractC1102d.m3419p(f13, c2314t), C2299e.f9103F), 0.0f, 0.0f, f14, 0.0f, 11), "UserJourneyRefreshButton"), interfaceC4339a4, c28655q, i26 | (i27 & 57344), 4);
                c28655q.m87173q(false);
            } else {
                interfaceC4339a4 = interfaceC4339a8;
                c28655q.m87150e0(2064878112);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            z17 = z1114;
            interfaceC4339a5 = interfaceC4339a114;
        } else {
            c28655q.m87138X();
            interfaceC4339a5 = interfaceC4339a3;
            z17 = z14;
            z18 = z15;
        }
        interfaceC4339a6 = interfaceC4339a4;
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13421p(image, interfaceC4339a5, z17, z18, interfaceC4339a6, i13, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m72086k() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m72087l() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m72088m(AbstractC22403o abstractC22403o, InterfaceC3747i0 AnimatedVisibility, Composer composer, int i13) {
        AbstractC22676k.m65750j(AnimatedVisibility, "$this$AnimatedVisibility");
        AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403o, null, null, composer, AbstractC22403o.f87638a, 3), AbstractC30060g.m92103Y(composer, AbstractC39706c.f170907E), AbstractC1102d.m3411h(8 * 4, C2314t.f9131w), null, C39102j.f168200b, 0.0f, null, composer, 24960, 104);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m72089n(AbstractC22403o abstractC22403o, InterfaceC4339a interfaceC4339a, boolean z4, boolean z13, InterfaceC4339a interfaceC4339a2, int i13, int i14, Composer composer, int i15) {
        m72085j(abstractC22403o, interfaceC4339a, z4, z13, interfaceC4339a2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
