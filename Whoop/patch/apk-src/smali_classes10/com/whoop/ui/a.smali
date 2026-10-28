.class public final synthetic Lcom/whoop/ui/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Lcom/whoop/ui/a;->w:I

    iput-object p1, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lcom/whoop/ui/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityShowInviteFragment;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->F(Lcom/whoop/community/CommunityShowInviteFragment;Lib/n;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->R(Lcom/whoop/community/CommunityAddMemberFragment;Lib/n;)V

    return-void

    :pswitch_1
    iget-object v0, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->H(Lcom/whoop/ui/teams/TeamsShowInviteActivity;Lib/n;)V

    return-void

    :pswitch_2
    iget-object v0, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/d;

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-static {v0, p1}, Lcom/whoop/ui/d$a;->a(Lcom/whoop/ui/d;Landroidx/lifecycle/g0;)V

    return-void

    :pswitch_3
    iget-object v0, p0, Lcom/whoop/ui/a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ui/b;

    check-cast p1, Landroidx/lifecycle/g0;

    invoke-static {v0, p1}, Lcom/whoop/ui/b$a;->a(Lcom/whoop/ui/b;Landroidx/lifecycle/g0;)V

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
