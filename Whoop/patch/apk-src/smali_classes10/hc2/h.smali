.class public final synthetic Lhc2/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/myaccount/MyAccountFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/myaccount/MyAccountFragment;I)V
    .locals 0

    iput p2, p0, Lhc2/h;->w:I

    iput-object p1, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lhc2/h;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->a0(Lcom/whoop/settings/myaccount/MyAccountFragment;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->R(Lcom/whoop/settings/myaccount/MyAccountFragment;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->U(Lcom/whoop/settings/myaccount/MyAccountFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->E(Lcom/whoop/settings/myaccount/MyAccountFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->I(Lcom/whoop/settings/myaccount/MyAccountFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lhc2/h;->x:Lcom/whoop/settings/myaccount/MyAccountFragment;

    invoke-static {v0}, Lcom/whoop/settings/myaccount/MyAccountFragment;->G(Lcom/whoop/settings/myaccount/MyAccountFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
