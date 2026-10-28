.class final Lex2/b$q;
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
    c = "com.whoop.whooplabs.data.repositories.LabsCampaignsRepository$fetchCampaignStepsScreen$2"
    f = "LabsCampaignsRepository.kt"
    l = {
        0xcc,
        0xd2,
        0xe1,
        0xed,
        0xfc,
        0x10b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:Ljava/lang/Object;

.field F:Ljava/lang/Object;

.field G:Ljava/lang/Object;

.field H:Ljava/lang/Object;

.field I:Ljava/lang/Object;

.field J:Ljava/lang/Object;

.field K:Ljava/lang/Object;

.field L:I

.field M:I

.field N:I

.field O:I

.field P:I

.field Q:I

.field R:I

.field final synthetic S:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

.field final synthetic T:I

.field final synthetic U:Lex2/b;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;ILex2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;",
            "I",
            "Lex2/b;",
            "Lq83/d<",
            "-",
            "Lex2/b$q;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lex2/b$q;->S:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iput p2, p0, Lex2/b$q;->T:I

    iput-object p3, p0, Lex2/b$q;->U:Lex2/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lex2/b$q;

    iget-object v0, p0, Lex2/b$q;->S:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    iget v1, p0, Lex2/b$q;->T:I

    iget-object v2, p0, Lex2/b$q;->U:Lex2/b;

    invoke-direct {p1, v0, v1, v2, p2}, Lex2/b$q;-><init>(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;ILex2/b;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lex2/b$q;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lex2/b$q;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lex2/b$q;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lex2/b$q;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 27

    move-object/from16 v0, p0

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lex2/b$q;->R:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget v2, v0, Lex2/b$q;->L:I

    iget-object v5, v0, Lex2/b$q;->G:Ljava/lang/Object;

    check-cast v5, Loy2/h;

    iget-object v5, v0, Lex2/b$q;->F:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    iget-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    check-cast v6, Lex2/b;

    iget-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :pswitch_1
    iget v2, v0, Lex2/b$q;->L:I

    iget-object v5, v0, Lex2/b$q;->G:Ljava/lang/Object;

    check-cast v5, Loy2/h;

    iget-object v5, v0, Lex2/b$q;->F:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    iget-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    check-cast v6, Lex2/b;

    iget-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget v2, v0, Lex2/b$q;->O:I

    iget v5, v0, Lex2/b$q;->N:I

    iget v6, v0, Lex2/b$q;->M:I

    iget v7, v0, Lex2/b$q;->L:I

    iget-object v8, v0, Lex2/b$q;->K:Ljava/lang/Object;

    check-cast v8, Loy2/k;

    iget-object v8, v0, Lex2/b$q;->I:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Lex2/b$q;->H:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v0, Lex2/b$q;->G:Ljava/lang/Object;

    check-cast v9, Loy2/h;

    iget-object v9, v0, Lex2/b$q;->F:Ljava/lang/Object;

    check-cast v9, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    iget-object v10, v0, Lex2/b$q;->z:Ljava/lang/Object;

    check-cast v10, Ljava/util/Iterator;

    iget-object v11, v0, Lex2/b$q;->y:Ljava/lang/Object;

    check-cast v11, Lex2/b;

    iget-object v12, v0, Lex2/b$q;->x:Ljava/lang/Object;

    check-cast v12, Ljava/lang/Iterable;

    iget-object v12, v0, Lex2/b$q;->w:Ljava/lang/Object;

    check-cast v12, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget v2, v0, Lex2/b$q;->L:I

    iget-object v5, v0, Lex2/b$q;->F:Ljava/lang/Object;

    check-cast v5, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    iget-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    check-cast v6, Lex2/b;

    iget-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Iterable;

    iget-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    check-cast v7, Ljava/util/List;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v0, Lex2/b$q;->S:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getSteps()Ljava/util/List;

    move-result-object v2

    iget v5, v0, Lex2/b$q;->T:I

    invoke-static {v2, v5}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponseKt;->toProtocolSteps(Ljava/util/List;I)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v5, v0, Lex2/b$q;->U:Lex2/b;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v6, v5

    move-object v5, v2

    move v2, v3

    :cond_0
    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    invoke-static {v6}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v8

    iput-object v4, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput v2, v0, Lex2/b$q;->L:I

    iput v3, v0, Lex2/b$q;->M:I

    const/4 v9, 0x1

    iput v9, v0, Lex2/b$q;->R:I

    invoke-interface {v8, v7, v0}, Lfx2/a;->G(Lcom/whoop/whooplabs/data/domain/ProtocolStep;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_0

    goto/16 :goto_7

    :cond_1
    iget-object v2, v0, Lex2/b$q;->S:Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;

    invoke-virtual {v2}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponse;->getSteps()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    iget-object v5, v0, Lex2/b$q;->U:Lex2/b;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move-object v6, v5

    move-object v5, v2

    move v2, v3

    :goto_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    invoke-static {v6}, Lex2/b;->c(Lex2/b;)Loy2/j;

    move-result-object v8

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getInputType()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getInputConfig()Ljava/util/Map;

    move-result-object v10

    invoke-virtual {v8, v9, v10}, Loy2/j;->a(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;Ljava/util/Map;)Loy2/h;

    move-result-object v8

    instance-of v9, v8, Loy2/h$c;

    if-eqz v9, :cond_3

    invoke-static {v6}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v9

    new-instance v10, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v11

    check-cast v8, Loy2/h$c;

    invoke-virtual {v8}, Loy2/h$c;->b()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v8}, Loy2/h$c;->e()Ljava/lang/Integer;

    move-result-object v13

    invoke-virtual {v8}, Loy2/h$c;->c()Ljava/lang/Integer;

    move-result-object v14

    invoke-virtual {v8}, Loy2/h$c;->f()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v8}, Loy2/h$c;->d()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v8}, Loy2/h$c;->a()Ljava/lang/String;

    move-result-object v17

    const/16 v19, 0x80

    const/16 v20, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v10 .. v20}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v4, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->G:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->H:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->I:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->J:Ljava/lang/Object;

    iput-object v4, v0, Lex2/b$q;->K:Ljava/lang/Object;

    iput v2, v0, Lex2/b$q;->L:I

    iput v3, v0, Lex2/b$q;->M:I

    const/4 v7, 0x2

    iput v7, v0, Lex2/b$q;->R:I

    invoke-interface {v9, v10, v0}, Lfx2/a;->f(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    :goto_2
    move v9, v3

    :goto_3
    move-object v7, v4

    goto/16 :goto_8

    :cond_3
    instance-of v9, v8, Loy2/h$e;

    if-eqz v9, :cond_7

    check-cast v8, Loy2/h$e;

    invoke-virtual {v8}, Loy2/h$e;->a()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    move-object v10, v5

    move-object v11, v6

    move-object v9, v7

    move v7, v2

    move v2, v3

    move v5, v2

    move v6, v5

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v2, 0x1

    if-ltz v2, :cond_5

    check-cast v12, Loy2/k;

    invoke-static {v11}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v14

    new-instance v15, Lcom/whoop/whooplabs/data/domain/OptionSelection;

    invoke-virtual {v9}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v3

    invoke-virtual {v12}, Loy2/k;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v12}, Loy2/k;->b()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v15, v3, v2, v4, v12}, Lcom/whoop/whooplabs/data/domain/OptionSelection;-><init>(IILjava/lang/String;Ljava/lang/String;)V

    const/4 v3, 0x0

    iput-object v3, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v11, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v10, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v9, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->G:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->H:Ljava/lang/Object;

    iput-object v8, v0, Lex2/b$q;->I:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->J:Ljava/lang/Object;

    iput-object v3, v0, Lex2/b$q;->K:Ljava/lang/Object;

    iput v7, v0, Lex2/b$q;->L:I

    iput v6, v0, Lex2/b$q;->M:I

    iput v5, v0, Lex2/b$q;->N:I

    iput v13, v0, Lex2/b$q;->O:I

    iput v2, v0, Lex2/b$q;->P:I

    const/4 v2, 0x0

    iput v2, v0, Lex2/b$q;->Q:I

    const/4 v2, 0x3

    iput v2, v0, Lex2/b$q;->R:I

    invoke-interface {v14, v15, v0}, Lfx2/a;->n(Lcom/whoop/whooplabs/data/domain/OptionSelection;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto/16 :goto_7

    :cond_4
    move v2, v13

    :goto_5
    const/4 v3, 0x0

    const/4 v4, 0x0

    goto :goto_4

    :cond_5
    invoke-static {}, Lwb3/f;->d0()V

    const/16 v17, 0x0

    throw v17

    :cond_6
    move v9, v3

    move v2, v7

    move-object v5, v10

    move-object v6, v11

    goto :goto_3

    :cond_7
    instance-of v3, v8, Loy2/h$d;

    if-eqz v3, :cond_9

    invoke-static {v6}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v3

    new-instance v18, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v19

    check-cast v8, Loy2/h$d;

    invoke-virtual {v8}, Loy2/h$d;->b()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v8}, Loy2/h$d;->e()Ljava/lang/Integer;

    move-result-object v21

    invoke-virtual {v8}, Loy2/h$d;->c()Ljava/lang/Integer;

    move-result-object v22

    invoke-virtual {v8}, Loy2/h$d;->f()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v8}, Loy2/h$d;->d()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v8}, Loy2/h$d;->a()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v8}, Loy2/h$d;->g()Ljava/lang/Integer;

    move-result-object v26

    invoke-direct/range {v18 .. v26}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v4, v18

    const/4 v7, 0x0

    iput-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->G:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->H:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->I:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->J:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->K:Ljava/lang/Object;

    iput v2, v0, Lex2/b$q;->L:I

    const/4 v7, 0x0

    iput v7, v0, Lex2/b$q;->M:I

    const/4 v7, 0x4

    iput v7, v0, Lex2/b$q;->R:I

    invoke-interface {v3, v4, v0}, Lfx2/a;->f(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_8

    goto/16 :goto_7

    :cond_8
    :goto_6
    const/4 v7, 0x0

    const/4 v9, 0x0

    goto/16 :goto_8

    :cond_9
    instance-of v3, v8, Loy2/h$f;

    if-eqz v3, :cond_a

    invoke-static {v6}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v3

    new-instance v18, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v19

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v4, v18

    const/4 v7, 0x0

    iput-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->G:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->H:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->I:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->J:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->K:Ljava/lang/Object;

    iput v2, v0, Lex2/b$q;->L:I

    const/4 v7, 0x0

    iput v7, v0, Lex2/b$q;->M:I

    const/4 v7, 0x5

    iput v7, v0, Lex2/b$q;->R:I

    invoke-interface {v3, v4, v0}, Lfx2/a;->f(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_8

    goto :goto_7

    :cond_a
    instance-of v3, v8, Loy2/h$a;

    if-eqz v3, :cond_b

    invoke-static {v6}, Lex2/b;->d(Lex2/b;)Lfx2/a;

    move-result-object v3

    new-instance v18, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;

    invoke-virtual {v7}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v19

    check-cast v8, Loy2/h$a;

    invoke-virtual {v8}, Loy2/h$a;->a()Ljava/lang/String;

    move-result-object v20

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v18 .. v26}, Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;-><init>(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    move-object/from16 v4, v18

    const/4 v7, 0x0

    iput-object v7, v0, Lex2/b$q;->w:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->x:Ljava/lang/Object;

    iput-object v6, v0, Lex2/b$q;->y:Ljava/lang/Object;

    iput-object v5, v0, Lex2/b$q;->z:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->E:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->F:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->G:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->H:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->I:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->J:Ljava/lang/Object;

    iput-object v7, v0, Lex2/b$q;->K:Ljava/lang/Object;

    iput v2, v0, Lex2/b$q;->L:I

    const/4 v9, 0x0

    iput v9, v0, Lex2/b$q;->M:I

    const/4 v8, 0x6

    iput v8, v0, Lex2/b$q;->R:I

    invoke-interface {v3, v4, v0}, Lfx2/a;->f(Lcom/whoop/whooplabs/data/domain/ProtocolStepConfig;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_d

    :goto_7
    return-object v1

    :cond_b
    const/4 v7, 0x0

    const/4 v9, 0x0

    sget-object v3, Loy2/h$b;->a:Loy2/h$b;

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    if-nez v8, :cond_c

    goto :goto_8

    :cond_c
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_d
    :goto_8
    move-object v4, v7

    move v3, v9

    goto/16 :goto_1

    :cond_e
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
