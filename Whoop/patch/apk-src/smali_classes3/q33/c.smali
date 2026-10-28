.class public final Lq33/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ll83/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lq33/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    const-string v1, "YuvFrame"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lq33/c;->a:Ll83/p;

    return-void
.end method

.method public static a(Lr53/e;I)Lr53/e;
    .locals 38

    move-object/from16 v0, p0

    move/from16 v1, p1

    iget v2, v0, Lr53/e;->I:I

    iget v3, v0, Lr53/e;->H:I

    const/16 v4, -0x10e

    if-eq v1, v4, :cond_2

    const/16 v4, -0xb4

    if-eq v1, v4, :cond_1

    const/16 v4, -0x5a

    if-eq v1, v4, :cond_0

    const/16 v4, 0x5a

    if-eq v1, v4, :cond_2

    const/16 v4, 0xb4

    if-eq v1, v4, :cond_1

    const/16 v4, 0x10e

    if-eq v1, v4, :cond_0

    sget-object v1, Lr53/g;->x:Lr53/g;

    goto :goto_0

    :cond_0
    sget-object v1, Lr53/g;->E:Lr53/g;

    goto :goto_0

    :cond_1
    sget-object v1, Lr53/g;->z:Lr53/g;

    goto :goto_0

    :cond_2
    sget-object v1, Lr53/g;->y:Lr53/g;

    :goto_0
    sget-object v4, Lr53/g;->y:Lr53/g;

    if-eq v1, v4, :cond_4

    sget-object v5, Lr53/g;->E:Lr53/g;

    if-ne v1, v5, :cond_3

    goto :goto_1

    :cond_3
    move v11, v3

    goto :goto_2

    :cond_4
    :goto_1
    move v11, v2

    :goto_2
    if-eq v1, v4, :cond_6

    sget-object v4, Lr53/g;->E:Lr53/g;

    if-ne v1, v4, :cond_5

    goto :goto_3

    :cond_5
    move v12, v2

    goto :goto_4

    :cond_6
    :goto_3
    move v12, v3

    :goto_4
    new-instance v13, Landroid/graphics/Rect;

    const/4 v2, 0x0

    invoke-direct {v13, v2, v2, v11, v12}, Landroid/graphics/Rect;-><init>(IIII)V

    add-int/lit8 v3, v11, 0x1

    const/4 v4, 0x1

    shr-int/2addr v3, v4

    add-int/lit8 v5, v12, 0x1

    shr-int/2addr v5, v4

    mul-int v6, v11, v12

    mul-int/2addr v5, v3

    new-instance v7, Lr53/d;

    invoke-direct {v7, v6}, Lr53/d;-><init>(I)V

    new-instance v6, Lr53/d;

    invoke-direct {v6, v5}, Lr53/d;-><init>(I)V

    new-instance v8, Lr53/d;

    invoke-direct {v8, v5}, Lr53/d;-><init>(I)V

    filled-new-array {v7, v6, v8}, [Lr53/d;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ldp/d;->v(Ljava/util/List;)[Ljava/nio/ByteBuffer;

    move-result-object v5

    aget-object v6, v5, v2

    aget-object v7, v5, v4

    const/4 v15, 0x2

    aget-object v8, v5, v15

    const/4 v9, 0x3

    aget-object v5, v5, v9

    new-instance v10, Lr53/e;

    new-instance v14, Lr53/f;

    invoke-direct {v14, v11, v6}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    move v6, v9

    new-instance v9, Lr53/f;

    invoke-direct {v9, v3, v7}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    move v7, v6

    move-object v6, v10

    new-instance v10, Lr53/f;

    invoke-direct {v10, v3, v8}, Lr53/f;-><init>(ILjava/nio/ByteBuffer;)V

    move-object v8, v14

    new-instance v14, Lr53/a;

    const/4 v3, 0x1

    invoke-direct {v14, v5, v3}, Lr53/a;-><init>(Ljava/nio/ByteBuffer;I)V

    move v3, v7

    move-object v7, v5

    invoke-direct/range {v6 .. v14}, Lr53/e;-><init>(Ljava/nio/ByteBuffer;Lr53/f;Lr53/f;Lr53/f;IILandroid/graphics/Rect;Lr53/a;)V

    iget-object v5, v0, Lr53/c;->y:Landroid/graphics/Rect;

    sget-object v16, Lio/github/crow_misia/libyuv/Yuv;->INSTANCE:Lio/github/crow_misia/libyuv/Yuv;

    iget-object v7, v0, Lr53/e;->E:Lr53/f;

    iget-object v8, v7, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v7, v7, Lr53/f;->a:I

    invoke-static {v0, v2}, Lds/p;->N(Lr53/c;I)I

    move-result v19

    iget-object v9, v0, Lr53/e;->F:Lr53/f;

    iget-object v10, v9, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v9, v9, Lr53/f;->a:I

    invoke-static {v0, v4}, Lds/p;->N(Lr53/c;I)I

    move-result v22

    iget-object v11, v0, Lr53/e;->G:Lr53/f;

    iget-object v12, v11, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v11, v11, Lr53/f;->a:I

    invoke-static {v0, v15}, Lds/p;->N(Lr53/c;I)I

    move-result v25

    iget-object v0, v6, Lr53/e;->E:Lr53/f;

    iget-object v14, v0, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v0, v0, Lr53/f;->a:I

    invoke-static {v6, v2}, Lds/p;->N(Lr53/c;I)I

    move-result v28

    iget-object v2, v6, Lr53/e;->F:Lr53/f;

    iget-object v3, v2, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v2, v2, Lr53/f;->a:I

    invoke-static {v6, v4}, Lds/p;->N(Lr53/c;I)I

    move-result v31

    iget-object v4, v6, Lr53/e;->G:Lr53/f;

    move/from16 v27, v0

    iget-object v0, v4, Lr53/f;->b:Ljava/nio/ByteBuffer;

    iget v4, v4, Lr53/f;->a:I

    invoke-static {v6, v15}, Lds/p;->N(Lr53/c;I)I

    move-result v34

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    move-object/from16 v32, v0

    if-eqz v15, :cond_9

    const/4 v0, 0x1

    if-eq v15, v0, :cond_8

    const/4 v0, 0x2

    if-eq v15, v0, :cond_9

    const/4 v0, 0x3

    if-ne v15, v0, :cond_7

    goto :goto_5

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_8
    :goto_5
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v15

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_6
    move/from16 v35, v0

    goto :goto_7

    :cond_9
    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v0

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v15

    invoke-static {v0, v15}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_6

    :goto_7
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_c

    const/4 v15, 0x1

    if-eq v0, v15, :cond_b

    const/4 v15, 0x2

    if-eq v0, v15, :cond_c

    const/4 v15, 0x3

    if-ne v0, v15, :cond_a

    goto :goto_8

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    :goto_8
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {v13}, Landroid/graphics/Rect;->width()I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    :goto_9
    move/from16 v36, v0

    goto :goto_a

    :cond_c
    invoke-virtual {v5}, Landroid/graphics/Rect;->height()I

    move-result v0

    invoke-virtual {v13}, Landroid/graphics/Rect;->height()I

    move-result v5

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_9

    :goto_a
    iget v0, v1, Lr53/g;->w:I

    move/from16 v37, v0

    move/from16 v30, v2

    move-object/from16 v29, v3

    move/from16 v33, v4

    move/from16 v18, v7

    move-object/from16 v17, v8

    move/from16 v21, v9

    move-object/from16 v20, v10

    move/from16 v24, v11

    move-object/from16 v23, v12

    move-object/from16 v26, v14

    invoke-virtual/range {v16 .. v37}, Lio/github/crow_misia/libyuv/Yuv;->rotateI420Rotate(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IILjava/nio/ByteBuffer;IIIII)V

    return-object v6
.end method
