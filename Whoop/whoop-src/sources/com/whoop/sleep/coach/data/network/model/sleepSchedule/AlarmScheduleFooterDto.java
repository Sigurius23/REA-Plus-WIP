package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import ih0.AbstractC18489d0;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 /2\u00020\u0001:\u00020/B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nBG\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001dJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010&\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010+\u001a\u0004\b-\u0010\u001dR\u001a\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u001d¨\u00061"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "", "", "descriptionTextDisplay", "calloutTextHeaderDisplay", "", "scheduleComplete", "shouldShowCalloutText", "shouldShowDescriptionText", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZZ)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ZZZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZZ)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDescriptionTextDisplay", "getCalloutTextHeaderDisplay", "Z", "getScheduleComplete", "getShouldShowCalloutText", "getShouldShowDescriptionText", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class AlarmScheduleFooterDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("callout_text_header_display")
    private final String calloutTextHeaderDisplay;

    @SerializedName("description_text_display")
    private final String descriptionTextDisplay;

    @SerializedName("schedule_complete")
    private final boolean scheduleComplete;

    @SerializedName("should_show_callout_text")
    private final boolean shouldShowCalloutText;

    @SerializedName("should_show_description_text")
    private final boolean shouldShowDescriptionText;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return AlarmScheduleFooterDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AlarmScheduleFooterDto(int i13, String str, String str2, boolean z4, boolean z13, boolean z14, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, AlarmScheduleFooterDto$$serializer.INSTANCE.getDescriptor());
        }
        this.descriptionTextDisplay = str;
        this.calloutTextHeaderDisplay = str2;
        this.scheduleComplete = z4;
        this.shouldShowCalloutText = z13;
        this.shouldShowDescriptionText = z14;
    }

    public static /* synthetic */ AlarmScheduleFooterDto copy$default(AlarmScheduleFooterDto alarmScheduleFooterDto, String str, String str2, boolean z4, boolean z13, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = alarmScheduleFooterDto.descriptionTextDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = alarmScheduleFooterDto.calloutTextHeaderDisplay;
        }
        if ((i13 & 4) != 0) {
            z4 = alarmScheduleFooterDto.scheduleComplete;
        }
        if ((i13 & 8) != 0) {
            z13 = alarmScheduleFooterDto.shouldShowCalloutText;
        }
        if ((i13 & 16) != 0) {
            z14 = alarmScheduleFooterDto.shouldShowDescriptionText;
        }
        boolean z15 = z14;
        boolean z16 = z4;
        return alarmScheduleFooterDto.copy(str, str2, z16, z13, z15);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(AlarmScheduleFooterDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.descriptionTextDisplay);
        output.encodeStringElement(serialDesc, 1, self.calloutTextHeaderDisplay);
        output.encodeBooleanElement(serialDesc, 2, self.scheduleComplete);
        output.encodeBooleanElement(serialDesc, 3, self.shouldShowCalloutText);
        output.encodeBooleanElement(serialDesc, 4, self.shouldShowDescriptionText);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescriptionTextDisplay() {
        return this.descriptionTextDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCalloutTextHeaderDisplay() {
        return this.calloutTextHeaderDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getScheduleComplete() {
        return this.scheduleComplete;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShouldShowCalloutText() {
        return this.shouldShowCalloutText;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getShouldShowDescriptionText() {
        return this.shouldShowDescriptionText;
    }

    public final AlarmScheduleFooterDto copy(String descriptionTextDisplay, String calloutTextHeaderDisplay, boolean scheduleComplete, boolean shouldShowCalloutText, boolean shouldShowDescriptionText) {
        AbstractC22676k.m65750j(descriptionTextDisplay, "descriptionTextDisplay");
        AbstractC22676k.m65750j(calloutTextHeaderDisplay, "calloutTextHeaderDisplay");
        return new AlarmScheduleFooterDto(descriptionTextDisplay, calloutTextHeaderDisplay, scheduleComplete, shouldShowCalloutText, shouldShowDescriptionText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AlarmScheduleFooterDto)) {
            return false;
        }
        AlarmScheduleFooterDto alarmScheduleFooterDto = (AlarmScheduleFooterDto) other;
        return AbstractC22676k.m65745e(this.descriptionTextDisplay, alarmScheduleFooterDto.descriptionTextDisplay) && AbstractC22676k.m65745e(this.calloutTextHeaderDisplay, alarmScheduleFooterDto.calloutTextHeaderDisplay) && this.scheduleComplete == alarmScheduleFooterDto.scheduleComplete && this.shouldShowCalloutText == alarmScheduleFooterDto.shouldShowCalloutText && this.shouldShowDescriptionText == alarmScheduleFooterDto.shouldShowDescriptionText;
    }

    public final String getCalloutTextHeaderDisplay() {
        return this.calloutTextHeaderDisplay;
    }

    public final String getDescriptionTextDisplay() {
        return this.descriptionTextDisplay;
    }

    public final boolean getScheduleComplete() {
        return this.scheduleComplete;
    }

    public final boolean getShouldShowCalloutText() {
        return this.shouldShowCalloutText;
    }

    public final boolean getShouldShowDescriptionText() {
        return this.shouldShowDescriptionText;
    }

    public int hashCode() {
        return Boolean.hashCode(this.shouldShowDescriptionText) + AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.descriptionTextDisplay.hashCode() * 31, 31, this.calloutTextHeaderDisplay), 31, this.scheduleComplete), 31, this.shouldShowCalloutText);
    }

    public String toString() {
        String str = this.descriptionTextDisplay;
        String str2 = this.calloutTextHeaderDisplay;
        boolean z4 = this.scheduleComplete;
        boolean z13 = this.shouldShowCalloutText;
        boolean z14 = this.shouldShowDescriptionText;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("AlarmScheduleFooterDto(descriptionTextDisplay=", str, ", calloutTextHeaderDisplay=", str2, ", scheduleComplete=");
        AbstractC38963t7.m124392v(sbM32001t, z4, ", shouldShowCalloutText=", z13, ", shouldShowDescriptionText=");
        return AbstractC18489d0.m53372m(sbM32001t, z14, ")");
    }

    public AlarmScheduleFooterDto(String descriptionTextDisplay, String calloutTextHeaderDisplay, boolean z4, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(descriptionTextDisplay, "descriptionTextDisplay");
        AbstractC22676k.m65750j(calloutTextHeaderDisplay, "calloutTextHeaderDisplay");
        this.descriptionTextDisplay = descriptionTextDisplay;
        this.calloutTextHeaderDisplay = calloutTextHeaderDisplay;
        this.scheduleComplete = z4;
        this.shouldShowCalloutText = z13;
        this.shouldShowDescriptionText = z14;
    }
}
