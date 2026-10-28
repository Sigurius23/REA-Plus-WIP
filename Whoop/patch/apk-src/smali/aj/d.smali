.class public Laj/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcf/g;
.implements Lxg3/i;
.implements Lwk/c;
.implements Lwk/f;
.implements Lio/sentry/cache/tape/e;
.implements Lpg3/h;
.implements Lr93/m;


# instance fields
.field public w:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IZ)V
    .locals 0

    sparse-switch p1, :sswitch_data_0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    new-instance p1, Ljava/util/concurrent/atomic/AtomicInteger;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>(I)V

    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    .line 4
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    new-instance p1, Ljc/a;

    const/16 p2, 0x11

    .line 6
    invoke-direct {p1, p2}, Ljc/a;-><init>(I)V

    .line 7
    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    .line 8
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    new-instance p1, Lr1/c;

    const/16 p2, 0x10

    new-array p2, p2, [Lp0/k;

    invoke-direct {p1, p2}, Lr1/c;-><init>([Ljava/lang/Object;)V

    .line 10
    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    .line 11
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 p1, 0x8

    .line 12
    invoke-static {p1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object p1

    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    .line 13
    :sswitch_3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2 -> :sswitch_3
        0xb -> :sswitch_2
        0x16 -> :sswitch_1
        0x17 -> :sswitch_0
    .end sparse-switch
.end method

.method public constructor <init>(Landroid/view/View;)V
    .locals 2

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    .line 34
    new-instance v0, Lh5/y;

    const/16 v1, 0xb

    .line 35
    invoke-direct {v0, p1, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    .line 36
    iput-object p1, v0, Lh5/y;->y:Landroid/view/View;

    .line 37
    iput-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    return-void

    .line 38
    :cond_0
    new-instance v0, Laj/c;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Laj/c;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/view/WindowInsetsController;)V
    .locals 3

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance v0, Lh5/y;

    const/4 v1, 0x0

    const/16 v2, 0xb

    .line 41
    invoke-direct {v0, v1, v2}, Laj/c;-><init>(Ljava/lang/Object;I)V

    .line 42
    iput-object p1, v0, Lh5/y;->z:Landroid/view/WindowInsetsController;

    .line 43
    iput-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>([I[F[[F)V
    .locals 22

    move-object/from16 v0, p2

    .line 15
    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    .line 16
    array-length v1, v0

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    new-array v3, v1, [[Ld0/t;

    const/4 v4, 0x0

    move v6, v2

    move v7, v6

    move v5, v4

    :goto_0
    if-ge v5, v1, :cond_5

    .line 17
    aget v8, p1, v5

    const/4 v9, 0x3

    const/4 v10, 0x2

    if-eqz v8, :cond_0

    if-eq v8, v2, :cond_3

    if-eq v8, v10, :cond_2

    if-eq v8, v9, :cond_1

    const/4 v9, 0x4

    if-eq v8, v9, :cond_0

    const/4 v9, 0x5

    if-eq v8, v9, :cond_0

    move v12, v7

    goto :goto_3

    :cond_0
    move v12, v9

    goto :goto_3

    :cond_1
    if-ne v6, v2, :cond_3

    goto :goto_2

    :goto_1
    move v12, v6

    goto :goto_3

    :cond_2
    :goto_2
    move v6, v10

    goto :goto_1

    :cond_3
    move v6, v2

    goto :goto_1

    .line 18
    :goto_3
    aget-object v7, p3, v5

    add-int/lit8 v8, v5, 0x1

    .line 19
    aget-object v9, p3, v8

    .line 20
    aget v13, v0, v5

    .line 21
    aget v14, v0, v8

    .line 22
    array-length v11, v7

    div-int/2addr v11, v10

    array-length v15, v7

    rem-int/2addr v15, v10

    add-int v10, v15, v11

    .line 23
    new-array v11, v10, [Ld0/t;

    move v15, v4

    :goto_4
    if-ge v15, v10, :cond_4

    mul-int/lit8 v16, v15, 0x2

    move-object/from16 v17, v11

    .line 24
    new-instance v11, Ld0/t;

    move/from16 v18, v15

    .line 25
    aget v15, v7, v16

    add-int/lit8 v19, v16, 0x1

    move/from16 v20, v16

    .line 26
    aget v16, v7, v19

    .line 27
    aget v20, v9, v20

    .line 28
    aget v19, v9, v19

    move/from16 v21, v19

    move-object/from16 v19, v17

    move/from16 v17, v20

    move/from16 v20, v18

    move/from16 v18, v21

    .line 29
    invoke-direct/range {v11 .. v18}, Ld0/t;-><init>(IFFFFFF)V

    aput-object v11, v19, v20

    add-int/lit8 v15, v20, 0x1

    move-object/from16 v11, v19

    goto :goto_4

    :cond_4
    move-object/from16 v19, v11

    .line 30
    aput-object v19, v3, v5

    move v5, v8

    move v7, v12

    goto :goto_0

    :cond_5
    move-object/from16 v5, p0

    .line 31
    iput-object v3, v5, Laj/d;->w:Ljava/lang/Object;

    return-void
.end method

.method public static q(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;
    .locals 1

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0

    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p0, p2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0

    :cond_4
    const/4 p0, 0x0

    return-object p0

    :cond_5
    :goto_0
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public static s(IIIIZ)Laj/d;
    .locals 7

    new-instance v0, Laj/d;

    const/4 v5, 0x0

    move v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v6, p4

    invoke-static/range {v1 .. v6}, Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;->obtain(IIIIZZ)Landroid/view/accessibility/AccessibilityNodeInfo$CollectionItemInfo;

    move-result-object p0

    invoke-direct {v0, p0}, Laj/d;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static t(Laj/d;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 38

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v5, 0x0

    :goto_0
    const/16 v6, 0x20

    if-ge v5, v3, :cond_0

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-gtz v7, :cond_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_0
    :goto_1
    if-le v3, v5, :cond_1

    add-int/lit8 v7, v3, -0x1

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v7

    invoke-static {v7, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v7

    if-gtz v7, :cond_1

    add-int/lit8 v3, v3, -0x1

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_2
    if-ge v5, v3, :cond_43

    :goto_3
    add-int/lit8 v8, v5, 0x1

    invoke-virtual {v1, v5}, Ljava/lang/String;->charAt(I)C

    move-result v5

    or-int/lit8 v9, v5, 0x20

    add-int/lit8 v10, v9, -0x61

    add-int/lit8 v11, v9, -0x7a

    mul-int/2addr v11, v10

    const/16 v10, 0x65

    if-gtz v11, :cond_2

    if-eq v9, v10, :cond_2

    goto :goto_4

    :cond_2
    if-lt v8, v3, :cond_42

    const/4 v5, 0x0

    :goto_4
    if-eqz v5, :cond_41

    or-int/lit8 v9, v5, 0x20

    const/16 v12, 0x7a

    if-eq v9, v12, :cond_3a

    const/4 v7, 0x0

    :goto_5
    if-ge v8, v3, :cond_3

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->k(II)I

    move-result v9

    if-gtz v9, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_3
    const-wide v14, 0xffffffffL

    const/high16 v9, 0x7fc00000    # Float.NaN

    if-ne v8, v3, :cond_4

    move v12, v6

    move/from16 v16, v7

    int-to-long v6, v8

    shl-long/2addr v6, v12

    invoke-static {v9}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v14

    or-long/2addr v6, v8

    move/from16 v32, v5

    move/from16 v19, v12

    :goto_6
    move-wide/from16 v21, v14

    const/16 v20, 0x1

    goto/16 :goto_27

    :cond_4
    move v12, v6

    move/from16 v16, v7

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v7, 0x2d

    if-ne v6, v7, :cond_5

    const/16 v17, 0x1

    :goto_7
    move/from16 v18, v9

    goto :goto_8

    :cond_5
    const/16 v17, 0x0

    goto :goto_7

    :goto_8
    const/16 v9, 0x2e

    move/from16 v19, v12

    const/16 v12, 0xa

    if-eqz v17, :cond_8

    add-int/lit8 v6, v8, 0x1

    if-ne v6, v3, :cond_6

    int-to-long v6, v6

    shl-long v6, v6, v19

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    and-long/2addr v8, v14

    or-long/2addr v6, v8

    move/from16 v32, v5

    goto :goto_6

    :cond_6
    const/16 v20, 0x1

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v13

    move-wide/from16 v21, v14

    add-int/lit8 v14, v13, -0x30

    int-to-char v14, v14

    if-ge v14, v12, :cond_7

    goto :goto_a

    :cond_7
    if-eq v13, v9, :cond_9

    int-to-long v6, v6

    shl-long v6, v6, v19

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    :goto_9
    and-long v8, v8, v21

    or-long/2addr v6, v8

    move/from16 v32, v5

    goto/16 :goto_27

    :cond_8
    move-wide/from16 v21, v14

    const/16 v20, 0x1

    move v13, v6

    move v6, v8

    :cond_9
    :goto_a
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v14

    const-wide/16 v23, 0x0

    move v15, v6

    move-wide/from16 v25, v23

    :goto_b
    const-wide/16 v27, 0xa

    if-eq v15, v3, :cond_b

    add-int/lit8 v11, v13, -0x30

    int-to-char v4, v11

    if-ge v4, v12, :cond_b

    mul-long v25, v25, v27

    move v4, v8

    int-to-long v7, v11

    add-long v25, v25, v7

    add-int/lit8 v15, v15, 0x1

    if-ge v15, v14, :cond_a

    invoke-virtual {v1, v15}, Ljava/lang/String;->charAt(I)C

    move-result v7

    move v13, v7

    goto :goto_c

    :cond_a
    const/4 v13, 0x0

    :goto_c
    move v8, v4

    const/16 v7, 0x2d

    goto :goto_b

    :cond_b
    move v4, v8

    sub-int v7, v15, v6

    if-eq v15, v3, :cond_12

    if-ne v13, v9, :cond_12

    add-int/lit8 v13, v15, 0x1

    move v8, v13

    const/16 v31, 0x10

    :goto_d
    sub-int v9, v3, v8

    const/16 v33, 0x30

    const/4 v11, 0x4

    if-lt v9, v11, :cond_d

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    int-to-long v10, v9

    add-int/lit8 v9, v8, 0x1

    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v9

    move/from16 v35, v13

    int-to-long v12, v9

    shl-long v12, v12, v31

    or-long v9, v10, v12

    add-int/lit8 v11, v8, 0x2

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    int-to-long v11, v11

    shl-long v11, v11, v19

    or-long/2addr v9, v11

    add-int/lit8 v11, v8, 0x3

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v11

    int-to-long v11, v11

    shl-long v11, v11, v33

    or-long/2addr v9, v11

    const-wide v11, 0x30003000300030L

    sub-long v11, v9, v11

    const-wide v36, 0x46004600460046L    # 2.447700077935472E-307

    add-long v9, v9, v36

    or-long/2addr v9, v11

    const-wide v36, -0x7f007f007f0080L

    and-long v9, v9, v36

    cmp-long v9, v9, v23

    if-eqz v9, :cond_c

    const/4 v9, -0x1

    goto :goto_e

    :cond_c
    const-wide v9, 0x3e80064000a0001L

    mul-long/2addr v11, v9

    ushr-long v9, v11, v33

    long-to-int v9, v9

    :goto_e
    if-ltz v9, :cond_e

    const-wide/16 v10, 0x2710

    mul-long v25, v25, v10

    int-to-long v9, v9

    add-long v25, v25, v9

    add-int/lit8 v8, v8, 0x4

    move/from16 v13, v35

    const/16 v10, 0x65

    const/16 v12, 0xa

    goto :goto_d

    :cond_d
    move/from16 v35, v13

    :cond_e
    if-ge v8, v14, :cond_f

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    goto :goto_f

    :cond_f
    const/4 v9, 0x0

    :goto_f
    move v13, v9

    :goto_10
    if-eq v8, v3, :cond_11

    add-int/lit8 v9, v13, -0x30

    int-to-char v10, v9

    const/16 v11, 0xa

    if-ge v10, v11, :cond_11

    mul-long v25, v25, v27

    int-to-long v9, v9

    add-long v25, v25, v9

    add-int/lit8 v8, v8, 0x1

    if-ge v8, v14, :cond_10

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v9

    goto :goto_f

    :cond_10
    const/4 v13, 0x0

    goto :goto_10

    :cond_11
    sub-int v9, v35, v8

    sub-int/2addr v7, v9

    move v10, v9

    move/from16 v9, v35

    goto :goto_11

    :cond_12
    const/16 v31, 0x10

    const/16 v33, 0x30

    move v8, v15

    move v9, v8

    const/4 v10, 0x0

    :goto_11
    if-nez v7, :cond_13

    int-to-long v6, v8

    shl-long v6, v6, v19

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v8, v4

    goto/16 :goto_9

    :cond_13
    or-int/lit8 v11, v13, 0x20

    const/16 v13, 0x65

    if-ne v11, v13, :cond_1d

    add-int/lit8 v11, v8, 0x1

    if-ge v11, v14, :cond_14

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v18

    move/from16 v13, v18

    :goto_12
    const/16 v12, 0x2d

    goto :goto_13

    :cond_14
    const/4 v13, 0x0

    goto :goto_12

    :goto_13
    if-ne v13, v12, :cond_15

    move/from16 v12, v20

    goto :goto_14

    :cond_15
    const/4 v12, 0x0

    :goto_14
    move/from16 v30, v4

    if-nez v12, :cond_16

    const/16 v4, 0x2b

    if-ne v13, v4, :cond_17

    :cond_16
    add-int/lit8 v11, v8, 0x2

    :cond_17
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/4 v13, 0x0

    :goto_15
    if-eq v11, v3, :cond_1a

    add-int/lit8 v4, v4, -0x30

    move/from16 v35, v10

    int-to-char v10, v4

    move/from16 v36, v4

    const/16 v4, 0xa

    if-ge v10, v4, :cond_1b

    const/16 v10, 0x400

    if-ge v13, v10, :cond_18

    mul-int/lit8 v13, v13, 0xa

    add-int v13, v13, v36

    :cond_18
    add-int/lit8 v11, v11, 0x1

    if-ge v11, v14, :cond_19

    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    move-result v10

    goto :goto_16

    :cond_19
    const/4 v10, 0x0

    :goto_16
    move v4, v10

    move/from16 v10, v35

    goto :goto_15

    :cond_1a
    move/from16 v35, v10

    :cond_1b
    if-eqz v12, :cond_1c

    neg-int v4, v13

    goto :goto_17

    :cond_1c
    move v4, v13

    :goto_17
    add-int v10, v35, v4

    goto :goto_18

    :cond_1d
    move/from16 v30, v4

    move/from16 v35, v10

    move v11, v8

    const/4 v4, 0x0

    :goto_18
    const/16 v12, 0x13

    if-le v7, v12, :cond_28

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v13

    move/from16 v34, v6

    :goto_19
    if-eq v11, v3, :cond_22

    move/from16 v12, v33

    if-eq v13, v12, :cond_1e

    const/16 v12, 0x2e

    if-ne v13, v12, :cond_1f

    :cond_1e
    const/16 v12, 0x30

    goto :goto_1a

    :cond_1f
    const/16 v12, 0x13

    goto :goto_1c

    :goto_1a
    if-ne v13, v12, :cond_20

    add-int/lit8 v7, v7, -0x1

    :cond_20
    add-int/lit8 v12, v34, 0x1

    if-ge v12, v14, :cond_21

    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    move-result v13

    goto :goto_1b

    :cond_21
    const/4 v13, 0x0

    :goto_1b
    move/from16 v34, v12

    const/16 v12, 0x13

    const/16 v33, 0x30

    goto :goto_19

    :cond_22
    :goto_1c
    if-le v7, v12, :cond_28

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v7

    move/from16 v34, v4

    move/from16 v32, v5

    move-wide/from16 v12, v23

    :goto_1d
    const-wide v4, 0xde0b6b3a7640000L

    if-eq v6, v15, :cond_24

    invoke-static {v12, v13, v4, v5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v10

    if-gez v10, :cond_24

    mul-long v12, v12, v27

    const/16 v33, 0x30

    add-int/lit8 v7, v7, -0x30

    int-to-long v4, v7

    add-long/2addr v12, v4

    add-int/lit8 v6, v6, 0x1

    if-ge v6, v14, :cond_23

    invoke-virtual {v1, v6}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move v7, v4

    goto :goto_1d

    :cond_23
    const/4 v7, 0x0

    goto :goto_1d

    :cond_24
    invoke-static {v12, v13, v4, v5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v7

    if-ltz v7, :cond_25

    sub-int/2addr v15, v6

    add-int v10, v15, v34

    :goto_1e
    move/from16 v4, v20

    goto :goto_21

    :cond_25
    invoke-virtual {v1, v9}, Ljava/lang/String;->charAt(I)C

    move-result v6

    move v7, v9

    :goto_1f
    if-eq v7, v8, :cond_27

    invoke-static {v12, v13, v4, v5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v10

    if-gez v10, :cond_27

    mul-long v12, v12, v27

    const/16 v33, 0x30

    add-int/lit8 v6, v6, -0x30

    int-to-long v4, v6

    add-long/2addr v12, v4

    add-int/lit8 v7, v7, 0x1

    if-ge v7, v14, :cond_26

    invoke-virtual {v1, v7}, Ljava/lang/String;->charAt(I)C

    move-result v4

    move v6, v4

    goto :goto_20

    :cond_26
    const/4 v6, 0x0

    :goto_20
    const-wide v4, 0xde0b6b3a7640000L

    goto :goto_1f

    :cond_27
    sub-int/2addr v9, v7

    add-int v10, v9, v34

    goto :goto_1e

    :cond_28
    move/from16 v32, v5

    move-wide/from16 v12, v25

    const/4 v4, 0x0

    :goto_21
    const/16 v5, -0xa

    if-gt v5, v10, :cond_2b

    const/16 v5, 0xb

    if-ge v10, v5, :cond_2b

    if-nez v4, :cond_2b

    const-wide/32 v4, 0x1000000

    invoke-static {v12, v13, v4, v5}, Ljava/lang/Long;->compareUnsigned(JJ)I

    move-result v4

    if-gtz v4, :cond_2b

    long-to-float v4, v12

    sget-object v5, Lo2/a;->a:[F

    if-gez v10, :cond_29

    neg-int v6, v10

    aget v5, v5, v6

    div-float/2addr v4, v5

    goto :goto_22

    :cond_29
    aget v5, v5, v10

    mul-float/2addr v4, v5

    :goto_22
    if-eqz v17, :cond_2a

    neg-float v4, v4

    :cond_2a
    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    :goto_23
    int-to-long v7, v4

    and-long v7, v7, v21

    or-long v6, v5, v7

    goto/16 :goto_27

    :cond_2b
    cmp-long v4, v12, v23

    if-nez v4, :cond_2d

    if-eqz v17, :cond_2c

    const/high16 v4, -0x80000000

    goto :goto_24

    :cond_2c
    const/4 v4, 0x0

    :goto_24
    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    goto :goto_23

    :cond_2d
    const/16 v4, -0x7e

    const-string v5, "substring(...)"

    if-gt v4, v10, :cond_34

    const/16 v4, 0x80

    if-ge v10, v4, :cond_34

    add-int/lit16 v4, v10, 0x145

    sget-object v6, Lo2/a;->b:[J

    aget-wide v6, v6, v4

    invoke-static {v12, v13}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result v4

    shl-long v8, v12, v4

    and-long v12, v8, v21

    ushr-long v8, v8, v19

    and-long v14, v6, v21

    ushr-long v6, v6, v19

    mul-long v25, v8, v6

    mul-long/2addr v6, v12

    mul-long/2addr v8, v14

    mul-long/2addr v12, v14

    ushr-long v12, v12, v19

    add-long/2addr v8, v12

    and-long v12, v6, v21

    add-long/2addr v8, v12

    ushr-long v8, v8, v19

    add-long v25, v25, v8

    ushr-long v6, v6, v19

    add-long v25, v25, v6

    const/16 v6, 0x3f

    ushr-long v7, v25, v6

    long-to-int v7, v7

    add-int/lit8 v8, v7, 0x9

    ushr-long v8, v25, v8

    xor-int/lit8 v7, v7, 0x1

    add-int/2addr v4, v7

    const-wide/16 v12, 0x1ff

    and-long v14, v25, v12

    cmp-long v7, v14, v12

    if-eqz v7, :cond_2e

    cmp-long v7, v14, v23

    const-wide/16 v12, 0x1

    if-nez v7, :cond_2f

    const-wide/16 v14, 0x3

    and-long/2addr v14, v8

    cmp-long v7, v14, v12

    if-nez v7, :cond_2f

    :cond_2e
    move/from16 v4, v30

    goto :goto_26

    :cond_2f
    add-long/2addr v8, v12

    ushr-long v7, v8, v20

    const-wide/high16 v14, 0x20000000000000L

    cmp-long v9, v7, v14

    if-ltz v9, :cond_30

    add-int/lit8 v4, v4, -0x1

    const-wide/high16 v7, 0x10000000000000L

    :cond_30
    const-wide v14, -0x10000000000001L

    and-long/2addr v7, v14

    const-wide/32 v14, 0x3526a

    int-to-long v9, v10

    mul-long/2addr v9, v14

    shr-long v9, v9, v31

    const/16 v14, 0x400

    int-to-long v14, v14

    add-long/2addr v9, v14

    int-to-long v14, v6

    add-long/2addr v9, v14

    int-to-long v14, v4

    sub-long/2addr v9, v14

    cmp-long v4, v9, v12

    if-ltz v4, :cond_31

    const-wide/16 v12, 0x7fe

    cmp-long v4, v9, v12

    if-lez v4, :cond_32

    :cond_31
    move/from16 v4, v30

    goto :goto_25

    :cond_32
    const/16 v4, 0x34

    shl-long v4, v9, v4

    or-long/2addr v4, v7

    if-eqz v17, :cond_33

    const-wide/high16 v23, -0x8000000000000000L

    :cond_33
    or-long v4, v4, v23

    invoke-static {v4, v5}, Ljava/lang/Double;->longBitsToDouble(J)D

    move-result-wide v4

    double-to-float v4, v4

    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    goto/16 :goto_23

    :goto_25
    invoke-virtual {v1, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    goto/16 :goto_23

    :goto_26
    invoke-virtual {v1, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    goto/16 :goto_23

    :cond_34
    move/from16 v4, v30

    invoke-virtual {v1, v4, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4

    int-to-long v5, v11

    shl-long v5, v5, v19

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    goto/16 :goto_23

    :goto_27
    ushr-long v4, v6, v19

    long-to-int v4, v4

    and-long v5, v6, v21

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v6

    if-nez v6, :cond_36

    iget-object v6, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v6, [F

    add-int/lit8 v7, v16, 0x1

    aput v5, v6, v16

    array-length v8, v6

    if-lt v7, v8, :cond_35

    mul-int/lit8 v8, v7, 0x2

    new-array v8, v8, [F

    iput-object v8, v0, Laj/d;->w:Ljava/lang/Object;

    array-length v9, v6

    const/4 v10, 0x0

    invoke-static {v6, v10, v8, v10, v9}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_35
    move v8, v4

    goto :goto_28

    :cond_36
    move v8, v4

    move/from16 v7, v16

    :goto_28
    if-ge v8, v3, :cond_37

    invoke-virtual {v1, v8}, Ljava/lang/String;->charAt(I)C

    move-result v4

    const/16 v6, 0x2c

    if-ne v4, v6, :cond_37

    add-int/lit8 v8, v8, 0x1

    goto :goto_28

    :cond_37
    if-ge v8, v3, :cond_39

    invoke-static {v5}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_38

    goto :goto_29

    :cond_38
    move/from16 v6, v19

    move/from16 v5, v32

    const/16 v10, 0x65

    goto/16 :goto_5

    :cond_39
    :goto_29
    move v5, v8

    goto :goto_2a

    :cond_3a
    move/from16 v32, v5

    move/from16 v19, v6

    const/16 v20, 0x1

    goto :goto_29

    :goto_2a
    iget-object v4, v0, Laj/d;->w:Ljava/lang/Object;

    check-cast v4, [F

    const/4 v6, 0x2

    sparse-switch v32, :sswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown command for: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    move/from16 v4, v32

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_0
    add-int/lit8 v6, v7, -0x1

    const/4 v8, 0x0

    :goto_2b
    if-gt v8, v6, :cond_3d

    new-instance v9, Lo2/y;

    aget v10, v4, v8

    invoke-direct {v9, v10}, Lo2/y;-><init>(F)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_2b

    :sswitch_1
    add-int/lit8 v6, v7, -0x2

    const/4 v8, 0x0

    :goto_2c
    if-gt v8, v6, :cond_3d

    new-instance v9, Lo2/x;

    aget v10, v4, v8

    add-int/lit8 v11, v8, 0x1

    aget v11, v4, v11

    invoke-direct {v9, v10, v11}, Lo2/x;-><init>(FF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x2

    goto :goto_2c

    :sswitch_2
    add-int/lit8 v6, v7, -0x4

    const/4 v8, 0x0

    :goto_2d
    if-gt v8, v6, :cond_3d

    new-instance v9, Lo2/w;

    aget v10, v4, v8

    add-int/lit8 v11, v8, 0x1

    aget v11, v4, v11

    add-int/lit8 v12, v8, 0x2

    aget v12, v4, v12

    add-int/lit8 v13, v8, 0x3

    aget v13, v4, v13

    invoke-direct {v9, v10, v11, v12, v13}, Lo2/w;-><init>(FFFF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x4

    goto :goto_2d

    :sswitch_3
    add-int/lit8 v6, v7, -0x4

    const/4 v8, 0x0

    :goto_2e
    if-gt v8, v6, :cond_3d

    new-instance v9, Lo2/v;

    aget v10, v4, v8

    add-int/lit8 v11, v8, 0x1

    aget v11, v4, v11

    add-int/lit8 v12, v8, 0x2

    aget v12, v4, v12

    add-int/lit8 v13, v8, 0x3

    aget v13, v4, v13

    invoke-direct {v9, v10, v11, v12, v13}, Lo2/v;-><init>(FFFF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x4

    goto :goto_2e

    :sswitch_4
    add-int/lit8 v8, v7, -0x2

    if-ltz v8, :cond_3d

    new-instance v9, Lo2/u;

    const/16 v29, 0x0

    aget v10, v4, v29

    aget v11, v4, v20

    invoke-direct {v9, v10, v11}, Lo2/u;-><init>(FF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_2f
    if-gt v6, v8, :cond_3d

    new-instance v9, Lo2/t;

    aget v10, v4, v6

    add-int/lit8 v11, v6, 0x1

    aget v11, v4, v11

    invoke-direct {v9, v10, v11}, Lo2/t;-><init>(FF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x2

    goto :goto_2f

    :sswitch_5
    add-int/lit8 v6, v7, -0x2

    const/4 v10, 0x0

    :goto_30
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/t;

    aget v9, v4, v10

    add-int/lit8 v11, v10, 0x1

    aget v11, v4, v11

    invoke-direct {v8, v9, v11}, Lo2/t;-><init>(FF)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_30

    :sswitch_6
    add-int/lit8 v6, v7, -0x1

    const/4 v10, 0x0

    :goto_31
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/s;

    aget v9, v4, v10

    invoke-direct {v8, v9}, Lo2/s;-><init>(F)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_31

    :sswitch_7
    add-int/lit8 v6, v7, -0x6

    const/4 v10, 0x0

    :goto_32
    if-gt v10, v6, :cond_3d

    new-instance v11, Lo2/r;

    aget v12, v4, v10

    add-int/lit8 v8, v10, 0x1

    aget v13, v4, v8

    add-int/lit8 v8, v10, 0x2

    aget v14, v4, v8

    add-int/lit8 v8, v10, 0x3

    aget v15, v4, v8

    add-int/lit8 v8, v10, 0x4

    aget v16, v4, v8

    add-int/lit8 v8, v10, 0x5

    aget v17, v4, v8

    invoke-direct/range {v11 .. v17}, Lo2/r;-><init>(FFFFFF)V

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x6

    goto :goto_32

    :sswitch_8
    add-int/lit8 v6, v7, -0x7

    const/4 v10, 0x0

    :goto_33
    if-gt v10, v6, :cond_3d

    new-instance v11, Lo2/q;

    aget v12, v4, v10

    add-int/lit8 v8, v10, 0x1

    aget v13, v4, v8

    add-int/lit8 v8, v10, 0x2

    aget v14, v4, v8

    add-int/lit8 v8, v10, 0x3

    aget v8, v4, v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_3b

    move/from16 v15, v20

    goto :goto_34

    :cond_3b
    const/4 v15, 0x0

    :goto_34
    add-int/lit8 v8, v10, 0x4

    aget v8, v4, v8

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_3c

    move/from16 v16, v20

    goto :goto_35

    :cond_3c
    const/16 v16, 0x0

    :goto_35
    add-int/lit8 v8, v10, 0x5

    aget v17, v4, v8

    add-int/lit8 v8, v10, 0x6

    aget v18, v4, v8

    invoke-direct/range {v11 .. v18}, Lo2/q;-><init>(FFFZZFF)V

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x7

    goto :goto_33

    :sswitch_9
    sget-object v4, Lo2/i;->c:Lo2/i;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_3d
    const/16 v29, 0x0

    goto/16 :goto_41

    :sswitch_a
    add-int/lit8 v6, v7, -0x1

    const/4 v10, 0x0

    :goto_36
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/z;

    aget v9, v4, v10

    invoke-direct {v8, v9}, Lo2/z;-><init>(F)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_36

    :sswitch_b
    add-int/lit8 v6, v7, -0x2

    const/4 v10, 0x0

    :goto_37
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/p;

    aget v9, v4, v10

    add-int/lit8 v11, v10, 0x1

    aget v11, v4, v11

    invoke-direct {v8, v9, v11}, Lo2/p;-><init>(FF)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_37

    :sswitch_c
    add-int/lit8 v6, v7, -0x4

    const/4 v10, 0x0

    :goto_38
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/o;

    aget v9, v4, v10

    add-int/lit8 v11, v10, 0x1

    aget v11, v4, v11

    add-int/lit8 v12, v10, 0x2

    aget v12, v4, v12

    add-int/lit8 v13, v10, 0x3

    aget v13, v4, v13

    invoke-direct {v8, v9, v11, v12, v13}, Lo2/o;-><init>(FFFF)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_38

    :sswitch_d
    add-int/lit8 v6, v7, -0x4

    const/4 v10, 0x0

    :goto_39
    if-gt v10, v6, :cond_3d

    new-instance v8, Lo2/n;

    aget v9, v4, v10

    add-int/lit8 v11, v10, 0x1

    aget v11, v4, v11

    add-int/lit8 v12, v10, 0x2

    aget v12, v4, v12

    add-int/lit8 v13, v10, 0x3

    aget v13, v4, v13

    invoke-direct {v8, v9, v11, v12, v13}, Lo2/n;-><init>(FFFF)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x4

    goto :goto_39

    :sswitch_e
    add-int/lit8 v8, v7, -0x2

    if-ltz v8, :cond_3d

    new-instance v9, Lo2/m;

    const/16 v29, 0x0

    aget v10, v4, v29

    aget v11, v4, v20

    invoke-direct {v9, v10, v11}, Lo2/m;-><init>(FF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_3a
    if-gt v6, v8, :cond_40

    new-instance v9, Lo2/l;

    aget v10, v4, v6

    add-int/lit8 v11, v6, 0x1

    aget v11, v4, v11

    invoke-direct {v9, v10, v11}, Lo2/l;-><init>(FF)V

    invoke-interface {v2, v9}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x2

    goto :goto_3a

    :sswitch_f
    const/16 v29, 0x0

    add-int/lit8 v6, v7, -0x2

    move/from16 v10, v29

    :goto_3b
    if-gt v10, v6, :cond_40

    new-instance v8, Lo2/l;

    aget v9, v4, v10

    add-int/lit8 v11, v10, 0x1

    aget v11, v4, v11

    invoke-direct {v8, v9, v11}, Lo2/l;-><init>(FF)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x2

    goto :goto_3b

    :sswitch_10
    const/16 v29, 0x0

    add-int/lit8 v6, v7, -0x1

    move/from16 v10, v29

    :goto_3c
    if-gt v10, v6, :cond_40

    new-instance v8, Lo2/k;

    aget v9, v4, v10

    invoke-direct {v8, v9}, Lo2/k;-><init>(F)V

    invoke-interface {v2, v8}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x1

    goto :goto_3c

    :sswitch_11
    const/16 v29, 0x0

    add-int/lit8 v6, v7, -0x6

    move/from16 v10, v29

    :goto_3d
    if-gt v10, v6, :cond_40

    new-instance v11, Lo2/j;

    aget v12, v4, v10

    add-int/lit8 v8, v10, 0x1

    aget v13, v4, v8

    add-int/lit8 v8, v10, 0x2

    aget v14, v4, v8

    add-int/lit8 v8, v10, 0x3

    aget v15, v4, v8

    add-int/lit8 v8, v10, 0x4

    aget v16, v4, v8

    add-int/lit8 v8, v10, 0x5

    aget v17, v4, v8

    invoke-direct/range {v11 .. v17}, Lo2/j;-><init>(FFFFFF)V

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x6

    goto :goto_3d

    :sswitch_12
    const/16 v29, 0x0

    add-int/lit8 v6, v7, -0x7

    move/from16 v10, v29

    :goto_3e
    if-gt v10, v6, :cond_40

    new-instance v11, Lo2/h;

    aget v12, v4, v10

    add-int/lit8 v8, v10, 0x1

    aget v13, v4, v8

    add-int/lit8 v8, v10, 0x2

    aget v14, v4, v8

    add-int/lit8 v8, v10, 0x3

    aget v8, v4, v8

    const/4 v9, 0x0

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_3e

    move/from16 v15, v20

    goto :goto_3f

    :cond_3e
    move/from16 v15, v29

    :goto_3f
    add-int/lit8 v8, v10, 0x4

    aget v8, v4, v8

    invoke-static {v8, v9}, Ljava/lang/Float;->compare(FF)I

    move-result v8

    if-eqz v8, :cond_3f

    move/from16 v16, v20

    goto :goto_40

    :cond_3f
    move/from16 v16, v29

    :goto_40
    add-int/lit8 v8, v10, 0x5

    aget v17, v4, v8

    add-int/lit8 v8, v10, 0x6

    aget v18, v4, v8

    invoke-direct/range {v11 .. v18}, Lo2/h;-><init>(FFFZZFF)V

    invoke-interface {v2, v11}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v10, v10, 0x7

    goto :goto_3e

    :cond_40
    :goto_41
    move/from16 v6, v19

    goto/16 :goto_2

    :cond_41
    move v5, v8

    goto/16 :goto_2

    :cond_42
    move v5, v8

    goto/16 :goto_3

    :cond_43
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_12
        0x43 -> :sswitch_11
        0x48 -> :sswitch_10
        0x4c -> :sswitch_f
        0x4d -> :sswitch_e
        0x51 -> :sswitch_d
        0x53 -> :sswitch_c
        0x54 -> :sswitch_b
        0x56 -> :sswitch_a
        0x5a -> :sswitch_9
        0x61 -> :sswitch_8
        0x63 -> :sswitch_7
        0x68 -> :sswitch_6
        0x6c -> :sswitch_5
        0x6d -> :sswitch_4
        0x71 -> :sswitch_3
        0x73 -> :sswitch_2
        0x74 -> :sswitch_1
        0x76 -> :sswitch_0
        0x7a -> :sswitch_9
    .end sparse-switch
.end method


# virtual methods
.method public A(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V
    .locals 2

    const v0, 0x7f040511

    const/4 v1, 0x1

    invoke-virtual {p1, v0, p2, v1}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result p1

    if-eqz p1, :cond_0

    iget p1, p2, Landroid/util/TypedValue;->resourceId:I

    if-eqz p1, :cond_0

    iget-object p2, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {p2, p1}, Lm/m;->setTheme(I)V

    :cond_0
    return-void
.end method

.method public B(FF)V
    .locals 1

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Li2/v;->f(FF)V

    return-void
.end method

.method public C(Ljava/lang/String;Ljava/lang/String;)Lal/a;
    .locals 8

    const-string v0, "events"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lgj/g;

    iget v1, v0, Lgj/g;->s:I

    const/4 v2, 0x2

    if-ne v1, v2, :cond_0

    const-string v1, "https://api.eu.amplitude.com/2/httpapi"

    goto :goto_0

    :cond_0
    const-string v1, "https://api2.amplitude.com/2/httpapi"

    :goto_0
    :try_start_0
    new-instance v2, Ljava/net/URL;

    invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_3

    invoke-virtual {v2}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v1

    const-string v2, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/net/HttpURLConnection;

    const-string v2, "POST"

    invoke-virtual {v1, v2}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    const-string v2, "Content-Type"

    const-string v3, "application/json; charset=utf-8"

    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const-string v2, "Accept"

    const-string v3, "application/json"

    invoke-virtual {v1, v2, v3}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoOutput(Z)V

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setDoInput(Z)V

    const/16 v2, 0x3a98

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    const/16 v2, 0x4e20

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    iget-object v0, v0, Lgj/g;->a:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-string v4, "apiKey"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Ljava/text/SimpleDateFormat;

    const-string v5, "yyyy-MM-dd\'T\'HH:mm:ss.SSS\'Z\'"

    sget-object v6, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v4, v5, v6}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    const-string v5, "UTC"

    invoke-static {v5}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "{\"api_key\":\""

    const-string v7, "\",\"client_upload_time\":\""

    invoke-static {v6, v0, v7}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    new-instance v6, Ljava/util/Date;

    invoke-direct {v6, v2, v3}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v4, v6}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "sdf.format(Date(clientUploadTime))"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "\",\"events\":"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    const-string v0, ",\"request_metadata\":{\"sdk\":"

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p2, 0x7d

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_1
    const-string p1, "}"

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "StringBuilder().apply(builderAction).toString()"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    const-string p2, "this as java.lang.String).getBytes(charset)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p2

    const/4 v0, 0x0

    array-length v2, p1

    invoke-virtual {p2, p1, v0, v2}, Ljava/io/OutputStream;->write([BII)V

    invoke-virtual {v1}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result p1

    const/4 p2, 0x0

    :try_start_1
    invoke-virtual {v1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object v0

    const-string v2, "{\n            connection.inputStream\n        }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    goto :goto_1

    :catch_0
    :try_start_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;

    move-result-object v0

    const-string v2, "{\n            connection.errorStream\n        }"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    :goto_1
    :try_start_3
    sget-object v2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    new-instance v2, Ljava/io/BufferedReader;

    const/16 v4, 0x2000

    invoke-direct {v2, v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    invoke-static {v2}, Lvf3/b;->h(Ljava/io/Reader;)Ljava/lang/String;

    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :try_start_5
    invoke-interface {v2}, Ljava/io/Closeable;->close()V

    invoke-static {p1, v3}, Landroidx/room/c1;->l(ILjava/lang/String;)Lal/a;

    move-result-object p1
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_2
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object p1

    :catchall_0
    move-exception p1

    move-object p2, v0

    goto :goto_2

    :catchall_1
    move-exception p1

    :try_start_6
    throw p1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :catchall_2
    move-exception v3

    :try_start_7
    invoke-static {v2, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v3
    :try_end_7
    .catch Ljava/io/IOException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    :catchall_3
    move-exception p1

    goto :goto_2

    :catch_1
    move-object v0, p2

    :catch_2
    const/16 p1, 0x198

    :try_start_8
    invoke-static {p1, p2}, Landroidx/room/c1;->l(ILjava/lang/String;)Lal/a;

    move-result-object p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_2
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    return-object p1

    :goto_2
    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/io/InputStream;->close()V

    :cond_3
    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V

    throw p1

    :catch_3
    move-exception p1

    new-instance p2, Ljava/io/IOException;

    const-string v0, "Attempted to use malformed url: "

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public D(Lr93/w;Ljava/lang/StringBuilder;)V
    .locals 11

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v0}, Lxa3/i;->r()Z

    move-result v3

    const-string v4, "getTypeParameters(...)"

    const/4 v5, 0x1

    if-nez v3, :cond_c

    iget-object v3, v2, Lxa3/l;->g:Le4/c;

    sget-object v6, Lxa3/l;->Y:[Lj93/z;

    const/4 v7, 0x5

    aget-object v7, v6, v7

    invoke-interface {v3, v2, v7}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_b

    invoke-interface {p1}, Lr93/b;->c0()Ljava/util/List;

    move-result-object v3

    const-string v7, "getContextReceiverParameters(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2, v3}, Lxa3/i;->C(Ljava/lang/StringBuilder;Ljava/util/List;)V

    const/4 v3, 0x0

    invoke-virtual {v0, p2, p1, v3}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    invoke-interface {p1}, Lr93/z;->getVisibility()Lr93/r;

    move-result-object v3

    const-string v7, "getVisibility(...)"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3, p2}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    invoke-virtual {v0, p1, p2}, Lxa3/i;->M(Lr93/c;Ljava/lang/StringBuilder;)V

    iget-object v3, v2, Lxa3/l;->T:Le4/c;

    const/16 v7, 0x2c

    aget-object v8, v6, v7

    invoke-interface {v3, v2, v8}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-virtual {v0, p1, p2}, Lxa3/i;->K(Lr93/z;Ljava/lang/StringBuilder;)V

    :cond_0
    invoke-virtual {v0, p1, p2}, Lxa3/i;->S(Lr93/c;Ljava/lang/StringBuilder;)V

    iget-object v3, v2, Lxa3/l;->T:Le4/c;

    aget-object v6, v6, v7

    invoke-interface {v3, v2, v6}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v6, "suspend"

    if-eqz v3, :cond_9

    invoke-interface {p1}, Lr93/w;->isOperator()Z

    move-result v3

    const/16 v7, 0x27

    const/4 v8, 0x0

    const-string v9, "getOverriddenDescriptors(...)"

    if-eqz v3, :cond_4

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/lang/Iterable;

    move-object v10, v3

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr93/w;

    invoke-interface {v10}, Lr93/w;->isOperator()Z

    move-result v10

    if-eqz v10, :cond_2

    iget-object v3, v2, Lxa3/l;->O:Le4/c;

    sget-object v10, Lxa3/l;->Y:[Lj93/z;

    aget-object v10, v10, v7

    invoke-interface {v3, v2, v10}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    :cond_3
    :goto_0
    move v3, v5

    goto :goto_1

    :cond_4
    move v3, v8

    :goto_1
    invoke-interface {p1}, Lr93/w;->isInfix()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {p1}, Lr93/c;->h()Ljava/util/Collection;

    move-result-object v10

    invoke-static {v10, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v10, Ljava/lang/Iterable;

    move-object v9, v10

    check-cast v9, Ljava/util/Collection;

    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v9

    if-eqz v9, :cond_5

    goto :goto_2

    :cond_5
    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lr93/w;

    invoke-interface {v10}, Lr93/w;->isInfix()Z

    move-result v10

    if-eqz v10, :cond_6

    iget-object v9, v2, Lxa3/l;->O:Le4/c;

    sget-object v10, Lxa3/l;->Y:[Lj93/z;

    aget-object v7, v10, v7

    invoke-interface {v9, v2, v7}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_7
    :goto_2
    move v8, v5

    :cond_8
    invoke-interface {p1}, Lr93/w;->q()Z

    move-result v2

    const-string v7, "tailrec"

    invoke-virtual {v0, p2, v2, v7}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-interface {p1}, Lr93/w;->isSuspend()Z

    move-result v2

    invoke-virtual {v0, p2, v2, v6}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-interface {p1}, Lr93/w;->isInline()Z

    move-result v2

    const-string v6, "inline"

    invoke-virtual {v0, p2, v2, v6}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const-string v2, "infix"

    invoke-virtual {v0, p2, v8, v2}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    const-string v2, "operator"

    invoke-virtual {v0, p2, v3, v2}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    goto :goto_3

    :cond_9
    invoke-interface {p1}, Lr93/w;->isSuspend()Z

    move-result v2

    invoke-virtual {v0, p2, v2, v6}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    :goto_3
    invoke-virtual {v0, p1, p2}, Lxa3/i;->J(Lr93/c;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0}, Lxa3/i;->u()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {p1}, Lr93/w;->f0()Z

    move-result v2

    if-eqz v2, :cond_a

    const-string v2, "/*isHiddenToOvercomeSignatureClash*/ "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_a
    invoke-interface {p1}, Lr93/w;->j0()Z

    move-result v2

    if-eqz v2, :cond_b

    const-string v2, "/*isHiddenForResolutionEverywhereBesideSupercalls*/ "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_b
    const-string v2, "fun"

    invoke-virtual {v0, v2}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, p2, v5}, Lxa3/i;->c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0, p1, p2}, Lxa3/i;->U(Lr93/c;Ljava/lang/StringBuilder;)V

    :cond_c
    invoke-virtual {v0, p1, p2, v5}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    invoke-interface {p1}, Lr93/b;->v()Ljava/util/List;

    move-result-object v2

    const-string v3, "getValueParameters(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/util/Collection;

    invoke-interface {p1}, Lr93/b;->S()Z

    move-result v3

    invoke-virtual {v0, v2, v3, p2}, Lxa3/i;->f0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    invoke-virtual {v0, p1, p2}, Lxa3/i;->V(Lr93/c;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, Lr93/b;->getReturnType()Llb3/y;

    move-result-object v2

    iget-object v3, v1, Lxa3/l;->l:Le4/c;

    sget-object v5, Lxa3/l;->Y:[Lj93/z;

    const/16 v6, 0xa

    aget-object v6, v5, v6

    invoke-interface {v3, v1, v6}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_f

    iget-object v3, v1, Lxa3/l;->k:Le4/c;

    const/16 v6, 0x9

    aget-object v5, v5, v6

    invoke-interface {v3, v1, v5}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-nez v1, :cond_d

    if-eqz v2, :cond_d

    sget-object v1, Lo93/h;->e:Lva3/h;

    sget-object v1, Lo93/m;->d:Lva3/f;

    invoke-static {v2, v1}, Lo93/h;->E(Llb3/y;Lva3/f;)Z

    move-result v1

    if-nez v1, :cond_f

    :cond_d
    const-string v1, ": "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-nez v2, :cond_e

    const-string v1, "[NULL]"

    goto :goto_4

    :cond_e
    invoke-virtual {v0, v2}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object v1

    :goto_4
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_f
    invoke-interface {p1}, Lr93/b;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p2, p1}, Lxa3/i;->h0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    return-void
.end method

.method public E(Lu93/k0;Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->H:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0x20

    aget-object v3, v3, v4

    invoke-interface {v2, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxa3/q;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_2

    const/4 p3, 0x1

    if-eq v1, p3, :cond_1

    const/4 p1, 0x2

    if-ne v1, p1, :cond_0

    return-void

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    invoke-virtual {p0, p1, p2}, Laj/d;->D(Lr93/w;Ljava/lang/StringBuilder;)V

    return-void

    :cond_2
    invoke-virtual {v0, p1, p2}, Lxa3/i;->K(Lr93/z;Ljava/lang/StringBuilder;)V

    const-string v1, " for "

    invoke-virtual {p3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lu93/k0;->J0()Lr93/n0;

    move-result-object p1

    const-string p3, "getCorrespondingProperty(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1, p2}, Lxa3/i;->o(Lxa3/i;Lr93/n0;Ljava/lang/StringBuilder;)V

    return-void
.end method

.method public a([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 3

    check-cast p2, Ljava/lang/Long;

    invoke-virtual {p3, p1}, Ljava/security/MessageDigest;->update([B)V

    iget-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/nio/ByteBuffer;

    monitor-enter p1

    :try_start_0
    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Ljava/nio/ByteBuffer;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object p2

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p2

    invoke-virtual {p3, p2}, Ljava/security/MessageDigest;->update([B)V

    monitor-exit p1

    return-void

    :catchall_0
    move-exception p2

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public b(Li2/s0;I)V
    .locals 1

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Li2/v;->n(Li2/s0;I)V

    return-void
.end method

.method public c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z
    .locals 5

    check-cast p1, Ljava/io/InputStream;

    const-string p3, "StreamEncoder"

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lal/g;

    const/high16 v1, 0x10000

    const-class v2, [B

    invoke-virtual {v0, v1, v2}, Lal/g;->c(ILjava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    :try_start_0
    new-instance v4, Ljava/io/FileOutputStream;

    invoke-direct {v4, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :goto_0
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/io/InputStream;->read([B)I

    move-result p2

    const/4 v3, -0x1

    if-eq p2, v3, :cond_0

    invoke-virtual {v4, v1, v2, p2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catchall_0
    move-exception p1

    move-object v3, v4

    goto :goto_3

    :catch_0
    move-exception p1

    move-object v3, v4

    goto :goto_1

    :cond_0
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    invoke-virtual {v0, v1}, Lal/g;->g(Ljava/lang/Object;)V

    const/4 v2, 0x1

    goto :goto_2

    :catchall_1
    move-exception p1

    goto :goto_3

    :catch_2
    move-exception p1

    :goto_1
    const/4 p2, 0x3

    :try_start_3
    invoke-static {p3, p2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result p2

    if-eqz p2, :cond_1

    const-string p2, "Failed to encode data onto the OutputStream"

    invoke-static {p3, p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :cond_1
    if-eqz v3, :cond_2

    :try_start_4
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_2
    invoke-virtual {v0, v1}, Lal/g;->g(Ljava/lang/Object;)V

    :goto_2
    return v2

    :goto_3
    if-eqz v3, :cond_3

    :try_start_5
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4

    :catch_4
    :cond_3
    invoke-virtual {v0, v1}, Lal/g;->g(Ljava/lang/Object;)V

    throw p1
.end method

.method public d(FFFFI)V
    .locals 7

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v1

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v6}, Li2/v;->e(FFFFI)V

    return-void
.end method

.method public f(Ljava/lang/String;)V
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    return-void
.end method

.method public g(Lpg3/e;Lpg3/v0;)V
    .locals 1

    iget-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    iget-object v0, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v0, v0, Lud3/x0;->Q:Z

    if-eqz v0, :cond_0

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    new-instance v0, Lretrofit2/HttpException;

    invoke-direct {v0, p2}, Lretrofit2/HttpException;-><init>(Lpg3/v0;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public h(Lva3/c;Lsa3/e;)Lbu/c;
    .locals 2

    const-string v0, "classId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metadataVersion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Lva3/c;->b:Lva3/e;

    iget-object p2, p2, Lva3/e;->a:Lva3/f;

    iget-object p2, p2, Lva3/f;->a:Ljava/lang/String;

    const/16 v0, 0x24

    const/16 v1, 0x2e

    invoke-static {p2, v1, v0}, Lyb3/y;->L(Ljava/lang/String;CC)Ljava/lang/String;

    move-result-object p2

    iget-object p1, p1, Lva3/c;->a:Lva3/e;

    iget-object v0, p1, Lva3/e;->a:Lva3/f;

    invoke-virtual {v0}, Lva3/f;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :goto_0
    iget-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/ClassLoader;

    invoke-static {p1, p2}, Lva3/d;->k(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {p1}, Lva3/g;->l(Ljava/lang/Class;)Lw93/b;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance p2, Lbu/c;

    invoke-direct {p2, p1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public i([B)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/cache/f;

    :try_start_0
    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    new-instance v3, Ljava/io/ByteArrayInputStream;

    invoke-direct {v3, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    sget-object p1, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    invoke-direct {v2, v3, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    iget-object p1, v0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object p1

    const-class v2, Lio/sentry/e;

    invoke-interface {p1, v1, v2}, Lio/sentry/j1;->e(Ljava/io/Reader;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/e;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :catchall_1
    move-exception p1

    :try_start_3
    invoke-virtual {v1}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_0

    :catchall_2
    move-exception v1

    :try_start_4
    invoke-virtual {p1, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_1
    iget-object v0, v0, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {v0}, Lio/sentry/q6;->getLogger()Lio/sentry/v0;

    move-result-object v0

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Error reading entity from scope cache"

    invoke-interface {v0, v1, p1, v3, v2}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public j(Landroid/content/Context;Ljava/lang/String;Ljava/io/InputStream;Ljava/lang/String;Ljava/lang/String;)Lqi/b0;
    .locals 6

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Laj/c;

    if-nez p4, :cond_0

    const-string p4, "application/json"

    :cond_0
    const-string v1, "application/zip"

    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_6

    const-string v1, "application/x-zip"

    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "application/x-zip-compressed"

    invoke-virtual {p4, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    const-string v1, "\\?"

    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    aget-object v3, v3, v4

    const-string v5, ".lottie"

    invoke-virtual {v3, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_1

    goto/16 :goto_1

    :cond_1
    const-string p1, "application/gzip"

    invoke-virtual {p4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    const-string p1, "application/x-gzip"

    invoke-virtual {p4, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {p2, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    aget-object p1, p1, v4

    const-string p4, ".tgs"

    invoke-virtual {p1, p4}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {}, Ldj/c;->a()V

    sget-object p1, Laj/b;->x:Laj/b;

    if-eqz p5, :cond_3

    invoke-virtual {v0, p2, p3, p1}, Laj/c;->Z(Ljava/lang/String;Ljava/io/InputStream;Laj/b;)Ljava/io/File;

    move-result-object p3

    new-instance p4, Ljava/io/FileInputStream;

    invoke-virtual {p3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p4, p3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    sget-object p3, Lqi/l;->a:Ljava/util/HashMap;

    invoke-static {p4}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p3

    invoke-static {p3, p2}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p3

    goto :goto_4

    :cond_3
    sget-object p4, Lqi/l;->a:Ljava/util/HashMap;

    invoke-static {p3}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p3

    invoke-static {p3, v2}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p3

    goto :goto_4

    :cond_4
    :goto_0
    invoke-static {}, Ldj/c;->a()V

    sget-object p1, Laj/b;->z:Laj/b;

    if-eqz p5, :cond_5

    invoke-virtual {v0, p2, p3, p1}, Laj/c;->Z(Ljava/lang/String;Ljava/io/InputStream;Laj/b;)Ljava/io/File;

    move-result-object p3

    new-instance p4, Ljava/util/zip/GZIPInputStream;

    new-instance v1, Ljava/io/FileInputStream;

    invoke-direct {v1, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {p4, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    sget-object p3, Lqi/l;->a:Ljava/util/HashMap;

    invoke-static {p4}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p3

    invoke-static {p3, p2}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p3

    goto :goto_4

    :cond_5
    new-instance p4, Ljava/util/zip/GZIPInputStream;

    invoke-direct {p4, p3}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V

    sget-object p3, Lqi/l;->a:Ljava/util/HashMap;

    invoke-static {p4}, Lne3/b;->k(Ljava/io/InputStream;)Lne3/y;

    move-result-object p3

    invoke-static {p3, v2}, Lqi/l;->e(Lne3/y;Ljava/lang/String;)Lqi/b0;

    move-result-object p3

    goto :goto_4

    :cond_6
    :goto_1
    invoke-static {}, Ldj/c;->a()V

    sget-object p4, Laj/b;->y:Laj/b;

    if-eqz p5, :cond_7

    invoke-virtual {v0, p2, p3, p4}, Laj/c;->Z(Ljava/lang/String;Ljava/io/InputStream;Laj/b;)Ljava/io/File;

    move-result-object p3

    new-instance v1, Ljava/util/zip/ZipInputStream;

    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p3}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-direct {v1, v2}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, v1, p2}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object p1

    :goto_2
    move-object p3, p1

    goto :goto_3

    :cond_7
    new-instance v1, Ljava/util/zip/ZipInputStream;

    invoke-direct {v1, p3}, Ljava/util/zip/ZipInputStream;-><init>(Ljava/io/InputStream;)V

    invoke-static {p1, v1, v2}, Lqi/l;->h(Landroid/content/Context;Ljava/util/zip/ZipInputStream;Ljava/lang/String;)Lqi/b0;

    move-result-object p1

    goto :goto_2

    :goto_3
    move-object p1, p4

    :goto_4
    if-eqz p5, :cond_8

    iget-object p4, p3, Lqi/b0;->a:Lqi/i;

    if-eqz p4, :cond_8

    const/4 p4, 0x1

    invoke-static {p2, p1, p4}, Laj/c;->F(Ljava/lang/String;Laj/b;Z)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/io/File;

    invoke-virtual {v0}, Laj/c;->O()Ljava/io/File;

    move-result-object p4

    invoke-direct {p2, p4, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p1

    const-string p4, ".temp"

    const-string p5, ""

    invoke-virtual {p1, p4, p5}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    new-instance p4, Ljava/io/File;

    invoke-direct {p4, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p4}, Ljava/io/File;->renameTo(Ljava/io/File;)Z

    move-result p1

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    invoke-static {}, Ldj/c;->a()V

    if-nez p1, :cond_8

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p5, "Unable to rename cache file "

    invoke-direct {p1, p5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, " to "

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p2, "."

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ldj/c;->b(Ljava/lang/String;)V

    :cond_8
    return-object p3
.end method

.method public k()Lp1/t2;
    .locals 3

    invoke-static {}, Lh6/j;->a()Lh6/j;

    move-result-object v0

    invoke-virtual {v0}, Lh6/j;->c()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, Lt3/j;

    invoke-direct {v0, v2}, Lt3/j;-><init>(Z)V

    return-object v0

    :cond_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    new-instance v2, Lt3/f;

    invoke-direct {v2, v1, p0}, Lt3/f;-><init>(Lp1/k1;Laj/d;)V

    invoke-virtual {v0, v2}, Lh6/j;->h(Lh6/g;)V

    return-object v1
.end method

.method public l(Ljava/lang/String;J)J
    .locals 1

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0, p1, p2, p3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide p1

    return-wide p1
.end method

.method public m(Ljava/io/OutputStream;Ljava/lang/Object;)V
    .locals 3

    check-cast p2, Lio/sentry/e;

    new-instance v0, Ljava/io/BufferedWriter;

    new-instance v1, Ljava/io/OutputStreamWriter;

    sget-object v2, Lio/sentry/cache/f;->c:Ljava/nio/charset/Charset;

    invoke-direct {v1, p1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedWriter;-><init>(Ljava/io/Writer;)V

    :try_start_0
    iget-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Lio/sentry/cache/f;

    iget-object p1, p1, Lio/sentry/cache/f;->a:Lio/sentry/q6;

    invoke-virtual {p1}, Lio/sentry/q6;->getSerializer()Lio/sentry/j1;

    move-result-object p1

    invoke-interface {p1, v0, p2}, Lio/sentry/j1;->a(Ljava/io/Writer;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0}, Ljava/io/Writer;->close()V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    invoke-virtual {v0}, Ljava/io/Writer;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception p2

    invoke-virtual {p1, p2}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_0
    throw p1
.end method

.method public n([Ljava/lang/StackTraceElement;Z)Ljava/util/ArrayList;
    .locals 8

    if-eqz p1, :cond_4

    array-length v0, p1

    if-lez v0, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, p1, v2

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v4

    if-nez p2, :cond_0

    const-string v5, "io.sentry."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string v5, "io.sentry.samples."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    const-string v5, "io.sentry.mobile."

    invoke-virtual {v4, v5}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    new-instance v5, Lio/sentry/protocol/z;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object v6, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v6, Lio/sentry/q6;

    invoke-virtual {v6}, Lio/sentry/q6;->getInAppIncludes()Ljava/util/List;

    move-result-object v7

    invoke-virtual {v6}, Lio/sentry/q6;->getInAppExcludes()Ljava/util/List;

    move-result-object v6

    invoke-static {v4, v7, v6}, Laj/d;->q(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)Ljava/lang/Boolean;

    move-result-object v6

    iput-object v6, v5, Lio/sentry/protocol/z;->K:Ljava/lang/Boolean;

    iput-object v4, v5, Lio/sentry/protocol/z;->F:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/z;->E:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/z;->z:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    if-ltz v4, :cond_1

    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    iput-object v4, v5, Lio/sentry/protocol/z;->G:Ljava/lang/Integer;

    :cond_1
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    iput-object v3, v5, Lio/sentry/protocol/z;->M:Ljava/lang/Boolean;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/16 v4, 0x64

    if-lt v3, v4, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    :goto_2
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    return-object v0

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public o(FFFF)V
    .locals 9

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-virtual {v0}, La3/p;->A()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr p3, p1

    sub-float/2addr v2, p3

    invoke-virtual {v0}, La3/p;->A()J

    move-result-wide v5

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    long-to-int p3, v5

    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    add-float/2addr p4, p2

    sub-float/2addr p3, p4

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p4

    int-to-long v2, p4

    invoke-static {p3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p3

    int-to-long p3, p3

    shl-long/2addr v2, v4

    and-long/2addr p3, v7

    or-long/2addr p3, v2

    shr-long v2, p3, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v3, 0x0

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    and-long v4, p3, v7

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpl-float v2, v2, v3

    if-ltz v2, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_1

    const-string v2, "Width and height must be greater than or equal to zero"

    invoke-static {v2}, Li2/j0;->a(Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0, p3, p4}, La3/p;->U(J)V

    invoke-interface {v1, p1, p2}, Li2/v;->f(FF)V

    return-void
.end method

.method public p()V
    .locals 4

    new-instance v0, Landroid/util/TypedValue;

    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    iget-object v1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {v1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v1

    const v2, 0x7f040b74

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    const v2, 0x7f040b72

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v2

    if-eqz v2, :cond_0

    iget v2, v0, Landroid/util/TypedValue;->resourceId:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources$Theme;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    :cond_0
    const v2, 0x7f0405e3

    invoke-virtual {v1, v2, v0, v3}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    invoke-virtual {p0, v1, v0}, Laj/d;->A(Landroid/content/res/Resources$Theme;Landroid/util/TypedValue;)V

    return-void
.end method

.method public r(Lpg3/e;Ljava/lang/Throwable;)V
    .locals 0

    iget-object p1, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p1, Lbc3/m;

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-virtual {p1, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public request(J)V
    .locals 3

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lch3/i0;

    const-wide/16 v1, 0x0

    cmp-long v1, p1, v1

    if-lez v1, :cond_0

    iget-object v1, v0, Lch3/i0;->K:Ljava/util/concurrent/atomic/AtomicLong;

    invoke-static {v1, p1, p2}, Lch3/d;->b(Ljava/util/concurrent/atomic/AtomicLong;J)J

    invoke-virtual {v0}, Lch3/i0;->h()V

    :cond_0
    return-void
.end method

.method public u(JLjava/lang/String;)Z
    .locals 1

    const-string v0, "key"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Landroid/content/SharedPreferences;

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0, p3, p1, p2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    move-result p1

    return p1
.end method

.method public v(FJ)V
    .locals 5

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    const/16 v1, 0x20

    shr-long v1, p2, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p2, v3

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-interface {v0, v2, p3}, Li2/v;->f(FF)V

    invoke-interface {v0, p1}, Li2/v;->j(F)V

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, Li2/v;->f(FF)V

    return-void
.end method

.method public visitClassDescriptor(Lr93/e;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    move-object v1, p2

    check-cast v1, Ljava/lang/StringBuilder;

    iget-object p2, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast p2, Lxa3/i;

    iget-object v0, p2, Lxa3/i;->a:Lxa3/l;

    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v2

    sget-object v3, Lr93/f;->z:Lr93/f;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-ne v2, v3, :cond_0

    move v2, v5

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    invoke-virtual {p2}, Lxa3/i;->r()Z

    move-result v3

    const/4 v6, 0x0

    const-string v7, "companion object"

    const-string v8, "getVisibility(...)"

    if-nez v3, :cond_12

    invoke-interface {p1}, Lr93/e;->M()Ljava/util/List;

    move-result-object v3

    const-string v9, "getContextReceivers(...)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1, v3}, Lxa3/i;->C(Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {p2, v1, p1, v6}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    if-nez v2, :cond_1

    invoke-interface {p1}, Lr93/e;->getVisibility()Lr93/r;

    move-result-object v3

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3, v1}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    :cond_1
    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v3

    sget-object v9, Lr93/f;->x:Lr93/f;

    if-ne v3, v9, :cond_2

    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v3

    sget-object v9, Lr93/a0;->E:Lr93/a0;

    if-eq v3, v9, :cond_4

    :cond_2
    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v3

    invoke-virtual {v3}, Lr93/f;->a()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v3

    sget-object v9, Lr93/a0;->x:Lr93/a0;

    if-eq v3, v9, :cond_4

    :cond_3
    invoke-interface {p1}, Lr93/e;->k()Lr93/a0;

    move-result-object v3

    const-string v9, "getModality(...)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lxa3/i;->v(Lr93/z;)Lr93/a0;

    move-result-object v9

    invoke-virtual {p2, v3, v1, v9}, Lxa3/i;->L(Lr93/a0;Ljava/lang/StringBuilder;Lr93/a0;)V

    :cond_4
    invoke-virtual {p2, p1, v1}, Lxa3/i;->K(Lr93/z;Ljava/lang/StringBuilder;)V

    invoke-virtual {p2}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v3

    sget-object v9, Lxa3/j;->H:Lxa3/j;

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Lr93/i;->isInner()Z

    move-result v3

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    move v3, v4

    :goto_1
    const-string v9, "inner"

    invoke-virtual {p2, v1, v3, v9}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p2}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v3

    sget-object v9, Lxa3/j;->J:Lxa3/j;

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface {p1}, Lr93/e;->o0()Z

    move-result v3

    if-eqz v3, :cond_6

    move v3, v5

    goto :goto_2

    :cond_6
    move v3, v4

    :goto_2
    const-string v9, "data"

    invoke-virtual {p2, v1, v3, v9}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p2}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v3

    sget-object v9, Lxa3/j;->K:Lxa3/j;

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-interface {p1}, Lr93/e;->isInline()Z

    move-result v3

    if-eqz v3, :cond_7

    move v3, v5

    goto :goto_3

    :cond_7
    move v3, v4

    :goto_3
    const-string v9, "inline"

    invoke-virtual {p2, v1, v3, v9}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p2}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v3

    sget-object v9, Lxa3/j;->Q:Lxa3/j;

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Lr93/e;->isValue()Z

    move-result v3

    if-eqz v3, :cond_8

    move v3, v5

    goto :goto_4

    :cond_8
    move v3, v4

    :goto_4
    const-string v9, "value"

    invoke-virtual {p2, v1, v3, v9}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    invoke-virtual {p2}, Lxa3/i;->q()Ljava/util/Set;

    move-result-object v3

    sget-object v9, Lxa3/j;->P:Lxa3/j;

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {p1}, Lr93/e;->Q()Z

    move-result v3

    if-eqz v3, :cond_9

    move v3, v5

    goto :goto_5

    :cond_9
    move v3, v4

    :goto_5
    const-string v9, "fun"

    invoke-virtual {p2, v1, v3, v9}, Lxa3/i;->N(Ljava/lang/StringBuilder;ZLjava/lang/String;)V

    instance-of v3, p1, Lr93/w0;

    if-eqz v3, :cond_a

    const-string v3, "typealias"

    goto :goto_6

    :cond_a
    invoke-interface {p1}, Lr93/e;->N()Z

    move-result v3

    if-eqz v3, :cond_b

    move-object v3, v7

    goto :goto_6

    :cond_b
    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    if-eqz v3, :cond_11

    if-eq v3, v5, :cond_10

    const/4 v9, 0x2

    if-eq v3, v9, :cond_f

    const/4 v9, 0x3

    if-eq v3, v9, :cond_e

    const/4 v9, 0x4

    if-eq v3, v9, :cond_d

    const/4 v9, 0x5

    if-ne v3, v9, :cond_c

    const-string v3, "object"

    goto :goto_6

    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_d
    const-string v3, "annotation class"

    goto :goto_6

    :cond_e
    const-string v3, "enum entry"

    goto :goto_6

    :cond_f
    const-string v3, "enum class"

    goto :goto_6

    :cond_10
    const-string v3, "interface"

    goto :goto_6

    :cond_11
    const-string v3, "class"

    :goto_6
    invoke-virtual {p2, v3}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_12
    invoke-static {p1}, Lya3/f;->k(Lr93/k;)Z

    move-result v3

    if-nez v3, :cond_14

    invoke-virtual {p2}, Lxa3/i;->r()Z

    move-result v3

    if-nez v3, :cond_13

    invoke-static {v1}, Lxa3/i;->W(Ljava/lang/StringBuilder;)V

    :cond_13
    invoke-virtual {p2, p1, v1, v5}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    goto :goto_7

    :cond_14
    iget-object v3, v0, Lxa3/l;->G:Le4/c;

    sget-object v9, Lxa3/l;->Y:[Lj93/z;

    const/16 v10, 0x1f

    aget-object v9, v9, v10

    invoke-interface {v3, v0, v9}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v9, "getName(...)"

    if-eqz v3, :cond_16

    invoke-virtual {p2}, Lxa3/i;->r()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_15
    invoke-static {v1}, Lxa3/i;->W(Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, Lr93/k;->g()Lr93/k;

    move-result-object v3

    if-eqz v3, :cond_16

    const-string v7, "of "

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v3}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3, v4}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_16
    invoke-virtual {p2}, Lxa3/i;->u()Z

    move-result v3

    if-nez v3, :cond_17

    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    sget-object v7, Lva3/j;->b:Lva3/h;

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_17
    invoke-virtual {p2}, Lxa3/i;->r()Z

    move-result v3

    if-nez v3, :cond_18

    invoke-static {v1}, Lxa3/i;->W(Ljava/lang/StringBuilder;)V

    :cond_18
    invoke-interface {p1}, Lr93/k;->getName()Lva3/h;

    move-result-object v3

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v3, v5}, Lxa3/i;->O(Lva3/h;Z)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_19
    :goto_7
    if-eqz v2, :cond_1a

    goto/16 :goto_9

    :cond_1a
    invoke-interface {p1}, Lr93/e;->j()Ljava/util/List;

    move-result-object v7

    const-string v2, "getDeclaredTypeParameters(...)"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v7, v1, v4}, Lxa3/i;->c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {p2, p1, v1}, Lxa3/i;->A(Lr93/i;Ljava/lang/StringBuilder;)V

    invoke-interface {p1}, Lr93/e;->getKind()Lr93/f;

    move-result-object v2

    invoke-virtual {v2}, Lr93/f;->a()Z

    move-result v2

    if-nez v2, :cond_1b

    iget-object v2, v0, Lxa3/l;->i:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/4 v4, 0x7

    aget-object v3, v3, v4

    invoke-interface {v2, v0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {p1}, Lr93/e;->s()Lu93/j;

    move-result-object v2

    if-eqz v2, :cond_1b

    const-string v3, " "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1, v2, v6}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    move-object v3, v2

    check-cast v3, Lu93/x;

    invoke-virtual {v3}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v4

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v4, v1}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    const-string v4, "constructor"

    invoke-virtual {p2, v4}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lu93/x;->v()Ljava/util/List;

    move-result-object v3

    const-string v4, "getValueParameters(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v2}, Lr93/b;->S()Z

    move-result v2

    invoke-virtual {p2, v3, v2, v1}, Lxa3/i;->f0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    :cond_1b
    iget-object v2, v0, Lxa3/l;->x:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0x16

    aget-object v3, v3, v4

    invoke-interface {v2, v0, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1c

    goto :goto_8

    :cond_1c
    invoke-interface {p1}, Lr93/e;->i()Llb3/c0;

    move-result-object v0

    invoke-static {v0}, Lo93/h;->F(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_1d

    goto :goto_8

    :cond_1d
    invoke-interface {p1}, Lr93/h;->e()Llb3/q0;

    move-result-object p1

    invoke-interface {p1}, Llb3/q0;->getSupertypes()Ljava/util/Collection;

    move-result-object p1

    const-string v0, "getSupertypes(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1f

    invoke-interface {p1}, Ljava/util/Collection;->size()I

    move-result v0

    if-ne v0, v5, :cond_1e

    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llb3/y;

    invoke-static {v0}, Lo93/h;->y(Llb3/y;)Z

    move-result v0

    if-eqz v0, :cond_1e

    goto :goto_8

    :cond_1e
    invoke-static {v1}, Lxa3/i;->W(Ljava/lang/StringBuilder;)V

    const-string v0, ": "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Lxa3/h;

    const/4 p1, 0x1

    invoke-direct {v5, p2, p1}, Lxa3/h;-><init>(Lxa3/i;I)V

    const/16 v6, 0x3c

    const-string v2, ", "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    :cond_1f
    :goto_8
    invoke-virtual {p2, v1, v7}, Lxa3/i;->h0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitConstructorDescriptor(Lr93/j;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    iget-object v2, v1, Lxa3/l;->o:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    const/16 v4, 0xd

    aget-object v4, v3, v4

    invoke-interface {v2, v1, v4}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-nez v2, :cond_0

    move-object v2, p1

    check-cast v2, Lu93/j;

    invoke-virtual {v2}, Lu93/j;->P()Lr93/e;

    move-result-object v2

    invoke-interface {v2}, Lr93/e;->k()Lr93/a0;

    move-result-object v2

    sget-object v6, Lr93/a0;->y:Lr93/a0;

    if-eq v2, v6, :cond_1

    :cond_0
    move-object v2, p1

    check-cast v2, Lu93/x;

    invoke-virtual {v2}, Lu93/x;->getVisibility()Lr93/r;

    move-result-object v2

    const-string v6, "getVisibility(...)"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v2, p2}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    move-result v2

    if-eqz v2, :cond_1

    move v2, v5

    goto :goto_0

    :cond_1
    move v2, v4

    :goto_0
    invoke-virtual {v0, p1, p2}, Lxa3/i;->J(Lr93/c;Ljava/lang/StringBuilder;)V

    iget-object v6, v1, Lxa3/l;->P:Le4/c;

    const/16 v7, 0x28

    aget-object v7, v3, v7

    invoke-interface {v6, v1, v7}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-nez v6, :cond_3

    move-object v6, p1

    check-cast v6, Lu93/j;

    iget-boolean v6, v6, Lu93/j;->e0:Z

    if-eqz v6, :cond_3

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, v4

    goto :goto_2

    :cond_3
    :goto_1
    move v2, v5

    :goto_2
    if-eqz v2, :cond_4

    const-string v6, "constructor"

    invoke-virtual {v0, v6}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_4
    move-object v6, p1

    check-cast v6, Lu93/j;

    invoke-virtual {v6}, Lu93/j;->V0()Lr93/e;

    move-result-object v7

    const-string v8, "getContainingDeclaration(...)"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Lxa3/l;->A:Le4/c;

    const/16 v9, 0x19

    aget-object v10, v3, v9

    invoke-interface {v8, v1, v10}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_6

    if-eqz v2, :cond_5

    const-string v2, " "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v0, v7, p2, v5}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    move-object v2, p1

    check-cast v2, Lu93/x;

    invoke-virtual {v2}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2, p2, v4}, Lxa3/i;->c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    :cond_6
    move-object v2, p1

    check-cast v2, Lu93/x;

    invoke-virtual {v2}, Lu93/x;->v()Ljava/util/List;

    move-result-object v4

    const-string v5, "getValueParameters(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v4, Ljava/util/Collection;

    invoke-interface {p1}, Lr93/b;->S()Z

    move-result p1

    invoke-virtual {v0, v4, p1, p2}, Lxa3/i;->f0(Ljava/util/Collection;ZLjava/lang/StringBuilder;)V

    iget-object p1, v1, Lxa3/l;->q:Le4/c;

    const/16 v4, 0xf

    aget-object v3, v3, v4

    invoke-interface {p1, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_9

    iget-boolean p1, v6, Lu93/j;->e0:Z

    if-nez p1, :cond_9

    invoke-interface {v7}, Lr93/e;->s()Lu93/j;

    move-result-object p1

    if-eqz p1, :cond_9

    check-cast p1, Lu93/x;

    invoke-virtual {p1}, Lu93/x;->v()Ljava/util/List;

    move-result-object p1

    invoke-static {p1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lr93/a1;

    check-cast v5, Lu93/w0;

    invoke-virtual {v5}, Lu93/w0;->J0()Z

    move-result v6

    if-nez v6, :cond_7

    iget-object v5, v5, Lu93/w0;->K:Llb3/y;

    if-nez v5, :cond_7

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_8
    invoke-virtual {v3}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_9

    const-string p1, " : "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "this"

    invoke-virtual {v0, p1}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v7, Lxa3/g;->y:Lxa3/g;

    const/16 v8, 0x18

    const-string v4, ", "

    const-string v5, "("

    const-string v6, ")"

    invoke-static/range {v3 .. v8}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_9
    iget-object p1, v1, Lxa3/l;->A:Le4/c;

    sget-object v3, Lxa3/l;->Y:[Lj93/z;

    aget-object v3, v3, v9

    invoke-interface {p1, v1, v3}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_a

    invoke-virtual {v2}, Lu93/x;->getTypeParameters()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p2, p1}, Lxa3/i;->h0(Ljava/lang/StringBuilder;Ljava/util/List;)V

    :cond_a
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public bridge synthetic visitFunctionDescriptor(Lr93/w;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    invoke-virtual {p0, p1, p2}, Laj/d;->D(Lr93/w;Ljava/lang/StringBuilder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitModuleDeclaration(Lr93/b0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitPackageFragmentDescriptor(Lr93/g0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lu93/g0;

    iget-object v1, p1, Lu93/g0;->F:Lva3/e;

    const-string v2, "package-fragment"

    invoke-virtual {v0, v2}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    const-string v2, "fqName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, " "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v1}, Lxa3/l;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, " in "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lu93/g0;->J0()Lr93/b0;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitPackageViewDescriptor(Lr93/k0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p1, Lu93/a0;

    iget-object v1, p1, Lu93/a0;->E:Lva3/e;

    const-string v2, "package"

    invoke-virtual {v0, v2}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Lva3/e;->a:Lva3/f;

    const-string v2, "fqName"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lva3/f;->f(Lva3/f;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lv63/b;->j(Ljava/util/List;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxa3/i;->p(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_0

    const-string v2, " "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    iget-object v1, v0, Lxa3/i;->a:Lxa3/l;

    invoke-virtual {v1}, Lxa3/l;->o()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, " in context of "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lu93/a0;->z:Lu93/e0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitPropertyDescriptor(Lr93/n0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/StringBuilder;

    const-string v0, "descriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-static {v0, p1, p2}, Lxa3/i;->o(Lxa3/i;Lr93/n0;Ljava/lang/StringBuilder;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitPropertyGetterDescriptor(Lr93/o0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/StringBuilder;

    const-string v0, "getter"

    check-cast p1, Lu93/k0;

    invoke-virtual {p0, p1, p2, v0}, Laj/d;->E(Lu93/k0;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitPropertySetterDescriptor(Lr93/p0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p2, Ljava/lang/StringBuilder;

    const-string v0, "setter"

    check-cast p1, Lu93/k0;

    invoke-virtual {p0, p1, p2, v0}, Laj/d;->E(Lu93/k0;Ljava/lang/StringBuilder;Ljava/lang/String;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitReceiverParameterDescriptor(Lr93/q0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p2, Ljava/lang/StringBuilder;

    check-cast p1, Lu93/n;

    invoke-virtual {p1}, Lu93/n;->getName()Lva3/h;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitTypeAliasDescriptor(Lr93/w0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, p2, p1, v1}, Lxa3/i;->y(Ljava/lang/StringBuilder;Ls93/a;Ls93/d;)V

    check-cast p1, Lu93/g;

    invoke-virtual {p1}, Lu93/g;->getVisibility()Lr93/r;

    move-result-object v1

    const-string v2, "getVisibility(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p2}, Lxa3/i;->g0(Lr93/r;Ljava/lang/StringBuilder;)Z

    invoke-virtual {v0, p1, p2}, Lxa3/i;->K(Lr93/z;Ljava/lang/StringBuilder;)V

    const-string v1, "typealias"

    invoke-virtual {v0, v1}, Lxa3/i;->I(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, " "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lxa3/i;->P(Lr93/k;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {p1}, Lu93/g;->j()Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, p2, v2}, Lxa3/i;->c0(Ljava/util/List;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v0, p1, p2}, Lxa3/i;->A(Lr93/i;Ljava/lang/StringBuilder;)V

    const-string v1, " = "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    check-cast p1, Ljb3/u;

    invoke-virtual {p1}, Ljb3/u;->L0()Llb3/c0;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxa3/i;->X(Llb3/y;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitTypeParameterDescriptor(Lr93/x0;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, p2, v1}, Lxa3/i;->a0(Lr93/x0;Ljava/lang/StringBuilder;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public visitValueParameterDescriptor(Lr93/a1;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    check-cast p2, Ljava/lang/StringBuilder;

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lxa3/i;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1, p2, v1}, Lxa3/i;->e0(Lr93/a1;ZLjava/lang/StringBuilder;Z)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public w(FJF)V
    .locals 5

    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, La3/p;

    invoke-virtual {v0}, La3/p;->w()Li2/v;

    move-result-object v0

    const/16 v1, 0x20

    shr-long v1, p2, v1

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p2, v3

    long-to-int p2, p2

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p3

    invoke-interface {v0, v2, p3}, Li2/v;->f(FF)V

    invoke-interface {v0, p1, p4}, Li2/v;->a(FF)V

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    neg-float p1, p1

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    neg-float p2, p2

    invoke-interface {v0, p1, p2}, Li2/v;->f(FF)V

    return-void
.end method

.method public x(Lwe/o;Lio/sentry/v0;Ljava/lang/Object;)V
    .locals 5

    iget-object v0, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    if-nez p3, :cond_0

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    return-void

    :cond_0
    instance-of v1, p3, Ljava/lang/Character;

    if-eqz v1, :cond_1

    check-cast p3, Ljava/lang/Character;

    invoke-virtual {p3}, Ljava/lang/Character;->charValue()C

    move-result p2

    invoke-static {p2}, Ljava/lang/Character;->toString(C)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_1
    instance-of v1, p3, Ljava/lang/String;

    if-eqz v1, :cond_2

    check-cast p3, Ljava/lang/String;

    invoke-virtual {p1, p3}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_2
    instance-of v1, p3, Ljava/lang/Boolean;

    if-eqz v1, :cond_3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    invoke-virtual {p1, p2}, Lwe/o;->c0(Z)Lwe/o;

    return-void

    :cond_3
    instance-of v1, p3, Ljava/lang/Number;

    if-eqz v1, :cond_4

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p1, p3}, Lwe/o;->a0(Ljava/lang/Number;)Lwe/o;

    return-void

    :cond_4
    instance-of v1, p3, Ljava/util/Date;

    if-eqz v1, :cond_5

    check-cast p3, Ljava/util/Date;

    :try_start_0
    invoke-static {p3}, Ljc/x;->W(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception p1

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Error when serializing Date"

    invoke-interface {p2, p3, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    goto/16 :goto_9

    :cond_5
    instance-of v1, p3, Ljava/util/TimeZone;

    if-eqz v1, :cond_6

    check-cast p3, Ljava/util/TimeZone;

    :try_start_1
    invoke-virtual {p3}, Ljava/util/TimeZone;->getID()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto/16 :goto_9

    :catch_1
    move-exception p1

    sget-object p3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Error when serializing TimeZone"

    invoke-interface {p2, p3, v1, p1}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->k()V

    goto/16 :goto_9

    :cond_6
    instance-of v0, p3, Lio/sentry/h2;

    if-eqz v0, :cond_7

    check-cast p3, Lio/sentry/h2;

    invoke-interface {p3, p1, p2}, Lio/sentry/h2;->serialize(Lio/sentry/k3;Lio/sentry/v0;)V

    return-void

    :cond_7
    instance-of v0, p3, Ljava/util/Collection;

    if-eqz v0, :cond_8

    check-cast p3, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2, p3}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_8
    instance-of v0, p3, [Z

    const/4 v1, 0x0

    if-eqz v0, :cond_a

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [Z

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_0
    if-ge v1, v2, :cond_9

    aget-boolean v3, p3, v1

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_9
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_a
    instance-of v0, p3, [B

    if-eqz v0, :cond_c

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [B

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_1
    if-ge v1, v2, :cond_b

    aget-byte v3, p3, v1

    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_b
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_c
    instance-of v0, p3, [S

    if-eqz v0, :cond_e

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [S

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_2
    if-ge v1, v2, :cond_d

    aget-short v3, p3, v1

    invoke-static {v3}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_d
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_e
    instance-of v0, p3, [C

    if-eqz v0, :cond_10

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [C

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_3
    if-ge v1, v2, :cond_f

    aget-char v3, p3, v1

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_3

    :cond_f
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_10
    instance-of v0, p3, [I

    if-eqz v0, :cond_12

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [I

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_4
    if-ge v1, v2, :cond_11

    aget v3, p3, v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_11
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_12
    instance-of v0, p3, [J

    if-eqz v0, :cond_14

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [J

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_5
    if-ge v1, v2, :cond_13

    aget-wide v3, p3, v1

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_5

    :cond_13
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_14
    instance-of v0, p3, [F

    if-eqz v0, :cond_16

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [F

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_6
    if-ge v1, v2, :cond_15

    aget v3, p3, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_6

    :cond_15
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_16
    instance-of v0, p3, [D

    if-eqz v0, :cond_18

    new-instance v0, Ljava/util/ArrayList;

    check-cast p3, [D

    array-length v2, p3

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    array-length v2, p3

    :goto_7
    if-ge v1, v2, :cond_17

    aget-wide v3, p3, v1

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_7

    :cond_17
    invoke-virtual {p0, p1, p2, v0}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_18
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isArray()Z

    move-result v0

    if-eqz v0, :cond_19

    check-cast p3, [Ljava/lang/Object;

    invoke-static {p3}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_19
    instance-of v0, p3, Ljava/util/Map;

    if-eqz v0, :cond_1a

    check-cast p3, Ljava/util/Map;

    invoke-virtual {p0, p1, p2, p3}, Laj/d;->z(Lwe/o;Lio/sentry/v0;Ljava/util/Map;)V

    return-void

    :cond_1a
    instance-of v0, p3, Ljava/util/Locale;

    if-eqz v0, :cond_1b

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_1b
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    if-eqz v0, :cond_1d

    check-cast p3, Ljava/util/concurrent/atomic/AtomicIntegerArray;

    sget-object v0, Lio/sentry/util/d;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->length()I

    move-result v0

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    :goto_8
    if-ge v1, v0, :cond_1c

    invoke-virtual {p3, v1}, Ljava/util/concurrent/atomic/AtomicIntegerArray;->get(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_8

    :cond_1c
    invoke-virtual {p0, p1, p2, v2}, Laj/d;->y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V

    return-void

    :cond_1d
    instance-of v0, p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    if-eqz v0, :cond_1e

    check-cast p3, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p2

    invoke-virtual {p1, p2}, Lwe/o;->c0(Z)Lwe/o;

    return-void

    :cond_1e
    instance-of v0, p3, Ljava/net/URI;

    if-eqz v0, :cond_1f

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_1f
    instance-of v0, p3, Ljava/net/InetAddress;

    if-eqz v0, :cond_20

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_20
    instance-of v0, p3, Ljava/util/UUID;

    if-eqz v0, :cond_21

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_21
    instance-of v0, p3, Ljava/util/Currency;

    if-eqz v0, :cond_22

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_22
    instance-of v0, p3, Ljava/util/Calendar;

    if-eqz v0, :cond_23

    check-cast p3, Ljava/util/Calendar;

    invoke-static {p3}, Lio/sentry/util/d;->a(Ljava/util/Calendar;)Ljava/util/HashMap;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Laj/d;->z(Lwe/o;Lio/sentry/v0;Ljava/util/Map;)V

    return-void

    :cond_23
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->isEnum()Z

    move-result v0

    if-eqz v0, :cond_24

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    return-void

    :cond_24
    :try_start_2
    iget-object v0, p0, Laj/d;->w:Ljava/lang/Object;

    check-cast v0, Lbd3/v;

    invoke-virtual {v0, p2, p3}, Lbd3/v;->m(Lio/sentry/v0;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p0, p1, p2, p3}, Laj/d;->x(Lwe/o;Lio/sentry/v0;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p3

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v1, "Failed serializing unknown object."

    invoke-interface {p2, v0, v1, p3}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    const-string p2, "[OBJECT]"

    invoke-virtual {p1, p2}, Lwe/o;->b0(Ljava/lang/String;)Lwe/o;

    :goto_9
    return-void
.end method

.method public y(Lwe/o;Lio/sentry/v0;Ljava/util/Collection;)V
    .locals 5

    iget-object v0, p1, Lwe/o;->w:Ljava/lang/Object;

    check-cast v0, Lio/sentry/vendor/gson/stream/c;

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->x()V

    invoke-virtual {v0}, Lio/sentry/vendor/gson/stream/c;->b()V

    iget v1, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    iget-object v2, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v1, v3, :cond_0

    mul-int/2addr v1, v4

    invoke-static {v2, v1}, Ljava/util/Arrays;->copyOf([II)[I

    move-result-object v1

    iput-object v1, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    :cond_0
    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->x:[I

    iget v2, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Lio/sentry/vendor/gson/stream/c;->y:I

    const/4 v3, 0x1

    aput v3, v1, v2

    iget-object v1, v0, Lio/sentry/vendor/gson/stream/c;->w:Ljava/io/Writer;

    const/16 v2, 0x5b

    invoke-virtual {v1, v2}, Ljava/io/Writer;->write(I)V

    invoke-interface {p3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1}, Laj/d;->x(Lwe/o;Lio/sentry/v0;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    const/16 p1, 0x5d

    invoke-virtual {v0, v3, v4, p1}, Lio/sentry/vendor/gson/stream/c;->h(IIC)V

    return-void
.end method

.method public z(Lwe/o;Lio/sentry/v0;Ljava/util/Map;)V
    .locals 3

    invoke-virtual {p1}, Lwe/o;->i()Lwe/o;

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p1, v2}, Lwe/o;->K(Ljava/lang/String;)Lwe/o;

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p1, p2, v1}, Laj/d;->x(Lwe/o;Lio/sentry/v0;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lwe/o;->C()Lwe/o;

    return-void
.end method
