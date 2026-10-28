.class public abstract Ljp1/u;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0005\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lhp1/m;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhp1/f;",
        "Ll83/a0;",
        "onViewEvent",
        "n",
        "(Lhp1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "lbs",
        "oz",
        "B",
        "(FF)F",
        "hormonal-insights_release"
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
.method private static final A(Lhp1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljp1/u;->n(Lhp1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(FF)F
    .locals 4

    float-to-double v0, p0

    const-wide v2, 0x407c5978d4fdf3b6L    # 453.592

    mul-double/2addr v0, v2

    float-to-double p0, p1

    const-wide v2, 0x403c5978d4fdf3b6L    # 28.3495

    mul-double/2addr p0, v2

    add-double/2addr p0, v0

    double-to-float p0, p0

    return p0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/u;->v()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/u;->u(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lhp1/m;Lz1/p;Lz1/p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp1/u;->x(Lkotlin/jvm/functions/Function1;Lhp1/m;Lz1/p;Lz1/p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lhp1/m;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp1/u;->y(Lkotlin/jvm/functions/Function1;Lhp1/m;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lhp1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/u;->A(Lhp1/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp1/u;->r(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;
    .locals 1

    move-object v0, p3

    move-object p3, p0

    move-object p0, p1

    move p1, p2

    move-object p2, v0

    invoke-static/range {p0 .. p5}, Ljp1/u;->w(Lz1/p;ILz1/p;Lhp1/m;Lz1/p;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/u;->z(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ljp1/u;->s(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/u;->o(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/u;->q(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp1/u;->p(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/u;->t()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final n(Lhp1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x19de1522

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v14, 0x12

    const/4 v15, 0x0

    if-eq v4, v14, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v15

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v11, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2b

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    new-instance v2, Ljg/c;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    new-instance v3, Lz1/p;

    invoke-direct {v3}, Lz1/p;-><init>()V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lz1/p;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v4, :cond_9

    new-instance v6, Lz1/p;

    invoke-direct {v6}, Lz1/p;-><init>()V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v6, Lz1/p;

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_a

    new-instance v7, Lz1/p;

    invoke-direct {v7}, Lz1/p;-><init>()V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lz1/p;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_b

    if-ne v9, v4, :cond_c

    :cond_b
    new-instance v9, Ljp1/t;

    invoke-direct {v9, v7, v1, v3, v6}, Ljp1/t;-><init>(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v9, v11}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v12, v5, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object/from16 v17, v9

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v18, v14

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move/from16 v21, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    goto :goto_7

    :cond_e
    move/from16 v21, v0

    :goto_7
    invoke-static {v8, v11, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v11, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp1/m;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v10, v3

    invoke-virtual {v1}, Lhp1/m;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    and-int/lit8 v13, v21, 0x70

    move-object/from16 v21, v5

    const/16 v5, 0x20

    if-ne v13, v5, :cond_10

    const/16 v20, 0x1

    goto :goto_8

    :cond_10
    const/16 v20, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v20, :cond_12

    if-ne v5, v4, :cond_11

    goto :goto_9

    :cond_11
    move-object/from16 v20, v3

    goto :goto_a

    :cond_12
    :goto_9
    new-instance v5, Ljp1/l;

    move-object/from16 v20, v3

    const/4 v3, 0x3

    invoke-direct {v5, v2, v3}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v5, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v23, v3, 0x3

    or-int v23, v3, v23

    move-object/from16 v24, v10

    const/16 v10, 0x1c

    move-object/from16 v25, v4

    const/4 v4, 0x0

    move-object/from16 v26, v7

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v27, v6

    const/4 v6, 0x0

    move-object/from16 v16, v0

    move-object/from16 v28, v2

    move/from16 v32, v3

    move-object v2, v8

    move-object v8, v11

    move/from16 p1, v13

    move-object/from16 v0, v17

    move-object/from16 v3, v20

    move-object/from16 v13, v21

    move-object/from16 v29, v24

    move-object/from16 v33, v25

    move-object/from16 v31, v26

    move-object/from16 v30, v27

    const/4 v1, 0x1

    const/high16 v11, 0x3f800000    # 1.0f

    const/16 v20, 0x20

    move-object/from16 v17, v9

    move/from16 v9, v23

    invoke-static/range {v2 .. v10}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v2, v11

    const-wide/16 v34, 0x0

    cmpl-double v2, v2, v34

    const-string v36, "invalid weight; must be greater than zero"

    if-lez v2, :cond_13

    goto :goto_b

    :cond_13
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v37, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v3, v11, v37

    if-lez v3, :cond_14

    move/from16 v3, v37

    goto :goto_c

    :cond_14
    move v3, v11

    :goto_c
    invoke-direct {v2, v3, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v8, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v4, v2, v3

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v6, 0x30

    invoke-static {v12, v5, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_15

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v8, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_17

    :cond_16
    move-object/from16 v5, v17

    goto :goto_f

    :cond_17
    :goto_e
    move-object/from16 v5, v16

    goto :goto_10

    :goto_f
    invoke-static {v6, v8, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v8, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/m;->b()I

    move-result v4

    if-ne v4, v1, :cond_18

    invoke-virtual/range {p0 .. p0}, Lhp1/m;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    :goto_11
    move/from16 v5, v32

    goto :goto_12

    :cond_18
    invoke-virtual/range {p0 .. p0}, Lhp1/m;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_11

    :goto_12
    invoke-static {v4, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v6, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->N()Lb91/a;

    move-result-object v22

    move v12, v3

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v14, Lw3/k;

    const/4 v13, 0x5

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v26, v13, 0x12

    const v27, 0x2fdf8

    move-object v13, v6

    move v15, v7

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move/from16 v32, v5

    move-wide/from16 v53, v9

    move v10, v2

    move-object v2, v4

    move-wide/from16 v4, v53

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v18, v11

    move/from16 v17, v12

    const-wide/16 v11, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move/from16 v25, v15

    move/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v38, v17

    const/16 v17, 0x0

    move/from16 v39, v18

    const/16 v18, 0x0

    const/16 v40, 0x0

    const/16 v19, 0x0

    move/from16 v41, v20

    const/16 v20, 0x0

    move-object/from16 v42, v21

    const/16 v21, 0x0

    move/from16 v43, v23

    const/16 v23, 0x0

    move/from16 v44, v25

    const/16 v25, 0x30

    move/from16 v45, p1

    move/from16 v46, v32

    move-object/from16 v47, v42

    move/from16 v48, v44

    const/4 v1, 0x4

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    int-to-float v14, v1

    mul-float v3, v38, v14

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v1, v11

    cmpl-double v1, v1, v34

    if-lez v1, :cond_19

    goto :goto_13

    :cond_19
    invoke-static/range {v36 .. v36}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_13
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v1, v11, v37

    if-lez v1, :cond_1a

    move/from16 v1, v37

    :goto_14
    const/4 v15, 0x0

    goto :goto_15

    :cond_1a
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_14

    :goto_15
    invoke-direct {v2, v1, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1c

    move-object/from16 v3, v33

    if-ne v4, v3, :cond_1b

    goto :goto_16

    :cond_1b
    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v9, v31

    goto :goto_17

    :cond_1c
    move-object/from16 v3, v33

    :goto_16
    new-instance v4, Ljp1/t;

    move-object/from16 v6, v29

    move-object/from16 v7, v30

    move-object/from16 v9, v31

    invoke-direct {v4, v1, v9, v6, v7}, Ljp1/t;-><init>(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v10, v4

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v12, 0x6000

    const/16 v13, 0x1ee

    move-object/from16 v33, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v29, v6

    const/4 v6, 0x0

    move-object/from16 v27, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v31, v9

    const/4 v9, 0x0

    move-object/from16 v11, v24

    move-object/from16 v15, v31

    move-object/from16 v49, v33

    invoke-static/range {v2 .. v13}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v11

    const/4 v2, 0x7

    int-to-float v2, v2

    invoke-static {v2, v14, v0, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual {v1}, Lhp1/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v5, v46

    invoke-static {v2, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v13, v47

    move/from16 v2, v48

    invoke-virtual {v13, v8, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->i0()J

    move-result-wide v9

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v15, v2}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    if-eqz v29, :cond_1d

    invoke-virtual/range {v29 .. v29}, Lz1/p;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1d

    goto :goto_18

    :cond_1d
    invoke-virtual/range {v29 .. v29}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v2

    :cond_1e
    move-object v3, v2

    check-cast v3, Ln83/b;

    invoke-virtual {v3}, Ln83/b;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-virtual {v3}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    const-string v4, ""

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1e

    goto :goto_1a

    :cond_1f
    :goto_18
    const/4 v15, 0x1

    :goto_19
    move/from16 v13, v45

    const/16 v12, 0x20

    goto :goto_1b

    :cond_20
    :goto_1a
    const/4 v15, 0x0

    goto :goto_19

    :goto_1b
    if-ne v13, v12, :cond_21

    const/4 v2, 0x1

    goto :goto_1c

    :cond_21
    const/4 v2, 0x0

    :goto_1c
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_23

    move-object/from16 v2, v49

    if-ne v3, v2, :cond_22

    :goto_1d
    move-object/from16 v17, v0

    goto :goto_1e

    :cond_22
    move-object/from16 v50, v0

    move-object/from16 v51, v2

    goto :goto_1f

    :cond_23
    move-object/from16 v2, v49

    goto :goto_1d

    :goto_1e
    new-instance v0, Lam2/d;

    const/16 v5, 0x12

    move-object/from16 v51, v2

    move-object/from16 v50, v17

    move-object/from16 v4, v27

    move-object/from16 v3, v29

    move-object v2, v1

    move-object/from16 v1, v28

    invoke-direct/range {v0 .. v5}, Lam2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_1f
    check-cast v3, Lc93/a;

    move-object v1, v11

    const/16 v11, 0x36

    move/from16 v20, v12

    const/16 v12, 0x60

    move-object v2, v6

    move-wide v5, v9

    move-object v9, v3

    move-object v3, v7

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v0, p0

    move/from16 v16, v14

    move v4, v15

    move/from16 v14, v20

    move-object/from16 v10, v24

    move-object/from16 v15, v28

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    mul-float v2, v43, v16

    move-object/from16 v1, v50

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lhp1/m;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v0}, Lhp1/m;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-eqz v1, :cond_27

    const v1, 0x7137cbc1

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lhp1/m;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-ne v13, v14, :cond_24

    const/4 v1, 0x1

    goto :goto_20

    :cond_24
    const/4 v1, 0x0

    :goto_20
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_25

    move-object/from16 v1, v51

    if-ne v2, v1, :cond_26

    goto :goto_21

    :cond_25
    move-object/from16 v1, v51

    :goto_21
    new-instance v2, Ljp1/c;

    const/4 v4, 0x2

    invoke-direct {v2, v4, v15, v0}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x6

    const/16 v16, 0x0

    const/16 v17, 0xffb

    move-object/from16 v33, v1

    const/4 v1, 0x0

    move/from16 v45, v13

    move-object v13, v2

    const/4 v2, 0x0

    move-object/from16 v28, v15

    move v15, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v14, v24

    move-object/from16 v52, v33

    move/from16 v0, v45

    invoke-static/range {v1 .. v17}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v14

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_22
    const/4 v1, 0x1

    goto :goto_23

    :cond_27
    move v0, v13

    move-object/from16 v28, v15

    move-object/from16 v52, v51

    const/4 v15, 0x0

    const v1, 0x713a5cb0

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto :goto_22

    :goto_23
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const/16 v12, 0x20

    if-ne v0, v12, :cond_28

    move v0, v1

    goto :goto_24

    :cond_28
    move v0, v15

    :goto_24
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_2a

    move-object/from16 v3, v52

    if-ne v2, v3, :cond_29

    goto :goto_25

    :cond_29
    move-object/from16 v3, v28

    goto :goto_26

    :cond_2a
    :goto_25
    new-instance v2, Ljp1/l;

    const/4 v0, 0x4

    move-object/from16 v3, v28

    invoke-direct {v2, v3, v0}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_26
    check-cast v2, Lc93/a;

    invoke-static {v2, v15, v8, v15, v1}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    goto :goto_27

    :cond_2b
    move-object v8, v11

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_27
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2c

    new-instance v0, Lio2/k0;

    const/16 v5, 0x8

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2c
    return-void
.end method

.method private static final o(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Lp1/i0;)Lp1/h0;
    .locals 4

    const-string v0, "$this$DisposableEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lhp1/m;->b()I

    move-result p4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, p4, :cond_0

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {p1}, Lhp1/m;->k()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    const-string p4, ""

    if-nez p0, :cond_1

    invoke-virtual {p1}, Lhp1/m;->k()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {p2, p0}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_1
    invoke-virtual {p1}, Lhp1/m;->b()I

    move-result p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p0}, Ljava/util/ArrayList;-><init>(I)V

    move v2, v1

    :goto_1
    if-ge v2, p0, :cond_2

    invoke-virtual {v0, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p2, v0}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    :goto_2
    invoke-virtual {p1}, Lhp1/m;->l()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    invoke-virtual {p1}, Lhp1/m;->l()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-virtual {p3, p0}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    goto :goto_4

    :cond_3
    invoke-virtual {p1}, Lhp1/m;->b()I

    move-result p0

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_3
    if-ge v1, p0, :cond_4

    invoke-virtual {p1, p4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_4
    invoke-virtual {p3, p1}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    :goto_4
    new-instance p0, Ljp1/u$a;

    invoke-direct {p0}, Ljp1/u$a;-><init>()V

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lhp1/m;Lz1/p;Lz1/p;Lz1/p;Ln0/q;)Ll83/a0;
    .locals 7

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhp1/m;->b()I

    move-result v0

    new-instance v1, Lbm0/f;

    const/4 v6, 0x4

    move-object v3, p0

    move-object v2, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v6}, Lbm0/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, -0x460d196c

    invoke-direct {p0, v1, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x6

    const/4 p2, 0x0

    invoke-static {p4, v0, p2, p0, p1}, Ln0/q;->a(Ln0/q;ILkotlin/jvm/functions/Function1;Lc93/n;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lz1/p;Lhp1/m;Lz1/p;Lz1/p;Landroidx/compose/foundation/lazy/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 54

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    const-string v0, "$this$items"

    move-object/from16 v4, p4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p7, 0x30

    if-nez v0, :cond_1

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    invoke-virtual {v0, v2}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p7, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p7

    :goto_1
    and-int/lit16 v4, v0, 0x91

    const/16 v5, 0x90

    const/4 v8, 0x0

    if-eq v4, v5, :cond_2

    const/4 v4, 0x1

    goto :goto_2

    :cond_2
    move v4, v8

    :goto_2
    and-int/lit8 v5, v0, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_17

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_3

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v9, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-nez v15, :cond_4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v5, v9, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v12, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v9, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v9, Lp1/q;->S:Z

    if-nez v4, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_8

    :cond_7
    invoke-static {v7, v9, v7, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v9, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v4, v6

    const-wide/16 v7, 0x0

    cmpl-double v4, v4, v7

    const-string v49, "invalid weight; must be greater than zero"

    if-lez v4, :cond_9

    goto :goto_5

    :cond_9
    invoke-static/range {v49 .. v49}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v50, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v6, v50

    if-lez v4, :cond_a

    move/from16 v4, v50

    :goto_6
    const/4 v5, 0x1

    goto :goto_7

    :cond_a
    move v4, v6

    goto :goto_6

    :goto_7
    invoke-direct {v10, v4, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v4, 0x3

    int-to-float v4, v4

    const/4 v5, 0x4

    int-to-float v12, v5

    mul-float v51, v4, v12

    invoke-static/range {v51 .. v51}, Lt0/j;->e(F)Lt0/i;

    move-result-object v35

    invoke-virtual {v1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v4

    invoke-virtual {v4}, Lhp1/l;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object/from16 v5, p2

    invoke-virtual {v5, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v15, Lqz0/c$c;

    invoke-virtual {v1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v4

    invoke-virtual {v4}, Lhp1/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-wide/from16 v52, v7

    const/4 v7, 0x0

    const/4 v8, 0x2

    invoke-direct {v15, v4, v7, v8, v7}, Lqz0/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v4, v7, :cond_b

    new-instance v4, Ljp1/p;

    const/4 v8, 0x4

    invoke-direct {v4, v8}, Ljp1/p;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object/from16 v40, v4

    check-cast v40, Lc93/a;

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v8, v0, 0x70

    const/16 v0, 0x20

    if-ne v8, v0, :cond_c

    const/4 v0, 0x1

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    :goto_8
    or-int/2addr v0, v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_d

    if-ne v4, v7, :cond_e

    :cond_d
    new-instance v0, Ljp1/s;

    move-object v4, v3

    move v3, v2

    move-object/from16 v2, p3

    invoke-direct/range {v0 .. v5}, Ljp1/s;-><init>(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;)V

    move v2, v3

    move-object v3, v4

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :cond_e
    move-object/from16 v41, v4

    check-cast v41, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v0, 0x3

    const/high16 v5, 0x30000

    or-int/2addr v4, v5

    shl-int/lit8 v5, v0, 0x9

    or-int/2addr v4, v5

    sget v5, Lqz0/c$c;->d:I

    shl-int/lit8 v5, v5, 0x15

    or-int/2addr v4, v5

    shl-int/lit8 v5, v0, 0x18

    or-int v43, v4, v5

    const v47, 0x3dffbc54

    const/16 v48, 0x0

    move-object v4, v11

    const/4 v11, 0x0

    move v5, v12

    move-object v12, v13

    const/4 v13, 0x0

    move-object/from16 v42, v9

    move-object v9, v10

    move-object v10, v14

    const/4 v14, 0x0

    move-object/from16 v16, v15

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v44, 0x6000

    const/16 v45, 0x0

    const/16 v46, 0x6

    invoke-static/range {v9 .. v48}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v9, v42

    invoke-virtual {v1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v10

    invoke-virtual {v10}, Lhp1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-nez v10, :cond_f

    const v5, 0x44d7c9eb

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    move v7, v0

    move-object v8, v4

    :goto_9
    const/4 v5, 0x1

    goto/16 :goto_e

    :cond_f
    const v10, 0x44d7c9ec

    invoke-static {v9, v10, v5, v5, v4}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v9, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    float-to-double v10, v6

    cmpl-double v5, v10, v52

    if-lez v5, :cond_10

    goto :goto_a

    :cond_10
    invoke-static/range {v49 .. v49}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v6, v50

    if-lez v5, :cond_11

    move/from16 v6, v50

    :cond_11
    const/4 v5, 0x1

    invoke-direct {v10, v6, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {v51 .. v51}, Lt0/j;->e(F)Lt0/i;

    move-result-object v35

    move-object/from16 v5, p3

    invoke-virtual {v5, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v17

    new-instance v11, Lqz0/c$c;

    invoke-virtual {v1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v13

    invoke-virtual {v13}, Lhp1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-direct {v11, v13, v15, v14, v15}, Lqz0/c$c;-><init>(Lcom/whoop/design/util/TextResource;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v7, :cond_12

    new-instance v13, Ljp1/p;

    const/4 v14, 0x3

    invoke-direct {v13, v14}, Ljp1/p;-><init>(I)V

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v40, v13

    check-cast v40, Lc93/a;

    const/16 v13, 0x20

    if-ne v8, v13, :cond_13

    const/4 v8, 0x1

    goto :goto_b

    :cond_13
    const/4 v8, 0x0

    :goto_b
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v8, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v8, :cond_14

    if-ne v13, v7, :cond_15

    :cond_14
    move v7, v0

    goto :goto_c

    :cond_15
    move v7, v0

    move-object v8, v4

    goto :goto_d

    :goto_c
    new-instance v0, Ljp1/s;

    move-object v8, v4

    move-object v4, v1

    move-object/from16 v1, p2

    invoke-direct/range {v0 .. v5}, Ljp1/s;-><init>(Lz1/p;ILz1/p;Lhp1/m;Lz1/p;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v0

    :goto_d
    move-object/from16 v41, v13

    check-cast v41, Lkotlin/jvm/functions/Function1;

    const v47, 0x3dffbc54

    const/16 v48, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x8

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v44, 0x6000

    const/16 v45, 0x0

    const/16 v46, 0x6

    move-object/from16 v42, v9

    move-object v9, v10

    move-object v10, v6

    invoke-static/range {v9 .. v48}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v9, v42

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :goto_e
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_16

    const v0, 0x2b44fa1b

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lb2/e;->G:Lb2/m;

    sget-object v1, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v1, v8, v0}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v0

    invoke-virtual {v0}, Lhp1/l;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v9, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b()J

    move-result-wide v11

    invoke-virtual {v1, v9, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v29

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v33, v1, 0x12

    const v34, 0x2fff8

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

    move-object/from16 v31, v9

    move-object v9, v0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v31

    const/4 v5, 0x0

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v5, 0x1

    goto :goto_10

    :cond_16
    const/4 v5, 0x0

    const v0, 0x2b4a6df4

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v9, v5}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_17
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final t()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final u(Lhp1/m;Lz1/p;ILz1/p;Lz1/p;Ljava/lang/String;)Ll83/a0;
    .locals 3

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p5}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lhp1/m;->j()Lhp1/l;

    move-result-object v2

    invoke-virtual {v2}, Lhp1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {p1, p2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :cond_1
    invoke-static {v0, v1}, Ljp1/u;->B(FF)F

    move-result v0

    :cond_2
    invoke-virtual {p0}, Lhp1/m;->j()Lhp1/l;

    move-result-object p1

    invoke-virtual {p1}, Lhp1/l;->d()F

    move-result p1

    invoke-virtual {p0}, Lhp1/m;->j()Lhp1/l;

    move-result-object p0

    invoke-virtual {p0}, Lhp1/l;->c()F

    move-result p0

    cmpg-float p0, v0, p0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gtz p0, :cond_3

    cmpg-float p0, p1, v0

    if-gtz p0, :cond_3

    move v1, v2

    :cond_3
    xor-int/lit8 p0, v1, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p3, p2, p0}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4, p2, p5}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final w(Lz1/p;ILz1/p;Lhp1/m;Lz1/p;Ljava/lang/String;)Ll83/a0;
    .locals 3

    const-string v0, "text"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v0

    :goto_0
    invoke-static {p5}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :cond_1
    invoke-static {p0, v0}, Ljp1/u;->B(FF)F

    move-result p0

    invoke-virtual {p3}, Lhp1/m;->j()Lhp1/l;

    move-result-object v0

    invoke-virtual {v0}, Lhp1/l;->d()F

    move-result v0

    invoke-virtual {p3}, Lhp1/m;->j()Lhp1/l;

    move-result-object p3

    invoke-virtual {p3}, Lhp1/l;->c()F

    move-result p3

    cmpg-float p3, p0, p3

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-gtz p3, :cond_2

    cmpg-float p0, v0, p0

    if-gtz p0, :cond_2

    move v1, v2

    :cond_2
    xor-int/lit8 p0, v1, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {p2, p1, p0}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p4, p1, p5}, Lz1/p;->set(ILjava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lkotlin/jvm/functions/Function1;Lhp1/m;Lz1/p;Lz1/p;)Ll83/a0;
    .locals 14

    invoke-virtual {p1}, Lhp1/m;->f()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v0

    new-instance v4, Ljava/util/ArrayList;

    const/16 v1, 0xa

    move-object/from16 v8, p2

    invoke-static {v8, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v8}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object v1

    const/4 v2, 0x0

    :goto_0
    move-object v3, v1

    check-cast v3, Ln83/b;

    invoke-virtual {v3}, Ln83/b;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v3}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v5, v2, 0x1

    if-ltz v2, :cond_4

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1}, Lhp1/m;->j()Lhp1/l;

    move-result-object v6

    invoke-virtual {v6}, Lhp1/l;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :goto_1
    move-object/from16 v9, p3

    goto :goto_2

    :cond_0
    move v3, v7

    goto :goto_1

    :goto_2
    invoke-virtual {v9, v2}, Lz1/p;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    :cond_1
    invoke-static {v3, v7}, Ljp1/u;->B(FF)F

    move-result v7

    goto :goto_3

    :cond_2
    move-object/from16 v9, p3

    invoke-static {v3}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v7

    :cond_3
    :goto_3
    new-instance v2, Lfp1/a;

    invoke-direct {v2, v7}, Lfp1/a;-><init>(F)V

    invoke-virtual {v4, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v2, v5

    goto :goto_0

    :cond_4
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_5
    move-object/from16 v9, p3

    new-instance v1, Lfp1/d;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v12, 0x33b

    const/4 v13, 0x0

    invoke-direct/range {v1 .. v13}, Lfp1/d;-><init>(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p1, Lhp1/f$c;

    invoke-direct {p1, v0, v1}, Lhp1/f$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;Lhp1/m;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lhp1/f$g;

    invoke-virtual {p1}, Lhp1/m;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {p2, p1}, Lhp1/f$g;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
