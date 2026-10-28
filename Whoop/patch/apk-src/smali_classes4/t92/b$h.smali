.class public final Lt92/b$h;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lt92/b;-><init>(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Ljava/lang/Class;Lq92/h;Landroid/os/HandlerThread;Lin2/d;Lbc3/c0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "t92/b$h",
        "Landroid/content/BroadcastReceiver;",
        "Landroid/content/Context;",
        "context",
        "Landroid/content/Intent;",
        "intent",
        "Ll83/a0;",
        "onReceive",
        "(Landroid/content/Context;Landroid/content/Intent;)V",
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
.field final synthetic a:Lt92/b;


# direct methods
.method public constructor <init>(Lt92/b;)V
    .locals 0

    iput-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    if-eqz p1, :cond_0

    const-string p2, "power"

    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string p2, "null cannot be cast to non-null type android.os.PowerManager"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/os/PowerManager;

    invoke-virtual {p1}, Landroid/os/PowerManager;->isDeviceIdleMode()Z

    move-result p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "The app is in IDLE Mode!!"

    new-array p2, p2, [Lqr2/a$a;

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->r1(Lt92/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_1
    iget-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p1

    const-string v0, "The app is out of IDLE Mode!"

    new-array v1, p2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->v1(Lt92/b;)V

    iget-object p1, p0, Lt92/b$h;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->r1(Lt92/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void
.end method
