.class public final Ljb3/u;
.super Lu93/g;
.source "SourceFile"

# interfaces
.implements Ljb3/k;


# instance fields
.field public final K:Lqa3/y0;

.field public final L:Lsa3/f;

.field public final M:Lsa3/h;

.field public final N:Lsa3/j;

.field public final O:Ljb3/j;

.field public P:Llb3/c0;

.field public Q:Llb3/c0;

.field public R:Ljava/util/List;

.field public S:Llb3/c0;


# direct methods
.method public constructor <init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Lr93/r;Lqa3/y0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V
    .locals 1

    const-string v0, "storageManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "containingDeclaration"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "visibility"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "proto"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "nameResolver"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "typeTable"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "versionRequirementTable"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p5}, Lu93/g;-><init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Lr93/r;)V

    move-object p1, p0

    iput-object p6, p1, Ljb3/u;->K:Lqa3/y0;

    iput-object p7, p1, Ljb3/u;->L:Lsa3/f;

    iput-object p8, p1, Ljb3/u;->M:Lsa3/h;

    iput-object p9, p1, Ljb3/u;->N:Lsa3/j;

    iput-object p10, p1, Ljb3/u;->O:Ljb3/j;

    return-void
.end method


# virtual methods
.method public final J0()Lr93/e;
    .locals 2

    invoke-virtual {p0}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v0

    invoke-virtual {v0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v0

    invoke-interface {v0}, Llb3/q0;->d()Lr93/h;

    move-result-object v0

    instance-of v1, v0, Lr93/e;

    if-eqz v1, :cond_1

    check-cast v0, Lr93/e;

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final K0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Ljb3/u;->Q:Llb3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "expandedType"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final L0()Llb3/c0;
    .locals 1

    iget-object v0, p0, Ljb3/u;->P:Llb3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "underlyingType"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final M0(Ljava/util/List;Llb3/c0;Llb3/c0;)V
    .locals 6

    const-string v0, "underlyingType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "expandedType"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lu93/g;->H:Ljava/util/List;

    iput-object p2, p0, Ljb3/u;->P:Llb3/c0;

    iput-object p3, p0, Ljb3/u;->Q:Llb3/c0;

    invoke-static {p0}, Ljc/x;->u(Lr93/i;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ljb3/u;->R:Ljava/util/List;

    invoke-virtual {p0}, Ljb3/u;->J0()Lr93/e;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lr93/e;->K()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    :goto_0
    move-object v4, p1

    goto :goto_2

    :cond_1
    :goto_1
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/n;

    goto :goto_0

    :goto_2
    new-instance v5, Lu93/e;

    invoke-direct {v5, p0}, Lu93/e;-><init>(Ljb3/u;)V

    sget-object p1, Llb3/d1;->a:Lnb3/i;

    invoke-static {p0}, Lnb3/l;->f(Lr93/k;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lnb3/k;->K:Lnb3/k;

    invoke-virtual {p0}, Lu93/g;->toString()Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, p2}, Lnb3/l;->c(Lnb3/k;[Ljava/lang/String;)Lnb3/i;

    move-result-object p1

    goto :goto_3

    :cond_2
    invoke-virtual {p0}, Lu93/g;->e()Llb3/q0;

    move-result-object v1

    if-eqz v1, :cond_3

    move-object p1, v1

    check-cast p1, Lu93/f;

    invoke-virtual {p1}, Lu93/f;->getParameters()Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Llb3/d1;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    sget-object p1, Llb3/k0;->x:Lwe/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Llb3/k0;->y:Llb3/k0;

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Llb3/o;->l(Llb3/k0;Llb3/q0;Ljava/util/List;ZLkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lkotlin/jvm/functions/Function1;)Llb3/c0;

    move-result-object p1

    :goto_3
    iput-object p1, p0, Ljb3/u;->S:Llb3/c0;

    return-void

    :cond_3
    const/16 p1, 0xc

    invoke-static {p1}, Llb3/d1;->a(I)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final R()Lwa3/v;
    .locals 1

    iget-object v0, p0, Ljb3/u;->K:Lqa3/y0;

    return-object v0
.end method

.method public final d(Llb3/a1;)Lr93/l;
    .locals 12

    const-string v0, "substitutor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p1, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    new-instance v1, Ljb3/u;

    invoke-virtual {p0}, Lu93/o;->g()Lr93/k;

    move-result-object v3

    const-string v0, "getContainingDeclaration(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lal/a;->getAnnotations()Ls93/i;

    move-result-object v4

    const-string v0, "<get-annotations>(...)"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lu93/n;->getName()Lva3/h;

    move-result-object v5

    const-string v0, "getName(...)"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, p0, Ljb3/u;->N:Lsa3/j;

    iget-object v11, p0, Ljb3/u;->O:Ljb3/j;

    iget-object v2, p0, Lu93/g;->F:Lkb3/n;

    iget-object v6, p0, Lu93/g;->G:Lr93/r;

    iget-object v7, p0, Ljb3/u;->K:Lqa3/y0;

    iget-object v8, p0, Ljb3/u;->L:Lsa3/f;

    iget-object v9, p0, Ljb3/u;->M:Lsa3/h;

    invoke-direct/range {v1 .. v11}, Ljb3/u;-><init>(Lkb3/n;Lr93/k;Ls93/i;Lva3/h;Lr93/r;Lqa3/y0;Lsa3/f;Lsa3/h;Lsa3/j;Ljb3/j;)V

    invoke-virtual {p0}, Lu93/g;->j()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Ljb3/u;->L0()Llb3/c0;

    move-result-object v2

    sget-object v3, Llb3/g1;->y:Llb3/g1;

    invoke-virtual {p1, v2, v3}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object v2

    invoke-static {v2}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object v2

    invoke-virtual {p0}, Ljb3/u;->K0()Llb3/c0;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Llb3/a1;->g(Llb3/y;Llb3/g1;)Llb3/y;

    move-result-object p1

    invoke-static {p1}, Lse/a;->t(Llb3/y;)Llb3/c0;

    move-result-object p1

    invoke-virtual {v1, v0, v2, p1}, Ljb3/u;->M0(Ljava/util/List;Llb3/c0;Llb3/c0;)V

    return-object v1
.end method

.method public final i()Llb3/c0;
    .locals 1

    iget-object v0, p0, Ljb3/u;->S:Llb3/c0;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "defaultTypeImpl"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final t()Lsa3/h;
    .locals 1

    iget-object v0, p0, Ljb3/u;->M:Lsa3/h;

    return-object v0
.end method

.method public final w()Lsa3/f;
    .locals 1

    iget-object v0, p0, Ljb3/u;->L:Lsa3/f;

    return-object v0
.end method

.method public final x()Ljb3/j;
    .locals 1

    iget-object v0, p0, Ljb3/u;->O:Ljb3/j;

    return-object v0
.end method
