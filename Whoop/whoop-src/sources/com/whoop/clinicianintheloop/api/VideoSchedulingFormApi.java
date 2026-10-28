package com.whoop.clinicianintheloop.api;

import com.whoop.navigation.C9598e;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000e\u001a\u00020\u000b2\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u000e\u0010\r¨\u0006\u000fÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormApi;", "", "", "usState", "appointmentId", "Lcom/whoop/clinicianintheloop/api/VideoSchedulingFormResponse;", "getSchedulingForm", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "appointmentType", "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;", "request", "Lcom/whoop/navigation/e;", "saveSchedulingForm", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingFormRequest;Lq83/d;)Ljava/lang/Object;", "rescheduleSchedulingForm", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface VideoSchedulingFormApi {
    @InterfaceC37275f("clinician-in-the-loop-service/v1/scheduling/availability")
    Object getSchedulingForm(@InterfaceC37289t("usState") String str, @InterfaceC37289t("appointmentId") String str2, InterfaceC30057d<? super VideoSchedulingFormResponse> interfaceC30057d);

    @InterfaceC37284o("clinician-in-the-loop-service/v1/scheduling/reschedule")
    Object rescheduleSchedulingForm(@InterfaceC37289t("appointmentId") String str, @InterfaceC37270a SaveVideoSchedulingFormRequest saveVideoSchedulingFormRequest, InterfaceC30057d<? super C9598e> interfaceC30057d);

    @InterfaceC37284o("clinician-in-the-loop-service/v1/scheduling")
    Object saveSchedulingForm(@InterfaceC37289t("appointmentType") String str, @InterfaceC37270a SaveVideoSchedulingFormRequest saveVideoSchedulingFormRequest, InterfaceC30057d<? super C9598e> interfaceC30057d);
}
