package com.whoop.design.models.items.graph.plot.overlay;

import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
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
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000243B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bBG\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b \u0010!JD\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!¨\u00065"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;", "", "", "positionX", "width", "height", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;", "style", "", "accessibilityLabel", "<init>", "(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()F", "component2", "component3", "component4", "()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;", "component5", "()Ljava/lang/String;", "copy", "(FFFLcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;Ljava/lang/String;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "getPositionX", "getWidth", "getHeight", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBarStyle;", "getStyle", "Ljava/lang/String;", "getAccessibilityLabel", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OverlayBar {
    public static final int $stable = 0;
    private final String accessibilityLabel;
    private final float height;
    private final float positionX;
    private final OverlayBarStyle style;
    private final float width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C25371a(24)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayBar;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OverlayBar$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public OverlayBar(float f13, float f14, float f15, OverlayBarStyle style, String str) {
        AbstractC22676k.m65750j(style, "style");
        this.positionX = f13;
        this.width = f14;
        this.height = f15;
        this.style = style;
        this.accessibilityLabel = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.overlay.OverlayBarStyle", OverlayBarStyle.values());
    }

    public static /* synthetic */ OverlayBar copy$default(OverlayBar overlayBar, float f13, float f14, float f15, OverlayBarStyle overlayBarStyle, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            f13 = overlayBar.positionX;
        }
        if ((i13 & 2) != 0) {
            f14 = overlayBar.width;
        }
        if ((i13 & 4) != 0) {
            f15 = overlayBar.height;
        }
        if ((i13 & 8) != 0) {
            overlayBarStyle = overlayBar.style;
        }
        if ((i13 & 16) != 0) {
            str = overlayBar.accessibilityLabel;
        }
        String str2 = str;
        float f16 = f15;
        return overlayBar.copy(f13, f14, f16, overlayBarStyle, str2);
    }

    public static final /* synthetic */ void write$Self$design_models_release(OverlayBar self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeFloatElement(serialDesc, 0, self.positionX);
        output.encodeFloatElement(serialDesc, 1, self.width);
        output.encodeFloatElement(serialDesc, 2, self.height);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.style);
        output.encodeNullableSerializableElement(serialDesc, 4, StringSerializer.INSTANCE, self.accessibilityLabel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final float getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final OverlayBarStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final OverlayBar copy(float positionX, float width, float height, OverlayBarStyle style, String accessibilityLabel) {
        AbstractC22676k.m65750j(style, "style");
        return new OverlayBar(positionX, width, height, style, accessibilityLabel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayBar)) {
            return false;
        }
        OverlayBar overlayBar = (OverlayBar) other;
        return Float.compare(this.positionX, overlayBar.positionX) == 0 && Float.compare(this.width, overlayBar.width) == 0 && Float.compare(this.height, overlayBar.height) == 0 && this.style == overlayBar.style && AbstractC22676k.m65745e(this.accessibilityLabel, overlayBar.accessibilityLabel);
    }

    public final String getAccessibilityLabel() {
        return this.accessibilityLabel;
    }

    public final float getHeight() {
        return this.height;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final OverlayBarStyle getStyle() {
        return this.style;
    }

    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = (this.style.hashCode() + AbstractC11266d.m30447a(this.height, AbstractC11266d.m30447a(this.width, Float.hashCode(this.positionX) * 31, 31), 31)) * 31;
        String str = this.accessibilityLabel;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        float f13 = this.positionX;
        float f14 = this.width;
        float f15 = this.height;
        OverlayBarStyle overlayBarStyle = this.style;
        String str = this.accessibilityLabel;
        StringBuilder sbM8307t = AbstractC2875y.m8307t("OverlayBar(positionX=", f13, ", width=", f14, ", height=");
        sbM8307t.append(f15);
        sbM8307t.append(", style=");
        sbM8307t.append(overlayBarStyle);
        sbM8307t.append(", accessibilityLabel=");
        return AbstractC25012a.m73376i(str, ")", sbM8307t);
    }

    public /* synthetic */ OverlayBar(int i13, float f13, float f14, float f15, OverlayBarStyle overlayBarStyle, String str, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, OverlayBar$$serializer.INSTANCE.getDescriptor());
        }
        this.positionX = f13;
        this.width = f14;
        this.height = f15;
        this.style = overlayBarStyle;
        this.accessibilityLabel = str;
    }
}
