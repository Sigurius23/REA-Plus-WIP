.class public final Lbe3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lae3/g;


# static fields
.field public static final f:Lud3/d0;


# instance fields
.field public final a:Lud3/l0;

.field public final b:Lae3/f;

.field public final c:Ls/m2;

.field public d:I

.field public final e:Lan/d;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lud3/d0;->x:Lud3/d0;

    const-string v0, "OkHttp-Response-Body"

    const-string v1, "Truncated"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->R([Ljava/lang/String;)Lud3/d0;

    move-result-object v0

    sput-object v0, Lbe3/g;->f:Lud3/d0;

    return-void
.end method

.method public constructor <init>(Lud3/l0;Lae3/f;Ls/m2;)V
    .locals 1

    const-string v0, "socket"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbe3/g;->a:Lud3/l0;

    iput-object p2, p0, Lbe3/g;->b:Lae3/f;

    iput-object p3, p0, Lbe3/g;->c:Ls/m2;

    new-instance p1, Lan/d;

    iget-object p2, p3, Ls/m2;->x:Ljava/lang/Object;

    check-cast p2, Lne3/j0;

    invoke-direct {p1, p2}, Lan/d;-><init>(Lne3/j0;)V

    iput-object p1, p0, Lbe3/g;->e:Lan/d;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget-object v0, p0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    return-void
.end method

.method public final b(Lud3/x0;)J
    .locals 2

    invoke-static {p1}, Lae3/h;->a(Lud3/x0;)Z

    move-result v0

    if-nez v0, :cond_0

    const-wide/16 v0, 0x0

    return-wide v0

    :cond_0
    iget-object v0, p1, Lud3/x0;->F:Lud3/d0;

    const-string v1, "Transfer-Encoding"

    invoke-virtual {v0, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    :cond_1
    const-string v1, "chunked"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    const-wide/16 v0, -0x1

    return-wide v0

    :cond_2
    invoke-static {p1}, Lwd3/h;->e(Lud3/x0;)J

    move-result-wide v0

    return-wide v0
.end method

.method public final c(Lud3/x0;)Lne3/p0;
    .locals 9

    iget-object v0, p1, Lud3/x0;->w:Lud3/o0;

    invoke-static {p1}, Lae3/h;->a(Lud3/x0;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object p1, v0, Lud3/o0;->a:Lud3/e0;

    const-wide/16 v0, 0x0

    invoke-virtual {p0, p1, v0, v1}, Lbe3/g;->k(Lud3/e0;J)Lbe3/d;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v1, p1, Lud3/x0;->F:Lud3/d0;

    const-string v2, "Transfer-Encoding"

    invoke-virtual {v1, v2}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const/4 v1, 0x0

    :cond_1
    const-string v2, "chunked"

    invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    const-string v2, "state: "

    const/4 v3, 0x5

    const/4 v4, 0x4

    if-eqz v1, :cond_3

    iget-object p1, v0, Lud3/o0;->a:Lud3/e0;

    iget v0, p0, Lbe3/g;->d:I

    if-ne v0, v4, :cond_2

    iput v3, p0, Lbe3/g;->d:I

    new-instance v0, Lbe3/c;

    invoke-direct {v0, p0, p1}, Lbe3/c;-><init>(Lbe3/g;Lud3/e0;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lbe3/g;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {p1}, Lwd3/h;->e(Lud3/x0;)J

    move-result-wide v5

    const-wide/16 v7, -0x1

    cmp-long p1, v5, v7

    if-eqz p1, :cond_4

    iget-object p1, v0, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {p0, p1, v5, v6}, Lbe3/g;->k(Lud3/e0;J)Lbe3/d;

    move-result-object p1

    return-object p1

    :cond_4
    iget-object p1, v0, Lud3/o0;->a:Lud3/e0;

    iget v0, p0, Lbe3/g;->d:I

    if-ne v0, v4, :cond_5

    iput v3, p0, Lbe3/g;->d:I

    iget-object v0, p0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->c()V

    new-instance v0, Lbe3/f;

    const-string v1, "url"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, p0, p1}, Lbe3/a;-><init>(Lbe3/g;Lud3/e0;)V

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lbe3/g;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final cancel()V
    .locals 1

    iget-object v0, p0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->cancel()V

    return-void
.end method

.method public final d()Z
    .locals 2

    iget v0, p0, Lbe3/g;->d:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final e(Z)Lud3/w0;
    .locals 10

    iget-object v0, p0, Lbe3/g;->e:Lan/d;

    iget v1, p0, Lbe3/g;->d:I

    const/4 v2, 0x3

    if-eqz v1, :cond_1

    const/4 v3, 0x1

    if-eq v1, v3, :cond_1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, "state: "

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v0, p0, Lbe3/g;->d:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    :goto_0
    :try_start_0
    iget-object v1, v0, Lan/d;->y:Ljava/lang/Object;

    check-cast v1, Lne3/j;

    iget-wide v3, v0, Lan/d;->x:J

    invoke-interface {v1, v3, v4}, Lne3/j;->M(J)Ljava/lang/String;

    move-result-object v1

    iget-wide v3, v0, Lan/d;->x:J

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    int-to-long v5, v5

    sub-long/2addr v3, v5

    iput-wide v3, v0, Lan/d;->x:J

    invoke-static {v1}, Landroidx/room/c1;->I(Ljava/lang/String;)Lae3/k;

    move-result-object v1

    iget v3, v1, Lae3/k;->b:I

    new-instance v4, Lud3/w0;

    invoke-direct {v4}, Lud3/w0;-><init>()V

    iget-object v5, v1, Lae3/k;->c:Ljava/lang/Object;

    check-cast v5, Lud3/m0;

    iput-object v5, v4, Lud3/w0;->b:Lud3/m0;

    iput v3, v4, Lud3/w0;->c:I

    iget-object v1, v1, Lae3/k;->d:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iput-object v1, v4, Lud3/w0;->d:Ljava/lang/String;

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/4 v5, 0x2

    const/4 v6, 0x0

    invoke-direct {v1, v5, v6}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    :goto_1
    iget-object v5, v0, Lan/d;->y:Ljava/lang/Object;

    check-cast v5, Lne3/j;

    iget-wide v6, v0, Lan/d;->x:J

    invoke-interface {v5, v6, v7}, Lne3/j;->M(J)Ljava/lang/String;

    move-result-object v5

    iget-wide v6, v0, Lan/d;->x:J

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v8

    int-to-long v8, v8

    sub-long/2addr v6, v8

    iput-wide v6, v0, Lan/d;->x:J

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    if-nez v6, :cond_5

    invoke-virtual {v1}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object v0

    invoke-virtual {v4, v0}, Lud3/w0;->c(Lud3/d0;)V

    const/16 v0, 0x64

    if-eqz p1, :cond_2

    if-ne v3, v0, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    if-ne v3, v0, :cond_3

    iput v2, p0, Lbe3/g;->d:I

    return-object v4

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_3
    const/16 p1, 0x66

    if-gt p1, v3, :cond_4

    const/16 p1, 0xc8

    if-ge v3, p1, :cond_4

    iput v2, p0, Lbe3/g;->d:I

    return-object v4

    :cond_4
    const/4 p1, 0x4

    iput p1, p0, Lbe3/g;->d:I

    return-object v4

    :cond_5
    invoke-virtual {v1, v5}, Lkotlin/jvm/internal/k0;->c(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :goto_2
    iget-object v0, p0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->e()Lud3/b1;

    move-result-object v0

    iget-object v0, v0, Lud3/b1;->a:Lud3/a;

    iget-object v0, v0, Lud3/a;->h:Lud3/e0;

    invoke-virtual {v0}, Lud3/e0;->j()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/io/IOException;

    const-string v2, "unexpected end of stream on "

    invoke-static {v2, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public final f(Lud3/o0;)V
    .locals 4

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lbe3/g;->b:Lae3/f;

    invoke-interface {v0}, Lae3/f;->e()Lud3/b1;

    move-result-object v0

    iget-object v0, v0, Lud3/b1;->b:Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v0

    const-string v1, "type(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p1, Lud3/o0;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v2}, Lud3/e0;->f()Z

    move-result v3

    if-nez v3, :cond_0

    sget-object v3, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;

    if-ne v0, v3, :cond_0

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lud3/e0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2}, Lud3/e0;->d()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x3f

    invoke-static {v3, v0, v2}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    const-string v0, " HTTP/1.1"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {p0, p1, v0}, Lbe3/g;->m(Lud3/d0;Ljava/lang/String;)V

    return-void
.end method

.method public final g(Lud3/o0;J)Lne3/n0;
    .locals 5

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Lud3/o0;->d:Lud3/v0;

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lud3/v0;->isDuplex()Z

    move-result v0

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/net/ProtocolException;

    const-string p2, "Duplex connections are not supported for HTTP/1"

    invoke-direct {p1, p2}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    const-string v0, "Transfer-Encoding"

    iget-object p1, p1, Lud3/o0;->c:Lud3/d0;

    invoke-virtual {p1, v0}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "chunked"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p1

    const-string v0, "state: "

    const/4 v2, 0x2

    if-eqz p1, :cond_3

    iget p1, p0, Lbe3/g;->d:I

    if-ne p1, v1, :cond_2

    iput v2, p0, Lbe3/g;->d:I

    new-instance p1, Lbe3/b;

    invoke-direct {p1, p0}, Lbe3/b;-><init>(Lbe3/g;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lbe3/g;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_3
    const-wide/16 v3, -0x1

    cmp-long p1, p2, v3

    if-eqz p1, :cond_5

    iget p1, p0, Lbe3/g;->d:I

    if-ne p1, v1, :cond_4

    iput v2, p0, Lbe3/g;->d:I

    new-instance p1, Lbe3/e;

    invoke-direct {p1, p0}, Lbe3/e;-><init>(Lbe3/g;)V

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lbe3/g;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Cannot stream a request body without chunked encoding or a known content length!"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final h()V
    .locals 1

    iget-object v0, p0, Lbe3/g;->c:Ls/m2;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    invoke-virtual {v0}, Lne3/h0;->flush()V

    return-void
.end method

.method public final i()Lne3/o0;
    .locals 1

    iget-object v0, p0, Lbe3/g;->c:Ls/m2;

    return-object v0
.end method

.method public final j()Lae3/f;
    .locals 1

    iget-object v0, p0, Lbe3/g;->b:Lae3/f;

    return-object v0
.end method

.method public final k(Lud3/e0;J)Lbe3/d;
    .locals 2

    iget v0, p0, Lbe3/g;->d:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    const/4 v0, 0x5

    iput v0, p0, Lbe3/g;->d:I

    new-instance v0, Lbe3/d;

    invoke-direct {v0, p0, p1, p2, p3}, Lbe3/d;-><init>(Lbe3/g;Lud3/e0;J)V

    return-object v0

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lbe3/g;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final l(Lud3/x0;)V
    .locals 4

    invoke-static {p1}, Lwd3/h;->e(Lud3/x0;)J

    move-result-wide v0

    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-object p1, p1, Lud3/x0;->w:Lud3/o0;

    iget-object p1, p1, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {p0, p1, v0, v1}, Lbe3/g;->k(Lud3/e0;J)Lbe3/d;

    move-result-object p1

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const v0, 0x7fffffff

    invoke-static {p1, v0}, Lwd3/h;->g(Lne3/p0;I)Z

    invoke-virtual {p1}, Lbe3/d;->close()V

    return-void
.end method

.method public final m(Lud3/d0;Ljava/lang/String;)V
    .locals 4

    const-string v0, "headers"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "requestLine"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p0, Lbe3/g;->d:I

    if-nez v0, :cond_1

    iget-object v0, p0, Lbe3/g;->c:Ls/m2;

    iget-object v1, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v1, Lne3/h0;

    iget-object v0, v0, Ls/m2;->y:Ljava/lang/Object;

    check-cast v0, Lne3/h0;

    invoke-virtual {v1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const-string p2, "\r\n"

    invoke-virtual {v1, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1}, Lud3/d0;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p1, v2}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const-string v3, ": "

    invoke-virtual {v0, v3}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    invoke-virtual {p1, v2}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    invoke-interface {v0, p2}, Lne3/i;->S(Ljava/lang/String;)Lne3/i;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p2}, Lne3/h0;->S(Ljava/lang/String;)Lne3/i;

    const/4 p1, 0x1

    iput p1, p0, Lbe3/g;->d:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/StringBuilder;

    const-string p2, "state: "

    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget p2, p0, Lbe3/g;->d:I

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
