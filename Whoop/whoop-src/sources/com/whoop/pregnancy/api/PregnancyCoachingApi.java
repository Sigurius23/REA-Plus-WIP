package com.whoop.pregnancy.api;

import com.whoop.educationModels.FeatureEducationDto;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H§@¢\u0006\u0004\b\u0007\u0010\u0004J\u001a\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH§@¢\u0006\u0004\b\r\u0010\u0004J\u0010\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0011\u0010\u0004¨\u0006\u0012À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/pregnancy/api/PregnancyCoachingApi;", "", "Lcom/whoop/pregnancy/api/PregnancySettingsDto;", "getPregnancySettingsBff", "(Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "togglePregnancyCoachingOff", "Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;", "dueDate", "updateDueDate", "(Lcom/whoop/pregnancy/api/EnablePregnancyCoachingBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/pregnancy/api/PregnancyOnboardingDto;", "getPregnancyCoachingOnboarding", "Lcom/whoop/pregnancy/api/PregnancyDueDateSavedScreenDto;", "onboardingDueDateSaved", "Lcom/whoop/educationModels/FeatureEducationDto;", "getPregnancyEducation", "pregnancy_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface PregnancyCoachingApi {
    @InterfaceC37275f("/health-service/v1/pregnancy/onboarding/welcome")
    Object getPregnancyCoachingOnboarding(InterfaceC30057d<? super PregnancyOnboardingDto> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/PREGNANCY_IN_APP")
    Object getPregnancyEducation(InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);

    @InterfaceC37275f("/health-service/v1/pregnancy/settings/bff")
    Object getPregnancySettingsBff(InterfaceC30057d<? super PregnancySettingsDto> interfaceC30057d);

    @InterfaceC37275f("/health-service/v1/pregnancy/onboarding/due-date-saved")
    Object onboardingDueDateSaved(InterfaceC30057d<? super PregnancyDueDateSavedScreenDto> interfaceC30057d);

    @InterfaceC37271b("/health-service/v1/pregnancy/settings")
    Object togglePregnancyCoachingOff(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("/health-service/v1/pregnancy/settings")
    Object updateDueDate(@InterfaceC37270a EnablePregnancyCoachingBody enablePregnancyCoachingBody, InterfaceC30057d<? super C23454a0> interfaceC30057d);
}
