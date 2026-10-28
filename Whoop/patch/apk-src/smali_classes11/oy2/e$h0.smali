.class final Loy2/e$h0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Loy2/e;->d1(ILcom/whoop/whooplabs/data/domain/SurveyProvider;)Lec3/l;
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
    c = "com.whoop.whooplabs.feature.campaignsteps.interactor.CampaignStepsInteractor$webViewSubmitted$1"
    f = "CampaignStepsInteractor.kt"
    l = {
        0x2df,
        0x2e0,
        0x2e8,
        0x2ed
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Loy2/e;

.field final synthetic G:I

.field final synthetic H:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Loy2/e;ILcom/whoop/whooplabs/data/domain/SurveyProvider;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Loy2/e;",
            "I",
            "Lcom/whoop/whooplabs/data/domain/SurveyProvider;",
            "Lq83/d<",
            "-",
            "Loy2/e$h0;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Loy2/e$h0;->F:Loy2/e;

    iput p2, p0, Loy2/e$h0;->G:I

    iput-object p3, p0, Loy2/e$h0;->H:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

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

    new-instance v0, Loy2/e$h0;

    iget-object v1, p0, Loy2/e$h0;->F:Loy2/e;

    iget v2, p0, Loy2/e$h0;->G:I

    iget-object v3, p0, Loy2/e$h0;->H:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-direct {v0, v1, v2, v3, p2}, Loy2/e$h0;-><init>(Loy2/e;ILcom/whoop/whooplabs/data/domain/SurveyProvider;Lq83/d;)V

    iput-object p1, v0, Loy2/e$h0;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Loy2/e$h0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Loy2/e$h0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Loy2/e$h0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Loy2/e$h0;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    move-object/from16 v1, p0

    iget-object v0, v1, Loy2/e$h0;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lec3/m;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v0, v1, Loy2/e$h0;->z:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v7, :cond_3

    if-eq v0, v6, :cond_2

    if-eq v0, v5, :cond_1

    if-ne v0, v4, :cond_0

    iget-object v0, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Exception;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v1, Loy2/e$h0;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    iget-object v0, v1, Loy2/e$h0;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget-object v0, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_4

    :catch_0
    move-exception v0

    goto/16 :goto_2

    :cond_2
    iget-object v0, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v6, p1

    goto :goto_1

    :cond_3
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object/from16 v0, p1

    goto :goto_0

    :cond_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    iget-object v0, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-static {v0}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v0

    iget v9, v1, Loy2/e$h0;->G:I

    iput-object v2, v1, Loy2/e$h0;->E:Ljava/lang/Object;

    iput v7, v1, Loy2/e$h0;->z:I

    invoke-virtual {v0, v9, v1}, Lex2/c;->p(ILq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    iget-object v7, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-static {v7}, Loy2/e;->G(Loy2/e;)Lex2/c;

    move-result-object v7

    iget v9, v1, Loy2/e$h0;->G:I

    iput-object v2, v1, Loy2/e$h0;->E:Ljava/lang/Object;

    iput-object v0, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    iput v6, v1, Loy2/e$h0;->z:I

    invoke-virtual {v7, v9, v1}, Lex2/c;->m(ILq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_6

    goto/16 :goto_3

    :cond_6
    :goto_1
    check-cast v6, Ljava/util/Collection;

    invoke-static {v6}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v6

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v7

    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v7

    move-object v9, v7

    check-cast v9, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    const/16 v22, 0xfbf

    const/16 v23, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v9 .. v23}, Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;->copy$default(Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;IIILorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepMysticReading;ZLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lorg/joda/time/DateTime;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;->getProtocolStep()I

    move-result v0

    invoke-virtual {v6, v0, v7}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    iget-object v0, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-static {v0}, Loy2/e;->A(Loy2/e;)Lbc3/c0;

    move-result-object v0

    new-instance v6, Loy2/e$h0$a;

    iget-object v9, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-direct {v6, v9, v7, v8}, Loy2/e$h0$a;-><init>(Loy2/e;Lcom/whoop/whooplabs/data/room/entity/ProtocolStepResult;Lq83/d;)V

    invoke-static {v0, v8, v8, v6, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, v1, Loy2/e$h0;->F:Loy2/e;

    iget-object v6, v1, Loy2/e$h0;->H:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-static {v0, v6}, Loy2/e;->W(Loy2/e;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    iget-object v0, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-static {v0}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v0

    const-string v6, "WebView submitted"

    invoke-virtual {v0, v6}, Loy2/f;->A(Ljava/lang/String;)V

    iget-object v0, v1, Loy2/e$h0;->F:Loy2/e;

    iget v6, v1, Loy2/e$h0;->G:I

    invoke-static {v0}, Loy2/e;->L(Loy2/e;)I

    move-result v7

    invoke-static {v0, v6, v7}, Loy2/e;->P(Loy2/e;II)Lec3/l;

    move-result-object v0

    iput-object v2, v1, Loy2/e$h0;->E:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->x:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->y:Ljava/lang/Object;

    iput v5, v1, Loy2/e$h0;->z:I

    invoke-static {v2, v0, v1}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-ne v0, v3, :cond_7

    goto :goto_3

    :goto_2
    invoke-interface {v1}, Lq83/d;->getContext()Lq83/j;

    move-result-object v5

    invoke-static {v5}, Lbc3/f0;->o(Lq83/j;)V

    iget-object v5, v1, Loy2/e$h0;->F:Loy2/e;

    iget-object v6, v1, Loy2/e$h0;->H:Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v5, v6, v7}, Loy2/e;->V(Loy2/e;Lcom/whoop/whooplabs/data/domain/SurveyProvider;Ljava/lang/String;)V

    iget-object v5, v1, Loy2/e$h0;->F:Loy2/e;

    invoke-static {v5}, Loy2/e;->H(Loy2/e;)Loy2/f;

    move-result-object v5

    const-string v6, "Error submitting webView"

    invoke-virtual {v5, v6, v0}, Loy2/f;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    sget-object v0, Loy2/l$m;->a:Loy2/l$m;

    iput-object v8, v1, Loy2/e$h0;->E:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->w:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->x:Ljava/lang/Object;

    iput-object v8, v1, Loy2/e$h0;->y:Ljava/lang/Object;

    iput v4, v1, Loy2/e$h0;->z:I

    invoke-interface {v2, v0, v1}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
