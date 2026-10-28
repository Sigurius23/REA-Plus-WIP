.class public final Llg3/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llg3/f;


# static fields
.field public static final F:[I


# instance fields
.field public final E:I

.field public final w:Lng3/m;

.field public final x:I

.field public final y:I

.field public final z:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Llg3/i;->F:[I

    return-void

    :array_0
    .array-data 4
        0x0
        0xa
        0x64
        0x3e8
        0x2710
        0x186a0
        0xf4240
        0x989680
        0x5f5e100
        0x3b9aca00
    .end array-data
.end method

.method public constructor <init>(Lng3/m;III)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llg3/i;->w:Lng3/m;

    .line 3
    iput p2, p0, Llg3/i;->x:I

    .line 4
    iput p3, p0, Llg3/i;->y:I

    .line 5
    iput p4, p0, Llg3/i;->z:I

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Llg3/i;->E:I

    return-void
.end method

.method public constructor <init>(Lng3/m;IIII)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Llg3/i;->w:Lng3/m;

    .line 9
    iput p2, p0, Llg3/i;->x:I

    .line 10
    iput p3, p0, Llg3/i;->y:I

    .line 11
    iput p4, p0, Llg3/i;->z:I

    .line 12
    iput p5, p0, Llg3/i;->E:I

    return-void
.end method


# virtual methods
.method public final a(Llg3/q;Ljava/lang/CharSequence;I)I
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    invoke-interface/range {p2 .. p2}, Ljava/lang/CharSequence;->length()I

    move-result v3

    if-ne v2, v3, :cond_0

    not-int v1, v2

    return v1

    :cond_0
    invoke-interface/range {p2 .. p3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v4

    iget-object v5, v1, Llg3/q;->d:Ljava/lang/Object;

    check-cast v5, Llg3/t;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v6, 0x2b

    const/4 v7, 0x2

    const/4 v8, 0x4

    iget v9, v0, Llg3/i;->y:I

    iget v10, v0, Llg3/i;->z:I

    iget v11, v0, Llg3/i;->x:I

    const/4 v13, 0x1

    if-ne v4, v6, :cond_5

    iget-boolean v4, v1, Llg3/q;->c:Z

    if-ne v11, v9, :cond_1

    move v6, v13

    goto :goto_0

    :cond_1
    const/4 v6, 0x0

    :goto_0
    invoke-static {v10}, Le4/p;->e(I)I

    move-result v14

    if-eqz v14, :cond_2

    if-eq v14, v13, :cond_3

    if-eq v14, v8, :cond_3

    if-nez v4, :cond_4

    if-nez v6, :cond_4

    goto :goto_1

    :cond_2
    if-nez v4, :cond_4

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x1

    move v6, v13

    const/4 v4, 0x0

    goto :goto_5

    :cond_4
    not-int v1, v2

    return v1

    :cond_5
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v6, 0x2d

    if-ne v4, v6, :cond_9

    iget-boolean v4, v1, Llg3/q;->c:Z

    if-ne v11, v9, :cond_6

    move v6, v13

    goto :goto_2

    :cond_6
    const/4 v6, 0x0

    :goto_2
    invoke-static {v10}, Le4/p;->e(I)I

    move-result v14

    if-eqz v14, :cond_8

    if-eq v14, v13, :cond_8

    if-eq v14, v8, :cond_8

    if-nez v4, :cond_7

    if-nez v6, :cond_7

    goto :goto_3

    :cond_7
    not-int v1, v2

    return v1

    :cond_8
    :goto_3
    add-int/lit8 v2, v2, 0x1

    move v4, v13

    :goto_4
    const/4 v6, 0x0

    goto :goto_5

    :cond_9
    if-ne v10, v7, :cond_a

    iget-boolean v4, v1, Llg3/q;->c:Z

    if-eqz v4, :cond_a

    not-int v1, v2

    return v1

    :cond_a
    const/4 v4, 0x0

    goto :goto_4

    :goto_5
    iget-boolean v14, v1, Llg3/q;->c:Z

    const/4 v15, -0x1

    move/from16 v16, v13

    iget v13, v0, Llg3/i;->E:I

    if-nez v14, :cond_c

    if-eq v13, v15, :cond_c

    if-lez v13, :cond_b

    if-ne v11, v9, :cond_b

    if-ne v10, v8, :cond_b

    goto :goto_6

    :cond_b
    move/from16 v7, v16

    goto :goto_7

    :cond_c
    :goto_6
    move v7, v11

    :goto_7
    add-int v12, v2, v7

    if-le v12, v3, :cond_d

    not-int v1, v2

    return v1

    :cond_d
    if-nez v14, :cond_f

    if-eq v13, v15, :cond_f

    if-lez v13, :cond_e

    if-ne v11, v9, :cond_e

    const/4 v14, 0x4

    if-ne v10, v14, :cond_e

    goto :goto_8

    :cond_e
    const/16 v9, 0x9

    :cond_f
    :goto_8
    const/4 v14, 0x0

    invoke-static {v13, v14}, Ljava/lang/Math;->max(II)I

    move-result v17

    add-int v17, v17, v9

    :goto_9
    const-wide/16 v18, 0x0

    const/4 v9, 0x2

    if-ge v14, v9, :cond_17

    add-int v9, v2, v17

    invoke-static {v9, v3}, Ljava/lang/Math;->min(II)I

    move-result v9

    move v15, v2

    move-wide/from16 v20, v18

    const/16 v17, 0x0

    :goto_a
    if-ge v15, v9, :cond_15

    add-int/lit8 v22, v15, 0x1

    move-object/from16 v8, p2

    invoke-interface {v8, v15}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v23

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v24, v3

    add-int/lit8 v3, v23, -0x30

    move/from16 v23, v4

    const/16 v4, 0x9

    if-ltz v3, :cond_10

    if-gt v3, v4, :cond_10

    goto :goto_b

    :cond_10
    const/4 v3, -0x1

    :goto_b
    if-gez v3, :cond_12

    if-ge v15, v12, :cond_11

    not-int v1, v2

    return v1

    :cond_11
    :goto_c
    move-object/from16 v25, v5

    move/from16 v26, v6

    goto :goto_e

    :cond_12
    sub-int v15, v22, v2

    const/16 v4, 0x12

    if-le v15, v4, :cond_14

    if-nez v17, :cond_13

    invoke-static/range {v20 .. v21}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v17

    :cond_13
    move-object/from16 v4, v17

    sget-object v15, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    invoke-virtual {v4, v15}, Ljava/math/BigInteger;->multiply(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v4

    move-object/from16 v25, v5

    move/from16 v26, v6

    int-to-long v5, v3

    invoke-static {v5, v6}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/math/BigInteger;->add(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v3

    move-object/from16 v17, v3

    goto :goto_d

    :cond_14
    move-object/from16 v25, v5

    move/from16 v26, v6

    const-wide/16 v4, 0xa

    mul-long v20, v20, v4

    int-to-long v3, v3

    add-long v20, v20, v3

    :goto_d
    move/from16 v15, v22

    move/from16 v4, v23

    move/from16 v3, v24

    move-object/from16 v5, v25

    move/from16 v6, v26

    goto :goto_a

    :cond_15
    move-object/from16 v8, p2

    move/from16 v24, v3

    move/from16 v23, v4

    goto :goto_c

    :goto_e
    if-lez v13, :cond_16

    if-nez v14, :cond_16

    sub-int/2addr v15, v2

    sub-int/2addr v15, v13

    invoke-static {v7, v15}, Ljava/lang/Math;->max(II)I

    move-result v17

    add-int/lit8 v14, v14, 0x1

    move/from16 v4, v23

    move/from16 v3, v24

    move-object/from16 v5, v25

    move/from16 v6, v26

    const/4 v15, -0x1

    goto/16 :goto_9

    :cond_16
    move v6, v15

    move-object/from16 v9, v17

    move-wide/from16 v3, v20

    goto :goto_f

    :cond_17
    move/from16 v23, v4

    move/from16 v26, v6

    move v6, v2

    move-wide/from16 v3, v18

    const/4 v9, 0x0

    :goto_f
    if-eqz v23, :cond_1b

    if-eqz v9, :cond_19

    sget-object v5, Ljava/math/BigInteger;->ZERO:Ljava/math/BigInteger;

    invoke-virtual {v9, v5}, Ljava/math/BigInteger;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    iget-boolean v5, v1, Llg3/q;->c:Z

    if-eqz v5, :cond_18

    add-int/lit8 v2, v2, -0x1

    not-int v1, v2

    return v1

    :cond_18
    invoke-virtual {v9}, Ljava/math/BigInteger;->negate()Ljava/math/BigInteger;

    move-result-object v9

    goto :goto_10

    :cond_19
    cmp-long v5, v3, v18

    if-nez v5, :cond_1a

    iget-boolean v5, v1, Llg3/q;->c:Z

    if-eqz v5, :cond_1a

    add-int/lit8 v2, v2, -0x1

    not-int v1, v2

    return v1

    :cond_1a
    neg-long v3, v3

    goto :goto_10

    :cond_1b
    const/4 v5, 0x5

    if-ne v10, v5, :cond_1d

    iget-boolean v5, v1, Llg3/q;->c:Z

    if-eqz v5, :cond_1d

    sub-int v5, v6, v2

    if-eqz v26, :cond_1c

    if-gt v5, v11, :cond_1d

    add-int/lit8 v2, v2, -0x1

    not-int v1, v2

    return v1

    :cond_1c
    if-le v5, v11, :cond_1d

    not-int v1, v2

    return v1

    :cond_1d
    :goto_10
    if-eqz v9, :cond_1f

    invoke-virtual {v9}, Ljava/math/BigInteger;->bitLength()I

    move-result v3

    const/16 v4, 0x3f

    if-le v3, v4, :cond_1e

    sget-object v3, Ljava/math/BigInteger;->TEN:Ljava/math/BigInteger;

    invoke-virtual {v9, v3}, Ljava/math/BigInteger;->divide(Ljava/math/BigInteger;)Ljava/math/BigInteger;

    move-result-object v9

    add-int/lit8 v6, v6, -0x1

    :cond_1e
    invoke-virtual {v9}, Ljava/math/BigInteger;->longValue()J

    move-result-wide v3

    move v5, v2

    iget-object v2, v0, Llg3/i;->w:Lng3/m;

    invoke-virtual/range {v1 .. v6}, Llg3/q;->k(Lng3/m;JII)I

    move-result v1

    return v1

    :cond_1f
    move v5, v2

    iget-object v2, v0, Llg3/i;->w:Lng3/m;

    move-object/from16 v1, p1

    invoke-virtual/range {v1 .. v6}, Llg3/q;->k(Lng3/m;JII)I

    move-result v1

    return v1
.end method

.method public final b(Lab/h0;Ljava/lang/StringBuilder;)Z
    .locals 11

    iget-object v0, p0, Llg3/i;->w:Lng3/m;

    invoke-virtual {p1, v0}, Lab/h0;->r(Lng3/m;)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iget-object p1, p1, Lab/h0;->z:Ljava/lang/Object;

    check-cast p1, Llg3/t;

    const-wide/high16 v5, -0x8000000000000000L

    cmp-long v1, v3, v5

    if-nez v1, :cond_1

    const-string v1, "9223372036854775808"

    goto :goto_0

    :cond_1
    invoke-static {v3, v4}, Ljava/lang/Math;->abs(J)J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    move-result-object v1

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v5

    const-string v6, " cannot be printed as the value "

    const-string v7, "Field "

    iget v8, p0, Llg3/i;->y:I

    if-gt v5, v8, :cond_9

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v8, 0x0

    cmp-long p1, v3, v8

    iget v5, p0, Llg3/i;->x:I

    const/4 v8, 0x4

    iget v9, p0, Llg3/i;->z:I

    const/4 v10, 0x1

    if-ltz p1, :cond_4

    invoke-static {v9}, Le4/p;->e(I)I

    move-result p1

    const/16 v0, 0x2b

    if-eq p1, v10, :cond_3

    if-eq p1, v8, :cond_2

    goto :goto_1

    :cond_2
    const/16 p1, 0x13

    if-ge v5, p1, :cond_7

    sget-object p1, Llg3/i;->F:[I

    aget p1, p1, v5

    int-to-long v6, p1

    cmp-long p1, v3, v6

    if-ltz p1, :cond_7

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_3
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_4
    invoke-static {v9}, Le4/p;->e(I)I

    move-result p1

    if-eqz p1, :cond_6

    if-eq p1, v10, :cond_6

    const/4 v9, 0x3

    if-eq p1, v9, :cond_5

    if-eq p1, v8, :cond_6

    goto :goto_1

    :cond_5
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " cannot be negative according to the SignStyle"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    const/16 p1, 0x2d

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_7
    :goto_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result p1

    sub-int p1, v5, p1

    if-ge v2, p1, :cond_8

    const/16 p1, 0x30

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_8
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return v10

    :cond_9
    new-instance p1, Lorg/threeten/bp/DateTimeException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, " exceeds the maximum print width of "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    const-string v0, ")"

    iget-object v1, p0, Llg3/i;->w:Lng3/m;

    const-string v2, "Value("

    iget v3, p0, Llg3/i;->z:I

    iget v4, p0, Llg3/i;->y:I

    iget v5, p0, Llg3/i;->x:I

    const/4 v6, 0x1

    if-ne v5, v6, :cond_0

    const/16 v7, 0x13

    if-ne v4, v7, :cond_0

    if-ne v3, v6, :cond_0

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v6, ","

    if-ne v5, v4, :cond_1

    const/4 v7, 0x4

    if-ne v3, v7, :cond_1

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    if-eq v3, v1, :cond_6

    const/4 v1, 0x2

    if-eq v3, v1, :cond_5

    const/4 v1, 0x3

    if-eq v3, v1, :cond_4

    const/4 v1, 0x4

    if-eq v3, v1, :cond_3

    const/4 v1, 0x5

    if-eq v3, v1, :cond_2

    const-string v1, "null"

    goto :goto_0

    :cond_2
    const-string v1, "EXCEEDS_PAD"

    goto :goto_0

    :cond_3
    const-string v1, "NOT_NEGATIVE"

    goto :goto_0

    :cond_4
    const-string v1, "NEVER"

    goto :goto_0

    :cond_5
    const-string v1, "ALWAYS"

    goto :goto_0

    :cond_6
    const-string v1, "NORMAL"

    :goto_0
    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
