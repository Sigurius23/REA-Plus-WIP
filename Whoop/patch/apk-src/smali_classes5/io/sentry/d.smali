.class public final Lio/sentry/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/sentry/v1;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/sentry/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/e7;
    .locals 13

    invoke-interface {p0}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    move-object v3, v2

    move-object v4, v3

    move-object v5, v4

    move-object v6, v5

    move-object v7, v6

    move-object v8, v7

    move-object v9, v8

    :goto_0
    invoke-interface {p0}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v11, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v11, :cond_a

    invoke-interface {p0}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v10}, Ljava/lang/String;->hashCode()I

    move-result v11

    const/4 v12, -0x1

    sparse-switch v11, :sswitch_data_0

    goto/16 :goto_1

    :sswitch_0
    const-string v11, "trace_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_0

    goto/16 :goto_1

    :cond_0
    const/16 v12, 0x8

    goto/16 :goto_1

    :sswitch_1
    const-string v11, "tags"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1

    goto :goto_1

    :cond_1
    const/4 v12, 0x7

    goto :goto_1

    :sswitch_2
    const-string v11, "data"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_2

    goto :goto_1

    :cond_2
    const/4 v12, 0x6

    goto :goto_1

    :sswitch_3
    const-string v11, "op"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    goto :goto_1

    :cond_3
    const/4 v12, 0x5

    goto :goto_1

    :sswitch_4
    const-string v11, "status"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_4

    goto :goto_1

    :cond_4
    const/4 v12, 0x4

    goto :goto_1

    :sswitch_5
    const-string v11, "origin"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    goto :goto_1

    :cond_5
    const/4 v12, 0x3

    goto :goto_1

    :sswitch_6
    const-string v11, "description"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    goto :goto_1

    :cond_6
    const/4 v12, 0x2

    goto :goto_1

    :sswitch_7
    const-string v11, "parent_span_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_7

    goto :goto_1

    :cond_7
    const/4 v12, 0x1

    goto :goto_1

    :sswitch_8
    const-string v11, "span_id"

    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    goto :goto_1

    :cond_8
    const/4 v12, 0x0

    :goto_1
    packed-switch v12, :pswitch_data_0

    if-nez v3, :cond_9

    new-instance v3, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v3}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_9
    invoke-interface {p0, p1, v3, v10}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_0

    :pswitch_0
    invoke-static {p0}, Lio/sentry/clientreport/e;->b(Lio/sentry/j3;)Lio/sentry/protocol/v;

    move-result-object v0

    goto/16 :goto_0

    :pswitch_1
    invoke-interface {p0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/Map;

    invoke-static {v8}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v8

    goto/16 :goto_0

    :pswitch_2
    invoke-interface {p0}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    goto/16 :goto_0

    :pswitch_3
    invoke-interface {p0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v2

    goto/16 :goto_0

    :pswitch_4
    new-instance v6, Lio/sentry/d;

    const/16 v10, 0x13

    invoke-direct {v6, v10}, Lio/sentry/d;-><init>(I)V

    invoke-interface {p0, p1, v6}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/i7;

    goto/16 :goto_0

    :pswitch_5
    invoke-interface {p0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v7

    goto/16 :goto_0

    :pswitch_6
    invoke-interface {p0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v5

    goto/16 :goto_0

    :pswitch_7
    new-instance v4, Lio/sentry/d;

    const/16 v10, 0x12

    invoke-direct {v4, v10}, Lio/sentry/d;-><init>(I)V

    invoke-interface {p0, p1, v4}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/h7;

    goto/16 :goto_0

    :pswitch_8
    new-instance v1, Lio/sentry/h7;

    invoke-interface {p0}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v10

    invoke-direct {v1, v10}, Lio/sentry/h7;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    :cond_a
    if-eqz v0, :cond_f

    if-eqz v1, :cond_e

    if-nez v2, :cond_b

    const-string v2, ""

    :cond_b
    new-instance p1, Lio/sentry/e7;

    invoke-direct {p1, v0, v1, v2, v4}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    iput-object v5, p1, Lio/sentry/e7;->F:Ljava/lang/String;

    iput-object v6, p1, Lio/sentry/e7;->G:Lio/sentry/i7;

    iput-object v7, p1, Lio/sentry/e7;->I:Ljava/lang/String;

    if-eqz v8, :cond_c

    iput-object v8, p1, Lio/sentry/e7;->H:Ljava/util/concurrent/ConcurrentHashMap;

    :cond_c
    if-eqz v9, :cond_d

    iput-object v9, p1, Lio/sentry/e7;->J:Ljava/util/Map;

    :cond_d
    iput-object v3, p1, Lio/sentry/e7;->K:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {p0}, Lio/sentry/j3;->endObject()V

    return-object p1

    :cond_e
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"span_id\""

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p1, v1, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :cond_f
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Missing required field \"trace_id\""

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {p1, v1, v0, p0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :sswitch_data_0
    .sparse-switch
        -0x77ea41d0 -> :sswitch_8
        -0x68c5dc65 -> :sswitch_7
        -0x66ca7c04 -> :sswitch_6
        -0x3c1e50da -> :sswitch_5
        -0x3532300e -> :sswitch_4
        0xde1 -> :sswitch_3
        0x2eefaa -> :sswitch_2
        0x363419 -> :sswitch_1
        0x4bb73e55 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
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

.method public static c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;
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
    .locals 49

    move-object/from16 v1, p1

    move-object/from16 v2, p0

    move-object/from16 v3, p2

    iget v0, v2, Lio/sentry/d;->a:I

    const-string v4, "event_id"

    const-string v5, "name"

    const-string v7, "platform"

    const-string v8, "release"

    const-string v9, "environment"

    const/16 v10, 0xb

    const-string v12, "type"

    const-string v15, "timestamp"

    const/16 v17, 0x6

    const/4 v11, 0x4

    const/16 v18, -0x1

    const/4 v6, 0x3

    const/4 v14, 0x0

    const/4 v13, 0x2

    packed-switch v0, :pswitch_data_0

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    :goto_0
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v11

    sget-object v12, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v11, v12, :cond_5

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    :goto_1
    move/from16 v12, v18

    goto :goto_2

    :sswitch_0
    invoke-virtual {v11, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_0

    goto :goto_1

    :cond_0
    move v12, v6

    goto :goto_2

    :sswitch_1
    const-string v12, "email"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1

    goto :goto_1

    :cond_1
    move v12, v13

    goto :goto_2

    :sswitch_2
    invoke-virtual {v11, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_2

    goto :goto_1

    :cond_2
    const/4 v12, 0x1

    goto :goto_2

    :sswitch_3
    const-string v12, "comments"

    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_3

    goto :goto_1

    :cond_3
    move v12, v14

    :goto_2
    packed-switch v12, :pswitch_data_1

    if-nez v10, :cond_4

    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    :cond_4
    invoke-interface {v1, v3, v10, v11}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_0

    :pswitch_0
    invoke-static {v1}, Lio/sentry/clientreport/e;->b(Lio/sentry/j3;)Lio/sentry/protocol/v;

    move-result-object v0

    goto :goto_0

    :pswitch_1
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v8

    goto :goto_0

    :pswitch_2
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v7

    goto :goto_0

    :pswitch_3
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v9

    goto :goto_0

    :cond_5
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    if-eqz v0, :cond_6

    new-instance v1, Lio/sentry/p7;

    invoke-direct {v1, v0, v7, v8, v9}, Lio/sentry/p7;-><init>(Lio/sentry/protocol/v;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v10, v1, Lio/sentry/p7;->E:Ljava/util/HashMap;

    return-object v1

    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"event_id\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v4, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v3, v4, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_4
    invoke-interface {v1}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/i7;->valueOf(Ljava/lang/String;)Lio/sentry/i7;

    move-result-object v0

    return-object v0

    :pswitch_5
    new-instance v0, Lio/sentry/h7;

    invoke-interface {v1}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/sentry/h7;-><init>(Ljava/lang/String;)V

    return-object v0

    :pswitch_6
    invoke-static/range {p1 .. p2}, Lio/sentry/d;->b(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/e7;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    move/from16 v23, v17

    const/4 v0, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x9

    const/16 v24, 0x0

    :goto_3
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v10

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v10, v2, :cond_1c

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_1

    :goto_4
    move/from16 v10, v18

    goto/16 :goto_5

    :sswitch_4
    const-string v10, "abnormal_mechanism"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    goto :goto_4

    :cond_7
    const/16 v10, 0xa

    goto/16 :goto_5

    :sswitch_5
    const-string v10, "attrs"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    goto :goto_4

    :cond_8
    move/from16 v10, v22

    goto/16 :goto_5

    :sswitch_6
    invoke-virtual {v2, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    goto :goto_4

    :cond_9
    const/16 v10, 0x8

    goto/16 :goto_5

    :sswitch_7
    const-string v10, "init"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    goto :goto_4

    :cond_a
    const/4 v10, 0x7

    goto :goto_5

    :sswitch_8
    const-string v10, "sid"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    goto :goto_4

    :cond_b
    move/from16 v10, v23

    goto :goto_5

    :sswitch_9
    const-string v10, "seq"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_c

    goto :goto_4

    :cond_c
    const/4 v10, 0x5

    goto :goto_5

    :sswitch_a
    const-string v10, "did"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_d

    goto :goto_4

    :cond_d
    const/4 v10, 0x4

    goto :goto_5

    :sswitch_b
    const-string v10, "status"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    goto :goto_4

    :cond_e
    const/4 v10, 0x3

    goto :goto_5

    :sswitch_c
    const-string v10, "errors"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    goto :goto_4

    :cond_f
    const/4 v10, 0x2

    goto :goto_5

    :sswitch_d
    const-string v10, "started"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_10

    goto :goto_4

    :cond_10
    const/4 v10, 0x1

    goto :goto_5

    :sswitch_e
    const-string v10, "duration"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_11

    goto :goto_4

    :cond_11
    const/4 v10, 0x0

    :goto_5
    packed-switch v10, :pswitch_data_2

    if-nez v0, :cond_12

    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_12
    invoke-interface {v1, v3, v0, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_8
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v17, v2

    goto/16 :goto_a

    :pswitch_9
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    :goto_6
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v10, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v10, :cond_17

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v10

    sparse-switch v10, :sswitch_data_2

    :goto_7
    move/from16 v2, v18

    goto :goto_8

    :sswitch_f
    const-string v10, "user_agent"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_7

    :cond_13
    const/4 v2, 0x3

    goto :goto_8

    :sswitch_10
    const-string v10, "ip_address"

    invoke-virtual {v2, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    goto :goto_7

    :cond_14
    const/4 v2, 0x2

    goto :goto_8

    :sswitch_11
    invoke-virtual {v2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    goto :goto_7

    :cond_15
    const/4 v2, 0x1

    goto :goto_8

    :sswitch_12
    invoke-virtual {v2, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    goto :goto_7

    :cond_16
    const/4 v2, 0x0

    :goto_8
    packed-switch v2, :pswitch_data_3

    invoke-interface {v1}, Lio/sentry/j3;->skipValue()V

    goto :goto_6

    :pswitch_a
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object v14, v2

    goto :goto_6

    :pswitch_b
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object v13, v2

    goto :goto_6

    :pswitch_c
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_6

    :pswitch_d
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_6

    :cond_17
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    goto/16 :goto_a

    :pswitch_e
    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v2

    move-object v6, v2

    goto/16 :goto_a

    :pswitch_f
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v2

    move-object v12, v2

    goto/16 :goto_a

    :pswitch_10
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v10

    move-object/from16 v28, v2

    const/16 v2, 0x24

    if-eq v10, v2, :cond_18

    invoke-virtual/range {v28 .. v28}, Ljava/lang/String;->length()I

    move-result v2

    const/16 v10, 0x20

    if-ne v2, v10, :cond_1a

    :cond_18
    move-object/from16 v24, v28

    goto :goto_a

    :cond_19
    move-object/from16 v28, v2

    :cond_1a
    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v10, "%s sid is not valid."

    move-object/from16 v29, v4

    filled-new-array/range {v28 .. v28}, [Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v2, v10, v4}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :pswitch_11
    move-object/from16 v29, v4

    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    move-object v11, v2

    goto :goto_a

    :pswitch_12
    move-object/from16 v29, v4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    move-object v7, v2

    goto :goto_a

    :pswitch_13
    move-object/from16 v29, v4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lio/sentry/util/m;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1b

    invoke-static {v2}, Lio/sentry/a7;->valueOf(Ljava/lang/String;)Lio/sentry/a7;

    move-result-object v2

    move-object v4, v2

    goto :goto_a

    :cond_1b
    :goto_9
    move-object/from16 v4, v29

    goto :goto_a

    :pswitch_14
    move-object/from16 v29, v4

    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_a

    :pswitch_15
    move-object/from16 v29, v4

    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v2

    move-object v5, v2

    goto :goto_a

    :pswitch_16
    move-object/from16 v29, v4

    invoke-interface {v1}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v19, v2

    :goto_a
    move-object/from16 v2, p0

    goto/16 :goto_3

    :cond_1c
    move-object/from16 v29, v4

    if-eqz v29, :cond_20

    if-eqz v5, :cond_1f

    if-eqz v20, :cond_1e

    if-eqz v16, :cond_1d

    new-instance v3, Lio/sentry/b7;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v2

    move-object v8, v7

    move-object v10, v12

    move-object/from16 v12, v19

    move-object/from16 v15, v21

    move-object/from16 v9, v24

    move-object/from16 v4, v29

    move v7, v2

    invoke-direct/range {v3 .. v17}, Lio/sentry/b7;-><init>(Lio/sentry/a7;Ljava/util/Date;Ljava/util/Date;ILjava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, v3, Lio/sentry/b7;->P:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v3

    :cond_1d
    invoke-static {v3, v8}, Lio/sentry/d;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_1e
    const-string v0, "errors"

    invoke-static {v3, v0}, Lio/sentry/d;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_1f
    const-string v0, "started"

    invoke-static {v3, v0}, Lio/sentry/d;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :cond_20
    const-string v0, "status"

    invoke-static {v3, v0}, Lio/sentry/d;->c(Lio/sentry/v0;Ljava/lang/String;)Ljava/lang/IllegalStateException;

    move-result-object v0

    throw v0

    :pswitch_17
    move/from16 v23, v17

    new-instance v0, Lio/sentry/s6;

    invoke-direct {v0}, Lio/sentry/s6;-><init>()V

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v20, 0x0

    :goto_b
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v11

    sget-object v13, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v11, v13, :cond_2c

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v11}, Ljava/lang/String;->hashCode()I

    move-result v13

    sparse-switch v13, :sswitch_data_3

    :goto_c
    move/from16 v13, v18

    goto/16 :goto_d

    :sswitch_13
    const-string v13, "segment_id"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_21

    goto :goto_c

    :cond_21
    const/16 v13, 0x8

    goto :goto_d

    :sswitch_14
    const-string v13, "replay_type"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_22

    goto :goto_c

    :cond_22
    const/4 v13, 0x7

    goto :goto_d

    :sswitch_15
    const-string v13, "trace_ids"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_23

    goto :goto_c

    :cond_23
    move/from16 v13, v23

    goto :goto_d

    :sswitch_16
    const-string v13, "error_ids"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_24

    goto :goto_c

    :cond_24
    const/4 v13, 0x5

    goto :goto_d

    :sswitch_17
    invoke-virtual {v11, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_25

    goto :goto_c

    :cond_25
    const/4 v13, 0x4

    goto :goto_d

    :sswitch_18
    const-string v13, "urls"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_26

    goto :goto_c

    :cond_26
    const/4 v13, 0x3

    goto :goto_d

    :sswitch_19
    invoke-virtual {v11, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_27

    goto :goto_c

    :cond_27
    const/4 v13, 0x2

    goto :goto_d

    :sswitch_1a
    const-string v13, "replay_start_timestamp"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_28

    goto :goto_c

    :cond_28
    const/4 v13, 0x1

    goto :goto_d

    :sswitch_1b
    const-string v13, "replay_id"

    invoke-virtual {v11, v13}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_29

    goto :goto_c

    :cond_29
    const/4 v13, 0x0

    :goto_d
    packed-switch v13, :pswitch_data_4

    invoke-static {v0, v11, v1, v3}, Lse/h;->A(Lio/sentry/r4;Ljava/lang/String;Lio/sentry/j3;Lio/sentry/v0;)Z

    move-result v13

    if-nez v13, :cond_2b

    if-nez v5, :cond_2a

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_2a
    invoke-interface {v1, v3, v5, v11}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :cond_2b
    :goto_e
    const/4 v11, 0x2

    goto/16 :goto_b

    :pswitch_18
    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v11

    move-object/from16 v20, v11

    goto :goto_e

    :pswitch_19
    new-instance v2, Lio/sentry/p5;

    const/4 v11, 0x4

    invoke-direct {v2, v11}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v1, v3, v2}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/r6;

    goto :goto_e

    :pswitch_1a
    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/List;

    goto :goto_e

    :pswitch_1b
    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/List;

    goto :goto_e

    :pswitch_1c
    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v4

    goto :goto_e

    :pswitch_1d
    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    goto :goto_e

    :pswitch_1e
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v11

    move-object v14, v11

    goto :goto_e

    :pswitch_1f
    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v7

    goto :goto_e

    :pswitch_20
    new-instance v6, Lio/sentry/clientreport/e;

    const/4 v11, 0x2

    invoke-direct {v6, v11}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v6}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/sentry/protocol/v;

    goto/16 :goto_b

    :cond_2c
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    if-eqz v14, :cond_2d

    iput-object v14, v0, Lio/sentry/s6;->Q:Ljava/lang/String;

    :cond_2d
    if-eqz v2, :cond_2e

    iput-object v2, v0, Lio/sentry/s6;->R:Lio/sentry/r6;

    :cond_2e
    if-eqz v20, :cond_2f

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Integer;->intValue()I

    move-result v1

    iput v1, v0, Lio/sentry/s6;->T:I

    :cond_2f
    if-eqz v4, :cond_30

    iput-object v4, v0, Lio/sentry/s6;->U:Ljava/util/Date;

    :cond_30
    iput-object v6, v0, Lio/sentry/s6;->S:Lio/sentry/protocol/v;

    iput-object v7, v0, Lio/sentry/s6;->V:Ljava/util/Date;

    iput-object v8, v0, Lio/sentry/s6;->W:Ljava/util/List;

    iput-object v9, v0, Lio/sentry/s6;->X:Ljava/util/List;

    iput-object v10, v0, Lio/sentry/s6;->Y:Ljava/util/List;

    iput-object v5, v0, Lio/sentry/s6;->Z:Ljava/util/HashMap;

    return-object v0

    :pswitch_21
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_f
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_33

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "items"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_32

    if-nez v0, :cond_31

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_31
    invoke-interface {v1, v3, v0, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/4 v6, 0x3

    goto :goto_f

    :cond_32
    new-instance v2, Lio/sentry/p5;

    const/4 v6, 0x3

    invoke-direct {v2, v6}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v1, v3, v2}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v14, v2

    goto :goto_f

    :cond_33
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    if-eqz v14, :cond_34

    new-instance v1, Lio/sentry/w5;

    invoke-direct {v1, v14}, Lio/sentry/w5;-><init>(Ljava/util/List;)V

    iput-object v0, v1, Lio/sentry/w5;->x:Ljava/util/HashMap;

    return-object v1

    :cond_34
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"items\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v3, v2, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_22
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    const/4 v14, 0x0

    :goto_10
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_37

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "items"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_36

    if-nez v0, :cond_35

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :cond_35
    invoke-interface {v1, v3, v0, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/4 v10, 0x0

    goto :goto_10

    :cond_36
    new-instance v2, Lio/sentry/p5;

    const/4 v10, 0x0

    invoke-direct {v2, v10}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v1, v3, v2}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v2

    move-object v14, v2

    goto :goto_10

    :cond_37
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    if-eqz v14, :cond_38

    new-instance v1, Lio/sentry/s5;

    invoke-direct {v1, v14}, Lio/sentry/s5;-><init>(Ljava/util/List;)V

    iput-object v0, v1, Lio/sentry/s5;->x:Ljava/util/HashMap;

    return-object v1

    :cond_38
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"items\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v3, v2, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_23
    move v11, v13

    move v10, v14

    new-instance v0, Lio/sentry/o5;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v14, 0x0

    :goto_11
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_3f

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_4

    :goto_12
    move/from16 v4, v18

    goto :goto_13

    :sswitch_1c
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_39

    goto :goto_12

    :cond_39
    const/4 v4, 0x4

    goto :goto_13

    :sswitch_1d
    const-string v4, "class_name"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3a

    goto :goto_12

    :cond_3a
    move v4, v6

    goto :goto_13

    :sswitch_1e
    const-string v4, "address"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3b

    goto :goto_12

    :cond_3b
    move v4, v11

    goto :goto_13

    :sswitch_1f
    const-string v4, "thread_id"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3c

    goto :goto_12

    :cond_3c
    const/4 v4, 0x1

    goto :goto_13

    :sswitch_20
    const-string v4, "package_name"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3d

    goto :goto_12

    :cond_3d
    move v4, v10

    :goto_13
    packed-switch v4, :pswitch_data_5

    if-nez v14, :cond_3e

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_3e
    invoke-interface {v1, v3, v14, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_11

    :pswitch_24
    invoke-interface {v1}, Lio/sentry/j3;->nextInt()I

    move-result v2

    iput v2, v0, Lio/sentry/o5;->w:I

    goto :goto_11

    :pswitch_25
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/o5;->z:Ljava/lang/String;

    goto :goto_11

    :pswitch_26
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/o5;->x:Ljava/lang/String;

    goto :goto_11

    :pswitch_27
    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/o5;->E:Ljava/lang/Long;

    goto :goto_11

    :pswitch_28
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v0, Lio/sentry/o5;->y:Ljava/lang/String;

    goto :goto_11

    :cond_3f
    iput-object v14, v0, Lio/sentry/o5;->F:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_29
    invoke-interface {v1}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/n5;->valueOf(Ljava/lang/String;)Lio/sentry/n5;

    move-result-object v0

    return-object v0

    :pswitch_2a
    invoke-interface {v1}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/m5;->valueOfLabel(Ljava/lang/String;)Lio/sentry/m5;

    move-result-object v0

    return-object v0

    :pswitch_2b
    move v0, v10

    move v11, v13

    move v10, v14

    move/from16 v23, v17

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v2, Lio/sentry/e5;

    invoke-direct {v2}, Lio/sentry/e5;-><init>()V

    const/4 v14, 0x0

    :cond_40
    :goto_14
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v5, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v5, :cond_4b

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v4}, Ljava/lang/String;->hashCode()I

    move-result v5

    sparse-switch v5, :sswitch_data_5

    :goto_15
    move/from16 v5, v18

    goto/16 :goto_16

    :sswitch_21
    const-string v5, "transaction"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_41

    goto :goto_15

    :cond_41
    const/16 v5, 0x8

    goto/16 :goto_16

    :sswitch_22
    const-string v5, "exception"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_42

    goto :goto_15

    :cond_42
    const/4 v5, 0x7

    goto :goto_16

    :sswitch_23
    const-string v5, "modules"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_43

    goto :goto_15

    :cond_43
    move/from16 v5, v23

    goto :goto_16

    :sswitch_24
    const-string v5, "message"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_44

    goto :goto_15

    :cond_44
    const/4 v5, 0x5

    goto :goto_16

    :sswitch_25
    const-string v5, "level"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_45

    goto :goto_15

    :cond_45
    const/4 v5, 0x4

    goto :goto_16

    :sswitch_26
    invoke-virtual {v4, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_46

    goto :goto_15

    :cond_46
    move v5, v6

    goto :goto_16

    :sswitch_27
    const-string v5, "logger"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_47

    goto :goto_15

    :cond_47
    move v5, v11

    goto :goto_16

    :sswitch_28
    const-string v5, "threads"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_48

    goto :goto_15

    :cond_48
    const/4 v5, 0x1

    goto :goto_16

    :sswitch_29
    const-string v5, "fingerprint"

    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_49

    goto :goto_15

    :cond_49
    move v5, v10

    :goto_16
    packed-switch v5, :pswitch_data_6

    invoke-static {v2, v4, v1, v3}, Lse/h;->A(Lio/sentry/r4;Ljava/lang/String;Lio/sentry/j3;Lio/sentry/v0;)Z

    move-result v5

    if-nez v5, :cond_40

    if-nez v14, :cond_4a

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_4a
    invoke-interface {v1, v3, v14, v4}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_14

    :pswitch_2c
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lio/sentry/e5;->V:Ljava/lang/String;

    goto/16 :goto_14

    :pswitch_2d
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    new-instance v4, Laa3/u0;

    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v7, 0x14

    invoke-direct {v5, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-direct {v4, v5}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v4, v2, Lio/sentry/e5;->T:Laa3/u0;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    goto/16 :goto_14

    :pswitch_2e
    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Map;

    invoke-static {v4}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v4

    iput-object v4, v2, Lio/sentry/e5;->Y:Ljava/util/AbstractMap;

    goto/16 :goto_14

    :pswitch_2f
    new-instance v4, Lio/sentry/clientreport/a;

    const/16 v5, 0xf

    invoke-direct {v4, v5}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v4}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/protocol/o;

    iput-object v4, v2, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    goto/16 :goto_14

    :pswitch_30
    new-instance v4, Lio/sentry/d;

    invoke-direct {v4, v0}, Lio/sentry/d;-><init>(I)V

    invoke-interface {v1, v3, v4}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/sentry/n5;

    iput-object v4, v2, Lio/sentry/e5;->U:Lio/sentry/n5;

    goto/16 :goto_14

    :pswitch_31
    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v4

    if-eqz v4, :cond_40

    iput-object v4, v2, Lio/sentry/e5;->P:Ljava/util/Date;

    goto/16 :goto_14

    :pswitch_32
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v4

    iput-object v4, v2, Lio/sentry/e5;->R:Ljava/lang/String;

    goto/16 :goto_14

    :pswitch_33
    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    new-instance v4, Laa3/u0;

    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v7, 0x1b

    invoke-direct {v5, v7}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v5

    invoke-direct {v4, v5}, Laa3/u0;-><init>(Ljava/util/List;)V

    iput-object v4, v2, Lio/sentry/e5;->S:Laa3/u0;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    goto/16 :goto_14

    :pswitch_34
    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    if-eqz v4, :cond_40

    iput-object v4, v2, Lio/sentry/e5;->W:Ljava/util/List;

    goto/16 :goto_14

    :cond_4b
    iput-object v14, v2, Lio/sentry/e5;->X:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v2

    :pswitch_35
    move v11, v13

    move v10, v14

    move/from16 v23, v17

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    move/from16 v30, v10

    const/4 v14, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    :goto_17
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v2, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v2, :cond_54

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v2

    sparse-switch v2, :sswitch_data_6

    :goto_18
    move/from16 v2, v18

    goto :goto_19

    :sswitch_2a
    invoke-virtual {v0, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4c

    goto :goto_18

    :cond_4c
    move/from16 v2, v23

    goto :goto_19

    :sswitch_2b
    const-string v2, "content_type"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4d

    goto :goto_18

    :cond_4d
    const/4 v2, 0x5

    goto :goto_19

    :sswitch_2c
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4e

    goto :goto_18

    :cond_4e
    const/4 v2, 0x4

    goto :goto_19

    :sswitch_2d
    const-string v2, "attachment_type"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4f

    goto :goto_18

    :cond_4f
    move v2, v6

    goto :goto_19

    :sswitch_2e
    const-string v2, "filename"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_50

    goto :goto_18

    :cond_50
    move v2, v11

    goto :goto_19

    :sswitch_2f
    const-string v2, "length"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_51

    goto :goto_18

    :cond_51
    const/4 v2, 0x1

    goto :goto_19

    :sswitch_30
    const-string v2, "item_count"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_52

    goto :goto_18

    :cond_52
    move v2, v10

    :goto_19
    packed-switch v2, :pswitch_data_7

    if-nez v14, :cond_53

    new-instance v14, Ljava/util/HashMap;

    invoke-direct {v14}, Ljava/util/HashMap;-><init>()V

    :cond_53
    invoke-interface {v1, v3, v14, v0}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :goto_1a
    const/16 v2, 0xa

    goto :goto_17

    :pswitch_36
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v34, v0

    goto :goto_1a

    :pswitch_37
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v31, v0

    goto :goto_1a

    :pswitch_38
    new-instance v0, Lio/sentry/d;

    const/16 v2, 0xa

    invoke-direct {v0, v2}, Lio/sentry/d;-><init>(I)V

    invoke-interface {v1, v3, v0}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/m5;

    move-object/from16 v29, v0

    goto/16 :goto_17

    :pswitch_39
    const/16 v2, 0xa

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v33, v0

    goto/16 :goto_17

    :pswitch_3a
    const/16 v2, 0xa

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v32, v0

    goto/16 :goto_17

    :pswitch_3b
    const/16 v2, 0xa

    invoke-interface {v1}, Lio/sentry/j3;->nextInt()I

    move-result v0

    move/from16 v30, v0

    goto/16 :goto_17

    :pswitch_3c
    const/16 v2, 0xa

    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v0

    move-object/from16 v35, v0

    goto/16 :goto_17

    :cond_54
    if-eqz v29, :cond_55

    new-instance v28, Lio/sentry/d5;

    invoke-direct/range {v28 .. v35}, Lio/sentry/d5;-><init>(Lio/sentry/m5;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v0, v28

    iput-object v14, v0, Lio/sentry/d5;->I:Ljava/util/HashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :cond_55
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Missing required field \"type\""

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object v2, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-interface {v3, v2, v1, v0}, Lio/sentry/v0;->j(Lio/sentry/n5;Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_3d
    move v11, v13

    move v10, v14

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v0, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v14, 0x0

    :goto_1b
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v8

    sget-object v9, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v8, v9, :cond_5b

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v9

    sparse-switch v9, :sswitch_data_7

    :goto_1c
    move/from16 v9, v18

    goto :goto_1d

    :sswitch_31
    const-string v9, "sent_at"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_56

    goto :goto_1c

    :cond_56
    move v9, v6

    goto :goto_1d

    :sswitch_32
    invoke-virtual {v8, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_57

    goto :goto_1c

    :cond_57
    move v9, v11

    goto :goto_1d

    :sswitch_33
    const-string v9, "trace"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_58

    goto :goto_1c

    :cond_58
    const/4 v9, 0x1

    goto :goto_1d

    :sswitch_34
    const-string v9, "sdk"

    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_59

    goto :goto_1c

    :cond_59
    move v9, v10

    :goto_1d
    packed-switch v9, :pswitch_data_8

    if-nez v7, :cond_5a

    new-instance v7, Ljava/util/HashMap;

    invoke-direct {v7}, Ljava/util/HashMap;-><init>()V

    :cond_5a
    invoke-interface {v1, v3, v7, v8}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :goto_1e
    const/4 v13, 0x5

    goto :goto_1b

    :pswitch_3e
    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v5

    goto :goto_1e

    :pswitch_3f
    new-instance v8, Lio/sentry/clientreport/e;

    invoke-direct {v8, v11}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v8}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/sentry/protocol/v;

    move-object v14, v8

    goto :goto_1e

    :pswitch_40
    new-instance v2, Lio/sentry/p5;

    const/4 v13, 0x5

    invoke-direct {v2, v13}, Lio/sentry/p5;-><init>(I)V

    invoke-interface {v1, v3, v2}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/k7;

    goto :goto_1b

    :pswitch_41
    const/4 v13, 0x5

    new-instance v0, Lio/sentry/clientreport/a;

    const/16 v8, 0x13

    invoke-direct {v0, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v0}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/sentry/protocol/t;

    goto :goto_1b

    :cond_5b
    new-instance v3, Lio/sentry/w4;

    invoke-direct {v3, v14, v0, v2}, Lio/sentry/w4;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/t;Lio/sentry/k7;)V

    iput-object v5, v3, Lio/sentry/w4;->z:Ljava/util/Date;

    iput-object v7, v3, Lio/sentry/w4;->E:Ljava/util/HashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v3

    :pswitch_42
    move v0, v10

    move v11, v13

    move v10, v14

    move/from16 v23, v17

    const/16 v2, 0xa

    const/4 v13, 0x5

    const/16 v22, 0x9

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v4, Lio/sentry/p4;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-boolean v10, v4, Lio/sentry/p4;->y:Z

    const/4 v5, 0x0

    iput-object v5, v4, Lio/sentry/p4;->z:Ljava/lang/Double;

    iput-boolean v10, v4, Lio/sentry/p4;->w:Z

    iput-object v5, v4, Lio/sentry/p4;->x:Ljava/lang/Double;

    iput-boolean v10, v4, Lio/sentry/p4;->I:Z

    iput-object v5, v4, Lio/sentry/p4;->E:Ljava/lang/String;

    iput-boolean v10, v4, Lio/sentry/p4;->F:Z

    iput-boolean v10, v4, Lio/sentry/p4;->G:Z

    sget-object v5, Lio/sentry/r3;->MANUAL:Lio/sentry/r3;

    iput-object v5, v4, Lio/sentry/p4;->L:Lio/sentry/r3;

    iput v10, v4, Lio/sentry/p4;->H:I

    const/4 v5, 0x1

    iput-boolean v5, v4, Lio/sentry/p4;->J:Z

    iput-boolean v10, v4, Lio/sentry/p4;->K:Z

    const/4 v14, 0x0

    :cond_5c
    :goto_1f
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v7, :cond_6a

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v7

    sparse-switch v7, :sswitch_data_8

    :goto_20
    move/from16 v7, v18

    goto/16 :goto_21

    :sswitch_35
    const-string v7, "profile_sample_rate"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5d

    goto :goto_20

    :cond_5d
    move v7, v0

    goto/16 :goto_21

    :sswitch_36
    const-string v7, "trace_sample_rate"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5e

    goto :goto_20

    :cond_5e
    move v7, v2

    goto/16 :goto_21

    :sswitch_37
    const-string v7, "profiling_traces_hz"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_5f

    goto :goto_20

    :cond_5f
    move/from16 v7, v22

    goto/16 :goto_21

    :sswitch_38
    const-string v7, "continuous_profile_sampled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_60

    goto :goto_20

    :cond_60
    const/16 v7, 0x8

    goto/16 :goto_21

    :sswitch_39
    const-string v7, "profile_lifecycle"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_61

    goto :goto_20

    :cond_61
    const/4 v7, 0x7

    goto :goto_21

    :sswitch_3a
    const-string v7, "profile_sampled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_62

    goto :goto_20

    :cond_62
    move/from16 v7, v23

    goto :goto_21

    :sswitch_3b
    const-string v7, "is_start_profiler_on_app_start"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_63

    goto :goto_20

    :cond_63
    move v7, v13

    goto :goto_21

    :sswitch_3c
    const-string v7, "is_profiling_enabled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_64

    goto :goto_20

    :cond_64
    const/4 v7, 0x4

    goto :goto_21

    :sswitch_3d
    const-string v7, "is_continuous_profiling_enabled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_65

    goto :goto_20

    :cond_65
    move v7, v6

    goto :goto_21

    :sswitch_3e
    const-string v7, "profiling_traces_dir_path"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_66

    goto :goto_20

    :cond_66
    move v7, v11

    goto :goto_21

    :sswitch_3f
    const-string v7, "trace_sampled"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_67

    goto/16 :goto_20

    :cond_67
    const/4 v7, 0x1

    goto :goto_21

    :sswitch_40
    const-string v7, "is_enable_app_start_profiling"

    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_68

    goto/16 :goto_20

    :cond_68
    move v7, v10

    :goto_21
    packed-switch v7, :pswitch_data_9

    if-nez v14, :cond_69

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_69
    invoke-interface {v1, v3, v14, v5}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto/16 :goto_1f

    :pswitch_43
    invoke-interface {v1}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_5c

    iput-object v5, v4, Lio/sentry/p4;->x:Ljava/lang/Double;

    goto/16 :goto_1f

    :pswitch_44
    invoke-interface {v1}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_5c

    iput-object v5, v4, Lio/sentry/p4;->z:Ljava/lang/Double;

    goto/16 :goto_1f

    :pswitch_45
    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iput v5, v4, Lio/sentry/p4;->H:I

    goto/16 :goto_1f

    :pswitch_46
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->I:Z

    goto/16 :goto_1f

    :pswitch_47
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5c

    :try_start_0
    invoke-static {v5}, Lio/sentry/r3;->valueOf(Ljava/lang/String;)Lio/sentry/r3;

    move-result-object v7

    iput-object v7, v4, Lio/sentry/p4;->L:Lio/sentry/r3;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1f

    :catch_0
    sget-object v7, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v8, "Error when deserializing ProfileLifecycle: "

    invoke-virtual {v8, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    new-array v8, v10, [Ljava/lang/Object;

    invoke-interface {v3, v7, v5, v8}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_1f

    :pswitch_48
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->w:Z

    goto/16 :goto_1f

    :pswitch_49
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->K:Z

    goto/16 :goto_1f

    :pswitch_4a
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->F:Z

    goto/16 :goto_1f

    :pswitch_4b
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->G:Z

    goto/16 :goto_1f

    :pswitch_4c
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_5c

    iput-object v5, v4, Lio/sentry/p4;->E:Ljava/lang/String;

    goto/16 :goto_1f

    :pswitch_4d
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->y:Z

    goto/16 :goto_1f

    :pswitch_4e
    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_5c

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/p4;->J:Z

    goto/16 :goto_1f

    :cond_6a
    iput-object v14, v4, Lio/sentry/p4;->M:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v4

    :pswitch_4f
    move v11, v13

    move v10, v14

    new-instance v0, Lio/sentry/x3;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    const/4 v2, 0x0

    const/4 v5, 0x0

    :goto_22
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v4

    sget-object v7, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v4, v7, :cond_6d

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "segment_id"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6c

    if-nez v5, :cond_6b

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    :cond_6b
    invoke-interface {v1, v3, v5, v4}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_22

    :cond_6c
    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v2

    goto :goto_22

    :cond_6d
    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    const/4 v4, 0x1

    invoke-interface {v1, v4}, Lio/sentry/j3;->setLenient(Z)V

    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v1, v10}, Lio/sentry/j3;->setLenient(Z)V

    if-eqz v4, :cond_7a

    new-instance v14, Ljava/util/ArrayList;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v14, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_23
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v7, v4, Ljava/util/Map;

    if-eqz v7, :cond_79

    check-cast v4, Ljava/util/Map;

    new-instance v7, Lio/sentry/util/g;

    invoke-direct {v7, v4}, Lio/sentry/util/g;-><init>(Ljava/util/Map;)V

    invoke-interface {v4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_24
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_79

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    invoke-virtual {v13, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_78

    invoke-static {}, Lio/sentry/rrweb/c;->values()[Lio/sentry/rrweb/c;

    move-result-object v13

    check-cast v9, Ljava/lang/Integer;

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    aget-object v9, v13, v9

    sget-object v13, Lio/sentry/w3;->b:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    aget v13, v13, v15

    const-string v15, "data"

    const/4 v10, 0x1

    if-eq v13, v10, :cond_74

    if-eq v13, v11, :cond_73

    const-string v10, "Unsupported rrweb event type %s"

    if-eq v13, v6, :cond_6e

    sget-object v13, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v13, v10, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto/16 :goto_27

    :cond_6e
    invoke-interface {v4, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map;

    if-nez v13, :cond_6f

    sget-object v13, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_6f
    const-string v15, "tag"

    invoke-interface {v13, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    if-eqz v13, :cond_78

    invoke-virtual {v13}, Ljava/lang/String;->hashCode()I

    move-result v15

    sparse-switch v15, :sswitch_data_9

    :goto_25
    move/from16 v13, v18

    goto :goto_26

    :sswitch_41
    const-string v15, "breadcrumb"

    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_70

    goto :goto_25

    :cond_70
    move v13, v11

    goto :goto_26

    :sswitch_42
    const-string v15, "video"

    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_71

    goto :goto_25

    :cond_71
    const/4 v13, 0x1

    goto :goto_26

    :sswitch_43
    const-string v15, "performanceSpan"

    invoke-virtual {v13, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_72

    goto :goto_25

    :cond_72
    const/4 v13, 0x0

    :goto_26
    packed-switch v13, :pswitch_data_a

    sget-object v13, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v13, v10, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_27

    :pswitch_50
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->b(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/a;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :pswitch_51
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->g(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/m;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :pswitch_52
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->f(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/l;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_73
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->e(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/j;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_74
    invoke-interface {v4, v15}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map;

    if-nez v9, :cond_75

    sget-object v9, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    :cond_75
    const-string v10, "source"

    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    if-eqz v9, :cond_78

    invoke-static {}, Lio/sentry/rrweb/d;->values()[Lio/sentry/rrweb/d;

    move-result-object v10

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    aget-object v9, v10, v9

    sget-object v10, Lio/sentry/w3;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v13

    aget v10, v10, v13

    const/4 v13, 0x1

    if-eq v10, v13, :cond_77

    if-eq v10, v11, :cond_76

    sget-object v10, Lio/sentry/n5;->DEBUG:Lio/sentry/n5;

    const-string v13, "Unsupported rrweb incremental snapshot type %s"

    filled-new-array {v9}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v3, v10, v13, v9}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_27

    :cond_76
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->d(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/i;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_27

    :cond_77
    invoke-static {v7, v3}, Lio/sentry/protocol/i0;->c(Lio/sentry/j3;Lio/sentry/v0;)Lio/sentry/rrweb/g;

    move-result-object v9

    invoke-virtual {v14, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_78
    :goto_27
    const/4 v10, 0x0

    goto/16 :goto_24

    :cond_79
    const/4 v10, 0x0

    goto/16 :goto_23

    :cond_7a
    const/4 v14, 0x0

    :cond_7b
    iput-object v2, v0, Lio/sentry/x3;->w:Ljava/lang/Integer;

    iput-object v14, v0, Lio/sentry/x3;->x:Ljava/util/List;

    iput-object v5, v0, Lio/sentry/x3;->y:Ljava/util/HashMap;

    return-object v0

    :pswitch_53
    move v11, v13

    move/from16 v23, v17

    const/4 v13, 0x5

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/t3;

    const-wide/16 v7, 0x0

    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    sget-object v4, Lio/sentry/g3;->a:Lio/sentry/g3;

    invoke-direct {v0, v4, v2, v2}, Lio/sentry/t3;-><init>(Lio/sentry/n1;Ljava/lang/Long;Ljava/lang/Long;)V

    const/4 v14, 0x0

    :cond_7c
    :goto_28
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_85

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v4

    sparse-switch v4, :sswitch_data_a

    :goto_29
    move/from16 v4, v18

    goto :goto_2a

    :sswitch_44
    const-string v4, "relative_cpu_start_ms"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7d

    goto :goto_29

    :cond_7d
    move/from16 v4, v23

    goto :goto_2a

    :sswitch_45
    const-string v4, "relative_cpu_end_ms"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7e

    goto :goto_29

    :cond_7e
    move v4, v13

    goto :goto_2a

    :sswitch_46
    const-string v4, "trace_id"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_7f

    goto :goto_29

    :cond_7f
    const/4 v4, 0x4

    goto :goto_2a

    :sswitch_47
    invoke-virtual {v2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_80

    goto :goto_29

    :cond_80
    move v4, v6

    goto :goto_2a

    :sswitch_48
    const-string v4, "id"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_81

    goto :goto_29

    :cond_81
    move v4, v11

    goto :goto_2a

    :sswitch_49
    const-string v4, "relative_end_ns"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_82

    goto :goto_29

    :cond_82
    const/4 v4, 0x1

    goto :goto_2a

    :sswitch_4a
    const-string v4, "relative_start_ns"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_83

    goto :goto_29

    :cond_83
    const/4 v4, 0x0

    :goto_2a
    packed-switch v4, :pswitch_data_b

    if-nez v14, :cond_84

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_84
    invoke-interface {v1, v3, v14, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_28

    :pswitch_54
    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->F:Ljava/lang/Long;

    goto :goto_28

    :pswitch_55
    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->G:Ljava/lang/Long;

    goto/16 :goto_28

    :pswitch_56
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->x:Ljava/lang/String;

    goto/16 :goto_28

    :pswitch_57
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->y:Ljava/lang/String;

    goto/16 :goto_28

    :pswitch_58
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->w:Ljava/lang/String;

    goto/16 :goto_28

    :pswitch_59
    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->E:Ljava/lang/Long;

    goto/16 :goto_28

    :pswitch_5a
    invoke-interface {v1}, Lio/sentry/j3;->s0()Ljava/lang/Long;

    move-result-object v2

    if-eqz v2, :cond_7c

    iput-object v2, v0, Lio/sentry/t3;->z:Ljava/lang/Long;

    goto/16 :goto_28

    :cond_85
    iput-object v14, v0, Lio/sentry/t3;->H:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_5b
    move v0, v10

    move v11, v13

    move/from16 v23, v17

    const/16 v2, 0xa

    const/4 v13, 0x5

    const/16 v22, 0x9

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v28, Lio/sentry/s3;

    new-instance v4, Ljava/io/File;

    const-string v5, "dummy"

    invoke-direct {v4, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v30

    new-instance v31, Ljava/util/ArrayList;

    invoke-direct/range {v31 .. v31}, Ljava/util/ArrayList;-><init>()V

    sget-object v5, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-virtual {v5}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v33

    new-instance v8, Lio/sentry/e7;

    sget-object v10, Lio/sentry/h7;->x:Lio/sentry/h7;

    const-string v12, "op"

    const/4 v14, 0x0

    invoke-direct {v8, v5, v10, v12, v14}, Lio/sentry/e7;-><init>(Lio/sentry/protocol/v;Lio/sentry/h7;Ljava/lang/String;Lio/sentry/h7;)V

    iget-object v5, v8, Lio/sentry/e7;->w:Lio/sentry/protocol/v;

    invoke-virtual {v5}, Lio/sentry/protocol/v;->toString()Ljava/lang/String;

    move-result-object v34

    new-instance v5, Lio/sentry/h0;

    invoke-direct {v5, v11}, Lio/sentry/h0;-><init>(I)V

    new-instance v48, Ljava/util/HashMap;

    invoke-direct/range {v48 .. v48}, Ljava/util/HashMap;-><init>()V

    const-string v32, ""

    const-string v35, "0"

    const/16 v36, 0x0

    const-string v37, ""

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const-string v47, "normal"

    move-object/from16 v29, v4

    move-object/from16 v38, v5

    invoke-direct/range {v28 .. v48}, Lio/sentry/s3;-><init>(Ljava/io/File;Ljava/util/Date;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/util/concurrent/Callable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    move-object/from16 v4, v28

    :cond_86
    :goto_2b
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v8, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v8, :cond_a2

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_b

    :goto_2c
    move/from16 v8, v18

    goto/16 :goto_2d

    :sswitch_4b
    const-string v8, "transactions"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_87

    goto :goto_2c

    :cond_87
    const/16 v8, 0x19

    goto/16 :goto_2d

    :sswitch_4c
    const-string v8, "sampled_profile"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_88

    goto :goto_2c

    :cond_88
    const/16 v8, 0x18

    goto/16 :goto_2d

    :sswitch_4d
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_89

    goto :goto_2c

    :cond_89
    const/16 v8, 0x17

    goto/16 :goto_2d

    :sswitch_4e
    const-string v8, "trace_id"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8a

    goto :goto_2c

    :cond_8a
    const/16 v8, 0x16

    goto/16 :goto_2d

    :sswitch_4f
    const-string v8, "truncation_reason"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8b

    goto :goto_2c

    :cond_8b
    const/16 v8, 0x15

    goto/16 :goto_2d

    :sswitch_50
    const-string v8, "device_os_version"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8c

    goto :goto_2c

    :cond_8c
    const/16 v8, 0x14

    goto/16 :goto_2d

    :sswitch_51
    const-string v8, "transaction_id"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8d

    goto :goto_2c

    :cond_8d
    const/16 v8, 0x13

    goto/16 :goto_2d

    :sswitch_52
    const-string v8, "architecture"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8e

    goto :goto_2c

    :cond_8e
    const/16 v8, 0x12

    goto/16 :goto_2d

    :sswitch_53
    const-string v8, "device_os_name"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8f

    goto :goto_2c

    :cond_8f
    const/16 v8, 0x11

    goto/16 :goto_2d

    :sswitch_54
    const-string v8, "transaction_name"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_90

    goto :goto_2c

    :cond_90
    const/16 v8, 0x10

    goto/16 :goto_2d

    :sswitch_55
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_91

    goto/16 :goto_2c

    :cond_91
    const/16 v8, 0xf

    goto/16 :goto_2d

    :sswitch_56
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_92

    goto/16 :goto_2c

    :cond_92
    const/16 v8, 0xe

    goto/16 :goto_2d

    :sswitch_57
    const-string v8, "version_name"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_93

    goto/16 :goto_2c

    :cond_93
    const/16 v8, 0xd

    goto/16 :goto_2d

    :sswitch_58
    const-string v8, "version_code"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_94

    goto/16 :goto_2c

    :cond_94
    const/16 v8, 0xc

    goto/16 :goto_2d

    :sswitch_59
    const-string v8, "device_cpu_frequencies"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_95

    goto/16 :goto_2c

    :cond_95
    move v8, v0

    goto/16 :goto_2d

    :sswitch_5a
    const-string v8, "device_physical_memory_bytes"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_96

    goto/16 :goto_2c

    :cond_96
    move v8, v2

    goto/16 :goto_2d

    :sswitch_5b
    const-string v8, "measurements"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_97

    goto/16 :goto_2c

    :cond_97
    move/from16 v8, v22

    goto/16 :goto_2d

    :sswitch_5c
    const-string v8, "duration_ns"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_98

    goto/16 :goto_2c

    :cond_98
    const/16 v8, 0x8

    goto/16 :goto_2d

    :sswitch_5d
    const-string v8, "device_is_emulator"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_99

    goto/16 :goto_2c

    :cond_99
    const/4 v8, 0x7

    goto :goto_2d

    :sswitch_5e
    const-string v8, "device_model"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9a

    goto/16 :goto_2c

    :cond_9a
    move/from16 v8, v23

    goto :goto_2d

    :sswitch_5f
    const-string v8, "device_os_build_number"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9b

    goto/16 :goto_2c

    :cond_9b
    move v8, v13

    goto :goto_2d

    :sswitch_60
    const-string v8, "profile_id"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9c

    goto/16 :goto_2c

    :cond_9c
    const/4 v8, 0x4

    goto :goto_2d

    :sswitch_61
    const-string v8, "device_locale"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9d

    goto/16 :goto_2c

    :cond_9d
    move v8, v6

    goto :goto_2d

    :sswitch_62
    const-string v8, "build_id"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9e

    goto/16 :goto_2c

    :cond_9e
    move v8, v11

    goto :goto_2d

    :sswitch_63
    const-string v8, "android_api_level"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_9f

    goto/16 :goto_2c

    :cond_9f
    const/4 v8, 0x1

    goto :goto_2d

    :sswitch_64
    const-string v8, "device_manufacturer"

    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a0

    goto/16 :goto_2c

    :cond_a0
    const/4 v8, 0x0

    :goto_2d
    packed-switch v8, :pswitch_data_c

    if-nez v14, :cond_a1

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_a1
    invoke-interface {v1, v3, v14, v5}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    const/4 v10, 0x4

    goto/16 :goto_2b

    :pswitch_5c
    new-instance v5, Lio/sentry/d;

    const/4 v10, 0x4

    invoke-direct {v5, v10}, Lio/sentry/d;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->c1(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/ArrayList;

    move-result-object v5

    if-eqz v5, :cond_86

    iget-object v8, v4, Lio/sentry/s3;->P:Ljava/util/ArrayList;

    invoke-virtual {v8, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    goto/16 :goto_2b

    :pswitch_5d
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->b0:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_5e
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->N:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_5f
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->V:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_60
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->Y:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_61
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->I:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_62
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->U:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_63
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->K:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_64
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->H:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_65
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->Q:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_66
    const/4 v10, 0x4

    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->Z:Ljava/util/Date;

    goto/16 :goto_2b

    :pswitch_67
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->X:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_68
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->T:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_69
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->S:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_6a
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->L:Ljava/util/List;

    goto/16 :goto_2b

    :pswitch_6b
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->M:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_6c
    const/4 v10, 0x4

    new-instance v5, Lio/sentry/clientreport/a;

    const/4 v8, 0x1

    invoke-direct {v5, v8}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;

    move-result-object v5

    if-eqz v5, :cond_86

    iget-object v8, v4, Lio/sentry/s3;->a0:Ljava/util/Map;

    invoke-interface {v8, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto/16 :goto_2b

    :pswitch_6d
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->R:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_6e
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->W()Ljava/lang/Boolean;

    move-result-object v5

    if-eqz v5, :cond_86

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    iput-boolean v5, v4, Lio/sentry/s3;->J:Z

    goto/16 :goto_2b

    :pswitch_6f
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->F:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_70
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->G:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_71
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->W:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_72
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->z:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_73
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->O:Ljava/lang/String;

    goto/16 :goto_2b

    :pswitch_74
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->q0()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_86

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iput v5, v4, Lio/sentry/s3;->y:I

    goto/16 :goto_2b

    :pswitch_75
    const/4 v10, 0x4

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_86

    iput-object v5, v4, Lio/sentry/s3;->E:Ljava/lang/String;

    goto/16 :goto_2b

    :cond_a2
    iput-object v14, v4, Lio/sentry/s3;->c0:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v4

    :pswitch_76
    move v11, v13

    const/4 v14, 0x0

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v0, Lio/sentry/q3;

    sget-object v2, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    invoke-direct {v0, v2}, Lio/sentry/q3;-><init>(Lio/sentry/protocol/v;)V

    :cond_a3
    :goto_2e
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v2

    sget-object v4, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v2, v4, :cond_a6

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v4, "profiler_id"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a5

    if-nez v14, :cond_a4

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_a4
    invoke-interface {v1, v3, v14, v2}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    goto :goto_2e

    :cond_a5
    new-instance v2, Lio/sentry/clientreport/e;

    invoke-direct {v2, v11}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v2}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/protocol/v;

    if-eqz v2, :cond_a3

    iput-object v2, v0, Lio/sentry/q3;->w:Lio/sentry/protocol/v;

    goto :goto_2e

    :cond_a6
    iput-object v14, v0, Lio/sentry/q3;->x:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v0

    :pswitch_77
    move v0, v10

    move v10, v11

    move v11, v13

    move/from16 v23, v17

    const/16 v2, 0xa

    const/4 v13, 0x5

    const/4 v14, 0x0

    const/16 v22, 0x9

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    new-instance v26, Lio/sentry/p3;

    sget-object v27, Lio/sentry/protocol/v;->x:Lio/sentry/protocol/v;

    new-instance v30, Ljava/util/HashMap;

    invoke-direct/range {v30 .. v30}, Ljava/util/HashMap;-><init>()V

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v31

    const-string v32, "android"

    invoke-static {}, Lio/sentry/q6;->empty()Lio/sentry/q6;

    move-result-object v33

    const/16 v29, 0x0

    move-object/from16 v28, v27

    invoke-direct/range {v26 .. v33}, Lio/sentry/p3;-><init>(Lio/sentry/protocol/v;Lio/sentry/protocol/v;Ljava/io/File;Ljava/util/AbstractMap;Ljava/lang/Double;Ljava/lang/String;Lio/sentry/q6;)V

    move-object/from16 v4, v26

    :goto_2f
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v5

    sget-object v12, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v5, v12, :cond_b8

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v5}, Ljava/lang/String;->hashCode()I

    move-result v12

    sparse-switch v12, :sswitch_data_c

    :goto_30
    move/from16 v25, v18

    goto/16 :goto_31

    :sswitch_65
    const-string v12, "chunk_id"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a7

    goto :goto_30

    :cond_a7
    move/from16 v25, v0

    goto/16 :goto_31

    :sswitch_66
    const-string v12, "sampled_profile"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a8

    goto :goto_30

    :cond_a8
    move/from16 v25, v2

    goto/16 :goto_31

    :sswitch_67
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a9

    goto :goto_30

    :cond_a9
    move/from16 v25, v22

    goto/16 :goto_31

    :sswitch_68
    const-string v12, "client_sdk"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_aa

    goto :goto_30

    :cond_aa
    const/16 v25, 0x8

    goto/16 :goto_31

    :sswitch_69
    invoke-virtual {v5, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_ab

    goto :goto_30

    :cond_ab
    const/16 v25, 0x7

    goto :goto_31

    :sswitch_6a
    const-string v12, "version"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_ac

    goto :goto_30

    :cond_ac
    move/from16 v25, v23

    goto :goto_31

    :sswitch_6b
    const-string v12, "profiler_id"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_ad

    goto :goto_30

    :cond_ad
    move/from16 v25, v13

    goto :goto_31

    :sswitch_6c
    invoke-virtual {v5, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_ae

    goto :goto_30

    :cond_ae
    move/from16 v25, v10

    goto :goto_31

    :sswitch_6d
    invoke-virtual {v5, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_af

    goto :goto_30

    :cond_af
    move/from16 v25, v6

    goto :goto_31

    :sswitch_6e
    const-string v12, "profile"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b0

    goto :goto_30

    :cond_b0
    move/from16 v25, v11

    goto :goto_31

    :sswitch_6f
    const-string v12, "measurements"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b1

    goto/16 :goto_30

    :cond_b1
    const/16 v25, 0x1

    goto :goto_31

    :sswitch_70
    const-string v12, "debug_meta"

    invoke-virtual {v5, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b2

    goto/16 :goto_30

    :cond_b2
    const/16 v25, 0x0

    :goto_31
    packed-switch v25, :pswitch_data_d

    if-nez v14, :cond_b3

    new-instance v14, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v14}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_b3
    invoke-interface {v1, v3, v14, v5}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :cond_b4
    :goto_32
    const/4 v10, 0x1

    const/4 v11, 0x7

    const/16 v12, 0x13

    goto/16 :goto_35

    :pswitch_78
    new-instance v5, Lio/sentry/clientreport/e;

    invoke-direct {v5, v11}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/v;

    if-eqz v5, :cond_b4

    iput-object v5, v4, Lio/sentry/p3;->y:Lio/sentry/protocol/v;

    goto :goto_32

    :pswitch_79
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b4

    iput-object v5, v4, Lio/sentry/p3;->L:Ljava/lang/String;

    goto :goto_32

    :pswitch_7a
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b4

    iput-object v5, v4, Lio/sentry/p3;->F:Ljava/lang/String;

    goto :goto_32

    :pswitch_7b
    new-instance v5, Lio/sentry/clientreport/a;

    const/16 v12, 0x13

    invoke-direct {v5, v12}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/t;

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->z:Lio/sentry/protocol/t;

    :cond_b5
    :goto_33
    const/4 v10, 0x1

    :cond_b6
    :goto_34
    const/4 v11, 0x7

    goto/16 :goto_35

    :pswitch_7c
    const/16 v12, 0x13

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->G:Ljava/lang/String;

    goto :goto_33

    :pswitch_7d
    const/16 v12, 0x13

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->I:Ljava/lang/String;

    goto :goto_33

    :pswitch_7e
    const/16 v12, 0x13

    new-instance v5, Lio/sentry/clientreport/e;

    invoke-direct {v5, v11}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/v;

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->x:Lio/sentry/protocol/v;

    goto :goto_33

    :pswitch_7f
    const/16 v12, 0x13

    invoke-interface {v1}, Lio/sentry/j3;->R()Ljava/lang/Double;

    move-result-object v5

    if-eqz v5, :cond_b5

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v10

    iput-wide v10, v4, Lio/sentry/p3;->J:D

    goto :goto_33

    :pswitch_80
    const/16 v12, 0x13

    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->H:Ljava/lang/String;

    goto :goto_33

    :pswitch_81
    const/16 v12, 0x13

    new-instance v5, Lio/sentry/clientreport/e;

    invoke-direct {v5, v6}, Lio/sentry/clientreport/e;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/profiling/a;

    if-eqz v5, :cond_b5

    iput-object v5, v4, Lio/sentry/p3;->M:Lio/sentry/protocol/profiling/a;

    goto :goto_33

    :pswitch_82
    const/16 v12, 0x13

    new-instance v5, Lio/sentry/clientreport/a;

    const/4 v10, 0x1

    invoke-direct {v5, v10}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->y0(Lio/sentry/v0;Lio/sentry/v1;)Ljava/util/HashMap;

    move-result-object v5

    if-eqz v5, :cond_b6

    iget-object v11, v4, Lio/sentry/p3;->E:Ljava/util/Map;

    invoke-interface {v11, v5}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    goto :goto_34

    :pswitch_83
    const/4 v10, 0x1

    const/16 v12, 0x13

    new-instance v5, Lio/sentry/clientreport/a;

    const/4 v11, 0x7

    invoke-direct {v5, v11}, Lio/sentry/clientreport/a;-><init>(I)V

    invoke-interface {v1, v3, v5}, Lio/sentry/j3;->Z(Lio/sentry/v0;Lio/sentry/v1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/sentry/protocol/d;

    if-eqz v5, :cond_b7

    iput-object v5, v4, Lio/sentry/p3;->w:Lio/sentry/protocol/d;

    :cond_b7
    :goto_35
    const/4 v10, 0x4

    const/4 v11, 0x2

    goto/16 :goto_2f

    :cond_b8
    iput-object v14, v4, Lio/sentry/p3;->N:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1}, Lio/sentry/j3;->endObject()V

    return-object v4

    :pswitch_84
    move/from16 v23, v17

    const/4 v10, 0x1

    const/4 v13, 0x5

    const/4 v14, 0x0

    invoke-interface {v1}, Lio/sentry/j3;->beginObject()V

    invoke-static {}, Ljc/x;->O()Ljava/util/Date;

    move-result-object v0

    new-instance v2, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    move-object v4, v2

    move-object v5, v14

    move-object v7, v5

    move-object v8, v7

    move-object v9, v8

    move-object v11, v9

    move-object v2, v0

    :goto_36
    invoke-interface {v1}, Lio/sentry/j3;->peek()Lio/sentry/vendor/gson/stream/b;

    move-result-object v0

    sget-object v6, Lio/sentry/vendor/gson/stream/b;->NAME:Lio/sentry/vendor/gson/stream/b;

    if-ne v0, v6, :cond_c2

    invoke-interface {v1}, Lio/sentry/j3;->nextName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v6

    sparse-switch v6, :sswitch_data_d

    :goto_37
    move/from16 v6, v18

    goto :goto_38

    :sswitch_71
    const-string v6, "message"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b9

    goto :goto_37

    :cond_b9
    move/from16 v6, v23

    goto :goto_38

    :sswitch_72
    const-string v6, "level"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_ba

    goto :goto_37

    :cond_ba
    move v6, v13

    goto :goto_38

    :sswitch_73
    invoke-virtual {v0, v15}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_bb

    goto :goto_37

    :cond_bb
    const/4 v6, 0x4

    goto :goto_38

    :sswitch_74
    const-string v6, "category"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_bc

    goto :goto_37

    :cond_bc
    const/4 v6, 0x3

    goto :goto_38

    :sswitch_75
    invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_bd

    goto :goto_37

    :cond_bd
    const/4 v6, 0x2

    goto :goto_38

    :sswitch_76
    const-string v6, "data"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_be

    goto :goto_37

    :cond_be
    move v6, v10

    goto :goto_38

    :sswitch_77
    const-string v6, "origin"

    invoke-virtual {v0, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_bf

    goto :goto_37

    :cond_bf
    const/4 v6, 0x0

    :goto_38
    packed-switch v6, :pswitch_data_e

    if-nez v11, :cond_c0

    new-instance v11, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v11}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    :cond_c0
    invoke-interface {v1, v3, v11, v0}, Lio/sentry/j3;->I(Lio/sentry/v0;Ljava/util/AbstractMap;Ljava/lang/String;)V

    :goto_39
    const/4 v13, 0x0

    goto :goto_3a

    :pswitch_85
    invoke-interface {v1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object v14, v0

    goto :goto_39

    :pswitch_86
    :try_start_1
    invoke-interface {v1}, Lio/sentry/j3;->nextString()Ljava/lang/String;

    move-result-object v0

    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/n5;->valueOf(Ljava/lang/String;)Lio/sentry/n5;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object v9, v0

    goto :goto_39

    :catch_1
    move-exception v0

    sget-object v6, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v10, "Error when deserializing SentryLevel"

    const/4 v13, 0x0

    new-array v1, v13, [Ljava/lang/Object;

    invoke-interface {v3, v6, v0, v10, v1}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3a

    :pswitch_87
    const/4 v13, 0x0

    invoke-interface/range {p1 .. p2}, Lio/sentry/j3;->U(Lio/sentry/v0;)Ljava/util/Date;

    move-result-object v0

    if-eqz v0, :cond_c1

    move-object v2, v0

    goto :goto_3a

    :pswitch_88
    const/4 v13, 0x0

    invoke-interface/range {p1 .. p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object v7, v0

    goto :goto_3a

    :pswitch_89
    const/4 v13, 0x0

    invoke-interface/range {p1 .. p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object v5, v0

    goto :goto_3a

    :pswitch_8a
    const/4 v13, 0x0

    invoke-interface/range {p1 .. p1}, Lio/sentry/j3;->U0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    invoke-static {v0}, Ldt/b;->B(Ljava/util/Map;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object v0

    if-eqz v0, :cond_c1

    move-object v4, v0

    goto :goto_3a

    :pswitch_8b
    const/4 v13, 0x0

    invoke-interface/range {p1 .. p1}, Lio/sentry/j3;->w0()Ljava/lang/String;

    move-result-object v0

    move-object v8, v0

    :cond_c1
    :goto_3a
    move-object/from16 v1, p1

    const/4 v6, 0x3

    const/4 v10, 0x1

    const/4 v13, 0x5

    goto/16 :goto_36

    :cond_c2
    new-instance v0, Lio/sentry/e;

    invoke-direct {v0, v2}, Lio/sentry/e;-><init>(Ljava/util/Date;)V

    iput-object v14, v0, Lio/sentry/e;->z:Ljava/lang/String;

    iput-object v5, v0, Lio/sentry/e;->E:Ljava/lang/String;

    iput-object v4, v0, Lio/sentry/e;->F:Ljava/util/concurrent/ConcurrentHashMap;

    iput-object v7, v0, Lio/sentry/e;->G:Ljava/lang/String;

    iput-object v8, v0, Lio/sentry/e;->H:Ljava/lang/String;

    iput-object v9, v0, Lio/sentry/e;->I:Lio/sentry/n5;

    iput-object v11, v0, Lio/sentry/e;->J:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface/range {p1 .. p1}, Lio/sentry/j3;->endObject()V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_84
        :pswitch_77
        :pswitch_76
        :pswitch_5b
        :pswitch_53
        :pswitch_4f
        :pswitch_42
        :pswitch_3d
        :pswitch_35
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_17
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        -0x23e8220c -> :sswitch_3
        0x337a8b -> :sswitch_2
        0x5c24b9c -> :sswitch_1
        0x1093c0e0 -> :sswitch_0
    .end sparse-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        -0x76bbb26c -> :sswitch_e
        -0x7114bf7f -> :sswitch_d
        -0x4d2a9095 -> :sswitch_c
        -0x3532300e -> :sswitch_b
        0x1847f -> :sswitch_a
        0x1bc5f -> :sswitch_9
        0x1bcce -> :sswitch_8
        0x316510 -> :sswitch_7
        0x3492916 -> :sswitch_6
        0x58d64a2 -> :sswitch_5
        0xcbd1022 -> :sswitch_4
    .end sparse-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_9
        :pswitch_8
    .end packed-switch

    :sswitch_data_2
    .sparse-switch
        -0x51ecded -> :sswitch_12
        0x41012807 -> :sswitch_11
        0x583738dc -> :sswitch_10
        0x724f4d91 -> :sswitch_f
    .end sparse-switch

    :pswitch_data_3
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :sswitch_data_3
    .sparse-switch
        -0x1b1b338d -> :sswitch_1b
        -0xfbcbadf -> :sswitch_1a
        0x368f3a -> :sswitch_19
        0x36e8e4 -> :sswitch_18
        0x3492916 -> :sswitch_17
        0x13a95401 -> :sswitch_16
        0x2b308cbe -> :sswitch_15
        0x3ee8d892 -> :sswitch_14
        0x403ba1a7 -> :sswitch_13
    .end sparse-switch

    :pswitch_data_4
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
    .end packed-switch

    :sswitch_data_4
    .sparse-switch
        -0x6fe3451c -> :sswitch_20
        -0x5d1dd090 -> :sswitch_1f
        -0x4468640c -> :sswitch_1e
        -0x11504b0e -> :sswitch_1d
        0x368f3a -> :sswitch_1c
    .end sparse-switch

    :pswitch_data_5
    .packed-switch 0x0
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
    .end packed-switch

    :sswitch_data_5
    .sparse-switch
        -0x5203171c -> :sswitch_29
        -0x4fbf4c57 -> :sswitch_28
        -0x41680a70 -> :sswitch_27
        0x3492916 -> :sswitch_26
        0x6219b84 -> :sswitch_25
        0x38eb0007 -> :sswitch_24
        0x49292787 -> :sswitch_23
        0x584fd04f -> :sswitch_22
        0x7fa0d2de -> :sswitch_21
    .end sparse-switch

    :pswitch_data_6
    .packed-switch 0x0
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
    .end packed-switch

    :sswitch_data_6
    .sparse-switch
        -0x753cab1d -> :sswitch_30
        -0x41f1c51a -> :sswitch_2f
        -0x2bcbadf9 -> :sswitch_2e
        -0x281cd32a -> :sswitch_2d
        0x368f3a -> :sswitch_2c
        0x3194f740 -> :sswitch_2b
        0x6fbd6873 -> :sswitch_2a
    .end sparse-switch

    :pswitch_data_7
    .packed-switch 0x0
        :pswitch_3c
        :pswitch_3b
        :pswitch_3a
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
    .end packed-switch

    :sswitch_data_7
    .sparse-switch
        0x1bc3a -> :sswitch_34
        0x697f145 -> :sswitch_33
        0x1093c0e0 -> :sswitch_32
        0x760a5a3a -> :sswitch_31
    .end sparse-switch

    :pswitch_data_8
    .packed-switch 0x0
        :pswitch_41
        :pswitch_40
        :pswitch_3f
        :pswitch_3e
    .end packed-switch

    :sswitch_data_8
    .sparse-switch
        -0x2fc0721c -> :sswitch_40
        -0x21c03d00 -> :sswitch_3f
        -0x1ad38c31 -> :sswitch_3e
        -0x1a0bb613 -> :sswitch_3d
        -0x6f7b3ad -> :sswitch_3c
        -0x63526b8 -> :sswitch_3b
        -0x426489c -> :sswitch_3a
        0x17ed2c54 -> :sswitch_39
        0x5381e234 -> :sswitch_38
        0x5e67e24a -> :sswitch_37
        0x62951a5b -> :sswitch_36
        0x7f963cbf -> :sswitch_35
    .end sparse-switch

    :pswitch_data_9
    .packed-switch 0x0
        :pswitch_4e
        :pswitch_4d
        :pswitch_4c
        :pswitch_4b
        :pswitch_4a
        :pswitch_49
        :pswitch_48
        :pswitch_47
        :pswitch_46
        :pswitch_45
        :pswitch_44
        :pswitch_43
    .end packed-switch

    :sswitch_data_9
    .sparse-switch
        -0xd791c66 -> :sswitch_43
        0x6b0147b -> :sswitch_42
        0x41f73003 -> :sswitch_41
    .end sparse-switch

    :pswitch_data_a
    .packed-switch 0x0
        :pswitch_52
        :pswitch_51
        :pswitch_50
    .end packed-switch

    :sswitch_data_a
    .sparse-switch
        -0x6b2a92b -> :sswitch_4a
        -0x50b0384 -> :sswitch_49
        0xd1b -> :sswitch_48
        0x337a8b -> :sswitch_47
        0x4bb73e55 -> :sswitch_46
        0x5d612954 -> :sswitch_45
        0x716221ed -> :sswitch_44
    .end sparse-switch

    :pswitch_data_b
    .packed-switch 0x0
        :pswitch_5a
        :pswitch_59
        :pswitch_58
        :pswitch_57
        :pswitch_56
        :pswitch_55
        :pswitch_54
    .end packed-switch

    :sswitch_data_b
    .sparse-switch
        -0x7f2b14e6 -> :sswitch_64
        -0x761ad0b1 -> :sswitch_63
        -0x55461374 -> :sswitch_62
        -0x45ddbf9d -> :sswitch_61
        -0x41b8e48f -> :sswitch_60
        -0x2ab74f34 -> :sswitch_5f
        -0x233b1c00 -> :sswitch_5e
        -0x1e8c4ddf -> :sswitch_5d
        -0x1c7eb3b0 -> :sswitch_5c
        -0x159763c9 -> :sswitch_5b
        -0x13d06b14 -> :sswitch_5a
        -0xca6e506 -> :sswitch_59
        -0x6236f0c -> :sswitch_58
        -0x61ea26e -> :sswitch_57
        -0x51ecded -> :sswitch_56
        0x3492916 -> :sswitch_55
        0x1e547b4c -> :sswitch_54
        0x2f79431d -> :sswitch_53
        0x320c6953 -> :sswitch_52
        0x3c3c4a1c -> :sswitch_51
        0x3ebcb306 -> :sswitch_50
        0x4560227a -> :sswitch_4f
        0x4bb73e55 -> :sswitch_4e
        0x6fbd6873 -> :sswitch_4d
        0x746ad664 -> :sswitch_4c
        0x74798955 -> :sswitch_4b
    .end sparse-switch

    :pswitch_data_c
    .packed-switch 0x0
        :pswitch_75
        :pswitch_74
        :pswitch_73
        :pswitch_72
        :pswitch_71
        :pswitch_70
        :pswitch_6f
        :pswitch_6e
        :pswitch_6d
        :pswitch_6c
        :pswitch_6b
        :pswitch_6a
        :pswitch_69
        :pswitch_68
        :pswitch_67
        :pswitch_66
        :pswitch_65
        :pswitch_64
        :pswitch_63
        :pswitch_62
        :pswitch_61
        :pswitch_60
        :pswitch_5f
        :pswitch_5e
        :pswitch_5d
        :pswitch_5c
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        -0x6db2cb8f -> :sswitch_70
        -0x159763c9 -> :sswitch_6f
        -0x12717657 -> :sswitch_6e
        -0x51ecded -> :sswitch_6d
        0x3492916 -> :sswitch_6c
        0xaa4d131 -> :sswitch_6b
        0x14f51cd8 -> :sswitch_6a
        0x41012807 -> :sswitch_69
        0x41bb01c6 -> :sswitch_68
        0x6fbd6873 -> :sswitch_67
        0x746ad664 -> :sswitch_66
        0x77839c2d -> :sswitch_65
    .end sparse-switch

    :pswitch_data_d
    .packed-switch 0x0
        :pswitch_83
        :pswitch_82
        :pswitch_81
        :pswitch_80
        :pswitch_7f
        :pswitch_7e
        :pswitch_7d
        :pswitch_7c
        :pswitch_7b
        :pswitch_7a
        :pswitch_79
        :pswitch_78
    .end packed-switch

    :sswitch_data_d
    .sparse-switch
        -0x3c1e50da -> :sswitch_77
        0x2eefaa -> :sswitch_76
        0x368f3a -> :sswitch_75
        0x302bcfe -> :sswitch_74
        0x3492916 -> :sswitch_73
        0x6219b84 -> :sswitch_72
        0x38eb0007 -> :sswitch_71
    .end sparse-switch

    :pswitch_data_e
    .packed-switch 0x0
        :pswitch_8b
        :pswitch_8a
        :pswitch_89
        :pswitch_88
        :pswitch_87
        :pswitch_86
        :pswitch_85
    .end packed-switch
.end method
