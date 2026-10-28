.class public final Ld53/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/u;


# instance fields
.field public final w:Lbc3/e2;

.field public final x:Lav/b;


# direct methods
.method public constructor <init>(Lbc3/e2;Lav/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld53/c;->w:Lbc3/e2;

    iput-object p2, p0, Ld53/c;->x:Lav/b;

    const-string p1, "Video:UserJob"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    return-void
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 2

    iget-object v0, p0, Ld53/c;->x:Lav/b;

    invoke-virtual {v0}, Lav/b;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ld53/a;

    invoke-direct {v1, v0, p1}, Ld53/a;-><init>(Ljava/lang/String;Lbc3/r;)V

    iget-object p1, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {p1, v1}, Lbc3/t1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic cancel()V
    .locals 2

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, v1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1}, Lbc3/t1;->cancel(Ljava/lang/Throwable;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public final complete()Z
    .locals 2

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, v1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final completeExceptionally(Ljava/lang/Throwable;)Z
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1}, Lbc3/l1;->completeExceptionally(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p2, p1, p0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->getChildren()Lxb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    return-object v0
.end method

.method public final getOnJoin()Llc3/c;
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->getOnJoin()Llc3/c;

    move-result-object v0

    return-object v0
.end method

.method public final getParent()Lbc3/k1;
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->getParent()Lbc3/k1;

    move-result-object v0

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 1
    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 2
    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1, p2, p3}, Lbc3/t1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0, p1}, Lbc3/t1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lbc3/k1;)Lbc3/k1;
    .locals 1

    .line 1
    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    .line 2
    invoke-static {v0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 1

    iget-object v0, p0, Ld53/c;->w:Lbc3/e2;

    invoke-virtual {v0}, Lbc3/t1;->start()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Ld53/c;->x:Lav/b;

    iget-object v0, v0, Lav/b;->x:Ljava/lang/Object;

    check-cast v0, Ld53/b;

    iget-object v0, v0, Ld53/b;->w:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "UserJob(userId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
