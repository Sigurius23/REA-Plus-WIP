package com.whoop.service.network.model.rollups;

import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0007HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\tHÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m65681d2 = {"Lcom/whoop/service/network/model/rollups/StrainRollups;", "", "avgDayStrainTrendDelta", "", "avgDayStrain", "maxDayStrain", "maxHeartRate", "", "updatedAt", "", "<init>", "(DDDILjava/lang/String;)V", "getAvgDayStrainTrendDelta", "()D", "getAvgDayStrain", "getMaxDayStrain", "getMaxHeartRate", "()I", "getUpdatedAt", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class StrainRollups {

    @SerializedName("avg_day_strain")
    private final double avgDayStrain;

    @SerializedName("avg_day_strain_trend_delta")
    private final double avgDayStrainTrendDelta;

    @SerializedName("max_day_strain")
    private final double maxDayStrain;

    @SerializedName("max_heart_rate")
    private final int maxHeartRate;

    @SerializedName("updated_at")
    private final String updatedAt;

    public StrainRollups(double d3, double d14, double d15, int i13, String updatedAt) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.avgDayStrainTrendDelta = d3;
        this.avgDayStrain = d14;
        this.maxDayStrain = d15;
        this.maxHeartRate = i13;
        this.updatedAt = updatedAt;
    }

    public static /* synthetic */ StrainRollups copy$default(StrainRollups strainRollups, double d3, double d14, double d15, int i13, String str, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            d3 = strainRollups.avgDayStrainTrendDelta;
        }
        double d16 = d3;
        if ((i14 & 2) != 0) {
            d14 = strainRollups.avgDayStrain;
        }
        double d17 = d14;
        if ((i14 & 4) != 0) {
            d15 = strainRollups.maxDayStrain;
        }
        return strainRollups.copy(d16, d17, d15, (i14 & 8) != 0 ? strainRollups.maxHeartRate : i13, (i14 & 16) != 0 ? strainRollups.updatedAt : str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvgDayStrainTrendDelta() {
        return this.avgDayStrainTrendDelta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAvgDayStrain() {
        return this.avgDayStrain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMaxDayStrain() {
        return this.maxDayStrain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final StrainRollups copy(double avgDayStrainTrendDelta, double avgDayStrain, double maxDayStrain, int maxHeartRate, String updatedAt) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new StrainRollups(avgDayStrainTrendDelta, avgDayStrain, maxDayStrain, maxHeartRate, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrainRollups)) {
            return false;
        }
        StrainRollups strainRollups = (StrainRollups) other;
        return Double.compare(this.avgDayStrainTrendDelta, strainRollups.avgDayStrainTrendDelta) == 0 && Double.compare(this.avgDayStrain, strainRollups.avgDayStrain) == 0 && Double.compare(this.maxDayStrain, strainRollups.maxDayStrain) == 0 && this.maxHeartRate == strainRollups.maxHeartRate && AbstractC22676k.m65745e(this.updatedAt, strainRollups.updatedAt);
    }

    public final double getAvgDayStrain() {
        return this.avgDayStrain;
    }

    public final double getAvgDayStrainTrendDelta() {
        return this.avgDayStrainTrendDelta;
    }

    public final double getMaxDayStrain() {
        return this.maxDayStrain;
    }

    public final int getMaxHeartRate() {
        return this.maxHeartRate;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return this.updatedAt.hashCode() + AbstractC11266d.m30448b(this.maxHeartRate, AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.avgDayStrainTrendDelta) * 31, 31, this.avgDayStrain), 31, this.maxDayStrain), 31);
    }

    public String toString() {
        double d3 = this.avgDayStrainTrendDelta;
        double d14 = this.avgDayStrain;
        double d15 = this.maxDayStrain;
        int i13 = this.maxHeartRate;
        String str = this.updatedAt;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("StrainRollups(avgDayStrainTrendDelta=", d3, ", avgDayStrain=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", maxDayStrain=", d15, ", maxHeartRate=");
        return AbstractC38963t7.m124376f(i13, ", updatedAt=", str, ")", sbM8306s);
    }
}
