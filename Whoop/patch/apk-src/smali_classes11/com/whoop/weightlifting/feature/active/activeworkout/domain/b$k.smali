.class final Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->q0(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lbc3/c0;Ljava/lang/Integer;)V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkoutInteractor$scheduleSetTimerHaptics$1"
    f = "ActiveWorkoutInteractor.kt"
    l = {
        0x373,
        0x374
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Ljava/lang/Integer;

.field final synthetic F:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Integer;",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->E:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->F:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

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

    new-instance p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;

    iget-object v0, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->E:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->F:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;-><init>(Ljava/lang/Integer;Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->y:I

    iget v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->x:I

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->E:Ljava/lang/Integer;

    if-eqz p1, :cond_4

    iget-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->F:Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    sget-object v1, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v1, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {p1, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v5

    iput-object v4, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->w:Ljava/lang/Object;

    iput p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->x:I

    const/4 v1, 0x0

    iput v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->y:I

    iput v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->z:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->c(JLq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_1

    :cond_3
    move v3, p1

    :goto_0
    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->x:I

    iput v1, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->y:I

    iput v2, p0, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b$k;->z:I

    invoke-static {v4, p0}, Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;->j(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
