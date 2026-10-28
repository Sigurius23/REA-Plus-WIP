.class public abstract Lxw1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Luw1/a;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "membership_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxw1/c;->e(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lxw1/c;->g(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxw1/c;->f(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Luw1/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x4f97ad4a

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v1, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x0

    const/4 v12, 0x1

    if-eq v8, v9, :cond_8

    move v8, v12

    goto :goto_5

    :cond_8
    move v8, v10

    :goto_5
    and-int/lit8 v9, v7, 0x1

    invoke-virtual {v11, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1c

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v4, v8

    :cond_9
    const/4 v0, 0x3

    int-to-float v9, v0

    int-to-float v3, v3

    invoke-static {v4, v9, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v9, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 p0, v0

    invoke-virtual/range {v16 .. v16}, Ly81/i;->a1()J

    move-result-wide v0

    sget-object v14, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v0, v1, v14}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v1, v12

    const/16 v3, 0xc

    int-to-float v3, v3

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    sget-object v16, Li2/t;->b:Li2/s;

    const v14, 0xffffff

    move-object/from16 v24, v3

    invoke-static {v14}, Li2/w0;->c(I)J

    move-result-wide v2

    new-instance v14, Li2/x;

    invoke-direct {v14, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v9, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->a1()J

    move-result-wide v2

    new-instance v12, Li2/x;

    invoke-direct {v12, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v14, v12}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const-wide/16 v20, 0x0

    const/16 v22, 0xe

    const-wide/16 v18, 0x0

    invoke-static/range {v16 .. v22}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v2

    move-object/from16 v3, v24

    invoke-static {v1, v0, v2, v3}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    invoke-static {v2, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    move-object/from16 v33, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-nez v10, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    :cond_b
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v11, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v0, v1, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object v1, v9

    move v15, v10

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    move/from16 v18, v15

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v19, v1

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-eqz v1, :cond_d

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v9, v11, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v11, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object v2, v8

    invoke-virtual {v5}, Luw1/a;->e()Lny0/h;

    move-result-object v8

    and-int/lit16 v3, v7, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_10

    const/4 v9, 0x1

    goto :goto_8

    :cond_10
    const/4 v9, 0x0

    :goto_8
    and-int/lit8 v14, v7, 0x70

    const/16 v15, 0x20

    if-eq v14, v15, :cond_12

    and-int/lit8 v10, v7, 0x40

    if-eqz v10, :cond_11

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_9

    :cond_11
    const/4 v10, 0x0

    goto :goto_a

    :cond_12
    :goto_9
    const/4 v10, 0x1

    :goto_a
    or-int/2addr v9, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_13

    if-ne v10, v12, :cond_14

    :cond_13
    new-instance v10, Lxw1/b;

    const/4 v9, 0x0

    invoke-direct {v10, v6, v5, v9}, Lxw1/b;-><init>(Lkotlin/jvm/functions/Function1;Luw1/a;I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v10, Lc93/a;

    sget v9, Lny0/h;->z:I

    shl-int/lit8 v9, v9, 0x3

    or-int/lit8 v9, v9, 0x6

    move/from16 v17, v13

    const/4 v13, 0x4

    move-object/from16 v18, v12

    move v12, v9

    const/4 v9, 0x0

    move v4, v7

    move-object v7, v1

    move-object v1, v2

    move v2, v4

    move/from16 v34, v17

    move-object/from16 v35, v18

    move-object/from16 v4, v19

    invoke-static/range {v7 .. v13}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move/from16 v20, v12

    invoke-virtual {v5}, Luw1/a;->c()Lhy0/e;

    move-result-object v7

    invoke-virtual {v7}, Lhy0/e;->b()Lhy0/g;

    move-result-object v8

    invoke-virtual {v5}, Luw1/a;->c()Lhy0/e;

    move-result-object v7

    invoke-virtual {v7}, Lhy0/e;->a()Lhy0/f;

    move-result-object v9

    invoke-virtual {v5}, Luw1/a;->c()Lhy0/e;

    move-result-object v7

    invoke-virtual {v7}, Lhy0/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v7, 0x9

    const/16 v19, 0xf1

    move v12, v7

    const/4 v7, 0x0

    move-object/from16 v29, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const-wide/16 v12, 0x0

    move/from16 v21, v14

    move/from16 v22, v15

    const-wide/16 v14, 0x0

    move/from16 v23, v16

    const/16 v16, 0x0

    move/from16 v24, v2

    move/from16 v2, v21

    move-object/from16 v17, v29

    move-object/from16 v21, v4

    const/16 v4, 0x100

    invoke-static/range {v7 .. v19}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v11, v17

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Luw1/a;->a()Lny0/h;

    move-result-object v8

    if-ne v3, v4, :cond_15

    const/4 v10, 0x1

    :goto_b
    const/16 v15, 0x20

    goto :goto_c

    :cond_15
    const/4 v10, 0x0

    goto :goto_b

    :goto_c
    if-eq v2, v15, :cond_17

    and-int/lit8 v0, v24, 0x40

    if-eqz v0, :cond_16

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_16

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    goto :goto_e

    :cond_17
    :goto_d
    const/4 v0, 0x1

    :goto_e
    or-int/2addr v0, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_18

    move-object/from16 v0, v35

    if-ne v1, v0, :cond_19

    :cond_18
    new-instance v1, Lxw1/b;

    const/4 v0, 0x1

    invoke-direct {v1, v6, v5, v0}, Lxw1/b;-><init>(Lkotlin/jvm/functions/Function1;Luw1/a;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v10, v1

    check-cast v10, Lc93/a;

    const/4 v13, 0x4

    const/4 v9, 0x0

    move/from16 v12, v20

    invoke-static/range {v7 .. v13}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Luw1/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_f

    :cond_1a
    const/4 v0, 0x0

    :goto_f
    if-nez v0, :cond_1b

    const v0, 0x71e61eb0

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v0, 0x1

    goto :goto_11

    :cond_1b
    const v1, 0x71e61eb1

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    move/from16 v12, v23

    invoke-static {v0, v11, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v1, v21

    move/from16 v0, v34

    invoke-virtual {v1, v11, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v11, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    new-instance v0, Lw3/k;

    move/from16 v1, p0

    invoke-direct {v0, v1}, Lw3/k;-><init>(I)V

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v31, v1, 0x12

    const v32, 0x2fdfa

    const/4 v8, 0x0

    move-object/from16 v29, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v19, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v33

    goto :goto_12

    :cond_1c
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lwr0/f;

    const/16 v3, 0x10

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Luw1/a;->e()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Luw1/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Luw1/a;->a()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lxw1/c;->d(Landroidx/compose/ui/Modifier;Luw1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
