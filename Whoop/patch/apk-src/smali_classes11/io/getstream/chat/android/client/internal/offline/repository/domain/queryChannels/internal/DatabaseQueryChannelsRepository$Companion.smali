.class final Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0082\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\u0008\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0010\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tH\u0002\u00a8\u0006\u000e"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;",
        "",
        "<init>",
        "()V",
        "generateId",
        "",
        "identifier",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "toEntity",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;",
        "queryChannelsSpec",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "toModel",
        "queryChannelsEntity",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic access$generateId(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->generateId(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toEntity(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->toEntity(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p0

    return-object p0
.end method

.method private final generateId(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Ljava/lang/String;
    .locals 4

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/models/querysort/QuerySorter;->toDto()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, "-"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-eqz v0, :cond_3

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getFilterValues()Ljava/util/Map;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getSortValues()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :cond_2
    const-string p1, "pd:"

    const-string v3, ":"

    invoke-static {v1, p1, v0, v3, v3}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final toEntity(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 8

    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->getIdentifier(Lio/getstream/chat/android/client/query/QueryChannelsSpec;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    move-result-object v1

    invoke-direct {p0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/DatabaseQueryChannelsRepository$Companion;->generateId(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedFilterName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedFilterValues()Ljava/util/Map;

    move-result-object v6

    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedSortValues()Ljava/util/Map;

    move-result-object v7

    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method

.method private final toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;
    .locals 7

    new-instance v0, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getCids()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v3

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getPredefinedFilterName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getPredefinedFilterValues()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->getPredefinedSortValues()Ljava/util/Map;

    move-result-object v6

    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v0
.end method
