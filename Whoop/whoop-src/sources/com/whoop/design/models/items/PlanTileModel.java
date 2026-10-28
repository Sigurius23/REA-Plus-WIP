package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36961h;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u0000 >2\u00020\u0001:\u0002?>BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB_\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u001eR\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00104\u0012\u0004\b6\u00107\u001a\u0004\b5\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b8\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010$R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00101\u001a\u0004\b;\u0010\u001eR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b=\u0010'¨\u0006@"}, m65681d2 = {"Lcom/whoop/design/models/items/PlanTileModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "subtitleDisplay", "Lcom/whoop/navigation/e;", "destination", "backgroundImage", "Lcom/whoop/design/models/items/PlanStyle;", "style", "icon", "", "locked", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/PlanStyle;Ljava/lang/String;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/PlanStyle;Ljava/lang/String;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/PlanTileModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/navigation/e;", "component4", "component5", "()Lcom/whoop/design/models/items/PlanStyle;", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Ljava/lang/String;Lcom/whoop/design/models/items/PlanStyle;Ljava/lang/String;Z)Lcom/whoop/design/models/items/PlanTileModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getSubtitleDisplay", "Lcom/whoop/navigation/e;", "getDestination", "getDestination$annotations", "()V", "getBackgroundImage", "Lcom/whoop/design/models/items/PlanStyle;", "getStyle", "getIcon", "Z", "getLocked", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class PlanTileModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    private final String backgroundImage;
    private final C9598e destination;
    private final String icon;
    private final boolean locked;
    private final PlanStyle style;
    private final String subtitleDisplay;
    private final String titleDisplay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/PlanTileModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/PlanTileModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return PlanTileModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, AbstractC30060g.m92087G(enumC23463i, new C36961h(20)), null, AbstractC30060g.m92087G(enumC23463i, new C36961h(21)), null, null};
    }

    public /* synthetic */ PlanTileModel(int i13, String str, String str2, C9598e c9598e, String str3, PlanStyle planStyle, String str4, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, PlanTileModel$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.subtitleDisplay = str2;
        this.destination = c9598e;
        this.backgroundImage = str3;
        this.style = planStyle;
        this.icon = str4;
        this.locked = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.models.items.PlanStyle", PlanStyle.values());
    }

    public static /* synthetic */ PlanTileModel copy$default(PlanTileModel planTileModel, String str, String str2, C9598e c9598e, String str3, PlanStyle planStyle, String str4, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = planTileModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = planTileModel.subtitleDisplay;
        }
        if ((i13 & 4) != 0) {
            c9598e = planTileModel.destination;
        }
        if ((i13 & 8) != 0) {
            str3 = planTileModel.backgroundImage;
        }
        if ((i13 & 16) != 0) {
            planStyle = planTileModel.style;
        }
        if ((i13 & 32) != 0) {
            str4 = planTileModel.icon;
        }
        if ((i13 & 64) != 0) {
            z4 = planTileModel.locked;
        }
        String str5 = str4;
        boolean z13 = z4;
        PlanStyle planStyle2 = planStyle;
        C9598e c9598e2 = c9598e;
        return planTileModel.copy(str, str2, c9598e2, str3, planStyle2, str5, z13);
    }

    public static /* synthetic */ void getDestination$annotations() {
    }

    public static final /* synthetic */ void write$Self$design_models_release(PlanTileModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.subtitleDisplay);
        output.encodeNullableSerializableElement(serialDesc, 2, (InterfaceC37145j) interfaceC23462hArr[2].getValue(), self.destination);
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.backgroundImage);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.style);
        output.encodeStringElement(serialDesc, 5, self.icon);
        output.encodeBooleanElement(serialDesc, 6, self.locked);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final C9598e getDestination() {
        return this.destination;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PlanStyle getStyle() {
        return this.style;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getLocked() {
        return this.locked;
    }

    public final PlanTileModel copy(String titleDisplay, String subtitleDisplay, C9598e destination, String backgroundImage, PlanStyle style, String icon, boolean locked) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(icon, "icon");
        return new PlanTileModel(titleDisplay, subtitleDisplay, destination, backgroundImage, style, icon, locked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlanTileModel)) {
            return false;
        }
        PlanTileModel planTileModel = (PlanTileModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, planTileModel.titleDisplay) && AbstractC22676k.m65745e(this.subtitleDisplay, planTileModel.subtitleDisplay) && AbstractC22676k.m65745e(this.destination, planTileModel.destination) && AbstractC22676k.m65745e(this.backgroundImage, planTileModel.backgroundImage) && this.style == planTileModel.style && AbstractC22676k.m65745e(this.icon, planTileModel.icon) && this.locked == planTileModel.locked;
    }

    public final String getBackgroundImage() {
        return this.backgroundImage;
    }

    public final C9598e getDestination() {
        return this.destination;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final boolean getLocked() {
        return this.locked;
    }

    public final PlanStyle getStyle() {
        return this.style;
    }

    public final String getSubtitleDisplay() {
        return this.subtitleDisplay;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.subtitleDisplay);
        C9598e c9598e = this.destination;
        int iHashCode = (iM30450d + (c9598e == null ? 0 : c9598e.hashCode())) * 31;
        String str = this.backgroundImage;
        return Boolean.hashCode(this.locked) + AbstractC11266d.m30450d((this.style.hashCode() + ((iHashCode + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.icon);
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.subtitleDisplay;
        C9598e c9598e = this.destination;
        String str3 = this.backgroundImage;
        PlanStyle planStyle = this.style;
        String str4 = this.icon;
        boolean z4 = this.locked;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("PlanTileModel(titleDisplay=", str, ", subtitleDisplay=", str2, ", destination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", backgroundImage=");
        sbM32001t.append(str3);
        sbM32001t.append(", style=");
        sbM32001t.append(planStyle);
        sbM32001t.append(", icon=");
        sbM32001t.append(str4);
        sbM32001t.append(", locked=");
        return AbstractC18489d0.m53372m(sbM32001t, z4, ")");
    }

    public PlanTileModel(String titleDisplay, String subtitleDisplay, C9598e c9598e, String str, PlanStyle style, String icon, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(subtitleDisplay, "subtitleDisplay");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(icon, "icon");
        this.titleDisplay = titleDisplay;
        this.subtitleDisplay = subtitleDisplay;
        this.destination = c9598e;
        this.backgroundImage = str;
        this.style = style;
        this.icon = icon;
        this.locked = z4;
    }
}
