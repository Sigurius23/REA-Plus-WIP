.class public abstract Llb3/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb3/q0;


# instance fields
.field public w:I

.field public final x:Lkb3/d;


# direct methods
.method public constructor <init>(Lkb3/n;)V
    .locals 3

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lfa3/u;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Ldc3/s;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    check-cast p1, Lkb3/k;

    new-instance v2, Lkb3/d;

    invoke-direct {v2, p1, v0, v1}, Lkb3/d;-><init>(Lkb3/k;Lfa3/u;Ldc3/s;)V

    iput-object v2, p0, Llb3/f;->x:Lkb3/d;

    return-void
.end method


# virtual methods
.method public abstract a()Ljava/util/Collection;
.end method

.method public abstract e()Llb3/y;
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Llb3/q0;

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0}, Llb3/f;->hashCode()I

    move-result v2

    if-eq v0, v2, :cond_2

    goto :goto_0

    :cond_2
    check-cast p1, Llb3/q0;

    invoke-interface {p1}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-eq v0, v2, :cond_3

    goto :goto_0

    :cond_3
    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    invoke-interface {p1}, Llb3/q0;->d()Lr93/h;

    move-result-object p1

    if-nez p1, :cond_4

    :goto_0
    return v1

    :cond_4
    invoke-static {v0}, Lnb3/l;->f(Lr93/k;)Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v0}, Lya3/f;->m(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Lnb3/l;->f(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-static {p1}, Lya3/f;->m(Lr93/k;)Z

    move-result v0

    if-nez v0, :cond_5

    invoke-virtual {p0, p1}, Llb3/f;->i(Lr93/h;)Z

    move-result p1

    return p1

    :cond_5
    return v1
.end method

.method public abstract g()Lr93/v0;
.end method

.method public final bridge synthetic getSupertypes()Ljava/util/Collection;
    .locals 1

    invoke-virtual {p0}, Llb3/f;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final h()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Llb3/f;->x:Lkb3/d;

    invoke-virtual {v0}, Lkb3/d;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/e;

    iget-object v0, v0, Llb3/e;->b:Ljava/util/List;

    return-object v0
.end method

.method public final hashCode()I
    .locals 2

    iget v0, p0, Llb3/f;->w:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-interface {p0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    invoke-static {v0}, Lnb3/l;->f(Lr93/k;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lya3/f;->m(Lr93/k;)Z

    move-result v1

    if-nez v1, :cond_1

    invoke-static {v0}, Lya3/f;->f(Lr93/k;)Lva3/f;

    move-result-object v0

    iget-object v0, v0, Lva3/f;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v0

    :goto_0
    iput v0, p0, Llb3/f;->w:I

    return v0
.end method

.method public abstract i(Lr93/h;)Z
.end method

.method public j(Ljava/util/List;)Ljava/util/List;
    .locals 0

    return-object p1
.end method
