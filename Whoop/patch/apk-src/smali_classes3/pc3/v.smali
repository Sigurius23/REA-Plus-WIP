.class public abstract Lpc3/v;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Collection;
.implements Ld93/a;


# instance fields
.field public final w:Li93/k;

.field public final x:Lkotlinx/datetime/YearMonth;

.field public final y:Lkotlinx/datetime/YearMonth;


# direct methods
.method public constructor <init>(Lkotlinx/datetime/YearMonth;Lkotlinx/datetime/YearMonth;)V
    .locals 7

    invoke-static {p1}, Lkotlinx/datetime/h;->b(Lkotlinx/datetime/YearMonth;)J

    move-result-wide v1

    invoke-static {p2}, Lkotlinx/datetime/h;->b(Lkotlinx/datetime/YearMonth;)J

    move-result-wide v3

    new-instance v0, Li93/k;

    const-wide/16 v5, 0x1

    invoke-direct/range {v0 .. v6}, Li93/k;-><init>(JJJ)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lpc3/v;->w:Li93/k;

    sget-object p1, Lkotlinx/datetime/YearMonth;->Companion:Lpc3/t;

    invoke-static {p1, v1, v2}, Lkotlinx/datetime/h;->a(Lpc3/t;J)Lkotlinx/datetime/YearMonth;

    move-result-object p2

    iput-object p2, p0, Lpc3/v;->x:Lkotlinx/datetime/YearMonth;

    iget-wide v0, v0, Li93/k;->x:J

    invoke-static {p1, v0, v1}, Lkotlinx/datetime/h;->a(Lpc3/t;J)Lkotlinx/datetime/YearMonth;

    move-result-object p1

    iput-object p1, p0, Lpc3/v;->y:Lkotlinx/datetime/YearMonth;

    return-void
.end method


# virtual methods
.method public final bridge synthetic add(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final clear()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lkotlinx/datetime/YearMonth;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lkotlinx/datetime/YearMonth;

    move-object v0, p0

    check-cast v0, Lkotlinx/datetime/i;

    iget-object v2, v0, Lpc3/v;->x:Lkotlinx/datetime/YearMonth;

    invoke-virtual {v2, p1}, Lkotlinx/datetime/YearMonth;->compareTo(Lkotlinx/datetime/YearMonth;)I

    move-result v2

    if-gtz v2, :cond_1

    iget-object v0, v0, Lpc3/v;->y:Lkotlinx/datetime/YearMonth;

    invoke-virtual {p1, v0}, Lkotlinx/datetime/YearMonth;->compareTo(Lkotlinx/datetime/YearMonth;)I

    move-result p1

    if-gtz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final containsAll(Ljava/util/Collection;)Z
    .locals 3

    const-string v0, "elements"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Lkotlinx/datetime/YearMonth;

    if-eqz v2, :cond_1

    invoke-virtual {p0, v0}, Lpc3/v;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    return p1

    :cond_2
    return v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lpc3/v;

    if-eqz v0, :cond_0

    check-cast p1, Lpc3/v;

    iget-object p1, p1, Lpc3/v;->w:Li93/k;

    iget-object v0, p0, Lpc3/v;->w:Li93/k;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lpc3/v;->w:Li93/k;

    invoke-virtual {v0}, Li93/k;->hashCode()I

    move-result v0

    return v0
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 8

    new-instance v0, Lpc3/i;

    new-instance v1, Li93/l;

    iget-object v2, p0, Lpc3/v;->w:Li93/k;

    move-object v4, v2

    iget-wide v2, v4, Li93/k;->w:J

    move-object v6, v4

    iget-wide v4, v6, Li93/k;->x:J

    iget-wide v6, v6, Li93/k;->y:J

    invoke-direct/range {v1 .. v7}, Li93/l;-><init>(JJJ)V

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lpc3/i;-><init>(Li93/l;I)V

    return-object v0
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final removeIf(Ljava/util/function/Predicate;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final retainAll(Ljava/util/Collection;)Z
    .locals 1

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final size()I
    .locals 1

    iget-object v0, p0, Lpc3/v;->w:Li93/k;

    invoke-static {v0}, Lrc3/b;->a(Li93/k;)I

    move-result v0

    return v0
.end method

.method public final toArray()[Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p0}, Lkotlin/jvm/internal/k;->r(Ljava/util/Collection;)[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final toArray([Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 1

    .line 2
    const-string v0, "array"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->s(Ljava/util/Collection;[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
