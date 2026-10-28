package h41;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import aw0.C2108h;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import d71.C11757c;
import ej1.C13242h;
import f01.C13849c0;
import f02.C13917c;
import g40.C15369i3;
import gy0.AbstractC16277f;
import i91.AbstractC18249c;
import java.util.Locale;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import kd1.C22411w;
import l83.C23454a0;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p208i2.AbstractC17911t;
import p208i2.AbstractC17918w0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p712j91.InterfaceC21430b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: h41.b */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\u0012\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lh41/c;", "itemState", "Lkotlin/Function0;", "Ll83/a0;", "onClick", "i", "(Landroidx/compose/ui/Modifier;Lh41/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V", "o", "(Lh41/c;Landroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "priceWithoutDiscount", "finalPrice", "", "isWhoopProPrice", "Lh41/e;", "shoppingTileTagType", "g", "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLh41/e;Landroidx/compose/runtime/Composer;II)V", "m", "(Landroidx/compose/runtime/Composer;I)V", "design_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC16848b {
    /* JADX INFO: renamed from: g */
    public static final void m47455g(TextResource priceWithoutDiscount, TextResource finalPrice, boolean z4, AbstractC16851e abstractC16851e, Composer composer, int i13, int i14) {
        int i15;
        AbstractC16851e abstractC16851e2;
        long jM95624D;
        AbstractC17911t abstractC17911t;
        float f13;
        C38072d c38072d;
        C2314t c2314t;
        boolean z13;
        int i16;
        AbstractC16851e abstractC16851e3 = abstractC16851e;
        AbstractC22676k.m65750j(priceWithoutDiscount, "priceWithoutDiscount");
        AbstractC22676k.m65750j(finalPrice, "finalPrice");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-358646117);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(priceWithoutDiscount) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= c28655q.m87153g(finalPrice) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87155h(z4) ? 256 : 128;
        }
        int i17 = i14 & 8;
        if (i17 != 0) {
            i15 |= 3072;
        } else if ((i13 & 3072) == 0) {
            i15 |= (i13 & 4096) == 0 ? c28655q.m87153g(abstractC16851e3) : c28655q.m87157i(abstractC16851e3) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 1171) != 1170)) {
            if (i17 != 0) {
                abstractC16851e3 = null;
            }
            InterfaceC21430b interfaceC21430bM47476b = abstractC16851e3 != null ? abstractC16851e3.getPriceAccentColor() : null;
            if (z4) {
                c28655q.m87150e0(-1061524440);
                jM95624D = C38072d.f163053a.m121949b(c28655q, 6).getBrandWhoopPro();
                c28655q.m87173q(false);
            } else if (AbstractC8693b.m21270d(priceWithoutDiscount)) {
                c28655q.m87150e0(-1061521983);
                jM95624D = C38072d.f163053a.m121949b(c28655q, 6).getStrain();
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1061520667);
                jM95624D = AbstractC31061c.m95624D(C38072d.f163053a, c28655q, 6, false);
            }
            long j7 = jM95624D;
            C38072d c38072d2 = C38072d.f163053a;
            C2886a c2886aM8407E = c38072d2.m121952e(c28655q, 6).getN8();
            C23285v0 style = c38072d2.m121952e(c28655q, 6).getN8().getStyle();
            if (interfaceC21430bM47476b == null) {
                c28655q.m87150e0(1452743795);
                c28655q.m87173q(false);
                abstractC17911t = null;
            } else {
                c28655q.m87150e0(-1061515954);
                AbstractC17911t abstractC17911tMo60316a = interfaceC21430bM47476b.mo60316a(c28655q, 0);
                c28655q.m87173q(false);
                abstractC17911t = abstractC17911tMo60316a;
            }
            C2886a c2886aM8397c = C2886a.m8397c(c2886aM8407E, C23285v0.m67363a(style, abstractC17911t, 0L, null, null, 0L, 33554430), null, 2, null);
            float f14 = 4;
            float f15 = 1 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, f15, 2 * f14, f15, 0.0f, 8);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f15), C2299e.f9108K, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3398t);
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
            if (AbstractC8693b.m21270d(priceWithoutDiscount)) {
                c28655q.m87150e0(1188255055);
                f13 = f14;
                i16 = 6;
                c38072d = c38072d2;
                z13 = false;
                c2314t = c2314t2;
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(priceWithoutDiscount, c28655q, i15 & 14), null, c38072d2.m121949b(c28655q, 6).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, C2886a.m8397c(c38072d2.m121952e(c28655q, 6).getN8(), C23285v0.m67364b(c38072d2.m121952e(c28655q, 6).getN8().getStyle(), 0L, 0L, null, null, 0L, 0, 0L, null, null, 16773119), null, 2, null), null, c28655q, 0, 0, 196602);
                c28655q.m87173q(false);
            } else {
                f13 = f14;
                c38072d = c38072d2;
                c2314t = c2314t2;
                z13 = false;
                i16 = 6;
                c28655q.m87150e0(1188568651);
                c28655q.m87173q(false);
            }
            if (z4) {
                c28655q = c28655q;
                c28655q.m87150e0(1188608114);
                AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getLogo().getWhoopProRounded(), c28655q, i16), null, AbstractC1102d.m3411h(5 * f13, c2314t), c38072d.m121949b(c28655q, i16).getBrandWhoopPro(), c28655q, 432, 0);
                c28655q.m87173q(z13);
            } else {
                c28655q = c28655q;
                c28655q.m87150e0(1188908907);
                c28655q.m87173q(z13);
            }
            C28655q c28655q2 = c28655q;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(finalPrice, c28655q, (i15 >> 3) & 14), null, j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8397c, null, c28655q2, 0, 0, 196602);
            c28655q = c28655q2;
            c28655q.m87173q(true);
            abstractC16851e2 = abstractC16851e3;
        } else {
            c28655q.m87138X();
            abstractC16851e2 = abstractC16851e3;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C2108h(priceWithoutDiscount, finalPrice, z4, abstractC16851e2, i13, i14, 11);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static final C23454a0 m47456h(TextResource textResource, TextResource textResource2, boolean z4, AbstractC16851e abstractC16851e, int i13, int i14, Composer composer, int i15) {
        m47455g(textResource, textResource2, z4, abstractC16851e, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: i */
    public static final void m47457i(Modifier modifier, C16849c itemState, InterfaceC4339a onClick, Composer composer, int i13, int i14) {
        Modifier modifier2;
        int i15;
        C28655q c28655q;
        AbstractC22676k.m65750j(itemState, "itemState");
        AbstractC22676k.m65750j(onClick, "onClick");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(448179159);
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
            i15 |= c28655q2.m87157i(itemState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q2.m87157i(onClick) ? 256 : 128;
        }
        if (c28655q2.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            if (i16 != 0) {
                modifier2 = c2314t;
            }
            boolean z4 = (i15 & 896) == 256;
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C15369i3(onClick, 12);
                c28655q2.m87172p0(objM87133R);
            }
            float f13 = 4;
            c28655q = c28655q2;
            AbstractC31926e.m99375j(AbstractC1102d.m3411h(47 * f13, AbstractC1102d.m3424u(40 * f13, AbstractC1092a.m3362g(c2314t, false, null, null, (InterfaceC4339a) objM87133R, 15))).mo3471e(modifier2), null, C38072d.f163053a.m121949b(c28655q2, 6).getWhite10(), null, null, null, 0.0f, AbstractC37817c.m121344e(439628359, c28655q2, new C13242h(itemState, 26)), c28655q, 12582912, 122);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13917c(i13, i14, 26, modifier2, onClick, itemState);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m47458j(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m47459k(C16849c c16849c, Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            Modifier modifierM3394p = AbstractC1099a.m3394p(1 * 4, C2314t.f9131w);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            if (c16849c.getIsDiscovery()) {
                c28655q.m87150e0(-619567402);
                m47461m(c28655q, 0);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-619502302);
                m47463o(c16849c, c28655q, 0);
                c28655q.m87173q(false);
            }
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m47460l(Modifier modifier, C16849c c16849c, InterfaceC4339a interfaceC4339a, int i13, int i14, Composer composer, int i15) {
        m47457i(modifier, c16849c, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: m */
    public static final void m47461m(Composer composer, int i13) {
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(323704918);
        if (c28655q.m87135U(i13 & 1, i13 != 0)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
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
            Modifier modifierM118994r = AbstractC37056f.m118994r(c2314t, C22411w.f87680a.m64535a().m64090c());
            C38072d c38072d = C38072d.f163053a;
            Modifier modifierM3411h = AbstractC1102d.m3411h(102, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(modifierM118994r, c38072d.m121949b(c28655q, 6).getBackgroundDarkAlt(), AbstractC17918w0.f69621a)));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3411h);
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
            float f13 = 4;
            float f14 = 7 * f13;
            AbstractC15005f3.m43108b(AbstractC34132o.m107874S(c38072d.m121951d().getAction().getCom.mapbox.common.MapboxServices.SEARCH java.lang.String(), c28655q, 6), null, AbstractC1102d.m3424u(f14, AbstractC1102d.m3411h(f14, c2314t)), c38072d.m121949b(c28655q, 6).getBrandWhite(), c28655q, 432, 0);
            c28655q.m87173q(true);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f15 = 1;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, true), 0.0f, f15 * 8, 0.0f, 0.0f, 13));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            AbstractC30795n.m94707h(AbstractC8693b.m21273g(AbstractC16277f.f62345k2, c28655q, 0), AbstractC1099a.m3396r(c2314t, f15 * f13, 0.0f, 2), c38072d.m121949b(c28655q, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, 6).getB2(), null, c28655q, 48, 0, 196600);
            c28655q = c28655q;
            c28655q.m87173q(true);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C13849c0((byte) 0, i13, 19);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m47462n(int i13, Composer composer, int i14) {
        m47461m(composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v18, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: o */
    public static final void m47463o(C16849c itemState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        char c3;
        InterfaceC4339a interfaceC4339a;
        C2314t c2314t;
        C38072d c38072d;
        int i15;
        C28655q c28655q2;
        C0209i c0209i4;
        C0209i c0209i5;
        C0209i c0209i6;
        int i16;
        C0209i c0209i7;
        C2314t c2314t2;
        C0209i c0209i8;
        ?? r10;
        C28655q c28655q3;
        AbstractC22676k.m65750j(itemState, "itemState");
        C28655q c28655q4 = (C28655q) composer;
        c28655q4.m87154g0(334913716);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q4.m87157i(itemState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q4.m87135U(i14 & 1, (i14 & 3) != 2)) {
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q4, 0);
            int iHashCode = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q4.m87165m();
            C2314t c2314t3 = C2314t.f9131w;
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q4, c2314t3);
            InterfaceC0221l.f734a.getClass();
            InterfaceC4339a interfaceC4339a2 = C0217k.f724b;
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            C0209i c0209i9 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q4, c0209i9, c23010xM66775a);
            C0209i c0209i10 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q4, c0209i10, interfaceC28653p1M87165m);
            C0209i c0209i11 = C0217k.f732j;
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q4, iHashCode, c0209i11);
            }
            C0209i c0209i12 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q4, c0209i12, modifierM118962N);
            C38072d c38072d2 = C38072d.f163053a;
            Modifier modifierM3411h = AbstractC1102d.m3411h(102, AbstractC1102d.m3409f(1.0f, AbstractC1092a.m3358c(c2314t3, c38072d2.m121949b(c28655q4, 6).getGreyL4(), C22411w.f87680a.m64536b().m64090c())));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9116y, false);
            int iHashCode2 = Long.hashCode(c28655q4.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q4.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q4, modifierM3411h);
            c28655q4.m87158i0();
            if (c28655q4.f115903S) {
                c28655q4.m87163l(interfaceC4339a2);
            } else {
                c28655q4.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q4, c0209i9, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q4, c0209i10, interfaceC28653p1M87165m2);
            if (c28655q4.f115903S || !AbstractC22676k.m65745e(c28655q4.m87133R(), Integer.valueOf(iHashCode2))) {
                c0209i = c0209i11;
                AbstractC11266d.m30471y(iHashCode2, c28655q4, iHashCode2, c0209i);
            } else {
                c0209i = c0209i11;
            }
            AbstractC28683x.m87239G(c28655q4, c0209i12, modifierM118962N2);
            AbstractC22403o abstractC22403oM47467c = itemState.getProductImage();
            if (abstractC22403oM47467c == null) {
                c28655q4.m87150e0(1700639412);
                c28655q4.m87173q(false);
                c0209i2 = c0209i10;
                c0209i3 = c0209i;
                c38072d = c38072d2;
                c2314t = c2314t3;
                interfaceC4339a = interfaceC4339a2;
                i15 = 1;
                c3 = 0;
                c28655q2 = c28655q4;
            } else {
                c28655q4.m87150e0(1700639413);
                c0209i2 = c0209i10;
                c0209i3 = c0209i;
                c3 = 0;
                interfaceC4339a = interfaceC4339a2;
                c2314t = c2314t3;
                c38072d = c38072d2;
                i15 = 1;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM47467c, null, null, c28655q4, 0, 3), null, AbstractC1102d.m3407d(1.0f, c2314t3), null, null, 0.0f, null, c28655q4, 432, 120);
                C28655q c28655q5 = c28655q4;
                c28655q5.m87173q(false);
                c28655q2 = c28655q5;
            }
            AbstractC16851e abstractC16851eM47468e = itemState.getShoppingTileTagType();
            if (abstractC16851eM47468e == null) {
                c28655q2.m87150e0(1700946219);
                c28655q2.m87173q(false);
                r10 = i15;
                c0209i7 = c0209i12;
                c0209i8 = c0209i9;
                c0209i5 = c0209i2;
                c0209i6 = c0209i3;
                c2314t2 = c2314t;
                i16 = 0;
                c28655q3 = c28655q2;
            } else {
                c28655q2.m87150e0(1700946220);
                float f13 = 4;
                float f14 = i15 * f13;
                C2314t c2314t4 = c2314t;
                float f15 = 2 * f13;
                Modifier modifierM52565c = AbstractC18249c.m52565c(AbstractC37056f.m118994r(AbstractC1099a.m3394p(f14, c2314t4), AbstractC33253j.m105489e(f15)), abstractC16851eM47468e.getBackgroundColor());
                InterfaceC39127r0 interfaceC39127r0M66763d2 = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode3 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q2.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q2, modifierM52565c);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(interfaceC4339a);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i9, interfaceC39127r0M66763d2);
                C0209i c0209i13 = c0209i2;
                AbstractC28683x.m87239G(c28655q2, c0209i13, interfaceC28653p1M87165m3);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode3))) {
                    c0209i4 = c0209i3;
                    AbstractC11266d.m30471y(iHashCode3, c28655q2, iHashCode3, c0209i4);
                } else {
                    c0209i4 = c0209i3;
                }
                AbstractC28683x.m87239G(c28655q2, c0209i12, modifierM118962N3);
                String upperCase = AbstractC8693b.m21274h(abstractC16851eM47468e.getTitle(), c28655q2, 0).toUpperCase(Locale.ROOT);
                AbstractC22676k.m65749i(upperCase, "toUpperCase(...)");
                C2886a c2886aM8439t = c38072d.m121952e(c28655q2, 6).getH6();
                C28655q c28655q6 = c28655q2;
                c0209i5 = c0209i13;
                c0209i6 = c0209i4;
                i16 = 0;
                c0209i7 = c0209i12;
                c2314t2 = c2314t4;
                c0209i8 = c0209i9;
                AbstractC30795n.m94707h(upperCase, AbstractC1099a.m3395q(c2314t4, f15, f14), abstractC16851eM47468e.getTextColor().mo134584toComposableColorWaAFU9c(c28655q2, 0), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8439t, null, c28655q6, 48, 0, 196600);
                C28655q c28655q7 = c28655q6;
                r10 = 1;
                c28655q7.m87173q(true);
                c28655q7.m87173q(false);
                c28655q3 = c28655q7;
            }
            c28655q3.m87173q(r10);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            float f16 = (float) r10;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3398t(new LayoutWeightElement(1.0f, r10), 0.0f, f16 * 8, 0.0f, 0.0f, 13));
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q3, i16);
            int iHashCode4 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q3.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(interfaceC4339a);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i8, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m4);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q3, iHashCode4, c0209i6);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N4);
            String strM21274h = AbstractC8693b.m21274h(itemState.getTitle(), c28655q3, i16);
            C38072d c38072d3 = c38072d;
            C28655q c28655q8 = c28655q3;
            AbstractC30795n.m94707h(strM21274h, AbstractC1099a.m3396r(c2314t2, f16 * 4, 0.0f, 2), c38072d3.m121949b(c28655q3, 6).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 2, false, 2, 0, null, c38072d3.m121952e(c28655q3, 6).getB2(), null, c28655q8, 48, 3120, 186360);
            m47455g(itemState.getPriceWithoutDiscount(), itemState.getFinalPrice(), itemState.getIsWhoopProPrice(), itemState.getShoppingTileTagType(), c28655q8, 0, 0);
            C28655q c28655q9 = c28655q8;
            c28655q9.m87173q(true);
            c28655q9.m87173q(true);
            c28655q = c28655q9;
        } else {
            c28655q4.m87138X();
            c28655q = c28655q4;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(itemState, i13, 15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m47464p(C16849c c16849c, int i13, Composer composer, int i14) {
        m47463o(c16849c, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
