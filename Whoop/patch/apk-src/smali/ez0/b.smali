.class public abstract Lez0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aA\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001b\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\r\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li91/a;",
        "background",
        "Lk91/a;",
        "roundedCorners",
        "",
        "fadeTop",
        "Ly3/f;",
        "extraBottom",
        "Ll83/a0;",
        "d",
        "(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V",
        "extra",
        "f",
        "(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;",
        "design_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lez0/b;->g(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lez0/b;->h(Ly2/j1;Ly2/i1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lez0/b;->e(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V
    .locals 18

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x5de9d59a

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    and-int/lit8 v5, p7, 0x2

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    move-object/from16 v5, p1

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    goto :goto_3

    :cond_5
    move-object/from16 v5, p1

    :goto_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    and-int/lit8 v7, p7, 0x4

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    move-object/from16 v7, p2

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v4, v8

    goto :goto_5

    :cond_8
    move-object/from16 v7, p2

    :goto_5
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-virtual {v0, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_b

    const/16 v10, 0x800

    goto :goto_6

    :cond_b
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v4, v10

    :goto_7
    and-int/lit8 v10, p7, 0x10

    if-eqz v10, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move/from16 v11, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move/from16 v11, p4

    invoke-virtual {v0, v11}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_e

    const/16 v12, 0x4000

    goto :goto_8

    :cond_e
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v4, v12

    :goto_9
    and-int/lit16 v12, v4, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_f

    move v12, v15

    goto :goto_a

    :cond_f
    move v12, v14

    :goto_a
    and-int/lit8 v13, v4, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v12, v6, 0x1

    const/4 v13, 0x6

    if-eqz v12, :cond_13

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x2

    if-eqz v1, :cond_11

    and-int/lit8 v4, v4, -0x71

    :cond_11
    and-int/lit8 v1, p7, 0x4

    if-eqz v1, :cond_12

    and-int/lit16 v4, v4, -0x381

    :cond_12
    move-object v1, v3

    move-object v3, v5

    move-object v2, v7

    goto :goto_f

    :cond_13
    :goto_b
    if-eqz v1, :cond_14

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_14
    move-object v1, v3

    :goto_c
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_15

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    and-int/lit8 v4, v4, -0x71

    goto :goto_d

    :cond_15
    move-object v3, v5

    :goto_d
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_16

    sget-object v5, Lk91/a;->e:Lk91/a$a;

    int-to-float v7, v15

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-virtual {v5, v7}, Lk91/a$a;->a(F)Lk91/a;

    move-result-object v2

    and-int/lit16 v4, v4, -0x381

    goto :goto_e

    :cond_16
    move-object v2, v7

    :goto_e
    if-eqz v8, :cond_17

    move v9, v14

    :cond_17
    if-eqz v10, :cond_18

    int-to-float v5, v14

    move v11, v5

    :cond_18
    :goto_f
    invoke-virtual {v0}, Lp1/q;->r()V

    if-eqz v9, :cond_1b

    const v5, 0x3174b309

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v4, 0x3

    const/16 v5, 0xe

    and-int/2addr v4, v5

    invoke-static {v3, v0, v4}, Li91/c;->k(Li91/a;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    new-instance v4, Li2/x;

    invoke-direct {v4, v7, v8}, Li2/x;-><init>(J)V

    sget-wide v5, Li2/x;->n:J

    invoke-static {v7, v8, v5, v6}, Li2/x;->d(JJ)Z

    move-result v5

    if-nez v5, :cond_19

    goto :goto_10

    :cond_19
    const/4 v4, 0x0

    :goto_10
    if-nez v4, :cond_1a

    const v4, 0x75355bad

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4, v0, v13, v14}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v4

    goto :goto_11

    :cond_1a
    const v5, 0x7535521c

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    iget-wide v4, v4, Li2/x;->a:J

    :goto_11
    sget-object v6, Li2/t;->b:Li2/s;

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v7, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v12

    new-instance v10, Li2/x;

    invoke-direct {v10, v12, v13}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v8, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    new-instance v10, Li2/x;

    invoke-direct {v10, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v8, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v12, v4}, [Ll83/k;

    move-result-object v4

    const/16 v5, 0xe

    invoke-static {v6, v4, v7, v7, v5}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v4

    invoke-static {v4}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v4

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1b
    const v4, 0x3178d5c2

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    move-object v4, v3

    :goto_12
    if-eqz v9, :cond_1c

    sget-object v5, Lk91/a;->e:Lk91/a$a;

    invoke-virtual {v2}, Lk91/a;->b()F

    move-result v6

    invoke-virtual {v2}, Lk91/a;->a()F

    move-result v7

    invoke-virtual {v5, v6, v7}, Lk91/a$a;->b(FF)Lk91/a;

    move-result-object v5

    goto :goto_13

    :cond_1c
    move-object v5, v2

    :goto_13
    int-to-float v6, v14

    invoke-static {v11, v6}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-lez v6, :cond_1d

    invoke-static {v1, v11}, Lez0/b;->f(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v6

    goto :goto_14

    :cond_1d
    move-object v6, v1

    :goto_14
    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p3, v0

    move-object/from16 p1, v4

    move-object/from16 p2, v5

    move-object/from16 p0, v6

    move/from16 p4, v7

    move/from16 p5, v8

    invoke-static/range {p0 .. p5}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v3

    move-object v3, v2

    move-object v2, v4

    :goto_15
    move v4, v9

    move v5, v11

    goto :goto_16

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v3

    move-object v2, v5

    move-object v3, v7

    goto :goto_15

    :goto_16
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lez0/a;

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lez0/a;-><init>(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lez0/b;->d(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;ZFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lev2/g;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lev2/g;-><init>(FI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final g(FLy2/t0;Ly2/q0;Ly3/a;)Ly2/s0;
    .locals 3

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "measurable"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, p0}, Ly3/c;->F(F)I

    move-result p0

    iget-wide v0, p3, Ly3/a;->a:J

    invoke-static {v0, v1}, Ly3/a;->e(J)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {v0, v1}, Ly3/a;->i(J)I

    move-result p3

    goto :goto_0

    :cond_0
    invoke-static {v0, v1}, Ly3/a;->k(J)I

    move-result p3

    :goto_0
    invoke-static {v0, v1}, Ly3/a;->d(J)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {v0, v1}, Ly3/a;->h(J)I

    move-result v0

    :goto_1
    add-int/2addr v0, p0

    goto :goto_2

    :cond_1
    invoke-static {v0, v1}, Ly3/a;->j(J)I

    move-result v0

    goto :goto_1

    :goto_2
    const/4 p0, 0x0

    if-gez p3, :cond_2

    move p3, p0

    :cond_2
    if-gez v0, :cond_3

    move v0, p0

    :cond_3
    const/4 v1, 0x1

    if-ltz p3, :cond_4

    move v2, v1

    goto :goto_3

    :cond_4
    move v2, p0

    :goto_3
    if-ltz v0, :cond_5

    move p0, v1

    :cond_5
    and-int/2addr p0, v2

    if-nez p0, :cond_6

    const-string p0, "width and height must be >= 0"

    invoke-static {p0}, Ly3/i;->a(Ljava/lang/String;)V

    :cond_6
    invoke-static {p3, p3, v0, v0}, Ly3/b;->h(IIII)J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p0

    iget p2, p0, Ly2/j1;->w:I

    iget p3, p0, Ly2/j1;->x:I

    new-instance v0, Lch/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lch/m;-><init>(Ly2/j1;I)V

    sget-object p0, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p2, p3, p0, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Ly2/j1;Ly2/i1;)Ll83/a0;
    .locals 2

    const-string v0, "$this$layout"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-virtual {p1, p0, v0, v0, v1}, Ly2/i1;->f(Ly2/j1;IIF)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
