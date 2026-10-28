.class public final Lsx/b;
.super Lm83/i;
.source "SourceFile"


# instance fields
.field public final w:Ljava/util/List;

.field public final x:[Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/List;[Ljava/lang/Object;)V
    .locals 1

    const-string v0, "parameterKeys"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/util/AbstractMap;-><init>()V

    iput-object p1, p0, Lsx/b;->w:Ljava/util/List;

    iput-object p2, p0, Lsx/b;->x:[Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 7

    iget-object v0, p0, Lsx/b;->w:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_0

    check-cast v3, Lj93/q;

    new-instance v5, Ljava/util/AbstractMap$SimpleEntry;

    iget-object v6, p0, Lsx/b;->x:[Ljava/lang/Object;

    aget-object v2, v6, v2

    invoke-direct {v5, v3, v2}, Ljava/util/AbstractMap$SimpleEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_1
    new-instance v0, Ljava/util/LinkedHashSet;

    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/util/AbstractMap$SimpleEntry;

    invoke-virtual {v3}, Ljava/util/AbstractMap$SimpleEntry;->getValue()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lsx/d;->a:Ljava/lang/Object;

    if-eq v3, v4, :cond_2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    return-object v0
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lj93/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lj93/q;

    iget-object v0, p0, Lsx/b;->x:[Ljava/lang/Object;

    invoke-interface {p1}, Lj93/q;->getIndex()I

    move-result p1

    aget-object p1, v0, p1

    sget-object v0, Lsx/d;->a:Ljava/lang/Object;

    if-eq p1, v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p1, Lj93/q;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    check-cast p1, Lj93/q;

    iget-object v0, p0, Lsx/b;->x:[Ljava/lang/Object;

    invoke-interface {p1}, Lj93/q;->getIndex()I

    move-result p1

    aget-object p1, v0, p1

    sget-object v0, Lsx/d;->a:Ljava/lang/Object;

    if-eq p1, v0, :cond_1

    return-object p1

    :cond_1
    return-object v1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lj93/q;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lj93/q;

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lj93/q;

    const-string p2, "key"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    instance-of v0, p1, Lj93/q;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lj93/q;

    .line 2
    invoke-super {p0, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final bridge remove(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    .line 3
    instance-of v0, p1, Lj93/q;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lj93/q;

    .line 4
    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
