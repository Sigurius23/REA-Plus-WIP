package com.whoop.stress.domain;

import com.whoop.design.models.items.graph.StressGraphingCardModel;
import com.whoop.educationModels.FeatureEducationDto;
import com.whoop.stress.domain.model.StressCalendar;
import com.whoop.stress.domain.model.StressIntervention;
import com.whoop.stress.domain.model.StressMonitorDto;
import com.whoop.stress.domain.model.StressSession;
import l83.C23454a0;
import p715kotlin.Metadata;
import q83.InterfaceC30057d;
import ud3.AbstractC34846v0;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37278i;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0006J$\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000bJj\u0010\u0016\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u00022\b\b\u0001\u0010\r\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u00022\b\b\u0001\u0010\u0011\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\u00102\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020\u0014H§@¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0006J\u0010\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\b\u0001\u0010\u0015\u001a\u00020\u001eH§@¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u00192\b\b\u0001\u0010\u0018\u001a\u00020\u0002H§@¢\u0006\u0004\b\"\u0010\u0006J$\u0010&\u001a\u00020%2\b\b\u0001\u0010#\u001a\u00020\u00022\b\b\u0001\u0010\u0015\u001a\u00020$H§@¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(H§@¢\u0006\u0004\b)\u0010\u001d¨\u0006*À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/stress/domain/StressMonitorApi;", "", "", "dateRequested", "Lcom/whoop/stress/domain/model/StressCalendar;", "getStressCalendar", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "timestamp", "Lcom/whoop/stress/domain/model/StressMonitorDto;", "getStressMonitor", "getStressMonitorOnSpecificDate", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "strapId", "hardwareVersion", "firmwareVersion", "sigProcVersion", "", "binaryVersion", "binaryFlags", "contentLength", "Lud3/v0;", "body", "updateStressMonitor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Lud3/v0;Lq83/d;)Ljava/lang/Object;", "interventionType", "Lcom/whoop/stress/domain/model/StressSession;", "getStressIntervention", "Lcom/whoop/design/models/items/graph/StressGraphingCardModel;", "getCoachingLandingStressGraph", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/stress/domain/StressInterventionSessionData;", "Ll83/a0;", "submitSession", "(Lcom/whoop/stress/domain/StressInterventionSessionData;Lq83/d;)Ljava/lang/Object;", "getStressInterventionFullRelease", "intervention", "Lcom/whoop/stress/domain/SessionCustomizationData;", "Lcom/whoop/stress/domain/model/StressIntervention;", "getCustomizedIntervention", "(Ljava/lang/String;Lcom/whoop/stress/domain/SessionCustomizationData;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/educationModels/FeatureEducationDto;", "getStressEducation", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StressMonitorApi {
    @InterfaceC37275f("/health-service/v2/stress-bff/coaching-entry-point")
    Object getCoachingLandingStressGraph(InterfaceC30057d<? super StressGraphingCardModel> interfaceC30057d);

    @InterfaceC37285p("/health-service/v3/intervention/{intervention}/settings/bff")
    Object getCustomizedIntervention(@InterfaceC37288s("intervention") String str, @InterfaceC37270a SessionCustomizationData sessionCustomizationData, InterfaceC30057d<? super StressIntervention> interfaceC30057d);

    @InterfaceC37275f("/health-service/v2/stress-bff/{date_requested}/calendar")
    Object getStressCalendar(@InterfaceC37288s("date_requested") String str, InterfaceC30057d<? super StressCalendar> interfaceC30057d);

    @InterfaceC37275f("onboarding-service/v1/features/educations/STRESS_MONITOR ")
    Object getStressEducation(InterfaceC30057d<? super FeatureEducationDto> interfaceC30057d);

    @InterfaceC37275f("/health-service/v2/stress/intervention/{type}/bff")
    Object getStressIntervention(@InterfaceC37288s("type") String str, InterfaceC30057d<? super StressSession> interfaceC30057d);

    @InterfaceC37275f("/health-service/v3/intervention/{type}/bff")
    Object getStressInterventionFullRelease(@InterfaceC37288s("type") String str, InterfaceC30057d<? super StressSession> interfaceC30057d);

    @InterfaceC37275f("/health-service/v2/stress-bff")
    Object getStressMonitor(@InterfaceC37289t("timestamp") String str, InterfaceC30057d<? super StressMonitorDto> interfaceC30057d);

    @InterfaceC37275f("/health-service/v2/stress-bff/{date_requested}")
    Object getStressMonitorOnSpecificDate(@InterfaceC37288s("date_requested") String str, @InterfaceC37289t("timestamp") String str2, InterfaceC30057d<? super StressMonitorDto> interfaceC30057d);

    @InterfaceC37284o("/recovery-activities-service/v2/activity")
    Object submitSession(@InterfaceC37270a StressInterventionSessionData stressInterventionSessionData, InterfaceC30057d<? super C23454a0> interfaceC30057d);

    @InterfaceC37284o("/health-service/v2/stress-bff")
    Object updateStressMonitor(@InterfaceC37289t("timestamp") String str, @InterfaceC37278i("X-WHOOP-Strap-Id") String str2, @InterfaceC37278i("X-WHOOP-HW-Version") String str3, @InterfaceC37278i("X-WHOOP-FW-Version") String str4, @InterfaceC37278i("X-WHOOP-DSP-Version") String str5, @InterfaceC37278i("X-WHOOP-Binary-Version") int i13, @InterfaceC37278i("X-WHOOP-Binary-Flags") int i14, @InterfaceC37278i("Content-Length") String str6, @InterfaceC37270a AbstractC34846v0 abstractC34846v0, InterfaceC30057d<? super StressMonitorDto> interfaceC30057d);
}
