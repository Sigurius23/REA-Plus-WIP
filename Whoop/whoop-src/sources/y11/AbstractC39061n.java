package y11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b01.C2190k;
import b91.C2886a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9814j;
import hy0.C17780q0;
import ih0.AbstractC18489d0;
import j93.AbstractC21478l0;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p014aj.C0929d;
import p026b2.C2299e;
import p026b2.C2307m;
import p026b2.C2314t;
import p027b3.AbstractC2453v1;
import p208i2.AbstractC17918w0;
import p208i2.C17919x;
import p270k2.InterfaceC22131e;
import p291l0.AbstractC22989q;
import p292l1.C23134m1;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p636y3.InterfaceC39171c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p745y81.EnumC39333f;
import p745y81.InterfaceC39332e;
import p91.AbstractC29011e;
import p91.C29007a;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import wq1.C37508b;
import x81.C38072d;
import zy0.AbstractC41215c;
import zy0.AbstractC41218f;
import zy0.EnumC41216d;

/* JADX INFO: renamed from: y11.n */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\r\u001a;\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Ly11/r;", "horizontalImpactBarViewState", "Ll83/a0;", "f", "(Landroidx/compose/ui/Modifier;Ly11/r;Landroidx/compose/runtime/Composer;II)V", "Lcom/whoop/design/util/TextResource;", "mainText", "subText", "", "xPercent", "j", "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;II)V", "Ly81/f;", "fillColor", "insetPx", "youMarkerText", "Ly3/f;", "circleSize", "l", "(Landroidx/compose/ui/Modifier;Ly81/f;FLcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;II)V", "fillStart", "fillEnd", "i", "(FF)F", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39061n {
    /* JADX INFO: renamed from: f */
    public static final void m124553f(Modifier modifier, C39065r horizontalImpactBarViewState, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        int i16;
        InterfaceC39332e interfaceC39332e;
        boolean z4;
        AbstractC22676k.m65750j(horizontalImpactBarViewState, "horizontalImpactBarViewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1512987663);
        int i17 = i14 & 1;
        if (i17 != 0) {
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
            i15 |= c28655q.m87153g(horizontalImpactBarViewState) ? 32 : 16;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i17 != 0 ? c2314t : modifier2;
            float fillEnd = horizontalImpactBarViewState.getFillEnd() - horizontalImpactBarViewState.getFillStart();
            float f13 = 12;
            float f14 = 4;
            float fMo743q0 = ((InterfaceC39171c) c28655q.m87161k(AbstractC2453v1.f9569h)).mo743q0(f14);
            EnumC39333f middleCircleColor = horizontalImpactBarViewState.getMiddleCircleColor();
            Modifier modifierMo3471e = AbstractC1102d.m3427x(c2314t, null, 3).mo3471e(modifier4);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9117z, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
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
            float f15 = 2 * f14;
            AbstractC41218f.m133900c(AbstractC1102d.m3411h(f15, c2314t), null, c28655q, 6, 2);
            EnumC39333f fillColor = horizontalImpactBarViewState.getFillColor();
            if (fillColor == null) {
                c28655q.m87150e0(1046866252);
                c28655q.m87173q(false);
                i16 = 0;
                interfaceC39332e = middleCircleColor;
            } else {
                c28655q.m87150e0(1046866253);
                i16 = 0;
                interfaceC39332e = middleCircleColor;
                AbstractC41215c.m133896b(AbstractC29011e.m88145f(AbstractC1102d.m3411h(f15, c2314t), horizontalImpactBarViewState.getFillStart(), 0.0f, fillEnd, 0.0f, null, 26, null), EnumC41216d.DEFAULT, fillColor.mo134584toComposableColorWaAFU9c(c28655q, 0), c28655q, 48, 0);
                c28655q.m87173q(false);
            }
            long jMo134584toComposableColorWaAFU9c = interfaceC39332e.mo134584toComposableColorWaAFU9c(c28655q, i16);
            Modifier modifierM3419p = AbstractC1102d.m3419p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            float middleCircleXPosition = horizontalImpactBarViewState.getMiddleCircleXPosition();
            C29007a.Companion companion = C29007a.INSTANCE;
            Modifier modifierM88145f = AbstractC29011e.m88145f(modifierM3419p, middleCircleXPosition, 0.0f, 0.0f, 0.0f, companion.m88137b(), 14, null);
            boolean zM87151f = c28655q.m87151f(jMo134584toComposableColorWaAFU9c) | c28655q.m87147d(fMo743q0);
            Object objM87133R = c28655q.m87133R();
            if (zM87151f || objM87133R == C28635l.f115821a) {
                objM87133R = new C23134m1(jMo134584toComposableColorWaAFU9c, fMo743q0, 2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC21478l0.m60421a(modifierM88145f, (Function1) objM87133R, c28655q, 0);
            C39067t similarMarkerViewState = horizontalImpactBarViewState.getSimilarMarkerViewState();
            Float similarMemberPosition = similarMarkerViewState != null ? similarMarkerViewState.getSimilarMemberPosition() : null;
            if (similarMemberPosition == null) {
                c28655q.m87150e0(1047991552);
                c28655q.m87173q(false);
                z4 = false;
            } else {
                c28655q.m87150e0(1047991553);
                float fFloatValue = similarMemberPosition.floatValue();
                m124557j(AbstractC29011e.m88145f(AbstractC1102d.m3411h(((horizontalImpactBarViewState.getSimilarMarkerViewState().getSimilarMemberMainText() == null && horizontalImpactBarViewState.getSimilarMarkerViewState().getSimilarMemberSubText() == null) ? (float) 3.5d : 23) * f14, c2314t), fFloatValue, 0.0f, 0.0f, 0.0f, companion.m88137b(), 14, null), horizontalImpactBarViewState.getSimilarMarkerViewState().getSimilarMemberMainText(), horizontalImpactBarViewState.getSimilarMarkerViewState().getSimilarMemberSubText(), fFloatValue, c28655q, 0, 0);
                z4 = false;
                c28655q.m87173q(false);
            }
            if (horizontalImpactBarViewState.getYouMarkerText() == null) {
                c28655q.m87150e0(1048823809);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(1048823810);
                m124559l(AbstractC29011e.m88145f(AbstractC1102d.m3411h(15 * f14, AbstractC1102d.m3409f(1.0f, c2314t)), m124556i(horizontalImpactBarViewState.getFillStart(), horizontalImpactBarViewState.getFillEnd()), 0.0f, 0.0f, 0.0f, companion.m88137b(), 14, null), horizontalImpactBarViewState.getFillColor(), fMo743q0, horizontalImpactBarViewState.getYouMarkerText(), f13, c28655q, 24576, 0);
                c28655q = c28655q;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C37508b(modifier3, i13, horizontalImpactBarViewState, i14, 16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m124554g(long j7, float f13, InterfaceC22131e Canvas) {
        float f14;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63379M(Canvas, j7, 0.0f, 0L, 0.0f, null, 126);
        ((C0929d) Canvas.mo744t0().f812x).m2355o(f13, f13, f13, f13);
        try {
            InterfaceC22131e.m63379M(Canvas, C17919x.f69629f, 0.0f, 0L, 0.0f, null, 126);
            return C23454a0.f92919a;
        } finally {
            f14 = -f13;
            ((C0929d) Canvas.mo744t0().f812x).m2355o(f14, f14, f14, f14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m124555h(Modifier modifier, C39065r c39065r, int i13, int i14, Composer composer, int i15) {
        m124553f(modifier, c39065r, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final float m124556i(float f13, float f14) {
        return f13 < 0.5f ? f13 : f14;
    }

    /* JADX INFO: renamed from: j */
    public static final void m124557j(Modifier modifier, TextResource textResource, TextResource textResource2, float f13, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        Modifier modifierMo3400a;
        int i16;
        int i17;
        C2314t c2314t;
        boolean z4;
        C1100b c1100b;
        C38072d c38072d;
        Modifier modifierMo3400a2;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1500206852);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87153g(textResource2) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87147d(f13) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t2 : modifier2;
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
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
            C2307m c2307m = C2299e.f9102E;
            C1100b c1100b2 = C1100b.f4583a;
            float f14 = 4;
            Modifier modifierM53364e = AbstractC18489d0.m53364e(AbstractC1102d.m3411h(((float) 3.5d) * f14, AbstractC1102d.m3424u(((float) 0.5d) * f14, c1100b2.mo3400a(c2314t2, c2307m))), 1, f14);
            C38072d c38072d2 = C38072d.f163053a;
            AbstractC22989q.m66760a(AbstractC1092a.m3358c(modifierM53364e, c38072d2.m121949b(c28655q2, 6).getBrandWhite(), AbstractC17918w0.f69621a), c28655q2, 0);
            if (textResource == null) {
                c28655q2.m87150e0(721185289);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
                c38072d = c38072d2;
                i16 = i15;
                c2314t = c2314t2;
                c1100b = c1100b2;
                i17 = 6;
                z4 = false;
            } else {
                c28655q2.m87150e0(721185290);
                double d3 = f13;
                if (d3 > 0.8d) {
                    modifierMo3400a = c1100b2.mo3400a(c2314t2, new C2307m(-0.1f, 0.5f));
                } else {
                    modifierMo3400a = d3 < 0.2d ? c1100b2.mo3400a(c2314t2, new C2307m(0.1f, 0.5f)) : c1100b2.mo3400a(c2314t2, new C2307m(0.0f, 0.5f));
                }
                String strM21274h = AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 3) & 14);
                long white50 = c38072d2.m121949b(c28655q2, 6).getWhite50();
                C2886a n13 = c38072d2.m121952e(c28655q2, 6).getN8();
                i16 = i15;
                i17 = 6;
                c2314t = c2314t2;
                z4 = false;
                c1100b = c1100b2;
                c38072d = c38072d2;
                AbstractC30795n.m94707h(strM21274h, modifierMo3400a, white50, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, n13, null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                c28655q.m87173q(false);
            }
            if (textResource2 == null) {
                c28655q.m87150e0(721828818);
                c28655q.m87173q(z4);
            } else {
                c28655q.m87150e0(721828819);
                double d14 = f13;
                if (d14 > 0.8d) {
                    modifierMo3400a2 = c1100b.mo3400a(c2314t, new C2307m(-0.3f, 1.0f));
                } else {
                    modifierMo3400a2 = d14 < 0.2d ? c1100b.mo3400a(c2314t, new C2307m(0.3f, 1.0f)) : c1100b.mo3400a(c2314t, new C2307m(0.0f, 1.0f));
                }
                int i19 = i17;
                C28655q c28655q3 = c28655q;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource2, c28655q, (i16 >> 6) & 14), modifierMo3400a2, c38072d.m121949b(c28655q, i19).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i19).getB2(), null, c28655q3, 0, 0, 196600);
                c28655q = c28655q3;
                c28655q.m87173q(z4);
            }
            c28655q.m87173q(true);
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C9814j(modifier3, textResource, textResource2, f13, i13, i14, 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m124558k(Modifier modifier, TextResource textResource, TextResource textResource2, float f13, int i13, int i14, Composer composer, int i15) {
        m124557j(modifier, textResource, textResource2, f13, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    private static final void m124559l(Modifier modifier, EnumC39333f enumC39333f, float f13, TextResource textResource, float f14, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        Modifier modifier3;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1502736406);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q2.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q2.m87149e(enumC39333f == null ? -1 : enumC39333f.ordinal()) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87147d(f13) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q2.m87153g(textResource) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i15 |= c28655q2.m87147d(f14) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifier4 = i16 != 0 ? c2314t : modifier2;
            if (enumC39333f == null) {
                c28655q2.m87150e0(1576317361);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(1576317362);
                C2307m c2307m = C2299e.f9102E;
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(c2307m, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifier4);
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
                C2307m c2307m2 = new C2307m(0.0f, -1.0f);
                C1100b c1100b = C1100b.f4583a;
                int i17 = i15;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(textResource, c28655q2, (i15 >> 9) & 14), c1100b.mo3400a(c2314t, c2307m2), enumC39333f.mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C38072d.f163053a.m121952e(c28655q2, 6).getB2(), null, c28655q2, 0, 0, 196600);
                c28655q = c28655q2;
                Modifier modifierM3419p = AbstractC1102d.m3419p(f14, AbstractC1102d.m3409f(1.0f, c1100b.mo3400a(c2314t, c2307m)));
                boolean z4 = (i17 & 896) == 256;
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C2190k(f13, 9);
                    c28655q.m87172p0(objM87133R);
                }
                AbstractC21478l0.m60421a(modifierM3419p, (Function1) objM87133R, c28655q, 0);
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17780q0(modifier3, enumC39333f, f13, textResource, f14, i13, i14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m124560m(float f13, InterfaceC22131e Canvas) {
        float f14;
        AbstractC22676k.m65750j(Canvas, "$this$Canvas");
        InterfaceC22131e.m63379M(Canvas, C17919x.f69629f, 0.0f, 0L, 0.0f, null, 126);
        ((C0929d) Canvas.mo744t0().f812x).m2355o(f13, f13, f13, f13);
        try {
            InterfaceC22131e.m63379M(Canvas, C17919x.f69625b, 0.0f, 0L, 0.0f, null, 126);
            return C23454a0.f92919a;
        } finally {
            f14 = -f13;
            ((C0929d) Canvas.mo744t0().f812x).m2355o(f14, f14, f14, f14);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m124561n(Modifier modifier, EnumC39333f enumC39333f, float f13, TextResource textResource, float f14, int i13, int i14, Composer composer, int i15) {
        m124559l(modifier, enumC39333f, f13, textResource, f14, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
