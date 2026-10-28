.class public final Lhy0/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lm91/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lm91/f<",
        "Lhy0/n1;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J3\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008H\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lhy0/i1;",
        "Lm91/f;",
        "Lhy0/n1;",
        "<init>",
        "()V",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Lhy0/n1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhy0/i1;->d(Lhy0/n1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhy0/i1;Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lhy0/i1;->e(Lhy0/i1;Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lhy0/n1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 5

    const-string v0, "updatedValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhy0/n1;->j()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    new-instance p2, Lcom/whoop/whoopaction/domain/models/StateClearAction;

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {p2, p0, v2, v1, v3}, Lcom/whoop/whoopaction/domain/models/StateClearAction;-><init>(Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    invoke-static {p2}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p2

    new-instance v4, Ll83/k;

    invoke-direct {v4, p0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object p0

    invoke-direct {v0, p0, v2, v1, v3}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p2, v0

    :goto_0
    new-instance p0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-direct {p0, p2, v3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lhy0/i1;Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-virtual/range {v0 .. v5}, Lhy0/i1;->c(Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public bridge synthetic Compose(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    check-cast p2, Lhy0/n1;

    invoke-virtual/range {p0 .. p5}, Lhy0/i1;->c(Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method

.method public c(Landroidx/compose/ui/Modifier;Lhy0/n1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lhy0/n1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p5

    const-string v4, "modifier"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "itemState"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onViewEvent"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p4

    check-cast v13, Lp1/q;

    const v4, -0x52969583

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v5, v3, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_4

    and-int/lit8 v5, v3, 0x40

    if-nez v5, :cond_2

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_2

    :cond_2
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_2
    if-eqz v5, :cond_3

    move v5, v6

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v4, v5

    :cond_4
    and-int/lit16 v5, v3, 0x180

    const/16 v7, 0x100

    if-nez v5, :cond_6

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    move v5, v7

    goto :goto_4

    :cond_5
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v4, v5

    :cond_6
    and-int/lit16 v5, v4, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v5, v8, :cond_7

    move v5, v10

    goto :goto_5

    :cond_7
    move v5, v9

    :goto_5
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v13, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    and-int/lit8 v5, v4, 0x70

    if-eq v5, v6, :cond_9

    and-int/lit8 v8, v4, 0x40

    if-eqz v8, :cond_8

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_6

    :cond_8
    move v8, v9

    goto :goto_7

    :cond_9
    :goto_6
    move v8, v10

    :goto_7
    and-int/lit16 v11, v4, 0x380

    if-ne v11, v7, :cond_a

    move v12, v10

    goto :goto_8

    :cond_a
    move v12, v9

    :goto_8
    or-int/2addr v8, v12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_b

    if-ne v12, v14, :cond_c

    :cond_b
    new-instance v12, Lhy0/i1$a;

    const/4 v8, 0x0

    invoke-direct {v12, v1, v2, v8}, Lhy0/i1$a;-><init>(Lhy0/n1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v13, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v12, Lc93/m;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v13, v12, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhy0/n1;->e()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lhy0/n1;->k()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v1}, Lhy0/n1;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lhy0/n1;->a()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v1}, Lhy0/n1;->f()I

    move-result v16

    invoke-virtual {v1}, Lhy0/n1;->g()I

    move-result v17

    invoke-virtual {v1}, Lhy0/n1;->m()Z

    move-result v18

    move-object/from16 v19, v8

    invoke-virtual {v1}, Lhy0/n1;->l()Z

    move-result v8

    move/from16 v20, v9

    invoke-virtual {v1}, Lhy0/n1;->h()Z

    move-result v9

    move/from16 v21, v10

    invoke-virtual {v1}, Lhy0/n1;->b()Lb91/a;

    move-result-object v10

    invoke-virtual {v1}, Lhy0/n1;->i()Z

    move-result v22

    if-eq v5, v6, :cond_e

    and-int/lit8 v5, v4, 0x40

    if-eqz v5, :cond_d

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_d

    goto :goto_9

    :cond_d
    move/from16 v5, v20

    goto :goto_a

    :cond_e
    :goto_9
    move/from16 v5, v21

    :goto_a
    if-ne v11, v7, :cond_f

    move/from16 v20, v21

    :cond_f
    or-int v5, v5, v20

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_10

    if-ne v6, v14, :cond_11

    :cond_10
    new-instance v6, Lh02/h;

    const/16 v5, 0xb

    invoke-direct {v6, v5, v1, v2}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v6, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v14, v4, 0xe

    move-object v4, v15

    const/4 v15, 0x0

    move/from16 v5, v16

    const/16 v16, 0x0

    move-object v2, v12

    move/from16 v7, v18

    move-object/from16 v1, v19

    move/from16 v11, v22

    move-object v12, v6

    move/from16 v6, v17

    invoke-static/range {v0 .. v16}, Lhy0/l1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIZZZLb91/a;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    goto :goto_b

    :cond_12
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lhy0/d1;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lhy0/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method
