package com.whoop.design.models.items;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import gz0.EnumC16313m0;
import hc3.AbstractC17176i;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import w91.C36963j;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0002\b\u0011\b\u0087\b\u0018\u0000 <2\u00020\u0001:\u0002=<BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eB]\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JZ\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010/\u001a\u00020\u000b2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00103\u001a\u0004\b4\u0010 R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b6\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b8\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b9\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010:\u001a\u0004\b;\u0010'¨\u0006>"}, m65681d2 = {"Lcom/whoop/design/models/items/ShippingProgressBarModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "titleDisplay", "", "progressPercentage", "leadingSubtext", "trailingSubtext", "Lgz0/m0;", "icon", "leadingIcon", "", "hideProgressBar", "<init>", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$design_models_release", "(Lcom/whoop/design/models/items/ShippingProgressBarModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "()D", "component3", "component4", "component5", "()Lgz0/m0;", "component6", "component7", "()Z", "copy", "(Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Z)Lcom/whoop/design/models/items/ShippingProgressBarModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "D", "getProgressPercentage", "getLeadingSubtext", "getTrailingSubtext", "Lgz0/m0;", "getIcon", "getLeadingIcon", "Z", "getHideProgressBar", "Companion", "$serializer", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class ShippingProgressBarModel implements DesignSystemModel {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean hideProgressBar;
    private final EnumC16313m0 icon;
    private final EnumC16313m0 leadingIcon;
    private final String leadingSubtext;
    private final double progressPercentage;
    private final String titleDisplay;
    private final String trailingSubtext;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/design/models/items/ShippingProgressBarModel$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/design/models/items/ShippingProgressBarModel;", "serializer", "()Lwc3/c;", "design-models_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return ShippingProgressBarModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36963j(13)), AbstractC30060g.m92087G(enumC23463i, new C36963j(14)), null};
    }

    public ShippingProgressBarModel() {
        this((String) null, 0.0d, (String) null, (String) null, (EnumC16313m0) null, (EnumC16313m0) null, false, 127, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.design.atomic.atom.icon.WhoopIconMapper", EnumC16313m0.values());
    }

    public static /* synthetic */ ShippingProgressBarModel copy$default(ShippingProgressBarModel shippingProgressBarModel, String str, double d3, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = shippingProgressBarModel.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            d3 = shippingProgressBarModel.progressPercentage;
        }
        if ((i13 & 4) != 0) {
            str2 = shippingProgressBarModel.leadingSubtext;
        }
        if ((i13 & 8) != 0) {
            str3 = shippingProgressBarModel.trailingSubtext;
        }
        if ((i13 & 16) != 0) {
            enumC16313m0 = shippingProgressBarModel.icon;
        }
        if ((i13 & 32) != 0) {
            enumC16313m1 = shippingProgressBarModel.leadingIcon;
        }
        if ((i13 & 64) != 0) {
            z4 = shippingProgressBarModel.hideProgressBar;
        }
        boolean z13 = z4;
        EnumC16313m0 enumC16313m2 = enumC16313m0;
        String str4 = str2;
        return shippingProgressBarModel.copy(str, d3, str4, str3, enumC16313m2, enumC16313m1, z13);
    }

    public static final /* synthetic */ void write$Self$design_models_release(ShippingProgressBarModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !AbstractC22676k.m65745e(self.titleDisplay, "")) {
            output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || Double.compare(self.progressPercentage, 0.0d) != 0) {
            output.encodeDoubleElement(serialDesc, 1, self.progressPercentage);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || !AbstractC22676k.m65745e(self.leadingSubtext, "")) {
            output.encodeStringElement(serialDesc, 2, self.leadingSubtext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || !AbstractC22676k.m65745e(self.trailingSubtext, "")) {
            output.encodeStringElement(serialDesc, 3, self.trailingSubtext);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.icon != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.icon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.leadingIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.leadingIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.hideProgressBar) {
            output.encodeBooleanElement(serialDesc, 6, self.hideProgressBar);
        }
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getProgressPercentage() {
        return this.progressPercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLeadingSubtext() {
        return this.leadingSubtext;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTrailingSubtext() {
        return this.trailingSubtext;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getHideProgressBar() {
        return this.hideProgressBar;
    }

    public final ShippingProgressBarModel copy(String titleDisplay, double progressPercentage, String leadingSubtext, String trailingSubtext, EnumC16313m0 icon, EnumC16313m0 leadingIcon, boolean hideProgressBar) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(leadingSubtext, "leadingSubtext");
        AbstractC22676k.m65750j(trailingSubtext, "trailingSubtext");
        return new ShippingProgressBarModel(titleDisplay, progressPercentage, leadingSubtext, trailingSubtext, icon, leadingIcon, hideProgressBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShippingProgressBarModel)) {
            return false;
        }
        ShippingProgressBarModel shippingProgressBarModel = (ShippingProgressBarModel) other;
        return AbstractC22676k.m65745e(this.titleDisplay, shippingProgressBarModel.titleDisplay) && Double.compare(this.progressPercentage, shippingProgressBarModel.progressPercentage) == 0 && AbstractC22676k.m65745e(this.leadingSubtext, shippingProgressBarModel.leadingSubtext) && AbstractC22676k.m65745e(this.trailingSubtext, shippingProgressBarModel.trailingSubtext) && this.icon == shippingProgressBarModel.icon && this.leadingIcon == shippingProgressBarModel.leadingIcon && this.hideProgressBar == shippingProgressBarModel.hideProgressBar;
    }

    public final boolean getHideProgressBar() {
        return this.hideProgressBar;
    }

    public final EnumC16313m0 getIcon() {
        return this.icon;
    }

    public final EnumC16313m0 getLeadingIcon() {
        return this.leadingIcon;
    }

    public final String getLeadingSubtext() {
        return this.leadingSubtext;
    }

    public final double getProgressPercentage() {
        return this.progressPercentage;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final String getTrailingSubtext() {
        return this.trailingSubtext;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC17176i.m48499a(this.titleDisplay.hashCode() * 31, 31, this.progressPercentage), 31, this.leadingSubtext), 31, this.trailingSubtext);
        EnumC16313m0 enumC16313m0 = this.icon;
        int iHashCode = (iM30450d + (enumC16313m0 == null ? 0 : enumC16313m0.hashCode())) * 31;
        EnumC16313m0 enumC16313m1 = this.leadingIcon;
        return Boolean.hashCode(this.hideProgressBar) + ((iHashCode + (enumC16313m1 != null ? enumC16313m1.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.titleDisplay;
        double d3 = this.progressPercentage;
        String str2 = this.leadingSubtext;
        String str3 = this.trailingSubtext;
        EnumC16313m0 enumC16313m0 = this.icon;
        EnumC16313m0 enumC16313m1 = this.leadingIcon;
        boolean z4 = this.hideProgressBar;
        StringBuilder sb4 = new StringBuilder("ShippingProgressBarModel(titleDisplay=");
        sb4.append(str);
        sb4.append(", progressPercentage=");
        sb4.append(d3);
        AbstractC11266d.m30444B(sb4, ", leadingSubtext=", str2, ", trailingSubtext=", str3);
        sb4.append(", icon=");
        sb4.append(enumC16313m0);
        sb4.append(", leadingIcon=");
        sb4.append(enumC16313m1);
        sb4.append(", hideProgressBar=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ ShippingProgressBarModel(int i13, String str, double d3, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i13 & 1) == 0) {
            this.titleDisplay = "";
        } else {
            this.titleDisplay = str;
        }
        if ((i13 & 2) == 0) {
            this.progressPercentage = 0.0d;
        } else {
            this.progressPercentage = d3;
        }
        if ((i13 & 4) == 0) {
            this.leadingSubtext = "";
        } else {
            this.leadingSubtext = str2;
        }
        if ((i13 & 8) == 0) {
            this.trailingSubtext = "";
        } else {
            this.trailingSubtext = str3;
        }
        if ((i13 & 16) == 0) {
            this.icon = null;
        } else {
            this.icon = enumC16313m0;
        }
        if ((i13 & 32) == 0) {
            this.leadingIcon = null;
        } else {
            this.leadingIcon = enumC16313m1;
        }
        if ((i13 & 64) == 0) {
            this.hideProgressBar = false;
        } else {
            this.hideProgressBar = z4;
        }
    }

    public ShippingProgressBarModel(String titleDisplay, double d3, String leadingSubtext, String trailingSubtext, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(leadingSubtext, "leadingSubtext");
        AbstractC22676k.m65750j(trailingSubtext, "trailingSubtext");
        this.titleDisplay = titleDisplay;
        this.progressPercentage = d3;
        this.leadingSubtext = leadingSubtext;
        this.trailingSubtext = trailingSubtext;
        this.icon = enumC16313m0;
        this.leadingIcon = enumC16313m1;
        this.hideProgressBar = z4;
    }

    public /* synthetic */ ShippingProgressBarModel(String str, double d3, String str2, String str3, EnumC16313m0 enumC16313m0, EnumC16313m0 enumC16313m1, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? "" : str, (i13 & 2) != 0 ? 0.0d : d3, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : enumC16313m0, (i13 & 32) != 0 ? null : enumC16313m1, (i13 & 64) != 0 ? false : z4);
    }
}
