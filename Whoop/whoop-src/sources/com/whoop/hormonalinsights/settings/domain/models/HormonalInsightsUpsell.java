package com.whoop.hormonalinsights.settings.domain.models;

import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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
import ri2.C31469a;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000276BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JR\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\t2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010-\u001a\u0004\b0\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010-\u001a\u0004\b1\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b5\u0010#¨\u00068"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "Lcom/whoop/design/models/DesignSystemModel;", "", "descriptionDisplay", "icon", "ctaTextDisplay", "ctaIcon", "Lcom/whoop/navigation/e;", "ctaDestination", "", "dismissable", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Z)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;ZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/navigation/e;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Z)Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescriptionDisplay", "getIcon", "getCtaTextDisplay", "getCtaIcon", "Lcom/whoop/navigation/e;", "getCtaDestination", "Z", "getDismissable", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class HormonalInsightsUpsell implements DesignSystemModel {
    private final C9598e ctaDestination;
    private final String ctaIcon;
    private final String ctaTextDisplay;
    private final String descriptionDisplay;
    private final boolean dismissable;
    private final String icon;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C31469a(16)), null};

    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return HormonalInsightsUpsell$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ HormonalInsightsUpsell(int i13, String str, String str2, String str3, String str4, C9598e c9598e, boolean z4, SerializationConstructorMarker serializationConstructorMarker) {
        if (35 != (i13 & 35)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 35, HormonalInsightsUpsell$$serializer.INSTANCE.getDescriptor());
        }
        this.descriptionDisplay = str;
        this.icon = str2;
        if ((i13 & 4) == 0) {
            this.ctaTextDisplay = null;
        } else {
            this.ctaTextDisplay = str3;
        }
        if ((i13 & 8) == 0) {
            this.ctaIcon = null;
        } else {
            this.ctaIcon = str4;
        }
        if ((i13 & 16) == 0) {
            this.ctaDestination = null;
        } else {
            this.ctaDestination = c9598e;
        }
        this.dismissable = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ HormonalInsightsUpsell copy$default(HormonalInsightsUpsell hormonalInsightsUpsell, String str, String str2, String str3, String str4, C9598e c9598e, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = hormonalInsightsUpsell.descriptionDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = hormonalInsightsUpsell.icon;
        }
        if ((i13 & 4) != 0) {
            str3 = hormonalInsightsUpsell.ctaTextDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = hormonalInsightsUpsell.ctaIcon;
        }
        if ((i13 & 16) != 0) {
            c9598e = hormonalInsightsUpsell.ctaDestination;
        }
        if ((i13 & 32) != 0) {
            z4 = hormonalInsightsUpsell.dismissable;
        }
        C9598e c9598e2 = c9598e;
        boolean z13 = z4;
        return hormonalInsightsUpsell.copy(str, str2, str3, str4, c9598e2, z13);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(HormonalInsightsUpsell self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 1, self.icon);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.ctaTextDisplay != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.ctaTextDisplay);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.ctaIcon != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.ctaIcon);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.ctaDestination != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.ctaDestination);
        }
        output.encodeBooleanElement(serialDesc, 5, self.dismissable);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getDismissable() {
        return this.dismissable;
    }

    public final HormonalInsightsUpsell copy(String descriptionDisplay, String icon, String ctaTextDisplay, String ctaIcon, C9598e ctaDestination, boolean dismissable) {
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(icon, "icon");
        return new HormonalInsightsUpsell(descriptionDisplay, icon, ctaTextDisplay, ctaIcon, ctaDestination, dismissable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HormonalInsightsUpsell)) {
            return false;
        }
        HormonalInsightsUpsell hormonalInsightsUpsell = (HormonalInsightsUpsell) other;
        return AbstractC22676k.m65745e(this.descriptionDisplay, hormonalInsightsUpsell.descriptionDisplay) && AbstractC22676k.m65745e(this.icon, hormonalInsightsUpsell.icon) && AbstractC22676k.m65745e(this.ctaTextDisplay, hormonalInsightsUpsell.ctaTextDisplay) && AbstractC22676k.m65745e(this.ctaIcon, hormonalInsightsUpsell.ctaIcon) && AbstractC22676k.m65745e(this.ctaDestination, hormonalInsightsUpsell.ctaDestination) && this.dismissable == hormonalInsightsUpsell.dismissable;
    }

    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final boolean getDismissable() {
        return this.dismissable;
    }

    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.descriptionDisplay.hashCode() * 31, 31, this.icon);
        String str = this.ctaTextDisplay;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ctaIcon;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        C9598e c9598e = this.ctaDestination;
        return Boolean.hashCode(this.dismissable) + ((iHashCode2 + (c9598e != null ? c9598e.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.descriptionDisplay;
        String str2 = this.icon;
        String str3 = this.ctaTextDisplay;
        String str4 = this.ctaIcon;
        C9598e c9598e = this.ctaDestination;
        boolean z4 = this.dismissable;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("HormonalInsightsUpsell(descriptionDisplay=", str, ", icon=", str2, ", ctaTextDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", ctaIcon=", str4, ", ctaDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", dismissable=");
        sbM32001t.append(z4);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public HormonalInsightsUpsell(String descriptionDisplay, String icon, String str, String str2, C9598e c9598e, boolean z4) {
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(icon, "icon");
        this.descriptionDisplay = descriptionDisplay;
        this.icon = icon;
        this.ctaTextDisplay = str;
        this.ctaIcon = str2;
        this.ctaDestination = c9598e;
        this.dismissable = z4;
    }

    public /* synthetic */ HormonalInsightsUpsell(String str, String str2, String str3, String str4, C9598e c9598e, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i13 & 4) != 0 ? null : str3, (i13 & 8) != 0 ? null : str4, (i13 & 16) != 0 ? null : c9598e, z4);
    }
}
