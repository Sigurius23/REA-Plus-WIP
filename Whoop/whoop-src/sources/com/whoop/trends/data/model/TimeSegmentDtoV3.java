package com.whoop.trends.data.model;

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
import kotlinx.serialization.internal.StringSerializer;
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
import wl2.C37358a;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0002`_Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B\u0089\u0001\b\u0010\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u0017\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u008e\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b3\u0010&J\u0010\u00104\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b4\u00105J\u001a\u00107\u001a\u00020\u00132\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b7\u00108J'\u0010A\u001a\u00020>2\u0006\u00109\u001a\u00020\u00002\u0006\u0010;\u001a\u00020:2\u0006\u0010=\u001a\u00020<H\u0001¢\u0006\u0004\b?\u0010@R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010B\u0012\u0004\bD\u0010E\u001a\u0004\bC\u0010\u001fR&\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010F\u0012\u0004\bH\u0010E\u001a\u0004\bG\u0010!R\"\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010I\u0012\u0004\bK\u0010E\u001a\u0004\bJ\u0010#R(\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u0010F\u0012\u0004\bM\u0010E\u001a\u0004\bL\u0010!R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010N\u0012\u0004\bP\u0010E\u001a\u0004\bO\u0010&R\"\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010Q\u0012\u0004\bS\u0010E\u001a\u0004\bR\u0010(R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010T\u0012\u0004\bV\u0010E\u001a\u0004\bU\u0010*R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010W\u0012\u0004\bY\u0010E\u001a\u0004\bX\u0010,R \u0010\u0014\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010Z\u0012\u0004\b[\u0010E\u001a\u0004\b\u0014\u0010.R\"\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\\\u0012\u0004\b^\u0010E\u001a\u0004\b]\u00100¨\u0006a"}, m65681d2 = {"Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "", "Lcom/whoop/design/models/items/DateSelectorModel;", "datePicker", "", "Lcom/whoop/trends/data/model/TrendMetricDtoV3;", "metrics", "Lcom/whoop/design/models/items/graph/GraphModel;", "graph", "Lcom/whoop/trends/data/model/LegendItemDtoV3;", "legend", "", "vow", "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;", "breakdownBar", "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "lastUpdated", "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "segmentalBodyComposition", "", "isHidden", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "whoopCoachVow", "<init>", "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/DateSelectorModel;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/design/models/items/graph/GraphModel;", "component4", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/trends/data/model/BreakDownBarDtoV3;", "component7", "()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "component8", "()Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "component9", "()Z", "component10", "()Lcom/whoop/design/models/items/WhoopCoachVowModel;", "copy", "(Lcom/whoop/design/models/items/DateSelectorModel;Ljava/util/List;Lcom/whoop/design/models/items/graph/GraphModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/trends/data/model/BreakDownBarDtoV3;Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;Lcom/whoop/trends/data/model/SegmentalAnalysisModel;ZLcom/whoop/design/models/items/WhoopCoachVowModel;)Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$trends_release", "(Lcom/whoop/trends/data/model/TimeSegmentDtoV3;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/DateSelectorModel;", "getDatePicker", "getDatePicker$annotations", "()V", "Ljava/util/List;", "getMetrics", "getMetrics$annotations", "Lcom/whoop/design/models/items/graph/GraphModel;", "getGraph", "getGraph$annotations", "getLegend", "getLegend$annotations", "Ljava/lang/String;", "getVow", "getVow$annotations", "Lcom/whoop/trends/data/model/BreakDownBarDtoV3;", "getBreakdownBar", "getBreakdownBar$annotations", "Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;", "getLastUpdated", "getLastUpdated$annotations", "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;", "getSegmentalBodyComposition", "getSegmentalBodyComposition$annotations", "Z", "isHidden$annotations", "Lcom/whoop/design/models/items/WhoopCoachVowModel;", "getWhoopCoachVow", "getWhoopCoachVow$annotations", "Companion", "$serializer", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class TimeSegmentDtoV3 {
    private static final InterfaceC23462h[] $childSerializers;

    @SerializedName("breakdown_bar")
    private final BreakDownBarDtoV3 breakdownBar;

    @SerializedName("date_picker")
    private final DateSelectorModel datePicker;

    @SerializedName("graph")
    private final GraphModel graph;

    @SerializedName("is_hidden")
    private final boolean isHidden;

    @SerializedName("last_updated")
    private final TimeSegmentLastUpdated lastUpdated;

    @SerializedName("legend")
    private final List<LegendItemDtoV3> legend;

    @SerializedName("metrics")
    private final List<TrendMetricDtoV3> metrics;

    @SerializedName("segmental_body_comp_trends")
    private final SegmentalAnalysisModel segmentalBodyComposition;

    @SerializedName("vow")
    private final String vow;

    @SerializedName("whoop_coach_vow")
    private final WhoopCoachVowModel whoopCoachVow;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/trends/data/model/TimeSegmentDtoV3$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/trends/data/model/TimeSegmentDtoV3;", "serializer", "()Lwc3/c;", "trends_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return TimeSegmentDtoV3$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C37358a(8)), null, AbstractC30060g.m92087G(enumC23463i, new C37358a(9)), null, null, null, null, null, null};
    }

    public /* synthetic */ TimeSegmentDtoV3(int i13, DateSelectorModel dateSelectorModel, List list, GraphModel graphModel, List list2, String str, BreakDownBarDtoV3 breakDownBarDtoV3, TimeSegmentLastUpdated timeSegmentLastUpdated, SegmentalAnalysisModel segmentalAnalysisModel, boolean z4, WhoopCoachVowModel whoopCoachVowModel, SerializationConstructorMarker serializationConstructorMarker) {
        if (1023 != (i13 & 1023)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 1023, TimeSegmentDtoV3$$serializer.INSTANCE.getDescriptor());
        }
        this.datePicker = dateSelectorModel;
        this.metrics = list;
        this.graph = graphModel;
        this.legend = list2;
        this.vow = str;
        this.breakdownBar = breakDownBarDtoV3;
        this.lastUpdated = timeSegmentLastUpdated;
        this.segmentalBodyComposition = segmentalAnalysisModel;
        this.isHidden = z4;
        this.whoopCoachVow = whoopCoachVowModel;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrendMetricDtoV3$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(LegendItemDtoV3$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TimeSegmentDtoV3 copy$default(TimeSegmentDtoV3 timeSegmentDtoV3, DateSelectorModel dateSelectorModel, List list, GraphModel graphModel, List list2, String str, BreakDownBarDtoV3 breakDownBarDtoV3, TimeSegmentLastUpdated timeSegmentLastUpdated, SegmentalAnalysisModel segmentalAnalysisModel, boolean z4, WhoopCoachVowModel whoopCoachVowModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            dateSelectorModel = timeSegmentDtoV3.datePicker;
        }
        if ((i13 & 2) != 0) {
            list = timeSegmentDtoV3.metrics;
        }
        if ((i13 & 4) != 0) {
            graphModel = timeSegmentDtoV3.graph;
        }
        if ((i13 & 8) != 0) {
            list2 = timeSegmentDtoV3.legend;
        }
        if ((i13 & 16) != 0) {
            str = timeSegmentDtoV3.vow;
        }
        if ((i13 & 32) != 0) {
            breakDownBarDtoV3 = timeSegmentDtoV3.breakdownBar;
        }
        if ((i13 & 64) != 0) {
            timeSegmentLastUpdated = timeSegmentDtoV3.lastUpdated;
        }
        if ((i13 & 128) != 0) {
            segmentalAnalysisModel = timeSegmentDtoV3.segmentalBodyComposition;
        }
        if ((i13 & 256) != 0) {
            z4 = timeSegmentDtoV3.isHidden;
        }
        if ((i13 & 512) != 0) {
            whoopCoachVowModel = timeSegmentDtoV3.whoopCoachVow;
        }
        boolean z13 = z4;
        WhoopCoachVowModel whoopCoachVowModel2 = whoopCoachVowModel;
        TimeSegmentLastUpdated timeSegmentLastUpdated2 = timeSegmentLastUpdated;
        SegmentalAnalysisModel segmentalAnalysisModel2 = segmentalAnalysisModel;
        String str2 = str;
        BreakDownBarDtoV3 breakDownBarDtoV4 = breakDownBarDtoV3;
        return timeSegmentDtoV3.copy(dateSelectorModel, list, graphModel, list2, str2, breakDownBarDtoV4, timeSegmentLastUpdated2, segmentalAnalysisModel2, z13, whoopCoachVowModel2);
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

    @InterfaceC37143h("segmental_body_comp_trends")
    public static /* synthetic */ void getSegmentalBodyComposition$annotations() {
    }

    @InterfaceC37143h("vow")
    public static /* synthetic */ void getVow$annotations() {
    }

    @InterfaceC37143h("whoop_coach_vow")
    public static /* synthetic */ void getWhoopCoachVow$annotations() {
    }

    @InterfaceC37143h("is_hidden")
    public static /* synthetic */ void isHidden$annotations() {
    }

    public static final /* synthetic */ void write$Self$trends_release(TimeSegmentDtoV3 self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeSerializableElement(serialDesc, 0, DateSelectorModel$$serializer.INSTANCE, self.datePicker);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.metrics);
        output.encodeNullableSerializableElement(serialDesc, 2, GraphModel$$serializer.INSTANCE, self.graph);
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.legend);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.vow);
        output.encodeNullableSerializableElement(serialDesc, 5, BreakDownBarDtoV3$$serializer.INSTANCE, self.breakdownBar);
        output.encodeNullableSerializableElement(serialDesc, 6, TimeSegmentLastUpdated$$serializer.INSTANCE, self.lastUpdated);
        output.encodeNullableSerializableElement(serialDesc, 7, SegmentalAnalysisModel$$serializer.INSTANCE, self.segmentalBodyComposition);
        output.encodeBooleanElement(serialDesc, 8, self.isHidden);
        output.encodeNullableSerializableElement(serialDesc, 9, WhoopCoachVowModel$$serializer.INSTANCE, self.whoopCoachVow);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final DateSelectorModel getDatePicker() {
        return this.datePicker;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public final List<TrendMetricDtoV3> component2() {
        return this.metrics;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphModel getGraph() {
        return this.graph;
    }

    public final List<LegendItemDtoV3> component4() {
        return this.legend;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVow() {
        return this.vow;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final BreakDownBarDtoV3 getBreakdownBar() {
        return this.breakdownBar;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final TimeSegmentLastUpdated getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SegmentalAnalysisModel getSegmentalBodyComposition() {
        return this.segmentalBodyComposition;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final TimeSegmentDtoV3 copy(DateSelectorModel datePicker, List<TrendMetricDtoV3> metrics, GraphModel graph, List<LegendItemDtoV3> legend, String vow, BreakDownBarDtoV3 breakdownBar, TimeSegmentLastUpdated lastUpdated, SegmentalAnalysisModel segmentalBodyComposition, boolean isHidden, WhoopCoachVowModel whoopCoachVow) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(metrics, "metrics");
        return new TimeSegmentDtoV3(datePicker, metrics, graph, legend, vow, breakdownBar, lastUpdated, segmentalBodyComposition, isHidden, whoopCoachVow);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimeSegmentDtoV3)) {
            return false;
        }
        TimeSegmentDtoV3 timeSegmentDtoV3 = (TimeSegmentDtoV3) other;
        return AbstractC22676k.m65745e(this.datePicker, timeSegmentDtoV3.datePicker) && AbstractC22676k.m65745e(this.metrics, timeSegmentDtoV3.metrics) && AbstractC22676k.m65745e(this.graph, timeSegmentDtoV3.graph) && AbstractC22676k.m65745e(this.legend, timeSegmentDtoV3.legend) && AbstractC22676k.m65745e(this.vow, timeSegmentDtoV3.vow) && AbstractC22676k.m65745e(this.breakdownBar, timeSegmentDtoV3.breakdownBar) && AbstractC22676k.m65745e(this.lastUpdated, timeSegmentDtoV3.lastUpdated) && AbstractC22676k.m65745e(this.segmentalBodyComposition, timeSegmentDtoV3.segmentalBodyComposition) && this.isHidden == timeSegmentDtoV3.isHidden && AbstractC22676k.m65745e(this.whoopCoachVow, timeSegmentDtoV3.whoopCoachVow);
    }

    public final BreakDownBarDtoV3 getBreakdownBar() {
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

    public final List<LegendItemDtoV3> getLegend() {
        return this.legend;
    }

    public final List<TrendMetricDtoV3> getMetrics() {
        return this.metrics;
    }

    public final SegmentalAnalysisModel getSegmentalBodyComposition() {
        return this.segmentalBodyComposition;
    }

    public final String getVow() {
        return this.vow;
    }

    public final WhoopCoachVowModel getWhoopCoachVow() {
        return this.whoopCoachVow;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(this.datePicker.hashCode() * 31, 31, this.metrics);
        GraphModel graphModel = this.graph;
        int iHashCode = (iM31983b + (graphModel == null ? 0 : graphModel.hashCode())) * 31;
        List<LegendItemDtoV3> list = this.legend;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.vow;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BreakDownBarDtoV3 breakDownBarDtoV3 = this.breakdownBar;
        int iHashCode4 = (iHashCode3 + (breakDownBarDtoV3 == null ? 0 : breakDownBarDtoV3.hashCode())) * 31;
        TimeSegmentLastUpdated timeSegmentLastUpdated = this.lastUpdated;
        int iHashCode5 = (iHashCode4 + (timeSegmentLastUpdated == null ? 0 : timeSegmentLastUpdated.hashCode())) * 31;
        SegmentalAnalysisModel segmentalAnalysisModel = this.segmentalBodyComposition;
        int iM8289b = AbstractC2875y.m8289b((iHashCode5 + (segmentalAnalysisModel == null ? 0 : segmentalAnalysisModel.hashCode())) * 31, 31, this.isHidden);
        WhoopCoachVowModel whoopCoachVowModel = this.whoopCoachVow;
        return iM8289b + (whoopCoachVowModel != null ? whoopCoachVowModel.hashCode() : 0);
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    public String toString() {
        return "TimeSegmentDtoV3(datePicker=" + this.datePicker + ", metrics=" + this.metrics + ", graph=" + this.graph + ", legend=" + this.legend + ", vow=" + this.vow + ", breakdownBar=" + this.breakdownBar + ", lastUpdated=" + this.lastUpdated + ", segmentalBodyComposition=" + this.segmentalBodyComposition + ", isHidden=" + this.isHidden + ", whoopCoachVow=" + this.whoopCoachVow + ")";
    }

    public TimeSegmentDtoV3(DateSelectorModel datePicker, List<TrendMetricDtoV3> metrics, GraphModel graphModel, List<LegendItemDtoV3> list, String str, BreakDownBarDtoV3 breakDownBarDtoV3, TimeSegmentLastUpdated timeSegmentLastUpdated, SegmentalAnalysisModel segmentalAnalysisModel, boolean z4, WhoopCoachVowModel whoopCoachVowModel) {
        AbstractC22676k.m65750j(datePicker, "datePicker");
        AbstractC22676k.m65750j(metrics, "metrics");
        this.datePicker = datePicker;
        this.metrics = metrics;
        this.graph = graphModel;
        this.legend = list;
        this.vow = str;
        this.breakdownBar = breakDownBarDtoV3;
        this.lastUpdated = timeSegmentLastUpdated;
        this.segmentalBodyComposition = segmentalAnalysisModel;
        this.isHidden = z4;
        this.whoopCoachVow = whoopCoachVowModel;
    }
}
