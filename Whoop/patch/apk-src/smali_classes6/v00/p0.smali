.class public abstract Lv00/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lv00/q0;


# virtual methods
.method public final a(Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->s(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Lv00/m0;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public final b(Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ls9/f;->z(Lv00/q0;Lv00/c0;Lv00/b0;Ljava/util/List;)Lu00/f;

    move-result-object p1

    return-object p1
.end method

.method public final g(Lv00/b0;Ljava/util/List;)Z
    .locals 0

    invoke-static {p0, p1, p2}, Ls9/f;->r(Lv00/q0;Lv00/b0;Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public final h(Lv00/c0;Lv00/m0;)Ljava/util/List;
    .locals 12

    iget-object v0, p2, Lv00/m0;->c:Ljava/util/LinkedHashMap;

    new-instance v1, Ld30/f0;

    invoke-direct {v1, p2}, Ld30/f0;-><init>(Lv00/m0;)V

    invoke-virtual {p0, p1, p2, v1}, Lv00/p0;->k(Lv00/c0;Lv00/m0;Ld30/f0;)V

    invoke-static {}, Lwb3/f;->x()Ln83/c;

    move-result-object p1

    iget-object v2, v1, Ld30/f0;->d:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    iget-object v2, v1, Ld30/f0;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/LinkedHashSet;

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu00/d;

    iget-object v4, v1, Ld30/f0;->h:Ljava/lang/Object;

    check-cast v4, Ljava/util/LinkedHashSet;

    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {v3, v0}, Lu00/d;->b(Ljava/util/LinkedHashMap;)Lg40/w2;

    move-result-object v3

    invoke-virtual {p1, v3}, Ln83/c;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object v2, v1, Ld30/f0;->e:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayList;

    invoke-virtual {p1, v2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    iget-boolean v2, v1, Ld30/f0;->a:Z

    if-eqz v2, :cond_2

    new-instance v3, Lcom/stripe/android/ui/core/elements/AddressSpec;

    iget-object v2, v1, Ld30/f0;->b:Ljava/lang/Object;

    move-object v5, v2

    check-cast v5, Ljava/util/Set;

    const/16 v10, 0x3d

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v11}, Lcom/stripe/android/ui/core/elements/AddressSpec;-><init>(Lcom/stripe/android/uicore/elements/IdentifierSpec;Ljava/util/Set;Ljava/util/Set;ZLg40/m;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, p2, Lv00/m0;->e:Ljava/util/Map;

    iget-object p2, p2, Lv00/m0;->o:Lg40/z;

    invoke-virtual {v3, v0, v2, p2}, Lcom/stripe/android/ui/core/elements/AddressSpec;->transform(Ljava/util/Map;Ljava/util/Map;Lg40/z;)Ljava/util/List;

    move-result-object p2

    check-cast p2, Ljava/util/Collection;

    invoke-virtual {p1, p2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    :cond_2
    iget-object p2, v1, Ld30/f0;->f:Ljava/lang/Object;

    check-cast p2, Ljava/util/ArrayList;

    invoke-virtual {p1, p2}, Ln83/c;->addAll(Ljava/util/Collection;)Z

    invoke-static {p1}, Lwb3/f;->k(Ln83/c;)Ln83/c;

    move-result-object p1

    return-object p1
.end method

.method public final i(Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ls9/f;->t(Lv00/q0;Lv00/b0;Lv00/c0;Ljava/util/List;Z)Lt00/a;

    move-result-object p1

    return-object p1
.end method

.method public k(Lv00/c0;Lv00/m0;Ld30/f0;)V
    .locals 0

    return-void
.end method

.method public abstract l(Lv00/c0;)Lu00/f;
.end method
