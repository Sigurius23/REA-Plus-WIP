.class public final Lop1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lop1/b$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\n0\r2\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\u00148\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lop1/b;",
        "",
        "Lad3/c;",
        "json",
        "<init>",
        "(Lad3/c;)V",
        "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;",
        "response",
        "Lkp1/f$a;",
        "state",
        "Lnp1/j;",
        "k",
        "(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;",
        "Lec3/l;",
        "Lkp1/a;",
        "upstream",
        "f",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lad3/c;",
        "Ljb1/a;",
        "b",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
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
.field private final a:Lad3/c;

.field private final b:Ljb1/a;


# direct methods
.method public constructor <init>(Lad3/c;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lop1/b;->a:Lad3/c;

    new-instance p1, Lop1/a;

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0}, Lop1/a;-><init>(Lop1/b;I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lop1/b;->b:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;)Lr21/c;
    .locals 0

    invoke-static {p0}, Lop1/b;->i(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;)Lr21/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lop1/b;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lop1/b;->h(Lop1/b;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lop1/b;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lop1/b;->g(Lop1/b;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lop1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;)Lwo1/b0;
    .locals 0

    invoke-static {p0, p1}, Lop1/b;->j(Lop1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;)Lwo1/b0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lop1/b;Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;
    .locals 0

    invoke-direct {p0, p1, p2}, Lop1/b;->k(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lop1/b;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lop1/a;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lop1/a;-><init>(Lop1/b;I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v0, Lj71/c;

    invoke-virtual {p0, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lop1/b$c;

    invoke-direct {v1}, Lop1/b$c;-><init>()V

    invoke-virtual {p1, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    const-class v0, Lh51/f;

    invoke-virtual {p0, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v0, Lop1/b$d;

    invoke-direct {v0}, Lop1/b$d;-><init>()V

    invoke-virtual {p1, p0, v0}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lop1/b;Llb1/z0;)Ll83/a0;
    .locals 4

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo72/e;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lo72/e;-><init>(I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Lop1/b$e;

    invoke-direct {v3, v0}, Lop1/b$e;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, v2, v3}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Lop1/a;

    const/4 v2, 0x2

    invoke-direct {v0, p0, v2}, Lop1/a;-><init>(Lop1/b;I)V

    const-class p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v1, Lop1/b$f;

    invoke-direct {v1, v0}, Lop1/b$f;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;)Lr21/c;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lr21/c;

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;->getTitleDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyDisclaimer;->getContentDisplay()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v9, 0x7c

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lr21/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lr21/a;Ly71/g;ZLkd1/o;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final j(Lop1/b;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;)Lwo1/b0;
    .locals 3

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lwo1/b0;

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    iget-object p0, p0, Lop1/b;->a:Lad3/c;

    invoke-static {p0}, Lop1/d;->i(Lad3/c;)Ljb1/a;

    move-result-object p0

    invoke-virtual {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/MciTileSectionModel;->getItems()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lwo1/b0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0
.end method

.method private final k(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Lkp1/f$a;)Lnp1/j;
    .locals 26

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-virtual/range {p2 .. p2}, Lkp1/f$a;->b()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getSegmentedControlDisplayId()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GraphType;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    :cond_0
    move-object v13, v2

    invoke-virtual/range {p2 .. p2}, Lkp1/f$a;->a()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getSelectedButtonId()Ljava/lang/String;

    move-result-object v2

    :cond_1
    move-object v11, v2

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getPregnancyId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getNavigationTitle()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    if-nez v2, :cond_3

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHeader()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getTitle()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_2
    const/4 v2, 0x0

    :goto_0
    if-nez v2, :cond_3

    move-object v2, v3

    :cond_3
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-virtual {v6}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_4

    move-object v7, v3

    :cond_4
    invoke-virtual {v6}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v6

    if-nez v6, :cond_5

    move-object v6, v3

    :cond_5
    new-instance v9, Lnp1/c;

    invoke-direct {v9, v7, v6, v8}, Lnp1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    move-object v6, v9

    goto :goto_1

    :cond_6
    const/4 v6, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHeader()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;

    move-result-object v7

    if-eqz v7, :cond_b

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getCurrentWeek()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getTrimesterDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getWeeksRemainingDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getPregnancyIcon()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v19

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getDatePicker()Lcom/whoop/design/models/items/DateSelectorModel;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v9

    if-nez v9, :cond_7

    move-object v9, v3

    :cond_7
    invoke-virtual {v8}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_8

    goto :goto_2

    :cond_8
    move-object v3, v8

    :goto_2
    new-instance v8, Lnp1/c;

    invoke-direct {v8, v9, v3, v10}, Lnp1/c;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v16, v8

    goto :goto_3

    :cond_9
    const/16 v16, 0x0

    :goto_3
    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyHeader;->getHaveYouDelivered()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-static {v3}, Lop1/d;->n(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)Ly71/o;

    move-result-object v3

    move-object/from16 v20, v3

    goto :goto_4

    :cond_a
    const/16 v20, 0x0

    :goto_4
    new-instance v3, Lnp1/f;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHaveYouDeliveredDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHaveYouDeliveredDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;->getMessage()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHaveYouDeliveredDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;->getPrimaryText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getHaveYouDeliveredDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;

    move-result-object v10

    invoke-virtual {v10}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsDialogModel;->getSecondaryText()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-direct {v3, v7, v8, v9, v10}, Lnp1/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v14, Lnp1/e;

    move-object/from16 v21, v3

    invoke-direct/range {v14 .. v21}, Lnp1/e;-><init>(Lcom/whoop/design/util/TextResource;Lnp1/c;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Ly71/o;Lnp1/f;)V

    move-object v7, v14

    goto :goto_5

    :cond_b
    const/4 v7, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getCongratulationsHeader()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;

    move-result-object v3

    if-eqz v3, :cond_d

    new-instance v8, Lnp1/b;

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;->getHeaderTitle()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;->getHeaderSubtitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyCongratulationsHeader;->getCycleReturned()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-static {v3}, Lop1/d;->n(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsHeaderButton;)Ly71/o;

    move-result-object v3

    goto :goto_6

    :cond_c
    const/4 v3, 0x0

    :goto_6
    invoke-direct {v8, v9, v10, v3}, Lnp1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly71/o;)V

    goto :goto_7

    :cond_d
    const/4 v8, 0x0

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getStyle()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/TrimesterStyle;

    move-result-object v3

    sget-object v9, Lop1/b$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v9, v3

    const/4 v9, 0x1

    if-eq v3, v9, :cond_11

    const/4 v9, 0x2

    if-eq v3, v9, :cond_10

    const/4 v9, 0x3

    if-eq v3, v9, :cond_f

    const/4 v9, 0x4

    if-ne v3, v9, :cond_e

    sget-object v3, Lop1/b$j;->w:Lop1/b$j;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    :goto_8
    move-object v9, v3

    goto :goto_9

    :cond_e
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_f
    sget-object v3, Lop1/b$i;->w:Lop1/b$i;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    goto :goto_8

    :cond_10
    sget-object v3, Lop1/b$h;->w:Lop1/b$h;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    goto :goto_8

    :cond_11
    sget-object v3, Lop1/b$g;->w:Lop1/b$g;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    goto :goto_8

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getButtons()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v3, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v10, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;

    invoke-virtual {v14}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;->getButtonId()Ljava/lang/String;

    move-result-object v16

    invoke-virtual {v14}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;->getLabel()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v14}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/Button;->getIcon()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lgz0/m0;->valueOf(Ljava/lang/String;)Lgz0/m0;

    move-result-object v17

    new-instance v15, Lm81/g;

    const/16 v20, 0x8

    const/16 v21, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v15 .. v21}, Lm81/g;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lb91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_12
    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getSegmentedControlDisplays()Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_14

    check-cast v3, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v3, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v15

    invoke-direct {v14, v15}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;

    new-instance v5, Lnp1/k;

    invoke-virtual {v15}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;->getNameDisplay()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v15}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/SegmentControlDisplay;->getId()Ljava/lang/String;

    move-result-object v15

    invoke-direct {v5, v12, v15}, Lnp1/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v14, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v12, 0xa

    goto :goto_b

    :cond_13
    move-object v12, v14

    goto :goto_c

    :cond_14
    const/4 v12, 0x0

    :goto_c
    invoke-static {v1, v13, v11}, Lop1/d;->e(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    move-result-object v3

    if-eqz v3, :cond_15

    invoke-virtual {v3}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->getGraph()Lcom/whoop/design/models/items/graph/GraphModel;

    move-result-object v3

    if-eqz v3, :cond_15

    iget-object v5, v0, Lop1/b;->b:Ljb1/a;

    invoke-virtual {v5, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    goto :goto_d

    :cond_15
    const/4 v3, 0x0

    :goto_d
    instance-of v5, v3, Lj71/c;

    if-eqz v5, :cond_16

    check-cast v3, Lj71/c;

    move-object v14, v3

    goto :goto_e

    :cond_16
    const/4 v14, 0x0

    :goto_e
    invoke-static {v1, v13, v11}, Lop1/d;->f(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/models/items/WhoopCoachVowModel;

    move-result-object v3

    if-eqz v3, :cond_17

    iget-object v5, v0, Lop1/b;->b:Ljb1/a;

    invoke-virtual {v5, v3}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v3

    goto :goto_f

    :cond_17
    const/4 v3, 0x0

    :goto_f
    instance-of v5, v3, Ls01/d;

    if-eqz v5, :cond_18

    check-cast v3, Ls01/d;

    move-object v15, v3

    goto :goto_10

    :cond_18
    const/4 v15, 0x0

    :goto_10
    iget-object v3, v0, Lop1/b;->b:Ljb1/a;

    invoke-virtual {v1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getBelowGraphContent()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    invoke-static {v1, v13, v11}, Lop1/d;->e(Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;

    move-result-object v5

    if-eqz v5, :cond_1a

    invoke-virtual {v5}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsGraphModel;->getGraphLegends()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v5, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/GraphLegendModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/GraphLegendModel;->getLegendText()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_19
    move-object/from16 v17, v0

    goto :goto_12

    :cond_1a
    const/16 v17, 0x0

    :goto_12
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getBottomSheet()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getEditDateDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getEditNameDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getEditMethodDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getEditWeightDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getDeleteDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/BottomSheet;->getAllowEdit()Z

    move-result v25

    new-instance v18, Lnp1/a;

    invoke-direct/range {v18 .. v25}, Lnp1/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Z)V

    goto :goto_13

    :cond_1b
    const/16 v18, 0x0

    :goto_13
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/PregnancyInsightsResponse;->getDeletePregnancyDialog()Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;

    move-result-object v0

    if-eqz v0, :cond_1c

    new-instance v5, Lnp1/d;

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;->getMessage()Ljava/lang/String;

    move-result-object v16

    move-object/from16 p1, v0

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;->getPrimaryText()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v19, v2

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/DeletePregnancyDialog;->getSecondaryText()Ljava/lang/String;

    move-result-object v16

    move-object/from16 v20, v3

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v5, v1, v0, v2, v3}, Lnp1/d;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    goto :goto_14

    :cond_1c
    move-object/from16 v19, v2

    move-object/from16 v20, v3

    const/4 v5, 0x0

    :goto_14
    new-instance v3, Lnp1/g;

    move-object/from16 v16, v19

    move-object/from16 v19, v5

    move-object/from16 v5, v16

    move-object/from16 v16, v20

    invoke-direct/range {v3 .. v19}, Lnp1/g;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lnp1/c;Lnp1/e;Lnp1/b;Ly81/e;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lj71/c;Ls01/d;Ljava/util/List;Ljava/util/List;Lnp1/a;Lnp1/d;)V

    new-instance v0, Lnp1/j$g;

    invoke-direct {v0, v3}, Lnp1/j$g;-><init>(Lnp1/g;)V

    return-object v0
.end method


# virtual methods
.method public final f(Lec3/l;)Lec3/l;
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

    new-instance v0, Lop1/b$b;

    invoke-direct {v0, p1, p0}, Lop1/b$b;-><init>(Lec3/l;Lop1/b;)V

    return-object v0
.end method
