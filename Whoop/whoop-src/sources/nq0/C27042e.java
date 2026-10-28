package nq0;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.navigation.C9598e;
import com.whoop.video.VideoActivity;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.AbstractC21155m0;
import j02.InterfaceC21134c;
import j02.InterfaceC21159o0;
import nf1.AbstractC26666g;
import o02.InterfaceC27353d;
import or2.C28216y;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p236j.AbstractC21065d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import qe1.C30304b;
import qe1.InterfaceC30303a;
import qe1.InterfaceC30307e;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: nq0.e */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0007\u0018\u0000 22\u00020\u0001:\u0001\u001aBW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010!\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00063"}, m65681d2 = {"Lnq0/e;", "", "Lor2/y;", "externalLinkNavigator", "Landroid/app/Activity;", "activity", "Leb/a0;", "navController", "Lqe1/b;", "analyticsHelper", "Lj/d;", "Landroid/content/Intent;", "activityResultLauncher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "Lo02/d;", "navigationReducer", "<init>", "(Lor2/y;Landroid/app/Activity;Leb/a0;Lqe1/b;Lj/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Lcom/whoop/data/repositories/LanguageRepository;Lo02/d;)V", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;)V", "", QueryParams.URL, "title", "b", "(Ljava/lang/String;Ljava/lang/String;)V", "c", "(Ljava/lang/Object;)V", "Lor2/y;", "Landroid/app/Activity;", "Leb/a0;", "d", "Lqe1/b;", "e", "Lj/d;", "f", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "g", "Lj02/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lcom/whoop/data/repositories/LanguageRepository;", "i", "Lo02/d;", "j", "community_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27042e {

    /* JADX INFO: renamed from: k */
    public static final int f107960k = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final Activity activity;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 navController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C30304b analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC27353d navigationReducer;

    public C27042e(C28216y externalLinkNavigator, Activity activity, AbstractC12939a0 navController, C30304b analyticsHelper, AbstractC21065d abstractC21065d, FeatureFlagChecker ffChecker, InterfaceC21159o0 navigator, LanguageRepository languageRepository, InterfaceC27353d navigationReducer) {
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(activity, "activity");
        AbstractC22676k.m65750j(navController, "navController");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        AbstractC22676k.m65750j(navigationReducer, "navigationReducer");
        this.externalLinkNavigator = externalLinkNavigator;
        this.activity = activity;
        this.navController = navController;
        this.analyticsHelper = analyticsHelper;
        this.activityResultLauncher = abstractC21065d;
        this.ffChecker = ffChecker;
        this.navigator = navigator;
        this.languageRepository = languageRepository;
        this.navigationReducer = navigationReducer;
    }

    /* JADX INFO: renamed from: a */
    private final void m81159a(ArticleTileModelEvent.Url event) {
        if (ArticleTileCarouselModelKt.isVideo(event.getType())) {
            m81160b(event.getUrl(), event.getTitle());
            return;
        }
        if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ONLY_ENGLISH_IN_APP_CONTENT) && !AbstractC22676k.m65745e(this.languageRepository.getAllowedLanguage().getLanguage(), LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
            this.externalLinkNavigator.m85434x(this.activity, event.getUrl(), false);
            return;
        }
        String strM125926K = AbstractC39421y.m125926K(event.getId(), "&", "%26", false);
        String tag = event.getTag();
        String id4 = event.getId();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strM125926K, "&entryPoint=Community&eventName=Education Tile&contentType=", tag, "&articleId=");
        sbM32001t.append(id4);
        Uri uri = Uri.parse(sbM32001t.toString());
        AbstractC22676k.m65750j(uri, "uri");
        this.navController.m36404s(new C12969k0(uri, null, null));
    }

    /* JADX INFO: renamed from: b */
    private final void m81160b(String url, String title) {
        Intent intent = new Intent(this.activity, (Class<?>) VideoActivity.class);
        intent.putExtra("videoUrl", url);
        intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
        intent.putExtra("ARTICLE_TITLE", title);
        AbstractC21065d abstractC21065d = this.activityResultLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(intent, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m81161c(Object event) {
        AbstractC22676k.m65750j(event, "event");
        if (event == ArticleTileCarouselEventEnum.MORE) {
            this.analyticsHelper.m92656a(InterfaceC30303a.b.f124007a);
            if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.MX_CONTENT_SEARCH)) {
                this.navigator.mo59393b(new AbstractC21155m0.s0("Community"));
                return;
            }
            C28216y c28216y = this.externalLinkNavigator;
            Activity activity = this.activity;
            String string = activity.getString(AbstractC26666g.f106012c);
            AbstractC22676k.m65749i(string, "getString(...)");
            C28216y.m85414y(c28216y, activity, string, false, 4, null);
            return;
        }
        if (event instanceof ArticleTileModelEvent.Url) {
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) event;
            this.analyticsHelper.m92656a(new InterfaceC30303a.c(url.getTitle(), url.getIndex(), url.getTag()));
            m81159a(url);
        } else if (event instanceof C9598e) {
            C9598e c9598e = (C9598e) event;
            InterfaceC21134c interfaceC21134cMo67681a = this.navigationReducer.mo67681a(c9598e.getParameters());
            if (interfaceC21134cMo67681a instanceof AbstractC21155m0.b4) {
                this.analyticsHelper.m92657b(InterfaceC30307e.b.f124019a);
            } else if (interfaceC21134cMo67681a instanceof AbstractC21155m0.h1) {
                this.analyticsHelper.m92657b(InterfaceC30307e.a.f124018a);
            }
            this.navigator.mo59392a(c9598e);
        }
    }
}
