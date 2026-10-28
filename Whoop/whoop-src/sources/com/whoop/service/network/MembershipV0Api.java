package com.whoop.service.network;

import com.whoop.data.remote.domain.dto.onboarding.OnboardingInfoDto;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/MembershipV0Api;", "", "", "flow", "strapSerial", "strapSignature", "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;", "fetchGetOnboardingInfoV0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface MembershipV0Api {
    @InterfaceC37275f("/membership-service/v0/onboarding/info")
    Object fetchGetOnboardingInfoV0(@InterfaceC37289t("flow") String str, @InterfaceC37289t("strapSerial") String str2, @InterfaceC37289t("strapSignature") String str3, InterfaceC30057d<? super OnboardingInfoDto> interfaceC30057d);
}
