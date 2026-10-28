.class public final Lcm2/t;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcm2/t$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u00013B\u0019\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ#\u0010\u0010\u001a\u00020\u0008*\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u0014*\u00020\n2\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J/\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0018\u001a\u00020\u00082\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJM\u0010+\u001a\u00020**\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00082\u0006\u0010&\u001a\u00020\u001c2\u0008\u0010\'\u001a\u0004\u0018\u00010\u00082\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008+\u0010,J\'\u0010-\u001a\u0004\u0018\u00010**\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0008\u0010\'\u001a\u0004\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008-\u0010.J\'\u0010/\u001a\u00020(2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008/\u00100J\'\u00103\u001a\u0002022\u0006\u00101\u001a\u00020\u00082\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00083\u00104J!\u00108\u001a\u0002072\u0006\u00106\u001a\u0002052\n\u0008\u0002\u0010\'\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u00088\u00109R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010:R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010;\u00a8\u0006<"
    }
    d2 = {
        "Lcm2/t;",
        "",
        "Ljava/time/Clock;",
        "clock",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Ljava/time/Clock;Landroid/content/Context;)V",
        "",
        "timestamp",
        "Ljava/time/LocalDateTime;",
        "e",
        "(Ljava/lang/String;)Ljava/time/LocalDateTime;",
        "Ljava/time/LocalDate;",
        "localDateNow",
        "today",
        "b",
        "(Ljava/time/LocalDateTime;Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;",
        "Ljava/time/ZoneId;",
        "zoneId",
        "",
        "h",
        "(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J",
        "updatedSource",
        "selectedSource",
        "",
        "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
        "sourceItems",
        "Lhv1/f;",
        "c",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhv1/f;",
        "Lcom/whoop/trends/data/model/ManualMeasurementModelV2;",
        "Lcm2/i;",
        "measurementType",
        "updatedTimeStamp",
        "",
        "vo2MaxValue",
        "unit",
        "selectedSourceViewState",
        "recordUUId",
        "",
        "isTimeSelected",
        "Lhv1/a;",
        "i",
        "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/time/LocalDateTime;ILjava/lang/String;Lhv1/f;Ljava/lang/String;Z)Lhv1/a;",
        "j",
        "(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/lang/String;)Lhv1/a;",
        "d",
        "(ILhv1/f;Z)Z",
        "description",
        "Ll3/g;",
        "a",
        "(Ljava/lang/String;ILjava/lang/String;)Ll3/g;",
        "Lvl2/i;",
        "model",
        "Lhv1/e;",
        "f",
        "(Lvl2/i;Ljava/lang/String;)Lhv1/e;",
        "Ljava/time/Clock;",
        "Landroid/content/Context;",
        "trends_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final c:Lcm2/t$a;

.field public static final d:I


# instance fields
.field private final a:Ljava/time/Clock;

.field private final b:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcm2/t$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcm2/t$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcm2/t;->c:Lcm2/t$a;

    const/16 v0, 0x8

    sput v0, Lcm2/t;->d:I

    return-void
.end method

.method public constructor <init>(Ljava/time/Clock;Landroid/content/Context;)V
    .locals 1

    const-string v0, "clock"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcm2/t;->a:Ljava/time/Clock;

    iput-object p2, p0, Lcm2/t;->b:Landroid/content/Context;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/time/Clock;Landroid/content/Context;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    .line 2
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p1

    const-string p3, "systemDefaultZone(...)"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    invoke-direct {p0, p1, p2}, Lcm2/t;-><init>(Ljava/time/Clock;Landroid/content/Context;)V

    return-void
.end method

.method private final a(Ljava/lang/String;ILjava/lang/String;)Ll3/g;
    .locals 2

    iget-object v0, p0, Lcm2/t;->b:Landroid/content/Context;

    sget v1, Lsl2/a;->x:I

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2, p3, p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ll3/g;

    invoke-direct {p2, p1}, Ll3/g;-><init>(Ljava/lang/String;)V

    return-object p2
