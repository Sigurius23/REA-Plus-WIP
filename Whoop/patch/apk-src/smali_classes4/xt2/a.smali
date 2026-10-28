.class public final Lxt2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lxt2/a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;",
        "item",
        "",
        "isCompleted",
        "Lau2/e;",
        "c",
        "(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;",
        "Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;",
        "circularProgressIndicator",
        "Lp01/b;",
        "b",
        "(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lp01/b;",
        "Ltt2/e;",
        "domainResult",
        "Lwt2/k;",
        "a",
        "(Ltt2/e;)Lwt2/k;",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final b(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lp01/b;
    .locals 24

    new-instance v0, Lp01/b;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTotalSteps()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getCurrentStep()I

    move-result v2

    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v3

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getPercentage()D

    move-result-wide v3

    double-to-float v3, v3

    goto :goto_1

    :cond_2
    const/4 v3, 0x0

    :goto_1
    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v4

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTextDisplay()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_5

    :cond_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getTextDisplay()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    const/4 v4, 0x0

    :cond_5
    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v5

    if-eqz v5, :cond_6

    sget-object v5, Lp01/h;->PERCENTAGE:Lp01/h;

    :goto_3
    move-object/from16 v20, v5

    goto :goto_4

    :cond_6
    sget-object v5, Lp01/h;->STEPS:Lp01/h;

    goto :goto_3

    :goto_4
    const v22, 0xbfff0

    const/16 v23, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    const-wide/16 v18, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v0 .. v23}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final c(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;
    .locals 2

    new-instance v0, Lau2/e;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-eqz p2, :cond_0

    sget-object p2, Ly81/f;->ACCENT_ACTION:Ly81/f;

    goto :goto_0

    :cond_0
    sget-object p2, Ly81/f;->BRAND_WHITE:Ly81/f;

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object p1

    invoke-direct {p0, p1}, Lxt2/a;->b(Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;)Lp01/b;

    move-result-object p1

    invoke-direct {v0, v1, p2, p1}, Lau2/e;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;Lp01/b;)V

    return-object v0
.end method


