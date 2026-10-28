.class public abstract Lr90/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lr90/j;",
        "term",
        "",
        "analyticsName",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "showDetailDialog",
        "h",
        "(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr90/c;->k(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lr90/c;->o(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lr90/j;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lr90/c;->m(Lr90/j;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr90/c;->n(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lr90/j;Lkotlin/jvm/functions/Function1;Lb3/b3;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr90/c;->l(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lr90/j;Lkotlin/jvm/functions/Function1;Lb3/b3;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lr90/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lr90/c;->i(Lr90/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr90/c;->j(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr90/j;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p5

    const-string v0, "term"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsName"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "showDetailDialog"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x348f8460    # -1.5760288E7f

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v7, 0x2

    const/4 v8, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v8

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v5, v6, 0x30

    const/16 v9, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v9

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v6, 0x180

    const/16 v10, 0x100

    if-nez v5, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    move v5, v10

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v6, 0xc00

    const/16 v11, 0x800

    if-nez v5, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    move v5, v11

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v0, 0x493

    const/16 v13, 0x492

    if-eq v5, v13, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    const/4 v5, 0x0

    :goto_5
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v12, v13, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_3d

    sget-object v5, Lb3/v1;->r:Lp1/u2;

    invoke-virtual {v12, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v13, v5

    check-cast v13, Lb3/b3;

    and-int/lit8 v5, v0, 0xe

    if-ne v5, v8, :cond_9

    const/16 v16, 0x1

    goto :goto_6

    :cond_9
    const/16 v16, 0x0

    :goto_6
    move-object/from16 p4, v13

    and-int/lit16 v13, v0, 0x380

    if-ne v13, v10, :cond_a

    const/16 v17, 0x1

    goto :goto_7

    :cond_a
    const/16 v17, 0x0

    :goto_7
    or-int v16, v16, v17

    move/from16 v17, v13

    and-int/lit16 v13, v0, 0x1c00

    if-ne v13, v11, :cond_b

    const/16 v18, 0x1

    goto :goto_8

    :cond_b
    const/16 v18, 0x0

    :goto_8
    or-int v16, v16, v18

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v9, :cond_c

    const/16 v18, 0x1

    goto :goto_9

    :cond_c
    const/16 v18, 0x0

    :goto_9
    or-int v16, v16, v18

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v19, v13

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v16, :cond_d

    if-ne v9, v13, :cond_e

    :cond_d
    move v9, v0

    goto :goto_a

    :cond_e
    move/from16 v33, v0

    move-object v0, v9

    move v9, v5

    goto :goto_b

    :goto_a
    new-instance v0, Ljp2/l;

    move/from16 v16, v5

    const/16 v5, 0x1c

    move-object/from16 v33, v4

    move-object v4, v2

    move-object v2, v3

    move-object/from16 v3, v33

    move/from16 v33, v9

    move/from16 v9, v16

    invoke-direct/range {v0 .. v5}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v0, Lkotlin/jvm/functions/Function1;

    int-to-float v2, v7

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v4, v5, v12, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v21, La3/l;->a:La3/k;

    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    move/from16 v31, v2

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    move/from16 v21, v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    goto :goto_d

    :cond_10
    move/from16 v21, v3

    :goto_d
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x1

    int-to-float v8, v3

    mul-float v22, v8, v21

    const/16 v25, 0x0

    const/16 v26, 0xc

    const/16 v24, 0x0

    move/from16 v23, v22

    move-object/from16 v21, v15

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v8, v21

    move/from16 v34, v22

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v10

    const/4 v15, 0x6

    invoke-static {v10, v5, v12, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move v15, v9

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_12

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v12, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v9, v12, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    const/16 v10, 0x36

    invoke-static {v9, v5, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    move-object/from16 v21, v11

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-eqz v6, :cond_15

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v12, Lp1/q;->S:Z

    if-nez v6, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    :cond_16
    move-object/from16 v6, v21

    goto :goto_10

    :cond_17
    move-object/from16 v6, v21

    goto :goto_11

    :goto_10
    invoke-static {v10, v12, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_11
    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x41200000    # 10.0f

    sget-object v9, Ll0/t1;->a:Ll0/t1;

    const/4 v10, 0x1

    invoke-virtual {v9, v8, v10, v3}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v35

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    const/4 v11, 0x4

    if-ne v15, v11, :cond_18

    move v11, v10

    goto :goto_12

    :cond_18
    const/4 v11, 0x0

    :goto_12
    or-int/2addr v3, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_19

    if-ne v11, v13, :cond_1a

    :cond_19
    new-instance v11, Lr90/a;

    const/4 v3, 0x0

    invoke-direct {v11, v0, v1, v3}, Lr90/a;-><init>(Lkotlin/jvm/functions/Function1;Lr90/j;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v39, v11

    check-cast v39, Lc93/a;

    const/16 v40, 0xf

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    invoke-static/range {v35 .. v40}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static/range {v31 .. v31}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v10, 0x36

    invoke-static {v11, v5, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-eqz v1, :cond_1b

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v12, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    invoke-static {v10, v12, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x7

    int-to-float v1, v1

    const/4 v11, 0x4

    int-to-float v3, v11

    mul-float/2addr v1, v3

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v29, v12

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v11

    invoke-static {v5, v10, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    move-object/from16 v12, v29

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->y()J

    move-result-wide v23

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->y()J

    move-result-wide v25

    invoke-virtual {v10, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->w()J

    move-result-wide v31

    const/16 v21, 0x100

    const/16 v16, 0x0

    move/from16 v29, v17

    const/16 v17, 0x18

    move-object/from16 v36, v13

    move-object/from16 v35, v14

    const-wide/16 v13, 0x0

    move-object/from16 v37, v2

    move-object/from16 v18, v5

    move-object/from16 v46, v6

    move-object/from16 v44, v7

    move-object v2, v9

    move-object/from16 v47, v10

    move/from16 v48, v11

    move/from16 v41, v15

    move/from16 v43, v19

    move-wide/from16 v9, v23

    move/from16 v42, v29

    move-object/from16 v45, v35

    move-object/from16 v6, v36

    move-object/from16 v5, p4

    move/from16 p4, v1

    move-object v1, v8

    move-object v15, v12

    move-wide/from16 v7, v25

    move-wide/from16 v11, v31

    invoke-static/range {v7 .. v17}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v11

    move-object v12, v15

    invoke-virtual/range {p0 .. p0}, Lr90/j;->k()Z

    move-result v7

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1e

    if-ne v9, v6, :cond_1f

    :cond_1e
    new-instance v9, Lp90/h;

    const/16 v8, 0x14

    invoke-direct {v9, v0, v8}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    move-object v8, v9

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    const/16 v14, 0x18

    const/4 v10, 0x0

    move-object/from16 v9, v18

    invoke-static/range {v7 .. v14}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lr90/j;->j()Ljava/lang/String;

    move-result-object v38

    const/high16 v0, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-virtual {v2, v1, v10, v0}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v39

    sget-object v7, Liz0/l;->a:Liz0/l;

    move-object/from16 v0, v47

    move/from16 v8, v48

    invoke-virtual {v0, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v0, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v0, v12, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v13

    sget v11, Liz0/l;->b:I

    shl-int/lit8 v31, v11, 0xf

    const/16 v32, 0x7fd9

    const/4 v8, 0x0

    move-object/from16 v29, v12

    move-wide v11, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move/from16 v51, v48

    invoke-virtual/range {v7 .. v32}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v10

    move-object/from16 v19, v7

    move-object/from16 v12, v29

    move/from16 v7, v42

    const/16 v8, 0x100

    if-ne v7, v8, :cond_20

    const/4 v14, 0x1

    :goto_14
    move/from16 v9, v33

    const/16 v11, 0x20

    goto :goto_15

    :cond_20
    const/4 v14, 0x0

    goto :goto_14

    :goto_15
    if-ne v9, v11, :cond_21

    const/4 v13, 0x1

    goto :goto_16

    :cond_21
    const/4 v13, 0x0

    :goto_16
    or-int/2addr v13, v14

    move/from16 v14, v41

    const/4 v15, 0x4

    if-ne v14, v15, :cond_22

    const/16 v16, 0x1

    goto :goto_17

    :cond_22
    const/16 v16, 0x0

    :goto_17
    or-int v13, v13, v16

    move/from16 v8, v43

    const/16 v11, 0x800

    if-ne v8, v11, :cond_23

    const/4 v8, 0x1

    goto :goto_18

    :cond_23
    const/4 v8, 0x0

    :goto_18
    or-int/2addr v8, v13

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v8, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_24

    if-ne v11, v6, :cond_25

    :cond_24
    move-object/from16 v47, v0

    goto :goto_19

    :cond_25
    move-object/from16 v47, v0

    move-object/from16 v21, v1

    move-object v13, v2

    move/from16 v20, v3

    move-object v8, v4

    move-object v0, v11

    move/from16 v28, v15

    move-object/from16 v3, p2

    move/from16 v11, p4

    goto :goto_1a

    :goto_19
    new-instance v0, Lpp2/d;

    move/from16 v11, p4

    move-object/from16 v21, v1

    move-object v13, v2

    move/from16 v20, v3

    move-object v8, v4

    move/from16 v28, v15

    move-object/from16 v3, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lpp2/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lr90/j;Lkotlin/jvm/functions/Function1;Lb3/b3;)V

    move-object v3, v1

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    sget v4, Liz0/m;->p:I

    shl-int/lit8 v4, v4, 0x9

    const/high16 v5, 0x6000000

    or-int v17, v4, v5

    const/16 v49, 0x20

    const/16 v18, 0xe4

    move/from16 v33, v9

    const/4 v9, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    move-object v5, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v41, v15

    const/4 v15, 0x1

    move/from16 p4, v4

    move-object v2, v5

    move v5, v7

    move-object/from16 v52, v8

    move/from16 v54, v11

    move-object/from16 v1, v21

    move-object/from16 v16, v29

    move/from16 v4, v33

    move-object/from16 v53, v37

    move-object/from16 v7, v38

    move-object/from16 v8, v39

    move-object v11, v0

    move/from16 v0, v41

    invoke-static/range {v7 .. v18}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    const/4 v10, 0x1

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lr90/j;->f()Lcom/whoop/activation/domain/models/steps/TermExpansion;

    move-result-object v7

    sget-object v15, Lcom/whoop/activation/domain/models/steps/TermExpansion;->INLINE:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    if-ne v7, v15, :cond_2d

    const v7, -0x672dc2fa

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    sget-object v56, Lny0/q$c;->f:Lny0/q$c;

    invoke-virtual/range {p0 .. p0}, Lr90/j;->l()Z

    move-result v7

    if-nez v7, :cond_26

    invoke-virtual/range {v47 .. v47}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/a;->a()I

    move-result v7

    :goto_1b
    move/from16 v57, v7

    goto :goto_1c

    :cond_26
    invoke-virtual/range {v47 .. v47}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/a;->m()I

    move-result v7

    goto :goto_1b

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_27

    sget-object v7, Lr90/c$a;->w:Lr90/c$a;

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v58

    new-instance v55, Lny0/o;

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x3f8

    const/16 v67, 0x0

    invoke-direct/range {v55 .. v67}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/high16 v7, 0x3f800000    # 1.0f

    const/4 v10, 0x1

    invoke-virtual {v2, v1, v10, v7}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v7, Lx60/b;->w:I

    const/4 v8, 0x0

    invoke-static {v7, v12, v8}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v11, 0x4

    if-ne v0, v11, :cond_28

    const/4 v14, 0x1

    :goto_1d
    const/16 v9, 0x100

    goto :goto_1e

    :cond_28
    move v14, v8

    goto :goto_1d

    :goto_1e
    if-ne v5, v9, :cond_29

    const/4 v9, 0x1

    goto :goto_1f

    :cond_29
    move v9, v8

    :goto_1f
    or-int/2addr v9, v14

    const/16 v11, 0x20

    if-ne v4, v11, :cond_2a

    const/4 v14, 0x1

    goto :goto_20

    :cond_2a
    move v14, v8

    :goto_20
    or-int v4, v9, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_2c

    if-ne v9, v6, :cond_2b

    goto :goto_21

    :cond_2b
    move-object/from16 v10, p0

    move-object v11, v2

    move-object/from16 v2, p1

    goto :goto_22

    :cond_2c
    :goto_21
    new-instance v9, Ln0/j;

    const/16 v4, 0x1b

    move-object/from16 v10, p0

    move-object v11, v2

    move-object/from16 v2, p1

    invoke-direct {v9, v10, v3, v2, v4}, Ln0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    check-cast v9, Lc93/a;

    sget v13, Lny0/o;->k:I

    const/4 v14, 0x4

    move-object v10, v11

    move-object v11, v9

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object/from16 v16, v15

    move v15, v8

    move-object v8, v7

    move-object/from16 v7, v55

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_23
    const/4 v10, 0x1

    goto :goto_24

    :cond_2d
    move-object/from16 v4, p0

    move-object/from16 v2, p1

    move-object/from16 v16, v15

    const/4 v15, 0x0

    const v7, -0x6711a0ce

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_24
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lr90/j;->l()Z

    move-result v7

    if-eqz v7, :cond_3b

    const v7, 0x64cb39d0    # 2.999084E22f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lr90/j;->e()Lr90/i;

    move-result-object v7

    invoke-virtual {v7}, Lr90/i;->b()Lo70/b;

    move-result-object v7

    sget-object v8, Lo70/b$c;->a:Lo70/b$c;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_31

    const v0, 0x64cbf4e7

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/e;->E:Lb2/m;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x19

    int-to-float v6, v6

    mul-float v6, v6, v20

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_2e

    move-object/from16 v8, v44

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_25
    move-object/from16 v9, v45

    goto :goto_26

    :cond_2e
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_25

    :goto_26
    invoke-static {v12, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v52

    invoke-static {v12, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_2f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_30

    :cond_2f
    move-object/from16 v11, v46

    goto :goto_28

    :cond_30
    :goto_27
    move-object/from16 v13, v53

    goto :goto_29

    :goto_28
    invoke-static {v6, v12, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_27

    :goto_29
    invoke-static {v12, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v11, v54

    invoke-static {v11, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v0, Lgy0/e;->d:I

    invoke-static {v0}, Lv41/r0$d;->b(I)I

    move-result v0

    invoke-static {v0}, Lv41/r0$d;->a(I)Lv41/r0$d;

    move-result-object v8

    const/16 v17, 0xc06

    const/16 v18, 0x1f4

    const/4 v9, 0x0

    const/high16 v10, 0x40000000    # 2.0f

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v27, v15

    const/4 v15, 0x0

    move-object/from16 v0, v16

    move/from16 v1, v27

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    const/4 v10, 0x1

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v68, v0

    move-object/from16 v5, v47

    move/from16 v2, v51

    goto/16 :goto_2e

    :cond_31
    move v14, v15

    move-object/from16 v8, v44

    move-object/from16 v9, v45

    move-object/from16 v11, v46

    move-object/from16 v10, v52

    move-object/from16 v13, v53

    sget-object v15, Lo70/b$a;->a:Lo70/b$a;

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_39

    const v7, 0x64d5cace

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static/range {v34 .. v34}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v15, Lb2/e;->N:Lb2/k;

    const/16 v14, 0x36

    invoke-static {v7, v15, v12, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v12, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-eqz v2, :cond_32

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2a

    :cond_32
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_2a
    invoke-static {v12, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_33

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_34

    :cond_33
    invoke-static {v14, v12, v14, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_34
    invoke-static {v12, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lx60/b;->u:I

    const/4 v14, 0x0

    invoke-static {v1, v12, v14}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, v47

    move/from16 v2, v51

    invoke-virtual {v1, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b()J

    move-result-wide v9

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v31, v8, 0x12

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v50, v15

    const/4 v15, 0x0

    move-object/from16 v18, v16

    const-wide/16 v16, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v22, v20

    const-wide/16 v20, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move-object/from16 v26, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v30, v28

    const/16 v28, 0x0

    move-object/from16 v33, v30

    const/16 v30, 0x0

    move-object/from16 v68, v33

    move/from16 v1, v50

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    sget-object v8, Lny0/v;->TextSmall:Lny0/v;

    sget v7, Lx60/b;->W:I

    invoke-static {v7, v12, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    const/16 v7, 0x100

    if-ne v5, v7, :cond_35

    const/4 v14, 0x1

    :goto_2b
    const/4 v11, 0x4

    goto :goto_2c

    :cond_35
    move v14, v1

    goto :goto_2b

    :goto_2c
    if-ne v0, v11, :cond_36

    const/4 v0, 0x1

    goto :goto_2d

    :cond_36
    move v0, v1

    :goto_2d
    or-int/2addr v0, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_37

    if-ne v5, v6, :cond_38

    :cond_37
    new-instance v5, Lr90/a;

    const/4 v0, 0x1

    invoke-direct {v5, v3, v4, v0}, Lr90/a;-><init>(Lkotlin/jvm/functions/Function1;Lr90/j;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    move-object v15, v5

    check-cast v15, Lc93/a;

    const/16 v17, 0x30

    const/16 v18, 0x79

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    const/4 v10, 0x1

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v5, v47

    goto :goto_2e

    :cond_39
    move v1, v14

    move-object/from16 v68, v16

    move/from16 v2, v51

    instance-of v0, v7, Lo70/b$b;

    if-eqz v0, :cond_3a

    const v0, 0x7f204f67

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lr90/j;->e()Lr90/i;

    move-result-object v0

    invoke-virtual {v0}, Lr90/i;->a()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, v47

    invoke-virtual {v5, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v16

    invoke-virtual {v5, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v5, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v30, 0x0

    const/16 v32, 0x7fd9

    const/4 v8, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    move-object/from16 v29, v12

    move-wide v11, v6

    move-object/from16 v7, v19

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-virtual/range {v7 .. v32}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v10

    move-object/from16 v12, v29

    const/4 v15, 0x0

    const/16 v18, 0x1f6

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v17, p4

    move-object v7, v0

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_2e
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_2f
    const/4 v10, 0x1

    goto :goto_30

    :cond_3a
    const v0, 0x7f1f5472

    invoke-static {v0, v12, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_3b
    move v1, v15

    move-object/from16 v68, v16

    move-object/from16 v5, v47

    move/from16 v2, v51

    const v0, 0x64ef8a2e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_2f

    :goto_30
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v4}, Lr90/j;->f()Lcom/whoop/activation/domain/models/steps/TermExpansion;

    move-result-object v0

    move-object/from16 v6, v68

    if-ne v0, v6, :cond_3c

    const v0, -0x35ad82ea

    invoke-static {v12, v0, v5, v12, v2}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v8

    const/4 v13, 0x0

    const/16 v14, 0xd

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_31
    const/4 v10, 0x1

    goto :goto_32

    :cond_3c
    const v0, -0x35ac8b28    # -3464502.0f

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_31

    :goto_32
    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_33

    :cond_3d
    move-object v4, v1

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_33
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3e

    new-instance v0, Lr90/b;

    const/4 v6, 0x0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move-object v1, v4

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v6}, Lr90/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_3e
    return-void
.end method

.method private static final i(Lr90/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Z)Ll83/a0;
    .locals 9

    if-eqz p4, :cond_0

    invoke-virtual {p0}, Lr90/j;->m()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lr90/j;->f()Lcom/whoop/activation/domain/models/steps/TermExpansion;

    move-result-object v0

    sget-object v1, Lcom/whoop/activation/domain/models/steps/TermExpansion;->INLINE:Lcom/whoop/activation/domain/models/steps/TermExpansion;

    if-eq v0, v1, :cond_0

    new-instance p3, Lj80/d$c;

    invoke-virtual {p0}, Lr90/j;->h()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lr90/j;->g()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, p4, v0}, Lj80/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lr90/j;->h()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lh80/b$i;

    invoke-virtual {p0}, Lr90/j;->d()Ljava/lang/String;

    move-result-object p2

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    const-string v2, "toLowerCase(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ll83/k;

    const-string v4, "consent"

    invoke-direct {v3, v4, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr90/j;->i()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p2, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ll83/k;

    const-string v2, "country"

    invoke-direct {v1, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    new-instance p4, Ll83/k;

    const-string v2, "accepted_terms"

    invoke-direct {p4, v2, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v1, p4}, [Ll83/k;

    move-result-object p2

    invoke-static {p2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "check_box"

    const-string v4, "select_one"

    const-string v5, "permissions"

    move-object v1, p3

    invoke-direct/range {v0 .. v8}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lj80/d$a;

    invoke-virtual {p0}, Lr90/j;->h()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lj80/d$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lr90/j;->k()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lr90/j;Lkotlin/jvm/functions/Function1;Lb3/b3;Ljava/lang/String;)Ll83/a0;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p5

    const-string v2, "text"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "#"

    const/4 v3, 0x0

    invoke-static {v1, v2, v3}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v2

    const-string v3, "accepted_terms"

    const-string v4, "country"

    const-string v5, "consent"

    const-string v6, "toLowerCase(...)"

    if-eqz v2, :cond_0

    new-instance v7, Lh80/b$i;

    invoke-virtual/range {p2 .. p2}, Lr90/j;->d()Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v5, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lr90/j;->i()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v4, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lr90/j;->k()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v8, v2, v4}, [Ll83/k;

    move-result-object v1

    invoke-static {v1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/4 v9, 0x0

    const-string v10, "check_box"

    const-string v11, "open_detail"

    const-string v12, "permissions"

    move-object/from16 v8, p1

    invoke-direct/range {v7 .. v15}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v7}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lj80/d$c;

    invoke-virtual/range {p2 .. p2}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lr90/j;->g()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lj80/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p2 .. p2}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v1, p3

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v2, Lh80/b$i;

    invoke-virtual/range {p2 .. p2}, Lr90/j;->d()Ljava/lang/String;

    move-result-object v7

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v9, Ll83/k;

    invoke-direct {v9, v5, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lr90/j;->i()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, v8}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lr90/j;->k()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    new-instance v5, Ll83/k;

    invoke-direct {v5, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v9, v6, v5}, [Ll83/k;

    move-result-object v3

    invoke-static {v3}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v8

    const/4 v9, 0x2

    const/4 v10, 0x0

    const/4 v4, 0x0

    const-string v5, "check_box"

    const-string v6, "open_detail"

    const-string v7, "permissions"

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v10}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v0, p4

    check-cast v0, Lb3/e1;

    invoke-virtual {v0, v1}, Lb3/e1;->a(Ljava/lang/String;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lr90/j;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 10

    invoke-virtual {p0}, Lr90/j;->l()Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v1, Lh80/b$i;

    invoke-virtual {p0}, Lr90/j;->d()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toLowerCase(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ll83/k;

    const-string v5, "consent"

    invoke-direct {v4, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr90/j;->i()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ll83/k;

    const-string v3, "country"

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lr90/j;->k()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v3, Ll83/k;

    const-string v5, "accepted_terms"

    invoke-direct {v3, v5, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v3, 0x0

    const-string v4, "check_box"

    const-string v5, "toggle_expand"

    const-string v6, "permissions"

    move-object v2, p2

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p2, Lj80/d$c;

    invoke-virtual {p0}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lr90/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p2, v0, v1}, Lj80/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p2, Lj80/d$d;

    invoke-virtual {p0}, Lr90/j;->h()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p2, p0}, Lj80/d$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lr90/j;)Ll83/a0;
    .locals 2

    new-instance v0, Lj80/d$c;

    invoke-virtual {p1}, Lr90/j;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lr90/j;->g()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lj80/d$c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lr90/c;->h(Lr90/j;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
