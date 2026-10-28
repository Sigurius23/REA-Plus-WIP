.class public abstract Lst1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a!\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lrt1/h$b;",
        "viewState",
        "Ll83/a0;",
        "e",
        "(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V",
        "",
        "progress",
        "Ly3/f;",
        "height",
        "c",
        "(FFLandroidx/compose/runtime/Composer;II)V",
        "labrador_release"
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
.method public static synthetic a(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lst1/c;->f(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lst1/c;->d(FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(FFLandroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v0, p0

    move/from16 v1, p3

    move/from16 v2, p4

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x49714193

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v1, 0x6

    const/4 v6, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move v4, v1

    :goto_1
    and-int/lit8 v7, v2, 0x2

    if-eqz v7, :cond_3

    or-int/lit8 v4, v4, 0x30

    :cond_2
    move/from16 v8, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_2

    move/from16 v8, p1

    invoke-virtual {v3, v8}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_2

    :cond_4
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v4, v9

    :goto_3
    and-int/lit8 v9, v4, 0x13

    const/16 v10, 0x12

    const/4 v12, 0x1

    if-eq v9, v10, :cond_5

    move v9, v12

    goto :goto_4

    :cond_5
    const/4 v9, 0x0

    :goto_4
    and-int/2addr v4, v12

    invoke-virtual {v3, v4, v9}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v7, :cond_6

    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v7, v6

    mul-float/2addr v4, v7

    goto :goto_5

    :cond_6
    move v4, v8

    :goto_5
    int-to-float v7, v12

    int-to-float v6, v6

    mul-float/2addr v6, v7

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v10, Li2/c1;

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v13, v3, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->t()J

    move-result-wide v11

    invoke-direct {v10, v11, v12}, Li2/c1;-><init>(J)V

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v7, v8, v10, v11}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13, v3, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->q()J

    move-result-wide v10

    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v8, v10, v11, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v15, 0x36

    invoke-static {v10, v11, v3, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    move/from16 p1, v6

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v3, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v3, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v5, v3, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sub-float v5, v4, p1

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v11, 0x2

    invoke-static {v5, v7, v6, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {p1 .. p1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v5, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v13, v3, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->j0()J

    move-result-wide v6

    invoke-static {v5, v6, v7, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v3, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x1

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    move v4, v8

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_b

    new-instance v5, Lst1/b;

    invoke-direct {v5, v0, v4, v1, v2}, Lst1/b;-><init>(FFII)V

    iput-object v5, v3, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(FFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lst1/c;->c(FFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V
    .locals 49

    move-object/from16 v0, p0

    sget-object v2, Lb2/e;->K:Lb2/l;

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    const v3, -0x3a4bae5f

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v5, :cond_2

    move v6, v8

    goto :goto_2

    :cond_2
    move v6, v7

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v9, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_12

    const/4 v3, -0x3

    int-to-float v3, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v3, v6

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v11, 0x0

    invoke-static {v10, v11, v3, v8}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v13, v5

    mul-float/2addr v13, v6

    invoke-static {v3, v13, v11, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-eqz v4, :cond_3

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_3
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v9, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v11, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    :cond_4
    invoke-static {v14, v9, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v9, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lrt1/h$b;->o()Lrt1/e;

    move-result-object v3

    const/16 v11, 0x36

    if-nez v3, :cond_6

    const v3, -0x5e611cb1

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move-object/from16 v31, v4

    move-object/from16 v33, v5

    move/from16 v42, v6

    move v12, v7

    move-object/from16 v46, v8

    move-object v3, v10

    move-object/from16 v32, v13

    move-object/from16 v45, v15

    const/4 v0, 0x1

    goto/16 :goto_5

    :cond_6
    const v14, -0x5e611cb0

    invoke-virtual {v9, v14}, Lp1/q;->e0(I)V

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v7, 0x1

    int-to-float v12, v7

    mul-float/2addr v12, v6

    invoke-static {v12}, Ll0/m;->i(F)Ll0/k;

    move-result-object v12

    sget-object v7, Lb2/e;->L:Lb2/l;

    invoke-static {v12, v7, v9, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v9}, Lp1/q;->i0()V

    move-object/from16 v30, v3

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-eqz v3, :cond_7

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v9, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v11, v9, v11, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v9, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v4

    invoke-virtual/range {v30 .. v30}, Lrt1/e;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v7, v9, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v7, v9, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->w()Lb91/a;

    move-result-object v24

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v28, v12, 0x12

    const v29, 0x2fffa

    move-object v12, v5

    const/4 v5, 0x0

    move-object v14, v8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v31, v12

    const/4 v12, 0x0

    move-object/from16 v32, v13

    move-object/from16 v33, v14

    const-wide/16 v13, 0x0

    move-object/from16 v34, v15

    const/4 v15, 0x0

    const/16 v35, 0x4

    const/16 v16, 0x0

    const/high16 v36, 0x3f800000    # 1.0f

    const/16 v37, 0x0

    const-wide/16 v17, 0x0

    const/16 v38, 0x0

    const/16 v19, 0x0

    const/16 v39, 0x1

    const/16 v20, 0x0

    const/16 v40, 0x36

    const/16 v21, 0x0

    move-object/from16 v41, v7

    move-wide/from16 v47, v22

    move/from16 v23, v6

    move-wide/from16 v6, v47

    const/16 v22, 0x0

    move/from16 v42, v23

    const/16 v23, 0x0

    move-object/from16 v43, v25

    const/16 v25, 0x0

    move/from16 v44, v27

    const/16 v27, 0x0

    move-object/from16 v46, v33

    move-object/from16 v45, v34

    move-object/from16 v1, v41

    move/from16 v0, v44

    move-object/from16 v33, v31

    move-object/from16 v31, v3

    move/from16 v3, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    int-to-float v3, v3

    mul-float v14, v4, v3

    const/4 v15, 0x7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v10, v43

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v3, v10

    invoke-virtual/range {p0 .. p0}, Lrt1/h$b;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v9, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v9, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    invoke-virtual {v1, v9, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->o()Lb91/a;

    move-result-object v24

    const/16 v27, 0x30

    const v29, 0x2fff8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {v30 .. v30}, Lrt1/e;->a()F

    move-result v1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v12, 0x0

    invoke-static {v1, v5, v9, v12, v4}, Lst1/c;->c(FFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p0 .. p0}, Lrt1/h$b;->w()Z

    move-result v1

    const/4 v4, 0x5

    if-eqz v1, :cond_d

    const v1, -0x5e5321a4

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x36

    invoke-static {v5, v2, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    move-object/from16 v7, v33

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v8, v31

    goto :goto_7

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v9, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v32

    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    move-object/from16 v11, v45

    goto :goto_9

    :cond_c
    :goto_8
    move-object/from16 v14, v46

    goto :goto_a

    :goto_9
    invoke-static {v5, v9, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v9, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lgy0/a;->t:I

    invoke-static {v1, v9, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->f()J

    move-result-wide v7

    int-to-float v2, v4

    mul-float v2, v2, v42

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    move-object v4, v1

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_d
    move-object/from16 v8, v31

    move-object/from16 v10, v32

    move-object/from16 v7, v33

    move-object/from16 v11, v45

    move-object/from16 v14, v46

    const/16 v6, 0x36

    invoke-virtual/range {p0 .. p0}, Lrt1/h$b;->x()Z

    move-result v1

    if-eqz v1, :cond_11

    const v1, -0x5e4a8c84

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Ll0/m;->a:Ll0/e;

    invoke-static {v5, v2, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, v9, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v13, v9, Lp1/q;->S:Z

    if-eqz v13, :cond_e

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v9, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    invoke-static {v5, v9, v5, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v9, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lgy0/a;->N:I

    invoke-static {v1, v9, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j()J

    move-result-wide v7

    int-to-float v2, v4

    mul-float v2, v2, v42

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x1b0

    const/4 v11, 0x0

    const/4 v5, 0x0

    move-object v4, v1

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    const v1, -0x5e42d235

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lst1/a;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lst1/a;-><init>(Lrt1/h$b;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final f(Lrt1/h$b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lst1/c;->e(Lrt1/h$b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
