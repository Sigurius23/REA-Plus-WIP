.class final Ly42/d$a;
.super Lno/nordicsemi/android/ble/b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ly42/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u0006\u00a8\u0006\r"
    }
    d2 = {
        "Ly42/d$a;",
        "Lno/nordicsemi/android/ble/b;",
        "<init>",
        "(Ly42/d;)V",
        "Ll83/a0;",
        "F1",
        "()V",
        "Landroid/bluetooth/BluetoothGatt;",
        "gatt",
        "",
        "T1",
        "(Landroid/bluetooth/BluetoothGatt;)Z",
        "j2",
        "puffin_release"
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
.field final synthetic k0:Ly42/d;


# direct methods
.method public constructor <init>(Ly42/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Ly42/d$a;->k0:Ly42/d;

    invoke-direct {p0}, Lno/nordicsemi/android/ble/c0;-><init>()V

    return-void
.end method

.method public static synthetic m2(Ly42/d;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Ly42/d$a;->p2(Ly42/d;Landroid/bluetooth/BluetoothDevice;I)V

    return-void
.end method

.method public static synthetic n2(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V
    .locals 0

    invoke-static {p0, p1}, Ly42/d$a;->o2(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V

    return-void
.end method

.method private static final o2(Ly42/d;Landroid/bluetooth/BluetoothDevice;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Lqr2/a$a;

    const-string v0, "Successfully set MTU to 247"

    invoke-interface {p0, v0, p1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final p2(Ly42/d;Landroid/bluetooth/BluetoothDevice;I)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ly42/d;->g0(Ly42/d;)Ltr2/n;

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

    iget-object v0, p0, Ly42/d$a;->k0:Ly42/d;

    const/16 v1, 0xf7

    invoke-static {v0, v1}, Ly42/d;->j0(Ly42/d;I)Lno/nordicsemi/android/ble/g0;

    move-result-object v0

    iget-object v1, p0, Ly42/d$a;->k0:Ly42/d;

    new-instance v2, Ly42/c;

    invoke-direct {v2, v1}, Ly42/c;-><init>(Ly42/d;)V

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->g:Lmd3/e;

    new-instance v2, Ly42/c;

    invoke-direct {v2, v1}, Ly42/c;-><init>(Ly42/d;)V

    iput-object v2, v0, Lno/nordicsemi/android/ble/k0;->h:Lmd3/c;

    invoke-virtual {v0}, Lno/nordicsemi/android/ble/k0;->b()V

    return-void
.end method

.method public T1(Landroid/bluetooth/BluetoothGatt;)Z
    .locals 2

    const-string v0, "gatt"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ly42/d$a;->k0:Ly42/d;

    invoke-static {v0}, Ly42/d;->h0(Ly42/d;)Lys0/a$a;

    move-result-object v0

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothGatt;->getServices()Ljava/util/List;

    move-result-object p1

    const-string v1, "getServices(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0, p1}, Lys0/a$a;->c1(Ljava/util/List;)Z

    move-result p1

    return p1
.end method

.method public j2()V
    .locals 1

    iget-object v0, p0, Ly42/d$a;->k0:Ly42/d;

    invoke-static {v0}, Ly42/d;->h0(Ly42/d;)Lys0/a$a;

    move-result-object v0

    invoke-interface {v0}, Lys0/a$a;->F0()V

    return-void
.end method
