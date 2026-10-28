package com.whoop.advancedlabs.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.design.models.InfoCalloutTileModel;
import com.whoop.design.models.InfoCalloutTileModel$$serializer;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.TagModel;
import com.whoop.design.models.items.TagModel$$serializer;
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
import t91.C33662a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bg\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jh\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00109\u001a\u0002082\b\u00107\u001a\u0004\u0018\u000106HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010$R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\b@\u0010&R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010C\u001a\u0004\bD\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010E\u001a\u0004\bF\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010G\u001a\u0004\bH\u0010.¨\u0006K"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;", "Lcom/whoop/design/models/DesignSystemModel;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;", "metrics", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "", "Lcom/whoop/design/models/items/graph/GraphLegendModel;", "graphLegends", "Lcom/whoop/design/models/items/TagModel;", "basePhaseTag", "Lcom/whoop/design/models/InfoCalloutTileModel;", "baseInfoCallout", "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;", "categoricalBiomarkerDetails", "<init>", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$advanced_labs_release", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;", "component2", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component3", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component4", "()Ljava/util/List;", "component5", "()Lcom/whoop/design/models/items/TagModel;", "component6", "()Lcom/whoop/design/models/InfoCalloutTileModel;", "component7", "()Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;", "copy", "(Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;Lcom/whoop/design/models/items/DateSelectorModel;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/items/TagModel;Lcom/whoop/design/models/InfoCalloutTileModel;Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;)Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendMetricsModel;", "getMetrics", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "Ljava/util/List;", "getGraphLegends", "Lcom/whoop/design/models/items/TagModel;", "getBasePhaseTag", "Lcom/whoop/design/models/InfoCalloutTileModel;", "getBaseInfoCallout", "Lcom/whoop/advancedlabs/domain/models/CategoricalBiomarkerDetailsModel;", "getCategoricalBiomarkerDetails", "Companion", "$serializer", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkerTrendSegmentModel implements DesignSystemModel {
    private final InfoCalloutTileModel baseInfoCallout;
    private final TagModel basePhaseTag;
    private final CategoricalBiomarkerDetailsModel categoricalBiomarkerDetails;
    private final DateSelectorModel datePicker;
    private final GraphModel graph;
    private final List<GraphLegendModel> graphLegends;
    private final BiomarkerTrendMetricsModel metrics;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C33662a(20)), null, null, null};

    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/advancedlabs/domain/models/BiomarkerTrendSegmentModel;", "serializer", "()Lwc3/c;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkerTrendSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ BiomarkerTrendSegmentModel(int i13, BiomarkerTrendMetricsModel biomarkerTrendMetricsModel, DateSelectorModel dateSelectorModel, GraphModel graphModel, List list, TagModel tagModel, InfoCalloutTileModel infoCalloutTileModel, CategoricalBiomarkerDetailsModel categoricalBiomarkerDetailsModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, BiomarkerTrendSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.metrics = biomarkerTrendMetricsModel;
        this.datePicker = dateSelectorModel;
        this.graph = graphModel;
        this.graphLegends = list;
        this.basePhaseTag = tagModel;
        this.baseInfoCallout = infoCalloutTileModel;
        this.categoricalBiomarkerDetails = categoricalBiomarkerDetailsModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(GraphLegendModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BiomarkerTrendSegmentModel copy$default(BiomarkerTrendSegmentModel biomarkerTrendSegmentModel, BiomarkerTrendMetricsModel biomarkerTrendMetricsModel, DateSelectorModel dateSelectorModel, GraphModel graphModel, List list, TagModel tagModel, InfoCalloutTileModel infoCalloutTileModel, CategoricalBiomarkerDetailsModel categoricalBiomarkerDetailsModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            biomarkerTrendMetricsModel = biomarkerTrendSegmentModel.metrics;
        }
        if ((i13 & 2) != 0) {
            dateSelectorModel = biomarkerTrendSegmentModel.datePicker;
        }
        if ((i13 & 4) != 0) {
            graphModel = biomarkerTrendSegmentModel.graph;
        }
        if ((i13 & 8) != 0) {
            list = biomarkerTrendSegmentModel.graphLegends;
        }
        if ((i13 & 16) != 0) {
            tagModel = biomarkerTrendSegmentModel.basePhaseTag;
        }
        if ((i13 & 32) != 0) {
            infoCalloutTileModel = biomarkerTrendSegmentModel.baseInfoCallout;
        }
        if ((i13 & 64) != 0) {
            categoricalBiomarkerDetailsModel = biomarkerTrendSegmentModel.categoricalBiomarkerDetails;
        }
        InfoCalloutTileModel infoCalloutTileModel2 = infoCalloutTileModel;
        CategoricalBiomarkerDetailsModel categoricalBiomarkerDetailsModel2 = categoricalBiomarkerDetailsModel;
        TagModel tagModel2 = tagModel;
        GraphModel graphModel2 = graphModel;
        return biomarkerTrendSegmentModel.copy(biomarkerTrendMetricsModel, dateSelectorModel, graphModel2, list, tagModel2, infoCalloutTileModel2, categoricalBiomarkerDetailsModel2);
    }

    public static final /* synthetic */ void write$Self$advanced_labs_release(BiomarkerTrendSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, BiomarkerTrendMetricsModel$$serializer.INSTANCE, self.metrics);
        output.encodeNullableSerializableElement(serialDesc, 1, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeNullableSerializableElement(serialDesc, 2, GraphModel$$serializer.INSTANCE, self.graph);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.graphLegends);
        output.encodeNullableSerializableElement(serialDesc, 4, TagModel$$serializer.INSTANCE, self.basePhaseTag);
        output.encodeNullableSerializableElement(serialDesc, 5, InfoCalloutTileModel$$serializer.INSTANCE, self.baseInfoCallout);
        output.encodeNullableSerializableElement(serialDesc, 6, CategoricalBiomarkerDetailsModel$$serializer.INSTANCE, self.categoricalBiomarkerDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final BiomarkerTrendMetricsModel getMetrics() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> component4() {
        return this.graphLegends;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final TagModel getBasePhaseTag() {
        return this.basePhaseTag;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final InfoCalloutTileModel getBaseInfoCallout() {
        return this.baseInfoCallout;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final CategoricalBiomarkerDetailsModel getCategoricalBiomarkerDetails() {
        return this.categoricalBiomarkerDetails;
    }

    public final BiomarkerTrendSegmentModel copy(BiomarkerTrendMetricsModel metrics, DateSelectorModel datePicker, GraphModel graph, List<GraphLegendModel> graphLegends, TagModel basePhaseTag, InfoCalloutTileModel baseInfoCallout, CategoricalBiomarkerDetailsModel categoricalBiomarkerDetails) {
        AbstractC22676k.m65750j(metrics, "metrics");
        return new BiomarkerTrendSegmentModel(metrics, datePicker, graph, graphLegends, basePhaseTag, baseInfoCallout, categoricalBiomarkerDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkerTrendSegmentModel)) {
            return false;
        }
        BiomarkerTrendSegmentModel biomarkerTrendSegmentModel = (BiomarkerTrendSegmentModel) other;
        return AbstractC22676k.m65745e(this.metrics, biomarkerTrendSegmentModel.metrics) && AbstractC22676k.m65745e(this.datePicker, biomarkerTrendSegmentModel.datePicker) && AbstractC22676k.m65745e(this.graph, biomarkerTrendSegmentModel.graph) && AbstractC22676k.m65745e(this.graphLegends, biomarkerTrendSegmentModel.graphLegends) && AbstractC22676k.m65745e(this.basePhaseTag, biomarkerTrendSegmentModel.basePhaseTag) && AbstractC22676k.m65745e(this.baseInfoCallout, biomarkerTrendSegmentModel.baseInfoCallout) && AbstractC22676k.m65745e(this.categoricalBiomarkerDetails, biomarkerTrendSegmentModel.categoricalBiomarkerDetails);
    }

    public final InfoCalloutTileModel getBaseInfoCallout() {
        return this.baseInfoCallout;
    }

    public final TagModel getBasePhaseTag() {
        return this.basePhaseTag;
    }

    public final CategoricalBiomarkerDetailsModel getCategoricalBiomarkerDetails() {
        return this.categoricalBiomarkerDetails;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<GraphLegendModel> getGraphLegends() {
        return this.graphLegends;
    }

    public final BiomarkerTrendMetricsModel getMetrics() {
        return this.metrics;
    }

    public int hashCode() {
        int iHashCode = this.metrics.hashCode() * 31;
        DateSelectorModel dateSelectorModel = this.datePicker;
        int iHashCode2 = (iHashCode + (dateSelectorModel == null ? 0 : dateSelectorModel.hashCode())) * 31;
        GraphModel graphModel = this.graph;
        int iHashCode3 = (iHashCode2 + (graphModel == null ? 0 : graphModel.hashCode())) * 31;
        List<GraphLegendModel> list = this.graphLegends;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        TagModel tagModel = this.basePhaseTag;
        int iHashCode5 = (iHashCode4 + (tagModel == null ? 0 : tagModel.hashCode())) * 31;
        InfoCalloutTileModel infoCalloutTileModel = this.baseInfoCallout;
        int iHashCode6 = (iHashCode5 + (infoCalloutTileModel == null ? 0 : infoCalloutTileModel.hashCode())) * 31;
        CategoricalBiomarkerDetailsModel categoricalBiomarkerDetailsModel = this.categoricalBiomarkerDetails;
        return iHashCode6 + (categoricalBiomarkerDetailsModel != null ? categoricalBiomarkerDetailsModel.hashCode() : 0);
    }

    public String toString() {
        return "BiomarkerTrendSegmentModel(metrics=" + this.metrics + ", datePicker=" + this.datePicker + ", graph=" + this.graph + ", graphLegends=" + this.graphLegends + ", basePhaseTag=" + this.basePhaseTag + ", baseInfoCallout=" + this.baseInfoCallout + ", categoricalBiomarkerDetails=" + this.categoricalBiomarkerDetails + ")";
    }

    public BiomarkerTrendSegmentModel(BiomarkerTrendMetricsModel metrics, DateSelectorModel dateSelectorModel, GraphModel graphModel, List<GraphLegendModel> list, TagModel tagModel, InfoCalloutTileModel infoCalloutTileModel, CategoricalBiomarkerDetailsModel categoricalBiomarkerDetailsModel) {
        AbstractC22676k.m65750j(metrics, "metrics");
        this.metrics = metrics;
        this.datePicker = dateSelectorModel;
        this.graph = graphModel;
        this.graphLegends = list;
        this.basePhaseTag = tagModel;
        this.baseInfoCallout = infoCalloutTileModel;
        this.categoricalBiomarkerDetails = categoricalBiomarkerDetailsModel;
    }
}
