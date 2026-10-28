.class public final synthetic Lqm2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V
    .locals 0

    iput p2, p0, Lqm2/k;->w:I

    iput-object p1, p0, Lqm2/k;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget v0, p0, Lqm2/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqm2/k;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lqm2/k;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-static {v0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
