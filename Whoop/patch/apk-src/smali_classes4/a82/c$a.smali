.class final La82/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La82/c;-><init>(Ltr2/n;Landroid/bluetooth/BluetoothAdapter;La82/a;Lcom/whoop/ble/scan/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Ldc3/u;",
        "Lqt0/b;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.scanner.BleScannerImpl$startScan$1"
    f = "BleScannerImpl.kt"
    l = {
        0x38
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:La82/c;


# direct methods
.method public constructor <init>(La82/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La82/c;",
            "Lq83/d<",
            "-",
            "La82/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La82/c$a;->y:La82/c;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(La82/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, La82/c$a;->h(La82/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(La82/c;)Ll83/a0;
    .locals 3

    invoke-static {p0}, La82/c;->e(La82/c;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Stopping scan"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p0}, La82/c;->d(La82/c;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object v0

    invoke-static {p0}, La82/c;->f(La82/c;)Landroid/bluetooth/le/ScanCallback;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, La82/c$a;

    iget-object v1, p0, La82/c$a;->y:La82/c;

    invoke-direct {v0, v1, p2}, La82/c$a;-><init>(La82/c;Lq83/d;)V

    iput-object p1, v0, La82/c$a;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, La82/c$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, La82/c$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, La82/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, La82/c$a;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, La82/c$a;->x:Ljava/lang/Object;

    check-cast v0, Ldc3/u;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, La82/c$a;->w:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La82/c$a;->y:La82/c;

    new-instance v2, La82/c$a$a;

    iget-object v4, p0, La82/c$a;->y:La82/c;

    invoke-direct {v2, v4, v0}, La82/c$a$a;-><init>(La82/c;Ldc3/u;)V

    invoke-static {p1, v2}, La82/c;->g(La82/c;Landroid/bluetooth/le/ScanCallback;)V

    iget-object p1, p0, La82/c$a;->y:La82/c;

    invoke-static {p1}, La82/c;->e(La82/c;)Ltr2/n;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    const-string v4, "Starting scan"

    invoke-interface {p1, v4, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, La82/c$a;->y:La82/c;

    invoke-static {p1}, La82/c;->d(La82/c;)Landroid/bluetooth/BluetoothAdapter;

    move-result-object p1

    invoke-virtual {p1}, Landroid/bluetooth/BluetoothAdapter;->getBluetoothLeScanner()Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    iget-object v2, p0, La82/c$a;->y:La82/c;

    invoke-static {v2}, La82/c;->c(La82/c;)La82/a;

    move-result-object v2

    invoke-virtual {v2}, La82/a;->a()Ljava/util/ArrayList;

    move-result-object v2

    iget-object v4, p0, La82/c$a;->y:La82/c;

    invoke-static {v4}, La82/c;->c(La82/c;)La82/a;

    move-result-object v4

    invoke-virtual {v4}, La82/a;->b()Landroid/bluetooth/le/ScanSettings;

    move-result-object v4

    iget-object v5, p0, La82/c$a;->y:La82/c;

    invoke-static {v5}, La82/c;->f(La82/c;)Landroid/bluetooth/le/ScanCallback;

    move-result-object v5

    invoke-virtual {p1, v2, v4, v5}, Landroid/bluetooth/le/BluetoothLeScanner;->startScan(Ljava/util/List;Landroid/bluetooth/le/ScanSettings;Landroid/bluetooth/le/ScanCallback;)V

    iget-object p1, p0, La82/c$a;->y:La82/c;

    new-instance v2, La82/b;

    invoke-direct {v2, p1}, La82/b;-><init>(La82/c;)V

    const/4 p1, 0x0

    iput-object p1, p0, La82/c$a;->x:Ljava/lang/Object;

    iput v3, p0, La82/c$a;->w:I

    invoke-static {v0, v2, p0}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
