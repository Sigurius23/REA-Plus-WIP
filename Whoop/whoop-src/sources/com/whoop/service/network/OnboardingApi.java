package com.whoop.service.network;

import com.whoop.service.network.model.AcceptUserConsentsPayload;
import com.whoop.service.network.model.AgeGateResponse;
import com.whoop.service.network.model.TermDetailsResponse;
import l83.C23454a0;
import l92.C23545c;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000e\u0010\u0007J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/service/network/OnboardingApi;", "", "", "country", "adminDivision", "Lcom/whoop/service/network/model/AgeGateResponse;", "getAgeGate", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "region", "Ll92/c;", "getTerms", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "termId", "Lcom/whoop/service/network/model/TermDetailsResponse;", "getTermDetails", "Lcom/whoop/service/network/model/AcceptUserConsentsPayload;", "body", "Lpg3/v0;", "Ll83/a0;", "acceptUserConsents", "(Lcom/whoop/service/network/model/AcceptUserConsentsPayload;Lq83/d;)Ljava/lang/Object;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface OnboardingApi {
    @InterfaceC37285p("onboarding-service/v2/consents")
    Object acceptUserConsents(@InterfaceC37270a AcceptUserConsentsPayload acceptUserConsentsPayload, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/age-gate")
    Object getAgeGate(@InterfaceC37289t("country") String str, @InterfaceC37289t("adminDivision") String str2, InterfaceC30057d<? super AgeGateResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/consents/{termId}")
    Object getTermDetails(@InterfaceC37288s("termId") String str, @InterfaceC37289t("region") String str2, InterfaceC30057d<? super TermDetailsResponse> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v2/consents")
    Object getTerms(@InterfaceC37289t("region") String str, InterfaceC30057d<? super C23545c> interfaceC30057d);
}
