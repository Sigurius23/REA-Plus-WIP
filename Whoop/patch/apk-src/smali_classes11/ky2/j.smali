.class public abstract Lky2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lky2/g$f;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "Ll83/a0;",
        "onNavEvent",
        "d",
        "(Lky2/g$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lky2/j;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lky2/g$f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lky2/j;->g(Lky2/g$f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lky2/g$f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lky2/j;->e(Lkotlin/jvm/functions/Function1;Lky2/g$f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lky2/g$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lky2/g$f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onNavEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, 0x6ff4c1d1

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

    const/16 v12, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v12

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v13, 0x12

    const/4 v6, 0x0

    if-eq v4, v13, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v11, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v11, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v11, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v5, v4

    invoke-virtual {v0}, Lky2/g$f;->a()Lkd1/o;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    move-object v7, v9

    const/4 v9, 0x3

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object/from16 v22, v6

    const/4 v6, 0x0

    move-object/from16 v16, v11

    move-object v11, v7

    move-object/from16 v7, v16

    const/16 v16, 0x1

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move-object/from16 v18, v7

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v7, v12

    const v12, 0x361b0

    move v8, v13

    const/16 v13, 0x48

    move v9, v5

    const/4 v5, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v23, v8

    sget-object v8, Ly2/j;->a:Ly2/b1;

    move/from16 v24, v9

    const v9, 0x3ecccccd    # 0.4f

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v26, v3

    move-object v1, v11

    move-object/from16 v11, v18

    move-object/from16 v2, v21

    move-object/from16 v3, v22

    move/from16 v0, v24

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v4, v14}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Li2/t;->b:Li2/s;

    sget-wide v6, Li2/x;->m:J

    new-instance v8, Li2/x;

    invoke-direct {v8, v6, v7}, Li2/x;-><init>(J)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->t()J

    move-result-wide v9

    new-instance v12, Li2/x;

    invoke-direct {v12, v9, v10}, Li2/x;-><init>(J)V

    invoke-virtual {v6, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->u()J

    move-result-wide v9

    new-instance v13, Li2/x;

    invoke-direct {v13, v9, v10}, Li2/x;-><init>(J)V

    sget-wide v9, Li2/x;->b:J

    new-instance v0, Li2/x;

    invoke-direct {v0, v9, v10}, Li2/x;-><init>(J)V

    filled-new-array {v8, v12, v13, v0}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v8, 0x0

    const/16 v9, 0xe

    invoke-static {v5, v0, v8, v8, v9}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    const/4 v5, 0x0

    const/4 v10, 0x6

    invoke-static {v4, v0, v5, v8, v10}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v11, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v8, 0x8

    int-to-float v12, v8

    mul-float v13, v0, v12

    const/4 v8, 0x5

    int-to-float v10, v8

    mul-float/2addr v10, v12

    invoke-static {v5, v13, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v10, 0x1

    invoke-static {v4, v11, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v12

    invoke-static {v5, v12, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v12, v11, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v11, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    goto :goto_8

    :cond_a
    :goto_7
    move-object/from16 v1, v25

    goto :goto_9

    :cond_b
    :goto_8
    invoke-static {v12, v11, v12, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v11, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v1, v9

    const-wide/16 v8, 0x0

    cmpl-double v1, v1, v8

    if-lez v1, :cond_c

    move v5, v10

    goto :goto_a

    :cond_c
    move v5, v4

    :goto_a
    if-nez v5, :cond_d

    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_d
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v1, v9, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$f;->d()I

    move-result v1

    invoke-static {v1, v11, v4}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lky2/g$f;->e()Ly81/f;

    move-result-object v2

    invoke-virtual {v2, v11, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    move/from16 v27, v10

    new-instance v10, Li2/p;

    const/4 v5, 0x5

    invoke-direct {v10, v2, v3, v5}, Li2/p;-><init>(JI)V

    const/16 v12, 0x1b0

    const/16 v13, 0x38

    const-string v5, ""

    move v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v3, v4

    move-object v4, v1

    move-object v1, v6

    move-object v6, v14

    move v14, v3

    move/from16 v3, v27

    const/16 v16, 0x8

    const/16 v17, 0x6

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v6

    const/4 v4, 0x4

    int-to-float v6, v4

    mul-float v7, v0, v6

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v11, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lky2/g$f;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v11, v14}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move v8, v4

    move-object v4, v7

    invoke-static {v11, v14}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    sget v9, Liz0/m;->p:I

    const/16 v19, 0x9

    shl-int/lit8 v9, v9, 0x9

    const/16 v15, 0x1f6

    move-object v10, v5

    const/4 v5, 0x0

    move v12, v6

    const/4 v6, 0x0

    move v13, v8

    const/4 v8, 0x0

    move/from16 v18, v14

    move v14, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v13

    move-object v13, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v18, v0

    move-object/from16 v0, v20

    move/from16 v3, v22

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v11, v13

    const/16 v4, 0xb

    int-to-float v4, v4

    invoke-static {v4, v3, v0, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lky2/g$f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v4

    move/from16 v6, v18

    invoke-static {v6, v4, v5}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v18

    const/16 v4, 0x10

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lg1/v0;->a:Ll0/l1;

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->V0()J

    move-result-wide v4

    invoke-virtual {v1, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v6

    const/4 v13, 0x0

    const/16 v14, 0xc

    const-wide/16 v8, 0x0

    move-object v12, v11

    const-wide/16 v10, 0x0

    invoke-static/range {v4 .. v14}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v11

    and-int/lit8 v1, v26, 0x70

    const/16 v7, 0x20

    if-ne v1, v7, :cond_e

    const/4 v5, 0x1

    goto :goto_b

    :cond_e
    const/4 v5, 0x0

    :goto_b
    and-int/lit8 v1, v26, 0xe

    const/4 v13, 0x4

    if-eq v1, v13, :cond_11

    and-int/lit8 v1, v26, 0x8

    if-eqz v1, :cond_f

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_10

    goto :goto_c

    :cond_f
    move-object/from16 v1, p0

    :cond_10
    const/4 v2, 0x0

    goto :goto_d

    :cond_11
    move-object/from16 v1, p0

    :goto_c
    const/4 v2, 0x1

    :goto_d
    or-int/2addr v2, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_13

    if-ne v4, v5, :cond_12

    goto :goto_e

    :cond_12
    move-object/from16 v6, p1

    goto :goto_f

    :cond_13
    :goto_e
    new-instance v4, Lj11/q;

    const/16 v2, 0x1c

    move-object/from16 v6, p1

    invoke-direct {v4, v2, v6, v1}, Lj11/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    check-cast v4, Lc93/a;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v2, v2, 0x12

    or-int/lit8 v19, v2, 0x6

    const/16 v20, 0x6

    const/16 v21, 0x193e

    move-object v2, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object v10, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v14, v18

    move-object/from16 v18, v13

    move-object v13, v14

    move v14, v3

    move-object/from16 v17, v4

    move-object v4, v0

    move-object/from16 v0, p1

    invoke-static/range {v4 .. v21}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v18

    const/4 v3, 0x1

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v2, :cond_14

    new-instance v4, Lku2/a;

    const/16 v2, 0x17

    invoke-direct {v4, v2}, Lku2/a;-><init>(I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/a;

    const/16 v2, 0x36

    const/4 v14, 0x0

    invoke-static {v4, v3, v11, v2, v14}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_10

    :cond_15
    move-object/from16 v28, v1

    move-object v1, v0

    move-object/from16 v0, v28

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_16

    new-instance v3, Lkl2/f;

    move/from16 v4, p3

    const/16 v5, 0x9

    invoke-direct {v3, v1, v0, v4, v5}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lky2/g$f;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lky2/g$f;->f()Lcom/whoop/whooplabs/feature/navigation/c;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lky2/g$f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lky2/j;->d(Lky2/g$f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
