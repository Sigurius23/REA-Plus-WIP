package com.whoop.weightlifting.data;

import com.whoop.weightlifting.data.dto.CustomExerciseDto;
import com.whoop.weightlifting.data.dto.ExerciseData;
import com.whoop.weightlifting.data.dto.ExerciseDetailsModel;
import com.whoop.weightlifting.data.dto.LinkWorkoutModel;
import com.whoop.weightlifting.data.dto.LinkWorkoutRequest;
import com.whoop.weightlifting.data.dto.LinkWorkoutResponse;
import com.whoop.weightlifting.data.dto.ShareableWorkoutLinkResponse;
import com.whoop.weightlifting.data.dto.SharedWorkoutResponse;
import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto;
import com.whoop.weightlifting.data.dto.WorkoutDetailsModel;
import com.whoop.weightlifting.data.dto.WorkoutLibraryModel;
import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import wg3.InterfaceC37270a;
import wg3.InterfaceC37271b;
import wg3.InterfaceC37275f;
import wg3.InterfaceC37284o;
import wg3.InterfaceC37285p;
import wg3.InterfaceC37288s;
import wg3.InterfaceC37289t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\b\u0001\u0010\r\u001a\u00020\u0004H§@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0006J\u001a\u0010\u0014\u001a\u00020\u00132\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0006J\u001a\u0010\u001f\u001a\u00020\u001e2\b\b\u0001\u0010\u001d\u001a\u00020\u0011H§@¢\u0006\u0004\b\u001f\u0010\u0015J \u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\r\u001a\u00020 H§@¢\u0006\u0004\b!\u0010\"J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0#0\tH§@¢\u0006\u0004\b%\u0010&J\u0010\u0010(\u001a\u00020'H§@¢\u0006\u0004\b(\u0010&J\u001a\u0010*\u001a\u00020$2\b\b\u0001\u0010)\u001a\u00020\u0011H§@¢\u0006\u0004\b*\u0010\u0015J\u001a\u0010,\u001a\u00020+2\b\b\u0001\u0010)\u001a\u00020\u0011H§@¢\u0006\u0004\b,\u0010\u0015J\u0010\u0010.\u001a\u00020-H§@¢\u0006\u0004\b.\u0010&J\u001a\u00100\u001a\u00020/2\b\b\u0001\u0010\u0003\u001a\u00020\u0011H§@¢\u0006\u0004\b0\u0010\u0015J\u001a\u00102\u001a\u00020$2\b\b\u0001\u0010\r\u001a\u000201H§@¢\u0006\u0004\b2\u00103J \u00104\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010)\u001a\u00020\u0011H§@¢\u0006\u0004\b4\u0010\u0015¨\u00065À\u0006\u0003"}, m65681d2 = {"Lcom/whoop/weightlifting/data/WeightliftingApi;", "", "", "workoutTemplateId", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "getWorkoutTemplate", "(JLq83/d;)Ljava/lang/Object;", "id", "updatedTemplate", "Lpg3/v0;", "Ll83/a0;", "updateWorkoutTemplate", "(JLcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;", "body", "upsertWorkoutTemplate", "(Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;Lq83/d;)Ljava/lang/Object;", "deleteWorkoutTemplate", "", "activityId", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutModel;", "getLinkWorkoutBFFData", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;", "request", "Lcom/whoop/weightlifting/data/dto/LinkWorkoutResponse;", "linkWorkoutToActivity", "(Lcom/whoop/weightlifting/data/dto/LinkWorkoutRequest;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/dto/ShareableWorkoutLinkResponse;", "createShareableWorkoutLink", "sharedWorkoutId", "Lcom/whoop/weightlifting/data/dto/SharedWorkoutResponse;", "getSharedWorkout", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "saveWeightliftingWorkout", "(Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Lq83/d;)Ljava/lang/Object;", "", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "getExerciseList", "(Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/weightlifting/data/dto/ExerciseData;", "getExerciseListV2", "exerciseId", "getExerciseDetailsById", "Lcom/whoop/weightlifting/data/dto/ExerciseDetailsModel;", "getExerciseDetails", "Lcom/whoop/weightlifting/data/dto/WorkoutLibraryModel;", "getWorkoutLibraryV3", "Lcom/whoop/weightlifting/data/dto/WorkoutDetailsModel;", "getWorkoutDetails", "Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;", "upsertCustomExercise", "(Lcom/whoop/weightlifting/data/dto/CustomExerciseDto;Lq83/d;)Ljava/lang/Object;", "deleteCustomExercise", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public interface WeightliftingApi {
    @InterfaceC37284o("weightlifting-service/v1/share/{workoutTemplateId}")
    Object createShareableWorkoutLink(@InterfaceC37288s("workoutTemplateId") long j7, InterfaceC30057d<? super ShareableWorkoutLinkResponse> interfaceC30057d);

    @InterfaceC37271b("weightlifting-service/v2/custom-exercise/{exerciseId}")
    Object deleteCustomExercise(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37271b("weightlifting-service/v2/workout-template/{workoutTemplateId}")
    Object deleteWorkoutTemplate(@InterfaceC37288s("workoutTemplateId") long j7, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v3/exercise/{exerciseId}")
    Object getExerciseDetails(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super ExerciseDetailsModel> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v1/exercise/{exerciseId}")
    Object getExerciseDetailsById(@InterfaceC37288s("exerciseId") String str, InterfaceC30057d<? super WeightliftingExerciseDto> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v1/exercise")
    Object getExerciseList(InterfaceC30057d<? super C29218v0<List<WeightliftingExerciseDto>>> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v2/exercise")
    Object getExerciseListV2(InterfaceC30057d<? super ExerciseData> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v1/link-workout")
    Object getLinkWorkoutBFFData(@InterfaceC37289t("activityId") String str, InterfaceC30057d<? super LinkWorkoutModel> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v1/share/{sharedWorkoutId}")
    Object getSharedWorkout(@InterfaceC37288s("sharedWorkoutId") String str, InterfaceC30057d<? super SharedWorkoutResponse> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v2/prebuilt-workout-template/{workoutTemplateId}")
    Object getWorkoutDetails(@InterfaceC37288s("workoutTemplateId") String str, InterfaceC30057d<? super WorkoutDetailsModel> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v3/workout-library")
    Object getWorkoutLibraryV3(InterfaceC30057d<? super WorkoutLibraryModel> interfaceC30057d);

    @InterfaceC37275f("weightlifting-service/v2/workout-template/{workoutTemplateKey}")
    Object getWorkoutTemplate(@InterfaceC37288s("workoutTemplateKey") long j7, InterfaceC30057d<? super WorkoutTemplateDto> interfaceC30057d);

    @InterfaceC37284o("weightlifting-service/v2/weightlifting-workout/link-cardio-workout")
    Object linkWorkoutToActivity(@InterfaceC37270a LinkWorkoutRequest linkWorkoutRequest, InterfaceC30057d<? super LinkWorkoutResponse> interfaceC30057d);

    @InterfaceC37284o("weightlifting-service/v2/weightlifting-workout/activity")
    Object saveWeightliftingWorkout(@InterfaceC37270a WeightliftingWorkoutDto weightliftingWorkoutDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37285p("weightlifting-service/v2/workout-template/{workoutTemplateKey}")
    Object updateWorkoutTemplate(@InterfaceC37288s("workoutTemplateKey") long j7, @InterfaceC37270a WorkoutTemplateDto workoutTemplateDto, InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d);

    @InterfaceC37284o("weightlifting-service/v2/custom-exercise")
    Object upsertCustomExercise(@InterfaceC37270a CustomExerciseDto customExerciseDto, InterfaceC30057d<? super WeightliftingExerciseDto> interfaceC30057d);

    @InterfaceC37284o("weightlifting-service/v3/workout-template")
    Object upsertWorkoutTemplate(@InterfaceC37270a WorkoutTemplateDto workoutTemplateDto, InterfaceC30057d<? super WorkoutTemplateDto> interfaceC30057d);
}
