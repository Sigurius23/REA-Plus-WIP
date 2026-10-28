.class public final Lcom/whoop/profile/view/ProfileScreenEventRouter;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001aR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001bR\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lcom/whoop/profile/view/ProfileScreenEventRouter;",
        "",
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "actionRouter",
        "Lcom/whoop/profile/presentation/ProfileViewModel;",
        "viewModel",
        "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
        "navRouter",
        "Lkotlin/Function1;",
        "Ljava/lang/Runnable;",
        "Ll83/a0;",
        "runAfterCurrentEvent",
        "<init>",
        "(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;)V",
        "scheduleDeferredClearIfCancelOnly",
        "()V",
        "Lcom/whoop/profile/presentation/ProfileEvent;",
        "event",
        "onProfileScreenEvent",
        "(Lcom/whoop/profile/presentation/ProfileEvent;)V",
        "La81/t;",
        "modalEvent",
        "onGenericModalEvent",
        "(La81/t;)V",
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "Lcom/whoop/profile/presentation/ProfileViewModel;",
        "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
        "Lkotlin/jvm/functions/Function1;",
        "",
        "pendingModalCardButtonId",
        "Ljava/lang/String;",
        "deferredModalCardButtonIdForConfirm",
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
.field private final actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

.field private deferredModalCardButtonIdForConfirm:Ljava/lang/String;

.field private final navRouter:Lcom/whoop/profile/navigation/ProfileNavigationRouter;

.field private pendingModalCardButtonId:Ljava/lang/String;

.field private final runAfterCurrentEvent:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;


# direct methods
.method public constructor <init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/navigation/ProfileActionRouter;",
            "Lcom/whoop/profile/presentation/ProfileViewModel;",
            "Lcom/whoop/profile/navigation/ProfileNavigationRouter;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "actionRouter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runAfterCurrentEvent"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

    .line 3
    iput-object p2, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;

    .line 4
    iput-object p3, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->navRouter:Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    .line 5
    iput-object p4, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->runAfterCurrentEvent:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    .line 6
    new-instance p4, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 p5, 0x14

    invoke-direct {p4, p5}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    .line 7
    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/ProfileScreenEventRouter;-><init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Lcom/whoop/profile/presentation/ProfileViewModel;Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final _init_$lambda$0(Ljava/lang/Runnable;)Ll83/a0;
    .locals 2

    const-string v0, "runnable"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lcom/whoop/profile/view/ProfileScreenEventRouter;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->scheduleDeferredClearIfCancelOnly$lambda$0(Lcom/whoop/profile/view/ProfileScreenEventRouter;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/Runnable;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->_init_$lambda$0(Ljava/lang/Runnable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final scheduleDeferredClearIfCancelOnly()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->runAfterCurrentEvent:Lkotlin/jvm/functions/Function1;

    new-instance v1, Landroidx/fragment/app/m;

    const/16 v2, 0x11

    invoke-direct {v1, p0, v2}, Landroidx/fragment/app/m;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final scheduleDeferredClearIfCancelOnly$lambda$0(Lcom/whoop/profile/view/ProfileScreenEventRouter;)V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->deferredModalCardButtonIdForConfirm:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final onGenericModalEvent(La81/t;)V
    .locals 7

    const-string v0, "modalEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, La81/t$b;

    if-eqz v0, :cond_0

    new-instance v0, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;

    check-cast p1, La81/t$b;

    invoke-virtual {p1}, La81/t$b;->b()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p1}, La81/t$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lcom/whoop/profile/presentation/ProfileEvent$ItemClicked;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-virtual {p0, v0}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->onProfileScreenEvent(Lcom/whoop/profile/presentation/ProfileEvent;)V

    return-void

    :cond_0
    instance-of v0, p1, La81/t$a;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->pendingModalCardButtonId:Ljava/lang/String;

    iput-object p1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->deferredModalCardButtonIdForConfirm:Ljava/lang/String;

    iput-object v1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->pendingModalCardButtonId:Ljava/lang/String;

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;->INSTANCE:Lcom/whoop/profile/presentation/ProfileEvent$DismissDesignModal;

    invoke-virtual {p1, v0}, Lcom/whoop/profile/presentation/ProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V

    invoke-direct {p0}, Lcom/whoop/profile/view/ProfileScreenEventRouter;->scheduleDeferredClearIfCancelOnly()V

    return-void

    :cond_1
    instance-of v0, p1, La81/t$f;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    check-cast p1, La81/t$f;

    invoke-virtual {p1}, La81/t$f;->a()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object p1

    const/4 v3, 0x2

    invoke-direct {v2, p1, v1, v3, v1}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;-><init>(Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lcom/whoop/profile/presentation/ProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V

    return-void

    :cond_2
    instance-of v0, p1, La81/t$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->deferredModalCardButtonIdForConfirm:Ljava/lang/String;

    iput-object v1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->deferredModalCardButtonIdForConfirm:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;

    new-instance v2, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;

    check-cast p1, La81/t$d;

    invoke-virtual {p1}, La81/t$d;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p1

    invoke-direct {v2, p1, v0}, Lcom/whoop/profile/presentation/ProfileEvent$ExecuteWhoopAction;-><init>(Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;)V

    invoke-virtual {v1, v2}, Lcom/whoop/profile/presentation/ProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V

    return-void

    :cond_3
    instance-of v0, p1, La81/t$c;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->navRouter:Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;

    check-cast p1, La81/t$c;

    invoke-virtual {p1}, La81/t$c;->a()Lcom/whoop/navigation/e;

    move-result-object v2

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "profile"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/profile/presentation/ProfileEvent$BackendDrivenNavigation;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->route(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V

    return-void

    :cond_4
    instance-of v0, p1, La81/t$e;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->navRouter:Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    new-instance v1, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;

    check-cast p1, La81/t$e;

    invoke-virtual {p1}, La81/t$e;->a()Lj02/s;

    move-result-object p1

    invoke-direct {v1, p1}, Lcom/whoop/profile/presentation/ProfileEvent$PerformDismissNavigation;-><init>(Lj02/s;)V

    invoke-virtual {v0, v1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->route(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final onProfileScreenEvent(Lcom/whoop/profile/presentation/ProfileEvent;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/navigation/ProfileActionRouter;->route(Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileEvent;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->navRouter:Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;->route(Lcom/whoop/profile/presentation/ProfileEvent$NavigationEvent;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;

    if-eqz v0, :cond_2

    instance-of v0, p1, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    if-eqz v0, :cond_1

    move-object v0, p1

    check-cast v0, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/ProfileEvent$PresentDesignModal;->getCardButtonId()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->pendingModalCardButtonId:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->deferredModalCardButtonIdForConfirm:Ljava/lang/String;

    :cond_1
    iget-object v0, p0, Lcom/whoop/profile/view/ProfileScreenEventRouter;->viewModel:Lcom/whoop/profile/presentation/ProfileViewModel;

    check-cast p1, Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/presentation/ProfileViewModel;->sendViewEvent(Lcom/whoop/profile/presentation/ProfileEvent$ViewEvent;)V

    :cond_2
    return-void
.end method
