package oz1;

import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.nativestore.home.domain.model.ShopProductTagType;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.AuthenticatedWebViewModel;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NativeStoreScreenModel;
import com.whoop.navigation.NavigationScreenModel;
import fi0.AbstractC14516b;
import fi0.InterfaceC14515a;
import io.getstream.chat.android.client.api.QueryParams;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.LinkedHashMap;
import l83.C23465k;
import m83.AbstractC25247g0;
import mz1.AbstractC26038a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p720m91.InterfaceC25312u;
import r80.AbstractC31061c;
import tz1.C34286h;
import tz1.C34287i;
import tz1.C34288j;
import tz1.C34290l;
import tz1.InterfaceC34282d;
import y71.C39282o;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: oz1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\f2\b\u0010\n\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001c\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ+\u0010 \u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\"\u0010#J\u0019\u0010$\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b$\u0010#J\u001b\u0010%\u001a\u0004\u0018\u00010\b2\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b%\u0010&J!\u0010(\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020'2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010/¨\u00060"}, m65681d2 = {"Loz1/a;", "", "Lfi0/a;", "analytics", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lfi0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "destination", "source", QueryParams.URL, "Ll83/a0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ltz1/d$h;", NotificationCompat.CATEGORY_EVENT, "b", "(Ltz1/d$h;)V", "trigger", "j", "(Ljava/lang/String;Ljava/lang/String;)V", "i", "()V", "e", "analyticsValue", "", "index", "d", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;", "tagType", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/Integer;Lcom/whoop/nativestore/home/domain/model/ShopProductTagType;)V", "g", "(Ljava/lang/String;)V", "f", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ltz1/d$a;", "k", "(Ltz1/d$a;Ljava/lang/String;)V", "Lcom/whoop/navigation/e;", "navAction", "l", "(Lcom/whoop/navigation/e;)V", "Lfi0/a;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "native-store_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28498a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC14515a analytics;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    public C28498a(InterfaceC14515a analytics, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(analytics, "analytics");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.analytics = analytics;
        this.featureFlagChecker = featureFlagChecker;
    }

    /* JADX INFO: renamed from: a */
    private final void m86799a(String destination, String source, String url) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("destination", destination));
        if (source != null) {
            linkedHashMapM73993b0.put("source", source);
        }
        if (url != null) {
            linkedHashMapM73993b0.put(QueryParams.URL, url);
        }
        this.analytics.mo41428k(null, "In App Click", null, "WHOOP Store - Link Clicked", linkedHashMapM73993b0);
    }

    /* JADX INFO: renamed from: b */
    private final void m86800b(InterfaceC34282d.h event) {
        AnalyticEventModel analyticEvent;
        InterfaceC25312u element = event.getElement();
        C39282o c39282o = element instanceof C39282o ? (C39282o) element : null;
        if (c39282o != null && (analyticEvent = c39282o.getAnalyticEvent()) != null) {
            AbstractC14516b.m41429a(this.analytics, analyticEvent);
        }
        Object obj = event.getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
        if (obj instanceof C34286h) {
            C34286h c34286h = (C34286h) obj;
            m86802d(c34286h.getAnalyticsValue(), c34286h.getIndex());
        } else if (obj instanceof C34290l) {
            C34290l c34290l = (C34290l) obj;
            m86806h(c34290l.getAnalyticsValue(), c34290l.getIndex(), c34290l.getTagType());
        } else if (obj instanceof C34287i) {
            m86805g(((C34287i) obj).getAnalyticsValue());
        } else if (obj instanceof C34288j) {
            m86804f(((C34288j) obj).getAnalyticsValue());
        }
    }

    /* JADX INFO: renamed from: c */
    private final String m86801c(String source) {
        if (AbstractC26038a.m77462a(source, this.featureFlagChecker)) {
            return "iajf";
        }
        if (AbstractC22676k.m65745e(source, "more_tab")) {
            return "more tab";
        }
        if (AbstractC22676k.m65745e(source, "home_screen_discover_more")) {
            return "home_screen";
        }
        return null;
    }

    /* JADX INFO: renamed from: d */
    private final void m86802d(String analyticsValue, Integer index) {
        this.analytics.mo41422d("In app WHOOP Store", "Click", "Banner", "In app WHOOP Store", analyticsValue, AbstractC25247g0.m73990Y(new C23465k("Banner Position", index), new C23465k("version", "v2")));
    }

    /* JADX INFO: renamed from: e */
    private final void m86803e() {
        this.analytics.mo41428k("In app WHOOP Store", "Click", "Shopping Cart", "In app WHOOP Store", AbstractC31061c.m95645u("version", "v2"));
    }

    /* JADX INFO: renamed from: f */
    private final void m86804f(String analyticsValue) {
        this.analytics.mo41422d("In app WHOOP Store", "Click", "PLP tile", "In app WHOOP Store", analyticsValue, AbstractC25247g0.m73990Y(new C23465k("PLP Name", analyticsValue), new C23465k("version", "v2")));
    }

    /* JADX INFO: renamed from: g */
    private final void m86805g(String analyticsValue) {
        this.analytics.mo41422d("In app WHOOP Store", "Click", "Shop All", "In app WHOOP Store", analyticsValue, AbstractC31061c.m95645u("version", "v2"));
    }

    /* JADX INFO: renamed from: h */
    private final void m86806h(String analyticsValue, Integer index, ShopProductTagType tagType) {
        InterfaceC14515a interfaceC14515a = this.analytics;
        C23465k c23465k = new C23465k("Product Name", analyticsValue);
        C23465k c23465k2 = new C23465k("Product Card Position", index);
        boolean z4 = true;
        C23465k c23465k3 = new C23465k("Is_sale", Boolean.valueOf(tagType == ShopProductTagType.SALE || tagType == ShopProductTagType.CYBER_SALE));
        C23465k c23465k4 = new C23465k("Is_new", Boolean.valueOf(tagType == ShopProductTagType.NEW));
        if (tagType != ShopProductTagType.COMING_SOON) {
            z4 = false;
        }
        interfaceC14515a.mo41422d("In app WHOOP Store", "Click", "Product Card", "In app WHOOP Store", analyticsValue, AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, new C23465k("Is_coming_soon", Boolean.valueOf(z4)), new C23465k("version", "v2")));
    }

    /* JADX INFO: renamed from: i */
    private final void m86807i() {
        InterfaceC14515a.m41418i(this.analytics, "In app WHOOP Store", "Dismiss WHOOP Store", null, "In app WHOOP Store", null, AbstractC31061c.m95645u("version", "v2"), 20, null);
    }

    /* JADX INFO: renamed from: j */
    private final void m86808j(String source, String trigger) {
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("Is_Shop_Redesign_Enabled", Boolean.TRUE), new C23465k("version", "v2"), new C23465k("trigger", trigger));
        if (source != null) {
            linkedHashMapM73993b0.put("source", source);
        }
        this.analytics.mo41428k("In app WHOOP Store", "View in app WHOOP Store", m86801c(source), "In app WHOOP Store", linkedHashMapM73993b0);
    }

    /* JADX INFO: renamed from: k */
    public final void m86809k(InterfaceC34282d.a event, String source) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof InterfaceC34282d.g) {
            m86808j(((InterfaceC34282d.g) event).getSource(), "initial");
            return;
        }
        if (event instanceof InterfaceC34282d.j) {
            m86808j(((InterfaceC34282d.j) event).getSource(), "retry");
            return;
        }
        if (event instanceof InterfaceC34282d.k) {
            m86808j(((InterfaceC34282d.k) event).getSource(), "return");
            return;
        }
        if (event.equals(InterfaceC34282d.b.f143986a)) {
            m86807i();
            return;
        }
        if (event instanceof InterfaceC34282d.d) {
            m86803e();
            return;
        }
        if (event instanceof InterfaceC34282d.h) {
            m86800b((InterfaceC34282d.h) event);
        } else {
            if (!(event instanceof InterfaceC34282d.f)) {
                throw new NoWhenBranchMatchedException();
            }
            AnalyticEventModel analyticEvent = ((InterfaceC34282d.f) event).getAnalyticEvent();
            if (analyticEvent != null) {
                AbstractC14516b.m41429a(this.analytics, analyticEvent);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m86810l(C9598e navAction) {
        AbstractC22676k.m65750j(navAction, "navAction");
        AppScreen appScreen = navAction.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String();
        if (AbstractC22676k.m65745e(appScreen, AppScreen.C9316g4.f27625w)) {
            NavigationScreenModel parameters = navAction.getParameters();
            NativeStoreScreenModel nativeStoreScreenModel = parameters instanceof NativeStoreScreenModel ? (NativeStoreScreenModel) parameters : null;
            m86799a("native", nativeStoreScreenModel != null ? nativeStoreScreenModel.getSource() : null, null);
        } else if (AbstractC22676k.m65745e(appScreen, AppScreen.C9455y0.f28055w)) {
            NavigationScreenModel parameters2 = navAction.getParameters();
            AuthenticatedWebViewModel authenticatedWebViewModel = parameters2 instanceof AuthenticatedWebViewModel ? (AuthenticatedWebViewModel) parameters2 : null;
            String url = authenticatedWebViewModel != null ? authenticatedWebViewModel.getUrl() : null;
            if (url == null || !AbstractC39414r.m125876U(url, "shop.whoop", false)) {
                return;
            }
            m86799a("web", null, url);
        }
    }
}
