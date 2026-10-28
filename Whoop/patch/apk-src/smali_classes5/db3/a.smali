.class public final Ldb3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldb3/e;


# virtual methods
.method public final a(Lr93/e;Ljava/util/ArrayList;Lzt/q;)V
    .locals 2

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lm83/x;->w:Lm83/x;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, p1, p2, p3}, Ldb3/a;->a(Lr93/e;Ljava/util/ArrayList;Lzt/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final b(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V
    .locals 2

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lm83/x;->w:Lm83/x;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ldb3/a;->b(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final c(Lr93/e;Lva3/h;Ln83/c;Lzt/q;)V
    .locals 2

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lm83/x;->w:Lm83/x;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ldb3/a;->c(Lr93/e;Lva3/h;Ln83/c;Lzt/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final d(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V
    .locals 2

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lm83/x;->w:Lm83/x;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, p1, p2, p3, p4}, Ldb3/a;->d(Lr93/e;Lva3/h;Ljava/util/ArrayList;Lzt/q;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final e(Lr93/e;Lzt/q;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    sget-object v1, Lm83/x;->w:Lm83/x;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldb3/e;

    check-cast v1, Ldb3/a;

    invoke-virtual {v1, p1, p2}, Ldb3/a;->e(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final f(Lr93/e;Lzt/q;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    sget-object v1, Lm83/x;->w:Lm83/x;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldb3/e;

    check-cast v1, Ldb3/a;

    invoke-virtual {v1, p1, p2}, Ldb3/a;->f(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final g(Lr93/e;Lzt/q;)Ljava/util/ArrayList;
    .locals 3

    const-string v0, "thisDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_0
    sget-object v1, Lm83/x;->w:Lm83/x;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldb3/e;

    check-cast v1, Ldb3/a;

    invoke-virtual {v1, p1, p2}, Ldb3/a;->g(Lr93/e;Lzt/q;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final h(Lr93/e;Lu93/m0;Lzt/q;)Lu93/m0;
    .locals 2

    const-string v0, "propertyDescriptor"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "c"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :goto_0
    sget-object v0, Lm83/x;->w:Lm83/x;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldb3/e;

    check-cast v0, Ldb3/a;

    invoke-virtual {v0, p1, p2, p3}, Ldb3/a;->h(Lr93/e;Lu93/m0;Lzt/q;)Lu93/m0;

    move-result-object p2

    goto :goto_0

    :cond_0
    return-object p2
.end method
