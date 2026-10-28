.class public abstract Lum1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lo01/c;",
        "aiChatEntryPointItem",
        "",
        "shouldShowReplayButton",
        "shouldAnimateReplayButton",
        "Lk31/d;",
        "replayViewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "c",
        "(Lo01/c;ZZLk31/d;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "home_release"
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
.method public static synthetic a(Lo01/c;ZZLk31/d;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lum1/b;->e(Lo01/c;ZZLk31/d;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk31/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lum1/b;->d(Lk31/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lo01/c;ZZLk31/d;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo01/c;",
            "ZZ",
            "Lk31/d;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v0, p2

    move-object/from16 v11, p3

    move-object/from16 v12, p4

    move/from16 v13, p6

    const-string v3, "onClick"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v3, 0x7d94ea9b

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v13, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v13, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v13

    goto :goto_2

    :cond_2
    move v3, v13

    :goto_2
    and-int/lit8 v6, v13, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit16 v6, v13, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v8, v0}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v3, v6

    :cond_6
    and-int/lit16 v6, v13, 0xc00

    if-nez v6, :cond_9

    and-int/lit16 v6, v13, 0x1000

    if-nez v6, :cond_7

    invoke-virtual {v8, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_5

    :cond_7
    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_5
    if-eqz v6, :cond_8

    const/16 v6, 0x800

    goto :goto_6

    :cond_8
    const/16 v6, 0x400

    :goto_6
    or-int/2addr v3, v6

    :cond_9
    and-int/lit16 v6, v13, 0x6000

    if-nez v6, :cond_b

    invoke-virtual {v8, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/16 v6, 0x4000

    goto :goto_7

    :cond_a
    const/16 v6, 0x2000

    :goto_7
    or-int/2addr v3, v6

    :cond_b
    and-int/lit16 v6, v3, 0x2493

    const/16 v7, 0x2492

    if-eq v6, v7, :cond_c

    const/4 v6, 0x1

    goto :goto_8

    :cond_c
    const/4 v6, 0x0

    :goto_8
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1c

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/4 v7, 0x3

    if-eqz v0, :cond_d

    const/4 v9, 0x0

    invoke-static {v6, v9, v7}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/16 v7, 0x64

    const/16 v14, 0x1f4

    invoke-static {v7, v14, v9, v5}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    invoke-static {v7, v4}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v4

    new-instance v7, Ll83/k;

    invoke-direct {v7, v10, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_9

    :cond_d
    sget-object v4, Lc0/c1;->a:Lc0/d1;

    new-instance v7, Ll83/k;

    invoke-direct {v7, v6, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_9
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->b:Ll0/e;

    sget-object v14, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x6

    invoke-static {v10, v14, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object/from16 v16, v5

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_a
    sget-object v15, La3/k;->g:La3/i;

    move-object/from16 v0, v16

    invoke-static {v8, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_f

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v16, v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    goto :goto_b

    :cond_f
    move/from16 v16, v3

    :goto_b
    invoke-static {v4, v8, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v1, :cond_11

    const v3, -0x2bc5623c

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move v13, v3

    move-object/from16 v17, v14

    goto/16 :goto_10

    :cond_11
    const v3, -0x2bc5623b

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    move-object v4, v14

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v13, v3

    const-wide/16 v18, 0x0

    cmpl-double v9, v13, v18

    if-lez v9, :cond_12

    goto :goto_c

    :cond_12
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v13, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v14, v3, v13

    if-lez v14, :cond_13

    :goto_d
    const/4 v3, 0x1

    goto :goto_e

    :cond_13
    move v13, v3

    goto :goto_d

    :goto_e
    invoke-direct {v9, v13, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v3, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v8, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v8}, Lp1/q;->i0()V

    move-object/from16 v17, v4

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-eqz v4, :cond_14

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_14
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v8, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_16

    :cond_15
    invoke-static {v13, v8, v13, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v8, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lo01/c;->k:I

    shr-int/lit8 v4, v16, 0x9

    and-int/lit8 v4, v4, 0x70

    or-int/2addr v3, v4

    const/4 v13, 0x0

    invoke-static {v1, v12, v8, v3, v13}, Lo01/b;->g(Lo01/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_10
    if-nez v11, :cond_17

    const v0, -0x2bc267f3

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    goto/16 :goto_13

    :cond_17
    const v3, -0x2bc267f2

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    iget-object v3, v7, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Landroidx/compose/ui/Modifier;

    sget-object v4, Ll0/m;->a:Ll0/e;

    move-object/from16 v9, v17

    invoke-static {v4, v9, v8, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_18

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_18
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v8, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_19

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1a

    :cond_19
    invoke-static {v9, v8, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v8, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p1, :cond_1b

    if-eqz v1, :cond_1b

    const v0, -0x1cbd431c

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v2, 0x4

    int-to-float v2, v2

    const/4 v13, 0x0

    invoke-static {v0, v2, v6, v8, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_12

    :cond_1b
    const/4 v13, 0x0

    const v0, -0x7aea82b8

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_12
    iget-object v0, v7, Ll83/k;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lc0/c1;

    sget-object v5, Lc0/e1;->a:Lc0/f1;

    new-instance v0, Lbc3/l;

    const/4 v2, 0x7

    invoke-direct {v0, v11, v2}, Lbc3/l;-><init>(Ljava/lang/Object;I)V

    const v2, 0x6a2c0e52    # 5.2000717E25f

    invoke-static {v2, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v0, 0x180006

    and-int/lit8 v2, v16, 0x70

    or-int v9, v0, v2

    const/16 v10, 0x12

    const/4 v3, 0x0

    const/4 v6, 0x0

    move/from16 v2, p1

    invoke-static/range {v2 .. v10}, Landroidx/compose/animation/b;->g(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1c
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lum1/a;

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v6, p6

    move-object v4, v11

    move-object v5, v12

    invoke-direct/range {v0 .. v6}, Lum1/a;-><init>(Lo01/c;ZZLk31/d;Lc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final d(Lk31/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lk31/d;->f:I

    invoke-static {p0, p2, p1}, Lk31/c;->b(Lk31/d;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lo01/c;ZZLk31/d;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lum1/b;->c(Lo01/c;ZZLk31/d;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
