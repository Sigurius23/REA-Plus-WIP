.class public final Lmp/x0;
.super Lmp/b1;
.source "SourceFile"


# instance fields
.field public final w:Lmp/t0;


# direct methods
.method public constructor <init>(Lmp/t0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp/x0;->w:Lmp/t0;

    return-void
.end method


# virtual methods
.method public final a()I
    .locals 1

    const/16 v0, 0x40

    invoke-static {v0}, Lmp/b1;->d(B)I

    move-result v0

    return v0
.end method

.method public final compareTo(Ljava/lang/Object;)I
    .locals 5

    check-cast p1, Lmp/b1;

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result v0

    const/16 v1, 0x40

    invoke-static {v1}, Lmp/b1;->d(B)I

    move-result v1

    if-eq v1, v0, :cond_0

    invoke-virtual {p1}, Lmp/b1;->a()I

    move-result p1

    sub-int/2addr v1, p1

    return v1

    :cond_0
    check-cast p1, Lmp/x0;

    iget-object p1, p1, Lmp/x0;->w:Lmp/t0;

    iget-object v0, p0, Lmp/x0;->w:Lmp/t0;

    iget-object v1, v0, Lmp/t0;->x:[B

    array-length v2, v1

    iget-object v3, p1, Lmp/t0;->x:[B

    array-length v4, v3

    if-eq v2, v4, :cond_1

    array-length p1, v1

    array-length v0, v3

    sub-int/2addr p1, v0

    return p1

    :cond_1
    invoke-virtual {v0}, Lmp/t0;->m()[B

    move-result-object v0

    invoke-virtual {p1}, Lmp/t0;->m()[B

    move-result-object p1

    sget-object v1, Lmp/q0;->a:Ljava/util/Comparator;

    invoke-interface {v1, v0, p1}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const-class v0, Lmp/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_2

    :goto_0
    const/4 p1, 0x0

    return p1

    :cond_2
    check-cast p1, Lmp/x0;

    iget-object v0, p0, Lmp/x0;->w:Lmp/t0;

    iget-object p1, p1, Lmp/x0;->w:Lmp/t0;

    invoke-virtual {v0, p1}, Lmp/t0;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final hashCode()I
    .locals 2

    const/16 v0, 0x40

    invoke-static {v0}, Lmp/b1;->d(B)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lmp/x0;->w:Lmp/t0;

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 14

    sget-object v0, Lmp/n0;->d:Lmp/l0;

    iget-object v1, v0, Lmp/n0;->c:Lmp/n0;

    if-nez v1, :cond_d

    iget-object v1, v0, Lmp/n0;->a:Lmp/k0;

    iget-object v2, v1, Lmp/k0;->b:[C

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    array-length v5, v2

    if-ge v4, v5, :cond_a

    aget-char v5, v2, v4

    const/16 v6, 0x61

    if-lt v5, v6, :cond_9

    const/16 v7, 0x7a

    if-gt v5, v7, :cond_9

    move v4, v3

    :goto_1
    array-length v5, v2

    const/16 v8, 0x5a

    const/16 v9, 0x41

    const/4 v10, 0x1

    if-ge v4, v5, :cond_1

    aget-char v5, v2, v4

    if-lt v5, v9, :cond_0

    if-gt v5, v8, :cond_0

    move v4, v10

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_2
    if-nez v4, :cond_8

    array-length v4, v2

    new-array v4, v4, [C

    :goto_3
    array-length v5, v2

    if-ge v3, v5, :cond_3

    aget-char v5, v2, v3

    if-lt v5, v6, :cond_2

    if-gt v5, v7, :cond_2

    xor-int/lit8 v5, v5, 0x20

    :cond_2
    int-to-char v5, v5

    aput-char v5, v4, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_3
    iget-object v2, v1, Lmp/k0;->a:Ljava/lang/String;

    new-instance v3, Lmp/k0;

    const-string v5, ".upperCase()"

    invoke-virtual {v2, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v2, v4}, Lmp/k0;-><init>(Ljava/lang/String;[C)V

    iget-object v2, v3, Lmp/k0;->g:[B

    iget-boolean v4, v1, Lmp/k0;->h:Z

    if-eqz v4, :cond_b

    iget-boolean v4, v3, Lmp/k0;->h:Z

    if-eqz v4, :cond_4

    goto :goto_6

    :cond_4
    array-length v4, v2

    invoke-static {v2, v4}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v4

    :goto_4
    if-gt v9, v8, :cond_7

    or-int/lit8 v5, v9, 0x20

    aget-byte v6, v2, v9

    aget-byte v7, v2, v5

    const/4 v11, -0x1

    if-ne v6, v11, :cond_5

    aput-byte v7, v4, v9

    goto :goto_5

    :cond_5
    int-to-char v12, v9

    int-to-char v13, v5

    if-ne v7, v11, :cond_6

    aput-byte v6, v4, v5

    :goto_5
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-static {v12}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/lang/Object;

    move-result-object v1

    const-string v2, "Can\'t ignoreCase() since \'%s\' and \'%s\' encode different values"

    invoke-static {v2, v1}, Lmp/b;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7
    iget-object v2, v3, Lmp/k0;->a:Ljava/lang/String;

    iget-object v3, v3, Lmp/k0;->b:[C

    new-instance v5, Lmp/k0;

    const-string v6, ".ignoreCase()"

    invoke-virtual {v2, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, v3, v4, v10}, Lmp/k0;-><init>(Ljava/lang/String;[C[BZ)V

    move-object v3, v5

    goto :goto_6

    :cond_8
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot call upperCase() on a mixed-case alphabet"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    add-int/lit8 v4, v4, 0x1

    goto/16 :goto_0

    :cond_a
    move-object v3, v1

    :cond_b
    :goto_6
    if-ne v3, v1, :cond_c

    move-object v1, v0

    goto :goto_7

    :cond_c
    new-instance v1, Lmp/l0;

    invoke-direct {v1, v3}, Lmp/l0;-><init>(Lmp/k0;)V

    :goto_7
    iput-object v1, v0, Lmp/n0;->c:Lmp/n0;

    :cond_d
    iget-object v0, p0, Lmp/x0;->w:Lmp/t0;

    invoke-virtual {v0}, Lmp/t0;->m()[B

    move-result-object v0

    array-length v2, v0

    invoke-virtual {v1, v2, v0}, Lmp/n0;->c(I[B)Ljava/lang/String;

    move-result-object v0

    const-string v1, "h\'"

    const-string v2, "\'"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
