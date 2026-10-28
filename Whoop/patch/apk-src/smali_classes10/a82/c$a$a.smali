.class public final La82/c$a$a;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La82/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "a82/c$a$a",
        "Landroid/bluetooth/le/ScanCallback;",
        "",
        "callbackType",
        "Landroid/bluetooth/le/ScanResult;",
        "result",
        "Ll83/a0;",
        "onScanResult",
        "(ILandroid/bluetooth/le/ScanResult;)V",
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
.field final synthetic a:La82/c;

.field final synthetic b:Ldc3/u;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ldc3/u;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(La82/c;Ldc3/u;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La82/c;",
            "Ldc3/u;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, La82/c$a$a;->a:La82/c;

    iput-object p2, p0, La82/c$a$a;->b:Ldc3/u;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 5

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, La82/c$a$a;->a:La82/c;

    invoke-static {p1}, La82/c;->c(La82/c;)La82/a;

    move-result-object p1

    invoke-virtual {p1, p2}, La82/a;->c(Landroid/bluetooth/le/ScanResult;)Lst0/v;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object v0, p0, La82/c$a$a;->a:La82/c;

    invoke-static {v0}, La82/c;->e(La82/c;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v1}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    const-string v3, "Found Whoop device; Name: "

    const-string v4, ", Address: "

    invoke-static {v3, v1, v4, v2}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, La82/c$a$a;->b:Ldc3/u;

    new-instance v1, Lqt0/b;

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, ""

    :cond_0
    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v3

    const-string v4, "getAddress(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result p2

    invoke-direct {v1, v2, v3, p2, p1}, Lqt0/b;-><init>(Ljava/lang/String;Ljava/lang/String;ILst0/v;)V

    check-cast v0, Ldc3/t;

    invoke-virtual {v0, v1}, Ldc3/t;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method
