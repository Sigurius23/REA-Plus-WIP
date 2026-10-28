package u21;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import com.whoop.design.util.AbstractC8693b;
import i51.C18112i;
import kd1.AbstractC22404p;
import l83.C23454a0;
import lz0.AbstractC24821f;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2307m;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p510u0.C34350r;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p734sl0.C32627j2;
import p745y81.InterfaceC39332e;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import t01.C33259e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: u21.c */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lu21/d;", "milestoneProgressCardState", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "f", "(Landroidx/compose/ui/Modifier;Lu21/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lu21/e;", "milestone", "d", "(Lu21/e;Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34483c {
    /* JADX INFO: renamed from: d */
    private static final void m108980d(C34485e c34485e, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1987389855);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87153g(c34485e) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C18112i celebrationMedia = c34485e.getCelebrationMedia();
            C2314t c2314t = C2314t.f9131w;
            if (celebrationMedia != null) {
                c28655q2.m87150e0(207117986);
                Modifier modifierM3419p = AbstractC1102d.m3419p(21 * 4, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3419p);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
                C0209i c0209i = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
                c28655q = c28655q2;
                AbstractC25303l.m74291r(C18112i.m51978b(c34485e.getCelebrationMedia(), null, null, null, null, null, true, 31, null), null, null, null, c28655q, 0, 14);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c28655q2.m87150e0(207420112);
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(c34485e.getImageSource(), null, null, c28655q2, 0, 3), null, AbstractC1102d.m3419p(21 * 4, c2314t), null, null, 0.0f, null, c28655q2, 432, 120);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32627j2(c34485e, i13, 6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m108981e(C34485e c34485e, int i13, Composer composer, int i14) {
        m108980d(c34485e, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x0288  */
    /* JADX WARN: Code duplicated, block: B:108:0x0385  */
    /* JADX WARN: Code duplicated, block: B:110:0x038d  */
    /* JADX WARN: Code duplicated, block: B:115:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:120:0x0416  */
    /* JADX WARN: Code duplicated, block: B:121:0x0420  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:62:0x0162  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0189  */
    /* JADX WARN: Code duplicated, block: B:72:0x0196  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:78:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:81:0x01db  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:87:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:90:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0239  */
    /* JADX WARN: Code duplicated, block: B:99:0x0269  */
    /* JADX INFO: renamed from: f */
    public static final void m108982f(Modifier modifier, C34484d milestoneProgressCardState, Function1 function1, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        Function1 function2;
        Function1 function3;
        C17919x c17919xM31989h;
        long strainZone5;
        Modifier modifier4;
        int iHashCode;
        C34485e c34485eM108985a;
        boolean z4;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4;
        int iHashCode5;
        C34485e c34485eM108987c;
        AbstractC22676k.m65750j(milestoneProgressCardState, "milestoneProgressCardState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(417942112);
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
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(milestoneProgressCardState) : c28655q.m87157i(milestoneProgressCardState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier5 = i16 != 0 ? c2314t : modifier2;
            if ((i14 & 4) != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C34350r(20);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            InterfaceC39332e interfaceC39332eM108988e = milestoneProgressCardState.getProgressBarColor();
            if (interfaceC39332eM108988e == null) {
                c28655q.m87150e0(-196499794);
                c28655q.m87173q(false);
                c17919xM31989h = null;
            } else {
                c28655q.m87150e0(-2084548685);
                c17919xM31989h = AbstractC11895b.m31989h(c28655q, false, interfaceC39332eM108988e.mo134584toComposableColorWaAFU9c(c28655q, 0));
            }
            if (c17919xM31989h == null) {
                c28655q.m87150e0(-2084547125);
                strainZone5 = C38072d.f163053a.m121949b(c28655q, 6).getStrainZone5();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-2084550039);
                c28655q.m87173q(false);
                strainZone5 = c17919xM31989h.f69639a;
            }
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier5);
            C38072d c38072d = C38072d.f163053a;
            float f13 = 4;
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13 * f13, AbstractC1092a.m3358c(modifierM3409f, c38072d.m121949b(c28655q, 6).getWhite5(), AbstractC33253j.m105489e(16)));
            C2307m c2307m = C2299e.f9114w;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode6 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3394p);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                modifier4 = modifier5;
            } else {
                modifier4 = modifier5;
                if (!AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode6))) {
                }
                C0209i c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
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
                c34485eM108985a = milestoneProgressCardState.getCurrentMilestone();
                if (c34485eM108985a == null) {
                    c28655q.m87150e0(-725417045);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-725417044);
                    m108980d(c34485eM108985a, c28655q, 0);
                    c28655q.m87173q(false);
                }
                if (1.0f > 0.0d) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9102E, false);
                long j7 = strainZone5;
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                InterfaceC39127r0 interfaceC39127r0M66763d3 = AbstractC22989q.m66763d(c2307m, false);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d3);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                C2305k c2305k = C2299e.f9111N;
                float f14 = 1;
                float f15 = 8 * f14;
                Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 0.0f, f15, 1);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k, c28655q, 48);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                float f16 = f14 * f13;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(milestoneProgressCardState.getTitle(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f16, 7), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 0, 196088);
                AbstractC24821f.m72736b(null, (int) (milestoneProgressCardState.getProgressPercent() * ((double) 100)), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j7), new C17919x(j7)), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, 6).getWhite10(), false, f16, c28655q, 1769856, 1);
                Modifier modifierM3424u = AbstractC1102d.m3424u(35 * f13, c2314t);
                InterfaceC39127r0 interfaceC39127r0M66763d4 = AbstractC22989q.m66763d(C2299e.f9115x, false);
                iHashCode5 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, modifierM3424u);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode5))) {
                    AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(milestoneProgressCardState.getDescription(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f15, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 0, 196088);
                c28655q = c28655q;
                AbstractC2875y.m8286B(c28655q, true, true, true, true);
                c34485eM108987c = milestoneProgressCardState.getNextMilestone();
                if (c34485eM108987c == null) {
                    c28655q.m87150e0(-723272341);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-723272340);
                    m108980d(c34485eM108987c, c28655q, 0);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                function2 = function3;
                modifier3 = modifier4;
            }
            AbstractC11266d.m30471y(iHashCode6, c28655q, iHashCode6, c0209i3);
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, C2299e.f9108K, c28655q, 54);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
            Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N7);
            c34485eM108985a = milestoneProgressCardState.getCurrentMilestone();
            if (c34485eM108985a == null) {
                c28655q.m87150e0(-725417045);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-725417044);
                m108980d(c34485eM108985a, c28655q, 0);
                c28655q.m87173q(false);
            }
            if (1.0f > 0.0d) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z4) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d5 = AbstractC22989q.m66763d(C2299e.f9102E, false);
            long j13 = strainZone5;
            iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
            Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, layoutWeightElement2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d5);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N8);
            InterfaceC39127r0 interfaceC39127r0M66763d6 = AbstractC22989q.m66763d(c2307m, false);
            iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
            Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d6);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N9);
            C2305k c2305k2 = C2299e.f9111N;
            float f17 = 1;
            float f18 = 8 * f17;
            Modifier modifierM3396r2 = AbstractC1099a.m3396r(c2314t, 0.0f, f18, 1);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90652c, c2305k2, c28655q, 48);
            iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
            Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, modifierM3396r2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N10);
            float f19 = f17 * f13;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(milestoneProgressCardState.getTitle(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f19, 7), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 0, 196088);
            AbstractC24821f.m72736b(null, (int) (milestoneProgressCardState.getProgressPercent() * ((double) 100)), 100, C17909s.m51483a(AbstractC17911t.f69612b, AbstractC37056f.m118959K(new C17919x(j13), new C17919x(j13)), 0.0f, 0.0f, 14), c38072d.m121949b(c28655q, 6).getWhite10(), false, f19, c28655q, 1769856, 1);
            Modifier modifierM3424u2 = AbstractC1102d.m3424u(35 * f13, c2314t);
            InterfaceC39127r0 interfaceC39127r0M66763d7 = AbstractC22989q.m66763d(C2299e.f9115x, false);
            iHashCode5 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
            Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, modifierM3424u2);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d7);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode5, c28655q, iHashCode5, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N11);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(milestoneProgressCardState.getDescription(), c28655q, 0), AbstractC1099a.m3398t(c2314t, 0.0f, f18, 0.0f, 0.0f, 13), c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 48, 0, 196088);
            c28655q = c28655q;
            AbstractC2875y.m8286B(c28655q, true, true, true, true);
            c34485eM108987c = milestoneProgressCardState.getNextMilestone();
            if (c34485eM108987c == null) {
                c28655q.m87150e0(-723272341);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-723272340);
                m108980d(c34485eM108987c, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            function2 = function3;
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C33259e(modifier3, milestoneProgressCardState, function2, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m108983g(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m108984h(Modifier modifier, C34484d c34484d, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m108982f(modifier, c34484d, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
