.class public abstract Ly2/i1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly3/c;


# instance fields
.field public w:Z


# direct methods
.method public static final a(Ly2/j1;Ly2/i1;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    instance-of v0, p0, La3/i1;

    if-eqz v0, :cond_0

    check-cast p0, La3/i1;

    iget-boolean p1, p1, Ly2/i1;->w:Z

    invoke-interface {p0, p1}, La3/i1;->s(Z)V

    :cond_0
    return-void
.end method

.method public static synthetic g(Ly2/j1;IILy2/i1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p3, p0, p1, p2, v0}, Ly2/i1;->f(Ly2/j1;IIF)V

    return-void
.end method

.method public static k(Ly2/i1;Ly2/j1;J)V
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v0, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide p2

    const/4 p0, 0x0

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, p0, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static n(Ly2/j1;IILy2/i1;)V
    .locals 9

    int-to-long v0, p1

    const/16 p1, 0x20

    shl-long/2addr v0, p1

    int-to-long v2, p2

    const-wide v4, 0xffffffffL

    and-long/2addr v2, v4

    or-long/2addr v0, v2

    invoke-virtual {p3}, Ly2/i1;->c()Ly3/m;

    move-result-object p2

    sget-object v2, Ly3/m;->w:Ly3/m;

    const/4 v3, 0x0

    const/4 v6, 0x0

    if-eq p2, v2, :cond_1

    invoke-virtual {p3}, Ly2/i1;->e()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ly2/i1;->e()I

    move-result p2

    iget v2, p0, Ly2/j1;->w:I

    sub-int/2addr p2, v2

    shr-long v7, v0, p1

    long-to-int v2, v7

    sub-int/2addr p2, v2

    and-long/2addr v0, v4

    long-to-int v0, v0

    int-to-long v1, p2

    shl-long p1, v1, p1

    int-to-long v0, v0

    and-long/2addr v0, v4

    or-long/2addr p1, v0

    invoke-static {p0, p3}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v0, p0, Ly2/j1;->E:J

    invoke-static {p1, p2, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v3, v6}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    :goto_0
    invoke-static {p0, p3}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide p1, p0, Ly2/j1;->E:J

    invoke-static {v0, v1, p1, p2}, Ly3/j;->d(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v3, v6}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static o(Ly2/j1;IILy2/i1;)V
    .locals 9

    sget v0, Ly2/l1;->b:I

    sget-object v0, Ly2/k1;->x:Ly2/k1;

    int-to-long v1, p1

    const/16 p1, 0x20

    shl-long/2addr v1, p1

    int-to-long v3, p2

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    or-long/2addr v1, v3

    invoke-virtual {p3}, Ly2/i1;->c()Ly3/m;

    move-result-object p2

    sget-object v3, Ly3/m;->w:Ly3/m;

    const/4 v4, 0x0

    if-eq p2, v3, :cond_1

    invoke-virtual {p3}, Ly2/i1;->e()I

    move-result p2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p3}, Ly2/i1;->e()I

    move-result p2

    iget v3, p0, Ly2/j1;->w:I

    sub-int/2addr p2, v3

    shr-long v7, v1, p1

    long-to-int v3, v7

    sub-int/2addr p2, v3

    and-long/2addr v1, v5

    long-to-int v1, v1

    int-to-long v2, p2

    shl-long p1, v2, p1

    int-to-long v1, v1

    and-long/2addr v1, v5

    or-long/2addr p1, v1

    invoke-static {p0, p3}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v1, p0, Ly2/j1;->E:J

    invoke-static {p1, p2, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v4, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    :goto_0
    invoke-static {p0, p3}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide p1, p0, Ly2/j1;->E:J

    invoke-static {v1, v2, p1, p2}, Ly3/j;->d(JJ)J

    move-result-wide p1

    invoke-virtual {p0, p1, p2, v4, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static p(Ly2/i1;Ly2/j1;J)V
    .locals 8

    sget v0, Ly2/l1;->b:I

    sget-object v0, Ly2/k1;->x:Ly2/k1;

    invoke-virtual {p0}, Ly2/i1;->c()Ly3/m;

    move-result-object v1

    sget-object v2, Ly3/m;->w:Ly3/m;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Ly2/i1;->e()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ly2/i1;->e()I

    move-result v1

    iget v2, p1, Ly2/j1;->w:I

    sub-int/2addr v1, v2

    const/16 v2, 0x20

    shr-long v4, p2, v2

    long-to-int v4, v4

    sub-int/2addr v1, v4

    const-wide v4, 0xffffffffL

    and-long/2addr p2, v4

    long-to-int p2, p2

    int-to-long v6, v1

    shl-long v1, v6, v2

    int-to-long p2, p2

    and-long/2addr p2, v4

    or-long/2addr p2, v1

    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v1, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v3, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    :goto_0
    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v1, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, v3, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static synthetic s(Ly2/i1;Ly2/j1;IILkotlin/jvm/functions/Function1;I)V
    .locals 6

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    sget p4, Ly2/l1;->b:I

    sget-object p4, Ly2/k1;->x:Ly2/k1;

    :cond_0
    move-object v5, p4

    const/4 v4, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    invoke-virtual/range {v0 .. v5}, Ly2/i1;->r(Ly2/j1;IIFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static t(Ly2/i1;Ly2/j1;J)V
    .locals 3

    sget v0, Ly2/l1;->b:I

    sget-object v0, Ly2/k1;->x:Ly2/k1;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v1, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v1, v2}, Ly3/j;->d(JJ)J

    move-result-wide p2

    const/4 p0, 0x0

    invoke-virtual {p1, p2, p3, p0, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method


# virtual methods
.method public b(Ly2/o;)F
    .locals 0

    const/high16 p1, 0x7fc00000    # Float.NaN

    return p1
.end method

.method public abstract c()Ly3/m;
.end method

.method public abstract e()I
.end method

.method public final f(Ly2/j1;IIF)V
    .locals 4

    int-to-long v0, p2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    int-to-long p2, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p2, v2

    or-long/2addr p2, v0

    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v0, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide p2

    const/4 v0, 0x0

    invoke-virtual {p1, p2, p3, p4, v0}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final r(Ly2/j1;IIFLkotlin/jvm/functions/Function1;)V
    .locals 4

    int-to-long v0, p2

    const/16 p2, 0x20

    shl-long/2addr v0, p2

    int-to-long p2, p3

    const-wide v2, 0xffffffffL

    and-long/2addr p2, v2

    or-long/2addr p2, v0

    invoke-static {p1, p0}, Ly2/i1;->a(Ly2/j1;Ly2/i1;)V

    iget-wide v0, p1, Ly2/j1;->E:J

    invoke-static {p2, p3, v0, v1}, Ly3/j;->d(JJ)J

    move-result-wide p2

    invoke-virtual {p1, p2, p3, p4, p5}, Ly2/j1;->o0(JFLkotlin/jvm/functions/Function1;)V

    return-void
.end method
