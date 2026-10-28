.class public abstract Lxw1/f;
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
        "Luw1/h;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lxw1/f;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lxw1/f;->i(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lxw1/f;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Luw1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxw1/f;->h(Luw1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Luw1/h;",
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

    const v0, -0x485c068f

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

    const/16 v13, 0x92

    const/4 v15, 0x1

    if-eq v8, v13, :cond_8

    move v8, v15

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v11, v13, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1e

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v4, v8

    :cond_9
    invoke-virtual {v5}, Luw1/h;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-static {v0, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v35, v0, 0x1

    const/4 v13, 0x3

    int-to-float v9, v13

    int-to-float v3, v3

    mul-float/2addr v9, v3

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v10

    invoke-static {v4, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    int-to-float v12, v15

    const/16 v13, 0xc

    int-to-float v13, v13

    invoke-static {v13}, Lt0/j;->e(F)Lt0/i;

    move-result-object v13

    sget-object v18, Li2/t;->b:Li2/s;

    const v19, 0xffffff

    invoke-static/range {v19 .. v19}, Li2/w0;->c(I)J

    move-result-wide v14

    new-instance v2, Li2/x;

    invoke-direct {v2, v14, v15}, Li2/x;-><init>(J)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    move/from16 v28, v0

    invoke-virtual/range {v19 .. v19}, Ly81/i;->a1()J

    move-result-wide v0

    move/from16 v29, v3

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v19

    const-wide/16 v22, 0x0

    const/16 v24, 0xe

    const-wide/16 v20, 0x0

    invoke-static/range {v18 .. v24}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v0

    invoke-static {v12, v10, v0, v13}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move/from16 v18, v1

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v47, v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_7

    :cond_b
    move-object/from16 v47, v4

    :goto_7
    invoke-static {v3, v11, v3, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->N:Lb2/k;

    invoke-static/range {v18 .. v18}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v4, 0x36

    invoke-static {v3, v0, v11, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move/from16 v18, v7

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    move-object/from16 v19, v8

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v11, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v3, v11, v3, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v11, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Luw1/h;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v14, v11, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->m()Lb91/a;

    move-result-object v1

    invoke-static {v9}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-virtual {v5}, Luw1/h;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    const/16 v48, 0x0

    if-nez v28, :cond_11

    const v7, -0x7e50c745

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/i0;->a()I

    move-result v37

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_10

    sget-object v7, Lxw1/f$a;->w:Lxw1/f$a;

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v39

    mul-float v7, v29, v29

    new-instance v36, Lqz0/c$a;

    new-instance v8, Ly3/f;

    invoke-direct {v8, v7}, Ly3/f;-><init>(F)V

    const/16 v41, 0x8

    const/16 v42, 0x0

    const/16 v40, 0x0

    move-object/from16 v38, v8

    invoke-direct/range {v36 .. v42}, Lqz0/c$a;-><init>(ILy3/f;Ly81/e;Li2/t;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_11
    const/4 v7, 0x0

    const v8, -0x7e4d509f

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object/from16 v36, v48

    :goto_9
    invoke-virtual {v5}, Luw1/h;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->f()J

    move-result-wide v38

    sget-object v8, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->r()J

    move-result-wide v12

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v20

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v22

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->b1()J

    move-result-wide v24

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v27

    invoke-virtual {v14, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->f()J

    move-result-wide v29

    const-wide/16 v31, 0x0

    const v34, 0x1ffe82

    move/from16 v33, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-wide/from16 v40, v12

    move-object v12, v14

    move-wide/from16 v13, v20

    move/from16 v20, v15

    move-wide/from16 v15, v22

    const/16 v23, 0x20

    const-wide/16 v21, 0x0

    move-wide/from16 v42, v24

    move/from16 v24, v18

    move-wide/from16 v17, v42

    const/16 v42, 0x100

    const/16 v43, 0x1

    const-wide/16 v25, 0x0

    move-object/from16 v45, v19

    move/from16 v44, v20

    move-wide/from16 v19, v27

    const-wide/16 v27, 0x0

    move/from16 v49, v23

    move/from16 v46, v24

    move-wide/from16 v23, v29

    const-wide/16 v29, 0x0

    move-object/from16 v50, v0

    move-object/from16 p0, v1

    move-object/from16 p3, v2

    move-object/from16 v33, v11

    move-object v1, v12

    move-wide/from16 v11, v40

    move/from16 v2, v44

    move-object/from16 v51, v45

    move/from16 v0, v46

    move-object/from16 v40, v3

    move/from16 v3, v42

    invoke-static/range {v7 .. v34}, Lg1/i8;->h(JJJJJJJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v34

    move-object/from16 v11, v33

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_12

    new-instance v7, Lxo1/a;

    const/16 v8, 0xf

    invoke-direct {v7, v8}, Lxo1/a;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v7, Lc93/a;

    and-int/lit16 v8, v0, 0x380

    if-ne v8, v3, :cond_13

    const/4 v14, 0x1

    goto :goto_a

    :cond_13
    const/4 v14, 0x0

    :goto_a
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v14, :cond_14

    if-ne v9, v4, :cond_15

    :cond_14
    new-instance v9, Lwo1/h;

    const/16 v10, 0x10

    invoke-direct {v9, v6, v10}, Lwo1/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v10, 0x3

    const/high16 v13, 0x30000

    or-int/2addr v12, v13

    shl-int/lit8 v13, v10, 0x9

    or-int/2addr v12, v13

    sget v52, Lb91/a;->d:I

    shl-int/lit8 v13, v52, 0xc

    or-int/2addr v12, v13

    sget v13, Lqz0/c$a;->f:I

    shl-int/lit8 v13, v13, 0x15

    or-int/2addr v12, v13

    shl-int/lit8 v13, v10, 0x18

    or-int v41, v12, v13

    const v45, 0x39ffa845

    const/16 v46, 0x0

    move-wide/from16 v19, v38

    move-object/from16 v38, v7

    const/4 v7, 0x0

    move-object/from16 v39, v9

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x6

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

    move/from16 v16, v35

    const/16 v35, 0x0

    move-object/from16 v14, v36

    const/16 v36, 0x0

    move-object/from16 v15, v37

    const/16 v37, 0x0

    const/16 v42, 0x6000

    const/16 v43, 0x0

    const/16 v44, 0x6

    move/from16 v17, v16

    move-object/from16 v33, p3

    move/from16 v53, v0

    move v0, v8

    move/from16 v54, v10

    move-object/from16 v8, v40

    move-object/from16 v10, v50

    move-object/from16 v40, v11

    move-object/from16 v11, p0

    invoke-static/range {v7 .. v46}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v11, v40

    const/high16 v7, 0x3f800000    # 1.0f

    move-object/from16 v8, v51

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v5}, Luw1/h;->c()Lny0/h;

    move-result-object v12

    invoke-virtual {v5}, Luw1/h;->g()Z

    move-result v8

    if-eqz v8, :cond_16

    sget-object v8, Lny0/p;->LIGHT_BACKGROUND:Lny0/p;

    :goto_b
    move-object/from16 v19, v8

    goto :goto_c

    :cond_16
    sget-object v8, Lny0/p;->DEFAULT:Lny0/p;

    goto :goto_b

    :goto_c
    invoke-virtual {v5}, Luw1/h;->g()Z

    move-result v29

    const v38, 0x1feffbf

    const/16 v39, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    invoke-static/range {v12 .. v39}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v8

    and-int/lit8 v9, v53, 0x70

    const/16 v10, 0x20

    if-eq v9, v10, :cond_18

    and-int/lit8 v9, v53, 0x40

    if-eqz v9, :cond_17

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_17

    goto :goto_d

    :cond_17
    const/4 v14, 0x0

    goto :goto_e

    :cond_18
    :goto_d
    const/4 v14, 0x1

    :goto_e
    if-ne v0, v3, :cond_19

    const/4 v0, 0x1

    goto :goto_f

    :cond_19
    const/4 v0, 0x0

    :goto_f
    or-int/2addr v0, v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_1a

    if-ne v3, v4, :cond_1b

    :cond_1a
    new-instance v3, Lwr0/r;

    const/16 v0, 0xd

    invoke-direct {v3, v0, v5, v6}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v10, v3

    check-cast v10, Lc93/a;

    sget v0, Lny0/h;->z:I

    const/4 v3, 0x3

    shl-int/2addr v0, v3

    or-int/lit8 v12, v0, 0x6

    const/4 v13, 0x4

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5}, Luw1/h;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_1c

    goto :goto_10

    :cond_1c
    move-object/from16 v0, v48

    :goto_10
    if-nez v0, :cond_1d

    const v0, -0x7e3571df

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_11
    const/4 v0, 0x1

    goto :goto_12

    :cond_1d
    const v4, -0x7e3571de

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    move/from16 v4, v54

    invoke-static {v0, v11, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    new-instance v0, Lw3/k;

    invoke-direct {v0, v3}, Lw3/k;-><init>(I)V

    shl-int/lit8 v31, v52, 0x12

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

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_12
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v47

    goto :goto_13

    :cond_1e
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Lwr0/f;

    const/16 v3, 0x11

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxw1/e$b;

    invoke-direct {v0, p1}, Lxw1/e$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Luw1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Luw1/h;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lxw1/e$a;

    invoke-virtual {p0}, Luw1/h;->e()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lxw1/e$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lxw1/f;->e(Landroidx/compose/ui/Modifier;Luw1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
