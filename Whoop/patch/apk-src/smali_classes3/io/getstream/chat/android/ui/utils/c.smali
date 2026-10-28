.class public final synthetic Lio/getstream/chat/android/ui/utils/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/ui/utils/c;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/ui/utils/c;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-static {p1, p2}, Lcom/whoop/community/CommunityRemoveMembersFragment;->G(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_0
    invoke-static {p1, p2}, Lcom/whoop/community/CommunityRemoveMembersFragment;->M(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_1
    invoke-static {p1, p2}, Lcom/whoop/community/CommunityManageTeamFragment;->G(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_2
    invoke-static {p1, p2}, Lcom/whoop/community/CommunityFragment;->G(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_3
    invoke-static {p1, p2}, Lcom/whoop/community/CommunityAddMemberFragment;->Q(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_4
    invoke-static {p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->M(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_5
    invoke-static {p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->L(Landroid/content/DialogInterface;I)V

    return-void

    :pswitch_6
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_7
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    :pswitch_8
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
