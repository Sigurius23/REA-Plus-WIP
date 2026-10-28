.class public Lu1/f;
.super Lu1/d;
.source "SourceFile"


# instance fields
.field public E:Ljava/lang/Object;

.field public F:Z

.field public G:I

.field public final z:Lu1/e;


# direct methods
.method public constructor <init>(Lu1/e;[Lu1/p;)V
    .locals 1

    iget-object v0, p1, Lu1/e;->y:Lu1/o;

    invoke-direct {p0, v0, p2}, Lu1/d;-><init>(Lu1/o;[Lu1/p;)V

    iput-object p1, p0, Lu1/f;->z:Lu1/e;

    iget p1, p1, Lu1/e;->E:I

    iput p1, p0, Lu1/f;->G:I

    return-void
.end method


# virtual methods
.method public final c(ILu1/o;Ljava/lang/Object;I)V
    .locals 5

    mul-int/lit8 v0, p4, 0x5

    const/16 v1, 0x1e

    iget-object v2, p0, Lu1/d;->w:[Lu1/p;

    if-le v0, v1, :cond_1

    aget-object p1, v2, p4

    iget-object p2, p2, Lu1/o;->d:[Ljava/lang/Object;

    array-length v0, p2

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1, p2}, Lu1/p;->a(II[Ljava/lang/Object;)V

    :goto_0
    aget-object p1, v2, p4

    iget-object p2, p1, Lu1/p;->w:[Ljava/lang/Object;

    iget p1, p1, Lu1/p;->y:I

    aget-object p1, p2, p1

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    aget-object p1, v2, p4

    iget p2, p1, Lu1/p;->y:I

    add-int/lit8 p2, p2, 0x2

    iput p2, p1, Lu1/p;->y:I

    goto :goto_0

    :cond_0
    iput p4, p0, Lu1/d;->x:I

    return-void

    :cond_1
    invoke-static {p1, v0}, Landroidx/room/c1;->B(II)I

    move-result v0

    const/4 v1, 0x1

    shl-int v0, v1, v0

    invoke-virtual {p2, v0}, Lu1/o;->h(I)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {p2, v0}, Lu1/o;->f(I)I

    move-result p1

    aget-object p3, v2, p4

    iget-object v0, p2, Lu1/o;->d:[Ljava/lang/Object;

    iget p2, p2, Lu1/o;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {p3, p2, p1, v0}, Lu1/p;->a(II[Ljava/lang/Object;)V

    iput p4, p0, Lu1/d;->x:I

    return-void

    :cond_2
    invoke-virtual {p2, v0}, Lu1/o;->t(I)I

    move-result v0

    invoke-virtual {p2, v0}, Lu1/o;->s(I)Lu1/o;

    move-result-object v3

    aget-object v2, v2, p4

    iget-object v4, p2, Lu1/o;->d:[Ljava/lang/Object;

    iget p2, p2, Lu1/o;->a:I

    invoke-static {p2}, Ljava/lang/Integer;->bitCount(I)I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    invoke-virtual {v2, p2, v0, v4}, Lu1/p;->a(II[Ljava/lang/Object;)V

    add-int/2addr p4, v1

    invoke-virtual {p0, p1, v3, p3, p4}, Lu1/f;->c(ILu1/o;Ljava/lang/Object;I)V

    return-void
.end method

.method public final next()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lu1/f;->z:Lu1/e;

    iget v0, v0, Lu1/e;->E:I

    iget v1, p0, Lu1/f;->G:I

    if-ne v0, v1, :cond_1

    iget-boolean v0, p0, Lu1/d;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu1/d;->w:[Lu1/p;

    iget v1, p0, Lu1/d;->x:I

    aget-object v0, v0, v1

    iget-object v1, v0, Lu1/p;->w:[Ljava/lang/Object;

    iget v0, v0, Lu1/p;->y:I

    aget-object v0, v1, v0

    iput-object v0, p0, Lu1/f;->E:Ljava/lang/Object;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lu1/f;->F:Z

    invoke-super {p0}, Lu1/d;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_1
    new-instance v0, Ljava/util/ConcurrentModificationException;

    invoke-direct {v0}, Ljava/util/ConcurrentModificationException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 5

    iget-boolean v0, p0, Lu1/f;->F:Z

    if-eqz v0, :cond_3

    iget-boolean v0, p0, Lu1/d;->y:Z

    const/4 v1, 0x0

    iget-object v2, p0, Lu1/f;->z:Lu1/e;

    if-eqz v0, :cond_2

    if-eqz v0, :cond_1

    iget-object v0, p0, Lu1/d;->w:[Lu1/p;

    iget v3, p0, Lu1/d;->x:I

    aget-object v0, v0, v3

    iget-object v3, v0, Lu1/p;->w:[Ljava/lang/Object;

    iget v0, v0, Lu1/p;->y:I

    aget-object v0, v3, v0

    iget-object v3, p0, Lu1/f;->E:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v4

    invoke-interface {v4, v3}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v3

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    iget-object v4, v2, Lu1/e;->y:Lu1/o;

    invoke-virtual {p0, v3, v4, v0, v1}, Lu1/f;->c(ILu1/o;Ljava/lang/Object;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0

    :cond_2
    iget-object v0, p0, Lu1/f;->E:Ljava/lang/Object;

    invoke-static {v2}, Lkotlin/jvm/internal/m0;->c(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    invoke-interface {v3, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    const/4 v0, 0x0

    iput-object v0, p0, Lu1/f;->E:Ljava/lang/Object;

    iput-boolean v1, p0, Lu1/f;->F:Z

    iget v0, v2, Lu1/e;->E:I

    iput v0, p0, Lu1/f;->G:I

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method
