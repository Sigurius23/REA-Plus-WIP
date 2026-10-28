.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkout$2"
    f = "ActiveWorkoutInteractor.kt"
    l = {
        0x1fc,
        0x202,
        0x208,
        0x20d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

.field final synthetic F:Landroidx/lifecycle/k1;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Landroidx/lifecycle/k1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v5, p0

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->y:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v6, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v4, :cond_3

    if-eq v0, v3, :cond_2

    if-eq v0, v2, :cond_1

    if-ne v0, v1, :cond_0

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_1

    :cond_2
    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_3
    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v7, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {v0, v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object v0

    iget-object v7, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->b(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Li92/e;

    move-result-object v7

    invoke-interface {v7}, Li92/e;->isConnected()Z

    move-result v7

    if-nez v7, :cond_6

    iget-object v1, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    const-string v2, "noNetwork"

    invoke-static {v1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;)V

    move-object v2, v0

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v1, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v3, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    iput-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    iput v4, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->y:I

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->Q(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_2

    :cond_5
    return-object v0

    :cond_6
    iget-object v4, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v7, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    iput-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    iput v3, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->y:I

    invoke-static {v4, v0, v7, v5}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->k(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_7

    goto/16 :goto_2

    :cond_7
    :goto_0
    check-cast v3, Lu02/a;

    instance-of v4, v3, Lu02/a$c;

    if-eqz v4, :cond_8

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->d(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Ldt0/e;

    move-result-object v0

    sget-object v1, Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;->STRENGTH_TRAINER:Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;

    invoke-interface {v0, v1}, Ldt0/e;->a(Lcom/whoop/connectivityCore/dataSyncService/models/ProcessNowSource;)V

    iget-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    sget-object v21, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$c;->a:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a$a$c;

    const v25, 0x3bfff

    const/16 v26, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v6 .. v26}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;->copy$default(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/util/List;Ljava/util/List;Ljava/util/Set;Lorg/joda/time/DateTime;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/PositionInWorkout;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/CurrentSetState;Ljava/util/Map;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/WorkoutAnalytics;Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/a;ZLjava/util/Set;ZILjava/lang/Object;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-result-object v0

    return-object v0

    :cond_8
    instance-of v4, v3, Lu02/a$b$b;

    if-eqz v4, :cond_a

    move-object v4, v0

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v1, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v3, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    iput-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    iput-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->x:Ljava/lang/Object;

    iput v2, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->y:I

    move-object v2, v4

    const/4 v4, 0x0

    const/4 v6, 0x4

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->Q(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_2

    :cond_9
    :goto_1
    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object v0

    :cond_a
    move-object v2, v0

    instance-of v0, v3, Lu02/a$b$a;

    if-eqz v0, :cond_c

    iget-object v0, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v4, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    move-object v7, v3

    iget-object v3, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->F:Landroidx/lifecycle/k1;

    check-cast v7, Lu02/a$b$a;

    invoke-static {v7}, Lu02/b;->c(Lu02/a$b$a;)Z

    move-result v7

    iput-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->w:Ljava/lang/Object;

    iput-object v6, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->x:Ljava/lang/Object;

    iput v1, v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$f;->y:I

    move-object v1, v4

    const/4 v4, 0x0

    move v5, v7

    const/4 v7, 0x4

    const/4 v8, 0x0

    move-object/from16 v6, p0

    invoke-static/range {v0 .. v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->T(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_b

    :goto_2
    return-object v9

    :cond_b
    :goto_3
    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object v0

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
