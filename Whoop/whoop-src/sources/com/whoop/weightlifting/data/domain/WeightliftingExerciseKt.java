package com.whoop.weightlifting.data.domain;

import com.whoop.weightlifting.data.dto.WeightliftingExerciseDto;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, m65681d2 = {"toDto", "Lcom/whoop/weightlifting/data/dto/WeightliftingExerciseDto;", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WeightliftingExerciseKt {
    public static final WeightliftingExerciseDto toDto(WeightliftingExercise weightliftingExercise) {
        AbstractC22676k.m65750j(weightliftingExercise, "<this>");
        String exerciseId = weightliftingExercise.getExerciseId();
        String name = weightliftingExercise.getName();
        String pushCoreName = weightliftingExercise.getPushCoreName();
        boolean trackable = weightliftingExercise.getTrackable();
        String serializedValue = weightliftingExercise.getEquipment().getSerializedValue();
        String translatedEquipment = weightliftingExercise.getTranslatedEquipment();
        String exerciseType = weightliftingExercise.getExerciseType();
        String serializedValue2 = weightliftingExercise.getLaterality().getSerializedValue();
        String movementPattern = weightliftingExercise.getMovementPattern();
        String translatedMovementPattern = weightliftingExercise.getTranslatedMovementPattern();
        String imageUrl = weightliftingExercise.getImageUrl();
        String videoUrl = weightliftingExercise.getVideoUrl();
        List<String> instructions = weightliftingExercise.getInstructions();
        List<String> trainingTypes = weightliftingExercise.getTrainingTypes();
        List<String> muscleGroups = weightliftingExercise.getMuscleGroups();
        String translatedMuscleGroups = weightliftingExercise.getTranslatedMuscleGroups();
        Boolean boolValueOf = Boolean.valueOf(weightliftingExercise.getDeleted());
        String createdAt = weightliftingExercise.getCreatedAt();
        String updatedAt = weightliftingExercise.getUpdatedAt();
        String serializedValue3 = weightliftingExercise.getVolumeInputFormat().getSerializedValue();
        CustomExerciseInfo customExerciseInfo = weightliftingExercise.getCustomExerciseInfo();
        return new WeightliftingExerciseDto(exerciseId, name, pushCoreName, trackable, serializedValue, translatedEquipment, exerciseType, serializedValue2, movementPattern, translatedMovementPattern, imageUrl, videoUrl, instructions, trainingTypes, muscleGroups, translatedMuscleGroups, boolValueOf, createdAt, updatedAt, serializedValue3, customExerciseInfo != null ? CustomExerciseKt.toDto(customExerciseInfo) : null, (String) null, (String) null, 6291456, (DefaultConstructorMarker) null);
    }
}
