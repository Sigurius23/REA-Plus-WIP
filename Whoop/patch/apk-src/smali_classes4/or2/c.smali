.class public final Lor2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0015\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0016\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010#R\u0011\u0010%\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010$R\u0011\u0010&\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010$R\u0011\u0010\'\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u001a\u0010$R\u0011\u0010(\u001a\u00020\u00148F\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010$\u00a8\u0006)"
    }
    d2 = {
        "Lor2/c;",
        "",
        "Landroid/content/Context;",
        "context",
        "Lc92/a;",
        "bluetoothHelper",
        "Lor2/y0;",
        "locationServicesHelper",
        "Li92/e;",
        "networkMonitor",
        "Ltr2/n;",
        "logger",
        "Landroid/os/BatteryManager;",
        "batteryManager",
        "Landroid/os/PowerManager;",
        "powerManager",
        "<init>",
        "(Landroid/content/Context;Lc92/a;Lor2/y0;Li92/e;Ltr2/n;Landroid/os/BatteryManager;Landroid/os/PowerManager;)V",
        "",
        "permissionName",
        "",
        "b",
        "(Ljava/lang/String;)Z",
        "a",
        "Landroid/content/Context;",
        "Lc92/a;",
        "c",
        "Lor2/y0;",
        "d",
        "Li92/e;",
        "e",
        "Ltr2/n;",
        "f",
        "Landroid/os/BatteryManager;",
        "g",
        "Landroid/os/PowerManager;",
        "()Z",
        "locationServicesEnabled",
        "isNetworkConnected",
        "isBluetoothEnabled",
        "isBluetoothSupportedAndEnabled",
        "core_release"
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

.field private final b:Lc92/a;

.field private final c:Lor2/y0;

.field private final d:Li92/e;

.field private final e:Ltr2/n;

.field private final f:Landroid/os/BatteryManager;

.field private final g:Landroid/os/PowerManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lc92/a;Lor2/y0;Li92/e;Ltr2/n;Landroid/os/BatteryManager;Landroid/os/PowerManager;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bluetoothHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "locationServicesHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "networkMonitor"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lor2/c;->a:Landroid/content/Context;

    iput-object p2, p0, Lor2/c;->b:Lc92/a;

    iput-object p3, p0, Lor2/c;->c:Lor2/y0;

    iput-object p4, p0, Lor2/c;->d:Li92/e;

    iput-object p5, p0, Lor2/c;->e:Ltr2/n;

    iput-object p6, p0, Lor2/c;->f:Landroid/os/BatteryManager;

    iput-object p7, p0, Lor2/c;->g:Landroid/os/PowerManager;

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget-object v0, p0, Lor2/c;->c:Lor2/y0;

    invoke-virtual {v0}, Lor2/y0;->e()Z

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "permissionName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lor2/c;->a:Landroid/content/Context;

    invoke-static {v0, p1}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c()Z
    .locals 5

    iget-object v0, p0, Lor2/c;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->e()Z

    move-result v0

    const-string v1, "AppDiagnostics"

    const/4 v2, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lor2/c;->e:Ltr2/n;

    const-string v3, "Bluetooth not supported"

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3, v4}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return v2

    :cond_0
    iget-object v0, p0, Lor2/c;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->d()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lor2/c;->e:Ltr2/n;

    const-string v3, "Bluetooth setting has been disabled"

    new-array v4, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3, v4}, Ltr2/n;->k(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    return v2

    :cond_1
    const/4 v0, 0x1

    return v0
.end method

.method public final d()Z
    .locals 1

    iget-object v0, p0, Lor2/c;->b:Lc92/a;

    invoke-virtual {v0}, Lc92/a;->f()Z

    move-result v0

    return v0
.end method

.method public final e()Z
    .locals 1

    iget-object v0, p0, Lor2/c;->d:Li92/e;

    invoke-interface {v0}, Li92/e;->isConnected()Z

    move-result v0

    return v0
.end method
