package com.whoop.weightlifting.data.domain;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutDto;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutExerciseDto;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutGroupDto;
import com.whoop.weightlifting.data.dto.WeightliftingWorkoutSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0002\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0002\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0002\u001a\u00020\u0007*\u00020\b\u001a\n\u0010\u0002\u001a\u00020\t*\u00020\n\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m65681d2 = {"WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE", "", "toDto", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutGroupDto;", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutExerciseDto;", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;", "Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutSetDto;", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WeightliftingWorkoutKt {
    public static final String WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE = "weightlifting_msk";

    public static final WeightliftingWorkoutDto toDto(WeightliftingWorkout weightliftingWorkout) {
        AbstractC22676k.m65750j(weightliftingWorkout, "<this>");
        String during = weightliftingWorkout.getDateTimeRange().getDuring();
        String id4 = weightliftingWorkout.getTimezone().getID();
        AbstractC22676k.m65749i(id4, "getID(...)");
        String name = weightliftingWorkout.getName();
        Float fValueOf = Float.valueOf((float) weightliftingWorkout.getMskTotalVolumeKg());
        float rawMskStrainScore = (float) weightliftingWorkout.getRawMskStrainScore();
        float mskIntensityPercent = (float) weightliftingWorkout.getMskIntensityPercent();
        float scaledMskStrainScore = (float) weightliftingWorkout.getScaledMskStrainScore();
        Long workoutTemplateId = weightliftingWorkout.getWorkoutTemplateId();
        Integer rpe = weightliftingWorkout.getRpe();
        List<WeightliftingWorkoutGroup> workoutGroups = weightliftingWorkout.getWorkoutGroups();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(workoutGroups, 10));
        Iterator<T> it = workoutGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WeightliftingWorkoutGroup) it.next()));
        }
        return new WeightliftingWorkoutDto(null, during, id4, name, fValueOf, rawMskStrainScore, mskIntensityPercent, scaledMskStrainScore, workoutTemplateId, rpe, arrayList, weightliftingWorkout.isSimpleStrengthLogging(), 1, null);
    }

    public static final WeightliftingWorkoutGroupDto toDto(WeightliftingWorkoutGroup weightliftingWorkoutGroup) {
        AbstractC22676k.m65750j(weightliftingWorkoutGroup, "<this>");
        List<WeightliftingWorkoutExercise> workoutExercises = weightliftingWorkoutGroup.getWorkoutExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(workoutExercises, 10));
        Iterator<T> it = workoutExercises.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WeightliftingWorkoutExercise) it.next()));
        }
        return new WeightliftingWorkoutGroupDto(arrayList);
    }

    public static final WeightliftingWorkoutExerciseDto toDto(WeightliftingWorkoutExercise weightliftingWorkoutExercise) {
        AbstractC22676k.m65750j(weightliftingWorkoutExercise, "<this>");
        WeightliftingExerciseDto dto = WeightliftingExerciseKt.toDto(weightliftingWorkoutExercise.getExerciseDetails());
        List<WeightliftingWorkoutSet> sets = weightliftingWorkoutExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WeightliftingWorkoutSet) it.next()));
        }
        return new WeightliftingWorkoutExerciseDto(arrayList, dto);
    }

    public static final WeightliftingWorkoutSetDto toDto(WeightliftingWorkoutSet weightliftingWorkoutSet) {
        AbstractC22676k.m65750j(weightliftingWorkoutSet, "<this>");
        Integer numberOfReps = weightliftingWorkoutSet.getNumberOfReps();
        Integer timeInSeconds = weightliftingWorkoutSet.getTimeInSeconds();
        Float weight = weightliftingWorkoutSet.getWeight();
        UUID id4 = weightliftingWorkoutSet.getId();
        boolean zIsExerciseTrackable = weightliftingWorkoutSet.isExerciseTrackable();
        DateTimeRange dateTimeRange = weightliftingWorkoutSet.getDateTimeRange();
        String during = dateTimeRange != null ? dateTimeRange.getDuring() : null;
        StrapLocation strapLocation = weightliftingWorkoutSet.getStrapLocation();
        String serializedValue = strapLocation != null ? strapLocation.getSerializedValue() : null;
        StrapLaterality strapLaterality = weightliftingWorkoutSet.getStrapLaterality();
        return new WeightliftingWorkoutSetDto(numberOfReps, timeInSeconds, weight, id4, zIsExerciseTrackable, during, serializedValue, strapLaterality != null ? strapLaterality.getSerializedValue() : null);
    }
}
