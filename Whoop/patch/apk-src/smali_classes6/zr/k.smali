.class public final Lzr/k;
.super Lzr/c;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;


# instance fields
.field public final synthetic E:Lzr/l;


# direct methods
.method public constructor <init>(Lzr/l;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lzr/k;->E:Lzr/l;

    invoke-direct {p0, p1}, Lzr/c;-><init>(Lzr/l;)V

    return-void
.end method

.method public constructor <init>(Lzr/l;I)V
    .locals 1

    .line 2
    iput-object p1, p0, Lzr/k;->E:Lzr/l;

    .line 3
    iget-object v0, p1, Lzr/l;->x:Ljava/util/Collection;

    .line 4
    check-cast v0, Ljava/util/List;

    .line 5
    invoke-interface {v0, p2}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lzr/c;-><init>(Lzr/l;Ljava/util/ListIterator;)V

    return-void
.end method


# virtual methods
.method public final add(Ljava/lang/Object;)V
    .locals 3

    iget-object v0, p0, Lzr/k;->E:Lzr/l;

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result v1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/ListIterator;->add(Ljava/lang/Object;)V

    iget-object p1, v0, Lzr/l;->F:Lzr/s0;

    iget v2, p1, Lzr/s0;->E:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p1, Lzr/s0;->E:I

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lzr/l;->a()V

    :cond_0
    return-void
.end method

.method public final b()Ljava/util/ListIterator;
    .locals 1

    invoke-virtual {p0}, Lzr/c;->a()V

    iget-object v0, p0, Lzr/c;->x:Ljava/util/Iterator;

    check-cast v0, Ljava/util/ListIterator;

    return-object v0
.end method

.method public final hasPrevious()Z
    .locals 1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    return v0
.end method

.method public final nextIndex()I
    .locals 1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->nextIndex()I

    move-result v0

    return v0
.end method

.method public final previous()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final previousIndex()I
    .locals 1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/ListIterator;->previousIndex()I

    move-result v0

    return v0
.end method

.method public final set(Ljava/lang/Object;)V
    .locals 1

    invoke-virtual {p0}, Lzr/k;->b()Ljava/util/ListIterator;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/ListIterator;->set(Ljava/lang/Object;)V

    return-void
.end method
