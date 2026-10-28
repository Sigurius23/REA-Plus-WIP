.class public final Lch3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxg3/e;


# instance fields
.field public final w:Ljava/lang/Iterable;

.field public final x:Lbh3/i;

.field public final y:I


# direct methods
.method public constructor <init>(Ljava/util/List;Lbh3/i;)V
    .locals 1

    sget v0, Lgh3/g;->x:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lch3/g;->w:Ljava/lang/Iterable;

    iput-object p2, p0, Lch3/g;->x:Lbh3/i;

    iput v0, p0, Lch3/g;->y:I

    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;)V
    .locals 6

    check-cast p1, Lxg3/s;

    iget-object v0, p0, Lch3/g;->w:Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/List;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-array v1, v1, [Lxg3/g;

    invoke-interface {v0, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lxg3/g;

    array-length v1, v0

    goto :goto_1

    :cond_0
    const/16 v1, 0x8

    new-array v1, v1, [Lxg3/g;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v3, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lxg3/g;

    array-length v5, v1

    if-ne v3, v5, :cond_1

    shr-int/lit8 v5, v3, 0x2

    add-int/2addr v5, v3

    new-array v5, v5, [Lxg3/g;

    invoke-static {v1, v2, v5, v2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v1, v5

    :cond_1
    add-int/lit8 v5, v3, 0x1

    aput-object v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_2
    move-object v0, v1

    move v1, v3

    :goto_1
    if-nez v1, :cond_3

    invoke-interface {p1}, Lxg3/h;->onCompleted()V

    return-void

    :cond_3
    new-instance v3, Lch3/f;

    iget-object v4, p0, Lch3/g;->x:Lbh3/i;

    iget v5, p0, Lch3/g;->y:I

    invoke-direct {v3, p1, v4, v1, v5}, Lch3/f;-><init>(Lxg3/s;Lbh3/i;II)V

    iget-object p1, v3, Lch3/f;->y:[Lch3/e;

    array-length v1, p1

    move v4, v2

    :goto_2
    if-ge v4, v1, :cond_4

    new-instance v5, Lch3/e;

    invoke-direct {v5, v3, v4}, Lch3/e;-><init>(Lch3/f;I)V

    aput-object v5, p1, v4

    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_4
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicInteger;->lazySet(I)V

    iget-object v4, v3, Lch3/f;->w:Lxg3/s;

    invoke-virtual {v4, v3}, Lxg3/s;->c(Lxg3/t;)V

    iget-object v4, v3, Lch3/f;->w:Lxg3/s;

    invoke-virtual {v4, v3}, Lxg3/s;->f(Lxg3/i;)V

    :goto_3
    if-ge v2, v1, :cond_6

    iget-boolean v4, v3, Lch3/f;->G:Z

    if-eqz v4, :cond_5

    goto :goto_4

    :cond_5
    aget-object v4, v0, v2

    aget-object v5, p1, v2

    invoke-virtual {v4, v5}, Lxg3/g;->N(Lxg3/s;)Lxg3/t;

    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_6
    :goto_4
    return-void
.end method
