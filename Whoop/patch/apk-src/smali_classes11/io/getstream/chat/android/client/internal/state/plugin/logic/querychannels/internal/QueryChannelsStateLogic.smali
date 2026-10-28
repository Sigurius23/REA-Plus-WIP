.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ac\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0010\"\n\u0002\u0008\u0007\n\u0002\u0010\u001e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\u000c*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\u00020\u000c*\u00020\u000c2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000cH\u0000\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u001b\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010$\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000c\u0018\u00010 H\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u000f\u0010(\u001a\u00020%H\u0000\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010,\u001a\u00020)H\u0000\u00a2\u0006\u0004\u0008*\u0010+J\u0017\u00100\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u0017\u00102\u001a\u00020-2\u0006\u0010\u001b\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u00081\u0010/J\u0017\u00107\u001a\u00020-2\u0006\u00104\u001a\u000203H\u0000\u00a2\u0006\u0004\u00085\u00106J%\u0010>\u001a\u00020-2\u0006\u00109\u001a\u0002082\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u000c0:H\u0000\u00a2\u0006\u0004\u0008<\u0010=J\u0017\u0010A\u001a\u00020-2\u0006\u0010?\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008@\u0010/J\u0017\u0010D\u001a\u00020-2\u0006\u0010B\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008C\u0010/J\u0017\u0010H\u001a\u00020-2\u0006\u0010E\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008F\u0010GJ\u0017\u0010K\u001a\u00020-2\u0006\u0010I\u001a\u00020\u001cH\u0000\u00a2\u0006\u0004\u0008J\u0010GJ\u001e\u0010P\u001a\u00020-2\u000c\u0010M\u001a\u0008\u0012\u0004\u0012\u00020\u000c0LH\u0080@\u00a2\u0006\u0004\u0008N\u0010OJ\u001d\u0010U\u001a\u00020-2\u000c\u0010R\u001a\u0008\u0012\u0004\u0012\u00020!0QH\u0000\u00a2\u0006\u0004\u0008S\u0010TJ\u000f\u0010X\u001a\u00020-H\u0000\u00a2\u0006\u0004\u0008V\u0010WJ\u001d\u0010]\u001a\u00020-2\u000c\u0010Z\u001a\u0008\u0012\u0004\u0012\u00020!0YH\u0000\u00a2\u0006\u0004\u0008[\u0010\\J\u0019\u0010a\u001a\u0004\u0018\u00010\u000c2\u0006\u0010^\u001a\u00020!H\u0000\u00a2\u0006\u0004\u0008_\u0010`J\u0017\u0010f\u001a\u00020-2\u0006\u0010c\u001a\u00020bH\u0000\u00a2\u0006\u0004\u0008d\u0010eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010gR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010hR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010iR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010jR\u001b\u0010p\u001a\u00020k8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008l\u0010m\u001a\u0004\u0008n\u0010o\u00a8\u0006q"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;",
        "",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;",
        "mutableState",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "stateRegistry",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "logicRegistry",
        "Lbc3/c0;",
        "coroutineScope",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lbc3/c0;)V",
        "Lio/getstream/chat/android/models/Channel;",
        "existingChannel",
        "joinMessages",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;",
        "joinMembers",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "cachedChannel",
        "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "handleChatEvent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "handleChatEvent",
        "",
        "isLoading$stream_chat_android_client_release",
        "()Z",
        "isLoading",
        "",
        "getChannelsOffset$stream_chat_android_client_release",
        "()I",
        "getChannelsOffset",
        "",
        "",
        "getChannels$stream_chat_android_client_release",
        "()Ljava/util/Map;",
        "getChannels",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "getQuerySpecs$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "getQuerySpecs",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "getState$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "getState",
        "Ll83/a0;",
        "setLoadingMore$stream_chat_android_client_release",
        "(Z)V",
        "setLoadingMore",
        "setLoadingFirstPage$stream_chat_android_client_release",
        "setLoadingFirstPage",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "setCurrentRequest$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V",
        "setCurrentRequest",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "applyResolvedSpec$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "applyResolvedSpec",
        "isEnd",
        "setEndOfChannels$stream_chat_android_client_release",
        "setEndOfChannels",
        "recoveryNeeded",
        "setRecoveryNeeded$stream_chat_android_client_release",
        "setRecoveryNeeded",
        "offset",
        "setChannelsOffset$stream_chat_android_client_release",
        "(I)V",
        "setChannelsOffset",
        "size",
        "incrementChannelsOffset$stream_chat_android_client_release",
        "incrementChannelsOffset",
        "",
        "channels",
        "addChannelsState$stream_chat_android_client_release",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "addChannelsState",
        "",
        "cidSet",
        "removeChannels$stream_chat_android_client_release",
        "(Ljava/util/Set;)V",
        "removeChannels",
        "initializeChannelsIfNeeded$stream_chat_android_client_release",
        "()V",
        "initializeChannelsIfNeeded",
        "",
        "cidList",
        "refreshChannels$stream_chat_android_client_release",
        "(Ljava/util/Collection;)V",
        "refreshChannels",
        "cid",
        "getActiveChannelState$stream_chat_android_client_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;",
        "getActiveChannelState",
        "Lio/getstream/chat/android/models/User;",
        "newUser",
        "refreshMembersStateForUser$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/User;)V",
        "refreshMembersStateForUser",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;",
        "Lbc3/c0;",
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
.field private final coroutineScope:Lbc3/c0;

