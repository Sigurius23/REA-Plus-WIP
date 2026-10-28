.class public final Llh3/f;
.super Ljava/util/concurrent/atomic/AtomicInteger;
.source "SourceFile"

# interfaces
.implements Lxg3/i;
.implements Lxg3/t;


# instance fields
.field public final w:Lxg3/s;

.field public final x:Ljava/util/concurrent/atomic/AtomicLong;

.field public final y:Llh3/d;

.field public z:Llh3/g;


# direct methods
.method public constructor <init>(Llh3/d;Lxg3/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    iput-object p2, p0, Llh3/f;->w:Lxg3/s;

    new-instance p2, Ljava/util/concurrent/atomic/AtomicLong;

    invoke-direct {p2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p2, p0, Llh3/f;->x:Ljava/util/concurrent/atomic/AtomicLong;

    iput-object p1, p0, Llh3/f;->y:Llh3/d;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Llh3/f;->w:Lxg3/s;

    invoke-virtual {v0}, Lxg3/s;->a()Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    iget-object v0, p0, Llh3/f;->y:Llh3/d;

    invoke-virtual {v0, p0}, Llh3/d;->c(Llh3/f;)V

    return-void
.end method

.method public final request(J)V
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_0

    iget-object v0, p0, Llh3/f;->x:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Llh3/f;->y:Llh3/d;

    iget-object p1, p1, Llh3/d;->x:Ljava/lang/Object;

    check-cast p1, Llh3/h;

    invoke-virtual {p1, p0}, Llh3/h;->a(Llh3/f;)V

    return-void

    :cond_0
    if-ltz v0, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "n >= required but it was "

    invoke-static {p1, p2, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
