.class public final Lne3/m0;
.super Lne3/l;
.source "SourceFile"


# instance fields
.field public final transient F:[[B

.field public final transient G:[I


# direct methods
.method public constructor <init>([[B[I)V
    .locals 1

    sget-object v0, Lne3/l;->E:Lne3/l;

    iget-object v0, v0, Lne3/l;->w:[B

    invoke-direct {p0, v0}, Lne3/l;-><init>([B)V

    iput-object p1, p0, Lne3/m0;->F:[[B

    iput-object p2, p0, Lne3/m0;->G:[I

    return-void
.end method


# virtual methods
.method public final b(III[B)V
    .locals 11

    const-string v0, "target"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v0

    int-to-long v1, v0

    int-to-long v3, p1

    int-to-long v5, p3

    invoke-static/range {v1 .. v6}, Lne3/b;->e(JJJ)V

    array-length v0, p4

    int-to-long v0, v0

    int-to-long v7, p2

    move-wide v9, v5

    move-wide v5, v0

    invoke-static/range {v5 .. v10}, Lne3/b;->e(JJJ)V

    add-int/2addr p3, p1

    invoke-static {p0, p1}, Loe3/b;->c(Lne3/m0;I)I

    move-result v0

    :goto_0
    if-ge p1, p3, :cond_1

    iget-object v1, p0, Lne3/m0;->G:[I

    if-nez v0, :cond_0

    const/4 v2, 0x0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v0, -0x1

    aget v2, v1, v2

    :goto_1
    aget v3, v1, v0

    sub-int/2addr v3, v2

    iget-object v4, p0, Lne3/m0;->F:[[B

    array-length v5, v4

    add-int/2addr v5, v0

    aget v1, v1, v5

    add-int/2addr v3, v2

    invoke-static {p3, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int/2addr v3, p1

    sub-int v2, p1, v2

    add-int/2addr v2, v1

    aget-object v1, v4, v0

    add-int v4, v2, v3

    invoke-static {p2, v2, v4, v1, p4}, Lm83/n;->c0(III[B[B)V

    add-int/2addr p2, v3

    add-int/2addr p1, v3

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return-void
.end method

.method public final c(Ljava/lang/String;)Lne3/l;
    .locals 7

    invoke-static {p1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object p1

    iget-object v0, p0, Lne3/m0;->F:[[B

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_0

    add-int v4, v1, v2

    iget-object v5, p0, Lne3/m0;->G:[I

    aget v4, v5, v4

    aget v5, v5, v2

    aget-object v6, v0, v2

    sub-int v3, v5, v3

    invoke-virtual {p1, v6, v4, v3}, Ljava/security/MessageDigest;->update([BII)V

    add-int/lit8 v2, v2, 0x1

    move v3, v5

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p1

    new-instance v0, Lne3/l;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, p1}, Lne3/l;-><init>([B)V

    return-object v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Lne3/m0;->F:[[B

    array-length v0, v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lne3/m0;->G:[I

    aget v0, v1, v0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->e()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p1, p0, :cond_0

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lne3/l;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lne3/l;

    invoke-virtual {p1}, Lne3/l;->d()I

    move-result v0

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v2

    if-ne v0, v2, :cond_1

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v0

    invoke-virtual {p0, v1, v0, p1}, Lne3/m0;->m(IILne3/l;)Z

    move-result p1

    if-eqz p1, :cond_1

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final f(I[B)I
    .locals 1

    const-string v0, "other"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lne3/l;->f(I[B)I

    move-result p1

    return p1
.end method

.method public final h()[B
    .locals 1

    invoke-virtual {p0}, Lne3/m0;->r()[B

    move-result-object v0

    return-object v0
.end method

.method public final hashCode()I
    .locals 9

    iget v0, p0, Lne3/l;->x:I

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object v0, p0, Lne3/m0;->F:[[B

    array-length v1, v0

    const/4 v2, 0x0

    const/4 v3, 0x1

    move v4, v3

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_2

    add-int v5, v1, v2

    iget-object v6, p0, Lne3/m0;->G:[I

    aget v5, v6, v5

    aget v6, v6, v2

    aget-object v7, v0, v2

    sub-int v3, v6, v3

    add-int/2addr v3, v5

    :goto_1
    if-ge v5, v3, :cond_1

    mul-int/lit8 v4, v4, 0x1f

    aget-byte v8, v7, v5

    add-int/2addr v4, v8

    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move v3, v6

    goto :goto_0

    :cond_2
    iput v4, p0, Lne3/l;->x:I

    return v4
.end method

.method public final i(I)B
    .locals 9

    iget-object v0, p0, Lne3/m0;->F:[[B

    array-length v1, v0

    add-int/lit8 v1, v1, -0x1

    iget-object v2, p0, Lne3/m0;->G:[I

    aget v1, v2, v1

    int-to-long v3, v1

    int-to-long v5, p1

    const-wide/16 v7, 0x1

    invoke-static/range {v3 .. v8}, Lne3/b;->e(JJJ)V

    invoke-static {p0, p1}, Loe3/b;->c(Lne3/m0;I)I

    move-result v1

    if-nez v1, :cond_0

    const/4 v3, 0x0

    goto :goto_0

    :cond_0
    add-int/lit8 v3, v1, -0x1

    aget v3, v2, v3

    :goto_0
    array-length v4, v0

    add-int/2addr v4, v1

    aget v2, v2, v4

    aget-object v0, v0, v1

    sub-int/2addr p1, v3

    add-int/2addr p1, v2

    aget-byte p1, v0, p1

    return p1
.end method

.method public final j([B)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lne3/l;->j([B)I

    move-result p1

    return p1
.end method

.method public final l(III[B)Z
    .locals 7

    const-string v0, "other"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v1

    sub-int/2addr v1, p3

    if-gt p1, v1, :cond_4

    if-ltz p2, :cond_4

    array-length v1, p4

    sub-int/2addr v1, p3

    if-le p2, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p3, p1

    invoke-static {p0, p1}, Loe3/b;->c(Lne3/m0;I)I

    move-result v1

    :goto_0
    if-ge p1, p3, :cond_3

    iget-object v2, p0, Lne3/m0;->G:[I

    if-nez v1, :cond_1

    move v3, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v1, -0x1

    aget v3, v2, v3

    :goto_1
    aget v4, v2, v1

    sub-int/2addr v4, v3

    iget-object v5, p0, Lne3/m0;->F:[[B

    array-length v6, v5

    add-int/2addr v6, v1

    aget v2, v2, v6

    add-int/2addr v4, v3

    invoke-static {p3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    sub-int/2addr v4, p1

    sub-int v3, p1, v3

    add-int/2addr v3, v2

    aget-object v2, v5, v1

    invoke-static {v3, p2, v4, v2, p4}, Lne3/b;->a(III[B[B)Z

    move-result v2

    if-nez v2, :cond_2

    return v0

    :cond_2
    add-int/2addr p2, v4

    add-int/2addr p1, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_2
    return v0
.end method

.method public final m(IILne3/l;)Z
    .locals 8

    const-string v0, "other"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-ltz p1, :cond_4

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v1

    sub-int/2addr v1, p2

    if-le p1, v1, :cond_0

    goto :goto_2

    :cond_0
    add-int/2addr p2, p1

    invoke-static {p0, p1}, Loe3/b;->c(Lne3/m0;I)I

    move-result v1

    move v2, v0

    :goto_0
    if-ge p1, p2, :cond_3

    iget-object v3, p0, Lne3/m0;->G:[I

    if-nez v1, :cond_1

    move v4, v0

    goto :goto_1

    :cond_1
    add-int/lit8 v4, v1, -0x1

    aget v4, v3, v4

    :goto_1
    aget v5, v3, v1

    sub-int/2addr v5, v4

    iget-object v6, p0, Lne3/m0;->F:[[B

    array-length v7, v6

    add-int/2addr v7, v1

    aget v3, v3, v7

    add-int/2addr v5, v4

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, p1

    sub-int v4, p1, v4

    add-int/2addr v4, v3

    aget-object v3, v6, v1

    invoke-virtual {p3, v2, v4, v5, v3}, Lne3/l;->l(III[B)Z

    move-result v3

    if-nez v3, :cond_2

    goto :goto_2

    :cond_2
    add-int/2addr v2, v5

    add-int/2addr p1, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    const/4 p1, 0x1

    return p1

    :cond_4
    :goto_2
    return v0
.end method

.method public final n(Ljava/nio/charset/Charset;)Ljava/lang/String;
    .locals 1

    const-string v0, "charset"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Lne3/l;->n(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public final o(II)Lne3/l;
    .locals 11

    const v0, -0x499602d2

    if-ne p2, v0, :cond_0

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result p2

    :cond_0
    if-ltz p1, :cond_7

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v0

    const-string v1, "endIndex="

    if-gt p2, v0, :cond_6

    sub-int v0, p2, p1

    if-ltz v0, :cond_5

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v1

    if-ne p2, v1, :cond_1

    return-object p0

    :cond_1
    if-ne p1, p2, :cond_2

    sget-object p1, Lne3/l;->E:Lne3/l;

    return-object p1

    :cond_2
    invoke-static {p0, p1}, Loe3/b;->c(Lne3/m0;I)I

    move-result v1

    add-int/lit8 p2, p2, -0x1

    invoke-static {p0, p2}, Loe3/b;->c(Lne3/m0;I)I

    move-result p2

    add-int/lit8 v2, p2, 0x1

    iget-object v3, p0, Lne3/m0;->F:[[B

    invoke-static {v1, v2, v3}, Lm83/n;->m0(II[Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [[B

    array-length v4, v2

    mul-int/lit8 v4, v4, 0x2

    new-array v4, v4, [I

    const/4 v5, 0x0

    iget-object v6, p0, Lne3/m0;->G:[I

    if-gt v1, p2, :cond_3

    move v8, v1

    move v7, v5

    :goto_0
    aget v9, v6, v8

    sub-int/2addr v9, p1

    invoke-static {v9, v0}, Ljava/lang/Math;->min(II)I

    move-result v9

    aput v9, v4, v7

    add-int/lit8 v9, v7, 0x1

    array-length v10, v2

    add-int/2addr v7, v10

    array-length v10, v3

    add-int/2addr v10, v8

    aget v10, v6, v10

    aput v10, v4, v7

    if-eq v8, p2, :cond_3

    add-int/lit8 v8, v8, 0x1

    move v7, v9

    goto :goto_0

    :cond_3
    if-nez v1, :cond_4

    goto :goto_1

    :cond_4
    add-int/lit8 v1, v1, -0x1

    aget v5, v6, v1

    :goto_1
    array-length p2, v2

    aget v0, v4, p2

    sub-int/2addr p1, v5

    add-int/2addr p1, v0

    aput p1, v4, p2

    new-instance p1, Lne3/m0;

    invoke-direct {p1, v2, v4}, Lne3/m0;-><init>([[B[I)V

    return-object p1

    :cond_5
    const-string v0, " < beginIndex="

    invoke-static {p2, p1, v1, v0}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_6
    const-string p1, " > length("

    invoke-static {p2, v1, p1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p2, 0x29

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_7
    const-string p2, "beginIndex="

    const-string v0, " < 0"

    invoke-static {p1, p2, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final q()Lne3/l;
    .locals 1

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->q()Lne3/l;

    move-result-object v0

    return-object v0
.end method

.method public final r()[B
    .locals 10

    invoke-virtual {p0}, Lne3/m0;->d()I

    move-result v0

    new-array v0, v0, [B

    iget-object v1, p0, Lne3/m0;->F:[[B

    array-length v2, v1

    const/4 v3, 0x0

    move v4, v3

    move v5, v4

    :goto_0
    if-ge v3, v2, :cond_0

    add-int v6, v2, v3

    iget-object v7, p0, Lne3/m0;->G:[I

    aget v6, v7, v6

    aget v7, v7, v3

    aget-object v8, v1, v3

    sub-int v4, v7, v4

    add-int v9, v6, v4

    invoke-static {v5, v6, v9, v8, v0}, Lm83/n;->c0(III[B[B)V

    add-int/2addr v5, v4

    add-int/lit8 v3, v3, 0x1

    move v4, v7

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public final t(Lne3/h;I)V
    .locals 13

    const/4 v0, 0x0

    invoke-static {p0, v0}, Loe3/b;->c(Lne3/m0;I)I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, p2, :cond_2

    iget-object v3, p0, Lne3/m0;->G:[I

    if-nez v1, :cond_0

    move v4, v0

    goto :goto_1

    :cond_0
    add-int/lit8 v4, v1, -0x1

    aget v4, v3, v4

    :goto_1
    aget v5, v3, v1

    sub-int/2addr v5, v4

    iget-object v6, p0, Lne3/m0;->F:[[B

    array-length v7, v6

    add-int/2addr v7, v1

    aget v3, v3, v7

    add-int/2addr v5, v4

    invoke-static {p2, v5}, Ljava/lang/Math;->min(II)I

    move-result v5

    sub-int/2addr v5, v2

    sub-int v4, v2, v4

    add-int v9, v4, v3

    aget-object v8, v6, v1

    new-instance v7, Lne3/k0;

    add-int v10, v9, v5

    const/4 v11, 0x1

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v12}, Lne3/k0;-><init>([BIIZZ)V

    iget-object v3, p1, Lne3/h;->w:Lne3/k0;

    if-nez v3, :cond_1

    iput-object v7, v7, Lne3/k0;->g:Lne3/k0;

    iput-object v7, v7, Lne3/k0;->f:Lne3/k0;

    iput-object v7, p1, Lne3/h;->w:Lne3/k0;

    goto :goto_2

    :cond_1
    iget-object v3, v3, Lne3/k0;->g:Lne3/k0;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3, v7}, Lne3/k0;->b(Lne3/k0;)V

    :goto_2
    add-int/2addr v2, v5

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget-wide v0, p1, Lne3/h;->x:J

    int-to-long v2, p2

    add-long/2addr v0, v2

    iput-wide v0, p1, Lne3/h;->x:J

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lne3/m0;->u()Lne3/l;

    move-result-object v0

    invoke-virtual {v0}, Lne3/l;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final u()Lne3/l;
    .locals 2

    new-instance v0, Lne3/l;

    invoke-virtual {p0}, Lne3/m0;->r()[B

    move-result-object v1

    invoke-direct {v0, v1}, Lne3/l;-><init>([B)V

    return-object v0
.end method
