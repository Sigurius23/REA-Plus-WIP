.class public abstract Lio/getstream/chat/android/client/events/ChatEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00086\u0018\u00002\u00020\u0001B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0012\u0010\u0008\u001a\u00020\tX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\n\u0010\u000bR\u0014\u0010\u000c\u001a\u0004\u0018\u00010\u0005X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u0082\u0001\u0013\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "",
        "<init>",
        "()V",
        "type",
        "",
        "getType",
        "()Ljava/lang/String;",
        "createdAt",
        "Ljava/util/Date;",
        "getCreatedAt",
        "()Ljava/util/Date;",
        "rawCreatedAt",
        "getRawCreatedAt",
        "seq",
        "",
        "getSeq",
        "()I",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "Lio/getstream/chat/android/client/events/ConnectedEvent;",
        "Lio/getstream/chat/android/client/events/ConnectingEvent;",
        "Lio/getstream/chat/android/client/events/ConnectionErrorEvent;",
        "Lio/getstream/chat/android/client/events/DisconnectedEvent;",
        "Lio/getstream/chat/android/client/events/DraftMessageDeletedEvent;",
        "Lio/getstream/chat/android/client/events/DraftMessageUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/ErrorEvent;",
        "Lio/getstream/chat/android/client/events/GlobalUserBannedEvent;",
        "Lio/getstream/chat/android/client/events/GlobalUserUnbannedEvent;",
        "Lio/getstream/chat/android/client/events/HealthEvent;",
        "Lio/getstream/chat/android/client/events/MarkAllReadEvent;",
        "Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/NotificationMutesUpdatedEvent;",
        "Lio/getstream/chat/android/client/events/UnknownEvent;",
        "Lio/getstream/chat/android/client/events/UserDeletedEvent;",
        "Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;",
        "Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;",
        "Lio/getstream/chat/android/client/events/UserUpdatedEvent;",
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
.field private final seq:I


# direct methods
.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lio/getstream/chat/android/client/events/ChatEventKt;->access$getSeqGenerator$p()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/client/events/ChatEvent;->seq:I

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lio/getstream/chat/android/client/events/ChatEvent;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract getCreatedAt()Ljava/util/Date;
.end method

.method public abstract getRawCreatedAt()Ljava/lang/String;
.end method

.method public final getSeq()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/events/ChatEvent;->seq:I

    return v0
.end method

.method public abstract getType()Ljava/lang/String;
.end method
