.class public abstract Lrj/o;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final A(Ljava/lang/String;Lvg/n;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    instance-of v2, v1, Lwc/g0;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lwc/g0;

    iget v3, v2, Lwc/g0;->x:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lwc/g0;->x:I

    goto :goto_0

    :cond_0
    new-instance v2, Lwc/g0;

    invoke-direct {v2, v1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lwc/g0;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lwc/g0;->x:I

    const/4 v5, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lrj/o;->v(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v4, p2

    invoke-static {v4, v0}, Lx30/s0;->z(Ljava/lang/String;Lvg/n;)Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lwc/z0;->b(Lvg/n;[Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput v5, v2, Lwc/g0;->x:I

    check-cast v0, Lvg/r;

    invoke-virtual {v0, v1, v2}, Lvg/r;->d(Ljava/lang/String;Ls83/c;)Ljava/io/Serializable;

    move-result-object v1

    if-ne v1, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast v1, [B

    const/4 v0, 0x0

    if-eqz v1, :cond_28

    new-instance v2, Lz7/a;

    invoke-direct {v2, v1}, Lz7/a;-><init>([B)V

    :try_start_0
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const-class v4, Ljg/h;

    const-string v6, "; found "

    const-string v7, "expected "

    if-ne v3, v4, :cond_27

    :try_start_1
    check-cast v1, Ljg/h;

    const/4 v1, 0x0

    move-object v3, v0

    move-object v9, v3

    move-object v10, v9

    move-object v11, v10

    move-object v12, v11

    move-object v13, v12

    move-object v15, v13

    move-object/from16 v16, v15

    move-object/from16 v17, v16

    move-object/from16 v18, v17

    :goto_2
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    instance-of v14, v8, Ljg/l;

    if-nez v14, :cond_1d

    instance-of v14, v8, Ljg/m;

    if-eqz v14, :cond_1c

    check-cast v8, Ljg/m;

    iget-object v8, v8, Ljg/m;->c:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/String;->hashCode()I

    move-result v14
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const-class v5, Ljg/p;

    sparse-switch v14, :sswitch_data_0

    goto/16 :goto_4

    :sswitch_0
    :try_start_2
    const-string v14, "dpopKey"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_4

    goto/16 :goto_4

    :cond_4
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    if-ne v14, v5, :cond_5

    check-cast v8, Ljg/p;

    iget-object v5, v8, Ljg/p;->c:Ljava/lang/String;

    move-object/from16 v18, v5

    :goto_3
    const/4 v5, 0x1

    goto :goto_2

    :cond_5
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_1
    const-string v14, "idToken"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    if-ne v14, v5, :cond_7

    check-cast v8, Ljg/p;

    iget-object v5, v8, Ljg/p;->c:Ljava/lang/String;

    move-object/from16 v16, v5

    goto :goto_3

    :cond_7
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_2
    const-string v14, "clientId"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_8

    goto/16 :goto_4

    :cond_8
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    if-ne v14, v5, :cond_9

    check-cast v8, Ljg/p;

    iget-object v5, v8, Ljg/p;->c:Ljava/lang/String;

    move-object/from16 v17, v5

    goto/16 :goto_3

    :cond_9
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_3
    const-string v14, "tokenType"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_a

    goto/16 :goto_4

    :cond_a
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v13

    if-ne v13, v5, :cond_b

    check-cast v8, Ljg/p;

    iget-object v13, v8, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_3

    :cond_b
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_4
    const-string v14, "refreshToken"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v14

    if-ne v14, v5, :cond_d

    check-cast v8, Ljg/p;

    iget-object v15, v8, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_3

    :cond_d
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_5
    const-string v14, "accessToken"

    invoke-virtual {v8, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_e

    :goto_4
    invoke-virtual {v2}, Lz7/a;->s()V

    goto/16 :goto_3

    :cond_e
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v8, v4, :cond_1b

    check-cast v1, Ljg/h;

    :goto_5
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    instance-of v8, v1, Ljg/l;

    if-nez v8, :cond_1a

    instance-of v8, v1, Ljg/m;

    if-eqz v8, :cond_19

    check-cast v1, Ljg/m;

    iget-object v1, v1, Ljg/m;->c:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v8

    sparse-switch v8, :sswitch_data_1

    goto/16 :goto_6

    :sswitch_6
    const-string v8, "expiresAt"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto/16 :goto_6

    :cond_f
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-ne v3, v5, :cond_10

    check-cast v1, Ljg/p;

    iget-object v3, v1, Ljg/p;->c:Ljava/lang/String;

    goto :goto_5

    :cond_10
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_7
    const-string v8, "sessionToken"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto/16 :goto_6

    :cond_11
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v8, v5, :cond_12

    check-cast v1, Ljg/p;

    iget-object v11, v1, Ljg/p;->c:Ljava/lang/String;

    goto :goto_5

    :cond_12
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_8
    const-string v8, "accessKeyId"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto/16 :goto_6

    :cond_13
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v8, v5, :cond_14

    check-cast v1, Ljg/p;

    iget-object v9, v1, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_5

    :cond_14
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_9
    const-string v8, "accountId"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    goto :goto_6

    :cond_15
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v8, v5, :cond_16

    check-cast v1, Ljg/p;

    iget-object v12, v1, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_5

    :cond_16
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :sswitch_a
    const-string v8, "secretAccessKey"

    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    :goto_6
    invoke-virtual {v2}, Lz7/a;->s()V

    goto/16 :goto_5

    :cond_17
    invoke-virtual {v2}, Lz7/a;->i()Lcom/squareup/wire/n;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    if-ne v8, v5, :cond_18

    check-cast v1, Ljg/p;

    iget-object v10, v1, Ljg/p;->c:Ljava/lang/String;

    goto/16 :goto_5

    :cond_18
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_19
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "expected key or end of object in accessToken"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1a
    const/4 v1, 0x1

    goto/16 :goto_3

    :cond_1b
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1c
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "expected either key or end of object"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :cond_1d
    if-eqz v1, :cond_26

    if-eqz v9, :cond_25

    if-eqz v10, :cond_24

    if-eqz v11, :cond_23

    if-eqz v12, :cond_22

    if-eqz v3, :cond_21

    sget-object v1, Lug/b;->x:Lt9/p;

    invoke-static {v3}, Lt9/p;->p(Ljava/lang/String;)Lug/b;

    move-result-object v14

    if-eqz v17, :cond_20

    if-eqz v15, :cond_1f

    if-eqz v18, :cond_1e

    new-instance v8, Lwc/x;

    invoke-direct/range {v8 .. v18}, Lwc/x;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lug/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v8

    :cond_1e
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `dpopKey`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1f
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `refreshToken`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_20
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `clientId`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_21
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `expiresAt`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_22
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `accountId`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_23
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `sessionToken`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_24
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `secretAccessKey`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_25
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `accessKeyId`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_26
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "missing `accessToken`"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_27
    :try_start_3
    new-instance v0, Laws/smithy/kotlin/runtime/serde/DeserializationException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v3, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :catch_0
    move-exception v0

    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/InvalidLoginTokenException;

    const-string v2, "invalid cached login token"

    invoke-direct {v1, v2, v0}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_28
    new-instance v1, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v2, "Invalid or missing login session cache. Run `aws login` to initiate a new session"

    invoke-direct {v1, v2, v0}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    nop

    :sswitch_data_0
    .sparse-switch
        -0x3e262d0b -> :sswitch_5
        -0x35e3822 -> :sswitch_4
        0x86f18d3 -> :sswitch_3
        0x36253646 -> :sswitch_2
        0x61e6b59e -> :sswitch_1
        0x6f5e2bb2 -> :sswitch_0
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        -0x7344e275 -> :sswitch_a
        -0x6ce643d8 -> :sswitch_9
        -0x3ea95b2a -> :sswitch_8
        -0x29848afd -> :sswitch_7
        0xee9b287 -> :sswitch_6
    .end sparse-switch
.end method

.method public static final a(ZLx30/t;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v0, p6

    iget-object v1, v2, Lx30/t;->g:Ljava/util/List;

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v3, 0x377420d2

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_1

    move/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move/from16 v3, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, v0, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_6

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    goto :goto_5

    :cond_6
    move-object/from16 v6, p2

    :goto_5
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_9

    and-int/lit16 v7, v0, 0x1000

    if-nez v7, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_6

    :cond_7
    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_6
    if-eqz v7, :cond_8

    const/16 v7, 0x800

    goto :goto_7

    :cond_8
    const/16 v7, 0x400

    :goto_7
    or-int/2addr v5, v7

    :cond_9
    and-int/lit16 v7, v0, 0x6000

    if-nez v7, :cond_b

    move-object/from16 v7, p4

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_8

    :cond_a
    const/16 v9, 0x2000

    :goto_8
    or-int/2addr v5, v9

    :goto_9
    move v11, v5

    goto :goto_a

    :cond_b
    move-object/from16 v7, p4

    goto :goto_9

    :goto_a
    and-int/lit16 v5, v11, 0x2493

    const/16 v9, 0x2492

    if-ne v5, v9, :cond_d

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_c

    goto :goto_b

    :cond_c
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_d

    :cond_d
    :goto_b
    move-object v5, v1

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    const/4 v14, 0x0

    :goto_c
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_10

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v15, v14, 0x1

    if-ltz v14, :cond_f

    check-cast v5, Lg40/y2;

    and-int/lit8 v9, v11, 0xe

    shr-int/lit8 v10, v11, 0x6

    and-int/lit16 v10, v10, 0x380

    or-int/2addr v9, v10

    shl-int/lit8 v10, v11, 0x3

    and-int/lit16 v13, v10, 0x1c00

    or-int/2addr v9, v13

    sget v13, Lcom/stripe/android/uicore/elements/IdentifierSpec;->$stable:I

    shl-int/lit8 v13, v13, 0xc

    or-int/2addr v9, v13

    const v13, 0xe000

    and-int/2addr v10, v13

    or-int/2addr v9, v10

    const/4 v10, 0x0

    move-object/from16 v16, v7

    move-object v7, v4

    move-object v4, v5

    move-object/from16 v5, v16

    invoke-static/range {v3 .. v10}, Ls2/e;->g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V

    const v3, 0x6136f957

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {v1}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v3

    if-eq v14, v3, :cond_e

    invoke-static {v8}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v4, v3, Ld40/n;->c:J

    invoke-static {v8}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v3

    iget v6, v3, Ld40/o;->c:F

    const/4 v9, 0x0

    const/16 v10, 0x9

    const/4 v3, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    :cond_e
    const/4 v3, 0x0

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move/from16 v3, p0

    move-object/from16 v6, p2

    move-object/from16 v4, p3

    move-object/from16 v7, p4

    move v14, v15

    goto :goto_c

    :cond_f
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_10
    :goto_d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_11

    new-instance v0, Lb30/j2;

    const/16 v7, 0x13

    move/from16 v1, p0

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(ZLg40/z2;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method public static final b(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    move-object/from16 v3, p4

    const-string v4, "label"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "theme"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v3, Luj/i;->m:Li2/x;

    iget v5, v3, Luj/i;->d:F

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v6, -0x381644e7

    invoke-virtual {v11, v6}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v6

    const/4 v7, 0x2

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    move v6, v7

    :goto_0
    or-int v6, p7, v6

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/16 v8, 0x20

    goto :goto_1

    :cond_1
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v6, v8

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x800

    goto :goto_2

    :cond_2
    const/16 v8, 0x400

    :goto_2
    or-int/2addr v6, v8

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x4000

    goto :goto_3

    :cond_3
    const/16 v8, 0x2000

    :goto_3
    or-int/2addr v6, v8

    const/high16 v8, 0x30000

    or-int v14, v6, v8

    const v6, 0x5b6db

    and-int/2addr v6, v14

    const v8, 0x12492

    if-ne v6, v8, :cond_5

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v6, p5

    goto/16 :goto_19

    :cond_5
    :goto_4
    const-string v6, "single"

    move-object/from16 v15, p2

    invoke-virtual {v15, v6}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    sget-object v6, Lt0/j;->a:Lt0/i;

    goto :goto_5

    :cond_6
    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    :goto_5
    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    iget v9, v3, Luj/i;->a:F

    const/4 v10, 0x0

    invoke-static {v13, v9, v10, v7}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const v10, 0x56c7b0

    invoke-virtual {v11, v10}, Lp1/q;->f0(I)V

    const v10, -0x1896950d

    const/4 v13, 0x0

    if-nez v4, :cond_7

    invoke-virtual {v11, v10}, Lp1/q;->f0(I)V

    sget-object v7, Luj/k;->a:Lp1/u2;

    invoke-virtual {v11, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Luj/m;

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v18, v9

    iget-wide v8, v7, Luj/m;->I:J

    goto :goto_6

    :cond_7
    move-object/from16 v18, v9

    iget-wide v8, v4, Li2/x;->a:J

    :goto_6
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v7, v18

    invoke-static {v7, v8, v9, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move/from16 v18, v14

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_8

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v2, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    invoke-static {v13, v11, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v13

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v13, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 p5, v13

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez p5, :cond_c

    if-ne v15, v13, :cond_b

    goto :goto_8

    :cond_b
    move-object/from16 p5, v13

    const/4 v13, 0x0

    goto :goto_9

    :cond_c
    :goto_8
    new-instance v15, Lrj/k;

    move-object/from16 p5, v13

    const/4 v13, 0x0

    invoke-direct {v15, v0, v1, v13}, Lrj/k;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v15, Lc93/a;

    const/4 v1, 0x0

    const/4 v0, 0x7

    invoke-static {v7, v13, v1, v15, v0}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v15, 0x1

    int-to-float v0, v15

    if-eqz p0, :cond_d

    const v1, -0x786b90f0

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    const v1, -0x1896950d

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    sget-object v15, Luj/k;->a:Lp1/u2;

    invoke-virtual {v11, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Luj/m;

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object/from16 v23, v2

    iget-wide v1, v15, Luj/m;->a:J

    :goto_a
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_d
    move-object/from16 v23, v2

    const v1, -0x786b90ce

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    const v1, -0x1896950d

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v11, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    iget-wide v1, v1, Luj/m;->u:J

    goto :goto_a

    :goto_b
    invoke-static {v7, v0, v1, v2, v5}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v1, -0x786b9017

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    if-eqz p0, :cond_f

    if-nez v4, :cond_e

    const v1, -0x1896950d

    invoke-virtual {v11, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v11, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    iget-wide v1, v1, Luj/m;->I:J

    goto :goto_c

    :cond_e
    iget-wide v1, v4, Li2/x;->a:J

    goto :goto_c

    :cond_f
    iget-wide v1, v3, Luj/i;->e:J

    :goto_c
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    invoke-static {v0, v1, v2, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget v1, v3, Luj/i;->c:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->K:Lb2/l;

    sget-object v2, Ll0/m;->a:Ll0/e;

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget v2, v2, Luj/m;->E:F

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/16 v4, 0x30

    invoke-static {v2, v1, v11, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_10

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v11, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v11, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    goto :goto_f

    :cond_11
    :goto_e
    move-object/from16 v1, v23

    goto :goto_10

    :cond_12
    :goto_f
    invoke-static {v2, v11, v2, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v0, 0x18

    int-to-float v0, v0

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x2

    int-to-float v2, v2

    if-eqz p0, :cond_13

    const v4, -0x711650a8

    invoke-virtual {v11, v4}, Lp1/q;->f0(I)V

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v4

    iget-wide v4, v4, Luj/m;->a:J

    const/4 v13, 0x0

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_13
    const/4 v13, 0x0

    const v4, -0x7116503e

    invoke-virtual {v11, v4}, Lp1/q;->f0(I)V

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v4

    iget-wide v4, v4, Luj/m;->u:J

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_11
    invoke-static {v0, v2, v4, v5, v6}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz p0, :cond_14

    const v2, -0x71164f0e

    invoke-virtual {v11, v2}, Lp1/q;->f0(I)V

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-wide v4, v2, Luj/m;->a:J

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_14
    const v2, -0x71164ea4

    invoke-virtual {v11, v2}, Lp1/q;->f0(I)V

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-wide v4, v2, Luj/m;->w:J

    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    :goto_12
    invoke-static {v0, v4, v5, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    move-object/from16 v4, p3

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_16

    move-object/from16 v2, p5

    if-ne v5, v2, :cond_15

    goto :goto_13

    :cond_15
    move/from16 v2, p0

    goto :goto_14

    :cond_16
    :goto_13
    new-instance v5, Lrj/k;

    const/4 v6, 0x1

    move/from16 v2, p0

    invoke-direct {v5, v4, v2, v6}, Lrj/k;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v5, Lc93/a;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v13, 0x0

    invoke-static {v0, v13, v7, v5, v6}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->E:Lb2/m;

    invoke-static {v5, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v11, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_17
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v11, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-nez v5, :cond_18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_19

    :cond_18
    invoke-static {v6, v11, v6, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x71164d4f

    invoke-virtual {v11, v0}, Lp1/q;->f0(I)V

    if-eqz v2, :cond_1b

    sget-object v0, Lx43/j;->a:Lo2/e;

    if-eqz v0, :cond_1a

    :goto_16
    move-object v6, v0

    goto/16 :goto_17

    :cond_1a
    new-instance v23, Lo2/d;

    const/16 v31, 0x0

    const/16 v33, 0x60

    const-string v24, "Filled.Check"

    const/high16 v25, 0x41c00000    # 24.0f

    const/high16 v26, 0x41c00000    # 24.0f

    const/high16 v27, 0x41c00000    # 24.0f

    const/high16 v28, 0x41c00000    # 24.0f

    const-wide/16 v29, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v23 .. v33}, Lo2/d;-><init>(Ljava/lang/String;FFFFJIZI)V

    move-object/from16 v0, v23

    sget v1, Lo2/f0;->a:I

    new-instance v1, Li2/c1;

    sget-wide v5, Li2/x;->b:J

    invoke-direct {v1, v5, v6}, Li2/c1;-><init>(J)V

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0x20

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    new-instance v6, Lo2/m;

    const/high16 v7, 0x41100000    # 9.0f

    const v8, 0x41815c29    # 16.17f

    invoke-direct {v6, v7, v8}, Lo2/m;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo2/l;

    const v8, 0x409a8f5c    # 4.83f

    const/high16 v9, 0x41400000    # 12.0f

    invoke-direct {v6, v8, v9}, Lo2/l;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo2/t;

    const v8, -0x404a3d71    # -1.42f

    const v9, 0x3fb47ae1    # 1.41f

    invoke-direct {v6, v8, v9}, Lo2/t;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo2/l;

    const/high16 v8, 0x41980000    # 19.0f

    invoke-direct {v6, v7, v8}, Lo2/l;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo2/l;

    const/high16 v7, 0x41a80000    # 21.0f

    const/high16 v8, 0x40e00000    # 7.0f

    invoke-direct {v6, v7, v8}, Lo2/l;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance v6, Lo2/t;

    const v7, -0x404b851f    # -1.41f

    invoke-direct {v6, v7, v7}, Lo2/t;-><init>(FF)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    sget-object v6, Lo2/i;->c:Lo2/i;

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v0, v5, v1}, Lo2/d;->a(Lo2/d;Ljava/util/ArrayList;Li2/c1;)V

    invoke-virtual {v0}, Lo2/d;->b()Lo2/e;

    move-result-object v0

    sput-object v0, Lx43/j;->a:Lo2/e;

    goto/16 :goto_16

    :goto_17
    sget-wide v9, Li2/x;->f:J

    const/16 v0, 0x10

    int-to-float v0, v0

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object v0, v12

    const/16 v12, 0xdb0

    move/from16 v19, v13

    const/4 v13, 0x0

    const-string v7, "Checked"

    move-object v1, v0

    move/from16 v0, v19

    invoke-static/range {v6 .. v13}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_18

    :cond_1b
    move-object v1, v12

    move v0, v13

    :goto_18
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    iget v7, v3, Luj/i;->h:I

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v5, v7, v11, v0}, Luj/m;->a(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v0

    invoke-static {v11}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    iget-wide v7, v5, Luj/m;->o:J

    shr-int/lit8 v5, v18, 0x3

    and-int/lit8 v20, v5, 0xe

    const/16 v21, 0x0

    const v22, 0xfffa

    const/4 v3, 0x0

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v12, v9

    const-wide/16 v9, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v2, v18

    move-object/from16 v18, v0

    move v0, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v22}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v6, v1

    :goto_19
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-nez v8, :cond_1c

    return-void

    :cond_1c
    new-instance v0, Loj/h;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Loj/h;-><init>(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final c(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "text"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "theme"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p5

    check-cast v6, Lp1/q;

    const p5, -0x72fc6b15

    invoke-virtual {v6, p5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_0

    const/4 p5, 0x4

    goto :goto_0

    :cond_0
    const/4 p5, 0x2

    :goto_0
    or-int/2addr p5, p6

    invoke-virtual {v6, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p5, v0

    invoke-virtual {v6, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p5, v0

    invoke-virtual {v6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x800

    goto :goto_3

    :cond_3
    const/16 v0, 0x400

    :goto_3
    or-int/2addr p5, v0

    invoke-virtual {v6, p4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    const/16 v0, 0x4000

    goto :goto_4

    :cond_4
    const/16 v0, 0x2000

    :goto_4
    or-int/2addr p5, v0

    const v0, 0xb6db

    and-int/2addr v0, p5

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_6

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move p2, p1

    goto :goto_6

    :cond_6
    :goto_5
    new-instance v0, Lc4/i;

    const/4 v1, 0x5

    invoke-direct {v0, p3, p0, p5, v1}, Lc4/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    const v1, 0x55a6f786

    invoke-static {v1, v6, v0}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 p5, p5, 0x3

    and-int/lit8 v0, p5, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 v1, p5, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, p5, 0x380

    or-int/2addr v0, v1

    and-int/lit16 p5, p5, 0x1c00

    or-int v7, v0, p5

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    invoke-static/range {v1 .. v7}, Lrj/o;->f(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move p2, v1

    move-object p3, v2

    move-object p4, v3

    move-object p5, v4

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_7

    return-void

    :cond_7
    move-object p1, p0

    new-instance p0, Lrj/l;

    invoke-direct/range {p0 .. p6}, Lrj/l;-><init>(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;I)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d(ZLrj/h;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    const-string v0, "theme"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p4

    check-cast v6, Lp1/q;

    const p4, -0x2440c8f6

    invoke-virtual {v6, p4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->h(Z)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p4, 0x4

    goto :goto_0

    :cond_0
    const/4 p4, 0x2

    :goto_0
    or-int/2addr p4, p5

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p4, v0

    invoke-virtual {v6, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x100

    goto :goto_2

    :cond_2
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p4, v0

    invoke-virtual {v6, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x800

    goto :goto_3

    :cond_3
    const/16 v0, 0x400

    :goto_3
    or-int/2addr p4, v0

    and-int/lit16 v0, p4, 0x16db

    const/16 v1, 0x492

    if-ne v0, v1, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move p1, p0

    goto :goto_5

    :cond_5
    :goto_4
    new-instance v0, Lrj/m;

    invoke-direct {v0, p0, p2}, Lrj/m;-><init>(ZLuj/i;)V

    const v1, -0x47beadb1

    invoke-static {v1, v6, v0}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    and-int/lit8 v0, p4, 0xe

    or-int/lit16 v0, v0, 0x6000

    and-int/lit8 v1, p4, 0x70

    or-int/2addr v0, v1

    and-int/lit16 v1, p4, 0x380

    or-int/2addr v0, v1

    and-int/lit16 p4, p4, 0x1c00

    or-int v7, v0, p4

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    invoke-static/range {v1 .. v7}, Lrj/o;->f(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move p1, v1

    move-object p2, v2

    move-object p3, v3

    move-object p4, v4

    :goto_5
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_6

    return-void

    :cond_6
    new-instance p0, Loj/m;

    invoke-direct/range {p0 .. p5}, Loj/m;-><init>(ZLrj/h;Luj/i;Landroidx/compose/ui/Modifier;I)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final e(Ljava/lang/String;Ln6/o;Lz6/f;ILandroidx/compose/runtime/Composer;II)V
    .locals 9

    check-cast p4, Lp1/q;

    const v0, -0xb7f9811

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    and-int/lit8 v1, p6, 0x2

    if-eqz v1, :cond_1

    or-int/lit8 v0, v0, 0x30

    goto :goto_2

    :cond_1
    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_1

    :cond_2
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    :goto_2
    invoke-virtual {p4, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x100

    goto :goto_3

    :cond_3
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v0, v0, 0x493

    const/16 v2, 0x492

    if-ne v0, v2, :cond_5

    invoke-virtual {p4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_5

    :cond_4
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_4
    move-object v4, p1

    move v6, p3

    goto/16 :goto_9

    :cond_5
    :goto_5
    invoke-virtual {p4}, Lp1/q;->Z()V

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_7

    invoke-virtual {p4}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {p4}, Lp1/q;->X()V

    goto :goto_7

    :cond_7
    :goto_6
    if-eqz v1, :cond_8

    sget-object p1, Ln6/m;->a:Ln6/m;

    :cond_8
    const p3, 0x7fffffff

    :goto_7
    invoke-virtual {p4}, Lp1/q;->r()V

    const v0, 0x6e3c21fe

    invoke-virtual {p4, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_9

    sget-object v0, Lz6/e;->w:Lz6/e;

    invoke-virtual {p4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v0, Lj93/g;

    const/4 v1, 0x0

    invoke-virtual {p4, v1}, Lp1/q;->q(Z)V

    check-cast v0, Lc93/a;

    const v2, -0x428332f6

    invoke-virtual {p4, v2}, Lp1/q;->f0(I)V

    const v2, 0x7076b8d0

    invoke-virtual {p4, v2}, Lp1/q;->f0(I)V

    iget-object v2, p4, Lp1/q;->a:Lhb3/a0;

    instance-of v2, v2, Ln6/b;

    if-eqz v2, :cond_e

    invoke-virtual {p4}, Lp1/q;->c0()V

    iget-boolean v2, p4, Lp1/q;->S:Z

    if-eqz v2, :cond_a

    new-instance v2, Lch/c;

    const/4 v3, 0x4

    invoke-direct {v2, v0, v3}, Lch/c;-><init>(Lc93/a;I)V

    invoke-virtual {p4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_a
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_8
    new-instance v0, Lx31/a;

    const/16 v2, 0x1b

    invoke-direct {v0, v2}, Lx31/a;-><init>(I)V

    invoke-static {p4, v0, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lx31/a;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lx31/a;-><init>(I)V

    invoke-static {p4, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lx31/a;

    const/16 v2, 0x1d

    invoke-direct {v0, v2}, Lx31/a;-><init>(I)V

    invoke-static {p4, v0, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v0, Lz6/d;

    const/4 v2, 0x0

    invoke-direct {v0, v2}, Lz6/d;-><init>(I)V

    iget-boolean v2, p4, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {p4, v2, v0}, Lp1/q;->b(Ljava/lang/Object;Lc93/m;)V

    :cond_c
    const/4 v0, 0x1

    invoke-static {p4, v0, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto/16 :goto_4

    :goto_9
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_d

    new-instance v2, Lz51/n;

    move-object v3, p0

    move-object v5, p2

    move v7, p5

    move v8, p6

    invoke-direct/range {v2 .. v8}, Lz51/n;-><init>(Ljava/lang/String;Ln6/o;Lz6/f;III)V

    iput-object v2, p1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void

    :cond_e
    invoke-static {}, Lp1/x;->w()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final f(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "theme"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-wide v7, v3, Luj/i;->f:J

    iget-wide v9, v3, Luj/i;->e:J

    iget-object v0, v3, Luj/i;->l:Li2/x;

    iget v11, v3, Luj/i;->d:F

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v13, 0x200377cb

    invoke-virtual {v12, v13}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v13, v6, 0xe

    if-nez v13, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x4

    goto :goto_0

    :cond_0
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v6

    goto :goto_1

    :cond_1
    move v13, v6

    :goto_1
    and-int/lit8 v15, v6, 0x70

    if-nez v15, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_2

    const/16 v15, 0x20

    goto :goto_2

    :cond_2
    const/16 v15, 0x10

    :goto_2
    or-int/2addr v13, v15

    :cond_3
    and-int/lit16 v15, v6, 0x380

    if-nez v15, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_4

    const/16 v15, 0x100

    goto :goto_3

    :cond_4
    const/16 v15, 0x80

    :goto_3
    or-int/2addr v13, v15

    :cond_5
    and-int/lit16 v15, v6, 0x1c00

    if-nez v15, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const/16 v15, 0x800

    goto :goto_4

    :cond_6
    const/16 v15, 0x400

    :goto_4
    or-int/2addr v13, v15

    :cond_7
    const v15, 0xe000

    and-int/2addr v15, v6

    if-nez v15, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_8

    const/16 v15, 0x4000

    goto :goto_5

    :cond_8
    const/16 v15, 0x2000

    :goto_5
    or-int/2addr v13, v15

    :cond_9
    const v15, 0xb6db

    and-int/2addr v15, v13

    const/16 v14, 0x2492

    if-ne v15, v14, :cond_b

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v14

    if-nez v14, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_b
    :goto_6
    const v14, -0x7d04ee83

    invoke-virtual {v12, v14}, Lp1/q;->f0(I)V

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_d

    const/4 v14, 0x2

    int-to-float v14, v14

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v17

    if-nez v0, :cond_c

    const v1, -0x1896950d

    invoke-virtual {v12, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    move-wide/from16 v24, v7

    iget-wide v6, v1, Luj/m;->a:J

    goto :goto_7

    :cond_c
    move-wide/from16 v24, v7

    iget-wide v6, v0, Li2/x;->a:J

    :goto_7
    const/high16 v1, 0x3f000000    # 0.5f

    invoke-static {v1, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v21

    const/16 v23, 0xc

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    move/from16 v16, v14

    invoke-static/range {v15 .. v23}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    :goto_8
    const/4 v6, 0x0

    goto :goto_9

    :cond_d
    move-wide/from16 v24, v7

    goto :goto_8

    :goto_9
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-interface {v4, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v1, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz p0, :cond_e

    iget-object v6, v3, Luj/i;->m:Li2/x;

    if-eqz v6, :cond_e

    iget-wide v9, v6, Li2/x;->a:J

    :cond_e
    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v1, v9, v10, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v6, 0x1

    int-to-float v7, v6

    if-eqz p0, :cond_f

    if-eqz v0, :cond_f

    iget-wide v8, v0, Li2/x;->a:J

    goto :goto_a

    :cond_f
    move-wide/from16 v8, v24

    :goto_a
    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    invoke-static {v1, v7, v8, v9, v0}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v7, 0x7

    const/4 v8, 0x0

    invoke-static {v0, v8, v1, v2, v7}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    iget v1, v3, Luj/i;->a:F

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v12, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_12

    :cond_11
    invoke-static {v7, v12, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v13, 0xc

    and-int/lit8 v0, v0, 0xe

    invoke-static {v0, v5, v12, v6}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-nez v7, :cond_13

    return-void

    :cond_13
    new-instance v0, Lrj/n;

    move/from16 v1, p0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lrj/n;-><init>(ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Lx1/b;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final g(Ljava/util/ArrayList;)Ljava/util/ArrayList;
    .locals 5

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxr/o;

    new-instance v2, Landroid/os/Bundle;

    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    iget v3, v1, Lxr/o;->a:I

    const-string v4, "event_type"

    invoke-virtual {v2, v4, v3}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    iget-wide v3, v1, Lxr/o;->b:J

    const-string v1, "event_timestamp"

    invoke-virtual {v2, v1, v3, v4}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static h(IILjava/lang/String;)Ljava/lang/String;
    .locals 0

    if-gez p0, :cond_0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p2, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    if-ltz p1, :cond_1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be greater than size (%s)"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p2, "negative size: "

    invoke-static {p1, p2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static i(II)V
    .locals 2

    if-ltz p0, :cond_1

    if-lt p0, p1, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index"

    if-ltz p0, :cond_3

    if-ltz p1, :cond_2

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {v1, p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must be less than size (%s)"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "negative size: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "%s (%s) must not be negative"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 0

    if-eqz p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static k(II)V
    .locals 2

    if-ltz p0, :cond_0

    if-gt p0, p1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    const-string v1, "index"

    invoke-static {p0, p1, v1}, Lrj/o;->h(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static l(III)V
    .locals 1

    if-ltz p0, :cond_1

    if-lt p1, p0, :cond_1

    if-le p1, p2, :cond_0

    goto :goto_0

    :cond_0
    return-void

    :cond_1
    :goto_0
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    if-ltz p0, :cond_4

    if-gt p0, p2, :cond_4

    if-ltz p1, :cond_3

    if-le p1, p2, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string p1, "end index (%s) must not be less than start index (%s)"

    invoke-static {p1, p0}, Lrs/b;->k(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_3
    :goto_1
    const-string p0, "end index"

    invoke-static {p1, p2, p0}, Lrj/o;->h(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_2

    :cond_4
    const-string p1, "start index"

    invoke-static {p0, p2, p1}, Lrj/o;->h(IILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :goto_2
    invoke-direct {v0, p0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static m(II)I
    .locals 1

    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    mul-int/2addr v0, p1

    div-int/lit16 v0, v0, 0xff

    invoke-static {p0, v0}, Lv4/a;->g(II)I

    move-result p0

    return p0
.end method

.method public static n([FI)[F
    .locals 2

    if-ltz p1, :cond_1

    array-length v0, p0

    if-ltz v0, :cond_0

    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    new-array p1, p1, [F

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object p1

    :cond_0
    new-instance p0, Ljava/lang/ArrayIndexOutOfBoundsException;

    invoke-direct {p0}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>()V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-direct {p0}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p0
.end method

.method public static o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;
    .locals 2

    const-string v0, "form-data; name="

    invoke-static {v0}, Lih0/d0;->o(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lud3/j0;->e:Lud3/h0;

    invoke-static {v0, p0}, Lrj/j;->p(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const-string p0, "; filename="

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v0, p1}, Lrj/j;->p(Ljava/lang/StringBuilder;Ljava/lang/String;)V

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-instance p1, Lkotlin/jvm/internal/k0;

    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p1, v0, v1}, Lkotlin/jvm/internal/k0;-><init>(IZ)V

    const-string v0, "Content-Disposition"

    invoke-virtual {p1, v0, p0}, Lkotlin/jvm/internal/k0;->f(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p1}, Lkotlin/jvm/internal/k0;->g()Lud3/d0;

    move-result-object p0

    const-string p1, "Content-Type"

    invoke-virtual {p0, p1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    const-string p1, "Content-Length"

    invoke-virtual {p0, p1}, Lud3/d0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Lud3/i0;

    invoke-direct {p1, p0, p2}, Lud3/i0;-><init>(Lud3/d0;Lud3/v0;)V

    return-object p1

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Unexpected header: Content-Type"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static p(Ljava/lang/String;)[Lv4/d;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v5, v2

    const/4 v4, 0x1

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    if-ge v4, v6, :cond_f

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v6

    const/16 v7, 0x45

    const/16 v8, 0x65

    if-ge v4, v6, :cond_2

    invoke-virtual {v0, v4}, Ljava/lang/String;->charAt(I)C

    move-result v6

    add-int/lit8 v9, v6, -0x41

    add-int/lit8 v10, v6, -0x5a

    mul-int/2addr v10, v9

    if-lez v10, :cond_0

    add-int/lit8 v9, v6, -0x61

    add-int/lit8 v10, v6, -0x7a

    mul-int/2addr v10, v9

    if-gtz v10, :cond_1

    :cond_0
    if-eq v6, v8, :cond_1

    if-eq v6, v7, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    :goto_2
    invoke-virtual {v0, v5, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_e

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v9, 0x7a

    if-eq v6, v9, :cond_d

    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v6

    const/16 v9, 0x5a

    if-ne v6, v9, :cond_3

    goto/16 :goto_c

    :cond_3
    :try_start_0
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v6

    new-array v6, v6, [F

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v9

    move v11, v2

    const/4 v10, 0x1

    :goto_3
    if-ge v10, v9, :cond_c

    move v13, v2

    move v14, v13

    move v15, v14

    move/from16 v16, v15

    move v12, v10

    :goto_4
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v12, v3, :cond_9

    invoke-virtual {v5, v12}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v2, 0x20

    if-eq v3, v2, :cond_7

    if-eq v3, v7, :cond_6

    if-eq v3, v8, :cond_6

    packed-switch v3, :pswitch_data_0

    goto :goto_6

    :pswitch_0
    if-nez v14, :cond_4

    const/4 v13, 0x0

    const/4 v14, 0x1

    goto :goto_7

    :cond_4
    :goto_5
    const/4 v13, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x1

    goto :goto_7

    :pswitch_1
    if-eq v12, v10, :cond_5

    if-nez v13, :cond_5

    goto :goto_5

    :cond_5
    :goto_6
    const/4 v13, 0x0

    goto :goto_7

    :cond_6
    const/4 v13, 0x1

    goto :goto_7

    :cond_7
    :pswitch_2
    const/4 v13, 0x0

    const/4 v15, 0x1

    :goto_7
    if-eqz v15, :cond_8

    goto :goto_8

    :cond_8
    add-int/lit8 v12, v12, 0x1

    const/4 v2, 0x0

    goto :goto_4

    :cond_9
    :goto_8
    if-ge v10, v12, :cond_a

    add-int/lit8 v2, v11, 0x1

    invoke-virtual {v5, v10, v12}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v3

    aput v3, v6, v11

    move v11, v2

    goto :goto_9

    :catch_0
    move-exception v0

    goto :goto_b

    :cond_a
    :goto_9
    if-eqz v16, :cond_b

    move v10, v12

    :goto_a
    const/4 v2, 0x0

    goto :goto_3

    :cond_b
    add-int/lit8 v10, v12, 0x1

    goto :goto_a

    :cond_c
    invoke-static {v6, v11}, Lrj/o;->n([FI)[F

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    move-object v3, v2

    const/4 v2, 0x0

    goto :goto_d

    :goto_b
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "error in parsing \""

    const-string v3, "\""

    invoke-static {v2, v5, v3}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_d
    :goto_c
    new-array v3, v2, [F

    :goto_d
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    move-result v5

    new-instance v2, Lv4/d;

    invoke-direct {v2, v5, v3}, Lv4/d;-><init>(C[F)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_e
    add-int/lit8 v2, v4, 0x1

    move v5, v4

    move v4, v2

    const/4 v2, 0x0

    goto/16 :goto_0

    :cond_f
    sub-int/2addr v4, v5

    const/4 v2, 0x1

    if-ne v4, v2, :cond_10

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-ge v5, v2, :cond_10

    invoke-virtual {v0, v5}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/4 v2, 0x0

    new-array v3, v2, [F

    new-instance v4, Lv4/d;

    invoke-direct {v4, v0, v3}, Lv4/d;-><init>(C[F)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_e

    :cond_10
    const/4 v2, 0x0

    :goto_e
    new-array v0, v2, [Lv4/d;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv4/d;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x2c
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static q([Lv4/d;)[Lv4/d;
    .locals 4

    array-length v0, p0

    new-array v0, v0, [Lv4/d;

    const/4 v1, 0x0

    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_0

    new-instance v2, Lv4/d;

    aget-object v3, p0, v1

    invoke-direct {v2, v3}, Lv4/d;-><init>(Lv4/d;)V

    aput-object v2, v0, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final r(Ljg/b;)Lre/h;
    .locals 17

    move-object/from16 v0, p0

    new-instance v1, Lre/g;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lhg/i;

    sget-object v3, Lhg/l;->i:Lhg/l;

    new-instance v4, Ljg/e;

    const-string v5, "AccessToken"

    invoke-direct {v4, v5}, Ljg/e;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x1

    new-array v6, v5, [Lhg/d;

    const/4 v7, 0x0

    aput-object v4, v6, v7

    invoke-static {v6}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v4

    invoke-direct {v2, v3, v4, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v4, Lhg/i;

    sget-object v6, Lhg/l;->e:Lhg/l;

    new-instance v8, Ljg/e;

    const-string v9, "ExpiresIn"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v5, [Lhg/d;

    aput-object v8, v9, v7

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v4, v6, v8, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v6, Lhg/i;

    new-instance v8, Ljg/e;

    const-string v9, "IdToken"

    invoke-direct {v8, v9}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v9, v5, [Lhg/d;

    aput-object v8, v9, v7

    invoke-static {v9}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v8

    invoke-direct {v6, v3, v8, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v8, Lhg/i;

    sget-object v9, Lhg/l;->j:Lhg/l;

    new-instance v10, Ljg/e;

    const-string v11, "NewDeviceMetadata"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v5, [Lhg/d;

    aput-object v10, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v8, v9, v10, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v9, Lhg/i;

    new-instance v10, Ljg/e;

    const-string v11, "RefreshToken"

    invoke-direct {v10, v11}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v11, v5, [Lhg/d;

    aput-object v10, v11, v7

    invoke-static {v11}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v10

    invoke-direct {v9, v3, v10, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v10, Lhg/i;

    new-instance v11, Ljg/e;

    const-string v12, "TokenType"

    invoke-direct {v11, v12}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v12, v5, [Lhg/d;

    aput-object v11, v12, v7

    invoke-static {v12}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v11

    invoke-direct {v10, v3, v11, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v11, Lxl/a;

    const/16 v12, 0xd

    invoke-direct {v11, v12}, Lxl/a;-><init>(I)V

    invoke-virtual {v11, v2}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v4}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v6}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v8}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v9}, Lxl/a;->p(Lhg/i;)V

    invoke-virtual {v11, v10}, Lxl/a;->p(Lhg/i;)V

    new-instance v12, Lhg/j;

    invoke-direct {v12, v11}, Lhg/j;-><init>(Lxl/a;)V

    invoke-virtual {v0, v12}, Ljg/b;->d(Lhg/j;)Lhg/c;

    move-result-object v11

    :goto_0
    invoke-interface {v11}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v12

    iget v13, v2, Lhg/i;->b:I

    if-nez v12, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_1

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v12

    iput-object v12, v1, Lre/g;->b:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    :goto_1
    iget v13, v4, Lhg/i;->b:I

    if-nez v12, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_3

    invoke-interface {v11}, Lhg/g;->h()I

    move-result v12

    iput v12, v1, Lre/g;->a:I

    goto :goto_0

    :cond_3
    :goto_2
    iget v13, v6, Lhg/i;->b:I

    if-nez v12, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_5

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v12

    iput-object v12, v1, Lre/g;->c:Ljava/io/Serializable;

    goto :goto_0

    :cond_5
    :goto_3
    iget v13, v8, Lhg/i;->b:I

    if-nez v12, :cond_6

    goto/16 :goto_9

    :cond_6
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v14

    if-ne v14, v13, :cond_c

    new-instance v12, Lod/f;

    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    new-instance v13, Lhg/i;

    new-instance v14, Ljg/e;

    const-string v15, "DeviceGroupKey"

    invoke-direct {v14, v15}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v15, v5, [Lhg/d;

    aput-object v14, v15, v7

    invoke-static {v15}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v14

    invoke-direct {v13, v3, v14, v7}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    new-instance v14, Lhg/i;

    new-instance v15, Ljg/e;

    move/from16 v16, v7

    const-string v7, "DeviceKey"

    invoke-direct {v15, v7}, Ljg/e;-><init>(Ljava/lang/String;)V

    new-array v7, v5, [Lhg/d;

    aput-object v15, v7, v16

    invoke-static {v7}, Lm83/n;->b1([Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v7

    move/from16 v15, v16

    invoke-direct {v14, v3, v7, v15}, Lhg/i;-><init>(Lds/q;Ljava/util/Set;I)V

    invoke-static {v13, v14}, Ld13/a;->p(Lhg/i;Lhg/i;)Lxl/a;

    move-result-object v7

    invoke-static {v7, v0}, Ld13/a;->g(Lxl/a;Ljg/b;)Lhg/c;

    move-result-object v7

    :goto_4
    invoke-interface {v7}, Lhg/c;->q()Ljava/lang/Integer;

    move-result-object v16

    iget v5, v13, Lhg/i;->b:I

    if-nez v16, :cond_7

    goto :goto_6

    :cond_7
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v5, :cond_8

    invoke-interface {v7}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v12, Lod/f;->a:Ljava/lang/String;

    :goto_5
    const/4 v5, 0x1

    const/4 v15, 0x0

    goto :goto_4

    :cond_8
    :goto_6
    iget v5, v14, Lhg/i;->b:I

    if-nez v16, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Integer;->intValue()I

    move-result v15

    if-ne v15, v5, :cond_a

    invoke-interface {v7}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v12, Lod/f;->b:Ljava/lang/String;

    goto :goto_5

    :cond_a
    :goto_7
    if-eqz v16, :cond_b

    invoke-interface {v7}, Lhg/c;->skipValue()V

    goto :goto_5

    :cond_b
    new-instance v5, Lre/q0;

    invoke-direct {v5, v12}, Lre/q0;-><init>(Lod/f;)V

    iput-object v5, v1, Lre/g;->f:Ljava/lang/Object;

    :goto_8
    const/4 v5, 0x1

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_c
    :goto_9
    iget v5, v9, Lhg/i;->b:I

    if-nez v12, :cond_d

    goto :goto_a

    :cond_d
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v5, :cond_e

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lre/g;->d:Ljava/io/Serializable;

    goto :goto_8

    :cond_e
    :goto_a
    iget v5, v10, Lhg/i;->b:I

    if-nez v12, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v5, :cond_10

    invoke-interface {v11}, Lhg/g;->o()Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lre/g;->e:Ljava/io/Serializable;

    goto :goto_8

    :cond_10
    :goto_b
    if-eqz v12, :cond_11

    invoke-interface {v11}, Lhg/c;->skipValue()V

    goto :goto_8

    :cond_11
    new-instance v0, Lre/h;

    invoke-direct {v0, v1}, Lre/h;-><init>(Lre/g;)V

    return-object v0
.end method

.method public static s(Ljava/lang/Throwable;)Lcom/stripe/attestation/AttestationError;
    .locals 3

    instance-of v0, p0, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    if-eqz v0, :cond_2

    new-instance v0, Lcom/stripe/attestation/AttestationError;

    sget-object v1, Lcom/stripe/attestation/AttestationError;->w:Ljava/lang/Object;

    move-object v2, p0

    check-cast v2, Lcom/google/android/play/core/integrity/StandardIntegrityException;

    iget-object v2, v2, Lcom/google/android/gms/common/api/ApiException;->w:Lcom/google/android/gms/common/api/Status;

    iget v2, v2, Lcom/google/android/gms/common/api/Status;->w:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt40/a;

    if-nez v1, :cond_0

    sget-object v1, Lt40/a;->w:Lt40/a;

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    const-string v1, "Integrity error occurred"

    :cond_1
    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0

    :cond_2
    new-instance v0, Lcom/stripe/attestation/AttestationError;

    sget-object v1, Lt40/a;->w:Lt40/a;

    const-string v1, "An unknown error occurred"

    invoke-direct {v0, v1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static t(Landroid/content/Context;II)I
    .locals 1

    invoke-static {p0, p1}, Lio/sentry/config/a;->V(Landroid/content/Context;I)Landroid/util/TypedValue;

    move-result-object p1

    if-eqz p1, :cond_1

    iget v0, p1, Landroid/util/TypedValue;->resourceId:I

    if-eqz v0, :cond_0

    invoke-static {p0, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p0

    goto :goto_0

    :cond_0
    iget p0, p1, Landroid/util/TypedValue;->data:I

    :goto_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_1

    :cond_1
    const/4 p0, 0x0

    :goto_1
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_2
    return p2
.end method

.method public static u(Landroid/view/View;I)I
    .locals 2

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-static {v1, p1, p0}, Lio/sentry/config/a;->X(Landroid/content/Context;ILjava/lang/String;)Landroid/util/TypedValue;

    move-result-object p0

    iget p1, p0, Landroid/util/TypedValue;->resourceId:I

    if-eqz p1, :cond_0

    invoke-static {v0, p1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p0

    return p0

    :cond_0
    iget p0, p0, Landroid/util/TypedValue;->data:I

    return p0
.end method

.method public static final v(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "cacheKey"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object p0

    new-instance v0, Llf/c;

    invoke-direct {v0}, Llf/c;-><init>()V

    invoke-static {v0, p0}, Lse/h;->J(Llf/a;[B)[B

    move-result-object p0

    invoke-static {p0}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object p0

    const-string v0, ".json"

    invoke-static {p0, v0}, Lb9/y;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static w(I)Z
    .locals 4

    if-eqz p0, :cond_0

    invoke-static {p0}, Lv4/a;->d(I)D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    cmpl-double p0, v0, v2

    if-lez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static x(FII)I
    .locals 1

    invoke-static {p2}, Landroid/graphics/Color;->alpha(I)I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p0

    invoke-static {v0}, Ljava/lang/Math;->round(F)I

    move-result p0

    invoke-static {p2, p0}, Lv4/a;->g(II)I

    move-result p0

    invoke-static {p0, p1}, Lv4/a;->e(II)I

    move-result p0

    return p0
.end method

.method public static y([Lv4/d;Landroid/graphics/Path;)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v11, 0x6

    new-array v12, v11, [F

    array-length v13, v0

    const/4 v15, 0x0

    move v8, v15

    const/16 v2, 0x6d

    :goto_0
    if-ge v8, v13, :cond_21

    aget-object v9, v0, v8

    iget-char v10, v9, Lv4/d;->a:C

    iget-object v3, v9, Lv4/d;->b:[F

    aget v4, v12, v15

    const/16 v16, 0x1

    aget v5, v12, v16

    const/16 v17, 0x2

    aget v6, v12, v17

    const/16 v18, 0x3

    aget v7, v12, v18

    const/16 v19, 0x4

    aget v11, v12, v19

    const/16 v20, 0x5

    move/from16 v21, v15

    aget v15, v12, v20

    sparse-switch v10, :sswitch_data_0

    :goto_1
    move/from16 v22, v17

    goto :goto_2

    :sswitch_0
    invoke-virtual {v1}, Landroid/graphics/Path;->close()V

    invoke-virtual {v1, v11, v15}, Landroid/graphics/Path;->moveTo(FF)V

    move v4, v11

    move v6, v4

    move v5, v15

    move v7, v5

    goto :goto_1

    :sswitch_1
    move/from16 v22, v19

    goto :goto_2

    :sswitch_2
    move/from16 v22, v16

    goto :goto_2

    :sswitch_3
    const/16 v22, 0x6

    goto :goto_2

    :sswitch_4
    const/16 v22, 0x7

    :goto_2
    move/from16 v23, v11

    move/from16 v24, v15

    move v11, v4

    move v15, v5

    move/from16 v4, v21

    :goto_3
    array-length v5, v3

    if-ge v4, v5, :cond_20

    const/16 v5, 0x41

    if-eq v10, v5, :cond_1d

    const/16 v5, 0x43

    if-eq v10, v5, :cond_1c

    const/16 v14, 0x48

    if-eq v10, v14, :cond_1b

    const/16 v14, 0x51

    if-eq v10, v14, :cond_1a

    const/16 v5, 0x56

    if-eq v10, v5, :cond_19

    const/16 v5, 0x61

    if-eq v10, v5, :cond_16

    const/16 v5, 0x63

    if-eq v10, v5, :cond_15

    const/16 v5, 0x68

    if-eq v10, v5, :cond_14

    const/16 v5, 0x71

    if-eq v10, v5, :cond_13

    const/16 v14, 0x76

    if-eq v10, v14, :cond_12

    const/16 v14, 0x4c

    if-eq v10, v14, :cond_11

    const/16 v14, 0x4d

    if-eq v10, v14, :cond_f

    const/16 v14, 0x73

    const/16 v5, 0x53

    const/high16 v31, 0x40000000    # 2.0f

    if-eq v10, v5, :cond_c

    const/16 v5, 0x54

    if-eq v10, v5, :cond_9

    const/16 v5, 0x6c

    if-eq v10, v5, :cond_8

    const/16 v5, 0x6d

    if-eq v10, v5, :cond_6

    if-eq v10, v14, :cond_3

    const/16 v5, 0x74

    if-eq v10, v5, :cond_0

    move-object/from16 v25, v3

    move/from16 v30, v4

    move-object v0, v9

    move v2, v11

    :goto_4
    move v3, v15

    const/16 v32, 0x6d

    :goto_5
    move v15, v8

    :goto_6
    move v11, v10

    goto/16 :goto_19

    :cond_0
    const/16 v14, 0x71

    if-eq v2, v14, :cond_2

    if-eq v2, v5, :cond_2

    const/16 v5, 0x51

    if-eq v2, v5, :cond_2

    const/16 v5, 0x54

    if-ne v2, v5, :cond_1

    goto :goto_7

    :cond_1
    const/4 v2, 0x0

    const/4 v14, 0x0

    goto :goto_8

    :cond_2
    :goto_7
    sub-float v14, v11, v6

    sub-float v2, v15, v7

    :goto_8
    aget v5, v3, v4

    add-int/lit8 v6, v4, 0x1

    aget v7, v3, v6

    invoke-virtual {v1, v14, v2, v5, v7}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    add-float/2addr v14, v11

    add-float/2addr v2, v15

    aget v5, v3, v4

    add-float/2addr v11, v5

    aget v5, v3, v6

    add-float/2addr v15, v5

    move v7, v2

    move-object/from16 v25, v3

    move/from16 v30, v4

    move-object v0, v9

    move v2, v11

    move v6, v14

    goto :goto_4

    :cond_3
    const/16 v5, 0x63

    if-eq v2, v5, :cond_5

    if-eq v2, v14, :cond_5

    const/16 v5, 0x43

    if-eq v2, v5, :cond_5

    const/16 v5, 0x53

    if-ne v2, v5, :cond_4

    goto :goto_a

    :cond_4
    const/4 v2, 0x0

    const/4 v14, 0x0

    :goto_9
    move v5, v4

    goto :goto_b

    :cond_5
    :goto_a
    sub-float v14, v11, v6

    sub-float v2, v15, v7

    move v5, v14

    move v14, v2

    move v2, v5

    goto :goto_9

    :goto_b
    aget v4, v3, v5

    add-int/lit8 v26, v5, 0x1

    move v6, v5

    aget v5, v3, v26

    add-int/lit8 v27, v6, 0x2

    move v7, v6

    aget v6, v3, v27

    add-int/lit8 v28, v7, 0x3

    move/from16 v29, v7

    aget v7, v3, v28

    move-object/from16 v25, v3

    move v3, v14

    move/from16 v30, v29

    const/16 v32, 0x6d

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    aget v2, v25, v30

    add-float/2addr v2, v11

    aget v3, v25, v26

    add-float/2addr v3, v15

    aget v4, v25, v27

    add-float/2addr v11, v4

    aget v4, v25, v28

    :goto_c
    add-float/2addr v15, v4

    move v6, v2

    move v7, v3

    :goto_d
    move-object v0, v9

    move v2, v11

    move v3, v15

    goto :goto_5

    :cond_6
    move-object/from16 v25, v3

    move/from16 v30, v4

    move/from16 v32, v5

    aget v2, v25, v30

    add-float/2addr v11, v2

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    add-float/2addr v15, v3

    if-lez v30, :cond_7

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    goto :goto_d

    :cond_7
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rMoveTo(FF)V

    move-object v0, v9

    move v2, v11

    move/from16 v23, v2

    move v3, v15

    move/from16 v24, v3

    goto/16 :goto_5

    :cond_8
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v2, v25, v30

    add-float/2addr v11, v2

    aget v2, v25, v4

    :goto_e
    add-float/2addr v15, v2

    goto :goto_d

    :cond_9
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v14, 0x71

    const/16 v32, 0x6d

    if-eq v2, v14, :cond_a

    const/16 v5, 0x74

    if-eq v2, v5, :cond_a

    const/16 v5, 0x51

    if-eq v2, v5, :cond_a

    const/16 v5, 0x54

    if-ne v2, v5, :cond_b

    :cond_a
    mul-float v11, v11, v31

    sub-float/2addr v11, v6

    mul-float v15, v15, v31

    sub-float/2addr v15, v7

    :cond_b
    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    invoke-virtual {v1, v11, v15, v2, v3}, Landroid/graphics/Path;->quadTo(FFFF)V

    aget v2, v25, v30

    aget v3, v25, v4

    move-object v0, v9

    move v6, v11

    move v7, v15

    goto/16 :goto_5

    :cond_c
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v5, 0x63

    const/16 v32, 0x6d

    if-eq v2, v5, :cond_e

    if-eq v2, v14, :cond_e

    const/16 v5, 0x43

    if-eq v2, v5, :cond_e

    const/16 v5, 0x53

    if-ne v2, v5, :cond_d

    goto :goto_10

    :cond_d
    :goto_f
    move v2, v11

    move v3, v15

    goto :goto_11

    :cond_e
    :goto_10
    mul-float v11, v11, v31

    sub-float/2addr v11, v6

    mul-float v15, v15, v31

    sub-float/2addr v15, v7

    goto :goto_f

    :goto_11
    aget v4, v25, v30

    add-int/lit8 v11, v30, 0x1

    aget v5, v25, v11

    add-int/lit8 v14, v30, 0x2

    aget v6, v25, v14

    add-int/lit8 v15, v30, 0x3

    aget v7, v25, v15

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    aget v2, v25, v30

    aget v3, v25, v11

    aget v4, v25, v14

    aget v5, v25, v15

    move v6, v2

    move v7, v3

    move v2, v4

    move v3, v5

    :goto_12
    move v15, v8

    move-object v0, v9

    goto/16 :goto_6

    :cond_f
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    if-lez v30, :cond_10

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    goto :goto_12

    :cond_10
    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->moveTo(FF)V

    move/from16 v23, v2

    move/from16 v24, v3

    goto :goto_12

    :cond_11
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    aget v2, v25, v30

    aget v3, v25, v4

    goto :goto_12

    :cond_12
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    const/4 v3, 0x0

    invoke-virtual {v1, v3, v2}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v2, v25, v30

    goto/16 :goto_e

    :cond_13
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    add-int/lit8 v5, v30, 0x2

    aget v6, v25, v5

    add-int/lit8 v7, v30, 0x3

    aget v14, v25, v7

    invoke-virtual {v1, v2, v3, v6, v14}, Landroid/graphics/Path;->rQuadTo(FFFF)V

    aget v2, v25, v30

    add-float/2addr v2, v11

    aget v3, v25, v4

    add-float/2addr v3, v15

    aget v4, v25, v5

    add-float/2addr v11, v4

    aget v4, v25, v7

    goto/16 :goto_c

    :cond_14
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    const/4 v3, 0x0

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->rLineTo(FF)V

    aget v2, v25, v30

    add-float/2addr v11, v2

    goto/16 :goto_d

    :cond_15
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    add-int/lit8 v14, v30, 0x2

    aget v4, v25, v14

    add-int/lit8 v26, v30, 0x3

    aget v5, v25, v26

    add-int/lit8 v27, v30, 0x4

    aget v6, v25, v27

    add-int/lit8 v28, v30, 0x5

    aget v7, v25, v28

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->rCubicTo(FFFFFF)V

    aget v1, v25, v14

    add-float/2addr v1, v11

    aget v2, v25, v26

    add-float/2addr v2, v15

    aget v3, v25, v27

    add-float/2addr v11, v3

    aget v3, v25, v28

    add-float/2addr v15, v3

    move v6, v1

    move v7, v2

    goto/16 :goto_d

    :cond_16
    move-object/from16 v25, v3

    move/from16 v30, v4

    const/16 v32, 0x6d

    add-int/lit8 v14, v30, 0x5

    aget v1, v25, v14

    add-float v4, v1, v11

    add-int/lit8 v27, v30, 0x6

    aget v1, v25, v27

    add-float v5, v1, v15

    aget v6, v25, v30

    add-int/lit8 v1, v30, 0x1

    aget v7, v25, v1

    add-int/lit8 v1, v30, 0x2

    aget v1, v25, v1

    add-int/lit8 v2, v30, 0x3

    aget v2, v25, v2

    const/16 v26, 0x0

    cmpl-float v2, v2, v26

    if-eqz v2, :cond_17

    move-object v2, v9

    move/from16 v9, v16

    goto :goto_13

    :cond_17
    move-object v2, v9

    move/from16 v9, v21

    :goto_13
    add-int/lit8 v3, v30, 0x4

    aget v3, v25, v3

    cmpl-float v3, v3, v26

    move-object v0, v2

    move v2, v11

    move v11, v10

    if-eqz v3, :cond_18

    move/from16 v10, v16

    :goto_14
    move v3, v15

    move v15, v8

    move v8, v1

    move-object/from16 v1, p1

    goto :goto_15

    :cond_18
    move/from16 v10, v21

    goto :goto_14

    :goto_15
    invoke-static/range {v1 .. v10}, Lv4/d;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    aget v4, v25, v14

    add-float/2addr v2, v4

    aget v4, v25, v27

    add-float/2addr v3, v4

    move v6, v2

    move v7, v3

    goto/16 :goto_19

    :cond_19
    move-object/from16 v25, v3

    move/from16 v30, v4

    move v15, v8

    move-object v0, v9

    move v2, v11

    const/16 v32, 0x6d

    move v11, v10

    aget v3, v25, v30

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    aget v3, v25, v30

    goto/16 :goto_19

    :cond_1a
    move-object/from16 v25, v3

    move/from16 v30, v4

    move v15, v8

    move-object v0, v9

    move v11, v10

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    add-int/lit8 v5, v30, 0x2

    aget v6, v25, v5

    add-int/lit8 v7, v30, 0x3

    aget v8, v25, v7

    invoke-virtual {v1, v2, v3, v6, v8}, Landroid/graphics/Path;->quadTo(FFFF)V

    aget v2, v25, v30

    aget v3, v25, v4

    aget v4, v25, v5

    aget v5, v25, v7

    move v6, v2

    move v7, v3

    move v2, v4

    move v3, v5

    goto/16 :goto_19

    :cond_1b
    move-object/from16 v25, v3

    move/from16 v30, v4

    move-object v0, v9

    move v11, v10

    move v3, v15

    const/16 v32, 0x6d

    move v15, v8

    aget v2, v25, v30

    invoke-virtual {v1, v2, v3}, Landroid/graphics/Path;->lineTo(FF)V

    aget v2, v25, v30

    goto/16 :goto_19

    :cond_1c
    move-object/from16 v25, v3

    move/from16 v30, v4

    move v15, v8

    move-object v0, v9

    move v11, v10

    const/16 v32, 0x6d

    aget v2, v25, v30

    add-int/lit8 v4, v30, 0x1

    aget v3, v25, v4

    add-int/lit8 v8, v30, 0x2

    aget v4, v25, v8

    add-int/lit8 v9, v30, 0x3

    aget v5, v25, v9

    add-int/lit8 v10, v30, 0x4

    aget v6, v25, v10

    add-int/lit8 v14, v30, 0x5

    aget v7, v25, v14

    invoke-virtual/range {v1 .. v7}, Landroid/graphics/Path;->cubicTo(FFFFFF)V

    aget v1, v25, v10

    aget v2, v25, v14

    aget v3, v25, v8

    aget v4, v25, v9

    move v6, v3

    move v7, v4

    move v3, v2

    move v2, v1

    goto :goto_19

    :cond_1d
    move-object/from16 v25, v3

    move/from16 v30, v4

    move-object v0, v9

    move v2, v11

    move v3, v15

    const/16 v32, 0x6d

    move v15, v8

    move v11, v10

    add-int/lit8 v14, v30, 0x5

    aget v4, v25, v14

    add-int/lit8 v27, v30, 0x6

    aget v5, v25, v27

    aget v6, v25, v30

    add-int/lit8 v1, v30, 0x1

    aget v7, v25, v1

    add-int/lit8 v1, v30, 0x2

    aget v8, v25, v1

    add-int/lit8 v1, v30, 0x3

    aget v1, v25, v1

    const/16 v26, 0x0

    cmpl-float v1, v1, v26

    if-eqz v1, :cond_1e

    move/from16 v9, v16

    goto :goto_16

    :cond_1e
    move/from16 v9, v21

    :goto_16
    add-int/lit8 v1, v30, 0x4

    aget v1, v25, v1

    cmpl-float v1, v1, v26

    if-eqz v1, :cond_1f

    move/from16 v10, v16

    :goto_17
    move-object/from16 v1, p1

    goto :goto_18

    :cond_1f
    move/from16 v10, v21

    goto :goto_17

    :goto_18
    invoke-static/range {v1 .. v10}, Lv4/d;->a(Landroid/graphics/Path;FFFFFFFZZ)V

    aget v1, v25, v14

    aget v2, v25, v27

    move v6, v1

    move v3, v2

    move v7, v3

    move v2, v6

    :goto_19
    add-int v4, v30, v22

    move-object/from16 v1, p1

    move-object v9, v0

    move v10, v11

    move v8, v15

    move-object/from16 v0, p0

    move v11, v2

    move v15, v3

    move v2, v10

    move-object/from16 v3, v25

    goto/16 :goto_3

    :cond_20
    move-object v0, v9

    move v2, v11

    move v3, v15

    const/16 v32, 0x6d

    move v15, v8

    aput v2, v12, v21

    aput v3, v12, v16

    aput v6, v12, v17

    aput v7, v12, v18

    aput v23, v12, v19

    aput v24, v12, v20

    iget-char v2, v0, Lv4/d;->a:C

    add-int/lit8 v8, v15, 0x1

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v15, v21

    const/4 v11, 0x6

    goto/16 :goto_0

    :cond_21
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x41 -> :sswitch_4
        0x43 -> :sswitch_3
        0x48 -> :sswitch_2
        0x51 -> :sswitch_1
        0x53 -> :sswitch_1
        0x56 -> :sswitch_2
        0x5a -> :sswitch_0
        0x61 -> :sswitch_4
        0x63 -> :sswitch_3
        0x68 -> :sswitch_2
        0x71 -> :sswitch_1
        0x73 -> :sswitch_1
        0x76 -> :sswitch_2
        0x7a -> :sswitch_0
    .end sparse-switch
.end method

.method public static final z([B)[B
    .locals 3

    array-length v0, p0

    const/16 v1, 0x20

    if-gt v0, v1, :cond_0

    array-length v0, p0

    sub-int/2addr v1, v0

    new-array v0, v1, [B

    invoke-static {v0, p0}, Lm83/n;->F0([B[B)[B

    move-result-object p0

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unexpected byte array of size "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    array-length p0, p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "; expected 32 bytes or less"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
