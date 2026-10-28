.class public La92/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        La92/a$b;,
        La92/a$c;
    }
.end annotation


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lc92/a;

.field private final c:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "La92/a$b;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private final e:Ltr2/n;

.field final f:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "La92/a$c;",
            ">;"
        }
    .end annotation
.end field

.field private g:Landroid/bluetooth/le/BluetoothLeScanner;

.field private final h:La82/a;

.field final i:Landroid/bluetooth/le/ScanCallback;


# direct methods
.method public constructor <init>(Lc92/a;Ltr2/n;La82/a;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, La92/a;->a:Ljava/lang/Object;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v0

    iput-object v0, p0, La92/a;->d:Llh3/e;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, La92/a;->f:Ljava/util/Set;

    new-instance v0, La92/a$a;

    invoke-direct {v0, p0}, La92/a$a;-><init>(La92/a;)V

    iput-object v0, p0, La92/a;->i:Landroid/bluetooth/le/ScanCallback;

    iput-object p3, p0, La92/a;->h:La82/a;

    iput-object p1, p0, La92/a;->b:Lc92/a;

    new-instance p3, Ltr2/o;

    const-string v0, "ScanController"

    invoke-direct {p3, p2, v0}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object p3, p0, La92/a;->e:Ltr2/n;

    new-instance p2, Ljava/util/HashSet;

    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    iput-object p2, p0, La92/a;->c:Ljava/util/Set;

    invoke-virtual {p1}, Lc92/a;->e()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    iput-object p1, p0, La92/a;->g:Landroid/bluetooth/le/BluetoothLeScanner;

    :cond_0
    return-void
.end method

.method public static bridge synthetic a(La92/a;)La82/a;
    .locals 0

    iget-object p0, p0, La92/a;->h:La82/a;

    return-object p0
.end method

.method public static bridge synthetic b(La92/a;)Llh3/e;
    .locals 0

    iget-object p0, p0, La92/a;->d:Llh3/e;

    return-object p0
.end method

.method public static bridge synthetic c(La92/a;La92/a$b;)V
    .locals 0

    invoke-direct {p0, p1}, La92/a;->j(La92/a$b;)V

    return-void
.end method

.method private d()V
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingPermission"
        }
    .end annotation

    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, La92/a;->f()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iget-object v1, p0, La92/a;->h:La82/a;

    invoke-virtual {v1}, La82/a;->a()Ljava/util/ArrayList;

    move-result-object v1

    iget-object v2, p0, La92/a;->h:La82/a;

    invoke-virtual {v2}, La82/a;->b()Landroid/bluetooth/le/ScanSettings;

    move-result-object v2

    iget-object v3, p0, La92/a;->i:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v0, v1, v2, v3}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :cond_1
    iget-object v1, p0, La92/a;->e:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid state. Attempted to start LE scan but adapter state was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v3, v0}, Lc92/a;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private e()V
    .locals 4

    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v0

    const/16 v1, 0xc

    if-ne v0, v1, :cond_1

    invoke-direct {p0}, La92/a;->f()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    iget-object v1, p0, La92/a;->i:Landroid/bluetooth/le/ScanCallback;

    invoke-virtual {v0, v1}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    return-void

    :cond_1
    iget-object v1, p0, La92/a;->e:Ltr2/n;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Invalid state. Attempted to stop LE scan but adapter state was "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v3, v0}, Lc92/a;->c(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private f()Landroid/bluetooth/le/BluetoothLeScanner;
    .locals 4

    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, La92/a;->g:Landroid/bluetooth/le/BluetoothLeScanner;

    if-nez v0, :cond_1

    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Illegal bluetooth state to retrieve scanner: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v2}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v3

    invoke-virtual {v3}, Landroid/bluetooth/BluetoothAdapter;->getState()I

    move-result v3

    invoke-virtual {v2, v3}, Lc92/a;->c(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object v0, p0, La92/a;->g:Landroid/bluetooth/le/BluetoothLeScanner;

    :cond_1
    iget-object v0, p0, La92/a;->g:Landroid/bluetooth/le/BluetoothLeScanner;

    return-object v0
.end method

.method private g()V
    .locals 3

    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->e()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->b()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, La92/a;->e:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Bonded device : none found"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method private j(La92/a$b;)V
    .locals 8

    iget-object v0, p0, La92/a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, La92/a;->e:Ltr2/n;

    const-string v2, "Bluetooth scan found devices"

    const/4 v3, 0x0

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, La92/a;->f:Ljava/util/Set;

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, La92/a$c;

    iget-object v4, v2, La92/a$c;->a:Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v4}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v4

    invoke-virtual {v4}, Landroid/bluetooth/BluetoothDevice;->getName()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Ljava/lang/String;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_0

    iget-object v5, p0, La92/a;->e:Ltr2/n;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "name="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ", ID="

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, v2, La92/a$c;->a:Landroid/bluetooth/le/ScanResult;

    invoke-virtual {v2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v2}, Landroid/bluetooth/BluetoothDevice;->getAddress()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v5, v2, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    iget-object v1, p0, La92/a;->e:Ltr2/n;

    const-string v2, "Stopping an individual scan"

    new-array v4, v3, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, La92/a;->c:Ljava/util/Set;

    invoke-interface {v1, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object p1, p0, La92/a;->c:Ljava/util/Set;

    invoke-interface {p1}, Ljava/util/Set;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, La92/a;->e:Ltr2/n;

    const-string v1, "Stopping scan"

    new-array v2, v3, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, La92/a;->b:Lc92/a;

    invoke-virtual {p1}, Lc92/a;->f()Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-direct {p0}, La92/a;->e()V

    :cond_2
    monitor-exit v0

    return-void

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method


# virtual methods
.method public h()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lqm2/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, La92/a;->d:Llh3/e;

    return-object v0
.end method

.method public i()La92/a$b;
    .locals 5

    iget-object v0, p0, La92/a;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    invoke-direct {p0}, La92/a;->g()V

    iget-object v1, p0, La92/a;->b:Lc92/a;

    invoke-virtual {v1}, Lc92/a;->f()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance v1, La92/a$b;

    invoke-direct {v1, p0}, La92/a$b;-><init>(La92/a;)V

    iget-object v2, p0, La92/a;->c:Ljava/util/Set;

    invoke-interface {v2}, Ljava/util/Set;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, La92/a;->e:Ltr2/n;

    const-string v3, "Starting scan"

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, La92/a;->d()V

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v2, p0, La92/a;->c:Ljava/util/Set;

    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    monitor-exit v0

    return-object v1

    :cond_1
    const/4 v1, 0x0

    monitor-exit v0

    return-object v1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method
