package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000210B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nBM\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b-\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b.\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00062"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "", "", "wakeTimeLabelDisplay", "wakeTimeSaveButtonLabelDisplay", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;", "alarmToWakeTimeDescriptionMap", "helpIconLink", "latestWakeTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getWakeTimeLabelDisplay", "getWakeTimeSaveButtonLabelDisplay", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmToWakeTimeDescriptionDto;", "getAlarmToWakeTimeDescriptionMap", "getHelpIconLink", "getLatestWakeTime", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class WakeTimeDto {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("alarm_to_wake_time_description_map")
    private final AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionMap;

    @SerializedName("help_icon_link")
    private final String helpIconLink;

    @SerializedName("latest_wake_time")
    private final String latestWakeTime;

    @SerializedName("wake_time_label_display")
    private final String wakeTimeLabelDisplay;

    @SerializedName("wake_time_save_button_label_display")
    private final String wakeTimeSaveButtonLabelDisplay;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return WakeTimeDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ WakeTimeDto(int i13, String str, String str2, AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionDto, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i13 & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 31, WakeTimeDto$$serializer.INSTANCE.getDescriptor());
        }
        this.wakeTimeLabelDisplay = str;
        this.wakeTimeSaveButtonLabelDisplay = str2;
        this.alarmToWakeTimeDescriptionMap = alarmToWakeTimeDescriptionDto;
        this.helpIconLink = str3;
        this.latestWakeTime = str4;
    }

    public static /* synthetic */ WakeTimeDto copy$default(WakeTimeDto wakeTimeDto, String str, String str2, AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionDto, String str3, String str4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = wakeTimeDto.wakeTimeLabelDisplay;
        }
        if ((i13 & 2) != 0) {
            str2 = wakeTimeDto.wakeTimeSaveButtonLabelDisplay;
        }
        if ((i13 & 4) != 0) {
            alarmToWakeTimeDescriptionDto = wakeTimeDto.alarmToWakeTimeDescriptionMap;
        }
        if ((i13 & 8) != 0) {
            str3 = wakeTimeDto.helpIconLink;
        }
        if ((i13 & 16) != 0) {
            str4 = wakeTimeDto.latestWakeTime;
        }
        String str5 = str4;
        AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionDto2 = alarmToWakeTimeDescriptionDto;
        return wakeTimeDto.copy(str, str2, alarmToWakeTimeDescriptionDto2, str3, str5);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(WakeTimeDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.wakeTimeLabelDisplay);
        output.encodeStringElement(serialDesc, 1, self.wakeTimeSaveButtonLabelDisplay);
        output.encodeSerializableElement(serialDesc, 2, AlarmToWakeTimeDescriptionDto$$serializer.INSTANCE, self.alarmToWakeTimeDescriptionMap);
        output.encodeStringElement(serialDesc, 3, self.helpIconLink);
        output.encodeStringElement(serialDesc, 4, self.latestWakeTime);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWakeTimeLabelDisplay() {
        return this.wakeTimeLabelDisplay;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWakeTimeSaveButtonLabelDisplay() {
        return this.wakeTimeSaveButtonLabelDisplay;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AlarmToWakeTimeDescriptionDto getAlarmToWakeTimeDescriptionMap() {
        return this.alarmToWakeTimeDescriptionMap;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public final WakeTimeDto copy(String wakeTimeLabelDisplay, String wakeTimeSaveButtonLabelDisplay, AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionMap, String helpIconLink, String latestWakeTime) {
        AbstractC22676k.m65750j(wakeTimeLabelDisplay, "wakeTimeLabelDisplay");
        AbstractC22676k.m65750j(wakeTimeSaveButtonLabelDisplay, "wakeTimeSaveButtonLabelDisplay");
        AbstractC22676k.m65750j(alarmToWakeTimeDescriptionMap, "alarmToWakeTimeDescriptionMap");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        return new WakeTimeDto(wakeTimeLabelDisplay, wakeTimeSaveButtonLabelDisplay, alarmToWakeTimeDescriptionMap, helpIconLink, latestWakeTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WakeTimeDto)) {
            return false;
        }
        WakeTimeDto wakeTimeDto = (WakeTimeDto) other;
        return AbstractC22676k.m65745e(this.wakeTimeLabelDisplay, wakeTimeDto.wakeTimeLabelDisplay) && AbstractC22676k.m65745e(this.wakeTimeSaveButtonLabelDisplay, wakeTimeDto.wakeTimeSaveButtonLabelDisplay) && AbstractC22676k.m65745e(this.alarmToWakeTimeDescriptionMap, wakeTimeDto.alarmToWakeTimeDescriptionMap) && AbstractC22676k.m65745e(this.helpIconLink, wakeTimeDto.helpIconLink) && AbstractC22676k.m65745e(this.latestWakeTime, wakeTimeDto.latestWakeTime);
    }

    public final AlarmToWakeTimeDescriptionDto getAlarmToWakeTimeDescriptionMap() {
        return this.alarmToWakeTimeDescriptionMap;
    }

    public final String getHelpIconLink() {
        return this.helpIconLink;
    }

    public final String getLatestWakeTime() {
        return this.latestWakeTime;
    }

    public final String getWakeTimeLabelDisplay() {
        return this.wakeTimeLabelDisplay;
    }

    public final String getWakeTimeSaveButtonLabelDisplay() {
        return this.wakeTimeSaveButtonLabelDisplay;
    }

    public int hashCode() {
        return this.latestWakeTime.hashCode() + AbstractC11266d.m30450d((this.alarmToWakeTimeDescriptionMap.hashCode() + AbstractC11266d.m30450d(this.wakeTimeLabelDisplay.hashCode() * 31, 31, this.wakeTimeSaveButtonLabelDisplay)) * 31, 31, this.helpIconLink);
    }

    public String toString() {
        String str = this.wakeTimeLabelDisplay;
        String str2 = this.wakeTimeSaveButtonLabelDisplay;
        AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionDto = this.alarmToWakeTimeDescriptionMap;
        String str3 = this.helpIconLink;
        String str4 = this.latestWakeTime;
        StringBuilder sbM32001t = AbstractC11895b.m32001t("WakeTimeDto(wakeTimeLabelDisplay=", str, ", wakeTimeSaveButtonLabelDisplay=", str2, ", alarmToWakeTimeDescriptionMap=");
        sbM32001t.append(alarmToWakeTimeDescriptionDto);
        sbM32001t.append(", helpIconLink=");
        sbM32001t.append(str3);
        sbM32001t.append(", latestWakeTime=");
        return AbstractC25012a.m73376i(str4, ")", sbM32001t);
    }

    public WakeTimeDto(String wakeTimeLabelDisplay, String wakeTimeSaveButtonLabelDisplay, AlarmToWakeTimeDescriptionDto alarmToWakeTimeDescriptionMap, String helpIconLink, String latestWakeTime) {
        AbstractC22676k.m65750j(wakeTimeLabelDisplay, "wakeTimeLabelDisplay");
        AbstractC22676k.m65750j(wakeTimeSaveButtonLabelDisplay, "wakeTimeSaveButtonLabelDisplay");
        AbstractC22676k.m65750j(alarmToWakeTimeDescriptionMap, "alarmToWakeTimeDescriptionMap");
        AbstractC22676k.m65750j(helpIconLink, "helpIconLink");
        AbstractC22676k.m65750j(latestWakeTime, "latestWakeTime");
        this.wakeTimeLabelDisplay = wakeTimeLabelDisplay;
        this.wakeTimeSaveButtonLabelDisplay = wakeTimeSaveButtonLabelDisplay;
        this.alarmToWakeTimeDescriptionMap = alarmToWakeTimeDescriptionMap;
        this.helpIconLink = helpIconLink;
        this.latestWakeTime = latestWakeTime;
    }
}
