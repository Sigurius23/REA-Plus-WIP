.class public abstract Lbj/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-string v0, "ty"

    const-string v1, "d"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/g;->a:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lyi/b;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/16 v2, 0x64

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v3, 0x2

    move v4, v3

    :goto_0
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v5

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v5, :cond_2

    sget-object v5, Lbj/g;->a:Lwe/o;

    invoke-virtual {v0, v5}, Lcj/d;->m(Lwe/o;)I

    move-result v5

    if-eqz v5, :cond_1

    if-eq v5, v6, :cond_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    goto :goto_0

    :cond_1
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, v7

    :goto_1
    if-nez v5, :cond_3

    return-object v7

    :cond_3
    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    const/4 v10, 0x0

    const/4 v11, 0x5

    const/4 v12, 0x4

    const/4 v13, 0x3

    sparse-switch v8, :sswitch_data_0

    :goto_2
    const/4 v8, -0x1

    goto/16 :goto_3

    :sswitch_0
    const-string v8, "tr"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto :goto_2

    :cond_4
    const/16 v8, 0xd

    goto/16 :goto_3

    :sswitch_1
    const-string v8, "tm"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_5

    goto :goto_2

    :cond_5
    const/16 v8, 0xc

    goto/16 :goto_3

    :sswitch_2
    const-string v8, "st"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto :goto_2

    :cond_6
    const/16 v8, 0xb

    goto/16 :goto_3

    :sswitch_3
    const-string v8, "sr"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    goto :goto_2

    :cond_7
    const/16 v8, 0xa

    goto/16 :goto_3

    :sswitch_4
    const-string v8, "sh"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto :goto_2

    :cond_8
    const/16 v8, 0x9

    goto/16 :goto_3

    :sswitch_5
    const-string v8, "rp"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_2

    :cond_9
    const/16 v8, 0x8

    goto/16 :goto_3

    :sswitch_6
    const-string v8, "rd"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto :goto_2

    :cond_a
    const/4 v8, 0x7

    goto :goto_3

    :sswitch_7
    const-string v8, "rc"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    goto :goto_2

    :cond_b
    const/4 v8, 0x6

    goto :goto_3

    :sswitch_8
    const-string v8, "mm"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_2

    :cond_c
    move v8, v11

    goto :goto_3

    :sswitch_9
    const-string v8, "gs"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_d

    goto :goto_2

    :cond_d
    move v8, v12

    goto :goto_3

    :sswitch_a
    const-string v8, "gr"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    goto/16 :goto_2

    :cond_e
    move v8, v13

    goto :goto_3

    :sswitch_b
    const-string v8, "gf"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto/16 :goto_2

    :cond_f
    move v8, v3

    goto :goto_3

    :sswitch_c
    const-string v8, "fl"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    goto/16 :goto_2

    :cond_10
    move v8, v6

    goto :goto_3

    :sswitch_d
    const-string v8, "el"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    goto/16 :goto_2

    :cond_11
    move v8, v10

    :goto_3
    packed-switch v8, :pswitch_data_0

    const-string v1, "Unknown shape type "

    invoke-virtual {v1, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ldj/c;->b(Ljava/lang/String;)V

    goto/16 :goto_1e

    :pswitch_0
    invoke-static/range {p0 .. p1}, Lbj/c;->a(Lcj/d;Lqi/i;)Lxi/e;

    move-result-object v7

    goto/16 :goto_1e

    :pswitch_1
    sget-object v2, Lbj/d0;->a:Lwe/o;

    move-object v15, v7

    move-object/from16 v17, v15

    move-object/from16 v18, v17

    move-object/from16 v19, v18

    move/from16 v16, v10

    move/from16 v20, v16

    :goto_4
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1a

    sget-object v2, Lbj/d0;->a:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_19

    if-eq v2, v6, :cond_18

    if-eq v2, v3, :cond_17

    if-eq v2, v13, :cond_16

    if-eq v2, v12, :cond_13

    if-eq v2, v11, :cond_12

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_4

    :cond_12
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v20

    goto :goto_4

    :cond_13
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    if-eq v2, v6, :cond_15

    if-ne v2, v3, :cond_14

    move/from16 v16, v3

    goto :goto_4

    :cond_14
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown trim path type "

    invoke-static {v2, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_15
    move/from16 v16, v6

    goto :goto_4

    :cond_16
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v15

    goto :goto_4

    :cond_17
    invoke-static {v0, v1, v10}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v19

    goto :goto_4

    :cond_18
    invoke-static {v0, v1, v10}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v18

    goto :goto_4

    :cond_19
    invoke-static {v0, v1, v10}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v17

    goto :goto_4

    :cond_1a
    new-instance v14, Lyi/q;

    invoke-direct/range {v14 .. v20}, Lyi/q;-><init>(Ljava/lang/String;ILxi/b;Lxi/b;Lxi/b;Z)V

    :goto_5
    move-object v7, v14

    goto/16 :goto_1e

    :pswitch_2
    sget-object v4, Lbj/c0;->a:Lwe/o;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    const/4 v4, 0x0

    move/from16 v20, v4

    move-object v4, v7

    move-object v12, v4

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v17, v15

    move v5, v10

    move v8, v5

    move/from16 v21, v8

    :goto_6
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_23

    sget-object v11, Lbj/c0;->a:Lwe/o;

    invoke-virtual {v0, v11}, Lcj/d;->m(Lwe/o;)I

    move-result v11

    packed-switch v11, :pswitch_data_1

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_6

    :pswitch_3
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_7
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_21

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    move-object v11, v7

    :goto_8
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_1d

    sget-object v9, Lbj/c0;->b:Lwe/o;

    invoke-virtual {v0, v9}, Lcj/d;->m(Lwe/o;)I

    move-result v9

    if-eqz v9, :cond_1c

    if-eq v9, v6, :cond_1b

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_8

    :cond_1b
    invoke-static {v0, v1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v7

    goto :goto_8

    :cond_1c
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v11

    goto :goto_8

    :cond_1d
    invoke-virtual {v0}, Lcj/d;->endObject()V

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_1

    :goto_9
    const/4 v9, -0x1

    goto :goto_a

    :sswitch_e
    const-string v9, "o"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    goto :goto_9

    :cond_1e
    move v9, v3

    goto :goto_a

    :sswitch_f
    const-string v9, "g"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    goto :goto_9

    :cond_1f
    move v9, v6

    goto :goto_a

    :sswitch_10
    const-string v9, "d"

    invoke-virtual {v11, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_20

    goto :goto_9

    :cond_20
    move v9, v10

    :goto_a
    packed-switch v9, :pswitch_data_2

    goto :goto_b

    :pswitch_4
    move-object v13, v7

    goto :goto_b

    :pswitch_5
    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_b
    const/4 v7, 0x0

    goto :goto_7

    :cond_21
    invoke-virtual {v0}, Lcj/d;->endArray()V

    invoke-virtual {v14}, Ljava/util/ArrayList;->size()I

    move-result v7

    if-ne v7, v6, :cond_22

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxi/b;

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_22
    :goto_c
    const/4 v7, 0x0

    goto/16 :goto_6

    :pswitch_6
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v21

    goto :goto_c

    :pswitch_7
    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v10

    double-to-float v9, v10

    move/from16 v20, v9

    :goto_d
    const/4 v7, 0x0

    const/4 v10, 0x0

    goto/16 :goto_6

    :pswitch_8
    invoke-static {}, Ly00/t7;->_values$2()[I

    move-result-object v8

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v9

    sub-int/2addr v9, v6

    aget v8, v8, v9

    goto :goto_d

    :pswitch_9
    invoke-static {}, Ly00/t7;->_values$1()[I

    move-result-object v5

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v9

    sub-int/2addr v9, v6

    aget v5, v5, v9

    goto :goto_d

    :pswitch_a
    invoke-static/range {p0 .. p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v4

    goto :goto_d

    :pswitch_b
    invoke-static {v0, v1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v17

    goto :goto_d

    :pswitch_c
    invoke-static/range {p0 .. p1}, Lhg3/i;->b0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v15

    goto :goto_d

    :pswitch_d
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v12

    goto :goto_d

    :cond_23
    if-nez v4, :cond_24

    new-instance v4, Lxi/a;

    new-instance v1, Lej/a;

    invoke-direct {v1, v2}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v4, v1, v3}, Lxi/a;-><init>(Ljava/util/List;I)V

    :cond_24
    move-object/from16 v16, v4

    if-nez v5, :cond_25

    move/from16 v18, v6

    goto :goto_e

    :cond_25
    move/from16 v18, v5

    :goto_e
    if-nez v8, :cond_26

    move/from16 v19, v6

    goto :goto_f

    :cond_26
    move/from16 v19, v8

    :goto_f
    new-instance v11, Lyi/p;

    invoke-direct/range {v11 .. v21}, Lyi/p;-><init>(Ljava/lang/String;Lxi/b;Ljava/util/ArrayList;Lxi/a;Lxi/a;Lxi/b;IIFZ)V

    move-object v7, v11

    goto/16 :goto_1e

    :pswitch_e
    invoke-static {v0, v1, v4}, Lbj/u;->a(Lcj/d;Lqi/i;I)Lyi/h;

    move-result-object v7

    goto/16 :goto_1e

    :pswitch_f
    sget-object v2, Lbj/b0;->a:Lwe/o;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    :goto_10
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_2b

    sget-object v9, Lbj/b0;->a:Lwe/o;

    invoke-virtual {v0, v9}, Lcj/d;->m(Lwe/o;)I

    move-result v9

    if-eqz v9, :cond_2a

    if-eq v9, v6, :cond_29

    if-eq v9, v3, :cond_28

    if-eq v9, v13, :cond_27

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_10

    :cond_27
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v8

    goto :goto_10

    :cond_28
    new-instance v4, Lxi/a;

    invoke-static {}, Ldj/i;->c()F

    move-result v9

    sget-object v10, Lbj/y;->a:Lbj/y;

    const/4 v7, 0x0

    invoke-static {v0, v1, v9, v10, v7}, Lbj/q;->a(Lcj/c;Lqi/i;FLbj/e0;Z)Ljava/util/ArrayList;

    move-result-object v9

    invoke-direct {v4, v9, v11}, Lxi/a;-><init>(Ljava/util/List;I)V

    goto :goto_10

    :cond_29
    const/4 v7, 0x0

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v5

    goto :goto_10

    :cond_2a
    const/4 v7, 0x0

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v2

    goto :goto_10

    :cond_2b
    new-instance v7, Lyi/o;

    invoke-direct {v7, v2, v5, v4, v8}, Lyi/o;-><init>(Ljava/lang/String;ILxi/a;Z)V

    goto/16 :goto_1e

    :pswitch_10
    invoke-static/range {p0 .. p1}, Lbj/w;->a(Lcj/d;Lqi/i;)Lyi/j;

    move-result-object v7

    goto/16 :goto_1e

    :pswitch_11
    invoke-static/range {p0 .. p1}, Lbj/x;->a(Lcj/d;Lqi/i;)Lyi/k;

    move-result-object v7

    goto/16 :goto_1e

    :pswitch_12
    move v7, v10

    sget-object v2, Lbj/v;->a:Lwe/o;

    move/from16 v22, v7

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    :goto_11
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_31

    sget-object v2, Lbj/v;->a:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_30

    if-eq v2, v6, :cond_2f

    if-eq v2, v3, :cond_2e

    if-eq v2, v13, :cond_2d

    if-eq v2, v12, :cond_2c

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_11

    :cond_2c
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v22

    goto :goto_11

    :cond_2d
    invoke-static {v0, v1, v6}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v21

    goto :goto_11

    :cond_2e
    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v20

    goto :goto_11

    :cond_2f
    invoke-static/range {p0 .. p1}, Lbj/a;->b(Lcj/d;Lqi/i;)Lxi/f;

    move-result-object v19

    goto :goto_11

    :cond_30
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v18

    goto :goto_11

    :cond_31
    new-instance v17, Lyi/i;

    invoke-direct/range {v17 .. v22}, Lyi/i;-><init>(Ljava/lang/String;Lxi/f;Lxi/a;Lxi/b;Z)V

    :goto_12
    move-object/from16 v7, v17

    goto/16 :goto_1e

    :pswitch_13
    move v7, v10

    sget-object v2, Lbj/t;->a:Lwe/o;

    move v2, v7

    move v10, v2

    const/4 v7, 0x0

    :goto_13
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3a

    sget-object v4, Lbj/t;->a:Lwe/o;

    invoke-virtual {v0, v4}, Lcj/d;->m(Lwe/o;)I

    move-result v4

    if-eqz v4, :cond_39

    if-eq v4, v6, :cond_33

    if-eq v4, v3, :cond_32

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_13

    :cond_32
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v2

    goto :goto_13

    :cond_33
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    if-eq v4, v6, :cond_34

    if-eq v4, v3, :cond_38

    if-eq v4, v13, :cond_37

    if-eq v4, v12, :cond_36

    if-eq v4, v11, :cond_35

    :cond_34
    move v10, v6

    goto :goto_13

    :cond_35
    move v10, v11

    goto :goto_13

    :cond_36
    move v10, v12

    goto :goto_13

    :cond_37
    move v10, v13

    goto :goto_13

    :cond_38
    move v10, v3

    goto :goto_13

    :cond_39
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v7

    goto :goto_13

    :cond_3a
    new-instance v3, Lyi/g;

    invoke-direct {v3, v7, v10, v2}, Lyi/g;-><init>(Ljava/lang/String;IZ)V

    const-string v2, "Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove()."

    invoke-virtual {v1, v2}, Lqi/i;->a(Ljava/lang/String;)V

    move-object v7, v3

    goto/16 :goto_1e

    :pswitch_14
    invoke-static/range {p0 .. p1}, Lbj/n;->a(Lcj/d;Lqi/i;)Lyi/e;

    move-result-object v7

    goto/16 :goto_1e

    :pswitch_15
    move v7, v10

    sget-object v2, Lbj/a0;->a:Lwe/o;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    const/4 v7, 0x0

    :goto_14
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_40

    sget-object v4, Lbj/a0;->a:Lwe/o;

    invoke-virtual {v0, v4}, Lcj/d;->m(Lwe/o;)I

    move-result v4

    if-eqz v4, :cond_3f

    if-eq v4, v6, :cond_3e

    if-eq v4, v3, :cond_3b

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_14

    :cond_3b
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :cond_3c
    :goto_15
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3d

    invoke-static/range {p0 .. p1}, Lbj/g;->a(Lcj/d;Lqi/i;)Lyi/b;

    move-result-object v4

    if-eqz v4, :cond_3c

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_15

    :cond_3d
    invoke-virtual {v0}, Lcj/d;->endArray()V

    goto :goto_14

    :cond_3e
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v10

    goto :goto_14

    :cond_3f
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v7

    goto :goto_14

    :cond_40
    new-instance v1, Lyi/n;

    invoke-direct {v1, v7, v2, v10}, Lyi/n;-><init>(Ljava/lang/String;Ljava/util/List;Z)V

    move-object v7, v1

    goto/16 :goto_1e

    :pswitch_16
    move v7, v10

    sget-object v4, Lbj/m;->a:Lwe/o;

    sget-object v4, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    move-object/from16 v22, v4

    move/from16 v21, v7

    move/from16 v27, v21

    const/4 v7, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    :goto_16
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_46

    sget-object v4, Lbj/m;->a:Lwe/o;

    invoke-virtual {v0, v4}, Lcj/d;->m(Lwe/o;)I

    move-result v4

    packed-switch v4, :pswitch_data_3

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_16

    :pswitch_17
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v27

    goto :goto_16

    :pswitch_18
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    if-ne v4, v6, :cond_41

    sget-object v4, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_17
    move-object/from16 v22, v4

    goto :goto_16

    :cond_41
    sget-object v4, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_17

    :pswitch_19
    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v26

    goto :goto_16

    :pswitch_1a
    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v25

    goto :goto_16

    :pswitch_1b
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    if-ne v4, v6, :cond_42

    move/from16 v21, v6

    goto :goto_16

    :cond_42
    move/from16 v21, v3

    goto :goto_16

    :pswitch_1c
    invoke-static/range {p0 .. p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v7

    goto :goto_16

    :pswitch_1d
    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v4, -0x1

    :goto_18
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_45

    sget-object v5, Lbj/m;->b:Lwe/o;

    invoke-virtual {v0, v5}, Lcj/d;->m(Lwe/o;)I

    move-result v5

    if-eqz v5, :cond_44

    if-eq v5, v6, :cond_43

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_18

    :cond_43
    invoke-static {v0, v1, v4}, Lhg3/i;->d0(Lcj/d;Lqi/i;I)Lxi/a;

    move-result-object v23

    goto :goto_18

    :cond_44
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    goto :goto_18

    :cond_45
    invoke-virtual {v0}, Lcj/d;->endObject()V

    goto :goto_16

    :pswitch_1e
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v20

    goto :goto_16

    :cond_46
    if-nez v7, :cond_47

    new-instance v7, Lxi/a;

    new-instance v1, Lej/a;

    invoke-direct {v1, v2}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v7, v1, v3}, Lxi/a;-><init>(Ljava/util/List;I)V

    :cond_47
    move-object/from16 v24, v7

    new-instance v19, Lyi/d;

    invoke-direct/range {v19 .. v27}, Lyi/d;-><init>(Ljava/lang/String;ILandroid/graphics/Path$FillType;Lxi/a;Lxi/a;Lxi/a;Lxi/a;Z)V

    move-object/from16 v7, v19

    goto/16 :goto_1e

    :pswitch_1f
    move v7, v10

    sget-object v4, Lbj/z;->a:Lwe/o;

    move v4, v6

    move/from16 v16, v7

    move/from16 v20, v16

    const/4 v7, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    :goto_19
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4e

    sget-object v5, Lbj/z;->a:Lwe/o;

    invoke-virtual {v0, v5}, Lcj/d;->m(Lwe/o;)I

    move-result v5

    if-eqz v5, :cond_4d

    if-eq v5, v6, :cond_4c

    if-eq v5, v3, :cond_4b

    if-eq v5, v13, :cond_4a

    if-eq v5, v12, :cond_49

    if-eq v5, v11, :cond_48

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_19

    :cond_48
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v20

    goto :goto_19

    :cond_49
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v4

    goto :goto_19

    :cond_4a
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v16

    goto :goto_19

    :cond_4b
    invoke-static/range {p0 .. p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v7

    goto :goto_19

    :cond_4c
    invoke-static/range {p0 .. p1}, Lhg3/i;->b0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v18

    goto :goto_19

    :cond_4d
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v15

    goto :goto_19

    :cond_4e
    if-nez v7, :cond_4f

    new-instance v7, Lxi/a;

    new-instance v1, Lej/a;

    invoke-direct {v1, v2}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v7, v1, v3}, Lxi/a;-><init>(Ljava/util/List;I)V

    :cond_4f
    move-object/from16 v19, v7

    if-ne v4, v6, :cond_50

    sget-object v1, Landroid/graphics/Path$FillType;->WINDING:Landroid/graphics/Path$FillType;

    :goto_1a
    move-object/from16 v17, v1

    goto :goto_1b

    :cond_50
    sget-object v1, Landroid/graphics/Path$FillType;->EVEN_ODD:Landroid/graphics/Path$FillType;

    goto :goto_1a

    :goto_1b
    new-instance v14, Lyi/m;

    invoke-direct/range {v14 .. v20}, Lyi/m;-><init>(Ljava/lang/String;ZLandroid/graphics/Path$FillType;Lxi/a;Lxi/a;Z)V

    goto/16 :goto_5

    :pswitch_20
    move v7, v10

    sget-object v2, Lbj/e;->a:Lwe/o;

    if-ne v4, v13, :cond_51

    move v2, v6

    goto :goto_1c

    :cond_51
    move v2, v7

    :goto_1c
    move/from16 v21, v2

    move/from16 v22, v7

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    :goto_1d
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_58

    sget-object v2, Lbj/e;->a:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_57

    if-eq v2, v6, :cond_56

    if-eq v2, v3, :cond_55

    if-eq v2, v13, :cond_54

    if-eq v2, v12, :cond_52

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_1d

    :cond_52
    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    if-ne v2, v13, :cond_53

    move/from16 v21, v6

    goto :goto_1d

    :cond_53
    move/from16 v21, v7

    goto :goto_1d

    :cond_54
    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v22

    goto :goto_1d

    :cond_55
    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v20

    goto :goto_1d

    :cond_56
    invoke-static/range {p0 .. p1}, Lbj/a;->b(Lcj/d;Lqi/i;)Lxi/f;

    move-result-object v19

    goto :goto_1d

    :cond_57
    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v18

    goto :goto_1d

    :cond_58
    new-instance v17, Lyi/a;

    invoke-direct/range {v17 .. v22}, Lyi/a;-><init>(Ljava/lang/String;Lxi/f;Lxi/a;ZZ)V

    goto/16 :goto_12

    :goto_1e
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_59

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_1e

    :cond_59
    invoke-virtual {v0}, Lcj/d;->endObject()V

    return-object v7

    :sswitch_data_0
    .sparse-switch
        0xca7 -> :sswitch_d
        0xcc6 -> :sswitch_c
        0xcdf -> :sswitch_b
        0xceb -> :sswitch_a
        0xcec -> :sswitch_9
        0xda0 -> :sswitch_8
        0xe31 -> :sswitch_7
        0xe32 -> :sswitch_6
        0xe3e -> :sswitch_5
        0xe55 -> :sswitch_4
        0xe5f -> :sswitch_3
        0xe61 -> :sswitch_2
        0xe79 -> :sswitch_1
        0xe7e -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_20
        :pswitch_1f
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_3
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x64 -> :sswitch_10
        0x67 -> :sswitch_f
        0x6f -> :sswitch_e
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_5
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch
.end method
