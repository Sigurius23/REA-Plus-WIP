.class public final Lcom/whoop/design/models/binding/JsonPathSetterKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u001a.\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007H\u0000\u001a,\u0010\u0008\u001a\u0004\u0018\u00010\u0001*\u00020\u00012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "setNestedValue",
        "Lkotlinx/serialization/json/JsonElement;",
        "path",
        "",
        "",
        "value",
        "createMissingObjects",
        "",
        "setNestedValueOrLeaf",
        "tail",
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
.method public static final setNestedValue(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            "Z)",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "path"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_1

    goto/16 :goto_2

    :cond_1
    check-cast p1, Ljava/lang/Iterable;

    const/4 v1, 0x1

    invoke-static {p1, v1}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    instance-of v1, p0, Lkotlinx/serialization/json/JsonArray;

    if-eqz v1, :cond_4

    invoke-static {v0}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v1

    if-ltz v1, :cond_2

    move-object v3, p0

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    goto :goto_0

    :cond_2
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_8

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    move-object v1, p0

    check-cast v1, Lkotlinx/serialization/json/JsonArray;

    invoke-virtual {v1, v0}, Lkotlinx/serialization/json/JsonArray;->get(I)Lkotlinx/serialization/json/JsonElement;

    move-result-object v1

    invoke-static {v1, p1, p2, p3}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValueOrLeaf(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_2

    :cond_3
    check-cast p0, Ljava/util/Collection;

    invoke-static {p0}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p0

    invoke-virtual {p0, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lkotlinx/serialization/json/JsonArray;

    invoke-direct {p1, p0}, Lkotlinx/serialization/json/JsonArray;-><init>(Ljava/util/List;)V

    return-object p1

    :cond_4
    instance-of v1, p0, Lkotlinx/serialization/json/JsonObject;

    if-eqz v1, :cond_8

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_5

    goto :goto_1

    :cond_5
    move-object v1, p0

    check-cast v1, Lkotlinx/serialization/json/JsonObject;

    invoke-virtual {v1, v0}, Lkotlinx/serialization/json/JsonObject;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkotlinx/serialization/json/JsonElement;

    if-nez v1, :cond_6

    if-eqz p3, :cond_8

    new-instance v1, Lkotlinx/serialization/json/JsonObject;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-direct {v1, v3}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :cond_6
    invoke-static {v1, p1, p2, p3}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValue(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    if-nez p2, :cond_7

    goto :goto_2

    :cond_7
    :goto_1
    check-cast p0, Ljava/util/Map;

    invoke-static {p0}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-interface {p0, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Lkotlinx/serialization/json/JsonObject;

    invoke-direct {p1, p0}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    return-object p1

    :cond_8
    :goto_2
    return-object v2
.end method

.method public static synthetic setNestedValue$default(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;ZILjava/lang/Object;)Lkotlinx/serialization/json/JsonElement;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValue(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    return-object p0
.end method

.method private static final setNestedValueOrLeaf(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/serialization/json/JsonElement;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lkotlinx/serialization/json/JsonElement;",
            "Z)",
            "Lkotlinx/serialization/json/JsonElement;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lcom/whoop/design/models/binding/JsonPathSetterKt;->setNestedValue(Lkotlinx/serialization/json/JsonElement;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Z)Lkotlinx/serialization/json/JsonElement;

    move-result-object p0

    return-object p0
.end method
