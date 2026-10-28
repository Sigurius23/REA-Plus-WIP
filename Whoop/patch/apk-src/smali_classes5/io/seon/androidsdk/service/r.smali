.class public final Lio/seon/androidsdk/service/r;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final k:[Ljava/lang/String;

.field public static final l:Lbu/c;


# instance fields
.field public e:Landroid/content/Context;

.field public f:Landroid/content/pm/PackageManager;

.field public g:Landroid/telephony/TelephonyManager;

.field public h:Landroid/telephony/SubscriptionManager;

.field public i:Landroid/telecom/TelecomManager;

.field public j:Landroid/telephony/euicc/EuiccManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v4, "is_on_call"

    const-string v5, "sim_slot_count"

    const-string v0, "carrier_name"

    const-string v1, "carrier_country"

    const-string v2, "device_id"

    const-string v3, "network_config"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/r;->k:[Ljava/lang/String;

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/r;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/r;->l:Lbu/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 7

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v4, :cond_1

    :try_start_1
    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_0
    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;

    move-result-object v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catch_0
    :catchall_0
    :cond_1
    :goto_0
    move-object v4, v3

    goto :goto_1

    :catch_1
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v5, "carrier_name"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_2

    :cond_2
    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getNetworkCountryIso()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v4
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catchall_1
    :cond_3
    :goto_2
    move-object v4, v3

    goto :goto_3

    :catch_2
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_3
    const-string v5, "carrier_country"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    sget-object v4, Lio/seon/androidsdk/service/r;->l:Lbu/c;

    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x1c

    if-gt v5, v6, :cond_6

    iget-object v5, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-nez v5, :cond_4

    const-string v5, "Failed to get TelephonyManager"

    const/4 v6, 0x6

    invoke-virtual {v4, v6, v5}, Lbu/c;->F(ILjava/lang/String;)V

    const-string v4, ""

    goto :goto_5

    :cond_4
    iget-object v5, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v6, "android.permission.READ_PHONE_STATE"

    invoke-static {v5, v6}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_6

    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;

    move-result-object v4

    goto :goto_5

    :cond_5
    const-string v5, "There is no granted READ_PHONE_STATE permission"

    const/4 v6, 0x5

    invoke-virtual {v4, v6, v5}, Lbu/c;->F(ILjava/lang/String;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    :cond_6
    :goto_4
    move-object v4, v3

    goto :goto_5

    :catch_3
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4

    :goto_5
    const-string v5, "device_id"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/seon/androidsdk/service/p;

    const/4 v5, 0x2

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v4}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "network_config"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    :try_start_4
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->g()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->f()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    if-eqz v5, :cond_8

    :cond_7
    const/4 v4, 0x1

    :catch_4
    :cond_8
    :try_start_5
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_7

    :catchall_3
    :goto_6
    move-object v4, v3

    goto :goto_7

    :catch_5
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_7
    const-string v5, "is_on_call"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->h()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    goto :goto_8

    :catch_6
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_4
    :goto_8
    const-string v0, "sim_slot_count"

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/util/Map;
    .locals 9

    const-string v0, "android.hardware.telephony.messaging"

    const-string v1, "android.permission.READ_PHONE_STATE"

    sget-object v2, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    new-instance v4, Lio/seon/androidsdk/service/p;

    const/4 v5, 0x3

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v4}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "is_network_roaming"

    invoke-virtual {v3, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x3

    const/4 v5, 0x0

    :try_start_0
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v7, "gsm.operator.isroaming"

    invoke-static {v6, v7}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v6, v5

    goto :goto_1

    :catch_0
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v7, "gsm_roaming_state"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/16 v7, 0x8

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "data_roaming_state"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v7, "ro.com.android.dataroaming"

    invoke-static {v6, v7}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    :goto_2
    move-object v6, v5

    goto :goto_3

    :catch_1
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_3
    const-string v7, "data_roaming_state_prop"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/16 v7, 0x9

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "sim_state"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/16 v7, 0xa

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "sim_operator_name"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "sim_operator_country"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "sim_operator_code"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->l()[Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_5

    :catchall_2
    :goto_4
    move-object v6, v5

    goto :goto_5

    :catch_2
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4

    :goto_5
    const-string v7, "sim_specific_carrier_id"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->m()[Ljava/lang/String;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_7

    :catchall_3
    :goto_6
    move-object v6, v5

    goto :goto_7

    :catch_3
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_7
    const-string v7, "sim_specific_carrier_id_name"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/4 v7, 0x4

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "carrier_operator_code"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/p;

    const/4 v7, 0x5

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "line1_number"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->k()[Ljava/lang/String;

    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_9

    :catchall_4
    :goto_8
    move-object v6, v5

    goto :goto_9

    :catch_4
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_8

    :goto_9
    const-string v7, "phone_number"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v6, :cond_1

    iget-object v6, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v6, v1}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_0

    goto :goto_a

    :cond_0
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getVoiceMailNumber()Ljava/lang/String;

    move-result-object v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_b

    :catchall_5
    :cond_1
    :goto_a
    move-object v6, v5

    goto :goto_b

    :catch_5
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_a

    :goto_b
    const-string v7, "voicemail_number"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v6, :cond_3

    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v8, 0x1d

    if-ge v7, v8, :cond_2

    goto :goto_c

    :cond_2
    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getTypeAllocationCode()Ljava/lang/String;

    move-result-object v6
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_e

    :cond_3
    :goto_c
    const/4 v6, 0x0

    goto :goto_e

    :catchall_6
    :goto_d
    move-object v6, v5

    goto :goto_e

    :catch_6
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v7, "type_allocation_code"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v6, :cond_5

    iget-object v6, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v6, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_8
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    if-nez v6, :cond_4

    goto :goto_f

    :cond_4
    :try_start_8
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getMmsUAProfUrl()Ljava/lang/String;

    move-result-object v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_10

    :catch_7
    :catchall_7
    :cond_5
    :goto_f
    move-object v6, v5

    goto :goto_10

    :catch_8
    move-exception v6

    invoke-virtual {v2, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_f

    :goto_10
    const-string v7, "mms_ua_prof_url"

    invoke-virtual {v3, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    if-eqz v6, :cond_7

    iget-object v6, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    invoke-virtual {v6, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_a
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    if-nez v0, :cond_6

    goto :goto_11

    :cond_6
    :try_start_a
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getMmsUserAgent()Ljava/lang/String;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_8

    goto :goto_12

    :catch_9
    :catchall_8
    :cond_7
    :goto_11
    move-object v0, v5

    goto :goto_12

    :catch_a
    move-exception v0

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_11

    :goto_12
    const-string v6, "mms_user_agent"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_b
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->i:Landroid/telecom/TelecomManager;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_c
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    if-nez v0, :cond_8

    goto :goto_13

    :cond_8
    :try_start_c
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->i:Landroid/telecom/TelecomManager;

    invoke-virtual {v0}, Landroid/telecom/TelecomManager;->isInCall()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_b
    .catchall {:try_start_c .. :try_end_c} :catchall_9

    goto :goto_14

    :catch_b
    :catchall_9
    :cond_9
    :goto_13
    move-object v0, v5

    goto :goto_14

    :catch_c
    move-exception v0

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_13

    :goto_14
    const-string v6, "is_in_call"

    invoke-virtual {v3, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_d
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->i:Landroid/telecom/TelecomManager;

    if-eqz v0, :cond_a

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_e
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    if-eqz v0, :cond_a

    :try_start_e
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->i:Landroid/telecom/TelecomManager;

    invoke-virtual {v0}, Landroid/telecom/TelecomManager;->isInManagedCall()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_d
    .catchall {:try_start_e .. :try_end_e} :catchall_a

    goto :goto_16

    :catch_d
    :catchall_a
    :cond_a
    :goto_15
    move-object v0, v5

    goto :goto_16

    :catch_e
    move-exception v0

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_15

    :goto_16
    const-string v1, "is_in_managed_call"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/p;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "default_sms_package"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_f
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_10
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    if-nez v0, :cond_b

    goto :goto_17

    :cond_b
    :try_start_10
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v6, 0x23

    if-lt v1, v6, :cond_c

    goto :goto_17

    :cond_c
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->isSmsCapable()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_f
    .catchall {:try_start_10 .. :try_end_10} :catchall_b

    goto :goto_18

    :catch_f
    :catchall_b
    :goto_17
    move-object v0, v5

    goto :goto_18

    :catch_10
    move-exception v0

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_17

    :goto_18
    const-string v1, "is_sms_capable"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_11
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->g()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_c

    goto :goto_1b

    :catch_11
    move-exception v0

    goto :goto_1a

    :catchall_c
    :goto_19
    move-object v0, v5

    goto :goto_1b

    :goto_1a
    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_19

    :goto_1b
    const-string v1, "is_on_call_perm"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_12
    invoke-virtual {p0}, Lio/seon/androidsdk/service/r;->f()Ljava/lang/Boolean;

    move-result-object v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_d

    goto :goto_1d

    :catchall_d
    :goto_1c
    move-object v0, v5

    goto :goto_1d

    :catch_12
    move-exception v0

    invoke-virtual {v2, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1c

    :goto_1d
    const-string v1, "is_call_active_by_audio"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_13
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    const-string v1, "android.hardware.telephony.euicc"

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_d

    const-string v5, "UNSUPPORTED"

    goto :goto_1e

    :cond_d
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->j:Landroid/telephony/euicc/EuiccManager;

    invoke-virtual {v0}, Landroid/telephony/euicc/EuiccManager;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_e

    const-string v5, "ENABLED"

    goto :goto_1e

    :cond_e
    const-string v5, "DISABLED"
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_e

    :catchall_e
    :goto_1e
    const-string v0, "esim_feature"

    invoke-virtual {v3, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/p;

    const/4 v1, 0x7

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/p;-><init>(Lio/seon/androidsdk/service/r;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "sim_types"

    invoke-virtual {v3, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v3
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 3

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    iget-object p1, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    const/4 p1, 0x0

    :try_start_1
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.hardware.telephony"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_0

    move-object v0, p1

    goto :goto_0

    :cond_0
    const-string v1, "phone"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/TelephonyManager;

    :goto_0
    iput-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    :try_start_2
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v1, "telephony_subscription_service"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telephony/SubscriptionManager;

    iput-object v0, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :try_start_3
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    const-string v2, "android.software.telecom"

    invoke-virtual {v1, v2}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    const-string p1, "telecom"

    invoke-virtual {v0, p1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telecom/TelecomManager;

    :goto_1
    iput-object p1, p0, Lio/seon/androidsdk/service/r;->i:Landroid/telecom/TelecomManager;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :catchall_3
    :try_start_4
    iget-object p1, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v0, "euicc"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/telephony/euicc/EuiccManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/r;->j:Landroid/telephony/euicc/EuiccManager;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    :catchall_4
    return-void
.end method

.method public final f()Ljava/lang/Boolean;
    .locals 6

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v1, "audio"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/media/AudioManager;

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_1

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v1

    const/4 v2, 0x3

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Landroid/media/AudioManager;->isMusicActive()Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v1, v3

    :goto_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x1e

    if-lt v2, v5, :cond_3

    invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I

    move-result v0

    const/4 v2, 0x4

    if-ne v0, v2, :cond_2

    goto :goto_2

    :cond_2
    move v3, v4

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final g()Z
    .locals 3

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v1, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "telecom"

    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/telecom/TelecomManager;

    invoke-virtual {v0}, Landroid/telecom/TelecomManager;->isInCall()Z

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    return v1
.end method

.method public final h()I
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const/4 v1, -0x1

    if-nez v0, :cond_0

    return v1

    :cond_0
    :try_start_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_1

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getActiveModemCount()I

    move-result v0

    return v0

    :cond_1
    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getPhoneCount()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    return v1
.end method

.method public final i()[Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const-string v1, "DISABLED"

    const-string v2, "ENABLED"

    if-eqz v0, :cond_6

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.ACCESS_NETWORK_STATE"

    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    const-string v3, "android.permission.READ_PHONE_STATE"

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v4, "android.permission.READ_BASIC_PHONE_STATE"

    invoke-static {v0, v4}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    const-string v4, "android.hardware.telephony.data"

    invoke-virtual {v0, v4}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1d

    if-ge v0, v4, :cond_1

    goto :goto_2

    :cond_1
    const/4 v0, 0x0

    :try_start_0
    iget-object v4, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v4, :cond_4

    iget-object v4, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v4, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iget-object v4, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v4}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/telephony/SubscriptionInfo;

    iget-object v6, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v5}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v5

    invoke-virtual {v6, v5}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v5

    invoke-virtual {v5}, Landroid/telephony/TelephonyManager;->isDataRoamingEnabled()Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v5, v2

    goto :goto_1

    :cond_2
    move-object v5, v1

    :goto_1
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-array v1, v0, [Ljava/lang/String;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    return-object v1

    :cond_4
    iget-object v3, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->isDataRoamingEnabled()Z

    move-result v3

    if-eqz v3, :cond_5

    move-object v1, v2

    :cond_5
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    new-array v0, v0, [Ljava/lang/String;

    return-object v0

    :cond_6
    :goto_2
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "ro.com.android.dataroaming"

    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "true"

    invoke-static {v0, v3}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v1, v2

    goto :goto_3

    :cond_7
    const-string v2, "false"

    invoke-static {v0, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v1, "UNKNOWN"

    :goto_3
    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final j()Ljava/lang/String;
    .locals 6

    const-string v0, "getDefaultSmsPackage"

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    invoke-static {v1}, Landroid/provider/Telephony$Sms;->getDefaultSmsPackage(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_0

    invoke-static {v1}, Lhc3/i;->u(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x21

    if-lt v2, v3, :cond_1

    :try_start_1
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SENDTO"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v3, "smsto:"

    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    iget-object v3, p0, Lio/seon/androidsdk/service/r;->f:Landroid/content/pm/PackageManager;

    const-wide/32 v4, 0x10000

    invoke-static {v4, v5}, Landroid/content/pm/PackageManager$ResolveInfoFlags;->of(J)Landroid/content/pm/PackageManager$ResolveInfoFlags;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;Landroid/content/pm/PackageManager$ResolveInfoFlags;)Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v3, 0x0

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/pm/ResolveInfo;

    iget-object v2, v2, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    iget-object v1, v2, Landroid/content/pm/ActivityInfo;->packageName:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v2

    invoke-static {v0, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    :goto_1
    return-object v1
.end method

.method public final k()[Ljava/lang/String;
    .locals 4

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v1, "android.permission.READ_PHONE_NUMBERS"

    invoke-static {v0, v1}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-ge v0, v1, :cond_0

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v1}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/telephony/SubscriptionInfo;

    iget-object v3, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v2}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v2

    invoke-virtual {v3, v2}, Landroid/telephony/SubscriptionManager;->getPhoneNumber(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    new-instance v1, Lio/seon/androidsdk/service/q;

    invoke-direct {v1}, Lio/seon/androidsdk/service/q;-><init>()V

    invoke-static {v0, v1}, Lj$/util/Collection$-EL;->toArray(Ljava/util/Collection;Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_2
    :goto_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()[Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v2, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, v2}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    iget-object v2, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

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

    iget-object v4, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v3

    invoke-virtual {v4, v3}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v3

    invoke-virtual {v3}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierId()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :cond_1
    const/4 v2, 0x0

    :try_start_2
    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_2
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    :catch_1
    :cond_3
    :goto_1
    return-object v1
.end method

.method public final m()[Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    if-ge v0, v2, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/seon/androidsdk/service/r;->e:Landroid/content/Context;

    const-string v3, "android.permission.READ_PHONE_STATE"

    invoke-static {v0, v3}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lio/seon/androidsdk/service/r;->h:Landroid/telephony/SubscriptionManager;

    invoke-virtual {v3}, Landroid/telephony/SubscriptionManager;->getActiveSubscriptionInfoList()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/telephony/SubscriptionInfo;

    iget-object v5, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v4}, Landroid/telephony/SubscriptionInfo;->getSubscriptionId()I

    move-result v4

    invoke-virtual {v5, v4}, Landroid/telephony/TelephonyManager;->createForSubscriptionId(I)Landroid/telephony/TelephonyManager;

    move-result-object v4

    invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    new-array v2, v2, [Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    return-object v0

    :cond_3
    iget-object v0, p0, Lio/seon/androidsdk/service/r;->g:Landroid/telephony/TelephonyManager;

    invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSimSpecificCarrierIdName()Ljava/lang/CharSequence;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    new-array v0, v2, [Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    :cond_5
    :goto_1
    return-object v1
.end method
