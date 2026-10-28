.class public final Llb3/s;
.super Llb3/r;
.source "SourceFile"

# interfaces
.implements Llb3/j;


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/c0;)V
    .locals 1

    const-string v0, "lowerBound"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "upperBound"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Llb3/r;-><init>(Llb3/c0;Llb3/c0;)V

    return-void
.end method


# virtual methods
.method public final E()Z
    .locals 2

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-interface {v1}, Llb3/q0;->d()Lr93/h;

    move-result-object v1

    instance-of v1, v1, Lr93/x0;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    iget-object v1, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v1}, Llb3/y;->i0()Llb3/q0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final l(Llb3/y;)Llb3/f1;
    .locals 2

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    instance-of v0, p1, Llb3/r;

    if-eqz v0, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    instance-of v0, p1, Llb3/c0;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Llb3/c0;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v1

    invoke-static {v0, v1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    :goto_0
    invoke-static {v0, p1}, Llb3/o;->d(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/s;

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/s;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1
.end method

.method public final r0(Z)Llb3/f1;
    .locals 2

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    iget-object v1, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    invoke-static {v0, p1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/s;

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/r;->y:Llb3/c0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/s;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1
.end method

.method public final t0(Llb3/k0;)Llb3/f1;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object v0

    iget-object v1, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    invoke-static {v0, p1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/r;->x:Llb3/c0;

    return-object v0
.end method

.method public final v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;
    .locals 3

    iget-object p2, p2, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {p2}, Lxa3/l;->o()Z

    move-result p2

    iget-object v0, p0, Llb3/r;->y:Llb3/c0;

    iget-object v1, p0, Llb3/r;->x:Llb3/c0;

    if-eqz p2, :cond_0

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v2, "("

    invoke-direct {p2, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ".."

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1, v1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Lio/sentry/config/a;->z(Llb3/y;)Lo93/h;

    move-result-object v1

    invoke-virtual {p1, p2, v0, v1}, Lxa3/i;->F(Ljava/lang/String;Ljava/lang/String;Lo93/h;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
