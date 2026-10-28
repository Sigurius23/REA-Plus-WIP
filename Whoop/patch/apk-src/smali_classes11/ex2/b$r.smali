.class final Lex2/b$r;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->n(ILjava/lang/Integer;Lq83/d;)Ljava/lang/Object;
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
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$3"
    f = "LabsCampaignsRepository.kt"
    l = {
        0x124,
        0x12c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:I

.field final synthetic F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

.field w:Ljava/lang/Object;

.field x:I

.field private synthetic y:Ljava/lang/Object;

.field final synthetic z:Lex2/b;


# direct methods
.method public constructor <init>(Lex2/b;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/b;",
            "I",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
            "Lq83/d<",
            "-",
            "Lex2/b$r;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$r;->z:Lex2/b;

    iput p2, p0, Lex2/b$r;->E:I

    iput-object p3, p0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lex2/b$r;

    iget-object v1, p0, Lex2/b$r;->z:Lex2/b;

    iget v2, p0, Lex2/b$r;->E:I

    iget-object v3, p0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-direct {v0, v1, v2, v3, p2}, Lex2/b$r;-><init>(Lex2/b;ILcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;Lq83/d;)V

    iput-object p1, v0, Lex2/b$r;->y:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lex2/b$r;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$r;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lex2/b$r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lex2/b$r;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lex2/b$r;->y:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v0, Lex2/b$r;->x:I

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v3, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v1, v0, Lex2/b$r;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    goto :goto_0

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v3, v0, Lex2/b$r;->z:Lex2/b;

    invoke-static {v3}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v3

    iget v6, v0, Lex2/b$r;->E:I

    iput-object v1, v0, Lex2/b$r;->y:Ljava/lang/Object;

    iput v5, v0, Lex2/b$r;->x:I

    invoke-interface {v3, v6, v0}, Lfx2/a;->o(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_3

    goto :goto_2

    :cond_3
    :goto_0
    check-cast v1, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    if-nez v1, :cond_4

    iget v6, v0, Lex2/b$r;->E:I

    new-instance v5, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    const/16 v16, 0x3d8

    const/16 v17, 0x0

    const-string v7, ""

    const-string v8, ""

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v5 .. v17}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v5

    goto :goto_1

    :cond_4
    move-object v6, v1

    :goto_1
    iget-object v1, v0, Lex2/b$r;->z:Lex2/b;

    invoke-static {v1}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v1

    new-instance v3, Lcom/whoop/whooplabs/data/domain/LabsSession;

    iget-object v5, v0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getSession()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/SessionResponse;->getId()I

    move-result v5

    invoke-direct {v3, v5}, Lcom/whoop/whooplabs/data/domain/LabsSession;-><init>(I)V

    iget-object v5, v0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->getAdditionalDataCollection()Ljava/lang/Integer;

    move-result-object v13

    iget-object v5, v0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->getBthrAdditionalDataCollection()Ljava/lang/Integer;

    move-result-object v14

    iget-object v5, v0, Lex2/b$r;->F:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->getDataTypes()Ljava/util/List;

    move-result-object v15

    const/16 v17, 0x3f

    const/16 v18, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v6 .. v18}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->copy$default(Lcom/whoop/whooplabs/data/domain/LabsCampaign;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object v3

    const/4 v5, 0x0

    iput-object v5, v0, Lex2/b$r;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$r;->w:Ljava/lang/Object;

    iput v4, v0, Lex2/b$r;->x:I

    invoke-interface {v1, v3, v0}, Lfx2/a;->g(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    :goto_2
    return-object v2

    :cond_5
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
