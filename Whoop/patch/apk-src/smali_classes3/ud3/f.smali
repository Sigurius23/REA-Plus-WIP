.class public final Lud3/f;
.super Lne3/r;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lud3/g;

.field public final synthetic x:Lc33/c;


# direct methods
.method public constructor <init>(Lud3/g;Lc33/c;Lne3/n0;)V
    .locals 0

    iput-object p1, p0, Lud3/f;->w:Lud3/g;

    iput-object p2, p0, Lud3/f;->x:Lc33/c;

    invoke-direct {p0, p3}, Lne3/r;-><init>(Lne3/n0;)V

    return-void
.end method


# virtual methods
.method public final close()V
    .locals 3

    iget-object v0, p0, Lud3/f;->w:Lud3/g;

    iget-object v1, p0, Lud3/f;->x:Lc33/c;

    monitor-enter v0

    :try_start_0
    iget-boolean v2, v1, Lc33/c;->a:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v2, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    const/4 v2, 0x1

    :try_start_1
    iput-boolean v2, v1, Lc33/c;->a:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    invoke-super {p0}, Lne3/r;->close()V

    iget-object v0, p0, Lud3/f;->x:Lc33/c;

    iget-object v0, v0, Lc33/c;->c:Ljava/lang/Object;

    check-cast v0, Lb9/b;

    invoke-virtual {v0}, Lb9/b;->e()V

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method
