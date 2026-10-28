package com.whoop.design.models.items.graph.plot.band;

import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import nx1.C27219a;
import p000.AbstractC11266d;
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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BAB[\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bc\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jd\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b8\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b9\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010:\u001a\u0004\b;\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b=\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b>\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010+¨\u0006C"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;", "", "", "visible", "", "positionX", "positionBottomY", "positionTopY", "Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;", "style", "", "accessibilityLabel", "graphLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "dataScrubberDetails", "<init>", "(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Z", "component2", "()D", "component3", "component4", "component5", "()Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;", "component6", "()Ljava/lang/String;", "component7", "component8", "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "copy", "(ZDDDLcom/whoop/design/models/items/graph/plot/band/BandPointStyle;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "getVisible", "D", "getPositionX", "getPositionBottomY", "getPositionTopY", "Lcom/whoop/design/models/items/graph/plot/band/BandPointStyle;", "getStyle", "Ljava/lang/String;", "getAccessibilityLabel", "getGraphLabel", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "getDataScrubberDetails", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BandDataPointModel {
    private final String accessibilityLabel;
    private final DataScrubberDetailsModel dataScrubberDetails;
    private final String graphLabel;
    private final double positionBottomY;
    private final double positionTopY;
    private final double positionX;
    private final BandPointStyle style;
    private final boolean visible;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C27219a(18)), null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BandDataPointModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BandDataPointModel() {
        this(false, 0.0d, 0.0d, 0.0d, (BandPointStyle) null, (String) null, (String) null, (DataScrubberDetailsModel) null, 255, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.band.BandPointStyle", BandPointStyle.values());
    }

    public static /* synthetic */ BandDataPointModel copy$default(BandDataPointModel bandDataPointModel, boolean z4, double d3, double d14, double d15, BandPointStyle bandPointStyle, String str, String str2, DataScrubberDetailsModel dataScrubberDetailsModel, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = bandDataPointModel.visible;
        }
        if ((i13 & 2) != 0) {
            d3 = bandDataPointModel.positionX;
        }
        if ((i13 & 4) != 0) {
            d14 = bandDataPointModel.positionBottomY;
        }
        if ((i13 & 8) != 0) {
            d15 = bandDataPointModel.positionTopY;
        }
        if ((i13 & 16) != 0) {
            bandPointStyle = bandDataPointModel.style;
        }
        if ((i13 & 32) != 0) {
            str = bandDataPointModel.accessibilityLabel;
        }
        if ((i13 & 64) != 0) {
            str2 = bandDataPointModel.graphLabel;
        }
        if ((i13 & 128) != 0) {
            dataScrubberDetailsModel = bandDataPointModel.dataScrubberDetails;
        }
        double d16 = d15;
        double d17 = d14;
        return bandDataPointModel.copy(z4, d3, d17, d16, bandPointStyle, str, str2, dataScrubberDetailsModel);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BandDataPointModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.visible) {
            output.encodeBooleanElement(serialDesc, 0, self.visible);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.positionX, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.positionX);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.positionBottomY, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.positionBottomY);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.positionTopY, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.positionTopY);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.style != BandPointStyle.NONE) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || !AbstractC22676k.m65745e(self.accessibilityLabel, "")) {
            output.encodeStringElement(serialDesc, 5, self.accessibilityLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.graphLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.graphLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 7) && self.dataScrubberDetails == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 7, DataScrubberDetailsModel$$serializer.INSTANCE, self.dataScrubberDetails);
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
    public final double getPositionBottomY() {
        return this.positionBottomY;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getPositionTopY() {
        return this.positionTopY;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BandPointStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getGraphLabel() {
        return this.graphLabel;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    public final BandDataPointModel copy(boolean visible, double positionX, double positionBottomY, double positionTopY, BandPointStyle style, String accessibilityLabel, String graphLabel, DataScrubberDetailsModel dataScrubberDetails) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        return new BandDataPointModel(visible, positionX, positionBottomY, positionTopY, style, accessibilityLabel, graphLabel, dataScrubberDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BandDataPointModel)) {
            return false;
        }
        BandDataPointModel bandDataPointModel = (BandDataPointModel) other;
        return this.visible == bandDataPointModel.visible && Double.compare(this.positionX, bandDataPointModel.positionX) == 0 && Double.compare(this.positionBottomY, bandDataPointModel.positionBottomY) == 0 && Double.compare(this.positionTopY, bandDataPointModel.positionTopY) == 0 && this.style == bandDataPointModel.style && AbstractC22676k.m65745e(this.accessibilityLabel, bandDataPointModel.accessibilityLabel) && AbstractC22676k.m65745e(this.graphLabel, bandDataPointModel.graphLabel) && AbstractC22676k.m65745e(this.dataScrubberDetails, bandDataPointModel.dataScrubberDetails);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    public final String getGraphLabel() {
        return this.graphLabel;
    }

    public final double getPositionBottomY() {
        return this.positionBottomY;
    }

    public final double getPositionTopY() {
        return this.positionTopY;
    }

    public final double getPositionX() {
        return this.positionX;
    }

    public final BandPointStyle getStyle() {
        return this.style;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.style.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Boolean.hashCode(this.visible) * 31, 31, this.positionX), 31, this.positionBottomY), 31, this.positionTopY)) * 31, 31, this.accessibilityLabel);
        String str = this.graphLabel;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        return iHashCode + (dataScrubberDetailsModel != null ? dataScrubberDetailsModel.hashCode() : 0);
    }

    public String toString() {
        boolean z4 = this.visible;
        double d3 = this.positionX;
        double d14 = this.positionBottomY;
        double d15 = this.positionTopY;
        BandPointStyle bandPointStyle = this.style;
        String str = this.accessibilityLabel;
        String str2 = this.graphLabel;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        StringBuilder sb4 = new StringBuilder("BandDataPointModel(visible=");
        sb4.append(z4);
        sb4.append(", positionX=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", positionBottomY=", d14, ", positionTopY=");
        sb4.append(d15);
        sb4.append(", style=");
        sb4.append(bandPointStyle);
        AbstractC11266d.m30444B(sb4, ", accessibilityLabel=", str, ", graphLabel=", str2);
        sb4.append(", dataScrubberDetails=");
        sb4.append(dataScrubberDetailsModel);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ BandDataPointModel(int i13, boolean z4, double d3, double d14, double d15, BandPointStyle bandPointStyle, String str, String str2, DataScrubberDetailsModel dataScrubberDetailsModel, SerializationConstructorMarker serializationConstructorMarker) {
        this.visible = (i13 & 1) == 0 ? false : z4;
        if ((i13 & 2) == 0) {
            this.positionX = 0.0d;
        } else {
            this.positionX = d3;
        }
        if ((i13 & 4) == 0) {
            this.positionBottomY = 0.0d;
        } else {
            this.positionBottomY = d14;
        }
        if ((i13 & 8) == 0) {
            this.positionTopY = 0.0d;
        } else {
            this.positionTopY = d15;
        }
        if ((i13 & 16) == 0) {
            this.style = BandPointStyle.NONE;
        } else {
            this.style = bandPointStyle;
        }
        if ((i13 & 32) == 0) {
            this.accessibilityLabel = "";
        } else {
            this.accessibilityLabel = str;
        }
        if ((i13 & 64) == 0) {
            this.graphLabel = null;
        } else {
            this.graphLabel = str2;
        }
        if ((i13 & 128) == 0) {
            this.dataScrubberDetails = null;
        } else {
            this.dataScrubberDetails = dataScrubberDetailsModel;
        }
    }

    public BandDataPointModel(boolean z4, double d3, double d14, double d15, BandPointStyle style, String accessibilityLabel, String str, DataScrubberDetailsModel dataScrubberDetailsModel) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(accessibilityLabel, "accessibilityLabel");
        this.visible = z4;
        this.positionX = d3;
        this.positionBottomY = d14;
        this.positionTopY = d15;
        this.style = style;
        this.accessibilityLabel = accessibilityLabel;
        this.graphLabel = str;
        this.dataScrubberDetails = dataScrubberDetailsModel;
    }

    public /* synthetic */ BandDataPointModel(boolean z4, double d3, double d14, double d15, BandPointStyle bandPointStyle, String str, String str2, DataScrubberDetailsModel dataScrubberDetailsModel, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? 0.0d : d14, (i13 & 8) != 0 ? 0.0d : d15, (i13 & 16) != 0 ? BandPointStyle.NONE : bandPointStyle, (i13 & 32) != 0 ? "" : str, (i13 & 64) != 0 ? null : str2, (i13 & 128) != 0 ? null : dataScrubberDetailsModel);
    }
}
