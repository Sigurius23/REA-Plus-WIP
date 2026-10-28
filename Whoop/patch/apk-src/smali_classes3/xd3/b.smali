.class public final Lxd3/b;
.super Lne3/s;
.source "SourceFile"


# instance fields
.field public x:Z

.field public final synthetic y:Lxd3/f;

.field public final synthetic z:Lxd3/c;


# direct methods
.method public constructor <init>(Lne3/p0;Lxd3/f;Lxd3/c;)V
    .locals 0

    iput-object p2, p0, Lxd3/b;->y:Lxd3/f;

    iput-object p3, p0, Lxd3/b;->z:Lxd3/c;

    invoke-direct {p0, p1}, Lne3/s;-><init>(Lne3/p0;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    invoke-super {p0}, Lne3/s;->close()V

    iget-boolean v0, p0, Lxd3/b;->x:Z

    if-nez v0, :cond_1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lxd3/b;->x:Z

    iget-object v0, p0, Lxd3/b;->y:Lxd3/f;

    iget-object v1, p0, Lxd3/b;->z:Lxd3/c;

    monitor-enter v0

    :try_start_0
    iget v2, v1, Lxd3/c;->h:I

    add-int/lit8 v2, v2, -0x1

    iput v2, v1, Lxd3/c;->h:I

    if-nez v2, :cond_0

    iget-boolean v2, v1, Lxd3/c;->f:Z

    if-eqz v2, :cond_0

    invoke-virtual {v0, v1}, Lxd3/f;->b0(Lxd3/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0

    throw v1

    :cond_1
    return-void
.end method
