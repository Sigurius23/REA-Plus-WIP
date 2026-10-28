package com.whoop.design.models.items.graph.plane.line;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g61.EnumC15533f;
import j02.C21174w;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CBBS\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010B_\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+J\\\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b.\u0010(J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u0002022\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b<\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010=\u001a\u0004\b?\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010@\u001a\u0004\bA\u0010+¨\u0006D"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;", "", "", "position", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;", "type", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;", "style", "Lg61/f;", "axis", "", "label", "labelStyle", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;", "theme", "<init>", "(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IDLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()D", "component2", "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;", "component3", "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;", "component4", "()Lg61/f;", "component5", "()Ljava/lang/String;", "component6", "component7", "()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;", "copy", "(DLcom/whoop/design/models/items/graph/plane/line/GraphLineType;Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;Lg61/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;)Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "D", "getPosition", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineType;", "getType", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;", "getStyle", "Lg61/f;", "getAxis", "Ljava/lang/String;", "getLabel", "getLabelStyle", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphLineModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC15533f axis;
    private final String label;
    private final String labelStyle;
    private final double position;
    private final GraphLineStyle style;
    private final GraphLineTheme theme;
    private final GraphLineType type;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphLineModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C21174w(28)), AbstractC30060g.m92087G(enumC23463i, new C21174w(29)), AbstractC30060g.m92087G(enumC23463i, new C25371a(0)), null, null, null};
    }

    public GraphLineModel() {
        this(0.0d, (GraphLineType) null, (GraphLineStyle) null, (EnumC15533f) null, (String) null, (String) null, (GraphLineTheme) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plane.line.GraphLineType", GraphLineType.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plane.line.GraphLineStyle", GraphLineStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.axis.state.GraphLineAxis", EnumC15533f.values());
    }

    public static /* synthetic */ GraphLineModel copy$default(GraphLineModel graphLineModel, double d3, GraphLineType graphLineType, GraphLineStyle graphLineStyle, EnumC15533f enumC15533f, String str, String str2, GraphLineTheme graphLineTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            d3 = graphLineModel.position;
        }
        double d14 = d3;
        if ((i13 & 2) != 0) {
            graphLineType = graphLineModel.type;
        }
        GraphLineType graphLineType2 = graphLineType;
        if ((i13 & 4) != 0) {
            graphLineStyle = graphLineModel.style;
        }
        GraphLineStyle graphLineStyle2 = graphLineStyle;
        if ((i13 & 8) != 0) {
            enumC15533f = graphLineModel.axis;
        }
        EnumC15533f enumC15533f2 = enumC15533f;
        if ((i13 & 16) != 0) {
            str = graphLineModel.label;
        }
        return graphLineModel.copy(d14, graphLineType2, graphLineStyle2, enumC15533f2, str, (i13 & 32) != 0 ? graphLineModel.labelStyle : str2, (i13 & 64) != 0 ? graphLineModel.theme : graphLineTheme);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphLineModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || Double.compare(self.position, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 0, self.position);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != GraphLineType.STANDARD) {
            output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.style != GraphLineStyle.STANDARD) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.axis != EnumC15533f.X_AXIS) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.axis);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.label != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.labelStyle != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, StringSerializer.INSTANCE, self.labelStyle);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, GraphLineTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final GraphLineType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final GraphLineStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC15533f getAxis() {
        return this.axis;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabelStyle() {
        return this.labelStyle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphLineTheme getTheme() {
        return this.theme;
    }

    public final GraphLineModel copy(double position, GraphLineType type, GraphLineStyle style, EnumC15533f axis, String label, String labelStyle, GraphLineTheme theme) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(axis, "axis");
        return new GraphLineModel(position, type, style, axis, label, labelStyle, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphLineModel)) {
            return false;
        }
        GraphLineModel graphLineModel = (GraphLineModel) other;
        return Double.compare(this.position, graphLineModel.position) == 0 && this.type == graphLineModel.type && this.style == graphLineModel.style && this.axis == graphLineModel.axis && AbstractC22676k.m65745e(this.label, graphLineModel.label) && AbstractC22676k.m65745e(this.labelStyle, graphLineModel.labelStyle) && AbstractC22676k.m65745e(this.theme, graphLineModel.theme);
    }

    public final EnumC15533f getAxis() {
        return this.axis;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getLabelStyle() {
        return this.labelStyle;
    }

    public final double getPosition() {
        return this.position;
    }

    public final GraphLineStyle getStyle() {
        return this.style;
    }

    public final GraphLineTheme getTheme() {
        return this.theme;
    }

    public final GraphLineType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = (this.axis.hashCode() + ((this.style.hashCode() + ((this.type.hashCode() + (Double.hashCode(this.position) * 31)) * 31)) * 31)) * 31;
        String str = this.label;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.labelStyle;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        GraphLineTheme graphLineTheme = this.theme;
        return iHashCode3 + (graphLineTheme != null ? graphLineTheme.hashCode() : 0);
    }

    public String toString() {
        double d3 = this.position;
        GraphLineType graphLineType = this.type;
        GraphLineStyle graphLineStyle = this.style;
        EnumC15533f enumC15533f = this.axis;
        String str = this.label;
        String str2 = this.labelStyle;
        GraphLineTheme graphLineTheme = this.theme;
        StringBuilder sb4 = new StringBuilder("GraphLineModel(position=");
        sb4.append(d3);
        sb4.append(", type=");
        sb4.append(graphLineType);
        sb4.append(", style=");
        sb4.append(graphLineStyle);
        sb4.append(", axis=");
        sb4.append(enumC15533f);
        AbstractC11266d.m30444B(sb4, ", label=", str, ", labelStyle=", str2);
        sb4.append(", theme=");
        sb4.append(graphLineTheme);
        sb4.append(")");
        return sb4.toString();
    }

    public GraphLineModel(double d3, GraphLineType type, GraphLineStyle style, EnumC15533f axis, String str, String str2, GraphLineTheme graphLineTheme) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(axis, "axis");
        this.position = d3;
        this.type = type;
        this.style = style;
        this.axis = axis;
        this.label = str;
        this.labelStyle = str2;
        this.theme = graphLineTheme;
    }

    public /* synthetic */ GraphLineModel(int i13, double d3, GraphLineType graphLineType, GraphLineStyle graphLineStyle, EnumC15533f enumC15533f, String str, String str2, GraphLineTheme graphLineTheme, SerializationConstructorMarker serializationConstructorMarker) {
        this.position = (i13 & 1) == 0 ? 0.0d : d3;
        if ((i13 & 2) == 0) {
            this.type = GraphLineType.STANDARD;
        } else {
            this.type = graphLineType;
        }
        if ((i13 & 4) == 0) {
            this.style = GraphLineStyle.STANDARD;
        } else {
            this.style = graphLineStyle;
        }
        if ((i13 & 8) == 0) {
            this.axis = EnumC15533f.X_AXIS;
        } else {
            this.axis = enumC15533f;
        }
        if ((i13 & 16) == 0) {
            this.label = null;
        } else {
            this.label = str;
        }
        if ((i13 & 32) == 0) {
            this.labelStyle = null;
        } else {
            this.labelStyle = str2;
        }
        if ((i13 & 64) == 0) {
            this.theme = null;
        } else {
            this.theme = graphLineTheme;
        }
    }

    public /* synthetic */ GraphLineModel(double d3, GraphLineType graphLineType, GraphLineStyle graphLineStyle, EnumC15533f enumC15533f, String str, String str2, GraphLineTheme graphLineTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0.0d : d3, (i13 & 2) != 0 ? GraphLineType.STANDARD : graphLineType, (i13 & 4) != 0 ? GraphLineStyle.STANDARD : graphLineStyle, (i13 & 8) != 0 ? EnumC15533f.X_AXIS : enumC15533f, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? null : str2, (i13 & 64) != 0 ? null : graphLineTheme);
    }
}
