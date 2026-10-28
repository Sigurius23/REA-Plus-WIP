.class final Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c(ILtd3/m;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Ltd3/b;

.field final synthetic x:Lcom/whoop/ble/scan/BleDeviceScannerService$b;


# direct methods
.method public constructor <init>(Ltd3/b;Lcom/whoop/ble/scan/BleDeviceScannerService$b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;->w:Ltd3/b;

    iput-object p2, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;->x:Lcom/whoop/ble/scan/BleDeviceScannerService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;->w:Ltd3/b;

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;->x:Lcom/whoop/ble/scan/BleDeviceScannerService$b;

    invoke-virtual {p1, v0}, Ltd3/b;->d(Ltd3/i;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
