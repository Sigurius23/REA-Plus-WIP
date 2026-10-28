.class public abstract Lcr2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u0007H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcr2/c;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "e",
        "(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/design/util/TextResource;",
        "wirFooterText",
        "wirFooterSubText",
        "j",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "footerText",
        "h",
        "(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcr2/e;->k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcr2/e;->g(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcr2/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcr2/e;->f(Lcr2/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcr2/e;->i(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "step"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x16d61b08

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

    new-instance v1, Lb30/a1;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, -0x1d352ac2

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

    new-instance v0, Lcr2/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lcr2/d;-><init>(Lcr2/c;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final f(Lcr2/c;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    move-object/from16 v6, p2

    sget-object v13, Lb2/e;->w:Lb2/m;

    const-string v0, "$this$BasicAnimationComponent"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v8, v2

    mul-float/2addr v1, v8

    const/16 v9, 0xc

    int-to-float v2, v9

    mul-float/2addr v2, v8

    const/4 v4, 0x0

    const/16 v5, 0x8

    move v3, v1

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v2, 0x6

    invoke-static {v1, v10, v6, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v11, v6

    check-cast v11, Lp1/q;

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    iget-object v7, v11, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_0

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_0
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-nez v12, :cond_1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move/from16 p1, v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v12, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2

    goto :goto_1

    :cond_1
    move/from16 p1, v9

    :goto_1
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v6, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v9, 0x0

    invoke-static {v1, v10, v6, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object/from16 p3, v10

    iget-wide v9, v11, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v6, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v11, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    :cond_4
    invoke-static {v1, v11, v1, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    invoke-static {v6, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x8ec595e

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcr2/c;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    const/4 v9, 0x0

    :goto_3
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const/4 v10, 0x2

    const/4 v12, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_8

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    add-int/lit8 v18, v9, 0x1

    if-ltz v9, :cond_7

    check-cast v0, Lcr2/g;

    move-object v2, v0

    invoke-virtual {v2}, Lcr2/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v1

    invoke-virtual {v2}, Lcr2/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object v4, v2

    invoke-virtual {v4}, Lcr2/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v5, v3

    invoke-virtual {v4}, Lcr2/g;->a()Lcr2/h;

    move-result-object v3

    move-object v7, v4

    invoke-virtual {v7}, Lcr2/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v7}, Lcr2/g;->c()Lhy0/b2;

    move-result-object v7

    sget v19, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v19, 0x3

    or-int v20, v19, v20

    shl-int/lit8 v21, v19, 0x6

    or-int v20, v20, v21

    shl-int/lit8 v19, v19, 0xc

    or-int v19, v20, v19

    move-object v14, v5

    move-object v5, v7

    move/from16 v7, v19

    invoke-static/range {v0 .. v7}, Lcr2/b;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {p0 .. p0}, Lcr2/c;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    sub-int/2addr v0, v12

    if-eq v9, v0, :cond_6

    const v0, 0xf03d73a

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v10

    mul-float/2addr v0, v8

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v1, Lhy0/g;->DOTTED:Lhy0/g;

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v6, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v2

    new-instance v0, Lhy0/h;

    invoke-direct {v0, v8, v14}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v15, v2, v3, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object v2, v11

    const/16 v11, 0x30

    const/16 v12, 0xfc

    move-object v3, v2

    const/4 v2, 0x0

    move-object v4, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object v7, v5

    const-wide/16 v5, 0x0

    move-object v10, v7

    move v9, v8

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v21, p1

    move-object/from16 v19, v13

    move/from16 v16, v14

    const/4 v13, 0x0

    move-object v14, v10

    move-object/from16 v10, p2

    invoke-static/range {v0 .. v12}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    const/4 v0, 0x3

    int-to-float v0, v0

    mul-float v0, v0, v16

    invoke-static {v0, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    move/from16 v21, p1

    move/from16 v16, v8

    move-object v14, v11

    move-object/from16 v19, v13

    const/4 v13, 0x0

    const v0, 0xf09f49b

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_4
    move-object v11, v14

    move/from16 v8, v16

    move/from16 v9, v18

    move-object/from16 v13, v19

    move/from16 p1, v21

    const/high16 v14, 0x3f800000    # 1.0f

    goto/16 :goto_3

    :cond_7
    move-object v3, v1

    invoke-static {}, Lwb3/f;->d0()V

    throw v3

    :cond_8
    move-object/from16 v0, p3

    move-object v3, v1

    move/from16 v16, v8

    move-object v14, v11

    move-object/from16 v19, v13

    const/4 v13, 0x0

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v4, v1

    const-wide/16 v7, 0x0

    cmpl-double v2, v4, v7

    if-lez v2, :cond_9

    goto :goto_5

    :cond_9
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v4, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v1, v4

    if-lez v5, :cond_a

    move v1, v4

    :cond_a
    invoke-direct {v2, v1, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    int-to-float v1, v10

    mul-float v1, v1, v16

    const/4 v4, 0x0

    invoke-static {v2, v1, v4, v10}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v6, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcr2/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-nez v1, :cond_b

    const v0, 0x101b7aa1

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object/from16 v0, v19

    goto/16 :goto_8

    :cond_b
    const v4, 0x101b7aa2

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcr2/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_c

    const v0, 0x6716cde9

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v1, v3

    move-object/from16 v0, v19

    goto :goto_7

    :cond_c
    const v3, 0x6716cdea

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v0}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    move-object/from16 v0, v19

    invoke-static {v0, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-eqz v10, :cond_d

    invoke-virtual {v14, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_6
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v6, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    :cond_e
    invoke-static {v7, v14, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v6, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v3, 0x3

    or-int/2addr v3, v5

    invoke-static {v1, v4, v6, v3}, Lcr2/e;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v1, v2

    :goto_7
    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v1, :cond_13

    const v1, 0x10200f10

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lb2/e;->O:Lb2/k;

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v1}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-static {v0, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_10

    invoke-virtual {v14, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_9
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v1, v14, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v6, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcr2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v6, v1}, Lcr2/e;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_13
    const v0, -0x28c5500a

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    return-object v2
.end method

.method private static final g(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcr2/e;->e(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 30

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "footerText"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x70701993

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v1, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v1

    goto :goto_2

    :cond_2
    move v3, v1

    :goto_2
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v4, :cond_3

    move v4, v8

    goto :goto_3

    :cond_3
    move v4, v7

    :goto_3
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v2, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->O:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v10, v9, v2, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v2, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v2, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v2, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v2, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v2, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v2, Lp1/q;->S:Z

    if-nez v11, :cond_5

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v10, v2, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v2, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v4, v8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4}, Lt0/j;->e(F)Lt0/i;

    move-result-object v4

    invoke-static {v6, v4}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v9

    if-eqz v9, :cond_7

    const v9, -0x4c6b8d8c

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v7}, Lp1/q;->q(Z)V

    sget-wide v9, Li2/x;->m:J

    goto :goto_5

    :cond_7
    const v9, -0x4c6b8930

    invoke-virtual {v2, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v9, v2, v10, v7}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v9

    :goto_5
    sget-object v11, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v9, v10, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v9, v5

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v10, 0x4012000000000000L    # 4.5

    double-to-float v10, v10

    mul-float/2addr v10, v5

    invoke-static {v10, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v2, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v4, v4

    invoke-static {v4, v9, v6, v2}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v3, 0xe

    or-int/2addr v3, v4

    invoke-static {v0, v2, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v2, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v2, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v5

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move v9, v8

    const-wide/16 v7, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v29, v25

    move-object/from16 v25, v2

    move/from16 v2, v29

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_9

    new-instance v3, Lbm2/b1;

    const/4 v4, 0x1

    invoke-direct {v3, v0, v1, v4}, Lbm2/b1;-><init>(Lcom/whoop/design/util/TextResource;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final i(Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcr2/e;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "wirFooterText"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "wirFooterSubText"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x493a21fa

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_2

    and-int/lit8 v4, p3, 0x8

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_0
    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_1

    :cond_1
    move v4, v5

    :goto_1
    or-int v4, p3, v4

    goto :goto_2

    :cond_2
    move/from16 v4, p3

    :goto_2
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_4

    :cond_4
    const/16 v6, 0x10

    :goto_4
    or-int/2addr v4, v6

    :cond_5
    move/from16 v30, v4

    and-int/lit8 v4, v30, 0x13

    const/4 v6, 0x0

    const/16 v7, 0x12

    const/4 v8, 0x1

    if-eq v4, v7, :cond_6

    move v4, v8

    goto :goto_5

    :cond_6
    move v4, v6

    :goto_5
    and-int/lit8 v9, v30, 0x1

    invoke-virtual {v3, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v11, v3, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v3, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-nez v11, :cond_8

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_9

    :cond_8
    invoke-static {v10, v3, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v3, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v31, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v4, v30, 0xe

    or-int v4, v31, v4

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v6, v3, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v6, v3, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v28, v13, 0x12

    const v29, 0x2fffa

    move v7, v5

    const/4 v5, 0x0

    move v13, v8

    move-object v14, v9

    const-wide/16 v8, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v16, v7

    move-wide/from16 v36, v11

    move-object v12, v6

    move-wide/from16 v6, v36

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    move-object/from16 v19, v14

    const-wide/16 v13, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v21, v16

    const/16 v16, 0x0

    move-object/from16 v22, v17

    move/from16 v23, v18

    const-wide/16 v17, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move/from16 v27, v21

    const/16 v21, 0x0

    move-object/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v35, v27

    const/16 v27, 0x0

    move/from16 v0, v26

    move-object/from16 v26, v3

    move-object/from16 v3, v32

    move/from16 v32, v0

    move/from16 v2, v33

    move-object/from16 v0, v34

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v5, v2

    const/16 v6, 0x8

    int-to-float v6, v6

    invoke-static {v5, v6, v0, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    shr-int/lit8 v5, v30, 0x3

    and-int/lit8 v5, v5, 0xe

    or-int v5, v31, v5

    invoke-static {v1, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    move/from16 v15, v32

    invoke-virtual {v3, v4, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v7

    move-object v4, v5

    const/4 v5, 0x0

    move v3, v6

    move-wide v6, v7

    const-wide/16 v8, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v7, 0x2

    int-to-float v5, v7

    invoke-static {v5, v3, v0, v4, v2}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_7

    :cond_a
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Lam0/c;

    const/4 v3, 0x4

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v2, v4, v1, v5, v3}, Lam0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcr2/e;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
