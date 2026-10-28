package ml0;

import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.items.ArticleTileModelEventEnum;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.CardioDetailsScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import com.whoop.navigation.RecoveryDetailsScreenModel;
import com.whoop.navigation.SleepDetailsScreenModel;
import com.whoop.navigation.StrengthTrainerScreenModel;
import com.whoop.navigation.TrendsScreenModel;
import com.whoop.navigation.WeeklyPlanSetupScreenModel;
import com.whoop.navigation.WeightliftingDetailsScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.AbstractC21161p0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import kotlinx.serialization.json.JsonElement;
import no.nordicsemi.android.dfu.DfuBaseService;
import o02.InterfaceC27353d;
import od1.C27858u;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import xk0.C38423a;

/* JADX INFO: renamed from: ml0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u0000 22\u00020\u0001:\u0001#BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0000¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010&R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00101\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00063"}, m65681d2 = {"Lml0/c;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj02/o0;", "navigator", "Leb/a0;", "navController", "Lod1/u;", "userContext", "Lxk0/a;", "analyticsHelper", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "", "isWrapperScreen", "Lo02/d;", "baseNavReducer", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Leb/a0;Lod1/u;Lxk0/a;Lcom/whoop/data/repositories/LanguageRepository;ZLo02/d;)V", "Lcom/whoop/navigation/NavigationScreenModel;", "d", "(Lcom/whoop/navigation/NavigationScreenModel;)Lcom/whoop/navigation/NavigationScreenModel;", "Lj02/m0;", "navigationScreen", "Lj02/p0;", "b", "(Lj02/m0;)Lj02/p0;", "Lml0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "c", "(Lml0/a;)V", "Lcom/whoop/navigation/e;", "action", "a", "(Lcom/whoop/navigation/e;)Lcom/whoop/navigation/e;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lj02/o0;", "Leb/a0;", "Lod1/u;", "e", "Lxk0/a;", "f", "Lcom/whoop/data/repositories/LanguageRepository;", "g", "Z", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lo02/d;", "navigationReducer", "i", "bot_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25671c {

    /* JADX INFO: renamed from: j */
    public static final int f100952j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C38423a analyticsHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final boolean isWrapperScreen;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C25671c(FeatureFlagChecker featureFlagChecker, InterfaceC21159o0 navigator, AbstractC12939a0 abstractC12939a0, C27858u userContext, C38423a analyticsHelper, LanguageRepository languageRepository, boolean z4, InterfaceC27353d baseNavReducer) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(baseNavReducer, "baseNavReducer");
        this.featureFlagChecker = featureFlagChecker;
        this.navigator = navigator;
        this.navController = abstractC12939a0;
        this.userContext = userContext;
        this.analyticsHelper = analyticsHelper;
        this.languageRepository = languageRepository;
        this.isWrapperScreen = z4;
        this.navigationReducer = baseNavReducer;
    }

    /* JADX INFO: renamed from: b */
    private final AbstractC21161p0 m75585b(AbstractC21155m0 navigationScreen) {
        return this.navigator.mo59393b(navigationScreen);
    }

    /* JADX INFO: renamed from: d */
    private final NavigationScreenModel m75586d(NavigationScreenModel navigationScreenModel) {
        if (navigationScreenModel instanceof TrendsScreenModel) {
            return TrendsScreenModel.copy$default((TrendsScreenModel) navigationScreenModel, null, 0, null, "WHOOP Coach", "AI Coach", null, 39, null);
        }
        if (navigationScreenModel instanceof CardioDetailsScreenModel) {
            return CardioDetailsScreenModel.copy$default((CardioDetailsScreenModel) navigationScreenModel, null, "AI Coach", null, 5, null);
        }
        if (navigationScreenModel instanceof RecoveryDetailsScreenModel) {
            return RecoveryDetailsScreenModel.copy$default((RecoveryDetailsScreenModel) navigationScreenModel, null, "AI Coach", null, 5, null);
        }
        if (navigationScreenModel instanceof SleepDetailsScreenModel) {
            return SleepDetailsScreenModel.copy$default((SleepDetailsScreenModel) navigationScreenModel, null, "AI Coach", null, 5, null);
        }
        if (navigationScreenModel instanceof WeightliftingDetailsScreenModel) {
            return WeightliftingDetailsScreenModel.copy$default((WeightliftingDetailsScreenModel) navigationScreenModel, null, "AI Coach", 1, null);
        }
        return navigationScreenModel instanceof StrengthTrainerScreenModel ? StrengthTrainerScreenModel.copy$default((StrengthTrainerScreenModel) navigationScreenModel, null, null, null, null, true, null, 47, null) : navigationScreenModel;
    }

    /* JADX INFO: renamed from: a */
    public final C9598e m75587a(C9598e action) {
        C9598e c9598eM23127b;
        AbstractC22676k.m65750j(action, "action");
        NavigationScreenModel parameters = action.getParameters();
        WeeklyPlanSetupScreenModel weeklyPlanSetupScreenModel = parameters instanceof WeeklyPlanSetupScreenModel ? (WeeklyPlanSetupScreenModel) parameters : null;
        return (weeklyPlanSetupScreenModel == null || (c9598eM23127b = C9598e.m23127b(action, null, weeklyPlanSetupScreenModel.copy((57343 & 1) != 0 ? weeklyPlanSetupScreenModel.planName : null, (57343 & 2) != 0 ? weeklyPlanSetupScreenModel.locked : false, (57343 & 4) != 0 ? weeklyPlanSetupScreenModel.noPlanShowMetricSelection : false, (57343 & 8) != 0 ? weeklyPlanSetupScreenModel.analyticsSource : null, (57343 & 16) != 0 ? weeklyPlanSetupScreenModel.initialSelection : null, (57343 & 32) != 0 ? weeklyPlanSetupScreenModel.date : null, (57343 & 64) != 0 ? weeklyPlanSetupScreenModel.source : null, (57343 & 128) != 0 ? weeklyPlanSetupScreenModel.presetPlanCategory : null, (57343 & 256) != 0 ? weeklyPlanSetupScreenModel.planTitle : null, (57343 & 512) != 0 ? weeklyPlanSetupScreenModel.description : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? weeklyPlanSetupScreenModel.explanationTitle : null, (57343 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? weeklyPlanSetupScreenModel.explanation : null, (57343 & 4096) != 0 ? weeklyPlanSetupScreenModel.templateId : null, (57343 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? weeklyPlanSetupScreenModel.category : "ai_custom_plan", (57343 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? weeklyPlanSetupScreenModel.carouselPlacement : null, (57343 & 32768) != 0 ? weeklyPlanSetupScreenModel.dismissalType : null), null, 5, null)) == null) ? action : c9598eM23127b;
    }

    /* JADX INFO: renamed from: c */
    public final void m75588c(AbstractC25669a event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC25669a.g) {
            m75585b(new AbstractC21155m0.g1("https://www.whoop.com/thelocker/"));
            return;
        }
        if (event instanceof AbstractC25669a.a) {
            this.analyticsHelper.m123077o();
            AbstractC25669a.a aVar = (AbstractC25669a.a) event;
            if (!(aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() instanceof ArticleTileModelEvent.Url)) {
                if ((aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String() instanceof ArticleTileModelEvent.Cta) && ((ArticleTileModelEvent.Cta) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getCta() == ArticleTileModelEventEnum.HOW_WHOOP_COACH_WORKS_EDUCATION) {
                    m75585b(new AbstractC21155m0.w1("HOW_WHOOP_COACH_WORKS_EDUCATION", "Education Hub", null, null, 12, null));
                    return;
                }
                return;
            }
            if (ArticleTileCarouselModelKt.isVideo(((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getType())) {
                this.navigator.mo59393b(new AbstractC21155m0.g3(((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getUrl()));
                return;
            }
            if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ONLY_ENGLISH_IN_APP_CONTENT) && !AbstractC22676k.m65745e(this.languageRepository.getAllowedLanguage().getLanguage(), LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
                m75585b(new AbstractC21155m0.g1(((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getUrl()));
                return;
            } else if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL_V2)) {
                this.navigator.mo59393b(new AbstractC21155m0.f3(((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getId(), ((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getTag(), "AI Coach", "Education Tile", null, 16, null));
                return;
            } else {
                m75585b(new AbstractC21155m0.g1(((ArticleTileModelEvent.Url) aVar.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String()).getUrl()));
                return;
            }
        }
        if (event.equals(AbstractC25669a.e.f100943a)) {
            this.analyticsHelper.m123076n(true);
            m75585b(AbstractC21155m0.n0.f80473b);
            return;
        }
        if (event instanceof AbstractC25669a.f) {
            C9598e c9598eM75587a = m75587a(((AbstractC25669a.f) event).getAction());
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(c9598eM75587a.getParameters());
            this.analyticsHelper.m123075m(c9598eM75587a.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
            if (interfaceC21134cMo67681a instanceof AbstractC21155m0.t4) {
                this.analyticsHelper.m123086y();
            } else if (interfaceC21134cMo67681a instanceof AbstractC21155m0.r4) {
                this.analyticsHelper.m123063a();
            } else if (interfaceC21134cMo67681a instanceof AbstractC21155m0.y4) {
                NavigationScreenModel parameters = c9598eM75587a.getParameters();
                StrengthTrainerScreenModel strengthTrainerScreenModel = parameters instanceof StrengthTrainerScreenModel ? (StrengthTrainerScreenModel) parameters : null;
                if (AbstractC22676k.m65745e(strengthTrainerScreenModel != null ? strengthTrainerScreenModel.getEntryPoint() : null, "ai_coach")) {
                    this.analyticsHelper.m123064b();
                }
            }
            this.analyticsHelper.m123076n(false);
            this.navigator.mo59392a(C9598e.m23127b(c9598eM75587a, null, m75586d(c9598eM75587a.getParameters()), null, 5, null));
            return;
        }
        if (!(event instanceof AbstractC25669a.c)) {
            if (event instanceof AbstractC25669a.h) {
                AbstractC25669a.h hVar = (AbstractC25669a.h) event;
                this.navigator.mo59392a(C9598e.m23127b(hVar.getAction(), null, m75586d(hVar.getAction().getParameters()), null, 5, null));
                return;
            } else if (event instanceof AbstractC25669a.d) {
                m75585b(new AbstractC21155m0.m1(new ApiRequest(((AbstractC25669a.d) event).getPage(), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
                return;
            } else {
                if (!event.equals(AbstractC25669a.b.f100940a)) {
                    throw new NoWhenBranchMatchedException();
                }
                m75585b(new AbstractC21155m0.m1(new ApiRequest("/context-hub-bff/v1/context-hub?analytics_source=coach-chat", (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), null, null, null, null, null, null, null, null, null, 1022, null));
                return;
            }
        }
        String destination = ((AbstractC25669a.c) event).getDestination();
        if (destination == null) {
            destination = "WHOOP_COACH_RELEASE_NOTES";
        }
        if (this.isWrapperScreen) {
            m75585b(new AbstractC21155m0.v1(destination, "AI Coach"));
            return;
        }
        AbstractC12939a0 abstractC12939a0 = this.navController;
        if (abstractC12939a0 != null) {
            Uri uri = Uri.parse("android-app://com.whoop/education?path=".concat(destination));
            AbstractC22676k.m65750j(uri, "uri");
            abstractC12939a0.m36404s(new C12969k0(uri, null, null));
        }
    }
}
