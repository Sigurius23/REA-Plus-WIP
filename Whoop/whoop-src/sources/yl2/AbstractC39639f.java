package yl2;

import am2.AbstractC1026k;
import am2.AbstractC1035o0;
import am2.AbstractC1046w;
import androidx.compose.p018ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.profileinstaller.ProfileVerifier;
import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import cm2.AbstractC4813a0;
import com.whoop.design.util.AbstractC8693b;
import com.whoop.design.util.TextResource;
import do0.C12231e;
import e93.AbstractC12889b;
import hg3.AbstractC17269i;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import kotlin.C2040y;
import l83.C23454a0;
import live.hms.video.utils.AndroidSDKConstants;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.C28205u0;
import org.xmlpull.v1.XmlPullParserException;
import p000.AbstractC11266d;
import p005a3.C0209i;
import p005a3.C0213j;
import p005a3.C0217k;
import p005a3.InterfaceC0221l;
import p026b2.C2299e;
import p026b2.C2314t;
import p114eb.C12982q;
import p114eb.C12987s0;
import p114eb.C12991u0;
import p291l0.AbstractC22977m;
import p291l0.AbstractC23007w;
import p291l0.C23010x;
import p390p1.AbstractC28683x;
import p390p1.C28635l;
import p390p1.C28655q;
import p390p1.C28677v1;
import p390p1.InterfaceC28653p1;
import p602x1.C37816b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p736sz0.AbstractC33199m0;
import p736sz0.AbstractC33208p0;
import sl2.AbstractC32706a;
import uv0.AbstractC35283c;
import v41.C35654a;
import wb3.AbstractC37056f;
import yk2.C39609i;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: yl2.f */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a·\u0001\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\b2\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\n0\b2\b\b\u0002\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m65681d2 = {"Leb/u0;", "navController", "Lcm2/a0;", "viewState", "Lzr2/a;", "dateAndTimeProvider", "Lor2/u0;", "localizedDateTimeFormatter", "Lkotlin/Function1;", "Lcm2/y;", "Ll83/a0;", "onViewEvent", "Lyl2/g;", "onNavigationEvent", "Lcm2/w;", "onAnalyticsEvent", "Lkotlin/Function2;", "", "Lcom/whoop/util/TrendKey;", "onCarouselItemClicked", "onBodyCompInfoClicked", "onWeightInfoClicked", "", "isExerciseDetailsV2ExperimentEnabled", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Leb/u0;Lcm2/a0;Lzr2/a;Lor2/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V", "trends_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC39639f {
    /* JADX INFO: renamed from: h */
    public static final void m126714h(C12991u0 navController, final AbstractC4813a0 viewState, final InterfaceC41070a dateAndTimeProvider, final C28205u0 localizedDateTimeFormatter, final Function1 onViewEvent, final Function1 onNavigationEvent, final Function1 onAnalyticsEvent, final InterfaceC4351m onCarouselItemClicked, final Function1 onBodyCompInfoClicked, final Function1 onWeightInfoClicked, boolean z4, Composer composer, int i13, int i14, int i15) {
        int i16;
        boolean z13;
        int i17;
        C28655q c28655q;
        final boolean z14;
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(viewState, "viewState");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(onViewEvent, "onViewEvent");
        AbstractC22676k.m65750j(onNavigationEvent, "onNavigationEvent");
        AbstractC22676k.m65750j(onAnalyticsEvent, "onAnalyticsEvent");
        AbstractC22676k.m65750j(onCarouselItemClicked, "onCarouselItemClicked");
        AbstractC22676k.m65750j(onBodyCompInfoClicked, "onBodyCompInfoClicked");
        AbstractC22676k.m65750j(onWeightInfoClicked, "onWeightInfoClicked");
        C28655q c28655q2 = (C28655q) composer;
        c28655q2.m87154g0(1073468337);
        if ((i13 & 6) == 0) {
            i16 = (c28655q2.m87157i(navController) ? 4 : 2) | i13;
        } else {
            i16 = i13;
        }
        if ((i13 & 48) == 0) {
            i16 |= c28655q2.m87153g(viewState) ? 32 : 16;
        }
        if ((i13 & 384) == 0) {
            i16 |= c28655q2.m87157i(dateAndTimeProvider) ? 256 : 128;
        }
        if ((i13 & 3072) == 0) {
            i16 |= (i13 & 4096) == 0 ? c28655q2.m87153g(localizedDateTimeFormatter) : c28655q2.m87157i(localizedDateTimeFormatter) ? DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS : DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        if ((i13 & 24576) == 0) {
            i16 |= c28655q2.m87157i(onViewEvent) ? DfuBaseService.ERROR_CONNECTION_MASK : DfuBaseService.ERROR_REMOTE_MASK;
        }
        if ((196608 & i13) == 0) {
            i16 |= c28655q2.m87157i(onNavigationEvent) ? ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ : ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((1572864 & i13) == 0) {
            i16 |= c28655q2.m87157i(onAnalyticsEvent) ? 1048576 : 524288;
        }
        if ((12582912 & i13) == 0) {
            i16 |= c28655q2.m87157i(onCarouselItemClicked) ? 8388608 : 4194304;
        }
        if ((100663296 & i13) == 0) {
            i16 |= c28655q2.m87157i(onBodyCompInfoClicked) ? 67108864 : AndroidSDKConstants.FLAG_MUTABLE;
        }
        if ((805306368 & i13) == 0) {
            i16 |= c28655q2.m87157i(onWeightInfoClicked) ? 536870912 : 268435456;
        }
        int i18 = i16;
        int i19 = i15 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        if (i19 != 0) {
            z13 = z4;
            i17 = i14 | 6;
        } else {
            z13 = z4;
            if ((i14 & 6) == 0) {
                i17 = i14 | (c28655q2.m87155h(z13) ? 4 : 2);
            } else {
                i17 = i14;
            }
        }
        if (c28655q2.m87135U(i18 & 1, ((i18 & 306783379) == 306783378 && (i17 & 3) == 2) ? false : true)) {
            z14 = i19 != 0 ? false : z13;
            boolean zM87157i = ((i18 & 112) == 32) | ((57344 & i18) == 16384) | ((458752 & i18) == 131072) | ((3670016 & i18) == 1048576) | ((29360128 & i18) == 8388608) | ((234881024 & i18) == 67108864) | c28655q2.m87157i(dateAndTimeProvider) | ((i18 & 7168) == 2048 || ((i18 & 4096) != 0 && c28655q2.m87157i(localizedDateTimeFormatter))) | ((i17 & 14) == 4) | ((1879048192 & i18) == 536870912);
            Object objM87133R = c28655q2.m87133R();
            if (zM87157i || objM87133R == C28635l.f115821a) {
                objM87133R = new Function1() { // from class: yl2.d
                    @Override // p715kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AbstractC39639f.m126715i(viewState, onViewEvent, onNavigationEvent, onAnalyticsEvent, onCarouselItemClicked, onBodyCompInfoClicked, dateAndTimeProvider, localizedDateTimeFormatter, z14, onWeightInfoClicked, (C12987s0) obj);
                    }
                };
                c28655q2.m87172p0(objM87133R);
            }
            c28655q = c28655q2;
            AbstractC17269i.m48888e(navController, "TRENDS", null, (Function1) objM87133R, c28655q, i18 & 14);
        } else {
            c28655q = c28655q2;
            c28655q.m87138X();
            z14 = z13;
        }
        C28677v1 c28677v1M87180u = c28655q.m87180u();
        if (c28677v1M87180u != null) {
            c28677v1M87180u.f115982d = new C12231e(navController, viewState, dateAndTimeProvider, localizedDateTimeFormatter, onViewEvent, onNavigationEvent, onAnalyticsEvent, onCarouselItemClicked, onBodyCompInfoClicked, onWeightInfoClicked, z14, i13, i14, i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static final C23454a0 m126715i(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, boolean z4, Function1 function5, C12987s0 NavHost) {
        AbstractC22676k.m65750j(NavHost, "$this$NavHost");
        AbstractC12889b.m36291u(NavHost, "TRENDS", null, new C37816b(new C35654a(abstractC4813a0, function1, function2, function3, interfaceC4351m, function4, interfaceC41070a, c28205u0, z4), true, -1456335604), 6);
        AbstractC12889b.m36291u(NavHost, "ALL_DATA", null, new C37816b(new C2040y(abstractC4813a0, function1, function2, function5, interfaceC41070a, c28205u0), true, 157058805), 6);
        AbstractC12889b.m36291u(NavHost, "REPORT_DATA", null, new C37816b(new C39638e(abstractC4813a0, function1, function2, function3), true, -1845252524), 6);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public static final C23454a0 m126716j(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, boolean z4, C12982q it, Composer composer, int i13) throws XmlPullParserException, IOException {
        AbstractC22676k.m65750j(it, "it");
        AbstractC1035o0.m2880g0(abstractC4813a0, function1, function2, function3, interfaceC4351m, function4, interfaceC41070a.mo133364c(), interfaceC41070a.mo133365d(), c28205u0.m85383l(), z4, composer, 0, 0);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public static final C23454a0 m126717k(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        if (abstractC4813a0 instanceof AbstractC4813a0.d) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(1719572187);
            AbstractC1046w.m2991C(((AbstractC4813a0.d) abstractC4813a0).getViewState(), function1, function2, function3, interfaceC41070a.mo133364c(), interfaceC41070a.mo133365d(), c28205u0.m85383l(), c28655q, 0);
            c28655q.m87173q(false);
        } else if (abstractC4813a0 instanceof AbstractC4813a0.c) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(1720172998);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q2.m87173q(true);
            c28655q2.m87173q(false);
        } else {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(1720622188);
            int i14 = 2;
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC32706a.f135963q, null, i14, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32706a.f135960n, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            boolean zM87153g = c28655q3.m87153g(function2);
            Object objM87133R = c28655q3.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C39609i(function2, 4);
                c28655q3.m87172p0(objM87133R);
            }
            int i15 = AbstractC33208p0.b.f138467h;
            int i16 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q3, i15 | (i16 << 3) | (i16 << 9), 0, 4068);
            c28655q3.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public static final C23454a0 m126718l(Function1 function1) {
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m */
    public static final C23454a0 m126719m(AbstractC4813a0 abstractC4813a0, Function1 function1, Function1 function2, Function1 function3, C12982q it, Composer composer, int i13) {
        AbstractC22676k.m65750j(it, "it");
        if (abstractC4813a0 instanceof AbstractC4813a0.d) {
            C28655q c28655q = (C28655q) composer;
            c28655q.m87150e0(-631430706);
            AbstractC1026k.m2787v(((AbstractC4813a0.d) abstractC4813a0).getViewState(), function1, function2, function3, c28655q, 0);
            c28655q.m87173q(false);
        } else if (abstractC4813a0 instanceof AbstractC4813a0.c) {
            C28655q c28655q2 = (C28655q) composer;
            c28655q2.m87150e0(-631062457);
            C23010x c23010xM66775a = AbstractC23007w.m66775a(AbstractC22977m.f90654e, C2299e.f9111N, c28655q2, 54);
            int iHashCode = Long.hashCode(c28655q2.f115904T);
            InterfaceC28653p1 interfaceC28653p1M87165m = c28655q2.m87165m();
            Modifier modifierM118962N = AbstractC37056f.m118962N(c28655q2, C2314t.f9131w);
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
            AbstractC33199m0.m105214F(AbstractC33208p0.c.f138471e, AbstractC8693b.m21267a(), null, null, null, false, false, null, null, null, false, false, c28655q2, AbstractC33208p0.c.f138472f | (TextResource.$stable << 3), 0, 4092);
            c28655q2.m87173q(true);
            c28655q2.m87173q(false);
        } else {
            C28655q c28655q3 = (C28655q) composer;
            c28655q3.m87150e0(-630613267);
            int i14 = 2;
            AbstractC33208p0.b bVar = new AbstractC33208p0.b(new TextResource.C8688b(AbstractC32706a.f135963q, null, i14, 0 == true ? 1 : 0), false, null, 6, null);
            TextResource.C8688b c8688b = new TextResource.C8688b(AbstractC32706a.f135960n, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            TextResource.C8688b c8688b2 = new TextResource.C8688b(AbstractC35283c.f150167E, 0 == true ? 1 : 0, i14, 0 == true ? 1 : 0);
            boolean zM87153g = c28655q3.m87153g(function2);
            Object objM87133R = c28655q3.m87133R();
            if (zM87153g || objM87133R == C28635l.f115821a) {
                objM87133R = new C39609i(function2, 5);
                c28655q3.m87172p0(objM87133R);
            }
            int i15 = AbstractC33208p0.b.f138467h;
            int i16 = TextResource.C8688b.f25889c;
            AbstractC33199m0.m105214F(bVar, c8688b, null, c8688b2, (InterfaceC4339a) objM87133R, false, false, null, null, null, false, false, c28655q3, i15 | (i16 << 3) | (i16 << 9), 0, 4068);
            c28655q3.m87173q(false);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static final C23454a0 m126720n(Function1 function1) {
        function1.invoke(new AbstractC39640g.d(AbstractC39640g.b.Compose));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final C23454a0 m126721o(C12991u0 c12991u0, AbstractC4813a0 abstractC4813a0, InterfaceC41070a interfaceC41070a, C28205u0 c28205u0, Function1 function1, Function1 function2, Function1 function3, InterfaceC4351m interfaceC4351m, Function1 function4, Function1 function5, boolean z4, int i13, int i14, int i15, Composer composer, int i16) {
        m126714h(c12991u0, abstractC4813a0, interfaceC41070a, c28205u0, function1, function2, function3, interfaceC4351m, function4, function5, z4, composer, AbstractC28683x.m87244L(i13 | 1), AbstractC28683x.m87244L(i14), i15);
        return C23454a0.f92919a;
    }
}
