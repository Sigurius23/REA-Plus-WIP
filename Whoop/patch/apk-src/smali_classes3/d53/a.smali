.class public final Ld53/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/r;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Lbc3/r;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld53/a;->w:Ljava/lang/String;

    iput-object p2, p0, Ld53/a;->x:Lbc3/r;

    return-void
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 1

    const-string v0, "child"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic cancel()V
    .locals 1

    .line 1
    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->cancel()V

    return-void
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    .line 2
    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final synthetic cancel(Ljava/lang/Throwable;)Z
    .locals 1

    .line 3
    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->cancel(Ljava/lang/Throwable;)Z

    move-result p1

    return p1
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    const-string v0, "operation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1, p2}, Lq83/j;->fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getChildren()Lxb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Lq83/i;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lq83/h;->getKey()Lq83/i;

    move-result-object v0

    return-object v0
.end method

.method public final getOnJoin()Llc3/c;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getOnJoin()Llc3/c;

    move-result-object v0

    return-object v0
.end method

.method public final getParent()Lbc3/k1;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->getParent()Lbc3/k1;

    move-result-object v0

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 1
    const-string v0, "handler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 2
    const-string v0, "handler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1, p2, p3}, Lbc3/k1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->minusKey(Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final parentCancelled(Lbc3/b2;)V
    .locals 1

    const-string v0, "parentJob"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/r;->parentCancelled(Lbc3/b2;)V

    return-void
.end method

.method public final plus(Lbc3/k1;)Lbc3/k1;
    .locals 1

    .line 1
    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lbc3/k1;->plus(Lbc3/k1;)Lbc3/k1;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 1

    iget-object v0, p0, Ld53/a;->x:Lbc3/r;

    invoke-interface {v0}, Lbc3/k1;->start()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    const-string v0, "UserChildJob(userId=\'"

    const-string v1, "\')"

    iget-object v2, p0, Ld53/a;->w:Ljava/lang/String;

    invoke-static {v0, v2, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
