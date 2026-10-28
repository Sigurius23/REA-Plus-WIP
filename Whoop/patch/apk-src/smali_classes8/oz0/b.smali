.class public abstract Loz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Loz0/c;",
        "suggestionBubbleViewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Loz0/b;->g(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lq2/a;Lkotlin/jvm/functions/Function1;Loz0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Loz0/b;->f(Lq2/a;Lkotlin/jvm/functions/Function1;Loz0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Loz0/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Loz0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "suggestionBubbleViewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, 0x3139daa8

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v3, 0x2

    const/4 v5, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v5

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v8, v4, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v8, v9

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, p5, 0x4

    const/16 v10, 0x100

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    move v12, v10

    goto :goto_3

    :cond_7
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v7, v12

    :goto_4
    and-int/lit16 v12, v7, 0x93

    const/16 v13, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_8

    move v12, v15

    goto :goto_5

    :cond_8
    move v12, v14

    :goto_5
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_13

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object/from16 v1, v16

    goto :goto_6

    :cond_9
    move-object v1, v6

    :goto_6
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_a

    new-instance v8, Lov2/f;

    const/16 v11, 0xc

    invoke-direct {v8, v11}, Lov2/f;-><init>(I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v8, v11

    :goto_7
    sget-object v11, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v0, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lq2/a;

    invoke-virtual {v0, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    and-int/lit16 v13, v7, 0x380

    if-ne v13, v10, :cond_c

    move v10, v15

    goto :goto_8

    :cond_c
    move v10, v14

    :goto_8
    or-int/2addr v10, v12

    and-int/lit8 v7, v7, 0x70

    if-ne v7, v9, :cond_d

    move v7, v15

    goto :goto_9

    :cond_d
    move v7, v14

    :goto_9
    or-int/2addr v7, v10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_e

    if-ne v9, v6, :cond_f

    :cond_e
    new-instance v9, Ln0/j;

    const/16 v6, 0xe

    invoke-direct {v9, v11, v8, v2, v6}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v20, v9

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v16

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, Li2/t;->b:Li2/s;

    const v9, 0x268b62ff

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v9

    new-instance v11, Li2/x;

    invoke-direct {v11, v9, v10}, Li2/x;-><init>(J)V

    const v9, 0x2650d5ff

    invoke-static {v9}, Li2/w0;->c(I)J

    move-result-wide v9

    new-instance v12, Li2/x;

    invoke-direct {v12, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v11, v12}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v22, 0x16

    const/16 v23, 0x0

    const/16 v19, 0x0

    const v20, 0x439d8000    # 315.0f

    const/16 v21, 0x0

    invoke-static/range {v16 .. v23}, Lgb1/u;->b(Li2/s;Ljava/util/List;Ljava/util/List;IFZILjava/lang/Object;)Li2/t;

    move-result-object v9

    int-to-float v3, v3

    int-to-float v10, v5

    mul-float/2addr v3, v10

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    const/4 v10, 0x0

    invoke-static {v6, v9, v3, v10, v5}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_10

    invoke-virtual {v0, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_12

    :cond_11
    invoke-static {v6, v0, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Loz0/c;->a()Ljava/lang/String;

    move-result-object v5

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v9

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    int-to-float v9, v15

    mul-float/2addr v9, v6

    invoke-static {v7, v3, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v3, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object v11, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    move-object v3, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    const/16 v28, 0x30

    move/from16 v31, v27

    move-object/from16 v27, v0

    move/from16 v0, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v6

    move-object v3, v11

    :goto_b
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lot1/f;

    const/4 v6, 0x6

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lq2/a;Lkotlin/jvm/functions/Function1;Loz0/c;)Ll83/a0;
    .locals 1

    const/16 v0, 0x9

    invoke-interface {p0, v0}, Lq2/a;->a(I)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Loz0/b;->d(Landroidx/compose/ui/Modifier;Loz0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
