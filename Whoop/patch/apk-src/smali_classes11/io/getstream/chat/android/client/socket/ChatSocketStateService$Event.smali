.class abstract Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/client/socket/ChatSocketStateService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "Event"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;,
        Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00082\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\u0008\t\n\u000b\u000c\rB\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event;",
        "",
        "<init>",
        "()V",
        "Connect",
        "ConnectionEstablished",
        "WebSocketEventLost",
        "NetworkNotAvailable",
        "NetworkAvailable",
        "UnrecoverableError",
        "NetworkError",
        "RequiredDisconnection",
        "Stop",
        "Resume",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Connect;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$ConnectionEstablished;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkAvailable;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkError;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$NetworkNotAvailable;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$RequiredDisconnection;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Resume;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$Stop;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$UnrecoverableError;",
        "Lio/getstream/chat/android/client/socket/ChatSocketStateService$Event$WebSocketEventLost;",
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
