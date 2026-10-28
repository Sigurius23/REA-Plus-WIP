.class public final Lrx/internal/util/unsafe/d;
.super Lrx/internal/util/unsafe/h;
.source "SourceFile"


# direct methods
.method public constructor <init>(I)V
    .locals 1

    invoke-direct {p0, p1}, Lrx/internal/util/unsafe/a;-><init>(I)V

    div-int/lit8 p1, p1, 0x4

    sget-object v0, Lrx/internal/util/unsafe/f;->F:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    return-void
.end method


# virtual methods
.method public final e()J
    .locals 3

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    sget-wide v1, Lrx/internal/util/unsafe/e;->H:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()J
    .locals 3

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    sget-wide v1, Lrx/internal/util/unsafe/i;->G:J

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLongVolatile(Ljava/lang/Object;J)J

    move-result-wide v0

    return-wide v0
.end method

.method public final g(J)V
    .locals 6

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    sget-wide v2, Lrx/internal/util/unsafe/e;->H:J

    move-object v1, p0

    move-wide v4, p1

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putOrderedLong(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public final isEmpty()Z
    .locals 4

    invoke-virtual {p0}, Lrx/internal/util/unsafe/d;->f()J

    move-result-wide v0

    invoke-virtual {p0}, Lrx/internal/util/unsafe/d;->e()J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final j(J)V
    .locals 6

    sget-object v0, Lrx/internal/util/unsafe/j;->a:Lsun/misc/Unsafe;

    sget-wide v2, Lrx/internal/util/unsafe/i;->G:J

    move-object v1, p0

    move-wide v4, p1

    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putOrderedLong(Ljava/lang/Object;JJ)V

    return-void
.end method

.method public final offer(Ljava/lang/Object;)Z
    .locals 6

    if-eqz p1, :cond_1

    iget-wide v0, p0, Lrx/internal/util/unsafe/i;->producerIndex:J

    invoke-virtual {p0, v0, v1}, Lrx/internal/util/unsafe/a;->a(J)J

    move-result-wide v2

    iget-object v4, p0, Lrx/internal/util/unsafe/a;->x:[Ljava/lang/Object;

    invoke-static {v4, v2, v3}, Lrx/internal/util/unsafe/a;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    if-eqz v5, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-static {v4, v2, v3, p1}, Lrx/internal/util/unsafe/a;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lrx/internal/util/unsafe/d;->j(J)V

    const/4 p1, 0x1

    return p1

    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null elements not allowed"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final peek()Ljava/lang/Object;
    .locals 3

    iget-wide v0, p0, Lrx/internal/util/unsafe/e;->consumerIndex:J

    invoke-virtual {p0, v0, v1}, Lrx/internal/util/unsafe/a;->a(J)J

    move-result-wide v0

    iget-object v2, p0, Lrx/internal/util/unsafe/a;->x:[Ljava/lang/Object;

    invoke-static {v2, v0, v1}, Lrx/internal/util/unsafe/a;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final poll()Ljava/lang/Object;
    .locals 7

    iget-wide v0, p0, Lrx/internal/util/unsafe/e;->consumerIndex:J

    invoke-virtual {p0, v0, v1}, Lrx/internal/util/unsafe/a;->a(J)J

    move-result-wide v2

    iget-object v4, p0, Lrx/internal/util/unsafe/a;->x:[Ljava/lang/Object;

    invoke-static {v4, v2, v3}, Lrx/internal/util/unsafe/a;->c([Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    const/4 v6, 0x0

    if-nez v5, :cond_0

    return-object v6

    :cond_0
    invoke-static {v4, v2, v3, v6}, Lrx/internal/util/unsafe/a;->d([Ljava/lang/Object;JLjava/lang/Object;)V

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-virtual {p0, v0, v1}, Lrx/internal/util/unsafe/d;->g(J)V

    return-object v5
.end method

.method public final size()I
    .locals 6

    invoke-virtual {p0}, Lrx/internal/util/unsafe/d;->e()J

    move-result-wide v0

    :goto_0
    invoke-virtual {p0}, Lrx/internal/util/unsafe/d;->f()J

    move-result-wide v2

    invoke-virtual {p0}, Lrx/internal/util/unsafe/d;->e()J

    move-result-wide v4

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    sub-long/2addr v2, v4

    long-to-int v0, v2

    return v0

    :cond_0
    move-wide v0, v4

    goto :goto_0
.end method
