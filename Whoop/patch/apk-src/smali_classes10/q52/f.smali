.class public Lq52/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:J

.field private final b:J

.field private final c:Ljava/lang/Runnable;

.field private final d:Landroid/os/Handler;

.field private e:Z


# direct methods
.method public constructor <init>(JJLbh3/b;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJ",
            "Lbh3/b;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lq52/f;->a:J

    iput-wide p3, p0, Lq52/f;->b:J

    new-instance p1, Lq52/f$a;

    invoke-direct {p1, p0, p5}, Lq52/f$a;-><init>(Lq52/f;Lbh3/b;)V

    iput-object p1, p0, Lq52/f;->c:Ljava/lang/Runnable;

    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Lq52/f;->d:Landroid/os/Handler;

    return-void
.end method

.method public static bridge synthetic a(Lq52/f;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lq52/f;->d:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic b(Lq52/f;)Z
    .locals 0

    iget-boolean p0, p0, Lq52/f;->e:Z

    return p0
.end method

.method public static bridge synthetic c(Lq52/f;)J
    .locals 2

    invoke-direct {p0}, Lq52/f;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method private d()J
    .locals 13

    iget-object v0, p0, Lq52/f;->d:Landroid/os/Handler;

    monitor-enter v0

    :try_start_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Lq52/f;->a:J

    sub-long v5, v1, v3

    const-wide/16 v7, 0x0

    cmp-long v7, v5, v7

    if-gez v7, :cond_0

    iget-object v1, p0, Lq52/f;->d:Landroid/os/Handler;

    iget-object v2, p0, Lq52/f;->c:Ljava/lang/Runnable;

    neg-long v3, v5

    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    iget-wide v7, p0, Lq52/f;->b:J

    div-long v9, v5, v7

    const-wide/16 v11, 0x1

    add-long/2addr v9, v11

    mul-long/2addr v9, v7

    add-long/2addr v9, v3

    sub-long/2addr v9, v1

    iget-object v1, p0, Lq52/f;->d:Landroid/os/Handler;

    iget-object v2, p0, Lq52/f;->c:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, v9, v10}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    :goto_0
    monitor-exit v0

    return-wide v5

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method


# virtual methods
.method public e()V
    .locals 3

    iget-object v0, p0, Lq52/f;->d:Landroid/os/Handler;

    monitor-enter v0

    :try_start_0
    invoke-virtual {p0}, Lq52/f;->f()V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lq52/f;->e:Z

    iget-object v1, p0, Lq52/f;->d:Landroid/os/Handler;

    iget-object v2, p0, Lq52/f;->c:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public f()V
    .locals 3

    iget-object v0, p0, Lq52/f;->d:Landroid/os/Handler;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lq52/f;->e:Z

    iget-object v1, p0, Lq52/f;->d:Landroid/os/Handler;

    iget-object v2, p0, Lq52/f;->c:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
