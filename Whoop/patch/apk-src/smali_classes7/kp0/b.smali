.class public abstract Lkp0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lkp0/a;",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "a",
        "(Lkp0/a;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "sleep-coach_release"
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
.method public static final a(Lkp0/a;)Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkp0/f;

    if-eqz v0, :cond_0

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->IN_THE_GREEN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_0
    instance-of v0, p0, Lkp0/n;

    if-eqz v0, :cond_7

    check-cast p0, Lkp0/n;

    invoke-virtual {p0}, Lkp0/n;->d()Lkp0/o;

    move-result-object p0

    sget-object v0, Lkp0/l;->z:Lkp0/l;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_1
    sget-object v0, Lkp0/m;->z:Lkp0/m;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_2
    sget-object v0, Lkp0/d;->z:Lkp0/d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_3
    instance-of v0, p0, Lkp0/k;

    if-eqz v0, :cond_4

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_OPTIMIZE_SLEEP:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_4
    instance-of v0, p0, Lkp0/q;

    if-eqz v0, :cond_5

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_5
    instance-of p0, p0, Lkp0/r;

    if-eqz p0, :cond_6

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_6
    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->SLEEP_HEALTH_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_7
    instance-of v0, p0, Lkp0/c;

    if-eqz v0, :cond_e

    check-cast p0, Lkp0/c;

    invoke-virtual {p0}, Lkp0/c;->d()Lkp0/o;

    move-result-object p0

    sget-object v0, Lkp0/l;->z:Lkp0/l;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PEAK:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_8
    sget-object v0, Lkp0/m;->z:Lkp0/m;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_PERFORM:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_9
    sget-object v0, Lkp0/d;->z:Lkp0/d;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_GET_BY:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_a
    instance-of v0, p0, Lkp0/q;

    if-eqz v0, :cond_b

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_WEEKLY_PLAN:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_b
    instance-of v0, p0, Lkp0/r;

    if-eqz v0, :cond_c

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_SLEEP_HOURS:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_c
    instance-of p0, p0, Lkp0/k;

    if-eqz p0, :cond_d

    sget-object p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->EXACT_TIME_OPTIMIZE_SLEEP:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object p0

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_e
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
