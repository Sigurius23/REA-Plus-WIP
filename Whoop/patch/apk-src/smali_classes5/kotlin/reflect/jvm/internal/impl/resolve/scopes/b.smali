.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# instance fields
.field public final b:Ljava/lang/String;

.field public final c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->b:Ljava/lang/String;

    iput-object p2, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-void
.end method


# virtual methods
.method public final getClassifierNames()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    invoke-static {v0}, Lm83/n;->V([Ljava/lang/Object;)Ljava/lang/Iterable;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/config/a;->x(Ljava/lang/Iterable;)Ljava/util/HashSet;

    move-result-object v0

    return-object v0
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 6

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_2

    aget-object v4, v0, v3

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v4

    if-eqz v4, :cond_1

    instance-of v5, v4, Lr93/i;

    if-eqz v5, :cond_0

    move-object v5, v4

    check-cast v5, Lr93/z;

    invoke-interface {v5}, Lr93/z;->U()Z

    move-result v5

    if-eqz v5, :cond_0

    if-nez v2, :cond_1

    move-object v2, v4

    goto :goto_1

    :cond_0
    return-object v4

    :cond_1
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v2
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 5

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v1, v0

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v3

    :cond_2
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v1, v0

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v3

    :cond_2
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 5

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v1, v0

    if-eqz v1, :cond_3

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v1, v3, :cond_2

    array-length v1, v0

    const/4 v3, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v4, v0, v2

    invoke-interface {v4, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v4

    invoke-static {v3, v4}, Lj93/l0;->s(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;

    move-result-object v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    if-nez v3, :cond_1

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1

    :cond_1
    return-object v3

    :cond_2
    aget-object v0, v0, v2

    invoke-interface {v0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final getFunctionNames()Ljava/util/Set;
    .locals 5

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getFunctionNames()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v0, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final getVariableNames()Ljava/util/Set;
    .locals 5

    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    iget-object v1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v2, v1

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_0

    aget-object v4, v1, v3

    invoke-interface {v4}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;->getVariableNames()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v0, v4}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final recordLookup(Lva3/h;Lz93/a;)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->c:[Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, v0, v2

    invoke-interface {v3, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->recordLookup(Lva3/h;Lz93/a;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/b;->b:Ljava/lang/String;

    return-object v0
.end method
