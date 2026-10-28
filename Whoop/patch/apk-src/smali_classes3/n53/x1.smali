.class public final Ln53/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Ldc3/h;

.field public c:Lbc3/c2;

.field public final d:Ll83/p;

.field public e:I

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Lbc3/c0;)V
    .locals 2

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln53/x1;->a:Lbc3/c0;

    const/4 p1, 0x0

    const/4 v0, 0x6

    const v1, 0x7fffffff

    invoke-static {v1, v0, p1}, Lq83/g;->d(IILdc3/a;)Ldc3/h;

    move-result-object p1

    iput-object p1, p0, Ln53/x1;->b:Ldc3/h;

    const-string p1, "SerialProcessor"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Ln53/x1;->d:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a()Lb23/k;
    .locals 1

    iget-object v0, p0, Ln53/x1;->d:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method public final b()V
    .locals 12

    const-string v0, "[stop] Stopping SerialProcessor - "

    :try_start_0
    invoke-virtual {p0}, Ln53/x1;->a()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->y:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    iget-object v2, v1, Lb23/k;->b:Lb23/j;

    iget-object v1, v1, Lb23/k;->a:Ljava/lang/String;

    iget-object v5, p0, Ln53/x1;->c:Lbc3/c2;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lbc3/t1;->isActive()Z

    move-result v5

    const/4 v7, 0x1

    if-ne v5, v7, :cond_0

    move v6, v7

    :cond_0
    iget v5, p0, Ln53/x1;->e:I

    iget v7, p0, Ln53/x1;->f:I

    iget v8, p0, Ln53/x1;->g:I

    const-string v9, "SerialProcessor stats: submitted="

    const-string v10, ", completed="

    const-string v11, ", queued="

    invoke-static {v5, v7, v9, v10, v11}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v7, ", running="

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v2, v3, v1, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v0, p0, Ln53/x1;->c:Lbc3/c2;

    if-eqz v0, :cond_2

    invoke-virtual {v0, v4}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iput-object v4, p0, Ln53/x1;->c:Lbc3/c2;

    invoke-virtual {p0}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v2, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v2, "[stop] SerialProcessor stopped"

    invoke-interface {v1, v3, v0, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_1
    sget-object v1, Lb23/i;->a:Lb23/i;

    sget-object v1, Lb23/i;->d:Lb23/e;

    sget-object v2, Lb23/g;->F:Lb23/g;

    const-string v3, "SafeCall"

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    sget-object v1, Lb23/i;->c:Lb23/j;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    const-string v5, "Exception occurred: "

    invoke-static {v5, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v2, v3, v4, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public final c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    instance-of v3, v2, Ln53/w1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Ln53/w1;

    iget v4, v3, Ln53/w1;->G:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Ln53/w1;->G:I

    goto :goto_0

    :cond_0
    new-instance v3, Ln53/w1;

    invoke-direct {v3, v0, v2}, Ln53/w1;-><init>(Ln53/x1;Ls83/c;)V

    :goto_0
    iget-object v2, v3, Ln53/w1;->E:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Ln53/w1;->G:I

    const-string v6, ")"

    const/4 v7, 0x2

    const/4 v8, 0x0

    const-string v9, " \'"

    const-string v10, "[submit] Job #"

    const/4 v11, 0x1

    if-eqz v5, :cond_3

    if-eq v5, v11, :cond_2

    if-ne v5, v7, :cond_1

    iget v1, v3, Ln53/w1;->z:I

    iget-object v4, v3, Ln53/w1;->x:Ljava/lang/String;

    iget-object v3, v3, Ln53/w1;->w:Ln53/x1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v3, Ln53/w1;->z:I

    iget-object v5, v3, Ln53/w1;->y:Lbc3/t;

    iget-object v12, v3, Ln53/w1;->x:Ljava/lang/String;

    iget-object v13, v3, Ln53/w1;->w:Ln53/x1;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget v2, v0, Ln53/x1;->e:I

    add-int/2addr v2, v11

    iput v2, v0, Ln53/x1;->e:I

    invoke-virtual {v0}, Ln53/x1;->a()Lb23/k;

    move-result-object v5

    iget-object v12, v5, Lb23/k;->c:Lb23/e;

    iget-object v13, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->y:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_5

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    iget-object v12, v0, Ln53/x1;->c:Lbc3/c2;

    const/4 v15, 0x0

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Lbc3/t1;->isActive()Z

    move-result v12

    if-ne v12, v11, :cond_4

    move v15, v11

    :cond_4
    const-string v12, "\' submitted to SerialProcessor (worker running: "

    invoke-static {v2, v10, v9, v1, v12}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-static {v12, v15, v6}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v5, v14, v13, v12, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    iget-object v5, v0, Ln53/x1;->c:Lbc3/c2;

    if-nez v5, :cond_7

    invoke-virtual {v0}, Ln53/x1;->a()Lb23/k;

    move-result-object v5

    iget-object v12, v5, Lb23/k;->c:Lb23/e;

    iget-object v13, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    const-string v12, "[submit] Starting SerialProcessor worker"

    invoke-interface {v5, v14, v13, v12, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    new-instance v5, Lf1/o1;

    invoke-direct {v5, v0, v8}, Lf1/o1;-><init>(Ln53/x1;Lq83/d;)V

    const/4 v12, 0x3

    iget-object v13, v0, Ln53/x1;->a:Lbc3/c0;

    invoke-static {v13, v8, v8, v5, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v5

    iput-object v5, v0, Ln53/x1;->c:Lbc3/c2;

    :cond_7
    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object v5

    iget-object v12, v0, Ln53/x1;->b:Ldc3/h;

    invoke-virtual {v12}, Ldc3/h;->x()Z

    move-result v13

    if-nez v13, :cond_f

    new-instance v13, Ln53/v1;

    move-object/from16 v14, p2

    invoke-direct {v13, v14, v5, v2, v1}, Ln53/v1;-><init>(Lkotlin/jvm/functions/Function1;Lbc3/t;ILjava/lang/String;)V

    iput-object v0, v3, Ln53/w1;->w:Ln53/x1;

    iput-object v1, v3, Ln53/w1;->x:Ljava/lang/String;

    iput-object v5, v3, Ln53/w1;->y:Lbc3/t;

    iput v2, v3, Ln53/w1;->z:I

    iput v11, v3, Ln53/w1;->G:I

    invoke-interface {v12, v13, v3}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v4, :cond_8

    goto :goto_2

    :cond_8
    move-object v13, v0

    move-object v12, v1

    move v1, v2

    :goto_1
    iget v2, v13, Ln53/x1;->g:I

    add-int/2addr v2, v11

    iput v2, v13, Ln53/x1;->g:I

    invoke-virtual {v13}, Ln53/x1;->a()Lb23/k;

    move-result-object v2

    iget-object v11, v2, Lb23/k;->c:Lb23/e;

    iget-object v14, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v11, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_9

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget v11, v13, Ln53/x1;->g:I

    const-string v7, "\' queued successfully (queued: "

    invoke-static {v1, v10, v9, v12, v7}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    invoke-static {v7, v11, v6}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v2, v15, v14, v6, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    iput-object v13, v3, Ln53/w1;->w:Ln53/x1;

    iput-object v12, v3, Ln53/w1;->x:Ljava/lang/String;

    iput-object v8, v3, Ln53/w1;->y:Lbc3/t;

    iput v1, v3, Ln53/w1;->z:I

    const/4 v2, 0x2

    iput v2, v3, Ln53/w1;->G:I

    invoke-virtual {v5, v3}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_a

    :goto_2
    return-object v4

    :cond_a
    move-object v4, v12

    move-object v3, v13

    :goto_3
    check-cast v2, Ll83/n;

    iget-object v2, v2, Ll83/n;->w:Ljava/lang/Object;

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-nez v5, :cond_b

    goto :goto_4

    :cond_b
    invoke-static {v5}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_4
    instance-of v5, v2, Ll83/m;

    if-nez v5, :cond_c

    invoke-virtual {v3}, Ln53/x1;->a()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v5, "\' returned successfully"

    invoke-static {v1, v10, v9, v4, v5}, Lq63/c;->h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v7, v6, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v2

    :cond_c
    invoke-virtual {v3}, Ln53/x1;->a()Lb23/k;

    move-result-object v3

    iget-object v5, v3, Lb23/k;->c:Lb23/e;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->E:Lb23/g;

    invoke-interface {v5, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_e

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v5

    if-eqz v5, :cond_d

    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v5

    goto :goto_5

    :cond_d
    move-object v5, v8

    :goto_5
    const-string v11, "\' returned with failure: "

    invoke-static {v1, v10, v9, v4, v11}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v7, v6, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_e
    return-object v2

    :cond_f
    invoke-virtual {v0}, Ln53/x1;->a()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    iget-object v5, v3, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->F:Lb23/g;

    invoke-interface {v4, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_10

    iget-object v3, v3, Lb23/k;->b:Lb23/j;

    const-string v4, "\' failed - channel is closed"

    invoke-static {v2, v10, v9, v1, v4}, Lq63/c;->h(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v3, v6, v5, v1, v8}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_10
    new-instance v1, Ljava/lang/Exception;

    const-string v2, "[SerialProcessor] Channel is closed"

    invoke-direct {v1, v2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v1

    return-object v1
.end method
