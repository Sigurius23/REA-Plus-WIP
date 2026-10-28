package com.whoop.design.models.items.graph.plane.button;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0002.-B3\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ>\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010'\u001a\u0004\b)\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010*\u001a\u0004\b+\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010*\u001a\u0004\b,\u0010\u001c¨\u0006/"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/button/GraphButton;", "", "", "id", "icon", "", "positionX", "positionY", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plane/button/GraphButton;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Float;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;)Lcom/whoop/design/models/items/graph/plane/button/GraphButton;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "Ljava/lang/Float;", "getPositionX", "getPositionY", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class GraphButton {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String icon;
    private final String id;
    private final Float positionX;
    private final Float positionY;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plane/button/GraphButton$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plane/button/GraphButton;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return GraphButton$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ GraphButton(int i13, String str, String str2, Float f13, Float f14, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i13 & 2)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 2, GraphButton$$serializer.INSTANCE.getDescriptor());
        }
        if ((i13 & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        this.icon = str2;
        if ((i13 & 4) == 0) {
            this.positionX = null;
        } else {
            this.positionX = f13;
        }
        if ((i13 & 8) == 0) {
            this.positionY = null;
        } else {
            this.positionY = f14;
        }
    }

    public static /* synthetic */ GraphButton copy$default(GraphButton graphButton, String str, String str2, Float f13, Float f14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = graphButton.id;
        }
        if ((i13 & 2) != 0) {
            str2 = graphButton.icon;
        }
        if ((i13 & 4) != 0) {
            f13 = graphButton.positionX;
        }
        if ((i13 & 8) != 0) {
            f14 = graphButton.positionY;
        }
        return graphButton.copy(str, str2, f13, f14);
    }

    public static final /* synthetic */ void write$Self$design_models_release(GraphButton self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        output.encodeStringElement(serialDesc, 1, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.positionX != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, FloatSerializer.INSTANCE, self.positionX);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.positionY == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, FloatSerializer.INSTANCE, self.positionY);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Float getPositionY() {
        return this.positionY;
    }

    public final GraphButton copy(String id4, String icon, Float positionX, Float positionY) {
        AbstractC22676k.m65750j(icon, "icon");
        return new GraphButton(id4, icon, positionX, positionY);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GraphButton)) {
            return false;
        }
        GraphButton graphButton = (GraphButton) other;
        return AbstractC22676k.m65745e(this.id, graphButton.id) && AbstractC22676k.m65745e(this.icon, graphButton.icon) && AbstractC22676k.m65745e(this.positionX, graphButton.positionX) && AbstractC22676k.m65745e(this.positionY, graphButton.positionY);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.id;
    }

    public final Float getPositionX() {
        return this.positionX;
    }

    public final Float getPositionY() {
        return this.positionY;
    }

    public int hashCode() {
        String str = this.id;
        int iM30450d = AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.icon);
        Float f13 = this.positionX;
        int iHashCode = (iM30450d + (f13 == null ? 0 : f13.hashCode())) * 31;
        Float f14 = this.positionY;
        return iHashCode + (f14 != null ? f14.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        Float f13 = this.positionX;
        Float f14 = this.positionY;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("GraphButton(id=", str, ", icon=", str2, ", positionX=");
        sbM32001t.append(f13);
        sbM32001t.append(", positionY=");
        sbM32001t.append(f14);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public GraphButton(String str, String icon, Float f13, Float f14) {
        AbstractC22676k.m65750j(icon, "icon");
        this.id = str;
        this.icon = icon;
        this.positionX = f13;
        this.positionY = f14;
    }

    public /* synthetic */ GraphButton(String str, String str2, Float f13, Float f14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? null : str, str2, (i13 & 4) != 0 ? null : f13, (i13 & 8) != 0 ? null : f14);
    }
}
