.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000cR\u0011\u0010\u0012\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u000f\u00a8\u0006\u0013"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
        "",
        "id",
        "",
        "sortedEvents",
        "",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "isFromHistorySync",
        "",
        "<init>",
        "(ILjava/util/List;Z)V",
        "getId",
        "()I",
        "getSortedEvents",
        "()Ljava/util/List;",
        "()Z",
        "size",
        "getSize",
        "isFromSocketConnection",
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
.field private final id:I

.field private final isFromHistorySync:Z

.field private final isFromSocketConnection:Z

.field private final size:I

.field private final sortedEvents:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(ILjava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;Z)V"
        }
    .end annotation

    const-string v0, "sortedEvents"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->id:I

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->sortedEvents:Ljava/util/List;

    .line 4
    iput-boolean p3, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromHistorySync:Z

    .line 5
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result p1

    iput p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->size:I

    xor-int/lit8 p1, p3, 0x1

    .line 6
    iput-boolean p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromSocketConnection:Z

    return-void
.end method

.method public synthetic constructor <init>(ILjava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    .line 7
    invoke-static {}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEventKt;->access$getIdGenerator$p()Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result p1

    .line 8
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;-><init>(ILjava/util/List;Z)V

    return-void
.end method


# virtual methods
.method public final getId()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->id:I

    return v0
.end method

.method public final getSize()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->size:I

    return v0
.end method

.method public final getSortedEvents()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->sortedEvents:Ljava/util/List;

    return-object v0
.end method

.method public final isFromHistorySync()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromHistorySync:Z

    return v0
.end method

.method public final isFromSocketConnection()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->isFromSocketConnection:Z

    return v0
.end method
