.class public final Lto1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J3\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u00062\u0006\u0010\n\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ!\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u000e2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lto1/b;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;",
        "model",
        "",
        "",
        "",
        "periodOverrides",
        "isSaveEnabled",
        "Lso1/p;",
        "c",
        "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Ljava/util/Map;Z)Lso1/p;",
        "Lec3/l;",
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;",
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

.method public static final synthetic a(Lto1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Ljava/util/Map;Z)Lso1/p;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lto1/b;->c(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Ljava/util/Map;Z)Lso1/p;

    move-result-object p0

    return-object p0
.end method

.method private final c(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;Ljava/util/Map;Z)Lso1/p;
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;Z)",
            "Lso1/p;"
        }
    .end annotation

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getCalendarDomainState()Lh91/b;

    move-result-object v0

    invoke-virtual {v0}, Lh91/b;->e()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/u;->j0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v0, v2}, Lto1/f;->a(Ljava/util/List;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/4 v3, 0x1

    :cond_3
    :goto_1
    new-instance v4, Lso1/p$f;

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getMonthPicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_4

    move-object v0, v1

    :cond_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getMonthPicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v2

    sget-object v8, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "toUpperCase(...)"

    invoke-static {v8, v2, v9}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getMonthPicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_5

    goto :goto_2

    :cond_5
    move-object v1, v8

    :goto_2
    new-instance v8, Lnp1/c;

    invoke-direct {v8, v0, v1, v2}, Lnp1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getButtonTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getCalendarDomainState()Lh91/b;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getSelectedIndex()I

    move-result v11

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainModel;->getNetworkModel()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;

    move-result-object v0

    if-eqz v3, :cond_6

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getEditingHiddenCycleModal()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Lto1/c;->a(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;)Lso1/l;

    move-result-object v0

    move-object/from16 v12, p2

    move/from16 v13, p3

    move-object v14, v0

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarResponse;->getEditingCycleModal()Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/HormonalInsightsConfirmDialog;

    move-result-object v0

    goto :goto_3

    :goto_4
    invoke-direct/range {v4 .. v14}, Lso1/p$f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lnp1/c;Lcom/whoop/design/util/TextResource;Lh91/b;ILjava/util/Map;ZLso1/l;)V

    return-object v4
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

    new-instance v0, Lto1/b$a;

    invoke-direct {v0, p1, p0}, Lto1/b$a;-><init>(Lec3/l;Lto1/b;)V

    return-object v0
.end method
