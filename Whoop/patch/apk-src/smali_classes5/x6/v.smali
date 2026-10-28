.class public final Lx6/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx6/u;
.implements Lbc3/c0;


# instance fields
.field public final synthetic E:Lc93/m;

.field public final synthetic F:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic w:Lbc3/c0;

.field public final x:Ljava/util/concurrent/atomic/AtomicReference;

.field public final synthetic y:Lux/f0;

.field public final synthetic z:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lux/f0;Lbc3/c0;Lc93/m;Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lx6/v;->y:Lux/f0;

    iput-object p3, p0, Lx6/v;->z:Lbc3/c0;

    iput-object p4, p0, Lx6/v;->E:Lc93/m;

    iput-object p5, p0, Lx6/v;->F:Ljava/util/concurrent/atomic/AtomicReference;

    iput-object p1, p0, Lx6/v;->w:Lbc3/c0;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object p1, p0, Lx6/v;->x:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a()J
    .locals 4

    iget-object v0, p0, Lx6/v;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object v2, p0, Lx6/v;->y:Lux/f0;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v0, v2

    sget-object v2, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v2, Lkotlin/time/DurationUnit;->MILLISECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    return-wide v0

    :cond_0
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    invoke-virtual {v0}, Lkotlin/time/Duration$Companion;->getINFINITE-UwyO8pc()J

    move-result-wide v0

    return-wide v0
.end method

.method public final b(J)V
    .locals 7

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-gtz v0, :cond_0

    new-instance p1, Landroidx/glance/session/TimeoutCancellationException;

    iget-object p2, p0, Lx6/v;->E:Lc93/m;

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result p2

    const-string v0, "Timed out immediately"

    invoke-direct {p1, v0, p2}, Landroidx/glance/session/TimeoutCancellationException;-><init>(Ljava/lang/String;I)V

    iget-object p2, p0, Lx6/v;->z:Lbc3/c0;

    invoke-static {p2, p1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lx6/v;->a()J

    move-result-wide v0

    invoke-static {v0, v1, p1, p2}, Lkotlin/time/Duration;->compareTo-LRDsOJo(JJ)I

    move-result v0

    if-gez v0, :cond_1

    move-object v1, p0

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lx6/v;->y:Lux/f0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p1

    add-long/2addr p1, v0

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iget-object p2, p0, Lx6/v;->x:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p2, p1}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    new-instance v0, Lp33/m;

    const/4 v5, 0x0

    const/16 v6, 0xe

    iget-object v2, p0, Lx6/v;->y:Lux/f0;

    iget-object v3, p0, Lx6/v;->z:Lbc3/c0;

    iget-object v4, p0, Lx6/v;->E:Lc93/m;

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lp33/m;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    const/4 p2, 0x0

    invoke-static {v3, p2, p2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iget-object v0, v1, Lx6/v;->F:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_2

    invoke-interface {p1, p2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    :goto_0
    return-void
.end method

.method public final getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lx6/v;->w:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    return-object v0
.end method
