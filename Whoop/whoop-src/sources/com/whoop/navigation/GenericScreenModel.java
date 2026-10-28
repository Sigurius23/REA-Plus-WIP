package com.whoop.navigation;

import ad3.C0771n;
import c13.AbstractC3855a;
import com.whoop.analytics.MetricEventModel;
import com.whoop.analytics.MetricEventModel$$serializer;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel$$serializer;
import com.whoop.navigation.models.ApiRequest;
import com.whoop.navigation.models.ApiRequest$$serializer;
import com.whoop.navigation.models.GenericInteraction;
import com.whoop.navigation.models.GenericInteraction$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j00.C21118u;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 P2\u00020\u0001:\u0002QRB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010*J\u0086\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010C\u001a\u0004\bD\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010G\u001a\u0004\bH\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010I\u001a\u0004\bJ\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010K\u001a\u0004\bL\u0010(R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010M\u001a\u0004\bN\u0010*R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bO\u0010*¨\u0006S"}, m65681d2 = {"Lcom/whoop/navigation/GenericScreenModel;", "Lcom/whoop/navigation/CommonNavigationScreenModel;", "Lcom/whoop/navigation/models/ApiRequest;", "request", "Lcom/whoop/navigation/CachePolicyModel;", "cachePolicy", "", "navigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "analyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "metricEvents", "Lcom/whoop/navigation/AiAction;", "aiAction", "Lcom/whoop/navigation/models/GenericInteraction;", "onStartInteraction", "", "Lkotlinx/serialization/json/JsonElement;", "loadingTopItems", "errorTopItems", "<init>", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/navigation/models/ApiRequest;", "component2", "()Lcom/whoop/navigation/CachePolicyModel;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/whoop/analytics/ScreenAnalyticEventModel;", "component5", "()Lcom/whoop/analytics/MetricEventModel;", "component6", "()Lcom/whoop/navigation/AiAction;", "component7", "()Lcom/whoop/navigation/models/GenericInteraction;", "component8", "()Ljava/util/List;", "component9", "copy", "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)Lcom/whoop/navigation/GenericScreenModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$navigation_release", "(Lcom/whoop/navigation/GenericScreenModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/navigation/models/ApiRequest;", "getRequest", "Lcom/whoop/navigation/CachePolicyModel;", "getCachePolicy", "Ljava/lang/String;", "getNavigationStyle", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "getAnalyticEvents", "Lcom/whoop/analytics/MetricEventModel;", "getMetricEvents", "Lcom/whoop/navigation/AiAction;", "getAiAction", "Lcom/whoop/navigation/models/GenericInteraction;", "getOnStartInteraction", "Ljava/util/List;", "getLoadingTopItems", "getErrorTopItems", "Companion", "$serializer", "a", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GenericScreenModel implements CommonNavigationScreenModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final AiAction aiAction;
    private final ScreenAnalyticEventModel analyticEvents;
    private final CachePolicyModel cachePolicy;
    private final List<JsonElement> errorTopItems;
    private final List<JsonElement> loadingTopItems;
    private final MetricEventModel metricEvents;
    private final String navigationStyle;
    private final GenericInteraction onStartInteraction;
    private final ApiRequest request;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.navigation.GenericScreenModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/navigation/GenericScreenModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/navigation/GenericScreenModel;", "serializer", "()Lwc3/c;", "navigation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GenericScreenModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21118u(21)), AbstractC30060g.m92087G(enumC23463i, new C21118u(22))};
    }

    public /* synthetic */ GenericScreenModel(int i13, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, List list, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, GenericScreenModel$$serializer.INSTANCE.getDescriptor());
        }
        this.request = apiRequest;
        if ((i13 & 2) == 0) {
            this.cachePolicy = null;
        } else {
            this.cachePolicy = cachePolicyModel;
        }
        if ((i13 & 4) == 0) {
            this.navigationStyle = null;
        } else {
            this.navigationStyle = str;
        }
        if ((i13 & 8) == 0) {
            this.analyticEvents = null;
        } else {
            this.analyticEvents = screenAnalyticEventModel;
        }
        if ((i13 & 16) == 0) {
            this.metricEvents = null;
        } else {
            this.metricEvents = metricEventModel;
        }
        if ((i13 & 32) == 0) {
            this.aiAction = null;
        } else {
            this.aiAction = aiAction;
        }
        if ((i13 & 64) == 0) {
            this.onStartInteraction = null;
        } else {
            this.onStartInteraction = genericInteraction;
        }
        if ((i13 & 128) == 0) {
            this.loadingTopItems = null;
        } else {
            this.loadingTopItems = list;
        }
        if ((i13 & 256) == 0) {
            this.errorTopItems = null;
        } else {
            this.errorTopItems = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(C0771n.f2806a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(C0771n.f2806a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GenericScreenModel copy$default(GenericScreenModel genericScreenModel, ApiRequest apiRequest, CachePolicyModel cachePolicyModel, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, List list, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            apiRequest = genericScreenModel.request;
        }
        if ((i13 & 2) != 0) {
            cachePolicyModel = genericScreenModel.cachePolicy;
        }
        if ((i13 & 4) != 0) {
            str = genericScreenModel.navigationStyle;
        }
        if ((i13 & 8) != 0) {
            screenAnalyticEventModel = genericScreenModel.analyticEvents;
        }
        if ((i13 & 16) != 0) {
            metricEventModel = genericScreenModel.metricEvents;
        }
        if ((i13 & 32) != 0) {
            aiAction = genericScreenModel.aiAction;
        }
        if ((i13 & 64) != 0) {
            genericInteraction = genericScreenModel.onStartInteraction;
        }
        if ((i13 & 128) != 0) {
            list = genericScreenModel.loadingTopItems;
        }
        if ((i13 & 256) != 0) {
            list2 = genericScreenModel.errorTopItems;
        }
        List list3 = list;
        List list4 = list2;
        AiAction aiAction2 = aiAction;
        GenericInteraction genericInteraction2 = genericInteraction;
        MetricEventModel metricEventModel2 = metricEventModel;
        String str2 = str;
        return genericScreenModel.copy(apiRequest, cachePolicyModel, str2, screenAnalyticEventModel, metricEventModel2, aiAction2, genericInteraction2, list3, list4);
    }

    public static final /* synthetic */ void write$Self$navigation_release(GenericScreenModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, ApiRequest$$serializer.INSTANCE, self.request);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.cachePolicy != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, CachePolicyModel$$serializer.INSTANCE, self.cachePolicy);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.navigationStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.navigationStyle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.analyticEvents != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, ScreenAnalyticEventModel$$serializer.INSTANCE, self.analyticEvents);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.metricEvents != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, MetricEventModel$$serializer.INSTANCE, self.metricEvents);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.aiAction != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, AiAction$$serializer.INSTANCE, self.aiAction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.onStartInteraction != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GenericInteraction$$serializer.INSTANCE, self.onStartInteraction);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.loadingTopItems != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.loadingTopItems);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 8) && self.errorTopItems == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.errorTopItems);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ApiRequest getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNavigationStyle() {
        return this.navigationStyle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ScreenAnalyticEventModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final MetricEventModel getMetricEvents() {
        return this.metricEvents;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AiAction getAiAction() {
        return this.aiAction;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GenericInteraction getOnStartInteraction() {
        return this.onStartInteraction;
    }

    public final List<JsonElement> component8() {
        return this.loadingTopItems;
    }

    public final List<JsonElement> component9() {
        return this.errorTopItems;
    }

    public final GenericScreenModel copy(ApiRequest request, CachePolicyModel cachePolicy, String navigationStyle, ScreenAnalyticEventModel analyticEvents, MetricEventModel metricEvents, AiAction aiAction, GenericInteraction onStartInteraction, List<? extends JsonElement> loadingTopItems, List<? extends JsonElement> errorTopItems) {
        AbstractC22676k.m65750j(request, "request");
        return new GenericScreenModel(request, cachePolicy, navigationStyle, analyticEvents, metricEvents, aiAction, onStartInteraction, loadingTopItems, errorTopItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GenericScreenModel)) {
            return false;
        }
        GenericScreenModel genericScreenModel = (GenericScreenModel) other;
        return AbstractC22676k.m65745e(this.request, genericScreenModel.request) && AbstractC22676k.m65745e(this.cachePolicy, genericScreenModel.cachePolicy) && AbstractC22676k.m65745e(this.navigationStyle, genericScreenModel.navigationStyle) && AbstractC22676k.m65745e(this.analyticEvents, genericScreenModel.analyticEvents) && AbstractC22676k.m65745e(this.metricEvents, genericScreenModel.metricEvents) && AbstractC22676k.m65745e(this.aiAction, genericScreenModel.aiAction) && AbstractC22676k.m65745e(this.onStartInteraction, genericScreenModel.onStartInteraction) && AbstractC22676k.m65745e(this.loadingTopItems, genericScreenModel.loadingTopItems) && AbstractC22676k.m65745e(this.errorTopItems, genericScreenModel.errorTopItems);
    }

    public final AiAction getAiAction() {
        return this.aiAction;
    }

    public final ScreenAnalyticEventModel getAnalyticEvents() {
        return this.analyticEvents;
    }

    public final CachePolicyModel getCachePolicy() {
        return this.cachePolicy;
    }

    public final List<JsonElement> getErrorTopItems() {
        return this.errorTopItems;
    }

    public final List<JsonElement> getLoadingTopItems() {
        return this.loadingTopItems;
    }

    public final MetricEventModel getMetricEvents() {
        return this.metricEvents;
    }

    public final String getNavigationStyle() {
        return this.navigationStyle;
    }

    public final GenericInteraction getOnStartInteraction() {
        return this.onStartInteraction;
    }

    public final ApiRequest getRequest() {
        return this.request;
    }

    public int hashCode() {
        int iHashCode = this.request.hashCode() * 31;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        int iHashCode2 = (iHashCode + (cachePolicyModel == null ? 0 : cachePolicyModel.hashCode())) * 31;
        String str = this.navigationStyle;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
        int iHashCode4 = (iHashCode3 + (screenAnalyticEventModel == null ? 0 : screenAnalyticEventModel.hashCode())) * 31;
        MetricEventModel metricEventModel = this.metricEvents;
        int iHashCode5 = (iHashCode4 + (metricEventModel == null ? 0 : metricEventModel.hashCode())) * 31;
        AiAction aiAction = this.aiAction;
        int iHashCode6 = (iHashCode5 + (aiAction == null ? 0 : aiAction.hashCode())) * 31;
        GenericInteraction genericInteraction = this.onStartInteraction;
        int iHashCode7 = (iHashCode6 + (genericInteraction == null ? 0 : genericInteraction.hashCode())) * 31;
        List<JsonElement> list = this.loadingTopItems;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<JsonElement> list2 = this.errorTopItems;
        return iHashCode8 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        ApiRequest apiRequest = this.request;
        CachePolicyModel cachePolicyModel = this.cachePolicy;
        String str = this.navigationStyle;
        ScreenAnalyticEventModel screenAnalyticEventModel = this.analyticEvents;
        MetricEventModel metricEventModel = this.metricEvents;
        AiAction aiAction = this.aiAction;
        GenericInteraction genericInteraction = this.onStartInteraction;
        List<JsonElement> list = this.loadingTopItems;
        List<JsonElement> list2 = this.errorTopItems;
        StringBuilder sb4 = new StringBuilder("GenericScreenModel(request=");
        sb4.append(apiRequest);
        sb4.append(", cachePolicy=");
        sb4.append(cachePolicyModel);
        sb4.append(", navigationStyle=");
        sb4.append(str);
        sb4.append(", analyticEvents=");
        sb4.append(screenAnalyticEventModel);
        sb4.append(", metricEvents=");
        sb4.append(metricEventModel);
        sb4.append(", aiAction=");
        sb4.append(aiAction);
        sb4.append(", onStartInteraction=");
        sb4.append(genericInteraction);
        sb4.append(", loadingTopItems=");
        sb4.append(list);
        sb4.append(", errorTopItems=");
        return AbstractC3855a.m11829m(sb4, list2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GenericScreenModel(ApiRequest request, CachePolicyModel cachePolicyModel, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, List<? extends JsonElement> list, List<? extends JsonElement> list2) {
        AbstractC22676k.m65750j(request, "request");
        this.request = request;
        this.cachePolicy = cachePolicyModel;
        this.navigationStyle = str;
        this.analyticEvents = screenAnalyticEventModel;
        this.metricEvents = metricEventModel;
        this.aiAction = aiAction;
        this.onStartInteraction = genericInteraction;
        this.loadingTopItems = list;
        this.errorTopItems = list2;
    }

    public /* synthetic */ GenericScreenModel(ApiRequest apiRequest, CachePolicyModel cachePolicyModel, String str, ScreenAnalyticEventModel screenAnalyticEventModel, MetricEventModel metricEventModel, AiAction aiAction, GenericInteraction genericInteraction, List list, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(apiRequest, (i13 & 2) != 0 ? null : cachePolicyModel, (i13 & 4) != 0 ? null : str, (i13 & 8) != 0 ? null : screenAnalyticEventModel, (i13 & 16) != 0 ? null : metricEventModel, (i13 & 32) != 0 ? null : aiAction, (i13 & 64) != 0 ? null : genericInteraction, (i13 & 128) != 0 ? null : list, (i13 & 256) != 0 ? null : list2);
    }
}
