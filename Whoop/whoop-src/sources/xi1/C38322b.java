package xi1;

import androidx.core.app.NotificationCompat;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import fi0.InterfaceC14515a;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import l83.C23454a0;
import o02.AbstractC27355f;
import o02.C27354e;
import o02.InterfaceC27353d;
import p114eb.AbstractC12939a0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import vi1.EnumC36058a;
import xa0.C38136a;

/* JADX INFO: renamed from: xi1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m65681d2 = {"Lxi1/b;", "", "Lj02/o0;", "navigator", "Lo02/d;", "baseNavReducer", "Lfi0/a;", "analytics", "Leb/a0;", "navController", "<init>", "(Lj02/o0;Lo02/d;Lfi0/a;Leb/a0;)V", "Lxi1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Lxi1/a;)V", "a", "Lj02/o0;", "b", "Lfi0/a;", "Leb/a0;", "d", "Lo02/d;", "navigationReducer", "kennel_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38322b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    /* JADX INFO: renamed from: xi1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f164229a;

        static {
            int[] iArr = new int[EnumC36058a.values().length];
            try {
                iArr[EnumC36058a.Shepherd.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC36058a.Labrador.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f164229a = iArr;
        }
    }

    /* JADX INFO: renamed from: xi1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21134c invoke(InterfaceC21134c it) {
            AbstractC22676k.m65750j(it, "it");
            return ((AbstractC21155m0.o4) it).m59231b("hearthealthtab");
        }
    }

    /* JADX INFO: renamed from: xi1.b$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements Function1 {
        @Override // p715kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC21134c invoke(InterfaceC21134c it) {
            AbstractC22676k.m65750j(it, "it");
            return ((AbstractC21155m0.i2) it).m59144b("hearthealthtab");
        }
    }

    public C38322b(InterfaceC21159o0 navigator, InterfaceC27353d baseNavReducer, InterfaceC14515a analytics, AbstractC12939a0 navController) {
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(navController, "navController");
        this.navigator = navigator;
        this.analytics = analytics;
        this.navController = navController;
        this.navigationReducer = AbstractC27355f.m82533a(baseNavReducer, new C38136a(20));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final C23454a0 m122811b(C27354e buildNavigationReducer) {
        AbstractC22676k.m65750j(buildNavigationReducer, "$this$buildNavigationReducer");
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        buildNavigationReducer.m82530a(c22673i0.getOrCreateKotlinClass(AbstractC21155m0.o4.class), new b());
        buildNavigationReducer.m82530a(c22673i0.getOrCreateKotlinClass(AbstractC21155m0.i2.class), new c());
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: c */
    public final void m122812c(InterfaceC38321a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(InterfaceC38321a.c.f164211a)) {
            this.navController.m36410z();
            return;
        }
        if (event instanceof InterfaceC38321a.b) {
            ArticleTileModelEvent articleTileModelEventM122802a = ((InterfaceC38321a.b) event).getType();
            if (!(articleTileModelEventM122802a instanceof ArticleTileModelEvent.Url)) {
                if (articleTileModelEventM122802a instanceof ArticleTileModelEvent.Cta) {
                    this.navigator.mo59393b(new AbstractC21155m0.w1(((ArticleTileModelEvent.Cta) articleTileModelEventM122802a).getCta().name(), "Heart Health Tab", null, null, 12, null));
                    return;
                }
                return;
            }
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) articleTileModelEventM122802a;
            if (ArticleTileCarouselModelKt.isVideo(url.getType())) {
                this.navigator.mo59393b(new AbstractC21155m0.g3(url.getUrl()));
                return;
            }
            this.navigator.mo59393b(new AbstractC21155m0.f3(url.getId(), url.getTag(), "Heart Health Tab", null, null, 24, null));
            return;
        }
        if (event.equals(InterfaceC38321a.a.f164208a)) {
            this.navigator.mo59393b(new AbstractC21155m0.g1("https://www.whoop.com/thelocker/"));
            return;
        }
        if (event instanceof InterfaceC38321a.h) {
            this.analytics.mo41424f("ANF", "Open", "Possible Afib", "ANF");
            InterfaceC21159o0 interfaceC21159o0 = this.navigator;
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(((InterfaceC38321a.h) event).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            interfaceC21159o0.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a);
            return;
        }
        if (event instanceof InterfaceC38321a.i) {
            C9598e c9598eM122809a = ((InterfaceC38321a.i) event).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String();
            if (AbstractC22676k.m65745e(c9598eM122809a.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9357l5.f27754w)) {
                this.analytics.mo41424f("ANF", "Open", "History", "ANF");
            }
            InterfaceC21159o0 interfaceC21159o1 = this.navigator;
            InterfaceC21134c interfaceC21134cMo67681a2 = this.navigationReducer.mo67681a(c9598eM122809a.getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a2, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            interfaceC21159o1.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a2);
            return;
        }
        if (event instanceof InterfaceC38321a.g) {
            InterfaceC38321a.g gVar = (InterfaceC38321a.g) event;
            int i13 = a.f164229a[gVar.getType().ordinal()];
            if (i13 == 1) {
                this.analytics.mo41424f("ANF", "Open", "Afib onboarding", "ANF");
            } else {
                if (i13 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC14515a.m41418i(this.analytics, "onboarding", "setup_ecg", null, "ECG", null, null, 52, null);
            }
            InterfaceC21159o0 interfaceC21159o2 = this.navigator;
            InterfaceC21134c interfaceC21134cMo67681a3 = this.navigationReducer.mo67681a(gVar.getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a3, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            interfaceC21159o2.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a3);
            return;
        }
        if (event instanceof InterfaceC38321a.d) {
            InterfaceC14515a.m41418i(this.analytics, "ecg_past_results", "view_past_reading", null, "ECG", null, null, 52, null);
            InterfaceC21159o0 interfaceC21159o3 = this.navigator;
            InterfaceC21134c interfaceC21134cMo67681a4 = this.navigationReducer.mo67681a(((InterfaceC38321a.d) event).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a4, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            interfaceC21159o3.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a4);
            return;
        }
        if (event instanceof InterfaceC38321a.e) {
            this.analytics.mo41424f("ecg_reading", "click", "take_a_new_ecg_reading", "ECG");
            InterfaceC21159o0 interfaceC21159o4 = this.navigator;
            InterfaceC21134c interfaceC21134cMo67681a5 = this.navigationReducer.mo67681a(((InterfaceC38321a.e) event).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getParameters());
            AbstractC22676k.m65748h(interfaceC21134cMo67681a5, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
            interfaceC21159o4.mo59393b((AbstractC21155m0) interfaceC21134cMo67681a5);
            return;
        }
        if (!(event instanceof InterfaceC38321a.f)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC21134c interfaceC21134cMo67681a6 = this.navigationReducer.mo67681a(((InterfaceC38321a.f) event).getAndroidx.core.app.NotificationCompat.CATEGORY_NAVIGATION java.lang.String().getParameters());
        AbstractC22676k.m65748h(interfaceC21134cMo67681a6, "null cannot be cast to non-null type com.whoop.navigation.NavigationScreen");
        AbstractC21155m0 abstractC21155m0 = (AbstractC21155m0) interfaceC21134cMo67681a6;
        if (abstractC21155m0.equals(AbstractC21155m0.l2.f80442b)) {
            InterfaceC14515a.m41418i(this.analytics, "ecg_all_results", "click", null, "ECG", null, null, 52, null);
        }
        this.navigator.mo59393b(abstractC21155m0);
    }
}
