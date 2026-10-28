package com.whoop.design.models.items.graph.plot.bar;

import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel$$serializer;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
import ou1.C28376a;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 @2\u00020\u0001:\u0002A@B[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010)Jd\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b-\u0010'J\u0010\u0010.\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b.\u0010/J\u001a\u00102\u001a\u0002012\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010 R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00107\u001a\u0004\b8\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\b?\u0010)¨\u0006B"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;", "", "", "positionX", "width", "", "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "bars", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "dataScrubberDetails", "", "accessibilityLabel", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "topLabel", "bottomLabel", "<init>", "(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "()Ljava/util/List;", "component4", "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "component7", "copy", "(DDLjava/util/List;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getPositionX", "getWidth", "Ljava/util/List;", "getBars", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "getDataScrubberDetails", "Ljava/lang/String;", "getAccessibilityLabel", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "getTopLabel", "getBottomLabel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarGroupModel {
    private final String accessibilityLabel;
    private final List<BarModel> bars;
    private final GraphPlotLabelModel bottomLabel;
    private final DataScrubberDetailsModel dataScrubberDetails;
    private final double positionX;
    private final GraphPlotLabelModel topLabel;
    private final double width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C28376a(22)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarGroupModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BarGroupModel() {
        this(0.0d, 0.0d, (List) null, (DataScrubberDetailsModel) null, (String) null, (GraphPlotLabelModel) null, (GraphPlotLabelModel) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(BarModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BarGroupModel copy$default(BarGroupModel barGroupModel, double d3, double d14, List list, DataScrubberDetailsModel dataScrubberDetailsModel, String str, GraphPlotLabelModel graphPlotLabelModel, GraphPlotLabelModel graphPlotLabelModel2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = barGroupModel.positionX;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            d14 = barGroupModel.width;
        }
        double d16 = d14;
        if ((i13 & 4) != 0) {
            list = barGroupModel.bars;
        }
        return barGroupModel.copy(d15, d16, list, (i13 & 8) != 0 ? barGroupModel.dataScrubberDetails : dataScrubberDetailsModel, (i13 & 16) != 0 ? barGroupModel.accessibilityLabel : str, (i13 & 32) != 0 ? barGroupModel.topLabel : graphPlotLabelModel, (i13 & 64) != 0 ? barGroupModel.bottomLabel : graphPlotLabelModel2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarGroupModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.positionX, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.positionX);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.width, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.width);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.bars, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.bars);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.dataScrubberDetails != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DataScrubberDetailsModel$$serializer.INSTANCE, self.dataScrubberDetails);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.accessibilityLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.accessibilityLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.topLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, GraphPlotLabelModel$$serializer.INSTANCE, self.topLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.bottomLabel == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, GraphPlotLabelModel$$serializer.INSTANCE, self.bottomLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    public final List<BarModel> component3() {
        return this.bars;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final GraphPlotLabelModel getTopLabel() {
        return this.topLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphPlotLabelModel getBottomLabel() {
        return this.bottomLabel;
    }

    public final BarGroupModel copy(double positionX, double width, List<BarModel> bars, DataScrubberDetailsModel dataScrubberDetails, String accessibilityLabel, GraphPlotLabelModel topLabel, GraphPlotLabelModel bottomLabel) {
        AbstractC22676k.m65750j(bars, "bars");
        return new BarGroupModel(positionX, width, bars, dataScrubberDetails, accessibilityLabel, topLabel, bottomLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarGroupModel)) {
            return false;
        }
        BarGroupModel barGroupModel = (BarGroupModel) other;
        return Double.compare(this.positionX, barGroupModel.positionX) == 0 && Double.compare(this.width, barGroupModel.width) == 0 && AbstractC22676k.m65745e(this.bars, barGroupModel.bars) && AbstractC22676k.m65745e(this.dataScrubberDetails, barGroupModel.dataScrubberDetails) && AbstractC22676k.m65745e(this.accessibilityLabel, barGroupModel.accessibilityLabel) && AbstractC22676k.m65745e(this.topLabel, barGroupModel.topLabel) && AbstractC22676k.m65745e(this.bottomLabel, barGroupModel.bottomLabel);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final List<BarModel> getBars() {
        return this.bars;
    }

    public final GraphPlotLabelModel getBottomLabel() {
        return this.bottomLabel;
    }

    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    public final double getPositionX() {
        return this.positionX;
    }

    public final GraphPlotLabelModel getTopLabel() {
        return this.topLabel;
    }

    public final double getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC17176i.m48499a(Double.hashCode(this.positionX) * 31, 31, this.width), 31, this.bars);
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        int iHashCode = (iM31983b + (dataScrubberDetailsModel == null ? 0 : dataScrubberDetailsModel.hashCode())) * 31;
        String str = this.accessibilityLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GraphPlotLabelModel graphPlotLabelModel = this.topLabel;
        int iHashCode3 = (iHashCode2 + (graphPlotLabelModel == null ? 0 : graphPlotLabelModel.hashCode())) * 31;
        GraphPlotLabelModel graphPlotLabelModel2 = this.bottomLabel;
        return iHashCode3 + (graphPlotLabelModel2 != null ? graphPlotLabelModel2.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.positionX;
        double d14 = this.width;
        List<BarModel> list = this.bars;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        String str = this.accessibilityLabel;
        GraphPlotLabelModel graphPlotLabelModel = this.topLabel;
        GraphPlotLabelModel graphPlotLabelModel2 = this.bottomLabel;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("BarGroupModel(positionX=", d3, ", width=");
        sbM8306s.append(d14);
        sbM8306s.append(", bars=");
        sbM8306s.append(list);
        sbM8306s.append(", dataScrubberDetails=");
        sbM8306s.append(dataScrubberDetailsModel);
        sbM8306s.append(", accessibilityLabel=");
        sbM8306s.append(str);
        sbM8306s.append(", topLabel=");
        sbM8306s.append(graphPlotLabelModel);
        sbM8306s.append(", bottomLabel=");
        sbM8306s.append(graphPlotLabelModel2);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public BarGroupModel(double d3, double d14, List<BarModel> bars, DataScrubberDetailsModel dataScrubberDetailsModel, String str, GraphPlotLabelModel graphPlotLabelModel, GraphPlotLabelModel graphPlotLabelModel2) {
        AbstractC22676k.m65750j(bars, "bars");
        this.positionX = d3;
        this.width = d14;
        this.bars = bars;
        this.dataScrubberDetails = dataScrubberDetailsModel;
        this.accessibilityLabel = str;
        this.topLabel = graphPlotLabelModel;
        this.bottomLabel = graphPlotLabelModel2;
    }

    public /* synthetic */ BarGroupModel(int i13, double d3, double d14, List list, DataScrubberDetailsModel dataScrubberDetailsModel, String str, GraphPlotLabelModel graphPlotLabelModel, GraphPlotLabelModel graphPlotLabelModel2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.positionX = 0.0d;
        } else {
            this.positionX = d3;
        }
        if ((i13 & 2) == 0) {
            this.width = 0.0d;
        } else {
            this.width = d14;
        }
        if ((i13 & 4) == 0) {
            this.bars = C25271y.f99162w;
        } else {
            this.bars = list;
        }
        if ((i13 & 8) == 0) {
            this.dataScrubberDetails = null;
        } else {
            this.dataScrubberDetails = dataScrubberDetailsModel;
        }
        if ((i13 & 16) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str;
        }
        if ((i13 & 32) == 0) {
            this.topLabel = null;
        } else {
            this.topLabel = graphPlotLabelModel;
        }
        if ((i13 & 64) == 0) {
            this.bottomLabel = null;
        } else {
            this.bottomLabel = graphPlotLabelModel2;
        }
    }

    public /* synthetic */ BarGroupModel(double d3, double d14, List list, DataScrubberDetailsModel dataScrubberDetailsModel, String str, GraphPlotLabelModel graphPlotLabelModel, GraphPlotLabelModel graphPlotLabelModel2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0d : d3, (i13 & 2) != 0 ? 0.0d : d14, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? null : dataScrubberDetailsModel, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : graphPlotLabelModel, (i13 & 64) != 0 ? null : graphPlotLabelModel2);
    }
}
