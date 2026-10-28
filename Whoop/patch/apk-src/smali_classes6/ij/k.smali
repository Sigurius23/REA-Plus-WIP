.class public final synthetic Lij/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic y:Ljava/util/concurrent/CountDownLatch;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Landroid/view/View;Ljava/util/List;Ljava/util/concurrent/CountDownLatch;Lio/sentry/v0;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lij/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/k;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lij/k;->z:Ljava/lang/Object;

    iput-object p3, p0, Lij/k;->E:Ljava/lang/Object;

    iput-object p4, p0, Lij/k;->y:Ljava/util/concurrent/CountDownLatch;

    iput-object p5, p0, Lij/k;->F:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;Lb4/g;Lcom/amplitude/quickjs/wrapper/QuickJSContext;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/CountDownLatch;)V
    .locals 1

    .line 2
    const/4 v0, 0x0

    iput v0, p0, Lij/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lij/k;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p2, p0, Lij/k;->E:Ljava/lang/Object;

    iput-object p3, p0, Lij/k;->F:Ljava/lang/Object;

    iput-object p4, p0, Lij/k;->z:Ljava/lang/Object;

    iput-object p5, p0, Lij/k;->y:Ljava/util/concurrent/CountDownLatch;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    iget v0, p0, Lij/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lij/k;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lij/k;->z:Ljava/lang/Object;

    check-cast v1, Landroid/view/View;

    iget-object v2, p0, Lij/k;->E:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, p0, Lij/k;->y:Ljava/util/concurrent/CountDownLatch;

    iget-object v4, p0, Lij/k;->F:Ljava/lang/Object;

    check-cast v4, Lio/sentry/v0;

    :try_start_0
    new-instance v5, Ljava/util/ArrayList;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Lio/sentry/protocol/j0;

    const-string v7, "android_view_system"

    invoke-direct {v6, v7, v5}, Lio/sentry/protocol/j0;-><init>(Ljava/lang/String;Ljava/util/List;)V

    invoke-static {v1}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->c(Landroid/view/View;)Lio/sentry/protocol/k0;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1, v7, v2}, Lio/sentry/android/core/ViewHierarchyEventProcessor;->a(Landroid/view/View;Lio/sentry/protocol/k0;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/util/concurrent/CountDownLatch;->countDown()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Failed to process view hierarchy."

    invoke-interface {v4, v1, v2, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lij/k;->x:Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v1, p0, Lij/k;->E:Ljava/lang/Object;

    check-cast v1, Lb4/g;

    iget-object v2, p0, Lij/k;->F:Ljava/lang/Object;

    check-cast v2, Lcom/amplitude/quickjs/wrapper/QuickJSContext;

    iget-object v3, p0, Lij/k;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/concurrent/atomic/AtomicReference;

    iget-object v4, p0, Lij/k;->y:Ljava/util/concurrent/CountDownLatch;

    :try_start_1
    invoke-virtual {v1, v2}, Lb4/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    goto :goto_2

    :catchall_1
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    :try_start_2
    invoke-virtual {v3, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    :goto_2
    return-void

    :goto_3
    invoke-virtual {v4}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
