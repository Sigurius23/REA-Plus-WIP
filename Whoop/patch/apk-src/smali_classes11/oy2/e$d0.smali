.class final Loy2/e$d0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->a1(ILjava/lang/Integer;)Lec3/l;
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
        "Ldc3/u;",
        "Loy2/l;",
        "Ll83/a0;",
        "<anonymous>",
        "(Ldc3/u;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$setup$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x23f,
        0x249,
        0x24c,
        0x24d,
        0x24f,
        0x250,
        0x25a,
        0x260,
        0x268,
        0x269,
        0x26c,
        0x26f,
        0x279,
        0x27b,
        0x27d,
        0x28c,
        0x28e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:I

.field J:I

.field K:I

.field private synthetic L:Ljava/lang/Object;

.field final synthetic M:Loy2/e;

.field final synthetic N:I

.field final synthetic O:Ljava/lang/Integer;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Loy2/e;ILjava/lang/Integer;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "I",
            "Ljava/lang/Integer;",
            "Lq83/d<",
            "-",
            "Loy2/e$d0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$d0;->M:Loy2/e;

    iput p2, p0, Loy2/e$d0;->N:I

    iput-object p3, p0, Loy2/e$d0;->O:Ljava/lang/Integer;

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

    new-instance v0, Loy2/e$d0;

    iget-object v1, p0, Loy2/e$d0;->M:Loy2/e;

    iget v2, p0, Loy2/e$d0;->N:I

    iget-object v3, p0, Loy2/e$d0;->O:Ljava/lang/Integer;

    invoke-direct {v0, v1, v2, v3, p2}, Loy2/e$d0;-><init>(Loy2/e;ILjava/lang/Integer;Lq83/d;)V

    iput-object p1, v0, Loy2/e$d0;->L:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldc3/u;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Loy2/e$d0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$d0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$d0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$d0;->invoke(Ldc3/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    const-string v0, "StrapInfo is not available, cannot start study. CampaignId: "

    iget-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    check-cast v2, Ldc3/u;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v1, Loy2/e$d0;->K:I

    const/4 v5, 0x0

    const-string v6, ", sessionId: "

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_11

    :pswitch_1
    iget-object v0, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_d

    :pswitch_2
    iget-object v0, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v0, Loy2/l$b;

    :pswitch_3
    iget-object v0, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v0, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v0, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_d

    :catch_0
    move-exception v0

    goto/16 :goto_e

    :pswitch_4
    iget v0, v1, Loy2/e$d0;->I:I

    iget-object v4, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v4, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v4, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v4, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v4, p1

    goto/16 :goto_c

    :pswitch_5
    iget v0, v1, Loy2/e$d0;->I:I

    iget-object v4, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v6, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v8, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v8, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v8, Loy2/e;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_b

    :pswitch_6
    iget v0, v1, Loy2/e$d0;->J:I

    iget v4, v1, Loy2/e$d0;->I:I

    iget-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v6, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v8, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v9, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v9, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v9, Loy2/e;

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v14, v8

    move-object v8, v9

    goto/16 :goto_a

    :pswitch_7
    iget v0, v1, Loy2/e$d0;->J:I

    iget v4, v1, Loy2/e$d0;->I:I

    iget-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v8, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v8, Ljava/util/List;

    iget-object v9, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v11, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v12, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Integer;

    iget-object v13, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v13, Loy2/e;

    :try_start_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    move-object/from16 v16, v6

    move-object v14, v10

    move-object v6, v13

    move-object v10, v5

    move-object v13, v9

    move-object v5, v11

    move-object v11, v8

    move v8, v4

    move v4, v0

    move-object/from16 v0, p1

    goto/16 :goto_9

    :pswitch_8
    iget v0, v1, Loy2/e$d0;->J:I

    iget v4, v1, Loy2/e$d0;->I:I

    iget-object v5, v1, Loy2/e$d0;->H:Ljava/lang/Object;

    check-cast v5, Loy2/e;

    iget-object v8, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    check-cast v8, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v9, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v12, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v13, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    iget-object v14, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v14, Loy2/e;

    :try_start_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    move-object/from16 v16, v6

    move-object v6, v14

    move-object v14, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v10

    move-object v10, v9

    move-object v9, v8

    move v8, v4

    move v4, v0

    move-object/from16 v0, p1

    goto/16 :goto_8

    :pswitch_9
    iget v4, v1, Loy2/e$d0;->J:I

    iget v8, v1, Loy2/e$d0;->I:I

    iget-object v9, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v10, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v11, Ljava/util/List;

    iget-object v12, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v13, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v13, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v14, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v14, Ljava/lang/Integer;

    iget-object v15, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v15, Loy2/e;

    :try_start_6
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_6
    .catch Ljava/lang/Exception; {:try_start_6 .. :try_end_6} :catch_0

    move-object v5, v15

    goto/16 :goto_5

    :pswitch_a
    iget v4, v1, Loy2/e$d0;->J:I

    iget v8, v1, Loy2/e$d0;->I:I

    iget-object v9, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    check-cast v9, Ljava/util/List;

    iget-object v10, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v11, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v11, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v12, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v12, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v13, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v13, Ljava/lang/Integer;

    iget-object v14, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v14, Loy2/e;

    :try_start_7
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_0

    move-object v5, v10

    move-object v10, v9

    move-object v9, v13

    move-object v13, v12

    move-object v12, v11

    move-object v11, v5

    move-object/from16 v5, p1

    goto/16 :goto_4

    :pswitch_b
    iget v4, v1, Loy2/e$d0;->J:I

    iget v8, v1, Loy2/e$d0;->I:I

    iget-object v9, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    iget-object v10, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v10, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v11, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v11, Ljava/lang/Integer;

    iget-object v12, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v12, Loy2/e;

    :try_start_8
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_0

    move-object/from16 v13, p1

    move-object v14, v12

    goto/16 :goto_3

    :pswitch_c
    iget v4, v1, Loy2/e$d0;->J:I

    iget v8, v1, Loy2/e$d0;->I:I

    iget-object v9, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget-object v10, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Integer;

    iget-object v11, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    check-cast v11, Loy2/e;

    :try_start_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v10

    move-object/from16 v10, p1

    goto/16 :goto_2

    :pswitch_d
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_9
    .catch Ljava/lang/Exception; {:try_start_9 .. :try_end_9} :catch_0

    move-object/from16 v4, p1

    goto/16 :goto_1

    :pswitch_e
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v4, v1, Loy2/e$d0;->M:Loy2/e;

    invoke-static {v4}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v4

    iget v8, v1, Loy2/e$d0;->N:I

    iget-object v9, v1, Loy2/e$d0;->O:Ljava/lang/Integer;

    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "Setting up steps for campaignId: "

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v8}, Loy2/f;->A(Ljava/lang/String;)V

    sget-object v4, Loy2/l$q;->a:Loy2/l$q;

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v8, 0x1

    iput v8, v1, Loy2/e$d0;->K:I

    move-object v8, v2

    check-cast v8, Ldc3/t;

    iget-object v8, v8, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v8, v4, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_0

    goto/16 :goto_10

    :cond_0
    :goto_0
    :try_start_a
    iget-object v4, v1, Loy2/e$d0;->M:Loy2/e;

    invoke-static {v4}, Loy2/e;->y(Loy2/e;)Lzw2/b;

    move-result-object v4

    new-instance v8, Lzw2/a$g;

    iget v9, v1, Loy2/e$d0;->N:I

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v10

    const-string v9, "Session ID"

    iget-object v11, v1, Loy2/e$d0;->O:Ljava/lang/Integer;

    new-instance v12, Ll83/k;

    invoke-direct {v12, v9, v11}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v12}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v11

    const/4 v12, 0x1

    const/4 v13, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v8 .. v13}, Lzw2/a$g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Lzw2/b;->a(Lzw2/a;)V

    iget-object v4, v1, Loy2/e$d0;->M:Loy2/e;

    invoke-static {v4}, Loy2/e;->F(Loy2/e;)Lex2/b;

    move-result-object v4

    iget v8, v1, Loy2/e$d0;->N:I

    iget-object v9, v1, Loy2/e$d0;->O:Ljava/lang/Integer;

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v10, 0x2

    iput v10, v1, Loy2/e$d0;->K:I

    invoke-virtual {v4, v8, v9, v1}, Lex2/b;->n(ILjava/lang/Integer;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_1

    goto/16 :goto_10

    :cond_1
    :goto_1
    iget-object v11, v1, Loy2/e$d0;->M:Loy2/e;

    iget v8, v1, Loy2/e$d0;->N:I

    iget-object v9, v1, Loy2/e$d0;->O:Ljava/lang/Integer;

    check-cast v4, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    if-eqz v4, :cond_12

    invoke-static {v11}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v10

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v4, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v5, v1, Loy2/e$d0;->J:I

    const/4 v12, 0x3

    iput v12, v1, Loy2/e$d0;->K:I

    invoke-virtual {v10, v8, v1}, Lex2/c;->o(ILq83/d;)Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v3, :cond_2

    goto/16 :goto_10

    :cond_2
    move-object v12, v9

    move-object v9, v4

    move v4, v5

    :goto_2
    invoke-static {v10}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v10, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;

    invoke-static {v11}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v13

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/4 v14, 0x4

    iput v14, v1, Loy2/e$d0;->K:I

    invoke-virtual {v13, v8, v1}, Lex2/c;->m(ILq83/d;)Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v3, :cond_3

    goto/16 :goto_10

    :cond_3
    move-object v14, v10

    move-object v10, v9

    move-object v9, v14

    move-object v14, v11

    move-object v11, v12

    :goto_3
    check-cast v13, Ljava/util/Collection;

    invoke-static {v13}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v12

    invoke-virtual {v9}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getProtocolSteps()Ljava/util/List;

    move-result-object v13

    invoke-static {v14}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v15

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v13, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/4 v5, 0x5

    iput v5, v1, Loy2/e$d0;->K:I

    invoke-virtual {v15, v8, v1}, Lex2/c;->p(ILq83/d;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v3, :cond_4

    goto/16 :goto_10

    :cond_4
    move-object/from16 v18, v12

    move-object v12, v9

    move-object v9, v11

    move-object/from16 v11, v18

    move-object/from16 v18, v13

    move-object v13, v10

    move-object/from16 v10, v18

    :goto_4
    invoke-static {v5}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v5, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    new-instance v15, Loy2/l$w;

    invoke-virtual {v13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v7

    invoke-direct {v15, v7}, Loy2/l$w;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v13, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/4 v7, 0x6

    iput v7, v1, Loy2/e$d0;->K:I

    move-object v7, v2

    check-cast v7, Ldc3/t;

    iget-object v7, v7, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v7, v15, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v3, :cond_5

    goto/16 :goto_10

    :cond_5
    move-object/from16 v18, v9

    move-object v9, v5

    move-object v5, v14

    move-object/from16 v14, v18

    :goto_5
    invoke-static {v5}, Loy2/e;->N(Loy2/e;)Lci2/b;

    move-result-object v7

    invoke-interface {v7}, Lci2/b;->b()Lec3/t1;

    move-result-object v7

    invoke-interface {v7}, Lec3/t1;->getReplayCache()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    if-nez v7, :cond_6

    invoke-virtual {v13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->isStrapRequired()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-static {v5}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v5

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Loy2/f;->A(Ljava/lang/String;)V

    new-instance v0, Loy2/l$l;

    invoke-direct {v0, v8, v14}, Loy2/l$l;-><init>(ILjava/lang/Integer;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput v4, v1, Loy2/e$d0;->I:I

    const/4 v4, 0x7

    iput v4, v1, Loy2/e$d0;->K:I

    move-object v4, v2

    check-cast v4, Ldc3/t;

    iget-object v4, v4, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v4, v0, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_10

    goto/16 :goto_10

    :cond_6
    invoke-virtual {v13}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;->getDataTypes()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v7, v0, Ljava/util/Collection;

    if-eqz v7, :cond_7

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_7

    :cond_7
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    const-string v15, "labrador"

    move-object/from16 p1, v0

    const/4 v0, 0x0

    invoke-static {v7, v15, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v7

    if-eqz v7, :cond_8

    invoke-static {v5}, Loy2/e;->E(Loy2/e;)Lgt0/e;

    move-result-object v0

    invoke-interface {v0}, Lgt0/e;->a()Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Loy2/l$n;->a:Loy2/l$n;

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput v4, v1, Loy2/e$d0;->I:I

    const/16 v4, 0x8

    iput v4, v1, Loy2/e$d0;->K:I

    move-object v4, v2

    check-cast v4, Ldc3/t;

    iget-object v4, v4, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v4, v0, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_10

    goto/16 :goto_10

    :cond_8
    move-object/from16 v0, p1

    goto :goto_6

    :cond_9
    :goto_7
    invoke-static {v5}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v0

    invoke-virtual {v12}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getCampaign()Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object v7

    new-instance v15, Ljava/lang/StringBuilder;

    invoke-direct {v15}, Ljava/lang/StringBuilder;-><init>()V

    move-object/from16 v16, v6

    const-string v6, "connecting service with campaign "

    invoke-virtual {v15, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v15, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v15}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0, v6}, Loy2/f;->A(Ljava/lang/String;)V

    invoke-static {v5}, Loy2/e;->K(Loy2/e;)Lcom/whoop/whooplabs/a;

    move-result-object v0

    invoke-virtual {v12}, Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;->getCampaign()Lcom/whoop/whooplabs/data/domain/LabsCampaign;

    move-result-object v6

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v13, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->H:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/16 v7, 0x9

    iput v7, v1, Loy2/e$d0;->K:I

    invoke-virtual {v0, v6, v1}, Lcom/whoop/whooplabs/a;->c(Lcom/whoop/whooplabs/data/domain/LabsCampaign;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_a

    goto/16 :goto_10

    :cond_a
    move-object v6, v5

    :goto_8
    check-cast v0, Lcom/whoop/whooplabs/WhoopLabsService;

    invoke-static {v5, v0}, Loy2/e;->X(Loy2/e;Lcom/whoop/whooplabs/WhoopLabsService;)V

    invoke-static {v6}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object v0

    if-eqz v0, :cond_11

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v6, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v13, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v12, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v11, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->H:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/16 v5, 0xa

    iput v5, v1, Loy2/e$d0;->K:I

    invoke-virtual {v0, v1}, Lcom/whoop/whooplabs/WhoopLabsService;->A(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto/16 :goto_10

    :cond_b
    move-object v5, v14

    move-object v14, v12

    move-object v12, v5

    move-object v5, v13

    move-object v13, v11

    move-object v11, v10

    move-object v10, v9

    :goto_9
    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_c

    invoke-static {v6}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v0

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v7, "Service failed to start study for campaignId: "

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object/from16 v7, v16

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Loy2/f;->A(Ljava/lang/String;)V

    invoke-static {v6, v8}, Loy2/e;->T(Loy2/e;I)V

    new-instance v0, Loy2/l$i;

    invoke-direct {v0, v8, v12}, Loy2/l$i;-><init>(ILjava/lang/Integer;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput v4, v1, Loy2/e$d0;->I:I

    const/16 v4, 0xb

    iput v4, v1, Loy2/e$d0;->K:I

    move-object v4, v2

    check-cast v4, Ldc3/t;

    iget-object v4, v4, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v4, v0, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_10

    goto/16 :goto_10

    :cond_c
    move-object/from16 v7, v16

    invoke-static {v6}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v0

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v15, "Study started for campaignId: "

    invoke-virtual {v9, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7}, Loy2/f;->A(Ljava/lang/String;)V

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;

    move-result-object v12

    new-instance v9, Loy2/l$v;

    invoke-direct/range {v9 .. v14}, Loy2/l$v;-><init>(Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Ljava/util/List;Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepConfigResponse;Ljava/util/List;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v6, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v13, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v10, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput v8, v1, Loy2/e$d0;->I:I

    iput v4, v1, Loy2/e$d0;->J:I

    const/16 v0, 0xc

    iput v0, v1, Loy2/e$d0;->K:I

    move-object v0, v2

    check-cast v0, Ldc3/t;

    iget-object v0, v0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, v9, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    goto/16 :goto_10

    :cond_d
    move v0, v4

    move v4, v8

    move-object v5, v10

    move-object v8, v6

    move-object v6, v13

    :goto_a
    invoke-static {v8, v4}, Loy2/e;->U(Loy2/e;I)V

    new-instance v4, Loy2/l$d0;

    invoke-virtual {v5}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v7

    invoke-direct {v4, v7}, Loy2/l$d0;-><init>(I)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v14, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v6, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput v0, v1, Loy2/e$d0;->I:I

    const/16 v7, 0xd

    iput v7, v1, Loy2/e$d0;->K:I

    move-object v7, v2

    check-cast v7, Ldc3/t;

    iget-object v7, v7, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v7, v4, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_e

    goto/16 :goto_10

    :cond_e
    move-object v4, v5

    move-object v5, v6

    move-object v6, v14

    :goto_b
    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput v0, v1, Loy2/e$d0;->I:I

    const/16 v7, 0xe

    iput v7, v1, Loy2/e$d0;->K:I

    invoke-static {v8, v4, v6, v5, v1}, Loy2/e;->C(Loy2/e;Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;Lcom/whoop/whooplabs/data/room/entity/RemoteCampaign;Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_f

    goto/16 :goto_10

    :cond_f
    :goto_c
    check-cast v4, Loy2/l$b;

    invoke-virtual {v4}, Loy2/l$b;->a()Loy2/b$f;

    move-result-object v4

    new-instance v5, Loy2/l$b;

    invoke-direct {v5, v4}, Loy2/l$b;-><init>(Loy2/b$f;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v7, 0x0

    iput-object v7, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v7, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput v0, v1, Loy2/e$d0;->I:I

    const/16 v0, 0xf

    iput v0, v1, Loy2/e$d0;->K:I

    move-object v0, v2

    check-cast v0, Ldc3/t;

    iget-object v0, v0, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v0, v5, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_10

    goto :goto_10

    :cond_10
    :goto_d
    const/4 v5, 0x0

    goto :goto_f

    :cond_11
    const-string v0, "service"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/16 v17, 0x0

    throw v17

    :cond_12
    new-instance v0, Ljava/io/IOException;

    const-string v4, "Couldn\'t retrieve campaign steps"

    invoke-direct {v0, v4}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_0

    :goto_e
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-static {v4}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v4, v1, Loy2/e$d0;->M:Loy2/e;

    invoke-static {v4}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v4

    const-string v5, "Error setting up steps"

    invoke-virtual {v4, v5, v0}, Loy2/f;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    iget-object v0, v1, Loy2/e$d0;->M:Loy2/e;

    iget v4, v1, Loy2/e$d0;->N:I

    invoke-static {v0, v4}, Loy2/e;->T(Loy2/e;I)V

    new-instance v0, Loy2/l$i;

    iget v4, v1, Loy2/e$d0;->N:I

    iget-object v5, v1, Loy2/e$d0;->O:Ljava/lang/Integer;

    invoke-direct {v0, v4, v5}, Loy2/l$i;-><init>(ILjava/lang/Integer;)V

    iput-object v2, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    const/4 v5, 0x0

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->G:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->H:Ljava/lang/Object;

    const/16 v4, 0x10

    iput v4, v1, Loy2/e$d0;->K:I

    move-object v4, v2

    check-cast v4, Ldc3/t;

    iget-object v4, v4, Ldc3/t;->z:Ldc3/h;

    invoke-interface {v4, v0, v1}, Ldc3/x;->t(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_13

    goto :goto_10

    :cond_13
    :goto_f
    iput-object v5, v1, Loy2/e$d0;->L:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->w:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->x:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->y:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->z:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->E:Ljava/lang/Object;

    iput-object v5, v1, Loy2/e$d0;->F:Ljava/lang/Object;

    const/16 v0, 0x11

    iput v0, v1, Loy2/e$d0;->K:I

    new-instance v0, Lou1/a;

    const/4 v4, 0x7

    invoke-direct {v0, v4}, Lou1/a;-><init>(I)V

    invoke-static {v2, v0, v1}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_14

    :goto_10
    return-object v3

    :cond_14
    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_3
        :pswitch_3
        :pswitch_8
        :pswitch_7
        :pswitch_3
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
