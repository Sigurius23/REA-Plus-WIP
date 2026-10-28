package com.whoop.service.network.model.cycles;

import or2.C28221z1;
import p319m4.AbstractC25012a;
import uv0.AbstractC35283c;

/* JADX INFO: loaded from: classes10.dex */
public class SleepActivity extends Activity {
    private transient C28221z1 awakeDurationAfterCalculation;
    protected Integer cyclesCount;
    protected Integer disturbanceCount;
    private transient C28221z1 inBed;
    protected Long inBedDuration;
    private boolean isNap;
    protected Long latencyDuration;
    private transient C28221z1 latencyDurationObj;
    private transient C28221z1 lightDurationAfterCalculation;
    private transient C28221z1 lightSleep;
    protected Long lightSleepDuration;
    private transient C28221z1 noData;
    protected Long noDataDuration;
    private transient C28221z1 quality;
    protected Long qualityDuration;
    private transient C28221z1 remSleep;
    protected Long remSleepDuration;
    private Double respiratoryRate;
    private transient C28221z1 slowWaveSleep;
    protected Long slowWaveSleepDuration;
    private transient C28221z1 wake;
    protected Long wakeDuration;

    public SleepActivity() {
    }

    public C28221z1 getAwakeDurationAfterCalculation() {
        Long l7;
        if (this.awakeDurationAfterCalculation == null && (l7 = this.inBedDuration) != null && this.qualityDuration != null && this.noDataDuration != null) {
            this.awakeDurationAfterCalculation = new C28221z1((l7.longValue() - this.qualityDuration.longValue()) - this.noDataDuration.longValue());
        }
        return this.awakeDurationAfterCalculation;
    }

