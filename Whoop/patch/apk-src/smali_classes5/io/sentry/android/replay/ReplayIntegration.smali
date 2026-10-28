.class public final Lio/sentry/android/replay/ReplayIntegration;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/t1;
.implements Ljava/io/Closeable;
.implements Lio/sentry/v3;
.implements Lio/sentry/o0;
.implements Lio/sentry/transport/p;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0003:\u0002\u0007\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lio/sentry/android/replay/ReplayIntegration;",
        "Lio/sentry/t1;",
        "Ljava/io/Closeable;",
        "",
        "Lio/sentry/v3;",
        "Lio/sentry/o0;",
        "Lio/sentry/transport/p;",
        "io/sentry/android/replay/n",
        "io/sentry/j0",
        "sentry-android-replay_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final synthetic R:I


# instance fields
.field public E:Lio/sentry/i4;

.field public F:Lio/sentry/android/replay/e0;

.field public G:Lio/sentry/android/replay/gestures/b;

.field public final H:Ll83/p;

.field public final I:Ll83/p;

.field public final J:Ll83/p;

.field public final K:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final L:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public M:Lio/sentry/android/replay/capture/l;

.field public N:Lio/sentry/u3;

.field public final O:Laj/c;

.field public final P:Lio/sentry/util/a;

.field public final Q:Lio/sentry/android/replay/p;

.field public final w:Landroid/content/Context;

.field public final x:Lio/sentry/transport/d;

.field public volatile y:Lio/sentry/n0;

