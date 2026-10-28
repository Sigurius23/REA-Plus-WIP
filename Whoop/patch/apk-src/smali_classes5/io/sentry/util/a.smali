.class public final Lio/sentry/util/a;
.super Ljava/util/concurrent/locks/ReentrantLock;
.source "SourceFile"


# virtual methods
.method public final a()Lio/sentry/s;
    .locals 2

    invoke-virtual {p0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    new-instance v0, Lio/sentry/s;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lio/sentry/s;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method
