.class public final Lch3/i;
.super Lxg3/s;
.source "SourceFile"


# instance fields
.field public final E:Lch3/j;

.field public F:J


# direct methods
.method public constructor <init>(Lch3/j;)V
    .locals 0

    invoke-direct {p0}, Lxg3/s;-><init>()V

    iput-object p1, p0, Lch3/i;->E:Lch3/j;

    return-void
.end method


# virtual methods
.method public final f(Lxg3/i;)V
    .locals 1

    iget-object v0, p0, Lch3/i;->E:Lch3/j;

    iget-object v0, v0, Lch3/j;->G:Ldh3/a;

    invoke-virtual {v0, p1}, Ldh3/a;->c(Lxg3/i;)V

    return-void
.end method

.method public final onCompleted()V
    .locals 3

    iget-object v0, p0, Lch3/i;->E:Lch3/j;

    iget-wide v1, p0, Lch3/i;->F:J

    invoke-virtual {v0, v1, v2}, Lch3/j;->i(J)V

    return-void
.end method

.method public final onError(Ljava/lang/Throwable;)V
    .locals 2

    iget-object v0, p0, Lch3/i;->E:Lch3/j;

    iget-object v1, v0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {v1, p1}, Lgh3/c;->a(Ljava/util/concurrent/atomic/AtomicReference;Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {p1}, Ljh3/a;->a(Ljava/lang/Throwable;)V

    return-void

    :cond_0
    iget-object p1, v0, Lch3/j;->J:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-static {p1}, Lgh3/c;->c(Ljava/util/concurrent/atomic/AtomicReference;)Ljava/lang/Throwable;

    move-result-object p1

    invoke-static {p1}, Lgh3/c;->b(Ljava/lang/Throwable;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, v0, Lch3/j;->E:Lch3/o0;

    invoke-virtual {v1, p1}, Lch3/o0;->onError(Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v0}, Lxg3/s;->b()V

    return-void
.end method

.method public final onNext(Ljava/lang/Object;)V
    .locals 4

    iget-wide v0, p0, Lch3/i;->F:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lch3/i;->F:J

    iget-object v0, p0, Lch3/i;->E:Lch3/j;

    invoke-virtual {v0, p1}, Lch3/j;->j(Ljava/lang/Object;)V

    return-void
.end method
