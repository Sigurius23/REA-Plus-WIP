.class final Lop0/e$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lop0/e;->z()V
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
    c = "com.whoop.coaching.sleepcoach.wizard.onboarding.SleepCoachOnBoardingToolTipViewModel$fetchSleepCoachOnboardingState$1"
    f = "SleepCoachOnBoardingToolTipViewModel.kt"
    l = {
        0x34
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lop0/e;


# direct methods
.method public constructor <init>(Lop0/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lop0/e;",
            "Lq83/d<",
            "-",
            "Lop0/e$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lop0/e$b;->x:Lop0/e;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lop0/e$b;

    iget-object v0, p0, Lop0/e$b;->x:Lop0/e;

    invoke-direct {p1, v0, p2}, Lop0/e$b;-><init>(Lop0/e;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lop0/e$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lop0/e$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lop0/e$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lop0/e$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lop0/e$b;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lop0/e$b;->x:Lop0/e;

    invoke-virtual {p1}, Lop0/e;->C()Lop0/d;

    move-result-object p1

    iput v2, p0, Lop0/e$b;->w:I

    invoke-virtual {p1, p0}, Lop0/d;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/String;

    iget-object v0, p0, Lop0/e$b;->x:Lop0/e;

    invoke-static {v0}, Lop0/e;->w(Lop0/e;)Ltr2/n;

    move-result-object v0

    const-string v1, "got the sleepCoachOnboardingResponse: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const-string v0, "SLEEP_COACH"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lop0/e$b;->x:Lop0/e;

    invoke-virtual {p1}, Lop0/e;->B()Landroidx/lifecycle/u0;

    move-result-object v0

    sget-object v1, Lop0/f;->b:Lop0/f;

    invoke-static {p1, v0, v1}, Lop0/e;->y(Lop0/e;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    const-string v0, "COMPLETE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lop0/e$b;->x:Lop0/e;

    invoke-virtual {p1}, Lop0/e;->B()Landroidx/lifecycle/u0;

    move-result-object v0

    sget-object v1, Lop0/g;->b:Lop0/g;

    invoke-static {p1, v0, v1}, Lop0/e;->y(Lop0/e;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lop0/e$b;->x:Lop0/e;

    invoke-virtual {p1}, Lop0/e;->B()Landroidx/lifecycle/u0;

    move-result-object v0

    sget-object v1, Lop0/b;->b:Lop0/b;

    invoke-static {p1, v0, v1}, Lop0/e;->y(Lop0/e;Landroidx/lifecycle/p0;Ljava/lang/Object;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
