package com.whoop.activation.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q41.C29968a;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-BA\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJP\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u001aR%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b+\u0010\u001cR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;", "", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "", "", "eventProperties", "experimentProperties", "<init>", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$activation_release", "(Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/util/List;", "component2", "()Ljava/util/Map;", "component3", "copy", "(Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getItems", "Ljava/util/Map;", "getEventProperties", "getExperimentProperties", "Companion", "$serializer", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ActivationFlowActivateResponse {
    private static final InterfaceC23462h[] $childSerializers;
    private final Map<String, String> eventProperties;
    private final Map<String, String> experimentProperties;
    private final List<DesignSystemModel> items;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;", "serializer", "()Lwc3/c;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ActivationFlowActivateResponse$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C29968a(8)), AbstractC30060g.m92087G(enumC23463i, new C29968a(9)), AbstractC30060g.m92087G(enumC23463i, new C29968a(10))};
    }

    public /* synthetic */ ActivationFlowActivateResponse(int i13, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, ActivationFlowActivateResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.items = list;
        this.eventProperties = map;
        this.experimentProperties = map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ActivationFlowActivateResponse copy$default(ActivationFlowActivateResponse activationFlowActivateResponse, List list, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = activationFlowActivateResponse.items;
        }
        if ((i13 & 2) != 0) {
            map = activationFlowActivateResponse.eventProperties;
        }
        if ((i13 & 4) != 0) {
            map2 = activationFlowActivateResponse.experimentProperties;
        }
        return activationFlowActivateResponse.copy(list, map, map2);
    }

    public static final /* synthetic */ void write$Self$activation_release(ActivationFlowActivateResponse self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.items);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.eventProperties);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.experimentProperties);
    }

    public final List<DesignSystemModel> component1() {
        return this.items;
    }

    public final Map<String, String> component2() {
        return this.eventProperties;
    }

    public final Map<String, String> component3() {
        return this.experimentProperties;
    }

    public final ActivationFlowActivateResponse copy(List<? extends DesignSystemModel> items, Map<String, String> eventProperties, Map<String, String> experimentProperties) {
        AbstractC22676k.m65750j(items, "items");
        return new ActivationFlowActivateResponse(items, eventProperties, experimentProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActivationFlowActivateResponse)) {
            return false;
        }
        ActivationFlowActivateResponse activationFlowActivateResponse = (ActivationFlowActivateResponse) other;
        return AbstractC22676k.m65745e(this.items, activationFlowActivateResponse.items) && AbstractC22676k.m65745e(this.eventProperties, activationFlowActivateResponse.eventProperties) && AbstractC22676k.m65745e(this.experimentProperties, activationFlowActivateResponse.experimentProperties);
    }

    public final Map<String, String> getEventProperties() {
        return this.eventProperties;
    }

    public final Map<String, String> getExperimentProperties() {
        return this.experimentProperties;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        Map<String, String> map = this.eventProperties;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.experimentProperties;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
    }

    public String toString() {
        List<DesignSystemModel> list = this.items;
        Map<String, String> map = this.eventProperties;
        Map<String, String> map2 = this.experimentProperties;
        StringBuilder sb4 = new StringBuilder("ActivationFlowActivateResponse(items=");
        sb4.append(list);
        sb4.append(", eventProperties=");
        sb4.append(map);
        sb4.append(", experimentProperties=");
        return AbstractC13673n.m38565l(sb4, map2, ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivationFlowActivateResponse(List<? extends DesignSystemModel> items, Map<String, String> map, Map<String, String> map2) {
        AbstractC22676k.m65750j(items, "items");
        this.items = items;
        this.eventProperties = map;
        this.experimentProperties = map2;
    }
}
