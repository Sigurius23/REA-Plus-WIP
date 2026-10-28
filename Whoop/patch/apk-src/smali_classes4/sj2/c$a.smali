.class final Lsj2/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsj2/c;-><init>(Lbc3/c0;Ltr2/n;)V
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
    c = "com.whoop.taskexecutor.PriorityInterruptibleExecutionServiceImpl$1"
    f = "PriorityInterruptibleExecutionService.kt"
    l = {
        0xc2,
        0x50,
        0x60,
        0x60,
        0x60
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:I

.field L:I

.field M:I

.field N:I

.field O:I

.field P:I

.field Q:I

.field R:I

.field S:I

.field final synthetic T:Lsj2/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lsj2/c<",
            "TR;>;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lsj2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsj2/c<",
            "TR;>;",
            "Lq83/d<",
            "-",
            "Lsj2/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsj2/c$a;->T:Lsj2/c;

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

    new-instance p1, Lsj2/c$a;

    iget-object v0, p0, Lsj2/c$a;->T:Lsj2/c;

    invoke-direct {p1, v0, p2}, Lsj2/c$a;-><init>(Lsj2/c;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lsj2/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsj2/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsj2/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsj2/c$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 36

    move-object/from16 v1, p0

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lsj2/c$a;->S:I

    const-string v3, " but it was already completed"

    const-string v4, "Unexpected state: attempt to completeExceptionally task "

    const/4 v7, 0x3

    const/4 v8, 0x2

    const-string v9, "onCancel timed out for task "

    const-string v10, " onCancel"

    const-string v11, "finished task "

    const-string v12, " taskInterrupted="

    const-string v13, " timeout="

    const-string v14, " cancelled="

    const-string v15, "Finalizing task "

    const/4 v5, 0x1

    if-eqz v0, :cond_5

    if-eq v0, v5, :cond_4

    if-eq v0, v8, :cond_3

    if-eq v0, v7, :cond_2

    const/4 v7, 0x4

    if-eq v0, v7, :cond_1

    const/4 v7, 0x5

    if-ne v0, v7, :cond_0

    iget-object v0, v1, Lsj2/c$a;->J:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    iget-object v2, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    iget-object v5, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v7, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    check-cast v7, Lsj2/f;

    iget-object v8, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    check-cast v8, Ll83/a0;

    iget-object v8, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    check-cast v8, Ldc3/w;

    iget-object v8, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    check-cast v8, Ldc3/w;

    iget-object v12, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    check-cast v12, Lsj2/c;

    iget-object v13, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    check-cast v13, Ldc3/w;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    move-object/from16 v26, v11

    move-object v4, v2

    move-object/from16 v2, p1

    goto/16 :goto_28

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_2b

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v0, v1, Lsj2/c$a;->M:I

    iget v7, v1, Lsj2/c$a;->L:I

    iget v8, v1, Lsj2/c$a;->K:I

    iget-object v5, v1, Lsj2/c$a;->J:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Exception;

    iget-object v6, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    move/from16 v20, v0

    iget-object v0, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    check-cast v0, Lsj2/f;

    move-object/from16 v21, v0

    iget-object v0, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    check-cast v0, Ll83/a0;

    iget-object v0, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    move-object/from16 v22, v0

    iget-object v0, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    move-object/from16 v23, v0

    check-cast v23, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    check-cast v0, Lsj2/c;

    move-object/from16 v24, v0

    iget-object v0, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move/from16 v0, v20

    move-object/from16 v20, v3

    move v3, v0

    move-object/from16 v0, p1

    move/from16 v32, v7

    move-object/from16 v26, v11

    move-object/from16 v25, v12

    move-object/from16 v34, v23

    move-object/from16 v11, v24

    const/16 v18, 0x3

    move-object v7, v2

    move-object/from16 v23, v9

    move-object/from16 v24, v10

    move-object/from16 v9, v21

    const/4 v2, 0x4

    move-object/from16 v21, v4

    move-object v4, v5

    move-object v5, v13

    goto/16 :goto_16

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object/from16 v8, v23

    goto/16 :goto_2b

    :cond_2
    iget v0, v1, Lsj2/c$a;->M:I

    iget v5, v1, Lsj2/c$a;->L:I

    iget v6, v1, Lsj2/c$a;->K:I

    iget-object v7, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v8, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    check-cast v8, Lsj2/f;

    iget-object v8, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    check-cast v8, Ll83/a0;

    iget-object v8, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    check-cast v8, Ldc3/c;

    move/from16 v20, v0

    iget-object v0, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    move-object/from16 v21, v0

    check-cast v21, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    check-cast v0, Lsj2/c;

    move-object/from16 v22, v0

    iget-object v0, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v0, v21

    move-object/from16 v21, v4

    move-object v4, v8

    move-object v8, v0

    move-object/from16 v0, p1

    move-object/from16 v23, v10

    move-object/from16 v24, v11

    move-object/from16 v25, v12

    move-object/from16 v26, v13

    move-object v12, v2

    move-object v10, v7

    move/from16 v7, v20

    const/4 v2, 0x3

    move-object/from16 v20, v3

    move-object/from16 v3, v22

    move-object/from16 v22, v9

    goto/16 :goto_8

    :catchall_2
    move-exception v0

    move-object v2, v0

    move-object/from16 v8, v21

    goto/16 :goto_2b

    :cond_3
    iget v5, v1, Lsj2/c$a;->R:I

    iget v6, v1, Lsj2/c$a;->Q:I

    iget v7, v1, Lsj2/c$a;->P:I

    iget v8, v1, Lsj2/c$a;->O:I

    move/from16 v20, v5

    iget v5, v1, Lsj2/c$a;->N:I

    move/from16 v21, v5

    iget v5, v1, Lsj2/c$a;->M:I

    move/from16 v22, v5

    iget v5, v1, Lsj2/c$a;->L:I

    move/from16 v23, v5

    iget v5, v1, Lsj2/c$a;->K:I

    iget-object v0, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    move-object/from16 v24, v0

    check-cast v24, Ljava/lang/String;

    iget-object v0, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    move-object/from16 v25, v0

    check-cast v25, Lsj2/f;

    iget-object v0, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    check-cast v0, Ll83/a0;

    iget-object v0, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    move-object/from16 v26, v0

    check-cast v26, Ldc3/c;

    iget-object v0, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    move-object/from16 v27, v0

    check-cast v27, Ldc3/w;

    iget-object v0, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    move-object/from16 v28, v0

    check-cast v28, Lsj2/c;

    iget-object v0, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object/from16 v0, v27

    move-object/from16 v27, v2

    move v2, v8

    move-object v8, v0

    move-object v0, v9

    move v9, v7

    move/from16 v7, v22

    move-object/from16 v22, v0

    move-object/from16 v0, p1

    move-object/from16 p1, v25

    move-object/from16 v25, v12

    move v12, v6

    move v6, v5

    move/from16 v5, v23

    move-object/from16 v23, v10

    move-object/from16 v10, v24

    move-object/from16 v24, v11

    move/from16 v11, v21

    move-object/from16 v21, v4

    move-object/from16 v4, v26

    move-object/from16 v26, v13

    move/from16 v13, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v28

    goto/16 :goto_3

    :catchall_3
    move-exception v0

    move/from16 v18, v6

    move v6, v7

    move-object/from16 v26, v11

    move/from16 v16, v20

    move/from16 v7, v21

    move-object/from16 p1, v28

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move v11, v5

    move-object v5, v13

    move/from16 v13, v22

    move-object/from16 v3, v25

    const/4 v4, 0x0

    move-object/from16 v25, v12

    move/from16 v12, v23

    move-object/from16 v23, v9

    move-object/from16 v9, v24

    move-object/from16 v24, v10

    move-object/from16 v10, v27

    move-object/from16 v27, v2

    goto/16 :goto_22

    :catch_0
    move-exception v0

    move/from16 v30, v7

    move/from16 v29, v20

    move/from16 v7, v22

    const/16 v18, 0x3

    move-object/from16 v20, v3

    move-object/from16 v3, v27

    move-object/from16 v27, v2

    move/from16 v2, v21

    move-object/from16 v21, v4

    move-object v4, v0

    move-object/from16 v0, v26

    move-object/from16 v26, v11

    move-object/from16 v11, v28

    move/from16 v28, v6

    move-object/from16 v6, v24

    move-object/from16 v24, v10

    move v10, v5

    move-object v5, v13

    move v13, v8

    move/from16 v8, v23

    move-object/from16 v23, v9

    move-object/from16 v9, v25

    move-object/from16 v25, v12

    goto/16 :goto_15

    :cond_4
    iget v0, v1, Lsj2/c$a;->M:I

    iget v5, v1, Lsj2/c$a;->L:I

    iget v6, v1, Lsj2/c$a;->K:I

    iget-object v7, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    check-cast v7, Ldc3/c;

    iget-object v8, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    check-cast v8, Ldc3/w;

    iget-object v8, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    check-cast v8, Ldc3/w;

    move/from16 v20, v0

    iget-object v0, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    check-cast v0, Lsj2/c;

    move-object/from16 v21, v0

    iget-object v0, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    check-cast v0, Ldc3/w;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move/from16 v35, v20

    move-object/from16 v20, v3

    move-object/from16 v3, v21

    move-object/from16 v21, v4

    move-object v4, v8

    move-object v8, v7

    move/from16 v7, v35

    move/from16 v35, v6

    move v6, v5

    move/from16 v5, v35

    goto :goto_2

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lsj2/c$a;->T:Lsj2/c;

    invoke-static {v0}, Lsj2/c;->f(Lsj2/c;)Ldc3/l;

    move-result-object v8

    iget-object v0, v1, Lsj2/c$a;->T:Lsj2/c;

    :try_start_5
    invoke-interface {v8}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object v5

    move-object/from16 v20, v3

    move-object/from16 v21, v4

    move-object v7, v5

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    :goto_0
    const/4 v4, 0x0

    iput-object v4, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    iput-object v0, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    iput-object v8, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    iput-object v7, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->J:Ljava/lang/Object;

    iput v5, v1, Lsj2/c$a;->K:I

    iput v6, v1, Lsj2/c$a;->L:I

    iput v3, v1, Lsj2/c$a;->M:I

    const/4 v4, 0x1

    iput v4, v1, Lsj2/c$a;->S:I

    invoke-virtual {v7, v1}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    if-ne v4, v2, :cond_6

    :goto_1
    move-object v7, v2

    goto/16 :goto_27

    :cond_6
    move-object/from16 p1, v4

    move-object v4, v8

    move-object v8, v7

    move v7, v3

    move-object v3, v0

    :goto_2
    :try_start_6
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1a

    invoke-virtual {v8}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll83/a0;

    invoke-static {v3}, Lsj2/c;->g(Lsj2/c;)Lsj2/f;

    move-result-object v0

    invoke-static {v3, v0}, Lsj2/c;->h(Lsj2/c;Lsj2/f;)V

    move-object/from16 v22, v9

    invoke-static {v3}, Lsj2/c;->d(Lsj2/c;)Lsj2/f;

    move-result-object v9

    if-eqz v9, :cond_19

    move-object/from16 v23, v10

    invoke-virtual {v9}, Lsj2/f;->d()Ljava/lang/String;

    move-result-object v10

    invoke-static {v3}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    move-object/from16 v24, v11

    invoke-virtual {v9}, Lsj2/f;->a()Lsj2/a;

    move-result-object v11

    move-object/from16 v25, v12

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v26, v13

    const-string v13, "Executing task "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " with priority "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    const/4 v12, 0x0

    new-array v13, v12, [Lqr2/a$a;

    invoke-interface {v0, v11, v13}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_15

    :try_start_7
    invoke-virtual {v9}, Lsj2/f;->c()Lbc3/i0;

    move-result-object v0

    const/4 v11, 0x0

    iput-object v11, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    iput-object v3, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    iput-object v11, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    iput-object v8, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    iput-object v11, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    iput-object v11, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    iput-object v9, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    iput-object v10, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    iput v5, v1, Lsj2/c$a;->K:I

    iput v6, v1, Lsj2/c$a;->L:I

    iput v7, v1, Lsj2/c$a;->M:I

    const/4 v12, 0x0

    iput v12, v1, Lsj2/c$a;->N:I

    iput v12, v1, Lsj2/c$a;->O:I

    iput v12, v1, Lsj2/c$a;->P:I

    iput v12, v1, Lsj2/c$a;->Q:I

    iput v12, v1, Lsj2/c$a;->R:I

    const/4 v11, 0x2

    iput v11, v1, Lsj2/c$a;->S:I
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_b

    :try_start_8
    invoke-interface {v0, v1}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_6
    .catchall {:try_start_8 .. :try_end_8} :catchall_a

    if-ne v0, v2, :cond_7

    goto/16 :goto_1

    :cond_7
    move-object/from16 p1, v8

    move-object v8, v4

    move-object/from16 v4, p1

    move/from16 p1, v6

    move v6, v5

    move/from16 v5, p1

    move-object/from16 v27, v2

    move-object/from16 p1, v9

    const/4 v2, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    :goto_3
    :try_start_9
    invoke-virtual/range {p1 .. p1}, Lsj2/f;->b()Lbc3/s;

    move-result-object v28
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_5
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    move/from16 v29, v13

    :try_start_a
    move-object/from16 v13, v28

    check-cast v13, Lbc3/t;

    invoke-virtual {v13, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_4
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    :try_start_b
    invoke-static {v3}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_3
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    move/from16 v28, v12

    :try_start_c
    const-string v12, "Finished normal execution of task "

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_2
    .catchall {:try_start_c .. :try_end_c} :catchall_6

    move/from16 v30, v9

    const/4 v13, 0x0

    :try_start_d
    new-array v9, v13, [Lqr2/a$a;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_1
    .catchall {:try_start_d .. :try_end_d} :catchall_5

    :try_start_e
    invoke-interface {v0, v12, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_1
    .catchall {:try_start_e .. :try_end_e} :catchall_4

    :try_start_f
    invoke-static {v3}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    if-eqz v30, :cond_8

    const/4 v9, 0x1

    goto :goto_4

    :cond_8
    const/4 v9, 0x0

    :goto_4
    if-eqz v28, :cond_9

    const/4 v12, 0x1

    goto :goto_5

    :cond_9
    const/4 v12, 0x0

    :goto_5
    if-eqz v29, :cond_a

    const/4 v13, 0x1

    :goto_6
    move/from16 v31, v2

    goto :goto_7

    :cond_a
    const/4 v13, 0x0

    goto :goto_6

    :goto_7
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v9, v26

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v12, v25

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v26, v9

    const/4 v13, 0x0

    new-array v9, v13, [Lqr2/a$a;

    invoke-interface {v0, v2, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v30, :cond_d

    move-object/from16 v25, v12

    invoke-static {}, Lsj2/d;->a()J

    move-result-wide v12

    new-instance v0, Lsj2/c$a$a;

    move-object/from16 v9, p1

    const/4 v2, 0x0

    invoke-direct {v0, v9, v2}, Lsj2/c$a$a;-><init>(Lsj2/f;Lq83/d;)V

    iput-object v2, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    iput-object v3, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    iput-object v8, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    iput-object v2, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    iput-object v2, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    iput-object v2, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    iput-object v9, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    iput-object v10, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    iput v6, v1, Lsj2/c$a;->K:I

    iput v5, v1, Lsj2/c$a;->L:I

    iput v7, v1, Lsj2/c$a;->M:I

    iput v11, v1, Lsj2/c$a;->N:I

    move/from16 v2, v31

    iput v2, v1, Lsj2/c$a;->O:I

    move/from16 v2, v30

    iput v2, v1, Lsj2/c$a;->P:I

    move/from16 v2, v28

    iput v2, v1, Lsj2/c$a;->Q:I

    move/from16 v2, v29

    iput v2, v1, Lsj2/c$a;->R:I

    const/4 v2, 0x3

    iput v2, v1, Lsj2/c$a;->S:I

    invoke-static {v12, v13, v0, v1}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v12, v27

    if-ne v0, v12, :cond_b

    move-object v7, v12

    goto/16 :goto_27

    :cond_b
    :goto_8
    check-cast v0, Ll83/a0;

    invoke-static {v3}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v9

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v24

    invoke-virtual {v11, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v23

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    move-object/from16 v23, v0

    move-object/from16 p1, v3

    const/4 v3, 0x0

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {v9, v11, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-nez v23, :cond_c

    invoke-static/range {p1 .. p1}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v9, v22

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    new-array v11, v10, [Lqr2/a$a;

    invoke-interface {v0, v3, v11}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_9

    :cond_c
    move-object/from16 v9, v22

    :goto_9
    move-object/from16 v3, p1

    :goto_a
    const/4 v11, 0x0

    goto :goto_b

    :cond_d
    move-object/from16 v25, v12

    move-object/from16 v9, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    goto :goto_a

    :goto_b
    invoke-static {v3, v11}, Lsj2/c;->h(Lsj2/c;Lsj2/f;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_0

    move/from16 v32, v5

    move/from16 v33, v6

    move v0, v7

    move-object v7, v12

    move-object/from16 v6, v20

    move-object/from16 v10, v21

    move-object/from16 v5, v26

    const/16 v18, 0x3

    move-object v12, v9

    goto/16 :goto_1d

    :catchall_4
    move-exception v0

    move-object/from16 v9, p1

    move/from16 v31, v2

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    move-object/from16 v24, v2

    move-object/from16 p1, v3

    move-object v3, v9

    move-object v9, v10

    move-object/from16 v23, v22

    :goto_c
    move/from16 v18, v28

    move/from16 v16, v29

    const/4 v4, 0x0

    move v12, v5

    move-object v10, v8

    move-object/from16 v5, v26

    move/from16 v8, v31

    move-object/from16 v26, v13

    move v13, v7

    move v7, v11

    move v11, v6

    move/from16 v6, v30

    goto/16 :goto_22

    :catch_1
    move-exception v0

    move-object/from16 v9, p1

    move/from16 v31, v2

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    const/16 v18, 0x3

    :goto_d
    move-object/from16 v23, v4

    move-object v4, v0

    move-object/from16 v0, v23

    move-object/from16 v23, v10

    move v10, v6

    move-object/from16 v6, v23

    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v8

    move v2, v11

    :goto_e
    move-object/from16 v11, p1

    move v8, v5

    move-object/from16 v5, v26

    move-object/from16 v26, v13

    move/from16 v13, v31

    goto/16 :goto_15

    :catchall_5
    move-exception v0

    move-object/from16 v9, p1

    move/from16 v31, v2

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    :goto_f
    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v9

    move-object v9, v10

    goto :goto_c

    :catchall_6
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    :goto_10
    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    move-object/from16 v9, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    goto :goto_f

    :catch_2
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    :goto_11
    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    const/16 v18, 0x3

    move-object/from16 v9, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    goto :goto_d

    :catchall_7
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    goto :goto_10

    :catch_3
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    goto :goto_11

    :catchall_8
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    move-object/from16 v9, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    goto :goto_12

    :catch_4
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v12, v27

    const/16 v18, 0x3

    move-object/from16 v9, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    goto :goto_13

    :goto_12
    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v9

    move-object v9, v10

    move-object/from16 v27, v12

    goto/16 :goto_c

    :goto_13
    move-object/from16 v23, v4

    move-object v4, v0

    move-object/from16 v0, v23

    move-object/from16 v23, v10

    move v10, v6

    move-object/from16 v6, v23

    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v8

    move v2, v11

    move-object/from16 v27, v12

    goto/16 :goto_e

    :catchall_9
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    move/from16 v29, v13

    goto/16 :goto_10

    :catch_5
    move-exception v0

    move/from16 v31, v2

    move/from16 v30, v9

    move/from16 v28, v12

    move/from16 v29, v13

    goto :goto_11

    :catchall_a
    move-exception v0

    move-object v12, v2

    move-object v11, v3

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v9

    move-object v9, v10

    move-object/from16 p1, v11

    move-object/from16 v27, v12

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v10, v4

    move v11, v5

    move v12, v6

    move-object/from16 v5, v26

    const/4 v4, 0x0

    const/4 v6, 0x0

    move-object/from16 v26, v13

    move v13, v7

    :goto_14
    const/4 v7, 0x0

    goto/16 :goto_22

    :catch_6
    move-exception v0

    move-object v12, v2

    move-object v11, v3

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    const/16 v18, 0x3

    move/from16 v22, v5

    move-object/from16 v5, v26

    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v4

    move-object/from16 v27, v12

    move-object/from16 v26, v13

    const/4 v2, 0x0

    const/4 v13, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object v4, v0

    move-object v0, v8

    move v8, v6

    move-object v6, v10

    move/from16 v10, v22

    goto :goto_15

    :catchall_b
    move-exception v0

    move-object v12, v2

    move-object v11, v3

    move-object/from16 v3, v22

    move-object/from16 v2, v23

    move-object/from16 v13, v24

    move/from16 v22, v5

    move-object/from16 v5, v26

    move-object/from16 v24, v2

    move-object/from16 v23, v3

    move-object v3, v9

    move-object v9, v10

    move-object/from16 p1, v11

    move-object/from16 v27, v12

    move-object/from16 v26, v13

    move/from16 v11, v22

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v10, v4

    move v12, v6

    move v13, v7

    const/4 v4, 0x0

    const/4 v6, 0x0

    goto :goto_14

    :goto_15
    :try_start_10
    instance-of v12, v4, Ljava/util/concurrent/CancellationException;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_13

    move/from16 v22, v13

    :try_start_11
    instance-of v13, v4, Lkotlinx/coroutines/TimeoutCancellationException;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_12

    move/from16 v31, v2

    :try_start_12
    instance-of v2, v4, Lcom/whoop/taskexecutor/TaskInterruptedException;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    move/from16 p1, v7

    :try_start_13
    invoke-static {v11}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v7
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_10

    move/from16 v32, v8

    :try_start_14
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_f

    move/from16 v33, v10

    :try_start_15
    const-string v10, "Caught exception while executing "

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v34, v0

    const/4 v10, 0x0

    new-array v0, v10, [Lqr2/a$a;

    invoke-interface {v7, v8, v4, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_e

    :try_start_16
    invoke-static {v11}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v10, v25

    invoke-virtual {v7, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v25, v10

    const/4 v8, 0x0

    new-array v10, v8, [Lqr2/a$a;

    invoke-interface {v0, v7, v10}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v12, :cond_10

    invoke-static {}, Lsj2/d;->a()J

    move-result-wide v7

    new-instance v0, Lsj2/c$a$a;

    const/4 v10, 0x0

    invoke-direct {v0, v9, v10}, Lsj2/c$a$a;-><init>(Lsj2/f;Lq83/d;)V

    iput-object v10, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    iput-object v11, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    iput-object v3, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    iput-object v10, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    move-object/from16 v10, v34

    iput-object v10, v1, Lsj2/c$a;->E:Ljava/lang/Object;
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_d

    move-object/from16 v34, v3

    const/4 v3, 0x0

    :try_start_17
    iput-object v3, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    iput-object v3, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    iput-object v9, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    iput-object v6, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->J:Ljava/lang/Object;

    move/from16 v3, v33

    iput v3, v1, Lsj2/c$a;->K:I

    move/from16 v33, v3

    move/from16 v3, v32

    iput v3, v1, Lsj2/c$a;->L:I

    move/from16 v32, v3

    move/from16 v3, p1

    iput v3, v1, Lsj2/c$a;->M:I

    move/from16 p1, v3

    move/from16 v3, v31

    iput v3, v1, Lsj2/c$a;->N:I

    move/from16 v3, v22

    iput v3, v1, Lsj2/c$a;->O:I

    iput v12, v1, Lsj2/c$a;->P:I

    iput v13, v1, Lsj2/c$a;->Q:I

    iput v2, v1, Lsj2/c$a;->R:I

    const/4 v2, 0x4

    iput v2, v1, Lsj2/c$a;->S:I

    invoke-static {v7, v8, v0, v1}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v7, v27

    if-ne v0, v7, :cond_e

    goto/16 :goto_27

    :cond_e
    move/from16 v3, p1

    move-object/from16 v22, v10

    move/from16 v8, v33

    :goto_16
    check-cast v0, Ll83/a0;

    invoke-static {v11}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v10

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v26

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, v24

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    move-object/from16 v24, v0

    move/from16 p1, v3

    const/4 v3, 0x0

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {v10, v12, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-nez v24, :cond_f

    invoke-static {v11}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v12, v23

    invoke-virtual {v3, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    move-object/from16 v23, v4

    const/4 v10, 0x0

    new-array v4, v10, [Lqr2/a$a;

    invoke-interface {v0, v3, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_17
    .catchall {:try_start_17 .. :try_end_17} :catchall_c

    goto :goto_18

    :catchall_c
    move-exception v0

    :goto_17
    move-object v2, v0

    move-object/from16 v8, v34

    goto/16 :goto_2b

    :cond_f
    move-object/from16 v12, v23

    move-object/from16 v23, v4

    :goto_18
    move/from16 v33, v8

    move-object/from16 v4, v23

    :goto_19
    move/from16 v0, p1

    move-object v3, v11

    move-object/from16 v8, v34

    goto :goto_1a

    :catchall_d
    move-exception v0

    move-object/from16 v34, v3

    goto :goto_17

    :cond_10
    move-object/from16 v12, v23

    move-object/from16 v2, v24

    move-object/from16 v13, v26

    move-object/from16 v7, v27

    move-object/from16 v10, v34

    move-object/from16 v34, v3

    move-object/from16 v22, v10

    goto :goto_19

    :goto_1a
    if-eqz v4, :cond_11

    :try_start_18
    invoke-virtual {v9}, Lsj2/f;->b()Lbc3/s;

    move-result-object v9

    check-cast v9, Lbc3/t;

    invoke-virtual {v9, v4}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    move-result v4

    if-nez v4, :cond_11

    invoke-static {v3}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v4

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v10, v21

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v6, v20

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    move/from16 p1, v0

    const/4 v11, 0x0

    new-array v0, v11, [Lqr2/a$a;

    invoke-interface {v4, v9, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1b
    const/4 v11, 0x0

    goto :goto_1c

    :cond_11
    move/from16 p1, v0

    move-object/from16 v6, v20

    move-object/from16 v10, v21

    goto :goto_1b

    :goto_1c
    invoke-static {v3, v11}, Lsj2/c;->h(Lsj2/c;Lsj2/f;)V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_0

    move/from16 v0, p1

    move-object/from16 v4, v22

    :goto_1d
    move-object v9, v3

    move v3, v0

    move-object v0, v9

    move-object v9, v2

    move-object/from16 v20, v6

    move-object/from16 v27, v7

    move-object/from16 v21, v10

    move-object v10, v12

    move-object/from16 v6, v25

    move-object v7, v4

    const/4 v12, 0x5

    const/16 v17, 0x0

    goto/16 :goto_2a

    :catchall_e
    move-exception v0

    move/from16 v16, v2

    move-object/from16 v34, v3

    :goto_1e
    move-object/from16 v3, v20

    move-object/from16 v10, v21

    move-object/from16 v2, v24

    move-object/from16 v8, v26

    move-object/from16 v7, v27

    move-object/from16 v20, v6

    move-object/from16 v6, v23

    move-object/from16 v18, v20

    move-object/from16 v20, v3

    move-object v3, v9

    move-object/from16 v9, v18

    move v6, v12

    move/from16 v18, v13

    move/from16 v8, v22

    :goto_1f
    move/from16 v7, v31

    move/from16 v12, v32

    move-object/from16 v10, v34

    move/from16 v13, p1

    move-object/from16 p1, v11

    move/from16 v11, v33

    goto/16 :goto_22

    :catchall_f
    move-exception v0

    move/from16 v16, v2

    move-object/from16 v34, v3

    :goto_20
    move/from16 v33, v10

    goto :goto_1e

    :catchall_10
    move-exception v0

    move/from16 v16, v2

    move-object/from16 v34, v3

    move/from16 v32, v8

    goto :goto_20

    :catchall_11
    move-exception v0

    move-object/from16 v34, v3

    move/from16 p1, v7

    move/from16 v32, v8

    move/from16 v33, v10

    move-object/from16 v3, v20

    move-object/from16 v10, v21

    move-object/from16 v2, v24

    move-object/from16 v8, v26

    move-object/from16 v7, v27

    move-object/from16 v20, v6

    move-object/from16 v6, v23

    move-object/from16 v16, v20

    move-object/from16 v20, v3

    move-object v3, v9

    move-object/from16 v9, v16

    move v6, v12

    move/from16 v18, v13

    move/from16 v8, v22

    move/from16 v16, v29

    goto :goto_1f

    :catchall_12
    move-exception v0

    move/from16 v31, v2

    move-object/from16 v34, v3

    move/from16 p1, v7

    move/from16 v32, v8

    move/from16 v33, v10

    move-object/from16 v3, v20

    move-object/from16 v10, v21

    move-object/from16 v2, v24

    move-object/from16 v8, v26

    move-object/from16 v7, v27

    move-object/from16 v20, v6

    move-object/from16 v6, v23

    move-object/from16 v13, v20

    move-object/from16 v20, v3

    move-object v3, v9

    move-object v9, v13

    move/from16 v13, p1

    move-object/from16 p1, v11

    move v6, v12

    move/from16 v8, v22

    move/from16 v18, v28

    move/from16 v16, v29

    :goto_21
    move/from16 v7, v31

    move/from16 v12, v32

    move/from16 v11, v33

    move-object/from16 v10, v34

    goto :goto_22

    :catchall_13
    move-exception v0

    move/from16 v31, v2

    move-object/from16 v34, v3

    move/from16 p1, v7

    move/from16 v32, v8

    move/from16 v33, v10

    move/from16 v22, v13

    move-object/from16 v3, v20

    move-object/from16 v10, v21

    move-object/from16 v2, v24

    move-object/from16 v8, v26

    move-object/from16 v7, v27

    move-object/from16 v20, v6

    move-object/from16 v6, v23

    move-object/from16 v12, v20

    move-object/from16 v20, v3

    move-object v3, v9

    move-object v9, v12

    move/from16 v13, p1

    move-object/from16 p1, v11

    move/from16 v8, v22

    move/from16 v18, v28

    move/from16 v16, v29

    move/from16 v6, v30

    goto :goto_21

    :goto_22
    :try_start_19
    invoke-static/range {p1 .. p1}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v2

    move/from16 v19, v6

    if-eqz v6, :cond_12

    const/4 v6, 0x1

    goto :goto_23

    :cond_12
    const/4 v6, 0x0

    :goto_23
    move/from16 v22, v8

    if-eqz v18, :cond_13

    const/4 v8, 0x1

    goto :goto_24

    :cond_13
    const/4 v8, 0x0

    :goto_24
    move/from16 v28, v7

    if-eqz v16, :cond_14

    const/4 v7, 0x1

    :goto_25
    move/from16 v29, v13

    goto :goto_26

    :cond_14
    const/4 v7, 0x0

    goto :goto_25

    :goto_26
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-object/from16 v6, v25

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v13, 0x0

    new-array v6, v13, [Lqr2/a$a;

    invoke-interface {v2, v5, v6}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v19, :cond_17

    invoke-static {}, Lsj2/d;->a()J

    move-result-wide v5

    new-instance v2, Lsj2/c$a$a;

    const/4 v7, 0x0

    invoke-direct {v2, v3, v7}, Lsj2/c$a$a;-><init>(Lsj2/f;Lq83/d;)V

    iput-object v7, v1, Lsj2/c$a;->w:Ljava/lang/Object;

    move-object/from16 v8, p1

    iput-object v8, v1, Lsj2/c$a;->x:Ljava/lang/Object;

    iput-object v10, v1, Lsj2/c$a;->y:Ljava/lang/Object;

    iput-object v7, v1, Lsj2/c$a;->z:Ljava/lang/Object;

    iput-object v7, v1, Lsj2/c$a;->E:Ljava/lang/Object;

    iput-object v7, v1, Lsj2/c$a;->F:Ljava/lang/Object;

    iput-object v3, v1, Lsj2/c$a;->G:Ljava/lang/Object;

    iput-object v9, v1, Lsj2/c$a;->H:Ljava/lang/Object;

    iput-object v4, v1, Lsj2/c$a;->I:Ljava/lang/Object;

    iput-object v0, v1, Lsj2/c$a;->J:Ljava/lang/Object;

    iput v11, v1, Lsj2/c$a;->K:I

    iput v12, v1, Lsj2/c$a;->L:I

    move/from16 v7, v29

    iput v7, v1, Lsj2/c$a;->M:I

    move/from16 v11, v28

    iput v11, v1, Lsj2/c$a;->N:I

    move/from16 v7, v22

    iput v7, v1, Lsj2/c$a;->O:I

    move/from16 v12, v19

    iput v12, v1, Lsj2/c$a;->P:I

    move/from16 v13, v18

    iput v13, v1, Lsj2/c$a;->Q:I

    move/from16 v7, v16

    iput v7, v1, Lsj2/c$a;->R:I

    const/4 v12, 0x5

    iput v12, v1, Lsj2/c$a;->S:I

    invoke-static {v5, v6, v2, v1}, Lbc3/k2;->e(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_14

    move-object/from16 v7, v27

    if-ne v2, v7, :cond_15

    :goto_27
    return-object v7

    :cond_15
    move-object v7, v3

    move-object v12, v8

    move-object v5, v9

    move-object v8, v10

    :goto_28
    :try_start_1a
    check-cast v2, Ll83/a0;

    invoke-static {v12}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v3

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v13, v26

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v9, v24

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    new-array v9, v10, [Lqr2/a$a;

    invoke-interface {v3, v6, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-nez v2, :cond_16

    invoke-static {v12}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v10, v23

    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    new-array v6, v10, [Lqr2/a$a;

    invoke-interface {v2, v3, v6}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_0

    :cond_16
    move-object v9, v5

    move-object v3, v7

    move-object v10, v8

    move-object v8, v12

    goto :goto_29

    :catchall_14
    move-exception v0

    move-object v2, v0

    move-object v8, v10

    goto/16 :goto_2b

    :cond_17
    move-object/from16 v8, p1

    :goto_29
    if-eqz v4, :cond_18

    :try_start_1b
    invoke-virtual {v3}, Lsj2/f;->b()Lbc3/s;

    move-result-object v2

    check-cast v2, Lbc3/t;

    invoke-virtual {v2, v4}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    move-result v2

    if-nez v2, :cond_18

    invoke-static {v8}, Lsj2/c;->e(Lsj2/c;)Ltr2/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v5, v21

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v5, v20

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x0

    new-array v4, v5, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_18
    const/4 v11, 0x0

    invoke-static {v8, v11}, Lsj2/c;->h(Lsj2/c;Lsj2/f;)V

    throw v0
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_14

    :catchall_15
    move-exception v0

    move-object v2, v0

    move-object v8, v4

    goto :goto_2b

    :cond_19
    move-object/from16 v27, v2

    move-object v2, v8

    move-object v9, v10

    move-object/from16 v10, v22

    const/16 v18, 0x3

    move/from16 v22, v5

    move-object v5, v13

    move-object v13, v11

    move-object v11, v3

    move v3, v6

    move-object v6, v12

    move/from16 v32, v3

    move-object v8, v4

    move v3, v7

    move-object v0, v11

    move/from16 v33, v22

    move-object v7, v2

    const/16 v17, 0x0

    const/4 v12, 0x5

    :goto_2a
    move-object v2, v10

    move-object v10, v9

    move-object v9, v2

    move-object v12, v6

    move-object v11, v13

    move-object/from16 v2, v27

    move/from16 v6, v32

    move-object v13, v5

    move/from16 v5, v33

    goto/16 :goto_0

    :cond_1a
    const/4 v11, 0x0

    invoke-interface {v4, v11}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_2b
    :try_start_1c
    throw v2
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_16

    :catchall_16
    move-exception v0

    invoke-static {v8, v2}, Lts/o;->f(Ldc3/w;Ljava/lang/Throwable;)V

    throw v0
.end method
