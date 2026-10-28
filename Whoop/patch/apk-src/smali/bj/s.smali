.class public abstract Lbj/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;

.field public static final c:Lwe/o;

.field public static final d:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    const-string v9, "chars"

    const-string v10, "markers"

    const-string v0, "w"

    const-string v1, "h"

    const-string v2, "ip"

    const-string v3, "op"

    const-string v4, "fr"

    const-string v5, "v"

    const-string v6, "layers"

    const-string v7, "assets"

    const-string v8, "fonts"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/s;->a:Lwe/o;

    const-string v5, "p"

    const-string v6, "u"

    const-string v1, "id"

    const-string v2, "layers"

    const-string v3, "w"

    const-string v4, "h"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/s;->b:Lwe/o;

    const-string v0, "list"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/s;->c:Lwe/o;

    const-string v0, "tm"

    const-string v1, "dr"

    const-string v2, "cm"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/s;->d:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;)Lqi/i;
    .locals 30

    move-object/from16 v0, p0

    invoke-static {}, Ldj/i;->c()F

    move-result v1

    new-instance v2, La0/y;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, La0/y;-><init>(Ljava/lang/Object;)V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    new-instance v6, Ljava/util/HashMap;

    invoke-direct {v6}, Ljava/util/HashMap;-><init>()V

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, La0/g1;

    invoke-direct {v9, v3}, La0/g1;-><init>(Ljava/lang/Object;)V

    new-instance v10, Lqi/i;

    invoke-direct {v10}, Lqi/i;-><init>()V

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    :goto_0
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_1b

    const/16 v17, 0x0

    sget-object v12, Lbj/s;->a:Lwe/o;

    invoke-virtual {v0, v12}, Lcj/d;->m(Lwe/o;)I

    move-result v12

    packed-switch v12, :pswitch_data_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    :goto_1
    move-object v8, v7

    goto/16 :goto_12

    :pswitch_0
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_2
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_4

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v12, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_3
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_3

    sget-object v3, Lbj/s;->d:Lwe/o;

    invoke-virtual {v0, v3}, Lcj/d;->m(Lwe/o;)I

    move-result v3

    if-eqz v3, :cond_2

    move/from16 v23, v1

    const/4 v1, 0x1

    if-eq v3, v1, :cond_1

    const/4 v1, 0x2

    if-eq v3, v1, :cond_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    :goto_4
    move/from16 v1, v23

    goto :goto_3

    :cond_0
    move v1, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v14

    double-to-float v14, v14

    move v15, v3

    move/from16 v21, v14

    :goto_5
    move v14, v1

    goto :goto_4

    :cond_1
    move v1, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v14

    double-to-float v14, v14

    move v15, v3

    move/from16 v20, v14

    goto :goto_5

    :cond_2
    move/from16 v23, v1

    move v1, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v12

    goto :goto_4

    :cond_3
    move/from16 v23, v1

    move v1, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->endObject()V

    new-instance v14, Lwi/h;

    move/from16 v15, v20

    move/from16 v20, v1

    move/from16 v1, v21

    invoke-direct {v14, v12, v15, v1}, Lwi/h;-><init>(Ljava/lang/String;FF)V

    invoke-virtual {v8, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v15, v3

    move/from16 v14, v20

    move/from16 v1, v23

    goto :goto_2

    :cond_4
    move/from16 v23, v1

    move/from16 v20, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->endArray()V

    :goto_6
    move-object/from16 v21, v8

    goto :goto_1

    :pswitch_1
    move/from16 v23, v1

    move/from16 v20, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_7
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-static {v0, v10}, Lbj/j;->a(Lcj/d;Lqi/i;)Lwi/d;

    move-result-object v1

    invoke-virtual {v1}, Lwi/d;->hashCode()I

    move-result v12

    invoke-virtual {v9, v12, v1}, La0/g1;->f(ILjava/lang/Object;)V

    goto :goto_7

    :cond_5
    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_6

    :pswitch_2
    move/from16 v23, v1

    move/from16 v20, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    :goto_8
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lbj/s;->c:Lwe/o;

    invoke-virtual {v0, v1}, Lcj/d;->m(Lwe/o;)I

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_8

    :cond_6
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_9
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-static {v0}, Lbj/k;->a(Lcj/d;)Lwi/c;

    move-result-object v1

    invoke-virtual {v1}, Lwi/c;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v7, v12, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_9

    :cond_7
    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_8

    :cond_8
    invoke-virtual {v0}, Lcj/d;->endObject()V

    goto :goto_6

    :pswitch_3
    move/from16 v23, v1

    move/from16 v20, v14

    move v3, v15

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_a
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v12, La0/y;

    const/4 v14, 0x0

    invoke-direct {v12, v14}, La0/y;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    move-object/from16 v27, v14

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move/from16 v25, v17

    move/from16 v26, v25

    :goto_b
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_10

    sget-object v15, Lbj/s;->b:Lwe/o;

    invoke-virtual {v0, v15}, Lcj/d;->m(Lwe/o;)I

    move-result v15

    if-eqz v15, :cond_f

    const/4 v14, 0x1

    if-eq v15, v14, :cond_d

    const/4 v14, 0x2

    if-eq v15, v14, :cond_c

    const/4 v14, 0x3

    if-eq v15, v14, :cond_b

    const/4 v14, 0x4

    if-eq v15, v14, :cond_a

    const/4 v14, 0x5

    if-eq v15, v14, :cond_9

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    move-object v15, v7

    move-object/from16 v21, v8

    goto :goto_e

    :cond_9
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v29

    :goto_c
    const/4 v14, 0x0

    goto :goto_b

    :cond_a
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v28

    goto :goto_c

    :cond_b
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v26

    goto :goto_c

    :cond_c
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v25

    goto :goto_c

    :cond_d
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_d
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_e

    invoke-static {v0, v10}, Lbj/r;->a(Lcj/d;Lqi/i;)Lzi/e;

    move-result-object v14

    move-object v15, v7

    move-object/from16 v21, v8

    iget-wide v7, v14, Lzi/e;->d:J

    invoke-virtual {v12, v7, v8, v14}, La0/y;->g(JLjava/lang/Object;)V

    invoke-virtual {v1, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v7, v15

    move-object/from16 v8, v21

    goto :goto_d

    :cond_e
    move-object v15, v7

    move-object/from16 v21, v8

    invoke-virtual {v0}, Lcj/d;->endArray()V

    :goto_e
    move-object v7, v15

    move-object/from16 v8, v21

    goto :goto_c

    :cond_f
    move-object v15, v7

    move-object/from16 v21, v8

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v27

    goto :goto_c

    :cond_10
    move-object v15, v7

    move-object/from16 v21, v8

    invoke-virtual {v0}, Lcj/d;->endObject()V

    if-eqz v28, :cond_11

    new-instance v24, Lqi/y;

    invoke-direct/range {v24 .. v29}, Lqi/y;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v24

    invoke-virtual {v1}, Lqi/y;->d()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_f

    :cond_11
    move-object/from16 v14, v27

    invoke-virtual {v5, v14, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_f
    move-object v7, v15

    move-object/from16 v8, v21

    goto/16 :goto_a

    :cond_12
    move-object v15, v7

    move-object/from16 v21, v8

    invoke-virtual {v0}, Lcj/d;->endArray()V

    move-object v8, v15

    goto/16 :goto_12

    :pswitch_4
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    move-object v15, v7

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    move/from16 v1, v17

    :goto_10
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-static {v0, v10}, Lbj/r;->a(Lcj/d;Lqi/i;)Lzi/e;

    move-result-object v7

    iget v8, v7, Lzi/e;->e:I

    const/4 v14, 0x3

    if-ne v8, v14, :cond_13

    add-int/lit8 v1, v1, 0x1

    :cond_13
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v8, v15

    iget-wide v14, v7, Lzi/e;->d:J

    invoke-virtual {v2, v14, v15, v7}, La0/y;->g(JLjava/lang/Object;)V

    const/4 v14, 0x4

    if-le v1, v14, :cond_14

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v12, "You have "

    invoke-direct {v7, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v12, " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers."

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ldj/c;->b(Ljava/lang/String;)V

    :cond_14
    move-object v15, v8

    goto :goto_10

    :cond_15
    move-object v8, v15

    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_12

    :pswitch_5
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v1

    const-string v7, "\\."

    invoke-virtual {v1, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v1

    aget-object v7, v1, v17

    invoke-static {v7}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v7

    const/16 v22, 0x1

    aget-object v12, v1, v22

    invoke-static {v12}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v12

    const/16 v19, 0x2

    aget-object v1, v1, v19

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v1

    const/4 v14, 0x4

    if-ge v7, v14, :cond_16

    goto :goto_11

    :cond_16
    if-le v7, v14, :cond_17

    goto :goto_12

    :cond_17
    if-ge v12, v14, :cond_18

    goto :goto_11

    :cond_18
    if-le v12, v14, :cond_19

    goto :goto_12

    :cond_19
    if-ltz v1, :cond_1a

    goto :goto_12

    :cond_1a
    :goto_11
    const-string v1, "Lottie only supports bodymovin >= 4.4.0"

    invoke-virtual {v10, v1}, Lqi/i;->a(Ljava/lang/String;)V

    :goto_12
    move v15, v3

    move-object v7, v8

    :goto_13
    move/from16 v14, v20

    :goto_14
    move-object/from16 v8, v21

    move/from16 v1, v23

    :goto_15
    const/4 v3, 0x0

    goto/16 :goto_0

    :pswitch_6
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v14

    double-to-float v1, v14

    move/from16 v16, v1

    move v15, v3

    goto :goto_13

    :pswitch_7
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v11

    double-to-float v1, v11

    const v7, 0x3c23d70a    # 0.01f

    sub-float v11, v1, v7

    move-object v7, v8

    goto :goto_14

    :pswitch_8
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v14

    double-to-float v15, v14

    move/from16 v14, v20

    :goto_16
    move-object/from16 v8, v21

    goto :goto_15

    :pswitch_9
    move/from16 v23, v1

    move-object/from16 v21, v8

    move v3, v15

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v14

    double-to-int v14, v14

    move v15, v3

    goto :goto_16

    :pswitch_a
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    move-object v8, v7

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v12

    double-to-int v13, v12

    goto :goto_16

    :cond_1b
    move/from16 v23, v1

    move-object/from16 v21, v8

    move/from16 v20, v14

    move v3, v15

    const/16 v17, 0x0

    move-object v8, v7

    int-to-float v0, v13

    mul-float v0, v0, v23

    float-to-int v0, v0

    move/from16 v1, v20

    int-to-float v1, v1

    mul-float v1, v1, v23

    float-to-int v1, v1

    new-instance v7, Landroid/graphics/Rect;

    move/from16 v12, v17

    invoke-direct {v7, v12, v12, v0, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-static {}, Ldj/i;->c()F

    move-result v0

    iput-object v7, v10, Lqi/i;->k:Landroid/graphics/Rect;

    iput v3, v10, Lqi/i;->l:F

    iput v11, v10, Lqi/i;->m:F

    move/from16 v1, v16

    iput v1, v10, Lqi/i;->n:F

    iput-object v4, v10, Lqi/i;->j:Ljava/util/ArrayList;

    iput-object v2, v10, Lqi/i;->i:La0/y;

    iput-object v5, v10, Lqi/i;->c:Ljava/util/HashMap;

    iput-object v6, v10, Lqi/i;->d:Ljava/util/HashMap;

    iput v0, v10, Lqi/i;->e:F

    iput-object v9, v10, Lqi/i;->h:La0/g1;

    move-object v15, v8

    iput-object v15, v10, Lqi/i;->f:Ljava/util/HashMap;

    move-object/from16 v0, v21

    iput-object v0, v10, Lqi/i;->g:Ljava/util/ArrayList;

    return-object v10

    :pswitch_data_0
    .packed-switch 0x0
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
