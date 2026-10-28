package qn0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import c41.C4048j0;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import hy0.AbstractC17755i2;
import jn0.C21801d;
import kd1.AbstractC22403o;
import l83.C23454a0;
import mn0.C25709c;
import mn0.InterfaceC25707a;
import nn0.C26864a;
import no.nordicsemi.android.dfu.DfuBaseService;
import ny0.AbstractC27282u;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p097ds.AbstractC12313p;
import p127ev.AbstractC13673n;
import p132f0.C13821r1;
import p208i2.AbstractC17911t;
import p208i2.C17909s;
import p208i2.C17919x;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p291l0.InterfaceC23001u;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: qn0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u001d\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lmn0/c;", "viewState", "", "name", "Lkotlin/Function1;", "Lmn0/a;", "Ll83/a0;", "onViewEvent", "Lln0/b;", "onNavigationEvent", "d", "(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Ll0/u;", "Ly3/f;", "shadowHeight", "g", "(Ll0/u;FLandroidx/compose/runtime/Composer;I)V", "Landroidx/compose/ui/Modifier;", "Ljn0/d;", "joinChallengeState", "i", "(Landroidx/compose/ui/Modifier;Ljn0/d;)Landroidx/compose/ui/Modifier;", "challenge-details_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC30510e {
    /* JADX INFO: renamed from: d */
    public static final void m93434d(C25709c viewState, String name, Function1 function1, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        String str;
        long jM95624D;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1701543641);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(name) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 1171) != 1170)) {
            C26864a c26864aM75707a = viewState.getBffData();
            if (c26864aM75707a == null) {
                c28655q.m87150e0(-1482276350);
                c28655q.m87173q(false);
                str = name;
            } else {
                c28655q.m87150e0(-1482276349);
                float f13 = 11 * 4;
                C2314t c2314t = C2314t.f9131w;
                float f14 = 8;
                float f15 = 5 * f14;
                Modifier modifierM93439i = m93439i(AbstractC1099a.m3398t(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44028b0(c2314t)), 0.0f, 0.0f, 0.0f, f15, 7), viewState.getJoinChallengeState());
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM93439i);
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
                if (1.0f <= 0.0d) {
                    AbstractC24868a.m72899a("invalid weight; must be greater than zero");
                }
                LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                C13821r1 c13821r1M92099U = AbstractC30060g.m92099U(0, c28655q, 1);
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, c13821r1M92099U, 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                AbstractC22403o abstractC22403oM80187f = c26864aM75707a.getHeaderImage();
                TextResource textResourceM80183b = c26864aM75707a.getChallengeTitle();
                TextResource textResourceM80188g = c26864aM75707a.getIneligibleText();
                int i15 = AbstractC22403o.f87638a;
                int i16 = TextResource.$stable;
                int i17 = i16 << 3;
                int i18 = i16 << 6;
                AbstractC30513h.m93457d(abstractC22403oM80187f, textResourceM80183b, textResourceM80188g, c13821r1M92099U, c28655q, i15 | i17 | i18);
                AbstractC30506a.m93424c(c26864aM75707a.m80182a(), c28655q, 0);
                AbstractC17755i2.m50938j(AbstractC1099a.m3394p(((float) 2.5d) * f14, c2314t), null, null, null, null, 0L, 0L, null, c28655q, 6, 254);
                AbstractC30507b.m93429b(c26864aM75707a.getDescriptionTitle(), c26864aM75707a.getDescriptionText(), f13, c28655q, i17 | i16 | 384);
                c28655q.m87173q(true);
                C1100b c1100b = C1100b.f4583a;
                int i19 = i14;
                AbstractC30517l.m93480c(c1100b, c13821r1M92099U, c26864aM75707a.getToolbarTitle(), onNavigationEvent, c28655q, 6 | i18 | (i14 & 7168));
                m93437g(c1100b, f13, c28655q, 54);
                c28655q.m87173q(true);
                Modifier modifierM38560g = AbstractC13673n.m38560g(C2299e.f9111N, AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), f15, 0.0f, 2));
                EnumC27284v enumC27284v = EnumC27284v.TextLarge;
                String strM21274h = AbstractC8693b.m21274h(c26864aM75707a.getCtaText(), c28655q, i16);
                boolean zM80191j = c26864aM75707a.getIsMemberEligible();
                if (c26864aM75707a.getIsMemberEligible()) {
                    c28655q.m87150e0(-1747211562);
                    jM95624D = c26864aM75707a.getStyle().getColor().mo134584toComposableColorWaAFU9c(c28655q, 0);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-1747131427);
                    jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, C38072d.f163054b, false);
                }
                boolean z4 = ((i19 & 896) == 256) | ((i19 & 112) == 32);
                Object objM87133R = c28655q.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    str = name;
                    onViewEvent = function1;
                    objM87133R = new C4048j0(onViewEvent, str, 9);
                    c28655q.m87172p0(objM87133R);
                } else {
                    str = name;
                    onViewEvent = function1;
                }
                AbstractC27282u.m82292h(modifierM38560g, enumC27284v, strM21274h, zM80191j, jM95624D, null, false, (InterfaceC4339a) objM87133R, c28655q, 48, 96);
                c28655q = c28655q;
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
        } else {
            str = name;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30508c(viewState, str, onViewEvent, onNavigationEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m93435e(Function1 function1, String str) {
        function1.invoke(new InterfaceC25707a.b(str));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m93436f(C25709c c25709c, String str, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m93434d(c25709c, str, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    private static final void m93437g(InterfaceC23001u interfaceC23001u, float f13, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1012146382);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(interfaceC23001u) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87147d(f13) ? 32 : 16;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            C17909s c17909s = AbstractC17911t.f69612b;
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC22989q.m66760a(interfaceC23001u.mo3400a(AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(f13, AbstractC1092a.m3357b(C2314t.f9131w, C17909s.m51493k(c17909s, AbstractC37056f.m118959K(new C17919x(C17919x.m51541c(0.0f, c38072d.m121949b(c28655q, i15).getBackgroundDarkStd())), new C17919x(c38072d.m121949b(c28655q, i15).getBackgroundDarkStd())), 0.0f, 0.0f, 14), null, 0.0f, 6))), C2299e.f9105H), c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C30509d(interfaceC23001u, f13, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m93438h(InterfaceC23001u interfaceC23001u, float f13, int i13, Composer composer, int i14) {
        m93437g(interfaceC23001u, f13, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    private static final Modifier m93439i(Modifier modifier, C21801d c21801d) {
        Modifier modifierM34301s = C2314t.f9131w;
        if (c21801d != null) {
            float f13 = 4;
            modifierM34301s = AbstractC12313p.m34301s(f13 * f13, modifierM34301s);
        }
        return modifier.mo3471e(modifierM34301s);
    }
}
