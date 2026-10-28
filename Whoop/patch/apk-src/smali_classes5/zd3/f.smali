.class public final Lzd3/f;
.super Lne3/s;
.source "SourceFile"


# instance fields
.field public E:Z

.field public F:Z

.field public G:Z

.field public final synthetic H:Lzd3/g;

.field public final x:J

.field public final y:Z

.field public z:J


# direct methods
.method public constructor <init>(Lzd3/g;Lne3/p0;JZ)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lzd3/f;->H:Lzd3/g;

    invoke-direct {p0, p2}, Lne3/s;-><init>(Lne3/p0;)V

    iput-wide p3, p0, Lzd3/f;->x:J

    iput-boolean p5, p0, Lzd3/f;->y:Z

    const/4 p1, 0x1

    iput-boolean p1, p0, Lzd3/f;->E:Z

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;

    :cond_0
    return-void
.end method


# virtual methods
.method public final b(Ljava/io/IOException;)Ljava/io/IOException;
    .locals 7

    iget-boolean v0, p0, Lzd3/f;->F:Z

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/f;->F:Z

    iget-object v1, p0, Lzd3/f;->H:Lzd3/g;

    if-nez p1, :cond_1

    iget-boolean v0, p0, Lzd3/f;->E:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lzd3/f;->E:Z

    iget-object v0, v1, Lzd3/g;->b:Lud3/a0;

    iget-object v2, v1, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {v0, v2}, Lud3/a0;->responseBodyStart(Lud3/j;)V

    :cond_1
    iget-wide v2, p0, Lzd3/f;->z:J

    iget-boolean v4, p0, Lzd3/f;->y:Z

    const/16 v6, 0x8

    move-object v5, p1

    invoke-static/range {v1 .. v6}, Lzd3/g;->a(Lzd3/g;JZLjava/io/IOException;I)Ljava/io/IOException;

    move-result-object p1

    return-object p1
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Lzd3/f;->G:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lzd3/f;->G:Z

    :try_start_0
    invoke-super {p0}, Lne3/s;->close()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    invoke-virtual {p0, v0}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw v0
.end method

.method public final h1(Lne3/h;J)J
    .locals 9

    const-string v0, "expected "

    const-string v1, "sink"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v1, p0, Lzd3/f;->G:Z

    if-nez v1, :cond_5

    :try_start_0
    iget-object v1, p0, Lne3/s;->w:Lne3/p0;

    invoke-interface {v1, p1, p2, p3}, Lne3/p0;->h1(Lne3/h;J)J

    move-result-wide p1

    iget-boolean p3, p0, Lzd3/f;->E:Z
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v1, p0, Lzd3/f;->H:Lzd3/g;

    if-eqz p3, :cond_0

    const/4 p3, 0x0

    :try_start_1
    iput-boolean p3, p0, Lzd3/f;->E:Z

    iget-object p3, v1, Lzd3/g;->b:Lud3/a0;

    iget-object v2, v1, Lzd3/g;->a:Lzd3/o;

    invoke-virtual {p3, v2}, Lud3/a0;->responseBodyStart(Lud3/j;)V

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_0
    const-wide/16 v2, -0x1

    cmp-long p3, p1, v2

    const/4 v4, 0x0

    if-nez p3, :cond_1

    invoke-virtual {p0, v4}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;

    return-wide v2

    :cond_1
    iget-wide v5, p0, Lzd3/f;->z:J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    add-long/2addr v5, p1

    iget-wide v7, p0, Lzd3/f;->x:J

    cmp-long p3, v7, v2

    if-eqz p3, :cond_3

    cmp-long p3, v5, v7

    if-gtz p3, :cond_2

    goto :goto_1

    :cond_2
    :try_start_2
    new-instance p1, Ljava/net/ProtocolException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p3, " bytes but received "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    :goto_1
    iput-wide v5, p0, Lzd3/f;->z:J

    iget-object p3, v1, Lzd3/g;->d:Lae3/g;

    invoke-interface {p3}, Lae3/g;->d()Z

    move-result p3

    if-eqz p3, :cond_4

    invoke-virtual {p0, v4}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    :cond_4
    return-wide p1

    :goto_2
    invoke-virtual {p0, p1}, Lzd3/f;->b(Ljava/io/IOException;)Ljava/io/IOException;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
