.class public final Lhf/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lgf/m;


# instance fields
.field public final E:Lkotlin/jvm/internal/i;

.field public final F:Lhf/g;

.field public final G:Lhf/g;

.field public final w:Lgf/m;

.field public final x:Lkotlin/jvm/internal/x;

.field public final y:Lkotlin/jvm/internal/i;

.field public final z:Lkotlin/jvm/internal/x;


# direct methods
.method public constructor <init>(Lgf/m;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/internal/x;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const-string v0, "src"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lhf/h;->w:Lgf/m;

    iput-object p2, p0, Lhf/h;->x:Lkotlin/jvm/internal/x;

    check-cast p3, Lkotlin/jvm/internal/i;

    iput-object p3, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    iput-object p4, p0, Lhf/h;->z:Lkotlin/jvm/internal/x;

    check-cast p5, Lkotlin/jvm/internal/i;

    iput-object p5, p0, Lhf/h;->E:Lkotlin/jvm/internal/i;

    new-instance p1, Lhf/g;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lhf/g;-><init>(Lhf/h;I)V

    iput-object p1, p0, Lhf/h;->F:Lhf/g;

    new-instance p1, Lhf/g;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lhf/g;-><init>(Lhf/h;I)V

    iput-object p1, p0, Lhf/h;->G:Lhf/g;

    return-void
.end method


# virtual methods
.method public final C(Ljava/lang/Object;Ljava/util/Collection;)Z
    .locals 3

    const-string v0, "values"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lhf/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    move-result p1

    return p1
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 3

    invoke-virtual {p0, p1}, Lhf/h;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p1, p0}, Lm83/g0;->U(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Ljava/util/List;

    :cond_0
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final clear()V
    .locals 1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {p1}, Lkotlin/jvm/internal/m0;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Ljava/util/List;

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/h;->G:Lhf/g;

    invoke-virtual {v0, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    new-instance v1, Lg40/f4;

    const/16 v2, 0x8

    invoke-direct {v1, p0, v2}, Lg40/f4;-><init>(Lhf/h;I)V

    new-instance v2, Lg40/f4;

    const/16 v3, 0x9

    invoke-direct {v2, p0, v3}, Lg40/f4;-><init>(Lhf/h;I)V

    const-string v3, "<this>"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lhf/i;

    invoke-direct {v3, v0, v1, v2}, Lhf/i;-><init>(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v3
.end method

.method public final f()Lxb3/i;
    .locals 3

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Lgf/m;->f()Lxb3/i;

    move-result-object v0

    new-instance v1, Lhb2/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0, v1}, Lxb3/k;->A(Lxb3/i;Lkotlin/jvm/functions/Function1;)Lxb3/s;

    move-result-object v0

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lhf/h;->F:Lhf/g;

    invoke-virtual {v0, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 4

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf/i;

    iget-object v2, p0, Lhf/h;->x:Lkotlin/jvm/internal/x;

    iget-object v3, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-direct {v1, v0, v2, v3}, Lhf/i;-><init>(Ljava/util/Set;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    return-object v1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/util/List;

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/h;->G:Lhf/g;

    invoke-virtual {v0, p2}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object p2, p0, Lhf/h;->F:Lhf/g;

    invoke-virtual {p2, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 3

    const-string v0, "from"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lhf/h;->G:Lhf/g;

    invoke-virtual {v2, v0}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lhf/h;->y:Lkotlin/jvm/internal/i;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lhf/h;->F:Lhf/g;

    invoke-virtual {v0, p1}, Lhf/g;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 4

    iget-object v0, p0, Lhf/h;->w:Lgf/m;

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lhf/b;

    iget-object v2, p0, Lhf/h;->F:Lhf/g;

    iget-object v3, p0, Lhf/h;->G:Lhf/g;

    invoke-direct {v1, v0, v2, v3}, Lhf/b;-><init>(Ljava/util/Collection;Lhf/g;Lhf/g;)V

    return-object v1
.end method
