package ej1;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d62.C11736b;
import e93.AbstractC12889b;
import gb1.AbstractC15676d;
import hy0.AbstractC17799w1;
import hy0.AbstractC17808z1;
import i91.AbstractC18249c;
import kd1.C22411w;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2314t;
import p208i2.C17919x;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.AbstractC37817c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.C39336i;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: ej1.i0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lej1/j0;", "itemState", "Ll83/a0;", "d", "(Landroidx/compose/ui/Modifier;Lej1/j0;Landroidx/compose/runtime/Composer;II)V", "health_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC13245i0 {

    /* JADX INFO: renamed from: ej1.i0$a */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements Function1 {

        /* JADX INFO: renamed from: w */
        public static final a f45880w = new a();

        /* JADX INFO: renamed from: a */
        public final long m37215a(C39336i colorBackground) {
            AbstractC22676k.m65750j(colorBackground, "$this$colorBackground");
            return colorBackground.getWhite10();
        }

        @Override // p715kotlin.jvm.functions.Function1
        public /* synthetic */ Object invoke(Object obj) {
            return new C17919x(m37215a((C39336i) obj));
        }
    }

    /* JADX INFO: renamed from: d */
    public static final void m37211d(Modifier modifier, C13247j0 itemState, Composer composer, int i13, int i14) {
        int i15;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(341816492);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(itemState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            AbstractC12889b.m36263b(AbstractC1102d.m3409f(1.0f, modifier), C22411w.f87680a.m64536b().m64090c(), C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBlack20(), null, 0, AbstractC37817c.m121344e(2079956239, c28655q, new C13242h(itemState, 1)), c28655q, 1769472, 24);
        } else {
            c28655q.m87138X();
        }
        Modifier modifier2 = modifier;
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11736b(modifier2, i13, itemState, i14, 13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m37212e(C13247j0 c13247j0, Composer composer, int i13) {
        boolean z4;
        C2314t c2314t;
        C2306l c2306l = C2299e.f9108K;
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            float f13 = 4;
            float f14 = 3 * f13;
            float f15 = 2 * f13;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3395q = AbstractC1099a.m3395q(c2314t2, f15, f14);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3395q);
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
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (c13247j0.m37227c().isEmpty()) {
                z4 = false;
                c2314t = c2314t2;
                c28655q.m87150e0(1294998909);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1293075514);
                Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t2);
                C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90655f, c2306l, c28655q, 54);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                c28655q.m87150e0(1776462568);
                int i14 = 0;
                for (Object obj : c13247j0.m37227c()) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        AbstractC37056f.m118977d0();
                        throw null;
                    }
                    C13263z c13263z = (C13263z) obj;
                    long iconColor = AbstractC17808z1.m51179g(c13263z.getStyle(), c28655q, 0).getIconColor();
                    long backgroundColor = AbstractC17808z1.m51179g(c13263z.getStyle(), c28655q, 0).getBackgroundColor();
                    float f16 = f13;
                    if (1.0f <= 0.0d) {
                        AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                    }
                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                    boolean z13 = c13247j0.m37227c().size() > 1 && i14 == 0;
                    Object objM87133R = c28655q.m87133R();
                    C28676v0 c28676v0 = C28635l.f115821a;
                    if (objM87133R == c28676v0) {
                        objM87133R = new C13251n(9);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM44099b = AbstractC15676d.m44099b(layoutWeightElement, z13, (Function1) objM87133R);
                    C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.f90654e, c2306l, c28655q, 54);
                    int iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                    Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM44099b);
                    InterfaceC0221l.f734a.getClass();
                    C0213j c0213j2 = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a2);
                    AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m3);
                    C0209i c0209i5 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i5);
                    }
                    AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N3);
                    AbstractC17799w1.m51149e(c13263z.getIcon().toWhoopIcon(), iconColor, backgroundColor, c28655q, 0);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f15, c2314t2));
                    String strM21274h = AbstractC8693b.m21274h(c13263z.getDescription(), c28655q, TextResource.$stable);
                    C38072d c38072d = C38072d.f163053a;
                    int i16 = C38072d.f163054b;
                    C28655q c28655q2 = c28655q;
                    C2314t c2314t3 = c2314t2;
                    C2306l c2306l2 = c2306l;
                    AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i16).getH5(), null, c28655q2, 0, C2886a.f11498d << 18, 196602);
                    c28655q = c28655q2;
                    c28655q.m87173q(true);
                    if (i14 != AbstractC37056f.m118951C(c13247j0.m37227c())) {
                        c28655q.m87150e0(632507454);
                        Modifier modifierM3424u = AbstractC1102d.m3424u(1, AbstractC1102d.m3411h(((float) 6.5d) * f16, c2314t3));
                        Object objM87133R2 = c28655q.m87133R();
                        if (objM87133R2 == c28676v0) {
                            objM87133R2 = a.f45880w;
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC22989q.m66760a(AbstractC18249c.m52565c(modifierM3424u, AbstractC18249c.m52574l((Function1) objM87133R2)), c28655q, 0);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(632818818);
                        c28655q.m87173q(false);
                    }
                    f13 = f16;
                    c2314t2 = c2314t3;
                    i14 = i15;
                    c2306l = c2306l2;
                }
                c2314t = c2314t2;
                z4 = false;
                AbstractC25012a.m73392y(c28655q, false, true, false);
            }
            TextResource spanningText = c13247j0.getSpanningText();
            if (spanningText == null) {
                c28655q.m87150e0(1295048260);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1295048261);
                if (c13247j0.m37227c().isEmpty()) {
                    c28655q.m87150e0(-2128697871);
                    c28655q.m87173q(z4);
                } else {
                    AbstractC31061c.m95623C(c28655q, -2128766102, c2314t, f14, c28655q);
                    c28655q.m87173q(z4);
                }
                String strM21274h2 = AbstractC8693b.m21274h(spanningText, c28655q, TextResource.$stable);
                C38072d c38072d2 = C38072d.f163053a;
                int i17 = C38072d.f163054b;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(strM21274h2, null, c38072d2.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i17).getB2(), null, c28655q3, 0, C2886a.f11498d << 18, 196602);
                c28655q = c28655q3;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final Modifier m37213f(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        float f13 = 4;
        return AbstractC1099a.m3398t(applyIf, f13 * f13, 0.0f, 0.0f, 0.0f, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m37214g(Modifier modifier, C13247j0 c13247j0, int i13, int i14, Composer composer, int i15) {
        m37211d(modifier, c13247j0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
