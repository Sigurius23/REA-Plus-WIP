package com.whoop.weightlifting.data.domain;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import te0.AbstractC33745d;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0014\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u000e\u001a\u00020\u000fHÖ\u0081\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;", "", "workoutExercises", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;", "<init>", "(Ljava/util/List;)V", "getWorkoutExercises", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WeightliftingWorkoutGroup {
    public static final int $stable = 8;
    private final List<WeightliftingWorkoutExercise> workoutExercises;

    public WeightliftingWorkoutGroup(List<WeightliftingWorkoutExercise> workoutExercises) {
        AbstractC22676k.m65750j(workoutExercises, "workoutExercises");
        this.workoutExercises = workoutExercises;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightliftingWorkoutGroup copy$default(WeightliftingWorkoutGroup weightliftingWorkoutGroup, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = weightliftingWorkoutGroup.workoutExercises;
        }
        return weightliftingWorkoutGroup.copy(list);
    }

    public final List<WeightliftingWorkoutExercise> component1() {
        return this.workoutExercises;
    }

    public final WeightliftingWorkoutGroup copy(List<WeightliftingWorkoutExercise> workoutExercises) {
        AbstractC22676k.m65750j(workoutExercises, "workoutExercises");
        return new WeightliftingWorkoutGroup(workoutExercises);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof WeightliftingWorkoutGroup) && AbstractC22676k.m65745e(this.workoutExercises, ((WeightliftingWorkoutGroup) other).workoutExercises);
    }

    public final List<WeightliftingWorkoutExercise> getWorkoutExercises() {
        return this.workoutExercises;
    }

    public int hashCode() {
        return this.workoutExercises.hashCode();
    }

    public String toString() {
        return AbstractC33745d.m106654m("WeightliftingWorkoutGroup(workoutExercises=", ")", this.workoutExercises);
    }
}
