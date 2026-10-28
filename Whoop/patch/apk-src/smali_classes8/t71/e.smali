.class public abstract Lt71/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lt71/f;",
        "impactState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt71/e;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt71/e;->e(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lt71/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "impactState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x7fa13295

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v3, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v3

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    :goto_5
    and-int/lit16 v9, v6, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v9, v10, :cond_9

    const/4 v9, 0x1

    goto :goto_6

    :cond_9
    move v9, v11

    :goto_6
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_f

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_a

    move-object v1, v9

    goto :goto_7

    :cond_a
    move-object v1, v5

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_b

    new-instance v5, Lsz0/k;

    const/16 v7, 0x1d

    invoke-direct {v5, v7}, Lsz0/k;-><init>(I)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v15, v5

    goto :goto_8

    :cond_c
    move-object v15, v8

    :goto_8
    invoke-virtual {v2}, Lt71/f;->b()Lt71/g;

    move-result-object v5

    instance-of v7, v5, Lt71/g$b;

    const/high16 v8, 0xe000000

    const/16 v10, 0x8

    if-eqz v7, :cond_d

    const v5, -0x67b94ea5

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    int-to-float v3, v3

    int-to-float v5, v10

    mul-float/2addr v3, v5

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move v7, v6

    invoke-virtual {v2}, Lt71/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lt71/f;->g()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    move v12, v7

    move v13, v8

    move-wide v7, v9

    invoke-virtual {v2}, Lt71/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v2}, Lt71/f;->e()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v0, v11}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v16

    move v14, v12

    invoke-virtual {v2}, Lt71/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Lt71/f;->b()Lt71/g;

    move-result-object v3

    check-cast v3, Lt71/g$b;

    invoke-virtual {v3}, Lt71/g$b;->a()Ly11/r;

    move-result-object v3

    invoke-virtual {v2}, Lt71/f;->b()Lt71/g;

    move-result-object v10

    check-cast v10, Lt71/g$b;

    shl-int/lit8 v14, v14, 0x12

    and-int/2addr v13, v14

    const/16 v18, 0x0

    move-object v14, v10

    move-wide/from16 v19, v16

    move-object/from16 v16, v0

    move v0, v11

    move/from16 v17, v13

    move-wide/from16 v10, v19

    move-object v13, v3

    invoke-static/range {v5 .. v18}, Li21/t;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Ly11/r;Lt71/g$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v16

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_d
    move v14, v6

    move v13, v8

    move-object v6, v0

    move v0, v11

    instance-of v5, v5, Lt71/g$a;

    if-eqz v5, :cond_e

    const v5, -0x1c1e61d3

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    int-to-float v3, v3

    int-to-float v5, v10

    mul-float/2addr v3, v5

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Lt71/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lt71/f;->g()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v6, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-virtual {v2}, Lt71/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v2}, Lt71/f;->e()Ly81/f;

    move-result-object v10

    invoke-virtual {v10, v6, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v2}, Lt71/f;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Lt71/f;->b()Lt71/g;

    move-result-object v16

    check-cast v16, Lt71/g$a;

    invoke-virtual {v2}, Lt71/f;->b()Lt71/g;

    move-result-object v17

    check-cast v17, Lt71/g$a;

    invoke-virtual/range {v17 .. v17}, Lt71/g$a;->a()Ljava/util/List;

    move-result-object v17

    shl-int/lit8 v14, v14, 0x12

    and-int/2addr v13, v14

    const/16 v18, 0x0

    move-object/from16 v14, v17

    move/from16 v17, v13

    move-object/from16 v13, v16

    move-object/from16 v16, v6

    move-object v6, v3

    invoke-static/range {v5 .. v18}, Li21/s;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lt71/g$a;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v6, v16

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_9
    move-object v3, v15

    goto :goto_a

    :cond_e
    const v1, -0x1c1ec975

    invoke-static {v1, v6, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_f
    move-object v6, v0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v8

    :goto_a
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lt71/d;

    const/4 v6, 0x0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt71/d;-><init>(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt71/e;->c(Landroidx/compose/ui/Modifier;Lt71/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
