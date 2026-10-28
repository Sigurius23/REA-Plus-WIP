.class public final synthetic Lxp0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityAddMemberFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityAddMemberFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/c;->w:I

    iput-object p1, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Lrq0/l;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->J(Lcom/whoop/community/CommunityAddMemberFragment;Lrq0/l;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->N(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->K(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->O(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->P(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->I(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Lxp0/c;->x:Lcom/whoop/community/CommunityAddMemberFragment;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityAddMemberFragment;->L(Lcom/whoop/community/CommunityAddMemberFragment;Landroid/text/Editable;)Ll83/a0;

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
