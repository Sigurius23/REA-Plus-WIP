.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->L0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$updateTemplate$2"
    f = "ActiveWorkoutInteractor.kt"
    l = {
        0x215,
        0x215
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;


# direct methods
.method public constructor <init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;-><init>(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->y:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->x:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iget-object v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->z:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->E:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->w:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->x:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->y:I

    invoke-static {p1, v1, p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->p(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move-object v5, v3

    move-object v3, p1

    move-object p1, v5

    :goto_0
    check-cast p1, Lu02/a;

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->w:Ljava/lang/Object;

    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->x:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$n;->y:I

    invoke-static {v3, v1, p1, p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->i(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lu02/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    return-object p1
.end method
