.class public final Llb/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltb/a;
.implements Lmc3/a;


# instance fields
.field public final E:Llb/g;

.field public final w:Ltb/a;

.field public final x:Lmc3/a;

.field public y:Lq83/j;

.field public z:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ltb/a;)V
    .locals 2

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    const-string v1, "delegate"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb/h;->w:Ltb/a;

    iput-object v0, p0, Llb/h;->x:Lmc3/a;

    new-instance p1, Llb/g;

    invoke-direct {p1, p0}, Llb/g;-><init>(Llb/h;)V

    iput-object p1, p0, Llb/h;->E:Llb/g;

    return-void
.end method


# virtual methods
.method public final b(Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Llb/h;->x:Lmc3/a;

    invoke-interface {v0, p1}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 2

    iget-object v0, p0, Llb/h;->E:Llb/g;

    if-eqz v0, :cond_0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, La0/a0;->i(I)V

    :cond_0
    iget-object v0, p0, Llb/h;->w:Ltb/a;

    invoke-interface {v0}, Ljava/lang/AutoCloseable;->close()V

    return-void
.end method

.method public final g1(Ljava/lang/String;)Ltb/c;
    .locals 2

    const-string v0, "sql"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb/h;->E:Llb/g;

    if-eqz v0, :cond_0

    new-instance v1, Llb/f;

    invoke-virtual {v0, p1}, La0/a0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p1, Ltb/c;

    invoke-direct {v1, p1}, Llb/f;-><init>(Ltb/c;)V

    return-object v1

    :cond_0
    iget-object v0, p0, Llb/h;->w:Ltb/a;

    invoke-interface {v0, p1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object p1

    return-object p1
.end method

.method public final h()Z
    .locals 1

    iget-object v0, p0, Llb/h;->x:Lmc3/a;

    invoke-interface {v0}, Lmc3/a;->h()Z

    move-result v0

    return v0
.end method

.method public final i(Ljava/lang/Object;)V
    .locals 1

    const/4 p1, 0x0

    iget-object v0, p0, Llb/h;->x:Lmc3/a;

    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-void
.end method

.method public final k(Ljava/lang/StringBuilder;)V
    .locals 6

    iget-object v0, p0, Llb/h;->E:Llb/g;

    iget-object v1, p0, Llb/h;->y:Lq83/j;

    const/16 v2, 0xa

    if-nez v1, :cond_1

    iget-object v1, p0, Llb/h;->z:Ljava/lang/Throwable;

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v1, "\t\tStatus: Free connection"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_2

    :cond_1
    :goto_0
    const-string v1, "\t\tStatus: Acquired connection"

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb/h;->y:Lq83/j;

    if-eqz v1, :cond_2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "\t\tCoroutine: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    iget-object v1, p0, Llb/h;->z:Ljava/lang/Throwable;

    if-eqz v1, :cond_3

    const-string v3, "\t\tAcquired:"

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v1}, Lpf/c;->W(Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->m0(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    const/4 v3, 0x1

    invoke-static {v1, v3}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "\t\t"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    :goto_2
    if-eqz v0, :cond_4

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "\t\tPrepared Statement Cache Size: "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, La0/a0;->c:Lqt/e;

    monitor-enter v3

    :try_start_0
    iget v0, v0, La0/a0;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v3

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_4
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llb/h;->w:Ltb/a;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final tryLock()Z
    .locals 1

    iget-object v0, p0, Llb/h;->x:Lmc3/a;

    invoke-interface {v0}, Lmc3/a;->tryLock()Z

    move-result v0

    return v0
.end method

.method public final v()Z
    .locals 1

    iget-object v0, p0, Llb/h;->w:Ltb/a;

    invoke-interface {v0}, Ltb/a;->v()Z

    move-result v0

    return v0
.end method
