.class public final Lcom/whoop/whooplabs/io/HrDeviceConnection$d;
.super Landroid/bluetooth/BluetoothGattCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/io/HrDeviceConnection;->w(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ!\u0010\u000e\u001a\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u000cH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00072\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "com/whoop/whooplabs/io/HrDeviceConnection$d",
        "Landroid/bluetooth/BluetoothGattCallback;",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "status",
        "newState",
        "Ll83/a0;",
        "onConnectionStateChange",
        "(Landroid/bluetooth/BluetoothGatt;II)V",
        "onServicesDiscovered",
        "(Landroid/bluetooth/BluetoothGatt;I)V",
        "Landroid/bluetooth/BluetoothGattCharacteristic;",
        "characteristic",
        "onCharacteristicChanged",
        "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V",
        "Landroid/bluetooth/BluetoothGattDescriptor;",
        "descriptor",
        "onDescriptorWrite",
        "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V",
        "whooplabs_release"
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
.field final synthetic a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

.field final synthetic b:Z

.field final synthetic c:Lbc3/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbc3/k;"
        }
    .end annotation
.end field

.field final synthetic d:Landroid/bluetooth/BluetoothDevice;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;ZLbc3/k;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/io/HrDeviceConnection;",
            "Z",
            "Lbc3/k;",
            "Landroid/bluetooth/BluetoothDevice;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iput-boolean p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->b:Z

    iput-object p3, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    iput-object p4, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->d:Landroid/bluetooth/BluetoothDevice;

    invoke-direct {p0}, Landroid/bluetooth/BluetoothGattCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onCharacteristicChanged(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;)V
    .locals 4

    const-string p1, "characteristic"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getUuid()Ljava/util/UUID;

    move-result-object p1

    invoke-static {}, Lkj0/a;->b()Ljava/util/UUID;

    move-result-object v0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iget-object v0, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {v0}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->h(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Ltr2/n;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {v1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->g(Lcom/whoop/whooplabs/io/HrDeviceConnection;Landroid/bluetooth/BluetoothGattCharacteristic;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "onCharacteristicChanged: HR chr is "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v3, " , hr is "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p1, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->F()Lbc3/c0;

    move-result-object p1

    new-instance v0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$a;

    iget-object v1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    const/4 v2, 0x0

    invoke-direct {v0, v1, p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$a;-><init>(Lcom/whoop/whooplabs/io/HrDeviceConnection;Landroid/bluetooth/BluetoothGattCharacteristic;Lq83/d;)V

    const/4 p2, 0x3

    invoke-static {p1, v2, v2, v0, p2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    return-void
.end method

.method public onConnectionStateChange(Landroid/bluetooth/BluetoothGatt;II)V
    .locals 2

    const-string p2, "gatt"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->h(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Ltr2/n;

    move-result-object p2

    invoke-static {p3}, Lb92/a;->a(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "new HR connection state: "

    invoke-static {v1, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-static {p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->k(Lcom/whoop/whooplabs/io/HrDeviceConnection;)Lec3/p1;

    move-result-object p2

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    check-cast p2, Lec3/h2;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p2, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    if-eqz p3, :cond_1

    const/4 p2, 0x2

    if-eq p3, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->discoverServices()Z

    return-void

    :cond_1
    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-boolean p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->b:Z

    invoke-virtual {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->r(Z)V

    return-void
.end method

.method public onDescriptorWrite(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattDescriptor;I)V
    .locals 3

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    if-nez p3, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-static {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->d:Landroid/bluetooth/BluetoothDevice;

    sget-object p3, Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;->w:Lcom/whoop/whooplabs/io/HrDeviceConnection$d$b;

    invoke-interface {p1, p2, p3}, Lbc3/k;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_1
    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-static {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance p3, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lyw2/e;->t:I

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-direct {p3, v0, v2, v1, v2}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, p3}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onServicesDiscovered(Landroid/bluetooth/BluetoothGatt;I)V
    .locals 4

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-eqz p2, :cond_0

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-static {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lyw2/e;->h:I

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-static {}, Lkj0/a;->c()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGatt;->getService(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattService;

    move-result-object p2

    invoke-static {}, Lkj0/a;->b()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/bluetooth/BluetoothGattService;->getCharacteristic(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattCharacteristic;

    move-result-object p2

    if-nez p2, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p2, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lyw2/e;->g:I

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_1
    const/4 v2, 0x1

    invoke-virtual {p1, p2, v2}, Landroid/bluetooth/BluetoothGatt;->setCharacteristicNotification(Landroid/bluetooth/BluetoothGattCharacteristic;Z)Z

    move-result v2

    if-nez v2, :cond_2

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-static {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lyw2/e;->j:I

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_2
    invoke-static {}, Lkj0/a;->a()Ljava/util/UUID;

    move-result-object v2

    invoke-virtual {p2, v2}, Landroid/bluetooth/BluetoothGattCharacteristic;->getDescriptor(Ljava/util/UUID;)Landroid/bluetooth/BluetoothGattDescriptor;

    move-result-object p2

    if-nez p2, :cond_3

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-static {p2, p1}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lyw2/e;->i:I

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void

    :cond_3
    sget-object v2, Landroid/bluetooth/BluetoothGattDescriptor;->ENABLE_NOTIFICATION_VALUE:[B

    invoke-virtual {p2, v2}, Landroid/bluetooth/BluetoothGattDescriptor;->setValue([B)Z

    invoke-virtual {p1, p2}, Landroid/bluetooth/BluetoothGatt;->writeDescriptor(Landroid/bluetooth/BluetoothGattDescriptor;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-interface {p1}, Lbc3/k;->isActive()Z

    move-result p1

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->a:Lcom/whoop/whooplabs/io/HrDeviceConnection;

    iget-object p2, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    invoke-static {p1, p2}, Lcom/whoop/whooplabs/io/HrDeviceConnection;->b(Lcom/whoop/whooplabs/io/HrDeviceConnection;Lbc3/k;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/io/HrDeviceConnection$d;->c:Lbc3/k;

    new-instance p2, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;

    new-instance v2, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lyw2/e;->k:I

    invoke-direct {v2, v3, v1, v0, v1}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, v2}, Lcom/whoop/whooplabs/io/HrDeviceConnection$HrDeviceConnectionException;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {p2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    :cond_4
    return-void
.end method
