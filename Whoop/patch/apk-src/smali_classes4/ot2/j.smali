.class public final Lot2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJE\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00152\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006!"
    }
    d2 = {
        "Lot2/j;",
        "",
        "Ltw0/a;",
        "bottomSheetReducer",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Ljt2/m$i;",
        "domainState",
        "Ljt2/d;",
        "accumulator",
        "Lot2/a;",
        "h",
        "(Ljt2/m$i;Ljt2/d;)Lot2/a;",
        "",
        "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "topItems",
        "items",
        "",
        "useTopItems",
        "",
        "Lm91/u;",
        "g",
        "(Ljava/util/List;Ljava/util/List;Ljt2/d;Z)Ljava/util/List;",
        "a",
        "Ltw0/a;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljb1/a;",
        "c",
        "Ljb1/a;",
        "designItemReducer",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Ltw0/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ljb1/a;


# direct methods
.method public constructor <init>(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "bottomSheetReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot2/j;->a:Ltw0/a;

    iput-object p2, p0, Lot2/j;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Lo72/e;

    const/16 p2, 0x1a

    invoke-direct {p1, p2}, Lo72/e;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lot2/j;->c:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lot2/j;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lot2/i;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, Lot2/j;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Ljt2/d;Lm91/u;)Z
    .locals 0

    invoke-static {p0, p1}, Lot2/j;->e(Ljt2/d;Lm91/u;)Z

    move-result p0

    return p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Ljt2/d;Lm91/u;)Z
    .locals 4

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Ljt2/d;->j()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    instance-of v0, p0, Ljava/util/Collection;

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljt2/a;

    invoke-virtual {v0}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v0

    instance-of v2, p1, Lf41/e;

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move-object v2, p1

    check-cast v2, Lf41/e;

    goto :goto_0

    :cond_2
    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p0, 0x0

    return p0

    :cond_4
    return v1
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final g(Ljava/util/List;Ljava/util/List;Ljt2/d;Z)Ljava/util/List;
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
            ">;",
            "Ljt2/d;",
            "Z)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "accumulator"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lot2/j;->c:Ljb1/a;

    sget-object v3, Lm83/y;->w:Lm83/y;

    if-nez p1, :cond_0

    move-object v4, v3

    goto :goto_0

    :cond_0
    move-object/from16 v4, p1

    :goto_0
    invoke-virtual {v2, v4}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-static {v2}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v2

    iget-object v4, v0, Lot2/j;->c:Ljb1/a;

    if-nez p2, :cond_1

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    invoke-virtual {v4, v3}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-static {v3}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v3

    if-eqz p4, :cond_2

    move-object v4, v2

    goto :goto_2

    :cond_2
    move-object v4, v3

    :goto_2
    new-instance v5, Lot2/i;

    const/4 v6, 0x0

    invoke-direct {v5, v1, v6}, Lot2/i;-><init>(Ljt2/d;I)V

    new-instance v6, Laq0/i;

    const/4 v7, 0x6

    invoke-direct {v6, v5, v7}, Laq0/i;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v4, v6}, Ljava/util/Collection;->removeIf(Ljava/util/function/Predicate;)Z

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    move v7, v6

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_c

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v10, v7, 0x1

    if-ltz v7, :cond_b

    check-cast v8, Lm91/u;

    instance-of v11, v8, Lf41/e;

    if-eqz v11, :cond_3

    check-cast v8, Lf41/e;

    move-object v11, v8

    goto :goto_4

    :cond_3
    move-object v11, v9

    :goto_4
    if-eqz v11, :cond_a

    invoke-virtual {v1}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    instance-of v12, v8, Ljava/util/Collection;

    if-eqz v12, :cond_4

    move-object v12, v8

    check-cast v12, Ljava/util/Collection;

    invoke-interface {v12}, Ljava/util/Collection;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_4

    goto/16 :goto_8

    :cond_4
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljt2/a;

    invoke-virtual {v12}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_5

    invoke-virtual {v1}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Ljt2/a;

    invoke-virtual {v13}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v11}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_6

    move-object v9, v12

    :cond_7
    check-cast v9, Ljt2/a;

    if-eqz v9, :cond_8

    invoke-virtual {v9}, Ljt2/a;->e()Z

    move-result v8

    move/from16 v20, v8

    goto :goto_5

    :cond_8
    move/from16 v20, v6

    :goto_5
    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ljt2/a;->d()I

    move-result v8

    :goto_6
    move/from16 v24, v8

    goto :goto_7

    :cond_9
    const/4 v8, 0x1

    goto :goto_6

    :goto_7
    const/16 v26, 0x2eff

    const/16 v27, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v11 .. v27}, Lf41/e;->b(Lf41/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILjava/lang/Object;)Lf41/e;

    move-result-object v8

    invoke-interface {v4, v7, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_a
    :goto_8
    move v7, v10

    goto/16 :goto_3

    :cond_b
    invoke-static {}, Lwb3/f;->d0()V

    throw v9

    :cond_c
    if-nez p4, :cond_1b

    invoke-virtual {v1}, Ljt2/d;->j()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    :goto_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljt2/a;

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_e

    goto :goto_c

    :cond_e
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_f
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_12

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm91/u;

    instance-of v10, v8, Lf41/e;

    if-eqz v10, :cond_10

    check-cast v8, Lf41/e;

    goto :goto_a

    :cond_10
    move-object v8, v9

    :goto_a
    if-eqz v8, :cond_11

    invoke-virtual {v8}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_b

    :cond_11
    move-object v8, v9

    :goto_b
    invoke-virtual {v6}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_9

    :cond_12
    :goto_c
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_13

    goto :goto_f

    :cond_13
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_14
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_17

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm91/u;

    instance-of v10, v8, Lf41/e;

    if-eqz v10, :cond_15

    check-cast v8, Lf41/e;

    goto :goto_d

    :cond_15
    move-object v8, v9

    :goto_d
    if-eqz v8, :cond_16

    invoke-virtual {v8}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_e

    :cond_16
    move-object v8, v9

    :goto_e
    invoke-virtual {v6}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_14

    goto :goto_9

    :cond_17
    :goto_f
    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v7

    invoke-virtual {v7}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_10
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lsw0/i;

    invoke-virtual {v10}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-static {v8, v10}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_1a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lsw0/j;

    invoke-virtual {v10}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v6}, Ljt2/a;->c()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_19

    goto :goto_11

    :cond_1a
    move-object v8, v9

    :goto_11
    check-cast v8, Lsw0/j;

    if-eqz v8, :cond_d

    invoke-static {v8}, Lsw0/h;->e(Lsw0/j;)Lcom/whoop/design/models/items/GoalSettingsTileModel;

    move-result-object v7

    invoke-static {v7}, Llb1/v1;->b(Lcom/whoop/design/models/items/GoalSettingsTileModel;)Lf41/e;

    move-result-object v10

    invoke-virtual {v6}, Ljt2/a;->e()Z

    move-result v19

    invoke-virtual {v6}, Ljt2/a;->d()I

    move-result v23

    const/16 v25, 0x2eff

    const/16 v26, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    invoke-static/range {v10 .. v26}, Lf41/e;->b(Lf41/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILjava/lang/Object;)Lf41/e;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_9

    :cond_1b
    return-object v4