.field private final logger$delegate:Ll83/h;

.field private final logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

.field private final mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

.field private final stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;Lio/getstream/chat/android/client/api/state/StateRegistry;Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;Lbc3/c0;)V
    .locals 1

    const-string v0, "mutableState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stateRegistry"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logicRegistry"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->coroutineScope:Lbc3/c0;

    const-string p1, "QueryChannelsStateLogic"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getLogicRegistry$p(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;)Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->logicRegistry:Lio/getstream/chat/android/client/internal/state/plugin/logic/internal/LogicRegistry;

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final joinMembers(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;
    .locals 40

    if-eqz p2, :cond_7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v4, Ljava/util/LinkedHashMap;

    invoke-direct {v4, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v4, v5, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    if-ge v1, v3, :cond_2

    goto :goto_1

    :cond_2
    move v3, v1

    :goto_1
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1, v3}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v4, v1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v2

    if-le v1, v2, :cond_4

    const/4 v0, 0x0

    :cond_4
    if-eqz v0, :cond_5

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_5

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    :goto_3
    move-object v14, v0

    goto :goto_4

    :cond_5
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v0

    goto :goto_3

    :goto_4
    const/16 v38, 0x7

    const/16 v39, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, -0x1001

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v39}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-nez v0, :cond_6

    goto :goto_5

    :cond_6
    return-object v0

    :cond_7
    :goto_5
    return-object p1
.end method