    public Integer getCyclesCount() {
        return this.cyclesCount;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public int getDisplayNameResource() {
        return isNap() ? AbstractC35283c.f150184a : AbstractC35283c.f150185b;
    }

    public Integer getDisturbanceCount() {
        return this.disturbanceCount;
    }

    public C28221z1 getInBedDuration() {
        Long l7;
        if (this.inBed == null && (l7 = this.inBedDuration) != null) {
            this.inBed = new C28221z1(l7.longValue());
        }
        return this.inBed;
    }

    public C28221z1 getLatencyDuration() {
        Long l7;
        if (this.latencyDurationObj == null && (l7 = this.latencyDuration) != null) {
            this.latencyDurationObj = new C28221z1(l7.longValue());
        }
        return this.latencyDurationObj;
    }

    public C28221z1 getLightDurationAfterCalculation() {
        Long l7;
        if (this.lightDurationAfterCalculation == null && (l7 = this.qualityDuration) != null && this.remSleepDuration != null && this.slowWaveSleepDuration != null) {
            this.lightDurationAfterCalculation = new C28221z1((l7.longValue() - this.remSleepDuration.longValue()) - this.slowWaveSleepDuration.longValue());
        }
        return this.lightDurationAfterCalculation;
    }

    public C28221z1 getLightSleepDuration() {
        Long l7;
        if (this.lightSleep == null && (l7 = this.lightSleepDuration) != null) {
            this.lightSleep = new C28221z1(l7.longValue());
        }
        return this.lightSleep;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public String getNameKey() {
        return this.isNap ? "Nap" : "Sleep";
    }

    public C28221z1 getNoDataDuration() {
        Long l7;
        if (this.noData == null && (l7 = this.noDataDuration) != null) {
            this.noData = new C28221z1(l7.longValue());
        }
        return this.noData;
    }

    public C28221z1 getQualityDuration() {
        Long l7;
        if (this.quality == null && (l7 = this.qualityDuration) != null) {
            this.quality = new C28221z1(l7.longValue());
        }
        return this.quality;
    }

    public C28221z1 getRemSleepDuration() {
        Long l7;
        if (this.remSleep == null && (l7 = this.remSleepDuration) != null) {
            this.remSleep = new C28221z1(l7.longValue());
        }
        return this.remSleep;
    }

    public Double getRespiratoryRate() {
        return this.respiratoryRate;
    }

    public Integer getSleepEfficiency() {
        if (getInBedDuration() == null || getInBedDuration().m85451b() == 0) {
            return null;
        }
        return Integer.valueOf((int) Math.round((getQualityDuration().m85451b() / getInBedDuration().m85451b()) * 100.0d));
    }

    public C28221z1 getSlowWaveSleepDuration() {
        Long l7;
        if (this.slowWaveSleep == null && (l7 = this.slowWaveSleepDuration) != null) {
            this.slowWaveSleep = new C28221z1(l7.longValue());
        }
        return this.slowWaveSleep;
    }

    public C28221z1 getWakeDuration() {
        Long l7;
        if (this.wake == null && (l7 = this.wakeDuration) != null) {
            this.wake = new C28221z1(l7.longValue());
        }
        return this.wake;
    }

    public boolean isNap() {
        return this.isNap;
    }

    @Override // com.whoop.service.network.model.cycles.Activity
    public String toString() {
        StringBuilder sb4 = new StringBuilder("SleepActivity{isNap=");
        sb4.append(this.isNap);
        sb4.append(", qualityDuration=");
        sb4.append(this.qualityDuration);
        sb4.append(", quality=");
        sb4.append(this.quality);
        sb4.append(", inBedDuration=");
        sb4.append(this.inBedDuration);
        sb4.append(", inBed=");
        sb4.append(this.inBed);
        sb4.append(", latencyDuration=");
        sb4.append(this.latencyDuration);
        sb4.append(", latencyDurationObj=");
        sb4.append(this.latencyDurationObj);
        sb4.append(", wakeDuration=");
        sb4.append(this.wakeDuration);
        sb4.append(", wake=");
        sb4.append(this.wake);
        sb4.append(", lightSleepDuration=");
        sb4.append(this.lightSleepDuration);
        sb4.append(", lightSleep=");
        sb4.append(this.lightSleep);
        sb4.append(", slowWaveSleepDuration=");
        sb4.append(this.slowWaveSleepDuration);
        sb4.append(", slowWaveSleep=");
        sb4.append(this.slowWaveSleep);
        sb4.append(", remSleepDuration=");
        sb4.append(this.remSleepDuration);
        sb4.append(", remSleep=");
        sb4.append(this.remSleep);
        sb4.append(", noDataDuration=");
        sb4.append(this.noDataDuration);
        sb4.append(", noData=");
        sb4.append(this.noData);
        sb4.append(", cyclesCount=");
        sb4.append(this.cyclesCount);
        sb4.append(", disturbanceCount=");
        sb4.append(this.disturbanceCount);
        sb4.append(", awakeDurationAfterCalculation=");
        sb4.append(this.awakeDurationAfterCalculation);
        sb4.append(", lightDurationAfterCalculation=");
        sb4.append(this.lightDurationAfterCalculation);
        sb4.append(", respiratoryRate=");
        sb4.append(this.respiratoryRate);
        sb4.append(", super=");
        return AbstractC25012a.m73377j(sb4, super.toString(), '}');
    }

    public SleepActivity(int i13) {
        super(i13);
    }

    public SleepActivity(int i13, String str, double d3, Period period, String str2, boolean z4, Integer num, boolean z13, Long l7, Long l12, Long l13, Long l14, Long l15, Long l16, Long l17, Long l18, Integer num2, Double d14, Integer num3) {
        super(i13, str, d3, period, str2, z4, num);
        this.isNap = z13;
        this.qualityDuration = l7;
        this.inBedDuration = l12;
        this.latencyDuration = l13;
        this.wakeDuration = l14;
        this.lightSleepDuration = l15;
        this.slowWaveSleepDuration = l16;
        this.remSleepDuration = l17;
        this.noDataDuration = l18;
        this.disturbanceCount = num2;
        this.respiratoryRate = d14;
        this.cyclesCount = num3;
    }

    public SleepActivity(boolean z4) {
        this.isNap = z4;
    }
}
