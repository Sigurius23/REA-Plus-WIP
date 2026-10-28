.class public abstract Lud2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ltd2/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Ltd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "shepherd_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lud2/a;->f(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ltd2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lud2/a;->g(Ltd2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lud2/a;->e(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Ltd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 56
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltd2/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, 0x44b1c9da

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p4, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v7, 0x12

    const/4 v10, 0x0

    if-eq v6, v7, :cond_5

    const/4 v6, 0x1

    goto :goto_4

    :cond_5
    move v6, v10

    :goto_4
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v9, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_12

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v6, :cond_6

    new-instance v3, Lu71/c;

    const/16 v5, 0xe

    invoke-direct {v3, v5}, Lu71/c;-><init>(I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v3, v5

    :goto_5
    invoke-virtual {v1}, Ltd2/a;->a()Lm91/u;

    move-result-object v5

    const-string v11, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.ctatile.CtaTileState"

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v5, Ld11/i;

    int-to-float v11, v2

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    invoke-static {v13, v11, v14, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v15, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move-object/from16 p1, v5

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    move/from16 v16, v7

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v9, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    :cond_9
    invoke-static {v4, v9, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ltd2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v9, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v10, Lx81/d;->a:Lx81/d;

    move-object/from16 v19, v3

    sget v3, Lx81/d;->b:I

    invoke-virtual {v10, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Ly81/i;->c1()J

    move-result-wide v20

    invoke-virtual {v10, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    sget v23, Lb91/a;->d:I

    shl-int/lit8 v26, v23, 0x12

    const v27, 0x2fffa

    move/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 v24, v6

    move-object/from16 v23, v7

    const-wide/16 v6, 0x0

    move/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v28, v24

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    move/from16 v31, v11

    move/from16 v30, v12

    const-wide/16 v11, 0x0

    move-object/from16 v32, v13

    const/4 v13, 0x0

    move-object/from16 v33, v14

    const/4 v14, 0x0

    move-object/from16 v34, v15

    move/from16 v35, v16

    const-wide/16 v15, 0x0

    const/16 v36, 0x1

    const/16 v17, 0x0

    const/16 v37, 0x0

    const/16 v18, 0x0

    move-object/from16 v38, v19

    const/16 v19, 0x0

    move-object/from16 v39, v4

    move-wide/from16 v54, v20

    move-object/from16 v21, v5

    move-wide/from16 v4, v54

    const/16 v20, 0x0

    move-object/from16 v40, v21

    const/16 v21, 0x0

    move-object/from16 v41, v23

    const/16 v23, 0x0

    move/from16 v42, v25

    const/16 v25, 0x0

    move/from16 v43, v0

    move-object/from16 v53, v28

    move-object/from16 v51, v29

    move/from16 v0, v30

    move/from16 v44, v31

    move-object/from16 v1, v32

    move-object/from16 v47, v33

    move-object/from16 v45, v34

    move/from16 v52, v35

    move-object/from16 v49, v39

    move-object/from16 v48, v40

    move-object/from16 v46, v41

    move/from16 v50, v42

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v24

    const/4 v2, 0x3

    int-to-float v2, v2

    invoke-static {v2, v0, v1, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    and-int/lit8 v2, v43, 0x70

    const/16 v3, 0x20

    if-ne v2, v3, :cond_b

    const/4 v8, 0x1

    :goto_7
    move-object/from16 v12, p1

    goto :goto_8

    :cond_b
    const/4 v8, 0x0

    goto :goto_7

    :goto_8
    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_d

    move-object/from16 v2, v53

    if-ne v3, v2, :cond_c

    goto :goto_9

    :cond_c
    move-object/from16 v4, v38

    goto :goto_a

    :cond_d
    :goto_9
    new-instance v3, Lc11/e;

    const/4 v2, 0x4

    move-object/from16 v4, v38

    invoke-direct {v3, v4, v12, v2}, Lc11/e;-><init>(Lkotlin/jvm/functions/Function1;Ld11/i;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    move-object/from16 v17, v3

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object v13, v1

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v14, v51

    move/from16 v15, v52

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->j0()J

    move-result-wide v2

    const v5, 0x3e19999a    # 0.15f

    invoke-static {v5, v2, v3}, Li2/x;->c(FJ)J

    move-result-wide v2

    sget-object v5, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v5}, Lkd1/w;->a()Lk91/a;

    move-result-object v5

    invoke-virtual {v5}, Lk91/a;->c()Lt0/i;

    move-result-object v5

    invoke-static {v1, v2, v3, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x3ff8000000000000L    # 1.5

    double-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->a:Ll0/e;

    const/16 v3, 0x30

    invoke-static {v2, v1, v9, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_e

    move-object/from16 v5, v45

    invoke-virtual {v9, v5}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v5, v46

    goto :goto_c

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v9, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v47

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    :cond_f
    move-object/from16 v1, v48

    goto :goto_e

    :cond_10
    :goto_d
    move-object/from16 v1, v49

    goto :goto_f

    :goto_e
    invoke-static {v2, v9, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12}, Ld11/i;->w()Ly71/g;

    move-result-object v0

    if-nez v0, :cond_11

    const v0, 0x497400e5

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    move-object/from16 v38, v4

    goto :goto_10

    :cond_11
    const/4 v1, 0x0

    const v2, 0x497400e6    # 999438.4f

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ly71/g;->b()I

    move-result v0

    invoke-static {v0, v9, v1}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v2

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j0()J

    move-result-wide v5

    new-instance v8, Li2/p;

    const/4 v0, 0x5

    invoke-direct {v8, v5, v6, v0}, Li2/p;-><init>(JI)V

    const/16 v10, 0x30

    const/16 v11, 0x3c

    const/4 v3, 0x0

    move-object/from16 v38, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move/from16 v11, v44

    invoke-static {v11, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v12}, Ld11/i;->E()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v1, v50

    invoke-static {v0, v9, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v14, v9, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    invoke-virtual {v14, v9, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v22

    const/16 v25, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v24

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v38

    goto :goto_11

    :cond_12
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v5

    :goto_11
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lt80/b;

    const/4 v5, 0x6

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final e(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ld11/i;)Ll83/a0;
    .locals 6

    invoke-virtual {p1}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object p1

    if-nez p1, :cond_0

    new-instance v0, Lcom/whoop/navigation/e;

    sget-object v1, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :cond_0
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ltd2/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lud2/a;->d(Ltd2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
