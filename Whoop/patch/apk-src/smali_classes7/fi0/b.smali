.class public abstract Lfi0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0015\u0010\u0008\u001a\u0004\u0018\u00010\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lfi0/a;",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V",
        "Lkotlinx/serialization/json/JsonElement;",
        "",
        "b",
        "(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;",
        "analytics_release"
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
.method public static final a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V
    .locals 9

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getCategory()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getAction()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getLabel()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getValue()Ljava/lang/String;

    move-result-object v6

    new-instance v0, Ln83/f;

    invoke-direct {v0}, Ln83/f;-><init>()V

    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getProperties()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lkotlinx/serialization/json/JsonElement;

    if-eqz v7, :cond_0

    invoke-static {v7}, Lfi0/b;->b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;

    move-result-object v7

    goto :goto_1

    :cond_0
    const/4 v7, 0x0

    :goto_1
    invoke-virtual {v0, v8, v7}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/analytics/AnalyticEventModel;->getSource()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    const-string v1, "source"

    invoke-virtual {v0, v1, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    invoke-virtual {v0}, Ln83/f;->b()Ln83/f;

    move-result-object v7

    move-object v1, p0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private static final b(Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Object;
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
