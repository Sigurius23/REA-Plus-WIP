.class public final Lki2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lki2/a;",
        "",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Lgi2/d;",
        "domainResult",
        "Lji2/l;",
        "a",
        "(Lgi2/d;)Lji2/l;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "strava_release"
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
.field private final a:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "featureFlagChecker"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lki2/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method


# virtual methods
.method public final a(Lgi2/d;)Lji2/l;
    .locals 37

    move-object/from16 v0, p1

    const-string v1, "domainResult"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lgi2/d$h;->a:Lgi2/d$h;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object v1, Lgi2/d$d;->a:Lgi2/d$d;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    :cond_0
    move-object/from16 v1, p0

    goto/16 :goto_b

    :cond_1
    instance-of v1, v0, Lgi2/d$c;

    if-eqz v1, :cond_2

    new-instance v2, Lji2/l;

    const/16 v10, 0x7d

    const/4 v11, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2

    :cond_2
    instance-of v1, v0, Lgi2/d$g;

    if-eqz v1, :cond_e

    check-cast v0, Lgi2/d$g;

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getState()Ljava/lang/String;

    move-result-object v1

    const-string v2, "unconnected"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x2

    const/4 v3, 0x0

    if-eqz v1, :cond_3

    new-instance v4, Lji2/l;

    new-instance v5, Lji2/g;

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v6

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getButtonDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getLearnMoreDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getLearnMoreUrl()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    new-instance v13, Ly71/g;

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getLearnMoreIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-direct {v13, v1, v3, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getPrivacyPolicyDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getPrivacyPolicyUrl()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getWebAuthorizationUrl()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAppAuthorizationUrl()Ljava/lang/String;

    move-result-object v17

    invoke-static/range {v17 .. v17}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct/range {v5 .. v17}, Lji2/g;-><init>(Lkd1/o;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ly71/g;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const/16 v12, 0x7b

    const/4 v13, 0x0

    move-object v7, v5

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v4

    :cond_3
    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getBackgroundImageUrl()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v5

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getIconUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getButtonDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getStatusIcon()Ljava/lang/String;

    move-result-object v1

    new-instance v10, Ly71/g;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v1}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-direct {v10, v1, v3, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getStatusDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticPostDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticallyPostEnabled()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    new-instance v14, Lji2/a;

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getMenuItemTitle()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_4
    move-object v1, v3

    :goto_0
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v4

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getMenuItemSubtitle()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_5
    move-object v4, v3

    :goto_1
    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v15

    if-eqz v15, :cond_6

    invoke-virtual {v15}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getLeftIcon()Ljava/lang/String;

    move-result-object v15

    goto :goto_2

    :cond_6
    move-object v15, v3

    :goto_2
    if-eqz v15, :cond_7

    new-instance v15, Ly71/g;

    invoke-virtual {v0}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getLeftIcon()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v16

    move-object/from16 p1, v0

    invoke-virtual/range {v16 .. v16}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-direct {v15, v0, v3, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_3

    :cond_7
    move-object/from16 p1, v0

    move-object v15, v3

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v0

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    goto :goto_4

    :cond_8
    move-object v0, v3

    :goto_4
    if-eqz v0, :cond_9

    new-instance v0, Ly71/g;

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectedActivitiesItem()Lcom/whoop/strava/domain/models/ActivitiesItemResponse;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/strava/domain/models/ActivitiesItemResponse;->getRightIcon()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v16

    move-object/from16 v17, v5

    invoke-virtual/range {v16 .. v16}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-direct {v0, v5, v3, v2, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v0

    goto :goto_5

    :cond_9
    move-object/from16 v17, v5

    :goto_5
    invoke-direct {v14, v1, v4, v15, v3}, Lji2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;)V

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticallyPostDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getShareableGraphics()Ljava/util/List;

    move-result-object v0

    sget-object v1, Lm83/y;->w:Lm83/y;

    const/16 v2, 0xa

    if-eqz v0, :cond_a

    check-cast v0, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/strava/domain/models/ShareableGraphicResponse;

    new-instance v5, Lji2/d;

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/ShareableGraphicResponse;->getTemplateName()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v18, v0

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/ShareableGraphicResponse;->getTemplateUrl()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/ShareableGraphicResponse;->getSelected()Z

    move-result v4

    invoke-direct {v5, v2, v0, v4}, Lji2/d;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v18

    const/16 v2, 0xa

    goto :goto_6

    :cond_a
    move-object v3, v1

    :cond_b
    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getShareableGraphicDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDisconnectBubbleTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDisconnectBubbleDescriptionDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDisconnectBubbleConfirmButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getDisconnectBubbleCancelButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getSelectableActivitiesList()Ljava/util/List;

    move-result-object v2

    if-eqz v2, :cond_c

    check-cast v2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/strava/domain/models/SelectableActivityResponse;

    new-instance v22, Lji2/c;

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getActivityNameDisplay()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getActivityNameDisplay()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v16, v0

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    move-object/from16 v29, v2

    const-string v2, "toUpperCase(...)"

    invoke-static {v0, v5, v2}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getActivityNameInternal()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getActivityIconUrl()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkd1/p;->l(Ljava/lang/String;)Lkd1/o;

    move-result-object v26

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getSelected()Z

    move-result v27

    invoke-virtual {v4}, Lcom/whoop/strava/domain/models/SelectableActivityResponse;->getPopular()Z

    move-result v28

    invoke-direct/range {v22 .. v28}, Lji2/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lkd1/o;ZZ)V

    move-object/from16 v0, v22

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, v16

    move-object/from16 v2, v29

    goto :goto_7

    :cond_c
    move-object/from16 v16, v0

    move-object/from16 v22, v1

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticallyImportDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticallyImportEnabled()Ljava/lang/Boolean;

    move-result-object v0

    if-eqz v0, :cond_d

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    :goto_8
    move/from16 v24, v0

    goto :goto_9

    :cond_d
    const/4 v0, 0x0

    goto :goto_8

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lgi2/d$g;->a()Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaBffSettingsResponse;->getAutomaticallyImportDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    move-object/from16 v1, p0

    iget-object v0, v1, Lki2/a;->a:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v2, "strava-mobile-import-settings-update"

    invoke-interface {v0, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v26

    new-instance v31, Lji2/f;

    move-object/from16 v5, v17

    move-object/from16 v4, v31

    move-object/from16 v17, v16

    move-object/from16 v16, v3

    invoke-direct/range {v4 .. v26}, Lji2/f;-><init>(Lkd1/o;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLji2/a;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V

    new-instance v27, Lji2/l;

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x77

    const/16 v36, 0x0

    invoke-direct/range {v27 .. v36}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v27

    :cond_e
    move-object/from16 v1, p0

    instance-of v2, v0, Lgi2/d$a;

    if-eqz v2, :cond_f

    new-instance v3, Lji2/l;

    new-instance v10, Lji2/h;

    check-cast v0, Lgi2/d$a;

    invoke-virtual {v0}, Lgi2/d$a;->a()Lcom/whoop/strava/domain/models/StravaDefaultResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/strava/domain/models/StravaDefaultResponse;->getSuccessMessageDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v10, v0}, Lji2/h;-><init>(Lcom/whoop/design/util/TextResource;)V

    const/16 v11, 0x3f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v3 .. v12}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_f
    instance-of v2, v0, Lgi2/d$f;

    if-eqz v2, :cond_10

    new-instance v3, Lji2/l;

    new-instance v4, Lji2/e;

    check-cast v0, Lgi2/d$f;

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->h()Z

    move-result v7

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->d()Z

    move-result v11

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->c()Ljava/util/List;

    move-result-object v14

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/b;->n()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v0}, Lgi2/d$f;->b()Lhi2/b;

    move-result-object v0

    invoke-virtual {v0}, Lhi2/b;->f()Z

    move-result v17

    invoke-direct/range {v4 .. v17}, Lji2/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V

    const/16 v11, 0x6f

    const/4 v12, 0x0

    move-object v8, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_10
    instance-of v2, v0, Lgi2/d$b;

    if-eqz v2, :cond_11

    new-instance v3, Lji2/l;

    new-instance v9, Lji2/b;

    check-cast v0, Lgi2/d$b;

    invoke-virtual {v0}, Lgi2/d$b;->a()Lhi2/a;

    move-result-object v2

    invoke-virtual {v2}, Lhi2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lgi2/d$b;->a()Lhi2/a;

    move-result-object v4

    invoke-virtual {v4}, Lhi2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lgi2/d$b;->a()Lhi2/a;

    move-result-object v5

    invoke-virtual {v5}, Lhi2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lgi2/d$b;->a()Lhi2/a;

    move-result-object v0

    invoke-virtual {v0}, Lhi2/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v9, v2, v4, v5, v0}, Lji2/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    const/16 v11, 0x5f

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_11
    instance-of v2, v0, Lgi2/d$e;

    if-nez v2, :cond_13

    instance-of v2, v0, Lgi2/d$j;

    if-nez v2, :cond_13

    instance-of v2, v0, Lgi2/d$i;

    if-eqz v2, :cond_12

    goto :goto_a

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    :goto_a
    new-instance v2, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Invalid DomainResult: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v2

    :goto_b
    new-instance v3, Lji2/l;

    const/16 v11, 0x7e

    const/4 v12, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Lji2/l;-><init>(ZZLji2/g;Lji2/f;Lji2/e;Lji2/b;Lji2/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3
.end method
