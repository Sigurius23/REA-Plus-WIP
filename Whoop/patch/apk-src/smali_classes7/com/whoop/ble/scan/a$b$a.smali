.class public final Lcom/whoop/ble/scan/a$b$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ble/scan/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\t\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/whoop/ble/scan/a$b$a",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "name",
        "Landroid/os/IBinder;",
        "service",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
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
.field final synthetic w:Lcom/whoop/ble/scan/a;

.field final synthetic x:Lq83/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/ble/scan/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ble/scan/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ble/scan/a$b$a;->w:Lcom/whoop/ble/scan/a;

    iput-object p2, p0, Lcom/whoop/ble/scan/a$b$a;->x:Lq83/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    iget-object p1, p0, Lcom/whoop/ble/scan/a$b$a;->w:Lcom/whoop/ble/scan/a;

    invoke-static {p1}, Lcom/whoop/ble/scan/a;->b(Lcom/whoop/ble/scan/a;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "onServiceConnected"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    const-string p1, "null cannot be cast to non-null type com.whoop.ble.scan.BleDeviceScannerService.BleDeviceScannerServiceBinder"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lcom/whoop/ble/scan/BleDeviceScannerService$a;

    iget-object p1, p0, Lcom/whoop/ble/scan/a$b$a;->w:Lcom/whoop/ble/scan/a;

    invoke-virtual {p2}, Lcom/whoop/ble/scan/BleDeviceScannerService$a;->a()Lcom/whoop/ble/scan/BleDeviceScannerService;

    move-result-object p2

    invoke-static {p1, p2}, Lcom/whoop/ble/scan/a;->c(Lcom/whoop/ble/scan/a;Lcom/whoop/ble/scan/BleDeviceScannerService;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/a$b$a;->x:Lq83/d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-interface {p1, p2}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ble/scan/a$b$a;->w:Lcom/whoop/ble/scan/a;

    invoke-static {v0}, Lcom/whoop/ble/scan/a;->b(Lcom/whoop/ble/scan/a;)Ltr2/n;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "onServiceDisconnected "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ble/scan/a$b$a;->x:Lq83/d;

    new-instance v0, Ljava/lang/Exception;

    const-string v1, "Service Disconnected"

    invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    invoke-interface {p1, v0}, Lq83/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
