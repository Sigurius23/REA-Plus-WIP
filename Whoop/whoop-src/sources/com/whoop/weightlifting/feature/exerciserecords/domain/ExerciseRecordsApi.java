package com.whoop.weightlifting.feature.exerciserecords.domain;

import com.whoop.weightlifting.feature.exerciserecords.domain.models.ExerciseRecordsResponse;
import live.hms.video.utils.HMSFieldTrials;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/exerciserecords/domain/ExerciseRecordsApi;", "", "", "path", "startDate", "Lpg3/v0;", "Lcom/whoop/weightlifting/feature/exerciserecords/domain/models/ExerciseRecordsResponse;", "getExerciseRecords", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface ExerciseRecordsApi {

    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ Object getExerciseRecords$default(ExerciseRecordsApi exerciseRecordsApi, String str, String str2, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getExerciseRecords");
        }
        if ((i13 & 2) != 0) {
            str2 = null;
        }
        return exerciseRecordsApi.getExerciseRecords(str, str2, interfaceC30057d);
    }

    @InterfaceC37275f("{path}")
    Object getExerciseRecords(@InterfaceC37288s(encoded = HMSFieldTrials.DisableVideoAutoSubscribe, value = "path") String str, @InterfaceC37289t("startDate") String str2, InterfaceC30057d<? super C29218v0<ExerciseRecordsResponse>> interfaceC30057d);
}
