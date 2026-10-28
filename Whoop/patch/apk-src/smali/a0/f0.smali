.class public final La0/f0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:[I

.field public b:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/16 v0, 0x10

    .line 5
    invoke-direct {p0, v0}, La0/f0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 2
    sget-object p1, La0/u;->a:[I

    goto :goto_0

    .line 3
    :cond_0
    new-array p1, p1, [I

    .line 4
    :goto_0
    iput-object p1, p0, La0/f0;->a:[I

    return-void
.end method


# virtual methods
.method public final a(I)V
    .locals 2

    iget v0, p0, La0/f0;->b:I

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, La0/f0;->b(I)V

    iget-object v0, p0, La0/f0;->a:[I

    iget v1, p0, La0/f0;->b:I

    aput p1, v0, v1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, La0/f0;->b:I

    return-void
.end method

.method public final b(I)V
    .locals 2

    iget-object v0, p0, La0/f0;->a:[I

    array-length v1, v0

    if-ge v1, p1, :cond_0

    array-length v1, v0

    mul-int/lit8 v1, v1, 0x3

    div-int/lit8 v1, v1, 0x2

    invoke-static {p1, v1}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object p1

    const-string v0, "copyOf(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, La0/f0;->a:[I

    :cond_0
    return-void
.end method

.method public final c(I)I
    .locals 1

    if-ltz p1, :cond_0

    iget v0, p0, La0/f0;->b:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, La0/f0;->a:[I

    aget p1, v0, p1

    return p1

    :cond_0
    const-string p1, "Index must be between 0 and size"

    invoke-static {p1}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final d()I
    .locals 2

    iget v0, p0, La0/f0;->b:I

    if-eqz v0, :cond_0

    iget-object v1, p0, La0/f0;->a:[I

    add-int/lit8 v0, v0, -0x1

    aget v0, v1, v0

    return v0

    :cond_0
    const-string v0, "IntList is empty."

    invoke-static {v0}, Lug/m;->R(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final e(I)V
    .locals 4

    iget-object v0, p0, La0/f0;->a:[I

    iget v1, p0, La0/f0;->b:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget v3, v0, v2

    if-ne p1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    if-ltz v2, :cond_2

    invoke-virtual {p0, v2}, La0/f0;->f(I)V

    :cond_2
    return-void
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    instance-of v0, p1, La0/f0;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, La0/f0;

    iget v0, p1, La0/f0;->b:I

    iget v2, p0, La0/f0;->b:I

    if-eq v0, v2, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, La0/f0;->a:[I

    iget-object p1, p1, La0/f0;->a:[I

    invoke-static {v1, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    iget v3, v2, Li93/h;->w:I

    iget v2, v2, Li93/h;->x:I

    if-gt v3, v2, :cond_2

    :goto_0
    aget v4, v0, v3

    aget v5, p1, v3

    if-eq v4, v5, :cond_1

    return v1

    :cond_1
    if-eq v3, v2, :cond_2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v1
.end method

.method public final f(I)V
    .locals 3

    if-ltz p1, :cond_1

    iget v0, p0, La0/f0;->b:I

    if-ge p1, v0, :cond_1

    iget-object v1, p0, La0/f0;->a:[I

    aget v2, v1, p1

    add-int/lit8 v2, v0, -0x1

    if-eq p1, v2, :cond_0

    add-int/lit8 v2, p1, 0x1

    invoke-static {p1, v2, v1, v1, v0}, Lm83/n;->e0(II[I[II)V

    :cond_0
    iget p1, p0, La0/f0;->b:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, La0/f0;->b:I

    return-void

    :cond_1
    const-string p1, "Index must be between 0 and size"

    invoke-static {p1}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final g(II)V
    .locals 2

    if-ltz p1, :cond_0

    iget v0, p0, La0/f0;->b:I

    if-ge p1, v0, :cond_0

    iget-object v0, p0, La0/f0;->a:[I

    aget v1, v0, p1

    aput p2, v0, p1

    return-void

    :cond_0
    const-string p1, "Index must be between 0 and size"

    invoke-static {p1}, Lug/m;->Q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final hashCode()I
    .locals 5

    iget-object v0, p0, La0/f0;->a:[I

    iget v1, p0, La0/f0;->b:I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    aget v4, v0, v2

    invoke-static {v4}, Ljava/lang/Integer;->hashCode(I)I

    move-result v4

    mul-int/lit8 v4, v4, 0x1f

    add-int/2addr v3, v4

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return v3
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "["

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    iget-object v1, p0, La0/f0;->a:[I

    iget v2, p0, La0/f0;->b:I

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v2, :cond_2

    aget v4, v1, v3

    const/4 v5, -0x1

    if-ne v3, v5, :cond_0

    const-string v1, "..."

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    if-eqz v3, :cond_1

    const-string v5, ", "

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    const-string v1, "]"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
