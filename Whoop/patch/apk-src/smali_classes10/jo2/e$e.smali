.class final Ljo2/e$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ljo2/e;->i(JZLjava/lang/Throwable;)Lbc3/k1;
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
    c = "com.whoop.universalcheckout.features.checkout.domain.StripeFlowControllerManager$configureFlowControllerCallback$1"
    f = "StripeFlowControllerManager.kt"
    l = {
        0xd7,
        0xe1
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:J

.field final synthetic F:Ljo2/e;

.field final synthetic G:Z

.field final synthetic H:Ljava/lang/Throwable;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(JLjo2/e;ZLjava/lang/Throwable;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljo2/e;",
            "Z",
            "Ljava/lang/Throwable;",
            "Lq83/d<",
            "-",
            "Ljo2/e$e;",
            ">;)V"
        }
    .end annotation

    iput-wide p1, p0, Ljo2/e$e;->E:J

    iput-object p3, p0, Ljo2/e$e;->F:Ljo2/e;

    iput-boolean p4, p0, Ljo2/e$e;->G:Z

    iput-object p5, p0, Ljo2/e$e;->H:Ljava/lang/Throwable;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Ljo2/e$e;

    iget-wide v1, p0, Ljo2/e$e;->E:J

    iget-object v3, p0, Ljo2/e$e;->F:Ljo2/e;

    iget-boolean v4, p0, Ljo2/e$e;->G:Z

    iget-object v5, p0, Ljo2/e$e;->H:Ljava/lang/Throwable;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Ljo2/e$e;-><init>(JLjo2/e;ZLjava/lang/Throwable;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Ljo2/e$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ljo2/e$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ljo2/e$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Ljo2/e$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Ljo2/e$e;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v2, v0, Ljo2/e$e;->x:Ljava/lang/Object;

    check-cast v2, Ljo2/c;

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v2, v0, Ljo2/e$e;->y:Ljava/lang/Object;

    check-cast v2, Ljo2/c;

    iget-object v2, v0, Ljo2/e$e;->x:Ljava/lang/Object;

    check-cast v2, Lq20/e;

    :goto_0
    iget-object v2, v0, Ljo2/e$e;->w:Ljava/lang/Object;

    check-cast v2, Ljo2/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v6, v0, Ljo2/e$e;->E:J

    iget-object v3, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v3}, Ljo2/e;->c(Ljo2/e;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v8

    cmp-long v3, v6, v8

    if-eqz v3, :cond_3

    return-object v1

    :cond_3
    iget-object v3, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v3}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v3

    check-cast v3, Lec3/h2;

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljo2/c;

    iget-boolean v6, v0, Ljo2/e$e;->G:Z

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    iget-object v4, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v4}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljo2/c;

    invoke-virtual {v4}, Ljo2/c;->e()Lh20/d2;

    move-result-object v4

    check-cast v4, Ln20/i;

    iget-object v6, v4, Ln20/i;->h:Ln20/u;

    iget-object v6, v6, Ln20/u;->E:Lq20/y;

    if-eqz v6, :cond_4

    iget-object v4, v4, Ln20/i;->c:Lpg3/p;

    invoke-virtual {v4, v6}, Lpg3/p;->f(Lq20/y;)Lq20/e;

    move-result-object v4

    move-object v15, v4

    goto :goto_1

    :cond_4
    move-object v15, v7

    :goto_1
    iget-object v4, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v4}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v4

    check-cast v4, Lec3/h2;

    invoke-virtual {v4}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Ljo2/c;

    iget-wide v9, v0, Ljo2/e$e;->E:J

    new-instance v4, Ljava/lang/Long;

    invoke-direct {v4, v9, v10}, Ljava/lang/Long;-><init>(J)V

    const/16 v18, 0x130

    const/16 v19, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    move-object/from16 v16, v15

    move-object v10, v4

    invoke-static/range {v8 .. v19}, Ljo2/c;->b(Ljo2/c;ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;ILjava/lang/Object;)Ljo2/c;

    move-result-object v4

    invoke-virtual {v3}, Ljo2/c;->e()Lh20/d2;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljo2/c;->m(Lh20/d2;)V

    iget-object v3, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v3}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v3

    iput-object v7, v0, Ljo2/e$e;->w:Ljava/lang/Object;

    iput-object v7, v0, Ljo2/e$e;->x:Ljava/lang/Object;

    iput-object v7, v0, Ljo2/e$e;->y:Ljava/lang/Object;

    iput v5, v0, Ljo2/e$e;->z:I

    check-cast v3, Lec3/h2;

    invoke-virtual {v3, v4, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v1, v2, :cond_7

    goto :goto_3

    :cond_5
    iget-object v5, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v5}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v5

    check-cast v5, Lec3/h2;

    invoke-virtual {v5}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljo2/c;

    iget-object v5, v0, Ljo2/e$e;->H:Ljava/lang/Throwable;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    move-object v12, v5

    goto :goto_2

    :cond_6
    move-object v12, v7

    :goto_2
    const/16 v18, 0x1f0

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v8 .. v19}, Ljo2/c;->b(Ljo2/c;ZLjava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq20/e;Lq20/e;Ljava/lang/Boolean;ILjava/lang/Object;)Ljo2/c;

    move-result-object v5

    invoke-virtual {v3}, Ljo2/c;->e()Lh20/d2;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljo2/c;->m(Lh20/d2;)V

    iget-object v3, v0, Ljo2/e$e;->F:Ljo2/e;

    invoke-static {v3}, Ljo2/e;->d(Ljo2/e;)Lec3/p1;

    move-result-object v3

    iput-object v7, v0, Ljo2/e$e;->w:Ljava/lang/Object;

    iput-object v7, v0, Ljo2/e$e;->x:Ljava/lang/Object;

    iput v4, v0, Ljo2/e$e;->z:I

    check-cast v3, Lec3/h2;

    invoke-virtual {v3, v5, v0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v1, v2, :cond_7

    :goto_3
    return-object v2

    :cond_7
    :goto_4
    return-object v1
.end method
