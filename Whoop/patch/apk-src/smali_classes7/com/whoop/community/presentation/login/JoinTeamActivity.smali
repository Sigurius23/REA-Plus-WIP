.class public Lcom/whoop/community/presentation/login/JoinTeamActivity;
.super Lhj0/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/login/JoinTeamActivity$a;,
        Lcom/whoop/community/presentation/login/JoinTeamActivity$c;,
        Lcom/whoop/community/presentation/login/JoinTeamActivity$b;
    }
.end annotation


# static fields
.field private static K:I = 0x190


# instance fields
.field private I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

.field private J:Ltr2/n;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lhj0/t;-><init>()V

    new-instance v0, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v1

    invoke-virtual {v1}, Le50/b;->d()Ltr2/n;

    move-result-object v1

    const-string v2, "Join Team"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->J:Ltr2/n;

    return-void
.end method

.method public static synthetic H(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Ljava/lang/Throwable;Lcom/whoop/ui/h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->S(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Ljava/lang/Throwable;Lcom/whoop/ui/h;)V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->T(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Landroid/view/View;)V

    return-void
.end method

.method public static synthetic J(Lcom/whoop/community/presentation/login/JoinTeamActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->U(Landroid/view/View;)V

    return-void
.end method

.method public static synthetic K(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Lpg3/v0;Lcom/whoop/ui/h;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->R(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Lpg3/v0;Lcom/whoop/ui/h;)V

    return-void
.end method

.method private L()V
    .locals 1

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    invoke-virtual {v0}, Lz82/e;->E()V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->supportFinishAfterTransition()V

    return-void
.end method

.method private M()Lcom/whoop/domain/model/Invitation;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "invitation"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/whoop/domain/model/Invitation;

    invoke-static {v0, v1}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/Invitation;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private N()I
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "transitionDelay"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private O(Lpg3/v0;Lcom/whoop/ui/h;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lpg3/v0<",
            "Lcom/whoop/service/network/model/ClaimInviteResponse;",
            ">;",
            "Lcom/whoop/ui/h;",
            "Lcom/whoop/domain/model/Invitation;",
            "Lcom/whoop/domain/model/User;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Landroidx/fragment/app/y;->dismiss()V

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p1, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p1, p1, Lud3/x0;->Q:Z

    if-eqz p1, :cond_1

    invoke-static {p0, p3, p4}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->M(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    move-result-object p1

    sget p2, Lcom/whoop/community/presentation/login/JoinTeamActivity;->K:I

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;->t(I)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;->s(Landroid/app/Activity;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object p2, p2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->a:Landroid/view/View;

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;->f(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object p2, p2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->b:Landroid/view/View;

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;->c(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    move-result-object p1

    invoke-virtual {p0}, Lhj0/t;->E()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;->d(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object p2, p2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->f:Landroid/view/ViewGroup;

    invoke-virtual {p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;->e(Landroid/view/View;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/t$c;->a()Lhj0/t$b;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    invoke-virtual {p1}, Lhj0/q;->m()V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->supportFinishAfterTransition()V

    return-void

    :cond_1
    sget p1, Lxp0/d0;->b:I

    const/4 p2, 0x1

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/r;->b(Landroid/content/Context;II)Lcom/whoop/ui/r;

    move-result-object p1

    invoke-virtual {p1}, Landroid/widget/Toast;->show()V

    return-void
.end method

.method private P()V
    .locals 7

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->a:Landroid/view/View;

    const-string v1, "whoopLogo"

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->b:Landroid/view/View;

    const-string v1, "background"

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    const-string v0, "navigationBar"

    invoke-virtual {p0, v0}, Lhj0/t;->F(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->i:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->d:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->f:Landroid/view/ViewGroup;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    new-instance v0, Landroid/transition/Slide;

    const/4 v2, 0x5

    invoke-direct {v0, v2}, Landroid/transition/Slide;-><init>(I)V

    iget-object v2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v2, v2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->a:Landroid/view/View;

    invoke-virtual {v0, v2, v1}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    iget-object v2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v2, v2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->b:Landroid/view/View;

    invoke-virtual {v0, v2, v1}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    const v2, 0x102002f

    invoke-virtual {v0, v2, v1}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    const v3, 0x1020030

    invoke-virtual {v0, v3, v1}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    const-wide/16 v4, 0x190

    invoke-virtual {v0, v4, v5}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v4

    invoke-virtual {v4, v0}, Landroid/view/Window;->setEnterTransition(Landroid/transition/Transition;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAllowReturnTransitionOverlap(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v4}, Landroid/view/Window;->setAllowEnterTransitionOverlap(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V

    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object v0

    new-instance v4, Llr/e;

    const/4 v5, 0x5

    invoke-direct {v4, p0, v5}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->N()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0, v4, v5, v6}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    new-instance v0, Landroid/transition/Slide;

    const/4 v4, 0x3

    invoke-direct {v0, v4}, Landroid/transition/Slide;-><init>(I)V

    iget-object v4, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v4, v4, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->a:Landroid/view/View;

    invoke-virtual {v0, v4, v1}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    iget-object v4, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v4, v4, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->b:Landroid/view/View;

    invoke-virtual {v0, v4, v1}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    iget-object v4, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v4, v4, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->f:Landroid/view/ViewGroup;

    invoke-virtual {v0, v4, v1}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    invoke-virtual {v0, v2, v1}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    invoke-virtual {v0, v3, v1}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    sget v1, Lcom/whoop/community/presentation/login/JoinTeamActivity;->K:I

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setExitTransition(Landroid/transition/Transition;)V

    return-void
.end method

.method public static Q(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;
    .locals 1

    new-instance v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    invoke-direct {v0, p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;-><init>(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;)V

    return-object v0
.end method

.method private synthetic R(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Lpg3/v0;Lcom/whoop/ui/h;)V
    .locals 0

    invoke-direct {p0, p3, p4, p1, p2}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->O(Lpg3/v0;Lcom/whoop/ui/h;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)V

    return-void
.end method

.method private synthetic S(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Ljava/lang/Throwable;Lcom/whoop/ui/h;)V
    .locals 0

    const/4 p3, 0x0

    invoke-direct {p0, p3, p4, p1, p2}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->O(Lpg3/v0;Lcom/whoop/ui/h;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)V

    return-void
.end method

.method private T(Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;Landroid/view/View;)V
    .locals 8

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p3

    invoke-virtual {p3}, Lz82/e;->B()V

    invoke-virtual {p0}, Lhj0/f;->v()Landroidx/fragment/app/o1;

    move-result-object v0

    sget p3, Lxp0/d0;->d:I

    invoke-virtual {p0, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lhj0/f;->r()Lcom/whoop/ui/l;

    move-result-object v4

    const-class p3, Lcq0/b;

    const/4 v1, 0x0

    invoke-static {p3, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lcq0/b;

    invoke-virtual {p3, p1}, Lcq0/b;->a(Lcom/whoop/domain/model/Invitation;)Lxg3/g;

    move-result-object v5

    new-instance v6, Loq0/h;

    const/4 p3, 0x0

    invoke-direct {v6, p0, p1, p2, p3}, Loq0/h;-><init>(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;I)V

    new-instance v7, Loq0/h;

    const/4 p3, 0x1

    invoke-direct {v7, p0, p1, p2, p3}, Loq0/h;-><init>(Lcom/whoop/community/presentation/login/JoinTeamActivity;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;I)V

    const-string v1, "JoinTeam"

    const/4 v3, 0x0

    invoke-static/range {v0 .. v7}, Lcom/whoop/ui/h;->L(Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/l;Lxg3/g;Lbh3/c;Lbh3/c;)Lcom/whoop/ui/h;

    return-void
.end method

.method private synthetic U(Landroid/view/View;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->L()V

    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->L()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    invoke-super {p0, p1}, Lhj0/t;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lhj0/f;->B()V

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->g()Lod1/u;

    move-result-object p1

    invoke-virtual {p1}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/domain/model/Session;->getUser()Lcom/whoop/domain/model/User;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->J:Ltr2/n;

    const-string v1, "No current user, aborting"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_1
    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->M()Lcom/whoop/domain/model/Invitation;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->J:Ltr2/n;

    const-string v1, "No invite code found, aborting"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_2
    sget v0, Lxp0/b0;->d:I

    invoke-virtual {p0, v0}, Lm/m;->setContentView(I)V

    new-instance v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->P()V

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->h:Landroid/widget/TextView;

    sget v2, Lxp0/d0;->c:I

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/domain/model/Invitation;->getTeamName()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lml/g;->h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getAvatarUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v2

    new-instance v3, Lpl/d;

    invoke-direct {v3}, Lpl/a;-><init>()V

    sget v4, Lvu1/c;->n:I

    invoke-virtual {v3, v4}, Lpl/a;->j(I)Lpl/a;

    move-result-object v3

    check-cast v3, Lpl/d;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Lkl/h;->b:Lwk/g;

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4, v5}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v3, v3, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->e:Landroid/widget/ImageView;

    invoke-virtual {v2, v3}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    invoke-virtual {v1}, Lcom/whoop/domain/model/Invitation;->getTeamIcon()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    new-instance v2, Lpl/d;

    invoke-direct {v2}, Lpl/a;-><init>()V

    sget v3, Lvu1/c;->n:I

    invoke-virtual {v2, v3}, Lpl/a;->j(I)Lpl/a;

    move-result-object v2

    check-cast v2, Lpl/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v2, v4, v5}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object v0

    iget-object v2, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v2, v2, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->g:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object v0, v0, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->j:Landroid/view/View;

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v1, p1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/internal/poll/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamActivity;->I:Lcom/whoop/community/presentation/login/JoinTeamActivity$c;

    iget-object p1, p1, Lcom/whoop/community/presentation/login/JoinTeamActivity$c;->k:Landroid/view/View;

    new-instance v0, Ljo/j;

    const/16 v1, 0x9

    invoke-direct {v0, p0, v1}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
