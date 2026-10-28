package com.whoop.design.models.items.graph.plane.annotations;

import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ga1.C15621b;
import hc3.AbstractC17176i;
import j61.EnumC21367a;
import j61.EnumC21368b;
import j61.EnumC21370d;
import j61.EnumC21371e;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import no.nordicsemi.android.dfu.DfuBaseService;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB{\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010'J\u0012\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0086\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b/\u0010'J\u0010\u00100\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010?\u0012\u0004\bA\u0010B\u001a\u0004\b@\u0010\u001cR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010?\u0012\u0004\bD\u0010B\u001a\u0004\bC\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010?\u001a\u0004\bE\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bF\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bH\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010I\u001a\u0004\bJ\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010K\u001a\u0004\bL\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010M\u001a\u0004\bN\u0010'R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010O\u001a\u0004\bP\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010M\u001a\u0004\bQ\u0010'R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010R\u001a\u0004\bS\u0010,¨\u0006V"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "", "", "xPosition", "yPosition", "width", "height", "Lj61/d;", "style", "Lj61/e;", "type", "Lj61/a;", "dimension", "", "label", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;", "alignment", "subLabel", "Lj61/b;", "labelStyle", "<init>", "(DDDDLj61/d;Lj61/e;Lj61/a;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;Ljava/lang/String;Lj61/b;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDDDDLj61/d;Lj61/e;Lj61/a;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;Ljava/lang/String;Lj61/b;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()D", "component2", "component3", "component4", "component5", "()Lj61/d;", "component6", "()Lj61/e;", "component7", "()Lj61/a;", "component8", "()Ljava/lang/String;", "component9", "()Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;", "component10", "component11", "()Lj61/b;", "copy", "(DDDDLj61/d;Lj61/e;Lj61/a;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;Ljava/lang/String;Lj61/b;)Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;Lzc3/c;Lyc3/g;)V", "write$Self", "D", "getXPosition", "getXPosition$annotations", "()V", "getYPosition", "getYPosition$annotations", "getWidth", "getHeight", "Lj61/d;", "getStyle", "Lj61/e;", "getType", "Lj61/a;", "getDimension", "Ljava/lang/String;", "getLabel", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;", "getAlignment", "getSubLabel", "Lj61/b;", "getLabelStyle", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphAnnotationModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final GraphAnnotationLabelAlignment alignment;
    private final EnumC21367a dimension;
    private final double height;
    private final String label;
    private final EnumC21368b labelStyle;
    private final EnumC21370d style;
    private final String subLabel;
    private final EnumC21371e type;
    private final double width;

    @SerializedName("xposition")
    private final double xPosition;

    @SerializedName("yposition")
    private final double yPosition;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphAnnotationModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C15621b(19)), AbstractC30060g.m92087G(enumC23463i, new C15621b(20)), AbstractC30060g.m92087G(enumC23463i, new C15621b(21)), null, AbstractC30060g.m92087G(enumC23463i, new C15621b(22)), null, AbstractC30060g.m92087G(enumC23463i, new C15621b(23))};
    }

    public GraphAnnotationModel(double d3, double d14, double d15, double d16, EnumC21370d style, EnumC21371e type, EnumC21367a dimension, String str, GraphAnnotationLabelAlignment graphAnnotationLabelAlignment, String str2, EnumC21368b enumC21368b) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(dimension, "dimension");
        this.xPosition = d3;
        this.yPosition = d14;
        this.width = d15;
        this.height = d16;
        this.style = style;
        this.type = type;
        this.dimension = dimension;
        this.label = str;
        this.alignment = graphAnnotationLabelAlignment;
        this.subLabel = str2;
        this.labelStyle = enumC21368b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.state.GraphAnnotationStyle", EnumC21370d.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.state.GraphAnnotationType", EnumC21371e.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.state.GraphAnnotationDimension", EnumC21367a.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plane.annotations.GraphAnnotationLabelAlignment", GraphAnnotationLabelAlignment.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.state.GraphAnnotationLabelStyle", EnumC21368b.values());
    }

    @InterfaceC37143h("xposition")
    public static /* synthetic */ void getXPosition$annotations() {
    }

    @InterfaceC37143h("yposition")
    public static /* synthetic */ void getYPosition$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphAnnotationModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.xPosition, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.xPosition);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.yPosition, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.yPosition);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || Double.compare(self.width, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 2, self.width);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.height, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.height);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.style != EnumC21370d.STANDARD) {
            output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.type != EnumC21371e.REGION_HIGHLIGHT) {
            output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.type);
        }
        output.encodeSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.dimension);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.alignment != GraphAnnotationLabelAlignment.LEFT) {
            output.encodeNullableSerializableElement(serialDesc, 8, (InterfaceC37145j) interfaceC23462hArr[8].getValue(), self.alignment);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 9) || self.subLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 9, StringSerializer.INSTANCE, self.subLabel);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 10) && self.labelStyle == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.labelStyle);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getXPosition() {
        return this.xPosition;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final EnumC21368b getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getYPosition() {
        return this.yPosition;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC21370d getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC21371e getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final EnumC21367a getDimension() {
        return this.dimension;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final GraphAnnotationLabelAlignment getAlignment() {
        return this.alignment;
    }

    public final GraphAnnotationModel copy(double xPosition, double yPosition, double width, double height, EnumC21370d style, EnumC21371e type, EnumC21367a dimension, String label, GraphAnnotationLabelAlignment alignment, String subLabel, EnumC21368b labelStyle) {
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(dimension, "dimension");
        return new GraphAnnotationModel(xPosition, yPosition, width, height, style, type, dimension, label, alignment, subLabel, labelStyle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphAnnotationModel)) {
            return false;
        }
        GraphAnnotationModel graphAnnotationModel = (GraphAnnotationModel) other;
        return Double.compare(this.xPosition, graphAnnotationModel.xPosition) == 0 && Double.compare(this.yPosition, graphAnnotationModel.yPosition) == 0 && Double.compare(this.width, graphAnnotationModel.width) == 0 && Double.compare(this.height, graphAnnotationModel.height) == 0 && this.style == graphAnnotationModel.style && this.type == graphAnnotationModel.type && this.dimension == graphAnnotationModel.dimension && AbstractC22676k.m65745e(this.label, graphAnnotationModel.label) && this.alignment == graphAnnotationModel.alignment && AbstractC22676k.m65745e(this.subLabel, graphAnnotationModel.subLabel) && this.labelStyle == graphAnnotationModel.labelStyle;
    }

    public final GraphAnnotationLabelAlignment getAlignment() {
        return this.alignment;
    }

    public final EnumC21367a getDimension() {
        return this.dimension;
    }

    public final double getHeight() {
        return this.height;
    }

    public final String getLabel() {
        return this.label;
    }

    public final EnumC21368b getLabelStyle() {
        return this.labelStyle;
    }

    public final EnumC21370d getStyle() {
        return this.style;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public final EnumC21371e getType() {
        return this.type;
    }

    public final double getWidth() {
        return this.width;
    }

    public final double getXPosition() {
        return this.xPosition;
    }

    public final double getYPosition() {
        return this.yPosition;
    }

    public int hashCode() {
        int iHashCode = (this.dimension.hashCode() + ((this.type.hashCode() + ((this.style.hashCode() + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.xPosition) * 31, 31, this.yPosition), 31, this.width), 31, this.height)) * 31)) * 31)) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        GraphAnnotationLabelAlignment graphAnnotationLabelAlignment = this.alignment;
        int iHashCode3 = (iHashCode2 + (graphAnnotationLabelAlignment == null ? 0 : graphAnnotationLabelAlignment.hashCode())) * 31;
        String str2 = this.subLabel;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC21368b enumC21368b = this.labelStyle;
        return iHashCode4 + (enumC21368b != null ? enumC21368b.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.xPosition;
        double d14 = this.yPosition;
        double d15 = this.width;
        double d16 = this.height;
        EnumC21370d enumC21370d = this.style;
        EnumC21371e enumC21371e = this.type;
        EnumC21367a enumC21367a = this.dimension;
        String str = this.label;
        GraphAnnotationLabelAlignment graphAnnotationLabelAlignment = this.alignment;
        String str2 = this.subLabel;
        EnumC21368b enumC21368b = this.labelStyle;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("GraphAnnotationModel(xPosition=", d3, ", yPosition=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", width=", d15, ", height=");
        sbM8306s.append(d16);
        sbM8306s.append(", style=");
        sbM8306s.append(enumC21370d);
        sbM8306s.append(", type=");
        sbM8306s.append(enumC21371e);
        sbM8306s.append(", dimension=");
        sbM8306s.append(enumC21367a);
        sbM8306s.append(", label=");
        sbM8306s.append(str);
        sbM8306s.append(", alignment=");
        sbM8306s.append(graphAnnotationLabelAlignment);
        sbM8306s.append(", subLabel=");
        sbM8306s.append(str2);
        sbM8306s.append(", labelStyle=");
        sbM8306s.append(enumC21368b);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }

    public /* synthetic */ GraphAnnotationModel(int i13, double d3, double d14, double d15, double d16, EnumC21370d enumC21370d, EnumC21371e enumC21371e, EnumC21367a enumC21367a, String str, GraphAnnotationLabelAlignment graphAnnotationLabelAlignment, String str2, EnumC21368b enumC21368b, SerializationConstructorMarker serializationConstructorMarker) {
        if (64 != (i13 & 64)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 64, GraphAnnotationModel$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.xPosition = 0.0d;
        } else {
            this.xPosition = d3;
        }
        if ((i13 & 2) == 0) {
            this.yPosition = 0.0d;
        } else {
            this.yPosition = d14;
        }
        if ((i13 & 4) == 0) {
            this.width = 0.0d;
        } else {
            this.width = d15;
        }
        if ((i13 & 8) == 0) {
            this.height = 0.0d;
        } else {
            this.height = d16;
        }
        if ((i13 & 16) == 0) {
            this.style = EnumC21370d.STANDARD;
        } else {
            this.style = enumC21370d;
        }
        if ((i13 & 32) == 0) {
            this.type = EnumC21371e.REGION_HIGHLIGHT;
        } else {
            this.type = enumC21371e;
        }
        this.dimension = enumC21367a;
        if ((i13 & 128) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        this.alignment = (i13 & 256) == 0 ? GraphAnnotationLabelAlignment.LEFT : graphAnnotationLabelAlignment;
        if ((i13 & 512) == 0) {
            this.subLabel = null;
        } else {
            this.subLabel = str2;
        }
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0) {
            this.labelStyle = null;
        } else {
            this.labelStyle = enumC21368b;
        }
    }

    public /* synthetic */ GraphAnnotationModel(double d3, double d14, double d15, double d16, EnumC21370d enumC21370d, EnumC21371e enumC21371e, EnumC21367a enumC21367a, String str, GraphAnnotationLabelAlignment graphAnnotationLabelAlignment, String str2, EnumC21368b enumC21368b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0d : d3, (i13 & 2) != 0 ? 0.0d : d14, (i13 & 4) != 0 ? 0.0d : d15, (i13 & 8) != 0 ? 0.0d : d16, (i13 & 16) != 0 ? EnumC21370d.STANDARD : enumC21370d, (i13 & 32) != 0 ? EnumC21371e.REGION_HIGHLIGHT : enumC21371e, enumC21367a, (i13 & 128) != 0 ? null : str, (i13 & 256) != 0 ? GraphAnnotationLabelAlignment.LEFT : graphAnnotationLabelAlignment, (i13 & 512) != 0 ? null : str2, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? null : enumC21368b);
    }
}
