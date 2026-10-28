.class final Lcom/whoop/puffin/sync/c$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/sync/c;->i(Ly42/a;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/whoop/puffin/sync/f;",
        "historicalPullState",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/puffin/sync/f;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatterySyncHolder$invokeAndGetTerminalState$3"
    f = "BatterySyncHolder.kt"
    l = {
        0x51,
        0x5d,
        0x66,
        0x68
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvk0/i;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/puffin/sync/c;


# direct methods
.method public constructor <init>(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/c;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/c$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    iput-object p2, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

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

    new-instance v0, Lcom/whoop/puffin/sync/c$e;

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    iget-object v2, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/puffin/sync/c$e;-><init>(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/puffin/sync/f;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/c$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/puffin/sync/c$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/puffin/sync/c$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/puffin/sync/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/puffin/sync/c$e;->f(Lcom/whoop/puffin/sync/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/f;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/puffin/sync/c$e;->x:I

    const-string v9, "Received response from puffin - "

    const/4 v2, 0x4

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v6, 0x1

    const/4 v10, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v6, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto/16 :goto_2

    :cond_3
    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/e;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    check-cast v0, Ll83/n;

    iget-object v0, v0, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v1}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v1

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v11, "Got state "

    invoke-direct {v7, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    new-array v11, v10, [Lqr2/a$a;

    invoke-interface {v1, v7, v11}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of v1, v0, Lcom/whoop/puffin/sync/f$a;

    const/4 v7, 0x0

    if-eqz v1, :cond_9

    check-cast v0, Lcom/whoop/puffin/sync/f$a;

    invoke-virtual {v0}, Lcom/whoop/puffin/sync/f$a;->f()Lcom/whoop/puffin/sync/e;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/puffin/sync/e$d;

    if-eqz v1, :cond_6

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v1}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v1

    const-string v2, "burst success"

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    move-object v1, v0

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

    check-cast v1, Lcom/whoop/puffin/sync/e$d;

    invoke-virtual {v1}, Lcom/whoop/puffin/sync/e$d;->b()La52/d;

    move-result-object v1

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->w:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/puffin/sync/c$e;->x:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v1}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v1

    invoke-static {v0}, Ll83/n;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_4

    :cond_6
    move-object v1, v0

    nop

    instance-of v0, v1, Lcom/whoop/puffin/sync/e$b;

    if-nez v0, :cond_d

    instance-of v0, v1, Lcom/whoop/puffin/sync/e$a;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v0}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v0

    const-string v2, "burst failure"

    new-array v3, v10, [Lqr2/a$a;

    invoke-interface {v0, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

    check-cast v1, Lcom/whoop/puffin/sync/e$a;

    invoke-virtual {v1}, Lcom/whoop/puffin/sync/e$a;->b()La52/d;

    move-result-object v1

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/puffin/sync/c$e;->x:I

    const-wide/16 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v1}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v1

    invoke-static {v0}, Ll83/n;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v9, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_4

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    instance-of v1, v0, Lcom/whoop/puffin/sync/f$b$a;

    if-nez v1, :cond_d

    instance-of v1, v0, Lcom/whoop/puffin/sync/f$b$b;

    if-eqz v1, :cond_a

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/puffin/sync/c$e;->x:I

    invoke-static {v0, v1, p0}, Lcom/whoop/puffin/sync/c;->b(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_d

    goto :goto_3

    :cond_a
    instance-of v1, v0, Lcom/whoop/puffin/sync/f$b$c;

    if-eqz v1, :cond_b

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    invoke-static {v1}, Lcom/whoop/puffin/sync/c;->d(Lcom/whoop/puffin/sync/c;)Ltr2/n;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "puffin history sync success! "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v2, v10, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_4

    :cond_b
    instance-of v0, v0, Lcom/whoop/puffin/sync/f$b$d;

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/puffin/sync/c$e;->z:Lcom/whoop/puffin/sync/c;

    iget-object v1, p0, Lcom/whoop/puffin/sync/c$e;->E:Lvk0/i;

    iput-object v7, p0, Lcom/whoop/puffin/sync/c$e;->y:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/puffin/sync/c$e;->x:I

    invoke-static {v0, v1, p0}, Lcom/whoop/puffin/sync/c;->b(Lcom/whoop/puffin/sync/c;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_d

    :goto_3
    return-object v8

    :cond_c
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_d
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
