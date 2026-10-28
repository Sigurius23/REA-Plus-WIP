.class public final Lio/sentry/o7;
.super Lio/sentry/hints/c;
.source "SourceFile"

# interfaces
.implements Lio/sentry/hints/i;
.implements Lio/sentry/hints/l;


# instance fields
.field public final z:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(JLio/sentry/v0;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/sentry/hints/c;-><init>(JLio/sentry/v0;)V

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    iput-object p1, p0, Lio/sentry/o7;->z:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final f(Lio/sentry/protocol/v;)Z
    .locals 1

    iget-object v0, p0, Lio/sentry/o7;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/v;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lio/sentry/protocol/v;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final g(Lio/sentry/protocol/v;)V
    .locals 1

    iget-object v0, p0, Lio/sentry/o7;->z:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    return-void
.end method
