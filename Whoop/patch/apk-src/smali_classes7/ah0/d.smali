.class public abstract Lah0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aG\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00012\u001a\u0008\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00060\u00050\u00032\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/bot/models/conversation/FormWidgetModel;",
        "",
        "currentQuestionIndex",
        "",
        "",
        "",
        "Lcom/whoop/ai/chat/domain/formwidget/h;",
        "savedAnswers",
        "moderationError",
        "Lah0/c;",
        "a",
        "(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;)Lah0/c;",
        "bot_release"
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
.method public static final a(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;)Lah0/c;
    .locals 31
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/models/conversation/FormWidgetModel;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/util/List<",
            "Lcom/whoop/ai/chat/domain/formwidget/h;",
            ">;>;",
            "Ljava/lang/String;",
            ")",
            "Lah0/c;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "savedAnswers"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-gez p1, :cond_0

    const/4 v13, 0x0

    goto :goto_0

    :cond_0
    move/from16 v13, p1

    :goto_0
    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getQuestions()Ljava/util/List;

    move-result-object v3

    invoke-static {v13, v3}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/bot/models/conversation/FormQuestionModel;

    const/4 v4, 0x0

    if-nez v3, :cond_1

    return-object v4

    :cond_1
    sget-object v5, Lah0/k;->Companion:Lah0/k$a;

    invoke-virtual {v3}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lah0/k$a;->a(Ljava/lang/String;)Lah0/k;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-virtual {v5}, Lah0/k;->isFreeText()Z

    move-result v17

    if-eqz v17, :cond_4

    if-eqz v6, :cond_3

    invoke-static {v6}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/ai/chat/domain/formwidget/h;

    if-eqz v7, :cond_3

    invoke-virtual {v7}, Lcom/whoop/ai/chat/domain/formwidget/h;->c()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_2

    goto :goto_2

    :cond_2
    :goto_1
    move-object/from16 v18, v7

    move-object v7, v3

    goto :goto_3

    :cond_3
    :goto_2
    invoke-virtual {v3}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getAnswers()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getUserInputText()Ljava/lang/String;

    move-result-object v7

    goto :goto_1

    :cond_4
    move-object v7, v3

    move-object/from16 v18, v4

    :goto_3
    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getAuthoritativeFormId()Ljava/lang/String;

    move-result-object v3

    move-object v8, v4

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getUserFormId()Ljava/lang/String;

    move-result-object v4

    move-object v9, v5

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getKey()Ljava/lang/String;

    move-result-object v5

    move-object v10, v6

    invoke-virtual {v2}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getVersion()Ljava/lang/Integer;

    move-result-object v6

    move-object v11, v7

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getId()Ljava/lang/String;

    move-result-object v7

    move-object v12, v8

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getPrompt()Ljava/lang/String;

    move-result-object v8

    if-eqz v17, :cond_5

    sget-object v10, Lm83/y;->w:Lm83/y;

    goto/16 :goto_e

    :cond_5
    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getAnswers()Ljava/util/List;

    move-result-object v15

    check-cast v15, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v15, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v1, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v15}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_4
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_f

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;

    if-eqz v10, :cond_8

    move-object/from16 v19, v10

    check-cast v19, Ljava/lang/Iterable;

    invoke-interface/range {v19 .. v19}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_5
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v20

    if-eqz v20, :cond_7

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v20

    move-object/from16 v21, v20

    check-cast v21, Lcom/whoop/ai/chat/domain/formwidget/h;

    invoke-virtual/range {v21 .. v21}, Lcom/whoop/ai/chat/domain/formwidget/h;->b()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getOptionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_6

    :cond_6
    move-object/from16 v2, p0

    goto :goto_5

    :cond_7
    const/16 v20, 0x0

    :goto_6
    check-cast v20, Lcom/whoop/ai/chat/domain/formwidget/h;

    goto :goto_7

    :cond_8
    const/16 v20, 0x0

    :goto_7
    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getOptionId()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getLabel()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getValue()Ljava/lang/String;

    move-result-object v26

    if-eqz v10, :cond_c

    move-object v2, v10

    check-cast v2, Ljava/lang/Iterable;

    instance-of v14, v2, Ljava/util/Collection;

    if-eqz v14, :cond_a

    move-object v14, v2

    check-cast v14, Ljava/util/Collection;

    invoke-interface {v14}, Ljava/util/Collection;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_a

    :cond_9
    const/4 v2, 0x0

    goto :goto_9

    :cond_a
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/ai/chat/domain/formwidget/h;

    invoke-virtual {v14}, Lcom/whoop/ai/chat/domain/formwidget/h;->b()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v19, v2

    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getOptionId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_b

    const/4 v2, 0x1

    goto :goto_9

    :cond_b
    move-object/from16 v2, v19

    goto :goto_8

    :goto_9
    move/from16 v27, v2

    goto :goto_a

    :cond_c
    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getSelected()Z

    move-result v2

    goto :goto_9

    :goto_a
    sget-object v2, Lah0/a;->Companion:Lah0/a$a;

    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getType()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v14}, Lah0/a$a;->a(Ljava/lang/String;)Lah0/a;

    move-result-object v2

    invoke-virtual {v2}, Lah0/a;->isUserInput()Z

    move-result v28

    if-eqz v20, :cond_e

    invoke-virtual/range {v20 .. v20}, Lcom/whoop/ai/chat/domain/formwidget/h;->c()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_d

    goto :goto_c

    :cond_d
    :goto_b
    move-object/from16 v29, v2

    goto :goto_d

    :cond_e
    :goto_c
    invoke-virtual {v15}, Lcom/whoop/bot/models/conversation/FormAnswerOptionModel;->getUserInputText()Ljava/lang/String;

    move-result-object v2

    goto :goto_b

    :goto_d
    new-instance v23, Lah0/f;

    invoke-direct/range {v23 .. v29}, Lah0/f;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;)V

    move-object/from16 v2, v23

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p0

    goto/16 :goto_4

    :cond_f
    move-object v10, v1

    :goto_e
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getStatus()Ljava/lang/String;

    move-result-object v1

    const-string v2, "COMPLETE"

    const/4 v12, 0x1

    invoke-static {v1, v2, v12}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    invoke-virtual {v9}, Lah0/k;->isMultiSelect()Z

    move-result v2

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getAnswerDisplayStyle()Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    move-result-object v9

    sget-object v14, Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;->CHECKBOX:Lcom/whoop/bot/models/conversation/AnswerDisplayStyle;

    if-ne v9, v14, :cond_10

    move/from16 v29, v12

    goto :goto_f

    :cond_10
    const/16 v29, 0x0

    :goto_f
    sget-object v9, Lah0/b;->Companion:Lah0/b$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getCompletedAnswerDisplay()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v9, v14}, Lah0/b$a;->a(Ljava/lang/String;)Lah0/b;

    move-result-object v30

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getMaxSelections()I

    move-result v9

    if-ge v9, v12, :cond_11

    move v9, v12

    :cond_11
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getQuestions()Ljava/util/List;

    move-result-object v14

    invoke-interface {v14}, Ljava/util/List;->size()I

    move-result v14

    if-lez v13, :cond_12

    move v15, v12

    goto :goto_10

    :cond_12
    const/4 v15, 0x0

    :goto_10
    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->isRequired()Z

    move-result v19

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getId()Ljava/lang/String;

    move-result-object v12

    invoke-interface {v0, v12}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v20

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getUserVisibleProgressIndicator()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getUserVisibleSubmitButtonText()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getUserVisibleCompletedButtonText()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getPlaceholder()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getUserInputTextMaxLength()I

    move-result v25

    invoke-virtual {v11}, Lcom/whoop/bot/models/conversation/FormQuestionModel;->getOnAnswer()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/bot/models/conversation/FormWidgetModel;->getOnComplete()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v28

    move v11, v2

    new-instance v2, Lah0/c;

    move/from16 v16, v13

    move-object/from16 v26, p3

    move v12, v9

    move-object v9, v10

    move v10, v1

    invoke-direct/range {v2 .. v30}, Lah0/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZZIIIZIZLjava/lang/String;ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/whoopaction/domain/models/Action;ZLah0/b;)V

    return-object v2
.end method

.method public static synthetic b(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;ILjava/lang/Object;)Lah0/c;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const/4 p1, 0x0

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    sget-object p2, Lm83/z;->w:Lm83/z;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    const/4 p3, 0x0

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lah0/d;->a(Lcom/whoop/bot/models/conversation/FormWidgetModel;ILjava/util/Map;Ljava/lang/String;)Lah0/c;

    move-result-object p0

    return-object p0
.end method
