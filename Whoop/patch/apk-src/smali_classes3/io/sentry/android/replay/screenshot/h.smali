.class public final Lio/sentry/android/replay/screenshot/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/android/replay/screenshot/i;


# instance fields
.field public final a:Lio/sentry/android/replay/ReplayIntegration;

.field public final b:Lio/sentry/q6;

.field public final c:Lio/sentry/android/replay/w;

.field public final d:Lav/b;

.field public final e:Ljava/util/concurrent/ScheduledExecutorService;

.field public final f:Laj/c;

.field public final g:Landroid/graphics/Bitmap;

.field public final h:Ljava/lang/Object;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Lio/sentry/android/replay/util/c;

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final l:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final m:Ljava/lang/Object;

.field public final n:Ljava/lang/Object;

.field public final o:Landroid/graphics/Rect;

.field public final p:Landroid/graphics/RectF;

.field public final q:[I

.field public final r:[I


# direct methods
.method public constructor <init>(Lio/sentry/android/replay/e0;Lio/sentry/android/replay/ReplayIntegration;Lio/sentry/q6;Lio/sentry/android/replay/w;Lio/sentry/android/replay/util/a;Lav/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->a:Lio/sentry/android/replay/ReplayIntegration;

    iput-object p3, p0, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    iput-object p4, p0, Lio/sentry/android/replay/screenshot/h;->c:Lio/sentry/android/replay/w;

    iput-object p6, p0, Lio/sentry/android/replay/screenshot/h;->d:Lav/b;

    iget-object p2, p1, Lio/sentry/android/replay/e0;->E:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object p1, p1, Lio/sentry/android/replay/e0;->z:Laj/c;

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->f:Laj/c;

    iget p1, p4, Lio/sentry/android/replay/w;->a:I

    iget p2, p4, Lio/sentry/android/replay/w;->b:I

    sget-object p3, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {p1, p2, p3}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    sget-object p1, Ll83/i;->y:Ll83/i;

    new-instance p2, Lio/sentry/android/replay/screenshot/g;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, Lio/sentry/android/replay/screenshot/g;-><init>(Lio/sentry/android/replay/screenshot/h;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->h:Ljava/lang/Object;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Lio/sentry/android/replay/util/c;

    invoke-direct {p2}, Lio/sentry/android/replay/util/c;-><init>()V

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->j:Lio/sentry/android/replay/util/c;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p2, p3}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    sget-object p2, Lio/sentry/android/replay/screenshot/f;->w:Lio/sentry/android/replay/screenshot/f;

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p2

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->m:Ljava/lang/Object;

    new-instance p2, Lio/sentry/android/replay/screenshot/g;

    const/4 p3, 0x1

    invoke-direct {p2, p0, p3}, Lio/sentry/android/replay/screenshot/g;-><init>(Lio/sentry/android/replay/screenshot/h;I)V

    invoke-static {p1, p2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object p1

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->n:Ljava/lang/Object;

    new-instance p1, Landroid/graphics/Rect;

    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->o:Landroid/graphics/Rect;

    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->p:Landroid/graphics/RectF;

    const/4 p1, 0x2

    new-array p2, p1, [I

    iput-object p2, p0, Lio/sentry/android/replay/screenshot/h;->q:[I

    new-array p1, p1, [I

    iput-object p1, p0, Lio/sentry/android/replay/screenshot/h;->r:[I

    return-void
.end method

.method public static final e(Ljava/util/concurrent/atomic/AtomicInteger;Lio/sentry/android/replay/screenshot/h;Landroid/view/View;[Lcom/google/android/material/datepicker/n;Lio/sentry/android/replay/viewhierarchy/g;II)V
    .locals 8

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicInteger;->decrementAndGet()I

    move-result p0

    if-nez p0, :cond_0

    iget-object p0, p1, Lio/sentry/android/replay/screenshot/h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance v0, Lio/sentry/android/replay/util/e;

    new-instance v1, Lio/sentry/android/replay/screenshot/e;

    move-object v2, p1

    move-object v6, p2

    move-object v3, p3

    move-object v7, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v1 .. v7}, Lio/sentry/android/replay/screenshot/e;-><init>(Lio/sentry/android/replay/screenshot/h;[Lcom/google/android/material/datepicker/n;IILandroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;)V

    const-string p1, "screenshot_recorder.composite"

    invoke-direct {v0, v1, p1}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    invoke-interface {p0, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    :cond_0
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lio/sentry/android/replay/screenshot/h;->a:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {v1, v0}, Lio/sentry/android/replay/ReplayIntegration;->b0(Landroid/graphics/Bitmap;)V

    :cond_0
    return-void
.end method

.method public final c(Landroid/view/View;)V
    .locals 6

    invoke-static {p1}, Lvd/e;->D(Landroid/view/View;)Landroid/view/Window;

    move-result-object v0

    iget-object v1, p0, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "Window is invalid, not capturing screenshot"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object v0, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "PixelCopyStrategy is closed, not capturing screenshot"

    new-array v2, v2, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1, v2}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    :cond_1
    :try_start_0
    iget-object v3, p0, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object v3, p0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    new-instance v4, Lio/sentry/android/core/internal/util/k;

    const/4 v5, 0x1

    invoke-direct {v4, v5, p0, p1}, Lio/sentry/android/core/internal/util/k;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->f:Laj/c;

    iget-object p1, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast p1, Landroid/os/Handler;

    invoke-static {v0, v3, v4, p1}, Landroid/view/PixelCopy;->request(Landroid/view/Window;Landroid/graphics/Bitmap;Landroid/view/PixelCopy$OnPixelCopyFinishedListener;Landroid/os/Handler;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->WARNING:Lio/sentry/n5;

    const-string v3, "Failed to capture replay recording"

    invoke-interface {v0, v1, v3, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method

.method public final close()V
    .locals 3

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    new-instance v0, Lio/sentry/android/replay/util/e;

    new-instance v1, Lio/sentry/c7;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Lio/sentry/c7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "PixelCopyStrategy.close"

    invoke-direct {v0, v1, v2}, Lio/sentry/android/replay/util/e;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    iget-object v1, p0, Lio/sentry/android/replay/screenshot/h;->e:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-interface {v1, v0}, Ljava/util/concurrent/ExecutorService;->submit(Ljava/lang/Runnable;)Ljava/util/concurrent/Future;

    return-void
.end method

.method public final d(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/g;)V
    .locals 4

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->l:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    const/4 v0, 0x0

    iget-object v1, p0, Lio/sentry/android/replay/screenshot/h;->b:Lio/sentry/q6;

    if-nez p1, :cond_1

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->g:Landroid/graphics/Bitmap;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->isRecycled()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lio/sentry/android/replay/screenshot/h;->h:Ljava/lang/Object;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/graphics/Matrix;

    iget-object v3, p0, Lio/sentry/android/replay/screenshot/h;->j:Lio/sentry/android/replay/util/c;

    invoke-virtual {v3, p1, p2, v2}, Lio/sentry/android/replay/util/c;->b(Landroid/graphics/Bitmap;Lio/sentry/android/replay/viewhierarchy/g;Landroid/graphics/Matrix;)Ljava/util/List;

    invoke-virtual {v1}, Lio/sentry/q6;->getReplayController()Lio/sentry/v3;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p0, Lio/sentry/android/replay/screenshot/h;->a:Lio/sentry/android/replay/ReplayIntegration;

    invoke-virtual {p2, p1}, Lio/sentry/android/replay/ReplayIntegration;->b0(Landroid/graphics/Bitmap;)V

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    iget-object p1, p0, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_1
    :goto_0
    invoke-virtual {v1}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object p1

    sget-object p2, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v1, "PixelCopyStrategy is closed, skipping masking"

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1, p2, v1, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method public final onContentChanged()V
    .locals 2

    iget-object v0, p0, Lio/sentry/android/replay/screenshot/h;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
