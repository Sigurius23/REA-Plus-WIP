.class public abstract Li51/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li51/r$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0016\u0008\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0008H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0011\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Li51/s;",
        "model",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Lv41/s;",
        "Ll83/a0;",
        "onLoadingChanged",
        "Lkotlin/Function0;",
        "animationHasCompleted",
        "d",
        "(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Li51/a;",
        "Li51/u;",
        "j",
        "(Li51/a;)Li51/u;",
        "loadingState",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li51/r;->h(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Li51/r;->i(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Li51/r;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li51/s;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "model"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v2, 0x56292cd1

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_1
    move v2, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v2, v9

    :goto_5
    and-int/lit8 v9, p6, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_6

    :cond_a
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v2, v11

    :goto_7
    and-int/lit16 v11, v2, 0x493

    const/16 v12, 0x492

    if-eq v11, v12, :cond_b

    const/4 v11, 0x1

    goto :goto_8

    :cond_b
    const/4 v11, 0x0

    :goto_8
    and-int/lit8 v12, v2, 0x1

    invoke-virtual {v0, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_20

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_c

    move-object v4, v11

    :cond_c
    if-eqz v6, :cond_d

    const/4 v6, 0x0

    goto :goto_9

    :cond_d
    move-object v6, v8

    :goto_9
    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v8, :cond_e

    new-instance v9, Li21/r;

    const/16 v10, 0xb

    invoke-direct {v9, v10}, Li21/r;-><init>(I)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v9, Lc93/a;

    move-object/from16 v17, v9

    goto :goto_a

    :cond_f
    move-object/from16 v17, v10

    :goto_a
    invoke-virtual {v1}, Li51/s;->g()Ljava/util/List;

    move-result-object v9

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_10

    if-ne v10, v8, :cond_11

    :cond_10
    sget-object v9, Li51/x;->a:Li51/x;

    invoke-virtual {v1}, Li51/s;->g()Ljava/util/List;

    move-result-object v10

    invoke-virtual {v9, v10}, Li51/x;->a(Ljava/util/List;)Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v10, Ljava/util/Map;

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_12

    if-ne v12, v8, :cond_14

    :cond_12
    new-instance v12, Ljava/util/ArrayList;

    invoke-interface {v10}, Ljava/util/Map;->size()I

    move-result v9

    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v9

    invoke-interface {v9}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_b
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/util/Map$Entry;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v14, v16

    check-cast v14, Ljava/lang/String;

    invoke-interface {v15}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/Number;

    invoke-virtual {v15}, Ljava/lang/Number;->intValue()I

    move-result v15

    new-instance v3, Lui/a0;

    sget-object v16, Lqi/a0;->a:Landroid/graphics/PointF;

    const/16 v16, 0x3

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    new-instance v13, Lwi/e;

    const-string v1, "**"

    filled-new-array {v1, v14}, [Ljava/lang/String;

    move-result-object v1

    invoke-direct {v13, v1}, Lwi/e;-><init>([Ljava/lang/String;)V

    invoke-static {v15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v3, v7, v13, v1}, Lui/a0;-><init>(Ljava/lang/Object;Lwi/e;Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p0

    goto :goto_b

    :cond_13
    invoke-virtual {v0, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v12, Ljava/util/List;

    invoke-virtual/range {p0 .. p0}, Li51/s;->a()Li51/a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v0, v1}, Lp1/q;->e(I)Z

    move-result v1

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_15

    if-ne v3, v8, :cond_16

    :cond_15
    invoke-virtual/range {p0 .. p0}, Li51/s;->a()Li51/a;

    move-result-object v1

    invoke-static {v1}, Li51/r;->j(Li51/a;)Li51/u;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Li51/u;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_17

    sget-object v1, Lv41/s;->LOADING:Lv41/s;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v1, Lp1/c1;

    sget-object v7, Lb2/e;->w:Lb2/m;

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 p2, v3

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_18

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_18
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_c
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v0, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_19

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    invoke-static {v13, v0, v13, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v0, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Li51/s;->c()Lv41/r0;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Li51/s;->a()Li51/a;

    move-result-object v3

    sget-object v9, Li51/a;->OFF:Li51/a;

    if-ne v3, v9, :cond_1b

    move-object v9, v10

    goto :goto_d

    :cond_1b
    const/4 v9, 0x0

    :goto_d
    invoke-virtual/range {p0 .. p0}, Li51/s;->e()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Li51/s;->b()Ljava/util/List;

    move-result-object v3

    move-object v13, v12

    invoke-virtual/range {p2 .. p2}, Li51/u;->a()I

    move-result v12

    move-object v14, v13

    invoke-virtual/range {p2 .. p2}, Li51/u;->c()Z

    move-result v13

    invoke-virtual/range {p2 .. p2}, Li51/u;->b()Ljava/lang/Float;

    move-result-object v15

    move-object/from16 p2, v15

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    and-int/lit16 v15, v2, 0x380

    move/from16 v20, v2

    const/16 v2, 0x100

    if-ne v15, v2, :cond_1c

    const/4 v2, 0x1

    goto :goto_e

    :cond_1c
    const/4 v2, 0x0

    :goto_e
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v2, :cond_1d

    if-ne v15, v8, :cond_1e

    :cond_1d
    new-instance v15, Lb30/r;

    const/16 v2, 0xf

    invoke-direct {v15, v6, v1, v2}, Lb30/r;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v15, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v2, v20, 0x6

    and-int/lit8 v20, v2, 0x70

    const/16 v21, 0x200

    move-object/from16 v16, v15

    const/4 v2, 0x0

    const/4 v15, 0x0

    move-object v8, v6

    move-object/from16 v6, v19

    const/16 v19, 0x6

    move-object/from16 v18, v0

    move-object v2, v11

    const/high16 v0, 0x3f800000    # 1.0f

    move-object v11, v3

    move-object v3, v8

    move-object v8, v14

    move-object/from16 v14, p2

    invoke-static/range {v6 .. v21}, Lv41/q0;->l(Landroidx/compose/ui/Modifier;Lv41/r0;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;IZLjava/lang/Float;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v18

    invoke-static {v1}, Li51/r;->f(Lp1/c1;)Lv41/s;

    move-result-object v1

    sget-object v7, Lv41/s;->READY:Lv41/s;

    if-eq v1, v7, :cond_1f

    invoke-virtual/range {p0 .. p0}, Li51/s;->f()Z

    move-result v1

    if-eqz v1, :cond_1f

    const v1, -0x66a96f60

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lt0/j;->a:Lt0/i;

    invoke-static {v0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v9, 0x0

    invoke-static {v0, v9, v1, v2}, Lgb1/c0;->d(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v2, "lottie_loading_shimmer"

    invoke-static {v0, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v6, v9}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1f
    const/4 v1, 0x1

    const/4 v9, 0x0

    const v0, -0x66a5fd35

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v9}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    move-object v2, v4

    move-object/from16 v4, v17

    goto :goto_10

    :cond_20
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v2, v4

    move-object v3, v8

    move-object v4, v10

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, Lg1/m3;

    const/16 v7, 0xc

    move-object/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lp1/c1;)Lv41/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lv41/s;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv41/s;

    return-object p0
.end method

.method private static final g(Lp1/c1;Lv41/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lv41/s;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 1

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Li51/r;->g(Lp1/c1;Lv41/s;)V

    if-eqz p0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Li51/r;->d(Li51/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Li51/a;)Li51/u;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Li51/r$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eq p0, v1, :cond_2

    const/4 v2, 0x2

    if-eq p0, v2, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    new-instance p0, Li51/u;

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {p0, v1, v2, v0}, Li51/u;-><init>(IZLjava/lang/Float;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Li51/u;

    invoke-direct {p0, v1, v1, v0}, Li51/u;-><init>(IZLjava/lang/Float;)V

    return-object p0

    :cond_2
    new-instance p0, Li51/u;

    const v2, 0x7fffffff

    invoke-direct {p0, v2, v1, v0}, Li51/u;-><init>(IZLjava/lang/Float;)V

    return-object p0
.end method
