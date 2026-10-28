package com.whoop.sleep.coach.data.network.model.sleepSchedule;

import androidx.annotation.Keep;
import cb1.C4387a;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto$$serializer;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto$$serializer;
import java.util.List;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import y00.AbstractC38963t7;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0081\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0010\u0010&\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001cJ\u0012\u0010'\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0080\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u001cJ\u0010\u0010/\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\u000b2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103J'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010=\u001a\u0004\b>\u0010\u001cR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\b@\u0010\u001eR\u001a\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bB\u0010 R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010C\u001a\u0004\bD\u0010\"R \u0010\f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u0010E\u0012\u0004\bF\u0010G\u001a\u0004\b\f\u0010$R\u001a\u0010\r\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bH\u0010$R\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010=\u001a\u0004\bI\u0010\u001cR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010J\u001a\u0004\bK\u0010(R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010J\u001a\u0004\bL\u0010(R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010M\u001a\u0004\bN\u0010+¨\u0006Q"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "", "", "allAlarmScheduleLabelDisplay", "", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleListDto;", "alarmScheduleList", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "alarmScheduleFooter", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "scheduleButtonComponent", "", "isScheduleEnabled", "shouldShowOverlay", "scheduleDisabledText", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "deleteInProgressModal", "deletingSuccessModal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "deleteErrorModal", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "component4", "()Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "component5", "()Z", "component6", "component7", "component8", "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "component9", "component10", "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;ZZLjava/lang/String;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/String;", "getAllAlarmScheduleLabelDisplay", "Ljava/util/List;", "getAlarmScheduleList", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/AlarmScheduleFooterDto;", "getAlarmScheduleFooter", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/ScheduleButtonComponentDto;", "getScheduleButtonComponent", "Z", "isScheduleEnabled$annotations", "()V", "getShouldShowOverlay", "getScheduleDisabledText", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "getDeleteInProgressModal", "getDeletingSuccessModal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "getDeleteErrorModal", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepScheduleDto {

    @SerializedName("alarm_schedule_footer")
    private final AlarmScheduleFooterDto alarmScheduleFooter;

    @SerializedName("alarm_schedule_list")
    private final List<AlarmScheduleListDto> alarmScheduleList;

    @SerializedName("all_alarm_schedule_label_display")
    private final String allAlarmScheduleLabelDisplay;

    @SerializedName("delete_error_modal")
    private final ScheduleSavingErrorDto deleteErrorModal;

    @SerializedName("deleting_in_progress_modal")
    private final ScheduleSaveDto deleteInProgressModal;

    @SerializedName("deleting_success_modal")
    private final ScheduleSaveDto deletingSuccessModal;

    @SerializedName("schedule_enabled")
    private final boolean isScheduleEnabled;

    @SerializedName("schedule_button_component")
    private final ScheduleButtonComponentDto scheduleButtonComponent;

    @SerializedName("schedule_disabled_text")
    private final String scheduleDisabledText;

    @SerializedName("should_show_overlay")
    private final boolean shouldShowOverlay;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final InterfaceC23462h[] $childSerializers = {null, AbstractC30060g.m92087G(EnumC23463i.f92934x, new C4387a(4)), null, null, null, null, null, null, null, null};

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepScheduleDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepScheduleDto(int i13, String str, List list, AlarmScheduleFooterDto alarmScheduleFooterDto, ScheduleButtonComponentDto scheduleButtonComponentDto, boolean z4, boolean z13, String str2, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SleepScheduleDto$$serializer.INSTANCE.getDescriptor());
        }
        this.allAlarmScheduleLabelDisplay = str;
        this.alarmScheduleList = list;
        this.alarmScheduleFooter = alarmScheduleFooterDto;
        this.scheduleButtonComponent = scheduleButtonComponentDto;
        this.isScheduleEnabled = z4;
        this.shouldShowOverlay = z13;
        this.scheduleDisabledText = str2;
        if ((i13 & 128) == 0) {
            this.deleteInProgressModal = null;
        } else {
            this.deleteInProgressModal = scheduleSaveDto;
        }
        if ((i13 & 256) == 0) {
            this.deletingSuccessModal = null;
        } else {
            this.deletingSuccessModal = scheduleSaveDto2;
        }
        if ((i13 & 512) == 0) {
            this.deleteErrorModal = null;
        } else {
            this.deleteErrorModal = scheduleSavingErrorDto;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return new ArrayListSerializer(AlarmScheduleListDto$$serializer.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SleepScheduleDto copy$default(SleepScheduleDto sleepScheduleDto, String str, List list, AlarmScheduleFooterDto alarmScheduleFooterDto, ScheduleButtonComponentDto scheduleButtonComponentDto, boolean z4, boolean z13, String str2, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            str = sleepScheduleDto.allAlarmScheduleLabelDisplay;
        }
        if ((i13 & 2) != 0) {
            list = sleepScheduleDto.alarmScheduleList;
        }
        if ((i13 & 4) != 0) {
            alarmScheduleFooterDto = sleepScheduleDto.alarmScheduleFooter;
        }
        if ((i13 & 8) != 0) {
            scheduleButtonComponentDto = sleepScheduleDto.scheduleButtonComponent;
        }
        if ((i13 & 16) != 0) {
            z4 = sleepScheduleDto.isScheduleEnabled;
        }
        if ((i13 & 32) != 0) {
            z13 = sleepScheduleDto.shouldShowOverlay;
        }
        if ((i13 & 64) != 0) {
            str2 = sleepScheduleDto.scheduleDisabledText;
        }
        if ((i13 & 128) != 0) {
            scheduleSaveDto = sleepScheduleDto.deleteInProgressModal;
        }
        if ((i13 & 256) != 0) {
            scheduleSaveDto2 = sleepScheduleDto.deletingSuccessModal;
        }
        if ((i13 & 512) != 0) {
            scheduleSavingErrorDto = sleepScheduleDto.deleteErrorModal;
        }
        ScheduleSaveDto scheduleSaveDto3 = scheduleSaveDto2;
        ScheduleSavingErrorDto scheduleSavingErrorDto2 = scheduleSavingErrorDto;
        String str3 = str2;
        ScheduleSaveDto scheduleSaveDto4 = scheduleSaveDto;
        boolean z14 = z4;
        boolean z15 = z13;
        return sleepScheduleDto.copy(str, list, alarmScheduleFooterDto, scheduleButtonComponentDto, z14, z15, str3, scheduleSaveDto4, scheduleSaveDto3, scheduleSavingErrorDto2);
    }

    @InterfaceC37143h("schedule_enabled")
    public static /* synthetic */ void isScheduleEnabled$annotations() {
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(SleepScheduleDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.allAlarmScheduleLabelDisplay);
        output.encodeSerializableElement(serialDesc, 1, (InterfaceC37145j) interfaceC23462hArr[1].getValue(), self.alarmScheduleList);
        output.encodeSerializableElement(serialDesc, 2, AlarmScheduleFooterDto$$serializer.INSTANCE, self.alarmScheduleFooter);
        output.encodeSerializableElement(serialDesc, 3, ScheduleButtonComponentDto$$serializer.INSTANCE, self.scheduleButtonComponent);
        output.encodeBooleanElement(serialDesc, 4, self.isScheduleEnabled);
        output.encodeBooleanElement(serialDesc, 5, self.shouldShowOverlay);
        output.encodeStringElement(serialDesc, 6, self.scheduleDisabledText);
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.deleteInProgressModal != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, ScheduleSaveDto$$serializer.INSTANCE, self.deleteInProgressModal);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.deletingSuccessModal != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, ScheduleSaveDto$$serializer.INSTANCE, self.deletingSuccessModal);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && self.deleteErrorModal == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 9, ScheduleSavingErrorDto$$serializer.INSTANCE, self.deleteErrorModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAllAlarmScheduleLabelDisplay() {
        return this.allAlarmScheduleLabelDisplay;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final ScheduleSavingErrorDto getDeleteErrorModal() {
        return this.deleteErrorModal;
    }

    public final List<AlarmScheduleListDto> component2() {
        return this.alarmScheduleList;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final AlarmScheduleFooterDto getAlarmScheduleFooter() {
        return this.alarmScheduleFooter;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final ScheduleButtonComponentDto getScheduleButtonComponent() {
        return this.scheduleButtonComponent;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsScheduleEnabled() {
        return this.isScheduleEnabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getShouldShowOverlay() {
        return this.shouldShowOverlay;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getScheduleDisabledText() {
        return this.scheduleDisabledText;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final ScheduleSaveDto getDeleteInProgressModal() {
        return this.deleteInProgressModal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final ScheduleSaveDto getDeletingSuccessModal() {
        return this.deletingSuccessModal;
    }

    public final SleepScheduleDto copy(String allAlarmScheduleLabelDisplay, List<AlarmScheduleListDto> alarmScheduleList, AlarmScheduleFooterDto alarmScheduleFooter, ScheduleButtonComponentDto scheduleButtonComponent, boolean isScheduleEnabled, boolean shouldShowOverlay, String scheduleDisabledText, ScheduleSaveDto deleteInProgressModal, ScheduleSaveDto deletingSuccessModal, ScheduleSavingErrorDto deleteErrorModal) {
        AbstractC22676k.m65750j(allAlarmScheduleLabelDisplay, "allAlarmScheduleLabelDisplay");
        AbstractC22676k.m65750j(alarmScheduleList, "alarmScheduleList");
        AbstractC22676k.m65750j(alarmScheduleFooter, "alarmScheduleFooter");
        AbstractC22676k.m65750j(scheduleButtonComponent, "scheduleButtonComponent");
        AbstractC22676k.m65750j(scheduleDisabledText, "scheduleDisabledText");
        return new SleepScheduleDto(allAlarmScheduleLabelDisplay, alarmScheduleList, alarmScheduleFooter, scheduleButtonComponent, isScheduleEnabled, shouldShowOverlay, scheduleDisabledText, deleteInProgressModal, deletingSuccessModal, deleteErrorModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepScheduleDto)) {
            return false;
        }
        SleepScheduleDto sleepScheduleDto = (SleepScheduleDto) other;
        return AbstractC22676k.m65745e(this.allAlarmScheduleLabelDisplay, sleepScheduleDto.allAlarmScheduleLabelDisplay) && AbstractC22676k.m65745e(this.alarmScheduleList, sleepScheduleDto.alarmScheduleList) && AbstractC22676k.m65745e(this.alarmScheduleFooter, sleepScheduleDto.alarmScheduleFooter) && AbstractC22676k.m65745e(this.scheduleButtonComponent, sleepScheduleDto.scheduleButtonComponent) && this.isScheduleEnabled == sleepScheduleDto.isScheduleEnabled && this.shouldShowOverlay == sleepScheduleDto.shouldShowOverlay && AbstractC22676k.m65745e(this.scheduleDisabledText, sleepScheduleDto.scheduleDisabledText) && AbstractC22676k.m65745e(this.deleteInProgressModal, sleepScheduleDto.deleteInProgressModal) && AbstractC22676k.m65745e(this.deletingSuccessModal, sleepScheduleDto.deletingSuccessModal) && AbstractC22676k.m65745e(this.deleteErrorModal, sleepScheduleDto.deleteErrorModal);
    }

    public final AlarmScheduleFooterDto getAlarmScheduleFooter() {
        return this.alarmScheduleFooter;
    }

    public final List<AlarmScheduleListDto> getAlarmScheduleList() {
        return this.alarmScheduleList;
    }

    public final String getAllAlarmScheduleLabelDisplay() {
        return this.allAlarmScheduleLabelDisplay;
    }

    public final ScheduleSavingErrorDto getDeleteErrorModal() {
        return this.deleteErrorModal;
    }

    public final ScheduleSaveDto getDeleteInProgressModal() {
        return this.deleteInProgressModal;
    }

    public final ScheduleSaveDto getDeletingSuccessModal() {
        return this.deletingSuccessModal;
    }

    public final ScheduleButtonComponentDto getScheduleButtonComponent() {
        return this.scheduleButtonComponent;
    }

    public final String getScheduleDisabledText() {
        return this.scheduleDisabledText;
    }

    public final boolean getShouldShowOverlay() {
        return this.shouldShowOverlay;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.scheduleButtonComponent.hashCode() + ((this.alarmScheduleFooter.hashCode() + AbstractC11895b.m31983b(this.allAlarmScheduleLabelDisplay.hashCode() * 31, 31, this.alarmScheduleList)) * 31)) * 31, 31, this.isScheduleEnabled), 31, this.shouldShowOverlay), 31, this.scheduleDisabledText);
        ScheduleSaveDto scheduleSaveDto = this.deleteInProgressModal;
        int iHashCode = (iM30450d + (scheduleSaveDto == null ? 0 : scheduleSaveDto.hashCode())) * 31;
        ScheduleSaveDto scheduleSaveDto2 = this.deletingSuccessModal;
        int iHashCode2 = (iHashCode + (scheduleSaveDto2 == null ? 0 : scheduleSaveDto2.hashCode())) * 31;
        ScheduleSavingErrorDto scheduleSavingErrorDto = this.deleteErrorModal;
        return iHashCode2 + (scheduleSavingErrorDto != null ? scheduleSavingErrorDto.hashCode() : 0);
    }

    public final boolean isScheduleEnabled() {
        return this.isScheduleEnabled;
    }

    public String toString() {
        String str = this.allAlarmScheduleLabelDisplay;
        List<AlarmScheduleListDto> list = this.alarmScheduleList;
        AlarmScheduleFooterDto alarmScheduleFooterDto = this.alarmScheduleFooter;
        ScheduleButtonComponentDto scheduleButtonComponentDto = this.scheduleButtonComponent;
        boolean z4 = this.isScheduleEnabled;
        boolean z13 = this.shouldShowOverlay;
        String str2 = this.scheduleDisabledText;
        ScheduleSaveDto scheduleSaveDto = this.deleteInProgressModal;
        ScheduleSaveDto scheduleSaveDto2 = this.deletingSuccessModal;
        ScheduleSavingErrorDto scheduleSavingErrorDto = this.deleteErrorModal;
        StringBuilder sbM94766o = AbstractC30802r.m94766o("SleepScheduleDto(allAlarmScheduleLabelDisplay=", str, ", alarmScheduleList=", ", alarmScheduleFooter=", list);
        sbM94766o.append(alarmScheduleFooterDto);
        sbM94766o.append(", scheduleButtonComponent=");
        sbM94766o.append(scheduleButtonComponentDto);
        sbM94766o.append(", isScheduleEnabled=");
        AbstractC38963t7.m124392v(sbM94766o, z4, ", shouldShowOverlay=", z13, ", scheduleDisabledText=");
        sbM94766o.append(str2);
        sbM94766o.append(", deleteInProgressModal=");
        sbM94766o.append(scheduleSaveDto);
        sbM94766o.append(", deletingSuccessModal=");
        sbM94766o.append(scheduleSaveDto2);
        sbM94766o.append(", deleteErrorModal=");
        sbM94766o.append(scheduleSavingErrorDto);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    public SleepScheduleDto(String allAlarmScheduleLabelDisplay, List<AlarmScheduleListDto> alarmScheduleList, AlarmScheduleFooterDto alarmScheduleFooter, ScheduleButtonComponentDto scheduleButtonComponent, boolean z4, boolean z13, String scheduleDisabledText, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto) {
        AbstractC22676k.m65750j(allAlarmScheduleLabelDisplay, "allAlarmScheduleLabelDisplay");
        AbstractC22676k.m65750j(alarmScheduleList, "alarmScheduleList");
        AbstractC22676k.m65750j(alarmScheduleFooter, "alarmScheduleFooter");
        AbstractC22676k.m65750j(scheduleButtonComponent, "scheduleButtonComponent");
        AbstractC22676k.m65750j(scheduleDisabledText, "scheduleDisabledText");
        this.allAlarmScheduleLabelDisplay = allAlarmScheduleLabelDisplay;
        this.alarmScheduleList = alarmScheduleList;
        this.alarmScheduleFooter = alarmScheduleFooter;
        this.scheduleButtonComponent = scheduleButtonComponent;
        this.isScheduleEnabled = z4;
        this.shouldShowOverlay = z13;
        this.scheduleDisabledText = scheduleDisabledText;
        this.deleteInProgressModal = scheduleSaveDto;
        this.deletingSuccessModal = scheduleSaveDto2;
        this.deleteErrorModal = scheduleSavingErrorDto;
    }

    public /* synthetic */ SleepScheduleDto(String str, List list, AlarmScheduleFooterDto alarmScheduleFooterDto, ScheduleButtonComponentDto scheduleButtonComponentDto, boolean z4, boolean z13, String str2, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, alarmScheduleFooterDto, scheduleButtonComponentDto, z4, z13, str2, (i13 & 128) != 0 ? null : scheduleSaveDto, (i13 & 256) != 0 ? null : scheduleSaveDto2, (i13 & 512) != 0 ? null : scheduleSavingErrorDto);
    }
}
