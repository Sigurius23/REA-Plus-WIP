.class public abstract Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;
.super Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Disconnected"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001:\u0006\u0004\u0005\u0006\u0007\u0008\tB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\u0006\n\u000b\u000c\r\u000e\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State;",
        "<init>",
        "()V",
        "Stopped",
        "NetworkDisconnected",
        "WebSocketEventLost",
        "DisconnectedByRequest",
        "DisconnectedTemporarily",
        "DisconnectedPermanently",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedByRequest;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedPermanently;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$DisconnectedTemporarily;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$NetworkDisconnected;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$Stopped;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$State$Disconnected$WebSocketEventLost;",
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
