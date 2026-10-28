package com.whoop.design.models.items.graph.plot.bar;

import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel;
import com.whoop.design.models.items.graph.plot.scrubber.DataScrubberDetailsModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ou1.C28376a;
import p031b9.AbstractC2875y;
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
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBI\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010/\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b3\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b5\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "", "", "positionY", "height", "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;", "style", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "dataScrubberDetails", "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;", "theme", "<init>", "(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/bar/BarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "component3", "()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;", "component4", "()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "component5", "()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;", "copy", "(DDLcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getPositionY", "getHeight", "Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;", "getStyle", "Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;", "getDataScrubberDetails", "Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class BarModel {
    private final DataScrubberDetailsModel dataScrubberDetails;
    private final double height;
    private final double positionY;
    private final BarStyle style;
    private final BarTheme theme;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C28376a(23)), null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/bar/BarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return BarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public BarModel(double d3, double d14, BarStyle style, DataScrubberDetailsModel dataScrubberDetailsModel, BarTheme barTheme) {
        AbstractC22676k.m65750j(style, "style");
        this.positionY = d3;
        this.height = d14;
        this.style = style;
        this.dataScrubberDetails = dataScrubberDetailsModel;
        this.theme = barTheme;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.bar.BarStyle", BarStyle.values());
    }

    public static /* synthetic */ BarModel copy$default(BarModel barModel, double d3, double d14, BarStyle barStyle, DataScrubberDetailsModel dataScrubberDetailsModel, BarTheme barTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = barModel.positionY;
        }
        double d15 = d3;
        if ((i13 & 2) != 0) {
            d14 = barModel.height;
        }
        double d16 = d14;
        if ((i13 & 4) != 0) {
            barStyle = barModel.style;
        }
        BarStyle barStyle2 = barStyle;
        if ((i13 & 8) != 0) {
            dataScrubberDetailsModel = barModel.dataScrubberDetails;
        }
        DataScrubberDetailsModel dataScrubberDetailsModel2 = dataScrubberDetailsModel;
        if ((i13 & 16) != 0) {
            barTheme = barModel.theme;
        }
        return barModel.copy(d15, d16, barStyle2, dataScrubberDetailsModel2, barTheme);
    }

    public static final /* synthetic */ void write$Self$design_models_release(BarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.positionY, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.positionY);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.height, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.height);
        }
        output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.dataScrubberDetails != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DataScrubberDetailsModel$$serializer.INSTANCE, self.dataScrubberDetails);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, BarTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPositionY() {
        return this.positionY;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final BarStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final BarTheme getTheme() {
        return this.theme;
    }

    public final BarModel copy(double positionY, double height, BarStyle style, DataScrubberDetailsModel dataScrubberDetails, BarTheme theme) {
        AbstractC22676k.m65750j(style, "style");
        return new BarModel(positionY, height, style, dataScrubberDetails, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarModel)) {
            return false;
        }
        BarModel barModel = (BarModel) other;
        return Double.compare(this.positionY, barModel.positionY) == 0 && Double.compare(this.height, barModel.height) == 0 && this.style == barModel.style && AbstractC22676k.m65745e(this.dataScrubberDetails, barModel.dataScrubberDetails) && AbstractC22676k.m65745e(this.theme, barModel.theme);
    }

    public final DataScrubberDetailsModel getDataScrubberDetails() {
        return this.dataScrubberDetails;
    }

    public final double getHeight() {
        return this.height;
    }

    public final double getPositionY() {
        return this.positionY;
    }

    public final BarStyle getStyle() {
        return this.style;
    }

    public final BarTheme getTheme() {
        return this.theme;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC17176i.m48499a(Double.hashCode(this.positionY) * 31, 31, this.height)) * 31;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        int iHashCode2 = (iHashCode + (dataScrubberDetailsModel == null ? 0 : dataScrubberDetailsModel.hashCode())) * 31;
        BarTheme barTheme = this.theme;
        return iHashCode2 + (barTheme != null ? barTheme.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.positionY;
        double d14 = this.height;
        BarStyle barStyle = this.style;
        DataScrubberDetailsModel dataScrubberDetailsModel = this.dataScrubberDetails;
        BarTheme barTheme = this.theme;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("BarModel(positionY=", d3, ", height=");
        sbM8306s.append(d14);
        sbM8306s.append(", style=");
        sbM8306s.append(barStyle);
        sbM8306s.append(", dataScrubberDetails=");
        sbM8306s.append(dataScrubberDetailsModel);
        sbM8306s.append(", theme=");
        sbM8306s.append(barTheme);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ BarModel(int i13, double d3, double d14, BarStyle barStyle, DataScrubberDetailsModel dataScrubberDetailsModel, BarTheme barTheme, SerializationConstructorMarker serializationConstructorMarker) {
        if (4 != (i13 & 4)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 4, BarModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.positionY = 0.0d;
        } else {
            this.positionY = d3;
        }
        if ((i13 & 2) == 0) {
            this.height = 0.0d;
        } else {
            this.height = d14;
        }
        this.style = barStyle;
        if ((i13 & 8) == 0) {
            this.dataScrubberDetails = null;
        } else {
            this.dataScrubberDetails = dataScrubberDetailsModel;
        }
        if ((i13 & 16) == 0) {
            this.theme = null;
        } else {
            this.theme = barTheme;
        }
    }

    public /* synthetic */ BarModel(double d3, double d14, BarStyle barStyle, DataScrubberDetailsModel dataScrubberDetailsModel, BarTheme barTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0d : d3, (i13 & 2) != 0 ? 0.0d : d14, barStyle, (i13 & 8) != 0 ? null : dataScrubberDetailsModel, (i13 & 16) != 0 ? null : barTheme);
    }
}
