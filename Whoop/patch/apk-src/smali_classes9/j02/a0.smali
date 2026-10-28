.class public abstract Lj02/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0017\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "name",
        "query",
        "",
        "analyticsEnabled",
        "Lcom/whoop/navigation/GenericScreenModel;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/GenericScreenModel;",
        "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "a",
        "(Ljava/lang/String;)Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "Lcom/whoop/analytics/MetricEventModel;",
        "b",
        "(Ljava/lang/String;)Lcom/whoop/analytics/MetricEventModel;",
        "navigation_release"
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
.method private static final a(Ljava/lang/String;)Lcom/whoop/analytics/ScreenAnalyticEventModel;
    .locals 22

    new-instance v0, Lcom/whoop/analytics/ScreenAnalyticEventModel;

    new-instance v1, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static/range {p0 .. p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v11, "deep_link_name"

    invoke-direct {v3, v11, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x38

    const/4 v10, 0x0

    const-string v2, "dynamic_deeplink_screen_entered"

    const-string v3, "navigation"

    const-string v4, "dynamic_deep_link"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v10}, Lcom/whoop/analytics/AnalyticEventModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static/range {p0 .. p0}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v11, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v19

    const/16 v20, 0x38

    const/16 v21, 0x0

    const-string v13, "dynamic_deeplink_screen_failed"

    const-string v14, "navigation"

    const-string v15, "dynamic_deep_link"

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v12, v3

    invoke-direct/range {v12 .. v21}, Lcom/whoop/analytics/AnalyticEventModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v4, 0x2

    const/4 v2, 0x0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/analytics/ScreenAnalyticEventModel;-><init>(Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final b(Ljava/lang/String;)Lcom/whoop/analytics/MetricEventModel;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/MetricEventModel;

    const-string v1, "dynamic_deep_link_"

    invoke-static {v1, p0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v1, "dynamic_deep_link"

    invoke-direct {v0, p0, v1}, Lcom/whoop/analytics/MetricEventModel;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final c(Ljava/lang/String;Ljava/lang/String;Z)Lcom/whoop/navigation/GenericScreenModel;
    .locals 12

    const-string v0, "name"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    const-string p1, ""

    goto :goto_0

    :cond_0
    const-string v0, "?"

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :goto_0
    new-instance v0, Lcom/whoop/navigation/GenericScreenModel;

    new-instance v1, Lcom/whoop/navigation/models/ApiRequest;

    const-string v2, "navigation-service/v1/deeplink/bff/"

    invoke-static {v2, p0, p1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/models/ApiRequest;-><init>(Ljava/lang/String;Lcom/whoop/navigation/models/GenericHttpMethod;Lkotlinx/serialization/json/JsonElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lcom/whoop/navigation/CachePolicyModel;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/CachePolicyModel;-><init>(ZLjava/lang/String;Ljava/util/Set;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    if-eqz p2, :cond_1

    invoke-static {p0}, Lj02/a0;->a(Ljava/lang/String;)Lcom/whoop/analytics/ScreenAnalyticEventModel;

    move-result-object v3

    move-object v4, v3

    goto :goto_1

    :cond_1
    move-object v4, p1

    :goto_1
    if-eqz p2, :cond_2

    invoke-static {p0}, Lj02/a0;->b(Ljava/lang/String;)Lcom/whoop/analytics/MetricEventModel;

    move-result-object p1

    :cond_2
    move-object v5, p1

    const/16 v10, 0x1e0

    const/4 v11, 0x0

    const-string v3, "PRESENT"

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/navigation/GenericScreenModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
