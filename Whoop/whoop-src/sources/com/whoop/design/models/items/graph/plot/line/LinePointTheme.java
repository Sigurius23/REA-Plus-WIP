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
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 52\u00020\u0001:\u000265B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBC\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!J@\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b4\u0010!¨\u00067"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "", "Ly81/f;", "pointColor", "Lcom/whoop/design/models/items/graph/plot/line/PointSize;", "pointSize", "Lcom/whoop/design/models/items/graph/plot/line/PointShape;", "pointShape", "Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;", "pointVisibility", "<init>", "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ly81/f;", "component2", "()Lcom/whoop/design/models/items/graph/plot/line/PointSize;", "component3", "()Lcom/whoop/design/models/items/graph/plot/line/PointShape;", "component4", "()Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;", "copy", "(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/PointSize;Lcom/whoop/design/models/items/graph/plot/line/PointShape;Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;)Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getPointColor", "Lcom/whoop/design/models/items/graph/plot/line/PointSize;", "getPointSize", "Lcom/whoop/design/models/items/graph/plot/line/PointShape;", "getPointShape", "Lcom/whoop/design/models/items/graph/plot/line/PointVisibility;", "getPointVisibility", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class LinePointTheme {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC39333f pointColor;
    private final PointShape pointShape;
    private final PointSize pointSize;
    private final PointVisibility pointVisibility;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return LinePointTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C30112a(5)), AbstractC30060g.m92087G(enumC23463i, new C30112a(6)), AbstractC30060g.m92087G(enumC23463i, new C30112a(7)), AbstractC30060g.m92087G(enumC23463i, new C30112a(8))};
    }

    public LinePointTheme() {
        this((EnumC39333f) null, (PointSize) null, (PointShape) null, (PointVisibility) null, 15, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.PointSize", PointSize.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.PointShape", PointShape.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$2() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.line.PointVisibility", PointVisibility.values());
    }

    public static /* synthetic */ LinePointTheme copy$default(LinePointTheme linePointTheme, EnumC39333f enumC39333f, PointSize pointSize, PointShape pointShape, PointVisibility pointVisibility, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = linePointTheme.pointColor;
        }
        if ((i13 & 2) != 0) {
            pointSize = linePointTheme.pointSize;
        }
        if ((i13 & 4) != 0) {
            pointShape = linePointTheme.pointShape;
        }
        if ((i13 & 8) != 0) {
            pointVisibility = linePointTheme.pointVisibility;
        }
        return linePointTheme.copy(enumC39333f, pointSize, pointShape, pointVisibility);
    }

    public static final /* synthetic */ void write$Self$design_models_release(LinePointTheme self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.pointColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.pointColor);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.pointSize != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.pointSize);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.pointShape != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.pointShape);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.pointVisibility == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.pointVisibility);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getPointColor() {
        return this.pointColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PointSize getPointSize() {
        return this.pointSize;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PointShape getPointShape() {
        return this.pointShape;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PointVisibility getPointVisibility() {
        return this.pointVisibility;
    }

    public final LinePointTheme copy(EnumC39333f pointColor, PointSize pointSize, PointShape pointShape, PointVisibility pointVisibility) {
        return new LinePointTheme(pointColor, pointSize, pointShape, pointVisibility);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinePointTheme)) {
            return false;
        }
        LinePointTheme linePointTheme = (LinePointTheme) other;
        return this.pointColor == linePointTheme.pointColor && this.pointSize == linePointTheme.pointSize && this.pointShape == linePointTheme.pointShape && this.pointVisibility == linePointTheme.pointVisibility;
    }

    public final EnumC39333f getPointColor() {
        return this.pointColor;
    }

    public final PointShape getPointShape() {
        return this.pointShape;
    }

    public final PointSize getPointSize() {
        return this.pointSize;
    }

    public final PointVisibility getPointVisibility() {
        return this.pointVisibility;
    }

    public int hashCode() {
        EnumC39333f enumC39333f = this.pointColor;
        int iHashCode = (enumC39333f == null ? 0 : enumC39333f.hashCode()) * 31;
        PointSize pointSize = this.pointSize;
        int iHashCode2 = (iHashCode + (pointSize == null ? 0 : pointSize.hashCode())) * 31;
        PointShape pointShape = this.pointShape;
        int iHashCode3 = (iHashCode2 + (pointShape == null ? 0 : pointShape.hashCode())) * 31;
        PointVisibility pointVisibility = this.pointVisibility;
        return iHashCode3 + (pointVisibility != null ? pointVisibility.hashCode() : 0);
    }

    public String toString() {
        return "LinePointTheme(pointColor=" + this.pointColor + ", pointSize=" + this.pointSize + ", pointShape=" + this.pointShape + ", pointVisibility=" + this.pointVisibility + ")";
    }

    public /* synthetic */ LinePointTheme(int i13, EnumC39333f enumC39333f, PointSize pointSize, PointShape pointShape, PointVisibility pointVisibility, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.pointColor = null;
        } else {
            this.pointColor = enumC39333f;
        }
        if ((i13 & 2) == 0) {
            this.pointSize = null;
        } else {
            this.pointSize = pointSize;
        }
        if ((i13 & 4) == 0) {
            this.pointShape = null;
        } else {
            this.pointShape = pointShape;
        }
        if ((i13 & 8) == 0) {
            this.pointVisibility = null;
        } else {
            this.pointVisibility = pointVisibility;
        }
    }

    public LinePointTheme(EnumC39333f enumC39333f, PointSize pointSize, PointShape pointShape, PointVisibility pointVisibility) {
        this.pointColor = enumC39333f;
        this.pointSize = pointSize;
        this.pointShape = pointShape;
        this.pointVisibility = pointVisibility;
    }

    public /* synthetic */ LinePointTheme(EnumC39333f enumC39333f, PointSize pointSize, PointShape pointShape, PointVisibility pointVisibility, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC39333f, (i13 & 2) != 0 ? null : pointSize, (i13 & 4) != 0 ? null : pointShape, (i13 & 8) != 0 ? null : pointVisibility);
    }
}
