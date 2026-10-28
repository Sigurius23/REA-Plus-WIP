.class public final synthetic Lxp0/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/v0;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityRemoveMembersFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityRemoveMembersFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/u;->w:I

    iput-object p1, p0, Lxp0/u;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onChanged(Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, Lxp0/u;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/u;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->K(Lcom/whoop/community/CommunityRemoveMembersFragment;Lib/n;)V

    return-void

    :pswitch_0
    iget-object v0, p0, Lxp0/u;->x:Lcom/whoop/community/CommunityRemoveMembersFragment;

    check-cast p1, Lib/n;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityRemoveMembersFragment;->J(Lcom/whoop/community/CommunityRemoveMembersFragment;Lib/n;)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
