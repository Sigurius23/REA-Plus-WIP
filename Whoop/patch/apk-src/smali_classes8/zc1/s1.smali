.class public abstract Lzc1/s1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/s1;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move/from16 v0, p1

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, 0x3d64fb9c

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v8, 0x0

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move v1, v8

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    const-string v1, "All Fields Enabled"

    const/4 v9, 0x6

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v8}, Lc41/f1;->l(Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float v10, v1, v1

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "No Leading Icon"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x7814a3a2

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-static {}, Lc41/f1;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v1, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lc41/g1;

    const/16 v25, 0x7fb

    const/16 v26, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v13 .. v26}, Lc41/g1;->b(Lc41/g1;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;ILjava/lang/Object;)Lc41/g1;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc41/g1;

    sget v6, Lc41/g1;->l:I

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_2
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "No Status Icon"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x7814ba02

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-static {}, Lc41/f1;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v13, v3

    check-cast v13, Lc41/g1;

    const/16 v25, 0x77f

    const/16 v26, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v13 .. v26}, Lc41/g1;->b(Lc41/g1;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;ILjava/lang/Object;)Lc41/g1;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_4
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc41/g1;

    sget v6, Lc41/g1;->l:I

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_4
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Null Data"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x7814dc62

    invoke-virtual {v5, v1}, Lp1/q;->e0(I)V

    invoke-static {}, Lc41/f1;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v12, v3

    check-cast v12, Lc41/g1;

    sget-object v17, Lc41/h1;->NO_DATA:Lc41/h1;

    invoke-virtual/range {v17 .. v17}, Lc41/h1;->getTextDefault()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    const/16 v24, 0x74f

    const/16 v25, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v12 .. v25}, Lc41/g1;->b(Lc41/g1;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lc41/h1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly81/f;Lcom/whoop/navigation/e;Ljava/util/List;ILjava/lang/Object;)Lc41/g1;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_6
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lc41/g1;

    sget v6, Lc41/g1;->l:I

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_6

    :cond_6
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v5, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Other Variants"

    invoke-static {v1, v5, v9}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v5, v8}, Lc41/f1;->n(Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_7
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_8

    new-instance v2, Lzc1/w0;

    const/4 v3, 0x7

    invoke-direct {v2, v0, v3}, Lzc1/w0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/s1;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
