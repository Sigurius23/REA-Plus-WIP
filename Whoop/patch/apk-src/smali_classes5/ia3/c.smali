.class public final Lia3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls93/i;


# instance fields
.field public final w:Lzt/q;

.field public final x:Lma3/b;

.field public final y:Z

.field public final z:Landroidx/lifecycle/h2;


# direct methods
.method public constructor <init>(Lzt/q;Lma3/b;Z)V
    .locals 1

    const-string v0, "c"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "annotationOwner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lia3/c;->w:Lzt/q;

    iput-object p2, p0, Lia3/c;->x:Lma3/b;

    iput-boolean p3, p0, Lia3/c;->y:Z

    iget-object p1, p1, Lzt/q;->x:Ljava/lang/Object;

    check-cast p1, Lia3/a;

    iget-object p1, p1, Lia3/a;->a:Lkb3/n;

    new-instance p2, Ldc3/s;

    const/4 p3, 0x5

    invoke-direct {p2, p0, p3}, Ldc3/s;-><init>(Ljava/lang/Object;I)V

    check-cast p1, Lkb3/k;

    invoke-virtual {p1, p2}, Lkb3/k;->c(Lkotlin/jvm/functions/Function1;)Landroidx/lifecycle/h2;

    move-result-object p1

    iput-object p1, p0, Lia3/c;->z:Landroidx/lifecycle/h2;

    return-void
.end method


# virtual methods
.method public final bridge J(Lva3/e;)Z
    .locals 0

    invoke-static {p0, p1}, Ls93/h;->p(Ls93/i;Lva3/e;)Z

    move-result p1

    return p1
.end method

.method public final T(Lva3/e;)Ls93/b;
    .locals 3

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lia3/c;->x:Lma3/b;

    invoke-interface {v0, p1}, Lma3/b;->a(Lva3/e;)Lx93/d;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v2, p0, Lia3/c;->z:Landroidx/lifecycle/h2;

    invoke-virtual {v2, v1}, Landroidx/lifecycle/h2;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ls93/b;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    return-object v1

    :cond_1
    :goto_0
    sget-object v1, Lga3/c;->a:Lva3/h;

    iget-object v1, p0, Lia3/c;->w:Lzt/q;

    invoke-static {p1, v0, v1}, Lga3/c;->a(Lva3/e;Lma3/b;Lzt/q;)Lha3/g;

    move-result-object p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lia3/c;->x:Lma3/b;

    invoke-interface {v0}, Lma3/b;->getAnnotations()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 5

    iget-object v0, p0, Lia3/c;->x:Lma3/b;

    invoke-interface {v0}, Lma3/b;->getAnnotations()Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v1

    iget-object v2, p0, Lia3/c;->z:Landroidx/lifecycle/h2;

    invoke-static {v1, v2}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v1

    sget-object v2, Lga3/c;->a:Lva3/h;

    sget-object v2, Lo93/m;->m:Lva3/e;

    iget-object v3, p0, Lia3/c;->w:Lzt/q;

    invoke-static {v2, v0, v3}, Lga3/c;->a(Lva3/e;Lma3/b;Lzt/q;)Lha3/g;

    move-result-object v0

    new-instance v2, Lb3/d3;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lb3/d3;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x2

    new-array v0, v0, [Lxb3/i;

    const/4 v4, 0x0

    aput-object v1, v0, v4

    const/4 v1, 0x1

    aput-object v2, v0, v1

    invoke-static {v0}, Lm83/n;->X([Ljava/lang/Object;)Lxb3/i;

    move-result-object v0

    new-instance v1, Lxa0/a;

    invoke-direct {v1, v3}, Lxa0/a;-><init>(I)V

    invoke-static {v0, v1}, Lxb3/k;->v(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/g;

    move-result-object v0

    new-instance v1, Lvb1/a;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lvb1/a;-><init>(I)V

    new-instance v2, Lxb3/f;

    invoke-direct {v2, v0, v4, v1}, Lxb3/f;-><init>(Lxb3/i;ZLkotlin/jvm/functions/Function1;)V

    new-instance v0, Lxb3/e;

    invoke-direct {v0, v2}, Lxb3/e;-><init>(Lxb3/f;)V

    return-object v0
.end method
