.class final Lvk2/d$c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvk2/d$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Lvk2/b;",
        "progress",
        "Lmk2/w;",
        "update",
        "<anonymous>",
        "(Lvk2/b;Lmk2/w;)Lvk2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.trackactivity.service.TrackSessionStateHolder$start$2$2"
    f = "TrackSessionStateHolder.kt"
    l = {
        0x97,
        0xb5
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:J

.field G:J

.field H:J

.field I:I

.field synthetic J:Ljava/lang/Object;

.field synthetic K:Ljava/lang/Object;

.field final synthetic L:Lvk2/d;

.field final synthetic M:J

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvk2/d;JLq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk2/d;",
            "J",
            "Lq83/d<",
            "-",
            "Lvk2/d$c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvk2/d$c$b;->L:Lvk2/d;

    iput-wide p2, p0, Lvk2/d$c$b;->M:J

    const/4 p1, 0x3

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvk2/b;Lmk2/w;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk2/b;",
            "Lmk2/w;",
            "Lq83/d<",
            "-",
            "Lvk2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvk2/d$c$b;

    iget-object v1, p0, Lvk2/d$c$b;->L:Lvk2/d;

    iget-wide v2, p0, Lvk2/d$c$b;->M:J

    invoke-direct {v0, v1, v2, v3, p3}, Lvk2/d$c$b;-><init>(Lvk2/d;JLq83/d;)V

    iput-object p1, v0, Lvk2/d$c$b;->J:Ljava/lang/Object;

    iput-object p2, v0, Lvk2/d$c$b;->K:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvk2/d$c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvk2/b;

    check-cast p2, Lmk2/w;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvk2/d$c$b;->f(Lvk2/b;Lmk2/w;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    move-object/from16 v6, p0

    iget-object v0, v6, Lvk2/d$c$b;->J:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lvk2/b;

    iget-object v0, v6, Lvk2/d$c$b;->K:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lmk2/w;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v6, Lvk2/d$c$b;->I:I

    const/4 v9, 0x2

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v9, :cond_0

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v12, v6

    goto/16 :goto_3

    :catch_0
    move-exception v0

    move-object v12, v6

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-wide v0, v6, Lvk2/d$c$b;->H:J

    iget-wide v2, v6, Lvk2/d$c$b;->G:J

    iget-object v4, v6, Lvk2/d$c$b;->E:Ljava/lang/Object;

    check-cast v4, Lwk2/k;

    iget-object v5, v6, Lvk2/d$c$b;->z:Ljava/lang/Object;

    check-cast v5, Lwk2/b;

    iget-object v7, v6, Lvk2/d$c$b;->y:Ljava/lang/Object;

    check-cast v7, Lmk2/e;

    iget-object v8, v6, Lvk2/d$c$b;->x:Ljava/lang/Object;

    check-cast v8, Lvk2/b;

    iget-object v9, v6, Lvk2/d$c$b;->w:Ljava/lang/Object;

    check-cast v9, Lwk2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-wide/from16 v16, v0

    move-wide v14, v2

    move-object/from16 v22, v4

    move-object/from16 v21, v5

    move-object v12, v6

    move-object/from16 v20, v7

    move-object v13, v8

    move-object/from16 v0, p1

    goto/16 :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of v0, v5, Lmk2/w$b;

    if-eqz v0, :cond_4

    iget-object v0, v6, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->d(Lvk2/d;)Lwk2/a;

    move-result-object v0

    invoke-virtual {v7}, Lvk2/b;->d()Lwk2/b;

    move-result-object v2

    check-cast v5, Lmk2/w$b;

    invoke-virtual {v5}, Lmk2/w$b;->a()Lyg2/d;

    move-result-object v3

    invoke-virtual {v0, v2, v3}, Lwk2/a;->a(Lwk2/b;Lyg2/d;)Lwk2/b;

    move-result-object v9

    invoke-virtual {v7}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v0

    iget-object v2, v6, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v2}, Lvk2/d;->b(Lvk2/d;)J

    move-result-wide v2

    invoke-virtual {v7, v2, v3}, Lvk2/b;->i(J)J

    move-result-wide v2

    invoke-static {v0, v2, v3}, Lmk2/m;->a(Ljava/util/List;J)Lmk2/d;

    move-result-object v0

    invoke-virtual {v0}, Lmk2/d;->a()Ljava/time/Duration;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/Duration;->getSeconds()J

    move-result-wide v2

    new-instance v10, Lmk2/e;

    invoke-virtual {v5}, Lmk2/w$b;->a()Lyg2/d;

    move-result-object v0

    invoke-virtual {v9}, Lwk2/b;->a()Ljava/lang/Double;

    move-result-object v4

    invoke-direct {v10, v0, v4}, Lmk2/e;-><init>(Lyg2/d;Ljava/lang/Double;)V

    iget-object v0, v6, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->g(Lvk2/d;)Lwk2/i;

    move-result-object v0

    invoke-virtual {v7}, Lvk2/b;->h()Lwk2/k;

    move-result-object v4

    invoke-virtual {v5}, Lmk2/w$b;->a()Lyg2/d;

    move-result-object v11

    invoke-virtual {v0, v4, v11}, Lwk2/i;->a(Lwk2/k;Lyg2/d;)Lwk2/k;

    move-result-object v11

    iget-object v0, v6, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->k(Lvk2/d;)Lwk2/j;

    move-result-object v0

    invoke-virtual {v7}, Lvk2/b;->g()Lxk2/f;

    move-result-object v4

    invoke-virtual {v5}, Lmk2/w$b;->a()Lyg2/d;

    move-result-object v5

    invoke-virtual {v7}, Lvk2/b;->c()Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x0

    iput-object v13, v6, Lvk2/d$c$b;->J:Ljava/lang/Object;

    iput-object v13, v6, Lvk2/d$c$b;->K:Ljava/lang/Object;

    iput-object v13, v6, Lvk2/d$c$b;->w:Ljava/lang/Object;

    iput-object v7, v6, Lvk2/d$c$b;->x:Ljava/lang/Object;

    iput-object v10, v6, Lvk2/d$c$b;->y:Ljava/lang/Object;

    iput-object v9, v6, Lvk2/d$c$b;->z:Ljava/lang/Object;

    iput-object v11, v6, Lvk2/d$c$b;->E:Ljava/lang/Object;

    iput-wide v2, v6, Lvk2/d$c$b;->F:J

    const-wide/16 v13, 0x0

    iput-wide v13, v6, Lvk2/d$c$b;->G:J

    iput-wide v13, v6, Lvk2/d$c$b;->H:J

    iput v1, v6, Lvk2/d$c$b;->I:I

    move-object v1, v4

    move-wide/from16 v28, v2

    move-object v2, v5

    move-wide/from16 v4, v28

    move-object v3, v12

    invoke-virtual/range {v0 .. v6}, Lwk2/j;->b(Lxk2/f;Lyg2/d;Ljava/lang/String;JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v6

    if-ne v0, v8, :cond_3

    goto/16 :goto_1

    :cond_3
    move-object/from16 v21, v9

    move-object/from16 v20, v10

    move-object/from16 v22, v11

    move-wide/from16 v16, v13

    move-object v13, v7

    move-wide/from16 v14, v16

    :goto_0
    move-object/from16 v23, v0

    check-cast v23, Lxk2/f;

    const/16 v26, 0x30f

    const/16 v27, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Lvk2/b;->b(Lvk2/b;JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;ZILjava/lang/Object;)Lvk2/b;

    move-result-object v0

    return-object v0

    :cond_4
    move-object v12, v6

    instance-of v0, v5, Lmk2/w$d;

    if-eqz v0, :cond_6

    iget-object v0, v12, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->b(Lvk2/d;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lvk2/b;->i(J)J

    move-result-wide v0

    invoke-static {v7, v0, v1}, Lvk2/e;->a(Lvk2/b;J)Lvk2/b;

    move-result-object v0

    if-eq v0, v7, :cond_5

    iget-object v1, v12, Lvk2/d$c$b;->L:Lvk2/d;

    sget-object v2, Lx90/g;->PAUSED:Lx90/g;

    invoke-virtual {v0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lvk2/d;->n(Lvk2/d;Lx90/g;Ljava/util/List;)V

    :cond_5
    return-object v0

    :cond_6
    instance-of v0, v5, Lmk2/w$e;

    if-eqz v0, :cond_8

    iget-object v0, v12, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->b(Lvk2/d;)J

    move-result-wide v0

    invoke-virtual {v7, v0, v1}, Lvk2/b;->i(J)J

    move-result-wide v0

    invoke-static {v7, v0, v1}, Lvk2/e;->b(Lvk2/b;J)Lvk2/b;

    move-result-object v0

    if-eq v0, v7, :cond_7

    iget-object v1, v12, Lvk2/d$c$b;->L:Lvk2/d;

    sget-object v2, Lx90/g;->ACTIVE:Lx90/g;

    invoke-virtual {v0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lvk2/d;->n(Lvk2/d;Lx90/g;Ljava/util/List;)V

    :cond_7
    return-object v0

    :cond_8
    instance-of v0, v5, Lmk2/w$a;

    if-eqz v0, :cond_9

    return-object v7

    :cond_9
    instance-of v0, v5, Lmk2/w$c;

    if-eqz v0, :cond_b

    :try_start_1
    sget-object v0, Lbc3/y1;->w:Lbc3/y1;

    new-instance v1, Lvk2/d$c$b$a;

    iget-object v2, v12, Lvk2/d$c$b;->L:Lvk2/d;

    iget-wide v3, v12, Lvk2/d$c$b;->M:J

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v6}, Lvk2/d$c$b$a;-><init>(Lvk2/d;JLmk2/w;Lq83/d;)V

    iput-object v7, v12, Lvk2/d$c$b;->J:Ljava/lang/Object;

    iput-object v5, v12, Lvk2/d$c$b;->K:Ljava/lang/Object;

    iput v9, v12, Lvk2/d$c$b;->I:I

    invoke-static {v0, v1, v12}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v8, :cond_a

    :goto_1
    return-object v8

    :catch_1
    move-exception v0

    :goto_2
    iget-object v1, v12, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v1}, Lvk2/d;->i(Lvk2/d;)Ltr2/n;

    move-result-object v1

    iget-wide v2, v12, Lvk2/d$c$b;->M:J

    const-string v4, "Failed to persist GPS point for session="

    const-string v6, ", continuing in-memory only"

    invoke-static {v2, v3, v4, v6}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_a
    :goto_3
    iget-object v0, v12, Lvk2/d$c$b;->L:Lvk2/d;

    invoke-static {v0}, Lvk2/d;->f(Lvk2/d;)Lwk2/g;

    move-result-object v0

    invoke-virtual {v7}, Lvk2/b;->e()Lwk2/f;

    move-result-object v1

    check-cast v5, Lmk2/w$c;

    invoke-virtual {v5}, Lmk2/w$c;->a()Lfv1/b;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lwk2/g;->a(Lwk2/f;Lfv1/b;)Lwk2/f;

    move-result-object v0

    const/16 v14, 0x2ff

    const/4 v15, 0x0

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move-object v1, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object v12, v0

    invoke-static/range {v1 .. v15}, Lvk2/b;->b(Lvk2/b;JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;ZILjava/lang/Object;)Lvk2/b;

    move-result-object v0

    return-object v0

    :cond_b
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
