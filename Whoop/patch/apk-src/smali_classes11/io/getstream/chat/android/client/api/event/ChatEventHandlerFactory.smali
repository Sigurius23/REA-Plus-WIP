.class public Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J+\u0010\u000c\u001a\u00020\u000b2\u001a\u0010\n\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0018\u00010\u00070\u0006H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;)V",
        "Lec3/f2;",
        "",
        "",
        "Lio/getstream/chat/android/models/Channel;",
        "channels",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandler;",
        "chatEventHandler",
        "(Lec3/f2;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
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


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {p0, v0, v1, v0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-void
.end method

.method public synthetic constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 4
    sget-object p1, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/ChatClient;->getClientState()Lio/getstream/chat/android/client/setup/state/ClientState;

    move-result-object p1

    .line 5
    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;)V

    return-void
.end method


# virtual methods
.method public final chatEventHandler(Lec3/f2;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            ")",
            "Lio/getstream/chat/android/client/api/event/ChatEventHandler;"
        }
    .end annotation

    const-string v0, "channels"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;

    iget-object v1, p0, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;-><init>(Lec3/f2;Lio/getstream/chat/android/client/setup/state/ClientState;)V

    return-object v0
.end method
