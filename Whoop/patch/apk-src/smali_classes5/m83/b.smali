.class public abstract Lm83/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements Ld93/a;


# instance fields
.field public w:I

.field public x:Ljava/lang/Object;


# virtual methods
.method public abstract a()V
.end method

.method public final hasNext()Z
    .locals 3

    iget v0, p0, Lm83/b;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v2, :cond_1

    const/4 v2, 0x2

    if-ne v0, v2, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "hasNext called when the iterator is in the FAILED state."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v2

    :cond_2
    const/4 v0, 0x3

    iput v0, p0, Lm83/b;->w:I

    invoke-virtual {p0}, Lm83/b;->a()V

    iget v0, p0, Lm83/b;->w:I

    if-ne v0, v2, :cond_3

    return v2

    :cond_3
    return v1
.end method

.method public final next()Ljava/lang/Object;
    .locals 4

    iget v0, p0, Lm83/b;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lm83/b;->w:I

    iget-object v0, p0, Lm83/b;->x:Ljava/lang/Object;

    return-object v0

    :cond_0
    const/4 v3, 0x2

    if-eq v0, v3, :cond_1

    const/4 v0, 0x3

    iput v0, p0, Lm83/b;->w:I

    invoke-virtual {p0}, Lm83/b;->a()V

    iget v0, p0, Lm83/b;->w:I

    if-ne v0, v2, :cond_1

    iput v1, p0, Lm83/b;->w:I

    iget-object v0, p0, Lm83/b;->x:Ljava/lang/Object;

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
