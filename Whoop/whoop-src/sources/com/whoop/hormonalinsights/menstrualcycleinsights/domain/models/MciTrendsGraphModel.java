package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import qo1.C30526a;
import te0.AbstractC33745d;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B+\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ8\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001e¨\u00062"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "Lcom/whoop/navigation/e;", "destination", "<init>", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/navigation/e;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/navigation/e;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/navigation/e;", "copy", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/navigation/e;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Ljava/util/List;", "getGraphLegends", "Lcom/whoop/navigation/e;", "getDestination", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciTrendsGraphModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final C9598e destination;
    private final GraphModel graph;
    private final List<GraphLegendModel> graphLegends;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTrendsGraphModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciTrendsGraphModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C30526a(27)), AbstractC30060g.m92087G(enumC23463i, new C30526a(28))};
    }

    public /* synthetic */ MciTrendsGraphModel(int i13, GraphModel graphModel, List list, C9598e c9598e, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i13 & 5)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 5, MciTrendsGraphModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graph = graphModel;
        if ((i13 & 2) == 0) {
            this.graphLegends = C25271y.f99162w;
        } else {
            this.graphLegends = list;
        }
        this.destination = c9598e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MciTrendsGraphModel copy$default(MciTrendsGraphModel mciTrendsGraphModel, GraphModel graphModel, List list, C9598e c9598e, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            graphModel = mciTrendsGraphModel.graph;
        }
        if ((i13 & 2) != 0) {
            list = mciTrendsGraphModel.graphLegends;
        }
        if ((i13 & 4) != 0) {
            c9598e = mciTrendsGraphModel.destination;
        }
        return mciTrendsGraphModel.copy(graphModel, list, c9598e);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciTrendsGraphModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, GraphModel$$serializer.INSTANCE, self.graph);
        if (output.shouldEncodeElementDefault(serialDesc, 1) || !AbstractC22676k.m65745e(self.graphLegends, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.graphLegends);
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> component2() {
        return this.graphLegends;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    public final MciTrendsGraphModel copy(GraphModel graph, List<GraphLegendModel> graphLegends, C9598e destination) {
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        return new MciTrendsGraphModel(graph, graphLegends, destination);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciTrendsGraphModel)) {
            return false;
        }
        MciTrendsGraphModel mciTrendsGraphModel = (MciTrendsGraphModel) other;
        return AbstractC22676k.m65745e(this.graph, mciTrendsGraphModel.graph) && AbstractC22676k.m65745e(this.graphLegends, mciTrendsGraphModel.graphLegends) && AbstractC22676k.m65745e(this.destination, mciTrendsGraphModel.destination);
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public int hashCode() {
        GraphModel graphModel = this.graph;
        int iM31983b = AbstractC11895b.m31983b((graphModel == null ? 0 : graphModel.hashCode()) * 31, 31, this.graphLegends);
        C9598e c9598e = this.destination;
        return iM31983b + (c9598e != null ? c9598e.hashCode() : 0);
    }

    public String toString() {
        GraphModel graphModel = this.graph;
        List<GraphLegendModel> list = this.graphLegends;
        C9598e c9598e = this.destination;
        StringBuilder sb4 = new StringBuilder("MciTrendsGraphModel(graph=");
        sb4.append(graphModel);
        sb4.append(", graphLegends=");
        sb4.append(list);
        sb4.append(", destination=");
        return AbstractC33745d.m106656o(sb4, c9598e, ")");
    }

    public MciTrendsGraphModel(GraphModel graphModel, List<GraphLegendModel> graphLegends, C9598e c9598e) {
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        this.graph = graphModel;
        this.graphLegends = graphLegends;
        this.destination = c9598e;
    }

    public /* synthetic */ MciTrendsGraphModel(GraphModel graphModel, List list, C9598e c9598e, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphModel, (i13 & 2) != 0 ? C25271y.f99162w : list, c9598e);
    }
}
