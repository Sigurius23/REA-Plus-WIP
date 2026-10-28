package com.whoop.design.models.items.graph.plane.axis;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import j02.C21179y0;
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

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0005\u0010\u000bJ'\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0016R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b%\u0010\u0016¨\u0006("}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "", "Ly81/f;", "axisColor", "labelColor", "<init>", "(Ly81/f;Ly81/f;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILy81/f;Ly81/f;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ly81/f;", "component2", "copy", "(Ly81/f;Ly81/f;)Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ly81/f;", "getAxisColor", "getLabelColor", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphAxisTheme {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final EnumC39333f axisColor;
    private final EnumC39333f labelColor;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisTheme;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphAxisTheme$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{AbstractC30060g.m92087G(enumC23463i, new C21179y0(10)), AbstractC30060g.m92087G(enumC23463i, new C21179y0(11))};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GraphAxisTheme() {
        this((EnumC39333f) null, (EnumC39333f) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.theme.color.WhoopColorKey", EnumC39333f.values());
    }

    public static /* synthetic */ GraphAxisTheme copy$default(GraphAxisTheme graphAxisTheme, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC39333f = graphAxisTheme.axisColor;
        }
        if ((i13 & 2) != 0) {
            enumC39333f2 = graphAxisTheme.labelColor;
        }
        return graphAxisTheme.copy(enumC39333f, enumC39333f2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphAxisTheme self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.axisColor != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, (InterfaceC37145j) interfaceC23462hArr[0].getValue(), self.axisColor);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 1) && self.labelColor == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.labelColor);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final EnumC39333f getAxisColor() {
        return this.axisColor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    public final GraphAxisTheme copy(EnumC39333f axisColor, EnumC39333f labelColor) {
        return new GraphAxisTheme(axisColor, labelColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphAxisTheme)) {
            return false;
        }
        GraphAxisTheme graphAxisTheme = (GraphAxisTheme) other;
        return this.axisColor == graphAxisTheme.axisColor && this.labelColor == graphAxisTheme.labelColor;
    }

    public final EnumC39333f getAxisColor() {
        return this.axisColor;
    }

    public final EnumC39333f getLabelColor() {
        return this.labelColor;
    }

    public int hashCode() {
        EnumC39333f enumC39333f = this.axisColor;
        int iHashCode = (enumC39333f == null ? 0 : enumC39333f.hashCode()) * 31;
        EnumC39333f enumC39333f2 = this.labelColor;
        return iHashCode + (enumC39333f2 != null ? enumC39333f2.hashCode() : 0);
    }

    public String toString() {
        return "GraphAxisTheme(axisColor=" + this.axisColor + ", labelColor=" + this.labelColor + ")";
    }

    public /* synthetic */ GraphAxisTheme(int i13, EnumC39333f enumC39333f, EnumC39333f enumC39333f2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.axisColor = null;
        } else {
            this.axisColor = enumC39333f;
        }
        if ((i13 & 2) == 0) {
            this.labelColor = null;
        } else {
            this.labelColor = enumC39333f2;
        }
    }

    public GraphAxisTheme(EnumC39333f enumC39333f, EnumC39333f enumC39333f2) {
        this.axisColor = enumC39333f;
        this.labelColor = enumC39333f2;
    }

    public /* synthetic */ GraphAxisTheme(EnumC39333f enumC39333f, EnumC39333f enumC39333f2, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : enumC39333f, (i13 & 2) != 0 ? null : enumC39333f2);
    }
}
