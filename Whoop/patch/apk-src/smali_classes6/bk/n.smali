.class public final Lbk/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lgj/d;

.field public final b:Lbk/e;


# direct methods
.method public constructor <init>(Lgj/d;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk/n;->a:Lgj/d;

    .line 2
    sget-object v0, Lbk/f;->a:Ljava/util/LinkedHashMap;

    .line 3
    iget-object v0, p1, Lgj/d;->a:Lgj/g;

    .line 4
    iget-object v1, v0, Lgj/g;->e:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v2

    const-string v3, "getDefault()"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "this as java.lang.String).toLowerCase(locale)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_3

    .line 6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    const-string v2, "$default_instance"

    .line 7
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    .line 8
    :cond_2
    const-string v2, "com.amplitude.api_"

    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_2

    :cond_3
    :goto_1
    const-string v1, "com.amplitude.api"

    .line 9
    :goto_2
    sget-object v2, Lbk/f;->a:Ljava/util/LinkedHashMap;

    invoke-virtual {v2, v1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbk/e;

    if-nez v3, :cond_4

    .line 10
    new-instance v3, Lbk/e;

    .line 11
    iget-object v4, v0, Lgj/g;->b:Landroid/content/Context;

    .line 12
    iget-object v0, v0, Lgj/g;->g:Lbu/c;

    .line 13
    invoke-virtual {v0, p1}, Lbu/c;->E(Lgj/d;)Lfk/a;

    move-result-object p1

    invoke-direct {v3, v4, v1, p1}, Lbk/e;-><init>(Landroid/content/Context;Ljava/lang/String;Lfk/a;)V

    .line 14
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    :cond_4
    iput-object v3, p0, Lbk/n;->b:Lbk/e;

    return-void
.end method

.method public constructor <init>(Lgj/d;Lbk/e;)V
    .locals 1

    const-string v0, "databaseStorage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbk/n;->a:Lgj/d;

    iput-object p2, p0, Lbk/n;->b:Lbk/e;

    return-void
.end method

.method public static a(Lorg/json/JSONObject;)J
    .locals 8

    const-string v0, "$rowId"

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    const-string v2, "event_id"

    invoke-virtual {p0, v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    const-string v2, "library"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "name"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v5, 0x2f

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string v5, "version"

    invoke-virtual {v3, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    const-string v2, "timestamp"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v3, "time"

    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    const-string v2, "uuid"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    const-string v3, "insert_id"

    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_2
    const-string v2, "api_properties"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v3, "price"

    const-string v4, "quantity"

    const-string v5, "productId"

    if-eqz v2, :cond_9

    const-string v6, "androidADID"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_3

    const-string v7, "adid"

    invoke-virtual {p0, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_3
    const-string v6, "android_app_set_id"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {p0, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_4
    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-virtual {p0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_5
    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {p0, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_6
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_7

    invoke-virtual {p0, v3, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7
    const-string v6, "location"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_9

    const-string v6, "lat"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    if-eqz v6, :cond_8

    const-string v7, "location_lat"

    invoke-virtual {p0, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    const-string v6, "lng"

    invoke-virtual {v2, v6}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_9

    const-string v6, "location_lng"

    invoke-virtual {p0, v6, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_9
    const-string v2, "$productId"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {p0, v5, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_a
    const-string v2, "$quantity"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {p0, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_b
    const-string v2, "$price"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_c
    const-string v2, "$revenueType"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_d

    const-string v3, "revenueType"

    invoke-virtual {p0, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_d
    return-wide v0
.end method


# virtual methods
.method public b(Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p1, Lbk/h;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbk/h;

    iget v1, v0, Lbk/h;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/h;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/h;

    invoke-direct {v0, p0, p1}, Lbk/h;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbk/h;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/h;->E:I

    const/4 v3, 0x4

    const/4 v4, 0x2

    const/4 v5, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_c

    :pswitch_1
    iget-object v2, v0, Lbk/h;->w:Lbk/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_2
    iget-object v2, v0, Lbk/h;->w:Lbk/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :pswitch_3
    iget-object v2, v0, Lbk/h;->w:Lbk/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_4
    iget-object v2, v0, Lbk/h;->w:Lbk/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_5
    iget v2, v0, Lbk/h;->x:I

    iget-object v6, v0, Lbk/h;->w:Lbk/n;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbk/n;->a:Lgj/d;

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object v2

    sget-object v6, Lik/a;->z:Lik/a;

    invoke-interface {v2, v6}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-static {v2}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v5

    :goto_1
    const/4 v6, 0x1

    if-nez v2, :cond_2

    move v2, v6

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    iget-object v7, p0, Lbk/n;->b:Lbk/e;

    :try_start_0
    const-string v8, "device_id"

    invoke-virtual {v7, v8}, Lbk/e;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "user_id"

    invoke-virtual {v7, v9}, Lbk/e;->k(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v8, :cond_3

    if-nez v7, :cond_3

    goto :goto_5

    :cond_3
    invoke-virtual {p1}, Lgj/d;->e()Lp0/n0;

    move-result-object v9

    invoke-virtual {v9}, Lp0/n0;->g()Lqk/a;

    move-result-object v9

    iget-object v10, v9, Lqk/a;->b:Ljava/lang/String;

    if-nez v10, :cond_4

    if-eqz v8, :cond_4

    invoke-virtual {p1}, Lgj/d;->e()Lp0/n0;

    move-result-object v10

    invoke-virtual {v10, v8}, Lp0/n0;->j(Ljava/lang/String;)V

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_4

    :cond_4
    :goto_3
    iget-object v8, v9, Lqk/a;->a:Ljava/lang/String;

    if-nez v8, :cond_5

    if-eqz v7, :cond_5

    invoke-virtual {p1}, Lgj/d;->e()Lp0/n0;

    move-result-object p1

    invoke-virtual {p1, v7}, Lp0/n0;->k(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    :goto_4
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "device/user id migration failed: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v7, "message"

    invoke-static {p1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v3}, Le4/p;->b(II)I

    move-result v7

    if-gtz v7, :cond_5

    const-string v7, "Amplitude"

    invoke-static {v7, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    :goto_5
    iput-object p0, v0, Lbk/h;->w:Lbk/n;

    iput v2, v0, Lbk/h;->x:I

    iput v6, v0, Lbk/h;->E:I

    invoke-virtual {p0, v0}, Lbk/n;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_b

    :cond_6
    move-object v6, p0

    :goto_6
    if-eqz v2, :cond_9

    iput-object v6, v0, Lbk/h;->w:Lbk/n;

    iput v4, v0, Lbk/h;->E:I

    invoke-virtual {v6, v0}, Lbk/n;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_b

    :cond_7
    move-object v2, v6

    :goto_7
    iput-object v2, v0, Lbk/h;->w:Lbk/n;

    const/4 p1, 0x3

    iput p1, v0, Lbk/h;->E:I

    invoke-virtual {v2, v0}, Lbk/n;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_b

    :cond_8
    :goto_8
    move-object v6, v2

    :cond_9
    iput-object v6, v0, Lbk/h;->w:Lbk/n;

    iput v3, v0, Lbk/h;->E:I

    invoke-virtual {v6, v0}, Lbk/n;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_b

    :cond_a
    move-object v2, v6

    :goto_9
    iget-object p1, v2, Lbk/n;->a:Lgj/d;

    invoke-virtual {p1}, Lgj/d;->f()Lik/b;

    move-result-object p1

    iput-object v2, v0, Lbk/h;->w:Lbk/n;

    const/4 v3, 0x5

    iput v3, v0, Lbk/h;->E:I

    invoke-interface {p1, v0}, Lik/b;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    goto :goto_b

    :cond_b
    :goto_a
    iget-object p1, v2, Lbk/n;->a:Lgj/d;

    invoke-virtual {p1}, Lgj/d;->d()Lik/b;

    move-result-object p1

    iput-object v5, v0, Lbk/h;->w:Lbk/n;

    const/4 v2, 0x6

    iput v2, v0, Lbk/h;->E:I

    invoke-interface {p1, v0}, Lik/b;->f(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_c

    :goto_b
    return-object v1

    :cond_c
    :goto_c
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Lbk/g;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lbk/n;

    iget-object v1, p0, Lbk/n;->a:Lgj/d;

    iget-object v2, p0, Lbk/n;->b:Lbk/e;

    invoke-direct {v0, v1, v2}, Lbk/n;-><init>(Lgj/d;Lbk/e;)V

    invoke-virtual {v0, p1}, Lbk/n;->b(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public d(Lorg/json/JSONObject;Lik/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p4, Lbk/i;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lbk/i;

    iget v1, v0, Lbk/i;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/i;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/i;

    invoke-direct {v0, p0, p4}, Lbk/i;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lbk/i;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/i;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-wide p1, v0, Lbk/i;->x:J

    iget-object p3, v0, Lbk/i;->w:Lkotlin/jvm/internal/i;

    check-cast p3, Lkotlin/jvm/functions/Function1;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-static {p1}, Lbk/n;->a(Lorg/json/JSONObject;)J

    move-result-wide v4

    invoke-static {p1}, Lhg3/i;->m0(Lorg/json/JSONObject;)Ljk/a;

    move-result-object p1

    move-object p4, p3

    check-cast p4, Lkotlin/jvm/internal/i;

    iput-object p4, v0, Lbk/i;->w:Lkotlin/jvm/internal/i;

    iput-wide v4, v0, Lbk/i;->x:J

    iput v3, v0, Lbk/i;->E:I

    invoke-interface {p2, p1, v0}, Lik/b;->e(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-wide p1, v4

    :goto_1
    new-instance p4, Ljava/lang/Long;

    invoke-direct {p4, p1, p2}, Ljava/lang/Long;-><init>(J)V

    invoke-interface {p3, p4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "event migration failed: "

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "message"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x2

    const/4 p3, 0x4

    invoke-static {p2, p3}, Le4/p;->b(II)I

    move-result p2

    if-gtz p2, :cond_4

    const-string p2, "Amplitude"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public e(Ls83/c;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lbk/j;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbk/j;

    iget v1, v0, Lbk/j;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/j;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/j;

    invoke-direct {v0, p0, p1}, Lbk/j;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbk/j;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/j;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Lbk/j;->x:Ljava/util/Iterator;

    iget-object v4, v0, Lbk/j;->w:Lbk/n;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lbk/n;->b:Lbk/e;

    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    const-string v2, "events"

    invoke-virtual {p1, v2}, Lbk/e;->x(Ljava/lang/String;)Ljava/util/AbstractList;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit p1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, p0

    move-object v2, p1

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    iget-object v5, v4, Lbk/n;->a:Lgj/d;

    invoke-virtual {v5}, Lgj/d;->f()Lik/b;

    move-result-object v5

    new-instance v6, La1/e;

    iget-object v8, v4, Lbk/n;->b:Lbk/e;

    const-class v9, Lbk/e;

    const-string v10, "removeEvent"

    const-string v11, "removeEvent(J)V"

    const/4 v12, 0x0

    const/16 v13, 0xb

    const/4 v7, 0x1

    invoke-direct/range {v6 .. v13}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v4, v0, Lbk/j;->w:Lbk/n;

    iput-object v2, v0, Lbk/j;->x:Ljava/util/Iterator;

    iput v3, v0, Lbk/j;->E:I

    invoke-virtual {v4, p1, v5, v6, v0}, Lbk/n;->d(Lorg/json/JSONObject;Lik/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "events migration failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public f(Ls83/c;)Ljava/lang/Object;
    .locals 14

    instance-of v0, p1, Lbk/k;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lbk/k;

    iget v1, v0, Lbk/k;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbk/k;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbk/k;

    invoke-direct {v0, p0, p1}, Lbk/k;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Lbk/k;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbk/k;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v2, v0, Lbk/k;->x:Ljava/util/Iterator;

    iget-object v4, v0, Lbk/k;->w:Lbk/n;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lbk/n;->b:Lbk/e;

    monitor-enter p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    const-string v2, "identifys"

    invoke-virtual {p1, v2}, Lbk/e;->x(Ljava/lang/String;)Ljava/util/AbstractList;

    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit p1

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move-object v4, p0

    move-object v2, p1

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lorg/json/JSONObject;

    iget-object v5, v4, Lbk/n;->a:Lgj/d;

    invoke-virtual {v5}, Lgj/d;->f()Lik/b;

    move-result-object v5

    new-instance v6, La1/e;

    iget-object v8, v4, Lbk/n;->b:Lbk/e;

    const-class v9, Lbk/e;

    const-string v10, "removeIdentify"

    const-string v11, "removeIdentify(J)V"

    const/4 v12, 0x0

    const/16 v13, 0xc

    const/4 v7, 0x1

    invoke-direct/range {v6 .. v13}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v4, v0, Lbk/k;->w:Lbk/n;

    iput-object v2, v0, Lbk/k;->x:Ljava/util/Iterator;

    iput v3, v0, Lbk/k;->E:I

    invoke-virtual {v4, p1, v5, v6, v0}, Lbk/n;->d(Lorg/json/JSONObject;Lik/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v1, :cond_3

    return-object v1

    :catchall_0
    move-exception v0

    :try_start_4
    monitor-exit p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "identifies migration failed: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x4

    invoke-static {v0, v1}, Le4/p;->b(II)I

    move-result v0

    if-gtz v0, :cond_4

    const-string v0, "Amplitude"

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public g(Ls83/c;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    instance-of v2, v0, Lbk/l;

    if-eqz v2, :cond_0

    move-object v2, v0

    check-cast v2, Lbk/l;

    iget v3, v2, Lbk/l;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lbk/l;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lbk/l;

    invoke-direct {v2, v1, v0}, Lbk/l;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object v0, v2, Lbk/l;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lbk/l;->E:I

    const/4 v5, 0x4

    const/4 v6, 0x1

    if-eqz v4, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v4, v2, Lbk/l;->x:Ljava/util/Iterator;

    iget-object v7, v2, Lbk/l;->w:Lbk/n;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    goto :goto_4

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object v4, v1, Lbk/n;->b:Lbk/e;

    monitor-enter v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :try_start_2
    iget v0, v4, Lbk/e;->z:I

    if-ge v0, v5, :cond_3

    sget-object v0, Lm83/y;->w:Lm83/y;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    monitor-exit v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_3

    :cond_3
    :try_start_4
    const-string v0, "identify_interceptor"

    invoke-virtual {v4, v0}, Lbk/e;->x(Ljava/lang/String;)Ljava/util/AbstractList;

    move-result-object v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    monitor-exit v4

    :goto_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move-object v4, v0

    move-object v7, v1

    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    iget-object v8, v7, Lbk/n;->a:Lgj/d;

    invoke-virtual {v8}, Lgj/d;->d()Lik/b;

    move-result-object v8

    new-instance v9, La1/e;

    iget-object v11, v7, Lbk/n;->b:Lbk/e;

    const-class v12, Lbk/e;

    const-string v13, "removeInterceptedIdentify"

    const-string v14, "removeInterceptedIdentify(J)V"

    const/4 v15, 0x0

    const/16 v16, 0xd

    const/4 v10, 0x1

    invoke-direct/range {v9 .. v16}, La1/e;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    iput-object v7, v2, Lbk/l;->w:Lbk/n;

    iput-object v4, v2, Lbk/l;->x:Ljava/util/Iterator;

    iput v6, v2, Lbk/l;->E:I

    invoke-virtual {v7, v0, v8, v9, v2}, Lbk/n;->d(Lorg/json/JSONObject;Lik/b;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    if-ne v0, v3, :cond_4

    return-object v3

    :goto_3
    :try_start_6
    monitor-exit v4
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    :try_start_7
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :goto_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "intercepted identifies migration failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v2, "message"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-static {v2, v5}, Le4/p;->b(II)I

    move-result v2

    if-gtz v2, :cond_5

    const-string v2, "Amplitude"

    invoke-static {v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public h(Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    iget-object v2, v1, Lbk/n;->b:Lbk/e;

    iget-object v3, v1, Lbk/n;->a:Lgj/d;

    instance-of v4, v0, Lbk/m;

    if-eqz v4, :cond_0

    move-object v4, v0

    check-cast v4, Lbk/m;

    iget v5, v4, Lbk/m;->H:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Lbk/m;->H:I

    goto :goto_0

    :cond_0
    new-instance v4, Lbk/m;

    invoke-direct {v4, v1, v0}, Lbk/m;-><init>(Lbk/n;Ls83/c;)V

    :goto_0
    iget-object v0, v4, Lbk/m;->F:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Lbk/m;->H:I

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    const-string v8, "last_event_id"

    const-string v9, "last_event_time"

    const-string v10, "previous_session_id"

    sget-object v11, Lik/a;->x:Lik/a;

    sget-object v12, Lik/a;->z:Lik/a;

    const/4 v14, 0x2

    const/4 v15, 0x1

    if-eqz v6, :cond_4

    if-eq v6, v15, :cond_3

    if-eq v6, v14, :cond_2

    const/4 v2, 0x3

    if-ne v6, v2, :cond_1

    iget-object v2, v4, Lbk/m;->w:Lbk/n;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v2, v4, Lbk/m;->y:Ljava/lang/Long;

    iget-object v3, v4, Lbk/m;->x:Ljava/lang/Long;

    iget-object v6, v4, Lbk/m;->w:Lbk/n;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_6

    :cond_3
    iget-object v2, v4, Lbk/m;->E:Ljava/lang/Long;

    iget-object v3, v4, Lbk/m;->z:Ljava/lang/Long;

    iget-object v6, v4, Lbk/m;->y:Ljava/lang/Long;

    iget-object v15, v4, Lbk/m;->x:Ljava/lang/Long;

    iget-object v14, v4, Lbk/m;->w:Lbk/n;

    :try_start_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_4

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    invoke-virtual {v3}, Lgj/d;->f()Lik/b;

    move-result-object v0

    sget-object v6, Lik/a;->y:Lik/a;

    invoke-interface {v0, v6}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-static {v0}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    goto :goto_1

    :cond_5
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {v3}, Lgj/d;->f()Lik/b;

    move-result-object v14

    invoke-interface {v14, v12}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_6

    invoke-static {v14}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v14

    goto :goto_2

    :cond_6
    const/4 v14, 0x0

    :goto_2
    invoke-virtual {v3}, Lgj/d;->f()Lik/b;

    move-result-object v13

    invoke-interface {v13, v11}, Lik/b;->c(Lik/a;)Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_7

    invoke-static {v13}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v13

    goto :goto_3

    :cond_7
    const/4 v13, 0x0

    :goto_3
    invoke-virtual {v2, v10}, Lbk/e;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v16

    invoke-virtual {v2, v9}, Lbk/e;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v15

    invoke-virtual {v2, v8}, Lbk/e;->i(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v2

    if-nez v0, :cond_9

    if-eqz v16, :cond_9

    invoke-virtual {v3}, Lgj/d;->f()Lik/b;

    move-result-object v0

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v3

    iput-object v1, v4, Lbk/m;->w:Lbk/n;

    iput-object v14, v4, Lbk/m;->x:Ljava/lang/Long;

    iput-object v13, v4, Lbk/m;->y:Ljava/lang/Long;

    iput-object v15, v4, Lbk/m;->z:Ljava/lang/Long;

    iput-object v2, v4, Lbk/m;->E:Ljava/lang/Long;

    const/4 v1, 0x1

    iput v1, v4, Lbk/m;->H:I

    invoke-interface {v0, v6, v3}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    if-ne v7, v5, :cond_8

    goto :goto_7

    :cond_8
    move-object v6, v13

    move-object v3, v15

    move-object v15, v14

    move-object/from16 v14, p0

    :goto_4
    iget-object v0, v14, Lbk/n;->b:Lbk/e;

    invoke-virtual {v0, v10}, Lbk/e;->T(Ljava/lang/String;)V

    move-object/from16 v17, v15

    move-object v15, v3

    move-object v3, v6

    move-object v6, v14

    move-object/from16 v14, v17

    goto :goto_5

    :cond_9
    move-object/from16 v6, p0

    move-object v3, v13

    :goto_5
    if-nez v14, :cond_b

    if-eqz v15, :cond_b

    iget-object v0, v6, Lbk/n;->a:Lgj/d;

    invoke-virtual {v0}, Lgj/d;->f()Lik/b;

    move-result-object v0

    invoke-virtual {v15}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v6, v4, Lbk/m;->w:Lbk/n;

    iput-object v3, v4, Lbk/m;->x:Ljava/lang/Long;

    iput-object v2, v4, Lbk/m;->y:Ljava/lang/Long;

    const/4 v10, 0x0

    iput-object v10, v4, Lbk/m;->z:Ljava/lang/Long;

    iput-object v10, v4, Lbk/m;->E:Ljava/lang/Long;

    const/4 v10, 0x2

    iput v10, v4, Lbk/m;->H:I

    invoke-interface {v0, v12, v1}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    if-ne v7, v5, :cond_a

    goto :goto_7

    :cond_a
    :goto_6
    iget-object v0, v6, Lbk/n;->b:Lbk/e;

    invoke-virtual {v0, v9}, Lbk/e;->T(Ljava/lang/String;)V

    :cond_b
    if-nez v3, :cond_d

    if-eqz v2, :cond_d

    iget-object v0, v6, Lbk/n;->a:Lgj/d;

    invoke-virtual {v0}, Lgj/d;->f()Lik/b;

    move-result-object v0

    invoke-virtual {v2}, Ljava/lang/Long;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v6, v4, Lbk/m;->w:Lbk/n;

    const/4 v10, 0x0

    iput-object v10, v4, Lbk/m;->x:Ljava/lang/Long;

    iput-object v10, v4, Lbk/m;->y:Ljava/lang/Long;

    iput-object v10, v4, Lbk/m;->z:Ljava/lang/Long;

    iput-object v10, v4, Lbk/m;->E:Ljava/lang/Long;

    const/4 v2, 0x3

    iput v2, v4, Lbk/m;->H:I

    invoke-interface {v0, v11, v1}, Lik/b;->b(Lik/a;Ljava/lang/String;)V

    if-ne v7, v5, :cond_c

    :goto_7
    return-object v5

    :cond_c
    move-object v2, v6

    :goto_8
    iget-object v0, v2, Lbk/n;->b:Lbk/e;

    invoke-virtual {v0, v8}, Lbk/e;->T(Ljava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_a

    :goto_9
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "session data migration failed: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "message"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x4

    const/4 v10, 0x2

    invoke-static {v10, v1}, Le4/p;->b(II)I

    move-result v1

    if-gtz v1, :cond_d

    const-string v1, "Amplitude"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    :cond_d
    :goto_a
    return-object v7
.end method
