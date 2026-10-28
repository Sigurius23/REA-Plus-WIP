.class public abstract Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# virtual methods
.method public final a()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 2

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    instance-of v0, v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;

    invoke-virtual {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->a()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    return-object v0
.end method

.method public abstract b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
.end method

.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

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

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object p1

    return-object p1
.end method

.method public getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 1

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 1

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->recordLookup(Lva3/h;Lz93/a;)V

    return-void
.end method
