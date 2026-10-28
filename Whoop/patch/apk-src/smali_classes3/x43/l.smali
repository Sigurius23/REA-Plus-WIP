.class public final Lx43/l;
.super Lud3/f1;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lq/f;


# direct methods
.method public constructor <init>(Lq/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx43/l;->a:Lq/f;

    return-void
.end method


# virtual methods
.method public final onClosed(Lud3/e1;ILjava/lang/String;)V
    .locals 2

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "reason"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x3e8

    if-eq p2, p1, :cond_0

    iget-object p1, p0, Lx43/l;->a:Lq/f;

    iget-object p1, p1, Lq/f;->z:Ljava/lang/Object;

    check-cast p1, Lec3/w1;

    new-instance p2, Lx43/m;

    sget-object p3, Lu33/e;->E:Lu33/e;

    const/4 v0, 0x6

    const/4 v1, 0x0

    invoke-static {p3, v1, v0}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object p3

    invoke-direct {p2, p3, v1}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    invoke-virtual {p1, p2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final onFailure(Lud3/e1;Ljava/lang/Throwable;Lud3/x0;)V
    .locals 2

    const-string p3, "webSocket"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lx43/l;->a:Lq/f;

    iget-object p1, p1, Lq/f;->z:Ljava/lang/Object;

    check-cast p1, Lec3/w1;

    new-instance p3, Lx43/m;

    sget-object v0, Lu33/e;->F:Lu33/e;

    const/4 v1, 0x2

    invoke-static {v0, p2, v1}, Ls4/a;->d(Lu33/e;Ljava/lang/Throwable;I)Ln23/c;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p3, p2, v0}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    invoke-virtual {p1, p3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    return-void
.end method

.method public final onMessage(Lud3/e1;Ljava/lang/String;)V
    .locals 5

    .line 22
    iget-object p1, p0, Lx43/l;->a:Lq/f;

    iget-object v0, p1, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lec3/w1;

    .line 23
    iget-object v1, p1, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lx43/e;

    .line 24
    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p2, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p2

    const-string v2, "getBytes(...)"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1, p2}, Lx43/e;->s([B)Ln23/h;

    move-result-object p2

    .line 25
    instance-of v1, p2, Ln23/g;

    if-eqz v1, :cond_0

    move-object v2, p2

    check-cast v2, Ln23/g;

    .line 26
    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    .line 27
    check-cast v2, Lx43/p;

    .line 28
    invoke-virtual {v0, v2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_0

    .line 29
    :cond_0
    instance-of v2, p2, Ln23/f;

    if-eqz v2, :cond_4

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 30
    instance-of v1, p2, Ln23/f;

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Ln23/f;

    .line 31
    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    .line 32
    new-instance v3, Lx43/m;

    .line 33
    invoke-direct {v3, v1, v2}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    .line 34
    invoke-virtual {v0, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_1

    .line 35
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 36
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lq/f;->u0()Lb23/k;

    move-result-object p1

    .line 37
    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    .line 38
    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 39
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 40
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[onMessage#string] event: `"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "`"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 41
    invoke-interface {p1, v3, v1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    .line 42
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onMessage(Lud3/e1;Lne3/l;)V
    .locals 5

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "bytes"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p1, p0, Lx43/l;->a:Lq/f;

    iget-object v0, p1, Lq/f;->z:Ljava/lang/Object;

    check-cast v0, Lec3/w1;

    .line 2
    iget-object v1, p1, Lq/f;->x:Ljava/lang/Object;

    check-cast v1, Lx43/e;

    .line 3
    invoke-virtual {p2}, Lne3/l;->r()[B

    move-result-object p2

    invoke-interface {v1, p2}, Lx43/e;->s([B)Ln23/h;

    move-result-object p2

    .line 4
    instance-of v1, p2, Ln23/g;

    if-eqz v1, :cond_0

    move-object v2, p2

    check-cast v2, Ln23/g;

    .line 5
    iget-object v2, v2, Ln23/g;->a:Ljava/lang/Object;

    .line 6
    check-cast v2, Lx43/p;

    .line 7
    invoke-virtual {v0, v2}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_0

    .line 8
    :cond_0
    instance-of v2, p2, Ln23/f;

    if-eqz v2, :cond_4

    :goto_0
    const/4 v2, 0x0

    if-nez v1, :cond_2

    .line 9
    instance-of v1, p2, Ln23/f;

    if-eqz v1, :cond_1

    move-object v1, p2

    check-cast v1, Ln23/f;

    .line 10
    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    .line 11
    new-instance v3, Lx43/m;

    .line 12
    invoke-direct {v3, v1, v2}, Lx43/m;-><init>(Ln23/e;Lstream/video/sfu/models/WebsocketReconnectStrategy;)V

    .line 13
    invoke-virtual {v0, v3}, Lec3/w1;->a(Ljava/lang/Object;)Z

    goto :goto_1

    .line 14
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 15
    :cond_2
    :goto_1
    invoke-virtual {p1}, Lq/f;->u0()Lb23/k;

    move-result-object p1

    .line 16
    iget-object v0, p1, Lb23/k;->c:Lb23/e;

    iget-object v1, p1, Lb23/k;->a:Ljava/lang/String;

    .line 17
    sget-object v3, Lb23/g;->x:Lb23/g;

    invoke-interface {v0, v3, v1}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 18
    iget-object p1, p1, Lb23/k;->b:Lb23/j;

    .line 19
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "[onMessage#ByteString] event: `"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "`"

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    .line 20
    invoke-interface {p1, v3, v1, p2, v2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_3
    return-void

    .line 21
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onOpen(Lud3/e1;Lud3/x0;)V
    .locals 1

    const-string v0, "webSocket"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "response"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lud3/f1;->onOpen(Lud3/e1;Lud3/x0;)V

    return-void
.end method
