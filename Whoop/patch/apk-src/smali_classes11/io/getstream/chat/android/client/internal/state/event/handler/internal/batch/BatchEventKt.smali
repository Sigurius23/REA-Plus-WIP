.class public final Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "idGenerator",
        "Ljava/util/concurrent/atomic/AtomicInteger;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEventKt;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static final synthetic access$getIdGenerator$p()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEventKt;->idGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method
