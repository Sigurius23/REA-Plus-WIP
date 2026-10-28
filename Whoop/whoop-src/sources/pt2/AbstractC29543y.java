package pt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.lazy.InterfaceC1103a;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import com.whoop.weeklyplan.customizeplan.domain.api.TargetGoalType;
import dc0.C11901c;
import gb1.AbstractC15673b0;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import java.util.Iterator;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mt2.AbstractC25946g;
import n51.C26299f;
import no0.C26949h;
import no0.C26954j0;
import nt2.AbstractC27131a;
import nx1.C27225g;
import ny0.AbstractC27292z;
import os0.C28308d;
import ot2.AbstractC28336e;
import ot2.AbstractC28344m;
import ot2.C28349r;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p088dc.AbstractC11895b;
import p291l0.AbstractC22953f;
import p291l0.AbstractC22977m;
import p291l0.AbstractC22988p1;
import p291l0.AbstractC23007w;
import p291l0.C22994r1;
import p291l0.C23010x;
import p315m0.AbstractC24868a;
import p319m4.AbstractC25012a;
import p329n0.InterfaceC26064q;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28676v0;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p699b70.C2777c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.AbstractC25303l;
import p720m91.C25307p;
import p720m91.InterfaceC25312u;
import p730qt2.AbstractC30614t;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import r80.AbstractC31061c;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: pt2.y */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a?\u0010\r\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0003¢\u0006\u0004\b\r\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"Lot2/m;", "viewState", "Lkotlin/Function1;", "Lnt2/a;", "Ll83/a0;", "onViewEvent", "Lmt2/g;", "onNavigationEvent", "t", "(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Lot2/r;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lot2/r;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "o", "r", "(Lot2/r;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29543y {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public static final C23454a0 m90459A(InterfaceC25312u interfaceC25312u, Function1 function1, Function1 function2, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C25307p c25307pM85891b = AbstractC28336e.m85891b();
            boolean zM87153g = c28655q.m87153g(function1) | c28655q.m87153g(function2);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C2777c(function1, 15, function2);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM85891b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            AbstractC18489d0.m53380u(3, 4, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public static final C23454a0 m90460B(Function1 function1, Function1 function2, Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC27131a.m) {
            function1.invoke(event);
        } else if (event instanceof AbstractC25946g) {
            if (event instanceof AbstractC25946g.g) {
                function1.invoke(new AbstractC27131a.q(((AbstractC25946g.g) event).getTargetGoalType()));
            }
            function2.invoke(event);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public static final C23454a0 m90461C(C28349r c28349r, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            C22994r1 c22994r1M66759a = AbstractC22988p1.m66759a(AbstractC22977m.f90650a, C2299e.f9108K, c28655q, 48);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM3409f);
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
            TextResource textResourceM86014g = c28349r.getNotSelectedMetricHeader();
            int i14 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM86014g, c28655q, i14);
            C38072d c38072d = C38072d.f163053a;
            int i15 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q, i15).getBrandWhite();
            C2886a c2886aM8418P = c38072d.m121952e(c28655q, i15).getT3();
            int i16 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8418P, null, c28655q, 0, i16, 196602);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            AbstractC22953f.m66715b(c28655q, new LayoutWeightElement(1.0f, true));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(c28349r.getNotSelectedMetricTimePeriod(), c28655q, i14), null, c38072d.m121949b(c28655q, i15).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i15).getB2(), null, c28655q, 0, i16, 196602);
            c28655q.m87173q(true);
            float f13 = 8;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(1 * f13, c2314t));
            AbstractC30614t.m93977b(c28349r.m86012e(), c28655q, 0);
            AbstractC18489d0.m53380u(2, f13, c2314t, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D */
    public static final C23454a0 m90462D(InterfaceC25312u interfaceC25312u, Function1 function1, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            C25307p c25307pM85891b = AbstractC28336e.m85891b();
            boolean zM87153g = c28655q.m87153g(function1);
            Object objM87133R = c28655q.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C29520c(function1, 5);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC25303l.m74291r(interfaceC25312u, c25307pM85891b, null, (Function1) objM87133R, c28655q, C25307p.f99300b << 3, 4);
            AbstractC18489d0.m53380u(3, 4, C2314t.f9131w, c28655q);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E */
    public static final C23454a0 m90463E(Function1 function1, Object viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        if (viewEvent instanceof AbstractC27131a.a) {
            function1.invoke(viewEvent);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public static final C23454a0 m90464F(C28349r c28349r, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90487w(c28349r, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: o */
    private static final void m90479o(C28349r c28349r, Function1 function1, Function1 function2, Composer composer, int i13) {
        C28349r c28349r2;
        int i14;
        C28655q c28655q;
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1694607499);
        if ((i13 & 6) == 0) {
            c28349r2 = c28349r;
            i14 = (c28655q2.m87157i(c28349r2) ? 4 : 2) | i13;
        } else {
            c28349r2 = c28349r;
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q2.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q2.m87157i(function2) ? 256 : 128;
        }
        if (c28655q2.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            float f13 = 2 * 8;
            Modifier modifierM3398t = AbstractC1099a.m3398t(AbstractC22953f.m66722k(c2314t), 0.0f, f13, 0.0f, 0.0f, 13);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q2, 0);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, modifierM3398t);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q2.m87158i0();
            if (c28655q2.f115903S) {
                c28655q2.m87163l(c0213j);
            } else {
                c28655q2.m87178s0();
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f729g, c23010xM66775a);
            AbstractC28683x.m87239G(c28655q2, C0217k.f728f, interfaceC28653p1M87165m);
            C0209i c0209i = C0217k.f732j;
            if (c28655q2.f115903S || !AbstractC22676k.m65745e(c28655q2.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q2, iHashCode, c0209i);
            }
            AbstractC28683x.m87239G(c28655q2, C0217k.f726d, modifierM118962N);
            Modifier modifierM3396r = AbstractC1099a.m3396r(c2314t, 5 * 4, 0.0f, 2);
            TextResource textResourceM86009b = c28349r2.getButtonTitle();
            boolean zM86008a = c28349r2.getButtonEnabled();
            boolean z4 = ((i14 & 112) == 32) | ((i14 & 896) == 256);
            Object objM87133R = c28655q2.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11901c(function1, 19, function2);
                c28655q2.m87172p0(objM87133R);
            }
            AbstractC27292z.m82343j(modifierM3396r, zM86008a, false, null, null, null, textResourceM86009b, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R, c28655q2, (TextResource.$stable << 18) | 6, 0, 8124);
            c28655q = c28655q2;
            AbstractC25012a.m73389v(c2314t, f13, c28655q, true);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29541w(c28349r, function1, function2, i13, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m90480p(Function1 function1, Function1 function2) {
        function1.invoke(AbstractC27131a.k.f108498a);
        function2.invoke(new AbstractC25946g.b(null, 1, 0 == true ? 1 : 0));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m90481q(C28349r c28349r, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90479o(c28349r, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: r */
    public static final void m90482r(C28349r viewState, Composer composer, int i13) {
        int i14;
        C28655q c28655q;
        AbstractC22676k.m65750j(viewState, "viewState");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(455966256);
        if ((i13 & 6) == 0) {
            i14 = i13 | (c28655q2.m87157i(viewState) ? 4 : 2);
        } else {
            i14 = i13;
        }
        if (!c28655q2.m87135U(i14 & 1, (i14 & 3) != 2)) {
            c28655q = c28655q2;
            c28655q.m87138X();
        } else if (viewState.getHeaderDisplay() == null || viewState.getHeaderSubtitleDisplay() == null) {
            c28655q = c28655q2;
            c28655q.m87150e0(-1290216654);
            c28655q.m87173q(false);
        } else {
            c28655q2.m87150e0(-1290668324);
            TextResource textResourceM86010c = viewState.getHeaderDisplay();
            int i15 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(textResourceM86010c, c28655q2, i15);
            C38072d c38072d = C38072d.f163053a;
            int i16 = C38072d.f163054b;
            long jM125430y = c38072d.m121949b(c28655q2, i16).getBrandWhite();
            C2886a c2886aM8417O = c38072d.m121952e(c28655q2, i16).getT2();
            int i17 = C2886a.f11498d << 18;
            AbstractC30795n.m94707h(strM21274h, null, jM125430y, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c2886aM8417O, null, c28655q2, 0, i17, 196602);
            float f13 = 8;
            C2314t c2314t = C2314t.f9131w;
            AbstractC22953f.m66715b(c28655q2, AbstractC1102d.m3419p(2 * f13, c2314t));
            AbstractC30795n.m94707h(AbstractC8693b.m21274h(viewState.getHeaderSubtitleDisplay(), c28655q2, i15), null, c38072d.m121949b(c28655q2, i16).getWhite70(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q2, i16).getB1(), null, c28655q2, 0, i17, 196602);
            c28655q = c28655q2;
            AbstractC31061c.m95650z(3, f13, c2314t, c28655q, false);
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C28308d(viewState, i13, 10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static final C23454a0 m90483s(C28349r c28349r, int i13, Composer composer, int i14) {
        m90482r(c28349r, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: t */
    public static final void m90484t(AbstractC28344m viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(1127499329);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            if (viewState instanceof AbstractC28344m.i) {
                c28655q.m87150e0(-1606453855);
                m90487w(((AbstractC28344m.i) viewState).getMetricSelectionScreen(), onViewEvent, onNavigationEvent, c28655q, i14 & MessageListItemViewType.GIPHY);
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(-1606250464);
                C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
                int iHashCode = Long.hashCode(c28655q.f115904T);
                InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
                Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, C2314t.f9131w);
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
                c28655q.m87173q(true);
                c28655q.m87173q(false);
            }
            boolean z4 = ((i14 & 896) == 256) | ((i14 & 112) == 32);
            Object objM87133R = c28655q.m87133R();
            if (z4 || objM87133R == C28635l.f115821a) {
                objM87133R = new C11901c(onViewEvent, 17, onNavigationEvent);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R, false, c28655q, 0, 1);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) viewState, onViewEvent, (InterfaceC23459e) onNavigationEvent, i13, 21);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m90485u(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC27131a.f(false, 1, null));
        function2.invoke(new AbstractC25946g.b(TargetGoalType.METRIC));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public static final C23454a0 m90486v(AbstractC28344m abstractC28344m, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90484t(abstractC28344m, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: w */
    public static final void m90487w(C28349r viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1874652353);
        if ((i13 & 6) == 0) {
            i14 = (c28655q.m87157i(viewState) ? 4 : 2) | i13;
        } else {
            i14 = i13;
        }
        if ((i13 & 48) == 0) {
            i14 |= c28655q.m87157i(onViewEvent) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i14 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i14 & 1, (i14 & 147) != 146)) {
            C2314t c2314t = C2314t.f9131w;
            Modifier modifierM66724m = AbstractC22953f.m66724m(AbstractC1102d.m3407d(1.0f, AbstractC15673b0.m44008S(c2314t)));
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90652c, C2299e.f9110M, c28655q, 0);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM66724m);
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
            AbstractC6721d.a aVar = new AbstractC6721d.a(viewState.getNavTitle(), null, new C39274g(AbstractC39383f.m125595a(C38072d.f163053a), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32760, null);
            int i15 = i14 & 112;
            int i16 = i14 & 896;
            boolean z4 = (i15 == 32) | (i16 == 256);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (z4 || objM87133R == c28676v0) {
                objM87133R = new C11901c(onViewEvent, 18, onNavigationEvent);
                c28655q.m87172p0(objM87133R);
            }
            int i17 = i14;
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM3396r = AbstractC1099a.m3396r(AbstractC1102d.m3409f(1.0f, c2314t), 5 * 4, 0.0f, 2);
            if (1.0f <= 0.0d) {
                AbstractC24868a.m72899a("invalid weight; must be greater than zero");
            }
            Modifier modifierM31988g = AbstractC11895b.m31988g(modifierM3396r, true, 1.0f);
            boolean zM87157i = c28655q.m87157i(viewState) | (i15 == 32) | (i16 == 256);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i || objM87133R2 == c28676v0) {
                objM87133R2 = new C26954j0((Object) viewState, onViewEvent, (Object) onNavigationEvent, 14);
                c28655q.m87172p0(objM87133R2);
            }
            AbstractC22674j.m65717c(modifierM31988g, null, null, null, null, null, false, null, (Function1) objM87133R2, c28655q, 0, 510);
            c28655q = c28655q;
            m90479o(viewState, onViewEvent, onNavigationEvent, c28655q, i17 & 1022);
            c28655q.m87173q(true);
        } else {
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29541w(viewState, onViewEvent, onNavigationEvent, i13, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public static final C23454a0 m90488x(Function1 function1, Function1 function2) {
        function1.invoke(new AbstractC27131a.f(false, 1, null));
        function2.invoke(new AbstractC25946g.b(TargetGoalType.METRIC));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static final C23454a0 m90489y(final C28349r c28349r, Function1 function1, Function1 function2, InterfaceC26064q LazyColumn) {
        AbstractC22676k.m65750j(LazyColumn, "$this$LazyColumn");
        final int i13 = 0;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.x
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i14 = i13;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i14) {
                    case 0:
                        return AbstractC29543y.m90490z(c28349r, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29543y.m90461C(c28349r, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, 2102423892), 3);
        Iterator<T> it = c28349r.m86017j().iterator();
        while (it.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26949h(it.next(), function1, (Object) function2, 11), true, -1802136494), 3);
        }
        final int i14 = 1;
        InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new Function3() { // from class: pt2.x
            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                int i15 = i14;
                InterfaceC1103a interfaceC1103a = (InterfaceC1103a) obj;
                Composer composer = (Composer) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                switch (i15) {
                    case 0:
                        return AbstractC29543y.m90490z(c28349r, interfaceC1103a, composer, iIntValue);
                    default:
                        return AbstractC29543y.m90461C(c28349r, interfaceC1103a, composer, iIntValue);
                }
            }
        }, true, -528737027), 3);
        Iterator<T> it3 = c28349r.m86016i().iterator();
        while (it3.hasNext()) {
            InterfaceC26064q.m77556b(LazyColumn, null, new C37816b(new C26299f((InterfaceC25312u) it3.next(), function1, 1), true, 990148731), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public static final C23454a0 m90490z(C28349r c28349r, InterfaceC1103a item, Composer composer, int i13) {
        AbstractC22676k.m65750j(item, "$this$item");
        C28655q c28655q = (C28655q) composer;
        if (c28655q.m87135U(i13 & 1, (i13 & 17) != 16)) {
            m90482r(c28349r, c28655q, 0);
        } else {
            c28655q.m87138X();
        }
        return C23454a0.f92919a;
    }
}
