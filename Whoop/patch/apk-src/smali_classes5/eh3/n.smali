.class public final Leh3/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/t;


# instance fields
.field public final w:Ljava/util/concurrent/Future;

.field public final synthetic x:Leh3/p;


# direct methods
.method public constructor <init>(Leh3/p;Ljava/util/concurrent/Future;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Leh3/n;->x:Leh3/p;

    iput-object p2, p0, Leh3/n;->w:Ljava/util/concurrent/Future;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Leh3/n;->w:Ljava/util/concurrent/Future;

    invoke-interface {v0}, Ljava/util/concurrent/Future;->isCancelled()Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 3

    iget-object v0, p0, Leh3/n;->x:Leh3/p;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iget-object v2, p0, Leh3/n;->w:Ljava/util/concurrent/Future;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void

    :cond_0
    const/4 v0, 0x0

    invoke-interface {v2, v0}, Ljava/util/concurrent/Future;->cancel(Z)Z

    return-void
.end method
