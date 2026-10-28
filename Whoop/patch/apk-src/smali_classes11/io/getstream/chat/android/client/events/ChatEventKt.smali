.class public final Lio/getstream/chat/android/client/events/ChatEventKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0002"
    }
    d2 = {
        "seqGenerator",
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
.field private static final seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/events/ChatEventKt;->seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public static final synthetic access$getSeqGenerator$p()Ljava/util/concurrent/atomic/AtomicInteger;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/events/ChatEventKt;->seqGenerator:Ljava/util/concurrent/atomic/AtomicInteger;

    return-object v0
.end method
