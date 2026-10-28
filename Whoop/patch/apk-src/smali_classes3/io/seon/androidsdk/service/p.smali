.class public final synthetic Lio/seon/androidsdk/service/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/r;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/r;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/p;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 8

    iget v0, p0, Lio/seon/androidsdk/service/p;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/SubscriptionInfo;

    iget-object v4, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_2

    :cond_2
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_3

    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperatorName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    :cond_3
    :goto_1
    const/4 v0, 0x0

    :goto_2
    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    :try_start_1
    iget-object v2, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const-string v3, "android.hardware.telephony"

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :catch_1
    move v2, v1

    :goto_3
    const/4 v3, 0x0

    if-eqz v2, :cond_8

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v2, :cond_4

    goto/16 :goto_5

    :cond_4
    :try_start_2
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v4, 0x1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Absent"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Network Locked"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "PIN Locked"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "PUK Locked"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Ready"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "State Unknown"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "IO Error"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v5, 0x9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Restricted"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Not Ready"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const-string v6, "Permanently Disabled"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/r;->h()I

    move-result v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const-string v6, "Unknown"

    if-le v5, v4, :cond_6

    :try_start_3
    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    :goto_4
    if-ge v1, v5, :cond_5

    iget-object v7, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v7, v1}, Landroid/telephony/TelephonyManager;->getSimState(I)I

    move-result v7

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, ";"

    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v1, 0x1

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_6
    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-eqz v0, :cond_7

    move-object v3, v0

    goto :goto_5

    :cond_7
    move-object v3, v6

    :catch_2
    :cond_8
    :goto_5
    return-object v3

    :pswitch_1
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/r;->i()[Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_4
    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v2, :cond_a

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v2, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_a

    iget-object v0, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v0}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/SubscriptionInfo;

    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "SIM"

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/telephony/SubscriptionInfo;->isEmbedded()Z

    move-result v2

    if-eqz v2, :cond_9

    const-string v2, "ESIM"

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_8

    :cond_9
    const-string v2, "PHYSICAL"

    :goto_7
    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    goto :goto_6

    :goto_8
    const-string v1, "simt"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    :cond_a
    return-object v1

    :pswitch_3
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-virtual {v0}, Lio/seon/androidsdk/service/r;->j()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const/4 v2, 0x0

    if-eqz v1, :cond_f

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    if-gt v1, v3, :cond_b

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_SMS"

    invoke-static {v1, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_NUMBERS"

    invoke-static {v1, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_c

    goto :goto_a

    :cond_c
    :try_start_5
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v1, :cond_e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    :try_start_6
    iget-object v3, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/SubscriptionInfo;

    iget-object v5, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4

    goto :goto_9

    :catch_4
    :cond_d
    const/4 v0, 0x0

    :try_start_7
    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    move-object v2, v0

    goto :goto_a

    :cond_e
    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_5

    :catch_5
    :cond_f
    :goto_a
    return-object v2

    :pswitch_5
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const/4 v2, 0x0

    if-nez v1, :cond_10

    goto :goto_c

    :cond_10
    :try_start_8
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v1, :cond_12

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_12

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    :try_start_9
    iget-object v3, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/SubscriptionInfo;

    iget-object v5, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_b

    :catch_6
    :cond_11
    const/4 v0, 0x0

    :try_start_a
    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    move-object v2, v0

    goto :goto_c

    :cond_12
    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v2
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_7

    :catch_7
    :goto_c
    return-object v2

    :pswitch_6
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    :try_start_b
    iget-object v2, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v2, :cond_15

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    const-string v3, "android.hardware.telephony.radio.access"

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_e

    :cond_13
    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v2, :cond_14

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v2, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_14

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/SubscriptionInfo;

    iget-object v4, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->isNetworkRoaming()Z

    move-result v3

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_d

    :cond_14
    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->isNetworkRoaming()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_8

    goto :goto_f

    :cond_15
    :goto_e
    const/4 v1, 0x0

    :catch_8
    :cond_16
    :goto_f
    return-object v1

    :pswitch_7
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "connectivity"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/net/ConnectivityManager;

    if-nez v1, :cond_17

    goto :goto_11

    :cond_17
    iget-object v2, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v2, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_19

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1d

    const/4 v4, 0x1

    if-lt v2, v3, :cond_18

    invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1, v4}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v1

    if-eqz v1, :cond_19

    goto :goto_10

    :cond_18
    invoke-virtual {v1, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v1

    if-eqz v1, :cond_19

    invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v1

    if-eqz v1, :cond_19

    :goto_10
    const-string v0, "WIFI"

    goto/16 :goto_12

    :cond_19
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v1, :cond_1a

    goto :goto_11

    :cond_1a
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    const-string v2, "UNKNOWN"

    if-nez v1, :cond_1b

    sget-object v0, Lio/seon/androidsdk/service/r;->l:Lbu/c;

    const-string v1, "There is no granted READ_PHONE_STATE permission"

    const/4 v3, 0x5

    invoke-virtual {v0, v3, v1}, Lbu/c;->F(ILjava/lang/String;)V

    :pswitch_8
    move-object v0, v2

    goto :goto_12

    :cond_1b
    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDataNetworkType()I

    move-result v0

    packed-switch v0, :pswitch_data_1

    :goto_11
    :pswitch_9
    const-string v0, "No wifi or cellular"

    goto :goto_12

    :pswitch_a
    const-string v0, "NR"

    goto :goto_12

    :pswitch_b
    const-string v0, "IWLAN"

    goto :goto_12

    :pswitch_c
    const-string v0, "TD_SCDMA"

    goto :goto_12

    :pswitch_d
    const-string v0, "GSM"

    goto :goto_12

    :pswitch_e
    const-string v0, "HSPAP"

    goto :goto_12

    :pswitch_f
    const-string v0, "EHRPD"

    goto :goto_12

    :pswitch_10
    const-string v0, "LTE"

    goto :goto_12

    :pswitch_11
    const-string v0, "EVDO_B"

    goto :goto_12

    :pswitch_12
    const-string v0, "IDEN"

    goto :goto_12

    :pswitch_13
    const-string v0, "HSPA"

    goto :goto_12

    :pswitch_14
    const-string v0, "HSUPA"

    goto :goto_12

    :pswitch_15
    const-string v0, "HSDPA"

    goto :goto_12

    :pswitch_16
    const-string v0, "1xRTT"

    goto :goto_12

    :pswitch_17
    const-string v0, "EVDO_A"

    goto :goto_12

    :pswitch_18
    const-string v0, "EVDO_0"

    goto :goto_12

    :pswitch_19
    const-string v0, "CDMA"

    goto :goto_12

    :pswitch_1a
    const-string v0, "UMTS"

    goto :goto_12

    :pswitch_1b
    const-string v0, "EDGE"

    goto :goto_12

    :pswitch_1c
    const-string v0, "GPRS"

    :goto_12
    return-object v0

    :pswitch_1d
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v1, :cond_1c

    goto :goto_14

    :cond_1c
    :try_start_c
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v1, :cond_1e

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1e

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/SubscriptionInfo;

    iget-object v4, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1d
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_15

    :cond_1e
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_1f

    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimOperator()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_9

    goto :goto_15

    :catch_9
    :cond_1f
    :goto_14
    const/4 v0, 0x0

    :goto_15
    return-object v0

    :pswitch_1e
    iget-object v0, p0, Lio/seon/androidsdk/service/p;->b:Lio/seon/androidsdk/service/r;

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v1, :cond_20

    goto :goto_17

    :cond_20
    :try_start_d
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v1, :cond_22

    iget-object v1, v0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v1, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_22

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, v0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_16
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/telephony/SubscriptionInfo;

    iget-object v4, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_21
    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    goto :goto_18

    :cond_22
    iget-object v1, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getSimState()I

    move-result v1

    const/4 v2, 0x5

    if-ne v1, v2, :cond_23

    iget-object v0, v0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimCountryIso()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_a

    goto :goto_18

    :catch_a
    :cond_23
    :goto_17
    const/4 v0, 0x0

    :goto_18
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1e
        :pswitch_1d
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_8
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
        :pswitch_9
        :pswitch_a
    .end packed-switch
.end method
