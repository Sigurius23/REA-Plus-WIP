.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/ServiceConnection;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;-><init>()V
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
        "com/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e",
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
.field final synthetic w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onServiceConnected(Landroid/content/ComponentName;Landroid/os/IBinder;)V
    .locals 4

    const-string v0, "className"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "service"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    :try_start_0
    move-object v0, p2

    check-cast v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ltr2/n;

    move-result-object v1

    const-string v2, "serviceConnection onServiceConnected"

    new-array v3, p1, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-virtual {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->c(Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;)Ln73/b;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->q0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ln73/b;)V

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->f0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lqm2/m;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lqm2/m;->b()Landroid/bluetooth/BluetoothDevice;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$a;->h(Landroid/bluetooth/BluetoothDevice;)V

    return-void

    :catch_0
    move-exception v0

    goto :goto_0

    :cond_0
    const-string v0, "selectedBluetoothDevice"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    return-void

    :goto_0
    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ltr2/n;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed to cast service binder: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, " to BleWhoopStrapServiceBinder"

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v1, p2, v0, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method public onServiceDisconnected(Landroid/content/ComponentName;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "serviceConnection onServiceDisconnected"

    invoke-interface {p1, v1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;->w:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->s0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V

    return-void
.end method
