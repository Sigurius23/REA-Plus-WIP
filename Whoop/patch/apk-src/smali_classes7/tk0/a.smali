.class public final Ltk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltk0/e;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\r\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000cJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0012\u0010\u000c\u00a8\u0006\u0016"
    }
    d2 = {
        "Ltk0/a;",
        "Ltk0/e;",
        "Landroid/content/Context;",
        "context",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "",
        "sdkVersion",
        "<init>",
        "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;I)V",
        "",
        "c",
        "()Z",
        "d",
        "Lcom/whoop/ble/api/scan/ScanFailure;",
        "a",
        "()Lcom/whoop/ble/api/scan/ScanFailure;",
        "Landroid/content/Context;",
        "b",
        "Landroid/bluetooth/BluetoothAdapter;",
        "I",
        "needsLocationForScan",
        "whoop-ble-transport_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Landroid/bluetooth/BluetoothAdapter;

.field private final c:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ltk0/a;->a:Landroid/content/Context;

    iput-object p2, p0, Ltk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    iput p3, p0, Ltk0/a;->c:I

    return-void
.end method

.method private final b()Z
    .locals 2

    iget v0, p0, Ltk0/a;->c:I

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final c()Z
    .locals 2

    invoke-direct {p0}, Ltk0/a;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "android.permission.ACCESS_FINE_LOCATION"

    goto :goto_0

    :cond_0
    const-string v0, "android.permission.BLUETOOTH_SCAN"

    :goto_0
    iget-object v1, p0, Ltk0/a;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method private final d()Z
    .locals 3

    iget-object v0, p0, Ltk0/a;->a:Landroid/content/Context;

    const-class v1, Landroid/location/LocationManager;

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/location/LocationManager;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/location/LocationManager;->isLocationEnabled()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method


# virtual methods
.method public a()Lcom/whoop/ble/api/scan/ScanFailure;
    .locals 1

    iget-object v0, p0, Ltk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;->w:Lcom/whoop/ble/api/scan/ScanFailure$BluetoothUnsupported;

    return-object v0

    :cond_0
    invoke-direct {p0}, Ltk0/a;->c()Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;->w:Lcom/whoop/ble/api/scan/ScanFailure$PermissionDenied;

    return-object v0

    :cond_1
    iget-object v0, p0, Ltk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-nez v0, :cond_2

    sget-object v0, Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;->w:Lcom/whoop/ble/api/scan/ScanFailure$BluetoothOff;

    return-object v0

    :cond_2
    invoke-direct {p0}, Ltk0/a;->b()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-direct {p0}, Ltk0/a;->d()Z

    move-result v0

    if-nez v0, :cond_3

    sget-object v0, Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;->w:Lcom/whoop/ble/api/scan/ScanFailure$LocationServicesOff;

    return-object v0

    :cond_3
    const/4 v0, 0x0

    return-object v0
.end method
