package p748zc1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import ih0.AbstractC18489d0;
import kd1.AbstractC22399k;
import l83.C23454a0;
import l83.C23465k;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22994r1;
import p291l0.C23000t1;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.C38072d;

/* JADX INFO: renamed from: zc1.p2 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m65681d2 = {"Ll83/a0;", "e", "(Landroidx/compose/runtime/Composer;I)V", "", "fillPercent", "Li91/a;", "background", "", "showIndicator", "c", "(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V", "design-showcase_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40430p2 {
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111  */
    /* JADX WARN: Code duplicated, block: B:53:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    private static final void m130581c(final float f13, final AbstractC18247a abstractC18247a, boolean z4, Composer composer, final int i13, final int i14) {
        int i15;
        boolean z13;
        boolean z14;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        boolean z16;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1590092816);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87147d(f13) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(abstractC18247a) : c28655q.m87157i(abstractC18247a) ? 32 : 16;
        }
        int i16 = i14 & 4;
        if (i16 == 0) {
            if ((i13 & 384) == 0) {
                z13 = z4;
                i15 |= c28655q.m87155h(z13) ? 256 : 128;
            }
            if ((i15 & 147) != 146) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i15 & 1, z14)) {
                if (i16 != 0) {
                    z16 = false;
                } else {
                    z16 = z13;
                }
                float f14 = 30;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
                int i17 = AbstractC18247a.f71043a << 9;
                AbstractC37692c.m121117c(null, f14, 1.0f, abstractC18247aM52577o, 0.0f, false, 0.0f, 0, null, c28655q, i17 | 432, 497);
                int i18 = i15 << 6;
                AbstractC37692c.m121117c(null, f14, f13, abstractC18247a, 0.0f, z16, 0.0f, 0, null, c28655q, i17 | (i18 & 896) | 48 | (i18 & 7168) | ((i15 << 9) & 458752), 465);
                c28655q.m87173q(true);
                z15 = z16;
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zc1.o2
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC40430p2.m130582d(f13, abstractC18247a, z15, i13, i14, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i15 |= 384;
        z13 = z4;
        if ((i15 & 147) != 146) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i15 & 1, z14)) {
            if (i16 != 0) {
                z16 = false;
            } else {
                z16 = z13;
            }
            float f15 = 30;
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            AbstractC18247a abstractC18247aM52577o2 = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
            int i19 = AbstractC18247a.f71043a << 9;
            AbstractC37692c.m121117c(null, f15, 1.0f, abstractC18247aM52577o2, 0.0f, false, 0.0f, 0, null, c28655q, i19 | 432, 497);
            int i110 = i15 << 6;
            AbstractC37692c.m121117c(null, f15, f13, abstractC18247a, 0.0f, z16, 0.0f, 0, null, c28655q, i19 | (i110 & 896) | 48 | (i110 & 7168) | ((i15 << 9) & 458752), 465);
            c28655q.m87173q(true);
            z15 = z16;
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: zc1.o2
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC40430p2.m130582d(f13, abstractC18247a, z15, i13, i14, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final C23454a0 m130582d(float f13, AbstractC18247a abstractC18247a, boolean z4, int i13, int i14, Composer composer, int i15) {
        m130581c(f13, abstractC18247a, z4, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: e */
    public static final void m130583e(Composer composer, int i13) {
        C0213j c0213j;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1795572836);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2;
            Modifier modifierM3394p = AbstractC1099a.m3394p(8 * f13, AbstractC1102d.m3407d(1.0f, c2314t));
            C22961h c22961h = AbstractC22977m.f90655f;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, C2299e.f9110M, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            AbstractC22399k.m64473c("Gauge - Fill Color", c28655q, 6);
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 6);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c0213j = c0213j2;
                c28655q.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            C23000t1 c23000t1 = C23000t1.f90727a;
            Modifier modifierMo66772c = c23000t1.mo66772c(c2314t, true, 1.0f);
            C2305k c2305k = C2299e.f9111N;
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierMo66772c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            AbstractC22399k.m64475e("25%", c28655q, 6);
            float f14 = 4;
            float f15 = f13 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C38072d c38072d = C38072d.f163053a;
            int i14 = C38072d.f163054b;
            AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(c38072d.m121949b(c28655q, i14).getRecoveryHighRecovery());
            int i15 = AbstractC18247a.f71043a << 3;
            int i16 = i15 | 6;
            C0213j c0213j3 = c0213j;
            m130581c(0.25f, abstractC18247aM52577o, false, c28655q, i16, 4);
            c28655q.m87173q(true);
            Modifier modifierMo66772c2 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierMo66772c2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            AbstractC22399k.m64475e("65%", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            int i17 = i15 | 390;
            m130581c(0.65f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, i14).getRecoveryHighRecovery()), true, c28655q, i17, 0);
            c28655q.m87173q(true);
            Modifier modifierMo66772c3 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo66772c3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
            AbstractC22399k.m64475e("90%", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            m130581c(0.9f, AbstractC18249c.m52577o(c38072d.m121949b(c28655q, i14).getRecoveryHighRecovery()), false, c28655q, i16, 4);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            AbstractC18489d0.m53380u(5, f14, c2314t, c28655q);
            AbstractC22399k.m64473c("Gauge - Gradient Color", c28655q, 6);
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 6);
            int iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
            Modifier modifierMo66772c4 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode7 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierMo66772c4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode7))) {
                AbstractC11266d.m30471y(iHashCode7, c28655q, iHashCode7, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
            AbstractC22399k.m64475e("25%", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            C17909s c17909s = AbstractC17911t.f69612b;
            m130581c(0.25f, AbstractC18249c.m52570h(C17909s.m51492j(c17909s, new C23465k[]{new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), false, c28655q, i16, 4);
            c28655q.m87173q(true);
            Modifier modifierMo66772c5 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode8 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierMo66772c5);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode8))) {
                AbstractC11266d.m30471y(iHashCode8, c28655q, iHashCode8, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
            AbstractC22399k.m64475e("65%", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            m130581c(0.65f, AbstractC18249c.m52570h(C17909s.m51492j(c17909s, new C23465k[]{new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), true, c28655q, i17, 0);
            c28655q.m87173q(true);
            Modifier modifierMo66772c6 = c23000t1.mo66772c(c2314t, true, 1.0f);
            C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 48);
            int iHashCode9 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo66772c6);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j3);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode9))) {
                AbstractC11266d.m30471y(iHashCode9, c28655q, iHashCode9, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
            AbstractC22399k.m64475e("90%", c28655q, 6);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t));
            m130581c(0.9f, AbstractC18249c.m52570h(C17909s.m51492j(c17909s, new C23465k[]{new C23465k(fValueOf2, new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(fValueOf, new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), false, c28655q, i16, 4);
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40388l2(i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m130584f(int i13, Composer composer, int i14) {
        m130583e(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
