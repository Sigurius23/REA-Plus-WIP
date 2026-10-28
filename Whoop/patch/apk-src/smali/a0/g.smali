.class public La0/g;
.super La0/f1;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map;


# instance fields
.field public E:La0/c;

.field public F:La0/e;

.field public z:La0/a;


# direct methods
.method public constructor <init>(La0/g;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, La0/f1;-><init>(I)V

    invoke-virtual {p0, p1}, La0/f1;->h(La0/g;)V

    return-void
.end method


# virtual methods
.method public final entrySet()Ljava/util/Set;
    .locals 2

    iget-object v0, p0, La0/g;->z:La0/a;

    if-nez v0, :cond_0

    new-instance v0, La0/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, La0/a;-><init>(Ljava/util/Map;I)V

    iput-object v0, p0, La0/g;->z:La0/a;

    :cond_0
    return-object v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, La0/g;->E:La0/c;

    if-nez v0, :cond_0

    new-instance v0, La0/c;

    invoke-direct {v0, p0}, La0/c;-><init>(La0/g;)V

    iput-object v0, p0, La0/g;->E:La0/c;

    :cond_0
    return-object v0
.end method

.method public final l(Ljava/util/Collection;)Z
    .locals 1

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-super {p0, v0}, La0/f1;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method public final m(Ljava/util/Collection;)Z
    .locals 2

    iget v0, p0, La0/f1;->y:I

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-super {p0, v1}, La0/f1;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    iget p1, p0, La0/f1;->y:I

    if-eq v0, p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final n(Ljava/util/Collection;)Z
    .locals 3

    iget v0, p0, La0/f1;->y:I

    add-int/lit8 v1, v0, -0x1

    :goto_0
    if-ltz v1, :cond_1

    invoke-virtual {p0, v1}, La0/f1;->g(I)Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Ljava/util/Collection;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {p0, v1}, La0/f1;->i(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v1, v1, -0x1

    goto :goto_0

    :cond_1
    iget p1, p0, La0/f1;->y:I

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 2

    iget v0, p0, La0/f1;->y:I

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0, v1}, La0/f1;->b(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

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

    invoke-virtual {p0, v1, v0}, La0/f1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, La0/g;->F:La0/e;

    if-nez v0, :cond_0

    new-instance v0, La0/e;

    invoke-direct {v0, p0}, La0/e;-><init>(La0/g;)V

    iput-object v0, p0, La0/g;->F:La0/e;

    :cond_0
    return-object v0
.end method
