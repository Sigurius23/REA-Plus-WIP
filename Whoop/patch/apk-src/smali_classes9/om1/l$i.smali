.class final Lom1/l$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lom1/l;->L(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lom1/j;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.view.dayZeroNotificationCards.domain.DayZeroNotificationCardsInteractor$reduceCustomizeAction$1$1"
    f = "DayZeroNotificationCardsInteractor.kt"
    l = {
        0x67,
        0x6a,
        0x6b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lom1/j;

.field final synthetic z:Lom1/l;


# direct methods
.method public constructor <init>(Lom1/j;Lom1/l;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lom1/j;",
            "Lom1/l;",
            "Lq83/d<",
            "-",
            "Lom1/l$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lom1/l$i;->y:Lom1/j;

    iput-object p2, p0, Lom1/l$i;->z:Lom1/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lom1/l$i;

    iget-object v1, p0, Lom1/l$i;->y:Lom1/j;

    iget-object v2, p0, Lom1/l$i;->z:Lom1/l;

    invoke-direct {v0, v1, v2, p2}, Lom1/l$i;-><init>(Lom1/j;Lom1/l;Lq83/d;)V

    iput-object p1, v0, Lom1/l$i;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lom1/l$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lom1/l$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lom1/l$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lom1/l$i;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lom1/l$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lom1/l$i;->w:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v5, :cond_1

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lom1/l$i;->y:Lom1/j;

    check-cast p1, Lom1/j$a;

    invoke-virtual {p1}, Lom1/j$a;->b()Ljava/lang/String;

    move-result-object p1

    const-string v2, "WHOOP_COACH_ONBOARDING"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Lom1/l$i;->z:Lom1/l;

    invoke-static {p1}, Lom1/l;->f(Lom1/l;)Lu92/d;

    move-result-object p1

    const-string v2, "WHOOP_COACH_ONBOARDING_COMPLETED"

    invoke-virtual {p1, v2, v5}, Lu92/d;->q(Ljava/lang/String;Z)V

    :cond_3
    iget-object p1, p0, Lom1/l$i;->z:Lom1/l;

    iget-object v2, p0, Lom1/l$i;->y:Lom1/j;

    check-cast v2, Lom1/j$a;

    invoke-virtual {v2}, Lom1/j$a;->c()Lcom/whoop/home/domain/models/DayZeroCardsViewState;

    move-result-object v2

    invoke-static {p1, v2}, Lom1/l;->c(Lom1/l;Lcom/whoop/home/domain/models/DayZeroCardsViewState;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    if-nez p1, :cond_4

    new-instance v6, Lom1/j$a;

    iget-object p1, p0, Lom1/l$i;->y:Lom1/j;

    check-cast p1, Lom1/j$a;

    invoke-virtual {p1}, Lom1/j$a;->c()Lcom/whoop/home/domain/models/DayZeroCardsViewState;

    move-result-object v7

    const/4 v10, 0x6

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v6 .. v11}, Lom1/j$a;-><init>(Lcom/whoop/home/domain/models/DayZeroCardsViewState;Lom1/i;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, p0, Lom1/l$i;->x:Ljava/lang/Object;

    iput v5, p0, Lom1/l$i;->w:I

    invoke-interface {v0, v6, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lom1/l$i;->z:Lom1/l;

    invoke-static {p1}, Lom1/l;->d(Lom1/l;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    sget-object v5, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_GLOW_HUG:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p1

    if-eqz p1, :cond_5

    iget-object p1, p0, Lom1/l$i;->z:Lom1/l;

    iget-object v3, p0, Lom1/l$i;->y:Lom1/j;

    check-cast v3, Lom1/j$a;

    iput-object v2, p0, Lom1/l$i;->x:Ljava/lang/Object;

    iput v4, p0, Lom1/l$i;->w:I

    invoke-static {p1, v0, v3, p0}, Lom1/l;->j(Lom1/l;Lec3/m;Lom1/j$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lom1/l$i;->z:Lom1/l;

    iget-object v4, p0, Lom1/l$i;->y:Lom1/j;

    check-cast v4, Lom1/j$a;

    iput-object v2, p0, Lom1/l$i;->x:Ljava/lang/Object;

    iput v3, p0, Lom1/l$i;->w:I

    invoke-static {p1, v0, v4, p0}, Lom1/l;->l(Lom1/l;Lec3/m;Lom1/j$a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
