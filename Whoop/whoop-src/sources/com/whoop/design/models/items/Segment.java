package com.whoop.design.models.items;

import ad3.AbstractC0770m;
import com.whoop.analytics.AnalyticEventModel;
import com.whoop.analytics.AnalyticEventModel$$serializer;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.whoopaction.domain.models.Action;
import com.whoop.whoopaction.domain.models.StateUpdateAction;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36962i;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import xc3.AbstractC38195a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0094\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u0015\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\r¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b-\u0010.J3\u0010/\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b/\u0010.J\u009d\u0001\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b2\u0010$J\u0010\u00103\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020 2\b\u00105\u001a\u0004\u0018\u00010\u001cHÖ\u0003¢\u0006\u0004\b6\u00107J'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bF\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010G\u001a\u0004\bH\u0010*R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010I\u001a\u0004\bJ\u0010,R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010.\"\u0004\bM\u0010NRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010K\u001a\u0004\bO\u0010.\"\u0004\bP\u0010N¨\u0006S"}, m65681d2 = {"Lcom/whoop/design/models/items/Segment;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "segmentControlTitle", "segmentControlSubtitle", "", "Lcom/whoop/design/models/DesignSystemModel;", "items", "Lcom/whoop/whoopaction/domain/models/Action;", "action", "Lcom/whoop/analytics/AnalyticEventModel;", "analyticEvent", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "", "matchesAccumulatedState", "(Ljava/util/Map;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/whoopaction/domain/models/Action;", "component6", "()Lcom/whoop/analytics/AnalyticEventModel;", "component7", "()Ljava/util/Map;", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/Segment;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/Segment;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getSegmentControlTitle", "getSegmentControlSubtitle", "Ljava/util/List;", "getItems", "Lcom/whoop/whoopaction/domain/models/Action;", "getAction", "Lcom/whoop/analytics/AnalyticEventModel;", "getAnalyticEvent", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class Segment implements WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private final Action action;
    private Map<String, AggregateBinding> aggregateBindings;
    private final AnalyticEventModel analyticEvent;
    private Map<String, String> bindings;
    private final String id;
    private final List<DesignSystemModel> items;
    private final String segmentControlSubtitle;
    private final String segmentControlTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/Segment$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/Segment;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return Segment$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36962i(27)), AbstractC30060g.m92087G(enumC23463i, new C36962i(28)), null, AbstractC30060g.m92087G(enumC23463i, new C36962i(29)), null};
    }

    public Segment() {
        this((String) null, (String) null, (String) null, (List) null, (Action) null, (AnalyticEventModel) null, (Map) null, (Map) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new C37136a(c22673i0.getOrCreateKotlinClass(Action.class), AbstractC38195a.m122336d(new C37140e(c22673i0.getOrCreateKotlinClass(Action.class), new Annotation[0])), new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Segment copy$default(Segment segment, String str, String str2, String str3, List list, Action action, AnalyticEventModel analyticEventModel, Map map, Map map2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = segment.id;
        }
        if ((i13 & 2) != 0) {
            str2 = segment.segmentControlTitle;
        }
        if ((i13 & 4) != 0) {
            str3 = segment.segmentControlSubtitle;
        }
        if ((i13 & 8) != 0) {
            list = segment.items;
        }
        if ((i13 & 16) != 0) {
            action = segment.action;
        }
        if ((i13 & 32) != 0) {
            analyticEventModel = segment.analyticEvent;
        }
        if ((i13 & 64) != 0) {
            map = segment.bindings;
        }
        if ((i13 & 128) != 0) {
            map2 = segment.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        Action action2 = action;
        AnalyticEventModel analyticEventModel2 = analyticEventModel;
        return segment.copy(str, str2, str3, list, action2, analyticEventModel2, map3, map4);
    }

    public static final /* synthetic */ void write$Self$design_models_release(Segment self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.segmentControlTitle, "")) {
            output.encodeStringElement(serialDesc, 1, self.segmentControlTitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.segmentControlSubtitle != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.segmentControlSubtitle);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.items, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.items);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.action != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.action);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.analyticEvent != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, AnalyticEventModel$$serializer.INSTANCE, self.analyticEvent);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        return SegmentStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSegmentControlTitle() {
        return this.segmentControlTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSegmentControlSubtitle() {
        return this.segmentControlSubtitle;
    }

    public final List<DesignSystemModel> component4() {
        return this.items;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    public final Map<String, String> component7() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component8() {
        return this.aggregateBindings;
    }

    public final Segment copy(String id4, String segmentControlTitle, String segmentControlSubtitle, List<? extends DesignSystemModel> items, Action action, AnalyticEventModel analyticEvent, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segmentControlTitle, "segmentControlTitle");
        AbstractC22676k.m65750j(items, "items");
        return new Segment(id4, segmentControlTitle, segmentControlSubtitle, items, action, analyticEvent, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Segment)) {
            return false;
        }
        Segment segment = (Segment) other;
        return AbstractC22676k.m65745e(this.id, segment.id) && AbstractC22676k.m65745e(this.segmentControlTitle, segment.segmentControlTitle) && AbstractC22676k.m65745e(this.segmentControlSubtitle, segment.segmentControlSubtitle) && AbstractC22676k.m65745e(this.items, segment.items) && AbstractC22676k.m65745e(this.action, segment.action) && AbstractC22676k.m65745e(this.analyticEvent, segment.analyticEvent) && AbstractC22676k.m65745e(this.bindings, segment.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, segment.aggregateBindings);
    }

    public final Action getAction() {
        return this.action;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    public final AnalyticEventModel getAnalyticEvent() {
        return this.analyticEvent;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final List<DesignSystemModel> getItems() {
        return this.items;
    }

    public final String getSegmentControlSubtitle() {
        return this.segmentControlSubtitle;
    }

    public final String getSegmentControlTitle() {
        return this.segmentControlTitle;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.segmentControlTitle);
        String str = this.segmentControlSubtitle;
        int iM31983b = AbstractC11895b.m31983b((iM30450d + (str == null ? 0 : str.hashCode())) * 31, 31, this.items);
        Action action = this.action;
        int iHashCode = (iM31983b + (action == null ? 0 : action.hashCode())) * 31;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        int iHashCode2 = (iHashCode + (analyticEventModel == null ? 0 : analyticEventModel.hashCode())) * 31;
        Map<String, String> map = this.bindings;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode3 + (map2 != null ? map2.hashCode() : 0);
    }

    public final boolean matchesAccumulatedState(Map<String, ? extends Object> accumulatedState) {
        Map<String, JsonElement> state;
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        Action action = this.action;
        StateUpdateAction stateUpdateAction = action instanceof StateUpdateAction ? (StateUpdateAction) action : null;
        if (stateUpdateAction == null || (state = stateUpdateAction.getState()) == null || state.isEmpty()) {
            return false;
        }
        for (Map.Entry<String, JsonElement> entry : state.entrySet()) {
            String key = entry.getKey();
            JsonElement value = entry.getValue();
            if (value instanceof JsonPrimitive) {
                String strM1844f = AbstractC0770m.m1844f((JsonPrimitive) value);
                Object obj = accumulatedState.get(key);
                if (AbstractC22676k.m65745e(strM1844f, obj != null ? obj.toString() : null)) {
                    return true;
                }
            }
        }
        return false;
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
        String str = this.id;
        String str2 = this.segmentControlTitle;
        String str3 = this.segmentControlSubtitle;
        List<DesignSystemModel> list = this.items;
        Action action = this.action;
        AnalyticEventModel analyticEventModel = this.analyticEvent;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Segment(id=", str, ", segmentControlTitle=", str2, ", segmentControlSubtitle=");
        AbstractC36095b.m114694v(str3, ", items=", ", action=", sbM32001t, list);
        sbM32001t.append(action);
        sbM32001t.append(", analyticEvent=");
        sbM32001t.append(analyticEventModel);
        sbM32001t.append(", bindings=");
        return AbstractC30802r.m94765n(sbM32001t, map, ", aggregateBindings=", map2, ")");
    }

    public /* synthetic */ Segment(int i13, String str, String str2, String str3, List list, Action action, AnalyticEventModel analyticEventModel, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.id = "";
        } else {
            this.id = str;
        }
        if ((i13 & 2) == 0) {
            this.segmentControlTitle = "";
        } else {
            this.segmentControlTitle = str2;
        }
        if ((i13 & 4) == 0) {
            this.segmentControlSubtitle = null;
        } else {
            this.segmentControlSubtitle = str3;
        }
        if ((i13 & 8) == 0) {
            this.items = C25271y.f99162w;
        } else {
            this.items = list;
        }
        if ((i13 & 16) == 0) {
            this.action = null;
        } else {
            this.action = action;
        }
        if ((i13 & 32) == 0) {
            this.analyticEvent = null;
        } else {
            this.analyticEvent = analyticEventModel;
        }
        if ((i13 & 64) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 128) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Segment(String id4, String segmentControlTitle, String str, List<? extends DesignSystemModel> items, Action action, AnalyticEventModel analyticEventModel, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segmentControlTitle, "segmentControlTitle");
        AbstractC22676k.m65750j(items, "items");
        this.id = id4;
        this.segmentControlTitle = segmentControlTitle;
        this.segmentControlSubtitle = str;
        this.items = items;
        this.action = action;
        this.analyticEvent = analyticEventModel;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ Segment(String str, String str2, String str3, List list, Action action, AnalyticEventModel analyticEventModel, Map map, Map map2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? "" : str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? C25271y.f99162w : list, (i13 & 16) != 0 ? null : action, (i13 & 32) != 0 ? null : analyticEventModel, (i13 & 64) != 0 ? null : map, (i13 & 128) != 0 ? null : map2);
    }
}
