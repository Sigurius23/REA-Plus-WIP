.class public final synthetic Lea2/y;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/settings/SettingsLandingFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/settings/SettingsLandingFragment;I)V
    .locals 0

    iput p2, p0, Lea2/y;->w:I

    iput-object p1, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lea2/y;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Lcom/whoop/settings/a;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->E0(Lcom/whoop/settings/SettingsLandingFragment;Lcom/whoop/settings/a;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->W(Lcom/whoop/settings/SettingsLandingFragment;Lcom/whoop/data/remote/domain/response/growth/MembershipStatus;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->w0(Lcom/whoop/settings/SettingsLandingFragment;Lcom/whoop/data/remote/domain/response/growth/MembershipInfo;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Lea2/j0;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->v0(Lcom/whoop/settings/SettingsLandingFragment;Lea2/j0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->J(Lcom/whoop/settings/SettingsLandingFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->V(Lcom/whoop/settings/SettingsLandingFragment;Ljava/lang/Object;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Ljava/lang/String;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->G0(Lcom/whoop/settings/SettingsLandingFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Lea2/y;->x:Lcom/whoop/settings/SettingsLandingFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/settings/SettingsLandingFragment;->G(Lcom/whoop/settings/SettingsLandingFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

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
