.class public Lio/getstream/chat/android/client/socket/ChatSocket;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/ChatSocket$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00ec\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010#\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0002y|\u0008\u0010\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0084\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0086@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\"\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008\"\u0010!J\u0017\u0010\'\u001a\u00020\u00172\u0006\u0010$\u001a\u00020#H\u0000\u00a2\u0006\u0004\u0008%\u0010&J\u000f\u0010*\u001a\u00020\u0017H\u0000\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010/\u001a\u00020\u00192\u0008\u0008\u0002\u0010,\u001a\u00020+H\u0080@\u00a2\u0006\u0004\u0008-\u0010.J$\u00103\u001a\u00020\u0019\"\n\u0008\u0000\u00101\u0018\u0001*\u0002002\u0006\u0010,\u001a\u00020+H\u0080H\u00a2\u0006\u0004\u00082\u0010.J\u000f\u00106\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u00084\u00105J(\u00108\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u00107\u001a\u00020\u0017H\u0086@\u00a2\u0006\u0004\u00088\u00109J\u000f\u0010;\u001a\u00020:H\u0002\u00a2\u0006\u0004\u0008;\u0010<J\u0018\u0010>\u001a\u00020\u00192\u0006\u0010=\u001a\u00020#H\u0082@\u00a2\u0006\u0004\u0008>\u0010?J\u0010\u0010@\u001a\u00020\u0019H\u0082@\u00a2\u0006\u0004\u0008@\u0010\u001dJ\u000f\u0010A\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ\u000f\u0010C\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008C\u0010BJ\u0018\u0010F\u001a\u00020\u00192\u0006\u0010E\u001a\u00020DH\u0082@\u00a2\u0006\u0004\u0008F\u0010GJ\u0018\u0010I\u001a\u00020\u00192\u0006\u0010E\u001a\u00020HH\u0082@\u00a2\u0006\u0004\u0008I\u0010JJ#\u0010M\u001a\u00020\u00192\u0012\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00190KH\u0002\u00a2\u0006\u0004\u0008M\u0010NJ\u0013\u0010P\u001a\u00020H*\u00020OH\u0002\u00a2\u0006\u0004\u0008P\u0010QJ\u0017\u0010S\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008S\u0010TJ\u001d\u0010X\u001a\u00020\u00022\u000c\u0010W\u001a\u0008\u0012\u0004\u0012\u00020V0UH\u0002\u00a2\u0006\u0004\u0008X\u0010YR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010ZR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010ZR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010[R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\\R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010]R\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010^R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010_R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010`R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010aR\u0018\u0010c\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008c\u0010dR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010k8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008l\u0010mR\u001a\u0010o\u001a\u0008\u0012\u0004\u0012\u00020\u001e0n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008o\u0010pR\u0014\u0010r\u001a\u00020q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008r\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008t\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008w\u0010xR\u0014\u0010z\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008}\u0010~R\u001c\u0010\u0083\u0001\u001a\u00030\u0080\u0001*\u00020\u007f8BX\u0082\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001\u00a8\u0006\u0085\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocket;",
        "",
        "",
        "apiKey",
        "wssUrl",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "tokenManager",
        "Lio/getstream/chat/android/client/socket/SocketFactory;",
        "socketFactory",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "userScope",
        "Lio/getstream/chat/android/client/StreamLifecycleObserver;",
        "lifecycleObserver",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "networkStateProvider",
        "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;",
        "clientDebugger",
        "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
        "serverClockOffset",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "",
        "isAnonymous",
        "Ll83/a0;",
        "connectUser",
        "(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;",
        "disconnect",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/socket/SocketListener;",
        "listener",
        "removeListener",
        "(Lio/getstream/chat/android/client/socket/SocketListener;)V",
        "addListener",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "sendEvent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)Z",
        "sendEvent",
        "isConnected$stream_chat_android_client_release",
        "()Z",
        "isConnected",
        "",
        "timeoutInMillis",
        "awaitConnection$stream_chat_android_client_release",
        "(JLq83/d;)Ljava/lang/Object;",
        "awaitConnection",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "T",
        "awaitState$stream_chat_android_client_release",
        "awaitState",
        "connectionIdOrError$stream_chat_android_client_release",
        "()Ljava/lang/String;",
        "connectionIdOrError",
        "forceReconnection",
        "reconnectUser",
        "(Lio/getstream/chat/android/models/User;ZZLq83/d;)Ljava/lang/Object;",
        "Lbc3/k1;",
        "observeSocketStateService",
        "()Lbc3/k1;",
        "chatEvent",
        "handleEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;",
        "startObservers",
        "disposeObservers",
        "()V",
        "disposeNetworkStateObserver",
        "Ln23/e;",
        "error",
        "handleError",
        "(Ln23/e;Lq83/d;)Ljava/lang/Object;",
        "Ln23/c;",
        "onChatNetworkError",
        "(Ln23/c;Lq83/d;)Ljava/lang/Object;",
        "Lkotlin/Function1;",
        "call",
        "callListeners",
        "(Lkotlin/jvm/functions/Function1;)V",
        "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;",
        "toNetworkError",
        "(Lio/getstream/chat/android/client/events/ConnectionErrorEvent;)Ln23/c;",
        "moreInfo",
        "moreInfoTemplate",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "",
        "Lio/getstream/chat/android/client/errors/ChatErrorDetail;",
        "details",
        "buildDetailsTemplate",
        "(Ljava/util/List;)Ljava/lang/String;",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/token/TokenManager;",
        "Lio/getstream/chat/android/client/socket/SocketFactory;",
        "Lio/getstream/chat/android/client/scope/UserScope;",
        "Lio/getstream/chat/android/client/StreamLifecycleObserver;",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "Lio/getstream/chat/android/client/debugger/ChatClientDebugger;",
        "Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;",
        "Lio/getstream/chat/android/client/socket/StreamWebSocket;",
        "streamWebSocket",
        "Lio/getstream/chat/android/client/socket/StreamWebSocket;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "connectionConf",
        "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
        "",
        "listeners",
        "Ljava/util/Set;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService;",
        "chatSocketStateService",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService;",
        "socketStateObserverJob",
        "Lbc3/k1;",
        "Lio/getstream/chat/android/client/socket/HealthMonitor;",
        "healthMonitor",
        "Lio/getstream/chat/android/client/socket/HealthMonitor;",
        "io/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1",
        "lifecycleHandler",
        "Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;",
        "io/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1",
        "networkStateListener",
        "Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;",
        "Lio/getstream/chat/android/client/clientstate/DisconnectCause;",
        "getCause",
        "(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;",
        "cause",
        "Companion",
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


