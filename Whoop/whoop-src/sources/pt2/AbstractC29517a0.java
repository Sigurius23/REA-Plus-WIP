package pt2;

import androidx.compose.foundation.layout.AbstractC1099a;
import androidx.compose.foundation.layout.AbstractC1102d;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import b91.C2886a;
import bu2.AbstractC3646g;
import bu2.AbstractC3654o;
import bu2.C3643d;
import c93.InterfaceC4339a;
import com.whoop.design.atomic.organism.toolbar.AbstractC6719b;
import com.whoop.design.atomic.organism.toolbar.AbstractC6721d;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import gb1.AbstractC15673b0;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import io.sentry.config.AbstractC20301a;
import l83.C23454a0;
import l83.InterfaceC23459e;
import mt2.AbstractC25946g;
import no.nordicsemi.android.dfu.DfuBaseService;
import nq0.C27050m;
import nt2.AbstractC27131a;
import nx1.C27225g;
import ny0.AbstractC27292z;
import ot2.AbstractC28344m;
import ot2.C28351t;
import ox0.C28448b;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2305k;
import p026b2.C2314t;
import p209i3.AbstractC18032n;
import p209i3.AbstractC18041w;
import p209i3.InterfaceC18044z;
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
import p635y2.InterfaceC39127r0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import qz0.AbstractC30795n;
import uv0.AbstractC35283c;
import wb3.AbstractC37056f;
import x81.C38072d;
import y71.C39274g;
import yb0.AbstractC39383f;

