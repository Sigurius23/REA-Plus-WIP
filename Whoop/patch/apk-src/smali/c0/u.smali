.class public final Lc0/u;
.super Lc0/k1;
.source "SourceFile"


# instance fields
.field public P:Ld0/s1;

.field public Q:Lp1/c1;

.field public R:Lc0/x;

.field public S:J


# virtual methods
.method public final R0()V
    .locals 2

    sget-wide v0, Landroidx/compose/animation/a;->a:J

    iput-wide v0, p0, Lc0/u;->S:J

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 7

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p3

    const-wide v0, 0xffffffffL

    const/16 p4, 0x20

    if-eqz p3, :cond_0

    iget p3, p2, Ly2/j1;->w:I

    iget v2, p2, Ly2/j1;->x:I

    int-to-long v3, p3

    shl-long/2addr v3, p4

    int-to-long v5, v2

    and-long/2addr v5, v0

    or-long v2, v3, v5

    goto :goto_0

    :cond_0
    iget-object p3, p0, Lc0/u;->P:Ld0/s1;

    if-nez p3, :cond_1

    iget p3, p2, Ly2/j1;->w:I

    iget v2, p2, Ly2/j1;->x:I

    int-to-long v3, p3

    shl-long/2addr v3, p4

    int-to-long v5, v2

    and-long/2addr v5, v0

    or-long v2, v3, v5

    iput-wide v2, p0, Lc0/u;->S:J

    goto :goto_0

    :cond_1
    iget v2, p2, Ly2/j1;->w:I

    iget v3, p2, Ly2/j1;->x:I

    int-to-long v4, v2

    shl-long/2addr v4, p4

    int-to-long v2, v3

    and-long/2addr v2, v0

    or-long/2addr v2, v4

    new-instance v4, Lc0/t;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v2, v3, v5}, Lc0/t;-><init>(Lc0/u;JI)V

    new-instance v5, Lc0/t;

    const/4 v6, 0x1

    invoke-direct {v5, p0, v2, v3, v6}, Lc0/t;-><init>(Lc0/u;JI)V

    invoke-virtual {p3, v4, v5}, Ld0/s1;->a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ld0/r1;

    move-result-object p3

    iget-object v2, p0, Lc0/u;->R:Lc0/x;

    iput-object p3, v2, Lc0/x;->f:Ld0/r1;

    invoke-virtual {p3}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/l;

    iget-wide v2, v2, Ly3/l;->a:J

    invoke-virtual {p3}, Ld0/r1;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ly3/l;

    iget-wide v4, p3, Ly3/l;->a:J

    iput-wide v4, p0, Lc0/u;->S:J

    :goto_0
    shr-long p3, v2, p4

    long-to-int p3, p3

    and-long/2addr v0, v2

    long-to-int p4, v0

    new-instance v0, Lc0/s;

    invoke-direct {v0, p0, p2, v2, v3}, Lc0/s;-><init>(Lc0/u;Ly2/j1;J)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
