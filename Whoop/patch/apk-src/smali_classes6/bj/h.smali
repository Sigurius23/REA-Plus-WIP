.class public final Lbj/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lbj/e0;


# static fields
.field public static final a:Lbj/h;

.field public static final b:Lwe/o;


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Lbj/h;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lbj/h;->a:Lbj/h;

    const-string v12, "ps"

    const-string v13, "sz"

    const-string v1, "t"

    const-string v2, "f"

    const-string v3, "s"

    const-string v4, "j"

    const-string v5, "tr"

    const-string v6, "lh"

    const-string v7, "ls"

    const-string v8, "fc"

    const-string v9, "sc"

    const-string v10, "sw"

    const-string v11, "of"

    filled-new-array/range {v1 .. v13}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwe/o;->L([Ljava/lang/String;)Lwe/o;

    move-result-object v0

    sput-object v0, Lbj/h;->b:Lwe/o;

    return-void
.end method


# virtual methods
.method public final a(Lcj/c;F)Ljava/lang/Object;
    .locals 18

    invoke-virtual/range {p1 .. p1}, Lcj/c;->beginObject()V

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    move v5, v1

    move v6, v5

    move v7, v6

    move v8, v7

    move v9, v3

    move v10, v9

    move v11, v10

    move v12, v4

    const/4 v13, 0x3

    move-object v1, v0

    move-object v3, v1

    move-object v4, v3

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcj/c;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    sget-object v14, Lbj/h;->b:Lwe/o;

    move-object/from16 v15, p1

    invoke-virtual {v15, v14}, Lcj/c;->m(Lwe/o;)I

    move-result v14

    packed-switch v14, :pswitch_data_0

    invoke-virtual {v15}, Lcj/c;->s()V

    invoke-virtual {v15}, Lcj/c;->skipValue()V

    goto :goto_0

    :pswitch_0
    invoke-virtual {v15}, Lcj/c;->beginArray()V

    new-instance v4, Landroid/graphics/PointF;

    move-object/from16 v16, v3

    const/4 v14, 0x3

    invoke-virtual {v15}, Lcj/c;->nextDouble()D

    move-result-wide v2

    double-to-float v2, v2

    mul-float v2, v2, p2

    move v3, v14

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v14

    double-to-float v14, v14

    mul-float v14, v14, p2

    invoke-direct {v4, v2, v14}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual/range {p1 .. p1}, Lcj/c;->endArray()V

    :goto_1
    move-object/from16 v3, v16

    goto :goto_0

    :pswitch_1
    const/4 v3, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->beginArray()V

    new-instance v2, Landroid/graphics/PointF;

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v14

    double-to-float v14, v14

    mul-float v14, v14, p2

    move v15, v3

    move-object/from16 v17, v4

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v3

    double-to-float v3, v3

    mul-float v3, v3, p2

    invoke-direct {v2, v14, v3}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual/range {p1 .. p1}, Lcj/c;->endArray()V

    move-object v3, v2

    :goto_2
    move-object/from16 v4, v17

    goto :goto_0

    :pswitch_2
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->h()Z

    move-result v12

    goto :goto_0

    :pswitch_3
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v2

    double-to-float v8, v2

    goto :goto_1

    :pswitch_4
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-static/range {p1 .. p1}, Lbj/o;->a(Lcj/c;)I

    move-result v11

    goto :goto_0

    :pswitch_5
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-static/range {p1 .. p1}, Lbj/o;->a(Lcj/c;)I

    move-result v10

    goto/16 :goto_0

    :pswitch_6
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v2

    double-to-float v7, v2

    goto :goto_1

    :pswitch_7
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v2

    double-to-float v6, v2

    goto :goto_1

    :pswitch_8
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextInt()I

    move-result v9

    goto/16 :goto_0

    :pswitch_9
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextInt()I

    move-result v2

    const/4 v3, 0x2

    if-gt v2, v3, :cond_1

    if-gez v2, :cond_0

    goto :goto_4

    :cond_0
    invoke-static {v15}, Le4/p;->f(I)[I

    move-result-object v3

    aget v13, v3, v2

    :goto_3
    move-object/from16 v3, v16

    goto :goto_2

    :cond_1
    :goto_4
    move v13, v15

    goto :goto_3

    :pswitch_a
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextDouble()D

    move-result-wide v2

    double-to-float v5, v2

    goto/16 :goto_1

    :pswitch_b
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextString()Ljava/lang/String;

    move-result-object v1

    goto/16 :goto_0

    :pswitch_c
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    const/4 v15, 0x3

    invoke-virtual/range {p1 .. p1}, Lcj/c;->nextString()Ljava/lang/String;

    move-result-object v0

    goto/16 :goto_0

    :cond_2
    move-object/from16 v16, v3

    move-object/from16 v17, v4

    invoke-virtual/range {p1 .. p1}, Lcj/c;->endObject()V

    new-instance v2, Lwi/b;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v0, v2, Lwi/b;->a:Ljava/lang/String;

    iput-object v1, v2, Lwi/b;->b:Ljava/lang/String;

    iput v5, v2, Lwi/b;->c:F

    iput v13, v2, Lwi/b;->d:I

    iput v9, v2, Lwi/b;->e:I

    iput v6, v2, Lwi/b;->f:F

    iput v7, v2, Lwi/b;->g:F

    iput v10, v2, Lwi/b;->h:I

    iput v11, v2, Lwi/b;->i:I

    iput v8, v2, Lwi/b;->j:F

    iput-boolean v12, v2, Lwi/b;->k:Z

    move-object/from16 v0, v16

    iput-object v0, v2, Lwi/b;->l:Landroid/graphics/PointF;

    iput-object v4, v2, Lwi/b;->m:Landroid/graphics/PointF;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
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
