.class public final Lf0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/util/concurrent/atomic/AtomicReference;

.field public final b:Lmc3/c;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lf0/c1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v0

    iput-object v0, p0, Lf0/c1;->b:Lmc3/c;

    return-void
.end method

.method public static final a(Lf0/c1;Lf0/a1;)V
    .locals 3

    iget-object p0, p0, Lf0/c1;->a:Ljava/util/concurrent/atomic/AtomicReference;

    :goto_0
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lf0/a1;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lf0/a1;->a:Lf0/z0;

    iget-object v2, v0, Lf0/a1;->a:Lf0/z0;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->compareTo(Ljava/lang/Enum;)I

    move-result v1

    if-ltz v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    const-string p1, "Current mutation had a higher priority"

    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    :goto_1
    invoke-virtual {p0, v0, p1}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    if-eqz v0, :cond_2

    iget-object p0, v0, Lf0/a1;->b:Lbc3/k1;

    new-instance p1, Landroidx/compose/foundation/MutationInterruptedException;

    invoke-direct {p1}, Landroidx/compose/foundation/MutationInterruptedException;-><init>()V

    invoke-interface {p0, p1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    return-void

    :cond_3
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v1

    if-eq v1, v0, :cond_1

    goto :goto_0
.end method

.method public static b(Lf0/c1;Lkotlin/jvm/functions/Function1;Ls83/i;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lf0/z0;->w:Lf0/z0;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Landroidx/lifecycle/g1;

    const/4 v2, 0x0

    invoke-direct {v1, v0, p0, p1, v2}, Landroidx/lifecycle/g1;-><init>(Lf0/z0;Lf0/c1;Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-static {v1, p2}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
