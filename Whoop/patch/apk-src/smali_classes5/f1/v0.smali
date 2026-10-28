.class public final Lf1/v0;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:I

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 1
    iput p4, p0, Lf1/v0;->x:I

    iput-object p1, p0, Lf1/v0;->E:Ljava/lang/Object;

    iput-object p2, p0, Lf1/v0;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p3, p0, Lf1/v0;->x:I

    iput-object p1, p0, Lf1/v0;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq83/j;Lc93/m;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lf1/v0;->x:I

    .line 3
    iput-object p1, p0, Lf1/v0;->E:Ljava/lang/Object;

    check-cast p2, Ls83/h;

    iput-object p2, p0, Lf1/v0;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4

    iget v0, p0, Lf1/v0;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v1, Lu0/d1;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p2, v2}, Lf1/v0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lf1/v0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v1, Lh0/z3;

    iget-object v2, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v2, Lbc3/c0;

    const/4 v3, 0x4

    invoke-direct {v0, v1, v2, p2, v3}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lf1/v0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v1, Lu2/l;

    iget-object v2, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    const/4 v3, 0x3

    invoke-direct {v0, v1, v2, p2, v3}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lf1/v0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_2
    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v1, Ld1/i;

    const/4 v2, 0x2

    invoke-direct {v0, v1, p2, v2}, Lf1/v0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lf1/v0;->E:Ljava/lang/Object;

    return-object v0

    :pswitch_3
    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v1, Lq83/j;

    iget-object v2, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v2, Ls83/h;

    invoke-direct {v0, v1, v2, p2}, Lf1/v0;-><init>(Lq83/j;Lc93/m;Lq83/d;)V

    iput-object p1, v0, Lf1/v0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_4
    new-instance v0, Lf1/v0;

    iget-object v1, p0, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v1, Lf1/w0;

    iget-object v2, p0, Lf1/v0;->F:Ljava/lang/Object;

    check-cast v2, Lf1/d0;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, p2, v3}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lf1/v0;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lf1/v0;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lf1/v0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lf1/v0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lf1/v0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    iget v0, v1, Lf1/v0;->x:I

    const/4 v2, 0x0

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const-string v6, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v7, 0x1

    iget-object v8, v1, Lf1/v0;->F:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    check-cast v8, Lu0/d1;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lf1/v0;->y:I

    if-eqz v2, :cond_2

    if-eq v2, v7, :cond_1

    if-ne v2, v4, :cond_0

    iget-object v2, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v6, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v6, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    iput-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v7, v1, Lf1/v0;->y:I

    invoke-static {v2, v1, v4}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v6, Lu2/r;

    iget-wide v9, v6, Lu2/r;->c:J

    invoke-interface {v8}, Lu0/d1;->a()V

    move-object/from16 v16, v6

    move-object v6, v2

    move-object/from16 v2, v16

    :goto_1
    iput-object v6, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput-object v2, v1, Lf1/v0;->E:Ljava/lang/Object;

    iput v4, v1, Lf1/v0;->y:I

    invoke-static {v6, v1}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_4

    :goto_2
    move-object v5, v0

    goto :goto_5

    :cond_4
    :goto_3
    check-cast v7, Lu2/k;

    iget-object v7, v7, Lu2/k;->a:Ljava/lang/Object;

    move-object v9, v7

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_4
    if-ge v10, v9, :cond_6

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lu2/r;

    iget-wide v12, v11, Lu2/r;->a:J

    iget-wide v14, v2, Lu2/r;->a:J

    invoke-static {v12, v13, v14, v15}, Lu2/q;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_5

    iget-boolean v11, v11, Lu2/r;->d:Z

    if-eqz v11, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto :goto_4

    :cond_6
    invoke-interface {v8}, Lu0/d1;->c()V

    :goto_5
    return-object v5

    :pswitch_0
    iget-object v0, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v0, Lh0/z3;

    iget-object v2, v0, Lh0/z3;->U:Ldc3/h;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Lf1/v0;->y:I

    sget-object v9, Lh0/t3;->b:Lh0/t3;

    if-eqz v4, :cond_8

    if-ne v4, v7, :cond_7

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_9

    :catch_0
    move-exception v0

    goto :goto_7

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    :try_start_1
    iget-object v0, v0, Lh0/z3;->T:Leg/j;

    iput v7, v1, Lf1/v0;->y:I

    invoke-static {v4, v2, v0, v1}, Landroidx/compose/foundation/gestures/c;->b(Lu2/b;Ldc3/h;Leg/j;Ls83/a;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-ne v0, v3, :cond_9

    move-object v5, v3

    goto :goto_8

    :cond_9
    :goto_6
    invoke-interface {v2, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :goto_7
    :try_start_2
    check-cast v8, Lbc3/c0;

    invoke-static {v8}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_6

    :goto_8
    return-object v5

    :cond_a
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_9
    invoke-interface {v2, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :pswitch_1
    check-cast v8, Lkotlin/jvm/internal/g0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lf1/v0;->y:I

    sget-object v9, Lh0/s1;->a:Lh0/s1;

    if-eqz v2, :cond_d

    if-eq v2, v7, :cond_c

    if-ne v2, v4, :cond_b

    iget-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto/16 :goto_10

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    iget-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_b

    :cond_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    :goto_a
    iget-object v6, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v6, Lu2/l;

    iput-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v7, v1, Lf1/v0;->y:I

    check-cast v2, Lu2/g0;

    invoke-virtual {v2, v6, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_e

    goto :goto_f

    :cond_e
    :goto_b
    check-cast v6, Lu2/k;

    iget-object v10, v6, Lu2/k;->a:Ljava/lang/Object;

    move-object v11, v10

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->size()I

    move-result v11

    const/4 v12, 0x0

    :goto_c
    if-ge v12, v11, :cond_17

    invoke-interface {v10, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lu2/r;

    invoke-static {v13}, Lu2/d0;->d(Lu2/r;)Z

    move-result v13

    if-nez v13, :cond_16

    iget v6, v6, Lu2/k;->c:I

    if-ne v6, v4, :cond_f

    sget-object v0, Lh0/u1;->a:Lh0/u1;

    iput-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto/16 :goto_12

    :cond_f
    move-object v6, v10

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v11, 0x0

    :goto_d
    if-ge v11, v6, :cond_12

    invoke-interface {v10, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lu2/r;

    invoke-virtual {v12}, Lu2/r;->l()Z

    move-result v13

    if-nez v13, :cond_11

    move-object v13, v2

    check-cast v13, Lu2/g0;

    iget-object v14, v13, Lu2/g0;->F:Lu2/h0;

    iget-wide v14, v14, Lu2/h0;->Y:J

    invoke-virtual {v13}, Lu2/g0;->b()J

    move-result-wide v3

    invoke-static {v12, v14, v15, v3, v4}, Lu2/d0;->h(Lu2/r;JJ)Z

    move-result v3

    if-eqz v3, :cond_10

    goto :goto_e

    :cond_10
    add-int/lit8 v11, v11, 0x1

    const/4 v4, 0x2

    goto :goto_d

    :cond_11
    :goto_e
    iput-object v9, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_12

    :cond_12
    sget-object v3, Lu2/l;->y:Lu2/l;

    iput-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v1, Lf1/v0;->y:I

    check-cast v2, Lu2/g0;

    invoke-virtual {v2, v3, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_13

    :goto_f
    move-object v5, v0

    goto :goto_12

    :cond_13
    :goto_10
    check-cast v3, Lu2/k;

    iget-object v3, v3, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v6, 0x0

    :goto_11
    if-ge v6, v4, :cond_15

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v10

    if-eqz v10, :cond_14

    iput-object v9, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_12

    :cond_14
    add-int/lit8 v6, v6, 0x1

    goto :goto_11

    :cond_15
    const/4 v4, 0x2

    goto/16 :goto_a

    :cond_16
    add-int/lit8 v12, v12, 0x1

    const/4 v4, 0x2

    goto :goto_c

    :cond_17
    new-instance v0, Lh0/t1;

    const/4 v2, 0x0

    invoke-interface {v10, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-direct {v0, v2}, Lh0/t1;-><init>(Lu2/r;)V

    iput-object v0, v8, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :goto_12
    return-object v5

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lf1/v0;->y:I

    if-eqz v3, :cond_19

    if-ne v3, v7, :cond_18

    iget-object v3, v1, Lf1/v0;->z:Ljava/lang/Object;

    iget-object v4, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v4, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_13

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v3, Lxb3/j;

    move-object v4, v3

    :cond_1a
    move-object v3, v8

    check-cast v3, Ld1/i;

    invoke-virtual {v3}, Ld1/i;->invoke()Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1b

    iput-object v4, v1, Lf1/v0;->E:Ljava/lang/Object;

    iput-object v3, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v7, v1, Lf1/v0;->y:I

    invoke-virtual {v4, v3, v1}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    move-object v5, v0

    goto :goto_14

    :cond_1b
    move-object v3, v2

    :goto_13
    if-nez v3, :cond_1a

    :goto_14
    return-object v5

    :pswitch_3
    iget-object v0, v1, Lf1/v0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lq83/j;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lf1/v0;->y:I

    const/4 v4, 0x3

    if-eqz v0, :cond_1f

    if-eq v0, v7, :cond_1e

    const/4 v9, 0x2

    if-eq v0, v9, :cond_1d

    if-ne v0, v4, :cond_1c

    iget-object v0, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_15

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    iget-object v0, v1, Lf1/v0;->z:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lu2/b;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/util/concurrent/CancellationException; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_16

    :catch_1
    move-exception v0

    goto :goto_18

    :cond_1e
    iget-object v0, v1, Lf1/v0;->z:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lu2/b;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/util/concurrent/CancellationException; {:try_start_4 .. :try_end_4} :catch_1

    goto :goto_17

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v0, Lu2/b;

    :goto_15
    move-object v6, v0

    :cond_20
    :goto_16
    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v0

    if-eqz v0, :cond_23

    :try_start_5
    move-object v0, v8

    check-cast v0, Ls83/h;

    iput-object v6, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v7, v1, Lf1/v0;->y:I

    invoke-interface {v0, v6, v1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_21

    goto :goto_19

    :cond_21
    :goto_17
    iput-object v6, v1, Lf1/v0;->z:Ljava/lang/Object;

    const/4 v9, 0x2

    iput v9, v1, Lf1/v0;->y:I

    sget-object v0, Lu2/l;->y:Lu2/l;

    invoke-static {v6, v0, v1}, Lh0/q3;->f(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/util/concurrent/CancellationException; {:try_start_5 .. :try_end_5} :catch_1

    if-ne v0, v3, :cond_20

    goto :goto_19

    :goto_18
    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v9

    if-eqz v9, :cond_22

    iput-object v6, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v4, v1, Lf1/v0;->y:I

    sget-object v0, Lu2/l;->y:Lu2/l;

    invoke-static {v6, v0, v1}, Lh0/q3;->f(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_20

    :goto_19
    move-object v5, v3

    goto :goto_1a

    :cond_22
    throw v0

    :cond_23
    :goto_1a
    return-object v5

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lf1/v0;->y:I

    if-eqz v3, :cond_26

    if-eq v3, v7, :cond_25

    const/4 v9, 0x2

    if-ne v3, v9, :cond_24

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v2, p1

    goto :goto_1d

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    iget-object v3, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_1b

    :cond_26
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lf1/v0;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    iput-object v3, v1, Lf1/v0;->z:Ljava/lang/Object;

    iput v7, v1, Lf1/v0;->y:I

    sget-object v4, Lh0/o3;->a:Lh0/d3;

    sget-object v4, Lu2/l;->x:Lu2/l;

    invoke-static {v3, v4, v1}, Lh0/o3;->d(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_27

    goto :goto_1c

    :cond_27
    :goto_1b
    check-cast v4, Lu2/r;

    sget-object v6, Lu2/l;->w:Lu2/l;

    iput-object v2, v1, Lf1/v0;->z:Ljava/lang/Object;

    const/4 v9, 0x2

    iput v9, v1, Lf1/v0;->y:I

    invoke-static {v3, v4, v6, v1}, Lh0/z0;->a(Lu2/b;Lu2/r;Lu2/l;Ls83/a;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_28

    :goto_1c
    move-object v5, v0

    goto :goto_1e

    :cond_28
    :goto_1d
    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_2a

    iget-object v0, v1, Lf1/v0;->E:Ljava/lang/Object;

    check-cast v0, Lf1/w0;

    invoke-virtual {v0}, Lf1/w0;->f()Lu0/f0;

    move-result-object v0

    if-eqz v0, :cond_29

    goto :goto_1e

    :cond_29
    check-cast v8, Lf1/d0;

    invoke-virtual {v8}, Lf1/d0;->invoke()Ljava/lang/Object;

    :cond_2a
    :goto_1e
    return-object v5

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
