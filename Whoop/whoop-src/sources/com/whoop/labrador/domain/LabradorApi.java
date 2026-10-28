package com.whoop.labrador.domain;

import com.whoop.labrador.feature.about.domain.models.LabradorAboutResponse;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityResponse;
import com.whoop.labrador.feature.reading.domain.models.LabradorDetailsSymptomsAndNotesUpdateRequest;
import com.whoop.labrador.feature.reading.domain.models.LabradorReadingSymptomsUpdateRequest;
import com.whoop.labrador.feature.registration.domain.models.LabradorRegistrationResponse;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000e\u0010\u0004J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\b\u001a\u00020\u0012H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/labrador/domain/LabradorApi;", "", "Lcom/whoop/labrador/feature/about/domain/models/LabradorAboutResponse;", "getLabradorAboutScreen", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/labrador/feature/registration/domain/models/LabradorRegistrationResponse;", "getLabradorRegistrationScreen", "Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;", "body", "Lpg3/v0;", "Ll83/a0;", "updateLabradorReadingSymptoms", "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorReadingSymptomsUpdateRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityResponse;", "getLabradorEligibilitySetupScreen", "Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;", "saveEligibility", "(Lcom/whoop/labrador/feature/eligibility/domain/model/LabradorEligibilityRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;", "updateDetailsSymptomsAndNotes", "(Lcom/whoop/labrador/feature/reading/domain/models/LabradorDetailsSymptomsAndNotesUpdateRequest;Lq83/d;)Ljava/lang/Object;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface LabradorApi {
    @InterfaceC37275f("ecg-service/v1/ecg/about")
    Object getLabradorAboutScreen(InterfaceC30057d<? super LabradorAboutResponse> interfaceC30057d);

    @InterfaceC37275f("ecg-service/v1/termsofuse")
    Object getLabradorEligibilitySetupScreen(InterfaceC30057d<? super LabradorEligibilityResponse> interfaceC30057d);

    @InterfaceC37275f("ecg-service/v1/ecg/regulatory")
    Object getLabradorRegistrationScreen(InterfaceC30057d<? super LabradorRegistrationResponse> interfaceC30057d);

    @InterfaceC37285p("ecg-service/v1/ecg/setup")
    Object saveEligibility(@InterfaceC37270a LabradorEligibilityRequest labradorEligibilityRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("ecg-service/v1/ecg/readings/notesAndSymptoms")
    Object updateDetailsSymptomsAndNotes(@InterfaceC37270a LabradorDetailsSymptomsAndNotesUpdateRequest labradorDetailsSymptomsAndNotesUpdateRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("ecg-service/v1/ecg/readings")
    Object updateLabradorReadingSymptoms(@InterfaceC37270a LabradorReadingSymptomsUpdateRequest labradorReadingSymptomsUpdateRequest, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
