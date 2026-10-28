.class public final synthetic Lb9/z;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:Landroid/content/Context;

.field public final synthetic x:Z

.field public final synthetic y:Lb9/f0;

.field public final synthetic z:Lc9/n;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLb9/f0;Lc9/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb9/z;->w:Landroid/content/Context;

    iput-boolean p2, p0, Lb9/z;->x:Z

    iput-object p3, p0, Lb9/z;->y:Lb9/f0;

    iput-object p4, p0, Lb9/z;->z:Lc9/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lb9/z;->w:Landroid/content/Context;

    iget-boolean v1, p0, Lb9/z;->x:Z

    iget-object v2, p0, Lb9/z;->y:Lb9/f0;

    iget-object v3, p0, Lb9/z;->z:Lc9/n;

    invoke-static {v0}, Lc9/l;->g(Landroid/content/Context;)Lc9/l;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "ExoPlayerImpl"

    const-string v1, "MediaMetricsService unavailable."

    invoke-static {v0, v1}, Lx8/a;->u(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz v1, :cond_1

    iget-object v1, v2, Lb9/f0;->T:Lc9/h;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Lc9/h;->F:Lx8/i;

    invoke-virtual {v1, v0}, Lx8/i;->a(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {v0}, Lc9/l;->i()Landroid/media/metrics/LogSessionId;

    move-result-object v0

    monitor-enter v3

    :try_start_0
    iget-object v1, v3, Lc9/n;->b:Lc9/m;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v1, v0}, Lc9/m;->f(Landroid/media/metrics/LogSessionId;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method
