.class public final Lmp/s;
.super Lmp/o;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableMap;


# static fields
.field public static final F:Lmp/s;


# instance fields
.field public final transient E:Lmp/s;

.field public final transient y:Lmp/a0;

.field public final transient z:Lmp/n;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    sget-object v0, Lmp/w;->x:Lmp/w;

    new-instance v1, Lmp/s;

    invoke-static {v0}, Lmp/t;->p(Ljava/util/Comparator;)Lmp/a0;

    move-result-object v0

    sget-object v2, Lmp/n;->x:Lmp/j;

    sget-object v2, Lmp/y;->E:Lmp/y;

    const/4 v3, 0x0

    invoke-direct {v1, v0, v2, v3}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    sput-object v1, Lmp/s;->F:Lmp/s;

    return-void
.end method

.method public constructor <init>(Lmp/a0;Lmp/n;Lmp/s;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/s;->y:Lmp/a0;

    iput-object p2, p0, Lmp/s;->z:Lmp/n;

    iput-object p3, p0, Lmp/s;->E:Lmp/s;

    return-void
.end method

.method public static b(Ljava/util/TreeMap;)Lmp/s;
    .locals 11

    sget-object v0, Lmp/w;->x:Lmp/w;

    invoke-virtual {p0}, Ljava/util/TreeMap;->comparator()Ljava/util/Comparator;

    move-result-object v1

    const/4 v2, 0x1

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    invoke-virtual {p0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    instance-of v3, p0, Ljava/util/Collection;

    if-nez v3, :cond_2

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    move-object p0, v3

    :cond_2
    sget-object v3, Lmp/o;->x:[Ljava/util/Map$Entry;

    invoke-interface {p0, v3}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    check-cast p0, [Ljava/util/Map$Entry;

    array-length v3, p0

    if-eqz v3, :cond_b

    const/4 v4, 0x0

    const/4 v5, 0x0

    if-eq v3, v2, :cond_6

    new-array v6, v3, [Ljava/lang/Object;

    new-array v7, v3, [Ljava/lang/Object;

    if-eqz v1, :cond_3

    :goto_2
    if-ge v5, v3, :cond_5

    aget-object v1, p0, v5

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2, v1}, Lmp/b;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v2, v6, v5

    aput-object v1, v7, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_3
    new-instance v1, Lb2/d;

    const/16 v8, 0x14

    invoke-direct {v1, v8}, Lb2/d;-><init>(I)V

    invoke-static {p0, v5, v3, v1}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    aget-object v1, p0, v5

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    aput-object v8, v6, v5

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    aput-object v1, v7, v5

    aget-object v5, v6, v5

    invoke-static {v5, v1}, Lmp/b;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    if-ge v2, v3, :cond_5

    add-int/lit8 v1, v2, -0x1

    aget-object v1, p0, v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    aget-object v5, p0, v2

    invoke-static {v5}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9, v10}, Lmp/b;->f(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v9, v6, v2

    aput-object v10, v7, v2

    invoke-virtual {v0, v8, v9}, Lmp/w;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v8

    if-eqz v8, :cond_4

    add-int/lit8 v2, v2, 0x1

    move-object v8, v9

    goto :goto_3

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "Multiple entries with same key: "

    const-string v3, " and "

    invoke-static {v2, v0, v3, v1}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_5
    new-instance p0, Lmp/s;

    new-instance v1, Lmp/a0;

    invoke-static {v3, v6}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lmp/a0;-><init>(Lmp/n;Ljava/util/Comparator;)V

    invoke-static {v3, v7}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object v0

    invoke-direct {p0, v1, v0, v4}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    return-object p0

    :cond_6
    aget-object p0, p0, v5

    invoke-static {p0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p0

    new-instance v3, Lmp/s;

    new-instance v6, Lmp/a0;

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    move v7, v5

    :goto_4
    const-string v8, "at index "

    if-ge v7, v2, :cond_8

    aget-object v9, v1, v7

    if-eqz v9, :cond_7

    add-int/lit8 v7, v7, 0x1

    goto :goto_4

    :cond_7
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {v7, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-static {v2, v1}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object v1

    invoke-direct {v6, v1, v0}, Lmp/a0;-><init>(Lmp/n;Ljava/util/Comparator;)V

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    :goto_5
    if-ge v5, v2, :cond_a

    aget-object v0, p0, v5

    if-eqz v0, :cond_9

    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    :cond_9
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-static {v5, v8}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    invoke-static {v2, p0}, Lmp/n;->l(I[Ljava/lang/Object;)Lmp/y;

    move-result-object p0

    invoke-direct {v3, v6, p0, v4}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    return-object v3

    :cond_b
    invoke-static {v0}, Lmp/s;->c(Ljava/util/Comparator;)Lmp/s;

    move-result-object p0

    return-object p0
.end method

.method public static c(Ljava/util/Comparator;)Lmp/s;
    .locals 3

    sget-object v0, Lmp/w;->x:Lmp/w;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lmp/s;->F:Lmp/s;

    return-object p0

    :cond_0
    new-instance v0, Lmp/s;

    invoke-static {p0}, Lmp/t;->p(Ljava/util/Comparator;)Lmp/a0;

    move-result-object p0

    sget-object v1, Lmp/n;->x:Lmp/j;

    sget-object v1, Lmp/y;->E:Lmp/y;

    const/4 v2, 0x0

    invoke-direct {v0, p0, v1, v2}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    return-object v0
.end method


# virtual methods
.method public final ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lmp/s;->g(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    invoke-virtual {p1}, Lmp/s;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final ceilingKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmp/s;->ceilingEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    iget-object v0, v0, Lmp/t;->z:Ljava/util/Comparator;

    return-object v0
.end method

.method public final d(Ljava/lang/Object;Z)Lmp/s;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    invoke-virtual {v0, p1, p2}, Lmp/a0;->q(Ljava/lang/Object;Z)I

    move-result p1

    const/4 p2, 0x0

    invoke-virtual {p0, p2, p1}, Lmp/s;->h(II)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic descendingKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    invoke-virtual {v0}, Lmp/t;->n()Lmp/t;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic descendingMap()Ljava/util/NavigableMap;
    .locals 3

    iget-object v0, p0, Lmp/s;->E:Lmp/s;

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lmp/o;->isEmpty()Z

    move-result v0

    iget-object v1, p0, Lmp/s;->y:Lmp/a0;

    if-eqz v0, :cond_1

    iget-object v0, v1, Lmp/t;->z:Ljava/util/Comparator;

    instance-of v1, v0, Lmp/x;

    if-eqz v1, :cond_0

    check-cast v0, Lmp/x;

    goto :goto_0

    :cond_0
    new-instance v1, Lmp/h;

    invoke-direct {v1, v0}, Lmp/h;-><init>(Ljava/util/Comparator;)V

    move-object v0, v1

    :goto_0
    invoke-virtual {v0}, Lmp/x;->a()Lmp/x;

    move-result-object v0

    invoke-static {v0}, Lmp/s;->c(Ljava/util/Comparator;)Lmp/s;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lmp/s;

    invoke-virtual {v1}, Lmp/t;->n()Lmp/t;

    move-result-object v1

    check-cast v1, Lmp/a0;

    iget-object v2, p0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v2}, Lmp/n;->g()Lmp/n;

    move-result-object v2

    invoke-direct {v0, v1, v2, p0}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    :cond_2
    return-object v0
.end method

.method public final e(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/s;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    iget-object v0, v0, Lmp/t;->z:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    invoke-virtual {p0, p3, p4}, Lmp/s;->d(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Lmp/s;->g(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p2, Ljava/lang/IllegalArgumentException;

    filled-new-array {p1, p3}, [Ljava/lang/Object;

    move-result-object p1

    const-string p3, "expected fromKey <= toKey but %s > %s"

    invoke-static {p3, p1}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final firstEntry()Ljava/util/Map$Entry;
    .locals 2

    invoke-virtual {p0}, Lmp/o;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lmp/o;->a()Lmp/p;

    move-result-object v0

    invoke-virtual {v0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final firstKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    invoke-virtual {v0}, Lmp/a0;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lmp/s;->d(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    invoke-virtual {p1}, Lmp/s;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final floorKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmp/s;->floorEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final g(Ljava/lang/Object;Z)Lmp/s;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    invoke-virtual {v0, p1, p2}, Lmp/a0;->r(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, p0, Lmp/s;->z:Lmp/n;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lmp/s;->h(II)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    const/4 v1, -0x1

    if-nez p1, :cond_0

    :catch_0
    :goto_0
    move p1, v1

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v2, v0, Lmp/a0;->F:Lmp/n;

    iget-object v0, v0, Lmp/t;->z:Ljava/util/Comparator;

    invoke-static {v2, p1, v0}, Ljava/util/Collections;->binarySearch(Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I

    move-result p1
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    if-gez p1, :cond_1

    goto :goto_0

    :cond_1
    :goto_1
    if-ne p1, v1, :cond_2

    const/4 p1, 0x0

    return-object p1

    :cond_2
    iget-object v0, p0, Lmp/s;->z:Lmp/n;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final h(II)Lmp/s;
    .locals 3

    iget-object v0, p0, Lmp/s;->z:Lmp/n;

    if-nez p1, :cond_1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-eq p2, p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    iget-object v1, p0, Lmp/s;->y:Lmp/a0;

    if-ne p1, p2, :cond_2

    iget-object p1, v1, Lmp/t;->z:Ljava/util/Comparator;

    invoke-static {p1}, Lmp/s;->c(Ljava/util/Comparator;)Lmp/s;

    move-result-object p1

    return-object p1

    :cond_2
    new-instance v2, Lmp/s;

    invoke-virtual {v1, p1, p2}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object v1

    invoke-virtual {v0, p1, p2}, Lmp/n;->j(II)Lmp/n;

    move-result-object p1

    const/4 p2, 0x0

    invoke-direct {v2, v1, p1, p2}, Lmp/s;-><init>(Lmp/a0;Lmp/n;Lmp/s;)V

    return-object v2
.end method

.method public final bridge synthetic headMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lmp/s;->d(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic headMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, p1, v0}, Lmp/s;->d(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lmp/s;->g(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    invoke-virtual {p1}, Lmp/s;->firstEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final higherKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmp/s;->higherEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    return-object v0
.end method

.method public final lastEntry()Ljava/util/Map$Entry;
    .locals 2

    invoke-virtual {p0}, Lmp/o;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lmp/o;->a()Lmp/p;

    move-result-object v0

    invoke-virtual {v0}, Lmp/p;->l()Lmp/n;

    move-result-object v0

    iget-object v1, p0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    return-object v0
.end method

.method public final lastKey()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    invoke-virtual {v0}, Lmp/a0;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lmp/s;->d(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    invoke-virtual {p1}, Lmp/s;->lastEntry()Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public final lowerKey(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lmp/s;->lowerEntry(Ljava/lang/Object;)Ljava/util/Map$Entry;

    move-result-object p1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic navigableKeySet()Ljava/util/NavigableSet;
    .locals 1

    iget-object v0, p0, Lmp/s;->y:Lmp/a0;

    return-object v0
.end method

.method public final pollFirstEntry()Ljava/util/Map$Entry;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLastEntry()Ljava/util/Map$Entry;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lmp/s;->z:Lmp/n;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    return v0
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lmp/s;->e(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subMap(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Lmp/s;->e(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic tailMap(Ljava/lang/Object;Z)Ljava/util/NavigableMap;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2}, Lmp/s;->g(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic tailMap(Ljava/lang/Object;)Ljava/util/SortedMap;
    .locals 1

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, p1, v0}, Lmp/s;->g(Ljava/lang/Object;Z)Lmp/s;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lmp/s;->z:Lmp/n;

    return-object v0
.end method
