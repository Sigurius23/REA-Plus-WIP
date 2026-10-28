.class public abstract Lio1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\u001a#\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a?\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
        "Ll83/k;",
        "",
        "c",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;",
        "",
        "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;",
        "d",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ljava/util/List;",
        "",
        "behaviorTrackerId",
        "",
        "isSelected",
        "magnitudeInputValue",
        "",
        "timeInputValue",
        "e",
        "(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
        "hormonal-insights_release"
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
.method public static final synthetic a(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;
    .locals 0

    invoke-static {p0}, Lio1/h;->c(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lio1/h;->d(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ll83/k;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    move-object v1, v0

    move-object v2, v1

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, Lcom/whoop/design/models/items/SelectableCellListModel;

    if-eqz v6, :cond_1

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_3
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/SelectableCellListModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SelectableCellListModel;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v6, "menstruation"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SelectableCellListModel;->getCells()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v5

    if-eqz v5, :cond_4

    goto :goto_2

    :cond_5
    move-object v4, v0

    :goto_2
    check-cast v4, Lcom/whoop/design/models/items/SelectableCellModel;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v1

    goto :goto_1

    :cond_6
    move-object v1, v0

    goto :goto_1

    :cond_7
    const-string v6, "cervical_mucus"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SelectableCellListModel;->getCells()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/design/models/items/SelectableCellModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/SelectableCellModel;->getSelected()Z

    move-result v5

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_9
    move-object v4, v0

    :goto_3
    check-cast v4, Lcom/whoop/design/models/items/SelectableCellModel;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/design/models/items/SelectableCellModel;->getId()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_a
    move-object v2, v0

    goto :goto_1

    :cond_b
    new-instance p0, Ll83/k;

    invoke-direct {p0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p0
.end method

.method private static final d(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;",
            ">;"
        }
    .end annotation

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    instance-of v5, v4, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v2, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v3, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getAnsweredYes()Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_3

    :cond_2
    const/4 v6, 0x0

    :goto_3
    invoke-virtual {v4}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBehaviorTracker()Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->getId()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getSuggestedTrackerIds()Ljava/util/List;

    move-result-object v7

    const/4 v8, 0x0

    if-eqz v7, :cond_3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    const/4 v9, 0x1

    if-ne v7, v9, :cond_3

    move/from16 v17, v9

    goto :goto_4

    :cond_3
    move/from16 v17, v8

    :goto_4
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getAnsweredYes()Ljava/lang/Boolean;

    move-result-object v11

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getTimeInputValue()Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getTimeInputLabel()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getMagnitudeInputLabel()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v5}, Lcom/whoop/design/models/items/TrackerInputModel;->getMagnitudeInputValue()Ljava/lang/Double;

    move-result-object v16

    new-instance v10, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-direct/range {v10 .. v17}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Z)V

    goto :goto_5

    :cond_4
    new-instance v10, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    const/16 v18, 0x3d

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v10 .. v19}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/SymptomTrackerInput;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_5
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    invoke-static {v1, v2}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto/16 :goto_0

    :cond_6
    return-object v1
.end method

.method private static final e(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;
    .locals 21

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v2, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v7, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v6, v5, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    if-eqz v6, :cond_6

    move-object v8, v5

    check-cast v8, Lcom/whoop/design/models/items/TrackedBehaviorModel;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getBehaviorTracker()Lcom/whoop/design/models/items/BehaviorTrackerModel;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/BehaviorTrackerModel;->getId()I

    move-result v6

    move/from16 v10, p1

    if-ne v6, v10, :cond_6

    invoke-virtual {v8}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->getTrackerInput()Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v11

    if-eqz v11, :cond_4

    if-nez p2, :cond_0

    invoke-virtual {v11}, Lcom/whoop/design/models/items/TrackerInputModel;->getAnsweredYes()Ljava/lang/Boolean;

    move-result-object v5

    move-object/from16 v17, v5

    goto :goto_2

    :cond_0
    move-object/from16 v17, p2

    :goto_2
    if-eqz p3, :cond_1

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    :goto_3
    move-object/from16 v16, v5

    goto :goto_4

    :cond_1
    invoke-virtual {v11}, Lcom/whoop/design/models/items/TrackerInputModel;->getMagnitudeInputValue()Ljava/lang/Double;

    move-result-object v5

    goto :goto_3

    :goto_4
    if-nez p4, :cond_2

    invoke-virtual {v11}, Lcom/whoop/design/models/items/TrackerInputModel;->getTimeInputValue()Ljava/lang/Long;

    move-result-object v5

    move-object v14, v5

    goto :goto_5

    :cond_2
    move-object/from16 v14, p4

    :goto_5
    const/16 v19, 0x4b

    const/16 v20, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    invoke-static/range {v11 .. v20}, Lcom/whoop/design/models/items/TrackerInputModel;->copy$default(Lcom/whoop/design/models/items/TrackerInputModel;ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/models/items/TrackerInputModel;

    move-result-object v5

    if-nez v5, :cond_3

    goto :goto_6

    :cond_3
    move-object v10, v5

    goto :goto_9

    :cond_4
    :goto_6
    if-eqz p3, :cond_5

    invoke-virtual/range {p3 .. p3}, Ljava/lang/Integer;->intValue()I

    move-result v5

    int-to-double v5, v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    :goto_7
    move-object v14, v5

    goto :goto_8

    :cond_5
    const/4 v5, 0x0

    goto :goto_7

    :goto_8
    new-instance v9, Lcom/whoop/design/models/items/TrackerInputModel;

    const/4 v13, 0x0

    const/16 v16, 0x0

    const/4 v11, 0x0

    move-object/from16 v15, p2

    move-object/from16 v12, p4

    invoke-direct/range {v9 .. v16}, Lcom/whoop/design/models/items/TrackerInputModel;-><init>(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Boolean;Ljava/lang/String;)V

    move-object v10, v9

    :goto_9
    const/16 v18, 0x1fd

    const/16 v19, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v8 .. v19}, Lcom/whoop/design/models/items/TrackedBehaviorModel;->copy$default(Lcom/whoop/design/models/items/TrackedBehaviorModel;Lcom/whoop/design/models/items/BehaviorTrackerModel;Lcom/whoop/design/models/items/TrackerInputModel;Lcom/whoop/design/models/items/TrackedBehaviorMetadataModel;Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;ZLjava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/TrackedBehaviorModel;

    move-result-object v5

    :cond_6
    invoke-interface {v7, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_7
    const/16 v15, 0x3fb

    const/16 v16, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSectionModel;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->getCategorySelector()Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v1

    const/16 v10, 0xfd

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v1 .. v11}, Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;->copy$default(Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/tiles/EmptyTileModel;Ljava/lang/Double;ZLjava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;

    move-result-object v15

    const/16 v19, 0x3b

    const/16 v20, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v12, p0

    invoke-static/range {v12 .. v20}, Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;->copy$default(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/NavigationBar;Ljava/lang/String;Lcom/whoop/design/models/anchorSelector/AnchorSelectorModel;Lcom/whoop/design/models/items/CyclePhaseStyle;Lcom/whoop/hormonalinsights/logsymptoms/domain/models/PrimaryButtonModel;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;ILjava/lang/Object;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;
    .locals 1

    and-int/lit8 p6, p5, 0x2

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    move-object p4, v0

    :cond_2
    invoke-static {p0, p1, p2, p3, p4}, Lio1/h;->e(Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;ILjava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Long;)Lcom/whoop/hormonalinsights/logsymptoms/domain/models/LogSymptomsResponse;

    move-result-object p0

    return-object p0
.end method
