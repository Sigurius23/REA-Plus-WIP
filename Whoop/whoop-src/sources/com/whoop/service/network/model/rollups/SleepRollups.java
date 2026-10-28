package com.whoop.service.network.model.rollups;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0014\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010&\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010'\u001a\u00020\fHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m65681d2 = {"Lcom/whoop/service/network/model/rollups/SleepRollups;", "", "avgSleepPerformanceTrendDelta", "", "avgQualityDuration", "", "avgSleepNeed", "avgSleepPerformance", "maxQualityDuration", "maxSleepNeed", "maxSleepPerformance", "updatedAt", "", "<init>", "(DIIDIIDLjava/lang/String;)V", "getAvgSleepPerformanceTrendDelta", "()D", "getAvgQualityDuration", "()I", "getAvgSleepNeed", "getAvgSleepPerformance", "getMaxQualityDuration", "getMaxSleepNeed", "getMaxSleepPerformance", "getUpdatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SleepRollups {

    @SerializedName("avg_quality_duration")
    private final int avgQualityDuration;

    @SerializedName("avg_sleep_need")
    private final int avgSleepNeed;

    @SerializedName("avg_sleep_performance")
    private final double avgSleepPerformance;

    @SerializedName("avg_sleep_performance_trend_delta")
    private final double avgSleepPerformanceTrendDelta;

    @SerializedName("max_quality_duration")
    private final int maxQualityDuration;

    @SerializedName("max_sleep_need")
    private final int maxSleepNeed;

    @SerializedName("max_sleep_performance")
    private final double maxSleepPerformance;

    @SerializedName("updated_at")
    private final String updatedAt;

    public SleepRollups(double d3, int i13, int i14, double d14, int i15, int i16, double d15, String updatedAt) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.avgSleepPerformanceTrendDelta = d3;
        this.avgQualityDuration = i13;
        this.avgSleepNeed = i14;
        this.avgSleepPerformance = d14;
        this.maxQualityDuration = i15;
        this.maxSleepNeed = i16;
        this.maxSleepPerformance = d15;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ SleepRollups copy$default(SleepRollups sleepRollups, double d3, int i13, int i14, double d14, int i15, int i16, double d15, String str, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            d3 = sleepRollups.avgSleepPerformanceTrendDelta;
        }
        double d16 = d3;
        if ((i17 & 2) != 0) {
            i13 = sleepRollups.avgQualityDuration;
        }
        return sleepRollups.copy(d16, i13, (i17 & 4) != 0 ? sleepRollups.avgSleepNeed : i14, (i17 & 8) != 0 ? sleepRollups.avgSleepPerformance : d14, (i17 & 16) != 0 ? sleepRollups.maxQualityDuration : i15, (i17 & 32) != 0 ? sleepRollups.maxSleepNeed : i16, (i17 & 64) != 0 ? sleepRollups.maxSleepPerformance : d15, (i17 & 128) != 0 ? sleepRollups.updatedAt : str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvgSleepPerformanceTrendDelta() {
        return this.avgSleepPerformanceTrendDelta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAvgQualityDuration() {
        return this.avgQualityDuration;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getAvgSleepNeed() {
        return this.avgSleepNeed;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getAvgSleepPerformance() {
        return this.avgSleepPerformance;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMaxQualityDuration() {
        return this.maxQualityDuration;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMaxSleepNeed() {
        return this.maxSleepNeed;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getMaxSleepPerformance() {
        return this.maxSleepPerformance;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final SleepRollups copy(double avgSleepPerformanceTrendDelta, int avgQualityDuration, int avgSleepNeed, double avgSleepPerformance, int maxQualityDuration, int maxSleepNeed, double maxSleepPerformance, String updatedAt) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new SleepRollups(avgSleepPerformanceTrendDelta, avgQualityDuration, avgSleepNeed, avgSleepPerformance, maxQualityDuration, maxSleepNeed, maxSleepPerformance, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepRollups)) {
            return false;
        }
        SleepRollups sleepRollups = (SleepRollups) other;
        return Double.compare(this.avgSleepPerformanceTrendDelta, sleepRollups.avgSleepPerformanceTrendDelta) == 0 && this.avgQualityDuration == sleepRollups.avgQualityDuration && this.avgSleepNeed == sleepRollups.avgSleepNeed && Double.compare(this.avgSleepPerformance, sleepRollups.avgSleepPerformance) == 0 && this.maxQualityDuration == sleepRollups.maxQualityDuration && this.maxSleepNeed == sleepRollups.maxSleepNeed && Double.compare(this.maxSleepPerformance, sleepRollups.maxSleepPerformance) == 0 && AbstractC22676k.m65745e(this.updatedAt, sleepRollups.updatedAt);
    }

    public final int getAvgQualityDuration() {
        return this.avgQualityDuration;
    }

    public final int getAvgSleepNeed() {
        return this.avgSleepNeed;
    }

    public final double getAvgSleepPerformance() {
        return this.avgSleepPerformance;
    }

    public final double getAvgSleepPerformanceTrendDelta() {
        return this.avgSleepPerformanceTrendDelta;
    }

    public final int getMaxQualityDuration() {
        return this.maxQualityDuration;
    }

    public final int getMaxSleepNeed() {
        return this.maxSleepNeed;
    }

    public final double getMaxSleepPerformance() {
        return this.maxSleepPerformance;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.updatedAt.hashCode() + AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.maxSleepNeed, AbstractC11266d.m30448b(this.maxQualityDuration, AbstractC17176i.m48499a(AbstractC11266d.m30448b(this.avgSleepNeed, AbstractC11266d.m30448b(this.avgQualityDuration, Double.hashCode(this.avgSleepPerformanceTrendDelta) * 31, 31), 31), 31, this.avgSleepPerformance), 31), 31), 31, this.maxSleepPerformance);
    }

    public String toString() {
        return "SleepRollups(avgSleepPerformanceTrendDelta=" + this.avgSleepPerformanceTrendDelta + ", avgQualityDuration=" + this.avgQualityDuration + ", avgSleepNeed=" + this.avgSleepNeed + ", avgSleepPerformance=" + this.avgSleepPerformance + ", maxQualityDuration=" + this.maxQualityDuration + ", maxSleepNeed=" + this.maxSleepNeed + ", maxSleepPerformance=" + this.maxSleepPerformance + ", updatedAt=" + this.updatedAt + ")";
    }
}
