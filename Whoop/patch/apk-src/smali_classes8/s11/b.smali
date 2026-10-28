.class public abstract Ls11/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ls11/b$d;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001aC\u0010\u0010\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a\u000f\u0010\u0014\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0014\u0010\u0013\u001a\u000f\u0010\u0015\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0015\u0010\u0013\u00a8\u0006\u0016"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll01/d;",
        "state",
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/ui/Modifier;Ll01/d;Landroidx/compose/runtime/Composer;II)V",
        "Lgz0/m0;",
        "icon",
        "Ly81/f;",
        "iconBackgroundColor",
        "iconTintColor",
        "Ll01/a;",
        "shape",
        "Ly3/f;",
        "iconSize",
        "f",
        "(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLandroidx/compose/runtime/Composer;II)V",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
        "n",
        "l",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls11/b;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls11/b;->m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ls11/b;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Ls11/b;->g(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Ll01/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ls11/b;->i(Landroidx/compose/ui/Modifier;Ll01/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x3eb6520b

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v1, 0x2

    const/4 v3, 0x4

    const/4 v4, -0x1

    if-nez v0, :cond_2

    if-nez p0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    :goto_0
    invoke-virtual {v12, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_1

    move v0, v3

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_5

    if-nez v2, :cond_3

    move v5, v4

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    :goto_3
    invoke-virtual {v12, v5}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_4

    :cond_4
    const/16 v5, 0x10

    :goto_4
    or-int/2addr v0, v5

    :cond_5
    and-int/lit8 v5, p7, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    goto :goto_7

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_9

    if-nez p2, :cond_7

    move v7, v4

    goto :goto_5

    :cond_7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_5
    invoke-virtual {v12, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x100

    goto :goto_6

    :cond_8
    const/16 v7, 0x80

    :goto_6
    or-int/2addr v0, v7

    :cond_9
    :goto_7
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_c

    if-nez p3, :cond_a

    move v7, v4

    goto :goto_8

    :cond_a
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_8
    invoke-virtual {v12, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_b

    const/16 v7, 0x800

    goto :goto_9

    :cond_b
    const/16 v7, 0x400

    :goto_9
    or-int/2addr v0, v7

    :cond_c
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_e

    or-int/lit16 v0, v0, 0x6000

    :cond_d
    move/from16 v8, p4

    goto :goto_b

    :cond_e
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_d

    move/from16 v8, p4

    invoke-virtual {v12, v8}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_f

    const/16 v9, 0x4000

    goto :goto_a

    :cond_f
    const/16 v9, 0x2000

    :goto_a
    or-int/2addr v0, v9

    :goto_b
    and-int/lit16 v9, v0, 0x2493

    const/16 v10, 0x2492

    const/4 v15, 0x1

    const/4 v11, 0x0

    if-eq v9, v10, :cond_10

    move v9, v15

    goto :goto_c

    :cond_10
    move v9, v11

    :goto_c
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1f

    const/4 v9, 0x0

    if-eqz v5, :cond_11

    move-object v5, v9

    goto :goto_d

    :cond_11
    move-object/from16 v5, p2

    :goto_d
    if-eqz v7, :cond_12

    const-wide/high16 v7, 0x4004000000000000L    # 2.5

    double-to-float v7, v7

    int-to-float v8, v3

    mul-float/2addr v7, v8

    goto :goto_e

    :cond_12
    move v7, v8

    :goto_e
    if-nez p3, :cond_13

    goto :goto_f

    :cond_13
    sget-object v4, Ls11/b$d;->a:[I

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v4, v4, v8

    :goto_f
    if-eq v4, v15, :cond_15

    if-eq v4, v1, :cond_14

    move-object v1, v9

    goto :goto_10

    :cond_14
    const-wide/high16 v13, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v13

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v1, v4

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    goto :goto_10

    :cond_15
    sget-object v1, Lt0/j;->a:Lt0/i;

    :goto_10
    if-nez v2, :cond_16

    const v4, 0x1d311679

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move-object v4, v9

    goto :goto_11

    :cond_16
    const v4, -0x6a69c578

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v0, 0x3

    and-int/lit8 v4, v4, 0xe

    invoke-virtual {v2, v12, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v12, v11, v13, v14}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v4

    :goto_11
    int-to-float v3, v3

    mul-float/2addr v3, v3

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-eqz v1, :cond_17

    invoke-static {v8, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_12

    :cond_17
    move-object v1, v9

    :goto_12
    invoke-static {v3, v1}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz v4, :cond_18

    iget-wide v3, v4, Li2/x;->a:J

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v3, v4, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_13

    :cond_18
    move-object v3, v9

    :goto_13
    invoke-static {v1, v3}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_19

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_14
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v10, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_1b

    :cond_1a
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez p0, :cond_1c

    const v0, -0x6e409750

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    move v0, v7

    goto :goto_17

    :cond_1c
    const v1, -0x6e40974f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    const/4 v4, 0x6

    invoke-static {v3, v12, v4}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    if-nez v5, :cond_1d

    const v0, -0x3ac4ce1

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1d
    const v8, 0x62fa7122

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    shr-int/2addr v0, v4

    and-int/lit8 v0, v0, 0xe

    invoke-virtual {v5, v12, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    invoke-static {v12, v11, v8, v9}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v9

    :goto_15
    if-nez v9, :cond_1e

    const v0, 0x62fa7639

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v12, v4, v11}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    goto :goto_16

    :cond_1e
    const v0, 0x62fa6f71

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    iget-wide v8, v9, Li2/x;->a:J

    :goto_16
    const/16 v13, 0x30

    const/4 v14, 0x0

    move v0, v11

    move-wide v10, v8

    const/4 v8, 0x0

    move-object v9, v1

    move v1, v0

    move v0, v7

    move-object v7, v3

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v3, v5

    move v5, v0

    goto :goto_18

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move v5, v8

    :goto_18
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lc51/b;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lc51/b;-><init>(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final g(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Ls11/b;->f(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Ll01/d;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x4ec08d7d

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_5

    move v6, v10

    goto :goto_3

    :cond_5
    move v6, v9

    :goto_3
    and-int/2addr v5, v10

    invoke-virtual {v8, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_15

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v5

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Ll01/d;->f()Ll01/e;

    move-result-object v6

    invoke-virtual {v6}, Ll01/e;->getCardBackground()Li91/a;

    move-result-object v6

    invoke-static {v6, v8, v9}, Li91/c;->k(Li91/a;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    const/4 v11, 0x3

    int-to-float v11, v11

    int-to-float v3, v3

    invoke-static {v4, v11, v3, v6, v7}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Ll01/d;->f()Ll01/e;

    move-result-object v6

    invoke-virtual {v6}, Ll01/e;->getInnerPadding-D9Ej5fM()F

    move-result v6

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v8, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v8, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v8, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-nez v15, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v11, v8, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v8, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ll01/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-eqz v4, :cond_b

    invoke-virtual {v2}, Ll01/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_b

    const v4, -0x536884e0

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ll01/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v8, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v11, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v11}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v11, "toUpperCase(...)"

    invoke-static {v4, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ll01/d;->e()Z

    move-result v11

    if-eqz v11, :cond_a

    const v11, -0x53672212

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    move-object v11, v6

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v4, v14

    const/4 v14, 0x0

    const/16 v15, 0xf7

    move/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v25, v8

    move/from16 v20, v9

    const-wide/16 v8, 0x0

    move-object/from16 v22, v10

    move-object/from16 v21, v11

    const-wide/16 v10, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 p0, v0

    move-object/from16 v31, v13

    move/from16 v29, v16

    move-object/from16 v32, v17

    move-object/from16 v1, v18

    move-object/from16 v30, v19

    move/from16 v0, v20

    move-object/from16 v33, v21

    move-object/from16 v35, v22

    move-object/from16 v34, v23

    move-object/from16 v13, v25

    const/4 v2, 0x1

    invoke-static/range {v3 .. v15}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v13

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_a
    move-object/from16 p0, v0

    move/from16 v29, v3

    move-object v1, v5

    move-object/from16 v33, v6

    move-object/from16 v30, v7

    move v0, v9

    move-object/from16 v35, v10

    move-object/from16 v34, v12

    move-object/from16 v31, v13

    move-object/from16 v32, v14

    const/4 v2, 0x1

    const v3, -0x536513ad

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    new-instance v15, Lsz0/c0;

    sget-object v17, Lb91/c;->H5:Lb91/c;

    invoke-virtual/range {p1 .. p1}, Ll01/d;->f()Ll01/e;

    move-result-object v3

    invoke-virtual {v3}, Ll01/e;->getTitleTextColor()Ly81/f;

    move-result-object v18

    const/16 v26, 0x3f0

    const/16 v27, 0x0

    const/16 v19, 0x5

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v16, v4

    invoke-direct/range {v15 .. v27}, Lsz0/c0;-><init>(Ljava/lang/String;Lb91/c;Ly81/f;ILgz0/m0;Ljava/lang/Integer;Ljava/lang/Integer;Li2/t;ZLsz0/y;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/16 v10, 0x1d

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, v15

    invoke-static/range {v3 .. v10}, Lsz0/b0;->d(Landroidx/compose/ui/Modifier;Lsz0/c0;IIILandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Ll01/d;->f()Ll01/e;

    move-result-object v3

    invoke-virtual {v3}, Ll01/e;->getTitleSpace-D9Ej5fM()F

    move-result v3

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v3, 0x2

    goto :goto_8

    :cond_b
    move-object/from16 p0, v0

    move/from16 v29, v3

    move-object v1, v5

    move-object/from16 v33, v6

    move-object/from16 v30, v7

    move v0, v9

    move-object/from16 v35, v10

    move-object/from16 v34, v12

    move-object/from16 v31, v13

    move-object/from16 v32, v14

    const/4 v2, 0x1

    const v3, -0x535f0097

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v11, v4

    const/4 v12, 0x6

    move-object/from16 v4, v30

    invoke-static {v3, v11, v4, v8, v12}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    move-object/from16 v7, v31

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v7, v32

    goto :goto_a

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v8, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v33

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    :cond_d
    move-object/from16 v3, v34

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v3, v35

    goto :goto_d

    :goto_c
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x4d6b05e9

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Ll01/d;->c()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v30

    :goto_e
    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_14

    invoke-interface/range {v30 .. v30}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Ll01/c;

    sget-object v3, Lb2/e;->K:Lb2/l;

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    const/16 v5, 0x36

    invoke-static {v4, v11, v3, v8, v5}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_f

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_f
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_f
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    :cond_10
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v8, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Ll01/d;->f()Ll01/e;

    move-result-object v3

    invoke-virtual {v3}, Ll01/e;->getShowCheckListIcons()Z

    move-result v3

    if-eqz v3, :cond_12

    const v3, 0x1cc98895

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Ll01/c;->b()Ly81/f;

    move-result-object v4

    invoke-virtual {v13}, Ll01/c;->d()Ly81/f;

    move-result-object v5

    invoke-virtual {v13}, Ll01/c;->e()Ll01/a;

    move-result-object v6

    invoke-virtual {v13}, Ll01/c;->a()Lgz0/m0;

    move-result-object v3

    invoke-virtual {v13}, Ll01/c;->c()F

    move-result v7

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Ls11/b;->f(Lgz0/m0;Ly81/f;Ly81/f;Ll01/a;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_12
    const v3, 0x1ccfd5ac

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Ll01/c;->a()Lgz0/m0;

    move-result-object v4

    if-nez v4, :cond_13

    const v3, 0x1ccfd5ab

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_13
    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x5

    int-to-float v3, v3

    mul-float v3, v3, v29

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {v3, v8, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X()J

    move-result-wide v6

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v13}, Ll01/c;->h()Ljava/lang/String;

    move-result-object v31

    sget-object v3, Liz0/l;->a:Liz0/l;

    sget-object v4, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v13}, Ll01/c;->g()Lb91/c;

    move-result-object v5

    invoke-virtual {v4, v5}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v4

    invoke-virtual {v13}, Ll01/c;->f()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v8, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v8, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->k0()J

    move-result-wide v9

    const/high16 v27, 0x30000

    const/16 v28, 0x7ff8

    move-object/from16 v25, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v15, v12

    move v14, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    move/from16 v20, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    invoke-virtual/range {v3 .. v28}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v6

    move-object/from16 v8, v25

    const/4 v13, 0x0

    const/16 v14, 0x1f6

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v25

    move-object/from16 v3, v31

    invoke-static/range {v3 .. v14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move/from16 v11, v32

    move/from16 v12, v33

    goto/16 :goto_e

    :cond_14
    invoke-static {v8, v0, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, p0

    goto :goto_12

    :cond_15
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v4

    :goto_12
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lqk2/i;

    const/16 v5, 0xc

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Landroidx/compose/ui/Modifier;Lm91/u;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ll01/d;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ls11/b;->h(Landroidx/compose/ui/Modifier;Ll01/d;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x6f06047

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Ls11/b$a;

    invoke-direct {v1}, Ls11/b$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0x8

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ls11/b;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x1168d005

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Ls11/b$b;

    invoke-direct {v1}, Ls11/b$b;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0xa

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ls11/b;->l(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x9834b96

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Ls11/b$c;

    invoke-direct {v1}, Ls11/b$c;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lq81/f;

    const/16 v1, 0x9

    invoke-direct {v0, p1, v1}, Lq81/f;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Ls11/b;->n(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
