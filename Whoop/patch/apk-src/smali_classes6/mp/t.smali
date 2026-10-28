.class public abstract Lmp/t;
.super Lmp/p;
.source "SourceFile"

# interfaces
.implements Ljava/util/NavigableSet;
.implements Lmp/d0;


# instance fields
.field public transient E:Lmp/t;

.field public final transient z:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    invoke-direct {p0}, Ljava/util/AbstractCollection;-><init>()V

    iput-object p1, p0, Lmp/t;->z:Ljava/util/Comparator;

    return-void
.end method

.method public static p(Ljava/util/Comparator;)Lmp/a0;
    .locals 2

    sget-object v0, Lmp/w;->x:Lmp/w;

    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lmp/a0;->G:Lmp/a0;

    return-object p0

    :cond_0
    new-instance v0, Lmp/a0;

    sget-object v1, Lmp/n;->x:Lmp/j;

    sget-object v1, Lmp/y;->E:Lmp/y;

    invoke-direct {v0, v1, p0}, Lmp/a0;-><init>(Lmp/n;Ljava/util/Comparator;)V

    return-object v0
.end method


# virtual methods
.method public final addFirst(Ljava/lang/Object;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final addLast(Ljava/lang/Object;)V
    .locals 0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1
.end method

.method public final comparator()Ljava/util/Comparator;
    .locals 1

    iget-object v0, p0, Lmp/t;->z:Ljava/util/Comparator;

    return-object v0
.end method

.method public final bridge synthetic descendingSet()Ljava/util/NavigableSet;
    .locals 1

    invoke-virtual {p0}, Lmp/t;->n()Lmp/t;

    move-result-object v0

    return-object v0
.end method

.method public abstract first()Ljava/lang/Object;
.end method

.method public final getFirst()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp/t;->first()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final getLast()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lmp/t;->last()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final headSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 2

    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    move-object v0, p0

    check-cast v0, Lmp/a0;

    const/4 v1, 0x0

    .line 6
    invoke-virtual {v0, p1, p2}, Lmp/a0;->q(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    return-object p1
.end method

.method public final headSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    move-object v0, p0

    check-cast v0, Lmp/a0;

    const/4 v1, 0x0

    .line 3
    invoke-virtual {v0, p1, v1}, Lmp/a0;->q(Ljava/lang/Object;Z)I

    move-result p1

    invoke-virtual {v0, v1, p1}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    return-object p1
.end method

.method public abstract last()Ljava/lang/Object;
.end method

.method public final n()Lmp/t;
    .locals 3

    iget-object v0, p0, Lmp/t;->E:Lmp/t;

    if-nez v0, :cond_1

    move-object v0, p0

    check-cast v0, Lmp/a0;

    iget-object v1, v0, Lmp/t;->z:Ljava/util/Comparator;

    invoke-static {v1}, Ljava/util/Collections;->reverseOrder(Ljava/util/Comparator;)Ljava/util/Comparator;

    move-result-object v1

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-static {v1}, Lmp/t;->p(Ljava/util/Comparator;)Lmp/a0;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v2, Lmp/a0;

    iget-object v0, v0, Lmp/a0;->F:Lmp/n;

    invoke-virtual {v0}, Lmp/n;->g()Lmp/n;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Lmp/a0;-><init>(Lmp/n;Ljava/util/Comparator;)V

    move-object v0, v2

    :goto_0
    iput-object v0, p0, Lmp/t;->E:Lmp/t;

    iput-object p0, v0, Lmp/t;->E:Lmp/t;

    :cond_1
    return-object v0
.end method

.method public final o(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/a0;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lmp/t;->z:Ljava/util/Comparator;

    invoke-interface {v0, p1, p3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    if-gtz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lmp/a0;

    invoke-virtual {v0, p1, p2}, Lmp/a0;->r(Ljava/lang/Object;Z)I

    move-result p1

    iget-object p2, v0, Lmp/a0;->F:Lmp/n;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    invoke-virtual {v0, p1, p2}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    const/4 p2, 0x0

    invoke-virtual {p1, p3, p4}, Lmp/a0;->q(Ljava/lang/Object;Z)I

    move-result p3

    invoke-virtual {p1, p2, p3}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public final pollFirst()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final pollLast()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeFirst()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final removeLast()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;ZLjava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 0

    .line 2
    invoke-virtual {p0, p1, p2, p3, p4}, Lmp/t;->o(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/a0;

    move-result-object p1

    return-object p1
.end method

.method public final bridge synthetic subSet(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 1
    invoke-virtual {p0, p1, v0, p2, v1}, Lmp/t;->o(Ljava/lang/Object;ZLjava/lang/Object;Z)Lmp/a0;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;Z)Ljava/util/NavigableSet;
    .locals 1

    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    move-object v0, p0

    check-cast v0, Lmp/a0;

    .line 8
    invoke-virtual {v0, p1, p2}, Lmp/a0;->r(Ljava/lang/Object;Z)I

    move-result p1

    .line 9
    iget-object p2, v0, Lmp/a0;->F:Lmp/n;

    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p2

    .line 10
    invoke-virtual {v0, p1, p2}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    return-object p1
.end method

.method public final tailSet(Ljava/lang/Object;)Ljava/util/SortedSet;
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    move-object v0, p0

    check-cast v0, Lmp/a0;

    const/4 v1, 0x1

    .line 3
    invoke-virtual {v0, p1, v1}, Lmp/a0;->r(Ljava/lang/Object;Z)I

    move-result p1

    .line 4
    iget-object v1, v0, Lmp/a0;->F:Lmp/n;

    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    .line 5
    invoke-virtual {v0, p1, v1}, Lmp/a0;->t(II)Lmp/a0;

    move-result-object p1

    return-object p1
.end method
