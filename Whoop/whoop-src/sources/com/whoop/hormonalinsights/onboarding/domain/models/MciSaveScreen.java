package com.whoop.hormonalinsights.onboarding.domain.models;

import androidx.core.app.NotificationCompat;
import com.whoop.hormonalinsights.postpartum.domain.models.HormonalScreenContent;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287BC\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#JZ\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010,\u001a\u00020+2\b\u0010*\u001a\u0004\u0018\u00010)HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b1\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b2\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b4\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u00105\u001a\u0004\b6\u0010#¨\u00069"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen;", "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;", "", "imageUrl", "title", "descriptionDisplay", "saveButtonTitle", "icon", "subtitle", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", NotificationCompat.CATEGORY_PROGRESS, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImageUrl", "getTitle", "getDescriptionDisplay", "getSaveButtonTitle", "getIcon", "getSubtitle", "Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;", "getProgress", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciSaveScreen implements HormonalScreenContent {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String descriptionDisplay;
    private final String icon;
    private final String imageUrl;
    private final FlowProgress progress;
    private final String saveButtonTitle;
    private final String subtitle;
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/onboarding/domain/models/MciSaveScreen;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciSaveScreen$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciSaveScreen(int i13, String str, String str2, String str3, String str4, String str5, String str6, FlowProgress flowProgress, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, MciSaveScreen$$serializer.INSTANCE.getDescriptor());
        }
        this.imageUrl = str;
        this.title = str2;
        this.descriptionDisplay = str3;
        this.saveButtonTitle = str4;
        this.icon = str5;
        this.subtitle = str6;
        this.progress = flowProgress;
    }

    public static /* synthetic */ MciSaveScreen copy$default(MciSaveScreen mciSaveScreen, String str, String str2, String str3, String str4, String str5, String str6, FlowProgress flowProgress, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mciSaveScreen.imageUrl;
        }
        if ((i13 & 2) != 0) {
            str2 = mciSaveScreen.title;
        }
        if ((i13 & 4) != 0) {
            str3 = mciSaveScreen.descriptionDisplay;
        }
        if ((i13 & 8) != 0) {
            str4 = mciSaveScreen.saveButtonTitle;
        }
        if ((i13 & 16) != 0) {
            str5 = mciSaveScreen.icon;
        }
        if ((i13 & 32) != 0) {
            str6 = mciSaveScreen.subtitle;
        }
        if ((i13 & 64) != 0) {
            flowProgress = mciSaveScreen.progress;
        }
        String str7 = str6;
        FlowProgress flowProgress2 = flowProgress;
        String str8 = str5;
        String str9 = str3;
        return mciSaveScreen.copy(str, str2, str9, str4, str8, str7, flowProgress2);
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciSaveScreen self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.imageUrl);
        output.encodeStringElement(serialDesc, 1, self.title);
        output.encodeStringElement(serialDesc, 2, self.descriptionDisplay);
        output.encodeStringElement(serialDesc, 3, self.saveButtonTitle);
        output.encodeStringElement(serialDesc, 4, self.icon);
        output.encodeStringElement(serialDesc, 5, self.subtitle);
        output.encodeNullableSerializableElement(serialDesc, 6, FlowProgress$$serializer.INSTANCE, self.progress);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final MciSaveScreen copy(String imageUrl, String title, String descriptionDisplay, String saveButtonTitle, String icon, String subtitle, FlowProgress progress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        return new MciSaveScreen(imageUrl, title, descriptionDisplay, saveButtonTitle, icon, subtitle, progress);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciSaveScreen)) {
            return false;
        }
        MciSaveScreen mciSaveScreen = (MciSaveScreen) other;
        return AbstractC22676k.m65745e(this.imageUrl, mciSaveScreen.imageUrl) && AbstractC22676k.m65745e(this.title, mciSaveScreen.title) && AbstractC22676k.m65745e(this.descriptionDisplay, mciSaveScreen.descriptionDisplay) && AbstractC22676k.m65745e(this.saveButtonTitle, mciSaveScreen.saveButtonTitle) && AbstractC22676k.m65745e(this.icon, mciSaveScreen.icon) && AbstractC22676k.m65745e(this.subtitle, mciSaveScreen.subtitle) && AbstractC22676k.m65745e(this.progress, mciSaveScreen.progress);
    }

    public final String getDescriptionDisplay() {
        return this.descriptionDisplay;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final FlowProgress getProgress() {
        return this.progress;
    }

    public final String getSaveButtonTitle() {
        return this.saveButtonTitle;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.imageUrl;
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d((str == null ? 0 : str.hashCode()) * 31, 31, this.title), 31, this.descriptionDisplay), 31, this.saveButtonTitle), 31, this.icon), 31, this.subtitle);
        FlowProgress flowProgress = this.progress;
        return iM30450d + (flowProgress != null ? flowProgress.hashCode() : 0);
    }

    public String toString() {
        String str = this.imageUrl;
        String str2 = this.title;
        String str3 = this.descriptionDisplay;
        String str4 = this.saveButtonTitle;
        String str5 = this.icon;
        String str6 = this.subtitle;
        FlowProgress flowProgress = this.progress;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MciSaveScreen(imageUrl=", str, ", title=", str2, ", descriptionDisplay=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", saveButtonTitle=", str4, ", icon=");
        AbstractC11266d.m30444B(sbM32001t, str5, ", subtitle=", str6, ", progress=");
        sbM32001t.append(flowProgress);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    public MciSaveScreen(String str, String title, String descriptionDisplay, String saveButtonTitle, String icon, String subtitle, FlowProgress flowProgress) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(descriptionDisplay, "descriptionDisplay");
        AbstractC22676k.m65750j(saveButtonTitle, "saveButtonTitle");
        AbstractC22676k.m65750j(icon, "icon");
        AbstractC22676k.m65750j(subtitle, "subtitle");
        this.imageUrl = str;
        this.title = title;
        this.descriptionDisplay = descriptionDisplay;
        this.saveButtonTitle = saveButtonTitle;
        this.icon = icon;
        this.subtitle = subtitle;
        this.progress = flowProgress;
    }
}
