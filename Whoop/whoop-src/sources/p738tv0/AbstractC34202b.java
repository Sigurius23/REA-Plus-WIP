package p738tv0;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import hy0.AbstractC17795v0;
import hy0.AbstractC17801x0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import lv0.AbstractC24758a;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p163g1.AbstractC15005f3;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p319m4.AbstractC25012a;
import p355o2.C27430e;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p505ts.AbstractC34132o;
import p571w3.C36775k;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pv0.C29577d;
import pv0.InterfaceC29575b;
import qz0.AbstractC30795n;
import re1.C31324k;
import sg2.C32458i;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;

/* JADX INFO: renamed from: tv0.b */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a+\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\b\u0010\u0007¨\u0006\t"}, m65681d2 = {"Lpv0/d;", "viewState", "Lkotlin/Function1;", "", "Ll83/a0;", "onEvent", "e", "(Lpv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "content-search_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC34202b {
    /* JADX INFO: renamed from: e */
    public static final void m108107e(C29577d viewState, Function1 onEvent, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onEvent, "onEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1926572327);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onEvent) ? 32 : 16;
        }
        if (!c28655q.m87135U(i14 & 1, (i14 & 19) != 18)) {
            c28655q.m87138X();
        } else if (viewState.getIsLoading()) {
            c28655q.m87150e0(-1865108317);
            AbstractC34204d.m108117b(c28655q, 0);
            c28655q.m87173q(false);
        } else if (viewState.getIsError()) {
            c28655q.m87150e0(-1865107216);
            boolean z4 = (i14 & 112) == 32;
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C32458i(onEvent, 16);
                c28655q.m87172p0(objM87133R);
            }
            Function0.m108114b((InterfaceC4339a) objM87133R, c28655q, 0);
            c28655q.m87173q(false);
        } else {
            c28655q.m87150e0(-1865104838);
            m108110h(viewState, onEvent, c28655q, i14 & 126);
            c28655q.m87173q(false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34201a(viewState, onEvent, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public static final C23454a0 m108108f(Function1 function1) {
        function1.invoke(new InterfaceC29575b.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m108109g(C29577d c29577d, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m108107e(c29577d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    private static final void m108110h(C29577d c29577d, Function1 function1, Composer composer, int i13) throws XmlPullParserException, IOException {
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(183778316);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(c29577d) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        int i15 = i14;
        if (c28655q2.m87135U(i15 & 1, (i15 & 19) != 18)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM94757f = AbstractC30802r.m94757f(c2314t, 1.0f);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
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
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N);
            c28655q2.m87150e0(502319690);
            TextResource textResourceM90680i = c29577d.getSearchQuery();
            int i16 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM90680i, c28655q2, i16);
            float f13 = 8;
            float f14 = 1 * f13;
            Modifier modifierM3398t = AbstractC1099a.m3398t(c2314t, 0.0f, f14, 0.0f, 0.0f, 13);
            TextResource textResourceM90684m = c29577d.getToolbarTitle();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(textResourceM90684m, null, new C39274g(AbstractC18489d0.m53357C(c38072d), AbstractC8693b.m21277k(AbstractC35283c.f150167E)), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            boolean zM87157i = ((i15 & 112) == 32) | c28655q2.m87157i(c29577d) | c28655q2.m87153g(strM21274h);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new C31324k(6, function1, c29577d, strM21274h);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(modifierM3398t, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q2, (AbstractC6721d.a.f25641r << 3) | 6, 52);
            float f15 = 2 * f13;
            AbstractC17795v0.m51127j(AbstractC1099a.m3398t(c2314t, f15, 0.0f, f15, f15, 2), c29577d.getSearchQuery(), c29577d.getSearchTextPlaceholder(), null, 0L, 0, false, null, 0L, true, null, true, false, null, function1, c28655q2, (i16 << 3) | 805306374 | (i16 << 6), ((i15 << 9) & 57344) | 48, 13816);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3407d(1.0f, c2314t), ((float) 4.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode2 = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q2.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q2, modifierM3396r);
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, c0209i, c23010xM66775a2);
            AbstractC28683x.m87239G(c28655q2, c0209i2, interfaceC28653p1M87165m2);
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode2))) {
                AbstractC11266d.m30471y(iHashCode2, c28655q2, iHashCode2, c0209i3);
            }
            AbstractC28683x.m87239G(c28655q2, c0209i4, modifierM118962N2);
            Modifier modifierM3398t2 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, ((float) 1.5d) * f13, 7);
            C27430e c27430eM107874S = AbstractC34132o.m107874S(c29577d.getSearchLandingIcon(), c28655q2, 6);
            int i17 = C38072d.f163054b;
            AbstractC15005f3.m43108b(c27430eM107874S, null, modifierM3398t2, c38072d.m121949b(c28655q2, i17).getWhite30(), c28655q2, 432, 0);
            Modifier modifierM3398t3 = AbstractC1099a.m3398t(c2314t, 0.0f, 0.0f, 0.0f, f14, 7);
            String strM21274h2 = AbstractC8693b.m21274h(c29577d.getSearchLandingTitle(), c28655q2, i16);
            long jM125430y = c38072d.m121949b(c28655q2, i17).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q2, i17).getT3();
            C36775k c36775k = new C36775k(3);
            int i18 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h2, modifierM3398t3, jM125430y, 0L, null, null, null, 0L, null, c36775k, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q2, 48, i18, 196088);
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c29577d.getSearchLandingSubTitle(), c28655q2, i16), null, c38072d.m121949b(c28655q2, i17).getWhite70(), 0L, null, null, null, 0L, null, new C36775k(3), 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i17).getB2(), null, c28655q2, 0, i18, 196090);
            c28655q = c28655q2;
            AbstractC25012a.m73392y(c28655q, true, false, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C34201a(c29577d, function1, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m108111i(Function1 function1, C29577d c29577d, String str) {
        function1.invoke(new AbstractC17801x0.b(c29577d.getSearchQuery()));
        function1.invoke(new AbstractC24758a.a(null, null, str, 3, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m108112j(C29577d c29577d, Function1 function1, int i13, Composer composer, int i14) throws XmlPullParserException, IOException {
        m108110h(c29577d, function1, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
