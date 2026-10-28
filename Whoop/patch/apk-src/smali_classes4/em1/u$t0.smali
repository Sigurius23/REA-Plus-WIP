.class final Lem1/u$t0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lem1/u;-><init>(Lgm1/f;Lil1/r;Lkl1/c;Lil1/p;Lsl1/d;Lul1/a;Lol1/b;Lam1/a;Lil1/i;Lil1/e;Lvl1/b;Ltl1/c;Lcm1/b;Lbm1/d;Ljl1/b;Lwl1/c;Lpl1/b;Lvh2/d;Lrg1/d;Lil1/w;Lll1/c;Lu92/c;Lz92/a;Lgt0/e;Lgl1/b;Lcom/whoop/data/repositories/NotificationRepository;Lcom/whoop/data/repositories/FeatureFlagChecker;La6/g;Lj02/r;Lbc3/c0;Lgm1/e;Lhj0/d;)V
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lsl1/a;",
        "it",
        "Ll83/a0;",
        "<anonymous>",
        "(Lsl1/a;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.home.presentation.HomeViewModel$strapIndicatorDomainResult$3"
    f = "HomeViewModel.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lem1/u;


# direct methods
.method public constructor <init>(Lem1/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lem1/u;",
            "Lq83/d<",
            "-",
            "Lem1/u$t0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lem1/u$t0;->y:Lem1/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Lem1/u$t0;

    iget-object v1, p0, Lem1/u$t0;->y:Lem1/u;

    invoke-direct {v0, v1, p2}, Lem1/u$t0;-><init>(Lem1/u;Lq83/d;)V

    iput-object p1, v0, Lem1/u$t0;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lsl1/a;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl1/a;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lem1/u$t0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lem1/u$t0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lem1/u$t0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lsl1/a;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lem1/u$t0;->f(Lsl1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Lem1/u$t0;->x:Ljava/lang/Object;

    check-cast v0, Lsl1/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lem1/u$t0;->w:I

    if-nez v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lem1/u$t0;->y:Lem1/u;

    invoke-static {p1}, Lem1/u;->u(Lem1/u;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v1, "droid-home-connectivity-indicator-analytics-fix"

    invoke-interface {p1, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v0}, Lsl1/a;->j()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lem1/u$t0;->y:Lem1/u;

    invoke-static {p1, v0}, Lem1/u;->P(Lem1/u;Lsl1/a;)V

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
