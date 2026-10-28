.class public abstract Llb3/c0;
.super Llb3/f1;
.source "SourceFile"

# interfaces
.implements Lob3/i;
.implements Lob3/j;


# virtual methods
.method public bridge synthetic r0(Z)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic t0(Llb3/k0;)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ls93/b;

    sget-object v3, Lxa3/i;->e:Lxa3/i;

    const/4 v4, 0x0

    invoke-virtual {v3, v2, v4}, Lxa3/i;->x(Ls93/b;Ls93/d;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "] "

    const-string v4, "["

    filled-new-array {v4, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lyb3/w;->u(Ljava/lang/StringBuilder;[Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    const/4 v5, 0x0

    const/16 v6, 0x70

    const-string v2, ", "

    const-string v3, "<"

    const-string v4, ">"

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    :cond_1
    invoke-virtual {p0}, Llb3/y;->k0()Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "?"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract u0(Z)Llb3/c0;
.end method

.method public abstract v0(Llb3/k0;)Llb3/c0;
.end method
