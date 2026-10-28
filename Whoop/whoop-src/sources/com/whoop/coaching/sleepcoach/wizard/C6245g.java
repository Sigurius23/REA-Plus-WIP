package com.whoop.coaching.sleepcoach.wizard;

import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kp0.AbstractC22734a;
import kp0.C22740g;
import lp0.C24641l;
import no.nordicsemi.android.dfu.DfuBaseService;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.whoop.coaching.sleepcoach.wizard.g */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b(\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u0082\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b+\u00101R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b-\u00103R\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00102\u001a\u0004\b4\u00103R\u0017\u0010\u0012\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b5\u0010'R\u0017\u0010\u0013\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b6\u0010'¨\u00067"}, m65681d2 = {"Lcom/whoop/coaching/sleepcoach/wizard/g;", "", "Lkp0/a;", "alarmType", "", "wakeWindowMinutes", "", "enabled", "Lorg/joda/time/LocalTime;", "wakeTime", "sleepTime", "", "recommendedTimeInBedString", "Lkp0/g;", "optimalSleepCalculation", "Llp0/l;", "optimalTimeInBedWindow", "tonightSleepWindow", "isWakeupTimeImpossible", "isSleepScheduleEnabled", "<init>", "(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)V", "a", "(Lkp0/a;IZLorg/joda/time/LocalTime;Lorg/joda/time/LocalTime;Ljava/lang/String;Lkp0/g;Llp0/l;Llp0/l;ZZ)Lcom/whoop/coaching/sleepcoach/wizard/g;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lkp0/a;", "c", "()Lkp0/a;", "b", "I", "k", "Z", "d", "()Z", "Lorg/joda/time/LocalTime;", "j", "()Lorg/joda/time/LocalTime;", "e", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "f", "Ljava/lang/String;", "g", "Lkp0/g;", "()Lkp0/g;", "Llp0/l;", "()Llp0/l;", "i", "m", "l", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class C6245g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AbstractC22734a alarmType;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int wakeWindowMinutes;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean enabled;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final LocalTime wakeTime;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final LocalTime sleepTime;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final String recommendedTimeInBedString;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C22740g optimalSleepCalculation;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C24641l optimalTimeInBedWindow;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C24641l tonightSleepWindow;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final boolean isWakeupTimeImpossible;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isSleepScheduleEnabled;

    public C6245g(AbstractC22734a alarmType, int i13, boolean z4, LocalTime wakeTime, LocalTime sleepTime, String recommendedTimeInBedString, C22740g c22740g, C24641l c24641l, C24641l tonightSleepWindow, boolean z13, boolean z14) {
        AbstractC22676k.m65750j(alarmType, "alarmType");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepTime, "sleepTime");
        AbstractC22676k.m65750j(recommendedTimeInBedString, "recommendedTimeInBedString");
        AbstractC22676k.m65750j(tonightSleepWindow, "tonightSleepWindow");
        this.alarmType = alarmType;
        this.wakeWindowMinutes = i13;
        this.enabled = z4;
        this.wakeTime = wakeTime;
        this.sleepTime = sleepTime;
        this.recommendedTimeInBedString = recommendedTimeInBedString;
        this.optimalSleepCalculation = c22740g;
        this.optimalTimeInBedWindow = c24641l;
        this.tonightSleepWindow = tonightSleepWindow;
        this.isWakeupTimeImpossible = z13;
        this.isSleepScheduleEnabled = z14;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ C6245g m18706b(C6245g c6245g, AbstractC22734a abstractC22734a, int i13, boolean z4, LocalTime localTime, LocalTime localTime2, String str, C22740g c22740g, C24641l c24641l, C24641l c24641l2, boolean z13, boolean z14, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            abstractC22734a = c6245g.alarmType;
        }
        if ((i14 & 2) != 0) {
            i13 = c6245g.wakeWindowMinutes;
        }
        if ((i14 & 4) != 0) {
            z4 = c6245g.enabled;
        }
        if ((i14 & 8) != 0) {
            localTime = c6245g.wakeTime;
        }
        if ((i14 & 16) != 0) {
            localTime2 = c6245g.sleepTime;
        }
        if ((i14 & 32) != 0) {
            str = c6245g.recommendedTimeInBedString;
        }
        if ((i14 & 64) != 0) {
            c22740g = c6245g.optimalSleepCalculation;
        }
        if ((i14 & 128) != 0) {
            c24641l = c6245g.optimalTimeInBedWindow;
        }
        if ((i14 & 256) != 0) {
            c24641l2 = c6245g.tonightSleepWindow;
        }
        if ((i14 & 512) != 0) {
            z13 = c6245g.isWakeupTimeImpossible;
        }
        if ((i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0) {
            z14 = c6245g.isSleepScheduleEnabled;
        }
        boolean z15 = z13;
        boolean z16 = z14;
        C24641l c24641l3 = c24641l;
        C24641l c24641l4 = c24641l2;
        String str2 = str;
        C22740g c22740g2 = c22740g;
        LocalTime localTime3 = localTime2;
        boolean z17 = z4;
        return c6245g.m18707a(abstractC22734a, i13, z17, localTime, localTime3, str2, c22740g2, c24641l3, c24641l4, z15, z16);
    }

    /* JADX INFO: renamed from: a */
    public final C6245g m18707a(AbstractC22734a alarmType, int wakeWindowMinutes, boolean enabled, LocalTime wakeTime, LocalTime sleepTime, String recommendedTimeInBedString, C22740g optimalSleepCalculation, C24641l optimalTimeInBedWindow, C24641l tonightSleepWindow, boolean isWakeupTimeImpossible, boolean isSleepScheduleEnabled) {
        AbstractC22676k.m65750j(alarmType, "alarmType");
        AbstractC22676k.m65750j(wakeTime, "wakeTime");
        AbstractC22676k.m65750j(sleepTime, "sleepTime");
        AbstractC22676k.m65750j(recommendedTimeInBedString, "recommendedTimeInBedString");
        AbstractC22676k.m65750j(tonightSleepWindow, "tonightSleepWindow");
        return new C6245g(alarmType, wakeWindowMinutes, enabled, wakeTime, sleepTime, recommendedTimeInBedString, optimalSleepCalculation, optimalTimeInBedWindow, tonightSleepWindow, isWakeupTimeImpossible, isSleepScheduleEnabled);
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
    public final C22740g getOptimalSleepCalculation() {
        return this.optimalSleepCalculation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof C6245g)) {
            return false;
        }
        C6245g c6245g = (C6245g) other;
        return AbstractC22676k.m65745e(this.alarmType, c6245g.alarmType) && this.wakeWindowMinutes == c6245g.wakeWindowMinutes && this.enabled == c6245g.enabled && AbstractC22676k.m65745e(this.wakeTime, c6245g.wakeTime) && AbstractC22676k.m65745e(this.sleepTime, c6245g.sleepTime) && AbstractC22676k.m65745e(this.recommendedTimeInBedString, c6245g.recommendedTimeInBedString) && AbstractC22676k.m65745e(this.optimalSleepCalculation, c6245g.optimalSleepCalculation) && AbstractC22676k.m65745e(this.optimalTimeInBedWindow, c6245g.optimalTimeInBedWindow) && AbstractC22676k.m65745e(this.tonightSleepWindow, c6245g.tonightSleepWindow) && this.isWakeupTimeImpossible == c6245g.isWakeupTimeImpossible && this.isSleepScheduleEnabled == c6245g.isSleepScheduleEnabled;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final C24641l getOptimalTimeInBedWindow() {
        return this.optimalTimeInBedWindow;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getRecommendedTimeInBedString() {
        return this.recommendedTimeInBedString;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final LocalTime getSleepTime() {
        return this.sleepTime;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d((this.sleepTime.hashCode() + ((this.wakeTime.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.wakeWindowMinutes, this.alarmType.hashCode() * 31, 31), 31, this.enabled)) * 31)) * 31, 31, this.recommendedTimeInBedString);
        C22740g c22740g = this.optimalSleepCalculation;
        int iHashCode = (iM30450d + (c22740g == null ? 0 : c22740g.hashCode())) * 31;
        C24641l c24641l = this.optimalTimeInBedWindow;
        return Boolean.hashCode(this.isSleepScheduleEnabled) + AbstractC2875y.m8289b((this.tonightSleepWindow.hashCode() + ((iHashCode + (c24641l != null ? c24641l.hashCode() : 0)) * 31)) * 31, 31, this.isWakeupTimeImpossible);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final C24641l getTonightSleepWindow() {
        return this.tonightSleepWindow;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LocalTime getWakeTime() {
        return this.wakeTime;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getWakeWindowMinutes() {
        return this.wakeWindowMinutes;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsSleepScheduleEnabled() {
        return this.isSleepScheduleEnabled;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsWakeupTimeImpossible() {
        return this.isWakeupTimeImpossible;
    }

    public String toString() {
        AbstractC22734a abstractC22734a = this.alarmType;
        int i13 = this.wakeWindowMinutes;
        boolean z4 = this.enabled;
        LocalTime localTime = this.wakeTime;
        LocalTime localTime2 = this.sleepTime;
        String str = this.recommendedTimeInBedString;
        C22740g c22740g = this.optimalSleepCalculation;
        C24641l c24641l = this.optimalTimeInBedWindow;
        C24641l c24641l2 = this.tonightSleepWindow;
        boolean z13 = this.isWakeupTimeImpossible;
        boolean z14 = this.isSleepScheduleEnabled;
        StringBuilder sb4 = new StringBuilder("SleepGraphViewState(alarmType=");
        sb4.append(abstractC22734a);
        sb4.append(", wakeWindowMinutes=");
        sb4.append(i13);
        sb4.append(", enabled=");
        sb4.append(z4);
        sb4.append(", wakeTime=");
        sb4.append(localTime);
        sb4.append(", sleepTime=");
        sb4.append(localTime2);
        sb4.append(", recommendedTimeInBedString=");
        sb4.append(str);
        sb4.append(", optimalSleepCalculation=");
        sb4.append(c22740g);
        sb4.append(", optimalTimeInBedWindow=");
        sb4.append(c24641l);
        sb4.append(", tonightSleepWindow=");
        sb4.append(c24641l2);
        sb4.append(", isWakeupTimeImpossible=");
        sb4.append(z13);
        sb4.append(", isSleepScheduleEnabled=");
        return AbstractC18489d0.m53372m(sb4, z14, ")");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C6245g(AbstractC22734a abstractC22734a, int i13, boolean z4, LocalTime localTime, LocalTime localTime2, String str, C22740g c22740g, C24641l c24641l, C24641l c24641l2, boolean z13, boolean z14, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        abstractC22734a = (i14 & 1) != 0 ? C6240b.INSTANCE.m18650b() : abstractC22734a;
        i13 = (i14 & 2) != 0 ? 60 : i13;
        z4 = (i14 & 4) != 0 ? true : z4;
        localTime = (i14 & 8) != 0 ? abstractC22734a.mo65815b() : localTime;
        if ((i14 & 16) != 0) {
            localTime2 = abstractC22734a.mo65815b().minusHours(8);
            AbstractC22676k.m65749i(localTime2, "minusHours(...)");
        }
        this(abstractC22734a, i13, z4, localTime, localTime2, (i14 & 32) != 0 ? "8:00" : str, (i14 & 64) != 0 ? null : c22740g, (i14 & 128) != 0 ? null : c24641l, (i14 & 256) != 0 ? C24641l.INSTANCE.m71998a() : c24641l2, (i14 & 512) != 0 ? false : z13, (i14 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 0 ? false : z14);
    }
}
