.class final Lvg0/h0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/h0;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lvg0/j0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.MarkTurnAsSeenInteractor$interact$1$1"
    f = "MarkTurnAsSeenInteractor.kt"
    l = {
        0x2e,
        0x32,
        0x36,
        0x41,
        0x46
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/h0;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvg0/g0;


# direct methods
.method public constructor <init>(Lvg0/g0;Lvg0/h0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/g0;",
            "Lvg0/h0;",
            "Lq83/d<",
            "-",
            "Lvg0/h0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/h0$b;->z:Lvg0/g0;

    iput-object p2, p0, Lvg0/h0$b;->E:Lvg0/h0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lvg0/h0$b;

    iget-object v1, p0, Lvg0/h0$b;->z:Lvg0/g0;

    iget-object v2, p0, Lvg0/h0$b;->E:Lvg0/h0;

    invoke-direct {v0, v1, v2, p2}, Lvg0/h0$b;-><init>(Lvg0/g0;Lvg0/h0;Lq83/d;)V

    iput-object p1, v0, Lvg0/h0$b;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/h0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/h0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/h0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/h0$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvg0/h0$b;->x:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const/4 v13, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lvg0/h0$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-virtual {v0}, Lvg0/g0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    new-instance v0, Lvg0/j0$a;

    const-string v1, "Conversation fingerprint is missing"

    invoke-direct {v0, v1}, Lvg0/j0$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    iput v3, p0, Lvg0/h0$b;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_4

    :cond_6
    :goto_1
    return-object v12

    :cond_7
    iget-object v0, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-virtual {v0}, Lvg0/g0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_9

    new-instance v0, Lvg0/j0$a;

    const-string v1, "Turn ID is missing"

    invoke-direct {v0, v1}, Lvg0/j0$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    iput v2, p0, Lvg0/h0$b;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_8

    goto/16 :goto_4

    :cond_8
    :goto_2
    return-object v12

    :cond_9
    sget-object v0, Lu02/a;->a:Lu02/a$a;

    iget-object v2, p0, Lvg0/h0$b;->E:Lvg0/h0;

    invoke-static {v2}, Lvg0/h0;->d(Lvg0/h0;)Ltr2/n;

    move-result-object v2

    new-instance v4, Lvg0/h0$b$a;

    iget-object v3, p0, Lvg0/h0$b;->E:Lvg0/h0;

    iget-object v6, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-direct {v4, v3, v6, v13}, Lvg0/h0$b$a;-><init>(Lvg0/h0;Lvg0/g0;Lq83/d;)V

    iput-object v8, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    iput v1, p0, Lvg0/h0$b;->x:I

    move-object v1, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_a

    goto/16 :goto_4

    :cond_a
    :goto_3
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    iget-object v0, p0, Lvg0/h0$b;->E:Lvg0/h0;

    invoke-static {v0}, Lvg0/h0;->d(Lvg0/h0;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-virtual {v1}, Lvg0/g0;->d()Ljava/lang/String;

    move-result-object v1

    sget-object v3, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    iget-object v3, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-virtual {v3}, Lvg0/g0;->b()J

    move-result-wide v3

    sget-object v6, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v3, v4, v6}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v3

    invoke-static {v3, v4}, Lkotlin/time/Duration;->getInWholeSeconds-impl(J)J

    move-result-wide v3

    const-string v6, "Turn marked as seen. TurnId: "

    const-string v7, " in: "

    invoke-static {v6, v1, v3, v4, v7}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "s"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lvg0/j0$b;->a:Lvg0/j0$b;

    iput-object v13, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/h0$b;->w:Ljava/lang/Object;

    iput v11, p0, Lvg0/h0$b;->x:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    goto :goto_4

    :cond_b
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_d

    iget-object v1, p0, Lvg0/h0$b;->E:Lvg0/h0;

    invoke-static {v1}, Lvg0/h0;->d(Lvg0/h0;)Ltr2/n;

    move-result-object v1

    iget-object v3, p0, Lvg0/h0$b;->z:Lvg0/g0;

    invoke-virtual {v3}, Lvg0/g0;->d()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Failed to mark turn as seen. TurnId: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v3, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v1, Lvg0/j0$a;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lvg0/j0$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/h0$b;->y:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/h0$b;->w:Ljava/lang/Object;

    iput v10, p0, Lvg0/h0$b;->x:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    :goto_4
    return-object v9

    :cond_c
    :goto_5
    return-object v12

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
