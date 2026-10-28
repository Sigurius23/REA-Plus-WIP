.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# instance fields
.field public final b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

.field public final c:Llb3/a1;

.field public d:Ljava/util/HashMap;

.field public final e:Ll83/p;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Llb3/a1;)V
    .locals 1

    const-string v0, "workerScope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "givenSubstitutor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    new-instance p1, Lfa3/u;

    const/4 v0, 0x6

    invoke-direct {p1, p2, v0}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    invoke-virtual {p2}, Llb3/a1;->f()Llb3/y0;

    move-result-object p1

    const-string p2, "getSubstitution(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lva3/b;->l(Llb3/y0;)Llb3/y0;

    move-result-object p1

    new-instance p2, Llb3/a1;

    invoke-direct {p2, p1}, Llb3/a1;-><init>(Llb3/y0;)V

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->c:Llb3/a1;

    new-instance p1, Lfa3/u;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, Lfa3/u;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->e:Ll83/p;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/Collection;)Ljava/util/Collection;
    .locals 3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->c:Llb3/a1;

    iget-object v0, v0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v0}, Llb3/y0;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    return-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    new-instance v1, Ljava/util/LinkedHashSet;

    const/4 v2, 0x3

    if-ge v0, v2, :cond_2

    goto :goto_0

    :cond_2
    div-int/lit8 v2, v0, 0x3

    add-int/2addr v2, v0

    add-int/lit8 v2, v2, 0x1

    :goto_0
    invoke-direct {v1, v2}, Ljava/util/LinkedHashSet;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr93/k;

    invoke-virtual {p0, v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b(Lr93/k;)Lr93/k;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v1
.end method

.method public final b(Lr93/k;)Lr93/k;
    .locals 3

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->c:Llb3/a1;

    iget-object v1, v0, Llb3/a1;->a:Llb3/y0;

    invoke-virtual {v1}, Llb3/y0;->e()Z

    move-result v1

    if-eqz v1, :cond_0

    return-object p1

    :cond_0
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->d:Ljava/util/HashMap;

    if-nez v1, :cond_1

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->d:Ljava/util/HashMap;

    :cond_1
    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->d:Ljava/util/HashMap;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    instance-of v2, p1, Lr93/u0;

    if-eqz v2, :cond_3

    move-object v2, p1

    check-cast v2, Lr93/u0;

    invoke-interface {v2, v0}, Lr93/u0;->d(Llb3/a1;)Lr93/l;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v1, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " substitution fails"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/AssertionError;

    invoke-direct {v0, p1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown descriptor in scope: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_0
    check-cast v2, Lr93/k;

    return-object v2
.end method

.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getClassifierNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b(Lr93/k;)Lr93/k;

    move-result-object p1

    check-cast p1, Lr93/h;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->e:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

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

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    invoke-virtual {p0, p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->a(Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/t;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final bridge recordLookup(Lva3/h;Lz93/a;)V
    .locals 0

    invoke-static {p0, p1, p2}, Le4/a;->K(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lva3/h;Lz93/a;)V

    return-void
.end method
