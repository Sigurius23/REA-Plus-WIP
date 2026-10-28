.class public final Lio/ktor/utils/io/jvm/javaio/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq83/d;


# instance fields
.field public final w:Lq83/j;

.field public final synthetic x:Lio/ktor/utils/io/jvm/javaio/b;


# direct methods
.method public constructor <init>(Lio/ktor/utils/io/jvm/javaio/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/a;->x:Lio/ktor/utils/io/jvm/javaio/b;

    iget-object p1, p1, Lio/ktor/utils/io/jvm/javaio/b;->a:Lbc3/k1;

    if-eqz p1, :cond_0

    sget-object v0, Lio/ktor/utils/io/jvm/javaio/k;->w:Lio/ktor/utils/io/jvm/javaio/k;

    invoke-virtual {v0, p1}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p1, Lio/ktor/utils/io/jvm/javaio/k;->w:Lio/ktor/utils/io/jvm/javaio/k;

    :goto_0
    iput-object p1, p0, Lio/ktor/utils/io/jvm/javaio/a;->w:Lq83/j;

    return-void
.end method


# virtual methods
.method public final getContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/jvm/javaio/a;->w:Lq83/j;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 7

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :cond_0
    iget-object v1, p0, Lio/ktor/utils/io/jvm/javaio/a;->x:Lio/ktor/utils/io/jvm/javaio/b;

    :cond_1
    iget-object v2, v1, Lio/ktor/utils/io/jvm/javaio/b;->state:Ljava/lang/Object;

    instance-of v3, v2, Ljava/lang/Thread;

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    move v5, v4

    goto :goto_0

    :cond_2
    instance-of v5, v2, Lq83/d;

    :goto_0
    if-eqz v5, :cond_3

    move v5, v4

    goto :goto_1

    :cond_3
    invoke-static {v2, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    :goto_1
    if-eqz v5, :cond_a

    sget-object v5, Lio/ktor/utils/io/jvm/javaio/b;->f:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    :cond_4
    invoke-virtual {v5, v1, v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual {v5, v1}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    if-eq v6, v2, :cond_4

    const/4 v4, 0x0

    :goto_2
    if-eqz v4, :cond_1

    if-eqz v3, :cond_7

    sget-object v0, Lio/ktor/utils/io/jvm/javaio/j;->a:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/ktor/utils/io/jvm/javaio/i;

    if-nez v0, :cond_6

    sget-object v0, Lio/ktor/utils/io/jvm/javaio/e;->b:Lio/ktor/utils/io/jvm/javaio/e;

    :cond_6
    invoke-interface {v0, v2}, Lio/ktor/utils/io/jvm/javaio/i;->b(Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    instance-of v0, v2, Lq83/d;

    if-eqz v0, :cond_8

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v0

    if-eqz v0, :cond_8

    check-cast v2, Lq83/d;

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-interface {v2, v0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_8
    :goto_3
    instance-of v0, p1, Ll83/m;

    if-eqz v0, :cond_9

    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    instance-of p1, p1, Ljava/util/concurrent/CancellationException;

    if-nez p1, :cond_9

    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/a;->x:Lio/ktor/utils/io/jvm/javaio/b;

    iget-object p1, p1, Lio/ktor/utils/io/jvm/javaio/b;->a:Lbc3/k1;

    if-eqz p1, :cond_9

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_9
    iget-object p1, p0, Lio/ktor/utils/io/jvm/javaio/a;->x:Lio/ktor/utils/io/jvm/javaio/b;

    iget-object p1, p1, Lio/ktor/utils/io/jvm/javaio/b;->c:Lbc3/s0;

    if-eqz p1, :cond_a

    invoke-interface {p1}, Lbc3/s0;->dispose()V

    :cond_a
    return-void
.end method
