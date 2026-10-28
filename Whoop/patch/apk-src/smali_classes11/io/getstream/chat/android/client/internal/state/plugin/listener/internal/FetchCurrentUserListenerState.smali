.class public final Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u0096@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00108BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;",
        "Lio/getstream/chat/android/client/plugin/listeners/FetchCurrentUserListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "globalMutableState",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/User;",
        "result",
        "Ll83/a0;",
        "onFetchCurrentUserResult",
        "(Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
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
.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalMutableState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    const-string p1, "Chat:FetchCurUserLST"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->logger$delegate:Ll83/h;

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final onFetchCurrentUserResult(Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    iget-object v1, p2, Lb23/k;->a:Ljava/lang/String;

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v2, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v3, "[onFetchCurrentUserResult] result: "

    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {p2, v2, v1, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->globalMutableState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/listener/internal/FetchCurrentUserListenerState;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v0}, Lio/getstream/chat/android/client/setup/state/ClientState;->getUser()Lec3/f2;

    move-result-object v0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/User;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;

    invoke-virtual {p1}, Ln23/h;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/User;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUserFull;-><init>(Lio/getstream/chat/android/models/User;)V

    invoke-static {p2, v0, v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/SelfUserUtilsKt;->updateCurrentUser(Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lio/getstream/chat/android/models/User;Lio/getstream/chat/android/client/internal/state/event/handler/internal/model/SelfUser;)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
