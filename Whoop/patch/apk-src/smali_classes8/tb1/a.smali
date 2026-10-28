.class public abstract Ltb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001d\u0010\u000b\u001a\u0004\u0018\u00010\u0004*\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000f\"\u0017\u0010\u0016\u001a\u00020\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/design/models/items/datepicker/DatePickerModel;",
        "Lg11/d;",
        "i",
        "(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;",
        "",
        "value",
        "Ljava/time/LocalDate;",
        "h",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;",
        "stateDateFormat",
        "f",
        "(Ljava/time/LocalDate;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;)Ljava/lang/String;",
        "Ltr2/n;",
        "a",
        "Ltr2/n;",
        "logger",
        "Llb1/y0;",
        "b",
        "Llb1/y0;",
        "g",
        "()Llb1/y0;",
        "datePickerMapper",
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
.field private static final a:Ltr2/n;

.field private static final b:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "DatePickerMapper"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sput-object v0, Ltb1/a;->a:Ltr2/n;

    new-instance v0, Lt71/i;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lt71/i;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Ltb1/a;->b:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ltb1/a;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/datepicker/DatePickerModel;Ljava/time/LocalDate;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 0

    invoke-static {p0, p1}, Ltb1/a;->j(Lcom/whoop/design/models/items/datepicker/DatePickerModel;Ljava/time/LocalDate;)Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;
    .locals 0

    invoke-static {p0}, Ltb1/a;->e(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lt71/i;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lt71/i;-><init>(I)V

    const-class v1, Lcom/whoop/design/models/items/datepicker/DatePickerModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ltb1/a$a;

    invoke-direct {v2, v0}, Ltb1/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;
    .locals 1

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Ltb1/a;->i(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Ljava/time/LocalDate;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;)Ljava/lang/String;
    .locals 2

    :try_start_0
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;->getFormat()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/text/format/DateFormat;->getBestDateTimePattern(Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/time/LocalDate;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Ltb1/a;->a:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;->getFormat()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Invalid date picker state date format: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, p0, v1}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public static final g()Llb1/y0;
    .locals 1

    sget-object v0, Ltb1/a;->b:Llb1/y0;

    return-object v0
.end method

.method private static final h(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 2

    :try_start_0
    invoke-static {p0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p0
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p0

    :catch_0
    move-exception p0

    sget-object v0, Ltb1/a;->a:Ltr2/n;

    invoke-virtual {p0}, Ljava/time/format/DateTimeParseException;->getErrorIndex()I

    move-result p0

    const-string v1, "Failed to parse date picker date at index "

    invoke-static {p0, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/models/items/datepicker/DatePickerModel;)Lg11/d;
    .locals 11

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getMinimumDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getMaximumDate()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    invoke-virtual {v0, v1}, Ljava/time/LocalDate;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-gtz v2, :cond_0

    move-object v2, v0

    goto :goto_0

    :cond_0
    move-object v2, v1

    :goto_0
    invoke-static {v0, v1}, Lq83/g;->M(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    new-instance v1, Ll83/k;

    invoke-direct {v1, v2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v1, v2

    :goto_1
    iget-object v0, v1, Ll83/k;->w:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/time/LocalDate;

    iget-object v0, v1, Ll83/k;->x:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Ljava/time/LocalDate;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getStateSelectedDate()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v0

    if-nez v0, :cond_3

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getSelectedDate()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v0

    if-nez v0, :cond_3

    invoke-static {}, Ljava/time/LocalDate;->now()Ljava/time/LocalDate;

    move-result-object v0

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getId()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4

    const-string v1, "date_picker"

    :cond_4
    move-object v3, v1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v0, v5, v6}, Le93/b;->s(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Ljava/time/LocalDate;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getValidDateRange()Lcom/whoop/design/models/items/datepicker/ValidDateRange;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lcom/whoop/design/models/items/datepicker/ValidDateRange;->getMinDate()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-static {v2}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v2

    goto :goto_2

    :cond_5
    move-object v2, v1

    :goto_2
    invoke-virtual {v0}, Lcom/whoop/design/models/items/datepicker/ValidDateRange;->getMaxDate()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_6

    invoke-static {v7}, Ltb1/a;->h(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    :cond_6
    invoke-virtual {v0}, Lcom/whoop/design/models/items/datepicker/ValidDateRange;->getValidRangeAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v7

    invoke-virtual {v0}, Lcom/whoop/design/models/items/datepicker/ValidDateRange;->getInvalidRangeAction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object v0

    new-instance v8, Lg11/e;

    invoke-direct {v8, v2, v1, v7, v0}, Lg11/e;-><init>(Ljava/time/LocalDate;Ljava/time/LocalDate;Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/navigation/models/GenericInteraction;)V

    move-object v7, v8

    goto :goto_3

    :cond_7
    move-object v7, v1

    :goto_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->isDisabled()Ljava/lang/Boolean;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v8, v0, 0x1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getStateDateFormat()Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;

    move-result-object v0

    if-eqz v0, :cond_8

    :goto_4
    move v9, v1

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    goto :goto_4

    :goto_5
    new-instance v10, Lg11/f;

    new-instance v0, Lrq0/x;

    const/16 v1, 0x12

    invoke-direct {v0, p0, v1}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v10, v0}, Lg11/f;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v2, Lg11/d;

    invoke-direct/range {v2 .. v10}, Lg11/d;-><init>(Ljava/lang/String;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Lg11/e;ZZLg11/f;)V

    return-object v2
.end method

.method private static final j(Lcom/whoop/design/models/items/datepicker/DatePickerModel;Ljava/time/LocalDate;)Lcom/whoop/whoopaction/domain/models/Action;
    .locals 4

    const-string v0, "date"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getStateUpdateValueKey()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance v2, Ln83/f;

    invoke-direct {v2}, Ln83/f;-><init>()V

    invoke-virtual {p1}, Ljava/time/LocalDate;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DatePickerModel;->getStateDateFormat()Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p1, p0}, Ltb1/a;->f(Ljava/time/LocalDate;Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;)Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/datepicker/DateStateUpdateFormat;->getKey()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1}, Lad3/m;->c(Ljava/lang/String;)Lkotlinx/serialization/json/JsonPrimitive;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Ln83/f;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-virtual {v2}, Ln83/f;->b()Ln83/f;

    move-result-object p0

    new-instance p1, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    const/4 v0, 0x0

    const/4 v2, 0x2

    invoke-direct {p1, p0, v0, v2, v1}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;-><init>(Ljava/util/Map;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p1

    :cond_1
    return-object v1
.end method
