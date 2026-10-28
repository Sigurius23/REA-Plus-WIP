.class public abstract Llb1/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/w0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001d\u0010\r\u001a\u00020\u000c*\u00020\t2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0018\u001a\u00020\u00138\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0019"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DateSelectorModel;",
        "dateSelectorModel",
        "Li11/f;",
        "f",
        "(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;",
        "Lcom/whoop/design/models/items/DateStripModel;",
        "Li11/g;",
        "i",
        "(Lcom/whoop/design/models/items/DateStripModel;)Li11/g;",
        "Lcom/whoop/design/models/items/DateStripItemModel;",
        "",
        "todayDate",
        "Lh11/h;",
        "h",
        "(Lcom/whoop/design/models/items/DateStripItemModel;Ljava/lang/String;)Lh11/h;",
        "Lcom/whoop/design/models/items/DateStripEntryStatus;",
        "Lh11/g;",
        "g",
        "(Lcom/whoop/design/models/items/DateStripEntryStatus;)Lh11/g;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "e",
        "()Llb1/y0;",
        "dateSelectorMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/i0;

    const/16 v1, 0x15

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/w0;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;
    .locals 0

    invoke-static {p0}, Llb1/w0;->d(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/w0;->c(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/i0;

    const/16 v1, 0x16

    invoke-direct {v0, v1}, Llb1/i0;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/DateSelectorModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/w0$b;

    invoke-direct {v2, v0}, Llb1/w0$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/w0;->f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;

    move-result-object p0

    return-object p0
.end method

.method public static final e()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/w0;->a:Llb1/y0;

    return-object v0
.end method

.method public static final f(Lcom/whoop/design/models/items/DateSelectorModel;)Li11/f;
    .locals 12

    const-string v0, "dateSelectorModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Ll0/m;->e:Ll0/h;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getCurrentDateRange()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getPreviousInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v4, 0x0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-lez v0, :cond_0

    goto :goto_0

    :cond_0
    move v0, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v0, v4

    move v4, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v5

    if-nez v5, :cond_3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    if-lez v5, :cond_2

    goto :goto_2

    :cond_2
    move v6, v0

    goto :goto_3

    :cond_3
    :goto_2
    move v6, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getPrevDateTime()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_4

    move-object v5, v1

    goto :goto_4

    :cond_4
    move-object v5, v0

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_5

    move-object v7, v1

    goto :goto_5

    :cond_5
    move-object v7, v0

    :goto_5
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getPreviousInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getNextInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v9

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getLabelInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v10

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateSelectorModel;->getDateStrip()Lcom/whoop/design/models/items/DateStripModel;

    move-result-object p0

    if-eqz p0, :cond_6

    invoke-static {p0}, Llb1/w0;->i(Lcom/whoop/design/models/items/DateStripModel;)Li11/g;

    move-result-object p0

    :goto_6
    move-object v11, p0

    goto :goto_7

    :cond_6
    const/4 p0, 0x0

    goto :goto_6

    :goto_7
    new-instance v1, Li11/f;

    invoke-direct/range {v1 .. v11}, Li11/f;-><init>(Ll0/i;Lcom/whoop/design/util/TextResource;ZLjava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;Li11/g;)V

    return-object v1
.end method

.method private static final g(Lcom/whoop/design/models/items/DateStripEntryStatus;)Lh11/g;
    .locals 1

    sget-object v0, Llb1/w0$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lh11/g;->INVALID:Lh11/g;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lh11/g;->INCOMPLETE_JOURNAL:Lh11/g;

    return-object p0

    :cond_2
    sget-object p0, Lh11/g;->COMPLETED_JOURNAL:Lh11/g;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/items/DateStripItemModel;Ljava/lang/String;)Lh11/h;
    .locals 17

    new-instance v0, Lh11/h;

    new-instance v1, Lh11/a;

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getDateDisplay()Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DateStripDateDisplayModel;->getDayOfWeek()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getDateDisplay()Lcom/whoop/design/models/items/DateStripDateDisplayModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/DateStripDateDisplayModel;->getDayOfMonth()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lh11/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->isSelected()Z

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getEntryStatus()Lcom/whoop/design/models/items/DateStripEntryStatus;

    move-result-object v2

    invoke-static {v2}, Llb1/w0;->g(Lcom/whoop/design/models/items/DateStripEntryStatus;)Lh11/g;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getDate()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getEntryStatus()Lcom/whoop/design/models/items/DateStripEntryStatus;

    move-result-object v2

    sget-object v6, Lcom/whoop/design/models/items/DateStripEntryStatus;->YES:Lcom/whoop/design/models/items/DateStripEntryStatus;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-ne v2, v6, :cond_0

    move v2, v8

    goto :goto_0

    :cond_0
    move v2, v8

    move v8, v7

    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getDate()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v9, p1

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/design/models/items/DateStripItemModel;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v6

    if-eqz v6, :cond_1

    move v13, v2

    goto :goto_1

    :cond_1
    move v13, v7

    :goto_1
    const/16 v15, 0x2662

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v0 .. v16}, Lh11/h;-><init>(Lh11/a;Lh11/a;ZLh11/g;Ljava/lang/String;Ljava/lang/Long;Lgz0/m0;ZZLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/navigation/models/GenericInteraction;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/items/DateStripModel;)Li11/g;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateStripModel;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/DateStripItemModel;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateStripModel;->getTodayDate()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Llb1/w0;->h(Lcom/whoop/design/models/items/DateStripItemModel;Ljava/lang/String;)Lh11/h;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateStripModel;->getLeftCalendarIcon()Lgz0/m0;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateStripModel;->getRightCalendarIcon()Lgz0/m0;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/DateStripModel;->getCalendarIconInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    new-instance v3, Li11/g;

    invoke-direct {v3, v1, v0, v2, p0}, Li11/g;-><init>(Ljava/util/List;Lgz0/m0;Lgz0/m0;Lcom/whoop/navigation/models/GenericInteraction;)V

    return-object v3
.end method
