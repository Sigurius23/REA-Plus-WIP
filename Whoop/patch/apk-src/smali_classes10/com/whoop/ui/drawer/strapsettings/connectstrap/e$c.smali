.class final Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->y(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V
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
    c = "com.whoop.ui.drawer.strapsettings.connectstrap.ConnectStrapViewModel$fetchOnboardingInfoBasedOnStrapDetails$1"
    f = "ConnectStrapViewModel.kt"
    l = {
        0x3e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lst0/v;

.field w:I

.field final synthetic x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Ljava/lang/String;Ljava/lang/String;Lst0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lst0/v;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iput-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->y:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->z:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->E:Lst0/v;

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

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->z:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->E:Lst0/v;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Ljava/lang/String;Ljava/lang/String;Lst0/v;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->n(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lor2/c;

    move-result-object p1

    invoke-virtual {p1}, Lor2/c;->e()Z

    move-result p1

    if-nez p1, :cond_2

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z()Landroidx/lifecycle/u0;

    move-result-object p1

    sget-object v0, Lqm2/r;->a:Lqm2/r;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto :goto_2

    :cond_2
    :try_start_1
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->q(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Lcom/whoop/data/repositories/OnboardingRepository;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->y:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->z:Ljava/lang/String;

    iput v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->w:I

    invoke-virtual {p1, v1, v3, p0}, Lcom/whoop/data/repositories/OnboardingRepository;->fetchOnboardingInfo(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_0
    check-cast p1, Lcom/whoop/data/remote/commons/Resource;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getData()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    invoke-virtual {p1}, Lcom/whoop/data/remote/commons/Resource;->getSuccess()Z

    move-result p1

    if-eqz p1, :cond_4

    if-eqz v0, :cond_4

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->y:Ljava/lang/String;

    invoke-static {p1, v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->v(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    new-instance v1, Lqm2/u;

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->E:Lst0/v;

    invoke-direct {v1, v0, p1, v2}, Lqm2/u;-><init>(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z()Landroidx/lifecycle/u0;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z()Landroidx/lifecycle/u0;

    move-result-object p1

    sget-object v0, Lqm2/a;->a:Lqm2/a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :goto_1
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-static {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->o(Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;)Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Failed to fetch onboarding info"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e$c;->x:Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    invoke-virtual {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z()Landroidx/lifecycle/u0;

    move-result-object p1

    sget-object v0, Lqm2/a;->a:Lqm2/a;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
