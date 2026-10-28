.class public abstract Lpa2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aK\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u001c\u0008\u0002\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00050\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Loa2/d;",
        "viewState",
        "Lkotlin/Function2;",
        "Lcom/whoop/navigation/e;",
        "",
        "Ll83/a0;",
        "onClick",
        "Lkotlin/Function1;",
        "Loa2/c;",
        "onViewEvent",
        "g",
        "(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "settings_release"
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
.method public static synthetic a(Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpa2/a;->h(Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Loa2/a;Lc93/m;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lpa2/a;->l(Loa2/a;Lc93/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Loa2/b;Lc93/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpa2/a;->k(Loa2/b;Lc93/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Loa2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpa2/a;->i(Loa2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpa2/a;->m(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Loa2/a;Lc93/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpa2/a;->j(Loa2/a;Lc93/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loa2/d;",
            "Lc93/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x1350796f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p4, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p4

    :goto_2
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p4, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v15, 0x12

    const/4 v8, 0x0

    if-eq v4, v15, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v8

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_26

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    new-instance v2, Lp0/w0;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lp0/w0;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    new-instance v3, Lp6/h1;

    const/16 v5, 0xa

    invoke-direct {v3, v5}, Lp6/h1;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object/from16 v28, v3

    goto :goto_7

    :cond_a
    move-object/from16 v28, p2

    :goto_7
    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v18, v15

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v12, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    :cond_c
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v11, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Loa2/d;->a()Loa2/a;

    move-result-object v12

    if-nez v12, :cond_e

    const v0, 0x23ec424

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object/from16 v19, v2

    move-object v5, v11

    const/4 v0, 0x1

    goto/16 :goto_19

    :cond_e
    const v6, 0x23ec425

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    move-object/from16 p1, v12

    const/16 v12, 0x30

    invoke-static {v9, v6, v11, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v29, v0

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-eqz v0, :cond_f

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v11, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v11, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->K:Lb2/l;

    const-wide/high16 v0, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    const/16 v9, 0x36

    invoke-static {v0, v1, v8, v11, v9}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v0

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_12

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v11, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v2

    invoke-virtual/range {p1 .. p1}, Loa2/a;->b()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_15

    const v2, -0x6c8b923

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    move-object v8, v11

    move-object v11, v5

    move-object v5, v8

    move-object/from16 v19, v0

    move-object/from16 v22, v4

    move v0, v6

    move-object/from16 v30, v7

    const/4 v12, 0x1

    const/16 v26, 0x2

    const/16 v27, 0x4

    :goto_b
    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    goto/16 :goto_d

    :cond_15
    const/4 v6, 0x0

    const v12, -0x6c8b922

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    move-object/from16 v22, v4

    sget v4, Lx81/d;->b:I

    invoke-virtual {v12, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v23

    invoke-virtual/range {v23 .. v23}, Ly81/i;->y()J

    move-result-wide v8

    move/from16 v23, v4

    const/4 v4, 0x2

    int-to-float v6, v4

    move-object/from16 v19, v0

    const/4 v4, 0x4

    int-to-float v0, v4

    invoke-static {v6, v0, v13, v8, v9}, Ldc/b;->f(FFLb2/t;J)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v3, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-eqz v4, :cond_16

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_16
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v11, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_17
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v8

    mul-float/2addr v3, v1

    invoke-static {v3, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x6

    int-to-float v6, v4

    mul-float/2addr v6, v0

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v6, Lkd1/o;->a:I

    move-object v3, v7

    const/4 v7, 0x3

    move-object v4, v3

    const/4 v3, 0x0

    move-object/from16 v24, v4

    const/4 v4, 0x0

    move-object v8, v11

    move-object v11, v5

    move-object v5, v8

    move/from16 v8, v23

    move-object/from16 v30, v24

    const/16 v20, 0x0

    const/16 v26, 0x2

    const/16 v27, 0x4

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    invoke-virtual {v12, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v3

    const/16 v8, 0x1b0

    const/4 v9, 0x0

    move-object v7, v5

    move-wide v5, v3

    const/4 v3, 0x0

    move-object v4, v0

    move/from16 v0, v20

    const/4 v12, 0x1

    invoke-static/range {v2 .. v9}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v5, v7

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_b

    :goto_d
    double-to-float v2, v8

    mul-float/2addr v2, v1

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v2, v3, v5, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v5, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    move-object/from16 v2, v30

    invoke-static {v3, v5, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v5, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Loa2/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v8

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v11, v11, 0x12

    move/from16 v14, v27

    const v27, 0x2fffa

    move v15, v3

    const/4 v3, 0x0

    move-object/from16 v16, v6

    move/from16 v18, v7

    const-wide/16 v6, 0x0

    move-object/from16 v20, v22

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v21, v4

    move-object/from16 v24, v5

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v25, v12

    move/from16 v23, v26

    move/from16 v26, v11

    const-wide/16 v11, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move/from16 v31, v14

    const/4 v14, 0x0

    move/from16 v32, v15

    move-object/from16 v33, v16

    const-wide/16 v15, 0x0

    const/16 v34, 0x20

    const/16 v17, 0x0

    move/from16 v35, v18

    const/16 v18, 0x0

    move-object/from16 v36, v19

    const/16 v19, 0x0

    move-object/from16 v37, v20

    const/16 v20, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v43, v30

    move-object/from16 v0, v33

    move/from16 v41, v35

    move-object/from16 v42, v37

    const/16 v31, 0x30

    move/from16 v30, v1

    move/from16 v1, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual/range {p1 .. p1}, Loa2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v5, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v3, v41

    invoke-virtual {v0, v5, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v5, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->G()J

    move-result-wide v6

    const/4 v3, 0x0

    move-wide v4, v6

    const-wide/16 v6, 0x0

    move/from16 v1, v41

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v14, 0x1

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v14}, Lp1/q;->q(Z)V

    move-object/from16 v15, v43

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v4, 0x2

    int-to-float v2, v4

    mul-float v8, v2, v30

    const/4 v10, 0x0

    const/16 v11, 0xd

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v16, v8

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v3

    const/16 v6, 0x10

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    invoke-static {v2, v6, v7, v3, v4}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual/range {p1 .. p1}, Loa2/a;->c()Loa2/b;

    move-result-object v4

    invoke-virtual {v4}, Loa2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move/from16 v6, v32

    invoke-static {v4, v5, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->q()J

    move-result-wide v0

    move-object/from16 v7, p1

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v9, v29, 0x70

    const/16 v10, 0x20

    if-ne v9, v10, :cond_1c

    move v11, v14

    goto :goto_f

    :cond_1c
    const/4 v11, 0x0

    :goto_f
    or-int/2addr v8, v11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v8, :cond_1e

    move-object/from16 v8, v42

    if-ne v11, v8, :cond_1d

    goto :goto_10

    :cond_1d
    move-object/from16 v13, v36

    goto :goto_11

    :cond_1e
    move-object/from16 v8, v42

    :goto_10
    new-instance v11, Lox0/b;

    const/16 v12, 0x10

    move-object/from16 v13, v36

    invoke-direct {v11, v12, v7, v13}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v11, Lc93/a;

    const/16 v12, 0x30

    move-object/from16 v19, v13

    const/16 v13, 0x68

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    const/4 v9, 0x0

    move v14, v6

    move-object/from16 p1, v7

    move-object/from16 v44, v22

    move-wide v6, v0

    move v0, v10

    move-object v10, v11

    move/from16 v1, v17

    move-object/from16 v11, v24

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    invoke-virtual/range {p1 .. p1}, Loa2/a;->e()Loa2/b;

    move-result-object v2

    if-nez v2, :cond_1f

    const v2, -0xafedafa

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move-object/from16 v45, v19

    move-object/from16 v15, v44

    goto :goto_15

    :cond_1f
    const v4, -0xafedaf9

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    move/from16 v9, v16

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Loa2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v5, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-ne v1, v0, :cond_20

    const/4 v8, 0x1

    goto :goto_12

    :cond_20
    const/4 v8, 0x0

    :goto_12
    or-int/2addr v7, v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v15, v44

    if-nez v7, :cond_22

    if-ne v8, v15, :cond_21

    goto :goto_13

    :cond_21
    move-object/from16 v9, v19

    goto :goto_14

    :cond_22
    :goto_13
    new-instance v8, Lox0/b;

    const/16 v7, 0x11

    move-object/from16 v9, v19

    invoke-direct {v8, v7, v2, v9}, Lox0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v10, v8

    check-cast v10, Lc93/a;

    const/16 v12, 0x36

    const/16 v13, 0x78

    move-object/from16 v24, v5

    const/4 v5, 0x0

    move-object v2, v4

    move-object v4, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v45, v19

    move-object/from16 v11, v24

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_15
    sget-object v3, Lny0/n0;->TextMedium:Lny0/n0;

    invoke-virtual/range {p1 .. p1}, Loa2/a;->a()Loa2/b;

    move-result-object v2

    invoke-virtual {v2}, Loa2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object/from16 v7, p1

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-ne v1, v0, :cond_23

    const/4 v8, 0x1

    goto :goto_16

    :cond_23
    const/4 v8, 0x0

    :goto_16
    or-int v0, v2, v8

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_25

    if-ne v1, v15, :cond_24

    goto :goto_17

    :cond_24
    move-object/from16 v2, v45

    goto :goto_18

    :cond_25
    :goto_17
    new-instance v1, Lnq0/m;

    const/16 v0, 0x17

    move-object/from16 v2, v45

    invoke-direct {v1, v0, v7, v2}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_18
    check-cast v1, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v14, 0x6

    or-int/lit8 v16, v0, 0x30

    const/16 v17, 0x0

    const/16 v18, 0xff9

    move-object/from16 v19, v2

    const/4 v2, 0x0

    move-object/from16 v24, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v14, v1

    move-object/from16 v15, v24

    const/4 v0, 0x1

    invoke-static/range {v2 .. v18}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v5, v15

    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object/from16 v2, v19

    move-object/from16 v3, v28

    goto :goto_1a

    :cond_26
    move-object v5, v11

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v2, v3

    move-object/from16 v3, p2

    :goto_1a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_27

    new-instance v0, Lot1/f;

    const/16 v6, 0x10

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final h(Lcom/whoop/navigation/e;Ljava/lang/String;)Ll83/a0;
    .locals 0

    const-string p1, "<unused var>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Loa2/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Loa2/a;Lc93/m;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Loa2/a;->c()Loa2/b;

    move-result-object p0

    invoke-virtual {p0}, Loa2/b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Loa2/b;->c()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Loa2/b;Lc93/m;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Loa2/b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Loa2/b;->c()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, v0, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Loa2/a;Lc93/m;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Loa2/a;->a()Loa2/b;

    move-result-object p0

    invoke-virtual {p0}, Loa2/b;->a()Lcom/whoop/navigation/e;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Loa2/b;->c()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lpa2/a;->g(Loa2/d;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
