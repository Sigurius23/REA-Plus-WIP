.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001e\u0010\u0012\u001a\u00020\u000f2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0080@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\"\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001a\u0010\u001f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ$\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\r0 2\u000c\u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001b0 H\u0080@\u00a2\u0006\u0004\u0008\"\u0010#J\u0018\u0010)\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0080@\u00a2\u0006\u0004\u0008\'\u0010(J\u001e\u0010-\u001a\u00020\u000f2\u000c\u0010+\u001a\u0008\u0012\u0004\u0012\u00020*0\u000cH\u0080@\u00a2\u0006\u0004\u0008,\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010.R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010/R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00100R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00101\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;",
        "",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "queryChannelsRepository",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "channelConfigRepository",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
        "repositoryFacade",
        "<init>",
        "(Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channels",
        "Ll83/a0;",
        "storeStateForChannels$stream_chat_android_client_release",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "storeStateForChannels",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;",
        "fetchChannelsFromCache$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;",
        "fetchChannelsFromCache",
        "",
        "cid",
        "selectChannel$stream_chat_android_client_release",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "selectChannel",
        "",
        "cids",
        "selectChannels$stream_chat_android_client_release",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "selectChannels",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "queryChannelsSpec",
        "insertQueryChannels$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;",
        "insertQueryChannels",
        "Lio/getstream/chat/android/models/ChannelConfig;",
        "configs",
        "insertChannelConfigs$stream_chat_android_client_release",
        "insertChannelConfigs",
        "Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;",
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
.field private final channelConfigRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

.field private final repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;)V
    .locals 1

    const-string v0, "queryChannelsRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelConfigRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "repositoryFacade"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->channelConfigRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    return-void
.end method


# virtual methods
.method public final fetchChannelsFromCache$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$0:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->label:I

    invoke-interface {p3, p2, v0}, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;->selectBy(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object p2, p3

    check-cast p2, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    if-nez p2, :cond_5

    return-object v5

    :cond_5
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$1:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->L$2:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic$fetchChannelsFromCache$1;->label:I

    invoke-virtual {p3, v2, p1, v0}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->selectChannels(Ljava/util/List;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    move-object v6, p2

    move-object p2, p1

    move-object p1, v6

    :goto_3
    check-cast p3, Ljava/util/Collection;

    invoke-static {p3, p2}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->applyPagination(Ljava/util/Collection;Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;)Ljava/util/List;

    move-result-object p2

    new-instance p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;

    invoke-direct {p3, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;-><init>(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Ljava/util/List;)V

    return-object p3
.end method

.method public final insertChannelConfigs$stream_chat_android_client_release(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/ChannelConfig;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->channelConfigRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelConfigRepository;->insertChannelConfigs(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertQueryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->queryChannelsRepository:Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/QueryChannelsRepository;->insertQueryChannels(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectChannel$stream_chat_android_client_release(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannels$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final storeStateForChannels$stream_chat_android_client_release(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->repositoryFacade:Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/RepositoryFacade;->storeStateForChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
