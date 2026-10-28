package com.whoop.hormonalinsights.onboarding.domain.models;

import al0.C0974i;
import androidx.core.app.FrameMetricsAggregator;
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
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u0000 A2\u00020\u0001:\u0002BABY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Bs\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010 J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010 J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b%\u0010 J\u0012\u0010&\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010 J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010'J\u0012\u0010*\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b*\u0010+Jt\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010 J\u0010\u0010/\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00103\u001a\u00020\u00062\b\u00102\u001a\u0004\u0018\u000101HÖ\u0003¢\u0006\u0004\b3\u00104R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010 R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010 R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b\u0007\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b:\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010'R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00105\u001a\u0004\b=\u0010 R\u0019\u0010\f\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\f\u0010;\u001a\u0004\b>\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010?\u001a\u0004\b@\u0010+¨\u0006C"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "imageUrl", "titleDisplay", "descriptionDisplay", "", "isFullImage", "buttonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "nextId", "skipTitle", "skipNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "component6", "()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "component7", "component8", "component9", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTitleDisplay", "getDescriptionDisplay", "Z", "getButtonTitle", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;", "getNextId", "getSkipTitle", "getSkipNextId", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class InformationScreen implements HormonalScreenContent {
    private static final InterfaceC23462h[] $childSerializers;
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String buttonTitle;
    private final String descriptionDisplay;
    private final String imageUrl;
    private final boolean isFullImage;
    private final HormonalScreenId nextId;
    private final FlowProgress progress;
    private final HormonalScreenId skipNextId;
    private final String skipTitle;
    private final String titleDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/InformationScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return InformationScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C0974i(7)), null, AbstractC30060g.m92087G(enumC23463i, new C0974i(8)), null};
    }

    public /* synthetic */ InformationScreen(int i13, String str, String str2, String str3, boolean z4, String str4, HormonalScreenId hormonalScreenId, String str5, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i13 & FrameMetricsAggregator.EVERY_DURATION)) {
            PluginExceptionsKt.throwMissingFieldException(i13, FrameMetricsAggregator.EVERY_DURATION, InformationScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.titleDisplay = str2;
        this.descriptionDisplay = str3;
        this.isFullImage = z4;
        this.buttonTitle = str4;
        this.nextId = hormonalScreenId;
        this.skipTitle = str5;
        this.skipNextId = hormonalScreenId2;
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

    public static /* synthetic */ InformationScreen copy$default(InformationScreen informationScreen, String str, String str2, String str3, boolean z4, String str4, HormonalScreenId hormonalScreenId, String str5, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = informationScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = informationScreen.titleDisplay;
        }
        if ((i13 & 4) != 0) {
            str3 = informationScreen.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            z4 = informationScreen.isFullImage;
        }
        if ((i13 & 16) != 0) {
            str4 = informationScreen.buttonTitle;
        }
        if ((i13 & 32) != 0) {
            hormonalScreenId = informationScreen.nextId;
        }
        if ((i13 & 64) != 0) {
            str5 = informationScreen.skipTitle;
        }
        if ((i13 & 128) != 0) {
            hormonalScreenId2 = informationScreen.skipNextId;
        }
        if ((i13 & 256) != 0) {
            flowProgress = informationScreen.progress;
        }
        HormonalScreenId hormonalScreenId3 = hormonalScreenId2;
        FlowProgress flowProgress2 = flowProgress;
        HormonalScreenId hormonalScreenId4 = hormonalScreenId;
        String str6 = str5;
        String str7 = str4;
        String str8 = str3;
        return informationScreen.copy(str, str2, str8, z4, str7, hormonalScreenId4, str6, hormonalScreenId3, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(InformationScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, stringSerializer, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.titleDisplay);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeBooleanElement(serialDesc, 3, self.isFullImage);
        output.encodeStringElement(serialDesc, 4, self.buttonTitle);
        output.encodeNullableSerializableElement(serialDesc, 5, (InterfaceC37145j) interfaceC23462hArr[5].getValue(), self.nextId);
        output.encodeNullableSerializableElement(serialDesc, 6, stringSerializer, self.skipTitle);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.skipNextId);
        output.encodeNullableSerializableElement(serialDesc, 8, FlowProgress$$serializer.INSTANCE, self.progress);
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
    public final boolean getIsFullImage() {
        return this.isFullImage;
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
    public final String getSkipTitle() {
        return this.skipTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final InformationScreen copy(String imageUrl, String titleDisplay, String descriptionDisplay, boolean isFullImage, String buttonTitle, HormonalScreenId nextId, String skipTitle, HormonalScreenId skipNextId, FlowProgress progress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        return new InformationScreen(imageUrl, titleDisplay, descriptionDisplay, isFullImage, buttonTitle, nextId, skipTitle, skipNextId, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InformationScreen)) {
            return false;
        }
        InformationScreen informationScreen = (InformationScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, informationScreen.imageUrl) && AbstractC22676k.m65745e(this.titleDisplay, informationScreen.titleDisplay) && AbstractC22676k.m65745e(this.descriptionDisplay, informationScreen.descriptionDisplay) && this.isFullImage == informationScreen.isFullImage && AbstractC22676k.m65745e(this.buttonTitle, informationScreen.buttonTitle) && this.nextId == informationScreen.nextId && AbstractC22676k.m65745e(this.skipTitle, informationScreen.skipTitle) && this.skipNextId == informationScreen.skipNextId && AbstractC22676k.m65745e(this.progress, informationScreen.progress);
    }

    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final HormonalScreenId getNextId() {
        return this.nextId;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final HormonalScreenId getSkipNextId() {
        return this.skipNextId;
    }

    public final String getSkipTitle() {
        return this.skipTitle;
    }

    public final String getTitleDisplay() {
        return this.titleDisplay;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.titleDisplay), 31, this.descriptionDisplay), 31, this.isFullImage), 31, this.buttonTitle);
        HormonalScreenId hormonalScreenId = this.nextId;
        int iHashCode = (iM30450d + (hormonalScreenId == null ? 0 : hormonalScreenId.hashCode())) * 31;
        String str2 = this.skipTitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        int iHashCode3 = (iHashCode2 + (hormonalScreenId2 == null ? 0 : hormonalScreenId2.hashCode())) * 31;
        FlowProgress flowProgress = this.progress;
        return iHashCode3 + (flowProgress != null ? flowProgress.hashCode() : 0);
    }

    public final boolean isFullImage() {
        return this.isFullImage;
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.titleDisplay;
        String str3 = this.descriptionDisplay;
        boolean z4 = this.isFullImage;
        String str4 = this.buttonTitle;
        HormonalScreenId hormonalScreenId = this.nextId;
        String str5 = this.skipTitle;
        HormonalScreenId hormonalScreenId2 = this.skipNextId;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("InformationScreen(imageUrl=", str, ", titleDisplay=", str2, ", descriptionDisplay=");
        AbstractC38963t7.m124390t(sbM32001t, str3, ", isFullImage=", z4, ", buttonTitle=");
        sbM32001t.append(str4);
        sbM32001t.append(", nextId=");
        sbM32001t.append(hormonalScreenId);
        sbM32001t.append(", skipTitle=");
        sbM32001t.append(str5);
        sbM32001t.append(", skipNextId=");
        sbM32001t.append(hormonalScreenId2);
        sbM32001t.append(", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public InformationScreen(String str, String titleDisplay, String descriptionDisplay, boolean z4, String buttonTitle, HormonalScreenId hormonalScreenId, String str2, HormonalScreenId hormonalScreenId2, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(titleDisplay, "titleDisplay");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(buttonTitle, "buttonTitle");
        this.imageUrl = str;
        this.titleDisplay = titleDisplay;
        this.descriptionDisplay = descriptionDisplay;
        this.isFullImage = z4;
        this.buttonTitle = buttonTitle;
        this.nextId = hormonalScreenId;
        this.skipTitle = str2;
        this.skipNextId = hormonalScreenId2;
        this.progress = flowProgress;
    }
}
