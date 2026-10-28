.class public final Lio/getstream/chat/android/client/StreamLifecycleObserver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/DefaultLifecycleObserver;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#\u00a8\u0006$"
    }
    d2 = {
        "Lio/getstream/chat/android/client/StreamLifecycleObserver;",
        "Landroidx/lifecycle/DefaultLifecycleObserver;",
        "Lbc3/c0;",
        "scope",
        "Landroidx/lifecycle/x;",
        "lifecycle",
        "<init>",
        "(Lbc3/c0;Landroidx/lifecycle/x;)V",
        "Lio/getstream/chat/android/client/LifecycleHandler;",
        "handler",
        "Ll83/a0;",
        "observe",
        "(Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)Ljava/lang/Object;",
        "dispose",
        "Landroidx/lifecycle/g0;",
        "owner",
        "onResume",
        "(Landroidx/lifecycle/g0;)V",
        "onStop",
        "Lbc3/c0;",
        "Landroidx/lifecycle/x;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "",
        "recurringResumeEvent",
        "Z",
        "",
        "handlers",
        "Ljava/util/Set;",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "isObserving",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
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
.field private handlers:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "+",
            "Lio/getstream/chat/android/client/LifecycleHandler;",
            ">;"
        }
    .end annotation
.end field

.field private final isObserving:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private final lifecycle:Landroidx/lifecycle/x;

.field private final logger$delegate:Ll83/h;

.field private recurringResumeEvent:Z

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Landroidx/lifecycle/x;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lifecycle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->lifecycle:Landroidx/lifecycle/x;

    const-string p1, "Chat:LifecycleObserver"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->logger$delegate:Ll83/h;

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    iput-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->handlers:Ljava/util/Set;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->isObserving:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-void
.end method

.method public static final synthetic access$getHandlers$p(Lio/getstream/chat/android/client/StreamLifecycleObserver;)Ljava/util/Set;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->handlers:Ljava/util/Set;

    return-object p0
.end method

.method public static final synthetic access$getLifecycle$p(Lio/getstream/chat/android/client/StreamLifecycleObserver;)Landroidx/lifecycle/x;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->lifecycle:Landroidx/lifecycle/x;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/StreamLifecycleObserver;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/StreamLifecycleObserver;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$isObserving$p(Lio/getstream/chat/android/client/StreamLifecycleObserver;)Ljava/util/concurrent/atomic/AtomicBoolean;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->isObserving:Ljava/util/concurrent/atomic/AtomicBoolean;

    return-object p0
.end method

.method public static final synthetic access$setHandlers$p(Lio/getstream/chat/android/client/StreamLifecycleObserver;Ljava/util/Set;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->handlers:Ljava/util/Set;

    return-void
.end method

.method public static final synthetic access$setRecurringResumeEvent$p(Lio/getstream/chat/android/client/StreamLifecycleObserver;Z)V
    .locals 0

    iput-boolean p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->recurringResumeEvent:Z

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final dispose(Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/LifecycleHandler;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/y1;->w:Lbc3/y1;

    sget-object v1, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v1}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v1

    invoke-virtual {v0, v1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/StreamLifecycleObserver$dispose$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/StreamLifecycleObserver$dispose$2;-><init>(Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final observe(Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/LifecycleHandler;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->INSTANCE:Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;

    invoke-virtual {v0}, Lio/getstream/chat/android/core/internal/coroutines/DispatcherProvider;->getMain()Lbc3/z;

    move-result-object v0

    new-instance v1, Lio/getstream/chat/android/client/StreamLifecycleObserver$observe$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/StreamLifecycleObserver$observe$2;-><init>(Lio/getstream/chat/android/client/StreamLifecycleObserver;Lio/getstream/chat/android/client/LifecycleHandler;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final onResume(Landroidx/lifecycle/g0;)V
    .locals 6

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/StreamLifecycleObserver;->getLogger()Lb23/k;

    move-result-object v0

    invoke-virtual {v0}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v2, Lb23/g;->y:Lb23/g;

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {v0}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v0

    iget-boolean v3, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->recurringResumeEvent:Z

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[onResume] owner: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, ", recurringResumeEvent: "

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, v2, v0, p1}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-boolean p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->recurringResumeEvent:Z

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->scope:Lbc3/c0;

    new-instance v0, Lio/getstream/chat/android/client/StreamLifecycleObserver$onResume$2;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lio/getstream/chat/android/client/StreamLifecycleObserver$onResume$2;-><init>(Lio/getstream/chat/android/client/StreamLifecycleObserver;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_1
    const/4 p1, 0x1

    iput-boolean p1, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->recurringResumeEvent:Z

    return-void
.end method

.method public final onStop(Landroidx/lifecycle/g0;)V
    .locals 3

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/StreamLifecycleObserver;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/StreamLifecycleObserver$onStop$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/client/StreamLifecycleObserver$onStop$1;-><init>(Lio/getstream/chat/android/client/StreamLifecycleObserver;Landroidx/lifecycle/g0;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
