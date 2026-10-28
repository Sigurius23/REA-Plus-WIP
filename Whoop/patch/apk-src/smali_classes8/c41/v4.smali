.class public abstract Lc41/v4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aS\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a/\u0010\u0010\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "filledCount",
        "totalCount",
        "resourceId",
        "Ly81/f;",
        "iconColor",
        "backgroundColor",
        "",
        "showCount",
        "fillMaxWidth",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZLandroidx/compose/runtime/Composer;II)V",
        "isFilled",
        "c",
        "(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ly81/f;Ly81/f;IZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/v4;->d(Ly81/f;Ly81/f;IZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lc41/v4;->f(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "iconColor"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backgroundColor"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x6ea58600

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v6, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v11, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    invoke-virtual {v11, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit16 v7, v0, 0x493

    const/16 v8, 0x492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v7, v8, :cond_8

    move v7, v15

    goto :goto_5

    :cond_8
    move v7, v14

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_f

    if-eqz v4, :cond_9

    move-object v7, v2

    goto :goto_6

    :cond_9
    sget-object v7, Ly81/f;->TRANSPARENT:Ly81/f;

    :goto_6
    if-nez v4, :cond_a

    const/high16 v8, 0x3f000000    # 0.5f

    goto :goto_7

    :cond_a
    const/high16 v8, 0x3f800000    # 1.0f

    :goto_7
    const-wide v9, 0x3fd3333333333333L    # 0.3

    double-to-float v9, v9

    int-to-float v6, v6

    mul-float/2addr v9, v6

    and-int/lit8 v10, v0, 0xe

    invoke-virtual {v1, v11, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    invoke-static {v8, v12, v13}, Li2/x;->c(FJ)J

    move-result-wide v12

    invoke-static {v9, v12, v13}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v8

    sget-object v9, Lt0/j;->a:Lt0/i;

    iget v12, v8, Lf0/t;->a:F

    iget-object v8, v8, Lf0/t;->b:Li2/t;

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13, v8, v9}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v12, v6

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7, v11, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v4, v5, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v15}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    :cond_c
    invoke-static {v7, v11, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p3, :cond_e

    const v4, 0x78f64df

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x3

    shr-int/2addr v0, v4

    and-int/lit8 v0, v0, 0x70

    const/4 v5, 0x6

    or-int/2addr v0, v5

    invoke-static {v3, v11, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const-string v7, "null"

    invoke-static {v7, v11, v5}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v15}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v4, v4

    mul-float/2addr v4, v6

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v1, v11, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v6, v0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v0, 0x79437e8

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Lbg0/h;

    move/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lbg0/h;-><init>(Ly81/f;Ly81/f;IZI)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Ly81/f;Ly81/f;IZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lc41/v4;->c(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZLandroidx/compose/runtime/Composer;II)V
    .locals 39

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p4

    move/from16 v0, p6

    move/from16 v1, p9

    move/from16 v10, p10

    sget-object v11, Lb2/e;->J:Lb2/l;

    const-string v5, "iconColor"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "backgroundColor"

    move-object/from16 v6, p5

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p8

    check-cast v8, Lp1/q;

    const v5, 0x8a8e550

    invoke-virtual {v8, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v10, 0x1

    if-eqz v5, :cond_0

    or-int/lit8 v12, v1, 0x6

    move v13, v12

    move-object/from16 v12, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v12, v1, 0x6

    if-nez v12, :cond_2

    move-object/from16 v12, p0

    invoke-virtual {v8, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_1

    const/4 v13, 0x4

    goto :goto_0

    :cond_1
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v1

    goto :goto_1

    :cond_2
    move-object/from16 v12, p0

    move v13, v1

    :goto_1
    and-int/lit8 v14, v1, 0x30

    if-nez v14, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_3

    const/16 v14, 0x20

    goto :goto_2

    :cond_3
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v13, v14

    :cond_4
    and-int/lit16 v14, v1, 0x180

    if-nez v14, :cond_6

    invoke-virtual {v8, v3}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_5

    const/16 v14, 0x100

    goto :goto_3

    :cond_5
    const/16 v14, 0x80

    :goto_3
    or-int/2addr v13, v14

    :cond_6
    and-int/lit16 v14, v1, 0xc00

    if-nez v14, :cond_8

    move/from16 v14, p3

    invoke-virtual {v8, v14}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_7

    const/16 v15, 0x800

    goto :goto_4

    :cond_7
    const/16 v15, 0x400

    :goto_4
    or-int/2addr v13, v15

    goto :goto_5

    :cond_8
    move/from16 v14, p3

    :goto_5
    and-int/lit16 v15, v1, 0x6000

    if-nez v15, :cond_a

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    invoke-virtual {v8, v15}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_9

    const/16 v15, 0x4000

    goto :goto_6

    :cond_9
    const/16 v15, 0x2000

    :goto_6
    or-int/2addr v13, v15

    :cond_a
    const/high16 v15, 0x30000

    and-int/2addr v15, v1

    if-nez v15, :cond_c

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    invoke-virtual {v8, v15}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_b

    const/high16 v15, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v15, 0x10000

    :goto_7
    or-int/2addr v13, v15

    :cond_c
    const/high16 v15, 0x180000

    and-int/2addr v15, v1

    if-nez v15, :cond_e

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v15

    if-eqz v15, :cond_d

    const/high16 v15, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v15, 0x80000

    :goto_8
    or-int/2addr v13, v15

    :cond_e
    and-int/lit16 v15, v10, 0x80

    const/high16 v16, 0xc00000

    if-eqz v15, :cond_f

    or-int v13, v13, v16

    move/from16 v9, p7

    goto :goto_a

    :cond_f
    and-int v16, v1, v16

    move/from16 v9, p7

    if-nez v16, :cond_11

    invoke-virtual {v8, v9}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x800000

    goto :goto_9

    :cond_10
    const/high16 v16, 0x400000

    :goto_9
    or-int v13, v13, v16

    :cond_11
    :goto_a
    const v16, 0x492493

    and-int v7, v13, v16

    const v0, 0x492492

    move/from16 v16, v13

    if-eq v7, v0, :cond_12

    const/4 v0, 0x1

    goto :goto_b

    :cond_12
    const/4 v0, 0x0

    :goto_b
    and-int/lit8 v7, v16, 0x1

    invoke-virtual {v8, v7, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1f

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_13

    move-object v12, v0

    :cond_13
    if-eqz v15, :cond_14

    const/16 v38, 0x1

    :goto_c
    const/4 v5, 0x2

    goto :goto_d

    :cond_14
    move/from16 v38, v9

    goto :goto_c

    :goto_d
    int-to-float v5, v5

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v38, :cond_15

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_15
    invoke-interface {v12, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v7, 0x6

    invoke-static {v5, v11, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_16

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v7, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_18

    :cond_17
    invoke-static {v9, v8, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x4551f4f6

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    :goto_f
    if-ge v0, v3, :cond_1a

    if-ge v0, v2, :cond_19

    const v5, 0x64ed9116

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    shr-int/lit8 v5, v16, 0xc

    and-int/lit8 v7, v5, 0xe

    or-int/lit16 v7, v7, 0xc00

    and-int/lit8 v5, v5, 0x70

    or-int/2addr v5, v7

    shr-int/lit8 v7, v16, 0x3

    and-int/lit16 v7, v7, 0x380

    or-int v9, v5, v7

    const/4 v7, 0x1

    move-object v5, v6

    const/4 v13, 0x6

    move/from16 v6, p3

    invoke-static/range {v4 .. v9}, Lc41/v4;->c(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V

    const/4 v4, 0x0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    move v5, v4

    move-object/from16 v4, p4

    goto :goto_10

    :cond_19
    const/4 v13, 0x6

    const v4, 0x64eefd75

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    shr-int/lit8 v4, v16, 0xc

    and-int/lit8 v5, v4, 0xe

    or-int/lit16 v5, v5, 0xc00

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v4, v5

    shr-int/lit8 v5, v16, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int v9, v4, v5

    const/4 v7, 0x0

    move/from16 v6, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    invoke-static/range {v4 .. v9}, Lc41/v4;->c(Ly81/f;Ly81/f;IZLandroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    :goto_10
    add-int/lit8 v0, v0, 0x1

    move-object/from16 v6, p5

    goto :goto_f

    :cond_1a
    const/4 v5, 0x0

    const/4 v13, 0x6

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    if-eqz p6, :cond_1e

    const v0, 0x64f13563

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ll0/m;->b:Ll0/e;

    invoke-static {v15, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v11, v8, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_1b

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1b
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v8, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_1c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    :cond_1c
    invoke-static {v6, v8, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, "/"

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v8, v5}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->C()Lb91/a;

    move-result-object v32

    shr-int/lit8 v6, v16, 0xc

    and-int/lit8 v6, v6, 0xe

    invoke-virtual {v4, v8, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    const/16 v36, 0x0

    const v37, 0x2fffa

    const/4 v13, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    move-object v6, v12

    move-object v12, v0

    move-object v0, v6

    move-object/from16 v34, v8

    const/4 v6, 0x1

    invoke-static/range {v12 .. v37}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1e
    move-object v0, v12

    const/4 v5, 0x0

    const/4 v6, 0x1

    const v7, 0x64f6aece

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    move-object v12, v0

    move-object/from16 v34, v8

    move/from16 v8, v38

    goto :goto_13

    :cond_1f
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object/from16 v34, v8

    move v8, v9

    :goto_13
    invoke-virtual/range {v34 .. v34}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_20

    new-instance v0, Lc41/u4;

    move-object/from16 v6, p5

    move/from16 v7, p6

    move v9, v1

    move-object v5, v4

    move-object v1, v12

    move/from16 v4, p3

    invoke-direct/range {v0 .. v10}, Lc41/u4;-><init>(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lc41/v4;->e(Landroidx/compose/ui/Modifier;IIILy81/f;Ly81/f;ZZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
