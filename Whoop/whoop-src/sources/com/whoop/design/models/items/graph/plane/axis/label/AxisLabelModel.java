package com.whoop.design.models.items.graph.plane.axis.label;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import j02.C21174w;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
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
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276B=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBK\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JF\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010/\u001a\u0004\b0\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "", "", "label", "", "position", "subLabel", "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;", "style", "Lgz0/m0;", "icon", "<init>", "(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "()Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;", "component5", "()Lgz0/m0;", "copy", "(Ljava/lang/String;DLjava/lang/String;Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLabel", "D", "getPosition", "getSubLabel", "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelStyle;", "getStyle", "Lgz0/m0;", "getIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AxisLabelModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC16313m0 icon;
    private final String label;
    private final double position;
    private final AxisLabelStyle style;
    private final String subLabel;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AxisLabelModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, AbstractC30060g.m92087G(enumC23463i, new C21174w(13)), AbstractC30060g.m92087G(enumC23463i, new C21174w(14))};
    }

    public AxisLabelModel() {
        this((String) null, 0.0d, (String) null, (AxisLabelStyle) null, (EnumC16313m0) null, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plane.axis.label.AxisLabelStyle", AxisLabelStyle.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ AxisLabelModel copy$default(AxisLabelModel axisLabelModel, String str, double d3, String str2, AxisLabelStyle axisLabelStyle, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = axisLabelModel.label;
        }
        if ((i13 & 2) != 0) {
            d3 = axisLabelModel.position;
        }
        if ((i13 & 4) != 0) {
            str2 = axisLabelModel.subLabel;
        }
        if ((i13 & 8) != 0) {
            axisLabelStyle = axisLabelModel.style;
        }
        if ((i13 & 16) != 0) {
            enumC16313m0 = axisLabelModel.icon;
        }
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        String str3 = str2;
        return axisLabelModel.copy(str, d3, str3, axisLabelStyle, enumC16313m1);
    }

    public static final /* synthetic */ void write$Self$design_models_release(AxisLabelModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.label, "")) {
            output.encodeStringElement(serialDesc, 0, self.label);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.position, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.position);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.subLabel != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subLabel);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.style != AxisLabelStyle.STANDARD) {
            output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.icon == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.icon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getPosition() {
        return this.position;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubLabel() {
        return this.subLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AxisLabelStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final AxisLabelModel copy(String label, double position, String subLabel, AxisLabelStyle style, EnumC16313m0 icon) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        return new AxisLabelModel(label, position, subLabel, style, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AxisLabelModel)) {
            return false;
        }
        AxisLabelModel axisLabelModel = (AxisLabelModel) other;
        return AbstractC22676k.m65745e(this.label, axisLabelModel.label) && Double.compare(this.position, axisLabelModel.position) == 0 && AbstractC22676k.m65745e(this.subLabel, axisLabelModel.subLabel) && this.style == axisLabelModel.style && this.icon == axisLabelModel.icon;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final double getPosition() {
        return this.position;
    }

    public final AxisLabelStyle getStyle() {
        return this.style;
    }

    public final String getSubLabel() {
        return this.subLabel;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(this.label.hashCode() * 31, 31, this.position);
        String str = this.subLabel;
        int iHashCode = (this.style.hashCode() + ((iM48499a + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        EnumC16313m0 enumC16313m0 = this.icon;
        return iHashCode + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        return "AxisLabelModel(label=" + this.label + ", position=" + this.position + ", subLabel=" + this.subLabel + ", style=" + this.style + ", icon=" + this.icon + ")";
    }

    public /* synthetic */ AxisLabelModel(int i13, String str, double d3, String str2, AxisLabelStyle axisLabelStyle, EnumC16313m0 enumC16313m0, SerializationConstructorMarker serializationConstructorMarker) {
        this.label = (i13 & 1) == 0 ? "" : str;
        if ((i13 & 2) == 0) {
            this.position = 0.0d;
        } else {
            this.position = d3;
        }
        if ((i13 & 4) == 0) {
            this.subLabel = null;
        } else {
            this.subLabel = str2;
        }
        if ((i13 & 8) == 0) {
            this.style = AxisLabelStyle.STANDARD;
        } else {
            this.style = axisLabelStyle;
        }
        if ((i13 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = enumC16313m0;
        }
    }

    public AxisLabelModel(String label, double d3, String str, AxisLabelStyle style, EnumC16313m0 enumC16313m0) {
        AbstractC22676k.m65750j(label, "label");
        AbstractC22676k.m65750j(style, "style");
        this.label = label;
        this.position = d3;
        this.subLabel = str;
        this.style = style;
        this.icon = enumC16313m0;
    }

    public /* synthetic */ AxisLabelModel(String str, double d3, String str2, AxisLabelStyle axisLabelStyle, EnumC16313m0 enumC16313m0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? null : str2, (i13 & 8) != 0 ? AxisLabelStyle.STANDARD : axisLabelStyle, (i13 & 16) != 0 ? null : enumC16313m0);
    }
}
