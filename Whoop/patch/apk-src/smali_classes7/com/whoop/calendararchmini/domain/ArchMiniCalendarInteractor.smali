.class public final Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lcom/whoop/calendararchmini/domain/a;",
        "Lan0/a;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u001b\u0008\u0001\u0018\u0000 ^2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001OB=\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J#\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u000c\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0017*\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ%\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008 \u0010!J%\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010#\u001a\u00020\"2\u0006\u0010\u0016\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008$\u0010%J#\u0010(\u001a\u00020\u0003*\u00020\u00032\u0006\u0010#\u001a\u00020\"2\u0006\u0010\'\u001a\u00020&H\u0002\u00a2\u0006\u0004\u0008(\u0010)JW\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0012*\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020\u00172\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u00030-2\u000c\u00100\u001a\u0008\u0012\u0004\u0012\u00020\u00030/H\u0002\u00a2\u0006\u0004\u00081\u00102J=\u00108\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u00104\u001a\u0002032\u0008\u00106\u001a\u0004\u0018\u0001052\u0006\u0010+\u001a\u00020\u001e2\u0006\u00107\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u00088\u00109J#\u0010<\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020&0*0\u00122\u0006\u0010;\u001a\u00020:H\u0002\u00a2\u0006\u0004\u0008<\u0010=J7\u0010A\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\'\u001a\u00020&2\u0006\u0010?\u001a\u00020>2\u0006\u00107\u001a\u00020>2\u0006\u0010@\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008A\u0010BJ#\u0010F\u001a\u0008\u0012\u0004\u0012\u00020D0C2\u000c\u0010E\u001a\u0008\u0012\u0004\u0012\u00020D0CH\u0002\u00a2\u0006\u0004\u0008F\u0010GJ\'\u0010J\u001a\u00020\"2\u0006\u0010H\u001a\u00020>2\u0006\u0010?\u001a\u00020>2\u0006\u0010I\u001a\u00020\"H\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u0019\u0010M\u001a\u0004\u0018\u00010>2\u0006\u0010L\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008M\u0010NR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008O\u0010PR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008S\u0010TR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Y\u0010ZR\u0016\u0010]\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008[\u0010\\\u00a8\u0006_"
    }
    d2 = {
        "Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;",
        "Lod1/g;",
        "Lcom/whoop/calendararchmini/domain/a;",
        "Lan0/a;",
        "Lnm0/e;",
        "cachedApiSource",
        "Lu02/c;",
        "apiClient",
        "Lad3/c;",
        "json",
        "Ljava/time/Clock;",
        "clock",
        "Ljava/util/Locale;",
        "locale",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lnm0/e;Lu02/c;Lad3/c;Ljava/time/Clock;Ljava/util/Locale;Ltr2/n;)V",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "state",
        "",
        "v",
        "(Lcom/whoop/calendararchmini/domain/a;Lan0/a;)Z",
        "Lib1/a;",
        "wrapperViewState",
        "w",
        "(Lib1/a;)Lec3/l;",
        "",
        "date",
        "y",
        "(Ljava/lang/String;Lan0/a;)Lec3/l;",
        "",
        "monthIndex",
        "x",
        "(ILan0/a;)Lec3/l;",
        "Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;",
        "content",
        "D",
        "(Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;",
        "Lpm0/a;",
        "presentedPageDate",
        "isOnScreen",
        "Lkotlin/Function1;",
        "onData",
        "Lkotlin/Function0;",
        "onNoData",
        "C",
        "(Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "request",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicy",
        "selectedDate",
        "t",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;",
        "Lcom/whoop/network/request/GetApiRequest;",
        "apiRequest",
        "u",
        "(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;",
        "Ljava/time/LocalDate;",
        "today",
        "pageIndex",
        "z",
        "(Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;",
        "",
        "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
        "daysOfMonth",
        "s",
        "(Ljava/util/List;)Ljava/util/List;",
        "selected",
        "futureMonthsShown",
        "A",
        "(Ljava/time/LocalDate;Ljava/time/LocalDate;I)I",
        "value",
        "B",
        "(Ljava/lang/String;)Ljava/time/LocalDate;",
        "a",
        "Lnm0/e;",
        "b",
        "Lu02/c;",
        "c",
        "Lad3/c;",
        "d",
        "Ljava/time/Clock;",
        "e",
        "Ljava/util/Locale;",
        "f",
        "Ltr2/n;",
        "g",
        "Lan0/a;",
        "latestState",
        "h",
        "calendar-arch-mini_release"
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
.field public static final h:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$a;

.field public static final i:I


