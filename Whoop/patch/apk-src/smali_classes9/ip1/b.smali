.class public abstract Lip1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;",
        "result",
        "Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;",
        "screenId",
        "Lcp1/d;",
        "hormonalOnboardingFlowType",
        "Lhp1/d;",
        "b",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/d;)Lhp1/d;",
        "Lhp1/b;",
        "a",
        "(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/b;",
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
.method public static final a(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;)Lhp1/b;
    .locals 13

    const-string v0, "result"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalDateInputScreen"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd"

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getStartDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getMinDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getMaxDate()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getNavigationSubtitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getButtonTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getSkipTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v12

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object p0

    check-cast p0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalDateInputScreen;->getSkipNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v11

    new-instance v2, Lhp1/b;

    invoke-direct/range {v2 .. v12}, Lhp1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    return-object v2
.end method

.method public static final b(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/d;)Lhp1/d;
    .locals 21

    move-object/from16 v0, p2

    const-string v1, "result"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "screenId"

    move-object/from16 v5, p1

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "hormonalOnboardingFlowType"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    const-string v3, "null cannot be cast to non-null type com.whoop.hormonalinsights.postpartum.domain.models.HormonalMultiSelectScreen"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getNavigationTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getNavigationSubtitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getButtonTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getSkipTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getSkipNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v1

    check-cast v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v9, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;

    sget-object v13, Lcp1/d;->POSTPARTUM:Lcp1/d;

    if-ne v0, v13, :cond_0

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    :goto_1
    move-object v15, v13

    goto :goto_2

    :cond_0
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getTitle()Ljava/lang/String;

    move-result-object v13

    sget-object v14, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v15, "toUpperCase(...)"

    invoke-static {v14, v13, v15}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    goto :goto_1

    :goto_2
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getSubtitle()Ljava/lang/String;

    move-result-object v13

    if-eqz v13, :cond_1

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object/from16 v17, v13

    goto :goto_3

    :cond_1
    const/16 v17, 0x0

    :goto_3
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getValue()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getNextId()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v19

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getNextCount()Ljava/lang/Double;

    move-result-object v13

    if-eqz v13, :cond_2

    invoke-virtual {v13}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v13

    double-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v20, v13

    goto :goto_4

    :cond_2
    const/16 v20, 0x0

    :goto_4
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/postpartum/domain/models/MultiSelectOption;->getIcon()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_5

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v13

    array-length v14, v13

    const/16 v18, 0x0

    move/from16 v12, v18

    :goto_5
    if-ge v12, v14, :cond_4

    aget-object v18, v13, v12

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    move-object/from16 v12, v18

    goto :goto_6

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v0, p2

    goto :goto_5

    :cond_4
    const/4 v12, 0x0

    :goto_6
    move-object/from16 v18, v12

    goto :goto_7

    :cond_5
    const/16 v18, 0x0

    :goto_7
    new-instance v14, Lhp1/c;

    invoke-direct/range {v14 .. v20}, Lhp1/c;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Ljava/lang/Integer;)V

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p2

    goto/16 :goto_0

    :cond_6
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object v7, v12

    goto :goto_8

    :cond_7
    const/4 v7, 0x0

    :goto_8
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;->getContent()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenContent;

    move-result-object v0

    check-cast v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalMultiSelectScreen;->getProgress()Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;

    move-result-object v0

    invoke-static {v0}, Lcp1/b;->a(Lcom/whoop/hormonalinsights/onboarding/domain/models/FlowProgress;)Lcp1/c;

    move-result-object v12

    new-instance v2, Lhp1/d;

    invoke-direct/range {v2 .. v12}, Lhp1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/c;)V

    return-object v2
.end method

.method public static synthetic c(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/d;ILjava/lang/Object;)Lhp1/d;
    .locals 0

    and-int/lit8 p3, p3, 0x4

    if-eqz p3, :cond_0

    sget-object p2, Lcp1/d;->POSTPARTUM:Lcp1/d;

    :cond_0
    invoke-static {p0, p1, p2}, Lip1/b;->b(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreen;Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lcp1/d;)Lhp1/d;

    move-result-object p0

    return-object p0
.end method
