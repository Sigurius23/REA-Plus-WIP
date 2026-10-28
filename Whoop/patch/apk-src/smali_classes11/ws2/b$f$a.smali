.class final Lws2/b$f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lws2/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lpg3/v0;",
        "Ll83/a0;",
        "<anonymous>",
        "()Lpg3/v0;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weeklyplan.customizeplan.domain.CustomizePlanApiInteractor$updateTargetMetric$2$response$1"
    f = "CustomizePlanApiInteractor.kt"
    l = {
        0x47,
        0x53,
        0x5d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/String;

.field w:I

.field final synthetic x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

.field final synthetic y:Lws2/b;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Lws2/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;",
            "Lws2/b;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lws2/b$f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    iput-object p2, p0, Lws2/b$f$a;->y:Lws2/b;

    iput-object p3, p0, Lws2/b$f$a;->z:Ljava/lang/String;

    iput-object p4, p0, Lws2/b$f$a;->E:Ljava/lang/String;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lws2/b$f$a;

    iget-object v1, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    iget-object v2, p0, Lws2/b$f$a;->y:Lws2/b;

    iget-object v3, p0, Lws2/b$f$a;->z:Ljava/lang/String;

    iget-object v4, p0, Lws2/b$f$a;->E:Ljava/lang/String;

    move-object v5, p1

    invoke-direct/range {v0 .. v5}, Lws2/b$f$a;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;Lws2/b;Ljava/lang/String;Ljava/lang/String;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lws2/b$f$a;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ll83/a0;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lws2/b$f$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lws2/b$f$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lws2/b$f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lws2/b$f$a;->w:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    const-string v5, "Confirm"

    if-eqz v1, :cond_5

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->d(Lws2/b;)Lls2/b;

    move-result-object p1

    new-instance v1, Lls2/a$c;

    iget-object v2, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;->getType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v2

    iget-object v3, p0, Lws2/b$f$a;->z:Ljava/lang/String;

    invoke-direct {v1, v2, v5, v3}, Lls2/a$c;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lls2/b;->q(Lls2/a;)V

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->e(Lws2/b;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    move-result-object p1

    iget-object v1, p0, Lws2/b$f$a;->E:Ljava/lang/String;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    iget-object v3, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;->getTarget()D

    move-result-wide v5

    iget-object v3, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;->getType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    iget-object v7, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v7, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;->getMigrateSmartAlarm()Z

    move-result v7

    invoke-direct {v2, v5, v6, v3, v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;-><init>(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)V

    iput v4, p0, Lws2/b$f$a;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/weeklyplan/api/WeeklyPlanApi;->confirmTargetStrainOrSleepV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmMetricTarget;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_5
    instance-of v1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;

    if-eqz v1, :cond_7

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->d(Lws2/b;)Lls2/b;

    move-result-object p1

    new-instance v1, Lls2/a$c;

    sget-object v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->ACTIVITIES:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v4, p0, Lws2/b$f$a;->z:Ljava/lang/String;

    invoke-direct {v1, v2, v5, v4}, Lls2/a$c;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lls2/b;->q(Lls2/a;)V

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->e(Lws2/b;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    move-result-object p1

    iget-object v1, p0, Lws2/b$f$a;->E:Ljava/lang/String;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;

    iget-object v4, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;->getActivityGoals()Ljava/util/List;

    move-result-object v4

    invoke-direct {v2, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;-><init>(Ljava/util/List;)V

    iput v3, p0, Lws2/b$f$a;->w:I

    invoke-interface {p1, v1, v2, p0}, Lcom/whoop/weeklyplan/api/WeeklyPlanApi;->confirmTargetActivitiesV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmActivityTarget;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_6
    :goto_1
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_7
    instance-of p1, p1, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->d(Lws2/b;)Lls2/b;

    move-result-object p1

    new-instance v1, Lls2/a$c;

    sget-object v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->BEHAVIORS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v4, p0, Lws2/b$f$a;->z:Ljava/lang/String;

    invoke-direct {v1, v3, v5, v4}, Lls2/a$c;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lls2/b;->q(Lls2/a;)V

    iget-object p1, p0, Lws2/b$f$a;->y:Lws2/b;

    invoke-static {p1}, Lws2/b;->e(Lws2/b;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    move-result-object p1

    iget-object v1, p0, Lws2/b$f$a;->E:Ljava/lang/String;

    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;

    iget-object v4, p0, Lws2/b$f$a;->x:Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget;

    check-cast v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;->getBehaviorGoals()Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;-><init>(Ljava/util/List;)V

    iput v2, p0, Lws2/b$f$a;->w:I

    invoke-interface {p1, v1, v3, p0}, Lcom/whoop/weeklyplan/api/WeeklyPlanApi;->confirmTargetBehaviorsV2(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/ConfirmTarget$ConfirmBehaviorTarget;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    :goto_2
    return-object v0

    :cond_8
    :goto_3
    check-cast p1, Lpg3/v0;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
