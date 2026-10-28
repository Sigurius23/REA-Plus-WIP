.class public final Lcom/iterable/iterableapi/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic E:Ljava/lang/String;

.field public final synthetic F:Ljava/util/HashMap;

.field public final synthetic G:Lcom/iterable/iterableapi/k;

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:Ljava/lang/String;

.field public final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/iterable/iterableapi/k;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/HashMap;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/j;->G:Lcom/iterable/iterableapi/k;

    iput-object p2, p0, Lcom/iterable/iterableapi/j;->w:Ljava/lang/String;

    iput-object p3, p0, Lcom/iterable/iterableapi/j;->x:Ljava/lang/String;

    iput-object p4, p0, Lcom/iterable/iterableapi/j;->y:Ljava/lang/String;

    iput-object p5, p0, Lcom/iterable/iterableapi/j;->z:Ljava/lang/String;

    iput-object p6, p0, Lcom/iterable/iterableapi/j;->E:Ljava/lang/String;

    iput-object p7, p0, Lcom/iterable/iterableapi/j;->F:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 14

    iget-object v0, p0, Lcom/iterable/iterableapi/j;->G:Lcom/iterable/iterableapi/k;

    iget-object v1, p0, Lcom/iterable/iterableapi/j;->w:Ljava/lang/String;

    iget-object v2, p0, Lcom/iterable/iterableapi/j;->x:Ljava/lang/String;

    iget-object v6, p0, Lcom/iterable/iterableapi/j;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/iterable/iterableapi/j;->z:Ljava/lang/String;

    iget-object v4, p0, Lcom/iterable/iterableapi/j;->E:Ljava/lang/String;

    iget-object v5, p0, Lcom/iterable/iterableapi/j;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v7

    if-nez v7, :cond_0

    return-void

    :cond_0
    if-nez v3, :cond_1

    const-string v7, "IterableApi"

    const-string v8, "registerDeviceToken: applicationName is null, check that pushIntegrationName is set in IterableConfig"

    invoke-static {v7, v8}, Ldt/b;->p(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    iget-object v7, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    iget-object v7, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v7, Laj/c;

    iget-object v7, v7, Laj/c;->x:Ljava/lang/Object;

    check-cast v7, Lcom/iterable/iterableapi/k;

    iget-object v7, v7, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    move-object v8, v5

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    invoke-virtual {v0, v5}, Lcom/google/crypto/tink/internal/l0;->B(Lorg/json/JSONObject;)V

    new-instance v9, Lorg/json/JSONObject;

    invoke-direct {v9}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v8}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v8

    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_0
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_2

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/util/Map$Entry;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-interface {v10}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v9, v11, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catch_0
    move-exception v0

    goto/16 :goto_5

    :cond_2
    const-string v8, "tokenRegistrationType"

    const-string v10, "FCM"

    invoke-virtual {v9, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v8, "firebaseCompatible"

    const/4 v10, 0x1

    invoke-virtual {v9, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    sget-object v8, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v8, v8, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v8, "context"

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget v8, Lcom/iterable/iterableapi/k2;->x:I

    if-nez v8, :cond_4

    sget-object v8, Lcom/iterable/iterableapi/k2;->w:Lcom/iterable/iterableapi/k2;

    monitor-enter v8
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    sget v11, Lcom/iterable/iterableapi/k2;->x:I

    if-nez v11, :cond_3

    invoke-static {v7}, Lcom/iterable/iterableapi/k2;->f(Landroid/content/Context;)I

    move-result v11

    sput v11, Lcom/iterable/iterableapi/k2;->x:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_3
    :goto_1
    :try_start_2
    monitor-exit v8

    move v8, v11

    goto :goto_3

    :goto_2
    monitor-exit v8

    throw v0

    :cond_4
    :goto_3
    const/4 v11, 0x3

    move-object v12, v7

    const/4 v7, 0x0

    if-ne v8, v11, :cond_5

    const-string v11, "3.6.6"

    goto :goto_4

    :cond_5
    move-object v11, v7

    :goto_4
    new-instance v13, Lcom/iterable/iterableapi/b;

    invoke-direct {v13, v8, v11}, Lcom/iterable/iterableapi/b;-><init>(ILjava/lang/String;)V

    iget-object v8, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v8, Laj/c;

    iget-object v8, v8, Laj/c;->x:Ljava/lang/Object;

    check-cast v8, Lcom/iterable/iterableapi/k;

    invoke-virtual {v8}, Lcom/iterable/iterableapi/k;->d()Ljava/lang/String;

    move-result-object v8

    invoke-static {v9, v12, v8, v13}, Le93/b;->U(Lorg/json/JSONObject;Landroid/content/Context;Ljava/lang/String;Lcom/iterable/iterableapi/b;)V

    const-string v8, "notificationsEnabled"

    invoke-static {v12}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v11

    invoke-virtual {v11}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v11

    invoke-virtual {v9, v8, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    new-instance v8, Lorg/json/JSONObject;

    invoke-direct {v8}, Lorg/json/JSONObject;-><init>()V

    const-string v11, "token"

    invoke-virtual {v8, v11, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "platform"

    const-string v11, "GCM"

    invoke-virtual {v8, v4, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "applicationName"

    invoke-virtual {v8, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "dataFields"

    invoke-virtual {v8, v3, v9}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "device"

    invoke-virtual {v5, v3, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    if-nez v1, :cond_6

    if-eqz v2, :cond_6

    const-string v1, "preferUserId"

    invoke-virtual {v5, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    :cond_6
    const-string v4, "users/registerDeviceToken"

    move-object v8, v7

    move-object v3, v0

    invoke-virtual/range {v3 .. v8}, Lcom/google/crypto/tink/internal/l0;->g0(Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/z1;Lcom/iterable/iterableapi/e0;)V
    :try_end_2
    .catch Lorg/json/JSONException; {:try_start_2 .. :try_end_2} :catch_0

    return-void

    :goto_5
    const-string v1, "IterableApiClient"

    const-string v2, "registerDeviceToken: exception"

    invoke-static {v1, v2, v0}, Ldt/b;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method
