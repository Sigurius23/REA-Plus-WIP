.class public final Lcom/whoop/ble/scan/BleDeviceScannerService$a;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/ble/scan/BleDeviceScannerService;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/ble/scan/BleDeviceScannerService$a;",
        "Landroid/os/Binder;",
        "<init>",
        "(Lcom/whoop/ble/scan/BleDeviceScannerService;)V",
        "Lcom/whoop/ble/scan/BleDeviceScannerService;",
        "a",
        "()Lcom/whoop/ble/scan/BleDeviceScannerService;",
        "connectivity_release"
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
.field final synthetic f:Lcom/whoop/ble/scan/BleDeviceScannerService;


# direct methods
.method public constructor <init>(Lcom/whoop/ble/scan/BleDeviceScannerService;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$a;->f:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lcom/whoop/ble/scan/BleDeviceScannerService;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$a;->f:Lcom/whoop/ble/scan/BleDeviceScannerService;

    return-object v0
.end method
