package dp2;

import ad3.AbstractC0757c;
import androidx.core.app.NotificationCompat;
import ap2.C1882a;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.AbstractC9597d;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.HealthTabScreenModel;
import com.whoop.navigation.HomeScreenModel;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.universalcheckout.features.UniversalCheckoutDestination;
import do0.C12229c;
import ep2.InterfaceC13429a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.C21166s;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import mn2.EnumC25719b;
import ny0.C27256h;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p114eb.C12977n0;
import p114eb.C12982q;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p720m91.InterfaceC25312u;
import qr2.AbstractC30556a;
import s21.C32085h;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: dp2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u0017*\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u0013\u0010\u001c\u001a\u00020\u0017*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\u00172\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010-R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010/R\u0014\u00102\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Ldp2/b;", "", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lo02/d;", "baseNavReducer", "Lap2/a;", "analyticsHelper", "Lad3/c;", "json", "", "source", "Ltr2/n;", "logger", "<init>", "(Lj02/o0;Leb/a0;Lo02/d;Lap2/a;Lad3/c;Ljava/lang/String;Ltr2/n;)V", "Lj02/s;", "dismissalType", "", "e", "(Lj02/s;)Z", "Ll83/a0;", "d", "(Lj02/s;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lm91/u;", "c", "(Lm91/u;)V", "Lcom/whoop/navigation/e;", "destination", "f", "(Lcom/whoop/navigation/e;)V", "i", "b", "()V", "Lep2/a$l;", NotificationCompat.CATEGORY_EVENT, "j", "(Lep2/a$l;)V", "a", "Lj02/o0;", "Leb/a0;", "Lap2/a;", "Lad3/c;", "Ljava/lang/String;", "Ltr2/n;", "g", "Lo02/d;", "navigationReducer", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12256b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C1882a analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AbstractC0757c json;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final String source;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C12256b(InterfaceC21159o0 navigator, AbstractC12939a0 navController, InterfaceC27353d baseNavReducer, C1882a analyticsHelper, AbstractC0757c json, String source, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(json, "json");
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(logger, "logger");
        this.navigator = navigator;
        this.navController = navController;
        this.analyticsHelper = analyticsHelper;
        this.json = json;
        this.source = source;
        this.logger = logger;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C12229c(2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b */
    private final void m34176b() {
        AbstractC9597d.m23115g(this.navController, new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) null, (AiAction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), null, 4, null), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.whoop.navigation.AiAction, java.lang.String, kotlin.jvm.internal.DefaultConstructorMarker] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX INFO: renamed from: c */
    private final void m34177c(InterfaceC25312u interfaceC25312u) {
        C21166s dismissEvent;
        C12977n0 c12977n0;
        Integer numValueOf = 0;
        numValueOf = 0;
        if (!(interfaceC25312u instanceof C27256h)) {
            if (!(interfaceC25312u instanceof C32085h)) {
                this.logger.mo85226q("Unhandled ItemViewState for app-driven navigation: " + interfaceC25312u, new AbstractC30556a.a[0]);
                return;
            }
            C32085h c32085h = (C32085h) interfaceC25312u;
            GenericInteraction interaction = c32085h.getInteraction();
            DecodedGenericInteraction decodedGenericInteraction = interaction != null ? GenericInteractionDecoderKt.toDecodedGenericInteraction(interaction, this.json) : null;
            if (decodedGenericInteraction != null && (dismissEvent = decodedGenericInteraction.getDismissEvent()) != null && !m34179e(dismissEvent)) {
                AbstractC9597d.m23115g(this.navController, new C9598e(AppScreen.C9426u2.f27963w, new HomeScreenModel((String) numValueOf, (AiAction) numValueOf, 3, (DefaultConstructorMarker) numValueOf), null, 4, null), false);
            }
            C9598e c9598e = c32085h.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            if (c9598e != null) {
                m34180f(c9598e);
                return;
            }
            return;
        }
        C27256h c27256h = (C27256h) interfaceC25312u;
        C21166s dismissEvent2 = c27256h.getDismissEvent();
        if (dismissEvent2 != null) {
            m34179e(dismissEvent2);
            return;
        }
        InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(c27256h.getDestination().getParameters());
        AbstractC22676k.m65748h(interfaceC21134cMo67681a, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
        AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a;
        if (abstractC21155m0 instanceof AbstractC21155m0.a4) {
            AbstractC21155m0.a4 a4Var = (AbstractC21155m0.a4) abstractC21155m0;
            C12982q c12982qM36398m = this.navController.m36398m();
            if (c12982qM36398m != null && (c12977n0 = c12982qM36398m.f44844x) != null) {
                numValueOf = Integer.valueOf(c12977n0.f44819H);
            }
            a4Var.m59019e(numValueOf);
            this.navigator.mo59393b(abstractC21155m0);
            return;
        }
        if (abstractC21155m0 instanceof AbstractC21155m0.m0) {
            m34183i(c27256h.getDestination());
            return;
        }
        if (!(abstractC21155m0 instanceof AbstractC21155m0.j3)) {
            this.navigator.mo59392a(c27256h.getDestination());
            return;
        }
        if (EnumC25719b.INSTANCE.m75836a(this.source) != EnumC25719b.CART_SCREEN) {
            this.navController.m36410z();
            this.navController.m36410z();
        } else {
            if (InterfaceC21159o0.m59391c(this.navigator, null, 1, null)) {
                return;
            }
            m34176b();
        }
    }

    /* JADX INFO: renamed from: d */
    private final void m34178d(C21166s c21166s) {
        if (c21166s.getPopUpTo() == null) {
            AbstractC9597d.m23114f(this.navController, c21166s.getType(), null, 2, null);
        } else {
            if (m34179e(c21166s)) {
                return;
            }
            m34176b();
        }
    }

    /* JADX INFO: renamed from: e */
    private final boolean m34179e(C21166s dismissalType) {
        return AbstractC9597d.m23112d(this.navController, dismissalType.getPopUpTo(), dismissalType.getPopBackCount(), this.logger);
    }

    /* JADX INFO: renamed from: f */
    private final void m34180f(C9598e destination) {
        if (AbstractC22676k.m65745e(destination.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9316g4.f27625w) && this.navigator.mo59395e(destination)) {
            return;
        }
        this.navigator.mo59392a(destination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final C23454a0 m34181g(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: h */
    private final void m34182h(C21166s c21166s) {
        if (m34179e(c21166s) || c21166s.getPopUpTo() == null) {
            return;
        }
        m34176b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i */
    private final void m34183i(C9598e destination) {
        if (!AbstractC9597d.m23115g(this.navController, new C9598e(AppScreen.C9394q2.f27867w, new HealthTabScreenModel((String) null, (AiAction) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0)), null, 4, null), false)) {
            m34176b();
        }
        this.navigator.mo59392a(destination);
    }

    /* JADX INFO: renamed from: j */
    public final void m34184j(InterfaceC13429a.l event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC13429a.d) {
            this.navigator.mo59392a(((InterfaceC13429a.d) event).getNavAction());
            return;
        }
        if (event instanceof InterfaceC13429a.c) {
            m34178d(((InterfaceC13429a.c) event).getDismissEvent());
            return;
        }
        if (event instanceof InterfaceC13429a.b) {
            m34177c(((InterfaceC13429a.b) event).getItemViewState());
            return;
        }
        if (!(event instanceof InterfaceC13429a.j)) {
            if (!(event instanceof InterfaceC13429a.m)) {
                throw new NoWhenBranchMatchedException();
            }
            m34182h(((InterfaceC13429a.m) event).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String());
        } else {
            InterfaceC13429a.a aVarM27501f = UniversalCheckoutDestination.C10631c.f32382a.m27501f(this.navController);
            if (aVarM27501f != null) {
                C1882a.m5659b(this.analyticsHelper, aVarM27501f, null, 2, null);
            }
        }
    }

    public /* synthetic */ C12256b(InterfaceC21159o0 interfaceC21159o0, AbstractC12939a0 abstractC12939a0, InterfaceC27353d interfaceC27353d, C1882a c1882a, AbstractC0757c abstractC0757c, String str, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21159o0, abstractC12939a0, interfaceC27353d, c1882a, abstractC0757c, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ReceiptNavigationRouter") : interfaceC34116n);
    }
}
