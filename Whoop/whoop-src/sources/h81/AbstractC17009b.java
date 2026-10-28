package h81;

import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.EnumC2888c;
import fc0.C14361e;
import gz0.EnumC16313m0;
import hy0.AbstractC17746g1;
import hy0.C17750h1;
import ih0.AbstractC18489d0;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h81.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lh81/c;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Ll83/a0;", "b", "(Lh81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC17009b {
    /* JADX WARN: Code duplicated, block: B:23:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005c  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0090  */
    /* JADX WARN: Code duplicated, block: B:34:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x012d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0139  */
    /* JADX WARN: Code duplicated, block: B:49:0x0143  */
    /* JADX WARN: Code duplicated, block: B:51:0x0171  */
    /* JADX WARN: Code duplicated, block: B:54:0x019e  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:67:0x01de  */
    /* JADX WARN: Code duplicated, block: B:69:0x0280  */
    /* JADX WARN: Code duplicated, block: B:72:0x028a  */
    /* JADX WARN: Code duplicated, block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: b */
    public static final void m47963b(C17010c viewState, Modifier modifier, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        boolean z4;
        Modifier modifier3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Modifier modifier4;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        AbstractC22403o abstractC22403oM47966b;
        int i16;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        C0213j c0213j2;
        Modifier modifier5;
        boolean z13;
        C23454a0 c23454a0;
        float f13;
        int iHashCode2;
        C17750h1 c17750h1M47968e;
        int i17;
        EnumC16313m0 enumC16313m0M47965a;
        Float fValueOf = Float.valueOf(1.0f);
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(686075065);
        if ((i13 & 6) == 0) {
            i15 = i13 | (c28655q.m87157i(viewState) ? 4 : 2);
        } else {
            i15 = i13;
        }
        int i18 = i14 & 2;
        if (i18 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            if ((i15 & 19) != 18) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i18 != 0) {
                    modifier4 = c2314t;
                } else {
                    modifier4 = modifier2;
                }
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
                float f14 = 8;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f14), C2299e.f9108K, c28655q, 54);
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
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                C0209i c0209i7 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m);
                c0209i2 = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
                }
                c0209i3 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N);
                abstractC22403oM47966b = viewState.getImage();
                if (abstractC22403oM47966b == null) {
                    c28655q.m87150e0(-40892285);
                    c28655q.m87173q(false);
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    modifier5 = modifier4;
                    c0213j2 = c0213j;
                    c0209i6 = c0209i;
                    c23454a0 = null;
                    z13 = false;
                    i16 = 12;
                } else {
                    c28655q.m87150e0(-40892284);
                    i16 = 12;
                    c0209i4 = c0209i3;
                    c0209i5 = c0209i2;
                    c0209i6 = c0209i;
                    c0213j2 = c0213j;
                    modifier5 = modifier4;
                    AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM47966b, null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(12 * 4, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                    c28655q = c28655q;
                    z13 = false;
                    c28655q.m87173q(false);
                    c23454a0 = C23454a0.f92919a;
                }
                if (c23454a0 == null) {
                    c28655q.m87150e0(-40616694);
                    enumC16313m0M47965a = viewState.getIcon();
                    if (enumC16313m0M47965a == null) {
                        c28655q.m87150e0(-40616695);
                        c28655q.m87173q(z13);
                    } else {
                        C28655q c28655q2 = c28655q;
                        AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, -40616694, enumC16313m0M47965a, c28655q, 6), null, AbstractC1102d.m3419p(i16 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q2, 432, 0);
                        c28655q = c28655q2;
                        z13 = false;
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(-1319330);
                    c28655q.m87173q(z13);
                }
                f13 = ((float) 0.5d) * f14;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i7, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c17750h1M47968e = viewState.getTag();
                if (c17750h1M47968e == null) {
                    c28655q.m87150e0(-692565192);
                    i17 = 0;
                    c28655q.m87173q(false);
                } else {
                    i17 = 0;
                    c28655q.m87150e0(-692565191);
                    AbstractC17746g1.m50872h(c17750h1M47968e, null, null, c28655q, 0, 6);
                    AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
                }
                String text = viewState.getTitle().getText();
                EnumC2888c.Companion companion = EnumC2888c.INSTANCE;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(text, null, viewState.getTitle().getColor().mo134584toComposableColorWaAFU9c(c28655q, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, companion.m8402a(viewState.getTitle().getStyle()), fValueOf, c28655q3, 0, 12582912, 65530);
                AbstractC30795n.m94707h(viewState.getSubtitle().getText(), null, viewState.getSubtitle().getColor().mo134584toComposableColorWaAFU9c(c28655q3, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, companion.m8402a(viewState.getSubtitle().getStyle()), fValueOf, c28655q3, 0, 12582912, 65530);
                c28655q = c28655q3;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 17);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        if ((i15 & 19) != 18) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i18 != 0) {
                modifier4 = c2314t;
            } else {
                modifier4 = modifier2;
            }
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, modifier4);
            float f15 = 8;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(2 * f15), C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            C0209i c0209i8 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m3);
            c0209i2 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i2);
            }
            c0209i3 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i3, modifierM118962N3);
            abstractC22403oM47966b = viewState.getImage();
            if (abstractC22403oM47966b == null) {
                c28655q.m87150e0(-40892285);
                c28655q.m87173q(false);
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                modifier5 = modifier4;
                c0213j2 = c0213j;
                c0209i6 = c0209i;
                c23454a0 = null;
                z13 = false;
                i16 = 12;
            } else {
                c28655q.m87150e0(-40892284);
                i16 = 12;
                c0209i4 = c0209i3;
                c0209i5 = c0209i2;
                c0209i6 = c0209i;
                c0213j2 = c0213j;
                modifier5 = modifier4;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM47966b, null, null, c28655q, 0, 3), null, AbstractC1102d.m3419p(12 * 4, c2314t), null, C39102j.f168200b, 0.0f, null, c28655q, 25008, 104);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
                c23454a0 = C23454a0.f92919a;
            }
            if (c23454a0 == null) {
                c28655q.m87150e0(-40616694);
                enumC16313m0M47965a = viewState.getIcon();
                if (enumC16313m0M47965a == null) {
                    c28655q.m87150e0(-40616695);
                    c28655q.m87173q(z13);
                } else {
                    C28655q c28655q4 = c28655q;
                    AbstractC15005f3.m43108b(AbstractC18489d0.m53378s(c28655q, -40616694, enumC16313m0M47965a, c28655q, 6), null, AbstractC1102d.m3419p(i16 * 4, c2314t), C38072d.f163053a.m121949b(c28655q, 6).getWhite50(), c28655q4, 432, 0);
                    c28655q = c28655q4;
                    z13 = false;
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(-1319330);
                c28655q.m87173q(z13);
            }
            f13 = ((float) 0.5d) * f15;
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f13), C2299e.f9110M, c28655q, 6);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i8, interfaceC28653p1M87165m4);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
            c17750h1M47968e = viewState.getTag();
            if (c17750h1M47968e == null) {
                c28655q.m87150e0(-692565192);
                i17 = 0;
                c28655q.m87173q(false);
            } else {
                i17 = 0;
                c28655q.m87150e0(-692565191);
                AbstractC17746g1.m50872h(c17750h1M47968e, null, null, c28655q, 0, 6);
                AbstractC30007c.m91851u(c2314t, f13, c28655q, false);
            }
            String text2 = viewState.getTitle().getText();
            EnumC2888c.Companion companion2 = EnumC2888c.INSTANCE;
            C28655q c28655q5 = c28655q;
            AbstractC30795n.m94707h(text2, null, viewState.getTitle().getColor().mo134584toComposableColorWaAFU9c(c28655q, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, companion2.m8402a(viewState.getTitle().getStyle()), fValueOf, c28655q5, 0, 12582912, 65530);
            AbstractC30795n.m94707h(viewState.getSubtitle().getText(), null, viewState.getSubtitle().getColor().mo134584toComposableColorWaAFU9c(c28655q5, i17), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, companion2.m8402a(viewState.getSubtitle().getStyle()), fValueOf, c28655q5, 0, 12582912, 65530);
            c28655q = c28655q5;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C14361e(viewState, i13, modifier3, i14, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m47964c(C17010c c17010c, Modifier modifier, int i13, int i14, Composer composer, int i15) {
        m47963b(c17010c, modifier, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
