.class La92/a$a;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La92/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic a:La92/a;


# direct methods
.method public constructor <init>(La92/a;)V
    .locals 0

    iput-object p1, p0, La92/a$a;->a:La92/a;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method

.method private a(Landroid/bluetooth/le/ScanResult;)Z
    .locals 1

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getScanRecord()Landroid/bluetooth/le/ScanRecord;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, La92/a$a;->a:La92/a;

    invoke-static {v0}, La92/a;->a(La92/a;)La82/a;

    move-result-object v0

    invoke-virtual {v0, p1}, La82/a;->e(Landroid/bluetooth/le/ScanResult;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private b(Landroid/bluetooth/le/ScanResult;)V
    .locals 5

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->d()Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Scanned something with no device?"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    invoke-direct {p0, p1}, La92/a$a;->a(Landroid/bluetooth/le/ScanResult;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, La92/a$a;->a:La92/a;

    iget-object v1, v1, La92/a;->f:Ljava/util/Set;

    new-instance v2, La92/a$c;

    invoke-direct {v2, p1}, La92/a$c;-><init>(Landroid/bluetooth/le/ScanResult;)V

    invoke-interface {v1, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    iget-object v1, p0, La92/a$a;->a:La92/a;

    invoke-static {v1}, La92/a;->b(La92/a;)Llh3/e;

    move-result-object v1

    new-instance v2, Lqm2/s;

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Landroid/bluetooth/le/ScanResult;->getRssi()I

    move-result p1

    invoke-direct {v2, v3, v4, p1, v0}, Lqm2/s;-><init>(Ljava/lang/String;Ljava/lang/String;ILandroid/bluetooth/BluetoothDevice;)V

    invoke-virtual {v1, v2}, Llh3/e;->onNext(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public onBatchScanResults(Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Landroid/bluetooth/le/ScanResult;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/bluetooth/le/ScanResult;

    invoke-direct {p0, v0}, La92/a$a;->b(Landroid/bluetooth/le/ScanResult;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 0

    invoke-direct {p0, p2}, La92/a$a;->b(Landroid/bluetooth/le/ScanResult;)V

    return-void
.end method
