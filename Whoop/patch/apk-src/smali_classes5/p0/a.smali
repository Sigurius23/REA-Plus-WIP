.class public final Lp0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lp0/a1;
.implements Landroid/view/View$OnAttachStateChangeListener;
.implements Ljava/lang/Runnable;
.implements Landroid/view/Choreographer$FrameCallback;


# static fields
.field public static H:J


# instance fields
.field public final E:Lm/k0;

.field public F:Z

.field public G:J

.field public final w:Landroid/view/View;

.field public final x:Ljava/util/PriorityQueue;

.field public y:Z

.field public final z:Landroid/view/Choreographer;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp0/a;->w:Landroid/view/View;

    new-instance v0, Ljava/util/PriorityQueue;

    new-instance v1, Lm3/g;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Lm3/g;-><init>(I)V

    const/16 v2, 0xb

    invoke-direct {v0, v2, v1}, Ljava/util/PriorityQueue;-><init>(ILjava/util/Comparator;)V

    iput-object v0, p0, Lp0/a;->x:Ljava/util/PriorityQueue;

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object v0

    iput-object v0, p0, Lp0/a;->z:Landroid/view/Choreographer;

    new-instance v0, Lm/k0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lp0/a;->E:Lm/k0;

    sget-wide v0, Lp0/a;->H:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getDisplay()Landroid/view/Display;

    move-result-object v0

    invoke-virtual {p1}, Landroid/view/View;->isInEditMode()Z

    move-result v1

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Display;->getRefreshRate()F

    move-result v0

    const/high16 v1, 0x41f00000    # 30.0f

    cmpl-float v1, v0, v1

    if-ltz v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x42700000    # 60.0f

    :goto_0
    const v1, 0x3b9aca00

    int-to-float v1, v1

    div-float/2addr v1, v0

    float-to-long v0, v1

    sput-wide v0, Lp0/a;->H:J

    :cond_1
    invoke-virtual {p1, p0}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    invoke-virtual {p1}, Landroid/view/View;->isAttachedToWindow()Z

    move-result p1

    if-eqz p1, :cond_2

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/a;->F:Z

    :cond_2
    return-void
.end method


# virtual methods
.method public a(Lp0/y0;)V
    .locals 2

    new-instance v0, Lp0/d1;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p1}, Lp0/d1;-><init>(ILp0/y0;)V

    iget-object p1, p0, Lp0/a;->x:Ljava/util/PriorityQueue;

    invoke-virtual {p1, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    iget-boolean p1, p0, Lp0/a;->y:Z

    if-nez p1, :cond_0

    iput-boolean v1, p0, Lp0/a;->y:Z

    iget-object p1, p0, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 5

    iget-object v0, p0, Lp0/a;->E:Lm/k0;

    invoke-virtual {v0}, Lm/k0;->a()J

    move-result-wide v1

    const-string v3, "compose:lazy:prefetch:available_time_nanos"

    invoke-static {v1, v2, v3}, La4/a;->F(JLjava/lang/String;)V

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    const/4 v2, 0x1

    if-lez v1, :cond_1

    iget-object v1, p0, Lp0/a;->x:Ljava/util/PriorityQueue;

    invoke-virtual {v1}, Ljava/util/PriorityQueue;->peek()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lp0/d1;

    iget-object v3, v3, Lp0/d1;->b:Lp0/y0;

    invoke-virtual {v3, v0}, Lp0/y0;->c(Lm/k0;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    move v2, v4

    :goto_0
    iput-boolean v4, v0, Lm/k0;->a:Z

    :cond_1
    return v2
.end method

.method public final doFrame(J)V
    .locals 1

    iget-boolean v0, p0, Lp0/a;->F:Z

    if-eqz v0, :cond_0

    iput-wide p1, p0, Lp0/a;->G:J

    iget-object p1, p0, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    :cond_0
    return-void
.end method

.method public final onViewAttachedToWindow(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lp0/a;->F:Z

    return-void
.end method

.method public final onViewDetachedFromWindow(Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    iput-boolean p1, p0, Lp0/a;->F:Z

    iget-object p1, p0, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {p1, p0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    iget-object p1, p0, Lp0/a;->z:Landroid/view/Choreographer;

    invoke-virtual {p1, p0}, Landroid/view/Choreographer;->removeFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method

.method public final run()V
    .locals 11

    iget-object v0, p0, Lp0/a;->x:Ljava/util/PriorityQueue;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_5

    iget-boolean v1, p0, Lp0/a;->y:Z

    if-eqz v1, :cond_5

    iget-boolean v1, p0, Lp0/a;->F:Z

    if-eqz v1, :cond_5

    iget-object v1, p0, Lp0/a;->w:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWindowVisibility()I

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_3

    :cond_0
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1}, Landroid/view/View;->getDrawingTime()J

    move-result-wide v4

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v5

    const/4 v1, 0x2

    int-to-long v7, v1

    sget-wide v9, Lp0/a;->H:J

    mul-long/2addr v7, v9

    add-long/2addr v7, v3

    cmp-long v1, v5, v7

    if-lez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    move v1, v2

    :goto_0
    iget-object v5, p0, Lp0/a;->E:Lm/k0;

    iput-boolean v1, v5, Lm/k0;->a:Z

    iget-wide v6, p0, Lp0/a;->G:J

    invoke-static {v6, v7, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    sget-wide v6, Lp0/a;->H:J

    add-long/2addr v3, v6

    iput-wide v3, v5, Lm/k0;->b:J

    move v1, v2

    :goto_1
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    if-nez v1, :cond_3

    iget-boolean v1, v5, Lm/k0;->a:Z

    if-eqz v1, :cond_2

    const-string v1, "compose:lazy:prefetch:idle_frame"

    invoke-static {v1}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0}, Lp0/a;->b()Z

    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    goto :goto_1

    :catchall_0
    move-exception v0

    invoke-static {}, Landroid/os/Trace;->endSection()V

    throw v0

    :cond_2
    invoke-virtual {p0}, Lp0/a;->b()Z

    move-result v1

    goto :goto_1

    :cond_3
    if-eqz v1, :cond_4

    iget-object v0, p0, Lp0/a;->z:Landroid/view/Choreographer;

    invoke-virtual {v0, p0}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    goto :goto_2

    :cond_4
    iput-boolean v2, p0, Lp0/a;->y:Z

    :goto_2
    const-string v0, "compose:lazy:prefetch:available_time_nanos"

    const-wide/16 v1, 0x0

    invoke-static {v1, v2, v0}, La4/a;->F(JLjava/lang/String;)V

    return-void

    :cond_5
    :goto_3
    iput-boolean v2, p0, Lp0/a;->y:Z

    return-void
.end method
