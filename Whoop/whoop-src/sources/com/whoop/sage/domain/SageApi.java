package com.whoop.sage.domain;

import com.mapbox.common.HttpHeaders;
import com.whoop.sage.domain.models.SageResponse;
import com.whoop.sage.onboarding.domain.models.SageManualMeasurementRequest;
import com.whoop.sage.onboarding.domain.models.SageOnboardingRequest;
import com.whoop.sage.onboarding.domain.models.SageOnboardingResponse;
import com.whoop.sage.onboarding.domain.models.SageOnboardingSaveRequestResponse;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007H§@¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007H§@¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\b\b\u0001\u0010\f\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/sage/domain/SageApi;", "", "", HttpHeaders.DATE, "Lcom/whoop/sage/domain/models/SageResponse;", "getSage", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingResponse;", "getSageOnboarding", "(Lq83/d;)Ljava/lang/Object;", "getSageManualInput", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;", "body", "Lpg3/v0;", "Lcom/whoop/sage/onboarding/domain/models/SageOnboardingSaveRequestResponse;", "saveSageOnboarding", "(Lcom/whoop/sage/onboarding/domain/models/SageOnboardingRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;", "saveSageManualMeasurement", "(Lcom/whoop/sage/onboarding/domain/models/SageManualMeasurementRequest;Lq83/d;)Ljava/lang/Object;", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface SageApi {
    @InterfaceC37275f("sage-service/v1/sage/bff")
    Object getSage(@InterfaceC37289t(HttpHeaders.DATE) String str, InterfaceC30057d<? super SageResponse> interfaceC30057d);

    @InterfaceC37275f("sage-service/v1/sage/manual/input")
    Object getSageManualInput(InterfaceC30057d<? super SageOnboardingResponse> interfaceC30057d);

    @InterfaceC37275f("sage-service/v1/sage/onboarding/questionnaire")
    Object getSageOnboarding(InterfaceC30057d<? super SageOnboardingResponse> interfaceC30057d);

    @InterfaceC37285p("sage-service/v1/sage/manual")
    Object saveSageManualMeasurement(@InterfaceC37270a SageManualMeasurementRequest sageManualMeasurementRequest, InterfaceC30057d<? super C29218v0<SageOnboardingSaveRequestResponse>> interfaceC30057d);

    @InterfaceC37285p("sage-service/v1/sage/onboarding")
    Object saveSageOnboarding(@InterfaceC37270a SageOnboardingRequest sageOnboardingRequest, InterfaceC30057d<? super C29218v0<SageOnboardingSaveRequestResponse>> interfaceC30057d);
}
