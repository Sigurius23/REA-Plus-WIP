.class public abstract Ljb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a3\u0010\n\u001a\u00020\u00002\u0006\u0010\u0008\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000c\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a#\u0010\u0013\u001a\u00020\u00122\u0014\u0008\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\u0004\u0008\u0013\u0010\u0014*$\u0008\u0002\u0010\u0016\"\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000e2\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u000e\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/design/models/DesignSystemModel;",
        "model",
        "",
        "",
        "",
        "accumulatedState",
        "c",
        "(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;",
        "original",
        "updatedModel",
        "g",
        "(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;",
        "h",
        "(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;",
        "Lkotlin/Function1;",
        "Ljb1/b;",
        "Ll83/a0;",
        "block",
        "Ljb1/a;",
        "d",
        "(Lkotlin/jvm/functions/Function1;)Ljb1/a;",
        "Lm91/u;",
        "ItemConfig",
        "design-models_release"
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
.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljb1/c;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0}, Ljb1/c;->h(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/DesignSystemModel;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "model"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "accumulatedState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v0

    :cond_0
    invoke-static {v0}, Ljb1/c;->h(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/items/SectionModel;

    if-eqz v3, :cond_2

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/items/SectionModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-static {v3, v1}, Ljb1/c;->c(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v3

    invoke-interface {v8, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/16 v16, 0x7f7

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v4 .. v17}, Lcom/whoop/design/models/items/SectionModel;->copy$default(Lcom/whoop/design/models/items/SectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;FFFLjava/lang/String;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/SectionModel;

    move-result-object v2

    invoke-static {v0, v2, v1}, Ljb1/c;->g(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    :cond_2
    invoke-static {v0}, Ljb1/c;->h(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/WithGeneratedBindings;

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    move-object v3, v2

    check-cast v3, Lcom/whoop/design/models/WithGeneratedBindings;

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    if-eqz v3, :cond_4

    invoke-interface {v3, v1}, Lcom/whoop/design/models/WithGeneratedBindings;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v3

    goto :goto_2

    :cond_4
    move-object v3, v4

    :goto_2
    instance-of v5, v3, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz v5, :cond_5

    move-object v4, v3

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    :cond_5
    if-nez v4, :cond_6

    goto :goto_3

    :cond_6
    move-object v2, v4

    :goto_3
    invoke-static {v0, v2, v1}, Ljb1/c;->g(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Lkotlin/jvm/functions/Function1;)Ljb1/a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljb1/a;"
        }
    .end annotation

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljb1/b;

    invoke-direct {v0}, Ljb1/b;-><init>()V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ljb1/a;

    invoke-virtual {v0}, Ljb1/b;->e()Llb1/y0;

    move-result-object v1

    invoke-virtual {v0}, Ljb1/b;->d()Ljava/util/HashMap;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Ljb1/a;-><init>(Llb1/y0;Ljava/util/Map;)V

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljb1/a;
    .locals 0

    and-int/lit8 p1, p1, 0x1

    if-eqz p1, :cond_0

    new-instance p0, Lim1/p0;

    const/16 p1, 0x18

    invoke-direct {p0, p1}, Lim1/p0;-><init>(I)V

    :cond_0
    invoke-static {p0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Lcom/whoop/design/models/DesignSystemModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/DesignSystemModel;"
        }
    .end annotation

    instance-of v0, p0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/design/models/DesignModelWrapper;->rewrap$design_models_release(Lcom/whoop/design/models/DesignSystemModel;Ljava/util/Map;)Lcom/whoop/design/models/DesignModelWrapper;

    move-result-object p0

    return-object p0

    :cond_0
    return-object p1
.end method

.method private static final h(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/DesignSystemModelKt;->unwrap(Lcom/whoop/design/models/DesignSystemModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method
