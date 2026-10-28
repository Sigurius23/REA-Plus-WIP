package com.whoop.design.models.items.graph.plot.line;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.AbstractC30060g;
import qa1.C30112a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 82\u00020\u0001:\u000298BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBM\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JL\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b-\u0010.R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010/\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00101\u001a\u0004\b2\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b4\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b5\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b7\u0010#¨\u0006:"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "", "Ly81/f;", "strokeColor", "Lcom/whoop/design/models/items/graph/plot/line/LineWidth;", "strokeWidth", "Lcom/whoop/design/models/items/graph/plot/line/DashPattern;", "dashPattern", "fillColor", "Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;", "fillOpacity", "<init>", "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ly81/f;", "component2", "()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;", "component3", "()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;", "component4", "component5", "()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;", "copy", "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getStrokeColor", "Lcom/whoop/design/models/items/graph/plot/line/LineWidth;", "getStrokeWidth", "Lcom/whoop/design/models/items/graph/plot/line/DashPattern;", "getDashPattern", "getFillColor", "Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;", "getFillOpacity", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinePlotTheme {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final DashPattern dashPattern;
    private final EnumC39333f fillColor;
    private final FillOpacity fillOpacity;
    private final EnumC39333f strokeColor;
    private final LineWidth strokeWidth;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LinePlotTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C30112a(0)), AbstractC30060g.m92087G(enumC23463i, new C30112a(1)), AbstractC30060g.m92087G(enumC23463i, new C30112a(2)), AbstractC30060g.m92087G(enumC23463i, new C30112a(3)), AbstractC30060g.m92087G(enumC23463i, new C30112a(4))};
    }

    public LinePlotTheme() {
        this((EnumC39333f) null, (LineWidth) null, (DashPattern) null, (EnumC39333f) null, (FillOpacity) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.LineWidth", LineWidth.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.DashPattern", DashPattern.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$3() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.FillOpacity", FillOpacity.values());
    }

    public static /* synthetic */ LinePlotTheme copy$default(LinePlotTheme linePlotTheme, EnumC39333f enumC39333f, LineWidth lineWidth, DashPattern dashPattern, EnumC39333f enumC39333f2, FillOpacity fillOpacity, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = linePlotTheme.strokeColor;
        }
        if ((i13 & 2) != 0) {
            lineWidth = linePlotTheme.strokeWidth;
        }
        if ((i13 & 4) != 0) {
            dashPattern = linePlotTheme.dashPattern;
        }
        if ((i13 & 8) != 0) {
            enumC39333f2 = linePlotTheme.fillColor;
        }
        if ((i13 & 16) != 0) {
            fillOpacity = linePlotTheme.fillOpacity;
        }
        FillOpacity fillOpacity2 = fillOpacity;
        DashPattern dashPattern2 = dashPattern;
        return linePlotTheme.copy(enumC39333f, lineWidth, dashPattern2, enumC39333f2, fillOpacity2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LinePlotTheme self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.strokeColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.strokeColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.strokeWidth != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.strokeWidth);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.dashPattern != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.dashPattern);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.fillColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.fillColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.fillOpacity == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.fillOpacity);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getStrokeColor() {
        return this.strokeColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LineWidth getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DashPattern getDashPattern() {
        return this.dashPattern;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final FillOpacity getFillOpacity() {
        return this.fillOpacity;
    }

    public final LinePlotTheme copy(EnumC39333f strokeColor, LineWidth strokeWidth, DashPattern dashPattern, EnumC39333f fillColor, FillOpacity fillOpacity) {
        return new LinePlotTheme(strokeColor, strokeWidth, dashPattern, fillColor, fillOpacity);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinePlotTheme)) {
            return false;
        }
        LinePlotTheme linePlotTheme = (LinePlotTheme) other;
        return this.strokeColor == linePlotTheme.strokeColor && this.strokeWidth == linePlotTheme.strokeWidth && this.dashPattern == linePlotTheme.dashPattern && this.fillColor == linePlotTheme.fillColor && this.fillOpacity == linePlotTheme.fillOpacity;
    }

    public final DashPattern getDashPattern() {
        return this.dashPattern;
    }

    public final EnumC39333f getFillColor() {
        return this.fillColor;
    }

    public final FillOpacity getFillOpacity() {
        return this.fillOpacity;
    }

    public final EnumC39333f getStrokeColor() {
        return this.strokeColor;
    }

    public final LineWidth getStrokeWidth() {
        return this.strokeWidth;
    }

    public int hashCode() {
        EnumC39333f enumC39333f = this.strokeColor;
        int iHashCode = (enumC39333f == null ? 0 : enumC39333f.hashCode()) * 31;
        LineWidth lineWidth = this.strokeWidth;
        int iHashCode2 = (iHashCode + (lineWidth == null ? 0 : lineWidth.hashCode())) * 31;
        DashPattern dashPattern = this.dashPattern;
        int iHashCode3 = (iHashCode2 + (dashPattern == null ? 0 : dashPattern.hashCode())) * 31;
        EnumC39333f enumC39333f2 = this.fillColor;
        int iHashCode4 = (iHashCode3 + (enumC39333f2 == null ? 0 : enumC39333f2.hashCode())) * 31;
        FillOpacity fillOpacity = this.fillOpacity;
        return iHashCode4 + (fillOpacity != null ? fillOpacity.hashCode() : 0);
    }

    public String toString() {
        return "LinePlotTheme(strokeColor=" + this.strokeColor + ", strokeWidth=" + this.strokeWidth + ", dashPattern=" + this.dashPattern + ", fillColor=" + this.fillColor + ", fillOpacity=" + this.fillOpacity + ")";
    }

    public /* synthetic */ LinePlotTheme(int i13, EnumC39333f enumC39333f, LineWidth lineWidth, DashPattern dashPattern, EnumC39333f enumC39333f2, FillOpacity fillOpacity, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.strokeColor = null;
        } else {
            this.strokeColor = enumC39333f;
        }
        if ((i13 & 2) == 0) {
            this.strokeWidth = null;
        } else {
            this.strokeWidth = lineWidth;
        }
        if ((i13 & 4) == 0) {
            this.dashPattern = null;
        } else {
            this.dashPattern = dashPattern;
        }
        if ((i13 & 8) == 0) {
            this.fillColor = null;
        } else {
            this.fillColor = enumC39333f2;
        }
        if ((i13 & 16) == 0) {
            this.fillOpacity = null;
        } else {
            this.fillOpacity = fillOpacity;
        }
    }

    public LinePlotTheme(EnumC39333f enumC39333f, LineWidth lineWidth, DashPattern dashPattern, EnumC39333f enumC39333f2, FillOpacity fillOpacity) {
        this.strokeColor = enumC39333f;
        this.strokeWidth = lineWidth;
        this.dashPattern = dashPattern;
        this.fillColor = enumC39333f2;
        this.fillOpacity = fillOpacity;
    }

    public /* synthetic */ LinePlotTheme(EnumC39333f enumC39333f, LineWidth lineWidth, DashPattern dashPattern, EnumC39333f enumC39333f2, FillOpacity fillOpacity, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC39333f, (i13 & 2) != 0 ? null : lineWidth, (i13 & 4) != 0 ? null : dashPattern, (i13 & 8) != 0 ? null : enumC39333f2, (i13 & 16) != 0 ? null : fillOpacity);
    }
}
