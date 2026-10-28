package yl2;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.data.repositories.LanguageRepository;
import com.whoop.data.repositories.LanguageRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileCarouselModelKt;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.util.TrendKey;
import com.whoop.video.VideoActivity;
import d13.AbstractC11478a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import nf1.AbstractC26666g;
import or2.C28216y;
import p088dc.AbstractC11895b;
import p114eb.C12969k0;
import p236j.AbstractC21065d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: yl2.c */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u001d\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010!J\r\u0010#\u001a\u00020\u0013¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010&R\u001c\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010*¨\u0006+"}, m65681d2 = {"Lyl2/c;", "", "Landroidx/fragment/app/m0;", "fragment", "Lor2/y;", "externalLinkNavigator", "Lj/d;", "Landroid/content/Intent;", "activityResultLauncher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lj02/o0;", "navigator", "Lcom/whoop/data/repositories/LanguageRepository;", "languageRepository", "<init>", "(Landroidx/fragment/app/m0;Lor2/y;Lj/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Lcom/whoop/data/repositories/LanguageRepository;)V", "", "trendName", "Ll83/a0;", "d", "(Ljava/lang/String;)V", "Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;", "clickEvent", "g", "(Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;Ljava/lang/String;)V", NotificationCompat.CATEGORY_EVENT, "a", "Lcom/whoop/util/TrendKey;", "trendKey", "c", "(Ljava/lang/Object;Lcom/whoop/util/TrendKey;)V", "b", "(Lcom/whoop/util/TrendKey;)V", "e", "f", "()V", "Landroidx/fragment/app/m0;", "Lor2/y;", "Lj/d;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lj02/o0;", "Lcom/whoop/data/repositories/LanguageRepository;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39636c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC21065d activityResultLauncher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final LanguageRepository languageRepository;

    public C39636c(AbstractComponentCallbacksC1320m0 fragment, C28216y externalLinkNavigator, AbstractC21065d abstractC21065d, FeatureFlagChecker ffChecker, InterfaceC21159o0 navigator, LanguageRepository languageRepository) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(languageRepository, "languageRepository");
        this.fragment = fragment;
        this.externalLinkNavigator = externalLinkNavigator;
        this.activityResultLauncher = abstractC21065d;
        this.ffChecker = ffChecker;
        this.navigator = navigator;
        this.languageRepository = languageRepository;
    }

    /* JADX INFO: renamed from: a */
    private final void m126700a(ArticleTileModelEvent.Url event, String trendName) {
        if (event.getUrl().length() > 0 && this.ffChecker.isFeatureEnabled("update-trend-article-tile-navigation-android")) {
            this.navigator.mo59393b(new AbstractC21155m0.d0(null, event.getUrl(), null, null, 13, null));
            return;
        }
        if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.ONLY_ENGLISH_IN_APP_CONTENT) && !AbstractC22676k.m65745e(this.languageRepository.getAllowedLanguage().getLanguage(), LanguageRepositoryKt.DEFAULT_LANGUAGE)) {
            C28216y c28216y = this.externalLinkNavigator;
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
            c28216y.m85434x(abstractActivityC1340r0RequireActivity, event.getUrl(), false);
            return;
        }
        if (!this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL_V2)) {
            C28216y c28216y2 = this.externalLinkNavigator;
            AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.fragment.requireActivity();
            AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity2, "requireActivity(...)");
            C28216y.m85414y(c28216y2, abstractActivityC1340r0RequireActivity2, event.getUrl(), false, 4, null);
            return;
        }
        String strM125926K = AbstractC39421y.m125926K(event.getId(), "&", "%26", false);
        String tag = event.getTag();
        String id4 = event.getId();
        StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strM125926K, "&entryPoint=", trendName, "&eventName=Education Tile&contentType=");
        sbM32001t.append(tag);
        sbM32001t.append("&articleId=");
        sbM32001t.append(id4);
        Uri uri = Uri.parse(sbM32001t.toString());
        AbstractC22676k.m65750j(uri, "uri");
        AbstractC5583n.m16799z(this.fragment).m36404s(new C12969k0(uri, null, null));
    }

    /* JADX INFO: renamed from: d */
    private final void m126701d(String trendName) {
        String string;
        if (this.ffChecker.isFeatureEnabled(FeatureFlagRepositoryKt.MX_CONTENT_SEARCH)) {
            this.navigator.mo59393b(new AbstractC21155m0.s0(trendName));
            return;
        }
        C28216y c28216y = this.externalLinkNavigator;
        AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
        AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
        Context context = this.fragment.getContext();
        if (context == null || (string = context.getString(AbstractC26666g.f106012c)) == null) {
            string = "";
        }
        C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, string, false, 4, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m126702g(ArticleTileModelEvent.Url clickEvent, String trendName) {
        Intent intent = new Intent(this.fragment.requireContext(), (Class<?>) VideoActivity.class);
        intent.putExtra("videoUrl", clickEvent.getUrl());
        intent.putExtra("SHOULD_SUBTITLES_DEFAULT_TO_OFF", true);
        intent.putExtra("ARTICLE_TITLE", clickEvent.getTitle());
        intent.putExtra("TREND_NAME", trendName);
        AbstractC21065d abstractC21065d = this.activityResultLauncher;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(intent, null);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m126703b(TrendKey trendKey) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        C39634a.f170518a.m126697a(this.fragment, "SEGMENTAL_BODY_COMPOSITION_EDUCATION", trendKey.getTrendName());
    }

    /* JADX INFO: renamed from: c */
    public final void m126704c(Object clickEvent, TrendKey trendKey) {
        AbstractC22676k.m65750j(clickEvent, "clickEvent");
        AbstractC22676k.m65750j(trendKey, "trendKey");
        if (clickEvent == ArticleTileCarouselEventEnum.VIEW_ALL) {
            m126701d(trendKey.getTrendName());
            return;
        }
        if (clickEvent instanceof ArticleTileModelEvent.Url) {
            ArticleTileModelEvent.Url url = (ArticleTileModelEvent.Url) clickEvent;
            if (ArticleTileCarouselModelKt.isVideo(url.getType())) {
                m126702g(url, trendKey.getTrendName());
            } else {
                m126700a(url, trendKey.getTrendName());
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m126705e(TrendKey trendKey) {
        AbstractC22676k.m65750j(trendKey, "trendKey");
        C39634a.f170518a.m126697a(this.fragment, "WEIGHT_TRENDS_EDUCATION", trendKey.getTrendName());
    }

    /* JADX INFO: renamed from: f */
    public final void m126706f() {
        Uri uri = Uri.parse("android-app://com.whoop/ai-coach");
        AbstractC5583n.m16799z(this.fragment).m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
    }
}
