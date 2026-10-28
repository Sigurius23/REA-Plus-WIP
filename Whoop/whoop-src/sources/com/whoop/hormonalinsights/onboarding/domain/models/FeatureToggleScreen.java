package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.EnumsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
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
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0002;:BA\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\f\u0010\u0012J'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b$\u0010%JX\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u001dJ\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010.\u001a\u00020-2\b\u0010,\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u001dR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b6\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u00105\u001a\u0004\b7\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00108\u001a\u0004\b9\u0010%¨\u0006<"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "imageUrl", "titleDisplay", "descriptionDisplay", "featureToggleTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "enabledNextId", "disabledNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component6", "component7", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTitleDisplay", "getDescriptionDisplay", "getFeatureToggleTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getEnabledNextId", "getDisabledNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class FeatureToggleScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String descriptionDisplay;
    private final HormonalScreenId disabledNextId;
    private final HormonalScreenId enabledNextId;
    private final String featureToggleTitle;
    private final String imageUrl;
    private final FlowProgress progress;
    private final String titleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FeatureToggleScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return FeatureToggleScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C0974i(5)), AbstractC30060g.m92087G(enumC23463i, new C0974i(6)), null};
    }

    public /* synthetic */ FeatureToggleScreen(int i13, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, FeatureToggleScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.titleDisplay = str2;
        this.descriptionDisplay = str3;
        this.featureToggleTitle = str4;
        this.enabledNextId = hormonalScreenId;
        this.disabledNextId = hormonalScreenId2;
        this.progress = flowProgress;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return EnumsKt.createSimpleEnumSerializer("com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenId", HormonalScreenId.values());
    }

    public static /* synthetic */ FeatureToggleScreen copy$default(FeatureToggleScreen featureToggleScreen, String str, String str2, String str3, String str4, HormonalScreenId hormonalScreenId, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = featureToggleScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = featureToggleScreen.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = featureToggleScreen.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = featureToggleScreen.featureToggleTitle;
        }
        if ((i13 & 16) != 0) {
            hormonalScreenId = featureToggleScreen.enabledNextId;
        }
        if ((i13 & 32) != 0) {
            hormonalScreenId2 = featureToggleScreen.disabledNextId;
        }
        if ((i13 & 64) != 0) {
            flowProgress = featureToggleScreen.progress;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId2;
        FlowProgress flowProgress2 = flowProgress;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId;
        String str5 = str3;
        return featureToggleScreen.copy(str, str2, str5, str4, hormonalScreenId4, hormonalScreenId3, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(FeatureToggleScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 3, self.featureToggleTitle);
        output.encodeSerializableElement(serialDesc, 4, (InterfaceC37145j) interfaceC23462hArr[4].getValue(), self.enabledNextId);
        output.encodeSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.disabledNextId);
        output.encodeSerializableElement(serialDesc, 6, FlowProgress$$serializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getFeatureToggleTitle() {
        return this.featureToggleTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final HormonalScreenId getEnabledNextId() {
        return this.enabledNextId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final HormonalScreenId getDisabledNextId() {
        return this.disabledNextId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final FeatureToggleScreen copy(String imageUrl, String titleDisplay, String descriptionDisplay, String featureToggleTitle, HormonalScreenId enabledNextId, HormonalScreenId disabledNextId, FlowProgress progress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(featureToggleTitle, "featureToggleTitle");
        AbstractC22676k.m65750j(enabledNextId, "enabledNextId");
        AbstractC22676k.m65750j(disabledNextId, "disabledNextId");
        AbstractC22676k.m65750j(progress, "progress");
        return new FeatureToggleScreen(imageUrl, titleDisplay, descriptionDisplay, featureToggleTitle, enabledNextId, disabledNextId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureToggleScreen)) {
            return false;
        }
        FeatureToggleScreen featureToggleScreen = (FeatureToggleScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, featureToggleScreen.imageUrl) && AbstractC22676k.m65745e(this.titleDisplay, featureToggleScreen.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, featureToggleScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.featureToggleTitle, featureToggleScreen.featureToggleTitle) && this.enabledNextId == featureToggleScreen.enabledNextId && this.disabledNextId == featureToggleScreen.disabledNextId && AbstractC22676k.m65745e(this.progress, featureToggleScreen.progress);
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final HormonalScreenId getDisabledNextId() {
        return this.disabledNextId;
    }

    public final HormonalScreenId getEnabledNextId() {
        return this.enabledNextId;
    }

    public final String getFeatureToggleTitle() {
        return this.featureToggleTitle;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.imageUrl;
        return this.progress.hashCode() + ((this.disabledNextId.hashCode() + ((this.enabledNextId.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay), 31, this.descriptionDisplay), 31, this.featureToggleTitle)) * 31)) * 31);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        String str4 = this.featureToggleTitle;
        HormonalScreenId hormonalScreenId = this.enabledNextId;
        HormonalScreenId hormonalScreenId2 = this.disabledNextId;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FeatureToggleScreen(imageUrl=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", featureToggleTitle=", str4, ", enabledNextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", disabledNextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public FeatureToggleScreen(String str, String titleDisplay, String descriptionDisplay, String featureToggleTitle, HormonalScreenId enabledNextId, HormonalScreenId disabledNextId, FlowProgress progress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(featureToggleTitle, "featureToggleTitle");
        AbstractC22676k.m65750j(enabledNextId, "enabledNextId");
        AbstractC22676k.m65750j(disabledNextId, "disabledNextId");
        AbstractC22676k.m65750j(progress, "progress");
        this.imageUrl = str;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.featureToggleTitle = featureToggleTitle;
        this.enabledNextId = enabledNextId;
        this.disabledNextId = disabledNextId;
        this.progress = progress;
    }
}
