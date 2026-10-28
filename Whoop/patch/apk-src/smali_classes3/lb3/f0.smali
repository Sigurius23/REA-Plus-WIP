.class public final Llb3/f0;
.super Llb3/m;
.source "SourceFile"

# interfaces
.implements Llb3/e1;


# instance fields
.field public final x:Llb3/c0;

.field public final y:Llb3/y;


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/y;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/f0;->x:Llb3/c0;

    iput-object p2, p0, Llb3/f0;->y:Llb3/y;

    return-void
.end method


# virtual methods
.method public final A0(Lmb3/f;)Llb3/f0;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/f0;

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/f0;->y:Llb3/y;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/f0;-><init>(Llb3/c0;Llb3/y;)V

    return-object p1
.end method

.method public final G()Llb3/f1;
    .locals 1

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    return-object v0
.end method

.method public final b()Llb3/y;
    .locals 1

    iget-object v0, p0, Llb3/f0;->y:Llb3/y;

    return-object v0
.end method

.method public final bridge synthetic m0(Lmb3/f;)Llb3/y;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/f0;->A0(Lmb3/f;)Llb3/f0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic s0(Lmb3/f;)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/f0;->A0(Lmb3/f;)Llb3/f0;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[@EnhancedForWarnings("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llb3/f0;->y:Llb3/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb3/f0;->x:Llb3/c0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 2

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    iget-object v1, p0, Llb3/f0;->y:Llb3/y;

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v1

    invoke-virtual {v1, p1}, Llb3/f1;->r0(Z)Llb3/f1;

    move-result-object p1

    invoke-static {v0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb3/c0;

    return-object p1
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    invoke-virtual {v0, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    iget-object v0, p0, Llb3/f0;->y:Llb3/y;

    invoke-static {p1, v0}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Llb3/c0;

    return-object p1
.end method

.method public final w0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    return-object v0
.end method

.method public final bridge synthetic x0(Lmb3/f;)Llb3/c0;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/f0;->A0(Lmb3/f;)Llb3/f0;

    move-result-object p1

    return-object p1
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 2

    new-instance v0, Llb3/f0;

    iget-object v1, p0, Llb3/f0;->y:Llb3/y;

    invoke-direct {v0, p1, v1}, Llb3/f0;-><init>(Llb3/c0;Llb3/y;)V

    return-object v0
.end method

.method public final z0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/f0;->x:Llb3/c0;

    return-object v0
.end method
