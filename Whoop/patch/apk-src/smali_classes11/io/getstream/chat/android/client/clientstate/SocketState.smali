.class public abstract Lio/getstream/chat/android/client/clientstate/SocketState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/clientstate/SocketState$Connected;,
        Lio/getstream/chat/android/client/clientstate/SocketState$Disconnected;,
        Lio/getstream/chat/android/client/clientstate/SocketState$Idle;,
        Lio/getstream/chat/android/client/clientstate/SocketState$Pending;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00080\u0018\u00002\u00020\u0001:\u0004\u0007\u0008\t\nB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0005H\u0000\u00a2\u0006\u0002\u0008\u0006\u0082\u0001\u0004\u000b\u000c\r\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/clientstate/SocketState;",
        "",
        "<init>",
        "()V",
        "connectionIdOrError",
        "",
        "connectionIdOrError$stream_chat_android_client_release",
        "Idle",
        "Pending",
        "Connected",
        "Disconnected",
        "Lio/getstream/chat/android/client/clientstate/SocketState$Connected;",
        "Lio/getstream/chat/android/client/clientstate/SocketState$Disconnected;",
        "Lio/getstream/chat/android/client/clientstate/SocketState$Idle;",
        "Lio/getstream/chat/android/client/clientstate/SocketState$Pending;",
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


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final connectionIdOrError$stream_chat_android_client_release()Ljava/lang/String;
    .locals 2

    instance-of v0, p0, Lio/getstream/chat/android/client/clientstate/SocketState$Connected;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lio/getstream/chat/android/client/clientstate/SocketState$Connected;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/clientstate/SocketState$Connected;->getConnectionId()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "This state doesn\'t contain connectionId"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