.method private final joinMessages(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;
    .locals 41

    if-eqz p2, :cond_0

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    check-cast v0, Ljava/util/Collection;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    const/16 v39, 0x7

    const/16 v40, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, -0x801

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v40}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final addChannelsState$stream_chat_android_client_release(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->I$0:I

    iget-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$8:Ljava/lang/Object;

    check-cast v7, Ljava/util/Collection;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$7:Ljava/lang/Object;

    check-cast v8, Lbc3/i0;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$5:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$4:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/Map;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getQueryChannelsSpec$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v2

    check-cast p1, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {p1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v2, v7}, Ldt/b;->E(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object v2

    invoke-virtual {p2, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setCids(Ljava/util/Set;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object p2

    if-nez p2, :cond_4

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_4
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {p1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v7, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_2
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v12

    invoke-interface {p2, v12}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0, v10, v12}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->joinMessages(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v12

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lio/getstream/chat/android/models/Channel;

    invoke-direct {p0, v12, v10}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->joinMembers(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v10

    new-instance v12, Ll83/k;

    invoke-direct {v12, v11, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-static {v7}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p2

    goto :goto_3

    :cond_6
    new-instance v9, Ljava/util/LinkedHashMap;

    invoke-direct {v9, p2}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    invoke-static {v9, v7}, Lm83/g0;->g0(Ljava/util/LinkedHashMap;Ljava/lang/Iterable;)V

    move-object p2, v9

    :goto_3
    invoke-virtual {v2, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannels(Ljava/util/Map;)V

    new-instance p2, Ljava/util/ArrayList;

    invoke-static {p1, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p2, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    iget-object v7, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->coroutineScope:Lbc3/c0;

    new-instance v9, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;

    invoke-direct {v9, p0, v2, v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$4$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;Lio/getstream/chat/android/models/Channel;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v7, v6, v9, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p2, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {p1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v7, p1

    move-object v8, p2

    move p1, v5

    move v2, p1

    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lbc3/i0;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$0:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$1:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$2:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$4:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$5:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$6:Ljava/lang/Object;

    iput-object v6, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$7:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->L$8:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->I$1:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->I$2:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic$addChannelsState$1;->label:I

    invoke-interface {p2, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    return-object v1

    :cond_8
    move-object v9, v7

    :goto_6
    invoke-interface {v7, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v7, v9

    goto :goto_5

    :cond_9
    check-cast v7, Ljava/util/List;

    return-object v3
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->applyResolvedSpec(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    return-void
.end method

.method public final getActiveChannelState$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/models/Channel;
    .locals 2

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->isActiveChannel$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v1, v0, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    return-object p1
.end method

.method public final getChannels$stream_chat_android_client_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final getChannelsOffset$stream_chat_android_client_release()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getChannelsOffset$stream_chat_android_client_release()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method

.method public final getQuerySpecs$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getQueryChannelsSpec$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v0

    return-object v0
.end method

.method public final getState$stream_chat_android_client_release()Lio/getstream/chat/android/client/api/state/QueryChannelsState;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    return-object v0
.end method

.method public final handleChatEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->handleChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method

.method public final incrementChannelsOffset$stream_chat_android_client_release(I)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getChannelsOffset$stream_chat_android_client_release()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    add-int/2addr p1, v0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[updateOnlineChannels] newChannelsOffset: "

    const-string v5, " <= "

    invoke-static {p1, v0, v2, v5}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-interface {v1, v3, v4, v0, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannelsOffset(I)V

    return-void
.end method

.method public final initializeChannelsIfNeeded$stream_chat_android_client_release()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannels(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public final isLoading$stream_chat_android_client_release()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getCurrentLoading$stream_chat_android_client_release()Lec3/f2;

    move-result-object v0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final refreshChannels$stream_chat_android_client_release(Ljava/util/Collection;)V
    .locals 7
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[refreshChannels] rejected (existingChannels is null)"

    const/4 v3, 0x0

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getQueryChannelsSpec$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v1, p1}, Lm83/s;->K0(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/LinkedHashSet;

    move-result-object p1

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Ll83/k;

    iget-object v5, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v6, v5, v4}, Lio/getstream/chat/android/client/api/state/StateRegistry;->isActiveChannel$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_5

    move v1, v2

    :cond_5
    new-instance v2, Ljava/util/LinkedHashMap;

    invoke-direct {v2, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v3, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    new-instance v4, Ll83/k;

    invoke-direct {v4, v3, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v4}, Lio/getstream/chat/android/client/extensions/internal/PairKt;->toCid(Ll83/k;)Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->stateRegistry:Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v5, v3, v1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/client/channel/state/ChannelState;->toChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_6
    invoke-static {v0, v2}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannels(Ljava/util/Map;)V

    return-void
.end method

.method public final refreshMembersStateForUser$stream_chat_android_client_release(Lio/getstream/chat/android/models/User;)V
    .locals 48

    move-object/from16 v0, p0

    const-string v1, "newUser"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v3

    const/4 v4, 0x0

    if-nez v3, :cond_1

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    iget-object v3, v1, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->E:Lb23/g;

    invoke-interface {v2, v5, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    const-string v2, "[refreshMembersStateForUser] rejected (existingChannels is null)"

    invoke-interface {v1, v5, v3, v2, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-direct {v5}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_2
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Channel;

    invoke-static {v8}, Lio/getstream/chat/android/client/extensions/internal/ChannelKt;->users(Lio/getstream/chat/android/models/Channel;)Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/ArrayList;

    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/User;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    invoke-interface {v5, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_5
    new-instance v6, Ljava/util/LinkedHashMap;

    invoke-interface {v5}, Ljava/util/Map;->size()I

    move-result v7

    invoke-static {v7}, Lm83/g0;->W(I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v5}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/Map$Entry;

    invoke-interface {v7}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v7}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v10, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v12}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v11

    invoke-virtual {v11}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_6

    goto :goto_3

    :cond_6
    move-object v11, v4

    :goto_3
    if-nez v11, :cond_7

    move-object v13, v2

    goto :goto_4

    :cond_7
    move-object v13, v11

    :goto_4
    const/16 v28, 0x7ffe

    const/16 v29, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v12 .. v29}, Lio/getstream/chat/android/models/Member;->copy$default(Lio/getstream/chat/android/models/Member;Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/models/Member;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    const/16 v46, 0x7

    const/16 v47, 0x0

    move-object/from16 v22, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, -0x1001

    invoke-static/range {v9 .. v47}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v7

    invoke-interface {v6, v8, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_1

    :cond_9
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-static {v3, v6}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannels(Ljava/util/Map;)V

    return-void
.end method

.method public final removeChannels$stream_chat_android_client_release(Ljava/util/Set;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cidSet"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getRawChannels$stream_chat_android_client_release()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getLogger()Lb23/k;

    move-result-object p1

    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->E:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    const-string v0, "[removeChannels] rejected (existingChannels is null)"

    const/4 v3, 0x0

    invoke-interface {p1, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getQueryChannelsSpec$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->getCids()Ljava/util/Set;

    move-result-object v2

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v2, p1}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setCids(Ljava/util/Set;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-static {v0, p1}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannels(Ljava/util/Map;)V

    return-void
.end method

.method public final setChannelsOffset$stream_chat_android_client_release(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setChannelsOffset(I)V

    return-void
.end method

.method public final setCurrentRequest$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[onQueryChannelsRequest] request: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setCurrentRequest(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V

    return-void
.end method

.method public final setEndOfChannels$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setEndOfChannels(Z)V

    return-void
.end method

.method public final setLoadingFirstPage$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setLoadingFirstPage(Z)V

    return-void
.end method

.method public final setLoadingMore$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setLoadingMore(Z)V

    return-void
.end method

.method public final setRecoveryNeeded$stream_chat_android_client_release(Z)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/querychannels/internal/QueryChannelsStateLogic;->mutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setRecoveryNeeded(Z)V

    return-void
.end method
