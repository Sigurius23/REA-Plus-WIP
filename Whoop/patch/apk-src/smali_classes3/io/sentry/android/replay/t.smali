.class public final Lio/sentry/android/replay/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final w:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final x:Lio/sentry/util/a;

.field public final y:Lio/sentry/android/replay/s;

.field public final z:Lio/sentry/android/replay/r;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object v0, p0, Lio/sentry/android/replay/t;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance v0, Lio/sentry/util/a;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/sentry/android/replay/t;->x:Lio/sentry/util/a;

    new-instance v0, Lio/sentry/android/replay/s;

    invoke-direct {v0, p0}, Lio/sentry/android/replay/s;-><init>(Lio/sentry/android/replay/t;)V

    iput-object v0, p0, Lio/sentry/android/replay/t;->y:Lio/sentry/android/replay/s;

    new-instance v0, Lio/sentry/android/replay/r;

    invoke-direct {v0, p0}, Lio/sentry/android/replay/r;-><init>(Lio/sentry/android/replay/t;)V

    iput-object v0, p0, Lio/sentry/android/replay/t;->z:Lio/sentry/android/replay/r;

    return-void
.end method


# virtual methods
.method public final b()Lio/sentry/android/replay/s;
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/t;->y:Lio/sentry/android/replay/s;

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/t;->w:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v0, p0, Lio/sentry/android/replay/t;->y:Lio/sentry/android/replay/s;

    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    return-void
.end method
