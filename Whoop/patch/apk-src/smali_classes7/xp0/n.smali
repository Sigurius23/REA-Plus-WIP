.class public final synthetic Lxp0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityManageTeamFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityManageTeamFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/n;->w:I

    iput-object p1, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/n;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->a0(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->L(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    check-cast p1, Landroid/text/Editable;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->Y(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/text/Editable;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->I(Lcom/whoop/community/CommunityManageTeamFragment;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    check-cast p1, Landroid/graphics/Bitmap;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->M(Lcom/whoop/community/CommunityManageTeamFragment;Landroid/graphics/Bitmap;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Lxp0/n;->x:Lcom/whoop/community/CommunityManageTeamFragment;

    check-cast p1, Lrq0/c0;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityManageTeamFragment;->H(Lcom/whoop/community/CommunityManageTeamFragment;Lrq0/c0;)Ll83/a0;

    move-result-object p1

    return-object p1

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
