.class public final Lrk0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lpj0/b;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0013H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lrk0/a;",
        "Lpj0/b;",
        "Landroid/content/Context;",
        "context",
        "Landroid/bluetooth/BluetoothAdapter;",
        "adapter",
        "",
        "sdkVersion",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILtr2/n;)V",
        "",
        "b",
        "()Z",
        "",
        "address",
        "Ljava/util/UUID;",
        "serviceId",
        "",
        "characteristicIds",
        "Lpj0/a;",
        "a",
        "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/Set;)Lpj0/a;",
        "Landroid/content/Context;",
        "Landroid/bluetooth/BluetoothAdapter;",
        "c",
        "I",
        "d",
        "Ltr2/n;",
        "whoop-ble-transport_release"
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
.field private final a:Landroid/content/Context;

.field private final b:Landroid/bluetooth/BluetoothAdapter;

.field private final c:I

.field private final d:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/bluetooth/BluetoothAdapter;ILtr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lrk0/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lrk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    iput p3, p0, Lrk0/a;->c:I

    iput-object p4, p0, Lrk0/a;->d:Ltr2/n;

    return-void
.end method

.method private final b()Z
    .locals 2

    iget v0, p0, Lrk0/a;->c:I

    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lrk0/a;->a:Landroid/content/Context;

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    invoke-virtual {v0, v1}, Landroid/content/Context;->checkSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/util/UUID;Ljava/util/Set;)Lpj0/a;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/UUID;",
            "Ljava/util/Set<",
            "Ljava/util/UUID;",
            ">;)",
            "Lpj0/a;"
        }
    .end annotation

    const-string v0, "address"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "serviceId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "characteristicIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object p2, p0, Lrk0/a;->d:Ltr2/n;

    const-string p3, "No Bluetooth adapter, so there is no transport for "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_0
    invoke-direct {p0}, Lrk0/a;->b()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p2, p0, Lrk0/a;->d:Ltr2/n;

    const-string p3, "BLUETOOTH_CONNECT is not granted, so there is no transport for "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array p3, v2, [Lqr2/a$a;

    invoke-interface {p2, p1, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1

    :cond_1
    :try_start_0
    iget-object v0, p0, Lrk0/a;->b:Landroid/bluetooth/BluetoothAdapter;

    invoke-virtual {v0, p1}, Landroid/bluetooth/BluetoothAdapter;->getRemoteDevice(Ljava/lang/String;)Landroid/bluetooth/BluetoothDevice;

    move-result-object v5
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    new-instance v3, Lrk0/c;

    iget-object v4, p0, Lrk0/a;->a:Landroid/content/Context;

    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v8, p0, Lrk0/a;->d:Ltr2/n;

    const/16 v10, 0x20

    const/4 v11, 0x0

    const/4 v9, 0x0

    move-object v6, p2

    move-object v7, p3

    invoke-direct/range {v3 .. v11}, Lrk0/c;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/util/UUID;Ljava/util/Set;Ltr2/n;Landroid/os/HandlerThread;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :catch_0
    move-exception v0

    move-object p2, v0

    iget-object p3, p0, Lrk0/a;->d:Ltr2/n;

    const-string v0, "Not a Bluetooth address: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v2, [Lqr2/a$a;

    invoke-interface {p3, p1, p2, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-object v1
.end method
