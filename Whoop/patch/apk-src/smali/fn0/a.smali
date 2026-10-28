.class public final Lfn0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lzs0/a;
.implements Lbc3/c0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lfn0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001\u0011B!\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000c\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008%\u0010&\u001a\u0004\u0008\'\u0010(\u00a8\u0006+"
    }
    d2 = {
        "Lfn0/a;",
        "Lzs0/a;",
        "Lbc3/c0;",
        "Landroid/companion/CompanionDeviceManager;",
        "manager",
        "Lin2/d;",
        "dispatcherFactory",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/companion/CompanionDeviceManager;Lin2/d;Ltr2/n;)V",
        "",
        "deviceAddress",
        "Landroid/companion/AssociationRequest;",
        "e",
        "(Ljava/lang/String;)Landroid/companion/AssociationRequest;",
        "",
        "a",
        "(Ljava/lang/String;)Z",
        "Ll83/a0;",
        "c",
        "()V",
        "Landroid/companion/CompanionDeviceManager$Callback;",
        "primaryCallback",
        "b",
        "(Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;)V",
        "w",
        "Landroid/companion/CompanionDeviceManager;",
        "getManager",
        "()Landroid/companion/CompanionDeviceManager;",
        "x",
        "Ltr2/n;",
        "Lbc3/u;",
        "y",
        "Lbc3/u;",
        "supervisorJob",
        "Lq83/j;",
        "z",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "E",
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


# static fields
.field public static final E:Lfn0/a$a;

.field private static final F:Landroid/os/Handler;


# instance fields
.field private final w:Landroid/companion/CompanionDeviceManager;

.field private final x:Ltr2/n;

.field private final y:Lbc3/u;

