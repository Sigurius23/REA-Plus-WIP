.class public abstract Lcom/google/crypto/tink/internal/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:[[B

.field public static final b:Lcom/google/crypto/tink/internal/b;

.field public static final c:Lqg3/d;

.field public static final d:[I

.field public static final e:[I

.field public static final f:[I

.field public static final g:[I

.field public static final h:Lu00/e;


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 8

    const/16 v0, 0x20

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    new-array v3, v0, [B

    fill-array-data v3, :array_2

    new-array v4, v0, [B

    fill-array-data v4, :array_3

    new-array v5, v0, [B

    fill-array-data v5, :array_4

    new-array v6, v0, [B

    fill-array-data v6, :array_5

    new-array v7, v0, [B

    fill-array-data v7, :array_6

    filled-new-array/range {v1 .. v7}, [[B

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/internal/a;->a:[[B

    new-instance v0, Lcom/google/crypto/tink/internal/b;

    const/16 v1, 0xa

    new-array v2, v1, [J

    fill-array-data v2, :array_7

    new-array v3, v1, [J

    fill-array-data v3, :array_8

    new-array v4, v1, [J

    fill-array-data v4, :array_9

    invoke-direct {v0, v2, v3, v4}, Lcom/google/crypto/tink/internal/b;-><init>([J[J[J)V

    sput-object v0, Lcom/google/crypto/tink/internal/a;->b:Lcom/google/crypto/tink/internal/b;

    new-instance v0, Lqg3/d;

    new-instance v2, La33/d;

    new-array v3, v1, [J

    fill-array-data v3, :array_a

    new-array v4, v1, [J

    fill-array-data v4, :array_b

    new-array v5, v1, [J

    fill-array-data v5, :array_c

    const/16 v6, 0x9

    invoke-direct {v2, v3, v4, v5, v6}, La33/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    new-array v3, v1, [J

    fill-array-data v3, :array_d

    const/4 v4, 0x7

    invoke-direct {v0, v4, v2, v3}, Lqg3/d;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sput-object v0, Lcom/google/crypto/tink/internal/a;->c:Lqg3/d;

    new-array v0, v1, [I

    fill-array-data v0, :array_e

    sput-object v0, Lcom/google/crypto/tink/internal/a;->d:[I

    new-array v0, v1, [I

    fill-array-data v0, :array_f

    sput-object v0, Lcom/google/crypto/tink/internal/a;->e:[I

    const v0, 0x3ffffff

    const v1, 0x1ffffff

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/internal/a;->f:[I

    const/16 v0, 0x1a

    const/16 v1, 0x19

    filled-new-array {v0, v1}, [I

    move-result-object v0

    sput-object v0, Lcom/google/crypto/tink/internal/a;->g:[I

    new-instance v0, Lu00/e;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Lu00/e;-><init>(I)V

    sput-object v0, Lcom/google/crypto/tink/internal/a;->h:Lu00/e;

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_1
    .array-data 1
        0x1t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
        0x0t
    .end array-data

    :array_2
    .array-data 1
        -0x20t
        -0x15t
        0x7at
        0x7ct
        0x3bt
        0x41t
        -0x48t
        -0x52t
        0x16t
        0x56t
        -0x1dt
        -0x6t
        -0xft
        -0x61t
        -0x3ct
        0x6at
        -0x26t
        0x9t
        -0x73t
        -0x15t
        -0x64t
        0x32t
        -0x4ft
        -0x3t
        -0x7at
        0x62t
        0x5t
        0x16t
        0x5ft
        0x49t
        -0x48t
        0x0t
    .end array-data

    :array_3
    .array-data 1
        0x5ft
        -0x64t
        -0x6bt
        -0x44t
        -0x5dt
        0x50t
        -0x74t
        0x24t
        -0x4ft
        -0x30t
        -0x4ft
        0x55t
        -0x64t
        -0x7dt
        -0x11t
        0x5bt
        0x4t
        0x44t
        0x5ct
        -0x3ct
        0x58t
        0x1ct
        -0x72t
        -0x7at
        -0x28t
        0x22t
        0x4et
        -0x23t
        -0x30t
        -0x61t
        0x11t
        0x57t
    .end array-data

    :array_4
    .array-data 1
        -0x14t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x7ft
    .end array-data

    :array_5
    .array-data 1
        -0x13t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x7ft
    .end array-data

    :array_6
    .array-data 1
        -0x12t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        -0x1t
        0x7ft
    .end array-data

    :array_7
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_8
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_9
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_a
    .array-data 8
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_b
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_c
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_d
    .array-data 8
        0x1
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
        0x0
    .end array-data

    :array_e
    .array-data 4
        0x0
        0x3
        0x6
        0x9
        0xc
        0x10
        0x13
        0x16
        0x19
        0x1c
    .end array-data

    :array_f
    .array-data 4
        0x0
        0x2
        0x3
        0x5
        0x6
        0x0
        0x1
        0x3
        0x4
        0x6
    .end array-data
.end method

.method public static a(Lqg3/d;Lxl/a;Lcom/google/crypto/tink/internal/b;)V
    .locals 6

    const/16 v0, 0xa

    new-array v0, v0, [J

    iget-object v1, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v2, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v3, p1, Lxl/a;->x:Ljava/lang/Object;

    check-cast v3, La33/d;

    iget-object v4, v3, La33/d;->y:Ljava/lang/Object;

    check-cast v4, [J

    iget-object v5, v3, La33/d;->x:Ljava/lang/Object;

    check-cast v5, [J

    invoke-static {v2, v4, v5}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v4, v3, La33/d;->y:Ljava/lang/Object;

    check-cast v4, [J

    iget-object v5, v3, La33/d;->x:Ljava/lang/Object;

    check-cast v5, [J

    invoke-static {v2, v4, v5}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v4, p2, Lcom/google/crypto/tink/internal/b;->b:[J

    invoke-static {v2, v2, v4}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object v4, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v4, [J

    iget-object v1, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v1, [J

    iget-object v5, p2, Lcom/google/crypto/tink/internal/b;->a:[J

    invoke-static {v4, v1, v5}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object p0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p0, [J

    iget-object p1, p1, Lxl/a;->y:Ljava/lang/Object;

    check-cast p1, [J

    iget-object v5, p2, Lcom/google/crypto/tink/internal/b;->c:[J

    invoke-static {p0, p1, v5}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object p1, v3, La33/d;->z:Ljava/lang/Object;

    check-cast p1, [J

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p2, 0x0

    const/16 v3, 0xa

    invoke-static {p1, p2, v1, p2, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v0, v1, v1}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v1, v4, v2}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v2, v4, v2}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v4, v0, p0}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {p0, v0, p0}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    return-void
.end method

.method public static b([J)[B
    .locals 19

    const/16 v0, 0xa

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const-wide/16 v4, 0x13

    sget-object v6, Lcom/google/crypto/tink/internal/a;->g:[I

    const/16 v7, 0x19

    const/16 v8, 0x1f

    const/16 v9, 0x9

    const/4 v10, 0x2

    if-ge v3, v10, :cond_1

    move v10, v2

    :goto_1
    if-ge v10, v9, :cond_0

    aget-wide v11, v1, v10

    shr-long v13, v11, v8

    and-long/2addr v13, v11

    and-int/lit8 v15, v10, 0x1

    aget v15, v6, v15

    shr-long/2addr v13, v15

    long-to-int v13, v13

    neg-int v13, v13

    shl-int v14, v13, v15

    int-to-long v14, v14

    add-long/2addr v11, v14

    aput-wide v11, v1, v10

    add-int/lit8 v10, v10, 0x1

    aget-wide v11, v1, v10

    int-to-long v13, v13

    sub-long/2addr v11, v13

    aput-wide v11, v1, v10

    goto :goto_1

    :cond_0
    aget-wide v10, v1, v9

    shr-long v12, v10, v8

    and-long/2addr v12, v10

    shr-long v6, v12, v7

    long-to-int v6, v6

    neg-int v6, v6

    shl-int/lit8 v7, v6, 0x19

    int-to-long v7, v7

    add-long/2addr v10, v7

    aput-wide v10, v1, v9

    aget-wide v7, v1, v2

    int-to-long v9, v6

    mul-long/2addr v9, v4

    sub-long/2addr v7, v9

    aput-wide v7, v1, v2

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    aget-wide v11, v1, v2

    shr-long v13, v11, v8

    and-long/2addr v13, v11

    const/16 v3, 0x1a

    shr-long/2addr v13, v3

    long-to-int v3, v13

    neg-int v3, v3

    shl-int/lit8 v13, v3, 0x1a

    int-to-long v13, v13

    add-long/2addr v11, v13

    aput-wide v11, v1, v2

    const/4 v11, 0x1

    aget-wide v12, v1, v11

    int-to-long v14, v3

    sub-long/2addr v12, v14

    aput-wide v12, v1, v11

    move v3, v2

    :goto_2
    sget-object v12, Lcom/google/crypto/tink/internal/a;->f:[I

    if-ge v3, v10, :cond_3

    move v13, v2

    :goto_3
    if-ge v13, v9, :cond_2

    aget-wide v14, v1, v13

    and-int/lit8 v16, v13, 0x1

    aget v17, v6, v16

    move/from16 p0, v2

    move/from16 v18, v3

    shr-long v2, v14, v17

    long-to-int v2, v2

    aget v3, v12, v16

    move-wide/from16 v16, v4

    int-to-long v4, v3

    and-long v3, v14, v4

    aput-wide v3, v1, v13

    add-int/lit8 v13, v13, 0x1

    aget-wide v3, v1, v13

    int-to-long v14, v2

    add-long/2addr v3, v14

    aput-wide v3, v1, v13

    move/from16 v2, p0

    move-wide/from16 v4, v16

    move/from16 v3, v18

    goto :goto_3

    :cond_2
    move/from16 p0, v2

    move/from16 v18, v3

    move-wide/from16 v16, v4

    add-int/lit8 v3, v18, 0x1

    goto :goto_2

    :cond_3
    move/from16 p0, v2

    move-wide/from16 v16, v4

    aget-wide v2, v1, v9

    shr-long v4, v2, v7

    long-to-int v4, v4

    const-wide/32 v5, 0x1ffffff

    and-long/2addr v2, v5

    aput-wide v2, v1, v9

    aget-wide v2, v1, p0

    int-to-long v4, v4

    mul-long v4, v4, v16

    add-long/2addr v4, v2

    aput-wide v4, v1, p0

    long-to-int v2, v4

    const v3, 0x3ffffed

    sub-int/2addr v2, v3

    shr-int/2addr v2, v8

    not-int v2, v2

    move v4, v11

    :goto_4
    if-ge v4, v0, :cond_4

    aget-wide v5, v1, v4

    long-to-int v5, v5

    and-int/lit8 v6, v4, 0x1

    aget v6, v12, v6

    xor-int/2addr v5, v6

    not-int v5, v5

    shl-int/lit8 v6, v5, 0x10

    and-int/2addr v5, v6

    shl-int/lit8 v6, v5, 0x8

    and-int/2addr v5, v6

    shl-int/lit8 v6, v5, 0x4

    and-int/2addr v5, v6

    shl-int/lit8 v6, v5, 0x2

    and-int/2addr v5, v6

    shl-int/lit8 v6, v5, 0x1

    and-int/2addr v5, v6

    shr-int/2addr v5, v8

    and-int/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_4

    :cond_4
    aget-wide v4, v1, p0

    and-int/2addr v3, v2

    int-to-long v6, v3

    sub-long/2addr v4, v6

    aput-wide v4, v1, p0

    aget-wide v3, v1, v11

    const v5, 0x1ffffff

    and-int/2addr v5, v2

    int-to-long v5, v5

    sub-long/2addr v3, v5

    aput-wide v3, v1, v11

    :goto_5
    if-ge v10, v0, :cond_5

    aget-wide v3, v1, v10

    const v7, 0x3ffffff

    and-int/2addr v7, v2

    int-to-long v7, v7

    sub-long/2addr v3, v7

    aput-wide v3, v1, v10

    add-int/lit8 v3, v10, 0x1

    aget-wide v7, v1, v3

    sub-long/2addr v7, v5

    aput-wide v7, v1, v3

    add-int/lit8 v10, v10, 0x2

    goto :goto_5

    :cond_5
    move/from16 v2, p0

    :goto_6
    if-ge v2, v0, :cond_6

    aget-wide v3, v1, v2

    sget-object v5, Lcom/google/crypto/tink/internal/a;->e:[I

    aget v5, v5, v2

    shl-long/2addr v3, v5

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_6

    :cond_6
    const/16 v2, 0x20

    new-array v2, v2, [B

    move/from16 v3, p0

    :goto_7
    if-ge v3, v0, :cond_7

    sget-object v4, Lcom/google/crypto/tink/internal/a;->d:[I

    aget v4, v4, v3

    aget-byte v5, v2, v4

    int-to-long v5, v5

    aget-wide v7, v1, v3

    const-wide/16 v9, 0xff

    and-long v11, v7, v9

    or-long/2addr v5, v11

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    add-int/lit8 v5, v4, 0x1

    aget-byte v6, v2, v5

    int-to-long v11, v6

    const/16 v6, 0x8

    shr-long v13, v7, v6

    and-long/2addr v13, v9

    or-long/2addr v11, v13

    long-to-int v6, v11

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/lit8 v5, v4, 0x2

    aget-byte v6, v2, v5

    int-to-long v11, v6

    const/16 v6, 0x10

    shr-long v13, v7, v6

    and-long/2addr v13, v9

    or-long/2addr v11, v13

    long-to-int v6, v11

    int-to-byte v6, v6

    aput-byte v6, v2, v5

    add-int/lit8 v4, v4, 0x3

    aget-byte v5, v2, v4

    int-to-long v5, v5

    const/16 v11, 0x18

    shr-long/2addr v7, v11

    and-long/2addr v7, v9

    or-long/2addr v5, v7

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v2, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    :cond_7
    return-object v2
.end method

.method public static c([J[JI)V
    .locals 6

    neg-int p2, p2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p0, v0

    long-to-int v3, v1

    aget-wide v4, p1, v0

    long-to-int v4, v4

    xor-int/2addr v3, v4

    and-int/2addr v3, p2

    long-to-int v1, v1

    xor-int/2addr v1, v3

    int-to-long v1, v1

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static d(La33/d;Lqg3/d;)V
    .locals 4

    const/16 v0, 0xa

    new-array v0, v0, [J

    iget-object v1, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, La33/d;

    iget-object v2, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v3, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v3, [J

    invoke-static {v2, v3}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    iget-object v2, v1, La33/d;->z:Ljava/lang/Object;

    check-cast v2, [J

    iget-object v3, p0, La33/d;->y:Ljava/lang/Object;

    check-cast v3, [J

    invoke-static {v2, v3}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, [J

    iget-object v2, p0, La33/d;->z:Ljava/lang/Object;

    check-cast v2, [J

    invoke-static {p1, v2}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {p1, p1, p1}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    iget-object v2, v1, La33/d;->y:Ljava/lang/Object;

    check-cast v2, [J

    iget-object p0, p0, La33/d;->x:Ljava/lang/Object;

    check-cast p0, [J

    invoke-static {v2, p0, v3}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {v0, v2}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    iget-object p0, v1, La33/d;->z:Ljava/lang/Object;

    check-cast p0, [J

    iget-object v1, v1, La33/d;->x:Ljava/lang/Object;

    check-cast v1, [J

    invoke-static {v2, p0, v1}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {p0, p0, v1}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v1, v0, v2}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {p1, p1, p0}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    return-void
.end method

.method public static e(II)I
    .locals 0

    xor-int/2addr p0, p1

    not-int p0, p0

    and-int/lit16 p0, p0, 0xff

    shl-int/lit8 p1, p0, 0x4

    and-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x2

    and-int/2addr p0, p1

    shl-int/lit8 p1, p0, 0x1

    and-int/2addr p0, p1

    shr-int/lit8 p0, p0, 0x7

    and-int/lit8 p0, p0, 0x1

    return p0
.end method

.method public static f([B)[J
    .locals 9

    const/16 v0, 0xa

    new-array v1, v0, [J

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    sget-object v3, Lcom/google/crypto/tink/internal/a;->d:[I

    aget v3, v3, v2

    aget-byte v4, p0, v3

    and-int/lit16 v4, v4, 0xff

    int-to-long v4, v4

    add-int/lit8 v6, v3, 0x1

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x8

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    add-int/lit8 v6, v3, 0x2

    aget-byte v6, p0, v6

    and-int/lit16 v6, v6, 0xff

    int-to-long v6, v6

    const/16 v8, 0x10

    shl-long/2addr v6, v8

    or-long/2addr v4, v6

    add-int/lit8 v3, v3, 0x3

    aget-byte v3, p0, v3

    and-int/lit16 v3, v3, 0xff

    int-to-long v6, v3

    const/16 v3, 0x18

    shl-long/2addr v6, v3

    or-long v3, v4, v6

    sget-object v5, Lcom/google/crypto/tink/internal/a;->e:[I

    aget v5, v5, v2

    shr-long/2addr v3, v5

    and-int/lit8 v5, v2, 0x1

    sget-object v6, Lcom/google/crypto/tink/internal/a;->f:[I

    aget v5, v6, v5

    int-to-long v5, v5

    and-long/2addr v3, v5

    aput-wide v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public static g([B)Ljava/math/BigInteger;
    .locals 2

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    return-object v0
.end method

.method public static h([B)[B
    .locals 3

    sget-object v0, Lat/u;->e:Lat/u;

    const-string v1, "SHA-512"

    iget-object v0, v0, Lat/u;->a:Lat/t;

    invoke-virtual {v0, v1}, Lat/t;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/security/MessageDigest;

    const/16 v1, 0x20

    const/4 v2, 0x0

    invoke-virtual {v0, p0, v2, v1}, Ljava/security/MessageDigest;->update([BII)V

    invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B

    move-result-object p0

    aget-byte v0, p0, v2

    and-int/lit16 v0, v0, 0xf8

    int-to-byte v0, v0

    aput-byte v0, p0, v2

    const/16 v0, 0x1f

    aget-byte v1, p0, v0

    and-int/lit8 v1, v1, 0x7f

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    or-int/lit8 v1, v1, 0x40

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    return-object p0
.end method

.method public static i(La33/d;)V
    .locals 8

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    sget-object v1, Lss/a;->b:Lss/a;

    iget-object v1, p0, La33/d;->z:Ljava/lang/Object;

    iget-object v1, p0, La33/d;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/crypto/tink/internal/j0;

    iget-object v4, v3, Lcom/google/crypto/tink/internal/j0;->b:Lvs/n3;

    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    const/4 v5, 0x1

    if-eq v4, v5, :cond_3

    const/4 v5, 0x2

    if-eq v4, v5, :cond_2

    const/4 v5, 0x3

    if-ne v4, v5, :cond_1

    sget-object v4, Lfs/f;->e:Lfs/f;

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Unknown key status"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    sget-object v4, Lfs/f;->d:Lfs/f;

    goto :goto_1

    :cond_3
    sget-object v4, Lfs/f;->c:Lfs/f;

    :goto_1
    iget v5, v3, Lcom/google/crypto/tink/internal/j0;->d:I

    iget-object v6, v3, Lcom/google/crypto/tink/internal/j0;->e:Ljava/lang/String;

    const-string v7, "type.googleapis.com/google.crypto."

    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_4

    goto :goto_2

    :cond_4
    const/16 v7, 0x22

    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v6

    :goto_2
    iget-object v3, v3, Lcom/google/crypto/tink/internal/j0;->c:Lvs/h4;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    new-instance v7, Lss/b;

    invoke-direct {v7, v4, v5, v6, v3}, Lss/b;-><init>(Lfs/f;ILjava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_5
    iget-object p0, p0, La33/d;->y:Ljava/lang/Object;

    check-cast p0, Lcom/google/crypto/tink/internal/j0;

    if-eqz p0, :cond_6

    iget p0, p0, Lcom/google/crypto/tink/internal/j0;->d:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_3

    :cond_6
    const/4 p0, 0x0

    :goto_3
    if-eqz p0, :cond_9

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lss/b;

    iget v2, v2, Lss/b;->b:I

    if-ne v2, p0, :cond_7

    goto :goto_4

    :cond_8
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "primary key ID is not present in entries"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :catch_0
    move-exception p0

    goto :goto_5

    :cond_9
    :goto_4
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public static j([J[J)V
    .locals 11

    const/16 v0, 0xa

    new-array v1, v0, [J

    new-array v2, v0, [J

    new-array v3, v0, [J

    new-array v4, v0, [J

    new-array v5, v0, [J

    new-array v6, v0, [J

    new-array v7, v0, [J

    new-array v8, v0, [J

    new-array v9, v0, [J

    new-array v10, v0, [J

    invoke-static {v1, p1}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v1}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v2, v9, p1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v3, v2, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v3}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v4, v9, v2}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v4}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v5, v9, v4}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v5}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    const/4 p1, 0x2

    move v1, p1

    :goto_0
    if-ge v1, v0, :cond_0

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_0

    :cond_0
    invoke-static {v6, v10, v5}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v6}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    move v1, p1

    :goto_1
    const/16 v2, 0x14

    if-ge v1, v2, :cond_1

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_1

    :cond_1
    invoke-static {v9, v10, v6}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    move v1, p1

    :goto_2
    if-ge v1, v0, :cond_2

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 v1, v1, 0x2

    goto :goto_2

    :cond_2
    invoke-static {v7, v9, v5}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v7}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    move v0, p1

    :goto_3
    const/16 v1, 0x32

    if-ge v0, v1, :cond_3

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_3

    :cond_3
    invoke-static {v8, v10, v7}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v10, v8}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    move v0, p1

    :goto_4
    const/16 v2, 0x64

    if-ge v0, v2, :cond_4

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 v0, v0, 0x2

    goto :goto_4

    :cond_4
    invoke-static {v10, v9, v8}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    :goto_5
    if-ge p1, v1, :cond_5

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    add-int/lit8 p1, p1, 0x2

    goto :goto_5

    :cond_5
    invoke-static {v9, v10, v7}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v9, v10}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {v10, v9}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    invoke-static {p0, v10, v3}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    return-void
.end method

.method public static k([J[J[J)V
    .locals 1

    const/16 v0, 0x13

    new-array v0, v0, [J

    invoke-static {v0, p1, p2}, Lcom/google/crypto/tink/internal/a;->l([J[J[J)V

    invoke-static {v0, p0}, Lcom/google/crypto/tink/internal/a;->m([J[J)V

    return-void
.end method

.method public static l([J[J[J)V
    .locals 44

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    mul-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v1, p1, v0

    const/4 v3, 0x1

    aget-wide v4, p2, v3

    mul-long/2addr v4, v1

    aget-wide v6, p1, v3

    aget-wide v8, p2, v0

    mul-long/2addr v6, v8

    add-long/2addr v6, v4

    aput-wide v6, p0, v3

    aget-wide v4, p1, v3

    const-wide/16 v6, 0x2

    mul-long v10, v4, v6

    aget-wide v12, p2, v3

    mul-long/2addr v10, v12

    const/4 v0, 0x2

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long/2addr v14, v10

    aget-wide v10, p1, v0

    mul-long/2addr v10, v8

    add-long/2addr v10, v14

    aput-wide v10, p0, v0

    aget-wide v10, p2, v0

    mul-long v14, v4, v10

    aget-wide v16, p1, v0

    mul-long v18, v16, v12

    add-long v18, v18, v14

    const/4 v0, 0x3

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long v14, v14, v18

    aget-wide v18, p1, v0

    mul-long v18, v18, v8

    add-long v18, v18, v14

    aput-wide v18, p0, v0

    mul-long v14, v16, v10

    aget-wide v18, p2, v0

    mul-long v20, v4, v18

    aget-wide v22, p1, v0

    mul-long v24, v22, v12

    add-long v24, v24, v20

    mul-long v24, v24, v6

    add-long v24, v24, v14

    const/4 v0, 0x4

    aget-wide v14, p2, v0

    mul-long/2addr v14, v1

    add-long v14, v14, v24

    aget-wide v20, p1, v0

    mul-long v20, v20, v8

    add-long v20, v20, v14

    aput-wide v20, p0, v0

    mul-long v14, v16, v18

    mul-long v20, v22, v10

    add-long v20, v20, v14

    aget-wide v14, p2, v0

    mul-long v24, v4, v14

    add-long v24, v24, v20

    aget-wide v20, p1, v0

    mul-long v26, v20, v12

    add-long v26, v26, v24

    const/4 v0, 0x5

    aget-wide v24, p2, v0

    mul-long v24, v24, v1

    add-long v24, v24, v26

    aget-wide v26, p1, v0

    mul-long v26, v26, v8

    add-long v26, v26, v24

    aput-wide v26, p0, v0

    mul-long v24, v22, v18

    aget-wide v26, p2, v0

    mul-long v28, v4, v26

    add-long v28, v28, v24

    aget-wide v24, p1, v0

    mul-long v30, v24, v12

    add-long v30, v30, v28

    mul-long v30, v30, v6

    mul-long v28, v16, v14

    add-long v28, v28, v30

    mul-long v30, v20, v10

    add-long v30, v30, v28

    const/4 v0, 0x6

    aget-wide v28, p2, v0

    mul-long v28, v28, v1

    add-long v28, v28, v30

    aget-wide v30, p1, v0

    mul-long v30, v30, v8

    add-long v30, v30, v28

    aput-wide v30, p0, v0

    mul-long v28, v22, v14

    mul-long v30, v20, v18

    add-long v30, v30, v28

    mul-long v28, v16, v26

    add-long v28, v28, v30

    mul-long v30, v24, v10

    add-long v30, v30, v28

    aget-wide v28, p2, v0

    mul-long v32, v4, v28

    add-long v32, v32, v30

    aget-wide v30, p1, v0

    mul-long v34, v30, v12

    add-long v34, v34, v32

    const/4 v0, 0x7

    aget-wide v32, p2, v0

    mul-long v32, v32, v1

    add-long v32, v32, v34

    aget-wide v34, p1, v0

    mul-long v34, v34, v8

    add-long v34, v34, v32

    aput-wide v34, p0, v0

    mul-long v32, v20, v14

    mul-long v34, v22, v26

    mul-long v36, v24, v18

    add-long v36, v36, v34

    aget-wide v34, p2, v0

    mul-long v38, v4, v34

    add-long v38, v38, v36

    aget-wide v36, p1, v0

    mul-long v40, v36, v12

    add-long v40, v40, v38

    mul-long v40, v40, v6

    add-long v40, v40, v32

    mul-long v32, v16, v28

    add-long v32, v32, v40

    mul-long v38, v30, v10

    add-long v38, v38, v32

    const/16 v0, 0x8

    aget-wide v32, p2, v0

    mul-long v32, v32, v1

    add-long v32, v32, v38

    aget-wide v38, p1, v0

    mul-long v38, v38, v8

    add-long v38, v38, v32

    aput-wide v38, p0, v0

    mul-long v32, v20, v26

    mul-long v38, v24, v14

    add-long v38, v38, v32

    mul-long v32, v22, v28

    add-long v32, v32, v38

    mul-long v38, v30, v18

    add-long v38, v38, v32

    mul-long v32, v16, v34

    add-long v32, v32, v38

    mul-long v38, v36, v10

    add-long v38, v38, v32

    aget-wide v32, p2, v0

    mul-long v40, v4, v32

    add-long v40, v40, v38

    aget-wide v38, p1, v0

    mul-long v42, v38, v12

    add-long v42, v42, v40

    const/16 v0, 0x9

    aget-wide v40, p2, v0

    mul-long v1, v1, v40

    add-long v1, v1, v42

    aget-wide v40, p1, v0

    mul-long v40, v40, v8

    add-long v40, v40, v1

    aput-wide v40, p0, v0

    mul-long v1, v24, v26

    mul-long v8, v22, v34

    add-long/2addr v8, v1

    mul-long v1, v36, v18

    add-long/2addr v1, v8

    aget-wide v8, p2, v0

    mul-long/2addr v4, v8

    add-long/2addr v4, v1

    aget-wide v0, p1, v0

    mul-long/2addr v12, v0

    add-long/2addr v12, v4

    mul-long/2addr v12, v6

    mul-long v2, v20, v28

    add-long/2addr v2, v12

    mul-long v4, v30, v14

    add-long/2addr v4, v2

    mul-long v2, v16, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v10

    add-long/2addr v4, v2

    const/16 v2, 0xa

    aput-wide v4, p0, v2

    mul-long v2, v24, v28

    mul-long v4, v30, v26

    add-long/2addr v4, v2

    mul-long v2, v20, v34

    add-long/2addr v2, v4

    mul-long v4, v36, v14

    add-long/2addr v4, v2

    mul-long v2, v22, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v18

    add-long/2addr v4, v2

    mul-long v16, v16, v8

    add-long v16, v16, v4

    mul-long/2addr v10, v0

    add-long v10, v10, v16

    const/16 v2, 0xb

    aput-wide v10, p0, v2

    mul-long v2, v30, v28

    mul-long v4, v24, v34

    mul-long v10, v36, v26

    add-long/2addr v10, v4

    mul-long v22, v22, v8

    add-long v22, v22, v10

    mul-long v18, v18, v0

    add-long v18, v18, v22

    mul-long v18, v18, v6

    add-long v18, v18, v2

    mul-long v2, v20, v32

    add-long v2, v2, v18

    mul-long v4, v38, v14

    add-long/2addr v4, v2

    const/16 v2, 0xc

    aput-wide v4, p0, v2

    mul-long v2, v30, v34

    mul-long v4, v36, v28

    add-long/2addr v4, v2

    mul-long v2, v24, v32

    add-long/2addr v2, v4

    mul-long v4, v38, v26

    add-long/2addr v4, v2

    mul-long v20, v20, v8

    add-long v20, v20, v4

    mul-long/2addr v14, v0

    add-long v14, v14, v20

    const/16 v2, 0xd

    aput-wide v14, p0, v2

    mul-long v2, v36, v34

    mul-long v24, v24, v8

    add-long v24, v24, v2

    mul-long v26, v26, v0

    add-long v26, v26, v24

    mul-long v26, v26, v6

    mul-long v2, v30, v32

    add-long v2, v2, v26

    mul-long v4, v38, v28

    add-long/2addr v4, v2

    const/16 v2, 0xe

    aput-wide v4, p0, v2

    mul-long v2, v36, v32

    mul-long v4, v38, v34

    add-long/2addr v4, v2

    mul-long v30, v30, v8

    add-long v30, v30, v4

    mul-long v28, v28, v0

    add-long v28, v28, v30

    const/16 v2, 0xf

    aput-wide v28, p0, v2

    mul-long v2, v38, v32

    mul-long v36, v36, v8

    mul-long v34, v34, v0

    add-long v34, v34, v36

    mul-long v34, v34, v6

    add-long v34, v34, v2

    const/16 v2, 0x10

    aput-wide v34, p0, v2

    mul-long v38, v38, v8

    mul-long v32, v32, v0

    add-long v32, v32, v38

    const/16 v2, 0x11

    aput-wide v32, p0, v2

    mul-long/2addr v0, v6

    mul-long/2addr v0, v8

    const/16 v2, 0x12

    aput-wide v0, p0, v2

    return-void
.end method

.method public static m([J[J)V
    .locals 3

    array-length v0, p0

    const/4 v1, 0x0

    const/16 v2, 0x13

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v0, v2, [J

    array-length v2, p0

    invoke-static {p0, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    move-object p0, v0

    :goto_0
    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->o([J)V

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->n([J)V

    const/16 v0, 0xa

    invoke-static {p0, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method public static n([J)V
    .locals 14

    const/16 v0, 0xa

    const-wide/16 v1, 0x0

    aput-wide v1, p0, v0

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/16 v5, 0x1a

    const-wide/32 v6, 0x4000000

    if-ge v4, v0, :cond_0

    aget-wide v8, p0, v4

    div-long v6, v8, v6

    shl-long v10, v6, v5

    sub-long/2addr v8, v10

    aput-wide v8, p0, v4

    add-int/lit8 v5, v4, 0x1

    aget-wide v8, p0, v5

    add-long/2addr v8, v6

    aput-wide v8, p0, v5

    const-wide/32 v6, 0x2000000

    div-long v6, v8, v6

    const/16 v10, 0x19

    shl-long v10, v6, v10

    sub-long/2addr v8, v10

    aput-wide v8, p0, v5

    add-int/lit8 v4, v4, 0x2

    aget-wide v8, p0, v4

    add-long/2addr v8, v6

    aput-wide v8, p0, v4

    goto :goto_0

    :cond_0
    aget-wide v8, p0, v3

    aget-wide v10, p0, v0

    const/4 v4, 0x4

    shl-long v12, v10, v4

    add-long/2addr v8, v12

    aput-wide v8, p0, v3

    const/4 v4, 0x1

    shl-long v12, v10, v4

    add-long/2addr v8, v12

    aput-wide v8, p0, v3

    add-long/2addr v8, v10

    aput-wide v8, p0, v3

    aput-wide v1, p0, v0

    div-long v0, v8, v6

    shl-long v5, v0, v5

    sub-long/2addr v8, v5

    aput-wide v8, p0, v3

    aget-wide v2, p0, v4

    add-long/2addr v2, v0

    aput-wide v2, p0, v4

    return-void
.end method

.method public static o([J)V
    .locals 9

    const/16 v0, 0x8

    aget-wide v1, p0, v0

    const/16 v3, 0x12

    aget-wide v3, p0, v3

    const/4 v5, 0x4

    shl-long v6, v3, v5

    add-long/2addr v1, v6

    aput-wide v1, p0, v0

    const/4 v6, 0x1

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x7

    aget-wide v1, p0, v0

    const/16 v3, 0x11

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x6

    aget-wide v1, p0, v0

    const/16 v3, 0x10

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x5

    aget-wide v1, p0, v0

    const/16 v3, 0xf

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v5

    const/16 v2, 0xe

    aget-wide v2, p0, v2

    shl-long v7, v2, v5

    add-long/2addr v0, v7

    aput-wide v0, p0, v5

    shl-long v7, v2, v6

    add-long/2addr v0, v7

    aput-wide v0, p0, v5

    add-long/2addr v0, v2

    aput-wide v0, p0, v5

    const/4 v0, 0x3

    aget-wide v1, p0, v0

    const/16 v3, 0xd

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    const/4 v0, 0x2

    aget-wide v1, p0, v0

    const/16 v3, 0xc

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v7, v3, v6

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    aget-wide v0, p0, v6

    const/16 v2, 0xb

    aget-wide v2, p0, v2

    shl-long v7, v2, v5

    add-long/2addr v0, v7

    aput-wide v0, p0, v6

    shl-long v7, v2, v6

    add-long/2addr v0, v7

    aput-wide v0, p0, v6

    add-long/2addr v0, v2

    aput-wide v0, p0, v6

    const/4 v0, 0x0

    aget-wide v1, p0, v0

    const/16 v3, 0xa

    aget-wide v3, p0, v3

    shl-long v7, v3, v5

    add-long/2addr v1, v7

    aput-wide v1, p0, v0

    shl-long v5, v3, v6

    add-long/2addr v1, v5

    aput-wide v1, p0, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    return-void
.end method

.method public static p([B)[B
    .locals 8

    const/16 v0, 0x40

    new-array v1, v0, [B

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/16 v4, 0x20

    const/4 v5, 0x1

    if-ge v3, v4, :cond_0

    mul-int/lit8 v4, v3, 0x2

    aget-byte v6, p0, v3

    and-int/lit8 v6, v6, 0xf

    int-to-byte v6, v6

    aput-byte v6, v1, v4

    add-int/2addr v4, v5

    aget-byte v5, p0, v3

    and-int/lit16 v5, v5, 0xff

    shr-int/lit8 v5, v5, 0x4

    and-int/lit8 v5, v5, 0xf

    int-to-byte v5, v5

    aput-byte v5, v1, v4

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    move p0, v2

    move v3, p0

    :goto_1
    const/16 v4, 0x3f

    if-ge p0, v4, :cond_1

    aget-byte v4, v1, p0

    add-int/2addr v4, v3

    int-to-byte v3, v4

    aput-byte v3, v1, p0

    add-int/lit8 v4, v3, 0x8

    shr-int/lit8 v4, v4, 0x4

    shl-int/lit8 v6, v4, 0x4

    sub-int/2addr v3, v6

    int-to-byte v3, v3

    aput-byte v3, v1, p0

    add-int/lit8 p0, p0, 0x1

    move v3, v4

    goto :goto_1

    :cond_1
    aget-byte p0, v1, v4

    add-int/2addr p0, v3

    int-to-byte p0, p0

    aput-byte p0, v1, v4

    new-instance p0, Lqg3/d;

    const/4 v3, 0x7

    const/4 v4, 0x0

    invoke-direct {p0, v3, v4}, Lqg3/d;-><init>(IB)V

    new-instance v3, Lxl/a;

    const/4 v4, 0x7

    invoke-direct {v3, v4}, Lxl/a;-><init>(I)V

    :goto_2
    if-ge v5, v0, :cond_2

    new-instance v4, Lcom/google/crypto/tink/internal/b;

    invoke-direct {v4}, Lcom/google/crypto/tink/internal/b;-><init>()V

    div-int/lit8 v6, v5, 0x2

    aget-byte v7, v1, v5

    invoke-static {v4, v6, v7}, Lcom/google/crypto/tink/internal/a;->q(Lcom/google/crypto/tink/internal/b;IB)V

    invoke-static {v3, p0}, Lxl/a;->q(Lxl/a;Lqg3/d;)V

    invoke-static {p0, v3, v4}, Lcom/google/crypto/tink/internal/a;->a(Lqg3/d;Lxl/a;Lcom/google/crypto/tink/internal/b;)V

    add-int/lit8 v5, v5, 0x2

    goto :goto_2

    :cond_2
    new-instance v4, La33/d;

    const/16 v5, 0x9

    invoke-direct {v4, v5}, La33/d;-><init>(I)V

    invoke-static {v4, p0}, La33/d;->n(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, Lcom/google/crypto/tink/internal/a;->d(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, La33/d;->n(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, Lcom/google/crypto/tink/internal/a;->d(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, La33/d;->n(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, Lcom/google/crypto/tink/internal/a;->d(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, La33/d;->n(La33/d;Lqg3/d;)V

    invoke-static {v4, p0}, Lcom/google/crypto/tink/internal/a;->d(La33/d;Lqg3/d;)V

    :goto_3
    if-ge v2, v0, :cond_3

    new-instance v4, Lcom/google/crypto/tink/internal/b;

    invoke-direct {v4}, Lcom/google/crypto/tink/internal/b;-><init>()V

    div-int/lit8 v5, v2, 0x2

    aget-byte v6, v1, v2

    invoke-static {v4, v5, v6}, Lcom/google/crypto/tink/internal/a;->q(Lcom/google/crypto/tink/internal/b;IB)V

    invoke-static {v3, p0}, Lxl/a;->q(Lxl/a;Lqg3/d;)V

    invoke-static {p0, v3, v4}, Lcom/google/crypto/tink/internal/a;->a(Lqg3/d;Lxl/a;Lcom/google/crypto/tink/internal/b;)V

    add-int/lit8 v2, v2, 0x2

    goto :goto_3

    :cond_3
    new-instance v0, La33/d;

    invoke-direct {v0, p0}, La33/d;-><init>(Lqg3/d;)V

    const/16 p0, 0xa

    new-array v1, p0, [J

    iget-object v2, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v2, [J

    invoke-static {v1, v2}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    new-array v2, p0, [J

    iget-object v3, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v3, [J

    invoke-static {v2, v3}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    new-array v3, p0, [J

    iget-object v4, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v4, [J

    invoke-static {v3, v4}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    new-array v4, p0, [J

    invoke-static {v4, v3}, Lcom/google/crypto/tink/internal/a;->r([J[J)V

    new-array v5, p0, [J

    invoke-static {v5, v2, v1}, Lcom/google/crypto/tink/internal/a;->s([J[J[J)V

    invoke-static {v5, v5, v3}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    new-array p0, p0, [J

    invoke-static {p0, v1, v2}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    sget-object v1, Lcom/google/crypto/tink/internal/c;->a:[J

    invoke-static {p0, p0, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {p0, p0, v4}, Lcom/google/crypto/tink/internal/a;->t([J[J[J)V

    invoke-static {p0, p0}, Lcom/google/crypto/tink/internal/a;->m([J[J)V

    invoke-static {v5}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object v1

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object p0

    invoke-static {v1, p0}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    move-result p0

    if-eqz p0, :cond_4

    const/16 p0, 0xa

    new-array v1, p0, [J

    new-array v2, p0, [J

    new-array p0, p0, [J

    iget-object v3, v0, La33/d;->z:Ljava/lang/Object;

    check-cast v3, [J

    invoke-static {v1, v3}, Lcom/google/crypto/tink/internal/a;->j([J[J)V

    iget-object v3, v0, La33/d;->x:Ljava/lang/Object;

    check-cast v3, [J

    invoke-static {v2, v3, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    iget-object v0, v0, La33/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    invoke-static {p0, v0, v1}, Lcom/google/crypto/tink/internal/a;->k([J[J[J)V

    invoke-static {p0}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object p0

    const/16 v0, 0x1f

    aget-byte v1, p0, v0

    invoke-static {v2}, Lcom/google/crypto/tink/internal/a;->b([J)[B

    move-result-object v2

    const/4 v3, 0x0

    aget-byte v2, v2, v3

    and-int/lit8 v2, v2, 0x1

    shl-int/lit8 v2, v2, 0x7

    xor-int/2addr v1, v2

    int-to-byte v1, v1

    aput-byte v1, p0, v0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "arithmetic error in scalar multiplication"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static q(Lcom/google/crypto/tink/internal/b;IB)V
    .locals 8

    and-int/lit16 v0, p2, 0xff

    const/4 v1, 0x7

    shr-int/2addr v0, v1

    neg-int v2, v0

    and-int/2addr v2, p2

    const/4 v3, 0x1

    shl-int/2addr v2, v3

    sub-int/2addr p2, v2

    sget-object v2, Lcom/google/crypto/tink/internal/c;->b:[[Lcom/google/crypto/tink/internal/b;

    aget-object v4, v2, p1

    const/4 v5, 0x0

    aget-object v4, v4, v5

    invoke-static {p2, v3}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v4, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v4, v2, p1

    aget-object v3, v4, v3

    const/4 v4, 0x2

    invoke-static {p2, v4}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v3, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x3

    invoke-static {p2, v4}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v3, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x4

    invoke-static {p2, v4}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v3, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x5

    invoke-static {p2, v4}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v3, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    const/4 v4, 0x6

    invoke-static {p2, v4}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v6

    invoke-virtual {p0, v3, v6}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object v3, v2, p1

    aget-object v3, v3, v4

    invoke-static {p2, v1}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result v4

    invoke-virtual {p0, v3, v4}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    aget-object p1, v2, p1

    aget-object p1, p1, v1

    const/16 v1, 0x8

    invoke-static {p2, v1}, Lcom/google/crypto/tink/internal/a;->e(II)I

    move-result p2

    invoke-virtual {p0, p1, p2}, Lcom/google/crypto/tink/internal/b;->a(Lcom/google/crypto/tink/internal/b;I)V

    iget-object p1, p0, Lcom/google/crypto/tink/internal/b;->b:[J

    const/16 p2, 0xa

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v1

    iget-object v2, p0, Lcom/google/crypto/tink/internal/b;->a:[J

    invoke-static {v2, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object v3

    iget-object p0, p0, Lcom/google/crypto/tink/internal/b;->c:[J

    invoke-static {p0, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p2

    :goto_0
    array-length v4, p2

    if-ge v5, v4, :cond_0

    aget-wide v6, p2, v5

    neg-long v6, v6

    aput-wide v6, p2, v5

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2, v1, v0}, Lcom/google/crypto/tink/internal/a;->c([J[JI)V

    invoke-static {p1, v3, v0}, Lcom/google/crypto/tink/internal/a;->c([J[JI)V

    invoke-static {p0, p2, v0}, Lcom/google/crypto/tink/internal/a;->c([J[JI)V

    return-void
.end method

.method public static r([J[J)V
    .locals 59

    const/4 v0, 0x0

    aget-wide v1, p1, v0

    mul-long v3, v1, v1

    const-wide/16 v5, 0x2

    mul-long v7, v1, v5

    const/4 v9, 0x1

    aget-wide v10, p1, v9

    mul-long v12, v7, v10

    mul-long v14, v10, v10

    const/16 v16, 0x2

    aget-wide v17, p1, v16

    mul-long v19, v1, v17

    add-long v19, v19, v14

    mul-long v19, v19, v5

    mul-long v14, v10, v17

    const/16 v21, 0x3

    aget-wide v22, p1, v21

    mul-long v24, v1, v22

    add-long v24, v24, v14

    mul-long v24, v24, v5

    mul-long v14, v17, v17

    const-wide/16 v26, 0x4

    mul-long v28, v10, v26

    mul-long v28, v28, v22

    add-long v28, v28, v14

    const/4 v14, 0x4

    aget-wide v30, p1, v14

    mul-long v7, v7, v30

    add-long v7, v7, v28

    mul-long v28, v17, v22

    mul-long v32, v10, v30

    add-long v32, v32, v28

    const/4 v15, 0x5

    aget-wide v28, p1, v15

    mul-long v34, v1, v28

    add-long v34, v34, v32

    mul-long v34, v34, v5

    mul-long v32, v22, v22

    mul-long v36, v17, v30

    add-long v36, v36, v32

    const/16 v32, 0x6

    aget-wide v38, p1, v32

    mul-long v40, v1, v38

    add-long v40, v40, v36

    mul-long v36, v10, v5

    mul-long v36, v36, v28

    add-long v36, v36, v40

    mul-long v36, v36, v5

    mul-long v40, v22, v30

    mul-long v42, v17, v28

    add-long v42, v42, v40

    mul-long v40, v10, v38

    add-long v40, v40, v42

    const/16 v33, 0x7

    aget-wide v42, p1, v33

    mul-long v44, v1, v42

    add-long v44, v44, v40

    mul-long v44, v44, v5

    mul-long v40, v30, v30

    mul-long v46, v17, v38

    const/16 v48, 0x8

    aget-wide v49, p1, v48

    mul-long v51, v1, v49

    add-long v51, v51, v46

    mul-long v46, v10, v42

    mul-long v53, v22, v28

    add-long v53, v53, v46

    mul-long v53, v53, v5

    add-long v53, v53, v51

    mul-long v53, v53, v5

    add-long v53, v53, v40

    mul-long v40, v30, v28

    mul-long v46, v22, v38

    add-long v46, v46, v40

    mul-long v40, v17, v42

    add-long v40, v40, v46

    mul-long v46, v10, v49

    add-long v46, v46, v40

    const/16 v40, 0x9

    aget-wide v51, p1, v40

    mul-long v1, v1, v51

    add-long v1, v1, v46

    mul-long/2addr v1, v5

    mul-long v46, v28, v28

    mul-long v55, v30, v38

    add-long v55, v55, v46

    mul-long v46, v17, v49

    add-long v46, v46, v55

    mul-long v55, v22, v42

    mul-long v10, v10, v51

    add-long v10, v10, v55

    mul-long/2addr v10, v5

    add-long v10, v10, v46

    mul-long/2addr v10, v5

    mul-long v46, v28, v38

    mul-long v55, v30, v42

    add-long v55, v55, v46

    mul-long v46, v22, v49

    add-long v46, v46, v55

    mul-long v17, v17, v51

    add-long v17, v17, v46

    mul-long v17, v17, v5

    mul-long v46, v38, v38

    mul-long v55, v30, v49

    mul-long v57, v28, v42

    mul-long v22, v22, v51

    add-long v22, v22, v57

    mul-long v22, v22, v5

    add-long v22, v22, v55

    mul-long v22, v22, v5

    add-long v22, v22, v46

    mul-long v46, v38, v42

    mul-long v55, v28, v49

    add-long v55, v55, v46

    mul-long v30, v30, v51

    add-long v30, v30, v55

    mul-long v30, v30, v5

    mul-long v46, v42, v42

    mul-long v55, v38, v49

    add-long v55, v55, v46

    mul-long v28, v28, v5

    mul-long v28, v28, v51

    add-long v28, v28, v55

    mul-long v28, v28, v5

    mul-long v46, v42, v49

    mul-long v38, v38, v51

    add-long v38, v38, v46

    mul-long v38, v38, v5

    mul-long v46, v49, v49

    mul-long v42, v42, v26

    mul-long v42, v42, v51

    add-long v42, v42, v46

    mul-long v49, v49, v5

    mul-long v49, v49, v51

    mul-long v5, v5, v51

    mul-long v5, v5, v51

    move/from16 v26, v0

    const/16 v0, 0x13

    new-array v0, v0, [J

    aput-wide v3, v0, v26

    aput-wide v12, v0, v9

    aput-wide v19, v0, v16

    aput-wide v24, v0, v21

    aput-wide v7, v0, v14

    aput-wide v34, v0, v15

    aput-wide v36, v0, v32

    aput-wide v44, v0, v33

    aput-wide v53, v0, v48

    aput-wide v1, v0, v40

    const/16 v1, 0xa

    aput-wide v10, v0, v1

    const/16 v1, 0xb

    aput-wide v17, v0, v1

    const/16 v1, 0xc

    aput-wide v22, v0, v1

    const/16 v1, 0xd

    aput-wide v30, v0, v1

    const/16 v1, 0xe

    aput-wide v28, v0, v1

    const/16 v1, 0xf

    aput-wide v38, v0, v1

    const/16 v1, 0x10

    aput-wide v42, v0, v1

    const/16 v1, 0x11

    aput-wide v49, v0, v1

    const/16 v1, 0x12

    aput-wide v5, v0, v1

    move-object/from16 v1, p0

    invoke-static {v0, v1}, Lcom/google/crypto/tink/internal/a;->m([J[J)V

    return-void
.end method

.method public static s([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    sub-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static t([J[J[J)V
    .locals 5

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p1, v0

    aget-wide v3, p2, v0

    add-long/2addr v1, v3

    aput-wide v1, p0, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static u([J[JI)V
    .locals 5

    neg-int p2, p2

    const/4 v0, 0x0

    :goto_0
    const/16 v1, 0xa

    if-ge v0, v1, :cond_0

    aget-wide v1, p0, v0

    long-to-int v1, v1

    aget-wide v2, p1, v0

    long-to-int v2, v2

    xor-int/2addr v2, v1

    and-int/2addr v2, p2

    xor-int/2addr v1, v2

    int-to-long v3, v1

    aput-wide v3, p0, v0

    aget-wide v3, p1, v0

    long-to-int v1, v3

    xor-int/2addr v1, v2

    int-to-long v1, v1

    aput-wide v1, p1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static v(Ljava/math/BigInteger;)[B
    .locals 2

    invoke-virtual {p0}, Ljava/math/BigInteger;->signum()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    invoke-virtual {p0}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "n must not be negative"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static w(ILjava/math/BigInteger;)[B
    .locals 4

    invoke-virtual {p1}, Ljava/math/BigInteger;->signum()I

    move-result v0

    const/4 v1, -0x1

    if-eq v0, v1, :cond_4

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    array-length v0, p1

    if-ne v0, p0, :cond_0

    return-object p1

    :cond_0
    array-length v0, p1

    add-int/lit8 v1, p0, 0x1

    const-string v2, "integer too large"

    if-gt v0, v1, :cond_3

    array-length v0, p1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_2

    aget-byte p0, p1, v3

    if-nez p0, :cond_1

    array-length p0, p1

    const/4 v0, 0x1

    invoke-static {p1, v0, p0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-array v0, p0, [B

    array-length v1, p1

    sub-int/2addr p0, v1

    array-length v1, p1

    invoke-static {p1, v3, v0, p0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "integer must be nonnegative"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
