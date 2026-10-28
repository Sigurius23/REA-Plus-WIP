.class public abstract Lur1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0001\u001a\u00020\u0000*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Ltr1/b;",
        "b",
        "(Ltr1/b;)Ltr1/b;",
        "",
        "c",
        "(Ltr1/b;)Z",
        "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;",
        "d",
        "(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;",
        "journal_release"
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
.method public static final synthetic a(Ltr1/b;)Ltr1/b;
    .locals 0

    invoke-static {p0}, Lur1/k;->b(Ltr1/b;)Ltr1/b;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Ltr1/b;)Ltr1/b;
    .locals 37

    invoke-virtual/range {p0 .. p0}, Ltr1/b;->d()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    move-result-object v0

    const/16 v11, 0x21e

    const/4 v12, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v12}, Lcom/whoop/data/remote/domain/response/journal/TrackerInput;->copy$default(Lcom/whoop/data/remote/domain/response/journal/TrackerInput;Ljava/lang/Boolean;ILjava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Double;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    move-result-object v15

    invoke-static/range {p0 .. p0}, Lur1/k;->c(Ltr1/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v16

    invoke-virtual/range {p0 .. p0}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lur1/k;->d(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object v0

    :goto_0
    move-object/from16 v33, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    const v35, 0xbfff

    const/16 v36, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const-wide/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    invoke-static/range {v16 .. v36}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v0

    :goto_2
    move-object v14, v0

    goto :goto_3

    :cond_1
    invoke-virtual/range {p0 .. p0}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v0

    goto :goto_2

    :goto_3
    const/16 v17, 0x4

    const/16 v18, 0x0

    const/16 v16, 0x0

    move-object/from16 v13, p0

    invoke-static/range {v13 .. v18}, Ltr1/b;->b(Ltr1/b;Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;Lcom/whoop/data/remote/domain/response/journal/TrackerInput;ZILjava/lang/Object;)Ltr1/b;

    move-result-object v0

    return-object v0
.end method

.method private static final c(Ltr1/b;)Z
    .locals 2

    invoke-virtual {p0}, Ltr1/b;->d()Lcom/whoop/data/remote/domain/response/journal/TrackerInput;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/TrackerInput;->getAnsweredYes()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    invoke-virtual {p0}, Ltr1/b;->c()Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->isAvoided()Z

    move-result v1

    :cond_0
    xor-int p0, v1, v0

    return p0

    :cond_1
    return v1
.end method

.method private static final d(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
    .locals 12

    invoke-virtual {p0}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v3

    const/4 v11, 0x1

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getCurrentStep()I

    move-result v4

    sub-int/2addr v4, v11

    if-gez v4, :cond_0

    move v5, v1

    goto :goto_0

    :cond_0
    move v5, v4

    :goto_0
    const/16 v9, 0x1d

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v10}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->copy$default(Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;Ljava/lang/String;IILcom/whoop/data/remote/domain/dto/CircularProgressStyle;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v2

    :goto_1
    invoke-static {v0, v2, v3, v11, v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->copy$default(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v2

    :goto_2
    const/4 v3, 0x2

    invoke-static {p0, v0, v1, v3, v2}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->copy$default(Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;ZILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-result-object p0

    return-object p0
.end method
