.class final Loy2/e$u;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->u0(Ljava/lang/String;)Lec3/l;
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$numberInputEntered$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x38a,
        0x38b,
        0x38e,
        0x38f
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Loy2/e;

.field final synthetic H:Ljava/lang/String;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Loy2/e;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Loy2/e$u;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$u;->G:Loy2/e;

    iput-object p2, p0, Loy2/e$u;->H:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Loy2/e$u;

    iget-object v1, p0, Loy2/e$u;->G:Loy2/e;

    iget-object v2, p0, Loy2/e$u;->H:Ljava/lang/String;

    invoke-direct {v0, v1, v2, p2}, Loy2/e$u;-><init>(Loy2/e;Ljava/lang/String;Lq83/d;)V

    iput-object p1, v0, Loy2/e$u;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$u;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$u;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$u;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$u;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v1, p0

    iget-object v0, v1, Loy2/e$u;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Loy2/e$u;->E:I

    const-string v4, "service"

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v3, :cond_4

    if-eq v3, v8, :cond_3

    if-eq v3, v7, :cond_2

    if-eq v3, v6, :cond_1

    if-ne v3, v5, :cond_0

    iget-object v0, v1, Loy2/e$u;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    iget-object v0, v1, Loy2/e$u;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Loy2/e$u;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_5

    :catch_0
    move-exception v0

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget v3, v1, Loy2/e$u;->z:I

    iget-object v6, v1, Loy2/e$u;->y:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    iget-object v6, v1, Loy2/e$u;->x:Ljava/lang/Object;

    check-cast v6, Ljava/util/List;

    iget-object v6, v1, Loy2/e$u;->w:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto/16 :goto_2

    :cond_2
    iget v3, v1, Loy2/e$u;->z:I

    iget-object v7, v1, Loy2/e$u;->w:Ljava/lang/Object;

    check-cast v7, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v8, v7

    move-object/from16 v7, p1

    goto :goto_1

    :cond_3
    iget v3, v1, Loy2/e$u;->z:I

    :try_start_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object/from16 v8, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_4
    iget-object v3, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v3}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/whoop/whooplabs/WhoopLabsService;->r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v3

    iget-object v10, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v10}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v10

    iput-object v0, v1, Loy2/e$u;->F:Ljava/lang/Object;

    iput v3, v1, Loy2/e$u;->z:I

    iput v8, v1, Loy2/e$u;->E:I

    invoke-virtual {v10, v3, v1}, Lex2/c;->p(ILq83/d;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v2, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v8, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v10, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v10}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v10

    iput-object v0, v1, Loy2/e$u;->F:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$u;->w:Ljava/lang/Object;

    iput v3, v1, Loy2/e$u;->z:I

    iput v7, v1, Loy2/e$u;->E:I

    invoke-virtual {v10, v3, v1}, Lex2/c;->m(ILq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast v7, Ljava/util/Collection;

    invoke-static {v7}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v7

    invoke-virtual {v8}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v10

    invoke-virtual {v7, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    iget-object v10, v1, Loy2/e$u;->H:Ljava/lang/String;

    invoke-static {v10}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v20

    const/16 v24, 0xeff

    const/16 v25, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v11 .. v25}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v8

    invoke-virtual {v7, v8, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v7, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v7}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v7

    iput-object v0, v1, Loy2/e$u;->F:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->y:Ljava/lang/Object;

    iput v3, v1, Loy2/e$u;->z:I

    iput v6, v1, Loy2/e$u;->E:I

    invoke-virtual {v7, v10, v1}, Lex2/c;->w(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v2, :cond_7

    goto :goto_3

    :cond_7
    :goto_2
    new-instance v6, Loy2/l$s;

    iget-object v7, v1, Loy2/e$u;->H:Ljava/lang/String;

    invoke-direct {v6, v7}, Loy2/l$s;-><init>(Ljava/lang/String;)V

    iput-object v9, v1, Loy2/e$u;->F:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->w:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->x:Ljava/lang/Object;

    iput-object v9, v1, Loy2/e$u;->y:Ljava/lang/Object;

    iput v3, v1, Loy2/e$u;->z:I

    iput v5, v1, Loy2/e$u;->E:I

    invoke-interface {v0, v6, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_9

    :goto_3
    return-object v2

    :cond_8
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_4
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v2, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v2}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v2

    iget-object v3, v1, Loy2/e$u;->G:Loy2/e;

    invoke-static {v3}, Loy2/e;->J(Loy2/e;)Lcom/whoop/whooplabs/WhoopLabsService;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lcom/whoop/whooplabs/WhoopLabsService;->r()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getCampaignId()I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Error saving number input entered "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v0}, Loy2/f;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_9
    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v9
.end method
