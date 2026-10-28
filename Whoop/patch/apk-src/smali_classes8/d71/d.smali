.class public abstract Ld71/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\u000b\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001d\u0010\r\u001a\u00020\n2\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000c\u001a\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0008H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Le71/a;",
        "group",
        "Ll83/a0;",
        "j",
        "(Landroidx/compose/ui/Modifier;Le71/a;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Le71/b;",
        "bars",
        "",
        "q",
        "(Ljava/util/List;)F",
        "r",
        "barState",
        "h",
        "(Le71/b;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ld71/d;->k(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ld71/d;->o(Ljava/lang/String;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Le71/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ld71/d;->i(Le71/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld71/d;->l(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Le71/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ld71/d;->p(Landroidx/compose/ui/Modifier;Le71/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ld71/d;->n(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Ld71/d;->m(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Le71/b;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v5, p1

    check-cast v5, Lp1/q;

    const v2, 0x7f15b78c

    invoke-virtual {v5, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eq v4, v3, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v7

    :goto_2
    and-int/2addr v2, v6

    invoke-virtual {v5, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Ld71/b;->a:Ld71/b;

    invoke-virtual {v2, v0}, Ld71/b;->a(Le71/b;)Lk91/a;

    move-result-object v4

    invoke-virtual {v0}, Le71/b;->g()F

    move-result v2

    const/high16 v3, -0x40800000    # -1.0f

    mul-float v10, v2, v3

    invoke-virtual {v0}, Le71/b;->d()F

    move-result v12

    new-instance v13, Lp91/a;

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/high16 v14, 0x3f000000    # 0.5f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v14, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f000000    # 0.5f

    const/high16 v11, 0x3f800000    # 1.0f

    move-object v8, v14

    invoke-static/range {v8 .. v13}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Le71/b;->e()Z

    move-result v3

    const/4 v8, 0x6

    if-eqz v3, :cond_3

    const v3, 0x4169ca

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    int-to-float v15, v6

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v16

    invoke-virtual {v4}, Lk91/a;->c()Lt0/i;

    move-result-object v18

    const/4 v3, 0x3

    int-to-float v3, v3

    move/from16 v20, v3

    move/from16 v19, v3

    invoke-static/range {v14 .. v20}, Lgb1/g;->d(Landroidx/compose/ui/Modifier;FJLi2/a1;FF)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_3
    const v3, 0x4573ee

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    :goto_3
    invoke-interface {v2, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Le71/b;->a()Li91/a;

    move-result-object v3

    if-nez v3, :cond_4

    const v3, 0x10866a99

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v8

    invoke-static {v8, v9}, Li91/c;->o(J)Li91/a;

    move-result-object v3

    :goto_4
    invoke-virtual {v5, v7}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_4
    const v6, 0x108667d0

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    goto :goto_4

    :goto_5
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v7}, Laz0/b;->b(Landroidx/compose/ui/Modifier;Li91/a;Lk91/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_5
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_6

    new-instance v3, Ld71/c;

    const/4 v4, 0x0

    invoke-direct {v3, v0, v1, v4}, Ld71/c;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final i(Le71/b;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Ld71/d;->h(Le71/b;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Le71/a;Landroidx/compose/runtime/Composer;II)V
    .locals 41

    move-object/from16 v3, p1

    const-string v0, "group"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, 0x797d6ee6

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, v4, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_3

    :cond_5
    move v5, v7

    :goto_3
    and-int/2addr v4, v8

    invoke-virtual {v0, v4, v5}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_15

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v2, v4

    :cond_6
    invoke-virtual {v3}, Le71/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v0, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v5, v0, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->o()J

    move-result-wide v9

    invoke-virtual {v3}, Le71/a;->h()Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_4

    :cond_7
    const v11, 0x3e99999a    # 0.3f

    invoke-static {v11, v9, v10}, Li2/x;->c(FJ)J

    move-result-wide v9

    :goto_4
    invoke-virtual {v3}, Le71/a;->g()Lu61/d;

    move-result-object v11

    const/4 v12, 0x3

    const/16 v13, 0x8

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_a

    const v11, -0x142d8669

    invoke-virtual {v0, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Le71/a;->k()F

    move-result v11

    invoke-virtual {v3}, Le71/a;->c()Ljava/util/List;

    move-result-object v15

    invoke-static {v15}, Ld71/d;->q(Ljava/util/List;)F

    move-result v15

    new-instance v16, Lp91/a;

    const/16 v21, 0xc

    const/16 v22, 0x0

    const/high16 v17, 0x3f000000    # 0.5f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v8, v16

    invoke-static {v4, v11, v15, v8}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const-wide/high16 v6, 0x3fe8000000000000L    # 0.75

    double-to-float v6, v6

    int-to-float v7, v13

    mul-float v20, v6, v7

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Le71/a;->g()Lu61/d;

    move-result-object v7

    invoke-virtual {v7}, Lu61/d;->d()Z

    move-result v7

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v11, :cond_8

    if-ne v15, v14, :cond_9

    :cond_8
    new-instance v15, Lai1/b;

    const/4 v11, 0x7

    invoke-direct {v15, v9, v10, v11}, Lai1/b;-><init>(JI)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v15, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7, v15}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Le71/a;->g()Lu61/d;

    move-result-object v7

    invoke-virtual {v7}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v0, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Le71/a;->g()Lu61/d;

    move-result-object v11

    invoke-virtual {v11}, Lu61/d;->a()Ly81/e;

    move-result-object v11

    invoke-interface {v11, v0, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    const/4 v11, 0x6

    invoke-virtual {v5, v0, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    new-instance v8, Lw3/k;

    invoke-direct {v8, v12}, Lw3/k;-><init>(I)V

    const/16 v28, 0xc30

    const v29, 0x2d5f8

    move-wide/from16 v18, v9

    move-object v10, v5

    move-object v5, v6

    move-wide/from16 v39, v15

    move-object v15, v4

    move-object v4, v7

    move-object/from16 v16, v8

    move-wide/from16 v6, v39

    const-wide/16 v8, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v23, v13

    move-object/from16 v25, v14

    const-wide/16 v13, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    move-wide/from16 v30, v18

    const/16 v19, 0x0

    const-wide/16 v17, 0x0

    move/from16 v27, v19

    const/16 v19, 0x3

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x1

    move/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move-wide/from16 v39, v30

    move-object/from16 v30, v2

    move-wide/from16 v2, v39

    move-object/from16 p0, v1

    move-object/from16 v1, v26

    move-object/from16 v38, v36

    move-object/from16 v26, v0

    move/from16 v0, v37

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    move-object/from16 p0, v1

    move-object/from16 v30, v2

    move-object v1, v4

    move-object/from16 v32, v5

    move-wide v2, v9

    move-object/from16 v38, v14

    move-object v4, v0

    move v0, v7

    const v5, -0x1421a144

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual/range {p1 .. p1}, Le71/a;->d()Lu61/d;

    move-result-object v5

    if-eqz v5, :cond_d

    const v5, -0x14204826

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Le71/a;->k()F

    move-result v5

    invoke-virtual/range {p1 .. p1}, Le71/a;->c()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Ld71/d;->r(Ljava/util/List;)F

    move-result v6

    new-instance v7, Lp91/a;

    const/16 v12, 0xc

    const/4 v13, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    const/high16 v9, -0x40800000    # -1.0f

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v7 .. v13}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v5, v6, v7}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v10, v5, v6

    const-wide/high16 v11, 0x3fd0000000000000L    # 0.25

    double-to-float v5, v11

    mul-float v12, v5, v6

    const/4 v13, 0x5

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Le71/a;->d()Lu61/d;

    move-result-object v6

    invoke-virtual {v6}, Lu61/d;->d()Z

    move-result v6

    invoke-virtual {v4, v2, v3}, Lp1/q;->f(J)Z

    move-result v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_b

    move-object/from16 v7, v38

    if-ne v8, v7, :cond_c

    goto :goto_6

    :cond_b
    move-object/from16 v7, v38

    :goto_6
    new-instance v8, Lai1/b;

    const/16 v9, 0x8

    invoke-direct {v8, v2, v3, v9}, Lai1/b;-><init>(JI)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v6, v8}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Le71/a;->d()Lu61/d;

    move-result-object v2

    invoke-virtual {v2}, Lu61/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Le71/a;->d()Lu61/d;

    move-result-object v3

    invoke-virtual {v3}, Lu61/d;->a()Ly81/e;

    move-result-object v3

    invoke-interface {v3, v4, v0}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    move-object/from16 v10, v32

    const/4 v11, 0x6

    invoke-virtual {v10, v4, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->E()Lb91/a;

    move-result-object v24

    new-instance v3, Lw3/k;

    const/4 v6, 0x3

    invoke-direct {v3, v6}, Lw3/k;-><init>(I)V

    const/16 v28, 0xc30

    const v29, 0x2d5f8

    move-object/from16 v36, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x3

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v16, v3

    move-object/from16 v26, v4

    move-object v4, v2

    move-object/from16 v2, v36

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    move-object/from16 v2, v38

    const v3, -0x1413f624

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual/range {p1 .. p1}, Le71/a;->k()F

    move-result v10

    invoke-virtual/range {p1 .. p1}, Le71/a;->j()Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_8
    move v12, v3

    goto :goto_9

    :cond_e
    invoke-virtual/range {p1 .. p1}, Le71/a;->i()F

    move-result v3

    goto :goto_8

    :goto_9
    new-instance v13, Lp91/a;

    const/16 v18, 0xc

    const/16 v19, 0x0

    const/high16 v14, 0x3f000000    # 0.5f

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    move-object v14, v13

    const/high16 v13, 0x3f800000    # 1.0f

    move-object v9, v1

    invoke-static/range {v9 .. v14}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v3, p0

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_f

    if-ne v6, v2, :cond_10

    :cond_f
    new-instance v6, Lb30/y4;

    const/16 v2, 0xd

    invoke-direct {v6, v3, v2}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v2, 0x1

    invoke-static {v1, v2, v6}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v3, v30

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->G:Lb2/m;

    invoke-static {v5, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_a
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_12

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    :cond_12
    invoke-static {v6, v4, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x703690f7

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Le71/a;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_14

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Le71/b;

    invoke-static {v5, v4, v0}, Ld71/d;->h(Le71/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_14
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move-object v1, v3

    goto :goto_c

    :cond_15
    move-object v4, v0

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v1, v2

    :goto_c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Ld62/b;

    const/4 v5, 0x1

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final k(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lai1/b;

    const/16 v0, 0x9

    invoke-direct {p2, p0, p1, v0}, Lai1/b;-><init>(JI)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final l(JLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v8, v2, v4

    const/4 v11, 0x0

    const/16 v12, 0xf6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    move-wide v2, p0

    move-object v1, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "$this$applyIf"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lai1/b;

    const/16 v0, 0xa

    invoke-direct {p2, p0, p1, v0}, Lai1/b;-><init>(JI)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(JLk2/e;)Ll83/a0;
    .locals 13

    const-string v0, "$this$drawBehind"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v0, 0x40c00000    # 6.0f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v4, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    or-long v8, v2, v4

    const/4 v11, 0x0

    const/16 v12, 0xf6

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v10, 0x0

    move-wide v2, p0

    move-object v1, p2

    invoke-static/range {v1 .. v12}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Ljava/lang/String;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/ui/Modifier;Le71/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ld71/d;->j(Landroidx/compose/ui/Modifier;Le71/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/util/List;)F
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le71/b;",
            ">;)F"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le71/b;

    invoke-virtual {v0}, Le71/b;->d()F

    move-result v1

    float-to-double v1, v1

    invoke-virtual {v0}, Le71/b;->g()F

    move-result v0

    float-to-double v3, v0

    add-double/2addr v1, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le71/b;

    invoke-virtual {v0}, Le71/b;->d()F

    move-result v3

    float-to-double v3, v3

    invoke-virtual {v0}, Le71/b;->g()F

    move-result v0

    float-to-double v5, v0

    add-double/2addr v3, v5

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    move-result-wide v1

    goto :goto_0

    :cond_0
    double-to-float p0, v1

    const/4 v0, -0x1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method

.method private static final r(Ljava/util/List;)F
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le71/b;",
            ">;)F"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le71/b;

    invoke-virtual {v0}, Le71/b;->g()F

    move-result v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le71/b;

    invoke-virtual {v1}, Le71/b;->g()F

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(FF)F

    move-result v0

    goto :goto_0

    :cond_0
    const/4 p0, -0x1

    int-to-float p0, p0

    mul-float/2addr v0, p0

    return v0

    :cond_1
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0
.end method
