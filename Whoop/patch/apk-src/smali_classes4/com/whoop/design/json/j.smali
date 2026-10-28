.class public abstract Lcom/whoop/design/json/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aE\u0010\u0008\u001a$\u0012\u0004\u0012\u00020\u0001\u0012\u001a\u0012\u0018\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003j\u0002`\u00070\u0000*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t*0\u0008\u0002\u0010\n\"\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0003\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "",
        "Lj93/d;",
        "Lkotlin/Function2;",
        "Lcom/google/gson/JsonDeserializationContext;",
        "Lcom/google/gson/JsonObject;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Lcom/whoop/design/json/DesignSystemModelFactory;",
        "c",
        "(Ljava/util/Map;)Ljava/util/Map;",
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
.method public static synthetic a(Ljava/util/Map$Entry;Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/design/json/j;->d(Ljava/util/Map$Entry;Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Ljava/util/Map;)Ljava/util/Map;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/json/j;->c(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljava/util/Map;)Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lj93/d;",
            ">;)",
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

    new-instance v3, Lcom/whoop/design/json/i;

    const/4 v4, 0x1

    invoke-direct {v3, v4, v1}, Lcom/whoop/design/json/i;-><init>(ILjava/util/Map$Entry;)V

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final d(Ljava/util/Map$Entry;Lcom/google/gson/JsonDeserializationContext;Lcom/google/gson/JsonObject;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "content"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lj93/d;

    invoke-static {p0}, Ljc/x;->S(Lj93/d;)Ljava/lang/Class;

    move-result-object p0

    invoke-interface {p1, p2, p0}, Lcom/google/gson/JsonDeserializationContext;->deserialize(Lcom/google/gson/JsonElement;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/design/models/DesignSystemModel;

    return-object p0
.end method
