.class public final Lne3/i0;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field public final synthetic w:Lne3/j0;


# direct methods
.method public constructor <init>(Lne3/j0;)V
    .locals 0

    iput-object p1, p0, Lne3/i0;->w:Lne3/j0;

    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    return-void
.end method


# virtual methods
.method public final available()I
    .locals 4

    iget-object v0, p0, Lne3/i0;->w:Lne3/j0;

    iget-boolean v1, v0, Lne3/j0;->y:Z

    if-nez v1, :cond_0

    iget-object v0, v0, Lne3/j0;->x:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    const v2, 0x7fffffff

    int-to-long v2, v2

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v0

    long-to-int v0, v0

    return v0

    :cond_0
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final close()V
    .locals 1

    iget-object v0, p0, Lne3/i0;->w:Lne3/j0;

    invoke-virtual {v0}, Lne3/j0;->close()V

    return-void
.end method

.method public final read()I
    .locals 6

    .line 1
    iget-object v0, p0, Lne3/i0;->w:Lne3/j0;

    iget-object v1, v0, Lne3/j0;->x:Lne3/h;

    iget-boolean v2, v0, Lne3/j0;->y:Z

    if-nez v2, :cond_1

    .line 2
    iget-wide v2, v1, Lne3/h;->x:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 3
    iget-object v0, v0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 4
    :cond_0
    invoke-virtual {v1}, Lne3/h;->readByte()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0

    .line 5
    :cond_1
    new-instance v0, Ljava/io/IOException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final read([BII)I
    .locals 9

    const-string v0, "data"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    iget-object v0, p0, Lne3/i0;->w:Lne3/j0;

    iget-object v1, v0, Lne3/j0;->x:Lne3/h;

    iget-boolean v2, v0, Lne3/j0;->y:Z

    if-nez v2, :cond_1

    .line 7
    array-length v2, p1

    int-to-long v3, v2

    int-to-long v5, p2

    int-to-long v7, p3

    invoke-static/range {v3 .. v8}, Lne3/b;->e(JJJ)V

    .line 8
    iget-wide v2, v1, Lne3/h;->x:J

    const-wide/16 v4, 0x0

    cmp-long v2, v2, v4

    if-nez v2, :cond_0

    .line 9
    iget-object v0, v0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v2, 0x2000

    invoke-interface {v0, v1, v2, v3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v2

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    const/4 p1, -0x1

    return p1

    .line 10
    :cond_0
    invoke-virtual {v1, p1, p2, p3}, Lne3/h;->read([BII)I

    move-result p1

    return p1

    .line 11
    :cond_1
    new-instance p1, Ljava/io/IOException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lne3/i0;->w:Lne3/j0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".inputStream()"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final transferTo(Ljava/io/OutputStream;)J
    .locals 10

    const-string v0, "out"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lne3/i0;->w:Lne3/j0;

    iget-object v1, v0, Lne3/j0;->x:Lne3/h;

    iget-boolean v2, v0, Lne3/j0;->y:Z

    if-nez v2, :cond_2

    const-wide/16 v2, 0x0

    move-wide v4, v2

    :goto_0
    iget-wide v6, v1, Lne3/h;->x:J

    cmp-long v6, v6, v2

    if-nez v6, :cond_1

    iget-object v6, v0, Lne3/j0;->w:Lne3/p0;

    const-wide/16 v7, 0x2000

    invoke-interface {v6, v1, v7, v8}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide v6

    const-wide/16 v8, -0x1

    cmp-long v6, v6, v8

    if-eqz v6, :cond_0

    goto :goto_1

    :cond_0
    return-wide v4

    :cond_1
    :goto_1
    iget-wide v6, v1, Lne3/h;->x:J

    add-long/2addr v4, v6

    invoke-virtual {v1, p1, v6, v7}, Lne3/h;->s1(Ljava/io/OutputStream;J)V

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/io/IOException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
