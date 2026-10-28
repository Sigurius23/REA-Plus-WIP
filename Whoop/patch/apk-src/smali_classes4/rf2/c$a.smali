.class Lrf2/c$a;
.super Landroidx/room/k;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lrf2/c;-><init>(Landroidx/room/z0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Landroidx/room/k;"
    }
.end annotation


# instance fields
.field final synthetic a:Lrf2/c;


# direct methods
.method public constructor <init>(Lrf2/c;)V
    .locals 0

    iput-object p1, p0, Lrf2/c$a;->a:Lrf2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ltb/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V
    .locals 4

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUserId()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x1

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWindowMinutes()I

    move-result v0

    int-to-long v0, v0

    const/4 v2, 0x2

    invoke-interface {p1, v2, v0, v1}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperTimeBound()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x3

    if-nez v0, :cond_0

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperTimeBound()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getLastTriggeredAt()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getLastTriggeredAt()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_1
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSleepScoreGoal()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x5

    if-nez v0, :cond_2

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSleepScoreGoal()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_2
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getRecoveryScoreGoal()Ljava/lang/Integer;

    move-result-object v0

    const/4 v1, 0x6

    if-nez v0, :cond_3

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_3

    :cond_3
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getRecoveryScoreGoal()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_3
    iget-object v0, p0, Lrf2/c$a;->a:Lrf2/c;

    invoke-static {v0}, Lrf2/c;->p(Lrf2/c;)Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getGoal()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;->fromSmartGoalType(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x7

    if-nez v0, :cond_4

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_4

    :cond_4
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_4
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v0

    const/16 v1, 0x8

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    const/16 v0, 0x9

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getLastUpdatedTime()J

    move-result-wide v1

    invoke-interface {p1, v0, v1, v2}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v0

    const/16 v1, 0xa

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    iget-object v0, p0, Lrf2/c$a;->a:Lrf2/c;

    invoke-static {v0}, Lrf2/c;->o(Lrf2/c;)Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    move-result-object v0

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getDayOfWeek()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;->fromDayOfWeekType(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xb

    if-nez v0, :cond_5

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_5

    :cond_5
    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_5
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan()Z

    move-result v0

    const/16 v1, 0xc

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWeeklyPlanGoal()Ljava/lang/Integer;

    move-result-object v0

    const/16 v1, 0xd

    if-nez v0, :cond_6

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_6

    :cond_6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWeeklyPlanGoal()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    int-to-long v2, v0

    invoke-interface {p1, v1, v2, v3}, Ltb/c;->p(IJ)V

    :goto_6
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xe

    if-nez v0, :cond_7

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_7

    :cond_7
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_7
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getAlarmBounds()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xf

    if-nez v0, :cond_8

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    goto :goto_8

    :cond_8
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getAlarmBounds()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v1, v0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_8
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWeeklyPlanHourGoal()Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x10

    if-nez v0, :cond_9

    invoke-interface {p1, v1}, Ltb/c;->u(I)V

    return-void

    :cond_9
    invoke-virtual {p2}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getWeeklyPlanHourGoal()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, p2}, Ltb/c;->L(ILjava/lang/String;)V

    return-void
.end method

.method public bridge synthetic bind(Ltb/c;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {p0, p1, p2}, Lrf2/c$a;->a(Ltb/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V

    return-void
.end method

.method public createQuery()Ljava/lang/String;
    .locals 1

    const-string v0, "INSERT OR REPLACE INTO `smart_alarm_user_info_table` (`user_id`,`window_minutes`,`upper_time_bound`,`last_triggered_at`,`sleep_score_goal`,`recovery_score_goal`,`goal`,`enabled`,`last_updated_at`,`schedule_enabled`,`day_of_week`,`enrolled_weekly_plan`,`weekly_plan_goal`,`time_zone_offset`,`alarm_bounds`,`weekly_plan_hour_goal`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"

    return-object v0
.end method
