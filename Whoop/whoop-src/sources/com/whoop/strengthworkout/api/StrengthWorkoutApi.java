package com.whoop.strengthworkout.api;

import com.whoop.strengthworkout.domain.models.StrengthWorkoutCustomExerciseBody;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExerciseHistoryResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExerciseResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutExercisesResponse;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveBody;
import com.whoop.strengthworkout.domain.models.StrengthWorkoutSaveResponse;
import java.util.Map;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37290u;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J&\u0010\u0006\u001a\u00020\u00052\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\f\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\u000e\u0010\u000bJ\u001a\u0010\u0011\u001a\u00020\t2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0001\u0010\b\u001a\u00020\u0003H§@¢\u0006\u0004\b\u0015\u0010\u000bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\b\u0001\u0010\u0010\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, m65681d2 = {"Lcom/whoop/strengthworkout/api/StrengthWorkoutApi;", "", "", "", "query", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExercisesResponse;", "getExercises", "(Ljava/util/Map;Lq83/d;)Ljava/lang/Object;", "exerciseId", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseResponse;", "getExercise", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "getSuggestedExercises", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutExerciseHistoryResponse;", "getExerciseHistory", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;", "body", "createCustomExercise", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutCustomExerciseBody;Lq83/d;)Ljava/lang/Object;", "Lpg3/v0;", "Ll83/a0;", "deleteCustomExercise", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;", "Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveResponse;", "saveWorkout", "(Lcom/whoop/strengthworkout/domain/models/StrengthWorkoutSaveBody;Lq83/d;)Ljava/lang/Object;", "strength-workout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface StrengthWorkoutApi {
    @InterfaceC37284o("core-details-bff/v1/just-lift/custom-exercises")
    Object createCustomExercise(@InterfaceC37270a StrengthWorkoutCustomExerciseBody strengthWorkoutCustomExerciseBody, InterfaceC30057d<? super StrengthWorkoutExerciseResponse> interfaceC30057d);

    @InterfaceC37271b("core-details-bff/v1/just-lift/custom-exercises/{exerciseId}")
    Object deleteCustomExercise(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/just-lift/exercises/{exerciseId}")
    Object getExercise(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super StrengthWorkoutExerciseResponse> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/just-lift/exercises/{exerciseId}/history")
    Object getExerciseHistory(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super StrengthWorkoutExerciseHistoryResponse> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/just-lift/exercises")
    Object getExercises(@InterfaceC37290u Map<String, String> map, InterfaceC30057d<? super StrengthWorkoutExercisesResponse> interfaceC30057d);

    @InterfaceC37275f("core-details-bff/v1/just-lift/exercises/{exerciseId}/suggested")
    Object getSuggestedExercises(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super StrengthWorkoutExercisesResponse> interfaceC30057d);

    @InterfaceC37284o("core-details-bff/v1/just-lift/workouts")
    Object saveWorkout(@InterfaceC37270a StrengthWorkoutSaveBody strengthWorkoutSaveBody, InterfaceC30057d<? super StrengthWorkoutSaveResponse> interfaceC30057d);
}
