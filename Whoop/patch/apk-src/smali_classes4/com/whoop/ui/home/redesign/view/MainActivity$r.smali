.class public final Lcom/whoop/ui/home/redesign/view/MainActivity$r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/home/redesign/view/MainActivity;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "com/whoop/ui/home/redesign/view/MainActivity$r",
        "Landroid/content/ServiceConnection;",
        "Landroid/content/ComponentName;",
        "className",
        "Landroid/os/IBinder;",
        "service",
        "Ll83/a0;",
        "onServiceConnected",
        "(Landroid/content/ComponentName;Landroid/os/IBinder;)V",
        "name",
        "onServiceDisconnected",
        "(Landroid/content/ComponentName;)V",
        "app_prodStandardRelease"
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
.field final synthetic w:Lcom/whoop/ui/home/redesign/view/MainActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 2

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    check-cast p2, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-virtual {p2, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->W(Lcom/whoop/ui/home/redesign/view/MainActivity;Ln73/b;)V

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->M(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lq92/h;

    move-result-object p1

    invoke-virtual {p1}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->h(Landroid/bluetooth/BluetoothDevice;)V
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    iget-object p2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;->w:Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-static {p2}, Lcom/whoop/ui/home/redesign/view/MainActivity;->J(Lcom/whoop/ui/home/redesign/view/MainActivity;)Ltr2/n;

    move-result-object p2

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Issue with strap service connection"

    invoke-interface {p2, v1, p1, v0}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method
