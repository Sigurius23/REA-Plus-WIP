.class public final Lt92/b$c;
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
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "t92/b$c",
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

    iput-object p1, p0, Lt92/b$c;->a:Lt92/b;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 3

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "intent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    if-eqz p1, :cond_2

    iget-object p1, p0, Lt92/b$c;->a:Lt92/b;

    const-string v1, "android.bluetooth.adapter.extra.STATE"

    const/high16 v2, -0x80000000

    invoke-virtual {p2, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p2

    const/16 v1, 0xa

    if-eq p2, v1, :cond_1

    const/16 v1, 0xc

    if-eq p2, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p2

    const-string v1, "Bluetooth is switched ON"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p2, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Lt92/b;->q1(Lt92/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    invoke-static {p1}, Lt92/b;->v1(Lt92/b;)V

    return-void

    :cond_1
    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p2

    const-string v1, "Bluetooth is switched OFF"

    new-array v2, v0, [Lqr2/a$a;

    invoke-interface {p2, v1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Lt92/b;->q1(Lt92/b;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    return-void

    :cond_2
    iget-object p1, p0, Lt92/b$c;->a:Lt92/b;

    invoke-static {p1}, Lt92/b;->o1(Lt92/b;)Ltr2/n;

    move-result-object p1

    const-string p2, "intent or intent.getAction is null"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
