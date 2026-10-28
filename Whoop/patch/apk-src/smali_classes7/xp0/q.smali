.class public final synthetic Lxp0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityPendingInviteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityPendingInviteFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/q;->w:I

    iput-object p1, p0, Lxp0/q;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/q;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/q;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    check-cast p1, Lcom/whoop/domain/model/teams/TeamInviteDto;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->E(Lcom/whoop/community/CommunityPendingInviteFragment;Lcom/whoop/domain/model/teams/TeamInviteDto;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/q;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->G(Lcom/whoop/community/CommunityPendingInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Lxp0/q;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->F(Lcom/whoop/community/CommunityPendingInviteFragment;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
