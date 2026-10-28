.class final Ltl1/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ltl1/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Ltl1/a;",
        "currentState",
        "Lil1/c;",
        "currentAction",
        "<anonymous>",
        "(Ltl1/a;Lil1/c;)Ltl1/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.domain.dayOneTransition.DayOneTransitionInteractor$interact$1"
    f = "DayOneTransitionInteractor.kt"
    l = {
        0x31
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Ltl1/c;


# direct methods
.method public constructor <init>(Ltl1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltl1/c;",
            "Lq83/d<",
            "-",
            "Ltl1/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Ltl1/c$b;->z:Ltl1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Ltl1/a;Lil1/c;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltl1/a;",
            "Lil1/c;",
            "Lq83/d<",
            "-",
            "Ltl1/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Ltl1/c$b;

    iget-object v1, p0, Ltl1/c$b;->z:Ltl1/c;

    invoke-direct {v0, v1, p3}, Ltl1/c$b;-><init>(Ltl1/c;Lq83/d;)V

    iput-object p1, v0, Ltl1/c$b;->x:Ljava/lang/Object;

    iput-object p2, v0, Ltl1/c$b;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Ltl1/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ltl1/a;

    check-cast p2, Lil1/c;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Ltl1/c$b;->f(Ltl1/a;Lil1/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Ltl1/c$b;->x:Ljava/lang/Object;

    check-cast v0, Ltl1/a;

    iget-object v1, p0, Ltl1/c$b;->y:Ljava/lang/Object;

    check-cast v1, Lil1/c;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Ltl1/c$b;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Lil1/c$c;

    const/4 v3, 0x0

    if-eqz p1, :cond_2

    check-cast v1, Lil1/c$c;

    invoke-virtual {v1}, Lil1/c$c;->a()Z

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v3}, Ltl1/a;->b(Ltl1/a;ZZILjava/lang/Object;)Ltl1/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v1, Lil1/c$b;

    if-eqz p1, :cond_4

    iget-object p1, p0, Ltl1/c$b;->z:Ltl1/c;

    check-cast v1, Lil1/c$b;

    invoke-virtual {v1}, Lil1/c$b;->a()I

    move-result v1

    iput-object v3, p0, Ltl1/c$b;->x:Ljava/lang/Object;

    iput-object v3, p0, Ltl1/c$b;->y:Ljava/lang/Object;

    iput v4, p0, Ltl1/c$b;->w:I

    invoke-static {p1, v0, v1, p0}, Ltl1/c;->g(Ltl1/c;Ltl1/a;ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    check-cast p1, Ltl1/a;

    return-object p1

    :cond_4
    instance-of p1, v1, Lil1/c$a;

    if-eqz p1, :cond_6

    check-cast v1, Lil1/c$a;

    invoke-virtual {v1}, Lil1/c$a;->a()Ljava/lang/String;

    move-result-object p1

    const-string v1, "WHOOP_COACH_ONBOARDING"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Ltl1/c$b;->z:Ltl1/c;

    invoke-static {p1}, Ltl1/c;->e(Ltl1/c;)Lu92/d;

    move-result-object p1

    const-string v1, "WHOOP_COACH_ONBOARDING_COMPLETED"

    invoke-virtual {p1, v1, v4}, Lu92/d;->q(Ljava/lang/String;Z)V

    :cond_5
    return-object v0

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
