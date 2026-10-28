.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a8\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001e\u0010\u0015\u001a\u00020\u000f2\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J,\u0010\u001b\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ&\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00192\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ8\u0010&\u001a\u0012\u0012\u0004\u0012\u00020$0#j\u0008\u0012\u0004\u0012\u00020$`%2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0004\u0008&\u0010\'J&\u0010*\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010(\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0082@\u00a2\u0006\u0004\u0008*\u0010+J\u001e\u0010-\u001a\u00020\u000f2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020$0\u0012H\u0082@\u00a2\u0006\u0004\u0008-\u0010\u0016J\u0018\u00102\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020.H\u0080@\u00a2\u0006\u0004\u00080\u00101J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0000\u00a2\u0006\u0004\u00083\u00104J\u0015\u00109\u001a\u0008\u0012\u0004\u0012\u00020\u000c06H\u0000\u00a2\u0006\u0004\u00087\u00108J%\u0010@\u001a\u00020\u000f2\u0006\u0010;\u001a\u00020:2\u000c\u0010=\u001a\u0008\u0012\u0004\u0012\u00020\u00130<H\u0000\u00a2\u0006\u0004\u0008>\u0010?J\u0018\u0010D\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u0013H\u0080@\u00a2\u0006\u0004\u0008B\u0010CJ\u0018\u0010H\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0080@\u00a2\u0006\u0004\u0008F\u0010GJ,\u0010I\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008I\u0010\u001cJ\u001c\u0010L\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00130\u00120\u0017H\u0080@\u00a2\u0006\u0004\u0008J\u0010KJ\u0018\u0010N\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0080@\u00a2\u0006\u0004\u0008M\u0010GJ\u001d\u0010R\u001a\u00020\u000f2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020$0OH\u0000\u00a2\u0006\u0004\u0008P\u0010QJ\u0017\u0010W\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020SH\u0000\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010Z\u001a\u00020\u000fH\u0000\u00a2\u0006\u0004\u0008X\u0010YJ$\u0010_\u001a\u0008\u0012\u0004\u0012\u00020]0\u00122\u000c\u0010\\\u001a\u0008\u0012\u0004\u0012\u00020[0\u0012H\u0080@\u00a2\u0006\u0004\u0008^\u0010\u0016J\u0017\u0010b\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020$H\u0000\u00a2\u0006\u0004\u0008`\u0010aR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010c\u001a\u0004\u0008d\u0010eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010gR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010hR\u001b\u0010n\u001a\u00020i8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008j\u0010k\u001a\u0004\u0008l\u0010m\u00a8\u0006o"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "Lio/getstream/chat/android/client/ChatClient;",
        "client",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;",
        "queryChannelsStateLogic",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;",
        "queryChannelsDatabaseLogic",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;)V",
        "",
        "isLoading",
        "hasOffset",
        "Ll83/a0;",
        "loadingPerPage",
        "(ZZ)V",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channels",
        "addChannels",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Ln23/h;",
        "result",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "onOnlineQueryResult",
        "(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;",
        "updateOnlineChannels",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "",
        "initialOffset",
        "step",
        "thresholdCount",
        "Ljava/util/HashSet;",
        "",
        "Lkotlin/collections/HashSet;",
        "getRemoteCids",
        "(IIILq83/d;)Ljava/lang/Object;",
        "offset",
        "limit",
        "fetchPage",
        "(IILq83/d;)Ljava/lang/Object;",
        "cidList",
        "removeChannels",
        "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
        "pagination",
        "queryOffline$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;",
        "queryOffline",
        "setCurrentRequest$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V",
        "setCurrentRequest",
        "Lec3/f2;",
        "recoveryNeeded$stream_chat_android_client_release",
        "()Lec3/f2;",
        "recoveryNeeded",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "applyResolvedSpec$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "applyResolvedSpec",
        "channel",
        "addChannel$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;",
        "addChannel",
        "cid",
        "watchAndAddChannel$stream_chat_android_client_release",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "watchAndAddChannel",
        "onQueryChannelsResult",
        "queryFirstPage$stream_chat_android_client_release",
        "(Lq83/d;)Ljava/lang/Object;",
        "queryFirstPage",
        "removeChannel$stream_chat_android_client_release",
        "removeChannel",
        "",
        "refreshChannelsState$stream_chat_android_client_release",
        "(Ljava/util/Collection;)V",
        "refreshChannelsState",
        "Lio/getstream/chat/android/models/User;",
        "newUser",
        "refreshMembersStateForUser$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/User;)V",
        "refreshMembersStateForUser",
        "refreshAllChannelsState$stream_chat_android_client_release",
        "()V",
        "refreshAllChannelsState",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "chatEvents",
        "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "parseChatEventResults$stream_chat_android_client_release",
        "parseChatEventResults",
        "refreshChannelState$stream_chat_android_client_release",
        "(Ljava/lang/String;)V",
        "refreshChannelState",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "getIdentifier$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final client:Lio/getstream/chat/android/client/ChatClient;

