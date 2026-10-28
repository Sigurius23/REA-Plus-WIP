.class public final synthetic Loq0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V
    .locals 0

    iput p2, p0, Loq0/i;->w:I

    iput-object p1, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loq0/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Lcom/whoop/domain/model/Invitation;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->L(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->I(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Loq0/m;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->F(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Loq0/m;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->K(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->D(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Loq0/i;->x:Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->M(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
