package mp1;

import ad3.AbstractC0757c;
import android.content.Context;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import androidx.lifecycle.C1601k1;
import com.squareup.wire.AbstractC5583n;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.design.models.items.ArticleTileCarouselEventEnum;
import com.whoop.design.models.items.ArticleTileModelEvent;
import com.whoop.design.models.modal.DecodedGenericInteraction;
import com.whoop.design.models.modal.GenericInteractionDecoderKt;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.models.GenericInteraction;
import d13.AbstractC11478a;
import j02.AbstractC21155m0;
import j02.InterfaceC21159o0;
import java.time.Clock;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import nf1.AbstractC26666g;
import or2.C28216y;
import p088dc.AbstractC11895b;
import p114eb.C12982q;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import ro1.AbstractC31635g;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: mp1.b */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\u0013B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lmp1/b;", "", "Landroidx/fragment/app/m0;", "fragment", "Lj02/o0;", "navigator", "Ljava/time/Clock;", "clock", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lor2/y;", "externalLinkNavigator", "Lad3/c;", "json", "<init>", "(Landroidx/fragment/app/m0;Lj02/o0;Ljava/time/Clock;Lcom/whoop/data/repositories/FeatureFlagChecker;Lor2/y;Lad3/c;)V", "Landroid/net/Uri;", "uri", "Ll83/a0;", "a", "(Landroid/net/Uri;)V", NotificationCompat.CATEGORY_EVENT, "b", "(Ljava/lang/Object;)V", "Landroidx/fragment/app/m0;", "Lj02/o0;", "c", "Ljava/time/Clock;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lor2/y;", "f", "Lad3/c;", "g", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25869b {

    /* JADX INFO: renamed from: h */
    public static final int f101997h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractComponentCallbacksC1320m0 fragment;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC21159o0 navigator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final Clock clock;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C28216y externalLinkNavigator;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C25869b(AbstractComponentCallbacksC1320m0 fragment, InterfaceC21159o0 navigator, Clock clock, FeatureFlagChecker featureFlagChecker, C28216y externalLinkNavigator, AbstractC0757c json) {
        AbstractC22676k.m65750j(fragment, "fragment");
        AbstractC22676k.m65750j(navigator, "navigator");
        AbstractC22676k.m65750j(clock, "clock");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(externalLinkNavigator, "externalLinkNavigator");
        AbstractC22676k.m65750j(json, "json");
        this.fragment = fragment;
        this.navigator = navigator;
        this.clock = clock;
        this.featureFlagChecker = featureFlagChecker;
        this.externalLinkNavigator = externalLinkNavigator;
        this.json = json;
    }

    /* JADX INFO: renamed from: a */
    private final void m76466a(Uri uri) {
        AbstractC5583n.m16799z(this.fragment).m36404s(AbstractC11478a.m30854f(uri, "uri", uri, null, null));
    }

    /* JADX INFO: renamed from: b */
    public final void m76467b(Object event) {
        C9598e navigation;
        String string;
        C1601k1 c1601k1M36480b;
        AbstractC22676k.m65750j(event, "event");
        if (event.equals(AbstractC25868a.a.f101983a)) {
            AbstractC5583n.m16799z(this.fragment).m36410z();
            return;
        }
        if (event instanceof AbstractC25868a.g) {
            this.navigator.mo59393b(AbstractC21155m0.b2.f80267b);
            return;
        }
        if (event instanceof AbstractC25868a.h) {
            C12982q c12982qM36398m = AbstractC5583n.m16799z(this.fragment).m36398m();
            if (c12982qM36398m != null && (c1601k1M36480b = c12982qM36398m.m36480b()) != null) {
                c1601k1M36480b.m5004e(Boolean.TRUE, "refreshSettings");
            }
            AbstractC5583n.m16799z(this.fragment).m36410z();
            return;
        }
        if (event.equals(AbstractC25868a.d.f101988a)) {
            m76466a(Uri.parse("android-app://com.whoop/pregnancySettingsFragment?pregnancyScreen=" + EnumC25870c.EDUCATION));
            return;
        }
        if (!(event instanceof AbstractC25868a.b)) {
            if (event instanceof AbstractC25868a.f) {
                this.navigator.mo59393b(new AbstractC21155m0.z(null, null, ((AbstractC25868a.f) event).getMessage(), DateTimeFormatter.ISO_LOCAL_DATE.format(LocalDate.now(this.clock)), null, null, null, null, false, null, null, null, 4083, null));
                return;
            }
            if (event instanceof AbstractC25868a.i) {
                AbstractC25868a.i iVar = (AbstractC25868a.i) event;
                m76466a(Uri.parse("android-app://com.whoop/postPartumOnboarding?screen=" + iVar.getType().getScreen() + "&id=" + iVar.getId()));
                return;
            }
            if (event instanceof AbstractC25868a.e) {
                return;
            }
            if (event instanceof AbstractC25868a.c) {
                this.navigator.mo59392a(((AbstractC25868a.c) event).getNavigationAction());
                return;
            }
            if (event instanceof GenericInteraction) {
                DecodedGenericInteraction decodedGenericInteraction = GenericInteractionDecoderKt.toDecodedGenericInteraction((GenericInteraction) event, this.json);
                if (decodedGenericInteraction == null || (navigation = decodedGenericInteraction.getNavigation()) == null) {
                    return;
                }
                this.navigator.mo59392a(navigation);
                return;
            }
            if (event instanceof AbstractC31635g.e) {
                this.navigator.mo59392a(((AbstractC31635g.e) event).getNavigationAction());
                return;
            } else {
                if (event instanceof AbstractC31635g.f) {
                    this.navigator.mo59393b(new AbstractC21155m0.b5(null, ((AbstractC31635g.f) event).getPregnancyId(), 1, null));
                    return;
                }
                return;
            }
        }
        AbstractC25868a.b bVar = (AbstractC25868a.b) event;
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
            if (context == null || (string = context.getString(AbstractC26666g.f106012c)) == null) {
                string = "";
            }
            C28216y.m85414y(c28216y, abstractActivityC1340r0RequireActivity, string, false, 4, null);
            return;
        }
        if (clickEvent instanceof ArticleTileModelEvent.Url) {
            if (!this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.TRENDS_EDUCATION_CAROUSEL_V2)) {
                C28216y c28216y2 = this.externalLinkNavigator;
                AbstractActivityC1340r0 abstractActivityC1340r0RequireActivity2 = this.fragment.requireActivity();
                AbstractC22676k.m65749i(abstractActivityC1340r0RequireActivity2, "requireActivity(...)");
                C28216y.m85414y(c28216y2, abstractActivityC1340r0RequireActivity2, ((ArticleTileModelEvent.Url) bVar.getClickEvent()).getUrl(), false, 4, null);
                return;
            }
            String strM125926K = AbstractC39421y.m125926K(((ArticleTileModelEvent.Url) bVar.getClickEvent()).getId(), "&", "%26", false);
            String trendName = bVar.getTrendKey().getTrendName();
            String tag = ((ArticleTileModelEvent.Url) bVar.getClickEvent()).getTag();
            String id4 = ((ArticleTileModelEvent.Url) bVar.getClickEvent()).getId();
            StringBuilder sbM32001t = AbstractC11895b.m32001t("android-app://com.whoop/education?path=", strM125926K, "&entryPoint=", trendName, "&eventName=Education Tile&contentType=");
            sbM32001t.append(tag);
            sbM32001t.append("&articleId=");
            sbM32001t.append(id4);
            m76466a(Uri.parse(sbM32001t.toString()));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C25869b(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, InterfaceC21159o0 interfaceC21159o0, Clock clock, FeatureFlagChecker featureFlagChecker, C28216y c28216y, AbstractC0757c abstractC0757c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 4) != 0) {
            clock = Clock.systemDefaultZone();
            AbstractC22676k.m65749i(clock, "systemDefaultZone(...)");
        }
        this(abstractComponentCallbacksC1320m0, interfaceC21159o0, clock, featureFlagChecker, c28216y, abstractC0757c);
    }
}
