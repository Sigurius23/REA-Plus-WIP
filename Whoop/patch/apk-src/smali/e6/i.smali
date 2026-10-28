.class public final Le6/i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic w:Ld6/d;

.field public synthetic x:Lf6/f;


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p1, Ld6/d;

    check-cast p2, Lf6/f;

    check-cast p3, Lq83/d;

    new-instance v0, Le6/i;

    const/4 v1, 0x3

    invoke-direct {v0, v1, p3}, Ls83/i;-><init>(ILq83/d;)V

    iput-object p1, v0, Le6/i;->w:Ld6/d;

    iput-object p2, v0, Le6/i;->x:Lf6/f;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Le6/i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Le6/i;->w:Ld6/d;

    iget-object v0, p0, Le6/i;->x:Lf6/f;

    invoke-virtual {v0}, Lf6/f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lf6/d;

    iget-object v3, v3, Lf6/d;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ld6/d;->a()Ljava/util/LinkedHashMap;

    move-result-object p1

    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Lf6/f;->c()Lf6/a;

    move-result-object p1

    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    instance-of v3, v1, Ljava/lang/Boolean;

    if-eqz v3, :cond_4

    invoke-static {v2}, Lge3/g;->f(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    instance-of v3, v1, Ljava/lang/Float;

    if-eqz v3, :cond_5

    invoke-static {v2}, Lge3/g;->x(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    instance-of v3, v1, Ljava/lang/Integer;

    if-eqz v3, :cond_6

    invoke-static {v2}, Lge3/g;->C(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_6
    instance-of v3, v1, Ljava/lang/Long;

    if-eqz v3, :cond_7

    invoke-static {v2}, Lge3/g;->I(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_7
    instance-of v3, v1, Ljava/lang/String;

    if-eqz v3, :cond_8

    invoke-static {v2}, Lge3/g;->U(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_8
    instance-of v3, v1, Ljava/util/Set;

    if-eqz v3, :cond_3

    invoke-static {v2}, Lge3/g;->V(Ljava/lang/String;)Lf6/d;

    move-result-object v2

    check-cast v1, Ljava/util/Set;

    invoke-virtual {p1, v2, v1}, Lf6/a;->h(Lf6/d;Ljava/lang/Object;)V

    goto :goto_2

    :cond_9
    invoke-virtual {p1}, Lf6/f;->d()Lf6/a;

    move-result-object p1

    return-object p1
.end method
