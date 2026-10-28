package qi0;

import ad3.AbstractC0757c;
import ad3.C0764g;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.navigation.GenericCachePolicy;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import j02.AbstractC21155m0;
import j02.C21147i0;
import j02.InterfaceC21149j0;
import j02.InterfaceC21151k0;
import java.net.URLEncoder;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.C23454a0;
import n83.C26463f;
import no.nordicsemi.android.dfu.DfuBaseService;
import or2.AbstractC28152c1;
import or2.AbstractC28219z;
import p114eb.C12995w0;
import p114eb.C12997x0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qc1.C30217a;
import u82.AbstractC34650k;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: qi0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u008f\u0001\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010)\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001d\u0010&\u0012\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lqi0/c;", "Lj02/k0;", "Lj02/i0;", "navDeepLinkRequestHelper", "<init>", "(Lj02/i0;)V", "", "path", "Lcom/whoop/navigation/models/ApiRequest;", "request", "selectedTab", "Lcom/whoop/navigation/GenericCachePolicy;", "cachePolicy", "navigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "analyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "metricEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "Leb/x0;", "navOptions", "", "Lkotlinx/serialization/json/JsonElement;", "loadingTopItems", "errorTopItems", "Lj02/j0;", "c", "(Ljava/lang/String;Lcom/whoop/navigation/models/ApiRequest;Ljava/lang/String;Lcom/whoop/navigation/GenericCachePolicy;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Leb/x0;Ljava/util/List;Ljava/util/List;)Lj02/j0;", "b", "(Ljava/lang/String;)Leb/x0;", "Lj02/m0;", "navigationScreen", "provideNavigationData", "(Lj02/m0;)Lj02/j0;", "a", "Lj02/i0;", "Lad3/c;", "Lad3/c;", "getJson$annotations", "()V", "json", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30408c implements InterfaceC21151k0 {

    /* JADX INFO: renamed from: d */
    public static final int f124798d = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C21147i0 navDeepLinkRequestHelper;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final AbstractC0757c json;

    public C30408c(C21147i0 navDeepLinkRequestHelper) {
        AbstractC22676k.m65750j(navDeepLinkRequestHelper, "navDeepLinkRequestHelper");
        this.navDeepLinkRequestHelper = navDeepLinkRequestHelper;
        this.json = AbstractC34132o.m107878b(AbstractC34650k.m109496c(), new C30217a(4));
    }

    /* JADX INFO: renamed from: b */
    private final C12997x0 m92930b(String navigationStyle) {
        C12995w0 c12995w0 = new C12995w0();
        return AbstractC39421y.m125921F(navigationStyle, "PRESENT", true) ? AbstractC28152c1.m85186d(c12995w0).m36508a() : AbstractC28152c1.m85188f(c12995w0).m36508a();
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC21149j0 m92931c(String path, ApiRequest request, String selectedTab, GenericCachePolicy cachePolicy, String navigationStyle, ScreenAnalyticEventModel analyticEvents, MetricEventModel metricEvents, GenericInteraction onStartInteraction, C12997x0 navOptions, List<? extends JsonElement> loadingTopItems, List<? extends JsonElement> errorTopItems) {
        String strEncode;
        String strEncode2;
        String strEncode3;
        String strEncode4;
        String strEncode5;
        String strEncode6;
        String str = "";
        C26463f c26463f = new C26463f();
        try {
            AbstractC0757c abstractC0757c = this.json;
            abstractC0757c.getClass();
            strEncode = URLEncoder.encode(abstractC0757c.m1833d(ApiRequest.INSTANCE.serializer(), request), "UTF-8");
            AbstractC22676k.m65747g(strEncode);
        } catch (Exception unused) {
            strEncode = "";
        }
        c26463f.put("request", strEncode);
        if (selectedTab != null) {
        }
        if (cachePolicy != null) {
            try {
                AbstractC0757c abstractC0757c2 = this.json;
                abstractC0757c2.getClass();
                strEncode2 = URLEncoder.encode(abstractC0757c2.m1833d(GenericCachePolicy.INSTANCE.serializer(), cachePolicy), "UTF-8");
                AbstractC22676k.m65747g(strEncode2);
            } catch (Exception unused2) {
                strEncode2 = "";
            }
        }
        c26463f.put("navigationStyle", navigationStyle);
        if (analyticEvents != null) {
            try {
                AbstractC0757c abstractC0757c3 = this.json;
                abstractC0757c3.getClass();
                strEncode3 = URLEncoder.encode(abstractC0757c3.m1833d(ScreenAnalyticEventModel.INSTANCE.serializer(), analyticEvents), "UTF-8");
                AbstractC22676k.m65747g(strEncode3);
            } catch (Exception unused3) {
                strEncode3 = "";
            }
        }
        if (metricEvents != null) {
            try {
                AbstractC0757c abstractC0757c4 = this.json;
                abstractC0757c4.getClass();
                strEncode4 = URLEncoder.encode(abstractC0757c4.m1833d(MetricEventModel.INSTANCE.serializer(), metricEvents), "UTF-8");
                AbstractC22676k.m65747g(strEncode4);
            } catch (Exception unused4) {
                strEncode4 = "";
            }
        }
        if (onStartInteraction != null) {
            try {
                AbstractC0757c abstractC0757c5 = this.json;
                abstractC0757c5.getClass();
                strEncode5 = URLEncoder.encode(abstractC0757c5.m1833d(GenericInteraction.INSTANCE.serializer(), onStartInteraction), "UTF-8");
                AbstractC22676k.m65747g(strEncode5);
            } catch (Exception unused5) {
                strEncode5 = "";
            }
        }
        if (loadingTopItems != null) {
            try {
                AbstractC0757c abstractC0757c6 = this.json;
                abstractC0757c6.getClass();
                strEncode6 = URLEncoder.encode(abstractC0757c6.m1833d(new ArrayListSerializer(JsonElement.Companion.serializer()), loadingTopItems), "UTF-8");
                AbstractC22676k.m65747g(strEncode6);
            } catch (Exception unused6) {
                strEncode6 = "";
            }
        }
        if (errorTopItems != null) {
            try {
                AbstractC0757c abstractC0757c7 = this.json;
                abstractC0757c7.getClass();
                String strEncode7 = URLEncoder.encode(abstractC0757c7.m1833d(new ArrayListSerializer(JsonElement.Companion.serializer()), errorTopItems), "UTF-8");
                AbstractC22676k.m65747g(strEncode7);
                str = strEncode7;
            } catch (Exception unused7) {
            }
            c26463f.put("errorTopItems", str);
        }
        String string = AbstractC28219z.m85447b(path, c26463f.m78380b()).toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        return new InterfaceC21149j0.c(this.navDeepLinkRequestHelper.m58994a(string), navOptions == null ? m92930b(navigationStyle) : navOptions, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ InterfaceC21149j0 m92932d(C30408c c30408c, String str, ApiRequest apiRequest, String str2, GenericCachePolicy genericCachePolicy, String str3, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, GenericInteraction genericInteraction, C12997x0 c12997x0, List list, List list2, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            str2 = null;
        }
        if ((i13 & 128) != 0) {
            genericInteraction = null;
        }
        if ((i13 & 256) != 0) {
            c12997x0 = null;
        }
        if ((i13 & 512) != 0) {
            list = null;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            list2 = null;
        }
        return c30408c.m92931c(str, apiRequest, str2, genericCachePolicy, str3, screenAnalyticEventModel, metricEventModel, genericInteraction, c12997x0, list, list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final C23454a0 m92933e(C0764g Json) {
        AbstractC22676k.m65750j(Json, "$this$Json");
        Json.f2784k = null;
        return C23454a0.f92919a;
    }

    @Override // j02.InterfaceC21151k0
    public InterfaceC21149j0 provideNavigationData(AbstractC21155m0 navigationScreen) {
        AbstractC22676k.m65750j(navigationScreen, "navigationScreen");
        if (navigationScreen instanceof AbstractC21155m0.m1) {
            AbstractC21155m0.m1 m1Var = (AbstractC21155m0.m1) navigationScreen;
            return m92931c("/generic", m1Var.getRequest(), null, m1Var.getCachePolicy(), m1Var.getNavigationStyle(), m1Var.getAnalyticEvents(), m1Var.getMetricEvents(), m1Var.getOnStartInteraction(), m1Var.getNavOptions(), m1Var.m59201g(), m1Var.m59200f());
        }
        if (!(navigationScreen instanceof AbstractC21155m0.e5)) {
            return InterfaceC21149j0.d.f80241a;
        }
        AbstractC21155m0.e5 e5Var = (AbstractC21155m0.e5) navigationScreen;
        return m92932d(this, "/top-level-generic", e5Var.getRequest(), e5Var.getSelectedTab(), e5Var.getCachePolicy(), e5Var.getNavigationStyle(), e5Var.getAnalyticEvents(), e5Var.getMetricEvents(), e5Var.getOnStartInteraction(), e5Var.getNavOptions(), null, null, 1536, null);
    }

    public /* synthetic */ C30408c(C21147i0 c21147i0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C21147i0() : c21147i0);
    }
}
