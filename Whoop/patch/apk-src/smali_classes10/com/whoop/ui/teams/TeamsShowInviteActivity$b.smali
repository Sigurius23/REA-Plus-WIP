.class final Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/teams/TeamsShowInviteActivity;->I()V
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
    c = "com.whoop.ui.teams.TeamsShowInviteActivity$acceptInvite$1$1"
    f = "TeamsShowInviteActivity.kt"
    l = {
        0x72,
        0x79
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

.field final synthetic y:Leq0/k;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/teams/TeamsShowInviteActivity;Leq0/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/teams/TeamsShowInviteActivity;",
            "Leq0/k;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    iput-object p2, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->y:Leq0/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance p1, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;

    iget-object v0, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    iget-object v1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->y:Leq0/k;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;-><init>(Lcom/whoop/ui/teams/TeamsShowInviteActivity;Leq0/k;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->w:I

    const/4 v2, 0x0

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

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

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->K(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)Lrq0/e1;

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

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->K(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)Lrq0/e1;

    move-result-object p1

    iput v4, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->w:I

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

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->L(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)V

    goto :goto_4

    :cond_5
    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    sget v0, Lxp0/d0;->e1:I

    invoke-static {p1, v0}, Lin2/i;->c(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->y:Leq0/k;

    iget-object p1, p1, Leq0/k;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    :cond_6
    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->K(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)Lrq0/e1;

    move-result-object p1

    iput v3, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->w:I

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

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->L(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)V

    goto :goto_4

    :cond_8
    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    sget v0, Lxp0/d0;->e1:I

    invoke-static {p1, v0}, Lin2/i;->c(Landroid/content/Context;I)V

    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->y:Leq0/k;

    iget-object p1, p1, Leq0/k;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    :goto_4
    iget-object p1, p0, Lcom/whoop/ui/teams/TeamsShowInviteActivity$b;->x:Lcom/whoop/ui/teams/TeamsShowInviteActivity;

    invoke-static {p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->J(Lcom/whoop/ui/teams/TeamsShowInviteActivity;)Lor2/j0;

    move-result-object p1

    invoke-interface {p1}, Lor2/j0;->b()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
