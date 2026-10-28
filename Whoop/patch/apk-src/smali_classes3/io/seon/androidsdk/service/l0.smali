.class public final Lio/seon/androidsdk/service/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static f:Landroid/content/pm/PackageManager;

.field public static final g:[Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Lio/seon/androidsdk/service/m0;

.field public c:Ljava/lang/String;

.field public final d:Ljava/util/ArrayList;

.field public final e:Ljava/util/HashMap;


# direct methods
.method public static constructor <clinit>()V
    .locals 11

    const-string v9, "cpu_count"

    const-string v10, "device_id"

    const-string v0, "cpu_type"

    const-string v1, "kernel_arch"

    const-string v2, "battery_voltage"

    const-string v3, "battery_temperature"

    const-string v4, "kernel_version"

    const-string v5, "wifi_ssid"

    const-string v6, "is_tablet"

    const-string v7, "input_device_data"

    const-string v8, "battery_total_capacity"

    filled-new-array/range {v0 .. v10}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/l0;->g:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/HashMap;)V
    .locals 23

    move-object/from16 v0, p0

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v1, p1

    iput-object v1, v0, Lio/seon/androidsdk/service/l0;->a:Landroid/content/Context;

    move-object/from16 v1, p2

    iput-object v1, v0, Lio/seon/androidsdk/service/l0;->e:Ljava/util/HashMap;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iput-object v1, v0, Lio/seon/androidsdk/service/l0;->d:Ljava/util/ArrayList;

    new-instance v1, Lio/seon/androidsdk/service/m0;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    const-string v2, "noxd"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v3

    iput-object v3, v1, Lio/seon/androidsdk/service/m0;->b:[Ljava/lang/String;

    const-string v3, "goldfish"

    const-string v4, "Genymotion"

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lio/seon/androidsdk/service/m0;->y:[Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/String;

    move-result-object v5

    iput-object v5, v1, Lio/seon/androidsdk/service/m0;->d:[Ljava/lang/String;

    new-instance v5, Ljava/util/HashMap;

    invoke-direct {v5}, Ljava/util/HashMap;-><init>()V

    iput-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v6, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->LDPLAYER:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "/system/priv-app/ldAppStore"

    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/bin/ldinit"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v6, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->MUMU:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/etc/mumu-configs/device-prop-configs/mumu.config"

    invoke-virtual {v5, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v6, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->NOX:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "fstab.nox"

    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "init.nox.rc"

    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    const-string v8, "ueventd.nox.rc"

    invoke-virtual {v5, v8, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v5, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v5, v2, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v7, "/system/lib/libnoxspeedup.so"

    invoke-virtual {v2, v7, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v6}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/system/bin/nox-prop"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->TITAN_ENGINE:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "fstab.titan"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->WINDROY:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/system/bin/windroyed"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->BLUESTACKS:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/data/.bluestacks.prop"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->ANDY:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "fstab.andy"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ueventd.andy.rc"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->GENYMOTION:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/dev/socket/genyd"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/dev/socket/baseband_genyd"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->QEMU:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/dev/socket/qemud"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/dev/qemu_pipe"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/system/lib/libc_malloc_debug_qemu.so"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->DROID4X:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/system/bin/droid4x-prop"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->VIRTUAL_BOX:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "ueventd.vbox86.rc"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "fstab.vbox86"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "init.vbox86.rc"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->X86:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "x86.prop"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "init.ttVM_x86.rc"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "fstab.ttVM_x86"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "ueventd.android_x86.rc"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "ueventd.ttVM_x86.rc"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;->UNKNOWN:Lio/seon/androidsdk/service/EmulatorDetectorConfigurator$Engine;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "vmos.prop"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/bin/androVM-prop"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/etc/xxzs_prop.sh"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/bin/ttVM-prop"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/bin/microvirt-prop"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/app/AntStore"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "/system/bin/duosconfig"

    invoke-virtual {v2, v7, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "/system/lib/libdroid4x.so"

    invoke-virtual {v2, v6, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v5, "ro.bootloader"

    const-string v6, "unknown"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v5, "ro.bootmode"

    invoke-virtual {v2, v5, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v5, "ro.hardware"

    invoke-virtual {v2, v5, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v3, "ro.kernel.qemu"

    const-string v5, "1"

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v3, "qemu.gles"

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v3, "ro.product.device"

    const-string v5, "generic"

    invoke-virtual {v2, v3, v5}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v3, "ro.product.model"

    const-string v7, "sdk"

    invoke-virtual {v2, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v1, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    const-string v3, "ro.product.name"

    invoke-virtual {v2, v3, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    const-string v2, "10.0.2.15"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->g:[Ljava/lang/String;

    const-string v16, "com.genymotion."

    const-string v17, "com.google.android.launcher.layouts.genymotion"

    const-string v7, "com.bluestacks."

    const-string v8, "com.android.emulator.radio.config"

    const-string v9, "com.google.android.overlay.emulatorgmsconfig"

    const-string v10, "com.bignox."

    const-string v11, "com.kop."

    const-string v12, "cn.itools."

    const-string v13, "com.kaopu."

    const-string v14, "me.haima."

    const-string v15, "com.vphone."

    filled-new-array/range {v7 .. v17}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->f:[Ljava/lang/String;

    filled-new-array {v5, v6}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->i:[Ljava/lang/String;

    const-string v16, "ProjectTitan"

    const-string v17, "Subsystem for Android"

    const-string v6, "google_sdk"

    const-string v7, "droid4x"

    const-string v8, "Emulator"

    const-string v9, "Android SDK built for x86"

    const-string v10, "sdk_gphone64_arm64"

    const-string v11, "windroy"

    const-string v12, "tiantian"

    const-string v13, "genymotion"

    const-string v14, "amiduos"

    const-string v15, "duos"

    filled-new-array/range {v6 .. v17}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->j:[Ljava/lang/String;

    const-string v15, "motion_phone"

    const-string v16, "windows"

    const-string v6, "VirtualBox"

    const-string v7, "vbox"

    const-string v8, "appplayer"

    const-string v9, "droid4x"

    const-string v10, "generic"

    const-string v11, "generic_x86"

    const-string v12, "emu64a"

    const-string v13, "virtual"

    const-string v14, "ProjectTitan"

    filled-new-array/range {v6 .. v16}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->k:[Ljava/lang/String;

    const-string v2, "Oracle Corporation"

    const-string v3, "Appetize.io"

    const-string v6, "Genymobile"

    const-string v7, "Andy"

    filled-new-array {v4, v6, v7, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->l:[Ljava/lang/String;

    const-string v2, "vbox86"

    const-string v3, "sdk_gphone"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->m:[Ljava/lang/String;

    const-string v12, "android_x86"

    const-string v13, "ranchu"

    const-string v6, "goldfish"

    const-string v7, "vbox"

    const-string v8, "vbox86"

    const-string v9, "ttvm"

    const-string v10, "cancro"

    const-string v11, "intel"

    filled-new-array/range {v6 .. v13}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->n:[Ljava/lang/String;

    const-string v21, "vbox"

    const-string v22, "android_x86"

    const-string v6, "google_sdk"

    const-string v7, "sdk_google"

    const-string v8, "sdk_gphone64"

    const-string v9, "sdk_x86"

    const-string v10, "vbox86p"

    const-string v11, "simulator"

    const-string v12, "emulator"

    const-string v13, "andy"

    const-string v14, "iToolsAVM"

    const-string v15, "vbox86tp"

    const-string v16, "genymotion"

    const-string v17, "bluestacks"

    const-string v18, "droid4x"

    const-string v19, "ttvm_hdragon"

    const-string v20, "duos_native"

    filled-new-array/range {v6 .. v22}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->o:[Ljava/lang/String;

    const-string v2, "goldfish_arm64"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->p:[Ljava/lang/String;

    const-string v2, "bignox"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->q:[Ljava/lang/String;

    const-string v2, "Build2"

    const-string v4, "bliss-os"

    filled-new-array {v2, v4}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->r:[Ljava/lang/String;

    const-string v2, "1.0.0.0"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->s:[Ljava/lang/String;

    filled-new-array {v5}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->t:[Ljava/lang/String;

    const-string v2, "vbox"

    filled-new-array {v2, v3}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->u:[Ljava/lang/String;

    const-string v2, "bluestacks"

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->h:[Ljava/lang/String;

    const-string v2, "amd"

    const-string v3, "virtual"

    const-string v4, "intel"

    const-string v5, "x86"

    filled-new-array {v4, v2, v5, v3}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->v:[Ljava/lang/String;

    const-string v2, "i686"

    const-string v3, "x86_64"

    filled-new-array {v2, v3, v5}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->w:[Ljava/lang/String;

    const-string v2, ".lxc"

    const-string v3, ".xl0n"

    const-string v4, "genymotion"

    const-string v5, "xanmod"

    const-string v6, "-titan"

    filled-new-array {v4, v5, v6, v2, v3}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->x:[Ljava/lang/String;

    const-string v11, "Android_Input"

    const-string v12, "inputDev-1"

    const-string v3, "VirtualBox"

    const-string v4, "Redfinger"

    const-string v5, "Genymotion"

    const-string v6, "Game China"

    const-string v7, "virtio_input"

    const-string v8, "AT Translated Set"

    const-string v9, "qwerty2"

    const-string v10, "VMware"

    filled-new-array/range {v3 .. v12}, [Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lio/seon/androidsdk/service/m0;->a:[Ljava/lang/String;

    iput-object v1, v0, Lio/seon/androidsdk/service/l0;->b:Lio/seon/androidsdk/service/m0;

    return-void
.end method

.method public static a(Landroid/content/Context;Lorg/json/JSONObject;)Lio/seon/androidsdk/service/l0;
    .locals 5

    if-eqz p0, :cond_2

    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/l0;->f:Landroid/content/pm/PackageManager;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lio/seon/androidsdk/service/l0;->g:[Ljava/lang/String;

    const/4 v2, 0x0

    :goto_0
    const/16 v3, 0xb

    if-ge v2, v3, :cond_1

    aget-object v3, v1, v2

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v0, v3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_0

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p1, Lio/seon/androidsdk/service/l0;

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    invoke-direct {p1, p0, v0}, Lio/seon/androidsdk/service/l0;-><init>(Landroid/content/Context;Ljava/util/HashMap;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "Context must not be null."

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b(Lio/seon/androidsdk/service/h1;)V
    .locals 29

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    sget-object v0, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->BRAND:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->BOARD:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->SERIAL:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->HOST:Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->BOOTLOADER:Ljava/lang/String;

    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    sget-object v0, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    const-string v0, "wifi_ssid"

    const-string v3, " Filter: "

    const-string v4, "is_tablet"

    const-class v5, Ljava/lang/String;

    const-string v6, "get"

    const-string v7, "android.os.SystemProperties"

    iget-object v8, v1, Lio/seon/androidsdk/service/l0;->e:Ljava/util/HashMap;

    iget-object v9, v1, Lio/seon/androidsdk/service/l0;->a:Landroid/content/Context;

    const-string v10, "ro.build.flavor"

    :try_start_0
    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v12

    invoke-virtual {v12, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v12

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v13

    invoke-virtual {v12, v6, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v13

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v13, v12, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 v10, 0x0

    :goto_0
    iget-object v12, v1, Lio/seon/androidsdk/service/l0;->b:Lio/seon/androidsdk/service/m0;

    iget-object v13, v12, Lio/seon/androidsdk/service/m0;->u:[Ljava/lang/String;

    invoke-virtual {v1, v10, v13}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v10

    sget-object v13, Landroid/os/Build;->FINGERPRINT:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->i:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v13

    or-int/2addr v10, v13

    sget-object v13, Landroid/os/Build;->MODEL:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->j:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v13

    or-int/2addr v10, v13

    sget-object v13, Landroid/os/Build;->DEVICE:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->k:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v13

    or-int/2addr v10, v13

    sget-object v13, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->l:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v13

    or-int/2addr v10, v13

    sget-object v13, Landroid/os/Build;->DISPLAY:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->m:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v13

    or-int/2addr v10, v13

    sget-object v13, Landroid/os/Build;->HARDWARE:Ljava/lang/String;

    iget-object v14, v12, Lio/seon/androidsdk/service/m0;->n:[Ljava/lang/String;

    invoke-virtual {v1, v13, v14}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v14

    or-int/2addr v10, v14

    sget-object v14, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    iget-object v15, v12, Lio/seon/androidsdk/service/m0;->o:[Ljava/lang/String;

    invoke-virtual {v1, v14, v15}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v15

    or-int/2addr v10, v15

    sget-object v15, Landroid/os/Build;->BOARD:Ljava/lang/String;

    iget-object v11, v12, Lio/seon/androidsdk/service/m0;->p:[Ljava/lang/String;

    invoke-virtual {v1, v15, v11}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v11

    or-int/2addr v10, v11

    iget-object v11, v12, Lio/seon/androidsdk/service/m0;->n:[Ljava/lang/String;

    invoke-virtual {v1, v13, v11}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v11

    or-int/2addr v10, v11

    iget-object v11, v12, Lio/seon/androidsdk/service/m0;->o:[Ljava/lang/String;

    invoke-virtual {v1, v14, v11}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v11

    or-int/2addr v10, v11

    sget-object v11, Landroid/os/Build;->HOST:Ljava/lang/String;

    iget-object v13, v12, Lio/seon/androidsdk/service/m0;->r:[Ljava/lang/String;

    invoke-virtual {v1, v11, v13}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v11

    or-int/2addr v10, v11

    sget-object v11, Landroid/os/Build;->BRAND:Ljava/lang/String;

    iget-object v13, v12, Lio/seon/androidsdk/service/m0;->t:[Ljava/lang/String;

    invoke-virtual {v1, v11, v13}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v11

    or-int/2addr v10, v11

    const-string v11, "sensor"

    invoke-virtual {v9, v11}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/hardware/SensorManager;

    const-string v13, " filter: "

    iget-object v14, v1, Lio/seon/androidsdk/service/l0;->d:Ljava/util/ArrayList;

    const/16 v17, 0x0

    if-nez v11, :cond_1

    :cond_0
    move-object/from16 v18, v5

    move-object/from16 v19, v9

    move/from16 v22, v10

    goto/16 :goto_3

    :cond_1
    const/4 v15, -0x1

    invoke-virtual {v11, v15}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :goto_1
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_0

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/hardware/Sensor;

    move-object/from16 v18, v5

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v19, v9

    invoke-virtual {v15}, Landroid/hardware/Sensor;->getVendor()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, " "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Landroid/hardware/Sensor;->getName()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    iget-object v9, v12, Lio/seon/androidsdk/service/m0;->y:[Ljava/lang/String;

    array-length v15, v9

    move-object/from16 v20, v9

    move/from16 v9, v17

    :goto_2
    if-ge v9, v15, :cond_3

    move/from16 v21, v9

    aget-object v9, v20, v21

    move/from16 v22, v10

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    move-object/from16 v23, v11

    invoke-virtual {v5, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v9, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_2

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Sensor name: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v5, 0x1

    goto :goto_4

    :cond_2
    add-int/lit8 v9, v21, 0x1

    move/from16 v10, v22

    move-object/from16 v11, v23

    goto :goto_2

    :cond_3
    move-object/from16 v5, v18

    move-object/from16 v9, v19

    goto :goto_1

    :goto_3
    move/from16 v5, v17

    :goto_4
    or-int v5, v22, v5

    :try_start_1
    invoke-virtual {v8, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_5

    :catch_1
    :cond_4
    move/from16 v4, v17

    :goto_5
    if-nez v4, :cond_5

    invoke-static {}, Landroid/os/Build;->getRadioVersion()Ljava/lang/String;

    move-result-object v4

    iget-object v9, v12, Lio/seon/androidsdk/service/m0;->s:[Ljava/lang/String;

    invoke-virtual {v1, v4, v9}, Lio/seon/androidsdk/service/l0;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    move-result v4

    or-int/2addr v5, v4

    :cond_5
    :try_start_2
    const-string v4, "cpu_type"

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    goto :goto_6

    :cond_6
    const/4 v4, 0x0

    :goto_6
    check-cast v4, Ljava/lang/String;

    if-nez v4, :cond_7

    goto :goto_8

    :cond_7
    move/from16 v9, v17

    :goto_7
    iget-object v10, v12, Lio/seon/androidsdk/service/m0;->v:[Ljava/lang/String;

    array-length v11, v10

    if-ge v9, v11, :cond_9

    aget-object v10, v10, v9

    sget-object v11, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v10, v11}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v15, v11}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_8

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "CPU type: "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    const/4 v4, 0x1

    goto :goto_9

    :cond_8
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :catch_2
    :cond_9
    :goto_8
    move/from16 v4, v17

    :goto_9
    or-int/2addr v4, v5

    :try_start_3
    const-string v5, "kernel_arch"

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    goto :goto_a

    :catch_3
    move/from16 v20, v4

    goto/16 :goto_f

    :cond_a
    const/4 v5, 0x0

    :goto_a
    check-cast v5, Ljava/lang/String;

    const-string v9, "kernel_version"

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_b

    invoke-virtual {v8, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    goto :goto_b

    :cond_b
    const/4 v9, 0x0

    :goto_b
    check-cast v9, Ljava/lang/String;

    iget-object v10, v12, Lio/seon/androidsdk/service/m0;->w:[Ljava/lang/String;

    array-length v11, v10
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3

    move/from16 v15, v17

    :goto_c
    if-ge v15, v11, :cond_d

    move/from16 v20, v4

    :try_start_4
    aget-object v4, v10, v15

    move-object/from16 v21, v10

    sget-object v10, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    move/from16 v22, v11

    invoke-virtual {v5, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v4, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v11, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v10

    if-eqz v10, :cond_c

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "Kernel arch: "

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_e

    :cond_c
    add-int/lit8 v15, v15, 0x1

    move/from16 v4, v20

    move-object/from16 v10, v21

    move/from16 v11, v22

    goto :goto_c

    :cond_d
    move/from16 v20, v4

    iget-object v4, v12, Lio/seon/androidsdk/service/m0;->x:[Ljava/lang/String;

    array-length v5, v4

    move/from16 v10, v17

    :goto_d
    if-ge v10, v5, :cond_f

    aget-object v11, v4, v10

    sget-object v15, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    move-object/from16 v21, v4

    invoke-virtual {v9, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v11, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4, v15}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_e

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Kernel version: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    :goto_e
    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4

    const/4 v4, 0x1

    goto :goto_10

    :cond_e
    add-int/lit8 v10, v10, 0x1

    move-object/from16 v4, v21

    goto :goto_d

    :catch_4
    :cond_f
    :goto_f
    move/from16 v4, v17

    :goto_10
    or-int v4, v20, v4

    :try_start_5
    invoke-virtual {v8, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-virtual {v8, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iget-object v5, v12, Lio/seon/androidsdk/service/m0;->h:[Ljava/lang/String;

    array-length v9, v5

    move/from16 v10, v17

    :goto_11
    if-ge v10, v9, :cond_11

    aget-object v11, v5, v10

    invoke-virtual {v11, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_10

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v9, "SSID: "

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5

    const/4 v0, 0x1

    goto :goto_12

    :cond_10
    add-int/lit8 v10, v10, 0x1

    goto :goto_11

    :catch_5
    :cond_11
    move/from16 v0, v17

    :goto_12
    or-int/2addr v0, v4

    iget-object v4, v12, Lio/seon/androidsdk/service/m0;->e:Ljava/util/HashMap;

    invoke-virtual {v4}, Ljava/util/HashMap;->entrySet()Ljava/util/Set;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move/from16 v5, v17

    :cond_12
    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/util/Map$Entry;

    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    :try_start_6
    invoke-virtual/range {v19 .. v19}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    invoke-virtual {v11}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v11

    invoke-virtual {v11, v7}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    filled-new-array/range {v18 .. v18}, [Ljava/lang/Class;

    move-result-object v15

    invoke-virtual {v11, v6, v15}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v15

    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v15, v11, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_6

    goto :goto_14

    :catch_6
    const/4 v10, 0x0

    :goto_14
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v11

    if-eqz v11, :cond_12

    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/CharSequence;

    invoke-virtual {v10, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_12

    add-int/lit8 v5, v5, 0x1

    goto :goto_13

    :cond_13
    const/4 v4, 0x3

    if-lt v5, v4, :cond_14

    const-string v4, "Qemu props count: "

    invoke-static {v5, v4, v14}, Ly00/t7;->s(ILjava/lang/String;Ljava/util/ArrayList;)V

    const/4 v4, 0x1

    goto :goto_15

    :cond_14
    move/from16 v4, v17

    :goto_15
    or-int/2addr v0, v4

    const-string v4, "input_device_data"

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/HashMap;

    if-eqz v4, :cond_18

    :try_start_7
    invoke-virtual {v4}, Ljava/util/HashMap;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_15

    goto :goto_17

    :cond_15
    iget-object v5, v12, Lio/seon/androidsdk/service/m0;->a:[Ljava/lang/String;

    array-length v6, v5

    move/from16 v7, v17

    :goto_16
    if-ge v7, v6, :cond_18

    aget-object v9, v5, v7

    invoke-virtual {v4}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_16
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v11, v9}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v11

    if-eqz v11, :cond_16

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Input device: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    const/4 v4, 0x1

    goto :goto_18

    :cond_17
    add-int/lit8 v7, v7, 0x1

    goto :goto_16

    :catchall_0
    :cond_18
    :goto_17
    move/from16 v4, v17

    :goto_18
    or-int/2addr v4, v0

    const-string v5, "/proc/"

    iget-object v0, v12, Lio/seon/androidsdk/service/m0;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :catch_7
    :cond_19
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    :try_start_8
    new-instance v9, Ljava/io/File;

    invoke-direct {v9, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v9

    if-eqz v9, :cond_19

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v11, "File: "

    invoke-virtual {v9, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, " Engine: "

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const-string v7, "UNKNOWN"

    invoke-static {v10, v7}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    iput-object v10, v1, Lio/seon/androidsdk/service/l0;->c:Ljava/lang/String;
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_7

    :cond_1a
    const/4 v0, 0x1

    goto :goto_19

    :cond_1b
    move/from16 v0, v17

    :goto_19
    iget-object v6, v12, Lio/seon/androidsdk/service/m0;->f:[Ljava/lang/String;

    if-eqz v6, :cond_1c

    array-length v6, v6

    if-nez v6, :cond_1d

    :cond_1c
    move/from16 v16, v0

    goto :goto_1c

    :cond_1d
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v7, 0x21

    if-lt v6, v7, :cond_1e

    sget-object v6, Lio/seon/androidsdk/service/l0;->f:Landroid/content/pm/PackageManager;

    const-wide/16 v9, 0x80

    invoke-static {v9, v10}, Landroid/content/pm/PackageManager$ApplicationInfoFlags;->of(J)Landroid/content/pm/PackageManager$ApplicationInfoFlags;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->getInstalledApplications(Landroid/content/pm/PackageManager$ApplicationInfoFlags;)Ljava/util/List;

    move-result-object v6

    goto :goto_1a

    :cond_1e
    sget-object v6, Lio/seon/androidsdk/service/l0;->f:Landroid/content/pm/PackageManager;

    const/16 v7, 0x80

    invoke-virtual {v6, v7}, Landroid/content/pm/PackageManager;->getInstalledApplications(I)Ljava/util/List;

    move-result-object v6

    :goto_1a
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1f
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1c

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/pm/ApplicationInfo;

    iget-object v9, v12, Lio/seon/androidsdk/service/m0;->f:[Ljava/lang/String;

    array-length v10, v9

    move/from16 v11, v17

    :goto_1b
    if-ge v11, v10, :cond_1f

    aget-object v15, v9, v11

    move/from16 v16, v0

    iget-object v0, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_20

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "Package name: "

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v6, v7, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_1d

    :cond_20
    add-int/lit8 v11, v11, 0x1

    move/from16 v0, v16

    goto :goto_1b

    :goto_1c
    move/from16 v0, v17

    :goto_1d
    or-int v0, v16, v0

    new-instance v6, Ljava/io/File;

    const-string v7, "/proc/tty/drivers"

    invoke-direct {v6, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v7, Ljava/io/File;

    const-string v9, "/proc/cpuinfo"

    invoke-direct {v7, v9}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    filled-new-array {v6, v7}, [Ljava/io/File;

    move-result-object v6

    move/from16 v7, v17

    :goto_1e
    const/4 v9, 0x2

    if-ge v7, v9, :cond_23

    aget-object v9, v6, v7

    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v10

    if-eqz v10, :cond_22

    invoke-virtual {v9}, Ljava/io/File;->canRead()Z

    move-result v10

    if-eqz v10, :cond_22

    const/16 v10, 0x400

    new-array v10, v10, [B

    :try_start_9
    new-instance v11, Ljava/io/FileInputStream;

    invoke-direct {v11, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v11, v10}, Ljava/io/InputStream;->read([B)I

    invoke-virtual {v11}, Ljava/io/InputStream;->close()V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_8

    :catch_8
    new-instance v9, Ljava/lang/String;

    invoke-direct {v9, v10}, Ljava/lang/String;-><init>([B)V

    iget-object v10, v12, Lio/seon/androidsdk/service/m0;->d:[Ljava/lang/String;

    array-length v11, v10

    move/from16 v15, v17

    :goto_1f
    if-ge v15, v11, :cond_22

    move/from16 v16, v0

    aget-object v0, v10, v15

    invoke-virtual {v9, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_21

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "Driver: "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    goto :goto_20

    :cond_21
    add-int/lit8 v15, v15, 0x1

    move/from16 v0, v16

    goto :goto_1f

    :cond_22
    move/from16 v16, v0

    add-int/lit8 v7, v7, 0x1

    move/from16 v0, v16

    goto :goto_1e

    :cond_23
    move/from16 v16, v0

    move/from16 v0, v17

    :goto_20
    or-int v6, v16, v0

    new-instance v0, Ljava/io/File;

    const-string v7, "/proc"

    invoke-direct {v0, v7}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v7

    if-eqz v7, :cond_26

    array-length v9, v7

    move/from16 v10, v17

    :goto_21
    if-ge v10, v9, :cond_26

    aget-object v0, v7, v10

    :try_start_a
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    const-string v11, ""

    invoke-virtual {v0, v5, v11}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    new-instance v11, Ljava/io/FileInputStream;

    new-instance v13, Ljava/io/File;

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v15, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_a

    move/from16 v16, v4

    :try_start_b
    const-string v4, "/status"

    invoke-virtual {v15, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v13, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-direct {v11, v13}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_b
    .catch Ljava/lang/Exception; {:try_start_b .. :try_end_b} :catch_9

    :try_start_c
    new-instance v4, Ljava/io/InputStreamReader;

    invoke-direct {v4, v11}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_a

    :try_start_d
    new-instance v13, Ljava/io/BufferedReader;

    invoke-direct {v13, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    :try_start_e
    invoke-virtual {v13}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v15
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_6

    move-object/from16 v18, v4

    :try_start_f
    iget-object v4, v12, Lio/seon/androidsdk/service/m0;->b:[Ljava/lang/String;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_5

    move-object/from16 v19, v5

    :try_start_10
    array-length v5, v4

    move-object/from16 v20, v4

    move/from16 v4, v17

    :goto_22
    if-ge v4, v5, :cond_25

    move/from16 v21, v4

    aget-object v4, v20, v21

    move/from16 v22, v5

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_4

    move/from16 v23, v6

    :try_start_11
    invoke-virtual {v15, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_24

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Process: "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Procid: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v14, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_3

    :try_start_12
    invoke-virtual {v13}, Ljava/io/BufferedReader;->close()V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    :try_start_13
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStreamReader;->close()V
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_1

    :try_start_14
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V
    :try_end_14
    .catch Ljava/lang/Exception; {:try_start_14 .. :try_end_14} :catch_b

    const/4 v0, 0x1

    goto/16 :goto_30

    :catchall_1
    move-exception v0

    :goto_23
    move-object v4, v0

    goto :goto_2c

    :catchall_2
    move-exception v0

    :goto_24
    move-object v4, v0

    goto :goto_2a

    :catchall_3
    move-exception v0

    :goto_25
    move-object v4, v0

    goto :goto_28

    :cond_24
    add-int/lit8 v4, v21, 0x1

    move/from16 v5, v22

    move/from16 v6, v23

    goto :goto_22

    :catchall_4
    move-exception v0

    :goto_26
    move/from16 v23, v6

    goto :goto_25

    :cond_25
    move/from16 v23, v6

    :try_start_15
    invoke-virtual {v13}, Ljava/io/BufferedReader;->close()V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_2

    :try_start_16
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStreamReader;->close()V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_1

    :try_start_17
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V
    :try_end_17
    .catch Ljava/lang/Exception; {:try_start_17 .. :try_end_17} :catch_b

    goto :goto_2f

    :catchall_5
    move-exception v0

    :goto_27
    move-object/from16 v19, v5

    goto :goto_26

    :catchall_6
    move-exception v0

    move-object/from16 v18, v4

    goto :goto_27

    :goto_28
    :try_start_18
    invoke-virtual {v13}, Ljava/io/BufferedReader;->close()V
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_7

    goto :goto_29

    :catchall_7
    move-exception v0

    :try_start_19
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_29
    throw v4
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_2

    :catchall_8
    move-exception v0

    move-object/from16 v18, v4

    move-object/from16 v19, v5

    move/from16 v23, v6

    goto :goto_24

    :goto_2a
    :try_start_1a
    invoke-virtual/range {v18 .. v18}, Ljava/io/InputStreamReader;->close()V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_9

    goto :goto_2b

    :catchall_9
    move-exception v0

    :try_start_1b
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2b
    throw v4
    :try_end_1b
    .catchall {:try_start_1b .. :try_end_1b} :catchall_1

    :catchall_a
    move-exception v0

    move-object/from16 v19, v5

    move/from16 v23, v6

    goto :goto_23

    :goto_2c
    :try_start_1c
    invoke-virtual {v11}, Ljava/io/FileInputStream;->close()V
    :try_end_1c
    .catchall {:try_start_1c .. :try_end_1c} :catchall_b

    goto :goto_2d

    :catchall_b
    move-exception v0

    :try_start_1d
    invoke-virtual {v4, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    :goto_2d
    throw v4
    :try_end_1d
    .catch Ljava/lang/Exception; {:try_start_1d .. :try_end_1d} :catch_b

    :catch_9
    :goto_2e
    move-object/from16 v19, v5

    move/from16 v23, v6

    goto :goto_2f

    :catch_a
    move/from16 v16, v4

    goto :goto_2e

    :catch_b
    :goto_2f
    add-int/lit8 v10, v10, 0x1

    move/from16 v4, v16

    move-object/from16 v5, v19

    move/from16 v6, v23

    goto/16 :goto_21

    :cond_26
    move/from16 v16, v4

    move/from16 v23, v6

    move/from16 v0, v17

    :goto_30
    or-int v0, v23, v0

    or-int v0, v16, v0

    const-string v27, "Titan_Engine"

    const-string v28, "NOX"

    const-string v18, "BlueStacks"

    const-string v19, "Genymotion"

    const-string v20, "Droid4X"

    const-string v21, "Windroy"

    const-string v22, "LDPlayer"

    const-string v23, "Andy"

    const-string v24, "MEMU"

    const-string v25, "MUMU"

    const-string v26, "QEMU"

    filled-new-array/range {v18 .. v28}, [Ljava/lang/String;

    move-result-object v3

    :try_start_1e
    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_27
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_29

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    move/from16 v6, v17

    :goto_31
    const/16 v7, 0xb

    if-ge v6, v7, :cond_27

    aget-object v7, v3, v6

    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v7}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_28

    iput-object v7, v1, Lio/seon/androidsdk/service/l0;->c:Ljava/lang/String;
    :try_end_1e
    .catch Ljava/lang/Exception; {:try_start_1e .. :try_end_1e} :catch_c

    goto :goto_32

    :cond_28
    add-int/lit8 v6, v6, 0x1

    goto :goto_31

    :catch_c
    :cond_29
    :goto_32
    const-string v3, "compound emu trigger - device id: "

    :try_start_1f
    sget-object v4, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->BATTERY_CAPACITY:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-virtual {v4}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v8, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v4, v5}, Ljava/lang/Math;->round(D)J

    move-result-wide v4

    long-to-int v4, v4

    sget-object v5, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->DEVICE_ID:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-virtual {v5}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v8, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    sget-object v6, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->CPU_COUNT:Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;

    invoke-virtual {v6}, Lio/seon/androidsdk/service/EmulatorDetector$PayloadProps;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v6}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/16 v7, 0x3e8

    if-ne v4, v7, :cond_2c

    if-eqz v5, :cond_2a

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v4

    const/16 v7, 0x40

    if-ge v4, v7, :cond_2a

    invoke-virtual {v3, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_33

    :cond_2a
    const/4 v3, 0x1

    if-ne v6, v3, :cond_2b

    const-string v3, "compound emu trigger - cpu count: 1"

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_33

    :cond_2b
    invoke-virtual {v1}, Lio/seon/androidsdk/service/l0;->d()V
    :try_end_1f
    .catch Ljava/lang/Exception; {:try_start_1f .. :try_end_1f} :catch_d

    :catch_d
    :cond_2c
    :goto_33
    iget-object v3, v1, Lio/seon/androidsdk/service/l0;->c:Ljava/lang/String;

    iget-object v4, v2, Lio/seon/androidsdk/service/h1;->x:Ljava/lang/Object;

    check-cast v4, Lio/seon/androidsdk/service/i1;

    iget-wide v5, v2, Lio/seon/androidsdk/service/h1;->w:J

    iget-object v2, v2, Lio/seon/androidsdk/service/h1;->y:Ljava/lang/Object;

    check-cast v2, Lorg/json/JSONObject;

    iput-boolean v0, v4, Lio/seon/androidsdk/service/i1;->f:Z

    iput-object v14, v4, Lio/seon/androidsdk/service/i1;->d:Ljava/util/ArrayList;

    iput-object v3, v4, Lio/seon/androidsdk/service/i1;->e:Ljava/lang/String;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v5

    :try_start_20
    const-string v0, "performance_emulator"

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_20
    .catch Ljava/lang/Exception; {:try_start_20 .. :try_end_20} :catch_e

    :catch_e
    return-void
.end method

.method public final c(Ljava/lang/String;[Ljava/lang/String;)Z
    .locals 7

    const/4 v0, 0x0

    if-eqz p2, :cond_5

    array-length v1, p2

    if-nez v1, :cond_0

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_0
    array-length v2, p2

    if-ge v1, v2, :cond_5

    aget-object v2, p2, v1

    iget-object v3, p0, Lio/seon/androidsdk/service/l0;->d:Ljava/util/ArrayList;

    const/4 v4, 0x1

    if-nez v2, :cond_1

    if-nez p1, :cond_1

    const-string p1, "Build prop: null filter: null"

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v4

    :cond_1
    if-nez v2, :cond_2

    const-string v2, ""

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_3

    sget-object v5, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {p1, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_4

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v0, "Build prop: "

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " filter: "

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v4

    :cond_3
    invoke-virtual {p1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    const-string p1, "Build prop: empty filter: empty"

    invoke-virtual {v3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return v4

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_5
    :goto_1
    return v0
.end method

.method public final d()V
    .locals 8

    const/16 v0, 0x12

    const/16 v1, 0x11

    const/16 v2, 0x13

    :try_start_0
    filled-new-array {v1, v2, v0}, [I

    move-result-object v0

    const/16 v1, 0xc

    const/4 v2, 0x6

    const/16 v3, 0xd

    filled-new-array {v3, v1, v2}, [I

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iget-object v3, p0, Lio/seon/androidsdk/service/l0;->a:Landroid/content/Context;

    const-string v4, "sensor"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/hardware/SensorManager;

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    const/4 v6, 0x3

    if-ge v5, v6, :cond_1

    aget v6, v0, v5

    invoke-virtual {v3, v6}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v7

    if-nez v7, :cond_0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :cond_1
    :goto_1
    if-ge v4, v6, :cond_3

    aget v0, v1, v4

    invoke-virtual {v3, v0}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/4 v7, 0x2

    if-le v5, v7, :cond_2

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "compound emu trigger - sensors missing: "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", "

    invoke-static {v3, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " has sensor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lio/seon/androidsdk/service/l0;->d:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :catch_0
    :cond_3
    return-void
.end method
