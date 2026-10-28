.class public abstract Lgz2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aA\u0010\n\u001a\u00020\u00062\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lm91/u;",
        "footer",
        "Lcom/whoop/design/util/TextResource;",
        "footerText",
        "Lkotlin/Function1;",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "Ll83/a0;",
        "onNavEvent",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "c",
        "(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lgz2/d;->e(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lgz2/d;->d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm91/u;",
            "Lcom/whoop/design/util/TextResource;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p1

    move-object/from16 v8, p2

    move/from16 v9, p5

    const-string v1, "onNavEvent"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v1, -0x7ec56eb5

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v2, v9, 0x30

    if-nez v2, :cond_4

    and-int/lit8 v2, v9, 0x40

    if-nez v2, :cond_2

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v1, v2

    :cond_4
    and-int/lit16 v2, v9, 0x180

    if-nez v2, :cond_6

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    const/16 v2, 0x100

    goto :goto_4

    :cond_5
    const/16 v2, 0x80

    :goto_4
    or-int/2addr v1, v2

    :cond_6
    and-int/lit8 v2, p6, 0x8

    if-eqz v2, :cond_8

    or-int/lit16 v1, v1, 0xc00

    :cond_7
    move-object/from16 v5, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v5, v9, 0xc00

    if-nez v5, :cond_7

    move-object/from16 v5, p3

    invoke-virtual {v4, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x800

    goto :goto_5

    :cond_9
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v1, v6

    :goto_6
    and-int/lit16 v6, v1, 0x493

    const/16 v10, 0x492

    const/4 v12, 0x0

    if-eq v6, v10, :cond_a

    const/4 v6, 0x1

    goto :goto_7

    :cond_a
    move v6, v12

    :goto_7
    and-int/lit8 v10, v1, 0x1

    invoke-virtual {v4, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_15

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_b

    move-object v2, v13

    goto :goto_8

    :cond_b
    move-object v2, v5

    :goto_8
    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v6, "dwl-landing-v2"

    invoke-interface {v5, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    instance-of v6, v0, Lh51/f;

    if-eqz v6, :cond_14

    const v6, 0x7e96b600

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v10, v4, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v4, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_e

    :cond_d
    invoke-static {v10, v4, v10, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v7, :cond_f

    const v3, -0x7301ae2b

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v12}, Lp1/q;->q(Z)V

    move v3, v12

    const/4 v5, 0x1

    goto/16 :goto_c

    :cond_f
    const v3, -0x7301ae2a

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-static {v4, v12}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v20

    int-to-float v3, v12

    const/16 v42, 0x3fff

    const/16 v43, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const-wide/16 v24, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const-wide/16 v32, 0x0

    const/16 v34, 0x0

    const-wide/16 v35, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    move/from16 v41, v3

    invoke-static/range {v20 .. v43}, Liz0/m;->b(Liz0/m;Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFILjava/lang/Object;)Liz0/m;

    move-result-object v3

    const-wide/high16 v14, 0x4004000000000000L    # 2.5

    double-to-float v6, v14

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v14, v6, v11

    if-eqz v5, :cond_10

    const/4 v5, 0x1

    int-to-float v6, v5

    mul-float/2addr v6, v11

    :goto_a
    move/from16 v17, v6

    goto :goto_b

    :cond_10
    const/4 v5, 0x1

    mul-float v6, v41, v11

    goto :goto_a

    :goto_b
    const/16 v18, 0x2

    const/4 v15, 0x0

    move/from16 v16, v14

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget v6, Liz0/m;->p:I

    shl-int/lit8 v20, v6, 0x9

    const/16 v21, 0x1f4

    move v6, v12

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v13, v3

    move-object/from16 v19, v4

    move v3, v6

    invoke-static/range {v10 .. v21}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    :goto_c
    invoke-static {}, Lkz2/f;->b()Lm91/p;

    move-result-object v6

    and-int/lit16 v10, v1, 0x380

    const/16 v11, 0x100

    if-ne v10, v11, :cond_11

    move v11, v5

    goto :goto_d

    :cond_11
    move v11, v3

    :goto_d
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v11, :cond_12

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_13

    :cond_12
    new-instance v10, Lge0/c;

    const/16 v11, 0xd

    invoke-direct {v10, v8, v11}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v4, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v10, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v1, v1, 0xe

    sget v11, Lm91/p;->b:I

    shl-int/lit8 v11, v11, 0x3

    or-int/2addr v1, v11

    move/from16 v19, v5

    move v5, v1

    move-object v1, v6

    const/4 v6, 0x4

    move-object v13, v2

    const/4 v2, 0x0

    move v11, v3

    move-object v3, v10

    move/from16 v10, v19

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    move-object v13, v2

    move v11, v12

    const v0, 0x7ea15f17

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v11}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v13, v5

    :goto_e
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_16

    new-instance v0, Lg1/m3;

    const/4 v7, 0x4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object v3, v8

    move v5, v9

    move-object v4, v13

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final d(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/whooplabs/feature/navigation/c$h;

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/ArticleTileModelEvent$Url;->getUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/whoop/whooplabs/feature/navigation/c$h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lgz2/d;->c(Lm91/u;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
