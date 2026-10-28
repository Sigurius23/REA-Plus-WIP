.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->n0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$saveWorkoutAndUpdateTemplate$2"
    f = "ActiveWorkoutInteractor.kt"
    l = {
        0x226,
        0x230,
        0x231,
        0x231,
        0x236,
        0x233,
        0x23d,
        0x23a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field private synthetic J:Ljava/lang/Object;

.field final synthetic K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

.field final synthetic L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

.field final synthetic M:Landroidx/lifecycle/k1;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


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
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iput-object p3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Landroidx/lifecycle/k1;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    const/4 v3, 0x3

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k1;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v6, Lu02/a;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v6, Lbc3/i0;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v6, Lbc3/i0;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v0

    move-object v0, v7

    move-object v7, p0

    goto/16 :goto_5

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_4

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/k1;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v6, Lu02/a;

    iget-object v7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    iget-object v7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v7, Lbc3/i0;

    iget-object v7, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v5

    move-object v5, v0

    move-object v0, v7

    move-object v7, p0

    goto/16 :goto_3

    :pswitch_4
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_2

    :pswitch_5
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/i0;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_1

    :pswitch_6
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    check-cast v2, Lbc3/i0;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, p0

    goto/16 :goto_0

    :pswitch_7
    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :pswitch_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-static {p1, v2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->a(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;)Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;

    move-result-object v7

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {p1}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->b(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;)Li92/e;

    move-result-object p1

    invoke-interface {p1}, Li92/e;->isConnected()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    const-string v0, "noNetwork"

    invoke-static {p1, v0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->m(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Ljava/lang/String;)V

    iget-object v5, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v6, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v8, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    const/4 v9, 0x1

    move-object v10, p0

    invoke-static/range {v5 .. v10}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->g(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, v10

    if-ne p1, v1, :cond_0

    goto/16 :goto_6

    :cond_0
    return-object p1

    :cond_1
    move-object p1, v7

    move-object v7, p0

    new-instance v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g$a;

    iget-object v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v6, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    invoke-direct {v2, v5, p1, v6, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g$a;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;Lq83/d;)V

    invoke-static {v0, v4, v2, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v2

    new-instance v5, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g$b;

    iget-object v6, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v8, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-direct {v5, v6, v8, v4}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g$b;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)V

    invoke-static {v0, v4, v5, v3}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v0, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    invoke-virtual {v2, p0}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_6

    :cond_2
    move-object v11, v2

    move-object v2, p1

    move-object p1, v11

    :goto_0
    move-object v6, p1

    check-cast v6, Lu02/a;

    instance-of p1, v6, Lu02/a$c;

    if-eqz p1, :cond_5

    iget-object v2, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v2, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    iput v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    goto/16 :goto_6

    :cond_3
    move-object v11, v0

    move-object v0, p1

    move-object p1, v11

    :goto_1
    check-cast p1, Lu02/a;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    invoke-static {v2, v0, p1, p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object p1

    :cond_5
    instance-of p1, v6, Lu02/a$b$a;

    if-eqz p1, :cond_8

    iget-object v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v6, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    iput-object v2, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    iput-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    const/4 v8, 0x5

    iput v8, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_6

    goto/16 :goto_6

    :cond_6
    move-object v11, v5

    move-object v5, p1

    move-object p1, v0

    move-object v0, v11

    :goto_3
    instance-of p1, p1, Lu02/a$b;

    check-cast v6, Lu02/a$b$a;

    invoke-static {v6}, Lu02/b;->c(Lu02/a$b$a;)Z

    move-result v6

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    const/4 v4, 0x6

    iput v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    move-object v4, v2

    move-object v8, v7

    move-object v2, v0

    move v7, v6

    move v6, p1

    invoke-static/range {v2 .. v8}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->h(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    move-object v7, v8

    if-ne p1, v1, :cond_7

    goto :goto_6

    :cond_7
    :goto_4
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object p1

    :cond_8
    instance-of p1, v6, Lu02/a$b$b;

    if-eqz p1, :cond_b

    iget-object v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->K:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->L:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->M:Landroidx/lifecycle/k1;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v5, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object v3, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    iput-object v2, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    iput-object p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    const/4 v6, 0x7

    iput v6, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_9

    goto :goto_6

    :cond_9
    move-object v11, v5

    move-object v5, p1

    move-object p1, v0

    move-object v0, v11

    :goto_5
    instance-of v6, p1, Lu02/a$b;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->J:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->w:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->x:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->y:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->z:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->E:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->F:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->G:Ljava/lang/Object;

    iput-object v4, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->H:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, v7, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$g;->I:I

    move-object v4, v2

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->g(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lcom/whoop/weightlifting/data/dto/WeightliftingWorkoutDto;Landroidx/lifecycle/k1;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_6
    return-object v1

    :cond_a
    :goto_7
    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    return-object p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
