.class public abstract Lu93/g0;
.super Lu93/o;
.source "SourceFile"

# interfaces
.implements Lr93/g0;


# instance fields
.field public final F:Lva3/e;

.field public final G:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lr93/b0;Lva3/e;)V
    .locals 3

    const-string v0, "module"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fqName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p2, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Lva3/f;->e:Lva3/h;

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lva3/f;->g()Lva3/h;

    move-result-object v0

    :goto_0
    sget-object v1, Lr93/s0;->q:Lr93/v0;

    sget-object v2, Ls93/g;->a:Ls93/f;

    invoke-direct {p0, p1, v2, v0, v1}, Lu93/o;-><init>(Lr93/k;Ls93/i;Lva3/h;Lr93/s0;)V

    iput-object p2, p0, Lu93/g0;->F:Lva3/e;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "package "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " of "

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lu93/g0;->G:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final J0()Lr93/b0;
    .locals 2

    invoke-super {p0}, Lu93/o;->g()Lr93/k;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lr93/b0;

    return-object v0
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitPackageFragmentDescriptor(Lr93/g0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic g()Lr93/k;
    .locals 1

    invoke-virtual {p0}, Lu93/g0;->J0()Lr93/b0;

    move-result-object v0

    return-object v0
.end method

.method public getSource()Lr93/s0;
    .locals 1

    sget-object v0, Lr93/s0;->q:Lr93/v0;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu93/g0;->G:Ljava/lang/String;

    return-object v0
.end method
