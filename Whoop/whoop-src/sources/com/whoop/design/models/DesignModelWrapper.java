package com.whoop.design.models;

import c13.AbstractC3855a;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.lang.annotation.Annotation;
import java.util.Map;
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
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002IHBx\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010\u0011B[\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ#\u0010\"\u001a\u00020\u00002\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u0006H\u0016¢\u0006\u0004\b\"\u0010#J+\u0010'\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00012\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 0\u0006H\u0000¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020\u0001HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b,\u0010-J3\u0010.\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\rHÆ\u0003¢\u0006\u0004\b.\u0010-J\u001e\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u0010-J\u0083\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062+\b\u0002\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00108\u001a\u0002072\b\u00106\u001a\u0004\u0018\u00010 HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010)R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010+R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010-\"\u0004\b@\u0010ARE\u0010\u000e\u001a%\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006j\u0004\u0018\u0001`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010>\u001a\u0004\bB\u0010-\"\u0004\bC\u0010AR6\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u000f\u0010>\u0012\u0004\bF\u0010G\u001a\u0004\bD\u0010-\"\u0004\bE\u0010A¨\u0006J"}, m65681d2 = {"Lcom/whoop/design/models/DesignModelWrapper;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "model", "Lcom/whoop/analytics/AnalyticEventModel;", "primaryAnalyticEvent", "", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "primaryAnalyticEventBindings", "<init>", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/DesignModelWrapper;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/DesignModelWrapper;", "updatedModel", "rewrap$design_models_release", "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignModelWrapper;", "rewrap", "component1", "()Lcom/whoop/design/models/DesignSystemModel;", "component2", "()Lcom/whoop/analytics/AnalyticEventModel;", "component3", "()Ljava/util/Map;", "component4", "component5", "copy", "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/DesignModelWrapper;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/DesignSystemModel;", "getModel", "Lcom/whoop/analytics/AnalyticEventModel;", "getPrimaryAnalyticEvent", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "getPrimaryAnalyticEventBindings", "setPrimaryAnalyticEventBindings", "getPrimaryAnalyticEventBindings$annotations", "()V", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class DesignModelWrapper implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final DesignSystemModel model;
    private final AnalyticEventModel primaryAnalyticEvent;
    private Map<String, String> primaryAnalyticEventBindings;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/DesignModelWrapper$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/DesignModelWrapper;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return DesignModelWrapper$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C6909a(0)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(1)), null};
    }

    public /* synthetic */ DesignModelWrapper(int i13, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, DesignModelWrapper$$serializer.INSTANCE.getDescriptor());
        }
        this.model = designSystemModel;
        if ((i13 & 2) == 0) {
            this.primaryAnalyticEvent = null;
        } else {
            this.primaryAnalyticEvent = analyticEventModel;
        }
        if ((i13 & 4) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 8) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
        this.primaryAnalyticEventBindings = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DesignModelWrapper copy$default(DesignModelWrapper designModelWrapper, DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            designSystemModel = designModelWrapper.model;
        }
        if ((i13 & 2) != 0) {
            analyticEventModel = designModelWrapper.primaryAnalyticEvent;
        }
        if ((i13 & 4) != 0) {
            map = designModelWrapper.bindings;
        }
        if ((i13 & 8) != 0) {
            map2 = designModelWrapper.aggregateBindings;
        }
        if ((i13 & 16) != 0) {
            map3 = designModelWrapper.primaryAnalyticEventBindings;
        }
        Map map4 = map3;
        Map map5 = map;
        return designModelWrapper.copy(designSystemModel, analyticEventModel, map5, map2, map4);
    }

    public static /* synthetic */ void getPrimaryAnalyticEventBindings$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(DesignModelWrapper self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.model);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.primaryAnalyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, AnalyticEventModel$$serializer.INSTANCE, self.primaryAnalyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public /* bridge */ /* synthetic */ WithGeneratedBindings bind(Map map) {
        return bind((Map<String, ? extends Object>) map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DesignSystemModel getModel() {
        return this.model;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    public final Map<String, String> component3() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component4() {
        return this.aggregateBindings;
    }

    public final Map<String, String> component5() {
        return this.primaryAnalyticEventBindings;
    }

    public final DesignModelWrapper copy(DesignSystemModel model, AnalyticEventModel primaryAnalyticEvent, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings, Map<String, String> primaryAnalyticEventBindings) {
        AbstractC22676k.m65750j(model, "model");
        return new DesignModelWrapper(model, primaryAnalyticEvent, bindings, aggregateBindings, primaryAnalyticEventBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DesignModelWrapper)) {
            return false;
        }
        DesignModelWrapper designModelWrapper = (DesignModelWrapper) other;
        return AbstractC22676k.m65745e(this.model, designModelWrapper.model) && AbstractC22676k.m65745e(this.primaryAnalyticEvent, designModelWrapper.primaryAnalyticEvent) && AbstractC22676k.m65745e(this.bindings, designModelWrapper.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, designModelWrapper.aggregateBindings) && AbstractC22676k.m65745e(this.primaryAnalyticEventBindings, designModelWrapper.primaryAnalyticEventBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final DesignSystemModel getModel() {
        return this.model;
    }

    public final AnalyticEventModel getPrimaryAnalyticEvent() {
        return this.primaryAnalyticEvent;
    }

    public final Map<String, String> getPrimaryAnalyticEventBindings() {
        return this.primaryAnalyticEventBindings;
    }

    public int hashCode() {
        int iHashCode = this.model.hashCode() * 31;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        int iHashCode2 = (iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        int iHashCode4 = (iHashCode3 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, String> map3 = this.primaryAnalyticEventBindings;
        return iHashCode4 + (map3 != null ? map3.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001d  */
    public final DesignModelWrapper rewrap$design_models_release(DesignSystemModel updatedModel, Map<String, ? extends Object> accumulatedState) {
        AnalyticEventModel analyticEventModelApplyBindings;
        AbstractC22676k.m65750j(updatedModel, "updatedModel");
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        Map<String, String> map = this.primaryAnalyticEventBindings;
        if (map == null) {
            analyticEventModelApplyBindings = this.primaryAnalyticEvent;
        } else {
            AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
            analyticEventModelApplyBindings = analyticEventModel != null ? DesignModelWrapperKt.applyBindings(analyticEventModel, map, accumulatedState) : null;
            if (analyticEventModelApplyBindings == null) {
                analyticEventModelApplyBindings = this.primaryAnalyticEvent;
            }
        }
        return copy$default(this, updatedModel, analyticEventModelApplyBindings, null, null, null, 28, null);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public final void setPrimaryAnalyticEventBindings(Map<String, String> map) {
        this.primaryAnalyticEventBindings = map;
    }

    public String toString() {
        DesignSystemModel designSystemModel = this.model;
        AnalyticEventModel analyticEventModel = this.primaryAnalyticEvent;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        Map<String, String> map3 = this.primaryAnalyticEventBindings;
        StringBuilder sb4 = new StringBuilder("DesignModelWrapper(model=");
        sb4.append(designSystemModel);
        sb4.append(", primaryAnalyticEvent=");
        sb4.append(analyticEventModel);
        sb4.append(", bindings=");
        AbstractC3855a.m11840x(sb4, map, ", aggregateBindings=", map2, ", primaryAnalyticEventBindings=");
        return AbstractC13673n.m38565l(sb4, map3, ")");
    }

    public DesignModelWrapper(DesignSystemModel model, AnalyticEventModel analyticEventModel, Map<String, String> map, Map<String, AggregateBinding> map2, Map<String, String> map3) {
        AbstractC22676k.m65750j(model, "model");
        this.model = model;
        this.primaryAnalyticEvent = analyticEventModel;
        this.bindings = map;
        this.aggregateBindings = map2;
        this.primaryAnalyticEventBindings = map3;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public DesignModelWrapper bind(Map<String, ? extends Object> accumulatedState) {
        AnalyticEventModel analyticEventModel;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        DesignModelWrapper designModelWrapperGeneratedBind = DesignModelWrapperStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        Map<String, String> map = this.primaryAnalyticEventBindings;
        AnalyticEventModel analyticEventModelApplyBindings = null;
        if (map != null && (analyticEventModel = designModelWrapperGeneratedBind.primaryAnalyticEvent) != null) {
            analyticEventModelApplyBindings = DesignModelWrapperKt.applyBindings(analyticEventModel, map, accumulatedState);
        }
        AnalyticEventModel analyticEventModel2 = analyticEventModelApplyBindings;
        return analyticEventModel2 != null ? copy$default(designModelWrapperGeneratedBind, null, analyticEventModel2, null, null, null, 29, null) : designModelWrapperGeneratedBind;
    }

    public /* synthetic */ DesignModelWrapper(DesignSystemModel designSystemModel, AnalyticEventModel analyticEventModel, Map map, Map map2, Map map3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(designSystemModel, (i13 & 2) != 0 ? null : analyticEventModel, (i13 & 4) != 0 ? null : map, (i13 & 8) != 0 ? null : map2, (i13 & 16) != 0 ? null : map3);
    }
}
