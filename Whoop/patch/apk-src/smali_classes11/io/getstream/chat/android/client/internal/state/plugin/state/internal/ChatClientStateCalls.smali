.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J(\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\n\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ3\u0010\u0018\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00170\u00160\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J \u0010 \u001a\u00020\u001d2\u0006\u0010\u000c\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001bH\u0080@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ4\u0010&\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u00102\n\u0008\u0002\u0010#\u001a\u0004\u0018\u00010\u0008H\u0080@\u00a2\u0006\u0004\u0008$\u0010%J\u0018\u0010+\u001a\u00020(2\u0006\u0010\u000c\u001a\u00020\'H\u0080@\u00a2\u0006\u0004\u0008)\u0010*J(\u0010/\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@\u00a2\u0006\u0004\u0008-\u0010.J(\u00101\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0080@\u00a2\u0006\u0004\u00080\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u00102R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u00103R\u001b\u00109\u001a\u0002048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00085\u00106\u001a\u0004\u00087\u00108R\u001a\u0010<\u001a\u0008\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010=\u00a8\u0006>"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;",
        "",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "request",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "queryChannel",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "",
        "olderToNewer",
        "messageId",
        "",
        "messageLimit",
        "Lo23/d;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "repliesCall",
        "(ZLjava/lang/String;I)Lo23/d;",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "queryChannels$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)Ljava/lang/Object;",
        "queryChannels",
        "cid",
        "userPresence",
        "aroundMessageId",
        "watchChannel$stream_chat_android_client_release",
        "(Ljava/lang/String;IZLjava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "watchChannel",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "queryThreads$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;",
        "queryThreads",
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "getReplies$stream_chat_android_client_release",
        "(Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;",
        "getReplies",
        "awaitReplies$stream_chat_android_client_release",
        "awaitReplies",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lbc3/c0;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lbc3/i0;",
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "deferredState",
        "Lbc3/i0;",
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
.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final deferredState:Lbc3/i0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/i0;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;)V
    .locals 2

    const-string v0, "chatClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->scope:Lbc3/c0;

    const-string p1, "Chat:ClientStateCalls"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->logger$delegate:Ll83/h;

    sget-object p1, Lbc3/d0;->w:Lbc3/d0;

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$deferredState$1;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$deferredState$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    const/4 v1, 0x1

    invoke-static {p2, v0, p1, v1}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    return-void
.end method

.method public static final synthetic access$getChatClient$p(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;)Lio/getstream/chat/android/client/ChatClient;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    return-object p0
.end method

