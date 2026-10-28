.class public final Lbe3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/n0;


# instance fields
.field public final w:Lne3/t;

.field public x:Z

.field public final synthetic y:Lbe3/g;


# direct methods
.method public constructor <init>(Lbe3/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe3/b;->y:Lbe3/g;

    new-instance v0, Lne3/t;

    iget-object p1, p1, Lbe3/g;->c:Ls/m2;

    iget-object p1, p1, Ls/m2;->y:Ljava/lang/Object;

    check-cast p1, Lne3/h0;

    iget-object p1, p1, Lne3/h0;->w:Lne3/n0;

    invoke-interface {p1}, Lne3/n0;->timeout()Lne3/r0;

    move-result-object p1

    invoke-direct {v0, p1}, Lne3/t;-><init>(Lne3/r0;)V

    iput-object v0, p0, Lbe3/b;->w:Lne3/t;

    return-void
.end method


# virtual methods
.method public final declared-synchronized close()V
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbe3/b;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    const/4 v0, 0x1

    :try_start_1
    iput-boolean v0, p0, Lbe3/b;->x:Z

    iget-object v0, p0, Lbe3/b;->y:Lbe3/g;

    iget-object v0, v0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    const-string v1, "0\r\n\r\n"

    invoke-virtual {v0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    iget-object v0, p0, Lbe3/b;->w:Lne3/t;

    iget-object v1, v0, Lne3/t;->e:Lne3/r0;

    sget-object v2, Lne3/r0;->d:Lne3/q0;

    iput-object v2, v0, Lne3/t;->e:Lne3/r0;

    invoke-virtual {v1}, Lne3/r0;->a()Lne3/r0;

    invoke-virtual {v1}, Lne3/r0;->b()Lne3/r0;

    iget-object v0, p0, Lbe3/b;->y:Lbe3/g;

    const/4 v1, 0x3

    iput v1, v0, Lbe3/g;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final declared-synchronized flush()V
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lbe3/b;->x:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lbe3/b;->y:Lbe3/g;

    iget-object v0, v0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lbe3/b;->w:Lne3/t;

    return-object v0
.end method

.method public final write(Lne3/h;J)V
    .locals 4

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lbe3/b;->x:Z

    const-string v1, "closed"

    if-nez v0, :cond_2

    const-wide/16 v2, 0x0

    cmp-long v0, p2, v2

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lbe3/b;->y:Lbe3/g;

    iget-object v0, v0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    iget-boolean v2, v0, Lne3/h0;->y:Z

    if-nez v2, :cond_1

    iget-object v1, v0, Lne3/h0;->x:Lne3/h;

    invoke-virtual {v1, p2, p3}, Lne3/h;->o1(J)V

    invoke-virtual {v0}, Lne3/h0;->b()Lne3/i;

    const-string v1, "\r\n"

    invoke-virtual {v0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {v0, p1, p2, p3}, Lne3/h0;->write(Lne3/h;J)V

    invoke-virtual {v0, v1}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-direct {p1, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
