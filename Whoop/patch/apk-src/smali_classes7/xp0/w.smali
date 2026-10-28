.class public final synthetic Lxp0/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/CommunityShowInviteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/CommunityShowInviteFragment;I)V
    .locals 0

    iput p2, p0, Lxp0/w;->w:I

    iput-object p1, p0, Lxp0/w;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lxp0/w;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lxp0/w;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->I(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Lxp0/w;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->G(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Lxp0/w;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->H(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Lxp0/w;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    check-cast p1, Lrq0/f1;

    invoke-static {v0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->E(Lcom/whoop/community/CommunityShowInviteFragment;Lrq0/f1;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
