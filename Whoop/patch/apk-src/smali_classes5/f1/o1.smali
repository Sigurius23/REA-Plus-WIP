.class public final Lf1/o1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:J

.field public y:I

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lf1/p;Ljava/lang/String;JLl3/u0;Lf1/s1;Lq3/r;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lf1/o1;->w:I

    .line 1
    iput-object p1, p0, Lf1/o1;->z:Ljava/lang/Object;

    iput-object p2, p0, Lf1/o1;->E:Ljava/lang/Object;

    iput-wide p3, p0, Lf1/o1;->x:J

    iput-object p5, p0, Lf1/o1;->F:Ljava/lang/Object;

    iput-object p6, p0, Lf1/o1;->G:Ljava/lang/Object;

    iput-object p7, p0, Lf1/o1;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p8}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ln53/x1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1/o1;->w:I

    .line 2
    iput-object p1, p0, Lf1/o1;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, Lf1/o1;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/o1;

    iget-object v1, p0, Lf1/o1;->H:Ljava/lang/Object;

    check-cast v1, Ln53/x1;

    invoke-direct {v0, v1, p2}, Lf1/o1;-><init>(Ln53/x1;Lq83/d;)V

    iput-object p1, v0, Lf1/o1;->G:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v2, Lf1/o1;

    iget-object p1, p0, Lf1/o1;->z:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lf1/p;

    iget-object p1, p0, Lf1/o1;->E:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/String;

    iget-wide v5, p0, Lf1/o1;->x:J

    iget-object p1, p0, Lf1/o1;->F:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ll3/u0;

    iget-object p1, p0, Lf1/o1;->G:Ljava/lang/Object;

    move-object v8, p1

    check-cast v8, Lf1/s1;

    iget-object p1, p0, Lf1/o1;->H:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Lq3/r;

    move-object v10, p2

    invoke-direct/range {v2 .. v10}, Lf1/o1;-><init>(Lf1/p;Ljava/lang/String;JLl3/u0;Lf1/s1;Lq3/r;Lq83/d;)V

    return-object v2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/o1;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lf1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lf1/o1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/o1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/o1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    iget v0, v1, Lf1/o1;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lf1/o1;->H:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ln53/x1;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lf1/o1;->y:I

    const/4 v4, 0x2

    const-string v5, "[execute] SerialProcessor worker ended (isActive: "

    const-string v6, " \'"

    const-string v7, "[execute] Job #"

    const/4 v8, 0x1

    const-string v9, ")"

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v8, :cond_1

    if-ne v0, v4, :cond_0

    iget-wide v11, v1, Lf1/o1;->x:J

    iget-object v0, v1, Lf1/o1;->F:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ln53/v1;

    iget-object v0, v1, Lf1/o1;->E:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ldc3/c;

    iget-object v0, v1, Lf1/o1;->z:Ljava/lang/Object;

    move-object v15, v0

    check-cast v15, Lkotlin/jvm/internal/g0;

    iget-object v0, v1, Lf1/o1;->G:Ljava/lang/Object;

    move-object/from16 v16, v0

    check-cast v16, Lbc3/c0;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move v0, v8

    move v8, v4

    move-object/from16 v4, v16

    move/from16 v16, v0

    move-object/from16 v0, p1

    move-object/from16 v17, v5

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move/from16 v17, v8

    move v8, v4

    move-object/from16 v4, v16

    move/from16 v16, v17

    move-object/from16 v17, v5

    goto/16 :goto_7

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Lf1/o1;->E:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v11, v1, Lf1/o1;->z:Ljava/lang/Object;

    check-cast v11, Lkotlin/jvm/internal/g0;

    iget-object v12, v1, Lf1/o1;->G:Ljava/lang/Object;

    check-cast v12, Lbc3/c0;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v14, v0

    move-object v15, v11

    move-object v11, v12

    move-object/from16 v12, p1

    goto :goto_2

    :catchall_1
    move-exception v0

    :goto_0
    move-object v1, v2

    goto/16 :goto_1b

    :catch_0
    move-exception v0

    move-object v1, v2

    goto/16 :goto_16

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lf1/o1;->G:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    new-instance v11, Lkotlin/jvm/internal/g0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    :try_start_2
    invoke-virtual {v2}, Ln53/x1;->a()Lb23/k;

    move-result-object v12

    iget-object v13, v12, Lb23/k;->c:Lb23/e;

    iget-object v14, v12, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->y:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_3

    iget-object v12, v12, Lb23/k;->b:Lb23/j;

    const-string v13, "[execute] SerialProcessor worker started"

    invoke-interface {v12, v15, v14, v13, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object v12, v2, Ln53/x1;->b:Ldc3/h;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v13, Ldc3/c;

    invoke-direct {v13, v12}, Ldc3/c;-><init>(Ldc3/h;)V

    :goto_1
    iput-object v0, v1, Lf1/o1;->G:Ljava/lang/Object;

    iput-object v11, v1, Lf1/o1;->z:Ljava/lang/Object;

    iput-object v13, v1, Lf1/o1;->E:Ljava/lang/Object;

    iput-object v10, v1, Lf1/o1;->F:Ljava/lang/Object;

    iput v8, v1, Lf1/o1;->y:I

    invoke-virtual {v13, v1}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v12
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v12, v3, :cond_4

    goto/16 :goto_1a

    :cond_4
    move-object v15, v11

    move-object v14, v13

    move-object v11, v0

    :goto_2
    :try_start_3
    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_c
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-eqz v0, :cond_b

    :try_start_4
    invoke-virtual {v14}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Ln53/v1;

    iget-object v0, v13, Ln53/v1;->d:Ljava/lang/String;

    iput-object v0, v15, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v2}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v12, v0, Lb23/k;->c:Lb23/e;

    move/from16 v16, v8

    sget-object v8, Lb23/g;->y:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v12, v8, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_9
    .catchall {:try_start_4 .. :try_end_4} :catchall_8

    if-eqz v4, :cond_5

    :try_start_5
    iget-object v4, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    iget v12, v13, Ln53/v1;->c:I

    iget-object v10, v15, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v17, v5

    :try_start_6
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v10, "\' starting execution"

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v10, 0x0

    invoke-interface {v4, v8, v0, v5, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    move-object v1, v2

    move-object/from16 v5, v17

    goto/16 :goto_1b

    :catch_1
    move-exception v0

    move-object v1, v2

    move-object v11, v15

    move-object/from16 v5, v17

    goto/16 :goto_16

    :catchall_3
    move-exception v0

    move-object/from16 v17, v5

    goto/16 :goto_0

    :catch_2
    move-exception v0

    move-object/from16 v17, v5

    :goto_3
    move-object v1, v2

    :goto_4
    move-object v11, v15

    goto/16 :goto_16

    :cond_5
    move-object/from16 v17, v5

    :goto_5
    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    :try_start_8
    iget-object v0, v13, Ln53/v1;->a:Lkotlin/jvm/functions/Function1;

    iput-object v11, v1, Lf1/o1;->G:Ljava/lang/Object;

    iput-object v15, v1, Lf1/o1;->z:Ljava/lang/Object;

    iput-object v14, v1, Lf1/o1;->E:Ljava/lang/Object;

    iput-object v13, v1, Lf1/o1;->F:Ljava/lang/Object;

    iput-wide v4, v1, Lf1/o1;->x:J
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    const/4 v8, 0x2

    :try_start_9
    iput v8, v1, Lf1/o1;->y:I

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    if-ne v0, v3, :cond_6

    goto/16 :goto_1a

    :cond_6
    move-wide/from16 v23, v4

    move-object v4, v11

    move-wide/from16 v11, v23

    goto :goto_8

    :catchall_4
    move-exception v0

    :goto_6
    move-wide/from16 v23, v4

    move-object v4, v11

    move-wide/from16 v11, v23

    goto :goto_7

    :catchall_5
    move-exception v0

    const/4 v8, 0x2

    goto :goto_6

    :goto_7
    :try_start_a
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_8
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    :goto_8
    :try_start_b
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v18

    sub-long v10, v18, v11

    iget v5, v2, Ln53/x1;->f:I

    add-int/lit8 v5, v5, 0x1

    iput v5, v2, Ln53/x1;->f:I

    iget v5, v2, Ln53/x1;->g:I

    add-int/lit8 v5, v5, -0x1

    iput v5, v2, Ln53/x1;->g:I

    instance-of v5, v0, Ll83/m;
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_7
    .catchall {:try_start_b .. :try_end_b} :catchall_7

    const-string v12, ", queued: "

    if-nez v5, :cond_9

    :try_start_c
    invoke-virtual {v2}, Ln53/x1;->a()Lb23/k;

    move-result-object v5

    iget-object v8, v5, Lb23/k;->c:Lb23/e;

    move-object/from16 v18, v3

    sget-object v3, Lb23/g;->y:Lb23/g;

    move-object/from16 p1, v4

    iget-object v4, v5, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v8, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v4, v5, Lb23/k;->b:Lb23/j;

    iget-object v5, v5, Lb23/k;->a:Ljava/lang/String;

    iget v8, v13, Ln53/v1;->c:I

    move-object/from16 v19, v14

    iget-object v14, v13, Ln53/v1;->d:Ljava/lang/String;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_4
    .catchall {:try_start_c .. :try_end_c} :catchall_2

    move-object/from16 v20, v15

    :try_start_d
    iget v15, v2, Ln53/x1;->f:I

    iget v1, v2, Ln53/x1;->g:I

    move-object/from16 v21, v0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\' completed execution in "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v8, "ms (completed: "

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v10, 0x0

    invoke-interface {v4, v3, v5, v0, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_3
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    goto :goto_a

    :catch_3
    move-exception v0

    :goto_9
    move-object v1, v2

    move-object/from16 v5, v17

    move-object/from16 v11, v20

    goto/16 :goto_16

    :catch_4
    move-exception v0

    move-object/from16 v20, v15

    goto :goto_9

    :cond_7
    move-object/from16 v21, v0

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    :cond_8
    :goto_a
    move-object/from16 v22, v2

    goto/16 :goto_10

    :cond_9
    move-object/from16 v21, v0

    move-object/from16 v18, v3

    move-object/from16 p1, v4

    move-object/from16 v19, v14

    move-object/from16 v20, v15

    :try_start_e
    invoke-virtual {v2}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->E:Lb23/g;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    iget v4, v13, Ln53/v1;->c:I

    iget-object v5, v13, Ln53/v1;->d:Ljava/lang/String;

    invoke-static/range {v21 .. v21}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    if-eqz v8, :cond_a

    :try_start_f
    invoke-virtual {v8}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v8
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_3
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    goto :goto_b

    :cond_a
    const/4 v8, 0x0

    :goto_b
    :try_start_10
    iget v14, v2, Ln53/x1;->f:I

    iget v15, v2, Ln53/x1;->g:I
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_6
    .catchall {:try_start_10 .. :try_end_10} :catchall_7

    move-object/from16 v22, v2

    :try_start_11
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, "\' failed after "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, "ms: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " (completed: "

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    invoke-interface {v1, v3, v0, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_10

    :catchall_6
    move-exception v0

    :goto_c
    move-object/from16 v5, v17

    :goto_d
    move-object/from16 v1, v22

    goto/16 :goto_1b

    :catch_5
    move-exception v0

    :goto_e
    move-object/from16 v5, v17

    move-object/from16 v11, v20

    :goto_f
    move-object/from16 v1, v22

    goto/16 :goto_16

    :catchall_7
    move-exception v0

    move-object/from16 v22, v2

    goto :goto_c

    :catch_6
    move-exception v0

    move-object/from16 v22, v2

    goto :goto_e

    :goto_10
    iget-object v0, v13, Ln53/v1;->b:Lbc3/t;

    new-instance v1, Ll83/n;

    move-object/from16 v2, v21

    invoke-direct {v1, v2}, Ll83/n;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_5
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move/from16 v8, v16

    move-object/from16 v5, v17

    move-object/from16 v3, v18

    move-object/from16 v13, v19

    move-object/from16 v11, v20

    move-object/from16 v2, v22

    const/4 v4, 0x2

    const/4 v10, 0x0

    goto/16 :goto_1

    :catch_7
    move-exception v0

    move-object/from16 v22, v2

    move-object/from16 v20, v15

    goto :goto_e

    :catch_8
    move-exception v0

    move-object/from16 v22, v2

    :goto_11
    move-object v11, v15

    move-object/from16 v5, v17

    goto :goto_f

    :catchall_8
    move-exception v0

    move-object/from16 v22, v2

    move-object/from16 v17, v5

    goto :goto_d

    :catch_9
    move-exception v0

    move-object/from16 v22, v2

    move-object/from16 v17, v5

    move-object v11, v15

    goto :goto_f

    :cond_b
    move-object/from16 v22, v2

    move-object/from16 v17, v5

    :try_start_12
    invoke-virtual/range {v22 .. v22}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_b
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    if-eqz v1, :cond_c

    :try_start_13
    iget-object v1, v0, Lb23/k;->b:Lb23/j;

    iget-object v0, v0, Lb23/k;->a:Ljava/lang/String;

    const-string v3, "[execute] SerialProcessor worker finished processing all jobs in channel"

    const/4 v10, 0x0

    invoke-interface {v1, v2, v0, v3, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_13
    .catch Ljava/lang/Exception; {:try_start_13 .. :try_end_13} :catch_a
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    goto :goto_12

    :catch_a
    move-exception v0

    goto :goto_11

    :cond_c
    :goto_12
    invoke-virtual/range {v22 .. v22}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_e

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    move-object/from16 v1, v22

    iget-object v4, v1, Ln53/x1;->c:Lbc3/c2;

    if-eqz v4, :cond_d

    invoke-virtual {v4}, Lbc3/t1;->isActive()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    :goto_13
    move-object/from16 v5, v17

    goto :goto_14

    :cond_d
    const/4 v4, 0x0

    goto :goto_13

    :goto_14
    invoke-static {v5, v4, v9}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v10, 0x0

    invoke-interface {v0, v2, v3, v4, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15

    :cond_e
    move-object/from16 v1, v22

    :cond_f
    const/4 v10, 0x0

    :goto_15
    iput-object v10, v1, Ln53/x1;->c:Lbc3/c2;

    goto :goto_19

    :catch_b
    move-exception v0

    move-object/from16 v5, v17

    move-object/from16 v1, v22

    goto/16 :goto_4

    :catch_c
    move-exception v0

    goto/16 :goto_3

    :goto_16
    :try_start_14
    invoke-virtual {v1}, Ln53/x1;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    sget-object v4, Lb23/g;->F:Lb23/g;

    iget-object v6, v2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v3, v4, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_10

    iget-object v3, v2, Lb23/k;->b:Lb23/j;

    iget-object v2, v2, Lb23/k;->a:Ljava/lang/String;

    iget-object v6, v11, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "[execute] SerialProcessor ("

    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v6, ") worker crashed: "

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v3, v4, v2, v6, v0}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_9

    goto :goto_17

    :catchall_9
    move-exception v0

    goto :goto_1b

    :cond_10
    :goto_17
    invoke-virtual {v1}, Ln53/x1;->a()Lb23/k;

    move-result-object v0

    iget-object v2, v0, Lb23/k;->c:Lb23/e;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v4, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v4, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_f

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    iget-object v2, v1, Ln53/x1;->c:Lbc3/c2;

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lbc3/t1;->isActive()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    goto :goto_18

    :cond_11
    const/4 v2, 0x0

    :goto_18
    invoke-static {v5, v2, v9}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v10, 0x0

    invoke-interface {v0, v4, v3, v2, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_15

    :goto_19
    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_1a
    return-object v3

    :goto_1b
    invoke-virtual {v1}, Ln53/x1;->a()Lb23/k;

    move-result-object v2

    iget-object v3, v2, Lb23/k;->c:Lb23/e;

    iget-object v4, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v3, v6, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_13

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    iget-object v3, v1, Ln53/x1;->c:Lbc3/c2;

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lbc3/t1;->isActive()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    goto :goto_1c

    :cond_12
    const/4 v10, 0x0

    :goto_1c
    invoke-static {v5, v10, v9}, Lte0/d;->j(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const/4 v10, 0x0

    invoke-interface {v2, v6, v4, v3, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1d

    :cond_13
    const/4 v10, 0x0

    :goto_1d
    iput-object v10, v1, Ln53/x1;->c:Lbc3/c2;

    throw v0

    :pswitch_0
    iget-object v0, v1, Lf1/o1;->H:Ljava/lang/Object;

    check-cast v0, Lq3/r;

    iget-object v2, v1, Lf1/o1;->E:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ljava/lang/String;

    iget-object v2, v1, Lf1/o1;->G:Ljava/lang/Object;

    check-cast v2, Lf1/s1;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lf1/o1;->y:I

    const/4 v5, 0x1

    if-eqz v3, :cond_15

    if-ne v3, v5, :cond_14

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_20

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lf1/o1;->z:Ljava/lang/Object;

    move-object v7, v3

    check-cast v7, Lf1/p;

    iget-wide v10, v1, Lf1/o1;->x:J

    iput v5, v1, Lf1/o1;->y:I

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v12, 0x0

    if-nez v3, :cond_16

    goto :goto_1e

    :cond_16
    invoke-static {v10, v11}, Ll3/u0;->c(J)Z

    move-result v3

    if-eqz v3, :cond_17

    :goto_1e
    move-object v3, v12

    goto :goto_1f

    :cond_17
    new-instance v3, Lf1/o;

    const/4 v8, 0x0

    move-wide v5, v10

    invoke-direct/range {v3 .. v8}, Lf1/o;-><init>(Ljava/lang/CharSequence;JLf1/p;Lq83/d;)V

    iget-object v5, v7, Lf1/p;->a:Lq83/j;

    new-instance v6, Lb2/y;

    invoke-direct {v6, v7, v3, v12}, Lb2/y;-><init>(Lf1/p;Lc93/m;Lq83/d;)V

    invoke-static {v5, v6, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    :goto_1f
    if-ne v3, v9, :cond_18

    goto :goto_21

    :cond_18
    :goto_20
    check-cast v3, Ll3/u0;

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    if-eqz v3, :cond_19

    iget-wide v5, v3, Ll3/u0;->a:J

    const/16 v3, 0x20

    shr-long v7, v5, v3

    long-to-int v3, v7

    invoke-interface {v0, v3}, Lq3/r;->n(I)I

    move-result v3

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int v5, v5

    invoke-interface {v0, v5}, Lq3/r;->n(I)I

    move-result v5

    invoke-static {v3, v5}, Lj93/l0;->f(II)J

    move-result-wide v5

    iget-object v3, v1, Lf1/o1;->F:Ljava/lang/Object;

    check-cast v3, Ll3/u0;

    invoke-static {v5, v6, v3}, Ll3/u0;->a(JLjava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    invoke-virtual {v2}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_19

    iget-object v3, v2, Lf1/s1;->b:Lq3/r;

    if-ne v0, v3, :cond_19

    iget-object v0, v2, Lf1/s1;->c:Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2}, Lf1/s1;->m()Lq3/y;

    move-result-object v3

    iget-object v3, v3, Lq3/y;->a:Ll3/g;

    invoke-static {v3, v5, v6}, Lf1/s1;->e(Ll3/g;J)Lq3/y;

    move-result-object v3

    invoke-interface {v0, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Ll3/u0;

    invoke-direct {v0, v5, v6}, Ll3/u0;-><init>(J)V

    iput-object v0, v2, Lf1/s1;->w:Ll3/u0;

    :cond_19
    :goto_21
    return-object v9

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
