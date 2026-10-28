.class public final synthetic Lal0/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;I)V
    .locals 0

    .line 1
    iput p2, p0, Lal0/f;->w:I

    iput-object p1, p0, Lal0/f;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Landroid/content/Context;I)V
    .locals 0

    .line 2
    iput p3, p0, Lal0/f;->w:I

    iput-object p2, p0, Lal0/f;->x:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    iget v0, p0, Lal0/f;->w:I

    const-string v1, "cacheDir == null"

    const-string v2, "PaymentConfiguration was not initialized. Call PaymentConfiguration.init()."

    const-string v3, "key_account_id"

    const-string v4, "key_publishable_key"

    const-string v5, "context"

    const/4 v6, 0x0

    const/4 v7, 0x0

    iget-object v8, p0, Lal0/f;->x:Landroid/content/Context;

    packed-switch v0, :pswitch_data_0

    invoke-static {v8}, Lzc1/m1;->a(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_0
    invoke-static {v8}, Lzc1/m1;->k(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-static {v8}, Lzc1/m1;->l(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-static {v8}, Lzc1/m1;->g(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-static {v8}, Lzc1/m1;->j(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-static {v8}, Lzc1/m1;->i(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-static {v8}, Lzc1/r0;->a(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-static {v8}, Lzc1/r0;->c(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-static {v8}, Lzc1/r0;->b(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-static {v8}, Lzc1/b;->a(Landroid/content/Context;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_9
    sget-object v0, Lne3/e0;->x:Ljava/lang/String;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const-string v0, "stream-device-token-storage.pb"

    invoke-static {v8, v0}, Lv63/h;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getAbsolutePath(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v6}, Ljc/b;->o(Ljava/lang/String;Z)Lne3/e0;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_2

    new-instance v0, Lux/x;

    invoke-direct {v0, v8}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v4, Lux/y;

    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v4

    :cond_0
    if-eqz v7, :cond_1

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v0, v7

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_b
    const-string v0, "PaymentSheet_LinkStore"

    invoke-virtual {v8, v0, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-static {v8}, Lui1/a;->i(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_d
    const-string v0, "FraudDetectionDataStore"

    invoke-virtual {v8, v0, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_e
    invoke-static {v8}, Lsv2/e;->l(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    return-object v0

    :pswitch_f
    invoke-static {v8}, Lsr2/a0;->a(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_10
    invoke-static {v8}, Lsr2/a0;->l(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_11
    invoke-static {v8}, Lsr2/a0;->h(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_12
    invoke-static {v8}, Lsr2/a0;->I(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_13
    sget v0, Lcom/stripe/android/view/CardNumberEditText;->p0:I

    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_5

    new-instance v0, Lux/x;

    invoke-direct {v0, v8}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_3

    new-instance v4, Lux/y;

    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v4

    :cond_3
    if-eqz v7, :cond_4

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v0, v7

    goto :goto_1

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    :goto_1
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_14
    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_8

    new-instance v0, Lux/x;

    invoke-direct {v0, v8}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v4, Lux/y;

    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v4

    :cond_6
    if-eqz v7, :cond_7

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v0, v7

    goto :goto_2

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    :goto_2
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_15
    invoke-static {v8}, Lio/getstream/chat/android/ui/common/images/StreamImageLoaderFactory;->c(Landroid/content/Context;)Lai/f;

    move-result-object v0

    return-object v0

    :pswitch_16
    const-string v0, "stripe_image_cache"

    :try_start_0
    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    const-string v2, "getPath(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljava/io/File;

    sget-object v3, Ljava/io/File;->separator:Ljava/lang/String;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Llu/c;->s(Ljava/io/File;)Llu/c;

    move-result-object v7
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    const-string v1, "stripe_image_disk_cache"

    const-string v2, "error opening cache"

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :goto_3
    return-object v7

    :pswitch_17
    const-string v0, "app_info"

    invoke-virtual {v8, v0, v6}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    return-object v0

    :pswitch_18
    invoke-static {v8}, Lfq0/b;->g(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_19
    sget-object v0, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1a
    sget-object v0, Lqh/d;->a:[Landroid/graphics/Bitmap$Config;

    invoke-virtual {v8}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    return-object v0

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_1b
    invoke-static {v8, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lux/y;->y:Lux/y;

    if-nez v0, :cond_d

    new-instance v0, Lux/x;

    invoke-direct {v0, v8}, Lux/x;-><init>(Landroid/content/Context;)V

    iget-object v0, v0, Lux/x;->a:Landroid/content/SharedPreferences;

    invoke-interface {v0, v4, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v4, Lux/y;

    invoke-interface {v0, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v0}, Lux/y;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v7, v4

    :cond_b
    if-eqz v7, :cond_c

    sput-object v7, Lux/y;->y:Lux/y;

    move-object v0, v7

    goto :goto_4

    :cond_c
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_4
    iget-object v0, v0, Lux/y;->w:Ljava/lang/String;

    return-object v0

    :pswitch_1c
    invoke-static {v8}, Lal0/j;->m0(Landroid/content/Context;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
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
