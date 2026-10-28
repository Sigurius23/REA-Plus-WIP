.class public abstract Ljw0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljw0/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u001b\u0010\u0008\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        "Ljw0/f;",
        "a",
        "(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)Ljw0/f;",
        "Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;",
        "Ljw0/j;",
        "label",
        "Lmw0/f;",
        "b",
        "(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;",
        "core-details_release"
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
.method public static final a(Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;)Ljw0/f;
    .locals 38

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v4}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v4

    sget-object v5, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->HOURS_OF_SLEEP:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v4, v5, :cond_0

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v2, :cond_28

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v5}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v5

    sget-object v6, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->RESTORATIVE_SLEEP:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v5, v6, :cond_2

    goto :goto_1

    :cond_3
    const/4 v4, 0x0

    :goto_1
    check-cast v4, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v4, :cond_27

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v6}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v6

    sget-object v7, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->AWAKE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v6, v7, :cond_4

    goto :goto_2

    :cond_5
    const/4 v5, 0x0

    :goto_2
    check-cast v5, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v5, :cond_26

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v7}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v7

    sget-object v8, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->WAKE_EVENTS:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v7, v8, :cond_6

    goto :goto_3

    :cond_7
    const/4 v6, 0x0

    :goto_3
    check-cast v6, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v6, :cond_25

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v8}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v8

    sget-object v9, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->LIGHT_SLEEP:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v8, v9, :cond_8

    goto :goto_4

    :cond_9
    const/4 v7, 0x0

    :goto_4
    check-cast v7, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v7, :cond_24

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v9, v8

    check-cast v9, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v9}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v9

    sget-object v10, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->SWS_SLEEP:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v9, v10, :cond_a

    goto :goto_5

    :cond_b
    const/4 v8, 0x0

    :goto_5
    check-cast v8, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v8, :cond_23

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_d

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v10}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v10

    sget-object v11, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->REM_SLEEP:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v10, v11, :cond_c

    goto :goto_6

    :cond_d
    const/4 v9, 0x0

    :goto_6
    check-cast v9, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v9, :cond_22

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v11}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v11

    sget-object v12, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->EFFICIENCY:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v11, v12, :cond_e

    goto :goto_7

    :cond_f
    const/4 v10, 0x0

    :goto_7
    check-cast v10, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v10, :cond_21

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_10
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_11

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v12}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v12

    sget-object v13, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->RESPIRATORY_RATE:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v12, v13, :cond_10

    goto :goto_8

    :cond_11
    const/4 v11, 0x0

    :goto_8
    check-cast v11, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    if-eqz v11, :cond_20

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_13

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v13}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v13

    sget-object v14, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->TOTAL_WAKE_EVENTS:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v13, v14, :cond_12

    goto :goto_9

    :cond_13
    const/4 v12, 0x0

    :goto_9
    check-cast v12, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepMetricBreakdowns()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_14
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_15

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    invoke-virtual {v14}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v14

    sget-object v15, Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;->LATENCY:Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    if-ne v14, v15, :cond_14

    goto :goto_a

    :cond_15
    const/4 v13, 0x0

    :goto_a
    check-cast v13, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    new-instance v0, Lorg/joda/time/LocalDateTime;

    sget-object v14, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->Companion:Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;

    invoke-virtual {v14}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v15

    invoke-virtual {v15}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsEditComponent()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;->getSleepStartTime()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v15, v3}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3}, Lorg/joda/time/base/AbstractInstant;->toInstant()Lorg/joda/time/Instant;

    move-result-object v3

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v15

    invoke-direct {v0, v3, v15}, Lorg/joda/time/LocalDateTime;-><init>(Ljava/lang/Object;Lorg/joda/time/DateTimeZone;)V

    new-instance v3, Lorg/joda/time/LocalDateTime;

    invoke-virtual {v14}, Lcom/whoop/data/remote/domain/dto/DateTimeRange$Companion;->getDateTimeFormatter()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v14

    invoke-virtual {v14}, Lorg/joda/time/format/DateTimeFormatter;->withZoneUTC()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsEditComponent()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;->getSleepEndTime()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Lorg/joda/time/format/DateTimeFormatter;->parseDateTime(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v14

    invoke-virtual {v14}, Lorg/joda/time/base/AbstractInstant;->toInstant()Lorg/joda/time/Instant;

    move-result-object v14

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v15

    invoke-direct {v3, v14, v15}, Lorg/joda/time/LocalDateTime;-><init>(Ljava/lang/Object;Lorg/joda/time/DateTimeZone;)V

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getActivityDisplayType()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    move-result-object v14

    sget-object v15, Ljw0/h$a;->a:[I

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v14

    aget v14, v15, v14

    const/4 v15, 0x1

    if-eq v14, v15, :cond_1a

    const/4 v15, 0x2

    if-eq v14, v15, :cond_19

    const/4 v2, 0x3

    if-ne v14, v2, :cond_18

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getScreenTitleDisplay()Ljava/lang/String;

    move-result-object v18

    new-instance v2, Ljw0/a;

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getSleepMetricsLabelDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getVsThirtyDayRangeLabelDisplay()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v6, v10, v11, v13}, [Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    move-result-object v6

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsMetricModals()Ljava/util/List;

    move-result-object v7

    invoke-direct {v2, v4, v5, v6, v7}, Ljw0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getSleepMetricsLabelDisplay()Ljava/lang/String;

    move-result-object v0

    const-string v3, "nap"

    const/4 v14, 0x1

    invoke-static {v0, v3, v14}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v23

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getMissingHrData()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    move-result-object v0

    if-eqz v0, :cond_16

    new-instance v3, Lmw0/a;

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v3, v5, v0}, Lmw0/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v22, v3

    goto :goto_b

    :cond_16
    const/16 v22, 0x0

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getHeartRateZoneContainer()Lcom/whoop/design/models/items/BarGraphContainerModel;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsEditComponent()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;->getNapToSleepAvailable()Z

    move-result v25

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getGraphResponse()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v0

    if-nez v0, :cond_17

    new-instance v5, Lcom/whoop/design/models/items/graph/GraphModel;

    const/16 v11, 0x1f

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v12}, Lcom/whoop/design/models/items/graph/GraphModel;-><init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v26, v5

    goto :goto_c

    :cond_17
    move-object/from16 v26, v0

    :goto_c
    new-instance v17, Ljw0/f$b;

    const/16 v27, 0x4

    const/16 v28, 0x0

    const/16 v20, 0x0

    move-object/from16 v19, v2

    move-object/from16 v21, v4

    invoke-direct/range {v17 .. v28}, Ljw0/f$b;-><init>(Ljava/lang/String;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/BarGraphContainerModel;ZLcom/whoop/design/models/items/graph/GraphModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v17

    :cond_18
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_19
    const/4 v14, 0x1

    goto :goto_d

    :cond_1a
    move v14, v15

    :goto_d
    sget-object v15, Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;->COMPLETE_NAP:Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getActivityDisplayType()Lcom/whoop/core/details/network/model/sleep/ActivityDisplayType;

    move-result-object v14

    if-ne v15, v14, :cond_1b

    const/16 v18, 0x1

    goto :goto_e

    :cond_1b
    const/4 v15, 0x0

    move/from16 v18, v15

    :goto_e
    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getScreenTitleDisplay()Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v14

    invoke-virtual {v14}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getSleepDurationTimeDisplay()Ljava/lang/String;

    move-result-object v20

    sget-object v14, Lmc1/b;->NONE:Lmc1/b;

    new-instance v15, Ljw0/i$c;

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->getDynamicVowDisplay()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v16, v0

    sget-object v0, Ljw0/j;->DYNAMIC:Ljw0/j;

    invoke-static {v2, v0}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v2

    invoke-static {v4, v0}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v0

    invoke-direct {v15, v1, v2, v0}, Ljw0/i$c;-><init>(Ljava/lang/String;Lmw0/f;Lmw0/f;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v14, v15}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lmc1/b;->AWAKE:Lmc1/b;

    new-instance v2, Ljw0/i$a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->getAwakeVowDisplay()Ljava/lang/String;

    move-result-object v4

    sget-object v14, Ljw0/j;->AWAKE:Ljw0/j;

    invoke-static {v5, v14}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v5

    if-eqz v12, :cond_1c

    invoke-static {v12, v14}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v12

    goto :goto_f

    :cond_1c
    const/4 v12, 0x0

    :goto_f
    invoke-direct {v2, v4, v5, v12}, Ljw0/i$a;-><init>(Ljava/lang/String;Lmw0/f;Lmw0/f;)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lmc1/b;->LIGHT_SLEEP:Lmc1/b;

    new-instance v2, Ljw0/i$b;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->getLightSleepVowDisplay()Ljava/lang/String;

    move-result-object v5

    sget-object v12, Ljw0/j;->LIGHT_SLEEP:Ljw0/j;

    invoke-static {v7, v12}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v7

    invoke-direct {v2, v5, v7}, Ljw0/i$b;-><init>(Ljava/lang/String;Lmw0/f;)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lmc1/b;->SWS_SLEEP:Lmc1/b;

    new-instance v2, Ljw0/i$e;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->getSwsSleepVowDisplay()Ljava/lang/String;

    move-result-object v7

    sget-object v12, Ljw0/j;->SWS_SLEEP:Ljw0/j;

    invoke-static {v8, v12}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v8

    invoke-direct {v2, v7, v8}, Ljw0/i$e;-><init>(Ljava/lang/String;Lmw0/f;)V

    new-instance v7, Ll83/k;

    invoke-direct {v7, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v1, Lmc1/b;->REM_SLEEP:Lmc1/b;

    new-instance v2, Ljw0/i$d;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getVowStrings()Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsVowsModel;->getRemSleepVowDisplay()Ljava/lang/String;

    move-result-object v8

    sget-object v12, Ljw0/j;->REM_SLEEP:Ljw0/j;

    invoke-static {v9, v12}, Ljw0/h;->b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;

    move-result-object v9

    invoke-direct {v2, v8, v9}, Ljw0/i$d;-><init>(Ljava/lang/String;Lmw0/f;)V

    new-instance v8, Ll83/k;

    invoke-direct {v8, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v4, v5, v7, v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->b0([Ll83/k;)Ljava/util/LinkedHashMap;

    move-result-object v23

    new-instance v0, Ljw0/a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getSleepMetricsLabelDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsLabelsModel()Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsLabelsModel;->getVsThirtyDayRangeLabelDisplay()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v6, v10, v11, v13}, [Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsMetricModals()Ljava/util/List;

    move-result-object v5

    invoke-direct {v0, v1, v2, v4, v5}, Ljw0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getGraphResponse()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v1

    if-nez v1, :cond_1d

    new-instance v4, Lcom/whoop/design/models/items/graph/GraphModel;

    const/16 v10, 0x1f

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Lcom/whoop/design/models/items/graph/GraphModel;-><init>(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;Lcom/whoop/design/models/items/graph/LayoutDirection;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v29, v4

    goto :goto_10

    :cond_1d
    move-object/from16 v29, v1

    :goto_10
    new-instance v1, Ll83/k;

    move-object/from16 v2, v16

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getMissingHrData()Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;

    move-result-object v2

    if-eqz v2, :cond_1e

    new-instance v3, Lmw0/a;

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/MissingHRDataModel;->getDurationDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lmw0/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v27, v3

    goto :goto_11

    :cond_1e
    const/16 v27, 0x0

    :goto_11
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getHeartRateZoneContainer()Lcom/whoop/design/models/items/BarGraphContainerModel;

    move-result-object v30

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getSleepDetailsEditComponent()Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsEditModel;->getNapToSleepAvailable()Z

    move-result v28

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getWhoopCoachVow()Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-result-object v33

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getAdditionalInfoText()Lcom/whoop/design/models/items/AdditionalInfoTextModel;

    move-result-object v34

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;->getMetadata()Lcom/whoop/core/details/network/model/MetaData;

    move-result-object v2

    if-eqz v2, :cond_1f

    invoke-virtual {v2}, Lcom/whoop/core/details/network/model/MetaData;->getAiContextMetadata()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v3

    move-object/from16 v35, v3

    goto :goto_12

    :cond_1f
    const/16 v35, 0x0

    :goto_12
    new-instance v17, Ljw0/f$d;

    const/16 v36, 0x6088

    const/16 v37, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    move-object/from16 v24, v0

    move-object/from16 v26, v1

    invoke-direct/range {v17 .. v37}, Ljw0/f$d;-><init>(ZLjava/lang/String;Ljava/lang/String;Ljw0/b;Ljw0/i;Ljava/util/Map;Ljw0/a;Lnw0/h;Ll83/k;Lmw0/a;ZLcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/BarGraphContainerModel;Lmc1/b;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;Lcom/whoop/design/models/items/WhoopCoachVowModel;Lcom/whoop/design/models/items/AdditionalInfoTextModel;Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v17

    :cond_20
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain respiratory rate metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain efficiency metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain rem metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain sws metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain light metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_25
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain wake events metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_26
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain awake metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_27
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain restorative sleep metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_28
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Broken backend contract - response does not contain hours of sleep metric breakdown"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private static final b(Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;Ljw0/j;)Lmw0/f;
    .locals 14

    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricValueDisplay()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move-object v3, v0

    goto :goto_0

    :cond_0
    move-object v3, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricTrendType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModelKt;->toTrendTypeState(Lcom/whoop/core/details/network/model/sleep/SleepMetricTrendType;)Lhy0/b2;

    move-result-object v0

    move-object v7, v0

    goto :goto_1

    :cond_1
    move-object v7, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricComparisonDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_2
    move-object v6, v1

    sget-object v0, Ljw0/h$a;->b:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_7

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    sget-object v0, Ly81/f;->SLEEP_DEEP_SLEEP:Ly81/f;

    :goto_2
    move-object v8, v0

    goto :goto_3

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_4
    sget-object v0, Ly81/f;->SLEEP_REM_SLEEP:Ly81/f;

    goto :goto_2

    :cond_5
    sget-object v0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    goto :goto_2

    :cond_6
    sget-object v0, Ly81/f;->SLEEP_AWAKE:Ly81/f;

    goto :goto_2

    :cond_7
    sget-object v0, Ly81/f;->SLEEP:Ly81/f;

    goto :goto_2

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getTooltipDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v9, :cond_8

    invoke-virtual {p0}, Lcom/whoop/core/details/network/model/sleep/SleepMetricBreakdownModel;->getSleepMetricType()Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;

    move-result-object v10

    new-instance v2, Lmw0/f;

    const/16 v12, 0x104

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v2 .. v13}, Lmw0/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/b2;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/core/details/network/model/sleep/SleepMetricTypeModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_8
    new-instance p0, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Cannot create stat for label "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " because there is no tooltip"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
