.class public final Lio/sentry/android/replay/capture/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf93/d;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic y:Lio/sentry/android/replay/capture/c;

.field public final synthetic z:Lio/sentry/android/replay/capture/c;


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;I)V
    .locals 0

    iput p3, p0, Lio/sentry/android/replay/capture/b;->w:I

    packed-switch p3, :pswitch_data_0

    const/4 p3, -0x1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    .line 4
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 6
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    .line 7
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 9
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    .line 10
    :pswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 12
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    .line 13
    :pswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 15
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/lang/Object;Lio/sentry/android/replay/capture/c;Lio/sentry/android/replay/capture/c;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lio/sentry/android/replay/capture/b;->w:I

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iput-object p3, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    .line 18
    new-instance p2, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-direct {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;
    .locals 0

    iget p1, p0, Lio/sentry/android/replay/capture/b;->w:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_2
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_3
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V
    .locals 2

    iget p1, p0, Lio/sentry/android/replay/capture/b;->w:I

    packed-switch p1, :pswitch_data_0

    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_1

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x5

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/16 v1, 0xc

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_0

    :cond_0
    :try_start_0
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void

    :pswitch_0
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_3

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x4

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/16 v1, 0xb

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_1

    :cond_2
    :try_start_1
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    :goto_1
    return-void

    :pswitch_1
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_5

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x3

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/16 v1, 0xa

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_2

    :cond_4
    :try_start_2
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    return-void

    :pswitch_2
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x2

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/16 v1, 0x9

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_3

    :cond_6
    :try_start_3
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_3

    :catchall_3
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    :goto_3
    return-void

    :pswitch_3
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_9

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x1

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_8

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/16 v1, 0x8

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_4

    :cond_8
    :try_start_4
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_4
    return-void

    :pswitch_4
    const-string p1, "property"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_b

    new-instance p2, Lio/sentry/android/replay/capture/a;

    iget-object v0, p0, Lio/sentry/android/replay/capture/b;->z:Lio/sentry/android/replay/capture/c;

    const/4 v1, 0x0

    invoke-direct {p2, p1, p3, v0, v1}, Lio/sentry/android/replay/capture/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lio/sentry/android/replay/capture/c;I)V

    iget-object p1, p0, Lio/sentry/android/replay/capture/b;->y:Lio/sentry/android/replay/capture/c;

    iget-object p3, p1, Lio/sentry/android/replay/capture/c;->a:Lio/sentry/q6;

    invoke-virtual {p3}, Lio/sentry/q6;->getThreadChecker()Lio/sentry/util/thread/a;

    move-result-object v0

    invoke-interface {v0}, Lio/sentry/util/thread/a;->a()Z

    move-result v0

    if-eqz v0, :cond_a

    iget-object p1, p1, Lio/sentry/android/replay/capture/c;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p3, Lio/sentry/android/replay/util/e;

    new-instance v0, Lbq/b;

    const/4 v1, 0x7

    invoke-direct {v0, p2, v1}, Lbq/b;-><init>(Ljava/lang/Object;I)V

    const-string p2, "CaptureStrategy.runInBackground"

    invoke-direct {p3, v0, p2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p1, p3}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    goto :goto_5

    :cond_a
    :try_start_5
    invoke-virtual {p2}, Lio/sentry/android/replay/capture/a;->invoke()Ljava/lang/Object;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_5

    :catchall_5
    move-exception p1

    invoke-virtual {p3}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p2

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v0, "Failed to execute task CaptureStrategy.runInBackground"

    invoke-interface {p2, p3, v0, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_b
    :goto_5
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
