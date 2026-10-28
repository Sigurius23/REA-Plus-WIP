.class public final Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/setup/state/ClientState;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\r0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\t0\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001eR\u001e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008 \u0010\u001eR \u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0!8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\"\u001a\u0004\u0008#\u0010$R\u001c\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008%\u0010$R\u0014\u0010\'\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010)\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008)\u0010(R\u0014\u0010*\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010(R\u001a\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\r0!8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008+\u0010$R\u0014\u0010-\u001a\u00020&8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010(\u00a8\u0006."
    }
    d2 = {
        "Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "networkStateProvider",
        "<init>",
        "(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V",
        "Ll83/a0;",
        "clearState",
        "()V",
        "Lio/getstream/chat/android/models/ConnectionState;",
        "connectionState",
        "setConnectionState",
        "(Lio/getstream/chat/android/models/ConnectionState;)V",
        "Lio/getstream/chat/android/models/InitializationState;",
        "state",
        "setInitializationState",
        "(Lio/getstream/chat/android/models/InitializationState;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "setUser",
        "(Lio/getstream/chat/android/models/User;)V",
        "Lio/getstream/chat/android/client/network/NetworkStateProvider;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lec3/p1;",
        "_initializationState",
        "Lec3/p1;",
        "_connectionState",
        "_user",
        "Lec3/f2;",
        "Lec3/f2;",
        "getConnectionState",
        "()Lec3/f2;",
        "getUser",
        "",
        "isOnline",
        "()Z",
        "isOffline",
        "isConnecting",
        "getInitializationState",
        "initializationState",
        "isNetworkAvailable",
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
.field private final _connectionState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _initializationState:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _user:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final connectionState:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/network/NetworkStateProvider;)V
    .locals 1

    const-string v0, "networkStateProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    const-string p1, "Chat:ClientState"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->logger$delegate:Ll83/h;

    sget-object p1, Lio/getstream/chat/android/models/InitializationState;->NOT_INITIALIZED:Lio/getstream/chat/android/models/InitializationState;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_initializationState:Lec3/p1;

    sget-object p1, Lio/getstream/chat/android/models/ConnectionState$Offline;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Offline;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    const/4 v0, 0x0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_user:Lec3/p1;

    iput-object p1, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->connectionState:Lec3/f2;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final clearState()V
    .locals 4

    invoke-direct {p0}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->getLogger()Lb23/k;

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

    const-string v3, "[clearState] no args"

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_initializationState:Lec3/p1;

    sget-object v1, Lio/getstream/chat/android/models/InitializationState;->NOT_INITIALIZED:Lio/getstream/chat/android/models/InitializationState;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Offline;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Offline;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_user:Lec3/p1;

    const/4 v1, 0x0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, v1}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public final getConnectionState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->connectionState:Lec3/f2;

    return-object v0
.end method

.method public final getInitializationState()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_initializationState:Lec3/p1;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_user:Lec3/p1;

    return-object v0
.end method

.method public final isConnecting()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Connecting;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Connecting;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isNetworkAvailable()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->networkStateProvider:Lio/getstream/chat/android/client/network/NetworkStateProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/network/NetworkStateProvider;->isConnected()Z

    move-result v0

    return v0
.end method

.method public final isOffline()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lio/getstream/chat/android/models/ConnectionState$Offline;->INSTANCE:Lio/getstream/chat/android/models/ConnectionState$Offline;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final isOnline()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/models/ConnectionState$Connected;

    return v0
.end method

.method public final setConnectionState(Lio/getstream/chat/android/models/ConnectionState;)V
    .locals 5

    const-string v0, "connectionState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->getLogger()Lb23/k;

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

    const-string v4, "[setConnectionState] state: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v2, v0, v3}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_connectionState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setInitializationState(Lio/getstream/chat/android/models/InitializationState;)V
    .locals 2

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_initializationState:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public final setUser(Lio/getstream/chat/android/models/User;)V
    .locals 2

    const-string v0, "user"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/setup/state/internal/MutableClientState;->_user:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method
