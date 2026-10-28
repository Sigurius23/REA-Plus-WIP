.class public final Lbc3/n1;
.super Lbc3/m;
.source "SourceFile"


# instance fields
.field public final I:Lbc3/t1;


# direct methods
.method public constructor <init>(Lq83/d;Lbc3/t1;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0, p1}, Lbc3/m;-><init>(ILq83/d;)V

    iput-object p2, p0, Lbc3/n1;->I:Lbc3/t1;

    return-void
.end method


# virtual methods
.method public final q(Lbc3/t1;)Ljava/lang/Throwable;
    .locals 2

    iget-object v0, p0, Lbc3/n1;->I:Lbc3/t1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lbc3/t1;->w:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lbc3/p1;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lbc3/p1;

    invoke-virtual {v1}, Lbc3/p1;->c()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    instance-of v1, v0, Lbc3/w;

    if-eqz v1, :cond_1

    check-cast v0, Lbc3/w;

    iget-object p1, v0, Lbc3/w;->a:Ljava/lang/Throwable;

    return-object p1

    :cond_1
    invoke-virtual {p1}, Lbc3/t1;->getCancellationException()Ljava/util/concurrent/CancellationException;

    move-result-object p1

    return-object p1
.end method

.method public final z()Ljava/lang/String;
    .locals 1

    const-string v0, "AwaitContinuation"

    return-object v0
.end method
