.class final Lnq0/i$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lnq0/i;->I0()V
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
    c = "com.whoop.community.presentation.landing.CommunityLandingViewModel$loadUserTeams$1"
    f = "CommunityLandingViewModel.kt"
    l = {
        0x7e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lnq0/i;


# direct methods
.method public constructor <init>(Lnq0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnq0/i;",
            "Lq83/d<",
            "-",
            "Lnq0/i$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lnq0/i$i;->x:Lnq0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lnq0/i$i;

    iget-object v0, p0, Lnq0/i$i;->x:Lnq0/i;

    invoke-direct {p1, v0, p2}, Lnq0/i$i;-><init>(Lnq0/i;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lnq0/i$i;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lnq0/i$i;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lnq0/i$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lnq0/i$i;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lnq0/i$i;->w:I

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

    iget-object p1, p0, Lnq0/i$i;->x:Lnq0/i;

    iput v2, p0, Lnq0/i$i;->w:I

    invoke-virtual {p1, p0}, Lnq0/i;->y0(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    move-object v1, p1

    check-cast v1, Lcom/whoop/domain/model/User;

    if-eqz v1, :cond_5

    iget-object p1, p0, Lnq0/i$i;->x:Lnq0/i;

    invoke-static {p1}, Lnq0/i;->R(Lnq0/i;)Lcq0/g;

    move-result-object v0

    invoke-static {p1}, Lnq0/i;->K(Lnq0/i;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnq0/i;->v0()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnq0/i;->k0()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lnq0/i;->m0()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {v0 .. v5}, Lcq0/g;->Q(Lcom/whoop/domain/model/User;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-static {p1, v0}, Lnq0/i;->Z(Lnq0/i;Landroidx/lifecycle/p0;)V

    invoke-static {p1}, Lnq0/i;->P(Lnq0/i;)Landroidx/lifecycle/p0;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_4

    invoke-static {p1}, Lnq0/i;->Q(Lnq0/i;)Landroidx/lifecycle/v0;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    invoke-static {p1}, Lnq0/i;->R(Lnq0/i;)Lcq0/g;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcq0/g;->M(Lcom/whoop/domain/model/User;)Landroidx/lifecycle/p0;

    move-result-object v0

    invoke-static {p1, v0}, Lnq0/i;->Y(Lnq0/i;Landroidx/lifecycle/p0;)V

    invoke-static {p1}, Lnq0/i;->M(Lnq0/i;)Landroidx/lifecycle/p0;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-static {p1}, Lnq0/i;->I(Lnq0/i;)Landroidx/lifecycle/v0;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/p0;->observeForever(Landroidx/lifecycle/v0;)V

    goto :goto_1

    :cond_3
    const-string p1, "pendingTeamInviteLiveData"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    const-string p1, "teamLiveData"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
