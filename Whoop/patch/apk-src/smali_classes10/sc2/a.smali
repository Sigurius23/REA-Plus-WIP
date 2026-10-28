.class public final synthetic Lsc2/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/strap/EditDeviceNameActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V
    .locals 0

    iput p2, p0, Lsc2/a;->w:I

    iput-object p1, p0, Lsc2/a;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsc2/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/a;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->I(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsc2/a;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->z(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsc2/a;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->J(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lsc2/a;->x:Lcom/whoop/settings/strap/EditDeviceNameActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->D(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
