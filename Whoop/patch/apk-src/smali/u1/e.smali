.class public Lu1/e;
.super Lm83/i;
.source "SourceFile"

# interfaces
.implements Ls1/c;


# instance fields
.field public E:I

.field public F:I

.field public w:Lu1/c;

.field public x:Lw1/b;

.field public y:Lu1/o;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lu1/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    iput-object p1, p0, Lu1/e;->w:Lu1/c;

    new-instance v0, Lw1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu1/e;->x:Lw1/b;

    iget-object v0, p1, Lu1/c;->w:Lu1/o;

    iput-object v0, p0, Lu1/e;->y:Lu1/o;

    iget p1, p1, Lu1/c;->x:I

    iput p1, p0, Lu1/e;->F:I

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 2

    new-instance v0, Lu1/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lu1/g;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public final b()Ljava/util/Set;
    .locals 2

    new-instance v0, Lu1/g;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lu1/g;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method public bridge synthetic build()Ls1/d;
    .locals 1

    invoke-virtual {p0}, Lu1/e;->e()Lu1/c;

    move-result-object v0

    return-object v0
.end method

.method public final c()I
    .locals 1

    iget v0, p0, Lu1/e;->F:I

    return v0
.end method

.method public final clear()V
    .locals 1

    sget-object v0, Lu1/o;->e:Lu1/o;

    iput-object v0, p0, Lu1/e;->y:Lu1/o;

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lu1/e;->g(I)V

    return-void
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, v1, p1}, Lu1/o;->d(IILjava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final d()Ljava/util/Collection;
    .locals 1

    new-instance v0, Lu1/i;

    invoke-direct {v0, p0}, Lu1/i;-><init>(Lu1/e;)V

    return-object v0
.end method

.method public e()Lu1/c;
    .locals 3

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    iget-object v1, p0, Lu1/e;->w:Lu1/c;

    iget-object v2, v1, Lu1/c;->w:Lu1/o;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lw1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu1/e;->x:Lw1/b;

    new-instance v1, Lu1/c;

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    invoke-virtual {p0}, Lu1/e;->c()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lu1/c;-><init>(Lu1/o;I)V

    :goto_0
    iput-object v1, p0, Lu1/e;->w:Lu1/c;

    return-object v1
.end method

.method public final g(I)V
    .locals 0

    iput p1, p0, Lu1/e;->F:I

    iget p1, p0, Lu1/e;->E:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lu1/e;->E:I

    return-void
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, v1, p1}, Lu1/o;->g(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    const/4 v0, 0x0

    iput-object v0, p0, Lu1/e;->z:Ljava/lang/Object;

    iget-object v1, p0, Lu1/e;->y:Lu1/o;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    move v2, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const/4 v5, 0x0

    move-object v6, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lu1/o;->l(ILjava/lang/Object;Ljava/lang/Object;ILu1/e;)Lu1/o;

    move-result-object p1

    iput-object p1, v6, Lu1/e;->y:Lu1/o;

    iget-object p1, v6, Lu1/e;->z:Ljava/lang/Object;

    return-object p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 6

    instance-of v0, p1, Lu1/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lu1/c;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    instance-of v0, p1, Lu1/e;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lu1/e;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lu1/e;->e()Lu1/c;

    move-result-object v1

    goto :goto_2

    :cond_2
    move-object v1, v0

    :cond_3
    :goto_2
    if-eqz v1, :cond_5

    new-instance p1, Lw1/a;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p1, Lw1/a;->a:I

    iget v2, p0, Lu1/e;->F:I

    iget-object v3, p0, Lu1/e;->y:Lu1/o;

    iget-object v4, v1, Lu1/c;->w:Lu1/o;

    const-string v5, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4, v0, p1, p0}, Lu1/o;->m(Lu1/o;ILw1/a;Lu1/e;)Lu1/o;

    move-result-object v0

    iput-object v0, p0, Lu1/e;->y:Lu1/o;

    iget v0, v1, Lu1/c;->x:I

    add-int/2addr v0, v2

    iget p1, p1, Lw1/a;->a:I

    sub-int/2addr v0, p1

    if-eq v2, v0, :cond_4

    invoke-virtual {p0, v0}, Lu1/e;->g(I)V

    :cond_4
    return-void

    :cond_5
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lu1/e;->z:Ljava/lang/Object;

    .line 5
    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-virtual {v0, v2, p1, v1, p0}, Lu1/o;->n(ILjava/lang/Object;ILu1/e;)Lu1/o;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lu1/o;->e:Lu1/o;

    :cond_1
    iput-object p1, p0, Lu1/e;->y:Lu1/o;

    .line 6
    iget-object p1, p0, Lu1/e;->z:Ljava/lang/Object;

    return-object p1
.end method

.method public final remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 8

    .line 1
    invoke-virtual {p0}, Lu1/e;->c()I

    move-result v0

    .line 2
    iget-object v1, p0, Lu1/e;->y:Lu1/o;

    const/4 v7, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    move v2, v7

    :goto_0
    const/4 v5, 0x0

    move-object v6, p0

    move-object v3, p1

    move-object v4, p2

    invoke-virtual/range {v1 .. v6}, Lu1/o;->o(ILjava/lang/Object;Ljava/lang/Object;ILu1/e;)Lu1/o;

    move-result-object p1

    if-nez p1, :cond_1

    sget-object p1, Lu1/o;->e:Lu1/o;

    :cond_1
    iput-object p1, v6, Lu1/e;->y:Lu1/o;

    .line 3
    invoke-virtual {p0}, Lu1/e;->c()I

    move-result p1

    if-eq v0, p1, :cond_2

    const/4 p1, 0x1

    return p1

    :cond_2
    return v7
.end method
