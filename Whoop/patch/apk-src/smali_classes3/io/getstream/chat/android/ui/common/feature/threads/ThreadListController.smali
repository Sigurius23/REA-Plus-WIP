.class public final Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \'2\u00020\u0001:\u0001\'B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0016\u0008\u0002\u0010\u000b\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0017R\u001a\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u001d\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u001c0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u001e\u001a\u0004\u0008\u001f\u0010 R\u001f\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u001e\u001a\u0004\u0008#\u0010 R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010\u001eR\u0017\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u00190\t8F\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010 \u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;",
        "",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "query",
        "Lio/getstream/chat/android/client/ChatClient;",
        "chatClient",
        "Lbc3/c0;",
        "scope",
        "Lkotlin/Function0;",
        "Lec3/f2;",
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "queryThreadsAsState",
        "<init>",
        "(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;)V",
        "",
        "getNextPage",
        "()Ljava/lang/String;",
        "Ll83/a0;",
        "load",
        "()V",
        "loadNextPage",
        "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
        "Lio/getstream/chat/android/client/ChatClient;",
        "Lbc3/c0;",
        "Lec3/p1;",
        "Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;",
        "_state",
        "Lec3/p1;",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "connectionState",
        "Lec3/f2;",
        "getConnectionState",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "getUser",
        "queryThreadsState",
        "getState",
        "state",
        "Companion",
        "stream-chat-android-ui-common_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8

.field public static final Companion:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;

.field public static final DEFAULT_THREAD_LIMIT:I = 0x19

.field public static final DEFAULT_THREAD_PARTICIPANT_LIMIT:I = 0xa

.field public static final DEFAULT_THREAD_REPLY_LIMIT:I = 0xa

.field private static final INITIAL_STATE:Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;


# instance fields
.field private final _state:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final chatClient:Lio/getstream/chat/android/client/ChatClient;

.field private final connectionState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

.field private final queryThreadsState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;

.field private final user:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->Companion:Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$Companion;

    new-instance v1, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    const/4 v5, 0x0

    const/4 v6, 0x0

    sget-object v2, Lm83/y;->w:Lm83/y;

    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;-><init>(Ljava/util/List;ZZIZ)V

    sput-object v1, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->INITIAL_STATE:Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;",
            "Lio/getstream/chat/android/client/ChatClient;",
            "Lbc3/c0;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "query"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "chatClient"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryThreadsAsState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->scope:Lbc3/c0;

    .line 5
    sget-object p1, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->INITIAL_STATE:Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->_state:Lec3/p1;

    .line 6
    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getConnectionState()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->connectionState:Lec3/f2;

    .line 7
    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    invoke-interface {p1}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->user:Lec3/f2;

    .line 8
    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lec3/f2;

    iput-object p1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->queryThreadsState:Lec3/f2;

    .line 9
    new-instance p1, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController$3;-><init>(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;Lq83/d;)V

    const/4 p4, 0x3

    invoke-static {p3, p2, p2, p1, p4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 10
    sget-object p2, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p2}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p2

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    .line 11
    new-instance p3, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;

    const/16 p6, 0x18

    invoke-direct {p3, p6}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/c;-><init>(I)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/client/ChatClient;->inheritScope(Lkotlin/jvm/functions/Function1;)Lbc3/c0;

    move-result-object p3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    .line 12
    new-instance p4, Lim1/a0;

    const/4 p5, 0x5

    invoke-direct {p4, p2, p1, p3, p5}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 13
    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;-><init>(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/client/ChatClient;Lbc3/c0;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lbc3/k1;)Lq83/j;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p0

    return-object p0
.end method

.method private static final _init_$lambda$1(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/ChatClientExtensions;->queryThreadsAsState(Lio/getstream/chat/android/client/ChatClient;Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lbc3/c0;)Lec3/f2;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lbc3/k1;)Lbc3/z;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->_init_$lambda$0(Lbc3/k1;)Lq83/j;

    move-result-object p0

    check-cast p0, Lbc3/z;

    return-object p0
.end method

.method public static final synthetic access$getQueryThreadsState$p(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)Lec3/f2;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->queryThreadsState:Lec3/f2;

    return-object p0
.end method

.method public static final synthetic access$get_state$p(Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;)Lec3/p1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->_state:Lec3/p1;

    return-object p0
.end method

.method private final getNextPage()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->_state:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoading()Z

    move-result v1

    if-nez v1, :cond_1

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/state/threads/ThreadListState;->isLoadingMore()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->queryThreadsState:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/api/state/QueryThreadsState;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lio/getstream/chat/android/client/api/state/QueryThreadsState;->getNext()Lec3/f2;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final getConnectionState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->connectionState:Lec3/f2;

    return-object v0
.end method

.method public final getState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->_state:Lec3/p1;

    return-object v0
.end method

.method public final getUser()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->user:Lec3/f2;

    return-object v0
.end method

.method public final load()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/ChatClient;->queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;

    move-result-object v0

    check-cast v0, Lo23/k;

    invoke-virtual {v0}, Lo23/k;->enqueue()V

    return-void
.end method

.method public final loadNextPage()V
    .locals 12

    invoke-direct {p0}, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->getNextPage()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->query:Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    const/16 v10, 0x1df

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;->copy$default(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;ZIILjava/lang/String;ILjava/lang/String;IILjava/lang/Object;)Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/common/feature/threads/ThreadListController;->chatClient:Lio/getstream/chat/android/client/ChatClient;

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/ChatClient;->queryThreads(Lio/getstream/chat/android/client/api/models/QueryThreadsRequest;)Lo23/d;

    move-result-object v0

    check-cast v0, Lo23/k;

    invoke-virtual {v0}, Lo23/k;->enqueue()V

    return-void
.end method
