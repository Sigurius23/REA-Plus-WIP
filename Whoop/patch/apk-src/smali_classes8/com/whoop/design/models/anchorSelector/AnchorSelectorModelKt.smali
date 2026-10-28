.class public final Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u000c\u0010\u0005\u001a\u00020\u0006*\u00020\u0003H\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"
    }
    d2 = {
        "SUGGESTED_SECTION_TYPE",
        "",
        "withFilteredSearchResults",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "searchText",
        "isSearchResult",
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


# static fields
.field private static final SUGGESTED_SECTION_TYPE:Ljava/lang/String; = "suggested"


# direct methods
.method public static final synthetic access$isSearchResult(Lcom/whoop/design/models/DesignSystemModel;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->isSearchResult(Lcom/whoop/design/models/DesignSystemModel;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$withFilteredSearchResults(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->withFilteredSearchResults(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    return-object p0
.end method

.method private static final isSearchResult(Lcom/whoop/design/models/DesignSystemModel;)Z
    .locals 1

    instance-of v0, p0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {p0}, Lcom/whoop/design/models/DesignModelWrapper;->getModel()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->isSearchResult(Lcom/whoop/design/models/DesignSystemModel;)Z

    move-result p0

    return p0

    :cond_0
    instance-of p0, p0, Lcom/whoop/design/models/SearchFilterableModel;

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final withFilteredSearchResults(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 9

    instance-of v0, p0, Lcom/whoop/design/models/DesignModelWrapper;

    if-eqz v0, :cond_1

    move-object v1, p0

    check-cast v1, Lcom/whoop/design/models/DesignModelWrapper;

    invoke-virtual {v1}, Lcom/whoop/design/models/DesignModelWrapper;->getModel()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    invoke-static {p0, p1}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModelKt;->withFilteredSearchResults(Lcom/whoop/design/models/DesignSystemModel;Ljava/lang/String;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v2

    if-nez v2, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/16 v7, 0x1e

    const/4 v8, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v8}, Lcom/whoop/design/models/DesignModelWrapper;->copy$default(Lcom/whoop/design/models/DesignModelWrapper;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/DesignModelWrapper;

    move-result-object p0

    return-object p0

    :cond_1
    instance-of v0, p0, Lcom/whoop/design/models/SearchFilterableModel;

    if-eqz v0, :cond_2

    check-cast p0, Lcom/whoop/design/models/SearchFilterableModel;

    invoke-interface {p0, p1}, Lcom/whoop/design/models/SearchFilterableModel;->filteredForSearch(Ljava/lang/String;)Lcom/whoop/design/models/SearchFilterableModel;

    move-result-object p0

    :cond_2
    return-object p0
.end method
