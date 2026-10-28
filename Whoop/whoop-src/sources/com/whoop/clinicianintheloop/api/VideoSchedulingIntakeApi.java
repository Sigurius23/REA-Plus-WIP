package com.whoop.clinicianintheloop.api;

import com.whoop.navigation.C9598e;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u00020\n2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\tH§@¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u000f\u001a\u00020\n2\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u000eH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/clinicianintheloop/api/VideoSchedulingIntakeApi;", "", "", "appointmentType", "Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;", "request", "Lcom/whoop/navigation/e;", "saveVideoSchedulingIntakeOnDemand", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveVideoSchedulingIntakeRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;", "Ll83/a0;", "savePersonalIntake", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SavePersonalIntakeRequest;Lq83/d;)Ljava/lang/Object;", "appointmentId", "Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;", "saveHealthIntake", "(Ljava/lang/String;Lcom/whoop/clinicianintheloop/api/SaveHealthIntakeRequest;Lq83/d;)Ljava/lang/Object;", "clinician-in-the-loop_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface VideoSchedulingIntakeApi {
    @InterfaceC37284o("clinician-in-the-loop-service/v1/health-intake")
    Object saveHealthIntake(@InterfaceC37289t("appointmentId") String str, @InterfaceC37270a SaveHealthIntakeRequest saveHealthIntakeRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37284o("clinician-in-the-loop-service/v1/scheduling/personal-intake")
    Object savePersonalIntake(@InterfaceC37289t("appointmentType") String str, @InterfaceC37270a SavePersonalIntakeRequest savePersonalIntakeRequest, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37284o("clinician-in-the-loop-service/v1/scheduling")
    Object saveVideoSchedulingIntakeOnDemand(@InterfaceC37289t("appointmentType") String str, @InterfaceC37270a SaveVideoSchedulingIntakeRequest saveVideoSchedulingIntakeRequest, InterfaceC30057d<? super C9598e> interfaceC30057d);
}
