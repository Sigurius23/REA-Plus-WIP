.class final Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0005\u0008\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\u0015\u0012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rJ7\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0012\"\u000e\u0008\u0000\u0010\u000f*\u0008\u0012\u0004\u0012\u00028\u00000\u000e2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u001aR$\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\t0\u001bj\u0008\u0012\u0004\u0012\u00020\t`\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0011\u0010$\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008\"\u0010#\u00a8\u0006&"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;",
        "",
        "Lkotlin/Function0;",
        "",
        "now",
        "<init>",
        "(Lc93/a;)V",
        "collectionTime",
        "()J",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "",
        "add",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)Z",
        "",
        "R",
        "Lkotlin/Function1;",
        "predicate",
        "",
        "sortedBy",
        "(Lkotlin/jvm/functions/Function1;)Ljava/util/List;",
        "isEmpty",
        "()Z",
        "Ll83/a0;",
        "clear",
        "()V",
        "Lc93/a;",
        "Ljava/util/ArrayList;",
        "Lkotlin/collections/ArrayList;",
        "events",
        "Ljava/util/ArrayList;",
        "collectStartTime",
        "J",
        "",
        "getSize",
        "()I",
        "size",
        "Companion",
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


# static fields
.field private static final Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$Companion;

.field private static final ZERO:J


# instance fields
.field private collectStartTime:J

.field private final events:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation
.end field

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->Companion:Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$Companion;

    return-void
.end method

.method public constructor <init>(Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "now"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->now:Lc93/a;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final add(Lio/getstream/chat/android/client/events/ChatEvent;)Z
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->now:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    iput-wide v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->collectStartTime:J

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->collectStartTime:J

    return-void
.end method

.method public final collectionTime()J
    .locals 5

    iget-wide v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->collectStartTime:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->now:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method

.method public final getSize()I
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final sortedBy(Lkotlin/jvm/functions/Function1;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R::",
            "Ljava/lang/Comparable<",
            "-TR;>;>(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "predicate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed;->events:Ljava/util/ArrayList;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$sortedBy$$inlined$sortedBy$1;

    invoke-direct {v1, p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/Postponed$sortedBy$$inlined$sortedBy$1;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-static {v0, v1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
