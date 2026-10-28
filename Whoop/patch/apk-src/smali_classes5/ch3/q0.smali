.class public final Lch3/q0;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:J

.field public final synthetic G:Lxg3/s;

.field public final synthetic H:Ldh3/a;

.field public final synthetic I:Lmh3/b;

.field public final synthetic J:Lch3/b0;


# direct methods
.method public constructor <init>(Lch3/b0;Lxg3/s;Ldh3/a;Lmh3/b;)V
    .locals 0

    iput-object p1, p0, Lch3/q0;->J:Lch3/b0;

    iput-object p2, p0, Lch3/q0;->G:Lxg3/s;

    iput-object p3, p0, Lch3/q0;->H:Ldh3/a;

    iput-object p4, p0, Lch3/q0;->I:Lmh3/b;

    invoke-direct {p0}, Lxg3/s;-><init>()V

    return-void
.end method


# virtual methods
.method public final f(Lxg3/i;)V
    .locals 1

    iget-object v0, p0, Lch3/q0;->H:Ldh3/a;

    invoke-virtual {v0, p1}, Ldh3/a;->c(Lxg3/i;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 1

    iget-boolean v0, p0, Lch3/q0;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/q0;->E:Z

    iget-object v0, p0, Lch3/q0;->G:Lxg3/s;

    invoke-interface {v0}, Lxg3/h;->onCompleted()V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 5

    iget-boolean v0, p0, Lch3/q0;->E:Z

    if-eqz v0, :cond_0

    invoke-static {p1}, Ldt/b;->V(Ljava/lang/Throwable;)V

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lch3/q0;->E:Z

    :try_start_0
    invoke-virtual {p0}, Lxg3/s;->b()V

    new-instance v0, Lch3/p0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lch3/p0;-><init>(Lxg3/s;I)V

    iget-object v1, p0, Lch3/q0;->I:Lmh3/b;

    iget-object v1, v1, Lmh3/b;->x:Ljava/util/concurrent/atomic/AtomicReference;

    check-cast v1, Lfh3/a;

    invoke-virtual {v1, v0}, Lfh3/a;->c(Lxg3/t;)V

    iget-wide v1, p0, Lch3/q0;->F:J

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-eqz v3, :cond_1

    iget-object v3, p0, Lch3/q0;->H:Ldh3/a;

    invoke-virtual {v3, v1, v2}, Ldh3/a;->b(J)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    iget-object v1, p0, Lch3/q0;->J:Lch3/b0;

    iget-object v1, v1, Lch3/b0;->x:Ljava/lang/Object;

    check-cast v1, Lbu/c;

    invoke-virtual {v1, p1}, Lbu/c;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxg3/g;

    invoke-virtual {p1, v0}, Lxg3/g;->W(Lxg3/s;)Lxg3/t;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_1
    iget-object v0, p0, Lch3/q0;->G:Lxg3/s;

    invoke-static {p1, v0}, Ldt/b;->W(Ljava/lang/Throwable;Lxg3/h;)V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget-boolean v0, p0, Lch3/q0;->E:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lch3/q0;->F:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lch3/q0;->F:J

    iget-object v0, p0, Lch3/q0;->G:Lxg3/s;

    invoke-interface {v0, p1}, Lxg3/h;->onNext(Ljava/lang/Object;)V

    return-void
.end method