.field public z:Lio/sentry/q6;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    invoke-static {}, Lio/sentry/l5;->d()Lio/sentry/l5;

    move-result-object v0

    const-string v1, "maven:io.sentry:sentry-android-replay"

    const-string v2, "8.41.0"

    invoke-virtual {v0, v1, v2}, Lio/sentry/l5;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    sget-object v0, Lio/sentry/transport/d;->w:Lio/sentry/transport/d;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Landroid/content/Context;

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->x:Lio/sentry/transport/d;

    sget-object p1, Lio/sentry/n0;->UNKNOWN:Lio/sentry/n0;

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->y:Lio/sentry/n0;

    sget-object p1, Lio/sentry/android/replay/a;->y:Lio/sentry/android/replay/a;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->H:Ll83/p;

    sget-object p1, Lio/sentry/android/replay/a;->z:Lio/sentry/android/replay/a;

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    new-instance p1, La3/l0;

    const/16 v0, 0xd

    invoke-direct {p1, p0, v0}, La3/l0;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->J:Ll83/p;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v0, 0x0

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object p1, Lio/sentry/v2;->a:Lio/sentry/v2;

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->N:Lio/sentry/u3;

    new-instance p1, Laj/c;

    const/16 v0, 0x10

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Laj/c;-><init>(IB)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->O:Laj/c;

    new-instance p1, Lio/sentry/util/a;

    invoke-direct {p1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    new-instance p1, Lio/sentry/android/replay/p;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/sentry/android/replay/q;->INITIAL:Lio/sentry/android/replay/q;

    iput-object v0, p1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    return-void
.end method


# virtual methods
.method public final J()Lio/sentry/u3;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->N:Lio/sentry/u3;

    return-object v0
.end method

.method public final T(Ljava/lang/String;)V
    .locals 8

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/sentry/q6;->getCacheDirPath()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v6, "replay_"

    invoke-static {v5, v6, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v6

    if-eqz v6, :cond_1

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->s()Lio/sentry/protocol/v;

    move-result-object v6

    invoke-virtual {v6}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v6

    const-string v7, "toString(...)"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5, v6, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v6

    if-nez v6, :cond_1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_0

    invoke-static {v5, p1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v5

    if-nez v5, :cond_1

    :cond_0
    invoke-static {v4}, Lge3/g;->r(Ljava/io/File;)Z

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    const-string p1, "options"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final a0()Z
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v0, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v1, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v0, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object v1, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v0

    if-gez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final b(Lio/sentry/n0;)V
    .locals 1

    const-string v0, "status"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->y:Lio/sentry/n0;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    instance-of v0, v0, Lio/sentry/android/replay/capture/o;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    if-ne p1, v0, :cond_1

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->p0()V

    return-void

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->x0()V

    return-void
.end method

.method public final b0(Landroid/graphics/Bitmap;)V
    .locals 4

    const-string v0, "bitmap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    if-eqz v1, :cond_0

    new-instance v2, Lio/sentry/android/replay/m;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lio/sentry/android/replay/m;-><init>(Lkotlin/jvm/internal/g0;I)V

    invoke-virtual {v1, v2}, Lio/sentry/i4;->s(Lio/sentry/e4;)V

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v1, :cond_1

    new-instance v2, Lc4/q;

    const/4 v3, 0x3

    invoke-direct {v2, v3, p1, v0}, Lc4/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Lio/sentry/android/replay/capture/l;->d(Lc4/q;)V

    :cond_1
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    instance-of p1, p1, Lio/sentry/android/replay/capture/o;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->y:Lio/sentry/n0;

    sget-object v0, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    const/4 v0, 0x1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object p1

    if-eqz p1, :cond_2

    sget-object v1, Lio/sentry/m;->All:Lio/sentry/m;

    invoke-virtual {p1, v1}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result p1

    if-ne p1, v0, :cond_2

    goto :goto_0

    :cond_2
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object p1

    if-eqz p1, :cond_4

    sget-object v1, Lio/sentry/m;->Replay:Lio/sentry/m;

    invoke-virtual {p1, v1}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result p1

    if-ne p1, v0, :cond_4

    :cond_3
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->p0()V

    :cond_4
    return-void
.end method

.method public final close()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_4

    sget-object v2, Lio/sentry/android/replay/q;->CLOSED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object v4

    invoke-interface {v4, p0}, Lio/sentry/p0;->W0(Lio/sentry/o0;)V

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object v4

    if-eqz v4, :cond_1

    iget-object v4, v4, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v4, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->stop()V

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lio/sentry/android/replay/e0;->close()V

    :cond_2
    iput-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/t;

    invoke-virtual {v4}, Lio/sentry/android/replay/t;->close()V

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->J:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/util/d;

    invoke-virtual {v4}, Lio/sentry/android/replay/util/d;->shutdown()V

    iput-object v2, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :try_start_1
    const-string v0, "options"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_4
    :goto_1
    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_2
    throw v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final h(Lio/sentry/android/replay/d;)V
    .locals 0

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->N:Lio/sentry/u3;

    return-void
.end method

.method public final i(Ljava/lang/Boolean;)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->a0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v1, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {v0, v1}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Replay id is not set, not capturing for event"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_2
    const-string p1, "options"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v0, :cond_4

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    new-instance v1, La0/a1;

    const/16 v3, 0x1c

    invoke-direct {v1, p0, v3}, La0/a1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, p1, v1}, Lio/sentry/android/replay/capture/l;->e(ZLa0/a1;)V

    :cond_4
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz p1, :cond_5

    invoke-interface {p1}, Lio/sentry/android/replay/capture/l;->b()Lio/sentry/android/replay/capture/l;

    move-result-object v2

    :cond_5
    iput-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    :cond_6
    :goto_1
    return-void
.end method

.method public final k(Lio/sentry/transport/q;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    instance-of v0, v0, Lio/sentry/android/replay/capture/o;

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, Lio/sentry/m;->All:Lio/sentry/m;

    invoke-virtual {p1, v0}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lio/sentry/m;->Replay:Lio/sentry/m;

    invoke-virtual {p1, v0}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->x0()V

    return-void

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->p0()V

    return-void
.end method

.method public final m(Lio/sentry/q6;)V
    .locals 7

    iput-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/u6;->e:Ljava/lang/Double;

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    cmpl-double v0, v3, v1

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-object v0, v0, Lio/sentry/u6;->f:Ljava/lang/Double;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    cmpl-double v0, v3, v1

    if-lez v0, :cond_4

    :goto_0
    sget-object v0, Lio/sentry/i4;->a:Lio/sentry/i4;

    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    new-instance v1, Lio/sentry/android/replay/e0;

    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->J:Ll83/p;

    invoke-virtual {v2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v6, v2

    check-cast v6, Lio/sentry/android/replay/util/d;

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->O:Laj/c;

    move-object v4, p0

    move-object v3, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lio/sentry/android/replay/e0;-><init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/android/replay/ReplayIntegration;Laj/c;Lio/sentry/android/replay/util/d;)V

    iput-object v1, v3, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    new-instance p1, Lio/sentry/android/replay/gestures/b;

    invoke-direct {p1, v2, p0}, Lio/sentry/android/replay/gestures/b;-><init>(Lio/sentry/q6;Lio/sentry/android/replay/ReplayIntegration;)V

    iput-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->G:Lio/sentry/android/replay/gestures/b;

    iget-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {v2}, Lio/sentry/q6;->getConnectionStatusProvider()Lio/sentry/p0;

    move-result-object p1

    invoke-interface {p1, p0}, Lio/sentry/p0;->K0(Lio/sentry/o0;)Z

    invoke-virtual {v0}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p1, Lio/sentry/transport/q;->z:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    :cond_1
    const-string p1, "Replay"

    invoke-static {p1}, Ljc/x;->i(Ljava/lang/String;)V

    iget-object p1, v3, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    const/4 v0, 0x0

    const-string v1, "options"

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lio/sentry/q6;->getExecutorService()Lio/sentry/h1;

    move-result-object p1

    const-string v2, "getExecutorService(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v3, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v2, :cond_2

    new-instance v0, Lio/sentry/c7;

    const/16 v1, 0xa

    invoke-direct {v0, p0, v1}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1, v2, v0}, Lvp/c;->n0(Lio/sentry/h1;Lio/sentry/q6;Lio/sentry/c7;)V

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_4
    move-object v3, p0

    move-object v2, p1

    invoke-virtual {v2}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Session replay is disabled, no sample rate specified"

    invoke-interface {p1, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final o0(II)V
    .locals 4

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->a0()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    const/4 v1, 0x0

    const-string v2, "options"

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v0

    iget-boolean v0, v0, Lio/sentry/u6;->l:Z

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->w:Landroid/content/Context;

    iget-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v1

    const-string v2, "getSessionReplay(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1, p1, p2}, Lv8/b;->q(Landroid/content/Context;Lio/sentry/u6;II)Lio/sentry/android/replay/w;

    move-result-object p1

    iget-object p2, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->a0()Z

    move-result p2

    if-nez p2, :cond_1

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz p2, :cond_2

    invoke-interface {p2, p1}, Lio/sentry/android/replay/capture/l;->a(Lio/sentry/android/replay/w;)V

    :cond_2
    iget-object p2, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz p2, :cond_3

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/e0;->k(Lio/sentry/android/replay/w;)V

    :cond_3
    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object p1, p1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    sget-object p2, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    if-ne p1, p2, :cond_6

    iget-object p1, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lio/sentry/android/replay/e0;->m()V

    return-void

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    :goto_0
    return-void
.end method

.method public final p0()V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    sget-object v2, Lio/sentry/android/replay/q;->PAUSED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/sentry/android/replay/e0;->m()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_1
    :goto_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v4, :cond_2

    invoke-interface {v4}, Lio/sentry/android/replay/capture/l;->pause()V

    :cond_2
    iput-object v2, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_3
    :goto_1
    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final pause()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->p0()V

    return-void
.end method

.method public final resume()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-virtual {p0}, Lio/sentry/android/replay/ReplayIntegration;->x0()V

    return-void
.end method

.method public final s()Lio/sentry/protocol/v;
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v0, :cond_1

    check-cast v0, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v0}, Lio/sentry/android/replay/capture/c;->g()Lio/sentry/protocol/v;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    return-object v0

    :cond_1
    :goto_0
    sget-object v0, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    const-string v1, "EMPTY_ID"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final stop()V
    .locals 7

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    sget-object v2, Lio/sentry/android/replay/q;->STOPPED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v4

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v4, :cond_1

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/t;

    invoke-virtual {v4}, Lio/sentry/android/replay/t;->b()Lio/sentry/android/replay/s;

    move-result-object v4

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    const-string v6, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, v5}, Lio/sentry/android/replay/s;->remove(Ljava/lang/Object;)Z

    :cond_1
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/android/replay/t;

    invoke-virtual {v4}, Lio/sentry/android/replay/t;->b()Lio/sentry/android/replay/s;

    move-result-object v4

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->G:Lio/sentry/android/replay/gestures/b;

    invoke-virtual {v4, v5}, Lio/sentry/android/replay/s;->remove(Ljava/lang/Object;)Z

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Lio/sentry/android/replay/e0;->reset()V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_2
    :goto_0
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lio/sentry/android/replay/e0;->J()V

    :cond_3
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->G:Lio/sentry/android/replay/gestures/b;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lio/sentry/android/replay/gestures/b;->c()V

    :cond_4
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v4, :cond_5

    invoke-interface {v4}, Lio/sentry/android/replay/capture/l;->stop()V

    :cond_5
    iput-object v3, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    iput-object v2, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    :goto_1
    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v1, v0}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public final x()V
    .locals 11

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    invoke-virtual {v1}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v1

    :try_start_0
    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    :try_start_1
    sget-object v2, Lio/sentry/android/replay/q;->STARTED:Lio/sentry/android/replay/q;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v5, 0x0

    const-string v6, "options"

    if-nez v4, :cond_2

    :try_start_2
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v4, "Session replay is already being recorded, not starting a new one"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v0, v2, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :catchall_0
    move-exception v0

    move-object v2, v0

    goto/16 :goto_2

    :cond_1
    :try_start_3
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->H:Ll83/p;

    invoke-virtual {v4}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/util/j;

    iget-object v7, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v7, :cond_d

    invoke-virtual {v7}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    iget-object v7, v7, Lio/sentry/u6;->e:Ljava/lang/Double;

    invoke-static {v4, v7}, Lx30/s0;->E(Lio/sentry/util/j;Ljava/lang/Double;)Z

    move-result v4

    if-nez v4, :cond_6

    iget-object v7, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v7, :cond_5

    invoke-virtual {v7}, Lio/sentry/q6;->getSessionReplay()Lio/sentry/u6;

    move-result-object v7

    iget-object v7, v7, Lio/sentry/u6;->f:Ljava/lang/Double;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_3

    const/4 v7, 0x1

    goto :goto_0

    :cond_3
    move v7, v5

    :goto_0
    if-nez v7, :cond_6

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v2, Lio/sentry/n5;->INFO:Lio/sentry/n5;

    const-string v4, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified"

    new-array v5, v5, [Ljava/lang/Object;

    invoke-interface {v0, v2, v4, v5}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_4
    :try_start_4
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    iput-object v2, v0, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    if-eqz v4, :cond_8

    new-instance v0, Lio/sentry/android/replay/capture/o;

    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v2, :cond_7

    iget-object v4, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->x:Lio/sentry/transport/d;

    iget-object v6, p0, Lio/sentry/android/replay/ReplayIntegration;->J:Ll83/p;

    invoke-virtual {v6}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/android/replay/util/d;

    invoke-direct {v0, v2, v4, v5, v6}, Lio/sentry/android/replay/capture/o;-><init>(Lio/sentry/q6;Lio/sentry/d1;Lio/sentry/transport/f;Ljava/util/concurrent/ScheduledExecutorService;)V

    goto :goto_1

    :cond_7
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    new-instance v4, Lio/sentry/android/replay/capture/f;

    iget-object v5, p0, Lio/sentry/android/replay/ReplayIntegration;->z:Lio/sentry/q6;

    if-eqz v5, :cond_c

    iget-object v6, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    iget-object v7, p0, Lio/sentry/android/replay/ReplayIntegration;->x:Lio/sentry/transport/d;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->H:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lio/sentry/util/j;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->J:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lio/sentry/android/replay/util/d;

    invoke-direct/range {v4 .. v9}, Lio/sentry/android/replay/capture/f;-><init>(Lio/sentry/q6;Lio/sentry/i4;Lio/sentry/transport/d;Lio/sentry/util/j;Lio/sentry/android/replay/util/d;)V

    move-object v0, v4

    :goto_1
    iput-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lio/sentry/android/replay/e0;->x()V

    :cond_9
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v0, :cond_a

    invoke-static {v0}, Lvd/f;->Q(Lio/sentry/android/replay/capture/l;)V

    :cond_a
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v0, :cond_b

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/t;

    invoke-virtual {v0}, Lio/sentry/android/replay/t;->b()Lio/sentry/android/replay/s;

    move-result-object v0

    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    const-string v4, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/s;->add(Ljava/lang/Object;)Z

    :cond_b
    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->I:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/android/replay/t;

    invoke-virtual {v0}, Lio/sentry/android/replay/t;->b()Lio/sentry/android/replay/s;

    move-result-object v0

    iget-object v2, p0, Lio/sentry/android/replay/ReplayIntegration;->G:Lio/sentry/android/replay/gestures/b;

    invoke-virtual {v0, v2}, Lio/sentry/android/replay/s;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    invoke-static {v1, v3}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_c
    :try_start_5
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_d
    invoke-static {v6}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_2
    :try_start_6
    throw v2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {v1, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v0
.end method

.method public final x0()V
    .locals 6

    iget-object v0, p0, Lio/sentry/android/replay/ReplayIntegration;->P:Lio/sentry/util/a;

    invoke-virtual {v0}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->K:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    sget-object v3, Lio/sentry/android/replay/q;->RESUMED:Lio/sentry/android/replay/q;

    invoke-virtual {v1, v3}, Lio/sentry/android/replay/p;->a(Lio/sentry/android/replay/q;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->L:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    if-nez v1, :cond_5

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->y:Lio/sentry/n0;

    sget-object v4, Lio/sentry/n0;->DISCONNECTED:Lio/sentry/n0;

    if-eq v1, v4, :cond_5

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    const/4 v4, 0x1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object v1

    if-eqz v1, :cond_1

    sget-object v5, Lio/sentry/m;->All:Lio/sentry/m;

    invoke-virtual {v1, v5}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result v1

    if-ne v1, v4, :cond_1

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->E:Lio/sentry/i4;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/sentry/i4;->j()Lio/sentry/transport/q;

    move-result-object v1

    if-eqz v1, :cond_2

    sget-object v5, Lio/sentry/m;->Replay:Lio/sentry/m;

    invoke-virtual {v1, v5}, Lio/sentry/transport/q;->h(Lio/sentry/m;)Z

    move-result v1

    if-ne v1, v4, :cond_2

    goto :goto_0

    :cond_2
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->Q:Lio/sentry/android/replay/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object v3, v1, Lio/sentry/android/replay/p;->a:Lio/sentry/android/replay/q;

    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->M:Lio/sentry/android/replay/capture/l;

    if-eqz v1, :cond_3

    check-cast v1, Lio/sentry/android/replay/capture/c;

    invoke-virtual {v1}, Lio/sentry/android/replay/capture/c;->j()V

    :cond_3
    iget-object v1, p0, Lio/sentry/android/replay/ReplayIntegration;->F:Lio/sentry/android/replay/e0;

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lio/sentry/android/replay/e0;->s()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_4
    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_5
    :goto_0
    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :cond_6
    :goto_1
    invoke-static {v0, v2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return-void

    :goto_2
    :try_start_1
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v2

    invoke-static {v0, v1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw v2
.end method
