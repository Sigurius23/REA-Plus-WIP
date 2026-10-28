package mi2;

import android.content.Context;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.p018ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import ji2.C21728g;
import ji2.C21733l;
import ji2.InterfaceC21730i;
import kd1.AbstractC22403o;
import kd1.AbstractC22404p;
import l83.C23454a0;
import mh.C25540h;
import ny0.AbstractC27265l0;
import ny0.AbstractC27282u;
import ny0.EnumC27269n0;
import ny0.EnumC27284v;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11894a;
import p127ev.AbstractC13673n;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22957g;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p635y2.C39102j;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p717lq2.C24679k;
import pf.AbstractC29125c;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: mi2.p */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a9\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006H\u0007¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a+\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000f"}, m65681d2 = {"Lji2/l;", "parentViewState", "Lkotlin/Function1;", "Lji2/i;", "Ll83/a0;", "onViewEvent", "Lkotlin/Function0;", "onBackPressed", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lji2/l;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V", "Lji2/g;", "viewState", "o", "(Lji2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "k", "strava_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC25593p {
    /* JADX INFO: renamed from: h */
    public static final void m75321h(C21733l parentViewState, Function1 function1, InterfaceC4339a onBackPressed, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        C0209i c0209i;
        Function1 onViewEvent = function1;
        AbstractC22676k.m65750j(parentViewState, "parentViewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onBackPressed, "onBackPressed");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(-1554753810);
        if ((i13 & 6) == 0) {
            i14 = (c28655q2.m87157i(parentViewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(onBackPressed) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C21728g c21728gM61297d = parentViewState.getSettingsUnconnected();
            if (c21728gM61297d == null) {
                c28655q2.m87150e0(-743188311);
                c28655q2.m87173q(false);
                c28655q = c28655q2;
            } else {
                c28655q2.m87150e0(-743188310);
                C2314t c2314t = C2314t.f9131w;
                Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM94757f);
                InterfaceC0221l.f734a.getClass();
                C0213j c0213j = C0217k.f724b;
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                C0209i c0209i2 = C0217k.f729g;
                AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC39127r0M66763d);
                C0209i c0209i3 = C0217k.f728f;
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m);
                C0209i c0209i4 = C0217k.f732j;
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                    AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i4);
                }
                C0209i c0209i5 = C0217k.f726d;
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N);
                AbstractC22403o abstractC22403oM61249a = c21728gM61297d.getBackgroundImageUrl();
                int i15 = AbstractC22403o.f87638a;
                AbstractC29125c.m88522c(AbstractC22404p.m64500i(abstractC22403oM61249a, null, null, c28655q2, i15, 3), null, AbstractC1102d.m3409f(1.0f, AbstractC1099a.m3384f(c2314t, false, 1.25f)), null, C39102j.f168202d, 0.0f, null, c28655q2, 25008, 104);
                Modifier modifierM3407d = AbstractC1102d.m3407d(1.0f, c2314t);
                C22957g c22957g = AbstractC22977m.f90652c;
                C2305k c2305k = C2299e.f9110M;
                C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q2, 0);
                int iHashCode2 = Long.hashCode(c28655q2.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3407d);
                c28655q2.m87158i0();
                if (c28655q2.f115903S) {
                    c28655q2.m87163l(c0213j);
                } else {
                    c28655q2.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q2, c0209i2, c23010xM66775a);
                AbstractC28683x.m87239G(c28655q2, c0209i3, interfaceC28653p1M87165m2);
                if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                    c0209i = c0209i4;
                    AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i);
                } else {
                    c0209i = c0209i4;
                }
                AbstractC28683x.m87239G(c28655q2, c0209i5, modifierM118962N2);
                AbstractC6721d.c cVar = new AbstractC6721d.c(null, AbstractC8693b.m21267a(), null, AbstractC13673n.m38561h(C38072d.f163053a), AbstractC30060g.m92103Y(c28655q2, AbstractC35283c.f150167E), null, null, null, null, null, null, null, null, 8165, null);
                Modifier modifierM66723l = AbstractC22953f.m66723l(c2314t);
                boolean z4 = (i14 & 896) == 256;
                Object objM87133R = c28655q2.m87133R();
                if (z4 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C24679k(onBackPressed, 11);
                    c28655q2.m87172p0(objM87133R);
                }
                C0209i c0209i6 = c0209i;
                int i16 = i14;
                AbstractC6719b.m20143d(modifierM66723l, cVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, AbstractC6721d.c.f25657p << 3, 52);
                c28655q = c28655q2;
                Modifier modifierM92116f0 = AbstractC30060g.m92116f0(AbstractC1102d.m3407d(1.0f, c2314t), AbstractC30060g.m92099U(0, c28655q, 1), 14);
                C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90656g, c2305k, c28655q, 6);
                int iHashCode3 = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
                Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM92116f0);
                c28655q.m87158i0();
                if (c28655q.f115903S) {
                    c28655q.m87163l(c0213j);
                } else {
                    c28655q.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q, c0209i2, c23010xM66775a2);
                AbstractC28683x.m87239G(c28655q, c0209i3, interfaceC28653p1M87165m3);
                if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode3))) {
                    AbstractC11266d.m30471y(iHashCode3, c28655q, iHashCode3, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q, c0209i5, modifierM118962N3);
                int i17 = TextResource.$stable;
                int i18 = i17 | i15 | i17 | i17 | i17 | i17 | C39274g.f168929c | (i16 & 112);
                onViewEvent = function1;
                m75328o(c21728gM61297d, onViewEvent, c28655q, i18);
                m75324k(c21728gM61297d, onViewEvent, c28655q, i18);
                AbstractC2875y.m8286B(c28655q, true, true, true, false);
            }
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25585h(parentViewState, onViewEvent, onBackPressed, i13, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m75322i(InterfaceC4339a interfaceC4339a) {
        interfaceC4339a.invoke();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m75323j(C21733l c21733l, Function1 function1, InterfaceC4339a interfaceC4339a, int i13, Composer composer, int i14) {
        m75321h(c21733l, function1, interfaceC4339a, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m75324k(C21728g c21728g, Function1 function1, Composer composer, int i13) {
        int i14;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1742674465);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c21728g) : c28655q.m87157i(c21728g) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i15 = i14;
        boolean z4 = false;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC1102d.m3409f(1.0f, c2314t), 0.0f, 0.0f, 0.0f, f13, 7);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9111N, c28655q, 48);
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
            EnumC27284v enumC27284v = EnumC27284v.TextLarge;
            TextResource textResourceM61250b = c21728g.getButtonDisplay();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM61250b, c28655q, i16);
            Modifier modifierM3394p = AbstractC1099a.m3394p(f13, AbstractC1102d.m3409f(1.0f, c2314t));
            long jM125377a = C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getAccentAction();
            int i17 = i15 & 112;
            int i18 = i15 & 14;
            boolean z13 = (i17 == 32) | (i18 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c21728g)));
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z13 || objM87133R == c28676v0) {
                objM87133R = new C25592o(0, function2, c21728g);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC27282u.m82292h(modifierM3394p, enumC27284v, strM21274h, false, jM125377a, null, false, (InterfaceC4339a) objM87133R, c28655q, 54, 104);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource textResourceM61256h = c21728g.getPrivacyPolicyDisplay();
            boolean z14 = i17 == 32;
            if (i18 == 4 || ((i15 & 8) != 0 && c28655q.m87157i(c21728g))) {
                z4 = true;
            }
            boolean z15 = z14 | z4;
            Object objM87133R2 = c28655q.m87133R();
            if (z15 || objM87133R2 == c28676v0) {
                objM87133R2 = new C25590m(function1, c21728g, 1);
                c28655q.m87172p0(objM87133R2);
            }
            function2 = function1;
            AbstractC27265l0.m82217i(null, enumC27269n0, textResourceM61256h, null, null, false, null, null, false, false, null, null, (Function1) objM87133R2, c28655q, (i16 << 6) | 48, 0, 4089);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25591n(c21728g, function2, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m75325l(Function1 function1, C21728g c21728g) {
        function1.invoke(new InterfaceC21730i.a(c21728g.getWebAuthorizationUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m75326m(Function1 function1, C21728g c21728g, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC21730i.j(c21728g.getPrivacyPolicyUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m75327n(C21728g c21728g, Function1 function1, int i13, Composer composer, int i14) {
        m75324k(c21728g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0216  */
    /* JADX INFO: renamed from: o */
    private static final void m75328o(C21728g c21728g, Function1 function1, Composer composer, int i13) {
        int i14;
        boolean z4;
        float f13;
        C2314t c2314t;
        boolean z13;
        Object objM87133R;
        C21728g c21728g2 = c21728g;
        Function1 function2 = function1;
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1703680322);
        if ((i13 & 6) == 0) {
            i14 = i13 | ((i13 & 8) == 0 ? c28655q.m87153g(c21728g2) : c28655q.m87157i(c21728g2) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(function2) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q.m87135U(i15 & 1, (i15 & 19) != 18)) {
            float f14 = 8;
            float f15 = 2 * f14;
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t2, f15, 0.0f, f15, 4 * f14, 2);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(f15), C2299e.f9110M, c28655q, 6);
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
            float f16 = 1 * f14;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t2));
            if (c21728g2.getIconUrl().length() > 0) {
                c28655q.m87150e0(-57845301);
                C25540h c25540h = new C25540h((Context) c28655q.m87161k(AndroidCompositionLocals_androidKt.f4976b));
                c25540h.f100079c = c21728g2.getIconUrl();
                z4 = true;
                c2314t = c2314t2;
                f13 = f14;
                AbstractC11894a.m31954c(c25540h.m75117a(), null, AbstractC1102d.m3411h(6 * f14, AbstractC25589l.m75313z(c2314t2, ((float) 0.5d) * f14)), null, C39102j.f168201c, 0.0f, c28655q, 1572912, 952);
                c28655q.m87173q(false);
            } else {
                z4 = true;
                f13 = f14;
                c2314t = c2314t2;
                c28655q.m87150e0(-57451942);
                c28655q.m87173q(false);
            }
            TextResource textResourceM61258j = c21728g2.getTitleDisplay();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM61258j, c28655q, i16);
            C38072d c38072d = C38072d.f163053a;
            int i17 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i17).getBrandWhite();
            C2886a c2886aM8416N = c38072d.m121952e(c28655q, i17).getT1();
            int i18 = C2886a.f11498d << 18;
            boolean z14 = false;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8416N, null, c28655q, 0, i18, 196602);
            C2314t c2314t3 = c2314t;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3411h(f16, c2314t3));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c21728g.getDescriptionDisplay(), c28655q, i16), null, c38072d.m121949b(c28655q, i17).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i17).getB1(), null, c28655q, 0, i18, 196602);
            EnumC27269n0 enumC27269n0 = EnumC27269n0.TextSmall;
            TextResource textResourceM61253e = c21728g.getLearnMoreDisplay();
            C39274g c39274gM61254f = c21728g.getLearnMoreIcon();
            Modifier modifierM75313z = AbstractC25589l.m75313z(c2314t3, ((float) 1.5d) * f13);
            boolean z15 = (i15 & 112) == 32;
            if ((i15 & 14) != 4) {
                if ((i15 & 8) != 0) {
                    c21728g2 = c21728g;
                    if (c28655q.m87157i(c21728g2)) {
                    }
                } else {
                    c21728g2 = c21728g;
                }
                z13 = z15 | z14;
                objM87133R = c28655q.m87133R();
                if (z13 || objM87133R == C28635l.f115821a) {
                    objM87133R = new C25590m(function1, c21728g2, 0);
                    c28655q.m87172p0(objM87133R);
                }
                function2 = function1;
                AbstractC27265l0.m82217i(modifierM75313z, enumC27269n0, textResourceM61253e, null, c39274gM61254f, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i16 << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
                c28655q = c28655q;
                c28655q.m87173q(true);
            } else {
                c21728g2 = c21728g;
            }
            z14 = true;
            z13 = z15 | z14;
            objM87133R = c28655q.m87133R();
            if (z13) {
                objM87133R = new C25590m(function1, c21728g2, 0);
                c28655q.m87172p0(objM87133R);
            } else {
                objM87133R = new C25590m(function1, c21728g2, 0);
                c28655q.m87172p0(objM87133R);
            }
            function2 = function1;
            AbstractC27265l0.m82217i(modifierM75313z, enumC27269n0, textResourceM61253e, null, c39274gM61254f, false, null, null, false, false, null, null, (Function1) objM87133R, c28655q, (i16 << 6) | 48 | (C39274g.f168929c << 12), 0, 4072);
            c28655q = c28655q;
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C25591n(c21728g2, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m75329p(Function1 function1, C21728g c21728g, Object it) {
        AbstractC22676k.m65750j(it, "it");
        function1.invoke(new InterfaceC21730i.e(c21728g.getLearnMoreUrl()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m75330q(C21728g c21728g, Function1 function1, int i13, Composer composer, int i14) {
        m75328o(c21728g, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
