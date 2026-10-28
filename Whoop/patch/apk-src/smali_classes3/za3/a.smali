.class public final Lza3/a;
.super Llb3/c0;
.source "SourceFile"

# interfaces
.implements Lob3/d;


# instance fields
.field public final E:Llb3/k0;

.field public final x:Llb3/u0;

.field public final y:Lza3/b;

.field public final z:Z


# direct methods
.method public constructor <init>(Llb3/u0;)V
    .locals 3

    .line 6
    new-instance v0, Lza3/c;

    invoke-direct {v0, p1}, Lza3/c;-><init>(Llb3/u0;)V

    .line 7
    sget-object v1, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    sget-object v1, Llb3/k0;->y:Llb3/k0;

    const/4 v2, 0x0

    .line 9
    invoke-direct {p0, p1, v0, v2, v1}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-void
.end method

.method public constructor <init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V
    .locals 1

    const-string v0, "typeProjection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "constructor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attributes"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lza3/a;->x:Llb3/u0;

    .line 3
    iput-object p2, p0, Lza3/a;->y:Lza3/b;

    .line 4
    iput-boolean p3, p0, Lza3/a;->z:Z

    .line 5
    iput-object p4, p0, Lza3/a;->E:Llb3/k0;

    return-void
.end method


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    iget-object v0, p0, Lza3/a;->E:Llb3/k0;

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    iget-object v0, p0, Lza3/a;->y:Lza3/b;

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    iget-boolean v0, p0, Lza3/a;->z:Z

    return v0
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza3/a;

    iget-object v1, p0, Lza3/a;->x:Llb3/u0;

    invoke-virtual {v1, p1}, Llb3/u0;->d(Lmb3/f;)Llb3/u0;

    move-result-object p1

    iget-boolean v1, p0, Lza3/a;->z:Z

    iget-object v2, p0, Lza3/a;->E:Llb3/k0;

    iget-object v3, p0, Lza3/a;->y:Lza3/b;

    invoke-direct {v0, p1, v3, v1, v2}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-object v0
.end method

.method public final r0(Z)Llb3/f1;
    .locals 4

    iget-boolean v0, p0, Lza3/a;->z:Z

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lza3/a;

    iget-object v1, p0, Lza3/a;->y:Lza3/b;

    iget-object v2, p0, Lza3/a;->E:Llb3/k0;

    iget-object v3, p0, Lza3/a;->x:Llb3/u0;

    invoke-direct {v0, v3, v1, p1, v2}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-object v0
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 4

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza3/a;

    iget-object v1, p0, Lza3/a;->x:Llb3/u0;

    invoke-virtual {v1, p1}, Llb3/u0;->d(Lmb3/f;)Llb3/u0;

    move-result-object p1

    iget-boolean v1, p0, Lza3/a;->z:Z

    iget-object v2, p0, Lza3/a;->E:Llb3/k0;

    iget-object v3, p0, Lza3/a;->y:Lza3/b;

    invoke-direct {v0, p1, v3, v1, v2}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Captured("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lza3/a;->x:Llb3/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lza3/a;->z:Z

    if-eqz v1, :cond_0

    const-string v1, "?"

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 3

    sget-object v0, Lnb3/h;->x:Lnb3/h;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/String;

    const/4 v2, 0x1

    invoke-static {v0, v2, v1}, Lnb3/l;->a(Lnb3/h;Z[Ljava/lang/String;)Lnb3/g;

    move-result-object v0

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 4

    iget-boolean v0, p0, Lza3/a;->z:Z

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lza3/a;

    iget-object v1, p0, Lza3/a;->y:Lza3/b;

    iget-object v2, p0, Lza3/a;->E:Llb3/k0;

    iget-object v3, p0, Lza3/a;->x:Llb3/u0;

    invoke-direct {v0, v3, v1, p1, v2}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-object v0
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 4

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lza3/a;

    iget-object v1, p0, Lza3/a;->y:Lza3/b;

    iget-boolean v2, p0, Lza3/a;->z:Z

    iget-object v3, p0, Lza3/a;->x:Llb3/u0;

    invoke-direct {v0, v3, v1, v2, p1}, Lza3/a;-><init>(Llb3/u0;Lza3/b;ZLlb3/k0;)V

    return-object v0
.end method
