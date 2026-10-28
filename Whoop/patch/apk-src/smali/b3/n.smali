.class public final synthetic Lb3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lb3/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lio/seon/androidsdk/service/n;)V
    .locals 0

    .line 2
    const/4 p1, 0x4

    iput p1, p0, Lb3/n;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    iget v0, p0, Lb3/n;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    sget-object v0, Lio/seon/androidsdk/service/n;->n:Lio/seon/androidsdk/service/r0;

    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-wide v5, v0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v3, v5

    iget-wide v5, v0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v3, v3, v5

    if-gez v3, :cond_0

    iget-wide v3, v0, Lio/seon/androidsdk/service/r0;->b:J

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-nez v3, :cond_1

    :cond_0
    invoke-static {}, Lio/seon/androidsdk/service/n;->h()[Ljava/lang/String;

    move-result-object v3

    iput-object v3, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v1, v0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    :try_start_2
    iget-object v0, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    return-void

    :pswitch_0
    invoke-static {}, Lio/sentry/android/ndk/SentryNdk;->a()V

    return-void

    :pswitch_1
    invoke-static {}, Landroid/os/Process;->myTid()I

    move-result v0

    int-to-long v0, v0

    sput-wide v0, Lio/sentry/android/core/internal/util/e;->b:J

    :pswitch_2
    return-void

    :pswitch_3
    sget-object v0, Landroidx/compose/ui/platform/AndroidComposeView;->k1:La0/q0;

    monitor-enter v0

    :try_start_3
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    const/4 v3, 0x0

    if-ge v1, v2, :cond_3

    iget-object v1, v0, La0/q0;->a:[Ljava/lang/Object;

    iget v2, v0, La0/q0;->b:I

    :goto_0
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    move-result v5

    sget-object v6, Landroidx/compose/ui/platform/AndroidComposeView;->h1:Ljava/lang/Class;

    invoke-static {}, Lb3/o0;->k()Z

    move-result v6

    invoke-virtual {v4, v6}, Landroidx/compose/ui/platform/AndroidComposeView;->setShowLayoutBounds(Z)V

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getShowLayoutBounds()Z

    move-result v6

    if-eq v5, v6, :cond_2

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :catchall_2
    move-exception v1

    goto :goto_2

    :cond_3
    iget-object v1, v0, La0/q0;->a:[Ljava/lang/Object;

    iget v2, v0, La0/q0;->b:I

    :goto_1
    if-ge v3, v2, :cond_4

    aget-object v4, v1, v3

    check-cast v4, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-virtual {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->getRoot()La3/n0;

    move-result-object v4

    invoke-static {v4}, Landroidx/compose/ui/platform/AndroidComposeView;->o(La3/n0;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    monitor-exit v0

    return-void

    :goto_2
    monitor-exit v0

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
