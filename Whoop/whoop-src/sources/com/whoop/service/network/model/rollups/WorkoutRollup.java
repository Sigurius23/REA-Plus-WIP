package com.whoop.service.network.model.rollups;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020 HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006!"}, m65681d2 = {"Lcom/whoop/service/network/model/rollups/WorkoutRollup;", "", "avgStrainTrendDelta", "", "workoutCountTrendDelta", "avgStrainScore", "maxStrainScore", "sportId", "", "workoutCount", "<init>", "(DDDDII)V", "getAvgStrainTrendDelta", "()D", "getWorkoutCountTrendDelta", "getAvgStrainScore", "getMaxStrainScore", "getSportId", "()I", "getWorkoutCount", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WorkoutRollup {

    @SerializedName("avg_strain_score")
    private final double avgStrainScore;

    @SerializedName("avg_strain_trend_delta")
    private final double avgStrainTrendDelta;

    @SerializedName("max_strain_score")
    private final double maxStrainScore;

    @SerializedName("sport_id")
    private final int sportId;

    @SerializedName("workout_count")
    private final int workoutCount;

    @SerializedName("workout_count_trend_delta")
    private final double workoutCountTrendDelta;

    public WorkoutRollup(double d3, double d14, double d15, double d16, int i13, int i14) {
        this.avgStrainTrendDelta = d3;
        this.workoutCountTrendDelta = d14;
        this.avgStrainScore = d15;
        this.maxStrainScore = d16;
        this.sportId = i13;
        this.workoutCount = i14;
    }

    public static /* synthetic */ WorkoutRollup copy$default(WorkoutRollup workoutRollup, double d3, double d14, double d15, double d16, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            d3 = workoutRollup.avgStrainTrendDelta;
        }
        double d17 = d3;
        if ((i15 & 2) != 0) {
            d14 = workoutRollup.workoutCountTrendDelta;
        }
        return workoutRollup.copy(d17, d14, (i15 & 4) != 0 ? workoutRollup.avgStrainScore : d15, (i15 & 8) != 0 ? workoutRollup.maxStrainScore : d16, (i15 & 16) != 0 ? workoutRollup.sportId : i13, (i15 & 32) != 0 ? workoutRollup.workoutCount : i14);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvgStrainTrendDelta() {
        return this.avgStrainTrendDelta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getWorkoutCountTrendDelta() {
        return this.workoutCountTrendDelta;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getAvgStrainScore() {
        return this.avgStrainScore;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMaxStrainScore() {
        return this.maxStrainScore;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSportId() {
        return this.sportId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWorkoutCount() {
        return this.workoutCount;
    }

    public final WorkoutRollup copy(double avgStrainTrendDelta, double workoutCountTrendDelta, double avgStrainScore, double maxStrainScore, int sportId, int workoutCount) {
        return new WorkoutRollup(avgStrainTrendDelta, workoutCountTrendDelta, avgStrainScore, maxStrainScore, sportId, workoutCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WorkoutRollup)) {
            return false;
        }
        WorkoutRollup workoutRollup = (WorkoutRollup) other;
        return Double.compare(this.avgStrainTrendDelta, workoutRollup.avgStrainTrendDelta) == 0 && Double.compare(this.workoutCountTrendDelta, workoutRollup.workoutCountTrendDelta) == 0 && Double.compare(this.avgStrainScore, workoutRollup.avgStrainScore) == 0 && Double.compare(this.maxStrainScore, workoutRollup.maxStrainScore) == 0 && this.sportId == workoutRollup.sportId && this.workoutCount == workoutRollup.workoutCount;
    }

    public final double getAvgStrainScore() {
        return this.avgStrainScore;
    }

    public final double getAvgStrainTrendDelta() {
        return this.avgStrainTrendDelta;
    }

    public final double getMaxStrainScore() {
        return this.maxStrainScore;
    }

    public final int getSportId() {
        return this.sportId;
    }

    public final int getWorkoutCount() {
        return this.workoutCount;
    }

    public final double getWorkoutCountTrendDelta() {
        return this.workoutCountTrendDelta;
    }

    public int hashCode() {
        return Integer.hashCode(this.workoutCount) + AbstractC11266d.m30448b(this.sportId, AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.avgStrainTrendDelta) * 31, 31, this.workoutCountTrendDelta), 31, this.avgStrainScore), 31, this.maxStrainScore), 31);
    }

    public String toString() {
        double d3 = this.avgStrainTrendDelta;
        double d14 = this.workoutCountTrendDelta;
        double d15 = this.avgStrainScore;
        double d16 = this.maxStrainScore;
        int i13 = this.sportId;
        int i14 = this.workoutCount;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("WorkoutRollup(avgStrainTrendDelta=", d3, ", workoutCountTrendDelta=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", avgStrainScore=", d15, ", maxStrainScore=");
        sbM8306s.append(d16);
        sbM8306s.append(", sportId=");
        sbM8306s.append(i13);
        sbM8306s.append(", workoutCount=");
        sbM8306s.append(i14);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }
}
