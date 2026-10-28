package j02;

import ad3.AbstractC0770m;
import androidx.core.app.NotificationCompat;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.navigation.AiAction;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.GenericScreenModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericHttpMethod;
import com.whoop.navigation.models.GenericInteraction;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.json.JsonElement;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: j02.a0 */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m65681d2 = {"", "name", "query", "", "analyticsEnabled", "Lcom/whoop/navigation/GenericScreenModel;", "c", "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/GenericScreenModel;", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "a", "(Ljava/lang/String;)Lcom/whoop/analytics/ScreenAnalyticEventModel;", "Lcom/whoop/analytics/MetricEventModel;", "b", "(Ljava/lang/String;)Lcom/whoop/analytics/MetricEventModel;", "navigation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC21129a0 {
    /* JADX INFO: renamed from: a */
    private static final ScreenAnalyticEventModel m58960a(String str) {
        return new ScreenAnalyticEventModel(new AnalyticEventModel("dynamic_deeplink_screen_entered", NotificationCompat.CATEGORY_NAVIGATION, "dynamic_deep_link", (String) null, (String) null, (String) null, AbstractC25247g0.m73989X(new C23465k("deep_link_name", AbstractC0770m.m1841c(str))), 56, (DefaultConstructorMarker) null), (AnalyticEventModel) null, new AnalyticEventModel("dynamic_deeplink_screen_failed", NotificationCompat.CATEGORY_NAVIGATION, "dynamic_deep_link", (String) null, (String) null, (String) null, AbstractC25247g0.m73989X(new C23465k("deep_link_name", AbstractC0770m.m1841c(str))), 56, (DefaultConstructorMarker) null), 2, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: renamed from: b */
    private static final MetricEventModel m58961b(String str) {
        return new MetricEventModel(AbstractC11266d.m30461o("dynamic_deep_link_", str), "dynamic_deep_link");
    }

    /* JADX INFO: renamed from: c */
    public static final GenericScreenModel m58962c(String name, String query, boolean z4) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(query, "query");
        return new GenericScreenModel(new ApiRequest(AbstractC11895b.m31996o("navigation-service/v1/deeplink/bff/", name, query.length() == 0 ? "" : "?".concat(query)), (GenericHttpMethod) null, (JsonElement) null, 6, (DefaultConstructorMarker) null), new CachePolicyModel(false, (String) null, (Set) null, 6, (DefaultConstructorMarker) null), "PRESENT", z4 ? m58960a(name) : null, z4 ? m58961b(name) : null, (AiAction) null, (GenericInteraction) null, (List) null, (List) null, 480, (DefaultConstructorMarker) null);
    }
}
