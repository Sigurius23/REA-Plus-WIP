.class public final La0/g1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public synthetic w:Z

.field public synthetic x:[I

.field public synthetic y:[Ljava/lang/Object;

.field public synthetic z:I


# direct methods
.method public constructor <init>(I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lb0/a;->a:[I

    iput-object p1, p0, La0/g1;->x:[I

    .line 3
    sget-object p1, Lb0/a;->c:[Ljava/lang/Object;

    iput-object p1, p0, La0/g1;->y:[Ljava/lang/Object;

    return-void

    :cond_0
    const/4 v0, 0x4

    mul-int/2addr p1, v0

    move v1, v0

    :goto_0
    const/16 v2, 0x20

    if-ge v1, v2, :cond_2

    const/4 v2, 0x1

    shl-int/2addr v2, v1

    add-int/lit8 v2, v2, -0xc

    if-gt p1, v2, :cond_1

    move p1, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 4
    :cond_2
    :goto_1
    div-int/2addr p1, v0

    .line 5
    new-array v0, p1, [I

    iput-object v0, p0, La0/g1;->x:[I

    .line 6
    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, La0/g1;->y:[Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    const/16 p1, 0xa

    .line 7
    invoke-direct {p0, p1}, La0/g1;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/Object;)V
    .locals 6

    iget v0, p0, La0/g1;->z:I

    if-eqz v0, :cond_0

    iget-object v1, p0, La0/g1;->x:[I

    add-int/lit8 v2, v0, -0x1

    aget v1, v1, v2

    if-gt p1, v1, :cond_0

    invoke-virtual {p0, p1, p2}, La0/g1;->f(ILjava/lang/Object;)V

    return-void

    :cond_0
    iget-boolean v1, p0, La0/g1;->w:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, La0/g1;->x:[I

    array-length v1, v1

    if-lt v0, v1, :cond_1

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    :cond_1
    iget v0, p0, La0/g1;->z:I

    iget-object v1, p0, La0/g1;->x:[I

    array-length v1, v1

    const/4 v2, 0x1

    if-lt v0, v1, :cond_4

    add-int/lit8 v1, v0, 0x1

    const/4 v3, 0x4

    mul-int/2addr v1, v3

    move v4, v3

    :goto_0
    const/16 v5, 0x20

    if-ge v4, v5, :cond_3

    shl-int v5, v2, v4

    add-int/lit8 v5, v5, -0xc

    if-gt v1, v5, :cond_2

    move v1, v5

    goto :goto_1

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_3
    :goto_1
    div-int/2addr v1, v3

    iget-object v3, p0, La0/g1;->x:[I

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v3

    const-string v4, "copyOf(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v3, p0, La0/g1;->x:[I

    iget-object v3, p0, La0/g1;->y:[Ljava/lang/Object;

    invoke-static {v3, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, La0/g1;->y:[Ljava/lang/Object;

    :cond_4
    iget-object v1, p0, La0/g1;->x:[I

    aput p1, v1, v0

    iget-object p1, p0, La0/g1;->y:[Ljava/lang/Object;

    aput-object p2, p1, v0

    add-int/2addr v0, v2

    iput v0, p0, La0/g1;->z:I

    return-void
.end method

.method public final b()La0/g1;
    .locals 2

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, La0/g1;

    iget-object v1, p0, La0/g1;->x:[I

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iput-object v1, v0, La0/g1;->x:[I

    iget-object v1, p0, La0/g1;->y:[Ljava/lang/Object;

    invoke-virtual {v1}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/Object;

    iput-object v1, v0, La0/g1;->y:[Ljava/lang/Object;

    return-object v0
.end method

.method public final c(I)Z
    .locals 2

    iget-boolean v0, p0, La0/g1;->w:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    :cond_0
    iget-object v0, p0, La0/g1;->x:[I

    iget v1, p0, La0/g1;->z:I

    invoke-static {v1, p1, v0}, Lb0/a;->a(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public final bridge synthetic clone()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La0/g1;->b()La0/g1;

    move-result-object v0

    return-object v0
.end method

.method public final d(I)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, La0/g1;->x:[I

    iget v1, p0, La0/g1;->z:I

    invoke-static {v1, p1, v0}, Lb0/a;->a(II[I)I

    move-result p1

    if-ltz p1, :cond_1

    iget-object v0, p0, La0/g1;->y:[Ljava/lang/Object;

    aget-object p1, v0, p1

    sget-object v0, La0/z;->c:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    return-object p1

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final e(I)I
    .locals 1

    iget-boolean v0, p0, La0/g1;->w:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    :cond_0
    iget-object v0, p0, La0/g1;->x:[I

    aget p1, v0, p1

    return p1
.end method

.method public final f(ILjava/lang/Object;)V
    .locals 6

    iget-object v0, p0, La0/g1;->x:[I

    iget v1, p0, La0/g1;->z:I

    invoke-static {v1, p1, v0}, Lb0/a;->a(II[I)I

    move-result v0

    if-ltz v0, :cond_0

    iget-object p1, p0, La0/g1;->y:[Ljava/lang/Object;

    aput-object p2, p1, v0

    return-void

    :cond_0
    not-int v0, v0

    iget v1, p0, La0/g1;->z:I

    if-ge v0, v1, :cond_1

    iget-object v2, p0, La0/g1;->y:[Ljava/lang/Object;

    aget-object v3, v2, v0

    sget-object v4, La0/z;->c:Ljava/lang/Object;

    if-ne v3, v4, :cond_1

    iget-object v1, p0, La0/g1;->x:[I

    aput p1, v1, v0

    aput-object p2, v2, v0

    return-void

    :cond_1
    iget-boolean v2, p0, La0/g1;->w:Z

    if-eqz v2, :cond_2

    iget-object v2, p0, La0/g1;->x:[I

    array-length v2, v2

    if-lt v1, v2, :cond_2

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    iget-object v0, p0, La0/g1;->x:[I

    iget v1, p0, La0/g1;->z:I

    invoke-static {v1, p1, v0}, Lb0/a;->a(II[I)I

    move-result v0

    not-int v0, v0

    :cond_2
    iget v1, p0, La0/g1;->z:I

    iget-object v2, p0, La0/g1;->x:[I

    array-length v2, v2

    const/4 v3, 0x1

    if-lt v1, v2, :cond_5

    add-int/2addr v1, v3

    const/4 v2, 0x4

    mul-int/2addr v1, v2

    move v4, v2

    :goto_0
    const/16 v5, 0x20

    if-ge v4, v5, :cond_4

    shl-int v5, v3, v4

    add-int/lit8 v5, v5, -0xc

    if-gt v1, v5, :cond_3

    move v1, v5

    goto :goto_1

    :cond_3
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_1
    div-int/2addr v1, v2

    iget-object v2, p0, La0/g1;->x:[I

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v2

    const-string v4, "copyOf(...)"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v2, p0, La0/g1;->x:[I

    iget-object v2, p0, La0/g1;->y:[Ljava/lang/Object;

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, La0/g1;->y:[Ljava/lang/Object;

    :cond_5
    iget v1, p0, La0/g1;->z:I

    sub-int v2, v1, v0

    if-eqz v2, :cond_6

    iget-object v2, p0, La0/g1;->x:[I

    add-int/lit8 v4, v0, 0x1

    invoke-static {v4, v0, v2, v2, v1}, Lm83/n;->e0(II[I[II)V

    iget-object v1, p0, La0/g1;->y:[Ljava/lang/Object;

    iget v2, p0, La0/g1;->z:I

    invoke-static {v4, v0, v2, v1, v1}, Lm83/n;->d0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    :cond_6
    iget-object v1, p0, La0/g1;->x:[I

    aput p1, v1, v0

    iget-object p1, p0, La0/g1;->y:[Ljava/lang/Object;

    aput-object p2, p1, v0

    iget p1, p0, La0/g1;->z:I

    add-int/2addr p1, v3

    iput p1, p0, La0/g1;->z:I

    return-void
.end method

.method public final g()I
    .locals 1

    iget-boolean v0, p0, La0/g1;->w:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    :cond_0
    iget v0, p0, La0/g1;->z:I

    return v0
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 2

    iget-boolean v0, p0, La0/g1;->w:Z

    if-eqz v0, :cond_0

    invoke-static {p0}, La0/z;->a(La0/g1;)V

    :cond_0
    iget-object v0, p0, La0/g1;->y:[Ljava/lang/Object;

    array-length v1, v0

    if-ge p1, v1, :cond_1

    aget-object p1, v0, p1

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    invoke-virtual {p0}, La0/g1;->g()I

    move-result v0

    if-gtz v0, :cond_0

    const-string v0, "{}"

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, La0/g1;->z:I

    mul-int/lit8 v1, v1, 0x1c

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const/16 v1, 0x7b

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v1, p0, La0/g1;->z:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    if-lez v2, :cond_1

    const-string v3, ", "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    invoke-virtual {p0, v2}, La0/g1;->e(I)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v3, 0x3d

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v2}, La0/g1;->h(I)Ljava/lang/Object;

    move-result-object v3

    if-eq v3, p0, :cond_2

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "(this Map)"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
