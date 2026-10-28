package b11;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.AbstractC2294a;
import p026b2.C2299e;
import p026b2.C2314t;
import p077d0.AbstractC11348f;
import p077d0.C11373l0;
import p077d0.EnumC11408v0;
import p088dc.AbstractC11895b;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.C22994r1;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28624i0;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28620h0;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: b11.g */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u000f\u0010\r\u001a\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0010\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0011\u0010\r\u001aA\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lb11/h;", "indicatorState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "Lkotlin/Function1;", "Lb11/j$a;", "onViewEvent", "o", "(Landroidx/compose/ui/Modifier;Lb11/h;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "i", "(Lb11/h;Landroidx/compose/runtime/Composer;I)V", "r", "t", "m", "k", "Li2/x;", "strapColor", "indicatorColor", "", "strapIcon", "indicatorIcon", "Lcom/whoop/design/util/TextResource;", "contentDescription", "", "enableIconAnimation", "v", "(JJIILcom/whoop/design/util/TextResource;ZLandroidx/compose/runtime/Composer;II)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC2280g {

    /* JADX INFO: renamed from: b11.g$a */
    @Metadata(m65680d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m65681d2 = {"b11/g$a", "Lp1/h0;", "Ll83/a0;", "dispose", "()V", "runtime"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC28620h0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Function1 f9045a;

        public a(Function1 function1) {
            this.f9045a = function1;
        }

        @Override // p390p1.InterfaceC28620h0
        public void dispose() {
            this.f9045a.invoke(new AbstractC2283j.a(false));
        }
    }

    /* JADX INFO: renamed from: i */
    private static final void m7119i(C2281h c2281h, Composer composer, int i13) {
        int i14;
        long jM73366B;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1792252448);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c2281h) : c28655q.m87157i(c2281h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 4;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3419p = AbstractC1102d.m3419p(3 * f13, c2314t);
            C38072d c38072d = C38072d.f163053a;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getTinyIcons().getTinyCharging(), c28655q, 6), AbstractC8693b.m21274h(c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c28655q, 0), modifierM3419p, c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 384, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            String strM21274h = AbstractC8693b.m21274h(c2281h.getChargeLabel(), c28655q, 0);
            C2886a c2886aM8407E = c38072d.m121952e(c28655q, 6).getN8();
            if (c2281h.getIsLowBattery()) {
                c28655q.m87150e0(-72696821);
                jM73366B = c38072d.m121949b(c28655q, 6).getAccentAlert();
            } else {
                jM73366B = AbstractC25012a.m73366B(c28655q, -72695702, c38072d, c28655q, 6);
            }
            c28655q.m87173q(false);
            AbstractC30795n.m94707h(strM21274h, null, jM73366B, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8407E, null, c28655q, 0, 0, 196602);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(5, c2314t));
            m7132v(c38072d.m121949b(c28655q, 6).getBrandWhite(), c2281h.getIndicatorIcon().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c2281h.getConnectivityIndicatorStatusType().getIcon(), c2281h.getIndicatorIcon().getIcon(), c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c2281h.getIndicatorIcon().getEnableIconAnimation(), c28655q, 0, 0);
            c28655q = c28655q;
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2278e(c2281h, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m7120j(C2281h c2281h, int i13, Composer composer, int i14) {
        m7119i(c2281h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m7121k(C2281h c2281h, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1352416585);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c2281h) : c28655q2.m87157i(c2281h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            String strM21274h = AbstractC8693b.m21274h(c2281h.getChargeLabel(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q, 48, 0, 196600);
            m7132v(c38072d.m121949b(c28655q, 6).getBrandWhite(), c2281h.getIndicatorIcon().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c2281h.getConnectivityIndicatorStatusType().getIcon(), c2281h.getIndicatorIcon().getIcon(), c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c2281h.getIndicatorIcon().getEnableIconAnimation(), c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2278e(c2281h, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m7122l(C2281h c2281h, int i13, Composer composer, int i14) {
        m7121k(c2281h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    private static final void m7123m(C2281h c2281h, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-909561244);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c2281h) : c28655q2.m87157i(c2281h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            String strM21274h = AbstractC8693b.m21274h(c2281h.getChargeLabel(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q, 48, 0, 196600);
            m7132v(c38072d.m121949b(c28655q, 6).getBrandWhite(), c2281h.getIndicatorIcon().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c2281h.getConnectivityIndicatorStatusType().getIcon(), c2281h.getIndicatorIcon().getIcon(), c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c2281h.getIndicatorIcon().getEnableIconAnimation(), c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2277d(c2281h, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m7124n(C2281h c2281h, int i13, Composer composer, int i14) {
        m7123m(c2281h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    public static final void m7125o(Modifier modifier, C2281h indicatorState, InterfaceC4339a onClick, Function1 onViewEvent, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        AbstractC22676k.m65750j(indicatorState, "indicatorState");
        AbstractC22676k.m65750j(onClick, "onClick");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1082014604);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
        } else if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(modifier) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(indicatorState) : c28655q.m87157i(indicatorState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onClick) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i15 |= c28655q.m87157i(onViewEvent) ? 2048 : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        int i17 = i15;
        if (c28655q.m87135U(i17 & 1, (i17 & 1171) != 1170)) {
            if (i16 != 0) {
                modifier = C2314t.f9131w;
            }
            Modifier modifier3 = modifier;
            boolean z4 = (i17 & 7168) == 2048;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C2275b(onViewEvent, 0);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC28683x.m87251e(C23454a0.f92919a, (Function1) objM87133R, c28655q);
            Modifier modifierM3362g = AbstractC1092a.m3362g(modifier3, true, null, null, onClick, 14);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3362g);
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
            AbstractC2282i connectivityIndicatorStatusType = indicatorState.getConnectivityIndicatorStatusType();
            if (connectivityIndicatorStatusType instanceof AbstractC2282i.e) {
                c28655q.m87150e0(543724848);
                m7128r(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.d) {
                c28655q.m87150e0(543728173);
                m7123m(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.c) {
                c28655q.m87150e0(543731469);
                m7123m(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.g) {
                c28655q.m87150e0(543734727);
                m7130t(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.f) {
                c28655q.m87150e0(543737831);
                m7130t(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.b) {
                c28655q.m87150e0(543741036);
                m7119i(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else if (connectivityIndicatorStatusType instanceof AbstractC2282i.h) {
                c28655q.m87150e0(543743988);
                m7121k(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            } else {
                if (!(connectivityIndicatorStatusType instanceof AbstractC2282i.a)) {
                    throw AbstractC11895b.m32003v(543721877, c28655q, false);
                }
                c28655q.m87150e0(543747628);
                m7119i(indicatorState, c28655q, (i17 >> 3) & 14);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
            modifier2 = modifier3;
        } else {
            c28655q.m87138X();
            modifier2 = modifier;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2276c((Object) modifier2, (Object) indicatorState, (Object) onClick, (Object) onViewEvent, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final InterfaceC28620h0 m7126p(Function1 function1, C28624i0 DisposableEffect) {
        AbstractC22676k.m65750j(DisposableEffect, "$this$DisposableEffect");
        function1.invoke(new AbstractC2283j.a(true));
        return new a(function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m7127q(Modifier modifier, C2281h c2281h, InterfaceC4339a interfaceC4339a, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m7125o(modifier, c2281h, interfaceC4339a, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    private static final void m7128r(C2281h c2281h, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(176686422);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c2281h) : c28655q2.m87157i(c2281h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            String strM21274h = AbstractC8693b.m21274h(c2281h.getChargeLabel(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q, 48, 0, 196600);
            m7132v(c38072d.m121949b(c28655q, 6).getWhite50(), c2281h.getIndicatorIcon().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c2281h.getConnectivityIndicatorStatusType().getIcon(), c2281h.getIndicatorIcon().getIcon(), c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c2281h.getIndicatorIcon().getEnableIconAnimation(), c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2277d(c2281h, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m7129s(C2281h c2281h, int i13, Composer composer, int i14) {
        m7128r(c2281h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    private static final void m7130t(C2281h c2281h, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(695421049);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q2.m87153g(c2281h) : c28655q2.m87157i(c2281h) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            Modifier modifierM3398t = AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 1 * 8, 0.0f, 11);
            String strM21274h = AbstractC8693b.m21274h(c2281h.getChargeLabel(), c28655q2, 0);
            C38072d c38072d = C38072d.f163053a;
            c28655q = c28655q2;
            AbstractC30795n.m94707h(strM21274h, modifierM3398t, c38072d.m121949b(c28655q2, 6).getAccentAlert(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, 6).getN8(), null, c28655q, 48, 0, 196600);
            m7132v(c38072d.m121949b(c28655q, 6).getBrandWhite(), c2281h.getIndicatorIcon().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0), c2281h.getConnectivityIndicatorStatusType().getIcon(), c2281h.getIndicatorIcon().getIcon(), c2281h.getConnectivityIndicatorStatusType().getContentDescription(), c2281h.getIndicatorIcon().getEnableIconAnimation(), c28655q, 0, 0);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2277d(c2281h, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m7131u(C2281h c2281h, int i13, Composer composer, int i14) {
        m7130t(c2281h, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:70:0x0125  */
    /* JADX WARN: Code duplicated, block: B:72:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0196  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: v */
    public static final void m7132v(final long j7, final long j13, final int i13, final int i14, final TextResource contentDescription, boolean z4, Composer composer, final int i15, final int i16) {
        int i17;
        boolean z13;
        boolean z14;
        final boolean z15;
        C28677v1 c28677v1M87180u;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C11373l0 c11373l0M30571s;
        float fFloatValue;
        AbstractC22676k.m65750j(contentDescription, "contentDescription");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-935465988);
        if ((i15 & 6) == 0) {
            i17 = (c28655q.m87151f(j7) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= c28655q.m87151f(j13) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i17 |= c28655q.m87149e(i13) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i17 |= c28655q.m87149e(i14) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i15 & 24576) == 0) {
            i17 |= c28655q.m87153g(contentDescription) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        int i18 = i16 & 32;
        if (i18 == 0) {
            if ((196608 & i15) == 0) {
                z13 = z4;
                i17 |= c28655q.m87155h(z13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
            }
            if ((74899 & i17) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c28655q.m87135U(i17 & 1, z14)) {
                if (i18 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, c2314t);
                InterfaceC0221l.f734a.getClass();
                int i19 = i17;
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
                c0209i = C0217k.f732j;
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
                }
                AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
                float f13 = 4;
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i19 >> 3) & 112) | 6), AbstractC8693b.m21274h(contentDescription, c28655q, (i19 >> 12) & 14), AbstractC1102d.m3419p(6 * f13, c2314t), j7, c28655q, ((i19 << 9) & 7168) | 384, 0);
                c11373l0M30571s = AbstractC11348f.m30571s(null, c28655q, 1);
                if (z15) {
                    c28655q.m87150e0(134851685);
                    fFloatValue = ((Number) AbstractC11348f.m30559g(c11373l0M30571s, 1.0f, 2.75f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(500, 0, null, 6), EnumC11408v0.f36578x, 4), null, c28655q, 4536, 8).f36433z.getValue()).floatValue();
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(135080434);
                    c28655q.m87173q(false);
                    fFloatValue = 2.0f;
                }
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i14, c28655q, ((i19 >> 6) & 112) | 6), "", AbstractC1099a.m3383e(C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(2 * f13, c2314t), AbstractC2294a.f9094b), -2, fFloatValue), j13, c28655q, ((i19 << 6) & 7168) | 48, 0);
                c28655q.m87173q(true);
            } else {
                c28655q.m87138X();
                z15 = z13;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b11.f
                    @Override // c93.InterfaceC4351m
                    public final Object invoke(Object obj, Object obj2) {
                        int iIntValue = ((Integer) obj2).intValue();
                        return AbstractC2280g.m7133w(j7, j13, i13, i14, contentDescription, z15, i15, i16, (Composer) obj, iIntValue);
                    }
                };
            }
        }
        i17 |= ProfileVerifier.CompilationStatus.f6515xf2722a21;
        z13 = z4;
        if ((74899 & i17) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c28655q.m87135U(i17 & 1, z14)) {
            if (i18 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t2);
            InterfaceC0221l.f734a.getClass();
            int i110 = i17;
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, interfaceC39127r0M66763d2);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m2);
            c0209i = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N2);
            float f14 = 4;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i13, c28655q, ((i110 >> 3) & 112) | 6), AbstractC8693b.m21274h(contentDescription, c28655q, (i110 >> 12) & 14), AbstractC1102d.m3419p(6 * f14, c2314t2), j7, c28655q, ((i110 << 9) & 7168) | 384, 0);
            c11373l0M30571s = AbstractC11348f.m30571s(null, c28655q, 1);
            if (z15) {
                c28655q.m87150e0(134851685);
                fFloatValue = ((Number) AbstractC11348f.m30559g(c11373l0M30571s, 1.0f, 2.75f, AbstractC11348f.m30569q(AbstractC11348f.m30574v(500, 0, null, 6), EnumC11408v0.f36578x, 4), null, c28655q, 4536, 8).f36433z.getValue()).floatValue();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(135080434);
                c28655q.m87173q(false);
                fFloatValue = 2.0f;
            }
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(i14, c28655q, ((i110 >> 6) & 112) | 6), "", AbstractC1099a.m3383e(C1100b.f4583a.mo3400a(AbstractC1102d.m3419p(2 * f14, c2314t2), AbstractC2294a.f9094b), -2, fFloatValue), j13, c28655q, ((i110 << 6) & 7168) | 48, 0);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
            z15 = z13;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: b11.f
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC2280g.m7133w(j7, j13, i13, i14, contentDescription, z15, i15, i16, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m7133w(long j7, long j13, int i13, int i14, TextResource textResource, boolean z4, int i15, int i16, Composer composer, int i17) {
        m7132v(j7, j13, i13, i14, textResource, z4, composer, AbstractC28683x.m87244L(i15 | 1), i16);
        return C23454a0.f92919a;
    }
}
