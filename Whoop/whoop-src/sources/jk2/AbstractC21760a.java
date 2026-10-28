package jk2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b11.C2281h;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.TextResource;
import h01.C16544k;
import ik2.C18614b;
import kd1.AbstractC22403o;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: jk2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aK\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Lik2/b;", "homeToolbarViewState", "Lkotlin/Function0;", "Ll83/a0;", "startArrowClick", "endArrowClick", "calendarClick", "", "isUpdating", "b", "(Lik2/b;Lc93/a;Lc93/a;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V", "home_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21760a {
    /* JADX WARN: Code duplicated, block: B:47:0x0093  */
    /* JADX WARN: Code duplicated, block: B:48:0x0095  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0125  */
    /* JADX WARN: Code duplicated, block: B:64:0x015d  */
    /* JADX WARN: Code duplicated, block: B:65:0x0161  */
    /* JADX WARN: Code duplicated, block: B:70:0x017c  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x024a  */
    /* JADX WARN: Code duplicated, block: B:89:0x0254  */
    /* JADX WARN: Code duplicated, block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m61450b(C18614b homeToolbarViewState, InterfaceC4339a startArrowClick, InterfaceC4339a endArrowClick, InterfaceC4339a calendarClick, boolean z4, Composer composer, int i13, int i14) {
        int i15;
        boolean z13;
        boolean z14;
        InterfaceC4339a interfaceC4339a;
        C28677v1 c28677v1M87180u;
        float f13;
        C38072d c38072d;
        int i16;
        int i17;
        int iHashCode;
        C0213j c0213j;
        boolean z15;
        C0209i c0209i;
        int iHashCode2;
        int i18;
        int iHashCode3;
        AbstractC22676k.m65750j(homeToolbarViewState, "homeToolbarViewState");
        AbstractC22676k.m65750j(startArrowClick, "startArrowClick");
        AbstractC22676k.m65750j(endArrowClick, "endArrowClick");
        AbstractC22676k.m65750j(calendarClick, "calendarClick");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1439595244);
        if ((i13 & 6) == 0) {
            i15 = ((i13 & 8) == 0 ? c28655q.m87153g(homeToolbarViewState) : c28655q.m87157i(homeToolbarViewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(startArrowClick) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(endArrowClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(calendarClick) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i19 = i14 & 16;
        if (i19 == 0) {
            if ((i13 & 24576) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
            }
            if ((i15 & 9363) != 9362) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i19 != 0) {
                    z13 = false;
                }
                float f14 = 8;
                f13 = 4;
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM3411h = AbstractC1102d.m3411h(f14 * f13, c2314t);
                c38072d = C38072d.f163053a;
                i16 = C38072d.f163054b;
                i17 = i15;
                float f15 = 3 * f13;
                Modifier modifierM3358c = AbstractC1092a.m3358c(modifierM3411h, c38072d.m121949b(c28655q, i16).getWhite5(), AbstractC33253j.m105489e(f15));
                float f16 = ((float) 0.5d) * f14;
                Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM3358c, f16, 0.0f, 2);
                C2307m c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                z15 = z13;
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3396r2 = AbstractC1099a.m3396r(AbstractC1102d.m3406c(1.0f, c2314t), f16, 0.0f, 2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                i18 = TextResource.$stable | AbstractC22403o.f87638a | C2281h.f9046e;
                int i24 = (i17 & 14) | i18;
                AbstractC21762c.m61463l(homeToolbarViewState, startArrowClick, c28655q, (i17 & 112) | i24);
                Modifier modifierM3396r3 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1102d.m3406c(1.0f, c2314t), c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC33253j.m105489e(f15)), 2 * f14, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                if (z15) {
                    c28655q.m87150e0(1424179418);
                    AbstractC21762c.m61467p(5 * f13, c28655q, 6);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1424254221);
                    AbstractC21762c.m61461j(calendarClick, homeToolbarViewState, c38072d.m121952e(c28655q, i16).getH5(), c28655q, (C2886a.f11498d << 6) | ((i17 >> 9) & 14) | (i18 << 3) | ((i17 << 3) & 112));
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                interfaceC4339a = endArrowClick;
                AbstractC21762c.m61465n(homeToolbarViewState, interfaceC4339a, c28655q, ((i17 >> 3) & 112) | i24);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                z13 = z15;
            } else {
                interfaceC4339a = endArrowClick;
                c28655q.m87138X();
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C16544k(homeToolbarViewState, startArrowClick, interfaceC4339a, calendarClick, z13, i13, i14);
            }
        }
        i15 |= 24576;
        z13 = z4;
        if ((i15 & 9363) != 9362) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i19 != 0) {
                z13 = false;
            }
            float f17 = 8;
            f13 = 4;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3411h2 = AbstractC1102d.m3411h(f17 * f13, c2314t2);
            c38072d = C38072d.f163053a;
            i16 = C38072d.f163054b;
            i17 = i15;
            float f18 = 3 * f13;
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(modifierM3411h2, c38072d.m121949b(c28655q, i16).getWhite5(), AbstractC33253j.m105489e(f18));
            float f19 = ((float) 0.5d) * f17;
            Modifier modifierM3396r4 = AbstractC1099a.m3396r(modifierM3358c2, f19, 0.0f, 2);
            C2307m c2307m2 = C2299e.f9102E;
            InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3396r4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            z15 = z13;
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d3);
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
            Modifier modifierM3396r5 = AbstractC1099a.m3396r(AbstractC1102d.m3406c(1.0f, c2314t2), f19, 0.0f, 2);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), C2299e.f9108K, c28655q, 54);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r5);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m5);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N5);
            i18 = TextResource.$stable | AbstractC22403o.f87638a | C2281h.f9046e;
            int i25 = (i17 & 14) | i18;
            AbstractC21762c.m61463l(homeToolbarViewState, startArrowClick, c28655q, (i17 & 112) | i25);
            Modifier modifierM3396r6 = AbstractC1099a.m3396r(AbstractC1092a.m3358c(AbstractC1102d.m3406c(1.0f, c2314t2), c38072d.m121949b(c28655q, i16).getWhite10(), AbstractC33253j.m105489e(f18)), 2 * f17, 0.0f, 2);
            InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(c2307m2, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3396r6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, interfaceC39127r0M66763d4);
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i7, modifierM118962N6);
            if (z15) {
                c28655q.m87150e0(1424179418);
                AbstractC21762c.m61467p(5 * f13, c28655q, 6);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1424254221);
                AbstractC21762c.m61461j(calendarClick, homeToolbarViewState, c38072d.m121952e(c28655q, i16).getH5(), c28655q, (C2886a.f11498d << 6) | ((i17 >> 9) & 14) | (i18 << 3) | ((i17 << 3) & 112));
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            interfaceC4339a = endArrowClick;
            AbstractC21762c.m61465n(homeToolbarViewState, interfaceC4339a, c28655q, ((i17 >> 3) & 112) | i25);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            z13 = z15;
        } else {
            interfaceC4339a = endArrowClick;
            c28655q.m87138X();
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C16544k(homeToolbarViewState, startArrowClick, interfaceC4339a, calendarClick, z13, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m61451c(C18614b c18614b, InterfaceC4339a interfaceC4339a, InterfaceC4339a interfaceC4339a2, InterfaceC4339a interfaceC4339a3, boolean z4, int i13, int i14, Composer composer, int i15) {
        m61450b(c18614b, interfaceC4339a, interfaceC4339a2, interfaceC4339a3, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
