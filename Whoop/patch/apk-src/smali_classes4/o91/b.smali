.class public abstract Lo91/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aW\u0010\u000c\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007j\u0002`\u000b0\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r*0\u0008\u0002\u0010\u000e\"\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00072\u0014\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "",
        "Lj93/d;",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "Lkotlin/Function2;",
        "Lad3/k;",
        "Lkotlinx/serialization/json/JsonElement;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/json/serializers/DesignSystemModelFactory;",
        "c",
        "(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;",
        "DesignSystemModelFactory",
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
.method public static synthetic a(Lj93/d;Ltr2/n;Ljava/lang/String;Lrr2/c;Lad3/k;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static/range {p0 .. p5}, Lo91/b;->d(Lj93/d;Ltr2/n;Ljava/lang/String;Lrr2/c;Lad3/k;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;
    .locals 0

    invoke-static {p0, p1, p2}, Lo91/b;->c(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/util/Map;Ltr2/n;Lrr2/c;)Ljava/util/Map;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;",
            "Ltr2/n;",
            "Lrr2/c;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lc93/m;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    move-object v7, v3

    check-cast v7, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lj93/d;

    new-instance v4, Lb61/j;

    const/4 v9, 0x2

    move-object v6, p1

    move-object v8, p2

    invoke-direct/range {v4 .. v9}, Lb61/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-interface {v0, v2, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final d(Lj93/d;Ltr2/n;Ljava/lang/String;Lrr2/c;Lad3/k;Lkotlinx/serialization/json/JsonElement;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    const-string v0, "decoder"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-static {p0}, Lvb/g;->j(Lj93/d;)Lwc3/c;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p4}, Lad3/k;->a()Lad3/c;

    move-result-object p4

    check-cast p0, Lwc3/b;

    invoke-virtual {p4, p0, p5}, Lad3/c;->a(Lwc3/b;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :catch_0
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_0
    sget-object p0, Lcom/whoop/design/models/items/UnknownDesignModel;->INSTANCE:Lcom/whoop/design/models/items/UnknownDesignModel;

    :cond_1
    instance-of p4, p0, Lcom/whoop/design/models/DesignSystemModel;

    if-eqz p4, :cond_2

    check-cast p0, Lcom/whoop/design/models/DesignSystemModel;

    goto :goto_1

    :cond_2
    const/4 p0, 0x0

    :goto_1
    if-nez p0, :cond_3

    sget-object p0, Lcom/whoop/design/models/items/UnknownDesignModel;->INSTANCE:Lcom/whoop/design/models/items/UnknownDesignModel;
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    return-object p0

    :goto_2
    const-string p4, "Failed to deserialize design model type: "

    invoke-static {p4, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 p4, 0x0

    new-array p4, p4, [Lqr2/a$a;

    invoke-interface {p1, p2, p0, p4}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    if-eqz p3, :cond_4

    invoke-interface {p3, p0}, Lrr2/c;->p(Ljava/lang/Throwable;)V

    :cond_4
    sget-object p0, Lcom/whoop/design/models/items/UnknownDesignModel;->INSTANCE:Lcom/whoop/design/models/items/UnknownDesignModel;

    return-object p0
.end method
