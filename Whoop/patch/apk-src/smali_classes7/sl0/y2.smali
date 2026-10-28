.class public abstract Lsl0/y2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a9\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0010\u0008\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u000b\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002\u00b2\u0006\u0014\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lsl0/z2;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "onAnimationComplete",
        "d",
        "(Lsl0/z2;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "alpha",
        "updatedOnAnimationComplete",
        "bot_release"
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

    invoke-static {}, Lsl0/y2;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lq2/a;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsl0/y2;->h(Lq2/a;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsl0/z2;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsl0/y2;->i(Lsl0/z2;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lsl0/z2;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/z2;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x5f017590

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v14, 0x2

    const/4 v15, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v15

    goto :goto_0

    :cond_0
    move v0, v14

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v12, 0x1

    if-eq v8, v9, :cond_8

    move v8, v12

    goto :goto_6

    :cond_8
    move v8, v10

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_17

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_9

    new-instance v2, Lsl0/a1;

    const/16 v4, 0x10

    invoke-direct {v2, v4}, Lsl0/a1;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lc93/a;

    goto :goto_7

    :cond_a
    move-object v2, v4

    :goto_7
    const/4 v4, 0x0

    if-eqz v5, :cond_b

    move-object v5, v4

    goto :goto_8

    :cond_b
    move-object v5, v7

    :goto_8
    sget-object v7, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lq2/a;

    invoke-virtual {v1}, Lsl0/z2;->b()Z

    move-result v9

    if-eqz v9, :cond_c

    const v9, 0x3e99999a    # 0.3f

    goto :goto_9

    :cond_c
    const/high16 v9, 0x3f800000    # 1.0f

    :goto_9
    const/16 v13, 0xc8

    const/4 v3, 0x6

    invoke-static {v13, v10, v4, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    move v4, v12

    const/16 v12, 0xc30

    const/16 v13, 0x14

    move-object/from16 v16, v7

    move v7, v9

    const-string v9, "alpha"

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v34, v8

    move-object v8, v3

    move-object/from16 v3, v34

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v8

    move-object v9, v2

    invoke-static {v5, v11}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-virtual {v1}, Lsl0/z2;->b()Z

    move-result v10

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    and-int/lit8 v12, v0, 0xe

    if-ne v12, v15, :cond_d

    move v12, v4

    goto :goto_a

    :cond_d
    move/from16 v12, v17

    :goto_a
    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11, v7}, Lp1/q;->d(F)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_e

    if-ne v13, v3, :cond_f

    :cond_e
    move v12, v0

    goto :goto_b

    :cond_f
    move/from16 p1, v0

    move v12, v4

    move-object/from16 v33, v5

    move-object v7, v9

    move-object v0, v13

    const/16 v9, 0x20

    move-object v13, v3

    move-object v3, v8

    move-object/from16 v8, v16

    goto :goto_c

    :goto_b
    new-instance v0, Lsl0/y2$a;

    move-object v13, v5

    const/4 v5, 0x0

    move/from16 p1, v12

    move-object/from16 v33, v13

    move-object v13, v3

    move v12, v4

    move v4, v7

    move-object v3, v8

    move-object v7, v9

    move-object/from16 v8, v16

    const/16 v9, 0x20

    invoke-direct/range {v0 .. v5}, Lsl0/y2$a;-><init>(Lsl0/z2;Lp1/t2;Lp1/t2;FLq83/d;)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v0, Lc93/m;

    invoke-static {v11, v0, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lsl0/y2;->f(Lp1/t2;)F

    move-result v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v14

    int-to-float v3, v15

    mul-float/2addr v2, v3

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v0, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v14

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v0, v14, v15, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Lsl0/z2;->c()Z

    move-result v0

    if-eqz v0, :cond_10

    invoke-virtual/range {p0 .. p0}, Lsl0/z2;->b()Z

    move-result v0

    if-nez v0, :cond_10

    move/from16 v17, v12

    goto :goto_d

    :cond_10
    const/16 v17, 0x0

    :goto_d
    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v2, p1, 0x70

    if-ne v2, v9, :cond_11

    move v10, v12

    goto :goto_e

    :cond_11
    const/4 v10, 0x0

    :goto_e
    or-int/2addr v0, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_12

    if-ne v2, v13, :cond_13

    :cond_12
    new-instance v2, Lsl0/a0;

    const/16 v0, 0x9

    const/4 v5, 0x0

    invoke-direct {v2, v8, v7, v5, v0}, Lsl0/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object/from16 v20, v2

    check-cast v20, Lc93/a;

    const/16 v21, 0xe

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->w:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_14
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_f
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    :cond_15
    invoke-static {v5, v11, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v9, v7

    invoke-virtual/range {p0 .. p0}, Lsl0/z2;->a()Ljava/lang/String;

    move-result-object v7

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v13

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v0, v2

    int-to-float v5, v12

    mul-float/2addr v5, v2

    invoke-static {v1, v0, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v3, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->w()J

    move-result-wide v0

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v31, v2, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v11

    move v4, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    move-object v2, v9

    move-wide v9, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    invoke-virtual {v11, v4}, Lp1/q;->q(Z)V

    move-object/from16 v3, v33

    goto :goto_10

    :cond_17
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v7

    :goto_10
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Ls51/b;

    const/16 v6, 0xd

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final g(Lp1/t2;)Lc93/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lc93/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc93/a;

    return-object p0
.end method

.method private static final h(Lq2/a;Lc93/a;)Ll83/a0;
    .locals 1

    const/16 v0, 0x9

    invoke-interface {p0, v0}, Lq2/a;->a(I)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lsl0/z2;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsl0/y2;->d(Lsl0/z2;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lsl0/y2;->f(Lp1/t2;)F

    move-result p0

    return p0
.end method

.method public static final synthetic k(Lp1/t2;)Lc93/a;
    .locals 0

    invoke-static {p0}, Lsl0/y2;->g(Lp1/t2;)Lc93/a;

    move-result-object p0

    return-object p0
.end method
