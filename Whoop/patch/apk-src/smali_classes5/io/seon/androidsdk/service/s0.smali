.class public final Lio/seon/androidsdk/service/s0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final j:[Ljava/lang/String;

.field public static final k:Lbu/c;

.field public static final l:[Ljava/lang/String;


# instance fields
.field public e:Landroid/os/PowerManager;

.field public f:Ljava/util/HashMap;

.field public g:Landroid/nfc/NfcAdapter;

.field public h:Landroid/content/Context;

.field public i:Landroid/content/SharedPreferences;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    const-string v16, "input_device_data"

    const-string v17, "power_source"

    const-string v1, "battery_charging"

    const-string v2, "battery_health"

    const-string v3, "battery_level"

    const-string v4, "battery_temperature"

    const-string v5, "battery_voltage"

    const-string v6, "battery_total_capacity"

    const-string v7, "cpu_type"

    const-string v8, "cpu_count"

    const-string v9, "cpu_speed"

    const-string v10, "cpu_hash"

    const-string v11, "last_boot_time"

    const-string v12, "physical_memory"

    const-string v13, "system_uptime"

    const-string v14, "is_nfc_available"

    const-string v15, "is_nfc_enabled"

    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/s0;->j:[Ljava/lang/String;

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/s0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/s0;->k:Lbu/c;

    const-string v0, "Hardware"

    const-string v1, "cpu_architecture"

    const-string v2, "cpu_model"

    const-string v3, "Processor"

    const-string v4, "vendor_id"

    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/s0;->l:[Ljava/lang/String;

    return-void
.end method

.method public static h()J
    .locals 9

    const-wide/16 v0, -0x1

    :try_start_0
    new-instance v2, Ljava/io/RandomAccessFile;

    const-string v3, "/sys/devices/system/cpu/cpu0/cpufreq/stats/time_in_state"

    const-string v4, "r"

    invoke-direct {v2, v3, v4}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-wide v3, v0

    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {v2}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1

    return-wide v3

    :cond_1
    const-string v6, "\\s+"

    invoke-virtual {v5, v6}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v5

    array-length v6, v5

    const/4 v7, 0x2

    if-eq v6, v7, :cond_2

    return-wide v0

    :cond_2
    const/4 v6, 0x1

    aget-object v6, v5, v6

    invoke-static {v6}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v6

    if-lez v6, :cond_0

    const/4 v6, 0x0

    aget-object v5, v5, v6

    const-string v6, "\""

    const-string v7, ""

    invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v5

    const-wide/16 v7, 0x3e8

    div-long/2addr v5, v7
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    cmp-long v7, v5, v3

    if-lez v7, :cond_0

    move-wide v3, v5

    goto :goto_0

    :catch_0
    move-wide v0, v3

    :catch_1
    return-wide v0
.end method

.method public static j()Ljava/lang/String;
    .locals 1

    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    invoke-static {v0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 12

    const-string v0, "android.intent.action.BATTERY_CHANGED"

    sget-object v1, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    new-instance v3, Lio/seon/androidsdk/service/q0;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v3}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "battery_charging"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v3, Lio/seon/androidsdk/service/q0;

    const/4 v4, 0x7

    invoke-direct {v3, p0, v4}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v3}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "battery_health"

    invoke-virtual {v2, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    const/4 v4, 0x0

    :try_start_0
    const-string v5, "level"
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 v6, -0x1

    :try_start_1
    new-instance v7, Landroid/content/IntentFilter;

    invoke-direct {v7, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-virtual {v8, v4, v7}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-virtual {v7, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catch_0
    :cond_0
    :try_start_2
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    :catch_1
    move-exception v5

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v5, v4

    goto :goto_2

    :goto_1
    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_2
    const-string v6, "battery_level"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x0

    :try_start_3
    new-instance v6, Landroid/content/IntentFilter;

    invoke-direct {v6, v0}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-virtual {v0, v4, v6}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_1

    const-string v6, "temperature"

    invoke-virtual {v0, v6, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    goto :goto_3

    :cond_1
    move v0, v5

    :goto_3
    int-to-double v6, v0

    const-wide/high16 v8, 0x4024000000000000L    # 10.0

    div-double/2addr v6, v8

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catch_2
    :catchall_1
    move-object v0, v4

    :goto_4
    const-string v6, "battery_temperature"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/16 v6, 0x8

    invoke-direct {v0, p0, v6}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "battery_voltage"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->g()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_7

    :catch_3
    move-exception v0

    goto :goto_6

    :catchall_2
    :goto_5
    move-object v0, v4

    goto :goto_7

    :goto_6
    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_5

    :goto_7
    const-string v6, "battery_total_capacity"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/16 v6, 0x9

    invoke-direct {v0, p0, v6}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "cpu_type"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    goto :goto_8

    :catch_4
    move v0, v5

    :goto_8
    :try_start_6
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    goto :goto_a

    :catchall_3
    :goto_9
    move-object v0, v4

    goto :goto_a

    :catch_5
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_9

    :goto_a
    const-string v6, "cpu_count"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/m;

    const/4 v6, 0x3

    invoke-direct {v0, p0, v6}, Lio/seon/androidsdk/service/m;-><init>(Lio/seon/androidsdk/service/g;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "cpu_speed"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/4 v6, 0x0

    invoke-direct {v0, p0, v6}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v6, "cpu_hash"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-wide/16 v6, 0x3e8

    :try_start_7
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v10

    sub-long/2addr v8, v10

    div-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_6
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    goto :goto_c

    :catchall_4
    :goto_b
    move-object v0, v4

    goto :goto_c

    :catch_6
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_b

    :goto_c
    const-string v8, "last_boot_time"

    invoke-virtual {v2, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/4 v8, 0x4

    invoke-direct {v0, p0, v8}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v8, "physical_memory"

    invoke-virtual {v2, v8, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v8

    div-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    goto :goto_e

    :catchall_5
    :goto_d
    move-object v0, v4

    goto :goto_e

    :catch_7
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v6, "system_uptime"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v0

    if-eqz v0, :cond_2

    const/4 v0, 0x1

    goto :goto_f

    :cond_2
    move v0, v5

    :goto_f
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8
    .catchall {:try_start_9 .. :try_end_9} :catchall_6

    goto :goto_12

    :catch_8
    move-exception v0

    goto :goto_11

    :catchall_6
    :goto_10
    move-object v0, v4

    goto :goto_12

    :goto_11
    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_10

    :goto_12
    const-string v6, "is_nfc_available"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_a
    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/nfc/NfcAdapter;->isEnabled()Z

    move-result v5

    :cond_3
    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_7

    goto :goto_13

    :catch_9
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_7
    :goto_13
    const-string v0, "is_nfc_enabled"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/4 v1, 0x5

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "input_device_data"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/q0;

    const/4 v1, 0x6

    invoke-direct {v0, p0, v1}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "power_source"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final b()Ljava/util/Map;
    .locals 6

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x0

    const/16 v3, 0x1d

    :try_start_0
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v3, :cond_0

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v4

    invoke-virtual {v4}, Landroid/nfc/NfcAdapter;->isSecureNfcSupported()Z

    move-result v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_0
    move v4, v2

    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    const-string v5, "is_secure_nfc_available"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v3, :cond_1

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {p0}, Lio/seon/androidsdk/service/s0;->i()Landroid/nfc/NfcAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/nfc/NfcAdapter;->isSecureNfcEnabled()Z

    move-result v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :cond_1
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "is_secure_nfc_enabled"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x0

    :try_start_2
    iget-object v3, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    const-string v4, "activity"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/ActivityManager;

    invoke-virtual {v3}, Landroid/app/ActivityManager;->getDeviceConfigurationInfo()Landroid/content/pm/ConfigurationInfo;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/pm/ConfigurationInfo;->getGlEsVersion()Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catch_2
    :catchall_0
    move-object v3, v2

    :goto_1
    const-string v4, "gles_version"

    invoke-virtual {v1, v4, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x3

    :try_start_3
    sget-object v4, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    invoke-static {v4}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_4

    :catch_3
    move-exception v4

    goto :goto_3

    :catchall_1
    :goto_2
    move-object v4, v2

    goto :goto_4

    :goto_3
    invoke-virtual {v0, v3, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_4
    const-string v5, "supported_abis"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Lio/seon/androidsdk/service/q0;

    const/4 v5, 0x2

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    invoke-static {v4}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v4

    const-string v5, "calculated_total_battery_capacity"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    new-instance v4, Lio/seon/androidsdk/service/q0;

    const/4 v5, 0x1

    invoke-direct {v4, p0, v5}, Lio/seon/androidsdk/service/q0;-><init>(Lio/seon/androidsdk/service/s0;I)V

    sget-object v5, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    :try_start_5
    invoke-virtual {v4}, Lio/seon/androidsdk/service/q0;->a()Ljava/lang/Object;

    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_5

    :catchall_2
    move-object v4, v2

    :goto_5
    :try_start_6
    check-cast v4, Ljava/lang/Boolean;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    move-object v2, v4

    goto :goto_6

    :catch_4
    move-exception v4

    invoke-virtual {v0, v3, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_3
    :goto_6
    const-string v0, "is_power_saving"

    invoke-virtual {v1, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 2

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    iget-object p1, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    const-string v0, "seonLocalPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/s0;->i:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    const-string v0, "power"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/os/PowerManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/s0;->e:Landroid/os/PowerManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    new-instance p1, Landroidx/lifecycle/z0;

    const/16 v0, 0xf

    invoke-direct {p1, p0, v0}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    :try_start_2
    invoke-virtual {p1}, Landroidx/lifecycle/z0;->run()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    return-void
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/seon/androidsdk/service/s0;->f:Ljava/util/HashMap;

    if-eqz v1, :cond_3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lio/seon/androidsdk/service/s0;->f:Ljava/util/HashMap;

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    check-cast p1, Ljava/lang/String;

    return-object p1

    :cond_1
    iget-object v1, p0, Lio/seon/androidsdk/service/s0;->f:Ljava/util/HashMap;

    invoke-virtual {v1}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    :goto_1
    return-object v0
.end method

.method public final g()D
    .locals 4

    const-string v0, "com.android.internal.os.PowerProfile"

    :try_start_0
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const-class v2, Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v1

    iget-object v2, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v0

    const-string v2, "getBatteryCapacity"

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-wide v0

    :catch_0
    move-exception v0

    const-string v1, "BatTot"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public final i()Landroid/nfc/NfcAdapter;
    .locals 1

    iget-object v0, p0, Lio/seon/androidsdk/service/s0;->g:Landroid/nfc/NfcAdapter;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-static {v0}, Landroid/nfc/NfcAdapter;->getDefaultAdapter(Landroid/content/Context;)Landroid/nfc/NfcAdapter;

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/s0;->g:Landroid/nfc/NfcAdapter;

    :cond_0
    iget-object v0, p0, Lio/seon/androidsdk/service/s0;->g:Landroid/nfc/NfcAdapter;

    return-object v0
.end method
