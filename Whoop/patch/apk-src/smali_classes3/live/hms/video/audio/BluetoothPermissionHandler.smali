.class public final Llive/hms/video/audio/BluetoothPermissionHandler;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0018\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\tH\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000fJ\u0008\u0010\u0013\u001a\u00020\rH\u0002J\u0010\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\tX\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0015"
    }
    d2 = {
        "Llive/hms/video/audio/BluetoothPermissionHandler;",
        "",
        "hmsTrackSettings",
        "Llive/hms/video/media/settings/HMSTrackSettings;",
        "<init>",
        "(Llive/hms/video/media/settings/HMSTrackSettings;)V",
        "getHmsTrackSettings",
        "()Llive/hms/video/media/settings/HMSTrackSettings;",
        "BLUETOOTH_CONNECT_PERMISSION",
        "",
        "getBLUETOOTH_CONNECT_PERMISSION",
        "()Ljava/lang/String;",
        "hasPermission",
        "",
        "context",
        "Landroid/content/Context;",
        "permission",
        "hasBluetoothError",
        "Llive/hms/video/audio/BluetoothErrorType;",
        "isDeviceAndroid12AndAbove",
        "isTargetingAndroid12AndAbove",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final BLUETOOTH_CONNECT_PERMISSION:Ljava/lang/String;

.field private final hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;


# direct methods
.method public constructor <init>(Llive/hms/video/media/settings/HMSTrackSettings;)V
    .locals 1

    const-string v0, "hmsTrackSettings"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    const-string p1, "android.permission.BLUETOOTH_CONNECT"

    iput-object p1, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->BLUETOOTH_CONNECT_PERMISSION:Ljava/lang/String;

    return-void
.end method

.method private final hasPermission(Landroid/content/Context;Ljava/lang/String;)Z
    .locals 2

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v0

    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v1

    invoke-virtual {p1, p2, v0, v1}, Landroid/content/Context;->checkPermission(Ljava/lang/String;II)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final isDeviceAndroid12AndAbove()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-le v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final isTargetingAndroid12AndAbove(Landroid/content/Context;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object p1

    iget p1, p1, Landroid/content/pm/ApplicationInfo;->targetSdkVersion:I

    const/16 v0, 0x1e

    if-le p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method


# virtual methods
.method public final getBLUETOOTH_CONNECT_PERMISSION()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->BLUETOOTH_CONNECT_PERMISSION:Ljava/lang/String;

    return-object v0
.end method

.method public final getHmsTrackSettings()Llive/hms/video/media/settings/HMSTrackSettings;
    .locals 1

    iget-object v0, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    return-object v0
.end method

.method public final hasBluetoothError(Landroid/content/Context;)Llive/hms/video/audio/BluetoothErrorType;
    .locals 4

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.permission.BLUETOOTH"

    invoke-direct {p0, p1, v0}, Llive/hms/video/audio/BluetoothPermissionHandler;->hasPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    iget-object v1, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->hmsTrackSettings:Llive/hms/video/media/settings/HMSTrackSettings;

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSTrackSettings;->getAudioSettings()Llive/hms/video/media/settings/HMSAudioTrackSettings;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Llive/hms/video/media/settings/HMSAudioTrackSettings;->getDisableInternalAudioManager()Z

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v3, :cond_0

    return-object v2

    :cond_0
    invoke-direct {p0}, Llive/hms/video/audio/BluetoothPermissionHandler;->isDeviceAndroid12AndAbove()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Llive/hms/video/audio/BluetoothPermissionHandler;->isTargetingAndroid12AndAbove(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Llive/hms/video/audio/BluetoothPermissionHandler;->BLUETOOTH_CONNECT_PERMISSION:Ljava/lang/String;

    invoke-direct {p0, p1, v0}, Llive/hms/video/audio/BluetoothPermissionHandler;->hasPermission(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_2

    sget-object p1, Llive/hms/video/audio/BluetoothErrorType;->NO_BLUETOOTH_CONNECT_PERMISSION:Llive/hms/video/audio/BluetoothErrorType;

    return-object p1

    :cond_1
    if-nez v0, :cond_2

    sget-object p1, Llive/hms/video/audio/BluetoothErrorType;->NO_BLUETOOTH_PERMISSON:Llive/hms/video/audio/BluetoothErrorType;

    return-object p1

    :cond_2
    return-object v2
.end method
