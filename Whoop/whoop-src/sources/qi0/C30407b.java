package qi0;

import ad3.AbstractC0757c;
import android.os.Bundle;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.navigation.CachePolicyModel;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.GenericInteraction;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j02.C21132b0;
import java.net.URLDecoder;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.json.JsonElement;
import l02.C23050a;
import or2.AbstractC28188o1;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;
import qr2.AbstractC30556a;
import xc3.AbstractC38195a;

/* JADX INFO: renamed from: qi0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010%¨\u0006&"}, m65681d2 = {"Lqi0/b;", "", "Ll02/a;", "queryParamDeserializer", "Lj02/b0;", "metricParser", "<init>", "(Ll02/a;Lj02/b0;)V", "Landroid/os/Bundle;", "arguments", "Lcom/whoop/navigation/models/ApiRequest;", "i", "(Landroid/os/Bundle;)Lcom/whoop/navigation/models/ApiRequest;", "Lcom/whoop/navigation/CachePolicyModel;", "c", "(Landroid/os/Bundle;)Lcom/whoop/navigation/CachePolicyModel;", "", "g", "(Landroid/os/Bundle;)Ljava/lang/String;", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "b", "(Landroid/os/Bundle;)Lcom/whoop/analytics/ScreenAnalyticEventModel;", "Lcom/whoop/analytics/MetricEventModel;", "f", "(Landroid/os/Bundle;)Lcom/whoop/analytics/MetricEventModel;", "Lcom/whoop/navigation/models/GenericInteraction;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Landroid/os/Bundle;)Lcom/whoop/navigation/models/GenericInteraction;", "", "Lkotlinx/serialization/json/JsonElement;", "e", "(Landroid/os/Bundle;)Ljava/util/List;", "d", "Lqi0/b$a;", "a", "(Landroid/os/Bundle;)Lqi0/b$a;", "Ll02/a;", "Lj02/b0;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30407b {

    /* JADX INFO: renamed from: c */
    public static final int f124786c = C21132b0.f80197c | C23050a.f90903c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C23050a queryParamDeserializer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C21132b0 metricParser;

    /* JADX INFO: renamed from: qi0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001d\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b'\u00101R\u001f\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b$\u00101¨\u00063"}, m65681d2 = {"Lqi0/b$a;", "", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "", "navigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "analyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "metricEvents", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "", "Lkotlinx/serialization/json/JsonElement;", "loadingTopItems", "errorTopItems", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/whoop/navigation/models/ApiRequest;", "g", "()Lcom/whoop/navigation/models/ApiRequest;", "b", "Lcom/whoop/navigation/CachePolicyModel;", "()Lcom/whoop/navigation/CachePolicyModel;", "c", "Ljava/lang/String;", "getNavigationStyle", "d", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "()Lcom/whoop/analytics/ScreenAnalyticEventModel;", "e", "Lcom/whoop/analytics/MetricEventModel;", "()Lcom/whoop/analytics/MetricEventModel;", "f", "Lcom/whoop/navigation/models/GenericInteraction;", "()Lcom/whoop/navigation/models/GenericInteraction;", "Ljava/util/List;", "()Ljava/util/List;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* data */ class a {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final ApiRequest request;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final CachePolicyModel cachePolicy;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final String navigationStyle;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final ScreenAnalyticEventModel analyticEvents;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final MetricEventModel metricEvents;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final GenericInteraction onStartInteraction;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        private final List<JsonElement> loadingTopItems;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final List<JsonElement> errorTopItems;

        /* JADX WARN: Multi-variable type inference failed */
        public a(ApiRequest apiRequest, CachePolicyModel cachePolicyModel, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, GenericInteraction genericInteraction, List<? extends JsonElement> list, List<? extends JsonElement> list2) {
            this.request = apiRequest;
            this.cachePolicy = cachePolicyModel;
            this.navigationStyle = str;
            this.analyticEvents = screenAnalyticEventModel;
            this.metricEvents = metricEventModel;
            this.onStartInteraction = genericInteraction;
            this.loadingTopItems = list;
            this.errorTopItems = list2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ScreenAnalyticEventModel getAnalyticEvents() {
            return this.analyticEvents;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final CachePolicyModel getCachePolicy() {
            return this.cachePolicy;
        }

        /* JADX INFO: renamed from: c */
        public final List<JsonElement> m92924c() {
            return this.errorTopItems;
        }

        /* JADX INFO: renamed from: d */
        public final List<JsonElement> m92925d() {
            return this.loadingTopItems;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final MetricEventModel getMetricEvents() {
            return this.metricEvents;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return AbstractC22676k.m65745e(this.request, aVar.request) && AbstractC22676k.m65745e(this.cachePolicy, aVar.cachePolicy) && AbstractC22676k.m65745e(this.navigationStyle, aVar.navigationStyle) && AbstractC22676k.m65745e(this.analyticEvents, aVar.analyticEvents) && AbstractC22676k.m65745e(this.metricEvents, aVar.metricEvents) && AbstractC22676k.m65745e(this.onStartInteraction, aVar.onStartInteraction) && AbstractC22676k.m65745e(this.loadingTopItems, aVar.loadingTopItems) && AbstractC22676k.m65745e(this.errorTopItems, aVar.errorTopItems);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final GenericInteraction getOnStartInteraction() {
            return this.onStartInteraction;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ApiRequest getRequest() {
            return this.request;
        }

        public int hashCode() {
            ApiRequest apiRequest = this.request;
            int iHashCode = (apiRequest == null ? 0 : apiRequest.hashCode()) * 31;
            CachePolicyModel cachePolicyModel = this.cachePolicy;
            int iHashCode2 = (iHashCode + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode())) * 31;
            String str = this.navigationStyle;
            int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
            int iHashCode4 = (iHashCode3 + (screenAnalyticEventModel == null ? 0 : screenAnalyticEventModel.hashCode())) * 31;
            MetricEventModel metricEventModel = this.metricEvents;
            int iHashCode5 = (iHashCode4 + (metricEventModel == null ? 0 : metricEventModel.hashCode())) * 31;
            GenericInteraction genericInteraction = this.onStartInteraction;
            int iHashCode6 = (iHashCode5 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
            List<JsonElement> list = this.loadingTopItems;
            int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
            List<JsonElement> list2 = this.errorTopItems;
            return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
        }

        public String toString() {
            ApiRequest apiRequest = this.request;
            CachePolicyModel cachePolicyModel = this.cachePolicy;
            String str = this.navigationStyle;
            ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
            MetricEventModel metricEventModel = this.metricEvents;
            GenericInteraction genericInteraction = this.onStartInteraction;
            List<JsonElement> list = this.loadingTopItems;
            List<JsonElement> list2 = this.errorTopItems;
            StringBuilder sb4 = new StringBuilder("GenericNavigationParameters(request=");
            sb4.append(apiRequest);
            sb4.append(", cachePolicy=");
            sb4.append(cachePolicyModel);
            sb4.append(", navigationStyle=");
            sb4.append(str);
            sb4.append(", analyticEvents=");
            sb4.append(screenAnalyticEventModel);
            sb4.append(", metricEvents=");
            sb4.append(metricEventModel);
            sb4.append(", onStartInteraction=");
            sb4.append(genericInteraction);
            sb4.append(", loadingTopItems=");
            return AbstractC30007c.m91843m(sb4, list, ", errorTopItems=", list2, ")");
        }
    }

    public C30407b(C23050a queryParamDeserializer, C21132b0 metricParser) {
        AbstractC22676k.m65750j(queryParamDeserializer, "queryParamDeserializer");
        AbstractC22676k.m65750j(metricParser, "metricParser");
        this.queryParamDeserializer = queryParamDeserializer;
        this.metricParser = metricParser;
    }

    /* JADX INFO: renamed from: a */
    public final a m92913a(Bundle arguments) {
        return new a(m92921i(arguments), m92915c(arguments), m92919g(arguments), m92914b(arguments), m92918f(arguments), m92920h(arguments), m92917e(arguments), m92916d(arguments));
    }

    /* JADX INFO: renamed from: b */
    public final ScreenAnalyticEventModel m92914b(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("analyticEvents")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(ScreenAnalyticEventModel.INSTANCE.serializer()), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(ScreenAnalyticEventModel.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (ScreenAnalyticEventModel) objM1831b;
    }

    /* JADX INFO: renamed from: c */
    public final CachePolicyModel m92915c(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("cachePolicy")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(CachePolicyModel.INSTANCE.serializer()), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(CachePolicyModel.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (CachePolicyModel) objM1831b;
    }

    /* JADX INFO: renamed from: d */
    public final List<JsonElement> m92916d(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("errorTopItems")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(new ArrayListSerializer(JsonElement.Companion.serializer())), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (List) objM1831b;
    }

    /* JADX INFO: renamed from: e */
    public final List<JsonElement> m92917e(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("loadingTopItems")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(new ArrayListSerializer(JsonElement.Companion.serializer())), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(List.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (List) objM1831b;
    }

    /* JADX INFO: renamed from: f */
    public final MetricEventModel m92918f(Bundle arguments) {
        return this.metricParser.m58967c(arguments);
    }

    /* JADX INFO: renamed from: g */
    public final String m92919g(Bundle arguments) {
        String string;
        String strM85315e;
        if (arguments == null || (string = arguments.getString("navigationStyle")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) {
            return null;
        }
        return URLDecoder.decode(strM85315e, "UTF-8");
    }

    /* JADX INFO: renamed from: h */
    public final GenericInteraction m92920h(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("onStartInteraction")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(GenericInteraction.INSTANCE.serializer()), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(GenericInteraction.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (GenericInteraction) objM1831b;
    }

    /* JADX INFO: renamed from: i */
    public final ApiRequest m92921i(Bundle arguments) {
        String string;
        String strM85315e;
        Object objM1831b = null;
        String strDecode = (arguments == null || (string = arguments.getString("request")) == null || (strM85315e = AbstractC28188o1.m85315e(string)) == null) ? null : URLDecoder.decode(strM85315e, "UTF-8");
        C23050a c23050a = this.queryParamDeserializer;
        if (strDecode != null) {
            try {
                if (strDecode.length() <= 0) {
                    strDecode = null;
                }
                if (strDecode != null) {
                    AbstractC0757c json = c23050a.getJson();
                    json.getClass();
                    objM1831b = json.m1831b(AbstractC38195a.m122336d(ApiRequest.INSTANCE.serializer()), strDecode);
                }
            } catch (Exception e5) {
                c23050a.getLogger().mo85230v(AbstractC11266d.m30461o("Failed to deserialize query param JSON to ", AbstractC22671h0.f89337a.getOrCreateKotlinClass(ApiRequest.class).getSimpleName()), e5, new AbstractC30556a.a[0]);
            }
        }
        return (ApiRequest) objM1831b;
    }
}
