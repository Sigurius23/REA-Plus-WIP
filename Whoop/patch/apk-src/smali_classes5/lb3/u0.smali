.class public abstract Llb3/u0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lob3/k;


# virtual methods
.method public abstract a()Llb3/g1;
.end method

.method public abstract b()Llb3/y;
.end method

.method public abstract c()Z
.end method

.method public abstract d(Lmb3/f;)Llb3/u0;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_1

    :cond_0
    instance-of v0, p1, Llb3/u0;

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Llb3/u0;

    invoke-virtual {p0}, Llb3/u0;->c()Z

    move-result v0

    invoke-virtual {p1}, Llb3/u0;->c()Z

    move-result v1

    if-eq v0, v1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    if-eq v0, v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    invoke-virtual {p1}, Llb3/u0;->b()Llb3/y;

    move-result-object p1

    invoke-virtual {v0, p1}, Llb3/y;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_4
    :goto_1
    const/4 p1, 0x1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-static {v1}, Llb3/d1;->l(Llb3/y;)Z

    move-result v1

    if-eqz v1, :cond_0

    mul-int/lit8 v0, v0, 0x1f

    add-int/lit8 v0, v0, 0x13

    return v0

    :cond_0
    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Llb3/u0;->c()Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x11

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v1}, Llb3/y;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Llb3/u0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "*"

    return-object v0

    :cond_0
    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v0

    sget-object v1, Llb3/g1;->y:Llb3/g1;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llb3/u0;->b()Llb3/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
