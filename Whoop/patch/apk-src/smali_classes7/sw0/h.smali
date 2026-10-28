.class public abstract Lsw0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a5\u0010\u000c\u001a\u00020\u000b*\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u000e\u001a\u00020\u000b*\u00020\u00002\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00050\t\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "a",
        "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;",
        "f",
        "",
        "searchQuery",
        "",
        "isSelected",
        "",
        "idList",
        "Lsw0/g;",
        "b",
        "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;)Lsw0/g;",
        "d",
        "(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;Ljava/util/List;)Lsw0/g;",
        "Lsw0/j;",
        "Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "e",
        "(Lsw0/j;)Lcom/whoop/design/models/items/GoalSettingsTileModel;",
        "custombottomsheet_release"
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
.method private static final a(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCustomBehaviorsEmptyState()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    instance-of v1, p0, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static final b(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;)Lsw0/g;
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lsw0/g;"
        }
    .end annotation

    move-object/from16 v0, p3

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "searchQuery"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "idList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getSearchTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCategories()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCurrentCategory()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getGroupedTogglesModels()Ljava/util/List;

    move-result-object v1

    sget-object v9, Lm83/y;->w:Lm83/y;

    if-eqz v1, :cond_8

    check-cast v1, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v1, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v10, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lcom/whoop/design/models/items/GroupedTogglesModel;

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GroupedTogglesModel;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GroupedTogglesModel;->getGroupPriority()I

    move-result v16

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GroupedTogglesModel;->getToggles()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_1
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getTitle()Ljava/lang/String;

    move-result-object v19

    const/16 v17, 0x0

    if-nez p2, :cond_1

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    goto :goto_2

    :cond_0
    move/from16 v20, v17

    goto :goto_3

    :cond_1
    :goto_2
    const/4 v8, 0x1

    move/from16 v20, v8

    :goto_3
    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v22

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getCategories()Ljava/util/List;

    move-result-object v23

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getIcon()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getSubtitle()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getAvoidTextDisplay()Ljava/lang/String;

    move-result-object v26

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v27

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v28

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getWeeklyPlanGoal()Ljava/lang/Boolean;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    move/from16 v31, v8

    goto :goto_4

    :cond_2
    move/from16 v31, v17

    :goto_4
    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getDayOptions()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v8

    if-nez v8, :cond_3

    new-instance v8, Lcom/whoop/design/models/items/DayOptions;

    const-string v11, ""

    invoke-direct {v8, v9, v11}, Lcom/whoop/design/models/items/DayOptions;-><init>(Ljava/util/List;Ljava/lang/String;)V

    :cond_3
    move-object/from16 v29, v8

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getSortPriority()Ljava/lang/Integer;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v17

    :cond_4
    move/from16 v21, v17

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getBottomSheetInfo()Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-result-object v8

    if-eqz v8, :cond_5

    new-instance v34, Lsw0/a;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getBottomSheetTitle()Ljava/lang/String;

    move-result-object v35

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getImpactTitle()Ljava/lang/String;

    move-result-object v36

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getDescription()Ljava/lang/String;

    move-result-object v37

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricsTagTitle()Ljava/lang/String;

    move-result-object v38

    invoke-virtual {v8}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricTags()Ljava/util/List;

    move-result-object v39

    invoke-direct/range {v34 .. v39}, Lsw0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    move-object/from16 v30, v34

    goto :goto_5

    :cond_5
    const/16 v30, 0x0

    :goto_5
    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getTag()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-result-object v32

    invoke-virtual {v14}, Lcom/whoop/design/models/items/TogglesModel;->getCustom()Ljava/lang/Boolean;

    move-result-object v8

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v33

    new-instance v17, Lsw0/j;

    invoke-direct/range {v17 .. v33}, Lsw0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;Z)V

    move-object/from16 v8, v17

    invoke-virtual {v13, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v11, 0xa

    goto/16 :goto_1

    :cond_6
    new-instance v14, Lsw0/i;

    const/16 v18, 0x0

    const/16 v19, 0x8

    const/16 v20, 0x0

    move-object/from16 v17, v13

    invoke-direct/range {v14 .. v20}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v11, 0xa

    goto/16 :goto_0

    :cond_7
    move-object v8, v10

    goto :goto_6

    :cond_8
    move-object v8, v9

    :goto_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getButtonTitle()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getConfirmationModal()Lcom/whoop/design/models/items/ConfirmationModalModel;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lsw0/b;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ConfirmationModalModel;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ConfirmationModalModel;->getSubtitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ConfirmationModalModel;->getPrimaryButtonText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ConfirmationModalModel;->getSecondaryButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v10, v11, v12, v0}, Lsw0/b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v12, v1

    goto :goto_7

    :cond_9
    const/4 v12, 0x0

    :goto_7
    invoke-static {v2}, Lsw0/h;->a(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v13

    invoke-static {v2}, Lsw0/h;->f(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v14

    new-instance v2, Lsw0/g;

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/16 v15, 0x180

    const/16 v16, 0x0

    invoke-direct/range {v2 .. v16}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;ILjava/lang/Object;)Lsw0/g;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    const-string p1, ""

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    const/4 p2, 0x0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    sget-object p3, Lm83/y;->w:Lm83/y;

    :cond_2
    invoke-static {p0, p1, p2, p3}, Lsw0/h;->b(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;ZLjava/util/List;)Lsw0/g;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;Ljava/lang/String;Ljava/util/List;)Lsw0/g;
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Lsw0/g;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "<this>"

    move-object/from16 v2, p0

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "searchQuery"

    move-object/from16 v4, p1

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "idList"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getToggles()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_2

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v6}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1

    invoke-virtual {v6}, Lcom/whoop/design/models/items/TogglesModel;->isToggled()Ljava/lang/Boolean;

    move-result-object v7

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v3, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    :goto_1
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    const/4 v5, 0x0

    const-string v6, ""

    sget-object v7, Lm83/y;->w:Lm83/y;

    const/16 v9, 0xa

    const/4 v10, 0x2

    const/4 v11, 0x0

    if-nez v0, :cond_7

    new-instance v13, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lpw0/a;->a:I

    invoke-direct {v13, v0, v11, v10, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Ljava/util/ArrayList;

    invoke-static {v1, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v15, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getTitle()Ljava/lang/String;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getCategories()Ljava/util/List;

    move-result-object v22

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getIcon()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getSubtitle()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getAvoidTextDisplay()Ljava/lang/String;

    move-result-object v25

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v26

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v27

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getDayOptions()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v12

    if-nez v12, :cond_3

    new-instance v12, Lcom/whoop/design/models/items/DayOptions;

    invoke-direct {v12, v7, v6}, Lcom/whoop/design/models/items/DayOptions;-><init>(Ljava/util/List;Ljava/lang/String;)V

    :cond_3
    move-object/from16 v28, v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getSortPriority()Ljava/lang/Integer;

    move-result-object v12

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v12

    move/from16 v20, v12

    goto :goto_3

    :cond_4
    move/from16 v20, v5

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getBottomSheetInfo()Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-result-object v12

    if-eqz v12, :cond_5

    new-instance v29, Lsw0/a;

    invoke-virtual {v12}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getBottomSheetTitle()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v12}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getImpactTitle()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v12}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getDescription()Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v12}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricsTagTitle()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v12}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricTags()Ljava/util/List;

    move-result-object v34

    invoke-direct/range {v29 .. v34}, Lsw0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_4

    :cond_5
    move-object/from16 v29, v11

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getTag()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-result-object v31

    invoke-virtual {v1}, Lcom/whoop/design/models/items/TogglesModel;->getCustom()Ljava/lang/Boolean;

    move-result-object v1

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v1, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v32

    new-instance v16, Lsw0/j;

    const/16 v33, 0x2000

    const/16 v34, 0x0

    const/16 v19, 0x1

    const/16 v30, 0x0

    invoke-direct/range {v16 .. v34}, Lsw0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v16

    invoke-interface {v15, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_6
    new-instance v12, Lsw0/i;

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x8

    const/16 v18, 0x0

    invoke-direct/range {v12 .. v18}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v12}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_7
    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    sget v0, Lpw0/a;->e:I

    invoke-direct {v14, v0, v11, v10, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {v3, v9}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/TogglesModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getTitle()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v20

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getCategories()Ljava/util/List;

    move-result-object v21

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getIcon()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getSubtitle()Ljava/lang/String;

    move-result-object v23

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getAvoidTextDisplay()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v25

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getStyle()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v26

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getDayOptions()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v9

    if-nez v9, :cond_8

    new-instance v9, Lcom/whoop/design/models/items/DayOptions;

    invoke-direct {v9, v7, v6}, Lcom/whoop/design/models/items/DayOptions;-><init>(Ljava/util/List;Ljava/lang/String;)V

    :cond_8
    move-object/from16 v27, v9

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getSortPriority()Ljava/lang/Integer;

    move-result-object v9

    if-eqz v9, :cond_9

    invoke-virtual {v9}, Ljava/lang/Integer;->intValue()I

    move-result v9

    move/from16 v19, v9

    goto :goto_6

    :cond_9
    move/from16 v19, v5

    :goto_6
    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getBottomSheetInfo()Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-result-object v9

    if-eqz v9, :cond_a

    new-instance v28, Lsw0/a;

    invoke-virtual {v9}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getBottomSheetTitle()Ljava/lang/String;

    move-result-object v29

    invoke-virtual {v9}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getImpactTitle()Ljava/lang/String;

    move-result-object v30

    invoke-virtual {v9}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getDescription()Ljava/lang/String;

    move-result-object v31

    invoke-virtual {v9}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricsTagTitle()Ljava/lang/String;

    move-result-object v32

    invoke-virtual {v9}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricTags()Ljava/util/List;

    move-result-object v33

    invoke-direct/range {v28 .. v33}, Lsw0/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_7

    :cond_a
    move-object/from16 v28, v11

    :goto_7
    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getTag()Lcom/whoop/design/models/items/GoalSettingsTileTagModel;

    move-result-object v30

    invoke-virtual {v3}, Lcom/whoop/design/models/items/TogglesModel;->getCustom()Ljava/lang/Boolean;

    move-result-object v3

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v31

    new-instance v15, Lsw0/j;

    const/16 v32, 0x2000

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v15 .. v33}, Lsw0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;Lsw0/a;ZLcom/whoop/design/models/items/GoalSettingsTileTagModel;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v15}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    :cond_b
    new-instance v13, Lsw0/i;

    const/4 v15, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x8

    const/16 v19, 0x0

    move-object/from16 v16, v0

    invoke-direct/range {v13 .. v19}, Lsw0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v8, v13}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v2, Lsw0/g;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getSearchTitle()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCategories()Ljava/util/List;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCurrentCategory()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getButtonTitle()Ljava/lang/String;

    move-result-object v9

    invoke-static/range {p0 .. p0}, Lsw0/h;->a(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v13

    invoke-static/range {p0 .. p0}, Lsw0/h;->f(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;

    move-result-object v14

    const/16 v15, 0x380

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v16}, Lsw0/g;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lsw0/b;Lcom/whoop/design/models/DesignSystemModel;Lcom/whoop/design/models/DesignSystemModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method

.method public static final e(Lsw0/j;)Lcom/whoop/design/models/items/GoalSettingsTileModel;
    .locals 13

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lsw0/j;->m()Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {p0}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {p0}, Lsw0/j;->o()Lcom/whoop/design/models/items/GoalSettingsTileStyle;

    move-result-object v11

    invoke-virtual {p0}, Lsw0/j;->j()Lcom/whoop/design/models/items/DayOptions;

    move-result-object v12

    invoke-virtual {p0}, Lsw0/j;->s()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v5

    new-instance v1, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    const-string v6, ""

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct/range {v1 .. v12}, Lcom/whoop/design/models/items/GoalSettingsTileModel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/design/models/items/GoalSettingsTileStyle;Lcom/whoop/design/models/items/DayOptions;)V

    return-object v1
.end method

.method private static final f(Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;)Lcom/whoop/design/models/DesignSystemModel;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/CustomizeBottomSheetSelectorModel;->getCustomBehaviorsWidget()Lcom/whoop/design/models/DesignSystemModel;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    instance-of v1, p0, Lcom/whoop/design/models/items/UnknownDesignModel;

    if-nez v1, :cond_0

    return-object p0

    :cond_0
    return-object v0
.end method
