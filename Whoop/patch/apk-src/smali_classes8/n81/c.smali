.class public abstract Ln81/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a3\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100\u000fH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0016\u001a\u00020\u00158\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "tagId",
        "",
        "Ln81/a;",
        "tags",
        "",
        "m",
        "(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;",
        "childEvent",
        "n",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ln81/f;",
        "itemState",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "selectedTag",
        "Lm91/u;",
        "designItem",
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
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln81/f;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ln81/c;->j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln81/f;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln81/c;->l(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ln81/f;Lp1/c1;)Lm91/u;
    .locals 0

    invoke-static {p0, p1}, Ln81/c;->h(Ln81/f;Lp1/c1;)Lm91/u;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ln81/c;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ln81/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v4, "modifier"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "itemState"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v4, 0x453be2e7

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v4, 0x93

    const/16 v6, 0x92

    const/4 v10, 0x0

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    move v5, v10

    :goto_4
    and-int/lit8 v6, v4, 0x1

    invoke-virtual {v13, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1e

    invoke-virtual {v2}, Ln81/f;->g()Ln81/d;

    move-result-object v5

    invoke-virtual {v2}, Ln81/f;->f()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_7

    if-ne v7, v12, :cond_8

    :cond_7
    invoke-virtual {v2}, Ln81/f;->f()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v6, v7

    check-cast v6, Lp1/c1;

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_9

    if-ne v14, v12, :cond_a

    :cond_9
    new-instance v7, Lmi2/o;

    const/16 v14, 0x8

    invoke-direct {v7, v14, v2, v6}, Lmi2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v7}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v14

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object/from16 v16, v14

    check-cast v16, Lp1/t2;

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v7, v13, v14}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v14, "tag-selector-allow-default-tag"

    invoke-interface {v7, v14}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    invoke-virtual {v2}, Ln81/f;->c()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_d

    if-eqz v7, :cond_d

    invoke-virtual {v2}, Ln81/f;->i()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    instance-of v11, v7, Ljava/util/Collection;

    if-eqz v11, :cond_b

    move-object v11, v7

    check-cast v11, Ljava/util/Collection;

    invoke-interface {v11}, Ljava/util/Collection;->isEmpty()Z

    move-result v11

    if-eqz v11, :cond_b

    goto :goto_5

    :cond_b
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_c
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_d

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ln81/a;

    invoke-virtual {v11}, Ln81/a;->b()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    goto :goto_6

    :cond_d
    :goto_5
    const/4 v14, 0x0

    :goto_6
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v9, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v13, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v10, v13, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Ln81/f;->e()Ljava/lang/Float;

    move-result-object v7

    const/16 v8, 0x8

    if-eqz v7, :cond_11

    invoke-virtual {v7}, Ljava/lang/Float;->floatValue()F

    move-result v7

    int-to-float v9, v8

    mul-float/2addr v7, v9

    const/4 v9, 0x2

    :goto_8
    move v10, v7

    goto :goto_9

    :cond_11
    const/4 v9, 0x2

    int-to-float v7, v9

    int-to-float v10, v8

    mul-float/2addr v7, v10

    goto :goto_8

    :goto_9
    invoke-virtual {v2}, Ln81/f;->i()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v15, 0xa

    invoke-static {v7, v15}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v11, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_a
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ln81/a;

    new-instance v8, Lm81/g;

    invoke-virtual {v15}, Ln81/a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v15}, Ln81/a;->c()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    sget-object v0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v5}, Ln81/d;->b()Lb91/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {v8, v9, v1, v15, v0}, Lm81/g;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;)V

    invoke-virtual {v11, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0x8

    const/4 v9, 0x2

    move-object/from16 v1, p0

    move/from16 v0, p4

    goto :goto_a

    :cond_12
    invoke-virtual {v2}, Ln81/f;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ln81/a;

    invoke-virtual {v7}, Ln81/a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v6}, Ln81/c;->f(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_c

    :cond_13
    add-int/lit8 v1, v1, 0x1

    goto :goto_b

    :cond_14
    const/4 v1, -0x1

    :goto_c
    invoke-virtual {v5}, Ln81/d;->a()Lm81/f;

    move-result-object v0

    invoke-virtual {v0}, Lm81/f;->a()Ly81/e;

    move-result-object v0

    const/4 v8, 0x0

    invoke-interface {v0, v13, v8}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v18

    new-instance v9, Ly3/f;

    invoke-direct {v9, v10}, Ly3/f;-><init>(F)V

    move v0, v10

    invoke-virtual {v5}, Ln81/d;->a()Lm81/f;

    move-result-object v10

    invoke-virtual {v5}, Ln81/d;->c()Lm81/f;

    move-result-object v15

    invoke-virtual {v13, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    and-int/lit16 v4, v4, 0x380

    const/16 v7, 0x100

    if-ne v4, v7, :cond_15

    const/16 v17, 0x1

    goto :goto_d

    :cond_15
    move/from16 v17, v8

    :goto_d
    or-int v5, v5, v17

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_17

    if-ne v7, v12, :cond_16

    goto :goto_e

    :cond_16
    move v14, v4

    const/16 v17, 0x100

    goto :goto_f

    :cond_17
    :goto_e
    new-instance v2, Ljp2/l;

    const/16 v7, 0xb

    move v5, v4

    move-object v4, v3

    move-object v3, v14

    move v14, v5

    move-object/from16 v5, p1

    const/16 v17, 0x100

    invoke-direct/range {v2 .. v7}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lp1/c1;I)V

    move-object v3, v4

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v7, v2

    :goto_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move v2, v14

    const/4 v14, 0x0

    move-object v5, v11

    move-object v11, v15

    const/4 v15, 0x0

    move v6, v1

    move-object/from16 v20, v12

    const/16 v4, 0x8

    move v1, v0

    move-object v12, v7

    move-wide/from16 v7, v18

    const/4 v0, 0x2

    invoke-static/range {v5 .. v15}, Lm81/e;->l(Ljava/util/List;IJLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v5, v0

    int-to-float v4, v4

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v4, v6, v13}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v4, 0x0

    invoke-static {v6, v1, v4, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v1, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_18

    invoke-virtual {v13, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_10
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v13, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    :cond_19
    invoke-static {v4, v13, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v13, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v16 .. v16}, Ln81/c;->i(Lp1/t2;)Lm91/u;

    move-result-object v5

    const/16 v7, 0x100

    if-ne v2, v7, :cond_1b

    const/4 v10, 0x1

    goto :goto_11

    :cond_1b
    move v10, v8

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v10, :cond_1c

    move-object/from16 v1, v20

    if-ne v0, v1, :cond_1d

    :cond_1c
    new-instance v0, Ll80/k;

    const/16 v1, 0x1a

    invoke-direct {v0, v3, v1}, Ll80/k;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v8, v0

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v9, v13

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1f

    new-instance v0, Ll72/n;

    const/16 v5, 0x12

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ll72/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final f(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final g(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ln81/f;Lp1/c1;)Lm91/u;
    .locals 1

    invoke-virtual {p0}, Ln81/f;->h()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1}, Ln81/c;->f(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Ln81/f;->h()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0}, Lm83/s;->E0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/Map$Entry;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object p1, p0

    check-cast p1, Lm91/u;

    :cond_0
    check-cast p1, Lm91/u;

    return-object p1
.end method

.method private static final i(Lp1/t2;)Lm91/u;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lm91/u;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lm91/u;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ln81/f;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "tappedTag"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-static {p3}, Ln81/c;->f(Lp1/c1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    move-object p0, p4

    :goto_0
    invoke-static {p3}, Ln81/c;->f(Lp1/c1;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_1

    invoke-static {p3, p0}, Ln81/c;->g(Lp1/c1;Ljava/lang/String;)V

    invoke-virtual {p2}, Ln81/f;->i()Ljava/util/List;

    move-result-object p2

    invoke-static {p0, p2}, Ln81/c;->m(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "childEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Ln81/c;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Ln81/c;->e(Landroidx/compose/ui/Modifier;Ln81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Ljava/lang/String;Ljava/util/List;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ln81/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "tagId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "tags"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln81/e$b;

    invoke-direct {v0, p0}, Ln81/e$b;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v3, v1

    check-cast v3, Ln81/a;

    invoke-virtual {v3}, Ln81/a;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    check-cast v1, Ln81/a;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ln81/a;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v2

    :cond_2
    if-eqz v2, :cond_3

    new-instance p0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {p0, v0, v2}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-object p0

    :cond_3
    return-object v0
.end method

.method public static final n(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const-string v0, "childEvent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lcom/whoop/design/item/DesignItemInteraction;

    if-nez v0, :cond_1

    instance-of v0, p0, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ln81/e$a;

    invoke-direct {v0, p0}, Ln81/e$a;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_1
    return-object p0
.end method
