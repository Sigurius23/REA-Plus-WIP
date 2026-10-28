package ro1;

import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.mapbox.common.HttpHeaders;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileModelEvent;
import d13.AbstractC11478a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import l83.C23465k;
import m83.AbstractC25247g0;
import nf1.AbstractC26666g;
import or2.AbstractC28163g0;
import or2.AbstractC28219z;
import or2.C28216y;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p114eb.AbstractC12939a0;
import p114eb.C12969k0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ro1.i */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Lro1/i;", "", "Landroidx/fragment/app/m0;", "fragment", "Lj02/o0;", "navigator", "Leb/a0;", "composeNavController", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lor2/y;", "externalLinkNavigator", "<init>", "(Landroidx/fragment/app/m0;Lj02/o0;Leb/a0;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;)V", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "a", "(Ljava/lang/Object;)V", "Landroidx/fragment/app/m0;", "b", "Lj02/o0;", "c", "Leb/a0;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lor2/y;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31637i {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AbstractC12939a0 composeNavController;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    public C31637i(AbstractComponentCallbacksC1320m0 fragment, InterfaceC21159o0 navigator, AbstractC12939a0 composeNavController, FeatureFlagChecker featureFlagChecker, C28216y externalLinkNavigator) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(composeNavController, "composeNavController");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        this.fragment = fragment;
        this.navigator = navigator;
        this.composeNavController = composeNavController;
        this.featureFlagChecker = featureFlagChecker;
        this.externalLinkNavigator = externalLinkNavigator;
    }

    /* JADX INFO: renamed from: a */
    public final void m97771a(Object event) {
        String string;
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC31635g.a.f130697a)) {
            this.composeNavController.m36410z();
            return;
        }
        if (event.equals(AbstractC31635g.c.f130700a)) {
            AbstractC28163g0.m85259o(this.fragment).m85343i();
            return;
        }
        if (event instanceof AbstractC31635g.b) {
            AbstractC31635g.b bVar = (AbstractC31635g.b) event;
            Object clickEvent = bVar.getClickEvent();
            if (clickEvent == ArticleTileCarouselEventEnum.VIEW_ALL) {
                if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.MX_CONTENT_SEARCH)) {
                    this.navigator.mo59393b(new AbstractC21155m0.s0(bVar.getTrendKey().getTrendName()));
                    return;
                }
                C28216y c28216y = this.externalLinkNavigator;
                AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity = this.fragment.requireActivity();
                AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity, "requireActivity(...)");
                Context context = this.fragment.getContext();
                C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, (context == null || (string = context.getString(AbstractC26666g.f106012c)) == null) ? "" : string, false, 4, null);
                return;
            }
            if (clickEvent instanceof ArticleTileModelEvent.Url) {
                String strM125926K = AbstractC39421y.m125926K(((ArticleTileModelEvent.Url) bVar.getClickEvent()).getId(), "&", "%26", false);
                String trendName = bVar.getTrendKey().getTrendName();
                String tag = ((ArticleTileModelEvent.Url) bVar.getClickEvent()).getTag();
                String id4 = ((ArticleTileModelEvent.Url) bVar.getClickEvent()).getId();
                StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strM125926K, "&entryPoint=", trendName, "&eventName=Education Tile&contentType=");
                sbM32001t.append(tag);
                sbM32001t.append("&articleId=");
                sbM32001t.append(id4);
                Uri uri = Uri.parse(sbM32001t.toString());
                AbstractC22676k.m65750j(uri, "uri");
                AbstractC5583n.m16799z(this.fragment).m36404s(new C12969k0(uri, null, null));
                return;
            }
            return;
        }
        if (event instanceof AbstractC31635g.g) {
            AbstractC31635g.g gVar = (AbstractC31635g.g) event;
            String str = gVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String();
            if (str == null) {
                str = "";
            }
            String string2 = AbstractC28219z.m85447b("logCalendar", AbstractC25247g0.m73990Y(new C23465k(HttpHeaders.DATE, str), new C23465k("source", gVar.getSource()))).toString();
            AbstractC22676k.m65749i(string2, "toString(...)");
            Uri uri2 = Uri.parse(string2);
            AbstractC22676k.m65750j(uri2, "uri");
            AbstractC5583n.m16799z(this.fragment).m36404s(new C12969k0(uri2, null, null));
            return;
        }
        if (event instanceof AbstractC31635g.e) {
            this.navigator.mo59392a(((AbstractC31635g.e) event).getNavigationAction());
            return;
        }
        if (event.equals(AbstractC31635g.h.f130708a)) {
            Uri uri3 = Uri.parse("android-app://com.whoop/hormonalSettingsFragment");
            AbstractC5583n.m16799z(this.fragment).m36404s(AbstractC11478a.m30854f(uri3, "uri", uri3, null, null));
            return;
        }
        if (event.equals(AbstractC31635g.d.f130701a)) {
            Uri uri4 = Uri.parse("android-app://com.whoop/mciCycles");
            AbstractC5583n.m16799z(this.fragment).m36404s(AbstractC11478a.m30854f(uri4, "uri", uri4, null, null));
        } else if (event instanceof AbstractC31635g.f) {
            String analyticsSource = ((AbstractC31635g.f) event).getAnalyticsSource();
            if (analyticsSource == null || AbstractC39414r.m125890i0(analyticsSource)) {
                analyticsSource = null;
            }
            AbstractC12939a0.m36374y(this.composeNavController, AbstractC11266d.m30461o("SYMPTOMS?analyticsSource=", Uri.encode(analyticsSource == null ? "" : analyticsSource)), null, 6);
        }
    }
}
