.class public final Lio/getstream/chat/android/core/utils/Debouncer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\t2\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u000f\u001a\u00020\t2\u001c\u0010\n\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0013\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0015R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lio/getstream/chat/android/core/utils/Debouncer;",
        "",
        "",
        "debounceMs",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(JLbc3/c0;)V",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "work",
        "submit",
        "(Lc93/a;)V",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "submitSuspendable",
        "(Lkotlin/jvm/functions/Function1;)V",
        "cancelLastDebounce",
        "()V",
        "shutdown",
        "J",
        "Lbc3/c0;",
        "Lbc3/k1;",
        "job",
        "Lbc3/k1;",
        "stream-chat-android-core"
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
.field private final debounceMs:J

.field private job:Lbc3/k1;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(JLbc3/c0;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-wide p1, p0, Lio/getstream/chat/android/core/utils/Debouncer;->debounceMs:J

    .line 3
    iput-object p3, p0, Lio/getstream/chat/android/core/utils/Debouncer;->scope:Lbc3/c0;

    return-void
.end method

.method public synthetic constructor <init>(JLbc3/c0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 4
    sget-object p3, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {p3}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object p3

    invoke-static {p3}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p3

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/core/utils/Debouncer;-><init>(JLbc3/c0;)V

    return-void
.end method

.method public static final synthetic access$getDebounceMs$p(Lio/getstream/chat/android/core/utils/Debouncer;)J
    .locals 2

    iget-wide v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->debounceMs:J

    return-wide v0
.end method


# virtual methods
.method public final cancelLastDebounce()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->job:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method public final shutdown()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->scope:Lbc3/c0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final submit(Lc93/a;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->job:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/core/utils/Debouncer$submit$1;

    invoke-direct {v2, p0, p1, v1}, Lio/getstream/chat/android/core/utils/Debouncer$submit$1;-><init>(Lio/getstream/chat/android/core/utils/Debouncer;Lc93/a;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/core/utils/Debouncer;->job:Lbc3/k1;

    return-void
.end method

.method public final submitSuspendable(Lkotlin/jvm/functions/Function1;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "work"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->job:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/core/utils/Debouncer;->scope:Lbc3/c0;

    new-instance v2, Lio/getstream/chat/android/core/utils/Debouncer$submitSuspendable$1;

    invoke-direct {v2, p0, p1, v1}, Lio/getstream/chat/android/core/utils/Debouncer$submitSuspendable$1;-><init>(Lio/getstream/chat/android/core/utils/Debouncer;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v1, v1, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/core/utils/Debouncer;->job:Lbc3/k1;

    return-void
.end method
