.class public final Lcom/iterable/iterableapi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/iterable/iterableapi/f;


# instance fields
.field public final synthetic w:I

.field public x:Lcom/iterable/iterableapi/k;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput v0, p0, Lcom/iterable/iterableapi/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/iterable/iterableapi/k;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lcom/iterable/iterableapi/i;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/iterable/iterableapi/i;->x:Lcom/iterable/iterableapi/k;

    return-void
.end method

.method private final c()V
    .locals 0

    return-void
.end method

.method private final d()V
    .locals 0

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget v0, p0, Lcom/iterable/iterableapi/i;->w:I

    return-void
.end method

.method public final b()V
    .locals 8

    iget v0, p0, Lcom/iterable/iterableapi/i;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    iget-object v0, p0, Lcom/iterable/iterableapi/i;->x:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->a()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, v0, Lcom/iterable/iterableapi/k;->f:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :cond_0
    return-void

    :pswitch_0
    iget-object v1, p0, Lcom/iterable/iterableapi/i;->x:Lcom/iterable/iterableapi/k;

    iget-boolean v0, v1, Lcom/iterable/iterableapi/k;->i:Z

    if-nez v0, :cond_2

    const/4 v0, 0x1

    iput-boolean v0, v1, Lcom/iterable/iterableapi/k;->i:Z

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v0}, Lcom/iterable/iterableapi/k;->k()V

    :cond_1
    iget-object v0, v1, Lcom/iterable/iterableapi/k;->j:Lcom/google/crypto/tink/internal/l0;

    new-instance v7, Lcom/iterable/iterableapi/k2;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    :try_start_0
    const-string v2, "platform"

    const-string v3, "Android"

    invoke-virtual {v5, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "appPackageName"

    iget-object v3, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v3, Laj/c;

    iget-object v3, v3, Laj/c;->x:Ljava/lang/Object;

    check-cast v3, Lcom/iterable/iterableapi/k;

    iget-object v3, v3, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v5, v2, v3}, Lorg/json/JSONObject;->putOpt(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "SDKVersion"

    const-string v3, "3.6.6"

    invoke-virtual {v5, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v2, "systemVersion"

    sget-object v3, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v5, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v4, "mobile/getRemoteConfiguration"

    invoke-virtual {v0}, Lcom/google/crypto/tink/internal/l0;->T()Lcom/iterable/iterableapi/l2;

    move-result-object v2

    iget-object v0, v0, Lcom/google/crypto/tink/internal/l0;->x:Ljava/lang/Object;

    check-cast v0, Laj/c;

    iget-object v0, v0, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/k;

    iget-object v3, v0, Lcom/iterable/iterableapi/k;->c:Ljava/lang/String;

    iget-object v6, v0, Lcom/iterable/iterableapi/k;->g:Ljava/lang/String;

    invoke-interface/range {v2 .. v7}, Lcom/iterable/iterableapi/l2;->c(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Ljava/lang/String;Lcom/iterable/iterableapi/f0;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    :cond_2
    :goto_0
    iget-object v0, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-eqz v0, :cond_5

    sget-object v0, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v0, v0, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    iget-object v0, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-static {v0}, Landroidx/core/app/NotificationManagerCompat;->from(Landroid/content/Context;)Landroidx/core/app/NotificationManagerCompat;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/core/app/NotificationManagerCompat;->areNotificationsEnabled()Z

    move-result v0

    sget-object v2, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v2, v2, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    const-string v3, "com.iterable.iterableapi"

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "itbl_notifications_enabled"

    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v5

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v4

    sget-object v6, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v6}, Lcom/iterable/iterableapi/k;->i()Z

    move-result v6

    if-eqz v6, :cond_6

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->a:Landroid/content/Context;

    invoke-static {v1}, Le93/b;->V(Landroid/content/Context;)Z

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    iget-object v1, v1, Lcom/iterable/iterableapi/k;->b:Lcom/iterable/iterableapi/w;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v5, :cond_4

    if-eq v4, v0, :cond_4

    sget-object v1, Lcom/iterable/iterableapi/k;->r:Lcom/iterable/iterableapi/k;

    invoke-virtual {v1}, Lcom/iterable/iterableapi/k;->k()V

    :cond_4
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1, v3, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_2

    :cond_5
    :goto_1
    const-string v0, "IterableApi"

    const-string v1, "onForeground: _applicationContext is null"

    invoke-static {v0, v1}, Ldt/b;->a0(Ljava/lang/String;Ljava/lang/String;)V

    :cond_6
    :goto_2
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
