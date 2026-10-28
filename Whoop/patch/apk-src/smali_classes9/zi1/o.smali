.class public abstract Lzi1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lyi1/l;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lyi1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "navigationTextBiasWeight",
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
.method public static synthetic a(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lzi1/o;->g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyi1/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzi1/o;->h(Lyi1/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi1/o;->f(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyi1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lyi1/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "itemState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, 0x53159341

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    if-eq v4, v6, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v11, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_18

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->g:Ll0/h;

    sget-object v13, Lb2/e;->J:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v12, v13, v11, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move v13, v6

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_6

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move/from16 v17, v13

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_7
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v10, v13, :cond_9

    invoke-static {v4, v11}, Ld;->v(FLp1/q;)Lp1/g1;

    move-result-object v10

    :cond_9
    move-object/from16 v30, v10

    check-cast v30, Lp1/z0;

    invoke-virtual {v0}, Lyi1/l;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v11, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v14, Ly2/d;->a:Ly2/m;

    new-instance v8, Landroidx/compose/foundation/layout/WithAlignmentLineElement;

    invoke-direct {v8, v14}, Landroidx/compose/foundation/layout/WithAlignmentLineElement;-><init>(Ly2/a;)V

    const/high16 v14, 0x40000000    # 2.0f

    move/from16 v31, v3

    move-object/from16 v20, v4

    float-to-double v3, v14

    const-wide/16 v32, 0x0

    cmpl-double v3, v3, v32

    const-string v34, "invalid weight; must be greater than zero"

    if-lez v3, :cond_a

    goto :goto_6

    :cond_a
    invoke-static/range {v34 .. v34}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v35, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v14, v35

    if-lez v4, :cond_b

    move/from16 v14, v35

    :cond_b
    const/4 v4, 0x1

    invoke-direct {v3, v14, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v8, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v8, v11, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Ly81/i;->y()J

    move-result-wide v21

    invoke-virtual {v8, v11, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    sget v19, Lb91/a;->d:I

    shl-int/lit8 v28, v19, 0x12

    const v29, 0x2fff8

    move-object/from16 v17, v8

    move-object/from16 v19, v9

    const-wide/16 v8, 0x0

    move/from16 v23, v10

    const/4 v10, 0x0

    move-object/from16 v26, v11

    const/4 v11, 0x0

    move-object/from16 v25, v12

    const/4 v12, 0x0

    move-object/from16 v36, v13

    move/from16 v27, v14

    const-wide/16 v13, 0x0

    move-object/from16 v37, v15

    const/4 v15, 0x0

    const/16 v38, 0x0

    const/16 v16, 0x0

    move-object/from16 v39, v17

    const/16 v40, 0x36

    const-wide/16 v17, 0x0

    move-object/from16 v41, v19

    const/16 v19, 0x0

    move/from16 v42, v4

    move-object/from16 v4, v20

    const/16 v20, 0x0

    move-object/from16 v43, v6

    move-wide/from16 v53, v21

    move-object/from16 v22, v7

    move-wide/from16 v6, v53

    const/16 v21, 0x0

    move-object/from16 v44, v22

    const/16 v22, 0x0

    move/from16 v45, v23

    const/16 v23, 0x0

    move-object/from16 v46, v25

    const/16 v25, 0x0

    move/from16 v47, v27

    const/16 v27, 0x0

    move-object/from16 v52, v5

    move-object/from16 v2, v36

    move-object/from16 v48, v37

    move-object/from16 v0, v41

    move-object/from16 v51, v43

    move-object/from16 v49, v44

    move-object/from16 v50, v46

    move-object v5, v3

    move/from16 v3, v45

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v26

    invoke-virtual/range {p0 .. p0}, Lyi1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lyi1/l;->f()Lcom/whoop/navigation/e;

    move-result-object v4

    if-eqz v4, :cond_17

    const v5, -0x506755e6

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_c

    if-ne v6, v2, :cond_d

    :cond_c
    new-instance v6, Lr51/d;

    const/16 v5, 0xf

    invoke-direct {v6, v3, v5}, Lr51/d;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x0

    invoke-static {v0, v3, v6}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static/range {v30 .. v30}, Lzi1/o;->e(Lp1/z0;)F

    move-result v3

    float-to-double v6, v3

    cmpl-double v6, v6, v32

    if-lez v6, :cond_e

    goto :goto_7

    :cond_e
    invoke-static/range {v34 .. v34}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v3, v35

    if-lez v7, :cond_f

    move/from16 v3, v35

    :cond_f
    const/4 v7, 0x1

    invoke-direct {v6, v3, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v5, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->b:Ll0/e;

    const/16 v7, 0x36

    invoke-static {v6, v5, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_10

    move-object/from16 v8, v48

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v8, v49

    goto :goto_9

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v11, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v50

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    move-object/from16 v5, v51

    goto :goto_b

    :cond_12
    :goto_a
    move-object/from16 v5, v52

    goto :goto_c

    :goto_b
    invoke-static {v6, v11, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lyi1/l;->d()I

    move-result v3

    const/4 v5, 0x0

    invoke-static {v3, v11, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v3

    const/4 v7, 0x1

    int-to-float v5, v7

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v12, v0

    move/from16 v16, v5

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v5, 0x18

    int-to-float v5, v5

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    invoke-static {v0, v5}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_13

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v5

    :cond_13
    move-object v13, v5

    check-cast v13, Lj0/i;

    sget-object v5, Landroidx/compose/foundation/d;->a:Lp1/b0;

    invoke-virtual {v11, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    move-object v14, v5

    check-cast v14, Lf0/v0;

    and-int/lit8 v5, v31, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_14

    const/4 v7, 0x1

    goto :goto_d

    :cond_14
    const/4 v7, 0x0

    :goto_d
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_15

    if-ne v6, v2, :cond_16

    :cond_15
    new-instance v6, Lck1/l;

    const/16 v2, 0x10

    invoke-direct {v6, v1, v4, v2}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v17, v6

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v0, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v0, v39

    move/from16 v2, v47

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    new-instance v10, Li2/p;

    const/4 v0, 0x5

    invoke-direct {v10, v4, v5, v0}, Li2/p;-><init>(JI)V

    const/16 v12, 0x30

    const/16 v13, 0x38

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v3

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x1

    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_17
    const/4 v3, 0x0

    const/4 v7, 0x1

    const v0, -0x50581fe3

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_18
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_19

    new-instance v2, Lyf1/e;

    const/16 v3, 0x12

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v1, v5, v3}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final e(Lp1/z0;)F
    .locals 0

    check-cast p0, Lp1/g1;

    invoke-virtual {p0}, Lp1/g1;->x()F

    move-result p0

    return p0
.end method

.method private static final f(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    const/4 p0, 0x0

    invoke-static {p1, p0}, Li3/w;->i(Li3/z;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    new-instance v0, Lxi1/a$i;

    invoke-direct {v0, p1}, Lxi1/a$i;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lyi1/l;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzi1/o;->d(Lyi1/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