# instance fields
.field private final a:Lnm0/e;

.field private final b:Lu02/c;

.field private final c:Lad3/c;

.field private final d:Ljava/time/Clock;

.field private final e:Ljava/util/Locale;

.field private final f:Ltr2/n;

.field private g:Lan0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->h:Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->i:I

    return-void
.end method

.method public constructor <init>(Lnm0/e;Lu02/c;Lad3/c;Ljava/time/Clock;Ljava/util/Locale;Ltr2/n;)V
    .locals 23

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    const-string v7, "cachedApiSource"

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "apiClient"

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "json"

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "clock"

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "locale"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "logger"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object v1, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->a:Lnm0/e;

    .line 3
    iput-object v2, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->b:Lu02/c;

    .line 4
    iput-object v3, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->c:Lad3/c;

    .line 5
    iput-object v4, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->d:Ljava/time/Clock;

    .line 6
    iput-object v5, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->e:Ljava/util/Locale;

    .line 7
    iput-object v6, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->f:Ltr2/n;

    .line 8
    new-instance v8, Lan0/a;

    const/16 v21, 0xfff

    const/16 v22, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v8 .. v22}, Lan0/a;-><init>(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->g:Lan0/a;

    return-void
.end method

.method public synthetic constructor <init>(Lnm0/e;Lu02/c;Lad3/c;Ljava/time/Clock;Ljava/util/Locale;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_0

    .line 9
    invoke-static {}, Ljava/time/Clock;->systemDefaultZone()Ljava/time/Clock;

    move-result-object p4

    const-string p8, "systemDefaultZone(...)"

    invoke-static {p4, p8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p7, 0x10

    if-eqz p4, :cond_1

    .line 10
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p5

    const-string p4, "getDefault(...)"

    invoke-static {p5, p4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_1
    move-object v5, p5

    and-int/lit8 p4, p7, 0x20

    if-eqz p4, :cond_2

    .line 11
    sget-object p4, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "ArchMiniCalendarInteractor"

    invoke-virtual {p4, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p6

    :cond_2
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v6, p6

    .line 12
    invoke-direct/range {v0 .. v6}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;-><init>(Lnm0/e;Lu02/c;Lad3/c;Ljava/time/Clock;Ljava/util/Locale;Ltr2/n;)V

    return-void
.end method

.method private final A(Ljava/time/LocalDate;Ljava/time/LocalDate;I)I
    .locals 2

    sget-object v0, Ljava/time/temporal/ChronoUnit;->MONTHS:Ljava/time/temporal/ChronoUnit;

    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object p1

    invoke-virtual {p2, v1}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object p2

    invoke-virtual {v0, p1, p2}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide p1

    long-to-int p1, p1

    add-int/2addr p3, p1

    return p3
.end method

.method private final B(Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 3

    const/16 v0, 0x54

    :try_start_0
    invoke-static {p1, v0}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0x20

    invoke-static {v0, v1}, Lyb3/r;->H0(Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    const/16 v1, 0xa

    invoke-static {v1, v0}, Lyb3/r;->L0(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/time/LocalDate;->parse(Ljava/lang/CharSequence;)Ljava/time/LocalDate;

    move-result-object p1
    :try_end_0
    .catch Ljava/time/format/DateTimeParseException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception v0

    iget-object v1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->f:Ltr2/n;

    const-string v2, "Unparseable date on the arch mini calendar: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, p1, v0, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method private final C(Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v2, p1

    move-object v5, p2

    move v1, p3

    move-object v3, p4

    move-object v6, p5

    invoke-direct/range {v0 .. v7}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$j;-><init>(ZLec3/l;Lkotlin/jvm/functions/Function1;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lc93/a;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final D(Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 16

    invoke-virtual/range {p1 .. p1}, Lan0/a;->d()Lh91/b;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getHeader()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object v12

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getCalendarKey()Ljava/util/List;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lan0/a;->f()Ljava/util/Map;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getCalendarKey()Ljava/util/List;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lan0/a;->i()Ljava/util/Map;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getHeader()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object v3

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v4}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v15

    invoke-virtual {v0}, Lh91/b;->e()Ljava/util/Map;

    move-result-object v1

    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual/range {p3 .. p3}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getDaysOfMonth()Ljava/util/List;

    move-result-object v3

    move-object/from16 v4, p0

    invoke-direct {v4, v3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1, v5}, Lm83/g0;->e0(Ljava/util/Map;Ll83/k;)Ljava/util/Map;

    move-result-object v5

    const/16 v10, 0x1ef

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v0 .. v11}, Lh91/b;->b(Lh91/b;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;IZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object v10

    move-object v7, v12

    move-object v12, v14

    const/16 v14, 0xdf

    move-object v11, v13

    move-object v13, v15

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v15}, Lan0/a;->b(Lan0/a;ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lan0/a;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "A month cannot be merged before the calendar has loaded"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic c(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->t(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->b:Lu02/c;

    return-object p0
.end method

.method public static final synthetic e(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ljava/time/Clock;
    .locals 0

    iget-object p0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->d:Ljava/time/Clock;

    return-object p0
.end method

.method public static final synthetic f(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Lad3/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->c:Lad3/c;

    return-object p0
.end method

.method public static final synthetic g(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Lan0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->g:Lan0/a;

    return-object p0
.end method

.method public static final synthetic h(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->f:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic i(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/calendararchmini/domain/a;Lan0/a;)Z
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->v(Lcom/whoop/calendararchmini/domain/a;Lan0/a;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic j(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->w(Lib1/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic k(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;ILan0/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->x(ILan0/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic l(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;Lan0/a;)Lec3/l;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->y(Ljava/lang/String;Lan0/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic m(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->z(Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/time/LocalDate;Ljava/time/LocalDate;I)I
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->A(Ljava/time/LocalDate;Ljava/time/LocalDate;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic o(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Ljava/lang/String;)Ljava/time/LocalDate;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->B(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic p(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->g:Lan0/a;

    return-void
.end method

.method public static final synthetic q(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;
    .locals 0

    invoke-direct/range {p0 .. p5}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->C(Lec3/l;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lc93/a;)Lec3/l;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic r(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->D(Lan0/a;ILcom/whoop/design/models/calendar/archmini/CalendarContentModel;)Lan0/a;

    move-result-object p0

    return-object p0
.end method

.method private final s(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
            ">;)",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;

    invoke-interface {v2}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;->getHidden()Z

    move-result v3

    if-nez v3, :cond_0

    invoke-interface {v2}, Lcom/whoop/design/models/calendar/archmini/CalendarDayModel;->getDate()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    new-instance p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$b;

    invoke-direct {p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$b;-><init>()V

    invoke-static {v0, p1}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private final t(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Ljava/lang/String;)Lec3/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/navigation/CachePolicyModel;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, La12/b;->e(Ljava/lang/String;)La12/a;

    move-result-object p1

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$fetch$apiRequest$1;

    invoke-direct {v0, p1, p3, p4}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$fetch$apiRequest$1;-><init>(La12/a;Ljava/lang/String;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Lcom/whoop/navigation/CachePolicyModel;->getEnabled()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-direct {p0, v0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->u(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, La6/u;

    const/4 p3, 0x1

    invoke-direct {p1, v0, p3}, La6/u;-><init>(Ljava/lang/Object;I)V

    const/4 p3, 0x0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/navigation/CachePolicyModel;->getScopes()Ljava/util/Set;

    move-result-object p2

    goto :goto_0

    :cond_1
    move-object p2, p3

    :goto_0
    if-nez p2, :cond_2

    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_2
    const/4 p4, 0x2

    invoke-static {p1, p2, p3, p4, p3}, Lsm0/a;->b(Lec3/l;Ljava/util/Set;Ljava/lang/String;ILjava/lang/Object;)Lec3/l;

    move-result-object p1

    iget-object p2, p0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->a:Lnm0/e;

    new-instance p4, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$c;

    invoke-direct {p4, p3, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$c;-><init>(Lq83/d;Lnm0/e;)V

    invoke-static {p1, p4}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    return-object p1
.end method

.method private final u(Lcom/whoop/network/request/GetApiRequest;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/network/request/GetApiRequest;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$d;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lcom/whoop/network/request/GetApiRequest;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final v(Lcom/whoop/calendararchmini/domain/a;Lan0/a;)Z
    .locals 4

    invoke-virtual {p2}, Lan0/a;->d()Lh91/b;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Lan0/a;->l()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v3

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    instance-of v3, p1, Lcom/whoop/calendararchmini/domain/a$a;

    if-nez v3, :cond_6

    instance-of v3, p1, Lcom/whoop/calendararchmini/domain/a$d;

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    instance-of v3, p1, Lcom/whoop/calendararchmini/domain/a$c;

    if-eqz v3, :cond_3

    check-cast p1, Lcom/whoop/calendararchmini/domain/a$c;

    invoke-virtual {p1}, Lcom/whoop/calendararchmini/domain/a$c;->a()I

    move-result v3

    invoke-virtual {p2}, Lan0/a;->k()I

    move-result p2

    if-ne v3, p2, :cond_2

    invoke-virtual {v0}, Lh91/b;->e()Ljava/util/Map;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/calendararchmini/domain/a$c;->a()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p2, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v1

    :cond_2
    return v2

    :cond_3
    instance-of p2, p1, Lcom/whoop/calendararchmini/domain/a$b;

    if-eqz p2, :cond_5

    check-cast p1, Lcom/whoop/calendararchmini/domain/a$b;

    invoke-virtual {p1}, Lcom/whoop/calendararchmini/domain/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->B(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v2

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_0
    return v2

    :cond_7
    :goto_1
    instance-of p1, p1, Lcom/whoop/calendararchmini/domain/a$a;

    if-nez p1, :cond_8

    return v1

    :cond_8
    return v2
.end method

.method private final w(Lib1/a;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lib1/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$h;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lib1/a;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final x(ILan0/a;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lan0/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;

    const/4 v1, 0x0

    invoke-direct {v0, p2, p1, p0, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$i;-><init>(Lan0/a;ILcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lq83/d;)V

    new-instance p1, Lec3/s1;

    invoke-direct {p1, v0}, Lec3/s1;-><init>(Lc93/m;)V

    return-object p1
.end method

.method private final y(Ljava/lang/String;Lan0/a;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lan0/a;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-virtual {p2}, Lan0/a;->d()Lh91/b;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, p1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->B(Ljava/lang/String;)Ljava/time/LocalDate;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Lh91/b;->f()I

    move-result p1

    sget-object v2, Ljava/time/temporal/ChronoUnit;->MONTHS:Ljava/time/temporal/ChronoUnit;

    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object v1

    invoke-virtual {v0}, Lh91/b;->g()Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0, v3}, Ljava/time/LocalDate;->withDayOfMonth(I)Ljava/time/LocalDate;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/time/temporal/ChronoUnit;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J

    move-result-wide v0

    long-to-int v0, v0

    add-int/2addr p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->x(ILan0/a;)Lec3/l;

    move-result-object p1

    return-object p1

    :cond_1
    const-string p2, "An unparseable arrow date reached the page loader: "

    invoke-static {p2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "An arrow tap arrived before the calendar loaded"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private final z(Lib1/a;Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;Ljava/time/LocalDate;Ljava/time/LocalDate;I)Lan0/a;
    .locals 25

    move-object/from16 v0, p0

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getHeader()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lib1/a;->f()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lib1/a;->a()Lcom/whoop/navigation/CachePolicyModel;

    move-result-object v9

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getCalendarKey()Ljava/util/List;

    move-result-object v11

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getCalendarKey()Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v12

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getHeader()Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v13

    sget-object v14, Lh91/b;->j:Lh91/b$a;

    iget-object v15, v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->e:Ljava/util/Locale;

    invoke-static/range {p5 .. p5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/models/calendar/archmini/CalendarContentModel;->getCalendar()Lcom/whoop/design/models/calendar/archmini/CalendarModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/design/models/calendar/archmini/CalendarModel;->getDaysOfMonth()Ljava/util/List;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;->s(Ljava/util/List;)Ljava/util/List;

    move-result-object v2

    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v3}, Lm83/g0;->X(Ll83/k;)Ljava/util/Map;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lib1/a;->c()I

    move-result v22

    const/16 v23, 0x60

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, p3

    move-object/from16 v16, p3

    move-object/from16 v17, p4

    invoke-static/range {v14 .. v24}, Lh91/b$a;->b(Lh91/b$a;Ljava/util/Locale;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/Map;ZLjava/util/List;IILjava/lang/Object;)Lh91/b;

    move-result-object v10

    new-instance v1, Lan0/a;

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move/from16 v4, p5

    invoke-direct/range {v1 .. v15}, Lan0/a;-><init>(ZZILjava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/design/models/calendar/archmini/CalendarHeaderModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Lh91/b;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 3
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

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$e;

    invoke-direct {v0, p1, p0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$e;-><init>(Lec3/l;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)V

    new-instance p1, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$f;

    const/4 v1, 0x0

    invoke-direct {p1, v1, p0}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$f;-><init>(Lq83/d;Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;)V

    invoke-static {v0, p1}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$g;

    invoke-direct {v0, p0, v1}, Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor$g;-><init>(Lcom/whoop/calendararchmini/domain/ArchMiniCalendarInteractor;Lq83/d;)V

    new-instance v1, Lec3/j1;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v0, v2}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    return-object v1
.end method
