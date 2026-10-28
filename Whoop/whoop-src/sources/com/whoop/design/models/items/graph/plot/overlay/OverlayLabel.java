package com.whoop.design.models.items.graph.plot.overlay;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import ma1.C25371a;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.C37140e;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0002DCBY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J'\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010'J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b+\u0010,Jr\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010!J\u0010\u00100\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u0002032\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00108\u001a\u0004\b9\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010'R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b>\u0010'R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010?\u001a\u0004\b@\u0010*R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bB\u0010,¨\u0006E"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;", "", "", "activityId", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;", "cta", "topLabel", "topIconUrl", "", "positionX", "positionY", "", "Lcom/whoop/design/models/DesignSystemModel;", "overlayLabelCtaContent", "Lgz0/m0;", "secondaryIcon", "<init>", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;", "component3", "component4", "component5", "()F", "component6", "component7", "()Ljava/util/List;", "component8", "()Lgz0/m0;", "copy", "(Ljava/lang/String;Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;Ljava/lang/String;Ljava/lang/String;FFLjava/util/List;Lgz0/m0;)Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getActivityId", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayCta;", "getCta", "getTopLabel", "getTopIconUrl", "F", "getPositionX", "getPositionY", "Ljava/util/List;", "getOverlayLabelCtaContent", "Lgz0/m0;", "getSecondaryIcon", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class OverlayLabel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String activityId;
    private final OverlayCta cta;
    private final List<DesignSystemModel> overlayLabelCtaContent;
    private final float positionX;
    private final float positionY;
    private final EnumC16313m0 secondaryIcon;
    private final String topIconUrl;
    private final String topLabel;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/graph/plot/overlay/OverlayLabel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return OverlayLabel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, AbstractC30060g.m92087G(enumC23463i, new C25371a(26)), null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C25371a(27)), AbstractC30060g.m92087G(enumC23463i, new C25371a(28))};
    }

    public /* synthetic */ OverlayLabel(int i13, String str, OverlayCta overlayCta, String str2, String str3, float f13, float f14, List list, EnumC16313m0 enumC16313m0, SerializationConstructorMarker serializationConstructorMarker) {
        if (255 != (i13 & 255)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 255, OverlayLabel$$serializer.INSTANCE.getDescriptor());
        }
        this.activityId = str;
        this.cta = overlayCta;
        this.topLabel = str2;
        this.topIconUrl = str3;
        this.positionX = f13;
        this.positionY = f14;
        this.overlayLabelCtaContent = list;
        this.secondaryIcon = enumC16313m0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.graph.plot.overlay.OverlayCta", OverlayCta.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_$0() {
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        return new ArrayListSerializer(new C37136a(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new C37140e(c22673i0.getOrCreateKotlinClass(DesignSystemModel.class), new Annotation[0]), new InterfaceC37138c[0]));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$1() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OverlayLabel copy$default(OverlayLabel overlayLabel, String str, OverlayCta overlayCta, String str2, String str3, float f13, float f14, List list, EnumC16313m0 enumC16313m0, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = overlayLabel.activityId;
        }
        if ((i13 & 2) != 0) {
            overlayCta = overlayLabel.cta;
        }
        if ((i13 & 4) != 0) {
            str2 = overlayLabel.topLabel;
        }
        if ((i13 & 8) != 0) {
            str3 = overlayLabel.topIconUrl;
        }
        if ((i13 & 16) != 0) {
            f13 = overlayLabel.positionX;
        }
        if ((i13 & 32) != 0) {
            f14 = overlayLabel.positionY;
        }
        if ((i13 & 64) != 0) {
            list = overlayLabel.overlayLabelCtaContent;
        }
        if ((i13 & 128) != 0) {
            enumC16313m0 = overlayLabel.secondaryIcon;
        }
        List list2 = list;
        EnumC16313m0 enumC16313m1 = enumC16313m0;
        float f15 = f13;
        float f16 = f14;
        return overlayLabel.copy(str, overlayCta, str2, str3, f15, f16, list2, enumC16313m1);
    }

    public static final /* synthetic */ void write$Self$design_models_release(OverlayLabel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.activityId);
        output.encodeNullableSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.cta);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.topLabel);
        output.encodeNullableSerializableElement(serialDesc, 3, stringSerializer, self.topIconUrl);
        output.encodeFloatElement(serialDesc, 4, self.positionX);
        output.encodeFloatElement(serialDesc, 5, self.positionY);
        output.encodeNullableSerializableElement(serialDesc, 6, (InterfaceC37145j) interfaceC23462hArr[6].getValue(), self.overlayLabelCtaContent);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.secondaryIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActivityId() {
        return this.activityId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final OverlayCta getCta() {
        return this.cta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTopLabel() {
        return this.topLabel;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTopIconUrl() {
        return this.topIconUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final float getPositionX() {
        return this.positionX;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final float getPositionY() {
        return this.positionY;
    }

    public final List<DesignSystemModel> component7() {
        return this.overlayLabelCtaContent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final EnumC16313m0 getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final OverlayLabel copy(String activityId, OverlayCta cta, String topLabel, String topIconUrl, float positionX, float positionY, List<? extends DesignSystemModel> overlayLabelCtaContent, EnumC16313m0 secondaryIcon) {
        return new OverlayLabel(activityId, cta, topLabel, topIconUrl, positionX, positionY, overlayLabelCtaContent, secondaryIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OverlayLabel)) {
            return false;
        }
        OverlayLabel overlayLabel = (OverlayLabel) other;
        return AbstractC22676k.m65745e(this.activityId, overlayLabel.activityId) && this.cta == overlayLabel.cta && AbstractC22676k.m65745e(this.topLabel, overlayLabel.topLabel) && AbstractC22676k.m65745e(this.topIconUrl, overlayLabel.topIconUrl) && Float.compare(this.positionX, overlayLabel.positionX) == 0 && Float.compare(this.positionY, overlayLabel.positionY) == 0 && AbstractC22676k.m65745e(this.overlayLabelCtaContent, overlayLabel.overlayLabelCtaContent) && this.secondaryIcon == overlayLabel.secondaryIcon;
    }

    public final String getActivityId() {
        return this.activityId;
    }

    public final OverlayCta getCta() {
        return this.cta;
    }

    public final List<DesignSystemModel> getOverlayLabelCtaContent() {
        return this.overlayLabelCtaContent;
    }

    public final float getPositionX() {
        return this.positionX;
    }

    public final float getPositionY() {
        return this.positionY;
    }

    public final EnumC16313m0 getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final String getTopIconUrl() {
        return this.topIconUrl;
    }

    public final String getTopLabel() {
        return this.topLabel;
    }

    public int hashCode() {
        String str = this.activityId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        OverlayCta overlayCta = this.cta;
        int iHashCode2 = (iHashCode + (overlayCta == null ? 0 : overlayCta.hashCode())) * 31;
        String str2 = this.topLabel;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.topIconUrl;
        int iM30447a = AbstractC11266d.m30447a(this.positionY, AbstractC11266d.m30447a(this.positionX, (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31), 31);
        List<DesignSystemModel> list = this.overlayLabelCtaContent;
        int iHashCode4 = (iM30447a + (list == null ? 0 : list.hashCode())) * 31;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        return iHashCode4 + (enumC16313m0 != null ? enumC16313m0.hashCode() : 0);
    }

    public String toString() {
        String str = this.activityId;
        OverlayCta overlayCta = this.cta;
        String str2 = this.topLabel;
        String str3 = this.topIconUrl;
        float f13 = this.positionX;
        float f14 = this.positionY;
        List<DesignSystemModel> list = this.overlayLabelCtaContent;
        EnumC16313m0 enumC16313m0 = this.secondaryIcon;
        StringBuilder sb4 = new StringBuilder("OverlayLabel(activityId=");
        sb4.append(str);
        sb4.append(", cta=");
        sb4.append(overlayCta);
        sb4.append(", topLabel=");
        AbstractC11266d.m30444B(sb4, str2, ", topIconUrl=", str3, ", positionX=");
        AbstractC30802r.m94772u(sb4, f13, ", positionY=", f14, ", overlayLabelCtaContent=");
        sb4.append(list);
        sb4.append(", secondaryIcon=");
        sb4.append(enumC16313m0);
        sb4.append(")");
        return sb4.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OverlayLabel(String str, OverlayCta overlayCta, String str2, String str3, float f13, float f14, List<? extends DesignSystemModel> list, EnumC16313m0 enumC16313m0) {
        this.activityId = str;
        this.cta = overlayCta;
        this.topLabel = str2;
        this.topIconUrl = str3;
        this.positionX = f13;
        this.positionY = f14;
        this.overlayLabelCtaContent = list;
        this.secondaryIcon = enumC16313m0;
    }
}
