.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;
.super Landroid/companion/CompanionDeviceManager$Callback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->x1(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\r\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "com/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n",
        "Landroid/companion/CompanionDeviceManager$Callback;",
        "Landroid/content/IntentSender;",
        "chooserLauncher",
        "Ll83/a0;",
        "onDeviceFound",
        "(Landroid/content/IntentSender;)V",
        "",
        "error",
        "onFailure",
        "(Ljava/lang/CharSequence;)V",
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
.field final synthetic a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

.field final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    iput-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->b:Ljava/lang/String;

    invoke-direct {p0}, Landroid/companion/CompanionDeviceManager$Callback;-><init>()V

    return-void
.end method


# virtual methods
.method public onDeviceFound(Landroid/content/IntentSender;)V
    .locals 4

    const-string v0, "chooserLauncher"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->k0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->l0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;)Lj/d;

    move-result-object v0

    new-instance v2, Lj/l;

    const/4 v3, 0x0

    invoke-direct {v2, p1, v3, v1, v1}, Lj/l;-><init>(Landroid/content/IntentSender;Landroid/content/Intent;II)V

    invoke-virtual {v0, v2, v3}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_0
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->n0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;)Ltr2/n;

    move-result-object p1

    const-string v0, "Companion Device Pairing timed out, but we found a device after the timeout window"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public onFailure(Ljava/lang/CharSequence;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->p0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;Z)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->m0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;)Lrr2/c;

    move-result-object v0

    new-instance v1, Lcom/whoop/domain/exception/CompanionDevicePairingException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Association Failed: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/whoop/domain/exception/CompanionDevicePairingException;-><init>(Ljava/lang/String;)V

    const/4 p1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, v1, p1, v2, p1}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->a:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;->o0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity;)Lqm2/f;

    move-result-object p1

    sget-object v0, Lqm2/n;->COMPANION_DEVICE_PAIRING_TIMED_OUT:Lqm2/n;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleChooseStrapActivity$n;->b:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lqm2/f;->S(Lqm2/n;Ljava/lang/String;)V

    return-void
.end method
