.class public abstract Lu82/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u001a\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a)\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0008*\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00000\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0013\u0010\u000c\u001a\u00020\u0003*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\u0007\u00a8\u0006\r"
    }
    d2 = {
        "Lkotlinx/serialization/json/JsonElement;",
        "",
        "preserveQuotedStrings",
        "",
        "d",
        "(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;",
        "c",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "",
        "",
        "b",
        "(Ljava/util/Map;)Ljava/util/Map;",
        "a",
        "serialization_release"
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
.method private static final a(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    invoke-static {v1}, Lu82/h;->a(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final c(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_1

    move-object p1, p0

    check-cast p1, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object p1

    if-nez p1, :cond_2

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object p1

    :cond_3
    return-object p0
.end method

.method public static synthetic e(Lkotlinx/serialization/json/JsonElement;ZILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lu82/h;->d(Lkotlinx/serialization/json/JsonElement;Z)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
