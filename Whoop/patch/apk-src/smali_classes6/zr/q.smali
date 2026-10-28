.class public abstract Lzr/q;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(I)I
    .locals 4

    const/4 v0, 0x3

    if-ge p0, v0, :cond_0

    const-string v0, "expectedSize"

    invoke-static {p0, v0}, Lzr/q;->c(ILjava/lang/String;)V

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_0
    const/high16 v0, 0x40000000    # 2.0f

    if-ge p0, v0, :cond_1

    int-to-double v0, p0

    const-wide/high16 v2, 0x3fe8000000000000L    # 0.75

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int p0, v0

    return p0

    :cond_1
    const p0, 0x7fffffff

    return p0
.end method

.method public static b(I[Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p0, :cond_1

    aget-object v1, p1, v0

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "at index "

    invoke-static {v0, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    return-void
.end method

.method public static c(ILjava/lang/String;)V
    .locals 2

    if-ltz p0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, " cannot be negative but was: "

    invoke-static {p0, p1, v1}, Lm4/a;->f(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static d(I)Ljava/lang/Object;
    .locals 2

    const/4 v0, 0x2

    if-lt p0, v0, :cond_2

    const/high16 v0, 0x40000000    # 2.0f

    if-gt p0, v0, :cond_2

    invoke-static {p0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    if-ne v0, p0, :cond_2

    const/16 v0, 0x100

    if-gt p0, v0, :cond_0

    new-array p0, p0, [B

    return-object p0

    :cond_0
    const/high16 v0, 0x10000

    if-gt p0, v0, :cond_1

    new-array p0, p0, [S

    return-object p0

    :cond_1
    new-array p0, p0, [I

    return-object p0

    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "must be power of 2 between 2^1 and 2^30: "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static e(Ljava/lang/Object;Ljava/util/Map;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    instance-of v0, p0, Ljava/util/Map;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/Map;

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p1, p0}, Ljava/util/Set;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static f(Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 2

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p0, Ljava/util/Set;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/Set;

    :try_start_0
    invoke-interface {p1}, Ljava/util/Set;->size()I

    move-result v0

    invoke-interface {p0}, Ljava/util/Set;->size()I

    move-result v1

    if-ne v0, v1, :cond_1

    invoke-interface {p1, p0}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    move-result p0
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p0, :cond_1

    :goto_0
    const/4 p0, 0x1

    return p0

    :catch_0
    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static g(Ljava/util/Set;Lyr/f;)Lzr/f1;
    .locals 5

    instance-of v0, p0, Ljava/util/SortedSet;

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/SortedSet;

    instance-of v0, p0, Lzr/f1;

    if-eqz v0, :cond_0

    check-cast p0, Lzr/f1;

    iget-object v0, p0, Lzr/f1;->x:Lyr/f;

    new-instance v4, Lyr/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v3, v3, [Lyr/f;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, p1}, Lyr/g;-><init>(Ljava/util/List;)V

    new-instance p1, Lzr/g1;

    iget-object p0, p0, Lzr/f1;->w:Ljava/util/Set;

    check-cast p0, Ljava/util/SortedSet;

    invoke-direct {p1, p0, v4}, Lzr/f1;-><init>(Ljava/util/Set;Lyr/f;)V

    return-object p1

    :cond_0
    new-instance v0, Lzr/g1;

    invoke-direct {v0, p0, p1}, Lzr/f1;-><init>(Ljava/util/Set;Lyr/f;)V

    return-object v0

    :cond_1
    instance-of v0, p0, Lzr/f1;

    if-eqz v0, :cond_2

    check-cast p0, Lzr/f1;

    iget-object v0, p0, Lzr/f1;->x:Lyr/f;

    new-instance v4, Lyr/g;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-array v3, v3, [Lyr/f;

    aput-object v0, v3, v2

    aput-object p1, v3, v1

    invoke-static {v3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v4, p1}, Lyr/g;-><init>(Ljava/util/List;)V

    new-instance p1, Lzr/f1;

    iget-object p0, p0, Lzr/f1;->w:Ljava/util/Set;

    check-cast p0, Ljava/util/Set;

    invoke-direct {p1, p0, v4}, Lzr/f1;-><init>(Ljava/util/Set;Lyr/f;)V

    return-object p1

    :cond_2
    new-instance v0, Lzr/f1;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Ljava/util/Set;

    invoke-direct {v0, p0, p1}, Lzr/f1;-><init>(Ljava/util/Set;Lyr/f;)V

    return-object v0
.end method

.method public static h(Ljava/lang/String;Ljava/util/AbstractCollection;)Ljava/lang/Object;
    .locals 1

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static i(Ljava/lang/Iterable;)Ljava/lang/Object;
    .locals 2

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_1

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    invoke-static {v0, p0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/util/NoSuchElementException;

    invoke-direct {p0}, Ljava/util/NoSuchElementException;-><init>()V

    throw p0

    :cond_1
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_2

    return-object v0
.end method

.method public static j(Ljava/util/Set;)I
    .locals 3

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_0
    move v2, v0

    :goto_1
    add-int/2addr v1, v2

    not-int v1, v1

    not-int v1, v1

    goto :goto_0

    :cond_1
    return v1
.end method

.method public static k(Ljava/util/Set;Lzr/j0;)Lzr/e1;
    .locals 1

    const-string v0, "set1"

    invoke-static {p0, v0}, Lrj/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "set2"

    invoke-static {p1, v0}, Lrj/o;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lzr/e1;

    invoke-direct {v0, p0, p1}, Lzr/e1;-><init>(Ljava/util/Set;Ljava/util/Set;)V

    return-object v0
.end method

.method public static l(III)I
    .locals 1

    not-int v0, p2

    and-int/2addr p0, v0

    and-int/2addr p1, p2

    or-int/2addr p0, p1

    return p0
.end method

.method public static varargs m([Ljava/lang/Object;)Ljava/util/ArrayList;
    .locals 5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    array-length v0, p0

    const-string v1, "arraySize"

    invoke-static {v0, v1}, Lzr/q;->c(ILjava/lang/String;)V

    const-wide/16 v1, 0x5

    int-to-long v3, v0

    add-long/2addr v3, v1

    div-int/lit8 v0, v0, 0xa

    int-to-long v0, v0

    add-long/2addr v3, v0

    invoke-static {v3, v4}, Lvd/f;->L(J)I

    move-result v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v1, p0}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    return-object v1
.end method

.method public static n(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;[I[Ljava/lang/Object;[Ljava/lang/Object;)I
    .locals 9

    invoke-static {p0}, Lzr/q;->q(Ljava/lang/Object;)I

    move-result v0

    and-int v1, v0, p2

    invoke-static {v1, p3}, Lzr/q;->r(ILjava/lang/Object;)I

    move-result v2

    const/4 v3, -0x1

    if-nez v2, :cond_0

    goto :goto_1

    :cond_0
    not-int v4, p2

    and-int/2addr v0, v4

    move v5, v3

    :goto_0
    add-int/lit8 v2, v2, -0x1

    aget v6, p4, v2

    and-int v7, v6, v4

    if-ne v7, v0, :cond_3

    aget-object v7, p5, v2

    invoke-static {p0, v7}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    if-eqz p6, :cond_1

    aget-object v7, p6, v2

    invoke-static {p1, v7}, Lrj/j;->s(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    :cond_1
    and-int p0, v6, p2

    if-ne v5, v3, :cond_2

    invoke-static {v1, p0, p3}, Lzr/q;->s(IILjava/lang/Object;)V

    return v2

    :cond_2
    aget p1, p4, v5

    invoke-static {p1, p0, p2}, Lzr/q;->l(III)I

    move-result p0

    aput p0, p4, v5

    return v2

    :cond_3
    and-int v5, v6, p2

    if-nez v5, :cond_4

    :goto_1
    return v3

    :cond_4
    move v8, v5

    move v5, v2

    move v2, v8

    goto :goto_0
.end method

.method public static o(Ljava/util/List;Lyr/f;II)V
    .locals 2

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    if-le v0, p3, :cond_1

    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p1, v1}, Lyr/f;->apply(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0, v0}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    :cond_1
    add-int/lit8 p3, p3, -0x1

    :goto_1
    if-lt p3, p2, :cond_2

    invoke-interface {p0, p3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    add-int/lit8 p3, p3, -0x1

    goto :goto_1

    :cond_2
    return-void
.end method

.method public static p(I)I
    .locals 4

    int-to-long v0, p0

    const-wide/32 v2, -0x3361d2af

    mul-long/2addr v0, v2

    long-to-int p0, v0

    const/16 v0, 0xf

    invoke-static {p0, v0}, Ljava/lang/Integer;->rotateLeft(II)I

    move-result p0

    int-to-long v0, p0

    const-wide/32 v2, 0x1b873593

    mul-long/2addr v0, v2

    long-to-int p0, v0

    return p0
.end method

.method public static q(Ljava/lang/Object;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_0
    invoke-static {p0}, Lzr/q;->p(I)I

    move-result p0

    return p0
.end method

.method public static r(ILjava/lang/Object;)I
    .locals 1

    instance-of v0, p1, [B

    if-eqz v0, :cond_0

    check-cast p1, [B

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    return p0

    :cond_0
    instance-of v0, p1, [S

    if-eqz v0, :cond_1

    check-cast p1, [S

    aget-short p0, p1, p0

    const p1, 0xffff

    and-int/2addr p0, p1

    return p0

    :cond_1
    check-cast p1, [I

    aget p0, p1, p0

    return p0
.end method

.method public static s(IILjava/lang/Object;)V
    .locals 1

    instance-of v0, p2, [B

    if-eqz v0, :cond_0

    check-cast p2, [B

    int-to-byte p1, p1

    aput-byte p1, p2, p0

    return-void

    :cond_0
    instance-of v0, p2, [S

    if-eqz v0, :cond_1

    check-cast p2, [S

    int-to-short p1, p1

    aput-short p1, p2, p0

    return-void

    :cond_1
    check-cast p2, [I

    aput p1, p2, p0

    return-void
.end method

.method public static t(Ljava/util/List;Lyr/e;)Ljava/util/AbstractList;
    .locals 1

    if-eqz p0, :cond_0

    new-instance v0, Lzr/o0;

    invoke-direct {v0, p0, p1}, Lzr/o0;-><init>(Ljava/util/List;Lyr/e;)V

    return-object v0

    :cond_0
    new-instance v0, Lzr/p0;

    invoke-direct {v0, p0, p1}, Lzr/p0;-><init>(Ljava/util/List;Lyr/e;)V

    return-object v0
.end method
