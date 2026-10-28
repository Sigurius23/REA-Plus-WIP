package com.whoop.healthconnect.domain;

import com.whoop.healthconnect.domain.models.HealthConnectBodyMeasurementRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectEventsResponse;
import com.whoop.healthconnect.domain.models.HealthConnectExerciseSessionRequestBody;
import com.whoop.healthconnect.domain.models.HealthConnectNutritionRequestBody;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0012\u001a\u00020\u00112\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/healthconnect/domain/HealthConnectApi;", "", "Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;", "body", "Lpg3/v0;", "Ll83/a0;", "sendExerciseSessionRecords", "(Lcom/whoop/healthconnect/domain/models/HealthConnectExerciseSessionRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;", "sendBodyMeasurementRecords", "(Lcom/whoop/healthconnect/domain/models/HealthConnectBodyMeasurementRequestBody;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;", "sendNutritionRecords", "(Lcom/whoop/healthconnect/domain/models/HealthConnectNutritionRequestBody;Lq83/d;)Ljava/lang/Object;", "", "token", "permissionsCsv", "Lcom/whoop/healthconnect/domain/models/HealthConnectEventsResponse;", "fetchWhoopEvents", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "health-connect_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface HealthConnectApi {
    @InterfaceC37275f("candidate-service/v1/googlehealthconnect/events")
    Object fetchWhoopEvents(@InterfaceC37289t("token") String str, @InterfaceC37289t("permissions") String str2, InterfaceC30057d<? super HealthConnectEventsResponse> interfaceC30057d);

    @InterfaceC37284o("candidate-service/v1/googlehealthconnect/body-measurement")
    Object sendBodyMeasurementRecords(@InterfaceC37270a HealthConnectBodyMeasurementRequestBody healthConnectBodyMeasurementRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("candidate-service/v1/googlehealthconnect/exercise-session")
    Object sendExerciseSessionRecords(@InterfaceC37270a HealthConnectExerciseSessionRequestBody healthConnectExerciseSessionRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("candidate-service/v1/googlehealthconnect/nutrition")
    Object sendNutritionRecords(@InterfaceC37270a HealthConnectNutritionRequestBody healthConnectNutritionRequestBody, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);
}
