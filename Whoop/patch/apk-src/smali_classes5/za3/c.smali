.class public final Lza3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lza3/b;


# instance fields
.field public final w:Llb3/u0;

.field public x:Lmb3/i;


# direct methods
.method public constructor <init>(Llb3/u0;)V
    .locals 1

    const-string v0, "projection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza3/c;->w:Llb3/u0;

    invoke-virtual {p1}, Llb3/u0;->a()Llb3/g1;

    sget-object p1, Llb3/g1;->y:Llb3/g1;

    return-void
.end method


# virtual methods
.method public final b()Llb3/u0;
    .locals 1

    iget-object v0, p0, Lza3/c;->w:Llb3/u0;

    return-object v0
.end method

.method public final c()Lo93/h;
    .locals 2

    iget-object v0, p0, Lza3/c;->w:Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->c()Lo93/h;

    move-result-object v0

    const-string v1, "getBuiltIns(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final bridge synthetic d()Lr93/h;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final f()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final getParameters()Ljava/util/List;
    .locals 1

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method

.method public final getSupertypes()Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, Lza3/c;->w:Llb3/u0;

    invoke-virtual {v0}, Llb3/u0;->a()Llb3/g1;

    move-result-object v1

    sget-object v2, Llb3/g1;->E:Llb3/g1;

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lza3/c;->c()Lo93/h;

    move-result-object v0

    invoke-virtual {v0}, Lo93/h;->p()Llb3/c0;

    move-result-object v0

    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "CapturedTypeConstructor("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lza3/c;->w:Llb3/u0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
