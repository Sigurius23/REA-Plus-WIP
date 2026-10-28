.class public final Lu93/e0;
.super Lu93/n;
.source "SourceFile"

# interfaces
.implements Lr93/b0;


# instance fields
.field public final E:Lo93/h;

.field public final F:Ljava/util/Map;

.field public final G:Lu93/j0;

.field public H:Lu93/d0;

.field public I:Lr93/j0;

.field public final J:Z

.field public final K:Lkb3/e;

.field public final L:Ll83/p;

.field public final z:Lkb3/k;


# direct methods
.method public constructor <init>(Lva3/h;Lkb3/k;Lo93/h;I)V
    .locals 0

    const-string p4, "moduleName"

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p4, Ls93/g;->a:Ls93/f;

    invoke-direct {p0, p4, p1}, Lu93/n;-><init>(Ls93/i;Lva3/h;)V

    iput-object p2, p0, Lu93/e0;->z:Lkb3/k;

    iput-object p3, p0, Lu93/e0;->E:Lo93/h;

    iget-boolean p3, p1, Lva3/h;->x:Z

    if-eqz p3, :cond_1

    sget-object p1, Lm83/z;->w:Lm83/z;

    iput-object p1, p0, Lu93/e0;->F:Ljava/util/Map;

    sget-object p1, Lu93/j0;->a:Lu93/h0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lu93/h0;->b:Lbd3/e0;

    invoke-virtual {p0, p1}, Lu93/e0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu93/j0;

    if-nez p1, :cond_0

    sget-object p1, Lu93/i0;->b:Lu93/i0;

    :cond_0
    iput-object p1, p0, Lu93/e0;->G:Lu93/j0;

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu93/e0;->J:Z

    new-instance p1, Ldc3/s;

    const/16 p3, 0xf

    invoke-direct {p1, p0, p3}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, p1}, Lkb3/k;->b(Lkotlin/jvm/functions/Function1;)Lkb3/e;

    move-result-object p1

    iput-object p1, p0, Lu93/e0;->K:Lkb3/e;

    new-instance p1, Lo93/k;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lo93/k;-><init>(Lu93/e0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lu93/e0;->L:Ll83/p;

    return-void

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string p4, "Module name must be special: "

    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method


# virtual methods
.method public final F(Lva3/e;)Lr93/k0;
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lu93/e0;->J:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu93/e0;->K:Lkb3/e;

    invoke-virtual {v0, p1}, Lkb3/e;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lr93/k0;

    return-object p1

    :cond_0
    invoke-static {p0}, Lr93/y;->c(Lu93/e0;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final T(Lr93/m;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-interface {p1, p0, p2}, Lr93/m;->visitModuleDeclaration(Lr93/b0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final c()Lo93/h;
    .locals 1

    iget-object v0, p0, Lu93/e0;->E:Lo93/h;

    return-object v0
.end method

.method public final e0()Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lu93/e0;->H:Lu93/d0;

    if-eqz v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Dependencies of module "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v1

    iget-object v1, v1, Lva3/h;->w:Ljava/lang/String;

    const-string v2, "toString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " were not set"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/AssertionError;

    invoke-direct {v1, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v1
.end method

.method public final f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 2

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    iget-boolean v1, p0, Lu93/e0;->J:Z

    if-eqz v1, :cond_1

    if-eqz v1, :cond_0

    iget-object v0, p0, Lu93/e0;->L:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu93/m;

    invoke-virtual {v0, p1, p2}, Lu93/m;->f(Lva3/e;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p0}, Lr93/y;->c(Lu93/e0;)V

    throw v0

    :cond_1
    invoke-static {p0}, Lr93/y;->c(Lu93/e0;)V

    throw v0
.end method

.method public final bridge g()Lr93/k;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final n0(Lr93/b0;)Z
    .locals 1

    const-string v0, "targetModule"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lu93/e0;->H:Lu93/d0;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    invoke-static {v0, p1}, Lm83/s;->w0(Ljava/lang/Iterable;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lu93/e0;->e0()Ljava/util/List;

    invoke-interface {p1}, Lr93/b0;->e0()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1, p0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final r(Lbd3/e0;)Ljava/lang/Object;
    .locals 1

    const-string v0, "capability"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lu93/e0;->F:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    return-object p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lu93/n;->H0(Lr93/k;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lu93/e0;->J:Z

    if-nez v1, :cond_0

    const-string v1, " !isValid"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    const-string v1, " packageFragmentProvider: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lu93/e0;->I:Lr93/j0;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
