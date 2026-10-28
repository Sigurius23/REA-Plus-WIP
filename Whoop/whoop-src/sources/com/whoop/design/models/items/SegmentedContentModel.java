package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.WithGeneratedBindings;
import com.whoop.design.models.binding.AggregateBinding;
import com.whoop.design.models.binding.LenientAggregateBindingsSerializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0002MLB\u0086\u0001\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013¢\u0006\u0004\b\u0015\u0010\u0016B{\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0006\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ#\u0010\u001d\u001a\u00020\u00022\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001b0\rH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0016\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u001e\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b(\u0010)J3\u0010*\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0003¢\u0006\u0004\b*\u0010)J\u008f\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2+\b\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u0013HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b-\u0010 J\u0010\u0010.\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b.\u0010#J\u001a\u00100\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b0\u00101J'\u0010:\u001a\u0002072\u0006\u00102\u001a\u00020\u00002\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0001¢\u0006\u0004\b8\u00109R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010;\u001a\u0004\b<\u0010 R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b=\u0010 R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010>\u0012\u0004\b@\u0010A\u001a\u0004\b?\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010B\u001a\u0004\bC\u0010%R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bE\u0010'R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010)\"\u0004\bH\u0010IRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\t0\u00138\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010F\u001a\u0004\bJ\u0010)\"\u0004\bK\u0010I¨\u0006N"}, m65681d2 = {"Lcom/whoop/design/models/items/SegmentedContentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/WithGeneratedBindings;", "", "id", "title", "", "initiallySelectedSegmentIndex", "", "transparentBackground", "", "Lcom/whoop/design/models/items/Segment;", "segments", "", "bindings", "Lcom/whoop/design/models/binding/AggregateBinding;", "Lcom/whoop/design/models/binding/AggregateBindings;", "Lwc3/i;", "with", "Lj93/d;", "aggregateBindings", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "", "accumulatedState", "bind", "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Z", "component5", "()Ljava/util/List;", "component6", "()Ljava/util/Map;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;IZLjava/util/List;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/SegmentedContentModel;", "toString", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/SegmentedContentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getId", "getTitle", "I", "getInitiallySelectedSegmentIndex", "getInitiallySelectedSegmentIndex$annotations", "()V", "Z", "getTransparentBackground", "Ljava/util/List;", "getSegments", "Ljava/util/Map;", "getBindings", "setBindings", "(Ljava/util/Map;)V", "getAggregateBindings", "setAggregateBindings", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SegmentedContentModel implements DesignSystemModel, WithGeneratedBindings {
    private static final InterfaceC23462h[] $childSerializers;
    private Map<String, AggregateBinding> aggregateBindings;
    private Map<String, String> bindings;
    private final String id;
    private final int initiallySelectedSegmentIndex;
    private final List<Segment> segments;
    private final String title;
    private final boolean transparentBackground;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/SegmentedContentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/SegmentedContentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SegmentedContentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(1)), AbstractC30060g.m92087G(enumC23463i, new C36963j(2)), null};
    }

    public SegmentedContentModel() {
        this((String) null, (String) null, 0, false, (List) null, (Map) null, (Map) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(Segment$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        return new LinkedHashMapSerializer(stringSerializer, stringSerializer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SegmentedContentModel copy$default(SegmentedContentModel segmentedContentModel, String str, String str2, int i13, boolean z4, List list, Map map, Map map2, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            str = segmentedContentModel.id;
        }
        if ((i14 & 2) != 0) {
            str2 = segmentedContentModel.title;
        }
        if ((i14 & 4) != 0) {
            i13 = segmentedContentModel.initiallySelectedSegmentIndex;
        }
        if ((i14 & 8) != 0) {
            z4 = segmentedContentModel.transparentBackground;
        }
        if ((i14 & 16) != 0) {
            list = segmentedContentModel.segments;
        }
        if ((i14 & 32) != 0) {
            map = segmentedContentModel.bindings;
        }
        if ((i14 & 64) != 0) {
            map2 = segmentedContentModel.aggregateBindings;
        }
        Map map3 = map;
        Map map4 = map2;
        List list2 = list;
        int i15 = i13;
        return segmentedContentModel.copy(str, str2, i15, z4, list2, map3, map4);
    }

    @InterfaceC37143h("initially_selected_segment_index")
    public static /* synthetic */ void getInitiallySelectedSegmentIndex$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(SegmentedContentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.id, "")) {
            output.encodeStringElement(serialDesc, 0, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.title != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.title);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.initiallySelectedSegmentIndex != 0) {
            output.encodeIntElement(serialDesc, 2, self.initiallySelectedSegmentIndex);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.transparentBackground) {
            output.encodeBooleanElement(serialDesc, 3, self.transparentBackground);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || !AbstractC22676k.m65745e(self.segments, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.segments);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.getBindings() != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.getBindings());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.getAggregateBindings() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, LenientAggregateBindingsSerializer.INSTANCE, self.getAggregateBindings());
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public WithGeneratedBindings bind(Map<String, ? extends Object> accumulatedState) {
        AbstractC22676k.m65750j(accumulatedState, "accumulatedState");
        SegmentedContentModel segmentedContentModelGeneratedBind = SegmentedContentModelStateBindingKt.generatedBind(this, getBindings(), getAggregateBindings(), accumulatedState);
        AbstractC22676k.m65748h(segmentedContentModelGeneratedBind, "null cannot be cast to non-null type com.whoop.design.models.items.SegmentedContentModel");
        if (!accumulatedState.isEmpty() && segmentedContentModelGeneratedBind.segments.size() > 1) {
            Iterator<Segment> it = segmentedContentModelGeneratedBind.segments.iterator();
            int i13 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i13 = -1;
                    break;
                }
                if (it.next().matchesAccumulatedState(accumulatedState)) {
                    break;
                }
                i13++;
            }
            int i14 = i13;
            if (i14 >= 0) {
                return copy$default(segmentedContentModelGeneratedBind, null, null, i14, false, null, null, null, 123, null);
            }
        }
        return segmentedContentModelGeneratedBind;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getInitiallySelectedSegmentIndex() {
        return this.initiallySelectedSegmentIndex;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    public final List<Segment> component5() {
        return this.segments;
    }

    public final Map<String, String> component6() {
        return this.bindings;
    }

    public final Map<String, AggregateBinding> component7() {
        return this.aggregateBindings;
    }

    public final SegmentedContentModel copy(String id4, String title, int initiallySelectedSegmentIndex, boolean transparentBackground, List<Segment> segments, Map<String, String> bindings, Map<String, AggregateBinding> aggregateBindings) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segments, "segments");
        return new SegmentedContentModel(id4, title, initiallySelectedSegmentIndex, transparentBackground, segments, bindings, aggregateBindings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SegmentedContentModel)) {
            return false;
        }
        SegmentedContentModel segmentedContentModel = (SegmentedContentModel) other;
        return AbstractC22676k.m65745e(this.id, segmentedContentModel.id) && AbstractC22676k.m65745e(this.title, segmentedContentModel.title) && this.initiallySelectedSegmentIndex == segmentedContentModel.initiallySelectedSegmentIndex && this.transparentBackground == segmentedContentModel.transparentBackground && AbstractC22676k.m65745e(this.segments, segmentedContentModel.segments) && AbstractC22676k.m65745e(this.bindings, segmentedContentModel.bindings) && AbstractC22676k.m65745e(this.aggregateBindings, segmentedContentModel.aggregateBindings);
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, AggregateBinding> getAggregateBindings() {
        return this.aggregateBindings;
    }

    @Override // com.whoop.design.models.WithGeneratedBindings
    public Map<String, String> getBindings() {
        return this.bindings;
    }

    public final String getId() {
        return this.id;
    }

    public final int getInitiallySelectedSegmentIndex() {
        return this.initiallySelectedSegmentIndex;
    }

    public final List<Segment> getSegments() {
        return this.segments;
    }

    public final String getTitle() {
        return this.title;
    }

    public final boolean getTransparentBackground() {
        return this.transparentBackground;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        String str = this.title;
        int iM31983b = AbstractC11895b.m31983b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.initiallySelectedSegmentIndex, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.transparentBackground), 31, this.segments);
        Map<String, String> map = this.bindings;
        int iHashCode2 = (iM31983b + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        return iHashCode2 + (map2 != null ? map2.hashCode() : 0);
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
        String str2 = this.title;
        int i13 = this.initiallySelectedSegmentIndex;
        boolean z4 = this.transparentBackground;
        List<Segment> list = this.segments;
        Map<String, String> map = this.bindings;
        Map<String, AggregateBinding> map2 = this.aggregateBindings;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("SegmentedContentModel(id=", str, ", title=", str2, ", initiallySelectedSegmentIndex=");
        AbstractC13673n.m38573t(i13, ", transparentBackground=", ", segments=", sbM32001t, z4);
        sbM32001t.append(list);
        sbM32001t.append(", bindings=");
        sbM32001t.append(map);
        sbM32001t.append(", aggregateBindings=");
        return AbstractC13673n.m38565l(sbM32001t, map2, ")");
    }

    public /* synthetic */ SegmentedContentModel(int i13, String str, String str2, int i14, boolean z4, List list, Map map, Map map2, SerializationConstructorMarker serializationConstructorMarker) {
        this.id = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.title = null;
        } else {
            this.title = str2;
        }
        if ((i13 & 4) == 0) {
            this.initiallySelectedSegmentIndex = 0;
        } else {
            this.initiallySelectedSegmentIndex = i14;
        }
        if ((i13 & 8) == 0) {
            this.transparentBackground = false;
        } else {
            this.transparentBackground = z4;
        }
        if ((i13 & 16) == 0) {
            this.segments = C25271y.f99162w;
        } else {
            this.segments = list;
        }
        if ((i13 & 32) == 0) {
            this.bindings = null;
        } else {
            this.bindings = map;
        }
        if ((i13 & 64) == 0) {
            this.aggregateBindings = null;
        } else {
            this.aggregateBindings = map2;
        }
    }

    public SegmentedContentModel(String id4, String str, int i13, boolean z4, List<Segment> segments, Map<String, String> map, Map<String, AggregateBinding> map2) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(segments, "segments");
        this.id = id4;
        this.title = str;
        this.initiallySelectedSegmentIndex = i13;
        this.transparentBackground = z4;
        this.segments = segments;
        this.bindings = map;
        this.aggregateBindings = map2;
    }

    public /* synthetic */ SegmentedContentModel(String str, String str2, int i13, boolean z4, List list, Map map, Map map2, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? "" : str, (i14 & 2) != 0 ? null : str2, (i14 & 4) != 0 ? 0 : i13, (i14 & 8) != 0 ? false : z4, (i14 & 16) != 0 ? C25271y.f99162w : list, (i14 & 32) != 0 ? null : map, (i14 & 64) != 0 ? null : map2);
    }
}
