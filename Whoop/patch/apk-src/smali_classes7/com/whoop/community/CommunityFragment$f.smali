.class public final Lcom/whoop/community/CommunityFragment$f;
.super Lhc/h;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/community/CommunityFragment;->w0(Lcom/whoop/domain/model/teams/Team;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/CommunityFragment$f$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "com/whoop/community/CommunityFragment$f",
        "Lhc/h;",
        "",
        "p0",
        "Ll83/a0;",
        "onPageSelected",
        "(I)V",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic b:Lcom/whoop/domain/model/teams/Team;

.field final synthetic c:Lcom/whoop/community/CommunityFragment;

.field final synthetic d:Leq0/p0;

.field final synthetic e:Lxp0/p;


# direct methods
.method public constructor <init>(Ljava/util/List;Lcom/whoop/domain/model/teams/Team;Lcom/whoop/community/CommunityFragment;Leq0/p0;Lxp0/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/ui/ScoreContext;",
            ">;",
            "Lcom/whoop/domain/model/teams/Team;",
            "Lcom/whoop/community/CommunityFragment;",
            "Leq0/p0;",
            "Lxp0/p;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/community/CommunityFragment$f;->a:Ljava/util/List;

    iput-object p2, p0, Lcom/whoop/community/CommunityFragment$f;->b:Lcom/whoop/domain/model/teams/Team;

    iput-object p3, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    iput-object p4, p0, Lcom/whoop/community/CommunityFragment$f;->d:Leq0/p0;

    iput-object p5, p0, Lcom/whoop/community/CommunityFragment$f;->e:Lxp0/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onPageSelected(I)V
    .locals 6

    invoke-super {p0, p1}, Lhc/h;->onPageSelected(I)V

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/ScoreContext;

    sget-object v1, Lcom/whoop/community/CommunityFragment$f$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->b:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto/16 :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->e:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto/16 :goto_0

    :cond_1
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->X(Lcom/whoop/community/CommunityFragment;)Lrq0/h1;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/h1;->j0()Le50/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/i1;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lrq0/i1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    if-eqz v0, :cond_5

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$f;->b:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v1}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v0

    if-ne v1, v0, :cond_5

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->X(Lcom/whoop/community/CommunityFragment;)Lrq0/h1;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/h1;->j0()Le50/c;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/i1;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lrq0/i1;->d()Ljava/util/Map;

    move-result-object v0

    if-eqz v0, :cond_4

    sget-object v1, Lcom/whoop/ui/ScoreContext;->RECOVERY:Lcom/whoop/ui/ScoreContext;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/teams/LeadersEntry;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/LeadersEntry;->getRecoveryScore()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    const-wide v4, 0x4040800000000000L    # 33.0

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_2

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->s:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_2
    const-wide v4, 0x4050800000000000L    # 66.0

    cmpg-double v0, v2, v4

    if-gtz v0, :cond_3

    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->d0:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->o:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_4
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->u:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    goto :goto_0

    :cond_5
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lvu1/a;->O:I

    invoke-static {v0, v1}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v0

    :goto_0
    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$f;->d:Leq0/p0;

    iget-object v1, v1, Leq0/p0;->c:Lcom/google/android/material/tabs/TabLayout;

    invoke-virtual {v1, v0}, Lcom/google/android/material/tabs/TabLayout;->setSelectedTabIndicatorColor(I)V

    if-lez p1, :cond_6

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->e:Lxp0/p;

    invoke-virtual {v0}, Lxp0/p;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p1, :cond_6

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->e:Lxp0/p;

    invoke-virtual {v0}, Lxp0/p;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Lrq0/t0;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->e:Lxp0/p;

    invoke-virtual {v0}, Lxp0/p;->d()Ljava/util/ArrayList;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.community.presentation.teams.TeamsBoardFragment"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lrq0/t0;

    invoke-virtual {v0}, Lrq0/t0;->D0()V

    :cond_6
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    iget-object v1, p0, Lcom/whoop/community/CommunityFragment$f;->b:Lcom/whoop/domain/model/teams/Team;

    invoke-static {v0, v1}, Lcom/whoop/community/CommunityFragment;->Y(Lcom/whoop/community/CommunityFragment;Lcom/whoop/domain/model/teams/Team;)V

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->P(Lcom/whoop/community/CommunityFragment;)Landroid/view/inputmethod/InputMethodManager;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_9

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v2}, Lcom/whoop/community/CommunityFragment;->N(Lcom/whoop/community/CommunityFragment;)Leq0/p0;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v0, v2, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    :try_start_0
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$f;->a:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/ui/ScoreContext;

    invoke-static {v0, v2}, Lcom/whoop/community/CommunityFragment;->S(Lcom/whoop/community/CommunityFragment;Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "Chat"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {p1}, Lcom/whoop/community/CommunityFragment;->O(Lcom/whoop/community/CommunityFragment;)Lz82/e;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->b:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lz82/e;->u(Ljava/lang/String;)V

    return-void

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_7
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->O(Lcom/whoop/community/CommunityFragment;)Lz82/e;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    iget-object v4, p0, Lcom/whoop/community/CommunityFragment$f;->a:Ljava/util/List;

    invoke-interface {v4, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/ScoreContext;

    invoke-static {v2, p1}, Lcom/whoop/community/CommunityFragment;->S(Lcom/whoop/community/CommunityFragment;Lcom/whoop/ui/ScoreContext;)Ljava/lang/String;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v2}, Lcom/whoop/community/CommunityFragment;->V(Lcom/whoop/community/CommunityFragment;)Lcom/whoop/community/domain/model/teams/TimePeriod;

    move-result-object v4

    if-eqz v4, :cond_8

    invoke-static {v2, v4}, Lcom/whoop/community/CommunityFragment;->W(Lcom/whoop/community/CommunityFragment;Lcom/whoop/community/domain/model/teams/TimePeriod;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/community/CommunityFragment$f;->b:Lcom/whoop/domain/model/teams/Team;

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p1, v1, v2}, Lz82/e;->O(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_8
    const-string p1, "timePeriod"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    :goto_1
    iget-object v0, p0, Lcom/whoop/community/CommunityFragment$f;->c:Lcom/whoop/community/CommunityFragment;

    invoke-static {v0}, Lcom/whoop/community/CommunityFragment;->Q(Lcom/whoop/community/CommunityFragment;)Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Selected position out of bounds for team - no event sent: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_9
    const-string p1, "inputManager"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method
