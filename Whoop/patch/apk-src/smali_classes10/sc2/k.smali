.class public final synthetic Lsc2/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lhj0/m;


# direct methods
.method public synthetic constructor <init>(Lhj0/m;I)V
    .locals 0

    iput p2, p0, Lsc2/k;->w:I

    iput-object p1, p0, Lsc2/k;->x:Lhj0/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsc2/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lsc2/y;

    invoke-static {v0}, Lsc2/y;->I(Lsc2/y;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->Q(Lcom/whoop/settings/strap/StrapSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->I(Lcom/whoop/settings/strap/StrapSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->G(Lcom/whoop/settings/strap/StrapSettingsFragment;)Luf3/a;

    move-result-object v0

    return-object v0

    :pswitch_3
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->V(Lcom/whoop/settings/strap/StrapSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_4
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->J(Lcom/whoop/settings/strap/StrapSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_5
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->O(Lcom/whoop/settings/strap/StrapSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_6
    iget-object v0, p0, Lsc2/k;->x:Lhj0/m;

    check-cast v0, Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0}, Lcom/whoop/settings/strap/StrapSettingsFragment;->T(Lcom/whoop/settings/strap/StrapSettingsFragment;)Ll83/a0;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