# virtual methods
.method public final a(Ltt2/e;)Lwt2/k;
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "domainResult"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Ltt2/e$a;

    if-eqz v2, :cond_0

    new-instance v2, Lwt2/k$a;

    check-cast v1, Ltt2/e$a;

    invoke-virtual {v1}, Ltt2/e$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Lwt2/k$a;-><init>(Ljava/lang/String;)V

    return-object v2

    :cond_0
    sget-object v2, Ltt2/e$b;->a:Ltt2/e$b;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    sget-object v1, Lwt2/k$b;->a:Lwt2/k$b;

    return-object v1

    :cond_1
    instance-of v2, v1, Ltt2/e$c;

    if-eqz v2, :cond_1b

    check-cast v1, Ltt2/e$c;

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getHeaderDisplay()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->getDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getHeaderDisplay()Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/StyledString;->getStyle()Lcom/whoop/weeklyplan/weeklyplan/domain/models/TrackingStyle;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lwt2/m;->NONE:Lwt2/m;

    invoke-static {}, Lwt2/m;->values()[Lwt2/m;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    move v10, v9

    :goto_0
    const/4 v11, 0x0

    if-ge v10, v8, :cond_3

    aget-object v12, v7, v10

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto :goto_1

    :cond_2
    add-int/lit8 v10, v10, 0x1

    goto :goto_0

    :cond_3
    move-object v12, v11

    :goto_1
    if-nez v12, :cond_4

    goto :goto_2

    :cond_4
    move-object v6, v12

    :goto_2
    new-instance v3, Lwt2/h;

    invoke-direct {v3, v2, v6}, Lwt2/h;-><init>(Lcom/whoop/design/util/TextResource;Lwt2/m;)V

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object v2

    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getItems()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_5
    :goto_3
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v13

    if-eqz v13, :cond_6

    invoke-virtual {v13}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v13

    goto :goto_4

    :cond_6
    move-object v13, v11

    :goto_4
    sget-object v14, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_IN_PROGRESS:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-eq v13, v14, :cond_8

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v12

    if-eqz v12, :cond_7

    invoke-virtual {v12}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v12

    goto :goto_5

    :cond_7
    move-object v12, v11

    :goto_5
    if-ne v12, v14, :cond_5

    :cond_8
    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_9
    new-instance v6, Ljava/util/ArrayList;

    const/16 v10, 0xa

    invoke-static {v8, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v6, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_6
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;

    invoke-direct {v0, v12, v9}, Lxt2/a;->c(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;

    move-result-object v12

    invoke-virtual {v6, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_a
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getItems()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_b
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v12, v9

    check-cast v12, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v13

    if-eqz v13, :cond_c

    invoke-virtual {v13}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v13

    goto :goto_8

    :cond_c
    move-object v13, v11

    :goto_8
    sget-object v14, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-eq v13, v14, :cond_e

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v12

    if-eqz v12, :cond_d

    invoke-virtual {v12}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v12

    goto :goto_9

    :cond_d
    move-object v12, v11

    :goto_9
    if-ne v12, v14, :cond_b

    :cond_e
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_f
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v8, v10}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v2, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_10

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;

    const/4 v10, 0x1

    invoke-direct {v0, v9, v10}, Lxt2/a;->c(Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummaryItem;Z)Lau2/e;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_10
    new-instance v8, Lau2/d;

    invoke-direct {v8, v11, v6, v2}, Lau2/d;-><init>(Lwt2/g;Ljava/util/List;Ljava/util/List;)V

    goto :goto_b

    :cond_11
    move-object v8, v11

    :goto_b
    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getProgressBar()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;->getPercentValue()F

    move-result v6

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;->getPercentSymbol()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_12

    const-string v9, "%"

    :cond_12
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ProgressBarModel;->getPercentSubtitle()Ljava/lang/String;

    move-result-object v2

    new-instance v10, Le0;

    invoke-direct {v10, v6, v2, v9}, Le0;-><init>(FLjava/lang/String;Ljava/lang/String;)V

    goto :goto_c

    :cond_13
    move-object v10, v11

    :goto_c
    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getPrimaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getTitleDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getIcon()Ljava/lang/String;

    move-result-object v9

    if-eqz v9, :cond_14

    invoke-static {v9}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v9

    goto :goto_d

    :cond_14
    move-object v9, v11

    :goto_d
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getEnabled()Z

    move-result v2

    new-instance v13, Lwt2/a;

    invoke-direct {v13, v6, v9, v12, v2}, Lwt2/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Z)V

    move-object v9, v13

    goto :goto_e

    :cond_15
    move-object v9, v11

    :goto_e
    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSecondaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    move-result-object v2

    if-eqz v2, :cond_17

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getTitleDisplay()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSecondaryButton()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getIcon()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_16

    invoke-static {v12}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v12

    goto :goto_f

    :cond_16
    move-object v12, v11

    :goto_f
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ButtonInfo;->getEnabled()Z

    move-result v2

    new-instance v14, Lwt2/a;

    invoke-direct {v14, v6, v12, v13, v2}, Lwt2/a;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/navigation/e;Z)V

    goto :goto_10

    :cond_17
    move-object v14, v11

    :goto_10
    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object v2

    if-eqz v2, :cond_18

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getChallengeProgressBar()Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;

    move-result-object v2

    if-eqz v2, :cond_18

    new-instance v6, Lwt2/c;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;->getRightLabel()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/ChallengeProgressBar;->getPercentValue()I

    move-result v2

    invoke-direct {v6, v12, v13, v2}, Lwt2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V

    move-object v12, v6

    goto :goto_11

    :cond_18
    move-object v12, v11

    :goto_11
    invoke-virtual {v1}, Ltt2/e$c;->b()Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/SummaryV2Model;->getSummaryV2()Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;

    move-result-object v2

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/weeklyplan/domain/models/NewSummary;->getOverrideImage()Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_19

    new-instance v15, Lkd1/o$c;

    const/16 v20, 0xe

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v15

    goto :goto_12

    :cond_19
    move-object v13, v11

    :goto_12
    invoke-virtual {v1}, Ltt2/e$c;->a()Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;

    move-result-object v1

    if-eqz v1, :cond_1a

    invoke-static {v1}, Lcom/whoop/coacheverywherecommon/models/a;->a(Lcom/whoop/coacheverywherecommon/models/AiContextMetadata;)Lep0/j;

    move-result-object v11

    :cond_1a
    move-object v6, v3

    new-instance v3, Lwt2/k$c;

    move-object/from16 v22, v11

    move-object v11, v10

    move-object v10, v14

    move-object/from16 v14, v22

    invoke-direct/range {v3 .. v14}, Lwt2/k$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lwt2/h;Lcom/whoop/design/util/TextResource;Lau2/d;Lwt2/a;Lwt2/a;Le0;Lwt2/c;Lkd1/o;Lep0/j;)V

    return-object v3

    :cond_1b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
