.class public final Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponseKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a\u001e\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u0008\u0012\u0004\u0012\u00020\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u0003H\u0002\u00a8\u0006\t"
    }
    d2 = {
        "toProtocolSteps",
        "",
        "Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
        "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
        "campaignId",
        "",
        "isInputRequired",
        "",
        "step",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private static final isInputRequired(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)Z
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getBtHrConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;->isRequired()Z

    move-result p0

    return p0

    :cond_0
    return v1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getInputConfig()Ljava/util/Map;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_2

    const-string v2, "required"

    invoke-interface {p0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_0

    :cond_2
    move-object p0, v0

    :goto_0
    instance-of v2, p0, Ljava/lang/Boolean;

    if-eqz v2, :cond_3

    move-object v0, p0

    check-cast v0, Ljava/lang/Boolean;

    :cond_3
    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_4
    return v1
.end method

.method public static final toProtocolSteps(Ljava/util/List;I)Ljava/util/List;
    .locals 52
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;",
            ">;I)",
            "Ljava/util/List<",
            "Lcom/whoop/whooplabs/data/domain/ProtocolStep;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "<this>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    move v7, v2

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v51, v7, 0x1

    const/4 v4, 0x0

    if-ltz v7, :cond_1c

    check-cast v3, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getId()I

    move-result v5

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getContent()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getWebViewUrl()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getWebViewTitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getImageAlt()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v11

    if-eqz v11, :cond_0

    const/4 v11, 0x1

    goto :goto_1

    :cond_0
    move v11, v2

    :goto_1
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isBthr()Ljava/lang/Boolean;

    move-result-object v12

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->isTimerActive()Ljava/lang/Boolean;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getSubtitle()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getCta()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v18

    if-eqz v18, :cond_1

    invoke-virtual/range {v18 .. v18}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicLabel()Ljava/lang/String;

    move-result-object v18

    goto :goto_2

    :cond_1
    move-object/from16 v18, v4

    :goto_2
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v19

    if-eqz v19, :cond_2

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicMax()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    move-object/from16 v22, v19

    goto :goto_3

    :cond_2
    move-object/from16 v22, v4

    :goto_3
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v19

    if-eqz v19, :cond_3

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicMin()I

    move-result v19

    invoke-static/range {v19 .. v19}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    move-object/from16 v23, v19

    goto :goto_4

    :cond_3
    move-object/from16 v23, v4

    :goto_4
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v19

    if-eqz v19, :cond_4

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicTooHighLabel()Ljava/lang/String;

    move-result-object v19

    move-object/from16 v20, v19

    goto :goto_5

    :cond_4
    move-object/from16 v20, v4

    :goto_5
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v19

    if-eqz v19, :cond_5

    invoke-virtual/range {v19 .. v19}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicTooLowLabel()Ljava/lang/String;

    move-result-object v19

    goto :goto_6

    :cond_5
    move-object/from16 v19, v4

    :goto_6
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v21

    if-eqz v21, :cond_6

    invoke-virtual/range {v21 .. v21}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicSuffix()Ljava/lang/String;

    move-result-object v21

    move-object/from16 v24, v21

    goto :goto_7

    :cond_6
    move-object/from16 v24, v4

    :goto_7
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v21

    if-eqz v21, :cond_7

    invoke-virtual/range {v21 .. v21}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getSystolicRequiredText()Ljava/lang/String;

    move-result-object v21

    goto :goto_8

    :cond_7
    move-object/from16 v21, v4

    :goto_8
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v25

    if-eqz v25, :cond_8

    invoke-virtual/range {v25 .. v25}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isSystolicRequired()Z

    move-result v25

    invoke-static/range {v25 .. v25}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v25

    goto :goto_9

    :cond_8
    move-object/from16 v25, v4

    :goto_9
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v26

    if-eqz v26, :cond_9

    invoke-virtual/range {v26 .. v26}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicLabel()Ljava/lang/String;

    move-result-object v26

    goto :goto_a

    :cond_9
    move-object/from16 v26, v4

    :goto_a
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v27

    if-eqz v27, :cond_a

    invoke-virtual/range {v27 .. v27}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicMax()I

    move-result v27

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v27

    move-object/from16 v30, v27

    goto :goto_b

    :cond_a
    move-object/from16 v30, v4

    :goto_b
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v27

    if-eqz v27, :cond_b

    invoke-virtual/range {v27 .. v27}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicMin()I

    move-result v27

    invoke-static/range {v27 .. v27}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v27

    move-object/from16 v31, v27

    goto :goto_c

    :cond_b
    move-object/from16 v31, v4

    :goto_c
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v27

    if-eqz v27, :cond_c

    invoke-virtual/range {v27 .. v27}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicTooHighLabel()Ljava/lang/String;

    move-result-object v27

    move-object/from16 v28, v27

    goto :goto_d

    :cond_c
    move-object/from16 v28, v4

    :goto_d
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v27

    if-eqz v27, :cond_d

    invoke-virtual/range {v27 .. v27}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicTooLowLabel()Ljava/lang/String;

    move-result-object v27

    goto :goto_e

    :cond_d
    move-object/from16 v27, v4

    :goto_e
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v29

    if-eqz v29, :cond_e

    invoke-virtual/range {v29 .. v29}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicSuffix()Ljava/lang/String;

    move-result-object v29

    move-object/from16 v32, v29

    goto :goto_f

    :cond_e
    move-object/from16 v32, v4

    :goto_f
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v29

    if-eqz v29, :cond_f

    invoke-virtual/range {v29 .. v29}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getDiastolicRequiredText()Ljava/lang/String;

    move-result-object v29

    goto :goto_10

    :cond_f
    move-object/from16 v29, v4

    :goto_10
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v33

    if-eqz v33, :cond_10

    invoke-virtual/range {v33 .. v33}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isDiastolicRequired()Z

    move-result v33

    invoke-static/range {v33 .. v33}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v33

    goto :goto_11

    :cond_10
    move-object/from16 v33, v4

    :goto_11
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v34

    if-eqz v34, :cond_11

    invoke-virtual/range {v34 .. v34}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrLabel()Ljava/lang/String;

    move-result-object v34

    goto :goto_12

    :cond_11
    move-object/from16 v34, v4

    :goto_12
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v35

    if-eqz v35, :cond_12

    invoke-virtual/range {v35 .. v35}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrMax()I

    move-result v35

    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v35

    move-object/from16 v38, v35

    goto :goto_13

    :cond_12
    move-object/from16 v38, v4

    :goto_13
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v35

    if-eqz v35, :cond_13

    invoke-virtual/range {v35 .. v35}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrMin()I

    move-result v35

    invoke-static/range {v35 .. v35}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v35

    move-object/from16 v39, v35

    goto :goto_14

    :cond_13
    move-object/from16 v39, v4

    :goto_14
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v35

    if-eqz v35, :cond_14

    invoke-virtual/range {v35 .. v35}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrTooHighLabel()Ljava/lang/String;

    move-result-object v35

    move-object/from16 v36, v35

    goto :goto_15

    :cond_14
    move-object/from16 v36, v4

    :goto_15
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v35

    if-eqz v35, :cond_15

    invoke-virtual/range {v35 .. v35}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrTooLowLabel()Ljava/lang/String;

    move-result-object v35

    goto :goto_16

    :cond_15
    move-object/from16 v35, v4

    :goto_16
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v37

    if-eqz v37, :cond_16

    invoke-virtual/range {v37 .. v37}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrSuffix()Ljava/lang/String;

    move-result-object v37

    move-object/from16 v40, v37

    goto :goto_17

    :cond_16
    move-object/from16 v40, v4

    :goto_17
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v37

    if-eqz v37, :cond_17

    invoke-virtual/range {v37 .. v37}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->isHrRequired()Z

    move-result v37

    invoke-static/range {v37 .. v37}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v37

    move-object/from16 v41, v37

    goto :goto_18

    :cond_17
    move-object/from16 v41, v4

    :goto_18
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getMysticResponse()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;

    move-result-object v37

    if-eqz v37, :cond_18

    invoke-virtual/range {v37 .. v37}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/MysticResponse;->getHrRequiredText()Ljava/lang/String;

    move-result-object v37

    goto :goto_19

    :cond_18
    move-object/from16 v37, v4

    :goto_19
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getInputType()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/InputType;

    move-result-object v42

    if-eqz v42, :cond_19

    invoke-virtual/range {v42 .. v42}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v42

    goto :goto_1a

    :cond_19
    move-object/from16 v42, v4

    :goto_1a
    invoke-static {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepsScreenResponseKt;->isInputRequired(Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;)Z

    move-result v43

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getBtHrConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    move-result-object v44

    if-eqz v44, :cond_1a

    invoke-virtual/range {v44 .. v44}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;->getRequiredRegex()Ljava/lang/String;

    move-result-object v44

    goto :goto_1b

    :cond_1a
    move-object/from16 v44, v4

    :goto_1b
    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getBtHrConfig()Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;

    move-result-object v45

    if-eqz v45, :cond_1b

    invoke-virtual/range {v45 .. v45}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/BtHrConfigResponse;->getBlockedRegex()Ljava/lang/String;

    move-result-object v4

    :cond_1b
    move-object/from16 v45, v4

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getCountDownTimerRequired()Z

    move-result v46

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getCountDownTimerSeconds()Ljava/lang/Integer;

    move-result-object v47

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getSurveyProvider()Lcom/whoop/whooplabs/data/domain/SurveyProvider;

    move-result-object v50

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getSurveyFormId()Ljava/lang/String;

    move-result-object v48

    invoke-virtual {v3}, Lcom/whoop/whooplabs/data/remote/domain/dto/bff/CampaignStepResponse;->getSurveyVendorMetadata()Ljava/lang/String;

    move-result-object v49

    new-instance v3, Lcom/whoop/whooplabs/data/domain/ProtocolStep;

    move/from16 v4, p1

    invoke-direct/range {v3 .. v50}, Lcom/whoop/whooplabs/data/domain/ProtocolStep;-><init>(IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/whooplabs/data/domain/SurveyProvider;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move/from16 v7, v51

    goto/16 :goto_0

    :cond_1c
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_1d
    return-object v1
.end method
