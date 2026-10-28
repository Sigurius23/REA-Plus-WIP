.class public Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;
.super Lhj0/t;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;,
        Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;,
        Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$c;
    }
.end annotation


# instance fields
.field private I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

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

    const-string v2, "Join Team Confirmation"

    invoke-direct {v0, v1, v2}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->J:Ltr2/n;

    return-void
.end method

.method public static synthetic H(Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;Landroid/view/View;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->N(Landroid/view/View;)V

    return-void
.end method

.method private I()Lcom/whoop/domain/model/Invitation;
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

.method private J()I
    .locals 3

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "transitionDelay"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result v0

    return v0
.end method

.method private K()Lcom/whoop/domain/model/User;
    .locals 2

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v1, "user"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    const-class v1, Lcom/whoop/domain/model/User;

    invoke-static {v0, v1}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/domain/model/User;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method private L()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->b:Landroid/view/View;

    const-string v1, "whoopLogo"

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->a:Landroid/view/View;

    const-string v1, "background"

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->c:Landroid/view/ViewGroup;

    const-string v1, "teamIcon"

    invoke-virtual {v0, v1}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    const-string v0, "navigationBar"

    invoke-virtual {p0, v0}, Lhj0/t;->F(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->c:Landroid/view/ViewGroup;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->postponeEnterTransition()V

    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object v0

    new-instance v1, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$a;

    invoke-direct {v1, p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$a;-><init>(Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->J()I

    move-result v2

    int-to-long v2, v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public static M(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;
    .locals 1

    new-instance v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;

    invoke-direct {v0, p0, p1, p2}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$b;-><init>(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;Lcom/whoop/domain/model/User;)V

    return-object v0
.end method

.method private synthetic N(Landroid/view/View;)V
    .locals 2

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v0

    invoke-virtual {v0}, Le50/b;->g()Lod1/u;

    move-result-object v0

    invoke-virtual {v0}, Lod1/u;->h()Lcom/whoop/domain/model/Session;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    const-string v1, "com.whoop.ui.home.redesign.view.MainActivity"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    const/high16 p1, 0x10000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const p1, 0x8000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    const/high16 p1, 0x4000000

    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finishAffinity()V

    :cond_0
    return-void
.end method


# virtual methods
.method public onBackPressed()V
    .locals 0

    invoke-super {p0}, Lg/l;->onBackPressed()V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 4

    invoke-super {p0, p1}, Lhj0/t;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lhj0/f;->B()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I()Lcom/whoop/domain/model/Invitation;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->J:Ltr2/n;

    const-string v1, "No invite code found, aborting"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->K()Lcom/whoop/domain/model/User;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->J:Ltr2/n;

    const-string v1, "No user found, aborting"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void

    :cond_1
    sget v0, Lxp0/b0;->e:I

    invoke-virtual {p0, v0}, Lm/m;->setContentView(I)V

    new-instance v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;-><init>(Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    invoke-direct {p0}, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->L()V

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->e:Landroid/widget/TextView;

    sget v2, Lxp0/d0;->a:I

    invoke-virtual {v1}, Lcom/whoop/domain/model/User;->getFullName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/domain/model/Invitation;->getTeamName()Ljava/lang/String;

    move-result-object v3

    filled-new-array {v1, v3}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v2, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-static {p0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lml/g;->h(Landroidx/fragment/app/r0;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/domain/model/Invitation;->getTeamIcon()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p1

    new-instance v0, Lpl/d;

    invoke-direct {v0}, Lpl/a;-><init>()V

    sget v1, Lvu1/c;->n:I

    invoke-virtual {v0, v1}, Lpl/a;->j(I)Lpl/a;

    move-result-object v0

    check-cast v0, Lpl/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, Lkl/h;->b:Lwk/g;

    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1, v2}, Lpl/a;->p(Lwk/g;Ljava/lang/Object;)Lpl/a;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->w(Lpl/a;)Lcom/bumptech/glide/f;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object v0, v0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->d:Landroid/widget/ImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    iget-object p1, p0, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity;->I:Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;

    iget-object p1, p1, Lcom/whoop/community/presentation/teams/JoinTeamConfirmationActivity$d;->f:Landroid/view/View;

    new-instance v0, Ljo/j;

    const/16 v1, 0xd

    invoke-direct {v0, p0, v1}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
