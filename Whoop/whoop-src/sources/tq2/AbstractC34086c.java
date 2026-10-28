package tq2;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hb3.AbstractC17104a0;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p040c0.InterfaceC3747i0;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.AbstractC24669a;
import p718lz1.C24823a;
import qz0.AbstractC30795n;
import so2.C32848f;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: tq2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Ltq2/g;", "viewState", "", "isCurrentStep", "Ll83/a0;", "d", "(Ltq2/g;ZLandroidx/compose/runtime/Composer;I)V", "Ltq2/h;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "g", "(Ltq2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V", "user-journey_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34086c {
    /* JADX INFO: renamed from: d */
    public static final void m107746d(C34090g viewState, boolean z4, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-985846600);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            AbstractC24669a.m72061e(z4, AbstractC37817c.m121344e(-1220682770, c28655q, new C24823a(viewState, 27)), c28655q, ((i14 >> 3) & 14) | 48);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34085b(viewState, z4, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m107747e(C34090g c34090g, InterfaceC3747i0 BasicAnimationComponent, Composer composer, int i13) {
        AbstractC22676k.m65750j(BasicAnimationComponent, "$this$BasicAnimationComponent");
        C2314t c2314t = C2314t.f9131w;
        float f13 = 8;
        float f14 = ((float) 2.5d) * f13;
        Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, c2314t), f14, 3 * f13, f14, 0.0f, 8);
        C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, composer, 6);
        C28655q c28655q = (C28655q) composer;
        int iHashCode = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
        Modifier modifierM118962N = AbstractC37056f.m118962N(composer, modifierM3398t);
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
        float f15 = 2 * f13;
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3413j(c2314t, f15, 0.0f, 2));
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        Modifier modifierM3396r = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f, true), 1 * f13, 0.0f, 2);
        C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, C2299e.f9109L, composer, 54);
        int iHashCode2 = Long.hashCode(c28655q.f115904T);
        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
        Modifier modifierM118962N2 = AbstractC37056f.m118962N(composer, modifierM3396r);
        c28655q.m87158i0();
        if (c28655q.f115903S) {
            c28655q.m87163l(c0213j);
        } else {
            c28655q.m87178s0();
        }
        AbstractC28683x.m87239G(composer, c0209i, c22994r1M66759a);
        AbstractC28683x.m87239G(composer, c0209i2, interfaceC28653p1M87165m2);
        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
        }
        AbstractC28683x.m87239G(composer, c0209i4, modifierM118962N2);
        C34091h leftBar = c34090g.getLeftBar();
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        Modifier modifierM3396r2 = AbstractC1099a.m3396r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f15, 0.0f, 2);
        int i14 = TextResource.$stable;
        m107749g(leftBar, modifierM3396r2, composer, i14);
        C34091h rightBar = c34090g.getRightBar();
        if (1.0f <= 0.0d) {
            AbstractC24868a.m72899a("invalid weight; must be greater than zero");
        }
        m107749g(rightBar, AbstractC1099a.m3396r(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), f15, 0.0f, 2), composer, i14);
        c28655q.m87173q(true);
        float f16 = 4;
        Modifier modifierM3411h = AbstractC1102d.m3411h(((float) 0.25d) * f16, AbstractC1102d.m3409f(1.0f, c2314t));
        C38072d c38072d = C38072d.f163053a;
        int i15 = C38072d.f163054b;
        AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM3411h, c38072d.m121949b(composer, i15).getWhite10(), AbstractC17918w0.f69621a), composer, 0);
        AbstractC22953f.m66715b(composer, AbstractC1102d.m3411h(10 * f16, c2314t));
        Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7);
        String strM21274h = AbstractC8693b.m21274h(c34090g.getFooterText(), composer, i14);
        C2886a c2886aM8416N = c38072d.m121952e(composer, i15).getT1();
        long brandWhite = c38072d.m121949b(composer, i15).getBrandWhite();
        int i16 = C2886a.f11498d << 18;
        AbstractC30795n.m94707h(strM21274h, modifierM3398t2, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, composer, 48, i16, 196600);
        AbstractC30795n.m94707h(AbstractC8693b.m21274h(c34090g.getFooterSubText(), composer, i14), null, c38072d.m121949b(composer, i15).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(composer, i15).getB1(), null, composer, 0, i16, 196602);
        c28655q.m87173q(true);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m107748f(C34090g c34090g, boolean z4, int i13, Composer composer, int i14) {
        m107746d(c34090g, z4, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public static final void m107749g(C34091h state, Modifier modifier, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(state, "state");
        AbstractC22676k.m65750j(modifier, "modifier");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1995535945);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(state) : c28655q2.m87157i(state) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87153g(modifier) ? 32 : 16;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90653d, C2299e.f9110M, c28655q2, 6);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier);
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
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9109L, c28655q2, 48);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            TextResource labelText = state.getLabelText();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(labelText, c28655q2, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            C2886a c2886aM8443x = c38072d.m121952e(c28655q2, i16).getN3();
            long brandWhite = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8443x, null, c28655q2, 0, i17, 196602);
            float f13 = (float) 0.5d;
            float f14 = f13 * 8;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getLabelSuffix(), c28655q2, i15), AbstractC1099a.m3398t(c2314t, f14, 0.0f, 0.0f, f14, 6), c38072d.m121949b(c28655q2, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getT2(), null, c28655q2, 48, i17, 196600);
            c28655q2.m87173q(true);
            float f15 = 4;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(AbstractC1102d.m3411h(2 * f15, AbstractC1102d.m3409f(1.0f, c2314t)), state.getBarColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), AbstractC17918w0.f69621a), c28655q2, 0);
            Modifier modifierM3357b = AbstractC1092a.m3357b(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3406c(state.getFillPercentage(), c2314t)), state.getBarBrush(), null, 0.0f, 6);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode3 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM3357b);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N3);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(state.getLabelSubtext(), c28655q2, i15), AbstractC1099a.m3398t(c2314t, 0.0f, f13 * f15, 0.0f, 0.0f, 13), state.getLabelColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getN7(), null, c28655q2, 48, i17, 196600);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C32848f(state, modifier, i13, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m107750h(C34091h c34091h, Modifier modifier, int i13, Composer composer, int i14) {
        m107749g(c34091h, modifier, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
