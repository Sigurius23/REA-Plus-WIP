.class final Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ble/scan/BleDeviceScannerService$b;->a(Ljava/util/List;)V
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

    iput-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;->w:Ltd3/b;

    iput-object p2, p0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;->x:Lcom/whoop/ble/scan/BleDeviceScannerService$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 25

    move-object/from16 v0, p0

    const-string v1, "it"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;->w:Ltd3/b;

    iget-object v2, v0, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;->x:Lcom/whoop/ble/scan/BleDeviceScannerService$b;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v2, :cond_0

    new-instance v3, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    new-instance v5, Ltd3/n;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const-wide/16 v8, 0x0

    const/4 v11, 0x3

    const/16 v13, 0xff

    const-wide/16 v17, 0x2710

    const-wide/16 v21, 0x1f4

    const-wide/16 v23, 0x1194

    move v10, v7

    move v12, v7

    move v14, v7

    move v15, v7

    move/from16 v16, v7

    move-wide/from16 v19, v17

    invoke-direct/range {v5 .. v24}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    invoke-virtual {v1, v4, v5, v2, v3}, Ltd3/b;->c(Ljava/util/List;Ltd3/n;Ltd3/i;Landroid/os/Handler;)V

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "callback is null"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lcom/whoop/ble/scan/BleDeviceScannerService$b$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
