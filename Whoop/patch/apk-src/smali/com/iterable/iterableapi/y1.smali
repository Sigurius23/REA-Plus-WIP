.class public final Lcom/iterable/iterableapi/y1;
.super Landroid/os/AsyncTask;
.source "SourceFile"


# instance fields
.field public a:Lcom/iterable/iterableapi/x1;


# virtual methods
.method public final doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    check-cast p1, [Lcom/iterable/iterableapi/x1;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    iput-object p1, p0, Lcom/iterable/iterableapi/y1;->a:Lcom/iterable/iterableapi/x1;

    iget-object p1, p1, Lcom/iterable/iterableapi/x1;->c:Ljava/lang/String;

    const/4 v1, 0x0

    if-eqz p1, :cond_a

    const-string p1, "IterablePushRegistration"

    :try_start_0
    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v0, :cond_0

    const-string v0, "MainActivity Context is null"

    invoke-static {p1, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    move-object v0, v1

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_0
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    const-string v3, "gcm_defaultSenderId"

    const-string v4, "string"

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v3, v4, v5}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-nez v0, :cond_2

    const-string v0, "Could not find gcm_defaultSenderId, please check that Firebase SDK is set up properly"

    invoke-static {p1, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    new-instance v0, Lad3/z;

    invoke-static {}, Lcom/iterable/iterableapi/IterableFirebaseMessagingService;->l()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-direct {v0, v3}, Lad3/z;-><init>(I)V

    iput-object v2, v0, Lad3/z;->x:Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :goto_2
    const-string v2, "Exception while retrieving the device token: check that firebase is added to the build dependencies"

    invoke-static {p1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0

    :goto_3
    if-eqz v0, :cond_9

    iget-object p1, p0, Lcom/iterable/iterableapi/y1;->a:Lcom/iterable/iterableapi/x1;

    iget p1, p1, Lcom/iterable/iterableapi/x1;->e:I

    const/4 v2, 0x1

    if-ne p1, v2, :cond_5

    sget-object v4, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p1, p0, Lcom/iterable/iterableapi/y1;->a:Lcom/iterable/iterableapi/x1;

    iget-object v5, p1, Lcom/iterable/iterableapi/x1;->a:Ljava/lang/String;

    iget-object v6, p1, Lcom/iterable/iterableapi/x1;->b:Ljava/lang/String;

    iget-object v7, p1, Lcom/iterable/iterableapi/x1;->d:Ljava/lang/String;

    iget-object v8, p1, Lcom/iterable/iterableapi/x1;->c:Ljava/lang/String;

    iget-object p1, v0, Lad3/z;->x:Ljava/lang/Object;

    move-object v9, p1

    check-cast v9, Ljava/lang/String;

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v10, p1, Lcom/iterable/iterableapi/k;->o:Ljava/util/HashMap;

    if-eqz v9, :cond_4

    invoke-virtual {v4}, Lcom/iterable/iterableapi/k;->a()Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, v4, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    if-nez p1, :cond_3

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object p1, p1, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    :cond_3
    new-instance p1, Ljava/lang/Thread;

    new-instance v3, Lcom/iterable/iterableapi/j;

    invoke-direct/range {v3 .. v10}, Lcom/iterable/iterableapi/j;-><init>(Lcom/iterable/iterableapi/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V

    invoke-direct {p1, v3}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {p1}, Ljava/lang/Thread;->start()V

    goto :goto_6

    :cond_4
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_6

    :cond_5
    const/4 v2, 0x2

    if-ne p1, v2, :cond_9

    sget-object p1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v2, p0, Lcom/iterable/iterableapi/y1;->a:Lcom/iterable/iterableapi/x1;

    iget-object v3, v2, Lcom/iterable/iterableapi/x1;->a:Ljava/lang/String;

    iget-object v4, v2, Lcom/iterable/iterableapi/x1;->b:Ljava/lang/String;

    iget-object v8, v2, Lcom/iterable/iterableapi/x1;->d:Ljava/lang/String;

    iget-object v0, v0, Lad3/z;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_6

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "IterableApi"

    const-string v0, "device token not available"

    invoke-static {p1, v0}, Ldt/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_6

    :cond_6
    iget-object v5, p1, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v7, Lorg/json/JSONObject;

    invoke-direct {v7}, Lorg/json/JSONObject;-><init>()V

    :try_start_1
    const-string p1, "token"

    invoke-virtual {v7, p1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-eqz v3, :cond_7

    const-string p1, "email"

    invoke-virtual {v7, p1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_4

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_5

    :cond_7
    if-eqz v4, :cond_8

    const-string p1, "userId"

    invoke-virtual {v7, p1, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_8
    :goto_4
    const-string v6, "users/disableDevice"

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-virtual/range {v5 .. v10}, Lcom/google/crypto/tink/internal/l0;->g0(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_6

    :goto_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_9
    :goto_6
    return-object v1

    :cond_a
    const-string p1, "IterablePush"

    const-string v0, "iterablePushRegistrationData has not been specified"

    invoke-static {p1, v0}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method
