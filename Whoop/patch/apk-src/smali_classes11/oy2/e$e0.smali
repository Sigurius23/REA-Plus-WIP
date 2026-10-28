.class final Loy2/e$e0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->b1(ILcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;)Lec3/l;
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
        "Loy2/l$b;",
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$showStep$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x29b,
        0x29c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

.field final synthetic G:I

.field final synthetic H:Loy2/e;

.field final synthetic I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

.field final synthetic J:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
            ">;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;ILoy2/e;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;",
            "I",
            "Loy2/e;",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;",
            ">;",
            "Lq83/d<",
            "-",
            "Loy2/e$e0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$e0;->F:Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iput p2, p0, Loy2/e$e0;->G:I

    iput-object p3, p0, Loy2/e$e0;->H:Loy2/e;

    iput-object p4, p0, Loy2/e$e0;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iput-object p5, p0, Loy2/e$e0;->J:Ljava/util/List;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Loy2/e$e0;

    iget-object v1, p0, Loy2/e$e0;->F:Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget v2, p0, Loy2/e$e0;->G:I

    iget-object v3, p0, Loy2/e$e0;->H:Loy2/e;

    iget-object v4, p0, Loy2/e$e0;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v5, p0, Loy2/e$e0;->J:Ljava/util/List;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Loy2/e$e0;-><init>(Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;ILoy2/e;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)V

    iput-object p1, v0, Loy2/e$e0;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$e0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$e0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$e0;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Loy2/e$e0;->E:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Loy2/e$e0;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Loy2/e$e0;->y:Ljava/lang/Object;

    check-cast v0, Loy2/b$f;

    iget-object v0, p0, Loy2/e$e0;->x:Ljava/lang/Object;

    check-cast v0, Loy2/m;

    iget-object v0, p0, Loy2/e$e0;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v2, p0, Loy2/e$e0;->x:Ljava/lang/Object;

    check-cast v2, Loy2/m;

    iget-object v2, p0, Loy2/e$e0;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Loy2/e$e0;->F:Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getProtocolSteps()Ljava/util/List;

    move-result-object p1

    iget v2, p0, Loy2/e$e0;->G:I

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    iget-object v2, p0, Loy2/e$e0;->H:Loy2/e;

    invoke-static {v2}, Loy2/e;->M(Loy2/e;)Ljava/util/Map;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getStepType()Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Loy2/m;

    if-eqz v2, :cond_5

    iget-object v6, p0, Loy2/e$e0;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v7, p0, Loy2/e$e0;->J:Ljava/util/List;

    iput-object v0, p0, Loy2/e$e0;->E:Ljava/lang/Object;

    iput-object v5, p0, Loy2/e$e0;->w:Ljava/lang/Object;

    iput-object v5, p0, Loy2/e$e0;->x:Ljava/lang/Object;

    iput v4, p0, Loy2/e$e0;->z:I

    invoke-interface {v2, p1, v6, v7, p0}, Loy2/m;->a(Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Loy2/b$f;

    new-instance v2, Loy2/l$b;

    invoke-direct {v2, p1}, Loy2/l$b;-><init>(Loy2/b$f;)V

    iput-object v5, p0, Loy2/e$e0;->E:Ljava/lang/Object;

    iput-object v5, p0, Loy2/e$e0;->w:Ljava/lang/Object;

    iput-object v5, p0, Loy2/e$e0;->x:Ljava/lang/Object;

    iput-object v5, p0, Loy2/e$e0;->y:Ljava/lang/Object;

    iput v3, p0, Loy2/e$e0;->z:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    :goto_1
    return-object v1

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getStepType()Lcom/whoop/whooplabs/data/domain/ProtocolStepType;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "No handler found for step type: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
