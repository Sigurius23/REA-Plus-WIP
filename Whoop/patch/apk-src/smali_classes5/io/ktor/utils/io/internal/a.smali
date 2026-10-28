.class public final Lio/ktor/utils/io/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final w:Lbc3/k1;

.field public x:Lbc3/s0;

.field public final synthetic y:Lio/ktor/utils/io/internal/b;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/internal/b;Lbc3/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/internal/a;->y:Lio/ktor/utils/io/internal/b;

    iput-object p2, p0, Lio/ktor/utils/io/internal/a;->w:Lbc3/k1;

    const/4 p1, 0x1

    invoke-interface {p2, p1, p1, p0}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    invoke-interface {p2}, Lbc3/k1;->isActive()Z

    move-result p2

    if-eqz p2, :cond_0

    iput-object p1, p0, Lio/ktor/utils/io/internal/a;->x:Lbc3/s0;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lio/ktor/utils/io/internal/a;->x:Lbc3/s0;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-object v1, p0, Lio/ktor/utils/io/internal/a;->x:Lbc3/s0;

    invoke-interface {v0}, Lbc3/s0;->dispose()V

    :cond_0
    return-void
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Lio/ktor/utils/io/internal/b;->x:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_0
    iget-object v1, p0, Lio/ktor/utils/io/internal/a;->y:Lio/ktor/utils/io/internal/b;

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p0, v2}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eq v2, p0, :cond_0

    :goto_0
    invoke-virtual {p0}, Lio/ktor/utils/io/internal/a;->a()V

    if-eqz p1, :cond_2

    iget-object v0, p0, Lio/ktor/utils/io/internal/a;->w:Lbc3/k1;

    invoke-static {v1, v0, p1}, Lio/ktor/utils/io/internal/b;->a(Lio/ktor/utils/io/internal/b;Lbc3/k1;Ljava/lang/Throwable;)V

    :cond_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
