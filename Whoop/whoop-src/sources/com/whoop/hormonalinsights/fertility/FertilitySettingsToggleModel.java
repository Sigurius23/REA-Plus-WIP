package com.whoop.hormonalinsights.fertility;

import bf2.C3201a;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.C37136a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u0000 62\u00020\u0001:\u000278B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJL\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020\u00052\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010-\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b1\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b4\u0010\u001cR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b5\u0010\u001c¨\u00069"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;", "Lcom/whoop/design/models/DesignSystemModel;", "", "title", "description", "", "enabled", "Lcom/whoop/navigation/e;", "ctaDestination", "ctaTextDisplay", "ctaIcon", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()Lcom/whoop/navigation/e;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getDescription", "Z", "getEnabled", "Lcom/whoop/navigation/e;", "getCtaDestination", "getCtaTextDisplay", "getCtaIcon", "Companion", "$serializer", "a", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FertilitySettingsToggleModel implements DesignSystemModel {
    private final C9598e ctaDestination;
    private final String ctaIcon;
    private final String ctaTextDisplay;
    private final String description;
    private final boolean enabled;
    private final String title;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C3201a(27)), null, null};

    /* JADX INFO: renamed from: com.whoop.hormonalinsights.fertility.FertilitySettingsToggleModel$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel$a;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/fertility/FertilitySettingsToggleModel;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FertilitySettingsToggleModel$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FertilitySettingsToggleModel(int i13, String str, String str2, boolean z4, C9598e c9598e, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, FertilitySettingsToggleModel$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.enabled = z4;
        this.ctaDestination = c9598e;
        this.ctaTextDisplay = str3;
        this.ctaIcon = str4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC37138c _childSerializers$_anonymous_() {
        return new C37136a(AbstractC22671h0.f89337a.getOrCreateKotlinClass(C9598e.class), null, new InterfaceC37138c[0]);
    }

    public static /* synthetic */ FertilitySettingsToggleModel copy$default(FertilitySettingsToggleModel fertilitySettingsToggleModel, String str, String str2, boolean z4, C9598e c9598e, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = fertilitySettingsToggleModel.title;
        }
        if ((i13 & 2) != 0) {
            str2 = fertilitySettingsToggleModel.description;
        }
        if ((i13 & 4) != 0) {
            z4 = fertilitySettingsToggleModel.enabled;
        }
        if ((i13 & 8) != 0) {
            c9598e = fertilitySettingsToggleModel.ctaDestination;
        }
        if ((i13 & 16) != 0) {
            str3 = fertilitySettingsToggleModel.ctaTextDisplay;
        }
        if ((i13 & 32) != 0) {
            str4 = fertilitySettingsToggleModel.ctaIcon;
        }
        String str5 = str3;
        String str6 = str4;
        return fertilitySettingsToggleModel.copy(str, str2, z4, c9598e, str5, str6);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(FertilitySettingsToggleModel self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeBooleanElement(serialDesc, 2, self.enabled);
        output.encodeSerializableElement(serialDesc, 3, (InterfaceC37145j) interfaceC23462hArr[3].getValue(), self.ctaDestination);
        output.encodeStringElement(serialDesc, 4, self.ctaTextDisplay);
        output.encodeStringElement(serialDesc, 5, self.ctaIcon);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final C9598e getCtaDestination() {
        return this.ctaDestination;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCtaTextDisplay() {
        return this.ctaTextDisplay;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getCtaIcon() {
        return this.ctaIcon;
    }

    public final FertilitySettingsToggleModel copy(String title, String description, boolean enabled, C9598e ctaDestination, String ctaTextDisplay, String ctaIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(ctaDestination, "ctaDestination");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        return new FertilitySettingsToggleModel(title, description, enabled, ctaDestination, ctaTextDisplay, ctaIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FertilitySettingsToggleModel)) {
            return false;
        }
        FertilitySettingsToggleModel fertilitySettingsToggleModel = (FertilitySettingsToggleModel) other;
        return AbstractC22676k.m65745e(this.title, fertilitySettingsToggleModel.title) && AbstractC22676k.m65745e(this.description, fertilitySettingsToggleModel.description) && this.enabled == fertilitySettingsToggleModel.enabled && AbstractC22676k.m65745e(this.ctaDestination, fertilitySettingsToggleModel.ctaDestination) && AbstractC22676k.m65745e(this.ctaTextDisplay, fertilitySettingsToggleModel.ctaTextDisplay) && AbstractC22676k.m65745e(this.ctaIcon, fertilitySettingsToggleModel.ctaIcon);
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

    public final String getDescription() {
        return this.description;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.ctaIcon.hashCode() + AbstractC11266d.m30450d(AbstractC36095b.m114673a(this.ctaDestination, AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.enabled), 31), 31, this.ctaTextDisplay);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        boolean z4 = this.enabled;
        C9598e c9598e = this.ctaDestination;
        String str3 = this.ctaTextDisplay;
        String str4 = this.ctaIcon;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FertilitySettingsToggleModel(title=", str, ", description=", str2, ", enabled=");
        sbM32001t.append(z4);
        sbM32001t.append(", ctaDestination=");
        sbM32001t.append(c9598e);
        sbM32001t.append(", ctaTextDisplay=");
        return AbstractC11266d.m30464r(sbM32001t, str3, ", ctaIcon=", str4, ")");
    }

    public FertilitySettingsToggleModel(String title, String description, boolean z4, C9598e ctaDestination, String ctaTextDisplay, String ctaIcon) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(ctaDestination, "ctaDestination");
        AbstractC22676k.m65750j(ctaTextDisplay, "ctaTextDisplay");
        AbstractC22676k.m65750j(ctaIcon, "ctaIcon");
        this.title = title;
        this.description = description;
        this.enabled = z4;
        this.ctaDestination = ctaDestination;
        this.ctaTextDisplay = ctaTextDisplay;
        this.ctaIcon = ctaIcon;
    }
}
