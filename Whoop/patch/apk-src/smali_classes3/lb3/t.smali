.class public final Llb3/t;
.super Llb3/r;
.source "SourceFile"

# interfaces
.implements Llb3/e1;


# instance fields
.field public final E:Llb3/y;

.field public final z:Llb3/r;


# direct methods
.method public constructor <init>(Llb3/r;Llb3/y;)V
    .locals 2

    const-string v0, "origin"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "enhancement"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Llb3/r;->x:Llb3/c0;

    iget-object v1, p1, Llb3/r;->y:Llb3/c0;

    invoke-direct {p0, v0, v1}, Llb3/r;-><init>(Llb3/c0;Llb3/c0;)V

    iput-object p1, p0, Llb3/t;->z:Llb3/r;

    iput-object p2, p0, Llb3/t;->E:Llb3/y;

    return-void
.end method


# virtual methods
.method public final G()Llb3/f1;
    .locals 1

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    return-object v0
.end method

.method public final b()Llb3/y;
    .locals 1

    iget-object v0, p0, Llb3/t;->E:Llb3/y;

    return-object v0
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/t;

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/t;->E:Llb3/y;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/t;-><init>(Llb3/r;Llb3/y;)V

    return-object p1
.end method

.method public final r0(Z)Llb3/f1;
    .locals 2

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    invoke-virtual {v0, p1}, Llb3/f1;->r0(Z)Llb3/f1;

    move-result-object v0

    iget-object v1, p0, Llb3/t;->E:Llb3/y;

    invoke-virtual {v1}, Llb3/y;->p0()Llb3/f1;

    move-result-object v1

    invoke-virtual {v1, p1}, Llb3/f1;->r0(Z)Llb3/f1;

    move-result-object p1

    invoke-static {v0, p1}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 3

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Llb3/t;

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    const-string v1, "type"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Llb3/t;->E:Llb3/y;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, v0, v2}, Llb3/t;-><init>(Llb3/r;Llb3/y;)V

    return-object p1
.end method

.method public final t0(Llb3/k0;)Llb3/f1;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    invoke-virtual {v0, p1}, Llb3/f1;->t0(Llb3/k0;)Llb3/f1;

    move-result-object p1

    iget-object v0, p0, Llb3/t;->E:Llb3/y;

    invoke-static {p1, v0}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p1

    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[@EnhancedForWarnings("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llb3/t;->E:Llb3/y;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llb3/t;->z:Llb3/r;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    invoke-virtual {v0}, Llb3/r;->u0()Llb3/c0;

    move-result-object v0

    return-object v0
.end method

.method public final v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;
    .locals 4

    iget-object v0, p2, Lxa3/i;->a:Lxa3/l;

    iget-object v1, v0, Lxa3/l;->m:Le4/c;

    sget-object v2, Lxa3/l;->Y:[Lj93/z;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v1, v0, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p0, Llb3/t;->E:Llb3/y;

    invoke-virtual {p1, p2}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_0
    iget-object v0, p0, Llb3/t;->z:Llb3/r;

    invoke-virtual {v0, p1, p2}, Llb3/r;->v0(Lxa3/i;Lxa3/i;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
