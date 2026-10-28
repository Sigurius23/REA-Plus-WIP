.class public final synthetic Lio/seon/androidsdk/service/q0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/seon/androidsdk/service/t0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lio/seon/androidsdk/service/s0;


# direct methods
.method public synthetic constructor <init>(Lio/seon/androidsdk/service/s0;I)V
    .locals 0

    iput p2, p0, Lio/seon/androidsdk/service/q0;->a:I

    iput-object p1, p0, Lio/seon/androidsdk/service/q0;->b:Lio/seon/androidsdk/service/s0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lio/seon/androidsdk/service/q0;->a:I

    const/16 v1, 0x8

    const-string v2, "plugged"

    const/4 v3, 0x6

    const/4 v4, 0x5

    const/4 v5, -0x1

    const/4 v6, 0x4

    const/4 v7, 0x2

    const-string v8, "android.intent.action.BATTERY_CHANGED"

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    iget-object v12, p0, Lio/seon/androidsdk/service/q0;->b:Lio/seon/androidsdk/service/s0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_0
    const-string v0, "cpu_model"

    invoke-virtual {v12, v0}, Lio/seon/androidsdk/service/s0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    :goto_0
    move-object v11, v0

    goto :goto_2

    :cond_0
    const-string v0, "Processor"

    invoke-virtual {v12, v0}, Lio/seon/androidsdk/service/s0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-string v0, "Hardware"

    invoke-virtual {v12, v0}, Lio/seon/androidsdk/service/s0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    sget-object v0, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v1, v0

    if-ge v9, v1, :cond_4

    aget-object v0, v0, v9

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :catch_0
    :cond_4
    :goto_2
    return-object v11

    :pswitch_0
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_1
    const-string v0, "voltage"
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    new-instance v1, Landroid/content/IntentFilter;

    invoke-direct {v1, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v2, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-virtual {v2, v11, v1}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-virtual {v1, v0, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :catch_1
    :cond_5
    :try_start_3
    invoke-static {v5}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2

    if-gt v0, v7, :cond_6

    mul-int/lit16 v5, v5, 0x3e8

    :cond_6
    move v9, v5

    :catch_2
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_4
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v1, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-virtual {v1, v11, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v1, "health"

    invoke-virtual {v0, v1, v9}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    :cond_7
    const/4 v0, 0x7

    if-ne v9, v0, :cond_8

    const-string v11, "COLD"

    goto :goto_3

    :cond_8
    if-ne v9, v6, :cond_9

    const-string v11, "DEAD"

    goto :goto_3

    :cond_9
    if-ne v9, v7, :cond_a

    const-string v11, "GOOD"

    goto :goto_3

    :cond_a
    const/4 v0, 0x3

    if-ne v9, v0, :cond_b

    const-string v11, "OVER HEAT"

    goto :goto_3

    :cond_b
    if-ne v9, v4, :cond_c

    const-string v11, "OVER VOLTAGE"

    goto :goto_3

    :cond_c
    if-ne v9, v10, :cond_d

    const-string v11, "UNKNOWN"

    goto :goto_3

    :cond_d
    if-ne v9, v3, :cond_e

    const-string v11, "UNSPECIFIED FAILURE"
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_3

    :catch_3
    :cond_e
    :goto_3
    return-object v11

    :pswitch_2
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    iget-object v3, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    invoke-virtual {v3, v11, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v9

    :cond_f
    if-eq v9, v10, :cond_13

    if-eq v9, v7, :cond_12

    if-eq v9, v6, :cond_11

    if-eq v9, v1, :cond_10

    const-string v0, "NO DATA"

    goto :goto_4

    :cond_10
    const-string v0, "DOCK"

    goto :goto_4

    :cond_11
    const-string v0, "WIRELESS"

    goto :goto_4

    :cond_12
    const-string v0, "USB"

    goto :goto_4

    :cond_13
    const-string v0, "AC"

    :goto_4
    return-object v0

    :pswitch_3
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    :try_start_5
    iget-object v1, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    const-string v2, "input"

    invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/hardware/input/InputManager;

    :goto_5
    invoke-virtual {v1}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    move-result-object v2

    array-length v2, v2

    if-ge v9, v2, :cond_14

    invoke-virtual {v1}, Landroid/hardware/input/InputManager;->getInputDeviceIds()[I

    move-result-object v2

    aget v2, v2, v9

    invoke-virtual {v1, v2}, Landroid/hardware/input/InputManager;->getInputDevice(I)Landroid/view/InputDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/InputDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Landroid/view/InputDevice;->getVendorId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_4

    add-int/lit8 v9, v9, 0x1

    goto :goto_5

    :cond_14
    move-object v11, v0

    :catch_4
    return-object v11

    :pswitch_4
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v0, "phiMem"

    :try_start_6
    iget-object v1, v12, Lio/seon/androidsdk/service/s0;->i:Landroid/content/SharedPreferences;

    invoke-interface {v1, v0}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_15

    iget-object v1, v12, Lio/seon/androidsdk/service/s0;->i:Landroid/content/SharedPreferences;

    const-wide/16 v2, -0x1

    invoke-interface {v1, v0, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long v3, v1, v3

    if-lez v3, :cond_15

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_5

    goto :goto_9

    :catch_5
    :cond_15
    :try_start_7
    new-instance v1, Ljava/io/RandomAccessFile;

    const-string v2, "/proc/meminfo"

    const-string v3, "r"

    invoke-direct {v1, v2, v3}, Ljava/io/RandomAccessFile;-><init>(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    :try_start_8
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->readLine()Ljava/lang/String;

    move-result-object v2

    const-string v3, "(\\d+)"

    invoke-static {v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v2

    const-string v3, ""

    :goto_6
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->find()Z

    move-result v4

    if-eqz v4, :cond_16

    invoke-virtual {v2, v10}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :catchall_0
    move-exception v0

    goto :goto_a

    :cond_16
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    if-nez v3, :cond_17

    :goto_7
    :try_start_9
    invoke-virtual {v1}, Ljava/io/RandomAccessFile;->close()V
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_6

    goto :goto_8

    :cond_17
    :try_start_a
    invoke-static {v3}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    iget-object v4, v12, Lio/seon/androidsdk/service/s0;->i:Landroid/content/SharedPreferences;

    invoke-interface {v4}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v4

    invoke-interface {v4, v0, v2, v3}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v4}, Landroid/content/SharedPreferences$Editor;->apply()V

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v11
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    goto :goto_7

    :catch_6
    :goto_8
    move-object v0, v11

    :goto_9
    return-object v0

    :goto_a
    move-object v11, v1

    goto :goto_b

    :catchall_1
    move-exception v0

    :goto_b
    if-eqz v11, :cond_18

    :try_start_b
    invoke-virtual {v11}, Ljava/io/RandomAccessFile;->close()V
    :try_end_b
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_7

    :catch_7
    :cond_18
    throw v0

    :pswitch_5
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_c
    iget-object v0, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    new-instance v3, Landroid/content/IntentFilter;

    invoke-direct {v3, v8}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v11, v3}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_19

    invoke-virtual {v0, v2, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v5

    :cond_19
    if-eq v5, v10, :cond_1b

    if-eq v5, v7, :cond_1b

    if-ne v5, v6, :cond_1a

    goto :goto_c

    :cond_1a
    move v0, v9

    goto :goto_d

    :cond_1b
    :goto_c
    move v0, v10

    :goto_d
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_8

    const/16 v3, 0x21

    if-lt v2, v3, :cond_1d

    if-ne v5, v1, :cond_1c

    move v9, v10

    :cond_1c
    or-int/2addr v9, v0

    goto :goto_e

    :cond_1d
    move v9, v0

    :catch_8
    :goto_e
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-wide/16 v0, 0x0

    :try_start_d
    iget-object v2, v12, Lio/seon/androidsdk/service/s0;->h:Landroid/content/Context;

    const-string v3, "batterymanager"

    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/BatteryManager;

    if-eqz v2, :cond_1e

    invoke-virtual {v2, v6}, Landroid/os/BatteryManager;->getIntProperty(I)I

    move-result v3

    invoke-virtual {v2, v10}, Landroid/os/BatteryManager;->getIntProperty(I)I

    move-result v2

    int-to-double v4, v2

    const-wide v6, 0x408f400000000000L    # 1000.0

    div-double/2addr v4, v6

    cmpl-double v2, v4, v0

    if-lez v2, :cond_1e

    if-lez v3, :cond_1e

    int-to-double v2, v3

    const-wide/high16 v6, 0x4059000000000000L    # 100.0

    div-double/2addr v2, v6

    div-double/2addr v4, v2

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v0
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_9

    long-to-double v0, v0

    :catch_9
    :cond_1e
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    return-object v0

    :pswitch_7
    iget-object v0, v12, Lio/seon/androidsdk/service/s0;->e:Landroid/os/PowerManager;

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Landroid/os/PowerManager;->isPowerSaveMode()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v11

    :cond_1f
    return-object v11

    :pswitch_8
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    :try_start_e
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    move v1, v9

    :goto_f
    sget-object v2, Landroid/os/Build;->SUPPORTED_ABIS:[Ljava/lang/String;

    array-length v5, v2

    if-ge v1, v5, :cond_21

    aget-object v2, v2, v1

    if-eqz v2, :cond_20

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_20

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_10

    :cond_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_21
    :goto_10
    sget-object v1, Lio/seon/androidsdk/service/s0;->l:[Ljava/lang/String;

    :goto_11
    if-ge v9, v4, :cond_23

    aget-object v2, v1, v9

    invoke-virtual {v12, v2}, Lio/seon/androidsdk/service/s0;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_22

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_22
    add-int/lit8 v9, v9, 0x1

    goto :goto_11

    :cond_23
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v1
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_c

    if-lez v1, :cond_24

    :try_start_f
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-string v1, "UTF-8"

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    const-string v1, "SHA-256"

    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    move-result-object v1

    invoke-virtual {v1}, Ljava/security/MessageDigest;->reset()V

    invoke-virtual {v1, v0}, Ljava/security/MessageDigest;->update([B)V

    invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B

    move-result-object v0

    invoke-static {v0}, Lio/seon/androidsdk/service/o;->b([B)Ljava/lang/String;

    move-result-object v11
    :try_end_f
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_f .. :try_end_f} :catch_b
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_f .. :try_end_f} :catch_a
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_c

    goto :goto_13

    :catch_a
    move-exception v0

    goto :goto_12

    :catch_b
    move-exception v0

    :goto_12
    :try_start_10
    sget-object v1, Lio/seon/androidsdk/service/s0;->k:Lbu/c;

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V
    :try_end_10
    .catch Ljava/lang/Exception; {:try_start_10 .. :try_end_10} :catch_c

    :catch_c
    :cond_24
    :goto_13
    return-object v11

    :pswitch_data_0
    .packed-switch 0x0
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
