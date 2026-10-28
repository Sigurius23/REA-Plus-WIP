.class final Lcom/whoop/whooplabs/WhoopLabsService$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/whooplabs/WhoopLabsService;->onStartCommand(Landroid/content/Intent;II)I
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
    c = "com.whoop.whooplabs.WhoopLabsService$onStartCommand$1"
    f = "WhoopLabsService.kt"
    l = {
        0xa3,
        0xa8
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

.field final synthetic y:Lcom/whoop/whooplabs/WhoopLabsService;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/domain/LabsCampaign;",
            "Lcom/whoop/whooplabs/WhoopLabsService;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/WhoopLabsService$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iput-object p2, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcom/whoop/whooplabs/WhoopLabsService$h;

    iget-object v0, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget-object v1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/whooplabs/WhoopLabsService$h;-><init>(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/WhoopLabsService$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/WhoopLabsService$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/whooplabs/WhoopLabsService$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/whooplabs/WhoopLabsService$h;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    const/4 v1, 0x0

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->c(Lcom/whoop/whooplabs/WhoopLabsService;)Ltr2/n;

    move-result-object p1

    const-string v2, "Starting with intent"

    new-array v5, v1, [Lqr2/a$a;

    invoke-interface {p1, v2, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->c(Lcom/whoop/whooplabs/WhoopLabsService;)Ltr2/n;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getCampaignId()I

    move-result v2

    const-string v5, "updating study with campaignId "

    invoke-static {v2, v5}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->d(Lcom/whoop/whooplabs/WhoopLabsService;)Lyw2/h;

    move-result-object p1

    iget-object v1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->x:Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iput v3, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->w:I

    invoke-virtual {p1, v1, p0}, Lyw2/h;->Q(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->q()Lbc3/s;

    move-result-object p1

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v4}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->c(Lcom/whoop/whooplabs/WhoopLabsService;)Ltr2/n;

    move-result-object p1

    const-string v3, "Starting without campaign"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, v3, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->q()Lbc3/s;

    move-result-object p1

    check-cast p1, Lbc3/t;

    invoke-virtual {p1, v4}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    iget-object p1, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->y:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {p1}, Lcom/whoop/whooplabs/WhoopLabsService;->d(Lcom/whoop/whooplabs/WhoopLabsService;)Lyw2/h;

    move-result-object p1

    iput v2, p0, Lcom/whoop/whooplabs/WhoopLabsService$h;->w:I

    invoke-virtual {p1, p0}, Lyw2/h;->R(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    :goto_2
    return-object v4
.end method
