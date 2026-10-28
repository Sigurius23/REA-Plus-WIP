package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22961h;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p571w3.C36775k;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.s0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lrq2/p0;", "step", "", "isCurrentStep", "Ll83/a0;", "b", "(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31750s0 {
    /* JADX INFO: renamed from: b */
    public static final void m98545b(C31744p0 step, boolean z4, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        boolean z13;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1117975952);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(step) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87155h(z4) ? 32 : 16;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (z4) {
            c28655q2.m87150e0(-1849607826);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
            C2305k c2305k = C2299e.f9111N;
            C22961h c22961h = AbstractC22977m.f90654e;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3406c);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            float f13 = 8;
            int i15 = i14;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 6 * f13, 7);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            AbstractC31748r0.m98536d(step, c28655q2, i15 & 14);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h, c2305k, c28655q2, 54);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            TextResource strainScore = step.getStrainScore();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(strainScore, c28655q2, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long brandWhite = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C2886a c2886aM8440u = c38072d.m121952e(c28655q2, i17).getN1();
            C36775k c36775k = new C36775k(3);
            int i18 = C2886a.f11498d;
            int i19 = i18 << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8440u, null, c28655q2, 0, i19, 196090);
            AbstractC22953f.m66715b(c28655q2, AbstractC1099a.m3394p(1 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(step.getStrainDate(), c28655q2, i16), null, EnumC39333f.WHITE_50.getColor(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getH3(), null, c28655q2, 0, i19, 196090);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            if (step.m98523h().isEmpty()) {
                z13 = false;
                c28655q.m87150e0(1849115836);
                AbstractC22776b.m65990b(AbstractC1136a.m3599a(AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2).mo3471e(new HorizontalAlignElement(C2299e.f9110M)), "StrainGaugeV2Footer"), step.getFooterText(), step.getFooterSubText(), c28655q, (i16 << 3) | (i16 << 6));
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1848788817);
                AbstractC30795n.m94704e(AbstractC21904c.m62321i(step.m98523h()), AbstractC1099a.m3396r(c2314t, 3 * f13, 0.0f, 2), c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(c28655q, i17).getT1(), c28655q, 48, i18 << 21, 131064);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            c28655q.m87173q(z13);
        } else {
            c28655q = c28655q2;
            c28655q.m87150e0(-1847599150);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31746q0(step, z4, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final C23454a0 m98546c(C31744p0 c31744p0, boolean z4, int i13, Composer composer, int i14) {
        m98545b(c31744p0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
