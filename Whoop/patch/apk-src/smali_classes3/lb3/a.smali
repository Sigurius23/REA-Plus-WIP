.class public final Llb3/a;
.super Llb3/m;
.source "SourceFile"


# instance fields
.field public final x:Llb3/c0;

.field public final y:Llb3/c0;


# direct methods
.method public constructor <init>(Llb3/c0;Llb3/c0;)V
    .locals 1

    const-string v0, "delegate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "abbreviation"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/a;->x:Llb3/c0;

    iput-object p2, p0, Llb3/a;->y:Llb3/c0;

    return-void
.end method


# virtual methods
.method public final A0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/a;->x:Llb3/c0;

    return-object v0
.end method

.method public final B0(Z)Llb3/a;
    .locals 3

    new-instance v0, Llb3/a;

    iget-object v1, p0, Llb3/a;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v1

    iget-object v2, p0, Llb3/a;->y:Llb3/c0;

    invoke-virtual {v2, p1}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Llb3/a;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public final C0(Lmb3/f;)Llb3/a;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/a;

    iget-object v0, p0, Llb3/a;->x:Llb3/c0;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/a;->y:Llb3/c0;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/a;-><init>(Llb3/c0;Llb3/c0;)V

    return-object p1
.end method

.method public final bridge synthetic m0(Lmb3/f;)Llb3/y;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/a;->C0(Lmb3/f;)Llb3/a;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic r0(Z)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/a;->B0(Z)Llb3/a;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic s0(Lmb3/f;)Llb3/f1;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/a;->C0(Lmb3/f;)Llb3/a;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic u0(Z)Llb3/c0;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/a;->B0(Z)Llb3/a;

    move-result-object p1

    return-object p1
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 2

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb3/a;

    iget-object v1, p0, Llb3/a;->x:Llb3/c0;

    invoke-virtual {v1, p1}, Llb3/c0;->v0(Llb3/k0;)Llb3/c0;

    move-result-object p1

    iget-object v1, p0, Llb3/a;->y:Llb3/c0;

    invoke-direct {v0, p1, v1}, Llb3/a;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public final w0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/a;->x:Llb3/c0;

    return-object v0
.end method

.method public final bridge synthetic x0(Lmb3/f;)Llb3/c0;
    .locals 0

    invoke-virtual {p0, p1}, Llb3/a;->C0(Lmb3/f;)Llb3/a;

    move-result-object p1

    return-object p1
.end method

.method public final y0(Llb3/c0;)Llb3/m;
    .locals 2

    new-instance v0, Llb3/a;

    iget-object v1, p0, Llb3/a;->y:Llb3/c0;

    invoke-direct {v0, p1, v1}, Llb3/a;-><init>(Llb3/c0;Llb3/c0;)V

    return-object v0
.end method

.method public final z0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/a;->y:Llb3/c0;

    return-object v0
.end method
