.class public final Lcom/whoop/ble/scan/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0082@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0018\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/ble/scan/a;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Ll83/a0;",
        "e",
        "(Lq83/d;)Ljava/lang/Object;",
        "",
        "name",
        "Landroid/bluetooth/BluetoothDevice;",
        "d",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Landroid/content/Context;",
        "Lcom/whoop/ble/scan/BleDeviceScannerService;",
        "b",
        "Lcom/whoop/ble/scan/BleDeviceScannerService;",
        "scannerService",
        "Ltr2/n;",
        "c",
        "Ltr2/n;",
        "logger",
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
.field private final a:Landroid/content/Context;

.field private b:Lcom/whoop/ble/scan/BleDeviceScannerService;

.field private final c:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/ble/scan/a;->a:Landroid/content/Context;

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "BleDeviceScanner"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/ble/scan/a;->c:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Lcom/whoop/ble/scan/a;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ble/scan/a;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/ble/scan/a;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ble/scan/a;->c:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic c(Lcom/whoop/ble/scan/a;Lcom/whoop/ble/scan/BleDeviceScannerService;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ble/scan/a;->b:Lcom/whoop/ble/scan/BleDeviceScannerService;

    return-void
.end method

.method private final e(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ble/scan/a;->c:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Starting BleDeviceScannerService service"

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lcom/whoop/ble/scan/a$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/ble/scan/a$b;-><init>(Lcom/whoop/ble/scan/a;Lq83/d;)V

    const-wide/16 v1, 0x1388

    invoke-static {v1, v2, v0, p1}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method


# virtual methods
.method public final d(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lcom/whoop/ble/scan/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/whoop/ble/scan/a$a;

    iget v1, v0, Lcom/whoop/ble/scan/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ble/scan/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/ble/scan/a$a;

    invoke-direct {v0, p0, p2}, Lcom/whoop/ble/scan/a$a;-><init>(Lcom/whoop/ble/scan/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcom/whoop/ble/scan/a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/ble/scan/a$a;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/whoop/ble/scan/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/whoop/ble/scan/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcom/whoop/ble/scan/a;->c:Ltr2/n;

    const-string v2, "scanForDevice called for device name "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {p2, v2, v5}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object p1, v0, Lcom/whoop/ble/scan/a$a;->w:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/ble/scan/a$a;->z:I

    invoke-direct {p0, v0}, Lcom/whoop/ble/scan/a;->e(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/whoop/ble/scan/a;->b:Lcom/whoop/ble/scan/BleDeviceScannerService;

    const/4 v2, 0x0

    if-eqz p2, :cond_6

    iput-object v2, v0, Lcom/whoop/ble/scan/a$a;->w:Ljava/lang/Object;

    iput v3, v0, Lcom/whoop/ble/scan/a$a;->z:I

    invoke-virtual {p2, p1, v0}, Lcom/whoop/ble/scan/BleDeviceScannerService;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    :cond_6
    const-string p1, "scannerService"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method
