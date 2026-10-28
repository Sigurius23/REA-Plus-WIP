.class public Lxw/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# instance fields
.field public final w:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lxw/a;->w:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a()[B
    .locals 17

    move-object/from16 v0, p0

    iget-object v1, v0, Lxw/a;->w:Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    const/4 v1, 0x0

    goto/16 :goto_3

    :cond_1
    sget-object v3, Lxw/f;->a:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    array-length v3, v1

    int-to-long v4, v3

    const-wide/16 v6, 0x6

    mul-long/2addr v4, v6

    const/4 v6, 0x3

    shr-long/2addr v4, v6

    long-to-int v7, v4

    int-to-long v8, v7

    cmp-long v8, v8, v4

    if-nez v8, :cond_8

    new-array v4, v7, [B

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_0
    array-length v8, v1

    if-ge v5, v8, :cond_7

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_1
    const/4 v10, 0x4

    if-ge v8, v10, :cond_3

    if-ge v5, v3, :cond_3

    add-int/lit8 v10, v5, 0x1

    aget-byte v5, v1, v5

    const/16 v11, 0x40

    invoke-static {v5, v11}, Lrs/b;->n(II)I

    move-result v11

    const/16 v12, 0x5b

    invoke-static {v5, v12}, Lrs/b;->o(II)I

    move-result v12

    and-int/2addr v11, v12

    const/16 v12, 0x60

    invoke-static {v5, v12}, Lrs/b;->n(II)I

    move-result v12

    const/16 v13, 0x7b

    invoke-static {v5, v13}, Lrs/b;->o(II)I

    move-result v13

    and-int/2addr v12, v13

    const/16 v13, 0x2f

    invoke-static {v5, v13}, Lrs/b;->n(II)I

    move-result v14

    const/16 v15, 0x3a

    invoke-static {v5, v15}, Lrs/b;->o(II)I

    move-result v15

    and-int/2addr v14, v15

    const/16 v15, 0x2d

    invoke-static {v5, v15}, Lrs/b;->m(II)I

    move-result v15

    const/16 v6, 0x2b

    invoke-static {v5, v6}, Lrs/b;->m(II)I

    move-result v6

    or-int/2addr v6, v15

    const/16 v15, 0x5f

    invoke-static {v5, v15}, Lrs/b;->m(II)I

    move-result v15

    invoke-static {v5, v13}, Lrs/b;->m(II)I

    move-result v13

    or-int/2addr v13, v15

    or-int v15, v11, v12

    or-int/2addr v15, v14

    or-int/2addr v15, v6

    or-int/2addr v15, v13

    add-int/lit8 v2, v5, -0x41

    add-int/lit8 v0, v5, -0x47

    add-int/lit8 v5, v5, 0x4

    move-object/from16 v16, v1

    const/4 v1, 0x0

    invoke-static {v11, v2, v1}, Lrs/b;->p(III)I

    move-result v2

    invoke-static {v12, v0, v1}, Lrs/b;->p(III)I

    move-result v0

    or-int/2addr v0, v2

    invoke-static {v14, v5, v1}, Lrs/b;->p(III)I

    move-result v2

    or-int/2addr v0, v2

    const/16 v2, 0x3e

    invoke-static {v6, v2, v1}, Lrs/b;->p(III)I

    move-result v2

    or-int/2addr v0, v2

    const/16 v2, 0x3f

    invoke-static {v13, v2, v1}, Lrs/b;->p(III)I

    move-result v2

    or-int/2addr v0, v2

    const/4 v2, -0x1

    invoke-static {v15, v1, v2}, Lrs/b;->p(III)I

    move-result v2

    or-int/2addr v0, v2

    if-ltz v0, :cond_2

    mul-int/lit8 v1, v8, 0x6

    rsub-int/lit8 v1, v1, 0x12

    shl-int/2addr v0, v1

    or-int/2addr v9, v0

    add-int/lit8 v8, v8, 0x1

    :cond_2
    move-object/from16 v0, p0

    move v5, v10

    move-object/from16 v1, v16

    const/4 v6, 0x3

    goto/16 :goto_1

    :cond_3
    move-object/from16 v16, v1

    const/4 v0, 0x2

    if-lt v8, v0, :cond_6

    add-int/lit8 v0, v7, 0x1

    shr-int/lit8 v1, v9, 0x10

    int-to-byte v1, v1

    aput-byte v1, v4, v7

    const/4 v1, 0x3

    if-lt v8, v1, :cond_5

    add-int/lit8 v2, v7, 0x2

    shr-int/lit8 v6, v9, 0x8

    int-to-byte v6, v6

    aput-byte v6, v4, v0

    if-lt v8, v10, :cond_4

    add-int/lit8 v7, v7, 0x3

    int-to-byte v0, v9

    aput-byte v0, v4, v2

    goto :goto_2

    :cond_4
    move v7, v2

    goto :goto_2

    :cond_5
    move v7, v0

    goto :goto_2

    :cond_6
    const/4 v1, 0x3

    :goto_2
    move-object/from16 v0, p0

    move v6, v1

    move-object/from16 v1, v16

    goto/16 :goto_0

    :cond_7
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0

    :cond_8
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, " cannot be cast to int without changing its value."

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :goto_3
    new-array v0, v1, [B

    return-object v0
.end method

.method public final b()Ljava/math/BigInteger;
    .locals 3

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-virtual {p0}, Lxw/a;->a()[B

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lxw/a;

    if-eqz v0, :cond_0

    check-cast p1, Lxw/a;

    iget-object p1, p1, Lxw/a;->w:Ljava/lang/String;

    iget-object v0, p0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

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

    iget-object v0, p0, Lxw/a;->w:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lxw/a;->w:Ljava/lang/String;

    return-object v0
.end method
