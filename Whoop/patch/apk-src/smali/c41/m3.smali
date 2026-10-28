.class public abstract Lc41/m3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/i3;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "Lgz0/m0;",
        "endIcon",
        "n",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V",
        "g",
        "(Lc41/i3;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lc41/i3;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/m3;->k(Lc41/i3;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/m3;->m(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/m3;->o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc41/i3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lc41/m3;->h(Lc41/i3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/m3;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lc41/i3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/m3;->l(Lc41/i3;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lc41/i3;Landroidx/compose/runtime/Composer;I)V
    .locals 43

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    check-cast v7, Lp1/q;

    const v2, -0x1f79fe95

    invoke-virtual {v7, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v10, 0x1

    if-eq v5, v3, :cond_3

    move v3, v10

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    and-int/2addr v2, v10

    invoke-virtual {v7, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v5, v2

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v8, 0x36

    invoke-static {v5, v6, v7, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_4

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v7, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v7, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-wide/from16 v16, v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_5

    :cond_5
    move-wide/from16 v16, v2

    :goto_5
    invoke-static {v6, v7, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v7, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/res/Configuration;

    iget v3, v3, Landroid/content/res/Configuration;->fontScale:F

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->E()Lb91/a;

    move-result-object v9

    invoke-virtual {v9}, Lb91/a;->d()Ll3/v0;

    move-result-object v9

    iget-object v9, v9, Ll3/v0;->a:Ll3/m0;

    move-object/from16 v18, v12

    iget-wide v11, v9, Ll3/m0;->b:J

    invoke-static {v11, v12}, Ly3/o;->c(J)F

    move-result v9

    mul-float/2addr v9, v3

    int-to-float v11, v8

    const/16 v12, 0xd

    int-to-float v12, v12

    sub-float/2addr v9, v12

    div-float/2addr v9, v12

    mul-float/2addr v9, v4

    add-float/2addr v9, v11

    mul-float/2addr v9, v4

    int-to-float v11, v10

    sub-float/2addr v3, v11

    move/from16 v19, v11

    float-to-double v10, v3

    const-wide/high16 v20, 0x400c000000000000L    # 3.5

    mul-double v10, v10, v20

    add-double v10, v10, v16

    double-to-float v3, v10

    mul-float/2addr v3, v4

    move-object/from16 v10, v18

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lc41/i3;->h()Lc41/w3;

    move-result-object v11

    const/4 v12, 0x0

    invoke-static {v11, v7, v12}, Lc41/x3;->c(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    move/from16 v11, v19

    invoke-static {v9, v11, v4, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v7, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v7, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v4, v7, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v7, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->f()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_a

    const v0, 0xc53e8ad

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->f()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v7, v8}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->h()Lc41/w3;

    move-result-object v1

    const/4 v12, 0x0

    invoke-static {v1, v7, v12}, Lc41/x3;->e(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    move v1, v8

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v3, 0x0

    move-object v11, v6

    move-object/from16 v41, v2

    move-object v2, v0

    move-object v0, v5

    move-wide/from16 v5, v17

    move-object/from16 v18, v10

    move v10, v1

    move-object/from16 v1, v41

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    move-object v1, v2

    move-object v0, v5

    move-object v11, v6

    move-object/from16 v18, v10

    const/4 v12, 0x0

    move v10, v8

    const v2, 0xc58580d

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lc41/i3;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_b

    const v2, 0xc597b86

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->h()Lc41/w3;

    move-result-object v3

    invoke-static {v3, v7, v12}, Lc41/x3;->d(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-virtual {v11, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    move-object v3, v14

    new-instance v14, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x2fdfa

    move-object v6, v3

    const/4 v3, 0x0

    move-object v8, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v17, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    move/from16 v21, v12

    const-wide/16 v11, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v25, v15

    const/16 v28, 0x1

    const-wide/16 v15, 0x0

    move-object/from16 v29, v17

    const/16 v17, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v23

    const/16 v23, 0x0

    move-object/from16 v35, v25

    const/16 v25, 0x0

    move-object/from16 p1, v1

    move-object/from16 v37, v29

    move-object/from16 v39, v32

    move/from16 v1, v33

    move-object/from16 v36, v34

    move-object/from16 v38, v35

    move-object/from16 v29, v0

    move-object/from16 v0, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v12, 0x1

    goto :goto_9

    :cond_b
    move-object/from16 v29, v0

    move-object/from16 p1, v1

    move-object/from16 v39, v11

    move v1, v12

    move-object/from16 v36, v13

    move-object/from16 v37, v14

    move-object/from16 v38, v15

    move-object/from16 v0, v18

    const v2, 0xc5d8d0d

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_c

    const/4 v10, 0x1

    goto :goto_a

    :cond_c
    move v10, v1

    :goto_a
    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x5

    if-eqz v10, :cond_12

    const v4, 0x5cbd816e

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v7, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_d

    move-object/from16 v9, v36

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v9, v37

    goto :goto_c

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v7, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v38

    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    move-object/from16 v4, v29

    goto :goto_e

    :cond_f
    :goto_d
    move-object/from16 v4, p1

    goto :goto_f

    :goto_e
    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v7, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v39

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->s()Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v9, :cond_10

    const v9, -0x3fec8bc6

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->h()Lc41/w3;

    move-result-object v9

    invoke-static {v9, v7, v1}, Lc41/x3;->d(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    :goto_10
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_10
    const v9, -0x3fec856b

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->h()Lc41/w3;

    move-result-object v9

    invoke-static {v9, v7, v1}, Lc41/x3;->e(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    goto :goto_10

    :goto_11
    new-instance v14, Lw3/k;

    invoke-direct {v14, v3}, Lw3/k;-><init>(I)V

    const/16 v26, 0xc30

    const v27, 0x2d5f8

    move-object/from16 v32, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move/from16 v31, v8

    const/4 v8, 0x0

    move v11, v3

    move-object v3, v5

    move-wide/from16 v41, v9

    move v10, v2

    move-object v2, v4

    move-wide/from16 v4, v41

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v15, v11

    move v13, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v18, v15

    move/from16 v17, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x2

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x2

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v30, v25

    const/16 v25, 0x30

    move-object/from16 v40, v32

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-static {v2, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v6, v40

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    const/4 v15, 0x5

    invoke-direct {v14, v15}, Lw3/k;-><init>(I)V

    const/16 v26, 0xc30

    const v27, 0x2d5f8

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v12, 0x1

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_12
    const/4 v12, 0x1

    goto :goto_13

    :cond_11
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    move v13, v2

    move v15, v3

    move-object/from16 v6, v39

    const/4 v8, 0x6

    const v2, 0x5ccc1fd5

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc41/i3;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    new-instance v14, Lw3/k;

    invoke-direct {v14, v15}, Lw3/k;-><init>(I)V

    const/16 v26, 0xc30

    const v27, 0x2d5f8

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x2

    const/16 v18, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_13
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lbp0/o;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbp0/o;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final h(Lc41/i3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lc41/m3;->g(Lc41/i3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/i3;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x49c097b1

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_5

    and-int/lit8 v5, v4, 0x40

    if-nez v5, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_3
    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_4

    move v5, v6

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit8 v5, p5, 0x4

    const/16 v7, 0x100

    if-eqz v5, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    move v9, v7

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_9

    move v9, v12

    goto :goto_6

    :cond_9
    move v9, v11

    :goto_6
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v14, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_13

    if-eqz v0, :cond_a

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v15, v0

    goto :goto_7

    :cond_a
    move-object v15, v1

    :goto_7
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_c

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_b

    new-instance v1, La11/g;

    const/16 v5, 0x12

    invoke-direct {v1, v5}, La11/g;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v1, v8

    :goto_8
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_d

    invoke-static {v14}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_d
    move-object/from16 v16, v5

    check-cast v16, Lj0/i;

    and-int/lit8 v5, v3, 0x70

    if-eq v5, v6, :cond_f

    and-int/lit8 v5, v3, 0x40

    if-eqz v5, :cond_e

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    goto :goto_9

    :cond_e
    move v5, v11

    goto :goto_a

    :cond_f
    :goto_9
    move v5, v12

    :goto_a
    and-int/lit16 v3, v3, 0x380

    if-ne v3, v7, :cond_10

    move v11, v12

    :cond_10
    or-int v3, v5, v11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_11

    if-ne v5, v0, :cond_12

    :cond_11
    new-instance v5, La11/l;

    const/16 v0, 0x9

    invoke-direct {v5, v2, v1, v0}, La11/l;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v5

    check-cast v20, Lc93/a;

    const/16 v21, 0x1c

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v15 .. v21}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v0, v15

    new-instance v3, Lc41/l3;

    const/4 v6, 0x0

    invoke-direct {v3, v2, v6}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    const v6, 0x493e1e21

    invoke-static {v6, v14, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/high16 v15, 0xc00000

    const/16 v16, 0x7e

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v1

    move-object v1, v0

    goto :goto_b

    :cond_13
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v8

    :goto_b
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Laz0/a;

    const/4 v6, 0x1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lc41/i3;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lc41/i3;->c()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc41/i3;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    int-to-float p1, v3

    const/16 p2, 0x8

    int-to-float p2, p2

    mul-float/2addr p1, p2

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1}, Ll0/m;->i(F)Ll0/k;

    move-result-object p1

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {p1, v3, v7, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p1

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v7, v11, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {v7, p1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v3, v7, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lc41/i3;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {p0}, Lc41/i3;->e()Lgz0/m0;

    move-result-object v6

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v4, 0x0

    invoke-static/range {v4 .. v9}, Lc41/m3;->n(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, p2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget-object v0, Lb2/e;->z:Lb2/m;

    invoke-static {v0, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, p2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_4

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v7, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, p1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean p1, v7, Lp1/q;->S:Z

    if-nez p1, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    :cond_5
    invoke-static {v1, v7, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v7, v3, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget p1, Lcom/whoop/navigation/e;->d:I

    invoke-static {p0, v7, p1}, Lc41/m3;->g(Lc41/i3;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/m3;->i(Landroidx/compose/ui/Modifier;Lc41/i3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V
    .locals 39

    move-object/from16 v2, p1

    move/from16 v4, p4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x3ceacefc

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v5, v5, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_8

    if-nez p2, :cond_6

    const/4 v7, -0x1

    goto :goto_3

    :cond_6
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    :goto_3
    invoke-virtual {v10, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_8
    :goto_5
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v11, 0x1

    if-eq v7, v8, :cond_9

    move v7, v11

    goto :goto_6

    :cond_9
    move v7, v9

    :goto_6
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v3, v12

    :cond_a
    if-eqz v6, :cond_b

    const/4 v0, 0x0

    goto :goto_7

    :cond_b
    move-object/from16 v0, p2

    :goto_7
    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v7, Ll0/m;->g:Ll0/h;

    const/16 v8, 0x36

    invoke-static {v7, v6, v10, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_c

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :cond_d
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v15, v6, v7

    const/16 v16, 0x0

    const/16 v17, 0xb

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v13, v7

    const-wide/16 v15, 0x0

    cmpl-double v8, v13, v15

    if-lez v8, :cond_f

    goto :goto_9

    :cond_f
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    invoke-static {v6, v11, v7}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v5, v5, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v7, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    new-instance v15, Lw3/k;

    const/4 v8, 0x5

    invoke-direct {v15, v8}, Lw3/k;-><init>(I)V

    const/16 v29, 0xc30

    const v30, 0x2d5f8

    move v8, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v8

    move-wide/from16 v37, v13

    move-object v14, v7

    move-wide/from16 v7, v37

    const/4 v13, 0x0

    move-object/from16 v19, v14

    move-object/from16 v20, v17

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v23, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x2

    move/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v28, v22

    const/16 v22, 0x2

    move/from16 v31, v23

    const/16 v23, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v34, v28

    const/16 v28, 0x0

    move/from16 v1, v31

    move-object/from16 v36, v32

    move-object/from16 v35, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    if-nez v0, :cond_10

    const v5, 0x46f889b6

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_a
    const/4 v1, 0x1

    goto :goto_b

    :cond_10
    const v5, 0x46f889b7

    const/4 v6, 0x6

    invoke-static {v10, v5, v0, v10, v6}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v5

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v7, v7

    move-object/from16 v12, v36

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v14, v35

    invoke-virtual {v14, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :goto_b
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object v3, v0

    goto :goto_c

    :cond_11
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v3

    move-object/from16 v3, p2

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Laz0/a;

    const/4 v6, 0x2

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Laz0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/m3;->n(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
