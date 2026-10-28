.class public final synthetic Lsc2/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/strap/StrapSettingsFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/strap/StrapSettingsFragment;I)V
    .locals 0

    iput p2, p0, Lsc2/l;->w:I

    iput-object p1, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lsc2/l;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->R(Lcom/whoop/settings/strap/StrapSettingsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->M(Lcom/whoop/settings/strap/StrapSettingsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->U(Lcom/whoop/settings/strap/StrapSettingsFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iget-object v0, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->S(Lcom/whoop/settings/strap/StrapSettingsFragment;Z)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lsc2/l;->x:Lcom/whoop/settings/strap/StrapSettingsFragment;

    check-cast p1, Lsc2/v;

    invoke-static {v0, p1}, Lcom/whoop/settings/strap/StrapSettingsFragment;->P(Lcom/whoop/settings/strap/StrapSettingsFragment;Lsc2/v;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
