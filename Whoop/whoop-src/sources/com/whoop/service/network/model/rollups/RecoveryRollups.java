package com.whoop.service.network.model.rollups;

import androidx.profileinstaller.ProfileVerifier;
import com.google.gson.annotations.SerializedName;
import hc3.AbstractC17176i;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b1\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u00102\u001a\u00020\u0003HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\u0003HÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0014HÆ\u0003J\t\u0010C\u001a\u00020\u0016HÆ\u0003J\t\u0010D\u001a\u00020\u0014HÆ\u0003J\t\u0010E\u001a\u00020\u0014HÆ\u0003JÑ\u0001\u0010F\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u0014HÆ\u0001J\u0014\u0010G\u001a\u00020H2\b\u0010I\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010J\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010K\u001a\u00020\u0016HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0016\u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0016\u0010\r\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0013\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0016\u0010\u0015\u001a\u00020\u00168\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0016\u0010\u0017\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010-R\u0016\u0010\u0018\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010-¨\u0006L"}, m65681d2 = {"Lcom/whoop/service/network/model/rollups/RecoveryRollups;", "", "avgHrvTrendDelta", "", "avgRhrTrendDelta", "medianHrvTrendDelta", "medianRhrTrendDelta", "avgHrv", "avgRhr", "maxHrv", "medianHrv", "medianRhr", "maxRhr", "minHrv", "hrvPercentile25", "hrvPercentile75", "rhrPercentile25", "rhrPercentile75", "minRhr", "recoveryCount", "", "updatedAt", "", "minRecoveryScore", "maxRecoveryScore", "<init>", "(DDDDDDDDDDDDDDDDILjava/lang/String;II)V", "getAvgHrvTrendDelta", "()D", "getAvgRhrTrendDelta", "getMedianHrvTrendDelta", "getMedianRhrTrendDelta", "getAvgHrv", "getAvgRhr", "getMaxHrv", "getMedianHrv", "getMedianRhr", "getMaxRhr", "getMinHrv", "getHrvPercentile25", "getHrvPercentile75", "getRhrPercentile25", "getRhrPercentile75", "getMinRhr", "getRecoveryCount", "()I", "getUpdatedAt", "()Ljava/lang/String;", "getMinRecoveryScore", "getMaxRecoveryScore", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class RecoveryRollups {

    @SerializedName("avg_hrv")
    private final double avgHrv;

    @SerializedName("avg_hrv_trend_delta")
    private final double avgHrvTrendDelta;

    @SerializedName("avg_rhr")
    private final double avgRhr;

    @SerializedName("avg_rhr_trend_delta")
    private final double avgRhrTrendDelta;

    @SerializedName("hrv_twenty_fifth_percentile")
    private final double hrvPercentile25;

    @SerializedName("hrv_seventy_fifth_percentile")
    private final double hrvPercentile75;

    @SerializedName("max_hrv")
    private final double maxHrv;

    @SerializedName("max_recovery_score")
    private final int maxRecoveryScore;

    @SerializedName("max_rhr")
    private final double maxRhr;

    @SerializedName("hrv_median")
    private final double medianHrv;

    @SerializedName("median_hrv_trend_delta")
    private final double medianHrvTrendDelta;

    @SerializedName("rhr_median")
    private final double medianRhr;

    @SerializedName("median_rhr_trend_delta")
    private final double medianRhrTrendDelta;

    @SerializedName("min_hrv")
    private final double minHrv;

    @SerializedName("min_recovery_score")
    private final int minRecoveryScore;

    @SerializedName("min_rhr")
    private final double minRhr;

    @SerializedName("recovery_count")
    private final int recoveryCount;

    @SerializedName("rhr_twenty_fifth_percentile")
    private final double rhrPercentile25;

    @SerializedName("rhr_seventy_fifth_percentile")
    private final double rhrPercentile75;

    @SerializedName("updated_at")
    private final String updatedAt;

    public RecoveryRollups(double d3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, double d29, double d32, double d34, double d35, int i13, String updatedAt, int i14, int i15) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        this.avgHrvTrendDelta = d3;
        this.avgRhrTrendDelta = d14;
        this.medianHrvTrendDelta = d15;
        this.medianRhrTrendDelta = d16;
        this.avgHrv = d17;
        this.avgRhr = d18;
        this.maxHrv = d19;
        this.medianHrv = d24;
        this.medianRhr = d25;
        this.maxRhr = d26;
        this.minHrv = d27;
        this.hrvPercentile25 = d28;
        this.hrvPercentile75 = d29;
        this.rhrPercentile25 = d32;
        this.rhrPercentile75 = d34;
        this.minRhr = d35;
        this.recoveryCount = i13;
        this.updatedAt = updatedAt;
        this.minRecoveryScore = i14;
        this.maxRecoveryScore = i15;
    }

    public static /* synthetic */ RecoveryRollups copy$default(RecoveryRollups recoveryRollups, double d3, double d14, double d15, double d16, double d17, double d18, double d19, double d24, double d25, double d26, double d27, double d28, double d29, double d32, double d34, double d35, int i13, String str, int i14, int i15, int i16, Object obj) {
        int i17;
        String str2;
        double d36 = (i16 & 1) != 0 ? recoveryRollups.avgHrvTrendDelta : d3;
        double d37 = (i16 & 2) != 0 ? recoveryRollups.avgRhrTrendDelta : d14;
        double d38 = (i16 & 4) != 0 ? recoveryRollups.medianHrvTrendDelta : d15;
        double d39 = (i16 & 8) != 0 ? recoveryRollups.medianRhrTrendDelta : d16;
        double d44 = (i16 & 16) != 0 ? recoveryRollups.avgHrv : d17;
        double d45 = (i16 & 32) != 0 ? recoveryRollups.avgRhr : d18;
        double d46 = (i16 & 64) != 0 ? recoveryRollups.maxHrv : d19;
        double d47 = d36;
        double d48 = (i16 & 128) != 0 ? recoveryRollups.medianHrv : d24;
        double d49 = (i16 & 256) != 0 ? recoveryRollups.medianRhr : d25;
        double d54 = (i16 & 512) != 0 ? recoveryRollups.maxRhr : d26;
        double d55 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? recoveryRollups.minHrv : d27;
        double d56 = (i16 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? recoveryRollups.hrvPercentile25 : d28;
        double d57 = (i16 & 4096) != 0 ? recoveryRollups.hrvPercentile75 : d29;
        double d58 = (i16 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? recoveryRollups.rhrPercentile25 : d32;
        double d59 = (i16 & DfuBaseService.ERROR_CONNECTION_MASK) != 0 ? recoveryRollups.rhrPercentile75 : d34;
        double d64 = (i16 & 32768) != 0 ? recoveryRollups.minRhr : d35;
        int i18 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 0 ? recoveryRollups.recoveryCount : i13;
        double d65 = d64;
        String str3 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? recoveryRollups.updatedAt : str;
        int i19 = (i16 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? recoveryRollups.minRecoveryScore : i14;
        if ((i16 & 524288) != 0) {
            str2 = str3;
            i17 = recoveryRollups.maxRecoveryScore;
        } else {
            i17 = i15;
            str2 = str3;
        }
        return recoveryRollups.copy(d47, d37, d38, d39, d44, d45, d46, d48, d49, d54, d55, d56, d57, d58, d59, d65, i18, str2, i19, i17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final double getAvgHrvTrendDelta() {
        return this.avgHrvTrendDelta;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final double getMaxRhr() {
        return this.maxRhr;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final double getMinHrv() {
        return this.minHrv;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final double getHrvPercentile25() {
        return this.hrvPercentile25;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final double getHrvPercentile75() {
        return this.hrvPercentile75;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final double getRhrPercentile25() {
        return this.rhrPercentile25;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final double getRhrPercentile75() {
        return this.rhrPercentile75;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final double getMinRhr() {
        return this.minRhr;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    /* JADX INFO: renamed from: component19, reason: from getter */
    public final int getMinRecoveryScore() {
        return this.minRecoveryScore;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getAvgRhrTrendDelta() {
        return this.avgRhrTrendDelta;
    }

    /* JADX INFO: renamed from: component20, reason: from getter */
    public final int getMaxRecoveryScore() {
        return this.maxRecoveryScore;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getMedianHrvTrendDelta() {
        return this.medianHrvTrendDelta;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getMedianRhrTrendDelta() {
        return this.medianRhrTrendDelta;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getAvgHrv() {
        return this.avgHrv;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getAvgRhr() {
        return this.avgRhr;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getMaxHrv() {
        return this.maxHrv;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getMedianHrv() {
        return this.medianHrv;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final double getMedianRhr() {
        return this.medianRhr;
    }

    public final RecoveryRollups copy(double avgHrvTrendDelta, double avgRhrTrendDelta, double medianHrvTrendDelta, double medianRhrTrendDelta, double avgHrv, double avgRhr, double maxHrv, double medianHrv, double medianRhr, double maxRhr, double minHrv, double hrvPercentile25, double hrvPercentile75, double rhrPercentile25, double rhrPercentile75, double minRhr, int recoveryCount, String updatedAt, int minRecoveryScore, int maxRecoveryScore) {
        AbstractC22676k.m65750j(updatedAt, "updatedAt");
        return new RecoveryRollups(avgHrvTrendDelta, avgRhrTrendDelta, medianHrvTrendDelta, medianRhrTrendDelta, avgHrv, avgRhr, maxHrv, medianHrv, medianRhr, maxRhr, minHrv, hrvPercentile25, hrvPercentile75, rhrPercentile25, rhrPercentile75, minRhr, recoveryCount, updatedAt, minRecoveryScore, maxRecoveryScore);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryRollups)) {
            return false;
        }
        RecoveryRollups recoveryRollups = (RecoveryRollups) other;
        return Double.compare(this.avgHrvTrendDelta, recoveryRollups.avgHrvTrendDelta) == 0 && Double.compare(this.avgRhrTrendDelta, recoveryRollups.avgRhrTrendDelta) == 0 && Double.compare(this.medianHrvTrendDelta, recoveryRollups.medianHrvTrendDelta) == 0 && Double.compare(this.medianRhrTrendDelta, recoveryRollups.medianRhrTrendDelta) == 0 && Double.compare(this.avgHrv, recoveryRollups.avgHrv) == 0 && Double.compare(this.avgRhr, recoveryRollups.avgRhr) == 0 && Double.compare(this.maxHrv, recoveryRollups.maxHrv) == 0 && Double.compare(this.medianHrv, recoveryRollups.medianHrv) == 0 && Double.compare(this.medianRhr, recoveryRollups.medianRhr) == 0 && Double.compare(this.maxRhr, recoveryRollups.maxRhr) == 0 && Double.compare(this.minHrv, recoveryRollups.minHrv) == 0 && Double.compare(this.hrvPercentile25, recoveryRollups.hrvPercentile25) == 0 && Double.compare(this.hrvPercentile75, recoveryRollups.hrvPercentile75) == 0 && Double.compare(this.rhrPercentile25, recoveryRollups.rhrPercentile25) == 0 && Double.compare(this.rhrPercentile75, recoveryRollups.rhrPercentile75) == 0 && Double.compare(this.minRhr, recoveryRollups.minRhr) == 0 && this.recoveryCount == recoveryRollups.recoveryCount && AbstractC22676k.m65745e(this.updatedAt, recoveryRollups.updatedAt) && this.minRecoveryScore == recoveryRollups.minRecoveryScore && this.maxRecoveryScore == recoveryRollups.maxRecoveryScore;
    }

    public final double getAvgHrv() {
        return this.avgHrv;
    }

    public final double getAvgHrvTrendDelta() {
        return this.avgHrvTrendDelta;
    }

    public final double getAvgRhr() {
        return this.avgRhr;
    }

    public final double getAvgRhrTrendDelta() {
        return this.avgRhrTrendDelta;
    }

    public final double getHrvPercentile25() {
        return this.hrvPercentile25;
    }

    public final double getHrvPercentile75() {
        return this.hrvPercentile75;
    }

    public final double getMaxHrv() {
        return this.maxHrv;
    }

    public final int getMaxRecoveryScore() {
        return this.maxRecoveryScore;
    }

    public final double getMaxRhr() {
        return this.maxRhr;
    }

    public final double getMedianHrv() {
        return this.medianHrv;
    }

    public final double getMedianHrvTrendDelta() {
        return this.medianHrvTrendDelta;
    }

    public final double getMedianRhr() {
        return this.medianRhr;
    }

    public final double getMedianRhrTrendDelta() {
        return this.medianRhrTrendDelta;
    }

    public final double getMinHrv() {
        return this.minHrv;
    }

    public final int getMinRecoveryScore() {
        return this.minRecoveryScore;
    }

    public final double getMinRhr() {
        return this.minRhr;
    }

    public final int getRecoveryCount() {
        return this.recoveryCount;
    }

    public final double getRhrPercentile25() {
        return this.rhrPercentile25;
    }

    public final double getRhrPercentile75() {
        return this.rhrPercentile75;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        return Integer.hashCode(this.maxRecoveryScore) + AbstractC11266d.m30448b(this.minRecoveryScore, AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.recoveryCount, AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.avgHrvTrendDelta) * 31, 31, this.avgRhrTrendDelta), 31, this.medianHrvTrendDelta), 31, this.medianRhrTrendDelta), 31, this.avgHrv), 31, this.avgRhr), 31, this.maxHrv), 31, this.medianHrv), 31, this.medianRhr), 31, this.maxRhr), 31, this.minHrv), 31, this.hrvPercentile25), 31, this.hrvPercentile75), 31, this.rhrPercentile25), 31, this.rhrPercentile75), 31, this.minRhr), 31), 31, this.updatedAt), 31);
    }

    public String toString() {
        double d3 = this.avgHrvTrendDelta;
        double d14 = this.avgRhrTrendDelta;
        double d15 = this.medianHrvTrendDelta;
        double d16 = this.medianRhrTrendDelta;
        double d17 = this.avgHrv;
        double d18 = this.avgRhr;
        double d19 = this.maxHrv;
        double d24 = this.medianHrv;
        double d25 = this.medianRhr;
        double d26 = this.maxRhr;
        double d27 = this.minHrv;
        double d28 = this.hrvPercentile25;
        double d29 = this.hrvPercentile75;
        double d32 = this.rhrPercentile25;
        double d34 = this.rhrPercentile75;
        double d35 = this.minRhr;
        int i13 = this.recoveryCount;
        String str = this.updatedAt;
        int i14 = this.minRecoveryScore;
        int i15 = this.maxRecoveryScore;
        StringBuilder sbM8306s = AbstractC2875y.m8306s("RecoveryRollups(avgHrvTrendDelta=", d3, ", avgRhrTrendDelta=");
        sbM8306s.append(d14);
        AbstractC31061c.m95622B(sbM8306s, ", medianHrvTrendDelta=", d15, ", medianRhrTrendDelta=");
        sbM8306s.append(d16);
        AbstractC31061c.m95622B(sbM8306s, ", avgHrv=", d17, ", avgRhr=");
        sbM8306s.append(d18);
        AbstractC31061c.m95622B(sbM8306s, ", maxHrv=", d19, ", medianHrv=");
        sbM8306s.append(d24);
        AbstractC31061c.m95622B(sbM8306s, ", medianRhr=", d25, ", maxRhr=");
        sbM8306s.append(d26);
        AbstractC31061c.m95622B(sbM8306s, ", minHrv=", d27, ", hrvPercentile25=");
        sbM8306s.append(d28);
        AbstractC31061c.m95622B(sbM8306s, ", hrvPercentile75=", d29, ", rhrPercentile25=");
        sbM8306s.append(d32);
        AbstractC31061c.m95622B(sbM8306s, ", rhrPercentile75=", d34, ", minRhr=");
        sbM8306s.append(d35);
        sbM8306s.append(", recoveryCount=");
        sbM8306s.append(i13);
        sbM8306s.append(", updatedAt=");
        sbM8306s.append(str);
        sbM8306s.append(", minRecoveryScore=");
        sbM8306s.append(i14);
        sbM8306s.append(", maxRecoveryScore=");
        sbM8306s.append(i15);
        sbM8306s.append(")");
        return sbM8306s.toString();
    }
}
