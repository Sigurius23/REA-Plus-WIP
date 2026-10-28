.class public final Lcom/whoop/design/models/binding/BindCoercionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a\"\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0006\u0008\u0000\u0010\u0001\u0018\u00012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0086\u0008\u00a2\u0006\u0002\u0010\u0004\u001a\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0001\u00a8\u0006\u0006"
    }
    d2 = {
        "coerceToType",
        "T",
        "value",
        "",
        "(Ljava/lang/Object;)Ljava/lang/Object;",
        "unwrapForCoercion",
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
.method public static final coerceToType(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Object;",
            ")TT;"
        }
    .end annotation

    invoke-static {p0}, Lcom/whoop/design/models/binding/BindCoercionKt;->unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    instance-of v1, p0, Lkotlinx/serialization/json/JsonElement;

    if-eqz v1, :cond_1

    check-cast p0, Lkotlinx/serialization/json/JsonElement;

    :try_start_0
    invoke-static {}, Lcom/whoop/design/models/binding/StateBindingDeserializerKt;->getStateBindingJson()Lad3/c;

    move-result-object p0

    iget-object p0, p0, Lad3/c;->b:Lcd3/f;

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    return-object v0

    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    throw v0
.end method

.method public static final unwrapForCoercion(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-eqz p0, :cond_6

    instance-of v0, p0, Lkotlinx/serialization/json/JsonNull;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lkotlinx/serialization/json/JsonPrimitive;

    if-nez v0, :cond_1

    return-object p0

    :cond_1
    check-cast p0, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-virtual {p0}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p0}, Lad3/m;->e(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0

    :cond_3
    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {p0}, Lad3/m;->k(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    :cond_4
    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {p0}, Lad3/m;->g(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/Double;

    move-result-object p0

    return-object p0

    :cond_5
    invoke-static {p0}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_6
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
