package io2;

import ai1.C0910b;
import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.C1100b;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.draw.AbstractC1125a;
import androidx.compose.p018ui.platform.AbstractC1136a;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import ar2.C1935f;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import ck1.C4789l;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.navigation.C9598e;
import d71.C11757c;
import gb1.AbstractC15676d;
import gz0.C16326w;
import hy0.C17794v;
import if0.C18451b;
import ig0.C18464d;
import ig0.C18468h;
import ih0.AbstractC18489d0;
import java.util.Iterator;
import kd1.AbstractC22403o;
import l83.C23454a0;
import l83.InterfaceC23459e;
import nn2.AbstractC26867a;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.C0238p0;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2306l;
import p026b2.C2314t;
import p163g1.AbstractC15011f9;
import p208i2.AbstractC17918w0;
import p208i2.C17924z0;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
import p238j0.InterfaceC21083i;
import p270k2.C22128b;
import p270k2.InterfaceC22129c;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C22961h;
import p291l0.C22971k;
import p291l0.C22994r1;
import p291l0.C23010x;
import p294l3.C23248d;
import p294l3.C23254g;
import p294l3.C23267m0;
import p294l3.C23285v0;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p505ts.AbstractC34132o;
import p510u0.AbstractC34339n0;
import p571w3.C36765a;
import p571w3.C36776l;
import p571w3.C36780p;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import qz0.AbstractC30795n;
import wb3.AbstractC37056f;
import x81.C38072d;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: io2.s */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\r\u001aM\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001aE\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001aE\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a3\u0010#\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a\u0017\u0010'\u001a\u00020\u00062\u0006\u0010&\u001a\u00020%H\u0003¢\u0006\u0004\b'\u0010(¨\u0006)"}, m65681d2 = {"Lio2/u;", "viewState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "", "Ll83/a0;", "onViewEvent", "x", "(Lio2/u;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lio2/t;", "summary", "A", "(Lio2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "", "bodyText", "ctaText", "Lcom/whoop/navigation/e;", "destination", "Ll3/v0;", "style", "Li2/x;", "color", "F", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JLandroidx/compose/runtime/Composer;I)V", "H", "(Ljava/lang/String;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JLandroidx/compose/runtime/Composer;I)V", "Ll3/g;", "annotatedText", "s", "(Ll3/g;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Ll3/v0;JLandroidx/compose/runtime/Composer;I)V", "Lcom/whoop/design/util/TextResource;", "title", "", "isExpanded", "o", "(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lio2/w;", "itemViewState", "C", "(Lio2/w;Landroidx/compose/runtime/Composer;I)V", "universal-checkout_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC20782s {
    /* JADX INFO: renamed from: A */
    private static final void m57256A(C20783t c20783t, Function1 function1, Composer composer, int i13) {
        int i14;
        String strM21274h;
        String strM21274h2;
        String str;
        String str2;
        C38072d c38072d;
        boolean z4;
        boolean z13;
        long j7;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(621193069);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(c20783t) : c28655q.m87157i(c20783t) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            TextResource textResourceM57291a = c20783t.getBody();
            String str3 = null;
            if (textResourceM57291a == null) {
                c28655q.m87150e0(-1051224228);
                c28655q.m87173q(false);
                strM21274h = null;
            } else {
                c28655q.m87150e0(-1051224227);
                strM21274h = AbstractC8693b.m21274h(textResourceM57291a, c28655q, TextResource.$stable);
                c28655q.m87173q(false);
            }
            if (strM21274h == null || AbstractC39414r.m125890i0(strM21274h)) {
                strM21274h = null;
            }
            TextResource textResourceM57292b = c20783t.getCtaText();
            if (textResourceM57292b == null) {
                c28655q.m87150e0(-1051136932);
                c28655q.m87173q(false);
                strM21274h2 = null;
            } else {
                c28655q.m87150e0(-1051136931);
                strM21274h2 = AbstractC8693b.m21274h(textResourceM57292b, c28655q, TextResource.$stable);
                c28655q.m87173q(false);
            }
            if (strM21274h2 != null && !AbstractC39414r.m125890i0(strM21274h2)) {
                str3 = strM21274h2;
            }
            long jM51517e = AbstractC17918w0.m51517e(3003121663L);
            float f13 = 8;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 0.5d) * f13);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22971kM66746i, C2299e.f9110M, c28655q, 6);
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
            AbstractC28683x.m87239G(c28655q, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, C0217k.f726d, modifierM118962N);
            String strM21274h3 = AbstractC8693b.m21274h(c20783t.getTitle(), c28655q, TextResource.$stable);
            C38072d c38072d2 = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h3, null, c38072d2.m121949b(c28655q, i16).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getT4(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            if (strM21274h == null || str3 == null) {
                str = str3;
                if (strM21274h != null) {
                    c28655q.m87150e0(2090586619);
                    str2 = strM21274h;
                    c38072d = c38072d2;
                    z4 = true;
                    z13 = false;
                    j7 = jM51517e;
                    AbstractC15011f9.m43114b(str2, AbstractC1102d.m3425v(c2314t, 0.0f, 269, 1), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d2.m121952e(c28655q, i16).getB2().getStyle(), c28655q, 432, 0, 65528);
                    c28655q.m87173q(false);
                } else {
                    str2 = strM21274h;
                    c38072d = c38072d2;
                    z4 = true;
                    z13 = false;
                    j7 = jM51517e;
                    c28655q.m87150e0(2090829535);
                    c28655q.m87173q(false);
                }
            } else {
                c28655q.m87150e0(1175805526);
                str = str3;
                m57261F(strM21274h, str, c20783t.getDestination(), function1, AbstractC18489d0.m53377r(c38072d2, c28655q, i16), jM51517e, c28655q, (C9598e.f28134d << 6) | ProfileVerifier.CompilationStatus.f6515xf2722a21 | ((i15 << 6) & 7168));
                c28655q.m87173q(false);
                str2 = strM21274h;
                c38072d = c38072d2;
                z4 = true;
                z13 = false;
                j7 = jM51517e;
            }
            if (str == null || str2 != null) {
                int i17 = i16;
                i17 = i16;
                c28655q = c28655q;
                i17 = i16;
                function2 = function1;
                c28655q.m87150e0(2091162847);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(2090888962);
                function2 = function1;
                m57263H(str, c20783t.getDestination(), function2, AbstractC18489d0.m53377r(c38072d, c28655q, i17), j7, c28655q, (C9598e.f28134d << 3) | 24576 | ((i15 << 3) & 896));
                c28655q.m87173q(z13);
            }
            c28655q.m87173q(z4);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C18464d(c20783t, function2, i13, 5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m57257B(C20783t c20783t, Function1 function1, int i13, Composer composer, int i14) {
        m57256A(c20783t, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: C */
    private static final void m57258C(C20786w c20786w, Composer composer, int i13) {
        int i14;
        C0209i c0209i;
        C0213j c0213j;
        C0209i c0209i2;
        int i15;
        int i16;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1733362050);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q.m87157i(c20786w) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 3) != 2)) {
            float f13 = 8;
            float f14 = 1 * f13;
            C22971k c22971kM66746i = AbstractC22977m.m66746i(f14);
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C2306l c2306l = C2299e.f9107J;
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22971kM66746i, c2306l, c28655q, 6);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i3 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a);
            C0209i c0209i4 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m);
            C0209i c0209i5 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i5);
            }
            C0209i c0209i6 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N);
            float f15 = 4;
            Modifier modifierM3358c = AbstractC1092a.m3358c(AbstractC18489d0.m53364e(AbstractC1102d.m3419p(16 * f15, c2314t), 2, f15), c20786w.getStyle().getImageBackgroundColor().mo134584toComposableColorWaAFU9c(c28655q, 0), AbstractC17918w0.f69621a);
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9102E, false);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM3358c);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC39127r0M66763d);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m2);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i5);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N2);
            AbstractC26867a.m80219b(C1100b.f4583a, c20786w.getImage(), c20786w.m57308d(), AbstractC1102d.m3419p(10 * f15, c2314t), C39102j.f168205g, c28655q, (AbstractC22403o.f87638a << 3) | 27654, 0);
            c28655q.m87173q(true);
            float f16 = (float) 0.5d;
            C22971k c22971kM66746i2 = AbstractC22977m.m66746i(f16 * f13);
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, f14, 0.0f, 11);
            C22994r1 c22994r1M66759a2 = AbstractC22988p1.m66759a(c22971kM66746i2, c2306l, c28655q, 6);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3398t);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c22994r1M66759a2);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m3);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                c0209i = c0209i5;
                AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i);
            } else {
                c0209i = c0209i5;
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N3);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            C22957g c22957g = AbstractC22977m.f90652c;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, C2299e.f9110M, c28655q, 0);
            int iHashCode4 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
            Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, layoutWeightElement);
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j2);
            } else {
                c28655q.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q, c0209i3, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q, c0209i4, interfaceC28653p1M87165m4);
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i);
            }
            AbstractC28683x.m87239G(c28655q, c0209i6, modifierM118962N4);
            TextResource textResourceM57312h = c20786w.getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM57312h, c28655q, i17);
            C38072d c38072d = C38072d.f163053a;
            int i18 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i18).getBrandWhite();
            C2886a c2886aM8420a = c38072d.m121952e(c28655q, i18).getB1();
            Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
            int i19 = C2886a.f11498d << 18;
            C0209i c0209i7 = c0209i;
            AbstractC30795n.m94707h(strM21274h, modifierM3409f2, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8420a, null, c28655q, 48, i19, 196600);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c20786w.getSubtitle(), c28655q, i17), AbstractC1102d.m3409f(1.0f, c2314t), c38072d.m121949b(c28655q, i18).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getB2(), null, c28655q, 48, i19, 196600);
            C28655q c28655q2 = c28655q;
            c28655q2.m87173q(true);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, C2299e.f9112O, c28655q2, 48);
            int iHashCode5 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q2.m87165m();
            Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c0213j = c0213j2;
                c28655q2.m87163l(c0213j);
            } else {
                c0213j = c0213j2;
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m5);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode5))) {
                c0209i2 = c0209i7;
                AbstractC11266d.m30471y(iHashCode5, c28655q2, iHashCode5, c0209i2);
            } else {
                c0209i2 = c0209i7;
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N5);
            C22994r1 c22994r1M66759a3 = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(f16 * f15), C2299e.f9108K, c28655q2, 54);
            int iHashCode6 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q2.m87165m();
            Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q2, c2314t);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i3, c22994r1M66759a3);
            AbstractC28683x.m87239G(c28655q2, c0209i4, interfaceC28653p1M87165m6);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode6))) {
                AbstractC11266d.m30471y(iHashCode6, c28655q2, iHashCode6, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i6, modifierM118962N6);
            TextResource textResourceM57309e = c20786w.getStrikethroughPrice();
            if (textResourceM57309e == null) {
                c28655q2.m87150e0(-447429826);
                c28655q2.m87173q(false);
                i15 = i18;
                i16 = i17;
            } else {
                long jM73370c = AbstractC25012a.m73370c(c28655q2, -447429825, c38072d, c28655q2, i18);
                String strM21274h2 = AbstractC8693b.m21274h(textResourceM57309e, c28655q2, i17);
                long jM125385c1 = c38072d.m121949b(c28655q2, i18).getWhite70();
                boolean zM87151f = c28655q2.m87151f(jM73370c);
                Object objM87133R = c28655q2.m87133R();
                if (zM87151f || objM87133R == C28635l.f115821a) {
                    objM87133R = new C0910b(jM73370c, 18);
                    c28655q2.m87172p0(objM87133R);
                }
                i15 = i18;
                i16 = i17;
                AbstractC30795n.m94707h(strM21274h2, AbstractC1125a.m3480c(c2314t, (Function1) objM87133R), jM125385c1, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, c28655q2, 0, 0, 262136);
                c28655q2 = c28655q2;
                c28655q2.m87173q(false);
            }
            int i24 = i15;
            C28655q c28655q3 = c28655q2;
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c20786w.getPrice(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i24).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i24).getB1(), null, c28655q3, 0, i19, 196602);
            c28655q3.m87173q(true);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c20786w.getQuantity(), c28655q3, i16), null, c38072d.m121949b(c28655q3, i24).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q3, i24).getB2(), null, c28655q3, 0, i19, 196602);
            c28655q = c28655q3;
            AbstractC25012a.m73392y(c28655q, true, true, true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C11757c(c20786w, i13, 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m57259D(long j7, InterfaceC22129c drawWithContent) {
        AbstractC22676k.m65750j(drawWithContent, "$this$drawWithContent");
        C0238p0 c0238p0 = (C0238p0) drawWithContent;
        c0238p0.m728a();
        float fMo743q0 = c0238p0.mo743q0(1);
        C22128b c22128b = c0238p0.f815w;
        drawWithContent.mo732d0(j7, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() & 4294967295L)))) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (c22128b.mo731d() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (496 & 8) != 0 ? 0.0f : fMo743q0, (496 & 16) != 0 ? 0 : 2, (496 & 32) != 0 ? null : null);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m57260E(C20786w c20786w, int i13, Composer composer, int i14) {
        m57258C(c20786w, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: F */
    private static final void m57261F(String str, final String str2, final C9598e c9598e, final Function1 function1, final C23285v0 c23285v0, final long j7, Composer composer, final int i13) {
        final String str3;
        int i14;
        Function1 function2;
        C23285v0 c23285v1;
        long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-2018485275);
        if ((i13 & 6) == 0) {
            str3 = str;
            i14 = (c28655q.m87153g(str3) ? 4 : 2) | i13;
        } else {
            str3 = str;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87153g(str2) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= (i13 & 512) == 0 ? c28655q.m87153g(c9598e) : c28655q.m87157i(c9598e) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            function2 = function1;
            i14 |= c28655q.m87157i(function2) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            function2 = function1;
        }
        if ((i13 & 24576) == 0) {
            c23285v1 = c23285v0;
            i14 |= c28655q.m87153g(c23285v1) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            c23285v1 = c23285v0;
        }
        if ((196608 & i13) == 0) {
            j13 = j7;
            i14 |= c28655q.m87151f(j13) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        } else {
            j13 = j7;
        }
        if (c28655q.m87135U(i14 & 1, (74899 & i14) != 74898)) {
            c28655q.m87150e0(1560875758);
            C23248d c23248d = new C23248d();
            c23248d.m67300b(AbstractC39414r.m125871Q0(str3).toString());
            c23248d.m67300b(" ");
            c23248d.m67306h("order_details_summary_cta", "order_details_summary_cta");
            int iM67308j = c23248d.m67308j(new C23267m0(C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite(), 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61438));
            try {
                c23248d.m67300b(str2);
                c23248d.m67304f(iM67308j);
                c23248d.m67303e();
                C23254g c23254gM67309k = c23248d.m67309k();
                c28655q.m87173q(false);
                int i15 = i14 >> 3;
                m57283s(c23254gM67309k, c9598e, function2, c23285v1, j13, c28655q, (C9598e.f28134d << 3) | (i15 & 112) | (i15 & 896) | (i15 & 7168) | (i15 & 57344));
            } catch (Throwable th3) {
                c23248d.m67304f(iM67308j);
                throw th3;
            }
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new InterfaceC4351m() { // from class: io2.r
                @Override // c93.InterfaceC4351m
                public final Object invoke(Object obj, Object obj2) {
                    int iIntValue = ((Integer) obj2).intValue();
                    return AbstractC20782s.m57262G(str3, str2, c9598e, function1, c23285v0, j7, i13, (Composer) obj, iIntValue);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public static final C23454a0 m57262G(String str, String str2, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, int i13, Composer composer, int i14) {
        m57261F(str, str2, c9598e, function1, c23285v0, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: H */
    private static final void m57263H(String str, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, Composer composer, int i13) {
        int i14;
        Function1 function2;
        C23285v0 c23285v1;
        long j13;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(783137068);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(str) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c9598e) : c28655q.m87157i(c9598e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            function2 = function1;
            i14 |= c28655q.m87157i(function2) ? 256 : 128;
        } else {
            function2 = function1;
        }
        if ((i13 & 3072) == 0) {
            c23285v1 = c23285v0;
            i14 |= c28655q.m87153g(c23285v1) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        } else {
            c23285v1 = c23285v0;
        }
        if ((i13 & 24576) == 0) {
            j13 = j7;
            i14 |= c28655q.m87151f(j13) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        } else {
            j13 = j7;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            long jM125430y = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getBrandWhite();
            Object objM87133R = c28655q.m87133R();
            if (objM87133R == C28635l.f115821a) {
                C23248d c23248d = new C23248d();
                c23248d.m67306h("order_details_summary_cta", "order_details_summary_cta");
                int iM67308j = c23248d.m67308j(new C23267m0(jM125430y, 0L, (C28780r) null, (C28776n) null, (C28777o) null, (AbstractC28771i) null, (String) null, 0L, (C36765a) null, (C36780p) null, (C32096b) null, 0L, C36776l.f157352c, (C17924z0) null, 61438));
                try {
                    c23248d.m67300b(str);
                    c23248d.m67304f(iM67308j);
                    c23248d.m67303e();
                    objM87133R = c23248d.m67309k();
                    c28655q.m87172p0(objM87133R);
                } catch (Throwable th3) {
                    c23248d.m67304f(iM67308j);
                    throw th3;
                }
            }
            m57283s((C23254g) objM87133R, c9598e, function2, c23285v1, j13, c28655q, (i14 & 57344) | (C9598e.f28134d << 3) | 6 | (i14 & 112) | (i14 & 896) | (i14 & 7168));
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20780q(str, c9598e, function1, c23285v0, j7, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public static final C23454a0 m57264I(String str, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, int i13, Composer composer, int i14) {
        m57263H(str, c9598e, function1, c23285v0, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m57279o(TextResource textResource, boolean z4, Function1 function1, Composer composer, int i13) {
        int i14;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-156348057);
        if ((i13 & 6) == 0) {
            i14 = ((i13 & 8) == 0 ? c28655q.m87153g(textResource) : c28655q.m87157i(textResource) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87155h(z4) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C16326w navigation = C38072d.f163053a.m121951d().getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            int iM46493h = z4 ? navigation.getCaretUp() : navigation.getCaretDown();
            C22961h c22961h = AbstractC22977m.f90656g;
            C2306l c2306l = C2299e.f9108K;
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (objM87133R == c28676v0) {
                objM87133R = new C20756e(3);
                c28655q.m87172p0(objM87133R);
            }
            Modifier modifierM44099b = AbstractC15676d.m44099b(modifierM3409f, z4, (Function1) objM87133R);
            Object objM87133R2 = c28655q.m87133R();
            if (objM87133R2 == c28676v0) {
                objM87133R2 = AbstractC11266d.m30453g(c28655q);
            }
            InterfaceC21083i interfaceC21083i = (InterfaceC21083i) objM87133R2;
            boolean z13 = (i14 & 896) == 256;
            Object objM87133R3 = c28655q.m87133R();
            if (z13 || objM87133R3 == c28676v0) {
                objM87133R3 = new C18451b(function1, 4);
                c28655q.m87172p0(objM87133R3);
            }
            Modifier modifierM3360e = AbstractC1092a.m3360e(modifierM44099b, interfaceC21083i, null, false, null, (InterfaceC4339a) objM87133R3, 28);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(c22961h, c2306l, c28655q, 54);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3360e);
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
            String strM21274h = AbstractC8693b.m21274h(textResource, c28655q, (i14 & 14) | TextResource.$stable);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i15).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getT3(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            c28655q = c28655q;
            float f13 = 4;
            AbstractC29125c.m88524d(AbstractC34132o.m107874S(iM46493h, c28655q, 6), null, AbstractC1102d.m3419p(f13 * f13, c2314t), null, c28655q, 25008, 104);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C1935f(textResource, z4, function1, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final Modifier m57280p(Modifier applyIf) {
        AbstractC22676k.m65750j(applyIf, "$this$applyIf");
        return AbstractC1099a.m3398t(C2314t.f9131w, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * 8, 7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m57281q(Function1 function1) {
        function1.invoke(C20776o.f78018a);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m57282r(TextResource textResource, boolean z4, Function1 function1, int i13, Composer composer, int i14) {
        m57279o(textResource, z4, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0138 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x013e  */
    /* JADX WARN: Code duplicated, block: B:73:0x0153  */
    /* JADX WARN: Code duplicated, block: B:74:0x0155  */
    /* JADX WARN: Code duplicated, block: B:76:0x0158  */
    /* JADX WARN: Code duplicated, block: B:77:0x015a  */
    /* JADX WARN: Code duplicated, block: B:80:0x015e  */
    /* JADX WARN: Code duplicated, block: B:88:0x0171 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:89:0x0173  */
    /* JADX INFO: renamed from: s */
    private static final void m57283s(C23254g c23254g, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, Composer composer, int i13) {
        int i14;
        C9598e c9598e2;
        Function1 function2;
        boolean z4;
        boolean z13;
        Object objM87133R;
        int i15;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objM87133R2;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(834658259);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(c23254g) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= (i13 & 64) == 0 ? c28655q.m87153g(c9598e) : c28655q.m87157i(c9598e) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(function1) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i14 |= c28655q.m87153g(c23285v0) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i14 |= c28655q.m87151f(j7) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 9363) != 9362)) {
            C2314t c2314t = C2314t.f9131w;
            if (c9598e == null) {
                c28655q.m87150e0(1738729522);
                AbstractC15011f9.m43115c(c23254g, AbstractC1102d.m3425v(c2314t, 0.0f, 269, 1), j7, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, c23285v0, c28655q, (i14 & 14) | 48 | ((i14 >> 6) & 896), (i14 << 12) & 29360128, 131064);
                c28655q = c28655q;
                c28655q.m87173q(false);
                c9598e2 = c9598e;
                function2 = function1;
            } else {
                c28655q.m87150e0(1738930495);
                boolean z17 = true;
                C23285v0 c23285v0M67364b = C23285v0.m67364b(c23285v0, j7, 0L, null, null, 0L, 0, 0L, null, null, 16777214);
                Modifier modifierM3599a = AbstractC1136a.m3599a(AbstractC1102d.m3425v(c2314t, 0.0f, 269, 1), "order_details_summary_text");
                int i16 = i14 & 896;
                boolean z18 = i16 == 256;
                int i17 = i14 & 112;
                if (i17 != 32) {
                    if ((i14 & 64) != 0) {
                        c9598e2 = c9598e;
                        if (c28655q.m87157i(c9598e2)) {
                        }
                        z13 = z4 | z18;
                        objM87133R = c28655q.m87133R();
                        C28676v0 c28676v0 = C28635l.f115821a;
                        if (!z13 || objM87133R == c28676v0) {
                            function2 = function1;
                            objM87133R = new C20778p(c9598e2, function2);
                            c28655q.m87172p0(objM87133R);
                        } else {
                            function2 = function1;
                        }
                        Modifier modifierM51775c = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R);
                        i15 = i14 & 14;
                        if (i15 == 4) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (i16 == 256) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        boolean z19 = z15 | z14;
                        if (i17 != 32 && ((i14 & 64) == 0 || !c28655q.m87157i(c9598e2))) {
                            z17 = false;
                        }
                        z16 = z17 | z19;
                        objM87133R2 = c28655q.m87133R();
                        if (z16 || objM87133R2 == c28676v0) {
                            objM87133R2 = new C18468h(c23254g, function2, c9598e2, 18);
                            c28655q.m87172p0(objM87133R2);
                        }
                        AbstractC34339n0.m108623a(c23254g, modifierM51775c, c23285v0M67364b, false, 0, 0, null, (Function1) objM87133R2, c28655q, i15);
                        c28655q.m87173q(false);
                    } else {
                        c9598e2 = c9598e;
                    }
                    z4 = false;
                    z13 = z4 | z18;
                    objM87133R = c28655q.m87133R();
                    C28676v0 c28676v1 = C28635l.f115821a;
                    if (z13) {
                        function2 = function1;
                        objM87133R = new C20778p(c9598e2, function2);
                        c28655q.m87172p0(objM87133R);
                    } else {
                        function2 = function1;
                        objM87133R = new C20778p(c9598e2, function2);
                        c28655q.m87172p0(objM87133R);
                    }
                    Modifier modifierM51775c2 = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R);
                    i15 = i14 & 14;
                    if (i15 == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (i16 == 256) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    boolean z110 = z15 | z14;
                    if (i17 != 32) {
                        z17 = false;
                    }
                    z16 = z17 | z110;
                    objM87133R2 = c28655q.m87133R();
                    if (z16) {
                        objM87133R2 = new C18468h(c23254g, function2, c9598e2, 18);
                        c28655q.m87172p0(objM87133R2);
                    } else {
                        objM87133R2 = new C18468h(c23254g, function2, c9598e2, 18);
                        c28655q.m87172p0(objM87133R2);
                    }
                    AbstractC34339n0.m108623a(c23254g, modifierM51775c2, c23285v0M67364b, false, 0, 0, null, (Function1) objM87133R2, c28655q, i15);
                    c28655q.m87173q(false);
                } else {
                    c9598e2 = c9598e;
                }
                z4 = true;
                z13 = z4 | z18;
                objM87133R = c28655q.m87133R();
                C28676v0 c28676v2 = C28635l.f115821a;
                if (z13) {
                    function2 = function1;
                    objM87133R = new C20778p(c9598e2, function2);
                    c28655q.m87172p0(objM87133R);
                } else {
                    function2 = function1;
                    objM87133R = new C20778p(c9598e2, function2);
                    c28655q.m87172p0(objM87133R);
                }
                Modifier modifierM51775c3 = AbstractC18032n.m51775c(modifierM3599a, false, (Function1) objM87133R);
                i15 = i14 & 14;
                if (i15 == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (i16 == 256) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z111 = z15 | z14;
                if (i17 != 32) {
                    z17 = false;
                }
                z16 = z17 | z111;
                objM87133R2 = c28655q.m87133R();
                if (z16) {
                    objM87133R2 = new C18468h(c23254g, function2, c9598e2, 18);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    objM87133R2 = new C18468h(c23254g, function2, c9598e2, 18);
                    c28655q.m87172p0(objM87133R2);
                }
                AbstractC34339n0.m108623a(c23254g, modifierM51775c3, c23285v0M67364b, false, 0, 0, null, (Function1) objM87133R2, c28655q, i15);
                c28655q.m87173q(false);
            }
        } else {
            c9598e2 = c9598e;
            function2 = function1;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C20780q(c23254g, c9598e2, function2, c23285v0, j7, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static final C23454a0 m57284t(Function1 function1, C9598e c9598e, InterfaceC18044z semantics) {
        AbstractC22676k.m65750j(semantics, "$this$semantics");
        AbstractC18041w.m51804c(semantics, new C4789l(function1, c9598e, 5));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final boolean m57285u(Function1 function1, C9598e c9598e) {
        function1.invoke(c9598e);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m57286v(C23254g c23254g, Function1 function1, C9598e c9598e, int i13) {
        if (!c23254g.m67316c(i13, i13, "order_details_summary_cta").isEmpty()) {
            function1.invoke(c9598e);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public static final C23454a0 m57287w(C23254g c23254g, C9598e c9598e, Function1 function1, C23285v0 c23285v0, long j7, int i13, Composer composer, int i14) {
        m57283s(c23254g, c9598e, function1, c23285v0, j7, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0248  */
    /* JADX WARN: Code duplicated, block: B:102:0x025c  */
    /* JADX WARN: Code duplicated, block: B:105:0x026d  */
    /* JADX WARN: Code duplicated, block: B:106:0x0272  */
    /* JADX WARN: Code duplicated, block: B:108:0x0275  */
    /* JADX WARN: Code duplicated, block: B:110:0x0280  */
    /* JADX WARN: Code duplicated, block: B:112:0x028c  */
    /* JADX WARN: Code duplicated, block: B:113:0x02af  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:119:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x0060  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:46:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:62:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0134  */
    /* JADX WARN: Code duplicated, block: B:68:0x0143  */
    /* JADX WARN: Code duplicated, block: B:70:0x0151  */
    /* JADX WARN: Code duplicated, block: B:73:0x0172  */
    /* JADX WARN: Code duplicated, block: B:74:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x0183  */
    /* JADX WARN: Code duplicated, block: B:79:0x0191  */
    /* JADX WARN: Code duplicated, block: B:82:0x019d  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0205  */
    /* JADX WARN: Code duplicated, block: B:96:0x0221 A[LOOP:0: B:94:0x021b->B:96:0x0221, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x023d  */
    /* JADX INFO: renamed from: x */
    public static final void m57288x(C20784u viewState, Modifier modifier, Function1 function1, Composer composer, int i13, int i14) {
        int i15;
        Modifier modifier2;
        int i16;
        Function1 function2;
        int i17;
        boolean z4;
        Modifier modifier3;
        Function1 function3;
        C28677v1 c28677v1M87180u;
        C2314t c2314t;
        Function1 function4;
        TextResource textResourceM57298e;
        C22957g c22957g;
        C2305k c2305k;
        int iHashCode;
        C0213j c0213j;
        C0209i c0209i;
        C0209i c0209i2;
        C0209i c0209i3;
        C0209i c0209i4;
        int i18;
        boolean z13;
        C20772m c20772m;
        C20768k c20768kM57297c;
        C20772m c20772mM57193b;
        boolean z14;
        int iHashCode2;
        int i19;
        C0213j c0213j2;
        int iHashCode3;
        C20783t c20783tM57300g;
        int iHashCode4;
        Iterator<T> it;
        C20768k c20768kM57297c2;
        Object objM87133R;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-734532614);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i24 = i14 & 2;
        if (i24 == 0) {
            if ((i13 & 48) == 0) {
                modifier2 = modifier;
                i15 |= c28655q.m87153g(modifier2) ? 32 : 16;
            }
            i16 = i14 & 4;
            if (i16 != 0) {
                if ((i13 & 384) == 0) {
                    function2 = function1;
                    if (c28655q.m87157i(function2)) {
                        i17 = 256;
                    } else {
                        i17 = 128;
                    }
                    i15 |= i17;
                }
                if ((i15 & 147) != 146) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (c28655q.m87135U(i15 & 1, z4)) {
                    c2314t = C2314t.f9131w;
                    if (i24 != 0) {
                        modifier2 = c2314t;
                    }
                    if (i16 != 0) {
                        objM87133R = c28655q.m87133R();
                        if (objM87133R == C28635l.f115821a) {
                            objM87133R = new C20756e(2);
                            c28655q.m87172p0(objM87133R);
                        }
                        function4 = (Function1) objM87133R;
                    } else {
                        function4 = function2;
                    }
                    if (viewState.getIsExpanded()) {
                        textResourceM57298e = viewState.getTitle();
                    } else {
                        textResourceM57298e = viewState.getCollapsedTitle();
                    }
                    Modifier modifierMo3471e = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                    c22957g = AbstractC22977m.f90652c;
                    c2305k = C2299e.f9110M;
                    C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                    Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierMo3471e);
                    InterfaceC0221l.f734a.getClass();
                    c0213j = C0217k.f724b;
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j);
                    } else {
                        c28655q.m87178s0();
                    }
                    c0209i = C0217k.f729g;
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a);
                    c0209i2 = C0217k.f728f;
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
                    c0209i3 = C0217k.f732j;
                    if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                        AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                    }
                    c0209i4 = C0217k.f726d;
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
                    boolean zM57302i = viewState.getIsExpanded();
                    i18 = TextResource.$stable;
                    m57279o(textResourceM57298e, zM57302i, function4, c28655q, (i15 & 896) | i18);
                    if (viewState.getIsExpanded()) {
                        c28655q.m87150e0(1790809694);
                        float f13 = 8;
                        C23010x c23010xM73381n = AbstractC25012a.m73381n(2, f13, c2305k, c28655q, 6);
                        iHashCode2 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
                        i19 = i15;
                        Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c0213j2 = c0213j;
                            c28655q.m87163l(c0213j2);
                        } else {
                            c0213j2 = c0213j;
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m2);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode2))) {
                            AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N2);
                        C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                        iHashCode3 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                        Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, c2314t);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a2);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m3);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                            AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N3);
                        c20783tM57300g = viewState.getSummary();
                        if (c20783tM57300g == null) {
                            c28655q.m87150e0(-189099118);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(-189099117);
                            m57256A(c20783tM57300g, function4, c28655q, i18 | C9598e.f28134d | ((i19 >> 3) & 112));
                            c28655q.m87173q(false);
                        }
                        C22971k c22971kM66746i = AbstractC22977m.m66746i(((float) 1.5d) * f13);
                        Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
                        C23010x c23010xM66775a3 = AbstractC23007w.m66775a(c22971kM66746i, c2305k, c28655q, 6);
                        iHashCode4 = Long.hashCode(c28655q.f115904T);
                        InterfaceC28653p1 interfaceC28653p1M87165m4 = c28655q.m87165m();
                        Modifier modifierM118962N4 = AbstractC37056f.m118962N(c28655q, modifierM3409f);
                        c28655q.m87158i0();
                        if (c28655q.f115903S) {
                            c28655q.m87163l(c0213j2);
                        } else {
                            c28655q.m87178s0();
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a3);
                        AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m4);
                        if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode4))) {
                            AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                        }
                        AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N4);
                        c28655q.m87150e0(1581321678);
                        it = viewState.m57299f().iterator();
                        while (it.hasNext()) {
                            m57258C((C20786w) it.next(), c28655q, 0);
                        }
                        z13 = false;
                        c28655q.m87173q(false);
                        c28655q.m87173q(true);
                        c28655q.m87173q(true);
                        c20768kM57297c2 = viewState.getCheckoutInfo();
                        if (c20768kM57297c2 == null) {
                            c28655q.m87150e0(-534476538);
                            c28655q.m87173q(false);
                            c20772m = null;
                        } else {
                            c28655q.m87150e0(-534476537);
                            c20772m = null;
                            AbstractC20766j.m57188f(null, c20768kM57297c2, c28655q, 0, 1);
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(true);
                        c28655q.m87173q(false);
                    } else {
                        z13 = false;
                        c20772m = null;
                        c28655q.m87150e0(1791701502);
                        c28655q.m87173q(false);
                    }
                    c20768kM57297c = viewState.getCheckoutInfo();
                    if (c20768kM57297c != null) {
                        c20772mM57193b = c20768kM57297c.getTotal();
                    } else {
                        c20772mM57193b = c20772m;
                    }
                    if (c20772mM57193b == null) {
                        c28655q.m87150e0(1791748528);
                        c28655q.m87173q(z13);
                    } else {
                        c28655q.m87150e0(1791748529);
                        if (viewState.getIsExpanded()) {
                            z14 = false;
                            c28655q.m87150e0(1088284247);
                            c28655q.m87173q(false);
                        } else {
                            c28655q.m87150e0(1088109345);
                            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(2 * 8, c2314t)));
                            AbstractC20766j.m57190h(c20772mM57193b, c28655q, TextResource.$stable);
                            z14 = false;
                            c28655q.m87173q(false);
                        }
                        c28655q.m87173q(z14);
                    }
                    c28655q.m87173q(true);
                    Modifier modifier4 = modifier2;
                    function3 = function4;
                    modifier3 = modifier4;
                } else {
                    c28655q.m87138X();
                    modifier3 = modifier2;
                    function3 = function2;
                }
                c28677v1M87180u = c28655q.m87180u();
                if (c28677v1M87180u != null) {
                    c28677v1M87180u.f115982d = new C17794v(i13, i14, 17, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
                }
            }
            i15 |= 384;
            function2 = function1;
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C20756e(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (viewState.getIsExpanded()) {
                    textResourceM57298e = viewState.getTitle();
                } else {
                    textResourceM57298e = viewState.getCollapsedTitle();
                }
                Modifier modifierMo3471e2 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a4 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m5 = c28655q.m87165m();
                Modifier modifierM118962N5 = AbstractC37056f.m118962N(c28655q, modifierMo3471e2);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a4);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m5);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N5);
                boolean zM57302i2 = viewState.getIsExpanded();
                i18 = TextResource.$stable;
                m57279o(textResourceM57298e, zM57302i2, function4, c28655q, (i15 & 896) | i18);
                if (viewState.getIsExpanded()) {
                    c28655q.m87150e0(1790809694);
                    float f14 = 8;
                    C23010x c23010xM73381n2 = AbstractC25012a.m73381n(2, f14, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m6 = c28655q.m87165m();
                    i19 = i15;
                    Modifier modifierM118962N6 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n2);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m6);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N6);
                    C23010x c23010xM66775a5 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m7 = c28655q.m87165m();
                    Modifier modifierM118962N7 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a5);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m7);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N7);
                    c20783tM57300g = viewState.getSummary();
                    if (c20783tM57300g == null) {
                        c28655q.m87150e0(-189099118);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-189099117);
                        m57256A(c20783tM57300g, function4, c28655q, i18 | C9598e.f28134d | ((i19 >> 3) & 112));
                        c28655q.m87173q(false);
                    }
                    C22971k c22971kM66746i2 = AbstractC22977m.m66746i(((float) 1.5d) * f14);
                    Modifier modifierM3409f2 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a6 = AbstractC23007w.m66775a(c22971kM66746i2, c2305k, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m8 = c28655q.m87165m();
                    Modifier modifierM118962N8 = AbstractC37056f.m118962N(c28655q, modifierM3409f2);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a6);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m8);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N8);
                    c28655q.m87150e0(1581321678);
                    it = viewState.m57299f().iterator();
                    while (it.hasNext()) {
                        m57258C((C20786w) it.next(), c28655q, 0);
                    }
                    z13 = false;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c20768kM57297c2 = viewState.getCheckoutInfo();
                    if (c20768kM57297c2 == null) {
                        c28655q.m87150e0(-534476538);
                        c28655q.m87173q(false);
                        c20772m = null;
                    } else {
                        c28655q.m87150e0(-534476537);
                        c20772m = null;
                        AbstractC20766j.m57188f(null, c20768kM57297c2, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z13 = false;
                    c20772m = null;
                    c28655q.m87150e0(1791701502);
                    c28655q.m87173q(false);
                }
                c20768kM57297c = viewState.getCheckoutInfo();
                if (c20768kM57297c != null) {
                    c20772mM57193b = c20768kM57297c.getTotal();
                } else {
                    c20772mM57193b = c20772m;
                }
                if (c20772mM57193b == null) {
                    c28655q.m87150e0(1791748528);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(1791748529);
                    if (viewState.getIsExpanded()) {
                        c28655q.m87150e0(1088109345);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(2 * 8, c2314t)));
                        AbstractC20766j.m57190h(c20772mM57193b, c28655q, TextResource.$stable);
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q.m87150e0(1088284247);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                Modifier modifier5 = modifier2;
                function3 = function4;
                modifier3 = modifier5;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 17, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 48;
        modifier2 = modifier;
        i16 = i14 & 4;
        if (i16 != 0) {
            if ((i13 & 384) == 0) {
                function2 = function1;
                if (c28655q.m87157i(function2)) {
                    i17 = 256;
                } else {
                    i17 = 128;
                }
                i15 |= i17;
            }
            if ((i15 & 147) != 146) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (c28655q.m87135U(i15 & 1, z4)) {
                c2314t = C2314t.f9131w;
                if (i24 != 0) {
                    modifier2 = c2314t;
                }
                if (i16 != 0) {
                    objM87133R = c28655q.m87133R();
                    if (objM87133R == C28635l.f115821a) {
                        objM87133R = new C20756e(2);
                        c28655q.m87172p0(objM87133R);
                    }
                    function4 = (Function1) objM87133R;
                } else {
                    function4 = function2;
                }
                if (viewState.getIsExpanded()) {
                    textResourceM57298e = viewState.getTitle();
                } else {
                    textResourceM57298e = viewState.getCollapsedTitle();
                }
                Modifier modifierMo3471e3 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
                c22957g = AbstractC22977m.f90652c;
                c2305k = C2299e.f9110M;
                C23010x c23010xM66775a7 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m9 = c28655q.m87165m();
                Modifier modifierM118962N9 = AbstractC37056f.m118962N(c28655q, modifierMo3471e3);
                InterfaceC0221l.f734a.getClass();
                c0213j = C0217k.f724b;
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                c0209i = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a7);
                c0209i2 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m9);
                c0209i3 = C0217k.f732j;
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
                }
                c0209i4 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N9);
                boolean zM57302i3 = viewState.getIsExpanded();
                i18 = TextResource.$stable;
                m57279o(textResourceM57298e, zM57302i3, function4, c28655q, (i15 & 896) | i18);
                if (viewState.getIsExpanded()) {
                    c28655q.m87150e0(1790809694);
                    float f15 = 8;
                    C23010x c23010xM73381n3 = AbstractC25012a.m73381n(2, f15, c2305k, c28655q, 6);
                    iHashCode2 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m10 = c28655q.m87165m();
                    i19 = i15;
                    Modifier modifierM118962N10 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c0213j2 = c0213j;
                        c28655q.m87163l(c0213j2);
                    } else {
                        c0213j2 = c0213j;
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n3);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m10);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N10);
                    C23010x c23010xM66775a8 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                    iHashCode3 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m11 = c28655q.m87165m();
                    Modifier modifierM118962N11 = AbstractC37056f.m118962N(c28655q, c2314t);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a8);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m11);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N11);
                    c20783tM57300g = viewState.getSummary();
                    if (c20783tM57300g == null) {
                        c28655q.m87150e0(-189099118);
                        c28655q.m87173q(false);
                    } else {
                        c28655q.m87150e0(-189099117);
                        m57256A(c20783tM57300g, function4, c28655q, i18 | C9598e.f28134d | ((i19 >> 3) & 112));
                        c28655q.m87173q(false);
                    }
                    C22971k c22971kM66746i3 = AbstractC22977m.m66746i(((float) 1.5d) * f15);
                    Modifier modifierM3409f3 = AbstractC1102d.m3409f(1.0f, c2314t);
                    C23010x c23010xM66775a9 = AbstractC23007w.m66775a(c22971kM66746i3, c2305k, c28655q, 6);
                    iHashCode4 = Long.hashCode(c28655q.f115904T);
                    InterfaceC28653p1 interfaceC28653p1M87165m12 = c28655q.m87165m();
                    Modifier modifierM118962N12 = AbstractC37056f.m118962N(c28655q, modifierM3409f3);
                    c28655q.m87158i0();
                    if (c28655q.f115903S) {
                        c28655q.m87163l(c0213j2);
                    } else {
                        c28655q.m87178s0();
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a9);
                    AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m12);
                    if (c28655q.f115903S) {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    } else {
                        AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                    }
                    AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N12);
                    c28655q.m87150e0(1581321678);
                    it = viewState.m57299f().iterator();
                    while (it.hasNext()) {
                        m57258C((C20786w) it.next(), c28655q, 0);
                    }
                    z13 = false;
                    c28655q.m87173q(false);
                    c28655q.m87173q(true);
                    c28655q.m87173q(true);
                    c20768kM57297c2 = viewState.getCheckoutInfo();
                    if (c20768kM57297c2 == null) {
                        c28655q.m87150e0(-534476538);
                        c28655q.m87173q(false);
                        c20772m = null;
                    } else {
                        c28655q.m87150e0(-534476537);
                        c20772m = null;
                        AbstractC20766j.m57188f(null, c20768kM57297c2, c28655q, 0, 1);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(true);
                    c28655q.m87173q(false);
                } else {
                    z13 = false;
                    c20772m = null;
                    c28655q.m87150e0(1791701502);
                    c28655q.m87173q(false);
                }
                c20768kM57297c = viewState.getCheckoutInfo();
                if (c20768kM57297c != null) {
                    c20772mM57193b = c20768kM57297c.getTotal();
                } else {
                    c20772mM57193b = c20772m;
                }
                if (c20772mM57193b == null) {
                    c28655q.m87150e0(1791748528);
                    c28655q.m87173q(z13);
                } else {
                    c28655q.m87150e0(1791748529);
                    if (viewState.getIsExpanded()) {
                        c28655q.m87150e0(1088109345);
                        AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(2 * 8, c2314t)));
                        AbstractC20766j.m57190h(c20772mM57193b, c28655q, TextResource.$stable);
                        z14 = false;
                        c28655q.m87173q(false);
                    } else {
                        z14 = false;
                        c28655q.m87150e0(1088284247);
                        c28655q.m87173q(false);
                    }
                    c28655q.m87173q(z14);
                }
                c28655q.m87173q(true);
                Modifier modifier6 = modifier2;
                function3 = function4;
                modifier3 = modifier6;
            } else {
                c28655q.m87138X();
                modifier3 = modifier2;
                function3 = function2;
            }
            c28677v1M87180u = c28655q.m87180u();
            if (c28677v1M87180u != null) {
                c28677v1M87180u.f115982d = new C17794v(i13, i14, 17, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
            }
        }
        i15 |= 384;
        function2 = function1;
        if ((i15 & 147) != 146) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (c28655q.m87135U(i15 & 1, z4)) {
            c2314t = C2314t.f9131w;
            if (i24 != 0) {
                modifier2 = c2314t;
            }
            if (i16 != 0) {
                objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C20756e(2);
                    c28655q.m87172p0(objM87133R);
                }
                function4 = (Function1) objM87133R;
            } else {
                function4 = function2;
            }
            if (viewState.getIsExpanded()) {
                textResourceM57298e = viewState.getTitle();
            } else {
                textResourceM57298e = viewState.getCollapsedTitle();
            }
            Modifier modifierMo3471e4 = AbstractC1102d.m3409f(1.0f, c2314t).mo3471e(modifier2);
            c22957g = AbstractC22977m.f90652c;
            c2305k = C2299e.f9110M;
            C23010x c23010xM66775a10 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m13 = c28655q.m87165m();
            Modifier modifierM118962N13 = AbstractC37056f.m118962N(c28655q, modifierMo3471e4);
            InterfaceC0221l.f734a.getClass();
            c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a10);
            c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m13);
            c0209i3 = C0217k.f732j;
            if (c28655q.f115903S) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            } else {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N13);
            boolean zM57302i4 = viewState.getIsExpanded();
            i18 = TextResource.$stable;
            m57279o(textResourceM57298e, zM57302i4, function4, c28655q, (i15 & 896) | i18);
            if (viewState.getIsExpanded()) {
                c28655q.m87150e0(1790809694);
                float f16 = 8;
                C23010x c23010xM73381n4 = AbstractC25012a.m73381n(2, f16, c2305k, c28655q, 6);
                iHashCode2 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m14 = c28655q.m87165m();
                i19 = i15;
                Modifier modifierM118962N14 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c0213j2 = c0213j;
                    c28655q.m87163l(c0213j2);
                } else {
                    c0213j2 = c0213j;
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM73381n4);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m14);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode2, c28655q, iHashCode2, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N14);
                C23010x c23010xM66775a11 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
                iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m15 = c28655q.m87165m();
                Modifier modifierM118962N15 = AbstractC37056f.m118962N(c28655q, c2314t);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a11);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m15);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N15);
                c20783tM57300g = viewState.getSummary();
                if (c20783tM57300g == null) {
                    c28655q.m87150e0(-189099118);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(-189099117);
                    m57256A(c20783tM57300g, function4, c28655q, i18 | C9598e.f28134d | ((i19 >> 3) & 112));
                    c28655q.m87173q(false);
                }
                C22971k c22971kM66746i4 = AbstractC22977m.m66746i(((float) 1.5d) * f16);
                Modifier modifierM3409f4 = AbstractC1102d.m3409f(1.0f, c2314t);
                C23010x c23010xM66775a12 = AbstractC23007w.m66775a(c22971kM66746i4, c2305k, c28655q, 6);
                iHashCode4 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m16 = c28655q.m87165m();
                Modifier modifierM118962N16 = AbstractC37056f.m118962N(c28655q, modifierM3409f4);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j2);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i, c23010xM66775a12);
                AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m16);
                if (c28655q.f115903S) {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                } else {
                    AbstractC11266d.m30471y(iHashCode4, c28655q, iHashCode4, c0209i3);
                }
                AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N16);
                c28655q.m87150e0(1581321678);
                it = viewState.m57299f().iterator();
                while (it.hasNext()) {
                    m57258C((C20786w) it.next(), c28655q, 0);
                }
                z13 = false;
                c28655q.m87173q(false);
                c28655q.m87173q(true);
                c28655q.m87173q(true);
                c20768kM57297c2 = viewState.getCheckoutInfo();
                if (c20768kM57297c2 == null) {
                    c28655q.m87150e0(-534476538);
                    c28655q.m87173q(false);
                    c20772m = null;
                } else {
                    c28655q.m87150e0(-534476537);
                    c20772m = null;
                    AbstractC20766j.m57188f(null, c20768kM57297c2, c28655q, 0, 1);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            } else {
                z13 = false;
                c20772m = null;
                c28655q.m87150e0(1791701502);
                c28655q.m87173q(false);
            }
            c20768kM57297c = viewState.getCheckoutInfo();
            if (c20768kM57297c != null) {
                c20772mM57193b = c20768kM57297c.getTotal();
            } else {
                c20772mM57193b = c20772m;
            }
            if (c20772mM57193b == null) {
                c28655q.m87150e0(1791748528);
                c28655q.m87173q(z13);
            } else {
                c28655q.m87150e0(1791748529);
                if (viewState.getIsExpanded()) {
                    c28655q.m87150e0(1088109345);
                    AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3409f(1.0f, AbstractC1102d.m3411h(2 * 8, c2314t)));
                    AbstractC20766j.m57190h(c20772mM57193b, c28655q, TextResource.$stable);
                    z14 = false;
                    c28655q.m87173q(false);
                } else {
                    z14 = false;
                    c28655q.m87150e0(1088284247);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(z14);
            }
            c28655q.m87173q(true);
            Modifier modifier7 = modifier2;
            function3 = function4;
            modifier3 = modifier7;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
            function3 = function2;
        }
        c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C17794v(i13, i14, 17, (Object) viewState, (Object) modifier3, (InterfaceC23459e) function3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m57289y(Object it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m57290z(C20784u c20784u, Modifier modifier, Function1 function1, int i13, int i14, Composer composer, int i15) {
        m57288x(c20784u, modifier, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
