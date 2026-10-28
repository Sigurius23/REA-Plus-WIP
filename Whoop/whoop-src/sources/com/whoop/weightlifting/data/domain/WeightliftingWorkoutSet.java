package com.whoop.weightlifting.data.domain;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.util.UUID;
import p031b9.AbstractC2875y;
import p555vl.AbstractC36095b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jl\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001¢\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020\n2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\n\u00100\u001a\u000201HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u00062"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", "", "numberOfReps", "", "timeInSeconds", "weight", "", "id", "Ljava/util/UUID;", "isExerciseTrackable", "", "dateTimeRange", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "strapLocation", "Lcom/whoop/weightlifting/data/domain/StrapLocation;", "strapLaterality", "Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)V", "getNumberOfReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTimeInSeconds", "getWeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getId", "()Ljava/util/UUID;", "()Z", "getDateTimeRange", "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "getStrapLocation", "()Lcom/whoop/weightlifting/data/domain/StrapLocation;", "getStrapLaterality", "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;", "equals", "other", "hashCode", "toString", "", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WeightliftingWorkoutSet {
    public static final int $stable = 8;
    private final DateTimeRange dateTimeRange;
    private final UUID id;
    private final boolean isExerciseTrackable;
    private final Integer numberOfReps;
    private final StrapLaterality strapLaterality;
    private final StrapLocation strapLocation;
    private final Integer timeInSeconds;
    private final Float weight;

    public WeightliftingWorkoutSet(Integer num, Integer num2, Float f13, UUID uuid, boolean z4, DateTimeRange dateTimeRange, StrapLocation strapLocation, StrapLaterality strapLaterality) {
        this.numberOfReps = num;
        this.timeInSeconds = num2;
        this.weight = f13;
        this.id = uuid;
        this.isExerciseTrackable = z4;
        this.dateTimeRange = dateTimeRange;
        this.strapLocation = strapLocation;
        this.strapLaterality = strapLaterality;
    }

    public static /* synthetic */ WeightliftingWorkoutSet copy$default(WeightliftingWorkoutSet weightliftingWorkoutSet, Integer num, Integer num2, Float f13, UUID uuid, boolean z4, DateTimeRange dateTimeRange, StrapLocation strapLocation, StrapLaterality strapLaterality, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            num = weightliftingWorkoutSet.numberOfReps;
        }
        if ((i13 & 2) != 0) {
            num2 = weightliftingWorkoutSet.timeInSeconds;
        }
        if ((i13 & 4) != 0) {
            f13 = weightliftingWorkoutSet.weight;
        }
        if ((i13 & 8) != 0) {
            uuid = weightliftingWorkoutSet.id;
        }
        if ((i13 & 16) != 0) {
            z4 = weightliftingWorkoutSet.isExerciseTrackable;
        }
        if ((i13 & 32) != 0) {
            dateTimeRange = weightliftingWorkoutSet.dateTimeRange;
        }
        if ((i13 & 64) != 0) {
            strapLocation = weightliftingWorkoutSet.strapLocation;
        }
        if ((i13 & 128) != 0) {
            strapLaterality = weightliftingWorkoutSet.strapLaterality;
        }
        StrapLocation strapLocation2 = strapLocation;
        StrapLaterality strapLaterality2 = strapLaterality;
        boolean z13 = z4;
        DateTimeRange dateTimeRange2 = dateTimeRange;
        return weightliftingWorkoutSet.copy(num, num2, f13, uuid, z13, dateTimeRange2, strapLocation2, strapLaterality2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getNumberOfReps() {
        return this.numberOfReps;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Float getWeight() {
        return this.weight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final UUID getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsExerciseTrackable() {
        return this.isExerciseTrackable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final DateTimeRange getDateTimeRange() {
        return this.dateTimeRange;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    public final WeightliftingWorkoutSet copy(Integer numberOfReps, Integer timeInSeconds, Float weight, UUID id4, boolean isExerciseTrackable, DateTimeRange dateTimeRange, StrapLocation strapLocation, StrapLaterality strapLaterality) {
        return new WeightliftingWorkoutSet(numberOfReps, timeInSeconds, weight, id4, isExerciseTrackable, dateTimeRange, strapLocation, strapLaterality);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingWorkoutSet)) {
            return false;
        }
        WeightliftingWorkoutSet weightliftingWorkoutSet = (WeightliftingWorkoutSet) other;
        return AbstractC22676k.m65745e(this.numberOfReps, weightliftingWorkoutSet.numberOfReps) && AbstractC22676k.m65745e(this.timeInSeconds, weightliftingWorkoutSet.timeInSeconds) && AbstractC22676k.m65745e(this.weight, weightliftingWorkoutSet.weight) && AbstractC22676k.m65745e(this.id, weightliftingWorkoutSet.id) && this.isExerciseTrackable == weightliftingWorkoutSet.isExerciseTrackable && AbstractC22676k.m65745e(this.dateTimeRange, weightliftingWorkoutSet.dateTimeRange) && this.strapLocation == weightliftingWorkoutSet.strapLocation && this.strapLaterality == weightliftingWorkoutSet.strapLaterality;
    }

    public final DateTimeRange getDateTimeRange() {
        return this.dateTimeRange;
    }

    public final UUID getId() {
        return this.id;
    }

    public final Integer getNumberOfReps() {
        return this.numberOfReps;
    }

    public final StrapLaterality getStrapLaterality() {
        return this.strapLaterality;
    }

    public final StrapLocation getStrapLocation() {
        return this.strapLocation;
    }

    public final Integer getTimeInSeconds() {
        return this.timeInSeconds;
    }

    public final Float getWeight() {
        return this.weight;
    }

    public int hashCode() {
        Integer num = this.numberOfReps;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.timeInSeconds;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Float f13 = this.weight;
        int iHashCode3 = (iHashCode2 + (f13 == null ? 0 : f13.hashCode())) * 31;
        UUID uuid = this.id;
        int iM8289b = AbstractC2875y.m8289b((iHashCode3 + (uuid == null ? 0 : uuid.hashCode())) * 31, 31, this.isExerciseTrackable);
        DateTimeRange dateTimeRange = this.dateTimeRange;
        int iHashCode4 = (iM8289b + (dateTimeRange == null ? 0 : dateTimeRange.hashCode())) * 31;
        StrapLocation strapLocation = this.strapLocation;
        int iHashCode5 = (iHashCode4 + (strapLocation == null ? 0 : strapLocation.hashCode())) * 31;
        StrapLaterality strapLaterality = this.strapLaterality;
        return iHashCode5 + (strapLaterality != null ? strapLaterality.hashCode() : 0);
    }

    public final boolean isExerciseTrackable() {
        return this.isExerciseTrackable;
    }

    public String toString() {
        Integer num = this.numberOfReps;
        Integer num2 = this.timeInSeconds;
        Float f13 = this.weight;
        UUID uuid = this.id;
        boolean z4 = this.isExerciseTrackable;
        DateTimeRange dateTimeRange = this.dateTimeRange;
        StrapLocation strapLocation = this.strapLocation;
        StrapLaterality strapLaterality = this.strapLaterality;
        StringBuilder sbM114684l = AbstractC36095b.m114684l("WeightliftingWorkoutSet(numberOfReps=", num, ", timeInSeconds=", num2, ", weight=");
        sbM114684l.append(f13);
        sbM114684l.append(", id=");
        sbM114684l.append(uuid);
        sbM114684l.append(", isExerciseTrackable=");
        sbM114684l.append(z4);
        sbM114684l.append(", dateTimeRange=");
        sbM114684l.append(dateTimeRange);
        sbM114684l.append(", strapLocation=");
        sbM114684l.append(strapLocation);
        sbM114684l.append(", strapLaterality=");
        sbM114684l.append(strapLaterality);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }
}
