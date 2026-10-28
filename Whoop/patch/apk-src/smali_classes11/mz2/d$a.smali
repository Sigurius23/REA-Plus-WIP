.class public final Lmz2/d$a;
.super Landroid/bluetooth/le/ScanCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmz2/d;-><init>(Landroid/bluetooth/BluetoothAdapter;Ltr2/n;Lbc3/c0;Lrr2/c;Lmz2/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "mz2/d$a",
        "Landroid/bluetooth/le/ScanCallback;",
        "",
        "callbackType",
        "Landroid/bluetooth/le/ScanResult;",
        "result",
        "Ll83/a0;",
        "onScanResult",
        "(ILandroid/bluetooth/le/ScanResult;)V",
        "errorCode",
        "onScanFailed",
        "(I)V",
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
.field final synthetic a:Lmz2/d;


# direct methods
.method public constructor <init>(Lmz2/d;)V
    .locals 0

    iput-object p1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-direct {p0}, Landroid/bluetooth/le/ScanCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onScanFailed(I)V
    .locals 5

    invoke-static {p1}, Lb92/a;->b(I)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " onScanFailed errorCode: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {v1}, Lmz2/d;->a(Lmz2/d;)Lbc3/c0;

    move-result-object v1

    new-instance v2, Lmz2/d$a$a;

    iget-object v3, p0, Lmz2/d$a;->a:Lmz2/d;

    const/4 v4, 0x0

    invoke-direct {v2, v3, p1, v4}, Lmz2/d$a$a;-><init>(Lmz2/d;ILq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v4, v4, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object p1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {p1}, Lmz2/d;->b(Lmz2/d;)Lrr2/c;

    move-result-object p1

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v1, v0}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    iget-object p1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {p1}, Lmz2/d;->e(Lmz2/d;)Landroid/bluetooth/le/BluetoothLeScanner;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1, p0}, Landroid/bluetooth/le/BluetoothLeScanner;->stopScan(Landroid/bluetooth/le/ScanCallback;)V

    :cond_0
    return-void
.end method

.method public onScanResult(ILandroid/bluetooth/le/ScanResult;)V
    .locals 3

    const-string p1, "result"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/bluetooth/le/ScanResult;->getDevice()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    const-string p2, "getDevice(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {p2}, Lmz2/d;->a(Lmz2/d;)Lbc3/c0;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->w(Lbc3/c0;)Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {p1}, Lmz2/d;->d(Lmz2/d;)Ltr2/n;

    move-result-object p1

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "still getting scan results but parent scope is not active: caller forgot to cancel scan"

    invoke-interface {p1, v0, p2}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-virtual {p1}, Lmz2/d;->p()V

    return-void

    :cond_0
    iget-object p2, p0, Lmz2/d$a;->a:Lmz2/d;

    invoke-static {p2}, Lmz2/d;->a(Lmz2/d;)Lbc3/c0;

    move-result-object p2

    new-instance v0, Lmz2/d$a$b;

    iget-object v1, p0, Lmz2/d$a;->a:Lmz2/d;

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Lmz2/d$a$b;-><init>(Landroid/bluetooth/BluetoothDevice;Lmz2/d;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p2, v2, v2, v0, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
