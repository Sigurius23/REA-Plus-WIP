package com.whoop.design.models;

import com.google.gson.annotations.SerializedName;
import com.whoop.design.models.items.DateSelectorModel;
import com.whoop.design.models.items.DateSelectorModel$$serializer;
import com.whoop.design.models.items.WhoopCoachVowModel;
import com.whoop.design.models.items.WhoopCoachVowModel$$serializer;
import com.whoop.design.models.items.graph.GraphModel;
import com.whoop.design.models.items.graph.GraphModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0087\b\u0018\u0000 S2\u00020\u0001:\u0002TSB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014Bu\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0012\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b'\u0010(Jv\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00101\u001a\u00020\u000f2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J'\u0010;\u001a\u0002082\u0006\u00103\u001a\u00020\u00002\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0001¢\u0006\u0004\b9\u0010:R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010<\u0012\u0004\b>\u0010?\u001a\u0004\b=\u0010\u001bR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010@\u0012\u0004\bB\u0010?\u001a\u0004\bA\u0010\u001dR\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010C\u0012\u0004\bE\u0010?\u001a\u0004\bD\u0010\u001fR(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010@\u0012\u0004\bG\u0010?\u001a\u0004\bF\u0010\u001dR\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010H\u0012\u0004\bJ\u0010?\u001a\u0004\bI\u0010\"R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010K\u0012\u0004\bM\u0010?\u001a\u0004\bL\u0010$R \u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010N\u0012\u0004\bO\u0010?\u001a\u0004\b\u0010\u0010&R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010P\u0012\u0004\bR\u0010?\u001a\u0004\bQ\u0010(¨\u0006U"}, m65681d2 = {"Lcom/whoop/design/models/TimeSegmentModel;", "", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "", "Lcom/whoop/design/models/TrendMetricModel;", "metrics", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "Lcom/whoop/design/models/LegendItemModel;", "legend", "Lcom/whoop/design/models/BreakDownBarModel;", "breakdownBar", "Lcom/whoop/design/models/TimeSegmentLastUpdated;", "lastUpdated", "", "isHidden", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component4", "component5", "()Lcom/whoop/design/models/BreakDownBarModel;", "component6", "()Lcom/whoop/design/models/TimeSegmentLastUpdated;", "component7", "()Z", "component8", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "copy", "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Lcom/whoop/design/models/BreakDownBarModel;Lcom/whoop/design/models/TimeSegmentLastUpdated;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/design/models/TimeSegmentModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/TimeSegmentModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "getDatePicker$annotations", "()V", "Ljava/util/List;", "getMetrics", "getMetrics$annotations", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "getGraph$annotations", "getLegend", "getLegend$annotations", "Lcom/whoop/design/models/BreakDownBarModel;", "getBreakdownBar", "getBreakdownBar$annotations", "Lcom/whoop/design/models/TimeSegmentLastUpdated;", "getLastUpdated", "getLastUpdated$annotations", "Z", "isHidden$annotations", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "getWhoopCoachVow$annotations", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TimeSegmentModel {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("breakdown_bar")
    private final BreakDownBarModel breakdownBar;

    @SerializedName("date_picker")
    private final DateSelectorModel datePicker;

    @SerializedName("graph")
    private final GraphModel graph;

    @SerializedName("is_hidden")
    private final boolean isHidden;

    @SerializedName("last_updated")
    private final TimeSegmentLastUpdated lastUpdated;

    @SerializedName("legend")
    private final List<LegendItemModel> legend;

    @SerializedName("metrics")
    private final List<TrendMetricModel> metrics;

    @SerializedName("whoop_coach_vow")
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/TimeSegmentModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/TimeSegmentModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TimeSegmentModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C6909a(23)), null, AbstractC30060g.m92087G(enumC23463i, new C6909a(24)), null, null, null, null};
    }

    public /* synthetic */ TimeSegmentModel(int i13, DateSelectorModel dateSelectorModel, List list, GraphModel graphModel, List list2, BreakDownBarModel breakDownBarModel, TimeSegmentLastUpdated timeSegmentLastUpdated, boolean z4, WhoopCoachVowModel whoopCoachVowModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, TimeSegmentModel$$serializer.INSTANCE.getDescriptor());
        }
        this.datePicker = dateSelectorModel;
        this.metrics = list;
        this.graph = graphModel;
        this.legend = list2;
        this.breakdownBar = breakDownBarModel;
        this.lastUpdated = timeSegmentLastUpdated;
        this.isHidden = z4;
        this.whoopCoachVow = whoopCoachVowModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrendMetricModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LegendItemModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeSegmentModel copy$default(TimeSegmentModel timeSegmentModel, DateSelectorModel dateSelectorModel, List list, GraphModel graphModel, List list2, BreakDownBarModel breakDownBarModel, TimeSegmentLastUpdated timeSegmentLastUpdated, boolean z4, WhoopCoachVowModel whoopCoachVowModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = timeSegmentModel.datePicker;
        }
        if ((i13 & 2) != 0) {
            list = timeSegmentModel.metrics;
        }
        if ((i13 & 4) != 0) {
            graphModel = timeSegmentModel.graph;
        }
        if ((i13 & 8) != 0) {
            list2 = timeSegmentModel.legend;
        }
        if ((i13 & 16) != 0) {
            breakDownBarModel = timeSegmentModel.breakdownBar;
        }
        if ((i13 & 32) != 0) {
            timeSegmentLastUpdated = timeSegmentModel.lastUpdated;
        }
        if ((i13 & 64) != 0) {
            z4 = timeSegmentModel.isHidden;
        }
        if ((i13 & 128) != 0) {
            whoopCoachVowModel = timeSegmentModel.whoopCoachVow;
        }
        boolean z13 = z4;
        WhoopCoachVowModel whoopCoachVowModel2 = whoopCoachVowModel;
        BreakDownBarModel breakDownBarModel2 = breakDownBarModel;
        TimeSegmentLastUpdated timeSegmentLastUpdated2 = timeSegmentLastUpdated;
        return timeSegmentModel.copy(dateSelectorModel, list, graphModel, list2, breakDownBarModel2, timeSegmentLastUpdated2, z13, whoopCoachVowModel2);
    }

    @InterfaceC37143h("breakdown_bar")
    public static /* synthetic */ void getBreakdownBar$annotations() {
    }

    @InterfaceC37143h("date_picker")
    public static /* synthetic */ void getDatePicker$annotations() {
    }

    @InterfaceC37143h("graph")
    public static /* synthetic */ void getGraph$annotations() {
    }

    @InterfaceC37143h("last_updated")
    public static /* synthetic */ void getLastUpdated$annotations() {
    }

    @InterfaceC37143h("legend")
    public static /* synthetic */ void getLegend$annotations() {
    }

    @InterfaceC37143h("metrics")
    public static /* synthetic */ void getMetrics$annotations() {
    }

    @InterfaceC37143h("whoop_coach_vow")
    public static /* synthetic */ void getWhoopCoachVow$annotations() {
    }

    @InterfaceC37143h("is_hidden")
    public static /* synthetic */ void isHidden$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(TimeSegmentModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.metrics);
        output.encodeNullableSerializableElement(serialDesc, 2, GraphModel$$serializer.INSTANCE, self.graph);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.legend);
        output.encodeNullableSerializableElement(serialDesc, 4, BreakDownBarModel$$serializer.INSTANCE, self.breakdownBar);
        output.encodeNullableSerializableElement(serialDesc, 5, TimeSegmentLastUpdated$$serializer.INSTANCE, self.lastUpdated);
        output.encodeBooleanElement(serialDesc, 6, self.isHidden);
        output.encodeNullableSerializableElement(serialDesc, 7, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final List<TrendMetricModel> component2() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<LegendItemModel> component4() {
        return this.legend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BreakDownBarModel getBreakdownBar() {
        return this.breakdownBar;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final TimeSegmentLastUpdated getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public final TimeSegmentModel copy(DateSelectorModel datePicker, List<TrendMetricModel> metrics, GraphModel graph, List<LegendItemModel> legend, BreakDownBarModel breakdownBar, TimeSegmentLastUpdated lastUpdated, boolean isHidden, WhoopCoachVowModel whoopCoachVow) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(metrics, "metrics");
        return new TimeSegmentModel(datePicker, metrics, graph, legend, breakdownBar, lastUpdated, isHidden, whoopCoachVow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSegmentModel)) {
            return false;
        }
        TimeSegmentModel timeSegmentModel = (TimeSegmentModel) other;
        return AbstractC22676k.m65745e(this.datePicker, timeSegmentModel.datePicker) && AbstractC22676k.m65745e(this.metrics, timeSegmentModel.metrics) && AbstractC22676k.m65745e(this.graph, timeSegmentModel.graph) && AbstractC22676k.m65745e(this.legend, timeSegmentModel.legend) && AbstractC22676k.m65745e(this.breakdownBar, timeSegmentModel.breakdownBar) && AbstractC22676k.m65745e(this.lastUpdated, timeSegmentModel.lastUpdated) && this.isHidden == timeSegmentModel.isHidden && AbstractC22676k.m65745e(this.whoopCoachVow, timeSegmentModel.whoopCoachVow);
    }

    public final BreakDownBarModel getBreakdownBar() {
        return this.breakdownBar;
    }

    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    public final GraphModel getGraph() {
        return this.graph;
    }

    public final TimeSegmentLastUpdated getLastUpdated() {
        return this.lastUpdated;
    }

    public final List<LegendItemModel> getLegend() {
        return this.legend;
    }

    public final List<TrendMetricModel> getMetrics() {
        return this.metrics;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.datePicker.hashCode() * 31, 31, this.metrics);
        GraphModel graphModel = this.graph;
        int iHashCode = (iM31983b + (graphModel == null ? 0 : graphModel.hashCode())) * 31;
        List<LegendItemModel> list = this.legend;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        BreakDownBarModel breakDownBarModel = this.breakdownBar;
        int iHashCode3 = (iHashCode2 + (breakDownBarModel == null ? 0 : breakDownBarModel.hashCode())) * 31;
        TimeSegmentLastUpdated timeSegmentLastUpdated = this.lastUpdated;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (timeSegmentLastUpdated == null ? 0 : timeSegmentLastUpdated.hashCode())) * 31, 31, this.isHidden);
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        return iM8289b + (whoopCoachVowModel != null ? whoopCoachVowModel.hashCode() : 0);
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        return "TimeSegmentModel(datePicker=" + this.datePicker + ", metrics=" + this.metrics + ", graph=" + this.graph + ", legend=" + this.legend + ", breakdownBar=" + this.breakdownBar + ", lastUpdated=" + this.lastUpdated + ", isHidden=" + this.isHidden + ", whoopCoachVow=" + this.whoopCoachVow + ")";
    }

    public TimeSegmentModel(DateSelectorModel datePicker, List<TrendMetricModel> metrics, GraphModel graphModel, List<LegendItemModel> list, BreakDownBarModel breakDownBarModel, TimeSegmentLastUpdated timeSegmentLastUpdated, boolean z4, WhoopCoachVowModel whoopCoachVowModel) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.datePicker = datePicker;
        this.metrics = metrics;
        this.graph = graphModel;
        this.legend = list;
        this.breakdownBar = breakDownBarModel;
        this.lastUpdated = timeSegmentLastUpdated;
        this.isHidden = z4;
        this.whoopCoachVow = whoopCoachVowModel;
    }
}
