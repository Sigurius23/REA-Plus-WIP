.class public final Lto1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lto1/n$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u000b2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lto1/n;",
        "",
        "<init>",
        "()V",
        "",
        "selectedPhase",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;",
        "model",
        "Lso1/g0;",
        "c",
        "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Lso1/g0;",
        "Lec3/l;",
        "Loo1/j;",
        "upstream",
        "b",
        "(Lec3/l;)Lec3/l;",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final synthetic a(Lto1/n;Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Lso1/g0;
    .locals 0

    invoke-direct {p0, p1, p2}, Lto1/n;->c(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Lso1/g0;

    move-result-object p0

    return-object p0
.end method

.method private final c(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Lso1/g0;
    .locals 40

    if-nez p1, :cond_0

    const-string v0, "MENSTRUAL"

    goto :goto_0

    :cond_0
    move-object/from16 v0, p1

    :goto_0
    sget-object v1, Lcom/whoop/design/models/items/CyclePhaseStyle;->MENSTRUAL:Lcom/whoop/design/models/items/CyclePhaseStyle;

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v2

    array-length v3, v2

    const/4 v5, 0x0

    :goto_1
    const/4 v6, 0x0

    if-ge v5, v3, :cond_2

    aget-object v7, v2, v5

    invoke-virtual {v7}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_2
    move-object v7, v6

    :goto_2
    if-nez v7, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v7

    :goto_3
    sget-object v0, Lto1/n$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v2, :cond_6

    if-eq v0, v1, :cond_5

    const/4 v2, 0x3

    if-eq v0, v2, :cond_4

    sget-object v0, Lto1/o;->MENSTRUAL:Lto1/o;

    goto :goto_4

    :cond_4
    sget-object v0, Lto1/o;->LUTEAL:Lto1/o;

    goto :goto_4

    :cond_5
    sget-object v0, Lto1/o;->OVULATORY:Lto1/o;

    goto :goto_4

    :cond_6
    sget-object v0, Lto1/o;->FOLLICULAR:Lto1/o;

    :goto_4
    invoke-virtual/range {p2 .. p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;->getPhases()Ljava/util/Map;

    move-result-object v2

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;

    if-nez v2, :cond_7

    new-instance v0, Lso1/g0$a;

    const-string v1, "Unsupported phase type"

    invoke-direct {v0, v1}, Lso1/g0$a;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    sget-object v3, Lcom/whoop/design/models/items/CyclePhaseStyle;->MENSTRUAL:Lcom/whoop/design/models/items/CyclePhaseStyle;

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v5

    array-length v7, v5

    const/4 v8, 0x0

    :goto_5
    if-ge v8, v7, :cond_9

    aget-object v9, v5, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    goto :goto_6

    :cond_8
    add-int/lit8 v8, v8, 0x1

    goto :goto_5

    :cond_9
    move-object v9, v6

    :goto_6
    if-nez v9, :cond_a

    goto :goto_7

    :cond_a
    move-object v3, v9

    :goto_7
    invoke-static {v3}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object v8

    new-instance v9, Lkd1/o$c;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getBackgroundUrl()Ljava/lang/String;

    move-result-object v10

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getLegends()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v12, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegend;

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegend;->getLabel()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegend;->getStyle()Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;->values()[Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;

    move-result-object v11

    array-length v13, v11

    const/4 v14, 0x0

    :goto_9
    if-ge v14, v13, :cond_c

    aget-object v15, v11, v14

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    goto :goto_a

    :cond_b
    add-int/lit8 v14, v14, 0x1

    goto :goto_9

    :cond_c
    move-object v15, v6

    :goto_a
    new-instance v4, Lso1/i0;

    invoke-direct {v4, v10, v15}, Lso1/i0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseLegendStyle;)V

    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_8

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getTitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getStats()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_f

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v4, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;

    new-instance v10, Lso1/j0;

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getTitleDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getIcon()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v14

    new-instance v15, Lhy0/c2;

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/design/models/items/ImpactModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lcom/whoop/design/models/items/ImpactModel;->getBackgroundEnabled()Z

    move-result v17

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lcom/whoop/design/models/items/ImpactModel;->getTrend()Lhy0/b2;

    move-result-object v18

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MenstrualPhaseStateSection;->getTrend()Lcom/whoop/design/models/items/ImpactModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/design/models/items/ImpactModel;->getIcon()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v20

    const/16 v31, 0x7fe8

    const/16 v32, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v15 .. v32}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v10, v13, v14, v15}, Lso1/j0;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lhy0/c2;)V

    invoke-virtual {v4, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_b

    :cond_e
    move-object v13, v4

    goto :goto_c

    :cond_f
    move-object v13, v6

    :goto_c
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getButtons()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v14, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_d
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;->getButtonId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;->getLabel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v4}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/GraphButton;->getIcon()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v5

    array-length v7, v5

    const/4 v10, 0x0

    :goto_e
    if-ge v10, v7, :cond_11

    aget-object v15, v5, v10

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_f

    :cond_10
    add-int/lit8 v10, v10, 0x1

    const/4 v1, 0x2

    goto :goto_e

    :cond_11
    move-object v15, v6

    :goto_f
    move-object/from16 v17, v15

    goto :goto_10

    :cond_12
    move-object/from16 v17, v6

    :goto_10
    new-instance v15, Lm81/g;

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lm81/g;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v1, 0x2

    goto :goto_d

    :cond_13
    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseInfo;->getEducation()Ljava/util/Map;

    move-result-object v1

    new-instance v15, Ljava/util/LinkedHashMap;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    invoke-direct {v15, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseEducationContent;

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseEducationContent;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseEducationContent;->getCoachButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v2

    if-eqz v2, :cond_15

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAction()Lcom/whoop/navigation/e;

    move-result-object v25

    invoke-virtual {v2}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-static {v2}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_14

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    new-instance v5, Ly71/g;

    const/4 v7, 0x2

    invoke-direct {v5, v2, v6, v7, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_12
    move-object/from16 v27, v5

    goto :goto_13

    :cond_14
    const/4 v7, 0x2

    new-instance v5, Ly71/g;

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2}, Lih0/d0;->E(Lx81/d;)I

    move-result v2

    invoke-direct {v5, v2, v6, v7, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_12

    :goto_13
    new-instance v23, Lny0/p0;

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x3ff4

    const/16 v39, 0x0

    invoke-direct/range {v23 .. v39}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v23

    goto :goto_14

    :cond_15
    const/4 v7, 0x2

    move-object v2, v6

    :goto_14
    new-instance v5, Lso1/h0;

    invoke-direct {v5, v4, v2}, Lso1/h0;-><init>(Lcom/whoop/design/util/TextResource;Lny0/p0;)V

    invoke-interface {v15, v3, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_11

    :cond_16
    new-instance v7, Lso1/g0$c;

    move-object v10, v9

    move-object v9, v0

    invoke-direct/range {v7 .. v15}, Lso1/g0$c;-><init>(Ly81/e;Lcom/whoop/design/util/TextResource;Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;)V

    return-object v7
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

    new-instance v0, Lto1/n$b;

    invoke-direct {v0, p1, p0}, Lto1/n$b;-><init>(Lec3/l;Lto1/n;)V

    return-object v0
.end method
