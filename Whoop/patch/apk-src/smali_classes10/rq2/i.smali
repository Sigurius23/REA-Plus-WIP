.class public abstract Lrq2/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a!\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\u0010\u001a\u00020\u00042\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lrq2/f;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "g",
        "(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V",
        "Lkd1/o;",
        "image",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "n",
        "(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
        "text",
        "l",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lrq2/f;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/i;->h(Lrq2/f;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lrq2/i;->i()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lrq2/i;->o(Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lrq2/i;->m(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/i;->k(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrq2/i;->j(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x299fc544

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

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Llz1/a;

    const/16 v2, 0x13

    invoke-direct {v1, p0, v2}, Llz1/a;-><init>(Ljava/lang/Object;I)V

    const v2, 0x351f9772

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lrq2/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lrq2/h;-><init>(Lrq2/f;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final h(Lrq2/f;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    move-object/from16 v9, p2

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v12, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x401a000000000000L    # 6.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v2, v1

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->a:Ll0/e;

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v14, v2

    mul-float/2addr v1, v14

    sget-object v2, Lb2/e;->L:Lb2/l;

    invoke-static {v1, v2}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v1

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v2, 0x6

    invoke-static {v1, v15, v9, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object v3, v9

    check-cast v3, Lp1/q;

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    iget-object v7, v3, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_0
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v3, Lp1/q;->S:Z

    if-nez v5, :cond_1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    :cond_1
    invoke-static {v4, v3, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->i()Lv41/r0;

    move-result-object v1

    sget-object v26, Ll83/a0;->a:Ll83/a0;

    const/4 v0, 0x0

    const/4 v4, 0x1

    const/16 v16, 0x0

    sget-object v5, Ll0/z;->a:Ll0/z;

    if-nez v1, :cond_3

    const v1, -0x3f2fb8db

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move v12, v0

    move/from16 v17, v2

    move-object/from16 v27, v5

    move/from16 v22, v14

    move-object/from16 p3, v15

    move-object/from16 v0, v16

    move-object v14, v3

    move v15, v4

    goto :goto_1

    :cond_3
    const v6, -0x3f2fb8da

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v13, v4, v12}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v12, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_4

    new-instance v7, Lri2/a;

    const/16 v10, 0x12

    invoke-direct {v7, v10}, Lri2/a;-><init>(I)V

    invoke-virtual {v3, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v7, Lc93/a;

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v8, :cond_5

    new-instance v10, Lrm2/d;

    const/16 v8, 0x9

    invoke-direct {v10, v8}, Lrm2/d;-><init>(I)V

    invoke-virtual {v3, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v10, Lkotlin/jvm/functions/Function1;

    move v8, v0

    move-object v0, v6

    move-object v6, v10

    const v10, 0xdb6000

    const/16 v11, 0x10c

    move/from16 v17, v2

    const/4 v2, 0x0

    move-object/from16 v18, v3

    const/4 v3, 0x0

    move/from16 v19, v4

    const/4 v4, 0x1

    move-object/from16 v20, v5

    move-object v5, v7

    sget-object v7, Ly2/j;->b:Ly2/b1;

    move/from16 v21, v8

    const/4 v8, 0x0

    move/from16 v22, v14

    move-object/from16 p3, v15

    move-object/from16 v14, v18

    move/from16 v15, v19

    move-object/from16 v27, v20

    move/from16 v12, v21

    invoke-static/range {v0 .. v11}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object/from16 v0, v26

    :goto_1
    if-nez v0, :cond_6

    const v0, -0x3f29a1a6

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    move-object/from16 v1, v27

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v1, v13, v15, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->h()Lkd1/o;

    move-result-object v0

    sget v3, Lkd1/o;->a:I

    invoke-static {v0, v2, v9, v3, v12}, Lrq2/i;->n(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_6
    move-object/from16 v1, v27

    const v0, 0x6384239

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual/range {p0 .. p0}, Lrq2/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v2, 0x2

    const/4 v3, 0x5

    const/4 v4, 0x0

    if-nez v0, :cond_7

    const v0, -0x3f25a39f

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_7
    const v0, -0x3f25a39e

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v5, v3

    mul-float v5, v5, v22

    invoke-static {v0, v5, v4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v5, p3

    invoke-virtual {v1, v0, v5}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v6, 0x3

    shl-int/lit8 v6, v6, 0x6

    or-int/2addr v6, v7

    invoke-static {v0, v1, v5, v9, v6}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object/from16 v16, v26

    :goto_3
    if-nez v16, :cond_9

    const v0, -0x3f1fd458

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->j()Ljava/util/List;

    move-result-object v0

    invoke-static {v0, v9, v12}, Lrq2/i;->l(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_8

    const v0, -0x4198969

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/f;->g()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljr2/c;->h(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v9, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v21

    invoke-virtual {v1, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

    move-result-wide v5

    int-to-float v1, v3

    mul-float v1, v1, v22

    invoke-static {v13, v1, v4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v24, v2, 0x15

    const v25, 0x1fff8

    move-wide v2, v5

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    move-object/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move/from16 v28, v23

    const/16 v23, 0x30

    move-object/from16 v29, v22

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v29

    const/4 v12, 0x0

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    const v0, -0x4148365

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v15, 0x1

    goto :goto_6

    :cond_9
    const v0, 0x63896ec

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    return-object v26
.end method

.method private static final i()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lrq2/f;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/i;->g(Lrq2/f;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/user/journey/model/yearinreview/HighlightedText;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "text"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0xbb66344

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    if-eq v6, v5, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v2, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v0}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v2, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v24

    invoke-virtual {v6, v2, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    const/4 v8, 0x5

    int-to-float v8, v8

    int-to-float v4, v4

    mul-float/2addr v8, v4

    const/4 v4, 0x0

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v8, v4, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v27, v5, 0x15

    const v28, 0x1fff8

    move-wide v5, v6

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x30

    move-object/from16 v25, v2

    invoke-static/range {v3 .. v28}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    goto :goto_3

    :cond_3
    move-object/from16 v25, v2

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_3
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_4

    new-instance v3, Lbm0/o;

    const/16 v4, 0x15

    invoke-direct {v3, v0, v1, v4}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method private static final m(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lrq2/i;->l(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    const-string v0, "image"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const v0, 0x18df62c

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    goto :goto_4

    :cond_3
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_5

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x20

    goto :goto_3

    :cond_4
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    :goto_4
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v5, 0x0

    const/4 v11, 0x1

    if-eq v2, v3, :cond_6

    move v2, v11

    goto :goto_5

    :cond_6
    move v2, v5

    :goto_5
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v1, :cond_7

    sget-object p1, Lb2/t;->w:Lb2/t;

    :cond_7
    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v2, v4, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v1, Lkd1/o;->a:I

    and-int/lit8 v0, v0, 0xe

    or-int v5, v1, v0

    const/4 v6, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v0

    sget v1, Lyp2/c;->l:I

    invoke-static {v4, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    const/4 v9, 0x0

    const/16 v10, 0x7c

    move-object v8, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    :goto_7
    move-object v7, p1

    goto :goto_8

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    goto :goto_7

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v5, Lgz2/a;

    const/4 v10, 0x2

    move-object v6, p0

    move v8, p3

    move/from16 v9, p4

    invoke-direct/range {v5 .. v10}, Lgz2/a;-><init>(Lkd1/o;Landroidx/compose/ui/Modifier;III)V

    iput-object v5, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final o(Lkd1/o;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lrq2/i;->n(Lkd1/o;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
