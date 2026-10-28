.class public final Lkotlin/reflect/jvm/internal/impl/resolve/scopes/v;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;
.source "SourceFile"


# instance fields
.field public final b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;


# direct methods
.method public constructor <init>(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/v;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-void
.end method


# virtual methods
.method public final b()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/v;->b:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    return-object v0
.end method

.method public final getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 3

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedDescriptors(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lr93/k;

    instance-of v2, v2, Lr93/b;

    if-eqz v2, :cond_0

    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    sget-object p1, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->z:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    invoke-static {p2, p1}, Lya3/r;->e(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    invoke-static {p1, v0}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->x:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    invoke-static {p1, p2}, Lya3/r;->e(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method

.method public final getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/a;->getContributedVariables(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object p1

    sget-object p2, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;->y:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/u;

    invoke-static {p1, p2}, Lya3/r;->e(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;

    move-result-object p1

    return-object p1
.end method
