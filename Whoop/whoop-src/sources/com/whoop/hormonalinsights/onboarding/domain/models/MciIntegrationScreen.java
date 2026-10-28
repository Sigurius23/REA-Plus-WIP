package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell;
import com.whoop.hormonalinsights.settings.domain.models.HormonalInsightsUpsell$$serializer;
import com.whoop.navigation.C9598e;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>=BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eBa\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b&\u0010'JX\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u001eJ\u0010\u0010+\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010-HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00102\u001a\u0004\b8\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\b:\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b<\u0010'¨\u0006?"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "titleDisplay", "descriptionDisplay", "upsellTitle", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "upsellContent", "buttonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "component5", "component6", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component7", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitleDisplay", "getDescriptionDisplay", "getUpsellTitle", "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsUpsell;", "getUpsellContent", "getButtonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciIntegrationScreen implements HormonalScreenContent {
    private final String buttonTitle;
    private final String descriptionDisplay;
    private final HormonalScreenId nextId;
    private final FlowProgress progress;
    private final String titleDisplay;
    private final HormonalInsightsUpsell upsellContent;
    private final String upsellTitle;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = C9598e.f28134d;
    private static final InterfaceC23462h[] $childSerializers = {null, null, null, null, null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C0974i(12)), null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciIntegrationScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciIntegrationScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciIntegrationScreen(int i13, String str, String str2, String str3, HormonalInsightsUpsell hormonalInsightsUpsell, String str4, HormonalScreenId hormonalScreenId, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MciIntegrationScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.titleDisplay = str;
        this.descriptionDisplay = str2;
        this.upsellTitle = str3;
        this.upsellContent = hormonalInsightsUpsell;
        this.buttonTitle = str4;
        this.nextId = hormonalScreenId;
        this.progress = flowProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ MciIntegrationScreen copy$default(MciIntegrationScreen mciIntegrationScreen, String str, String str2, String str3, HormonalInsightsUpsell hormonalInsightsUpsell, String str4, HormonalScreenId hormonalScreenId, FlowProgress flowProgress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mciIntegrationScreen.titleDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = mciIntegrationScreen.descriptionDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = mciIntegrationScreen.upsellTitle;
        }
        if ((i13 & 8) != 0) {
            hormonalInsightsUpsell = mciIntegrationScreen.upsellContent;
        }
        if ((i13 & 16) != 0) {
            str4 = mciIntegrationScreen.buttonTitle;
        }
        if ((i13 & 32) != 0) {
            hormonalScreenId = mciIntegrationScreen.nextId;
        }
        if ((i13 & 64) != 0) {
            flowProgress = mciIntegrationScreen.progress;
        }
        HormonalScreenId hormonalScreenId2 = hormonalScreenId;
        FlowProgress flowProgress2 = flowProgress;
        String str5 = str4;
        String str6 = str3;
        return mciIntegrationScreen.copy(str, str2, str6, hormonalInsightsUpsell, str5, hormonalScreenId2, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciIntegrationScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.titleDisplay);
        output.encodeStringElement(serialDesc, 1, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 2, self.upsellTitle);
        output.encodeSerializableElement(serialDesc, 3, HormonalInsightsUpsell$$serializer.INSTANCE, self.upsellContent);
        output.encodeStringElement(serialDesc, 4, self.buttonTitle);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.nextId);
        output.encodeNullableSerializableElement(serialDesc, 6, FlowProgress$$serializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpsellTitle() {
        return this.upsellTitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final HormonalInsightsUpsell getUpsellContent() {
        return this.upsellContent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final MciIntegrationScreen copy(String titleDisplay, String descriptionDisplay, String upsellTitle, HormonalInsightsUpsell upsellContent, String buttonTitle, HormonalScreenId nextId, FlowProgress progress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(upsellTitle, "upsellTitle");
        AbstractC22676k.m65750j(upsellContent, "upsellContent");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        return new MciIntegrationScreen(titleDisplay, descriptionDisplay, upsellTitle, upsellContent, buttonTitle, nextId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciIntegrationScreen)) {
            return false;
        }
        MciIntegrationScreen mciIntegrationScreen = (MciIntegrationScreen) other;
        return AbstractC22676k.m65745e(this.titleDisplay, mciIntegrationScreen.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, mciIntegrationScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.upsellTitle, mciIntegrationScreen.upsellTitle) && AbstractC22676k.m65745e(this.upsellContent, mciIntegrationScreen.upsellContent) && AbstractC22676k.m65745e(this.buttonTitle, mciIntegrationScreen.buttonTitle) && this.nextId == mciIntegrationScreen.nextId && AbstractC22676k.m65745e(this.progress, mciIntegrationScreen.progress);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public final HormonalInsightsUpsell getUpsellContent() {
        return this.upsellContent;
    }

    public final String getUpsellTitle() {
        return this.upsellTitle;
    }

    public int hashCode() {
        int iHashCode = (this.nextId.hashCode() + AbstractC11266d.m30450d((this.upsellContent.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.titleDisplay.hashCode() * 31, 31, this.descriptionDisplay), 31, this.upsellTitle)) * 31, 31, this.buttonTitle)) * 31;
        FlowProgress flowProgress = this.progress;
        return iHashCode + (flowProgress == null ? 0 : flowProgress.hashCode());
    }

    public String toString() {
        String str = this.titleDisplay;
        String str2 = this.descriptionDisplay;
        String str3 = this.upsellTitle;
        HormonalInsightsUpsell hormonalInsightsUpsell = this.upsellContent;
        String str4 = this.buttonTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MciIntegrationScreen(titleDisplay=", str, ", descriptionDisplay=", str2, ", upsellTitle=");
        sbM32001t.append(str3);
        sbM32001t.append(", upsellContent=");
        sbM32001t.append(hormonalInsightsUpsell);
        sbM32001t.append(", buttonTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MciIntegrationScreen(String titleDisplay, String descriptionDisplay, String upsellTitle, HormonalInsightsUpsell upsellContent, String buttonTitle, HormonalScreenId nextId, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(upsellTitle, "upsellTitle");
        AbstractC22676k.m65750j(upsellContent, "upsellContent");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        AbstractC22676k.m65750j(nextId, "nextId");
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.upsellTitle = upsellTitle;
        this.upsellContent = upsellContent;
        this.buttonTitle = buttonTitle;
        this.nextId = nextId;
        this.progress = flowProgress;
    }
}
