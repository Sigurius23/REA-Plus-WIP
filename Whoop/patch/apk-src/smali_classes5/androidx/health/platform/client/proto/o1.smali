.class public final Landroidx/health/platform/client/proto/o1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/health/platform/client/proto/u2;


# static fields
.field public static final n:[I

.field public static final o:Lsun/misc/Unsafe;


# instance fields
.field public final a:[I

.field public final b:[Ljava/lang/Object;

.field public final c:I

.field public final d:I

.field public final e:Landroidx/health/platform/client/proto/a;

.field public final f:Z

.field public final g:[I

.field public final h:I

.field public final i:I

.field public final j:Landroidx/health/platform/client/proto/q1;

.field public final k:Landroidx/health/platform/client/proto/d1;

.field public final l:Landroidx/health/platform/client/proto/d3;

.field public final m:Landroidx/health/platform/client/proto/k1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [I

    sput-object v0, Landroidx/health/platform/client/proto/o1;->n:[I

    invoke-static {}, Landroidx/health/platform/client/proto/n3;->j()Lsun/misc/Unsafe;

    move-result-object v0

    sput-object v0, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    return-void
.end method

.method public constructor <init>([I[Ljava/lang/Object;IILandroidx/health/platform/client/proto/a;Z[IIILandroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    iput-object p2, p0, Landroidx/health/platform/client/proto/o1;->b:[Ljava/lang/Object;

    iput p3, p0, Landroidx/health/platform/client/proto/o1;->c:I

    iput p4, p0, Landroidx/health/platform/client/proto/o1;->d:I

    iput-boolean p6, p0, Landroidx/health/platform/client/proto/o1;->f:Z

    iput-object p7, p0, Landroidx/health/platform/client/proto/o1;->g:[I

    iput p8, p0, Landroidx/health/platform/client/proto/o1;->h:I

    iput p9, p0, Landroidx/health/platform/client/proto/o1;->i:I

    iput-object p10, p0, Landroidx/health/platform/client/proto/o1;->j:Landroidx/health/platform/client/proto/q1;

    iput-object p11, p0, Landroidx/health/platform/client/proto/o1;->k:Landroidx/health/platform/client/proto/d1;

    iput-object p12, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    iput-object p5, p0, Landroidx/health/platform/client/proto/o1;->e:Landroidx/health/platform/client/proto/a;

    iput-object p14, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    return-void
.end method

.method public static A(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;
    .locals 1

    instance-of v0, p0, Landroidx/health/platform/client/proto/a2;

    if-eqz v0, :cond_0

    invoke-static/range {p0 .. p5}, Landroidx/health/platform/client/proto/o1;->B(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p0, Ljava/lang/ClassCastException;

    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    throw p0
.end method

.method public static B(Landroidx/health/platform/client/proto/a2;Landroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)Landroidx/health/platform/client/proto/o1;
    .locals 35

    move-object/from16 v0, p0

    iget v1, v0, Landroidx/health/platform/client/proto/a2;->d:I

    const/4 v2, 0x1

    and-int/2addr v1, v2

    const/4 v3, 0x0

    if-ne v1, v2, :cond_0

    move v10, v3

    goto :goto_0

    :cond_0
    move v10, v2

    :goto_0
    iget-object v1, v0, Landroidx/health/platform/client/proto/a2;->b:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v5

    const v6, 0xd800

    if-lt v5, v6, :cond_1

    move v5, v2

    :goto_1
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_2

    move v5, v7

    goto :goto_1

    :cond_1
    move v7, v2

    :cond_2
    add-int/lit8 v5, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    const/16 v8, 0xd

    if-lt v7, v6, :cond_4

    and-int/lit16 v7, v7, 0x1fff

    move v9, v8

    :goto_2
    add-int/lit8 v11, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_3

    and-int/lit16 v5, v5, 0x1fff

    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    add-int/lit8 v9, v9, 0xd

    move v5, v11

    goto :goto_2

    :cond_3
    shl-int/2addr v5, v9

    or-int/2addr v7, v5

    move v5, v11

    :cond_4
    if-nez v7, :cond_5

    sget-object v7, Landroidx/health/platform/client/proto/o1;->n:[I

    move v8, v3

    move v12, v8

    move v13, v12

    move v14, v13

    move v15, v14

    move-object v11, v7

    move v7, v15

    goto/16 :goto_b

    :cond_5
    add-int/lit8 v7, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    if-lt v5, v6, :cond_7

    and-int/lit16 v5, v5, 0x1fff

    move v9, v8

    :goto_3
    add-int/lit8 v11, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_6

    and-int/lit16 v7, v7, 0x1fff

    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    add-int/lit8 v9, v9, 0xd

    move v7, v11

    goto :goto_3

    :cond_6
    shl-int/2addr v7, v9

    or-int/2addr v5, v7

    move v7, v11

    :cond_7
    add-int/lit8 v9, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v6, :cond_9

    and-int/lit16 v7, v7, 0x1fff

    move v11, v8

    :goto_4
    add-int/lit8 v12, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_8

    and-int/lit16 v9, v9, 0x1fff

    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    add-int/lit8 v11, v11, 0xd

    move v9, v12

    goto :goto_4

    :cond_8
    shl-int/2addr v9, v11

    or-int/2addr v7, v9

    move v9, v12

    :cond_9
    add-int/lit8 v11, v9, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-lt v9, v6, :cond_b

    and-int/lit16 v9, v9, 0x1fff

    move v12, v8

    :goto_5
    add-int/lit8 v13, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_a

    and-int/lit16 v11, v11, 0x1fff

    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    add-int/lit8 v12, v12, 0xd

    move v11, v13

    goto :goto_5

    :cond_a
    shl-int/2addr v11, v12

    or-int/2addr v9, v11

    move v11, v13

    :cond_b
    add-int/lit8 v12, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v6, :cond_d

    and-int/lit16 v11, v11, 0x1fff

    move v13, v8

    :goto_6
    add-int/lit8 v14, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_c

    and-int/lit16 v12, v12, 0x1fff

    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    add-int/lit8 v13, v13, 0xd

    move v12, v14

    goto :goto_6

    :cond_c
    shl-int/2addr v12, v13

    or-int/2addr v11, v12

    move v12, v14

    :cond_d
    add-int/lit8 v13, v12, 0x1

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v12

    if-lt v12, v6, :cond_f

    and-int/lit16 v12, v12, 0x1fff

    move v14, v8

    :goto_7
    add-int/lit8 v15, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_e

    and-int/lit16 v13, v13, 0x1fff

    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    add-int/lit8 v14, v14, 0xd

    move v13, v15

    goto :goto_7

    :cond_e
    shl-int/2addr v13, v14

    or-int/2addr v12, v13

    move v13, v15

    :cond_f
    add-int/lit8 v14, v13, 0x1

    invoke-virtual {v1, v13}, Ljava/lang/String;->charAt(I)C

    move-result v13

    if-lt v13, v6, :cond_11

    and-int/lit16 v13, v13, 0x1fff

    move v15, v8

    :goto_8
    add-int/lit8 v16, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_10

    and-int/lit16 v14, v14, 0x1fff

    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    add-int/lit8 v15, v15, 0xd

    move/from16 v14, v16

    goto :goto_8

    :cond_10
    shl-int/2addr v14, v15

    or-int/2addr v13, v14

    move/from16 v14, v16

    :cond_11
    add-int/lit8 v15, v14, 0x1

    invoke-virtual {v1, v14}, Ljava/lang/String;->charAt(I)C

    move-result v14

    if-lt v14, v6, :cond_13

    and-int/lit16 v14, v14, 0x1fff

    move/from16 v16, v8

    :goto_9
    add-int/lit8 v17, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_12

    and-int/lit16 v15, v15, 0x1fff

    shl-int v15, v15, v16

    or-int/2addr v14, v15

    add-int/lit8 v16, v16, 0xd

    move/from16 v15, v17

    goto :goto_9

    :cond_12
    shl-int v15, v15, v16

    or-int/2addr v14, v15

    move/from16 v15, v17

    :cond_13
    add-int/lit8 v16, v15, 0x1

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v15

    if-lt v15, v6, :cond_15

    and-int/lit16 v15, v15, 0x1fff

    move/from16 v3, v16

    move/from16 v16, v8

    :goto_a
    add-int/lit8 v18, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-lt v3, v6, :cond_14

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v16

    or-int/2addr v15, v3

    add-int/lit8 v16, v16, 0xd

    move/from16 v3, v18

    goto :goto_a

    :cond_14
    shl-int v3, v3, v16

    or-int/2addr v15, v3

    move/from16 v16, v18

    :cond_15
    add-int v3, v15, v13

    add-int/2addr v3, v14

    new-array v3, v3, [I

    mul-int/lit8 v14, v5, 0x2

    add-int/2addr v14, v7

    move v7, v9

    move v8, v11

    move-object v11, v3

    move v3, v5

    move/from16 v5, v16

    :goto_b
    sget-object v9, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    iget-object v2, v0, Landroidx/health/platform/client/proto/a2;->c:[Ljava/lang/Object;

    iget-object v6, v0, Landroidx/health/platform/client/proto/a2;->a:Landroidx/health/platform/client/proto/a;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v6

    move-object/from16 v20, v2

    mul-int/lit8 v2, v12, 0x3

    new-array v2, v2, [I

    move-object/from16 v21, v2

    const/4 v2, 0x2

    mul-int/2addr v12, v2

    new-array v12, v12, [Ljava/lang/Object;

    add-int/2addr v13, v15

    move/from16 v25, v13

    move/from16 v24, v15

    const/4 v2, 0x0

    const/16 v22, 0x0

    :goto_c
    if-ge v5, v4, :cond_32

    add-int/lit8 v26, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    move/from16 v27, v3

    const v3, 0xd800

    if-lt v5, v3, :cond_17

    and-int/lit16 v5, v5, 0x1fff

    move/from16 v3, v26

    const/16 v26, 0xd

    :goto_d
    add-int/lit8 v28, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move/from16 v29, v4

    const v4, 0xd800

    if-lt v3, v4, :cond_16

    and-int/lit16 v3, v3, 0x1fff

    shl-int v3, v3, v26

    or-int/2addr v5, v3

    add-int/lit8 v26, v26, 0xd

    move/from16 v3, v28

    move/from16 v4, v29

    goto :goto_d

    :cond_16
    shl-int v3, v3, v26

    or-int/2addr v5, v3

    move/from16 v3, v28

    goto :goto_e

    :cond_17
    move/from16 v29, v4

    move/from16 v3, v26

    :goto_e
    add-int/lit8 v4, v3, 0x1

    invoke-virtual {v1, v3}, Ljava/lang/String;->charAt(I)C

    move-result v3

    move/from16 v26, v4

    const v4, 0xd800

    if-lt v3, v4, :cond_19

    and-int/lit16 v3, v3, 0x1fff

    move/from16 v4, v26

    const/16 v26, 0xd

    :goto_f
    add-int/lit8 v28, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move/from16 v30, v3

    const v3, 0xd800

    if-lt v4, v3, :cond_18

    and-int/lit16 v3, v4, 0x1fff

    shl-int v3, v3, v26

    or-int v3, v30, v3

    add-int/lit8 v26, v26, 0xd

    move/from16 v4, v28

    goto :goto_f

    :cond_18
    shl-int v3, v4, v26

    or-int v3, v30, v3

    move/from16 v4, v28

    goto :goto_10

    :cond_19
    move/from16 v4, v26

    :goto_10
    move/from16 v26, v5

    and-int/lit16 v5, v3, 0xff

    move/from16 v28, v7

    and-int/lit16 v7, v3, 0x400

    if-eqz v7, :cond_1a

    add-int/lit8 v7, v22, 0x1

    aput v2, v11, v22

    move/from16 v22, v7

    :cond_1a
    const/16 v7, 0x33

    move/from16 v32, v8

    if-lt v5, v7, :cond_22

    add-int/lit8 v7, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v8, 0xd800

    if-lt v4, v8, :cond_1c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v33, 0xd

    :goto_11
    add-int/lit8 v34, v7, 0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    if-lt v7, v8, :cond_1b

    and-int/lit16 v7, v7, 0x1fff

    shl-int v7, v7, v33

    or-int/2addr v4, v7

    add-int/lit8 v33, v33, 0xd

    move/from16 v7, v34

    const v8, 0xd800

    goto :goto_11

    :cond_1b
    shl-int v7, v7, v33

    or-int/2addr v4, v7

    move/from16 v7, v34

    :cond_1c
    add-int/lit8 v8, v5, -0x33

    move/from16 v33, v4

    const/16 v4, 0x9

    if-eq v8, v4, :cond_1d

    const/16 v4, 0x11

    if-ne v8, v4, :cond_1e

    :cond_1d
    move/from16 v30, v7

    const/4 v4, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    goto :goto_12

    :cond_1e
    const/16 v4, 0xc

    if-ne v8, v4, :cond_1f

    if-nez v10, :cond_1f

    move/from16 v30, v7

    const/4 v4, 0x3

    const/4 v7, 0x1

    const/4 v8, 0x2

    invoke-static {v2, v4, v8, v7}, Ld;->c(IIII)I

    move-result v4

    add-int/lit8 v18, v14, 0x1

    aget-object v14, v20, v14

    aput-object v14, v12, v4

    move/from16 v14, v18

    goto :goto_13

    :cond_1f
    move/from16 v30, v7

    const/4 v7, 0x1

    const/4 v8, 0x2

    goto :goto_13

    :goto_12
    invoke-static {v2, v4, v8, v7}, Ld;->c(IIII)I

    move-result v4

    add-int/lit8 v7, v14, 0x1

    aget-object v14, v20, v14

    aput-object v14, v12, v4

    move v14, v7

    :goto_13
    mul-int/lit8 v4, v33, 0x2

    aget-object v7, v20, v4

    instance-of v8, v7, Ljava/lang/reflect/Field;

    if-eqz v8, :cond_20

    check-cast v7, Ljava/lang/reflect/Field;

    goto :goto_14

    :cond_20
    check-cast v7, Ljava/lang/String;

    invoke-static {v6, v7}, Landroidx/health/platform/client/proto/o1;->J(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v7

    aput-object v7, v20, v4

    :goto_14
    invoke-virtual {v9, v7}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    add-int/lit8 v4, v4, 0x1

    aget-object v8, v20, v4

    move/from16 v31, v4

    instance-of v4, v8, Ljava/lang/reflect/Field;

    if-eqz v4, :cond_21

    check-cast v8, Ljava/lang/reflect/Field;

    :goto_15
    move v4, v7

    goto :goto_16

    :cond_21
    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, Landroidx/health/platform/client/proto/o1;->J(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    aput-object v8, v20, v31

    goto :goto_15

    :goto_16
    invoke-virtual {v9, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v7

    long-to-int v7, v7

    move/from16 v18, v30

    move-object/from16 v30, v11

    move/from16 v11, v18

    move/from16 v31, v2

    move/from16 v18, v10

    move-object v10, v12

    move v2, v14

    const/16 v23, 0x2

    move-object v14, v1

    move v1, v7

    move v7, v4

    const/4 v4, 0x0

    goto/16 :goto_21

    :cond_22
    add-int/lit8 v7, v14, 0x1

    aget-object v8, v20, v14

    check-cast v8, Ljava/lang/String;

    invoke-static {v6, v8}, Landroidx/health/platform/client/proto/o1;->J(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8

    move/from16 v33, v7

    const/16 v7, 0x9

    if-eq v5, v7, :cond_23

    const/16 v7, 0x11

    if-ne v5, v7, :cond_24

    :cond_23
    move/from16 v18, v10

    move-object/from16 v30, v11

    const/4 v7, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    goto/16 :goto_1a

    :cond_24
    const/16 v7, 0x1b

    if-eq v5, v7, :cond_25

    const/16 v7, 0x31

    if-ne v5, v7, :cond_26

    :cond_25
    move/from16 v18, v10

    move-object/from16 v30, v11

    const/4 v7, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    goto/16 :goto_19

    :cond_26
    const/16 v7, 0xc

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x1e

    if-eq v5, v7, :cond_2a

    const/16 v7, 0x2c

    if-ne v5, v7, :cond_27

    goto :goto_17

    :cond_27
    const/16 v7, 0x32

    if-ne v5, v7, :cond_29

    add-int/lit8 v7, v24, 0x1

    aput v2, v11, v24

    div-int/lit8 v24, v2, 0x3

    const/16 v23, 0x2

    mul-int/lit8 v24, v24, 0x2

    add-int/lit8 v30, v14, 0x2

    aget-object v31, v20, v33

    aput-object v31, v12, v24

    move/from16 v31, v7

    and-int/lit16 v7, v3, 0x800

    if-eqz v7, :cond_28

    add-int/lit8 v24, v24, 0x1

    add-int/lit8 v7, v14, 0x3

    aget-object v14, v20, v30

    aput-object v14, v12, v24

    move/from16 v18, v10

    move-object/from16 v30, v11

    move-object v10, v12

    move/from16 v24, v31

    goto :goto_1c

    :cond_28
    move/from16 v18, v10

    move-object v10, v12

    move/from16 v7, v30

    move/from16 v24, v31

    move-object/from16 v30, v11

    goto :goto_1c

    :cond_29
    move/from16 v18, v10

    move-object/from16 v30, v11

    const/4 v11, 0x1

    goto :goto_1b

    :cond_2a
    :goto_17
    if-nez v10, :cond_29

    move/from16 v18, v10

    move-object/from16 v30, v11

    const/4 v7, 0x3

    const/4 v10, 0x2

    const/4 v11, 0x1

    invoke-static {v2, v7, v10, v11}, Ld;->c(IIII)I

    move-result v7

    add-int/lit8 v14, v14, 0x2

    aget-object v23, v20, v33

    aput-object v23, v12, v7

    :goto_18
    move-object v10, v12

    move v7, v14

    goto :goto_1c

    :goto_19
    invoke-static {v2, v7, v10, v11}, Ld;->c(IIII)I

    move-result v7

    add-int/lit8 v14, v14, 0x2

    aget-object v23, v20, v33

    aput-object v23, v12, v7

    goto :goto_18

    :goto_1a
    invoke-static {v2, v7, v10, v11}, Ld;->c(IIII)I

    move-result v7

    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v12, v7

    :goto_1b
    move-object v10, v12

    move/from16 v7, v33

    :goto_1c
    invoke-virtual {v9, v8}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v11

    long-to-int v8, v11

    and-int/lit16 v11, v3, 0x1000

    const/16 v12, 0x1000

    if-ne v11, v12, :cond_2e

    const/16 v11, 0x11

    if-gt v5, v11, :cond_2e

    add-int/lit8 v11, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const v12, 0xd800

    if-lt v4, v12, :cond_2c

    and-int/lit16 v4, v4, 0x1fff

    const/16 v19, 0xd

    :goto_1d
    add-int/lit8 v31, v11, 0x1

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    if-lt v11, v12, :cond_2b

    and-int/lit16 v11, v11, 0x1fff

    shl-int v11, v11, v19

    or-int/2addr v4, v11

    add-int/lit8 v19, v19, 0xd

    move/from16 v11, v31

    goto :goto_1d

    :cond_2b
    shl-int v11, v11, v19

    or-int/2addr v4, v11

    move/from16 v11, v31

    :cond_2c
    const/16 v23, 0x2

    mul-int/lit8 v19, v27, 0x2

    div-int/lit8 v31, v4, 0x20

    add-int v31, v31, v19

    aget-object v12, v20, v31

    instance-of v14, v12, Ljava/lang/reflect/Field;

    if-eqz v14, :cond_2d

    check-cast v12, Ljava/lang/reflect/Field;

    :goto_1e
    move-object v14, v1

    move/from16 v31, v2

    goto :goto_1f

    :cond_2d
    check-cast v12, Ljava/lang/String;

    invoke-static {v6, v12}, Landroidx/health/platform/client/proto/o1;->J(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v12

    aput-object v12, v20, v31

    goto :goto_1e

    :goto_1f
    invoke-virtual {v9, v12}, Lsun/misc/Unsafe;->objectFieldOffset(Ljava/lang/reflect/Field;)J

    move-result-wide v1

    long-to-int v1, v1

    rem-int/lit8 v4, v4, 0x20

    goto :goto_20

    :cond_2e
    move-object v14, v1

    move/from16 v31, v2

    const/16 v23, 0x2

    const v1, 0xfffff

    move v11, v4

    const/4 v4, 0x0

    :goto_20
    const/16 v2, 0x12

    if-lt v5, v2, :cond_2f

    const/16 v2, 0x31

    if-gt v5, v2, :cond_2f

    add-int/lit8 v2, v25, 0x1

    aput v8, v30, v25

    move/from16 v25, v2

    :cond_2f
    move v2, v7

    move v7, v8

    :goto_21
    add-int/lit8 v8, v31, 0x1

    aput v26, v21, v31

    add-int/lit8 v12, v31, 0x2

    move/from16 v26, v1

    and-int/lit16 v1, v3, 0x200

    if-eqz v1, :cond_30

    const/high16 v1, 0x20000000

    goto :goto_22

    :cond_30
    const/4 v1, 0x0

    :goto_22
    and-int/lit16 v3, v3, 0x100

    if-eqz v3, :cond_31

    const/high16 v3, 0x10000000

    goto :goto_23

    :cond_31
    const/4 v3, 0x0

    :goto_23
    or-int/2addr v1, v3

    shl-int/lit8 v3, v5, 0x14

    or-int/2addr v1, v3

    or-int/2addr v1, v7

    aput v1, v21, v8

    add-int/lit8 v1, v31, 0x3

    shl-int/lit8 v3, v4, 0x14

    or-int v3, v3, v26

    aput v3, v21, v12

    move v3, v2

    move v2, v1

    move-object v1, v14

    move v14, v3

    move-object v12, v10

    move v5, v11

    move/from16 v10, v18

    move/from16 v3, v27

    move/from16 v7, v28

    move/from16 v4, v29

    move-object/from16 v11, v30

    move/from16 v8, v32

    goto/16 :goto_c

    :cond_32
    move/from16 v28, v7

    move/from16 v32, v8

    move/from16 v18, v10

    move-object/from16 v30, v11

    move-object v10, v12

    new-instance v4, Landroidx/health/platform/client/proto/o1;

    iget-object v9, v0, Landroidx/health/platform/client/proto/a2;->a:Landroidx/health/platform/client/proto/a;

    move-object/from16 v14, p1

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    move-object v6, v10

    move v12, v15

    move/from16 v10, v18

    move-object/from16 v5, v21

    move-object/from16 v15, p2

    move-object/from16 v18, p5

    invoke-direct/range {v4 .. v18}, Landroidx/health/platform/client/proto/o1;-><init>([I[Ljava/lang/Object;IILandroidx/health/platform/client/proto/a;Z[IIILandroidx/health/platform/client/proto/q1;Landroidx/health/platform/client/proto/d1;Landroidx/health/platform/client/proto/d3;Landroidx/health/platform/client/proto/m0;Landroidx/health/platform/client/proto/k1;)V

    return-object v4
.end method

.method public static C(JLjava/lang/Object;)I
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method public static D(JLjava/lang/Object;)J
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, p0, p1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide p0

    return-wide p0
.end method

.method public static J(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;
    .locals 5

    :try_start_0
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    return-object v3

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Field "

    const-string v3, " for "

    invoke-static {v2, p1, v3}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    const-string v2, " not found. Known fields are "

    invoke-static {p0, p1, v2}, Ld;->A(Ljava/lang/Class;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static O(I)I
    .locals 1

    const/high16 v0, 0xff00000

    and-int/2addr p0, v0

    ushr-int/lit8 p0, p0, 0x14

    return p0
.end method

.method public static S(ILjava/lang/Object;Landroidx/health/platform/client/proto/g1;)V
    .locals 1

    instance-of v0, p1, Ljava/lang/String;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/lang/String;

    iget-object p2, p2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast p2, Landroidx/health/platform/client/proto/k;

    const/4 v0, 0x2

    invoke-virtual {p2, p0, v0}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {p2, p1}, Landroidx/health/platform/client/proto/k;->N(Ljava/lang/String;)V

    return-void

    :cond_0
    check-cast p1, Landroidx/health/platform/client/proto/h;

    invoke-virtual {p2, p0, p1}, Landroidx/health/platform/client/proto/g1;->a(ILandroidx/health/platform/client/proto/h;)V

    return-void
.end method

.method public static k(Ljava/lang/Object;)V
    .locals 2

    invoke-static {p0}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Mutating immutable message: "

    invoke-static {p0, v1}, Lm4/a;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static l([BIILandroidx/health/platform/client/proto/v3;Ljava/lang/Class;Landroidx/health/platform/client/proto/d;)I
    .locals 6

    invoke-virtual {p3}, Ljava/lang/Enum;->ordinal()I

    move-result p3

    packed-switch p3, :pswitch_data_0

    :pswitch_0
    new-instance p0, Ljava/lang/RuntimeException;

    const-string p1, "unsupported field type."

    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_1
    invoke-static {p0, p1, p5}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget-wide p1, p5, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {p1, p2}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_2
    invoke-static {p0, p1, p5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget p1, p5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {p1}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_3
    invoke-static {p0, p1, p5}, Landroidx/health/platform/client/proto/z2;->a([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    return p0

    :pswitch_4
    sget-object p3, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    invoke-virtual {p3, p4}, Landroidx/health/platform/client/proto/y1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;

    move-result-object v1

    invoke-interface {v1}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    move-object v2, p0

    move v3, p1

    move v4, p2

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result p0

    invoke-interface {v1, v0}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    iput-object v0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_5
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v2, v3, v5}, Landroidx/health/platform/client/proto/z2;->f([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    return p0

    :pswitch_6
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v2, v3, v5}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget-wide p1, v5, Landroidx/health/platform/client/proto/d;->b:J

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_7
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    iput-object p0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/lit8 p1, v3, 0x4

    return p1

    :pswitch_8
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    iput-object p0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/lit8 p1, v3, 0x8

    return p1

    :pswitch_9
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v2, v3, v5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget p1, v5, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_a
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v2, v3, v5}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result p0

    iget-wide p1, v5, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    return p0

    :pswitch_b
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    iput-object p0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/lit8 p1, v3, 0x4

    return p1

    :pswitch_c
    move-object v2, p0

    move v3, p1

    move-object v5, p5

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    iput-object p0, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    add-int/lit8 p1, v3, 0x8

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_9
        :pswitch_7
        :pswitch_8
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static p(Ljava/lang/Object;)Landroidx/health/platform/client/proto/e3;
    .locals 2

    check-cast p0, Landroidx/health/platform/client/proto/u0;

    iget-object v0, p0, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    sget-object v1, Landroidx/health/platform/client/proto/e3;->f:Landroidx/health/platform/client/proto/e3;

    if-ne v0, v1, :cond_0

    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object v0

    iput-object v0, p0, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    :cond_0
    return-object v0
.end method

.method public static t(Ljava/lang/Object;)Z
    .locals 1

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return p0

    :cond_0
    instance-of v0, p0, Landroidx/health/platform/client/proto/u0;

    if-eqz v0, :cond_1

    check-cast p0, Landroidx/health/platform/client/proto/u0;

    invoke-virtual {p0}, Landroidx/health/platform/client/proto/u0;->i()Z

    move-result p0

    return p0

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;
    .locals 1

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, p1, p2, p0}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method


# virtual methods
.method public final E(Ljava/lang/Object;[BIIIJLandroidx/health/platform/client/proto/d;)I
    .locals 11

    move-wide/from16 v0, p6

    move-object/from16 v5, p8

    sget-object v2, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    move/from16 v3, p5

    invoke-virtual {p0, v3}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v2, p1, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    iget-object v6, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v6, v4

    check-cast v6, Landroidx/health/platform/client/proto/j1;

    iget-boolean v6, v6, Landroidx/health/platform/client/proto/j1;->w:Z

    if-nez v6, :cond_0

    sget-object v6, Landroidx/health/platform/client/proto/j1;->x:Landroidx/health/platform/client/proto/j1;

    invoke-virtual {v6}, Landroidx/health/platform/client/proto/j1;->c()Landroidx/health/platform/client/proto/j1;

    move-result-object v6

    invoke-static {v6, v4}, Landroidx/health/platform/client/proto/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/health/platform/client/proto/j1;

    invoke-virtual {v2, p1, v0, v1, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object v4, v6

    :cond_0
    check-cast v3, Landroidx/health/platform/client/proto/i1;

    iget-object p1, v3, Landroidx/health/platform/client/proto/i1;->a:Landroidx/health/platform/client/proto/h1;

    move-object v6, v4

    check-cast v6, Landroidx/health/platform/client/proto/j1;

    invoke-static {p2, p3, v5}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v0

    iget v1, v5, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v1, :cond_7

    sub-int v2, p4, v0

    if-gt v1, v2, :cond_7

    add-int v7, v0, v1

    iget-object v8, p1, Landroidx/health/platform/client/proto/h1;->c:Ljava/lang/Object;

    const-string v1, ""

    move-object v9, v1

    move-object v10, v8

    :goto_0
    if-ge v0, v7, :cond_5

    add-int/lit8 v1, v0, 0x1

    aget-byte v0, p2, v0

    if-gez v0, :cond_1

    invoke-static {v0, p2, v1, v5}, Landroidx/health/platform/client/proto/z2;->i(I[BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v0, v5, Landroidx/health/platform/client/proto/d;->a:I

    :cond_1
    ushr-int/lit8 v2, v0, 0x3

    and-int/lit8 v3, v0, 0x7

    const/4 v4, 0x1

    if-eq v2, v4, :cond_3

    const/4 v4, 0x2

    if-eq v2, v4, :cond_2

    goto :goto_2

    :cond_2
    iget-object v2, p1, Landroidx/health/platform/client/proto/h1;->b:Landroidx/health/platform/client/proto/v3;

    iget v4, v2, Landroidx/health/platform/client/proto/v3;->x:I

    if-ne v3, v4, :cond_4

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    move-object v0, p2

    move-object v3, v2

    move v2, p4

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/o1;->l([BIILandroidx/health/platform/client/proto/v3;Ljava/lang/Class;Landroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-object v10, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    :goto_1
    move v0, v1

    goto :goto_0

    :cond_3
    iget-object v2, p1, Landroidx/health/platform/client/proto/h1;->a:Landroidx/health/platform/client/proto/v3;

    iget v4, v2, Landroidx/health/platform/client/proto/v3;->x:I

    if-ne v3, v4, :cond_4

    const/4 v4, 0x0

    move-object v0, p2

    move-object v3, v2

    move v2, p4

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/o1;->l([BIILandroidx/health/platform/client/proto/v3;Ljava/lang/Class;Landroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-object v9, v5, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    goto :goto_1

    :cond_4
    :goto_2
    invoke-static {v0, p2, v1, p4, v5}, Landroidx/health/platform/client/proto/z2;->u(I[BIILandroidx/health/platform/client/proto/d;)I

    move-result v0

    goto :goto_0

    :cond_5
    if-ne v0, v7, :cond_6

    invoke-virtual {v6, v9, v10}, Landroidx/health/platform/client/proto/j1;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return v7

    :cond_6
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p1

    throw p1

    :cond_7
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object p1

    throw p1
.end method

.method public final F(Ljava/lang/Object;[BIIIIIIIJILandroidx/health/platform/client/proto/d;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v9, p6

    move/from16 v3, p7

    move-wide/from16 v4, p10

    move/from16 v10, p12

    sget-object v6, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    add-int/lit8 v7, v10, 0x2

    iget-object v8, v0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget v7, v8, v7

    const v8, 0xfffff

    and-int/2addr v7, v8

    int-to-long v7, v7

    const/4 v11, 0x5

    const/4 v12, 0x1

    const/4 v13, 0x2

    packed-switch p9, :pswitch_data_0

    :cond_0
    move/from16 v14, p3

    goto/16 :goto_5

    :pswitch_0
    const/4 v4, 0x3

    if-ne v3, v4, :cond_0

    invoke-virtual {v0, v9, v10, v1}, Landroidx/health/platform/client/proto/o1;->z(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    and-int/lit8 v2, v2, -0x8

    or-int/lit8 v7, v2, 0x4

    invoke-virtual {v0, v10}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/o1;

    move-object/from16 v4, p2

    move/from16 v5, p3

    move/from16 v6, p4

    move-object/from16 v8, p13

    invoke-virtual/range {v2 .. v8}, Landroidx/health/platform/client/proto/o1;->G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I

    move-result v2

    move-object v11, v8

    iput-object v3, v11, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v0, v1, v9, v3, v10}, Landroidx/health/platform/client/proto/o1;->N(Ljava/lang/Object;ILjava/lang/Object;I)V

    return v2

    :pswitch_1
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget-wide v10, v11, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v10, v11}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_2
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget v3, v11, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v3}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_3
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v11, v11, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v0, v10}, Landroidx/health/platform/client/proto/o1;->m(I)Landroidx/health/platform/client/proto/t1;

    move-result-object v10

    if-eqz v10, :cond_5

    if-eqz v11, :cond_3

    if-eq v11, v12, :cond_2

    if-eq v11, v13, :cond_1

    const/4 v10, 0x0

    goto :goto_0

    :cond_1
    sget-object v10, Landroidx/health/platform/client/proto/u1;->z:Landroidx/health/platform/client/proto/u1;

    goto :goto_0

    :cond_2
    sget-object v10, Landroidx/health/platform/client/proto/u1;->y:Landroidx/health/platform/client/proto/u1;

    goto :goto_0

    :cond_3
    sget-object v10, Landroidx/health/platform/client/proto/u1;->x:Landroidx/health/platform/client/proto/u1;

    :goto_0
    if-eqz v10, :cond_4

    goto :goto_1

    :cond_4
    invoke-static {v1}, Landroidx/health/platform/client/proto/o1;->p(Ljava/lang/Object;)Landroidx/health/platform/client/proto/e3;

    move-result-object v1

    int-to-long v4, v11

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v1, v2, v4}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    return v3

    :cond_5
    :goto_1
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v3

    :pswitch_4
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-ne v3, v13, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->a([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget-object v3, v11, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_5
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-ne v3, v13, :cond_a

    invoke-virtual {v0, v9, v10, v1}, Landroidx/health/platform/client/proto/o1;->z(IILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v0, v10}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v3

    move/from16 v6, p4

    move-object v7, v11

    move v5, v14

    move-object v4, v15

    invoke-static/range {v2 .. v7}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result v3

    invoke-virtual {v0, v1, v9, v2, v10}, Landroidx/health/platform/client/proto/o1;->N(Ljava/lang/Object;ILjava/lang/Object;I)V

    return v3

    :pswitch_6
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-ne v3, v13, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget v3, v11, Landroidx/health/platform/client/proto/d;->a:I

    if-nez v3, :cond_6

    const-string v3, ""

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_3

    :cond_6
    const/high16 v10, 0x20000000

    and-int v10, p8, v10

    if-eqz v10, :cond_8

    add-int v10, v2, v3

    sget-object v11, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v11, v15, v2, v10}, Landroidx/health/platform/client/proto/z2;->r([BII)Z

    move-result v10

    if-eqz v10, :cond_7

    goto :goto_2

    :cond_7
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->a()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_8
    :goto_2
    new-instance v10, Ljava/lang/String;

    sget-object v11, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v15, v2, v3, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v6, v1, v4, v5, v10}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/2addr v2, v3

    :goto_3
    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_7
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget-wide v10, v11, Landroidx/health/platform/client/proto/d;->b:J

    const-wide/16 v13, 0x0

    cmp-long v3, v10, v13

    if-eqz v3, :cond_9

    goto :goto_4

    :cond_9
    const/4 v12, 0x0

    :goto_4
    invoke-static {v12}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_8
    move-object/from16 v15, p2

    move/from16 v14, p3

    if-ne v3, v11, :cond_a

    invoke-static {v14, v15}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v14, 0x4

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_9
    move-object/from16 v15, p2

    move/from16 v14, p3

    if-ne v3, v12, :cond_a

    invoke-static {v14, v15}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v14, 0x8

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_a
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget v3, v11, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_b
    move-object/from16 v15, p2

    move/from16 v14, p3

    move-object/from16 v11, p13

    if-nez v3, :cond_a

    invoke-static {v15, v14, v11}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v2

    iget-wide v10, v11, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v6, v1, v4, v5, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_c
    move-object/from16 v15, p2

    move/from16 v14, p3

    if-ne v3, v11, :cond_a

    invoke-static {v14, v15}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v14, 0x4

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :pswitch_d
    move-object/from16 v15, p2

    move/from16 v14, p3

    if-ne v3, v12, :cond_a

    invoke-static {v14, v15}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v6, v1, v4, v5, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 v2, v14, 0x8

    invoke-virtual {v6, v1, v7, v8, v9}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return v2

    :cond_a
    :goto_5
    return v14

    nop

    :pswitch_data_0
    .packed-switch 0x33
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I
    .locals 35

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    move-object/from16 v9, p6

    invoke-static {v3}, Landroidx/health/platform/client/proto/o1;->k(Ljava/lang/Object;)V

    sget-object v2, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    move/from16 v6, p3

    const/4 v7, -0x1

    const/4 v8, 0x0

    const v10, 0xfffff

    const/4 v14, 0x0

    const/4 v15, 0x0

    :goto_0
    sget-object v16, Landroidx/health/platform/client/proto/u1;->x:Landroidx/health/platform/client/proto/u1;

    sget-object v17, Landroidx/health/platform/client/proto/u1;->y:Landroidx/health/platform/client/proto/u1;

    sget-object v18, Landroidx/health/platform/client/proto/u1;->z:Landroidx/health/platform/client/proto/u1;

    const/16 v19, 0x0

    const v20, 0xfffff

    iget-object v11, v1, Landroidx/health/platform/client/proto/o1;->a:[I

    const/16 p3, 0x3

    const/16 v22, 0x1

    if-ge v6, v5, :cond_25

    add-int/lit8 v15, v6, 0x1

    aget-byte v6, v4, v6

    if-gez v6, :cond_0

    invoke-static {v6, v4, v15, v9}, Landroidx/health/platform/client/proto/z2;->i(I[BILandroidx/health/platform/client/proto/d;)I

    move-result v15

    iget v6, v9, Landroidx/health/platform/client/proto/d;->a:I

    :cond_0
    move/from16 v32, v15

    move v15, v6

    move/from16 v6, v32

    ushr-int/lit8 v13, v15, 0x3

    move/from16 v24, v8

    and-int/lit8 v8, v15, 0x7

    iget v12, v1, Landroidx/health/platform/client/proto/o1;->d:I

    iget v4, v1, Landroidx/health/platform/client/proto/o1;->c:I

    if-le v13, v7, :cond_2

    div-int/lit8 v7, v24, 0x3

    if-lt v13, v4, :cond_1

    if-gt v13, v12, :cond_1

    invoke-virtual {v1, v13, v7}, Landroidx/health/platform/client/proto/o1;->L(II)I

    move-result v4

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    :goto_1
    const/4 v12, 0x0

    :goto_2
    const/4 v7, -0x1

    goto :goto_3

    :cond_2
    if-lt v13, v4, :cond_3

    if-gt v13, v12, :cond_3

    const/4 v12, 0x0

    invoke-virtual {v1, v13, v12}, Landroidx/health/platform/client/proto/o1;->L(II)I

    move-result v4

    goto :goto_2

    :cond_3
    const/4 v12, 0x0

    const/4 v4, -0x1

    goto :goto_2

    :goto_3
    if-ne v4, v7, :cond_4

    move/from16 v21, p3

    move-object/from16 v31, v2

    move v2, v6

    move/from16 v24, v7

    move/from16 v20, v10

    move-object/from16 v23, v11

    move v8, v12

    move/from16 v25, v8

    move v7, v13

    const/4 v0, 0x2

    move-object v10, v1

    move-object v11, v3

    move v3, v15

    move/from16 v1, p5

    goto/16 :goto_1a

    :cond_4
    add-int/lit8 v21, v4, 0x1

    aget v7, v11, v21

    move/from16 v25, v12

    invoke-static {v7}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v12

    and-int v5, v7, v20

    move/from16 v21, v6

    int-to-long v5, v5

    move-wide/from16 v26, v5

    const/16 v5, 0x11

    if-gt v12, v5, :cond_19

    add-int/lit8 v5, v4, 0x2

    aget v5, v11, v5

    ushr-int/lit8 v6, v5, 0x14

    shl-int v28, v22, v6

    and-int v5, v5, v20

    if-eq v5, v10, :cond_6

    move/from16 v6, v20

    move/from16 v20, v7

    if-eq v10, v6, :cond_5

    int-to-long v6, v10

    invoke-virtual {v2, v3, v6, v7, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_5
    int-to-long v6, v5

    invoke-virtual {v2, v3, v6, v7}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    move v14, v5

    move/from16 v30, v6

    goto :goto_4

    :cond_6
    move/from16 v20, v7

    move/from16 v30, v14

    move v14, v10

    :goto_4
    const/4 v5, 0x5

    packed-switch v12, :pswitch_data_0

    move-object v8, v2

    move-object v2, v3

    move/from16 v24, v4

    move-object v10, v9

    move/from16 v12, v21

    move/from16 v5, v22

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    goto/16 :goto_14

    :pswitch_0
    move/from16 v6, p3

    if-ne v8, v6, :cond_7

    invoke-virtual {v1, v4, v3}, Landroidx/health/platform/client/proto/o1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    shl-int/lit8 v6, v13, 0x3

    or-int/lit8 v6, v6, 0x4

    invoke-virtual {v1, v4}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/o1;

    move/from16 v8, p4

    move v12, v4

    move-object v4, v7

    move-object v10, v9

    move/from16 v7, v21

    const/16 v21, -0x1

    const v29, 0xfffff

    move v9, v6

    move-object/from16 v6, p2

    invoke-virtual/range {v4 .. v10}, Landroidx/health/platform/client/proto/o1;->G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I

    move-result v4

    move-object v9, v6

    iput-object v5, v10, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v1, v12, v3, v5}, Landroidx/health/platform/client/proto/o1;->M(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v5, v30, v28

    :goto_5
    move v6, v4

    move-object v4, v9

    move-object v9, v10

    move v8, v12

    move v7, v13

    :goto_6
    move v10, v14

    move v14, v5

    move/from16 v5, p4

    goto/16 :goto_0

    :cond_7
    move v12, v4

    move/from16 v4, v21

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object v8, v2

    move-object v2, v3

    move-object v10, v9

    move/from16 v24, v12

    move/from16 v5, v22

    move-object/from16 v9, p2

    :goto_7
    move v12, v4

    goto/16 :goto_14

    :pswitch_1
    move/from16 v6, p3

    move v12, v4

    move-object v10, v9

    move/from16 v4, v21

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-nez v8, :cond_8

    invoke-static {v9, v4, v10}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v8

    iget-wide v4, v10, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v6

    move-wide/from16 v4, v26

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    or-int v4, v30, v28

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move v5, v14

    move v14, v4

    move-object v4, v9

    move-object v9, v10

    move v10, v5

    move/from16 v5, p4

    move v6, v8

    move v8, v12

    move v7, v13

    goto/16 :goto_0

    :cond_8
    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    :cond_9
    move-object v8, v3

    move/from16 v24, v12

    move/from16 v5, v22

    goto :goto_7

    :pswitch_2
    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    move v12, v4

    move-object v10, v9

    move/from16 v4, v21

    move-wide/from16 v6, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-nez v8, :cond_9

    invoke-static {v9, v4, v10}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v5, v10, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v5}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v5

    invoke-virtual {v3, v2, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_8
    or-int v5, v30, v28

    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    goto/16 :goto_5

    :pswitch_3
    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    move v12, v4

    move-object v10, v9

    move/from16 v4, v21

    move-wide/from16 v6, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-nez v8, :cond_f

    invoke-static {v9, v4, v10}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v5, v10, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v1, v12}, Landroidx/health/platform/client/proto/o1;->m(I)Landroidx/health/platform/client/proto/t1;

    move-result-object v8

    if-eqz v8, :cond_e

    if-eqz v5, :cond_c

    move/from16 v8, v22

    if-eq v5, v8, :cond_b

    const/4 v8, 0x2

    if-eq v5, v8, :cond_a

    move-object/from16 v16, v19

    goto :goto_9

    :cond_a
    move-object/from16 v16, v18

    goto :goto_9

    :cond_b
    move-object/from16 v16, v17

    :cond_c
    :goto_9
    if-eqz v16, :cond_d

    goto :goto_a

    :cond_d
    invoke-static {v2}, Landroidx/health/platform/client/proto/o1;->p(Ljava/lang/Object;)Landroidx/health/platform/client/proto/e3;

    move-result-object v6

    int-to-long v7, v5

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v6, v15, v5}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move/from16 v5, p4

    move v6, v4

    move-object v4, v9

    move-object v9, v10

    move v8, v12

    move v7, v13

    move v10, v14

    move/from16 v14, v30

    goto/16 :goto_0

    :cond_e
    :goto_a
    invoke-virtual {v3, v2, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_8

    :cond_f
    move-object v8, v3

    move/from16 v24, v12

    const/4 v5, 0x1

    goto/16 :goto_7

    :pswitch_4
    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move v12, v4

    move-object v10, v9

    move/from16 v4, v21

    move-wide/from16 v6, v26

    const/4 v5, 0x2

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-ne v8, v5, :cond_f

    invoke-static {v9, v4, v10}, Landroidx/health/platform/client/proto/z2;->a([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget-object v5, v10, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v3, v2, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :pswitch_5
    move-object v5, v3

    move-object v3, v2

    move-object v2, v5

    move v12, v4

    move-object v10, v9

    move/from16 v4, v21

    const/4 v5, 0x2

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-ne v8, v5, :cond_10

    move-object v6, v2

    invoke-virtual {v1, v12, v6}, Landroidx/health/platform/client/proto/o1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v5, v3

    invoke-virtual {v1, v12}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v3

    move-object v7, v10

    move-object v10, v5

    move v5, v4

    move-object v4, v9

    move-object v9, v6

    move/from16 v6, p4

    invoke-static/range {v2 .. v7}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result v3

    move-object v5, v2

    move-object v2, v4

    move-object v4, v7

    invoke-virtual {v1, v12, v9, v5}, Landroidx/health/platform/client/proto/o1;->M(ILjava/lang/Object;Ljava/lang/Object;)V

    :goto_b
    or-int v5, v30, v28

    move v6, v3

    move-object v3, v9

    move v8, v12

    move v7, v13

    :goto_c
    move-object v9, v4

    move-object v4, v2

    move-object v2, v10

    goto/16 :goto_6

    :cond_10
    move-object/from16 v32, v9

    move-object v9, v2

    move-object/from16 v2, v32

    move-object/from16 v32, v10

    move-object v10, v3

    move v3, v4

    move-object/from16 v4, v32

    :cond_11
    move-object v5, v9

    move-object v9, v2

    move-object v2, v5

    move-object v8, v10

    move/from16 v24, v12

    const/4 v5, 0x1

    move v12, v3

    :goto_d
    move-object v10, v4

    goto/16 :goto_14

    :pswitch_6
    move-object v10, v2

    move v12, v4

    move-object v4, v9

    move-wide/from16 v6, v26

    const/4 v5, 0x2

    const v29, 0xfffff

    move-object/from16 v2, p2

    move-object v9, v3

    move/from16 v3, v21

    const/16 v21, -0x1

    if-ne v8, v5, :cond_11

    const/high16 v5, 0x20000000

    and-int v5, v20, v5

    if-nez v5, :cond_12

    invoke-static {v2, v3, v4}, Landroidx/health/platform/client/proto/z2;->e([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    goto :goto_e

    :cond_12
    invoke-static {v2, v3, v4}, Landroidx/health/platform/client/proto/z2;->f([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    :goto_e
    iget-object v5, v4, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v10, v9, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_b

    :pswitch_7
    move-object v10, v2

    move v12, v4

    move-object v4, v9

    move-wide/from16 v6, v26

    const v29, 0xfffff

    move-object/from16 v2, p2

    move-object v9, v3

    move/from16 v3, v21

    const/16 v21, -0x1

    if-nez v8, :cond_14

    invoke-static {v2, v3, v4}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    move/from16 v24, v12

    iget-wide v11, v4, Landroidx/health/platform/client/proto/d;->b:J

    const-wide/16 v16, 0x0

    cmp-long v5, v11, v16

    if-eqz v5, :cond_13

    const/4 v5, 0x1

    goto :goto_f

    :cond_13
    move/from16 v5, v25

    :goto_f
    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v9, v6, v7, v5}, Landroidx/health/platform/client/proto/m3;->k(Ljava/lang/Object;JZ)V

    or-int v5, v30, v28

    move v6, v3

    move-object v3, v9

    move v7, v13

    move/from16 v8, v24

    goto :goto_c

    :cond_14
    move/from16 v24, v12

    :cond_15
    move-object v5, v9

    move-object v9, v2

    move-object v2, v5

    move v12, v3

    move-object v8, v10

    const/4 v5, 0x1

    goto :goto_d

    :pswitch_8
    move-object v10, v2

    move/from16 v24, v4

    move-object v4, v9

    move-wide/from16 v6, v26

    const v29, 0xfffff

    move-object/from16 v2, p2

    move-object v9, v3

    move/from16 v3, v21

    const/16 v21, -0x1

    if-ne v8, v5, :cond_15

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v5

    invoke-virtual {v10, v9, v6, v7, v5}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v6, v3, 0x4

    or-int v3, v30, v28

    move-object v5, v4

    move-object v4, v2

    move-object v2, v10

    move v10, v14

    move v14, v3

    move-object v3, v9

    move-object v9, v5

    :goto_10
    move/from16 v5, p4

    :goto_11
    move v7, v13

    :goto_12
    move/from16 v8, v24

    goto/16 :goto_0

    :pswitch_9
    move-object v10, v2

    move/from16 v24, v4

    move-object v4, v9

    move/from16 v5, v22

    move-wide/from16 v6, v26

    const v29, 0xfffff

    move-object/from16 v2, p2

    move-object v9, v3

    move/from16 v3, v21

    const/16 v21, -0x1

    if-ne v8, v5, :cond_16

    move-wide/from16 v26, v6

    invoke-static {v3, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v6

    move v12, v3

    move-object v3, v9

    move-object v9, v2

    move-object v2, v10

    move-object v10, v4

    move-wide/from16 v4, v26

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v6, v12, 0x8

    :goto_13
    or-int v4, v30, v28

    move v5, v14

    move v14, v4

    move-object v4, v9

    move-object v9, v10

    move v10, v5

    goto :goto_10

    :cond_16
    move v12, v3

    move-object v3, v9

    move-object v9, v2

    move-object v2, v10

    move-object v10, v4

    :cond_17
    move-object v8, v2

    move-object v2, v3

    goto/16 :goto_14

    :pswitch_a
    move/from16 v24, v4

    move-object v10, v9

    move/from16 v12, v21

    move-wide/from16 v4, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-nez v8, :cond_18

    invoke-static {v9, v12, v10}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v6

    iget v7, v10, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v2, v3, v4, v5, v7}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_13

    :cond_18
    move-object v8, v2

    move-object v2, v3

    const/4 v5, 0x1

    goto/16 :goto_14

    :pswitch_b
    move/from16 v24, v4

    move-object v10, v9

    move/from16 v12, v21

    move-wide/from16 v4, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-nez v8, :cond_18

    invoke-static {v9, v12, v10}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v8

    iget-wide v6, v10, Landroidx/health/platform/client/proto/d;->b:J

    invoke-virtual/range {v2 .. v7}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    or-int v4, v30, v28

    move v5, v14

    move v14, v4

    move-object v4, v9

    move-object v9, v10

    move v10, v5

    move/from16 v5, p4

    move v6, v8

    goto :goto_11

    :pswitch_c
    move/from16 v24, v4

    move-object v10, v9

    move/from16 v12, v21

    move-wide/from16 v6, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-ne v8, v5, :cond_18

    invoke-static {v12, v9}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v3, v6, v7, v4}, Landroidx/health/platform/client/proto/m3;->n(Ljava/lang/Object;JF)V

    add-int/lit8 v6, v12, 0x4

    goto :goto_13

    :pswitch_d
    move/from16 v24, v4

    move-object v10, v9

    move/from16 v12, v21

    move/from16 v5, v22

    move-wide/from16 v6, v26

    const/16 v21, -0x1

    const v29, 0xfffff

    move-object/from16 v9, p2

    if-ne v8, v5, :cond_17

    invoke-static {v12, v9}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    move-object v8, v2

    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    move-wide/from16 v32, v6

    move-wide v6, v4

    move-wide/from16 v4, v32

    invoke-virtual/range {v2 .. v7}, Landroidx/health/platform/client/proto/m3;->m(Ljava/lang/Object;JD)V

    move-object v2, v3

    add-int/lit8 v6, v12, 0x8

    or-int v3, v30, v28

    move/from16 v5, p4

    move-object v4, v9

    move-object v9, v10

    move v7, v13

    move v10, v14

    move v14, v3

    move-object v3, v2

    move-object v2, v8

    goto/16 :goto_12

    :goto_14
    move-object v10, v1

    move-object/from16 v31, v8

    move-object/from16 v23, v11

    move v7, v13

    move/from16 v20, v14

    move v3, v15

    move/from16 v8, v24

    move/from16 v14, v30

    const/4 v0, 0x2

    move/from16 v1, p5

    move-object v11, v2

    move v2, v12

    move/from16 v24, v21

    const/16 v21, 0x3

    goto/16 :goto_1a

    :cond_19
    move-object v6, v3

    move-object v3, v2

    move-object v2, v6

    move v9, v4

    move/from16 v29, v20

    move/from16 v4, v21

    const/16 v21, -0x1

    move/from16 v20, v7

    move-wide/from16 v6, v26

    const/16 v5, 0x1b

    if-ne v12, v5, :cond_1d

    const/4 v5, 0x2

    if-ne v8, v5, :cond_1c

    invoke-virtual {v3, v2, v6, v7}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/w0;

    move-object v8, v5

    check-cast v8, Landroidx/health/platform/client/proto/b;

    iget-boolean v8, v8, Landroidx/health/platform/client/proto/b;->w:Z

    if-nez v8, :cond_1b

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v8

    if-nez v8, :cond_1a

    const/16 v8, 0xa

    goto :goto_15

    :cond_1a
    mul-int/lit8 v8, v8, 0x2

    :goto_15
    invoke-interface {v5, v8}, Landroidx/health/platform/client/proto/w0;->i(I)Landroidx/health/platform/client/proto/w0;

    move-result-object v5

    invoke-virtual {v3, v2, v6, v7, v5}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1b
    move-object v7, v5

    invoke-virtual {v1, v9}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v2

    move v5, v15

    move-object v15, v3

    move v3, v5

    move/from16 v6, p4

    move-object/from16 v8, p6

    move v5, v4

    move-object/from16 v4, p2

    invoke-static/range {v2 .. v8}, Landroidx/health/platform/client/proto/z2;->d(Landroidx/health/platform/client/proto/u2;I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I

    move-result v2

    move/from16 v5, p4

    move v6, v2

    move v8, v9

    move v7, v13

    move-object v2, v15

    move-object/from16 v9, p6

    move v15, v3

    move-object/from16 v3, p1

    goto/16 :goto_0

    :cond_1c
    move/from16 v32, v15

    move-object v15, v3

    move/from16 v3, v32

    move v0, v5

    move/from16 v20, v10

    move-object/from16 v23, v11

    move v10, v13

    move/from16 v30, v14

    move-object/from16 v31, v15

    move/from16 v24, v21

    const/16 v21, 0x3

    move v15, v3

    goto/16 :goto_19

    :cond_1d
    move v5, v15

    move-object v15, v3

    move v3, v5

    const/4 v5, 0x2

    const/16 v2, 0x31

    if-gt v12, v2, :cond_1f

    move-object/from16 v23, v11

    move/from16 v2, v20

    move/from16 v20, v10

    int-to-long v10, v2

    move-object/from16 v2, p1

    move v0, v5

    move/from16 v30, v14

    move-object/from16 v31, v15

    move/from16 v24, v21

    const/16 v21, 0x3

    move/from16 v5, p4

    move-object/from16 v15, p6

    move/from16 v32, v3

    move-object/from16 v3, p2

    move-wide/from16 v33, v6

    move/from16 v6, v32

    move v7, v13

    move-wide/from16 v13, v33

    invoke-virtual/range {v1 .. v15}, Landroidx/health/platform/client/proto/o1;->I(Ljava/lang/Object;[BIIIIIIJIJLandroidx/health/platform/client/proto/d;)I

    move-result v8

    move v15, v6

    move v10, v7

    if-eq v8, v4, :cond_1e

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    move v6, v8

    :goto_16
    move v8, v9

    move v7, v10

    :goto_17
    move/from16 v10, v20

    move/from16 v14, v30

    move-object/from16 v2, v31

    move-object/from16 v9, p6

    goto/16 :goto_0

    :cond_1e
    move-object/from16 v11, p1

    move/from16 v1, p5

    move v2, v8

    :goto_18
    move v8, v9

    move v7, v10

    move v3, v15

    move/from16 v14, v30

    move-object/from16 v10, p0

    goto/16 :goto_1a

    :cond_1f
    move v0, v5

    move-object/from16 v23, v11

    move/from16 v30, v14

    move-object/from16 v31, v15

    move/from16 v2, v20

    move/from16 v24, v21

    const/16 v21, 0x3

    move v15, v3

    move/from16 v20, v10

    move v10, v13

    const/16 v1, 0x32

    if-ne v12, v1, :cond_22

    if-ne v8, v0, :cond_21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-wide v7, v6

    move v6, v9

    move-object/from16 v9, p6

    invoke-virtual/range {v1 .. v9}, Landroidx/health/platform/client/proto/o1;->E(Ljava/lang/Object;[BIIIJLandroidx/health/platform/client/proto/d;)I

    move-result v7

    move v9, v6

    if-eq v7, v4, :cond_20

    move-object/from16 v1, p0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    move/from16 v5, p4

    move v6, v7

    goto :goto_16

    :cond_20
    move-object/from16 v11, p1

    move/from16 v1, p5

    move v2, v7

    goto :goto_18

    :cond_21
    :goto_19
    move-object/from16 v11, p1

    move/from16 v1, p5

    move v2, v4

    goto :goto_18

    :cond_22
    move-wide v13, v6

    move v7, v10

    move v10, v12

    move-wide v11, v13

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v14, p6

    move v13, v9

    move v6, v15

    move v9, v2

    move-object/from16 v2, p1

    invoke-virtual/range {v1 .. v14}, Landroidx/health/platform/client/proto/o1;->F(Ljava/lang/Object;[BIIIIIIIJILandroidx/health/platform/client/proto/d;)I

    move-result v8

    move-object v10, v1

    move-object v11, v2

    move v3, v6

    move v9, v13

    if-eq v8, v4, :cond_23

    move-object/from16 v4, p2

    move/from16 v5, p4

    move v15, v3

    move v6, v8

    move v8, v9

    move-object v1, v10

    move-object v3, v11

    goto :goto_17

    :cond_23
    move/from16 v1, p5

    move v2, v8

    move v8, v9

    move/from16 v14, v30

    :goto_1a
    if-ne v3, v1, :cond_24

    if-eqz v1, :cond_24

    move/from16 v5, p4

    move v9, v1

    move v6, v2

    move v15, v3

    :goto_1b
    move/from16 v1, v20

    const v2, 0xfffff

    goto :goto_1c

    :cond_24
    invoke-static {v11}, Landroidx/health/platform/client/proto/o1;->p(Ljava/lang/Object;)Landroidx/health/platform/client/proto/e3;

    move-result-object v4

    move-object/from16 v5, p6

    move v9, v1

    move v0, v3

    move-object/from16 v1, p2

    move/from16 v3, p4

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/z2;->g(I[BIILandroidx/health/platform/client/proto/e3;Landroidx/health/platform/client/proto/d;)I

    move-result v6

    move v5, v3

    move v3, v0

    move-object/from16 v4, p2

    move-object/from16 v9, p6

    move v15, v3

    move-object v1, v10

    move-object v3, v11

    move/from16 v10, v20

    move-object/from16 v2, v31

    goto/16 :goto_0

    :cond_25
    move/from16 v21, p3

    move/from16 v9, p5

    move-object/from16 v31, v2

    move/from16 v20, v10

    move-object/from16 v23, v11

    move/from16 v30, v14

    const/4 v0, 0x2

    move-object v10, v1

    move-object v11, v3

    goto :goto_1b

    :goto_1c
    if-eq v1, v2, :cond_26

    int-to-long v3, v1

    move-object/from16 v8, v31

    invoke-virtual {v8, v11, v3, v4, v14}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_26
    iget v1, v10, Landroidx/health/platform/client/proto/o1;->h:I

    move-object/from16 v3, v19

    :goto_1d
    iget v4, v10, Landroidx/health/platform/client/proto/o1;->i:I

    iget-object v7, v10, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    if-ge v1, v4, :cond_31

    iget-object v4, v10, Landroidx/health/platform/client/proto/o1;->g:[I

    aget v4, v4, v1

    aget v8, v23, v4

    invoke-virtual {v10, v4}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v12

    and-int/2addr v12, v2

    int-to-long v12, v12

    sget-object v14, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v14, v12, v13, v11}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v12

    if-nez v12, :cond_27

    goto :goto_1e

    :cond_27
    invoke-virtual {v10, v4}, Landroidx/health/platform/client/proto/o1;->m(I)Landroidx/health/platform/client/proto/t1;

    move-result-object v13

    if-nez v13, :cond_29

    :cond_28
    :goto_1e
    move/from16 v22, v0

    goto/16 :goto_23

    :cond_29
    iget-object v13, v10, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v12, Landroidx/health/platform/client/proto/j1;

    invoke-virtual {v10, v4}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/i1;

    iget-object v4, v4, Landroidx/health/platform/client/proto/i1;->a:Landroidx/health/platform/client/proto/h1;

    invoke-virtual {v12}, Landroidx/health/platform/client/proto/j1;->entrySet()Ljava/util/Set;

    move-result-object v12

    invoke-interface {v12}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1f
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_28

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ljava/lang/Integer;

    invoke-virtual {v14}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-eqz v14, :cond_2c

    const/4 v2, 0x1

    if-eq v14, v2, :cond_2b

    if-eq v14, v0, :cond_2a

    move-object/from16 v14, v19

    goto :goto_20

    :cond_2a
    move-object/from16 v14, v18

    goto :goto_20

    :cond_2b
    move-object/from16 v14, v17

    goto :goto_20

    :cond_2c
    const/4 v2, 0x1

    move-object/from16 v14, v16

    :goto_20
    if-eqz v14, :cond_2d

    move/from16 v22, v0

    goto :goto_22

    :cond_2d
    if-nez v3, :cond_2f

    move-object v3, v7

    check-cast v3, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v3, v11

    check-cast v3, Landroidx/health/platform/client/proto/u0;

    iget-object v14, v3, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    move/from16 v22, v0

    sget-object v0, Landroidx/health/platform/client/proto/e3;->f:Landroidx/health/platform/client/proto/e3;

    if-ne v14, v0, :cond_2e

    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object v0

    iput-object v0, v3, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    move-object v3, v0

    goto :goto_21

    :cond_2e
    move-object v3, v14

    goto :goto_21

    :cond_2f
    move/from16 v22, v0

    :goto_21
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v4, v0, v14}, Landroidx/health/platform/client/proto/i1;->a(Landroidx/health/platform/client/proto/h1;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    new-array v14, v0, [B

    new-instance v2, Landroidx/health/platform/client/proto/k;

    invoke-direct {v2, v14, v0}, Landroidx/health/platform/client/proto/k;-><init>([BI)V

    move/from16 p2, v0

    :try_start_0
    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v2, v4, v0, v13}, Landroidx/health/platform/client/proto/i1;->b(Landroidx/health/platform/client/proto/k;Landroidx/health/platform/client/proto/h1;Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    iget v0, v2, Landroidx/health/platform/client/proto/k;->f:I

    sub-int v0, p2, v0

    if-nez v0, :cond_30

    new-instance v0, Landroidx/health/platform/client/proto/h;

    invoke-direct {v0, v14}, Landroidx/health/platform/client/proto/h;-><init>([B)V

    move-object v2, v7

    check-cast v2, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v2, v8, 0x3

    or-int/lit8 v2, v2, 0x2

    invoke-virtual {v3, v2, v0}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    invoke-interface {v12}, Ljava/util/Iterator;->remove()V

    :goto_22
    move/from16 v0, v22

    const v2, 0xfffff

    goto/16 :goto_1f

    :cond_30
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Did not write as much data as expected."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :goto_23
    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v22

    const v2, 0xfffff

    goto/16 :goto_1d

    :cond_31
    if-eqz v3, :cond_32

    check-cast v7, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v0, v11

    check-cast v0, Landroidx/health/platform/client/proto/u0;

    iput-object v3, v0, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    :cond_32
    if-nez v9, :cond_34

    if-ne v6, v5, :cond_33

    goto :goto_24

    :cond_33
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    :cond_34
    if-gt v6, v5, :cond_35

    if-ne v15, v9, :cond_35

    :goto_24
    return v6

    :cond_35
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final H(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v8, p4

    move-object/from16 v13, p5

    invoke-static {v2}, Landroidx/health/platform/client/proto/o1;->k(Ljava/lang/Object;)V

    sget-object v1, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    move/from16 v3, p3

    const/4 v4, -0x1

    const/4 v5, 0x0

    const v11, 0xfffff

    const/4 v12, 0x0

    :goto_0
    if-ge v3, v8, :cond_1c

    add-int/lit8 v6, v3, 0x1

    aget-byte v3, v7, v3

    if-gez v3, :cond_0

    invoke-static {v3, v7, v6, v13}, Landroidx/health/platform/client/proto/z2;->i(I[BILandroidx/health/platform/client/proto/d;)I

    move-result v6

    iget v3, v13, Landroidx/health/platform/client/proto/d;->a:I

    :cond_0
    ushr-int/lit8 v14, v3, 0x3

    const v16, 0xfffff

    and-int/lit8 v15, v3, 0x7

    iget v10, v0, Landroidx/health/platform/client/proto/o1;->d:I

    iget v9, v0, Landroidx/health/platform/client/proto/o1;->c:I

    if-le v14, v4, :cond_2

    div-int/lit8 v5, v5, 0x3

    if-lt v14, v9, :cond_1

    if-gt v14, v10, :cond_1

    invoke-virtual {v0, v14, v5}, Landroidx/health/platform/client/proto/o1;->L(II)I

    move-result v4

    goto :goto_1

    :cond_1
    const/4 v4, -0x1

    :goto_1
    const/4 v9, 0x0

    :goto_2
    move v10, v4

    const/4 v4, -0x1

    goto :goto_3

    :cond_2
    if-lt v14, v9, :cond_3

    if-gt v14, v10, :cond_3

    const/4 v9, 0x0

    invoke-virtual {v0, v14, v9}, Landroidx/health/platform/client/proto/o1;->L(II)I

    move-result v4

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    const/4 v4, -0x1

    goto :goto_2

    :goto_3
    if-ne v10, v4, :cond_4

    move-object/from16 v24, v1

    move v5, v3

    move/from16 v17, v4

    move v8, v9

    move/from16 v18, v8

    move-object v9, v2

    move v2, v6

    move v6, v14

    goto/16 :goto_1a

    :cond_4
    add-int/lit8 v5, v10, 0x1

    iget-object v4, v0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget v5, v4, v5

    invoke-static {v5}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v9

    move/from16 p3, v3

    and-int v3, v5, v16

    move-object/from16 v19, v4

    int-to-long v3, v3

    move-wide/from16 v20, v3

    const/16 v3, 0x11

    if-gt v9, v3, :cond_11

    add-int/lit8 v3, v10, 0x2

    aget v3, v19, v3

    ushr-int/lit8 v19, v3, 0x14

    const/4 v4, 0x1

    shl-int v19, v4, v19

    and-int v3, v3, v16

    if-eq v3, v11, :cond_7

    move/from16 v4, v16

    move/from16 v22, v5

    if-eq v11, v4, :cond_5

    int-to-long v4, v11

    invoke-virtual {v1, v2, v4, v5, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    const v4, 0xfffff

    :cond_5
    if-eq v3, v4, :cond_6

    int-to-long v4, v3

    invoke-virtual {v1, v2, v4, v5}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v12

    :cond_6
    move v11, v3

    goto :goto_4

    :cond_7
    move/from16 v22, v5

    :goto_4
    const/4 v3, 0x5

    packed-switch v9, :pswitch_data_0

    move-object v8, v1

    move-object v1, v2

    move-object v9, v13

    const/16 v17, -0x1

    :goto_5
    move-object v13, v7

    :goto_6
    move v7, v6

    goto/16 :goto_14

    :pswitch_0
    if-nez v15, :cond_8

    invoke-static {v7, v6, v13}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v9

    iget-wide v3, v13, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v5

    move-wide/from16 v3, v20

    const/16 v17, -0x1

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object/from16 v25, v2

    move-object v2, v1

    move-object/from16 v1, v25

    or-int v12, v12, v19

    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move v3, v9

    :goto_7
    move v5, v10

    move v4, v14

    goto/16 :goto_0

    :cond_8
    move-object/from16 v17, v2

    move-object v2, v1

    move-object/from16 v1, v17

    const/16 v17, -0x1

    :cond_9
    move-object v8, v2

    move-object v9, v13

    goto :goto_5

    :pswitch_1
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    if-nez v15, :cond_9

    invoke-static {v7, v6, v13}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v6, v13, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v6}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v6

    invoke-virtual {v2, v1, v4, v5, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :goto_8
    or-int v12, v12, v19

    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    goto :goto_7

    :pswitch_2
    move-object v4, v2

    move-object v2, v1

    move-object v1, v4

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    if-nez v15, :cond_9

    invoke-static {v7, v6, v13}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v6, v13, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v2, v1, v4, v5, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    goto :goto_8

    :pswitch_3
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    move-wide/from16 v4, v20

    const/4 v3, 0x2

    const/16 v17, -0x1

    if-ne v15, v3, :cond_9

    invoke-static {v7, v6, v13}, Landroidx/health/platform/client/proto/z2;->a([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget-object v6, v13, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v2, v1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_8

    :pswitch_4
    move-object v3, v2

    move-object v2, v1

    move-object v1, v3

    const/4 v3, 0x2

    const/16 v17, -0x1

    if-ne v15, v3, :cond_a

    move-object v3, v1

    invoke-virtual {v0, v10, v3}, Landroidx/health/platform/client/proto/o1;->y(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v4, v2

    invoke-virtual {v0, v10}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v2

    move-object v5, v7

    move-object v7, v3

    move-object v3, v5

    move v5, v8

    move-object v8, v4

    move v4, v6

    move-object v6, v13

    invoke-static/range {v1 .. v6}, Landroidx/health/platform/client/proto/z2;->s(Ljava/lang/Object;Landroidx/health/platform/client/proto/u2;[BIILandroidx/health/platform/client/proto/d;)I

    move-result v2

    move-object v13, v3

    move-object v9, v6

    invoke-virtual {v0, v10, v7, v1}, Landroidx/health/platform/client/proto/o1;->M(ILjava/lang/Object;Ljava/lang/Object;)V

    or-int v12, v12, v19

    move v3, v2

    :goto_9
    move-object v2, v7

    :goto_a
    move-object v1, v8

    :goto_b
    move v5, v10

    move-object v7, v13

    move v4, v14

    move/from16 v8, p4

    :goto_c
    move-object v13, v9

    goto/16 :goto_0

    :cond_a
    move-object v9, v13

    move-object v13, v7

    move-object v7, v1

    move-object v8, v2

    goto/16 :goto_6

    :pswitch_5
    move-object v8, v1

    move v1, v6

    move-object v9, v13

    move-wide/from16 v4, v20

    const/4 v3, 0x2

    const/16 v17, -0x1

    move-object v13, v7

    move-object v7, v2

    if-ne v15, v3, :cond_c

    const/high16 v2, 0x20000000

    and-int v2, v22, v2

    if-nez v2, :cond_b

    invoke-static {v13, v1, v9}, Landroidx/health/platform/client/proto/z2;->e([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    :goto_d
    move v3, v1

    goto :goto_e

    :cond_b
    invoke-static {v13, v1, v9}, Landroidx/health/platform/client/proto/z2;->f([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    goto :goto_d

    :goto_e
    iget-object v1, v9, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-virtual {v8, v7, v4, v5, v1}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_f
    or-int v12, v12, v19

    goto :goto_9

    :cond_c
    move-object/from16 v25, v7

    move v7, v1

    move-object/from16 v1, v25

    goto/16 :goto_14

    :pswitch_6
    move-object v8, v1

    move v1, v6

    move-object v9, v13

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    move-object v13, v7

    move-object v7, v2

    if-nez v15, :cond_c

    invoke-static {v13, v1, v9}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget-wide v1, v9, Landroidx/health/platform/client/proto/d;->b:J

    const-wide/16 v20, 0x0

    cmp-long v1, v1, v20

    if-eqz v1, :cond_d

    const/4 v1, 0x1

    goto :goto_10

    :cond_d
    const/4 v1, 0x0

    :goto_10
    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v2, v7, v4, v5, v1}, Landroidx/health/platform/client/proto/m3;->k(Ljava/lang/Object;JZ)V

    goto :goto_f

    :pswitch_7
    move-object v8, v1

    move v1, v6

    move-object v9, v13

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    move-object v13, v7

    move-object v7, v2

    if-ne v15, v3, :cond_c

    invoke-static {v1, v13}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v2

    invoke-virtual {v8, v7, v4, v5, v2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    add-int/lit8 v3, v1, 0x4

    goto :goto_f

    :pswitch_8
    move-object v8, v1

    move v1, v6

    move-object v9, v13

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    move-object v13, v7

    move-object v7, v2

    const/4 v2, 0x1

    if-ne v15, v2, :cond_e

    move-wide v3, v4

    invoke-static {v1, v13}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v5

    move-object v2, v7

    move v7, v1

    move-object v1, v8

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    add-int/lit8 v3, v7, 0x8

    or-int v12, v12, v19

    move/from16 v8, p4

    :goto_11
    move v5, v10

    move-object v7, v13

    move v4, v14

    goto/16 :goto_c

    :cond_e
    move-object v2, v7

    move v7, v1

    :cond_f
    :goto_12
    move-object v1, v2

    goto/16 :goto_14

    :pswitch_9
    move-object v9, v13

    move-wide/from16 v3, v20

    const/16 v17, -0x1

    move-object v13, v7

    move v7, v6

    if-nez v15, :cond_10

    invoke-static {v13, v7, v9}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v5

    iget v6, v9, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v1, v2, v3, v4, v6}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    or-int v12, v12, v19

    move/from16 v8, p4

    move v3, v5

    goto :goto_11

    :cond_10
    move-object v8, v1

    goto :goto_12

    :pswitch_a
    move-object v9, v13

    move-wide/from16 v3, v20

    const/16 v17, -0x1

    move-object v13, v7

    move v7, v6

    if-nez v15, :cond_10

    invoke-static {v13, v7, v9}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v7

    iget-wide v5, v9, Landroidx/health/platform/client/proto/d;->b:J

    invoke-virtual/range {v1 .. v6}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    move-object v8, v1

    or-int v12, v12, v19

    move v3, v7

    goto/16 :goto_b

    :pswitch_b
    move-object v8, v1

    move-object v9, v13

    move-wide/from16 v4, v20

    const/16 v17, -0x1

    move-object v13, v7

    move v7, v6

    if-ne v15, v3, :cond_f

    invoke-static {v7, v13}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sget-object v3, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v3, v2, v4, v5, v1}, Landroidx/health/platform/client/proto/m3;->n(Ljava/lang/Object;JF)V

    add-int/lit8 v3, v7, 0x4

    :goto_13
    or-int v12, v12, v19

    goto/16 :goto_a

    :pswitch_c
    move-object v8, v1

    move-object v9, v13

    move-wide/from16 v4, v20

    const/4 v1, 0x1

    const/16 v17, -0x1

    move-object v13, v7

    move v7, v6

    if-ne v15, v1, :cond_f

    invoke-static {v7, v13}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v20

    invoke-static/range {v20 .. v21}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v20

    sget-object v1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    move-wide v3, v4

    move-wide/from16 v5, v20

    invoke-virtual/range {v1 .. v6}, Landroidx/health/platform/client/proto/m3;->m(Ljava/lang/Object;JD)V

    move-object v1, v2

    add-int/lit8 v3, v7, 0x8

    goto :goto_13

    :goto_14
    move/from16 v5, p3

    move-object v9, v1

    move v2, v7

    move-object/from16 v24, v8

    move v8, v10

    move v6, v14

    const/16 v18, 0x0

    goto/16 :goto_1a

    :cond_11
    move-object v8, v1

    move-object v1, v2

    move/from16 v22, v5

    move-object v13, v7

    move-wide/from16 v3, v20

    const/16 v17, -0x1

    move v7, v6

    const/16 v2, 0x1b

    if-ne v9, v2, :cond_15

    const/4 v2, 0x2

    if-ne v15, v2, :cond_14

    invoke-virtual {v8, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroidx/health/platform/client/proto/w0;

    move-object v5, v2

    check-cast v5, Landroidx/health/platform/client/proto/b;

    iget-boolean v5, v5, Landroidx/health/platform/client/proto/b;->w:Z

    if-nez v5, :cond_13

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_12

    const/16 v5, 0xa

    goto :goto_15

    :cond_12
    mul-int/lit8 v5, v5, 0x2

    :goto_15
    invoke-interface {v2, v5}, Landroidx/health/platform/client/proto/w0;->i(I)Landroidx/health/platform/client/proto/w0;

    move-result-object v2

    invoke-virtual {v8, v1, v3, v4, v2}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_13
    move-object v6, v2

    invoke-virtual {v0, v10}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v1

    move/from16 v2, p3

    move/from16 v5, p4

    move v4, v7

    move-object v3, v13

    move-object/from16 v7, p5

    invoke-static/range {v1 .. v7}, Landroidx/health/platform/client/proto/z2;->d(Landroidx/health/platform/client/proto/u2;I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I

    move-result v1

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v13, p5

    move v3, v1

    move-object v1, v8

    move v5, v10

    move v4, v14

    :goto_16
    move/from16 v8, p4

    goto/16 :goto_0

    :cond_14
    move v3, v7

    move-object/from16 v24, v8

    move v8, v10

    move v15, v11

    move/from16 v23, v12

    move v9, v14

    const/16 v18, 0x0

    move/from16 v10, p3

    goto/16 :goto_19

    :cond_15
    move/from16 v5, p3

    move v1, v7

    const/16 v2, 0x31

    if-gt v9, v2, :cond_17

    move-object v6, v8

    move v8, v10

    move v7, v11

    move/from16 v2, v22

    move v11, v9

    int-to-long v9, v2

    move v2, v15

    move v15, v7

    move v7, v2

    move-object/from16 v2, p2

    move-object/from16 v24, v6

    move/from16 v23, v12

    move v6, v14

    const/16 v18, 0x0

    move-object/from16 v14, p5

    move-wide v12, v3

    move/from16 v4, p4

    move v3, v1

    move-object/from16 v1, p1

    invoke-virtual/range {v0 .. v14}, Landroidx/health/platform/client/proto/o1;->I(Ljava/lang/Object;[BIIIIIIJIJLandroidx/health/platform/client/proto/d;)I

    move-result v7

    move v10, v5

    move v9, v6

    if-eq v7, v3, :cond_16

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v13, p5

    move v3, v7

    move v5, v8

    move v4, v9

    :goto_17
    move v11, v15

    move/from16 v12, v23

    move-object/from16 v1, v24

    move-object/from16 v7, p2

    goto :goto_16

    :cond_16
    move v2, v7

    :goto_18
    move v6, v9

    move v5, v10

    move v11, v15

    move/from16 v12, v23

    move-object/from16 v9, p1

    goto/16 :goto_1a

    :cond_17
    move-object/from16 v24, v8

    move v8, v10

    move/from16 v23, v12

    move v7, v15

    move/from16 v2, v22

    const/16 v18, 0x0

    move v10, v5

    move v15, v11

    move-wide v4, v3

    move v11, v9

    move v9, v14

    move v3, v1

    const/16 v0, 0x32

    if-ne v11, v0, :cond_1a

    const/4 v0, 0x2

    if-ne v7, v0, :cond_19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-wide v6, v4

    move v5, v8

    move/from16 v4, p4

    move-object/from16 v8, p5

    invoke-virtual/range {v0 .. v8}, Landroidx/health/platform/client/proto/o1;->E(Ljava/lang/Object;[BIIIJLandroidx/health/platform/client/proto/d;)I

    move-result v6

    move v8, v5

    if-eq v6, v3, :cond_18

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move-object/from16 v13, p5

    move v3, v6

    move v5, v8

    move v4, v9

    move v11, v15

    move/from16 v12, v23

    move-object/from16 v1, v24

    goto/16 :goto_16

    :cond_18
    move v2, v6

    goto :goto_18

    :cond_19
    :goto_19
    move v2, v3

    goto :goto_18

    :cond_1a
    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v13, p5

    move v12, v8

    move v6, v9

    move v9, v11

    move v8, v2

    move-object/from16 v2, p2

    move-wide/from16 v25, v4

    move/from16 v4, p4

    move v5, v10

    move-wide/from16 v10, v25

    invoke-virtual/range {v0 .. v13}, Landroidx/health/platform/client/proto/o1;->F(Ljava/lang/Object;[BIIIIIIIJILandroidx/health/platform/client/proto/d;)I

    move-result v7

    move-object v9, v1

    move v8, v12

    if-eq v7, v3, :cond_1b

    move-object/from16 v0, p0

    move-object/from16 v13, p5

    move v4, v6

    move v3, v7

    move v5, v8

    move-object v2, v9

    goto :goto_17

    :cond_1b
    move v2, v7

    move v11, v15

    move/from16 v12, v23

    :goto_1a
    invoke-static {v9}, Landroidx/health/platform/client/proto/o1;->p(Ljava/lang/Object;)Landroidx/health/platform/client/proto/e3;

    move-result-object v4

    move-object/from16 v1, p2

    move/from16 v3, p4

    move v0, v5

    move-object/from16 v5, p5

    invoke-static/range {v0 .. v5}, Landroidx/health/platform/client/proto/z2;->g(I[BIILandroidx/health/platform/client/proto/e3;Landroidx/health/platform/client/proto/d;)I

    move-result v0

    move-object/from16 v7, p2

    move-object/from16 v13, p5

    move v4, v6

    move v5, v8

    move-object v2, v9

    move-object/from16 v1, v24

    move v8, v3

    move v3, v0

    move-object/from16 v0, p0

    goto/16 :goto_0

    :cond_1c
    move-object/from16 v24, v1

    move-object v9, v2

    move v4, v8

    move v15, v11

    move/from16 v23, v12

    const v0, 0xfffff

    if-eq v15, v0, :cond_1d

    int-to-long v0, v15

    move/from16 v12, v23

    move-object/from16 v8, v24

    invoke-virtual {v8, v9, v0, v1, v12}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    :cond_1d
    if-ne v3, v4, :cond_1e

    return-void

    :cond_1e
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->c()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v0

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_9
        :pswitch_2
        :pswitch_7
        :pswitch_8
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final I(Ljava/lang/Object;[BIIIIIIJIJLandroidx/health/platform/client/proto/d;)I
    .locals 18

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p5

    move/from16 v3, p7

    move/from16 v8, p8

    move-wide/from16 v4, p12

    sget-object v6, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v6, v1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroidx/health/platform/client/proto/w0;

    move-object v9, v7

    check-cast v9, Landroidx/health/platform/client/proto/b;

    iget-boolean v9, v9, Landroidx/health/platform/client/proto/b;->w:Z

    const/4 v10, 0x2

    if-nez v9, :cond_1

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_0

    const/16 v9, 0xa

    goto :goto_0

    :cond_0
    mul-int/2addr v9, v10

    :goto_0
    invoke-interface {v7, v9}, Landroidx/health/platform/client/proto/w0;->i(I)Landroidx/health/platform/client/proto/w0;

    move-result-object v7

    invoke-virtual {v6, v1, v4, v5, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :cond_1
    move-object v6, v7

    const/4 v9, 0x3

    const/4 v4, 0x5

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    packed-switch p11, :pswitch_data_0

    :cond_2
    move/from16 v1, p3

    goto/16 :goto_2f

    :pswitch_0
    if-ne v3, v9, :cond_2

    invoke-virtual {v0, v8}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v1

    and-int/lit8 v3, v2, -0x8

    or-int/lit8 v3, v3, 0x4

    invoke-interface {v1}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v4

    move-object v5, v1

    check-cast v5, Landroidx/health/platform/client/proto/o1;

    move-object/from16 p8, p2

    move/from16 p9, p3

    move/from16 p10, p4

    move-object/from16 p12, p14

    move/from16 p11, v3

    move-object/from16 p7, v4

    move-object/from16 p6, v5

    invoke-virtual/range {p6 .. p12}, Landroidx/health/platform/client/proto/o1;->G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I

    move-result v3

    move-object/from16 v10, p6

    move-object/from16 v9, p7

    move-object/from16 v4, p8

    move/from16 v5, p10

    move/from16 v8, p11

    move-object/from16 v7, p12

    iput-object v9, v7, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {v1, v9}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    iput-object v9, v7, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_1
    if-ge v3, v5, :cond_4

    invoke-static {v4, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v9

    iget v11, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v2, v11, :cond_3

    goto :goto_2

    :cond_3
    invoke-interface {v1}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v3

    move-object/from16 p7, v3

    move-object/from16 p8, v4

    move/from16 p10, v5

    move-object/from16 p12, v7

    move/from16 p11, v8

    move/from16 p9, v9

    move-object/from16 p6, v10

    invoke-virtual/range {p6 .. p12}, Landroidx/health/platform/client/proto/o1;->G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I

    move-result v3

    move-object/from16 v9, p7

    iput-object v9, v7, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {v1, v9}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    iput-object v9, v7, Landroidx/health/platform/client/proto/d;->c:Ljava/lang/Object;

    invoke-interface {v6, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    :goto_2
    return v3

    :pswitch_1
    move-object/from16 v4, p2

    move/from16 v11, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    if-ne v3, v10, :cond_7

    check-cast v6, Landroidx/health/platform/client/proto/e1;

    invoke-static {v4, v11, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v2, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v2, v1

    :goto_3
    if-ge v1, v2, :cond_5

    invoke-static {v4, v1, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v8, v9}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    goto :goto_3

    :cond_5
    if-ne v1, v2, :cond_6

    return v1

    :cond_6
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_7
    if-nez v3, :cond_a

    check-cast v6, Landroidx/health/platform/client/proto/e1;

    invoke-static {v4, v11, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v8, v9}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    :goto_4
    if-ge v1, v5, :cond_9

    invoke-static {v4, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v2, v8, :cond_8

    goto :goto_5

    :cond_8
    invoke-static {v4, v3, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-static {v8, v9}, Landroidx/health/platform/client/proto/z2;->n(J)J

    move-result-wide v8

    invoke-virtual {v6, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    goto :goto_4

    :cond_9
    :goto_5
    return v1

    :cond_a
    move v1, v11

    goto/16 :goto_2f

    :pswitch_2
    move-object/from16 v4, p2

    move/from16 v11, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    if-ne v3, v10, :cond_d

    check-cast v6, Landroidx/health/platform/client/proto/v0;

    invoke-static {v4, v11, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v2, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v2, v1

    :goto_6
    if-ge v1, v2, :cond_b

    invoke-static {v4, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v3}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v3

    invoke-virtual {v6, v3}, Landroidx/health/platform/client/proto/v0;->c(I)V

    goto :goto_6

    :cond_b
    if-ne v1, v2, :cond_c

    return v1

    :cond_c
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_d
    if-nez v3, :cond_a

    check-cast v6, Landroidx/health/platform/client/proto/v0;

    invoke-static {v4, v11, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v3}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v3

    invoke-virtual {v6, v3}, Landroidx/health/platform/client/proto/v0;->c(I)V

    :goto_7
    if-ge v1, v5, :cond_f

    invoke-static {v4, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v2, v8, :cond_e

    goto :goto_8

    :cond_e
    invoke-static {v4, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    invoke-static {v3}, Landroidx/health/platform/client/proto/z2;->m(I)I

    move-result v3

    invoke-virtual {v6, v3}, Landroidx/health/platform/client/proto/v0;->c(I)V

    goto :goto_7

    :cond_f
    :goto_8
    return v1

    :pswitch_3
    move-object/from16 v4, p2

    move/from16 v11, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    if-ne v3, v10, :cond_12

    move-object v2, v6

    check-cast v2, Landroidx/health/platform/client/proto/v0;

    invoke-static {v4, v11, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v5, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v5, v3

    :goto_9
    if-ge v3, v5, :cond_10

    invoke-static {v4, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v11, v7, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v2, v11}, Landroidx/health/platform/client/proto/v0;->c(I)V

    goto :goto_9

    :cond_10
    if-ne v3, v5, :cond_11

    goto :goto_a

    :cond_11
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_12
    if-nez v3, :cond_a

    move-object v3, v4

    move v4, v11

    invoke-static/range {v2 .. v7}, Landroidx/health/platform/client/proto/z2;->k(I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I

    move-result v3

    :goto_a
    invoke-virtual {v0, v8}, Landroidx/health/platform/client/proto/o1;->m(I)Landroidx/health/platform/client/proto/t1;

    move-result-object v2

    sget-object v4, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    if-nez v2, :cond_13

    goto/16 :goto_10

    :cond_13
    sget-object v2, Landroidx/health/platform/client/proto/e3;->f:Landroidx/health/platform/client/proto/e3;

    sget-object v4, Landroidx/health/platform/client/proto/u1;->x:Landroidx/health/platform/client/proto/u1;

    sget-object v5, Landroidx/health/platform/client/proto/u1;->y:Landroidx/health/platform/client/proto/u1;

    sget-object v7, Landroidx/health/platform/client/proto/u1;->z:Landroidx/health/platform/client/proto/u1;

    iget-object v11, v0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    if-eqz v6, :cond_1c

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v12

    move v15, v13

    const/16 v16, 0x0

    :goto_b
    if-ge v13, v12, :cond_1b

    invoke-interface {v6, v13}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    move-object/from16 v8, v17

    check-cast v8, Ljava/lang/Integer;

    move/from16 p12, v9

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eqz v9, :cond_16

    if-eq v9, v14, :cond_15

    if-eq v9, v10, :cond_14

    const/16 v17, 0x0

    goto :goto_c

    :cond_14
    move-object/from16 v17, v7

    goto :goto_c

    :cond_15
    move-object/from16 v17, v5

    goto :goto_c

    :cond_16
    move-object/from16 v17, v4

    :goto_c
    if-eqz v17, :cond_18

    if-eq v13, v15, :cond_17

    invoke-interface {v6, v15, v8}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    :cond_17
    add-int/lit8 v15, v15, 0x1

    goto :goto_d

    :cond_18
    if-nez v16, :cond_1a

    move-object v8, v11

    check-cast v8, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v1

    check-cast v8, Landroidx/health/platform/client/proto/u0;

    iget-object v10, v8, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    if-ne v10, v2, :cond_19

    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object v10

    iput-object v10, v8, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    :cond_19
    move-object/from16 v16, v10

    :cond_1a
    move-object/from16 v8, v16

    int-to-long v9, v9

    move-object/from16 v16, v11

    check-cast v16, Landroidx/health/platform/client/proto/f3;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v14, p6, 0x3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v14, v9}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    move-object/from16 v16, v8

    :goto_d
    add-int/lit8 v13, v13, 0x1

    move/from16 v9, p12

    const/4 v10, 0x2

    const/4 v14, 0x1

    goto :goto_b

    :cond_1b
    if-eq v15, v12, :cond_23

    invoke-interface {v6, v15, v12}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->clear()V

    return v3

    :cond_1c
    move/from16 p12, v9

    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    const/4 v8, 0x0

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_23

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    if-eqz v9, :cond_1f

    const/4 v10, 0x1

    if-eq v9, v10, :cond_1e

    const/4 v10, 0x2

    if-eq v9, v10, :cond_1d

    const/4 v10, 0x0

    goto :goto_f

    :cond_1d
    move-object v10, v7

    goto :goto_f

    :cond_1e
    move-object v10, v5

    goto :goto_f

    :cond_1f
    move-object v10, v4

    :goto_f
    if-eqz v10, :cond_20

    goto :goto_e

    :cond_20
    if-nez v8, :cond_22

    move-object v8, v11

    check-cast v8, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v8, v1

    check-cast v8, Landroidx/health/platform/client/proto/u0;

    iget-object v10, v8, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    if-ne v10, v2, :cond_21

    invoke-static {}, Landroidx/health/platform/client/proto/e3;->c()Landroidx/health/platform/client/proto/e3;

    move-result-object v10

    iput-object v10, v8, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    :cond_21
    move-object v8, v10

    :cond_22
    int-to-long v9, v9

    move-object v12, v11

    check-cast v12, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    shl-int/lit8 v12, p6, 0x3

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v8, v12, v9}, Landroidx/health/platform/client/proto/e3;->d(ILjava/lang/Object;)V

    invoke-interface {v6}, Ljava/util/Iterator;->remove()V

    goto :goto_e

    :cond_23
    :goto_10
    return v3

    :pswitch_4
    move-object/from16 v1, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    if-ne v3, v10, :cond_2c

    invoke-static {v1, v4, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v4, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v4, :cond_2b

    array-length v8, v1

    sub-int/2addr v8, v3

    if-gt v4, v8, :cond_2a

    if-nez v4, :cond_24

    sget-object v4, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_24
    invoke-static {v1, v3, v4}, Landroidx/health/platform/client/proto/h;->d([BII)Landroidx/health/platform/client/proto/h;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_11
    add-int/2addr v3, v4

    :goto_12
    if-ge v3, v5, :cond_29

    invoke-static {v1, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v2, v8, :cond_25

    goto :goto_13

    :cond_25
    invoke-static {v1, v4, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v4, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v4, :cond_28

    array-length v8, v1

    sub-int/2addr v8, v3

    if-gt v4, v8, :cond_27

    if-nez v4, :cond_26

    sget-object v4, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    invoke-interface {v6, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_26
    invoke-static {v1, v3, v4}, Landroidx/health/platform/client/proto/h;->d([BII)Landroidx/health/platform/client/proto/h;

    move-result-object v8

    invoke-interface {v6, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_27
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_28
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_29
    :goto_13
    return v3

    :cond_2a
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_2b
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_2c
    move v1, v4

    goto/16 :goto_2f

    :pswitch_5
    move-object/from16 v1, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    if-ne v3, v10, :cond_2c

    invoke-virtual {v0, v8}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v3

    move-object/from16 p8, v1

    move/from16 p7, v2

    move-object/from16 p6, v3

    move/from16 p9, v4

    move/from16 p10, v5

    move-object/from16 p11, v6

    move-object/from16 p12, v7

    invoke-static/range {p6 .. p12}, Landroidx/health/platform/client/proto/z2;->d(Landroidx/health/platform/client/proto/u2;I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I

    move-result v1

    return v1

    :pswitch_6
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_5f

    const-wide/32 v3, 0x20000000

    and-long v3, p9, v3

    cmp-long v3, v3, v11

    const-string v4, ""

    if-nez v3, :cond_33

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v3, :cond_32

    if-nez v3, :cond_2d

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_2d
    new-instance v9, Ljava/lang/String;

    sget-object v10, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v2, v1, v3, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_14
    add-int/2addr v1, v3

    :goto_15
    if-ge v1, v5, :cond_31

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v9, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v9, :cond_2e

    goto :goto_16

    :cond_2e
    invoke-static {v2, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v3, :cond_30

    if-nez v3, :cond_2f

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_2f
    new-instance v9, Ljava/lang/String;

    sget-object v10, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v9, v2, v1, v3, v10}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v8, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_14

    :cond_30
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_31
    :goto_16
    return v1

    :cond_32
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_33
    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v3, :cond_3b

    if-nez v3, :cond_34

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_34
    add-int v9, v1, v3

    sget-object v10, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v10, v2, v1, v9}, Landroidx/health/platform/client/proto/z2;->r([BII)Z

    move-result v10

    if-eqz v10, :cond_3a

    new-instance v10, Ljava/lang/String;

    sget-object v11, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v2, v1, v3, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_17
    move v1, v9

    :goto_18
    if-ge v1, v5, :cond_39

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v3

    iget v9, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v9, :cond_35

    goto :goto_19

    :cond_35
    invoke-static {v2, v3, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-ltz v3, :cond_38

    if-nez v3, :cond_36

    invoke-interface {v8, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_18

    :cond_36
    add-int v9, v1, v3

    sget-object v10, Landroidx/health/platform/client/proto/q3;->a:Landroidx/health/platform/client/proto/z2;

    invoke-virtual {v10, v2, v1, v9}, Landroidx/health/platform/client/proto/z2;->r([BII)Z

    move-result v10

    if-eqz v10, :cond_37

    new-instance v10, Ljava/lang/String;

    sget-object v11, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    invoke-direct {v10, v2, v1, v3, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-interface {v8, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_17

    :cond_37
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->a()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_38
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_39
    :goto_19
    return v1

    :cond_3a
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->a()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_3b
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->b()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :pswitch_7
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_3f

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/e;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_1a
    if-ge v1, v3, :cond_3d

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v4, v7, Landroidx/health/platform/client/proto/d;->b:J

    cmp-long v4, v4, v11

    if-eqz v4, :cond_3c

    const/4 v4, 0x1

    goto :goto_1b

    :cond_3c
    move v4, v13

    :goto_1b
    invoke-virtual {v6, v4}, Landroidx/health/platform/client/proto/e;->c(Z)V

    goto :goto_1a

    :cond_3d
    if-ne v1, v3, :cond_3e

    return v1

    :cond_3e
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_3f
    if-nez v3, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/e;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    cmp-long v4, v8, v11

    if-eqz v4, :cond_40

    const/4 v4, 0x1

    goto :goto_1c

    :cond_40
    move v4, v13

    :goto_1c
    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/e;->c(Z)V

    :goto_1d
    if-ge v1, v5, :cond_43

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_41

    goto :goto_1f

    :cond_41
    invoke-static {v2, v4, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    cmp-long v4, v8, v11

    if-eqz v4, :cond_42

    const/4 v4, 0x1

    goto :goto_1e

    :cond_42
    move v4, v13

    :goto_1e
    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/e;->c(Z)V

    goto :goto_1d

    :cond_43
    :goto_1f
    return v1

    :pswitch_8
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_46

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/v0;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_20
    if-ge v1, v3, :cond_44

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v4

    invoke-virtual {v6, v4}, Landroidx/health/platform/client/proto/v0;->c(I)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_20

    :cond_44
    if-ne v1, v3, :cond_45

    return v1

    :cond_45
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_46
    if-ne v3, v4, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/v0;

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/v0;->c(I)V

    add-int/lit8 v1, v1, 0x4

    :goto_21
    if-ge v1, v5, :cond_48

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_47

    goto :goto_22

    :cond_47
    invoke-static {v4, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v1

    invoke-virtual {v3, v1}, Landroidx/health/platform/client/proto/v0;->c(I)V

    add-int/lit8 v1, v4, 0x4

    goto :goto_21

    :cond_48
    :goto_22
    return v1

    :pswitch_9
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_4b

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/e1;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_23
    if-ge v1, v3, :cond_49

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Landroidx/health/platform/client/proto/e1;->c(J)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_23

    :cond_49
    if-ne v1, v3, :cond_4a

    return v1

    :cond_4a
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_4b
    const/4 v10, 0x1

    if-ne v3, v10, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/e1;

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    add-int/lit8 v1, v1, 0x8

    :goto_24
    if-ge v1, v5, :cond_4d

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_4c

    goto :goto_25

    :cond_4c
    invoke-static {v4, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    add-int/lit8 v1, v4, 0x8

    goto :goto_24

    :cond_4d
    :goto_25
    return v1

    :pswitch_a
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_50

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/v0;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_26
    if-ge v1, v3, :cond_4e

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v4, v7, Landroidx/health/platform/client/proto/d;->a:I

    invoke-virtual {v6, v4}, Landroidx/health/platform/client/proto/v0;->c(I)V

    goto :goto_26

    :cond_4e
    if-ne v1, v3, :cond_4f

    return v1

    :cond_4f
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_50
    if-nez v3, :cond_5f

    move/from16 p8, v1

    move-object/from16 p7, v2

    move/from16 p9, v5

    move/from16 p6, v6

    move-object/from16 p11, v7

    move-object/from16 p10, v8

    invoke-static/range {p6 .. p11}, Landroidx/health/platform/client/proto/z2;->k(I[BIILandroidx/health/platform/client/proto/w0;Landroidx/health/platform/client/proto/d;)I

    move-result v1

    return v1

    :pswitch_b
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_53

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/e1;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_27
    if-ge v1, v3, :cond_51

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v4, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-virtual {v6, v4, v5}, Landroidx/health/platform/client/proto/e1;->c(J)V

    goto :goto_27

    :cond_51
    if-ne v1, v3, :cond_52

    return v1

    :cond_52
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_53
    if-nez v3, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/e1;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    :goto_28
    if-ge v1, v5, :cond_55

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_54

    goto :goto_29

    :cond_54
    invoke-static {v2, v4, v7}, Landroidx/health/platform/client/proto/z2;->l([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget-wide v8, v7, Landroidx/health/platform/client/proto/d;->b:J

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/e1;->c(J)V

    goto :goto_28

    :cond_55
    :goto_29
    return v1

    :pswitch_c
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_58

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/q0;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_2a
    if-ge v1, v3, :cond_56

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v6, v4}, Landroidx/health/platform/client/proto/q0;->c(F)V

    add-int/lit8 v1, v1, 0x4

    goto :goto_2a

    :cond_56
    if-ne v1, v3, :cond_57

    return v1

    :cond_57
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_58
    if-ne v3, v4, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/q0;

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/q0;->c(F)V

    add-int/lit8 v1, v1, 0x4

    :goto_2b
    if-ge v1, v5, :cond_5a

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_59

    goto :goto_2c

    :cond_59
    invoke-static {v4, v2}, Landroidx/health/platform/client/proto/z2;->b(I[B)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-virtual {v3, v1}, Landroidx/health/platform/client/proto/q0;->c(F)V

    add-int/lit8 v1, v4, 0x4

    goto :goto_2b

    :cond_5a
    :goto_2c
    return v1

    :pswitch_d
    move/from16 v1, p3

    move/from16 v5, p4

    move-object/from16 v7, p14

    move-object v8, v6

    move v6, v2

    move-object/from16 v2, p2

    if-ne v3, v10, :cond_5d

    move-object v6, v8

    check-cast v6, Landroidx/health/platform/client/proto/h0;

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v1

    iget v3, v7, Landroidx/health/platform/client/proto/d;->a:I

    add-int/2addr v3, v1

    :goto_2d
    if-ge v1, v3, :cond_5b

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Landroidx/health/platform/client/proto/h0;->c(D)V

    add-int/lit8 v1, v1, 0x8

    goto :goto_2d

    :cond_5b
    if-ne v1, v3, :cond_5c

    return v1

    :cond_5c
    invoke-static {}, Landroidx/health/platform/client/proto/InvalidProtocolBufferException;->d()Landroidx/health/platform/client/proto/InvalidProtocolBufferException;

    move-result-object v1

    throw v1

    :cond_5d
    const/4 v10, 0x1

    if-ne v3, v10, :cond_5f

    move-object v3, v8

    check-cast v3, Landroidx/health/platform/client/proto/h0;

    invoke-static {v1, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/h0;->c(D)V

    add-int/lit8 v1, v1, 0x8

    :goto_2e
    if-ge v1, v5, :cond_5f

    invoke-static {v2, v1, v7}, Landroidx/health/platform/client/proto/z2;->j([BILandroidx/health/platform/client/proto/d;)I

    move-result v4

    iget v8, v7, Landroidx/health/platform/client/proto/d;->a:I

    if-eq v6, v8, :cond_5e

    goto :goto_2f

    :cond_5e
    invoke-static {v4, v2}, Landroidx/health/platform/client/proto/z2;->c(I[B)J

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v8

    invoke-virtual {v3, v8, v9}, Landroidx/health/platform/client/proto/h0;->c(D)V

    add-int/lit8 v1, v4, 0x8

    goto :goto_2e

    :cond_5f
    :goto_2f
    return v1

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_a
        :pswitch_3
        :pswitch_8
        :pswitch_9
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final K(ILjava/lang/Object;)V
    .locals 4

    add-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget p1, v0, p1

    const v0, 0xfffff

    and-int/2addr v0, p1

    int-to-long v0, v0

    const-wide/32 v2, 0xfffff

    cmp-long v2, v0, v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    ushr-int/lit8 p1, p1, 0x14

    const/4 v2, 0x1

    shl-int p1, v2, p1

    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v2, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v2

    or-int/2addr p1, v2

    invoke-static {v0, v1, p2, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    return-void
.end method

.method public final L(II)I
    .locals 5

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v1, v0

    div-int/lit8 v1, v1, 0x3

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-gt p2, v1, :cond_2

    add-int v2, v1, p2

    ushr-int/lit8 v2, v2, 0x1

    mul-int/lit8 v3, v2, 0x3

    aget v4, v0, v3

    if-ne p1, v4, :cond_0

    return v3

    :cond_0
    if-ge p1, v4, :cond_1

    add-int/lit8 v2, v2, -0x1

    move v1, v2

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    move p2, v2

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public final M(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 3

    sget-object v0, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v0, p2, v1, v2, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    invoke-virtual {p0, p1, p2}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    return-void
.end method

.method public final N(Ljava/lang/Object;ILjava/lang/Object;I)V
    .locals 5

    sget-object v0, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {p0, p4}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v3, v1

    invoke-virtual {v0, p1, v3, v4, p3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    add-int/lit8 p4, p4, 0x2

    iget-object p3, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget p3, p3, p4

    and-int/2addr p3, v2

    int-to-long p3, p3

    invoke-static {p3, p4, p1, p2}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    return-void
.end method

.method public final P(I)I
    .locals 1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget p1, v0, p1

    return p1
.end method

.method public final Q(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V
    .locals 19

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v4, v3

    sget-object v5, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    const/4 v8, 0x0

    const v9, 0xfffff

    const/4 v10, 0x0

    :goto_0
    if-ge v8, v4, :cond_4

    invoke-virtual {v0, v8}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v11

    aget v12, v3, v8

    invoke-static {v11}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v13

    const/16 v14, 0x11

    const/4 v15, 0x1

    if-gt v13, v14, :cond_1

    add-int/lit8 v14, v8, 0x2

    aget v14, v3, v14

    const v16, 0xfffff

    and-int v6, v14, v16

    if-eq v6, v9, :cond_0

    int-to-long v9, v6

    invoke-virtual {v5, v1, v9, v10}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v10

    move v9, v6

    :cond_0
    ushr-int/lit8 v6, v14, 0x14

    shl-int v6, v15, v6

    goto :goto_1

    :cond_1
    const v16, 0xfffff

    const/4 v6, 0x0

    :goto_1
    and-int v11, v11, v16

    move/from16 v17, v8

    int-to-long v7, v11

    const/16 v11, 0x3f

    packed-switch v13, :pswitch_data_0

    move/from16 v13, v17

    :cond_2
    :goto_2
    const/4 v14, 0x0

    goto/16 :goto_3

    :pswitch_0
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, Landroidx/health/platform/client/proto/g1;->b(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto :goto_2

    :pswitch_1
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    shl-long v17, v6, v15

    shr-long/2addr v6, v11

    xor-long v6, v17, v6

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto :goto_2

    :pswitch_2
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    shl-int/lit8 v8, v6, 0x1

    shr-int/lit8 v6, v6, 0x1f

    xor-int/2addr v6, v8

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto :goto_2

    :pswitch_3
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto :goto_2

    :pswitch_4
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto :goto_2

    :pswitch_5
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_3

    :pswitch_6
    move/from16 v13, v17

    const/4 v14, 0x0

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_2

    :pswitch_7
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/health/platform/client/proto/h;

    invoke-virtual {v2, v12, v6}, Landroidx/health/platform/client/proto/g1;->a(ILandroidx/health/platform/client/proto/h;)V

    goto/16 :goto_2

    :pswitch_8
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, Landroidx/health/platform/client/proto/g1;->c(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_2

    :pswitch_9
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12, v6, v2}, Landroidx/health/platform/client/proto/o1;->S(ILjava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_2

    :pswitch_a
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    int-to-byte v6, v6

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->F(B)V

    goto/16 :goto_2

    :pswitch_b
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_2

    :pswitch_c
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_2

    :pswitch_d
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_2

    :pswitch_e
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_2

    :pswitch_f
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-static {v7, v8, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_2

    :pswitch_10
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Float;

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_2

    :pswitch_11
    move/from16 v13, v17

    invoke-virtual {v0, v12, v13, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Double;

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v6

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_2

    :pswitch_12
    move/from16 v13, v17

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v2, v12, v6, v13}, Landroidx/health/platform/client/proto/o1;->R(Landroidx/health/platform/client/proto/g1;ILjava/lang/Object;I)V

    goto/16 :goto_2

    :pswitch_13
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v8

    invoke-static {v6, v7, v2, v8}, Landroidx/health/platform/client/proto/v2;->F(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_2

    :pswitch_14
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->M(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_15
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->L(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_16
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->K(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_17
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->J(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_18
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->B(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_19
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->O(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1a
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->y(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1b
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->C(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1c
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->D(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1d
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->G(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1e
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->P(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_1f
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->H(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_20
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->E(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_21
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v15}, Landroidx/health/platform/client/proto/v2;->A(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_22
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->M(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_23
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->L(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_24
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->K(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_25
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->J(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_26
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->B(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_27
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->O(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_28
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2}, Landroidx/health/platform/client/proto/v2;->z(ILjava/util/List;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_2

    :pswitch_29
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v8

    invoke-static {v6, v7, v2, v8}, Landroidx/health/platform/client/proto/v2;->I(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_2

    :pswitch_2a
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2}, Landroidx/health/platform/client/proto/v2;->N(ILjava/util/List;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_2

    :pswitch_2b
    move/from16 v13, v17

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    const/4 v14, 0x0

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->y(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_2c
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->C(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_2d
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->D(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_2e
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->G(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_2f
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->P(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_30
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->H(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_31
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->E(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_3

    :pswitch_32
    move/from16 v13, v17

    const/4 v14, 0x0

    aget v6, v3, v13

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/util/List;

    invoke-static {v6, v7, v2, v14}, Landroidx/health/platform/client/proto/v2;->A(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_2

    :pswitch_33
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, Landroidx/health/platform/client/proto/g1;->b(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_2

    :pswitch_34
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    shl-long v17, v6, v15

    shr-long/2addr v6, v11

    xor-long v6, v17, v6

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_2

    :pswitch_35
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    shl-int/lit8 v8, v6, 0x1

    shr-int/lit8 v6, v6, 0x1f

    xor-int/2addr v6, v8

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_2

    :pswitch_36
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_2

    :pswitch_37
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_2

    :pswitch_38
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_3

    :pswitch_39
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_2

    :pswitch_3a
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroidx/health/platform/client/proto/h;

    invoke-virtual {v2, v12, v6}, Landroidx/health/platform/client/proto/g1;->a(ILandroidx/health/platform/client/proto/h;)V

    goto/16 :goto_2

    :pswitch_3b
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v0, v13}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v7

    invoke-virtual {v2, v12, v6, v7}, Landroidx/health/platform/client/proto/g1;->c(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_2

    :pswitch_3c
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v12, v6, v2}, Landroidx/health/platform/client/proto/o1;->S(ILjava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_2

    :pswitch_3d
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    int-to-byte v6, v6

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->F(B)V

    goto/16 :goto_2

    :pswitch_3e
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_2

    :pswitch_3f
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_2

    :pswitch_40
    move/from16 v13, v17

    and-int/2addr v6, v10

    if-eqz v6, :cond_2

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    const/4 v14, 0x0

    invoke-virtual {v7, v12, v14}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v7, v6}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto :goto_3

    :pswitch_41
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_3

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto :goto_3

    :pswitch_42
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_3

    invoke-virtual {v5, v1, v7, v8}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto :goto_3

    :pswitch_43
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_3

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v6

    iget-object v7, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v7, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    invoke-virtual {v7, v12, v6}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto :goto_3

    :pswitch_44
    move/from16 v13, v17

    const/4 v14, 0x0

    and-int/2addr v6, v10

    if-eqz v6, :cond_3

    sget-object v6, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v6

    iget-object v8, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v8, Landroidx/health/platform/client/proto/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v7}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v6

    invoke-virtual {v8, v12, v6, v7}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    :cond_3
    :goto_3
    add-int/lit8 v8, v13, 0x3

    goto/16 :goto_0

    :cond_4
    iget-object v3, v0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v3, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroidx/health/platform/client/proto/u0;

    iget-object v1, v1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {v1, v2}, Landroidx/health/platform/client/proto/e3;->e(Landroidx/health/platform/client/proto/g1;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final R(Landroidx/health/platform/client/proto/g1;ILjava/lang/Object;I)V
    .locals 3

    if-eqz p3, :cond_0

    invoke-virtual {p0, p4}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object p4

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p4, Landroidx/health/platform/client/proto/i1;

    iget-object p4, p4, Landroidx/health/platform/client/proto/i1;->a:Landroidx/health/platform/client/proto/h1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p3, Landroidx/health/platform/client/proto/j1;

    iget-object p1, p1, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast p1, Landroidx/health/platform/client/proto/k;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p3}, Landroidx/health/platform/client/proto/j1;->entrySet()Ljava/util/Set;

    move-result-object p3

    invoke-interface {p3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    const/4 v1, 0x2

    invoke-virtual {p1, p2, v1}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p4, v1, v2}, Landroidx/health/platform/client/proto/i1;->a(Landroidx/health/platform/client/proto/h1;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    invoke-virtual {p1, v1}, Landroidx/health/platform/client/proto/k;->P(I)V

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, p4, v1, v0}, Landroidx/health/platform/client/proto/i1;->b(Landroidx/health/platform/client/proto/k;Landroidx/health/platform/client/proto/h1;Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 11

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->k(Ljava/lang/Object;)V

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v2, v1

    if-ge v0, v2, :cond_2

    invoke-virtual {p0, v0}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v2

    const v3, 0xfffff

    and-int v4, v2, v3

    int-to-long v7, v4

    aget v4, v1, v0

    invoke-static {v2}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    invoke-virtual {p0, v0, p1, p2}, Landroidx/health/platform/client/proto/o1;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    :cond_0
    :goto_1
    move-object v6, p1

    goto/16 :goto_2

    :pswitch_1
    invoke-virtual {p0, v4, v0, p2}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v2, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7, v8, p1, v2}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v2, v0, 0x2

    aget v1, v1, v2

    and-int/2addr v1, v3

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v4}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v0, p1, p2}, Landroidx/health/platform/client/proto/o1;->x(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v4, v0, p2}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v2, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7, v8, p1, v2}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    add-int/lit8 v2, v0, 0x2

    aget v1, v1, v2

    and-int/2addr v1, v3

    int-to-long v1, v1

    invoke-static {v1, v2, p1, v4}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    goto :goto_1

    :pswitch_4
    sget-object v1, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    sget-object v1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v1, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    iget-object v3, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2, v1}, Landroidx/health/platform/client/proto/k1;->b(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/health/platform/client/proto/j1;

    move-result-object v1

    invoke-static {v7, v8, p1, v1}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_5
    iget-object v1, p0, Landroidx/health/platform/client/proto/o1;->k:Landroidx/health/platform/client/proto/d1;

    invoke-virtual {v1, v7, v8, p1, p2}, Landroidx/health/platform/client/proto/d1;->b(JLjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, v0, p1, p2}, Landroidx/health/platform/client/proto/o1;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    move-object v6, p1

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->p(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_8
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_9
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->p(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_a
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_b
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_c
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_d
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_e
    move-object v6, p1

    invoke-virtual {p0, v0, v6, p2}, Landroidx/health/platform/client/proto/o1;->w(ILjava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_f
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->o(JLjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_10
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1, v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->k(Ljava/lang/Object;JZ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_11
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_12
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->p(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto :goto_2

    :pswitch_13
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    invoke-static {v7, v8, v6, p1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto :goto_2

    :pswitch_14
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->p(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto :goto_2

    :pswitch_15
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->p(Ljava/lang/Object;JJ)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto :goto_2

    :pswitch_16
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v1

    invoke-virtual {p1, v6, v7, v8, v1}, Landroidx/health/platform/client/proto/m3;->n(Ljava/lang/Object;JF)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    goto :goto_2

    :pswitch_17
    move-object v6, p1

    invoke-virtual {p0, v0, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v9

    invoke-virtual/range {v5 .. v10}, Landroidx/health/platform/client/proto/m3;->m(Ljava/lang/Object;JD)V

    invoke-virtual {p0, v0, v6}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    :cond_1
    :goto_2
    add-int/lit8 v0, v0, 0x3

    move-object p1, v6

    goto/16 :goto_0

    :cond_2
    move-object v6, p1

    iget-object p1, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    invoke-static {p1, v6, p2}, Landroidx/health/platform/client/proto/v2;->w(Landroidx/health/platform/client/proto/d3;Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 8

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    instance-of v0, p1, Landroidx/health/platform/client/proto/u0;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Landroidx/health/platform/client/proto/u0;

    const v2, 0x7fffffff

    invoke-virtual {v0, v2}, Landroidx/health/platform/client/proto/u0;->o(I)V

    iput v1, v0, Landroidx/health/platform/client/proto/a;->memoizedHashCode:I

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->j()V

    :cond_1
    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v0, v0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v3

    const v4, 0xfffff

    and-int/2addr v4, v3

    int-to-long v4, v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v3

    const/16 v6, 0x9

    if-eq v3, v6, :cond_2

    packed-switch v3, :pswitch_data_0

    goto :goto_1

    :pswitch_0
    sget-object v3, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v3, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_3

    iget-object v7, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object v7, v6

    check-cast v7, Landroidx/health/platform/client/proto/j1;

    iput-boolean v1, v7, Landroidx/health/platform/client/proto/j1;->w:Z

    invoke-virtual {v3, p1, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_1

    :pswitch_1
    iget-object v3, p0, Landroidx/health/platform/client/proto/o1;->k:Landroidx/health/platform/client/proto/d1;

    invoke-virtual {v3, v4, v5, p1}, Landroidx/health/platform/client/proto/d1;->a(JLjava/lang/Object;)V

    goto :goto_1

    :cond_2
    :pswitch_2
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v3

    sget-object v6, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v6, p1, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4}, Landroidx/health/platform/client/proto/u2;->b(Ljava/lang/Object;)V

    :cond_3
    :goto_1
    add-int/lit8 v2, v2, 0x3

    goto :goto_0

    :cond_4
    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Landroidx/health/platform/client/proto/u0;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    iput-boolean v1, p1, Landroidx/health/platform/client/proto/e3;->e:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final c(Ljava/lang/Object;)Z
    .locals 13

    const v0, 0xfffff

    const/4 v1, 0x0

    move v3, v0

    move v2, v1

    move v4, v2

    :goto_0
    iget v5, p0, Landroidx/health/platform/client/proto/o1;->h:I

    const/4 v6, 0x1

    if-ge v2, v5, :cond_12

    iget-object v5, p0, Landroidx/health/platform/client/proto/o1;->g:[I

    aget v5, v5, v2

    iget-object v7, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget v8, v7, v5

    invoke-virtual {p0, v5}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v9

    add-int/lit8 v10, v5, 0x2

    aget v7, v7, v10

    and-int v10, v7, v0

    ushr-int/lit8 v7, v7, 0x14

    shl-int v7, v6, v7

    if-eq v10, v3, :cond_1

    if-eq v10, v0, :cond_0

    sget-object v3, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    int-to-long v11, v10

    invoke-virtual {v3, p1, v11, v12}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v4

    :cond_0
    move v3, v10

    :cond_1
    const/high16 v10, 0x10000000

    and-int/2addr v10, v9

    if-eqz v10, :cond_4

    if-ne v3, v0, :cond_2

    invoke-virtual {p0, v5, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    goto :goto_1

    :cond_2
    and-int v10, v4, v7

    if-eqz v10, :cond_3

    move v10, v6

    goto :goto_1

    :cond_3
    move v10, v1

    :goto_1
    if-nez v10, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-static {v9}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v10

    const/16 v11, 0x9

    if-eq v10, v11, :cond_e

    const/16 v11, 0x11

    if-eq v10, v11, :cond_e

    const/16 v6, 0x1b

    if-eq v10, v6, :cond_b

    const/16 v6, 0x3c

    if-eq v10, v6, :cond_a

    const/16 v6, 0x44

    if-eq v10, v6, :cond_a

    const/16 v6, 0x31

    if-eq v10, v6, :cond_b

    const/16 v6, 0x32

    if-eq v10, v6, :cond_5

    goto/16 :goto_5

    :cond_5
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    iget-object v7, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v6, Landroidx/health/platform/client/proto/j1;

    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_6

    goto/16 :goto_5

    :cond_6
    invoke-virtual {p0, v5}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/health/platform/client/proto/i1;

    iget-object v5, v5, Landroidx/health/platform/client/proto/i1;->a:Landroidx/health/platform/client/proto/h1;

    iget-object v5, v5, Landroidx/health/platform/client/proto/h1;->b:Landroidx/health/platform/client/proto/v3;

    iget-object v5, v5, Landroidx/health/platform/client/proto/v3;->w:Landroidx/health/platform/client/proto/w3;

    sget-object v7, Landroidx/health/platform/client/proto/w3;->J:Landroidx/health/platform/client/proto/w3;

    if-eq v5, v7, :cond_7

    goto/16 :goto_5

    :cond_7
    invoke-virtual {v6}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v5

    const/4 v6, 0x0

    :cond_8
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_9

    sget-object v6, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v6, v8}, Landroidx/health/platform/client/proto/y1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;

    move-result-object v6

    :cond_9
    invoke-interface {v6, v7}, Landroidx/health/platform/client/proto/u2;->c(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto/16 :goto_4

    :cond_a
    invoke-virtual {p0, v8, v5, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {p0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Landroidx/health/platform/client/proto/u2;->c(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    goto :goto_4

    :cond_b
    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6}, Ljava/util/List;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_c

    goto :goto_5

    :cond_c
    invoke-virtual {p0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    move v7, v1

    :goto_2
    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v8

    if-ge v7, v8, :cond_11

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    invoke-interface {v5, v8}, Landroidx/health/platform/client/proto/u2;->c(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_4

    :cond_d
    add-int/lit8 v7, v7, 0x1

    goto :goto_2

    :cond_e
    if-ne v3, v0, :cond_f

    invoke-virtual {p0, v5, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_f
    and-int/2addr v7, v4

    if-eqz v7, :cond_10

    goto :goto_3

    :cond_10
    move v6, v1

    :goto_3
    if-eqz v6, :cond_11

    invoke-virtual {p0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    and-int v6, v9, v0

    int-to-long v6, v6

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-interface {v5, v6}, Landroidx/health/platform/client/proto/u2;->c(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    :goto_4
    return v1

    :cond_11
    :goto_5
    add-int/lit8 v2, v2, 0x1

    goto/16 :goto_0

    :cond_12
    return v6
.end method

.method public final d()Landroidx/health/platform/client/proto/u0;
    .locals 1

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->j:Landroidx/health/platform/client/proto/q1;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->e:Landroidx/health/platform/client/proto/a;

    check-cast v0, Landroidx/health/platform/client/proto/u0;

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/u0;->l()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V
    .locals 8

    iget-boolean v0, p0, Landroidx/health/platform/client/proto/o1;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual/range {p0 .. p5}, Landroidx/health/platform/client/proto/o1;->H(Ljava/lang/Object;[BIILandroidx/health/platform/client/proto/d;)V

    return-void

    :cond_0
    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v7, p5

    invoke-virtual/range {v1 .. v7}, Landroidx/health/platform/client/proto/o1;->G(Ljava/lang/Object;[BIIILandroidx/health/platform/client/proto/d;)I

    return-void
.end method

.method public final f(Landroidx/health/platform/client/proto/u0;)I
    .locals 11

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v4

    aget v5, v0, v2

    const v6, 0xfffff

    and-int/2addr v6, v4

    int-to-long v6, v6

    invoke-static {v4}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v4

    const/16 v8, 0x4d5

    const/16 v9, 0x4cf

    const/16 v10, 0x25

    packed-switch v4, :pswitch_data_0

    goto/16 :goto_4

    :pswitch_0
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    :goto_1
    add-int/2addr v4, v3

    move v3, v4

    goto/16 :goto_4

    :pswitch_1
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto :goto_1

    :pswitch_4
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_5
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_6
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto :goto_1

    :pswitch_7
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_8
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    mul-int/lit8 v3, v3, 0x35

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto :goto_1

    :pswitch_9
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    sget-object v5, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    :goto_2
    move v8, v9

    :cond_0
    add-int/2addr v8, v3

    move v3, v8

    goto/16 :goto_4

    :pswitch_b
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    invoke-static {v6, v7, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Float;

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {p0, v5, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_12
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_13
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_14
    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    :cond_1
    :goto_3
    mul-int/lit8 v3, v3, 0x35

    add-int/2addr v3, v10

    goto/16 :goto_4

    :pswitch_15
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_16
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_17
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_18
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_19
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1a
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_1b
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1c
    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v10

    goto :goto_3

    :pswitch_1d
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v4

    goto/16 :goto_1

    :pswitch_1e
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v4

    sget-object v5, Landroidx/health/platform/client/proto/x0;->a:Ljava/nio/charset/Charset;

    if-eqz v4, :cond_0

    goto/16 :goto_2

    :pswitch_1f
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_20
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_21
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_22
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_23
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :pswitch_24
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v4

    goto/16 :goto_1

    :pswitch_25
    mul-int/lit8 v3, v3, 0x35

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v6, v7, p1}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/x0;->a(J)I

    move-result v4

    goto/16 :goto_1

    :cond_2
    :goto_4
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_3
    mul-int/lit8 v3, v3, 0x35

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/e3;->hashCode()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;)Z
    .locals 11

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v1, v0

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    const/4 v4, 0x1

    if-ge v3, v1, :cond_2

    invoke-virtual {p0, v3}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v5

    const v6, 0xfffff

    and-int v7, v5, v6

    int-to-long v7, v7

    invoke-static {v5}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v5

    packed-switch v5, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    add-int/lit8 v5, v3, 0x2

    aget v5, v0, v5

    and-int/2addr v5, v6

    int-to-long v5, v5

    sget-object v9, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v9, v5, v6, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v10

    invoke-virtual {v9, v5, v6, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v10, v5, :cond_0

    invoke-virtual {v9, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v9, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :cond_0
    move v4, v2

    goto/16 :goto_1

    :pswitch_1
    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    :pswitch_2
    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v4, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6, v5}, Landroidx/health/platform/client/proto/v2;->x(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto :goto_1

    :pswitch_11
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto :goto_1

    :pswitch_12
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    goto :goto_1

    :pswitch_13
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v6

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v5

    if-ne v6, v5, :cond_0

    goto :goto_1

    :pswitch_14
    invoke-virtual {p0, p1, p2, v3}, Landroidx/health/platform/client/proto/o1;->j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z

    move-result v5

    if-eqz v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v7, v8, p1}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v9

    invoke-static {v9, v10}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v9

    invoke-virtual {v5, v7, v8, p2}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v5

    cmp-long v5, v9, v5

    if-nez v5, :cond_0

    :goto_1
    if-nez v4, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v3, v3, 0x3

    goto/16 :goto_0

    :cond_2
    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p2, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {p1, p2}, Landroidx/health/platform/client/proto/e3;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    :goto_2
    return v2

    :cond_3
    return v4

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v2, Landroidx/health/platform/client/proto/g1;->a:Ljava/lang/Object;

    check-cast v3, Landroidx/health/platform/client/proto/k;

    iget-boolean v4, v0, Landroidx/health/platform/client/proto/o1;->f:Z

    if-eqz v4, :cond_2

    iget-object v4, v0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v5, v4

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_1

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v8

    aget v9, v4, v7

    invoke-static {v8}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v10

    const/16 v11, 0x3f

    const/4 v12, 0x1

    const v13, 0xfffff

    packed-switch v10, :pswitch_data_0

    goto/16 :goto_1

    :pswitch_0
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, Landroidx/health/platform/client/proto/g1;->b(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_1
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v13, v8

    invoke-static {v13, v14, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v13

    shl-long v15, v13, v12

    shr-long v10, v13, v11

    xor-long/2addr v10, v15

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_1

    :pswitch_2
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    shl-int/lit8 v10, v8, 0x1

    shr-int/lit8 v8, v8, 0x1f

    xor-int/2addr v8, v10

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_1

    :pswitch_3
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_1

    :pswitch_4
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_1

    :pswitch_5
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_1

    :pswitch_6
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_1

    :pswitch_7
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/health/platform/client/proto/h;

    invoke-virtual {v2, v9, v8}, Landroidx/health/platform/client/proto/g1;->a(ILandroidx/health/platform/client/proto/h;)V

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, Landroidx/health/platform/client/proto/g1;->c(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_9
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, Landroidx/health/platform/client/proto/o1;->S(ILjava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_1

    :pswitch_a
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    int-to-byte v8, v8

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->F(B)V

    goto/16 :goto_1

    :pswitch_b
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_1

    :pswitch_e
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    invoke-static {v10, v11, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_1

    :pswitch_10
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Float;

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_1

    :pswitch_11
    invoke-virtual {v0, v9, v7, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_1

    :pswitch_12
    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v2, v9, v8, v7}, Landroidx/health/platform/client/proto/o1;->R(Landroidx/health/platform/client/proto/g1;ILjava/lang/Object;I)V

    goto/16 :goto_1

    :pswitch_13
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, Landroidx/health/platform/client/proto/v2;->F(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_14
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->M(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_15
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->L(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_16
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->K(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_17
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->J(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_18
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->B(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_19
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->O(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1a
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->y(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1b
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->C(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1c
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->D(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1d
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->G(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1e
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->P(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_1f
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->H(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_20
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->E(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_21
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v12}, Landroidx/health/platform/client/proto/v2;->A(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_22
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->M(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_23
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->L(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_24
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->K(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_25
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->J(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_26
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->B(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_27
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->O(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_28
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, Landroidx/health/platform/client/proto/v2;->z(ILjava/util/List;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_1

    :pswitch_29
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-static {v9, v8, v2, v10}, Landroidx/health/platform/client/proto/v2;->I(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_2a
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2}, Landroidx/health/platform/client/proto/v2;->N(ILjava/util/List;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_1

    :pswitch_2b
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->y(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_2c
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->C(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_2d
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->D(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_2e
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->G(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_2f
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->P(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_30
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->H(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_31
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->E(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_32
    aget v9, v4, v7

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-static {v9, v8, v2, v6}, Landroidx/health/platform/client/proto/v2;->A(ILjava/util/List;Landroidx/health/platform/client/proto/g1;Z)V

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, Landroidx/health/platform/client/proto/g1;->b(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v13, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v13, v14, v1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v13

    shl-long v15, v13, v12

    shr-long v10, v13, v11

    xor-long/2addr v10, v15

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto/16 :goto_1

    :pswitch_35
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    shl-int/lit8 v10, v8, 0x1

    shr-int/lit8 v8, v8, 0x1f

    xor-int/2addr v8, v10

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_1

    :pswitch_36
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto/16 :goto_1

    :pswitch_37
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_1

    :pswitch_38
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto/16 :goto_1

    :pswitch_39
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->P(I)V

    goto/16 :goto_1

    :pswitch_3a
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroidx/health/platform/client/proto/h;

    invoke-virtual {v2, v9, v8}, Landroidx/health/platform/client/proto/g1;->a(ILandroidx/health/platform/client/proto/h;)V

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-virtual {v0, v7}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v10

    invoke-virtual {v2, v9, v8, v10}, Landroidx/health/platform/client/proto/g1;->c(ILjava/lang/Object;Landroidx/health/platform/client/proto/u2;)V

    goto/16 :goto_1

    :pswitch_3c
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9, v8, v2}, Landroidx/health/platform/client/proto/o1;->S(ILjava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    goto/16 :goto_1

    :pswitch_3d
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    int-to-byte v8, v8

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->F(B)V

    goto/16 :goto_1

    :pswitch_3e
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto/16 :goto_1

    :pswitch_3f
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    goto :goto_1

    :pswitch_40
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v8

    invoke-virtual {v3, v9, v6}, Landroidx/health/platform/client/proto/k;->O(II)V

    invoke-virtual {v3, v8}, Landroidx/health/platform/client/proto/k;->M(I)V

    goto :goto_1

    :pswitch_41
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto :goto_1

    :pswitch_42
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->Q(IJ)V

    goto :goto_1

    :pswitch_43
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result v8

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    invoke-virtual {v3, v9, v8}, Landroidx/health/platform/client/proto/k;->I(II)V

    goto :goto_1

    :pswitch_44
    invoke-virtual {v0, v7, v1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    and-int/2addr v8, v13

    int-to-long v10, v8

    sget-object v8, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v8, v10, v11, v1}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide v10

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v10, v11}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide v10

    invoke-virtual {v3, v9, v10, v11}, Landroidx/health/platform/client/proto/k;->K(IJ)V

    :cond_0
    :goto_1
    add-int/lit8 v7, v7, 0x3

    goto/16 :goto_0

    :cond_1
    iget-object v3, v0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v3, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast v1, Landroidx/health/platform/client/proto/u0;

    iget-object v1, v1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {v1, v2}, Landroidx/health/platform/client/proto/e3;->e(Landroidx/health/platform/client/proto/g1;)V

    return-void

    :cond_2
    invoke-virtual/range {p0 .. p2}, Landroidx/health/platform/client/proto/o1;->Q(Ljava/lang/Object;Landroidx/health/platform/client/proto/g1;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i(Landroidx/health/platform/client/proto/u0;)I
    .locals 1

    iget-boolean v0, p0, Landroidx/health/platform/client/proto/o1;->f:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->r(Landroidx/health/platform/client/proto/u0;)I

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->q(Landroidx/health/platform/client/proto/u0;)I

    move-result p1

    return p1
.end method

.method public final j(Landroidx/health/platform/client/proto/u0;Landroidx/health/platform/client/proto/u0;I)Z
    .locals 0

    invoke-virtual {p0, p3, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    invoke-virtual {p0, p3, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p2

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final m(I)Landroidx/health/platform/client/proto/t1;
    .locals 3

    const/4 v0, 0x2

    const/4 v1, 0x1

    const/4 v2, 0x3

    invoke-static {p1, v2, v0, v1}, Ld;->c(IIII)I

    move-result p1

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    check-cast p1, Landroidx/health/platform/client/proto/t1;

    return-object p1
.end method

.method public final n(I)Ljava/lang/Object;
    .locals 1

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->b:[Ljava/lang/Object;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final o(I)Landroidx/health/platform/client/proto/u2;
    .locals 3

    div-int/lit8 p1, p1, 0x3

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->b:[Ljava/lang/Object;

    aget-object v1, v0, p1

    check-cast v1, Landroidx/health/platform/client/proto/u2;

    if-eqz v1, :cond_0

    return-object v1

    :cond_0
    sget-object v1, Landroidx/health/platform/client/proto/y1;->c:Landroidx/health/platform/client/proto/y1;

    add-int/lit8 v2, p1, 0x1

    aget-object v2, v0, v2

    check-cast v2, Ljava/lang/Class;

    invoke-virtual {v1, v2}, Landroidx/health/platform/client/proto/y1;->a(Ljava/lang/Class;)Landroidx/health/platform/client/proto/u2;

    move-result-object v1

    aput-object v1, v0, p1

    return-object v1
.end method

.method public final q(Landroidx/health/platform/client/proto/u0;)I
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    sget-object v2, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    const v4, 0xfffff

    move v7, v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    :goto_0
    iget-object v9, v0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v10, v9

    if-ge v5, v10, :cond_8

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v10

    aget v11, v9, v5

    invoke-static {v10}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v12

    const/16 v13, 0x11

    const/4 v14, 0x1

    if-gt v12, v13, :cond_0

    add-int/lit8 v13, v5, 0x2

    aget v9, v9, v13

    and-int v13, v9, v4

    ushr-int/lit8 v9, v9, 0x14

    shl-int v9, v14, v9

    if-eq v13, v7, :cond_1

    int-to-long v7, v13

    invoke-virtual {v2, v1, v7, v8}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v8

    move v7, v13

    goto :goto_1

    :cond_0
    const/4 v9, 0x0

    :cond_1
    :goto_1
    and-int/2addr v10, v4

    int-to-long v3, v10

    const/16 v15, 0x3f

    const/4 v10, 0x4

    const/16 v13, 0x8

    packed-switch v12, :pswitch_data_0

    goto/16 :goto_a

    :pswitch_0
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/a;

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    invoke-static {v11, v3, v4}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v3

    :goto_2
    add-int/2addr v6, v3

    goto/16 :goto_a

    :pswitch_1
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    shl-long v10, v3, v14

    shr-long/2addr v3, v15

    xor-long/2addr v3, v10

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    :goto_3
    add-int/2addr v3, v9

    goto :goto_2

    :pswitch_2
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    shl-int/lit8 v9, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v3

    :goto_4
    add-int/2addr v3, v4

    goto :goto_2

    :pswitch_3
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11, v13, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_4
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11, v10, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_5
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v3

    goto :goto_4

    :pswitch_6
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v3

    goto :goto_4

    :pswitch_7
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/h;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/k;->v(ILandroidx/health/platform/client/proto/h;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_8
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    sget-object v9, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    check-cast v3, Landroidx/health/platform/client/proto/a;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result v3

    invoke-static {v3, v3, v9, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_9
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroidx/health/platform/client/proto/h;

    if-eqz v4, :cond_2

    check-cast v3, Landroidx/health/platform/client/proto/h;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v3

    invoke-static {v3, v3, v4, v6}, Lr;->c(IIII)I

    move-result v3

    :goto_5
    move v6, v3

    goto/16 :goto_a

    :cond_2
    check-cast v3, Ljava/lang/String;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->B(Ljava/lang/String;)I

    move-result v3

    :goto_6
    add-int/2addr v3, v4

    add-int/2addr v3, v6

    goto :goto_5

    :pswitch_a
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11, v14, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_b
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->x(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_c
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->y(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_d
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_e
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_f
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    invoke-static {v3, v4, v1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_10
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11, v10, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_11
    invoke-virtual {v0, v11, v5, v1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-static {v11, v13, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_12
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object v4

    iget-object v9, v0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v11, v3, v4}, Landroidx/health/platform/client/proto/k1;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_13
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    sget-object v9, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v9

    if-nez v9, :cond_3

    const/4 v12, 0x0

    goto :goto_8

    :cond_3
    const/4 v10, 0x0

    const/4 v12, 0x0

    :goto_7
    if-ge v10, v9, :cond_4

    invoke-interface {v3, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroidx/health/platform/client/proto/a;

    invoke-static {v11, v13, v4}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v13

    add-int/2addr v12, v13

    add-int/lit8 v10, v10, 0x1

    goto :goto_7

    :cond_4
    :goto_8
    add-int/2addr v6, v12

    goto/16 :goto_a

    :pswitch_14
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->p(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_15
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->n(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_16
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_17
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_18
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->c(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_19
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->s(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->i(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->u(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_1f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->k(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_20
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_21
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v3}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v3

    if-lez v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3, v4, v3, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_22
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->o(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_23
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->m(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_24
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_25
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_26
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->b(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_27
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->r(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_28
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->a(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_29
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    invoke-static {v11, v3, v4}, Landroidx/health/platform/client/proto/v2;->l(ILjava/util/List;Landroidx/health/platform/client/proto/u2;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2a
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->q(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2b
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    sget-object v4, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-nez v3, :cond_5

    const/4 v4, 0x0

    goto :goto_9

    :cond_5
    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    add-int/2addr v4, v14

    mul-int/2addr v4, v3

    :goto_9
    add-int/2addr v6, v4

    goto/16 :goto_a

    :pswitch_2c
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2d
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2e
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->h(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_2f
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->t(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_30
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->j(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_31
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_32
    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_33
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/a;

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    invoke-static {v11, v3, v4}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_34
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    shl-long v10, v3, v14

    shr-long/2addr v3, v15

    xor-long/2addr v3, v10

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_35
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    shl-int/lit8 v9, v3, 0x1

    shr-int/lit8 v3, v3, 0x1f

    xor-int/2addr v3, v9

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_36
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11, v13, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_37
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11, v10, v6}, Lr;->b(III)I

    move-result v6

    goto/16 :goto_a

    :pswitch_38
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_39
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_3a
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/health/platform/client/proto/h;

    invoke-static {v11, v3}, Landroidx/health/platform/client/proto/k;->v(ILandroidx/health/platform/client/proto/h;)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3b
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v5}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v4

    sget-object v9, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    check-cast v3, Landroidx/health/platform/client/proto/a;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-virtual {v3, v4}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result v3

    invoke-static {v3, v3, v9, v6}, Lr;->c(IIII)I

    move-result v6

    goto/16 :goto_a

    :pswitch_3c
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Landroidx/health/platform/client/proto/h;

    if-eqz v4, :cond_6

    check-cast v3, Landroidx/health/platform/client/proto/h;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-virtual {v3}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v3

    invoke-static {v3, v3, v4, v6}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_5

    :cond_6
    check-cast v3, Ljava/lang/String;

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->B(Ljava/lang/String;)I

    move-result v3

    goto/16 :goto_6

    :pswitch_3d
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11, v14, v6}, Lr;->b(III)I

    move-result v6

    goto :goto_a

    :pswitch_3e
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->x(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_3f
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->y(I)I

    move-result v3

    goto/16 :goto_2

    :pswitch_40
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v4

    invoke-static {v3}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v3

    goto/16 :goto_4

    :pswitch_41
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_42
    and-int/2addr v9, v8

    if-eqz v9, :cond_7

    invoke-virtual {v2, v1, v3, v4}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    move-result-wide v3

    invoke-static {v11}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v9

    invoke-static {v3, v4}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v3

    goto/16 :goto_3

    :pswitch_43
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11, v10, v6}, Lr;->b(III)I

    move-result v6

    goto :goto_a

    :pswitch_44
    and-int v3, v8, v9

    if-eqz v3, :cond_7

    invoke-static {v11, v13, v6}, Lr;->b(III)I

    move-result v6

    :cond_7
    :goto_a
    add-int/lit8 v5, v5, 0x3

    const v4, 0xfffff

    goto/16 :goto_0

    :cond_8
    iget-object v2, v0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v2, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v1, v1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {v1}, Landroidx/health/platform/client/proto/e3;->b()I

    move-result v1

    add-int/2addr v1, v6

    return v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final r(Landroidx/health/platform/client/proto/u0;)I
    .locals 12

    sget-object v0, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    const/4 v1, 0x0

    move v2, v1

    move v3, v2

    :goto_0
    iget-object v4, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    array-length v5, v4

    if-ge v2, v5, :cond_7

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v5

    invoke-static {v5}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result v6

    aget v7, v4, v2

    const v8, 0xfffff

    and-int/2addr v5, v8

    int-to-long v8, v5

    sget-object v5, Landroidx/health/platform/client/proto/p0;->x:Landroidx/health/platform/client/proto/p0;

    iget v5, v5, Landroidx/health/platform/client/proto/p0;->w:I

    if-lt v6, v5, :cond_0

    sget-object v5, Landroidx/health/platform/client/proto/p0;->y:Landroidx/health/platform/client/proto/p0;

    iget v5, v5, Landroidx/health/platform/client/proto/p0;->w:I

    if-gt v6, v5, :cond_0

    add-int/lit8 v5, v2, 0x2

    aget v4, v4, v5

    :cond_0
    const/16 v4, 0x3f

    const/4 v5, 0x4

    const/16 v10, 0x8

    const/4 v11, 0x1

    packed-switch v6, :pswitch_data_0

    goto/16 :goto_9

    :pswitch_0
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/a;

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    invoke-static {v7, v4, v5}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v4

    :goto_1
    add-int/2addr v3, v4

    goto/16 :goto_9

    :pswitch_1
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v7

    shl-long v8, v5, v11

    shr-long v4, v5, v4

    xor-long/2addr v4, v8

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    :goto_2
    add-int/2addr v4, v7

    goto :goto_1

    :pswitch_2
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    shl-int/lit8 v6, v4, 0x1

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v4

    :goto_3
    add-int/2addr v4, v5

    goto :goto_1

    :pswitch_3
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v10, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_4
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v5, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_5
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v4

    goto :goto_3

    :pswitch_6
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v4

    goto :goto_3

    :pswitch_7
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/h;

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/k;->v(ILandroidx/health/platform/client/proto/h;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_8
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    sget-object v6, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    check-cast v4, Landroidx/health/platform/client/proto/a;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-virtual {v4, v5}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result v4

    invoke-static {v4, v4, v6, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_9
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroidx/health/platform/client/proto/h;

    if-eqz v5, :cond_1

    check-cast v4, Landroidx/health/platform/client/proto/h;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v4

    invoke-static {v4, v4, v5, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :cond_1
    check-cast v4, Ljava/lang/String;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->B(Ljava/lang/String;)I

    move-result v4

    :goto_4
    add-int/2addr v4, v5

    add-int/2addr v4, v3

    move v3, v4

    goto/16 :goto_9

    :pswitch_a
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v11, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_b
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->x(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_c
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->y(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_d
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->C(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_e
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    :goto_5
    add-int/2addr v4, v6

    goto/16 :goto_1

    :pswitch_f
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v8, v9, p1}, Landroidx/health/platform/client/proto/o1;->D(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    goto :goto_5

    :pswitch_10
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v5, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_11
    invoke-virtual {p0, v7, v2, p1}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v10, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_12
    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->n(I)Ljava/lang/Object;

    move-result-object v5

    iget-object v6, p0, Landroidx/health/platform/client/proto/o1;->m:Landroidx/health/platform/client/proto/k1;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v7, v4, v5}, Landroidx/health/platform/client/proto/k1;->a(ILjava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_13
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    sget-object v6, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v6

    if-nez v6, :cond_2

    move v9, v1

    goto :goto_7

    :cond_2
    move v8, v1

    move v9, v8

    :goto_6
    if-ge v8, v6, :cond_3

    invoke-interface {v4, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroidx/health/platform/client/proto/a;

    invoke-static {v7, v10, v5}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v10

    add-int/2addr v9, v10

    add-int/lit8 v8, v8, 0x1

    goto :goto_6

    :cond_3
    :goto_7
    add-int/2addr v3, v9

    goto/16 :goto_9

    :pswitch_14
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->p(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_15
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->n(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_16
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_17
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_18
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->c(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_19
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->s(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1a
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    sget-object v5, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1b
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1c
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1d
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->i(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1e
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->u(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_1f
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->k(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_20
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->e(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_21
    invoke-virtual {v0, p1, v8, v9}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-static {v4}, Landroidx/health/platform/client/proto/v2;->g(Ljava/util/List;)I

    move-result v4

    if-lez v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4, v5, v4, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_22
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->o(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_23
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->m(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_24
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_25
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_26
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->b(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_27
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->r(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_28
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->a(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_29
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    invoke-static {v7, v4, v5}, Landroidx/health/platform/client/proto/v2;->l(ILjava/util/List;Landroidx/health/platform/client/proto/u2;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2a
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->q(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2b
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    sget-object v5, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    if-nez v4, :cond_4

    move v5, v1

    goto :goto_8

    :cond_4
    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    add-int/2addr v5, v11

    mul-int/2addr v5, v4

    :goto_8
    add-int/2addr v3, v5

    goto/16 :goto_9

    :pswitch_2c
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2d
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2e
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->h(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_2f
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->t(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_30
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->j(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_31
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->d(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_32
    invoke-static {p1, v8, v9}, Landroidx/health/platform/client/proto/o1;->v(Landroidx/health/platform/client/proto/u0;J)Ljava/util/List;

    move-result-object v4

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/v2;->f(ILjava/util/List;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_33
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/a;

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    invoke-static {v7, v4, v5}, Landroidx/health/platform/client/proto/k;->z(ILandroidx/health/platform/client/proto/a;Landroidx/health/platform/client/proto/u2;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_34
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    sget-object v5, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v5, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v5

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v7

    shl-long v8, v5, v11

    shr-long v4, v5, v4

    xor-long/2addr v4, v8

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    goto/16 :goto_2

    :pswitch_35
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    shl-int/lit8 v6, v4, 0x1

    shr-int/lit8 v4, v4, 0x1f

    xor-int/2addr v4, v6

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_36
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v10, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_37
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v5, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_38
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_39
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->D(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_3a
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/health/platform/client/proto/h;

    invoke-static {v7, v4}, Landroidx/health/platform/client/proto/k;->v(ILandroidx/health/platform/client/proto/h;)I

    move-result v4

    goto/16 :goto_1

    :pswitch_3b
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {p0, v2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v5

    sget-object v6, Landroidx/health/platform/client/proto/v2;->a:Ljava/lang/Class;

    check-cast v4, Landroidx/health/platform/client/proto/a;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-virtual {v4, v5}, Landroidx/health/platform/client/proto/a;->b(Landroidx/health/platform/client/proto/u2;)I

    move-result v4

    invoke-static {v4, v4, v6, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :pswitch_3c
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Landroidx/health/platform/client/proto/h;

    if-eqz v5, :cond_5

    check-cast v4, Landroidx/health/platform/client/proto/h;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-virtual {v4}, Landroidx/health/platform/client/proto/h;->size()I

    move-result v4

    invoke-static {v4, v4, v5, v3}, Lr;->c(IIII)I

    move-result v3

    goto/16 :goto_9

    :cond_5
    check-cast v4, Ljava/lang/String;

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->B(Ljava/lang/String;)I

    move-result v4

    goto/16 :goto_4

    :pswitch_3d
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v11, v3}, Lr;->b(III)I

    move-result v3

    goto/16 :goto_9

    :pswitch_3e
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->x(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_3f
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->y(I)I

    move-result v4

    goto/16 :goto_1

    :pswitch_40
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v5

    invoke-static {v4}, Landroidx/health/platform/client/proto/k;->A(I)I

    move-result v4

    goto/16 :goto_3

    :pswitch_41
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_42
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    sget-object v4, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v4, v8, v9, p1}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide v4

    invoke-static {v7}, Landroidx/health/platform/client/proto/k;->C(I)I

    move-result v6

    invoke-static {v4, v5}, Landroidx/health/platform/client/proto/k;->E(J)I

    move-result v4

    goto/16 :goto_5

    :pswitch_43
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v5, v3}, Lr;->b(III)I

    move-result v3

    goto :goto_9

    :pswitch_44
    invoke-virtual {p0, v2, p1}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-static {v7, v10, v3}, Lr;->b(III)I

    move-result v3

    :cond_6
    :goto_9
    add-int/lit8 v2, v2, 0x3

    goto/16 :goto_0

    :cond_7
    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->l:Landroidx/health/platform/client/proto/d3;

    check-cast v0, Landroidx/health/platform/client/proto/f3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Landroidx/health/platform/client/proto/u0;->unknownFields:Landroidx/health/platform/client/proto/e3;

    invoke-virtual {p1}, Landroidx/health/platform/client/proto/e3;->b()I

    move-result p1

    add-int/2addr p1, v3

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_44
        :pswitch_43
        :pswitch_42
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
        :pswitch_3d
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final s(ILjava/lang/Object;)Z
    .locals 6

    add-int/lit8 v0, p1, 0x2

    iget-object v1, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget v0, v1, v0

    const v1, 0xfffff

    and-int v2, v0, v1

    int-to-long v2, v2

    const-wide/32 v4, 0xfffff

    cmp-long v4, v2, v4

    const/4 v5, 0x1

    if-nez v4, :cond_2

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result p1

    and-int v0, p1, v1

    int-to-long v0, v0

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->O(I)I

    move-result p1

    const-wide/16 v2, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_1
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_2
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_3
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_4
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_5
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_6
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_7
    sget-object p1, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    sget-object v2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v2, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroidx/health/platform/client/proto/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :pswitch_8
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_3

    goto/16 :goto_0

    :pswitch_9
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->i(JLjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Ljava/lang/String;

    if-eqz p2, :cond_0

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_0
    instance-of p2, p1, Landroidx/health/platform/client/proto/h;

    if-eqz p2, :cond_1

    sget-object p2, Landroidx/health/platform/client/proto/h;->y:Landroidx/health/platform/client/proto/h;

    invoke-virtual {p2, p1}, Landroidx/health/platform/client/proto/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    xor-int/2addr p1, v5

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1

    :pswitch_a
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->c(JLjava/lang/Object;)Z

    move-result p1

    return p1

    :pswitch_b
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_c
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_d
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_e
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_f
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->h(JLjava/lang/Object;)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_10
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->f(JLjava/lang/Object;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :pswitch_11
    sget-object p1, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p1, v0, v1, p2}, Landroidx/health/platform/client/proto/m3;->e(JLjava/lang/Object;)D

    move-result-wide p1

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToRawLongBits(D)J

    move-result-wide p1

    cmp-long p1, p1, v2

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_2
    ushr-int/lit8 p1, v0, 0x14

    shl-int p1, v5, p1

    sget-object v0, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {v0, v2, v3, p2}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p2

    and-int/2addr p1, p2

    if-eqz p1, :cond_3

    :goto_0
    return v5

    :cond_3
    const/4 p1, 0x0

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final u(IILjava/lang/Object;)Z
    .locals 2

    add-int/lit8 p2, p2, 0x2

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget p2, v0, p2

    const v0, 0xfffff

    and-int/2addr p2, v0

    int-to-long v0, p2

    sget-object p2, Landroidx/health/platform/client/proto/n3;->c:Landroidx/health/platform/client/proto/m3;

    invoke-virtual {p2, v0, v1, p3}, Landroidx/health/platform/client/proto/m3;->g(JLjava/lang/Object;)I

    move-result p2

    if-ne p2, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final w(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 5

    invoke-virtual {p0, p1, p3}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v0

    const v1, 0xfffff

    and-int/2addr v0, v1

    int-to-long v0, v0

    sget-object v2, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v2, p3, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object p3

    invoke-virtual {p0, p1, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-static {v3}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v2, p2, v0, v1, v3}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v4

    invoke-interface {p3, v4, v3}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    invoke-virtual {p0, p1, p2}, Landroidx/health/platform/client/proto/o1;->K(ILjava/lang/Object;)V

    return-void

    :cond_2
    invoke-virtual {v2, p2, v0, v1}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    invoke-interface {p3}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v4

    invoke-interface {p3, v4, p1}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v0, v1, v4}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v4

    :cond_3
    invoke-interface {p3, p1, v3}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Source subfield "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget p1, v1, p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final x(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    iget-object v0, p0, Landroidx/health/platform/client/proto/o1;->a:[I

    aget v1, v0, p1

    invoke-virtual {p0, v1, p1, p3}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v2

    const v3, 0xfffff

    and-int/2addr v2, v3

    int-to-long v4, v2

    sget-object v2, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {v2, p3, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object p3

    invoke-virtual {p0, v1, p1, p2}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-static {v6}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v2, p2, v4, v5, v6}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p3}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v7

    invoke-interface {p3, v7, v6}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v4, v5, v7}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    :goto_0
    add-int/lit8 p1, p1, 0x2

    aget p1, v0, p1

    and-int/2addr p1, v3

    int-to-long v2, p1

    invoke-static {v2, v3, p2, v1}, Landroidx/health/platform/client/proto/n3;->n(JLjava/lang/Object;I)V

    return-void

    :cond_2
    invoke-virtual {v2, p2, v4, v5}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-interface {p3}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object v0

    invoke-interface {p3, v0, p1}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v2, p2, v4, v5, v0}, Lsun/misc/Unsafe;->putObject(Ljava/lang/Object;JLjava/lang/Object;)V

    move-object p1, v0

    :cond_3
    invoke-interface {p3, p1, v6}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void

    :cond_4
    new-instance p2, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source subfield "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    aget p1, v0, p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " is present but null: "

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final y(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v0

    invoke-virtual {p0, p1}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result v1

    const v2, 0xfffff

    and-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {p0, p1, p2}, Landroidx/health/platform/client/proto/o1;->s(ILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {p1, p2, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method

.method public final z(IILjava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-virtual {p0, p2}, Landroidx/health/platform/client/proto/o1;->o(I)Landroidx/health/platform/client/proto/u2;

    move-result-object v0

    invoke-virtual {p0, p1, p2, p3}, Landroidx/health/platform/client/proto/o1;->u(IILjava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    invoke-interface {v0}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object p1, Landroidx/health/platform/client/proto/o1;->o:Lsun/misc/Unsafe;

    invoke-virtual {p0, p2}, Landroidx/health/platform/client/proto/o1;->P(I)I

    move-result p2

    const v1, 0xfffff

    and-int/2addr p2, v1

    int-to-long v1, p2

    invoke-virtual {p1, p3, v1, v2}, Lsun/misc/Unsafe;->getObject(Ljava/lang/Object;J)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Landroidx/health/platform/client/proto/o1;->t(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    invoke-interface {v0}, Landroidx/health/platform/client/proto/u2;->d()Landroidx/health/platform/client/proto/u0;

    move-result-object p2

    if-eqz p1, :cond_2

    invoke-interface {v0, p2, p1}, Landroidx/health/platform/client/proto/u2;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_2
    return-object p2
.end method
