.class final Ljt2/f$e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljt2/f$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.weeklyplan.hubandspoke.domain.HubAndSpokeApiInteractor$save$1$response$1"
    f = "HubAndSpokeApiInteractor.kt"
    l = {
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Ljt2/f;

.field final synthetic y:Ljt2/l$g;


# direct methods
.method public constructor <init>(Ljt2/f;Ljt2/l$g;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/f;",
            "Ljt2/l$g;",
            "Lq83/d<",
            "-",
            "Ljt2/f$e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ljt2/f$e$a;->x:Ljt2/f;

    iput-object p2, p0, Ljt2/f$e$a;->y:Ljt2/l$g;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Ljt2/f$e$a;

    iget-object v1, p0, Ljt2/f$e$a;->x:Ljt2/f;

    iget-object v2, p0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-direct {v0, v1, v2, p1}, Ljt2/f$e$a;-><init>(Ljt2/f;Ljt2/l$g;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Ljt2/f$e$a;->invoke(Lq83/d;)Ljava/lang/Object;

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
    invoke-virtual {p0, p1}, Ljt2/f$e$a;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljt2/f$e$a;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Ljt2/f$e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Ljt2/f$e$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Ljt2/f$e$a;->x:Ljt2/f;

    invoke-static {v2}, Ljt2/f;->e(Ljt2/f;)Lcom/whoop/weeklyplan/api/WeeklyPlanApi;

    move-result-object v2

    iget-object v4, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v4}, Ljt2/l$g;->d()Ljava/lang/String;

    move-result-object v4

    iget-object v5, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v5}, Ljt2/l$g;->c()Z

    move-result v5

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->e()Ljava/lang/String;

    move-result-object v8

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->j()Z

    move-result v9

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->g()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    iget-object v7, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v6, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljt2/r;

    new-instance v13, Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;

    invoke-virtual {v12}, Ljt2/r;->a()D

    move-result-wide v14

    invoke-virtual {v12}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    invoke-virtual {v12}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v11

    move-object/from16 v16, v6

    sget-object v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_PERFORMANCE:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v11, v6, :cond_3

    invoke-virtual {v12}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v6

    sget-object v11, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_HOURS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v6, v11, :cond_3

    invoke-virtual {v12}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v6

    sget-object v11, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_CONSISTENCY:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-ne v6, v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v6, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    invoke-virtual {v7}, Ljt2/l$g;->c()Z

    move-result v6

    :goto_2
    invoke-direct {v13, v14, v15, v3, v6}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/TargetGoal;-><init>(DLcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Z)V

    invoke-interface {v10, v13}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v6, v16

    const/4 v3, 0x1

    const/16 v11, 0xa

    goto :goto_0

    :cond_4
    iget-object v3, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v3}, Ljt2/l$g;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v6, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljt2/b;

    new-instance v11, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorGoal;

    invoke-virtual {v7}, Ljt2/b;->d()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    invoke-virtual {v7}, Ljt2/b;->c()I

    move-result v13

    invoke-virtual {v7}, Ljt2/b;->e()Z

    move-result v7

    invoke-direct {v11, v12, v13, v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/BehaviorGoal;-><init>(IIZ)V

    invoke-interface {v6, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    iget-object v3, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v3}, Ljt2/l$g;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v3, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v7, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljt2/a;

    new-instance v12, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityGoal;

    invoke-virtual {v11}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Ljt2/a;->d()I

    move-result v11

    invoke-direct {v12, v13, v11}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/ActivityGoal;-><init>(Ljava/lang/String;I)V

    invoke-interface {v7, v12}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    new-instance v3, Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;

    invoke-direct {v3, v10, v6, v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;-><init>(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->h()Ljava/lang/String;

    move-result-object v11

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->f()Ljava/lang/String;

    move-result-object v12

    iget-object v6, v0, Ljt2/f$e$a;->y:Ljt2/l$g;

    invoke-virtual {v6}, Ljt2/l$g;->i()Ljava/lang/String;

    move-result-object v13

    new-instance v7, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;

    move-object v10, v3

    invoke-direct/range {v7 .. v13}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;-><init>(Ljava/lang/String;ZLcom/whoop/weeklyplan/hubandspoke/domain/api/PlanSelections;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x1

    iput v3, v0, Ljt2/f$e$a;->w:I

    invoke-interface {v2, v4, v7, v5, v0}, Lcom/whoop/weeklyplan/api/WeeklyPlanApi;->saveHubAndSpoke(Ljava/lang/String;Lcom/whoop/weeklyplan/hubandspoke/domain/api/SaveHubAndSpokeBody;ZLq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_7

    return-object v1

    :cond_7
    return-object v2
.end method