.field private final identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

.field private final logger$delegate:Ll83/h;

.field private final queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

.field private final queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;)V
    .locals 1

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "client"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryChannelsStateLogic"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryChannelsDatabaseLogic"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->client:Lio/getstream/chat/android/client/ChatClient;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    const-string p1, "Chat:QueryChannelsLogic"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$addChannels(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchPage(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;IILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->fetchPage(IILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getRemoteCids(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;IIILq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getRemoteCids(IIILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onOnlineQueryResult(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->onOnlineQueryResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$removeChannels(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->removeChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateOnlineChannels(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->updateOnlineChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final addChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->addChannelsState$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getQuerySpecs$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p1

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->L$1:Ljava/lang/Object;

    const/4 v2, 0x0

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$addChannels$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->insertQueryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final fetchPage(IILq83/d;)Ljava/lang/Object;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->label:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    instance-of v4, v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    new-instance v7, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v8

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v11

    new-instance v12, Ljava/lang/Integer;

    invoke-direct {v12, v6}, Ljava/lang/Integer;-><init>(I)V

    new-instance v13, Ljava/lang/Integer;

    invoke-direct {v13, v6}, Ljava/lang/Integer;-><init>(I)V

    const/16 v17, 0x1c0

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v9, p1

    move/from16 v10, p2

    invoke-direct/range {v7 .. v18}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_3
    instance-of v4, v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-eqz v4, :cond_7

    new-instance v8, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getName()Ljava/lang/String;

    move-result-object v9

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getFilterValues()Ljava/util/Map;

    move-result-object v11

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getSortValues()Ljava/util/Map;

    move-result-object v12

    new-instance v14, Ljava/lang/Integer;

    invoke-direct {v14, v6}, Ljava/lang/Integer;-><init>(I)V

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v6}, Ljava/lang/Integer;-><init>(I)V

    move/from16 v13, p1

    move/from16 v10, p2

    invoke-direct/range {v8 .. v15}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V

    move-object v7, v8

    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v7}, Lio/getstream/chat/android/client/ChatClient;->queryChannelsInternal(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v1

    const/4 v4, 0x0

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->L$0:Ljava/lang/Object;

    move/from16 v13, p1

    iput v13, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->I$0:I

    move/from16 v10, p2

    iput v10, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->I$1:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$fetchPage$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    return-object v3

    :cond_4
    :goto_2
    check-cast v1, Ln23/h;

    instance-of v2, v1, Ln23/g;

    if-eqz v2, :cond_5

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object v1

    return-object v1

    :cond_5
    instance-of v1, v1, Ln23/f;

    if-eqz v1, :cond_6

    sget-object v1, Lm83/y;->w:Lm83/y;

    return-object v1

    :cond_6
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_7
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final getRemoteCids(IIILq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Lq83/d<",
            "-",
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p4

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->label:I

    const/4 v6, 0x0

    const-string v7, ", thresholdCount: "

    const/4 v8, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v8, :cond_1

    iget v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$2:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$1:I

    iget v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$0:I

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->L$1:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/e0;

    iget-object v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->L$0:Ljava/lang/Object;

    check-cast v11, Ljava/util/HashSet;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v12, v5

    move v5, v1

    move v1, v9

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v2

    iget-object v5, v2, Lb23/k;->c:Lb23/e;

    iget-object v9, v2, Lb23/k;->a:Ljava/lang/String;

    sget-object v10, Lb23/g;->y:Lb23/g;

    invoke-interface {v5, v10, v9}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_3

    iget-object v2, v2, Lb23/k;->b:Lb23/j;

    const-string v5, "[getRemoteCids] initialOffset: "

    const-string v11, ", step: "

    move/from16 v12, p2

    invoke-static {v1, v12, v5, v11, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    move/from16 v11, p3

    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v2, v10, v9, v5, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    :cond_3
    move/from16 v12, p2

    move/from16 v11, p3

    :goto_1
    new-instance v2, Ljava/util/HashSet;

    invoke-direct {v2}, Ljava/util/HashSet;-><init>()V

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iput v1, v5, Lkotlin/jvm/internal/e0;->w:I

    move-object v10, v5

    :goto_2
    iget v5, v10, Lkotlin/jvm/internal/e0;->w:I

    if-ge v5, v11, :cond_9

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v5

    iget-object v9, v5, Lb23/k;->c:Lb23/e;

    iget-object v13, v5, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v9, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_4

    iget-object v5, v5, Lb23/k;->b:Lb23/j;

    iget v9, v10, Lkotlin/jvm/internal/e0;->w:I

    const-string v15, "[getRemoteCids] offset: "

    const-string v8, ", limit: "

    invoke-static {v9, v12, v15, v8, v7}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v5, v14, v13, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget v5, v10, Lkotlin/jvm/internal/e0;->w:I

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->L$0:Ljava/lang/Object;

    iput-object v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->L$1:Ljava/lang/Object;

    iput v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$0:I

    iput v12, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$1:I

    iput v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->I$2:I

    const/4 v8, 0x1

    iput v8, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$getRemoteCids$1;->label:I

    invoke-direct {v0, v5, v12, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->fetchPage(IILq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    return-object v4

    :cond_5
    move/from16 v16, v11

    move-object v11, v2

    move-object v2, v5

    move/from16 v5, v16

    :goto_3
    check-cast v2, Ljava/util/List;

    move-object v9, v2

    check-cast v9, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    const/16 v14, 0xa

    invoke-static {v9, v14}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v14}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_6
    invoke-virtual {v11, v13}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v9

    iget-object v13, v9, Lb23/k;->c:Lb23/e;

    iget-object v14, v9, Lb23/k;->a:Ljava/lang/String;

    sget-object v15, Lb23/g;->x:Lb23/g;

    invoke-interface {v13, v15, v14}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v13

    if-eqz v13, :cond_7

    iget-object v9, v9, Lb23/k;->b:Lb23/j;

    invoke-virtual {v11}, Ljava/util/HashSet;->size()I

    move-result v13

    const-string v8, "[getRemoteCids] remoteCids.size: "

    invoke-static {v13, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-interface {v9, v15, v14, v8, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget v8, v10, Lkotlin/jvm/internal/e0;->w:I

    add-int/2addr v8, v12

    iput v8, v10, Lkotlin/jvm/internal/e0;->w:I

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v2, v12, :cond_8

    return-object v11

    :cond_8
    move-object v2, v11

    const/4 v8, 0x1

    move v11, v5

    goto/16 :goto_2

    :cond_9
    return-object v2
.end method

.method private final loadingPerPage(ZZ)V
    .locals 0

    if-eqz p2, :cond_0

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setLoadingMore$stream_chat_android_client_release(Z)V

    return-void

    :cond_0
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setLoadingFirstPage$stream_chat_android_client_release(Z)V

    return-void
.end method

.method private final onOnlineQueryResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Set;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$1:Ljava/lang/Object;

    check-cast p2, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    instance-of v2, p1, Ln23/f;

    invoke-virtual {p3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setRecoveryNeeded$stream_chat_android_client_release(Z)V

    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_8

    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getLimit()I

    move-result p2

    if-ge v2, p2, :cond_4

    move p2, v5

    goto :goto_1

    :cond_4
    const/4 p2, 0x0

    :goto_1
    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setEndOfChannels$stream_chat_android_client_release(Z)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance p3, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    new-instance v7, Lio/getstream/chat/android/models/ChannelConfig;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getType()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getConfig()Lio/getstream/chat/android/models/Config;

    move-result-object v2

    invoke-direct {v7, v8, v2}, Lio/getstream/chat/android/models/ChannelConfig;-><init>(Ljava/lang/String;Lio/getstream/chat/android/models/Config;)V

    invoke-virtual {p3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$1:Ljava/lang/Object;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->label:I

    invoke-virtual {p2, p3, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->insertChannelConfigs$stream_chat_android_client_release(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p2

    iget-object p3, p2, Lb23/k;->c:Lb23/e;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {p3, v5, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_7

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result p3

    const-string v7, "[onOnlineQueryResult] api call returned "

    const-string v8, " channels"

    invoke-static {p3, v7, v8}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {p2, v5, v2, p3, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    check-cast p1, Ljava/util/Collection;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->L$3:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onOnlineQueryResult$1;->label:I

    invoke-virtual {p2, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->storeStateForChannels$stream_chat_android_client_release(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_9

    :goto_4
    return-object v1

    :cond_8
    if-eqz v2, :cond_a

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p3, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->z:Lb23/g;

    invoke-interface {p3, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_9

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v2, "[onOnlineQueryResult] query with filter "

    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " failed; recovery needed"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-interface {p1, v1, v0, p2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    return-object v3

    :cond_a
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final removeChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getQuerySpecs$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {p2, v2, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_1

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[removeChannels] skipping remove channels as they are not loaded yet."

    const/4 v3, 0x0

    invoke-interface {p1, v2, v0, p2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->removeChannels$stream_chat_android_client_release(Ljava/util/Set;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getQuerySpecs$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->insertQueryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method

.method private final updateOnlineChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v5, :cond_4

    if-eq v5, v8, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$1:I

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$8:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$7:Ljava/lang/Object;

    check-cast v5, Ljava/util/HashSet;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$6:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$5:Ljava/lang/Object;

    check-cast v7, Ljava/util/Map;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$4:Ljava/lang/Object;

    check-cast v7, Lkotlin/jvm/internal/e0;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$3:Ljava/lang/Object;

    check-cast v8, Ljava/util/Map;

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$2:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v10

    goto/16 :goto_5

    :cond_3
    iget v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$1:I

    iget v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$0:I

    iget-object v8, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$5:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    iget-object v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$4:Ljava/lang/Object;

    check-cast v10, Lkotlin/jvm/internal/e0;

    iget-object v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$3:Ljava/lang/Object;

    check-cast v11, Ljava/util/Map;

    iget-object v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$2:Ljava/lang/Object;

    check-cast v11, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    iget-object v12, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    iget-object v13, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    check-cast v13, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v10

    goto/16 :goto_4

    :cond_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getChannelsOffset$stream_chat_android_client_release()I

    move-result v10

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v11

    iget-object v12, v11, Lb23/k;->c:Lb23/e;

    iget-object v13, v11, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->y:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_6

    iget-object v11, v11, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->isFirstPage()Z

    move-result v12

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v15

    if-eqz v5, :cond_5

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v6

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v6}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_1

    :cond_5
    const-string v7, "null"

    :goto_1
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v8, "[updateOnlineChannels] isFirstPage: "

    invoke-direct {v6, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v12}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v8, ", channels.size: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v8, ", existingChannels.size: "

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v7, ", currentChannelsOffset: "

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v11, v14, v13, v6, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->isFirstPage()Z

    move-result v6

    if-eqz v6, :cond_10

    if-eqz v5, :cond_10

    invoke-interface {v5}, Ljava/util/Map;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_7

    :cond_7
    new-instance v6, Lkotlin/jvm/internal/e0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v7

    iput v7, v6, Lkotlin/jvm/internal/e0;->w:I

    move-object v7, v1

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v8, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    invoke-static {v8}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-static {v5, v7}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v7

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v12, v8, Lb23/k;->c:Lb23/e;

    iget-object v13, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v12, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_9

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-interface {v7}, Ljava/util/Map;->size()I

    move-result v12

    const-string v15, "[updateOnlineChannels] notUpdatedChannels.size: "

    invoke-static {v12, v15}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-interface {v8, v14, v13, v12, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    invoke-interface {v7}, Ljava/util/Map;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_e

    invoke-interface {v7}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v8, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v11}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_a
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getLimit()I

    move-result v7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getLimit()I

    move-result v11

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v5

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$3:Ljava/lang/Object;

    iput-object v6, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$5:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$6:Ljava/lang/Object;

    const/4 v12, 0x0

    iput v12, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$0:I

    iput v10, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$1:I

    const/4 v13, 0x1

    iput v13, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    invoke-direct {v0, v7, v11, v5, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getRemoteCids(IIILq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_b

    goto/16 :goto_9

    :cond_b
    move-object v11, v2

    move-object v2, v5

    move-object v7, v6

    move v5, v12

    move-object v12, v1

    move v1, v10

    :goto_4
    check-cast v2, Ljava/util/HashSet;

    check-cast v8, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {v8, v6}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v6

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v8

    iget-object v10, v8, Lb23/k;->c:Lb23/e;

    iget-object v13, v8, Lb23/k;->a:Ljava/lang/String;

    sget-object v14, Lb23/g;->x:Lb23/g;

    invoke-interface {v10, v14, v13}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_c

    iget-object v8, v8, Lb23/k;->b:Lb23/j;

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v10

    const-string v15, "[updateOnlineChannels] cidsToRemove.size: "

    invoke-static {v10, v15}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v8, v14, v13, v10, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_c
    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    iput-object v12, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$3:Ljava/lang/Object;

    iput-object v7, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$5:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$6:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$7:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$8:Ljava/lang/Object;

    iput v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$0:I

    iput v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->I$1:I

    const/4 v5, 0x2

    iput v5, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    invoke-direct {v0, v6, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->removeChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_d

    goto :goto_9

    :cond_d
    move-object v5, v2

    move-object v8, v11

    :goto_5
    iget v2, v7, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v5}, Ljava/util/HashSet;->size()I

    move-result v5

    add-int/2addr v5, v2

    iput v5, v7, Lkotlin/jvm/internal/e0;->w:I

    move v10, v1

    move-object v6, v7

    move-object v2, v8

    goto :goto_6

    :cond_e
    move-object v12, v1

    :goto_6
    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v5, v1, Lb23/k;->c:Lb23/e;

    iget-object v7, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v8, Lb23/g;->x:Lb23/g;

    invoke-interface {v5, v8, v7}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_f

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    iget v5, v6, Lkotlin/jvm/internal/e0;->w:I

    const-string v11, "[updateOnlineChannels] newChannelsOffset: "

    const-string v13, " <= "

    invoke-static {v5, v10, v11, v13}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v1, v8, v7, v5, v9}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_f
    iget v1, v6, Lkotlin/jvm/internal/e0;->w:I

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setChannelsOffset$stream_chat_android_client_release(I)V

    goto :goto_8

    :cond_10
    :goto_7
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v5

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->incrementChannelsOffset$stream_chat_android_client_release(I)V

    move-object v12, v1

    :goto_8
    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$0:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$1:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$2:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$3:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$4:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$5:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$6:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$7:Ljava/lang/Object;

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->L$8:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$updateOnlineChannels$1;->label:I

    invoke-direct {v0, v12, v3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_11

    :goto_9
    return-object v4

    :cond_11
    :goto_a
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final addChannel$stream_chat_android_client_release(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final applyResolvedSpec$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->applyResolvedSpec$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-void
.end method

.method public final getIdentifier$stream_chat_android_client_release()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    return-object v0
.end method

.method public final onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    check-cast p2, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v2, p3, Lb23/k;->c:Lb23/e;

    iget-object v6, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    instance-of v2, p1, Ln23/g;

    new-instance v8, Ljava/lang/StringBuilder;

    const-string v9, "[onQueryChannelsResult] result.isSuccess: "

    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, ", request: "

    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->label:I

    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->onOnlineQueryResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    instance-of p3, p1, Ln23/g;

    if-eqz p3, :cond_8

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v2, p3, Lb23/k;->c:Lb23/e;

    iget-object v6, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v7, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v7, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_6

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    move-object v2, p1

    check-cast v2, Ln23/g;

    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    const-string v8, "Number of returned channels: "

    invoke-static {v2, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {p3, v7, v6, v2, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    check-cast p1, Ln23/g;

    iget-object p1, p1, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$onQueryChannelsResult$1;->label:I

    invoke-direct {p0, p2, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->updateOnlineChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_2
    return-object v1

    :cond_7
    move-object p1, p2

    :goto_3
    move-object p2, p1

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->initializeChannelsIfNeeded$stream_chat_android_client_release()V

    :goto_4
    invoke-virtual {p2}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getOffset()I

    move-result p1

    const/4 p2, 0x0

    if-lez p1, :cond_9

    goto :goto_5

    :cond_9
    move v5, p2

    :goto_5
    invoke-direct {p0, p2, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->loadingPerPage(ZZ)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final parseChatEventResults$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->label:I

    const/4 v3, 0x1

    const/16 v4, 0xa

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$2:Ljava/lang/Object;

    check-cast p1, Ljava/util/Map;

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$0:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, p1

    move-object p1, v0

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p2, p1

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_3
    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    instance-of v7, v6, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v7, :cond_3

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    new-instance p2, Ljava/util/ArrayList;

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {p2, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-virtual {v6}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {p2}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_6
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v8, v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getActiveChannelState$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;

    move-result-object v8

    if-eqz v8, :cond_7

    new-instance v9, Ll83/k;

    invoke-direct {v9, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    move-object v9, v5

    :goto_4
    if-eqz v9, :cond_6

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-static {v2}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-static {p2, v6}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v6

    if-eqz v6, :cond_9

    sget-object p2, Lm83/z;->w:Lm83/z;

    goto :goto_7

    :cond_9
    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$1:Ljava/lang/Object;

    iput-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$2:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->L$3:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$parseChatEventResults$1;->label:I

    invoke-virtual {v6, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->selectChannels$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    return-object v1

    :cond_a
    :goto_5
    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    const/16 v1, 0x10

    if-ge v0, v1, :cond_b

    move v0, v1

    :cond_b
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_6

    :cond_c
    move-object p2, v1

    :goto_7
    invoke-static {v2, p2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p1, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_8
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_f

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v2, v1, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v2, :cond_d

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/events/CidEvent;

    goto :goto_9

    :cond_d
    move-object v2, v5

    :goto_9
    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lio/getstream/chat/android/client/events/CidEvent;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    goto :goto_a

    :cond_e
    move-object v2, v5

    :goto_a
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v3, v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->handleChatEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_f
    return-object v0
.end method

.method public final queryFirstPage$stream_chat_android_client_release(Lq83/d;)Ljava/lang/Object;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$5:Ljava/lang/Object;

    check-cast v3, Ln23/h;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ln23/h;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Integer;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$3:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$1:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v4, v1, Lb23/k;->c:Lb23/e;

    iget-object v8, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v9, Lb23/g;->y:Lb23/g;

    invoke-interface {v4, v9, v8}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v4, "[queryFirstPage] no args"

    invoke-interface {v1, v9, v8, v4, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getCurrentRequest()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getMessageLimit()Ljava/lang/Integer;

    move-result-object v4

    move-object v14, v4

    goto :goto_1

    :cond_5
    move-object v14, v7

    :goto_1
    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;->getMemberLimit()Ljava/lang/Integer;

    move-result-object v1

    move-object v15, v1

    goto :goto_2

    :cond_6
    move-object v15, v7

    :goto_2
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    instance-of v4, v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    if-eqz v4, :cond_7

    new-instance v8, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v9

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v12

    const/16 v18, 0x1c0

    const/16 v19, 0x0

    const/4 v10, 0x0

    const/16 v11, 0x1e

    move-object v13, v14

    move-object v14, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v8 .. v19}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Lio/getstream/chat/android/models/FilterObject;IILio/getstream/chat/android/models/querysort/QuerySorter;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_3
    move-object v4, v8

    goto :goto_4

    :cond_7
    move-object v13, v14

    move-object v14, v15

    instance-of v4, v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-eqz v4, :cond_d

    new-instance v8, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getName()Ljava/lang/String;

    move-result-object v9

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getFilterValues()Ljava/util/Map;

    move-result-object v11

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getSortValues()Ljava/util/Map;

    move-result-object v12

    move-object v15, v14

    move-object v14, v13

    const/4 v13, 0x0

    const/16 v10, 0x1e

    invoke-direct/range {v8 .. v15}, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;-><init>(Ljava/lang/String;ILjava/util/Map;Ljava/util/Map;ILjava/lang/Integer;Ljava/lang/Integer;)V

    goto :goto_3

    :goto_4
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setCurrentRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v4}, Lio/getstream/chat/android/client/ChatClient;->queryChannelsInternal(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object v1

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$2:Ljava/lang/Object;

    iput-object v4, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$3:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->label:I

    invoke-interface {v1, v2}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_7

    :cond_8
    :goto_5
    check-cast v1, Ln23/h;

    instance-of v6, v1, Ln23/g;

    if-eqz v6, :cond_9

    move-object v8, v1

    check-cast v8, Ln23/g;

    iget-object v8, v8, Ln23/g;->a:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v8}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getPredefinedFilter()Lio/getstream/chat/android/client/api/models/PredefinedFilter;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lio/getstream/chat/android/client/api/models/PredefinedFilter;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v9

    invoke-virtual {v8}, Lio/getstream/chat/android/client/api/models/PredefinedFilter;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v8

    invoke-virtual {v0, v9, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->applyResolvedSpec$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    :cond_9
    if-eqz v6, :cond_a

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/models/QueryChannelsResult;->getChannels()Ljava/util/List;

    move-result-object v1

    new-instance v6, Ln23/g;

    invoke-direct {v6, v1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    move-object v1, v6

    goto :goto_6

    :cond_a
    instance-of v6, v1, Ln23/f;

    if-eqz v6, :cond_c

    :goto_6
    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$2:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$3:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$4:Ljava/lang/Object;

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->L$5:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryFirstPage$1;->label:I

    invoke-virtual {v0, v1, v4, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->onQueryChannelsResult(Ln23/h;Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_b

    :goto_7
    return-object v3

    :cond_b
    return-object v1

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method

.method public final queryOffline$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->I$0:I

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->I$0:I

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->isLoading$stream_chat_android_client_release()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object p2, p1, Lb23/k;->c:Lb23/e;

    iget-object v0, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v1, Lb23/g;->z:Lb23/g;

    invoke-interface {p2, v1, v0}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_a

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string p2, "[queryOffline] another query channels request is in progress. Ignoring this request."

    invoke-interface {p1, v1, v0, p2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v3

    :cond_4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;->getChannelOffset()I

    move-result p2

    if-lez p2, :cond_5

    move p2, v7

    goto :goto_1

    :cond_5
    move p2, v6

    :goto_1
    invoke-direct {p0, v7, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->loadingPerPage(ZZ)V

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsDatabaseLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;

    iget-object v8, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->I$0:I

    iput v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->label:I

    invoke-virtual {v2, p1, v8, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsDatabaseLogic;->fetchChannelsFromCache$stream_chat_android_client_release(Lio/getstream/chat/android/client/query/pagination/AnyChannelPaginationRequest;Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    move v9, p2

    move-object p2, p1

    move p1, v9

    :goto_2
    check-cast p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;

    if-eqz p2, :cond_a

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;->getSpec()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getPredefinedFilterName()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;->getSpec()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;->getSpec()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v8

    invoke-virtual {v8}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getQuerySort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v8

    invoke-virtual {p0, v2, v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->applyResolvedSpec$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    :cond_7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/CachedQueryChannels;->getChannels()Ljava/util/List;

    move-result-object p2

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$0:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->L$1:Ljava/lang/Object;

    iput p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->I$0:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$queryOffline$1;->label:I

    invoke-direct {p0, p2, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_3
    return-object v1

    :cond_8
    :goto_4
    if-eqz p1, :cond_9

    goto :goto_5

    :cond_9
    move v7, v6

    :goto_5
    invoke-direct {p0, v6, v7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->loadingPerPage(ZZ)V

    :cond_a
    return-object v3
.end method

.method public final recoveryNeeded$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRecoveryNeeded()Lec3/f2;

    move-result-object v0

    return-object v0
.end method

.method public final refreshAllChannelsState$stream_chat_android_client_release()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getQuerySpecs$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshChannelsState$stream_chat_android_client_release(Ljava/util/Collection;)V

    return-void
.end method

.method public final refreshChannelState$stream_chat_android_client_release(Ljava/lang/String;)V
    .locals 1

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->refreshChannelsState$stream_chat_android_client_release(Ljava/util/Collection;)V

    return-void
.end method

.method public final refreshChannelsState$stream_chat_android_client_release(Ljava/util/Collection;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cidList"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->refreshChannels$stream_chat_android_client_release(Ljava/util/Collection;)V

    return-void
.end method

.method public final refreshMembersStateForUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;)V
    .locals 1

    const-string v0, "newUser"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->refreshMembersStateForUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;)V

    return-void
.end method

.method public final removeChannel$stream_chat_android_client_release(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->removeChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setCurrentRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V
    .locals 1

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->queryChannelsStateLogic:Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->setCurrentRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V

    return-void
.end method

.method public final watchAndAddChannel$stream_chat_android_client_release(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$1:Ljava/lang/Object;

    check-cast p1, Ln23/h;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->client:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/ChatClient;->channel(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/channel/ChannelClient;->watch()Lo23/d;

    move-result-object p1

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$0:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->label:I

    invoke-interface {p1, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ln23/h;

    instance-of p1, p2, Ln23/g;

    if-eqz p1, :cond_5

    check-cast p2, Ln23/g;

    iget-object p1, p2, Ln23/g;->a:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/models/Channel;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic$watchAndAddChannel$1;->label:I

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsLogic;->addChannel$stream_chat_android_client_release(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    return-object v3
.end method
