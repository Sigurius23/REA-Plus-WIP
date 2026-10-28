.class public final Landroidx/fragment/app/a0;
.super Lj/d;
.source "SourceFile"


# instance fields
.field public final synthetic a:Ljava/util/concurrent/atomic/AtomicReference;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/fragment/app/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Operation cannot be started before fragment is in created state"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Landroidx/fragment/app/a0;->a:Ljava/util/concurrent/atomic/AtomicReference;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj/d;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lj/d;->b()V

    :cond_0
    return-void
.end method
