.class public abstract Ljz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a=\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a%\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "",
        "numItems",
        "selectedItemIndex",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li2/x;",
        "color",
        "selectedColor",
        "Ll83/a0;",
        "d",
        "(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V",
        "Ljz0/d;",
        "state",
        "f",
        "(Ljz0/d;JJLandroidx/compose/runtime/Composer;II)V",
        "itemIndex",
        "i",
        "(III)Ljz0/d;",
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
.method public static synthetic a(FJLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljz0/c;->g(FJLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(IILandroidx/compose/ui/Modifier;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Ljz0/c;->e(IILandroidx/compose/ui/Modifier;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljz0/d;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ljz0/c;->h(Ljz0/d;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V
    .locals 17

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v8, p8

    move-object/from16 v14, p7

    check-cast v14, Lp1/q;

    const v0, 0x35cf2629

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->e(I)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v5, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v5, v8, 0x180

    if-nez v5, :cond_4

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_3

    :cond_6
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit16 v6, v8, 0xc00

    if-nez v6, :cond_9

    and-int/lit8 v6, p9, 0x8

    if-nez v6, :cond_7

    move-wide/from16 v6, p3

    invoke-virtual {v14, v6, v7}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    move-wide/from16 v6, p3

    :cond_8
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v0, v9

    goto :goto_6

    :cond_9
    move-wide/from16 v6, p3

    :goto_6
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_c

    and-int/lit8 v9, p9, 0x10

    if-nez v9, :cond_a

    move-wide/from16 v9, p5

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x4000

    goto :goto_7

    :cond_a
    move-wide/from16 v9, p5

    :cond_b
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v0, v11

    goto :goto_8

    :cond_c
    move-wide/from16 v9, p5

    :goto_8
    and-int/lit16 v11, v0, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    if-eq v11, v12, :cond_d

    const/4 v11, 0x1

    goto :goto_9

    :cond_d
    move v11, v13

    :goto_9
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v14, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_19

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v11, v8, 0x1

    const v12, -0xe001

    const/4 v3, 0x6

    if-eqz v11, :cond_12

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v11

    if-eqz v11, :cond_e

    goto :goto_b

    :cond_e
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_f

    and-int/lit16 v0, v0, -0x1c01

    :cond_f
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_10

    and-int/2addr v0, v12

    :cond_10
    move-object v4, v5

    :cond_11
    :goto_a
    move v5, v13

    move-wide v12, v9

    move-wide v10, v6

    goto :goto_d

    :cond_12
    :goto_b
    if-eqz v4, :cond_13

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_13
    move-object v4, v5

    :goto_c
    and-int/lit8 v5, p9, 0x8

    if-eqz v5, :cond_14

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v14, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X0()J

    move-result-wide v5

    and-int/lit16 v0, v0, -0x1c01

    move-wide v6, v5

    :cond_14
    and-int/lit8 v5, p9, 0x10

    if-eqz v5, :cond_11

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v14, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v9

    and-int/2addr v0, v12

    goto :goto_a

    :goto_d
    invoke-virtual {v14}, Lp1/q;->r()V

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/4 v7, 0x2

    invoke-static {v4, v6, v7}, Landroidx/compose/foundation/layout/d;->z(Landroidx/compose/ui/Modifier;Lb2/f;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    move/from16 p7, v3

    const/16 v3, 0x30

    invoke-static {v9, v7, v14, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object/from16 p3, v6

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    move-object/from16 v7, p3

    invoke-static {v14, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_15

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_15
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_e
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v14, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-nez v6, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    :cond_16
    invoke-static {v5, v14, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x496d2071

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    :goto_f
    if-ge v3, v1, :cond_18

    invoke-static {v1, v3, v2}, Ljz0/c;->i(III)Ljz0/d;

    move-result-object v9

    shr-int/lit8 v5, v0, 0x6

    and-int/lit16 v15, v5, 0x3f0

    const/4 v5, 0x1

    const/16 v16, 0x0

    move v6, v5

    const/4 v5, 0x0

    invoke-static/range {v9 .. v16}, Ljz0/c;->f(Ljz0/d;JJLandroidx/compose/runtime/Composer;II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_f

    :cond_18
    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v6}, Lp1/q;->q(Z)V

    move-object v3, v4

    move-wide v4, v10

    move-wide v6, v12

    goto :goto_10

    :cond_19
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v5

    move-wide v4, v6

    move-wide v6, v9

    :goto_10
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v0, Ljz0/a;

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ljz0/a;-><init>(IILandroidx/compose/ui/Modifier;JJII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final e(IILandroidx/compose/ui/Modifier;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move v1, p0

    move v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide/from16 v6, p5

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Ljz0/c;->d(IILandroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljz0/d;JJLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v6, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v0, -0x413f07b0

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v2, v6, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, p7, 0x2

    if-nez v2, :cond_2

    move-wide/from16 v2, p1

    invoke-virtual {v13, v2, v3}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    move-wide/from16 v2, p1

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_4
    move-wide/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v6, 0x180

    if-nez v4, :cond_7

    and-int/lit8 v4, p7, 0x4

    if-nez v4, :cond_5

    move-wide/from16 v4, p3

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    move-wide/from16 v4, p3

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    goto :goto_5

    :cond_7
    move-wide/from16 v4, p3

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_8

    move v7, v10

    goto :goto_6

    :cond_8
    move v7, v9

    :goto_6
    and-int/2addr v0, v10

    invoke-virtual {v13, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v0, v6, 0x1

    if-eqz v0, :cond_a

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v13}, Lp1/q;->X()V

    goto :goto_8

    :cond_a
    :goto_7
    and-int/lit8 v0, p7, 0x2

    const/4 v7, 0x6

    if-eqz v0, :cond_b

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v2

    :cond_b
    and-int/lit8 v0, p7, 0x4

    if-eqz v0, :cond_c

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v13, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    :cond_c
    :goto_8
    invoke-virtual {v13}, Lp1/q;->r()V

    invoke-virtual {v1}, Ljz0/d;->a()Ljz0/e;

    move-result-object v0

    invoke-virtual {v0}, Ljz0/e;->getSizeDp-D9Ej5fM()F

    move-result v0

    invoke-virtual {v1}, Ljz0/d;->b()Z

    move-result v7

    if-eqz v7, :cond_d

    move-wide v7, v4

    goto :goto_9

    :cond_d
    move-wide v7, v2

    :goto_9
    invoke-virtual {v1}, Ljz0/d;->a()Ljz0/e;

    move-result-object v11

    sget-object v12, Ljz0/e;->Hidden:Ljz0/e;

    if-eq v11, v12, :cond_e

    move v9, v10

    :cond_e
    const/4 v10, 0x0

    const/4 v11, 0x3

    invoke-static {v10, v11}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v12

    const/16 v14, 0x9

    invoke-static {v10, v14}, Lc0/w0;->c(Ld0/e2;I)Lc0/d1;

    move-result-object v15

    invoke-virtual {v12, v15}, Lc0/c1;->a(Lc0/c1;)Lc0/d1;

    move-result-object v12

    invoke-static {v10, v11}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v11

    invoke-static {v10, v14}, Lc0/w0;->k(Ld0/e2;I)Lc0/f1;

    move-result-object v10

    invoke-virtual {v11, v10}, Lc0/e1;->a(Lc0/e1;)Lc0/f1;

    move-result-object v10

    new-instance v11, Ljn2/a;

    invoke-direct {v11, v0, v7, v8}, Ljn2/a;-><init>(FJ)V

    const v0, -0xb34ec0a

    invoke-static {v0, v13, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v14, 0x30d80

    const/16 v15, 0x12

    const/4 v8, 0x0

    const/4 v11, 0x0

    move v7, v9

    move-object v9, v12

    move-object v12, v0

    invoke-static/range {v7 .. v15}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Ljz0/b;

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Ljz0/b;-><init>(Ljz0/d;JJII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(FJLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p5, "$this$AnimatedVisibility"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float p3, v0

    const/16 p5, 0x8

    int-to-float p5, p5

    mul-float/2addr p3, p5

    const/4 p5, 0x0

    const/4 v0, 0x2

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v1, p3, p5, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p3

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v1, 0x0

    const/4 v2, 0x0

    move v0, p0

    move-object v3, p4

    invoke-static/range {v0 .. v5}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p0

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    invoke-static {p0, p3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v5, 0x0

    const/16 v6, 0xe

    move-object v4, v3

    const/4 v3, 0x0

    move-wide v0, p1

    invoke-static/range {v0 .. v6}, Lc0/m1;->a(JLd0/c0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object p1

    move-object v3, v4

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li2/x;

    iget-wide p1, p1, Li2/x;->a:J

    sget-object p3, Lt0/j;->a:Lt0/i;

    invoke-static {p0, p1, p2, p3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {p0, v3, p1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljz0/d;JJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ljz0/c;->f(Ljz0/d;JJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(III)Ljz0/d;
    .locals 12

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz p2, :cond_0

    if-ge p2, v0, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    if-ne p2, v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    const/4 v4, 0x3

    if-gt v4, p2, :cond_2

    add-int/lit8 v5, p0, -0x3

    if-ge p2, v5, :cond_2

    move v5, v2

    goto :goto_2

    :cond_2
    move v5, v1

    :goto_2
    add-int/lit8 v6, p0, -0x3

    if-ne p2, v6, :cond_3

    move v6, v2

    goto :goto_3

    :cond_3
    move v6, v1

    :goto_3
    add-int/lit8 v7, p0, -0x2

    if-gt v7, p2, :cond_4

    if-ge p2, p0, :cond_4

    move v8, v2

    goto :goto_4

    :cond_4
    move v8, v1

    :goto_4
    new-instance v9, Ljz0/d;

    if-ne p2, p1, :cond_5

    move v1, v2

    :cond_5
    if-ltz p1, :cond_1a

    if-ge p1, p0, :cond_1a

    const/4 v10, 0x5

    if-gt p0, v10, :cond_6

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto/16 :goto_5

    :cond_6
    if-eqz v3, :cond_7

    if-gt p1, v4, :cond_7

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto/16 :goto_5

    :cond_7
    const/4 v11, 0x4

    if-eqz v3, :cond_8

    if-ne p1, v11, :cond_8

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto/16 :goto_5

    :cond_8
    if-eqz v3, :cond_9

    if-ne p1, v10, :cond_9

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto/16 :goto_5

    :cond_9
    if-eqz v0, :cond_a

    if-nez p1, :cond_a

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto/16 :goto_5

    :cond_a
    if-eqz v0, :cond_b

    if-gt v2, p1, :cond_b

    if-ge p1, v11, :cond_b

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto/16 :goto_5

    :cond_b
    if-eqz v0, :cond_c

    if-ne p1, v11, :cond_c

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto/16 :goto_5

    :cond_c
    if-eqz v0, :cond_d

    if-ne p1, v10, :cond_d

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto/16 :goto_5

    :cond_d
    if-eqz v5, :cond_e

    add-int/lit8 v0, p2, -0x3

    if-ne p1, v0, :cond_e

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto/16 :goto_5

    :cond_e
    if-eqz v5, :cond_f

    add-int/lit8 v0, p2, -0x2

    if-ne p1, v0, :cond_f

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto/16 :goto_5

    :cond_f
    if-eqz v5, :cond_10

    add-int/lit8 v0, p2, -0x1

    add-int/lit8 v2, p2, 0x1

    if-gt p1, v2, :cond_10

    if-gt v0, p1, :cond_10

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto/16 :goto_5

    :cond_10
    if-eqz v5, :cond_11

    add-int/lit8 v0, p2, 0x2

    if-ne p1, v0, :cond_11

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto :goto_5

    :cond_11
    if-eqz v5, :cond_12

    add-int/2addr p2, v4

    if-ne p1, p2, :cond_12

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto :goto_5

    :cond_12
    if-eqz v6, :cond_13

    add-int/lit8 p2, p0, -0x6

    if-ne p1, p2, :cond_13

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto :goto_5

    :cond_13
    if-eqz v6, :cond_14

    add-int/lit8 p2, p0, -0x5

    if-ne p1, p2, :cond_14

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto :goto_5

    :cond_14
    if-eqz v6, :cond_15

    add-int/lit8 p2, p0, -0x4

    if-gt p1, v7, :cond_15

    if-gt p2, p1, :cond_15

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto :goto_5

    :cond_15
    if-eqz v6, :cond_16

    add-int/lit8 p2, p0, -0x1

    if-ne p1, p2, :cond_16

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto :goto_5

    :cond_16
    if-eqz v8, :cond_17

    add-int/lit8 p2, p0, -0x6

    if-ne p1, p2, :cond_17

    sget-object p0, Ljz0/e;->Fading4:Ljz0/e;

    goto :goto_5

    :cond_17
    if-eqz v8, :cond_18

    add-int/lit8 p2, p0, -0x5

    if-ne p1, p2, :cond_18

    sget-object p0, Ljz0/e;->Fading6:Ljz0/e;

    goto :goto_5

    :cond_18
    if-eqz v8, :cond_19

    sub-int/2addr p0, v11

    if-lt p1, p0, :cond_19

    sget-object p0, Ljz0/e;->Enabled:Ljz0/e;

    goto :goto_5

    :cond_19
    sget-object p0, Ljz0/e;->Hidden:Ljz0/e;

    goto :goto_5

    :cond_1a
    sget-object p0, Ljz0/e;->Hidden:Ljz0/e;

    :goto_5
    invoke-direct {v9, v1, p0}, Ljz0/d;-><init>(ZLjz0/e;)V

    return-object v9
.end method
