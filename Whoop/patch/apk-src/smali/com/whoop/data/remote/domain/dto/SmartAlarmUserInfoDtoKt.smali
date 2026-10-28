.class public final Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDtoKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0000\u0010\u0003\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "isExactAlarm",
        "",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z",
        "isExactWeeklyPlanAlarm",
        "core_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final isExactAlarm(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isExactWeeklyPlanAlarm(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq p0, v0, :cond_1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-ne p0, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
