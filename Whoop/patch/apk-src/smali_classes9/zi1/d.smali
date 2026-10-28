.class public abstract Lzi1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lyi1/k;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "kennel_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi1/d;->e(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyi1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi1/d;->d(Lyi1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 69
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lyi1/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "modifier"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x1afbb70d

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v6, v8, :cond_6

    move v6, v11

    goto :goto_4

    :cond_6
    move v6, v10

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v9, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v13, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v9, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v9, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    :cond_8
    invoke-static {v13, v9, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v9, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lyi1/k;->f()Lyi1/l;

    move-result-object v6

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v8, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v8, v7

    shr-int/lit8 v13, v0, 0x3

    and-int/lit8 v13, v13, 0x70

    or-int/2addr v8, v13

    invoke-static {v6, v3, v9, v8}, Lzi1/o;->d(Lyi1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v6, 0x3

    int-to-float v6, v6

    int-to-float v5, v5

    mul-float/2addr v5, v6

    invoke-static {v5, v12}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lyi1/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v9, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    int-to-float v7, v11

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v16, v7, v8

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v8, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->c1()J

    move-result-wide v14

    invoke-virtual {v8, v9, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v29, v16, 0x12

    const v30, 0x2fff8

    move-object/from16 v27, v9

    move/from16 v16, v10

    const-wide/16 v9, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object/from16 v18, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v5

    move-object v5, v6

    move-object v6, v7

    move-object/from16 v21, v8

    move-wide v7, v14

    const-wide/16 v14, 0x0

    move/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move-object/from16 v26, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move-object/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move-object/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x30

    move-object/from16 v4, v31

    move/from16 v3, v34

    move/from16 v1, v36

    move/from16 v31, v0

    move-object/from16 v0, v35

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v9, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lyi1/k;->e()Ld11/i;

    move-result-object v0

    invoke-virtual {v0}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v0, :cond_c

    invoke-virtual {v2}, Lyi1/k;->e()Ld11/i;

    move-result-object v0

    invoke-virtual {v0}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    goto :goto_6

    :cond_a
    const/4 v0, 0x0

    :goto_6
    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$g6;

    if-eqz v0, :cond_b

    goto :goto_8

    :cond_b
    const v0, -0x7d98b2c3

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lyi1/k;->e()Ld11/i;

    move-result-object v37

    invoke-virtual {v4, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->r()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v40

    invoke-virtual {v4, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v43

    const v67, 0x1fffffdb

    const/16 v68, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    invoke-static/range {v37 .. v68}, Ld11/i;->f(Ld11/i;Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ld11/i;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_7
    move-object v5, v0

    goto :goto_9

    :cond_c
    :goto_8
    const v0, -0x7d9c271c

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lyi1/k;->e()Ld11/i;

    move-result-object v37

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_d

    sget-object v0, Lzi1/d$a;->w:Lzi1/d$a;

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v57

    invoke-static {v4, v9, v3}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v40

    invoke-virtual {v4, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->d()Lb91/a;

    move-result-object v0

    invoke-virtual {v0}, Lb91/a;->d()Ll3/v0;

    move-result-object v43

    const v67, 0x1ff7ffdb

    const/16 v68, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    invoke-static/range {v37 .. v68}, Ld11/i;->f(Ld11/i;Ljava/lang/Object;Lkd1/l;Ll3/v0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/v0;Ly71/g;Lkd1/o;Lkd1/o;Lkd1/o;Lkotlin/jvm/functions/Function1;ZZLd11/a;Lk91/a;Ld11/b;ZZLd11/c;Li91/a;Lj91/b;Li2/t;FFFFFLjava/lang/Object;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ld11/i;

    move-result-object v0

    const/4 v3, 0x0

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_9
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v4, v31

    and-int/lit16 v4, v4, 0x380

    const/16 v6, 0x100

    if-ne v4, v6, :cond_e

    const/4 v10, 0x1

    goto :goto_a

    :cond_e
    move v10, v3

    :goto_a
    or-int/2addr v0, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_10

    if-ne v3, v1, :cond_f

    goto :goto_b

    :cond_f
    move-object/from16 v1, p2

    goto :goto_c

    :cond_10
    :goto_b
    new-instance v3, Lyo1/b;

    const/16 v0, 0x11

    move-object/from16 v1, p2

    invoke-direct {v3, v2, v1, v0}, Lyo1/b;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v8, v3

    check-cast v8, Lc93/a;

    sget v10, Ld11/i;->E:I

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Ld11/f;->k(Ld11/i;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_11
    move-object v1, v3

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lvv2/c;

    const/16 v5, 0x19

    move/from16 v4, p4

    move-object v3, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v5}, Lvv2/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final d(Lyi1/k;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 3

    invoke-virtual {p0}, Lyi1/k;->e()Ld11/i;

    move-result-object v0

    invoke-virtual {v0}, Ld11/i;->x()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lxi1/a$g;

    invoke-virtual {p0}, Lyi1/k;->getEvent()Ljava/lang/Object;

    move-result-object p0

    const-string v2, "null cannot be cast to non-null type com.whoop.health.monitor.medical.domain.HeartHealthAnalyticsType"

    invoke-static {p0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Lvi1/a;

    invoke-direct {v1, p0, v0}, Lxi1/a$g;-><init>(Lvi1/a;Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lzi1/d;->c(Landroidx/compose/ui/Modifier;Lyi1/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
