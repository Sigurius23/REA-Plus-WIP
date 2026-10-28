.class public final synthetic Lqm2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/fragment/app/w1;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lqm2/j;->a:I

    iput-object p1, p0, Lqm2/j;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 1

    iget v0, p0, Lqm2/j;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqm2/j;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/membership/management/MembershipManagementFragment;

    invoke-static {v0, p2, p1}, Lcom/whoop/membership/management/MembershipManagementFragment;->F(Lcom/whoop/membership/management/MembershipManagementFragment;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqm2/j;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0, p2, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
