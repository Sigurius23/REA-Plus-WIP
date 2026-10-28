.class public final Lle3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lud3/e1;
.implements Lle3/i;


# static fields
.field public static final y:Ljava/util/List;


# instance fields
.field public final a:Lud3/o0;

.field public final b:Lud3/f1;

.field public final c:Ljava/util/Random;

.field public final d:J

.field public e:Lle3/h;

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/String;

.field public i:Lzd3/o;

.field public j:Lle3/f;

.field public k:Lle3/j;

.field public l:Lle3/k;

.field public final m:Lyd3/c;

.field public n:Ljava/lang/String;

.field public o:Ls/m2;

.field public final p:Ljava/util/ArrayDeque;

.field public final q:Ljava/util/ArrayDeque;

.field public r:J

.field public s:Z

.field public t:I

.field public u:Ljava/lang/String;

.field public v:Z

.field public w:I

.field public x:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lud3/m0;->z:Lud3/m0;

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lle3/g;->y:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lyd3/d;Lud3/o0;Lud3/f1;Ljava/util/Random;JJJ)V
    .locals 1

    const-string v0, "taskRunner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalRequest"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lle3/g;->a:Lud3/o0;

    iput-object p3, p0, Lle3/g;->b:Lud3/f1;

    iput-object p4, p0, Lle3/g;->c:Ljava/util/Random;

    iput-wide p5, p0, Lle3/g;->d:J

    const/4 p3, 0x0

    iput-object p3, p0, Lle3/g;->e:Lle3/h;

    iput-wide p7, p0, Lle3/g;->f:J

    iput-wide p9, p0, Lle3/g;->g:J

    invoke-virtual {p1}, Lyd3/d;->d()Lyd3/c;

    move-result-object p1

    iput-object p1, p0, Lle3/g;->m:Lyd3/c;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lle3/g;->p:Ljava/util/ArrayDeque;

    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Lle3/g;->q:Ljava/util/ArrayDeque;

    const/4 p1, -0x1

    iput p1, p0, Lle3/g;->t:I

    iget-object p1, p2, Lud3/o0;->b:Ljava/lang/String;

    const-string p2, "GET"

    invoke-virtual {p2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    sget-object p1, Lne3/l;->z:Lne3/k;

    const/16 p1, 0x10

    new-array p1, p1, [B

    invoke-virtual {p4, p1}, Ljava/util/Random;->nextBytes([B)V

    const p2, -0x499602d2

    invoke-static {p2, p1}, Lne3/k;->c(I[B)Lne3/l;

    move-result-object p1

    iget-object p1, p1, Lne3/l;->w:[B

    invoke-static {p1}, Lne3/a;->b([B)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lle3/g;->h:Ljava/lang/String;

    return-void

    :cond_0
    const-string p2, "Request must be GET: "

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public static d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V
    .locals 10

    and-int/lit8 v0, p3, 0x2

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p3, p3, 0x4

    const/4 v0, 0x1

    if-eqz p3, :cond_1

    const/4 p3, 0x0

    goto :goto_0

    :cond_1
    move p3, v0

    :goto_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lkotlin/jvm/internal/g0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    monitor-enter p0

    :try_start_0
    iget-boolean v3, p0, Lle3/g;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v3, :cond_2

    monitor-exit p0

    return-void

    :cond_2
    :try_start_1
    iput-boolean v0, p0, Lle3/g;->v:Z

    iget-object v3, p0, Lle3/g;->o:Ls/m2;

    iget-object v0, p0, Lle3/g;->l:Lle3/k;

    iput-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iput-object v1, p0, Lle3/g;->l:Lle3/k;

    if-nez p3, :cond_3

    if-eqz v0, :cond_3

    iget-object v4, p0, Lle3/g;->m:Lyd3/c;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lle3/g;->n:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " writer close"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v8, Lle3/c;

    const/4 v0, 0x0

    invoke-direct {v8, v2, v0}, Lle3/c;-><init>(Lkotlin/jvm/internal/g0;I)V

    const/4 v9, 0x2

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v9}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    goto :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_3
    :goto_1
    iget-object v0, p0, Lle3/g;->m:Lyd3/c;

    invoke-virtual {v0}, Lyd3/c;->g()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    :try_start_2
    iget-object v0, p0, Lle3/g;->b:Lud3/f1;

    invoke-virtual {v0, p0, p1, p2}, Lud3/f1;->onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Ls/m2;->cancel()V

    :cond_4
    if-eqz p3, :cond_5

    iget-object p0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Lle3/k;

    if-eqz p0, :cond_5

    invoke-static {p0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_5
    return-void

    :catchall_1
    move-exception v0

    move-object p0, v0

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Ls/m2;->cancel()V

    :cond_6
    if-eqz p3, :cond_7

    iget-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p1, Lle3/k;

    if-eqz p1, :cond_7

    invoke-static {p1}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_7
    throw p0

    :goto_2
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final a(Lud3/x0;)Lne3/o0;
    .locals 6

    iget-object v0, p1, Lud3/x0;->F:Lud3/d0;

    iget v1, p1, Lud3/x0;->z:I

    const/16 v2, 0x65

    const/16 v3, 0x27

    if-ne v1, v2, :cond_7

    const-string v1, "Connection"

    invoke-virtual {v0, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move-object v1, v2

    :cond_0
    const-string v4, "Upgrade"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {v0, v4}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v2

    :cond_1
    const-string v4, "websocket"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    const-string v1, "Sec-WebSocket-Accept"

    invoke-virtual {v0, v1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    move-object v2, v0

    :goto_0
    sget-object v0, Lne3/l;->z:Lne3/k;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lle3/g;->h:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "258EAFA5-E914-47DA-95CA-C5AB0DC85B11"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    const-string v1, "SHA-1"

    invoke-virtual {v0, v1}, Lne3/l;->c(Ljava/lang/String;)Lne3/l;

    move-result-object v0

    iget-object v0, v0, Lne3/l;->w:[B

    invoke-static {v0}, Lne3/a;->b([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object p1, p1, Lud3/x0;->H:Lne3/o0;

    if-eqz p1, :cond_3

    return-object p1

    :cond_3
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Web Socket socket missing: bad interceptor?"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p1, Ljava/net/ProtocolException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Expected \'Sec-WebSocket-Accept\' header value \'"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\' but was \'"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \'Upgrade\' header value \'websocket\' but was \'"

    invoke-static {v3, v0, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Expected \'Connection\' header value \'Upgrade\' but was \'"

    invoke-static {v3, v0, v1}, Lr80/c;->i(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    new-instance v0, Ljava/net/ProtocolException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v4, "Expected HTTP 101 response but was \'"

    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x20

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lud3/x0;->y:Ljava/lang/String;

    invoke-static {v2, p1, v3}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b(ILjava/lang/String;)Z
    .locals 9

    iget-wide v0, p0, Lle3/g;->g:J

    const-string v2, "reason.size() > 123: "

    monitor-enter p0

    const/16 v3, 0x3e8

    const/4 v4, 0x0

    if-lt p1, v3, :cond_3

    const/16 v3, 0x1388

    if-lt p1, v3, :cond_0

    goto :goto_1

    :cond_0
    const/16 v3, 0x3ec

    if-gt v3, p1, :cond_1

    const/16 v3, 0x3ef

    if-ge p1, v3, :cond_1

    goto :goto_0

    :cond_1
    const/16 v3, 0x3f7

    if-gt v3, p1, :cond_2

    const/16 v3, 0xbb8

    if-ge p1, v3, :cond_2

    :goto_0
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Code "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, " is reserved and may not be used."

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object v3, v4

    goto :goto_2

    :cond_3
    :goto_1
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "Code must be in range [1000,5000): "

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_2
    if-nez v3, :cond_8

    if-eqz p2, :cond_5

    sget-object v3, Lne3/l;->z:Lne3/k;

    invoke-static {p2}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object v4

    iget-object v3, v4, Lne3/l;->w:[B

    array-length v3, v3

    int-to-long v5, v3

    const-wide/16 v7, 0x7b

    cmp-long v3, v5, v7

    if-gtz v3, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v2, p2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_5
    :goto_3
    iget-boolean p2, p0, Lle3/g;->v:Z

    if-nez p2, :cond_7

    iget-boolean p2, p0, Lle3/g;->s:Z

    if-eqz p2, :cond_6

    goto :goto_4

    :cond_6
    const/4 p2, 0x1

    iput-boolean p2, p0, Lle3/g;->s:Z

    iget-object v2, p0, Lle3/g;->q:Ljava/util/ArrayDeque;

    new-instance v3, Lle3/d;

    invoke-direct {v3, p1, v0, v1, v4}, Lle3/d;-><init>(IJLne3/l;)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lle3/g;->f()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return p2

    :cond_7
    :goto_4
    monitor-exit p0

    const/4 p1, 0x0

    return p1

    :cond_8
    :try_start_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_5
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c(Lud3/l0;)V
    .locals 5

    iget-object v0, p0, Lle3/g;->a:Lud3/o0;

    iget-object v1, v0, Lud3/o0;->c:Lud3/d0;

    const-string v2, "Sec-WebSocket-Extensions"

    invoke-virtual {v1, v2}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance p1, Ljava/net/ProtocolException;

    const-string v0, "Request header not permitted: \'Sec-WebSocket-Extensions\'"

    invoke-direct {p1, v0}, Ljava/net/ProtocolException;-><init>(Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p0, p1, v0, v1}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    return-void

    :cond_0
    invoke-virtual {p1}, Lud3/l0;->a()Lud3/k0;

    move-result-object p1

    sget-object v1, Lud3/a0;->NONE:Lud3/a0;

    const-string v3, "eventListener"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lwd3/h;->a:Ljava/util/TimeZone;

    new-instance v3, Lvd1/c;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, Lvd1/c;-><init>(Ljava/lang/Object;I)V

    iput-object v3, p1, Lud3/k0;->e:Lud3/z;

    sget-object v1, Lle3/g;->y:Ljava/util/List;

    invoke-virtual {p1, v1}, Lud3/k0;->d(Ljava/util/List;)V

    new-instance v1, Lud3/l0;

    invoke-direct {v1, p1}, Lud3/l0;-><init>(Lud3/k0;)V

    invoke-virtual {v0}, Lud3/o0;->b()Lud3/n0;

    move-result-object p1

    const-string v0, "websocket"

    const-string v3, "Upgrade"

    invoke-virtual {p1, v3, v0}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Connection"

    invoke-virtual {p1, v0, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Sec-WebSocket-Key"

    iget-object v3, p0, Lle3/g;->h:Ljava/lang/String;

    invoke-virtual {p1, v0, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "Sec-WebSocket-Version"

    const-string v3, "13"

    invoke-virtual {p1, v0, v3}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "permessage-deflate"

    invoke-virtual {p1, v2, v0}, Lud3/n0;->c(Ljava/lang/String;Ljava/lang/String;)V

    new-instance v0, Lud3/o0;

    invoke-direct {v0, p1}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance p1, Lzd3/o;

    invoke-direct {p1, v1, v0, v4}, Lzd3/o;-><init>(Lud3/l0;Lud3/o0;Z)V

    iput-object p1, p0, Lle3/g;->i:Lzd3/o;

    new-instance v1, Lqg3/d;

    const/16 v2, 0x16

    invoke-direct {v1, v2, p0, v0}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1, v1}, Lzd3/o;->d(Lud3/k;)V

    return-void
.end method

.method public final e()V
    .locals 11

    monitor-enter p0

    :try_start_0
    iget v0, p0, Lle3/g;->t:I

    iget-object v1, p0, Lle3/g;->u:Ljava/lang/String;

    iget-object v2, p0, Lle3/g;->k:Lle3/j;

    const/4 v3, 0x0

    iput-object v3, p0, Lle3/g;->k:Lle3/j;

    iget-boolean v4, p0, Lle3/g;->s:Z

    if-eqz v4, :cond_1

    iget-object v4, p0, Lle3/g;->q:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, p0, Lle3/g;->l:Lle3/k;

    if-eqz v4, :cond_0

    iput-object v3, p0, Lle3/g;->l:Lle3/k;

    iget-object v5, p0, Lle3/g;->m:Lyd3/c;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v6, p0, Lle3/g;->n:Ljava/lang/String;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v6, " writer close"

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    new-instance v9, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v3, 0x17

    invoke-direct {v9, v4, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/4 v10, 0x2

    const-wide/16 v7, 0x0

    invoke-static/range {v5 .. v10}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_0
    iget-object v3, p0, Lle3/g;->m:Lyd3/c;

    invoke-virtual {v3}, Lyd3/c;->g()V

    :cond_1
    iget-boolean v3, p0, Lle3/g;->v:Z

    if-nez v3, :cond_2

    iget-object v3, p0, Lle3/g;->l:Lle3/k;

    if-nez v3, :cond_2

    iget v3, p0, Lle3/g;->t:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v4, -0x1

    if-eq v3, v4, :cond_2

    const/4 v3, 0x1

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    monitor-exit p0

    if-eqz v3, :cond_3

    iget-object v3, p0, Lle3/g;->b:Lud3/f1;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, p0, v0, v1}, Lud3/f1;->onClosed(Lud3/e1;ILjava/lang/String;)V

    :cond_3
    if-eqz v2, :cond_4

    invoke-static {v2}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_4
    return-void

    :goto_2
    monitor-exit p0

    throw v0
.end method

.method public final f()V
    .locals 4

    sget-object v0, Lwd3/h;->a:Ljava/util/TimeZone;

    iget-object v0, p0, Lle3/g;->j:Lle3/f;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lle3/g;->m:Lyd3/c;

    const-wide/16 v2, 0x0

    invoke-virtual {v1, v0, v2, v3}, Lyd3/c;->d(Lyd3/a;J)V

    :cond_0
    return-void
.end method

.method public final declared-synchronized g(ILne3/l;)Z
    .locals 6

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lle3/g;->v:Z

    const/4 v1, 0x0

    if-nez v0, :cond_2

    iget-boolean v0, p0, Lle3/g;->s:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-wide v2, p0, Lle3/g;->r:J

    invoke-virtual {p2}, Lne3/l;->d()I

    move-result v0

    int-to-long v4, v0

    add-long/2addr v2, v4

    const-wide/32 v4, 0x1000000

    cmp-long v0, v2, v4

    if-lez v0, :cond_1

    const/16 p1, 0x3e9

    const/4 p2, 0x0

    invoke-virtual {p0, p1, p2}, Lle3/g;->b(ILjava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :try_start_1
    iget-wide v0, p0, Lle3/g;->r:J

    invoke-virtual {p2}, Lne3/l;->d()I

    move-result v2

    int-to-long v2, v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lle3/g;->r:J

    iget-object v0, p0, Lle3/g;->q:Ljava/util/ArrayDeque;

    new-instance v1, Lle3/e;

    invoke-direct {v1, p1, p2}, Lle3/e;-><init>(ILne3/l;)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lle3/g;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_0
    monitor-exit p0

    return v1

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public final h(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lne3/l;->z:Lne3/k;

    invoke-static {p1}, Lne3/k;->b(Ljava/lang/String;)Lne3/l;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p0, v0, p1}, Lle3/g;->g(ILne3/l;)Z

    move-result p1

    return p1
.end method

.method public final i()Z
    .locals 19

    move-object/from16 v1, p0

    monitor-enter p0

    :try_start_0
    iget-boolean v0, v1, Lle3/g;->v:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v2

    :cond_0
    :try_start_1
    iget-object v3, v1, Lle3/g;->l:Lle3/k;

    iget-object v0, v1, Lle3/g;->p:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, -0x1

    if-nez v0, :cond_5

    iget-object v7, v1, Lle3/g;->q:Ljava/util/ArrayDeque;

    invoke-virtual {v7}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Lle3/d;

    if-eqz v8, :cond_3

    iget v8, v1, Lle3/g;->t:I

    iget-object v9, v1, Lle3/g;->u:Ljava/lang/String;

    if-eq v8, v6, :cond_2

    iget-object v6, v1, Lle3/g;->l:Lle3/k;

    iput-object v5, v1, Lle3/g;->l:Lle3/k;

    if-eqz v6, :cond_1

    iget-object v10, v1, Lle3/g;->k:Lle3/j;

    if-nez v10, :cond_1

    move v2, v4

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    :goto_0
    iget-object v10, v1, Lle3/g;->m:Lyd3/c;

    invoke-virtual {v10}, Lyd3/c;->g()V

    move-object/from16 v18, v7

    move-object v7, v6

    move v6, v8

    move-object/from16 v8, v18

    goto :goto_1

    :cond_2
    move-object v6, v7

    check-cast v6, Lle3/d;

    iget-wide v10, v6, Lle3/d;->c:J

    iget-object v12, v1, Lle3/g;->m:Lyd3/c;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v13, v1, Lle3/g;->n:Ljava/lang/String;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v13, " cancel"

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    sget-object v6, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v6, v10, v11}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v14

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v10, 0x18

    invoke-direct {v6, v1, v10}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/16 v17, 0x4

    move-object/from16 v16, v6

    invoke-static/range {v12 .. v17}, Lyd3/c;->c(Lyd3/c;Ljava/lang/String;JLc93/a;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move v6, v8

    move-object v8, v7

    move-object v7, v5

    goto :goto_1

    :cond_3
    if-nez v7, :cond_4

    monitor-exit p0

    return v2

    :cond_4
    move-object v9, v5

    move-object v8, v7

    move-object v7, v9

    goto :goto_1

    :cond_5
    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    :goto_1
    monitor-exit p0

    if-eqz v0, :cond_6

    :try_start_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lne3/l;

    const/16 v2, 0xa

    invoke-virtual {v3, v2, v0}, Lle3/k;->b(ILne3/l;)V

    goto/16 :goto_6

    :catchall_1
    move-exception v0

    goto/16 :goto_7

    :cond_6
    instance-of v0, v8, Lle3/e;

    if-eqz v0, :cond_7

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, v8

    check-cast v0, Lle3/e;

    iget v0, v0, Lle3/e;->a:I

    move-object v2, v8

    check-cast v2, Lle3/e;

    iget-object v2, v2, Lle3/e;->b:Lne3/l;

    invoke-virtual {v3, v0, v2}, Lle3/k;->h(ILne3/l;)V

    monitor-enter p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    iget-wide v2, v1, Lle3/g;->r:J

    check-cast v8, Lle3/e;

    iget-object v0, v8, Lle3/e;->b:Lne3/l;

    invoke-virtual {v0}, Lne3/l;->d()I

    move-result v0

    int-to-long v5, v0

    sub-long/2addr v2, v5

    iput-wide v2, v1, Lle3/g;->r:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :try_start_4
    monitor-exit p0

    goto/16 :goto_6

    :catchall_2
    move-exception v0

    monitor-exit p0

    throw v0

    :cond_7
    instance-of v0, v8, Lle3/d;

    if-eqz v0, :cond_13

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    move-object v0, v8

    check-cast v0, Lle3/d;

    iget v0, v0, Lle3/d;->a:I

    check-cast v8, Lle3/d;

    iget-object v8, v8, Lle3/d;->b:Lne3/l;

    sget-object v10, Lne3/l;->E:Lne3/l;

    if-nez v0, :cond_8

    if-eqz v8, :cond_10

    :cond_8
    if-eqz v0, :cond_e

    const/16 v10, 0x3e8

    if-lt v0, v10, :cond_b

    const/16 v10, 0x1388

    if-lt v0, v10, :cond_9

    goto :goto_3

    :cond_9
    const/16 v10, 0x3ec

    if-gt v10, v0, :cond_a

    const/16 v10, 0x3ef

    if-ge v0, v10, :cond_a

    goto :goto_2

    :cond_a
    const/16 v10, 0x3f7

    if-gt v10, v0, :cond_c

    const/16 v10, 0xbb8

    if-ge v0, v10, :cond_c

    :goto_2
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "Code "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v10, " is reserved and may not be used."

    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_b
    :goto_3
    new-instance v5, Ljava/lang/StringBuilder;

    const-string v10, "Code must be in range [1000,5000): "

    invoke-direct {v5, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    :cond_c
    :goto_4
    if-nez v5, :cond_d

    goto :goto_5

    :cond_d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {v5}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    :goto_5
    new-instance v5, Lne3/h;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v5, v0}, Lne3/h;->r1(I)V

    if-eqz v8, :cond_f

    invoke-virtual {v5, v8}, Lne3/h;->l1(Lne3/l;)V

    :cond_f
    iget-wide v10, v5, Lne3/h;->x:J

    invoke-virtual {v5, v10, v11}, Lne3/h;->m0(J)Lne3/l;

    move-result-object v10
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_10
    const/16 v0, 0x8

    :try_start_5
    invoke-virtual {v3, v0, v10}, Lle3/k;->b(ILne3/l;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :try_start_6
    iput-boolean v4, v3, Lle3/k;->H:Z

    if-eqz v2, :cond_11

    iget-object v0, v1, Lle3/g;->b:Lud3/f1;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1, v6, v9}, Lud3/f1;->onClosed(Lud3/e1;ILjava/lang/String;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    :cond_11
    :goto_6
    if-eqz v7, :cond_12

    invoke-static {v7}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_12
    return v4

    :catchall_3
    move-exception v0

    :try_start_7
    iput-boolean v4, v3, Lle3/k;->H:Z

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0}, Ljava/lang/AssertionError;-><init>()V

    throw v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :goto_7
    if-eqz v7, :cond_14

    invoke-static {v7}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_14
    throw v0

    :goto_8
    monitor-exit p0

    throw v0
.end method
