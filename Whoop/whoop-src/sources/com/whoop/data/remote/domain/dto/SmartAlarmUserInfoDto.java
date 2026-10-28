package com.whoop.data.remote.domain.dto;

import com.google.gson.annotations.SerializedName;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.profile.analytics.ProfileAnalyticsKt;
import com.whoop.weeklyplan.api.WeeklyPlanApiKt;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;
import l83.EnumC23463i;
import l83.InterfaceC23462h;
import org.joda.time.Instant;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p127ev.AbstractC13673n;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q63.AbstractC30007c;
import q83.AbstractC30060g;
import r80.AbstractC31061c;
import vw0.C36541a;
import wc3.InterfaceC37138c;
import wc3.InterfaceC37143h;
import wc3.InterfaceC37144i;
import wc3.InterfaceC37145j;
import yc3.InterfaceC39443g;
import zc3.InterfaceC40540c;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \b\u0087\b\u0018\u0000 a2\u00020\u0001:\u0002baB¥\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0017\u0010\u0018B¹\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u0017\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010!J\u0012\u0010'\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010!J\u0010\u0010-\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b1\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b4\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b5\u0010#JÎ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b8\u0010#J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010:J\u001a\u0010<\u001a\u00020\n2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b<\u0010=J\u000f\u0010\u0012\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0012\u0010.J'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001¢\u0006\u0004\bD\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010G\u001a\u0004\bH\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010I\u001a\u0004\bJ\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010I\u001a\u0004\bK\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010G\u001a\u0004\bL\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010G\u001a\u0004\bM\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u0010I\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010Q\u0012\u0004\bS\u0010P\u001a\u0004\bR\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010T\u0012\u0004\bV\u0010P\u001a\u0004\bU\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010G\u001a\u0004\bW\u0010!R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010X\u001a\u0004\bY\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010Z\u001a\u0004\b[\u00100R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010Q\u0012\u0004\b\\\u0010P\u001a\u0004\b\u0012\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010G\u001a\u0004\b]\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010I\u001a\u0004\b^\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010I\u001a\u0004\b_\u0010#R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010I\u001a\u0004\b`\u0010#¨\u0006c"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "", "", "userId", "", "upperTimeBound", "lastTriggeredAt", "sleepScoreGoal", "recoveryScoreGoal", "weeklyPlanHoursOfSleep", "", "smartAlarmEnabled", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "smartAlarmGoal", "windowMinutes", "scheduleEnabled", "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "dayOfWeek", "isEnrolledInWeeklyPlan", "weeklyPlanGoal", "timeZoneOffset", "alarmBounds", "optimizeSleep", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "toSmartAlarmUserInfo", "()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "component9", "component10", "()Z", "component11", "()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "component12", "component13", "component14", "component15", "component16", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", ProfileAnalyticsKt.SELF, "Lzc3/c;", "output", "Lyc3/g;", "serialDesc", "Ll83/a0;", "write$Self$core_release", "(Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;Lzc3/c;Lyc3/g;)V", "write$Self", "Ljava/lang/Integer;", "getUserId", "Ljava/lang/String;", "getUpperTimeBound", "getLastTriggeredAt", "getSleepScoreGoal", "getRecoveryScoreGoal", "getWeeklyPlanHoursOfSleep", "getWeeklyPlanHoursOfSleep$annotations", "()V", "Ljava/lang/Boolean;", "getSmartAlarmEnabled", "getSmartAlarmEnabled$annotations", "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;", "getSmartAlarmGoal", "getSmartAlarmGoal$annotations", "getWindowMinutes", "Z", "getScheduleEnabled", "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "getDayOfWeek", "isEnrolledInWeeklyPlan$annotations", "getWeeklyPlanGoal", "getTimeZoneOffset", "getAlarmBounds", "getOptimizeSleep", "Companion", "$serializer", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
@InterfaceC37144i
public final /* data */ class SmartAlarmUserInfoDto {
    private static final InterfaceC23462h[] $childSerializers;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @SerializedName("alarm_bounds")
    private final String alarmBounds;

    @SerializedName("day_of_week")
    private final DayOfWeekType dayOfWeek;

    @SerializedName("enrolled_weekly_plan")
    private final Boolean isEnrolledInWeeklyPlan;

    @SerializedName("last_triggered_at")
    private final String lastTriggeredAt;

    @SerializedName("optimize_sleep")
    private final String optimizeSleep;

    @SerializedName("recovery_score_goal")
    private final Integer recoveryScoreGoal;

    @SerializedName("schedule_enabled")
    private final boolean scheduleEnabled;

    @SerializedName("sleep_score_goal")
    private final Integer sleepScoreGoal;

    @SerializedName("enabled")
    private final Boolean smartAlarmEnabled;

    @SerializedName(WeeklyPlanApiKt.GOAL)
    private final SmartAlarmGoalType smartAlarmGoal;

    @SerializedName("time_zone_offset")
    private final String timeZoneOffset;

    @SerializedName("upper_time_bound")
    private final String upperTimeBound;

    @SerializedName("user_id")
    private final Integer userId;

    @SerializedName("weekly_plan_goal")
    private final Integer weeklyPlanGoal;

    @SerializedName("weekly_plan_sleep_hours_goal")
    private final String weeklyPlanHoursOfSleep;

    @SerializedName("window_minutes")
    private final Integer windowMinutes;

    @Metadata(m65680d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;", "", "<init>", "()V", "Lwc3/c;", "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;", "serializer", "()Lwc3/c;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final InterfaceC37138c serializer() {
            return SmartAlarmUserInfoDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    static {
        EnumC23463i enumC23463i = EnumC23463i.f92934x;
        $childSerializers = new InterfaceC23462h[]{null, null, null, null, null, null, null, AbstractC30060g.m92087G(enumC23463i, new C36541a(10)), null, null, AbstractC30060g.m92087G(enumC23463i, new C36541a(11)), null, null, null, null, null};
    }

    public /* synthetic */ SmartAlarmUserInfoDto(int i13, Integer num, String str, String str2, Integer num2, Integer num3, String str3, Boolean bool, SmartAlarmGoalType smartAlarmGoalType, Integer num4, boolean z4, DayOfWeekType dayOfWeekType, Boolean bool2, Integer num5, String str4, String str5, String str6, SerializationConstructorMarker serializationConstructorMarker) {
        if (65535 != (i13 & 65535)) {
            PluginExceptionsKt.throwMissingFieldException(i13, 65535, SmartAlarmUserInfoDto$$serializer.INSTANCE.getDescriptor());
        }
        this.userId = num;
        this.upperTimeBound = str;
        this.lastTriggeredAt = str2;
        this.sleepScoreGoal = num2;
        this.recoveryScoreGoal = num3;
        this.weeklyPlanHoursOfSleep = str3;
        this.smartAlarmEnabled = bool;
        this.smartAlarmGoal = smartAlarmGoalType;
        this.windowMinutes = num4;
        this.scheduleEnabled = z4;
        this.dayOfWeek = dayOfWeekType;
        this.isEnrolledInWeeklyPlan = bool2;
        this.weeklyPlanGoal = num5;
        this.timeZoneOffset = str4;
        this.alarmBounds = str5;
        this.optimizeSleep = str6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_() {
        return SmartAlarmGoalType.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ InterfaceC37138c _childSerializers$_anonymous_$0() {
        return DayOfWeekType.INSTANCE.serializer();
    }

    @InterfaceC37143h("enabled")
    public static /* synthetic */ void getSmartAlarmEnabled$annotations() {
    }

    @InterfaceC37143h(WeeklyPlanApiKt.GOAL)
    public static /* synthetic */ void getSmartAlarmGoal$annotations() {
    }

    @InterfaceC37143h("weekly_plan_sleep_hours_goal")
    public static /* synthetic */ void getWeeklyPlanHoursOfSleep$annotations() {
    }

    @InterfaceC37143h("enrolled_weekly_plan")
    public static /* synthetic */ void isEnrolledInWeeklyPlan$annotations() {
    }

    public static final /* synthetic */ void write$Self$core_release(SmartAlarmUserInfoDto self, InterfaceC40540c output, InterfaceC39443g serialDesc) {
        InterfaceC23462h[] interfaceC23462hArr = $childSerializers;
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 0, intSerializer, self.userId);
        StringSerializer stringSerializer = StringSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 1, stringSerializer, self.upperTimeBound);
        output.encodeNullableSerializableElement(serialDesc, 2, stringSerializer, self.lastTriggeredAt);
        output.encodeNullableSerializableElement(serialDesc, 3, intSerializer, self.sleepScoreGoal);
        output.encodeNullableSerializableElement(serialDesc, 4, intSerializer, self.recoveryScoreGoal);
        output.encodeNullableSerializableElement(serialDesc, 5, stringSerializer, self.weeklyPlanHoursOfSleep);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        output.encodeNullableSerializableElement(serialDesc, 6, booleanSerializer, self.smartAlarmEnabled);
        output.encodeNullableSerializableElement(serialDesc, 7, (InterfaceC37145j) interfaceC23462hArr[7].getValue(), self.smartAlarmGoal);
        output.encodeNullableSerializableElement(serialDesc, 8, intSerializer, self.windowMinutes);
        output.encodeBooleanElement(serialDesc, 9, self.scheduleEnabled);
        output.encodeNullableSerializableElement(serialDesc, 10, (InterfaceC37145j) interfaceC23462hArr[10].getValue(), self.dayOfWeek);
        output.encodeNullableSerializableElement(serialDesc, 11, booleanSerializer, self.isEnrolledInWeeklyPlan);
        output.encodeNullableSerializableElement(serialDesc, 12, intSerializer, self.weeklyPlanGoal);
        output.encodeNullableSerializableElement(serialDesc, 13, stringSerializer, self.timeZoneOffset);
        output.encodeNullableSerializableElement(serialDesc, 14, stringSerializer, self.alarmBounds);
        output.encodeNullableSerializableElement(serialDesc, 15, stringSerializer, self.optimizeSleep);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getUserId() {
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
    public final Boolean getIsEnrolledInWeeklyPlan() {
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
    public final String getOptimizeSleep() {
        return this.optimizeSleep;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastTriggeredAt() {
        return this.lastTriggeredAt;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getSleepScoreGoal() {
        return this.sleepScoreGoal;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getRecoveryScoreGoal() {
        return this.recoveryScoreGoal;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getWeeklyPlanHoursOfSleep() {
        return this.weeklyPlanHoursOfSleep;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final SmartAlarmGoalType getSmartAlarmGoal() {
        return this.smartAlarmGoal;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getWindowMinutes() {
        return this.windowMinutes;
    }

    public final SmartAlarmUserInfoDto copy(Integer userId, String upperTimeBound, String lastTriggeredAt, Integer sleepScoreGoal, Integer recoveryScoreGoal, String weeklyPlanHoursOfSleep, Boolean smartAlarmEnabled, SmartAlarmGoalType smartAlarmGoal, Integer windowMinutes, boolean scheduleEnabled, DayOfWeekType dayOfWeek, Boolean isEnrolledInWeeklyPlan, Integer weeklyPlanGoal, String timeZoneOffset, String alarmBounds, String optimizeSleep) {
        return new SmartAlarmUserInfoDto(userId, upperTimeBound, lastTriggeredAt, sleepScoreGoal, recoveryScoreGoal, weeklyPlanHoursOfSleep, smartAlarmEnabled, smartAlarmGoal, windowMinutes, scheduleEnabled, dayOfWeek, isEnrolledInWeeklyPlan, weeklyPlanGoal, timeZoneOffset, alarmBounds, optimizeSleep);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmartAlarmUserInfoDto)) {
            return false;
        }
        SmartAlarmUserInfoDto smartAlarmUserInfoDto = (SmartAlarmUserInfoDto) other;
        return AbstractC22676k.m65745e(this.userId, smartAlarmUserInfoDto.userId) && AbstractC22676k.m65745e(this.upperTimeBound, smartAlarmUserInfoDto.upperTimeBound) && AbstractC22676k.m65745e(this.lastTriggeredAt, smartAlarmUserInfoDto.lastTriggeredAt) && AbstractC22676k.m65745e(this.sleepScoreGoal, smartAlarmUserInfoDto.sleepScoreGoal) && AbstractC22676k.m65745e(this.recoveryScoreGoal, smartAlarmUserInfoDto.recoveryScoreGoal) && AbstractC22676k.m65745e(this.weeklyPlanHoursOfSleep, smartAlarmUserInfoDto.weeklyPlanHoursOfSleep) && AbstractC22676k.m65745e(this.smartAlarmEnabled, smartAlarmUserInfoDto.smartAlarmEnabled) && this.smartAlarmGoal == smartAlarmUserInfoDto.smartAlarmGoal && AbstractC22676k.m65745e(this.windowMinutes, smartAlarmUserInfoDto.windowMinutes) && this.scheduleEnabled == smartAlarmUserInfoDto.scheduleEnabled && this.dayOfWeek == smartAlarmUserInfoDto.dayOfWeek && AbstractC22676k.m65745e(this.isEnrolledInWeeklyPlan, smartAlarmUserInfoDto.isEnrolledInWeeklyPlan) && AbstractC22676k.m65745e(this.weeklyPlanGoal, smartAlarmUserInfoDto.weeklyPlanGoal) && AbstractC22676k.m65745e(this.timeZoneOffset, smartAlarmUserInfoDto.timeZoneOffset) && AbstractC22676k.m65745e(this.alarmBounds, smartAlarmUserInfoDto.alarmBounds) && AbstractC22676k.m65745e(this.optimizeSleep, smartAlarmUserInfoDto.optimizeSleep);
    }

    public final String getAlarmBounds() {
        return this.alarmBounds;
    }

    public final DayOfWeekType getDayOfWeek() {
        return this.dayOfWeek;
    }

    public final String getLastTriggeredAt() {
        return this.lastTriggeredAt;
    }

    public final String getOptimizeSleep() {
        return this.optimizeSleep;
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

    public final Boolean getSmartAlarmEnabled() {
        return this.smartAlarmEnabled;
    }

    public final SmartAlarmGoalType getSmartAlarmGoal() {
        return this.smartAlarmGoal;
    }

    public final String getTimeZoneOffset() {
        return this.timeZoneOffset;
    }

    public final String getUpperTimeBound() {
        return this.upperTimeBound;
    }

    public final Integer getUserId() {
        return this.userId;
    }

    public final Integer getWeeklyPlanGoal() {
        return this.weeklyPlanGoal;
    }

    public final String getWeeklyPlanHoursOfSleep() {
        return this.weeklyPlanHoursOfSleep;
    }

    public final Integer getWindowMinutes() {
        return this.windowMinutes;
    }

    public int hashCode() {
        Integer num = this.userId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.upperTimeBound;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lastTriggeredAt;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.sleepScoreGoal;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.recoveryScoreGoal;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str3 = this.weeklyPlanHoursOfSleep;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.smartAlarmEnabled;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        SmartAlarmGoalType smartAlarmGoalType = this.smartAlarmGoal;
        int iHashCode8 = (iHashCode7 + (smartAlarmGoalType == null ? 0 : smartAlarmGoalType.hashCode())) * 31;
        Integer num4 = this.windowMinutes;
        int iM8289b = AbstractC2875y.m8289b((iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.scheduleEnabled);
        DayOfWeekType dayOfWeekType = this.dayOfWeek;
        int iHashCode9 = (iM8289b + (dayOfWeekType == null ? 0 : dayOfWeekType.hashCode())) * 31;
        Boolean bool2 = this.isEnrolledInWeeklyPlan;
        int iHashCode10 = (iHashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num5 = this.weeklyPlanGoal;
        int iHashCode11 = (iHashCode10 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str4 = this.timeZoneOffset;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.alarmBounds;
        int iHashCode13 = (iHashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.optimizeSleep;
        return iHashCode13 + (str6 != null ? str6.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isEnrolledInWeeklyPlan, reason: collision with other method in class */
    public final Boolean m134154isEnrolledInWeeklyPlan() {
        return this.isEnrolledInWeeklyPlan;
    }

    public final SmartAlarmUserInfo toSmartAlarmUserInfo() {
        Integer num = this.userId;
        AbstractC22676k.m65747g(num);
        int iIntValue = num.intValue();
        Integer num2 = this.windowMinutes;
        AbstractC22676k.m65747g(num2);
        int iIntValue2 = num2.intValue();
        String str = this.upperTimeBound;
        AbstractC22676k.m65747g(str);
        String str2 = this.lastTriggeredAt;
        Integer num3 = this.sleepScoreGoal;
        Integer num4 = this.recoveryScoreGoal;
        SmartAlarmGoalType smartAlarmGoalType = this.smartAlarmGoal;
        AbstractC22676k.m65747g(smartAlarmGoalType);
        Boolean bool = this.smartAlarmEnabled;
        AbstractC22676k.m65747g(bool);
        return new SmartAlarmUserInfo(iIntValue, iIntValue2, str, str2, num3, num4, smartAlarmGoalType, bool.booleanValue(), Instant.now().getMillis(), this.scheduleEnabled, this.dayOfWeek, isEnrolledInWeeklyPlan(), this.weeklyPlanGoal, this.timeZoneOffset, this.alarmBounds, this.weeklyPlanHoursOfSleep);
    }

    public String toString() {
        Integer num = this.userId;
        String str = this.upperTimeBound;
        String str2 = this.lastTriggeredAt;
        Integer num2 = this.sleepScoreGoal;
        Integer num3 = this.recoveryScoreGoal;
        String str3 = this.weeklyPlanHoursOfSleep;
        Boolean bool = this.smartAlarmEnabled;
        SmartAlarmGoalType smartAlarmGoalType = this.smartAlarmGoal;
        Integer num4 = this.windowMinutes;
        boolean z4 = this.scheduleEnabled;
        DayOfWeekType dayOfWeekType = this.dayOfWeek;
        Boolean bool2 = this.isEnrolledInWeeklyPlan;
        Integer num5 = this.weeklyPlanGoal;
        String str4 = this.timeZoneOffset;
        String str5 = this.alarmBounds;
        String str6 = this.optimizeSleep;
        StringBuilder sbM95643s = AbstractC31061c.m95643s("SmartAlarmUserInfoDto(userId=", ", upperTimeBound=", num, str, ", lastTriggeredAt=");
        AbstractC30007c.m91853w(num2, str2, ", sleepScoreGoal=", ", recoveryScoreGoal=", sbM95643s);
        AbstractC13673n.m38577x(num3, ", weeklyPlanHoursOfSleep=", str3, ", smartAlarmEnabled=", sbM95643s);
        sbM95643s.append(bool);
        sbM95643s.append(", smartAlarmGoal=");
        sbM95643s.append(smartAlarmGoalType);
        sbM95643s.append(", windowMinutes=");
        sbM95643s.append(num4);
        sbM95643s.append(", scheduleEnabled=");
        sbM95643s.append(z4);
        sbM95643s.append(", dayOfWeek=");
        sbM95643s.append(dayOfWeekType);
        sbM95643s.append(", isEnrolledInWeeklyPlan=");
        sbM95643s.append(bool2);
        sbM95643s.append(", weeklyPlanGoal=");
        AbstractC13673n.m38577x(num5, ", timeZoneOffset=", str4, ", alarmBounds=", sbM95643s);
        return AbstractC11266d.m30464r(sbM95643s, str5, ", optimizeSleep=", str6, ")");
    }

    public SmartAlarmUserInfoDto(Integer num, String str, String str2, Integer num2, Integer num3, String str3, Boolean bool, SmartAlarmGoalType smartAlarmGoalType, Integer num4, boolean z4, DayOfWeekType dayOfWeekType, Boolean bool2, Integer num5, String str4, String str5, String str6) {
        this.userId = num;
        this.upperTimeBound = str;
        this.lastTriggeredAt = str2;
        this.sleepScoreGoal = num2;
        this.recoveryScoreGoal = num3;
        this.weeklyPlanHoursOfSleep = str3;
        this.smartAlarmEnabled = bool;
        this.smartAlarmGoal = smartAlarmGoalType;
        this.windowMinutes = num4;
        this.scheduleEnabled = z4;
        this.dayOfWeek = dayOfWeekType;
        this.isEnrolledInWeeklyPlan = bool2;
        this.weeklyPlanGoal = num5;
        this.timeZoneOffset = str4;
        this.alarmBounds = str5;
        this.optimizeSleep = str6;
    }

    private final boolean isEnrolledInWeeklyPlan() {
        SmartAlarmGoalType smartAlarmGoalType = this.smartAlarmGoal;
        return (smartAlarmGoalType == null || this.weeklyPlanGoal == null || !SmartAlarmUserInfoDtoKt.isExactWeeklyPlanAlarm(smartAlarmGoalType)) ? false : true;
    }
}
