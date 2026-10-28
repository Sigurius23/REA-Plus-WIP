package com.whoop.smart.alarm.data.network.api;

import com.whoop.data.remote.domain.dto.PollingSmartAlarmTriggerDto;
import com.whoop.data.remote.domain.dto.SetSmartAlarmDto;
import com.whoop.data.remote.domain.dto.SmartAlarmUserInfoDto;
import com.whoop.smart.alarm.data.network.model.DefaultWakeWindowDto;
import com.whoop.smart.alarm.data.network.model.StrapLatestWakeTimeDto;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37279j;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\u00032\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0005J6\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u0007\u001a\u00020\f2\u0014\b\u0001\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0\rH§@¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0002H§@¢\u0006\u0004\b\u0014\u0010\u0005J\u001a\u0010\u0017\u001a\u00020\u00102\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "", "Lpg3/v0;", "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "getSmartAlarmUserInfoResponseAlarmService", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;", "body", "postSmartAlarmUserInfoAlarmService", "(Lcom/whoop/data/remote/domain/dto/SetSmartAlarmDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/PollingSmartAlarmTriggerDto;", "pollSmartAlarmTriggerAlarmService", "Lud3/v0;", "", "", "headers", "Ll83/a0;", "sendSmartAlarmDiagnosticAlarmService", "(Lud3/v0;Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/smart/alarm/data/network/model/DefaultWakeWindowDto;", "getDefaultWakeWindow", "Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;", "latestWakeTimeDto", "putNewStrapLatestWakeTime", "(Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lq83/d;)Ljava/lang/Object;", "smart-alarm_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SmartAlarmApi {
    @InterfaceC37275f("smart-alarm-service/v1/user-info/default-wake-window")
    Object getDefaultWakeWindow(InterfaceC30057d<? super C29218v0<DefaultWakeWindowDto>> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-service/v1/smartalarm/preferences")
    Object getSmartAlarmUserInfoResponseAlarmService(InterfaceC30057d<? super C29218v0<SmartAlarmUserInfoDto>> interfaceC30057d);

    @InterfaceC37275f("smart-alarm-service/v1/smartalarm/poll")
    Object pollSmartAlarmTriggerAlarmService(InterfaceC30057d<? super C29218v0<PollingSmartAlarmTriggerDto>> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-service/v1/smartalarm/preferences")
    Object postSmartAlarmUserInfoAlarmService(@InterfaceC37270a SetSmartAlarmDto setSmartAlarmDto, InterfaceC30057d<? super SmartAlarmUserInfoDto> interfaceC30057d);

    @InterfaceC37285p("smart-alarm-service/v1/strap-status")
    Object putNewStrapLatestWakeTime(@InterfaceC37270a StrapLatestWakeTimeDto strapLatestWakeTimeDto, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37284o("smart-alarm-service/v1/smartalarm/wbl")
    Object sendSmartAlarmDiagnosticAlarmService(@InterfaceC37270a AbstractC34846v0 abstractC34846v0, @InterfaceC37279j Map<String, String> map, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
