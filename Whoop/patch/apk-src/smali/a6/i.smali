.class public final synthetic La6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, La6/i;->w:I

    iput-object p1, p0, La6/i;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lmc3/c;Lmc3/b;)V
    .locals 0

    .line 2
    const/16 p2, 0x17

    iput p2, p0, La6/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/i;->x:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 49

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget v2, v1, La6/i;->w:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lqf2/c;

    check-cast v0, Lqf2/d;

    invoke-static {v2, v0}, Lqf2/c;->e(Lqf2/c;Lqf2/d;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lp3/j;

    check-cast v0, Lp3/a0;

    iget-object v5, v0, Lp3/a0;->b:Lp3/r;

    iget v6, v0, Lp3/a0;->c:I

    iget v7, v0, Lp3/a0;->d:I

    iget-object v8, v0, Lp3/a0;->e:Ljava/lang/Object;

    new-instance v3, Lp3/a0;

    const/4 v4, 0x0

    invoke-direct/range {v3 .. v8}, Lp3/a0;-><init>(Lp3/i;Lp3/r;IILjava/lang/Object;)V

    invoke-virtual {v2, v3}, Lp3/j;->a(Lp3/a0;)Lp3/e0;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, La0/w0;

    instance-of v3, v0, Lz1/a0;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lz1/a0;

    const/4 v4, 0x4

    invoke-virtual {v3, v4}, Lz1/a0;->s(I)V

    :cond_0
    invoke-virtual {v2, v0}, La0/w0;->a(Ljava/lang/Object;)Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_2
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lp1/y1;

    check-cast v0, Ljava/lang/Throwable;

    const-string v3, "Recomposer effect job completed"

    invoke-static {v3, v0}, Ldc/a;->d(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/util/concurrent/CancellationException;

    move-result-object v3

    iget-object v4, v2, Lp1/y1;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_0
    iget-object v5, v2, Lp1/y1;->d:Lbc3/k1;

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    iget-object v7, v2, Lp1/y1;->u:Lec3/h2;

    sget-object v8, Lp1/w1;->x:Lp1/w1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v6, v8}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    invoke-interface {v5, v3}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object v6, v2, Lp1/y1;->r:Lbc3/m;

    new-instance v3, Lnq0/m;

    const/16 v6, 0x11

    invoke-direct {v3, v6, v2, v0}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v5, v3}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_1
    iput-object v3, v2, Lp1/y1;->e:Ljava/lang/Throwable;

    iget-object v0, v2, Lp1/y1;->u:Lec3/h2;

    sget-object v2, Lp1/w1;->w:Lp1/w1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v6, v2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_0
    monitor-exit v4

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :goto_1
    monitor-exit v4

    throw v0

    :pswitch_3
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lp1/w;

    invoke-virtual {v2, v0}, Lp1/w;->y(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_4
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Ln0/u;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    neg-float v0, v0

    const/4 v3, 0x0

    cmpg-float v4, v0, v3

    if-gez v4, :cond_2

    invoke-virtual {v2}, Ln0/u;->d()Z

    move-result v4

    if-eqz v4, :cond_3

    :cond_2
    cmpl-float v4, v0, v3

    if-lez v4, :cond_4

    invoke-virtual {v2}, Ln0/u;->c()Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    move v0, v3

    goto/16 :goto_5

    :cond_4
    iget v4, v2, Ln0/u;->h:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f000000    # 0.5f

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_5

    goto :goto_2

    :cond_5
    const-string v4, "entered drag with non-zero pending scroll"

    invoke-static {v4}, Lk0/a;->c(Ljava/lang/String;)V

    :goto_2
    const/4 v4, 0x1

    iput-boolean v4, v2, Ln0/u;->d:Z

    iget v6, v2, Ln0/u;->h:F

    add-float/2addr v6, v0

    iput v6, v2, Ln0/u;->h:F

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    cmpl-float v6, v6, v5

    if-lez v6, :cond_a

    iget v6, v2, Ln0/u;->h:F

    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    move-result v7

    iget-object v8, v2, Ln0/u;->f:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ln0/n;

    iget-boolean v9, v2, Ln0/u;->b:Z

    xor-int/2addr v9, v4

    invoke-virtual {v8, v7, v9}, Ln0/n;->d(IZ)Ln0/n;

    move-result-object v8

    if-eqz v8, :cond_7

    iget-object v9, v2, Ln0/u;->c:Ln0/n;

    if-eqz v9, :cond_7

    invoke-virtual {v9, v7, v4}, Ln0/n;->d(IZ)Ln0/n;

    move-result-object v7

    if-eqz v7, :cond_6

    iput-object v7, v2, Ln0/u;->c:Ln0/n;

    goto :goto_3

    :cond_6
    const/4 v8, 0x0

    :cond_7
    :goto_3
    if-eqz v8, :cond_8

    iget-boolean v7, v2, Ln0/u;->b:Z

    invoke-virtual {v2, v8, v7, v4}, Ln0/u;->g(Ln0/n;ZZ)V

    iget-object v4, v2, Ln0/u;->v:Lp1/c1;

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v4, v7}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    iget v4, v2, Ln0/u;->h:F

    sub-float/2addr v6, v4

    invoke-virtual {v2, v6, v8}, Ln0/u;->i(FLn0/n;)V

    goto :goto_4

    :cond_8
    iget-object v4, v2, Ln0/u;->k:La3/n0;

    if-eqz v4, :cond_9

    invoke-virtual {v4}, La3/n0;->m()V

    :cond_9
    iget v4, v2, Ln0/u;->h:F

    sub-float/2addr v6, v4

    invoke-virtual {v2}, Ln0/u;->h()Ln0/n;

    move-result-object v4

    invoke-virtual {v2, v6, v4}, Ln0/u;->i(FLn0/n;)V

    :cond_a
    :goto_4
    iget v4, v2, Ln0/u;->h:F

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_b

    goto :goto_5

    :cond_b
    iget v4, v2, Ln0/u;->h:F

    sub-float/2addr v0, v4

    iput v3, v2, Ln0/u;->h:F

    :goto_5
    neg-float v0, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lmc3/c;

    check-cast v0, Ljava/lang/Throwable;

    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lmc3/c;->i(Ljava/lang/Object;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_6
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Ll0/k1;

    check-cast v0, Lb3/l2;

    const-string v3, "padding"

    invoke-virtual {v0, v3}, Lb3/l2;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Lb3/l2;->b()Lb3/d3;

    move-result-object v0

    const-string v3, "paddingValues"

    invoke-virtual {v0, v2, v3}, Lb3/d3;->c(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_7
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v0}, Lk71/j;->a(Ljava/util/List;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_8
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lt0/i;

    check-cast v0, Landroidx/compose/ui/Modifier;

    invoke-static {v2, v0}, Lk71/j;->e(Lt0/i;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    return-object v0

    :pswitch_9
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lfm1/i;

    check-cast v0, Lc0/q;

    invoke-static {v2, v0}, Ljk2/i;->g(Lfm1/i;Lc0/q;)Lc0/l0;

    move-result-object v0

    return-object v0

    :pswitch_a
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lj1/l;

    check-cast v0, Li2/g0;

    iget-object v2, v2, Lj1/l;->e:Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    check-cast v0, Li2/x0;

    iget-wide v3, v0, Li2/x0;->R:J

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    sub-float/2addr v2, v3

    invoke-virtual {v0, v2}, Li2/x0;->E(F)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_b
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lh0/c3;

    check-cast v0, Lh2/b;

    iget-object v3, v2, Lh0/c3;->k:Lh0/k2;

    iget-wide v4, v0, Lh2/b;->a:J

    iget v0, v2, Lh0/c3;->j:I

    invoke-virtual {v2, v3, v4, v5, v0}, Lh0/c3;->c(Lh0/k2;JI)J

    move-result-wide v2

    new-instance v0, Lh2/b;

    invoke-direct {v0, v2, v3}, Lh2/b;-><init>(J)V

    return-object v0

    :pswitch_c
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lh0/w2;

    check-cast v0, Ly2/y;

    iget-object v2, v2, Lh0/w2;->g0:Lh0/w;

    iput-object v0, v2, Lh0/w;->T:Ly2/y;

    iget-boolean v0, v2, Lh0/w;->V:Z

    if-eqz v0, :cond_c

    invoke-virtual {v2}, Lh0/w;->Y0()Lh2/c;

    move-result-object v0

    if-eqz v0, :cond_c

    iget-wide v3, v2, Lh0/w;->W:J

    invoke-virtual {v2, v0, v3, v4}, Lh0/w;->Z0(Lh2/c;J)Z

    move-result v0

    if-nez v0, :cond_c

    const/4 v0, 0x1

    iput-boolean v0, v2, Lh0/w;->U:Z

    invoke-virtual {v2}, Lh0/w;->a1()V

    :cond_c
    const/4 v0, 0x0

    iput-boolean v0, v2, Lh0/w;->V:Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_d
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Ll3/s0;

    check-cast v0, Ll3/e;

    iget-object v3, v0, Ll3/e;->a:Ljava/lang/Object;

    check-cast v3, Ll3/b;

    instance-of v4, v3, Ll3/u;

    const/16 v5, 0xe

    const/4 v6, 0x0

    if-eqz v4, :cond_d

    move-object v4, v3

    check-cast v4, Ll3/u;

    iget-object v7, v4, Ll3/u;->b:Ll3/s0;

    if-nez v7, :cond_d

    iget-object v3, v4, Ll3/u;->a:Ljava/lang/String;

    iget-object v4, v4, Ll3/u;->c:Li20/z0;

    new-instance v7, Ll3/u;

    invoke-direct {v7, v3, v2, v4}, Ll3/u;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    invoke-static {v0, v7, v6, v5}, Ll3/e;->a(Ll3/e;Ll3/b;II)Ll3/e;

    move-result-object v0

    goto :goto_6

    :cond_d
    instance-of v4, v3, Ll3/t;

    if-eqz v4, :cond_e

    check-cast v3, Ll3/t;

    iget-object v4, v3, Ll3/t;->b:Ll3/s0;

    if-nez v4, :cond_e

    iget-object v4, v3, Ll3/t;->a:Ljava/lang/String;

    iget-object v3, v3, Ll3/t;->c:Li20/z0;

    new-instance v7, Ll3/t;

    invoke-direct {v7, v4, v2, v3}, Ll3/t;-><init>(Ljava/lang/String;Ll3/s0;Li20/z0;)V

    invoke-static {v0, v7, v6, v5}, Ll3/e;->a(Ll3/e;Ll3/b;II)Ll3/e;

    move-result-object v0

    :cond_e
    :goto_6
    return-object v0

    :pswitch_e
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lg1/n7;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v3, v2, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {v3}, Lp1/g1;->x()F

    move-result v4

    add-float/2addr v4, v0

    iget v0, v2, Lg1/n7;->k:F

    iget v5, v2, Lg1/n7;->l:F

    invoke-static {v4, v0, v5}, Le93/b;->m(FFF)F

    move-result v0

    sub-float v5, v4, v0

    iget-object v6, v2, Lg1/n7;->o:Lp1/k1;

    invoke-virtual {v6}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg1/x4;

    const/4 v7, 0x0

    if-eqz v6, :cond_13

    cmpg-float v8, v5, v7

    if-gez v8, :cond_f

    iget v8, v6, Lg1/x4;->b:F

    goto :goto_7

    :cond_f
    iget v8, v6, Lg1/x4;->c:F

    :goto_7
    cmpg-float v9, v8, v7

    if-nez v9, :cond_10

    goto :goto_8

    :cond_10
    iget v6, v6, Lg1/x4;->a:F

    div-float v7, v5, v6

    const/high16 v9, -0x40800000    # -1.0f

    cmpg-float v10, v7, v9

    if-gez v10, :cond_11

    move v7, v9

    :cond_11
    const/high16 v9, 0x3f800000    # 1.0f

    cmpl-float v10, v7, v9

    if-lez v10, :cond_12

    move v7, v9

    :cond_12
    div-float/2addr v6, v8

    const v8, 0x40490fdb    # (float)Math.PI

    mul-float/2addr v7, v8

    const/4 v8, 0x2

    int-to-float v8, v8

    div-float/2addr v7, v8

    float-to-double v7, v7

    invoke-static {v7, v8}, Ljava/lang/Math;->sin(D)D

    move-result-wide v7

    double-to-float v7, v7

    mul-float/2addr v7, v6

    :cond_13
    :goto_8
    iget-object v6, v2, Lg1/n7;->e:Lp1/g1;

    add-float/2addr v0, v7

    invoke-virtual {v6, v0}, Lp1/g1;->y(F)V

    iget-object v0, v2, Lg1/n7;->f:Lp1/g1;

    invoke-virtual {v0, v5}, Lp1/g1;->y(F)V

    invoke-virtual {v3, v4}, Lp1/g1;->y(F)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_f
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lg1/a2;

    check-cast v0, Ly3/c;

    iget-object v0, v2, Lg1/n7;->e:Lp1/g1;

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    invoke-static {v0}, Le93/b;->X(F)I

    move-result v0

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const/4 v0, 0x0

    int-to-long v4, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    new-instance v0, Ly3/j;

    invoke-direct {v0, v2, v3}, Ly3/j;-><init>(J)V

    return-object v0

    :pswitch_10
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lf0/r1;

    check-cast v0, Ljava/lang/Float;

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    iget-object v3, v2, Lf0/r1;->a:Lp1/h1;

    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v4

    int-to-float v4, v4

    add-float/2addr v4, v0

    iget v5, v2, Lf0/r1;->e:F

    add-float/2addr v4, v5

    iget-object v5, v2, Lf0/r1;->d:Lp1/h1;

    invoke-virtual {v5}, Lp1/h1;->x()I

    move-result v5

    int-to-float v5, v5

    const/4 v6, 0x0

    invoke-static {v4, v6, v5}, Le93/b;->m(FFF)F

    move-result v5

    cmpg-float v4, v4, v5

    if-nez v4, :cond_14

    const/4 v4, 0x1

    goto :goto_9

    :cond_14
    const/4 v4, 0x0

    :goto_9
    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v6

    int-to-float v6, v6

    sub-float/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    move-result v6

    invoke-virtual {v3}, Lp1/h1;->x()I

    move-result v7

    add-int/2addr v7, v6

    invoke-virtual {v3, v7}, Lp1/h1;->y(I)V

    int-to-float v3, v6

    sub-float v3, v5, v3

    iput v3, v2, Lf0/r1;->e:F

    if-nez v4, :cond_15

    move v0, v5

    :cond_15
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_11
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lf0/s;

    check-cast v0, Lf2/d;

    iget v3, v2, Lf0/s;->R:F

    invoke-virtual {v0}, Lf2/d;->getDensity()F

    move-result v4

    mul-float/2addr v4, v3

    const/4 v3, 0x0

    cmpl-float v4, v4, v3

    if-ltz v4, :cond_2e

    iget-object v4, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v4}, Lf2/b;->d()J

    move-result-wide v4

    invoke-static {v4, v5}, Lh2/e;->d(J)F

    move-result v4

    cmpl-float v4, v4, v3

    if-lez v4, :cond_2e

    iget v4, v2, Lf0/s;->R:F

    invoke-static {v4, v3}, Ly3/f;->b(FF)Z

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_16

    move v3, v4

    goto :goto_a

    :cond_16
    iget v3, v2, Lf0/s;->R:F

    invoke-virtual {v0}, Lf2/d;->getDensity()F

    move-result v5

    mul-float/2addr v5, v3

    float-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v5

    double-to-float v3, v5

    :goto_a
    iget-object v5, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v5}, Lf2/b;->d()J

    move-result-wide v5

    invoke-static {v5, v6}, Lh2/e;->d(J)F

    move-result v5

    const/4 v6, 0x2

    int-to-float v6, v6

    div-float/2addr v5, v6

    float-to-double v7, v5

    invoke-static {v7, v8}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v7

    double-to-float v5, v7

    invoke-static {v3, v5}, Ljava/lang/Math;->min(FF)F

    move-result v8

    div-float v3, v8, v6

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v9, v5

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v11, v5

    const/16 v5, 0x20

    shl-long/2addr v9, v5

    const-wide v13, 0xffffffffL

    and-long/2addr v11, v13

    or-long v15, v9, v11

    iget-object v7, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v7}, Lf2/b;->d()J

    move-result-wide v9

    shr-long/2addr v9, v5

    long-to-int v7, v9

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float/2addr v7, v8

    iget-object v9, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v9}, Lf2/b;->d()J

    move-result-wide v9

    and-long/2addr v9, v13

    long-to-int v9, v9

    invoke-static {v9}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v9

    sub-float/2addr v9, v8

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v10, v7

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    move/from16 p1, v5

    move v9, v6

    int-to-long v5, v7

    shl-long v10, v10, p1

    and-long/2addr v5, v13

    or-long/2addr v5, v10

    mul-float v18, v8, v9

    iget-object v7, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v7}, Lf2/b;->d()J

    move-result-wide v9

    invoke-static {v9, v10}, Lh2/e;->d(J)F

    move-result v7

    cmpl-float v7, v18, v7

    const/4 v10, 0x0

    if-lez v7, :cond_17

    const/16 v17, 0x1

    goto :goto_b

    :cond_17
    move/from16 v17, v10

    :goto_b
    iget-object v7, v2, Lf0/s;->T:Li2/a1;

    iget-object v11, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v11}, Lf2/b;->d()J

    move-result-wide v11

    move-wide/from16 v24, v13

    iget-object v13, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v13}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v13

    invoke-interface {v7, v11, v12, v13, v0}, Li2/a1;->a(JLy3/m;Ly3/c;)Li2/p0;

    move-result-object v7

    instance-of v11, v7, Li2/m0;

    if-eqz v11, :cond_25

    iget-object v3, v2, Lf0/s;->S:Li2/t;

    check-cast v7, Li2/m0;

    iget-object v5, v7, Li2/m0;->a:Li2/s0;

    if-eqz v17, :cond_18

    new-instance v2, Lcom/whoop/profile/view/edit/n;

    const/16 v4, 0x16

    invoke-direct {v2, v4, v7, v3}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v2}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    goto/16 :goto_18

    :cond_18
    instance-of v6, v3, Li2/c1;

    if-eqz v6, :cond_19

    move-object v6, v3

    check-cast v6, Li2/c1;

    iget-wide v11, v6, Li2/c1;->c:J

    invoke-static {v4, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    new-instance v4, Li2/p;

    const/4 v6, 0x5

    invoke-direct {v4, v11, v12, v6}, Li2/p;-><init>(JI)V

    move-object/from16 v32, v4

    const/4 v4, 0x1

    goto :goto_c

    :cond_19
    move v4, v10

    const/16 v32, 0x0

    :goto_c
    move-object v6, v5

    check-cast v6, Li2/j;

    invoke-virtual {v6}, Li2/j;->g()Lh2/c;

    move-result-object v6

    iget v11, v6, Lh2/c;->b:F

    iget v12, v6, Lh2/c;->a:F

    iget-object v13, v2, Lf0/s;->Q:Lf0/o;

    if-nez v13, :cond_1a

    new-instance v13, Lf0/o;

    invoke-direct {v13}, Lf0/o;-><init>()V

    iput-object v13, v2, Lf0/s;->Q:Lf0/o;

    :cond_1a
    iget-object v13, v2, Lf0/s;->Q:Lf0/o;

    invoke-static {v13}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v13}, Lf0/o;->g()Li2/s0;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Li2/j;

    invoke-virtual {v14}, Li2/j;->k()V

    invoke-static {v13, v6}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    invoke-virtual {v14, v14, v5, v10}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    new-instance v5, Lkotlin/jvm/internal/g0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget v14, v6, Lh2/c;->c:F

    sub-float/2addr v14, v12

    float-to-double v14, v14

    invoke-static {v14, v15}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v14

    double-to-float v14, v14

    float-to-int v14, v14

    iget v15, v6, Lh2/c;->d:F

    sub-float/2addr v15, v11

    float-to-double v8, v15

    invoke-static {v8, v9}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v8

    double-to-float v8, v8

    float-to-int v8, v8

    int-to-long v14, v14

    shl-long v14, v14, p1

    int-to-long v8, v8

    and-long v8, v8, v24

    or-long/2addr v8, v14

    iget-object v2, v2, Lf0/s;->Q:Lf0/o;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2}, Lf0/o;->c(Lf0/o;)Li2/g;

    move-result-object v14

    invoke-static {v2}, Lf0/o;->a(Lf0/o;)Li2/v;

    move-result-object v15

    if-eqz v14, :cond_1b

    invoke-virtual {v14}, Li2/g;->a()I

    move-result v10

    move-object/from16 v28, v3

    new-instance v3, Li2/i0;

    invoke-direct {v3, v10}, Li2/i0;-><init>(I)V

    goto :goto_d

    :cond_1b
    move-object/from16 v28, v3

    const/4 v3, 0x0

    :goto_d
    if-nez v3, :cond_1c

    goto :goto_e

    :cond_1c
    iget v3, v3, Li2/i0;->a:I

    if-nez v3, :cond_1d

    goto :goto_11

    :cond_1d
    :goto_e
    if-eqz v14, :cond_1e

    invoke-virtual {v14}, Li2/g;->a()I

    move-result v3

    new-instance v10, Li2/i0;

    invoke-direct {v10, v3}, Li2/i0;-><init>(I)V

    goto :goto_f

    :cond_1e
    const/4 v10, 0x0

    :goto_f
    if-nez v10, :cond_1f

    goto :goto_10

    :cond_1f
    iget v3, v10, Li2/i0;->a:I

    if-eq v4, v3, :cond_20

    :goto_10
    const/4 v10, 0x0

    goto :goto_12

    :cond_20
    :goto_11
    const/4 v10, 0x1

    :goto_12
    if-eqz v14, :cond_21

    if-eqz v15, :cond_21

    iget-object v3, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v3}, Lf2/b;->d()J

    move-result-wide v16

    move-wide/from16 v33, v8

    shr-long v8, v16, p1

    long-to-int v3, v8

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    iget-object v8, v14, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v8}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v9

    int-to-float v9, v9

    cmpl-float v3, v3, v9

    if-gtz v3, :cond_22

    iget-object v3, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v3}, Lf2/b;->d()J

    move-result-wide v16

    move-object v3, v8

    and-long v8, v16, v24

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    cmpl-float v3, v8, v3

    if-gtz v3, :cond_22

    if-nez v10, :cond_23

    goto :goto_13

    :cond_21
    move-wide/from16 v33, v8

    :cond_22
    :goto_13
    shr-long v8, v33, p1

    long-to-int v3, v8

    and-long v8, v33, v24

    long-to-int v8, v8

    invoke-static {v3, v8, v4}, Li2/w0;->h(III)Li2/g;

    move-result-object v14

    invoke-static {v2, v14}, Lf0/o;->f(Lf0/o;Li2/g;)V

    invoke-static {v14}, Li2/w0;->a(Li2/g;)Li2/c;

    move-result-object v15

    invoke-static {v2, v15}, Lf0/o;->d(Lf0/o;Li2/c;)V

    :cond_23
    invoke-static {v2}, Lf0/o;->b(Lf0/o;)Lk2/b;

    move-result-object v3

    if-nez v3, :cond_24

    new-instance v3, Lk2/b;

    invoke-direct {v3}, Lk2/b;-><init>()V

    invoke-static {v2, v3}, Lf0/o;->e(Lf0/o;Lk2/b;)V

    :cond_24
    iget-object v2, v3, Lk2/b;->x:La3/p;

    iget-object v4, v3, Lk2/b;->w:Lk2/a;

    invoke-static/range {v33 .. v34}, Lv63/b;->l(J)J

    move-result-wide v8

    iget-object v10, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v10}, Lf2/b;->getLayoutDirection()Ly3/m;

    move-result-object v10

    move-object/from16 v35, v3

    iget-object v3, v4, Lk2/a;->a:Ly3/c;

    move-object/from16 v16, v6

    iget-object v6, v4, Lk2/a;->b:Ly3/m;

    move-object/from16 v46, v13

    iget-object v13, v4, Lk2/a;->c:Li2/v;

    move-object/from16 v48, v13

    move-object/from16 v47, v14

    iget-wide v13, v4, Lk2/a;->d:J

    iput-object v0, v4, Lk2/a;->a:Ly3/c;

    iput-object v10, v4, Lk2/a;->b:Ly3/m;

    iput-object v15, v4, Lk2/a;->c:Li2/v;

    iput-wide v8, v4, Lk2/a;->d:J

    check-cast v15, Li2/c;

    invoke-virtual {v15}, Li2/c;->q()V

    sget-wide v36, Li2/x;->b:J

    const/16 v44, 0x0

    const/16 v45, 0x3a

    const-wide/16 v38, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-wide/from16 v40, v8

    invoke-static/range {v35 .. v45}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    neg-float v8, v12

    neg-float v9, v11

    iget-object v10, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v10, Laj/d;

    invoke-virtual {v10, v8, v9}, Laj/d;->B(FF)V

    :try_start_1
    iget-object v7, v7, Li2/m0;->a:Li2/s0;

    new-instance v30, Lk2/i;

    const/16 v22, 0x0

    const/16 v23, 0x1e

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v17, v30

    invoke-direct/range {v17 .. v23}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v31, 0x34

    const/16 v29, 0x0

    move-object/from16 v27, v7

    move-object/from16 v26, v35

    invoke-static/range {v26 .. v31}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    invoke-interface/range {v35 .. v35}, Lk2/e;->d()J

    move-result-wide v10

    shr-long v10, v10, p1

    long-to-int v7, v10

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    const/4 v10, 0x1

    int-to-float v10, v10

    add-float/2addr v7, v10

    invoke-interface/range {v35 .. v35}, Lk2/e;->d()J

    move-result-wide v11

    shr-long v11, v11, p1

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    div-float/2addr v7, v11

    invoke-interface/range {v35 .. v35}, Lk2/e;->d()J

    move-result-wide v11

    and-long v11, v11, v24

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v11

    add-float/2addr v11, v10

    invoke-interface/range {v35 .. v35}, Lk2/e;->d()J

    move-result-wide v17

    move/from16 p1, v11

    and-long v10, v17, v24

    long-to-int v10, v10

    invoke-static {v10}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v10

    div-float v11, p1, v10

    move-object/from16 p1, v0

    invoke-interface/range {v35 .. v35}, Lk2/e;->B0()J

    move-result-wide v0

    move-wide/from16 v17, v13

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v12

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v10

    invoke-interface {v10}, Li2/v;->q()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    iget-object v10, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v10, Laj/d;

    invoke-virtual {v10, v7, v0, v1, v11}, Laj/d;->w(FJF)V

    const/16 v30, 0x0

    const/16 v31, 0x1c

    const/16 v29, 0x0

    move-object/from16 v26, v35

    move-object/from16 v27, v46

    invoke-static/range {v26 .. v31}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :try_start_3
    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0}, Li2/v;->g()V

    invoke-virtual {v2, v12, v13}, La3/p;->U(J)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    iget-object v0, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v0, Laj/d;

    neg-float v1, v8

    neg-float v2, v9

    invoke-virtual {v0, v1, v2}, Laj/d;->B(FF)V

    invoke-virtual {v15}, Li2/c;->g()V

    iput-object v3, v4, Lk2/a;->a:Ly3/c;

    iput-object v6, v4, Lk2/a;->b:Ly3/m;

    move-object/from16 v0, v48

    iput-object v0, v4, Lk2/a;->c:Li2/v;

    move-wide/from16 v0, v17

    iput-wide v0, v4, Lk2/a;->d:J

    move-object/from16 v14, v47

    iget-object v0, v14, Li2/g;->a:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    iput-object v14, v5, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v26, Lf0/r;

    const/16 v27, 0x0

    move-object/from16 v31, v5

    move-object/from16 v30, v16

    move-wide/from16 v28, v33

    invoke-direct/range {v26 .. v32}, Lf0/r;-><init>(IJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    move-object/from16 v0, p1

    move-object/from16 v1, v26

    invoke-virtual {v0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    goto/16 :goto_18

    :catchall_1
    move-exception v0

    goto :goto_14

    :catchall_2
    move-exception v0

    :try_start_4
    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-interface {v1}, Li2/v;->g()V

    invoke-virtual {v2, v12, v13}, La3/p;->U(J)V

    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :goto_14
    iget-object v1, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Laj/d;

    neg-float v2, v8

    neg-float v3, v9

    invoke-virtual {v1, v2, v3}, Laj/d;->B(FF)V

    throw v0

    :cond_25
    instance-of v1, v7, Li2/o0;

    if-eqz v1, :cond_29

    iget-object v1, v2, Lf0/s;->S:Li2/t;

    check-cast v7, Li2/o0;

    iget-object v4, v7, Li2/o0;->a:Lh2/d;

    invoke-static {v4}, Lj93/l0;->O(Lh2/d;)Z

    move-result v7

    if-eqz v7, :cond_26

    iget-wide v9, v4, Lh2/d;->e:J

    new-instance v18, Lk2/i;

    const/4 v12, 0x0

    const/16 v13, 0x1e

    move-wide v10, v9

    const/4 v9, 0x0

    move-wide/from16 v19, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v7, v18

    invoke-direct/range {v7 .. v13}, Lk2/i;-><init>(FFIILi2/t0;I)V

    new-instance v7, Lf0/q;

    move-object v9, v1

    move v12, v3

    move v13, v8

    move-wide v14, v15

    move/from16 v8, v17

    move-wide/from16 v10, v19

    move-wide/from16 v16, v5

    invoke-direct/range {v7 .. v18}, Lf0/q;-><init>(ZLi2/t;JFFJJLk2/i;)V

    invoke-virtual {v0, v7}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    goto/16 :goto_18

    :cond_26
    move/from16 v9, v17

    iget-object v3, v2, Lf0/s;->Q:Lf0/o;

    if-nez v3, :cond_27

    new-instance v3, Lf0/o;

    invoke-direct {v3}, Lf0/o;-><init>()V

    iput-object v3, v2, Lf0/s;->Q:Lf0/o;

    :cond_27
    iget-object v2, v2, Lf0/s;->Q:Lf0/o;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lf0/o;->g()Li2/s0;

    move-result-object v2

    check-cast v2, Li2/j;

    invoke-virtual {v2}, Li2/j;->k()V

    invoke-static {v2, v4}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    if-nez v9, :cond_28

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v3

    invoke-virtual {v4}, Lh2/d;->b()F

    move-result v5

    sub-float v10, v5, v8

    invoke-virtual {v4}, Lh2/d;->a()F

    move-result v5

    sub-float v11, v5, v8

    iget-wide v5, v4, Lh2/d;->e:J

    invoke-static {v8, v5, v6}, Lge3/g;->T(FJ)J

    move-result-wide v12

    iget-wide v5, v4, Lh2/d;->f:J

    invoke-static {v8, v5, v6}, Lge3/g;->T(FJ)J

    move-result-wide v14

    iget-wide v5, v4, Lh2/d;->h:J

    invoke-static {v8, v5, v6}, Lge3/g;->T(FJ)J

    move-result-wide v5

    move-wide/from16 v16, v5

    iget-wide v4, v4, Lh2/d;->g:J

    invoke-static {v8, v4, v5}, Lge3/g;->T(FJ)J

    move-result-wide v4

    new-instance v7, Lh2/d;

    move v9, v8

    move-wide/from16 v18, v16

    move-wide/from16 v16, v4

    const/4 v4, 0x0

    invoke-direct/range {v7 .. v19}, Lh2/d;-><init>(FFFFJJJJ)V

    invoke-static {v3, v7}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-virtual {v2, v2, v3, v4}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    :cond_28
    new-instance v3, Lbp0/n;

    const/16 v4, 0xd

    invoke-direct {v3, v4, v2, v1}, Lbp0/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    goto :goto_18

    :cond_29
    move-wide v14, v15

    move/from16 v9, v17

    move-wide/from16 v16, v5

    instance-of v1, v7, Li2/n0;

    if-eqz v1, :cond_2d

    iget-object v1, v2, Lf0/s;->S:Li2/t;

    if-eqz v9, :cond_2a

    const-wide/16 v2, 0x0

    move-wide/from16 v20, v2

    goto :goto_15

    :cond_2a
    move-wide/from16 v20, v14

    :goto_15
    if-eqz v9, :cond_2b

    iget-object v2, v0, Lf2/d;->w:Lf2/b;

    invoke-interface {v2}, Lf2/b;->d()J

    move-result-wide v5

    move-wide/from16 v22, v5

    goto :goto_16

    :cond_2b
    move-wide/from16 v22, v16

    :goto_16
    if-eqz v9, :cond_2c

    sget-object v2, Lk2/h;->a:Lk2/h;

    move-object/from16 v24, v2

    goto :goto_17

    :cond_2c
    new-instance v7, Lk2/i;

    const/4 v12, 0x0

    const/16 v13, 0x1e

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v24, v7

    :goto_17
    new-instance v18, Lf0/p;

    move-object/from16 v19, v1

    invoke-direct/range {v18 .. v24}, Lf0/p;-><init>(Li2/t;JJLk2/f;)V

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    goto :goto_18

    :cond_2d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_2e
    new-instance v1, Lev2/b;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lev2/b;-><init>(I)V

    invoke-virtual {v0, v1}, Lf2/d;->a(Lkotlin/jvm/functions/Function1;)Lf2/g;

    move-result-object v0

    :goto_18
    return-object v0

    :pswitch_12
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Leh/e;

    check-cast v0, Ljava/io/IOException;

    const/4 v0, 0x1

    iput-boolean v0, v2, Leh/e;->K:Z

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_13
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/WhoopApplication;

    check-cast v0, Lcom/whoop/domain/model/Logout;

    invoke-static {v2, v0}, Lcom/whoop/WhoopApplication;->b(Lcom/whoop/WhoopApplication;Lcom/whoop/domain/model/Logout;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_14
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lc93/m;

    sget-object v3, Ld0/f;->i:Ld0/f2;

    check-cast v0, Ld0/k;

    iget-object v4, v0, Ld0/k;->e:Lp1/k1;

    invoke-virtual {v4}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v4

    iget-object v3, v3, Ld0/f2;->b:Lkotlin/jvm/functions/Function1;

    iget-object v0, v0, Ld0/k;->f:Ld0/r;

    invoke-interface {v3, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v4, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_15
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/repositories/UserRepository;

    check-cast v0, Lod1/u$a;

    invoke-static {v2, v0}, Lcom/whoop/data/repositories/UserRepository;->b(Lcom/whoop/data/repositories/UserRepository;Lod1/u$a;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_16
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;

    check-cast v0, Ltb/a;

    invoke-static {v2, v0}, Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;->a(Lcom/whoop/data/onboarding/OnboardingStatusDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_17
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;

    check-cast v0, Ltb/a;

    invoke-static {v2, v0}, Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;->b(Lcom/whoop/data/local/room/dao/wipeable/SmartAlarmDiagnosticDao_Impl;Ltb/a;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_18
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/room/n1;

    check-cast v0, Ltb/c;

    const-string v3, "it"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "Required value was null."

    iget v4, v2, Landroidx/room/n1;->H:I

    const/4 v5, 0x1

    if-gt v5, v4, :cond_36

    move v6, v5

    :goto_19
    iget-object v7, v2, Landroidx/room/n1;->G:[I

    aget v7, v7, v6

    if-eq v7, v5, :cond_35

    const/4 v8, 0x2

    if-eq v7, v8, :cond_34

    const/4 v8, 0x3

    if-eq v7, v8, :cond_33

    const/4 v8, 0x4

    if-eq v7, v8, :cond_31

    const/4 v8, 0x5

    if-eq v7, v8, :cond_2f

    goto :goto_1a

    :cond_2f
    iget-object v7, v2, Landroidx/room/n1;->F:[[B

    aget-object v7, v7, v6

    if-eqz v7, :cond_30

    invoke-interface {v0, v6, v7}, Ltb/c;->q(I[B)V

    goto :goto_1a

    :cond_30
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_31
    iget-object v7, v2, Landroidx/room/n1;->E:[Ljava/lang/String;

    aget-object v7, v7, v6

    if-eqz v7, :cond_32

    invoke-interface {v0, v6, v7}, Ltb/c;->L(ILjava/lang/String;)V

    goto :goto_1a

    :cond_32
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v3}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_33
    iget-object v7, v2, Landroidx/room/n1;->z:[D

    aget-wide v7, v7, v6

    invoke-interface {v0, v7, v8, v6}, Ltb/c;->t(DI)V

    goto :goto_1a

    :cond_34
    iget-object v7, v2, Landroidx/room/n1;->y:[J

    aget-wide v7, v7, v6

    invoke-interface {v0, v6, v7, v8}, Ltb/c;->p(IJ)V

    goto :goto_1a

    :cond_35
    invoke-interface {v0, v6}, Ltb/c;->u(I)V

    :goto_1a
    if-eq v6, v4, :cond_36

    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    :cond_36
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, La6/i;

    check-cast v0, Ltb/c;

    const-string v3, "it"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Landroidx/room/a;

    invoke-direct {v3, v0}, Landroidx/room/a;-><init>(Ltb/c;)V

    invoke-virtual {v2, v3}, La6/i;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_1a
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Landroidx/room/z0;

    check-cast v0, Landroidx/room/g;

    const-string v3, "config"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Landroidx/room/z0;->createOpenHelper(Landroidx/room/g;)Lub/e;

    move-result-object v0

    return-object v0

    :pswitch_1b
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, Laa2/f;

    check-cast v0, Ltb/a;

    invoke-static {v2, v0}, Laa2/f;->k(Laa2/f;Ltb/a;)Laa2/i;

    move-result-object v0

    return-object v0

    :pswitch_1c
    iget-object v2, v1, La6/i;->x:Ljava/lang/Object;

    check-cast v2, La6/i0;

    iget-object v3, v2, La6/i0;->i:Ll83/p;

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_37

    iget-object v2, v2, La6/i0;->g:Lbu/c;

    new-instance v4, La6/s0;

    invoke-direct {v4, v0}, La6/s0;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {v2, v4}, Lbu/c;->J(La6/e1;)V

    :cond_37
    invoke-virtual {v3}, Ll83/p;->b()Z

    move-result v0

    if-eqz v0, :cond_38

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g1;

    invoke-interface {v0}, La6/a;->close()V

    :cond_38
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
