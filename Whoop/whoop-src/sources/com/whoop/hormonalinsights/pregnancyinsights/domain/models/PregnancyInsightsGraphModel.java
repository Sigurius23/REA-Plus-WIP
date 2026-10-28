package com.whoop.hormonalinsights.pregnancyinsights.domain.models;

import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import lj1.C24474b;
import m83.C25271y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000221B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bBI\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 JD\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010*\u001a\u0004\b+\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b-\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b.\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u0010 ¨\u00063"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "title", "icon", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "<init>", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/graph/GraphModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Ljava/lang/String;", "getTitle", "getIcon", "Ljava/util/List;", "getGraphLegends", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PregnancyInsightsGraphModel {
    private final GraphModel graph;
    private final List<GraphLegendModel> graphLegends;
    private final String icon;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C24474b(16))};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PregnancyInsightsGraphModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PregnancyInsightsGraphModel(int i13, GraphModel graphModel, String str, String str2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i13 & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 7, PregnancyInsightsGraphModel$$serializer.INSTANCE.getDescriptor());
        }
        this.graph = graphModel;
        this.title = str;
        this.icon = str2;
        if ((i13 & 8) == 0) {
            this.graphLegends = C25271y.f99162w;
        } else {
            this.graphLegends = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PregnancyInsightsGraphModel copy$default(PregnancyInsightsGraphModel pregnancyInsightsGraphModel, GraphModel graphModel, String str, String str2, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            graphModel = pregnancyInsightsGraphModel.graph;
        }
        if ((i13 & 2) != 0) {
            str = pregnancyInsightsGraphModel.title;
        }
        if ((i13 & 4) != 0) {
            str2 = pregnancyInsightsGraphModel.icon;
        }
        if ((i13 & 8) != 0) {
            list = pregnancyInsightsGraphModel.graphLegends;
        }
        return pregnancyInsightsGraphModel.copy(graphModel, str, str2, list);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(PregnancyInsightsGraphModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, GraphModel$$serializer.INSTANCE, self.graph);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.title);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.icon);
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && AbstractC22676k.m65745e(self.graphLegends, C25271y.f99162w)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.graphLegends);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final List<GraphLegendModel> component4() {
        return this.graphLegends;
    }

    public final PregnancyInsightsGraphModel copy(GraphModel graph, String title, String icon, List<GraphLegendModel> graphLegends) {
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        return new PregnancyInsightsGraphModel(graph, title, icon, graphLegends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PregnancyInsightsGraphModel)) {
            return false;
        }
        PregnancyInsightsGraphModel pregnancyInsightsGraphModel = (PregnancyInsightsGraphModel) other;
        return AbstractC22676k.m65745e(this.graph, pregnancyInsightsGraphModel.graph) && AbstractC22676k.m65745e(this.title, pregnancyInsightsGraphModel.title) && AbstractC22676k.m65745e(this.icon, pregnancyInsightsGraphModel.icon) && AbstractC22676k.m65745e(this.graphLegends, pregnancyInsightsGraphModel.graphLegends);
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        GraphModel graphModel = this.graph;
        int iHashCode = (graphModel == null ? 0 : graphModel.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        return this.graphLegends.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        GraphModel graphModel = this.graph;
        String str = this.title;
        String str2 = this.icon;
        List<GraphLegendModel> list = this.graphLegends;
        StringBuilder sb4 = new StringBuilder("PregnancyInsightsGraphModel(graph=");
        sb4.append(graphModel);
        sb4.append(", title=");
        sb4.append(str);
        sb4.append(", icon=");
        return AbstractC30007c.m91840j(str2, ", graphLegends=", ")", sb4, list);
    }

    public PregnancyInsightsGraphModel(GraphModel graphModel, String str, String str2, List<GraphLegendModel> graphLegends) {
        AbstractC22676k.m65750j(graphLegends, "graphLegends");
        this.graph = graphModel;
        this.title = str;
        this.icon = str2;
        this.graphLegends = graphLegends;
    }

    public /* synthetic */ PregnancyInsightsGraphModel(GraphModel graphModel, String str, String str2, List list, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(graphModel, str, str2, (i13 & 8) != 0 ? C25271y.f99162w : list);
    }
}
