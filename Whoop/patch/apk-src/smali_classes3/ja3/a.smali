.class public final Lja3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lja3/c;


# instance fields
.field public final a:Lx93/n;

.field public final b:Lkotlin/jvm/functions/Function1;

.field public final c:Ls;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/LinkedHashMap;

.field public final f:Ljava/util/LinkedHashMap;


# direct methods
.method public constructor <init>(Lx93/n;Lkotlin/jvm/functions/Function1;)V
    .locals 3

    const-string v0, "jClass"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lja3/a;->a:Lx93/n;

    iput-object p2, p0, Lja3/a;->b:Lkotlin/jvm/functions/Function1;

    new-instance p2, Ls;

    const/16 v0, 0x8

    invoke-direct {p2, p0, v0}, Ls;-><init>(Ljava/lang/Object;I)V

    iput-object p2, p0, Lja3/a;->c:Ls;

    invoke-virtual {p1}, Lx93/n;->d()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    invoke-static {p1, p2}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v0, Lxb3/e;

    invoke-direct {v0, p1}, Lxb3/e;-><init>(Lxb3/f;)V

    :goto_0
    invoke-virtual {v0}, Lxb3/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {v0}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lx93/w;

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    check-cast v2, Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iput-object p2, p0, Lja3/a;->d:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Lja3/a;->a:Lx93/n;

    invoke-virtual {p1}, Lx93/n;->b()Ljava/util/Collection;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object p1

    iget-object p2, p0, Lja3/a;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p2}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object p1

    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    new-instance v0, Lxb3/e;

    invoke-direct {v0, p1}, Lxb3/e;-><init>(Lxb3/f;)V

    :goto_1
    invoke-virtual {v0}, Lxb3/e;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-virtual {v0}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lx93/t;

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v1

    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_2
    iput-object p2, p0, Lja3/a;->e:Ljava/util/LinkedHashMap;

    iget-object p1, p0, Lja3/a;->a:Lx93/n;

    invoke-virtual {p1}, Lx93/n;->f()Ljava/util/ArrayList;

    move-result-object p1

    iget-object p2, p0, Lja3/a;->b:Lkotlin/jvm/functions/Function1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    const/16 p1, 0xa

    invoke-static {v0, p1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, Lm83/g0;->W(I)I

    move-result p1

    const/16 p2, 0x10

    if-ge p1, p2, :cond_5

    move p1, p2

    :cond_5
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-direct {p2, p1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lx93/z;

    invoke-virtual {v1}, Lx93/v;->d()Lva3/h;

    move-result-object v1

    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_3

    :cond_6
    iput-object p2, p0, Lja3/a;->f:Ljava/util/LinkedHashMap;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lja3/a;->a:Lx93/n;

    invoke-virtual {v0}, Lx93/n;->d()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    iget-object v1, p0, Lja3/a;->c:Ls;

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Lxb3/e;

    invoke-direct {v2, v0}, Lxb3/e;-><init>(Lxb3/f;)V

    :goto_0
    invoke-virtual {v2}, Lxb3/e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx93/w;

    invoke-virtual {v0}, Lx93/v;->d()Lva3/h;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final b()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lja3/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/util/Set;
    .locals 3

    iget-object v0, p0, Lja3/a;->a:Lx93/n;

    invoke-virtual {v0}, Lx93/n;->b()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->r0(Ljava/lang/Iterable;)Lm83/r;

    move-result-object v0

    iget-object v1, p0, Lja3/a;->b:Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Lxb3/k;->r(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/f;

    move-result-object v0

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v2, Lxb3/e;

    invoke-direct {v2, v0}, Lxb3/e;-><init>(Lxb3/f;)V

    :goto_0
    invoke-virtual {v2}, Lxb3/e;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {v2}, Lxb3/e;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx93/t;

    invoke-virtual {v0}, Lx93/v;->d()Lva3/h;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public final d(Lva3/h;)Lx93/t;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/a;->e:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx93/t;

    return-object p1
.end method

.method public final e(Lva3/h;)Lx93/z;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/a;->f:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx93/z;

    return-object p1
.end method

.method public final f(Lva3/h;)Ljava/util/Collection;
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lja3/a;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    check-cast p1, Ljava/util/Collection;

    return-object p1

    :cond_0
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method
