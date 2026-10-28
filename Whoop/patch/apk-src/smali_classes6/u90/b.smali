.class public abstract Lu90/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lu90/c;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lu90/b;->e(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lu90/b;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu90/c;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x2f74b3f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v4, p5, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v9, v11, :cond_8

    move v9, v13

    goto :goto_6

    :cond_8
    move v9, v14

    :goto_6
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_9

    move-object v5, v15

    :cond_9
    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v4, v7, :cond_a

    new-instance v4, Lu71/c;

    const/4 v7, 0x5

    invoke-direct {v4, v7}, Lu71/c;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v4, v8

    :goto_7
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v2, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v17, v2, v7

    const/16 v2, 0xd

    int-to-float v2, v2

    mul-float v20, v2, v7

    const/16 v21, 0x2

    const/16 v18, 0x0

    move/from16 v19, v17

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v10, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v9, 0xe

    invoke-static {v2, v8, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Ll0/m;->d:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v11, 0x6

    invoke-static {v8, v9, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_c

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    :cond_d
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x19

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move v8, v7

    invoke-virtual {v6}, Lu90/c;->a()Lkd1/o;

    move-result-object v7

    sget v11, Lkd1/o;->a:I

    const/4 v12, 0x3

    move v9, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move/from16 v17, v13

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object v8, v15

    const/16 v15, 0x61b0

    const/16 v16, 0x68

    move-object v9, v8

    const/4 v8, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move v12, v14

    move-object v14, v11

    sget-object v11, Ly2/j;->b:Ly2/b1;

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v19, v9

    move-object v9, v2

    move-object/from16 v2, v19

    move/from16 v19, v0

    const/4 v0, 0x1

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    mul-float v3, v3, v17

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v7, 0x20b888dd

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lu90/c;->b()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    const/4 v15, 0x0

    :goto_9
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    add-int/lit8 v16, v15, 0x1

    if-ltz v15, :cond_10

    check-cast v7, Lm91/u;

    invoke-static {}, Lg80/b;->c()Lm91/p;

    move-result-object v8

    sget v9, Lm91/p;->b:I

    shl-int/lit8 v9, v9, 0x3

    shl-int/lit8 v11, v19, 0x3

    and-int/lit16 v11, v11, 0x1c00

    or-int v12, v9, v11

    const/4 v13, 0x4

    const/4 v9, 0x0

    move-object v11, v10

    move-object v10, v4

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    invoke-virtual {v6}, Lu90/c;->b()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v7

    if-eq v15, v7, :cond_f

    const v7, -0x40edc3cc

    invoke-static {v10, v7, v2, v3, v10}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    const/4 v12, 0x0

    :goto_a
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_f
    const/4 v12, 0x0

    const v7, 0x2335fabd

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    goto :goto_a

    :goto_b
    move/from16 v15, v16

    goto :goto_9

    :cond_10
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_11
    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v22, v5

    move-object v5, v4

    move-object/from16 v4, v22

    goto :goto_c

    :cond_12
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v5

    move-object v5, v8

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lt01/e;

    const/16 v3, 0xf

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lu90/b;->c(Lu90/c;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
