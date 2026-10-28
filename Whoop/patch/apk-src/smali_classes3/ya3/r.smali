.class public abstract Lya3/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lbd3/e0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lbd3/e0;

    const-string v1, "StdlibClassFinder"

    invoke-direct {v0, v1}, Lbd3/e0;-><init>(Ljava/lang/String;)V

    sput-object v0, Lya3/r;->a:Lbd3/e0;

    return-void
.end method

.method public static a(Lr93/e;)Ljava/util/Collection;
    .locals 3

    invoke-interface {p0}, Lr93/e;->k()Lr93/a0;

    move-result-object v0

    sget-object v1, Lr93/a0;->y:Lr93/a0;

    if-eq v0, v1, :cond_0

    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {p0}, Lr93/k;->g()Lr93/k;

    move-result-object v1

    instance-of v2, v1, Lr93/g0;

    if-eqz v2, :cond_1

    check-cast v1, Lr93/g0;

    invoke-interface {v1}, Lr93/g0;->u()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {p0, v0, v1, v2}, Lya3/r;->b(Lr93/e;Ljava/util/LinkedHashSet;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Z)V

    :cond_1
    invoke-interface {p0}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    const-string v2, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {p0, v0, v1, v2}, Lya3/r;->b(Lr93/e;Ljava/util/LinkedHashSet;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Z)V

    new-instance p0, Lya3/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {v0, p0}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    return-object p0
.end method

.method public static final b(Lr93/e;Ljava/util/LinkedHashSet;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Z)V
    .locals 5

    sget-object v0, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;->o:Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;

    const/4 v1, 0x2

    invoke-static {p2, v0, v1}, Ldt/b;->t(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;I)Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/k;

    instance-of v2, v1, Lr93/e;

    if-eqz v2, :cond_0

    check-cast v1, Lr93/e;

    invoke-interface {v1}, Lr93/z;->U()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Lr93/k;->getName()Lva3/h;

    move-result-object v1

    const-string v2, "getName(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lz93/c;->z:Lz93/c;

    invoke-interface {p2, v1, v2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;

    move-result-object v1

    instance-of v2, v1, Lr93/e;

    if-eqz v2, :cond_1

    check-cast v1, Lr93/e;

    goto :goto_1

    :cond_1
    instance-of v2, v1, Lr93/w0;

    if-eqz v2, :cond_2

    check-cast v1, Lr93/w0;

    check-cast v1, Ljb3/u;

    invoke-virtual {v1}, Ljb3/u;->J0()Lr93/e;

    move-result-object v1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    if-nez v1, :cond_4

    goto :goto_0

    :cond_4
    sget v2, Lya3/f;->a:I

    invoke-interface {v1}, Lr93/h;->e()Llb3/q0;

    move-result-object v2

    invoke-interface {v2}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_5
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb3/y;

    invoke-interface {p0}, Lr93/e;->a()Lr93/e;

    move-result-object v4

    invoke-static {v3, v4}, Lya3/f;->n(Llb3/y;Lr93/k;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-virtual {p1, v1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_6
    if-eqz p3, :cond_0

    invoke-interface {v1}, Lr93/e;->H()Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;

    move-result-object v1

    const-string v2, "getUnsubstitutedInnerClassesScope(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, v1, p3}, Lya3/r;->b(Lr93/e;Ljava/util/LinkedHashSet;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Z)V

    goto :goto_0

    :cond_7
    return-void
.end method

.method public static final c(Ljava/util/LinkedList;)Lr93/c;
    .locals 4

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    invoke-interface {p0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/c;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-interface {v0}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v2

    invoke-interface {v1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v3

    invoke-static {v2, v3}, Lr93/q;->b(Lr93/r;Lr93/r;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    if-gez v2, :cond_0

    :goto_1
    move-object v0, v1

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static final d(Lr93/b0;)Lya3/b;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lya3/r;->a:Lbd3/e0;

    invoke-interface {p0, v0}, Lr93/b0;->r(Lbd3/e0;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lya3/b;

    if-nez p0, :cond_0

    sget-object p0, Lya3/b;->a:Lya3/b;

    :cond_0
    return-object p0
.end method

.method public static final e(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/util/Collection;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x1

    if-gt v0, v1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0, p0}, Ljava/util/LinkedList;-><init>(Ljava/util/Collection;)V

    sget p0, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object p0

    :goto_0
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_5

    invoke-static {v0}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    sget v3, Lub3/h;->y:I

    invoke-static {}, Lub3/j;->c()Lub3/h;

    move-result-object v3

    new-instance v4, Lya3/o;

    const/4 v5, 0x0

    invoke-direct {v4, v3, v5}, Lya3/o;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2, v0, p1, v4}, Lya3/n;->g(Ljava/lang/Object;Ljava/util/LinkedList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v4

    if-ne v4, v1, :cond_1

    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v2}, Lm83/s;->o1(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "single(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v2}, Lub3/h;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v2, p1}, Lya3/n;->s(Ljava/util/Collection;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {p1, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lr93/b;

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lr93/b;

    invoke-static {v5, v7}, Lya3/n;->k(Lr93/b;Lr93/b;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v3, v6}, Lub3/h;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-virtual {v3}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_4

    invoke-virtual {p0, v3}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    :cond_4
    invoke-virtual {p0, v4}, Lub3/h;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    return-object p0
.end method
