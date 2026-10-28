.class public final synthetic Lsc2/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/strap/EditDeviceNameActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V
    .locals 0

    iput p2, p0, Lsc2/c;->w:I

    iput-object p1, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lsc2/c;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->G(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V

    return-void

    :pswitch_0
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    return-void

    :pswitch_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->E(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->B(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lsc2/c;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->H(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
