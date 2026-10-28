.class public final Lcom/whoop/design/models/items/SelectableCellListModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u0000\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0000\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u0007H\u0002\u00a8\u0006\u0008"
    }
    d2 = {
        "matchesSearch",
        "",
        "Lcom/whoop/design/models/items/SelectableCellModel;",
        "query",
        "",
        "toSelectedCellIdsOrNull",
        "",
        "",
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
.method public static final synthetic access$toSelectedCellIdsOrNull(Ljava/lang/Object;)Ljava/util/Set;
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/items/SelectableCellListModelKt;->toSelectedCellIdsOrNull(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method

.method public static final matchesSearch(Lcom/whoop/design/models/items/SelectableCellModel;Ljava/lang/String;)Z
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Lcom/whoop/design/models/SearchFilterableModel;->Companion:Lcom/whoop/design/models/SearchFilterableModel$Companion;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getSearchKeys()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v1, p1, v2}, Lcom/whoop/design/models/SearchFilterableModel$Companion;->matchesQuery(Ljava/lang/String;Ljava/util/List;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/SelectableCellModel;->getTitle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-virtual {v1, p1, p0}, Lcom/whoop/design/models/SearchFilterableModel$Companion;->matchesQuery(Ljava/lang/String;Ljava/util/List;)Z

    move-result p0

    if-eqz p0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return p0

    :cond_2
    :goto_0
    return v0
.end method

.method private static final toSelectedCellIdsOrNull(Ljava/lang/Object;)Ljava/util/Set;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    instance-of v0, p0, Lkotlinx/serialization/json/JsonArray;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Lkotlinx/serialization/json/JsonArray;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-nez p0, :cond_1

    return-object v1

    :cond_1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lkotlinx/serialization/json/JsonElement;

    instance-of v3, v2, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v3, :cond_3

    check-cast v2, Lkotlinx/serialization/json/JsonPrimitive;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->isString()Z

    move-result v3

    if-eqz v3, :cond_4

    goto :goto_3

    :cond_4
    move-object v2, v1

    :goto_3
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lkotlinx/serialization/json/JsonPrimitive;->getContent()Ljava/lang/String;

    move-result-object v2

    goto :goto_4

    :cond_5
    move-object v2, v1

    :goto_4
    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p0

    return-object p0
.end method
