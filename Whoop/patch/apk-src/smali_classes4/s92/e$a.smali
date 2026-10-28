.class final Ls92/e$a;
.super Lno/nordicsemi/android/ble/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls92/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u0006J\u000f\u0010\r\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u0006\u00a8\u0006\u000e"
    }
    d2 = {
        "Ls92/e$a;",
        "Lno/nordicsemi/android/ble/b;",
        "<init>",
        "(Ls92/e;)V",
        "Ll83/a0;",
        "F1",
        "()V",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "T1",
        "(Landroid/bluetooth/BluetoothGatt;)Z",
        "f2",
        "j2",
        "core_release"
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
.field final synthetic k0:Ls92/e;


# direct methods
.method public constructor <init>(Ls92/e;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ls92/e$a;->k0:Ls92/e;

    invoke-direct {p0}, Lno/nordicsemi/android/ble/c0;-><init>()V

    return-void
.end method

.method public static synthetic m2(Ls92/e;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ls92/e$a;->p2(Ls92/e;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic n2(Ls92/e;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0, p1}, Ls92/e$a;->o2(Ls92/e;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private static final o2(Ls92/e;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ls92/e;->i0(Ls92/e;)Ltr2/n;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    const-string v0, "Successfully set MTU to 247"

    invoke-interface {p0, v0, p1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final p2(Ls92/e;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ls92/e;->i0(Ls92/e;)Ltr2/n;

    move-result-object p0

    const-string p1, "Failed to set MTU to 247 status = "

    invoke-static {p2, p1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p0, p1, p2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method


# virtual methods
.method public F1()V
    .locals 3

    iget-object v0, p0, Ls92/e$a;->k0:Ls92/e;

    invoke-static {v0}, Ls92/e;->i0(Ls92/e;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "bleManagerGattCallback initialize"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Ls92/e$a;->k0:Ls92/e;

    const/16 v1, 0xf7

    invoke-static {v0, v1}, Ls92/e;->j0(Ls92/e;I)Lno/nordicsemi/android/ble/g0;

    move-result-object v0

    iget-object v1, p0, Ls92/e$a;->k0:Ls92/e;

    new-instance v2, Ls92/d;

    invoke-direct {v2, v1}, Ls92/d;-><init>(Ls92/e;)V

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    new-instance v2, Ls92/d;

    invoke-direct {v2, v1}, Ls92/d;-><init>(Ls92/e;)V

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/k0;->b()V

    return-void
.end method

.method public T1(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ls92/e$a;->k0:Ls92/e;

    invoke-static {v0}, Ls92/e;->h0(Ls92/e;)Lys0/a$a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    const-string v1, "getServices(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lys0/a$a;->c1(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public f2()V
    .locals 0

    return-void
.end method

.method public j2()V
    .locals 1

    iget-object v0, p0, Ls92/e$a;->k0:Ls92/e;

    invoke-static {v0}, Ls92/e;->h0(Ls92/e;)Lys0/a$a;

    move-result-object v0

    invoke-interface {v0}, Lys0/a$a;->F0()V

    return-void
.end method
