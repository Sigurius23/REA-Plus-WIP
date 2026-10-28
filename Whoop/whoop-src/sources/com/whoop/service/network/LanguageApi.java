package com.whoop.service.network;

import com.whoop.data.remote.domain.response.AllowedLanguagesResponseDto;
import com.whoop.data.remote.domain.response.EnabledLanguagesResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ$\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u000f\u001a\u00020\f2\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H§@¢\u0006\u0004\b\u000f\u0010\u000eJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/LanguageApi;", "", "Lpg3/v0;", "Ll83/a0;", "updateLanguagePreference", "(Lq83/d;)Ljava/lang/Object;", "", "platform", "Lcom/whoop/data/remote/domain/response/EnabledLanguagesResponse;", "getEnabledLanguagesForPicker", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "regions", "Lcom/whoop/data/remote/domain/response/AllowedLanguagesResponseDto;", "getAllowedLanguagesAuthedWithHeader", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "getAllowedLanguagesOnboardingWithHeader", "optOutOfArabicBeta", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface LanguageApi {
    @InterfaceC37275f("language-service/v2/user/mobile/allowed")
    Object getAllowedLanguagesAuthedWithHeader(@InterfaceC37289t("platform") String str, @InterfaceC37278i("X-WHOOP-Regions") String str2, InterfaceC30057d<? super AllowedLanguagesResponseDto> interfaceC30057d);

    @InterfaceC37275f("language-service/v2/user/mobile/allowed/onboarding")
    Object getAllowedLanguagesOnboardingWithHeader(@InterfaceC37289t("platform") String str, @InterfaceC37278i("X-WHOOP-Regions") String str2, InterfaceC30057d<? super AllowedLanguagesResponseDto> interfaceC30057d);

    @InterfaceC37275f("language-service/v2/user/mobile/enabled")
    Object getEnabledLanguagesForPicker(@InterfaceC37289t("platform") String str, InterfaceC30057d<? super EnabledLanguagesResponse> interfaceC30057d);

    @InterfaceC37284o("language-service/v1/user/mobile/arabic-beta/opt-out")
    Object optOutOfArabicBeta(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("language-service/v1/tracking/mobile")
    Object updateLanguagePreference(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
