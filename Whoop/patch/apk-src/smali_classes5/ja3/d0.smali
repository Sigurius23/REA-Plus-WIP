.class public final Lja3/d0;
.super Lja3/e0;
.source "SourceFile"


# static fields
.field public static final synthetic p:I


# instance fields
.field public final n:Lx93/n;

.field public final o:Lja3/i;


# direct methods
.method public constructor <init>(Lzt/q;Lx93/n;Lja3/i;)V
    .locals 1

    const-string v0, "jClass"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lja3/a0;-><init>(Lzt/q;Lja3/o;)V

    iput-object p2, p0, Lja3/d0;->n:Lx93/n;

    iput-object p3, p0, Lja3/d0;->o:Lja3/i;

    return-void
.end method

.method public static o(Lr93/n0;)Lr93/n0;
    .locals 2

    invoke-interface {p0}, Lr93/c;->getKind()I

    move-result v0

    invoke-static {v0}, Lq63/c;->a(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-interface {p0}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object p0

    const-string v0, "getOverriddenDescriptors(...)"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lr93/n0;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lja3/d0;->o(Lr93/n0;)Lr93/n0;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Lm83/s;->y0(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0}, Lm83/s;->p1(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lr93/n0;

    return-object p0
.end method


# virtual methods
.method public final a(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/jvm/functions/Function1;)Ljava/util/Set;
    .locals 0

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lm83/a0;->w:Lm83/a0;

    return-object p1
.end method

.method public final b(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;Lkotlin/reflect/jvm/internal/impl/resolve/scopes/l;)Ljava/util/Set;
    .locals 2

    const-string p2, "kindFilter"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lja3/c;

    invoke-interface {p1}, Lja3/c;->a()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    iget-object p2, p0, Lja3/d0;->o:Lja3/i;

    invoke-static {p2}, Lce/w;->O(Lr93/e;)Lja3/d0;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lja3/a0;->getFunctionNames()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    sget-object v0, Lm83/a0;->w:Lm83/a0;

    :cond_1
    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    iget-object v0, p0, Lja3/d0;->n:Lx93/n;

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lo93/n;->c:Lva3/h;

    sget-object v1, Lo93/n;->a:Lva3/h;

    filled-new-array {v0, v1}, [Lva3/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {p1, v0}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    :cond_2
    iget-object v0, p0, Lja3/a0;->b:Lzt/q;

    iget-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->x:Ldb3/e;

    check-cast v1, Ldb3/a;

    invoke-virtual {v1, p2, v0}, Ldb3/a;->g(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p1
.end method

.method public final c(Ljava/util/ArrayList;Lva3/h;)V
    .locals 3

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/a0;->b:Lzt/q;

    iget-object v1, v0, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v1, v1, Lia3/a;->x:Ldb3/e;

    iget-object v2, p0, Lja3/d0;->o:Lja3/i;

    check-cast v1, Ldb3/a;

    invoke-virtual {v1, v2, p2, p1, v0}, Ldb3/a;->d(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V

    return-void
.end method

.method public final d()Lja3/c;
    .locals 3

    new-instance v0, Lja3/a;

    iget-object v1, p0, Lja3/d0;->n:Lx93/n;

    sget-object v2, Lja3/m;->z:Lja3/m;

    invoke-direct {v0, v1, v2}, Lja3/a;-><init>(Lx93/n;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method

.method public final f(Ljava/util/LinkedHashSet;Lva3/h;)V
    .locals 8

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/d0;->o:Lja3/i;

    invoke-static {v0}, Lce/w;->O(Lr93/e;)Lja3/d0;

    move-result-object v1

    if-nez v1, :cond_0

    sget-object v1, Lm83/a0;->w:Lm83/a0;

    goto :goto_0

    :cond_0
    sget-object v2, Lz93/c;->E:Lz93/c;

    invoke-virtual {v1, p2, v2}, Lja3/a0;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v1

    :goto_0
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    iget-object v1, p0, Lja3/a0;->b:Lzt/q;

    iget-object v1, v1, Lzt/q;->x:Ljava/lang/Object;

    check-cast v1, Lia3/a;

    iget-object v6, v1, Lia3/a;->f:Lhb3/o;

    iget-object v1, v1, Lia3/a;->u:Lmb3/k;

    check-cast v1, Lmb3/l;

    iget-object v7, v1, Lmb3/l;->d:Lya3/n;

    iget-object v5, p0, Lja3/d0;->o:Lja3/i;

    move-object v4, p1

    move-object v2, p2

    invoke-static/range {v2 .. v7}, Lbi/g;->V(Lva3/h;Ljava/util/Collection;Ljava/util/AbstractCollection;Lja3/i;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/Collection;->addAll(Ljava/util/Collection;)Z

    iget-object p1, p0, Lja3/d0;->n:Lx93/n;

    iget-object p1, p1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {p1}, Ljava/lang/Class;->isEnum()Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lo93/n;->c:Lva3/h;

    invoke-virtual {v2, p1}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-static {v0}, Lya3/p;->h(Lu93/b;)Lu93/q0;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    return-void

    :cond_1
    sget-object p1, Lo93/n;->a:Lva3/h;

    invoke-virtual {v2, p1}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {v0}, Lya3/p;->i(Lu93/b;)Lu93/q0;

    move-result-object p1

    invoke-interface {v4, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method

.method public final g(Ljava/util/ArrayList;Lva3/h;)V
    .locals 10

    const-string v1, "name"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Ls;

    const/16 v3, 0x9

    invoke-direct {v2, p2, v3}, Ls;-><init>(Ljava/lang/Object;I)V

    iget-object v6, p0, Lja3/d0;->o:Lja3/i;

    invoke-static {v6}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    new-instance v4, Lja3/c0;

    invoke-direct {v4, v6, v1, v2}, Lja3/c0;-><init>(Lr93/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    sget-object v2, Lja3/b0;->w:Lja3/b0;

    invoke-static {v3, v2, v4}, Ls93/h;->i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    iget-object v7, p0, Lja3/a0;->b:Lzt/q;

    if-nez v2, :cond_0

    iget-object v2, v7, Lzt/q;->x:Ljava/lang/Object;

    check-cast v2, Lia3/a;

    iget-object v4, v2, Lia3/a;->f:Lhb3/o;

    iget-object v2, v2, Lia3/a;->u:Lmb3/k;

    check-cast v2, Lmb3/l;

    iget-object v5, v2, Lmb3/l;->d:Lya3/n;

    iget-object v3, p0, Lja3/d0;->o:Lja3/i;

    move-object v2, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lbi/g;->V(Lva3/h;Ljava/util/Collection;Ljava/util/AbstractCollection;Lja3/i;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto :goto_2

    :cond_0
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lr93/n0;

    invoke-static {v4}, Lja3/d0;->o(Lr93/n0;)Lr93/n0;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    if-nez v5, :cond_1

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    check-cast v5, Ljava/util/List;

    invoke-interface {v5, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    iget-object v0, v7, Lzt/q;->x:Ljava/lang/Object;

    check-cast v0, Lia3/a;

    iget-object v4, v0, Lia3/a;->f:Lhb3/o;

    iget-object v0, v0, Lia3/a;->u:Lmb3/k;

    check-cast v0, Lmb3/l;

    iget-object v5, v0, Lmb3/l;->d:Lya3/n;

    iget-object v3, p0, Lja3/d0;->o:Lja3/i;

    move-object v2, p1

    move-object v0, p2

    invoke-static/range {v0 .. v5}, Lbi/g;->V(Lva3/h;Ljava/util/Collection;Ljava/util/AbstractCollection;Lja3/i;Lhb3/o;Lya3/n;)Ljava/util/LinkedHashSet;

    move-result-object v1

    invoke-static {v8, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1, v8}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    :goto_2
    iget-object v1, p0, Lja3/d0;->n:Lx93/n;

    iget-object v1, v1, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->isEnum()Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Lo93/n;->b:Lva3/h;

    invoke-virtual {p2, v1}, Lva3/h;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {v6}, Lya3/p;->g(Lu93/b;)Lu93/m0;

    move-result-object v0

    invoke-static {p1, v0}, Lub3/j;->a(Ljava/util/AbstractCollection;Ljava/lang/Object;)V

    :cond_4
    return-void
.end method

.method public final getContributedClassifier(Lva3/h;Lz93/a;)Lr93/h;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "location"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final h(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/g;)Ljava/util/Set;
    .locals 4

    const-string v0, "kindFilter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lja3/a0;->e:Lkb3/i;

    invoke-virtual {p1}, Lkb3/i;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lja3/c;

    invoke-interface {p1}, Lja3/c;->c()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->H1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object p1

    sget-object v0, Lja3/m;->E:Lja3/m;

    iget-object v1, p0, Lja3/d0;->o:Lja3/i;

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    new-instance v3, Lja3/c0;

    invoke-direct {v3, v1, p1, v0}, Lja3/c0;-><init>(Lr93/e;Ljava/util/Set;Lkotlin/jvm/functions/Function1;)V

    sget-object v0, Lja3/b0;->w:Lja3/b0;

    invoke-static {v2, v0, v3}, Ls93/h;->i(Ljava/util/Collection;Lub3/a;Ls9/f;)Ljava/lang/Object;

    iget-object v0, p0, Lja3/d0;->n:Lx93/n;

    iget-object v0, v0, Lx93/n;->a:Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lo93/n;->b:Lva3/h;

    invoke-interface {p1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    :cond_0
    return-object p1
.end method

.method public final j()Lr93/k;
    .locals 1

    iget-object v0, p0, Lja3/d0;->o:Lja3/i;

    return-object v0
.end method