.field private final z:Lq83/j;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfn0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lfn0/a$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lfn0/a;->E:Lfn0/a$a;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "companion-device-handler"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    new-instance v1, Landroid/os/Handler;

    invoke-direct {v1, v0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    sput-object v1, Lfn0/a;->F:Landroid/os/Handler;

    return-void
.end method

.method public constructor <init>(Landroid/companion/CompanionDeviceManager;Lin2/d;Ltr2/n;)V
    .locals 1

    const-string v0, "dispatcherFactory"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    iput-object p3, p0, Lfn0/a;->x:Ltr2/n;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p1

    iput-object p1, p0, Lfn0/a;->y:Lbc3/u;

    invoke-interface {p2}, Lin2/d;->getDefault()Lq83/j;

    move-result-object p2

    invoke-interface {p2, p1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    iput-object p1, p0, Lfn0/a;->z:Lq83/j;

    return-void
.end method

.method public static final synthetic d(Lfn0/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lfn0/a;->x:Ltr2/n;

    return-object p0
.end method

.method private final e(Ljava/lang/String;)Landroid/companion/AssociationRequest;
    .locals 3

    new-instance v0, Landroid/bluetooth/le/ScanFilter$Builder;

    invoke-direct {v0}, Landroid/bluetooth/le/ScanFilter$Builder;-><init>()V

    invoke-virtual {v0, p1}, Landroid/bluetooth/le/ScanFilter$Builder;->setDeviceAddress(Ljava/lang/String;)Landroid/bluetooth/le/ScanFilter$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/le/ScanFilter$Builder;->build()Landroid/bluetooth/le/ScanFilter;

    move-result-object v0

    new-instance v1, Landroid/companion/BluetoothLeDeviceFilter$Builder;

    invoke-direct {v1}, Landroid/companion/BluetoothLeDeviceFilter$Builder;-><init>()V

    invoke-virtual {v1, v0}, Landroid/companion/BluetoothLeDeviceFilter$Builder;->setScanFilter(Landroid/bluetooth/le/ScanFilter;)Landroid/companion/BluetoothLeDeviceFilter$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/companion/BluetoothLeDeviceFilter$Builder;->build()Landroid/companion/BluetoothLeDeviceFilter;

    move-result-object v0

    const-string v1, "build(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/companion/BluetoothDeviceFilter$Builder;

    invoke-direct {v2}, Landroid/companion/BluetoothDeviceFilter$Builder;-><init>()V

    invoke-virtual {v2, p1}, Landroid/companion/BluetoothDeviceFilter$Builder;->setAddress(Ljava/lang/String;)Landroid/companion/BluetoothDeviceFilter$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/companion/BluetoothDeviceFilter$Builder;->build()Landroid/companion/BluetoothDeviceFilter;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Landroid/companion/AssociationRequest$Builder;

    invoke-direct {v2}, Landroid/companion/AssociationRequest$Builder;-><init>()V

    invoke-virtual {v2, p1}, Landroid/companion/AssociationRequest$Builder;->addDeviceFilter(Landroid/companion/DeviceFilter;)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/companion/AssociationRequest$Builder;->addDeviceFilter(Landroid/companion/DeviceFilter;)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/companion/AssociationRequest$Builder;->setSingleDevice(Z)Landroid/companion/AssociationRequest$Builder;

    move-result-object p1

    invoke-virtual {p1}, Landroid/companion/AssociationRequest$Builder;->build()Landroid/companion/AssociationRequest;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public a(Ljava/lang/String;)Z
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfn0/a;->x:Ltr2/n;

    const-string v1, "CDM: Device is associated: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/companion/CompanionDeviceManager;->getAssociations()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    return v2
.end method

.method public b(Ljava/lang/String;Landroid/companion/CompanionDeviceManager$Callback;)V
    .locals 4

    const-string v0, "deviceAddress"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "primaryCallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfn0/a;->x:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "CDM: Starting association request"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lkotlin/jvm/internal/g0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lfn0/a$c;

    invoke-direct {v2, v0, p2}, Lfn0/a$c;-><init>(Lkotlin/jvm/internal/g0;Landroid/companion/CompanionDeviceManager$Callback;)V

    iget-object p2, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    if-eqz p2, :cond_0

    new-instance p2, Lfn0/a$b;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v2, v1}, Lfn0/a$b;-><init>(Lfn0/a;Lfn0/a$c;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {p0, v1, v1, p2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p2

    iput-object p2, v0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object p2, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    invoke-direct {p0, p1}, Lfn0/a;->e(Ljava/lang/String;)Landroid/companion/AssociationRequest;

    move-result-object p1

    sget-object v0, Lfn0/a;->F:Landroid/os/Handler;

    invoke-virtual {p2, p1, v2, v0}, Landroid/companion/CompanionDeviceManager;->associate(Landroid/companion/AssociationRequest;Landroid/companion/CompanionDeviceManager$Callback;Landroid/os/Handler;)V

    return-void

    :cond_0
    iget-object p1, p0, Lfn0/a;->x:Ltr2/n;

    new-array p2, v1, [Lqr2/a$a;

    const-string v0, "Companion Device Manager is null!"

    invoke-interface {p1, v0, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Lcom/whoop/cdm/CompanionDevicePairingException;

    invoke-direct {p1, v0}, Lcom/whoop/cdm/CompanionDevicePairingException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public c()V
    .locals 4

    iget-object v0, p0, Lfn0/a;->x:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "CDM: Disassociating all associated devices"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/companion/CompanionDeviceManager;->getAssociations()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_1

    :cond_0
    sget-object v0, Lm83/y;->w:Lm83/y;

    :cond_1
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    iget-object v2, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    if-eqz v2, :cond_3

    invoke-virtual {v2, v1}, Landroid/companion/CompanionDeviceManager;->disassociate(Ljava/lang/String;)V

    :cond_3
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x1f

    if-lt v2, v3, :cond_2

    iget-object v2, p0, Lfn0/a;->w:Landroid/companion/CompanionDeviceManager;

    if-eqz v2, :cond_2

    invoke-virtual {v2, v1}, Landroid/companion/CompanionDeviceManager;->stopObservingDevicePresence(Ljava/lang/String;)V

    goto :goto_0

    :cond_4
    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 1

    iget-object v0, p0, Lfn0/a;->z:Lq83/j;

    return-object v0
.end method
