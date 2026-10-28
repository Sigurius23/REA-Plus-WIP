.class public final Lpc3/b;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Ljava/lang/String;)Lkotlinx/datetime/DateTimePeriod;
    .locals 29

    move-object/from16 v0, p0

    const-string v1, "text"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v15

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x1

    const/4 v2, 0x6

    const/4 v1, 0x7

    if-lt v3, v15, :cond_7

    if-eqz v4, :cond_6

    if-eq v4, v2, :cond_5

    int-to-long v2, v6

    mul-int/2addr v7, v1

    int-to-long v0, v7

    add-long/2addr v2, v0

    const-wide/32 v0, -0x80000000

    cmp-long v0, v0, v2

    if-gtz v0, :cond_4

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, v2, v0

    if-gtz v0, :cond_4

    long-to-int v0, v2

    if-eqz v8, :cond_3

    int-to-long v1, v14

    invoke-static {v9, v10}, Ls2/e;->h0(II)J

    move-result-wide v22

    int-to-long v3, v11

    const/16 v5, 0x3c

    int-to-long v5, v5

    mul-long/2addr v3, v5

    int-to-long v7, v12

    add-long/2addr v3, v7

    mul-long/2addr v3, v5

    const v5, 0x3b9aca00

    int-to-long v5, v5

    div-long v7, v1, v5

    add-long/2addr v7, v3

    int-to-long v3, v13

    add-long/2addr v7, v3

    :try_start_0
    rem-long v3, v1, v5

    cmp-long v5, v7, v17

    const-wide/32 v9, 0x3b9aca00

    if-lez v5, :cond_0

    cmp-long v6, v3, v17

    if-gez v6, :cond_0

    const-wide/16 v5, -0x1

    add-long/2addr v7, v5

    add-long/2addr v3, v9

    goto :goto_1

    :cond_0
    if-gez v5, :cond_1

    cmp-long v5, v3, v17

    if-lez v5, :cond_1

    const-wide/16 v5, 0x1

    add-long/2addr v7, v5

    sub-long/2addr v3, v9

    :cond_1
    :goto_1
    invoke-static {v7, v8, v9, v10}, Ljava/lang/Math;->multiplyExact(JJ)J

    move-result-wide v5

    invoke-static {v5, v6, v3, v4}, Ljava/lang/Math;->addExact(JJ)J

    move-result-wide v24
    :try_end_0
    .catch Ljava/lang/ArithmeticException; {:try_start_0 .. :try_end_0} :catch_0

    cmp-long v1, v24, v17

    if-eqz v1, :cond_2

    new-instance v20, Lpc3/c;

    move/from16 v21, v0

    invoke-direct/range {v20 .. v25}, Lpc3/c;-><init>(IJJ)V

    return-object v20

    :cond_2
    move-wide/from16 v1, v22

    new-instance v3, Lkotlinx/datetime/DatePeriod;

    invoke-direct {v3, v1, v2, v0}, Lkotlinx/datetime/DatePeriod;-><init>(JI)V

    return-object v3

    :catch_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v3, " hours, "

    const-string v4, " minutes, "

    const-string v5, "The total number of nanoseconds in "

    invoke-static {v11, v12, v5, v3, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " seconds, and "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " nanoseconds overflows a Long"

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    const-string v0, "At least one component is required, but none were found"

    const/4 v15, 0x0

    invoke-static {v15, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_4
    const/4 v15, 0x0

    const-string v0, "The total number of days under \'D\' and \'W\' designators should fit into an Int"

    invoke-static {v15, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_5
    const-string v0, "Unexpected end of input; at least one time component is required after \'T\'"

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_6
    const-string v0, "Unexpected end of input; \'P\' designator is required"

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_7
    const/16 v1, 0x2b

    const/16 v2, 0x2d

    if-nez v4, :cond_e

    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v15

    if-lt v4, v15, :cond_9

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-eq v15, v1, :cond_8

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-eq v15, v2, :cond_8

    goto :goto_2

    :cond_8
    const-string v0, "Unexpected end of string; \'P\' designator is required"

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_9
    :goto_2
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v15

    move/from16 v23, v5

    const/16 v5, 0x50

    if-eq v15, v1, :cond_b

    if-eq v15, v2, :cond_b

    if-ne v15, v5, :cond_a

    move v3, v4

    move/from16 v5, v23

    goto :goto_4

    :cond_a
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected \'+\', \'-\', \'P\', got \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_b
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_c

    const/4 v1, -0x1

    goto :goto_3

    :cond_c
    move/from16 v1, v23

    :goto_3
    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-ne v2, v5, :cond_d

    add-int/lit8 v3, v3, 0x2

    move v5, v1

    :goto_4
    move/from16 v4, v19

    goto/16 :goto_0

    :cond_d
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Expected \'P\', got \'"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_e
    move/from16 v23, v5

    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v15, 0x30

    if-eq v5, v1, :cond_13

    if-ne v5, v2, :cond_f

    goto :goto_6

    :cond_f
    if-gt v15, v5, :cond_10

    const/16 v1, 0x3a

    if-ge v5, v1, :cond_10

    goto :goto_5

    :cond_10
    const/16 v1, 0x54

    if-ne v5, v1, :cond_12

    const/4 v1, 0x6

    if-ge v4, v1, :cond_11

    add-int/lit8 v3, v3, 0x1

    move/from16 v5, v23

    const/4 v4, 0x6

    goto/16 :goto_0

    :cond_11
    const-string v0, "Only one \'T\' designator is allowed"

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_12
    :goto_5
    move v1, v3

    move/from16 v5, v23

    const/16 v8, 0x3a

    goto :goto_8

    :cond_13
    :goto_6
    invoke-virtual {v0, v3}, Ljava/lang/String;->charAt(I)C

    move-result v1

    if-ne v1, v2, :cond_14

    mul-int/lit8 v5, v23, -0x1

    goto :goto_7

    :cond_14
    move/from16 v5, v23

    :goto_7
    add-int/lit8 v1, v3, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_2b

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-gt v15, v2, :cond_2b

    const/16 v8, 0x3a

    if-ge v2, v8, :cond_2b

    :goto_8
    move-wide/from16 v26, v17

    :goto_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v1, v2, :cond_15

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v2

    if-gt v15, v2, :cond_15

    if-ge v2, v8, :cond_15

    move v2, v6

    move v8, v7

    const-wide/16 v6, 0xa

    move/from16 v18, v8

    move/from16 v17, v9

    move-wide/from16 v8, v26

    :try_start_1
    invoke-static {v8, v9, v6, v7}, Ljava/lang/Math;->multiplyExact(JJ)J

    move-result-wide v6

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    sub-int/2addr v8, v15

    int-to-long v8, v8

    invoke-static {v6, v7, v8, v9}, Ljava/lang/Math;->addExact(JJ)J

    move-result-wide v26
    :try_end_1
    .catch Ljava/lang/ArithmeticException; {:try_start_1 .. :try_end_1} :catch_1

    add-int/lit8 v1, v1, 0x1

    move v6, v2

    move/from16 v9, v17

    move/from16 v7, v18

    const/16 v8, 0x3a

    goto :goto_9

    :catch_1
    const-string v0, "The number is too large"

    invoke-static {v3, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_15
    move v2, v6

    move/from16 v18, v7

    move/from16 v17, v9

    move-wide/from16 v8, v26

    int-to-long v6, v5

    mul-long/2addr v6, v8

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    const-string v9, "Expected a designator after the numerical value"

    if-eq v1, v8, :cond_2a

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    invoke-static {v8}, Ljava/lang/Character;->toUpperCase(C)C

    move-result v8

    const-string v15, "Wrong component order: should be \'Y\', \'M\', \'W\', \'D\', then designator \'T\', then \'H\', \'M\', \'S\'"

    move/from16 v28, v2

    const/16 v2, 0x2c

    if-eq v8, v2, :cond_24

    const/16 v2, 0x2e

    if-eq v8, v2, :cond_24

    const/16 v2, 0x44

    if-eq v8, v2, :cond_22

    const/16 v2, 0x48

    if-eq v8, v2, :cond_20

    const/16 v2, 0x4d

    if-eq v8, v2, :cond_1c

    const/16 v5, 0x53

    if-eq v8, v5, :cond_1a

    const/16 v2, 0x57

    if-eq v8, v2, :cond_18

    const/16 v2, 0x59

    if-ne v8, v2, :cond_17

    const/4 v5, 0x2

    if-ge v4, v5, :cond_16

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v9, v2

    move v4, v5

    :goto_a
    move/from16 v7, v18

    :goto_b
    move/from16 v6, v28

    goto/16 :goto_f

    :cond_16
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_17
    invoke-static {v1, v9}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_18
    const/4 v5, 0x4

    if-ge v4, v5, :cond_19

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v7, v2

    move v4, v5

    move/from16 v9, v17

    goto :goto_b

    :cond_19
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_1a
    const/16 v2, 0x9

    if-ge v4, v2, :cond_1b

    const/4 v5, 0x6

    if-lt v4, v5, :cond_1b

    const/16 v5, 0x53

    invoke-static {v6, v7, v3, v5}, Lpc3/b;->c(JIC)I

    move-result v2

    move v13, v2

    move/from16 v9, v17

    move/from16 v7, v18

    move/from16 v6, v28

    const/16 v4, 0x9

    goto/16 :goto_f

    :cond_1b
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_1c
    const/4 v5, 0x6

    if-lt v4, v5, :cond_1e

    const/16 v5, 0x8

    if-ge v4, v5, :cond_1d

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v12, v2

    :goto_c
    move v4, v5

    :goto_d
    move/from16 v9, v17

    goto :goto_a

    :cond_1d
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_1e
    const/4 v5, 0x3

    if-ge v4, v5, :cond_1f

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v10, v2

    goto :goto_c

    :cond_1f
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_20
    const/4 v5, 0x7

    if-ge v4, v5, :cond_21

    const/4 v8, 0x6

    if-lt v4, v8, :cond_21

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v11, v2

    goto :goto_c

    :cond_21
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_22
    const/4 v5, 0x5

    if-ge v4, v5, :cond_23

    invoke-static {v6, v7, v3, v2}, Lpc3/b;->c(JIC)I

    move-result v2

    move v6, v2

    move v4, v5

    move/from16 v9, v17

    move/from16 v7, v18

    goto/16 :goto_f

    :cond_23
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_24
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v2, v8, :cond_29

    move v1, v2

    :goto_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-ge v1, v8, :cond_25

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v8

    const/16 v9, 0x30

    if-gt v9, v8, :cond_25

    const/16 v13, 0x3a

    if-ge v8, v13, :cond_25

    add-int/lit8 v1, v1, 0x1

    goto :goto_e

    :cond_25
    sub-int v8, v1, v2

    const/16 v9, 0x9

    if-gt v8, v9, :cond_28

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    const-string v13, "substring(...)"

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    rsub-int/lit8 v2, v8, 0x9

    const-string v8, "0"

    invoke-static {v2, v8}, Lyb3/y;->J(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0xa

    invoke-static {v8}, Lva3/d;->c(I)V

    invoke-static {v2, v8}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v2

    mul-int/2addr v2, v5

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const/16 v8, 0x53

    if-ne v5, v8, :cond_27

    const/16 v9, 0x9

    if-ge v4, v9, :cond_26

    const/4 v5, 0x6

    if-lt v4, v5, :cond_26

    invoke-static {v6, v7, v3, v8}, Lpc3/b;->c(JIC)I

    move-result v3

    move v14, v2

    move v13, v3

    move v4, v9

    goto/16 :goto_d

    :goto_f
    add-int/lit8 v3, v1, 0x1

    move/from16 v8, v19

    move/from16 v5, v23

    goto/16 :goto_0

    :cond_26
    invoke-static {v1, v15}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_27
    const-string v0, "Expected the \'S\' designator after a fraction"

    invoke-static {v1, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_28
    const-string v0, "Only the nanosecond fractions of a second are supported"

    invoke-static {v2, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_29
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected designator \'S\' after "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_2a
    invoke-static {v1, v9}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16

    :cond_2b
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "A number expected after \'"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 v0, 0x27

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lpc3/b;->b(ILjava/lang/String;)V

    throw v16
.end method

.method public static final b(ILjava/lang/String;)V
    .locals 3

    new-instance v0, Lkotlinx/datetime/DateTimeFormatException;

    const-string v1, "Parse error at char "

    const-string v2, ": "

    invoke-static {p0, v1, v2, p1}, Ld;->j(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Lkotlinx/datetime/DateTimeFormatException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final c(JIC)I
    .locals 2

    const-wide/32 v0, -0x80000000

    cmp-long v0, p0, v0

    if-ltz v0, :cond_0

    const-wide/32 v0, 0x7fffffff

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    long-to-int p0, p0

    return p0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Value "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p0, " does not fit into an Int, which is required for component \'"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const/16 p0, 0x27

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p2, p0}, Lpc3/b;->b(ILjava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final serializer()Lwc3/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lwc3/c;"
        }
    .end annotation

    sget-object v0, Lvc3/e;->b:Lvc3/e;

    return-object v0
.end method
