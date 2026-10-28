.class public abstract Lrq2/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/y;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "e",
        "(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lrq2/y;ZLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/a0;->f(Lrq2/y;ZLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lrq2/y;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/a0;->i(Lrq2/y;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lrq2/a0;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrq2/a0;->h(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)V
    .locals 5

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x41b19e98

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-virtual {p0}, Lrq2/y;->r()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lrq2/y;->q()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    invoke-virtual {p0}, Lrq2/y;->n()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-static {v1}, Lor2/o1;->d(Ljava/lang/String;)Z

    move-result v1

    if-ne v1, v4, :cond_6

    :cond_5
    move v3, v4

    :cond_6
    new-instance v1, Ler2/d;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v3, v2}, Ler2/d;-><init>(Ljava/lang/Object;ZI)V

    const v2, -0x79dc4e62

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_7
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_8

    new-instance v0, Lrq2/z;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/z;-><init>(Lrq2/y;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final f(Lrq2/y;ZLc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 58

    move-object/from16 v3, p3

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p2

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v12, Lb2/e;->w:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object v14, v3

    check-cast v14, Lp1/q;

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    iget-object v5, v14, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-eqz v5, :cond_0

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v3, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-static {v2, v14, v2, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v3, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->e()Lkd1/o;

    move-result-object v0

    sget-object v16, Ly2/j;->b:Ly2/b1;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_3

    const v0, 0x3b7a54e8

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v10, v6

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    move v0, v13

    move-object/from16 v29, v16

    move-object v13, v7

    goto :goto_1

    :cond_3
    const v4, 0x3b7a54e9

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    move/from16 v17, v1

    const/4 v1, 0x0

    move/from16 v18, v2

    const/4 v2, 0x0

    move-object/from16 p4, v6

    move/from16 v13, v17

    move/from16 v6, v18

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    sget v1, Lyp2/c;->q:I

    invoke-static {v3, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x8c

    int-to-float v2, v2

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v2, v4

    invoke-static {v11, v13, v2, v6}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v4, v8

    const/16 v8, 0x6180

    move-object v5, v9

    const/16 v9, 0x68

    const/4 v3, 0x0

    move-object/from16 v17, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v10, p4

    move-object/from16 v26, v4

    move-object v13, v7

    move-object/from16 v4, v16

    move-object/from16 v27, v17

    move-object/from16 v7, p3

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v29, v4

    move-object v3, v7

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    :goto_1
    sget-object v1, Lb2/e;->x:Lb2/m;

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v2, v11, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v12, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v14, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    move-object/from16 v5, v26

    goto :goto_4

    :cond_6
    move-object/from16 v5, v26

    :goto_3
    move-object/from16 v6, v27

    goto :goto_5

    :goto_4
    invoke-static {v6, v14, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_3

    :goto_5
    invoke-static {v3, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v4, v0

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->f()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lrq2/c0;->y(Ljava/lang/String;)D

    move-result-wide v7

    sget-object v9, Li2/t;->b:Li2/s;

    move-object/from16 v26, v5

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->l()J

    move-result-wide v4

    new-instance v12, Li2/x;

    invoke-direct {v12, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->l()J

    move-result-wide v4

    move-object/from16 p4, v0

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v0, Li2/x;

    invoke-direct {v0, v4, v5}, Li2/x;-><init>(J)V

    filled-new-array {v12, v0}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/16 v4, 0xe

    const/4 v5, 0x0

    invoke-static {v9, v0, v5, v5, v4}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    invoke-static {v7, v8, v0}, Ljr2/c;->g(DLi2/t;)Lb91/a;

    move-result-object v20

    invoke-virtual {v2, v11, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->f()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->k()Lv41/r0;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->j()Lkd1/o;

    move-result-object v8

    invoke-static {v4, v7, v8}, Lrq2/c0;->x(Ljava/lang/String;Lv41/r0;Lkd1/o;)F

    move-result v4

    const/4 v7, 0x1

    invoke-static {v0, v5, v4, v7}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v27, Lb91/a;->d:I

    shl-int/lit8 v24, v27, 0x12

    const v25, 0x2fffc

    move-object v4, v2

    const-wide/16 v2, 0x0

    move-object v8, v4

    move/from16 v17, v5

    const-wide/16 v4, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move/from16 v18, v7

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    move-object/from16 v16, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v30, v13

    move-object/from16 v28, v14

    const-wide/16 v13, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    move/from16 v33, v17

    const/16 v17, 0x0

    move/from16 v34, v18

    const/16 v18, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v19, 0x0

    move-object/from16 v36, v21

    const/16 v21, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v45, v1

    move-object/from16 v46, v22

    move-object/from16 v43, v26

    move-object/from16 v39, v28

    move-object/from16 v42, v30

    move-object/from16 v40, v31

    move-object/from16 v41, v32

    move-object/from16 v44, v36

    move-object/from16 v49, v37

    move-object/from16 v22, p3

    move-object v1, v0

    move-object/from16 v0, p4

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v39

    const/4 v13, 0x1

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->k()Lv41/r0;

    move-result-object v1

    sget-object v26, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_7

    const v0, 0x3b8d5218

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    move-object/from16 v15, v46

    move-object/from16 v50, v49

    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_7
    const/4 v14, 0x0

    const v0, 0x3b8d5219

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v15, v46

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v45

    move-object/from16 v4, v49

    invoke-virtual {v4, v2, v3}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_8

    new-instance v5, Lri2/a;

    const/16 v7, 0x14

    invoke-direct {v5, v7}, Lri2/a;-><init>(I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lc93/a;

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_9

    new-instance v7, Lrm2/d;

    const/16 v6, 0xb

    invoke-direct {v7, v6}, Lrm2/d;-><init>(I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, v7

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const v10, 0xdb6000

    const/16 v11, 0x10c

    move/from16 v48, v0

    move-object v0, v2

    const/4 v2, 0x0

    move-object/from16 v45, v3

    const/4 v3, 0x0

    move-object/from16 v49, v4

    const/4 v4, 0x1

    const/4 v8, 0x0

    move-object/from16 v9, p3

    move-object/from16 v7, v29

    move/from16 v13, v48

    move-object/from16 v50, v49

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object/from16 v0, v26

    :goto_6
    if-nez v0, :cond_b

    const v0, 0x3b93f397

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->j()Lkd1/o;

    move-result-object v1

    if-nez v1, :cond_a

    const v0, 0x3b93f396

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object/from16 v3, p3

    move-object/from16 v10, v50

    const/4 v11, 0x0

    const/16 v18, 0x1

    goto :goto_7

    :cond_a
    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget v4, Lkd1/o;->a:I

    const/4 v5, 0x3

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v3, p3

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    sget v1, Lyp2/c;->q:I

    invoke-static {v3, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v4, v45

    move-object/from16 v10, v50

    invoke-virtual {v10, v2, v4}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v4, 0x64

    int-to-float v4, v4

    const/4 v5, 0x1

    const/4 v11, 0x0

    invoke-static {v2, v11, v4, v5}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x6000

    const/16 v9, 0x68

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->d:Ly2/b1;

    move/from16 v18, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v7, p3

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    move-object/from16 v3, p3

    move-object/from16 v10, v50

    const/4 v11, 0x0

    const/16 v18, 0x1

    const v0, 0x65048e74

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_8
    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    const/4 v4, 0x2

    invoke-static {v0, v1, v11, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-virtual {v10, v0, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v5, v3, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v3, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    move-object/from16 v8, v40

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_9
    move-object/from16 v10, v41

    goto :goto_a

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_9

    :goto_a
    invoke-static {v3, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v42

    invoke-static {v3, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    move-object/from16 v1, v43

    goto :goto_c

    :cond_e
    :goto_b
    move-object/from16 v6, v44

    goto :goto_d

    :goto_c
    invoke-static {v6, v12, v6, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_b

    :goto_d
    invoke-static {v3, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->o()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_11

    const v0, -0xd54ed5d

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->o()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->N()Lb91/a;

    move-result-object v21

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lb2/e;->N:Lb2/k;

    invoke-static {v7, v6}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shl-int/lit8 v24, v27, 0x15

    const v25, 0x1fffc

    move v7, v2

    const-wide/16 v2, 0x0

    move v9, v4

    move v8, v5

    const-wide/16 v4, 0x0

    move-object v10, v1

    move-object v1, v6

    const/4 v6, 0x0

    move v11, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move/from16 v17, v9

    move-object/from16 v16, v10

    const-wide/16 v9, 0x0

    move/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v28, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    move/from16 v38, v14

    const-wide/16 v13, 0x0

    move-object/from16 v46, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v47, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v52, v22

    move-object/from16 v51, v28

    move/from16 v53, v29

    move-object/from16 v54, v46

    move-object/from16 v22, p3

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v22

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->i()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_f

    const v0, -0xd4f3004

    move-object/from16 v1, v51

    invoke-virtual {v1, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    move-object v12, v1

    move v14, v2

    move-object/from16 v56, v54

    goto/16 :goto_f

    :cond_f
    move-object/from16 v1, v51

    const/4 v2, 0x0

    const v4, -0xd4f3003

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x2

    int-to-float v5, v4

    mul-float v5, v5, v27

    move-object/from16 v6, v54

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v3, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_10

    const v5, 0x3c63f51c

    invoke-virtual {v1, v5}, Lp1/q;->e0(I)V

    invoke-static {v0}, Ljr2/c;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v10, v52

    move/from16 v13, v53

    invoke-virtual {v10, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v10, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v7

    const/16 v23, 0x0

    const v25, 0x1fffa

    move-object/from16 v28, v1

    const/4 v1, 0x0

    move/from16 v30, v4

    const-wide/16 v4, 0x0

    move-object/from16 v46, v6

    const/4 v6, 0x0

    move/from16 v38, v2

    move-wide v2, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v22, p3

    move-object/from16 v55, v28

    move-object/from16 v56, v46

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v22

    move-object/from16 v12, v55

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_10
    move-object v12, v1

    move v14, v2

    move-object/from16 v56, v6

    const v0, 0x3c68225e

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object/from16 v15, v56

    goto :goto_10

    :cond_11
    move/from16 v27, v2

    move-object/from16 v56, v15

    const v0, -0xd47ef0a

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-static {v13, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, v0}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v4, 0x3

    shl-int/lit8 v4, v4, 0x6

    or-int/2addr v4, v5

    invoke-static {v0, v1, v2, v3, v4}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_10
    if-eqz p1, :cond_15

    const v0, -0xd423115

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v4, 0x2

    int-to-float v0, v4

    mul-float v0, v0, v27

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v3, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/y;->n()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_12

    const-string v0, ""

    :cond_12
    invoke-virtual/range {p0 .. p0}, Lrq2/y;->q()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    move v1, v13

    goto :goto_11

    :cond_13
    move v1, v14

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lrq2/y;->r()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    move v2, v13

    goto :goto_12

    :cond_14
    move v2, v14

    :goto_12
    invoke-virtual/range {p0 .. p0}, Lrq2/y;->m()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    move-object/from16 v57, v4

    move-object v4, v3

    move-object/from16 v3, v57

    invoke-static/range {v0 .. v5}, Lyq2/a;->c(Ljava/lang/String;ZZLjava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v13, 0x1

    goto :goto_14

    :cond_15
    const v0, -0xd3c22b8

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    return-object v26
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lrq2/y;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/a0;->e(Lrq2/y;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
