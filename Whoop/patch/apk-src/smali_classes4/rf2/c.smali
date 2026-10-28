.class public final Lrf2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrf2/a;


# instance fields
.field private final a:Landroidx/room/z0;

.field private final b:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field

.field private final c:Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

.field private final d:Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

.field private final e:Landroidx/room/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/room/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroidx/room/z0;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;-><init>()V

    iput-object v0, p0, Lrf2/c;->c:Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    new-instance v0, Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    invoke-direct {v0}, Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;-><init>()V

    iput-object v0, p0, Lrf2/c;->d:Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    iput-object p1, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance p1, Lrf2/c$a;

    invoke-direct {p1, p0}, Lrf2/c$a;-><init>(Lrf2/c;)V

    iput-object p1, p0, Lrf2/c;->b:Landroidx/room/k;

    new-instance p1, Lrf2/c$b;

    invoke-direct {p1, p0}, Lrf2/c$b;-><init>(Lrf2/c;)V

    iput-object p1, p0, Lrf2/c;->e:Landroidx/room/k;

    return-void
.end method

.method public static synthetic h(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrf2/c;->w(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lrf2/c;Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 0

    invoke-direct {p0, p1}, Lrf2/c;->u(Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrf2/c;->x(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Ltb/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrf2/c;->s(Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljava/lang/String;Ltb/a;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lrf2/c;->r(Ljava/lang/String;Ltb/a;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lrf2/c;Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 0

    invoke-direct {p0, p1}, Lrf2/c;->t(Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lrf2/c;Lsf2/a;Ltb/a;)Ll83/a0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrf2/c;->v(Lsf2/a;Ltb/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic o(Lrf2/c;)Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;
    .locals 0

    iget-object p0, p0, Lrf2/c;->d:Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    return-object p0
.end method

.method public static bridge synthetic p(Lrf2/c;)Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;
    .locals 0

    iget-object p0, p0, Lrf2/c;->c:Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    return-object p0
.end method

.method public static q()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Class<",
            "*>;>;"
        }
    .end annotation

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0
.end method

.method private static synthetic r(Ljava/lang/String;Ltb/a;)Ljava/lang/Boolean;
    .locals 4

    const-string v0, "SELECT EXISTS(SELECT * FROM table_smart_alarm_triggered WHERE composite_id = ?)"

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    const/4 v0, 0x1

    if-nez p0, :cond_0

    :try_start_0
    invoke-interface {p1, v0}, Ltb/c;->u(I)V

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_4

    :cond_0
    invoke-interface {p1, v0, p0}, Ltb/c;->L(ILjava/lang/String;)V

    :goto_0
    invoke-interface {p1}, Ltb/c;->e1()Z

    move-result p0

    const/4 v1, 0x0

    if-eqz p0, :cond_4

    const/4 p0, 0x0

    invoke-interface {p1, p0}, Ltb/c;->isNull(I)Z

    move-result v2

    if-eqz v2, :cond_1

    move-object v2, v1

    goto :goto_1

    :cond_1
    invoke-interface {p1, p0}, Ltb/c;->getLong(I)J

    move-result-wide v2

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    :goto_1
    if-nez v2, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_2

    :cond_3
    move v0, p0

    :goto_2
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    :goto_3
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    return-object v1

    :goto_4
    invoke-interface {p1}, Ljava/lang/AutoCloseable;->close()V

    throw p0
.end method

.method private static synthetic s(Ltb/a;)Ll83/a0;
    .locals 1

    const-string v0, "DELETE FROM smart_alarm_user_info_table"

    invoke-interface {p0, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p0

    :try_start_0
    invoke-interface {p0}, Ltb/c;->e1()Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    invoke-interface {p0}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic t(Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 38

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM smart_alarm_user_info_table LIMIT 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v0, "user_id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "window_minutes"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "upper_time_bound"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "last_triggered_at"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "sleep_score_goal"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "recovery_score_goal"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "goal"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "enabled"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "last_updated_at"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "schedule_enabled"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "day_of_week"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "enrolled_weekly_plan"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "weekly_plan_goal"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "time_zone_offset"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "alarm_bounds"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "weekly_plan_hour_goal"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_d

    move/from16 v17, v14

    move/from16 v19, v15

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v3, v14

    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object/from16 v23, v18

    goto :goto_0

    :cond_0
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v23, v4

    :goto_0
    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v24, v18

    goto :goto_1

    :cond_1
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v24, v4

    :goto_1
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v25, v18

    goto :goto_2

    :cond_2
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v25, v4

    :goto_2
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v26, v18

    goto :goto_3

    :cond_3
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v26, v4

    :goto_3
    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object/from16 v4, v18

    goto :goto_4

    :cond_4
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    iget-object v5, v1, Lrf2/c;->c:Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    invoke-virtual {v5, v4}, Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;->toSmartGoalType(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v27

    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_5

    move/from16 v28, v6

    goto :goto_5

    :cond_5
    move/from16 v28, v5

    :goto_5
    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v4, v7

    if-eqz v4, :cond_6

    move/from16 v31, v6

    goto :goto_6

    :cond_6
    move/from16 v31, v5

    :goto_6
    invoke-interface {v2, v12}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v4, v18

    goto :goto_7

    :cond_7
    invoke-interface {v2, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_7
    iget-object v7, v1, Lrf2/c;->d:Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    invoke-virtual {v7, v4}, Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;->toDayOfWeekType(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move-result-object v32

    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v4, v7

    if-eqz v4, :cond_8

    move/from16 v33, v6

    :goto_8
    move/from16 v4, v17

    goto :goto_9

    :cond_8
    move/from16 v33, v5

    goto :goto_8

    :goto_9
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_9

    move-object/from16 v34, v18

    :goto_a
    move/from16 v4, p1

    goto :goto_b

    :cond_9
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v34, v4

    goto :goto_a

    :goto_b
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_a

    move-object/from16 v35, v18

    :goto_c
    move/from16 v4, v16

    goto :goto_d

    :cond_a
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v35, v4

    goto :goto_c

    :goto_d
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_b

    move-object/from16 v36, v18

    :goto_e
    move/from16 v4, v19

    goto :goto_f

    :cond_b
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v36, v4

    goto :goto_e

    :goto_f
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_10
    move-object/from16 v37, v18

    goto :goto_11

    :cond_c
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    goto :goto_10

    :goto_11
    new-instance v20, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move/from16 v21, v0

    move/from16 v22, v3

    invoke-direct/range {v20 .. v37}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v18, v20

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_13

    :cond_d
    :goto_12
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v18

    :goto_13
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic u(Ltb/a;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 38

    move-object/from16 v1, p0

    const-string v0, "SELECT * FROM smart_alarm_user_info_table LIMIT 1"

    move-object/from16 v2, p1

    invoke-interface {v2, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v2

    :try_start_0
    const-string v0, "user_id"

    invoke-static {v2, v0}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v0

    const-string v3, "window_minutes"

    invoke-static {v2, v3}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v3

    const-string v4, "upper_time_bound"

    invoke-static {v2, v4}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v4

    const-string v5, "last_triggered_at"

    invoke-static {v2, v5}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v5

    const-string v6, "sleep_score_goal"

    invoke-static {v2, v6}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v6

    const-string v7, "recovery_score_goal"

    invoke-static {v2, v7}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v7

    const-string v8, "goal"

    invoke-static {v2, v8}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v8

    const-string v9, "enabled"

    invoke-static {v2, v9}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v9

    const-string v10, "last_updated_at"

    invoke-static {v2, v10}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v10

    const-string v11, "schedule_enabled"

    invoke-static {v2, v11}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v11

    const-string v12, "day_of_week"

    invoke-static {v2, v12}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v12

    const-string v13, "enrolled_weekly_plan"

    invoke-static {v2, v13}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v13

    const-string v14, "weekly_plan_goal"

    invoke-static {v2, v14}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v14

    const-string v15, "time_zone_offset"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 p1, v15

    const-string v15, "alarm_bounds"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    move/from16 v16, v15

    const-string v15, "weekly_plan_hour_goal"

    invoke-static {v2, v15}, Ljc/x;->N(Ltb/c;Ljava/lang/String;)I

    move-result v15

    invoke-interface {v2}, Ltb/c;->e1()Z

    move-result v17

    const/16 v18, 0x0

    if-eqz v17, :cond_d

    move/from16 v17, v14

    move/from16 v19, v15

    invoke-interface {v2, v0}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v0, v14

    invoke-interface {v2, v3}, Ltb/c;->getLong(I)J

    move-result-wide v14

    long-to-int v3, v14

    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object/from16 v23, v18

    goto :goto_0

    :cond_0
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v23, v4

    :goto_0
    invoke-interface {v2, v5}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v24, v18

    goto :goto_1

    :cond_1
    invoke-interface {v2, v5}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v24, v4

    :goto_1
    invoke-interface {v2, v6}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_2

    move-object/from16 v25, v18

    goto :goto_2

    :cond_2
    invoke-interface {v2, v6}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v25, v4

    :goto_2
    invoke-interface {v2, v7}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_3

    move-object/from16 v26, v18

    goto :goto_3

    :cond_3
    invoke-interface {v2, v7}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v26, v4

    :goto_3
    invoke-interface {v2, v8}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object/from16 v4, v18

    goto :goto_4

    :cond_4
    invoke-interface {v2, v8}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_4
    iget-object v5, v1, Lrf2/c;->c:Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;

    invoke-virtual {v5, v4}, Lcom/whoop/data/local/room/entity/SmartAlarmGoalTypeConverter;->toSmartGoalType(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object v27

    invoke-interface {v2, v9}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v4, :cond_5

    move/from16 v28, v6

    goto :goto_5

    :cond_5
    move/from16 v28, v5

    :goto_5
    invoke-interface {v2, v10}, Ltb/c;->getLong(I)J

    move-result-wide v29

    invoke-interface {v2, v11}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v4, v7

    if-eqz v4, :cond_6

    move/from16 v31, v6

    goto :goto_6

    :cond_6
    move/from16 v31, v5

    :goto_6
    invoke-interface {v2, v12}, Ltb/c;->isNull(I)Z

    move-result v4

    if-eqz v4, :cond_7

    move-object/from16 v4, v18

    goto :goto_7

    :cond_7
    invoke-interface {v2, v12}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    :goto_7
    iget-object v7, v1, Lrf2/c;->d:Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;

    invoke-virtual {v7, v4}, Lcom/whoop/data/local/room/entity/ScheduleDayOfWeekTypeConverter;->toDayOfWeekType(Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move-result-object v32

    invoke-interface {v2, v13}, Ltb/c;->getLong(I)J

    move-result-wide v7

    long-to-int v4, v7

    if-eqz v4, :cond_8

    move/from16 v33, v6

    :goto_8
    move/from16 v4, v17

    goto :goto_9

    :cond_8
    move/from16 v33, v5

    goto :goto_8

    :goto_9
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_9

    move-object/from16 v34, v18

    :goto_a
    move/from16 v4, p1

    goto :goto_b

    :cond_9
    invoke-interface {v2, v4}, Ltb/c;->getLong(I)J

    move-result-wide v4

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    move-object/from16 v34, v4

    goto :goto_a

    :goto_b
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_a

    move-object/from16 v35, v18

    :goto_c
    move/from16 v4, v16

    goto :goto_d

    :cond_a
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v35, v4

    goto :goto_c

    :goto_d
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_b

    move-object/from16 v36, v18

    :goto_e
    move/from16 v4, v19

    goto :goto_f

    :cond_b
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v36, v4

    goto :goto_e

    :goto_f
    invoke-interface {v2, v4}, Ltb/c;->isNull(I)Z

    move-result v5

    if-eqz v5, :cond_c

    :goto_10
    move-object/from16 v37, v18

    goto :goto_11

    :cond_c
    invoke-interface {v2, v4}, Ltb/c;->J0(I)Ljava/lang/String;

    move-result-object v18

    goto :goto_10

    :goto_11
    new-instance v20, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move/from16 v21, v0

    move/from16 v22, v3

    invoke-direct/range {v20 .. v37}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v18, v20

    goto :goto_12

    :catchall_0
    move-exception v0

    goto :goto_13

    :cond_d
    :goto_12
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    return-object v18

    :goto_13
    invoke-interface {v2}, Ljava/lang/AutoCloseable;->close()V

    throw v0
.end method

.method private synthetic v(Lsf2/a;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lrf2/c;->e:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic w(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Ltb/a;)Ll83/a0;
    .locals 1

    iget-object v0, p0, Lrf2/c;->b:Landroidx/room/k;

    invoke-virtual {v0, p2, p1}, Landroidx/room/k;->insert(Ltb/a;Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private synthetic x(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lrf2/a;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public a(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lrf/p;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lrf/p;-><init>(Ljava/lang/Object;I)V

    const/4 v3, 0x0

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    const-string v1, "smart_alarm_user_info_table"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lpf/b;

    const/16 v3, 0x18

    invoke-direct {v2, p0, v3}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1, v2}, Ldt/b;->l(Landroidx/room/z0;[Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lec3/l1;

    move-result-object v0

    return-object v0
.end method

.method public d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lrf2/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lrf2/b;-><init>(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;I)V

    invoke-static {v0, v1, p2}, Lge3/g;->M(Landroidx/room/z0;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public deleteAll(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lr61/h;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lr61/h;-><init>(I)V

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v0, v2, v3, v1, p1}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lr51/d;

    const/4 v2, 0x2

    invoke-direct {v1, p1, v2}, Lr51/d;-><init>(Ljava/lang/String;I)V

    const/4 p1, 0x1

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lrf2/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lrf2/b;-><init>(Lrf2/c;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;I)V

    const/4 p1, 0x0

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public g(Lsf2/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsf2/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lrf2/c;->a:Landroidx/room/z0;

    new-instance v1, Lq11/c;

    const/16 v2, 0x11

    invoke-direct {v1, v2, p0, p1}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 p1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2, v1, p2}, Lge3/g;->N(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
