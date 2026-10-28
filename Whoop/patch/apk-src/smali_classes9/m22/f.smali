.class public abstract Lm22/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u001aG\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a3\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\u000b\u001a\u00020\u00032\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lqt0/b;",
        "device",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBackClicked",
        "onRetryClicked",
        "onTroubleConnectingClicked",
        "k",
        "(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Lqt0/b;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "i",
        "(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "pairing-ui_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/f;->m()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/f;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm22/f;->j(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lm22/f;->o(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lqt0/b;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm22/f;->h(Lqt0/b;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lm22/f;->l()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method private static final g(Lqt0/b;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqt0/b;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x6ef34d3e

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v7, 0x2

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    move v5, v7

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_3
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_5
    and-int/lit16 v8, v5, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_6

    move v8, v11

    goto :goto_4

    :cond_6
    move v8, v10

    :goto_4
    and-int/lit8 v9, v5, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_e

    int-to-float v8, v7

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v8, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x0

    invoke-static {v9, v8, v12, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, Ll0/m;->d:Ll0/g;

    sget-object v13, Lb2/e;->N:Lb2/k;

    const/16 v14, 0x36

    invoke-static {v12, v13, v0, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_7

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v13, v0, v13, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v6, v5, 0xe

    invoke-static {v1, v0, v6}, Lo22/a;->b(Lqt0/b;Landroidx/compose/runtime/Composer;I)V

    float-to-double v6, v8

    const-wide/16 v12, 0x0

    cmpl-double v6, v6, v12

    const-string v7, "invalid weight; must be greater than zero"

    if-lez v6, :cond_a

    goto :goto_6

    :cond_a
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v15, v8, v14

    if-lez v15, :cond_b

    move v15, v14

    goto :goto_7

    :cond_b
    move v15, v8

    :goto_7
    invoke-direct {v6, v15, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v0, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {v0, v10}, Lo22/c;->b(Landroidx/compose/runtime/Composer;I)V

    move-wide v15, v12

    float-to-double v12, v8

    cmpl-double v6, v12, v15

    if-lez v6, :cond_c

    goto :goto_8

    :cond_c
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v8, v14

    if-lez v7, :cond_d

    move v8, v14

    :cond_d
    invoke-direct {v6, v8, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v0, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0x7e

    invoke-static {v2, v3, v0, v5}, Lm22/f;->i(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x6

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v5, v6, v9, v0, v11}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Ll72/n;

    const/16 v5, 0xc

    invoke-direct/range {v0 .. v5}, Ll72/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(Lqt0/b;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lm22/f;->g(Lqt0/b;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v13, p0

    move-object/from16 v0, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, -0x5842890e

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    move/from16 v40, v1

    and-int/lit8 v1, v40, 0x13

    const/16 v11, 0x12

    if-eq v1, v11, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v4, v40, 0x1

    invoke-virtual {v14, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_b

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v1, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v4, v14, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v14, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v11

    int-to-float v9, v2

    mul-float/2addr v6, v9

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v15, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 v17, v11

    invoke-virtual/range {v16 .. v16}, Ly81/i;->f()J

    move-result-wide v10

    sget-object v3, Lt0/j;->a:Lt0/i;

    invoke-static {v2, v10, v11, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v10, 0x0

    invoke-static {v3, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v14, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-eqz v0, :cond_8

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v14, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {v10, v14, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v14, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x9

    int-to-float v0, v0

    mul-float/2addr v0, v9

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v10, 0x6

    int-to-float v1, v10

    mul-float/2addr v1, v9

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v0

    invoke-static {v0, v14, v10}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    invoke-virtual {v15, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v4

    const/16 v7, 0x1b0

    const/4 v8, 0x0

    const/4 v2, 0x0

    move v0, v6

    move-object v6, v14

    invoke-static/range {v1 .. v8}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    invoke-static {v2, v3, v12, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v2, La22/b;->j:I

    invoke-static {v14, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v15, v14, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->Q()Lb91/a;

    move-result-object v34

    invoke-virtual {v15, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v38, v0, 0x12

    const v39, 0x2fffa

    const/4 v15, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    move-wide/from16 v16, v4

    move-object/from16 v36, v14

    move-object v14, v2

    invoke-static/range {v14 .. v39}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v36

    const/4 v0, 0x3

    int-to-float v2, v0

    invoke-static {v2, v3, v12, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v3, La22/b;->k:I

    invoke-static {v14, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v18, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v18, 0x12

    shl-int/lit8 v3, v40, 0x9

    and-int/lit16 v3, v3, 0x1c00

    const/16 v17, 0x1fbf

    move v4, v0

    const/4 v0, 0x0

    move/from16 v41, v1

    const/4 v1, 0x0

    move v5, v2

    const/4 v2, 0x0

    move/from16 v16, v3

    const/4 v3, 0x0

    move v7, v4

    const/4 v4, 0x0

    move v8, v5

    const/4 v5, 0x0

    move v11, v7

    const/4 v7, 0x0

    move/from16 v19, v8

    const/4 v8, 0x0

    move/from16 v20, v9

    const/4 v9, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move/from16 v43, v19

    move/from16 v42, v20

    move-object/from16 v44, v23

    invoke-static/range {v0 .. v17}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v15, v13

    move/from16 v0, v42

    move/from16 v5, v43

    move-object/from16 v1, v44

    invoke-static {v5, v0, v1, v14}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget v0, La22/b;->l:I

    invoke-static {v14, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    shl-int/lit8 v12, v18, 0x6

    shr-int/lit8 v0, v40, 0x3

    and-int/lit8 v13, v0, 0xe

    const/16 v14, 0x3fb

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v10, p1

    move-object/from16 v11, v36

    invoke-static/range {v0 .. v14}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object v0, v10

    move-object v14, v11

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    move-object v15, v13

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_c

    new-instance v2, Lam2/g;

    const/16 v3, 0x9

    move/from16 v4, p3

    invoke-direct {v2, v15, v0, v4, v3}, Lam2/g;-><init>(Lc93/a;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final j(Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lm22/f;->i(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqt0/b;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v5, p5

    const-string v0, "device"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, -0x56721527

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v5, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    goto :goto_1

    :cond_1
    move v1, v5

    :goto_1
    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v1, v1, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, v5, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_2

    :cond_3
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_4
    :goto_3
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_7

    invoke-virtual {v0, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x100

    goto :goto_4

    :cond_6
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v1, v6

    :cond_7
    :goto_5
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_8

    or-int/lit16 v1, v1, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_a

    invoke-virtual {v0, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v1, v8

    :cond_a
    :goto_7
    and-int/lit16 v8, v1, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_b

    move v8, v11

    goto :goto_8

    :cond_b
    move v8, v10

    :goto_8
    and-int/lit8 v9, v1, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_15

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_c

    new-instance p1, Llt2/a;

    const/16 v2, 0x13

    invoke-direct {p1, v2}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast p1, Lc93/a;

    :cond_d
    if-eqz v3, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_e

    new-instance v2, Llt2/a;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v2, Lc93/a;

    goto :goto_9

    :cond_f
    move-object v2, p2

    :goto_9
    if-eqz v6, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_10

    new-instance v3, Llt2/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Llt2/a;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lc93/a;

    goto :goto_a

    :cond_11
    move-object v3, p3

    :goto_a
    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v0, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_12

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    :cond_13
    invoke-static {v7, v0, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v1, 0x3

    and-int/lit8 v6, v4, 0xe

    invoke-static {p1, v0, v6}, Lo22/d;->b(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v1, v1, 0xe

    and-int/lit8 v6, v4, 0x70

    or-int/2addr v1, v6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v1, v4

    invoke-static {p0, v2, v3, v0, v1}, Lm22/f;->g(Lqt0/b;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    move-object v4, v3

    move-object v3, v2

    :goto_c
    move-object v2, p1

    goto :goto_d

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v3, p2

    move-object v4, p3

    goto :goto_c

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_16

    new-instance v0, Lkw1/c;

    const/16 v7, 0xd

    move-object v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Lc93/a;Lc93/a;Lc93/a;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final l()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lm22/f;->k(Lqt0/b;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
