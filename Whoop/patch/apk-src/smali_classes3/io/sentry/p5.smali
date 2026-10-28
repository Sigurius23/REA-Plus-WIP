.class public final Lio/sentry/p5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/v1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/p5;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;
    .locals 2

    const-string v0, "Missing required field \""

    const-string v1, "\""

    invoke-static {v0, p1, v1}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p0, v1, p1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lio/sentry/j3;Lio/sentry/v0;)Ljava/lang/Object;
    .locals 40

    move-object/from16 v0, p1

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    iget v3, v1, Lio/sentry/p5;->a:I

    const-string v5, "attributes"

    const-string v6, "value"

    const-string v7, "timestamp"

    const-string v8, "type"

    const-string v9, "span_id"

    const-string v10, "Missing required field \"trace_id\""

    const-string v11, "Missing required field \"timestamp\""

    const-string v12, "Missing required field \"type\""

    const/16 v16, 0x4

    const/16 v17, 0x3

    const/16 v18, -0x1

    const-string v13, "trace_id"

    const/16 v20, 0x0

    packed-switch v3, :pswitch_data_0

    invoke-interface {v0}, Lio/sentry/j3;->beginObject()V

    move-object/from16 v3, v20

    move-object/from16 v23, v3

    move-object/from16 v24, v23

    move-object/from16 v25, v24

    move-object/from16 v26, v25

    move-object/from16 v27, v26

    move-object/from16 v28, v27

    move-object/from16 v29, v28

    move-object/from16 v30, v29

    move-object/from16 v31, v30

    move-object/from16 v32, v31

    :goto_0
    invoke-interface {v0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    const-string v6, "public_key"

    if-ne v4, v5, :cond_b

    invoke-interface {v0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    :goto_1
    move/from16 v5, v18

    goto/16 :goto_2

    :sswitch_0
    const-string v5, "transaction"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    const/16 v5, 0x9

    goto/16 :goto_2

    :sswitch_1
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1

    goto :goto_1

    :cond_1
    const/16 v5, 0x8

    goto/16 :goto_2

    :sswitch_2
    const-string v5, "sampled"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2

    goto :goto_1

    :cond_2
    const/4 v5, 0x7

    goto :goto_2

    :sswitch_3
    invoke-virtual {v4, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_1

    :cond_3
    const/4 v5, 0x6

    goto :goto_2

    :sswitch_4
    const-string v5, "release"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    goto :goto_1

    :cond_4
    const/4 v5, 0x5

    goto :goto_2

    :sswitch_5
    const-string v5, "sample_rate"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    goto :goto_1

    :cond_5
    move/from16 v5, v16

    goto :goto_2

    :sswitch_6
    const-string v5, "sample_rand"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_1

    :cond_6
    move/from16 v5, v17

    goto :goto_2

    :sswitch_7
    const-string v5, "environment"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    goto :goto_1

    :cond_7
    const/4 v5, 0x2

    goto :goto_2

    :sswitch_8
    const-string v5, "user_id"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_8

    goto :goto_1

    :cond_8
    const/4 v5, 0x1

    goto :goto_2

    :sswitch_9
    const-string v5, "replay_id"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    goto :goto_1

    :cond_9
    const/4 v5, 0x0

    :goto_2
    packed-switch v5, :pswitch_data_1

    if-nez v3, :cond_a

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_a
    invoke-interface {v0, v2, v3, v4}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v28, v4

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {v0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v24, v4

    goto/16 :goto_0

    :pswitch_2
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v30, v4

    goto/16 :goto_0

    :pswitch_3
    new-instance v4, Lio/sentry/protocol/v;

    invoke-interface {v0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    move-object/from16 v23, v4

    goto/16 :goto_0

    :pswitch_4
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v25, v4

    goto/16 :goto_0

    :pswitch_5
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v29, v4

    goto/16 :goto_0

    :pswitch_6
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v32, v4

    goto/16 :goto_0

    :pswitch_7
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v26, v4

    goto/16 :goto_0

    :pswitch_8
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    move-object/from16 v27, v4

    goto/16 :goto_0

    :pswitch_9
    new-instance v4, Lio/sentry/protocol/v;

    invoke-interface {v0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v4, v5}, Lio/sentry/protocol/v;-><init>(Ljava/lang/String;)V

    move-object/from16 v31, v4

    goto/16 :goto_0

    :cond_b
    if-eqz v23, :cond_d

    if-eqz v24, :cond_c

    new-instance v22, Lio/sentry/k7;

    invoke-direct/range {v22 .. v32}, Lio/sentry/k7;-><init>(Lio/sentry/protocol/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/sentry/protocol/v;Ljava/lang/String;)V

    move-object/from16 v2, v22

    iput-object v3, v2, Lio/sentry/k7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Lio/sentry/j3;->endObject()V

    return-object v2

    :cond_c
    invoke-static {v2, v6}, Lio/sentry/p5;->b(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_d
    invoke-static {v2, v13}, Lio/sentry/p5;->b(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_a
    invoke-interface {v0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/r6;->valueOf(Ljava/lang/String;)Lio/sentry/r6;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-interface {v0}, Lio/sentry/j3;->beginObject()V

    move-object/from16 v3, v20

    move-object v4, v3

    move-object/from16 v33, v4

    move-object/from16 v34, v33

    move-object/from16 v35, v34

    move-object/from16 v36, v35

    move-object/from16 v37, v36

    move-object/from16 v38, v37

    move-object/from16 v39, v38

    :goto_3
    invoke-interface {v0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v15

    sget-object v14, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v15, v14, :cond_17

    invoke-interface {v0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_1

    :goto_4
    move/from16 v15, v18

    goto :goto_5

    :sswitch_a
    invoke-virtual {v14, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_e

    goto :goto_4

    :cond_e
    const/4 v15, 0x7

    goto :goto_5

    :sswitch_b
    invoke-virtual {v14, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_f

    goto :goto_4

    :cond_f
    const/4 v15, 0x6

    goto :goto_5

    :sswitch_c
    invoke-virtual {v14, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_10

    goto :goto_4

    :cond_10
    const/4 v15, 0x5

    goto :goto_5

    :sswitch_d
    invoke-virtual {v14, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_11

    goto :goto_4

    :cond_11
    move/from16 v15, v16

    goto :goto_5

    :sswitch_e
    const-string v15, "unit"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_12

    goto :goto_4

    :cond_12
    move/from16 v15, v17

    goto :goto_5

    :sswitch_f
    invoke-virtual {v14, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_13

    goto :goto_4

    :cond_13
    const/4 v15, 0x2

    goto :goto_5

    :sswitch_10
    const-string v15, "name"

    invoke-virtual {v14, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_14

    goto :goto_4

    :cond_14
    const/4 v15, 0x1

    goto :goto_5

    :sswitch_11
    invoke-virtual {v14, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_15

    goto :goto_4

    :cond_15
    const/4 v15, 0x0

    :goto_5
    packed-switch v15, :pswitch_data_2

    if-nez v4, :cond_16

    new-instance v4, Ljava/util/HashMap;

    invoke-direct {v4}, Ljava/util/HashMap;-><init>()V

    :cond_16
    invoke-interface {v0, v2, v4, v14}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_3

    :pswitch_c
    new-instance v3, Lio/sentry/clientreport/e;

    const/4 v14, 0x0

    invoke-direct {v3, v14}, Lio/sentry/clientreport/e;-><init>(Z)V

    invoke-interface {v0, v2, v3}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/v;

    goto/16 :goto_3

    :pswitch_d
    new-instance v14, Lio/sentry/p5;

    const/4 v15, 0x1

    invoke-direct {v14, v15}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v0, v2, v14}, Lio/sentry/j3;->y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;

    move-result-object v14

    move-object/from16 v37, v14

    goto/16 :goto_3

    :pswitch_e
    invoke-interface {v0}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v14

    move-object/from16 v36, v14

    goto/16 :goto_3

    :pswitch_f
    invoke-interface {v0}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v14

    move-object/from16 v33, v14

    goto/16 :goto_3

    :pswitch_10
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v39, v14

    goto/16 :goto_3

    :pswitch_11
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v34, v14

    goto/16 :goto_3

    :pswitch_12
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v35, v14

    goto/16 :goto_3

    :pswitch_13
    new-instance v14, Lio/sentry/d;

    const/16 v15, 0x12

    invoke-direct {v14, v15}, Lio/sentry/d;-><init>(I)V

    invoke-interface {v0, v2, v14}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lio/sentry/h7;

    move-object/from16 v38, v14

    goto/16 :goto_3

    :cond_17
    invoke-interface {v0}, Lio/sentry/j3;->endObject()V

    if-eqz v3, :cond_1c

    move-object/from16 v0, v33

    if-eqz v0, :cond_1b

    move-object/from16 v5, v34

    if-eqz v5, :cond_1a

    move-object/from16 v6, v35

    if-eqz v6, :cond_19

    move-object/from16 v7, v36

    if-eqz v7, :cond_18

    new-instance v2, Lio/sentry/v5;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v3, v2, Lio/sentry/v5;->w:Lio/sentry/protocol/v;

    iput-object v0, v2, Lio/sentry/v5;->y:Ljava/lang/Double;

    iput-object v6, v2, Lio/sentry/v5;->z:Ljava/lang/String;

    iput-object v5, v2, Lio/sentry/v5;->F:Ljava/lang/String;

    iput-object v7, v2, Lio/sentry/v5;->G:Ljava/lang/Double;

    move-object/from16 v0, v37

    iput-object v0, v2, Lio/sentry/v5;->H:Ljava/util/Map;

    move-object/from16 v0, v38

    iput-object v0, v2, Lio/sentry/v5;->x:Lio/sentry/h7;

    move-object/from16 v0, v39

    iput-object v0, v2, Lio/sentry/v5;->E:Ljava/lang/String;

    iput-object v4, v2, Lio/sentry/v5;->I:Ljava/util/HashMap;

    return-object v2

    :cond_18
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"value\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v3, "Missing required field \"name\""

    invoke-direct {v0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v4, v3, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v12, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1b
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v11}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v11, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v10}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v10, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_14
    invoke-interface {v0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/t5;->valueOf(Ljava/lang/String;)Lio/sentry/t5;

    move-result-object v0

    return-object v0

    :pswitch_15
    invoke-interface {v0}, Lio/sentry/j3;->beginObject()V

    move-object/from16 v3, v20

    move-object v4, v3

    move-object v5, v4

    :goto_6
    invoke-interface {v0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v7

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v7, v9, :cond_20

    invoke-interface {v0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1f

    invoke-virtual {v7, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1e

    if-nez v5, :cond_1d

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_1d
    invoke-interface {v0, v2, v5, v7}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_6

    :cond_1e
    invoke-interface {v0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v4

    goto :goto_6

    :cond_1f
    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_20
    invoke-interface {v0}, Lio/sentry/j3;->endObject()V

    if-eqz v3, :cond_22

    new-instance v0, Lio/sentry/r5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Lio/sentry/r5;->w:Ljava/lang/String;

    if-eqz v4, :cond_21

    const-string v2, "string"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/r5;->x:Ljava/lang/Object;

    goto :goto_7

    :cond_21
    iput-object v4, v0, Lio/sentry/r5;->x:Ljava/lang/Object;

    :goto_7
    iput-object v5, v0, Lio/sentry/r5;->y:Ljava/util/HashMap;

    return-object v0

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v12}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v12, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_16
    invoke-interface {v0}, Lio/sentry/j3;->beginObject()V

    move-object/from16 v19, v10

    move-object/from16 v1, v20

    move-object v3, v1

    move-object v4, v3

    move-object v6, v4

    move-object v8, v6

    move-object v12, v8

    move-object v14, v12

    move-object v15, v14

    :goto_8
    invoke-interface {v0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    move-object/from16 v20, v11

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v11, :cond_2b

    invoke-interface {v0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    sparse-switch v11, :sswitch_data_2

    :goto_9
    move/from16 v11, v18

    goto :goto_a

    :sswitch_12
    invoke-virtual {v10, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_23

    goto :goto_9

    :cond_23
    const/4 v11, 0x6

    goto :goto_a

    :sswitch_13
    invoke-virtual {v10, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_24

    goto :goto_9

    :cond_24
    const/4 v11, 0x5

    goto :goto_a

    :sswitch_14
    const-string v11, "level"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_25

    goto :goto_9

    :cond_25
    move/from16 v11, v16

    goto :goto_a

    :sswitch_15
    invoke-virtual {v10, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_26

    goto :goto_9

    :cond_26
    move/from16 v11, v17

    goto :goto_a

    :sswitch_16
    const-string v11, "body"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_27

    goto :goto_9

    :cond_27
    const/4 v11, 0x2

    goto :goto_a

    :sswitch_17
    const-string v11, "severity_number"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    goto :goto_9

    :cond_28
    const/4 v11, 0x1

    goto :goto_a

    :sswitch_18
    invoke-virtual {v10, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_29

    goto :goto_9

    :cond_29
    const/4 v11, 0x0

    :goto_a
    packed-switch v11, :pswitch_data_3

    if-nez v8, :cond_2a

    new-instance v8, Ljava/util/HashMap;

    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    :cond_2a
    invoke-interface {v0, v2, v8, v10}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/4 v10, 0x0

    :goto_b
    const/16 v11, 0x12

    const/16 v21, 0x2

    const/16 v23, 0x1

    goto :goto_d

    :pswitch_17
    new-instance v3, Lio/sentry/clientreport/e;

    const/4 v10, 0x0

    invoke-direct {v3, v10}, Lio/sentry/clientreport/e;-><init>(Z)V

    invoke-interface {v0, v2, v3}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/sentry/protocol/v;

    goto :goto_b

    :pswitch_18
    const/4 v10, 0x0

    new-instance v11, Lio/sentry/p5;

    const/4 v14, 0x1

    invoke-direct {v11, v14}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v0, v2, v11}, Lio/sentry/j3;->y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;

    move-result-object v11

    move/from16 v23, v14

    const/16 v21, 0x2

    move-object v14, v11

    :goto_c
    const/16 v11, 0x12

    goto :goto_d

    :pswitch_19
    const/4 v10, 0x0

    const/16 v23, 0x1

    new-instance v11, Lio/sentry/p5;

    const/4 v12, 0x2

    invoke-direct {v11, v12}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v0, v2, v11}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lio/sentry/t5;

    move/from16 v21, v12

    move-object v12, v11

    goto :goto_c

    :pswitch_1a
    const/4 v10, 0x0

    const/16 v21, 0x2

    const/16 v23, 0x1

    invoke-interface {v0}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v4

    goto :goto_c

    :pswitch_1b
    const/4 v10, 0x0

    const/16 v21, 0x2

    const/16 v23, 0x1

    invoke-interface {v0}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v6

    goto :goto_c

    :pswitch_1c
    const/4 v10, 0x0

    const/16 v21, 0x2

    const/16 v23, 0x1

    invoke-interface {v0}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v11

    move-object v15, v11

    goto :goto_c

    :pswitch_1d
    const/4 v10, 0x0

    const/16 v21, 0x2

    const/16 v23, 0x1

    new-instance v1, Lio/sentry/d;

    const/16 v11, 0x12

    invoke-direct {v1, v11}, Lio/sentry/d;-><init>(I)V

    invoke-interface {v0, v2, v1}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/sentry/h7;

    :goto_d
    move-object/from16 v11, v20

    goto/16 :goto_8

    :cond_2b
    invoke-interface {v0}, Lio/sentry/j3;->endObject()V

    if-eqz v3, :cond_2f

    if-eqz v4, :cond_2e

    if-eqz v6, :cond_2d

    if-eqz v12, :cond_2c

    new-instance v0, Lio/sentry/q5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v3, v0, Lio/sentry/q5;->w:Lio/sentry/protocol/v;

    iput-object v4, v0, Lio/sentry/q5;->y:Ljava/lang/Double;

    iput-object v6, v0, Lio/sentry/q5;->z:Ljava/lang/String;

    iput-object v12, v0, Lio/sentry/q5;->E:Lio/sentry/t5;

    iput-object v14, v0, Lio/sentry/q5;->G:Ljava/util/Map;

    iput-object v15, v0, Lio/sentry/q5;->F:Ljava/lang/Integer;

    iput-object v1, v0, Lio/sentry/q5;->x:Lio/sentry/h7;

    iput-object v8, v0, Lio/sentry/q5;->H:Ljava/util/HashMap;

    return-object v0

    :cond_2c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"level\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"body\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2e
    new-instance v0, Ljava/lang/IllegalStateException;

    move-object/from16 v1, v20

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2f
    new-instance v0, Ljava/lang/IllegalStateException;

    move-object/from16 v1, v19

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v3, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v2, v3, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x1b1b338d -> :sswitch_9
        -0x8c511f1 -> :sswitch_8
        -0x51ecded -> :sswitch_7
        0x921899a -> :sswitch_6
        0x9218a55 -> :sswitch_5
        0x41012807 -> :sswitch_4
        0x4bb73e55 -> :sswitch_3
        0x6f273ffa -> :sswitch_2
        0x71892389 -> :sswitch_1
        0x7fa0d2de -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
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

    :sswitch_data_1
    .sparse-switch
        -0x77ea41d0 -> :sswitch_11
        0x337a8b -> :sswitch_10
        0x368f3a -> :sswitch_f
        0x36d984 -> :sswitch_e
        0x3492916 -> :sswitch_d
        0x6ac9171 -> :sswitch_c
        0x182da957 -> :sswitch_b
        0x4bb73e55 -> :sswitch_a
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x77ea41d0 -> :sswitch_18
        -0x60432135 -> :sswitch_17
        0x2e39a2 -> :sswitch_16
        0x3492916 -> :sswitch_15
        0x6219b84 -> :sswitch_14
        0x182da957 -> :sswitch_13
        0x4bb73e55 -> :sswitch_12
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
    .end packed-switch
.end method
