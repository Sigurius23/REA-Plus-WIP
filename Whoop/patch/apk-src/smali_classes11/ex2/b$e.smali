.class final Lex2/b$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lex2/b;->h(ILq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"
    }
    d2 = {
        "<anonymous>",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignDetailsScreen$2"
    f = "LabsCampaignsRepository.kt"
    l = {
        0x81,
        0x8f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/domain/model/WhoopStrapInfo;

.field final synthetic F:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field final synthetic z:Lex2/b;


# direct methods
.method public constructor <init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lex2/b;",
            "Lcom/whoop/domain/model/WhoopStrapInfo;",
            "I",
            "Lq83/d<",
            "-",
            "Lex2/b$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$e;->z:Lex2/b;

    iput-object p2, p0, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    iput p3, p0, Lex2/b$e;->F:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lex2/b$e;

    iget-object v1, p0, Lex2/b$e;->z:Lex2/b;

    iget-object v2, p0, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    iget v3, p0, Lex2/b$e;->F:I

    invoke-direct {v0, v1, v2, v3, p1}, Lex2/b$e;-><init>(Lex2/b;Lcom/whoop/domain/model/WhoopStrapInfo;ILq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lex2/b$e;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lex2/b$e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lex2/b$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v7, p0

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Lex2/b$e;->y:I

    const/4 v9, 0x2

    const/4 v1, 0x1

    const/4 v10, 0x0

    if-eqz v0, :cond_2

    if-eq v0, v1, :cond_1

    if-ne v0, v9, :cond_0

    iget-object v0, v7, Lex2/b$e;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget-object v0, v7, Lex2/b$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto/16 :goto_5

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v7, Lex2/b$e;->z:Lex2/b;

    invoke-static {v0}, Lex2/b;->b(Lex2/b;)Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;

    move-result-object v0

    iget-object v2, v7, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getHardwareVersion()Loh2/c;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Loh2/c;->d()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_3
    move-object v2, v10

    :goto_0
    iget-object v3, v7, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v3, :cond_4

    invoke-virtual {v3}, Lcom/whoop/domain/model/WhoopStrapInfo;->getMaximVersion()Loh2/b;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v3}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :cond_4
    move-object v3, v10

    :goto_1
    iget-object v4, v7, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/whoop/domain/model/WhoopStrapInfo;->getBluetoothVersion()Loh2/b;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-interface {v4}, Loh2/b;->a()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_5
    move-object v4, v10

    :goto_2
    iget-object v5, v7, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSigProcVersion()Loh2/e;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Loh2/e;->f()Ljava/lang/String;

    move-result-object v5

    goto :goto_3

    :cond_6
    move-object v5, v10

    :goto_3
    iget-object v6, v7, Lex2/b$e;->E:Lcom/whoop/domain/model/WhoopStrapInfo;

    if-eqz v6, :cond_7

    invoke-virtual {v6}, Lcom/whoop/domain/model/WhoopStrapInfo;->getRawSerialNumber()Ljava/lang/String;

    move-result-object v6

    goto :goto_4

    :cond_7
    move-object v6, v10

    :goto_4
    iget v11, v7, Lex2/b$e;->F:I

    iput v1, v7, Lex2/b$e;->y:I

    move v1, v11

    invoke-interface/range {v0 .. v7}, Lcom/whoop/whooplabs/data/network/WhoopLabsBffApi;->fetchCampaignDetailsScreen(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    check-cast v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;

    new-instance v11, Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    iget v12, v7, Lex2/b$e;->F:I

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->getDescription()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_9

    const-string v1, ""

    :cond_9
    move-object v13, v1

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignDetailsScreenResponse;->getTitle()Ljava/lang/String;

    move-result-object v14

    const/16 v22, 0x3d8

    const/16 v23, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v11 .. v23}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/joda/time/LocalDateTime;Lcom/whoop/whooplabs/data/domain/LabsProtocol;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Lcom/whoop/whooplabs/data/domain/LabsSession;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v7, Lex2/b$e;->z:Lex2/b;

    invoke-static {v1}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v1

    iput-object v0, v7, Lex2/b$e;->w:Ljava/lang/Object;

    iput-object v10, v7, Lex2/b$e;->x:Ljava/lang/Object;

    iput v9, v7, Lex2/b$e;->y:I

    invoke-interface {v1, v11, v7}, Lfx2/a;->g(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_a

    :goto_6
    return-object v8

    :cond_a
    return-object v0
.end method
