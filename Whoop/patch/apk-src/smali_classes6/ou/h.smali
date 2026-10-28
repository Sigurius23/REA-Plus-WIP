.class public abstract Lou/h;
.super Lou/e;
.source "SourceFile"


# instance fields
.field public final p:Ljava/util/Set;

.field public q:Z

.field public r:Z

.field public s:Landroid/view/VelocityTracker;

.field public t:F

.field public u:F


# direct methods
.method public constructor <init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lou/e;-><init>(Landroid/content/Context;Lio/sentry/android/replay/video/d;)V

    invoke-virtual {p0}, Lou/h;->j()Ljava/util/HashSet;

    move-result-object p1

    iput-object p1, p0, Lou/h;->p:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public a(Landroid/view/MotionEvent;)Z
    .locals 5

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getActionMasked()I

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x6

    if-eqz v0, :cond_0

    const/4 v3, 0x5

    if-eq v0, v3, :cond_0

    if-eq v0, v2, :cond_0

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p0}, Lou/e;->g()V

    :cond_1
    iget-boolean v3, p0, Lou/h;->r:Z

    if-eqz v3, :cond_2

    const/4 v3, 0x0

    iput-boolean v3, p0, Lou/h;->r:Z

    invoke-virtual {p0}, Lou/e;->g()V

    invoke-virtual {p0}, Lou/h;->i()V

    :cond_2
    iget-object v3, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    if-eqz v3, :cond_3

    iget-object v4, p0, Lou/a;->d:Landroid/view/MotionEvent;

    invoke-virtual {v3, v4}, Landroid/view/VelocityTracker;->addMovement(Landroid/view/MotionEvent;)V

    :cond_3
    invoke-super {p0, p1}, Lou/e;->a(Landroid/view/MotionEvent;)Z

    move-result p1

    const/4 v3, 0x1

    if-eq v0, v3, :cond_5

    if-ne v0, v2, :cond_4

    goto :goto_0

    :cond_4
    if-ne v0, v1, :cond_6

    iget-boolean v0, p0, Lou/h;->q:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lou/h;->i()V

    return v3

    :cond_5
    :goto_0
    iget-object v0, p0, Lou/e;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {p0}, Lou/e;->d()I

    move-result v1

    if-ge v0, v1, :cond_6

    iget-boolean v0, p0, Lou/h;->q:Z

    if-eqz v0, :cond_6

    invoke-virtual {p0}, Lou/h;->i()V

    return v3

    :cond_6
    return p1
.end method

.method public final h()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lou/h;->q:Z

    iget-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    if-nez v0, :cond_0

    invoke-static {}, Landroid/view/VelocityTracker;->obtain()Landroid/view/VelocityTracker;

    move-result-object v0

    iput-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    :cond_0
    return-void
.end method

.method public i()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lou/h;->q:Z

    iget-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    if-eqz v0, :cond_0

    const/16 v1, 0x3e8

    invoke-virtual {v0, v1}, Landroid/view/VelocityTracker;->computeCurrentVelocity(I)V

    iget-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getXVelocity()F

    move-result v0

    iput v0, p0, Lou/h;->t:F

    iget-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->getYVelocity()F

    move-result v0

    iput v0, p0, Lou/h;->u:F

    iget-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    invoke-virtual {v0}, Landroid/view/VelocityTracker;->recycle()V

    const/4 v0, 0x0

    iput-object v0, p0, Lou/h;->s:Landroid/view/VelocityTracker;

    :cond_0
    invoke-virtual {p0}, Lou/e;->g()V

    return-void
.end method

.method public abstract j()Ljava/util/HashSet;
.end method
