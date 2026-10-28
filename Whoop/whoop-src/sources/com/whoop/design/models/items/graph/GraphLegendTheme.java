package com.whoop.design.models.items.graph;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import fw0.C14833a;
import ga1.C15620a;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001b¨\u0006."}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphLegendTheme;", "", "Ly81/f;", "strokeColor", "fillColor", "Lcom/whoop/design/models/items/graph/LegendShape;", "shape", "<init>", "(Ly81/f;Ly81/f;Lcom/whoop/design/models/items/graph/LegendShape;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy81/f;Ly81/f;Lcom/whoop/design/models/items/graph/LegendShape;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/GraphLegendTheme;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ly81/f;", "component2", "component3", "()Lcom/whoop/design/models/items/graph/LegendShape;", "copy", "(Ly81/f;Ly81/f;Lcom/whoop/design/models/items/graph/LegendShape;)Lcom/whoop/design/models/items/graph/GraphLegendTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getStrokeColor", "getFillColor", "Lcom/whoop/design/models/items/graph/LegendShape;", "getShape", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphLegendTheme {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC39333f fillColor;
    private final LegendShape shape;
    private final EnumC39333f strokeColor;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/GraphLegendTheme$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/GraphLegendTheme;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphLegendTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C14833a(28)), AbstractC30060g.m92087G(enumC23463i, new C14833a(29)), AbstractC30060g.m92087G(enumC23463i, new C15620a(0))};
    }

    public GraphLegendTheme() {
        this((EnumC39333f) null, (EnumC39333f) null, (LegendShape) null, 7, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.LegendShape", LegendShape.values());
    }

    public static /* synthetic */ GraphLegendTheme copy$default(GraphLegendTheme graphLegendTheme, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, LegendShape legendShape, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = graphLegendTheme.strokeColor;
        }
        if ((i13 & 2) != 0) {
            enumC39333f2 = graphLegendTheme.fillColor;
        }
        if ((i13 & 4) != 0) {
            legendShape = graphLegendTheme.shape;
        }
        return graphLegendTheme.copy(enumC39333f, enumC39333f2, legendShape);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphLegendTheme self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.strokeColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.strokeColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.fillColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.fillColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.shape == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.shape);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getStrokeColor() {
        return this.strokeColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final LegendShape getShape() {
        return this.shape;
    }

    public final GraphLegendTheme copy(EnumC39333f strokeColor, EnumC39333f fillColor, LegendShape shape) {
        return new GraphLegendTheme(strokeColor, fillColor, shape);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphLegendTheme)) {
            return false;
        }
        GraphLegendTheme graphLegendTheme = (GraphLegendTheme) other;
        return this.strokeColor == graphLegendTheme.strokeColor && this.fillColor == graphLegendTheme.fillColor && this.shape == graphLegendTheme.shape;
    }

    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }

    public final LegendShape getShape() {
        return this.shape;
    }

    public final EnumC39333f getStrokeColor() {
        return this.strokeColor;
    }

    public int hashCode() {
        EnumC39333f enumC39333f = this.strokeColor;
        int iHashCode = (enumC39333f == null ? 0 : enumC39333f.hashCode()) * 31;
        EnumC39333f enumC39333f2 = this.fillColor;
        int iHashCode2 = (iHashCode + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31;
        LegendShape legendShape = this.shape;
        return iHashCode2 + (legendShape != null ? legendShape.hashCode() : 0);
    }

    public String toString() {
        return "GraphLegendTheme(strokeColor=" + this.strokeColor + ", fillColor=" + this.fillColor + ", shape=" + this.shape + ")";
    }

    public /* synthetic */ GraphLegendTheme(int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, LegendShape legendShape, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.strokeColor = null;
        } else {
            this.strokeColor = enumC39333f;
        }
        if ((i13 & 2) == 0) {
            this.fillColor = null;
        } else {
            this.fillColor = enumC39333f2;
        }
        if ((i13 & 4) == 0) {
            this.shape = null;
        } else {
            this.shape = legendShape;
        }
    }

    public GraphLegendTheme(EnumC39333f enumC39333f, EnumC39333f enumC39333f2, LegendShape legendShape) {
        this.strokeColor = enumC39333f;
        this.fillColor = enumC39333f2;
        this.shape = legendShape;
    }

    public /* synthetic */ GraphLegendTheme(EnumC39333f enumC39333f, EnumC39333f enumC39333f2, LegendShape legendShape, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC39333f, (i13 & 2) != 0 ? null : enumC39333f2, (i13 & 4) != 0 ? null : legendShape);
    }
}
