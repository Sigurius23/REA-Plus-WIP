.class public final Lne3/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lne3/j;


# instance fields
.field public final w:Lne3/p0;

.field public final x:Lne3/h;

.field public y:Z


# direct methods
.method public constructor <init>(Lne3/p0;)V
    .locals 1

    const-string v0, "source"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/j0;->w:Lne3/p0;

    new-instance p1, Lne3/h;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lne3/j0;->x:Lne3/h;

    return-void
.end method


# virtual methods
.method public final H0(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 2

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    iget-object v1, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v1, v0}, Lne3/h;->N0(Lne3/p0;)J

    invoke-virtual {v1, p1}, Lne3/h;->H0(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final I0(Lne3/l;)J
    .locals 8

    const-string v0, "bytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide v6, 0x7fffffffffffffffL

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result v3

    const-wide/16 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Loe3/b;->b(Lne3/j0;Lne3/l;IJJ)J

    move-result-wide v2

    return-wide v2
.end method

.method public final M(J)Ljava/lang/String;
    .locals 18

    move-wide/from16 v6, p1

    const-wide/16 v0, 0x0

    cmp-long v0, v6, v0

    if-ltz v0, :cond_3

    const-wide v8, 0x7fffffffffffffffL

    cmp-long v0, v6, v8

    const-wide/16 v10, 0x1

    if-nez v0, :cond_0

    move-wide v4, v8

    goto :goto_0

    :cond_0
    add-long v0, v6, v10

    move-wide v4, v0

    :goto_0
    const/16 v1, 0xa

    const-wide/16 v2, 0x0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v5}, Lne3/j0;->b(BJJ)J

    move-result-wide v1

    const-wide/16 v12, -0x1

    cmp-long v3, v1, v12

    iget-object v12, v0, Lne3/j0;->x:Lne3/h;

    if-eqz v3, :cond_1

    invoke-static {v12, v1, v2}, Loe3/a;->c(Lne3/h;J)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_1
    cmp-long v1, v4, v8

    if-gez v1, :cond_2

    invoke-virtual {v0, v4, v5}, Lne3/j0;->request(J)Z

    move-result v1

    if-eqz v1, :cond_2

    sub-long v1, v4, v10

    invoke-virtual {v12, v1, v2}, Lne3/h;->s(J)B

    move-result v1

    const/16 v2, 0xd

    if-ne v1, v2, :cond_2

    add-long v1, v4, v10

    invoke-virtual {v0, v1, v2}, Lne3/j0;->request(J)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v12, v4, v5}, Lne3/h;->s(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_2

    invoke-static {v12, v4, v5}, Loe3/a;->c(Lne3/h;J)Ljava/lang/String;

    move-result-object v1

    return-object v1

    :cond_2
    new-instance v13, Lne3/h;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    iget-wide v1, v12, Lne3/h;->x:J

    const/16 v3, 0x20

    int-to-long v3, v3

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v16

    const-wide/16 v14, 0x0

    invoke-virtual/range {v12 .. v17}, Lne3/h;->k(Lne3/h;JJ)V

    new-instance v1, Ljava/io/EOFException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "\\n not found: limit="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v3, v12, Lne3/h;->x:J

    invoke-static {v3, v4, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v3, " content="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v3, v13, Lne3/h;->x:J

    invoke-virtual {v13, v3, v4}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v3

    invoke-virtual {v3}, Lne3/l;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x2026

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    move-object/from16 v0, p0

    const-string v1, "limit < 0: "

    invoke-static {v6, v7, v1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
.end method

.method public final P0(Lne3/i;)J
    .locals 10

    const-wide/16 v0, 0x0

    move-wide v2, v0

    :cond_0
    :goto_0
    iget-object v4, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v5, 0x2000

    iget-object v7, p0, Lne3/j0;->x:Lne3/h;

    invoke-interface {v4, v7, v5, v6}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v4

    const-wide/16 v8, -0x1

    cmp-long v4, v4, v8

    if-eqz v4, :cond_1

    invoke-virtual {v7}, Lne3/h;->h()J

    move-result-wide v4

    cmp-long v6, v4, v0

    if-lez v6, :cond_0

    add-long/2addr v2, v4

    invoke-interface {p1, v7, v4, v5}, Lne3/n0;->write(Lne3/h;J)V

    goto :goto_0

    :cond_1
    iget-wide v4, v7, Lne3/h;->x:J

    cmp-long v0, v4, v0

    if-lez v0, :cond_2

    add-long/2addr v2, v4

    invoke-interface {p1, v7, v4, v5}, Lne3/n0;->write(Lne3/h;J)V

    :cond_2
    return-wide v2
.end method

.method public final Q0()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->Q0()I

    move-result v0

    return v0
.end method

.method public final Y0(Lne3/c0;)I
    .locals 6

    const-string v0, "options"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_3

    :cond_0
    const/4 v0, 0x1

    iget-object v1, p0, Lne3/j0;->x:Lne3/h;

    invoke-static {v1, p1, v0}, Loe3/a;->d(Lne3/h;Lne3/c0;Z)I

    move-result v0

    const/4 v2, -0x2

    const/4 v3, -0x1

    if-eq v0, v2, :cond_1

    if-eq v0, v3, :cond_2

    iget-object p1, p1, Lne3/c0;->w:[Lne3/l;

    aget-object p1, p1, v0

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result p1

    int-to-long v2, p1

    invoke-virtual {v1, v2, v3}, Lne3/h;->skip(J)V

    return v0

    :cond_1
    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v4, 0x2000

    invoke-interface {v0, v1, v4, v5}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v0

    const-wide/16 v4, -0x1

    cmp-long v0, v0, v4

    if-nez v0, :cond_0

    :cond_2
    return v3

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b(BJJ)J
    .locals 9

    iget-boolean p2, p0, Lne3/j0;->y:Z

    if-nez p2, :cond_4

    const-wide/16 p2, 0x0

    cmp-long v0, p2, p4

    if-gtz v0, :cond_3

    move-wide v3, p2

    :goto_0
    cmp-long p2, v3, p4

    const-wide/16 v7, -0x1

    if-gez p2, :cond_2

    iget-object v1, p0, Lne3/j0;->x:Lne3/h;

    move v2, p1

    move-wide v5, p4

    invoke-virtual/range {v1 .. v6}, Lne3/h;->x(BJJ)J

    move-result-wide p1

    cmp-long p3, p1, v7

    if-eqz p3, :cond_0

    return-wide p1

    :cond_0
    iget-wide p1, v1, Lne3/h;->x:J

    cmp-long p3, p1, v5

    if-gez p3, :cond_2

    iget-object p3, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 p4, 0x2000

    invoke-interface {p3, v1, p4, p5}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide p3

    cmp-long p3, p3, v7

    if-nez p3, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {v3, v4, p1, p2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    move p1, v2

    move-wide p4, v5

    goto :goto_0

    :cond_2
    :goto_1
    return-wide v7

    :cond_3
    move-wide v5, p4

    const-string p1, "fromIndex=0 toIndex="

    invoke-static {v5, v6, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lne3/j0;->y:Z

    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->b()V

    :cond_0
    return-void
.end method

.method public final d0(JLne3/l;)Z
    .locals 8

    const-string v0, "bytes"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Lne3/l;->d()I

    move-result v3

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_5

    if-gez v3, :cond_0

    goto :goto_1

    :cond_0
    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-gez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p3}, Lne3/l;->d()I

    move-result v0

    if-le v3, v0, :cond_2

    goto :goto_1

    :cond_2
    if-nez v3, :cond_3

    goto :goto_0

    :cond_3
    const-wide/16 v0, 0x1

    add-long v6, p1, v0

    move-object v1, p0

    move-wide v4, p1

    move-object v2, p3

    invoke-static/range {v1 .. v7}, Loe3/b;->b(Lne3/j0;Lne3/l;IJJ)J

    move-result-wide p1

    const-wide/16 v0, -0x1

    cmp-long p1, p1, v0

    if-eqz p1, :cond_4

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x0

    return p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final e0()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->e0()J

    move-result-wide v0

    return-wide v0
.end method

.method public final f()Lne3/h;
    .locals 1

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    return-object v0
.end method

.method public final f0(Lne3/l;)J
    .locals 10

    const-string v0, "targetBytes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_2

    const-wide/16 v0, 0x0

    :goto_0
    iget-object v2, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v2, v0, v1, p1}, Lne3/h;->J(JLne3/l;)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_0

    return-wide v3

    :cond_0
    iget-wide v3, v2, Lne3/h;->x:J

    iget-object v7, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v8, 0x2000

    invoke-interface {v7, v2, v8, v9}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v7

    cmp-long v2, v7, v5

    if-nez v2, :cond_1

    return-wide v5

    :cond_1
    invoke-static {v0, v1, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g0(J)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Lne3/j0;->request(J)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1
.end method

.method public final h()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->x0()S

    move-result v0

    return v0
.end method

.method public final h1(Lne3/h;J)J
    .locals 6

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_3

    iget-boolean v3, p0, Lne3/j0;->y:Z

    if-nez v3, :cond_2

    iget-object v3, p0, Lne3/j0;->x:Lne3/h;

    iget-wide v4, v3, Lne3/h;->x:J

    cmp-long v4, v4, v0

    if-nez v4, :cond_1

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v1, 0x2000

    invoke-interface {v0, v3, v1, v2}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v0

    const-wide/16 v4, -0x1

    cmp-long v0, v0, v4

    if-nez v0, :cond_1

    return-wide v4

    :cond_1
    iget-wide v0, v3, Lne3/h;->x:J

    invoke-static {p2, p3, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-virtual {v3, p1, p2, p3}, Lne3/h;->h1(Lne3/h;J)J

    move-result-wide p1

    return-wide p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string p1, "byteCount < 0: "

    invoke-static {p2, p3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final i1()Ljava/io/InputStream;
    .locals 1

    new-instance v0, Lne3/i0;

    invoke-direct {v0, p0}, Lne3/i0;-><init>(Lne3/j0;)V

    return-object v0
.end method

.method public final isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lne3/j0;->y:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final j0(Lne3/h;J)V
    .locals 1

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    :try_start_0
    invoke-virtual {p0, p2, p3}, Lne3/j0;->g0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p1, p2, p3}, Lne3/h;->j0(Lne3/h;J)V

    return-void

    :catch_0
    move-exception p2

    invoke-virtual {p1, v0}, Lne3/h;->N0(Lne3/p0;)J

    throw p2
.end method

.method public final k0(J)Ljava/lang/String;
    .locals 2

    invoke-virtual {p0, p1, p2}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v0, p1, p2, v1}, Lne3/h;->M0(JLjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final m0(J)Lne3/l;
    .locals 1

    invoke-virtual {p0, p1, p2}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0, p1, p2}, Lne3/h;->m0(J)Lne3/l;

    move-result-object p1

    return-object p1
.end method

.method public final n()[B
    .locals 4

    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    iget-object v1, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v1, v0}, Lne3/h;->N0(Lne3/p0;)J

    iget-wide v2, v1, Lne3/h;->x:J

    invoke-virtual {v1, v2, v3}, Lne3/h;->b0(J)[B

    move-result-object v0

    return-object v0
.end method

.method public final o()Z
    .locals 4

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->o()Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final peek()Lne3/j0;
    .locals 1

    new-instance v0, Lne3/f0;

    invoke-direct {v0, p0}, Lne3/f0;-><init>(Lne3/j;)V

    invoke-static {v0}, Lne3/b;->c(Lne3/p0;)Lne3/j0;

    move-result-object v0

    return-object v0
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 5

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    iget-wide v1, v0, Lne3/h;->x:J

    const-wide/16 v3, 0x0

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    iget-object v1, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v1

    const-wide/16 v3, -0x1

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    invoke-virtual {v0, p1}, Lne3/h;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method

.method public final readByte()B
    .locals 2

    const-wide/16 v0, 0x1

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->readByte()B

    move-result v0

    return v0
.end method

.method public final readFully([B)V
    .locals 7

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    const-string v1, "sink"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    array-length v1, p1

    int-to-long v1, v1

    invoke-virtual {p0, v1, v2}, Lne3/j0;->g0(J)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, p1}, Lne3/h;->readFully([B)V

    return-void

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    :goto_0
    iget-wide v3, v0, Lne3/h;->x:J

    const-wide/16 v5, 0x0

    cmp-long v5, v3, v5

    if-lez v5, :cond_1

    long-to-int v3, v3

    invoke-virtual {v0, p1, v2, v3}, Lne3/h;->read([BII)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_0

    add-int/2addr v2, v3

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_1
    throw v1
.end method

.method public final readInt()I
    .locals 2

    const-wide/16 v0, 0x4

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->readInt()I

    move-result v0

    return v0
.end method

.method public final readLong()J
    .locals 2

    const-wide/16 v0, 0x8

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->readLong()J

    move-result-wide v0

    return-wide v0
.end method

.method public final readShort()S
    .locals 2

    const-wide/16 v0, 0x2

    invoke-virtual {p0, v0, v1}, Lne3/j0;->g0(J)V

    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    invoke-virtual {v0}, Lne3/h;->readShort()S

    move-result v0

    return v0
.end method

.method public final request(J)Z
    .locals 4

    const-wide/16 v0, 0x0

    cmp-long v0, p1, v0

    if-ltz v0, :cond_3

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_2

    :cond_0
    iget-object v0, p0, Lne3/j0;->x:Lne3/h;

    iget-wide v1, v0, Lne3/h;->x:J

    cmp-long v1, v1, p1

    if-gez v1, :cond_1

    iget-object v1, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v2, 0x2000

    invoke-interface {v1, v0, v2, v3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    const-string v0, "byteCount < 0: "

    invoke-static {p1, p2, v0}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final skip(J)V
    .locals 5

    iget-boolean v0, p0, Lne3/j0;->y:Z

    if-nez v0, :cond_3

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_2

    iget-object v2, p0, Lne3/j0;->x:Lne3/h;

    iget-wide v3, v2, Lne3/h;->x:J

    cmp-long v0, v3, v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v3, 0x2000

    invoke-interface {v0, v2, v3, v4}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v0

    const-wide/16 v3, -0x1

    cmp-long v0, v0, v3

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    :cond_1
    :goto_1
    iget-wide v0, v2, Lne3/h;->x:J

    invoke-static {p1, p2, v0, v1}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    invoke-virtual {v2, v0, v1}, Lne3/h;->skip(J)V

    sub-long/2addr p1, v0

    goto :goto_0

    :cond_2
    return-void

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final timeout()Lne3/r0;
    .locals 1

    iget-object v0, p0, Lne3/j0;->w:Lne3/p0;

    invoke-interface {v0}, Lne3/p0;->timeout()Lne3/r0;

    move-result-object v0

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lne3/j0;->w:Lne3/p0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
