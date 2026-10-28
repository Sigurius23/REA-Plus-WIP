.class public final Lhu/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lfu/b;
    .locals 40

    move-object/from16 v0, p0

    sget-object v1, Lju/b;->a:[I

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_7f

    const-string v2, "Shift_JIS"

    const-string v3, "ISO-8859-1"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v9, 0x60

    const/4 v10, -0x1

    const/4 v11, 0x1

    const/16 v12, 0x30

    sget-object v13, Liu/a;->E:Liu/a;

    if-ge v5, v8, :cond_3

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v8

    if-lt v8, v12, :cond_0

    const/16 v14, 0x39

    if-gt v8, v14, :cond_0

    move v7, v11

    goto :goto_2

    :cond_0
    if-ge v8, v9, :cond_1

    aget v6, v1, v8

    goto :goto_1

    :cond_1
    move v6, v10

    :goto_1
    if-eq v6, v10, :cond_2

    move v6, v11

    :goto_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_2
    move-object v5, v13

    goto :goto_3

    :cond_3
    if-eqz v6, :cond_4

    sget-object v5, Liu/a;->z:Liu/a;

    goto :goto_3

    :cond_4
    if-eqz v7, :cond_2

    sget-object v5, Liu/a;->y:Liu/a;

    :goto_3
    iget-object v6, v5, Liu/a;->w:[I

    new-instance v7, Lfu/a;

    invoke-direct {v7}, Lfu/a;-><init>()V

    iget v8, v5, Liu/a;->x:I

    const/4 v14, 0x4

    invoke-virtual {v7, v8, v14}, Lfu/a;->b(II)V

    new-instance v8, Lfu/a;

    invoke-direct {v8}, Lfu/a;-><init>()V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    move/from16 v16, v12

    const/16 v17, 0x0

    const/16 v4, 0x8

    const/4 v12, 0x2

    const/16 v9, 0xa

    if-eq v15, v11, :cond_12

    move/from16 v20, v11

    const/4 v11, 0x6

    if-eq v15, v12, :cond_c

    if-eq v15, v14, :cond_b

    if-ne v15, v11, :cond_a

    :try_start_0
    invoke-virtual {v0, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    array-length v2, v1

    rem-int/2addr v2, v12

    if-nez v2, :cond_9

    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    move/from16 v3, v17

    :goto_4
    if-ge v3, v2, :cond_8

    aget-byte v11, v1, v3

    and-int/lit16 v11, v11, 0xff

    add-int/lit8 v15, v3, 0x1

    aget-byte v15, v1, v15

    and-int/lit16 v15, v15, 0xff

    shl-int/2addr v11, v4

    or-int/2addr v11, v15

    const v15, 0x8140

    if-lt v11, v15, :cond_5

    move/from16 v16, v15

    const v15, 0x9ffc

    if-gt v11, v15, :cond_5

    sub-int v11, v11, v16

    goto :goto_5

    :cond_5
    const v15, 0xe040

    if-lt v11, v15, :cond_6

    const v15, 0xebbf

    if-gt v11, v15, :cond_6

    const v15, 0xc140

    sub-int/2addr v11, v15

    goto :goto_5

    :cond_6
    move v11, v10

    :goto_5
    if-eq v11, v10, :cond_7

    shr-int/lit8 v15, v11, 0x8

    mul-int/lit16 v15, v15, 0xc0

    and-int/lit16 v11, v11, 0xff

    add-int/2addr v15, v11

    const/16 v11, 0xd

    invoke-virtual {v8, v15, v11}, Lfu/a;->b(II)V

    add-int/lit8 v3, v3, 0x2

    goto :goto_4

    :cond_7
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Invalid byte sequence"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    move/from16 v19, v4

    goto/16 :goto_c

    :cond_9
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Kanji byte size not even"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Lcom/google/zxing/WriterException;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_a
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Invalid mode: "

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :try_start_1
    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v1
    :try_end_1
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_1 .. :try_end_1} :catch_1

    array-length v2, v1

    move/from16 v3, v17

    :goto_6
    if-ge v3, v2, :cond_8

    aget-byte v11, v1, v3

    invoke-virtual {v8, v11, v4}, Lfu/a;->b(II)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_6

    :catch_1
    move-exception v0

    new-instance v1, Lcom/google/zxing/WriterException;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_c
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    move/from16 v3, v17

    :goto_7
    if-ge v3, v2, :cond_8

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v15

    const/16 v12, 0x60

    if-ge v15, v12, :cond_d

    aget v15, v1, v15

    goto :goto_8

    :cond_d
    move v15, v10

    :goto_8
    if-eq v15, v10, :cond_11

    move/from16 v19, v4

    add-int/lit8 v4, v3, 0x1

    if-ge v4, v2, :cond_10

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    if-ge v4, v12, :cond_e

    aget v4, v1, v4

    goto :goto_9

    :cond_e
    move v4, v10

    :goto_9
    if-eq v4, v10, :cond_f

    mul-int/lit8 v15, v15, 0x2d

    add-int/2addr v15, v4

    const/16 v4, 0xb

    invoke-virtual {v8, v15, v4}, Lfu/a;->b(II)V

    add-int/lit8 v3, v3, 0x2

    :goto_a
    move/from16 v4, v19

    const/4 v12, 0x2

    goto :goto_7

    :cond_f
    new-instance v0, Lcom/google/zxing/WriterException;

    invoke-direct {v0}, Lcom/google/zxing/WriterException;-><init>()V

    throw v0

    :cond_10
    invoke-virtual {v8, v15, v11}, Lfu/a;->b(II)V

    move v3, v4

    goto :goto_a

    :cond_11
    new-instance v0, Lcom/google/zxing/WriterException;

    invoke-direct {v0}, Lcom/google/zxing/WriterException;-><init>()V

    throw v0

    :cond_12
    move/from16 v19, v4

    move/from16 v20, v11

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    move/from16 v2, v17

    :goto_b
    if-ge v2, v1, :cond_15

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    add-int/lit8 v3, v3, -0x30

    add-int/lit8 v4, v2, 0x2

    if-ge v4, v1, :cond_13

    add-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    add-int/lit8 v11, v11, -0x30

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    add-int/lit8 v4, v4, -0x30

    mul-int/lit8 v3, v3, 0x64

    mul-int/2addr v11, v9

    add-int/2addr v11, v3

    add-int/2addr v11, v4

    invoke-virtual {v8, v11, v9}, Lfu/a;->b(II)V

    add-int/lit8 v2, v2, 0x3

    goto :goto_b

    :cond_13
    add-int/lit8 v2, v2, 0x1

    if-ge v2, v1, :cond_14

    invoke-virtual {v0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v2

    add-int/lit8 v2, v2, -0x30

    mul-int/lit8 v3, v3, 0xa

    add-int/2addr v3, v2

    const/4 v2, 0x7

    invoke-virtual {v8, v3, v2}, Lfu/a;->b(II)V

    move v2, v4

    goto :goto_b

    :cond_14
    invoke-virtual {v8, v3, v14}, Lfu/a;->b(II)V

    goto :goto_b

    :cond_15
    :goto_c
    sget-object v1, Liu/b;->d:[Liu/b;

    aget-object v1, v1, v17

    iget v2, v7, Lfu/a;->x:I

    iget v1, v1, Liu/b;->a:I

    const/16 v3, 0x1a

    const/16 v4, 0x9

    if-gt v1, v4, :cond_16

    move/from16 v1, v17

    goto :goto_d

    :cond_16
    if-gt v1, v3, :cond_17

    move/from16 v1, v20

    goto :goto_d

    :cond_17
    const/4 v1, 0x2

    :goto_d
    aget v1, v6, v1

    add-int/2addr v1, v2

    iget v2, v8, Lfu/a;->x:I

    add-int/2addr v1, v2

    move/from16 v2, v20

    :goto_e
    const-string v11, "Data too big"

    const/16 v12, 0x28

    if-gt v2, v12, :cond_7e

    sget-object v15, Liu/b;->d:[Liu/b;

    if-lez v2, :cond_7d

    if-gt v2, v12, :cond_7d

    sget-object v15, Liu/b;->d:[Liu/b;

    add-int/lit8 v16, v2, -0x1

    aget-object v15, v15, v16

    move/from16 v16, v9

    iget v9, v15, Liu/b;->c:I

    iget-object v10, v15, Liu/b;->b:[Lai/j;

    invoke-static/range {v20 .. v20}, Le4/p;->e(I)I

    move-result v23

    aget-object v10, v10, v23

    iget v14, v10, Lai/j;->w:I

    iget-object v10, v10, Lai/j;->x:Ljava/lang/Object;

    check-cast v10, [Lc9/k;

    array-length v12, v10

    move/from16 v3, v17

    move/from16 v26, v3

    :goto_f
    if-ge v3, v12, :cond_18

    aget-object v4, v10, v3

    iget v4, v4, Lc9/k;->x:I

    add-int v26, v26, v4

    add-int/lit8 v3, v3, 0x1

    const/16 v4, 0x9

    goto :goto_f

    :cond_18
    mul-int v26, v26, v14

    sub-int v9, v9, v26

    const/16 v18, 0x7

    add-int/lit8 v12, v1, 0x7

    div-int/lit8 v12, v12, 0x8

    if-lt v9, v12, :cond_7c

    iget v1, v7, Lfu/a;->x:I

    iget v2, v15, Liu/b;->a:I

    const/16 v3, 0x9

    if-gt v2, v3, :cond_19

    move/from16 v2, v17

    goto :goto_10

    :cond_19
    const/16 v3, 0x1a

    if-gt v2, v3, :cond_1a

    move/from16 v2, v20

    goto :goto_10

    :cond_1a
    const/4 v2, 0x2

    :goto_10
    aget v2, v6, v2

    add-int/2addr v2, v1

    iget v1, v8, Lfu/a;->x:I

    add-int/2addr v2, v1

    move/from16 v1, v20

    :goto_11
    const/16 v3, 0x28

    if-gt v1, v3, :cond_7b

    sget-object v4, Liu/b;->d:[Liu/b;

    if-lez v1, :cond_7a

    if-gt v1, v3, :cond_7a

    sget-object v4, Liu/b;->d:[Liu/b;

    add-int/lit8 v9, v1, -0x1

    aget-object v4, v4, v9

    iget v9, v4, Liu/b;->c:I

    iget v10, v4, Liu/b;->a:I

    iget-object v12, v4, Liu/b;->b:[Lai/j;

    invoke-static/range {v20 .. v20}, Le4/p;->e(I)I

    move-result v14

    aget-object v14, v12, v14

    iget v15, v14, Lai/j;->w:I

    iget-object v14, v14, Lai/j;->x:Ljava/lang/Object;

    check-cast v14, [Lc9/k;

    array-length v3, v14

    move/from16 v0, v17

    move/from16 v26, v0

    :goto_12
    if-ge v0, v3, :cond_1b

    move/from16 v28, v0

    aget-object v0, v14, v28

    iget v0, v0, Lc9/k;->x:I

    add-int v26, v26, v0

    add-int/lit8 v0, v28, 0x1

    goto :goto_12

    :cond_1b
    mul-int v26, v26, v15

    sub-int v9, v9, v26

    const/16 v18, 0x7

    add-int/lit8 v0, v2, 0x7

    div-int/lit8 v0, v0, 0x8

    if-lt v9, v0, :cond_79

    iget v0, v4, Liu/b;->c:I

    new-instance v1, Lfu/a;

    invoke-direct {v1}, Lfu/a;-><init>()V

    iget v2, v7, Lfu/a;->x:I

    invoke-virtual {v1, v2}, Lfu/a;->c(I)V

    move/from16 v3, v17

    :goto_13
    if-ge v3, v2, :cond_1c

    invoke-virtual {v7, v3}, Lfu/a;->d(I)Z

    move-result v9

    invoke-virtual {v1, v9}, Lfu/a;->a(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_13

    :cond_1c
    if-ne v5, v13, :cond_1d

    invoke-virtual {v8}, Lfu/a;->e()I

    move-result v2

    :goto_14
    const/16 v3, 0x9

    goto :goto_15

    :cond_1d
    invoke-virtual/range {p0 .. p0}, Ljava/lang/String;->length()I

    move-result v2

    goto :goto_14

    :goto_15
    if-gt v10, v3, :cond_1e

    move/from16 v3, v17

    goto :goto_16

    :cond_1e
    const/16 v9, 0x1a

    if-gt v10, v9, :cond_1f

    move/from16 v3, v20

    goto :goto_16

    :cond_1f
    const/4 v3, 0x2

    :goto_16
    aget v3, v6, v3

    shl-int v5, v20, v3

    if-ge v2, v5, :cond_78

    invoke-virtual {v1, v2, v3}, Lfu/a;->b(II)V

    iget v2, v8, Lfu/a;->x:I

    iget v3, v1, Lfu/a;->x:I

    add-int/2addr v3, v2

    invoke-virtual {v1, v3}, Lfu/a;->c(I)V

    move/from16 v3, v17

    :goto_17
    if-ge v3, v2, :cond_20

    invoke-virtual {v8, v3}, Lfu/a;->d(I)Z

    move-result v5

    invoke-virtual {v1, v5}, Lfu/a;->a(Z)V

    add-int/lit8 v3, v3, 0x1

    goto :goto_17

    :cond_20
    invoke-static/range {v20 .. v20}, Le4/p;->e(I)I

    move-result v2

    aget-object v2, v12, v2

    iget v3, v2, Lai/j;->w:I

    iget-object v2, v2, Lai/j;->x:Ljava/lang/Object;

    check-cast v2, [Lc9/k;

    array-length v5, v2

    move/from16 v6, v17

    move v7, v6

    :goto_18
    if-ge v6, v5, :cond_21

    aget-object v8, v2, v6

    iget v8, v8, Lc9/k;->x:I

    add-int/2addr v7, v8

    add-int/lit8 v6, v6, 0x1

    goto :goto_18

    :cond_21
    mul-int/2addr v7, v3

    sub-int v3, v0, v7

    shl-int/lit8 v5, v3, 0x3

    iget v6, v1, Lfu/a;->x:I

    if-gt v6, v5, :cond_77

    move/from16 v6, v17

    :goto_19
    const/4 v7, 0x4

    if-ge v6, v7, :cond_22

    iget v7, v1, Lfu/a;->x:I

    if-ge v7, v5, :cond_22

    move/from16 v7, v17

    invoke-virtual {v1, v7}, Lfu/a;->a(Z)V

    add-int/lit8 v6, v6, 0x1

    goto :goto_19

    :cond_22
    move/from16 v7, v17

    iget v6, v1, Lfu/a;->x:I

    const/16 v18, 0x7

    and-int/lit8 v6, v6, 0x7

    if-lez v6, :cond_23

    move/from16 v8, v19

    :goto_1a
    if-ge v6, v8, :cond_23

    invoke-virtual {v1, v7}, Lfu/a;->a(Z)V

    add-int/lit8 v6, v6, 0x1

    const/4 v7, 0x0

    const/16 v8, 0x8

    goto :goto_1a

    :cond_23
    invoke-virtual {v1}, Lfu/a;->e()I

    move-result v6

    sub-int v6, v3, v6

    const/4 v7, 0x0

    :goto_1b
    if-ge v7, v6, :cond_25

    and-int/lit8 v9, v7, 0x1

    if-nez v9, :cond_24

    const/16 v8, 0xec

    :goto_1c
    const/16 v9, 0x8

    goto :goto_1d

    :cond_24
    const/16 v8, 0x11

    goto :goto_1c

    :goto_1d
    invoke-virtual {v1, v8, v9}, Lfu/a;->b(II)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_1b

    :cond_25
    iget v6, v1, Lfu/a;->x:I

    if-ne v6, v5, :cond_76

    array-length v5, v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    :goto_1e
    if-ge v6, v5, :cond_26

    aget-object v9, v2, v6

    iget v9, v9, Lc9/k;->x:I

    add-int/2addr v7, v9

    add-int/lit8 v6, v6, 0x1

    goto :goto_1e

    :cond_26
    invoke-virtual {v1}, Lfu/a;->e()I

    move-result v2

    if-ne v2, v3, :cond_75

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    :goto_1f
    if-ge v5, v7, :cond_4c

    move/from16 v12, v20

    new-array v13, v12, [I

    new-array v14, v12, [I

    if-ge v5, v7, :cond_4b

    rem-int v12, v0, v7

    sub-int v15, v7, v12

    div-int v18, v0, v7

    add-int/lit8 v24, v18, 0x1

    div-int v25, v3, v7

    add-int/lit8 v26, v25, 0x1

    const/16 p0, 0x11

    sub-int v8, v18, v25

    move/from16 v27, v10

    sub-int v10, v24, v26

    if-ne v8, v10, :cond_4a

    move/from16 v18, v8

    add-int v8, v15, v12

    if-ne v7, v8, :cond_49

    add-int v8, v25, v18

    mul-int/2addr v8, v15

    add-int v24, v26, v10

    mul-int v24, v24, v12

    add-int v8, v24, v8

    if-ne v0, v8, :cond_48

    if-ge v5, v15, :cond_27

    const/16 v17, 0x0

    aput v25, v13, v17

    aput v18, v14, v17

    goto :goto_20

    :cond_27
    const/16 v17, 0x0

    aput v26, v13, v17

    aput v10, v14, v17

    :goto_20
    aget v8, v13, v17

    new-array v10, v8, [B

    shl-int/lit8 v12, v6, 0x3

    const/4 v15, 0x0

    :goto_21
    if-ge v15, v8, :cond_2a

    move/from16 v18, v5

    move/from16 v24, v7

    move-object/from16 v25, v13

    const/4 v5, 0x0

    const/4 v7, 0x0

    :goto_22
    const/16 v13, 0x8

    if-ge v5, v13, :cond_29

    invoke-virtual {v1, v12}, Lfu/a;->d(I)Z

    move-result v13

    if-eqz v13, :cond_28

    rsub-int/lit8 v13, v5, 0x7

    const/16 v20, 0x1

    shl-int v13, v20, v13

    or-int/2addr v7, v13

    :cond_28
    add-int/lit8 v12, v12, 0x1

    add-int/lit8 v5, v5, 0x1

    goto :goto_22

    :cond_29
    int-to-byte v5, v7

    aput-byte v5, v10, v15

    add-int/lit8 v15, v15, 0x1

    move/from16 v5, v18

    move/from16 v7, v24

    move-object/from16 v13, v25

    goto :goto_21

    :cond_2a
    move/from16 v18, v5

    move/from16 v24, v7

    move-object/from16 v25, v13

    const/16 v17, 0x0

    aget v5, v14, v17

    add-int v7, v8, v5

    new-array v12, v7, [I

    const/4 v13, 0x0

    :goto_23
    if-ge v13, v8, :cond_2b

    aget-byte v14, v10, v13

    and-int/lit16 v14, v14, 0xff

    aput v14, v12, v13

    add-int/lit8 v13, v13, 0x1

    goto :goto_23

    :cond_2b
    sget-object v13, Lgu/a;->g:Lgu/a;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Lgu/b;

    move/from16 v20, v7

    const/16 v26, 0x1

    filled-new-array/range {v26 .. v26}, [I

    move-result-object v7

    invoke-direct {v15, v13, v7}, Lgu/b;-><init>(Lgu/a;[I)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    if-eqz v5, :cond_47

    sub-int v7, v20, v5

    if-lez v7, :cond_46

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v15

    move-object/from16 v28, v1

    const-string v1, "GenericGFPolys do not have same GenericGF field"

    if-lt v5, v15, :cond_34

    move/from16 v15, v26

    invoke-static {v14, v15}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v20

    check-cast v20, Lgu/b;

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v26

    move-object/from16 v29, v20

    move/from16 v15, v26

    :goto_24
    if-gt v15, v5, :cond_34

    add-int/lit8 v26, v15, -0x1

    move/from16 v30, v15

    iget v15, v13, Lgu/a;->f:I

    add-int v26, v26, v15

    iget-object v15, v13, Lgu/a;->a:[I

    aget v15, v15, v26

    move-object/from16 v26, v4

    const/4 v4, 0x1

    filled-new-array {v4, v15}, [I

    move-result-object v15

    const/16 v17, 0x0

    aget v4, v15, v17

    if-nez v4, :cond_2e

    move/from16 v31, v0

    const/4 v0, 0x2

    const/4 v4, 0x1

    :goto_25
    if-ge v4, v0, :cond_2c

    aget v21, v15, v4

    if-nez v21, :cond_2c

    add-int/lit8 v4, v4, 0x1

    goto :goto_25

    :cond_2c
    if-ne v4, v0, :cond_2d

    const/4 v0, 0x0

    filled-new-array {v0}, [I

    move-result-object v15

    move/from16 v32, v3

    move/from16 v33, v6

    :goto_26
    move-object/from16 v3, v29

    goto :goto_27

    :cond_2d
    const/4 v0, 0x0

    move/from16 v32, v3

    rsub-int/lit8 v3, v4, 0x2

    move/from16 v33, v6

    new-array v6, v3, [I

    invoke-static {v15, v4, v6, v0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v15, v6

    goto :goto_26

    :cond_2e
    move/from16 v31, v0

    move/from16 v32, v3

    move/from16 v33, v6

    const/4 v0, 0x0

    goto :goto_26

    :goto_27
    iget-object v4, v3, Lgu/b;->a:Lgu/a;

    invoke-virtual {v4, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_33

    invoke-virtual {v3}, Lgu/b;->c()Z

    move-result v6

    if-nez v6, :cond_32

    aget v6, v15, v0

    if-nez v6, :cond_2f

    goto :goto_2a

    :cond_2f
    iget-object v0, v3, Lgu/b;->b:[I

    array-length v3, v0

    array-length v6, v15

    add-int v29, v3, v6

    move-object/from16 v34, v0

    const/16 v20, 0x1

    add-int/lit8 v0, v29, -0x1

    new-array v0, v0, [I

    move-object/from16 v29, v15

    const/4 v15, 0x0

    :goto_28
    if-ge v15, v3, :cond_31

    move/from16 v35, v3

    aget v3, v34, v15

    move/from16 v36, v15

    const/4 v15, 0x0

    :goto_29
    if-ge v15, v6, :cond_30

    add-int v37, v36, v15

    aget v38, v0, v37

    move/from16 v39, v6

    aget v6, v29, v15

    invoke-virtual {v4, v3, v6}, Lgu/a;->a(II)I

    move-result v6

    xor-int v6, v38, v6

    aput v6, v0, v37

    add-int/lit8 v15, v15, 0x1

    move/from16 v6, v39

    goto :goto_29

    :cond_30
    move/from16 v39, v6

    add-int/lit8 v15, v36, 0x1

    move/from16 v3, v35

    goto :goto_28

    :cond_31
    new-instance v3, Lgu/b;

    invoke-direct {v3, v4, v0}, Lgu/b;-><init>(Lgu/a;[I)V

    move-object v0, v3

    goto :goto_2b

    :cond_32
    :goto_2a
    iget-object v0, v4, Lgu/a;->c:Lgu/b;

    :goto_2b
    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v15, v30, 0x1

    move-object/from16 v29, v0

    move-object/from16 v4, v26

    move/from16 v0, v31

    move/from16 v3, v32

    move/from16 v6, v33

    goto/16 :goto_24

    :cond_33
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_34
    move/from16 v31, v0

    move/from16 v32, v3

    move-object/from16 v26, v4

    move/from16 v33, v6

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgu/b;

    new-array v3, v7, [I

    const/4 v4, 0x0

    invoke-static {v12, v4, v3, v4, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz v7, :cond_45

    const/4 v15, 0x1

    if-le v7, v15, :cond_37

    aget v6, v3, v4

    if-nez v6, :cond_37

    const/4 v4, 0x1

    :goto_2c
    if-ge v4, v7, :cond_35

    aget v6, v3, v4

    if-nez v6, :cond_35

    add-int/lit8 v4, v4, 0x1

    goto :goto_2c

    :cond_35
    if-ne v4, v7, :cond_36

    const/4 v6, 0x0

    filled-new-array {v6}, [I

    move-result-object v3

    goto :goto_2d

    :cond_36
    const/4 v6, 0x0

    sub-int v14, v7, v4

    new-array v15, v14, [I

    invoke-static {v3, v4, v15, v6, v14}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object v3, v15

    :cond_37
    :goto_2d
    if-ltz v5, :cond_44

    array-length v4, v3

    add-int v6, v4, v5

    new-array v6, v6, [I

    const/4 v14, 0x0

    :goto_2e
    if-ge v14, v4, :cond_38

    aget v15, v3, v14

    move-object/from16 v29, v3

    const/4 v3, 0x1

    invoke-virtual {v13, v15, v3}, Lgu/a;->a(II)I

    move-result v15

    aput v15, v6, v14

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v3, v29

    goto :goto_2e

    :cond_38
    new-instance v3, Lgu/b;

    invoke-direct {v3, v13, v6}, Lgu/b;-><init>(Lgu/a;[I)V

    iget-object v4, v0, Lgu/b;->a:Lgu/a;

    iget-object v6, v0, Lgu/b;->b:[I

    invoke-virtual {v13, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    iget-object v14, v13, Lgu/a;->c:Lgu/b;

    if-eqz v4, :cond_43

    invoke-virtual {v0}, Lgu/b;->c()Z

    move-result v1

    if-nez v1, :cond_42

    invoke-virtual {v0}, Lgu/b;->b()I

    move-result v1

    array-length v4, v6

    const/16 v20, 0x1

    add-int/lit8 v4, v4, -0x1

    sub-int/2addr v4, v1

    aget v1, v6, v4

    if-eqz v1, :cond_41

    iget-object v4, v13, Lgu/a;->a:[I

    iget v15, v13, Lgu/a;->d:I

    move/from16 v29, v1

    iget-object v1, v13, Lgu/a;->b:[I

    aget v1, v1, v29

    sub-int/2addr v15, v1

    add-int/lit8 v15, v15, -0x1

    aget v1, v4, v15

    move-object v4, v14

    :goto_2f
    invoke-virtual {v3}, Lgu/b;->b()I

    move-result v15

    move/from16 v29, v7

    invoke-virtual {v0}, Lgu/b;->b()I

    move-result v7

    if-lt v15, v7, :cond_3e

    invoke-virtual {v3}, Lgu/b;->c()Z

    move-result v7

    if-nez v7, :cond_3e

    invoke-virtual {v3}, Lgu/b;->b()I

    move-result v7

    invoke-virtual {v0}, Lgu/b;->b()I

    move-result v15

    sub-int/2addr v7, v15

    invoke-virtual {v3}, Lgu/b;->b()I

    move-result v15

    move/from16 v30, v7

    iget-object v7, v3, Lgu/b;->b:[I

    move-object/from16 v34, v14

    array-length v14, v7

    const/16 v20, 0x1

    add-int/lit8 v14, v14, -0x1

    sub-int/2addr v14, v15

    aget v7, v7, v14

    invoke-virtual {v13, v7, v1}, Lgu/a;->a(II)I

    move-result v7

    iget-object v14, v0, Lgu/b;->a:Lgu/a;

    if-ltz v30, :cond_3d

    if-nez v7, :cond_39

    iget-object v14, v14, Lgu/a;->c:Lgu/b;

    move-object/from16 v35, v0

    move/from16 v36, v1

    goto :goto_31

    :cond_39
    array-length v15, v6

    move-object/from16 v35, v0

    add-int v0, v15, v30

    new-array v0, v0, [I

    move/from16 v36, v1

    const/4 v1, 0x0

    :goto_30
    if-ge v1, v15, :cond_3a

    move/from16 v37, v1

    aget v1, v6, v37

    invoke-virtual {v14, v1, v7}, Lgu/a;->a(II)I

    move-result v1

    aput v1, v0, v37

    add-int/lit8 v1, v37, 0x1

    goto :goto_30

    :cond_3a
    new-instance v1, Lgu/b;

    invoke-direct {v1, v14, v0}, Lgu/b;-><init>(Lgu/a;[I)V

    move-object v14, v1

    :goto_31
    if-ltz v30, :cond_3c

    if-nez v7, :cond_3b

    move-object/from16 v1, v34

    goto :goto_32

    :cond_3b
    add-int/lit8 v0, v30, 0x1

    new-array v0, v0, [I

    const/16 v17, 0x0

    aput v7, v0, v17

    new-instance v1, Lgu/b;

    invoke-direct {v1, v13, v0}, Lgu/b;-><init>(Lgu/a;[I)V

    :goto_32
    invoke-virtual {v4, v1}, Lgu/b;->a(Lgu/b;)Lgu/b;

    move-result-object v4

    invoke-virtual {v3, v14}, Lgu/b;->a(Lgu/b;)Lgu/b;

    move-result-object v3

    move/from16 v7, v29

    move-object/from16 v14, v34

    move-object/from16 v0, v35

    move/from16 v1, v36

    goto/16 :goto_2f

    :cond_3c
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_3d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_3e
    filled-new-array {v4, v3}, [Lgu/b;

    move-result-object v0

    const/16 v20, 0x1

    aget-object v0, v0, v20

    iget-object v0, v0, Lgu/b;->b:[I

    array-length v1, v0

    sub-int v1, v5, v1

    const/4 v3, 0x0

    :goto_33
    if-ge v3, v1, :cond_3f

    add-int v7, v29, v3

    const/4 v4, 0x0

    aput v4, v12, v7

    add-int/lit8 v3, v3, 0x1

    goto :goto_33

    :cond_3f
    const/4 v4, 0x0

    add-int v7, v29, v1

    array-length v1, v0

    invoke-static {v0, v4, v12, v7, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-array v0, v5, [B

    const/4 v1, 0x0

    :goto_34
    if-ge v1, v5, :cond_40

    add-int v3, v8, v1

    aget v3, v12, v3

    int-to-byte v3, v3

    aput-byte v3, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_34

    :cond_40
    new-instance v1, Lju/a;

    invoke-direct {v1, v10, v0}, Lju/a;-><init>([B[B)V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v9, v8}, Ljava/lang/Math;->max(II)I

    move-result v9

    invoke-static {v11, v5}, Ljava/lang/Math;->max(II)I

    move-result v11

    const/16 v17, 0x0

    aget v0, v25, v17

    add-int v6, v33, v0

    add-int/lit8 v5, v18, 0x1

    move/from16 v7, v24

    move-object/from16 v4, v26

    move/from16 v10, v27

    move-object/from16 v1, v28

    move/from16 v0, v31

    move/from16 v3, v32

    const/16 v20, 0x1

    goto/16 :goto_1f

    :cond_41
    new-instance v0, Ljava/lang/ArithmeticException;

    invoke-direct {v0}, Ljava/lang/ArithmeticException;-><init>()V

    throw v0

    :cond_42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Divide by 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_44
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_45
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_46
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No data bytes provided"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_47
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No error correction bytes"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_48
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Total bytes mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_49
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "RS blocks mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4a
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "EC bytes mismatch"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4b
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Block ID too large"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4c
    move/from16 v31, v0

    move v0, v3

    move-object/from16 v26, v4

    move/from16 v27, v10

    const/16 p0, 0x11

    if-ne v0, v6, :cond_74

    new-instance v0, Lfu/a;

    invoke-direct {v0}, Lfu/a;-><init>()V

    const/4 v1, 0x0

    :goto_35
    if-ge v1, v9, :cond_4f

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4d
    :goto_36
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lju/a;

    iget-object v4, v4, Lju/a;->a:[B

    array-length v5, v4

    if-ge v1, v5, :cond_4d

    aget-byte v4, v4, v1

    const/16 v8, 0x8

    invoke-virtual {v0, v4, v8}, Lfu/a;->b(II)V

    goto :goto_36

    :cond_4e
    add-int/lit8 v1, v1, 0x1

    goto :goto_35

    :cond_4f
    const/4 v1, 0x0

    :goto_37
    if-ge v1, v11, :cond_52

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_50
    :goto_38
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_51

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lju/a;

    iget-object v4, v4, Lju/a;->b:[B

    array-length v5, v4

    if-ge v1, v5, :cond_50

    aget-byte v4, v4, v1

    const/16 v8, 0x8

    invoke-virtual {v0, v4, v8}, Lfu/a;->b(II)V

    goto :goto_38

    :cond_51
    add-int/lit8 v1, v1, 0x1

    goto :goto_37

    :cond_52
    invoke-virtual {v0}, Lfu/a;->e()I

    move-result v1

    move/from16 v2, v31

    if-ne v2, v1, :cond_73

    const/16 v23, 0x4

    mul-int/lit8 v10, v27, 0x4

    add-int/lit8 v10, v10, 0x11

    new-instance v1, Lcom/google/android/material/datepicker/n;

    invoke-direct {v1, v10, v10}, Lcom/google/android/material/datepicker/n;-><init>(II)V

    iget v2, v1, Lcom/google/android/material/datepicker/n;->y:I

    const v3, 0x7fffffff

    const/4 v7, 0x0

    const/4 v10, -0x1

    :goto_39
    iget v4, v1, Lcom/google/android/material/datepicker/n;->x:I

    const/16 v12, 0x8

    if-ge v7, v12, :cond_6b

    move-object/from16 v5, v26

    const/4 v15, 0x1

    invoke-static {v0, v15, v5, v7, v1}, Lju/b;->b(Lfu/a;ILiu/b;ILcom/google/android/material/datepicker/n;)V

    invoke-static {v1, v15}, Lju/b;->a(Lcom/google/android/material/datepicker/n;Z)I

    move-result v6

    const/4 v8, 0x0

    invoke-static {v1, v8}, Lju/b;->a(Lcom/google/android/material/datepicker/n;Z)I

    move-result v9

    add-int/2addr v9, v6

    iget-object v6, v1, Lcom/google/android/material/datepicker/n;->z:Ljava/lang/Object;

    check-cast v6, [[B

    const/4 v8, 0x0

    const/4 v11, 0x0

    :goto_3a
    add-int/lit8 v13, v2, -0x1

    if-ge v8, v13, :cond_55

    aget-object v13, v6, v8

    const/4 v14, 0x0

    :goto_3b
    add-int/lit8 v15, v4, -0x1

    if-ge v14, v15, :cond_54

    aget-byte v15, v13, v14

    add-int/lit8 v18, v14, 0x1

    aget-byte v12, v13, v18

    if-ne v15, v12, :cond_53

    add-int/lit8 v12, v8, 0x1

    aget-object v12, v6, v12

    aget-byte v14, v12, v14

    if-ne v15, v14, :cond_53

    aget-byte v12, v12, v18

    if-ne v15, v12, :cond_53

    add-int/lit8 v11, v11, 0x1

    :cond_53
    move/from16 v14, v18

    const/16 v12, 0x8

    goto :goto_3b

    :cond_54
    add-int/lit8 v8, v8, 0x1

    const/16 v12, 0x8

    goto :goto_3a

    :cond_55
    mul-int/lit8 v11, v11, 0x3

    add-int/2addr v11, v9

    const/4 v8, 0x0

    const/4 v9, 0x0

    :goto_3c
    if-ge v8, v2, :cond_66

    move v12, v9

    const/4 v9, 0x0

    :goto_3d
    if-ge v9, v4, :cond_65

    aget-object v13, v6, v8

    add-int/lit8 v14, v9, 0x6

    if-ge v14, v4, :cond_5c

    aget-byte v15, v13, v9

    move/from16 v18, v7

    const/4 v7, 0x1

    if-ne v15, v7, :cond_5b

    add-int/lit8 v15, v9, 0x1

    aget-byte v15, v13, v15

    if-nez v15, :cond_5b

    add-int/lit8 v15, v9, 0x2

    aget-byte v15, v13, v15

    if-ne v15, v7, :cond_5b

    add-int/lit8 v15, v9, 0x3

    aget-byte v15, v13, v15

    if-ne v15, v7, :cond_5b

    add-int/lit8 v15, v9, 0x4

    aget-byte v15, v13, v15

    if-ne v15, v7, :cond_5b

    add-int/lit8 v15, v9, 0x5

    aget-byte v15, v13, v15

    if-nez v15, :cond_5b

    aget-byte v14, v13, v14

    if-ne v14, v7, :cond_5b

    add-int/lit8 v14, v9, -0x4

    const/4 v15, 0x0

    invoke-static {v14, v15}, Ljava/lang/Math;->max(II)I

    move-result v14

    array-length v15, v13

    invoke-static {v9, v15}, Ljava/lang/Math;->min(II)I

    move-result v15

    :goto_3e
    if-ge v14, v15, :cond_57

    move/from16 v22, v9

    aget-byte v9, v13, v14

    if-ne v9, v7, :cond_56

    const/4 v7, 0x0

    goto :goto_3f

    :cond_56
    add-int/lit8 v14, v14, 0x1

    move/from16 v9, v22

    const/4 v7, 0x1

    goto :goto_3e

    :cond_57
    move/from16 v22, v9

    const/4 v7, 0x1

    :goto_3f
    if-nez v7, :cond_5a

    add-int/lit8 v9, v22, 0x7

    add-int/lit8 v7, v22, 0xb

    const/4 v15, 0x0

    invoke-static {v9, v15}, Ljava/lang/Math;->max(II)I

    move-result v9

    array-length v14, v13

    invoke-static {v7, v14}, Ljava/lang/Math;->min(II)I

    move-result v7

    :goto_40
    if-ge v9, v7, :cond_59

    aget-byte v14, v13, v9

    const/4 v15, 0x1

    if-ne v14, v15, :cond_58

    const/4 v7, 0x0

    goto :goto_41

    :cond_58
    add-int/lit8 v9, v9, 0x1

    goto :goto_40

    :cond_59
    const/4 v7, 0x1

    :goto_41
    if-eqz v7, :cond_5d

    :cond_5a
    add-int/lit8 v12, v12, 0x1

    goto :goto_43

    :cond_5b
    :goto_42
    move/from16 v22, v9

    goto :goto_43

    :cond_5c
    move/from16 v18, v7

    goto :goto_42

    :cond_5d
    :goto_43
    add-int/lit8 v7, v8, 0x6

    if-ge v7, v2, :cond_63

    aget-object v9, v6, v8

    aget-byte v9, v9, v22

    const/4 v15, 0x1

    if-ne v9, v15, :cond_63

    add-int/lit8 v9, v8, 0x1

    aget-object v9, v6, v9

    aget-byte v9, v9, v22

    if-nez v9, :cond_63

    add-int/lit8 v9, v8, 0x2

    aget-object v9, v6, v9

    aget-byte v9, v9, v22

    if-ne v9, v15, :cond_63

    add-int/lit8 v9, v8, 0x3

    aget-object v9, v6, v9

    aget-byte v9, v9, v22

    if-ne v9, v15, :cond_63

    add-int/lit8 v9, v8, 0x4

    aget-object v9, v6, v9

    aget-byte v9, v9, v22

    if-ne v9, v15, :cond_63

    add-int/lit8 v9, v8, 0x5

    aget-object v9, v6, v9

    aget-byte v9, v9, v22

    if-nez v9, :cond_63

    aget-object v7, v6, v7

    aget-byte v7, v7, v22

    if-ne v7, v15, :cond_63

    add-int/lit8 v7, v8, -0x4

    const/4 v9, 0x0

    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    move-result v7

    array-length v9, v6

    invoke-static {v8, v9}, Ljava/lang/Math;->min(II)I

    move-result v9

    :goto_44
    if-ge v7, v9, :cond_5f

    aget-object v13, v6, v7

    aget-byte v13, v13, v22

    if-ne v13, v15, :cond_5e

    const/4 v7, 0x0

    goto :goto_45

    :cond_5e
    add-int/lit8 v7, v7, 0x1

    const/4 v15, 0x1

    goto :goto_44

    :cond_5f
    const/4 v7, 0x1

    :goto_45
    if-nez v7, :cond_62

    add-int/lit8 v7, v8, 0x7

    add-int/lit8 v9, v8, 0xb

    const/4 v15, 0x0

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v7

    array-length v13, v6

    invoke-static {v9, v13}, Ljava/lang/Math;->min(II)I

    move-result v9

    :goto_46
    if-ge v7, v9, :cond_61

    aget-object v13, v6, v7

    aget-byte v13, v13, v22

    const/4 v14, 0x1

    if-ne v13, v14, :cond_60

    move v7, v15

    goto :goto_47

    :cond_60
    add-int/lit8 v7, v7, 0x1

    goto :goto_46

    :cond_61
    const/4 v7, 0x1

    :goto_47
    if-eqz v7, :cond_64

    goto :goto_48

    :cond_62
    const/4 v15, 0x0

    :goto_48
    add-int/lit8 v12, v12, 0x1

    goto :goto_49

    :cond_63
    const/4 v15, 0x0

    :cond_64
    :goto_49
    add-int/lit8 v9, v22, 0x1

    move/from16 v7, v18

    goto/16 :goto_3d

    :cond_65
    move/from16 v18, v7

    const/4 v15, 0x0

    add-int/lit8 v8, v8, 0x1

    move v9, v12

    goto/16 :goto_3c

    :cond_66
    move/from16 v18, v7

    const/4 v15, 0x0

    mul-int/lit8 v9, v9, 0x28

    add-int/2addr v9, v11

    move v7, v15

    move v8, v7

    :goto_4a
    if-ge v7, v2, :cond_69

    aget-object v11, v6, v7

    move v12, v8

    move v8, v15

    :goto_4b
    if-ge v8, v4, :cond_68

    aget-byte v13, v11, v8

    const/4 v14, 0x1

    if-ne v13, v14, :cond_67

    add-int/lit8 v12, v12, 0x1

    :cond_67
    add-int/lit8 v8, v8, 0x1

    goto :goto_4b

    :cond_68
    add-int/lit8 v7, v7, 0x1

    move v8, v12

    goto :goto_4a

    :cond_69
    mul-int/2addr v4, v2

    shl-int/lit8 v6, v8, 0x1

    sub-int/2addr v6, v4

    invoke-static {v6}, Ljava/lang/Math;->abs(I)I

    move-result v6

    mul-int/lit8 v6, v6, 0xa

    div-int/2addr v6, v4

    mul-int/lit8 v6, v6, 0xa

    add-int/2addr v6, v9

    if-ge v6, v3, :cond_6a

    move v3, v6

    move/from16 v10, v18

    :cond_6a
    add-int/lit8 v7, v18, 0x1

    move-object/from16 v26, v5

    goto/16 :goto_39

    :cond_6b
    move-object/from16 v5, v26

    const/4 v14, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v14, v5, v10, v1}, Lju/b;->b(Lfu/a;ILiu/b;ILcom/google/android/material/datepicker/n;)V

    add-int/lit8 v0, v4, 0x8

    add-int/lit8 v3, v2, 0x8

    const/16 v5, 0x200

    invoke-static {v5, v0}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static {v5, v3}, Ljava/lang/Math;->max(II)I

    move-result v5

    div-int v0, v6, v0

    div-int v3, v5, v3

    invoke-static {v0, v3}, Ljava/lang/Math;->min(II)I

    move-result v0

    mul-int v3, v4, v0

    sub-int v3, v6, v3

    const/16 v21, 0x2

    div-int/lit8 v3, v3, 0x2

    mul-int v7, v2, v0

    sub-int v7, v5, v7

    div-int/lit8 v7, v7, 0x2

    new-instance v8, Lfu/b;

    invoke-direct {v8, v6, v5}, Lfu/b;-><init>(II)V

    move v5, v7

    move v7, v15

    :goto_4c
    if-ge v7, v2, :cond_72

    move v9, v3

    move v6, v15

    :goto_4d
    if-ge v6, v4, :cond_71

    invoke-virtual {v1, v6, v7}, Lcom/google/android/material/datepicker/n;->j(II)B

    move-result v10

    const/4 v14, 0x1

    if-ne v10, v14, :cond_70

    if-ltz v5, :cond_6f

    if-ltz v9, :cond_6f

    if-lez v0, :cond_6e

    if-lez v0, :cond_6e

    add-int v10, v9, v0

    add-int v11, v5, v0

    iget v12, v8, Lfu/b;->x:I

    if-gt v11, v12, :cond_6d

    iget v12, v8, Lfu/b;->w:I

    if-gt v10, v12, :cond_6d

    move v12, v5

    :goto_4e
    if-ge v12, v11, :cond_70

    iget v13, v8, Lfu/b;->y:I

    mul-int/2addr v13, v12

    move v14, v9

    :goto_4f
    if-ge v14, v10, :cond_6c

    div-int/lit8 v16, v14, 0x20

    add-int v16, v16, v13

    iget-object v15, v8, Lfu/b;->z:[I

    aget v18, v15, v16

    and-int/lit8 v19, v14, 0x1f

    const/16 v20, 0x1

    shl-int v19, v20, v19

    or-int v18, v18, v19

    aput v18, v15, v16

    add-int/lit8 v14, v14, 0x1

    const/4 v15, 0x0

    goto :goto_4f

    :cond_6c
    add-int/lit8 v12, v12, 0x1

    const/4 v15, 0x0

    goto :goto_4e

    :cond_6d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The region must fit inside the matrix"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6e
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Height and width must be at least 1"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Left and top must be nonnegative"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_70
    add-int/lit8 v6, v6, 0x1

    add-int/2addr v9, v0

    const/4 v15, 0x0

    goto :goto_4d

    :cond_71
    add-int/lit8 v7, v7, 0x1

    add-int/2addr v5, v0

    const/4 v15, 0x0

    goto :goto_4c

    :cond_72
    return-object v8

    :cond_73
    new-instance v1, Lcom/google/zxing/WriterException;

    const-string v3, "Interleaving error: "

    const-string v4, " and "

    invoke-static {v2, v3, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v0}, Lfu/a;->e()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " differ."

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_74
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Data bytes does not match offset"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_75
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Number of bits and data bytes does not match"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_76
    new-instance v0, Lcom/google/zxing/WriterException;

    const-string v1, "Bits size does not equal capacity"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_77
    move-object/from16 v28, v1

    new-instance v0, Lcom/google/zxing/WriterException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data bits cannot fit in the QR Code"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move-object/from16 v2, v28

    iget v2, v2, Lfu/a;->x:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " > "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_78
    new-instance v0, Lcom/google/zxing/WriterException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, " is bigger than "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v20, 0x1

    add-int/lit8 v5, v5, -0x1

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_79
    const/16 v3, 0x9

    const/16 v9, 0x1a

    const/16 v18, 0x7

    const/16 v21, 0x2

    const/16 v23, 0x4

    add-int/lit8 v1, v1, 0x1

    move-object/from16 v0, p0

    const/16 v17, 0x0

    const/16 v19, 0x8

    goto/16 :goto_11

    :cond_7a
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_7b
    new-instance v0, Lcom/google/zxing/WriterException;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7c
    const/16 v3, 0x9

    const/16 v9, 0x1a

    const/16 v18, 0x7

    const/16 v21, 0x2

    const/16 v23, 0x4

    add-int/lit8 v2, v2, 0x1

    move-object/from16 v0, p0

    move v4, v3

    move v3, v9

    move/from16 v9, v16

    move/from16 v14, v23

    const/4 v10, -0x1

    const/16 v17, 0x0

    const/16 v19, 0x8

    goto/16 :goto_e

    :cond_7d
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw v0

    :cond_7e
    new-instance v0, Lcom/google/zxing/WriterException;

    invoke-direct {v0, v11}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_7f
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Found empty contents"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
