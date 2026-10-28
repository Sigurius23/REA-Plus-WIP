.class public final Lhc3/x;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;I)V
    .locals 0

    iput p2, p0, Lhc3/x;->a:I

    iput-object p1, p0, Lhc3/x;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Lio/sentry/c;Ljava/util/List;)Lhc3/x;
    .locals 23

    move-object/from16 v1, p0

    const-string v2, "%20"

    const-string v3, "\\+"

    const-string v4, "UTF-8"

    iget-object v11, v1, Lio/sentry/c;->h:Lio/sentry/v0;

    move-object/from16 v0, p1

    check-cast v0, Ljava/util/List;

    invoke-static {v0}, Lio/sentry/util/m;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "UTF-8"

    const-string v0, ","

    new-instance v7, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v7}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    if-eqz v5, :cond_8

    const/4 v12, -0x1

    :try_start_0
    invoke-virtual {v5, v0, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v12

    array-length v13, v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_9

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_0
    if-ge v14, v13, :cond_7

    :try_start_1
    aget-object v10, v12, v14

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    const-string v9, "sentry-"

    invoke-virtual {v0, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_8

    if-eqz v0, :cond_5

    :try_start_2
    const-string v0, "="

    invoke-virtual {v10, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/4 v9, 0x0

    :try_start_3
    invoke-virtual {v10, v9, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v19
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_6

    :try_start_4
    invoke-virtual/range {v19 .. v19}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v9

    move/from16 v19, v0

    invoke-static {v9, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    move-object/from16 v20, v5

    add-int/lit8 v5, v19, 0x1

    :try_start_5
    invoke-virtual {v10, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    move-object/from16 v19, v6

    :try_start_6
    const-string v6, "sentry-sample_rate"

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move/from16 v21, v6

    const-string v6, "sentry-sample_rand"

    if-eqz v21, :cond_1

    if-eqz v5, :cond_0

    :try_start_7
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    const/4 v5, 0x0

    invoke-static {v0, v5}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/NumberFormatException; {:try_start_7 .. :try_end_7} :catch_0
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    move-object/from16 v16, v0

    goto :goto_2

    :goto_1
    const/16 v18, 0x0

    goto :goto_8

    :catch_0
    :cond_0
    const/16 v16, 0x0

    :goto_2
    const/16 v18, 0x0

    goto :goto_6

    :cond_1
    :try_start_8
    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v21
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_3

    if-eqz v21, :cond_4

    if-eqz v5, :cond_2

    :try_start_9
    invoke-static {v5}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v21

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/NumberFormatException; {:try_start_9 .. :try_end_9} :catch_1
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    const/4 v5, 0x0

    :try_start_a
    invoke-static {v0, v5}, Lts/o;->C(Ljava/lang/Double;Z)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static/range {v21 .. v22}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/NumberFormatException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-object/from16 v17, v0

    goto :goto_5

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_1
    :cond_2
    const/4 v5, 0x0

    goto :goto_4

    :catchall_1
    move-exception v0

    const/4 v5, 0x0

    :goto_3
    move/from16 v18, v5

    goto :goto_8

    :catch_2
    :cond_3
    :goto_4
    const/16 v17, 0x0

    :goto_5
    move/from16 v18, v5

    goto :goto_6

    :cond_4
    const/16 v18, 0x0

    :try_start_b
    invoke-virtual {v7, v0, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_6
    invoke-virtual {v6, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_2

    if-nez v0, :cond_6

    const/4 v15, 0x1

    goto :goto_a

    :catchall_2
    move-exception v0

    goto :goto_8

    :catchall_3
    move-exception v0

    goto :goto_1

    :catchall_4
    move-exception v0

    :goto_7
    move-object/from16 v19, v6

    goto :goto_1

    :catchall_5
    move-exception v0

    move-object/from16 v20, v5

    goto :goto_7

    :catchall_6
    move-exception v0

    move-object/from16 v20, v5

    move-object/from16 v19, v6

    move/from16 v18, v9

    :goto_8
    :try_start_c
    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Unable to decode baggage key value pair %s"

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v9

    invoke-interface {v11, v5, v0, v6, v9}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_a

    :catchall_7
    move-exception v0

    :goto_9
    move v9, v15

    goto :goto_b

    :cond_5
    move-object/from16 v20, v5

    move-object/from16 v19, v6

    const/16 v18, 0x0

    invoke-virtual {v10}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_7

    :cond_6
    :goto_a
    add-int/lit8 v14, v14, 0x1

    move-object/from16 v6, v19

    move-object/from16 v5, v20

    goto/16 :goto_0

    :catchall_8
    move-exception v0

    move-object/from16 v20, v5

    goto :goto_9

    :cond_7
    move v10, v15

    goto :goto_c

    :catchall_9
    move-exception v0

    move-object/from16 v20, v5

    const/16 v18, 0x0

    move/from16 v9, v18

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_b
    sget-object v5, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v6, "Unable to decode baggage header %s"

    filled-new-array/range {v20 .. v20}, [Ljava/lang/Object;

    move-result-object v10

    invoke-interface {v11, v5, v0, v6, v10}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    move v10, v9

    goto :goto_c

    :cond_8
    const/16 v18, 0x0

    move/from16 v10, v18

    const/16 v16, 0x0

    const/16 v17, 0x0

    :goto_c
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_9

    const/4 v9, 0x0

    goto :goto_d

    :cond_9
    invoke-static {v8}, Lio/sentry/util/m;->b(Ljava/util/List;)Ljava/lang/String;

    move-result-object v0

    move-object v9, v0

    :goto_d
    new-instance v5, Lio/sentry/c;

    move-object v6, v7

    move-object/from16 v7, v16

    move-object/from16 v8, v17

    invoke-direct/range {v5 .. v11}, Lio/sentry/c;-><init>(Ljava/util/concurrent/ConcurrentHashMap;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;ZLio/sentry/v0;)V

    iget-object v6, v1, Lio/sentry/c;->a:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v7, v1, Lio/sentry/c;->h:Lio/sentry/v0;

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, ","

    iget-object v0, v5, Lio/sentry/c;->e:Ljava/lang/String;

    const/4 v5, 0x0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_c

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move v10, v5

    :goto_e
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v11

    if-ge v5, v11, :cond_b

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v11

    const/16 v12, 0x2c

    if-ne v11, v12, :cond_a

    add-int/lit8 v10, v10, 0x1

    :cond_a
    add-int/lit8 v5, v5, 0x1

    goto :goto_e

    :cond_b
    add-int/lit8 v5, v10, 0x1

    move-object v0, v9

    goto :goto_f

    :cond_c
    const-string v0, ""

    :goto_f
    iget-object v10, v1, Lio/sentry/c;->b:Lio/sentry/util/a;

    invoke-virtual {v10}, Lio/sentry/util/a;->a()Lio/sentry/s;

    move-result-object v10

    :try_start_d
    new-instance v11, Ljava/util/TreeSet;

    invoke-virtual {v6}, Ljava/util/concurrent/ConcurrentHashMap;->keys()Ljava/util/Enumeration;

    move-result-object v12

    invoke-static {v12}, Ljava/util/Collections;->list(Ljava/util/Enumeration;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_c

    invoke-virtual {v10}, Lio/sentry/s;->close()V

    const-string v10, "sentry-sample_rate"

    invoke-virtual {v11, v10}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    const-string v12, "sentry-sample_rand"

    invoke-virtual {v11, v12}, Ljava/util/TreeSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {v11}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;

    move-result-object v11

    move v13, v5

    move-object v5, v0

    :goto_10
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, v1, Lio/sentry/c;->c:Ljava/lang/Double;

    invoke-static {v0}, Lio/sentry/c;->b(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    :goto_11
    move-object v15, v0

    goto :goto_12

    :cond_d
    invoke-virtual {v12, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v1, Lio/sentry/c;->d:Ljava/lang/Double;

    invoke-static {v0}, Lio/sentry/c;->b(Ljava/lang/Double;)Ljava/lang/String;

    move-result-object v0

    goto :goto_11

    :cond_e
    invoke-virtual {v6, v14}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    goto :goto_11

    :goto_12
    if-eqz v15, :cond_f

    const/16 v0, 0x40

    if-lt v13, v0, :cond_10

    sget-object v15, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    filled-new-array {v14, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v14, "Not adding baggage value %s as the total number of list members would exceed the maximum of %s."

    invoke-interface {v7, v15, v14, v0}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v16, v2

    goto :goto_14

    :cond_10
    :try_start_e
    invoke-static {v14, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v3, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v15, v4}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, v3, v2}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    move-object/from16 v16, v2

    :try_start_f
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "="

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/2addr v2, v1

    const/16 v1, 0x2000

    if-le v2, v1, :cond_11

    sget-object v0, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Not adding baggage value %s as the total header value length would exceed the maximum of %s."

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v14, v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v7, v0, v2, v1}, Lio/sentry/v0;->m(Lio/sentry/n5;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_14

    :catchall_a
    move-exception v0

    goto :goto_13

    :cond_11
    add-int/lit8 v13, v13, 0x1

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_a

    move-object v5, v9

    goto :goto_14

    :catchall_b
    move-exception v0

    move-object/from16 v16, v2

    :goto_13
    sget-object v1, Lio/sentry/n5;->ERROR:Lio/sentry/n5;

    const-string v2, "Unable to encode baggage key value pair (key=%s,value=%s)."

    filled-new-array {v14, v15}, [Ljava/lang/Object;

    move-result-object v14

    invoke-interface {v7, v1, v0, v2, v14}, Lio/sentry/v0;->i(Lio/sentry/n5;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_14
    move-object/from16 v1, p0

    move-object/from16 v2, v16

    goto/16 :goto_10

    :cond_12
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_13

    const/4 v0, 0x0

    return-object v0

    :cond_13
    new-instance v1, Lhc3/x;

    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Lhc3/x;-><init>(Ljava/lang/String;I)V

    return-object v1

    :catchall_c
    move-exception v0

    move-object v1, v0

    :try_start_10
    invoke-virtual {v10}, Lio/sentry/s;->close()V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_d

    goto :goto_15

    :catchall_d
    move-exception v0

    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_15
    throw v1
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lhc3/x;->a:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Phase(\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhc3/x;->b:Ljava/lang/String;

    const-string v2, "\')"

    invoke-static {v1, v2, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "<"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lhc3/x;->b:Ljava/lang/String;

    const/16 v2, 0x3e

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
