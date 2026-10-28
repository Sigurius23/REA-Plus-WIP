.class public final Ldh/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldh/i;


# virtual methods
.method public final a(Lgh/n;Lmh/m;)Ldh/j;
    .locals 6

    iget-object v0, p1, Lgh/n;->a:Ldh/x;

    invoke-virtual {v0}, Ldh/x;->d1()Lne3/j;

    move-result-object v0

    sget-object v1, Ldh/r;->b:Lne3/l;

    const-wide/16 v2, 0x0

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ldh/r;->a:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    sget-object v1, Ldh/r;->c:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    const-wide/16 v2, 0x8

    if-eqz v1, :cond_1

    sget-object v1, Ldh/r;->d:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-wide/16 v4, 0xc

    sget-object v1, Ldh/r;->e:Lne3/l;

    invoke-interface {v0, v4, v5, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_1

    const-wide/16 v4, 0x11

    invoke-interface {v0, v4, v5}, Lne3/j;->request(J)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Lne3/j;->f()Lne3/h;

    move-result-object v1

    const-wide/16 v4, 0x10

    invoke-virtual {v1, v4, v5}, Lne3/h;->s(J)B

    move-result v1

    and-int/lit8 v1, v1, 0x2

    int-to-byte v1, v1

    if-lez v1, :cond_1

    goto :goto_0

    :cond_1
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1e

    if-lt v1, v4, :cond_2

    const-wide/16 v4, 0x4

    sget-object v1, Ldh/r;->f:Lne3/l;

    invoke-interface {v0, v4, v5, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-eqz v1, :cond_2

    sget-object v1, Ldh/r;->g:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ldh/r;->h:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v1

    if-nez v1, :cond_3

    sget-object v1, Ldh/r;->i:Lne3/l;

    invoke-interface {v0, v2, v3, v1}, Lne3/j;->d0(JLne3/l;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1

    :cond_3
    :goto_0
    new-instance v0, Ldh/w;

    iget-object p1, p1, Lgh/n;->a:Ldh/x;

    invoke-direct {v0, p1, p2}, Ldh/w;-><init>(Ldh/x;Lmh/m;)V

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    instance-of p1, p1, Ldh/s;

    return p1
.end method

.method public final hashCode()I
    .locals 1

    const-class v0, Ldh/s;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method
