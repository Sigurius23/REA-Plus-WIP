.class public final Lio/seon/androidsdk/service/h0;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final j:[Ljava/lang/String;

.field public static final k:Lio/seon/androidsdk/service/r0;

.field public static final l:Lio/seon/androidsdk/service/r0;

.field public static final m:Lio/seon/androidsdk/service/r0;


# instance fields
.field public e:Landroid/content/SharedPreferences;

.field public f:Landroid/content/Context;

.field public g:Ljava/lang/String;

.field public h:Z

.field public i:Landroid/content/pm/PackageManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 10

    const-string v8, "developer_options_state"

    const-string v9, "timestamp"

    const-string v0, "android_version"

    const-string v1, "is_rooted"

    const-string v2, "kernel_arch"

    const-string v3, "kernel_name"

    const-string v4, "kernel_version"

    const-string v5, "usb_cable_state"

    const-string v6, "usb_debugging_state"

    const-string v7, "bootloader_state"

    filled-new-array/range {v0 .. v9}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/h0;->j:[Ljava/lang/String;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    const-wide/16 v1, 0x7530

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/h0;->k:Lio/seon/androidsdk/service/r0;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/h0;->l:Lio/seon/androidsdk/service/r0;

    new-instance v0, Lio/seon/androidsdk/service/r0;

    const-wide/16 v1, 0x1388

    invoke-direct {v0, v1, v2}, Lio/seon/androidsdk/service/r0;-><init>(J)V

    sput-object v0, Lio/seon/androidsdk/service/h0;->m:Lio/seon/androidsdk/service/r0;

    return-void
.end method

.method public static m()Lio/seon/androidsdk/service/a0;
    .locals 3

    :try_start_0
    new-instance v0, Lio/seon/androidsdk/service/a0;

    invoke-direct {v0}, Lio/seon/androidsdk/service/a0;-><init>()V

    new-instance v1, Ljava/io/File;

    const-string v2, "/proc/self/mounts"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    iput-wide v1, v0, Lio/seon/androidsdk/service/a0;->a:J

    new-instance v1, Ljava/io/File;

    const-string v2, "/proc/self/mountinfo"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    iput-wide v1, v0, Lio/seon/androidsdk/service/a0;->b:J

    new-instance v1, Ljava/io/File;

    const-string v2, "/proc/self/mountstats"

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->lastModified()J

    move-result-wide v1

    iput-wide v1, v0, Lio/seon/androidsdk/service/a0;->c:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 8

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    const/4 v1, 0x0

    iput-boolean v1, p0, Lio/seon/androidsdk/service/h0;->h:Z

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x3

    const/4 v4, 0x0

    :try_start_0
    sget-object v5, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, " ("

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, ")"

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

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

    invoke-virtual {v0, v3, v5}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v6, "android_version"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v5, 0x1

    :try_start_1
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->g()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->f()Z

    move-result v6

    if-eqz v6, :cond_0

    goto :goto_2

    :cond_0
    move v6, v1

    goto :goto_3

    :cond_1
    :goto_2
    move v6, v5

    :goto_3
    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    :goto_4
    move-object v6, v4

    goto :goto_5

    :catch_1
    move-exception v6

    invoke-virtual {v0, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4

    :goto_5
    const-string v7, "is_rooted"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    const-string v6, "os.arch"

    invoke-static {v6}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_8

    :catch_2
    move-exception v6

    goto :goto_7

    :catchall_2
    :goto_6
    move-object v6, v4

    goto :goto_8

    :goto_7
    invoke-virtual {v0, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_8
    const-string v7, "kernel_arch"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/f0;

    const/4 v7, 0x1

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/f0;-><init>(Lio/seon/androidsdk/service/h0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "kernel_name"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/f0;

    const/4 v7, 0x2

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/f0;-><init>(Lio/seon/androidsdk/service/h0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "kernel_version"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v6, Lio/seon/androidsdk/service/f0;

    const/4 v7, 0x0

    invoke-direct {v6, p0, v7}, Lio/seon/androidsdk/service/f0;-><init>(Lio/seon/androidsdk/service/h0;I)V

    invoke-static {v6}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "usb_cable_state"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    iget-object v6, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "adb_enabled"

    invoke-static {v6, v7, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v6

    if-ne v6, v5, :cond_2

    sget-object v6, Lio/seon/androidsdk/service/OSProbe$OSEnum;->USB_DEBUGGING_ENABLED:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    goto :goto_a

    :cond_2
    sget-object v6, Lio/seon/androidsdk/service/OSProbe$OSEnum;->USB_DEBUGGING_DISABLED:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_a

    :catch_3
    :try_start_4
    sget-object v6, Lio/seon/androidsdk/service/OSProbe$OSEnum;->UNKNOWN:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    goto :goto_a

    :catchall_3
    :goto_9
    move-object v6, v4

    goto :goto_a

    :catch_4
    move-exception v6

    invoke-virtual {v0, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_9

    :goto_a
    const-string v7, "usb_debugging_state"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->j()Lio/seon/androidsdk/service/OSProbe$OSEnum;

    move-result-object v6
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    goto :goto_c

    :catchall_4
    :goto_b
    move-object v6, v4

    goto :goto_c

    :catch_5
    move-exception v6

    invoke-virtual {v0, v3, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_b

    :goto_c
    const-string v7, "bootloader_state"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    iget-object v6, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v6

    const-string v7, "development_settings_enabled"

    invoke-static {v6, v7, v1}, Landroid/provider/Settings$Global;->getInt(Landroid/content/ContentResolver;Ljava/lang/String;I)I

    move-result v1

    if-ne v1, v5, :cond_3

    sget-object v1, Lio/seon/androidsdk/service/OSProbe$OSEnum;->DEV_OPTIONS_ENABLED:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    goto :goto_e

    :cond_3
    sget-object v1, Lio/seon/androidsdk/service/OSProbe$OSEnum;->DEV_OPTIONS_DISABLED:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_e

    :catch_6
    :try_start_7
    sget-object v1, Lio/seon/androidsdk/service/OSProbe$OSEnum;->UNKNOWN:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    goto :goto_e

    :catchall_5
    :goto_d
    move-object v1, v4

    goto :goto_e

    :catch_7
    move-exception v1

    invoke-virtual {v0, v3, v1}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v5, "developer_options_state"

    invoke-virtual {v2, v5, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_6

    goto :goto_f

    :catch_8
    move-exception v1

    invoke-virtual {v0, v3, v1}, Lbu/c;->L(ILjava/lang/Exception;)V

    :catchall_6
    :goto_f
    const-string v0, "timestamp"

    invoke-virtual {v2, v0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final b()Ljava/util/Map;
    .locals 10

    const-string v0, "1"

    sget-object v1, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const/4 v3, 0x2

    const/4 v4, 0x3

    const/4 v5, 0x0

    :try_start_0
    const-string v6, "ro.is_ever_orange"

    const-string v7, "ro.boot.warranty_bit"

    filled-new-array {v6, v7}, [Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    :goto_0
    if-ge v7, v3, :cond_2

    aget-object v8, v6, v7

    iget-object v9, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-static {v9, v8}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_1

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    sget-object v6, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    goto :goto_3

    :cond_2
    sget-object v6, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    :goto_2
    move-object v6, v5

    goto :goto_3

    :catch_0
    move-exception v6

    invoke-virtual {v1, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_3
    const-string v7, "is_safetynetfix_loaded"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_1
    const-string v6, "ro.allow.mock.location"

    iget-object v7, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-static {v7, v6}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_5

    :catchall_1
    :goto_4
    move-object v6, v5

    goto :goto_5

    :catch_1
    move-exception v6

    invoke-virtual {v1, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_4

    :goto_5
    const-string v7, "is_location_mocking_enabled"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    const-string v6, "sys.oem_unlock_allowed"

    iget-object v7, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-static {v7, v6}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_7

    :catchall_2
    :goto_6
    move-object v6, v5

    goto :goto_7

    :catch_2
    move-exception v6

    invoke-virtual {v1, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_6

    :goto_7
    const-string v7, "is_oem_unlock_allowed"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_3
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->n()Ljava/lang/String;

    move-result-object v6
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    goto :goto_9

    :catchall_3
    :goto_8
    move-object v6, v5

    goto :goto_9

    :catch_3
    move-exception v6

    invoke-virtual {v1, v4, v6}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_8

    :goto_9
    const-string v7, "ld_preload_string"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    iget-object v6, p0, Lio/seon/androidsdk/service/h0;->e:Landroid/content/SharedPreferences;

    const-string v7, "nativeUnsafe"

    const-string v8, ""

    invoke-interface {v6, v7, v8}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    goto :goto_a

    :catch_4
    :catchall_4
    move-object v6, v5

    :goto_a
    invoke-static {v6, v0}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "native_crash_bit"

    invoke-virtual {v2, v0, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    :try_start_5
    iget-object v0, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    const-string v6, "ro.boot.vbmeta.digest"

    invoke-static {v0, v6}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    goto :goto_c

    :catchall_5
    :goto_b
    move-object v0, v5

    goto :goto_c

    :catch_5
    move-exception v0

    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_b

    :goto_c
    const-string v6, "vbmeta_digest"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_6
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    goto :goto_e

    :catch_6
    move-exception v0

    :try_start_7
    const-string v6, "DebCon"

    invoke-static {v6, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    goto :goto_e

    :catchall_6
    :goto_d
    move-object v0, v5

    goto :goto_e

    :catch_7
    move-exception v0

    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_d

    :goto_e
    const-string v6, "is_debugger_connected"

    invoke-virtual {v2, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/m;

    invoke-direct {v0, p0, v3}, Lio/seon/androidsdk/service/m;-><init>(Lio/seon/androidsdk/service/g;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "is_magisk_by_mount"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_8
    invoke-static {}, Lio/seon/androidsdk/service/h0;->m()Lio/seon/androidsdk/service/a0;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_7

    goto :goto_10

    :catchall_7
    :goto_f
    move-object v0, v5

    goto :goto_10

    :catch_8
    move-exception v0

    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_f

    :goto_10
    const-string v3, "mount_files_modify_info"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_9
    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    goto :goto_11

    :catchall_8
    const/4 v0, -0x1

    :goto_11
    :try_start_a
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_9
    .catchall {:try_start_a .. :try_end_a} :catchall_9

    goto :goto_13

    :catchall_9
    :goto_12
    move-object v0, v5

    goto :goto_13

    :catch_9
    move-exception v0

    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_12

    :goto_13
    const-string v3, "running_fingerprints"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/f0;

    invoke-direct {v0, p0, v4}, Lio/seon/androidsdk/service/f0;-><init>(Lio/seon/androidsdk/service/h0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "is_rooted_rootbeer"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_b
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->f()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_a
    .catchall {:try_start_b .. :try_end_b} :catchall_a

    goto :goto_16

    :catch_a
    move-exception v0

    goto :goto_15

    :catchall_a
    :goto_14
    move-object v0, v5

    goto :goto_16

    :goto_15
    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_14

    :goto_16
    const-string v3, "is_rooted_native"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/seon/androidsdk/service/f0;

    const/4 v3, 0x4

    invoke-direct {v0, p0, v3}, Lio/seon/androidsdk/service/f0;-><init>(Lio/seon/androidsdk/service/h0;I)V

    invoke-static {v0}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    const-string v3, "permissions"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_c
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
    :try_end_c
    .catch Ljava/lang/Exception; {:try_start_c .. :try_end_c} :catch_c
    .catchall {:try_start_c .. :try_end_c} :catchall_b

    :try_start_d
    new-instance v3, Lio/seon/androidsdk/service/y;

    invoke-direct {v3}, Lio/seon/androidsdk/service/y;-><init>()V

    invoke-virtual {v3}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :catch_b
    :goto_17
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    sget-object v8, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;
    :try_end_d
    .catch Ljava/lang/Exception; {:try_start_d .. :try_end_d} :catch_d
    .catchall {:try_start_d .. :try_end_d} :catchall_b

    :try_start_e
    invoke-static {v7}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;
    :try_end_e
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_e} :catch_b
    .catchall {:try_start_e .. :try_end_e} :catchall_b

    :try_start_f
    invoke-virtual {v3, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_f
    .catch Ljava/lang/Exception; {:try_start_f .. :try_end_f} :catch_d
    .catchall {:try_start_f .. :try_end_f} :catchall_b

    goto :goto_17

    :catch_c
    move-exception v0

    goto :goto_19

    :catchall_b
    :goto_18
    move-object v0, v5

    goto :goto_1a

    :goto_19
    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_18

    :catch_d
    :cond_4
    :goto_1a
    const-string v3, "wrappers"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_10
    new-instance v0, Lio/seon/androidsdk/service/PageSizeUtil;

    iget-object v3, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-direct {v0, v3}, Lio/seon/androidsdk/service/PageSizeUtil;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lio/seon/androidsdk/service/PageSizeUtil;->a()Ljava/lang/Integer;

    move-result-object v0
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_c

    goto :goto_1b

    :catchall_c
    move-object v0, v5

    :goto_1b
    const-string v3, "page_size"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    :try_start_11
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->o()Ljava/util/ArrayList;

    move-result-object v0
    :try_end_11
    .catch Ljava/lang/Exception; {:try_start_11 .. :try_end_11} :catch_e
    .catchall {:try_start_11 .. :try_end_11} :catchall_d

    goto :goto_1d

    :catchall_d
    :goto_1c
    move-object v0, v5

    goto :goto_1d

    :catch_e
    move-exception v0

    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1c

    :goto_1d
    const-string v3, "ns_apps"

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_12
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v8

    sub-long/2addr v8, v6

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v0
    :try_end_12
    .catch Ljava/lang/Exception; {:try_start_12 .. :try_end_12} :catch_f
    .catchall {:try_start_12 .. :try_end_12} :catchall_e

    goto :goto_20

    :catch_f
    move-exception v0

    goto :goto_1f

    :catchall_e
    :goto_1e
    move-object v0, v5

    goto :goto_20

    :goto_1f
    invoke-virtual {v1, v4, v0}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_1e

    :goto_20
    const-string v1, "ns_perf"

    invoke-virtual {v2, v1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_13
    iget-object v0, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/seon/androidsdk/service/h0;->h(Ljava/lang/String;)Lio/seon/androidsdk/service/d0;

    move-result-object v0

    invoke-virtual {v0}, Lio/seon/androidsdk/service/d0;->a()Ljava/util/HashMap;

    move-result-object v5
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_f

    :catchall_f
    const-string v0, "src_inf"

    invoke-virtual {v2, v0, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v2
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 8

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    const-wide/16 v0, -0x1

    :try_start_0
    sget-object p1, Lio/seon/androidsdk/service/h0;->k:Lio/seon/androidsdk/service/r0;

    iget-object v2, p1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p1, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v4, v6

    iget-wide v6, p1, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_0

    iget-wide v4, p1, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v4, v4, v0

    if-nez v4, :cond_1

    :cond_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->k()Ljava/lang/String;

    move-result-object v4

    iput-object v4, p1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v2, p1, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :catchall_0
    :cond_1
    :try_start_2
    iget-object p1, p1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    :try_start_3
    sget-object p1, Lio/seon/androidsdk/service/h0;->l:Lio/seon/androidsdk/service/r0;

    iget-object v2, p1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v2}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    :try_start_4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    iget-wide v6, p1, Lio/seon/androidsdk/service/r0;->b:J

    sub-long/2addr v4, v6

    iget-wide v6, p1, Lio/seon/androidsdk/service/r0;->c:J

    cmp-long v4, v4, v6

    if-gez v4, :cond_2

    iget-wide v4, p1, Lio/seon/androidsdk/service/r0;->b:J

    cmp-long v0, v4, v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->l()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lio/seon/androidsdk/service/r0;->a:Ljava/lang/Object;

    iput-wide v2, p1, Lio/seon/androidsdk/service/r0;->b:J
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_2
    :cond_3
    :try_start_5
    iget-object p1, p1, Lio/seon/androidsdk/service/r0;->d:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {p1}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catchall_3
    :try_start_6
    iget-object p1, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_4

    :catchall_4
    :try_start_7
    iget-object p1, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    const-string v0, "seonLocalPreferences"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    iput-object p1, p0, Lio/seon/androidsdk/service/h0;->e:Landroid/content/SharedPreferences;
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    :catch_0
    return-void
.end method

.method public final f()Z
    .locals 3

    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {p0}, Lio/seon/androidsdk/service/h0;->n()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "/system/bin/appwidget"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "magisk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_1

    const-string v2, "zygisk"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :catch_0
    :cond_2
    return v0
.end method

.method public final g()Z
    .locals 3

    new-instance v0, Lcom/iterable/iterableapi/g1;

    iget-object v1, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/iterable/iterableapi/g1;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/iterable/iterableapi/g1;->h()V

    new-instance v1, Lio/seon/androidsdk/service/g0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lio/seon/androidsdk/service/g0;-><init>(Ljava/lang/Object;I)V

    sget-object v0, Lio/seon/androidsdk/service/h0;->m:Lio/seon/androidsdk/service/r0;

    invoke-virtual {v0, v1}, Lio/seon/androidsdk/service/r0;->a(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method public final h(Ljava/lang/String;)Lio/seon/androidsdk/service/d0;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    const-string v1, "com.android.vending"

    const-string v2, "com.facebook.system"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_0

    :try_start_1
    iget-object v2, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, p1}, Landroid/content/pm/PackageManager;->getInstallSourceInfo(Ljava/lang/String;)Landroid/content/pm/InstallSourceInfo;

    move-result-object p1

    invoke-virtual {p1}, Landroid/content/pm/InstallSourceInfo;->getInstallingPackageName()Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-virtual {p1}, Landroid/content/pm/InstallSourceInfo;->getInitiatingPackageName()Ljava/lang/String;

    move-result-object v3
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :try_start_3
    invoke-virtual {p1}, Landroid/content/pm/InstallSourceInfo;->getOriginatingPackageName()Ljava/lang/String;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catch_0
    move-object v3, v0

    goto :goto_0

    :catch_1
    move-object v2, v0

    move-object v3, v2

    :catch_2
    :goto_0
    move-object p1, v0

    goto :goto_1

    :cond_0
    :try_start_4
    iget-object v2, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    invoke-virtual {v2, p1}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    move-object p1, v0

    move-object v3, p1

    :goto_1
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v1, 0x1

    :goto_3
    new-instance v4, Lio/seon/androidsdk/service/d0;

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    invoke-direct {v4, v2, v3, v1, p1}, Lio/seon/androidsdk/service/d0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    return-object v4

    :catchall_0
    return-object v0
.end method

.method public final i(Ljava/lang/String;)J
    .locals 13

    const-string v11, "android.permission.SYSTEM_ALERT_WINDOW"

    const-string v12, "android.permission.WRITE_EXTERNAL_STORAGE"

    const-string v0, "android.permission.RECEIVE_SMS"

    const-string v1, "android.permission.READ_SMS"

    const-string v2, "android.permission.SEND_SMS"

    const-string v3, "android.permission.READ_CONTACTS"

    const-string v4, "android.permission.WRITE_CONTACTS"

    const-string v5, "android.permission.RECEIVE_BOOT_COMPLETED"

    const-string v6, "android.permission.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS"

    const-string v7, "android.permission.REQUEST_INSTALL_PACKAGES"

    const-string v8, "android.permission.NFC"

    const-string v9, "android.permission.READ_CALENDAR"

    const-string v10, "android.permission.WRITE_CALENDAR"

    filled-new-array/range {v0 .. v12}, [Ljava/lang/String;

    move-result-object v0

    const-wide/16 v1, 0x0

    :try_start_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x21

    if-lt v3, v4, :cond_0

    iget-object v3, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    const-wide/16 v4, 0x1000

    invoke-static {v4, v5}, Landroid/content/pm/PackageManager$PackageInfoFlags;->of(J)Landroid/content/pm/PackageManager$PackageInfoFlags;

    move-result-object v4

    invoke-virtual {v3, p1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;Landroid/content/pm/PackageManager$PackageInfoFlags;)Landroid/content/pm/PackageInfo;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object v3, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    const/16 v4, 0x1000

    invoke-virtual {v3, p1, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object p1

    :goto_0
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->requestedPermissions:[Ljava/lang/String;

    if-eqz p1, :cond_4

    array-length v3, p1

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    new-instance v3, Ljava/util/HashSet;

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-direct {v3, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    const/4 p1, 0x0

    move-wide v4, v1

    :goto_1
    const/16 v6, 0xd

    if-ge p1, v6, :cond_3

    aget-object v6, v0, p1

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v6, :cond_2

    const-wide/16 v6, 0x1

    shl-long/2addr v6, p1

    or-long/2addr v4, v6

    :cond_2
    add-int/lit8 p1, p1, 0x1

    goto :goto_1

    :cond_3
    return-wide v4

    :catchall_0
    :cond_4
    :goto_2
    return-wide v1
.end method

.method public final j()Lio/seon/androidsdk/service/OSProbe$OSEnum;
    .locals 8

    const-string v0, "unlocked"

    const-string v1, "1"

    :try_start_0
    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v3, "ro.boot.vbmeta.device_state"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v3, "vendor.boot.vbmeta.device_state"

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v3, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.boot.verifiedbootstate"

    const-string v3, "orange"

    const-string v4, "yellow"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.boot.flash.locked"

    const-string v3, "0"

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.vendor.boot.warranty_bit"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.boot.warranty_bit"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.warranty_bit"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.vendor.warranty_bit"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "ro.boot.veritymode"

    const-string v1, "disabled"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v2}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [Ljava/lang/String;

    invoke-static {v3}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v3, [Ljava/lang/String;

    array-length v4, v3

    const/4 v5, 0x0

    :goto_1
    if-ge v5, v4, :cond_0

    aget-object v6, v3, v5

    iget-object v7, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-static {v7, v1}, Lio/seon/androidsdk/service/o;->i(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v7}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_2

    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->BOOTLOADER_STATE_UNLOCKED:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    return-object v0

    :catch_0
    move-exception v0

    goto :goto_2

    :cond_2
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_3
    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->BOOTLOADER_STATE_LOCKED:Lio/seon/androidsdk/service/OSProbe$OSEnum;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :goto_2
    const-string v1, "BTL"

    invoke-static {v1, v0}, Lio/seon/androidsdk/service/o;->f(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Lio/seon/androidsdk/service/OSProbe$OSEnum;->UNKNOWN:Lio/seon/androidsdk/service/OSProbe$OSEnum;

    return-object v0
.end method

.method public final k()Ljava/lang/String;
    .locals 6

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    const-string v1, "uname"

    invoke-virtual {v0, v1}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v0

    new-instance v1, Ljava/io/BufferedReader;

    new-instance v2, Ljava/io/InputStreamReader;

    invoke-virtual {v0}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v3

    invoke-direct {v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v1, v2}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    const/16 v2, 0x1000

    new-array v2, v2, [C

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v1, v2}, Ljava/io/Reader;->read([C)I

    move-result v4

    if-lez v4, :cond_0

    const/4 v5, 0x0

    invoke-virtual {v3, v2, v5, v4}, Ljava/lang/StringBuilder;->append([CII)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/BufferedReader;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Process;->waitFor()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "\n"

    const-string v2, ""

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v0

    :catch_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public final l()Ljava/lang/String;
    .locals 4

    const-string v0, "Unknown"

    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    const-string v2, "uname -r"

    invoke-virtual {v1, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    move-result-object v1

    new-instance v2, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;

    move-result-object v1

    invoke-direct {v3, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    :goto_0
    invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_2

    if-ne v1, v0, :cond_1

    goto :goto_2

    :cond_1
    move-object v0, v1

    goto :goto_3

    :cond_2
    :goto_2
    :try_start_1
    const-string v1, "os.version"

    invoke-static {v1}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :goto_3
    return-object v0
.end method

.method public final n()Ljava/lang/String;
    .locals 8

    const-string v0, "nativeUnsafe"

    const-string v1, "1"

    iget-boolean v2, p0, Lio/seon/androidsdk/service/h0;->h:Z

    if-nez v2, :cond_6

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Lio/seon/androidsdk/service/PageSizeUtil;

    iget-object v4, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    invoke-direct {v3, v4}, Lio/seon/androidsdk/service/PageSizeUtil;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3}, Lio/seon/androidsdk/service/PageSizeUtil;->a()Ljava/lang/Integer;

    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-object v3, v2

    :goto_0
    const/4 v4, 0x1

    if-eqz v3, :cond_5

    :try_start_1
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    const/16 v5, 0x1000

    if-le v3, v5, :cond_0

    goto :goto_5

    :cond_0
    :try_start_2
    iget-object v3, p0, Lio/seon/androidsdk/service/h0;->e:Landroid/content/SharedPreferences;

    const-string v5, ""

    invoke-interface {v3, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    :catch_0
    :try_start_3
    invoke-static {v2, v1}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    if-eqz v2, :cond_2

    :try_start_4
    sget-object v0, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    goto :goto_1

    :catchall_1
    const/4 v0, -0x1

    :goto_1
    if-le v0, v4, :cond_1

    :try_start_5
    const-string v0, "PARALLEL_RUN_DETECTED"

    goto :goto_2

    :cond_1
    const-string v0, "NATIVE_CRASH_BIT_SET"

    :goto_2
    iput-object v0, p0, Lio/seon/androidsdk/service/h0;->g:Ljava/lang/String;

    iput-boolean v4, p0, Lio/seon/androidsdk/service/h0;->h:Z

    goto :goto_6

    :cond_2
    iget-object v2, p0, Lio/seon/androidsdk/service/h0;->e:Landroid/content/SharedPreferences;

    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v2

    invoke-interface {v2, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->commit()Z

    iget-object v1, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    sget-boolean v3, Lio/seon/androidsdk/service/NativeDetector;->a:Z

    if-nez v3, :cond_4

    const-string v3, "natdet"

    new-instance v5, Ls/m2;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Ls/m2;-><init>(I)V

    if-eqz v1, :cond_3

    const-string v6, "Beginning load of %s..."

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6, v7}, Ls/m2;->o(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v5, v1, v3}, Ls/m2;->n(Landroid/content/Context;Ljava/lang/String;)V

    sput-boolean v4, Lio/seon/androidsdk/service/NativeDetector;->a:Z

    goto :goto_3

    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Given context is null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_4
    :goto_3
    invoke-static {}, Lio/seon/androidsdk/service/NativeDetector;->glp()Ljava/lang/String;

    move-result-object v1

    const-string v3, "0"

    invoke-interface {v2, v0, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    iput-object v1, p0, Lio/seon/androidsdk/service/h0;->g:Ljava/lang/String;

    :goto_4
    iput-boolean v4, p0, Lio/seon/androidsdk/service/h0;->h:Z

    goto :goto_6

    :cond_5
    :goto_5
    const-string v0, "UNSUPPORTED_PAGE_SIZE"

    iput-object v0, p0, Lio/seon/androidsdk/service/h0;->g:Ljava/lang/String;
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    goto :goto_4

    :catch_1
    :cond_6
    :goto_6
    iget-object v0, p0, Lio/seon/androidsdk/service/h0;->g:Ljava/lang/String;

    return-object v0
.end method

.method public final o()Ljava/util/ArrayList;
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    :try_start_1
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1e

    if-lt v2, v3, :cond_0

    iget-object v3, p0, Lio/seon/androidsdk/service/h0;->f:Landroid/content/Context;

    const-string v4, "android.permission.QUERY_ALL_PACKAGES"

    invoke-static {v3, v4}, Lio/seon/androidsdk/service/o;->g(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    :cond_0
    const/16 v3, 0x21

    if-lt v2, v3, :cond_1

    iget-object v2, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    const-wide/16 v3, 0x0

    invoke-static {v3, v4}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledApplications(Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Ljava/util/List;

    move-result-object v2

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v2
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    :cond_2
    move-object v2, v0

    :goto_0
    if-eqz v2, :cond_6

    :try_start_2
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_3
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/pm/ApplicationInfo;

    iget-object v4, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget v5, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v6, v5, 0x1

    if-nez v6, :cond_3

    and-int/lit16 v5, v5, 0x80

    if-eqz v5, :cond_4

    goto :goto_1

    :cond_4
    invoke-virtual {p0, v4}, Lio/seon/androidsdk/service/h0;->h(Ljava/lang/String;)Lio/seon/androidsdk/service/d0;

    move-result-object v5

    if-eqz v5, :cond_3

    iget-object v6, v5, Lio/seon/androidsdk/service/d0;->d:Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_3

    iget-object v6, p0, Lio/seon/androidsdk/service/h0;->i:Landroid/content/pm/PackageManager;

    invoke-virtual {v6, v3}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v3

    invoke-interface {v3}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    new-instance v6, La00/g;

    const/16 v7, 0xf

    invoke-direct {v6, v4, v3, v7}, La00/g;-><init>(Ljava/lang/Object;Ljava/io/Serializable;I)V

    iput-object v5, v6, La00/g;->z:Ljava/lang/Object;

    invoke-virtual {p0, v4}, Lio/seon/androidsdk/service/h0;->i(Ljava/lang/String;)J

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    iput-object v3, v6, La00/g;->E:Ljava/lang/Object;

    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :cond_5
    return-object v1

    :catch_1
    :cond_6
    return-object v0
.end method
