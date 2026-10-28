.class public final Lbe3/d;
.super Lbe3/a;
.source "SourceFile"


# instance fields
.field public E:J

.field public final synthetic F:Lbe3/g;


# direct methods
.method public constructor <init>(Lbe3/g;Lud3/e0;J)V
    .locals 1

    const-string v0, "url"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lbe3/d;->F:Lbe3/g;

    invoke-direct {p0, p1, p2}, Lbe3/a;-><init>(Lbe3/g;Lud3/e0;)V

    iput-wide p3, p0, Lbe3/d;->E:J

    const-wide/16 p1, 0x0

    cmp-long p1, p3, p1

    if-nez p1, :cond_0

    sget-object p1, Lud3/d0;->x:Lud3/d0;

    invoke-virtual {p0, p1}, Lbe3/a;->b(Lud3/d0;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 4

    iget-boolean v0, p0, Lbe3/a;->y:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-wide v0, p0, Lbe3/d;->E:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-eqz v0, :cond_1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    sget-object v1, Lwd3/h;->a:Ljava/util/TimeZone;

    const-string v1, "timeUnit"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x64

    :try_start_0
    invoke-static {p0, v0}, Lwd3/h;->g(Lne3/p0;I)Z

    move-result v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    iget-object v0, p0, Lbe3/d;->F:Lbe3/g;

    iget-object v0, v0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->c()V

    sget-object v0, Lbe3/g;->f:Lud3/d0;

    invoke-virtual {p0, v0}, Lbe3/a;->b(Lud3/d0;)V

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lbe3/a;->y:Z

    return-void
.end method

.method public final h1(Lne3/h;J)J
    .locals 7

    const-string v0, "sink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    iget-boolean v2, p0, Lbe3/a;->y:Z

    if-nez v2, :cond_3

    iget-wide v2, p0, Lbe3/d;->E:J

    cmp-long v4, v2, v0

    const-wide/16 v5, -0x1

    if-nez v4, :cond_0

    return-wide v5

    :cond_0
    invoke-static {v2, v3, p2, p3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-super {p0, p1, p2, p3}, Lbe3/a;->h1(Lne3/h;J)J

    move-result-wide p1

    cmp-long p3, p1, v5

    if-eqz p3, :cond_2

    iget-wide v2, p0, Lbe3/d;->E:J

    sub-long/2addr v2, p1

    iput-wide v2, p0, Lbe3/d;->E:J

    cmp-long p3, v2, v0

    if-nez p3, :cond_1

    sget-object p3, Lud3/d0;->x:Lud3/d0;

    invoke-virtual {p0, p3}, Lbe3/a;->b(Lud3/d0;)V

    :cond_1
    return-wide p1

    :cond_2
    iget-object p1, p0, Lbe3/d;->F:Lbe3/g;

    iget-object p1, p1, Lbe3/g;->b:Lae3/f;

    invoke-interface {p1}, Lae3/f;->c()V

    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "unexpected end of stream"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    sget-object p2, Lbe3/g;->f:Lud3/d0;

    invoke-virtual {p0, p2}, Lbe3/a;->b(Lud3/d0;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    const-string p1, "byteCount < 0: "

    invoke-static {p2, p3, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
