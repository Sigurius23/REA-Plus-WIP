.class public final Lcom/whoop/ble/scan/BleDeviceScannerService;
.super Landroid/app/Service;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ble/scan/BleDeviceScannerService$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\u0019\u0010\u000b\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0087@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0018\u0010\u0015\u001a\u00060\u0012R\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/ble/scan/BleDeviceScannerService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "d",
        "e",
        "onCreate",
        "Landroid/content/Intent;",
        "intent",
        "Landroid/os/IBinder;",
        "onBind",
        "(Landroid/content/Intent;)Landroid/os/IBinder;",
        "",
        "name",
        "Landroid/bluetooth/BluetoothDevice;",
        "c",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/ble/scan/BleDeviceScannerService$a;",
        "w",
        "Lcom/whoop/ble/scan/BleDeviceScannerService$a;",
        "serviceBinder",
        "Ltr2/n;",
        "x",
        "Ltr2/n;",
        "logger",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "y",
        "Landroidx/core/app/NotificationCompat$Builder;",
        "scannerNotification",
        "a",
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

.annotation runtime Ll83/c;
.end annotation


# instance fields
.field private final w:Lcom/whoop/ble/scan/BleDeviceScannerService$a;

.field private final x:Ltr2/n;

.field private y:Landroidx/core/app/NotificationCompat$Builder;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    new-instance v0, Lcom/whoop/ble/scan/BleDeviceScannerService$a;

    invoke-direct {v0, p0}, Lcom/whoop/ble/scan/BleDeviceScannerService$a;-><init>(Lcom/whoop/ble/scan/BleDeviceScannerService;)V

    iput-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->w:Lcom/whoop/ble/scan/BleDeviceScannerService$a;

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "BleScannerService"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/ble/scan/BleDeviceScannerService;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/ble/scan/BleDeviceScannerService;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ble/scan/BleDeviceScannerService;->e()V

    return-void
.end method

.method private final d()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Starting foreground scanning service"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object v0, Lc12/e;->b:Lc12/d;

    iget-object v1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->y:Landroidx/core/app/NotificationCompat$Builder;

    const/4 v2, 0x0

    const-string v3, "scannerNotification"

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lc12/d;->a(Landroidx/core/app/NotificationCompat$Builder;)V

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    const/16 v4, 0x2b

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->y:Landroidx/core/app/NotificationCompat$Builder;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    const/16 v1, 0x10

    invoke-virtual {p0, v4, v0, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;I)V

    return-void

    :cond_0
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_1
    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->y:Landroidx/core/app/NotificationCompat$Builder;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/core/app/NotificationCompat$Builder;->build()Landroid/app/Notification;

    move-result-object v0

    invoke-virtual {p0, v4, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    return-void

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method private final e()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Stopping foreground scanning service!"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/app/Service;->stopForeground(Z)V

    invoke-virtual {p0}, Landroid/app/Service;->stopSelf()V

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct/range {p0 .. p0}, Lcom/whoop/ble/scan/BleDeviceScannerService;->d()V

    new-instance v0, Lbc3/m;

    invoke-static/range {p2 .. p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, v1}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    invoke-static {}, Ltd3/b;->a()Ltd3/b;

    move-result-object v1

    new-instance v2, Lcom/whoop/ble/scan/BleDeviceScannerService$b;

    move-object/from16 v3, p0

    invoke-direct {v2, v3, v1, v0}, Lcom/whoop/ble/scan/BleDeviceScannerService$b;-><init>(Lcom/whoop/ble/scan/BleDeviceScannerService;Ltd3/b;Lbc3/k;)V

    new-instance v4, Ltd3/n;

    const/4 v5, 0x2

    const/4 v6, 0x1

    const-wide/16 v7, 0x0

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/16 v12, 0xff

    const-wide/16 v16, 0x2710

    const-wide/16 v20, 0x0

    move v9, v6

    move v13, v6

    move v14, v6

    move v15, v6

    move-wide/from16 v18, v16

    move-wide/from16 v22, v20

    invoke-direct/range {v4 .. v23}, Ltd3/n;-><init>(IIJIIZIZZZJJJJ)V

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    new-instance v9, Landroid/os/ParcelUuid;

    sget-object v6, Lkj0/a;->a:Ljava/util/UUID;

    invoke-direct {v9, v6}, Landroid/os/ParcelUuid;-><init>(Ljava/util/UUID;)V

    new-instance v6, Ltd3/k;

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, -0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v7, p1

    invoke-direct/range {v6 .. v16}, Ltd3/k;-><init>(Ljava/lang/String;Ljava/lang/String;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;Landroid/os/ParcelUuid;[B[BI[B[B)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v3}, Lcom/whoop/ble/scan/BleDeviceScannerService;->a(Lcom/whoop/ble/scan/BleDeviceScannerService;)Ltr2/n;

    move-result-object v6

    const-string v7, "Starting scan for DFU device!"

    const/4 v8, 0x0

    new-array v8, v8, [Lqr2/a$a;

    invoke-interface {v6, v7, v8}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v1, v5, v4, v2}, Ltd3/b;->b(Ljava/util/ArrayList;Ltd3/n;Ltd3/i;)V

    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lr83/a;->w:Lr83/a;

    return-object v0
.end method

.method public onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 2

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onBind"

    invoke-interface {p1, v1, v0}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->w:Lcom/whoop/ble/scan/BleDeviceScannerService$a;

    return-object p1
.end method

.method public onCreate()V
    .locals 3

    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    iget-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->x:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onCreate called, building a scanner notification"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Landroidx/core/app/NotificationCompat$Builder;

    const-string v1, "06500_FirmwareUpdate"

    invoke-direct {v0, p0, v1}, Landroidx/core/app/NotificationCompat$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setAutoCancel(Z)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lks0/a;->e:I

    invoke-static {p0, v1}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lks0/a;->a:I

    invoke-static {p0, v1}, Ls4/c;->getString(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setContentText(Ljava/lang/CharSequence;)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lb12/f;->a:I

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setSmallIcon(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    sget v1, Lb12/e;->a:I

    invoke-static {p0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/core/app/NotificationCompat$Builder;->setColor(I)Landroidx/core/app/NotificationCompat$Builder;

    move-result-object v0

    const-string v1, "setColor(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/ble/scan/BleDeviceScannerService;->y:Landroidx/core/app/NotificationCompat$Builder;

    return-void
.end method
