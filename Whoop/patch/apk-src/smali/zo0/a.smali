.class public final Lzo0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\u000c\u001a\u00020\u000b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u0012\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J\u001f\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000b0\u00180\u0017\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lzo0/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/AiAction;",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;",
        "storedMetadata",
        "Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;",
        "tabOverride",
        "Lcom/whoop/coacheverywherecommon/models/CoachEntry;",
        "coachEntry",
        "Lep0/j;",
        "e",
        "(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;",
        "metadata",
        "Ll83/a0;",
        "d",
        "(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;)V",
        "",
        "bottomNavTab",
        "c",
        "(Ljava/lang/String;)Lep0/j;",
        "b",
        "",
        "Ll83/k;",
        "a",
        "()Ljava/util/List;",
        "Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;",
        "coach-everywhere_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private a:Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final e(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;
    .locals 26

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getScreenId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getSourceType()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getSourceId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getConversationSeedId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getFingerprint()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getEntryText()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v0

    :cond_0
    move-object v9, v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getPresetQuestion()Ljava/lang/String;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getIncludeInitialMessage()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v14, v0

    goto :goto_0

    :cond_1
    move v14, v1

    :goto_0
    invoke-virtual/range {p3 .. p3}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getArgs()Ljava/util/Map;

    move-result-object v17

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getSource()Ljava/lang/String;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getShouldOpenFullSize()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getDrawerPresentation()Lcom/whoop/navigation/DrawerPresentation;

    move-result-object v0

    sget-object v3, Lcom/whoop/navigation/DrawerPresentation;->FULL_SCREEN:Lcom/whoop/navigation/DrawerPresentation;

    if-ne v0, v3, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    move/from16 v19, v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/AiAction;->getDrawerPresentation()Lcom/whoop/navigation/DrawerPresentation;

    move-result-object v21

    new-instance v0, Lep0/j;

    const v24, 0x89601

    const/16 v25, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x1

    move-object/from16 v22, p4

    invoke-direct/range {v0 .. v25}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ll83/k;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lzo0/a;->a:Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    if-nez v0, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getBottomNavOverrides()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getType()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lzo0/a;->c(Ljava/lang/String;)Lep0/j;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getType()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    if-eqz v4, :cond_1

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v1
.end method

.method public final b(Ljava/lang/String;)Lep0/j;
    .locals 32

    move-object/from16 v0, p1

    const-string v1, "bottomNavTab"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p0

    iget-object v2, v1, Lzo0/a;->a:Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return-object v3

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getBottomNavOverrides()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    invoke-virtual {v6}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v5, v3

    :goto_0
    check-cast v5, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    if-nez v5, :cond_3

    return-object v3

    :cond_3
    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    goto :goto_1

    :cond_4
    move-object v0, v3

    :goto_1
    instance-of v4, v0, Lcom/whoop/navigation/CoachScreenModel;

    sget-object v5, Lm83/z;->w:Lm83/z;

    if-eqz v4, :cond_6

    check-cast v0, Lcom/whoop/navigation/CoachScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v20

    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->isWceEnabled()Z

    move-result v9

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_5

    move-object/from16 v23, v5

    goto :goto_2

    :cond_5
    move-object/from16 v23, v3

    :goto_2
    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v21

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v0}, Lcom/whoop/navigation/CoachScreenModel;->getShouldOpenFullSize()Z

    move-result v25

    new-instance v6, Lep0/j;

    const v30, 0x78960b

    const/16 v31, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v6 .. v31}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_6
    instance-of v4, v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v4, :cond_8

    check-cast v0, Lcom/whoop/navigation/AiCoachChatScreenModel;

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->isWceEnabled()Z

    move-result v9

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v3

    if-nez v3, :cond_7

    move-object/from16 v23, v5

    goto :goto_3

    :cond_7
    move-object/from16 v23, v3

    :goto_3
    invoke-virtual {v2}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v21

    invoke-virtual {v0}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getShouldOpenFullSize()Z

    move-result v25

    new-instance v6, Lep0/j;

    const v30, 0x78b60b

    const/16 v31, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v6 .. v31}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6

    :cond_8
    return-object v3
.end method

