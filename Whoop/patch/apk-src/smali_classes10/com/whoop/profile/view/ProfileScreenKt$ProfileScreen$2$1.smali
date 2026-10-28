.class final Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/ProfileScreenKt;->ProfileScreen(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Ltr2/n;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/fragment/app/r0;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.profile.view.ProfileScreenKt$ProfileScreen$2$1"
    f = "ProfileScreen.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic $actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

.field final synthetic $hasLoggedScreenView$delegate:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic $source:Ljava/lang/String;

.field final synthetic $viewState$delegate:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field label:I


# direct methods
.method public constructor <init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Ljava/lang/String;Lp1/c1;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/navigation/ProfileActionRouter;",
            "Ljava/lang/String;",
            "Lp1/c1;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

    iput-object p2, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$source:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$hasLoggedScreenView$delegate:Lp1/c1;

    iput-object p4, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$viewState$delegate:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$source:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$hasLoggedScreenView$delegate:Lp1/c1;

    iget-object v4, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$viewState$delegate:Lp1/t2;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;-><init>(Lcom/whoop/profile/navigation/ProfileActionRouter;Ljava/lang/String;Lp1/c1;Lp1/t2;Lq83/d;)V

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->label:I

    if-nez v0, :cond_2

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$hasLoggedScreenView$delegate:Lp1/c1;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenKt;->access$ProfileScreen$lambda$5(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$viewState$delegate:Lp1/t2;

    invoke-static {p1}, Lcom/whoop/profile/view/ProfileScreenKt;->access$ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getUserData()Lcom/whoop/profile/presentation/ProfileViewState$UserData;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$hasLoggedScreenView$delegate:Lp1/c1;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lcom/whoop/profile/view/ProfileScreenKt;->access$ProfileScreen$lambda$6(Lp1/c1;Z)V

    iget-object p1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$actionRouter:Lcom/whoop/profile/navigation/ProfileActionRouter;

    sget-object v0, Lcom/whoop/profile/presentation/ProfileEvent;->Companion:Lcom/whoop/profile/presentation/ProfileEvent$Companion;

    iget-object v1, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$source:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$viewState$delegate:Lp1/t2;

    invoke-static {v2}, Lcom/whoop/profile/view/ProfileScreenKt;->access$ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->isSelfProfile()Z

    move-result v2

    iget-object v3, p0, Lcom/whoop/profile/view/ProfileScreenKt$ProfileScreen$2$1;->$viewState$delegate:Lp1/t2;

    invoke-static {v3}, Lcom/whoop/profile/view/ProfileScreenKt;->access$ProfileScreen$lambda$2(Lp1/t2;)Lcom/whoop/profile/presentation/ProfileViewState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/ProfileViewState;->getMetadata()Lcom/whoop/profile/presentation/ProfileViewState$Metadata;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/ProfileViewState$Metadata;->getMembershipData()Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/whoop/profile/view/ProfileScreenKt;->access$toMembershipAnalyticsProperties(Lcom/whoop/profile/presentation/ProfileViewState$MembershipData;)Lcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;

    move-result-object v3

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    invoke-virtual {v0, v1, v2, v3}, Lcom/whoop/profile/presentation/ProfileEvent$Companion;->screenViewedAnalyticEvent(Ljava/lang/String;ZLcom/whoop/profile/analytics/ProfileMembershipAnalyticsProperties;)Lcom/whoop/profile/presentation/ProfileEvent$AnalyticEvent;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/whoop/profile/navigation/ProfileActionRouter;->route(Lcom/whoop/profile/presentation/ProfileEvent;)Lcom/whoop/profile/presentation/ProfileEvent;

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
