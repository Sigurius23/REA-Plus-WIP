.class public abstract Lor2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0008\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0013\u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lm/m;",
        "",
        "deviceAddress",
        "Landroid/companion/CompanionDeviceManager$Callback;",
        "managerCallback",
        "",
        "timeout",
        "Ll83/a0;",
        "a",
        "(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V",
        "Landroid/content/Intent;",
        "Landroid/bluetooth/BluetoothDevice;",
        "c",
        "(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;",
        "app_prodStandardRelease"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whoop/domain/exception/CompanionDevicePairingException;
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "managerCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "Activity.associateCompanionDevice"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v5

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lor2/p$b;

    invoke-direct {v1, v0, p0, p2}, Lor2/p$b;-><init>(Lkotlin/jvm/internal/g0;Lm/m;Landroid/companion/CompanionDeviceManager$Callback;)V

    const-class v2, Landroid/companion/CompanionDeviceManager;

    invoke-virtual {p0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    move-object v8, v2

    check-cast v8, Landroid/companion/CompanionDeviceManager;

    new-instance v2, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v2}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    invoke-virtual {v2, p1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceAddress(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v2

    new-instance v3, Landroid/companion/BluetoothLeDeviceFilter$Builder;

    invoke-direct {v3}, Landroid/companion/BluetoothLeDeviceFilter$Builder;-><init>()V

    invoke-virtual {v3, v2}, Landroid/companion/BluetoothLeDeviceFilter$Builder;->setScanFilter(Landroid/bluetooth/le/ScanFilter;)Landroid/companion/BluetoothLeDeviceFilter$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/companion/BluetoothLeDeviceFilter$Builder;->build()Landroid/companion/BluetoothLeDeviceFilter;

    move-result-object v2

    const-string v3, "build(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroid/companion/BluetoothDeviceFilter$Builder;

    invoke-direct {v4}, Landroid/companion/BluetoothDeviceFilter$Builder;-><init>()V

    invoke-virtual {v4, p1}, Landroid/companion/BluetoothDeviceFilter$Builder;->setAddress(Ljava/lang/String;)Landroid/companion/BluetoothDeviceFilter$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/companion/BluetoothDeviceFilter$Builder;->build()Landroid/companion/BluetoothDeviceFilter;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Landroid/companion/AssociationRequest$Builder;

    invoke-direct {v4}, Landroid/companion/AssociationRequest$Builder;-><init>()V

    invoke-virtual {v4, p1}, Landroid/companion/AssociationRequest$Builder;->addDeviceFilter(Landroid/companion/DeviceFilter;)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/companion/AssociationRequest$Builder;->addDeviceFilter(Landroid/companion/DeviceFilter;)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    const/4 v2, 0x1

    invoke-virtual {p1, v2}, Landroid/companion/AssociationRequest$Builder;->setSingleDevice(Z)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/companion/AssociationRequest$Builder;->build()Landroid/companion/AssociationRequest;

    move-result-object p1

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    const-string v4, "Starting association request"

    invoke-interface {v5, v4, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz v8, :cond_0

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p0

    new-instance v2, Lor2/p$a;

    const/4 v7, 0x0

    move-object v6, p2

    move-wide v3, p3

    invoke-direct/range {v2 .. v7}, Lor2/p$a;-><init>(JLtr2/n;Landroid/companion/CompanionDeviceManager$Callback;Lq83/d;)V

    invoke-virtual {p0, v2}, Landroidx/lifecycle/b0;->a(Lc93/m;)Lbc3/c2;

    move-result-object p0

    iput-object p0, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object p0, Lor2/n;->c:Lor2/n$a;

    invoke-virtual {p0}, Lor2/n$a;->a()Landroid/os/Handler;

    move-result-object p0

    invoke-virtual {v8, p1, v1, p0}, Landroid/companion/CompanionDeviceManager;->associate(Landroid/companion/AssociationRequest;Landroid/companion/CompanionDeviceManager$Callback;Landroid/os/Handler;)V

    return-void

    :cond_0
    new-array p0, v2, [Lqr2/a$a;

    const-string p1, "Companion Device Manager is null!"

    invoke-interface {v5, p1, p0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p0, Lcom/whoop/domain/exception/CompanionDevicePairingException;

    invoke-direct {p0, p1}, Lcom/whoop/domain/exception/CompanionDevicePairingException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic b(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;JILjava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lcom/whoop/domain/exception/CompanionDevicePairingException;
        }
    .end annotation

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-wide/16 p3, 0x1388

    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lor2/p;->a(Lm/m;Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;J)V

    return-void
.end method

.method public static final c(Landroid/content/Intent;)Landroid/bluetooth/BluetoothDevice;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "android.companion.extra.DEVICE"

    invoke-virtual {p0, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    instance-of v0, p0, Landroid/bluetooth/le/ScanResult;

    if-eqz v0, :cond_0

    check-cast p0, Landroid/bluetooth/le/ScanResult;

    invoke-virtual {p0}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p0, Landroid/bluetooth/BluetoothDevice;

    if-eqz v0, :cond_1

    check-cast p0, Landroid/bluetooth/BluetoothDevice;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
