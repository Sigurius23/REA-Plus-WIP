.class public final Llb3/d0;
.super Llb3/c0;
.source "SourceFile"


# instance fields
.field public final E:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

.field public final F:Lkotlin/jvm/functions/Function1;

.field public final x:Llb3/q0;

.field public final y:Ljava/util/List;

.field public final z:Z


# direct methods
.method public constructor <init>(Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "constructor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "arguments"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llb3/d0;->x:Llb3/q0;

    iput-object p2, p0, Llb3/d0;->y:Ljava/util/List;

    iput-boolean p3, p0, Llb3/d0;->z:Z

    iput-object p4, p0, Llb3/d0;->E:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    iput-object p5, p0, Llb3/d0;->F:Lkotlin/jvm/functions/Function1;

    instance-of p2, p4, Lnb3/g;

    if-eqz p2, :cond_1

    instance-of p2, p4, Lnb3/m;

    if-eqz p2, :cond_0

    return-void

    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p5, "SimpleTypeImpl should not be created for error type: "

    invoke-direct {p3, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p4, 0xa

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_1
    return-void
.end method


# virtual methods
.method public final X()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Llb3/d0;->y:Ljava/util/List;

    return-object v0
.end method

.method public final Y()Llb3/k0;
    .locals 1

    sget-object v0, Llb3/k0;->x:Lwe/o;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    return-object v0
.end method

.method public final i0()Llb3/q0;
    .locals 1

    iget-object v0, p0, Llb3/d0;->x:Llb3/q0;

    return-object v0
.end method

.method public final k0()Z
    .locals 1

    iget-boolean v0, p0, Llb3/d0;->z:Z

    return v0
.end method

.method public final m0(Lmb3/f;)Llb3/y;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/d0;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/c0;

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public final s0(Lmb3/f;)Llb3/f1;
    .locals 1

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llb3/d0;->F:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llb3/c0;

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    return-object p1
.end method

.method public final u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Llb3/d0;->E:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v0
.end method

.method public final u0(Z)Llb3/c0;
    .locals 1

    iget-boolean v0, p0, Llb3/d0;->z:Z

    if-ne p1, v0, :cond_0

    return-object p0

    :cond_0
    if-eqz p1, :cond_1

    new-instance p1, Llb3/a0;

    const/4 v0, 0x1

    invoke-direct {p1, p0, v0}, Llb3/a0;-><init>(Llb3/c0;I)V

    return-object p1

    :cond_1
    new-instance p1, Llb3/a0;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Llb3/a0;-><init>(Llb3/c0;I)V

    return-object p1
.end method

.method public final v0(Llb3/k0;)Llb3/c0;
    .locals 1

    const-string v0, "newAttributes"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lrb3/d;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Llb3/e0;

    invoke-direct {v0, p0, p1}, Llb3/e0;-><init>(Llb3/c0;Llb3/k0;)V

    return-object v0
.end method
