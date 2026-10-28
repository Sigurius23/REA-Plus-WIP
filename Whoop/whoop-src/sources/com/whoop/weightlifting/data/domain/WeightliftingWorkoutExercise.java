package com.whoop.weightlifting.data.domain;

import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutExercise;", "", "sets", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", "exerciseDetails", "Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "<init>", "(Ljava/util/List;Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;)V", "getSets", "()Ljava/util/List;", "getExerciseDetails", "()Lcom/whoop/weightlifting/data/domain/WeightliftingExercise;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WeightliftingWorkoutExercise {
    public static final int $stable = 8;
    private final WeightliftingExercise exerciseDetails;
    private final List<WeightliftingWorkoutSet> sets;

    public WeightliftingWorkoutExercise(List<WeightliftingWorkoutSet> sets, WeightliftingExercise exerciseDetails) {
        AbstractC22676k.m65750j(sets, "sets");
        AbstractC22676k.m65750j(exerciseDetails, "exerciseDetails");
        this.sets = sets;
        this.exerciseDetails = exerciseDetails;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ WeightliftingWorkoutExercise copy$default(WeightliftingWorkoutExercise weightliftingWorkoutExercise, List list, WeightliftingExercise weightliftingExercise, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            list = weightliftingWorkoutExercise.sets;
        }
        if ((i13 & 2) != 0) {
            weightliftingExercise = weightliftingWorkoutExercise.exerciseDetails;
        }
        return weightliftingWorkoutExercise.copy(list, weightliftingExercise);
    }

    public final List<WeightliftingWorkoutSet> component1() {
        return this.sets;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final WeightliftingExercise getExerciseDetails() {
        return this.exerciseDetails;
    }

    public final WeightliftingWorkoutExercise copy(List<WeightliftingWorkoutSet> sets, WeightliftingExercise exerciseDetails) {
        AbstractC22676k.m65750j(sets, "sets");
        AbstractC22676k.m65750j(exerciseDetails, "exerciseDetails");
        return new WeightliftingWorkoutExercise(sets, exerciseDetails);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingWorkoutExercise)) {
            return false;
        }
        WeightliftingWorkoutExercise weightliftingWorkoutExercise = (WeightliftingWorkoutExercise) other;
        return AbstractC22676k.m65745e(this.sets, weightliftingWorkoutExercise.sets) && AbstractC22676k.m65745e(this.exerciseDetails, weightliftingWorkoutExercise.exerciseDetails);
    }

    public final WeightliftingExercise getExerciseDetails() {
        return this.exerciseDetails;
    }

    public final List<WeightliftingWorkoutSet> getSets() {
        return this.sets;
    }

    public int hashCode() {
        return this.exerciseDetails.hashCode() + (this.sets.hashCode() * 31);
    }

    public String toString() {
        return "WeightliftingWorkoutExercise(sets=" + this.sets + ", exerciseDetails=" + this.exerciseDetails + ")";
    }
}
