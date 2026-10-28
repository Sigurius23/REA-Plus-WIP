.class public final synthetic Lxp0/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityPendingInviteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityPendingInviteFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/r;->w:I

    iput-object p1, p0, Lxp0/r;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lxp0/r;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/r;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->H(Lcom/whoop/community/CommunityPendingInviteFragment;Ljava/lang/Boolean;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lxp0/r;->x:Lcom/whoop/community/CommunityPendingInviteFragment;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityPendingInviteFragment;->I(Lcom/whoop/community/CommunityPendingInviteFragment;Ljava/lang/Boolean;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
