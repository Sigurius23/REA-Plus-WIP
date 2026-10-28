package zq0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.WithAlignmentLineElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c41.AbstractC4021f1;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import ih0.AbstractC18489d0;
import java.util.List;
import l83.C23454a0;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28674u2;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.AbstractC39083d;
import p635y2.C39111m;
import p635y2.InterfaceC39127r0;
import p636y3.EnumC39181m;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.InterfaceC25312u;
import p745y81.EnumC39333f;
import p748zc1.C40518y0;
import q63.AbstractC30007c;
import qz0.AbstractC30795n;
import te0.AbstractC33745d;
import wb3.AbstractC37056f;
import x30.C37888f1;
import x81.C38072d;
import y71.C39274g;
import zi1.C40670c0;
import zm1.C40893d;

/* JADX INFO: renamed from: zq0.c0 */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\"\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lzq0/d0;", "viewState", "Ll83/a0;", "f", "(Landroidx/compose/ui/Modifier;Lzq0/d0;Landroidx/compose/runtime/Composer;II)V", "Ly3/f;", "a", "F", "SecondarySlotMinHeight", "community-everyday-stats_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC40960c0 {

    /* JADX INFO: renamed from: a */
    private static final float f176741a = 4 * 3.5f;

    /* JADX INFO: renamed from: f */
    public static final void m132915f(Modifier modifier, C40962d0 viewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        String strM21274h;
        EnumC39181m enumC39181m;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        boolean z4;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-648391712);
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
            float f13 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3409f(1.0f, modifier4), f13, f13);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            float f14 = 8;
            float f15 = 2 * f14;
            Modifier modifierM3397s = AbstractC1099a.m3397s(AbstractC1092a.m3358c(modifierM53364e, c38072d.m121949b(c28655q, i17).getWhite5(), AbstractC17918w0.f69621a), f15, f14 * 1.5f, f15, f15);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3397s);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i5 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i5, c23010xM66775a);
            C0209i c0209i6 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i6, interfaceC28653p1M87165m);
            C0209i c0209i7 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i7);
            }
            C0209i c0209i8 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i8, modifierM118962N);
            TextResource textResourceM132924e = viewState.getTitle();
            int i18 = TextResource.$stable;
            List<EnumC39333f> list = null;
            Modifier modifier5 = modifier4;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM132924e, c28655q, i18), null, c38072d.m121949b(c28655q, i17).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 2, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, (C2886a.f11498d << 18) | 27696, 169978);
            c28655q = c28655q;
            TextResource textResourceM132928i = viewState.getValueSuffix();
            if (textResourceM132928i == null) {
                c28655q.m87150e0(2061263731);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(2061263732);
                strM21274h = AbstractC8693b.m21274h(textResourceM132928i, c28655q, i18);
                c28655q.m87173q(false);
            }
            if (AbstractC22676k.m65745e(strM21274h, "%")) {
                c28655q.m87150e0(2061297057);
                c28655q.m87173q(false);
                enumC39181m = EnumC39181m.f168423w;
            } else {
                c28655q.m87150e0(2061345944);
                enumC39181m = (EnumC39181m) c28655q.m87161k(AbstractC2453v1.f9575n);
                c28655q.m87173q(false);
            }
            C28674u2 c28674u2 = AbstractC2453v1.f9575n;
            AbstractC28683x.m87247a(c28674u2.mo86977a(enumC39181m), AbstractC37817c.m121344e(578946070, c28655q, new C40969j(viewState, 1)), c28655q, 56);
            TextResource textResourceM132923c = viewState.getPreviousValue();
            if (textResourceM132923c == null) {
                c28655q.m87150e0(2062936708);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(2062936709);
                AbstractC28683x.m87247a(c28674u2.mo86977a(enumC39181m), AbstractC37817c.m121344e(-169481822, c28655q, new C37888f1(16, textResourceM132923c, viewState)), c28655q, 56);
                c28655q.m87173q(false);
            }
            List<EnumC39333f> listM132921a = viewState.m132921a();
            if (listM132921a != null && !listM132921a.isEmpty()) {
                list = listM132921a;
            }
            if (list != null) {
                c28655q.m87150e0(2063979053);
                Modifier modifierM3413j = AbstractC1102d.m3413j(AbstractC1102d.m3409f(1.0f, c2314t), f176741a, 0.0f, 2);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9104G, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3413j);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j = c0213j2;
                    c28655q.m87163l(c0213j);
                } else {
                    c0213j = c0213j2;
                    c28655q.m87178s0();
                }
                c0209i = c0209i5;
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                c0209i2 = c0209i6;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i3 = c0209i7;
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    c0209i3 = c0209i7;
                }
                c0209i4 = c0209i8;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                AbstractC4021f1.m12239p(list, 0, c28655q, 48, 0);
                z4 = true;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                c0213j = c0213j2;
                c0209i = c0209i5;
                c0209i2 = c0209i6;
                c0209i3 = c0209i7;
                c0209i4 = c0209i8;
                z4 = true;
                if (viewState.getPreviousValue() != null || viewState.getGraphItem() == null) {
                    c28655q.m87150e0(2064440364);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(2064361562);
                    AbstractC30007c.m91851u(c2314t, f176741a, c28655q, false);
                }
            }
            InterfaceC25312u interfaceC25312uM132922b = viewState.getGraphItem();
            if (interfaceC25312uM132922b == null) {
                c28655q.m87150e0(2064480725);
                c28655q.m87173q(false);
            } else {
                AbstractC33745d.m106667z(c28655q, 2064480726, c2314t, f15, c28655q);
                Modifier modifierM3411h = AbstractC1102d.m3411h(20 * f13, AbstractC1102d.m3409f(1.0f, c2314t));
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                C40518y0 c40518y0 = new C40518y0(18);
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C40893d(3);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC25303l.m74291r(interfaceC25312uM132922b, null, c40518y0, (Function1) objM87133R, c28655q, 3072, 2);
                c28655q.m87173q(z4);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            modifier3 = modifier5;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C40670c0(modifier3, i13, viewState, i14, 9);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m132916g(C40962d0 c40962d0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(8 * 0.5f), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M66759a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            TextResource textResourceM132927h = c40962d0.getValue();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM132927h, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8426g = c38072d.m121952e(c28655q, i15).getBnM();
            long brandWhite = c38072d.m121949b(c28655q, i15).getBrandWhite();
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, false);
            C39111m c39111m = AbstractC39083d.f168140a;
            Modifier modifierMo3471e = layoutWeightElement.mo3471e(new WithAlignmentLineElement(c39111m));
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, modifierMo3471e, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, c2886aM8426g, null, c28655q, 0, i16 | 3120, 186360);
            C28655q c28655q2 = c28655q;
            TextResource textResourceM132928i = c40962d0.getValueSuffix();
            if (textResourceM132928i == null) {
                c28655q2.m87150e0(392598528);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(392598529);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM132928i, c28655q2, i14), new WithAlignmentLineElement(c39111m), c38072d.m121949b(c28655q2, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, c38072d.m121952e(c28655q2, i15).getB1(), null, c28655q2, 0, i16 | 3072, 188408);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            C39274g c39274gM132926g = c40962d0.getTrendIcon();
            if (c39274gM132926g == null) {
                c28655q2.m87150e0(392992910);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(392992911);
                AbstractC23164r1.m67133b(AbstractC34132o.m107874S(c39274gM132926g.getIcon(), c28655q2, 6), AbstractC8693b.m21274h(c39274gM132926g.getContentDescription(), c28655q2, i14), AbstractC1102d.m3419p(2 * 4, c2314t), c40962d0.getTrendColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), c28655q2, 384, 0);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m132917h(TextResource textResource, C40962d0 c40962d0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3413j = AbstractC1102d.m3413j(C2314t.f9131w, f176741a, 0.0f, 2);
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(8, 0.25f, C2299e.f9109L, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3413j);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c22994r1M53376q);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            C2886a c2886aM8408F = c38072d.m121952e(c28655q, i15).getN9();
            long white70 = c38072d.m121949b(c28655q, i15).getWhite70();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, white70, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8408F, null, c28655q, 0, i16, 196602);
            C28655q c28655q2 = c28655q;
            TextResource textResourceM132928i = c40962d0.getValueSuffix();
            if (textResourceM132928i == null) {
                c28655q2.m87150e0(-1005981428);
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1005981427);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResourceM132928i, c28655q2, i14), null, c38072d.m121949b(c28655q2, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getN9(), null, c28655q2, 0, i16, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final Modifier m132918i(InterfaceC25312u it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87150e0(777903959);
        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, C2314t.f9131w);
        c28655q.m87173q(false);
        return modifierM3409f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m132919j(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m132920k(Modifier modifier, C40962d0 c40962d0, int i13, int i14, Composer composer, int i15) {
        m132915f(modifier, c40962d0, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
