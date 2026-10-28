.class public abstract Lq11/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u000f\u0010\u000c\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lq11/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lq11/d;->i(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq11/d;->m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lq11/d;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq11/d;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lq11/e;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq11/d;->h(Lkotlin/jvm/functions/Function1;Lq11/e;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lq11/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x6be2e32b

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v10, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v6, 0x93

    const/16 v12, 0x92

    const/4 v13, 0x0

    if-eq v11, v12, :cond_8

    const/4 v11, 0x1

    goto :goto_5

    :cond_8
    move v11, v13

    :goto_5
    and-int/lit8 v12, v6, 0x1

    invoke-virtual {v10, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1f

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v11

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lpt2/k;

    const/16 v9, 0x13

    invoke-direct {v7, v9}, Lpt2/k;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v31, v7

    goto :goto_7

    :cond_b
    move-object/from16 v31, v9

    :goto_7
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v15, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v3, 0x3

    int-to-float v3, v3

    const/4 v9, 0x4

    int-to-float v9, v9

    invoke-static {v7, v3, v9}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x0

    invoke-static {v12, v15, v10, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object v12, v5

    move v7, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v10, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v10, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lq11/e;->b()Ljava/lang/String;

    move-result-object v3

    const/16 v5, 0x8

    const/4 v6, 0x6

    if-nez v3, :cond_12

    const v1, -0x76266d96

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object/from16 v32, v0

    move v0, v7

    move-object v3, v11

    move-object/from16 v35, v12

    const/4 v4, 0x1

    goto/16 :goto_b

    :cond_12
    const v3, -0x76266d95

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->W0()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Li91/c;->o(J)Li91/a;

    move-result-object v15

    invoke-static {v3, v15}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v15, 0x2

    int-to-float v6, v15

    int-to-float v15, v5

    mul-float/2addr v6, v15

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v15, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x0

    invoke-static {v6, v15, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move-object v15, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v32, v0

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_13

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lq11/e;->b()Ljava/lang/String;

    move-result-object v5

    const/4 v0, 0x6

    invoke-virtual {v9, v10, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v9, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v1, v11

    const/4 v11, 0x0

    move-object v8, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v18, 0x1

    const/16 v16, 0x0

    const/16 v19, 0x0

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

    move/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move v0, v7

    move-object/from16 v35, v8

    move-wide v7, v3

    move/from16 v4, v33

    move-object v3, v1

    move/from16 v1, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_b
    const v5, -0x2d19c139

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lq11/e;->c()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    move v14, v1

    :goto_c
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_19

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v15, v14, 0x1

    if-ltz v14, :cond_18

    move-object/from16 v16, v5

    check-cast v16, Lq11/i;

    if-nez v14, :cond_17

    invoke-virtual {v2}, Lq11/e;->b()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_16

    goto :goto_d

    :cond_16
    const v5, 0x7680323d    # 1.3000644E33f

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    const/16 v17, 0x6

    const/16 v18, 0x8

    goto :goto_e

    :cond_17
    :goto_d
    const v5, 0x767b80fd

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v7

    invoke-static {v7, v8}, Li91/c;->o(J)Li91/a;

    move-result-object v7

    invoke-static {v3, v7}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v4

    const/16 v9, 0x8

    int-to-float v11, v9

    mul-float/2addr v8, v11

    const/4 v11, 0x0

    const/4 v12, 0x2

    invoke-static {v7, v8, v11, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->W0()J

    move-result-wide v11

    move v8, v6

    move-object v5, v7

    move-wide v6, v11

    const/4 v11, 0x0

    const/16 v12, 0xc

    move/from16 v17, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_e
    and-int/lit16 v9, v0, 0x380

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move v6, v14

    move-object/from16 v5, v16

    move-object/from16 v8, v27

    move-object/from16 v7, v31

    invoke-static/range {v5 .. v10}, Lq11/h;->i(Lq11/i;ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v8

    move v14, v15

    goto :goto_c

    :cond_18
    invoke-static {}, Lwb3/f;->d0()V

    throw v6

    :cond_19
    move-object/from16 v5, v31

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lq11/e;->a()Lny0/p0;

    move-result-object v3

    if-nez v3, :cond_1a

    const v0, 0x7bc78481

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v0, v5

    goto/16 :goto_10

    :cond_1a
    const v3, 0x7bc78482

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lq11/e;->a()Lny0/p0;

    move-result-object v3

    invoke-virtual {v3}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v9, Ly71/g;

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3}, Lih0/d0;->E(Lx81/d;)I

    move-result v3

    const/4 v12, 0x2

    invoke-direct {v9, v3, v6, v12, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v12, v35

    if-ne v3, v12, :cond_1b

    sget-object v3, Lq11/d$a;->w:Lq11/d$a;

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    and-int/lit16 v0, v0, 0x380

    const/16 v3, 0x100

    if-ne v0, v3, :cond_1c

    move v13, v4

    goto :goto_f

    :cond_1c
    move v13, v1

    :goto_f
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1d

    if-ne v3, v12, :cond_1e

    :cond_1d
    new-instance v3, Lq11/c;

    const/4 v0, 0x0

    invoke-direct {v3, v0, v5, v2}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    move-object/from16 v17, v3

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x0

    const/16 v21, 0xfab

    move-object v0, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v27

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object v3, v0

    move-object/from16 v1, v32

    goto :goto_11

    :cond_1f
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v9

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v0, Lot1/f;

    const/16 v6, 0x18

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lq11/e;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lq11/a$a;

    invoke-virtual {p1}, Lq11/e;->a()Lny0/p0;

    move-result-object p1

    invoke-virtual {p1}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Lq11/a$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lq11/d;->f(Landroidx/compose/ui/Modifier;Lq11/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x136088b7

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v1, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1

    new-instance v3, Lq11/e;

    new-instance v4, Lhy0/c2;

    const-string v2, "decreased"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v7, Lhy0/b2;->NEGATIVE_YELLOW:Lhy0/b2;

    sget-object v13, Lgz0/m0;->TINY_TRIANGLE_UP:Lgz0/m0;

    const/16 v20, 0x7fe8

    const/16 v21, 0x0

    const/4 v6, 0x1

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v4 .. v21}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v9

    new-instance v2, Lq11/i;

    const/16 v10, 0x10

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v9, 0x0

    const-string v6, "SLEEP QUALITY"

    const-string v7, "Higher blood pressure may be associated with reduced sleep quality, making it harder to achieve deep, restorative sleep."

    move-object v8, v4

    move-object v4, v2

    invoke-direct/range {v4 .. v11}, Lq11/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v8, Lhy0/c2;

    const-string v2, "increased"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v11, Lhy0/b2;->POSITIVE_YELLOW:Lhy0/b2;

    const/16 v24, 0x7fe8

    const/16 v25, 0x0

    const/4 v10, 0x1

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v8 .. v25}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v14, v11

    new-instance v5, Lq11/i;

    const/16 v11, 0x10

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v10, 0x0

    const-string v7, "SLEEP FRAGMENTATION"

    move-object v9, v8

    const-string v8, "Reduced sleep quality..."

    invoke-direct/range {v5 .. v12}, Lq11/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v19, Lhy0/c2;

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/4 v10, 0x1

    const/4 v12, 0x0

    move-object v11, v14

    const/4 v14, 0x0

    move-object/from16 v8, v19

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v25}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lq11/i;

    const/16 v21, 0x10

    const/16 v22, 0x0

    const/16 v16, 0x0

    const-string v17, "A VERY LONG HEADER, SLEEP ARCHITECTURE"

    const-string v18, "Reduced sleep quality..."

    move-object/from16 v19, v8

    invoke-direct/range {v15 .. v22}, Lq11/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v4, v5, v15}, [Lq11/i;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v7, Lny0/p0;

    const-string v2, "VIEW SOURCES"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    new-instance v9, Lcom/whoop/navigation/e;

    const/4 v13, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x3ffc

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v7 .. v23}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v8, 0x1

    const/4 v9, 0x0

    const/4 v4, 0x0

    const-string v5, "Some research suggests that higher blood pressure may disrupt sleep, which can lead to fragmented rest and poorer recover compared to lower blood pressure. Possible impacts may include:"

    invoke-direct/range {v3 .. v9}, Lq11/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lkotlin/jvm/internal/k0;

    const/16 v4, 0xa

    invoke-direct {v2, v4}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v4, v2}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Lm83/a0;->w:Lm83/a0;

    invoke-static {v5, v4, v2}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    invoke-static {v5, v4, v2}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Lfy1/i;->a:Lfy1/i;

    invoke-static {v4, v5, v2}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v4

    sget-object v5, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v4, v5}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    invoke-virtual {v2, v4}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v4, Lb3/v1;->l:Lp1/u2;

    iget-object v5, v2, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v4, v2, v5}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v2

    new-array v2, v2, [Lp1/u1;

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Lp1/u1;

    new-instance v4, Lq11/d$b;

    invoke-direct {v4, v3}, Lq11/d$b;-><init>(Lq11/e;)V

    const v3, -0x124c2861

    invoke-static {v3, v1, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v2, v3, v1, v4}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lm22/t;

    const/16 v3, 0x15

    invoke-direct {v2, v0, v3}, Lm22/t;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq11/d;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/runtime/Composer;I)V
    .locals 10

    check-cast p0, Lp1/q;

    const v0, -0x5a9cf157

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

    new-instance v0, Lq11/e;

    new-instance v1, Lq11/i;

    const/16 v7, 0x10

    const/4 v8, 0x0

    const-string v2, "no_header_row_1"

    const-string v3, "No Header Row 1"

    const-string v4, "Description for row 1."

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Lq11/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lq11/i;

    const/16 v8, 0x10

    const/4 v9, 0x0

    const-string v3, "no_header_row_2"

    const-string v4, "No Header Row 2"

    const-string v5, "Description for row 2."

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v9}, Lq11/i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v2}, [Lq11/i;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v2, "test_list_no_header"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1, v3}, Lq11/e;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;)V

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/16 v2, 0xa

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v2, v1}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lm83/a0;->w:Lm83/a0;

    invoke-static {v3, v2, v1}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    invoke-static {v3, v2, v1}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Lfy1/i;->a:Lfy1/i;

    invoke-static {v2, v3, v1}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v2

    sget-object v3, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v2, v3}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v2, Lb3/v1;->l:Lp1/u2;

    iget-object v3, v1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v2, v1, v3}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v1

    new-array v1, v1, [Lp1/u1;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Lp1/u1;

    new-instance v2, Lq11/d$c;

    invoke-direct {v2, v0}, Lq11/d$c;-><init>(Lq11/e;)V

    const v0, -0x124c2861

    invoke-static {v0, p0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0x38

    invoke-static {v1, v0, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0x16

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final m(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lq11/d;->l(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
