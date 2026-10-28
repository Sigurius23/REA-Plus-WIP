.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00030\nH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u00c6\u0003J\u0017\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u00c6\u0003Jy\u0010&\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0016\u0008\u0002\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\rH\u00c6\u0001J\u0013\u0010\'\u001a\u00020(2\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020+H\u00d6\u0001J\t\u0010,\u001a\u00020\u0003H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00030\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0012R\u001f\u0010\u000c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001f\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001d\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;",
        "",
        "id",
        "",
        "filter",
        "Lio/getstream/chat/android/models/FilterObject;",
        "querySort",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "cids",
        "",
        "predefinedFilterName",
        "predefinedFilterValues",
        "",
        "predefinedSortValues",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V",
        "getId",
        "()Ljava/lang/String;",
        "setId",
        "(Ljava/lang/String;)V",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getQuerySort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "getCids",
        "()Ljava/util/List;",
        "getPredefinedFilterName",
        "getPredefinedFilterValues",
        "()Ljava/util/Map;",
        "getPredefinedSortValues",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
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


# instance fields
.field private final cids:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final filter:Lio/getstream/chat/android/models/FilterObject;

.field private id:Ljava/lang/String;

.field private final predefinedFilterName:Ljava/lang/String;

.field private final predefinedFilterValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final predefinedSortValues:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private final querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cids"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p8, 0x10

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move-object p5, v0

    :cond_0
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_1

    move-object p6, v0

    :cond_1
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_2

    move-object p8, v0

    :goto_0
    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_2
    move-object p8, p7

    goto :goto_0

    .line 9
    :goto_1
    invoke-direct/range {p1 .. p8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    :cond_6
    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->copy(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final component3()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "querySort"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cids"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    iget-object v3, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    iget-object p1, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getCids()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    return-object v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getPredefinedFilterName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    return-object v0
.end method

.method public final getPredefinedFilterValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getPredefinedSortValues()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    return-object v0
.end method

.method public final getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final hashCode()I
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final setId(Ljava/lang/String;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->id:Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->filter:Lio/getstream/chat/android/models/FilterObject;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->querySort:Lio/getstream/chat/android/models/querysort/QuerySorter;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->cids:Ljava/util/List;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterName:Ljava/lang/String;

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedFilterValues:Ljava/util/Map;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/QueryChannelsEntity;->predefinedSortValues:Ljava/util/Map;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "QueryChannelsEntity(id="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", filter="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", querySort="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cids="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", predefinedFilterName="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", predefinedFilterValues="

    const-string v1, ", predefinedSortValues="

    invoke-static {v7, v4, v0, v5, v1}, Lvl/b;->w(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
