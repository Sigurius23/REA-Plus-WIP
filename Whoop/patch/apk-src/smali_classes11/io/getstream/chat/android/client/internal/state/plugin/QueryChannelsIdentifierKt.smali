.class public final Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\u001a(\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0008*\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\u0008H\u0002\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00058@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0006\u00a8\u0006\u000b"
    }
    d2 = {
        "identifier",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "getIdentifier",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "normalizedIdentifierValues",
        "",
        "",
        "",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final getIdentifier(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getPredefinedFilter()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-object v0

    .line 3
    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    .line 4
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getFilterValues()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->normalizedIdentifierValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 5
    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getSortValues()Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->normalizedIdentifierValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 6
    invoke-direct {v1, v0, v2, p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public static final getIdentifier(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedFilterName()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    .line 8
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p0

    invoke-direct {v0, v1, p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-object v0

    .line 9
    :cond_0
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    .line 10
    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedFilterValues()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->normalizedIdentifierValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v2

    .line 11
    invoke-virtual {p0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedSortValues()Ljava/util/Map;

    move-result-object p0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->normalizedIdentifierValues(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p0

    .line 12
    invoke-direct {v1, v0, v2, p0}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method private static final normalizedIdentifierValues(Ljava/util/Map;)Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p0, :cond_1

    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const/4 p0, 0x0

    return-object p0
.end method
