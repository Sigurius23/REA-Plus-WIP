.class public abstract Lr21/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ak\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "content",
        "Lr21/a;",
        "style",
        "Lkd1/o;",
        "icon",
        "",
        "hasCloseButton",
        "imageSource",
        "supportText",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr21/f;->i(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lr21/f;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p14}, Lr21/f;->h(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p12}, Lr21/f;->k(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr21/f;->j(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lr21/a;",
            "Lkd1/o;",
            "Z",
            "Lkd1/o;",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v10, p1

    move-object/from16 v4, p2

    move/from16 v0, p10

    move/from16 v2, p11

    const-string v3, "modifier"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "title"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "content"

    invoke-static {v4, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "style"

    move-object/from16 v5, p3

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p9

    check-cast v3, Lp1/q;

    const v6, -0x5e82737b

    invoke-virtual {v3, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_1
    move v6, v0

    :goto_1
    and-int/lit8 v8, v0, 0x30

    if-nez v8, :cond_3

    invoke-virtual {v3, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v6, v8

    :cond_3
    and-int/lit16 v8, v0, 0x180

    if-nez v8, :cond_5

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_3

    :cond_4
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v6, v8

    :cond_5
    and-int/lit16 v8, v0, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    invoke-virtual {v3, v8}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_4

    :cond_6
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v6, v8

    :cond_7
    and-int/lit16 v8, v0, 0x6000

    move-object/from16 v9, p4

    if-nez v8, :cond_9

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x4000

    goto :goto_5

    :cond_8
    const/16 v8, 0x2000

    :goto_5
    or-int/2addr v6, v8

    :cond_9
    and-int/lit8 v8, v2, 0x20

    const/high16 v11, 0x30000

    if-eqz v8, :cond_b

    or-int/2addr v6, v11

    :cond_a
    move/from16 v11, p5

    goto :goto_7

    :cond_b
    and-int/2addr v11, v0

    if-nez v11, :cond_a

    move/from16 v11, p5

    invoke-virtual {v3, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v12, 0x10000

    :goto_6
    or-int/2addr v6, v12

    :goto_7
    and-int/lit8 v12, v2, 0x40

    const/high16 v13, 0x180000

    if-eqz v12, :cond_e

    or-int/2addr v6, v13

    :cond_d
    move-object/from16 v13, p6

    goto :goto_9

    :cond_e
    and-int/2addr v13, v0

    if-nez v13, :cond_d

    move-object/from16 v13, p6

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x100000

    goto :goto_8

    :cond_f
    const/high16 v14, 0x80000

    :goto_8
    or-int/2addr v6, v14

    :goto_9
    const/high16 v14, 0xc00000

    and-int/2addr v14, v0

    if-nez v14, :cond_12

    and-int/lit16 v14, v2, 0x80

    if-nez v14, :cond_10

    move-object/from16 v14, p7

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_11

    const/high16 v15, 0x800000

    goto :goto_a

    :cond_10
    move-object/from16 v14, p7

    :cond_11
    const/high16 v15, 0x400000

    :goto_a
    or-int/2addr v6, v15

    goto :goto_b

    :cond_12
    move-object/from16 v14, p7

    :goto_b
    and-int/lit16 v15, v2, 0x100

    const/high16 v16, 0x6000000

    if-eqz v15, :cond_13

    or-int v6, v6, v16

    move-object/from16 v7, p8

    goto :goto_d

    :cond_13
    and-int v16, v0, v16

    move-object/from16 v7, p8

    if-nez v16, :cond_15

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_14
    const/high16 v16, 0x2000000

    :goto_c
    or-int v6, v6, v16

    :cond_15
    :goto_d
    const v16, 0x2492493

    and-int v0, v6, v16

    const v4, 0x2492492

    const/16 v16, 0x1

    const/4 v5, 0x0

    if-eq v0, v4, :cond_16

    move/from16 v0, v16

    goto :goto_e

    :cond_16
    move v0, v5

    :goto_e
    and-int/lit8 v4, v6, 0x1

    invoke-virtual {v3, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_20

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v0, p10, 0x1

    const/4 v4, 0x0

    if-eqz v0, :cond_19

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_17

    goto :goto_10

    :cond_17
    invoke-virtual {v3}, Lp1/q;->X()V

    :cond_18
    move-object v8, v14

    move-object v14, v7

    move-object v7, v13

    :goto_f
    move v13, v11

    goto :goto_11

    :cond_19
    :goto_10
    if-eqz v8, :cond_1a

    move v11, v5

    :cond_1a
    if-eqz v12, :cond_1b

    move-object v13, v4

    :cond_1b
    and-int/lit16 v0, v2, 0x80

    if-eqz v0, :cond_1c

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v14, v0

    :cond_1c
    if-eqz v15, :cond_18

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v0, v6, :cond_1d

    new-instance v0, Lqv1/e;

    const/4 v6, 0x4

    invoke-direct {v0, v6}, Lqv1/e;-><init>(I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v0, Lc93/a;

    move-object v7, v13

    move-object v8, v14

    move-object v14, v0

    goto :goto_f

    :goto_11
    invoke-virtual {v3}, Lp1/q;->r()V

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getTitleColor()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v3, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getContentColor()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v3, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getBackgroundColor()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v3, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getIconColor()Ly81/f;

    move-result-object v0

    if-nez v0, :cond_1e

    const v0, -0x2eb3fb57

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    move-object v0, v4

    move-object/from16 p5, v7

    goto :goto_12

    :cond_1e
    const v6, 0x384cc658

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    move-object/from16 p5, v7

    invoke-virtual {v0, v3, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-static {v3, v5, v6, v7}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v0

    :goto_12
    sget-object v6, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v6}, Lkd1/w;->a()Lk91/a;

    move-result-object v6

    invoke-virtual {v6}, Lk91/a;->c()Lt0/i;

    move-result-object v6

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getBackgroundGradient()Lj91/b;

    move-result-object v7

    if-nez v7, :cond_1f

    const v7, -0x2eb1e9ad

    invoke-virtual {v3, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    move-object/from16 p6, v0

    goto :goto_13

    :cond_1f
    const v4, -0x2eb1e9ac

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-interface {v7, v3, v5}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v4

    invoke-virtual/range {p3 .. p3}, Lr21/a;->getBackgroundGradientAlpha()F

    move-result v7

    move-object/from16 p6, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v0, v4, v6}, Landroidx/compose/foundation/a;->a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    :goto_13
    invoke-static {v1, v4}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v4, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float v19, v4, v5

    new-instance v2, Lr21/e;

    move-wide/from16 v20, v15

    move-object/from16 v16, v6

    move-wide/from16 v5, v20

    move-object/from16 v4, p2

    move-object/from16 v7, p5

    move-object/from16 v15, p6

    move-object/from16 p5, v0

    move-object v0, v3

    move-object/from16 v3, p3

    invoke-direct/range {v2 .. v15}, Lr21/e;-><init>(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;)V

    move-object v4, v2

    move-object v2, v7

    move v3, v13

    move-object v15, v14

    move-object v14, v8

    const v5, 0x7d416802

    invoke-static {v5, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v12, 0x1b0000

    const/16 v13, 0x18

    const/4 v8, 0x0

    move-object/from16 v4, p5

    move-object v11, v0

    move-object/from16 v5, v16

    move-wide/from16 v6, v17

    move/from16 v9, v19

    invoke-static/range {v4 .. v13}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v2

    move v6, v3

    move-object v9, v15

    :goto_14
    move-object v8, v14

    goto :goto_15

    :cond_20
    move-object v0, v3

    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v9, v7

    move v6, v11

    move-object v7, v13

    goto :goto_14

    :goto_15
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_21

    new-instance v0, Ll1/i;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Ll1/i;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lr21/a;Lcom/whoop/design/util/TextResource;JLkd1/o;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;JZLc93/a;Li2/x;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v3, p12

    and-int/lit8 v4, p14, 0x3

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x2

    if-eq v4, v7, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    and-int/lit8 v8, p14, 0x1

    move-object/from16 v12, p13

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_13

    sget-object v4, Lr21/a;->JUMPSTART:Lr21/a;

    const/16 v8, 0x8

    if-ne v0, v4, :cond_1

    int-to-float v9, v5

    :goto_1
    int-to-float v10, v8

    mul-float/2addr v9, v10

    goto :goto_2

    :cond_1
    int-to-float v9, v7

    goto :goto_1

    :goto_2
    int-to-float v7, v7

    int-to-float v8, v8

    mul-float/2addr v8, v7

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v8, v9}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v12, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_2

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_2
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    :cond_3
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v8, v6, v12, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v1, v12, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v12, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :cond_6
    invoke-static {v1, v12, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    invoke-static {v12, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v1, 0x4

    const/4 v2, 0x6

    if-nez p6, :cond_8

    const v3, 0x7ff59fc0

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v12, v3}, Lp1/q;->q(Z)V

    move v5, v3

    move-object v3, v15

    :goto_5
    move-object/from16 v6, p7

    goto :goto_8

    :cond_8
    const v5, 0x7ff59fc1

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    const/4 v14, 0x3

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v9, p6

    invoke-static/range {v9 .. v14}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v9

    move-object/from16 v31, v12

    int-to-float v5, v2

    int-to-float v6, v1

    mul-float/2addr v5, v6

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    if-eqz v3, :cond_9

    iget-wide v12, v3, Li2/x;->a:J

    :goto_6
    move-object v3, v15

    goto :goto_7

    :cond_9
    move-wide/from16 v12, p8

    goto :goto_6

    :goto_7
    const/16 v15, 0x1b0

    const/16 v16, 0x0

    const-string v10, ""

    move-object/from16 v14, v31

    invoke-static/range {v9 .. v16}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v12, v14

    const/4 v5, 0x0

    invoke-static {v7, v6, v3, v12, v5}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_5

    :goto_8
    invoke-static {v6, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    new-instance v6, Lw3/k;

    const/4 v7, 0x1

    invoke-direct {v6, v7}, Lw3/k;-><init>(I)V

    if-ne v0, v4, :cond_a

    const v0, 0x7ffebe52

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_9
    move-object/from16 v29, v0

    goto :goto_a

    :cond_a
    const v0, 0x7fffec92

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    const/16 v33, 0x0

    const v34, 0x2fdfa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v21, v6

    move-object/from16 v31, v12

    move-wide/from16 v11, p8

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz p10, :cond_e

    const v4, -0x7ffdf206

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v5, v4

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_b

    goto :goto_b

    :cond_b
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v5, v4, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v13, Lny0/o;

    sget-object v14, Lny0/q$c;->f:Lny0/q$c;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lyb0/f;->a(Lx81/d;)I

    move-result v15

    const/16 v24, 0x2fc

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/high16 v22, 0x3f000000    # 0.5f

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v4, Lgy0/f;->K:I

    invoke-static {v12, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, p11

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    if-ne v7, v0, :cond_d

    :cond_c
    new-instance v7, Lot1/e;

    const/16 v6, 0x14

    invoke-direct {v7, v5, v6}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v12, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lc93/a;

    const/4 v5, 0x0

    const/16 v6, 0xc

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 p7, v4

    move/from16 p12, v5

    move/from16 p13, v6

    move-object/from16 p10, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p11, v12

    move-object/from16 p6, v13

    invoke-static/range {p6 .. p13}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v7, 0x1

    goto :goto_d

    :cond_e
    const/4 v5, 0x0

    const v4, -0x7ff67006

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_f

    const v4, 0x3e848d5

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v1

    invoke-static {v4, v4, v3, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    move-object/from16 v4, p1

    invoke-static {v4, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fffa

    const/4 v10, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    move-object/from16 v31, v12

    move-wide/from16 v11, p2

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_f
    const v4, 0x3ec0d96

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_e
    if-nez p4, :cond_10

    const v0, 0x3ec9c3b

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_10
    const v4, 0x3ec9c3c

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v1

    mul-float/2addr v4, v4

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p6, v3

    move/from16 p8, v4

    move/from16 p10, v5

    move/from16 p11, v6

    move/from16 p7, v7

    move/from16 p9, v8

    invoke-static/range {p6 .. p11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_11

    new-instance v4, Lqt2/w;

    const/16 v0, 0x10

    invoke-direct {v4, v0}, Lqt2/w;-><init>(I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v0, 0x180

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object/from16 p6, p4

    move/from16 p10, v0

    move-object/from16 p8, v4

    move/from16 p11, v5

    move-object/from16 p7, v6

    move-object/from16 p9, v12

    invoke-static/range {p6 .. p11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v9

    const/16 v17, 0x61b0

    const/16 v18, 0x68

    const/4 v10, 0x0

    move-object/from16 v31, v12

    const/4 v12, 0x0

    sget-object v13, Ly2/j;->b:Ly2/b1;

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v16, v31

    invoke-static/range {v9 .. v18}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v16

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_f
    if-nez p5, :cond_12

    const v0, 0x3f1c807

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v7, 0x1

    goto :goto_11

    :cond_12
    const v0, 0x3f1c808

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, p5

    invoke-static {v0, v12, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    int-to-float v0, v1

    mul-float/2addr v0, v0

    const/4 v1, 0x0

    const/16 v4, 0xd

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 p2, v0

    move/from16 p4, v1

    move-object/from16 p0, v3

    move/from16 p5, v4

    move/from16 p1, v5

    move/from16 p3, v6

    invoke-static/range {p0 .. p5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v12, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v3

    new-instance v1, Lw3/k;

    const/4 v7, 0x1

    invoke-direct {v1, v7}, Lw3/k;-><init>(I)V

    invoke-virtual {v0, v12, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v29

    const/16 v33, 0x0

    const v34, 0x2fdf8

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x30

    move-object/from16 v21, v1

    move-object/from16 v31, v12

    move-wide v11, v3

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_11
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_13
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_12
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lnh/h;->c:Lnh/h;

    invoke-virtual {p0, v0}, Lmh/h;->e(Lnh/h;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 13

    or-int/lit8 v0, p9, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v11

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v12, p10

    move-object/from16 v10, p11

    invoke-static/range {v1 .. v12}, Lr21/f;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Lkd1/o;ZLkd1/o;Lcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
