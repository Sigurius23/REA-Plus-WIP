.class public abstract Lbj/r;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;

.field public static final c:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 26

    const-string v24, "ao"

    const-string v25, "bm"

    const-string v1, "nm"

    const-string v2, "ind"

    const-string v3, "refId"

    const-string v4, "ty"

    const-string v5, "parent"

    const-string v6, "sw"

    const-string v7, "sh"

    const-string v8, "sc"

    const-string v9, "ks"

    const-string v10, "tt"

    const-string v11, "masksProperties"

    const-string v12, "shapes"

    const-string v13, "t"

    const-string v14, "ef"

    const-string v15, "sr"

    const-string v16, "st"

    const-string v17, "w"

    const-string v18, "h"

    const-string v19, "ip"

    const-string v20, "op"

    const-string v21, "tm"

    const-string v22, "cl"

    const-string v23, "hd"

    filled-new-array/range {v1 .. v25}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/r;->a:Lwe/o;

    const-string v0, "d"

    const-string v1, "a"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/r;->b:Lwe/o;

    const-string v0, "ty"

    const-string v1, "nm"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/r;->c:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lzi/e;
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v7, 0x0

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const-string v6, "UNSET"

    const-wide/16 v12, 0x0

    const-wide/16 v14, -0x1

    move/from16 v17, v7

    move/from16 v18, v17

    move/from16 v25, v18

    move/from16 v26, v25

    move/from16 v27, v26

    move/from16 v36, v27

    move-object/from16 v16, v8

    move-wide v7, v14

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x1

    const/16 v32, 0x1

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    move v15, v3

    move-wide v13, v12

    const/4 v3, 0x0

    move-object v12, v6

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v37

    if-eqz v37, :cond_1d

    sget-object v11, Lbj/r;->a:Lwe/o;

    invoke-virtual {v0, v11}, Lcj/d;->m(Lwe/o;)I

    move-result v11

    packed-switch v11, :pswitch_data_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    move-object/from16 v39, v2

    move-object/from16 v40, v3

    :goto_1
    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    goto/16 :goto_11

    :pswitch_0
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    invoke-static {}, Ly00/t7;->_values()[I

    move-result-object v11

    array-length v11, v11

    if-lt v4, v11, :cond_1

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v5, "Unsupported Blend Mode: "

    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lqi/i;->a(Ljava/lang/String;)V

    const/16 v32, 0x1

    goto :goto_0

    :cond_1
    invoke-static {}, Ly00/t7;->_values()[I

    move-result-object v5

    aget v32, v5, v4

    goto :goto_0

    :pswitch_1
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    const/4 v5, 0x1

    if-ne v4, v5, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :pswitch_2
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v28

    goto :goto_0

    :pswitch_3
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v3

    goto :goto_0

    :pswitch_4
    const/4 v4, 0x0

    invoke-static {v0, v1, v4}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v35

    goto :goto_0

    :pswitch_5
    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v18, v4

    goto :goto_0

    :pswitch_6
    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v4

    double-to-float v4, v4

    move/from16 v17, v4

    goto :goto_0

    :pswitch_7
    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v4

    invoke-static {}, Ldj/i;->c()F

    move-result v11

    move-object/from16 v39, v2

    move-object/from16 v40, v3

    float-to-double v2, v11

    mul-double/2addr v4, v2

    double-to-float v2, v4

    move/from16 v26, v2

    :goto_2
    move-object/from16 v2, v39

    move-object/from16 v3, v40

    goto/16 :goto_0

    :pswitch_8
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v2

    invoke-static {}, Ldj/i;->c()F

    move-result v4

    float-to-double v4, v4

    mul-double/2addr v2, v4

    double-to-float v2, v2

    move/from16 v25, v2

    goto :goto_2

    :pswitch_9
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v2

    double-to-float v2, v2

    move/from16 v27, v2

    goto :goto_2

    :pswitch_a
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v2

    double-to-float v15, v2

    goto :goto_2

    :pswitch_b
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    :goto_3
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    :cond_2
    :goto_4
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lbj/r;->c:Lwe/o;

    invoke-virtual {v0, v3}, Lcj/d;->m(Lwe/o;)I

    move-result v3

    if-eqz v3, :cond_4

    const/4 v5, 0x1

    if-eq v3, v5, :cond_3

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_4

    :cond_3
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v3

    const/16 v4, 0x1d

    if-ne v3, v4, :cond_5

    invoke-static/range {p0 .. p1}, Lbj/d;->a(Lcj/d;Lqi/i;)Lty/c;

    move-result-object v29

    goto :goto_4

    :cond_5
    const/16 v4, 0x19

    if-ne v3, v4, :cond_2

    new-instance v3, Lbj/i;

    invoke-direct {v3}, Lbj/i;-><init>()V

    invoke-virtual {v3, v0, v1}, Lbj/i;->a(Lcj/d;Lqi/i;)Lb30/m;

    move-result-object v30

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lcj/d;->endObject()V

    goto :goto_3

    :cond_7
    invoke-virtual {v0}, Lcj/d;->endArray()V

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Lottie doesn\'t support layer effects. If you are using them for  fills, strokes, trim paths etc. then try adding them directly as contents  in your shape. Found: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    goto/16 :goto_2

    :pswitch_c
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    :goto_5
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    sget-object v2, Lbj/r;->b:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_b

    const/4 v5, 0x1

    if-eq v2, v5, :cond_8

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_5

    :cond_8
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-static/range {p0 .. p1}, Lbj/b;->a(Lcj/d;Lqi/i;)Lso/q;

    move-result-object v34

    :cond_9
    :goto_6
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_5

    :cond_b
    new-instance v2, Lxi/d;

    invoke-static {}, Ldj/i;->c()F

    move-result v3

    sget-object v4, Lbj/h;->a:Lbj/h;

    const/4 v5, 0x0

    invoke-static {v0, v1, v3, v4, v5}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object v3

    invoke-direct {v2, v3}, Lxi/d;-><init>(Ljava/util/ArrayList;)V

    move-object/from16 v33, v2

    goto :goto_5

    :cond_c
    invoke-virtual {v0}, Lcj/d;->endObject()V

    goto/16 :goto_2

    :pswitch_d
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :cond_d
    :goto_7
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-static/range {p0 .. p1}, Lbj/g;->a(Lcj/d;Lqi/i;)Lyi/b;

    move-result-object v2

    if-eqz v2, :cond_d

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_e
    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto/16 :goto_1

    :pswitch_e
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_8
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_18

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    :goto_9
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v41

    if-eqz v41, :cond_17

    invoke-virtual {v0}, Lcj/d;->nextName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v42

    const/16 v43, -0x1

    const/16 v44, 0x2

    sparse-switch v42, :sswitch_data_0

    move/from16 v42, v6

    :goto_a
    move/from16 v6, v43

    goto :goto_c

    :sswitch_0
    move/from16 v42, v6

    const-string v6, "mode"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    goto :goto_b

    :cond_f
    const/4 v6, 0x3

    goto :goto_c

    :sswitch_1
    move/from16 v42, v6

    const-string v6, "inv"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    goto :goto_b

    :cond_10
    move/from16 v6, v44

    goto :goto_c

    :sswitch_2
    move/from16 v42, v6

    const-string v6, "pt"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    goto :goto_b

    :cond_11
    const/4 v6, 0x1

    goto :goto_c

    :sswitch_3
    move/from16 v42, v6

    const-string v6, "o"

    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_12

    :goto_b
    goto :goto_a

    :cond_12
    const/4 v6, 0x0

    :goto_c
    packed-switch v6, :pswitch_data_1

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    :goto_d
    move-wide/from16 v43, v7

    const/4 v7, 0x0

    goto/16 :goto_10

    :pswitch_f
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_1

    goto :goto_e

    :sswitch_4
    const-string v6, "s"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_e

    :cond_13
    const/16 v43, 0x3

    goto :goto_e

    :sswitch_5
    const-string v6, "n"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_e

    :cond_14
    move/from16 v43, v44

    goto :goto_e

    :sswitch_6
    const-string v6, "i"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_e

    :cond_15
    const/16 v43, 0x1

    goto :goto_e

    :sswitch_7
    const-string v6, "a"

    invoke-virtual {v2, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_e

    :cond_16
    const/16 v43, 0x0

    :goto_e
    packed-switch v43, :pswitch_data_2

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v6, "Unknown mask mode "

    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ". Defaulting to Add."

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ldj/c;->b(Ljava/lang/String;)V

    :pswitch_10
    const/16 v44, 0x1

    goto :goto_f

    :pswitch_11
    const/16 v44, 0x4

    goto :goto_f

    :pswitch_12
    const-string v2, "Animation contains intersect masks. They are not supported but will be treated like add masks."

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    const/16 v44, 0x3

    :goto_f
    :pswitch_13
    move/from16 v2, v44

    goto :goto_d

    :pswitch_14
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v3

    goto :goto_d

    :pswitch_15
    new-instance v5, Lxi/a;

    invoke-static {}, Ldj/i;->c()F

    move-result v4

    sget-object v6, Lbj/y;->a:Lbj/y;

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    invoke-static {v0, v1, v4, v6, v7}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object v4

    const/4 v6, 0x5

    invoke-direct {v5, v4, v6}, Lxi/a;-><init>(Ljava/util/List;I)V

    goto :goto_10

    :pswitch_16
    move-wide/from16 v43, v7

    const/4 v7, 0x0

    invoke-static/range {p0 .. p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v11

    :goto_10
    move/from16 v6, v42

    move-wide/from16 v7, v43

    goto/16 :goto_9

    :cond_17
    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    invoke-virtual {v0}, Lcj/d;->endObject()V

    new-instance v4, Lyi/f;

    invoke-direct {v4, v2, v5, v11, v3}, Lyi/f;-><init>(ILxi/a;Lxi/a;Z)V

    invoke-virtual {v10, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v7, v43

    goto/16 :goto_8

    :cond_18
    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    iget v3, v1, Lqi/i;->o:I

    add-int/2addr v3, v2

    iput v3, v1, Lqi/i;->o:I

    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_11

    :pswitch_17
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    invoke-static {}, Ly00/t7;->_values$3()[I

    move-result-object v3

    array-length v3, v3

    if-lt v2, v3, :cond_1a

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Unsupported matte type: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    :cond_19
    :goto_11
    move-object/from16 v2, v39

    move-object/from16 v3, v40

    move/from16 v6, v42

    :goto_12
    move-wide/from16 v7, v43

    goto/16 :goto_0

    :cond_1a
    invoke-static {}, Ly00/t7;->_values$3()[I

    move-result-object v3

    aget v31, v3, v2

    invoke-static/range {v31 .. v31}, Le4/p;->e(I)I

    move-result v2

    const/4 v3, 0x3

    if-eq v2, v3, :cond_1c

    const/4 v3, 0x4

    if-eq v2, v3, :cond_1b

    goto :goto_13

    :cond_1b
    const-string v2, "Unsupported matte type: Luma Inverted"

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    goto :goto_13

    :cond_1c
    const-string v2, "Unsupported matte type: Luma"

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    :goto_13
    iget v2, v1, Lqi/i;->o:I

    const/16 v38, 0x1

    add-int/lit8 v2, v2, 0x1

    iput v2, v1, Lqi/i;->o:I

    goto :goto_11

    :pswitch_18
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-static/range {p0 .. p1}, Lbj/c;->a(Lcj/d;Lqi/i;)Lxi/e;

    move-result-object v19

    goto :goto_12

    :pswitch_19
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v24

    :goto_14
    move-object/from16 v2, v39

    goto :goto_12

    :pswitch_1a
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    int-to-float v2, v2

    invoke-static {}, Ldj/i;->c()F

    move-result v3

    mul-float/2addr v3, v2

    float-to-int v2, v3

    move/from16 v23, v2

    :goto_15
    move-object/from16 v2, v39

    move-object/from16 v3, v40

    goto :goto_12

    :pswitch_1b
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    int-to-float v2, v2

    invoke-static {}, Ldj/i;->c()F

    move-result v3

    mul-float/2addr v3, v2

    float-to-int v2, v3

    move/from16 v22, v2

    goto :goto_15

    :pswitch_1c
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    int-to-long v2, v2

    move-wide v7, v2

    goto/16 :goto_2

    :pswitch_1d
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    const/4 v3, 0x6

    const/16 v20, 0x7

    if-ge v2, v3, :cond_19

    invoke-static/range {v20 .. v20}, Le4/p;->f(I)[I

    move-result-object v3

    aget v20, v3, v2

    goto/16 :goto_11

    :pswitch_1e
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v21

    goto/16 :goto_12

    :pswitch_1f
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    int-to-long v13, v2

    goto/16 :goto_14

    :pswitch_20
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    const/4 v7, 0x0

    const/16 v38, 0x1

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v12

    goto/16 :goto_12

    :cond_1d
    move-object/from16 v39, v2

    move-object/from16 v40, v3

    move/from16 v42, v6

    move-wide/from16 v43, v7

    invoke-virtual {v0}, Lcj/d;->endObject()V

    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    cmpl-float v0, v17, v36

    if-lez v0, :cond_1e

    new-instance v0, Lej/a;

    const/4 v5, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    const/4 v4, 0x0

    move-object/from16 v3, v39

    move-object/from16 v2, v39

    move-object/from16 v11, v40

    move/from16 v8, v42

    invoke-direct/range {v0 .. v6}, Lej/a;-><init>(Lqi/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/BaseInterpolator;FLjava/lang/Float;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_1e
    move-object/from16 v11, v40

    move/from16 v8, v42

    :goto_16
    cmpl-float v0, v18, v36

    if-lez v0, :cond_1f

    goto :goto_17

    :cond_1f
    iget v0, v1, Lqi/i;->m:F

    move/from16 v18, v0

    :goto_17
    new-instance v0, Lej/a;

    const/4 v4, 0x0

    invoke-static/range {v18 .. v18}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v3, v16

    move-object/from16 v2, v16

    move/from16 v5, v17

    invoke-direct/range {v0 .. v6}, Lej/a;-><init>(Lqi/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/BaseInterpolator;FLjava/lang/Float;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v0, Lej/a;

    const v1, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    move-object/from16 v3, v39

    move-object/from16 v1, p1

    move/from16 v5, v18

    move-object/from16 v2, v39

    invoke-direct/range {v0 .. v6}, Lej/a;-><init>(Lqi/i;Ljava/lang/Object;Ljava/lang/Object;Landroid/view/animation/BaseInterpolator;FLjava/lang/Float;)V

    invoke-virtual {v7, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v0, ".ai"

    invoke-virtual {v12, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_20

    const-string v0, "ai"

    invoke-virtual {v0, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_21

    :cond_20
    const-string v0, "Convert your Illustrator layers to shape layers."

    invoke-virtual {v1, v0}, Lqi/i;->a(Ljava/lang/String;)V

    :cond_21
    if-eqz v8, :cond_23

    if-nez v19, :cond_22

    new-instance v19, Lxi/e;

    invoke-direct/range {v19 .. v19}, Lxi/e;-><init>()V

    :cond_22
    move-object/from16 v0, v19

    iput-boolean v8, v0, Lxi/e;->j:Z

    move-object v11, v0

    goto :goto_18

    :cond_23
    move-object/from16 v11, v19

    :goto_18
    new-instance v0, Lzi/e;

    move-object v2, v1

    move-object v1, v9

    move-object v3, v12

    move-wide v4, v13

    move/from16 v6, v20

    move-object/from16 v9, v21

    move/from16 v12, v22

    move/from16 v13, v23

    move/from16 v14, v24

    move/from16 v17, v25

    move/from16 v18, v26

    move/from16 v16, v27

    move/from16 v24, v28

    move-object/from16 v25, v29

    move-object/from16 v26, v30

    move/from16 v22, v31

    move/from16 v27, v32

    move-object/from16 v19, v33

    move-object/from16 v20, v34

    move-object/from16 v23, v35

    move-object/from16 v21, v7

    move-wide/from16 v7, v43

    invoke-direct/range {v0 .. v27}, Lzi/e;-><init>(Ljava/util/List;Lqi/i;Ljava/lang/String;JIJLjava/lang/String;Ljava/util/List;Lxi/e;IIIFFFFLxi/d;Lso/q;Ljava/util/List;ILxi/b;ZLty/c;Lb30/m;I)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
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

    :sswitch_data_0
    .sparse-switch
        0x6f -> :sswitch_3
        0xe04 -> :sswitch_2
        0x197f1 -> :sswitch_1
        0x3339a3 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_f
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x61 -> :sswitch_7
        0x69 -> :sswitch_6
        0x6e -> :sswitch_5
        0x73 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_10
        :pswitch_12
        :pswitch_11
        :pswitch_13
    .end packed-switch
.end method
