package com.whoop.data.local.room.entity;

import com.whoop.domain.model.StrainRecoveryMapping;
import hc3.AbstractC17176i;
import p715kotlin.Metadata;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\tHÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010 \u001a\u00020!HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\""}, m65681d2 = {"Lcom/whoop/data/local/room/entity/OptimalStrainMapping;", "", "recovery", "", "lowerOptimalStrain", "", "optimalStrain", "upperOptimalStrain", "cycleId", "", "<init>", "(IDDDJ)V", "getRecovery", "()I", "getLowerOptimalStrain", "()D", "getOptimalStrain", "getUpperOptimalStrain", "getCycleId", "()J", "toStrainRecoveryMapping", "Lcom/whoop/domain/model/StrainRecoveryMapping;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class OptimalStrainMapping {
    private final long cycleId;
    private final double lowerOptimalStrain;
    private final double optimalStrain;
    private final int recovery;
    private final double upperOptimalStrain;

    public OptimalStrainMapping(int i13, double d3, double d14, double d15, long j7) {
        this.recovery = i13;
        this.lowerOptimalStrain = d3;
        this.optimalStrain = d14;
        this.upperOptimalStrain = d15;
        this.cycleId = j7;
    }

    public static /* synthetic */ OptimalStrainMapping copy$default(OptimalStrainMapping optimalStrainMapping, int i13, double d3, double d14, double d15, long j7, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i13 = optimalStrainMapping.recovery;
        }
        if ((i14 & 2) != 0) {
            d3 = optimalStrainMapping.lowerOptimalStrain;
        }
        if ((i14 & 4) != 0) {
            d14 = optimalStrainMapping.optimalStrain;
        }
        if ((i14 & 8) != 0) {
            d15 = optimalStrainMapping.upperOptimalStrain;
        }
        if ((i14 & 16) != 0) {
            j7 = optimalStrainMapping.cycleId;
        }
        long j13 = j7;
        double d16 = d15;
        return optimalStrainMapping.copy(i13, d3, d14, d16, j13);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getRecovery() {
        return this.recovery;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getOptimalStrain() {
        return this.optimalStrain;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getCycleId() {
        return this.cycleId;
    }

    public final OptimalStrainMapping copy(int recovery, double lowerOptimalStrain, double optimalStrain, double upperOptimalStrain, long cycleId) {
        return new OptimalStrainMapping(recovery, lowerOptimalStrain, optimalStrain, upperOptimalStrain, cycleId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptimalStrainMapping)) {
            return false;
        }
        OptimalStrainMapping optimalStrainMapping = (OptimalStrainMapping) other;
        return this.recovery == optimalStrainMapping.recovery && Double.compare(this.lowerOptimalStrain, optimalStrainMapping.lowerOptimalStrain) == 0 && Double.compare(this.optimalStrain, optimalStrainMapping.optimalStrain) == 0 && Double.compare(this.upperOptimalStrain, optimalStrainMapping.upperOptimalStrain) == 0 && this.cycleId == optimalStrainMapping.cycleId;
    }

    public final long getCycleId() {
        return this.cycleId;
    }

    public final double getLowerOptimalStrain() {
        return this.lowerOptimalStrain;
    }

    public final double getOptimalStrain() {
        return this.optimalStrain;
    }

    public final int getRecovery() {
        return this.recovery;
    }

    public final double getUpperOptimalStrain() {
        return this.upperOptimalStrain;
    }

    public int hashCode() {
        return Long.hashCode(this.cycleId) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Integer.hashCode(this.recovery) * 31, 31, this.lowerOptimalStrain), 31, this.optimalStrain), 31, this.upperOptimalStrain);
    }

    public final StrainRecoveryMapping toStrainRecoveryMapping() {
        return new StrainRecoveryMapping(this.recovery, this.lowerOptimalStrain, this.optimalStrain, this.upperOptimalStrain);
    }

    public String toString() {
        int i13 = this.recovery;
        double d3 = this.lowerOptimalStrain;
        double d14 = this.optimalStrain;
        double d15 = this.upperOptimalStrain;
        long j7 = this.cycleId;
        StringBuilder sb4 = new StringBuilder("OptimalStrainMapping(recovery=");
        sb4.append(i13);
        sb4.append(", lowerOptimalStrain=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", optimalStrain=", d14, ", upperOptimalStrain=");
        sb4.append(d15);
        sb4.append(", cycleId=");
        sb4.append(j7);
        sb4.append(")");
        return sb4.toString();
    }
}
