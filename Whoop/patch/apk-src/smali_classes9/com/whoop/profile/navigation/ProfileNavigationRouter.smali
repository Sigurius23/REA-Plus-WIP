.class public final Lcom/whoop/profile/navigation/ProfileNavigationRouter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u001a*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020!\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010&R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
        "",
        "Leb/u0;",
        "composeNavController",
        "Leb/a0;",
        "fragmentHostController",
        "Lj02/o0;",
        "navigator",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Leb/u0;Leb/a0;Lj02/o0;Ltr2/n;)V",
        "Lj02/s;",
        "event",
        "Ll83/a0;",
        "handleDismissEvent",
        "(Lj02/s;)V",
        "Lm91/u;",
        "handleAppDrivenNavigation",
        "(Lm91/u;)V",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "source",
        "navigateBackendDriven",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;)V",
        "Lcom/whoop/navigation/NavigationScreenModel;",
        "withSource",
        "(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;",
        "Lcom/whoop/navigation/FeatureEducationModel;",
        "",
        "isHealthspanEducation",
        "(Lcom/whoop/navigation/FeatureEducationModel;)Z",
        "Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;",
        "route",
        "(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V",
        "Leb/u0;",
        "Leb/a0;",
        "Lj02/o0;",
        "Ltr2/n;",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final composeNavController:Leb/u0;

.field private final fragmentHostController:Leb/a0;

.field private final logger:Ltr2/n;

.field private final navigator:Lj02/o0;


# direct methods
.method public constructor <init>(Leb/u0;Leb/a0;Lj02/o0;Ltr2/n;)V
    .locals 1

    const-string v0, "composeNavController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fragmentHostController"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->composeNavController:Leb/u0;

    iput-object p2, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    iput-object p3, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->navigator:Lj02/o0;

    iput-object p4, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->logger:Ltr2/n;

    return-void
.end method

.method private final handleAppDrivenNavigation(Lm91/u;)V
    .locals 3

    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToAccountViewState;

    if-eqz v0, :cond_0

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    const-string v1, "android-app://com.whoop/settings/myAccountFragment?source=profile"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToSettingsViewState;

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->navigator:Lj02/o0;

    new-instance v0, Lj02/m0$j4;

    const-string v1, "profile"

    invoke-direct {v0, v1}, Lj02/m0$j4;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToEditProfileViewState;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->composeNavController:Leb/u0;

    const/4 v0, 0x0

    const/4 v1, 0x6

    const-string v2, "EDIT_PROFILE"

    invoke-static {p1, v2, v0, v1}, Leb/a0;->y(Leb/a0;Ljava/lang/String;Leb/x0;I)V

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToHealthspanViewState;

    if-eqz v0, :cond_3

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    const-string v1, "android-app://com.whoop/healthspan?source=profile"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_3
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToStreaksViewState;

    if-eqz v0, :cond_4

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    const-string v1, "android-app://com.whoop/streaks"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_4
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToReferralsViewState;

    if-eqz v0, :cond_5

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    const-string v1, "android-app://com.whoop/referrals"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_5
    instance-of v0, p1, Lcom/whoop/profile/presentation/NavigateToLevelsViewState;

    if-eqz v0, :cond_6

    new-instance p1, Leb/w0;

    invoke-direct {p1}, Leb/w0;-><init>()V

    invoke-static {p1}, Lor2/c1;->f(Leb/w0;)Leb/w0;

    move-result-object p1

    invoke-virtual {p1}, Leb/w0;->a()Leb/x0;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    const-string v1, "android-app://com.whoop/levels"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Leb/a0;->r(Landroid/net/Uri;Leb/x0;)V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->logger:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "itemClicked "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private final handleDismissEvent(Lj02/s;)V
    .locals 3

    invoke-virtual {p1}, Lj02/s;->b()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    invoke-virtual {p1}, Lj02/s;->c()Lj02/v;

    move-result-object p1

    const/4 v1, 0x2

    const/4 v2, 0x0

    invoke-static {v0, p1, v2, v1, v2}, Lcom/whoop/navigation/d;->f(Leb/a0;Lj02/v;Ltr2/n;ILjava/lang/Object;)Z

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    invoke-virtual {p1}, Lj02/s;->b()Lcom/whoop/navigation/PopUpToModel;

    move-result-object v1

    invoke-virtual {p1}, Lj02/s;->a()Ljava/lang/Integer;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->logger:Ltr2/n;

    invoke-static {v0, v1, p1, v2}, Lcom/whoop/navigation/d;->d(Leb/a0;Lcom/whoop/navigation/PopUpToModel;Ljava/lang/Integer;Ltr2/n;)Z

    return-void
.end method

.method private final isHealthspanEducation(Lcom/whoop/navigation/FeatureEducationModel;)Z
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/FeatureEducationModel;->getFeatureEducationName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "HEALTHSPAN"

    const/4 v1, 0x1

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    return p1
.end method

.method private final navigateBackendDriven(Lcom/whoop/navigation/e;Ljava/lang/String;)V
    .locals 7

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/navigation/FeatureEducationModel;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lcom/whoop/navigation/FeatureEducationModel;

    invoke-direct {p0, v1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->isHealthspanEducation(Lcom/whoop/navigation/FeatureEducationModel;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->navigator:Lj02/o0;

    new-instance v0, Lj02/m0$t1;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v2, p2

    invoke-direct/range {v0 .. v5}, Lj02/m0$t1;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_0
    move-object v2, p2

    iget-object p2, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->navigator:Lj02/o0;

    invoke-direct {p0, v0, v2}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->withSource(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p2, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void
.end method

.method private final withSource(Lcom/whoop/navigation/NavigationScreenModel;Ljava/lang/String;)Lcom/whoop/navigation/NavigationScreenModel;
    .locals 8

    instance-of v0, p1, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    if-eqz v0, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v3, p2

    invoke-static/range {v1 .. v7}, Lcom/whoop/navigation/ReferAFriendHubScreenModel;->copy$default(Lcom/whoop/navigation/ReferAFriendHubScreenModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ZILjava/lang/Object;)Lcom/whoop/navigation/ReferAFriendHubScreenModel;

    move-result-object p1

    return-object p1

    :cond_0
    move-object v2, p2

    instance-of p2, p1, Lcom/whoop/navigation/FeatureEducationModel;

    if-eqz p2, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/whoop/navigation/FeatureEducationModel;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/FeatureEducationModel;->copy$default(Lcom/whoop/navigation/FeatureEducationModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/FeatureEducationModel;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of p2, p1, Lcom/whoop/navigation/HealthspanScreenModel;

    if-eqz p2, :cond_2

    move-object v0, p1

    check-cast v0, Lcom/whoop/navigation/HealthspanScreenModel;

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/whoop/navigation/HealthspanScreenModel;->copy$default(Lcom/whoop/navigation/HealthspanScreenModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILjava/lang/Object;)Lcom/whoop/navigation/HealthspanScreenModel;

    move-result-object p1

    :cond_2
    return-object p1
.end method


# virtual methods
.method public final route(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->getNavAction()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;->getSource()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->navigateBackendDriven(Lcom/whoop/navigation/e;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$AppDrivenNavigation;->getItemViewState()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->handleAppDrivenNavigation(Lm91/u;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$GoBack;

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->fragmentHostController:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_2
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;->getDismissEvent()Lj02/s;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->handleDismissEvent(Lj02/s;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
