.class public abstract Llb3/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/a;
.implements Lob3/g;


# instance fields
.field public w:I


# virtual methods
.method public abstract X()Ljava/util/List;
.end method

.method public abstract Y()Llb3/k0;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Llb3/y;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v0

    check-cast p1, Llb3/y;

    invoke-virtual {p1}, Llb3/y;->k0()Z

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, Llb3/y;->p0()Llb3/f1;

    move-result-object v0

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-static {v0, p1}, Lup/d;->R(Llb3/f1;Llb3/f1;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    const/4 p1, 0x0

    return p1
.end method

.method public final getAnnotations()Ls93/i;
    .locals 1

    invoke-virtual {p0}, Llb3/y;->Y()Llb3/k0;

    move-result-object v0

    invoke-static {v0}, Llb3/h;->a(Llb3/k0;)Ls93/i;

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Llb3/y;->w:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-static {p0}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-super {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v0

    add-int/2addr v0, v1

    :goto_0
    iput v0, p0, Llb3/y;->w:I

    return v0
.end method

.method public abstract i0()Llb3/q0;
.end method

.method public abstract k0()Z
.end method

.method public abstract m0(Lmb3/f;)Llb3/y;
.end method

.method public abstract p0()Llb3/f1;
.end method

.method public abstract u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
.end method