.end method

.method public final h(Ljt2/m$i;Ljt2/d;)Lot2/a;
    .locals 46

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "domainState"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "accumulator"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v6, v3

    move v5, v4

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v8, 0x1

    if-eqz v7, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v9

    sget-object v10, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->ACTIVITIES:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-ne v9, v10, :cond_0

    if-eqz v5, :cond_1

    :goto_1
    move-object v6, v3

    goto :goto_2

    :cond_1
    move-object v6, v7

    move v5, v8

    goto :goto_0

    :cond_2
    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    check-cast v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-nez v6, :cond_4

    return-object v3

    :cond_4
    iget-object v2, v0, Lot2/j;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "healthspan-coaching-bottom-sheet-swipe"

    invoke-interface {v2, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lot2/j;->a:Ltw0/a;

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v5

    invoke-virtual {v2, v5}, Ltw0/a;->c(Lsw0/g;)Ljava/util/List;

    move-result-object v2

    goto :goto_3

    :cond_5
    sget-object v2, Lm83/y;->w:Lm83/y;

    :goto_3
    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopHeadingDisplay()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v5, v3

    :goto_4
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_7

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v5

    goto :goto_5

    :cond_7
    move-object v5, v3

    :goto_5
    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    if-eqz v7, :cond_8

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v7

    goto :goto_6

    :cond_8
    move-object v7, v3

    :goto_6
    invoke-virtual {v0, v5, v7, v1, v8}, Lot2/j;->g(Ljava/util/List;Ljava/util/List;Ljt2/d;Z)Ljava/util/List;

    move-result-object v14

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_9

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getHeadingDisplay()Ljava/lang/String;

    move-result-object v5

    goto :goto_7

    :cond_9
    move-object v5, v3

    :goto_7
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_a

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v5

    goto :goto_8

    :cond_a
    move-object v5, v3

    :goto_8
    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v7

    goto :goto_9

    :cond_b
    move-object v7, v3

    :goto_9
    invoke-virtual {v0, v5, v7, v1, v4}, Lot2/j;->g(Ljava/util/List;Ljava/util/List;Ljt2/d;Z)Ljava/util/List;

    move-result-object v16

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v5

    if-eqz v5, :cond_c

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getTitleDisplay()Ljava/lang/String;

    move-result-object v5

    goto :goto_a

    :cond_c
    move-object v5, v3

    :goto_a
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v5

    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v5

    if-eqz v5, :cond_10

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getIcon()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_10

    sget-object v7, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v9, v8

    :goto_b
    if-ge v4, v9, :cond_e

    aget-object v17, v8, v4

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_c

    :cond_d
    add-int/lit8 v4, v4, 0x1

    const/4 v3, 0x0

    goto :goto_b

    :cond_e
    const/16 v17, 0x0

    :goto_c
    if-nez v17, :cond_f

    goto :goto_d

    :cond_f
    move-object/from16 v7, v17

    :goto_d
    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    :goto_e
    move/from16 v21, v3

    goto :goto_f

    :cond_10
    sget-object v3, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-virtual {v3}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    goto :goto_e

    :goto_f
    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v3

    if-eqz v3, :cond_12

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getAction()Lcom/whoop/navigation/e;

    move-result-object v3

    if-nez v3, :cond_11

    goto :goto_10

    :cond_11
    move-object/from16 v19, v3

    goto :goto_11

    :cond_12
    :goto_10
    new-instance v22, Lcom/whoop/navigation/e;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v22

    :goto_11
    new-instance v17, Lot2/b;

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v23}, Lot2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTipContent()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;

    move-result-object v3

    if-eqz v3, :cond_13

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/k0;->a()I

    move-result v4

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;->getTipsMarkdown()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v7, Lqt2/c0;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-direct {v7, v5, v4, v3}, Lqt2/c0;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v20, v7

    goto :goto_12

    :cond_13
    const/16 v20, 0x0

    :goto_12
    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->n()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->m()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->d()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_13
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_14

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_14
    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v3

    invoke-virtual {v3}, Lsw0/g;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    invoke-static {v6}, Lot2/d;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;

    move-result-object v30

    iget-object v3, v0, Lot2/j;->a:Ltw0/a;

    invoke-virtual {v1}, Ljt2/d;->c()Lsw0/g;

    move-result-object v1

    invoke-virtual {v3, v1}, Ltw0/a;->b(Lsw0/g;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lsw0/i;

    invoke-virtual {v6}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-virtual {v6}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_15
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_16

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lsw0/j;

    invoke-virtual {v8}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v34

    invoke-virtual {v8}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    invoke-virtual {v8}, Lsw0/j;->v()Z

    move-result v36

    new-instance v37, Lkd1/o$c;

    invoke-virtual {v8}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v38

    const/16 v42, 0xe

    const/16 v43, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v37 .. v43}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-virtual {v8}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 p1, v1

    invoke-static {v9, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_15

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_15
    invoke-virtual {v8}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    new-instance v33, Lkm0/d;

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x380

    const/16 v45, 0x0

    move-object/from16 v39, v0

    invoke-direct/range {v33 .. v45}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v33

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    goto/16 :goto_15

    :cond_16
    move-object/from16 p1, v1

    new-instance v31, Lkm0/g;

    const/16 v34, 0x0

    const/16 v35, 0x4

    const/16 v36, 0x0

    move-object/from16 v33, v7

    invoke-direct/range {v31 .. v36}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v31

    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    goto/16 :goto_14

    :cond_17
    check-cast v2, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    check-cast v2, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lsw0/i;

    invoke-virtual {v7}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-virtual {v7}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v8, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_19
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_19

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lsw0/j;

    invoke-virtual {v9}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v34

    invoke-virtual {v9}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v35

    invoke-virtual {v9}, Lsw0/j;->v()Z

    move-result v36

    new-instance v37, Lkd1/o$c;

    invoke-virtual {v9}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v38

    const/16 v42, 0xe

    const/16 v43, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v37 .. v43}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v19

    invoke-static/range {v19 .. v19}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v38

    invoke-virtual {v9}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v19

    move-object/from16 p1, v1

    move-object/from16 v1, v19

    check-cast v1, Ljava/lang/Iterable;

    move-object/from16 p2, v2

    new-instance v2, Ljava/util/ArrayList;

    move-object/from16 v27, v3

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1a
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1a

    :cond_18
    invoke-virtual {v9}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v40

    new-instance v33, Lkm0/d;

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x380

    const/16 v45, 0x0

    move-object/from16 v39, v2

    invoke-direct/range {v33 .. v45}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v33

    invoke-virtual {v8, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, v27

    goto/16 :goto_19

    :cond_19
    move-object/from16 p1, v1

    move-object/from16 p2, v2

    move-object/from16 v27, v3

    new-instance v31, Lkm0/g;

    const/16 v34, 0x0

    const/16 v35, 0x4

    const/16 v36, 0x0

    move-object/from16 v33, v8

    invoke-direct/range {v31 .. v36}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v31

    invoke-virtual {v6, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    goto/16 :goto_18

    :cond_1a
    move-object/from16 p1, v1

    move-object/from16 v27, v3

    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_17

    :cond_1b
    move-object/from16 v27, v3

    new-instance v21, Lkm0/e;

    const/16 v35, 0x1e00

    const/16 v36, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v28, v0

    move-object/from16 v25, v4

    invoke-direct/range {v21 .. v36}, Lkm0/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lot2/a;

    const/16 v19, 0x1

    invoke-direct/range {v9 .. v21}, Lot2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lot2/b;Lcom/whoop/design/util/TextResource;ZLqt2/c0;Lkm0/e;)V

    return-object v9
.end method
