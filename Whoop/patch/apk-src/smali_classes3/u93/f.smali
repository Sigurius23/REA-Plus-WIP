.class public final Lu93/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb3/q0;


# instance fields
.field public final synthetic w:Lu93/g;


# direct methods
.method public constructor <init>(Lu93/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu93/f;->w:Lu93/g;

    return-void
.end method


# virtual methods
.method public final c()Lo93/h;
    .locals 1

    iget-object v0, p0, Lu93/f;->w:Lu93/g;

    invoke-static {v0}, Lcb3/e;->e(Lr93/k;)Lo93/h;

    move-result-object v0

    return-object v0
.end method

.method public final d()Lr93/h;
    .locals 1

    iget-object v0, p0, Lu93/f;->w:Lu93/g;

    return-object v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lu93/f;->w:Lu93/g;

    check-cast v0, Ljb3/u;

    iget-object v0, v0, Ljb3/u;->R:Ljava/util/List;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "typeConstructorParameters"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final getSupertypes()Ljava/util/Collection;
    .locals 2

    iget-object v0, p0, Lu93/f;->w:Lu93/g;

    check-cast v0, Ljb3/u;

    invoke-virtual {v0}, Ljb3/u;->L0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "getSupertypes(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "[typealias "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lu93/f;->w:Lu93/g;

    invoke-virtual {v1}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    invoke-virtual {v1}, Lva3/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
