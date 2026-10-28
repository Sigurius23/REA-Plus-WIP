package zq0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
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
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p331n2.AbstractC26165a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p490t0.C33252i;
import p635y2.C39077b1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33207p;
import p736sz0.C33210q;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import zi1.C40670c0;

/* JADX INFO: renamed from: zq0.t */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzq0/u;", "viewState", "Ll83/a0;", "b", "(Landroidx/compose/ui/Modifier;Lzq0/u;Landroidx/compose/runtime/Composer;II)V", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40979t {
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0133  */
    /* JADX WARN: Code duplicated, block: B:49:0x014e  */
    /* JADX WARN: Code duplicated, block: B:52:0x018c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0190  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:71:0x0222  */
    /* JADX WARN: Code duplicated, block: B:74:0x0248  */
    /* JADX WARN: Code duplicated, block: B:75:0x024c  */
    /* JADX WARN: Code duplicated, block: B:82:0x026b  */
    /* JADX WARN: Code duplicated, block: B:85:0x034c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0354  */
    /* JADX WARN: Code duplicated, block: B:92:0x0372  */
    /* JADX WARN: Code duplicated, block: B:98:0x0395 A[LOOP:0: B:96:0x038f->B:98:0x0395, LOOP_END] */
    /* JADX INFO: renamed from: b */
    public static final void m133060b(Modifier modifier, C40980u viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        float f13;
        int iHashCode;
        int iHashCode2;
        boolean z4;
        C39077b1 c39077b1;
        Modifier modifierM118994r;
        int iHashCode3;
        int iHashCode4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-217314866);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = i13 | (c28655q.m87153g(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(viewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            float f14 = 4;
            float f15 = 3 * f14;
            C33252i c33252iM105489e = AbstractC33253j.m105489e(f15);
            C33252i c33252iM105489e2 = AbstractC33253j.m105489e(2 * f14);
            float f16 = 18 * f14;
            float f17 = 14 * f14;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            Modifier modifierM118994r2 = AbstractC37056f.m118994r(AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, i17).getWhite5(), c33252iM105489e), c33252iM105489e);
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM118994r2);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            Modifier modifier5 = modifier4;
            if (c28655q.f115903S) {
                f13 = f14;
            } else {
                f13 = f14;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i17).getWhite5(), c33252iM105489e);
                float f18 = 1 * f13;
                float f19 = f13 * f13;
                Modifier modifierM3397s = AbstractC1099a.m3397s(modifierM3358c, f18, f18, f19, f18);
                C2306l c2306l = C2299e.f9108K;
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3397s);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                Modifier modifierM118994r3 = AbstractC37056f.m118994r(AbstractC1092a.m3358c(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(f16, c2314t)), viewState.getImageBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c33252iM105489e2), c33252iM105489e2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM118994r3);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                z4 = viewState.getImage() instanceof AbstractC22403o.a;
                AbstractC26165a abstractC26165aM64500i = AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
                if (z4) {
                    c39077b1 = C39102j.f168200b;
                } else {
                    c39077b1 = C39102j.f168199a;
                }
                C39077b1 c39077b2 = c39077b1;
                if (z4) {
                    modifierM118994r = AbstractC1102d.m3419p(8 * f13, c2314t);
                } else {
                    modifierM118994r = AbstractC37056f.m118994r(C1100b.f4583a.mo3401b(c2314t), c33252iM105489e2);
                }
                AbstractC29125c.m88522c(abstractC26165aM64500i, null, modifierM118994r, null, c39077b2, 0.0f, null, c28655q, 48, 104);
                c28655q.m87173q(true);
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                TextResource title = viewState.getTitle();
                int i18 = TextResource.$stable;
                String strM21274h = AbstractC8693b.m21274h(title, c28655q, i18);
                C2886a b6 = c38072d.m121952e(c28655q, i17).getB2();
                long brandWhite = c38072d.m121949b(c28655q, i17).getBrandWhite();
                int i19 = C2886a.f11498d << 18;
                AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q, 0, i19, 196602);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i18), null, viewState.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q, 0, i19, 196602);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f13, f19, 0.0f, f19, 4);
                C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(9, f13, c2306l, c28655q, 54);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                c28655q.m87150e0(-488873919);
                for (C33210q c33210q : viewState.m133064c()) {
                    TextResource stat = c33210q.getStat();
                    TextResource statSuffix = c33210q.getStatSuffix();
                    TextResource statTitle = c33210q.getStatTitle();
                    C38072d c38072d2 = C38072d.f163053a;
                    int i24 = C38072d.f163054b;
                    long brandWhite2 = c38072d2.m121949b(c28655q, i24).getBrandWhite();
                    long white50 = c38072d2.m121949b(c28655q, i24).getWhite50();
                    C2886a n13 = c38072d2.m121952e(c28655q, i24).getN6();
                    C2886a b8 = c38072d2.m121952e(c28655q, i24).getB2();
                    C2886a sh5 = c38072d2.m121952e(c28655q, i24).getSh5();
                    int i25 = TextResource.$stable;
                    int i26 = (i25 << 6) | (i25 << 12) | (i25 << 21);
                    int i27 = C2886a.f11498d;
                    C28655q c28655q2 = c28655q;
                    AbstractC33207p.m105301e(null, null, stat, null, statSuffix, null, null, statTitle, false, brandWhite2, white50, n13, b8, sh5, false, null, c28655q2, i26, (i27 << 3) | (i27 << 6) | (i27 << 9), 49515);
                    c28655q = c28655q2;
                }
                AbstractC25012a.m73392y(c28655q, false, true, true);
                modifier3 = modifier5;
            }
            AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3358c2 = AbstractC1092a.m3358c(AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i17).getWhite5(), c33252iM105489e);
            float f110 = 1 * f13;
            float f111 = f13 * f13;
            Modifier modifierM3397s2 = AbstractC1099a.m3397s(modifierM3358c2, f110, f110, f111, f110);
            C2306l c2306l2 = C2299e.f9108K;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), c2306l2, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3397s2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N6);
            Modifier modifierM118994r4 = AbstractC37056f.m118994r(AbstractC1092a.m3358c(AbstractC1102d.m3411h(f17, AbstractC1102d.m3424u(f16, c2314t)), viewState.getImageBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c33252iM105489e2), c33252iM105489e2);
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM118994r4);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
            z4 = viewState.getImage() instanceof AbstractC22403o.a;
            AbstractC26165a abstractC26165aM64500i2 = AbstractC22404p.m64500i(viewState.getImage(), null, null, c28655q, AbstractC22403o.f87638a, 3);
            if (z4) {
                c39077b1 = C39102j.f168200b;
            } else {
                c39077b1 = C39102j.f168199a;
            }
            C39077b1 c39077b3 = c39077b1;
            if (z4) {
                modifierM118994r = AbstractC1102d.m3419p(8 * f13, c2314t);
            } else {
                modifierM118994r = AbstractC37056f.m118994r(C1100b.f4583a.mo3401b(c2314t), c33252iM105489e2);
            }
            AbstractC29125c.m88522c(abstractC26165aM64500i2, null, modifierM118994r, null, c39077b3, 0.0f, null, c28655q, 48, 104);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a3 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, c2305k, c28655q, 6);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N8);
            TextResource title2 = viewState.getTitle();
            int i110 = TextResource.$stable;
            String strM21274h2 = AbstractC8693b.m21274h(title2, c28655q, i110);
            C2886a b14 = c38072d.m121952e(c28655q, i17).getB2();
            long brandWhite3 = c38072d.m121949b(c28655q, i17).getBrandWhite();
            int i111 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, null, brandWhite3, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b14, null, c28655q, 0, i111, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getSubtitle(), c28655q, i110), null, viewState.getSubtitleColor().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB3(), null, c28655q, 0, i111, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 5 * f13, f111, 0.0f, f111, 4);
            C22994r1 c22994r1M53376q2 = AbstractC18489d0.m53376q(9, f13, c2306l2, c28655q, 54);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierM3398t2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N9);
            c28655q.m87150e0(-488873919);
            while (r0.hasNext()) {
                TextResource stat2 = c33210q.getStat();
                TextResource statSuffix2 = c33210q.getStatSuffix();
                TextResource statTitle2 = c33210q.getStatTitle();
                C38072d c38072d3 = C38072d.f163053a;
                int i28 = C38072d.f163054b;
                long brandWhite4 = c38072d3.m121949b(c28655q, i28).getBrandWhite();
                long white51 = c38072d3.m121949b(c28655q, i28).getWhite50();
                C2886a n14 = c38072d3.m121952e(c28655q, i28).getN6();
                C2886a b15 = c38072d3.m121952e(c28655q, i28).getB2();
                C2886a sh6 = c38072d3.m121952e(c28655q, i28).getSh5();
                int i29 = TextResource.$stable;
                int i210 = (i29 << 6) | (i29 << 12) | (i29 << 21);
                int i211 = C2886a.f11498d;
                C28655q c28655q3 = c28655q;
                AbstractC33207p.m105301e(null, null, stat2, null, statSuffix2, null, null, statTitle2, false, brandWhite4, white51, n14, b15, sh6, false, null, c28655q3, i210, (i211 << 3) | (i211 << 6) | (i211 << 9), 49515);
                c28655q = c28655q3;
            }
            AbstractC25012a.m73392y(c28655q, false, true, true);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(modifier3, i13, viewState, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m133061c(Modifier modifier, C40980u c40980u, int i13, int i14, Composer composer, int i15) {
        m133060b(modifier, c40980u, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
