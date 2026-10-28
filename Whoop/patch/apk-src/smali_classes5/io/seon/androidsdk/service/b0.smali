.class public final Lio/seon/androidsdk/service/b0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final m:[Ljava/lang/String;

.field public static final n:Lbu/c;

.field public static final o:Lio/seon/androidsdk/service/r0;

.field public static final p:Lio/seon/androidsdk/service/r0;


# instance fields
.field public e:Lio/seon/androidsdk/service/SeonNT;

.field public f:Landroid/content/ClipboardManager;

.field public g:Landroid/content/Context;

.field public h:Landroid/hardware/SensorManager;

.field public i:Ljava/util/List;

.field public j:[I

.field public k:Landroid/view/WindowManager;

.field public l:Lfo/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 18

    const-string v16, "is_tablet"

    const-string v17, "true_device_id_source"

    const-string v1, "android_id"

    const-string v2, "build_device"

    const-string v3, "build_model"

    const-string v4, "build_hardware"

    const-string v5, "device_orientation"

    const-string v6, "free_storage"

    const-string v7, "has_proximity_sensor"

    const-string v8, "pasteboard_hash"

    const-string v9, "screen_height"

    const-string v10, "screen_width"

    const-string v11, "screen_scale"

    const-string v12, "screen_brightness"

    const-string v13, "sensor_hash"

    const-string v14, "total_storage"

    const-string v15, "gsf_id"

    filled-new-array/range {v1 .. v17}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/b0;->m:[Ljava/lang/String;

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/b0;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/b0;->n:Lbu/c;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    const-wide/16 v1, 0x7530

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/b0;->o:Lio/seon/androidsdk/service/r0;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/b0;->p:Lio/seon/androidsdk/service/r0;

    return-void
.end method

.method public static h()[I
    .locals 6

    const/16 v0, 0x1b

    new-array v0, v0, [I

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput v2, v0, v1

    const/4 v1, 0x2

    aput v1, v0, v2

    const/4 v2, 0x4

    aput v2, v0, v1

    const/4 v1, 0x3

    const/4 v3, 0x5

    aput v3, v0, v1

    const/4 v1, 0x6

    aput v1, v0, v2

    const/16 v2, 0x8

    aput v2, v0, v3

    const/16 v3, 0x9

    aput v3, v0, v1

    const/4 v1, 0x7

    const/16 v4, 0xa

    aput v4, v0, v1

    const/16 v1, 0xb

    aput v1, v0, v2

    const/16 v2, 0xc

    aput v2, v0, v3

    const/16 v3, 0xd

    aput v3, v0, v4

    const/16 v4, 0xe

    aput v4, v0, v1

    const/16 v1, 0xf

    aput v1, v0, v2

    const/16 v2, 0x10

    aput v2, v0, v3

    const/16 v3, 0x11

    aput v3, v0, v4

    const/16 v4, 0x12

    aput v4, v0, v1

    const/16 v1, 0x13

    aput v1, v0, v2

    const/16 v2, 0x14

    aput v2, v0, v3

    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v5, 0x15

    aput v5, v0, v4

    const/16 v4, 0x1c

    aput v4, v0, v1

    const/16 v1, 0x1d

    aput v1, v0, v2

    const/16 v1, 0x1e

    aput v1, v0, v5

    const/16 v2, 0x16

    const/16 v4, 0x1f

    aput v4, v0, v2

    const/16 v2, 0x17

    const/high16 v4, 0x10000

    aput v4, v0, v2

    const/16 v2, 0x18

    const/16 v4, 0x22

    aput v4, v0, v2

    const/16 v2, 0x19

    const/16 v4, 0x23

    aput v4, v0, v2

    if-lt v3, v1, :cond_0

    const/16 v1, 0x1a

    const/16 v2, 0x24

    aput v2, v0, v1

    :cond_0
    return-object v0
.end method

.method public static i()J
    .locals 5

    :try_start_0
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v1

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCountLong()J

    move-result-wide v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    mul-long/2addr v1, v3

    return-wide v1

    :catch_0
    move-exception v0

    const-string v1, "TotSD"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/16 v0, -0x1

    return-wide v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 9

    const-string v0, "android_id"

    sget-object v1, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x3

    const/4 v4, 0x0

    :try_start_0
    iget-object v5, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v5

    invoke-static {v5, v0}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v5, v4

    goto :goto_1

    :catch_0
    move-exception v5

    invoke-virtual {v1, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_2

    :catch_1
    :catchall_1
    move-object v0, v4

    :goto_2
    const-string v5, "build_device"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_3

    :catch_2
    :catchall_2
    move-object v0, v4

    :goto_3
    const-string v5, "build_model"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_4

    :catch_3
    :catchall_3
    move-object v0, v4

    :goto_4
    const-string v5, "build_hardware"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/z;

    const/4 v5, 0x3

    invoke-direct {v0, p0, v5}, Lio/seon/androidsdk/service/z;-><init>(Lio/seon/androidsdk/service/b0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v5, "device_orientation"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v0, v5}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSizeLong()J

    move-result-wide v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getAvailableBlocksLong()J

    move-result-wide v7
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    mul-long/2addr v5, v7

    goto :goto_5

    :catch_4
    move-exception v0

    :try_start_5
    const-string v5, "FreeSD"

    invoke-static {v5, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const-wide/16 v5, -0x1

    :goto_5
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_7

    :catchall_4
    :goto_6
    move-object v0, v4

    goto :goto_7

    :catch_5
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_7
    const-string v5, "free_storage"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v5, 0x1

    :try_start_6
    iget-object v6, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v6

    const-string v7, "android.hardware.sensor.proximity"

    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_0

    :goto_8
    move v6, v5

    goto :goto_9

    :cond_0
    iget-object v6, p0, Lio/seon/androidsdk/service/b0;->h:Landroid/hardware/SensorManager;

    const/16 v7, 0x8

    invoke-virtual {v6, v7}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v6

    if-eqz v6, :cond_1

    goto :goto_8

    :cond_1
    move v6, v0

    :goto_9
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_b

    :catchall_5
    :goto_a
    move-object v6, v4

    goto :goto_b

    :catch_6
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_a

    :goto_b
    const-string v7, "has_proximity_sensor"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/z;

    const/4 v7, 0x4

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/z;-><init>(Lio/seon/androidsdk/service/b0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "pasteboard_hash"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_7
    invoke-virtual {p0}, Lio/seon/androidsdk/service/b0;->g()Lfo/c;

    move-result-object v6

    iget v6, v6, Lfo/c;->c:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_d

    :catchall_6
    :goto_c
    move-object v6, v4

    goto :goto_d

    :catch_7
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_c

    :goto_d
    const-string v7, "screen_height"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    invoke-virtual {p0}, Lio/seon/androidsdk/service/b0;->g()Lfo/c;

    move-result-object v6

    iget v6, v6, Lfo/c;->a:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_f

    :catchall_7
    :goto_e
    move-object v6, v4

    goto :goto_f

    :catch_8
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_e

    :goto_f
    const-string v7, "screen_width"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    invoke-virtual {p0}, Lio/seon/androidsdk/service/b0;->g()Lfo/c;

    move-result-object v6

    iget v6, v6, Lfo/c;->b:F

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    goto :goto_11

    :catchall_8
    :goto_10
    move-object v6, v4

    goto :goto_11

    :catch_9
    move-exception v6

    invoke-virtual {v1, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_10

    :goto_11
    const-string v7, "screen_scale"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/z;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/z;-><init>(Lio/seon/androidsdk/service/b0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "screen_brightness"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/z;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/z;-><init>(Lio/seon/androidsdk/service/b0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "sensor_hash"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/m;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/m;-><init>(Lio/seon/androidsdk/service/g;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "total_storage"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/z;

    const/4 v7, 0x2

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/z;-><init>(Lio/seon/androidsdk/service/b0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "gsf_id"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_a
    iget-object v6, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    const-string v7, "phone"

    invoke-virtual {v6, v7}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/telephony/TelephonyManager;

    invoke-virtual {v6}, Landroid/telephony/TelephonyManager;->getPhoneType()I

    move-result v6
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    if-nez v6, :cond_2

    move v0, v5

    :catch_a
    :cond_2
    :try_start_b
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_b
    .catchall {:try_start_b .. :try_end_b} :catchall_9

    goto :goto_13

    :catchall_9
    :goto_12
    move-object v0, v4

    goto :goto_13

    :catch_b
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_12

    :goto_13
    const-string v5, "is_tablet"

    invoke-virtual {v2, v5, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_c
    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->e:Lio/seon/androidsdk/service/SeonNT;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    :try_start_d
    invoke-virtual {v0}, Lio/seon/androidsdk/service/SeonNT;->b()Ljava/lang/String;

    move-result-object v4
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_a

    goto :goto_14

    :catch_c
    move-exception v0

    invoke-virtual {v1, v3, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_a
    :goto_14
    const-string v0, "true_device_id_source"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final b()Ljava/util/Map;
    .locals 9

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const/4 v2, 0x3

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/seon/androidsdk/service/b0;->h:Landroid/hardware/SensorManager;

    iget-object v5, p0, Lio/seon/androidsdk/service/b0;->j:[I

    const/4 v6, 0x0

    if-eqz v4, :cond_3

    if-nez v5, :cond_0

    goto :goto_1

    :cond_0
    move v7, v6

    :goto_0
    array-length v8, v5

    if-ge v6, v8, :cond_2

    aget v8, v5, v6

    invoke-virtual {v4, v8}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v8

    if-eqz v8, :cond_1

    const/4 v8, 0x1

    shl-int/2addr v8, v6

    or-int/2addr v7, v8

    :cond_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_2
    move v6, v7

    :cond_3
    :goto_1
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    :goto_2
    move-object v4, v3

    goto :goto_3

    :catch_0
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_3
    const-string v5, "sensors_bitmask"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    sget-boolean v4, Lio/seon/androidsdk/service/SeonNT;->b:Z

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :catch_1
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_1
    :goto_4
    const-string v0, "nt_cb"

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 9

    :try_start_0
    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/seon/androidsdk/service/b0;->f:Landroid/content/ClipboardManager;

    sget-object v0, Lio/seon/androidsdk/service/b0;->o:Lio/seon/androidsdk/service/r0;

    iget-object v1, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v1}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    const-wide/16 v1, -0x1

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v5, v7

    iget-wide v7, v0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v5, v5, v7

    if-gez v5, :cond_0

    iget-wide v5, v0, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v5, v5, v1

    if-nez v5, :cond_1

    :cond_0
    invoke-static {}, Lio/seon/androidsdk/service/b0;->i()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iput-object v5, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v3, v0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    :try_start_2
    iget-object v0, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    sget-object v0, Lio/seon/androidsdk/service/b0;->p:Lio/seon/androidsdk/service/r0;

    iget-object v3, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    :try_start_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    iget-wide v7, v0, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v5, v7

    iget-wide v7, v0, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v5, v5, v7

    if-gez v5, :cond_2

    iget-wide v5, v0, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v1, v5, v1

    if-nez v1, :cond_3

    :cond_2
    invoke-virtual {p0}, Lio/seon/androidsdk/service/b0;->f()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v3, v0, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :cond_3
    :try_start_4
    iget-object v0, v0, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v0}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    :try_start_5
    new-instance v0, Landroidx/lifecycle/z0;

    const/16 v1, 0xe

    invoke-direct {v0, p0, v1}, Landroidx/lifecycle/z0;-><init>(Ljava/lang/Object;I)V

    const-class v1, Lio/seon/androidsdk/service/o;

    monitor-enter v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    :try_start_6
    invoke-static {v0}, Lio/seon/androidsdk/service/o;->l(Ljava/lang/Runnable;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    :try_start_7
    monitor-exit v1

    goto :goto_0

    :catchall_2
    move-exception v0

    monitor-exit v1

    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    :goto_0
    :try_start_8
    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    const-string v1, "sensor"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/hardware/SensorManager;

    iput-object v0, p0, Lio/seon/androidsdk/service/b0;->h:Landroid/hardware/SensorManager;

    invoke-static {}, Lio/seon/androidsdk/service/b0;->h()[I

    move-result-object v0

    iput-object v0, p0, Lio/seon/androidsdk/service/b0;->j:[I

    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_2

    :try_start_9
    sget-object v1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    instance-of v1, v0, Landroid/app/Activity;

    if-eqz v1, :cond_4

    move-object v1, v0

    check-cast v1, Landroid/app/Activity;

    invoke-virtual {v1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_4

    const-string v1, "window"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager;

    move-object p1, v0

    goto :goto_1

    :cond_4
    invoke-static {}, Lio/seon/androidsdk/service/o;->k()Landroid/app/Activity;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object p1
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_1

    :catch_1
    :cond_5
    :goto_1
    :try_start_a
    iput-object p1, p0, Lio/seon/androidsdk/service/b0;->k:Landroid/view/WindowManager;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_2

    :try_start_b
    new-instance p1, Lio/seon/androidsdk/service/SeonNT;

    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-direct {p1, v0}, Lio/seon/androidsdk/service/SeonNT;-><init>(Landroid/content/Context;)V

    iput-object p1, p0, Lio/seon/androidsdk/service/b0;->e:Lio/seon/androidsdk/service/SeonNT;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    goto :goto_2

    :catch_2
    move-exception p1

    sget-object v0, Lio/seon/androidsdk/service/b0;->n:Lbu/c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1, p1}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_3
    :goto_2
    return-void
.end method

.method public final f()Ljava/lang/String;
    .locals 8

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v2

    const-string v0, "content://com.google.android.gsf.gservices"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v3

    const-string v0, "android_id"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v2 .. v7}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    move-result-object v2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    if-eqz v2, :cond_1

    :try_start_1
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Landroid/database/Cursor;->getColumnCount()I

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x2

    if-ge v0, v3, :cond_0

    goto :goto_2

    :cond_0
    const/4 v0, 0x1

    :try_start_2
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->toHexString(J)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    return-object v0

    :catchall_0
    move-exception v0

    move-object v3, v0

    goto :goto_0

    :catch_0
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    return-object v1

    :goto_0
    :try_start_4
    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v0

    :try_start_5
    invoke-virtual {v3, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_1
    throw v3

    :cond_1
    :goto_2
    if-eqz v2, :cond_2

    invoke-interface {v2}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    :catch_1
    :cond_2
    return-object v1
.end method

.method public final g()Lfo/c;
    .locals 7

    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->l:Lfo/c;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    iget-object v1, p0, Lio/seon/androidsdk/service/b0;->k:Landroid/view/WindowManager;

    const/16 v2, 0x1e

    const/4 v3, 0x0

    if-eqz v1, :cond_2

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v4, v2, :cond_1

    invoke-interface {v1}, Landroid/view/WindowManager;->getMaximumWindowMetrics()Landroid/view/WindowMetrics;

    move-result-object v3

    :cond_1
    iget-object v1, p0, Lio/seon/androidsdk/service/b0;->k:Landroid/view/WindowManager;

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getRealMetrics(Landroid/util/DisplayMetrics;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->g:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    :goto_0
    new-instance v1, Lfo/c;

    invoke-direct {v1}, Lfo/c;-><init>()V

    iput-object v1, p0, Lio/seon/androidsdk/service/b0;->l:Lfo/c;

    const/4 v4, -0x1

    if-eqz v3, :cond_3

    :try_start_0
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v2, :cond_3

    invoke-virtual {v3}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v5

    invoke-virtual {v5}, Landroid/graphics/Rect;->width()I

    move-result v5

    goto :goto_2

    :catch_0
    move-exception v5

    goto :goto_1

    :cond_3
    iget v5, v0, Landroid/util/DisplayMetrics;->widthPixels:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :goto_1
    const-string v6, "SWidth"

    invoke-static {v6, v5}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v5, v4

    :goto_2
    iput v5, v1, Lfo/c;->a:I

    iget-object v1, p0, Lio/seon/androidsdk/service/b0;->l:Lfo/c;

    if-eqz v3, :cond_4

    :try_start_1
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v2, :cond_4

    invoke-virtual {v3}, Landroid/view/WindowMetrics;->getBounds()Landroid/graphics/Rect;

    move-result-object v2

    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    move-result v2

    :goto_3
    move v4, v2

    goto :goto_5

    :catch_1
    move-exception v2

    goto :goto_4

    :cond_4
    iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_3

    :goto_4
    const-string v3, "SHeight"

    invoke-static {v3, v2}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_5
    iput v4, v1, Lfo/c;->c:I

    iget-object v1, p0, Lio/seon/androidsdk/service/b0;->l:Lfo/c;

    :try_start_2
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_6

    :catch_2
    move-exception v0

    const-string v2, "SDens"

    invoke-static {v2, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/high16 v0, -0x40800000    # -1.0f

    :goto_6
    iput v0, v1, Lfo/c;->b:F

    iget-object v0, p0, Lio/seon/androidsdk/service/b0;->l:Lfo/c;

    return-object v0
.end method
