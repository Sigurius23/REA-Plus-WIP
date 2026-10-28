.class public final Lb50/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final w:J

.field public x:J

.field public final synthetic y:Lb3/b;


# direct methods
.method public constructor <init>(Lb3/b;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb50/d;->y:Lb3/b;

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v0

    iput-wide v0, p0, Lb50/d;->w:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    iget-wide v0, p0, Lb50/d;->x:J

    const-wide/16 v2, 0x1388

    cmp-long v0, v0, v2

    iget-object v1, p0, Lb50/d;->y:Lb3/b;

    if-gez v0, :cond_0

    invoke-virtual {v1}, Lb3/b;->F()V

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    iget-wide v4, p0, Lb50/d;->w:J

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lb50/d;->x:J

    iget-object v0, v1, Lb3/b;->b:Ljava/lang/Object;

    check-cast v0, Landroid/os/Handler;

    const-wide/16 v1, 0x1f4

    invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void

    :cond_0
    new-instance v0, Ljava/util/concurrent/TimeoutException;

    invoke-direct {v0}, Ljava/util/concurrent/TimeoutException;-><init>()V

    invoke-virtual {v1}, Lb3/b;->G()V

    invoke-virtual {v1}, Lb3/b;->g()V

    return-void
.end method
