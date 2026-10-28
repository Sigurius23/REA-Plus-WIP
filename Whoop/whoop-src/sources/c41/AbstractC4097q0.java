package c41;

import a31.C0343e;
import a41.C0373i;
import a80.C0539c;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.AbstractC1095d;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import bo2.C3509a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2306l;
import p026b2.C2307m;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p132f0.C13825t;
import p132f0.InterfaceC13832v0;
import p163g1.AbstractC15005f3;
import p238j0.InterfaceC21083i;
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
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: c41.q0 */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001aG\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0017\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0018H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u001bH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010!\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001e2\b\b\u0002\u0010 \u001a\u00020\u0004H\u0003¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lc41/u0;", "type", "Li2/x;", "background", "Lf0/t;", "border", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "p", "(Landroidx/compose/ui/Modifier;Lc41/u0;JLf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "l", "(Lc41/u0;Landroidx/compose/runtime/Composer;I)V", "Lc41/u0$b;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lc41/u0$b;Landroidx/compose/runtime/Composer;I)V", "Lc41/u0$c;", "y", "(Lc41/u0$c;Landroidx/compose/runtime/Composer;I)V", "Lc41/u0$d;", "A", "(Lc41/u0$d;Landroidx/compose/runtime/Composer;I)V", "Lc41/u0$e;", "C", "(Lc41/u0$e;Landroidx/compose/runtime/Composer;I)V", "Lc41/u0$a;", "u", "(Lc41/u0$a;Landroidx/compose/runtime/Composer;I)V", "", "icon", "iconTint", "n", "(IJLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC4097q0 {
    /* JADX INFO: renamed from: A */
    private static final void m12582A(AbstractC4125u0.d dVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1386974033);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(dVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(3, 4, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m12599n(dVar.getIcon(), 0L, c28655q, 0, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(dVar.getTitle(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(dVar.getDescription(), c28655q, 0), null, c38072d.m121949b(c28655q, 6).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB4(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(dVar, i13, 18);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m12583B(AbstractC4125u0.d dVar, int i13, Composer composer, int i14) {
        m12582A(dVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m12584C(AbstractC4125u0.e eVar, Composer composer, int i13) {
        int i14;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(992423149);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(eVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            float f13 = 4;
            float f14 = 2 * f13;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            m12599n(eVar.getIcon(), 0L, c28655q, 0, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(eVar.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, eVar.getTint().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            if (eVar.getDescription() != null) {
                c28655q2.m87150e0(1069079047);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(eVar.getDescription(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q2, 0, 0, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(1069292947);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            C2307m c2307m = C2299e.f9103F;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j2;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q2, 54);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(eVar.getCtaText(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getBtS(), null, c28655q3, 0, 0, 196090);
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q3, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q3, 6).getBrandWhite(), c28655q3, 432, 0);
            c28655q = c28655q3;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(eVar, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m12585D(AbstractC4125u0.e eVar, int i13, Composer composer, int i14) {
        m12584C(eVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m12597l(AbstractC4125u0 abstractC4125u0, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(516195697);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(abstractC4125u0) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q.m87138X();
        } else if (abstractC4125u0 instanceof AbstractC4125u0.b) {
            c28655q.m87150e0(2142828956);
            m12608w((AbstractC4125u0.b) abstractC4125u0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        } else if (abstractC4125u0 instanceof AbstractC4125u0.c) {
            c28655q.m87150e0(2142830987);
            m12610y((AbstractC4125u0.c) abstractC4125u0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        } else if (abstractC4125u0 instanceof AbstractC4125u0.d) {
            c28655q.m87150e0(2142833252);
            m12582A((AbstractC4125u0.d) abstractC4125u0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        } else if (abstractC4125u0 instanceof AbstractC4125u0.e) {
            c28655q.m87150e0(2142835135);
            m12584C((AbstractC4125u0.e) abstractC4125u0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        } else {
            if (!(abstractC4125u0 instanceof AbstractC4125u0.a)) {
                throw AbstractC11895b.m32003v(2142827662, c28655q, false);
            }
            c28655q.m87150e0(2142836863);
            m12606u((AbstractC4125u0.a) abstractC4125u0, c28655q, i14 & 14);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(abstractC4125u0, i13, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m12598m(AbstractC4125u0 abstractC4125u0, int i13, Composer composer, int i14) {
        m12597l(abstractC4125u0, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: n */
    private static final void m12599n(final int i13, long j7, Composer composer, final int i14, final int i15) {
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(458060790);
        if ((i14 & 6) == 0) {
            i16 = (c28655q.m87149e(i13) ? 4 : 2) | i14;
        } else {
            i16 = i14;
        }
        if ((i14 & 48) == 0) {
            i16 |= ((i15 & 2) == 0 && c28655q.m87151f(j7)) ? 32 : 16;
        }
        if (c28655q.m87135U(i16 & 1, (i16 & 19) != 18)) {
            c28655q.m87140Z();
            if ((i14 & 1) != 0 && !c28655q.m87118C()) {
                c28655q.m87138X();
                if ((i15 & 2) != 0) {
                    i16 &= -113;
                }
            } else if ((i15 & 2) != 0) {
                j7 = C38072d.f163053a.m121949b(c28655q, 6).getWhite50();
                i16 &= -113;
            }
            long j13 = j7;
            c28655q.m87175r();
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i16 << 3) & 112) | 6), null, AbstractC1102d.m3419p(6 * 4, C2314t.f9131w), j13, c28655q, ((i16 << 6) & 7168) | 432, 0);
            j7 = j13;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            final long j14 = j7;
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: c41.o0
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC4097q0.m12600o(i13, j14, i14, i15, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m12600o(int i13, long j7, int i14, int i15, Composer composer, int i16) {
        m12599n(i13, j7, composer, AbstractC28683x.m87244L(i14 | 1), i15);
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0081  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0117  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x0120  */
    /* JADX WARN: Code duplicated, block: B:87:0x015d  */
    /* JADX WARN: Code duplicated, block: B:90:0x016c  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: p */
    public static final void m12601p(Modifier modifier, AbstractC4125u0 type, long j7, C13825t c13825t, InterfaceC4339a interfaceC4339a, Composer composer, int i13, int i14) {
        int i15;
        long jM125370W0;
        C13825t c13825t2;
        int i16;
        InterfaceC4339a interfaceC4339a2;
        int i17;
        boolean z4;
        boolean z13;
        C28655q c28655q;
        Modifier modifier2;
        C13825t c13825t3;
        InterfaceC4339a interfaceC4339a3;
        C28677v1 c28677v1M87180u;
        int i18;
        C2314t c2314t;
        C28676v0 c28676v0;
        C13825t c13825t4;
        long j13;
        C13825t c13825t5;
        Object objM87133R;
        Object objM87133R2;
        boolean z14;
        Object objM87133R3;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-77478737);
        if ((i13 & 48) == 0) {
            i15 = (c28655q2.m87153g(type) ? 32 : 16) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 384) == 0) {
            if ((i14 & 4) == 0) {
                jM125370W0 = j7;
                int i19 = c28655q2.m87151f(jM125370W0) ? 256 : 128;
                i15 |= i19;
            } else {
                jM125370W0 = j7;
            }
            i15 |= i19;
        } else {
            jM125370W0 = j7;
        }
        int i24 = i14 & 8;
        if (i24 == 0) {
            if ((i13 & 3072) == 0) {
                c13825t2 = c13825t;
                i15 |= c28655q2.m87153g(c13825t2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            }
            i16 = i14 & 16;
            if (i16 != 0) {
                if ((i13 & 24576) == 0) {
                    interfaceC4339a2 = interfaceC4339a;
                    if (c28655q2.m87157i(interfaceC4339a2)) {
                        i17 = 16384;
                    } else {
                        i17 = DfuBaseService.ERROR_REMOTE_MASK;
                    }
                    i15 |= i17;
                }
                z4 = false;
                if ((i15 & 9361) != 9360) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c28655q2.m87135U(i15 & 1, z13)) {
                    c28655q2.m87140Z();
                    i18 = i13 & 1;
                    c2314t = C2314t.f9131w;
                    c28676v0 = C28635l.f115821a;
                    if (i18 != 0 || c28655q2.m87118C()) {
                        if ((i14 & 1) != 0) {
                            modifier2 = c2314t;
                        } else {
                            modifier2 = modifier;
                        }
                        if ((i14 & 4) != 0) {
                            jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                            i15 &= -897;
                        }
                        if (i24 != 0) {
                            c13825t4 = null;
                        } else {
                            c13825t4 = c13825t2;
                        }
                        if (i16 != 0) {
                            objM87133R = c28655q2.m87133R();
                            if (objM87133R == c28676v0) {
                                objM87133R = new C3509a(17);
                                c28655q2.m87172p0(objM87133R);
                            }
                            interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                            j13 = jM125370W0;
                        } else {
                            interfaceC4339a3 = interfaceC4339a2;
                            j13 = jM125370W0;
                        }
                        c13825t5 = c13825t4;
                    } else {
                        c28655q2.m87138X();
                        if ((i14 & 4) != 0) {
                            i15 &= -897;
                        }
                        c13825t5 = c13825t2;
                        interfaceC4339a3 = interfaceC4339a2;
                        j13 = jM125370W0;
                        z4 = false;
                        i15 = i15;
                        modifier2 = modifier;
                    }
                    c28655q2.m87175r();
                    objM87133R2 = c28655q2.m87133R();
                    if (objM87133R2 == c28676v0) {
                        objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                    }
                    InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
                    InterfaceC13832v0 interfaceC13832v0 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                    z14 = (i15 & 57344) != 16384 ? z4 : true;
                    objM87133R3 = c28655q2.m87133R();
                    if (z14 || objM87133R3 == c28676v0) {
                        objM87133R3 = new C0343e(interfaceC4339a3, 7);
                        c28655q2.m87172p0(objM87133R3);
                    }
                    c28655q = c28655q2;
                    AbstractC31926e.m99375j(AbstractC1092a.m3360e(c2314t, interfaceC21083i, interfaceC13832v0, false, null, (InterfaceC4339a) objM87133R3, 28), null, j13, null, c13825t5, null, 0.0f, AbstractC37817c.m121344e(-977582305, c28655q2, new C0539c(type, 21)), c28655q, (i15 & 896) | 12582912 | ((i15 << 3) & 57344), 106);
                    jM125370W0 = j13;
                    c13825t3 = c13825t5;
                } else {
                    c28655q = c28655q2;
                    c28655q.m87138X();
                    modifier2 = modifier;
                    c13825t3 = c13825t2;
                    interfaceC4339a3 = interfaceC4339a2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C4090p0(modifier2, type, jM125370W0, c13825t3, interfaceC4339a3, i13, i14);
                }
            }
            i15 |= 24576;
            interfaceC4339a2 = interfaceC4339a;
            z4 = false;
            if ((i15 & 9361) != 9360) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if ((i14 & 1) != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i14 & 4) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        j13 = jM125370W0;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        j13 = jM125370W0;
                    }
                    c13825t5 = c13825t4;
                } else {
                    if ((i14 & 1) != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i14 & 4) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        j13 = jM125370W0;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        j13 = jM125370W0;
                    }
                    c13825t5 = c13825t4;
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i2 = (InterfaceC21083i) objM87133R2;
                InterfaceC13832v0 interfaceC13832v1 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                if ((i15 & 57344) != 16384) {
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    objM87133R3 = new C0343e(interfaceC4339a3, 7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C0343e(interfaceC4339a3, 7);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3360e(c2314t, interfaceC21083i2, interfaceC13832v1, false, null, (InterfaceC4339a) objM87133R3, 28), null, j13, null, c13825t5, null, 0.0f, AbstractC37817c.m121344e(-977582305, c28655q2, new C0539c(type, 21)), c28655q, (i15 & 896) | 12582912 | ((i15 << 3) & 57344), 106);
                jM125370W0 = j13;
                c13825t3 = c13825t5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                c13825t3 = c13825t2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4090p0(modifier2, type, jM125370W0, c13825t3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 3072;
        c13825t2 = c13825t;
        i16 = i14 & 16;
        if (i16 != 0) {
            if ((i13 & 24576) == 0) {
                interfaceC4339a2 = interfaceC4339a;
                if (c28655q2.m87157i(interfaceC4339a2)) {
                    i17 = 16384;
                } else {
                    i17 = DfuBaseService.ERROR_REMOTE_MASK;
                }
                i15 |= i17;
            }
            z4 = false;
            if ((i15 & 9361) != 9360) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c28655q2.m87135U(i15 & 1, z13)) {
                c28655q2.m87140Z();
                i18 = i13 & 1;
                c2314t = C2314t.f9131w;
                c28676v0 = C28635l.f115821a;
                if (i18 != 0) {
                    if ((i14 & 1) != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i14 & 4) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        j13 = jM125370W0;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        j13 = jM125370W0;
                    }
                    c13825t5 = c13825t4;
                } else {
                    if ((i14 & 1) != 0) {
                        modifier2 = c2314t;
                    } else {
                        modifier2 = modifier;
                    }
                    if ((i14 & 4) != 0) {
                        jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                        i15 &= -897;
                    }
                    if (i24 != 0) {
                        c13825t4 = null;
                    } else {
                        c13825t4 = c13825t2;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q2.m87133R();
                        if (objM87133R == c28676v0) {
                            objM87133R = new C3509a(17);
                            c28655q2.m87172p0(objM87133R);
                        }
                        interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                        j13 = jM125370W0;
                    } else {
                        interfaceC4339a3 = interfaceC4339a2;
                        j13 = jM125370W0;
                    }
                    c13825t5 = c13825t4;
                }
                c28655q2.m87175r();
                objM87133R2 = c28655q2.m87133R();
                if (objM87133R2 == c28676v0) {
                    objM87133R2 = AbstractC11266d.m30453g(c28655q2);
                }
                InterfaceC21083i interfaceC21083i3 = (InterfaceC21083i) objM87133R2;
                InterfaceC13832v0 interfaceC13832v2 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
                if ((i15 & 57344) != 16384) {
                }
                objM87133R3 = c28655q2.m87133R();
                if (z14) {
                    objM87133R3 = new C0343e(interfaceC4339a3, 7);
                    c28655q2.m87172p0(objM87133R3);
                } else {
                    objM87133R3 = new C0343e(interfaceC4339a3, 7);
                    c28655q2.m87172p0(objM87133R3);
                }
                c28655q = c28655q2;
                AbstractC31926e.m99375j(AbstractC1092a.m3360e(c2314t, interfaceC21083i3, interfaceC13832v2, false, null, (InterfaceC4339a) objM87133R3, 28), null, j13, null, c13825t5, null, 0.0f, AbstractC37817c.m121344e(-977582305, c28655q2, new C0539c(type, 21)), c28655q, (i15 & 896) | 12582912 | ((i15 << 3) & 57344), 106);
                jM125370W0 = j13;
                c13825t3 = c13825t5;
            } else {
                c28655q = c28655q2;
                c28655q.m87138X();
                modifier2 = modifier;
                c13825t3 = c13825t2;
                interfaceC4339a3 = interfaceC4339a2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C4090p0(modifier2, type, jM125370W0, c13825t3, interfaceC4339a3, i13, i14);
            }
        }
        i15 |= 24576;
        interfaceC4339a2 = interfaceC4339a;
        z4 = false;
        if ((i15 & 9361) != 9360) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c28655q2.m87135U(i15 & 1, z13)) {
            c28655q2.m87140Z();
            i18 = i13 & 1;
            c2314t = C2314t.f9131w;
            c28676v0 = C28635l.f115821a;
            if (i18 != 0) {
                if ((i14 & 1) != 0) {
                    modifier2 = c2314t;
                } else {
                    modifier2 = modifier;
                }
                if ((i14 & 4) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i15 &= -897;
                }
                if (i24 != 0) {
                    c13825t4 = null;
                } else {
                    c13825t4 = c13825t2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    j13 = jM125370W0;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    j13 = jM125370W0;
                }
                c13825t5 = c13825t4;
            } else {
                if ((i14 & 1) != 0) {
                    modifier2 = c2314t;
                } else {
                    modifier2 = modifier;
                }
                if ((i14 & 4) != 0) {
                    jM125370W0 = C38072d.f163053a.m121949b(c28655q2, 6).getWhite10();
                    i15 &= -897;
                }
                if (i24 != 0) {
                    c13825t4 = null;
                } else {
                    c13825t4 = c13825t2;
                }
                if (i16 != 0) {
                    objM87133R = c28655q2.m87133R();
                    if (objM87133R == c28676v0) {
                        objM87133R = new C3509a(17);
                        c28655q2.m87172p0(objM87133R);
                    }
                    interfaceC4339a3 = (InterfaceC4339a) objM87133R;
                    j13 = jM125370W0;
                } else {
                    interfaceC4339a3 = interfaceC4339a2;
                    j13 = jM125370W0;
                }
                c13825t5 = c13825t4;
            }
            c28655q2.m87175r();
            objM87133R2 = c28655q2.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q2);
            }
            InterfaceC21083i interfaceC21083i4 = (InterfaceC21083i) objM87133R2;
            InterfaceC13832v0 interfaceC13832v3 = (InterfaceC13832v0) c28655q2.m87161k(AbstractC1095d.f4515a);
            if ((i15 & 57344) != 16384) {
            }
            objM87133R3 = c28655q2.m87133R();
            if (z14) {
                objM87133R3 = new C0343e(interfaceC4339a3, 7);
                c28655q2.m87172p0(objM87133R3);
            } else {
                objM87133R3 = new C0343e(interfaceC4339a3, 7);
                c28655q2.m87172p0(objM87133R3);
            }
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1092a.m3360e(c2314t, interfaceC21083i4, interfaceC13832v3, false, null, (InterfaceC4339a) objM87133R3, 28), null, j13, null, c13825t5, null, 0.0f, AbstractC37817c.m121344e(-977582305, c28655q2, new C0539c(type, 21)), c28655q, (i15 & 896) | 12582912 | ((i15 << 3) & 57344), 106);
            jM125370W0 = j13;
            c13825t3 = c13825t5;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier2 = modifier;
            c13825t3 = c13825t2;
            interfaceC4339a3 = interfaceC4339a2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C4090p0(modifier2, type, jM125370W0, c13825t3, interfaceC4339a3, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m12602q() {
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m12603r(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m12604s(AbstractC4125u0 abstractC4125u0, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m12597l(abstractC4125u0, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m12605t(Modifier modifier, AbstractC4125u0 abstractC4125u0, long j7, C13825t c13825t, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m12601p(modifier, abstractC4125u0, j7, c13825t, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: u */
    private static final void m12606u(AbstractC4125u0.a aVar, Composer composer, int i13) {
        int i14;
        C0213j c0213j;
        C0209i c0209i;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(209622413);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(aVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
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
            C0209i c0209i2 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a);
            C0209i c0209i3 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m);
            C0209i c0209i4 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i4);
            }
            C0209i c0209i5 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, false);
            float f13 = 2 * 4;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N2);
            m12599n(aVar.getIcon(), 0L, c28655q, 0, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i4);
            }
            AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, aVar.getTint().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            if (aVar.getDescription() != null) {
                c28655q2.m87150e0(-1970197145);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getDescription(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q2, 0, 0, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                c28655q2.m87150e0(-1969983245);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            C2307m c2307m = C2299e.f9103F;
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement2 = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
            int iHashCode4 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q2.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q2, layoutWeightElement2);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j2;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m4);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode4))) {
                c0209i = c0209i4;
                AbstractC11266d.m30471y(iHashCode4, c28655q2, iHashCode4, c0209i);
            } else {
                c0209i = c0209i4;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N4);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f13), c2306l, c28655q2, 54);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i2, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N5);
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(aVar.getCtaText(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, new C36775k(6), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getBtS(), null, c28655q3, 0, 0, 196090);
            c28655q = c28655q3;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(aVar, i13, 20);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m12607v(AbstractC4125u0.a aVar, int i13, Composer composer, int i14) {
        m12606u(aVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m12608w(AbstractC4125u0.b type, Composer composer, int i13) {
        int i14;
        int i15;
        AbstractC22676k.m65750j(type, "type");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1500604211);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(type) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, c2314t));
            C2306l c2306l = C2299e.f9108K;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90656g, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            float f13 = 4;
            float f14 = 2 * f13;
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f14), c2306l, c28655q, 54);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            m12599n(type.getIcon(), 0L, c28655q, 0, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
            String strM21274h = AbstractC8693b.m21274h(type.getAndroidx.core.app.NotificationCompat.CATEGORY_STATUS java.lang.String(), c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, type.getTint().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH5(), null, c28655q, 0, 0, 196602);
            C28655q c28655q2 = c28655q;
            if (type.getDescription() != null) {
                c28655q2.m87150e0(-852260697);
                i15 = 6;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(type.getDescription(), c28655q2, 0), null, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getB4(), null, c28655q2, 0, 0, 196602);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            } else {
                i15 = 6;
                c28655q2.m87150e0(-852046797);
                c28655q2.m87173q(false);
            }
            c28655q2.m87173q(true);
            c28655q2.m87173q(true);
            String strM21274h2 = AbstractC8693b.m21274h(type.getErrorText(), c28655q2, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(strM21274h2, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), c38072d.m121949b(c28655q2, i15).getAccentAlert(), 0L, null, null, null, 0L, null, new C36775k(i15), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i15).getH6(), null, c28655q3, 0, 0, 196088);
            c28655q = c28655q3;
            if (type.getShowLink()) {
                c28655q.m87150e0(-342766080);
                AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getArrowForward(), c28655q, i15), null, AbstractC1102d.m3419p(f13 * f13, c2314t), c38072d.m121949b(c28655q, i15).getBrandWhite(), c28655q, 432, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-342434535);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(type, i13, 17);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m12609x(AbstractC4125u0.b bVar, int i13, Composer composer, int i14) {
        m12608w(bVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: y */
    private static final void m12610y(AbstractC4125u0.c cVar, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-342990131);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87153g(cVar) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(((float) 1.5d) * 8, AbstractC1102d.m3409f(1.0f, C2314t.f9131w));
            C22994r1 c22994r1M53376q = AbstractC18489d0.m53376q(3, 4, C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
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
            AbstractC28683x.m87239G(c28655q, c0209i, c22994r1M53376q);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            m12599n(cVar.getIcon(), cVar.getIconTint().mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 0, 0);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
            String strM21274h = AbstractC8693b.m21274h(cVar.getTitle(), c28655q, 0);
            long jMo134584toComposableColorWaAFU9c = cVar.getTitleTint().mo134584toComposableColorWaAFU9c(c28655q, 0);
            C38072d c38072d = C38072d.f163053a;
            AbstractC30795n.m94707h(strM21274h, null, jMo134584toComposableColorWaAFU9c, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getH4(), null, c28655q, 0, 0, 196602);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(cVar.getDescription(), c28655q, 0), null, cVar.getDescriptionTint().mo134584toComposableColorWaAFU9c(c28655q, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB3(), null, c28655q, 0, 0, 196602);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C0373i(cVar, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m12611z(AbstractC4125u0.c cVar, int i13, Composer composer, int i14) {
        m12610y(cVar, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
