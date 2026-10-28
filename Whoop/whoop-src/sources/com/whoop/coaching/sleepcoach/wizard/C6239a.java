package com.whoop.coaching.sleepcoach.wizard;

import ih0.AbstractC18489d0;
import kp0.AbstractC22734a;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJB\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/a;", "", "Lkp0/a;", "alarmType", "", "enabled", "isStrapHasLowBattery", "", "nextScheduleDayLabel", "isScheduleEnabled", "<init>", "(Lkp0/a;ZZLjava/lang/String;Z)V", "a", "(Lkp0/a;ZZLjava/lang/String;Z)Lcom/whoop/coaching/sleepcoach/wizard/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkp0/a;", "c", "()Lkp0/a;", "b", "Z", "d", "()Z", "g", "Ljava/lang/String;", "e", "f", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6239a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22734a alarmType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean isStrapHasLowBattery;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final String nextScheduleDayLabel;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean isScheduleEnabled;

    public C6239a(AbstractC22734a alarmType, boolean z4, boolean z13, String nextScheduleDayLabel, boolean z14) {
        AbstractC22676k.m65750j(alarmType, "alarmType");
        AbstractC22676k.m65750j(nextScheduleDayLabel, "nextScheduleDayLabel");
        this.alarmType = alarmType;
        this.enabled = z4;
        this.isStrapHasLowBattery = z13;
        this.nextScheduleDayLabel = nextScheduleDayLabel;
        this.isScheduleEnabled = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C6239a m18614b(C6239a c6239a, AbstractC22734a abstractC22734a, boolean z4, boolean z13, String str, boolean z14, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            abstractC22734a = c6239a.alarmType;
        }
        if ((i13 & 2) != 0) {
            z4 = c6239a.enabled;
        }
        if ((i13 & 4) != 0) {
            z13 = c6239a.isStrapHasLowBattery;
        }
        if ((i13 & 8) != 0) {
            str = c6239a.nextScheduleDayLabel;
        }
        if ((i13 & 16) != 0) {
            z14 = c6239a.isScheduleEnabled;
        }
        boolean z15 = z14;
        boolean z16 = z13;
        return c6239a.m18615a(abstractC22734a, z4, z16, str, z15);
    }

    /* JADX INFO: renamed from: a */
    public final C6239a m18615a(AbstractC22734a alarmType, boolean enabled, boolean isStrapHasLowBattery, String nextScheduleDayLabel, boolean isScheduleEnabled) {
        AbstractC22676k.m65750j(alarmType, "alarmType");
        AbstractC22676k.m65750j(nextScheduleDayLabel, "nextScheduleDayLabel");
        return new C6239a(alarmType, enabled, isStrapHasLowBattery, nextScheduleDayLabel, isScheduleEnabled);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AbstractC22734a getAlarmType() {
        return this.alarmType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNextScheduleDayLabel() {
        return this.nextScheduleDayLabel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6239a)) {
            return false;
        }
        C6239a c6239a = (C6239a) other;
        return AbstractC22676k.m65745e(this.alarmType, c6239a.alarmType) && this.enabled == c6239a.enabled && this.isStrapHasLowBattery == c6239a.isStrapHasLowBattery && AbstractC22676k.m65745e(this.nextScheduleDayLabel, c6239a.nextScheduleDayLabel) && this.isScheduleEnabled == c6239a.isScheduleEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsScheduleEnabled() {
        return this.isScheduleEnabled;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsStrapHasLowBattery() {
        return this.isStrapHasLowBattery;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isScheduleEnabled) + AbstractC11266d.m30450d(AbstractC2875y.m8289b(AbstractC2875y.m8289b(this.alarmType.hashCode() * 31, 31, this.enabled), 31, this.isStrapHasLowBattery), 31, this.nextScheduleDayLabel);
    }

    public String toString() {
        AbstractC22734a abstractC22734a = this.alarmType;
        boolean z4 = this.enabled;
        boolean z13 = this.isStrapHasLowBattery;
        String str = this.nextScheduleDayLabel;
        boolean z14 = this.isScheduleEnabled;
        StringBuilder sb4 = new StringBuilder("CollapsedDataViewState(alarmType=");
        sb4.append(abstractC22734a);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", isStrapHasLowBattery=");
        AbstractC38963t7.m124391u(sb4, z13, ", nextScheduleDayLabel=", str, ", isScheduleEnabled=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    public /* synthetic */ C6239a(AbstractC22734a abstractC22734a, boolean z4, boolean z13, String str, boolean z14, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? C6240b.INSTANCE.m18650b() : abstractC22734a, (i13 & 2) != 0 ? false : z4, (i13 & 4) != 0 ? false : z13, (i13 & 8) != 0 ? "" : str, (i13 & 16) != 0 ? false : z14);
    }
}
