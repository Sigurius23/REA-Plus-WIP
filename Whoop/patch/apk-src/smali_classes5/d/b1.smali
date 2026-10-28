.class public abstract Ld/b1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/q;


# virtual methods
.method public abstract c(Z)I
.end method

.method public final d()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Ld/q;

    if-eqz v0, :cond_1

    check-cast p1, Ld/q;

    invoke-interface {p1}, Ld/q;->d()Ld/b1;

    move-result-object p1

    invoke-virtual {p0, p1}, Ld/b1;->g(Ld/b1;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public abstract f(Lro/i;Z)V
.end method

.method public abstract g(Ld/b1;)Z
.end method

.method public abstract h()Z
.end method

.method public abstract hashCode()I
.end method

.method public final i()[B
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v1, Ld/r;

    const/16 v2, 0x13

    invoke-direct {v1, v0, v2}, Lro/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0}, Ld/b1;->j()Ld/b1;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v1, v3}, Ld/b1;->f(Lro/i;Z)V

    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    return-object v0
.end method

.method public j()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public k()Ld/b1;
    .locals 0

    return-object p0
.end method
