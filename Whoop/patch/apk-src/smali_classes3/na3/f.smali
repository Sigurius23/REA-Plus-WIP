.class public final Lna3/f;
.super Llb3/m;
.source "SourceFile"

# interfaces
.implements Llb3/b0;


# instance fields
.field public final x:Llb3/c0;


# direct methods
.method public constructor <init>(Llb3/c0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lna3/f;->x:Llb3/c0;

    return-void
.end method


# virtual methods
.method public final E()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final k0()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final l(Llb3/y;)Llb3/f1;
    .locals 4

    const-string v0, "replacement"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Llb3/y;->p0()Llb3/f1;

    move-result-object p1

    invoke-static {p1}, Llb3/d1;->f(Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p1}, Llb3/d1;->e(Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p1

    :cond_0
    instance-of v0, p1, Llb3/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    check-cast p1, Llb3/c0;

    invoke-virtual {p1, v1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    invoke-static {p1}, Llb3/d1;->f(Llb3/y;)Z

    move-result p1

    if-nez p1, :cond_1

    return-object v0

    :cond_1
    new-instance p1, Lna3/f;

    invoke-direct {p1, v0}, Lna3/f;-><init>(Llb3/c0;)V

    return-object p1

    :cond_2
    instance-of v0, p1, Llb3/r;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Llb3/r;

    iget-object v2, v0, Llb3/r;->x:Llb3/c0;

    invoke-virtual {v2, v1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v3

    invoke-static {v2}, Llb3/d1;->f(Llb3/y;)Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :cond_3
    new-instance v2, Lna3/f;

    invoke-direct {v2, v3}, Lna3/f;-><init>(Llb3/c0;)V

    move-object v3, v2

    :goto_0
    iget-object v0, v0, Llb3/r;->y:Llb3/c0;

    invoke-virtual {v0, v1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v1

    invoke-static {v0}, Llb3/d1;->f(Llb3/y;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    new-instance v0, Lna3/f;

    invoke-direct {v0, v1}, Lna3/f;-><init>(Llb3/c0;)V

    move-object v1, v0

    :goto_1
    invoke-static {v3, v1}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    invoke-static {p1}, Llb3/o;->c(Llb3/y;)Llb3/y;

    move-result-object p1

    invoke-static {v0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final t0(Llb3/k0;)Llb3/f1;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lna3/f;

    iget-object v1, p0, Lna3/f;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    invoke-direct {v0, p1}, Lna3/f;-><init>(Llb3/c0;)V

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lna3/f;->x:Llb3/c0;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p0
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lna3/f;

    iget-object v1, p0, Lna3/f;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    invoke-direct {v0, p1}, Lna3/f;-><init>(Llb3/c0;)V

    return-object v0
.end method

.method public final w0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Lna3/f;->x:Llb3/c0;

    return-object v0
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 1

    new-instance v0, Lna3/f;

    invoke-direct {v0, p1}, Lna3/f;-><init>(Llb3/c0;)V

    return-object v0
.end method