.method public static final synthetic access$queryChannel(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object v2, p2

    move-object/from16 v0, p4

    instance-of v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;

    if-eqz v3, :cond_0

    move-object v3, v0

    check-cast v3, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->label:I

    :goto_0
    move-object v7, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;

    invoke-direct {v3, p0, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->result:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v3, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->label:I

    const/4 v9, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v9, :cond_1

    iget-object v1, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;

    iget-object v1, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v2, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v2

    move-object v2, v1

    move-object v1, v12

    goto :goto_3

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->x:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    const/4 v10, 0x0

    if-eqz v3, :cond_3

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v3, ":"

    const-string v6, ", request: "

    const-string v11, "[queryChannel] cid: "

    invoke-static {v11, p1, v3, p2, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    move-object/from16 v6, p3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v5, v4, v3, v10}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    :cond_3
    move-object/from16 v6, p3

    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/16 v5, 0x8

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object/from16 v3, p3

    invoke-static/range {v0 .. v6}, Lio/getstream/chat/android/client/ChatClient;->queryChannel$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;ZILjava/lang/Object;)Lo23/d;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->scope:Lbc3/c0;

    invoke-static {v0, v3}, Lo23/f;->f(Lo23/d;Lbc3/c0;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    iput-object p1, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$0:Ljava/lang/Object;

    iput-object v2, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$1:Ljava/lang/Object;

    iput-object v10, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->L$2:Ljava/lang/Object;

    iput v9, v7, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannel$1;->label:I

    invoke-interface {v0, v7}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    return-object v8

    :cond_4
    move-object v1, p1

    :goto_3
    check-cast v0, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;

    move-result-object v0

    return-object v0
.end method

.method private final repliesCall(ZLjava/lang/String;I)Lo23/d;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/lang/String;",
            "I)",
            "Lo23/d;"
        }
    .end annotation

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v2, p2

    move v3, p3

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/ChatClient;->getNewerReplies$default(Lio/getstream/chat/android/client/ChatClient;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Lo23/d;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v2, p2

    move v3, p3

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p1, v2, v3}, Lio/getstream/chat/android/client/ChatClient;->getReplies(Ljava/lang/String;I)Lo23/d;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic watchChannel$stream_chat_android_client_release$default(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Ljava/lang/String;IZLjava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->watchChannel$stream_chat_android_client_release(Ljava/lang/String;IZLjava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final awaitReplies$stream_chat_android_client_release(Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ThreadState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->Z$0:Z

    iget p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->I$0:I

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getLogger()Lb23/k;

    move-result-object p4

    iget-object v2, p4, Lb23/k;->c:Lb23/e;

    iget-object v5, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v6, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v6, v5}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v2, "[awaitReplies] messageId: "

    const-string v7, ", messageLimit: "

    invoke-static {p2, v2, p1, v7}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v7, 0x0

    invoke-interface {p4, v6, v5, v2, v7}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    invoke-direct {p0, p3, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->repliesCall(ZLjava/lang/String;I)Lo23/d;

    move-result-object p4

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->I$0:I

    iput-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->Z$0:Z

    iput v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->label:I

    invoke-interface {p4, v0}, Lo23/d;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->I$0:I

    iput-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->Z$0:Z

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$awaitReplies$1;->label:I

    invoke-interface {p4, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_6

    :goto_2
    return-object v1

    :cond_6
    :goto_3
    check-cast p4, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {p4, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object p1

    return-object p1
.end method

.method public final getReplies$stream_chat_android_client_release(Ljava/lang/String;IZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/ThreadState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p4, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;

    invoke-direct {v0, p0, p4}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    :goto_0
    iget-object p4, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getLogger()Lb23/k;

    move-result-object p4

    iget-object v2, p4, Lb23/k;->c:Lb23/e;

    iget-object v4, p4, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p4, p4, Lb23/k;->b:Lb23/j;

    const-string v2, "[getReplies] messageId: "

    const-string v6, ", messageLimit: "

    invoke-static {p2, v2, p1, v6}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-interface {p4, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    invoke-direct {p0, p3, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->repliesCall(ZLjava/lang/String;I)Lo23/d;

    move-result-object p4

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->scope:Lbc3/c0;

    invoke-static {p4, v2}, Lo23/f;->f(Lo23/d;Lbc3/c0;)V

    iget-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->L$0:Ljava/lang/Object;

    iput p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->I$0:I

    iput-boolean p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->Z$0:Z

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$getReplies$1;->label:I

    invoke-interface {p4, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p4, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {p4, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->thread(Ljava/lang/String;)Lio/getstream/chat/android/client/api/state/ThreadState;

    move-result-object p1

    return-object p1
.end method

.method public final queryChannels$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;

    invoke-direct {v0, p0, p3}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->L$1:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getLogger()Lb23/k;

    move-result-object p3

    iget-object v2, p3, Lb23/k;->c:Lb23/e;

    iget-object v4, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->y:Lb23/g;

    invoke-interface {v2, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "[queryChannels] request: "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v6, 0x0

    invoke-interface {p3, v5, v4, v2, v6}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p3, p1}, Lio/getstream/chat/android/client/ChatClient;->queryChannels(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lo23/d;

    move-result-object p3

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->scope:Lbc3/c0;

    invoke-static {p3, v2}, Lo23/f;->f(Lo23/d;Lbc3/c0;)V

    iget-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->L$0:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->L$1:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryChannels$1;->label:I

    invoke-interface {p3, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifierKt;->getIdentifier(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    move-result-object p1

    invoke-virtual {p3, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    move-result-object p1

    invoke-interface {p1, p2}, Lio/getstream/chat/android/client/api/state/QueryChannelsState;->setChatEventHandlerFactory(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V

    return-object p1
.end method

.method public final queryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->L$0:Ljava/lang/Object;

    check-cast p1, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/ChatClient;->queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;

    move-result-object p2

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->scope:Lbc3/c0;

    invoke-static {p2, v2}, Lo23/f;->f(Lo23/d;Lbc3/c0;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->deferredState:Lbc3/i0;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls$queryThreads$1;->label:I

    invoke-interface {p2, v0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/api/state/StateRegistry;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object p1

    invoke-virtual {p2, v0, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryThreadsState;

    move-result-object p1

    return-object p1
.end method

.method public final watchChannel$stream_chat_android_client_release(Ljava/lang/String;IZLjava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IZ",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->y:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, ", messageLimit: "

    const-string v4, ", userPresence: "

    const-string v5, "[watchChannel] cid: "

    invoke-static {p2, v5, p1, v1, v4}, Ld;->u(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v4, ", aroundMessageId: "

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    iget-object v0, p1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    if-nez p4, :cond_1

    new-instance p4, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {p4, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    goto :goto_0

    :cond_1
    new-instance v1, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;

    invoke-direct {v1, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;-><init>(I)V

    sget-object p2, Lio/getstream/chat/android/client/api/models/Pagination;->AROUND_ID:Lio/getstream/chat/android/client/api/models/Pagination;

    invoke-virtual {v1, p2}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterDirection(Lio/getstream/chat/android/client/api/models/Pagination;)V

    invoke-virtual {v1, p4}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->setMessageFilterValue(Ljava/lang/String;)V

    move-object p4, v1

    :goto_0
    invoke-virtual {p4, p3}, Lio/getstream/chat/android/client/internal/state/model/querychannels/pagination/internal/QueryChannelPaginationRequest;->toWatchChannelRequest(Z)Lio/getstream/chat/android/client/api/models/WatchChannelRequest;

    move-result-object p2

    const/4 p3, 0x0

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setShouldRefresh(Z)V

    const/4 p3, 0x1

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/client/api/models/QueryChannelRequest;->setWatchChannel(Z)V

    invoke-direct {p0, v0, p1, p2, p5}, Lio/getstream/chat/android/client/internal/state/plugin/state/internal/ChatClientStateCalls;->queryChannel(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
