.class final Lpu2/f$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lpu2/f;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/i;Lou2/a;Lpu2/d;Lnu2/b;Liu2/a;Ltd1/b;Lnu2/e;Lnu2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroidx/lifecycle/k1;Lbc3/c0;Lpu2/b;Leq1/a;Lus0/g;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
        "activeWorkout",
        "Lfu2/a;",
        "action",
        "<anonymous>",
        "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$activeWorkoutFlow$2"
    f = "ActiveWorkoutViewModel.kt"
    l = {
        0x54
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lpu2/f;

.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/f;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Lpu2/f;",
            "Lq83/d<",
            "-",
            "Lpu2/f$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lpu2/f$b;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iput-object p2, p0, Lpu2/f$b;->E:Lpu2/f;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lfu2/a;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lpu2/f$b;

    iget-object v1, p0, Lpu2/f$b;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v2, p0, Lpu2/f$b;->E:Lpu2/f;

    invoke-direct {v0, v1, v2, p3}, Lpu2/f$b;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/f;Lq83/d;)V

    iput-object p1, v0, Lpu2/f$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Lpu2/f$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lpu2/f$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    check-cast p2, Lfu2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lpu2/f$b;->f(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Lpu2/f$b;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v0, p0, Lpu2/f$b;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lfu2/a;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lpu2/f$b;->w:I

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lpu2/f$b;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object p1, p0, Lpu2/f$b;->E:Lpu2/f;

    invoke-static {p1}, Lpu2/f;->j(Lpu2/f;)Lbc3/c0;

    move-result-object p1

    iget-object v5, p0, Lpu2/f$b;->E:Lpu2/f;

    invoke-static {v5}, Lpu2/f;->p(Lpu2/f;)Landroidx/lifecycle/k1;

    move-result-object v5

    const/4 v6, 0x0

    iput-object v6, p0, Lpu2/f$b;->x:Ljava/lang/Object;

    iput-object v6, p0, Lpu2/f$b;->y:Ljava/lang/Object;

    iput v4, p0, Lpu2/f$b;->w:I

    move-object v6, p0

    move-object v4, p1

    invoke-virtual/range {v1 .. v6}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->X(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;Lbc3/c0;Landroidx/lifecycle/k1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
