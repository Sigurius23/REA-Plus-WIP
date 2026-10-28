.class public final Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u0000*\u0004\u0008\u0000\u0010\u00012\u00020\u0002B-\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0011J!\u0010\u0017\u001a\u00020\u000f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!R\u001a\u0010$\u001a\u0008\u0012\u0004\u0012\u00028\u00000#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0016\u0010\u0014\u001a\u00020&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\'R$\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;",
        "T",
        "",
        "",
        "suffix",
        "",
        "bufferLimit",
        "Lec3/f2;",
        "",
        "customTrigger",
        "<init>",
        "(Ljava/lang/String;ILec3/f2;)V",
        "aboveSafetyThreshold",
        "()Z",
        "src",
        "Ll83/a0;",
        "propagateData",
        "(Ljava/lang/String;)V",
        "hold",
        "()V",
        "active",
        "Lkotlin/Function1;",
        "func",
        "subscribe",
        "(Lkotlin/jvm/functions/Function1;)V",
        "data",
        "enqueueData",
        "(Ljava/lang/Object;)V",
        "I",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Ljava/util/Queue;",
        "events",
        "Ljava/util/Queue;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private active:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final bufferLimit:I

.field private final events:Ljava/util/Queue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Queue<",
            "TT;>;"
        }
    .end annotation
.end field

.field private func:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;-><init>(Ljava/lang/String;ILec3/f2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILec3/f2;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lec3/f2;",
            ")V"
        }
    .end annotation

    const-string v0, "suffix"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p2, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->bufferLimit:I

    .line 4
    const-string p2, "Chat:StartStopBuffer-"

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->logger$delegate:Ll83/h;

    .line 5
    new-instance p1, Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->events:Ljava/util/Queue;

    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance p2, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;

    const/4 v0, 0x0

    invoke-direct {p2, p3, p0, v0}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$1;-><init>(Lec3/f2;Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

    const/4 p3, 0x3

    invoke-static {p1, v0, v0, p2, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;ILec3/f2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 8
    const-string p1, "Default"

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, -0x1

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    .line 9
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;-><init>(Ljava/lang/String;ILec3/f2;)V

    return-void
.end method

.method private final aboveSafetyThreshold()Z
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->events:Ljava/util/Queue;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    iget v1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->bufferLimit:I

    if-le v0, v1, :cond_0

    const/4 v0, -0x1

    if-eq v1, v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static final synthetic access$aboveSafetyThreshold(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Z
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->aboveSafetyThreshold()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$getActive$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic access$getEvents$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Ljava/util/Queue;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->events:Ljava/util/Queue;

    return-object p0
.end method

.method public static final synthetic access$getFunc$p(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Lkotlin/jvm/functions/Function1;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->func:Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final propagateData(Ljava/lang/String;)V
    .locals 3

    sget-object p1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getIO()Lbc3/z;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    new-instance v0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer$propagateData$1;-><init>(Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method


# virtual methods
.method public final active(Ljava/lang/String;)V
    .locals 2

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->func:Lkotlin/jvm/functions/Function1;

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->propagateData(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final enqueueData(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->events:Ljava/util/Queue;

    invoke-interface {v0, p1}, Ljava/util/Queue;->offer(Ljava/lang/Object;)Z

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_1

    invoke-direct {p0}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->aboveSafetyThreshold()Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    const-string p1, "enqueue"

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->propagateData(Ljava/lang/String;)V

    return-void
.end method

.method public final hold()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final subscribe(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "func"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->func:Lkotlin/jvm/functions/Function1;

    iget-object p1, p0, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->active:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-eqz p1, :cond_0

    const-string p1, "subscribe"

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/utils/buffer/StartStopBuffer;->propagateData(Ljava/lang/String;)V

    :cond_0
    return-void
.end method
