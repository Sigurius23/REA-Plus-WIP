package com.whoop.sleep.coach.data.network.model.sleepScheduleComponent;

import androidx.annotation.Keep;
import com.google.gson.annotations.SerializedName;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto$$serializer;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto$$serializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37144i;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 D2\u00020\u0001:\u0002EDB?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010Ba\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J'\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0010\u0010*\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b*\u0010+JV\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00105\u001a\u0002042\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b:\u0010\"R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010;\u001a\u0004\b<\u0010$R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010&R\u001a\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bA\u0010(R\u001a\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010+¨\u0006F"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "repeatDays", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "wakeMode", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "wakeTime", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "sleepGoal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "scheduleSaveSuccessModal", "scheduleSavingModal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "scheduleSaveErrorModal", "<init>", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$sleep_coach_release", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;Lzc3/c;Lyc3/g;)V", "write$Self", "component1", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "component2", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "component3", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "component4", "()Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "component5", "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "component6", "component7", "()Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "copy", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "getRepeatDays", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "getWakeMode", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeTimeDto;", "getWakeTime", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "getSleepGoal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "getScheduleSaveSuccessModal", "getScheduleSavingModal", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "getScheduleSaveErrorModal", "Companion", "$serializer", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SleepScheduleComponentsDto {

    @SerializedName("repeat_days")
    private final RepeatDaysDto repeatDays;

    @SerializedName("schedule_save_error_modal")
    private final ScheduleSavingErrorDto scheduleSaveErrorModal;

    @SerializedName("schedule_save_success_modal")
    private final ScheduleSaveDto scheduleSaveSuccessModal;

    @SerializedName("schedule_saving_modal")
    private final ScheduleSaveDto scheduleSavingModal;

    @SerializedName("sleep_goal")
    private final SleepGoalDto sleepGoal;

    @SerializedName("wake_mode")
    private final WakeModeDto wakeMode;

    @SerializedName("wake_time")
    private final WakeTimeDto wakeTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "serializer", "()Lwc3/c;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SleepScheduleComponentsDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ SleepScheduleComponentsDto(int i13, RepeatDaysDto repeatDaysDto, WakeModeDto wakeModeDto, WakeTimeDto wakeTimeDto, SleepGoalDto sleepGoalDto, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i13 & 127)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 127, SleepScheduleComponentsDto$$serializer.INSTANCE.getDescriptor());
        }
        this.repeatDays = repeatDaysDto;
        this.wakeMode = wakeModeDto;
        this.wakeTime = wakeTimeDto;
        this.sleepGoal = sleepGoalDto;
        this.scheduleSaveSuccessModal = scheduleSaveDto;
        this.scheduleSavingModal = scheduleSaveDto2;
        this.scheduleSaveErrorModal = scheduleSavingErrorDto;
    }

    public static /* synthetic */ SleepScheduleComponentsDto copy$default(SleepScheduleComponentsDto sleepScheduleComponentsDto, RepeatDaysDto repeatDaysDto, WakeModeDto wakeModeDto, WakeTimeDto wakeTimeDto, SleepGoalDto sleepGoalDto, ScheduleSaveDto scheduleSaveDto, ScheduleSaveDto scheduleSaveDto2, ScheduleSavingErrorDto scheduleSavingErrorDto, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            repeatDaysDto = sleepScheduleComponentsDto.repeatDays;
        }
        if ((i13 & 2) != 0) {
            wakeModeDto = sleepScheduleComponentsDto.wakeMode;
        }
        if ((i13 & 4) != 0) {
            wakeTimeDto = sleepScheduleComponentsDto.wakeTime;
        }
        if ((i13 & 8) != 0) {
            sleepGoalDto = sleepScheduleComponentsDto.sleepGoal;
        }
        if ((i13 & 16) != 0) {
            scheduleSaveDto = sleepScheduleComponentsDto.scheduleSaveSuccessModal;
        }
        if ((i13 & 32) != 0) {
            scheduleSaveDto2 = sleepScheduleComponentsDto.scheduleSavingModal;
        }
        if ((i13 & 64) != 0) {
            scheduleSavingErrorDto = sleepScheduleComponentsDto.scheduleSaveErrorModal;
        }
        ScheduleSaveDto scheduleSaveDto3 = scheduleSaveDto2;
        ScheduleSavingErrorDto scheduleSavingErrorDto2 = scheduleSavingErrorDto;
        ScheduleSaveDto scheduleSaveDto4 = scheduleSaveDto;
        WakeTimeDto wakeTimeDto2 = wakeTimeDto;
        return sleepScheduleComponentsDto.copy(repeatDaysDto, wakeModeDto, wakeTimeDto2, sleepGoalDto, scheduleSaveDto4, scheduleSaveDto3, scheduleSavingErrorDto2);
    }

    public static final /* synthetic */ void write$Self$sleep_coach_release(SleepScheduleComponentsDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, RepeatDaysDto$$serializer.INSTANCE, self.repeatDays);
        output.encodeSerializableElement(serialDesc, 1, WakeModeDto$$serializer.INSTANCE, self.wakeMode);
        output.encodeSerializableElement(serialDesc, 2, WakeTimeDto$$serializer.INSTANCE, self.wakeTime);
        output.encodeSerializableElement(serialDesc, 3, SleepGoalDto$$serializer.INSTANCE, self.sleepGoal);
        ScheduleSaveDto$$serializer scheduleSaveDto$$serializer = ScheduleSaveDto$$serializer.INSTANCE;
        output.encodeSerializableElement(serialDesc, 4, scheduleSaveDto$$serializer, self.scheduleSaveSuccessModal);
        output.encodeSerializableElement(serialDesc, 5, scheduleSaveDto$$serializer, self.scheduleSavingModal);
        output.encodeSerializableElement(serialDesc, 6, ScheduleSavingErrorDto$$serializer.INSTANCE, self.scheduleSaveErrorModal);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final RepeatDaysDto getRepeatDays() {
        return this.repeatDays;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WakeModeDto getWakeMode() {
        return this.wakeMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final WakeTimeDto getWakeTime() {
        return this.wakeTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SleepGoalDto getSleepGoal() {
        return this.sleepGoal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ScheduleSaveDto getScheduleSaveSuccessModal() {
        return this.scheduleSaveSuccessModal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final ScheduleSaveDto getScheduleSavingModal() {
        return this.scheduleSavingModal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final ScheduleSavingErrorDto getScheduleSaveErrorModal() {
        return this.scheduleSaveErrorModal;
    }

    public final SleepScheduleComponentsDto copy(RepeatDaysDto repeatDays, WakeModeDto wakeMode, WakeTimeDto wakeTime, SleepGoalDto sleepGoal, ScheduleSaveDto scheduleSaveSuccessModal, ScheduleSaveDto scheduleSavingModal, ScheduleSavingErrorDto scheduleSaveErrorModal) {
        AbstractC22676k.m65750j(repeatDays, "repeatDays");
        AbstractC22676k.m65750j(wakeMode, "wakeMode");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(scheduleSaveSuccessModal, "scheduleSaveSuccessModal");
        AbstractC22676k.m65750j(scheduleSavingModal, "scheduleSavingModal");
        AbstractC22676k.m65750j(scheduleSaveErrorModal, "scheduleSaveErrorModal");
        return new SleepScheduleComponentsDto(repeatDays, wakeMode, wakeTime, sleepGoal, scheduleSaveSuccessModal, scheduleSavingModal, scheduleSaveErrorModal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepScheduleComponentsDto)) {
            return false;
        }
        SleepScheduleComponentsDto sleepScheduleComponentsDto = (SleepScheduleComponentsDto) other;
        return AbstractC22676k.m65745e(this.repeatDays, sleepScheduleComponentsDto.repeatDays) && AbstractC22676k.m65745e(this.wakeMode, sleepScheduleComponentsDto.wakeMode) && AbstractC22676k.m65745e(this.wakeTime, sleepScheduleComponentsDto.wakeTime) && AbstractC22676k.m65745e(this.sleepGoal, sleepScheduleComponentsDto.sleepGoal) && AbstractC22676k.m65745e(this.scheduleSaveSuccessModal, sleepScheduleComponentsDto.scheduleSaveSuccessModal) && AbstractC22676k.m65745e(this.scheduleSavingModal, sleepScheduleComponentsDto.scheduleSavingModal) && AbstractC22676k.m65745e(this.scheduleSaveErrorModal, sleepScheduleComponentsDto.scheduleSaveErrorModal);
    }

    public final RepeatDaysDto getRepeatDays() {
        return this.repeatDays;
    }

    public final ScheduleSavingErrorDto getScheduleSaveErrorModal() {
        return this.scheduleSaveErrorModal;
    }

    public final ScheduleSaveDto getScheduleSaveSuccessModal() {
        return this.scheduleSaveSuccessModal;
    }

    public final ScheduleSaveDto getScheduleSavingModal() {
        return this.scheduleSavingModal;
    }

    public final SleepGoalDto getSleepGoal() {
        return this.sleepGoal;
    }

    public final WakeModeDto getWakeMode() {
        return this.wakeMode;
    }

    public final WakeTimeDto getWakeTime() {
        return this.wakeTime;
    }

    public int hashCode() {
        return this.scheduleSaveErrorModal.hashCode() + ((this.scheduleSavingModal.hashCode() + ((this.scheduleSaveSuccessModal.hashCode() + ((this.sleepGoal.hashCode() + ((this.wakeTime.hashCode() + ((this.wakeMode.hashCode() + (this.repeatDays.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "SleepScheduleComponentsDto(repeatDays=" + this.repeatDays + ", wakeMode=" + this.wakeMode + ", wakeTime=" + this.wakeTime + ", sleepGoal=" + this.sleepGoal + ", scheduleSaveSuccessModal=" + this.scheduleSaveSuccessModal + ", scheduleSavingModal=" + this.scheduleSavingModal + ", scheduleSaveErrorModal=" + this.scheduleSaveErrorModal + ")";
    }

    public SleepScheduleComponentsDto(RepeatDaysDto repeatDays, WakeModeDto wakeMode, WakeTimeDto wakeTime, SleepGoalDto sleepGoal, ScheduleSaveDto scheduleSaveSuccessModal, ScheduleSaveDto scheduleSavingModal, ScheduleSavingErrorDto scheduleSaveErrorModal) {
        AbstractC22676k.m65750j(repeatDays, "repeatDays");
        AbstractC22676k.m65750j(wakeMode, "wakeMode");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepGoal, "sleepGoal");
        AbstractC22676k.m65750j(scheduleSaveSuccessModal, "scheduleSaveSuccessModal");
        AbstractC22676k.m65750j(scheduleSavingModal, "scheduleSavingModal");
        AbstractC22676k.m65750j(scheduleSaveErrorModal, "scheduleSaveErrorModal");
        this.repeatDays = repeatDays;
        this.wakeMode = wakeMode;
        this.wakeTime = wakeTime;
        this.sleepGoal = sleepGoal;
        this.scheduleSaveSuccessModal = scheduleSaveSuccessModal;
        this.scheduleSavingModal = scheduleSavingModal;
        this.scheduleSaveErrorModal = scheduleSaveErrorModal;
    }
}
