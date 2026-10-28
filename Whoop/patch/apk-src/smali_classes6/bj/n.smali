.class public abstract Lbj/n;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lwe/o;

.field public static final b:Lwe/o;

.field public static final c:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    const-string v10, "hd"

    const-string v11, "d"

    const-string v0, "nm"

    const-string v1, "g"

    const-string v2, "o"

    const-string v3, "t"

    const-string v4, "s"

    const-string v5, "e"

    const-string v6, "w"

    const-string v7, "lc"

    const-string v8, "lj"

    const-string v9, "ml"

    filled-new-array/range {v0 .. v11}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/n;->a:Lwe/o;

    const-string v0, "p"

    const-string v1, "k"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/n;->b:Lwe/o;

    const-string v0, "n"

    const-string v1, "v"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/n;->c:Lwe/o;

    return-void
.end method

.method public static a(Lcj/d;Lqi/i;)Lyi/e;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v5, v3

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v14, v9

    move-object/from16 v16, v14

    move v10, v4

    const/4 v6, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v4, v16

    :goto_0
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_c

    sget-object v2, Lbj/n;->a:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    const/16 v18, 0x3

    move/from16 v19, v2

    packed-switch v19, :pswitch_data_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v0}, Lcj/d;->beginArray()V

    :goto_1
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_6

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    move-object/from16 v20, v16

    move-object/from16 v21, v20

    :goto_2
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_2

    sget-object v2, Lbj/n;->c:Lwe/o;

    invoke-virtual {v0, v2}, Lcj/d;->m(Lwe/o;)I

    move-result v2

    if-eqz v2, :cond_1

    move-object/from16 v22, v3

    const/4 v3, 0x1

    if-eq v2, v3, :cond_0

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    :goto_3
    move-object/from16 v3, v22

    goto :goto_2

    :cond_0
    invoke-static {v0, v1, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v21

    goto :goto_3

    :cond_1
    move-object/from16 v22, v3

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v20

    goto :goto_2

    :cond_2
    move-object/from16 v22, v3

    invoke-virtual {v0}, Lcj/d;->endObject()V

    const-string v2, "o"

    move-object/from16 v3, v20

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    move-object/from16 v14, v21

    goto :goto_4

    :cond_3
    const-string v2, "d"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "g"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    :cond_4
    move-object/from16 v2, v21

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    :goto_4
    move-object/from16 v3, v22

    goto :goto_1

    :cond_6
    move-object/from16 v22, v3

    invoke-virtual {v0}, Lcj/d;->endArray()V

    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    const/4 v3, 0x1

    if-ne v2, v3, :cond_7

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxi/b;

    invoke-virtual {v11, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    const/4 v2, 0x0

    :goto_5
    move-object/from16 v3, v22

    goto/16 :goto_0

    :pswitch_1
    move-object/from16 v22, v3

    const/4 v2, 0x0

    invoke-virtual {v0}, Lcj/d;->h()Z

    move-result v15

    goto/16 :goto_0

    :pswitch_2
    move-object/from16 v22, v3

    invoke-virtual {v0}, Lcj/d;->nextDouble()D

    move-result-wide v2

    double-to-float v10, v2

    goto :goto_5

    :pswitch_3
    move-object/from16 v22, v3

    invoke-static/range {v18 .. v18}, Le4/p;->f(I)[I

    move-result-object v2

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v3

    const/16 v19, 0x1

    add-int/lit8 v3, v3, -0x1

    aget v13, v2, v3

    goto :goto_5

    :pswitch_4
    move-object/from16 v22, v3

    const/4 v3, 0x1

    invoke-static/range {v18 .. v18}, Le4/p;->f(I)[I

    move-result-object v2

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v12

    sub-int/2addr v12, v3

    aget v12, v2, v12

    goto :goto_5

    :pswitch_5
    move-object/from16 v22, v3

    const/4 v3, 0x1

    invoke-static {v0, v1, v3}, Lhg3/i;->c0(Lcj/c;Lqi/i;Z)Lxi/b;

    move-result-object v9

    goto :goto_5

    :pswitch_6
    move-object/from16 v22, v3

    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_7
    move-object/from16 v22, v3

    invoke-static/range {p0 .. p1}, Lhg3/i;->f0(Lcj/d;Lqi/i;)Lxi/a;

    move-result-object v7

    goto/16 :goto_0

    :pswitch_8
    move-object/from16 v22, v3

    const/4 v3, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    if-ne v2, v3, :cond_8

    const/4 v6, 0x1

    goto :goto_5

    :cond_8
    const/4 v2, 0x2

    move v6, v2

    goto :goto_5

    :pswitch_9
    move-object/from16 v22, v3

    invoke-static/range {p0 .. p1}, Lhg3/i;->e0(Lcj/c;Lqi/i;)Lxi/a;

    move-result-object v4

    goto/16 :goto_0

    :pswitch_a
    move-object/from16 v22, v3

    invoke-virtual {v0}, Lcj/d;->beginObject()V

    const/4 v2, -0x1

    :goto_6
    invoke-virtual {v0}, Lcj/d;->hasNext()Z

    move-result v18

    if-eqz v18, :cond_b

    move-object/from16 v18, v3

    sget-object v3, Lbj/n;->b:Lwe/o;

    invoke-virtual {v0, v3}, Lcj/d;->m(Lwe/o;)I

    move-result v3

    if-eqz v3, :cond_a

    move-object/from16 v20, v4

    const/4 v4, 0x1

    if-eq v3, v4, :cond_9

    invoke-virtual {v0}, Lcj/d;->s()V

    invoke-virtual {v0}, Lcj/d;->skipValue()V

    :goto_7
    move-object/from16 v3, v18

    :goto_8
    move-object/from16 v4, v20

    goto :goto_6

    :cond_9
    invoke-static {v0, v1, v2}, Lhg3/i;->d0(Lcj/d;Lqi/i;I)Lxi/a;

    move-result-object v3

    goto :goto_8

    :cond_a
    move-object/from16 v20, v4

    const/4 v4, 0x1

    invoke-virtual {v0}, Lcj/d;->nextInt()I

    move-result v2

    goto :goto_7

    :cond_b
    move-object/from16 v18, v3

    move-object/from16 v20, v4

    invoke-virtual {v0}, Lcj/d;->endObject()V

    goto/16 :goto_0

    :pswitch_b
    move-object/from16 v22, v3

    move-object/from16 v20, v4

    invoke-virtual {v0}, Lcj/d;->nextString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :cond_c
    move-object/from16 v22, v3

    move-object/from16 v20, v4

    if-nez v20, :cond_d

    new-instance v4, Lxi/a;

    new-instance v0, Lej/a;

    const/16 v1, 0x64

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v0, v1}, Lej/a;-><init>(Ljava/lang/Object;)V

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x2

    invoke-direct {v4, v0, v1}, Lxi/a;-><init>(Ljava/util/List;I)V

    goto :goto_9

    :cond_d
    move-object/from16 v4, v20

    :goto_9
    new-instance v0, Lyi/e;

    move-object v1, v5

    move v2, v6

    move-object v5, v7

    move-object v6, v8

    move-object v7, v9

    move v8, v12

    move v9, v13

    move-object v12, v14

    move v13, v15

    move-object/from16 v3, v22

    invoke-direct/range {v0 .. v13}, Lyi/e;-><init>(Ljava/lang/String;ILxi/a;Lxi/a;Lxi/a;Lxi/a;Lxi/b;IIFLjava/util/ArrayList;Lxi/b;Z)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
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
