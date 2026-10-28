.class public final La6/f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public G:Ljava/lang/Object;

.field public final synthetic H:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, La6/f;->w:I

    sget-object v0, Ld0/r0;->w:Ld0/r0;

    .line 1
    iput-object p1, p0, La6/f;->G:Ljava/lang/Object;

    check-cast p2, Ls83/i;

    iput-object p2, p0, La6/f;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ldc3/l;Ld0/e;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, La6/f;->w:I

    .line 2
    iput-object p1, p0, La6/f;->E:Ljava/lang/Object;

    iput-object p2, p0, La6/f;->F:Ljava/lang/Object;

    iput-object p3, p0, La6/f;->G:Ljava/lang/Object;

    iput-object p4, p0, La6/f;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/ArrayList;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, La6/f;->w:I

    .line 3
    iput-object p1, p0, La6/f;->G:Ljava/lang/Object;

    iput-object p2, p0, La6/f;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkk/b;Lq83/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, La6/f;->w:I

    .line 4
    iput-object p1, p0, La6/f;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/g0;Lp1/y1;Landroidx/lifecycle/g0;Lb3/r3;Landroid/view/View;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, La6/f;->w:I

    .line 5
    iput-object p1, p0, La6/f;->z:Ljava/lang/Object;

    iput-object p2, p0, La6/f;->E:Ljava/lang/Object;

    iput-object p3, p0, La6/f;->F:Ljava/lang/Object;

    iput-object p4, p0, La6/f;->G:Ljava/lang/Object;

    iput-object p5, p0, La6/f;->H:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 11

    iget v0, p0, La6/f;->w:I

    iget-object v1, p0, La6/f;->H:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    new-instance p1, La6/f;

    check-cast v1, Lkk/b;

    invoke-direct {p1, v1, p2}, La6/f;-><init>(Lkk/b;Lq83/d;)V

    return-object p1

    :pswitch_0
    new-instance v0, La6/f;

    sget-object v2, Ld0/r0;->w:Ld0/r0;

    iget-object v2, p0, La6/f;->G:Ljava/lang/Object;

    check-cast v2, Ld0/t0;

    check-cast v1, Ls83/i;

    invoke-direct {v0, v2, v1, p2}, La6/f;-><init>(Ld0/t0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    iput-object p1, v0, La6/f;->F:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v3, La6/f;

    iget-object v0, p0, La6/f;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ldc3/l;

    iget-object v0, p0, La6/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ld0/e;

    iget-object v0, p0, La6/f;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lp1/c1;

    move-object v7, v1

    check-cast v7, Lp1/c1;

    move-object v8, p2

    invoke-direct/range {v3 .. v8}, La6/f;-><init>(Ldc3/l;Ld0/e;Lp1/c1;Lp1/c1;Lq83/d;)V

    iput-object p1, v3, La6/f;->y:Ljava/lang/Object;

    return-object v3

    :pswitch_2
    move-object v8, p2

    new-instance v4, La6/f;

    iget-object p2, p0, La6/f;->z:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lkotlin/jvm/internal/g0;

    iget-object p2, p0, La6/f;->E:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lp1/y1;

    iget-object p2, p0, La6/f;->F:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Landroidx/lifecycle/g0;

    iget-object p2, p0, La6/f;->G:Ljava/lang/Object;

    check-cast p2, Lb3/r3;

    move-object v9, v1

    check-cast v9, Landroid/view/View;

    move-object v10, v8

    move-object v8, p2

    invoke-direct/range {v4 .. v10}, La6/f;-><init>(Lkotlin/jvm/internal/g0;Lp1/y1;Landroidx/lifecycle/g0;Lb3/r3;Landroid/view/View;Lq83/d;)V

    iput-object p1, v4, La6/f;->y:Ljava/lang/Object;

    return-object v4

    :pswitch_3
    move-object v8, p2

    new-instance p2, La6/f;

    iget-object v0, p0, La6/f;->G:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    check-cast v1, Ljava/util/ArrayList;

    invoke-direct {p2, v0, v1, v8}, La6/f;-><init>(Ljava/util/List;Ljava/util/ArrayList;Lq83/d;)V

    iput-object p1, p2, La6/f;->F:Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La6/f;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La6/f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La6/f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La6/f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v1, p0

    iget v0, v1, La6/f;->w:I

    const/4 v2, 0x0

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x3

    const/4 v5, 0x2

    iget-object v6, v1, La6/f;->H:Ljava/lang/Object;

    const-string v7, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v8, 0x0

    const/4 v9, 0x1

    packed-switch v0, :pswitch_data_0

    sget-object v10, Lr83/a;->w:Lr83/a;

    iget v0, v1, La6/f;->x:I

    const/4 v11, 0x5

    const/4 v12, 0x4

    if-eqz v0, :cond_5

    if-eq v0, v9, :cond_4

    if-eq v0, v5, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v12, :cond_1

    if-ne v0, v11, :cond_0

    iget-object v0, v1, La6/f;->y:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/util/Iterator;

    iget-object v0, v1, La6/f;->G:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ldc3/c;

    iget-object v0, v1, La6/f;->E:Ljava/lang/Object;

    move-object v13, v0

    check-cast v13, Ldc3/w;

    iget-object v0, v1, La6/f;->z:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Lkk/b;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/FileNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move/from16 v16, v9

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    move/from16 v16, v9

    goto/16 :goto_9

    :catch_1
    move-exception v0

    move/from16 v16, v9

    goto/16 :goto_a

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, La6/f;->F:Ljava/lang/Object;

    iget-object v6, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v7, Ldc3/c;

    iget-object v13, v1, La6/f;->E:Ljava/lang/Object;

    check-cast v13, Ldc3/w;

    iget-object v14, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v14, Lkk/b;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/io/FileNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v11, p1

    move/from16 v16, v9

    goto/16 :goto_6

    :cond_2
    iget-object v0, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v6, v1, La6/f;->E:Ljava/lang/Object;

    move-object v13, v6

    check-cast v13, Ldc3/w;

    iget-object v6, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v6, Lkk/b;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move/from16 v16, v9

    goto/16 :goto_4

    :cond_3
    iget-object v0, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v6, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v6, Ldc3/c;

    iget-object v7, v1, La6/f;->E:Ljava/lang/Object;

    move-object v13, v7

    check-cast v13, Ldc3/w;

    iget-object v7, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v7, Lkk/b;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move/from16 v16, v9

    goto :goto_2

    :cond_4
    iget-object v0, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v0, Ldc3/c;

    iget-object v6, v1, La6/f;->E:Ljava/lang/Object;

    move-object v13, v6

    check-cast v13, Ldc3/w;

    iget-object v6, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v6, Lkk/b;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    move-object/from16 v7, p1

    goto :goto_1

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v6, Lkk/b;

    iget-object v13, v6, Lkk/b;->h:Ldc3/l;

    :try_start_5
    invoke-interface {v13}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object v0

    :goto_0
    iput-object v6, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v13, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v0, v1, La6/f;->G:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->F:Ljava/lang/Object;

    iput v9, v1, La6/f;->x:I

    invoke-virtual {v0, v1}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v10, :cond_6

    goto/16 :goto_7

    :cond_6
    :goto_1
    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-virtual {v0}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v14, v6, Lkk/b;->a:Lgj/d;

    iget-object v14, v14, Lgj/d;->f:Lbc3/z;

    new-instance v15, Landroidx/room/z1;

    move/from16 v16, v9

    const/4 v9, 0x7

    invoke-direct {v15, v6, v8, v9}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object v6, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v13, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v0, v1, La6/f;->G:Ljava/lang/Object;

    iput-object v7, v1, La6/f;->y:Ljava/lang/Object;

    iput v5, v1, La6/f;->x:I

    invoke-static {v14, v15, v1}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_7

    goto/16 :goto_7

    :cond_7
    move-object/from16 v24, v6

    move-object v6, v0

    move-object v0, v7

    move-object/from16 v7, v24

    :goto_2
    const-string v9, "#!maxRetryAttemptReached"

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object v0, v7, Lkk/b;->a:Lgj/d;

    iget-object v0, v0, Lgj/d;->k:Lfk/a;

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Max retries "

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v14, v7, Lkk/b;->d:Lbd3/v;

    iget v14, v14, Lbd3/v;->x:I

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v14, " reached, temporarily stop consuming upload signals."

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v9

    invoke-interface {v0, v9}, Lfk/a;->debug(Ljava/lang/String;)V

    iget-object v0, v7, Lkk/b;->d:Lbd3/v;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget v0, v0, Lbd3/v;->x:I

    add-int/lit8 v0, v0, 0x1

    int-to-double v14, v0

    const-wide/high16 v11, 0x4000000000000000L    # 2.0

    invoke-static {v11, v12, v14, v15}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v11

    double-to-int v0, v11

    const/16 v11, 0x3e8

    mul-int/2addr v11, v0

    const v0, 0xea60

    if-le v0, v11, :cond_8

    goto :goto_3

    :cond_8
    move v11, v0

    :goto_3
    int-to-long v11, v11

    iput-object v7, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v13, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v6, v1, La6/f;->G:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->y:Ljava/lang/Object;

    iput v4, v1, La6/f;->x:I

    invoke-static {v11, v12, v1}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_9

    goto/16 :goto_7

    :cond_9
    move-object v0, v6

    move-object v6, v7

    :goto_4
    iget-object v7, v6, Lkk/b;->d:Lbd3/v;

    iget-object v7, v7, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v7, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v7, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v7, v6, Lkk/b;->a:Lgj/d;

    iget-object v7, v7, Lgj/d;->k:Lfk/a;

    const-string v11, "Enable consuming of upload signals again."

    invoke-interface {v7, v11}, Lfk/a;->debug(Ljava/lang/String;)V

    move-object v7, v6

    move-object v6, v0

    :cond_a
    iget-object v0, v7, Lkk/b;->e:Lik/b;

    invoke-interface {v0}, Lik/b;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v14, v7

    move-object v7, v6

    move-object v6, v0

    :cond_b
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :try_start_6
    iget-object v11, v14, Lkk/b;->e:Lik/b;

    iput-object v14, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v13, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v7, v1, La6/f;->G:Ljava/lang/Object;

    iput-object v6, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v0, v1, La6/f;->F:Ljava/lang/Object;
    :try_end_6
    .catch Ljava/io/FileNotFoundException; {:try_start_6 .. :try_end_6} :catch_7
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    const/4 v12, 0x4

    :try_start_7
    iput v12, v1, La6/f;->x:I

    invoke-interface {v11, v0, v1}, Lik/b;->d(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_c

    goto :goto_7

    :cond_c
    :goto_6
    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_d

    const/4 v11, 0x5

    goto :goto_5

    :cond_d
    iget-object v15, v14, Lkk/b;->a:Lgj/d;

    iget-object v15, v15, Lgj/d;->n:Lwe/o;

    invoke-virtual {v15}, Lwe/o;->E()Ljava/lang/String;

    move-result-object v15

    iget-object v9, v14, Lkk/b;->c:Laj/d;

    invoke-virtual {v9, v11, v15}, Laj/d;->C(Ljava/lang/String;Ljava/lang/String;)Lal/a;

    move-result-object v9

    iget-object v15, v14, Lkk/b;->l:Ll83/p;

    invoke-virtual {v15}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lnk/m;

    invoke-virtual {v15, v9, v0, v11}, Lnk/m;->a(Lal/a;Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v0

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_f

    iget-object v0, v14, Lkk/b;->d:Lbd3/v;

    new-instance v9, Lj43/a;

    invoke-direct {v9, v14, v5}, Lj43/a;-><init>(Ljava/lang/Object;I)V

    iput-object v14, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v13, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v7, v1, La6/f;->G:Ljava/lang/Object;

    iput-object v6, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->F:Ljava/lang/Object;
    :try_end_7
    .catch Ljava/io/FileNotFoundException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v11, 0x5

    :try_start_8
    iput v11, v1, La6/f;->x:I

    invoke-virtual {v0, v9, v1}, Lbd3/v;->a(Lj43/a;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_e

    :goto_7
    move-object v3, v10

    goto :goto_c

    :cond_e
    :goto_8
    move-object v0, v7

    move-object v6, v14

    goto :goto_b

    :catch_2
    move-exception v0

    goto :goto_9

    :catch_3
    move-exception v0

    goto :goto_a

    :catch_4
    move-exception v0

    const/4 v11, 0x5

    goto :goto_9

    :catch_5
    move-exception v0

    const/4 v11, 0x5

    goto :goto_a

    :cond_f
    const/4 v11, 0x5

    iget-object v0, v14, Lkk/b;->d:Lbd3/v;

    iget-object v0, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V
    :try_end_8
    .catch Ljava/io/FileNotFoundException; {:try_start_8 .. :try_end_8} :catch_3
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto :goto_5

    :catch_6
    move-exception v0

    const/4 v11, 0x5

    const/4 v12, 0x4

    goto :goto_9

    :catch_7
    move-exception v0

    const/4 v11, 0x5

    const/4 v12, 0x4

    goto :goto_a

    :goto_9
    :try_start_9
    iget-object v9, v14, Lkk/b;->a:Lgj/d;

    iget-object v9, v9, Lgj/d;->k:Lfk/a;

    const-string v15, "Error when uploading event"

    invoke-static {v0, v9, v15}, Lio/sentry/config/a;->P(Ljava/lang/Exception;Lfk/a;Ljava/lang/String;)V

    goto/16 :goto_5

    :goto_a
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    iget-object v9, v14, Lkk/b;->a:Lgj/d;

    iget-object v9, v9, Lgj/d;->k:Lfk/a;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "Event storage file not found: "

    invoke-virtual {v15, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v9, v0}, Lfk/a;->warn(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto/16 :goto_5

    :cond_10
    const/4 v12, 0x4

    goto :goto_8

    :goto_b
    move/from16 v9, v16

    const/4 v11, 0x5

    goto/16 :goto_0

    :cond_11
    invoke-interface {v13, v8}, Ldc3/w;->cancel(Ljava/util/concurrent/CancellationException;)V

    :goto_c
    return-object v3

    :goto_d
    :try_start_a
    throw v2
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v13, v2}, Lts/o;->f(Ldc3/w;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_0
    move/from16 v16, v9

    iget-object v0, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v0, Ld0/t0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/f;->x:I

    if-eqz v3, :cond_14

    move/from16 v4, v16

    if-eq v3, v4, :cond_13

    if-ne v3, v5, :cond_12

    iget-object v0, v1, La6/f;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ld0/t0;

    iget-object v0, v1, La6/f;->z:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lmc3/a;

    iget-object v0, v1, La6/f;->F:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ld0/s0;

    :try_start_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    move-object/from16 v0, p1

    goto/16 :goto_12

    :catchall_2
    move-exception v0

    goto/16 :goto_15

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    iget-object v0, v1, La6/f;->E:Ljava/lang/Object;

    check-cast v0, Ld0/t0;

    iget-object v3, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v4, Lmc3/a;

    iget-object v6, v1, La6/f;->F:Ljava/lang/Object;

    check-cast v6, Ld0/s0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v6

    move-object v6, v4

    move-object v4, v3

    :goto_e
    move-object v3, v0

    goto :goto_11

    :cond_14
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/f;->F:Ljava/lang/Object;

    check-cast v3, Lbc3/c0;

    new-instance v9, Ld0/s0;

    sget-object v4, Ld0/r0;->w:Ld0/r0;

    invoke-interface {v3}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v3

    sget-object v4, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v3, v4}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lbc3/k1;

    invoke-direct {v9, v3}, Ld0/s0;-><init>(Lbc3/k1;)V

    iget-object v10, v0, Ld0/t0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_f
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ld0/s0;

    if-eqz v11, :cond_16

    sget-object v3, Ld0/r0;->w:Ld0/r0;

    invoke-virtual {v3, v3}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v3

    if-ltz v3, :cond_15

    goto :goto_10

    :cond_15
    new-instance v0, Ljava/util/concurrent/CancellationException;

    const-string v2, "Current mutation had a higher priority"

    invoke-direct {v0, v2}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    :goto_10
    invoke-virtual {v10, v11, v9}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1d

    if-eqz v11, :cond_17

    iget-object v3, v11, Ld0/s0;->a:Lbc3/k1;

    new-instance v4, Landroidx/compose/animation/core/MutationInterruptedException;

    invoke-direct {v4}, Landroidx/compose/animation/core/MutationInterruptedException;-><init>()V

    invoke-interface {v3, v4}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_17
    iget-object v3, v0, Ld0/t0;->b:Lmc3/c;

    move-object v4, v6

    check-cast v4, Ls83/i;

    iput-object v9, v1, La6/f;->F:Ljava/lang/Object;

    iput-object v3, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v4, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v0, v1, La6/f;->E:Ljava/lang/Object;

    const/4 v6, 0x1

    iput v6, v1, La6/f;->x:I

    invoke-virtual {v3, v1}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_18

    goto :goto_14

    :cond_18
    move-object v6, v3

    goto :goto_e

    :goto_11
    :try_start_c
    iput-object v9, v1, La6/f;->F:Ljava/lang/Object;

    iput-object v6, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v3, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->E:Ljava/lang/Object;

    iput v5, v1, La6/f;->x:I

    invoke-interface {v4, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    if-ne v0, v2, :cond_19

    goto :goto_14

    :cond_19
    move-object v2, v3

    move-object v3, v6

    move-object v4, v9

    :goto_12
    :try_start_d
    iget-object v2, v2, Ld0/t0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :cond_1a
    invoke-virtual {v2, v4, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1b

    goto :goto_13

    :cond_1b
    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    if-eq v5, v4, :cond_1a

    :goto_13
    invoke-interface {v3, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    move-object v2, v0

    :goto_14
    return-object v2

    :catchall_3
    move-exception v0

    goto :goto_17

    :catchall_4
    move-exception v0

    move-object v2, v3

    move-object v3, v6

    move-object v4, v9

    :goto_15
    :try_start_e
    iget-object v2, v2, Ld0/t0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_16
    invoke-virtual {v2, v4, v8}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1c

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_1c

    goto :goto_16

    :cond_1c
    throw v0
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_3

    :goto_17
    invoke-interface {v3, v8}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw v0

    :cond_1d
    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    if-eq v3, v11, :cond_16

    goto/16 :goto_f

    :pswitch_1
    iget-object v0, v1, La6/f;->E:Ljava/lang/Object;

    check-cast v0, Ldc3/l;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v5, v1, La6/f;->x:I

    if-eqz v5, :cond_1f

    const/4 v9, 0x1

    if-ne v5, v9, :cond_1e

    iget-object v5, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v5, Ldc3/c;

    iget-object v7, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v7, Lbc3/c0;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v9, p1

    goto :goto_19

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v5, Lbc3/c0;

    invoke-interface {v0}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object v7

    move-object/from16 v24, v7

    move-object v7, v5

    move-object/from16 v5, v24

    :goto_18
    iput-object v7, v1, La6/f;->y:Ljava/lang/Object;

    iput-object v5, v1, La6/f;->z:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v1, La6/f;->x:I

    invoke-virtual {v5, v1}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v2, :cond_20

    move-object v3, v2

    goto :goto_1b

    :cond_20
    :goto_19
    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    if-eqz v9, :cond_22

    invoke-virtual {v5}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v0}, Ldc3/w;->f()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v10}, Ldc3/o;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_21

    move-object/from16 v18, v9

    goto :goto_1a

    :cond_21
    move-object/from16 v18, v10

    :goto_1a
    new-instance v17, Landroidx/lifecycle/e1;

    iget-object v9, v1, La6/f;->F:Ljava/lang/Object;

    move-object/from16 v19, v9

    check-cast v19, Ld0/e;

    iget-object v9, v1, La6/f;->G:Ljava/lang/Object;

    move-object/from16 v20, v9

    check-cast v20, Lp1/c1;

    move-object/from16 v21, v6

    check-cast v21, Lp1/c1;

    const/16 v22, 0x0

    const/16 v23, 0x3

    invoke-direct/range {v17 .. v23}, Landroidx/lifecycle/e1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v9, v17

    invoke-static {v7, v8, v8, v9, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_18

    :cond_22
    :goto_1b
    return-object v3

    :pswitch_2
    iget-object v0, v1, La6/f;->G:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lb3/r3;

    iget-object v0, v1, La6/f;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Landroidx/lifecycle/g0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v9, v1, La6/f;->x:I

    if-eqz v9, :cond_24

    const/4 v10, 0x1

    if-ne v9, v10, :cond_23

    iget-object v0, v1, La6/f;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lbc3/k1;

    :try_start_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    goto :goto_1d

    :catchall_5
    move-exception v0

    goto :goto_1f

    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v7, v1, La6/f;->y:Ljava/lang/Object;

    check-cast v7, Lbc3/c0;

    :try_start_10
    iget-object v9, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v9, Lkotlin/jvm/internal/g0;

    iget-object v9, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v9, Lb3/o2;

    if-eqz v9, :cond_25

    check-cast v6, Landroid/view/View;

    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    invoke-static {v6}, Lb3/t3;->a(Landroid/content/Context;)Lec3/f2;

    move-result-object v6

    invoke-interface {v6}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Number;

    invoke-virtual {v10}, Ljava/lang/Number;->floatValue()F

    move-result v10

    iget-object v11, v9, Lb3/o2;->w:Lp1/g1;

    invoke-virtual {v11, v10}, Lp1/g1;->y(F)V

    new-instance v10, La6/c;

    const/16 v11, 0x8

    invoke-direct {v10, v6, v9, v8, v11}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v7, v8, v8, v10, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v4
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    goto :goto_1c

    :catchall_6
    move-exception v0

    move-object v4, v8

    goto :goto_1f

    :cond_25
    move-object v4, v8

    :goto_1c
    :try_start_11
    iget-object v6, v1, La6/f;->E:Ljava/lang/Object;

    check-cast v6, Lp1/y1;

    iput-object v4, v1, La6/f;->y:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v1, La6/f;->x:I

    invoke-virtual {v6, v1}, Lp1/y1;->H(Ls83/i;)Ljava/lang/Object;

    move-result-object v6
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_5

    if-ne v6, v0, :cond_26

    move-object v3, v0

    goto :goto_1e

    :cond_26
    :goto_1d
    if-eqz v4, :cond_27

    invoke-interface {v4, v8}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_27
    invoke-interface {v5}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :goto_1e
    return-object v3

    :goto_1f
    if-eqz v4, :cond_28

    invoke-interface {v4, v8}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_28
    invoke-interface {v5}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    throw v0

    :pswitch_3
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/f;->x:I

    if-eqz v3, :cond_2b

    const/4 v9, 0x1

    if-eq v3, v9, :cond_2a

    if-ne v3, v5, :cond_29

    iget-object v3, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/Iterator;

    iget-object v4, v1, La6/f;->F:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v4

    const/4 v9, 0x1

    move-object v4, v3

    move-object/from16 v3, p1

    goto :goto_20

    :cond_29
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v7}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2a
    iget-object v3, v1, La6/f;->y:Ljava/lang/Object;

    iget-object v4, v1, La6/f;->E:Ljava/lang/Object;

    check-cast v4, Ld6/b;

    iget-object v6, v1, La6/f;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/Iterator;

    iget-object v7, v1, La6/f;->F:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v7

    move-object v7, v4

    move-object v4, v6

    move-object v6, v9

    move-object/from16 v10, p1

    const/4 v9, 0x1

    goto :goto_21

    :cond_2b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, La6/f;->F:Ljava/lang/Object;

    iget-object v4, v1, La6/f;->G:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    check-cast v6, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2c
    :goto_20
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ld6/b;

    iput-object v6, v1, La6/f;->F:Ljava/lang/Object;

    iput-object v4, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v7, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v3, v1, La6/f;->y:Ljava/lang/Object;

    const/4 v9, 0x1

    iput v9, v1, La6/f;->x:I

    invoke-virtual {v7, v3, v1}, Ld6/b;->a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v0, :cond_2d

    goto :goto_22

    :cond_2d
    :goto_21
    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-eqz v10, :cond_2c

    new-instance v10, La6/e;

    invoke-direct {v10, v7, v8, v2}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-interface {v6, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iput-object v6, v1, La6/f;->F:Ljava/lang/Object;

    iput-object v4, v1, La6/f;->z:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->E:Ljava/lang/Object;

    iput-object v8, v1, La6/f;->y:Ljava/lang/Object;

    iput v5, v1, La6/f;->x:I

    iget-object v10, v7, Ld6/b;->b:Le6/i;

    new-instance v11, Ld6/d;

    iget-object v12, v7, Ld6/b;->e:Ll83/p;

    invoke-virtual {v12}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/SharedPreferences;

    iget-object v7, v7, Ld6/b;->f:Ljava/util/Set;

    invoke-direct {v11, v12, v7}, Ld6/d;-><init>(Landroid/content/SharedPreferences;Ljava/util/Set;)V

    invoke-virtual {v10, v11, v3, v1}, Le6/i;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_2c

    goto :goto_22

    :cond_2e
    move-object v0, v3

    :goto_22
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
