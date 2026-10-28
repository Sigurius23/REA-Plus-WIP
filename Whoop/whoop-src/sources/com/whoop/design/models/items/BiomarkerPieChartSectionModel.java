package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import w91.C36954a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBB[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t¢\u0006\u0004\b\u0010\u0010\u0011Bw\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010!J\u0012\u0010*\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b*\u0010!J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b+\u0010(Jr\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b?\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b@\u0010!R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010=\u001a\u0004\bA\u0010(¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "id", "orientation", "Lcom/whoop/design/models/items/PieChartModel;", "pieChart", "Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;", "pieChartContent", "", "Lcom/whoop/design/models/items/TrendCountModel;", "trendCounts", "caption", "style", "Lcom/whoop/design/models/items/BiomarkerCardModel;", "biomarkers", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/PieChartModel;Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/PieChartModel;Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/design/models/items/PieChartModel;", "component4", "()Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/PieChartModel;Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getOrientation", "Lcom/whoop/design/models/items/PieChartModel;", "getPieChart", "Lcom/whoop/design/models/items/BiomarkerPieChartContentModel;", "getPieChartContent", "Ljava/util/List;", "getTrendCounts", "getCaption", "getStyle", "getBiomarkers", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BiomarkerPieChartSectionModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final List<BiomarkerCardModel> biomarkers;
    private final String caption;
    private final String id;
    private final String orientation;
    private final PieChartModel pieChart;
    private final BiomarkerPieChartContentModel pieChartContent;
    private final String style;
    private final List<TrendCountModel> trendCounts;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/BiomarkerPieChartSectionModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BiomarkerPieChartSectionModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(15)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36954a(16))};
    }

    public /* synthetic */ BiomarkerPieChartSectionModel(int i13, String str, String str2, PieChartModel pieChartModel, BiomarkerPieChartContentModel biomarkerPieChartContentModel, List list, String str3, String str4, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, BiomarkerPieChartSectionModel$$serializer.INSTANCE.getDescriptor());
        }
        this.id = str;
        this.orientation = str2;
        this.pieChart = pieChartModel;
        this.pieChartContent = biomarkerPieChartContentModel;
        this.trendCounts = list;
        this.caption = str3;
        this.style = str4;
        if ((i13 & 128) == 0) {
            this.biomarkers = null;
        } else {
            this.biomarkers = list2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(TrendCountModel$$serializer.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return new ArrayListSerializer(BiomarkerCardModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BiomarkerPieChartSectionModel copy$default(BiomarkerPieChartSectionModel biomarkerPieChartSectionModel, String str, String str2, PieChartModel pieChartModel, BiomarkerPieChartContentModel biomarkerPieChartContentModel, List list, String str3, String str4, List list2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = biomarkerPieChartSectionModel.id;
        }
        if ((i13 & 2) != 0) {
            str2 = biomarkerPieChartSectionModel.orientation;
        }
        if ((i13 & 4) != 0) {
            pieChartModel = biomarkerPieChartSectionModel.pieChart;
        }
        if ((i13 & 8) != 0) {
            biomarkerPieChartContentModel = biomarkerPieChartSectionModel.pieChartContent;
        }
        if ((i13 & 16) != 0) {
            list = biomarkerPieChartSectionModel.trendCounts;
        }
        if ((i13 & 32) != 0) {
            str3 = biomarkerPieChartSectionModel.caption;
        }
        if ((i13 & 64) != 0) {
            str4 = biomarkerPieChartSectionModel.style;
        }
        if ((i13 & 128) != 0) {
            list2 = biomarkerPieChartSectionModel.biomarkers;
        }
        String str5 = str4;
        List list3 = list2;
        List list4 = list;
        String str6 = str3;
        return biomarkerPieChartSectionModel.copy(str, str2, pieChartModel, biomarkerPieChartContentModel, list4, str6, str5, list3);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BiomarkerPieChartSectionModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.id);
        output.encodeStringElement(serialDesc, 1, self.orientation);
        output.encodeSerializableElement(serialDesc, 2, PieChartModel$$serializer.INSTANCE, self.pieChart);
        output.encodeSerializableElement(serialDesc, 3, BiomarkerPieChartContentModel$$serializer.INSTANCE, self.pieChartContent);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.trendCounts);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.caption);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.style);
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.biomarkers == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.biomarkers);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PieChartModel getPieChart() {
        return this.pieChart;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final BiomarkerPieChartContentModel getPieChartContent() {
        return this.pieChartContent;
    }

    public final List<TrendCountModel> component5() {
        return this.trendCounts;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    public final List<BiomarkerCardModel> component8() {
        return this.biomarkers;
    }

    public final BiomarkerPieChartSectionModel copy(String id4, String orientation, PieChartModel pieChart, BiomarkerPieChartContentModel pieChartContent, List<TrendCountModel> trendCounts, String caption, String style, List<BiomarkerCardModel> biomarkers) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(pieChartContent, "pieChartContent");
        AbstractC22676k.m65750j(trendCounts, "trendCounts");
        return new BiomarkerPieChartSectionModel(id4, orientation, pieChart, pieChartContent, trendCounts, caption, style, biomarkers);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BiomarkerPieChartSectionModel)) {
            return false;
        }
        BiomarkerPieChartSectionModel biomarkerPieChartSectionModel = (BiomarkerPieChartSectionModel) other;
        return AbstractC22676k.m65745e(this.id, biomarkerPieChartSectionModel.id) && AbstractC22676k.m65745e(this.orientation, biomarkerPieChartSectionModel.orientation) && AbstractC22676k.m65745e(this.pieChart, biomarkerPieChartSectionModel.pieChart) && AbstractC22676k.m65745e(this.pieChartContent, biomarkerPieChartSectionModel.pieChartContent) && AbstractC22676k.m65745e(this.trendCounts, biomarkerPieChartSectionModel.trendCounts) && AbstractC22676k.m65745e(this.caption, biomarkerPieChartSectionModel.caption) && AbstractC22676k.m65745e(this.style, biomarkerPieChartSectionModel.style) && AbstractC22676k.m65745e(this.biomarkers, biomarkerPieChartSectionModel.biomarkers);
    }

    public final List<BiomarkerCardModel> getBiomarkers() {
        return this.biomarkers;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final String getId() {
        return this.id;
    }

    public final String getOrientation() {
        return this.orientation;
    }

    public final PieChartModel getPieChart() {
        return this.pieChart;
    }

    public final BiomarkerPieChartContentModel getPieChartContent() {
        return this.pieChartContent;
    }

    public final String getStyle() {
        return this.style;
    }

    public final List<TrendCountModel> getTrendCounts() {
        return this.trendCounts;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b((this.pieChartContent.hashCode() + ((this.pieChart.hashCode() + AbstractC11266d.m30450d(this.id.hashCode() * 31, 31, this.orientation)) * 31)) * 31, 31, this.trendCounts);
        String str = this.caption;
        int iHashCode = (iM31983b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.style;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<BiomarkerCardModel> list = this.biomarkers;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.orientation;
        PieChartModel pieChartModel = this.pieChart;
        BiomarkerPieChartContentModel biomarkerPieChartContentModel = this.pieChartContent;
        List<TrendCountModel> list = this.trendCounts;
        String str3 = this.caption;
        String str4 = this.style;
        List<BiomarkerCardModel> list2 = this.biomarkers;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("BiomarkerPieChartSectionModel(id=", str, ", orientation=", str2, ", pieChart=");
        sbM32001t.append(pieChartModel);
        sbM32001t.append(", pieChartContent=");
        sbM32001t.append(biomarkerPieChartContentModel);
        sbM32001t.append(", trendCounts=");
        AbstractC17176i.m48511m(", caption=", str3, ", style=", sbM32001t, list);
        return AbstractC30007c.m91840j(str4, ", biomarkers=", ")", sbM32001t, list2);
    }

    public BiomarkerPieChartSectionModel(String id4, String orientation, PieChartModel pieChart, BiomarkerPieChartContentModel pieChartContent, List<TrendCountModel> trendCounts, String str, String str2, List<BiomarkerCardModel> list) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(orientation, "orientation");
        AbstractC22676k.m65750j(pieChart, "pieChart");
        AbstractC22676k.m65750j(pieChartContent, "pieChartContent");
        AbstractC22676k.m65750j(trendCounts, "trendCounts");
        this.id = id4;
        this.orientation = orientation;
        this.pieChart = pieChart;
        this.pieChartContent = pieChartContent;
        this.trendCounts = trendCounts;
        this.caption = str;
        this.style = str2;
        this.biomarkers = list;
    }

    public /* synthetic */ BiomarkerPieChartSectionModel(String str, String str2, PieChartModel pieChartModel, BiomarkerPieChartContentModel biomarkerPieChartContentModel, List list, String str3, String str4, List list2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, pieChartModel, biomarkerPieChartContentModel, list, str3, str4, (i13 & 128) != 0 ? null : list2);
    }
}
