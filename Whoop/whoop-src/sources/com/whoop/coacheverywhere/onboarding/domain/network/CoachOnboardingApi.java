package com.whoop.coacheverywhere.onboarding.domain.network;

import com.whoop.coacheverywhere.onboarding.model.CoachOnboardingResponse;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/coacheverywhere/onboarding/domain/network/CoachOnboardingApi;", "", "Lpg3/v0;", "Lcom/whoop/coacheverywhere/onboarding/model/CoachOnboardingResponse;", "getCoachOnboarding", "(Lq83/d;)Ljava/lang/Object;", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface CoachOnboardingApi {
    @InterfaceC37275f("onboarding-service/v1/coach/COACH_EVERYWHERE_DAY_ZERO")
    Object getCoachOnboarding(InterfaceC30057d<? super C29218v0<CoachOnboardingResponse>> interfaceC30057d);
}
