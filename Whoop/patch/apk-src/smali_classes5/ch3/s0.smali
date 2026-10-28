.class public final Lch3/s0;
.super Lxg3/s;
.source "SourceFile"

# interfaces
.implements Lbh3/a;


# instance fields
.field public final E:Lxg3/s;

.field public final F:Z

.field public final G:Lxg3/j;

.field public H:Lxg3/g;

.field public I:Ljava/lang/Thread;


# direct methods
.method public constructor <init>(Lxg3/s;ZLxg3/j;Lxg3/g;)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/s0;->E:Lxg3/s;

    iput-boolean p2, p0, Lch3/s0;->F:Z

    iput-object p3, p0, Lch3/s0;->G:Lxg3/j;

    iput-object p4, p0, Lch3/s0;->H:Lxg3/g;

    return-void
.end method


# virtual methods
.method public final call()V
    .locals 2

    iget-object v0, p0, Lch3/s0;->H:Lxg3/g;

    const/4 v1, 0x0

    iput-object v1, p0, Lch3/s0;->H:Lxg3/g;

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    iput-object v1, p0, Lch3/s0;->I:Ljava/lang/Thread;

    invoke-virtual {v0, p0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;

    return-void
.end method

.method public final f(Lxg3/i;)V
    .locals 2

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0, p1}, Lcom/google/crypto/tink/internal/l0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iget-object p1, p0, Lch3/s0;->E:Lxg3/s;

    invoke-virtual {p1, v0}, Lxg3/s;->f(Lxg3/i;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 2

    iget-object v0, p0, Lch3/s0;->G:Lxg3/j;

    :try_start_0
    iget-object v1, p0, Lch3/s0;->E:Lxg3/s;

    invoke-interface {v1}, Lxg3/h;->onCompleted()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lxg3/t;->b()V

    return-void

    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lxg3/t;->b()V

    throw v1
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lch3/s0;->G:Lxg3/j;

    :try_start_0
    iget-object v1, p0, Lch3/s0;->E:Lxg3/s;

    invoke-interface {v1, p1}, Lxg3/h;->onError(Ljava/lang/Throwable;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v0}, Lxg3/t;->b()V

    return-void

    :catchall_0
    move-exception p1

    invoke-interface {v0}, Lxg3/t;->b()V

    throw p1
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lch3/s0;->E:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void
.end method
