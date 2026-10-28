.class final Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->R(Lcom/whoop/domain/model/teams/TeamUser;)V
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
    c = "com.whoop.community.presentation.teams.TeamRemoveMembersActivity$doRemoveMember$1"
    f = "TeamRemoveMembersActivity.kt"
    l = {
        0x76
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

.field final synthetic y:Lcom/whoop/domain/model/teams/TeamUser;


# direct methods
.method public constructor <init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;",
            "Lcom/whoop/domain/model/teams/TeamUser;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iput-object p2, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->y:Lcom/whoop/domain/model/teams/TeamUser;

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

    new-instance p1, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;-><init>(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;Lcom/whoop/domain/model/teams/TeamUser;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-static {p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->N(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;)Lrq0/i0;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/TeamUser;->getId()I

    move-result v1

    iput v2, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->w:I

    invoke-virtual {p1, v1, p0}, Lrq0/i0;->r(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-virtual {p1}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lxp0/d0;->n1:I

    iget-object v3, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->y:Lcom/whoop/domain/model/teams/TeamUser;

    invoke-virtual {v3}, Lcom/whoop/domain/model/teams/TeamUser;->getFullName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v0, v1, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-static {p1}, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;->O(Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;)V

    goto :goto_1

    :cond_3
    iget-object p1, p0, Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity$c;->x:Lcom/whoop/community/presentation/teams/TeamRemoveMembersActivity;

    invoke-virtual {p1}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, Lxp0/d0;->o1:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {p1, v0, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
