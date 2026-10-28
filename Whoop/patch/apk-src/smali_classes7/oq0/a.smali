.class public final synthetic Loq0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lcom/whoop/community/presentation/login/InviteCodeActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)V
    .locals 0

    iput p2, p0, Loq0/a;->w:I

    iput-object p1, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Loq0/a;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->P(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->O(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Lcom/whoop/domain/model/Invitation;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->L(Lcom/whoop/community/presentation/login/InviteCodeActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->H(Lcom/whoop/community/presentation/login/InviteCodeActivity;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_3
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Loq0/g;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->R(Lcom/whoop/community/presentation/login/InviteCodeActivity;Loq0/g;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_4
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->K(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_5
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Landroid/net/Uri;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->I(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/net/Uri;)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_6
    iget-object v0, p0, Loq0/a;->x:Lcom/whoop/community/presentation/login/InviteCodeActivity;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, p1}, Lcom/whoop/community/presentation/login/InviteCodeActivity;->M(Lcom/whoop/community/presentation/login/InviteCodeActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
