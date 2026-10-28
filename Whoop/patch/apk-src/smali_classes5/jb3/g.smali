.class public final Ljb3/g;
.super Ljb3/q;
.source "SourceFile"


# instance fields
.field public final g:Lmb3/f;

.field public final h:Lkb3/i;

.field public final i:Lkb3/i;

.field public final synthetic j:Ljb3/h;


# direct methods
.method public constructor <init>(Ljb3/h;Lmb3/f;)V
    .locals 7

    const-string v0, "kotlinTypeRefiner"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v2, p1, Ljb3/h;->L:Lhb3/k;

    iget-object v0, p1, Ljb3/h;->E:Lqa3/k;

    iget-object v3, v0, Lqa3/k;->Q:Ljava/util/List;

    const-string v1, "getFunctionList(...)"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v0, Lqa3/k;->R:Ljava/util/List;

    const-string v1, "getPropertyList(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v0, Lqa3/k;->S:Ljava/util/List;

    const-string v1, "getTypeAliasList(...)"

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lqa3/k;->K:Ljava/util/List;

    const-string v1, "getNestedClassNameList(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    iget-object p1, p1, Ljb3/h;->L:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->b:Lsa3/f;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    invoke-static {p1, v6}, Le93/b;->F(Lsa3/f;I)Lva3/h;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance v6, Lfa3/u;

    const/4 p1, 0x3

    invoke-direct {v6, v1, p1}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    move-object v1, p0

    invoke-direct/range {v1 .. v6}, Ljb3/q;-><init>(Lhb3/k;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lc93/a;)V

    iget-object p1, v2, Lhb3/k;->a:Lhb3/i;

    iput-object p2, v1, Ljb3/g;->g:Lmb3/f;

    iget-object p2, p1, Lhb3/i;->a:Lkb3/k;

    new-instance v0, Ljb3/e;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v2}, Ljb3/e;-><init>(Ljb3/g;I)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lkb3/i;

    invoke-direct {v2, p2, v0}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v2, v1, Ljb3/g;->h:Lkb3/i;

    iget-object p1, p1, Lhb3/i;->a:Lkb3/k;

    new-instance p2, Ljb3/e;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Ljb3/e;-><init>(Ljb3/g;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lkb3/i;

    invoke-direct {v0, p1, p2}, Lkb3/h;-><init>(Lkb3/k;Lc93/a;)V

    iput-object v0, v1, Ljb3/g;->i:Lkb3/i;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    iget-object p2, p0, Ljb3/g;->j:Ljb3/h;

    iget-object p2, p2, Ljb3/h;->P:La00/g;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, La00/g;->d()Ljava/util/ArrayList;

    move-result-object p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-nez p2, :cond_1

    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final c(Ljava/util/ArrayList;Lva3/h;)V
    .locals 7

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Ljb3/g;->i:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    invoke-virtual {v1}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    sget-object v2, Lz93/c;->y:Lz93/c;

    invoke-interface {v1, p2, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v1, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->n:Lt93/b;

    iget-object v2, p0, Ljb3/g;->j:Ljb3/h;

    invoke-interface {v1, p2, v2}, Lt93/b;->a(Lva3/h;Lr93/e;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->q:Lmb3/k;

    check-cast v0, Lmb3/l;

    iget-object v1, v0, Lmb3/l;->d:Lya3/n;

    new-instance v6, Ljb3/f;

    invoke-direct {v6, p1}, Ljb3/f;-><init>(Ljava/util/ArrayList;)V

    iget-object v5, p0, Ljb3/g;->j:Ljb3/h;

    move-object v2, p2

    invoke-virtual/range {v1 .. v6}, Lya3/n;->h(Lva3/h;Ljava/util/Collection;Ljava/util/Collection;Lr93/e;Lya3/p;)V

    return-void
.end method

.method public final d(Ljava/util/ArrayList;Lva3/h;)V
    .locals 7

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v0, p0, Ljb3/g;->i:Lkb3/i;

    invoke-virtual {v0}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llb3/y;

    invoke-virtual {v1}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    sget-object v2, Lz93/c;->y:Lz93/c;

    invoke-interface {v1, p2, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_0

    :cond_0
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-object v0, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->q:Lmb3/k;

    check-cast v0, Lmb3/l;

    iget-object v1, v0, Lmb3/l;->d:Lya3/n;

    new-instance v6, Ljb3/f;

    invoke-direct {v6, p1}, Ljb3/f;-><init>(Ljava/util/ArrayList;)V

    iget-object v5, p0, Ljb3/g;->j:Ljb3/h;

    move-object v2, p2

    invoke-virtual/range {v1 .. v6}, Lya3/n;->h(Lva3/h;Ljava/util/Collection;Ljava/util/Collection;Lr93/e;Lya3/p;)V

    return-void
.end method

.method public final e(Lva3/h;)Lva3/c;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v0, v0, Ljb3/h;->H:Lva3/c;

    invoke-virtual {v0, p1}, Lva3/c;->d(Lva3/h;)Lva3/c;

    move-result-object p1

    return-object p1
.end method

.method public final g()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v0, v0, Ljb3/h;->N:Lja3/h;

    invoke-virtual {v0}, Llb3/f;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getClassifierNames()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    if-nez v2, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_1
    return-object v1
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljb3/g;->recordLookup(Lva3/h;Lz93/a;)V

    iget-object v0, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v0, v0, Ljb3/h;->P:La00/g;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, La00/g;->k(Lva3/h;)Lr93/e;

    move-result-object v0

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-super {p0, p1, p2}, Ljb3/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ljb3/g;->h:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    return-object p1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljb3/g;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-super {p0, p1, p2}, Ljb3/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Ljb3/g;->recordLookup(Lva3/h;Lz93/a;)V

    invoke-super {p0, p1, p2}, Ljb3/q;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v1, v0, Ljb3/h;->N:Lja3/h;

    invoke-virtual {v1}, Llb3/f;->h()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/y;

    invoke-virtual {v3}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v3

    invoke-interface {v3}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v1, v1, Lhb3/k;->a:Lhb3/i;

    iget-object v1, v1, Lhb3/i;->n:Lt93/b;

    invoke-interface {v1, v0}, Lt93/b;->d(Lr93/e;)Ljava/util/Collection;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    return-object v2
.end method

.method public final i()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Ljb3/g;->j:Ljb3/h;

    iget-object v0, v0, Ljb3/h;->N:Lja3/h;

    invoke-virtual {v0}, Llb3/f;->h()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/y;

    invoke-virtual {v2}, Llb3/y;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v2

    invoke-interface {v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final k(Ljb3/t;)Z
    .locals 2

    iget-object v0, p0, Ljb3/q;->b:Lhb3/k;

    iget-object v0, v0, Lhb3/k;->a:Lhb3/i;

    iget-object v0, v0, Lhb3/i;->o:Lt93/d;

    iget-object v1, p0, Ljb3/g;->j:Ljb3/h;

    invoke-interface {v0, v1, p1}, Lt93/d;->e(Lr93/e;Ljb3/t;)Z

    move-result p1

    return p1
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Ljb3/q;->b:Lhb3/k;

    iget-object p1, p1, Lhb3/k;->a:Lhb3/i;

    iget-object p1, p1, Lhb3/i;->i:Lz93/b;

    const-string p2, "<this>"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "scopeOwner"

    iget-object p2, p0, Ljb3/g;->j:Ljb3/h;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
