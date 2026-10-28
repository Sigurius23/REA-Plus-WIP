.class public final synthetic Lqm2/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V
    .locals 0

    iput p2, p0, Lqm2/i;->w:I

    iput-object p1, p0, Lqm2/i;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lqm2/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqm2/i;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast p1, Lqm2/q;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lqm2/q;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lqm2/i;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast p1, Lst0/f;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/f;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lqm2/i;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lqm2/i;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;

    check-cast p1, Lmk0/a;

    invoke-static {v0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->L(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lmk0/a;)Ll83/a0;

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
