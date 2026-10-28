.class public Ly83/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ly83/a;

.field public static final g:[B

.field public static final h:Ly83/c;


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:I

.field public final d:Ly83/b;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ly83/a;

    sget-object v1, Ly83/b;->w:Ly83/b;

    const/4 v2, 0x0

    const/4 v3, -0x1

    invoke-direct {v0, v2, v2, v3, v1}, Ly83/c;-><init>(ZZILy83/b;)V

    sput-object v0, Ly83/c;->f:Ly83/a;

    const/4 v0, 0x2

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    sput-object v0, Ly83/c;->g:[B

    new-instance v0, Ly83/c;

    const/4 v4, 0x1

    invoke-direct {v0, v4, v2, v3, v1}, Ly83/c;-><init>(ZZILy83/b;)V

    sput-object v0, Ly83/c;->h:Ly83/c;

    new-instance v0, Ly83/c;

    const/16 v3, 0x4c

    invoke-direct {v0, v2, v4, v3, v1}, Ly83/c;-><init>(ZZILy83/b;)V

    new-instance v0, Ly83/c;

    const/16 v3, 0x40

    invoke-direct {v0, v2, v4, v3, v1}, Ly83/c;-><init>(ZZILy83/b;)V

    return-void

    :array_0
    .array-data 1
        0xdt
        0xat
    .end array-data
.end method

.method public constructor <init>(ZZILy83/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ly83/c;->a:Z

    iput-boolean p2, p0, Ly83/c;->b:Z

    iput p3, p0, Ly83/c;->c:I

    iput-object p4, p0, Ly83/c;->d:Ly83/b;

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Failed requirement."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    div-int/lit8 p3, p3, 0x4

    iput p3, p0, Ly83/c;->e:I

    return-void
.end method

.method public static a(Ly83/c;Ljava/lang/CharSequence;II)[B
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move/from16 v2, p2

    :goto_0
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v4

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v5, v0, Ly83/c;->d:Ly83/b;

    iget-boolean v6, v0, Ly83/c;->b:Z

    const-string v7, "source"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v7, v1, Ljava/lang/String;

    const/16 v8, 0xff

    if-eqz v7, :cond_1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v7

    invoke-static {v2, v4, v7}, Lq83/g;->n(III)V

    invoke-virtual {v1, v2, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    const-string v2, "substring(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lyb3/a;->e:Ljava/nio/charset/Charset;

    invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    const-string v2, "getBytes(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_3

    :cond_1
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v7

    invoke-static {v2, v4, v7}, Lq83/g;->n(III)V

    sub-int v7, v4, v2

    new-array v7, v7, [B

    move v9, v3

    :goto_1
    if-ge v2, v4, :cond_3

    invoke-interface {v1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v10

    if-gt v10, v8, :cond_2

    add-int/lit8 v11, v9, 0x1

    int-to-byte v10, v10

    aput-byte v10, v7, v9

    move v9, v11

    goto :goto_2

    :cond_2
    add-int/lit8 v10, v9, 0x1

    const/16 v11, 0x3f

    aput-byte v11, v7, v9

    move v9, v10

    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_3
    move-object v1, v7

    :goto_3
    array-length v2, v1

    array-length v4, v1

    invoke-static {v3, v2, v4}, Lq83/g;->n(III)V

    const/4 v4, 0x1

    const/16 v7, 0x8

    const/4 v9, 0x6

    const/16 v10, 0x3d

    const/4 v11, -0x2

    if-nez v2, :cond_4

    move v12, v3

    goto :goto_6

    :cond_4
    if-eq v2, v4, :cond_25

    if-eqz v6, :cond_7

    move v13, v2

    move v12, v3

    :goto_4
    if-ge v12, v2, :cond_9

    aget-byte v14, v1, v12

    and-int/2addr v14, v8

    sget-object v15, Ly83/d;->b:[I

    aget v14, v15, v14

    if-gez v14, :cond_6

    if-ne v14, v11, :cond_5

    sub-int v12, v2, v12

    sub-int/2addr v13, v12

    goto :goto_5

    :cond_5
    add-int/lit8 v13, v13, -0x1

    :cond_6
    add-int/lit8 v12, v12, 0x1

    goto :goto_4

    :cond_7
    add-int/lit8 v12, v2, -0x1

    aget-byte v12, v1, v12

    if-ne v12, v10, :cond_8

    add-int/lit8 v13, v2, -0x1

    add-int/lit8 v12, v2, -0x2

    aget-byte v12, v1, v12

    if-ne v12, v10, :cond_9

    add-int/lit8 v13, v2, -0x2

    goto :goto_5

    :cond_8
    move v13, v2

    :cond_9
    :goto_5
    int-to-long v12, v13

    int-to-long v14, v9

    mul-long/2addr v12, v14

    int-to-long v14, v7

    div-long/2addr v12, v14

    long-to-int v12, v12

    :goto_6
    new-array v13, v12, [B

    iget-boolean v0, v0, Ly83/c;->a:Z

    if-eqz v0, :cond_a

    sget-object v0, Ly83/d;->d:[I

    goto :goto_7

    :cond_a
    sget-object v0, Ly83/d;->b:[I

    :goto_7
    const/4 v14, -0x8

    move v15, v3

    move/from16 v16, v15

    move/from16 p1, v4

    move/from16 p2, v9

    move/from16 v4, v16

    move v3, v14

    :goto_8
    move/from16 v17, v7

    const-string v7, ") at index "

    const-string v10, "toString(...)"

    const-string v9, "\'("

    if-ge v15, v2, :cond_1b

    if-ne v3, v14, :cond_b

    add-int/lit8 v14, v15, 0x3

    if-ge v14, v2, :cond_b

    add-int/lit8 v18, v15, 0x1

    aget-byte v11, v1, v15

    and-int/2addr v11, v8

    aget v11, v0, v11

    add-int/lit8 v19, v15, 0x2

    move-object/from16 v20, v0

    aget-byte v0, v1, v18

    and-int/2addr v0, v8

    aget v0, v20, v0

    move/from16 v18, v0

    aget-byte v0, v1, v19

    and-int/2addr v0, v8

    aget v0, v20, v0

    add-int/lit8 v19, v15, 0x4

    aget-byte v14, v1, v14

    and-int/2addr v14, v8

    aget v14, v20, v14

    shl-int/lit8 v11, v11, 0x12

    shl-int/lit8 v18, v18, 0xc

    or-int v11, v11, v18

    shl-int/lit8 v0, v0, 0x6

    or-int/2addr v0, v11

    or-int/2addr v0, v14

    if-ltz v0, :cond_c

    add-int/lit8 v7, v4, 0x1

    shr-int/lit8 v9, v0, 0x10

    int-to-byte v9, v9

    aput-byte v9, v13, v4

    add-int/lit8 v9, v4, 0x2

    shr-int/lit8 v10, v0, 0x8

    int-to-byte v10, v10

    aput-byte v10, v13, v7

    add-int/lit8 v4, v4, 0x3

    int-to-byte v0, v0

    aput-byte v0, v13, v9

    move/from16 v7, v17

    move/from16 v15, v19

    move-object/from16 v0, v20

    const/16 v10, 0x3d

    :goto_9
    const/4 v11, -0x2

    const/4 v14, -0x8

    goto :goto_8

    :cond_b
    move-object/from16 v20, v0

    :cond_c
    aget-byte v0, v1, v15

    and-int/2addr v0, v8

    aget v11, v20, v0

    if-gez v11, :cond_19

    const/4 v14, -0x2

    if-ne v11, v14, :cond_17

    const/4 v11, -0x8

    if-eq v3, v11, :cond_16

    const/4 v0, -0x6

    const-string v11, "The padding option is set to ABSENT, but the input has a pad character at index "

    if-eq v3, v0, :cond_14

    const/4 v0, -0x4

    if-eq v3, v0, :cond_e

    if-ne v3, v14, :cond_d

    :goto_a
    add-int/lit8 v15, v15, 0x1

    goto :goto_d

    :cond_d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Unreachable"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_e
    sget-object v0, Ly83/b;->x:Ly83/b;

    if-eq v5, v0, :cond_13

    add-int/lit8 v15, v15, 0x1

    if-nez v6, :cond_f

    goto :goto_c

    :cond_f
    :goto_b
    if-ge v15, v2, :cond_11

    aget-byte v0, v1, v15

    and-int/2addr v0, v8

    sget-object v11, Ly83/d;->b:[I

    aget v0, v11, v0

    const/4 v11, -0x1

    if-eq v0, v11, :cond_10

    goto :goto_c

    :cond_10
    add-int/lit8 v15, v15, 0x1

    goto :goto_b

    :cond_11
    :goto_c
    if-eq v15, v2, :cond_12

    aget-byte v0, v1, v15

    const/16 v14, 0x3d

    if-ne v0, v14, :cond_12

    add-int/lit8 v15, v15, 0x1

    goto :goto_d

    :cond_12
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Missing one pad character at index "

    invoke-static {v15, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v15, v11}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_14
    sget-object v0, Ly83/b;->x:Ly83/b;

    if-eq v5, v0, :cond_15

    goto :goto_a

    :goto_d
    move/from16 v0, p1

    const/4 v14, -0x2

    goto/16 :goto_f

    :cond_15
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-static {v15, v11}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Redundant pad character at index "

    invoke-static {v15, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    const/16 v14, 0x3d

    if-eqz v6, :cond_18

    add-int/lit8 v15, v15, 0x1

    move v10, v14

    move/from16 v7, v17

    move-object/from16 v0, v20

    goto/16 :goto_9

    :cond_18
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid symbol \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static/range {v17 .. v17}, Lva3/d;->c(I)V

    move/from16 v3, v17

    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_19
    const/16 v14, 0x3d

    add-int/lit8 v15, v15, 0x1

    shl-int/lit8 v0, v16, 0x6

    or-int v16, v0, v11

    add-int/lit8 v11, v3, 0x6

    if-ltz v11, :cond_1a

    add-int/lit8 v0, v4, 0x1

    ushr-int v7, v16, v11

    int-to-byte v7, v7

    aput-byte v7, v13, v4

    shl-int v4, p1, v11

    add-int/lit8 v4, v4, -0x1

    and-int v16, v16, v4

    add-int/lit8 v3, v3, -0x2

    move v4, v0

    :goto_e
    move v10, v14

    move-object/from16 v0, v20

    const/16 v7, 0x8

    goto/16 :goto_9

    :cond_1a
    move v3, v11

    goto :goto_e

    :cond_1b
    move v14, v11

    const/4 v0, 0x0

    :goto_f
    if-eq v3, v14, :cond_24

    const/4 v11, -0x8

    if-eq v3, v11, :cond_1d

    if-nez v0, :cond_1d

    sget-object v0, Ly83/b;->w:Ly83/b;

    if-eq v5, v0, :cond_1c

    goto :goto_10

    :cond_1c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The padding option is set to PRESENT, but the input is not properly padded"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1d
    :goto_10
    if-nez v16, :cond_23

    if-nez v6, :cond_1e

    goto :goto_12

    :cond_1e
    :goto_11
    if-ge v15, v2, :cond_20

    aget-byte v0, v1, v15

    and-int/2addr v0, v8

    sget-object v3, Ly83/d;->b:[I

    aget v0, v3, v0

    const/4 v11, -0x1

    if-eq v0, v11, :cond_1f

    goto :goto_12

    :cond_1f
    add-int/lit8 v15, v15, 0x1

    goto :goto_11

    :cond_20
    :goto_12
    if-lt v15, v2, :cond_22

    if-ne v4, v12, :cond_21

    return-object v13

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Check failed."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    aget-byte v0, v1, v15

    and-int/2addr v0, v8

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Symbol \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    int-to-char v3, v0

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v3, 0x8

    invoke-static {v3}, Lva3/d;->c(I)V

    invoke-static {v0, v3}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v15, v15, -0x1

    const-string v0, " is prohibited after the pad character"

    invoke-static {v2, v15, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The pad bits must be zeros"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The last unit of input does not have enough bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Input should have at least 2 symbols for Base64 decoding, startIndex: 0, endIndex: "

    invoke-static {v2, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Ly83/c;[B)Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Ly83/c;->d:Ly83/b;

    array-length v1, p1

    array-length v2, p1

    const/4 v3, 0x0

    invoke-static {v3, v1, v2}, Lq83/g;->n(III)V

    invoke-virtual {p0, v1}, Ly83/c;->c(I)I

    move-result v2

    new-array v4, v2, [B

    array-length v5, p1

    invoke-static {v3, v1, v5}, Lq83/g;->n(III)V

    invoke-virtual {p0, v1}, Ly83/c;->c(I)I

    move-result v5

    if-ltz v2, :cond_d

    if-ltz v5, :cond_c

    if-gt v5, v2, :cond_c

    iget-boolean v2, p0, Ly83/c;->a:Z

    if-eqz v2, :cond_0

    sget-object v2, Ly83/d;->c:[B

    goto :goto_0

    :cond_0
    sget-object v2, Ly83/d;->a:[B

    :goto_0
    iget-boolean v5, p0, Ly83/c;->b:Z

    if-eqz v5, :cond_1

    iget p0, p0, Ly83/c;->e:I

    goto :goto_1

    :cond_1
    const p0, 0x7fffffff

    :goto_1
    move v5, v3

    move v6, v5

    :cond_2
    :goto_2
    add-int/lit8 v7, v5, 0x2

    const/4 v8, 0x1

    if-ge v7, v1, :cond_4

    sub-int v7, v1, v5

    div-int/lit8 v7, v7, 0x3

    invoke-static {v7, p0}, Ljava/lang/Math;->min(II)I

    move-result v7

    move v9, v3

    :goto_3
    if-ge v9, v7, :cond_3

    add-int/lit8 v10, v5, 0x1

    aget-byte v11, p1, v5

    and-int/lit16 v11, v11, 0xff

    add-int/lit8 v12, v5, 0x2

    aget-byte v10, p1, v10

    and-int/lit16 v10, v10, 0xff

    add-int/lit8 v5, v5, 0x3

    aget-byte v12, p1, v12

    and-int/lit16 v12, v12, 0xff

    shl-int/lit8 v11, v11, 0x10

    shl-int/lit8 v10, v10, 0x8

    or-int/2addr v10, v11

    or-int/2addr v10, v12

    add-int/lit8 v11, v6, 0x1

    ushr-int/lit8 v12, v10, 0x12

    aget-byte v12, v2, v12

    aput-byte v12, v4, v6

    add-int/lit8 v12, v6, 0x2

    ushr-int/lit8 v13, v10, 0xc

    and-int/lit8 v13, v13, 0x3f

    aget-byte v13, v2, v13

    aput-byte v13, v4, v11

    add-int/lit8 v11, v6, 0x3

    ushr-int/lit8 v13, v10, 0x6

    and-int/lit8 v13, v13, 0x3f

    aget-byte v13, v2, v13

    aput-byte v13, v4, v12

    add-int/lit8 v6, v6, 0x4

    and-int/lit8 v10, v10, 0x3f

    aget-byte v10, v2, v10

    aput-byte v10, v4, v11

    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_3
    if-ne v7, p0, :cond_2

    if-eq v5, v1, :cond_2

    add-int/lit8 v7, v6, 0x1

    sget-object v9, Ly83/c;->g:[B

    aget-byte v10, v9, v3

    aput-byte v10, v4, v6

    add-int/lit8 v6, v6, 0x2

    aget-byte v8, v9, v8

    aput-byte v8, v4, v7

    goto :goto_2

    :cond_4
    sub-int p0, v1, v5

    const/16 v3, 0x3d

    if-eq p0, v8, :cond_8

    const/4 v8, 0x2

    if-eq p0, v8, :cond_5

    goto :goto_8

    :cond_5
    add-int/lit8 p0, v5, 0x1

    aget-byte v5, p1, v5

    and-int/lit16 v5, v5, 0xff

    aget-byte p0, p1, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p1, v5, 0xa

    shl-int/2addr p0, v8

    or-int/2addr p0, p1

    add-int/lit8 p1, v6, 0x1

    ushr-int/lit8 v5, p0, 0xc

    aget-byte v5, v2, v5

    aput-byte v5, v4, v6

    add-int/lit8 v5, v6, 0x2

    ushr-int/lit8 v8, p0, 0x6

    and-int/lit8 v8, v8, 0x3f

    aget-byte v8, v2, v8

    aput-byte v8, v4, p1

    add-int/lit8 v6, v6, 0x3

    and-int/lit8 p0, p0, 0x3f

    aget-byte p0, v2, p0

    aput-byte p0, v4, v5

    sget-object p0, Ly83/b;->w:Ly83/b;

    if-eq v0, p0, :cond_7

    sget-object p0, Ly83/b;->y:Ly83/b;

    if-ne v0, p0, :cond_6

    goto :goto_5

    :cond_6
    :goto_4
    move v5, v7

    goto :goto_8

    :cond_7
    :goto_5
    aput-byte v3, v4, v6

    goto :goto_4

    :cond_8
    add-int/lit8 p0, v5, 0x1

    aget-byte p1, p1, v5

    and-int/lit16 p1, p1, 0xff

    shl-int/lit8 p1, p1, 0x4

    add-int/lit8 v5, v6, 0x1

    ushr-int/lit8 v7, p1, 0x6

    aget-byte v7, v2, v7

    aput-byte v7, v4, v6

    add-int/lit8 v7, v6, 0x2

    and-int/lit8 p1, p1, 0x3f

    aget-byte p1, v2, p1

    aput-byte p1, v4, v5

    sget-object p1, Ly83/b;->w:Ly83/b;

    if-eq v0, p1, :cond_a

    sget-object p1, Ly83/b;->y:Ly83/b;

    if-ne v0, p1, :cond_9

    goto :goto_7

    :cond_9
    :goto_6
    move v5, p0

    goto :goto_8

    :cond_a
    :goto_7
    add-int/lit8 v6, v6, 0x3

    aput-byte v3, v4, v7

    aput-byte v3, v4, v6

    goto :goto_6

    :goto_8
    if-ne v5, v1, :cond_b

    new-instance p0, Ljava/lang/String;

    sget-object p1, Lyb3/a;->e:Ljava/nio/charset/Charset;

    invoke-direct {p0, v4, p1}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    return-object p0

    :cond_b
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "Check failed."

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_c
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "The destination array does not have enough capacity, destination offset: 0, destination size: "

    const-string v0, ", capacity needed: "

    invoke-static {v2, v5, p1, v0}, Lb9/y;->g(IILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    new-instance p0, Ljava/lang/IndexOutOfBoundsException;

    const-string p1, "destination offset: 0, destination size: "

    invoke-static {v2, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final c(I)I
    .locals 4

    div-int/lit8 v0, p1, 0x3

    rem-int/lit8 p1, p1, 0x3

    const/4 v1, 0x4

    mul-int/2addr v0, v1

    if-eqz p1, :cond_2

    sget-object v2, Ly83/b;->w:Ly83/b;

    iget-object v3, p0, Ly83/c;->d:Ly83/b;

    if-eq v3, v2, :cond_1

    sget-object v2, Ly83/b;->y:Ly83/b;

    if-ne v3, v2, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 v1, p1, 0x1

    :cond_1
    :goto_0
    add-int/2addr v0, v1

    :cond_2
    const-string p1, "Input is too big"

    if-ltz v0, :cond_5

    iget-boolean v1, p0, Ly83/c;->b:Z

    if-eqz v1, :cond_3

    add-int/lit8 v1, v0, -0x1

    iget v2, p0, Ly83/c;->c:I

    const/4 v3, 0x2

    invoke-static {v1, v2, v3, v0}, Ld;->c(IIII)I

    move-result v0

    :cond_3
    if-ltz v0, :cond_4

    return v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
