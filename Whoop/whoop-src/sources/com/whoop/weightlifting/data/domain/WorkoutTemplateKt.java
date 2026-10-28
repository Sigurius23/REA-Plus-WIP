package com.whoop.weightlifting.data.domain;

import com.whoop.weightlifting.data.dto.WorkoutTemplateDto;
import com.whoop.weightlifting.data.dto.WorkoutTemplateExerciseDto;
import com.whoop.weightlifting.data.dto.WorkoutTemplateGroupDto;
import com.whoop.weightlifting.data.dto.WorkoutTemplateSetDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m83.AbstractC25267u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004\u001a\n\u0010\u0000\u001a\u00020\u0005*\u00020\u0006\u001a\n\u0010\u0000\u001a\u00020\u0007*\u00020\b¨\u0006\t"}, m65681d2 = {"toDto", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateDto;", "Lcom/whoop/weightlifting/data/domain/WorkoutTemplate;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateGroupDto;", "Lcom/whoop/weightlifting/data/domain/WorkoutGroup;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateExerciseDto;", "Lcom/whoop/weightlifting/data/domain/WorkoutExercise;", "Lcom/whoop/weightlifting/data/dto/WorkoutTemplateSetDto;", "Lcom/whoop/weightlifting/data/domain/WorkoutSet;", "weightlifting_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class WorkoutTemplateKt {
    public static final WorkoutTemplateDto toDto(WorkoutTemplate workoutTemplate) {
        AbstractC22676k.m65750j(workoutTemplate, "<this>");
        Long workoutTemplateKey = workoutTemplate.getWorkoutTemplateKey();
        Long parentTemplateKey = workoutTemplate.getParentTemplateKey();
        String name = workoutTemplate.getName();
        List<WorkoutGroup> groups = workoutTemplate.getGroups();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(groups, 10));
        Iterator<T> it = groups.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WorkoutGroup) it.next()));
        }
        return new WorkoutTemplateDto(workoutTemplateKey, parentTemplateKey, name, arrayList, workoutTemplate.getSource());
    }

    public static final WorkoutTemplateGroupDto toDto(WorkoutGroup workoutGroup) {
        AbstractC22676k.m65750j(workoutGroup, "<this>");
        List<WorkoutExercise> exercises = workoutGroup.getExercises();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(exercises, 10));
        Iterator<T> it = exercises.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WorkoutExercise) it.next()));
        }
        return new WorkoutTemplateGroupDto(arrayList, workoutGroup.getId());
    }

    public static final WorkoutTemplateExerciseDto toDto(WorkoutExercise workoutExercise) {
        AbstractC22676k.m65750j(workoutExercise, "<this>");
        List<WorkoutSet> sets = workoutExercise.getSets();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(sets, 10));
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            arrayList.add(toDto((WorkoutSet) it.next()));
        }
        return new WorkoutTemplateExerciseDto(WeightliftingExerciseKt.toDto(workoutExercise.getExercise()), arrayList, workoutExercise.getId());
    }

    public static final WorkoutTemplateSetDto toDto(WorkoutSet workoutSet) {
        AbstractC22676k.m65750j(workoutSet, "<this>");
        return new WorkoutTemplateSetDto(workoutSet.getNumberOfRepsAsInt(), workoutSet.getTimeAsIntSeconds(), workoutSet.getWeightAsFloat(), workoutSet.getId());
    }
}
