.class public abstract Lcm2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lvl2/g;",
        "sections",
        "Lcm2/t;",
        "trendMenuSheetReducer",
        "Lcm2/o;",
        "a",
        "(Lvl2/g;Lcm2/t;)Lcm2/o;",
        "trends_release"
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
.method public static final a(Lvl2/g;Lcm2/t;)Lcm2/o;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "sections"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "trendMenuSheetReducer"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lvl2/g;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lvl2/g;->b()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lvl2/j;

    new-instance v5, Lcm2/p;

    invoke-virtual {v4}, Lvl2/j;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lvl2/j;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {v5, v6, v7}, Lcm2/p;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-virtual {v4}, Lvl2/j;->a()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lvl2/d;

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->a()Lgz0/m0;

    move-result-object v11

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->d()I

    move-result v8

    invoke-static {v8}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->g()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->f()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v8

    invoke-virtual {v8}, Lvl2/c;->e()Lvl2/i;

    move-result-object v8

    if-eqz v8, :cond_0

    invoke-virtual {v7}, Lvl2/d;->a()Lvl2/c;

    move-result-object v7

    invoke-virtual {v7}, Lvl2/c;->c()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v8, v7}, Lcm2/t;->f(Lvl2/i;Ljava/lang/String;)Lhv1/e;

    move-result-object v7

    :goto_2
    move-object/from16 v16, v7

    goto :goto_3

    :cond_0
    const/4 v7, 0x0

    goto :goto_2

    :goto_3
    new-instance v9, Lbm2/n;

    invoke-direct/range {v9 .. v16}, Lbm2/n;-><init>(Ljava/lang/String;Lgz0/m0;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lm91/u;)V

    new-instance v7, Lcm2/p;

    invoke-virtual {v9}, Lbm2/n;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-direct {v7, v8, v9}, Lcm2/p;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v5, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-static {v3, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto/16 :goto_0

    :cond_2
    new-instance v0, Lcm2/o;

    invoke-direct {v0, v1, v3}, Lcm2/o;-><init>(Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method