/* JADX INFO: renamed from: pt2.a0 */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\n2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m65681d2 = {"Lot2/m;", "viewState", "Lkotlin/Function1;", "Lnt2/a;", "Ll83/a0;", "onViewEvent", "Lmt2/g;", "onNavigationEvent", "i", "(Lot2/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lot2/t;", "l", "(Lot2/t;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "weekly-plan_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC29517a0 {
    /* JADX INFO: renamed from: i */
    public static final void m90203i(AbstractC28344m viewState, Function1 function1, Function1 onNavigationEvent, Composer composer, int i13, int i14) {
        int i15;
        Function1 function2;
        Function1 function3;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(2024759285);
        if ((i13 & 6) == 0) {
            i15 = (c28655q.m87153g(viewState) ? 4 : 2) | i13;
        } else {
            i15 = i13;
        }
        int i16 = i14 & 2;
        if (i16 != 0) {
            i15 |= 48;
        } else if ((i13 & 48) == 0) {
            i15 |= c28655q.m87157i(function1) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i15 |= c28655q.m87157i(onNavigationEvent) ? 256 : 128;
        }
        if (c28655q.m87135U(i15 & 1, (i15 & 147) != 146)) {
            if (i16 != 0) {
                Object objM87133R = c28655q.m87133R();
                if (objM87133R == C28635l.f115821a) {
                    objM87133R = new C29529k(10);
                    c28655q.m87172p0(objM87133R);
                }
                function3 = (Function1) objM87133R;
            } else {
                function3 = function1;
            }
            if (viewState instanceof AbstractC28344m.i) {
                c28655q.m87150e0(1083447394);
                C28351t c28351tM85972f = ((AbstractC28344m.i) viewState).getSliderScreen();
                if (c28351tM85972f == null) {
                    c28655q.m87150e0(1083447393);
                    c28655q.m87173q(false);
                } else {
                    c28655q.m87150e0(1083447394);
                    m90206l(c28351tM85972f, function3, onNavigationEvent, c28655q, i15 & MessageListItemViewType.GIPHY);
                    c28655q.m87173q(false);
                }
                c28655q.m87173q(false);
            } else {
                c28655q.m87150e0(1083701067);
                c28655q.m87173q(false);
            }
            function2 = function3;
        } else {
            c28655q.m87138X();
            function2 = function1;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C29524f(viewState, function2, onNavigationEvent, i13, i14, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m90204j(AbstractC27131a it) {
        AbstractC22676k.m65750j(it, "it");
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m90205k(AbstractC28344m abstractC28344m, Function1 function1, Function1 function2, int i13, int i14, Composer composer, int i15) {
        m90203i(abstractC28344m, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1), i14);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: l */
    public static final void m90206l(C28351t viewState, Function1 onViewEvent, Function1 onNavigationEvent, Composer composer, int i13) {
        int i14;
        C28351t c28351t;
        Function1 function1;
        Function1 function2;
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        C28655q c28655q = (C28655q) composer;
        c28655q.m87154g0(-1622495298);
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
            Modifier modifierM44028b0 = AbstractC15673b0.m44028b0(AbstractC1102d.m3407d(1.0f, c2314t));
            InterfaceC39127r0 interfaceC39127r0M66763d = AbstractC22989q.m66763d(C2299e.f9114w, false);
            int iHashCode = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q, modifierM44028b0);
            InterfaceC0221l.f734a.getClass();
            C0213j c0213j = C0217k.f724b;
            c28655q.m87158i0();
            if (c28655q.f115903S) {
                c28655q.m87163l(c0213j);
            } else {
                c28655q.m87178s0();
            }
            C0209i c0209i = C0217k.f729g;
            AbstractC28683x.m87239G(c28655q, c0209i, interfaceC39127r0M66763d);
            C0209i c0209i2 = C0217k.f728f;
            AbstractC28683x.m87239G(c28655q, c0209i2, interfaceC28653p1M87165m);
            C0209i c0209i3 = C0217k.f732j;
            if (c28655q.f115903S || !AbstractC22676k.m65745e(c28655q.m87133R(), Integer.valueOf(iHashCode))) {
                AbstractC11266d.m30471y(iHashCode, c28655q, iHashCode, c0209i3);
            }
            C0209i c0209i4 = C0217k.f726d;
            AbstractC28683x.m87239G(c28655q, c0209i4, modifierM118962N);
            Modifier modifierM66722k = AbstractC22953f.m66722k(AbstractC22953f.m66724m(AbstractC1102d.m3409f(1.0f, c2314t)));
            C22957g c22957g = AbstractC22977m.f90652c;
            C2305k c2305k = C2299e.f9110M;
            C23010x c23010xM66775a = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode2 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m2 = c28655q.m87165m();
            Modifier modifierM118962N2 = AbstractC37056f.m118962N(c28655q, modifierM66722k);
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
            TextResource navigationTitle = viewState.getHeader().getNavigationTitle();
            C38072d c38072d = C38072d.f163053a;
            AbstractC6721d.a aVar = new AbstractC6721d.a(navigationTitle, null, new C39274g(AbstractC39383f.m125595a(c38072d), AbstractC8693b.m21278l(AbstractC30060g.m92103Y(c28655q, AbstractC35283c.f150167E))), null, null, null, false, null, null, null, null, null, null, null, null, 32762, null);
            int i15 = i14 & 112;
            int i16 = i14 & 896;
            boolean zM87157i = (i15 == 32) | (i16 == 256) | c28655q.m87157i(viewState);
            Object objM87133R = c28655q.m87133R();
            C28676v0 c28676v0 = C28635l.f115821a;
            if (zM87157i || objM87133R == c28676v0) {
                objM87133R = new C29544z(onViewEvent, onNavigationEvent, viewState);
                c28655q.m87172p0(objM87133R);
            }
            AbstractC6719b.m20143d(null, aVar, null, (InterfaceC4339a) objM87133R, null, null, c28655q, AbstractC6721d.a.f25641r << 3, 53);
            Modifier modifierM92116f0 = AbstractC30060g.m92116f0(c2314t, AbstractC30060g.m92099U(0, c28655q, 1), 14);
            float f13 = 8;
            Modifier modifierM3396r = AbstractC1099a.m3396r(modifierM92116f0, ((float) 2.5d) * f13, 0.0f, 2);
            C23010x c23010xM66775a2 = AbstractC23007w.m66775a(c22957g, c2305k, c28655q, 0);
            int iHashCode3 = Long.hashCode(c28655q.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m3 = c28655q.m87165m();
            Modifier modifierM118962N3 = AbstractC37056f.m118962N(c28655q, modifierM3396r);
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
            float f14 = 2 * f13;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            TextResource title = viewState.getHeader().getTitle();
            int i17 = TextResource.$stable;
            String strM21274h = AbstractC8693b.m21274h(title, c28655q, i17);
            int i18 = C38072d.f163054b;
            AbstractC30795n.m94707h(strM21274h, null, c38072d.m121949b(c28655q, i18).getBrandWhite(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, c38072d.m121952e(c28655q, i18).getT2(), null, c28655q, 0, C2886a.f11498d << 18, 196602);
            C3643d metricSlider = viewState.getMetricSlider();
            C3643d c3643dM11221a = metricSlider.m11221a((61423 & 1) != 0 ? metricSlider.fillPercentage : 0.0f, (61423 & 2) != 0 ? metricSlider.minFillPercentage : 0.0f, (61423 & 4) != 0 ? metricSlider.maxFillPercentage : 0.0f, (61423 & 8) != 0 ? metricSlider.weeklyTargetDouble : 0.0d, (61423 & 16) != 0 ? metricSlider.weeklyTargetValue : AbstractC8693b.m21278l(AbstractC8693b.m21274h(viewState.getMetricSlider().getWeeklyTargetValue(), c28655q, i17)), (61423 & 32) != 0 ? metricSlider.weeklyTargetValueSuffix : null, (61423 & 64) != 0 ? metricSlider.weeklyTargetLabel : null, (61423 & 128) != 0 ? metricSlider.topText : null, (61423 & 256) != 0 ? metricSlider.bottomText : null, (61423 & 512) != 0 ? metricSlider.recommendedRange : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? metricSlider.levelItemState : null, (61423 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? metricSlider.rangeContent : null, (61423 & 4096) != 0 ? metricSlider.toolTipType : viewState.getMetricSlider().getToolTipType(), (61423 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? metricSlider.toolTipTitleColor : null, (61423 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? metricSlider.increment : null, (61423 & 32768) != 0 ? metricSlider.color : null);
            boolean zM87157i2 = c28655q.m87157i(viewState);
            Object objM87133R2 = c28655q.m87133R();
            if (zM87157i2 || objM87133R2 == c28676v0) {
                objM87133R2 = new C29536r(viewState, 2);
                c28655q.m87172p0(objM87133R2);
            }
            Modifier modifierM51774b = AbstractC18032n.m51774b(c2314t, (Function1) objM87133R2);
            boolean zM87157i3 = c28655q.m87157i(viewState) | (i15 == 32);
            Object objM87133R3 = c28655q.m87133R();
            if (zM87157i3 || objM87133R3 == c28676v0) {
                function2 = onViewEvent;
                objM87133R3 = new C27050m(28, function2, viewState);
                c28655q.m87172p0(objM87133R3);
            } else {
                function2 = onViewEvent;
            }
            AbstractC3646g.m11242f(c3643dM11221a, modifierM51774b, (Function1) objM87133R3, c28655q, 0, 0);
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            Modifier modifierM3409f = AbstractC1102d.m3409f(1.0f, c2314t);
            TextResource confirmTargetButtonDisplay = viewState.getConfirmTargetButtonDisplay();
            boolean zM87157i4 = c28655q.m87157i(viewState) | (i15 == 32) | (i16 == 256);
            Object objM87133R4 = c28655q.m87133R();
            if (zM87157i4 || objM87133R4 == c28676v0) {
                function1 = onNavigationEvent;
                objM87133R4 = new C29544z(function2, viewState, function1);
                c28655q.m87172p0(objM87133R4);
            } else {
                function1 = onNavigationEvent;
            }
            int i19 = (i17 << 18) | 6;
            c28351t = viewState;
            AbstractC27292z.m82343j(modifierM3409f, false, false, null, null, null, confirmTargetButtonDisplay, null, null, null, 0.0f, null, null, (InterfaceC4339a) objM87133R4, c28655q, i19, 0, 8126);
            c28655q = c28655q;
            AbstractC22953f.m66715b(c28655q, AbstractC1102d.m3419p(f14, c2314t));
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            c28655q.m87173q(true);
            boolean zM87157i5 = c28655q.m87157i(c28351t) | (i16 == 256);
            Object objM87133R5 = c28655q.m87133R();
            if (zM87157i5 || objM87133R5 == c28676v0) {
                objM87133R5 = new C28448b(22, function1, c28351t);
                c28655q.m87172p0(objM87133R5);
            }
            AbstractC20301a.m56332c((InterfaceC4339a) objM87133R5, false, c28655q, 0, 1);
        } else {
            c28351t = viewState;
            function1 = onNavigationEvent;
            c28655q.m87138X();
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C27225g((Object) c28351t, onViewEvent, (InterfaceC23459e) function1, i13, 22);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m90207m(Function1 function1, Function1 function2, C28351t c28351t) {
        function1.invoke(new AbstractC27131a.f(true));
        function2.invoke(new AbstractC25946g.b(c28351t.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m90208n(C28351t c28351t, InterfaceC18044z clearAndSetSemantics) {
        AbstractC22676k.m65750j(clearAndSetSemantics, "$this$clearAndSetSemantics");
        AbstractC18041w.m51806e("HubAndSpokeSlider_Body_Slider_" + c28351t.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().name(), clearAndSetSemantics);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m90209o(Function1 function1, C28351t c28351t, Object it) {
        AbstractC22676k.m65750j(it, "it");
        if (it instanceof AbstractC3654o.a) {
            function1.invoke(new AbstractC27131a.s(c28351t.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), ((AbstractC3654o.a) it).getFillPercentage()));
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m90210p(Function1 function1, C28351t c28351t, Function1 function2) {
        function1.invoke(new AbstractC27131a.l(c28351t.getMetricSlider().getWeeklyTargetDouble(), c28351t.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()));
        function2.invoke(new AbstractC25946g.b(null, 1, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static final C23454a0 m90211q(Function1 function1, C28351t c28351t) {
        function1.invoke(new AbstractC25946g.b(c28351t.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String()));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public static final C23454a0 m90212r(C28351t c28351t, Function1 function1, Function1 function2, int i13, Composer composer, int i14) {
        m90206l(c28351t, function1, function2, composer, AbstractC28683x.m87244L(i13 | 1));
        return C23454a0.f92919a;
    }
}
