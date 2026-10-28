.class public final synthetic Lxp0/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityRemoveMembersFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityRemoveMembersFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/s;->w:I

    iput-object p1, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/s;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->E(Lcom/whoop/community/CommunityRemoveMembersFragment;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->L(Lcom/whoop/community/CommunityRemoveMembersFragment;Lcom/whoop/domain/model/teams/TeamUser;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Lcom/whoop/domain/model/teams/TeamUser;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->N(Lcom/whoop/community/CommunityRemoveMembersFragment;Lcom/whoop/domain/model/teams/TeamUser;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Lrq0/j0;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->I(Lcom/whoop/community/CommunityRemoveMembersFragment;Lrq0/j0;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lxp0/s;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->H(Lcom/whoop/community/CommunityRemoveMembersFragment;Landroid/view/View;)Ll83/a0;

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
