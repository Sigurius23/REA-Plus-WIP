.class public final Lcom/whoop/settings/strap/EditDeviceNameActivity$c;
.super Lcom/whoop/ui/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/settings/strap/EditDeviceNameActivity;->M()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "com/whoop/settings/strap/EditDeviceNameActivity$c",
        "Lcom/whoop/ui/g;",
        "Ll83/a0;",
        "a",
        "()V",
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
.field final synthetic x:Lcom/whoop/settings/strap/EditDeviceNameActivity;


# direct methods
.method public constructor <init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity$c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-direct {p0, p1}, Lcom/whoop/ui/g;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity$c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-virtual {v0}, Landroid/app/Activity;->finish()V

    return-void
.end method
