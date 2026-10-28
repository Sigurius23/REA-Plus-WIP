.class public final Lho/a;
.super Lxn/d;
.source "SourceFile"


# instance fields
.field public final synthetic m:I

.field public final n:Ljava/lang/Object;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lho/a;->m:I

    .line 7
    invoke-direct {p0}, Lxn/d;-><init>()V

    .line 8
    new-instance v0, Led3/a;

    invoke-direct {v0}, Led3/a;-><init>()V

    iput-object v0, p0, Lho/a;->n:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x1

    iput v0, p0, Lho/a;->m:I

    .line 1
    invoke-direct {p0}, Lxn/d;-><init>()V

    const/4 v0, 0x0

    .line 2
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [B

    .line 3
    array-length v1, p1

    .line 4
    aget-byte v0, p1, v0

    and-int/lit16 v0, v0, 0xff

    shl-int/lit8 v0, v0, 0x8

    const/4 v1, 0x1

    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    or-int/2addr v0, v1

    const/4 v1, 0x2

    .line 5
    aget-byte v1, p1, v1

    and-int/lit16 v1, v1, 0xff

    shl-int/lit8 v1, v1, 0x8

    const/4 v2, 0x3

    aget-byte p1, p1, v2

    and-int/lit16 p1, p1, 0xff

    or-int/2addr p1, v1

    .line 6
    new-instance v1, Lzn/f;

    invoke-direct {v1, v0, p1}, Lzn/f;-><init>(II)V

    iput-object v1, p0, Lho/a;->n:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final f(IZ[B)Lxn/e;
    .locals 46

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p3

    iget v3, v0, Lho/a;->m:I

    const/16 v4, 0x8

    iget-object v5, v0, Lho/a;->n:Ljava/lang/Object;

    const/4 v6, 0x0

    packed-switch v3, :pswitch_data_0

    check-cast v5, Lzn/f;

    if-eqz p2, :cond_0

    iget-object v3, v5, Lzn/f;->f:Lsa/h;

    iget-object v7, v3, Lsa/h;->c:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    iget-object v7, v3, Lsa/h;->d:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    iget-object v7, v3, Lsa/h;->e:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    iget-object v7, v3, Lsa/h;->f:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    iget-object v7, v3, Lsa/h;->g:Landroid/util/SparseArray;

    invoke-virtual {v7}, Landroid/util/SparseArray;->clear()V

    iput-object v6, v3, Lsa/h;->h:Ljava/lang/Object;

    iput-object v6, v3, Lsa/h;->i:Ljava/lang/Object;

    :cond_0
    new-instance v3, Lab/g;

    iget-object v12, v5, Lzn/f;->b:Landroid/graphics/Paint;

    iget-object v7, v5, Lzn/f;->c:Landroid/graphics/Canvas;

    iget-object v8, v5, Lzn/f;->f:Lsa/h;

    new-instance v9, Llo/s;

    const/4 v10, 0x0

    invoke-direct {v9, v2, v1, v10, v10}, Llo/s;-><init>([BIIB)V

    :goto_0
    invoke-virtual {v9}, Llo/s;->b()I

    move-result v1

    const/16 v2, 0x30

    const/4 v11, 0x3

    if-lt v1, v2, :cond_c

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v1

    const/16 v2, 0xf

    if-ne v1, v2, :cond_c

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v1

    const/16 v2, 0x10

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v15

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v10

    invoke-virtual {v9}, Llo/s;->f()I

    move-result v16

    add-int v16, v16, v10

    mul-int/lit8 v6, v10, 0x8

    invoke-virtual {v9}, Llo/s;->b()I

    move-result v14

    if-le v6, v14, :cond_1

    const-string v1, "DvbParser"

    const-string v2, "Data field length exceeds limit"

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    invoke-virtual {v9}, Llo/s;->b()I

    move-result v1

    invoke-virtual {v9, v1}, Llo/s;->t(I)V

    goto/16 :goto_8

    :cond_1
    const/4 v6, 0x4

    packed-switch v1, :pswitch_data_1

    goto/16 :goto_7

    :pswitch_0
    iget v1, v8, Lsa/h;->a:I

    if-ne v15, v1, :cond_b

    invoke-virtual {v9, v6}, Llo/s;->t(I)V

    invoke-virtual {v9}, Llo/s;->h()Z

    move-result v1

    invoke-virtual {v9, v11}, Llo/s;->t(I)V

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v21

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v22

    if-eqz v1, :cond_2

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v1

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v6

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v10

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v2

    move/from16 v23, v1

    move/from16 v26, v2

    move/from16 v24, v6

    move/from16 v25, v10

    goto :goto_1

    :cond_2
    move/from16 v24, v21

    move/from16 v26, v22

    const/16 v23, 0x0

    const/16 v25, 0x0

    :goto_1
    new-instance v20, Lsa/b;

    invoke-direct/range {v20 .. v26}, Lsa/b;-><init>(IIIIII)V

    move-object/from16 v1, v20

    iput-object v1, v8, Lsa/h;->h:Ljava/lang/Object;

    goto/16 :goto_7

    :pswitch_1
    iget v1, v8, Lsa/h;->a:I

    if-ne v15, v1, :cond_3

    invoke-static {v9}, Lzn/f;->g(Llo/s;)Lzn/b;

    move-result-object v1

    iget-object v2, v8, Lsa/h;->e:Landroid/util/SparseArray;

    iget v6, v1, Lzn/b;->a:I

    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    :cond_3
    iget v1, v8, Lsa/h;->b:I

    if-ne v15, v1, :cond_b

    invoke-static {v9}, Lzn/f;->g(Llo/s;)Lzn/b;

    move-result-object v1

    iget-object v2, v8, Lsa/h;->g:Landroid/util/SparseArray;

    iget v6, v1, Lzn/b;->a:I

    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_2
    iget v1, v8, Lsa/h;->a:I

    if-ne v15, v1, :cond_4

    invoke-static {v9, v10}, Lzn/f;->f(Llo/s;I)Lzn/a;

    move-result-object v1

    iget-object v2, v8, Lsa/h;->d:Landroid/util/SparseArray;

    iget v6, v1, Lzn/a;->a:I

    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    :cond_4
    iget v1, v8, Lsa/h;->b:I

    if-ne v15, v1, :cond_b

    invoke-static {v9, v10}, Lzn/f;->f(Llo/s;I)Lzn/a;

    move-result-object v1

    iget-object v2, v8, Lsa/h;->f:Landroid/util/SparseArray;

    iget v6, v1, Lzn/a;->a:I

    invoke-virtual {v2, v6, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_3
    iget-object v1, v8, Lsa/h;->i:Ljava/lang/Object;

    check-cast v1, Lsa/d;

    iget-object v14, v8, Lsa/h;->c:Landroid/util/SparseArray;

    iget v13, v8, Lsa/h;->a:I

    if-ne v15, v13, :cond_b

    if-eqz v1, :cond_b

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v21

    invoke-virtual {v9, v6}, Llo/s;->t(I)V

    invoke-virtual {v9}, Llo/s;->h()Z

    move-result v22

    invoke-virtual {v9, v11}, Llo/s;->t(I)V

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v23

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v24

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    move-result v25

    const/4 v11, 0x2

    invoke-virtual {v9, v11}, Llo/s;->t(I)V

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v26

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v27

    invoke-virtual {v9, v6}, Llo/s;->i(I)I

    move-result v28

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    move-result v29

    invoke-virtual {v9, v11}, Llo/s;->t(I)V

    add-int/lit8 v10, v10, -0xa

    new-instance v13, Landroid/util/SparseArray;

    invoke-direct {v13}, Landroid/util/SparseArray;-><init>()V

    :goto_2
    if-lez v10, :cond_7

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v15

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    move-result v2

    invoke-virtual {v9, v11}, Llo/s;->i(I)I

    const/16 v4, 0xc

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v11

    invoke-virtual {v9, v6}, Llo/s;->t(I)V

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v4

    add-int/lit8 v19, v10, -0x6

    const/4 v6, 0x1

    if-eq v2, v6, :cond_5

    const/4 v6, 0x2

    if-ne v2, v6, :cond_6

    :cond_5
    const/16 v2, 0x8

    goto :goto_3

    :cond_6
    move/from16 v10, v19

    goto :goto_4

    :goto_3
    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    add-int/lit8 v10, v10, -0x8

    :goto_4
    new-instance v2, Lzn/e;

    invoke-direct {v2, v11, v4}, Lzn/e;-><init>(II)V

    invoke-virtual {v13, v15, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v2, 0x10

    const/16 v4, 0x8

    const/4 v6, 0x4

    const/4 v11, 0x2

    goto :goto_2

    :cond_7
    new-instance v20, Lzn/d;

    move-object/from16 v30, v13

    invoke-direct/range {v20 .. v30}, Lzn/d;-><init>(IZIIIIIIILandroid/util/SparseArray;)V

    move-object/from16 v4, v20

    move/from16 v2, v21

    iget v1, v1, Lsa/d;->b:I

    if-nez v1, :cond_8

    invoke-virtual {v14, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzn/d;

    if-eqz v1, :cond_8

    iget-object v1, v1, Lzn/d;->j:Landroid/util/SparseArray;

    const/4 v2, 0x0

    :goto_5
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v6

    if-ge v2, v6, :cond_8

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v6

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lzn/e;

    iget-object v11, v4, Lzn/d;->j:Landroid/util/SparseArray;

    invoke-virtual {v11, v6, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_5

    :cond_8
    iget v1, v4, Lzn/d;->a:I

    invoke-virtual {v14, v1, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    goto :goto_7

    :pswitch_4
    iget v1, v8, Lsa/h;->a:I

    if-ne v15, v1, :cond_b

    iget-object v1, v8, Lsa/h;->i:Ljava/lang/Object;

    check-cast v1, Lsa/d;

    const/16 v2, 0x8

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    const/4 v4, 0x4

    invoke-virtual {v9, v4}, Llo/s;->i(I)I

    move-result v4

    const/4 v6, 0x2

    invoke-virtual {v9, v6}, Llo/s;->i(I)I

    move-result v11

    invoke-virtual {v9, v6}, Llo/s;->t(I)V

    add-int/lit8 v10, v10, -0x2

    new-instance v6, Landroid/util/SparseArray;

    invoke-direct {v6}, Landroid/util/SparseArray;-><init>()V

    :goto_6
    if-lez v10, :cond_9

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v13

    invoke-virtual {v9, v2}, Llo/s;->t(I)V

    const/16 v2, 0x10

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v14

    invoke-virtual {v9, v2}, Llo/s;->i(I)I

    move-result v15

    add-int/lit8 v10, v10, -0x6

    new-instance v2, Lzn/c;

    invoke-direct {v2, v14, v15}, Lzn/c;-><init>(II)V

    invoke-virtual {v6, v13, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    const/16 v2, 0x8

    goto :goto_6

    :cond_9
    new-instance v2, Lsa/d;

    invoke-direct {v2, v4, v11, v6}, Lsa/d;-><init>(IILandroid/util/SparseArray;)V

    if-eqz v11, :cond_a

    iput-object v2, v8, Lsa/h;->i:Ljava/lang/Object;

    iget-object v1, v8, Lsa/h;->c:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    iget-object v1, v8, Lsa/h;->d:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    iget-object v1, v8, Lsa/h;->e:Landroid/util/SparseArray;

    invoke-virtual {v1}, Landroid/util/SparseArray;->clear()V

    goto :goto_7

    :cond_a
    if-eqz v1, :cond_b

    iget v1, v1, Lsa/d;->a:I

    if-eq v1, v4, :cond_b

    iput-object v2, v8, Lsa/h;->i:Ljava/lang/Object;

    :cond_b
    :goto_7
    invoke-virtual {v9}, Llo/s;->f()I

    move-result v1

    sub-int v1, v16, v1

    invoke-virtual {v9, v1}, Llo/s;->u(I)V

    :goto_8
    const/16 v4, 0x8

    const/4 v6, 0x0

    const/4 v10, 0x0

    goto/16 :goto_0

    :cond_c
    iget-object v1, v8, Lsa/h;->i:Ljava/lang/Object;

    check-cast v1, Lsa/d;

    if-nez v1, :cond_d

    sget-object v1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    move-object/from16 v26, v3

    goto/16 :goto_14

    :cond_d
    iget-object v2, v8, Lsa/h;->h:Ljava/lang/Object;

    check-cast v2, Lsa/b;

    if-eqz v2, :cond_e

    goto :goto_9

    :cond_e
    iget-object v2, v5, Lzn/f;->d:Lsa/b;

    :goto_9
    iget-object v4, v5, Lzn/f;->g:Landroid/graphics/Bitmap;

    if-eqz v4, :cond_f

    iget v6, v2, Lsa/b;->a:I

    const/4 v9, 0x1

    add-int/2addr v6, v9

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    if-ne v6, v4, :cond_10

    iget v4, v2, Lsa/b;->b:I

    add-int/2addr v4, v9

    iget-object v6, v5, Lzn/f;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v6

    if-eq v4, v6, :cond_11

    goto :goto_a

    :cond_f
    const/4 v9, 0x1

    :cond_10
    :goto_a
    iget v4, v2, Lsa/b;->a:I

    add-int/2addr v4, v9

    iget v6, v2, Lsa/b;->b:I

    add-int/2addr v6, v9

    sget-object v10, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v4, v6, v10}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, v5, Lzn/f;->g:Landroid/graphics/Bitmap;

    invoke-virtual {v7, v4}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V

    :cond_11
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, v1, Lsa/d;->c:Landroid/util/SparseArray;

    const/4 v6, 0x0

    :goto_b
    invoke-virtual {v1}, Landroid/util/SparseArray;->size()I

    move-result v10

    if-ge v6, v10, :cond_1c

    invoke-virtual {v7}, Landroid/graphics/Canvas;->save()I

    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lzn/c;

    invoke-virtual {v1, v6}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v13

    iget-object v14, v8, Lsa/h;->c:Landroid/util/SparseArray;

    invoke-virtual {v14, v13}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lzn/d;

    iget v14, v10, Lzn/c;->a:I

    iget v15, v2, Lsa/b;->c:I

    add-int/2addr v14, v15

    iget v10, v10, Lzn/c;->b:I

    iget v15, v2, Lsa/b;->e:I

    add-int/2addr v10, v15

    iget v15, v13, Lzn/d;->c:I

    iget v9, v13, Lzn/d;->f:I

    iget v11, v13, Lzn/d;->d:I

    add-int v0, v14, v15

    move-object/from16 v21, v1

    iget v1, v2, Lsa/b;->d:I

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    move/from16 v22, v6

    add-int v6, v10, v11

    move/from16 v23, v11

    iget v11, v2, Lsa/b;->f:I

    invoke-static {v6, v11}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-virtual {v7, v14, v10, v1, v11}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    iget-object v1, v8, Lsa/h;->d:Landroid/util/SparseArray;

    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzn/a;

    if-nez v1, :cond_12

    iget-object v1, v8, Lsa/h;->f:Landroid/util/SparseArray;

    invoke-virtual {v1, v9}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzn/a;

    if-nez v1, :cond_12

    iget-object v1, v5, Lzn/f;->e:Lzn/a;

    :cond_12
    iget-object v9, v13, Lzn/d;->j:Landroid/util/SparseArray;

    move-object/from16 v19, v7

    const/4 v11, 0x0

    :goto_c
    invoke-virtual {v9}, Landroid/util/SparseArray;->size()I

    move-result v7

    if-ge v11, v7, :cond_18

    invoke-virtual {v9, v11}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v7

    invoke-virtual {v9, v11}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v16

    move-object/from16 v24, v9

    move-object/from16 v9, v16

    check-cast v9, Lzn/e;

    move/from16 v25, v11

    iget-object v11, v8, Lsa/h;->e:Landroid/util/SparseArray;

    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lzn/b;

    if-nez v11, :cond_13

    iget-object v11, v8, Lsa/h;->g:Landroid/util/SparseArray;

    invoke-virtual {v11, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v11, v7

    check-cast v11, Lzn/b;

    :cond_13
    if-eqz v11, :cond_17

    iget-boolean v7, v11, Lzn/b;->b:Z

    if-eqz v7, :cond_14

    const/16 v18, 0x0

    :goto_d
    move v7, v15

    goto :goto_e

    :cond_14
    iget-object v7, v5, Lzn/f;->a:Landroid/graphics/Paint;

    move-object/from16 v18, v7

    goto :goto_d

    :goto_e
    iget v15, v13, Lzn/d;->e:I

    move/from16 v16, v7

    iget v7, v9, Lzn/e;->a:I

    add-int/2addr v7, v14

    iget v9, v9, Lzn/e;->b:I

    add-int v17, v10, v9

    const/4 v9, 0x3

    if-ne v15, v9, :cond_15

    iget-object v9, v1, Lzn/a;->d:[I

    :goto_f
    move-object/from16 v26, v13

    goto :goto_10

    :cond_15
    const/4 v9, 0x2

    if-ne v15, v9, :cond_16

    iget-object v9, v1, Lzn/a;->c:[I

    goto :goto_f

    :cond_16
    iget-object v9, v1, Lzn/a;->b:[I

    goto :goto_f

    :goto_10
    iget-object v13, v11, Lzn/b;->c:[B

    move-object/from16 p1, v26

    move-object/from16 v26, v3

    move/from16 v3, v16

    move/from16 v16, v7

    move-object/from16 v7, p1

    move/from16 p1, v14

    move-object v14, v9

    move/from16 v9, p1

    move-object/from16 p1, v4

    const/4 v4, 0x2

    const/16 v27, 0x1

    invoke-static/range {v13 .. v19}, Lzn/f;->e([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    iget-object v13, v11, Lzn/b;->d:[B

    add-int/lit8 v17, v17, 0x1

    invoke-static/range {v13 .. v19}, Lzn/f;->e([B[IIIILandroid/graphics/Paint;Landroid/graphics/Canvas;)V

    goto :goto_11

    :cond_17
    move-object/from16 v26, v3

    move-object/from16 p1, v4

    move-object v7, v13

    move v9, v14

    move v3, v15

    const/4 v4, 0x2

    const/16 v27, 0x1

    :goto_11
    add-int/lit8 v11, v25, 0x1

    move-object/from16 v4, p1

    move v15, v3

    move-object v13, v7

    move v14, v9

    move-object/from16 v9, v24

    move-object/from16 v3, v26

    goto/16 :goto_c

    :cond_18
    move-object/from16 v26, v3

    move-object/from16 p1, v4

    move-object v7, v13

    move v9, v14

    move v3, v15

    const/4 v4, 0x2

    const/16 v27, 0x1

    iget-boolean v11, v7, Lzn/d;->b:Z

    if-eqz v11, :cond_1b

    iget v11, v7, Lzn/d;->e:I

    const/4 v13, 0x3

    if-ne v11, v13, :cond_19

    iget-object v1, v1, Lzn/a;->d:[I

    iget v7, v7, Lzn/d;->g:I

    aget v1, v1, v7

    goto :goto_12

    :cond_19
    if-ne v11, v4, :cond_1a

    iget-object v1, v1, Lzn/a;->c:[I

    iget v7, v7, Lzn/d;->h:I

    aget v1, v1, v7

    goto :goto_12

    :cond_1a
    iget-object v1, v1, Lzn/a;->b:[I

    iget v7, v7, Lzn/d;->i:I

    aget v1, v1, v7

    :goto_12
    invoke-virtual {v12, v1}, Landroid/graphics/Paint;->setColor(I)V

    move-object v1, v8

    int-to-float v8, v9

    move v14, v9

    int-to-float v9, v10

    int-to-float v0, v0

    int-to-float v11, v6

    move v6, v10

    move v10, v0

    move v0, v6

    move/from16 v20, v13

    move-object/from16 v7, v19

    move/from16 v6, v23

    const/4 v13, 0x0

    invoke-virtual/range {v7 .. v12}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_13

    :cond_1b
    move-object v1, v8

    move v14, v9

    move v0, v10

    move-object/from16 v7, v19

    move/from16 v6, v23

    const/4 v13, 0x0

    const/16 v20, 0x3

    :goto_13
    iget-object v8, v5, Lzn/f;->g:Landroid/graphics/Bitmap;

    invoke-static {v8, v14, v0, v3, v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object v32

    int-to-float v8, v14

    iget v9, v2, Lsa/b;->a:I

    int-to-float v9, v9

    div-float v36, v8, v9

    int-to-float v0, v0

    iget v8, v2, Lsa/b;->b:I

    int-to-float v8, v8

    div-float v33, v0, v8

    int-to-float v0, v3

    div-float v40, v0, v9

    int-to-float v0, v6

    div-float v41, v0, v8

    new-instance v28, Lxn/b;

    const/16 v29, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    const/high16 v38, -0x80000000

    const v39, -0x800001

    const/16 v42, 0x0

    const/high16 v43, -0x1000000

    const/16 v45, 0x0

    move-object/from16 v30, v29

    move-object/from16 v31, v29

    move/from16 v44, v38

    invoke-direct/range {v28 .. v45}, Lxn/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    move-object/from16 v0, p1

    move-object/from16 v3, v28

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v3, Landroid/graphics/PorterDuff$Mode;->CLEAR:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {v7, v13, v3}, Landroid/graphics/Canvas;->drawColor(ILandroid/graphics/PorterDuff$Mode;)V

    invoke-virtual {v7}, Landroid/graphics/Canvas;->restore()V

    add-int/lit8 v6, v22, 0x1

    move-object v4, v0

    move-object v8, v1

    move/from16 v11, v20

    move-object/from16 v1, v21

    move-object/from16 v3, v26

    move/from16 v9, v27

    move-object/from16 v0, p0

    goto/16 :goto_b

    :cond_1c
    move-object/from16 v26, v3

    move-object v0, v4

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v1

    :goto_14
    const/4 v0, 0x6

    move-object/from16 v2, v26

    invoke-direct {v2, v1, v0}, Lab/g;-><init>(Ljava/util/List;I)V

    return-object v2

    :pswitch_5
    check-cast v5, Led3/a;

    invoke-virtual {v5, v1, v2}, Led3/a;->I(I[B)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :goto_15
    invoke-virtual {v5}, Led3/a;->a()I

    move-result v1

    if-lez v1, :cond_25

    invoke-virtual {v5}, Led3/a;->a()I

    move-result v1

    const/16 v2, 0x8

    if-lt v1, v2, :cond_24

    invoke-virtual {v5}, Led3/a;->i()I

    move-result v1

    invoke-virtual {v5}, Led3/a;->i()I

    move-result v3

    const v4, 0x76747463

    if-ne v3, v4, :cond_23

    add-int/lit8 v1, v1, -0x8

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_16
    if-lez v1, :cond_20

    if-lt v1, v2, :cond_1f

    invoke-virtual {v5}, Led3/a;->i()I

    move-result v6

    invoke-virtual {v5}, Led3/a;->i()I

    move-result v7

    add-int/lit8 v1, v1, -0x8

    sub-int/2addr v6, v2

    iget-object v8, v5, Led3/a;->a:[B

    iget v9, v5, Led3/a;->b:I

    sget v10, Llo/y;->a:I

    new-instance v10, Ljava/lang/String;

    sget-object v11, Lyr/d;->c:Ljava/nio/charset/Charset;

    invoke-direct {v10, v8, v9, v6, v11}, Ljava/lang/String;-><init>([BIILjava/nio/charset/Charset;)V

    invoke-virtual {v5, v6}, Led3/a;->L(I)V

    sub-int/2addr v1, v6

    const v6, 0x73747467

    if-ne v7, v6, :cond_1e

    new-instance v4, Lho/h;

    invoke-direct {v4}, Lho/h;-><init>()V

    invoke-static {v10, v4}, Lho/i;->e(Ljava/lang/String;Lho/h;)V

    invoke-virtual {v4}, Lho/h;->b()Lxn/a;

    move-result-object v4

    :cond_1d
    const/4 v7, 0x0

    goto :goto_16

    :cond_1e
    const v6, 0x7061796c

    if-ne v7, v6, :cond_1d

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v7, 0x0

    invoke-static {v7, v3, v6}, Lho/i;->f(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Landroid/text/SpannedString;

    move-result-object v3

    goto :goto_16

    :cond_1f
    new-instance v0, Lcom/google/android/exoplayer2/text/SubtitleDecoderException;

    const-string v1, "Incomplete vtt cue box header found."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    const/4 v7, 0x0

    if-nez v3, :cond_21

    const-string v3, ""

    :cond_21
    if-eqz v4, :cond_22

    iput-object v3, v4, Lxn/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {v4}, Lxn/a;->a()Lxn/b;

    move-result-object v1

    goto :goto_17

    :cond_22
    sget-object v1, Lho/i;->a:Ljava/util/regex/Pattern;

    new-instance v1, Lho/h;

    invoke-direct {v1}, Lho/h;-><init>()V

    iput-object v3, v1, Lho/h;->c:Ljava/lang/CharSequence;

    invoke-virtual {v1}, Lho/h;->b()Lxn/a;

    move-result-object v1

    invoke-virtual {v1}, Lxn/a;->a()Lxn/b;

    move-result-object v1

    :goto_17
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_15

    :cond_23
    const/4 v7, 0x0

    add-int/lit8 v1, v1, -0x8

    invoke-virtual {v5, v1}, Led3/a;->L(I)V

    goto/16 :goto_15

    :cond_24
    new-instance v0, Lcom/google/android/exoplayer2/text/SubtitleDecoderException;

    const-string v1, "Incomplete Mp4Webvtt Top Level box header found."

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v1, Lab/g;

    invoke-direct {v1, v0}, Lab/g;-><init>(Ljava/util/ArrayList;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x10
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
