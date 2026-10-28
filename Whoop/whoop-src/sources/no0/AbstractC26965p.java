package no0;

import androidx.compose.foundation.AbstractC1092a;
import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import com.whoop.design.models.modal.AnyModal;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.profile.view.C9812h;
import gb1.AbstractC15676d;
import hy0.AbstractC17741f0;
import hy0.AbstractC17746g1;
import hy0.C17749h0;
import hy0.C17750h1;
import hy0.EnumC17745g0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import lo0.C24578f;
import lo0.C24599p0;
import lo0.InterfaceC24615z;
import n72.C26439b;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC22989q;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p292l1.AbstractC23164r1;
import p315m0.AbstractC24868a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p490t0.AbstractC33253j;
import p505ts.AbstractC34132o;
import p602x1.AbstractC37817c;
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import qz0.AbstractC30795n;
import rz0.AbstractC31926e;
import wb3.AbstractC37056f;
import x81.C38072d;

/* JADX INFO: renamed from: no0.p */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a5\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a5\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, m65681d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Llo0/f;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroidx/compose/ui/Modifier;Llo0/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "k", "clinician-in-the-loop_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26965p {
    /* JADX INFO: renamed from: h */
    public static final void m80735h(Modifier modifier, C24578f viewState, Function1 onEvent, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Modifier modifier3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(840844216);
        int i16 = i14 & 1;
        if (i16 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q.m87153g(viewState) : c28655q.m87157i(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            Modifier modifier4 = i16 != 0 ? C2314t.f9131w : modifier2;
            if (viewState.getUseTileBackground()) {
                c28655q.m87150e0(1340942713);
                AbstractC31926e.m99375j(AbstractC1102d.m3409f(1.0f, modifier4), null, C38072d.f163053a.m121949b(c28655q, C38072d.f163054b).getWhite5(), null, null, null, 0.0f, AbstractC37817c.m121344e(-1722250835, c28655q, new C26961n(viewState, onEvent, 0)), c28655q, 12582912, 122);
                c28655q.m87173q(false);
                c28655q = c28655q;
            } else {
                c28655q.m87150e0(1341277079);
                c28655q = c28655q;
                m80738k(modifier4, viewState, onEvent, c28655q, (i15 & 896) | (i15 & 14) | ((((TextResource.$stable | C17749h0.f69004h) | C17750h1.f69012w) | AnyModal.$stable) << 3) | (i15 & 112), 0);
                c28655q.m87173q(false);
            }
            modifier3 = modifier4;
        } else {
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26963o(modifier3, viewState, onEvent, i13, i14, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m80736i(C24578f c24578f, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 3) != 2)) {
            m80738k(AbstractC1099a.m3394p(2 * 8, C2314t.f9131w), c24578f, function1, c28655q, ((((TextResource.$stable | C17749h0.f69004h) | C17750h1.f69012w) | AnyModal.$stable) << 3) | 6, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m80737j(Modifier modifier, C24578f c24578f, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m80735h(modifier, c24578f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: k */
    private static final void m80738k(Modifier modifier, C24578f c24578f, Function1 function1, Composer composer, int i13, int i14) throws XmlPullParserException, IOException {
        Modifier modifier2;
        int i15;
        Function1 function2;
        C28655q c28655q;
        Modifier modifier3;
        C0209i c0209i;
        C0209i c0209i2;
        C0213j c0213j;
        int i16;
        C2314t c2314t;
        C28676v0 c28676v0;
        C0209i c0209i3;
        int i17;
        boolean z4;
        C28655q c28655q2;
        boolean z13;
        C28655q c28655q3 = (C28655q) composer;
        c28655q3.m87154g0(1442252409);
        int i18 = i14 & 1;
        if (i18 != 0) {
            i15 = i13 | 6;
            modifier2 = modifier;
        } else if ((i13 & 6) == 0) {
            modifier2 = modifier;
            i15 = (c28655q3.m87153g(modifier2) ? 4 : 2) | i13;
        } else {
            modifier2 = modifier;
            i15 = i13;
        }
        if ((i13 & 48) == 0) {
            i15 |= (i13 & 64) == 0 ? c28655q3.m87153g(c24578f) : c28655q3.m87157i(c24578f) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q3.m87157i(function1) ? 256 : 128;
        }
        if (c28655q3.m87135U(i15 & 1, (i15 & 147) != 146)) {
            C2314t c2314t2 = C2314t.f9131w;
            Modifier modifier4 = i18 != 0 ? c2314t2 : modifier2;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, modifier4);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.m66746i(12), C2299e.f9108K, c28655q3, 54);
            int iHashCode = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q3.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q3, modifierM3409f);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j2 = C0217k.f724b;
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j2);
            } else {
                c28655q3.m87178s0();
            }
            C0209i c0209i4 = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q3, c0209i4, c22994r1M66759a);
            C0209i c0209i5 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m);
            C0209i c0209i6 = C0217k.f732j;
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q3, iHashCode, c0209i6);
            }
            C0209i c0209i7 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N);
            C17749h0 headshot = c24578f.getHeadshot();
            C28676v0 c28676v1 = C28635l.f115821a;
            if (headshot == null) {
                c28655q3.m87150e0(-378522386);
                c28655q3.m87173q(false);
                c0209i = c0209i5;
                c0213j = c0213j2;
                i16 = i15;
                c2314t = c2314t2;
                c0209i3 = c0209i4;
                c28676v0 = c28676v1;
                c0209i2 = c0209i6;
                i17 = 6;
                z4 = true;
            } else {
                c28655q3.m87150e0(-378522385);
                Modifier modifierM118994r = AbstractC37056f.m118994r(AbstractC1102d.m3419p(56, c2314t2), AbstractC33253j.f138651a);
                boolean zM87157i = ((i15 & 896) == 256) | c28655q3.m87157i(headshot);
                Object objM87133R = c28655q3.m87133R();
                if (zM87157i || objM87133R == c28676v1) {
                    objM87133R = new C26964o0(2, function1, headshot);
                    c28655q3.m87172p0(objM87133R);
                }
                Modifier modifierM3362g = AbstractC1092a.m3362g(modifierM118994r, false, null, null, (InterfaceC4339a) objM87133R, 15);
                InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
                int iHashCode2 = Long.hashCode(c28655q3.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q3.m87165m();
                Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q3, modifierM3362g);
                c28655q3.m87158i0();
                if (c28655q3.f115903S) {
                    c28655q3.m87163l(c0213j2);
                } else {
                    c28655q3.m87178s0();
                }
                AbstractC28683x.m87239G(c28655q3, c0209i4, interfaceC39127r0M66763d);
                AbstractC28683x.m87239G(c28655q3, c0209i5, interfaceC28653p1M87165m2);
                if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode2))) {
                    AbstractC11266d.m30471y(iHashCode2, c28655q3, iHashCode2, c0209i6);
                }
                AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N2);
                c0209i = c0209i5;
                c0209i2 = c0209i6;
                c0213j = c0213j2;
                i16 = i15;
                c2314t = c2314t2;
                c28676v0 = c28676v1;
                c0209i3 = c0209i4;
                i17 = 6;
                z4 = true;
                AbstractC17741f0.m50848j(AbstractC1102d.m3407d(1.0f, c2314t2), C17749h0.m50892b(headshot, null, null, null, 56, 56, EnumC17745g0.CIRCLE, false, 71, null), c28655q3, (C17749h0.f69004h << 3) | 6);
                c28655q3.m87173q(true);
                c28655q3.m87173q(false);
            }
            if (!(((double) 1.0f) > 0.0d ? z4 : false)) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, z4);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.m66746i(4), C2299e.f9110M, c28655q3, i17);
            int iHashCode3 = Long.hashCode(c28655q3.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q3.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q3, layoutWeightElement);
            c28655q3.m87158i0();
            if (c28655q3.f115903S) {
                c28655q3.m87163l(c0213j);
            } else {
                c28655q3.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q3, c0209i3, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q3, c0209i, interfaceC28653p1M87165m3);
            if (c28655q3.f115903S || !AbstractC22676k.m65745e(c28655q3.m87133R(), Integer.valueOf(iHashCode3))) {
                AbstractC11266d.m30471y(iHashCode3, c28655q3, iHashCode3, c0209i2);
            }
            AbstractC28683x.m87239G(c28655q3, c0209i7, modifierM118962N3);
            C17750h1 tag = c24578f.getTag();
            if (tag == null) {
                c28655q3.m87150e0(-72570422);
                c28655q3.m87173q(false);
                c28655q2 = c28655q3;
            } else {
                c28655q3.m87150e0(-72570421);
                c28655q2 = c28655q3;
                AbstractC17746g1.m50872h(tag, null, null, c28655q2, C17750h1.f69012w, 6);
                c28655q2.m87173q(false);
            }
            TextResource title = c24578f.getTitle();
            int i19 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q2, i19);
            C38072d c38072d = C38072d.f163053a;
            int i24 = C38072d.f163054b;
            C2886a b6 = c38072d.m121952e(c28655q2, i24).getB1();
            long brandWhite = c38072d.m121949b(c28655q2, i24).getBrandWhite();
            int i25 = C2886a.f11498d << 18;
            C28655q c28655q4 = c28655q2;
            AbstractC30795n.m94707h(strM21274h, null, brandWhite, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, b6, null, c28655q4, 0, i25, 196602);
            c28655q = c28655q4;
            TextResource subtitle = c24578f.getSubtitle();
            if (subtitle == null) {
                c28655q.m87150e0(-72240861);
                z13 = false;
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-72240860);
                AbstractC30795n.m94707h(AbstractC8693b.m21274h(subtitle, c28655q, i19), null, c38072d.m121949b(c28655q, i24).getWhite50(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i24).getB2(), null, c28655q, 0, i25, 196602);
                c28655q = c28655q;
                z13 = false;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            C24599p0 icon = c24578f.getIcon();
            if (icon == null) {
                c28655q.m87150e0(-377234398);
                c28655q.m87173q(z13);
                function2 = function1;
            } else {
                c28655q.m87150e0(-377234397);
                C27430e c27430eM107874S = AbstractC34132o.m107874S(icon.getIcon().toWhoopIcon(), c28655q, 6);
                String contentDescription = icon.getContentDescription();
                long white70 = c38072d.m121949b(c28655q, i24).getWhite70();
                Modifier modifierM3419p = AbstractC1102d.m3419p(24, c2314t);
                AnyModal modal = icon.getModal();
                boolean z14 = (i16 & 896) == 256 ? z4 : false;
                Object objM87133R2 = c28655q.m87133R();
                C28676v0 c28676v2 = c28676v0;
                if (z14 || objM87133R2 == c28676v2) {
                    function2 = function1;
                    objM87133R2 = new C9812h(function2, 3);
                    c28655q.m87172p0(objM87133R2);
                } else {
                    function2 = function1;
                }
                InterfaceC4351m interfaceC4351m = (InterfaceC4351m) objM87133R2;
                Object objM87133R3 = c28655q.m87133R();
                if (objM87133R3 == c28676v2) {
                    objM87133R3 = new C26439b(12);
                    c28655q.m87172p0(objM87133R3);
                }
                C28655q c28655q5 = c28655q;
                AbstractC23164r1.m67133b(c27430eM107874S, contentDescription, AbstractC15676d.m44100c(modifierM3419p, modal, interfaceC4351m, (Function1) objM87133R3), white70, c28655q5, 0, 0);
                c28655q = c28655q5;
                c28655q.m87173q(false);
            }
            c28655q.m87173q(z4);
            modifier3 = modifier4;
        } else {
            function2 = function1;
            c28655q = c28655q3;
            c28655q.m87138X();
            modifier3 = modifier2;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C26963o(modifier3, c24578f, function2, i13, i14, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m80739l(Function1 function1, C17749h0 c17749h0) {
        C23454a0 c23454a0 = C23454a0.f92919a;
        function1.invoke(new InterfaceC24615z.e(c23454a0, c17749h0));
        return c23454a0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final Modifier m80740m(Function1 function1, Modifier applyIfNotNullElse, AnyModal modal) {
        AbstractC22676k.m65750j(applyIfNotNullElse, "$this$applyIfNotNullElse");
        AbstractC22676k.m65750j(modal, "modal");
        return AbstractC1092a.m3362g(C2314t.f9131w, false, null, null, new C26964o0(3, function1, modal), 15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m80741n(Function1 function1, AnyModal anyModal) {
        function1.invoke(anyModal);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final Modifier m80742o(Modifier applyIfNotNullElse) {
        AbstractC22676k.m65750j(applyIfNotNullElse, "$this$applyIfNotNullElse");
        return C2314t.f9131w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m80743p(Modifier modifier, C24578f c24578f, Function1 function1, int i13, int i14, Composer composer, int i15) throws XmlPullParserException, IOException {
        m80738k(modifier, c24578f, function1, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }
}
