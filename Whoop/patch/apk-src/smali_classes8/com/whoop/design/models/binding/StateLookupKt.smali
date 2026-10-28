.class public final Lcom/whoop/design/models/binding/StateLookupKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u001a$\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u001a\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0008H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "resolveStateRef",
        "",
        "reference",
        "",
        "state",
        "",
        "jsonElementToStateValue",
        "element",
        "Lkotlinx/serialization/json/JsonElement;",
        "state-binding-annotations"
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
.method private static final jsonElementToStateValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v0, :cond_4

    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of v0, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v0, :cond_5

    return-object p0

    :cond_5
    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v0, :cond_6

    return-object p0

    :cond_6
    sget-object v0, Lkotlinx/serialization/json/JsonNull;->INSTANCE:Lkotlinx/serialization/json/JsonNull;

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_7

    const/4 p0, 0x0

    return-object p0

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final resolveStateRef(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, "reference"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x2e

    const/4 v1, 0x0

    const/4 v2, 0x6

    invoke-static {p0, v0, v1, v1, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    if-gez v3, :cond_0

    invoke-interface {p1, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    const-string v5, "substring(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    const/4 v4, 0x0

    if-nez p1, :cond_1

    goto :goto_3

    :cond_1
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_9

    instance-of v3, p1, Lkotlinx/serialization/json/JsonObject;

    if-eqz v3, :cond_2

    check-cast p1, Lkotlinx/serialization/json/JsonObject;

    goto :goto_1

    :cond_2
    move-object p1, v4

    :goto_1
    if-nez p1, :cond_3

    goto :goto_3

    :cond_3
    invoke-static {p0, v0, v1, v1, v2}, Lyb3/r;->f0(Ljava/lang/CharSequence;CIZI)I

    move-result v3

    if-gez v3, :cond_4

    move-object v6, p0

    goto :goto_2

    :cond_4
    invoke-virtual {p0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_2
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {p1, v6}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    if-nez p1, :cond_6

    :goto_3
    return-object v4

    :cond_6
    instance-of v6, p1, Lkotlinx/serialization/json/JsonNull;

    if-eqz v6, :cond_7

    move-object p1, v4

    goto :goto_4

    :cond_7
    invoke-static {p1}, Lcom/whoop/design/models/binding/StateLookupKt;->jsonElementToStateValue(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object p1

    :goto_4
    if-gez v3, :cond_8

    const-string p0, ""

    goto :goto_0

    :cond_8
    add-int/lit8 v3, v3, 0x1

    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_9
    return-object p1
.end method
