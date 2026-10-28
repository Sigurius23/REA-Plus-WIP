package com.whoop.coaching.sleepcoach.data.network.api;

import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto;
import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingResponseDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\u0004¨\u0006\rÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/data/network/api/SleepCoachOnboardingApi;", "", "", "getSleepCoachOnBoardingStatus", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;", "sleepCoachOnBoardingRequestDto", "Lpg3/v0;", "Ll83/a0;", "updateSleepCoachOnBoardingStatus", "(Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingRequestDto;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/data/remote/domain/dto/sleepcoach/SleepCoachOnBoardingResponseDto;", "getAllSleepCoachOnBoardingStatus", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SleepCoachOnboardingApi {
    @InterfaceC37275f("coaching-service/v1/sleepneed/onboarding")
    Object getAllSleepCoachOnBoardingStatus(InterfaceC30057d<? super SleepCoachOnBoardingResponseDto> interfaceC30057d);

    @InterfaceC37275f("coaching-service/v1/sleepneed/onboarding/SLEEP_COACH")
    Object getSleepCoachOnBoardingStatus(InterfaceC30057d<? super String> interfaceC30057d);

    @InterfaceC37284o("coaching-service/v1/sleepneed/onboarding")
    Object updateSleepCoachOnBoardingStatus(@InterfaceC37270a SleepCoachOnBoardingRequestDto sleepCoachOnBoardingRequestDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
