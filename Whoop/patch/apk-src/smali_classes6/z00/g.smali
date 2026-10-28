.class public final Lz00/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lz00/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static b(Lorg/json/JSONObject;)Ly00/o6;
    .locals 10

    sget-object v0, Ly00/n6;->x:Lt9/p;

    const-string v1, "type"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Ly00/n6;->z:Lt83/b;

    invoke-virtual {v0}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ly00/n6;

    iget-object v4, v4, Ly00/n6;->w:Ljava/lang/String;

    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    move-object v5, v2

    check-cast v5, Ly00/n6;

    if-eqz v5, :cond_4

    new-instance v4, Ly00/o6;

    const-string v0, "amount"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    move-object v6, v3

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    move-object v6, v0

    :goto_1
    const-string v0, "currency"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v0, "description"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v0, "quantity"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_3

    :goto_2
    move-object v9, v3

    goto :goto_3

    :cond_3
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_2

    :goto_3
    invoke-direct/range {v4 .. v9}, Ly00/o6;-><init>(Ly00/n6;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v4

    :cond_4
    return-object v3
.end method

.method public static d(Lorg/json/JSONObject;)Ly00/g8;
    .locals 11

    const-string v0, "id"

    invoke-static {v0, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v0, "created"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_0

    move-object v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    :goto_0
    sget-object v1, Ly00/f8;->x:Lt9/p;

    const-string v4, "type"

    invoke-static {v4, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ly00/f8;->F:Lt83/b;

    invoke-virtual {v1}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ly00/f8;

    iget-object v6, v6, Ly00/f8;->w:Ljava/lang/String;

    invoke-virtual {v6, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_1

    :cond_2
    move-object v5, v3

    :goto_1
    check-cast v5, Ly00/f8;

    if-eqz v5, :cond_3

    if-eqz v2, :cond_3

    if-nez v0, :cond_4

    :cond_3
    move-object v0, v3

    goto/16 :goto_3

    :cond_4
    const-string v1, "used"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eqz v4, :cond_5

    invoke-virtual {p0, v1, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_5

    move v1, v6

    move v6, v7

    goto :goto_2

    :cond_5
    move v1, v6

    :goto_2
    const-string v4, "livemode"

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-virtual {p0, v4, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_6

    move v1, v7

    :cond_6
    new-instance v4, Ljava/util/Date;

    sget-object v8, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v9

    invoke-virtual {v8, v9, v10}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    invoke-direct {v4, v8, v9}, Ljava/util/Date;-><init>(J)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_8

    if-eq v0, v7, :cond_7

    move-object v3, v5

    move v5, v1

    new-instance v1, Ly00/g8;

    const/4 v8, 0x0

    const/16 v9, 0x60

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Ly00/g8;-><init>(Ljava/lang/String;Ly00/f8;Ljava/util/Date;ZZLy00/e;Ly00/h;I)V

    return-object v1

    :cond_7
    move v5, v1

    move-object v0, v3

    sget-object v3, Ly00/f8;->z:Ly00/f8;

    const-string v1, "bank_account"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-static {p0}, Ls2/d;->q(Lorg/json/JSONObject;)Ly00/e;

    move-result-object v7

    new-instance v1, Ly00/g8;

    const/4 v8, 0x0

    const/16 v9, 0x40

    invoke-direct/range {v1 .. v9}, Ly00/g8;-><init>(Ljava/lang/String;Ly00/f8;Ljava/util/Date;ZZLy00/e;Ly00/h;I)V

    return-object v1

    :cond_8
    move v5, v1

    move-object v0, v3

    sget-object v3, Ly00/f8;->y:Ly00/f8;

    const-string v1, "card"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-static {p0}, Ls2/h;->j(Lorg/json/JSONObject;)Ly00/h;

    move-result-object v8

    new-instance v1, Ly00/g8;

    const/4 v7, 0x0

    const/16 v9, 0x20

    invoke-direct/range {v1 .. v9}, Ly00/g8;-><init>(Ljava/lang/String;Ly00/f8;Ljava/util/Date;ZZLy00/e;Ly00/h;I)V

    return-object v1

    :cond_9
    :goto_3
    return-object v0
.end method


# virtual methods
.method public a(Lorg/json/JSONObject;)Ly00/g6;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "object"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "setup_intent"

    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    const-string v1, "payment_method"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Lz00/a;

    const/16 v5, 0x1d

    invoke-direct {v4, v5}, Lz00/a;-><init>(I)V

    invoke-virtual {v4, v3}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v3

    move-object v13, v3

    goto :goto_0

    :cond_1
    move-object v13, v2

    :goto_0
    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    if-nez v13, :cond_2

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_3

    if-eqz v13, :cond_4

    iget-object v1, v13, Ly00/o4;->w:Ljava/lang/String;

    :cond_3
    move-object v14, v1

    goto :goto_2

    :cond_4
    move-object v14, v2

    :goto_2
    const-string v1, "unactivated_payment_method_types"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    sget-object v3, Lm83/y;->w:Lm83/y;

    const/16 v4, 0xa

    const/4 v5, 0x0

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v6

    invoke-static {v5, v6}, Le93/b;->i0(II)Li93/j;

    move-result-object v6

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v6}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_3
    move-object v8, v6

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_6

    move-object v8, v6

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    invoke-virtual {v1, v8}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_5
    move-object v7, v3

    :cond_6
    check-cast v7, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v7, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v1, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "toLowerCase(...)"

    if-eqz v7, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v9, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v7, v9}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_7
    const-string v6, "link_funding_sources"

    invoke-virtual {v0, v6}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v6

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lorg/json/JSONArray;->length()I

    move-result v7

    invoke-static {v5, v7}, Le93/b;->i0(II)Li93/j;

    move-result-object v7

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v7, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v7}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_5
    move-object v10, v7

    check-cast v10, Li93/i;

    iget-boolean v10, v10, Li93/i;->y:Z

    if-eqz v10, :cond_9

    move-object v10, v7

    check-cast v10, Lm83/e0;

    invoke-virtual {v10}, Lm83/e0;->nextInt()I

    move-result v10

    invoke-virtual {v6, v10}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_8
    move-object v9, v3

    :cond_9
    check-cast v9, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v9, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_6
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/String;

    sget-object v10, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    const-string v7, "payment_method_options"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v7

    move-object/from16 v22, v7

    goto :goto_7

    :cond_b
    move-object/from16 v22, v2

    :goto_7
    const-string v7, "automatic_payment_methods"

    invoke-virtual {v0, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_c

    const-string v8, "enabled"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_c

    move/from16 v23, v8

    goto :goto_8

    :cond_c
    move/from16 v23, v5

    :goto_8
    const-string v7, "id"

    invoke-static {v7, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "created"

    invoke-virtual {v0, v8}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v8

    const-string v10, "client_secret"

    invoke-static {v10, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Ly00/c6;->x:Lt9/p;

    const-string v12, "cancellation_reason"

    invoke-static {v12, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, Ly00/c6;->z:Lt83/b;

    invoke-virtual {v11}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_9
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_e

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object v2, v15

    check-cast v2, Ly00/c6;

    iget-object v2, v2, Ly00/c6;->w:Ljava/lang/String;

    invoke-virtual {v2, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_a

    :cond_d
    const/4 v2, 0x0

    goto :goto_9

    :cond_e
    const/4 v15, 0x0

    :goto_a
    check-cast v15, Ly00/c6;

    const-string v2, "country_code"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v11, "description"

    invoke-static {v11, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "livemode"

    invoke-virtual {v0, v12}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v12

    const-string v4, "payment_method_types"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    if-eqz v4, :cond_10

    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v5, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v3

    new-instance v5, Ljava/util/ArrayList;

    move-object/from16 v19, v1

    const/16 v1, 0xa

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_b
    move-object v3, v1

    check-cast v3, Li93/i;

    iget-boolean v3, v3, Li93/i;->y:Z

    if-eqz v3, :cond_f

    move-object v3, v1

    check-cast v3, Lm83/e0;

    invoke-virtual {v3}, Lm83/e0;->nextInt()I

    move-result v3

    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_f
    move-object v3, v5

    goto :goto_c

    :cond_10
    move-object/from16 v19, v1

    :goto_c
    sget-object v1, Lcom/stripe/android/model/StripeIntent$Status;->x:Lt9/p;

    const-string v4, "status"

    invoke-static {v4, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4}, Lt9/p;->m(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v1

    sget-object v4, Lcom/stripe/android/model/StripeIntent$Usage;->x:Lt9/c0;

    const-string v5, "usage"

    invoke-static {v5, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Lt9/c0;->n(Ljava/lang/String;)Lcom/stripe/android/model/StripeIntent$Usage;

    move-result-object v17

    const-string v4, "last_setup_error"

    invoke-virtual {v0, v4}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_14

    const-string v5, "code"

    invoke-static {v5, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v25

    const-string v5, "decline_code"

    invoke-static {v5, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v26

    const-string v5, "doc_url"

    invoke-static {v5, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v27

    const-string v5, "message"

    invoke-static {v5, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v28

    const-string v5, "param"

    invoke-static {v5, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    const-string v5, "payment_method"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const/16 v18, 0x0

    move-object/from16 v20, v1

    if-eqz v5, :cond_11

    new-instance v1, Lz00/a;

    move-object/from16 v21, v2

    const/16 v2, 0x1d

    invoke-direct {v1, v2}, Lz00/a;-><init>(I)V

    invoke-virtual {v1, v5}, Lz00/a;->d(Lorg/json/JSONObject;)Ly00/o4;

    move-result-object v1

    move-object/from16 v30, v1

    goto :goto_d

    :cond_11
    move-object/from16 v21, v2

    move-object/from16 v30, v18

    :goto_d
    sget-object v1, Ly00/e6;->x:Lt9/c0;

    const-string v2, "type"

    invoke-static {v2, v4}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Ly00/e6;->z:Lt83/b;

    invoke-virtual {v1}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Ly00/e6;

    iget-object v5, v5, Ly00/e6;->w:Ljava/lang/String;

    invoke-virtual {v5, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    move-object/from16 v18, v4

    :cond_13
    move-object/from16 v31, v18

    check-cast v31, Ly00/e6;

    new-instance v24, Ly00/f6;

    invoke-direct/range {v24 .. v31}, Ly00/f6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/o4;Ly00/e6;)V

    move-object/from16 v18, v24

    goto :goto_e

    :cond_14
    move-object/from16 v20, v1

    move-object/from16 v21, v2

    const/16 v18, 0x0

    :goto_e
    const-string v1, "next_action"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_15

    invoke-static {v0}, Ls30/b;->s(Lorg/json/JSONObject;)Ly00/b8;

    move-result-object v2

    goto :goto_f

    :cond_15
    const/4 v2, 0x0

    :goto_f
    new-instance v4, Ly00/g6;

    move-object v5, v7

    move-wide v7, v8

    move-object/from16 v16, v20

    move-object/from16 v9, v21

    move-object/from16 v21, v2

    move-object/from16 v20, v6

    move-object v6, v15

    move-object v15, v3

    invoke-direct/range {v4 .. v23}, Ly00/g6;-><init>(Ljava/lang/String;Ly00/c6;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLy00/o4;Ljava/lang/String;Ljava/util/List;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Ly00/f6;Ljava/util/List;Ljava/util/List;Ly00/b8;Ljava/lang/String;Z)V

    return-object v4
.end method

.method public c(Lorg/json/JSONObject;)Ly00/q6;
    .locals 17

    move-object/from16 v0, p1

    const-string v1, "items"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    :cond_0
    const/4 v2, 0x0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v3

    invoke-static {v2, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v2

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    move-object v4, v2

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_1

    move-object v4, v2

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    invoke-virtual {v1, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lorg/json/JSONObject;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2}, Lz00/g;->b(Lorg/json/JSONObject;)Ly00/o6;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v9, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const-string v1, "amount"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_4

    move-object v6, v3

    goto :goto_2

    :cond_4
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v6, v1

    :goto_2
    const-string v1, "currency"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v7

    const-string v1, "email"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "shipping"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v1, "address"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_5

    const-string v2, "city"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "country"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v2, "line1"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v2, "line2"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v2, "postal_code"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "state"

    invoke-static {v2, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    new-instance v10, Ly00/c;

    invoke-direct/range {v10 .. v16}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :goto_3
    move-object v12, v10

    goto :goto_4

    :cond_5
    const/4 v10, 0x0

    goto :goto_3

    :goto_4
    const-string v1, "carrier"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v1, "name"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v1, "phone"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    const-string v1, "tracking_number"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    new-instance v11, Ly00/p6;

    invoke-direct/range {v11 .. v16}, Ly00/p6;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v11

    goto :goto_5

    :cond_6
    move-object v10, v3

    :goto_5
    new-instance v5, Ly00/q6;

    invoke-direct/range {v5 .. v10}, Ly00/q6;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ly00/p6;)V

    return-object v5
.end method

.method public final m(Lorg/json/JSONObject;)Lvy/b;
    .locals 28

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget v2, v0, Lz00/g;->w:I

    packed-switch v2, :pswitch_data_0

    invoke-static {v1}, Lz00/g;->d(Lorg/json/JSONObject;)Ly00/g8;

    move-result-object v1

    return-object v1

    :pswitch_0
    const-string v2, "id"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v2, "created"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v2

    const-string v5, "livemode"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v9

    const-string v5, "source"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "state"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v5, "ares"

    invoke-virtual {v1, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_9

    const-string v10, "threeDSServerTransID"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v10, "acsChallengeMandated"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v10, "acsSignedContent"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    const-string v10, "acsTransID"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v10, "acsURL"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v16

    const-string v10, "authenticationType"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v17

    const-string v10, "cardholderInfo"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    const-string v10, "messageType"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v10, "messageVersion"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v21

    const-string v10, "sdkTransID"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v22

    const-string v10, "transStatus"

    invoke-static {v10, v5}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v23

    const-string v10, "messageExtension"

    invoke-virtual {v5, v10}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    if-eqz v5, :cond_8

    const/4 v10, 0x0

    invoke-virtual {v5}, Lorg/json/JSONArray;->length()I

    move-result v11

    invoke-static {v10, v11}, Le93/b;->i0(II)Li93/j;

    move-result-object v10

    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v10}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_0
    :goto_0
    move-object v6, v10

    check-cast v6, Li93/i;

    iget-boolean v6, v6, Li93/i;->y:Z

    if-eqz v6, :cond_1

    move-object v6, v10

    check-cast v6, Lm83/e0;

    invoke-virtual {v6}, Lm83/e0;->nextInt()I

    move-result v6

    invoke-virtual {v5, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_0

    invoke-virtual {v11, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v11, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :goto_1
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_7

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lorg/json/JSONObject;

    const-string v11, "json"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v11, "data"

    invoke-virtual {v10, v11}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    sget-object v19, Lm83/z;->w:Lm83/z;

    if-eqz v11, :cond_6

    invoke-virtual {v11}, Lorg/json/JSONObject;->names()Lorg/json/JSONArray;

    move-result-object v24

    if-nez v24, :cond_2

    new-instance v24, Lorg/json/JSONArray;

    invoke-direct/range {v24 .. v24}, Lorg/json/JSONArray;-><init>()V

    :cond_2
    move-object/from16 v25, v24

    const/4 v0, 0x0

    move-wide/from16 v26, v2

    invoke-virtual/range {v25 .. v25}, Lorg/json/JSONArray;->length()I

    move-result v2

    invoke-static {v0, v2}, Le93/b;->i0(II)Li93/j;

    move-result-object v0

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    move-object/from16 v24, v4

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v0}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    move-object v4, v0

    check-cast v4, Li93/i;

    iget-boolean v4, v4, Li93/i;->y:Z

    if-eqz v4, :cond_3

    move-object v4, v0

    check-cast v4, Lm83/e0;

    invoke-virtual {v4}, Lm83/e0;->nextInt()I

    move-result v4

    move-object/from16 v3, v25

    invoke-virtual {v3, v4}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v3, 0xa

    goto :goto_2

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v11, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v25, v2

    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v2}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, v25

    goto :goto_3

    :cond_4
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object/from16 v2, v19

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map;

    invoke-static {v2, v3}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v2

    goto :goto_4

    :cond_5
    move-object/from16 v19, v2

    goto :goto_5

    :cond_6
    move-wide/from16 v26, v2

    move-object/from16 v24, v4

    :goto_5
    new-instance v0, Ly00/b7;

    const-string v2, "name"

    invoke-static {v2, v10}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "criticalityIndicator"

    invoke-virtual {v10, v3}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;)Z

    move-result v3

    const-string v4, "id"

    invoke-static {v4, v10}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Lm83/g0;->j0(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v10

    invoke-direct {v0, v2, v3, v4, v10}, Ly00/b7;-><init>(Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;)V

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v4, v24

    move-wide/from16 v2, v26

    goto/16 :goto_1

    :cond_7
    move-wide/from16 v26, v2

    move-object/from16 v24, v4

    :goto_6
    move-object/from16 v19, v5

    goto :goto_7

    :cond_8
    move-wide/from16 v26, v2

    move-object/from16 v24, v4

    const/4 v5, 0x0

    goto :goto_6

    :goto_7
    new-instance v11, Ly00/a7;

    invoke-direct/range {v11 .. v23}, Ly00/a7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v11

    goto :goto_8

    :cond_9
    move-wide/from16 v26, v2

    move-object/from16 v24, v4

    const/4 v5, 0x0

    :goto_8
    const-string v0, "error"

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    if-eqz v0, :cond_a

    new-instance v10, Ly00/c7;

    const-string v2, "threeDSServerTransID"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v2, "acsTransID"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    const-string v2, "dsTransID"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    const-string v2, "errorCode"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    const-string v2, "errorComponent"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v15

    const-string v2, "errorDescription"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v16

    const-string v2, "errorDetail"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v17

    const-string v2, "errorMessageType"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    const-string v2, "messageType"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v19

    const-string v2, "messageVersion"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v20

    const-string v2, "sdkTransID"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v21

    invoke-direct/range {v10 .. v21}, Ly00/c7;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9

    :cond_a
    const/4 v10, 0x0

    :goto_9
    const-string v0, "fallback_redirect_url"

    invoke-static {v0, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v0, "creq"

    invoke-static {v0, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v12

    new-instance v3, Ly00/d7;

    invoke-static/range {v26 .. v27}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    move-object/from16 v4, v24

    invoke-direct/range {v3 .. v12}, Ly00/d7;-><init>(Ljava/lang/String;Ly00/a7;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;ZLy00/c7;Ljava/lang/String;Ljava/lang/String;)V

    return-object v3

    :pswitch_1
    invoke-virtual/range {p0 .. p1}, Lz00/g;->c(Lorg/json/JSONObject;)Ly00/q6;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {v1}, Lz00/g;->b(Lorg/json/JSONObject;)Ly00/o6;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual/range {p0 .. p1}, Lz00/g;->a(Lorg/json/JSONObject;)Ly00/g6;

    move-result-object v0

    return-object v0

    :pswitch_4
    const-string v0, "id"

    invoke-static {v0, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v2, Ly00/b6;

    const-string v3, "passive_captcha_site_key"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "passive_captcha_rqdata"

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v0, v3, v1}, Ly00/b6;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_a

    :cond_b
    const/4 v2, 0x0

    :goto_a
    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
