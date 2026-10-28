.class public final Lcom/whoop/ble/scan/BleDeviceScannerService$b;
.super Ltd3/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ble/scan/BleDeviceScannerService;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0007*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001d\u0010\u000b\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "com/whoop/ble/scan/BleDeviceScannerService$b",
        "Ltd3/i;",
        "",
        "callbackType",
        "Ltd3/m;",
        "result",
        "Ll83/a0;",
        "c",
        "(ILtd3/m;)V",
        "",
        "results",
        "a",
        "(Ljava/util/List;)V",
        "errorCode",
        "b",
        "(I)V",
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
.field final synthetic a:Lcom/whoop/ble/scan/BleDeviceScannerService;

.field final synthetic b:Ltd3/b;

.field final synthetic c:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/ble/scan/BleDeviceScannerService;Ltd3/b;Lbc3/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ble/scan/BleDeviceScannerService;",
            "Ltd3/b;",
            "Lbc3/k;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    iput-object p2, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    iput-object p3, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ltd3/m;",
            ">;)V"
        }
    .end annotation

    const-string v0, "results"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ltd3/m;

    iget-object v2, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {v2}, Lcom/whoop/ble/scan/BleDeviceScannerService;->a(Lcom/whoop/ble/scan/BleDeviceScannerService;)Ltr2/n;

    move-result-object v2

    iget-object v1, v1, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v1

    const-string v3, "scanner found  onBatchScanResults "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    invoke-virtual {v0, p0}, Ltd3/b;->d(Ltd3/i;)V

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    invoke-interface {v0}, Lbc3/k;->isActive()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    invoke-static {p1}, Lm83/s;->F0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ltd3/m;

    iget-object p1, p1, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    const-string v1, "getDevice(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;

    iget-object v2, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    invoke-direct {v1, v2, p0}, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;-><init>(Ltd3/b;Lcom/whoop/ble/scan/BleDeviceScannerService$b;)V

    invoke-interface {v0, p1, v1}, Lbc3/k;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {p1}, Lcom/whoop/ble/scan/BleDeviceScannerService;->b(Lcom/whoop/ble/scan/BleDeviceScannerService;)V

    :cond_2
    :goto_1
    return-void
.end method

.method public b(I)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {v0}, Lcom/whoop/ble/scan/BleDeviceScannerService;->a(Lcom/whoop/ble/scan/BleDeviceScannerService;)Ltr2/n;

    move-result-object v0

    const-string v1, "onScanFailed errorCode: "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    invoke-virtual {v0, p0}, Ltd3/b;->d(Ltd3/i;)V

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    invoke-interface {v0}, Lbc3/k;->isActive()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    new-instance v1, Ljava/lang/Exception;

    const-string v2, "BLE scan finished with error code "

    invoke-static {p1, v2}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    invoke-interface {v0, p1}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {p1}, Lcom/whoop/ble/scan/BleDeviceScannerService;->b(Lcom/whoop/ble/scan/BleDeviceScannerService;)V

    :cond_0
    return-void
.end method

.method public c(ILtd3/m;)V
    .locals 2

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {p1}, Lcom/whoop/ble/scan/BleDeviceScannerService;->a(Lcom/whoop/ble/scan/BleDeviceScannerService;)Ltr2/n;

    move-result-object p1

    iget-object p2, p2, Ltd3/m;->w:Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v0

    const-string v1, "scanner found onScanResult "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    invoke-virtual {p1, p0}, Ltd3/b;->d(Ltd3/i;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->c:Lbc3/k;

    const-string v0, "getDevice(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;

    iget-object v1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->b:Ltd3/b;

    invoke-direct {v0, v1, p0}, Lcom/whoop/ble/scan/BleDeviceScannerService$b$b;-><init>(Ltd3/b;Lcom/whoop/ble/scan/BleDeviceScannerService$b;)V

    invoke-interface {p1, p2, v0}, Lbc3/k;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a:Lcom/whoop/ble/scan/BleDeviceScannerService;

    invoke-static {p1}, Lcom/whoop/ble/scan/BleDeviceScannerService;->b(Lcom/whoop/ble/scan/BleDeviceScannerService;)V

    :cond_0
    return-void
.end method
