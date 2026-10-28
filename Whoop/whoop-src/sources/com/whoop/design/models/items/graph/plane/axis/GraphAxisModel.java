package com.whoop.design.models.items.graph.plane.axis;

import com.mapbox.maps.MapboxMap;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel;
import com.whoop.design.models.items.graph.plane.axis.label.AxisLabelModel$$serializer;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import g61.EnumC15530c;
import g61.EnumC15531d;
import hc3.AbstractC17176i;
import j02.C21174w;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import m83.C25271y;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b*\b\u0087\b\u0018\u0000 E2\u00020\u0001:\u0002FEBY\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012Bc\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0017J'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b-\u0010.Jb\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u0010*J\u0010\u00102\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\r2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010$R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bB\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010C\u001a\u0004\bD\u0010.¨\u0006G"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "", "Lg61/d;", "type", "Lg61/c;", "style", "", "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "labels", "", MapboxMap.QFE_OFFSET, "", "axisDescription", "", "scrimPresent", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "theme", "<init>", "(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lg61/d;", "component2", "()Lg61/c;", "component3", "()Ljava/util/List;", "component4", "()D", "component5", "()Ljava/lang/String;", "component6", "()Z", "component7", "()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "copy", "(Lg61/d;Lg61/c;Ljava/util/List;DLjava/lang/String;ZLcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lg61/d;", "getType", "Lg61/c;", "getStyle", "Ljava/util/List;", "getLabels", "D", "getOffset", "Ljava/lang/String;", "getAxisDescription", "Z", "getScrimPresent", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "getTheme", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphAxisModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String axisDescription;
    private final List<AxisLabelModel> labels;
    private final double offset;
    private final boolean scrimPresent;
    private final EnumC15530c style;
    private final GraphAxisTheme theme;
    private final EnumC15531d type;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphAxisModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C21174w(5)), AbstractC30060g.m92087G(enumC23463i, new C21174w(6)), AbstractC30060g.m92087G(enumC23463i, new C21174w(7)), null, null, null, null};
    }

    public GraphAxisModel() {
        this((EnumC15531d) null, (EnumC15530c) null, (List) null, 0.0d, (String) null, false, (GraphAxisTheme) null, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.axis.state.GraphAxisType", EnumC15531d.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.organism.graph.plane.axis.state.GraphAxisStyle", EnumC15530c.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return new ArrayListSerializer(AxisLabelModel$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GraphAxisModel copy$default(GraphAxisModel graphAxisModel, EnumC15531d enumC15531d, EnumC15530c enumC15530c, List list, double d3, String str, boolean z4, GraphAxisTheme graphAxisTheme, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC15531d = graphAxisModel.type;
        }
        if ((i13 & 2) != 0) {
            enumC15530c = graphAxisModel.style;
        }
        if ((i13 & 4) != 0) {
            list = graphAxisModel.labels;
        }
        if ((i13 & 8) != 0) {
            d3 = graphAxisModel.offset;
        }
        if ((i13 & 16) != 0) {
            str = graphAxisModel.axisDescription;
        }
        if ((i13 & 32) != 0) {
            z4 = graphAxisModel.scrimPresent;
        }
        if ((i13 & 64) != 0) {
            graphAxisTheme = graphAxisModel.theme;
        }
        GraphAxisTheme graphAxisTheme2 = graphAxisTheme;
        String str2 = str;
        double d14 = d3;
        List list2 = list;
        return graphAxisModel.copy(enumC15531d, enumC15530c, list2, d14, str2, z4, graphAxisTheme2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphAxisModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.type != EnumC15531d.STANDARD) {
            output.encodeSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.style != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.style);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.labels, C25271y.f99162w)) {
            output.encodeSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.labels);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || Double.compare(self.offset, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 3, self.offset);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.axisDescription != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.axisDescription);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.scrimPresent) {
            output.encodeBooleanElement(serialDesc, 5, self.scrimPresent);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.theme == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, GraphAxisTheme$$serializer.INSTANCE, self.theme);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC15531d getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC15530c getStyle() {
        return this.style;
    }

    public final List<AxisLabelModel> component3() {
        return this.labels;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getOffset() {
        return this.offset;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAxisDescription() {
        return this.axisDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getScrimPresent() {
        return this.scrimPresent;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final GraphAxisTheme getTheme() {
        return this.theme;
    }

    public final GraphAxisModel copy(EnumC15531d type, EnumC15530c style, List<AxisLabelModel> labels, double offset, String axisDescription, boolean scrimPresent, GraphAxisTheme theme) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(labels, "labels");
        return new GraphAxisModel(type, style, labels, offset, axisDescription, scrimPresent, theme);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphAxisModel)) {
            return false;
        }
        GraphAxisModel graphAxisModel = (GraphAxisModel) other;
        return this.type == graphAxisModel.type && this.style == graphAxisModel.style && AbstractC22676k.m65745e(this.labels, graphAxisModel.labels) && Double.compare(this.offset, graphAxisModel.offset) == 0 && AbstractC22676k.m65745e(this.axisDescription, graphAxisModel.axisDescription) && this.scrimPresent == graphAxisModel.scrimPresent && AbstractC22676k.m65745e(this.theme, graphAxisModel.theme);
    }

    public final String getAxisDescription() {
        return this.axisDescription;
    }

    public final List<AxisLabelModel> getLabels() {
        return this.labels;
    }

    public final double getOffset() {
        return this.offset;
    }

    public final boolean getScrimPresent() {
        return this.scrimPresent;
    }

    public final EnumC15530c getStyle() {
        return this.style;
    }

    public final GraphAxisTheme getTheme() {
        return this.theme;
    }

    public final EnumC15531d getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        EnumC15530c enumC15530c = this.style;
        int iM48499a = AbstractC17176i.m48499a(AbstractC11895b.m31983b((iHashCode + (enumC15530c == null ? 0 : enumC15530c.hashCode())) * 31, 31, this.labels), 31, this.offset);
        String str = this.axisDescription;
        int iM8289b = AbstractC2875y.m8289b((iM48499a + (str == null ? 0 : str.hashCode())) * 31, 31, this.scrimPresent);
        GraphAxisTheme graphAxisTheme = this.theme;
        return iM8289b + (graphAxisTheme != null ? graphAxisTheme.hashCode() : 0);
    }

    public String toString() {
        return "GraphAxisModel(type=" + this.type + ", style=" + this.style + ", labels=" + this.labels + ", offset=" + this.offset + ", axisDescription=" + this.axisDescription + ", scrimPresent=" + this.scrimPresent + ", theme=" + this.theme + ")";
    }

    public /* synthetic */ GraphAxisModel(int i13, EnumC15531d enumC15531d, EnumC15530c enumC15530c, List list, double d3, String str, boolean z4, GraphAxisTheme graphAxisTheme, SerializationConstructorMarker serializationConstructorMarker) {
        this.type = (i13 & 1) == 0 ? EnumC15531d.STANDARD : enumC15531d;
        if ((i13 & 2) == 0) {
            this.style = null;
        } else {
            this.style = enumC15530c;
        }
        if ((i13 & 4) == 0) {
            this.labels = C25271y.f99162w;
        } else {
            this.labels = list;
        }
        if ((i13 & 8) == 0) {
            this.offset = 0.0d;
        } else {
            this.offset = d3;
        }
        if ((i13 & 16) == 0) {
            this.axisDescription = null;
        } else {
            this.axisDescription = str;
        }
        if ((i13 & 32) == 0) {
            this.scrimPresent = false;
        } else {
            this.scrimPresent = z4;
        }
        if ((i13 & 64) == 0) {
            this.theme = null;
        } else {
            this.theme = graphAxisTheme;
        }
    }

    public GraphAxisModel(EnumC15531d type, EnumC15530c enumC15530c, List<AxisLabelModel> labels, double d3, String str, boolean z4, GraphAxisTheme graphAxisTheme) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(labels, "labels");
        this.type = type;
        this.style = enumC15530c;
        this.labels = labels;
        this.offset = d3;
        this.axisDescription = str;
        this.scrimPresent = z4;
        this.theme = graphAxisTheme;
    }

    public /* synthetic */ GraphAxisModel(EnumC15531d enumC15531d, EnumC15530c enumC15530c, List list, double d3, String str, boolean z4, GraphAxisTheme graphAxisTheme, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? EnumC15531d.STANDARD : enumC15531d, (i13 & 2) != 0 ? null : enumC15530c, (i13 & 4) != 0 ? C25271y.f99162w : list, (i13 & 8) != 0 ? 0.0d : d3, (i13 & 16) != 0 ? null : str, (i13 & 32) != 0 ? false : z4, (i13 & 64) != 0 ? null : graphAxisTheme);
    }
}
