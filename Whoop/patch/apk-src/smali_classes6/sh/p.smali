.class public final Lsh/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsh/q;


# instance fields
.field public final E:Ljava/lang/Object;

.field public F:Z

.field public G:Lne3/j0;

.field public final w:Lne3/e0;

.field public final x:Lne3/p;

.field public final y:Ljava/lang/String;

.field public final z:Ljava/lang/AutoCloseable;


# direct methods
.method public constructor <init>(Lne3/e0;Lne3/p;Ljava/lang/String;Ljava/lang/AutoCloseable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/p;->w:Lne3/e0;

    iput-object p2, p0, Lsh/p;->x:Lne3/p;

    iput-object p3, p0, Lsh/p;->y:Ljava/lang/String;

    iput-object p4, p0, Lsh/p;->z:Ljava/lang/AutoCloseable;

    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/p;->E:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final D0()Lne3/e0;
    .locals 3

    iget-object v0, p0, Lsh/p;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsh/p;->F:Z

    if-nez v1, :cond_0

    iget-object v1, p0, Lsh/p;->w:Lne3/e0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_0
    :try_start_1
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final V0()Lne3/e0;
    .locals 1

    invoke-virtual {p0}, Lsh/p;->D0()Lne3/e0;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ls2/a;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Lsh/p;->E:Ljava/lang/Object;

    monitor-enter v0

    const/4 v1, 0x1

    :try_start_0
    iput-boolean v1, p0, Lsh/p;->F:Z

    iget-object v1, p0, Lsh/p;->G:Lne3/j0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    :try_start_1
    invoke-virtual {v1}, Lne3/j0;->close()V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    move-exception v1

    :try_start_2
    throw v1

    :catch_1
    :cond_0
    :goto_0
    iget-object v1, p0, Lsh/p;->z:Ljava/lang/AutoCloseable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz v1, :cond_1

    :try_start_3
    check-cast v1, Ljava/lang/AutoCloseable;

    invoke-static {v1}, Lm4/a;->w(Ljava/lang/AutoCloseable;)V
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_2
    move-exception v1

    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :catch_3
    :cond_1
    :goto_1
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0

    throw v1
.end method

.method public final d1()Lne3/j;
    .locals 3

    iget-object v0, p0, Lsh/p;->E:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-boolean v1, p0, Lsh/p;->F:Z

    if-nez v1, :cond_1

    iget-object v1, p0, Lsh/p;->G:Lne3/j0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v1, :cond_0

    monitor-exit v0

    return-object v1

    :cond_0
    :try_start_1
    iget-object v1, p0, Lsh/p;->x:Lne3/p;

    iget-object v2, p0, Lsh/p;->w:Lne3/e0;

    invoke-virtual {v1, v2}, Lne3/p;->x0(Lne3/e0;)Lne3/p0;

    move-result-object v1

    invoke-static {v1}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v1

    iput-object v1, p0, Lsh/p;->G:Lne3/j0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    goto :goto_0

    :cond_1
    :try_start_2
    const-string v1, "closed"

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :goto_0
    monitor-exit v0

    throw v1
.end method

.method public final getFileSystem()Lne3/p;
    .locals 1

    iget-object v0, p0, Lsh/p;->x:Lne3/p;

    return-object v0
.end method
