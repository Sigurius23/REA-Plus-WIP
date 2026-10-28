package com.whoop.weightlifting.data.domain;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.service.network.model.UserState;
import hc3.AbstractC17176i;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.DateTimeZone;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0005HÆ\u0003J\t\u00102\u001a\u00020\u0007HÆ\u0003J\t\u00103\u001a\u00020\u0003HÆ\u0003J\t\u00104\u001a\u00020\nHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\t\u00106\u001a\u00020\nHÆ\u0003J\t\u00107\u001a\u00020\nHÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010&J\u0010\u00109\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0002\u0010)J\u000f\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\t\u0010;\u001a\u00020\u0016HÆ\u0003J\u0090\u0001\u0010<\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u0016HÆ\u0001¢\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00162\b\u0010?\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010@\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010A\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010'\u001a\u0004\b%\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\n\n\u0002\u0010*\u001a\u0004\b(\u0010)R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010-R\u0014\u0010.\u001a\u00020\u0003X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001a¨\u0006B"}, m65681d2 = {"Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;", "", "source", "", "dateTimeRange", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "timezone", "Lorg/joda/time/DateTimeZone;", "name", "mskTotalVolumeKg", "", "rawMskStrainScore", "mskIntensityPercent", "scaledMskStrainScore", "workoutTemplateId", "", "rpe", "", "workoutGroups", "", "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;", "isSimpleStrengthLogging", "", "<init>", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V", "getSource", "()Ljava/lang/String;", "getDateTimeRange", "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "getTimezone", "()Lorg/joda/time/DateTimeZone;", "getName", "getMskTotalVolumeKg", "()D", "getRawMskStrainScore", "getMskIntensityPercent", "getScaledMskStrainScore", "getWorkoutTemplateId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRpe", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWorkoutGroups", "()Ljava/util/List;", "()Z", "type", "getType", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;", "equals", "other", "hashCode", "toString", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class WeightliftingWorkout {
    public static final int $stable = 8;
    private final DateTimeRange dateTimeRange;
    private final boolean isSimpleStrengthLogging;
    private final double mskIntensityPercent;
    private final double mskTotalVolumeKg;
    private final String name;
    private final double rawMskStrainScore;
    private final Integer rpe;
    private final double scaledMskStrainScore;
    private final String source;
    private final DateTimeZone timezone;
    private final String type;
    private final List<WeightliftingWorkoutGroup> workoutGroups;
    private final Long workoutTemplateId;

    public WeightliftingWorkout(String source, DateTimeRange dateTimeRange, DateTimeZone timezone, String name, double d3, double d14, double d15, double d16, Long l7, Integer num, List<WeightliftingWorkoutGroup> workoutGroups, boolean z4) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(dateTimeRange, "dateTimeRange");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        this.source = source;
        this.dateTimeRange = dateTimeRange;
        this.timezone = timezone;
        this.name = name;
        this.mskTotalVolumeKg = d3;
        this.rawMskStrainScore = d14;
        this.mskIntensityPercent = d15;
        this.scaledMskStrainScore = d16;
        this.workoutTemplateId = l7;
        this.rpe = num;
        this.workoutGroups = workoutGroups;
        this.isSimpleStrengthLogging = z4;
        this.type = WeightliftingWorkoutKt.WEIGHTLIFTING_WORKOUT_ACTIVITY_TYPE;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getRpe() {
        return this.rpe;
    }

    public final List<WeightliftingWorkoutGroup> component11() {
        return this.workoutGroups;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsSimpleStrengthLogging() {
        return this.isSimpleStrengthLogging;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final DateTimeRange getDateTimeRange() {
        return this.dateTimeRange;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final DateTimeZone getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final double getMskTotalVolumeKg() {
        return this.mskTotalVolumeKg;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getRawMskStrainScore() {
        return this.rawMskStrainScore;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final double getMskIntensityPercent() {
        return this.mskIntensityPercent;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final double getScaledMskStrainScore() {
        return this.scaledMskStrainScore;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public final WeightliftingWorkout copy(String source, DateTimeRange dateTimeRange, DateTimeZone timezone, String name, double mskTotalVolumeKg, double rawMskStrainScore, double mskIntensityPercent, double scaledMskStrainScore, Long workoutTemplateId, Integer rpe, List<WeightliftingWorkoutGroup> workoutGroups, boolean isSimpleStrengthLogging) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(dateTimeRange, "dateTimeRange");
        AbstractC22676k.m65750j(timezone, "timezone");
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(workoutGroups, "workoutGroups");
        return new WeightliftingWorkout(source, dateTimeRange, timezone, name, mskTotalVolumeKg, rawMskStrainScore, mskIntensityPercent, scaledMskStrainScore, workoutTemplateId, rpe, workoutGroups, isSimpleStrengthLogging);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WeightliftingWorkout)) {
            return false;
        }
        WeightliftingWorkout weightliftingWorkout = (WeightliftingWorkout) other;
        return AbstractC22676k.m65745e(this.source, weightliftingWorkout.source) && AbstractC22676k.m65745e(this.dateTimeRange, weightliftingWorkout.dateTimeRange) && AbstractC22676k.m65745e(this.timezone, weightliftingWorkout.timezone) && AbstractC22676k.m65745e(this.name, weightliftingWorkout.name) && Double.compare(this.mskTotalVolumeKg, weightliftingWorkout.mskTotalVolumeKg) == 0 && Double.compare(this.rawMskStrainScore, weightliftingWorkout.rawMskStrainScore) == 0 && Double.compare(this.mskIntensityPercent, weightliftingWorkout.mskIntensityPercent) == 0 && Double.compare(this.scaledMskStrainScore, weightliftingWorkout.scaledMskStrainScore) == 0 && AbstractC22676k.m65745e(this.workoutTemplateId, weightliftingWorkout.workoutTemplateId) && AbstractC22676k.m65745e(this.rpe, weightliftingWorkout.rpe) && AbstractC22676k.m65745e(this.workoutGroups, weightliftingWorkout.workoutGroups) && this.isSimpleStrengthLogging == weightliftingWorkout.isSimpleStrengthLogging;
    }

    public final DateTimeRange getDateTimeRange() {
        return this.dateTimeRange;
    }

    public final double getMskIntensityPercent() {
        return this.mskIntensityPercent;
    }

    public final double getMskTotalVolumeKg() {
        return this.mskTotalVolumeKg;
    }

    public final String getName() {
        return this.name;
    }

    public final double getRawMskStrainScore() {
        return this.rawMskStrainScore;
    }

    public final Integer getRpe() {
        return this.rpe;
    }

    public final double getScaledMskStrainScore() {
        return this.scaledMskStrainScore;
    }

    public final String getSource() {
        return this.source;
    }

    public final DateTimeZone getTimezone() {
        return this.timezone;
    }

    public final String getType() {
        return this.type;
    }

    public final List<WeightliftingWorkoutGroup> getWorkoutGroups() {
        return this.workoutGroups;
    }

    public final Long getWorkoutTemplateId() {
        return this.workoutTemplateId;
    }

    public int hashCode() {
        int iM48499a = AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC11266d.m30450d((this.timezone.hashCode() + ((this.dateTimeRange.hashCode() + (this.source.hashCode() * 31)) * 31)) * 31, 31, this.name), 31, this.mskTotalVolumeKg), 31, this.rawMskStrainScore), 31, this.mskIntensityPercent), 31, this.scaledMskStrainScore);
        Long l7 = this.workoutTemplateId;
        int iHashCode = (iM48499a + (l7 == null ? 0 : l7.hashCode())) * 31;
        Integer num = this.rpe;
        return Boolean.hashCode(this.isSimpleStrengthLogging) + AbstractC11895b.m31983b((iHashCode + (num != null ? num.hashCode() : 0)) * 31, 31, this.workoutGroups);
    }

    public final boolean isSimpleStrengthLogging() {
        return this.isSimpleStrengthLogging;
    }

    public String toString() {
        String str = this.source;
        DateTimeRange dateTimeRange = this.dateTimeRange;
        DateTimeZone dateTimeZone = this.timezone;
        String str2 = this.name;
        double d3 = this.mskTotalVolumeKg;
        double d14 = this.rawMskStrainScore;
        double d15 = this.mskIntensityPercent;
        double d16 = this.scaledMskStrainScore;
        Long l7 = this.workoutTemplateId;
        Integer num = this.rpe;
        List<WeightliftingWorkoutGroup> list = this.workoutGroups;
        boolean z4 = this.isSimpleStrengthLogging;
        StringBuilder sb4 = new StringBuilder("WeightliftingWorkout(source=");
        sb4.append(str);
        sb4.append(", dateTimeRange=");
        sb4.append(dateTimeRange);
        sb4.append(", timezone=");
        sb4.append(dateTimeZone);
        sb4.append(", name=");
        sb4.append(str2);
        sb4.append(", mskTotalVolumeKg=");
        sb4.append(d3);
        AbstractC31061c.m95622B(sb4, ", rawMskStrainScore=", d14, ", mskIntensityPercent=");
        sb4.append(d15);
        AbstractC31061c.m95622B(sb4, ", scaledMskStrainScore=", d16, ", workoutTemplateId=");
        sb4.append(l7);
        sb4.append(", rpe=");
        sb4.append(num);
        sb4.append(", workoutGroups=");
        sb4.append(list);
        sb4.append(", isSimpleStrengthLogging=");
        sb4.append(z4);
        sb4.append(")");
        return sb4.toString();
    }

    public /* synthetic */ WeightliftingWorkout(String str, DateTimeRange dateTimeRange, DateTimeZone dateTimeZone, String str2, double d3, double d14, double d15, double d16, Long l7, Integer num, List list, boolean z4, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? UserState.Sources.USER : str, dateTimeRange, dateTimeZone, str2, d3, d14, d15, d16, l7, (i13 & 512) != 0 ? null : num, list, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? false : z4);
    }
}
