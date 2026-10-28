package com.whoop.design.models.items;

import androidx.core.app.FrameMetricsAggregator;
import c13.AbstractC3855a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.items.graph.GraphLegendModel;
import com.whoop.design.models.items.graph.GraphLegendModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36955b;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012B{\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b*\u0010(J\u0012\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b-\u0010.Jt\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010$R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010=\u001a\u0004\b@\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bB\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bC\u0010(R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u000b\u0010A\u001a\u0004\bD\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010,R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010.¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/items/CompactTrendModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/design/models/items/SegmentControllerModel;", "segmentController", "Lcom/whoop/design/models/items/DateSelectorModel;", "weekDatePicker", "monthDatePicker", "sixMonthDatePicker", "Lcom/whoop/design/models/items/graph/GraphModel;", "weekGraph", "monthGraph", "sixMonthGraph", "Lcom/whoop/design/models/items/NoDataGraphModel;", "noDataGraph", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "<init>", "(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/CompactTrendModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/design/models/items/SegmentControllerModel;", "component2", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component6", "component7", "component8", "()Lcom/whoop/design/models/items/NoDataGraphModel;", "component9", "()Ljava/util/List;", "copy", "(Lcom/whoop/design/models/items/SegmentControllerModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/NoDataGraphModel;Ljava/util/List;)Lcom/whoop/design/models/items/CompactTrendModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/design/models/items/SegmentControllerModel;", "getSegmentController", "Lcom/whoop/design/models/items/DateSelectorModel;", "getWeekDatePicker", "getMonthDatePicker", "getSixMonthDatePicker", "Lcom/whoop/design/models/items/graph/GraphModel;", "getWeekGraph", "getMonthGraph", "getSixMonthGraph", "Lcom/whoop/design/models/items/NoDataGraphModel;", "getNoDataGraph", "Ljava/util/List;", "getGraphLegends", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class CompactTrendModel implements DesignSystemModel {
    private final List<GraphLegendModel> graphLegends;
    private final DateSelectorModel monthDatePicker;
    private final GraphModel monthGraph;
    private final NoDataGraphModel noDataGraph;
    private final SegmentControllerModel segmentController;
    private final DateSelectorModel sixMonthDatePicker;
    private final GraphModel sixMonthGraph;
    private final DateSelectorModel weekDatePicker;
    private final GraphModel weekGraph;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C36955b(7))};

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/CompactTrendModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/CompactTrendModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return CompactTrendModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CompactTrendModel(int i13, SegmentControllerModel segmentControllerModel, DateSelectorModel dateSelectorModel, DateSelectorModel dateSelectorModel2, DateSelectorModel dateSelectorModel3, GraphModel graphModel, GraphModel graphModel2, GraphModel graphModel3, NoDataGraphModel noDataGraphModel, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, CompactTrendModel$$serializer.INSTANCE.getDescriptor());
        }
        this.segmentController = segmentControllerModel;
        this.weekDatePicker = dateSelectorModel;
        this.monthDatePicker = dateSelectorModel2;
        this.sixMonthDatePicker = dateSelectorModel3;
        this.weekGraph = graphModel;
        this.monthGraph = graphModel2;
        this.sixMonthGraph = graphModel3;
        this.noDataGraph = noDataGraphModel;
        this.graphLegends = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompactTrendModel copy$default(CompactTrendModel compactTrendModel, SegmentControllerModel segmentControllerModel, DateSelectorModel dateSelectorModel, DateSelectorModel dateSelectorModel2, DateSelectorModel dateSelectorModel3, GraphModel graphModel, GraphModel graphModel2, GraphModel graphModel3, NoDataGraphModel noDataGraphModel, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            segmentControllerModel = compactTrendModel.segmentController;
        }
        if ((i13 & 2) != 0) {
            dateSelectorModel = compactTrendModel.weekDatePicker;
        }
        if ((i13 & 4) != 0) {
            dateSelectorModel2 = compactTrendModel.monthDatePicker;
        }
        if ((i13 & 8) != 0) {
            dateSelectorModel3 = compactTrendModel.sixMonthDatePicker;
        }
        if ((i13 & 16) != 0) {
            graphModel = compactTrendModel.weekGraph;
        }
        if ((i13 & 32) != 0) {
            graphModel2 = compactTrendModel.monthGraph;
        }
        if ((i13 & 64) != 0) {
            graphModel3 = compactTrendModel.sixMonthGraph;
        }
        if ((i13 & 128) != 0) {
            noDataGraphModel = compactTrendModel.noDataGraph;
        }
        if ((i13 & 256) != 0) {
            list = compactTrendModel.graphLegends;
        }
        NoDataGraphModel noDataGraphModel2 = noDataGraphModel;
        List list2 = list;
        GraphModel graphModel4 = graphModel2;
        GraphModel graphModel5 = graphModel3;
        GraphModel graphModel6 = graphModel;
        DateSelectorModel dateSelectorModel4 = dateSelectorModel2;
        return compactTrendModel.copy(segmentControllerModel, dateSelectorModel, dateSelectorModel4, dateSelectorModel3, graphModel6, graphModel4, graphModel5, noDataGraphModel2, list2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(CompactTrendModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, SegmentControllerModel$$serializer.INSTANCE, self.segmentController);
        DateSelectorModel$$serializer dateSelectorModel$$serializer = DateSelectorModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 1, dateSelectorModel$$serializer, self.weekDatePicker);
        output.encodeSerializableElement(serialDesc, 2, dateSelectorModel$$serializer, self.monthDatePicker);
        output.encodeSerializableElement(serialDesc, 3, dateSelectorModel$$serializer, self.sixMonthDatePicker);
        GraphModel$$serializer graphModel$$serializer = GraphModel$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, graphModel$$serializer, self.weekGraph);
        output.encodeSerializableElement(serialDesc, 5, graphModel$$serializer, self.monthGraph);
        output.encodeSerializableElement(serialDesc, 6, graphModel$$serializer, self.sixMonthGraph);
        output.encodeNullableSerializableElement(serialDesc, 7, NoDataGraphModel$$serializer.INSTANCE, self.noDataGraph);
        output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.graphLegends);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final SegmentControllerModel getSegmentController() {
        return this.segmentController;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateSelectorModel getWeekDatePicker() {
        return this.weekDatePicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateSelectorModel getMonthDatePicker() {
        return this.monthDatePicker;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DateSelectorModel getSixMonthDatePicker() {
        return this.sixMonthDatePicker;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final GraphModel getWeekGraph() {
        return this.weekGraph;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GraphModel getMonthGraph() {
        return this.monthGraph;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphModel getSixMonthGraph() {
        return this.sixMonthGraph;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final NoDataGraphModel getNoDataGraph() {
        return this.noDataGraph;
    }

    public final List<GraphLegendModel> component9() {
        return this.graphLegends;
    }

    public final CompactTrendModel copy(SegmentControllerModel segmentController, DateSelectorModel weekDatePicker, DateSelectorModel monthDatePicker, DateSelectorModel sixMonthDatePicker, GraphModel weekGraph, GraphModel monthGraph, GraphModel sixMonthGraph, NoDataGraphModel noDataGraph, List<GraphLegendModel> graphLegends) {
        AbstractC22676k.m65750j(segmentController, "segmentController");
        AbstractC22676k.m65750j(weekDatePicker, "weekDatePicker");
        AbstractC22676k.m65750j(monthDatePicker, "monthDatePicker");
        AbstractC22676k.m65750j(sixMonthDatePicker, "sixMonthDatePicker");
        AbstractC22676k.m65750j(weekGraph, "weekGraph");
        AbstractC22676k.m65750j(monthGraph, "monthGraph");
        AbstractC22676k.m65750j(sixMonthGraph, "sixMonthGraph");
        return new CompactTrendModel(segmentController, weekDatePicker, monthDatePicker, sixMonthDatePicker, weekGraph, monthGraph, sixMonthGraph, noDataGraph, graphLegends);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompactTrendModel)) {
            return false;
        }
        CompactTrendModel compactTrendModel = (CompactTrendModel) other;
        return AbstractC22676k.m65745e(this.segmentController, compactTrendModel.segmentController) && AbstractC22676k.m65745e(this.weekDatePicker, compactTrendModel.weekDatePicker) && AbstractC22676k.m65745e(this.monthDatePicker, compactTrendModel.monthDatePicker) && AbstractC22676k.m65745e(this.sixMonthDatePicker, compactTrendModel.sixMonthDatePicker) && AbstractC22676k.m65745e(this.weekGraph, compactTrendModel.weekGraph) && AbstractC22676k.m65745e(this.monthGraph, compactTrendModel.monthGraph) && AbstractC22676k.m65745e(this.sixMonthGraph, compactTrendModel.sixMonthGraph) && AbstractC22676k.m65745e(this.noDataGraph, compactTrendModel.noDataGraph) && AbstractC22676k.m65745e(this.graphLegends, compactTrendModel.graphLegends);
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final DateSelectorModel getMonthDatePicker() {
        return this.monthDatePicker;
    }

    public final GraphModel getMonthGraph() {
        return this.monthGraph;
    }

    public final NoDataGraphModel getNoDataGraph() {
        return this.noDataGraph;
    }

    public final SegmentControllerModel getSegmentController() {
        return this.segmentController;
    }

    public final DateSelectorModel getSixMonthDatePicker() {
        return this.sixMonthDatePicker;
    }

    public final GraphModel getSixMonthGraph() {
        return this.sixMonthGraph;
    }

    public final DateSelectorModel getWeekDatePicker() {
        return this.weekDatePicker;
    }

    public final GraphModel getWeekGraph() {
        return this.weekGraph;
    }

    public int hashCode() {
        int iHashCode = (this.sixMonthGraph.hashCode() + ((this.monthGraph.hashCode() + ((this.weekGraph.hashCode() + ((this.sixMonthDatePicker.hashCode() + ((this.monthDatePicker.hashCode() + ((this.weekDatePicker.hashCode() + (this.segmentController.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        NoDataGraphModel noDataGraphModel = this.noDataGraph;
        int iHashCode2 = (iHashCode + (noDataGraphModel == null ? 0 : noDataGraphModel.hashCode())) * 31;
        List<GraphLegendModel> list = this.graphLegends;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        SegmentControllerModel segmentControllerModel = this.segmentController;
        DateSelectorModel dateSelectorModel = this.weekDatePicker;
        DateSelectorModel dateSelectorModel2 = this.monthDatePicker;
        DateSelectorModel dateSelectorModel3 = this.sixMonthDatePicker;
        GraphModel graphModel = this.weekGraph;
        GraphModel graphModel2 = this.monthGraph;
        GraphModel graphModel3 = this.sixMonthGraph;
        NoDataGraphModel noDataGraphModel = this.noDataGraph;
        List<GraphLegendModel> list = this.graphLegends;
        StringBuilder sb4 = new StringBuilder("CompactTrendModel(segmentController=");
        sb4.append(segmentControllerModel);
        sb4.append(", weekDatePicker=");
        sb4.append(dateSelectorModel);
        sb4.append(", monthDatePicker=");
        sb4.append(dateSelectorModel2);
        sb4.append(", sixMonthDatePicker=");
        sb4.append(dateSelectorModel3);
        sb4.append(", weekGraph=");
        sb4.append(graphModel);
        sb4.append(", monthGraph=");
        sb4.append(graphModel2);
        sb4.append(", sixMonthGraph=");
        sb4.append(graphModel3);
        sb4.append(", noDataGraph=");
        sb4.append(noDataGraphModel);
        sb4.append(", graphLegends=");
        return AbstractC3855a.m11829m(sb4, list, ")");
    }

    public CompactTrendModel(SegmentControllerModel segmentController, DateSelectorModel weekDatePicker, DateSelectorModel monthDatePicker, DateSelectorModel sixMonthDatePicker, GraphModel weekGraph, GraphModel monthGraph, GraphModel sixMonthGraph, NoDataGraphModel noDataGraphModel, List<GraphLegendModel> list) {
        AbstractC22676k.m65750j(segmentController, "segmentController");
        AbstractC22676k.m65750j(weekDatePicker, "weekDatePicker");
        AbstractC22676k.m65750j(monthDatePicker, "monthDatePicker");
        AbstractC22676k.m65750j(sixMonthDatePicker, "sixMonthDatePicker");
        AbstractC22676k.m65750j(weekGraph, "weekGraph");
        AbstractC22676k.m65750j(monthGraph, "monthGraph");
        AbstractC22676k.m65750j(sixMonthGraph, "sixMonthGraph");
        this.segmentController = segmentController;
        this.weekDatePicker = weekDatePicker;
        this.monthDatePicker = monthDatePicker;
        this.sixMonthDatePicker = sixMonthDatePicker;
        this.weekGraph = weekGraph;
        this.monthGraph = monthGraph;
        this.sixMonthGraph = sixMonthGraph;
        this.noDataGraph = noDataGraphModel;
        this.graphLegends = list;
    }
}