# static fields
.field public static final Companion:Lio/getstream/chat/android/client/socket/ChatSocket$Companion;

.field private static final DEFAULT_CONNECTION_TIMEOUT:J = 0xea60L

.field private static final TAG:Ljava/lang/String; = "Chat:Socket"


# instance fields
.field private final apiKey:Ljava/lang/String;

.field private final chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

.field private final clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

.field private connectionConf:Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

.field private final healthMonitor:Lio/getstream/chat/android/client/socket/HealthMonitor;

.field private final lifecycleHandler:Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;

.field private final lifecycleObserver:Lio/getstream/chat/android/client/StreamLifecycleObserver;

.field private final listeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lio/getstream/chat/android/client/socket/SocketListener;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final networkStateListener:Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;

.field private final networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

.field private final serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

.field private final socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;

.field private socketStateObserverJob:Lbc3/k1;

.field private streamWebSocket:Lio/getstream/chat/android/client/socket/StreamWebSocket;

.field private final tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

.field private final userScope:Lio/getstream/chat/android/client/scope/UserScope;

.field private final wssUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/socket/ChatSocket;->Companion:Lio/getstream/chat/android/client/socket/ChatSocket$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V
    .locals 8

    move-object/from16 v1, p9

    const-string v2, "apiKey"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "wssUrl"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "tokenManager"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "socketFactory"

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "userScope"

    invoke-static {p5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "lifecycleObserver"

    invoke-static {p6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "networkStateProvider"

    invoke-static {p7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "serverClockOffset"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->apiKey:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->wssUrl:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleObserver:Lio/getstream/chat/android/client/StreamLifecycleObserver;

    .line 8
    iput-object p7, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    move-object/from16 p1, p8

    .line 9
    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    .line 10
    iput-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    .line 11
    const-string p1, "Chat:Socket"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->logger$delegate:Ll83/h;

    .line 12
    new-instance p1, Ljava/util/LinkedHashSet;

    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    .line 13
    new-instance p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    const/4 p2, 0x1

    const/4 p3, 0x0

    invoke-direct {p1, p3, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;-><init>(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    .line 14
    new-instance v0, Lio/getstream/chat/android/client/socket/HealthMonitor;

    .line 15
    new-instance v4, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;

    invoke-direct {v4, p0, p3}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    .line 16
    new-instance v5, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$2;

    invoke-direct {v5, p0, p3}, Lio/getstream/chat/android/client/socket/ChatSocket$healthMonitor$2;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    const/4 v6, 0x3

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p5

    .line 17
    invoke-direct/range {v0 .. v7}, Lio/getstream/chat/android/client/socket/HealthMonitor;-><init>(Lio/getstream/chat/android/client/utils/TimeProvider;Lio/getstream/chat/android/client/socket/HealthMonitor$RetryInterval;Lio/getstream/chat/android/client/scope/UserScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->healthMonitor:Lio/getstream/chat/android/client/socket/HealthMonitor;

    .line 18
    new-instance p1, Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleHandler:Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;

    .line 19
    new-instance p1, Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;

    invoke-direct {p1, p0}, Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateListener:Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 11

    move/from16 v0, p10

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 20
    :goto_1
    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/socket/ChatSocket;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/token/TokenManager;Lio/getstream/chat/android/client/socket/SocketFactory;Lio/getstream/chat/android/client/scope/UserScope;Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/network/NetworkStateProvider;Lio/getstream/chat/android/client/debugger/ChatClientDebugger;Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->handleEvent$lambda$5(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;

    return-void
.end method

.method public static final synthetic access$callListeners(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->callListeners(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final synthetic access$disposeNetworkStateObserver(Lio/getstream/chat/android/client/socket/ChatSocket;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->disposeNetworkStateObserver()V

    return-void
.end method

.method public static final synthetic access$disposeObservers(Lio/getstream/chat/android/client/socket/ChatSocket;)V
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->disposeObservers()V

    return-void
.end method

.method public static final synthetic access$getCause(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->getCause(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getChatSocketStateService$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocketStateService;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    return-object p0
.end method

.method public static final synthetic access$getClientDebugger$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/debugger/ChatClientDebugger;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->clientDebugger:Lio/getstream/chat/android/client/debugger/ChatClientDebugger;

    return-object p0
.end method

.method public static final synthetic access$getConnectionConf$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->connectionConf:Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    return-object p0
.end method

.method public static final synthetic access$getHealthMonitor$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/HealthMonitor;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->healthMonitor:Lio/getstream/chat/android/client/socket/HealthMonitor;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleHandler$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleHandler:Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;

    return-object p0
.end method

.method public static final synthetic access$getLifecycleObserver$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/StreamLifecycleObserver;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleObserver:Lio/getstream/chat/android/client/StreamLifecycleObserver;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/socket/ChatSocket;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getServerClockOffset$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    return-object p0
.end method

.method public static final synthetic access$getStreamWebSocket$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/socket/StreamWebSocket;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->streamWebSocket:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    return-object p0
.end method

.method public static final synthetic access$getTokenManager$p(Lio/getstream/chat/android/client/socket/ChatSocket;)Lio/getstream/chat/android/client/token/TokenManager;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    return-object p0
.end method

.method public static final synthetic access$handleError(Lio/getstream/chat/android/client/socket/ChatSocket;Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->handleError(Ln23/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$handleEvent(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observeSocketStateService$connectUser(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocket;->observeSocketStateService$connectUser(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$observeSocketStateService$reconnect(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocket;->observeSocketStateService$reconnect(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$onChatNetworkError(Lio/getstream/chat/android/client/socket/ChatSocket;Ln23/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->onChatNetworkError(Ln23/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$startObservers(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->startObservers(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$toNetworkError(Lio/getstream/chat/android/client/socket/ChatSocket;Lio/getstream/chat/android/client/events/ConnectionErrorEvent;)Ln23/c;
    .locals 0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->toNetworkError(Lio/getstream/chat/android/client/events/ConnectionErrorEvent;)Ln23/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic awaitConnection$stream_chat_android_client_release$default(Lio/getstream/chat/android/client/socket/ChatSocket;JLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const-wide/32 p1, 0xea60

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocket;->awaitConnection$stream_chat_android_client_release(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: awaitConnection"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(Ln23/e;Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket;->handleError$lambda$7(Ln23/e;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;

    return-void
.end method

.method private final buildDetailsTemplate(Ljava/util/List;)Ljava/lang/String;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/errors/ChatErrorDetail;",
            ">;)",
            "Ljava/lang/String;"
        }
    .end annotation

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\nError details: "

    invoke-static {v0, p1}, Ldc/b;->q(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private final callListeners(Lkotlin/jvm/functions/Function1;)V
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/client/socket/SocketListener;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/socket/SocketListener;->getDeliverOnMainThread()Z

    move-result v3

    if-eqz v3, :cond_0

    sget-object v3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v3

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    sget-object v3, Lq83/k;->w:Lq83/k;

    :goto_1
    iget-object v4, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v5, Lio/getstream/chat/android/client/socket/ChatSocket$callListeners$1$1$1;

    const/4 v6, 0x0

    invoke-direct {v5, p1, v2, v6}, Lio/getstream/chat/android/client/socket/ChatSocket$callListeners$1$1$1;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/client/socket/SocketListener;Lq83/d;)V

    const/4 v2, 0x2

    invoke-static {v4, v3, v6, v5, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_1
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw p1
.end method

.method private final disposeNetworkStateObserver()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateListener:Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->unsubscribe(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V

    return-void
.end method

.method private final disposeObservers()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->disposeNetworkStateObserver()V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocket$disposeObservers$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/client/socket/ChatSocket$disposeObservers$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final getCause(Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;)Lio/getstream/chat/android/client/clientstate/DisconnectCause;
    .locals 1

    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;

    if-nez v0, :cond_5

    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;

    if-eqz v0, :cond_1

    sget-object p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$NetworkNotAvailable;->INSTANCE:Lio/getstream/chat/android/client/clientstate/DisconnectCause$NetworkNotAvailable;

    return-object p1

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    if-eqz v0, :cond_2

    new-instance v0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/clientstate/DisconnectCause$UnrecoverableError;-><init>(Ln23/c;)V

    return-object v0

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    if-eqz v0, :cond_3

    new-instance v0, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;

    check-cast p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;->getError()Ln23/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/clientstate/DisconnectCause$Error;-><init>(Ln23/c;)V

    return-object v0

    :cond_3
    instance-of p1, p1, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;

    if-eqz p1, :cond_4

    sget-object p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$WebSocketNotAvailable;->INSTANCE:Lio/getstream/chat/android/client/clientstate/DisconnectCause$WebSocketNotAvailable;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    :goto_0
    sget-object p1, Lio/getstream/chat/android/client/clientstate/DisconnectCause$ConnectionReleased;->INSTANCE:Lio/getstream/chat/android/client/clientstate/DisconnectCause$ConnectionReleased;

    return-object p1
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleError(Ln23/e;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/e;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->F:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[handleError] error: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    instance-of v0, p1, Ln23/c;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_2

    check-cast p1, Ln23/c;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->onChatNetworkError(Ln23/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    return-object v1

    :cond_2
    new-instance p2, Lio/getstream/chat/android/client/socket/a;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/client/socket/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->callListeners(Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method private static final handleError$lambda$7(Ln23/e;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lio/getstream/chat/android/client/socket/SocketListener;->onError(Ln23/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    check-cast p1, Lio/getstream/chat/android/client/events/ConnectedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v2

    invoke-virtual {v0, v2}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->onConnected$stream_chat_android_client_release(Ljava/util/Date;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onConnectionEstablished(Lio/getstream/chat/android/client/events/ConnectedEvent;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    return-object v1

    :cond_1
    instance-of p2, p1, Lio/getstream/chat/android/client/events/HealthEvent;

    if-eqz p2, :cond_2

    iget-object p2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    check-cast p1, Lio/getstream/chat/android/client/events/HealthEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/HealthEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->onHealthCheck$stream_chat_android_client_release(Ljava/util/Date;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->healthMonitor:Lio/getstream/chat/android/client/socket/HealthMonitor;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/socket/HealthMonitor;->ack()V

    return-object v1

    :cond_2
    new-instance p2, Lio/getstream/chat/android/client/socket/a;

    const/4 v0, 0x1

    invoke-direct {p2, p1, v0}, Lio/getstream/chat/android/client/socket/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/socket/ChatSocket;->callListeners(Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method private static final handleEvent$lambda$5(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/client/socket/SocketListener;)Ll83/a0;
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Lio/getstream/chat/android/client/socket/SocketListener;->onEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final moreInfoTemplate(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "\nMore information available at "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    const-string p1, ""

    return-object p1
.end method

.method private final observeSocketStateService()Lbc3/k1;
    .locals 4

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v2, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lq83/d;)V

    const/4 v0, 0x3

    invoke-static {v1, v3, v3, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    return-object v0
.end method

.method private static final observeSocketStateService$connectUser(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/ChatSocket;",
            "Lkotlin/jvm/internal/g0;",
            "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[connectUser] connectionConf: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    new-instance v1, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$connectUser$3;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$connectUser$3;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iput-object p2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->connectionConf:Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    iget-object v0, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_1

    invoke-interface {v0, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    iget-object p3, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->serverClockOffset:Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;

    invoke-virtual {p3}, Lio/getstream/chat/android/client/utils/internal/ServerClockOffset;->onConnectionStarted$stream_chat_android_client_release()V

    iget-object p3, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->socketFactory:Lio/getstream/chat/android/client/socket/SocketFactory;

    invoke-virtual {p3, p2}, Lio/getstream/chat/android/client/socket/SocketFactory;->createSocket(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;)Lio/getstream/chat/android/client/socket/StreamWebSocket;

    move-result-object p2

    invoke-virtual {p2}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->listen()Lec3/l;

    move-result-object p3

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$connectUser$4$1;

    invoke-direct {v0, p0, v2}, Lio/getstream/chat/android/client/socket/ChatSocket$observeSocketStateService$connectUser$4$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, p3, v0, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    iget-object p3, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->userScope:Lio/getstream/chat/android/client/scope/UserScope;

    invoke-static {v2, p3}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    move-result-object p3

    iput-object p3, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object p2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->streamWebSocket:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    return-object v1

    :cond_2
    if-nez v0, :cond_4

    iget-object p0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {p0, p3}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onNetworkNotAvailable(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_3

    return-object p0

    :cond_3
    return-object v1

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final observeSocketStateService$reconnect(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/socket/ChatSocket;",
            "Lkotlin/jvm/internal/g0;",
            "Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "[reconnect] connectionConf: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {p2}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;->asReconnectionConf$stream_chat_android_client_release()Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    invoke-static {p0, p1, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocket;->observeSocketStateService$connectUser(Lio/getstream/chat/android/client/socket/ChatSocket;Lkotlin/jvm/internal/g0;Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_1

    return-object p0

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final onChatNetworkError(Ln23/c;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/c;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/client/errors/ChatErrorCode;->Companion:Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;

    invoke-virtual {p1}, Ln23/c;->d()I

    move-result v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode$Companion;->isAuthenticationError(I)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->tokenManager:Lio/getstream/chat/android/client/token/TokenManager;

    invoke-interface {v0}, Lio/getstream/chat/android/client/token/TokenManager;->expireToken()V

    :cond_0
    invoke-virtual {p1}, Ln23/c;->d()I

    move-result v0

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->UNDEFINED_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->INVALID_TOKEN:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->API_KEY_NOT_FOUND:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->VALIDATION_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v1

    if-eq v0, v1, :cond_2

    sget-object v1, Lio/getstream/chat/android/client/errors/ChatErrorCode;->DUPLICATE_USERNAME_ERROR:Lio/getstream/chat/android/client/errors/ChatErrorCode;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatErrorCode;->getCode()I

    move-result v1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onNetworkError(Ln23/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_2
    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ln23/c;->d()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "One unrecoverable error happened. Error: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, ". Error code: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onUnrecoverableError(Ln23/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_4

    return-object p1

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final startObservers(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;

    iget v1, v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleObserver:Lio/getstream/chat/android/client/StreamLifecycleObserver;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->lifecycleHandler:Lio/getstream/chat/android/client/socket/ChatSocket$lifecycleHandler$1;

    iput v3, v0, Lio/getstream/chat/android/client/socket/ChatSocket$startObservers$1;->label:I

    invoke-virtual {p1, v2, v0}, Lio/getstream/chat/android/client/StreamLifecycleObserver;->observe(Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->networkStateListener:Lio/getstream/chat/android/client/socket/ChatSocket$networkStateListener$1;

    invoke-virtual {p1, v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->subscribe(Lio/getstream/chat/android/client/network/NetworkStateProvider$NetworkStateListener;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final toNetworkError(Lio/getstream/chat/android/client/events/ConnectionErrorEvent;)Ln23/c;
    .locals 4

    new-instance v0, Ln23/c;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->getError()Lio/getstream/chat/android/client/errors/ChatError;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/client/errors/ChatError;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->getError()Lio/getstream/chat/android/client/errors/ChatError;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/errors/ChatError;->getMoreInfo()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v2}, Lio/getstream/chat/android/client/socket/ChatSocket;->moreInfoTemplate(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->getError()Lio/getstream/chat/android/client/errors/ChatError;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/client/errors/ChatError;->getDetails()Ljava/util/List;

    move-result-object v3

    invoke-direct {p0, v3}, Lio/getstream/chat/android/client/socket/ChatSocket;->buildDetailsTemplate(Ljava/util/List;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->getError()Lio/getstream/chat/android/client/errors/ChatError;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/client/errors/ChatError;->getCode()I

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/ConnectionErrorEvent;->getError()Lio/getstream/chat/android/client/errors/ChatError;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/errors/ChatError;->getStatusCode()I

    move-result p1

    const/16 v3, 0x8

    invoke-direct {v0, v1, v2, p1, v3}, Ln23/c;-><init>(Ljava/lang/String;III)V

    return-object v0
.end method


# virtual methods
.method public final addListener(Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 2

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final awaitConnection$stream_chat_android_client_release(JLq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lio/getstream/chat/android/client/socket/ChatSocket$awaitConnection$$inlined$awaitState$stream_chat_android_client_release$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/socket/ChatSocket$awaitConnection$$inlined$awaitState$stream_chat_android_client_release$1;-><init>(Lio/getstream/chat/android/client/socket/ChatSocket;Lq83/d;)V

    invoke-static {p1, p2, v0, p3}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final awaitState$stream_chat_android_client_release(JLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
            ">(J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lkotlin/jvm/internal/k;->p()V

    const/4 p1, 0x0

    throw p1
.end method

.method public final connectUser(Lio/getstream/chat/android/models/User;ZLq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, "[connectUser] user.id: "

    const-string v5, ", isAnonymous: "

    invoke-static {v4, v3, v5, p2}, Ld13/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->socketStateObserverJob:Lbc3/k1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->observeSocketStateService()Lbc3/k1;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->socketStateObserverJob:Lbc3/k1;

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_2

    new-instance p2, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->wssUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->apiKey:Ljava/lang/String;

    invoke-direct {p2, v1, v2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    goto :goto_0

    :cond_2
    if-nez p2, :cond_4

    new-instance p2, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->wssUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->apiKey:Ljava/lang/String;

    invoke-direct {p2, v1, v2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    :goto_0
    invoke-virtual {v0, p2, p3}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onConnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_3

    return-object p1

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final connectionIdOrError$stream_chat_android_client_release()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getCurrentState()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object v0

    instance-of v1, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;->getEvent()Lio/getstream/chat/android/client/events/ConnectedEvent;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/ConnectedEvent;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This state doesn\'t contain connectionId"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final disconnect(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    const-string v3, "[disconnect] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->connectionConf:Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onRequiredDisconnect(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final isConnected$stream_chat_android_client_release()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->getCurrentState()Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Connected;

    return v0
.end method

.method public final reconnectUser(Lio/getstream/chat/android/models/User;ZZLq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lio/getstream/chat/android/client/socket/ChatSocket;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    const-string v4, ", isAnonymous: "

    const-string v5, ", forceReconnection: "

    const-string v6, "[reconnectUser] user.id: "

    invoke-static {v6, v3, v4, v5, p2}, Lm4/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, p3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->chatSocketStateService:Lio/getstream/chat/android/client/socket/ChatSocketStateService;

    const/4 v1, 0x1

    if-ne p2, v1, :cond_1

    new-instance p2, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->wssUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->apiKey:Ljava/lang/String;

    invoke-direct {p2, v1, v2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$AnonymousConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    goto :goto_0

    :cond_1
    if-nez p2, :cond_3

    new-instance p2, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;

    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->wssUrl:Ljava/lang/String;

    iget-object v2, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->apiKey:Ljava/lang/String;

    invoke-direct {p2, v1, v2, p1}, Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf$UserConnectionConf;-><init>(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/User;)V

    :goto_0
    invoke-virtual {v0, p2, p3, p4}, Lio/getstream/chat/android/client/socket/ChatSocketStateService;->onReconnect(Lio/getstream/chat/android/client/socket/SocketFactory$ConnectionConf;ZLq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_2

    return-object p1

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final removeListener(Lio/getstream/chat/android/client/socket/SocketListener;)V
    .locals 2

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->listeners:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final sendEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/socket/ChatSocket;->streamWebSocket:Lio/getstream/chat/android/client/socket/StreamWebSocket;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/socket/StreamWebSocket;->send(Lio/getstream/chat/android/client/events/ChatEvent;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
