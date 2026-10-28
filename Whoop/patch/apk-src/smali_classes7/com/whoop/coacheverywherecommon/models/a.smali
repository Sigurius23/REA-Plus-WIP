.class public abstract Lcom/whoop/coacheverywherecommon/models/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;",
        "Lep0/j;",
        "a",
        "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;",
        "Lcom/whoop/navigation/AiAction;",
        "",
        "isWceEnabled",
        "b",
        "(Lcom/whoop/navigation/AiAction;Z)Lep0/j;",
        "coach-everywhere-common_release"
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
.method public static final a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;
    .locals 31

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWceEnabled()Z

    move-result v2

    invoke-static {v0, v2}, Lcom/whoop/coacheverywherecommon/models/a;->b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getScreenIdentifier()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v3}, Lep0/j;->q()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v4, v0

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {v3}, Lep0/j;->h()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v0

    :cond_1
    move-object/from16 v18, v0

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object v25

    const v27, 0x5fbff6

    const/16 v28, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lep0/j;->b(Lep0/j;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILjava/lang/Object;)Lep0/j;

    move-result-object v0

    return-object v0

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    goto :goto_0

    :cond_3
    move-object v0, v2

    :goto_0
    instance-of v3, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    sget-object v4, Lm83/z;->w:Lm83/z;

    if-eqz v3, :cond_7

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getScreenIdentifier()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWceEnabled()Z

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v9

    check-cast v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getUserMessage()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getPresetQuestionKey()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_1

    :cond_4
    const/4 v2, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    move v2, v3

    :goto_2
    xor-int/lit8 v19, v2, 0x1

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_6

    move-object/from16 v22, v4

    goto :goto_3

    :cond_6
    move-object/from16 v22, v2

    :goto_3
    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getShouldOpenFullSize()Z

    move-result v24

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object v27

    new-instance v5, Lep0/j;

    const v29, 0x5a8442

    const/16 v30, 0x0

    const/4 v7, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v5 .. v30}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_7
    instance-of v3, v0, Lcom/whoop/navigation/CoachScreenModel;

    if-eqz v3, :cond_9

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getScreenIdentifier()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWceEnabled()Z

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v9

    check-cast v0, Lcom/whoop/navigation/CoachScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v19

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v2

    if-nez v2, :cond_8

    move-object/from16 v22, v4

    goto :goto_4

    :cond_8
    move-object/from16 v22, v2

    :goto_4
    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getShouldOpenFullSize()Z

    move-result v24

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;->getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object v27

    new-instance v5, Lep0/j;

    const v29, 0x589682

    const/16 v30, 0x0

    const/4 v7, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v5 .. v30}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5

    :cond_9
    return-object v2
.end method

.method public static final b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;
    .locals 30

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v0

    const-string v2, "null"

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move-object v3, v0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    :goto_1
    move-object v13, v3

    goto :goto_3

    :cond_2
    :goto_2
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getEntryText()Ljava/lang/String;

    move-result-object v3

    goto :goto_1

    :goto_3
    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v0, :cond_4

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    move v0, v4

    goto :goto_4

    :cond_3
    move v0, v3

    :goto_4
    move/from16 v18, v0

    goto :goto_5

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getIncludeInitialMessage()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_4

    :cond_5
    move/from16 v18, v4

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getSource()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    const-string v0, ""

    :cond_6
    move-object v5, v0

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getScreenId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getFingerprint()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getConversationSeedId()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getSourceType()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getSourceId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getUserMessage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getPresetQuestion()Ljava/lang/String;

    move-result-object v16

    sget-object v0, Lcom/whoop/coacheverywherecommon/models/CoachEducationType;->Companion:Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getEducationType()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whoop/coacheverywherecommon/models/CoachEducationType$a;->a(Ljava/lang/String;)Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getArgs()Ljava/util/Map;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getSource()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getShouldOpenFullSize()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getDrawerPresentation()Lcom/whoop/navigation/DrawerPresentation;

    move-result-object v0

    sget-object v2, Lcom/whoop/navigation/DrawerPresentation;->FULL_SCREEN:Lcom/whoop/navigation/DrawerPresentation;

    if-ne v0, v2, :cond_7

    goto :goto_6

    :cond_7
    move/from16 v23, v3

    goto :goto_7

    :cond_8
    :goto_6
    move/from16 v23, v4

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getEntrypointExperience()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getDrawerPresentation()Lcom/whoop/navigation/DrawerPresentation;

    move-result-object v25

    new-instance v4, Lep0/j;

    const v28, 0x609408

    const/16 v29, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v20, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move/from16 v7, p1

    invoke-direct/range {v4 .. v29}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4
.end method
