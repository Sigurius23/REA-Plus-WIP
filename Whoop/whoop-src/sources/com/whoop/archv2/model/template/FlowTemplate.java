package com.whoop.archv2.model.template;

import c13.AbstractC3855a;
import cb1.C4387a;
import cj0.AbstractC4742d;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.ScreenAnalyticEventModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.design.models.modal.LifecycleInteractions;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.C25271y;
import m83.C25272z;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002IJBz\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bw\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0007H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0016\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003¢\u0006\u0004\b,\u0010-J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b0\u0010/J3\u00101\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0003¢\u0006\u0004\b1\u0010/J\u0085\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00072\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072+\b\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000fHÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b4\u0010+J\u0010\u00105\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010+R&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010=\u0012\u0004\b?\u0010@\u001a\u0004\b>\u0010-R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010/R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\n\u0010A\u001a\u0004\bC\u0010/\"\u0004\bD\u0010ERE\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\f¢\u0006\f\b\r\u0012\b\b\u000e\u0012\u0004\b\t0\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010A\u001a\u0004\bF\u0010/\"\u0004\bG\u0010E¨\u0006K"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowTemplate;", "Lcom/whoop/archv2/model/template/ScreenTemplate;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "flowId", "", "currentStepList", "", "Lcom/whoop/archv2/model/template/FlowStep;", "steps", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$arch_v2_release", "(Lcom/whoop/archv2/model/template/FlowTemplate;Lzc3/c;Lyc3/g;)V", "write$Self", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "Lcom/whoop/analytics/ScreenAnalyticEventModel;", "screenAnalytics", "Lcom/whoop/analytics/AnalyticEventModel;", "failureAnalyticEvent", "(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/util/Map;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getFlowId", "Ljava/util/List;", "getCurrentStepList", "getCurrentStepList$annotations", "()V", "Ljava/util/Map;", "getSteps", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "a", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FlowTemplate implements ScreenTemplate, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final List<String> currentStepList;
    private final String flowId;
    private final Map<String, FlowStep> steps;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: renamed from: com.whoop.archv2.model.template.FlowTemplate$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/archv2/model/template/FlowTemplate$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/archv2/model/template/FlowTemplate;", "serializer", "()Lwc3/c;", "arch-v2_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FlowTemplate$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C4387a(21)), AbstractC30060g.m92087G(enumC23463i, new C4387a(22)), AbstractC30060g.m92087G(enumC23463i, new C4387a(23)), null};
    }

    public /* synthetic */ FlowTemplate(int i13, String str, List list, Map map, Map map2, Map map3, SerializationConstructorMarker serializationConstructorMarker) {
        if (1 != (i13 & 1)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1, FlowTemplate$$serializer.INSTANCE.getDescriptor());
        }
        this.flowId = str;
        if ((i13 & 2) == 0) {
            this.currentStepList = C25271y.f99162w;
        } else {
            this.currentStepList = list;
        }
        if ((i13 & 4) == 0) {
            this.steps = C25272z.f99163w;
        } else {
            this.steps = map;
        }
        if ((i13 & 8) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map2;
        }
        if ((i13 & 16) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(StringSerializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new LinkedHashMapSerializer(StringSerializer.INSTANCE, FlowStep$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlowTemplate copy$default(FlowTemplate flowTemplate, String str, List list, Map map, Map map2, Map map3, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = flowTemplate.flowId;
        }
        if ((i13 & 2) != 0) {
            list = flowTemplate.currentStepList;
        }
        if ((i13 & 4) != 0) {
            map = flowTemplate.steps;
        }
        if ((i13 & 8) != 0) {
            map2 = flowTemplate.bindings;
        }
        if ((i13 & 16) != 0) {
            map3 = flowTemplate.aggregateBindings;
        }
        Map map4 = map3;
        Map map5 = map;
        return flowTemplate.copy(str, list, map5, map2, map4);
    }

    @InterfaceC37143h("current_step_list")
    public static /* synthetic */ void getCurrentStepList$annotations() {
    }

    public static final /* synthetic */ void write$Self$arch_v2_release(FlowTemplate self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.flowId);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.currentStepList, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.currentStepList);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.steps, C25272z.f99163w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.steps);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        if (accumulatedState.isEmpty()) {
            return this;
        }
        FlowTemplate flowTemplateM14895a = AbstractC4742d.m14895a(this, getBindings(), getAggregateBindings(), accumulatedState);
        Map<String, FlowStep> map = flowTemplateM14895a.steps;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            WithGeneratedBindings withGeneratedBindingsBind = ((FlowStep) entry.getValue()).bind(accumulatedState);
            AbstractC22676k.m65748h(withGeneratedBindingsBind, "null cannot be cast to non-null type com.whoop.archv2.model.template.FlowStep");
            linkedHashMap.put(key, (FlowStep) withGeneratedBindingsBind);
        }
        return copy$default(flowTemplateM14895a, null, null, linkedHashMap, null, null, 27, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getFlowId() {
        return this.flowId;
    }

    public final List<String> component2() {
        return this.currentStepList;
    }

    public final Map<String, FlowStep> component3() {
        return this.steps;
    }

    public final Map<String, String> component4() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component5() {
        return this.aggregateBindings;
    }

    public final FlowTemplate copy(String flowId, List<String> currentStepList, Map<String, FlowStep> steps, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(flowId, "flowId");
        AbstractC22676k.m65750j(currentStepList, "currentStepList");
        AbstractC22676k.m65750j(steps, "steps");
        return new FlowTemplate(flowId, currentStepList, steps, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowTemplate)) {
            return false;
        }
        FlowTemplate flowTemplate = (FlowTemplate) other;
        return AbstractC22676k.m65745e(this.flowId, flowTemplate.flowId) && AbstractC22676k.m65745e(this.currentStepList, flowTemplate.currentStepList) && AbstractC22676k.m65745e(this.steps, flowTemplate.steps) && AbstractC22676k.m65745e(this.bindings, flowTemplate.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, flowTemplate.aggregateBindings);
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public AnalyticEventModel failureAnalyticEvent(ScreenAnalyticEventModel screenAnalytics) {
        FlowStep flowStep;
        Map<String, AnalyticEventModel> analyticEvents;
        AbstractC22676k.m65750j(screenAnalytics, "screenAnalytics");
        String str = (String) AbstractC25265s.m74114R0(this.currentStepList);
        if (str == null || (flowStep = this.steps.get(str)) == null || (analyticEvents = flowStep.getAnalyticEvents()) == null) {
            return null;
        }
        return analyticEvents.get("step_failed");
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final List<String> getCurrentStepList() {
        return this.currentStepList;
    }

    public final String getFlowId() {
        return this.flowId;
    }

    @Override // com.whoop.archv2.model.template.ScreenTemplate
    public /* bridge */ LifecycleInteractions getLifecycleInteractions() {
        return super.getLifecycleInteractions();
    }

    public final Map<String, FlowStep> getSteps() {
        return this.steps;
    }

    public int hashCode() {
        int iM11821e = AbstractC3855a.m11821e(this.steps, AbstractC11895b.m31983b(this.flowId.hashCode() * 31, 31, this.currentStepList), 31);
        Map<String, String> map = this.bindings;
        int iHashCode = (iM11821e + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode + (map2 != null ? map2.hashCode() : 0);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setAggregateBindings(Map<String, AggregateBinding> map) {
        this.aggregateBindings = map;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public void setBindings(Map<String, String> map) {
        this.bindings = map;
    }

    public String toString() {
        String str = this.flowId;
        List<String> list = this.currentStepList;
        Map<String, FlowStep> map = this.steps;
        Map<String, String> map2 = this.bindings;
        Map<String, AggregateBinding> map3 = this.aggregateBindings;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("FlowTemplate(flowId=", str, ", currentStepList=", ", steps=", list);
        AbstractC3855a.m11840x(sbM94766o, map, ", bindings=", map2, ", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM94766o, map3, ")");
    }

    public FlowTemplate(String flowId, List<String> currentStepList, Map<String, FlowStep> steps, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(flowId, "flowId");
        AbstractC22676k.m65750j(currentStepList, "currentStepList");
        AbstractC22676k.m65750j(steps, "steps");
        this.flowId = flowId;
        this.currentStepList = currentStepList;
        this.steps = steps;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ FlowTemplate(String str, List list, Map map, Map map2, Map map3, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? C25272z.f99163w : map, (i13 & 8) != 0 ? null : map2, (i13 & 16) != 0 ? null : map3);
    }
}
