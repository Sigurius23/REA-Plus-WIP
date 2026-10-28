.class public final Lsn/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lsn/s;
.implements Lsn/r;


# instance fields
.field public final w:Lsn/s;

.field public final x:J

.field public y:Lsn/r;


# direct methods
.method public constructor <init>(Lsn/s;J)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsn/c0;->w:Lsn/s;

    iput-wide p2, p0, Lsn/c0;->x:J

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/t0;->a()Z

    move-result v0

    return v0
.end method

.method public final b(Lsn/r;J)V
    .locals 2

    iput-object p1, p0, Lsn/c0;->y:Lsn/r;

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p2, v0

    iget-object p1, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {p1, p0, p2, p3}, Lsn/s;->b(Lsn/r;J)V

    return-void
.end method

.method public final c(Lsn/t0;)V
    .locals 0

    check-cast p1, Lsn/s;

    iget-object p1, p0, Lsn/c0;->y:Lsn/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lsn/s0;->c(Lsn/t0;)V

    return-void
.end method

.method public final d()J
    .locals 5

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/t0;->d()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lsn/c0;->x:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final e(J)J
    .locals 3

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p1, v0

    iget-object v2, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v2, p1, p2}, Lsn/s;->e(J)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method

.method public final f()J
    .locals 5

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/s;->f()J

    move-result-wide v0

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lsn/c0;->x:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final g(Lsn/s;)V
    .locals 0

    iget-object p1, p0, Lsn/c0;->y:Lsn/r;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1, p0}, Lsn/r;->g(Lsn/s;)V

    return-void
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/s;->h()V

    return-void
.end method

.method public final i(J)V
    .locals 2

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0, p1, p2}, Lsn/s;->i(J)V

    return-void
.end method

.method public final j([Lio/o;[Z[Lsn/r0;[ZJ)J
    .locals 11

    array-length v0, p3

    new-array v4, v0, [Lsn/r0;

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    array-length v2, p3

    const/4 v8, 0x0

    if-ge v1, v2, :cond_1

    aget-object v2, p3, v1

    check-cast v2, Lsn/d0;

    if-eqz v2, :cond_0

    iget-object v8, v2, Lsn/d0;->w:Lsn/r0;

    :cond_0
    aput-object v8, v4, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v1, p0, Lsn/c0;->w:Lsn/s;

    iget-wide v9, p0, Lsn/c0;->x:J

    sub-long v6, p5, v9

    move-object v2, p1

    move-object v3, p2

    move-object v5, p4

    invoke-interface/range {v1 .. v7}, Lsn/s;->j([Lio/o;[Z[Lsn/r0;[ZJ)J

    move-result-wide p1

    :goto_1
    array-length v1, p3

    if-ge v0, v1, :cond_5

    aget-object v1, v4, v0

    if-nez v1, :cond_2

    aput-object v8, p3, v0

    goto :goto_2

    :cond_2
    aget-object v2, p3, v0

    if-eqz v2, :cond_3

    check-cast v2, Lsn/d0;

    iget-object v2, v2, Lsn/d0;->w:Lsn/r0;

    if-eq v2, v1, :cond_4

    :cond_3
    new-instance v2, Lsn/d0;

    invoke-direct {v2, v1, v9, v10}, Lsn/d0;-><init>(Lsn/r0;J)V

    aput-object v2, p3, v0

    :cond_4
    :goto_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_5
    add-long/2addr p1, v9

    return-wide p1
.end method

.method public final k()Lsn/x0;
    .locals 1

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/s;->k()Lsn/x0;

    move-result-object v0

    return-object v0
.end method

.method public final m()J
    .locals 5

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0}, Lsn/t0;->m()J

    move-result-wide v0

    const-wide/high16 v2, -0x8000000000000000L

    cmp-long v4, v0, v2

    if-nez v4, :cond_0

    return-wide v2

    :cond_0
    iget-wide v2, p0, Lsn/c0;->x:J

    add-long/2addr v0, v2

    return-wide v0
.end method

.method public final n(J)V
    .locals 2

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0, p1, p2}, Lsn/t0;->n(J)V

    return-void
.end method

.method public final u(J)Z
    .locals 2

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p1, v0

    iget-object v0, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v0, p1, p2}, Lsn/t0;->u(J)Z

    move-result p1

    return p1
.end method

.method public final v(JLrm/h1;)J
    .locals 3

    iget-wide v0, p0, Lsn/c0;->x:J

    sub-long/2addr p1, v0

    iget-object v2, p0, Lsn/c0;->w:Lsn/s;

    invoke-interface {v2, p1, p2, p3}, Lsn/s;->v(JLrm/h1;)J

    move-result-wide p1

    add-long/2addr p1, v0

    return-wide p1
.end method
