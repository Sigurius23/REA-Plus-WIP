.class public final Lio/ktor/utils/io/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbc3/k1;


# instance fields
.field public final w:Lbc3/c2;

.field public final x:Lio/ktor/utils/io/m;


# direct methods
.method public constructor <init>(Lbc3/c2;Lio/ktor/utils/io/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    iput-object p2, p0, Lio/ktor/utils/io/t;->x:Lio/ktor/utils/io/m;

    return-void
.end method


# virtual methods
.method public final attachChild(Lbc3/r;)Lbc3/p;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, p1}, Lbc3/t1;->attachChild(Lbc3/r;)Lbc3/p;

    move-result-object p1

    return-object p1
.end method

.method public final cancel(Ljava/util/concurrent/CancellationException;)V
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, p1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    return-void
.end method

.method public final fold(Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-static {v0, p1, p2}, Le93/b;->B(Lq83/h;Ljava/lang/Object;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final get(Lq83/i;)Lq83/h;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-static {v0, p1}, Le93/b;->D(Lq83/h;Lq83/i;)Lq83/h;

    move-result-object p1

    return-object p1
.end method

.method public final getCancellationException()Ljava/util/concurrent/CancellationException;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object v0

    return-object v0
.end method

.method public final getChildren()Lxb3/i;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->getChildren()Lxb3/i;

    move-result-object v0

    return-object v0
.end method

.method public final getKey()Lq83/i;
    .locals 1

    sget-object v0, Lbc3/j1;->w:Lbc3/j1;

    return-object v0
.end method

.method public final invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 1
    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, p1}, Lbc3/t1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;
    .locals 1

    .line 2
    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, p1, p2, p3}, Lbc3/t1;->invokeOnCompletion(ZZLkotlin/jvm/functions/Function1;)Lbc3/s0;

    move-result-object p1

    return-object p1
.end method

.method public final isActive()Z
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->isActive()Z

    move-result v0

    return v0
.end method

.method public final isCancelled()Z
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final isCompleted()Z
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->isCompleted()Z

    move-result v0

    return v0
.end method

.method public final join(Lq83/d;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, p1}, Lbc3/t1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final minusKey(Lq83/i;)Lq83/j;
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-static {v0, p1}, Le93/b;->Q(Lq83/h;Lq83/i;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final plus(Lq83/j;)Lq83/j;
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-static {v0, p1}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object p1

    return-object p1
.end method

.method public final start()Z
    .locals 1

    iget-object v0, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0}, Lbc3/t1;->start()Z

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ChannelJob["

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lio/ktor/utils/io/t;->w:Lbc3/c2;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
