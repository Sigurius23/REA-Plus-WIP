.class public abstract Ll0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll0/e;

.field public static final b:Ll0/e;

.field public static final c:Ll0/e;

.field public static final d:Lz2/h;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Ll0/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/e;-><init>(I)V

    sput-object v0, Ll0/f;->a:Ll0/e;

    new-instance v0, Ll0/e;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll0/e;-><init>(I)V

    sput-object v0, Ll0/f;->b:Ll0/e;

    new-instance v0, Ll0/e;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll0/e;-><init>(I)V

    sput-object v0, Ll0/f;->c:Ll0/e;

    new-instance v0, Lj02/w;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lj02/w;-><init>(I)V

    new-instance v1, Lz2/h;

    invoke-direct {v1, v0}, Lz2/h;-><init>(Lc93/a;)V

    sput-object v1, Ll0/f;->d:Lz2/h;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 14

    move-object/from16 v6, p3

    move/from16 v1, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x16a877ea

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p6, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v3, v1, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v3, v3, 0x30

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_5

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_5
    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v1, 0xc00

    const/16 v10, 0x800

    if-nez v9, :cond_a

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    move v9, v10

    goto :goto_6

    :cond_9
    const/16 v9, 0x400

    :goto_6
    or-int/2addr v3, v9

    :cond_a
    and-int/lit16 v9, v3, 0x493

    const/16 v11, 0x492

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v9, v11, :cond_b

    move v9, v13

    goto :goto_7

    :cond_b
    move v9, v12

    :goto_7
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v0, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    if-eqz v2, :cond_c

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_c
    if-eqz v4, :cond_d

    sget-object v2, Lb2/e;->w:Lb2/m;

    goto :goto_8

    :cond_d
    move-object v2, p1

    :goto_8
    if-eqz v7, :cond_e

    move v8, v12

    :cond_e
    invoke-static {v2, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    and-int/lit16 v5, v3, 0x1c00

    if-ne v5, v10, :cond_f

    goto :goto_9

    :cond_f
    move v13, v12

    :goto_9
    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_10

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_11

    :cond_10
    new-instance v7, Lbp0/q;

    const/4 v5, 0x2

    invoke-direct {v7, v5, v4, v6}, Lbp0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v7, Lc93/m;

    and-int/lit8 v3, v3, 0xe

    invoke-static {p0, v7, v0, v3, v12}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v2

    :goto_a
    move-object v4, p0

    move v7, v8

    goto :goto_b

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v5, p1

    goto :goto_a

    :goto_b
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance v0, Lf61/e;

    const/4 v3, 0x6

    move/from16 v2, p6

    invoke-direct/range {v0 .. v7}, Lf61/e;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;Z)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method public static final b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 6

    sget-object v0, Ll0/p;->c:Ll0/p;

    move-object v1, p0

    check-cast v1, Lp1/q;

    iget-wide v2, v1, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-static {p0, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    iget-object v5, v1, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v5, v1, Lp1/q;->S:Z

    if-eqz v5, :cond_0

    invoke-virtual {v1, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_0
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {p0, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p0, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p0, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p0, La3/k;->j:La3/i;

    iget-boolean p1, v1, Lp1/q;->S:Z

    if-nez p1, :cond_1

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    :cond_1
    invoke-static {v2, v1, v2, p0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    const/4 p0, 0x1

    invoke-virtual {v1, p0}, Lp1/q;->q(Z)V

    return-void
.end method

.method public static c(F)Ll0/i0;
    .locals 4

    const/4 v0, 0x0

    int-to-float v1, v0

    int-to-float v2, v0

    int-to-float v0, v0

    new-instance v3, Ll0/i0;

    invoke-direct {v3, p0, v1, v2, v0}, Ll0/i0;-><init>(FFFF)V

    return-object v3
.end method

.method public static final e(Ll0/b2;Landroidx/compose/runtime/Composer;)Ll0/x0;
    .locals 2

    new-instance v0, Ll0/x0;

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ly3/c;

    invoke-direct {v0, p0, p1}, Ll0/x0;-><init>(Ll0/b2;Ly3/c;)V

    return-object v0
.end method

.method public static final g(Ly2/q0;)Ll0/o1;
    .locals 1

    invoke-interface {p0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ll0/o1;

    if-eqz v0, :cond_0

    check-cast p0, Ll0/o1;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final h(Ll0/o1;)F
    .locals 0

    if-eqz p0, :cond_0

    iget p0, p0, Ll0/o1;->a:F

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/e2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/e2;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ll0/n1;IIIIILy2/t0;Ljava/util/List;[Ly2/j1;II[II)Ly2/s0;
    .locals 25

    move-object/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move/from16 v3, p5

    move-object/from16 v4, p7

    move/from16 v10, p10

    int-to-long v5, v3

    sub-int v7, v10, p9

    new-array v8, v7, [I

    move/from16 v12, p9

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    :goto_0
    const/16 v19, 0x0

    if-ge v12, v10, :cond_9

    invoke-interface {v4, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v20

    const/16 v21, 0x1

    move-object/from16 v11, v20

    check-cast v11, Ly2/q0;

    move-wide/from16 v22, v5

    invoke-static {v11}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->h(Ll0/o1;)F

    move-result v6

    if-nez v14, :cond_3

    if-eqz v5, :cond_0

    iget-object v5, v5, Ll0/o1;->c:Ll0/f;

    goto :goto_1

    :cond_0
    move-object/from16 v5, v19

    :goto_1
    if-eqz v5, :cond_1

    instance-of v5, v5, Ll0/b0;

    goto :goto_2

    :cond_1
    const/4 v5, 0x0

    :goto_2
    if-eqz v5, :cond_2

    goto :goto_3

    :cond_2
    const/4 v14, 0x0

    goto :goto_4

    :cond_3
    :goto_3
    move/from16 v14, v21

    :goto_4
    cmpl-float v5, v6, v18

    if-lez v5, :cond_4

    add-float v17, v17, v6

    add-int/lit8 v13, v13, 0x1

    move/from16 v20, v12

    goto :goto_8

    :cond_4
    sub-int v5, v1, v15

    aget-object v6, p8, v12

    move/from16 v16, v5

    if-nez v6, :cond_7

    const v5, 0x7fffffff

    if-ne v1, v5, :cond_5

    move/from16 v20, v12

    move/from16 v24, v13

    const v5, 0x7fffffff

    :goto_5
    const/4 v6, 0x0

    goto :goto_6

    :cond_5
    move/from16 v20, v12

    move/from16 v24, v13

    if-gez v16, :cond_6

    const/4 v5, 0x0

    goto :goto_5

    :cond_6
    move/from16 v5, v16

    goto :goto_5

    :goto_6
    invoke-interface {v0, v6, v5, v2, v6}, Ll0/n1;->g(IIIZ)J

    move-result-wide v12

    invoke-interface {v11, v12, v13}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v6

    goto :goto_7

    :cond_7
    move/from16 v20, v12

    move/from16 v24, v13

    :goto_7
    invoke-interface {v0, v6}, Ll0/n1;->h(Ly2/j1;)I

    move-result v5

    invoke-interface {v0, v6}, Ll0/n1;->f(Ly2/j1;)I

    move-result v11

    sub-int v12, v20, p9

    aput v5, v8, v12

    sub-int v12, v16, v5

    if-gez v12, :cond_8

    const/4 v12, 0x0

    :cond_8
    invoke-static {v3, v12}, Ljava/lang/Math;->min(II)I

    move-result v16

    add-int v5, v5, v16

    add-int/2addr v15, v5

    invoke-static {v9, v11}, Ljava/lang/Math;->max(II)I

    move-result v9

    aput-object v6, p8, v20

    move/from16 v13, v24

    :goto_8
    add-int/lit8 v12, v20, 0x1

    move-wide/from16 v5, v22

    goto/16 :goto_0

    :cond_9
    move-wide/from16 v22, v5

    move/from16 v24, v13

    const/16 v21, 0x1

    if-nez v24, :cond_a

    sub-int v15, v15, v16

    const/4 v6, 0x0

    goto/16 :goto_11

    :cond_a
    const v5, 0x7fffffff

    if-eq v1, v5, :cond_b

    move v3, v1

    goto :goto_9

    :cond_b
    move/from16 v3, p1

    :goto_9
    add-int/lit8 v13, v24, -0x1

    int-to-long v5, v13

    mul-long v5, v5, v22

    sub-int/2addr v3, v15

    int-to-long v11, v3

    sub-long/2addr v11, v5

    const-wide/16 v22, 0x0

    cmp-long v3, v11, v22

    if-gez v3, :cond_c

    move-wide/from16 v11, v22

    :cond_c
    long-to-float v3, v11

    div-float v3, v3, v17

    move/from16 v13, p9

    :goto_a
    if-ge v13, v10, :cond_d

    invoke-interface {v4, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Ly2/q0;

    invoke-static/range {v16 .. v16}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->h(Ll0/o1;)F

    move-result v16

    mul-float v16, v16, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Math;->round(F)I

    move-result v1

    move-wide/from16 v16, v5

    int-to-long v5, v1

    sub-long/2addr v11, v5

    add-int/lit8 v13, v13, 0x1

    move/from16 v1, p3

    move-wide/from16 v5, v16

    goto :goto_a

    :cond_d
    move-wide/from16 v16, v5

    move/from16 v1, p9

    const/4 v6, 0x0

    :goto_b
    if-ge v1, v10, :cond_14

    aget-object v5, p8, v1

    if-nez v5, :cond_13

    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly2/q0;

    invoke-static {v5}, Ll0/f;->g(Ly2/q0;)Ll0/o1;

    move-result-object v13

    invoke-static {v13}, Ll0/f;->h(Ll0/o1;)F

    move-result v20

    cmpl-float v22, v20, v18

    if-lez v22, :cond_e

    move/from16 v22, v21

    goto :goto_c

    :cond_e
    const/16 v22, 0x0

    :goto_c
    if-nez v22, :cond_f

    const-string v22, "All weights <= 0 should have placeables"

    invoke-static/range {v22 .. v22}, Lm0/a;->b(Ljava/lang/String;)V

    :cond_f
    move/from16 v22, v1

    invoke-static {v11, v12}, Ljava/lang/Long;->signum(J)I

    move-result v1

    move/from16 p5, v3

    int-to-long v3, v1

    sub-long/2addr v11, v3

    mul-float v3, p5, v20

    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    move-result v3

    add-int/2addr v3, v1

    const/4 v1, 0x0

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v3

    if-eqz v13, :cond_10

    iget-boolean v4, v13, Ll0/o1;->b:Z

    goto :goto_d

    :cond_10
    move/from16 v4, v21

    :goto_d
    if-eqz v4, :cond_11

    const v4, 0x7fffffff

    if-eq v3, v4, :cond_12

    move v13, v3

    :goto_e
    move/from16 v1, v21

    goto :goto_f

    :cond_11
    const v4, 0x7fffffff

    :cond_12
    move v13, v1

    goto :goto_e

    :goto_f
    invoke-interface {v0, v13, v3, v2, v1}, Ll0/n1;->g(IIIZ)J

    move-result-wide v3

    invoke-interface {v5, v3, v4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v3

    invoke-interface {v0, v3}, Ll0/n1;->h(Ly2/j1;)I

    move-result v4

    invoke-interface {v0, v3}, Ll0/n1;->f(Ly2/j1;)I

    move-result v5

    sub-int v13, v22, p9

    aput v4, v8, v13

    add-int/2addr v6, v4

    invoke-static {v9, v5}, Ljava/lang/Math;->max(II)I

    move-result v4

    aput-object v3, p8, v22

    move v9, v4

    goto :goto_10

    :cond_13
    move/from16 v22, v1

    move/from16 p5, v3

    move/from16 v1, v21

    :goto_10
    add-int/lit8 v3, v22, 0x1

    move-object/from16 v4, p7

    move/from16 v21, v1

    move v1, v3

    move/from16 v3, p5

    goto :goto_b

    :cond_14
    int-to-long v1, v6

    add-long v1, v1, v16

    long-to-int v6, v1

    sub-int v1, p3, v15

    if-gez v6, :cond_15

    const/4 v6, 0x0

    :cond_15
    if-le v6, v1, :cond_16

    move v6, v1

    :cond_16
    :goto_11
    if-eqz v14, :cond_1e

    move/from16 v3, p9

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_12
    if-ge v3, v10, :cond_1d

    aget-object v4, p8, v3

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v4}, Ly2/j1;->p()Ljava/lang/Object;

    move-result-object v5

    instance-of v11, v5, Ll0/o1;

    if-eqz v11, :cond_17

    check-cast v5, Ll0/o1;

    goto :goto_13

    :cond_17
    move-object/from16 v5, v19

    :goto_13
    if-eqz v5, :cond_18

    iget-object v5, v5, Ll0/o1;->c:Ll0/f;

    goto :goto_14

    :cond_18
    move-object/from16 v5, v19

    :goto_14
    if-eqz v5, :cond_19

    invoke-virtual {v5, v4}, Ll0/f;->f(Ly2/j1;)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_15

    :cond_19
    move-object/from16 v5, v19

    :goto_15
    if-eqz v5, :cond_1c

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v11

    invoke-interface {v0, v4}, Ll0/n1;->f(Ly2/j1;)I

    move-result v4

    const/high16 v12, -0x80000000

    if-eq v11, v12, :cond_1a

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_16

    :cond_1a
    const/4 v5, 0x0

    :goto_16
    invoke-static {v1, v5}, Ljava/lang/Math;->max(II)I

    move-result v1

    if-eq v11, v12, :cond_1b

    goto :goto_17

    :cond_1b
    move v11, v4

    :goto_17
    sub-int/2addr v4, v11

    invoke-static {v2, v4}, Ljava/lang/Math;->max(II)I

    move-result v2

    :cond_1c
    add-int/lit8 v3, v3, 0x1

    goto :goto_12

    :cond_1d
    move v3, v1

    goto :goto_18

    :cond_1e
    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_18
    add-int/2addr v15, v6

    if-gez v15, :cond_1f

    const/4 v11, 0x0

    :goto_19
    move/from16 v1, p1

    goto :goto_1a

    :cond_1f
    move v11, v15

    goto :goto_19

    :goto_1a
    invoke-static {v11, v1}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/2addr v2, v3

    move/from16 v1, p2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static {v9, v1}, Ljava/lang/Math;->max(II)I

    move-result v6

    new-array v4, v7, [I

    move-object/from16 v2, p6

    invoke-interface {v0, v5, v8, v4, v2}, Ll0/n1;->j(I[I[ILy2/t0;)V

    move-object/from16 v1, p8

    move/from16 v9, p9

    move-object/from16 v7, p11

    move/from16 v8, p12

    invoke-interface/range {v0 .. v10}, Ll0/n1;->i([Ly2/j1;Ly2/t0;I[III[IIII)Ly2/s0;

    move-result-object v0

    return-object v0
.end method

.method public static final k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/f2;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ll0/f2;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/e2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll0/e2;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/f2;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ll0/f2;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/e2;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, Ll0/e2;-><init>(I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final o(Lv4/b;)Ll0/y0;
    .locals 4

    new-instance v0, Ll0/y0;

    iget v1, p0, Lv4/b;->a:I

    iget v2, p0, Lv4/b;->b:I

    iget v3, p0, Lv4/b;->c:I

    iget p0, p0, Lv4/b;->d:I

    invoke-direct {v0, v1, v2, v3, p0}, Ll0/y0;-><init>(IIII)V

    return-object v0
.end method

.method public static final p(Landroidx/compose/ui/Modifier;Ll0/b2;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Ll0/d2;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Ll0/d2;-><init>(Ll0/b2;I)V

    invoke-static {p0, v0}, Lwb3/f;->u(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract d(ILy3/m;Ly2/j1;I)I
.end method

.method public f(Ly2/j1;)Ljava/lang/Integer;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method
