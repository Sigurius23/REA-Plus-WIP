.class public final Lio/sentry/featureflags/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/featureflags/b;


# instance fields
.field public volatile w:Ljava/util/concurrent/CopyOnWriteArrayList;


# virtual methods
.method public final clone()Lio/sentry/featureflags/b;
    .locals 3

    .line 2
    new-instance v0, Lio/sentry/featureflags/a;

    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    new-instance v1, Lio/sentry/util/a;

    .line 5
    invoke-direct {v1}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    .line 6
    new-instance v1, Ljava/util/concurrent/CopyOnWriteArrayList;

    iget-object v2, p0, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-direct {v1, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v1, v0, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    return-object v0
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lio/sentry/featureflags/a;->clone()Lio/sentry/featureflags/b;

    move-result-object v0

    return-object v0
.end method

.method public final r()Lio/sentry/protocol/i;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lio/sentry/featureflags/a;->w:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v1, Lio/sentry/protocol/i;

    invoke-direct {v1, v0}, Lio/sentry/protocol/i;-><init>(Ljava/util/List;)V

    return-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lr;->t(Ljava/lang/Object;)V

    const/4 v0, 0x0

    throw v0
.end method
