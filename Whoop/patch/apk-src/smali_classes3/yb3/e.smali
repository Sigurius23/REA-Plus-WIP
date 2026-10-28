.class public abstract Lyb3/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[I

.field public static final b:[I

.field public static final c:[J


# direct methods
.method static constructor <clinit>()V
    .locals 10

    const/16 v0, 0x100

    new-array v1, v0, [I

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-string v4, "0123456789abcdef"

    if-ge v3, v0, :cond_0

    shr-int/lit8 v5, v3, 0x4

    invoke-virtual {v4, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    shl-int/lit8 v5, v5, 0x8

    and-int/lit8 v6, v3, 0xf

    invoke-virtual {v4, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    or-int/2addr v4, v5

    aput v4, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    sput-object v1, Lyb3/e;->a:[I

    new-array v1, v0, [I

    move v3, v2

    :goto_1
    const-string v5, "0123456789ABCDEF"

    if-ge v3, v0, :cond_1

    shr-int/lit8 v6, v3, 0x4

    invoke-virtual {v5, v6}, Ljava/lang/String;->charAt(I)C

    move-result v6

    shl-int/lit8 v6, v6, 0x8

    and-int/lit8 v7, v3, 0xf

    invoke-virtual {v5, v7}, Ljava/lang/String;->charAt(I)C

    move-result v5

    or-int/2addr v5, v6

    aput v5, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-array v1, v0, [I

    move v3, v2

    :goto_2
    if-ge v3, v0, :cond_2

    const/4 v6, -0x1

    aput v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_2

    :cond_2
    move v3, v2

    move v6, v3

    :goto_3
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v3, v7, :cond_3

    invoke-interface {v4, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    add-int/lit8 v8, v6, 0x1

    aput v6, v1, v7

    add-int/lit8 v3, v3, 0x1

    move v6, v8

    goto :goto_3

    :cond_3
    move v3, v2

    move v6, v3

    :goto_4
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    if-ge v3, v7, :cond_4

    invoke-interface {v5, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v7

    add-int/lit8 v8, v6, 0x1

    aput v6, v1, v7

    add-int/lit8 v3, v3, 0x1

    move v6, v8

    goto :goto_4

    :cond_4
    sput-object v1, Lyb3/e;->b:[I

    new-array v1, v0, [J

    move v3, v2

    :goto_5
    if-ge v3, v0, :cond_5

    const-wide/16 v6, -0x1

    aput-wide v6, v1, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_5

    :cond_5
    move v0, v2

    move v3, v0

    :goto_6
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v6

    if-ge v0, v6, :cond_6

    invoke-interface {v4, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v6

    add-int/lit8 v7, v3, 0x1

    int-to-long v8, v3

    aput-wide v8, v1, v6

    add-int/lit8 v0, v0, 0x1

    move v3, v7

    goto :goto_6

    :cond_6
    move v0, v2

    :goto_7
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ge v2, v3, :cond_7

    invoke-interface {v5, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/lit8 v4, v0, 0x1

    int-to-long v6, v0

    aput-wide v6, v1, v3

    add-int/lit8 v2, v2, 0x1

    move v0, v4

    goto :goto_7

    :cond_7
    sput-object v1, Lyb3/e;->c:[J

    return-void
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 24

    move-object/from16 v0, p0

    sget-object v1, Lyb3/h;->d:Lyb3/h;

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "format"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    invoke-static {v4, v2, v3}, Lq83/g;->n(III)V

    if-nez v2, :cond_0

    new-array v0, v4, [B

    return-object v0

    :cond_0
    iget-object v1, v1, Lyb3/h;->b:Lyb3/f;

    iget-boolean v3, v1, Lyb3/f;->a:Z

    const/4 v5, 0x1

    const-wide/16 v6, 0x2

    const/4 v8, 0x2

    if-eqz v3, :cond_6

    iget-boolean v3, v1, Lyb3/f;->b:Z

    const/4 v9, 0x0

    if-eqz v3, :cond_3

    and-int/lit8 v3, v2, 0x1

    if-eqz v3, :cond_2

    :cond_1
    move-wide/from16 v18, v6

    goto :goto_2

    :cond_2
    shr-int/lit8 v3, v2, 0x1

    new-array v9, v3, [B

    move v10, v4

    move v11, v10

    :goto_0
    if-ge v10, v3, :cond_1

    invoke-static {v11, v0}, Lyb3/e;->b(ILjava/lang/String;)B

    move-result v12

    aput-byte v12, v9, v10

    add-int/2addr v11, v8

    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    int-to-long v10, v4

    add-long v12, v10, v6

    add-long/2addr v12, v10

    add-long/2addr v12, v10

    int-to-long v14, v2

    add-long v16, v14, v10

    move-wide/from16 v18, v6

    div-long v6, v16, v12

    long-to-int v3, v6

    int-to-long v6, v3

    mul-long/2addr v6, v12

    sub-long/2addr v6, v10

    cmp-long v6, v6, v14

    if-eqz v6, :cond_4

    goto :goto_2

    :cond_4
    new-array v9, v3, [B

    sub-int/2addr v3, v5

    move v6, v4

    move v7, v6

    :goto_1
    if-ge v6, v3, :cond_5

    invoke-static {v7, v0}, Lyb3/e;->b(ILjava/lang/String;)B

    move-result v10

    aput-byte v10, v9, v6

    add-int/lit8 v7, v7, 0x2

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_5
    invoke-static {v7, v0}, Lyb3/e;->b(ILjava/lang/String;)B

    move-result v6

    aput-byte v6, v9, v3

    :goto_2
    if-eqz v9, :cond_7

    return-object v9

    :cond_6
    move-wide/from16 v18, v6

    :cond_7
    iget-boolean v1, v1, Lyb3/f;->c:Z

    if-lez v2, :cond_14

    int-to-long v6, v4

    add-long v9, v6, v18

    add-long/2addr v9, v6

    const v3, 0x7fffffff

    int-to-long v11, v3

    mul-long v13, v9, v11

    const-wide/16 v15, 0x1

    sub-long v17, v11, v15

    mul-long v17, v17, v6

    add-long v13, v17, v13

    int-to-long v3, v2

    invoke-static {v5, v3, v4, v13, v14}, Lyb3/e;->d(IJJ)J

    move-result-wide v19

    add-long/2addr v15, v13

    mul-long v15, v15, v19

    sub-long/2addr v3, v15

    invoke-static {v8, v3, v4, v13, v14}, Lyb3/e;->d(IJJ)J

    move-result-wide v15

    move/from16 v21, v5

    move-wide/from16 v22, v6

    int-to-long v5, v8

    add-long/2addr v13, v5

    mul-long/2addr v13, v15

    sub-long/2addr v3, v13

    const/4 v5, 0x0

    invoke-static {v5, v3, v4, v9, v10}, Lyb3/e;->d(IJJ)J

    move-result-wide v6

    add-long v9, v9, v22

    mul-long/2addr v9, v6

    sub-long/2addr v3, v9

    const-wide/16 v9, 0x0

    cmp-long v3, v3, v9

    if-lez v3, :cond_8

    move/from16 v3, v21

    goto :goto_3

    :cond_8
    move v3, v5

    :goto_3
    mul-long v19, v19, v11

    mul-long/2addr v15, v11

    add-long v15, v15, v19

    add-long/2addr v15, v6

    int-to-long v3, v3

    add-long/2addr v3, v15

    long-to-int v3, v3

    new-array v4, v3, [B

    move v6, v5

    move v7, v6

    move v9, v7

    move v10, v9

    :goto_4
    if-ge v6, v2, :cond_12

    const-string v11, "substring(...)"

    const-string v12, ", but was "

    const v13, 0x7fffffff

    if-ne v9, v13, :cond_c

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    const/16 v10, 0xd

    const/16 v13, 0xa

    if-ne v9, v10, :cond_a

    add-int/lit8 v9, v6, 0x1

    if-ge v9, v2, :cond_9

    invoke-virtual {v0, v9}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-ne v10, v13, :cond_9

    add-int/lit8 v6, v6, 0x2

    goto :goto_5

    :cond_9
    move v6, v9

    goto :goto_5

    :cond_a
    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v9, v13, :cond_b

    add-int/lit8 v6, v6, 0x1

    :goto_5
    move v9, v5

    move v10, v9

    const v13, 0x7fffffff

    goto :goto_8

    :cond_b
    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "Expected a new line at index "

    invoke-static {v6, v2, v12}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0, v6}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_c
    if-ne v10, v13, :cond_10

    move v10, v5

    :goto_6
    if-ge v10, v8, :cond_f

    const-string v14, "  "

    invoke-virtual {v14, v10}, Ljava/lang/String;->charAt(I)C

    move-result v14

    add-int v15, v6, v10

    invoke-virtual {v0, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    invoke-static {v14, v15, v1}, Lva3/d;->f(CCZ)Z

    move-result v14

    if-eqz v14, :cond_d

    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_d
    add-int/2addr v8, v6

    if-le v8, v2, :cond_e

    goto :goto_7

    :cond_e
    move v2, v8

    :goto_7
    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v2, "Expected group separator \"  \" at index "

    invoke-static {v6, v2, v12, v0}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_f
    add-int/lit8 v6, v6, 0x2

    move v10, v5

    :cond_10
    :goto_8
    add-int/lit8 v9, v9, 0x1

    add-int/lit8 v10, v10, 0x1

    add-int/lit8 v12, v2, -0x2

    if-lt v12, v6, :cond_11

    add-int/lit8 v11, v7, 0x1

    invoke-static {v6, v0}, Lyb3/e;->b(ILjava/lang/String;)B

    move-result v12

    aput-byte v12, v4, v7

    add-int/lit8 v6, v6, 0x2

    move v7, v11

    goto/16 :goto_4

    :cond_11
    invoke-virtual {v0, v6, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/lang/NumberFormatException;

    const-string v3, ", but was \""

    const-string v4, "\" of length "

    const-string v5, "Expected exactly 2 hexadecimal digits at index "

    invoke-static {v6, v5, v3, v0, v4}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sub-int/2addr v2, v6

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_12
    if-ne v7, v3, :cond_13

    return-object v4

    :cond_13
    invoke-static {v4, v7}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    const-string v1, "copyOf(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Failed requirement."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final b(ILjava/lang/String;)B
    .locals 5

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    ushr-int/lit8 v1, v0, 0x8

    const/4 v2, 0x0

    if-nez v1, :cond_1

    sget-object v1, Lyb3/e;->b:[I

    aget v0, v1, v0

    if-ltz v0, :cond_1

    add-int/lit8 p0, p0, 0x1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    ushr-int/lit8 v4, v3, 0x8

    if-nez v4, :cond_0

    aget v1, v1, v3

    if-ltz v1, :cond_0

    shl-int/lit8 p0, v0, 0x4

    or-int/2addr p0, v1

    int-to-byte p0, p0

    return p0

    :cond_0
    invoke-static {p0, p1}, Lyb3/e;->c(ILjava/lang/String;)V

    throw v2

    :cond_1
    invoke-static {p0, p1}, Lyb3/e;->c(ILjava/lang/String;)V

    throw v2
.end method

.method public static final c(ILjava/lang/String;)V
    .locals 3

    new-instance v0, Ljava/lang/NumberFormatException;

    const-string v1, "Expected a hexadecimal digit at index "

    const-string v2, ", but was "

    invoke-static {p0, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {p1, p0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(IJJ)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_1

    cmp-long v2, p3, v0

    if-gtz v2, :cond_0

    goto :goto_0

    :cond_0
    int-to-long v0, p0

    add-long/2addr p1, v0

    add-long/2addr p3, v0

    div-long/2addr p1, p3

    return-wide p1

    :cond_1
    :goto_0
    return-wide v0
.end method
