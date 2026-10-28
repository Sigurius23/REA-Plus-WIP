.class public final La82/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lqt0/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR \u0010!\u001a\u0008\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0097\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u0012\u0010 \u00a8\u0006\""
    }
    d2 = {
        "La82/c;",
        "Lqt0/a;",
        "Ltr2/n;",
        "logger",
        "Landroid/bluetooth/BluetoothAdapter;",
        "bluetoothAdapter",
        "La82/a;",
        "bleScannerHelper",
        "Lcom/whoop/ble/scan/a;",
        "bleDeviceScanner",
        "<init>",
        "(Ltr2/n;Landroid/bluetooth/BluetoothAdapter;La82/a;Lcom/whoop/ble/scan/a;)V",
        "",
        "name",
        "Landroid/bluetooth/BluetoothDevice;",
        "a",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Ltr2/n;",
        "b",
        "Landroid/bluetooth/BluetoothAdapter;",
        "c",
        "La82/a;",
        "d",
        "Lcom/whoop/ble/scan/a;",
        "Landroid/bluetooth/le/ScanCallback;",
        "e",
        "Landroid/bluetooth/le/ScanCallback;",
        "scanCallback",
        "Lec3/l;",
        "Lqt0/b;",
        "f",
        "Lec3/l;",
        "()Lec3/l;",
        "startScan",
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
.field private final a:Ltr2/n;

.field private final b:Landroid/bluetooth/BluetoothAdapter;

.field private final c:La82/a;

.field private final d:Lcom/whoop/ble/scan/a;

.field private e:Landroid/bluetooth/le/ScanCallback;

.field private final f:Lec3/l;
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/l;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ltr2/n;Landroid/bluetooth/BluetoothAdapter;La82/a;Lcom/whoop/ble/scan/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothAdapter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleScannerHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bleDeviceScanner"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La82/c;->a:Ltr2/n;

    iput-object p2, p0, La82/c;->b:Landroid/bluetooth/BluetoothAdapter;

    iput-object p3, p0, La82/c;->c:La82/a;

    iput-object p4, p0, La82/c;->d:Lcom/whoop/ble/scan/a;

    new-instance p1, La82/c$a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La82/c$a;-><init>(La82/c;Lq83/d;)V

    invoke-static {p1}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p1

    iput-object p1, p0, La82/c;->f:Lec3/l;

    return-void
.end method

.method public static final synthetic c(La82/c;)La82/a;
    .locals 0

    iget-object p0, p0, La82/c;->c:La82/a;

    return-object p0
.end method

.method public static final synthetic d(La82/c;)Landroid/bluetooth/BluetoothAdapter;
    .locals 0

    iget-object p0, p0, La82/c;->b:Landroid/bluetooth/BluetoothAdapter;

    return-object p0
.end method

.method public static final synthetic e(La82/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, La82/c;->a:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic f(La82/c;)Landroid/bluetooth/le/ScanCallback;
    .locals 0

    iget-object p0, p0, La82/c;->e:Landroid/bluetooth/le/ScanCallback;

    return-object p0
.end method

.method public static final synthetic g(La82/c;Landroid/bluetooth/le/ScanCallback;)V
    .locals 0

    iput-object p1, p0, La82/c;->e:Landroid/bluetooth/le/ScanCallback;

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, La82/c;->d:Lcom/whoop/ble/scan/a;

    invoke-virtual {v0, p1, p2}, Lcom/whoop/ble/scan/a;->d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b()Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/l;"
        }
    .end annotation

    iget-object v0, p0, La82/c;->f:Lec3/l;

    return-object v0
.end method
