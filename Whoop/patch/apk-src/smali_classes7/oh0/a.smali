.class public abstract Loh0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Loh0/c;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Loh0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Loh0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Loh0/a;->c(Loh0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Loh0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, 0x508c6408

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v15, 0x1

    if-eq v4, v5, :cond_5

    move v4, v15

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/2addr v0, v15

    invoke-virtual {v12, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_14

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v2, v0

    goto :goto_5

    :cond_6
    move-object v2, v3

    :goto_5
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_7

    sget-object v3, Lpl0/f;->c:Lpl0/f$a;

    invoke-virtual {v3}, Lpl0/f$a;->a()Ll83/k;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v3, Ll83/k;

    iget-object v4, v3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Liz0/m;

    iget-object v3, v3, Ll83/k;->x:Ljava/lang/Object;

    check-cast v3, Lzk0/i0;

    invoke-static {}, Liz0/i;->c()Lp1/t1;

    move-result-object v7

    invoke-virtual {v12, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Liz0/m;

    if-nez v7, :cond_8

    move-object v8, v4

    goto :goto_6

    :cond_8
    move-object v8, v7

    :goto_6
    invoke-static {}, Lzk0/h0;->c()Lp1/t1;

    move-result-object v4

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lzk0/i0;

    if-nez v4, :cond_9

    move-object/from16 v16, v3

    goto :goto_7

    :cond_9
    move-object/from16 v16, v4

    :goto_7
    invoke-virtual {v1}, Loh0/c;->e()Z

    move-result v3

    if-eqz v3, :cond_a

    const v35, 0x3dfff

    const/16 v36, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-static/range {v16 .. v36}, Lzk0/i0;->b(Lzk0/i0;FFFFFFFZFFFFFFFFFFILjava/lang/Object;)Lzk0/i0;

    move-result-object v16

    :cond_a
    move-object/from16 v9, v16

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v7, v15

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v7, v10

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v10, Lb2/e;->J:Lb2/l;

    const/4 v11, 0x6

    invoke-static {v7, v10, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    move/from16 p2, v5

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 p1, v8

    move-object v4, v9

    float-to-double v8, v3

    const-wide/16 v17, 0x0

    cmpl-double v6, v8, v17

    if-lez v6, :cond_e

    goto :goto_9

    :cond_e
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v6, v3, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v1}, Loh0/c;->a()Li2/t;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-static {v0, v3}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-nez v3, :cond_f

    goto :goto_a

    :cond_f
    move-object v0, v3

    :cond_10
    :goto_a
    invoke-interface {v6, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v12, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v6, v12, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v12, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v2

    invoke-virtual {v1}, Loh0/c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Loh0/c;->c()Z

    move-result v10

    sget v3, Liz0/m;->p:I

    shl-int/lit8 v13, v3, 0x12

    const/16 v14, 0x23e

    const/4 v3, 0x0

    move-object v9, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, p1

    invoke-static/range {v2 .. v14}, Lsl0/l2;->u(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lbf3/b;ZZZLiz0/m;Lzk0/i0;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    move-object v3, v0

    goto :goto_c

    :cond_14
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_15

    new-instance v0, Lno0/y0;

    const/4 v5, 0x5

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final c(Loh0/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Loh0/a;->b(Loh0/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
