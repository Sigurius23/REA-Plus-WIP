.class public final synthetic Lio/sentry/android/replay/screenshot/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/PixelCopy$OnPixelCopyFinishedListener;


# instance fields
.field public final synthetic a:Lio/sentry/android/replay/screenshot/c;


# direct methods
.method public synthetic constructor <init>(Lio/sentry/android/replay/screenshot/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/b;->a:Lio/sentry/android/replay/screenshot/c;

    return-void
.end method


# virtual methods
.method public final onPixelCopyFinished(I)V
    .locals 5

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/b;->a:Lio/sentry/android/replay/screenshot/c;

    iget-object v1, v0, Lio/sentry/android/replay/screenshot/c;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    iget-object p1, v0, Lio/sentry/android/replay/screenshot/c;->c:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "CanvasStrategy is closed, ignoring capture result"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    if-nez p1, :cond_2

    iget-object p1, v0, Lio/sentry/android/replay/screenshot/c;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, v0, Lio/sentry/android/replay/screenshot/c;->e:Landroid/graphics/Bitmap;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v0, v0, Lio/sentry/android/replay/screenshot/c;->b:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v0, p1}, Lio/sentry/android/replay/ReplayIntegration;->b0(Landroid/graphics/Bitmap;)V

    :cond_1
    return-void

    :cond_2
    iget-object v1, v0, Lio/sentry/android/replay/screenshot/c;->c:Lio/sentry/q6;

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v1

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v4, "Canvas Strategy: PixelCopy failed with code "

    invoke-static {p1, v4}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v4, v2, [Ljava/lang/Object;

    invoke-interface {v1, v3, p1, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object p1, v0, Lio/sentry/android/replay/screenshot/c;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
