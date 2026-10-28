.class public final synthetic Lqx/m0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqx/s;


# virtual methods
.method public final create(Ljava/lang/reflect/Type;Ljava/util/Set;Lqx/l0;)Lcom/squareup/moshi/JsonAdapter;
    .locals 3

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Landroidx/room/c1;->z(Ljava/lang/reflect/Type;)Ljava/lang/Class;

    move-result-object p2

    const-class v0, Ljava/util/Map;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p1, p2}, Landroidx/room/c1;->E(Ljava/lang/reflect/Type;Ljava/lang/Class;)[Ljava/lang/reflect/Type;

    move-result-object p1

    if-nez p1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return-object p1

    :cond_2
    new-instance p2, Lqx/n0;

    const/4 v0, 0x0

    aget-object v0, p1, v0

    const-string v1, "get(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    aget-object p1, p1, v2

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p3, v0, p1}, Lqx/n0;-><init>(Lqx/l0;Ljava/lang/reflect/Type;Ljava/lang/reflect/Type;)V

    invoke-virtual {p2}, Lcom/squareup/moshi/JsonAdapter;->nullSafe()Lcom/squareup/moshi/JsonAdapter;

    move-result-object p1

    return-object p1
.end method
