package com.whoop.sleep.coach.data.network.api;

import com.whoop.sleep.coach.data.network.model.AlarmOverrideDto;
import com.whoop.sleep.coach.data.network.model.EligibilityResponseDto;
import com.whoop.sleep.coach.data.network.model.TimeZoneUpdateModel;
import com.whoop.sleep.coach.data.network.model.sleepSchedule.SleepScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.CreateAlarmScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepScheduleComponentsDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37283n;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\u000b\u0010\u0004J\u001a\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u00020\u00072\b\b\u0001\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0001\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\u0013\u0010\u000fJ\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H§@¢\u0006\u0004\b\u0014\u0010\u0004J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0012H§@¢\u0006\u0004\b\u0015\u0010\u0004J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001c\u001a\u00020\u001b2\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\fH§@¢\u0006\u0004\b\u001c\u0010\u000fJ \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\b\u0001\u0010\u0017\u001a\u00020\u001dH§@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "sleepScheduleComponents", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "alarmSchedule", "Ll83/a0;", "createAlarmSchedule", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sleep/coach/data/network/model/sleepSchedule/SleepScheduleDto;", "getAllSleepScheduleComponents", "", "sleepScheduleId", "getSleepScheduleComponentsById", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "editAlarmSchedule", "(Ljava/lang/String;Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "deleteSleepScheduleById", "enableSleepSchedule", "disableSleepSchedule", "Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;", "body", "postSmartAlarmOverride", "(Lcom/whoop/sleep/coach/data/network/model/AlarmOverrideDto;Lq83/d;)Ljava/lang/Object;", "notificationCardId", "Lcom/whoop/sleep/coach/data/network/model/EligibilityResponseDto;", "getEligibility", "Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;", "updateAlarmPreferencesTimezone", "(Lcom/whoop/sleep/coach/data/network/model/TimeZoneUpdateModel;Lq83/d;)Ljava/lang/Object;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SleepCoachApi {
    @InterfaceC37284o("smart-alarm-bff/v1/schedule")
    Object createAlarmSchedule(@InterfaceC37270a CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37271b("smart-alarm-service/v1/alarm-schedule/{scheduleId}")
    Object deleteSleepScheduleById(@InterfaceC37288s("scheduleId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-service/v1/alarm-schedule/disable")
    Object disableSleepSchedule(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-bff/v1/schedule/{scheduleId}")
    Object editAlarmSchedule(@InterfaceC37288s("scheduleId") String str, @InterfaceC37270a CreateAlarmScheduleDto createAlarmScheduleDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-service/v1/alarm-schedule/enable")
    Object enableSleepSchedule(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-bff/v1/schedule/all")
    Object getAllSleepScheduleComponents(InterfaceC30057d<? super SleepScheduleDto> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-service/v1/smartalarm/preferences/awake-disable")
    Object getEligibility(@InterfaceC37289t("notificationCardId") String str, InterfaceC30057d<? super EligibilityResponseDto> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-bff/v1/schedule/components/populated/{scheduleId}")
    Object getSleepScheduleComponentsById(@InterfaceC37288s("scheduleId") String str, InterfaceC30057d<? super SleepScheduleComponentsDto> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-service/v1/smartalarm/override")
    Object postSmartAlarmOverride(@InterfaceC37270a AlarmOverrideDto alarmOverrideDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-bff/v1/schedule/components")
    Object sleepScheduleComponents(InterfaceC30057d<? super SleepScheduleComponentsDto> interfaceC30057d);

    @InterfaceC37283n("smart-alarm-service/v1/smartalarm/preferences/timezone")
    Object updateAlarmPreferencesTimezone(@InterfaceC37270a TimeZoneUpdateModel timeZoneUpdateModel, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
