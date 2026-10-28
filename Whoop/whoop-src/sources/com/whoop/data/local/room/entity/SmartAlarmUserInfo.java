package com.whoop.data.local.room.entity;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import com.whoop.data.remote.domain.dto.DayOfWeekType;
import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import or2.C28204u;
import org.joda.time.Instant;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0006HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\t\u0010G\u001a\u00020\u000bHÆ\u0003J\t\u0010H\u001a\u00020\rHÆ\u0003J\t\u0010I\u001a\u00020\u000fHÆ\u0003J\t\u0010J\u001a\u00020\rHÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u0010L\u001a\u00020\rHÆ\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010!J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006HÆ\u0003J¾\u0001\u0010Q\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\r2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\r2\b\u0010T\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010U\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010V\u001a\u00020\u0006HÖ\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b \u0010!R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b#\u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\"\u001a\u0004\b-\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001eR\u0011\u00101\u001a\u0002028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0016\u00105\u001a\u0002068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0016\u00109\u001a\u00020:8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b?\u0010@¨\u0006W"}, m65681d2 = {"Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "", "userId", "", "windowMinutes", "upperTimeBound", "", "lastTriggeredAt", "sleepScoreGoal", "recoveryScoreGoal", WeeklyPlanApiKt.GOAL, "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "smartAlarmEnabled", "", "lastUpdatedTime", "", "scheduleEnabled", "dayOfWeek", "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "isEnrolledInWeeklyPlan", "weeklyPlanGoal", "timeZoneOffset", "alarmBounds", "weeklyPlanHourGoal", "<init>", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()I", "getWindowMinutes", "getUpperTimeBound", "()Ljava/lang/String;", "getLastTriggeredAt", "getSleepScoreGoal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRecoveryScoreGoal", "getGoal", "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "getSmartAlarmEnabled", "()Z", "getLastUpdatedTime", "()J", "getScheduleEnabled", "getDayOfWeek", "()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "getWeeklyPlanGoal", "getTimeZoneOffset", "getAlarmBounds", "getWeeklyPlanHourGoal", "upperTimeBoundLocalDateTime", "Lorg/joda/time/LocalDateTime;", "getUpperTimeBoundLocalDateTime", "()Lorg/joda/time/LocalDateTime;", "upperBoundLocalTime", "Lorg/joda/time/LocalTime;", "getUpperBoundLocalTime", "()Lorg/joda/time/LocalTime;", "lastUpdatedAt", "Lorg/joda/time/Instant;", "getLastUpdatedAt", "()Lorg/joda/time/Instant;", "alarmBoundsTime", "Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "getAlarmBoundsTime", "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "copy", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "equals", "other", "hashCode", "toString", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final /* data */ class SmartAlarmUserInfo {
    private final String alarmBounds;
    private final DateTimeRange alarmBoundsTime;
    private final DayOfWeekType dayOfWeek;
    private final SmartAlarmGoalType goal;
    private final boolean isEnrolledInWeeklyPlan;
    private final String lastTriggeredAt;
    private final Instant lastUpdatedAt;
    private final long lastUpdatedTime;
    private final Integer recoveryScoreGoal;
    private final boolean scheduleEnabled;
    private final Integer sleepScoreGoal;
    private final boolean smartAlarmEnabled;
    private final String timeZoneOffset;
    private final LocalTime upperBoundLocalTime;
    private final String upperTimeBound;
    private final int userId;
    private final Integer weeklyPlanGoal;
    private final String weeklyPlanHourGoal;
    private final int windowMinutes;

    public SmartAlarmUserInfo(int i13, int i14, String upperTimeBound, String str, Integer num, Integer num2, SmartAlarmGoalType goal, boolean z4, long j7, boolean z13, DayOfWeekType dayOfWeekType, boolean z14, Integer num3, String str2, String str3, String str4) {
        String str5 = str3;
        AbstractC22676k.m65750j(upperTimeBound, "upperTimeBound");
        AbstractC22676k.m65750j(goal, "goal");
        this.userId = i13;
        this.windowMinutes = i14;
        this.upperTimeBound = upperTimeBound;
        this.lastTriggeredAt = str;
        this.sleepScoreGoal = num;
        this.recoveryScoreGoal = num2;
        this.goal = goal;
        this.smartAlarmEnabled = z4;
        this.lastUpdatedTime = j7;
        this.scheduleEnabled = z13;
        this.dayOfWeek = dayOfWeekType;
        this.isEnrolledInWeeklyPlan = z14;
        this.weeklyPlanGoal = num3;
        this.timeZoneOffset = str2;
        this.alarmBounds = str5;
        this.weeklyPlanHourGoal = str4;
        LocalTime localTime = C28204u.INSTANCE.m85368k().parseLocalTime(upperTimeBound);
        AbstractC22676k.m65749i(localTime, "parseLocalTime(...)");
        this.upperBoundLocalTime = localTime;
        this.lastUpdatedAt = new Instant(j7);
        DateTimeRange dateTimeRange = null;
        if (str5 != null) {
            str5 = str5.length() <= 0 ? null : str5;
            if (str5 != null) {
                dateTimeRange = new DateTimeRange(str5);
            }
        }
        this.alarmBoundsTime = dateTimeRange;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final DayOfWeekType getDayOfWeek() {
        return this.dayOfWeek;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsEnrolledInWeeklyPlan() {
        return this.isEnrolledInWeeklyPlan;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Integer getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getAlarmBounds() {
        return this.alarmBounds;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getWeeklyPlanHourGoal() {
        return this.weeklyPlanHourGoal;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getWindowMinutes() {
        return this.windowMinutes;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLastTriggeredAt() {
        return this.lastTriggeredAt;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getSleepScoreGoal() {
        return this.sleepScoreGoal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getRecoveryScoreGoal() {
        return this.recoveryScoreGoal;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final SmartAlarmGoalType getGoal() {
        return this.goal;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public final SmartAlarmUserInfo copy(int userId, int windowMinutes, String upperTimeBound, String lastTriggeredAt, Integer sleepScoreGoal, Integer recoveryScoreGoal, SmartAlarmGoalType goal, boolean smartAlarmEnabled, long lastUpdatedTime, boolean scheduleEnabled, DayOfWeekType dayOfWeek, boolean isEnrolledInWeeklyPlan, Integer weeklyPlanGoal, String timeZoneOffset, String alarmBounds, String weeklyPlanHourGoal) {
        AbstractC22676k.m65750j(upperTimeBound, "upperTimeBound");
        AbstractC22676k.m65750j(goal, "goal");
        return new SmartAlarmUserInfo(userId, windowMinutes, upperTimeBound, lastTriggeredAt, sleepScoreGoal, recoveryScoreGoal, goal, smartAlarmEnabled, lastUpdatedTime, scheduleEnabled, dayOfWeek, isEnrolledInWeeklyPlan, weeklyPlanGoal, timeZoneOffset, alarmBounds, weeklyPlanHourGoal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartAlarmUserInfo)) {
            return false;
        }
        SmartAlarmUserInfo smartAlarmUserInfo = (SmartAlarmUserInfo) other;
        return this.userId == smartAlarmUserInfo.userId && this.windowMinutes == smartAlarmUserInfo.windowMinutes && AbstractC22676k.m65745e(this.upperTimeBound, smartAlarmUserInfo.upperTimeBound) && AbstractC22676k.m65745e(this.lastTriggeredAt, smartAlarmUserInfo.lastTriggeredAt) && AbstractC22676k.m65745e(this.sleepScoreGoal, smartAlarmUserInfo.sleepScoreGoal) && AbstractC22676k.m65745e(this.recoveryScoreGoal, smartAlarmUserInfo.recoveryScoreGoal) && this.goal == smartAlarmUserInfo.goal && this.smartAlarmEnabled == smartAlarmUserInfo.smartAlarmEnabled && this.lastUpdatedTime == smartAlarmUserInfo.lastUpdatedTime && this.scheduleEnabled == smartAlarmUserInfo.scheduleEnabled && this.dayOfWeek == smartAlarmUserInfo.dayOfWeek && this.isEnrolledInWeeklyPlan == smartAlarmUserInfo.isEnrolledInWeeklyPlan && AbstractC22676k.m65745e(this.weeklyPlanGoal, smartAlarmUserInfo.weeklyPlanGoal) && AbstractC22676k.m65745e(this.timeZoneOffset, smartAlarmUserInfo.timeZoneOffset) && AbstractC22676k.m65745e(this.alarmBounds, smartAlarmUserInfo.alarmBounds) && AbstractC22676k.m65745e(this.weeklyPlanHourGoal, smartAlarmUserInfo.weeklyPlanHourGoal);
    }

    public final String getAlarmBounds() {
        return this.alarmBounds;
    }

    public final DateTimeRange getAlarmBoundsTime() {
        return this.alarmBoundsTime;
    }

    public final DayOfWeekType getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final SmartAlarmGoalType getGoal() {
        return this.goal;
    }

    public final String getLastTriggeredAt() {
        return this.lastTriggeredAt;
    }

    public final Instant getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    public final long getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    public final Integer getRecoveryScoreGoal() {
        return this.recoveryScoreGoal;
    }

    public final boolean getScheduleEnabled() {
        return this.scheduleEnabled;
    }

    public final Integer getSleepScoreGoal() {
        return this.sleepScoreGoal;
    }

    public final boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final LocalTime getUpperBoundLocalTime() {
        return this.upperBoundLocalTime;
    }

    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    public final LocalDateTime getUpperTimeBoundLocalDateTime() {
        LocalDateTime localDateTimeWithTime = LocalDateTime.now().withTime(this.upperBoundLocalTime.getHourOfDay(), this.upperBoundLocalTime.getMinuteOfHour(), this.upperBoundLocalTime.getSecondOfMinute(), this.upperBoundLocalTime.getMillisOfSecond());
        AbstractC22676k.m65749i(localDateTimeWithTime, "withTime(...)");
        return localDateTimeWithTime;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final Integer getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public final String getWeeklyPlanHourGoal() {
        return this.weeklyPlanHourGoal;
    }

    public final int getWindowMinutes() {
        return this.windowMinutes;
    }

    public int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30448b(this.windowMinutes, Integer.hashCode(this.userId) * 31, 31), 31, this.upperTimeBound);
        String str = this.lastTriggeredAt;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.sleepScoreGoal;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.recoveryScoreGoal;
        int iM8289b = AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC2875y.m8289b((this.goal.hashCode() + ((iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31)) * 31, 31, this.smartAlarmEnabled), this.lastUpdatedTime, 31), 31, this.scheduleEnabled);
        DayOfWeekType dayOfWeekType = this.dayOfWeek;
        int iM8289b2 = AbstractC2875y.m8289b((iM8289b + (dayOfWeekType == null ? 0 : dayOfWeekType.hashCode())) * 31, 31, this.isEnrolledInWeeklyPlan);
        Integer num3 = this.weeklyPlanGoal;
        int iHashCode3 = (iM8289b2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.timeZoneOffset;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.alarmBounds;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.weeklyPlanHourGoal;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isEnrolledInWeeklyPlan() {
        return this.isEnrolledInWeeklyPlan;
    }

    public String toString() {
        int i13 = this.userId;
        int i14 = this.windowMinutes;
        String str = this.upperTimeBound;
        String str2 = this.lastTriggeredAt;
        Integer num = this.sleepScoreGoal;
        Integer num2 = this.recoveryScoreGoal;
        SmartAlarmGoalType smartAlarmGoalType = this.goal;
        boolean z4 = this.smartAlarmEnabled;
        long j7 = this.lastUpdatedTime;
        boolean z13 = this.scheduleEnabled;
        DayOfWeekType dayOfWeekType = this.dayOfWeek;
        boolean z14 = this.isEnrolledInWeeklyPlan;
        Integer num3 = this.weeklyPlanGoal;
        String str3 = this.timeZoneOffset;
        String str4 = this.alarmBounds;
        String str5 = this.weeklyPlanHourGoal;
        StringBuilder sbM30465s = AbstractC11266d.m30465s(i13, i14, "SmartAlarmUserInfo(userId=", ", windowMinutes=", ", upperTimeBound=");
        AbstractC11266d.m30444B(sbM30465s, str, ", lastTriggeredAt=", str2, ", sleepScoreGoal=");
        AbstractC31061c.m95621A(sbM30465s, num, ", recoveryScoreGoal=", num2, ", goal=");
        sbM30465s.append(smartAlarmGoalType);
        sbM30465s.append(", smartAlarmEnabled=");
        sbM30465s.append(z4);
        sbM30465s.append(", lastUpdatedTime=");
        sbM30465s.append(j7);
        sbM30465s.append(", scheduleEnabled=");
        sbM30465s.append(z13);
        sbM30465s.append(", dayOfWeek=");
        sbM30465s.append(dayOfWeekType);
        sbM30465s.append(", isEnrolledInWeeklyPlan=");
        sbM30465s.append(z14);
        sbM30465s.append(", weeklyPlanGoal=");
        sbM30465s.append(num3);
        sbM30465s.append(", timeZoneOffset=");
        sbM30465s.append(str3);
        AbstractC11266d.m30444B(sbM30465s, ", alarmBounds=", str4, ", weeklyPlanHourGoal=", str5);
        sbM30465s.append(")");
        return sbM30465s.toString();
    }
}
