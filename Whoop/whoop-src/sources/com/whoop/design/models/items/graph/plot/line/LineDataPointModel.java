package com.whoop.design.models.items.graph.plot.line;

import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel;
import com.whoop.design.models.items.graph.plot.GraphPlotLabelModel$$serializer;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0002HGB_\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Be\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b.\u0010/Jh\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b0\u00101J\u0010\u00102\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b2\u0010)J\u0010\u00103\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b3\u00104J\u001a\u00106\u001a\u00020\u00022\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00108\u001a\u0004\b9\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\b;\u0010$R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b<\u0010$R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010=\u001a\u0004\b>\u0010'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\b@\u0010)R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010A\u001a\u0004\bB\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bF\u0010/¨\u0006I"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;", "", "", "visible", "", "positionX", "positionY", "Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;", "style", "", "accessibilityLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "dataScrubberDetails", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "graphLabel", "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "theme", "<init>", "(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()D", "component3", "component4", "()Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;", "component5", "()Ljava/lang/String;", "component6", "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "component7", "()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "component8", "()Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "copy", "(ZDDLcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisible", "D", "getPositionX", "getPositionY", "Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;", "getStyle", "Ljava/lang/String;", "getAccessibilityLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "getDataScrubberDetails", "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;", "getGraphLabel", "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LineDataPointModel {
    private final String accessibilityLabel;
    private final DataScrubberDetailsModel dataScrubberDetails;
    private final GraphPlotLabelModel graphLabel;
    private final double positionX;
    private final double positionY;
    private final LinePointStyle style;
    private final LinePointTheme theme;
    private final boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(19)), null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LineDataPointModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public LineDataPointModel() {
        this(false, 0.0d, 0.0d, (LinePointStyle) null, (String) null, (DataScrubberDetailsModel) null, (GraphPlotLabelModel) null, (LinePointTheme) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.LinePointStyle", LinePointStyle.values());
    }

    public static /* synthetic */ LineDataPointModel copy$default(LineDataPointModel lineDataPointModel, boolean z4, double d3, double d14, LinePointStyle linePointStyle, String str, DataScrubberDetailsModel dataScrubberDetailsModel, GraphPlotLabelModel graphPlotLabelModel, LinePointTheme linePointTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = lineDataPointModel.visible;
        }
        if ((i13 & 2) != 0) {
            d3 = lineDataPointModel.positionX;
        }
        if ((i13 & 4) != 0) {
            d14 = lineDataPointModel.positionY;
        }
        if ((i13 & 8) != 0) {
            linePointStyle = lineDataPointModel.style;
        }
        if ((i13 & 16) != 0) {
            str = lineDataPointModel.accessibilityLabel;
        }
        if ((i13 & 32) != 0) {
            dataScrubberDetailsModel = lineDataPointModel.dataScrubberDetails;
        }
        if ((i13 & 64) != 0) {
            graphPlotLabelModel = lineDataPointModel.graphLabel;
        }
        if ((i13 & 128) != 0) {
            linePointTheme = lineDataPointModel.theme;
        }
        LinePointTheme linePointTheme2 = linePointTheme;
        DataScrubberDetailsModel dataScrubberDetailsModel2 = dataScrubberDetailsModel;
        LinePointStyle linePointStyle2 = linePointStyle;
        double d15 = d14;
        return lineDataPointModel.copy(z4, d3, d15, linePointStyle2, str, dataScrubberDetailsModel2, graphPlotLabelModel, linePointTheme2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LineDataPointModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.visible) {
            output.encodeBooleanElement(serialDesc, 0, self.visible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.positionX, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.positionX);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.positionY, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.positionY);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != LinePointStyle.NONE) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.accessibilityLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.accessibilityLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.dataScrubberDetails != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DataScrubberDetailsModel$$serializer.INSTANCE, self.dataScrubberDetails);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.graphLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, GraphPlotLabelModel$$serializer.INSTANCE, self.graphLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, LinePointTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getVisible() {
        return this.visible;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final LinePointStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphPlotLabelModel getGraphLabel() {
        return this.graphLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final LinePointTheme getTheme() {
        return this.theme;
    }

    public final LineDataPointModel copy(boolean visible, double positionX, double positionY, LinePointStyle style, String accessibilityLabel, DataScrubberDetailsModel dataScrubberDetails, GraphPlotLabelModel graphLabel, LinePointTheme theme) {
        AbstractC22676k.m65750j(style, "style");
        return new LineDataPointModel(visible, positionX, positionY, style, accessibilityLabel, dataScrubberDetails, graphLabel, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LineDataPointModel)) {
            return false;
        }
        LineDataPointModel lineDataPointModel = (LineDataPointModel) other;
        return this.visible == lineDataPointModel.visible && Double.compare(this.positionX, lineDataPointModel.positionX) == 0 && Double.compare(this.positionY, lineDataPointModel.positionY) == 0 && this.style == lineDataPointModel.style && AbstractC22676k.m65745e(this.accessibilityLabel, lineDataPointModel.accessibilityLabel) && AbstractC22676k.m65745e(this.dataScrubberDetails, lineDataPointModel.dataScrubberDetails) && AbstractC22676k.m65745e(this.graphLabel, lineDataPointModel.graphLabel) && AbstractC22676k.m65745e(this.theme, lineDataPointModel.theme);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    public final GraphPlotLabelModel getGraphLabel() {
        return this.graphLabel;
    }

    public final double getPositionX() {
        return this.positionX;
    }

    public final double getPositionY() {
        return this.positionY;
    }

    public final LinePointStyle getStyle() {
        return this.style;
    }

    public final LinePointTheme getTheme() {
        return this.theme;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(Boolean.hashCode(this.visible) * 31, 31, this.positionX), 31, this.positionY)) * 31;
        String str = this.accessibilityLabel;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        int iHashCode3 = (iHashCode2 + (dataScrubberDetailsModel == null ? 0 : dataScrubberDetailsModel.hashCode())) * 31;
        GraphPlotLabelModel graphPlotLabelModel = this.graphLabel;
        int iHashCode4 = (iHashCode3 + (graphPlotLabelModel == null ? 0 : graphPlotLabelModel.hashCode())) * 31;
        LinePointTheme linePointTheme = this.theme;
        return iHashCode4 + (linePointTheme != null ? linePointTheme.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.visible;
        double d3 = this.positionX;
        double d14 = this.positionY;
        LinePointStyle linePointStyle = this.style;
        String str = this.accessibilityLabel;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        GraphPlotLabelModel graphPlotLabelModel = this.graphLabel;
        LinePointTheme linePointTheme = this.theme;
        StringBuilder sb4 = new StringBuilder("LineDataPointModel(visible=");
        sb4.append(z4);
        sb4.append(", positionX=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", positionY=", d14, ", style=");
        sb4.append(linePointStyle);
        sb4.append(", accessibilityLabel=");
        sb4.append(str);
        sb4.append(", dataScrubberDetails=");
        sb4.append(dataScrubberDetailsModel);
        sb4.append(", graphLabel=");
        sb4.append(graphPlotLabelModel);
        sb4.append(", theme=");
        sb4.append(linePointTheme);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ LineDataPointModel(int i13, boolean z4, double d3, double d14, LinePointStyle linePointStyle, String str, DataScrubberDetailsModel dataScrubberDetailsModel, GraphPlotLabelModel graphPlotLabelModel, LinePointTheme linePointTheme, SerializationConstructorMarker serializationConstructorMarker) {
        this.visible = (i13 & 1) == 0 ? false : z4;
        if ((i13 & 2) == 0) {
            this.positionX = 0.0d;
        } else {
            this.positionX = d3;
        }
        if ((i13 & 4) == 0) {
            this.positionY = 0.0d;
        } else {
            this.positionY = d14;
        }
        if ((i13 & 8) == 0) {
            this.style = LinePointStyle.NONE;
        } else {
            this.style = linePointStyle;
        }
        if ((i13 & 16) == 0) {
            this.accessibilityLabel = null;
        } else {
            this.accessibilityLabel = str;
        }
        if ((i13 & 32) == 0) {
            this.dataScrubberDetails = null;
        } else {
            this.dataScrubberDetails = dataScrubberDetailsModel;
        }
        if ((i13 & 64) == 0) {
            this.graphLabel = null;
        } else {
            this.graphLabel = graphPlotLabelModel;
        }
        if ((i13 & 128) == 0) {
            this.theme = null;
        } else {
            this.theme = linePointTheme;
        }
    }

    public LineDataPointModel(boolean z4, double d3, double d14, LinePointStyle style, String str, DataScrubberDetailsModel dataScrubberDetailsModel, GraphPlotLabelModel graphPlotLabelModel, LinePointTheme linePointTheme) {
        AbstractC22676k.m65750j(style, "style");
        this.visible = z4;
        this.positionX = d3;
        this.positionY = d14;
        this.style = style;
        this.accessibilityLabel = str;
        this.dataScrubberDetails = dataScrubberDetailsModel;
        this.graphLabel = graphPlotLabelModel;
        this.theme = linePointTheme;
    }

    public /* synthetic */ LineDataPointModel(boolean z4, double d3, double d14, LinePointStyle linePointStyle, String str, DataScrubberDetailsModel dataScrubberDetailsModel, GraphPlotLabelModel graphPlotLabelModel, LinePointTheme linePointTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? 0.0d : d14, (i13 & 8) != 0 ? LinePointStyle.NONE : linePointStyle, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : dataScrubberDetailsModel, (i13 & 64) != 0 ? null : graphPlotLabelModel, (i13 & 128) != 0 ? null : linePointTheme);
    }
}
