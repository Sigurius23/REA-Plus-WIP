.class public final synthetic Lio/sentry/android/core/internal/util/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lio/sentry/android/core/internal/util/q;

.field public final synthetic y:Landroid/view/Window;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/core/internal/util/q;Landroid/view/Window;I)V
    .locals 0

    iput p3, p0, Lio/sentry/android/core/internal/util/l;->w:I

    iput-object p1, p0, Lio/sentry/android/core/internal/util/l;->x:Lio/sentry/android/core/internal/util/q;

    iput-object p2, p0, Lio/sentry/android/core/internal/util/l;->y:Landroid/view/Window;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 5

    iget v0, p0, Lio/sentry/android/core/internal/util/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/sentry/android/core/internal/util/l;->x:Lio/sentry/android/core/internal/util/q;

    iget-object v1, p0, Lio/sentry/android/core/internal/util/l;->y:Landroid/view/Window;

    :try_start_0
    iget-object v2, v0, Lio/sentry/android/core/internal/util/q;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lio/sentry/android/core/internal/util/q;->H:Lio/sentry/android/core/internal/util/d;

    iget-object v3, v0, Lio/sentry/android/core/internal/util/q;->I:Lio/sentry/android/core/internal/util/n;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v3}, Landroid/view/Window;->removeOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    iget-object v0, v0, Lio/sentry/android/core/internal/util/q;->y:Lio/sentry/v0;

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to remove frameMetricsAvailableListener"

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    iget-object v0, p0, Lio/sentry/android/core/internal/util/l;->x:Lio/sentry/android/core/internal/util/q;

    iget-object v1, v0, Lio/sentry/android/core/internal/util/q;->x:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v2, p0, Lio/sentry/android/core/internal/util/l;->y:Landroid/view/Window;

    invoke-virtual {v1, v2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    :try_start_1
    iget-object v1, v0, Lio/sentry/android/core/internal/util/q;->H:Lio/sentry/android/core/internal/util/d;

    iget-object v3, v0, Lio/sentry/android/core/internal/util/q;->I:Lio/sentry/android/core/internal/util/n;

    iget-object v4, v0, Lio/sentry/android/core/internal/util/q;->z:Landroid/os/Handler;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-nez v3, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v3, v4}, Landroid/view/Window;->addOnFrameMetricsAvailableListener(Landroid/view/Window$OnFrameMetricsAvailableListener;Landroid/os/Handler;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    iget-object v0, v0, Lio/sentry/android/core/internal/util/q;->y:Lio/sentry/v0;

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v3, "Failed to add frameMetricsAvailableListener"

    invoke-interface {v0, v2, v3, v1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
