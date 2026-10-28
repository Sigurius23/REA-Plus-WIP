package com.whoop.design.models.items;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B-\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tB=\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ6\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/design/models/items/BarGraph;", "", "", "graphFillPercentage", "", "Lcom/whoop/design/models/items/RangeModal;", "timeBoundRanges", "graphRangeEndpoints", "<init>", "(FLjava/util/List;Lcom/whoop/design/models/items/RangeModal;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLjava/util/List;Lcom/whoop/design/models/items/RangeModal;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BarGraph;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/RangeModal;", "copy", "(FLjava/util/List;Lcom/whoop/design/models/items/RangeModal;)Lcom/whoop/design/models/items/BarGraph;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getGraphFillPercentage", "Ljava/util/List;", "getTimeBoundRanges", "Lcom/whoop/design/models/items/RangeModal;", "getGraphRangeEndpoints", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarGraph {
    private final float graphFillPercentage;
    private final RangeModal graphRangeEndpoints;
    private final List<RangeModal> timeBoundRanges;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36954a(5)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BarGraph$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BarGraph;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarGraph$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BarGraph() {
        this(0.0f, (List) null, (RangeModal) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(RangeModal$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarGraph copy$default(BarGraph barGraph, float f13, List list, RangeModal rangeModal, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = barGraph.graphFillPercentage;
        }
        if ((i13 & 2) != 0) {
            list = barGraph.timeBoundRanges;
        }
        if ((i13 & 4) != 0) {
            rangeModal = barGraph.graphRangeEndpoints;
        }
        return barGraph.copy(f13, list, rangeModal);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarGraph self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Float.compare(self.graphFillPercentage, 0.0f) != 0) {
            output.encodeFloatElement(serialDesc, 0, self.graphFillPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.timeBoundRanges, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.timeBoundRanges);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.graphRangeEndpoints == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, RangeModal$$serializer.INSTANCE, self.graphRangeEndpoints);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getGraphFillPercentage() {
        return this.graphFillPercentage;
    }

    public final List<RangeModal> component2() {
        return this.timeBoundRanges;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final RangeModal getGraphRangeEndpoints() {
        return this.graphRangeEndpoints;
    }

    public final BarGraph copy(float graphFillPercentage, List<RangeModal> timeBoundRanges, RangeModal graphRangeEndpoints) {
        AbstractC22676k.m65750j(timeBoundRanges, "timeBoundRanges");
        return new BarGraph(graphFillPercentage, timeBoundRanges, graphRangeEndpoints);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarGraph)) {
            return false;
        }
        BarGraph barGraph = (BarGraph) other;
        return Float.compare(this.graphFillPercentage, barGraph.graphFillPercentage) == 0 && AbstractC22676k.m65745e(this.timeBoundRanges, barGraph.timeBoundRanges) && AbstractC22676k.m65745e(this.graphRangeEndpoints, barGraph.graphRangeEndpoints);
    }

    public final float getGraphFillPercentage() {
        return this.graphFillPercentage;
    }

    public final RangeModal getGraphRangeEndpoints() {
        return this.graphRangeEndpoints;
    }

    public final List<RangeModal> getTimeBoundRanges() {
        return this.timeBoundRanges;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(Float.hashCode(this.graphFillPercentage) * 31, 31, this.timeBoundRanges);
        RangeModal rangeModal = this.graphRangeEndpoints;
        return iM31983b + (rangeModal == null ? 0 : rangeModal.hashCode());
    }

    public String toString() {
        return "BarGraph(graphFillPercentage=" + this.graphFillPercentage + ", timeBoundRanges=" + this.timeBoundRanges + ", graphRangeEndpoints=" + this.graphRangeEndpoints + ")";
    }

    public BarGraph(float f13, List<RangeModal> timeBoundRanges, RangeModal rangeModal) {
        AbstractC22676k.m65750j(timeBoundRanges, "timeBoundRanges");
        this.graphFillPercentage = f13;
        this.timeBoundRanges = timeBoundRanges;
        this.graphRangeEndpoints = rangeModal;
    }

    public /* synthetic */ BarGraph(int i13, float f13, List list, RangeModal rangeModal, SerializationConstructorMarker serializationConstructorMarker) {
        this.graphFillPercentage = (i13 & 1) == 0 ? 0.0f : f13;
        if ((i13 & 2) == 0) {
            this.timeBoundRanges = C25271y.f99162w;
        } else {
            this.timeBoundRanges = list;
        }
        if ((i13 & 4) == 0) {
            this.graphRangeEndpoints = null;
        } else {
            this.graphRangeEndpoints = rangeModal;
        }
    }

    public /* synthetic */ BarGraph(float f13, List list, RangeModal rangeModal, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0f : f13, (i13 & 2) != 0 ? C25271y.f99162w : list, (i13 & 4) != 0 ? null : rangeModal);
    }
}
