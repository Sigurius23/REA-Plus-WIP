package rq2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hb3.AbstractC17104a0;
import i91.AbstractC18247a;
import i91.AbstractC18249c;
import jr2.AbstractC21904c;
import kq2.AbstractC22776b;
import l83.C23454a0;
import l83.C23465k;
import os0.C28308d;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p208i2.C17909s;
import p208i2.C17919x;
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
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p718lz1.C24823a;
import p745y81.EnumC39333f;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wy0.AbstractC37692c;
import x81.C38072d;

/* JADX INFO: renamed from: rq2.r0 */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m65681d2 = {"Lrq2/p0;", "step", "", "isCurrentStep", "Ll83/a0;", "f", "(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V", "d", "(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC31748r0 {
    /* JADX INFO: renamed from: d */
    public static final void m98536d(C31744p0 step, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(97362109);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
            float f13 = 165;
            float f14 = 4;
            float f15 = f14 * f14;
            AbstractC18247a abstractC18247aM52577o = AbstractC18249c.m52577o(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite10());
            int i15 = AbstractC18247a.f71043a << 9;
            AbstractC37692c.m121117c(null, f13, 1.0f, abstractC18247aM52577o, f15, false, 0.0f, 0, null, c28655q, i15 | 25008, 481);
            AbstractC37692c.m121117c(null, f13, step.getFillPercentage(), AbstractC18249c.m52570h(C17909s.m51492j(AbstractC17911t.f69612b, new C23465k[]{new C23465k(Float.valueOf(0.0f), new C17919x(AbstractC17918w0.m51517e(4279446623L))), new C23465k(Float.valueOf(1.0f), new C17919x(AbstractC17918w0.m51517e(4284931583L)))})), f15, false, 0.0f, 0, null, c28655q, i15 | 24624, 481);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(step, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m98537e(C31744p0 c31744p0, int i13, Composer composer, int i14) {
        m98536d(c31744p0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: f */
    public static final void m98538f(C31744p0 step, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(step, "step");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1965174600);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(step) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-1268512130, c28655q, new C24823a(step, 24)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C31746q0(step, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m98539g(C31744p0 c31744p0, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        Modifier modifierM3406c = AbstractC1102d.m3406c(1.0f, c2314t);
        C2305k c2305k = C2299e.f9111N;
        C22961h c22961h = AbstractC22977m.f90654e;
        C23010x c23010xM66775a = AbstractC23007w.m66775a(c22961h, c2305k, composer, 54);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3406c);
        InterfaceC0221l.f734a.getClass();
        C0213j c0213j = C0217k.f724b;
        AbstractC17104a0 abstractC17104a0 = c28655q.f115906a;
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        C0209i c0209i = C0217k.f729g;
        AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a);
        C0209i c0209i2 = C0217k.f728f;
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m);
        C0209i c0209i3 = C0217k.f732j;
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
            AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
        }
        C0209i c0209i4 = C0217k.f726d;
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N);
        float f13 = 8;
        Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, 6 * f13, 7);
        InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3398t);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, interfaceC39127r0M66763d);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        m98536d(c31744p0, composer, 0);
        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22961h, c2305k, composer, 54);
        int iHashCode3 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
        Modifier modifierM118962N3 = AbstractC37056f.m118962N(composer, c2314t);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, c23010xM66775a2);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m3);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N3);
        TextResource strainScore = c31744p0.getStrainScore();
        int i14 = TextResource.$stable;
        String strM21274h = AbstractC8693b.m21274h(strainScore, composer, i14);
        C38072d c38072d = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        long brandWhite = c38072d.m121949b(composer, i15).getBrandWhite();
        C2886a c2886aM8440u = c38072d.m121952e(composer, i15).getN1();
        C36775k c36775k = new C36775k(3);
        int i16 = C2886a.f11498d;
        int i17 = i16 << 18;
        AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8440u, null, composer, 0, i17, 196090);
        AbstractC22953f.m66715b(composer, AbstractC1099a.m3394p(1 * f13, c2314t));
        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c31744p0.getStrainDate(), composer, i14), null, EnumC39333f.WHITE_50.getColor(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i15).getH3(), null, composer, 0, i17, 196090);
        C28655q c28655q2 = c28655q;
        c28655q2.m87173q(true);
        c28655q2.m87173q(true);
        if (c31744p0.m98523h().isEmpty()) {
            c28655q2.m87150e0(-1835261633);
            AbstractC22776b.m65990b(AbstractC13673n.m38560g(C2299e.f9110M, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), ((float) 2.5d) * f13, 0.0f, 2)), c31744p0.getFooterText(), c31744p0.getFooterSubText(), composer, (i14 << 3) | (i14 << 6));
            c28655q2.m87173q(false);
        } else {
            c28655q2.m87150e0(-1835586916);
            AbstractC30795n.m94704e(AbstractC21904c.m62321i(c31744p0.m98523h()), AbstractC1099a.m3396r(c2314t, 3 * f13, 0.0f, 2), c38072d.m121949b(composer, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c38072d.m121952e(composer, i15).getT1(), composer, 48, i16 << 21, 131064);
            c28655q2 = c28655q2;
            c28655q2.m87173q(false);
        }
        c28655q2.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m98540h(C31744p0 c31744p0, boolean z4, int i13, Composer composer, int i14) {
        m98538f(c31744p0, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
