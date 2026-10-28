.class final Lcom/whoop/community/CommunityShowInviteFragment$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityShowInviteFragment;->L()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.community.CommunityShowInviteFragment$acceptInvite$1"
    f = "CommunityShowInviteFragment.kt"
    l = {
        0x6d,
        0x74
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/community/CommunityShowInviteFragment;


# direct methods
.method public constructor <init>(Lcom/whoop/community/CommunityShowInviteFragment;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/CommunityShowInviteFragment;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/CommunityShowInviteFragment$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/community/CommunityShowInviteFragment$a;

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-direct {p1, v0, p2}, Lcom/whoop/community/CommunityShowInviteFragment$a;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityShowInviteFragment$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/CommunityShowInviteFragment$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/community/CommunityShowInviteFragment$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/CommunityShowInviteFragment$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->N(Lcom/whoop/community/CommunityShowInviteFragment;)Lrq0/e1;

    move-result-object p1

    invoke-virtual {p1}, Lrq0/e1;->L()Le50/c;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lrq0/f1;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lrq0/f1;->k()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->getInviteCode()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_3
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->N(Lcom/whoop/community/CommunityShowInviteFragment;)Lrq0/e1;

    move-result-object p1

    iput v4, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->w:I

    invoke-virtual {p1, p0}, Lrq0/e1;->y(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->O(Lcom/whoop/community/CommunityShowInviteFragment;)V

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lxp0/d0;->e1:I

    invoke-static {p1, v0}, Lin2/i;->c(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->M(Lcom/whoop/community/CommunityShowInviteFragment;)Leq0/b2;

    move-result-object p1

    iget-object p1, p1, Leq0/b2;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->N(Lcom/whoop/community/CommunityShowInviteFragment;)Lrq0/e1;

    move-result-object p1

    iput v3, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->w:I

    invoke-virtual {p1, p0}, Lrq0/e1;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    :goto_2
    return-object v0

    :cond_7
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->O(Lcom/whoop/community/CommunityShowInviteFragment;)V

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-virtual {p1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lxp0/d0;->e1:I

    invoke-static {p1, v0}, Lin2/i;->c(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/whoop/community/CommunityShowInviteFragment$a;->x:Lcom/whoop/community/CommunityShowInviteFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityShowInviteFragment;->M(Lcom/whoop/community/CommunityShowInviteFragment;)Leq0/b2;

    move-result-object p1

    iget-object p1, p1, Leq0/b2;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
