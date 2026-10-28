.class final Loy2/e$t;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->t0(II)Lec3/l;
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$nextStepClicked$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x2a1,
        0x2a3,
        0x2a4,
        0x2a9,
        0x2ad,
        0x2ad,
        0x2af,
        0x2b1,
        0x2b3,
        0x2b4,
        0x2b9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:I

.field G:I

.field H:I

.field private synthetic I:Ljava/lang/Object;

.field final synthetic J:Loy2/e;

.field final synthetic K:I

.field final synthetic L:I

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Loy2/e;IILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "II",
            "Lq83/d<",
            "-",
            "Loy2/e$t;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$t;->J:Loy2/e;

    iput p2, p0, Loy2/e$t;->K:I

    iput p3, p0, Loy2/e$t;->L:I

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

    new-instance v0, Loy2/e$t;

    iget-object v1, p0, Loy2/e$t;->J:Loy2/e;

    iget v2, p0, Loy2/e$t;->K:I

    iget v3, p0, Loy2/e$t;->L:I

    invoke-direct {v0, v1, v2, v3, p2}, Loy2/e$t;-><init>(Loy2/e;IILq83/d;)V

    iput-object p1, v0, Loy2/e$t;->I:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$t;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$t;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$t;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$t;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    move-object/from16 v6, p0

    const-string v0, "Next step clicked, stepId: "

    iget-object v1, v6, Loy2/e$t;->I:Ljava/lang/Object;

    move-object v7, v1

    check-cast v7, Lec3/m;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, v6, Loy2/e$t;->H:I

    const/4 v9, 0x0

    packed-switch v1, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_a

    :pswitch_1
    iget-object v0, v6, Loy2/e$t;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :pswitch_2
    iget-object v0, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v0, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto/16 :goto_8

    :pswitch_3
    iget v0, v6, Loy2/e$t;->G:I

    iget v1, v6, Loy2/e$t;->F:I

    iget-object v2, v6, Loy2/e$t;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v4, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_7

    :pswitch_4
    iget v0, v6, Loy2/e$t;->G:I

    iget v1, v6, Loy2/e$t;->F:I

    iget-object v2, v6, Loy2/e$t;->E:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v4, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_6

    :pswitch_5
    iget v0, v6, Loy2/e$t;->G:I

    iget v1, v6, Loy2/e$t;->F:I

    iget-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v4, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move/from16 v20, v0

    move-object v12, v3

    goto/16 :goto_5

    :pswitch_6
    iget v0, v6, Loy2/e$t;->G:I

    iget v1, v6, Loy2/e$t;->F:I

    iget-object v2, v6, Loy2/e$t;->E:Ljava/lang/Object;

    check-cast v2, Lec3/m;

    iget-object v3, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v3, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move v11, v0

    move-object/from16 v0, p1

    goto/16 :goto_4

    :pswitch_7
    iget v0, v6, Loy2/e$t;->F:I

    iget-object v1, v6, Loy2/e$t;->z:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v3, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object v10, v2

    move-object v2, v1

    move-object v1, v10

    move v10, v0

    goto/16 :goto_3

    :pswitch_8
    iget-object v1, v6, Loy2/e$t;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v2, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v3, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-object v4, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v4

    move-object/from16 v4, p1

    goto/16 :goto_2

    :pswitch_9
    iget-object v1, v6, Loy2/e$t;->x:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v2, v6, Loy2/e$t;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    :try_start_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v3, p1

    goto :goto_1

    :pswitch_a
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    move-object/from16 v1, p1

    goto :goto_0

    :pswitch_b
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_8
    iget-object v1, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v1}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v1

    iget v2, v6, Loy2/e$t;->K:I

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    const/4 v3, 0x1

    iput v3, v6, Loy2/e$t;->H:I

    invoke-virtual {v1, v2, v6}, Lex2/c;->o(ILq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_0

    goto/16 :goto_9

    :cond_0
    :goto_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-virtual {v1}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getProtocolSteps()Ljava/util/List;

    move-result-object v2

    iget-object v3, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v3}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v3

    iget v4, v6, Loy2/e$t;->K:I

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v1, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->x:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, v6, Loy2/e$t;->H:I

    invoke-virtual {v3, v4, v6}, Lex2/c;->p(ILq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_1

    goto/16 :goto_9

    :cond_1
    move-object/from16 v24, v2

    move-object v2, v1

    move-object/from16 v1, v24

    :goto_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v3, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v4, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v4}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v4

    iget v5, v6, Loy2/e$t;->K:I

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v1, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    const/4 v10, 0x3

    iput v10, v6, Loy2/e$t;->H:I

    invoke-virtual {v4, v5, v6}, Lex2/c;->m(ILq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_2

    goto/16 :goto_9

    :cond_2
    move-object/from16 v24, v3

    move-object v3, v1

    move-object v1, v2

    move-object/from16 v2, v24

    :goto_2
    check-cast v4, Ljava/util/Collection;

    invoke-static {v4}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v5

    iget-object v10, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v10}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v10

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/domain/ProtocolStepWithOptions;->getProtocolStep()Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move-result-object v11

    invoke-virtual {v11}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;->getId()I

    move-result v11

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v10, v0}, Loy2/f;->A(Ljava/lang/String;)V

    iget-object v0, v6, Loy2/e$t;->J:Loy2/e;

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v1, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v3, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v4, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput v5, v6, Loy2/e$t;->F:I

    const/4 v10, 0x4

    iput v10, v6, Loy2/e$t;->H:I

    invoke-static {v0, v5, v4, v6}, Loy2/e;->Y(Loy2/e;ILjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_3

    goto/16 :goto_9

    :cond_3
    move-object v10, v4

    move-object v4, v1

    move-object v1, v2

    move-object v2, v10

    move v10, v5

    :goto_3
    add-int/lit8 v11, v10, 0x1

    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v0

    if-ne v11, v0, :cond_6

    iget-object v0, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v0}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v2

    iget-object v3, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v3}, Loy2/e;->y(Loy2/e;)Lzw2/b;

    move-result-object v3

    iget-object v4, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v4}, Loy2/e;->D(Loy2/e;)Lzr2/a;

    move-result-object v4

    iget-object v5, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v5}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object v5

    if-eqz v5, :cond_5

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v7, v6, Loy2/e$t;->E:Ljava/lang/Object;

    iput v10, v6, Loy2/e$t;->F:I

    iput v11, v6, Loy2/e$t;->G:I

    const/4 v12, 0x5

    iput v12, v6, Loy2/e$t;->H:I

    invoke-virtual/range {v0 .. v6}, Loy2/e;->m0(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lex2/c;Lzw2/b;Lzr2/a;Lcom/whoop/whooplabs/WhoopLabsService;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_4

    goto/16 :goto_9

    :cond_4
    move-object v2, v7

    move v1, v10

    :goto_4
    check-cast v0, Lec3/l;

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->E:Ljava/lang/Object;

    iput v1, v6, Loy2/e$t;->F:I

    iput v11, v6, Loy2/e$t;->G:I

    const/4 v1, 0x6

    iput v1, v6, Loy2/e$t;->H:I

    invoke-static {v2, v0, v6}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    goto/16 :goto_9

    :cond_5
    const-string v0, "service"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9

    :cond_6
    new-instance v0, Loy2/l$d0;

    invoke-direct {v0, v11}, Loy2/l$d0;-><init>(I)V

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v1, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput v10, v6, Loy2/e$t;->F:I

    iput v11, v6, Loy2/e$t;->G:I

    const/4 v3, 0x7

    iput v3, v6, Loy2/e$t;->H:I

    invoke-interface {v7, v0, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_7

    goto/16 :goto_9

    :cond_7
    move-object v12, v1

    move v1, v10

    move/from16 v20, v11

    :goto_5
    const/16 v22, 0x17f

    const/16 v23, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-static/range {v12 .. v23}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->copy$default(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/whoop/whooplabs/data/room/entity/StudyStatus;ILjava/lang/String;IZILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v0

    move/from16 v11, v20

    iget-object v3, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v3}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v3

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v12, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->E:Ljava/lang/Object;

    iput v1, v6, Loy2/e$t;->F:I

    iput v11, v6, Loy2/e$t;->G:I

    const/16 v5, 0x8

    iput v5, v6, Loy2/e$t;->H:I

    invoke-virtual {v3, v0, v6}, Lex2/c;->x(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_8

    goto/16 :goto_9

    :cond_8
    move v0, v11

    move-object v3, v12

    :goto_6
    iget-object v5, v6, Loy2/e$t;->J:Loy2/e;

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v4, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v3, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v2, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->E:Ljava/lang/Object;

    iput v1, v6, Loy2/e$t;->F:I

    iput v0, v6, Loy2/e$t;->G:I

    const/16 v10, 0x9

    iput v10, v6, Loy2/e$t;->H:I

    invoke-static {v5, v0, v2, v6}, Loy2/e;->Z(Loy2/e;ILjava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v8, :cond_9

    goto :goto_9

    :cond_9
    :goto_7
    iget-object v5, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v5, v0, v4, v3, v2}, Loy2/e;->a0(Loy2/e;ILcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;)Lec3/l;

    move-result-object v2

    iput-object v7, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->E:Ljava/lang/Object;

    iput v1, v6, Loy2/e$t;->F:I

    iput v0, v6, Loy2/e$t;->G:I

    const/16 v0, 0xa

    iput v0, v6, Loy2/e$t;->H:I

    invoke-static {v7, v2, v6}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    if-ne v0, v8, :cond_a

    goto :goto_9

    :goto_8
    invoke-interface {v6}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v1, v6, Loy2/e$t;->J:Loy2/e;

    invoke-static {v1}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v1

    const-string v2, "Error loading study new step"

    invoke-virtual {v1, v2, v0}, Loy2/f;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    new-instance v0, Loy2/l$i;

    iget v1, v6, Loy2/e$t;->K:I

    iget v2, v6, Loy2/e$t;->L:I

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-direct {v0, v1, v3}, Loy2/l$i;-><init>(ILjava/lang/Integer;)V

    iput-object v9, v6, Loy2/e$t;->I:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->w:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->x:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->y:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->z:Ljava/lang/Object;

    iput-object v9, v6, Loy2/e$t;->E:Ljava/lang/Object;

    const/16 v1, 0xb

    iput v1, v6, Loy2/e$t;->H:I

    invoke-interface {v7, v0, v6}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_a

    :goto_9
    return-object v8

    :cond_a
    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_2
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
