.class public final Lkj/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Lhj/q;

.field public b:I

.field public c:J

.field public d:F

.field public e:F

.field public f:Landroid/os/Handler;

.field public g:Lio/sentry/c7;


# virtual methods
.method public final a()V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, Lkj/e;->b:I

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lkj/e;->c:J

    const/4 v0, 0x0

    iput v0, p0, Lkj/e;->d:F

    iput v0, p0, Lkj/e;->e:F

    iget-object v0, p0, Lkj/e;->g:Lio/sentry/c7;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lkj/e;->f:Landroid/os/Handler;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lkj/e;->f:Landroid/os/Handler;

    iput-object v0, p0, Lkj/e;->g:Lio/sentry/c7;

    return-void
.end method
