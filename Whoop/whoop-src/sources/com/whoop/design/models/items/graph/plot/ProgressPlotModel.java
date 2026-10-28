package com.whoop.design.models.items.graph.plot;

import com.whoop.design.models.items.graph.plot.progress.ProgressPlotStyle;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import d13.AbstractC11478a;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import na1.C26511a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0087\b\u0018\u0000 I2\u00020\u0001:\u0002JIBq\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011Bu\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001aJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001aJ\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010%Jz\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b)\u0010#J\u0010\u0010*\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\b2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010;\u001a\u0004\b=\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010@\u001a\u0004\bA\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\bB\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\bC\u0010\u001aR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010#R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010F\u001a\u0004\bG\u0010%R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bH\u0010%¨\u0006K"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;", "Lcom/whoop/design/models/items/graph/plot/GraphPlot;", "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;", "style", "", "rangeMin", "rangeMax", "currentValue", "", "showAnnotation", "height", "yposition", "", "id", "hideWhileScrubbing", "skipScrubbing", "<init>", "(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;", "component2", "()D", "component3", "component4", "()Ljava/lang/Double;", "component5", "()Z", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "()Ljava/lang/Boolean;", "component10", "copy", "(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;DDLjava/lang/Double;ZDDLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;Lzc3/c;Lyc3/g;)V", "write$Self", "Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;", "getStyle", "D", "getRangeMin", "getRangeMax", "Ljava/lang/Double;", "getCurrentValue", "Z", "getShowAnnotation", "getHeight", "getYposition", "Ljava/lang/String;", "getId", "Ljava/lang/Boolean;", "getHideWhileScrubbing", "getSkipScrubbing", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ProgressPlotModel extends GraphPlot {
    public static final int $stable = 0;
    private final Double currentValue;
    private final double height;
    private final Boolean hideWhileScrubbing;
    private final String id;
    private final double rangeMax;
    private final double rangeMin;
    private final boolean showAnnotation;
    private final Boolean skipScrubbing;
    private final ProgressPlotStyle style;
    private final double yposition;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {AbstractC30060g.m92087G(EnumC23463i.f92934x, new C26511a(10)), null, null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ProgressPlotModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public ProgressPlotModel() {
        this((ProgressPlotStyle) null, 0.0d, 0.0d, (Double) null, false, 0.0d, 0.0d, (String) null, (Boolean) null, (Boolean) null, 1023, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.progress.ProgressPlotStyle", ProgressPlotStyle.values());
    }

    public static final /* synthetic */ void write$Self$design_models_release(ProgressPlotModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.style != ProgressPlotStyle.PREGNANCY_NONE) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.rangeMin, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.rangeMin);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.rangeMax, 1.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.rangeMax);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.currentValue != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, DoubleSerializer.INSTANCE, self.currentValue);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.showAnnotation) {
            output.encodeBooleanElement(serialDesc, 4, self.showAnnotation);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || Double.compare(self.height, 0.02d) != 0) {
            output.encodeDoubleElement(serialDesc, 5, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || Double.compare(self.yposition, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 6, self.yposition);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || !AbstractC22676k.m65745e(self.id, "ProgressPlot")) {
            output.encodeStringElement(serialDesc, 7, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || !AbstractC22676k.m65745e(self.getHideWhileScrubbing(), Boolean.FALSE)) {
            output.encodeNullableSerializableElement(serialDesc, 8, BooleanSerializer.INSTANCE, self.getHideWhileScrubbing());
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.getSkipScrubbing() == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, BooleanSerializer.INSTANCE, self.getSkipScrubbing());
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ProgressPlotStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getRangeMin() {
        return this.rangeMin;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getRangeMax() {
        return this.rangeMax;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Double getCurrentValue() {
        return this.currentValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShowAnnotation() {
        return this.showAnnotation;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getYposition() {
        return this.yposition;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final ProgressPlotModel copy(ProgressPlotStyle style, double rangeMin, double rangeMax, Double currentValue, boolean showAnnotation, double height, double yposition, String id4, Boolean hideWhileScrubbing, Boolean skipScrubbing) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        return new ProgressPlotModel(style, rangeMin, rangeMax, currentValue, showAnnotation, height, yposition, id4, hideWhileScrubbing, skipScrubbing);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProgressPlotModel)) {
            return false;
        }
        ProgressPlotModel progressPlotModel = (ProgressPlotModel) other;
        return this.style == progressPlotModel.style && Double.compare(this.rangeMin, progressPlotModel.rangeMin) == 0 && Double.compare(this.rangeMax, progressPlotModel.rangeMax) == 0 && AbstractC22676k.m65745e(this.currentValue, progressPlotModel.currentValue) && this.showAnnotation == progressPlotModel.showAnnotation && Double.compare(this.height, progressPlotModel.height) == 0 && Double.compare(this.yposition, progressPlotModel.yposition) == 0 && AbstractC22676k.m65745e(this.id, progressPlotModel.id) && AbstractC22676k.m65745e(this.hideWhileScrubbing, progressPlotModel.hideWhileScrubbing) && AbstractC22676k.m65745e(this.skipScrubbing, progressPlotModel.skipScrubbing);
    }

    public final Double getCurrentValue() {
        return this.currentValue;
    }

    public final double getHeight() {
        return this.height;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getHideWhileScrubbing() {
        return this.hideWhileScrubbing;
    }

    public final String getId() {
        return this.id;
    }

    public final double getRangeMax() {
        return this.rangeMax;
    }

    public final double getRangeMin() {
        return this.rangeMin;
    }

    public final boolean getShowAnnotation() {
        return this.showAnnotation;
    }

    @Override // com.whoop.design.models.items.graph.plot.GraphPlot
    public Boolean getSkipScrubbing() {
        return this.skipScrubbing;
    }

    public final ProgressPlotStyle getStyle() {
        return this.style;
    }

    public final double getYposition() {
        return this.yposition;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(this.style.hashCode() * 31, 31, this.rangeMin), 31, this.rangeMax);
        Double d3 = this.currentValue;
        int iM30450d = AbstractC11266d.m30450d(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC2875y.m8289b((iM48499a + (d3 == null ? 0 : d3.hashCode())) * 31, 31, this.showAnnotation), 31, this.height), 31, this.yposition), 31, this.id);
        Boolean bool = this.hideWhileScrubbing;
        int iHashCode = (iM30450d + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.skipScrubbing;
        return iHashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public String toString() {
        ProgressPlotStyle progressPlotStyle = this.style;
        double d3 = this.rangeMin;
        double d14 = this.rangeMax;
        Double d15 = this.currentValue;
        boolean z4 = this.showAnnotation;
        double d16 = this.height;
        double d17 = this.yposition;
        String str = this.id;
        Boolean bool = this.hideWhileScrubbing;
        Boolean bool2 = this.skipScrubbing;
        StringBuilder sb4 = new StringBuilder("ProgressPlotModel(style=");
        sb4.append(progressPlotStyle);
        sb4.append(", rangeMin=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", rangeMax=", d14, ", currentValue=");
        sb4.append(d15);
        sb4.append(", showAnnotation=");
        sb4.append(z4);
        sb4.append(", height=");
        sb4.append(d16);
        AbstractC31061c.m95622B(sb4, ", yposition=", d17, ", id=");
        AbstractC36095b.m114692t(bool, str, ", hideWhileScrubbing=", ", skipScrubbing=", sb4);
        return AbstractC11478a.m30858j(sb4, bool2, ")");
    }

    public /* synthetic */ ProgressPlotModel(int i13, ProgressPlotStyle progressPlotStyle, double d3, double d14, Double d15, boolean z4, double d16, double d17, String str, Boolean bool, Boolean bool2, SerializationConstructorMarker serializationConstructorMarker) {
        super(null);
        this.style = (i13 & 1) == 0 ? ProgressPlotStyle.PREGNANCY_NONE : progressPlotStyle;
        if ((i13 & 2) == 0) {
            this.rangeMin = 0.0d;
        } else {
            this.rangeMin = d3;
        }
        if ((i13 & 4) == 0) {
            this.rangeMax = 1.0d;
        } else {
            this.rangeMax = d14;
        }
        if ((i13 & 8) == 0) {
            this.currentValue = null;
        } else {
            this.currentValue = d15;
        }
        if ((i13 & 16) == 0) {
            this.showAnnotation = false;
        } else {
            this.showAnnotation = z4;
        }
        if ((i13 & 32) == 0) {
            this.height = 0.02d;
        } else {
            this.height = d16;
        }
        if ((i13 & 64) == 0) {
            this.yposition = 0.0d;
        } else {
            this.yposition = d17;
        }
        this.id = (i13 & 128) == 0 ? "ProgressPlot" : str;
        this.hideWhileScrubbing = (i13 & 256) == 0 ? Boolean.FALSE : bool;
        if ((i13 & 512) == 0) {
            this.skipScrubbing = null;
        } else {
            this.skipScrubbing = bool2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProgressPlotModel(ProgressPlotStyle style, double d3, double d14, Double d15, boolean z4, double d16, double d17, String id4, Boolean bool, Boolean bool2) {
        super(null);
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(id4, "id");
        this.style = style;
        this.rangeMin = d3;
        this.rangeMax = d14;
        this.currentValue = d15;
        this.showAnnotation = z4;
        this.height = d16;
        this.yposition = d17;
        this.id = id4;
        this.hideWhileScrubbing = bool;
        this.skipScrubbing = bool2;
    }

    public /* synthetic */ ProgressPlotModel(ProgressPlotStyle progressPlotStyle, double d3, double d14, Double d15, boolean z4, double d16, double d17, String str, Boolean bool, Boolean bool2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? ProgressPlotStyle.PREGNANCY_NONE : progressPlotStyle, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? 1.0d : d14, (i13 & 8) != 0 ? null : d15, (i13 & 16) != 0 ? false : z4, (i13 & 32) != 0 ? 0.02d : d16, (i13 & 64) == 0 ? d17 : 0.0d, (i13 & 128) != 0 ? "ProgressPlot" : str, (i13 & 256) != 0 ? Boolean.FALSE : bool, (i13 & 512) != 0 ? null : bool2);
    }
}
