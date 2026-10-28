.class final Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->j(Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.workers.BtHrPeriodicCheckWorker$work$completed$1"
    f = "BtHrPeriodicCheckWorker.kt"
    l = {
        0x31,
        0x34,
        0x37
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

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

    new-instance p1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;

    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-direct {p1, v0, p2}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;-><init>(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->x:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v4, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-static {p1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->k(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Lcom/whoop/whooplabs/a;

    move-result-object p1

    iput v4, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->x:I

    invoke-virtual {p1, v5, p0}, Lcom/whoop/whooplabs/a;->c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-static {v1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->l(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v4, "dwl-android-bthr-periodic-upload"

    invoke-interface {v1, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-static {v1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->m(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Ltr2/n;

    move-result-object v1

    const-string v2, "Periodic BTHR upload enabled, uploading partial HR data"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v1, v2, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v5, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->w:Ljava/lang/Object;

    iput v3, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->x:I

    invoke-virtual {p1, p0}, Lcom/whoop/whooplabs/WhoopLabsService;->D(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    goto :goto_2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->y:Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;

    invoke-static {v1}, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;->m(Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker;)Ltr2/n;

    move-result-object v1

    const-string v3, "Periodic BTHR upload disabled, checking for end of collection and stale HR data"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v1, v3, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v5, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/whooplabs/workers/BtHrPeriodicCheckWorker$h;->x:I

    invoke-virtual {p1, p0}, Lcom/whoop/whooplabs/WhoopLabsService;->B(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
