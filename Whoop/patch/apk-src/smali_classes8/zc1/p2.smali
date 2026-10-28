.class public abstract Lzc1/p2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a)\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0003\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "fillPercent",
        "Li91/a;",
        "background",
        "",
        "showIndicator",
        "c",
        "(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/p2;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FLi91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzc1/p2;->d(FLi91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v2, p1

    move/from16 v12, p4

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x5ec6e410

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    move/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->d(F)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v3, v12, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v12, 0x40

    if-nez v3, :cond_2

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v0, v3

    :cond_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move/from16 v4, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_5

    move/from16 v4, p2

    invoke-virtual {v9, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_4

    :cond_7
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    :goto_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_8

    move v5, v8

    goto :goto_6

    :cond_8
    move v5, v7

    :goto_6
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    if-eqz v3, :cond_9

    move v5, v7

    goto :goto_7

    :cond_9
    move v5, v4

    :goto_7
    const/16 v3, 0x1e

    int-to-float v14, v3

    sget-object v3, Lb2/e;->w:Lb2/m;

    invoke-static {v3, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v9, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v4, v9, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v3

    invoke-static {v3, v4}, Li91/c;->o(J)Li91/a;

    move-result-object v16

    sget v3, Li91/a;->a:I

    shl-int/lit8 v3, v3, 0x9

    or-int/lit16 v4, v3, 0x1b0

    const/16 v24, 0x1f1

    const/4 v13, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move/from16 v23, v4

    move-object/from16 v22, v9

    invoke-static/range {v13 .. v24}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    shl-int/lit8 v4, v0, 0x6

    and-int/lit16 v6, v4, 0x380

    or-int/lit8 v6, v6, 0x30

    or-int/2addr v3, v6

    and-int/lit16 v4, v4, 0x1c00

    or-int/2addr v3, v4

    const/high16 v4, 0x70000

    shl-int/lit8 v0, v0, 0x9

    and-int/2addr v0, v4

    or-int v10, v3, v0

    const/16 v11, 0x1d1

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v3, v8

    const/4 v8, 0x0

    move v13, v3

    move-object v3, v2

    move v2, v1

    move v1, v14

    invoke-static/range {v0 .. v11}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    move v3, v5

    goto :goto_9

    :cond_d
    invoke-virtual {v9}, Lp1/q;->X()V

    move v3, v4

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lzc1/o2;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v5, p5

    move v4, v12

    invoke-direct/range {v0 .. v5}, Lzc1/o2;-><init>(FLi91/a;ZII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final d(FLi91/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 39

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object/from16 v7, p0

    check-cast v7, Lp1/q;

    const v4, -0x6b064464

    invoke-virtual {v7, v4}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    :goto_0
    and-int/lit8 v5, p1, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1c

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x2

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v6, v5

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, Ll0/m;->f:Ll0/h;

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v12, v6, v7, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "Gauge - Fill Color"

    invoke-static {v4, v7, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v12, v10, v7, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    move-object/from16 v16, v14

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    move/from16 v17, v5

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    move-object/from16 v5, v16

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    move-object/from16 v5, v16

    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v7, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v4, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_6

    :cond_5
    invoke-static {v13, v7, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, Ll0/t1;->a:Ll0/t1;

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v0, 0x30

    move-object/from16 v16, v2

    invoke-static {v8, v4, v7, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object/from16 v18, v1

    iget-wide v0, v7, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v7, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 v19, v4

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_7

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v7, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    move-object/from16 v0, v18

    goto :goto_6

    :cond_9
    :goto_5
    invoke-static {v0, v7, v0, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_4

    :goto_6
    invoke-static {v7, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "25%"

    const/4 v2, 0x6

    invoke-static {v1, v7, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v14, v17, v2

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    move-object/from16 v17, v6

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Ly81/i;->Z()J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Li91/c;->o(J)Li91/a;

    move-result-object v18

    sget v20, Li91/a;->a:I

    move-object/from16 v21, v4

    shl-int/lit8 v4, v20, 0x3

    move-object/from16 v20, v8

    or-int/lit8 v8, v4, 0x6

    move-object/from16 v22, v9

    const/4 v9, 0x4

    move/from16 v23, v4

    const/high16 v4, 0x3e800000    # 0.25f

    move/from16 v24, v6

    const/4 v6, 0x0

    move-object/from16 v25, v17

    move-object/from16 v17, v1

    move-object/from16 v1, v25

    move-object/from16 v25, v20

    move/from16 v20, v2

    move-object/from16 v2, v25

    move-object/from16 v25, v19

    move-object/from16 v19, v12

    move-object/from16 v12, v25

    move-object/from16 v25, v3

    move-object v3, v5

    move-object/from16 v5, v18

    move-object/from16 v26, v21

    move/from16 v28, v23

    move/from16 v27, v24

    move-object/from16 v18, v10

    move-object/from16 v10, v22

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    move/from16 v21, v8

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v4, 0x30

    invoke-static {v2, v12, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    invoke-static {v4, v7, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "65%"

    const/4 v5, 0x6

    invoke-static {v4, v7, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v7, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v5, v26

    move/from16 v6, v27

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->Z()J

    move-result-wide v8

    invoke-static {v8, v9}, Li91/c;->o(J)Li91/a;

    move-result-object v8

    move/from16 v9, v28

    or-int/lit16 v9, v9, 0x186

    move-object v5, v8

    move v8, v9

    const/4 v9, 0x0

    move-object/from16 v22, v4

    const v4, 0x3f266666    # 0.65f

    const/4 v6, 0x1

    move-object/from16 v31, v22

    move-object/from16 v29, v26

    move/from16 v30, v27

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    move/from16 v22, v8

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v4, 0x30

    invoke-static {v2, v12, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    invoke-static {v4, v7, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v4, "90%"

    const/4 v5, 0x6

    invoke-static {v4, v7, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v7, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v5, v29

    move/from16 v6, v30

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->Z()J

    move-result-wide v5

    invoke-static {v5, v6}, Li91/c;->o(J)Li91/a;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v9, 0x4

    move-object v8, v4

    const v4, 0x3f666666    # 0.9f

    move-object/from16 v32, v8

    move/from16 v8, v21

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v4, 0x1

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    const/4 v4, 0x5

    int-to-float v4, v4

    move/from16 v5, v20

    invoke-static {v4, v5, v11, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v4, "Gauge - Gradient Color"

    const/4 v5, 0x6

    invoke-static {v4, v7, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v9, v18

    move-object/from16 v4, v19

    invoke-static {v4, v9, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_10

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v7, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v5, v7, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v7, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v8, 0x1

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v4, 0x30

    invoke-static {v2, v12, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_13

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    :cond_14
    invoke-static {v4, v7, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v17

    const/4 v5, 0x6

    invoke-static {v4, v7, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v4, Li2/t;->b:Li2/s;

    const-wide v17, 0xff132c5fL

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v8, Li2/x;

    invoke-direct {v8, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    move-object/from16 v6, v25

    invoke-direct {v5, v6, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const-wide v19, 0xff66ddffL

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v8

    new-instance v6, Li2/x;

    invoke-direct {v6, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    move-object/from16 v9, v16

    invoke-direct {v8, v9, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v8}, [Ll83/k;

    move-result-object v5

    invoke-static {v4, v5}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v5

    invoke-static {v5}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v9, 0x4

    move-object v8, v4

    const/high16 v4, 0x3e800000    # 0.25f

    move-object/from16 v35, v8

    move-object/from16 v33, v16

    move/from16 v8, v21

    move-object/from16 v34, v25

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v4, 0x30

    invoke-static {v2, v12, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_16

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_16
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    :cond_17
    invoke-static {v4, v7, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v7, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v31

    const/4 v5, 0x6

    invoke-static {v4, v7, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    move-object/from16 v5, v34

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v8

    new-instance v6, Li2/x;

    invoke-direct {v6, v8, v9}, Li2/x;-><init>(J)V

    new-instance v8, Ll83/k;

    move-object/from16 v9, v33

    invoke-direct {v8, v9, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v8}, [Ll83/k;

    move-result-object v4

    move-object/from16 v6, v35

    invoke-static {v6, v4}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v4

    invoke-static {v4}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v4

    const/4 v6, 0x1

    move-object/from16 v16, v9

    const/4 v9, 0x0

    move-object/from16 v25, v5

    move-object v5, v4

    const v4, 0x3f266666    # 0.65f

    move-object/from16 v36, v16

    move/from16 v8, v22

    move-object/from16 v37, v25

    move-object/from16 v38, v35

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v7, v8}, Lp1/q;->q(Z)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-virtual {v13, v11, v8, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v5, 0x30

    invoke-static {v2, v12, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_19

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_19
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v7, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_1a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    :cond_1a
    invoke-static {v5, v7, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v7, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v8, v32

    const/4 v5, 0x6

    invoke-static {v8, v7, v5}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v7, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v17 .. v18}, Li2/w0;->e(J)J

    move-result-wide v0

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    move-object/from16 v5, v37

    invoke-direct {v0, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {v19 .. v20}, Li2/w0;->e(J)J

    move-result-wide v1

    new-instance v3, Li2/x;

    invoke-direct {v3, v1, v2}, Li2/x;-><init>(J)V

    new-instance v1, Ll83/k;

    move-object/from16 v9, v36

    invoke-direct {v1, v9, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1}, [Ll83/k;

    move-result-object v0

    move-object/from16 v6, v38

    invoke-static {v6, v0}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v0

    invoke-static {v0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v5

    const/4 v6, 0x0

    const/4 v9, 0x4

    const v4, 0x3f666666    # 0.9f

    move/from16 v8, v21

    invoke-static/range {v4 .. v9}, Lzc1/p2;->c(FLi91/a;ZLandroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-static {v7, v8, v8, v8}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_d

    :cond_1c
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1d

    new-instance v1, Lzc1/l2;

    const/4 v2, 0x1

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/l2;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/p2;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
