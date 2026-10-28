.class final Loy2/e$i$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
        "Loy2/l;",
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$endStudy$2$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x3e3,
        0x3e7,
        0x3ea,
        0x3eb,
        0x3ec,
        0x3fb,
        0x40b,
        0x411
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field F:Z

.field G:I

.field private synthetic H:Ljava/lang/Object;

.field final synthetic I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

.field final synthetic J:Lex2/c;

.field final synthetic K:Loy2/e;

.field final synthetic L:Lcom/whoop/whooplabs/WhoopLabsService;

.field final synthetic M:Lzw2/b;

.field final synthetic N:Lzr2/a;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;Lzw2/b;Lzr2/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
            "Lex2/c;",
            "Loy2/e;",
            "Lcom/whoop/whooplabs/WhoopLabsService;",
            "Lzw2/b;",
            "Lzr2/a;",
            "Lq83/d<",
            "-",
            "Loy2/e$i$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$i$a;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iput-object p2, p0, Loy2/e$i$a;->J:Lex2/c;

    iput-object p3, p0, Loy2/e$i$a;->K:Loy2/e;

    iput-object p4, p0, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object p5, p0, Loy2/e$i$a;->M:Lzw2/b;

    iput-object p6, p0, Loy2/e$i$a;->N:Lzr2/a;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8
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

    new-instance v0, Loy2/e$i$a;

    iget-object v1, p0, Loy2/e$i$a;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v2, p0, Loy2/e$i$a;->J:Lex2/c;

    iget-object v3, p0, Loy2/e$i$a;->K:Loy2/e;

    iget-object v4, p0, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v5, p0, Loy2/e$i$a;->M:Lzw2/b;

    iget-object v6, p0, Loy2/e$i$a;->N:Lzr2/a;

    move-object v7, p2

    invoke-direct/range {v0 .. v7}, Loy2/e$i$a;-><init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;Lzw2/b;Lzr2/a;Lq83/d;)V

    iput-object p1, v0, Loy2/e$i$a;->H:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$i$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$i$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$i$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$i$a;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v1, p0

    const-string v0, "Error submitting study for campaignId: "

    const-string v2, "Session Submitted successfully, campaignId: "

    const-string v3, "Ending study for campaignId: "

    iget-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    check-cast v4, Lec3/m;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v1, Loy2/e$i$a;->G:I

    const-string v7, ", sessionId: "

    const/4 v8, 0x1

    const/4 v9, 0x0

    packed-switch v6, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    iget-object v0, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :pswitch_1
    iget v2, v1, Loy2/e$i$a;->E:I

    iget-object v0, v1, Loy2/e$i$a;->z:Ljava/lang/Object;

    check-cast v0, Lorg/joda/time/DateTime;

    iget-object v0, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    iget-object v0, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v0, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_8

    :catch_0
    move-exception v0

    goto/16 :goto_6

    :pswitch_2
    iget v3, v1, Loy2/e$i$a;->E:I

    iget-object v6, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    iget-object v10, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v10, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-object/from16 v10, p1

    goto/16 :goto_5

    :catch_1
    move-exception v0

    move v2, v3

    goto/16 :goto_6

    :pswitch_3
    iget v3, v1, Loy2/e$i$a;->E:I

    iget-object v6, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    iget-object v10, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v10, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto/16 :goto_4

    :pswitch_4
    iget v3, v1, Loy2/e$i$a;->E:I

    iget-object v6, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Integer;

    iget-object v10, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v10, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_3

    :pswitch_5
    iget v6, v1, Loy2/e$i$a;->E:I

    iget-object v10, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    move-object/from16 v11, p1

    goto :goto_1

    :catch_2
    move-exception v0

    move v2, v6

    goto/16 :goto_6

    :pswitch_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v6, Loy2/l$z;->a:Loy2/l$z;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput v8, v1, Loy2/e$i$a;->G:I

    invoke-interface {v4, v6, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_0

    goto/16 :goto_7

    :cond_0
    :goto_0
    iget-object v10, v1, Loy2/e$i$a;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    const/16 v20, 0xff

    const/16 v21, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x1

    invoke-static/range {v10 .. v21}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->copy$default(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/whoop/whooplabs/data/room/entity/StudyStatus;ILjava/lang/String;IZILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v10

    iget-object v6, v1, Loy2/e$i$a;->I:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    invoke-virtual {v6}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v6

    :try_start_5
    iget-object v11, v1, Loy2/e$i$a;->J:Lex2/c;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput v6, v1, Loy2/e$i$a;->E:I

    const/4 v12, 0x2

    iput v12, v1, Loy2/e$i$a;->G:I

    invoke-virtual {v11, v6, v1}, Lex2/c;->o(ILq83/d;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v5, :cond_1

    goto/16 :goto_7

    :cond_1
    :goto_1
    invoke-static {v11}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v11, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getCampaign()Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/domain/LabsCampaign;->getSession()Lcom/whoop/whooplabs/data/domain/LabsSession;

    move-result-object v11

    if-eqz v11, :cond_2

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/domain/LabsSession;->getCampaignSessionId()I

    move-result v11

    new-instance v12, Ljava/lang/Integer;

    invoke-direct {v12, v11}, Ljava/lang/Integer;-><init>(I)V

    goto :goto_2

    :cond_2
    move-object v12, v9

    :goto_2
    iget-object v11, v1, Loy2/e$i$a;->K:Loy2/e;

    invoke-static {v11}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v11

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v11, v3}, Loy2/f;->A(Ljava/lang/String;)V

    iget-object v3, v1, Loy2/e$i$a;->J:Lex2/c;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput v6, v1, Loy2/e$i$a;->E:I

    const/4 v11, 0x3

    iput v11, v1, Loy2/e$i$a;->G:I

    invoke-virtual {v3, v10, v1}, Lex2/c;->x(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    if-ne v3, v5, :cond_3

    goto/16 :goto_7

    :cond_3
    move v3, v6

    move-object v6, v12

    :goto_3
    :try_start_6
    iget-object v10, v1, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v6, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput v3, v1, Loy2/e$i$a;->E:I

    const/4 v11, 0x4

    iput v11, v1, Loy2/e$i$a;->G:I

    invoke-virtual {v10, v1}, Lcom/whoop/whooplabs/WhoopLabsService;->n(Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_4

    goto/16 :goto_7

    :cond_4
    :goto_4
    iget-object v10, v1, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v6, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput v3, v1, Loy2/e$i$a;->E:I

    const/4 v11, 0x5

    iput v11, v1, Loy2/e$i$a;->G:I

    invoke-virtual {v10, v1}, Lcom/whoop/whooplabs/WhoopLabsService;->w(Lq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_5

    goto/16 :goto_7

    :cond_5
    :goto_5
    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    iget-object v11, v1, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-virtual {v11}, Lcom/whoop/whooplabs/WhoopLabsService;->r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getStartTime()Lorg/joda/time/DateTime;

    move-result-object v11
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_1

    const-string v12, "Session ID"

    const-string v13, "Day Number"

    if-eqz v10, :cond_7

    :try_start_7
    iget-object v0, v1, Loy2/e$i$a;->K:Loy2/e;

    invoke-static {v0}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v0

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Loy2/f;->A(Ljava/lang/String;)V

    if-eqz v11, :cond_6

    iget-object v0, v1, Loy2/e$i$a;->M:Lzw2/b;

    iget-object v2, v1, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v7, v1, Loy2/e$i$a;->N:Lzr2/a;

    new-instance v14, Lzw2/a$i;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/WhoopLabsService;->r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v11}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-interface {v7}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v7

    invoke-static {v2, v7}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/Days;->getDays()I

    move-result v2

    add-int/2addr v2, v8

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v12, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v17

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v14 .. v19}, Lzw2/a$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v14}, Lzw2/b;->a(Lzw2/a;)V

    :cond_6
    sget-object v0, Loy2/l$x;->a:Loy2/l$x;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->z:Ljava/lang/Object;

    iput v3, v1, Loy2/e$i$a;->E:I

    iput-boolean v10, v1, Loy2/e$i$a;->F:Z

    const/4 v2, 0x6

    iput v2, v1, Loy2/e$i$a;->G:I

    invoke-interface {v4, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_9

    goto/16 :goto_7

    :cond_7
    iget-object v2, v1, Loy2/e$i$a;->K:Loy2/e;

    invoke-static {v2}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v2

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Loy2/f;->A(Ljava/lang/String;)V

    if-eqz v11, :cond_8

    iget-object v0, v1, Loy2/e$i$a;->M:Lzw2/b;

    iget-object v2, v1, Loy2/e$i$a;->L:Lcom/whoop/whooplabs/WhoopLabsService;

    iget-object v7, v1, Loy2/e$i$a;->N:Lzr2/a;

    new-instance v14, Lzw2/a$f;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/WhoopLabsService;->r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v11}, Lorg/joda/time/DateTime;->toLocalDate()Lorg/joda/time/LocalDate;

    move-result-object v2

    invoke-interface {v7}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v7

    invoke-static {v2, v7}, Lorg/joda/time/Days;->daysBetween(Lorg/joda/time/ReadablePartial;Lorg/joda/time/ReadablePartial;)Lorg/joda/time/Days;

    move-result-object v2

    invoke-virtual {v2}, Lorg/joda/time/Days;->getDays()I

    move-result v2

    add-int/2addr v2, v8

    new-instance v7, Ljava/lang/Integer;

    invoke-direct {v7, v2}, Ljava/lang/Integer;-><init>(I)V

    new-instance v2, Ll83/k;

    invoke-direct {v2, v13, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v12, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v2, v7}, [Ll83/k;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v17

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v14 .. v19}, Lzw2/a$f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v14}, Lzw2/b;->a(Lzw2/a;)V

    :cond_8
    sget-object v0, Loy2/l$m;->a:Loy2/l$m;

    iput-object v4, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->z:Ljava/lang/Object;

    iput v3, v1, Loy2/e$i$a;->E:I

    iput-boolean v10, v1, Loy2/e$i$a;->F:Z

    const/4 v2, 0x7

    iput v2, v1, Loy2/e$i$a;->G:I

    invoke-interface {v4, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    if-ne v0, v5, :cond_9

    goto :goto_7

    :goto_6
    iget-object v3, v1, Loy2/e$i$a;->K:Loy2/e;

    invoke-static {v3}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v3

    const-string v6, "Error submitting study"

    invoke-virtual {v3, v6, v0}, Loy2/f;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Loy2/l$m;->a:Loy2/l$m;

    iput-object v9, v1, Loy2/e$i$a;->H:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->y:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$i$a;->z:Ljava/lang/Object;

    iput v2, v1, Loy2/e$i$a;->E:I

    const/16 v2, 0x8

    iput v2, v1, Loy2/e$i$a;->G:I

    invoke-interface {v4, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_9

    :goto_7
    return-object v5

    :cond_9
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
