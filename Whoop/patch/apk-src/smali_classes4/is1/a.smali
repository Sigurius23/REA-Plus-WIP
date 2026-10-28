.class public abstract Lis1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000c\u001a\u00020\u00078\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;",
        "entry",
        "Lcom/whoop/navigation/e;",
        "tileDestination",
        "Lh11/h;",
        "h",
        "(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lcom/whoop/navigation/e;)Lh11/h;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "d",
        "()Ljb1/a;",
        "journalHomeTileDesignItemReducer",
        "journal-home-tile-mini-arch_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lim1/p0;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lis1/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;)Ljs1/h;
    .locals 0

    invoke-static {p0}, Lis1/a;->g(Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;)Ljs1/h;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis1/a;->f(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lis1/a;->e(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d()Ljb1/a;
    .locals 1

    sget-object v0, Lis1/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final e(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lim1/p0;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lim1/p0;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Lim1/p0;-><init>(I)V

    const-class v1, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lis1/a$a;

    invoke-direct {v2, v0}, Lis1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;)Ljs1/h;
    .locals 33

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getRightIcon()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0}, Ldc/b;->D(Lx81/d;)I

    move-result v0

    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v3

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v4

    if-eqz v4, :cond_3

    new-instance v5, Lny0/h;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CardButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lgz0/n0;->b(Ljava/lang/String;)Lgz0/m0;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    if-nez v3, :cond_2

    new-instance v8, Lcom/whoop/navigation/e;

    const/4 v12, 0x7

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v8 .. v13}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v8

    goto :goto_2

    :cond_2
    move-object v13, v3

    :goto_2
    const v31, 0x1ffff7c

    const/16 v32, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

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

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v5 .. v32}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v5

    goto :goto_3

    :cond_3
    move-object v4, v3

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getDatePickerItems()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v3, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;

    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v7

    invoke-static {v6, v7}, Lis1/a;->h(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lcom/whoop/navigation/e;)Lh11/h;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/journalhometile/domain/model/JournalHomeTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v6

    new-instance v1, Ljs1/h;

    move-object v3, v0

    invoke-direct/range {v1 .. v6}, Ljs1/h;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lny0/h;Ljava/util/List;Lcom/whoop/navigation/e;)V

    return-object v1
.end method

.method private static final h(Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;Lcom/whoop/navigation/e;)Lh11/h;
    .locals 21

    new-instance v1, Lh11/a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getDateDisplay()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->getDay()Ljava/lang/String;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getDateDisplay()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->getDate()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Lh11/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getMultiDayCycleDateDisplay()Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v3, Lh11/a;

    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->getDay()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/journal/interactors/v2/datepicker/DateDisplay;->getDate()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lh11/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->isSelected()Z

    move-result v0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getJournalEntryStatus()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v4, v5}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "toUpperCase(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lds1/h;->INVALID:Lds1/h;

    invoke-static {}, Lds1/h;->values()[Lds1/h;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_1
    if-ge v8, v7, :cond_2

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_1

    goto :goto_2

    :cond_1
    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_2
    move-object v9, v2

    :goto_2
    if-nez v9, :cond_3

    goto :goto_3

    :cond_3
    move-object v5, v9

    :goto_3
    invoke-static {v5}, Lds1/i;->a(Lds1/h;)Lh11/g;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getDate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getCycleId()Ljava/lang/Long;

    move-result-object v6

    if-eqz p1, :cond_5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v2

    instance-of v7, v2, Lcom/whoop/navigation/InterdayJournalScreenModel;

    if-eqz v7, :cond_4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getCycleId()Ljava/lang/Long;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/lang/Number;->longValue()J

    move-result-wide v10

    move-object v8, v2

    check-cast v8, Lcom/whoop/navigation/InterdayJournalScreenModel;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/journal/interactors/v2/datepicker/JournalDatePickerEntry;->getDate()Ljava/lang/String;

    move-result-object v9

    const/4 v13, 0x4

    const/4 v14, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Lcom/whoop/navigation/InterdayJournalScreenModel;->copy$default(Lcom/whoop/navigation/InterdayJournalScreenModel;Ljava/lang/String;JLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/navigation/InterdayJournalScreenModel;

    move-result-object v17

    const/16 v19, 0x5

    const/16 v20, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object/from16 v15, p1

    invoke-static/range {v15 .. v20}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object v2

    if-nez v2, :cond_5

    :cond_4
    move-object/from16 v2, p1

    :cond_5
    move-object v11, v2

    move-object v2, v3

    move v3, v0

    new-instance v0, Lh11/h;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v15, 0x3ac0

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v16}, Lh11/h;-><init>(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
