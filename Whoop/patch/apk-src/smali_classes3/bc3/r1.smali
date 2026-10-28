.class public final Lbc3/r1;
.super Ls83/h;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic x:I

.field public y:I

.field public synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lbc3/c0;Ll1/x4;Lq83/d;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, Lbc3/r1;->x:I

    .line 1
    iput-object p1, p0, Lbc3/r1;->F:Ljava/lang/Object;

    iput-object p2, p0, Lbc3/r1;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Lbc3/r1;->x:I

    iput-object p1, p0, Lbc3/r1;->E:Ljava/lang/Object;

    iput-object p2, p0, Lbc3/r1;->F:Ljava/lang/Object;

    iput-object p3, p0, Lbc3/r1;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Lq83/d;I)V
    .locals 0

    .line 3
    iput p3, p0, Lbc3/r1;->x:I

    iput-object p1, p0, Lbc3/r1;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/h;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10

    iget v0, p0, Lbc3/r1;->x:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lbc3/r1;

    iget-object v1, p0, Lbc3/r1;->G:Ljava/lang/Object;

    check-cast v1, Lq0/y;

    const/4 v2, 0x5

    invoke-direct {v0, v1, p2, v2}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lbc3/r1;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_0
    new-instance v0, Lbc3/r1;

    iget-object v1, p0, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    iget-object v2, p0, Lbc3/r1;->G:Ljava/lang/Object;

    check-cast v2, Ll1/x4;

    invoke-direct {v0, v1, v2, p2}, Lbc3/r1;-><init>(Lbc3/c0;Ll1/x4;Lq83/d;)V

    iput-object p1, v0, Lbc3/r1;->z:Ljava/lang/Object;

    return-object v0

    :pswitch_1
    new-instance v3, Lbc3/r1;

    iget-object v0, p0, Lbc3/r1;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lq83/j;

    iget-object v0, p0, Lbc3/r1;->F:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Le10/k0;

    iget-object v0, p0, Lbc3/r1;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ldc3/l;

    const/4 v8, 0x3

    move-object v7, p2

    invoke-direct/range {v3 .. v8}, Lbc3/r1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v3, Lbc3/r1;->z:Ljava/lang/Object;

    return-object v3

    :pswitch_2
    move-object v7, p2

    new-instance v4, Lbc3/r1;

    iget-object p2, p0, Lbc3/r1;->E:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Lf1/j;

    iget-object p2, p0, Lbc3/r1;->F:Ljava/lang/Object;

    move-object v6, p2

    check-cast v6, Lab/h0;

    iget-object p2, p0, Lbc3/r1;->G:Ljava/lang/Object;

    check-cast p2, Lu0/d1;

    const/4 v9, 0x2

    move-object v8, v7

    move-object v7, p2

    invoke-direct/range {v4 .. v9}, Lbc3/r1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v4, Lbc3/r1;->z:Ljava/lang/Object;

    return-object v4

    :pswitch_3
    move-object v7, p2

    new-instance p2, Lbc3/r1;

    iget-object v0, p0, Lbc3/r1;->G:Ljava/lang/Object;

    check-cast v0, Lc1/a;

    const/4 v1, 0x1

    invoke-direct {p2, v0, v7, v1}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lbc3/r1;->z:Ljava/lang/Object;

    return-object p2

    :pswitch_4
    move-object v7, p2

    new-instance p2, Lbc3/r1;

    iget-object v0, p0, Lbc3/r1;->G:Ljava/lang/Object;

    check-cast v0, Lbc3/t1;

    const/4 v1, 0x0

    invoke-direct {p2, v0, v7, v1}, Lbc3/r1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, p2, Lbc3/r1;->z:Ljava/lang/Object;

    return-object p2

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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lbc3/r1;->x:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p1

    :pswitch_1
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    check-cast p1, Lu2/b;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    check-cast p1, Lxb3/j;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbc3/r1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbc3/r1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbc3/r1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

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
    .locals 21

    move-object/from16 v1, p0

    iget v0, v1, Lbc3/r1;->x:I

    const/4 v2, 0x0

    const/4 v5, 0x4

    const-wide/16 v6, 0x0

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    const-string v12, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v13, 0x2

    iget-object v14, v1, Lbc3/r1;->G:Ljava/lang/Object;

    const/4 v15, 0x1

    packed-switch v0, :pswitch_data_0

    check-cast v14, Lq0/y;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lbc3/r1;->y:I

    if-eqz v2, :cond_2

    if-eq v2, v15, :cond_1

    if-ne v2, v13, :cond_0

    iget-object v2, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v3, Lu2/r;

    iget-object v4, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v9, v2

    move-object v2, v4

    move-object/from16 v4, p1

    goto :goto_3

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    sget-object v3, Lu2/l;->w:Lu2/l;

    iput-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput v15, v1, Lbc3/r1;->y:I

    invoke-static {v2, v10, v3, v1}, Lh0/o3;->b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v3, Lu2/r;

    iget-object v4, v14, Lq0/y;->c:Lp1/k1;

    new-instance v5, Lh2/b;

    invoke-direct {v5, v6, v7}, Lh2/b;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_1
    if-nez v9, :cond_7

    sget-object v4, Lu2/l;->w:Lu2/l;

    iput-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    iput-object v9, v1, Lbc3/r1;->F:Ljava/lang/Object;

    iput v13, v1, Lbc3/r1;->y:I

    check-cast v2, Lu2/g0;

    invoke-virtual {v2, v4, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_4

    :goto_2
    move-object v11, v0

    goto :goto_5

    :cond_4
    :goto_3
    check-cast v4, Lu2/k;

    iget-object v5, v4, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v5

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    move v7, v10

    :goto_4
    if-ge v7, v6, :cond_6

    invoke-interface {v5, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-static {v8}, Lu2/d0;->d(Lu2/r;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_6
    iget-object v4, v4, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    move-object v9, v4

    check-cast v9, Lu2/r;

    goto :goto_1

    :cond_7
    iget-wide v4, v9, Lu2/r;->c:J

    iget-wide v2, v3, Lu2/r;->c:J

    invoke-static {v4, v5, v2, v3}, Lh2/b;->g(JJ)J

    move-result-wide v2

    iget-object v0, v14, Lq0/y;->c:Lp1/k1;

    new-instance v4, Lh2/b;

    invoke-direct {v4, v2, v3}, Lh2/b;-><init>(J)V

    invoke-virtual {v0, v4}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :goto_5
    return-object v11

    :pswitch_0
    move-object v0, v14

    check-cast v0, Ll1/x4;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbc3/r1;->y:I

    if-eqz v3, :cond_9

    if-ne v3, v15, :cond_8

    iget-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v3, Lu2/l;

    iget-object v4, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    move-object/from16 v6, p1

    goto :goto_7

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    sget-object v4, Lu2/l;->x:Lu2/l;

    :cond_a
    :goto_6
    iput-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput-object v4, v1, Lbc3/r1;->E:Ljava/lang/Object;

    iput v15, v1, Lbc3/r1;->y:I

    check-cast v3, Lu2/g0;

    invoke-virtual {v3, v4, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_b

    return-object v2

    :cond_b
    :goto_7
    check-cast v6, Lu2/k;

    iget-object v7, v6, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {v7, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    iget v7, v7, Lu2/r;->i:I

    if-ne v7, v13, :cond_a

    iget v6, v6, Lu2/k;->f:I

    if-ne v6, v5, :cond_c

    iget-object v6, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v6, Lbc3/c0;

    new-instance v7, Lm1/j;

    invoke-direct {v7, v0, v9, v15}, Lm1/j;-><init>(Ll1/x4;Lq83/d;I)V

    invoke-static {v6, v9, v9, v7, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_6

    :cond_c
    const/4 v7, 0x5

    if-ne v6, v7, :cond_a

    invoke-virtual {v0}, Ll1/x4;->a()V

    goto :goto_6

    :pswitch_1
    iget-object v0, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v0, Le10/k0;

    check-cast v14, Ldc3/l;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v8, v1, Lbc3/r1;->y:I

    sget-object v9, Lh0/t3;->b:Lh0/t3;

    if-eqz v8, :cond_f

    if-eq v8, v15, :cond_e

    if-ne v8, v13, :cond_d

    iget-object v8, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v8, Lu2/b;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v3, p1

    move-object v10, v14

    const-wide v16, 0xffffffffL

    goto :goto_c

    :catchall_0
    move-exception v0

    move-object v10, v14

    goto/16 :goto_d

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    iget-object v8, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v8, Lu2/b;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object/from16 v10, p1

    goto :goto_9

    :cond_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v8, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v8, Lu2/b;

    :goto_8
    iget-object v10, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v10, Lq83/j;

    invoke-static {v10}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v10

    if-eqz v10, :cond_13

    :try_start_2
    iput-object v8, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput v15, v1, Lbc3/r1;->y:I

    invoke-static {v8, v0, v1}, Landroidx/compose/foundation/gestures/c;->a(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_10

    goto :goto_b

    :cond_10
    :goto_9
    check-cast v10, Lh2/b;

    const-wide v16, 0xffffffffL

    iget-wide v3, v10, Lh2/b;->a:J

    sget-object v10, Lh0/s3;->b:Lh0/s3;

    invoke-interface {v14, v10}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_a
    and-long v3, v3, v16

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const v4, 0x44084000    # 545.0f

    div-float/2addr v3, v4

    const/high16 v4, 0x40000000    # 2.0f

    move-object v10, v14

    float-to-double v13, v4

    float-to-double v3, v3

    :try_start_3
    invoke-static {v13, v14, v3, v4}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    new-instance v4, Lh0/r3;

    invoke-direct {v4, v3, v6, v7, v2}, Lh0/r3;-><init>(FJF)V

    invoke-interface {v10, v4}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v8, v1, Lbc3/r1;->z:Ljava/lang/Object;

    const/4 v3, 0x2

    iput v3, v1, Lbc3/r1;->y:I

    invoke-static {v8, v0, v1}, Landroidx/compose/foundation/gestures/c;->c(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v5, :cond_11

    :goto_b
    move-object v11, v5

    goto :goto_e

    :cond_11
    :goto_c
    check-cast v3, Lh2/b;

    if-eqz v3, :cond_12

    iget-wide v3, v3, Lh2/b;->a:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-object v14, v10

    const/4 v13, 0x2

    goto :goto_a

    :catchall_1
    move-exception v0

    goto :goto_d

    :cond_12
    invoke-interface {v10, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move-object v14, v10

    const/4 v13, 0x2

    goto :goto_8

    :goto_d
    invoke-interface {v10, v9}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    throw v0

    :cond_13
    :goto_e
    return-object v11

    :pswitch_2
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lbc3/r1;->y:I

    if-eqz v2, :cond_17

    if-eq v2, v15, :cond_16

    const/4 v3, 0x2

    if-eq v2, v3, :cond_15

    if-ne v2, v8, :cond_14

    goto :goto_f

    :cond_14
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    :goto_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_14

    :cond_16
    iget-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_10

    :cond_17
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v2, Lu2/b;

    iput-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput v15, v1, Lbc3/r1;->y:I

    invoke-static {v2, v1}, Lf1/y0;->j(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_18

    goto :goto_13

    :cond_18
    :goto_10
    check-cast v3, Lu2/k;

    invoke-static {v3}, Lf1/y0;->w(Lu2/k;)Z

    move-result v4

    if-eqz v4, :cond_1b

    iget v4, v3, Lu2/k;->d:I

    and-int/lit8 v4, v4, 0x21

    if-eqz v4, :cond_1b

    iget-object v4, v3, Lu2/k;->a:Ljava/lang/Object;

    move-object v5, v4

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->size()I

    move-result v5

    :goto_11
    if-ge v10, v5, :cond_1a

    invoke-interface {v4, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lu2/r;

    invoke-virtual {v6}, Lu2/r;->l()Z

    move-result v6

    if-eqz v6, :cond_19

    goto :goto_12

    :cond_19
    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    :cond_1a
    iget-object v4, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v4, Lf1/j;

    iget-object v5, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v5, Lab/h0;

    iput-object v9, v1, Lbc3/r1;->z:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v1, Lbc3/r1;->y:I

    invoke-static {v2, v4, v5, v3, v1}, Lf1/y0;->k(Lu2/b;Lf1/j;Lab/h0;Lu2/k;Ls83/a;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1c

    goto :goto_13

    :cond_1b
    :goto_12
    invoke-static {v3}, Lf1/y0;->w(Lu2/k;)Z

    move-result v4

    if-nez v4, :cond_1c

    check-cast v14, Lu0/d1;

    iput-object v9, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput v8, v1, Lbc3/r1;->y:I

    invoke-static {v2, v14, v3, v1}, Lf1/y0;->l(Lu2/b;Lu0/d1;Lu2/k;Ls83/a;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_1c

    :goto_13
    move-object v11, v0

    :cond_1c
    :goto_14
    return-object v11

    :pswitch_3
    const-wide v16, 0xffffffffL

    check-cast v14, Lc1/a;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lbc3/r1;->y:I

    if-eqz v3, :cond_20

    if-eq v3, v15, :cond_1f

    const/4 v6, 0x2

    if-eq v3, v6, :cond_1e

    if-ne v3, v8, :cond_1d

    iget-object v2, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v2, Lu2/r;

    iget-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    move v7, v8

    move-object v5, v9

    goto/16 :goto_2a

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    iget-object v2, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v2, Lu2/l;

    iget-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v3, Lu2/r;

    iget-object v4, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v4, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move-object/from16 v5, p1

    goto/16 :goto_1a

    :cond_1f
    iget-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v4, p1

    goto :goto_15

    :cond_20
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v3, Lu2/b;

    sget-object v4, Lu2/l;->w:Lu2/l;

    iput-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput v15, v1, Lbc3/r1;->y:I

    invoke-static {v3, v15, v4, v1}, Lh0/o3;->b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_21

    goto/16 :goto_29

    :cond_21
    :goto_15
    check-cast v4, Lu2/r;

    iget v6, v4, Lu2/r;->i:I

    iget-wide v12, v4, Lu2/r;->c:J

    if-ne v6, v8, :cond_22

    goto :goto_16

    :cond_22
    if-ne v6, v5, :cond_4a

    :goto_16
    const/16 v5, 0x20

    shr-long v6, v12, v5

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    cmpl-float v7, v7, v2

    if-ltz v7, :cond_23

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    move-object v7, v3

    check-cast v7, Lu2/g0;

    move/from16 v18, v2

    iget-object v2, v7, Lu2/g0;->F:Lu2/h0;

    move/from16 p1, v5

    move/from16 v19, v6

    iget-wide v5, v2, Lu2/h0;->Y:J

    shr-long v5, v5, p1

    long-to-int v2, v5

    int-to-float v2, v2

    cmpg-float v2, v19, v2

    if-gez v2, :cond_23

    and-long v5, v12, v16

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    cmpl-float v5, v5, v18

    if-ltz v5, :cond_23

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    iget-object v5, v7, Lu2/g0;->F:Lu2/h0;

    iget-wide v5, v5, Lu2/h0;->Y:J

    and-long v5, v5, v16

    long-to-int v5, v5

    int-to-float v5, v5

    cmpg-float v2, v2, v5

    if-gez v2, :cond_23

    move v2, v15

    goto :goto_17

    :cond_23
    move v2, v10

    :goto_17
    iget-boolean v5, v14, Lc1/a;->R:Z

    if-nez v5, :cond_25

    if-eqz v2, :cond_24

    goto :goto_18

    :cond_24
    sget-object v2, Lu2/l;->x:Lu2/l;

    goto :goto_19

    :cond_25
    :goto_18
    sget-object v2, Lu2/l;->w:Lu2/l;

    :goto_19
    iput-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput-object v4, v1, Lbc3/r1;->E:Ljava/lang/Object;

    iput-object v2, v1, Lbc3/r1;->F:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v1, Lbc3/r1;->y:I

    check-cast v3, Lu2/g0;

    invoke-virtual {v3, v2, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_26

    goto/16 :goto_29

    :cond_26
    :goto_1a
    check-cast v5, Lu2/k;

    iget-object v6, v5, Lu2/k;->a:Ljava/lang/Object;

    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v12, v10

    :goto_1b
    if-ge v12, v7, :cond_29

    invoke-interface {v6, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    move-object v10, v13

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v17

    if-nez v17, :cond_27

    iget-wide v8, v10, Lu2/r;->a:J

    move-object/from16 p1, v2

    move-object/from16 v19, v3

    iget-wide v2, v4, Lu2/r;->a:J

    invoke-static {v8, v9, v2, v3}, Lu2/q;->a(JJ)Z

    move-result v2

    if-eqz v2, :cond_28

    iget-boolean v2, v10, Lu2/r;->d:Z

    if-eqz v2, :cond_28

    goto :goto_1c

    :cond_27
    move-object/from16 p1, v2

    move-object/from16 v19, v3

    :cond_28
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, v19

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto :goto_1b

    :cond_29
    move-object/from16 p1, v2

    move-object/from16 v19, v3

    const/4 v13, 0x0

    :goto_1c
    check-cast v13, Lu2/r;

    if-nez v13, :cond_2a

    goto :goto_1d

    :cond_2a
    iget-wide v2, v13, Lu2/r;->b:J

    iget-wide v6, v4, Lu2/r;->b:J

    sub-long/2addr v2, v6

    move-object/from16 v6, v19

    check-cast v6, Lu2/g0;

    invoke-virtual {v6}, Lu2/g0;->f()Lb3/j3;

    move-result-object v7

    invoke-interface {v7}, Lb3/j3;->c()J

    move-result-wide v7

    cmp-long v2, v2, v7

    if-ltz v2, :cond_2b

    goto :goto_1d

    :cond_2b
    iget v2, v5, Lu2/k;->c:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2c

    :goto_1d
    const/4 v13, 0x0

    goto :goto_1e

    :cond_2c
    iget-wide v2, v13, Lu2/r;->c:J

    iget-wide v7, v4, Lu2/r;->c:J

    invoke-static {v2, v3, v7, v8}, Lh2/b;->g(JJ)J

    move-result-wide v2

    invoke-static {v2, v3}, Lh2/b;->d(J)F

    move-result v2

    invoke-virtual {v6}, Lu2/g0;->f()Lb3/j3;

    move-result-object v3

    invoke-interface {v3}, Lb3/j3;->d()F

    move-result v3

    cmpl-float v2, v2, v3

    if-lez v2, :cond_49

    :goto_1e
    if-nez v13, :cond_2d

    goto/16 :goto_2d

    :cond_2d
    iget-boolean v2, v14, Lc1/a;->R:Z

    if-nez v2, :cond_44

    sget-object v2, Lg2/n;->z:Lg2/n;

    iget-object v3, v14, Lb2/v;->w:Lb2/v;

    const/4 v5, 0x0

    :goto_1f
    const/4 v6, 0x7

    const/16 v7, 0x10

    if-eqz v3, :cond_36

    instance-of v8, v3, Lg2/x;

    if-eqz v8, :cond_2f

    check-cast v3, Lg2/x;

    invoke-virtual {v3}, Lg2/x;->Y0()Lg2/o;

    move-result-object v5

    iget-boolean v5, v5, Lg2/o;->a:Z

    if-eqz v5, :cond_2e

    invoke-static {v3}, Lg2/x;->c1(Lg2/x;)Z

    goto/16 :goto_27

    :cond_2e
    invoke-static {v3, v6, v2}, Lg2/g;->j(Lg2/x;ILkotlin/jvm/functions/Function1;)Z

    goto/16 :goto_27

    :cond_2f
    iget v6, v3, Lb2/v;->y:I

    and-int/lit16 v6, v6, 0x400

    if-eqz v6, :cond_35

    instance-of v6, v3, La3/o;

    if-eqz v6, :cond_35

    move-object v6, v3

    check-cast v6, La3/o;

    iget-object v6, v6, La3/o;->P:Lb2/v;

    const/4 v8, 0x0

    :goto_20
    if-eqz v6, :cond_34

    iget v9, v6, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_33

    add-int/lit8 v8, v8, 0x1

    if-ne v8, v15, :cond_30

    move-object v3, v6

    goto :goto_21

    :cond_30
    if-nez v5, :cond_31

    new-instance v5, Lr1/c;

    new-array v9, v7, [Lb2/v;

    invoke-direct {v5, v9}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_31
    if-eqz v3, :cond_32

    invoke-virtual {v5, v3}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v3, 0x0

    :cond_32
    invoke-virtual {v5, v6}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_33
    :goto_21
    iget-object v6, v6, Lb2/v;->F:Lb2/v;

    goto :goto_20

    :cond_34
    if-ne v8, v15, :cond_35

    goto :goto_1f

    :cond_35
    invoke-static {v5}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v3

    goto :goto_1f

    :cond_36
    iget-object v3, v14, Lb2/v;->w:Lb2/v;

    iget-boolean v3, v3, Lb2/v;->N:Z

    if-nez v3, :cond_37

    const-string v3, "visitChildren called on an unattached node"

    invoke-static {v3}, Lx2/a;->b(Ljava/lang/String;)V

    :cond_37
    new-instance v3, Lr1/c;

    new-array v5, v7, [Lb2/v;

    invoke-direct {v3, v5}, Lr1/c;-><init>([Ljava/lang/Object;)V

    iget-object v5, v14, Lb2/v;->w:Lb2/v;

    iget-object v8, v5, Lb2/v;->F:Lb2/v;

    if-nez v8, :cond_38

    invoke-static {v3, v5}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_22

    :cond_38
    invoke-virtual {v3, v8}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_39
    :goto_22
    iget v5, v3, Lr1/c;->y:I

    if-eqz v5, :cond_44

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v3, v5}, Lr1/c;->l(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lb2/v;

    iget v8, v5, Lb2/v;->z:I

    and-int/lit16 v8, v8, 0x400

    if-nez v8, :cond_3a

    invoke-static {v3, v5}, La3/g;->a(Lr1/c;Lb2/v;)V

    goto :goto_22

    :cond_3a
    :goto_23
    if-eqz v5, :cond_39

    iget v8, v5, Lb2/v;->y:I

    and-int/lit16 v8, v8, 0x400

    if-eqz v8, :cond_43

    const/4 v8, 0x0

    :goto_24
    if-eqz v5, :cond_39

    instance-of v9, v5, Lg2/x;

    if-eqz v9, :cond_3c

    check-cast v5, Lg2/x;

    invoke-virtual {v5}, Lg2/x;->Y0()Lg2/o;

    move-result-object v3

    iget-boolean v3, v3, Lg2/o;->a:Z

    if-eqz v3, :cond_3b

    invoke-static {v5}, Lg2/x;->c1(Lg2/x;)Z

    goto :goto_27

    :cond_3b
    invoke-static {v5, v6, v2}, Lg2/g;->j(Lg2/x;ILkotlin/jvm/functions/Function1;)Z

    goto :goto_27

    :cond_3c
    iget v9, v5, Lb2/v;->y:I

    and-int/lit16 v9, v9, 0x400

    if-eqz v9, :cond_42

    instance-of v9, v5, La3/o;

    if-eqz v9, :cond_42

    move-object v9, v5

    check-cast v9, La3/o;

    iget-object v9, v9, La3/o;->P:Lb2/v;

    const/4 v10, 0x0

    :goto_25
    if-eqz v9, :cond_41

    iget v12, v9, Lb2/v;->y:I

    and-int/lit16 v12, v12, 0x400

    if-eqz v12, :cond_40

    add-int/lit8 v10, v10, 0x1

    if-ne v10, v15, :cond_3d

    move-object v5, v9

    goto :goto_26

    :cond_3d
    if-nez v8, :cond_3e

    new-instance v8, Lr1/c;

    new-array v12, v7, [Lb2/v;

    invoke-direct {v8, v12}, Lr1/c;-><init>([Ljava/lang/Object;)V

    :cond_3e
    if-eqz v5, :cond_3f

    invoke-virtual {v8, v5}, Lr1/c;->b(Ljava/lang/Object;)V

    const/4 v5, 0x0

    :cond_3f
    invoke-virtual {v8, v9}, Lr1/c;->b(Ljava/lang/Object;)V

    :cond_40
    :goto_26
    iget-object v9, v9, Lb2/v;->F:Lb2/v;

    goto :goto_25

    :cond_41
    if-ne v10, v15, :cond_42

    goto :goto_24

    :cond_42
    invoke-static {v8}, La3/g;->d(Lr1/c;)Lb2/v;

    move-result-object v5

    goto :goto_24

    :cond_43
    iget-object v5, v5, Lb2/v;->F:Lb2/v;

    goto :goto_23

    :cond_44
    :goto_27
    iget-object v2, v14, Lc1/a;->Q:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-virtual {v13}, Lu2/r;->a()V

    move-object v2, v4

    move-object/from16 v3, v19

    :goto_28
    sget-object v4, Lu2/l;->w:Lu2/l;

    iput-object v3, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput-object v2, v1, Lbc3/r1;->E:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Lbc3/r1;->F:Ljava/lang/Object;

    const/4 v7, 0x3

    iput v7, v1, Lbc3/r1;->y:I

    check-cast v3, Lu2/g0;

    invoke-virtual {v3, v4, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_45

    :goto_29
    move-object v11, v0

    goto :goto_2d

    :cond_45
    :goto_2a
    check-cast v4, Lu2/k;

    iget-object v4, v4, Lu2/k;->a:Ljava/lang/Object;

    move-object v6, v4

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->size()I

    move-result v6

    const/4 v8, 0x0

    :goto_2b
    if-ge v8, v6, :cond_47

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v12

    if-nez v12, :cond_46

    iget-wide v12, v10, Lu2/r;->a:J

    iget-wide v14, v2, Lu2/r;->a:J

    invoke-static {v12, v13, v14, v15}, Lu2/q;->a(JJ)Z

    move-result v12

    if-eqz v12, :cond_46

    iget-boolean v10, v10, Lu2/r;->d:Z

    if-eqz v10, :cond_46

    goto :goto_2c

    :cond_46
    add-int/lit8 v8, v8, 0x1

    goto :goto_2b

    :cond_47
    move-object v9, v5

    :goto_2c
    check-cast v9, Lu2/r;

    if-nez v9, :cond_48

    goto :goto_2d

    :cond_48
    invoke-virtual {v9}, Lu2/r;->a()V

    goto :goto_28

    :cond_49
    move-object/from16 v2, p1

    move-object v3, v6

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v10, 0x0

    goto/16 :goto_19

    :cond_4a
    :goto_2d
    return-object v11

    :pswitch_4
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v2, v1, Lbc3/r1;->y:I

    if-eqz v2, :cond_4e

    if-eq v2, v15, :cond_4d

    const/4 v3, 0x2

    if-ne v2, v3, :cond_4c

    iget-object v2, v1, Lbc3/r1;->F:Ljava/lang/Object;

    check-cast v2, Lbc3/q;

    iget-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    check-cast v3, Lbc3/x1;

    iget-object v4, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v4, Lxb3/j;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_4b
    const/4 v6, 0x2

    goto :goto_30

    :cond_4c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_31

    :cond_4e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v1, Lbc3/r1;->z:Ljava/lang/Object;

    check-cast v2, Lxb3/j;

    check-cast v14, Lbc3/t1;

    sget-object v3, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v3, v14}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Lbc3/q;

    if-eqz v4, :cond_4f

    check-cast v3, Lbc3/q;

    iget-object v3, v3, Lbc3/q;->E:Lbc3/r;

    iput v15, v1, Lbc3/r1;->y:I

    invoke-virtual {v2, v3, v1}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    :goto_2e
    move-object v11, v0

    goto :goto_31

    :cond_4f
    instance-of v4, v3, Lbc3/g1;

    if-eqz v4, :cond_50

    check-cast v3, Lbc3/g1;

    invoke-interface {v3}, Lbc3/g1;->b()Lbc3/x1;

    move-result-object v3

    if-eqz v3, :cond_50

    sget-object v4, Lhc3/k;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Lhc3/k;

    move-object/from16 v20, v4

    move-object v4, v2

    move-object/from16 v2, v20

    :goto_2f
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_50

    instance-of v5, v2, Lbc3/q;

    if-eqz v5, :cond_4b

    check-cast v2, Lbc3/q;

    iget-object v5, v2, Lbc3/q;->E:Lbc3/r;

    iput-object v4, v1, Lbc3/r1;->z:Ljava/lang/Object;

    iput-object v3, v1, Lbc3/r1;->E:Ljava/lang/Object;

    iput-object v2, v1, Lbc3/r1;->F:Ljava/lang/Object;

    const/4 v6, 0x2

    iput v6, v1, Lbc3/r1;->y:I

    invoke-virtual {v4, v5, v1}, Lxb3/j;->b(Ljava/lang/Object;Lq83/d;)V

    sget-object v2, Lr83/a;->w:Lr83/a;

    goto :goto_2e

    :goto_30
    invoke-virtual {v2}, Lhc3/k;->f()Lhc3/k;

    move-result-object v2

    goto :goto_2f

    :cond_50
    :goto_31
    return-object v11

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
