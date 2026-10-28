package com.whoop.hormonalinsights.menstrualcycleinsights.domain.models;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 72\u00020\u0001:\u000287B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBW\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001aJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJL\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010)\u0012\u0004\b+\u0010,\u001a\u0004\b*\u0010\u001aR \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u0010)\u0012\u0004\b.\u0010,\u001a\u0004\b-\u0010\u001aR \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010)\u0012\u0004\b0\u0010,\u001a\u0004\b/\u0010\u001aR \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010)\u0012\u0004\b2\u0010,\u001a\u0004\b1\u0010\u001aR \u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010)\u0012\u0004\b4\u0010,\u001a\u0004\b3\u0010\u001aR \u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010)\u0012\u0004\b6\u0010,\u001a\u0004\b5\u0010\u001a¨\u00069"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "", "", "title", "description", "button", "currentDate", "maxDate", "minDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$hormonal_insights_release", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getTitle$annotations", "()V", "getDescription", "getDescription$annotations", "getButton", "getButton$annotations", "getCurrentDate", "getCurrentDate$annotations", "getMaxDate", "getMaxDate$annotations", "getMinDate", "getMinDate$annotations", "Companion", "$serializer", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class MciPregnancyDueDateScreenDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("button_display")
    private final String button;

    @SerializedName("current_date")
    private final String currentDate;

    @SerializedName("description_display")
    private final String description;

    @SerializedName("max_date")
    private final String maxDate;

    @SerializedName("min_date")
    private final String minDate;

    @SerializedName("title_display")
    private final String title;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciPregnancyDueDateScreenDto;", "serializer", "()Lwc3/c;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return MciPregnancyDueDateScreenDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MciPregnancyDueDateScreenDto(int i13, String str, String str2, String str3, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (63 != (i13 & 63)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 63, MciPregnancyDueDateScreenDto$$serializer.INSTANCE.getDescriptor());
        }
        this.title = str;
        this.description = str2;
        this.button = str3;
        this.currentDate = str4;
        this.maxDate = str5;
        this.minDate = str6;
    }

    public static /* synthetic */ MciPregnancyDueDateScreenDto copy$default(MciPregnancyDueDateScreenDto mciPregnancyDueDateScreenDto, String str, String str2, String str3, String str4, String str5, String str6, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = mciPregnancyDueDateScreenDto.title;
        }
        if ((i13 & 2) != 0) {
            str2 = mciPregnancyDueDateScreenDto.description;
        }
        if ((i13 & 4) != 0) {
            str3 = mciPregnancyDueDateScreenDto.button;
        }
        if ((i13 & 8) != 0) {
            str4 = mciPregnancyDueDateScreenDto.currentDate;
        }
        if ((i13 & 16) != 0) {
            str5 = mciPregnancyDueDateScreenDto.maxDate;
        }
        if ((i13 & 32) != 0) {
            str6 = mciPregnancyDueDateScreenDto.minDate;
        }
        String str7 = str5;
        String str8 = str6;
        return mciPregnancyDueDateScreenDto.copy(str, str2, str3, str4, str7, str8);
    }

    @InterfaceC37143h("button_display")
    public static /* synthetic */ void getButton$annotations() {
    }

    @InterfaceC37143h("current_date")
    public static /* synthetic */ void getCurrentDate$annotations() {
    }

    @InterfaceC37143h("description_display")
    public static /* synthetic */ void getDescription$annotations() {
    }

    @InterfaceC37143h("max_date")
    public static /* synthetic */ void getMaxDate$annotations() {
    }

    @InterfaceC37143h("min_date")
    public static /* synthetic */ void getMinDate$annotations() {
    }

    @InterfaceC37143h("title_display")
    public static /* synthetic */ void getTitle$annotations() {
    }

    public static final /* synthetic */ void write$Self$hormonal_insights_release(MciPregnancyDueDateScreenDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.title);
        output.encodeStringElement(serialDesc, 1, self.description);
        output.encodeStringElement(serialDesc, 2, self.button);
        output.encodeStringElement(serialDesc, 3, self.currentDate);
        output.encodeStringElement(serialDesc, 4, self.maxDate);
        output.encodeStringElement(serialDesc, 5, self.minDate);
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
    public final String getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCurrentDate() {
        return this.currentDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getMaxDate() {
        return this.maxDate;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getMinDate() {
        return this.minDate;
    }

    public final MciPregnancyDueDateScreenDto copy(String title, String description, String button, String currentDate, String maxDate, String minDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        return new MciPregnancyDueDateScreenDto(title, description, button, currentDate, maxDate, minDate);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MciPregnancyDueDateScreenDto)) {
            return false;
        }
        MciPregnancyDueDateScreenDto mciPregnancyDueDateScreenDto = (MciPregnancyDueDateScreenDto) other;
        return AbstractC22676k.m65745e(this.title, mciPregnancyDueDateScreenDto.title) && AbstractC22676k.m65745e(this.description, mciPregnancyDueDateScreenDto.description) && AbstractC22676k.m65745e(this.button, mciPregnancyDueDateScreenDto.button) && AbstractC22676k.m65745e(this.currentDate, mciPregnancyDueDateScreenDto.currentDate) && AbstractC22676k.m65745e(this.maxDate, mciPregnancyDueDateScreenDto.maxDate) && AbstractC22676k.m65745e(this.minDate, mciPregnancyDueDateScreenDto.minDate);
    }

    public final String getButton() {
        return this.button;
    }

    public final String getCurrentDate() {
        return this.currentDate;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getMaxDate() {
        return this.maxDate;
    }

    public final String getMinDate() {
        return this.minDate;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.minDate.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.title.hashCode() * 31, 31, this.description), 31, this.button), 31, this.currentDate), 31, this.maxDate);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.button;
        String str4 = this.currentDate;
        String str5 = this.maxDate;
        String str6 = this.minDate;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MciPregnancyDueDateScreenDto(title=", str, ", description=", str2, ", button=");
        AbstractC11266d.m30444B(sbM32001t, str3, ", currentDate=", str4, ", maxDate=");
        return AbstractC11266d.m30464r(sbM32001t, str5, ", minDate=", str6, ")");
    }

    public MciPregnancyDueDateScreenDto(String title, String description, String button, String currentDate, String maxDate, String minDate) {
        AbstractC22676k.m65750j(title, "title");
        AbstractC22676k.m65750j(description, "description");
        AbstractC22676k.m65750j(button, "button");
        AbstractC22676k.m65750j(currentDate, "currentDate");
        AbstractC22676k.m65750j(maxDate, "maxDate");
        AbstractC22676k.m65750j(minDate, "minDate");
        this.title = title;
        this.description = description;
        this.button = button;
        this.currentDate = currentDate;
        this.maxDate = maxDate;
        this.minDate = minDate;
    }
}