.method public final c(Ljava/lang/String;)Lep0/j;
    .locals 27

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    const-string v1, "bottomNavTab"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lzo0/a;->a:Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    return-object v2

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getBottomNavOverrides()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    invoke-virtual {v6}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getType()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    goto :goto_0

    :cond_2
    move-object v5, v2

    :goto_0
    check-cast v5, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;

    if-nez v5, :cond_3

    return-object v2

    :cond_3
    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getCoachEntry()Lcom/whoop/coacheverywherecommon/models/CoachEntry;

    move-result-object v4

    :cond_4
    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-direct {v0, v6, v1, v5, v4}, Lzo0/a;->e(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;

    move-result-object v1

    return-object v1

    :cond_5
    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v6

    goto :goto_1

    :cond_6
    move-object v6, v2

    :goto_1
    instance-of v7, v6, Lcom/whoop/navigation/CoachScreenModel;

    sget-object v8, Lm83/z;->w:Lm83/z;

    if-eqz v7, :cond_8

    check-cast v6, Lcom/whoop/navigation/CoachScreenModel;

    move-object v2, v6

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v7

    move-object v9, v8

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getConversationSeedId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getEntryText()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getPresetQuestion()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getIncludeInitialMessage()Z

    move-result v15

    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v11

    if-nez v11, :cond_7

    move-object/from16 v18, v9

    goto :goto_2

    :cond_7
    move-object/from16 v18, v11

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getSource()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2}, Lcom/whoop/navigation/CoachScreenModel;->getShouldOpenFullSize()Z

    move-result v20

    new-instance v1, Lep0/j;

    const v25, 0x189681

    const/16 v26, 0x0

    const/4 v2, 0x0

    move-object/from16 v23, v4

    const/4 v4, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x1

    invoke-direct/range {v1 .. v26}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_8
    move-object/from16 v23, v4

    move-object v9, v8

    instance-of v3, v6, Lcom/whoop/navigation/AiCoachChatScreenModel;

    if-eqz v3, :cond_a

    check-cast v6, Lcom/whoop/navigation/AiCoachChatScreenModel;

    move-object v2, v6

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceType()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getSourceId()Ljava/lang/String;

    move-result-object v7

    move-object v3, v9

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getFingerprint()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getStaticInitialMessage()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;->isWcePrefetch()Ljava/lang/Boolean;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getArgs()Ljava/util/Map;

    move-result-object v4

    if-nez v4, :cond_9

    move-object/from16 v18, v3

    goto :goto_3

    :cond_9
    move-object/from16 v18, v4

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;->getOnboardingEducation()Lcom/whoop/coacheverywherecommon/models/CoachEducationType;

    move-result-object v16

    invoke-virtual {v2}, Lcom/whoop/navigation/AiCoachChatScreenModel;->getShouldOpenFullSize()Z

    move-result v20

    new-instance v1, Lep0/j;

    const v25, 0x18b641

    const/16 v26, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x1

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v26}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_a
    move-object/from16 v4, v23

    instance-of v3, v6, Lcom/whoop/navigation/HomeScreenModel;

    if-eqz v3, :cond_c

    check-cast v6, Lcom/whoop/navigation/HomeScreenModel;

    invoke-virtual {v6}, Lcom/whoop/navigation/HomeScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-direct {v0, v3, v1, v5, v4}, Lzo0/a;->e(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;

    move-result-object v1

    return-object v1

    :cond_b
    return-object v2

    :cond_c
    instance-of v3, v6, Lcom/whoop/navigation/HealthTabScreenModel;

    if-eqz v3, :cond_e

    check-cast v6, Lcom/whoop/navigation/HealthTabScreenModel;

    invoke-virtual {v6}, Lcom/whoop/navigation/HealthTabScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-direct {v0, v3, v1, v5, v4}, Lzo0/a;->e(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;

    move-result-object v1

    return-object v1

    :cond_d
    return-object v2

    :cond_e
    instance-of v3, v6, Lcom/whoop/navigation/CommunityScreenModel;

    if-eqz v3, :cond_f

    check-cast v6, Lcom/whoop/navigation/CommunityScreenModel;

    invoke-virtual {v6}, Lcom/whoop/navigation/CommunityScreenModel;->getAiAction()Lcom/whoop/navigation/AiAction;

    move-result-object v3

    if-eqz v3, :cond_f

    invoke-direct {v0, v3, v1, v5, v4}, Lzo0/a;->e(Lcom/whoop/navigation/AiAction;Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;Lcom/whoop/coacheverywherecommon/models/BottomNavOverride;Lcom/whoop/coacheverywherecommon/models/CoachEntry;)Lep0/j;

    move-result-object v1

    return-object v1

    :cond_f
    return-object v2
.end method

.method public final d(Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;)V
    .locals 0

    iput-object p1, p0, Lzo0/a;->a:Lcom/whoop/coacheverywherecommon/models/AiContextMetadataBottomRow;

    return-void
.end method
