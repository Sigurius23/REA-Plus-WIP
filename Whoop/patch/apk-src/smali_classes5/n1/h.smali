.class public abstract Ln1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-wide/high16 v0, 0x4004000000000000L    # 2.5

    double-to-float v0, v0

    sput v0, Ln1/h;->a:F

    const-wide/high16 v0, 0x4016000000000000L    # 5.5

    double-to-float v0, v0

    sput v0, Ln1/h;->b:F

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Ln1/h;->c:F

    const/16 v0, 0x28

    int-to-float v0, v0

    sput v0, Ln1/h;->d:F

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Ln1/h;->e:F

    const/4 v0, 0x5

    int-to-float v0, v0

    sput v0, Ln1/h;->f:F

    return-void
.end method

.method public static final a(Lm1/x;JLandroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v0, -0x50adbae4

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v9, 0x4

    if-eqz v0, :cond_0

    move v0, v9

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    move-wide/from16 v10, p1

    invoke-virtual {v6, v10, v11}, Lp1/q;->f(J)Z

    move-result v2

    const/16 v12, 0x20

    if-eqz v2, :cond_1

    move v2, v12

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v2, v3, :cond_2

    move v2, v14

    goto :goto_2

    :cond_2
    move v2, v13

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v2, v15, :cond_3

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v2

    invoke-virtual {v2, v14}, Li2/j;->l(I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Li2/s0;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_4

    new-instance v3, Llive/hms/video/connection/degredation/a;

    const/16 v4, 0x12

    invoke-direct {v3, v1, v4}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {v3}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v3

    invoke-virtual {v6, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lp1/t2;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    sget-object v4, Lo1/n;->y:Lo1/n;

    invoke-static {v4, v6}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v4

    const/4 v7, 0x0

    const/16 v8, 0x1c

    move-object v5, v2

    move v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v14, v16

    invoke-static/range {v2 .. v8}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v5

    move-object v7, v6

    and-int/lit8 v2, v0, 0xe

    if-eq v2, v9, :cond_5

    move v3, v13

    goto :goto_3

    :cond_5
    const/4 v3, 0x1

    :goto_3
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_6

    if-ne v4, v15, :cond_7

    :cond_6
    new-instance v4, Llc0/c;

    const/16 v3, 0x15

    invoke-direct {v4, v1, v3}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Li3/n;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v4, Ln1/h;->c:F

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    if-eq v2, v9, :cond_8

    move v2, v13

    goto :goto_4

    :cond_8
    const/4 v2, 0x1

    :goto_4
    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v12, :cond_9

    const/4 v0, 0x1

    goto :goto_5

    :cond_9
    move v0, v13

    :goto_5
    or-int/2addr v0, v2

    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_a

    if-ne v2, v15, :cond_b

    :cond_a
    new-instance v0, Lf0/r;

    const/4 v1, 0x2

    move-object/from16 v4, p0

    move-wide v2, v10

    move-object v6, v14

    invoke-direct/range {v0 .. v6}, Lf0/r;-><init>(IJLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_b
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v2, v7, v13}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_c
    move-object v7, v6

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_d

    new-instance v0, Lg40/f0;

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lg40/f0;-><init>(Ljava/lang/Object;JII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method public static final b(Lk2/e;Li2/s0;Lh2/c;JFLd0/f0;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p6

    move-object/from16 v3, p1

    check-cast v3, Li2/j;

    invoke-virtual {v3}, Li2/j;->k()V

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v4}, Li2/j;->i(FF)V

    sget v5, Ln1/h;->e:F

    invoke-interface {v0, v5}, Ly3/c;->q0(F)F

    move-result v6

    iget v7, v2, Ld0/f0;->x:F

    mul-float/2addr v6, v7

    const/4 v8, 0x2

    int-to-float v8, v8

    div-float/2addr v6, v8

    sget v8, Ln1/h;->f:F

    invoke-interface {v0, v8}, Ly3/c;->q0(F)F

    move-result v8

    mul-float/2addr v8, v7

    invoke-virtual {v3, v6, v8}, Li2/j;->h(FF)V

    invoke-interface {v0, v5}, Ly3/c;->q0(F)F

    move-result v6

    mul-float/2addr v6, v7

    invoke-virtual {v3, v6, v4}, Li2/j;->h(FF)V

    iget v4, v1, Lh2/c;->c:F

    iget v6, v1, Lh2/c;->a:F

    sub-float/2addr v4, v6

    iget v6, v1, Lh2/c;->d:F

    iget v8, v1, Lh2/c;->b:F

    sub-float/2addr v6, v8

    invoke-static {v4, v6}, Ljava/lang/Math;->min(FF)F

    move-result v4

    const/high16 v6, 0x40000000    # 2.0f

    div-float/2addr v4, v6

    invoke-interface {v0, v5}, Ly3/c;->q0(F)F

    move-result v5

    mul-float/2addr v5, v7

    div-float/2addr v5, v6

    invoke-virtual {v1}, Lh2/c;->d()J

    move-result-wide v6

    const/16 v8, 0x20

    shr-long/2addr v6, v8

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    add-float/2addr v6, v4

    sub-float/2addr v6, v5

    invoke-virtual {v1}, Lh2/c;->d()J

    move-result-wide v4

    const-wide v9, 0xffffffffL

    and-long/2addr v4, v9

    long-to-int v1, v4

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sget v4, Ln1/h;->a:F

    invoke-interface {v0, v4}, Ly3/c;->q0(F)F

    move-result v5

    sub-float/2addr v1, v5

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v11, v1

    shl-long/2addr v5, v8

    and-long v7, v11, v9

    or-long/2addr v5, v7

    invoke-virtual {v3, v5, v6}, Li2/j;->m(J)V

    iget v1, v2, Ld0/f0;->w:F

    invoke-interface {v0, v4}, Ly3/c;->q0(F)F

    move-result v2

    sub-float/2addr v1, v2

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v5

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v7

    invoke-virtual {v7}, La3/p;->A()J

    move-result-wide v8

    invoke-virtual {v7}, La3/p;->w()Li2/v;

    move-result-object v2

    invoke-interface {v2}, Li2/v;->q()V

    :try_start_0
    iget-object v2, v7, La3/p;->x:Ljava/lang/Object;

    check-cast v2, Laj/d;

    invoke-virtual {v2, v1, v5, v6}, Laj/d;->v(FJ)V

    new-instance v10, Lk2/i;

    invoke-interface {v0, v4}, Ly3/c;->q0(F)F

    move-result v11

    const/4 v15, 0x0

    const/16 v16, 0x1e

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v10 .. v16}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v6, 0x30

    move/from16 v4, p5

    move-object v1, v3

    move-object v5, v10

    move-wide/from16 v2, p3

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v7, v8, v9}, Ld;->z(La3/p;J)V

    return-void

    :catchall_0
    move-exception v0

    invoke-static {v7, v8, v9}, Ld;->z(La3/p;J)V

    throw v0
.end method
