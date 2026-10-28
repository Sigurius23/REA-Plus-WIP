package com.whoop.coaching.sleepcoach.wizard;

import androidx.annotation.Keep;
import com.whoop.design.util.TextResource;
import kp0.AbstractC22734a;
import kp0.C22744k;
import kp0.C22750q;
import kp0.C22751r;
import no.nordicsemi.android.dfu.DfuBaseService;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b&\u0010'J\u008e\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010+\u001a\u00020*HÖ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b-\u0010\u001dJ\u001a\u0010/\u001a\u00020\u00052\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00101\u001a\u0004\b2\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00101\u001a\u0004\b3\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b5\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b\u0007\u0010\u001aR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b7\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\n\u00104\u001a\u0004\b8\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b\u000b\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00109\u001a\u0004\b:\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010;\u001a\u0004\b<\u0010#R\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b=\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b>\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\b@\u0010'¨\u0006A"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "", "Lkp0/a;", "currentAlarm", "previousAlarm", "", "currentSelectedAlarm", "isAlarmEnabledPreviously", "", "wakeWindowMinutes", "scheduleEnabled", "isSkipStrapCheck", "Lkp0/q;", "weeklyPlan", "Lkp0/r;", "weeklyPlanHoursOfSleep", "disableSchedule", "eligibleForSmartAlarms", "Lkp0/k;", "optimizeSleep", "<init>", "(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)V", "component1", "()Lkp0/a;", "component2", "component3", "()Z", "component4", "component5", "()I", "component6", "component7", "component8", "()Lkp0/q;", "component9", "()Lkp0/r;", "component10", "component11", "component12", "()Lkp0/k;", "copy", "(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "equals", "(Ljava/lang/Object;)Z", "Lkp0/a;", "getCurrentAlarm", "getPreviousAlarm", "Z", "getCurrentSelectedAlarm", "I", "getWakeWindowMinutes", "getScheduleEnabled", "Lkp0/q;", "getWeeklyPlan", "Lkp0/r;", "getWeeklyPlanHoursOfSleep", "getDisableSchedule", "getEligibleForSmartAlarms", "Lkp0/k;", "getOptimizeSleep", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class ConductorViewState {
    public static final int $stable = TextResource.$stable;
    private final AbstractC22734a currentAlarm;
    private final boolean currentSelectedAlarm;
    private final boolean disableSchedule;
    private final boolean eligibleForSmartAlarms;
    private final boolean isAlarmEnabledPreviously;
    private final boolean isSkipStrapCheck;
    private final C22744k optimizeSleep;
    private final AbstractC22734a previousAlarm;
    private final boolean scheduleEnabled;
    private final int wakeWindowMinutes;
    private final C22750q weeklyPlan;
    private final C22751r weeklyPlanHoursOfSleep;

    public ConductorViewState() {
        this(null, null, false, false, 0, false, false, null, null, false, false, null, 4095, null);
    }

    public static /* synthetic */ ConductorViewState copy$default(ConductorViewState conductorViewState, AbstractC22734a abstractC22734a, AbstractC22734a abstractC22734a2, boolean z4, boolean z13, int i13, boolean z14, boolean z15, C22750q c22750q, C22751r c22751r, boolean z16, boolean z17, C22744k c22744k, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            abstractC22734a = conductorViewState.currentAlarm;
        }
        if ((i14 & 2) != 0) {
            abstractC22734a2 = conductorViewState.previousAlarm;
        }
        if ((i14 & 4) != 0) {
            z4 = conductorViewState.currentSelectedAlarm;
        }
        if ((i14 & 8) != 0) {
            z13 = conductorViewState.isAlarmEnabledPreviously;
        }
        if ((i14 & 16) != 0) {
            i13 = conductorViewState.wakeWindowMinutes;
        }
        if ((i14 & 32) != 0) {
            z14 = conductorViewState.scheduleEnabled;
        }
        if ((i14 & 64) != 0) {
            z15 = conductorViewState.isSkipStrapCheck;
        }
        if ((i14 & 128) != 0) {
            c22750q = conductorViewState.weeklyPlan;
        }
        if ((i14 & 256) != 0) {
            c22751r = conductorViewState.weeklyPlanHoursOfSleep;
        }
        if ((i14 & 512) != 0) {
            z16 = conductorViewState.disableSchedule;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z17 = conductorViewState.eligibleForSmartAlarms;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0) {
            c22744k = conductorViewState.optimizeSleep;
        }
        boolean z18 = z17;
        C22744k c22744k2 = c22744k;
        C22751r c22751r2 = c22751r;
        boolean z19 = z16;
        boolean z24 = z15;
        C22750q c22750q2 = c22750q;
        int i15 = i13;
        boolean z25 = z14;
        return conductorViewState.copy(abstractC22734a, abstractC22734a2, z4, z13, i15, z25, z24, c22750q2, c22751r2, z19, z18, c22744k2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AbstractC22734a getCurrentAlarm() {
        return this.currentAlarm;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getDisableSchedule() {
        return this.disableSchedule;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getEligibleForSmartAlarms() {
        return this.eligibleForSmartAlarms;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final C22744k getOptimizeSleep() {
        return this.optimizeSleep;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final AbstractC22734a getPreviousAlarm() {
        return this.previousAlarm;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCurrentSelectedAlarm() {
        return this.currentSelectedAlarm;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAlarmEnabledPreviously() {
        return this.isAlarmEnabledPreviously;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getWakeWindowMinutes() {
        return this.wakeWindowMinutes;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsSkipStrapCheck() {
        return this.isSkipStrapCheck;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final C22750q getWeeklyPlan() {
        return this.weeklyPlan;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final C22751r getWeeklyPlanHoursOfSleep() {
        return this.weeklyPlanHoursOfSleep;
    }

    public final ConductorViewState copy(AbstractC22734a currentAlarm, AbstractC22734a previousAlarm, boolean currentSelectedAlarm, boolean isAlarmEnabledPreviously, int wakeWindowMinutes, boolean scheduleEnabled, boolean isSkipStrapCheck, C22750q weeklyPlan, C22751r weeklyPlanHoursOfSleep, boolean disableSchedule, boolean eligibleForSmartAlarms, C22744k optimizeSleep) {
        AbstractC22676k.m65750j(currentAlarm, "currentAlarm");
        AbstractC22676k.m65750j(previousAlarm, "previousAlarm");
        return new ConductorViewState(currentAlarm, previousAlarm, currentSelectedAlarm, isAlarmEnabledPreviously, wakeWindowMinutes, scheduleEnabled, isSkipStrapCheck, weeklyPlan, weeklyPlanHoursOfSleep, disableSchedule, eligibleForSmartAlarms, optimizeSleep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConductorViewState)) {
            return false;
        }
        ConductorViewState conductorViewState = (ConductorViewState) other;
        return AbstractC22676k.m65745e(this.currentAlarm, conductorViewState.currentAlarm) && AbstractC22676k.m65745e(this.previousAlarm, conductorViewState.previousAlarm) && this.currentSelectedAlarm == conductorViewState.currentSelectedAlarm && this.isAlarmEnabledPreviously == conductorViewState.isAlarmEnabledPreviously && this.wakeWindowMinutes == conductorViewState.wakeWindowMinutes && this.scheduleEnabled == conductorViewState.scheduleEnabled && this.isSkipStrapCheck == conductorViewState.isSkipStrapCheck && AbstractC22676k.m65745e(this.weeklyPlan, conductorViewState.weeklyPlan) && AbstractC22676k.m65745e(this.weeklyPlanHoursOfSleep, conductorViewState.weeklyPlanHoursOfSleep) && this.disableSchedule == conductorViewState.disableSchedule && this.eligibleForSmartAlarms == conductorViewState.eligibleForSmartAlarms && AbstractC22676k.m65745e(this.optimizeSleep, conductorViewState.optimizeSleep);
    }

    public final AbstractC22734a getCurrentAlarm() {
        return this.currentAlarm;
    }

    public final boolean getCurrentSelectedAlarm() {
        return this.currentSelectedAlarm;
    }

    public final boolean getDisableSchedule() {
        return this.disableSchedule;
    }

    public final boolean getEligibleForSmartAlarms() {
        return this.eligibleForSmartAlarms;
    }

    public final C22744k getOptimizeSleep() {
        return this.optimizeSleep;
    }

    public final AbstractC22734a getPreviousAlarm() {
        return this.previousAlarm;
    }

    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    public final int getWakeWindowMinutes() {
        return this.wakeWindowMinutes;
    }

    public final C22750q getWeeklyPlan() {
        return this.weeklyPlan;
    }

    public final C22751r getWeeklyPlanHoursOfSleep() {
        return this.weeklyPlanHoursOfSleep;
    }

    public int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.wakeWindowMinutes, AbstractC2875y.m8289b(AbstractC2875y.m8289b((this.previousAlarm.hashCode() + (this.currentAlarm.hashCode() * 31)) * 31, 31, this.currentSelectedAlarm), 31, this.isAlarmEnabledPreviously), 31), 31, this.scheduleEnabled), 31, this.isSkipStrapCheck);
        C22750q c22750q = this.weeklyPlan;
        int iHashCode = (iM8289b + (c22750q == null ? 0 : c22750q.hashCode())) * 31;
        C22751r c22751r = this.weeklyPlanHoursOfSleep;
        int iM8289b2 = AbstractC2875y.m8289b(AbstractC2875y.m8289b((iHashCode + (c22751r == null ? 0 : c22751r.hashCode())) * 31, 31, this.disableSchedule), 31, this.eligibleForSmartAlarms);
        C22744k c22744k = this.optimizeSleep;
        return iM8289b2 + (c22744k != null ? c22744k.hashCode() : 0);
    }

    public final boolean isAlarmEnabledPreviously() {
        return this.isAlarmEnabledPreviously;
    }

    public final boolean isSkipStrapCheck() {
        return this.isSkipStrapCheck;
    }

    public String toString() {
        AbstractC22734a abstractC22734a = this.currentAlarm;
        AbstractC22734a abstractC22734a2 = this.previousAlarm;
        boolean z4 = this.currentSelectedAlarm;
        boolean z13 = this.isAlarmEnabledPreviously;
        int i13 = this.wakeWindowMinutes;
        boolean z14 = this.scheduleEnabled;
        boolean z15 = this.isSkipStrapCheck;
        C22750q c22750q = this.weeklyPlan;
        C22751r c22751r = this.weeklyPlanHoursOfSleep;
        boolean z16 = this.disableSchedule;
        boolean z17 = this.eligibleForSmartAlarms;
        C22744k c22744k = this.optimizeSleep;
        StringBuilder sb4 = new StringBuilder("ConductorViewState(currentAlarm=");
        sb4.append(abstractC22734a);
        sb4.append(", previousAlarm=");
        sb4.append(abstractC22734a2);
        sb4.append(", currentSelectedAlarm=");
        AbstractC38963t7.m124392v(sb4, z4, ", isAlarmEnabledPreviously=", z13, ", wakeWindowMinutes=");
        AbstractC13673n.m38573t(i13, ", scheduleEnabled=", ", isSkipStrapCheck=", sb4, z14);
        sb4.append(z15);
        sb4.append(", weeklyPlan=");
        sb4.append(c22750q);
        sb4.append(", weeklyPlanHoursOfSleep=");
        sb4.append(c22751r);
        sb4.append(", disableSchedule=");
        sb4.append(z16);
        sb4.append(", eligibleForSmartAlarms=");
        sb4.append(z17);
        sb4.append(", optimizeSleep=");
        sb4.append(c22744k);
        sb4.append(")");
        return sb4.toString();
    }

    public ConductorViewState(AbstractC22734a currentAlarm, AbstractC22734a previousAlarm, boolean z4, boolean z13, int i13, boolean z14, boolean z15, C22750q c22750q, C22751r c22751r, boolean z16, boolean z17, C22744k c22744k) {
        AbstractC22676k.m65750j(currentAlarm, "currentAlarm");
        AbstractC22676k.m65750j(previousAlarm, "previousAlarm");
        this.currentAlarm = currentAlarm;
        this.previousAlarm = previousAlarm;
        this.currentSelectedAlarm = z4;
        this.isAlarmEnabledPreviously = z13;
        this.wakeWindowMinutes = i13;
        this.scheduleEnabled = z14;
        this.isSkipStrapCheck = z15;
        this.weeklyPlan = c22750q;
        this.weeklyPlanHoursOfSleep = c22751r;
        this.disableSchedule = z16;
        this.eligibleForSmartAlarms = z17;
        this.optimizeSleep = c22744k;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ConductorViewState(AbstractC22734a abstractC22734a, AbstractC22734a abstractC22734a2, boolean z4, boolean z13, int i13, boolean z14, boolean z15, C22750q c22750q, C22751r c22751r, boolean z16, boolean z17, C22744k c22744k, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        abstractC22734a = (i14 & 1) != 0 ? C6240b.INSTANCE.m18650b() : abstractC22734a;
        this(abstractC22734a, (i14 & 2) != 0 ? abstractC22734a : abstractC22734a2, (i14 & 4) != 0 ? false : z4, (i14 & 8) != 0 ? false : z13, (i14 & 16) != 0 ? 60 : i13, (i14 & 32) != 0 ? false : z14, (i14 & 64) != 0 ? false : z15, (i14 & 128) != 0 ? null : c22750q, (i14 & 256) != 0 ? null : c22751r, (i14 & 512) != 0 ? false : z16, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 0 ? z17 : false, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? null : c22744k);
    }
}
