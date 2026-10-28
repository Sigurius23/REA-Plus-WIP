.class public abstract Llb1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/q$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u001a\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\"\u001a\u0010\u001e\u001a\u00020\u00198\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;",
        "model",
        "Lzz0/m;",
        "c",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;",
        "Lzz0/a;",
        "h",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/a;",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;",
        "Lzz0/i;",
        "k",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;)Lzz0/i;",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;",
        "Lzz0/c;",
        "i",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;)Lzz0/c;",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;",
        "status",
        "Lzz0/b;",
        "g",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;)Lzz0/b;",
        "Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;",
        "Lzz0/h;",
        "j",
        "(Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;)Lzz0/h;",
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "f",
        "()Llb1/y0;",
        "behaviorsCalendarMapper",
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

    new-instance v0, Llb1/a;

    const/16 v1, 0x12

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/q;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/q;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;
    .locals 0

    invoke-static {p0}, Llb1/q;->e(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {p0}, Llb1/q;->h(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/a;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getMonths()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v5, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;

    invoke-static {v3}, Llb1/q;->k(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;)Lzz0/i;

    move-result-object v3

    invoke-interface {v5, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getLegend()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;

    invoke-static {v0}, Llb1/q;->j(Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;)Lzz0/h;

    move-result-object v0

    invoke-interface {v6, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    new-instance v1, Lzz0/m;

    const/4 v3, 0x0

    const/4 v7, 0x0

    const/16 v8, 0x22

    const/4 v9, 0x0

    invoke-direct/range {v1 .. v9}, Lzz0/m;-><init>(Lcom/whoop/design/util/TextResource;ZLzz0/a;Ljava/util/List;Ljava/util/List;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/a;

    const/16 v1, 0x13

    invoke-direct {v0, v1}, Llb1/a;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/q$b;

    invoke-direct {v2, v0}, Llb1/q$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Llb1/q;->c(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/m;

    move-result-object p0

    return-object p0
.end method

.method public static final f()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/q;->a:Llb1/y0;

    return-object v0
.end method

.method private static final g(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;)Lzz0/b;
    .locals 1

    sget-object v0, Llb1/q$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_3

    const/4 v0, 0x2

    if-eq p0, v0, :cond_2

    const/4 v0, 0x3

    if-eq p0, v0, :cond_1

    const/4 v0, 0x4

    if-ne p0, v0, :cond_0

    sget-object p0, Lzz0/b;->EMPTY:Lzz0/b;

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lzz0/b;->INVALID:Lzz0/b;

    return-object p0

    :cond_2
    sget-object p0, Lzz0/b;->NO:Lzz0/b;

    return-object p0

    :cond_3
    sget-object p0, Lzz0/b;->YES:Lzz0/b;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;)Lzz0/a;
    .locals 6

    new-instance v0, Lzz0/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->getCurrentDateRangeDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v3

    goto :goto_1

    :cond_1
    :goto_0
    move v2, v4

    :goto_1
    xor-int/2addr v2, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->getPreviousDateTime()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    move v3, v4

    :cond_3
    xor-int/2addr v3, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->getNextDateTime()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarModel;->getDatePicker()Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDatePickerModel;->getPreviousDateTime()Ljava/lang/String;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lzz0/a;-><init>(Lcom/whoop/design/util/TextResource;ZZLjava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method private static final i(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;)Lzz0/c;
    .locals 3

    new-instance v0, Lzz0/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;->getIndex()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;->getStatus()Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    move-result-object v2

    invoke-static {v2}, Llb1/q;->g(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;)Lzz0/b;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;->isToday()Z

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Lzz0/c;-><init>(ILzz0/b;Z)V

    return-object v0
.end method

.method private static final j(Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;)Lzz0/h;
    .locals 3

    new-instance v0, Lzz0/h;

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;->getStatus()Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;

    move-result-object v1

    invoke-static {v1}, Llb1/q;->g(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayStatus;)Lzz0/b;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;->getLegendText()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarLegendItemModel;->getLegendSubText()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    invoke-direct {v0, v1, v2, p0}, Lzz0/h;-><init>(Lzz0/b;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method private static final k(Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;)Lzz0/i;
    .locals 8

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->getMonth()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->getYesCount()I

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->getDayHeaders()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v3, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/calendar/BehaviorsCalendarMonthModel;->getWeeks()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/calendar/BehaviorsCalendarDaysListModel;->getDays()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v5, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_1

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;

    invoke-static {v7}, Llb1/q;->i(Lcom/whoop/design/models/calendar/BehaviorsCalendarDayModel;)Lzz0/c;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_1
    invoke-interface {v2, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    new-instance p0, Lzz0/i;

    invoke-direct {p0, v0, v1, v3, v2}, Lzz0/i;-><init>(Lcom/whoop/design/util/TextResource;ILjava/util/List;Ljava/util/List;)V

    return-object p0
.end method