.end method

.method private final b(Ljava/time/LocalDateTime;Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p1}, Ljava/time/LocalDateTime;->toLocalDate()Ljava/time/LocalDate;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    return-object p3

    :cond_0
    const-string p2, "MMM d, yyyy"

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p3

    invoke-static {p2, p3}, Ljava/time/format/DateTimeFormatter;->ofPattern(Ljava/lang/String;Ljava/util/Locale;)Ljava/time/format/DateTimeFormatter;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->format(Ljava/time/format/DateTimeFormatter;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "format(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhv1/f;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;",
            ">;)",
            "Lhv1/f;"
        }
    .end annotation

    if-nez p1, :cond_0

    move-object p1, p2

    :cond_0
    sget-object p2, Lhv1/h;->UNKNOWN:Lhv1/h;

    invoke-static {}, Lhv1/h;->values()[Lhv1/h;

    move-result-object v0

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    const/4 v3, 0x0

    if-ge v2, v1, :cond_2

    aget-object v4, v0, v2

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    move-object v4, v3

    :goto_1
    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    move-object p2, v4

    :goto_2
    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    move-object v3, p3

    :cond_5
    check-cast v3, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;

    if-eqz v3, :cond_6

    invoke-virtual {v3}, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;->getDisplayValue()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_7

    :cond_6
    const-string p1, ""

    :cond_7
    new-instance p3, Lhv1/f;

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {p3, p2, p1}, Lhv1/f;-><init>(Lhv1/h;Lcom/whoop/design/util/TextResource;)V

    return-object p3
.end method

.method private final d(ILhv1/f;Z)Z
    .locals 1

    const/16 v0, 0xf

    if-gt v0, p1, :cond_0

    const/16 v0, 0x65

    if-ge p1, v0, :cond_0

    invoke-virtual {p2}, Lhv1/f;->b()Lhv1/h;

    move-result-object p1

    sget-object p2, Lhv1/h;->UNKNOWN:Lhv1/h;

    if-eq p1, p2, :cond_0

    if-eqz p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final e(Ljava/lang/String;)Ljava/time/LocalDateTime;
    .locals 2

    :try_start_0
    sget-object v0, Ljava/time/format/DateTimeFormatter;->ISO_OFFSET_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    invoke-static {p1, v0}, Ljava/time/ZonedDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/ZonedDateTime;

    move-result-object v0

    iget-object v1, p0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-virtual {v1}, Ljava/time/Clock;->getZone()Ljava/time/ZoneId;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/time/ZonedDateTime;->withZoneSameInstant(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object v0

    invoke-virtual {v0}, Ljava/time/ZonedDateTime;->toLocalDateTime()Ljava/time/LocalDateTime;

    move-result-object v0

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    sget-object v0, Ljava/time/format/DateTimeFormatter;->ISO_LOCAL_DATE_TIME:Ljava/time/format/DateTimeFormatter;

    invoke-static {p1, v0}, Ljava/time/LocalDateTime;->parse(Ljava/lang/CharSequence;Ljava/time/format/DateTimeFormatter;)Ljava/time/LocalDateTime;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method public static synthetic g(Lcm2/t;Lvl2/i;Ljava/lang/String;ILjava/lang/Object;)Lhv1/e;
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcm2/t;->f(Lvl2/i;Ljava/lang/String;)Lhv1/e;

    move-result-object p0

    return-object p0
.end method

.method private final h(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J
    .locals 0

    invoke-virtual {p1, p2}, Ljava/time/LocalDateTime;->atZone(Ljava/time/ZoneId;)Ljava/time/ZonedDateTime;

    move-result-object p1

    invoke-interface {p1}, Ljava/time/chrono/ChronoZonedDateTime;->toInstant()Ljava/time/Instant;

    move-result-object p1

    invoke-virtual {p1}, Ljava/time/Instant;->toEpochMilli()J

    move-result-wide p1

    return-wide p1
.end method

.method private final i(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/time/LocalDateTime;ILjava/lang/String;Lhv1/f;Ljava/lang/String;Z)Lhv1/a;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p4

    move-object/from16 v4, p7

    move-object/from16 v5, p6

    move/from16 v6, p8

    invoke-direct {v0, v3, v5, v6}, Lcm2/t;->d(ILhv1/f;Z)Z

    move-result v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getSaveTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getConfirmDialog()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getConfirmDialog()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;->getDescription()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v9, p5

    invoke-direct {v0, v8, v3, v9}, Lcm2/t;->a(Ljava/lang/String;ILjava/lang/String;)Ll3/g;

    move-result-object v12

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getConfirmDialog()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;->getPrimaryButtonTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getConfirmDialog()Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/trends/data/model/TrendMenuSheetConfirmDialog;->getSecondaryButtonTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-eqz v4, :cond_0

    new-instance v8, Lam2/q$c;

    new-instance v9, Lhv1/d$a;

    invoke-virtual {v5}, Lhv1/f;->b()Lhv1/h;

    move-result-object v5

    invoke-direct {v9, v2, v3, v5, v4}, Lhv1/d$a;-><init>(Ljava/time/LocalDateTime;ILhv1/h;Ljava/lang/String;)V

    invoke-direct {v8, v1, v9}, Lam2/q$c;-><init>(Lcm2/i;Lhv1/d;)V

    :goto_0
    move-object/from16 v17, v8

    goto :goto_1

    :cond_0
    new-instance v8, Lam2/q$e;

    new-instance v4, Lhv1/d$a;

    invoke-virtual {v5}, Lhv1/f;->b()Lhv1/h;

    move-result-object v5

    const/4 v9, 0x0

    invoke-direct {v4, v2, v3, v5, v9}, Lhv1/d$a;-><init>(Ljava/time/LocalDateTime;ILhv1/h;Ljava/lang/String;)V

    invoke-direct {v8, v1, v4}, Lam2/q$e;-><init>(Lcm2/i;Lhv1/d;)V

    goto :goto_0

    :goto_1
    new-instance v9, Lhv1/b;

    const/16 v18, 0x60

    const/16 v19, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v9 .. v19}, Lhv1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;ZLam2/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lhv1/a;

    invoke-direct {v1, v7, v6, v9}, Lhv1/a;-><init>(Lcom/whoop/design/util/TextResource;ZLhv1/b;)V

    return-object v1
.end method

.method private final j(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/lang/String;)Lhv1/a;
    .locals 12

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getDeleteTitle()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p3, :cond_1

    new-instance v0, Lhv1/a;

    invoke-virtual {p1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getDeleteTitle()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    new-instance v1, Lhv1/b;

    sget v2, Lsl2/a;->C:I

    invoke-static {v2}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget v3, Lsl2/a;->B:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lsl2/a;->A:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    sget v4, Lsl2/a;->w:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    new-instance v9, Lam2/q$b;

    invoke-direct {v9, p2, p3}, Lam2/q$b;-><init>(Lcm2/i;Ljava/lang/String;)V

    const/4 v10, 0x4

    const/4 v11, 0x0

    const/4 v4, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v11}, Lhv1/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ll3/g;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;ZLam2/q;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p2, 0x1

    invoke-direct {v0, p1, p2, v1}, Lhv1/a;-><init>(Lcom/whoop/design/util/TextResource;ZLhv1/b;)V

    return-object v0

    :cond_1
    :goto_0
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public final f(Lvl2/i;Ljava/lang/String;)Lhv1/e;
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "model"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v1, Lvl2/i$a;

    if-eqz v2, :cond_f

    check-cast v1, Lvl2/i$a;

    move-object v2, v1

    invoke-virtual {v2}, Lvl2/i$a;->a()Lcom/whoop/trends/data/model/ManualMeasurementModelV2;

    move-result-object v1

    invoke-virtual {v2}, Lvl2/i$a;->b()Lvl2/h$a;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lvl2/h$a;->a()Lvl2/b0;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getTimestamp()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    iget-object v4, v0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-static {v4}, Ljava/time/LocalDateTime;->now(Ljava/time/Clock;)Ljava/time/LocalDateTime;

    move-result-object v4

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getTimestamp()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lcm2/t;->e(Ljava/lang/String;)Ljava/time/LocalDateTime;

    move-result-object v4

    :goto_1
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lvl2/b0;->c()Ljava/time/LocalDateTime;

    move-result-object v5

    if-nez v5, :cond_2

    goto :goto_2

    :cond_2
    move-object v8, v5

    goto :goto_3

    :cond_3
    :goto_2
    move-object v8, v4

    :goto_3
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getStartDateTimestamp()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v0, v4}, Lcm2/t;->e(Ljava/lang/String;)Ljava/time/LocalDateTime;

    move-result-object v4

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lvl2/b0;->e()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getVo2MaxValue()D

    move-result-wide v5

    double-to-int v5, v5

    :goto_4
    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lvl2/b0;->d()Ljava/lang/String;

    move-result-object v6

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    :goto_5
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getSelectedSource()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getSourceItems()Ljava/util/List;

    move-result-object v9

    invoke-direct {v0, v6, v7, v9}, Lcm2/t;->c(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lhv1/f;

    move-result-object v16

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getTitle()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    new-instance v9, Lhy0/e;

    sget v6, Lsl2/a;->i:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v9 .. v14}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v9

    new-instance v6, Lhv1/c;

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lvl2/b0;->c()Ljava/time/LocalDateTime;

    move-result-object v7

    goto :goto_6

    :cond_6
    const/4 v7, 0x0

    :goto_6
    const-string v9, "now(...)"

    if-nez v7, :cond_7

    if-nez p2, :cond_7

    iget-object v7, v0, Lcm2/t;->b:Landroid/content/Context;

    sget v10, Lsl2/a;->y:I

    invoke-virtual {v7, v10}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v7

    goto :goto_7

    :cond_7
    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v7, v0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-static {v7}, Ljava/time/LocalDate;->now(Ljava/time/Clock;)Ljava/time/LocalDate;

    move-result-object v7

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v10, v0, Lcm2/t;->b:Landroid/content/Context;

    sget v11, Lsl2/a;->z:I

    invoke-virtual {v10, v11}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v10

    const-string v11, "getString(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v8, v7, v10}, Lcm2/t;->b(Ljava/time/LocalDateTime;Ljava/time/LocalDate;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    :goto_7
    invoke-static {v7}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v10, v0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-virtual {v10}, Ljava/time/Clock;->getZone()Ljava/time/ZoneId;

    move-result-object v10

    const-string v11, "getZone(...)"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v4, v10}, Lcm2/t;->h(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J

    move-result-wide v12

    iget-object v4, v0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-static {v4}, Ljava/time/LocalDateTime;->now(Ljava/time/Clock;)Ljava/time/LocalDateTime;

    move-result-object v4

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v9, v0, Lcm2/t;->a:Ljava/time/Clock;

    invoke-virtual {v9}, Ljava/time/Clock;->getZone()Ljava/time/ZoneId;

    move-result-object v9

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v4, v9}, Lcm2/t;->h(Ljava/time/LocalDateTime;Ljava/time/ZoneId;)J

    move-result-wide v9

    move-wide/from16 v23, v12

    move-wide v11, v9

    move-wide/from16 v9, v23

    invoke-direct/range {v6 .. v12}, Lhv1/c;-><init>(Ljava/lang/String;Ljava/time/LocalDateTime;JJ)V

    new-instance v9, Lhy0/e;

    sget v4, Lsl2/a;->u:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    const/4 v13, 0x3

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v9 .. v14}, Lhy0/e;-><init>(Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v9

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getMeasurementTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getVo2MaxUnit()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget v7, Lsl2/a;->t:I

    invoke-static {v7}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getSourceItems()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v11, 0xa

    invoke-static {v7, v11}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-direct {v9, v11}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    const/16 v20, 0x0

    if-eqz v11, :cond_b

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;

    invoke-virtual {v11}, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;->getDisplayValue()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v11}, Lcom/whoop/trends/data/model/TrendMenuSheetSourceItem;->getValue()Ljava/lang/String;

    move-result-object v11

    sget-object v13, Lhv1/h;->UNKNOWN:Lhv1/h;

    invoke-static {}, Lhv1/h;->values()[Lhv1/h;

    move-result-object v3

    array-length v0, v3

    move-object/from16 v21, v1

    move/from16 v1, v20

    :goto_9
    if-ge v1, v0, :cond_9

    aget-object v17, v3, v1

    move/from16 v22, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_a

    :cond_8
    add-int/lit8 v1, v1, 0x1

    move/from16 v0, v22

    goto :goto_9

    :cond_9
    const/16 v17, 0x0

    :goto_a
    if-nez v17, :cond_a

    goto :goto_b

    :cond_a
    move-object/from16 v13, v17

    :goto_b
    new-instance v0, Lhv1/f;

    invoke-direct {v0, v13, v12}, Lhv1/f;-><init>(Lhv1/h;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v9, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p0

    move-object/from16 v1, v21

    goto :goto_8

    :cond_b
    move-object/from16 v21, v1

    new-instance v0, Lhv1/g;

    const/16 v12, 0x64

    const/16 v13, 0xf

    move v11, v5

    move-object/from16 v17, v9

    move-object v9, v0

    invoke-direct/range {v9 .. v17}, Lhv1/g;-><init>(Lcom/whoop/design/util/TextResource;IIILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhv1/f;Ljava/util/List;)V

    const/4 v0, 0x4

    new-array v0, v0, [Lm91/u;

    aput-object v19, v0, v20

    const/4 v1, 0x1

    aput-object v6, v0, v1

    const/4 v3, 0x2

    aput-object v4, v0, v3

    const/4 v3, 0x3

    aput-object v9, v0, v3

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    sget-object v3, Lcm2/i;->VO2_MAX:Lcm2/i;

    invoke-virtual/range {v21 .. v21}, Lcom/whoop/trends/data/model/ManualMeasurementModelV2;->getVo2MaxUnit()Ljava/lang/String;

    move-result-object v5

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lvl2/b0;->c()Ljava/time/LocalDateTime;

    move-result-object v0

    goto :goto_c

    :cond_c
    const/4 v0, 0x0

    :goto_c
    if-nez v0, :cond_e

    if-eqz p2, :cond_d

    goto :goto_e

    :cond_d
    move-object v2, v3

    move-object v3, v8

    move/from16 v8, v20

    :goto_d
    move-object/from16 v0, p0

    move-object/from16 v7, p2

    move v4, v11

    move-object/from16 v6, v16

    move-object/from16 v1, v21

    goto :goto_f

    :cond_e
    :goto_e
    move-object v2, v3

    move-object v3, v8

    move v8, v1

    goto :goto_d

    :goto_f
    invoke-direct/range {v0 .. v8}, Lcm2/t;->i(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/time/LocalDateTime;ILjava/lang/String;Lhv1/f;Ljava/lang/String;Z)Lhv1/a;

    move-result-object v5

    move-object v4, v7

    move-object v7, v0

    invoke-direct {v7, v1, v2, v4}, Lcm2/t;->j(Lcom/whoop/trends/data/model/ManualMeasurementModelV2;Lcm2/i;Ljava/lang/String;)Lhv1/a;

    move-result-object v6

    new-instance v0, Lhv1/e;

    move-object v3, v2

    move-object v2, v9

    move-object/from16 v1, v18

    invoke-direct/range {v0 .. v6}, Lhv1/e;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcm2/i;Ljava/lang/String;Lhv1/a;Lhv1/a;)V

    return-object v0

    :cond_f
    move-object v7, v0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
