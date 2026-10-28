.class public final Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;
.super Lhj0/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0013\u0010\u000c\u001a\u00020\u0004*\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0003J\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003J\u0019\u0010 \u001a\u00020\u00042\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014\u00a2\u0006\u0004\u0008 \u0010!R\u001b\u0010\'\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;",
        "Lhj0/f;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "W",
        "c0",
        "Landroid/view/View;",
        "view",
        "a0",
        "(Landroid/view/View;)V",
        "Landroid/widget/ScrollView;",
        "V",
        "(Landroid/widget/ScrollView;)V",
        "d0",
        "T",
        "U",
        "Lcom/whoop/domain/model/Invitation;",
        "invitation",
        "R",
        "(Lcom/whoop/domain/model/Invitation;)V",
        "Lcom/whoop/domain/model/teams/DrawerDisplayInvite;",
        "invite",
        "S",
        "(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V",
        "Loq0/m;",
        "viewState",
        "k0",
        "(Loq0/m;)V",
        "Q",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Loq0/k;",
        "I",
        "Ll83/h;",
        "P",
        "()Loq0/k;",
        "viewModel",
        "Leq0/g;",
        "J",
        "Leq0/g;",
        "joinTeamLandingBinding",
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
.field private final I:Ll83/h;

.field private J:Leq0/g;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/f;-><init>()V

    new-instance v0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$b;

    invoke-direct {v0, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->I:Ll83/h;

    return-void
.end method

.method public static synthetic D(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->Y(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->f0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Loq0/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->e0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Loq0/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->g0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->b0(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->h0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->j0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->Z(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->i0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->X(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Leq0/g;
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    return-object p0
.end method

.method public static final synthetic O(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Loq0/k;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object p0

    return-object p0
.end method

.method private final P()Loq0/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Loq0/k;

    return-object v0
.end method

.method private final Q()V
    .locals 3

    const-string v0, "input_method"

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    iget-object v1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz v1, :cond_0

    iget-object v1, v1, Leq0/g;->k:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    return-void

    :cond_0
    const-string v0, "joinTeamLandingBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final R(Lcom/whoop/domain/model/Invitation;)V
    .locals 3

    new-instance v0, Landroid/transition/Slide;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Landroid/transition/Slide;-><init>(I)V

    const/16 v1, 0x190

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Landroid/transition/Transition;->setDuration(J)Landroid/transition/Transition;

    const v1, 0x102002f

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    const v1, 0x1020030

    invoke-virtual {v0, v1, v2}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setExitTransition(Landroid/transition/Transition;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAllowEnterTransitionOverlap(Z)V

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/view/Window;->setAllowReturnTransitionOverlap(Z)V

    invoke-static {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamActivity;->Q(Landroid/content/Context;Lcom/whoop/domain/model/Invitation;)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    move-result-object p1

    const/16 v0, 0x1c2

    invoke-virtual {p1, v0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;->s(I)Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;->r(Landroid/app/Activity;)Lcom/whoop/community/presentation/login/JoinTeamActivity$b;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/t$c;->a()Lhj0/t$b;

    move-result-object p1

    check-cast p1, Lcom/whoop/community/presentation/login/JoinTeamActivity$a;

    invoke-virtual {p1}, Lhj0/q;->m()V

    return-void
.end method

.method private final S(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V
    .locals 1

    sget-object v0, Lcom/whoop/ui/teams/TeamsShowInviteActivity;->R:Lcom/whoop/ui/teams/TeamsShowInviteActivity$a;

    invoke-virtual {v0, p0, p1}, Lcom/whoop/ui/teams/TeamsShowInviteActivity$a;->a(Landroid/content/Context;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Lhj0/q;

    move-result-object p1

    invoke-virtual {p1}, Lhj0/q;->m()V

    return-void
.end method

.method private final T()V
    .locals 1

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    invoke-virtual {v0}, Lz82/e;->C0()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->H()V

    return-void
.end method

.method private final U()V
    .locals 3

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    invoke-virtual {v0}, Lz82/e;->t()V

    new-instance v0, Landroid/content/Intent;

    sget v1, Lxp0/d0;->H1:I

    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v0, v2, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    const-string v1, "Choose browser"

    invoke-static {v0, v1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final V(Landroid/widget/ScrollView;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getPaddingBottom()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v0

    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    move-result v2

    add-int/2addr v2, v0

    sub-int/2addr v1, v2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/widget/ScrollView;->smoothScrollBy(II)V

    return-void
.end method

.method private final W()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz v0, :cond_0

    iget-object v1, v0, Leq0/g;->j:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v2, "joinTeamBrowseTeam"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Loq0/i;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Leq0/g;->a:Landroid/widget/ImageView;

    const-string v2, "backArrow"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Loq0/i;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Leq0/g;->o:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v1, "joinTeamSubmitCode"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Loq0/i;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string v0, "joinTeamLandingBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final X(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->U()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Y(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Z(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->T()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final a0(Landroid/view/View;)V
    .locals 3

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Ln40/a;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2, p0}, Ln40/a;-><init>(Landroid/view/View;ILjava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    return-void
.end method

.method private static final b0(Landroid/view/View;Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V
    .locals 2

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    invoke-virtual {p0, v0}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    move-result-object p0

    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    move-result p0

    iget v1, v0, Landroid/graphics/Rect;->bottom:I

    iget v0, v0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v0

    sub-int/2addr p0, v1

    invoke-static {p0}, Ljava/lang/Math;->abs(I)I

    move-result p0

    const/16 v0, 0x64

    if-le p0, v0, :cond_1

    iget-object p0, p1, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz p0, :cond_0

    iget-object p0, p0, Leq0/g;->n:Landroid/widget/ScrollView;

    const-string v0, "joinTeamScrollView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p1, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->V(Landroid/widget/ScrollView;)V

    return-void

    :cond_0
    const-string p0, "joinTeamLandingBinding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method private final c0()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Leq0/g;->k:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;

    invoke-direct {v1, p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity$a;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    :cond_0
    return-void

    :cond_1
    const-string v0, "joinTeamLandingBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final d0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->C()Le50/c;

    move-result-object v0

    new-instance v1, Loq0/i;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Le50/c;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->w()Lor2/r0;

    move-result-object v0

    new-instance v1, Loq0/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Loq0/j;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/r0;->c(Landroidx/lifecycle/g0;Lc93/a;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->v()Lor2/r0;

    move-result-object v0

    new-instance v1, Loq0/j;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Loq0/j;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/r0;->c(Landroidx/lifecycle/g0;Lc93/a;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->A()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/i;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->y()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/i;

    const/4 v2, 0x5

    invoke-direct {v1, p0, v2}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->P()Loq0/k;

    move-result-object v0

    invoke-virtual {v0}, Loq0/k;->z()Lor2/s0;

    move-result-object v0

    new-instance v1, Loq0/i;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Loq0/i;-><init>(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)V

    invoke-virtual {v0, p0, v1}, Lor2/s0;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final e0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Loq0/m;)Ll83/a0;
    .locals 1

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->k0(Loq0/m;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->Q()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Landroid/app/Activity;->getCurrentFocus()Landroid/view/View;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->clearFocus()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lin2/i;->f(Landroid/content/Context;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/Invitation;)Ll83/a0;
    .locals 1

    const-string v0, "invite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->R(Lcom/whoop/domain/model/Invitation;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j0(Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)Ll83/a0;
    .locals 1

    const-string v0, "invite"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->S(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final k0(Loq0/m;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Loq0/m;->c()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v2, v0, Leq0/g;->l:Landroid/widget/TextView;

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(I)V

    goto :goto_0

    :cond_0
    iget-object v1, v0, Leq0/g;->l:Landroid/widget/TextView;

    const-string v2, ""

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :goto_0
    iget-object v1, v0, Leq0/g;->l:Landroid/widget/TextView;

    invoke-virtual {p1}, Loq0/m;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, v0, Leq0/g;->k:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Loq0/m;->e()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual {p1}, Loq0/m;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_1
    invoke-virtual {p1}, Loq0/m;->f()Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    iget-object v0, v0, Leq0/g;->k:Lcom/whoop/ui/WhoopEditText;

    invoke-virtual {v0}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setSelection(I)V

    :cond_2
    return-void

    :cond_3
    const-string p1, "joinTeamLandingBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lhj0/f;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Leq0/g;->c(Landroid/view/LayoutInflater;)Leq0/g;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->W()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->d0()V

    invoke-direct {p0}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->c0()V

    iget-object p1, p0, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->J:Leq0/g;

    if-eqz p1, :cond_0

    iget-object p1, p1, Leq0/g;->n:Landroid/widget/ScrollView;

    const-string v0, "joinTeamScrollView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/presentation/login/JoinTeamLandingActivity;->a0(Landroid/view/View;)V

    return-void

    :cond_0
    const-string p1, "joinTeamLandingBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
