.class public final Lup1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J)\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J!\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u001a2\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\u0004\u0008\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0014\u0010%\u001a\u00020#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lup1/a;",
        "",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "<init>",
        "(Lzr2/a;)V",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;",
        "response",
        "",
        "showUpsell",
        "showPregnancyConfirmation",
        "Ltp1/o;",
        "c",
        "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;",
        "Ltp1/c;",
        "e",
        "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;",
        "Ltp1/f;",
        "g",
        "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Ltp1/f;",
        "Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;",
        "Ltp1/d;",
        "f",
        "(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;",
        "Lec3/l;",
        "Lqp1/b;",
        "upstream",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lzr2/a;",
        "getDateAndTimeProvider",
        "()Lzr2/a;",
        "Ljb1/a;",
        "Ljb1/a;",
        "designSystemReducer",
        "hormonal-insights_release"
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
.field private final a:Lzr2/a;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lzr2/a;)V
    .locals 1

    const-string v0, "dateAndTimeProvider"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lup1/a;->a:Lzr2/a;

    invoke-static {}, Lup1/c;->i()Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lup1/a;->b:Ljb1/a;

    return-void
.end method

.method public static final synthetic a(Lup1/a;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lup1/a;->c(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;
    .locals 23

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getNavigationBarTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getTiles()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v6, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v4, v0, Lup1/a;->b:Ljb1/a;

    invoke-virtual {v4, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getHormonalInsightsModeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    move-result-object v1

    invoke-direct {v0, v1}, Lup1/a;->e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getContraceptionTypeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-direct {v0, v1}, Lup1/a;->e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;

    move-result-object v1

    move-object v8, v1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getDisablingDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {v0, v1}, Lup1/a;->f(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;

    move-result-object v1

    move-object v9, v1

    goto :goto_2

    :cond_2
    const/4 v9, 0x0

    :goto_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getSwitchingModeDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-direct {v0, v1}, Lup1/a;->f(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;

    move-result-object v1

    move-object v10, v1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getSwitchingContraceptionTypeDialog()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-direct {v0, v1}, Lup1/a;->f(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;

    move-result-object v1

    move-object v11, v1

    goto :goto_4

    :cond_4
    const/4 v11, 0x0

    :goto_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getHormonalInsightsModeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->getOptions()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v12, v4

    check-cast v12, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;

    invoke-virtual {v12}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getSelected()Z

    move-result v12

    if-eqz v12, :cond_5

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v12, v1

    goto :goto_6

    :cond_7
    const/4 v12, 0x0

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getContraceptionTypeDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    move-result-object v1

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->getOptions()Ljava/util/List;

    move-result-object v1

    if-eqz v1, :cond_a

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_8
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v13, v4

    check-cast v13, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;

    invoke-virtual {v13}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getSelected()Z

    move-result v13

    if-eqz v13, :cond_8

    goto :goto_7

    :cond_9
    const/4 v4, 0x0

    :goto_7
    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getValue()Ljava/lang/String;

    move-result-object v1

    move-object v13, v1

    goto :goto_8

    :cond_a
    const/4 v13, 0x0

    :goto_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getPreviousPregnancies()Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;->getNavigationTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/PreviousPregnanciesModel;->getItems()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/DesignSystemModel;

    iget-object v15, v0, Lup1/a;->b:Ljb1/a;

    invoke-virtual {v15, v2}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v2

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_b
    new-instance v1, Ltp1/q;

    invoke-direct {v1, v4, v14}, Ltp1/q;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    move-object v15, v1

    goto :goto_a

    :cond_c
    const/4 v15, 0x0

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getPregnancyDueDateDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getMinDate()Ljava/lang/String;

    move-result-object v21

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getMaxDate()Ljava/lang/String;

    move-result-object v20

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getCurrentDate()Ljava/lang/String;

    move-result-object v19

    iget-object v2, v0, Lup1/a;->a:Lzr2/a;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/DueDateDrawer;->getCurrentDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lup1/b;->a(Lzr2/a;Ljava/lang/String;)Ll83/q;

    move-result-object v22

    new-instance v16, Ltp1/a;

    invoke-direct/range {v16 .. v22}, Ltp1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll83/q;)V

    move-object/from16 v14, v16

    goto :goto_b

    :cond_d
    const/4 v14, 0x0

    :goto_b
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getTiles()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_e
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lcom/whoop/design/models/DesignSystemModel;

    instance-of v3, v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    if-eqz v3, :cond_e

    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getType()Ljava/lang/String;

    move-result-object v3

    const-string v4, "HORMONAL_INSIGHTS"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_e

    goto :goto_c

    :cond_f
    const/4 v2, 0x0

    :goto_c
    instance-of v1, v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    if-eqz v1, :cond_10

    check-cast v2, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    goto :goto_d

    :cond_10
    const/4 v2, 0x0

    :goto_d
    if-eqz v2, :cond_11

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getEnabled()Z

    move-result v2

    move v3, v2

    goto :goto_e

    :cond_11
    const/4 v3, 0x0

    :goto_e
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getTiles()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v1, v4

    check-cast v1, Lcom/whoop/design/models/DesignSystemModel;

    move-object/from16 v18, v2

    instance-of v2, v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    if-eqz v2, :cond_12

    check-cast v1, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getType()Ljava/lang/String;

    move-result-object v1

    const-string v2, "MENSTRUAL_CYCLE_TRENDS_OVERLAY"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_10

    :cond_12
    move-object/from16 v2, v18

    goto :goto_f

    :cond_13
    const/4 v4, 0x0

    :goto_10
    instance-of v1, v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    if-eqz v1, :cond_14

    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;

    goto :goto_11

    :cond_14
    const/4 v4, 0x0

    :goto_11
    if-eqz v4, :cond_15

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsToggle;->getEnabled()Z

    move-result v1

    move v4, v1

    goto :goto_12

    :cond_15
    const/4 v4, 0x0

    :goto_12
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getDisableFertilityInsightsSurveyDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;

    move-result-object v1

    if-eqz v1, :cond_16

    invoke-direct {v0, v1}, Lup1/a;->e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;

    move-result-object v1

    move-object/from16 v17, v1

    goto :goto_13

    :cond_16
    const/16 v17, 0x0

    :goto_13
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getEnableFertilityInsightsDestination()Lcom/whoop/navigation/e;

    move-result-object v18

    if-eqz p3, :cond_17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getEnablePregnancyInsightsConfirmation()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_14

    :cond_17
    const/16 v19, 0x0

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;->getGoalsDrawer()Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;

    move-result-object v1

    if-eqz v1, :cond_18

    invoke-direct {v0, v1}, Lup1/a;->g(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Ltp1/f;

    move-result-object v1

    move-object/from16 v20, v1

    goto :goto_15

    :cond_18
    const/16 v20, 0x0

    :goto_15
    new-instance v2, Ltp1/j;

    move/from16 v16, p2

    invoke-direct/range {v2 .. v20}, Ltp1/j;-><init>(ZZLcom/whoop/design/util/TextResource;Ljava/util/List;Ltp1/c;Ltp1/c;Ltp1/d;Ltp1/d;Ltp1/d;Ljava/lang/String;Ljava/lang/String;Ltp1/a;Ltp1/q;ZLtp1/c;Lcom/whoop/navigation/e;Lcom/whoop/design/models/modal/AnyModal;Ltp1/f;)V

    new-instance v1, Ltp1/o$f;

    invoke-direct {v1, v2}, Ltp1/o$f;-><init>(Ltp1/j;)V

    return-object v1
.end method

.method public static synthetic d(Lup1/a;Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZILjava/lang/Object;)Ltp1/o;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lup1/a;->c(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsSettingsResponse;ZZ)Ltp1/o;

    move-result-object p0

    return-object p0
.end method

.method private final e(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;)Ltp1/c;
    .locals 17

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->getSaveButtonDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheet;->getOptions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getIcon()Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    const/4 v9, 0x0

    :goto_1
    if-ge v9, v8, :cond_1

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v9, v9, 0x1

    goto :goto_1

    :cond_1
    move-object v10, v6

    :goto_2
    move-object v12, v10

    goto :goto_3

    :cond_2
    move-object v12, v6

    :goto_3
    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getTitleDisplay()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_3

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :cond_3
    move-object v14, v6

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getValue()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsBottomSheetOption;->getSelected()Z

    move-result v16

    new-instance v11, Ltp1/b;

    invoke-direct/range {v11 .. v16}, Ltp1/b;-><init>(Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Z)V

    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v2, Ltp1/c;

    invoke-direct {v2, v0, v1, v3}, Ltp1/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v2
.end method

.method private final f(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;)Ltp1/d;
    .locals 4

    new-instance v0, Ltp1/d;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getPrimaryText()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsConfirmDialog;->getSecondaryText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Ltp1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private final g(Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;)Ltp1/f;
    .locals 8

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;->getDescription()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;->getOptions()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawerOptions;

    new-instance v5, Ltp1/e;

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawerOptions;->getValue()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawerOptions;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawerOptions;->isSelected()Z

    move-result v4

    invoke-direct {v5, v6, v7, v4}, Ltp1/e;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Z)V

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/settings/domain/models/HormonalInsightsGoalsDrawer;->getButtonText()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    new-instance v2, Ltp1/f;

    invoke-direct {v2, v0, v1, v3, p1}, Ltp1/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    return-object v2
.end method


# virtual methods
.method public final b(Lec3/l;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lup1/a$a;

    invoke-direct {v0, p1, p0}, Lup1/a$a;-><init>(Lec3/l;Lup1/a;)V

    return-object v0
.end method
