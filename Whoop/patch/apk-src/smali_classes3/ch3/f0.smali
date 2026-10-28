.class public final Lch3/f0;
.super Ljava/util/concurrent/atomic/AtomicLong;
.source "SourceFile"

# interfaces
.implements Lxg3/i;


# instance fields
.field public final w:Lch3/g0;


# direct methods
.method public constructor <init>(Lch3/g0;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/concurrent/atomic/AtomicLong;-><init>()V

    iput-object p1, p0, Lch3/f0;->w:Lch3/g0;

    return-void
.end method


# virtual methods
.method public final request(J)V
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicLong;->get()J

    move-result-wide v0

    const-wide v2, 0x7fffffffffffffffL

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    iget-object p1, p0, Lch3/f0;->w:Lch3/g0;

    invoke-virtual {p1}, Lch3/g0;->h()V

    return-void

    :cond_1
    if-ltz v0, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "n >= 0 required"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
