.class public final Lio/seon/androidsdk/service/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public volatile a:Ljava/lang/Object;

.field public volatile b:J

.field public final c:J

.field public final d:Ljava/util/concurrent/locks/ReentrantLock;


# direct methods
.method public constructor <init>(J)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lio/seon/androidsdk/service/r0;->b:J

    new-instance v0, Ljava/util/concurrent/locks/ReentrantLock;

    invoke-direct {v0}, Ljava/util/concurrent/locks/ReentrantLock;-><init>()V

    iput-object v0, p0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    iput-wide p1, p0, Lio/seon/androidsdk/service/r0;->c:J

    return-void
.end method


# virtual methods
.method public final a(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v2, v4

    iget-wide v4, p0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v2, v2, v4

    if-gez v2, :cond_0

    iget-wide v2, p0, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v4, -0x1

    cmp-long v2, v2, v4

    if-nez v2, :cond_1

    :cond_0
    invoke-interface {p1}, Lio/seon/androidsdk/service/t0;->a()Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v0, p0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    iget-object p1, p0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    iget-object p1, p0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    return-object p1
.end method
